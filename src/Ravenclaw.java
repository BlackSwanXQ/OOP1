public class Ravenclaw extends Hogwarts {
private int mind;
private int wisdom;
private int wit;
private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name,powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public void printStudentQualities() {
        System.out.println(getName() + " :" + " сила магии - " + getPowerOfMagic() + ", расстояние трансгрессии - " + getTransgressionDistance() + ", ум - " + getMind() + " мудрость - " + getWisdom() + ",  остроумие - " + getWit());
    }

    public static void compareStudents(Ravenclaw one, Ravenclaw two) {
        int sumQualitiesOne = one.getMind() + one.getWisdom() + one.getWit() + one.getCreativity();
        int sumQualitiesTwo = two.getMind() + two.getWisdom() + two.getWit() + two.getCreativity();
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
