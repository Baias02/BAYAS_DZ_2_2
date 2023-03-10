public class Kaigy extends People{
    private String ability;
    private String curse;

    public Kaigy(String name, int age, String ability, String curse) {
        super(name, age);
        this.ability = ability;
        this.curse = curse;
    }

    public String getAbility() {
        return ability;
    }

    public String getCurse() {
        return curse;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nAbility: " + getAbility() +
                           "\nCurse: " + getCurse());

    }
}
