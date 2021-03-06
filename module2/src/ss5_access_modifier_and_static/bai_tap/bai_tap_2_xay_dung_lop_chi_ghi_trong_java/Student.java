package ss5_access_modifier_and_static.bai_tap.bai_tap_2_xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

   public Student() {

    }
    // public: OK
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    //private: ERROR
//    private void setName(String name) {
//        this.name = name;
//    }
//
//    private void setClasses(String classes) {
//        this.classes = classes;
//    }

    //protected: OK
//    protected void setName(String name) {
//        this.name = name;
//    }
//
//    protected void setClasses(String classes) {
//        this.classes = classes;
//    }

    //default: OK
//    void setName(String name) {
//        this.name = name;
//    }
//
//    void setClasses(String classes) {
//        this.classes = classes;
//    }


    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bill");
        student.setClasses("C0222G2");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
