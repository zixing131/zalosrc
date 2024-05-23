package p053c9;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.C6576e;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c9.b */
/* loaded from: classes3.dex */
public class C3370b {

    /* renamed from: c */
    private static final String[] f14257c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f14258a;

    /* renamed from: b */
    private final String f14259b;

    public C3370b(C6576e c6576e) {
        this.f14258a = c6576e.m33612j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f14259b = m16955b(c6576e);
    }

    /* renamed from: a */
    private String m16954a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m16955b(C6576e c6576e) {
        String m33681d = c6576e.m33614m().m33681d();
        if (m33681d != null) {
            return m33681d;
        }
        String m33680c = c6576e.m33614m().m33680c();
        if (!m33680c.startsWith("1:") && !m33680c.startsWith("2:")) {
            return m33680c;
        }
        String[] split = m33680c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m16956c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private String m16957d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m16958e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid key stored ");
            sb2.append(e11);
            return null;
        }
    }

    /* renamed from: g */
    private String m16959g() {
        String string;
        synchronized (this.f14258a) {
            string = this.f14258a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m16960h() {
        synchronized (this.f14258a) {
            try {
                String string = this.f14258a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey m16958e = m16958e(string);
                if (m16958e == null) {
                    return null;
                }
                return m16956c(m16958e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public String m16961f() {
        synchronized (this.f14258a) {
            try {
                String m16959g = m16959g();
                if (m16959g != null) {
                    return m16959g;
                }
                return m16960h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public String m16962i() {
        synchronized (this.f14258a) {
            try {
                for (String str : f14257c) {
                    String string = this.f14258a.getString(m16954a(this.f14259b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m16957d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
