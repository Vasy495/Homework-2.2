public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(int mind, int wisdom, int wit, int creation) {
        if (mind >= 0 && mind <= 100) {
            this.mind = mind;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (wisdom >= 0 && wisdom <= 100) {
            this.wisdom = wisdom;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (wit >= 0 && wit <= 100) {
            this.wit = wit;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (creation >= 0 && creation <= 100) {
            this.creation = creation;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
    }

    public static void compare(Ravenclaw studentOne, Ravenclaw studentTwo) {
        int powerStudentOne = studentOne.getConjure() + studentOne.getTransgress() + studentOne.mind + studentOne.wit + studentOne.wisdom + studentOne.creation;
        int powerStudentTwo = studentTwo.mind + studentTwo.wisdom + studentTwo.wit + studentTwo.creation + studentTwo.getConjure() + studentTwo.getTransgress();
        if (powerStudentOne > powerStudentTwo) {
            System.out.println("Победил(а) " + studentOne.getName());
        } else if (powerStudentOne < powerStudentTwo) {
            System.out.println("Победил(а) " + studentTwo.getName());
        } else {
            System.out.println("Студенты " + studentOne.getName() + " и " + studentTwo.getName() + " равны!");
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Я студент Ravenclaw! " +
                "У меня mind = " + mind +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creation = " + creation +
                ", conjure = " + this.getConjure() +
                ", transgress = " + this.getTransgress();
    }


}
