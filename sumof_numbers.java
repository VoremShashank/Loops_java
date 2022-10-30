import java.util.*;
public class sumof_numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum =0;
            int a= 1;
            while(a<=n){
                sum=sum+a;
                a++;
            }
            System.out.println(sum);
        }
        
    }
    
}
