public class Main {
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();

        directory.addStudent("Иван", 5);
        directory.addStudent("Иван", 4);
        directory.addStudent("Петр", 3);

        System.out.println(directory.findStudent("Иван")); // [5, 4]
        System.out.println(directory.findStudent("Петр")); // [3]
        System.out.println(directory.findStudent("Сергей")); // []

        System.out.println(directory.getAllStudents());
        

        directory.removeStudent("Петр");
        System.out.println(directory.getAllStudents());
        
    }
}

