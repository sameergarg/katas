/**
 * 
 */
package gameoflife;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sameer
 *
 */
public class GameOfLifeTest {
    GameOfLife gol;
    List<Cell> filledPositions = Arrays.asList(new Cell[]{new Cell(0,0),new Cell(0,1),new Cell(1,1)});
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		gol = new GameOfLife(4,4,filledPositions);	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void dead_cell_with_exactly_three_live_neighbours_becomes_a_live_cell(){
	    assertThat(gol.setState(1, 0).isCellAlive(1,0), is(true)) ;
	    //after this
	    assertThat(gol.setState(0, 0).isCellAlive(0,0), is(true)) ;
	}
	
	@Test
	public void live_cell_with_fewer_than_two_live_neighbours_dies(){
		//one neighbour
		GameOfLife gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(1,1),new Cell(2,2)}));
		assertThat(gol.setState(2, 2).isCellAlive(2,2), is(false)) ;
		//no neighbour
		gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(2,2)}));
		assertThat(gol.setState(2, 2).isCellAlive(2,2), is(false)) ;
	}
	
	@Test
	public void live_cell_with_two_or_three_live_neighbours_lives_on(){
		//two neighbour
		GameOfLife gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(0,0),new Cell(0,1),new Cell(1,0)}));
		assertThat(gol.setState(1, 0).isCellAlive(1,0), is(true)) ;
		//three neighbour
		gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(0,0),new Cell(0,1),new Cell(1,0),new Cell(1,1)}));
		assertThat(gol.setState(1, 0).isCellAlive(1,0), is(true)) ;
		
	}
	
	@Test
	public void live_cell_with_more_than_three_live_neighbours_dies(){
		//four neighbour
		GameOfLife gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(1,1),new Cell(1,2),new Cell(2,1),new Cell(2,2),new Cell(3,1)}));
		assertThat(gol.setState(2, 2).isCellAlive(1,0), is(false)) ;
		//five neighbour
		gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(1,1),new Cell(1,2),new Cell(2,1),new Cell(2,2),new Cell(3,1),new Cell(3,2)}));
		assertThat(gol.setState(2, 2).isCellAlive(1,0), is(false)) ;
		//six neighbour
		gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(1,1),new Cell(1,2),new Cell(1,3),new Cell(2,1),new Cell(2,2),new Cell(3,1),new Cell(3,2)}));
		assertThat(gol.setState(2, 2).isCellAlive(1,0), is(false)) ;
		
		//seven neighbour
		gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(1,1),new Cell(1,2),new Cell(1,3),new Cell(2,1),new Cell(2,2),new Cell(2,3),new Cell(3,1),new Cell(3,2)}));
		assertThat(gol.setState(2, 2).isCellAlive(1,0), is(false)) ;
		//eight neighbour
		gol = new GameOfLife(4, 4, Arrays.asList(new Cell[]{new Cell(1,1),new Cell(1,2),new Cell(1,3),new Cell(2,1),new Cell(2,2),new Cell(2,3),new Cell(3,1),new Cell(3,2),new Cell(3,3)}));
		assertThat(gol.setState(2, 2).isCellAlive(1,0), is(false)) ;
		
	}
	
	@Test
	public void checkNeighbourCount(){
	    assertThat(gol.neighbourCount(0, 0), is(2));
	    assertThat(gol.neighbourCount(0, 1), is(2));
	    assertThat(gol.neighbourCount(0, 2), is(2));
	    assertThat(gol.neighbourCount(0, 3), is(0));
	    
	    assertThat(gol.neighbourCount(1, 0), is(3));
	    assertThat(gol.neighbourCount(1, 1), is(2));
	    assertThat(gol.neighbourCount(1, 2), is(2));
	    assertThat(gol.neighbourCount(1, 3), is(0));
	    
	    assertThat(gol.neighbourCount(2, 0), is(1));
	    assertThat(gol.neighbourCount(2, 1), is(1));
	    assertThat(gol.neighbourCount(2, 2), is(1));
	    assertThat(gol.neighbourCount(2, 3), is(0));
	    
	    assertThat(gol.neighbourCount(3, 0), is(0));
	    assertThat(gol.neighbourCount(3, 1), is(0));
	    assertThat(gol.neighbourCount(3, 2), is(0));
	    assertThat(gol.neighbourCount(3, 3), is(0));
	    
	}
	
	@Test
	public void gameInitialised(){
		
	    assertThat(gol.isCellAlive(0,0), is(true)) ;	
		assertThat(gol.isCellAlive(0,1), is(true)) ;	
		assertThat(gol.isCellAlive(0,2), is(false)) ;	
		assertThat(gol.isCellAlive(0,3), is(false)) ;	
		
		assertThat(gol.isCellAlive(1,0), is(false)) ;	
		assertThat(gol.isCellAlive(1,1), is(true)) ;	
		assertThat(gol.isCellAlive(1,2), is(false)) ;	
		assertThat(gol.isCellAlive(1,3), is(false)) ;	
		
		assertThat(gol.isCellAlive(2,0), is(false)) ;	
		assertThat(gol.isCellAlive(2,1), is(false)) ;	
		assertThat(gol.isCellAlive(2,2), is(false)) ;	
		assertThat(gol.isCellAlive(2,3), is(false)) ;	
		
		assertThat(gol.isCellAlive(3,0), is(false)) ;	
		assertThat(gol.isCellAlive(3,1), is(false)) ;	
		assertThat(gol.isCellAlive(3,2), is(false)) ;	
		assertThat(gol.isCellAlive(3,3), is(false)) ;	
		
	}

}
