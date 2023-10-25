package Hogwarts;

public abstract class HogwartsStudents {
    private int transgression;
    private int powerMagic;

    private String studentName;

    public HogwartsStudents(String studentName, int transgression, int powerMagic) throws Exception {
        this.studentName = studentName;
        this.transgression = validateValue(transgression);
        this.powerMagic = validateValue(powerMagic);
    }

    public int getTransgression() {
        return transgression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public String getStudentName() {
        return studentName;
    }
    protected int validateValue(int value) throws Exception {
        if(value >= 0 && value <= 100) {
            return value;
        } else {
            throw new Exception("Value " + value + " is out of range. It should be in range [0, 100]");
        }
    }
    public String toString(){
        return "\nКачества студента: \nИмя студента: " + getStudentName() + "\nУровень трансгрессии: " + getTransgression() +
                "\nМощность колдовства: " + getPowerMagic();
    }
    public String bestStudent(HogwartsStudents studentTwo) {
        int qualitySumOne = this.getTransgression() + this.getPowerMagic();
        int qualitySumTwo = studentTwo.getTransgression() + studentTwo.getPowerMagic();
        if(qualitySumOne > qualitySumTwo){
            return this.getStudentName() + ", лучше ученик, чем " + studentTwo.getStudentName();
        } else if(qualitySumOne == qualitySumTwo) {
            return "Ученики равны по силе!";
        }else {
            return studentTwo.getStudentName() + ", лучше ученик, чем " + this.getStudentName();
        }
    }
}
