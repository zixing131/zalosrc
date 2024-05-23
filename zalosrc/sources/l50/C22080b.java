package l50;

import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneNotFound;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p185gc.AbstractC19380d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.b */
/* loaded from: classes5.dex */
public final class C22080b extends AbstractC19380d {

    /* renamed from: a */
    private final C20304a f108688a;

    /* renamed from: l50.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ C22080b f108689q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, C22080b c22080b) {
            super(key);
            this.f108689q = c22080b;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            if (th2 instanceof ExceptionRingtoneNotFound) {
                this.f108689q.m115222c().m105976A();
                this.f108689q.m115222c().m105979D();
            }
        }
    }

    /* renamed from: l50.b$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108690t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f108690t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (!C22080b.this.m115222c().m105980E()) {
                    return C24848g0.f119245a;
                }
                if (C20304a.m105972q(C22080b.this.m115222c(), false, 1, null) != 3) {
                    return C24848g0.f119245a;
                }
                RingtoneData m105995r = C22080b.this.m115222c().m105995r();
                if (m105995r != null) {
                    C22080b c22080b = C22080b.this;
                    c22080b.m115222c().m105979D();
                    C20304a m115222c = c22080b.m115222c();
                    String m58732d = m105995r.m58732d();
                    this.f108690t = 1;
                    if (m115222c.mo105986f(m58732d, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22080b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p185gc.AbstractC19380d
    /* renamed from: b */
    protected void mo101505b() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), new a(CoroutineExceptionHandler.f105837l, this), null, new b(null), 2, null);
    }

    /* renamed from: c */
    public final C20304a m115222c() {
        return this.f108688a;
    }

    public C22080b(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108688a = c20304a;
    }

    public /* synthetic */ C22080b(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
