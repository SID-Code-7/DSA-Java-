package backtracking;

class mazesolve{
    public static void print(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0; j<sol.length;j++){
                System.out.print(sol[i][j]+" ");
           }
           System.out.println();
        }
    }
    public static boolean isSafe(int x ,int y,int maze[][]){
        // inside the maze condition check
        return (x>=0 && y>=0 && x<maze.length && y<maze.length && maze[x][y] == 1);
    }
    public static boolean solvemaze(int maze[][]){
        int n=maze.length;
        int sol[][] = new int[n][n];

        if(brain(maze,0,0,sol) == false){
            System.out.println("no solutions exist");
            return false;
        }
        //else
        print(sol);
        return true;
    }
    public static boolean brain(int maze[][],int x,int y , int sol[][]){
        //are we on last block (base case)
        if(x == maze.length-1 && y==maze.length-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        // if the cells valid
        if(isSafe(x, y, maze)== true){

            //recursive circle
            if(sol[x][y] == 1){
                return false;
            }
             //mark the visited cell
            sol[x][y] = 1;

            //down
            if(brain(maze, x, y+1, sol)){ //down
                return true ;
            }
            //right
            if(brain(maze, x+1, y, sol)){ //right
                return true;
            }

            //eraser (backtrack)
            sol[x][y] = 0;
            return false;
        }

        return false;
    }
    public static void main(String[] args) {
        int maze[][] = { {1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1} };
        solvemaze(maze);
    }
}