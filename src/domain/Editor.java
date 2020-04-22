package domain;
/** Содержит реализацию методов.*/
public class Editor extends Artist {
    /** Инициализирует
     * @param electronicEditing.
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept*/
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /** Инициализирует
     * @param electronicEditing.
     * @param skiils*/
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /** Инициализирует
     * @param electronicEditing.*/
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /** Инициализирует.*/
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /** Вывод значений
     * @return s*/
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /** Получить значение
     * @return .*/
    public boolean getPreferences() {
        return electronicEditing;
    }
    /** Установить предпочтения
     * @param electronic.*/
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
