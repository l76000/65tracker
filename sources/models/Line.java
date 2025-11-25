package buslogic.app.models;

import java.util.ArrayList;
import java.util.Map;

public class Line {
    public String line_number;
    public ArrayList<ArrayList<Double>> line_route;
    public String line_title;
    public Map<String, ArrayList<Object>> stations;
}
