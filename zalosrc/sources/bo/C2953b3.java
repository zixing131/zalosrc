package bo;

import nh0.C23793c;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: bo.b3 */
/* loaded from: classes4.dex */
public class C2953b3 {

    /* renamed from: a */
    public long f11652a;

    /* renamed from: b */
    public long f11653b;

    /* renamed from: c */
    public String f11654c;

    /* renamed from: d */
    public String f11655d;

    public C2953b3(JSONObject jSONObject) {
        this.f11652a = AbstractC18069a.m96087f(jSONObject, "startedTime");
        this.f11653b = AbstractC18069a.m96087f(jSONObject, "endTime");
        this.f11654c = AbstractC18069a.m96089h(jSONObject, "bgHeader");
        this.f11655d = AbstractC18069a.m96089h(jSONObject, "bgBody");
    }

    /* renamed from: a */
    public boolean m13985a() {
        long j11 = this.f11652a;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f11653b;
        if (j12 <= 0 || j11 > j12) {
            return false;
        }
        long mo124311f = C23793c.m124316k().mo124311f();
        if (this.f11652a > mo124311f || mo124311f > this.f11653b) {
            return false;
        }
        return true;
    }
}
