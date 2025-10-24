package school;

public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("❌ Жасы 18-ден кіші студент қабылданбайды!");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", жас: " + age;
    }
}
