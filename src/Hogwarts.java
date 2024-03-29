public class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printStudentQualities() {
        System.out.println(getName() + " :" + " сила магии - " + getPowerOfMagic() + ", расстояние трансгрессии - " + getTransgressionDistance());
    }

    public static void compareStudents(Hogwarts one, Hogwarts two) {
        int sumQualitiesOne = one.getPowerOfMagic() + one.getTransgressionDistance();
        int sumQualitiesTwo = two.getPowerOfMagic() + two.getTransgressionDistance();
        if (sumQualitiesOne > sumQualitiesTwo) {
            System.out.println(one.getName() + " обладает большей мощностью магии, чем " + two.getName());
        } else if (sumQualitiesTwo > sumQualitiesOne) {
            System.out.println(two.getName() + " обладает большей мощностью магии, чем " + one.getName());
        } else {
            System.out.println("У " + one.getName() + " и " + two.getName() + "мощности равны!");

        }
    }


}
