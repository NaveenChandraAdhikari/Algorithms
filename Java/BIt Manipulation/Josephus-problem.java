import java.util.*;
public class Main{
    public static void main(String args[]) {
    // user input
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number of people: ");
      int n = sc.nextInt();
      System.out.println("Enter value of k: ");
      int k = sc.nextInt();
      
      // return answer
      int ans = josephusProblem(n,k);
      System.out.println("The safe position for the Josephus problem is: "+ans);
    }
    
    // find the last person's position using recursion 
    static int josephusProblem(int n, int k){
        
        if (n == 1)
            return 1;
        // recursively calling the function with n-1 and adjusting the position
        else
            return (josephusProblem(n - 1, k) + k - 1) % n + 1;
    }
}