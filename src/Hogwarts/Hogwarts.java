package Hogwarts;

public class Hogwarts {
    private int transgression;
    private int powerMagic;

    private String studentName;

    public Hogwarts(String studentName, int transgression, int powerMagic) throws Exception {
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
    public void describe(){
        System.out.println("\nКачества студента: \nИмя студента: " + studentName + "\nУровень трансгрессии: " + transgression +
                "\nМощность колдовства: " + powerMagic);
    }
    public static void bestStudent(Hogwarts studentOne, Hogwarts studentTwo) {
        if(studentOne.transgression > studentTwo.transgression){
            System.out.println(studentOne.getStudentName() + ", обладает большей трансгрессией, чем " + studentTwo.getStudentName());
        } else if(studentOne.transgression == studentTwo.transgression) {
            System.out.println("Студенты обладают одинаковым уровнем трасгрессии");
        }else {
            System.out.println(studentTwo.getStudentName() + ", обладает большей трансгрессией, чем " + studentOne.getStudentName());
        }
        if(studentOne.powerMagic > studentTwo.powerMagic){
            System.out.println(studentOne.getStudentName() + ", обладает большим уровнем магии, чем " + studentTwo.getStudentName());
        } else if(studentOne.powerMagic == studentTwo.powerMagic) {
            System.out.println("Студенты обладают одинаковым уровнем магии");
        }else {
            System.out.println(studentTwo.getStudentName() + ", обладает большим уровнем магии, чем " + studentOne.getStudentName());
        }
    }
}
