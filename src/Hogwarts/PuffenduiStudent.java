package Hogwarts;

public class PuffenduiStudent extends HogwartsStudents {
    private int hardWorking;
    private int loyal;
    private int honest;

    public PuffenduiStudent(String studentName, int transgression, int powerMagic, int hardWorking, int loyal, int honest) throws Exception {
        super(studentName, transgression, powerMagic);
        this.hardWorking = validateValue(hardWorking);
        this.loyal = validateValue(loyal);
        this.honest = validateValue(honest);
    }
    public int getHardWorking() {
        return hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }
    public int getHonest() {
        return honest;
    }
    @Override
    public String toString(){

        return super.toString() + "\nКачества Пуффендуйца: \nТрудолюбие: " + hardWorking + "\nВерность: " + loyal +
                "\nЧестность: " + honest;
    }
    public String bestPuffendui(PuffenduiStudent studentTwo) {
        int qualitySumOne = this.hardWorking + this.honest + this.loyal;
        int qualitySumTwo = studentTwo.hardWorking + studentTwo.honest + studentTwo.loyal;
        if(qualitySumOne > qualitySumTwo) {
            return this.getStudentName() + ", лучший Пуффендуец, чем " + studentTwo.getStudentName();
        }else if(qualitySumOne == qualitySumTwo){
                return "Ученики равны по силе!";
        }
        else {
            return studentTwo.getStudentName() + ", лучший Пуффендуец, чем " + this.getStudentName();
        }
    }
}
