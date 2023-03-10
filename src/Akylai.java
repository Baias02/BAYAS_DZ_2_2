public class Akylai extends People{
    private String dance;
    private String singer;

    public Akylai(String name, int age, String dance, String singer) {
        super(name, age);
        this.dance = dance;
        this.singer = singer;
    }

    public String getDance() {
        return dance;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public void print() {
        System.out.println(getInfo()+ "\nDance: " + getDance() +
                            "\nSinger: " + getSinger());

    }
}
