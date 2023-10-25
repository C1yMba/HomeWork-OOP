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
        return "\nКачества студента: \nИмя студента: " + studentName + "\nУровень трансгрессии: " + transgression +
                "\nМощность колдовства: " + powerMagic;
    }
    public String bestStudent(HogwartsStudents studentTwo) {
        int qualitySumOne = this.transgression + this.powerMagic;
        int qualitySumTwo = studentTwo.transgression + studentTwo.powerMagic;
        if(qualitySumOne > qualitySumTwo){
            return this.studentName + ", лучше ученик, чем " + studentTwo.studentName;
        } else if(qualitySumOne == qualitySumTwo) {
            return "Ученики равны по силе!";
        }else {
            return studentTwo.studentName + ", лучше ученик, чем " + this.studentName;
        }
    }
}
