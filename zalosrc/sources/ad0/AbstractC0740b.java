package ad0;

import ad0.AbstractC0740b;
import ad0.InterfaceC0747i;
import android.graphics.Bitmap;
import androidx.work.AbstractC2144f;
import c30.C3255n;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p098dc.InterfaceC17872f;
import p471r3.C25630b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sh0.AbstractC26250b;
import sh0.C26253e;
import vg.C28181s2;

/* renamed from: ad0.b */
/* loaded from: classes4.dex */
public abstract class AbstractC0740b implements InterfaceC0744f {
    public static final a Companion = new a(null);

    /* renamed from: J */
    private static final Map f2468J;

    /* renamed from: A */
    private InterfaceC0753o f2469A;

    /* renamed from: B */
    private volatile boolean f2470B;

    /* renamed from: C */
    private boolean f2471C;

    /* renamed from: D */
    private boolean f2472D;

    /* renamed from: E */
    private int f2473E;

    /* renamed from: F */
    private InterfaceC17872f f2474F;

    /* renamed from: G */
    private final InterfaceC24854k f2475G;

    /* renamed from: H */
    private final InterfaceC24854k f2476H;

    /* renamed from: I */
    private final InterfaceC24854k f2477I;

    /* renamed from: p */
    private final c f2478p;

    /* renamed from: q */
    private C25630b f2479q;

    /* renamed from: r */
    private boolean f2480r;

    /* renamed from: s */
    private String f2481s;

    /* renamed from: t */
    private boolean f2482t;

    /* renamed from: u */
    private final InterfaceC24854k f2483u;

    /* renamed from: v */
    private final InterfaceC24854k f2484v;

    /* renamed from: w */
    private volatile long f2485w;

    /* renamed from: x */
    private volatile boolean f2486x;

    /* renamed from: y */
    private boolean f2487y;

    /* renamed from: z */
    private int f2488z;

    /* renamed from: ad0.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ad0.b$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private volatile int f2489a;

        /* renamed from: b */
        private volatile Bitmap f2490b;

        /* renamed from: c */
        private volatile int f2491c;

        public b(int i11, Bitmap bitmap, int i12) {
            this.f2489a = i11;
            this.f2490b = bitmap;
            this.f2491c = i12;
        }

        /* renamed from: a */
        public final void m1263a(b bVar) {
            AbstractC19074t.m100208f(bVar, "targetFrameInfo");
            if (this.f2490b != null) {
                bVar.f2490b = this.f2490b;
            }
            bVar.f2489a = this.f2489a;
            bVar.f2491c = this.f2491c;
        }

        /* renamed from: b */
        public final Bitmap m1264b() {
            return this.f2490b;
        }

        /* renamed from: c */
        public final int m1265c() {
            return this.f2491c;
        }

        /* renamed from: d */
        public final int m1266d() {
            return this.f2489a;
        }

        /* renamed from: e */
        public final void m1267e() {
            this.f2489a = -1;
            this.f2490b = null;
            this.f2491c = 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2489a == bVar.f2489a && AbstractC19074t.m100204b(this.f2490b, bVar.f2490b) && this.f2491c == bVar.f2491c;
        }

        /* renamed from: f */
        public final void m1268f(Bitmap bitmap) {
            this.f2490b = bitmap;
        }

        /* renamed from: g */
        public final void m1269g(int i11) {
            this.f2491c = i11;
        }

        /* renamed from: h */
        public final void m1270h(int i11) {
            this.f2489a = i11;
        }

        public int hashCode() {
            return (((this.f2489a * 31) + (this.f2490b == null ? 0 : this.f2490b.hashCode())) * 31) + this.f2491c;
        }

        public String toString() {
            return "FrameInfo(frame=" + this.f2489a + ", bitmap=" + this.f2490b + ", delay=" + this.f2491c + ")";
        }

