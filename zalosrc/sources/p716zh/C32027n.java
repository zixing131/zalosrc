package p716zh;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import pm0.C24848g0;
import sx.EnumC26407i;

/* renamed from: zh.n */
/* loaded from: classes3.dex */
public final class C32027n {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f147465a;

    /* renamed from: b */
    private int f147466b;

    /* renamed from: c */
    private int f147467c;

    /* renamed from: d */
    private long f147468d;

    /* renamed from: e */
    private long f147469e;

    /* renamed from: f */
    private long f147470f;

    /* renamed from: g */
    private long f147471g;

    /* renamed from: h */
    private long f147472h;

    /* renamed from: i */
    private EnumC26407i f147473i;

    /* renamed from: j */
    private long f147474j;

    /* renamed from: k */
    private int f147475k;

    /* renamed from: l */
    private int f147476l;

    /* renamed from: m */
    private long f147477m;

    /* renamed from: n */
    private long f147478n;

    /* renamed from: o */
    private long f147479o;

    /* renamed from: p */
    private long f147480p;

    /* renamed from: q */
    private long f147481q;

    /* renamed from: r */
    private int f147482r;

    /* renamed from: zh.n$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C32027n() {
        this(0L, 0, 0, 0L, 0L, 0L, 0L, 0L, null, 0L, 0, 0, 0L, 0L, 0L, 0L, 0L, 0, 262143, null);
    }

    /* renamed from: A */
    public final void m154447A(int i11) {
        this.f147476l = i11;
    }

    /* renamed from: B */
    public final void m154448B(long j11) {
        this.f147477m = j11;
    }

    /* renamed from: C */
    public final void m154449C(long j11) {
        this.f147474j = j11;
    }

    /* renamed from: D */
    public final void m154450D(int i11) {
        this.f147475k = i11;
    }

    /* renamed from: E */
    public final void m154451E(long j11) {
        this.f147480p = j11;
    }

    /* renamed from: F */
    public final void m154452F(long j11) {
        this.f147481q = j11;
    }

    /* renamed from: G */
    public final void m154453G(long j11) {
        this.f147468d = j11;
    }

    /* renamed from: H */
    public final void m154454H(long j11) {
        this.f147465a = j11;
    }

    /* renamed from: I */
    public final void m154455I(int i11) {
        this.f147466b = i11;
    }

    /* renamed from: J */
    public final void m154456J(long j11) {
        this.f147471g = j11;
    }

    /* renamed from: K */
    public final void m154457K(EnumC26407i enumC26407i) {
        AbstractC19074t.m100208f(enumC26407i, "<set-?>");
        this.f147473i = enumC26407i;
    }

    /* renamed from: L */
    public final void m154458L(long j11) {
        this.f147472h = j11;
    }

    /* renamed from: M */
    public final JSONObject m154459M() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tId", this.f147465a);
            jSONObject.put("srcType", this.f147466b);
            jSONObject.put("srcId", this.f147468d);
            jSONObject.put("cmi", this.f147469e);
            jSONObject.put("gmi", this.f147470f);
            jSONObject.put("ts", this.f147472h);
            jSONObject.put("trs", this.f147473i.m136202c());
            jSONObject.put("isComm", this.f147467c);
            jSONObject.put("toId", this.f147471g);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tId", this.f147474j);
            jSONObject2.put("srcType", this.f147475k);
            jSONObject2.put("isComm", this.f147476l);
            jSONObject2.put("srcId", this.f147477m);
            jSONObject2.put("cmi", this.f147478n);
            jSONObject2.put("gmi", this.f147479o);
            jSONObject2.put("toId", this.f147480p);
            jSONObject2.put("ts", this.f147481q);
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("rootMsgRef", jSONObject2);
            jSONObject.put("fwLvl", this.f147482r);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final long m154460a() {
        return this.f147469e;
    }

    /* renamed from: b */
    public final int m154461b() {
        return this.f147482r;
    }

    /* renamed from: c */
    public final String m154462c() {
        if (this.f147466b == 6) {
            return "group_" + this.f147465a;
        }
        return String.valueOf(this.f147465a);
    }

    /* renamed from: d */
    public final long m154463d() {
        return this.f147470f;
    }

