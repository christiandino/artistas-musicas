package br.com.christian.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {

    private static final String CHAVE = System.getenv("OPENAI_APIKEY");
    public static String obterResumo(String texto) {
        // The client gets the API key from the environment variable `GOOGLE_API_KEY`.
        Client client = Client.builder().apiKey(CHAVE).build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        "Apenas traga uma informação remusica sobre o artista: " + texto,
                        null);

        return response.text();
    }

}
