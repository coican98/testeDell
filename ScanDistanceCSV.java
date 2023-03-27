import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ScanDistanceCSV {
    public ScanDistanceCSV(String deliverFrom, String deliverTo){
        // LER ARQUIVO CSV DE DISTANCIA ENTRE CIDADES E SEPARAR AS COLUNAS E LINHAS EM VARIAVEIS
        Scanner scan;
        int distance = 0;
        {
            try {
                scan = new Scanner(new File("D:/Projetos/DesafioDell/DNIT-Distancias.csv"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        String line = "";
        String splitBy = ";";
        scan.useDelimiter(splitBy);
        String resp = "";

        //MAPEAR A CIDADE DE DESTINO
        String cityMapping = scan.nextLine();
        String[] destinyMap = cityMapping.split(splitBy);
        int destinyIndex = Arrays.asList(destinyMap).indexOf(deliverTo);
//        int destinyIndex = new String(Arrays.toString(destinyMap)).indexOf(deliverTo);

        //CHECAR DISTANCIA CONFORME DESTINO
        while(scan.hasNextLine()){
            line = scan.nextLine();
            String[] city = line.split(splitBy);
            String tent = city[0];
            if(tent.startsWith(deliverFrom)){
//                System.out.println(line);
//                System.out.println(city[5]);
                 resp = city[destinyIndex].toString();
            }
        }
        scan.close();
        System.out.println("de: " + deliverFrom + " até " + deliverTo + " a distância total é de " + resp + "KM");
    }
}
