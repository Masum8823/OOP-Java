// Create a Java program to demonstrate custom exception handling.

// Define a custom exception class InvalidMarkException
// Create a Student class with:
// setMarks() method (throws exception if marks not between 0–100)
// calculateGrade() method to return grade based on marks
// In the main method, use try-catch to handle invalid marks and display grade or error message

class InvalidMarkException extends Exception {
    public InvalidMarkException(String m) {
        super(m);
    }
}

class Student{
  
    private int Marks;

    public void setMarks(int Marks) throws InvalidMarkException{
      
        if (Marks < 0 || Marks > 100) {
            throw new InvalidMarkException("Marks must between 0 to 100");
        }
        this.Marks = Marks;
    }

    public String calculateGrade() {
        if (Marks >= 80) return "Obtained grade is A+";
        else if (Marks >= 70) 
          return "Obtained grade is A";
        else if (Marks >= 60) 
          return "Obtained grade is B";
        else if (Marks >= 50) 
          return "Obtained grade is C";
        else if (Marks >= 40) 
          return "Obtained grade is D";
        else 
          return "Obtained grade is F";
    }
}

public class ResultProcessor {
    public static void main(String[] args){
      
        Student s1 = new Student();
        
        try {
            s1.setMarks(-76);
            System.out.println("Grade is : " + s1.calculateGrade());
        } catch (InvalidMarkException e){
          
            System.out.println(e.getMessage());
        }
    }
}