class simplecatch{
  public static void main(String[] args){
    int a = args.length;
    int[] arr = new int[1];

    try{
      int d = 9/a;
      arr[43] = 34;
      /*(try {
        arr[43]=90;
      }
      catch(ArrayIndexOutOfBoundsException r){
        System.out.println("Out of array");
      }
      */
    }
    /*catch(Exception e){
    System.out.println(e);
  }*/
    catch(Exception e){
      //System.out.println("Divide by zero error");
      System.out.println(e);
    }
  //  catch(ArrayIndexOutOfBoundsException r){
  //    System.out.println("Out of array");
  //  }
  }
}
