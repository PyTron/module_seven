public class PatientProcedure {
    public static void main(String[] args){
    Procedure procedureOne = new Procedure("Physical Exam", "April 1st", "Dr. Irvine", 250);
    Procedure procedureTwo = new Procedure("X-ray", "April 1st", "Dr. Jamison", 500);
    Procedure procedureThree = new Procedure("Blood Test", "April 1st", "Dr. Smith", 200);
    System.out.println(procedureOne.toString());
    System.out.println(procedureTwo.toString());
    System.out.println(procedureThree.toString());
    }
}
