package dj;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.g1 */
/* loaded from: classes3.dex */
public final class C17964g1 extends C17969i0 {
    public static final a Companion = new a(null);

    /* renamed from: B */
    private boolean f90959B;

    /* renamed from: C */
    private String f90960C;

    /* renamed from: D */
    private long f90961D;

    /* renamed from: E */
    private int f90962E;

    /* renamed from: F */
    private boolean f90963F;

    /* renamed from: G */
    private String f90964G;

    /* renamed from: H */
    private String f90965H;

    /* renamed from: I */
    private int f90966I;

    /* renamed from: J */
    private int f90967J;

    /* renamed from: dj.g1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17964g1(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f90959B = true;
        this.f90960C = "";
        try {
            if (TextUtils.isEmpty(this.f91017v)) {
                return;
            }
            m95518v(new JSONObject(this.f91017v));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    private final boolean m95517j(int i11) {
        return (this.f90967J & i11) == i11;
    }

    /* renamed from: v */
    private final void m95518v(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("fileValid")) {
                boolean z11 = true;
                if (AbstractC18069a.m96085d(jSONObject, "fileValid") != 1) {
                    z11 = false;
                }
                this.f90959B = z11;
            }
            if (jSONObject.has("m4a")) {
                String m96089h = AbstractC18069a.m96089h(jSONObject, "m4a");
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                this.f90960C = m96089h;
            }
            this.f90962E = jSONObject.optInt("duration", 0);
            this.f90963F = jSONObject.optBoolean("isPlayed", false);
            this.f90961D = jSONObject.optLong("fileSize");
        }
    }

    /* renamed from: y */
    private final void m95519y(int i11, boolean z11) {
        int i12;
        if (z11) {
            i12 = i11 | this.f90967J;
        } else {
            i12 = (~i11) & this.f90967J;
        }
        this.f90967J = i12;
    }

    /* renamed from: A */
    public final void m95520A(int i11) {
        this.f90967J = i11;
    }

    /* renamed from: B */
    public final void m95521B(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f90960C = str;
    }

    /* renamed from: C */
    public final void m95522C(boolean z11) {
        this.f90963F = z11;
    }

    /* renamed from: D */
    public final void m95523D(int i11) {
        this.f90966I = i11;
    }

    /* renamed from: E */
    public final void m95524E(String str) {
        this.f90965H = str;
    }

    /* renamed from: F */
    public final void m95525F(boolean z11) {
        m95519y(8, z11);
    }

    /* renamed from: G */
    public final void m95526G(boolean z11) {
        m95519y(2, z11);
    }

    /* renamed from: H */
    public final void m95527H(boolean z11) {
        m95519y(1, z11);
    }

    /* renamed from: I */
    public final void m95528I(String str) {
        this.f90964G = str;
    }

    /* renamed from: J */
    public final void m95529J() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileValid", this.f90959B ? 1 : 0);
            long j11 = this.f90961D;
            if (j11 > 0) {
                jSONObject.put("fileSize", j11);
            }
            if (!TextUtils.isEmpty(this.f90960C)) {
                jSONObject.put("m4a", this.f90960C);
            }
            jSONObject.put("duration", this.f90962E);
            jSONObject.put("isPlayed", this.f90963F);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            this.f91017v = jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final int m95530g() {
        return this.f90962E;
    }

    /* renamed from: h */
    public final long m95531h() {
        return this.f90961D;
    }

    /* renamed from: i */
    public final boolean m95532i() {
        return this.f90959B;
    }

    /* renamed from: k */
    public final int m95533k() {
        return this.f90967J;
    }

    /* renamed from: l */
    public final String m95534l() {
        return this.f90960C;
    }

    /* renamed from: m */
    public final int m95535m() {
        return this.f90966I;
    }

    /* renamed from: n */
    public final String m95536n() {
        return this.f90965H;
    }

    /* renamed from: o */
    public final String m95537o() {
        try {
            if (!TextUtils.isEmpty(this.f90960C)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("m4a", this.f90960C);
                jSONObject.put("duration", this.f90962E);
                long j11 = this.f90961D;
                if (j11 > 0) {
                    jSONObject.put("fileSize", j11);
                }
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            return "";
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: p */
    public final String m95538p() {
        return this.f90964G;
    }

    /* renamed from: q */
    public final boolean m95539q() {
        return m95517j(4);
    }

    /* renamed from: r */
    public final boolean m95540r() {
        return this.f90963F;
    }

    /* renamed from: s */
    public final boolean m95541s() {
        return m95517j(8);
    }

    /* renamed from: t */
    public final boolean m95542t() {
        return m95517j(2);
    }

    /* renamed from: u */
    public final boolean m95543u() {
        return m95517j(1);
    }

    /* renamed from: w */
    public final void m95544w(int i11) {
        this.f90962E = i11;
    }

    /* renamed from: x */
    public final void m95545x(long j11) {
        this.f90961D = j11;
    }

    /* renamed from: z */
    public final void m95546z(boolean z11) {
        m95519y(4, z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17964g1(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f90959B = true;
        this.f90960C = "";
        try {
            if (TextUtils.isEmpty(this.f91017v)) {
                return;
            }
            m95518v(new JSONObject(this.f91017v));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
