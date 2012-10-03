/**
 * 
 */
package gameoflife;

import java.util.Arrays;
import java.util.List;

/**
 * @see {@link http://en.wikipedia.org/wiki/Conway's_Game_of_Life}
 * <p>
 * Rules
 * The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells,
 * each of which is in one of two possible states, alive or dead. Every cell interacts with its eight neighbours,
 * which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the
 * following transitions occur:
 * <ul>
 * <li>Any live cell with fewer than two live neighbours dies, as if caused by under-population.</li>
 * <li>Any live cell with two or three live neighbours lives on to the next generation.</li>
 * <li>Any live cell with more than three live neighbours dies, as if by overcrowding.</li>
 * <li>Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.</li>
 * </ul>
 * The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules 
 * simultaneously to every cell in the seed—births and deaths occur simultaneously, and the discrete moment at which 
 * this happens is sometimes called a tick (in other words, each generation is a pure function of the preceding one).
 * The rules continue to be applied repeatedly to create further generations.
 * @author sameer
 *
 */
public class GameOfLife {
	
	private boolean[][]grid;

	public GameOfLife(int rows, int columns, List<Cell> filledPositions) {
		grid = new boolean[rows][columns];
		for(Cell cell:filledPositions){
			grid[cell.getX()][cell.getY()]=true;
		}
		
	}

	public boolean isCellAlive(int row, int column) {
		return grid[row][column];
	}
	
	public int neighbourCount(int row, int column){
		int count = 0;
		//check left
		if(column>0){
		    if(isCellAlive(row,column-1)){
		    	count++;	
		    }
		}
		
		//check right
		if(column<grid[0].length-1){
			if(isCellAlive(row, column+1)){
				count++;
			}
		}
		
		//check up
		if(row>0){
			if(isCellAlive(row-1, column)){
				count++;
			}
		}
		
		//check down
		if(row<grid.length-1){
			if(isCellAlive(row+1, column)){
				count++;
			}
		}
		
		//check corner left up
		if(column>0 && row>0){
			if(isCellAlive(row-1, column-1)){
				count++;
			}
		}
		
		//check corner right up
		if(column<grid[0].length-1 && row>0){
			if(isCellAlive(row-1, column+1)){
				count++;
			}
		}
		
		//check corner left down
		if(column>0 && row<grid.length-1){
			if(isCellAlive(row+1, column-1)){
				count++;
			}
		}
		//check corner right down
		if(column<grid[0].length-1 && row<grid.length-1){
			if(isCellAlive(row+1, column+1)){
				count++;
			}
		}
		
		return count;
	}
	
	public GameOfLife setState(int row,int column){
		switch(neighbourCount(row, column)){
			case 0:
				grid[row][column]=false;
				break;
			case 1:
				grid[row][column]=false;
				break;
			case 2:
				break;
			case 3:
				grid[row][column]=true;
				break;
			default:
				grid[row][column]=false;
			
		}
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grid);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameOfLife other = (GameOfLife) obj;
		if (!Arrays.equals(grid, other.grid))
			return false;
		return true;
	}
	
	

}
