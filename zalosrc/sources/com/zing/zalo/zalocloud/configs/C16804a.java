package com.zing.zalo.zalocloud.configs;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import org.json.JSONObject;
import tg0.C26676b;

/* renamed from: com.zing.zalo.zalocloud.configs.a */
/* loaded from: classes7.dex */
public final class C16804a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f85336a;

    /* renamed from: b */
    private int f85337b;

    /* renamed from: c */
    private int f85338c;

    /* renamed from: com.zing.zalo.zalocloud.configs.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C16804a m89782a(String str) {
            boolean z11;
            int i11;
            int m116580c;
            AbstractC19074t.m100208f(str, "json");
            Integer num = null;
            if (str.length() == 0) {
                C26676b.m136958h("Parse Offload config: Empty json", null, 2, null);
                return new C16804a(0, 0, 0, 7, null);
            }
            try {
                C16804a c16804a = new C16804a(0, 0, 0, 7, null);
                JSONObject jSONObject = new JSONObject(str);
                c16804a.m89779d(jSONObject.optInt("enable", 0));
                Integer valueOf = Integer.valueOf(jSONObject.optInt("msg_threshold_day", -1));
                if (valueOf.intValue() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (Boolean.valueOf(z11).booleanValue()) {
                    num = valueOf;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 7;
                }
                c16804a.m89781f(i11);
                m116580c = AbstractC22543l.m116580c(jSONObject.optInt("interval_day", 0), 0);
                c16804a.m89780e(m116580c);
                return c16804a;
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return new C16804a(0, 0, 0, 7, null);
            }
        }
    }

    public C16804a(int i11, int i12, int i13) {
        this.f85336a = i11;
        this.f85337b = i12;
        this.f85338c = i13;
    }

    /* renamed from: a */
    public final int m89776a() {
        return this.f85337b;
    }

    /* renamed from: b */
    public final int m89777b() {
        return this.f85338c;
    }

    /* renamed from: c */
    public final boolean m89778c() {
        return this.f85336a == 1;
    }

    /* renamed from: d */
    public final void m89779d(int i11) {
        this.f85336a = i11;
    }

    /* renamed from: e */
    public final void m89780e(int i11) {
        this.f85337b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16804a)) {
            return false;
        }
        C16804a c16804a = (C16804a) obj;
        return this.f85336a == c16804a.f85336a && this.f85337b == c16804a.f85337b && this.f85338c == c16804a.f85338c;
    }

    /* renamed from: f */
    public final void m89781f(int i11) {
        this.f85338c = i11;
    }

    public int hashCode() {
        return (((this.f85336a * 31) + this.f85337b) * 31) + this.f85338c;
    }

    public String toString() {
        return "OffloadLocalStorageConfig(enable=" + this.f85336a + ", intervalDay=" + this.f85337b + ", msgThresholdDay=" + this.f85338c + ")";
    }

    public /* synthetic */ C16804a(int i11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 7 : i13);
    }
}
