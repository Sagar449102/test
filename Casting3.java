class Cast3
{

  public void m1(int x)
  {
    System.out.println("int arg exe");
  }
  public void m1(double y)
  {
 System.out.println("double arg exe");
 }
  public static void main(String args[])
 {
   Cast3 c=new Cast3();
  c.m1('d');
  c.m1(3.14);
}
}