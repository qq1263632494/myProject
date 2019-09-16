public class User {
    private int id;
    private String name;
    private String sex;
    private int age;
    public User(){
        super();
    }
    public User(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString(){
        return "User {id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "}";
    }
}
