package c40;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import bg0.C2797c;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.restore.RestoreMessageStartupView;
import com.zing.zalo.p077ui.zviews.ZinstantZaloView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import d40.C17736a;
import dg0.AbstractC17930e;
import e40.C18198a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import il.C20604a;
import java.util.List;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p297kd.C21688c;
import p301kl.C21758b;
import p320ld.C22440l;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import p429pv.C24911a;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28617b;
import p586vt.AbstractC28626k;
import p586vt.C28624i;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sc.C26220b;
import si.C26263i;
import si.C26268n;

/* renamed from: c40.k */
/* loaded from: classes.dex */
public final class C3282k {
    public static final b Companion = new b(null);

    /* renamed from: j */
    private static final InterfaceC24854k f14047j;

    /* renamed from: a */
    private final C21688c f14048a;

    /* renamed from: b */
    private final C28624i f14049b;

    /* renamed from: c */
    private final C20604a f14050c;

    /* renamed from: d */
    private final C26268n f14051d;

    /* renamed from: e */
    private final C17736a f14052e;

    /* renamed from: f */
    private final C3284m f14053f;

    /* renamed from: g */
    private final InterfaceC23792b f14054g;

    /* renamed from: h */
    private final C2797c f14055h;

    /* renamed from: i */
    private int f14056i;

    /* renamed from: c40.k$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f14057q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3282k mo12V4() {
            return c.f14058a.m16690a();
        }
    }

    /* renamed from: c40.k$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3282k m16689a() {
            return (C3282k) C3282k.f14047j.getValue();
        }
    }

    /* renamed from: c40.k$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f14058a = new c();

        /* renamed from: b */
        private static final C3282k f14059b;

        static {
            C21688c m111854a = C21688c.Companion.m111854a();
            C28624i m143166a = C28624i.Companion.m143166a();
            C20604a m120591J1 = AbstractC23306f.m120591J1();
            AbstractC19074t.m100207e(m120591J1, "provideTransferMsgRepo(...)");
            C26268n m120680k = AbstractC23306f.m120680k();
            AbstractC19074t.m100207e(m120680k, "provideBackupRestoreDB(...)");
            C17736a m120594K1 = AbstractC23306f.m120594K1();
            AbstractC19074t.m100207e(m120594K1, "provideTransferMsgToPCConfigs(...)");
            C3284m m120597L1 = AbstractC23306f.m120597L1();
            AbstractC19074t.m100207e(m120597L1, "provideTransferMsgUIHandler(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f14059b = new C3282k(m111854a, m143166a, m120591J1, m120680k, m120594K1, m120597L1, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C3282k m16690a() {
            return f14059b;
        }
    }

    /* renamed from: c40.k$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f14061r;

        /* renamed from: s */
        final /* synthetic */ String f14062s;

        /* renamed from: t */
        final /* synthetic */ long f14063t;

