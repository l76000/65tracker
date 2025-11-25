package buslogic.app.models;

import android.content.Context;

public class CardPriceGroup {
    public String amount;
    public String cls;
    public Boolean isSelected;
    public String name;
    public String value;

    public String getTranslatedName(Context context) {
        return this.name;
    }
}
