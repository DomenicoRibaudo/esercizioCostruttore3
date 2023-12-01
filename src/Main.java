public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(2000, "AB 123 CD", "Audi", "a4");

        System.out.println("Cilindrata = " + auto1.getCilindrata());
        System.out.println("Targa = " + auto1.getTarga());
        System.out.println("Marca = " + auto1.getMarca());
        System.out.println("Modello = " + auto1.getModello());
        System.out.println("AUTO1 = " + auto1);
    }
}
