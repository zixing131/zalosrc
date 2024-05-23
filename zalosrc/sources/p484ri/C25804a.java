package p484ri;

import am.AbstractC0924m0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p077ui.backuprestore.detail.C11003b;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.YieldKt;
import me0.AbstractC23244v8;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import p099dd.C17887a;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p443qc.AbstractC25219c;
import p543uc.InterfaceC27227e;
import p605wc.C28911c;
import p610wi.C29050d;
import p610wi.InterfaceC29049c;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import sc.C26220b;
import si.C26263i;
import si.C26272r;
import si.InterfaceC26271q;
import tc.C26627a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: ri.a */
/* loaded from: classes3.dex */
public final class C25804a {
    public static final b Companion = new b(null);

    /* renamed from: l */
    private static final InterfaceC24854k f123049l;

    /* renamed from: m */
    private static Job f123050m;

    /* renamed from: a */
    private final InterfaceC26271q f123051a;

    /* renamed from: b */
    private final InterfaceC29049c f123052b;

    /* renamed from: c */
    private final InterfaceC23792b f123053c;

    /* renamed from: d */
    private final C29234i f123054d;

    /* renamed from: e */
    private final InterfaceC29232g f123055e;

    /* renamed from: f */
    private AbstractC25219c f123056f;

    /* renamed from: g */
    private AtomicInteger f123057g;

    /* renamed from: h */
    private AtomicBoolean f123058h;

    /* renamed from: i */
    private final C1761c0 f123059i;

    /* renamed from: j */
    private final LiveData f123060j;

    /* renamed from: k */
    private final InterfaceC24854k f123061k;

    /* renamed from: ri.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f123062q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25804a mo12V4() {
            return c.f123063a.m133010a();
        }
    }

    /* renamed from: ri.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25804a m133009a() {
            return (C25804a) C25804a.f123049l.getValue();
        }
    }

    /* renamed from: ri.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f123063a = new c();

        /* renamed from: b */
        private static final C25804a f123064b;

        static {
            C26272r c26272r = new C26272r();
            C29050d c29050d = new C29050d();
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f123064b = new C25804a(c26272r, c29050d, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C25804a m133010a() {
            return f123064b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ri.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return C25804a.this.f123051a.mo135158v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ri.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f123066q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C17887a mo12V4() {
            return AbstractC23306f.m120653d0();
        }
    }

    /* renamed from: ri.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f123067s;

        /* renamed from: t */
        /* synthetic */ Object f123068t;

        /* renamed from: v */
        int f123070v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f123068t = obj;
            this.f123070v |= Integer.MIN_VALUE;
            return C25804a.this.m132999r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ri.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f123071t;

        /* renamed from: u */
        int f123072u;

        /* renamed from: w */
        final /* synthetic */ boolean f123074w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f123074w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f123074w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            int i12;
            List m94425a;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f123072u;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        i12 = this.f123071t;
                        AbstractC24862s.m129228b(obj);
                        C25804a.this.m133002u().set(i12);
                        AtomicInteger m133002u = C25804a.this.m133002u();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("loadRemainMediaNotBackup: remain media not backup count = ");
                        sb2.append(m133002u);
                        C25804a.this.f123059i.mo9221n(new C24860q(AbstractC29094b.m145339a(false), AbstractC29094b.m145341c(C25804a.this.m133002u().get())));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C17887a m132979j = C25804a.this.m132979j();
                C17887a.b bVar = new C17887a.b(this.f123074w);
                this.f123072u = 1;
                obj = m132979j.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C17887a.c cVar = (C17887a.c) obj;
            if (cVar != null && (m94425a = cVar.m94425a()) != null) {
                i11 = m94425a.size();
            } else {
                i11 = 0;
            }
            C25804a.this.f123058h.set(false);
            this.f123071t = i11;
            this.f123072u = 2;
            if (YieldKt.m112882a(this) == m142578e) {
                return m142578e;
            }
            i12 = i11;
            C25804a.this.m133002u().set(i12);
            AtomicInteger m133002u2 = C25804a.this.m133002u();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("loadRemainMediaNotBackup: remain media not backup count = ");
            sb22.append(m133002u2);
            C25804a.this.f123059i.mo9221n(new C24860q(AbstractC29094b.m145339a(false), AbstractC29094b.m145341c(C25804a.this.m133002u().get())));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f123062q);
        f123049l = m129210a;
    }

