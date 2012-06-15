package conway;

/**
 * The Model for Conway's Game of Life. Contains a board of cells which can either be default
 * constructed to 10x10 or defined to user preferences. Handles the movement of cells to the
 * next generation and whether they live or die in that next generation.
 * @author briandorne and ron cytron
 *
 */
public class Conway {

	private Cell[][] board; // two-dimensional array representation for each individual cell

	/**
	 * Default constructs an 10 by 10 board with all cells set to dead (false)
	 */
	public Conway() {
		this(10, 10);
	}

	/**
	 * Constructs a board with given length and height, with all cells set to dead (false)
	 * @param width - horizontal size of board in #cells
	 * @param height - vertical size of board in #cells
	 */
	public Conway(int width, int height) {
		int x; // width instance variable
		int y; // height instance variable
		board = new Cell[width][height];
		for (x=0;x<width;x++) {
			for (y=0;y<height;y++) {
				board[x][y] = new Cell(false);
			}
		}
	}


	/**
	 * Finds the width of the Conway board.
	 * @return an int representation of the number of cells from left to right on the board
	 */
	public int getWidth() {
		return board.length; 
	}

	/**
	 * Finds the height of the Conway board.
	 * @return an int representation of the number of cells from top to bottom on the board
	 */
	public int getHeight() {
		return board[0].length; 
	}

	/**
	 * Returns a cell at the given (x, y) board location.
	 * @param x - the horizontal coordinate, with 0 being the leftmost column
	 * @param y - the vertical coordinate, with 0 being the topmost row
	 * @return a cell at the given board location
	 */
	public Cell getCell(int x, int y) {
		return board[x][y];
	}

	/**
	 * Checks to see if a given cell at location (x,y) is alive and returns whether it is or not living
	 * @param x - the horizontal coordinate, with 0 being the leftmost column
	 * @param y - the vertical coordinate, with 0 being the topmost row
	 * @return a boolean indicating whether the cell is alive or dead
	 */
	public boolean isAlive(int x, int y) {
		if (y<0 || x<0 || x>=this.getWidth()||y>=this.getHeight())
		{return false;}
		else {
			return this.getCell(x, y).isAlive(); 	}
	}

	/**
	 * Sets the current generation life status of a cell at the given (x, y) location on the board
	 * @param lifeStatus - a boolean representing whether a cell is alive (true) or dead (false)
	 * @param x - the horizontal coordinate, with 0 being the leftmost column
	 * @param y - the vertical coordinate, with 0 being the topmost row
	 */
	public void setLife(boolean lifeStatus, int x, int y) {
		this.getCell(x, y).setAlive(lifeStatus);
	}
	/**
	 * Sets the life status of the next generation of the cell
	 * @param lifeStatus
	 * @param x
	 * @param y
	 */
	public void setNext(boolean lifeStatus, int x, int y) {
		this.getCell(x, y).setNextGenAlive(lifeStatus);
	}

	/**
	 * Drives Conway's game based on these four rules:
	 * 
	 * 1. Any live cell with fewer than two live neighbors dies, because of under-population.
	 * 2. Any live cell with more than three live neighbors dies, because of overcrowding.
	 * 3. Any live cell with two or three live neighbors lives on to the next generation.
	 * 4. Any dead cell with exactly three live neighbors becomes a live cell.
	 * 
	 * Updates a cell's "nextGenAlive" parameter and then calls the method .evolve() on it
	 * in order to move to the next generation.
	 * 
	 * Hint: a private checkLivingNeighbors() method would help here
	 */
	public void step() {
		int x;
		int y;
		// First, determine the next life status of the cell
		for (x=0;x<this.getWidth();x++) {
			for (y=0;y<this.getHeight();y++) {
				if (this.isAlive(x, y)) {
					// If it's a living sell
					if (this.checkLivingNeighbors(x, y) ==2||this.checkLivingNeighbors(x, y)==3) {
						this.setNext(true,x,y);
					}
					else {
						this.setNext(false, x, y);

					}
				}
				else {
					if(this.checkLivingNeighbors(x,y)==3) {
						this.setNext(true, x, y);
					}
					else {
						this.setNext(false,x,y);
					}



				}
			}
		}
		// Then, advance the cell
		for (x=0;x<this.getWidth();x++) {
			for (y=0;y<this.getHeight();y++) {
				this.getCell(x, y).evolve();
			}
		}
	System.out.print(toString());

	}
	/**
	 * Returns number of living neighbors
	 * @param x
	 * @param y
	 * @return
	 */
	private int checkLivingNeighbors(int x, int y) {
		int tally = 0; 
		if (this.isAlive(x-1,y)) {tally++;}
		if (this.isAlive(x+1,y)) {tally++;}
		if (this.isAlive(x,y+1)) {tally++;}
		if (this.isAlive(x,y-1)) {tally++;}
		return tally;	
	}
	/**
	 * Checks whether given coordinate is an edge
	 * @param x
	 * @param y
	 * @return
	 */


	/**
	 * Visually display a text representation of each cell and whether it is alive or dead in the form
	 * of a two-dimensional grid containing a "Y" if the cell is living and a "N" if the cell is dead
	 * for each cell.
	 * @return a String as the text representation of the board
	 */
	public String toString() {
		String output = "";
		int x;
		int y;
		for (y=0;y<this.getHeight(); y++) {
			for (x=0;x<this.getHeight();x++) {
				if (this.isAlive(x, y)) {
					output = output + "Y" ;
				}
				else {
					output = output + "N";
				}
			}
			// Set a new line after each row 
			output = output + "\n";
		}

		return output;
	}
}
