package p227i3;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: i3.h */
/* loaded from: classes2.dex */
final class C20204h {

    /* renamed from: b */
    private static C20204h f99852b;

    /* renamed from: a */
    private String f99853a = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3RDNfLBlHxar2U88XpnRsTsxeO9bsFmt\nYenQ0lyDxJOXS9LqhJpRi+dvTIJUm3yyvPBwDdJJVPPIIFjDA5hLjnqSwsgBWsdjMbvHjcImIPn0\n3jfCOBCtovoor+x3NhI7+Mv6HCmZiP/qJ2gK8MSWbF/gVmAf5I1A9m2XVjful69E/6MMNfqAoUiI\nPJLr71ZLpEauDdPv2H20xTpO39PghFfoxX6ibu9WFy4blXVfibzO8vfcLoSyxlJrYPMY2sdvw74V\nCORWXWssUMW7jxMARpXRgvEcUdTVUk83VOPWflLZ8Bw2UI8t0k2hOWLt0OYaJHJf8uLL9S1O935e\nwHhuXwIDAQAB";

    private C20204h() {
    }

    /* renamed from: a */
    public static C20204h m105354a() {
        if (f99852b == null) {
            f99852b = new C20204h();
        }
        return f99852b;
    }

    /* renamed from: b */
    public String m105355b(String str) {
        try {
            PublicKey m105356c = m105356c(this.f99853a);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, m105356c);
            String encodeToString = Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 0);
            try {
                return encodeToString.replace("\n", "").replace("\r", "");
            } catch (Exception unused) {
                return encodeToString;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public PublicKey m105356c(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes("UTF-8"), 0)));
        } catch (Exception unused) {
            return null;
        }
    }
}