    public C25804a(InterfaceC26271q interfaceC26271q, InterfaceC29049c interfaceC29049c, InterfaceC23792b interfaceC23792b) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC26271q, "localDataSource");
        AbstractC19074t.m100208f(interfaceC29049c, "apiHelper");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f123051a = interfaceC26271q;
        this.f123052b = interfaceC29049c;
        this.f123053c = interfaceC23792b;
        this.f123054d = AbstractC29235j.m145994a();
        this.f123055e = AbstractC29233h.m145990a(new d());
        this.f123056f = AbstractC25219c.d.f120979b;
        this.f123057g = new AtomicInteger(-1);
        this.f123058h = new AtomicBoolean(false);
        C1761c0 c1761c0 = new C1761c0();
        this.f123059i = c1761c0;
        this.f123060j = c1761c0;
        m129210a = AbstractC24856m.m129210a(e.f123066q);
        this.f123061k = m129210a;
    }

    /* renamed from: h */
    private final String m132978h() {
        return (String) this.f123055e.getValue();
    }

    /* renamed from: j */
    public final C17887a m132979j() {
        return (C17887a) this.f123061k.getValue();
    }

    /* renamed from: m */
    public static /* synthetic */ String m132980m(C25804a c25804a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c25804a.m132995l(z11);
    }

    /* renamed from: o */
    public static final C25804a m132981o() {
        return Companion.m133009a();
    }

    /* renamed from: A */
    public final void m132982A(String str, int i11) {
        AbstractC19074t.m100208f(str, "account");
        C26220b.m134826i("SMLBackupRestoreMediaRepository", "setAccountForAccessGoogleDrive(): account=" + C26627a.f126082a.m136728c(str) + ", accountState=" + i11, null, 4, null);
        this.f123051a.mo135155s(str, i11);
        this.f123055e.reset();
        m132987F(true);
        m132989H(0L);
        m132988G(-1L);
    }

    /* renamed from: B */
    public final void m132983B(String str) {
        AbstractC19074t.m100208f(str, "token");
        this.f123051a.mo135148l(str);
    }

    /* renamed from: C */
    public final void m132984C(int i11) {
        this.f123051a.mo135152p(i11);
    }

    /* renamed from: D */
    public final void m132985D(long j11) {
        this.f123051a.mo135141e(j11);
    }

    /* renamed from: E */
    public final void m132986E(long j11) {
        this.f123051a.mo135140d(j11);
    }

    /* renamed from: F */
    public final void m132987F(boolean z11) {
        this.f123051a.mo135142f(z11);
    }

    /* renamed from: G */
    public final void m132988G(long j11) {
        this.f123051a.mo135138b(j11);
    }

    /* renamed from: H */
    public final void m132989H(long j11) {
        long m128424t = AbstractC23306f.m120676j().m128424t();
        long m132998q = m132998q();
        long mo135144h = this.f123051a.mo135144h();
        if (mo135144h > 0) {
            if (m132998q > 0) {
                if (System.currentTimeMillis() - m132998q > m128424t && j11 - mo135144h > m128424t) {
                    this.f123051a.mo135143g(j11);
                    C23744a.Companion.m124119a().m124116d(6025, new Object[0]);
                    return;
                }
                return;
            }
            if (j11 - mo135144h > m128424t) {
                this.f123051a.mo135143g(j11);
                C23744a.Companion.m124119a().m124116d(6025, new Object[0]);
                return;
            }
            return;
        }
        this.f123051a.mo135143g(j11);
        C23744a.Companion.m124119a().m124116d(6025, new Object[0]);
    }

    /* renamed from: I */
    public final void m132990I(long j11, long j12, long j13) {
        AbstractC25219c abstractC25219c = AbstractC25219c.d.f120979b;
        if (j11 > abstractC25219c.m130483a()) {
            if (j11 <= j13) {
                abstractC25219c = new AbstractC25219c.b(j11);
            } else if (j11 <= j12) {
                abstractC25219c = new AbstractC25219c.a(j11);
            } else {
                abstractC25219c = AbstractC25219c.c.f120978b;
            }
        }
        this.f123056f = abstractC25219c;
    }

    /* renamed from: f */
    public final void m132991f() {
        C26220b.m134826i("SMLBackupRestoreMediaRepository", "clearAllMemCache()", null, 4, null);
        this.f123055e.reset();
        this.f123054d.m145993b();
        m133006y();
        this.f123057g.set(-1);
        this.f123058h.set(false);
        AbstractC0924m0.m3257Mh(false);
    }

    /* renamed from: g */
    public final void m132992g() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 18);
        String m119735E = AbstractC23244v8.m119735E(this.f123051a.mo135139c(), 30);
        int m132996n = m132996n();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLBackupRestoreMediaRepository").mo104556o(8, m127130z + "\nGoogle Auth token: " + m119735E + "\nToken state: " + m132996n + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: i */
    public final String m132993i() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            return m132978h();
        }
        return "";
    }

    /* renamed from: k */
    public final String m132994k() {
        return m132980m(this, false, 1, null);
    }

    /* renamed from: l */
    public final String m132995l(boolean z11) {
        boolean z12;
        String mo135139c = this.f123051a.mo135139c();
        int m132996n = m132996n();
        boolean z13 = false;
        if (mo135139c.length() > 0 && m132996n == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f123053c.mo124314i() - this.f123051a.mo135157u() < 900000) {
            z13 = true;
        }
        if (z12 && z13 && !z11) {
            C26220b.m134829l("SMLBackupRestoreMediaRepository", "Use cached Google Auth token");
            return mo135139c;
        }
        String m132993i = m132993i();
        if (m132993i.length() == 0) {
            return "";
        }
        this.f123051a.mo135137a(this.f123053c.mo124314i());
        C28911c.c cVar = (C28911c.c) AbstractC23306f.m120658e1().m101509a(new C28911c.b(mo135139c, m132996n, m132993i, false, 8, null));
        if (cVar == null) {
            return "";
        }
        String m144424b = cVar.m144424b();
        int m144425c = cVar.m144425c();
        m132983B(m144424b);
        m132984C(m144425c);
        return m144424b;
    }

    /* renamed from: n */
    public final int m132996n() {
        return this.f123051a.mo135149m();
    }

    /* renamed from: p */
    public final long m132997p() {
        return this.f123051a.mo135154r();
    }

    /* renamed from: q */
    public final long m132998q() {
        return this.f123051a.mo135145i();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(2:21|(2:25|26))|27|(2:29|30)(4:31|(2:33|(1:35)(1:36))|14|15))|12|13|14|15))|39|6|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002f, code lost:            r11 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:            sc.C26220b.m134819b(r11);     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m132999r(Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        C25804a c25804a;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f123070v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f123070v = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f123068t;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f123070v;
                long j11 = -1;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25804a = (C25804a) fVar.f123067s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (System.currentTimeMillis() - this.f123051a.mo135151o() < 900000) {
                        long mo135150n = this.f123051a.mo135150n();
                        if (mo135150n != AbstractC25219c.d.f120979b.m130483a() && m132993i().length() > 0) {
                            return AbstractC29094b.m145342d(mo135150n);
                        }
                    }
                    String m132993i = m132993i();
                    if (m132993i.length() == 0) {
                        return AbstractC29094b.m145342d(-1L);
                    }
                    InterfaceC27227e m135061z = C26263i.m135061z(m132993i);
                    if (m135061z != null) {
                        InterfaceC29049c interfaceC29049c = this.f123052b;
                        String mo139336e = m135061z.mo139336e();
                        fVar.f123067s = this;
                        fVar.f123070v = 1;
                        obj = interfaceC29049c.mo145075a(mo139336e, fVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c25804a = this;
                    }
                    return AbstractC29094b.m145342d(j11);
                }
                long longValue = ((Number) obj).longValue();
                C26220b.m134826i("SMLBackupRestoreMediaRepository", "getStorageQuotaFromDrive(): " + longValue + ". Email: " + C26627a.f126082a.m136728c(c25804a.m132993i()), null, 4, null);
                c25804a.f123051a.mo135156t(longValue);
                c25804a.f123051a.mo135146j(System.currentTimeMillis());
                j11 = longValue;
                return AbstractC29094b.m145342d(j11);
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f123068t;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f123070v;
        long j112 = -1;
        if (i11 == 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        C26220b.m134826i("SMLBackupRestoreMediaRepository", "getStorageQuotaFromDrive(): " + longValue2 + ". Email: " + C26627a.f126082a.m136728c(c25804a.m132993i()), null, 4, null);
        c25804a.f123051a.mo135156t(longValue2);
        c25804a.f123051a.mo135146j(System.currentTimeMillis());
        j112 = longValue2;
        return AbstractC29094b.m145342d(j112);
    }

    /* renamed from: s */
    public final long m133000s() {
        return this.f123051a.mo135147k();
    }

    /* renamed from: t */
    public final AbstractC25219c m133001t() {
        return this.f123056f;
    }

    /* renamed from: u */
    public final AtomicInteger m133002u() {
        return this.f123057g;
    }

    /* renamed from: v */
    public final LiveData m133003v() {
        return this.f123060j;
    }

    /* renamed from: w */
    public final void m133004w(C11003b.b bVar) {
        boolean z11;
        Job m112540d;
        AbstractC19074t.m100208f(bVar, "loadState");
        if (m132993i().length() == 0) {
            return;
        }
        if (bVar == C11003b.b.f55576p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f123058h.getAndSet(true) || !z11) {
            if (!z11) {
                this.f123057g.set(-1);
            }
            this.f123059i.mo9221n(new C24860q(Boolean.TRUE, Integer.valueOf(this.f123057g.get())));
            Job job = f123050m;
            if (job != null) {
                Job.DefaultImpls.m112740a(job, null, 1, null);
            }
            m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new g(z11, null), 3, null);
            f123050m = m112540d;
        }
    }

    /* renamed from: x */
    public final boolean m133005x() {
        return this.f123051a.mo135153q();
    }

    /* renamed from: y */
    public final void m133006y() {
        this.f123051a.mo135156t(-1L);
        this.f123051a.mo135146j(0L);
    }

    /* renamed from: z */
    public final void m133007z() {
        this.f123051a.mo135137a(0L);
    }
}
