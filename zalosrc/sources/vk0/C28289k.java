package vk0;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: vk0.k */
/* loaded from: classes7.dex */
public class C28289k {

    /* renamed from: a */
    private final CoroutineScope f131975a;

    /* renamed from: b */
    private final C28283e f131976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vk0.k$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f131977t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f131978u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f131978u = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f131978u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131977t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18505l interfaceC18505l = this.f131978u;
                this.f131977t = 1;
                if (interfaceC18505l.mo205i9(this) == m142578e) {
                    return m142578e;
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

    public C28289k(CoroutineScope coroutineScope, C28283e c28283e) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(c28283e, "universalContext");
        this.f131975a = coroutineScope;
        this.f131976b = c28283e;
    }

    /* renamed from: a */
    public final Job m142539a(C28283e c28283e, InterfaceC18505l interfaceC18505l) {
        Job m112540d;
        AbstractC19074t.m100208f(c28283e, "context");
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f131975a, c28283e, null, new a(interfaceC18505l, null), 2, null);
        return m112540d;
    }

    public /* synthetic */ C28289k(CoroutineScope coroutineScope, C28283e c28283e, int i11, AbstractC19060k abstractC19060k) {
        this(coroutineScope, (i11 & 2) != 0 ? new C28279a() : c28283e);
    }
}
