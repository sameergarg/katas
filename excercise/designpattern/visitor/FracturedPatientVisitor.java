package designpattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 03/07/2012
 * Time: 14:56
 * To change this template use File | Settings | File Templates.
 */
public class FracturedPatientVisitor implements PatientVisitor{

    public void visitHospital() {

        System.out.println("I am here for fracture");

    }
}
