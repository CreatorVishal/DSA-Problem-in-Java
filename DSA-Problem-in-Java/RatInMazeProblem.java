public class RatInMazeProblem {
  public static boolean isSafe(int maze[][],int x,int y,int sol[][]){
    if(maze[x][y]==0){
      return false;

    }
    solveMazeUtil(maze,x+1,y,sol);
    solveMazeUtil(maze,x,y,sol);

    
  }
  public static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
    //base case
    if(x==maze.length-1 && y=maze.length-1 && maze[x][y]==1 ){
      return true;
    } 


    

  }
  public static boolean solveMaze(int maze[][]){
    int n= maze.length;
    int sol[][]=new int [n][n];
    if(solveMazeUtil(maze,0,0,sol)==false){
      return false;
    }
  }

 

  

  public static void main(String[] args) {
    int maze[][] = {
        { 1, 0, 1, 1 },
        { 1, 1, 1, 1 },
        { 0, 1, 1, 1 },
        { 1, 1, 1, 1 }
    };

    solveMaze(maze);
  }
}
