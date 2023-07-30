public class prime_number {
    public static int prime(int n){
        for(int i=2; i<=(n/2); i++){
            if(n == 2){ return 1;}
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int num1 = 11;
        int count = 0;
        int j = 0;
        for(int i=2; i<=num1; i++){
            count = prime(i);
            j = j+count;
        }
        System.out.println(j);
    }
}
