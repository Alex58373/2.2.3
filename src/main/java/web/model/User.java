package web.model;

public class User {
    private int id;
    private String name;
    private  int age;
    private String gender;
    private String work;


    public User(int id, String name, int age, String gender, String work) {
        this.id = id;
        this.name = name;
       this.age = age;
       this.gender = gender;
       this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
