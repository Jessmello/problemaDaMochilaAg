package problemadamochilaag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jess
 */
public class main {

    public static void main(String[] args) {
        String arquivo = "C:\\Users\\Jess\\Desktop\\problemaDaMochilaAG\\arquivoTeste.txt";
        BufferedReader br = null;
        String linha = "";
        List <Item> itens = new ArrayList<Item>();
        try {
            br = new BufferedReader(new FileReader(arquivo));
            int cont = 0;
            int j;
            while ((linha = br.readLine()) != null) {
                j=0;
                String[] infoItem = linha.split(";");
                Item i = new Item();
                i.setId(Integer.parseInt(infoItem[j++]));
                i.setNome(infoItem[j++]);
                i.setPeso(Float.parseFloat(infoItem[j++]));
                i.setPreco(Float.parseFloat(infoItem[j++]));
                i.setVolume(Float.parseFloat(infoItem[j++]));
                cont++;
                itens.add(i);
            }
            Item[] itemsPossiveis = new Item[cont];
            for (Item item : itens) {
                itemsPossiveis[--cont] = item;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
