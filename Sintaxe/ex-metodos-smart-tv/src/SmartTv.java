public class SmartTv {
     boolean ligada = false;
     int canal = 0;
     int volume = 25;

     public void ligar(){
         ligada = true;
     }

     public void desligar(){
         ligada = false;
     }
     public void trocarCanal(){
         canal++;
     }

     public void aumentarVolume(){
         volume++;
     }

     public void abaixarVolume(){
         volume--;
     }

    public void mudarCanal(int canal) {
        canal = canal;
     }
}
