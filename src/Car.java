import java.util.Scanner;

public class Car {
    // caracteristicas
    public String model;
    public int velocity = 0;
    public Boolean aceleration;
    public int march;

    // comportamentos
    public Boolean OnOff = false; // ligado ou não!
    public int Direcao = 0; // 0 = frente; 1 = esquerda; 2 = direita
    public int passMarch = 0;

 
    public static void main(String[] args) {
        Scanner carro = new Scanner(System.in);


        System.out.println("Informe o modelo do carro:\n");
        String modelo = carro.next(); // model


        // OnOff
        Boolean ligar = false;
        if(ligar == false){
            System.out.println("Deseja ligar o carro? S/N\n");
            String resposta = carro.next();
            if(resposta == "S"){
                ligar = true;
            }else{
                ligar = false;
            }
        }

        // velocity and aceleration
        Boolean speedup = false;
        int speed;
        if(speedup==false){
            System.out.println("Seu carro vai até 200Km/h, você quer acelerar? S/n");
            String resposta = carro.next();
            if(resposta=="S"){
                speedup = true;
                System.out.println("Quanto quer acelerar? 0 a 200");
                speed = carro.nextInt();
            }else{
                speedup = false;
                speed = 0;
            }            
        }

        // Direcao
        int direct=0;
        if(direct==0){
            System.out.println("Para virar digite um número:\n0 = Continuar reto;\n1 - Virar para esquerda;\n2 - Virar para direita.");
            direct = carro.nextInt();
            switch(direct){
                case 0:
                direct = 0;
                break;
                case 1:
                direct = 1;
                break;
                case 2:
                direct = 2;
                break;
            }
        }
        int march = 0;
        int marchUp;
        if(march != -1){
            System.out.println("Para passar marcha, digite 1. Para se manter na atual, digite 0. Para descer a marcha, digite -1.\nMarcha atual:"+march+"\n");
            marchUp = carro.nextInt();
            switch(marchUp){
                case -1:
                march-=1;
                break;
                case 0:
                march*=1;
                break;
                case 1:
                march+=1;
                break;
            }
        }
        
        Car Car = new Car(modelo, speed, speedup, march, ligar, direct, marchUp);
        carro.close();
    }

    public Car(String model, int velocity, Boolean aceleration, int march, Boolean onOff, int direcao, int passMarch) {
        this.model = model;
        this.velocity = velocity;
        this.aceleration = aceleration;
        this.march = march;
        this.OnOff = onOff;
        Direcao = direcao;
        this.passMarch = passMarch;
    }
}
