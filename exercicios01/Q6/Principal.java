public class Principal {
    public static void main(String[] args) {
        Calendario c1 = new Calendario(15, 5, 2023);
        Calendario c2 = new Calendario(29, 2, 2020);

        System.out.println("---data 1---");
        System.out.print("Data: ");
        c1.mostrarData();
        c1.anoBissexto();

        System.out.println("---data 2---");
        System.out.print("Data: ");
        c2.mostrarData();
        c2.anoBissexto();
    }
}
