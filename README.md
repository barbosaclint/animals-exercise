# animals-exercise
Items with questions
A1  
   
   a. How did you unit test it? -> created the project with spring initialzr, added spring web component, 
        this includes junit tests. Project is also prepared to use restful api later
          
   b. How did you optimize the code for maintainability? -> used super class Animal and used interface   
      classes for different behaviors, type and sounds as I progress.

A3  

  b. How is the rooster related to the chicken? -> extended chicken class
  c. Can you think of other ways to model a rooster without using inheritance? -> by having its own   
       methods not inheriting from the interfaces i made.
 
 A4 
     d. How do you keep the parrot maintainable? What if we need another parrot
        lives near a Duck? Or near a phone that rings frequently? -> Extended Bird class and 
        added method if Parrot is with something (dog, cat, rooster, duck, phone)
   