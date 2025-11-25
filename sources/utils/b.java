package buslogic.app.utils;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: EncryptAES */
public class b {
    public static String a(String str, String str2, String str3) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            byte[] decode2 = Base64.decode(str3, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(decode2);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String b(String str, String str2, String str3) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            byte[] decode2 = Base64.decode(str3, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(decode2);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
