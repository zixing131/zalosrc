package l50;

import am.AbstractC0924m0;
import bp0.AbstractC3082b0;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lo0.AbstractC22609k0;
import on0.AbstractC24341v;
import p185gc.AbstractC19380d;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.a */
/* loaded from: classes5.dex */
public final class C22079a extends AbstractC19380d {

    /* renamed from: a */
    private final C20304a f108684a;

    /* renamed from: l50.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108685t;

        /* renamed from: l50.a$a$a */
        /* loaded from: classes5.dex */
        public static final class C32877a implements FlowCollector {

            /* renamed from: p */
            public static final C32877a f108687p = new C32877a();

            C32877a() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                boolean m127128x;
                if (!(abstractC24900c instanceof AbstractC24900c.b)) {
                    if (abstractC24900c instanceof AbstractC24900c.a) {
                        AbstractC3082b0.m15421c("CheckDownloadRingtone", "onError " + ((AbstractC24900c.a) abstractC24900c).m129473a());
                    } else if (abstractC24900c instanceof AbstractC24900c.c) {
                        String str = (String) ((AbstractC24900c.c) abstractC24900c).m129474a();
                        m127128x = AbstractC24341v.m127128x(str);
                        if (!m127128x) {
                            AbstractC0924m0.m3497Up(str);
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:            if (r1.m115219c().m105999y() == false) goto L49;     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            boolean m127128x;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f108685t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (C20304a.m105972q(C22079a.this.m115219c(), false, 1, null) != 3) {
                    return C24848g0.f119245a;
                }
                RingtoneData m105995r = C22079a.this.m115219c().m105995r();
                if (m105995r != null) {
                    C22079a c22079a = C22079a.this;
                    String m3683b7 = AbstractC0924m0.m3683b7();
                    if (m3683b7 != null) {
                        m127128x = AbstractC24341v.m127128x(m3683b7);
                        if (!m127128x) {
                        }
                    }
                    AbstractC0924m0.m3497Up(AbstractC22609k0.f110725a);
                    Flow flow = (Flow) new C22082d().m101509a(m105995r.m58732d());
                    if (flow != null) {
                        C32877a c32877a = C32877a.f108687p;
                        this.f108685t = 1;
                        if (flow.mo97893a(c32877a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22079a() {
        this(null, 1, null);
    }

    @Override // p185gc.AbstractC19380d
    /* renamed from: b */
    protected void mo101505b() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(null), 3, null);
    }

    /* renamed from: c */
    public final C20304a m115219c() {
        return this.f108684a;
    }

    public C22079a(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108684a = c20304a;
    }

    public /* synthetic */ C22079a(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
