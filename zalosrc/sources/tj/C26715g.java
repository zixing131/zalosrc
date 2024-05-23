package tj;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: tj.g */
/* loaded from: classes3.dex */
public class C26715g {

    /* renamed from: a */
    private int f126682a;

    /* renamed from: b */
    private long f126683b;

    /* renamed from: c */
    private String f126684c;

    /* renamed from: d */
    private int f126685d;

    /* renamed from: e */
    private String f126686e;

    /* renamed from: f */
    private long f126687f;

    /* renamed from: g */
    private long f126688g;

    /* renamed from: h */
    public boolean f126689h;

    public C26715g(int i11, long j11, String str, int i12, String str2, long j12, long j13) {
        this.f126689h = false;
        this.f126682a = i11;
        this.f126683b = j11;
        this.f126684c = str;
        this.f126685d = i12;
        this.f126686e = str2;
        this.f126687f = j12;
        this.f126688g = j13;
    }

    /* renamed from: a */
    public String m137371a() {
        return this.f126686e;
    }

    /* renamed from: b */
    public long m137372b() {
        return this.f126683b;
    }

    /* renamed from: c */
    public String m137373c() {
        return this.f126684c;
    }

    /* renamed from: d */
    public int m137374d() {
        return this.f126685d;
    }

    /* renamed from: e */
    public long m137375e() {
        return this.f126688g;
    }

    /* renamed from: f */
    public long m137376f() {
        return this.f126687f;
    }

    /* renamed from: g */
    public int m137377g() {
        return this.f126682a;
    }

    /* renamed from: h */
    public void m137378h(String str) {
        this.f126686e = str;
    }

    public C26715g(JSONObject jSONObject) {
        this.f126689h = false;
        this.f126682a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f126683b = jSONObject.optLong("id");
        this.f126684c = jSONObject.optString("pre", "");
        this.f126685d = jSONObject.optInt("response", 0);
        this.f126686e = jSONObject.optString("body", "");
        this.f126687f = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f126684c)) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("pre");
            JSONObject optJSONObject = jSONObject.optJSONObject("pre");
            if (optJSONArray != null) {
                this.f126689h = false;
            }
            if (optJSONObject != null) {
                this.f126689h = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
