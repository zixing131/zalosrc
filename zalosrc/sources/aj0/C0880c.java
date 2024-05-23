package aj0;

import androidx.work.AbstractC2147g0;
import bj0.C2826e;
import com.android.billingclient.api.C3940r;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: aj0.c */
/* loaded from: classes7.dex */
public final class C0880c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f3305a;

    /* renamed from: b */
    private String f3306b;

    /* renamed from: c */
    private String f3307c;

    /* renamed from: d */
    private String f3308d;

    /* renamed from: e */
    private String f3309e;

    /* renamed from: f */
    private String f3310f;

    /* renamed from: g */
    private long f3311g;

    /* renamed from: h */
    private String f3312h;

    /* renamed from: i */
    private int f3313i;

    /* renamed from: j */
    private String f3314j;

    /* renamed from: k */
    private String f3315k;

    /* renamed from: l */
    private String f3316l;

    /* renamed from: aj0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0880c m2708a(C3940r c3940r, String str) {
            AbstractC19074t.m100208f(c3940r, "purchase");
            AbstractC19074t.m100208f(str, "verifyUrl");
            Object obj = c3940r.m18688c().get(0);
            AbstractC19074t.m100207e(obj, "purchase.products[0]");
            String m18687b = c3940r.m18687b();
            AbstractC19074t.m100207e(m18687b, "purchase.originalJson");
            String m18691f = c3940r.m18691f();
            AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
            String m18692g = c3940r.m18692g();
            AbstractC19074t.m100207e(m18692g, "purchase.signature");
            return new C0880c(0, "", (String) obj, m18687b, m18691f, m18692g, c3940r.m18690e(), str, 0, "", "", null, 2305, null);
        }

        /* renamed from: b */
        public final C0880c m2709b(C2826e c2826e) {
            AbstractC19074t.m100208f(c2826e, "transactionData");
            return new C0880c(0, c2826e.m13657d(), c2826e.m13654a(), null, null, null, c2826e.m13658e(), c2826e.m13660g(), 0, c2826e.m13655b(), c2826e.m13654a(), null, 2361, null);
        }
    }

    public C0880c(int i11, String str, String str2, String str3, String str4, String str5, long j11, String str6, int i12, String str7, String str8, String str9) {
        AbstractC19074t.m100208f(str, "tranxId");
        AbstractC19074t.m100208f(str2, "productId");
        AbstractC19074t.m100208f(str3, "purchaseData");
        AbstractC19074t.m100208f(str4, "purchaseToken");
        AbstractC19074t.m100208f(str5, "purchaseSig");
        AbstractC19074t.m100208f(str6, "verificationUrl");
        AbstractC19074t.m100208f(str7, "productType");
        AbstractC19074t.m100208f(str8, "requestProductId");
        AbstractC19074t.m100208f(str9, "obfuscatedAccountId");
        this.f3305a = i11;
        this.f3306b = str;
        this.f3307c = str2;
        this.f3308d = str3;
        this.f3309e = str4;
        this.f3310f = str5;
        this.f3311g = j11;
        this.f3312h = str6;
        this.f3313i = i12;
        this.f3314j = str7;
        this.f3315k = str8;
        this.f3316l = str9;
    }

    /* renamed from: a */
    public final int m2693a() {
        return this.f3305a;
    }

    /* renamed from: b */
    public final String m2694b() {
        return this.f3316l;
    }

    /* renamed from: c */
    public final String m2695c() {
        return this.f3307c;
    }

    /* renamed from: d */
    public final String m2696d() {
        return this.f3314j;
    }

    /* renamed from: e */
    public final String m2697e() {
        return this.f3308d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0880c)) {
            return false;
        }
        C0880c c0880c = (C0880c) obj;
        return this.f3305a == c0880c.f3305a && AbstractC19074t.m100204b(this.f3306b, c0880c.f3306b) && AbstractC19074t.m100204b(this.f3307c, c0880c.f3307c) && AbstractC19074t.m100204b(this.f3308d, c0880c.f3308d) && AbstractC19074t.m100204b(this.f3309e, c0880c.f3309e) && AbstractC19074t.m100204b(this.f3310f, c0880c.f3310f) && this.f3311g == c0880c.f3311g && AbstractC19074t.m100204b(this.f3312h, c0880c.f3312h) && this.f3313i == c0880c.f3313i && AbstractC19074t.m100204b(this.f3314j, c0880c.f3314j) && AbstractC19074t.m100204b(this.f3315k, c0880c.f3315k) && AbstractC19074t.m100204b(this.f3316l, c0880c.f3316l);
    }

    /* renamed from: f */
    public final String m2698f() {
        return this.f3310f;
    }

    /* renamed from: g */
    public final String m2699g() {
        return this.f3309e;
    }

    /* renamed from: h */
    public final String m2700h() {
        return this.f3315k;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f3305a * 31) + this.f3306b.hashCode()) * 31) + this.f3307c.hashCode()) * 31) + this.f3308d.hashCode()) * 31) + this.f3309e.hashCode()) * 31) + this.f3310f.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f3311g)) * 31) + this.f3312h.hashCode()) * 31) + this.f3313i) * 31) + this.f3314j.hashCode()) * 31) + this.f3315k.hashCode()) * 31) + this.f3316l.hashCode();
    }

    /* renamed from: i */
    public final String m2701i() {
        return this.f3306b;
    }

    /* renamed from: j */
    public final long m2702j() {
        return this.f3311g;
    }

    /* renamed from: k */
    public final String m2703k() {
        return this.f3312h;
    }

    /* renamed from: l */
    public final int m2704l() {
        return this.f3313i;
    }

    /* renamed from: m */
    public final void m2705m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f3308d = str;
    }

    /* renamed from: n */
    public final void m2706n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f3310f = str;
    }

    /* renamed from: o */
    public final void m2707o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f3309e = str;
    }

    public String toString() {
        return "BillingItem(id=" + this.f3305a + ", tranxId=" + this.f3306b + ", productId=" + this.f3307c + ", purchaseData=" + this.f3308d + ", purchaseToken=" + this.f3309e + ", purchaseSig=" + this.f3310f + ", tranxIdRequestTime=" + this.f3311g + ", verificationUrl=" + this.f3312h + ", isAlreadySubmitToServer=" + this.f3313i + ", productType=" + this.f3314j + ", requestProductId=" + this.f3315k + ", obfuscatedAccountId=" + this.f3316l + ")";
    }

    public /* synthetic */ C0880c(int i11, String str, String str2, String str3, String str4, String str5, long j11, String str6, int i12, String str7, String str8, String str9, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? 0L : j11, (i13 & 128) != 0 ? "" : str6, (i13 & 256) == 0 ? i12 : 0, (i13 & 512) != 0 ? "" : str7, (i13 & 1024) != 0 ? "" : str8, (i13 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0 ? str9 : "");
    }
}
