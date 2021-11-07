public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    double CalculateLowest(){
        double minValue = grades [0];
        for (double grade : grades) {
            if (minValue > grade) {
            minValue = grade;
            }
        
        }
        return minValue; 
    }
    double CalculateHighest(){
        double maxValue = grades [0];
        for (double grade : grades) {
            if (maxValue < grade) {
            maxValue = grade;
            }
        
        }
        return maxValue; 
    
    }
    double NumberOfGrades(){
        return grades.length;
    }
    double AverageGrade() {
        double sum = 0;
        for (double grade : grades){
            sum += grade;
        }
        return sum / NumberOfGrades();
    } 
    void DisplayInfo()
    { 
        System.out.println("Name: " + studentName + "\nHighestGrade: " + CalculateHighest() + "\nLowestGrade: " + CalculateLowest() + "\nNumber of grades: " + NumberOfGrades() + "\nGrade point average: " + AverageGrade());

    }
    public static void main(String[] args){
        double[] a = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] b = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades amanda = new StudentGrades("Amanda", a);
        StudentGrades james = new StudentGrades("James", b);
        amanda.DisplayInfo();
        james.DisplayInfo();
    }
    
}