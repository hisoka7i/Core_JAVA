class A{
  void show(){
    System.out.println("Call A");
  }
}
class B extends A{
  void show(){
    System.out.println("Call B");
  }
}
class C extends A{
  void show(){
    System.out.println("Call C");
  }
}

abstract class a1{
  abstract void callme();
  void callmetoo(){
    System.out.println("Call me too");
  }
}
class b1 extends a1{
  void callme(){
    System.out.println("Call me through child class");
  }
}
