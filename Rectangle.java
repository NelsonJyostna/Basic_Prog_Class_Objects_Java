class Rectangle1{
  int length;
  int breadth;
  public Rectangle1(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
  public int getPerimeter(){
    return 2*(length+breadth);
  }
}

class Rectangle{
  public static void main(String[] args){
    Rectangle1 a = new Rectangle1(4,5);
    Rectangle1 b = new Rectangle1(5,8);
    System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
    System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());
  }
}
