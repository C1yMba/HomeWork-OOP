package Hogwarts;

public class KogtevranStudent extends HogwartsStudents {
    private int smart;
    private int wise;
    private int witty;

    private int creative;

    public KogtevranStudent(String studentName, int transgression, int powerMagic, int smart, int wise, int witty, int creative) throws Exception {
        super(studentName, transgression, powerMagic);
        this.smart = validateValue(smart);
        this.wise = validateValue(wise);
        this.witty = validateValue(witty);
        this.creative = validateValue(creative);
    }

    public int getSmart() {
        return smart;
    }
    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }
    @Override
    public String toString(){
        return super.toString() + "\nКачества Когтевранца: \nУм: " + this.getSmart() + "\nМудрость: " + this.getWise() +
                "\nОстроумность: " + this.getWitty() + "\nКреативность: " + this.getCreative();
    }
    public String bestKogtevran(KogtevranStudent studentTwo) {
        int qualitySumOne = this.getSmart() + this.getWise() + this.getCreative() + this.getWitty();
        int qualitySumTwo = studentTwo.getSmart() + studentTwo.getWise() + studentTwo.getWitty() + studentTwo.getCreative();
        if(qualitySumOne > qualitySumTwo){
            return this.getStudentName() + ", лучший Когтевранец, чем " + studentTwo.getStudentName();
        }else if(qualitySumOne == qualitySumTwo) {
            return "Ученики равны по силе!";
        }
        else {
            return studentTwo.getStudentName() + ", лучший Когтевранец, чем " + this.getStudentName();
        }
    }
}
