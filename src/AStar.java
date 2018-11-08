import java.util.*;

public class AStar {
    public static final int DIAGONOL_COST = 14;
    public static final int V_H_COST = 0;

    static class Cell{
        int heuristicCost = 0; //Heuristic cost
        int finalCost = 0; //G + H
        int i, j;
        Cell parent;

        Cell(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "[" + this.i + ", " + this.j + "]";
        }
    }

    static Cell [][] grid = new Cell[5][5];

    static PriorityQueue<Cell> open;

    static boolean closed[][];
    static int startI, startJ;
    static int endI, endJ;

    public static void setBlocked(int i, int j) {
        grid[i][j] = null;
    }

    public static void setStartCell(int i, int j) {
        startI = i;
        startJ = j;
    }

    public static void setEndCell(int i, int j) {
        endI = i;
        endJ = j;
    }

    static void checkAndUpdateCost(Cell current, Cell t, int cost) {
        if(t == null || closed[t.i][t.j]) {
            return;
        }
        int t_final_cost = t.heuristicCost + cost;

        boolean inOpen = open.contains(t);
        if(!inOpen || t_final_cost < t.finalCost) {
            t.finalCost = t_final_cost;
            t.parent = current;
            if(!inOpen) {
                open.add(t);
            }
        }
    }

    public static void AStar() {
        open.add(grid[startI][startJ]);

        Cell current;

        while(true) {
            current = open.poll();
            if(current == null) {
                break;
            }
            closed[current.i][current.j] = true;

            if(current.equals(grid[endI][endJ])) {
                return;
            }

            Cell t;
            if(current.j - 1 >= 0) {
                t = grid[current.i - 1][current.j];
               checkAndUpdateCost(current, t, current.finalCost + V_H_COST);

               if(current.j - 1 >= 0) {
                   t = grid[current.i - 1][current.j - 1];
                   checkAndUpdateCost(current, t, current.finalCost + DIAGONOL_COST);
               }

               if(current.j + 1 < grid[0].length) {
                   t = grid[current.i - 1][current.j + 1];
                   checkAndUpdateCost(current, t, current.finalCost + DIAGONOL_COST);
               }
            }

            if(current.j - 1 > 0) {
                t = grid[current.i][current.j - 1];
                checkAndUpdateCost(current, t, current.finalCost + V_H_COST);
            }

            if(current.j + 1 < grid[0].length) {
                t = grid[current.i][current.j + 1];
                checkAndUpdateCost(current, t, current.finalCost + V_H_COST);
            }

            if(current.i + 1 < grid.length) {
                t = grid[current.i + 1][current.j];
                checkAndUpdateCost(current, t, current.finalCost + V_H_COST);

                if(current.j - 1 >= 0) {
                    t = grid[current.i + 1][current.j - 1];
                    checkAndUpdateCost(current, t, current.finalCost + DIAGONOL_COST);
                }

                if(current.j + 1 < grid[0].length) {
                    t = grid[current.i + 1][current.j + 1];
                    checkAndUpdateCost(current, t, current.finalCost + DIAGONOL_COST);
                }
            }
        }
    }

    /*
    Params:
    tCase = test case number
    x, y = Boards dimensions
    si, sj = start locations x and y coordinates
    ei, ei = end locations x and y coordinates
    int[][] blocked = array containing inaccessible cell coordinates
     */
    public static void test(int tCase, int x, int y, int si, int sj, int ei, int ej, int[][] blocked) {
        System.out.println("\n\nTest Case #" + tCase);
        //reset
        grid = new Cell[x][y];
        closed = new boolean [x][y];
        open = new PriorityQueue<>((Object o1, Object o2) -> {
           Cell c1 = (Cell)o1;
           Cell c2 = (Cell)o2;

           return c1.finalCost < c2.finalCost? - 1:
                   c1.finalCost > c2.finalCost? 1 : 0;
        });
        //Set Start pos
        setStartCell(si, sj); //Setting to 0,0 by default. Will be useful in a UI
        //Set End pos
        setEndCell(ei, ej);

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                grid[i][j] = new Cell(i, j);
                grid[i][j].heuristicCost = Math.abs(i - endI) + Math.abs(j - endJ);
            }
        }
        grid[si][sj].finalCost = 0;
        /*
        Set blocked cells
        setting cell values to null for a cell we cannot reach
         */
        for(int i = 0; i < blocked.length; i++) {
            setBlocked(blocked[i][0], blocked[i][1]);
        }

        //Display initial map
        System.out.println("Grid: ");

    }
}
