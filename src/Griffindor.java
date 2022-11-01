public class Griffindor extends Hogwarts{

    private int mobility;
    private int honour;
    private int bravery;

    public Griffindor(int mobility, int honour, int bravery) {
        if (mobility >= 0 && mobility <= 100) {
            this.mobility = mobility;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (honour >= 0 && honour <= 100) {
            this.honour = honour;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (bravery >= 0 && bravery <= 100) {
            this.bravery = bravery;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
    }

    public static void compare(Griffindor studentOne, Griffindor studentTwo) {
        if (studentOne == null || studentTwo == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentOne.getConjure() + studentOne.getTransgress() + studentOne.bravery + studentOne.honour + studentOne.mobility;
        int powerStudentTwo = studentTwo.bravery + studentTwo.honour + studentTwo.honour + studentTwo.getConjure() + studentTwo.getTransgress();
        if (powerStudentOne > powerStudentTwo) {
            System.out.println("Победил(а) " + studentOne.getName());
        } else if (powerStudentOne < powerStudentTwo) {
            System.out.println("Победил(а) " + studentTwo.getName());
        } else {
            System.out.println("Студенты " + studentOne.getName() + " и " + studentTwo.getName() + " равны!");
        }
    }


    public int getMobility() {
        return mobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Я студент Griffindor! " +
                "У меня mobility = " + mobility +
                ", honour = " + honour +
                ", bravery = " + bravery +
                ", conjure = " + this.getConjure() +
                ", transgress = " + this.getTransgress();
    }
}
