public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lastForPower;

    public Slytherin(int cunning, int determination, int ambition, int resourcefulness, int lastForPower) {
        if (cunning >= 0 && cunning <= 100) {
            this.cunning = cunning;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (determination >= 0 && determination <= 100) {
            this.determination = determination;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (resourcefulness >= 0 && resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (lastForPower >= 0 && lastForPower <= 100) {
            this.lastForPower = lastForPower;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
        if (ambition >= 0 && ambition <= 100) {
            this.ambition = ambition;
        } else {
            System.out.println("Ошибка, допустимое значение для ввода от 0 до 100");
        }
    }

    public static void compare(Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne == null || studentTwo == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentOne.getConjure() + studentOne.getTransgress() + studentOne.cunning
                + studentOne.determination + studentOne.ambition + studentOne.resourcefulness + studentOne.lastForPower;
        int powerStudentTwo = studentTwo.cunning + studentTwo.determination + studentTwo.ambition
                + studentTwo.resourcefulness + studentTwo.lastForPower + studentTwo.getConjure() + studentTwo.getTransgress();
        if (powerStudentOne > powerStudentTwo) {
            System.out.println("Победил(а) " + studentOne.getName());
        } else if (powerStudentOne < powerStudentTwo) {
            System.out.println("Победил(а) " + studentTwo.getName());
        } else {
            System.out.println("Студенты " + studentOne.getName() + " и " + studentTwo.getName() + " равны!");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLastForPower() {
        return lastForPower;
    }

    public void setLastForPower(int lastForPower) {
        this.lastForPower = lastForPower;
    }

    @Override
    public String toString() {
        return "Я студент Slytherin! " +
                "У меня cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lastForPower = " + lastForPower +
                ", conjure = " + this.getConjure() +
                ", transgress = " + this.getTransgress();
    }
}
