class Father{
  
  int age;
  String Name;
  float money;
  
  Father(int age,String Name,float money){
        
        this.age = age;
        this.Name = Name;
        this.money = money;
  }
}

class Son{
  
  int age;
  String Name;
  float money;
  
  //copy constructor
  Son (Father p){
    age = p.age - 25;
    Name = "Ashik";
    money = p.money;
  }
}




public class Copy_Constructor_Lab_E1 {
    public static void main(String[] args) {
      
      //object fo Father class
      Father f1 = new Father(50,"Ahad",10000);
      
      //object for Son Class;
      Son s1 = new Son(f1);
      
      System.out.println("Father class items\n");
      System.out.println("Age : " + f1.age + "\nName : " + f1.Name + "\nMoney : "  + f1.money);
      
      System.out.println("\nSon class items\n");
      System.out.println("Age : " + s1.age + "\nName : " + s1.Name + "\nMoney : "  + s1.money);
      
    }
} 
