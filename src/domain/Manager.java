package domain;
/** Содержит реализацию методов.*/
public class Manager extends Employee {
    /**Инициализирует
     * @param employees
     * @param name
     * @param jobTitle
     * @param level
     * @param dept */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**Инициализирует
     * @param employees */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**Инициализирует */
    public Manager() {
        super();
        employees = new Employee[10];
    }
    /**Инициализирует */
    private Employee[] employees;
    /**Вернуть переменную
     * @return s */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**Установить переменную
     * @param employees */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**Вернуть переменную
     * @return  employees*/
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
