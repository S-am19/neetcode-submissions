class Solution {
    public String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            // Empty part -> caused by //, /// etc.
            if (part.equals("")) {
                continue;
            }

            // Current directory -> ignore
            else if (part.equals(".")) {
                continue;
            }

            // Parent directory -> go back
            else if (part.equals("..")) {

                // Only pop if there is actually a directory
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Normal directory/file name
            else {
                stack.push(part);
            }
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append("/").append(stack.removeLast());
        }

        // If nothing was left, we're at root
        if (ans.length() == 0) {
            return "/";
        }

        return ans.toString();
    }
}