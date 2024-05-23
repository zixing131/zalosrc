package d60;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.C20128b;
import k30.C21459a;
import mk.C23331i;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p173fz.C19172a;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p405ov.C24559a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: d60.b */
/* loaded from: classes.dex */
public final class C17793b {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f89967c;

    /* renamed from: a */
    private boolean f89968a;

    /* renamed from: b */
    private d f89969b = new d();

    /* renamed from: d60.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f89970q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C17793b mo12V4() {
            return c.f89971a.m93940a();
        }
    }

    /* renamed from: d60.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17793b m93939a() {
            return (C17793b) C17793b.f89967c.getValue();
        }
    }

    /* renamed from: d60.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f89971a = new c();

        /* renamed from: b */
        private static final C17793b f89972b = new C17793b();

        private c() {
        }

        /* renamed from: a */
        public final C17793b m93940a() {
            return f89972b;
        }
    }

    /* renamed from: d60.b$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private long f89973a;

        /* renamed from: b */
        private long f89974b;

        /* renamed from: c */
        private long f89975c;

        /* renamed from: d */
        private long f89976d;

        /* renamed from: e */
        private long f89977e;

        /* renamed from: f */
        private long f89978f;

        /* renamed from: g */
        private long f89979g;

        /* renamed from: h */
        private long f89980h;

        /* renamed from: i */
        private long f89981i;

        /* renamed from: j */
        private long f89982j;

        /* renamed from: k */
        private long f89983k;

        /* renamed from: l */
        private long f89984l;

        /* renamed from: m */
        private long f89985m;

        /* renamed from: n */
        private boolean f89986n;

        /* renamed from: a */
        public final long m93941a() {
            return this.f89983k;
        }

        /* renamed from: b */
        public final long m93942b() {
            return this.f89982j;
        }

        /* renamed from: c */
        public final long m93943c() {
            return this.f89975c;
        }

        /* renamed from: d */
        public final long m93944d() {
            return this.f89974b;
        }

        /* renamed from: e */
        public final long m93945e() {
            return this.f89977e;
        }

        /* renamed from: f */
        public final long m93946f() {
            return this.f89976d;
        }

        /* renamed from: g */
        public final long m93947g() {
            return this.f89973a;
        }

        /* renamed from: h */
        public final boolean m93948h() {
            return this.f89986n;
        }

        /* renamed from: i */
        public final void m93949i(long j11) {
            this.f89983k = j11;
        }

        /* renamed from: j */
        public final void m93950j(long j11) {
            this.f89982j = j11;
        }

        /* renamed from: k */
        public final void m93951k(long j11) {
            this.f89985m = j11;
        }

        /* renamed from: l */
        public final void m93952l(long j11) {
            this.f89979g = j11;
        }

        /* renamed from: m */
        public final void m93953m(long j11) {
            this.f89978f = j11;
        }

        /* renamed from: n */
        public final void m93954n(long j11) {
            this.f89981i = j11;
        }

        /* renamed from: o */
        public final void m93955o(long j11) {
            this.f89980h = j11;
        }

        /* renamed from: p */
        public final void m93956p(long j11) {
            this.f89975c = j11;
        }

        /* renamed from: q */
        public final void m93957q(long j11) {
            this.f89974b = j11;
        }

        /* renamed from: r */
        public final void m93958r(long j11) {
            this.f89977e = j11;
        }

        /* renamed from: s */
        public final void m93959s(long j11) {
            this.f89976d = j11;
        }

        /* renamed from: t */
        public final void m93960t(long j11) {
            this.f89973a = j11;
        }

        /* renamed from: u */
        public final void m93961u(long j11) {
            this.f89984l = j11;
        }

        /* renamed from: v */
        public final String m93962v() {
            boolean z11;
            long j11 = this.f89973a;
            long j12 = this.f89974b;
            long j13 = this.f89975c;
            long j14 = this.f89976d;
            long j15 = this.f89977e;
            long j16 = this.f89978f;
            long j17 = this.f89979g;
            long j18 = this.f89980h;
            long j19 = this.f89981i;
            long j21 = this.f89982j;
            long j22 = this.f89983k;
            long j23 = this.f89984l;
            long j24 = this.f89985m;
            if (j24 > j11 && j13 > j12 && j15 > j14 && j17 > j16 && j19 > j18 && j22 > j21 && j24 > j23) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f89986n = z11;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_start", j11);
                jSONObject.put("load_friend_start", j12);
                jSONObject.put("load_friend_finished", j13);
                jSONObject.put("load_mute_start", j14);
                jSONObject.put("load_mute_finished", j15);
                jSONObject.put("load_alias_start", j16);
                jSONObject.put("load_alias_finished", j17);
                jSONObject.put("load_conversations_start", j18);
                jSONObject.put("load_conversations_finished", j19);
                jSONObject.put("build_items_start", j21);
                jSONObject.put("build_items_finished", j22);
                jSONObject.put("loading_show", j23);
                jSONObject.put("loading_hide", j24);
                jSONObject.put("total_conversations", AbstractC23306f.m120572D0().m103200Q().size());
                jSONObject.put("device_class", C19172a.m100601l("device_classification@class_value", 0, 2, null));
                jSONObject.put("battery_saver_on", C23331i.f113531a.m122736l(7, MainApplication.Companion.m35500c()));
                jSONObject.put("storage_free", (int) C21459a.m111034b(C20128b.m104764k()));
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100205c(jSONObject2);
                return jSONObject2;
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                return "";
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f89970q);
        f89967c = m129210a;
    }

    /* renamed from: c */
    private final void m93922c() {
        this.f89969b.m93960t(MainApplication.Companion.m35505h());
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        boolean z11 = this.f89968a;
        ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
        aVar.mo104548a("AppStartUpLogger isNormalFlow: " + z11 + ", time create activity: " + (c10971a.m57115g() - this.f89969b.m93947g()), new Object[0]);
        if (this.f89968a && c10971a.m57115g() - this.f89969b.m93947g() <= 1000) {
            this.f89968a = false;
            String m93962v = this.f89969b.m93962v();
            if (m93962v.length() == 0) {
                return;
            }
            if (!this.f89969b.m93948h()) {
                aVar.mo104548a("AppStartUpLogger invalid log", new Object[0]);
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109235m(20411, m93962v, str, 0, 0L, CoreUtility.f89236l);
                return;
            }
            C24559a.m127933c("AppStartUpLogger", "data: " + m93962v);
            C0815e1.m2075D().m2100V(new C23648e(1, "", 1, "app_start_up_log", m93962v), false);
        }
    }

    /* renamed from: d */
    public static final C17793b m93923d() {
        return Companion.m93939a();
    }

    /* renamed from: n */
    public static final void m93924n(C17793b c17793b) {
        AbstractC19074t.m100208f(c17793b, "this$0");
        c17793b.m93922c();
    }

    /* renamed from: e */
    public final void m93925e() {
        if (this.f89969b.m93941a() == 0) {
            this.f89969b.m93949i(System.currentTimeMillis());
        }
    }

    /* renamed from: f */
    public final void m93926f() {
        if (this.f89969b.m93942b() == 0) {
            this.f89969b.m93950j(System.currentTimeMillis());
        }
    }

    /* renamed from: g */
    public final void m93927g() {
        this.f89969b.m93952l(System.currentTimeMillis());
    }

    /* renamed from: h */
    public final void m93928h() {
        this.f89969b.m93953m(System.currentTimeMillis());
    }

    /* renamed from: i */
    public final void m93929i() {
        this.f89969b.m93954n(System.currentTimeMillis());
    }

    /* renamed from: j */
    public final void m93930j() {
        this.f89969b.m93955o(System.currentTimeMillis());
    }

    /* renamed from: k */
    public final void m93931k() {
        if (this.f89969b.m93945e() == 0) {
            this.f89969b.m93958r(System.currentTimeMillis());
        }
    }

    /* renamed from: l */
    public final void m93932l() {
        if (this.f89969b.m93946f() == 0) {
            this.f89969b.m93959s(System.currentTimeMillis());
        }
    }

    /* renamed from: m */
    public final void m93933m() {
        this.f89969b.m93951k(System.currentTimeMillis());
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: d60.a
            public /* synthetic */ RunnableC17792a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17793b.m93924n(C17793b.this);
            }
        });
    }

    /* renamed from: o */
    public final void m93934o() {
        if (this.f89969b.m93943c() == 0) {
            this.f89969b.m93956p(System.currentTimeMillis());
        }
    }

    /* renamed from: p */
    public final void m93935p() {
        if (this.f89969b.m93944d() == 0) {
            this.f89969b.m93957q(System.currentTimeMillis());
        }
    }

    /* renamed from: q */
    public final void m93936q() {
        this.f89969b.m93961u(System.currentTimeMillis());
    }

    /* renamed from: r */
    public final void m93937r(boolean z11) {
        this.f89968a = z11;
    }
}
