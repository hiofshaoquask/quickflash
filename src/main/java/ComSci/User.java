package ComSci;

import java.util.ArrayList;

public abstract class User {
    static private int userCount = 0;
    static private ArrayList<Set> totalSet = new ArrayList<Set>();
    protected String m_name;

    public User() {
        userCount++;
    }
}