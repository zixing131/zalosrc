package dj;

import android.text.TextUtils;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.r0 */
/* loaded from: classes3.dex */
public class C17996r0 extends C17969i0 {

    /* renamed from: B */
    public long f91147B;

    /* renamed from: C */
    public int f91148C;

    /* renamed from: D */
    public double f91149D;

    /* renamed from: E */
    public double f91150E;

    /* renamed from: F */
    public boolean f91151F;

    /* renamed from: G */
    public long f91152G;

    /* renamed from: H */
    public long f91153H;

    /* renamed from: I */
    public long f91154I;

    public C17996r0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91151F = false;
        this.f91154I = -1L;
        m95679g();
    }

    /* renamed from: g */
    private void m95679g() {
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                if (jSONObject.has("live_location_id")) {
                    this.f91147B = AbstractC18069a.m96087f(jSONObject, "live_location_id");
                }
                if (jSONObject.has("action")) {
                    this.f91148C = AbstractC18069a.m96085d(jSONObject, "action");
                }
                if (jSONObject.has("long")) {
                    this.f91149D = AbstractC18069a.m96084c(jSONObject, "long");
                }
                if (jSONObject.has("lat")) {
                    this.f91150E = AbstractC18069a.m96084c(jSONObject, "lat");
                }
                if (jSONObject.has("isEnd")) {
                    this.f91151F = AbstractC18069a.m96083b(jSONObject, "isEnd");
                } else if (jSONObject.has("isLive")) {
                    this.f91151F = !AbstractC18069a.m96083b(jSONObject, "isLive");
                }
                if (jSONObject.has("start_time")) {
                    this.f91152G = AbstractC18069a.m96087f(jSONObject, "start_time");
                }
                if (jSONObject.has("expired_time")) {
                    this.f91153H = AbstractC18069a.m96087f(jSONObject, "expired_time");
                }
                if (jSONObject.has("liveVer")) {
                    this.f91154I = AbstractC18069a.m96087f(jSONObject, "liveVer");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m95680h(boolean z11, double d11, double d12, long j11) {
        this.f91149D = d11;
        this.f91150E = d12;
        this.f91154I = j11;
        this.f91151F = z11;
        m95683k();
    }

    /* renamed from: i */
    public void m95681i(boolean z11) {
        this.f91151F = z11;
        m95683k();
    }

    /* renamed from: j */
    public void m95682j(double d11, double d12, long j11) {
        this.f91149D = d11;
        this.f91150E = d12;
        this.f91154I = j11;
        m95683k();
    }

    /* renamed from: k */
    public void m95683k() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("live_location_id", this.f91147B);
            jSONObject.put("action", this.f91148C);
            jSONObject.put("long", this.f91149D);
            jSONObject.put("lat", this.f91150E);
            jSONObject.put("isEnd", this.f91151F);
            jSONObject.put("start_time", this.f91152G);
            jSONObject.put("expired_time", this.f91153H);
            jSONObject.put("liveVer", this.f91154I);
            this.f91017v = jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C17996r0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91151F = false;
        this.f91154I = -1L;
        m95679g();
    }
}
