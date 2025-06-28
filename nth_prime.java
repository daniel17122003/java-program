import java.util.Scanner;
public class nth_prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int num=0;
        while(count<n){
            num++;
            if(prime(num)==true){
                count++;
            }

        }
        System.out.print(num);
        sc.close();
    }
    public static boolean prime(int n){
        boolean t=true;
        if (n==1)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                t=false;
            }
        }
        return t? true:false;
    }
}