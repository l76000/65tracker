package buslogic.app.database;

import app.ui.transport.arrivals.ArrivalsFragment;
import buslogic.app.database.entity.StationsEntity;
import buslogic.app.models.LineForStation;
import buslogic.app.models.Station;
import buslogic.app.utils.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class DataStationsGenerator {
    public static JSONArray arr;
    private static ArrayList<Station> stations;
    private final List<LineForStation> lines = new ArrayList();

    public static String convertStringsToLatin(String str) {
        String lowerCase = str.toLowerCase();
        char[] cArr = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 353, 263, 269, 273, 'x', 'y', 'z', 382, '1', '2', '3', '4', '5', '6', '7', '8', '9', '/', '-', 1072, 1073, 1074, 1075, 1076, 1077, 1106, 1078, 1079, 1080, 1112, 1082, 1083, 1084, 1085, 1086, 1087, 1088, 1089, 1090, 1091, 1092, 1093, 1094, 1095, 1096, 1115, 1095, 1114, 1113};
        String[] strArr = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "s", "c", "c", "dj", "x", "y", "z", "z", "1", c.f12513d, c.f12514e, c.f12515f, c.f12518i, c.f12519j, c.f12520k, c.f12521l, "9", "/", "-", "a", "b", "v", "g", "d", "e", "dj", "z", "z", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "c", "s", "c", "c", "nj", "lj"};
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < lowerCase.length(); i10++) {
            for (int i11 = 0; i11 < 73; i11++) {
                if (lowerCase.charAt(i10) == cArr[i11]) {
                    sb.append(strArr[i11]);
                }
            }
        }
        return sb.toString();
    }

    private String findBusColor() {
        Iterator<Station> it = stations.iterator();
        while (it.hasNext()) {
            Iterator<LineForStation> it2 = it.next().lines_for_station_additional_data.iterator();
            while (true) {
                if (it2.hasNext()) {
                    LineForStation next = it2.next();
                    if (next.getLine_type().equals("1")) {
                        return next.getLine_type_color_active();
                    }
                }
            }
        }
        return "";
    }

    public static List<StationsEntity> generateStations() {
        try {
            ArrayList arrayList = new ArrayList(arr.length());
            int i10 = 0;
            while (i10 < arr.length()) {
                int i11 = i10 + 1;
                JSONObject jSONObject = arr.getJSONObject(i10);
                JSONObject jSONObject2 = jSONObject.getJSONObject("coordinates");
                String string = jSONObject.getString("name");
                StationsEntity stationsEntity = new StationsEntity();
                stationsEntity.setStationId(jSONObject.getInt("id"));
                stationsEntity.setStationName(string);
                stationsEntity.setStationNameLatin(convertStringsToLatin(string));
                stationsEntity.setSlugs(jSONObject.getString("slugs"));
                stationsEntity.setCityId(jSONObject.getInt("city_id"));
                stationsEntity.setStationLatitude(jSONObject2.getDouble("latitude"));
                stationsEntity.setStationLongitude(jSONObject2.getDouble("longitude"));
                stationsEntity.setStationIdOrg(jSONObject.getString(ArrivalsFragment.Q1));
                stationsEntity.setFavourite(0);
                stationsEntity.setId(i11);
                arrayList.add(stationsEntity);
                i10 = i11;
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public void clearDataStation() {
        arr = new JSONArray();
    }

    public List<LineForStation> getLines() {
        return this.lines;
    }

    public ArrayList<StationsEntity> populateDatabase() {
        ArrayList<StationsEntity> arrayList = new ArrayList<>();
        if (stations != null) {
            String findBusColor = findBusColor();
            Iterator<Station> it = stations.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Station next = it.next();
                String replaceAll = next.name.replaceAll("\\s+", "");
                StationsEntity stationsEntity = new StationsEntity();
                stationsEntity.setStationId(next.id.intValue());
                String replace = next.name.replace("&amp;", "");
                next.name = replace;
                String replace2 = replace.replace("amp;", "");
                next.name = replace2;
                String replace3 = replace2.replace("quot;", "");
                next.name = replace3;
                stationsEntity.setStationName(replace3);
                stationsEntity.setStationNameLatin(convertStringsToLatin(replaceAll));
                stationsEntity.setSlugs(next.slugs);
                stationsEntity.setCityId(next.city_id.intValue());
                stationsEntity.setStationLatitude(next.coordinates.latitude.doubleValue());
                stationsEntity.setStationLongitude(next.coordinates.longitude.doubleValue());
                stationsEntity.setStationIdOrg(next.station_id);
                stationsEntity.setFavourite(0);
                stationsEntity.setId(i10);
                stationsEntity.setLines(c.e(next.lines_for_station_additional_data));
                List<LineForStation> list = next.lines_for_station_additional_data;
                if (list == null || list.isEmpty()) {
                    stationsEntity.setBusColor(findBusColor);
                } else {
                    for (LineForStation next2 : next.lines_for_station_additional_data) {
                        String line_type = next2.getLine_type();
                        line_type.getClass();
                        if (line_type.equals(c.f12513d)) {
                            stationsEntity.setTramColor(next2.getLine_type_color_active());
                        } else if (!line_type.equals(c.f12514e)) {
                            stationsEntity.setBusColor(findBusColor);
                        } else {
                            stationsEntity.setTrolleybusColor(next2.getLine_type_color_active());
                        }
                        if (!this.lines.contains(next2)) {
                            next2.setId(this.lines.size() + 1);
                            this.lines.add(next2);
                        }
                    }
                }
                i10++;
                arrayList.add(stationsEntity);
            }
        }
        return arrayList;
    }

    public void setDataStation(JSONArray jSONArray) {
        arr = jSONArray;
    }

    public void setStationsData(ArrayList<Station> arrayList) {
        stations = arrayList;
    }
}
