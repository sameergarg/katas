package setops;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 09/01/2013
 * Time: 11:32
 * To change this template use File | Settings | File Templates.
 */
public class SetOperations {

    public Collection<Integer> findDuplicate(Collection<Integer> containingDuplicates){
        List<Integer> duplicates = new ArrayList<Integer>();
        Set<Integer> uniques = new HashSet<Integer>();
        for(Integer element:containingDuplicates){
            if(!uniques.add(element)){
                duplicates.add(element);
            }
        }
        return duplicates;
    }

    public Collection<? extends Integer> findUnique(Collection<Integer> containingDuplicates) {
        Set<Integer> uniques = new HashSet<Integer>(containingDuplicates);
        uniques.removeAll(findDuplicate(containingDuplicates));
        return uniques;

    }

    public Collection<? extends Integer> findSymmetricDifference(List<Integer> collection1, List<Integer> collection2) {
        Set<Integer> symmetricDifference = new HashSet<Integer>(collection1);
        symmetricDifference.addAll(collection2);

        Set<Integer> intersection = new HashSet<Integer>(collection1);
        intersection.retainAll(collection2);

        symmetricDifference.removeAll(intersection);
        return symmetricDifference;
    }
}
