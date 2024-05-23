package p418p8;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p153f8.C18821f;
import p232i8.C20405m;
import p344m8.C22950a;
import p344m8.C22951b;
import p344m8.C22952c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p8.c */
/* loaded from: classes.dex */
public class C24667c implements InterfaceC24675k {

    /* renamed from: a */
    private final String f118582a;

    /* renamed from: b */
    private final C22951b f118583b;

    /* renamed from: c */
    private final C18821f f118584c;

    public C24667c(String str, C22951b c22951b) {
        this(str, c22951b, C18821f.m98795f());
    }

    /* renamed from: b */
    private C22950a m128202b(C22950a c22950a, C24674j c24674j) {
        m128203c(c22950a, "X-CRASHLYTICS-GOOGLE-APP-ID", c24674j.f118613a);
        m128203c(c22950a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m128203c(c22950a, "X-CRASHLYTICS-API-CLIENT-VERSION", C20405m.m106335l());
        m128203c(c22950a, "Accept", "application/json");
        m128203c(c22950a, "X-CRASHLYTICS-DEVICE-MODEL", c24674j.f118614b);
        m128203c(c22950a, "X-CRASHLYTICS-OS-BUILD-VERSION", c24674j.f118615c);
        m128203c(c22950a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c24674j.f118616d);
        m128203c(c22950a, "X-CRASHLYTICS-INSTALLATION-ID", c24674j.f118617e.mo106427a());
        return c22950a;
    }

    /* renamed from: c */
    private void m128203c(C22950a c22950a, String str, String str2) {
        if (str2 != null) {
            c22950a.m117682d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m128204e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e11) {
            this.f118584c.m98805l("Failed to parse settings JSON from " + this.f118582a, e11);
            this.f118584c.m98804k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map m128205f(C24674j c24674j) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c24674j.f118620h);
        hashMap.put("display_version", c24674j.f118619g);
        hashMap.put("source", Integer.toString(c24674j.f118621i));
        String str = c24674j.f118618f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // p418p8.InterfaceC24675k
    /* renamed from: a */
    public JSONObject mo128206a(C24674j c24674j, boolean z11) {
        if (z11) {
            try {
                Map m128205f = m128205f(c24674j);
                C22950a m128202b = m128202b(m128207d(m128205f), c24674j);
                this.f118584c.m98796b("Requesting settings from " + this.f118582a);
                this.f118584c.m98802i("Settings query params were: " + m128205f);
                return m128208g(m128202b.m117681c());
            } catch (IOException e11) {
                this.f118584c.m98799e("Settings request failed.", e11);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    protected C22950a m128207d(Map map) {
        return this.f118583b.m117683a(this.f118582a, map).m117682d("User-Agent", "Crashlytics Android SDK/" + C20405m.m106335l()).m117682d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: g */
    JSONObject m128208g(C22952c c22952c) {
        int m117685b = c22952c.m117685b();
        this.f118584c.m98802i("Settings response code was: " + m117685b);
        if (m128209h(m117685b)) {
            return m128204e(c22952c.m117684a());
        }
        this.f118584c.m98798d("Settings request failed; (status: " + m117685b + ") from " + this.f118582a);
        return null;
    }

    /* renamed from: h */
    boolean m128209h(int i11) {
        return i11 == 200 || i11 == 201 || i11 == 202 || i11 == 203;
    }

    C24667c(String str, C22951b c22951b, C18821f c18821f) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f118584c = c18821f;
        this.f118583b = c22951b;
        this.f118582a = str;
    }
}
