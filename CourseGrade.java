public class CourseGrade {
  private String semester, courseNumber;
  private char letterGrade;

  public static char [] validLetterGrades = {'E','D','C','B','A'};
  public static char incompleteGrade='I';

  public CourseGrade(String sem, String course, char grade) {
    setSemester(sem); setCourseNumber(course); setLetterGrade(grade);
  }
  public void setSemester(String sem) { semester=sem; }
  public void setCourseNumber(String course) { courseNumber=course; }
  public void setLetterGrade(char grade) {
    int i=0;
    while (i<validLetterGrades.length && grade!= validLetterGrades[i])
      i++;
    if (i==validLetterGrades.length)
      letterGrade = incompleteGrade;
    else letterGrade = validLetterGrades[i];
  }
  public String getSemester() { return semester; }
  public String getCourseNumber() { return courseNumber; }
  public char getLetterGrade() { return letterGrade; }
  public CourseGrade clone() {
    CourseGrade copy = new CourseGrade (getSemester(), getCourseNumber(),
                                        getLetterGrade());
    return copy;
  }
  public String toString() {
    return semester + " " + courseNumber + " " + letterGrade;
  }
}