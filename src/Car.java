import java.util.Scanner;

public class Car {
    public String modelo;
    public int velocidade;
    public int aceleracao;
    public int marcha;

    public static void main() {
        Scanner carro = new Scanner(System.in);

        System.out.printf("Qual o modelo do seu carro?");
        String modelo = carro.next();

        Boolean OnFf = false;
        ligar(OnFf);
        if (OnFf == true) {
            int marcha = 0;
            int velocidade;
            int aceleracao = 0;

            int newMarcha = marchUpDown(marcha);
            int newAceleracao = acelerar(aceleracao);
            for (velocidade = 0; velocidade == newAceleracao; velocidade++) {
                System.out.println(velocidade);
            }

        }
    }

    public static Boolean ligar(Boolean OnFf) {
        Scanner liDes = new Scanner(System.in);

        System.out.print("Deseja ligar seu carro? S/n");
        String resp = liDes.next();

        if (resp == "S") {
            OnFf = true;
        }
        liDes.close();
        return OnFf;
    }

    public static int marchUpDown(int marcha) {
        Scanner march = new Scanner(System.in);
        System.out.println("Quer aumentar a marcha ou diminuir? Aumentar / Diminuir / Manter");
        String resp = march.next();
        if (resp == "A") {
            switch (marcha) {
                case 0: // neutra
                    marcha += 1;
                    break;
                case 1:
                    marcha += 1;
                    break;
                case 2:
                    marcha += 1;
                    break;
                case 3:
                    marcha += 1;
                    break;
                case 4:
                    marcha += 1;
                    break;
                case 5:
                    marcha += 1;
                    break;
            }
        }
        if (resp == "Diminuir") {
            switch (marcha) {
                case 5: // neutra
                    marcha -= 1;
                    break;
                case 4:
                    marcha -= 1;
                    break;
                case 3:
                    marcha -= 1;
                    break;
                case 2:
                    marcha -= 1;
                    break;
                case 1:
                    marcha -= 1;
                    break;
                case 0:
                    marcha -= 1;
                    break;
            }
        } else {
            marcha *= 1;
        }
        march.close();
        return marcha;
    }

    public static int acelerar(int aceleracao) {
        Scanner aclr = new Scanner(System.in);
        System.out.println("Quer acelerar o carro? S/n");
        String resp = aclr.next();

        if (resp == "S") {
            System.out.println("Quanto quer acelerar? Max.: 220Km/h");
            int aceleracaoUp = aclr.nextInt();
            aceleracao = (aceleracao + aceleracaoUp);
        } else {
            aceleracao *= 1;
        }

        aclr.close();
        return aceleracao;
    }
}
