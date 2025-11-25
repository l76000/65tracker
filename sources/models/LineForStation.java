package buslogic.app.models;

import androidx.room.i0;
import androidx.room.p;
import java.util.Objects;

@p
public class LineForStation {
    @i0
    protected int id;
    protected String line_number_for_display;
    protected String line_type;
    protected String line_type_color_active;
    protected String line_type_color_inactive;
    protected String vehicle_group;

    public LineForStation(int i10, String str, String str2, String str3, String str4, String str5) {
        this.id = i10;
        this.line_number_for_display = str;
        this.vehicle_group = str2;
        this.line_type = str3;
        this.line_type_color_active = str4;
        this.line_type_color_inactive = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.line_number_for_display, ((LineForStation) obj).line_number_for_display);
    }

    public int getId() {
        return this.id;
    }

    public String getLine_number_for_display() {
        return this.line_number_for_display;
    }

    public String getLine_type() {
        return this.line_type;
    }

    public String getLine_type_color_active() {
        return this.line_type_color_active;
    }

    public String getLine_type_color_inactive() {
        return this.line_type_color_inactive;
    }

    public String getVehicle_group() {
        return this.vehicle_group;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.line_number_for_display});
    }

    public void setId(int i10) {
        this.id = i10;
    }

    public void setLine_number_for_display(String str) {
        this.line_number_for_display = str;
    }

    public void setLine_type(String str) {
        this.line_type = str;
    }

    public void setLine_type_color_active(String str) {
        this.line_type_color_active = str;
    }

    public void setLine_type_color_inactive(String str) {
        this.line_type_color_inactive = str;
    }

    public void setVehicle_group(String str) {
        this.vehicle_group = str;
    }

    public LineForStation() {
    }
}
