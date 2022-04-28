public class Student {
    Course c1;  //ders bilgilerini çekmek için
    Course c2;
    Course c3;
    String name,stuNo;
    String classes;
    double avarage;
    boolean isPass;  //sınıfı geçti mi geçmedi mi

    Student(String name, String classes, String stuNo, Course c1,Course c2,Course c3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2= c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int note1, int note2, int note3){   //ögrencilerin notlarını girmek için
        if (note1 >=0 && note1 <=100) {
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100) {
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <=100) {
            this.c3.note = note3;
        }
    }


    void addBulkSozluNote(int soz1, int soz2, int soz3){   //ögrencilerin notlarını girmek için
        if (soz1 >=0 && soz1 <=100) {
            this.c1.sozlu = soz1;
        }
        if (soz2 >=0 && soz2 <=100) {
            this.c2.sozlu = soz2;
        }
        if (soz3 >=0 && soz3 <=100) {
            this.c3.sozlu = soz3;
        }
    }


    void isPass(){
        System.out.println("======================");
        this.avarage =(this.c1.note * 0.8 + this.c1.sozlu * 0.2);
        this.avarage =(this.c2.note * 0.8 + this.c2.sozlu * 0.2);
        this.avarage =(this.c3.note * 0.8 + this.c3.sozlu * 0.2);
        if(this.avarage > 55){
            System.out.println("Gecti");
            this.isPass= true;
        } else {
            System.out.println("Kaldi");
            this.isPass= false;
        }
        printNote();
    }


    void printNote(){
        System.out.println(c1.name + " notu: " + this.c1.note);
        System.out.println(c2.name + " notu: " + this.c2.note);
        System.out.println(c3.name + " notu: " + this.c3.note);
        System.out.println(c1.name + " sozlusu: " + this.c1.sozlu);
        System.out.println(c2.name + " sozlusu: " + this.c2.sozlu);
        System.out.println(c3.name + " sozlusu: " + this.c3.sozlu);
        System.out.println("Ortalamaniz: " + this.avarage);
    }
}
