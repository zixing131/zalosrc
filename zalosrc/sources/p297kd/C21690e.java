package p297kd;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;
import p320ld.C22438j;
import p348mi.AbstractC23306f;
import p586vt.AbstractC28618c;
import p586vt.AbstractC28626k;

/* renamed from: kd.e */
/* loaded from: classes3.dex */
public final class C21690e extends AbstractC28626k {
    public static final a Companion = new a(null);

    /* renamed from: f */
    public int f105269f;

    /* renamed from: g */
    public boolean f105270g;

    /* renamed from: h */
    private int f105271h;

    /* renamed from: i */
    private int f105272i;

    /* renamed from: j */
    private boolean f105273j;

    /* renamed from: k */
    private boolean f105274k;

    /* renamed from: l */
    private boolean f105275l;

    /* renamed from: m */
    private boolean f105276m;

    /* renamed from: n */
    private boolean f105277n;

    /* renamed from: o */
    private boolean f105278o;

    /* renamed from: p */
    private long f105279p;

    /* renamed from: q */
    private long f105280q;

    /* renamed from: r */
    private int f105281r;

    /* renamed from: s */
    private long f105282s;

    /* renamed from: t */
    private long f105283t;

    /* renamed from: kd.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21690e m111901a(String str) {
            if (str != null && str.length() != 0) {
                return new C21690e(true, str);
            }
            return null;
        }
    }

    public C21690e(boolean z11, String str) {
        super(z11);
        this.f105276m = true;
        this.f105279p = -1L;
        this.f105280q = -1L;
        m111888n(str);
    }

    /* renamed from: A */
    public final boolean m111863A() {
        return C22438j.m115946n(this.f105269f);
    }

