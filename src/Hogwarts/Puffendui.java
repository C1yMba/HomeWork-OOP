package Hogwarts;

public class Puffendui extends Hogwarts {
    private int hardWorking;
    private int loyal;
    private int honest;

    public Puffendui(String studentName,int transgression, int powerMagic, int hardWorking, int loyal, int honest) throws Exception {
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
    public void describe(){
        super.describe();
        System.out.println("Качества Пуффендуйца: \nТрудолюбие: " + hardWorking + "\nВерность: " + loyal +
                "\nЧестность: " + honest);
    }
    public static void bestPuffendui(Puffendui studentOne, Puffendui studentTwo) {
        int qualitySumOne = studentOne.getHardWorking() + studentOne.getLoyal() + studentOne.getHonest();
        int qualitySumTwo = studentTwo.getHardWorking() + studentTwo.getLoyal() + studentTwo.getHonest();
        if(qualitySumOne > qualitySumTwo) {
            System.out.println(studentOne.getStudentName() + ", лучший Пуффендуец, чем " + studentTwo.getStudentName());
        }else if(qualitySumOne == qualitySumTwo) {
                System.out.println("Ученики равны по силе!");
            }
        else {
            System.out.println(studentTwo.getStudentName() + ", лучший Пуффендуец, чем " + studentOne.getStudentName());
        }
    }
}
