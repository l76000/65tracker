package buslogic.app.api.allsecure_tokenization;

public class TokenizationApiException extends Exception {
    public final String O;

    public enum a {
        invalid_public_integration_key,
        invalid_token_key,
        invalid_response
    }

    public TokenizationApiException(a aVar, String str) {
        super(aVar + " " + str);
        this.O = str;
    }
}
