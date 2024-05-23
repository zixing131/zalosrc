package p531ty;

import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2144f;
import bp0.AbstractC3082b0;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.qrcode.p069ui.C9207a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ty.a */
/* loaded from: classes4.dex */
public final class C26904a extends AbstractC19963b {

    /* renamed from: A */
    private final C1761c0 f127300A;

    /* renamed from: t */
    private final CoroutineExceptionHandler f127301t;

    /* renamed from: u */
    private final CoroutineScope f127302u;

    /* renamed from: v */
    private final b f127303v;

    /* renamed from: w */
    private boolean f127304w;

    /* renamed from: x */
    private C1761c0 f127305x;

    /* renamed from: y */
    private C1761c0 f127306y;

    /* renamed from: z */
    private final C1761c0 f127307z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ty.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f127308p = new a(Image.SCALE_TYPE_NONE, 0);

        /* renamed from: q */
        public static final a f127309q = new a("LOADING", 1);

        /* renamed from: r */
        public static final a f127310r = new a("SUCCESS", 2);

        /* renamed from: s */
        public static final a f127311s = new a("NETWORK_ERROR", 3);

        /* renamed from: t */
        public static final a f127312t = new a("PROCESS_ERROR", 4);

        /* renamed from: u */
        private static final /* synthetic */ a[] f127313u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f127314v;

        static {
            a[] m138677b = m138677b();
            f127313u = m138677b;
            f127314v = AbstractC30166b.m148796a(m138677b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m138677b() {
            return new a[]{f127308p, f127309q, f127310r, f127311s, f127312t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f127313u.clone();
        }
    }

    /* renamed from: ty.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private String f127315a;

        /* renamed from: b */
        private String f127316b;

        /* renamed from: c */
        private String f127317c;

        /* renamed from: d */
        private String f127318d;

        /* renamed from: e */
        private String f127319e;

        /* renamed from: f */
        private boolean f127320f;

        public b(String str, String str2, String str3, String str4, String str5, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "name");
            AbstractC19074t.m100208f(str3, "avatarUrl");
            AbstractC19074t.m100208f(str4, "qrImageUrl");
            AbstractC19074t.m100208f(str5, "backgroundUrl");
            this.f127315a = str;
            this.f127316b = str2;
            this.f127317c = str3;
            this.f127318d = str4;
            this.f127319e = str5;
            this.f127320f = z11;
        }

        /* renamed from: a */
        public final String m138678a() {
            return this.f127317c;
        }

        /* renamed from: b */
        public final String m138679b() {
            return this.f127319e;
        }

        /* renamed from: c */
        public final String m138680c() {
            return this.f127315a;
        }

        /* renamed from: d */
        public final String m138681d() {
            return this.f127316b;
        }

        /* renamed from: e */
        public final String m138682e() {
            return this.f127318d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f127315a, bVar.f127315a) && AbstractC19074t.m100204b(this.f127316b, bVar.f127316b) && AbstractC19074t.m100204b(this.f127317c, bVar.f127317c) && AbstractC19074t.m100204b(this.f127318d, bVar.f127318d) && AbstractC19074t.m100204b(this.f127319e, bVar.f127319e) && this.f127320f == bVar.f127320f;
        }

        /* renamed from: f */
        public final boolean m138683f() {
            return this.f127320f;
        }

        /* renamed from: g */
        public final void m138684g(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f127317c = str;
        }

        /* renamed from: h */
        public final void m138685h(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f127319e = str;
        }

