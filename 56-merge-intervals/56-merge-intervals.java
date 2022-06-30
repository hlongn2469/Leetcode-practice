class Solution {
    public int[][] merge(int[][] intervals) {
        // sort by the start of the interval
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
        // create result list
        LinkedList<int[]> list = new LinkedList<>();
        
        for(int i[] : intervals){
            // if list is empty of last interval's end is smaller than current interval's start, just add interval into list
            if(list.isEmpty() || list.getLast()[1] < i[0]){
                list.add(i);
            
            // otherwise, merge them together
            } else {
                list.getLast()[1] = Math.max(list.getLast()[1], i[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}