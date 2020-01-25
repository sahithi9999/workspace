class Box
{
 int length;
 int width;
 int height;
 
 public Box()
 {
  int length=1;
  int width=0;
  int height=1;
 }
 public Box(int length,int width,int height)
 {
  this.length=length;
  this.width=width;
  this.height=height;
 }
 void setBox(int length,int width,int height)
  {
   this.length=length;
   this.width=width;
   this.height=height;
  }
  void getBox()
  {
    System.out.println(""+length+""+width+""+height);
  }
  void calculatevol()
  {
   System.out.println(length*width*height);
  }
}
class BoxMain
{
  public static void main(String args[])
  {
   Box b=new Box(2,3,4);
   //b.setBox(1,2,3);
   b.getBox();
   b.calculatevol();
   }
}
 