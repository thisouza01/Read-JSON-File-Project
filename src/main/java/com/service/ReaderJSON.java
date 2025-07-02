package main.java.com.service;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderJSON {

    public static void main(String[] args){
        try {
            // lê o conteúdo do arquivo
            String filePath = "C:\\Read-JSON-File-Project\\src\\customers.json";
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            // cria um JSONObject
            JSONObject jsonObject = new JSONObject(jsonString);

            // acessa os dados
            JSONArray jsonArray = jsonObject.getJSONArray("customer");
            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject object = jsonArray.getJSONObject(i);
                System.out.println("Customer: " + object.toString());
            }

        } catch (IOException e){
            System.err.println("Erro ao ler o JSON: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("Erro ao parsear o JSON: " + e.getMessage());
        }
    }


}
