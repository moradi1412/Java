class Driver
{
   public static void main(String[] args)
   {
       base b = new Sub();
       Sub s = new Sub();
       doIt(b);
       doIt(s); 
    
   }
   public static void doIt( base o)
   {
      o.method1();
   }
}