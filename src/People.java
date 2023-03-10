public abstract class People implements Printable {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getInfo(){
        return "\nName: " + getName() +
                "\nAge: " + getAge();
    }

}
