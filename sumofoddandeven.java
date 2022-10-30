import java.util.*;
public class sumofoddandeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum=0;
            for(int i=1; i<=n;i+=2){
                sum =sum+i;
            }
            System.out.println(sum);
            int sum2=0;
            for(int i=2;i<=n;i+=2){
                sum2=sum2+i;
            }
            System.out.println(sum2);
        }
    }
    
}
