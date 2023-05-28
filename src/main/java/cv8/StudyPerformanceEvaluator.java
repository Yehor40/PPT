package cv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Student {
    String email;
    String grade;
    int points;

    public Student(String email, String grade, int points) {
        this.email = email;
        this.grade = grade;
        this.points = points;
    }
}

public class StudyPerformanceEvaluator {
    private List<Student> students;
    private Map<String, Integer> gradeHistogram;
    private Map<String, Double> relativeHistogram;

    public StudyPerformanceEvaluator() {
        students = new ArrayList<>();
        gradeHistogram = new HashMap<>();
        relativeHistogram = new HashMap<>();
    }

    public void readInputFile(String inputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(";");
            String email = data[0];
            String grade = data[1];
            int points = Integer.parseInt(data[2]);

            Student student = new Student(email, grade, points);
            students.add(student);
        }

        reader.close();
    }

    public void generateGradeHistogram() {
        gradeHistogram.put("student", 10);
        gradeHistogram.put("manager", 20);
         gradeHistogram.put("owner", 12);

        for (Student student : students) {
            String grade = student.grade;
            gradeHistogram.put(grade, gradeHistogram.get(grade) + 1);
        }
    }

    public void generateRelativeHistogram() {
        int totalStudents = students.size();

        for (Map.Entry<String, Integer> entry : gradeHistogram.entrySet()) {
            String grade = entry.getKey();
            int count = entry.getValue();
            double percentage = (double) count / totalStudents;
            relativeHistogram.put(grade, percentage);
        }
    }

    public void displayHistogram() {
        System.out.println("Histogram:");
        for (Map.Entry<String, Integer> entry : gradeHistogram.entrySet()) {
            String grade = entry.getKey();
            int count = entry.getValue();
            String stars = "*".repeat(count);
            System.out.println(grade + ": " + count + "\t" + stars);
        }
    }

    public void displayRelativeHistogram() {
        System.out.println("\nRelative Histogram:");
        for (Map.Entry<String, Double> entry : relativeHistogram.entrySet()) {
            String grade = entry.getKey();
            double percentage = entry.getValue();
            System.out.println(grade + ": " + percentage);
        }
    }

    public void exportHistogramToFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (Map.Entry<String, Integer> entry : gradeHistogram.entrySet()) {
            String grade = entry.getKey();
            String value = entry.getValue().toString();
            writer.write(grade + ": " + value);
            writer.newLine();
        }

        writer.close();
    }

    public void generateOverviewDocument(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (Student student : students) {
            String fullName = extractFullName(student.email);
            String login = extractLogin(student.email);
            String grade = student.grade;

            writer.write("Name: " + fullName);
            writer.newLine();
            writer.write("Login: " + login);
            writer.newLine();
            writer.write("Grade: " + grade);
            writer.newLine();
            writer.newLine();
        }

        writer.close();
    }

    private String extractFullName(String email) {
        int atIndex = email.indexOf("@");
        return email.substring(0, atIndex);
    }

    private String extractLogin(String email) {
        int atIndex = email.indexOf("@");
        return email.substring(0, atIndex);
    }

    public static void main(String[] args) {
        StudyPerformanceEvaluator evaluator = new StudyPerformanceEvaluator();
        String inputFile = "/Users/stroka01/Development/PPT/src/main/java/cv8//students.csv";

        try {
            evaluator.readInputFile(inputFile);
            evaluator.generateGradeHistogram();
            evaluator.generateRelativeHistogram();
            evaluator.displayHistogram();
            evaluator.displayRelativeHistogram();
            evaluator.exportHistogramToFile("/Users/stroka01/Development/PPT/src/main/java/cv8/grade_histogram.txt");
            evaluator.generateOverviewDocument("/Users/stroka01/Development/PPT/src/main/java/cv8/overview_document.txt");
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
        }
    }
}
