import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generateClient();
        Queue<Person> attr = new LinkedList<>(people);

        while (!attr.isEmpty()) {
            Person person = attr.poll();

            int quantityTickets = person.getQuantityTickets();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTickets(quantityTickets);
            System.out.printf("\n%s %s прокатился на аттракционе, теперь у него осталось %d билетов", person.getName(), person.getSurName(), quantityTickets);
            if (quantityTickets > 0) {
                attr.offer(person);
            }

        }
    }

    private static List<Person> generateClient() {
        return List.of(
                new Person("Tim", "Sh", 2),
                new Person("T", "Sha", 3),
                new Person("M", "S", 1),
                new Person("Ti", "Hq", 4),
                new Person("Timur", "Sa", 2));


    }
}