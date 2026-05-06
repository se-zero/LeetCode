class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        Deque<Integer> dq = new ArrayDeque<>();

        while (x>0){
            dq.addFirst(x%10);
            x /= 10;
        }

        while(dq.size()>1){
            int a = dq.pollFirst();
            int b = dq.pollLast();
            
            if(a != b){
                return false;
            }
        }
        return true;
    }
}