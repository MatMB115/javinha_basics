public class Main {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        System.out.println(tv.canal);
        System.out.println(tv.ligada);
        System.out.println(tv.volume);

        tv.ligar();
        tv.abaixarVolume();
        tv.trocarCanal();
        System.out.println(tv.canal);
        System.out.println(tv.ligada);
        System.out.println(tv.volume);

        tv.desligar();
        tv.aumentarVolume();
        tv.trocarCanal();
        System.out.println(tv.canal);
        System.out.println(tv.ligada);
        System.out.println(tv.volume);

        tv.mudarCanal(3);
        System.out.println(tv.canal);
    }
}