package l50;

import bp0.AbstractC3082b0;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneNotFound;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import k50.C21475c;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.C23055e5;
import p185gc.AbstractC19383g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.p */
/* loaded from: classes5.dex */
public final class C22094p extends AbstractC19383g {

    /* renamed from: a */
    private final C20304a f108767a;

    /* renamed from: l50.p$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ C22094p f108768q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, C22094p c22094p) {
            super(key);
            this.f108768q = c22094p;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC3082b0.m15422d(this.f108768q.getClass().getName(), th2.getMessage());
            th2.printStackTrace();
            if (th2 instanceof ExceptionRingtoneNotFound) {
                this.f108768q.m115291c().m105976A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l50.p$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f108769t;

        /* renamed from: u */
        int f108770u;

        /* renamed from: w */
        final /* synthetic */ String f108772w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation continuation) {
            super(2, continuation);
            this.f108772w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f108772w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object mo105986f;
            C22094p c22094p;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f108770u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c22094p = (C22094p) this.f108769t;
                    AbstractC24862s.m129228b(obj);
                    mo105986f = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (C20304a.m105972q(C22094p.this.m115291c(), false, 1, null) != 3) {
                    return C24848g0.f119245a;
                }
                RingtoneData m105995r = C22094p.this.m115291c().m105995r();
                String str = this.f108772w;
                C22094p c22094p2 = C22094p.this;
                if (m105995r == null || !AbstractC19074t.m100204b(m105995r.m58732d(), str)) {
                    c22094p2.m115291c().m105978C(new C21475c(str, null, null, null, null, null, null, 0L, 0L, 510, null));
                    if (!C23055e5.m118273h(false, 1, null)) {
                        return C24848g0.f119245a;
                    }
                    C20304a m115291c = c22094p2.m115291c();
                    this.f108769t = c22094p2;
                    this.f108770u = 1;
                    mo105986f = m115291c.mo105986f(str, this);
                    if (mo105986f == m142578e) {
                        return m142578e;
                    }
                    c22094p = c22094p2;
                }
                return C24848g0.f119245a;
            }
            c22094p.m115291c().m105978C((C21475c) mo105986f);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22094p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: c */
    public final C20304a m115291c() {
        return this.f108767a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(String str) {
        AbstractC19074t.m100208f(str, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), new a(CoroutineExceptionHandler.f105837l, this), null, new b(str, null), 2, null);
    }

    public C22094p(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108767a = c20304a;
    }

    public /* synthetic */ C22094p(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
