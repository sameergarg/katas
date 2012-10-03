package designpattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 03/07/2012
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */
public class MaternityPatientVisitor  implements PatientVisitor{

    public void visitHospital() {
        System.out.print("I am here for my baby");
    }
}