public class reference_var_to_methodMain {
    public static void main(String[] args) {
        reference_var_to_method A = new reference_var_to_method();
        reference_var_to_method B = new reference_var_to_method();
        B.y =100;
        A.display(A, B);
        B.display(A, B);
    }
}
