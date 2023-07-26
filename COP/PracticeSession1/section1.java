class section1{
  int i = 111;
//  protected void finalize(){
//    i = 112;
//  }
static void vargtest(int ...v){
  System.out.println("Number of arguments:"+v.length);
  System.out.println("Content:");
  for(int x:v){
    System.out.println(x);
  }
}
  public static void main(String[] args){
    stack s = new stack();
    //section1 s2 = new section1();
    int[] a1  = {1,2,3,4,5,6,9};
    vargtest(a1);
//    System.out.println("Initialized value of i:"+s2.i);
//    s.push(9);
//    s.push(9);
//    s.pop();
//    s.print();
//System.out.println("Value after finalize() method i:"+s2.i);

  }
}
