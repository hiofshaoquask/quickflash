package ComSci;

import java.io.Serializable;
import java.util.HashMap;

public class Set implements Serializable{
    static final long serialVersionUID = 1L;

    private HashMap<String, String> m_flashCards = new HashMap<String, String>();
    private String m_name;
    private String m_subject; 
    private String m_category;
    private String m_creator;
    
    public Set(String name, String subject, String creator, String category) 
    {
        this.m_name = name;
        this.m_subject = subject;
        this.m_creator = creator;
        this.m_category = category;
    }
}
