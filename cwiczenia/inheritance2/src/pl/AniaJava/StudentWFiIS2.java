package pl.AniaJava;

public class StudentWFiIS2 implements StudentUSOS {
    private String[] przedmioty;
    private int rok;
    private Student stud;

    /* IMPLEMETACJA METOD: */

    StudentWFiIS2(String n, String s, int id, int rok, String p1, double o1, String p2, double o2, String p3, double o3){
        stud = new Student(n, s, id, o1, o2, o3);
        this.rok = rok;
        this.przedmioty = new String[]{p1, p2, p3};
    }

    public String toString(){
        StringBuilder str = new StringBuilder("[").append(rok).append("] ")
                .append(stud.toString());

        return str.toString();
    }

    public double srednia(){
        return stud.average();
    }

    public void listaPrzedmiotow(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<przedmioty.length; i++){
            str.append(i+1).append(". ")
                    .append(przedmioty[i])
                    .append(": ").append(stud.getGrade(i))
                    .append("\n");
        }
        System.out.println(str.toString());
    }
}
