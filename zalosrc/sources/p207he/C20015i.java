package p207he;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: he.i */
/* loaded from: classes3.dex */
public final class C20015i {

    /* renamed from: a */
    private int f98399a;

    /* renamed from: b */
    private int f98400b;

    /* renamed from: c */
    private int f98401c;

    /* renamed from: d */
    private String f98402d;

    public C20015i() {
        this(0, 0, 0, null, 15, null);
    }

    /* renamed from: a */
    public final int m103881a() {
        return this.f98400b;
    }

    /* renamed from: b */
    public final int m103882b() {
        return this.f98401c;
    }

    /* renamed from: c */
    public final int m103883c() {
        return this.f98399a;
    }

    /* renamed from: d */
    public final String m103884d() {
        return this.f98402d;
    }

    /* renamed from: e */
    public final void m103885e(int i11) {
        this.f98400b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20015i)) {
            return false;
        }
        C20015i c20015i = (C20015i) obj;
        return this.f98399a == c20015i.f98399a && this.f98400b == c20015i.f98400b && this.f98401c == c20015i.f98401c && AbstractC19074t.m100204b(this.f98402d, c20015i.f98402d);
    }

    /* renamed from: f */
    public final void m103886f(int i11) {
        this.f98401c = i11;
    }

    /* renamed from: g */
    public final void m103887g(int i11) {
        this.f98399a = i11;
    }

    /* renamed from: h */
    public final void m103888h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f98402d = str;
    }

    public int hashCode() {
        return (((((this.f98399a * 31) + this.f98400b) * 31) + this.f98401c) * 31) + this.f98402d.hashCode();
    }

    /* renamed from: i */
    public final C20007a m103889i() {
        JSONObject jSONObject = new JSONObject(this.f98402d);
        int i11 = this.f98400b;
        int i12 = this.f98399a;
        int optInt = jSONObject.optInt("retry_count");
        int optInt2 = jSONObject.optInt("duration");
        int optInt3 = jSONObject.optInt("receiver_id");
        int optInt4 = jSONObject.optInt("status");
        int optInt5 = jSONObject.optInt("protocol");
        int optInt6 = jSONObject.optInt("sender");
        String optString = jSONObject.optString("param");
        long optLong = jSONObject.optLong("time_end_call");
        AbstractC19074t.m100205c(optString);
        return new C20007a(i12, i11, optInt, optInt3, optInt4, optInt2, optInt5, optInt6, optString, optLong);
    }

    public String toString() {
        return "SaveCallInfoData(currentUid=" + this.f98399a + ", callId=" + this.f98400b + ", command=" + this.f98401c + ", extrasData=" + this.f98402d + ")";
    }

    public C20015i(int i11, int i12, int i13, String str) {
        AbstractC19074t.m100208f(str, "extrasData");
        this.f98399a = i11;
        this.f98400b = i12;
        this.f98401c = i13;
        this.f98402d = str;
    }

    public /* synthetic */ C20015i(int i11, int i12, int i13, String str, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? "" : str);
    }
}
