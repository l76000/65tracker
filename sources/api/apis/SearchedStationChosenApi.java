package buslogic.app.api.apis;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import buslogic.app.database.model.Station;
import buslogic.app.ui.MainActivity;
import buslogic.app.utils.c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;
import y1.a;
import z1.b;

public class SearchedStationChosenApi {
    /* access modifiers changed from: private */
    public String companyApiKey = "1688dc355af72ef09287";
    private String companyUrl = "https://online.bgnaplata.rs";
    private MainActivity mainActivity;
    private b stationsEntity;

    public SearchedStationChosenApi(String str, String str2, Station station, MainActivity mainActivity2) {
        b bVar = new b();
        this.stationsEntity = bVar;
        this.mainActivity = mainActivity2;
        bVar.f32092a = station.getStationId();
        this.stationsEntity.f32094c = station.getStationName();
        this.stationsEntity.f32096e = station.getStationLatitude();
        this.stationsEntity.f32097f = station.getStationLongitude();
        this.stationsEntity.setFavourite(station.getFavourite());
        this.stationsEntity.f32095d = c.l(station.getLines());
        getAnnouncements(str2, station.getStationId());
    }

    private void getAnnouncements(final String str, final int i10) {
        new AsyncTask<String, Integer, String>() {
            protected static final int REQUEST_TIMEOUT = 3000;
            protected static final int RESPONSE_TIMEOUT = 5000;
            private final String API_LINK = "/publicapi/v1/announcement/announcement.php";

            public void onPreExecute() {
                super.onPreExecute();
            }

            public String doInBackground(String... strArr) {
                InputStream inputStream;
                new JSONArray();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, RESPONSE_TIMEOUT);
                    DefaultHttpClient a10 = a2.c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new BasicNameValuePair("station_uid", "" + i10));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    URI uri = new URI(str + "/publicapi/v1/announcement/announcement.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", SearchedStationChosenApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        Header firstHeader = execute.getFirstHeader("Content-Encoding");
                        if (firstHeader == null || !firstHeader.getValue().equalsIgnoreCase("gzip")) {
                            inputStream = execute.getEntity().getContent();
                        } else {
                            inputStream = AndroidHttpClient.getUngzippedContent(execute.getEntity());
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        String str = bufferedReader.readLine().toString();
                        bufferedReader.close();
                        a.a().b(new JSONArray(str), i10);
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                return "";
            }

            public void onPostExecute(String str) {
                super.onPostExecute(str);
                SearchedStationChosenApi.this.populateMethod(str);
            }
        }.execute(new String[0]);
    }

    /* access modifiers changed from: private */
    public void populateMethod(String str) {
    }
}
