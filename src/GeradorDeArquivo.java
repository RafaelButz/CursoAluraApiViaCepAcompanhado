import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escreve = new FileWriter(endereco.cep() + ".json");
        escreve.write(gson.toJson(endereco));
        escreve.close();

    }
}
