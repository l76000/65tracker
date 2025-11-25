package buslogic.app.database.entity;

import androidx.room.p;
import androidx.room.v;

@p
@v
public class StationsFtsEntity {
    private int stationId;
    private String stationName;
    private String stationNameLatin;

    public StationsFtsEntity(int i10, String str, String str2) {
        this.stationId = i10;
        this.stationName = str;
        this.stationNameLatin = str2;
    }

    public int getStationId() {
        return this.stationId;
    }

    public String getStationName() {
        return this.stationName;
    }

    public String getStationNameLatin() {
        return this.stationNameLatin;
    }
}
