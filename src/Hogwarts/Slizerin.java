package Hogwarts;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourceFulness;
    private int firstForPower;

    public Slizerin(String studentName, int transgression, int powerMagic, int cunning, int determination, int ambition, int resourceFulness, int firstForPower) throws Exception {
        super(studentName, transgression, powerMagic);
        this.cunning = validateValue(cunning);
        this.determination = validateValue(determination);
        this.ambition = validateValue(ambition);
        this.resourceFulness = validateValue(resourceFulness);
        this.firstForPower = validateValue(firstForPower);
    }

    public int getDetermination() {
        return determination;
    }

    public int getCunning() {
        return cunning;
    }
    public int getAmbition() {
        return ambition;
    }

    public int getResourceFulness() {
        return resourceFulness;
    }

    public int getFirstForPower() {
        return firstForPower;
    }
    @Override
    public void describe(){
        super.describe();
        System.out.println("Качества Слизеринца: \nХитрость: " + cunning + "\nРешительность: " + determination +
                "\nАмбициозность: " + ambition + "\nНаходчивость: " + resourceFulness + "\nЖажда власти: " + firstForPower);
    }
    public static void bestSlizerin(Slizerin studentOne, Slizerin studentTwo) {
        int qualitySumOne = studentOne.getDetermination() + studentOne.getCunning() + studentOne.getAmbition() + studentOne.getResourceFulness() + studentOne.getFirstForPower();
        int qualitySumTwo = studentTwo.getDetermination() + studentTwo.getCunning() + studentTwo.getAmbition() + studentTwo.getResourceFulness() + studentTwo.getFirstForPower();
        if(qualitySumOne > qualitySumTwo){
            System.out.println(studentOne.getStudentName() + ", лучший Слизеринец, чем " + studentTwo.getStudentName());
        }else if(qualitySumOne == qualitySumTwo) {
        System.out.println("Ученики равны по силе");
         }
        else {
            System.out.println(studentTwo.getStudentName() + ", лучший Слизеринец, чем " + studentOne.getStudentName());
        }
    }
}
