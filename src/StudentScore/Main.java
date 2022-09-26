package StudentScore;

public class Main {

    // Função dos estudantes
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Heloisa");
        student1.setAc1(9f);
        student1.setAc2(10f);
        student1.setAg(8f);
        student1.setAf(10f);

        Student student2 = new Student("Luke", 10, 10, 10, 10);

        Student student3 = new Student();
        student3.setName("Julio");
        student3.setAc1(2f);
        student3.setAc2(3f);
        student3.setAg(9f);
        student3.setAf(6f);


        // Printar os valores


        // Estudante 01 //
        System.out.println(student1.getName());
        System.out.println("AC1: " + student1.getAc1());
        System.out.println("Average: " + student1.makeAverage());

        /*String ternarioStatus = (student1.makeFinalAverage() > 5) ? "approved" : "disapproved";
        System.out.println(ternarioStatus);*/



        String status;
        if (student1.makeAverage() > 5) {
            status = "approved";

        } else {
            status = "disapproved";
            System.out.println("Sub: " + student1.makeSub());

        } System.out.println(status);


        // Estudante 02 //
        System.out.println();
        System.out.println(student2.getName());
        System.out.println("AC1: " + student2.getAc1());
        System.out.println("Average: " + student2.makeAverage());

        /*ternarioStatus = (student2.makeFinalAverage() > 5) ? "approved" : "disapproved";
        System.out.println(ternarioStatus);*/


        if (student2.makeAverage() > 5) {
            status = "approved";

        } else {
            status = "disapproved";
            System.out.println("Sub: " + student2.makeSub());

        } System.out.println(status);


        // Estudante 03 //
        System.out.println();
        System.out.println(student3.getName());
        System.out.println("AC1: " + student3.getAc1());
        System.out.println("Average: " + student3.makeAverage());

        /*ternarioStatus = (student3.makeFinalAverage() > 5) ? "approved" : "disapproved";
        System.out.println(ternarioStatus);*/


        if (student3.makeAverage() > 5) {
            status = "approved";

        } else {
            status = "disapproved";
            System.out.println("Sub: " + student3.makeSub());

        } System.out.println(status);
    }


}

