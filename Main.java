import java.util.Scanner;
 class Main
 {  int A[][];
 //function to return max value
  static int max(int  a,int b)
  { return (a>b?a:b);
  }     
  //warshall function
  static void Warshallfunc()
  { for(int i=0;i<A.length;i++)
       for(int j=0;j<A.length;j++)
          for(int k=0;k<A.length;k++)
             A[j][k]=max(A[i][j]+A[j][k],A[j][k]);
  }
    public static void main(String[] args) {
         int n;
         System.out.println("enter size:");
         Scanner sc=new Scanner(System.in);
          A=new int[n][n];
       for(int i=0;i<n;i++)
          for(int j=0;j<n;j++)  
              A[i][j]=sc.nextInt();
        Warshallfunc(A);
       
       for(int i=0;i<n;i++)
          for(int j=0;j<n;j++)  
              System.out.print(A[i][j]); 
        System.out.println(" ");      
   
    }
}
