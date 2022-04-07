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

    public TV(int polegadas, int volume, String marca, int voltagem, int canal, int consumo){
        this.polegadas = polegadas ;
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

        int consumo = polegadas*voltagem;

        
        
        //ligar ou delisgar
        if(OnFf==false){
            System.out.println("deseja ligar a TV? S/n");
            String answer = Televisao.next();
            if(answer=="S"){
                OnFf = true;
                volume = 5;
                canal = 1;
            }
        }else{
            System.out.println("deseja desligar a TV? S/n");
            String answer = Televisao.next();
        }



        TV = new TV();
    }


}
