/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ret_val = 0;
        int mid = 0;
        int low = 1;
        int high = n;
        while (low <= high){
            mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                ret_val = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            
        }
        return ret_val;
    }
}