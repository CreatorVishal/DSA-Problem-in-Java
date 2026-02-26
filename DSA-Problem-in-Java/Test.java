
  // class Ss{
  //   // private Ss(){
  //   //   System.out.println("This is a private constructor ");
  //   // }
  //   // public static Ss obj = new Ss();

  //   protected Ss(int a , int b){
  //      System.out.println("This is a protected constructor ");
  //      System.out.println(a);
  //      System.out.println(b);

  //   }
  //   void display(){
  //     System.out.println("This is display funct. of ss");
  //   }
  // }
  // class j extends Ss{
    
  //   j(){
  //     super(10,20);
  //     System.out.println("This is child class cons.");

  //   }
  //    void display(){
      
  //     System.out.println("This is display funct. of j");
  //     super.display();
  //   }

  // }
  // public class Test {
  //  public static void main(String[] args) {
  //   // Ss obj1= Ss.obj;
  //   j obj = new j();
  //   obj.display();

     
    
    
  // }
  
    
  // }
 

class Test{
  Test(){
    this(3.10f);
    this(12);
    System.out.println("Normal constructor");
  }
  private Test(int a){
    
    System.out.println("private constructor"+a);

    

  }
  Test(float a){
    System.out.println("float  constructor"+a);

     

  }
  public static void main(String[] args) {
    Test obj = new Test();

  }

}  
