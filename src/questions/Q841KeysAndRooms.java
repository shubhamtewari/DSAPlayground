package questions;

import java.util.List;
import java.util.Stack;

/**
 * <p>There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.</p>
 *
 * <p>If you can figure out that this is a graph question then this is pretty easy. All you have
 * to do is do a BFS or a DFS and mark the visited nodes to true in a separate array.
 * Then just iterate through the array and check for all true.</p>
 */
public class Q841KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] reached = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while(!stack.isEmpty()) {
            int reachedIndex = stack.pop();
            if (!reached[reachedIndex]) {
                reached[reachedIndex] = true;
                List<Integer> keys = rooms.get(reachedIndex);
                if (keys != null || !keys.isEmpty()) {
                    for (int i = 0; i < keys.size(); i++) {
                        int key = keys.get(i);
                        if (!reached[key]) {
                            stack.push(key);
                        }
                    }
                }
            }
        }
        for (boolean b : reached) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
