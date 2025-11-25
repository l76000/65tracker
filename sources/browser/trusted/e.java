package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import e.q0;
import e.w0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PackageIdentityUtils */
class e {

    @w0
    /* compiled from: PackageIdentityUtils */
    public static class a implements c {
        @q0
        public final ArrayList a(PackageManager packageManager, String str) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo e10 = packageInfo.signingInfo;
            if (e10.hasMultipleSigners()) {
                for (Signature a10 : e10.getApkContentsSigners()) {
                    arrayList.add(e.a(a10));
                }
            } else {
                arrayList.add(e.a(e10.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        public final boolean b(String str, PackageManager packageManager, i iVar) {
            iVar.b();
            String str2 = iVar.f1465b;
            if (str2 == null) {
                throw new IllegalStateException();
            } else if (!str2.equals(str)) {
                return false;
            } else {
                ArrayList a10 = a(packageManager, str);
                if (a10.size() != 1) {
                    return iVar.equals(i.a(str, a10));
                }
                iVar.b();
                ArrayList arrayList = iVar.f1466c;
                if (arrayList != null) {
                    return packageManager.hasSigningCertificate(str, Arrays.copyOf((byte[]) arrayList.get(0), ((byte[]) iVar.f1466c.get(0)).length), 1);
                }
                throw new IllegalStateException();
            }
        }
    }

    /* compiled from: PackageIdentityUtils */
    public static class b implements c {
        @SuppressLint({"PackageManagerGetSignatures"})
        @q0
        public final ArrayList a(PackageManager packageManager, String str) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature a10 : packageInfo.signatures) {
                byte[] a11 = e.a(a10);
                if (a11 == null) {
                    return null;
                }
                arrayList.add(a11);
            }
            return arrayList;
        }

        public final boolean b(String str, PackageManager packageManager, i iVar) {
            ArrayList a10;
            iVar.b();
            String str2 = iVar.f1465b;
            if (str2 == null) {
                throw new IllegalStateException();
            } else if (str.equals(str2) && (a10 = a(packageManager, str)) != null) {
                return iVar.equals(i.a(str, a10));
            } else {
                return false;
            }
        }
    }

    /* compiled from: PackageIdentityUtils */
    public interface c {
        @q0
        ArrayList a(PackageManager packageManager, String str);

        boolean b(String str, PackageManager packageManager, i iVar);
    }

    @q0
    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
