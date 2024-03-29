public class Characteristics {
    private final Hogwarts[] hogwarts;
    private int count;

    public Characteristics(int size) {
        this.hogwarts = new Hogwarts[size];
        this.count = 0;
    }

    public void addStudent(Hogwarts hogwart) {
        if (count == hogwarts.length) {
            return;
        }
        hogwarts[count] = hogwart;
        count++;
    }

    public void printStudents(){
        for(int i=0; i<count;i++){
            hogwarts[i].printStudentQualities();
        }
    }

}
