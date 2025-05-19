public class StudentGrader {

    public static String evaluateStudent(int math, int science, int literature) {
        int average = (math + science + literature) / 3;

        if (math < 0 || math > 100 || science < 0 || science > 100 || literature < 0 || literature > 100) {
            return "Invalid scores.";
        }

        if (average >= 90) {
            if (math > 95 && science > 95) {
                return "Excellent in STEM and overall.";
            }
            return "Excellent student.";
        } else if (average >= 75) {
            if (literature > 90) {
                return "Strong in humanities.";
            }
            return "Good student.";
        } else if (average >= 60) {
            return "Passing.";
        } else {
            return "Failing.";
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateStudent(98, 97, 85));
    }
}
