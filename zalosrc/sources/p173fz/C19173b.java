package p173fz;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19047d0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import mn0.InterfaceC23370h;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: fz.b */
/* loaded from: classes4.dex */
public final class C19173b {
    public static final b Companion = new b(null);

    /* renamed from: g */
    private static final InterfaceC24854k f95285g;

    /* renamed from: a */
    private final Map f95286a;

    /* renamed from: b */
    private final CoroutineScope f95287b;

    /* renamed from: c */
    private final MutableSharedFlow f95288c;

    /* renamed from: d */
    private final SharedFlow f95289d;

    /* renamed from: e */
    private final Map f95290e;

    /* renamed from: f */
    private final ConcurrentHashMap f95291f;

    /* renamed from: fz.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f95292q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19173b mo12V4() {
            return d.f95296a.m100623a();
        }
    }

    /* renamed from: fz.b$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC23370h[] f95293a = {AbstractC19061k0.m100173f(new C19047d0(AbstractC19061k0.m100169b(b.class), "instance", "getInstance()Lcom/zing/zalo/remoteconfig/RemoteConfigObserver;"))};

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19173b m100622a() {
            return (C19173b) C19173b.f95285g.getValue();
        }
    }

    /* renamed from: fz.b$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private String f95294a;

        /* renamed from: b */
        private Object f95295b;

        public c(String str, Object obj) {
            AbstractC19074t.m100208f(str, "key");
            this.f95294a = str;
            this.f95295b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f95294a, cVar.f95294a) && AbstractC19074t.m100204b(this.f95295b, cVar.f95295b);
        }

        public int hashCode() {
            int hashCode = this.f95294a.hashCode() * 31;
            Object obj = this.f95295b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "FlowData(key=" + this.f95294a + ", value=" + this.f95295b + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fz.b$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f95296a = new d();

        /* renamed from: b */
        private static final C19173b f95297b = new C19173b(null);

        private d() {
        }

        /* renamed from: a */
        public final C19173b m100623a() {
            return f95297b;
        }
    }

    /* renamed from: fz.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95298t;

        /* renamed from: v */
        final /* synthetic */ String f95300v;

        /* renamed from: w */
        final /* synthetic */ Object f95301w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f95300v = str;
            this.f95301w = obj;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f95300v, this.f95301w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95298t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C19173b.this.f95288c;
                c cVar = new c(this.f95300v, this.f95301w);
                this.f95298t = 1;
                if (mutableSharedFlow.mo12109b(cVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f95292q);
        f95285g = m129210a;
    }

    public /* synthetic */ C19173b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    public final void m100620c(String str, Object obj) {
        AbstractC19074t.m100208f(str, "key");
        if (this.f95286a.containsKey(str)) {
            BuildersKt__Builders_commonKt.m112540d(this.f95287b, null, null, new e(str, obj, null), 3, null);
        }
    }

    private C19173b() {
        SharedFlow m113394f;
        this.f95286a = new LinkedHashMap();
        CoroutineScope m112637a = CoroutineScopeKt.m112637a(new CoroutineName("REMOTE_CONFIG_OBSERVER_SCOPE").mo112823d0(Dispatchers.m112679a()));
        this.f95287b = m112637a;
        MutableSharedFlow m113478b = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f95288c = m113478b;
        m113394f = FlowKt__ShareKt.m113394f(m113478b, m112637a, SharingStarted.Companion.m113490b(SharingStarted.f107140a, 0L, 0L, 3, null), 0, 4, null);
        this.f95289d = m113394f;
        this.f95290e = new LinkedHashMap();
        this.f95291f = new ConcurrentHashMap();
    }
}
