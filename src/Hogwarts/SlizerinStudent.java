package Hogwarts;

public class SlizerinStudent extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourceFulness;
    private int firstForPower;

    public SlizerinStudent(String studentName, int transgression, int powerMagic, int cunning, int determination, int ambition, int resourceFulness, int firstForPower) throws Exception {
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
    public String toString(){
        return super.toString() + "\nКачества Слизеринца: \nХитрость: " + cunning + "\nРешительность: " + determination +
        "\nАмбициозность: " + ambition + "\nНаходчивость: " + resourceFulness + "\nЖажда власти: " + firstForPower;
    }
    public String bestSlizerin(SlizerinStudent studentTwo) {
        int qualitySumOne = this.determination + this.cunning + this.ambition + this.resourceFulness + this.firstForPower;
        int qualitySumTwo = studentTwo.determination + studentTwo.cunning + studentTwo.ambition + studentTwo.resourceFulness + studentTwo.firstForPower;
        if(qualitySumOne > qualitySumTwo){
            return this.getStudentName() + ", лучший Слизеринец, чем " + studentTwo.getStudentName();
        }else if(qualitySumOne == qualitySumTwo) {
        return "Ученики равны по силе!";
         }
        else {
            return studentTwo.getStudentName() + ", лучший Слизеринец, чем " + this.getStudentName();
        }
    }
}
