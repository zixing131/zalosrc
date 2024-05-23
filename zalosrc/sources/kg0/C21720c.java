package kg0;

import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hc0.EnumC19985o;
import ho0.AbstractC20110a;
import java.util.Map;
import ke0.C21699a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p487rl.C25826g;
import pg0.C24747a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: kg0.c */
/* loaded from: classes7.dex */
public final class C21720c {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f105472c;

    /* renamed from: a */
    private final InterfaceC24854k f105473a;

    /* renamed from: b */
    private int f105474b;

    /* renamed from: kg0.c$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f105475q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C21720c mo12V4() {
            return c.f105476a.m112108a();
        }
    }

    /* renamed from: kg0.c$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21720c m112107a() {
            return (C21720c) C21720c.f105472c.getValue();
        }
    }

    /* renamed from: kg0.c$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f105476a = new c();

        /* renamed from: b */
        private static final C21720c f105477b = new C21720c();

        private c() {
        }

        /* renamed from: a */
        public final C21720c m112108a() {
            return f105477b;
        }
    }

    /* renamed from: kg0.c$d */
    /* loaded from: classes7.dex */
    public static final class d extends Enum {

        /* renamed from: q */
        public static final d f105478q = new d("VERSION_1", 0, 1);

        /* renamed from: r */
        public static final d f105479r = new d("VERSION_2", 1, 2);

        /* renamed from: s */
        public static final d f105480s = new d("VERSION_3", 2, 3);

        /* renamed from: t */
        private static final /* synthetic */ d[] f105481t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f105482u;

        /* renamed from: p */
        private final int f105483p;

        static {
            d[] m112109b = m112109b();
            f105481t = m112109b;
            f105482u = AbstractC30166b.m148796a(m112109b);
        }

        private d(String str, int i11, int i12) {
            super(str, i11);
            this.f105483p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m112109b() {
            return new d[]{f105478q, f105479r, f105480s};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f105481t.clone();
        }

        /* renamed from: c */
        public final int m112110c() {
            return this.f105483p;
        }
    }

    /* renamed from: kg0.c$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105484t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map m131407l;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105484t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
                C21699a c21699a = new C21699a(m120679j2);
                m131407l = AbstractC25363p0.m131407l(new C24860q(EnumC24251b.f117147r, new C25826g(true)), new C24860q(EnumC24251b.f117146q, new C25826g(true)), new C24860q(EnumC24251b.f117148s, new C25826g(true)));
                this.f105484t = 1;
                if (c21699a.m101498a(m131407l, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kg0.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f105485q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112112a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112112a() {
        }
    }

    /* renamed from: kg0.c$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f105486q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112113a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112113a() {
        }
    }

    /* renamed from: kg0.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f105487q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112114a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112114a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kg0.c$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f105488q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24747a mo12V4() {
            return AbstractC23306f.m120636Y1();
        }
    }

    /* renamed from: kg0.c$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {
        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112116a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112116a() {
            C21720c.this.m112098f();
        }
    }

    /* renamed from: kg0.c$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112117a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112117a() {
            C21720c.this.m112097e();
        }
    }

    /* renamed from: kg0.c$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {
        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112118a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112118a() {
            C21720c.this.m112098f();
        }
    }

    /* renamed from: kg0.c$m */
    /* loaded from: classes7.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18494a {
        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112119a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112119a() {
            C21720c.this.m112098f();
        }
    }

    /* renamed from: kg0.c$n */
    /* loaded from: classes7.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18494a {
        n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112120a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112120a() {
            C21720c.this.m112097e();
        }
    }

    /* renamed from: kg0.c$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18494a {
        o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112121a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112121a() {
            C21720c.this.m112098f();
        }
    }

    /* renamed from: kg0.c$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18494a {
        p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m112122a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m112122a() {
            if ((C21720c.this.m112101j().m128525i() == EnumC19985o.f98289r || C21720c.this.m112101j().m128525i() == EnumC19985o.f98284B) && C21720c.this.m112101j().m128529n()) {
                C26676b.m136957g("SMLZCloudMigratePref", "completeOnboardingSetup(): onMigrate sharedPref", null, 4, null);
                C21720c.this.m112101j().m128523g();
                if (C24252c.f117152a.m126599e()) {
                    AbstractC23306f.m120667g2().m144759N(true);
                }
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f105475q);
        f105472c = m129210a;
    }

    public C21720c() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(i.f105488q);
        this.f105473a = m129210a;
    }

    /* renamed from: e */
    public final void m112097e() {
        if (!m112101j().m128529n() && !m112101j().m128530o() && !AbstractC3489d.m17505m()) {
            m112101j().m128511C(true);
        }
    }

    /* renamed from: f */
    public final void m112098f() {
        C24252c c24252c = C24252c.f117152a;
        if (c24252c.m126598d() == 0) {
            c24252c.m126602i();
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new e(null), 3, null);
        }
    }

    /* renamed from: g */
    private final void m112099g(d dVar, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3) {
        if (this.f105474b < dVar.m112110c()) {
            this.f105474b = dVar.m112110c();
            interfaceC18494a2.mo12V4();
            if (AbstractC3489d.m17501i()) {
                C26676b.m136957g("SMLZCloudMigratePref", "Start migrate version (" + this.f105474b + ") - isCloudUser", null, 4, null);
                interfaceC18494a.mo12V4();
            }
            if (AbstractC3489d.m17506n()) {
                C26676b.m136957g("SMLZCloudMigratePref", "Start migrate version (" + this.f105474b + ") - isGracePeriodUser", null, 4, null);
                interfaceC18494a3.mo12V4();
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m112100h(C21720c c21720c, d dVar, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC18494a = f.f105485q;
        }
        if ((i11 & 4) != 0) {
            interfaceC18494a2 = g.f105486q;
        }
        if ((i11 & 8) != 0) {
            interfaceC18494a3 = h.f105487q;
        }
        c21720c.m112099g(dVar, interfaceC18494a, interfaceC18494a2, interfaceC18494a3);
    }

    /* renamed from: j */
    public final C24747a m112101j() {
        return (C24747a) this.f105473a.getValue();
    }

    /* renamed from: k */
    public static final C21720c m112102k() {
        return Companion.m112107a();
    }

    /* renamed from: m */
    public static /* synthetic */ void m112103m(C21720c c21720c, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c21720c.m112105l(z11);
    }

    /* renamed from: i */
    public final void m112104i() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 29);
        int i11 = this.f105474b;
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudMigratePref").mo104556o(8, m127130z + "\nCurrent version: " + i11 + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: l */
    public final void m112105l(boolean z11) {
        int m4282v8;
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (z11) {
                m4282v8 = 0;
            } else {
                m4282v8 = AbstractC0924m0.m4282v8();
            }
            this.f105474b = m4282v8;
            C26676b.m136957g("SMLZCloudMigratePref", "migrate(): isForce=" + z11 + ", currentVersion=" + m4282v8 + ", currentUserUid=" + CoreUtility.f89233i, null, 4, null);
            m112099g(d.f105478q, new j(), new k(), new l());
            m112099g(d.f105479r, new m(), new n(), new o());
            m112100h(this, d.f105480s, null, new p(), null, 10, null);
            AbstractC0924m0.m3238Lr(this.f105474b);
            return;
        }
        C26676b.m136955e("SMLZCloudMigratePref", "EMPTY current UID!", C26676b.b.f126335t);
    }
}
