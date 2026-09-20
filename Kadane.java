import static java.lang.Math.max;
public class Kadane {
    public static int maxSubarraySum(int[] t) {
    int n = t.length;   
    int currentSum=t[0];
    int maxSum=t[0];
    for(int i=1;i<n;i++){
        currentSum=max(t[i],currentSum+t[i]);
        maxSum=max(maxSum,currentSum);
    }
    return maxSum;
}
public static void main(String[] args) {
    System.out.println("Test 1 :");
    int[] tableau = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = maxSubarraySum(tableau);
    System.out.println("La somme maximale d'un sous-tableau est : " + maxSum);

    System.out.println("Test 2 :");
    int[] tableau2 = {1,2,3,4};
    int maxSum2 = maxSubarraySum(tableau2);
    System.out.println("La somme maximale d'un sous-tableau est : " + maxSum2);

    System.out.println("Test 3 :");
    int[] tableau3 = {-1,-2,-3,-4};
    int maxSum3 = maxSubarraySum(tableau3);
    System.out.println("La somme maximale d'un sous-tableau est : " + maxSum3);

    System.out.println("Test 4 :");
    int[] tableau4 = {5};
    int maxSum4 = maxSubarraySum(tableau4);
    System.out.println("La somme maximale d'un sous-tableau est : " + maxSum4);

    System.out.println("Test 5 :");
    int[] tableau5 = {-2,-1,3,4,-5,-6};
    int maxSum5 = maxSubarraySum(tableau5);
    System.out.println("La somme maximale d'un sous-tableau est : " + maxSum5); 
}
}
