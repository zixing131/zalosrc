package dj;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.Serializable;
import org.json.JSONObject;
import p716zh.C31842a9;

/* renamed from: dj.i1 */
/* loaded from: classes3.dex */
public class C17970i1 implements Serializable {

    /* renamed from: p */
    private String f91022p;

    /* renamed from: q */
    private int f91023q;

    /* renamed from: r */
    private String f91024r;

    /* renamed from: s */
    private String f91025s;

    /* renamed from: t */
    private String f91026t = "";

    /* renamed from: u */
    private String f91027u;

    /* renamed from: v */
    private String f91028v;

    /* renamed from: w */
    private String f91029w;

    /* renamed from: x */
    private C31842a9 f91030x;

    public C17970i1(String str, int i11, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f91022p = str;
        this.f91023q = i11;
        this.f91024r = str2;
        this.f91025s = str3;
        this.f91027u = str4;
        this.f91028v = str5;
        this.f91029w = str6;
        m95609k(str7);
    }

    /* renamed from: a */
    public String m95599a() {
        return this.f91025s;
    }

    /* renamed from: b */
    public C31842a9 m95600b() {
        return this.f91030x;
    }

    /* renamed from: c */
    public int m95601c() {
        return this.f91023q;
    }

    /* renamed from: d */
    public String m95602d() {
        return this.f91024r;
    }

    /* renamed from: e */
    public String m95603e() {
        return this.f91029w;
    }

    /* renamed from: f */
    public String m95604f() {
        return this.f91026t;
    }

    /* renamed from: g */
    public String m95605g() {
        return this.f91028v;
    }

    /* renamed from: h */
    public String m95606h() {
        return this.f91022p;
    }

    /* renamed from: i */
    public String m95607i() {
        return this.f91027u;
    }

    /* renamed from: j */
    public boolean m95608j() {
        if (!TextUtils.equals(this.f91027u, "l.a.header.only") && !TextUtils.equals(this.f91027u, "l.a.header.full")) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void m95609k(String str) {
        String str2;
        String str3;
        this.f91026t = str;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f91030x = new C31842a9(new JSONObject(str));
                if (!TextUtils.isEmpty(this.f91025s)) {
                    this.f91030x.f146146a = this.f91025s;
                }
                if (!TextUtils.isEmpty(this.f91030x.f146151f)) {
                    str2 = this.f91030x.f146151f;
                } else {
                    str2 = this.f91022p;
                }
                this.f91022p = str2;
                if (!TextUtils.isEmpty(this.f91030x.f146152g)) {
                    str3 = this.f91030x.f146152g;
                } else {
                    str3 = this.f91024r;
                }
                this.f91024r = str3;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C17970i1(JSONObject jSONObject) {
        this.f91022p = "";
        this.f91023q = 0;
        this.f91024r = "";
        this.f91025s = "";
        this.f91027u = "";
        this.f91028v = "";
        this.f91029w = "";
        try {
            this.f91022p = jSONObject.optString("title");
            this.f91023q = jSONObject.optInt("childnumber");
            this.f91024r = jSONObject.optString("description");
            this.f91025s = jSONObject.optString("action");
            this.f91027u = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f91028v = jSONObject.getString("thumb");
            this.f91029w = jSONObject.getString("href");
            m95609k(jSONObject.optString("params"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
