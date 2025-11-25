package a2;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

/* compiled from: SSLHttpClient */
public class c {
    public static DefaultHttpClient a(HttpParams httpParams) {
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        SSLContext instance = SSLContext.getInstance(SSLSocketFactory.TLS);
        instance.init((KeyManager[]) null, new TrustManager[]{new b()}, new SecureRandom());
        a aVar = new a(instance);
        aVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        ClientConnectionManager connectionManager = defaultHttpClient.getConnectionManager();
        connectionManager.getSchemeRegistry().register(new Scheme("https", (SocketFactory) aVar, 443));
        return new DefaultHttpClient(connectionManager, httpParams);
    }
}
