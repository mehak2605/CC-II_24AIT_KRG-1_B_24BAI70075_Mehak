import java.util.*;
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod=1_000_000_000+7;
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        int nse[]=new int[n];
        for(int i=0; i<n; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
            {
                int idx=stack.pop();
                nse[idx]=i-idx;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            int idx=stack.pop();
            nse[idx]=n-idx;
        }
        int pse[]=new int[n];
        for(int i=n-1; i>=0; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
            {
                int idx=stack.pop();
                pse[idx]=idx-i;;
            }
            stack.push(i);
        }
         while(!stack.isEmpty())
        {
            int idx=stack.pop();
            pse[idx]=idx+1;
        }

        long sum=0l;
        for(int i=0; i<n; i++)
        {
            long count=(1L*nse[i]*pse[i])%mod;
            sum=(sum+(count*arr[i])%mod)%mod;
        }
        return (int)sum;
    }
}