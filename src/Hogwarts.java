public class Hogwarts {

    private int conjure;
    private int transgress;
    private String name;

    public void comparePower(Hogwarts studentFirst, Hogwarts studentSecond) {
        if (studentFirst == null || studentSecond == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentFirst.getConjure() + studentFirst.getTransgress();
        int powerStudentTwo = studentSecond.getConjure() + studentSecond.getTransgress();
        if (powerStudentOne > powerStudentTwo) {
            System.out.println("Победил " + studentFirst.getName());
        } else if (powerStudentOne < powerStudentTwo) {
            System.out.println("Победил " + studentSecond.getName());
        } else {
            System.out.println("Ничья");
        }
    }
    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        if (conjure >= 0 && conjure <= 100) {
            this.conjure = conjure;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress >= 0 && transgress <= 100) {
            this.transgress = transgress;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Неправильно переданное имя студента!");
            return;
        }
        this.name = name;
    }
}