        public int hashCode() {
            return (((((((((this.f127315a.hashCode() * 31) + this.f127316b.hashCode()) * 31) + this.f127317c.hashCode()) * 31) + this.f127318d.hashCode()) * 31) + this.f127319e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f127320f);
        }

        /* renamed from: i */
        public final void m138686i(boolean z11) {
            this.f127320f = z11;
        }

        /* renamed from: j */
        public final void m138687j(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f127315a = str;
        }

        /* renamed from: k */
        public final void m138688k(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f127316b = str;
        }

        /* renamed from: l */
        public final void m138689l(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f127318d = str;
        }

        public String toString() {
            return "QRViewerData(id=" + this.f127315a + ", name=" + this.f127316b + ", avatarUrl=" + this.f127317c + ", qrImageUrl=" + this.f127318d + ", backgroundUrl=" + this.f127319e + ", isCertificated=" + this.f127320f + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) == 0 ? str5 : "", (i11 & 32) != 0 ? false : z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ty.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127321t;

        /* renamed from: v */
        final /* synthetic */ String f127323v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(2, continuation);
            this.f127323v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f127323v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f127321t == 0) {
                AbstractC24862s.m129228b(obj);
                C26904a.this.f127306y.mo9224q(new C19964c(this.f127323v));
                C26904a.this.m138674Z(true);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ty.a$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127324t;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f127324t == 0) {
                AbstractC24862s.m129228b(obj);
                C26904a.this.f127300A.mo9224q(new C19964c(AbstractC29094b.m145339a(true)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ty.a$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127326t;

        /* renamed from: v */
        final /* synthetic */ a f127328v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f127328v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f127328v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f127326t == 0) {
                AbstractC24862s.m129228b(obj);
                C26904a.this.f127307z.mo9224q(this.f127328v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ty.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ C26904a f127329q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CoroutineExceptionHandler.Key key, C26904a c26904a) {
            super(key);
            this.f127329q = c26904a;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC3082b0.m15422d(this.f127329q.getClass().getName(), "ex " + th2);
        }
    }

    public C26904a() {
        f fVar = new f(CoroutineExceptionHandler.f105837l, this);
        this.f127301t = fVar;
        this.f127302u = CoroutineScopeKt.m112637a(SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112681c()).mo112823d0(fVar));
        this.f127303v = new b(null, null, null, null, null, false, 63, null);
        this.f127305x = new C1761c0(0);
        this.f127306y = new C1761c0();
        this.f127307z = new C1761c0();
        this.f127300A = new C1761c0();
    }

    /* renamed from: S */
    public static /* synthetic */ Job m138666S(C26904a c26904a, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return c26904a.m138667R(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        super.mo9130J();
        if (CoroutineScopeKt.m112642f(this.f127302u)) {
            JobKt__JobKt.m112768g(this.f127302u.mo9207O(), null, 1, null);
        }
    }

    /* renamed from: R */
    public final Job m138667R(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "withResult");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f127302u, null, null, new c(str, null), 3, null);
        return m112540d;
    }

    /* renamed from: T */
    public final LiveData m138668T() {
        return this.f127307z;
    }

    /* renamed from: U */
    public final b m138669U() {
        return this.f127303v;
    }

    /* renamed from: V */
    public final LiveData m138670V() {
        return this.f127305x;
    }

    /* renamed from: W */
    public final boolean m138671W() {
        if (this.f127307z.mo9215f() == a.f127310r) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final Job m138672X() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f127302u, null, null, new d(null), 3, null);
        return m112540d;
    }

    /* renamed from: Y */
    public void m138673Y(C9207a c9207a) {
        super.m103748N(c9207a);
        if (c9207a != null) {
            this.f127303v.m138687j(c9207a.m49096c());
            this.f127303v.m138688k(c9207a.m49095b());
            this.f127305x.mo9224q(Integer.valueOf(c9207a.m49094a()));
        }
    }

    /* renamed from: Z */
    public final void m138674Z(boolean z11) {
        this.f127304w = z11;
    }

    /* renamed from: a0 */
    public final Job m138675a0(a aVar) {
        Job m112540d;
        AbstractC19074t.m100208f(aVar, "imageState");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f127302u, null, null, new e(aVar, null), 3, null);
        return m112540d;
    }

    /* renamed from: b0 */
    public final void m138676b0(int i11) {
        this.f127305x.mo9224q(Integer.valueOf(i11));
    }
}
