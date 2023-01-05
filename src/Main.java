public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor(101,2, 63);
        harryPotter.setConjure(23);
        harryPotter.setTransgress(54);
        harryPotter.setName("Гарри");
        Griffindor germiona = new Griffindor(23, 85,39);
        germiona.setConjure(54);
        germiona.setTransgress(76);
        germiona.setName("Гермиона");
        Griffindor ronUizly = new Griffindor(54, 23, 53);
        ronUizly.setConjure(54);
        ronUizly.setTransgress(23);
        ronUizly.setName("Рон");
        Slytherin drago = new Slytherin(32, 43,65,43,65);
            drago.setConjure(54);
            drago.setTransgress(32);
            drago.setName("Драко");
        Slytherin grekhem = new Slytherin(23,45,23, 74,23);
            grekhem.setConjure(76);
            grekhem.setTransgress(23);
            grekhem.setName("Грекхем");
        Slytherin gregory = new Slytherin(54,73,46, 43,23);
            gregory.setTransgress(3);
            gregory.setConjure(23);
            gregory.setName("Грегори");
        Hufflepuff smith = new Hufflepuff(34,45,65);
            smith.setConjure(56);
            smith.setTransgress(43);
            smith.setName("Смит");
        Hufflepuff sedrik = new Hufflepuff(23,34,43);
            sedrik.setTransgress(67);
            sedrik.setConjure(21);
            sedrik.setName("Седрик");
        Hufflepuff jastin = new Hufflepuff(43,45,22);
            jastin.setConjure(32);
            jastin.setTransgress(32);
            jastin.setName("Джастин");
        Ravenclaw chang = new Ravenclaw(43,54,32,23);
            chang.setConjure(52);
            chang.setTransgress(23);
            chang.setName("Чанг");
        Ravenclaw padma = new Ravenclaw(54,32,12,54);
            padma.setConjure(43);
            padma.setTransgress(43);
            padma.setName("Падма");
        Ravenclaw markus = new Ravenclaw(54,32,65,43);
            markus.setTransgress(43);
            markus.setConjure(32);
            markus.setName("Маркус");

        System.out.println(harryPotter);
        System.out.println(drago);
        System.out.println(sedrik);
        System.out.println(markus);

        Griffindor.compare(germiona, ronUizly);
        Ravenclaw.compare(padma, markus);

        new Hogwarts().comparePower(harryPotter, markus);
    }
}