        public /* synthetic */ b(int i11, Bitmap bitmap, int i12, int i13, AbstractC19060k abstractC19060k) {
            this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? null : bitmap, (i13 & 4) != 0 ? 0 : i12);
        }
    }

    /* renamed from: ad0.b$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final C25630b f2492a;

        /* renamed from: b */
        private final boolean f2493b;

        /* renamed from: c */
        private final boolean f2494c;

        /* renamed from: d */
        private final boolean f2495d;

        /* renamed from: e */
        private final boolean f2496e;

        public c(C25630b c25630b, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.f2492a = c25630b;
            this.f2493b = z11;
            this.f2494c = z12;
            this.f2495d = z13;
            this.f2496e = z14;
        }

        /* renamed from: a */
        public final boolean m1271a() {
            return this.f2494c;
        }

        /* renamed from: b */
        public final C25630b m1272b() {
            return this.f2492a;
        }

        /* renamed from: c */
        public final boolean m1273c() {
            return this.f2495d;
        }

        /* renamed from: d */
        public final boolean m1274d() {
            return this.f2493b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f2492a, cVar.f2492a) && this.f2493b == cVar.f2493b && this.f2494c == cVar.f2494c && this.f2495d == cVar.f2495d && this.f2496e == cVar.f2496e;
        }

        public int hashCode() {
            C25630b c25630b = this.f2492a;
            return ((((((((c25630b == null ? 0 : c25630b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f2493b)) * 31) + AbstractC2144f.m11520a(this.f2494c)) * 31) + AbstractC2144f.m11520a(this.f2495d)) * 31) + AbstractC2144f.m11520a(this.f2496e);
        }

        public String toString() {
            return "Params(stickerInfo=" + this.f2492a + ", isResetFrameWhenDone=" + this.f2493b + ", loop=" + this.f2494c + ", isForcePNGListDecoder=" + this.f2495d + ", canPlayWebpFFS=" + this.f2496e + ")";
        }
    }

    /* renamed from: ad0.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f2497q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b mo12V4() {
            return new b(0, null, 0, 7, null);
        }
    }

    /* renamed from: ad0.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m1277c(AbstractC0740b abstractC0740b) {
            C24848g0 c24848g0;
            AbstractC19074t.m100208f(abstractC0740b, "this$0");
            try {
                if (abstractC0740b.m1252c0() && !abstractC0740b.f2470B && !abstractC0740b.f2472D) {
                    abstractC0740b.f2470B = true;
                    try {
                        try {
                            abstractC0740b.m1222S().m1269g(1000);
                            InterfaceC17872f m1219N = abstractC0740b.m1219N();
                            if (m1219N != null) {
                                if (m1219N.mo88375b() > 0) {
                                    if (abstractC0740b.m1255g0()) {
                                        abstractC0740b.f2473E = abstractC0740b.m1215I();
                                    }
                                    int m1266d = ((abstractC0740b.m1220O().m1266d() + 1) + abstractC0740b.f2473E) % m1219N.mo88375b();
                                    abstractC0740b.m1222S().m1268f(m1219N.mo88378e(m1266d, true));
                                    abstractC0740b.m1222S().m1270h(m1266d);
                                    abstractC0740b.m1222S().m1269g(m1219N.mo88376c(m1266d));
                                }
                                c24848g0 = C24848g0.f119245a;
                            } else {
                                c24848g0 = null;
                            }
                            if (c24848g0 == null) {
                                abstractC0740b.m1222S().m1268f(null);
                                abstractC0740b.f2487y = true;
                            }
                            abstractC0740b.f2470B = false;
                            abstractC0740b.f2485w = abstractC0740b.m1246H(abstractC0740b.f2485w, abstractC0740b.m1220O().m1265c());
                            abstractC0740b.mo1249Q().schedule(abstractC0740b.m1225W(), abstractC0740b.m1223T(), TimeUnit.MILLISECONDS);
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                            abstractC0740b.f2470B = false;
                            abstractC0740b.f2485w = abstractC0740b.m1246H(abstractC0740b.f2485w, abstractC0740b.m1220O().m1265c());
                            abstractC0740b.mo1249Q().schedule(abstractC0740b.m1225W(), abstractC0740b.m1223T(), TimeUnit.MILLISECONDS);
                        }
                        abstractC0740b.m1216J();
                    } catch (Throwable th2) {
                        abstractC0740b.f2470B = false;
                        abstractC0740b.f2485w = abstractC0740b.m1246H(abstractC0740b.f2485w, abstractC0740b.m1220O().m1265c());
                        abstractC0740b.mo1249Q().schedule(abstractC0740b.m1225W(), abstractC0740b.m1223T(), TimeUnit.MILLISECONDS);
                        abstractC0740b.m1216J();
                        throw th2;
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Runnable mo12V4() {
            final AbstractC0740b abstractC0740b = AbstractC0740b.this;
            return new Runnable() { // from class: ad0.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0740b.e.m1277c(AbstractC0740b.this);
                }
            };
        }
    }

    /* renamed from: ad0.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f2499q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b mo12V4() {
            return new b(0, null, 0, 7, null);
        }
    }

    /* renamed from: ad0.b$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: ad0.b$g$a */
        /* loaded from: classes4.dex */
        public static final class a implements AbstractC26250b.a {

            /* renamed from: a */
            final /* synthetic */ AbstractC0740b f2501a;

            a(AbstractC0740b abstractC0740b) {
                this.f2501a = abstractC0740b;
            }

            @Override // sh0.AbstractC26250b.a
            /* renamed from: a */
            public void mo1281a() {
                this.f2501a.m1234e0();
            }
        }

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(AbstractC0740b.this);
        }
    }

    /* renamed from: ad0.b$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m1284d(final AbstractC0740b abstractC0740b) {
            InterfaceC0753o m1248P;
            AbstractC19074t.m100208f(abstractC0740b, "this$0");
            if (abstractC0740b.f2486x) {
                return;
            }
            if (abstractC0740b.m1248P() != null && ((m1248P = abstractC0740b.m1248P()) == null || m1248P.mo1322B0(abstractC0740b.m1250V(), abstractC0740b.f2481s))) {
                abstractC0740b.m1247M();
                if (AbstractC19444a.m101693a()) {
                    InterfaceC0753o m1248P2 = abstractC0740b.m1248P();
                    if (m1248P2 != null) {
                        m1248P2.invalidate();
                    }
                } else {
                    InterfaceC0753o m1248P3 = abstractC0740b.m1248P();
                    if (m1248P3 != null) {
                        m1248P3.postInvalidate();
                    }
                }
                AbstractC19444a.m101697e(new Runnable() { // from class: ad0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0740b.h.m1285e(AbstractC0740b.this);
                    }
                });
                abstractC0740b.m1232d0();
                return;
            }
            abstractC0740b.mo1259p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m1285e(AbstractC0740b abstractC0740b) {
            InterfaceC0753o m1248P;
            AbstractC19074t.m100208f(abstractC0740b, "this$0");
            if (abstractC0740b.m1248P() == null || ((m1248P = abstractC0740b.m1248P()) != null && !m1248P.mo1329x0())) {
                abstractC0740b.mo1259p();
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Runnable mo12V4() {
            final AbstractC0740b abstractC0740b = AbstractC0740b.this;
            return new Runnable() { // from class: ad0.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0740b.h.m1284d(AbstractC0740b.this);
                }
            };
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f2468J = synchronizedMap;
    }

    public AbstractC0740b(c cVar) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(cVar, "args");
        this.f2478p = cVar;
        this.f2479q = cVar.m1272b();
        this.f2480r = cVar.m1271a();
        this.f2481s = "";
        m129210a = AbstractC24856m.m129210a(d.f2497q);
        this.f2483u = m129210a;
        m129210a2 = AbstractC24856m.m129210a(f.f2499q);
        this.f2484v = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new e());
        this.f2475G = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new h());
        this.f2476H = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new g());
        this.f2477I = m129210a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final int m1215I() {
        int i11;
        int i12;
        int m116580c;
        try {
            if (this.f2485w > 0 && m1219N() != null) {
                InterfaceC17872f m1219N = m1219N();
                if (m1219N != null) {
                    i11 = m1219N.mo88376c(0);
                } else {
                    i11 = 1000;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f2485w;
                if (i11 > 0) {
                    i12 = ((int) (currentTimeMillis / i11)) - 1;
                } else {
                    i12 = 0;
                }
                m116580c = AbstractC22543l.m116580c(0, i12);
                return m116580c;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m1216J() {
        AbstractC26250b abstractC26250b;
        if (!this.f2472D && !this.f2471C && m1220O().m1266d() <= 0) {
            InterfaceC17872f m1219N = m1219N();
            if (m1219N instanceof AbstractC26250b) {
                abstractC26250b = (AbstractC26250b) m1219N;
            } else {
                abstractC26250b = null;
            }
            if (abstractC26250b != null && abstractC26250b.mo88376c(0) < 33 && !abstractC26250b.mo88379j()) {
                this.f2472D = true;
                abstractC26250b.m134980k(m1224U());
                mo1249Q().schedule(new Runnable() { // from class: ad0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0740b.m1217K(AbstractC0740b.this);
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m1217K(AbstractC0740b abstractC0740b) {
        AbstractC19074t.m100208f(abstractC0740b, "this$0");
        if (!abstractC0740b.f2471C) {
            abstractC0740b.m1234e0();
        }
    }

    /* renamed from: L */
    private final void m1218L(int i11) {
        int i12 = this.f2488z + 1;
        this.f2488z = i12;
        int i13 = i11 * 4;
        if (!this.f2480r && i12 > i13) {
            InterfaceC0747i.a.m1291a(this, false, 1, null);
            this.f2488z = 0;
            this.f2487y = true;
        }
        f2468J.put(this.f2481s, Integer.valueOf(this.f2488z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final InterfaceC17872f m1219N() {
        int i11;
        int i12;
        int i13;
        InterfaceC17872f interfaceC17872f = this.f2474F;
        if (interfaceC17872f == null || (interfaceC17872f != null && C28181s2.f131306a.m141729r(interfaceC17872f))) {
            C28181s2 c28181s2 = C28181s2.f131306a;
            C25630b c25630b = this.f2479q;
            boolean m1273c = this.f2478p.m1273c();
            InterfaceC0753o interfaceC0753o = this.f2469A;
            if (interfaceC0753o != null) {
                i11 = interfaceC0753o.mo1321A0();
            } else {
                i11 = 0;
            }
            InterfaceC0753o interfaceC0753o2 = this.f2469A;
            if (interfaceC0753o2 != null) {
                i12 = interfaceC0753o2.mo1326F0();
            } else {
                i12 = 0;
            }
            InterfaceC0753o interfaceC0753o3 = this.f2469A;
            if (interfaceC0753o3 != null) {
                i13 = interfaceC0753o3.mo1330y0();
            } else {
                i13 = 0;
            }
            this.f2474F = c28181s2.m141727m(c25630b, m1273c, i11, i12, i13);
            m1220O().m1270h(-1);
        }
        return this.f2474F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final b m1220O() {
        return (b) this.f2483u.getValue();
    }

    /* renamed from: R */
    private final Runnable m1221R() {
        return (Runnable) this.f2475G.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final b m1222S() {
        return (b) this.f2484v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final long m1223T() {
        long m116581d;
        m116581d = AbstractC22543l.m116581d(0L, this.f2485w - System.currentTimeMillis());
        return m116581d;
    }

    /* renamed from: U */
    private final g.a m1224U() {
        return (g.a) this.f2477I.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final Runnable m1225W() {
        return (Runnable) this.f2476H.getValue();
    }

    /* renamed from: X */
    private final boolean m1226X() {
        boolean m127120J;
        m127120J = AbstractC24341v.m127120J(this.f2481s, "CHAT_VIEW_", false, 2, null);
        if (!m127120J || !C3255n.m16556g()) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    private final boolean m1227Y() {
        boolean m127120J;
        m127120J = AbstractC24341v.m127120J(this.f2481s, "REPLY_POPUP_", false, 2, null);
        if (!m127120J || !C3255n.m16559j()) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    private final boolean m1228Z() {
        boolean m127120J;
        m127120J = AbstractC24341v.m127120J(this.f2481s, "STICKER_PANEL_", false, 2, null);
        if (!m127120J || !C3255n.m16557h()) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    private final boolean m1229a0() {
        boolean m127120J;
        m127120J = AbstractC24341v.m127120J(this.f2481s, "POPUP_", false, 2, null);
        if (!m127120J || !C3255n.m16558i()) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    private final boolean m1231b0() {
        boolean m127120J;
        m127120J = AbstractC24341v.m127120J(this.f2481s, "SUGGEST_VIEW_", false, 2, null);
        if (!m127120J || !C3255n.m16555f()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m1232d0() {
        try {
            if (!m1252c0()) {
                return;
            }
            mo1249Q().execute(m1221R());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m1234e0() {
        this.f2471C = true;
        this.f2472D = false;
        m1232d0();
    }

    /* renamed from: H */
    public long m1246H(long j11, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        if (j11 > 0 && this.f2473E <= 0 && currentTimeMillis - j11 <= i11 * 2) {
            return i11 + j11;
        }
        return currentTimeMillis;
    }

    /* renamed from: M */
    public void m1247M() {
        int i11;
        if (m1222S().m1266d() >= 0) {
            m1222S().m1263a(m1220O());
            m1222S().m1267e();
        }
        InterfaceC17872f m1219N = m1219N();
        if (m1219N != null) {
            i11 = m1219N.mo88375b();
        } else {
            i11 = 0;
        }
        m1218L(i11);
    }

    /* renamed from: P */
    protected final InterfaceC0753o m1248P() {
        return this.f2469A;
    }

    /* renamed from: Q */
    public abstract ScheduledThreadPoolExecutor mo1249Q();

    /* renamed from: V */
    protected final C25630b m1250V() {
        return this.f2479q;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: c */
    public void mo1251c(boolean z11) {
        this.f2480r = z11;
    }

    /* renamed from: c0 */
    public boolean m1252c0() {
        InterfaceC0753o interfaceC0753o = this.f2469A;
        if ((interfaceC0753o != null && !interfaceC0753o.mo1322B0(this.f2479q, this.f2481s)) || (this.f2487y && !this.f2480r)) {
            this.f2488z = 0;
            if (this.f2478p.m1274d()) {
                InterfaceC0747i.a.m1291a(this, false, 1, null);
            }
            this.f2487y = false;
            InterfaceC0753o interfaceC0753o2 = this.f2469A;
            if (interfaceC0753o2 != null) {
                interfaceC0753o2.mo1325E0(this.f2481s);
            }
            return false;
        }
        InterfaceC17872f m1219N = m1219N();
        if (m1219N == null || m1219N.mo88375b() != 1 || m1220O().m1264b() == null) {
            return true;
        }
        return false;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: f */
    public void mo1253f(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        C25630b c25630b2 = this.f2479q;
        if (c25630b2 == null || c25630b2.m132429g() != c25630b.m132429g()) {
            this.f2479q = c25630b;
            InterfaceC0747i.a.m1291a(this, false, 1, null);
        }
    }

    /* renamed from: f0 */
    public void m1254f0(String str, String str2, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "oldId");
        AbstractC19074t.m100208f(str2, "animationId");
        this.f2481s = str2;
        int i11 = 0;
        this.f2486x = false;
        this.f2482t = z12;
        this.f2485w = 0L;
        this.f2473E = 0;
        if (z11) {
            f2468J.remove(str);
            return;
        }
        Integer num = (Integer) f2468J.get(str);
        if (num != null) {
            i11 = num.intValue();
        }
        this.f2488z = i11;
    }

    /* renamed from: g0 */
    public boolean m1255g0() {
        C26253e c26253e;
        InterfaceC17872f m1219N = m1219N();
        AbstractC26250b abstractC26250b = null;
        if (m1219N instanceof C26253e) {
            c26253e = (C26253e) m1219N;
        } else {
            c26253e = null;
        }
        if (c26253e == null || c26253e.m134997t() != 1) {
            return true;
        }
        InterfaceC17872f m1219N2 = m1219N();
        if (m1219N2 instanceof AbstractC26250b) {
            abstractC26250b = (AbstractC26250b) m1219N2;
        }
        if (abstractC26250b != null && abstractC26250b.mo88379j()) {
            return true;
        }
        return false;
    }

    @Override // ad0.InterfaceC0744f
    /* renamed from: h */
    public Bitmap mo1256h() {
        return m1220O().m1264b();
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: i */
    public void mo1257i(boolean z11) {
        if (z11 && (m1226X() || m1228Z() || m1229a0() || m1227Y() || m1231b0())) {
            f2468J.remove(this.f2481s);
        }
        InterfaceC17872f m1219N = m1219N();
        if (m1219N != null && C28181s2.m141714d(C28181s2.f131306a, m1219N, false, 2, null)) {
            this.f2474F = null;
            if (z11) {
                m1220O().m1267e();
                m1222S().m1267e();
            }
        }
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: j */
    public boolean mo1258j() {
        return this.f2486x;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: p */
    public void mo1259p() {
        this.f2486x = true;
        f2468J.remove(this.f2481s);
        InterfaceC0753o interfaceC0753o = this.f2469A;
        if (interfaceC0753o != null) {
            interfaceC0753o.mo1325E0(this.f2481s);
        }
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: q */
    public void mo1260q() {
        mo1262v(this.f2481s, false, this.f2482t);
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: t */
    public void mo1261t(InterfaceC0753o interfaceC0753o) {
        this.f2469A = interfaceC0753o;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: v */
    public void mo1262v(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "animationId");
        m1254f0(this.f2481s, str, z11, z12);
        if (m1222S().m1264b() == null) {
            m1232d0();
        } else {
            this.f2485w = m1246H(this.f2485w, m1222S().m1265c());
            mo1249Q().schedule(m1225W(), m1223T(), TimeUnit.MILLISECONDS);
        }
    }
}
