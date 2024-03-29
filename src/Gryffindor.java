public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void printStudentQualities() {
        System.out.println(getName() + " :" + " сила магии - " + getPowerOfMagic() + ", расстояние трансгрессии - " + getTransgressionDistance() + ", благородство - " + getNobility() + ", честь - " + getHonor() + ", храбрость - " + getBravery());
    }

    public static void compareStudents(Gryffindor one, Gryffindor two) {
        int sumQualitiesOne = one.getBravery() + one.getHonor() + one.getNobility();
        int sumQualitiesTwo = two.getBravery() + two.getHonor() + two.getNobility();
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
