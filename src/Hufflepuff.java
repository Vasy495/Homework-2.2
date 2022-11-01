public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int industriousness, int loyalty, int honesty) {
        if (industriousness >= 0 && industriousness <= 100) {
            this.industriousness = industriousness;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (loyalty >= 0 && loyalty <= 100) {
            this.loyalty = loyalty;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (honesty >= 0 && honesty <= 100) {
            this.honesty = honesty;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
    }

    public static void compare(Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne == null || studentTwo == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentOne.getConjure() + studentOne.getTransgress() + studentOne.loyalty + studentOne.industriousness + studentOne.honesty;
        int powerStudentTwo = studentTwo.honesty + studentTwo.loyalty + studentTwo.industriousness + studentTwo.getConjure() + studentTwo.getTransgress();
        if (powerStudentOne > powerStudentTwo) {
            System.out.println("Победил(а) " + studentOne.getName());
        } else if (powerStudentOne < powerStudentTwo) {
            System.out.println("Победил(а) " + studentTwo.getName());
        } else {
            System.out.println("Студенты " + studentOne.getName() + " и " + studentTwo.getName() + " равны!");
        }
    }


    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Я студент Hufflepuff! " +
                "У меня industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                ", conjure = " + this.getConjure() +
                ", transgress = " + this.getTransgress();
    }


}
