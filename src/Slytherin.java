public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int trick, int determination, int ambition, int resourcefulness, int power) {
        super(name, powerOfMagic, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void printStudentQualities() {
        System.out.println(getName() + " :" + " сила магии - " + getPowerOfMagic() + ", расстояние трансгрессии - " + getTransgressionDistance() + ", хитрость - " + getTrick() + ", решительность - " + getDetermination() + ",  амбициозность - " + getAmbition() + ", находчивость - " + getResourcefulness() + ", жажда власти - " + getPower());
    }

    public static void compareStudents(Slytherin one, Slytherin two) {
        int sumQualitiesOne = one.getAmbition() + one.getResourcefulness() + one.getPower() + one.getTrick() + one.getDetermination();
        int sumQualitiesTwo = two.getAmbition() + two.getResourcefulness() + two.getPower() + two.getTrick() + two.getDetermination();
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
