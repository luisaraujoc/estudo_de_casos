import java.lang.reflect.Constructor;
import java.util.Scanner;

public class TV {
    public int polegadas;
    public int volume;
    public String marca;
    public int voltagem;
    public int canal;
    public int consumo;
    public Boolean OnFf = false;

    public TV(int polegadas, int volume, String marca, int voltagem, int canal, int consumo) {
        this.polegadas = polegadas;
        this.volume = volume;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
        this.consumo = consumo;

    }

    public static void main() {
        Scanner Televisao = new Scanner(System.in);
        Bolean OnFf = false;
        int volume;
        int canal;

        System.out.println("Qual a marca da sua TV?");
        String marca = Televisao.next();
        // polegadas
        System.out.println("Quantas polegadas tem sua TV?\n");
        int polegadas = Televisao.nextInt();
        System.out.println("Qual a voltagem da TV?\n");
        int voltagem = Televisao.nextInt();

        int consumo = polegadas * voltagem;

        // ligar ou delisgar
        ligar(OnFf);
        if (OnFf==ture){
            volume = 5;
            canal = 1;
        }
        //aumentar ou diminuir volume
        volUp(volume);

        // mudar de canal
        canalUp(canal);

        // TV = new TV();
    }

    public void ligar(Bolean OnFf) {
        if(OnFf==false){
            Scanner liDes = new Scanner(System.in);
            System.out.println("deseja ligar a TV? S/n");
            String answer = liDes.next();
            if(answer=="S"){
                OnFf = true;
                System.out.println("Consumo da sua TV é de "+consumo);
            }
        }else{
            System.out.println("deseja desligar a TV? S/n");
            String answer = liDes.next();
        }

        liDes.close();
        return OnFf;
    }

    public static int volUp(int volume) {
        Scanner vol = new Scanner(System.in);
        
        System.out.println("Quer aumentar o volume? S/n");
        String answer = vol.next();
        if(answer=="S"){
            System.out.println("Quanto quer aumentar?");
            int volSum = vol.next();
            volume+=volSum;
            if(volume>10){
                volume=10;
            }
        }else{
            System.out.println("Quer diminuir o volume? S/n");
            String answer1 = vol.next();
            if(answer1=="S"){
                System.out.println("Quanto quer diminuir?");
                int volSub = vol.nextInt();
                volume -= volSub;
                if(volume<0){
                    volume =0;
                }
            }else{
                volume *=1;
            }

        }
        vol.close();
        return volume;
    }

    public static int canalUp(int canal) {
        Scanner channel = new Scanner(System.in);
        
        System.out.println("Que canal quer assistir?");
        canal = channel.nextInt();
        
        channel.close();
        return canal;
        
    }


}
