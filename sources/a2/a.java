package a2;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* compiled from: CustomSSLSocketFactory */
public class a extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLContext f172a = SSLContext.getInstance(SSLSocketFactory.TLS);

    public a(SSLContext sSLContext) {
        super((KeyStore) null);
        this.f172a = sSLContext;
    }

    public final Socket createSocket(Socket socket, String str, int i10, boolean z9) {
        return this.f172a.getSocketFactory().createSocket(socket, str, i10, z9);
    }

    public final Socket createSocket() {
        return this.f172a.getSocketFactory().createSocket();
    }
}
