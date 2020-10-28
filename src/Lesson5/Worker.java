package Lesson5;

public class Worker {
    private String Surname;
    private String Name;
    private String MiddleName;
    private String Position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Worker(String Surname, String Name, String MiddleName, String Position, String email, String telephone, int salary, int age){
        this.Surname    = Surname;
        this.Name       = Name;
        this.MiddleName = MiddleName;
        this.Position   = Position;
        this.email      = email;
        this.telephone  = telephone;
        this.salary     = salary;
        this.age        = age;

    }

    public void info(){
        System.out.println("Фамилия: " + Surname + "Имя: " + Name + "Отчество: " + MiddleName + "Должность: " + Position + "Почта: " + email + "Телефон: " + telephone + "Зарплата: " + salary + "Возраст: " + age);
    }

    public static void main(String[] args) {
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Petrov", "Alex", "Vyacheslavovich", "jordge", "alex@mail.ru", "88005553535", 100_000, 22);
        workersArray[1] = new Worker("Stepina", "Irina", "Vitalievna", "chirlider", "Step@mail.ru", "88005553535", 100_000, 20);
        workersArray[2] = new Worker("Ivanov", "Ivan", "Ivanovich", "rower", "Ivanov@mail.ru", "88005553535", 50_000, 45);
        workersArray[3] = new Worker("Girin", "Alex", "Brotherovich", "engineer", "alex228@mail.ru", "88005553535", 120_000, 25);
        workersArray[4] = new Worker("Novikov", "Ivan", "Nikolaevich", "chetkiy", "hetklif@mail.ru", "88005553535", 9_000_000, 22);

        for (int i = 0; i < workersArray.length ; i++) {
            if(workersArray[i].age > 40){
                System.out.println("Фамилия: " + workersArray[i].Surname + " Имя: " + workersArray[i].Name + " Отчество: " + workersArray[i].MiddleName + " Должность: " + workersArray[i].Position + " Почта: " + workersArray[i].email + " Телефон: " + workersArray[i].telephone + " Зарплата: " + workersArray[i].salary + " Возраст: " + workersArray[i].age);
            }
        }
    }

}
