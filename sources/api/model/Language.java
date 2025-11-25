package buslogic.app.api.model;

import java.io.Serializable;

public class Language implements Serializable {
    private final String lang;
    private final String value;

    public Language(String str, String str2) {
        this.value = str;
        this.lang = str2;
    }

    public String getLang() {
        return this.lang;
    }

    public String getValue() {
        return this.value;
    }
}
