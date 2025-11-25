package buslogic.app.models;

import java.util.ArrayList;
import java.util.Map;

public class LineRouteData {
    public Map<Integer, Double> latitude;
    public String lineNumber;
    public int lineRouteVersion = 0;
    public ArrayList<String> line_route;
    public Map<Integer, Double> longitude;
    public String msg;
    public Boolean success;
}
