package terniary;

public class grade {
    public static void main(String[] args) {
        int mark = 80 ;
        String result = mark >=90 && mark <=100 ? "A" : (mark >=80 && mark <=89 ? "B":(mark >=70 && mark <=79 ? "C": (mark >=60 && mark <=69 ? "D": "F")));
        System.out.println(result);
    }
}
