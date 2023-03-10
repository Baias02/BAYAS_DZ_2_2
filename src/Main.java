public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("Asan"),
                createObject("Kaigy"),
                createObject("Akylai")};
        for (Printable p: printables) {
            p.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Asan":
                Asan asan = new Asan("Asan",22,"Akylai","Kaigy");
            return asan ;
            case "Kaigy":
            Kaigy kaigy = new Kaigy("Kaigy",21,"money","18+");
            return kaigy ;
            case "Akylai":
            Akylai akylai = new Akylai("Akylai",19,"vals","opera");
            return akylai;

        }
        return null;

    }
}