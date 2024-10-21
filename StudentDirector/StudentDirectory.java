import java.util.*;

public class StudentDirectory {
    private Map<String, List<Integer>> students;

    public StudentDirectory() {
        this.students = new HashMap<>();
    }

    /**
     * Добавляет или обновляет запись о студенте с именем name и оценкой grade.
     * Если студент уже существует, обновляет его оценку.
     *
     * @param name  имя студента
     * @param grade оценка студента
     */
    public void addStudent(String name, Integer grade) {
        if (students.containsKey(name)) {
            students.get(name).add(grade);
        } else {
            List<Integer> grades = new ArrayList<>();
            grades.add(grade);
            students.put(name, grades);
        }
    }

    /**
     * Находит оценки студента по его имени.
     * Если студент существует, возвращает список его оценок. Если нет — пустой список.
     *
     * @param name 
     * @return 
     */
    public List<Integer> findStudent(String name) {
        return students.getOrDefault(name, Collections.emptyList());
    }

    /**
     * Возвращает весь справочник студентов в виде HashMap,
     * где ключи — имена студентов, а значения — списки их оценок.
     *
     * @return 
     */
    public Map<String, List<Integer>> getAllStudents() {
        return new HashMap<>(students);
    }

    /**
     * Удаляет запись о студенте по имени из справочника.
     * Если запись не существует, ничего не происходит.
     *
     * @param name 
     */
    public void removeStudent(String name) {
        students.remove(name);
    }
}

