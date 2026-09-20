
public class MaxRectangle {
     static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;
    }
     public static int maxRectangle(int[][] m) {
        return trouverMaxRectangle(m).area;
    }

     public static Rectangle trouverMaxRectangle(int[][]m) {
          int R = m.length;
          int C = m[0].length;
          int[][] h = new int[R][C];
          for (int i = 0; i < R; i++) {
               for (int j = 0; j < C; j++) {
                    if (m[i][j] == 0) {
                         h[i][j] = 0;
                    } else if (i == 0) {
                         h[i][j] = 1;
                    } else {
                         h[i][j] = h[i - 1][j] + 1;
                    }
               }
          }
        
          return null;
    }
    
 }    
