package Hogwarts;

public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    private int creative;

    public Kogtevran(String studentName, int transgression, int powerMagic, int smart, int wise, int witty, int creative) throws Exception {
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
    public void describe(){
        super.describe();
        System.out.println("Качества Когтевранца: \nУм: " + smart + "\nМудрость: " + wise +
                "\nОстроумность: " + witty + "\nКреативность: " + creative);
    }
    public static void bestKogtevran(Kogtevran studentOne, Kogtevran studentTwo) {
        int qualitySumOne = studentOne.getSmart() + studentOne.getWise() + studentOne.getWitty() + studentOne.getCreative();
        int qualitySumTwo = studentTwo.getSmart() + studentTwo.getWise() + studentTwo.getWitty() + studentTwo.getCreative();
        if(qualitySumOne > qualitySumTwo){
            System.out.println(studentOne.getStudentName() + ", лучший Когтевранец, чем " + studentTwo.getStudentName());
        }else if(qualitySumOne == qualitySumTwo) {
            System.out.println("Ученики равны по силе");
        }
        else {
            System.out.println(studentTwo.getStudentName() + ", лучший Когтевранец, чем " + studentOne.getStudentName());
        }
    }
}
