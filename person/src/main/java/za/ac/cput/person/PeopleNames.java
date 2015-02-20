package za.ac.cput.person;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by student on 2015/02/18.
 */
public class PeopleNames {
    public List people;

    public PeopleNames()
    {
        people = new List();
    }
    public void addNickName(String nick_name)
    {
        people.add(nick_name);
    }
    public void removePerson(String nick_name)
    {
        people.remove(nick_name);
    }

}
