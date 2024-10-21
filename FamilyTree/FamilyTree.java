package .vscode.FamilyTree;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class FamilyTree {
    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    public void addPerson(String name, int birthYear) {
        if (!people.containsKey(name)) {
            people.put(name, new Person(name, birthYear));
        }
    }

    public Person findPersonByName(String name) {
        return people.get(name);
    }

    public List<Person> getChildren(String name) {
        Person person = findPersonByName(name);
        return (person != null) ? person.getChildren() : new ArrayList<>();
    }

    public List<Person> getSiblings(String name) {
        Person person = findPersonByName(name);
        List<Person> siblings = new ArrayList<>();
 if (person != null && person.getMother() != null) {
            for (Person sibling : person.getMother().getChildren()) {
                if (!sibling.getName().equals(person.getName())) {
                    siblings.add(sibling);
                }
            }
        }
        return siblings;
    }
}
