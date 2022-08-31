public class Flood_Fill_733{
    public static void main(String[] args) {
        int[][] changedArray = floodFill(new int[][]{new int[]{1,1,1},new int[]{1,1,0},new int[]{1,0,1}}, 1, 2, 2);
        //int[][] changedArray = floodFill(new int[][]{new int[]{0,0,0},new int[]{0,0,0}}, 0, 0, 0);
        for(int i=0; i<changedArray.length; i++){
            for(int j=0; j<changedArray[i].length; j++){
                System.out.print(changedArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return dfs(image, sr, sc, color, image[sr][sc]);
    }

    public static int[][] dfs(int[][] image, int sr, int sc, int color,int initColor){
        image[sr][sc] = color;

        int column = image[sr].length;
        int row = image.length;
        int left = sc-1, right = sc+1, top = sr-1, bottom = sr+1;

        //For left
        if(left>=0 && sr<row && image[sr][left] == initColor && initColor!=color){
            System.out.println("Row = "+sr+" / column = "+left);
            dfs(image, sr, left, color, initColor);
        }

        //For right
        if(right<column && sr<row && image[sr][right] == initColor && initColor!=color){
            System.out.println("Row = "+sr+" / column = "+right);
            dfs(image, sr, right, color, initColor);
        }

        //For top
        if(top>=0 && sc<column && image[top][sc] == initColor && initColor!=color){
            System.out.println("Row = "+top+" / column = "+sc);
            dfs(image, top, sc, color, initColor);
        }

        //For bottom
        if(bottom<row && sc<column && image[bottom][sc] == initColor && initColor!=color){
            System.out.println("Row = "+bottom+" / column = "+sc);
            dfs(image, bottom, sc, color, initColor);
        }
        return image;
    }
}