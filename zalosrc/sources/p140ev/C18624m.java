package p140ev;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: ev.m */
/* loaded from: classes4.dex */
public final class C18624m {

    /* renamed from: a */
    private String f93713a;

    /* renamed from: b */
    private String f93714b;

    /* renamed from: c */
    private String f93715c;

    /* renamed from: d */
    private String f93716d;

    /* renamed from: e */
    private String f93717e;

    /* renamed from: f */
    private boolean f93718f;

    /* renamed from: g */
    private boolean f93719g;

    /* renamed from: h */
    private String f93720h;

    /* renamed from: i */
    private String f93721i;

    public C18624m(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f93713a = jSONObject.getString("name");
        this.f93714b = jSONObject.getString("value");
        this.f93716d = jSONObject.getString("domain");
        this.f93715c = jSONObject.getString("path");
        long j11 = jSONObject.getLong("expires");
        this.f93717e = j11 > 0 ? new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US).format(new Date(System.currentTimeMillis() + (j11 * 1000))) : "-1";
        this.f93718f = jSONObject.optBoolean("httpOnly");
        this.f93719g = jSONObject.optBoolean("secure");
        this.f93720h = jSONObject.optString("sameSite");
    }

    /* renamed from: d */
    private final String m98425d(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                sb2.append("; ");
            }
            sb2.append((String) list.get(i11));
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: a */
    public final String m98426a() {
        return this.f93716d;
    }

    /* renamed from: b */
    public final String m98427b() {
        return this.f93715c;
    }

    /* renamed from: c */
    public final boolean m98428c() {
        return this.f93719g;
    }

    public String toString() {
        if (this.f93713a == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f93713a + "=" + this.f93714b);
        arrayList.add("Domain=" + this.f93716d);
        arrayList.add("Path=" + this.f93715c);
        if (!TextUtils.isEmpty(this.f93717e)) {
            arrayList.add("Expires=" + this.f93717e);
        }
        if (!TextUtils.isEmpty(this.f93721i)) {
            arrayList.add("max-age=" + this.f93721i);
        }
        if (this.f93719g) {
            arrayList.add("Secure");
        }
        if (this.f93718f) {
            arrayList.add("HttpOnly");
        }
        if (!TextUtils.isEmpty(this.f93720h)) {
            arrayList.add("SameSite=" + this.f93720h);
        }
        return m98425d(arrayList);
    }

    public C18624m(String str, String str2, String str3, String str4, String str5) {
        this.f93713a = str;
        this.f93714b = str2;
        this.f93715c = str3;
        this.f93716d = str4;
        this.f93719g = false;
        this.f93717e = null;
        this.f93721i = str5;
    }
}
