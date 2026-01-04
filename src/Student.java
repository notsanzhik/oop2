class Student extends Person {
    private double gpa;
    private static final double STIPEND = 52000.00;

    public Student() { super(); }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND : 0.00;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}