package buslogic.app.models;

import java.util.Objects;

public class LineSelection {
    private final String garageNumber;
    private final String lineNumber;

    public LineSelection(String str, String str2) {
        this.lineNumber = str;
        this.garageNumber = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineSelection lineSelection = (LineSelection) obj;
        if (!Objects.equals(this.lineNumber, lineSelection.lineNumber)) {
            return false;
        }
        return Objects.equals(this.garageNumber, lineSelection.garageNumber);
    }

    public String getGarageNumber() {
        return this.garageNumber;
    }

    public String getLineNumber() {
        return this.lineNumber;
    }

    public int hashCode() {
        int i10;
        String str = this.lineNumber;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.garageNumber;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
