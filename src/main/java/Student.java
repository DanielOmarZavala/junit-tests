import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

//    public double getGradeAverage() {
//        int totalPoints = this.gradesList.stream().reduce(0, (sum, currentGradeElement) -> {
//            System.out.println("The sums is currently: " + sum);
//            System.out.println("The current grade element is: " + currentGradeElement);
//            System.out.println("********************************");
//            return sum + currentGradeElement;
//        });
//        return (double) totalPoints / this.gradesList.size();
//    }



}
