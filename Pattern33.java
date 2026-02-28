import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key=1;
        for(int i=1;i<=n;i++)
        {
            int[] arr = new int[i+1];
            for(int j=1;j<=i;j++)
            {
                arr[j]=key;
                key++;
            }
            if((i%2)!=0)
            {
                for(int k=1;k<=i;k++)
                {
                    System.out.print(arr[k]+" ");
                }
            }
            else
            {
                for(int l=i;l>=1;l--)
                {
                    System.out.print(arr[l]+" ");
                }
            }
            System.out.println();
        }
    }
}
