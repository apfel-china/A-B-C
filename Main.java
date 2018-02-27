import java.util.Scanner;
  
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1, k = 0;
        long[] a = new long[30];
        for(int i = 0; i<n;i++){
            int j = 3;
            while (j>0) {
                j--;
                a[k++]=sc.nextLong();
            }
        }
        for(int p = 0;n!=0;p+=3,l++,n--){
            boolean b=a[p]+a[p+1]>a[p+2];
            System.out.println("Case #"+l+": "+b);
        }
    }
}
