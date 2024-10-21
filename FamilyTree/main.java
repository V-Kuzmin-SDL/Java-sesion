package .vscode.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        // Добавление людей familyTree.addPerson("Иван", 1980);
        familyTree.addPerson("Мария", 1982);
        familyTree.addPerson("Сергей", 2005);
        familyTree.addPerson("Анна", 2008);

        // Установка родительских связей Person ivan = familyTree.findPersonByName("Иван");
        Person maria = familyTree.findPersonByName("Мария");
        Person sergey = familyTree.findPersonByName("Сергей");
        Person anna = familyTree.findPersonByName("Анна");

        sergey.setFather(ivan);
        sergey.setMother(maria);
        anna.setFather(ivan);
        anna.setMother(maria);

        // Получение детей System.out.println("Дети Ивана: ");
        for (Person child : familyTree.getChildren("Иван")) {
            System.out.println(child.getName());
        }

        // Получение братьев и сестер System.out.println("Братья и сестры Сергея: ");
        for (Person sibling : familyTree.getSiblings("Сергей")) {
            System.out.println(sibling.getName());
        }
    }
}

