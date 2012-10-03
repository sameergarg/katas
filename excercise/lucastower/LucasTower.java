/**
 * 
 */
package lucastower;

/**
 * Optimal iterative solution, is to number the disks 1 through n
 * , largest to smallest. If n is odd, the first move is from the Start to the Finish peg, and if n
 * is even the first move is from the Start to the Using peg.
 * Now, add the constraint that no odd disk may be placed directly on an odd disk, and no even disk
 * may be placed directly on an even disk. With this extra constraint, and the obvious rule of never
 * undoing your last move, there is only one move at every turn. The sequence of these unique moves
 * is an optimal solution to the problem equivalent to the iterative solution described above.[5]
 * @author sameer
 *
 */
public class LucasTower {

    private Tower source = new Tower();

    private Tower destination = new Tower();

    private Tower temp = new Tower();

    public LucasTower(int diskCount) {
        for(int i=diskCount;i>0;i--){
            source.placeAtTop(new Disk(diskCount));
        }
    }

    public Tower arrange() {
        return destination;

    }

    private void move(Tower from, Tower to){
        from.placeAtTop(to.removeFromTop());
    }

}
