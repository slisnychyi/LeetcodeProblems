package graph;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighbords = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    islands++;
                    if(j < grid[i].length - 1 && grid[i][j + 1] == 1)  neighbords++;
                    if(i < grid.length - 1 && grid[i + 1][j] == 1)  neighbords++;
                }
            }
        }
        return islands * 4 - neighbords;
    }
}
