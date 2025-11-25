package buslogic.app.models;

import java.io.Serializable;
import java.util.Objects;

public class StationLine implements Serializable {
    private String activeColor;
    private String inactiveColor;
    private boolean isActive;
    private String name;

    public StationLine(String str, boolean z9) {
        this.name = str;
        this.isActive = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.name, ((StationLine) obj).name);
    }

    public String getActiveColor() {
        return this.activeColor;
    }

    public String getInactiveColor() {
        return this.inactiveColor;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }

    public void setActiveColor(String str) {
        this.activeColor = str;
    }

    public void setInactiveColor(String str) {
        this.inactiveColor = str;
    }

    public void setIsActive(boolean z9) {
        this.isActive = z9;
    }

    public void setName(String str) {
        this.name = str;
    }

    public StationLine(String str, boolean z9, String str2, String str3) {
        this.name = str;
        this.isActive = z9;
        this.activeColor = str2;
        this.inactiveColor = str3;
    }
}
