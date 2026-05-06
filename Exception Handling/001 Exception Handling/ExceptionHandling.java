// Create a Java program to demonstrate multiple exception handling.

// Create a class TicketProcessor with method bookTicket() that:
// Throws NullPointerException if passenger name is null
// Converts age from String to int (may throw NumberFormatException)
// Throws IllegalArgumentException if age is not in range 0–120
// In the main method:
// Call the method inside try block
// Handle all exceptions using multiple catch blocks
// Use a finally block to display a completion message

import java.util.*;

class TicketProcessor{
  
  void bookTicekt(String passengerName, String ageStr, double price) throws NullPointerException, IllegalArgumentException, NumberFormatException{
    
    if(passengerName == null){
      throw new NullPointerException("A Passenger cannot be Null");
    }
    
    int age = Integer.parseInt(ageStr);
    
    if(age<0 || age>120){
      throw new IllegalArgumentException("Age " + age + "is not valid [0-120]");
    }
    
    System.out.println("Ticket booked sucessfully : " + passengerName);
  }
}

public class ExceptionHandling {
    public static void main(String[] args) {
      
      TicketProcessor obj =  new TicketProcessor();
      
      try{
        obj.bookTicekt("Masum","130",200);
      }
      
      catch(NumberFormatException e){
        System.out.println("Please Enter a Numeric value" + e.getMessage());
        
      }
      
      catch(NullPointerException e){
        System.out.println("Passenger Name can not be NULL. error!" + e.getMessage());
        
      }
      
      catch(IllegalArgumentException e){
        System.out.println("Please enter a valid age range [0-120]" + e.getMessage());
      }
      
      finally{
        System.out.println("Ticket Book Completed");
      }
    }
}   