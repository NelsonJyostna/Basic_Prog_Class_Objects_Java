class Triangle1{
  int a,b,c;
   public double getArea(){
   double s = (a+b+c/2.0);                             //Heron's Formula ( Square root of s(s-a)(s-b)(s-c) )
   //return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);          //Math.pow() is used to calculate a number raise to the power of some other number.
   // return Math.sqrt((s*(s-a)*(s-b)*(s-c)),1/2);
   //return Math.sqrt((s*(s-a)*(s-b)*(s-c)),.5);
   return Math.pow((s*(s-a)*(s-b)*(s-c)),.1/2);
  }
  public double getPerimeter(){
     return (a+b+c)/2.0;
 }
}


class Triangle{
     public static void main(String[ ] args) {
      Triangle1 t = new Triangle1();
      t.a = 3;
      t.b = 4;
      t.c = 5;
      System.out.println(t.getArea());
      System.out.println(t.getPerimeter());
     }
}