    /* renamed from: B */
    public final boolean m111864B() {
        if (m111863A() && !this.f105278o) {
            long j11 = this.f105279p;
            if (j11 != -1) {
                long j12 = this.f105280q;
                if (j12 != -1 && (j11 != 0 || j12 != 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m111865C() {
        return this.f105275l;
    }

    /* renamed from: D */
    public final boolean m111866D() {
        return this.f105274k;
    }

    /* renamed from: E */
    public final boolean m111867E() {
        if (!(m143169b() instanceof C21689d)) {
            return false;
        }
        AbstractC28618c m143169b = m143169b();
        AbstractC19074t.m100206d(m143169b, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
        return ((C21689d) m143169b).m111859g();
    }

    /* renamed from: F */
    public final boolean m111868F() {
        return this.f105277n;
    }

    /* renamed from: G */
    public final boolean m111869G() {
        if (!(m143169b() instanceof C21689d)) {
            return false;
        }
        AbstractC28618c m143169b = m143169b();
        AbstractC19074t.m100206d(m143169b, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
        return ((C21689d) m143169b).m111860h();
    }

    /* renamed from: H */
    public final void m111870H() {
        this.f105278o = false;
        this.f105279p = -1L;
        this.f105280q = -1L;
        this.f105281r = 0;
        this.f105283t = 0L;
        this.f105282s = 0L;
    }

    /* renamed from: I */
    public final void m111871I() {
        AbstractC23306f.m120692n().m133036P(mo96996g());
    }

    /* renamed from: J */
    public final void m111872J(long j11) {
        this.f105283t = j11;
    }

    /* renamed from: K */
    public final void m111873K(boolean z11) {
        this.f105276m = z11;
    }

    /* renamed from: L */
    public final void m111874L(boolean z11) {
        this.f105278o = z11;
    }

    /* renamed from: M */
    public final void m111875M(int i11) {
        this.f105272i = i11;
    }

    /* renamed from: N */
    public final void m111876N(long j11) {
        this.f105280q = j11;
    }

    /* renamed from: O */
    public final void m111877O(long j11) {
        this.f105279p = j11;
    }

    /* renamed from: P */
    public final void m111878P(boolean z11) {
        this.f105275l = z11;
    }

    /* renamed from: Q */
    public final void m111879Q(boolean z11) {
        this.f105274k = z11;
    }

    /* renamed from: R */
    public final void m111880R(long j11) {
        this.f105282s = j11;
    }

    /* renamed from: S */
    public final void m111881S(C21689d c21689d, boolean z11) {
        m143177l(z11);
        m143175j(c21689d);
    }

    /* renamed from: T */
    public final void m111882T(boolean z11) {
        this.f105277n = z11;
    }

    /* renamed from: U */
    public final void m111883U(int i11) {
        this.f105281r = i11;
    }

    /* renamed from: V */
    public final void m111884V(int i11) {
        this.f105271h = i11;
    }

    /* renamed from: W */
    public final void m111885W(boolean z11) {
        this.f105273j = z11;
    }

    /* renamed from: X */
    public final void m111886X(boolean z11) {
        m143176k(z11);
        m111871I();
    }

    @Override // p586vt.AbstractC28626k
    /* renamed from: g */
    public String mo96996g() {
        JSONObject jSONObject = new JSONObject();
        String str = null;
        try {
            jSONObject.put("entry_point", this.f105269f);
            jSONObject.put("isfullflow", this.f105270g ? 1 : 0);
            jSONObject.put("status_shown", m143171e() ? 1 : 0);
            jSONObject.put("event_time", m143168a());
            jSONObject.put("trigger_status", this.f105271h);
            jSONObject.put("force_set_pass_ep", this.f105272i);
            jSONObject.put("valid_sync_media", this.f105273j);
            jSONObject.put("is_canceled", mo96995c() ? 1 : 0);
            jSONObject.put("enable_backup_e2ee", this.f105276m ? 1 : 0);
            jSONObject.put("is_sync_media_only", this.f105277n ? 1 : 0);
            if (m143169b() != null) {
                AbstractC28618c m143169b = m143169b();
                AbstractC19074t.m100205c(m143169b);
                jSONObject.put("error_phase", m143169b.m143142c());
                AbstractC28618c m143169b2 = m143169b();
                AbstractC19074t.m100205c(m143169b2);
                jSONObject.put("error_pos", m143169b2.m143143d());
                AbstractC28618c m143169b3 = m143169b();
                AbstractC19074t.m100205c(m143169b3);
                jSONObject.put("error_code", m143169b3.m143140a());
                AbstractC28618c m143169b4 = m143169b();
                AbstractC19074t.m100205c(m143169b4);
                jSONObject.put("error_mes", m143169b4.m143141b());
                AbstractC28618c m143169b5 = m143169b();
                AbstractC19074t.m100206d(m143169b5, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
                jSONObject.put("is_network_error", ((C21689d) m143169b5).mo97004e());
                AbstractC28618c m143169b6 = m143169b();
                AbstractC19074t.m100206d(m143169b6, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
                jSONObject.put("is_fullstorage_error", ((C21689d) m143169b6).m111858f());
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            jSONObject = null;
        }
        if (jSONObject != null) {
            str = jSONObject.toString();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public final void m111887m(C21690e c21690e) {
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        this.f105269f = c21690e.f105269f;
        this.f105271h = c21690e.f105271h;
        this.f105272i = c21690e.f105272i;
        this.f105273j = c21690e.f105273j;
        this.f105276m = c21690e.f105276m;
    }

    /* renamed from: n */
    protected void m111888n(String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f105269f = jSONObject.optInt("entry_point");
                    if (jSONObject.optInt("isfullflow", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f105270g = z11;
                    if (jSONObject.optInt("status_shown", 1) == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m143176k(z12);
                    m143174i(jSONObject.optLong("event_time"));
                    this.f105271h = jSONObject.optInt("trigger_status", 0);
                    this.f105272i = jSONObject.optInt("force_set_pass_ep", 0);
                    this.f105273j = jSONObject.optBoolean("valid_sync_media", true);
                    if (jSONObject.optInt("is_canceled", 0) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m143173h(z13);
                    if (jSONObject.optInt("enable_backup_e2ee", 1) == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f105276m = z14;
                    if (jSONObject.optInt("is_sync_media_only", 0) == 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f105277n = z15;
                    if (jSONObject.has("error_phase") && jSONObject.has("error_code") && jSONObject.has("error_pos")) {
                        m143175j(new C21689d(jSONObject.getInt("error_phase"), jSONObject.optInt("error_pos"), jSONObject.optInt("error_code"), jSONObject.optString("error_mes")));
                        AbstractC28618c m143169b = m143169b();
                        AbstractC19074t.m100206d(m143169b, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
                        ((C21689d) m143169b).m111862j(jSONObject.optBoolean("is_network_error", false));
                        AbstractC28618c m143169b2 = m143169b();
                        AbstractC19074t.m100206d(m143169b2, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
                        ((C21689d) m143169b2).m111861i(jSONObject.optBoolean("is_fullstorage_error", false));
                        m143177l(false);
                    } else {
                        m143177l(true);
                    }
                }
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: o */
    public final long m111889o() {
        return this.f105283t;
    }

    /* renamed from: p */
    public final boolean m111890p() {
        return this.f105276m;
    }

    /* renamed from: q */
    public final int m111891q() {
        return this.f105272i;
    }

    /* renamed from: r */
    public final long m111892r() {
        return this.f105280q;
    }

    /* renamed from: s */
    public final long m111893s() {
        return this.f105279p;
    }

    /* renamed from: t */
    public final long m111894t() {
        return this.f105282s;
    }

    @Override // p586vt.AbstractC28626k
    public String toString() {
        return "SyncSessionInfo(entryPoint=" + this.f105269f + ")";
    }

    /* renamed from: u */
    public final C21689d m111895u() {
        if (m143169b() != null && (m143169b() instanceof C21689d)) {
            AbstractC28618c m143169b = m143169b();
            AbstractC19074t.m100206d(m143169b, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncErrorData");
            return (C21689d) m143169b;
        }
        return null;
    }

    /* renamed from: v */
    public final int m111896v() {
        return this.f105281r;
    }

    /* renamed from: w */
    public final int m111897w() {
        return this.f105271h;
    }

    /* renamed from: x */
    public final boolean m111898x() {
        return this.f105273j;
    }

    /* renamed from: y */
    public final boolean m111899y() {
        return this.f105269f == 1;
    }

    /* renamed from: z */
    public final boolean m111900z() {
        int i11 = this.f105269f;
        return i11 == 20 || i11 == 21;
    }
}
