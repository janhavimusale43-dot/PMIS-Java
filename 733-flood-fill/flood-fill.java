
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // If the starting pixel already has the target color
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int originalColor, int color) {
        // Check boundaries
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }

        // Stop if the pixel does not have the original color
        if (image[sr][sc] != originalColor) {
            return;
        }

        // Change the pixel color
        image[sr][sc] = color;

        // Visit adjacent pixels
        dfs(image, sr + 1, sc, originalColor, color); // Down
        dfs(image, sr - 1, sc, originalColor, color); // Up
        dfs(image, sr, sc + 1, originalColor, color); // Right
        dfs(image, sr, sc - 1, originalColor, color); // Left
    }
}