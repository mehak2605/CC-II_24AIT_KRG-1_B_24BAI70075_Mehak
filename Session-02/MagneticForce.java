import java.util.*;
class MagneticForce {
    public boolean isPossible(int position[], int mid, int m)
    {
        int count=1;
        int prev=position[0];
        for(int i=1; i<position.length; i++)
        {
            if(position[i]-prev>=mid)
            {
                prev=position[i];
                count++;
            }
            if(count==m)
            return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        //lowest value of dist is 1, highest is last index of position minus first index
        int low=1, high=position[position.length-1]-position[0], mid=0;
        int answer=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(isPossible(position, mid, m))
            {
                answer=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return answer;
    }
}