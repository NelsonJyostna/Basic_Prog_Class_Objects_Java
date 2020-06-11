import java.util.*;
class Area1{
  int length;
  int breadth;
  public Area1(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
}

class Area{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);     //Constructor [[ The Scanner class in Java is used for taking input from the user. The Scanner class can take input of all the data types ]]
    int l,b;

    System.out.println("Enter length");
    l = s.nextInt();
    System.out.println("Enter breadth");
    b = s.nextInt();

    Area1 a = new Area1(l,b);
    System.out.println("Area : "+a.getArea());
  }
}
