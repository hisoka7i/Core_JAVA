class stack{
  int[] stck = new int[10];
  int tos;
  public stack(){
    tos=-1;
  }
  void push(int i){
    if(tos==9){
      System.out.println("Overflow Condition");
      return;
    }
    stck[++tos] = i;
  }
  void pop(){
    if(tos==0){
      System.out.println("Underflow Condition");
      return;
    }
    System.out.println("Value deleted is:"+stck[tos--]);
  }
  void print(){
    System.out.println("Stack length:"+stck.length);
    System.out.println("Stack top element:"+stck[tos]);
  }

}
