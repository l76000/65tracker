package buslogic.app.models;

import z1.a;

public class AnnouncementListItem {
    private final a announcement;
    private final String color;
    private final String type;

    public AnnouncementListItem(a aVar, String str, String str2) {
        this.announcement = aVar;
        this.color = str;
        this.type = str2;
    }

    public a getAnnouncement() {
        return this.announcement;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }
}
