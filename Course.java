public class Course {
    Teacher teach;  //ögretmen bilgilerini çekmek için
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu =0;
    }


    void addTeacher(Teacher teach){   //teacher nesnesindeki tüm özellikler taşındı.
        if (teach.branch.equals(this.prefix)) {
            this.teach = teach;
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor!");
        }
    }



    void printTeacher(){
       this.teach.print();

    }
}
