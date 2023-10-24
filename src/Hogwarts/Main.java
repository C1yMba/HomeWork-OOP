package Hogwarts;

public class Main {
    public static void main(String[] args) {
        Griffindor harry;
        Griffindor ron;
        Griffindor hermiona;
        Kogtevran cjou;
        Kogtevran padma;
        Kogtevran marcus;
        Puffendui zaharia;
        Puffendui sedrik;
        Puffendui jastin;
        Slizerin drako;
        Slizerin grehem;
        Slizerin gregory;
        try {
            harry = new Griffindor("Гарри Поттер", 1, 2, 3, 4, 5);
            hermiona = new Griffindor("Гермиона Грейнджер", 5, 4, 3, 2, 1);
            ron = new Griffindor("Рон Уизли", 9, 10, 11, 12, 13);
            cjou = new Kogtevran("Чжоу Чанг", 7, 8, 2, 3, 1, 5);
            padma = new Kogtevran("Падма Патил", 5, 4, 3, 2, 1, 7);
            marcus = new Kogtevran("Маркус Белби", 4, 8, 9, 2, 3, 7);
            zaharia = new Puffendui("Захария Смит", 71, 56, 47, 12, 30);
            sedrik = new Puffendui("Седрик Диггори", 12, 14, 87, 92, 20);
            jastin = new Puffendui("Джастин Финч-Флетчли", 11, 10, 25, 46, 98);
            drako = new Slizerin("Драко Малфой", 11, 22, 33, 44, 55, 66, 77);
            grehem = new Slizerin("Грэхэм Монтегю", 54, 33, 78, 55, 21, 20, 19);
            gregory = new Slizerin("Грегори Гойл", 20, 15, 61, 49, 34, 58, 12);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Griffindor.bestGriffindor(harry,hermiona);
        Hogwarts.bestStudent(ron,jastin);
    }
}
