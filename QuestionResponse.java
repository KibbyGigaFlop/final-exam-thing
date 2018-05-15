import javax.swing.JOptionPane;//imports java panes


public class QuestionResponse{
   
   public QuestionResponse(String name, String numSelect){
   
   String numInput = numSelect;
   String userInput = name;

   }
   
   
   public static void main(String[] args){ //main method
   
   String userInput; //initializes and declares the userInput as a string
   
   userInput = JOptionPane.showInputDialog(null, "Please enter your name."); //asks user
   
   JOptionPane.showMessageDialog(null, "Welcome, " + userInput + "!\nSelect the number of a question to view the answer."); //displays the user's name
   
   questions(); //calls the questions method
   goodbye(userInput);
   
   }
   /**
   
   
    THE QUESTION METHOD 
   
   
   */
   public static void questions(){ 
   
   String numInput; //accepts  the user's inputs
   int num; //convers the user input into a string
   
    /** 
    This whole portion is for the questions in an input dialog box.
    */
      do {
   numInput = JOptionPane.showInputDialog(null, "1. What is the sole purpose of writing software/programs/code?" + 
         "\n2. What are at least 3 types of data?" + "\n3. How is data represented in a computer?" + "\n4. What is the basic unit of measurement of data in a computer?" + 
         "\n5. How do you convert gigabytes into megabytes?" + "\n6. Name 3 computer parts used to input data and 3 computer parts used to output data?" +
         "\n7. Name the part that is considered the brain of the computer?" +
         "\n8. What does one need to download and install in order to write Java programs?" +
         "\n9. What is a software tool every software developer should have but is really optional?" +
         "\n10. What is the relationship between compiling, bytecode, and a class file?" +
         "\n11. What does a file with a .class extension do?" + 
         "\n12. How many main methods can be in a Java program?" +
         "\n13. What is a local variable in Java program?" + 
         "\n14. What is a global variable in a Java program?" +
         "\n15. Name 8 primitive data types." +
         "\n16. What are at least two aspects/characteristics of every object?  Name more if you can." +
         "\n17. What is a method?" +
         "\n18. What is a constructor method?" +
         "\n19. What is the Java core library?" +
         "\n20. What is the keyword needed in a Java program in order to bring in and use a class from the Java core library?" + 
         "\n21. What are the 3 types of comments and Java and what are the symbols used to format each one?" +
         "\n22. Which type of comment should appear before every class and every method?" +
         "\n23. What does the keyword ‘new’ do in Java?" +
         "\n24. What is the difference between a parameter and an attribute?" +
         "\n25. When writing a software solution to a programming challenge, what does the term ‘decomposition’ mean?");

   num = Integer.parseInt(numInput); //parses the user's input into an integer
      
      
   answers(num);//calls the answers method

      }while (num >= 1 || num <= 25 && num != -1 );
         
      
   } 
   /**
   
   END OF QUESTION METHOD;
   BEGINNING OF ANSWERS METHOD
   
   */
   
   public static void answers(int num){
   

   switch(num){
         
      case -1:
         JOptionPane.showMessageDialog(null, "Program terminating...");
         break;
      case 1:
         JOptionPane.showMessageDialog(null, "Answer: The purpose of the writing software is to give specific instructions to a computer.");
         break;
      case 2:
         JOptionPane.showMessageDialog(null, "Answer: Images, sound, characters.");
         break;
      case 3:
         JOptionPane.showMessageDialog(null, "Answer: Bits and bytes; binary code");
         break;
      case 4:
         JOptionPane.showMessageDialog(null, "Answer: A bit.");
         break;
      case 5:
         JOptionPane.showMessageDialog(null, "Answer: Multiply the gigabtye by .001.");
         break;
      case 6:
         JOptionPane.showMessageDialog(null, "Answer: Input: Keyboard, Mouse, Camera. Output: Screen, speakers, printer");
         break;
      case 7:
         JOptionPane.showMessageDialog(null, "Answer: The CPU.");
         break;
      case 8:
         JOptionPane.showMessageDialog(null, "Answer: The JDK, JRE, and an IDE.");
         break;
      case 9:
         JOptionPane.showMessageDialog(null, "Answer: A browser.");
         break;
      case 10:
         JOptionPane.showMessageDialog(null, "Answer: Once a program successfully compiles, it converts into bytecode and produces a class file.");
         break;
      case 11:
         JOptionPane.showMessageDialog(null, "Answer: It holds all of the information in a particular class.");
         break;
      case 12:
         JOptionPane.showMessageDialog(null, "Answer: There is one main method.");
         break;
      case 13:
         JOptionPane.showMessageDialog(null, "Answer: A variable that is kept and declared in one method.");
         break;
      case 14:
         JOptionPane.showMessageDialog(null, "Answer: A variable that is set and declared outside of a method (in the class.)");
         break;
      case 15:
         JOptionPane.showMessageDialog(null, "Answer: boolean, float, double, cyte, long, short, char, int.");
         break;
      case 16:
         JOptionPane.showMessageDialog(null, "Answer: Name, behavior, attributes.");
         break;
      case 17:
         JOptionPane.showMessageDialog(null, "Answer: A method is an object consisting of multiple behaviors and attributes.");
         break;
      case 18:
         JOptionPane.showMessageDialog(null, "Answer: A method that initializes or declares variables before the main method.");
         break;
      case 19:
         JOptionPane.showMessageDialog(null, "Answer: A library that contains prewritten code for importing into IDEs for programming.");
         break;
      case 20:
         JOptionPane.showMessageDialog(null, "Answer: The keyword is 'import'.");
         break;
      case 21:
         JOptionPane.showMessageDialog(null, "Answer: Multi-line, in line, and documentation: /** */, //, and /* */");
         break;
      case 22:
         JOptionPane.showMessageDialog(null, "Answer: Documentation comment.");
         break;
      case 23:
         JOptionPane.showMessageDialog(null, "Answer: New creates a new object.");
         break;
      case 24:
         JOptionPane.showMessageDialog(null, "Answer: A parameter is a value while an attribute is a field or a variable.");
         break;
      case 25:
         JOptionPane.showMessageDialog(null, "Answer: Reducing the code down to simplest terms; avoiding lengthy/verbose code.");
         break;
      default:
         JOptionPane.showMessageDialog(null, "That's not a listed number. Try again.");
         
            
         
         
             
                  }
               
             }
             
             
         public static void goodbye(String user){
         
            
            JOptionPane.showMessageDialog(null, "Thank you for using this program, " + user +  ". Goodbye!");
            System.exit(0);
            
            
         }
      }
