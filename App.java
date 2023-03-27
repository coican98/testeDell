import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //VARIÁVEIS DE ORIGEM, DESTINO E PARADA
        String deliveryFrom, deliveryTo, deliveryWayPoint = ""; //origem, destino e parada

        // DEFINIR OS PORTES DE CAMINHÃO, LIMITAÇÃO DE PESO E PREÇO POR KM
        Truck smallTruck = new Truck(1000, 4.87);
        Truck mediumTruck = new Truck(4000, 11.92);
        Truck largeTruck = new Truck(10000, 27.44);

        // DEFINIR OS PRODUTOS A SEREM TRANSPORTADOS E O PESO UNITÁRIO
        Item smartPhone = new Item("Celular", 0.5);
        Item refrigerator = new Item("Geladeira", 60.0);
        Item freezer = new Item("Freezer", 100.0);
        Item chair = new Item("Cadeira", 5.0);
        Item lamp = new Item("Luminária", 0.8);
        Item washingMachine = new Item("Lavadora de Roupa", 120.0);



        Scanner userInput = new Scanner(System.in);

        //SELECIONAR OPÇÃO NO MENU (1=Consulta Trechos X Modalidade / 2=Cadastrar Transporte / 3 = Dados estatísticos / 4 = Fechar programa)
        System.out.println("Selecione a opção de operação (1=Consulta Trechos X Modalidade / 2=Cadastrar Transporte / 3 = Dados estatísticos / 4 = Fechar programa):");
        int menuOperation = userInput.nextInt();

        switch(menuOperation){
            case 1:
                System.out.println("Digite o nome da cidade de ORIGEM (Apenas Capitais):");
                deliveryFrom = userInput.next().toUpperCase();
                System.out.println("Digite o nome da cidade de DESTINO (Apenas Capitais):");
                deliveryTo = userInput.next().toUpperCase();
                ScanDistanceCSV distance = new ScanDistanceCSV(deliveryFrom, deliveryTo);
                break;
            case 2:
                //PERGUNTAR ORIGEM (EX: SAINDO DE SAO PAULO)
                System.out.println("Informe a cidade de origem:");
                //PERGUNTAR QUAIS ITENS, QUANTIDADE E DESTINO (EX: CELULAR, 50, RECIFE / CELULAR, 30, SALVADOR / CADEIRA, 2000, SALVADOR)
                System.out.println("");
                //RES: 1 CAMINHÃO PEQUENO DE SAO PAULO COM DESTINO A SALVADOR COM O(S) PRODUTO(S) x e y E DEPOIS RECIFE COM O(S) PRODUTO(S) z. DISTÂNCIA TOTAL d, CUSTO TOTAL R$r E CUSTO UNITÁRIO R$u

                // CRIAR AS VIAGENS BASEADA ORIGEM, DESTINO E PARADA
                double distanceTrip1, distanceTrip2;
                if(deliveryWayPoint != null){
                    distanceTrip1 = 0.0;
                }
                break;
            case 3:
                // FUNÇÃO DE RELATÓRIO DOS TRANSPORTES CADASTRADOS ATÉ AGORA
                break;
            case 4:
                // FUNÇÃO PARA ENCERRAR O PROGRAMA
                System.exit(0);
                break;
            default:

        }
        // CRIAR FUNÇÃO DE CONSULTAR TRECHO E INFORMAR DISTANCIA E PREÇO DE TRANSPORTE

        // FUNÇÃO DE CADASTRAR TRANSPORTE INCLUINDO NOME DA EMPRESA + QUANTIDADE DE PARADAS + A FORMA MAIS BARATA DE TRANSPORTAR X ITENS + INFORMAR O CUSTO TOTAL E CUSTO MÉDIO UNITÁRIO

    }
}
