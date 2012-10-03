package designpattern.visitor;

/**
 * Logic will be part of various visitors. In case new visitor needs to be added implementation of this interface
 * need not be changed. This fits well with open closed principal as this class is closed for modifications.
 */
public interface VisitableByPatients {

    public void acceptVisitor(PatientVisitor patientVisitor);
}
