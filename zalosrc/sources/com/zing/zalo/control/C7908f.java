package com.zing.zalo.control;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.control.f */
/* loaded from: classes3.dex */
public final class C7908f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f42801a;

    /* renamed from: b */
    private final int f42802b;

    /* renamed from: c */
    private final long f42803c;

    /* renamed from: d */
    private final long f42804d;

    /* renamed from: e */
    private final long f42805e;

    /* renamed from: f */
    private final long f42806f;

    /* renamed from: com.zing.zalo.control.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7908f m40878a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            return new C7908f(jSONObject.optInt("srcType", 3), jSONObject.optInt("topOut", 1), jSONObject.optLong("topOutTimeOut"), jSONObject.optLong("topOutImprTimeOut"), jSONObject.optLong("imprTime"), jSONObject.optLong("receiveTime"));
        }
    }

    public C7908f(int i11, int i12, long j11, long j12, long j13, long j14) {
        this.f42801a = i11;
        this.f42802b = i12;
        this.f42803c = j11;
        this.f42804d = j12;
        this.f42805e = j13;
        this.f42806f = j14;
    }

    /* renamed from: a */
    public final long m40871a() {
        return this.f42805e;
    }

    /* renamed from: b */
    public final long m40872b() {
        return this.f42806f;
    }

    /* renamed from: c */
    public final int m40873c() {
        return this.f42801a;
    }

    /* renamed from: d */
    public final int m40874d() {
        return this.f42802b;
    }

    /* renamed from: e */
    public final long m40875e() {
        return this.f42804d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7908f)) {
            return false;
        }
        C7908f c7908f = (C7908f) obj;
        return this.f42801a == c7908f.f42801a && this.f42802b == c7908f.f42802b && this.f42803c == c7908f.f42803c && this.f42804d == c7908f.f42804d && this.f42805e == c7908f.f42805e && this.f42806f == c7908f.f42806f;
    }

    /* renamed from: f */
    public final long m40876f() {
        return this.f42803c;
    }

    /* renamed from: g */
    public final String m40877g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("srcType", this.f42801a);
        jSONObject.put("topOut", this.f42802b);
        jSONObject.put("topOutTimeOut", this.f42803c);
        jSONObject.put("topOutImprTimeOut", this.f42804d);
        jSONObject.put("receiveTime", this.f42806f);
        jSONObject.put("imprTime", this.f42805e);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public int hashCode() {
        return (((((((((this.f42801a * 31) + this.f42802b) * 31) + AbstractC2147g0.m11521a(this.f42803c)) * 31) + AbstractC2147g0.m11521a(this.f42804d)) * 31) + AbstractC2147g0.m11521a(this.f42805e)) * 31) + AbstractC2147g0.m11521a(this.f42806f);
    }

    public String toString() {
        return "TopOutInfo(srcType=" + this.f42801a + ", topOut=" + this.f42802b + ", topOutTimeOut=" + this.f42803c + ", topOutImprTimeOut=" + this.f42804d + ", imprTime=" + this.f42805e + ", receiveTime=" + this.f42806f + ")";
    }

    public C7908f(int i11, int i12, long j11, long j12) {
        this(i11, i12, j11, j12, 0L, System.currentTimeMillis());
    }
}
