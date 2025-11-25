package buslogic.app.database.entity;

import androidx.room.i0;
import androidx.room.p;
import androidx.room.z;
import buslogic.app.database.model.Station;
import java.util.Objects;

@p
public class StationsEntity implements Station {
    protected String busColor;
    protected int cityId;
    @z
    protected double distance;
    protected int favourite;
    @i0
    protected int id;
    protected String lines;
    protected int pinned;
    protected String slugs;
    protected int stationId;
    protected String stationIdOrg;
    protected double stationLatitude;
    protected double stationLongitude;
    protected String stationName;
    protected String stationNameLatin;
    protected String tramColor;
    protected String trolleybusColor;

    public StationsEntity() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(Integer.valueOf(this.stationId), Integer.valueOf(((StationsEntity) obj).stationId));
    }

    public String getBusColor() {
        return this.busColor;
    }

    public int getCityId() {
        return this.cityId;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getFavourite() {
        return this.favourite;
    }

    public int getId() {
        return this.id;
    }

    public String getLines() {
        return this.lines;
    }

    public int getPinned() {
        return this.pinned;
    }

    public String getSlugs() {
        return this.slugs;
    }

    public int getStationId() {
        return this.stationId;
    }

    public String getStationIdOrg() {
        return this.stationIdOrg;
    }

    public double getStationLatitude() {
        return this.stationLatitude;
    }

    public double getStationLongitude() {
        return this.stationLongitude;
    }

    public String getStationName() {
        return this.stationName;
    }

    public String getStationNameLatin() {
        return this.stationNameLatin;
    }

    public String getTramColor() {
        return this.tramColor;
    }

    public String getTrolleybusColor() {
        return this.trolleybusColor;
    }

    public int hashCode() {
        return this.stationId;
    }

    public void setBusColor(String str) {
        this.busColor = str;
    }

    public void setCityId(int i10) {
        this.cityId = i10;
    }

    public void setDistance(double d10) {
        this.distance = d10;
    }

    public void setFavourite(int i10) {
        this.favourite = i10;
    }

    public void setId(int i10) {
        this.id = i10;
    }

    public void setLines(String str) {
        this.lines = str;
    }

    public void setPinned(int i10) {
        this.pinned = i10;
    }

    public void setSlugs(String str) {
        this.slugs = str;
    }

    public void setStationId(int i10) {
        this.stationId = i10;
    }

    public void setStationIdOrg(String str) {
        this.stationIdOrg = str;
    }

    public void setStationLatitude(double d10) {
        this.stationLatitude = d10;
    }

    public void setStationLongitude(double d10) {
        this.stationLongitude = d10;
    }

    public void setStationName(String str) {
        this.stationName = str;
    }

    public void setStationNameLatin(String str) {
        this.stationNameLatin = str;
    }

    public void setTramColor(String str) {
        this.tramColor = str;
    }

    public void setTrolleybusColor(String str) {
        this.trolleybusColor = str;
    }

    @z
    public StationsEntity(int i10, int i11, String str, String str2, String str3, int i12, double d10, double d11, int i13, String str4, int i14) {
        this.id = i10;
        this.stationId = i11;
        this.stationName = str;
        this.stationNameLatin = str2;
        this.slugs = str3;
        this.cityId = i12;
        this.stationLongitude = d10;
        this.stationLatitude = d11;
        this.favourite = i13;
        this.stationIdOrg = str4;
        this.pinned = i14;
    }

    public StationsEntity(Station station) {
        this.id = station.getId();
        this.stationId = station.getStationId();
        this.stationName = station.getStationName();
        this.stationNameLatin = station.getStationNameLatin();
        this.slugs = station.getSlugs();
        this.cityId = station.getCityId();
        this.stationLongitude = station.getStationLongitude();
        this.stationLatitude = station.getStationLatitude();
        this.favourite = station.getFavourite();
        this.stationIdOrg = station.getStationIdOrg();
        this.pinned = station.getPinned();
    }
}
