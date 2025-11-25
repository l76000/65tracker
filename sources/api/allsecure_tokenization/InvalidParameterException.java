package buslogic.app.api.allsecure_tokenization;

public class InvalidParameterException extends Exception {
    public final c O;
    public final a P;
    public final b Q;
    public final b R;

    public enum a {
        empty,
        invalid_format
    }

    public enum b {
        empty,
        invalid_expiration_date,
        expired
    }

    public enum c {
        empty,
        invalid_length,
        invalid_luhn
    }

    public InvalidParameterException(c cVar, a aVar, b bVar, b bVar2) {
        super("Invalid card parameter");
        this.O = cVar;
        this.P = aVar;
        this.Q = bVar;
        this.R = bVar2;
    }
}
