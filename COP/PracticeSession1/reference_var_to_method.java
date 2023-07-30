public class reference_var_to_method {
    int x = 10;
    int y = 20;
    void display(reference_var_to_method C, reference_var_to_method D){
        C.x = 95;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        return;
    }
}
