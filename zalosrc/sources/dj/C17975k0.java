package dj;

import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.k0 */
/* loaded from: classes3.dex */
public class C17975k0 {

    /* renamed from: a */
    public int f91038a;

    /* renamed from: b */
    private int f91039b;

    /* renamed from: c */
    public int f91040c;

    /* renamed from: d */
    public long f91041d;

    /* renamed from: e */
    public boolean f91042e;

    /* renamed from: f */
    public int f91043f;

    /* renamed from: g */
    public int f91044g;

    /* renamed from: h */
    public String f91045h;

    /* renamed from: i */
    public String f91046i;

    public C17975k0(JSONObject jSONObject) {
        this.f91038a = 0;
        this.f91039b = 1;
        this.f91040c = 0;
        this.f91041d = -1L;
        this.f91042e = false;
        this.f91045h = "";
        this.f91046i = "";
        try {
            if (jSONObject.has("calltype")) {
                this.f91038a = AbstractC18069a.m96085d(jSONObject, "calltype");
            }
            if (jSONObject.has("isEnableCallback")) {
                this.f91039b = jSONObject.optInt("isEnableCallback", 1);
            }
            if (jSONObject.has("reason")) {
                this.f91040c = jSONObject.optInt("reason", 0);
            }
            if (jSONObject.has("duration")) {
                this.f91041d = jSONObject.optLong("duration", -1L);
            }
            if (jSONObject.has("isCallNative")) {
                this.f91042e = jSONObject.optInt("isCallNative", 0) == 1;
            }
            if (jSONObject.has("callId")) {
                this.f91043f = jSONObject.optInt("callId");
            }
            if (jSONObject.has("hostId")) {
                this.f91044g = jSONObject.optInt("hostId");
            }
            if (jSONObject.has("data")) {
                this.f91045h = jSONObject.optJSONObject("data") != null ? jSONObject.optJSONObject("data").toString() : "";
            }
            if (jSONObject.has("members")) {
                this.f91046i = jSONObject.getJSONArray("members").toString();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m95615a() {
        return this.f91039b != 0;
    }
}
