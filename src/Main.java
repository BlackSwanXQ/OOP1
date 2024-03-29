import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Hogwarts[] studentsGryffindor = new Gryffindor[]{
                new Gryffindor("Гарри Поттер", randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Gryffindor("Гермиона Грейнджер", randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Gryffindor("Рон Уизли", randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
        };
        Hogwarts[] studentsSlytherin = new Slytherin[]{
                new Slytherin("Драко Малфой", randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Slytherin("Грэхэм Монтегю", randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Slytherin("Грегори Гойл", randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
        };
        Hogwarts[] studentsHufflepuff = new Hufflepuff[]{
                new Hufflepuff("Захария Смит", randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Hufflepuff("Седрик Диггори", randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Hufflepuff("Джастин Финч-Флетчли", randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
        };
        Hogwarts[] studentRevenclaw = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг", randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Ravenclaw("Падма Патил", randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen()),
                new Ravenclaw("Маркус Белби", randomGen(), randomGen(), randomGen(), randomGen(), randomGen(), randomGen())
        };


        Characteristics characteristics = new Characteristics(4);
        characteristics.addStudent(studentsGryffindor[0]);
        characteristics.addStudent(studentsSlytherin[0]);
        characteristics.addStudent(studentsHufflepuff[0]);
        characteristics.addStudent(studentRevenclaw[0]);
        characteristics.printStudents();

        Gryffindor.compareStudents((Gryffindor) studentsGryffindor[0], (Gryffindor) studentsGryffindor[1]);
        Hufflepuff.compareStudents((Hufflepuff) studentsHufflepuff[0], (Hufflepuff) studentsHufflepuff[1]);
        Ravenclaw.compareStudents((Ravenclaw) studentRevenclaw[0], (Ravenclaw) studentRevenclaw[1]);
        Slytherin.compareStudents((Slytherin) studentsSlytherin[0], (Slytherin) studentsSlytherin[1]);

        Hogwarts.compareStudents(studentsGryffindor[0],studentsSlytherin[0]);
    }

    public static int randomGen() {
        Random random = new Random();
        return random.nextInt(100);
    }


}