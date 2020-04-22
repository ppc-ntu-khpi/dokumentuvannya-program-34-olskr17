package domain;
/** Содержит реализацию методов.*/
public class Artist extends Employee {
    /** Инициализирует
     * @param skiils.
     * @param name
     * @param jobTitle
     * @param level
     * @param dept*/
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /** Инициализирует
     * @param skiils.*/
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /** Вывод значений
     * @return String*/
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    
    private String[] skiils;
    
    /** Получить значение
     * @return s*/
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /** Установить новый навык
     * @param skills.*/
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /** Получить лист с навыками
     * @return skiils*/
    public String[] getSkillsLSist() {
        return skiils;
    }
}