    /* renamed from: e */
    public final long m154464e() {
        return this.f147478n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32027n)) {
            return false;
        }
        C32027n c32027n = (C32027n) obj;
        return this.f147465a == c32027n.f147465a && this.f147466b == c32027n.f147466b && this.f147467c == c32027n.f147467c && this.f147468d == c32027n.f147468d && this.f147469e == c32027n.f147469e && this.f147470f == c32027n.f147470f && this.f147471g == c32027n.f147471g && this.f147472h == c32027n.f147472h && this.f147473i == c32027n.f147473i && this.f147474j == c32027n.f147474j && this.f147475k == c32027n.f147475k && this.f147476l == c32027n.f147476l && this.f147477m == c32027n.f147477m && this.f147478n == c32027n.f147478n && this.f147479o == c32027n.f147479o && this.f147480p == c32027n.f147480p && this.f147481q == c32027n.f147481q && this.f147482r == c32027n.f147482r;
    }

    /* renamed from: f */
    public final long m154465f() {
        return this.f147479o;
    }

    /* renamed from: g */
    public final int m154466g() {
        return this.f147476l;
    }

    /* renamed from: h */
    public final long m154467h() {
        return this.f147477m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((AbstractC2147g0.m11521a(this.f147465a) * 31) + this.f147466b) * 31) + this.f147467c) * 31) + AbstractC2147g0.m11521a(this.f147468d)) * 31) + AbstractC2147g0.m11521a(this.f147469e)) * 31) + AbstractC2147g0.m11521a(this.f147470f)) * 31) + AbstractC2147g0.m11521a(this.f147471g)) * 31) + AbstractC2147g0.m11521a(this.f147472h)) * 31) + this.f147473i.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f147474j)) * 31) + this.f147475k) * 31) + this.f147476l) * 31) + AbstractC2147g0.m11521a(this.f147477m)) * 31) + AbstractC2147g0.m11521a(this.f147478n)) * 31) + AbstractC2147g0.m11521a(this.f147479o)) * 31) + AbstractC2147g0.m11521a(this.f147480p)) * 31) + AbstractC2147g0.m11521a(this.f147481q)) * 31) + this.f147482r;
    }

    /* renamed from: i */
    public final long m154468i() {
        return this.f147474j;
    }

    /* renamed from: j */
    public final int m154469j() {
        return this.f147475k;
    }

    /* renamed from: k */
    public final long m154470k() {
        return this.f147480p;
    }

    /* renamed from: l */
    public final long m154471l() {
        return this.f147481q;
    }

    /* renamed from: m */
    public final long m154472m() {
        return this.f147468d;
    }

    /* renamed from: n */
    public final long m154473n() {
        return this.f147465a;
    }

    /* renamed from: o */
    public final int m154474o() {
        return this.f147466b;
    }

    /* renamed from: p */
    public final long m154475p() {
        return this.f147471g;
    }

    /* renamed from: q */
    public final long m154476q() {
        return this.f147472h;
    }

    /* renamed from: r */
    public final int m154477r() {
        return this.f147467c;
    }

    /* renamed from: s */
    public final boolean m154478s() {
        return this.f147465a > 0 && this.f147468d > 0;
    }

    /* renamed from: t */
    public final boolean m154479t() {
        return this.f147474j > 0 && this.f147477m > 0;
    }

    public String toString() {
        return "ChatContentOriginalMsg(threadId=" + this.f147465a + ", threadType=" + this.f147466b + ", isComm=" + this.f147467c + ", senderId=" + this.f147468d + ", clientId=" + this.f147469e + ", globalId=" + this.f147470f + ", toId=" + this.f147471g + ", ts=" + this.f147472h + ", trackingSource=" + this.f147473i + ", rootThreadId=" + this.f147474j + ", rootThreadType=" + this.f147475k + ", rootIsComm=" + this.f147476l + ", rootSenderId=" + this.f147477m + ", rootClientId=" + this.f147478n + ", rootGlobalId=" + this.f147479o + ", rootToId=" + this.f147480p + ", rootTs=" + this.f147481q + ", forwardLevel=" + this.f147482r + ")";
    }

    /* renamed from: u */
    public final void m154480u(long j11) {
        this.f147469e = j11;
    }

    /* renamed from: v */
    public final void m154481v(int i11) {
        this.f147467c = i11;
    }

    /* renamed from: w */
    public final void m154482w(int i11) {
        this.f147482r = i11;
    }

    /* renamed from: x */
    public final void m154483x(long j11) {
        this.f147470f = j11;
    }

    /* renamed from: y */
    public final void m154484y(long j11) {
        this.f147478n = j11;
    }

    /* renamed from: z */
    public final void m154485z(long j11) {
        this.f147479o = j11;
    }

    public C32027n(long j11, int i11, int i12, long j12, long j13, long j14, long j15, long j16, EnumC26407i enumC26407i, long j17, int i13, int i14, long j18, long j19, long j21, long j22, long j23, int i15) {
        AbstractC19074t.m100208f(enumC26407i, "trackingSource");
        this.f147465a = j11;
        this.f147466b = i11;
        this.f147467c = i12;
        this.f147468d = j12;
        this.f147469e = j13;
        this.f147470f = j14;
        this.f147471g = j15;
        this.f147472h = j16;
        this.f147473i = enumC26407i;
        this.f147474j = j17;
        this.f147475k = i13;
        this.f147476l = i14;
        this.f147477m = j18;
        this.f147478n = j19;
        this.f147479o = j21;
        this.f147480p = j22;
        this.f147481q = j23;
        this.f147482r = i15;
    }

    public /* synthetic */ C32027n(long j11, int i11, int i12, long j12, long j13, long j14, long j15, long j16, EnumC26407i enumC26407i, long j17, int i13, int i14, long j18, long j19, long j21, long j22, long j23, int i15, int i16, AbstractC19060k abstractC19060k) {
        this((i16 & 1) != 0 ? 0L : j11, (i16 & 2) != 0 ? 3 : i11, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0L : j12, (i16 & 16) != 0 ? 0L : j13, (i16 & 32) != 0 ? 0L : j14, (i16 & 64) != 0 ? 0L : j15, (i16 & 128) != 0 ? 0L : j16, (i16 & 256) != 0 ? EnumC26407i.f125522x : enumC26407i, (i16 & 512) != 0 ? 0L : j17, (i16 & 1024) != 0 ? 3 : i13, (i16 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i14, (i16 & 4096) != 0 ? 0L : j18, (i16 & 8192) != 0 ? 0L : j19, (i16 & 16384) != 0 ? 0L : j21, (32768 & i16) != 0 ? 0L : j22, (65536 & i16) != 0 ? 0L : j23, (i16 & 131072) != 0 ? 0 : i15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C32027n(JSONObject jSONObject) {
        this(0L, 0, 0, r16, r16, r16, r16, r16, null, 0L, 0, 0, 0L, 0L, 0L, 0L, 0L, 0, 262143, null);
        AbstractC19074t.m100208f(jSONObject, "json");
        long j11 = 0;
        try {
            try {
                this.f147465a = jSONObject.optLong("tId");
                this.f147466b = jSONObject.optInt("srcType", 3);
                this.f147468d = jSONObject.optLong("srcId");
                this.f147469e = jSONObject.optLong("cmi");
                this.f147470f = jSONObject.optLong("gmi");
                this.f147472h = jSONObject.optLong("ts");
                int optInt = jSONObject.optInt("trs");
                for (EnumC26407i enumC26407i : EnumC26407i.values()) {
                    if (enumC26407i.m136202c() == optInt) {
                        this.f147473i = enumC26407i;
                    }
                }
                this.f147467c = jSONObject.optInt("isComm", 0);
                this.f147471g = jSONObject.optLong("toId");
                JSONObject optJSONObject = jSONObject.optJSONObject("rootMsgRef");
                if (optJSONObject != null) {
                    this.f147474j = optJSONObject.optLong("tId");
                    this.f147475k = optJSONObject.optInt("srcType", 3);
                    this.f147476l = optJSONObject.optInt("isComm", 0);
                    this.f147477m = optJSONObject.optLong("srcId");
                    this.f147478n = optJSONObject.optLong("cmi");
                    this.f147479o = optJSONObject.optLong("gmi");
                    this.f147480p = optJSONObject.optLong("toId");
                    this.f147481q = optJSONObject.optLong("ts");
                }
                this.f147482r = jSONObject.optInt("fwLvl");
            } catch (Exception e11) {
                e = e11;
                AbstractC20110a.f98889a.mo104553f(e, jSONObject.toString(), new Object[0]);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
