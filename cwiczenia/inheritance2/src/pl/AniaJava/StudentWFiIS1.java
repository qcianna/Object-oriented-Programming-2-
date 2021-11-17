package pl.AniaJava;

public class StudentWFiIS1 extends Student implements StudentUSOS {
    private String[] przedmioty;
    private int rok;

    /* IMPLEMETACJA METOD: */

    StudentWFiIS1(String n, String s, int id, int rok, String p1, double o1, String p2, double o2, String p3, double o3){
        super(n, s, id, o1, o2, o3);
        this.rok = rok;
        this.przedmioty = new String[]{p1, p2, p3};
    }

    public String toString(){
        StringBuilder str = new StringBuilder("[").append(rok).append("] ")
        .append(super.toString());

        return str.toString();
    }

    public double srednia(){
        return average();
    }

    public void listaPrzedmiotow(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<przedmioty.length; i++){
            str.append(i+1).append(". ")
                    .append(przedmioty[i])
                    .append(": ").append(getGrade(i))
                    .append("\n");
        }
        System.out.println(str.toString());
    }

}
