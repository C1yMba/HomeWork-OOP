package Hogwarts;

import org.w3c.dom.ls.LSOutput;

public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String studentName, int transgression, int powerMagic, int nobility, int honor, int courage) throws Exception {
        super(studentName, transgression, powerMagic);
        this.nobility = validateValue(nobility);
        this.honor = validateValue(honor);
        this.courage = validateValue(courage);
    }

    public int getNobility() {

        return nobility;
    }

    public int getHonor() {

        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Качества Гриффиндорца: \nБлагородство: " + nobility + "\nЧесть: " + honor +
                "\nХрабрость: " + courage);
    }

    public static void bestGriffindor(Griffindor studentOne, Griffindor studentTwo) {
        int qualitySumOne = studentOne.getHonor() + studentOne.nobility + studentOne.courage;
        int qualitySumTwo = studentTwo.honor + studentTwo.nobility + studentTwo.courage;
        if(qualitySumOne > qualitySumTwo){
            System.out.println(studentOne.getStudentName() + ", лучший Грифиндорец, чем " + studentTwo.getStudentName());
        } else if(qualitySumOne == qualitySumTwo) {
            System.out.println("Ученики равны по силе!");
        }else {
            System.out.println(studentTwo.getStudentName() + ", лучший Грифиндорец, чем " + studentOne.getStudentName());
        }
    }

}