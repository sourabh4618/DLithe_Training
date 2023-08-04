import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] arr1 = {9,9,6,9,3};
        int[] arr2 = {9,1,9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int anslen = Math.max(n1,n2)+1;
        int[] ans = new int[anslen];
        int i=n1-1;
        int j=n2-1;
        int k =anslen-1;
        int sum =0;
        while(i>=0 && j>=0){
            sum = sum + arr1[i]+arr2[j];
            int rem = sum % 10;
            ans[k]=rem;
            k--;
            sum = sum / 10;
            i--;
            j--;
        }
        while(i<0 && j>=0){
            sum = sum + arr2[j];
            int rem = sum % 10;
            ans[k]=rem;
            k--;
            sum = sum / 10;
            j--;
        }
        while(j<0 && i>=0){
            sum = sum + arr1[i];
            int rem = sum % 10;
            ans[k]=rem;
            k--;
            sum = sum / 10;
            i--;
        }
        if(sum!=0){
            ans[k]=sum;
            k--;
        }
        while(k>=0){
            ans[k]=0;
            k--;
        }
        System.out.printf(Arrays.toString(ans));
    }
}
