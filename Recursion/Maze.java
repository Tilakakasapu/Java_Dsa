import java.util.ArrayList;

public class Maze {
    static int maze_pathcount(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        int left = maze_pathcount(row-1, col);
        int right = maze_pathcount(row, col-1);
        return left+right;
    }
    static ArrayList<String> maze_path(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> ans1 = new ArrayList<>();
            ans1.add(p);
            return ans1;
        }
        if(r==1){
            return maze_path(p+"R", r, c-1);
        }
        if(c==1){
            return maze_path(p+"D", r-1, c);
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> ans1 = maze_path(p+"D", r-1, c);
        ArrayList<String> ans2 = maze_path(p+"R", r, c-1);
        ans.addAll(ans1);
        ans.addAll(ans2);
        return ans;

    }

    static ArrayList<String> maze_path_diagonally(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> ans1 = new ArrayList<>();
            ans1.add(p);
            return ans1;
        }
        if(r==1){
            return maze_path_diagonally(p+"R", r, c-1);
        }
        if(c==1){
            return maze_path_diagonally(p+"D", r-1, c);
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> ans1 = maze_path_diagonally(p+"D", r-1, c);
        ArrayList<String> ans2 = maze_path_diagonally(p+"R", r, c-1);
        ArrayList<String> ans3 = maze_path_diagonally(p+"X", r-1, c-1);
        ans.addAll(ans1);
        ans.addAll(ans2);
        ans.addAll(ans3);
        return ans;

    }

    static ArrayList<String> maze_path_diagonally_obstacle(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> ans1 = new ArrayList<>();
            ans1.add(p);
            return ans1;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r<maze.length-1&&c<maze[0].length-1){
            ArrayList<String> ans3 = maze_path_diagonally_obstacle(p+"X", maze,r+1, c+1);
            ans.addAll(ans3);
        }
        if(r<maze.length-1){
            ArrayList<String> ans2 = maze_path_diagonally_obstacle(p+"D",maze, r+1, c);
            ans.addAll(ans2);
        }
        if(c<maze[0].length-1){
           ArrayList<String> ans1 = maze_path_diagonally_obstacle(p+"R",maze, r, c+1);
           ans.addAll(ans1);
        }
        
        return ans;

    }
    public static void main(String[] args) {
        // System.out.println(maze_pathcount(3, 3));
        // System.out.println(maze_path("", 3, 3));
        // System.out.println(maze_path_diagonally("", 3, 3));
        boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};
        System.out.println(maze_path_diagonally_obstacle("", maze, 0, 0));
    }
    
}
