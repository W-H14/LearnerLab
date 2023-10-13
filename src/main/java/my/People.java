package my;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList;


    public void add(Person person){
        personList.add(person);
    }
    public Person findByID(long Id){
        for (Person person : personList) {
            if(person.getId() == Id){
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person) {
        return personList.contains(person);
    }
    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.removeIf(person -> person.getId() == id);
    }

    public void removeAll() {
        personList.clear();
    }
    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
