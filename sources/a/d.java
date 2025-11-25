package a;

import a.b;
import android.graphics.Bitmap;
import android.support.v4.media.h;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: QRGSaver */
public class d {
    public static boolean a(String str, String str2, Bitmap bitmap, int i10) {
        String str3;
        Bitmap.CompressFormat compressFormat;
        StringBuilder w9 = h.w(str, str2);
        if (i10 == b.a.f26a) {
            str3 = ".png";
        } else {
            str3 = ".jpg";
        }
        w9.append(str3);
        String sb = w9.toString();
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        } else {
            Log.v("QRGSaver", "Folder Exists");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(sb);
            if (i10 == b.a.f26a) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e10) {
            Log.d("QRGSaver", e10.toString());
            return false;
        }
    }
}
