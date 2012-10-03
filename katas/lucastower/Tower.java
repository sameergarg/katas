package lucastower;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 30/08/2012
 * Time: 09:17
 * To change this template use File | Settings | File Templates.
 */
public class Tower {

    private Stack<Disk> disks;

    public Tower() {
        this.disks = new Stack<Disk>();
    }

    public void placeAtTop(Disk disk) {
          disks.push(disk);
    }

    public Disk removeFromTop() {
        return disks.pop();
    }

    public int diskCount(){
        return disks.size();
    }

    public boolean areDisksInOrder(){
        int tempDiskSize=0;
        for(Disk disk:disks){
            if(disk.getSize()<tempDiskSize){
                return false;
            }
            tempDiskSize=disk.getSize();
        }

        return true;
    }
}
