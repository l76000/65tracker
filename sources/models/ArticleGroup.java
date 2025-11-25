package buslogic.app.models;

import android.content.Context;
import buslogic.app.api.model.Language;
import buslogic.app.helper.a;
import java.io.Serializable;
import java.util.List;

public class ArticleGroup implements Serializable {
    public String color1;
    public String color2;
    public String id;
    public String name;
    public List<Language> translated;

    public String getTranslatedName(Context context) {
        String a10 = a.a(context);
        List<Language> list = this.translated;
        if (list != null && !list.isEmpty()) {
            if (a10.equals("en")) {
                for (Language next : this.translated) {
                    if (next.getLang().equals("en")) {
                        return next.getValue();
                    }
                }
            } else {
                for (Language next2 : this.translated) {
                    if (next2.getLang().equals("sr")) {
                        return next2.getValue();
                    }
                }
            }
        }
        return this.name;
    }
}
