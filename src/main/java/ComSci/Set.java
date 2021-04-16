package ComSci;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Set implements Serializable{
    static final long serialVersionUID = 1L;

    private HashMap<String, String> m_flashCards = new HashMap<String, String>();
    public String m_name;
    public String m_subject; 
    public String m_category;
    public final String m_creator;
    
    public Set(String name, String subject, String creator, String category) 
    {
        m_name = name;
        m_subject = subject;
        m_creator = creator;
        m_category = category;
    }

    public void addFlash(String key, String value)
    {
        m_flashCards.put(key, value);
    }

    public void rmvFlash(String key)
    {
        m_flashCards.remove(key);
    }

    public ArrayList<Map.Entry<String, String>> searchCard(String word) 
    {
        ArrayList<Map.Entry<String, String>> matchedSets = new ArrayList<Map.Entry<String, String>>();
        for (Map.Entry<String, String> entry : m_flashCards.entrySet()) {
           if (entry.getKey().contains(word) || entry.getValue().contains(word)) {
               matchedSets.add(entry);
           }
        }
        return matchedSets;

    }
}
