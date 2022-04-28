public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "TRH", "0535788999");
        Teacher t2 =new Teacher("Graham Bell","FZK","2222445");
        Teacher t3 =new Teacher("Abdullah","KMY","5554112");

        Course tarih = new Course("Tarih","01","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","02","FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya","03","KMY");
        kimya.addTeacher(t3);

        Student s1=new Student("Ahmet","4","123", tarih, fizik, kimya);
        s1.addBulkExamNote(100,75,50);
        s1.addBulkSozluNote(20,50,50);
        s1.isPass();
        Student s2=new Student("Ayşe","4","1234", tarih, fizik, kimya);
        s2.addBulkExamNote(10,50,85);
        s2.addBulkSozluNote(100,50,60);
        s2.isPass();

    }
}
