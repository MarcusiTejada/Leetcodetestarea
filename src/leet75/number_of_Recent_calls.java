package leet75;

import java.util.PriorityQueue;
import java.util.Queue;

public class number_of_Recent_calls {
    class RecentCounter {

        Queue<Integer> stack;

        public RecentCounter() {
            this.stack = new PriorityQueue<>();
        }

        public int ping(int t) {
            this.stack.add(t);

            while (stack.peek() < t - 3000) {
                this.stack.remove();
            }

            return this.stack.size();
        }
    }

    /*
     * Your RecentCounter object will be instantiated and called as such:
     * RecentCounter obj = new RecentCounter();
     * int param_1 = obj.ping(t);
     */
}
