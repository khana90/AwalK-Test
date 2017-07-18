
from tkinter import *
from math import sqrt
f= open('rec.csv','r')
#import pdb


class Rectangle():
   
   def __init__(self, numberOfWins, numberOfLoses, averageScore):
      
      self.numberOfWins=numberOfWins
      self.numberOfloses=numberOfLoses
      self.averageScore=averageScore
      
  
   def get_numberOfWins (self):
       return self.numberOfWins

   def get_numberOfLoses(self):
       return self.numberOfLoses

   def get_averageScore(self):
       return sqrt(
              self.numberOfWins * self.numberOfLoses +
              self.numberOfLoses * self.numberOfWins)
      
      
   def __str__(self):
      return '''
numberOfWins= %d
numberOfloses= %d
averageScore= %6.2f

==============='''%(self.numberOfWins,self.numberOfLoses,self.get_averageScore())
                            
class RecCounter():
   def __init__(self):
      self.reset()
      
   def reset(self):
      self.numberOfWins= 0
      self.numberOfloses= 0
      self.averageScore= 0
      
   def add(self, rec):
      # print(rec)
      self.averageScore += rec.get_averageScore()
      self.count += 1
      if self.numberOfWins < rec.get_numberOfWins():
         self.numberOfLoses = rec.get_numberOfLoses()  
         
   def get_numberOfWins(self): return self.numberOfWins
   def get_averageScore(self): return self.averageScore
   def get_highestScore(self): return self.highestScore

class RecReader():
   def __init__(self, filename, counter, recgui):
     
      self.gui = recgui
      self.counter = counter
      self.infile = open(filename, 'r')
      if not self.infile:
         self.gui.fileNotFound()    # this leads to studying exceptions
      else:
         self.run()         
         
   def run(self):
      
      firstline = True
      for line in self.infile:
         if firstline:
            firstline = False
            continue
         fields = line.split(',')
         
         numberOfWins= int(fields[1].strip())
         numberOfloses = int(fields[2].strip())
         averageScore = int(fields[3].strip())
         self.counter.add( Rectangle(numberOfWins,numberOfLoses, averageScore))
         
      self.infile.close()
      self.gui.notify()
      
      
class RecGUI():
   def __init__(self, root):
      self.ok = False # indicate if there has been a valid read
      self.counter = RecCounter()
      
      Label(root,font="mono -36 bold", justify="center", 
      text="Store club members").grid(row=0, column=0, columnspan=4, sticky=N)          
      Label(root, text="MemberDetails", width=10).grid(row=1, column=0, sticky=E)
      self.flname = Entry(root, width=10, bg="cornsilk")
      self.flname.grid(row=1, column=1, stick=W)
      Button(root,text="Go", command=self.process_file).grid(row=1,column=2)
                    
      Label(root, text="AverageScore", width=15).grid(row=2, column=1, sticky=E)
      self.avrgSLbl=Label(root, width=7)
      self.avrgSLbl.grid(row=2,column=2, sticky=W)

      Label(root, text="numberOfLoses", width=15).grid(row=3, column=1, sticky=E)
      self.nmrLstLbl=Label(root, width=7)
      self.nmrLstLbl.grid(row=3,column=2, sticky=W)
      
      Label(root, text="numberOfWins", width=15).grid(row=4, column=1, sticky=E)
      self.nmrWinLbl=Label(root, width=7)
      self.nmrWinLbl.grid(row=4,column=2, sticky=W)
      
      self.mssg=Label(root)
      self.mssg.grid(row=5,column=0,columnspan=4)
      
      
   def process_file(self, ev=None):
      filename = self.flname.get()
      
      if len(filename) > 5:    #chance it may be ok
         self.ok = True
         self.counter.reset()
         self.reader=RecReader(filename, self.counter, self)
      
   def fileNotFound(self):
      self.ok = False
      
   def message(self, amssg):
      self.mssg['text']=amssg
      
   def notify(self):
      if self.ok:
         
         self.avrgSLbl['text'] = str(self.counter.get_averageScore())
         self.nmrLstLbl['text']= str (self.counter.get_numberOfLoses())
         self.nmrWinLbl['text'] =str (self.counter.get_numberOfWins())
 
   ##########################
   ### It all starts here ###
   ##########################
      
if __name__ == "__main__":
   top = Tk()
   top.geometry("800x500")
   top.title("Scrabble club")
   
   top.grid()
   
   app = RecGUI(top)
   
   top.mainloop()
      
