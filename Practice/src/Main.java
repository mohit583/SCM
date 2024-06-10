import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner st=new Scanner(System.in);
        int n=st.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=st.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
           ans=ans^a[i];
        }
        System.out.println(ans);



        //System.out.println("Hello world!");

    }
}