public class Asan extends People{
    private String love;
    private String friend;

    public Asan(String name, int age, String love, String friend) {
        super(name, age);
        this.love = love;
        this.friend = friend;
    }

    public String getLove() {
        return love;
    }

    public String getFriend() {
        return friend;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nLove: " + getLove() +
                           "\nFriend: " + getFriend());

    }
}
