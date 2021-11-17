package pl.AniaJava;

public class StudentWFiIS3 extends Student{
    private StudentUSOS stud;

    /* IMPLEMETACJA METOD: */

    StudentWFiIS3(String n, String s, int id, int rok, String p1, double o1, String p2, double o2, String p3, double o3){
        super(n, s, id, o1, o2, o3);
        String[] przedmioty = {p1, p2, p3};

        this.stud = new StudentUSOS() {

            @Override
            public String toString() {
                return "[" + rok + "] ";
            }

            @Override
            public double srednia() {
                return average();
            }

            @Override
            public void listaPrzedmiotow() {
                StringBuilder str = new StringBuilder();
                for(int i=0; i<przedmioty.length; i++){
                    str.append(i+1).append(". ")
                            .append(przedmioty[i])
                            .append(": ").append(getGrade(i))
                            .append("\n");
                }
                System.out.println(str.toString());
            }
        };
    }

    public String toString(){
        return stud.toString() + super.toString();
    }

    public double srednia(){
        return stud.srednia();
    }

    public void listaPrzedmiotow(){
        stud.listaPrzedmiotow();
    }

}