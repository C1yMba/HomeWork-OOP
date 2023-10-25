package Hogwarts;

public class GriffindorStudent extends HogwartsStudents {

    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String studentName, int transgression, int powerMagic, int nobility, int honor, int courage) throws Exception {
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
    public String toString() {
        return super.toString() + "\nКачества Гриффиндорца: \nБлагородство: " + nobility + "\nЧесть: " + honor +
                "\nХрабрость: " + courage;
    }

    public String bestGriffindor(GriffindorStudent studentTwo) {
        int qualitySumOne = this.getHonor() + this.nobility + this.courage;
        int qualitySumTwo = studentTwo.honor + studentTwo.nobility + studentTwo.courage;
        if(qualitySumOne > qualitySumTwo){
            return this.getStudentName() + ", лучший Грифиндорец, чем " + studentTwo.getStudentName();
        } else if(qualitySumOne == qualitySumTwo) {
            return "Ученики равны по силе!";
        }else {
           return studentTwo.getStudentName() + ", лучший Грифиндорец, чем " + this.getStudentName();
        }
    }

}