package buslogic.app.models;

import android.content.Context;
import buslogic.app.api.model.Language;
import buslogic.app.helper.a;
import java.io.Serializable;
import java.util.List;

public class Article implements Serializable {
    public String article_group_id;
    public Boolean isSelected = Boolean.FALSE;
    public String line_number;
    public String name;
    public String name_for_display_1;
    public String name_for_display_2;
    public String plastic_article;
    public String price;
    public String price_tables_index_id;
    public String station_uid;
    public String telephone_number;
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
