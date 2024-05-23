package be0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import mh.AbstractC23295a;
import mh.C23298d;
import p185gc.AbstractC19383g;
import p716zh.C31832a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28081h4;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: be0.j */
/* loaded from: classes4.dex */
public final class C2785j extends AbstractC19383g {

    /* renamed from: a */
    private final C23298d f11079a;

    /* renamed from: b */
    private final C28081h4 f11080b;

    /* renamed from: c */
    private final CoroutineDispatcher f11081c;

    /* renamed from: be0.j$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C31832a f11082a;

        public a(C31832a c31832a) {
            AbstractC19074t.m100208f(c31832a, "ackStatus");
            this.f11082a = c31832a;
        }

        /* renamed from: a */
        public final C31832a m13418a() {
            return this.f11082a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f11082a, ((a) obj).f11082a);
        }

        public int hashCode() {
            return this.f11082a.hashCode();
        }

        public String toString() {
            return "Params(ackStatus=" + this.f11082a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f11083t;

        /* renamed from: v */
        final /* synthetic */ a f11085v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f11085v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f11085v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f11083t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (AbstractC23295a.m120435b()) {
                    C23298d c23298d = C2785j.this.f11079a;
                    C31832a m13418a = this.f11085v.m13418a();
                    this.f11083t = 1;
                    if (c23298d.m120480p(m13418a, this) == m142578e) {
                        return m142578e;
                    }
                } else {
                    C2785j.this.f11080b.m141548i(this.f11085v.m13418a());
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

    public C2785j(C23298d c23298d, C28081h4 c28081h4, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        AbstractC19074t.m100208f(c28081h4, "oldGroupDeliveredSeenManager");
        AbstractC19074t.m100208f(coroutineDispatcher, "defaultDispatcher");
        this.f11079a = c23298d;
        this.f11080b = c28081h4;
        this.f11081c = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(this.f11081c), null, null, new b(aVar, null), 3, null);
    }
}
