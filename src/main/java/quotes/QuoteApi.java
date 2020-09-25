package quotes;

import com.google.gson.JsonObject;

public class QuoteApi extends Quotes{

    String starWarsQuote;

    public QuoteApi (String author, String text, String starWarsQuote) {
        super(author, text);

        this.starWarsQuote = starWarsQuote;

    }

    public String toString(){
        return String.format("Quote: %s ", starWarsQuote);
    }



}
