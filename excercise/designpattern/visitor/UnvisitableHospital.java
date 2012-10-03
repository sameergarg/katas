package designpattern.visitor;

/**
 * All logic is part of method inside unvisitable class which means that every time there is a new visitor we need to make a
 * code change. This violates open close principal as this class should not be open for modifications.
 */
public class UnvisitableHospital {

    public void logVisit(Object visitor){
        if(visitor instanceof FracturedPatientVisitor){
            System.out.print("Fractured patient visitors are not welcome");
        }else if(visitor instanceof MaternityPatientVisitor){
            System.out.print("Maternity patient visitors are not welcome");
        }else{
            System.out.print("I hate visitors");
        }

    }
}
