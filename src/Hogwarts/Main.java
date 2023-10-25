package Hogwarts;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent harry;
        GriffindorStudent ron;
        GriffindorStudent hermiona;
        KogtevranStudent cjou;
        KogtevranStudent padma;
        KogtevranStudent marcus;
        PuffenduiStudent zaharia;
        PuffenduiStudent sedrik;
        PuffenduiStudent jastin;
        SlizerinStudent drako;
        SlizerinStudent grehem;
        SlizerinStudent gregory;
        try {
            harry  = new GriffindorStudent("Гарри Поттер", 1, 2, 3, 4, 5);
            hermiona = new GriffindorStudent("Гермиона Грейнджер", 5, 4, 3, 2, 1);
            ron = new GriffindorStudent("Рон Уизли", 9, 10, 11, 12, 13);
            cjou = new KogtevranStudent("Чжоу Чанг", 7, 8, 2, 3, 1, 5);
            padma = new KogtevranStudent("Падма Патил", 5, 4, 3, 2, 1, 7);
            marcus = new KogtevranStudent("Маркус Белби", 4, 8, 9, 2, 3, 7);
            zaharia = new PuffenduiStudent("Захария Смит", 71, 56, 47, 12, 30);
            sedrik = new PuffenduiStudent("Седрик Диггори", 12, 14, 87, 92, 20);
            jastin = new PuffenduiStudent("Джастин Финч-Флетчли", 11, 10, 25, 46, 98);
            drako = new SlizerinStudent("Драко Малфой", 11, 22, 33, 44, 55, 66, 77);
            grehem = new SlizerinStudent("Грэхэм Монтегю", 54, 33, 78, 55, 21, 20, 19);
            gregory = new SlizerinStudent("Грегори Гойл", 20, 15, 61, 49, 34, 58, 12);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(harry.bestGriffindor(hermiona));
        System.out.println(harry.bestStudent(hermiona));
        System.out.println(ron.toString());
    }
}