        /* renamed from: u */
        final /* synthetic */ long f14064u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, long j11, long j12) {
            super(1);
            this.f14061r = str;
            this.f14062s = str2;
            this.f14063t = j11;
            this.f14064u = j12;
        }

        /* renamed from: a */
        public final void m16691a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
            C3282k c3282k = C3282k.this;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            c3282k.m16681G(str, this.f14061r, this.f14062s, this.f14063t, this.f14064u);
            C18719a.m98717j("1");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m16691a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: c40.k$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final e f14065q = new e();

        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m16692a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m16692a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: c40.k$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f14066q = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m16693a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m16693a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: c40.k$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final g f14067q = new g();

        g() {
            super(2);
        }

        /* renamed from: a */
        public final void m16694a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m16694a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f14057q);
        f14047j = m129210a;
    }

    public C3282k(C21688c c21688c, C28624i c28624i, C20604a c20604a, C26268n c26268n, C17736a c17736a, C3284m c3284m, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c21688c, "dbStateSubject");
        AbstractC19074t.m100208f(c28624i, "jobManager");
        AbstractC19074t.m100208f(c20604a, "transferMsgRepo");
        AbstractC19074t.m100208f(c26268n, "backupRestoreDB");
        AbstractC19074t.m100208f(c17736a, "transferMsgToPCConfigs");
        AbstractC19074t.m100208f(c3284m, "transferMsgUIHandler");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f14048a = c21688c;
        this.f14049b = c28624i;
        this.f14050c = c20604a;
        this.f14051d = c26268n;
        this.f14052e = c17736a;
        this.f14053f = c3284m;
        this.f14054g = interfaceC23792b;
        this.f14055h = new C2797c(AbstractC0837p0.Companion.m2237f());
    }

    /* renamed from: B */
    private final boolean m16652B(String str) {
        if (str.length() == 0) {
            return false;
        }
        return C24911a.f119528a.m129580f(str);
    }

    /* renamed from: C */
    private final boolean m16653C(String str, String str2, String str3, long j11) {
        if (str.length() > 0 && str2.length() > 0 && str3.length() > 0 && AbstractC19074t.m100204b(str3, CoreUtility.f89233i) && j11 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static final void m16654E() {
        C28624i.a aVar = C28624i.Companion;
        AbstractC28617b m143160e = aVar.m143166a().m143160e("PC_TRANSFER");
        if (m143160e instanceof C18198a) {
            C18198a c18198a = (C18198a) m143160e;
            c18198a.m96984I(1);
            if (aVar.m143166a().m143162g(m143160e)) {
                C26263i.m135055u().m135067D(1, c18198a.m96982D(), c18198a.m96981B());
            }
        }
    }

    /* renamed from: I */
    public static final void m16655I(C3282k c3282k, int i11) {
        AbstractC19074t.m100208f(c3282k, "this$0");
        c3282k.f14055h.mo13474a(new Runnable() { // from class: c40.h

            /* renamed from: q */
            public final /* synthetic */ int f14039q;

            public /* synthetic */ RunnableC3279h(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3282k.m16656J(C3282k.this, r2);
            }
        });
    }

    /* renamed from: J */
    public static final void m16656J(C3282k c3282k, int i11) {
        AbstractC19074t.m100208f(c3282k, "this$0");
        List<AbstractC28617b> m143161f = c3282k.f14049b.m143161f();
        if (m143161f.isEmpty()) {
            return;
        }
        C18719a.m98714g("SMLTransferMsgManager", "updateDeviceStatus(): " + i11, null, 4, null);
        for (AbstractC28617b abstractC28617b : m143161f) {
            if (abstractC28617b instanceof C18198a) {
                ((C18198a) abstractC28617b).m96985J(i11);
            }
        }
    }

    /* renamed from: l */
    private final void m16668l(String str, JSONObject jSONObject, String str2, String str3, long j11, long j12) {
        C18719a.m98714g("SMLTransferMsgManager", "Auto accept Transfer Msg", null, 4, null);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.i

            /* renamed from: p */
            public final /* synthetic */ JSONObject f14040p;

            /* renamed from: q */
            public final /* synthetic */ String f14041q;

            /* renamed from: r */
            public final /* synthetic */ C3282k f14042r;

            /* renamed from: s */
            public final /* synthetic */ String f14043s;

            /* renamed from: t */
            public final /* synthetic */ String f14044t;

            /* renamed from: u */
            public final /* synthetic */ long f14045u;

            /* renamed from: v */
            public final /* synthetic */ long f14046v;

            public /* synthetic */ RunnableC3280i(JSONObject jSONObject2, String str4, C3282k this, String str32, String str22, long j112, long j122) {
                r1 = jSONObject2;
                r2 = str4;
                r3 = this;
                r4 = str32;
                r5 = str22;
                r6 = j112;
                r8 = j122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3282k.m16669m(r1, r2, r3, r4, r5, r6, r8);
            }
        });
    }

    /* renamed from: m */
    public static final void m16669m(JSONObject jSONObject, String str, C3282k c3282k, String str2, String str3, long j11, long j12) {
        AbstractC19074t.m100208f(jSONObject, "$item");
        AbstractC19074t.m100208f(str, "$tempKey");
        AbstractC19074t.m100208f(c3282k, "this$0");
        AbstractC19074t.m100208f(str2, "$publicKey");
        AbstractC19074t.m100208f(str3, "$pcName");
        AbstractC23309i.m121464To();
        AbstractC23309i.m122209nh(jSONObject.toString());
        AbstractC0924m0.m2968Ci(str);
        AbstractC23775p0.m124197b("pc_request_sync");
        c3282k.f14050c.m107234d(1, str2, str3, new d(str3, str2, j11, j12), e.f14065q);
    }

    /* renamed from: q */
    public static final C3282k m16670q() {
        return Companion.m16689a();
    }

    /* renamed from: r */
    private final String m16671r(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "" : "UPLOAD" : "ENCRYPT" : "COMPRESS" : "EXPORT" : Image.SCALE_TYPE_NONE;
    }

    /* renamed from: t */
    public static final void m16672t() {
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    /* renamed from: u */
    public static final void m16673u() {
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    /* renamed from: v */
    public static final void m16674v(C3282k c3282k, C21758b c21758b) {
        AbstractC19074t.m100208f(c3282k, "this$0");
        AbstractC19074t.m100208f(c21758b, "$param");
        c3282k.f14050c.m107236g(c21758b, f.f14066q, g.f14067q);
    }

    /* renamed from: w */
    public static final void m16675w(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "$item");
        AbstractC23309i.m122209nh(jSONObject.toString());
        AbstractC23309i.m121464To();
    }

    /* renamed from: x */
    public static final void m16676x(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "$item");
        AbstractC23309i.m122209nh(jSONObject.toString());
        AbstractC23309i.m121464To();
    }

    /* renamed from: y */
    public static final void m16677y() {
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    /* renamed from: A */
    public final synchronized boolean m16678A() {
        boolean z11;
        if (this.f14056i != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: D */
    public final void m16679D() {
        this.f14055h.mo13474a(new Runnable() { // from class: c40.j
            @Override // java.lang.Runnable
            public final void run() {
                C3282k.m16654E();
            }
        });
    }

    /* renamed from: F */
    public final void m16680F(String str, int i11, AbstractC28626k abstractC28626k) {
        AbstractC19074t.m100208f(str, "uid");
        C18719a.m98714g("SMLTransferMsgManager", "setTransferState(): " + m16671r(i11), null, 4, null);
        synchronized (this) {
            this.f14056i = i11;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        this.f14048a.m111843F(new C21688c.c(str, i11, abstractC28626k));
    }

    /* renamed from: G */
    public final synchronized void m16681G(String str, String str2, String str3, long j11, long j12) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(str3, "publicKey");
        if (this.f14056i != 0) {
            C18719a.m98715h("Another transfer is in progress!");
            return;
        }
        if (C22447s.m116054q0(false, 1, null)) {
            this.f14048a.m111849u(C22440l.m115973c(), "PC_TRANSFER");
        } else {
            C18719a.m98714g("SMLTransferMsgManager", "Ignore noti observer transfer", null, 4, null);
        }
        C18719a.m98712e("SMLTransferMsgManager", "Start transfer msg to PC: userId=" + str + ", pcName=" + str2 + ", publicKey=" + str3 + ", fromSeqId=" + j11 + ", minSeqId=" + j12, C18719a.a.f94033p);
        C18198a c18198a = new C18198a(str, str2, str3, j11, j12);
        c18198a.m143136q(true);
        c18198a.m143138s(System.currentTimeMillis());
        this.f14049b.m143163h(c18198a);
        this.f14048a.m111839A();
    }

    /* renamed from: H */
    public final void m16682H(int i11) {
        if (!m16678A()) {
            return;
        }
        AbstractC17930e.Companion.m94551d().mo94530d("UPDATE_DEVICE_STATUS_WHILE_TRANSFER", new Runnable() { // from class: c40.a

            /* renamed from: q */
            public final /* synthetic */ int f14033q;

            public /* synthetic */ RunnableC3272a(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3282k.m16655I(C3282k.this, r2);
            }
        }, 2000L);
    }

    /* renamed from: n */
    public final void m16683n() {
        AbstractC23309i.m122209nh("");
    }

    /* renamed from: o */
    public final void m16684o() {
        AbstractC0924m0.m2968Ci("");
    }

    /* renamed from: p */
    public final void m16685p() {
        C24911a c24911a = C24911a.f119528a;
        String m3009E1 = AbstractC0924m0.m3009E1();
        AbstractC19074t.m100207e(m3009E1, "getKeyValidateTransferMsgFromCmd600(...)");
        c24911a.m129578a(m3009E1);
    }

    /* renamed from: s */
    public final void m16686s(JSONObject jSONObject, boolean z11) {
        long j11;
        long j12;
        boolean z12;
        String str;
        AbstractC19074t.m100208f(jSONObject, "item");
        String optString = jSONObject.optString("userId");
        String optString2 = jSONObject.optString("pc-name");
        String optString3 = jSONObject.optString("publicKey");
        long optLong = jSONObject.optLong("fromSeqId");
        if (optLong < 0) {
            j11 = 0;
        } else {
            j11 = optLong;
        }
        long optLong2 = jSONObject.optLong("min_seq_id");
        if (optLong2 >= 0 && optLong2 <= j11) {
            j12 = optLong2;
        } else {
            j12 = 0;
        }
        long optLong3 = jSONObject.optLong("startTime");
        if (jSONObject.optInt("is_retry", 0) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        String optString4 = jSONObject.optString("temp_key");
        if (C26263i.m135055u().m135071M()) {
            C26263i.m135055u().m135067D(2, optString3, optString2);
            C18719a.m98717j("4");
            C18719a.m98711d("Request transfer message while syncing at client", C18719a.a.f94036s);
            return;
        }
        if (m16678A()) {
            C18719a.m98711d("Request transfer message while transferring data at client", C18719a.a.f94036s);
            return;
        }
        AbstractC19074t.m100205c(optString3);
        AbstractC19074t.m100205c(optString2);
        AbstractC19074t.m100205c(optString);
        if (m16653C(optString3, optString2, optString, optLong3) && !AbstractC23304d.f113427q1.get()) {
            if (this.f14054g.mo124314i() - optLong3 > AbstractC23309i.m121486U9() * 1000) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3282k.m16673u();
                    }
                });
                return;
            }
            if (z12) {
                try {
                    C18719a.m98714g("SMLTransferMsgManager", "Retry request transfer message", null, 4, null);
                } catch (Exception e11) {
                    e = e11;
                    str = "SMLTransferMsgManager";
                }
            }
            AbstractC19074t.m100205c(optString4);
            if (!m16652B(optString4)) {
                str = "SMLTransferMsgManager";
                try {
                    if (optString4.length() > 0) {
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.d

                            /* renamed from: q */
                            public final /* synthetic */ C21758b f14035q;

                            public /* synthetic */ RunnableC3275d(C21758b c21758b) {
                                r2 = c21758b;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3282k.m16674v(C3282k.this, r2);
                            }
                        });
                        return;
                    }
                    InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
                    if (!AbstractC23304d.f113330T0 && (m57112d == null || m57112d.mo35579p().m92993D0(ZinstantZaloView.class) == null)) {
                        if (m57112d != null) {
                            try {
                                C17487o0 mo35579p = m57112d.mo35579p();
                                if (mo35579p != null) {
                                    if (mo35579p.m93012K0() instanceof RestoreMessageStartupView) {
                                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.f

                                            /* renamed from: p */
                                            public final /* synthetic */ JSONObject f14037p;

                                            public /* synthetic */ RunnableC3277f(JSONObject jSONObject2) {
                                                r1 = jSONObject2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C3282k.m16676x(r1);
                                            }
                                        });
                                        return;
                                    }
                                }
                            } catch (Exception e12) {
                                C26220b.m134821d(str, e12);
                            }
                        }
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3282k.m16677y();
                            }
                        });
                        this.f14053f.m16700e(optString, optString2, optString3, j11, j12);
                        return;
                    }
                    if (!z11) {
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.e

                            /* renamed from: p */
                            public final /* synthetic */ JSONObject f14036p;

                            public /* synthetic */ RunnableC3276e(JSONObject jSONObject2) {
                                r1 = jSONObject2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3282k.m16675w(r1);
                            }
                        });
                    }
                    this.f14053f.m16699d(optString, optString2, optString3, j11, j12);
                    return;
                } catch (Exception e13) {
                    e = e13;
                }
            } else {
                try {
                    m16668l(optString4, jSONObject2, optString2, optString3, j11, j12);
                    return;
                } catch (Exception e14) {
                    e = e14;
                    str = "SMLTransferMsgManager";
                }
            }
            C26220b.m134821d(str, e);
            return;
        }
        C18719a.m98712e("SMLTransferMsgManager", "Invalid transfer request", C18719a.a.f94036s);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: c40.b
            @Override // java.lang.Runnable
            public final void run() {
                C3282k.m16672t();
            }
        });
    }

    /* renamed from: z */
    public final boolean m16687z() {
        String m3009E1 = AbstractC0924m0.m3009E1();
        AbstractC19074t.m100207e(m3009E1, "getKeyValidateTransferMsgFromCmd600(...)");
        if (m3009E1.length() > 0) {
            return true;
        }
        return false;
    }
}
