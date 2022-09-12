package TryOuts;

interface Certification {
    public double REGULAR_COURSE_FEE = 2000;
    public double CRASH_COURSE_FEE = 5000;

    public double calculateFee();
}

class RRTechnicalCertification implements Certification {
    private String studentName;
    private String courseName;
    private int registrationId;
    private int admissionTestMarks;
    public static int counter;

    RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
        setStudentName(studentName);
        setCourseName(courseName);
        setAdmissionTestMarks(admissionTestMarks);
        counter++;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setAdmissionTestMarks(int admissionTestMarks) {
        if (admissionTestMarks <= 100 && admissionTestMarks >= 0)
            this.admissionTestMarks = admissionTestMarks;
    }

    public int getAdmissionTestMarks() {
        return admissionTestMarks;
    }

    public void generateRegistrationId() {

    }

    public double calculateFee() {
        return 0;
    }

}

class RegularCourseCertification extends RRTechnicalCertification {
    private int courseDuration;
    public static int regularCourseCounter;

    public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks,
            int courseDuration) {
        super(studentName, courseName, admissionTestMarks);
        setCourseDuration(courseDuration);
        generateRegistrationId();
        regularCourseCounter++;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void generateRegistrationId() {
        super.setRegistrationId(1001 + regularCourseCounter * 2);
    }

    public double calculateFee() {
        int marks = getAdmissionTestMarks();
        double fee = getCourseDuration() * REGULAR_COURSE_FEE;
        // Discount
        if (marks >= 90)
            return fee * 0.9;
        else if (marks >= 75 && marks <= 89)
            return fee * 0.95;
        else
            return fee;

    }
}

class CrashCourseCertification extends RRTechnicalCertification {
    public static int crashCourseCounter;

    public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
        super(studentName, courseName, admissionTestMarks);
        generateRegistrationId();
        crashCourseCounter++;
    }

    public void generateRegistrationId() {
        setRegistrationId(1002 + crashCourseCounter * 2);
    }

    public double calculateFee() {
        int marks = getAdmissionTestMarks();
        double fee = CRASH_COURSE_FEE;
        // Discount
        if (marks >= 90) {
            fee = fee * 0.9;
        } else if (marks >= 75 && marks <= 89)
            fee = fee * 0.95;
        else {
            // no discount
        }

        return fee * 1.1236;
    }

}

public class Assignment6 {
    public static void main(String[] args) {
        RegularCourseCertification C1 = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
        System.out.println("The Fee is :" + C1.calculateFee());
        CrashCourseCertification C2 = new CrashCourseCertification("Roshan", "Angular", 71);
        System.out.println("the fee is :" + C2.calculateFee());
    }
}
