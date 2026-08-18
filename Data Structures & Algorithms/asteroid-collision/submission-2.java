class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {

            boolean alive = true;

            // Collision is possible only when:
            // stack top -> right (+)
            // current   -> left  (-)
            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {
                    // Stack asteroid is smaller -> it explodes
                    stack.pop();

                } else if (stack.peek() == -asteroid) {
                    // Both explode
                    stack.pop();
                    alive = false;

                } else {
                    // Current asteroid is smaller -> it explodes
                    alive = false;
                }
            }

            if (alive) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        // Stack contains elements in reverse order
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}