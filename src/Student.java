import java.util.Date;

public class Student extends Person {

        private String studentId;
        private String schoolName;
        private int startYear;
        private float gpa;
        public static final int MAX_STUDENT_ID = 10;
        public static final int MAX_SCHOOL_NAME = 200;
        public static final int MIN_YEAR_START = 1900;
        public static final double MIN_GPA = 0.0;
        public static final double MAX_GPA = 10.0;

        public Student(String name, Date birthday, String address, float height, float weight, String studentId, String schoolName, int startYear, float gpa) {
                super(name, birthday, address, height, weight);
                this.studentId = studentId;
                this.schoolName = schoolName;
                this.startYear = startYear;
                this.gpa = gpa;
        }

        public Student(){
            super();
        }

        @Override
        public String toString() {
                return "Student{" +
                        "studentId='" + studentId + '\'' +
                        ", schoolName='" + schoolName + '\'' +
                        ", startYear=" + startYear +
                        ", gpa=" + gpa +
                        '}';
        }
        public void createSutdent(){

        }
}


