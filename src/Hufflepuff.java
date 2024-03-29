public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void printStudentQualities() {
        System.out.println(getName() + " :" + " сила магии - " + getPowerOfMagic() + ", расстояние трансгрессии - " + getTransgressionDistance() + ", трудолюбие - " + getIndustriousness() + ", верность - " + getLoyalty() + ", честность - " + getHonesty());
    }

    public static void compareStudents(Hufflepuff one, Hufflepuff two) {
        int sumQualitiesOne = one.getHonesty() + one.getIndustriousness() + one.getLoyalty();
        int sumQualitiesTwo = two.getHonesty() + two.getIndustriousness() + two.getLoyalty();
        if (sumQualitiesOne > sumQualitiesTwo) {
            System.out.println("У " + one.getName() + ", сумма баллов равна " + sumQualitiesOne +
                    ", а у " + two.getName() + " - " + +sumQualitiesTwo + ", значит " + one.getName() + ", лучше чем " + two.getName());
        } else if (sumQualitiesTwo > sumQualitiesOne) {
            System.out.println("У " + two.getName() + ", сумма баллов равна " + sumQualitiesTwo +
                    ", а у " + one.getName() + " - " + sumQualitiesOne + ", значит " + two.getName() + ", лучше чем " + one.getName());
        } else {
            System.out.println("Суммы баллов у " + one.getName() + " и " +
                    two.getName() + " равны - значит они оба хороши!");
        }
    }

}
