package a2;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: CustomX509TrustManager */
public class b implements X509TrustManager {
    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }
}
