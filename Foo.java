class foo {

}

public class A
{
   private int a;
   public A(int a)
   {
      this.a = a;
   }
}  

//////////////////////////////////////////////////
class B extends A
{
   private int b;
   public B(int b, int a)
   {
      super(a);
      this.b = b;
   }
   public void m1()
   {
      System.out.println("My super class is the class A");
     
   }
}

//////////////////////////////////////////////////////////////
class C extends B
{
   private int c;
   public C(int c, int b, int a)
   {
      super(b, a);
      this.c = c;
   }
   public void m1()
   {
      System.out.println("My super class is the class B");
      super.m1();
   }
}

/////////////////////////////////////////////////////////////////////////
class Driver
{
   public static void main(String[] args)
 {
      A c = new C(1,2,3);    
       
  
       
   }
}