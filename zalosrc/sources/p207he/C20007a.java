package p207he;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: he.a */
/* loaded from: classes3.dex */
public final class C20007a {

    /* renamed from: a */
    private int f98351a;

    /* renamed from: b */
    private int f98352b;

    /* renamed from: c */
    private int f98353c;

    /* renamed from: d */
    private int f98354d;

    /* renamed from: e */
    private int f98355e;

    /* renamed from: f */
    private int f98356f;

    /* renamed from: g */
    private int f98357g;

    /* renamed from: h */
    private int f98358h;

    /* renamed from: i */
    private String f98359i;

    /* renamed from: j */
    private long f98360j;

    public C20007a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, long j11) {
        AbstractC19074t.m100208f(str, "param");
        this.f98351a = i11;
        this.f98352b = i12;
        this.f98353c = i13;
        this.f98354d = i14;
        this.f98355e = i15;
        this.f98356f = i16;
        this.f98357g = i17;
        this.f98358h = i18;
        this.f98359i = str;
        this.f98360j = j11;
    }

    /* renamed from: a */
    public final int m103823a() {
        return this.f98352b;
    }

    /* renamed from: b */
    public final int m103824b() {
        return this.f98356f;
    }

    /* renamed from: c */
    public final String m103825c() {
        return this.f98359i;
    }

    /* renamed from: d */
    public final int m103826d() {
        return this.f98357g;
    }

    /* renamed from: e */
    public final int m103827e() {
        return this.f98354d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20007a)) {
            return false;
        }
        C20007a c20007a = (C20007a) obj;
        return this.f98351a == c20007a.f98351a && this.f98352b == c20007a.f98352b && this.f98353c == c20007a.f98353c && this.f98354d == c20007a.f98354d && this.f98355e == c20007a.f98355e && this.f98356f == c20007a.f98356f && this.f98357g == c20007a.f98357g && this.f98358h == c20007a.f98358h && AbstractC19074t.m100204b(this.f98359i, c20007a.f98359i) && this.f98360j == c20007a.f98360j;
    }

    /* renamed from: f */
    public final int m103828f() {
        return this.f98353c;
    }

    /* renamed from: g */
    public final int m103829g() {
        return this.f98358h;
    }

    /* renamed from: h */
    public final int m103830h() {
        return this.f98355e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f98351a * 31) + this.f98352b) * 31) + this.f98353c) * 31) + this.f98354d) * 31) + this.f98355e) * 31) + this.f98356f) * 31) + this.f98357g) * 31) + this.f98358h) * 31) + this.f98359i.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f98360j);
    }

    /* renamed from: i */
    public final long m103831i() {
        return this.f98360j;
    }

    /* renamed from: j */
    public final void m103832j(int i11) {
        this.f98353c = i11;
    }

    /* renamed from: k */
    public final C20015i m103833k() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", this.f98356f);
        jSONObject.put("receiver_id", this.f98354d);
        jSONObject.put("status", this.f98355e);
        jSONObject.put("protocol", this.f98357g);
        jSONObject.put("sender", this.f98358h);
        jSONObject.put("param", this.f98359i);
        jSONObject.put("time_end_call", this.f98360j);
        jSONObject.put("retry_count", this.f98353c);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return new C20015i(this.f98351a, this.f98352b, 406, jSONObject2);
    }

    public String toString() {
        return "CallCmd406Info(currentUid=" + this.f98351a + ", callId=" + this.f98352b + ", retryCount=" + this.f98353c + ", receiverId=" + this.f98354d + ", status=" + this.f98355e + ", duration=" + this.f98356f + ", protocol=" + this.f98357g + ", sender=" + this.f98358h + ", param=" + this.f98359i + ", timeEndCall=" + this.f98360j + ")";
    }

    public /* synthetic */ C20007a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, long j11, int i19, AbstractC19060k abstractC19060k) {
        this((i19 & 1) != 0 ? 0 : i11, (i19 & 2) != 0 ? 0 : i12, (i19 & 4) != 0 ? 0 : i13, (i19 & 8) != 0 ? 0 : i14, (i19 & 16) != 0 ? 0 : i15, (i19 & 32) != 0 ? 0 : i16, (i19 & 64) != 0 ? 0 : i17, (i19 & 128) == 0 ? i18 : 0, (i19 & 256) != 0 ? "" : str, (i19 & 512) != 0 ? 0L : j11);
    }
}
