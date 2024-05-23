package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1791r implements InterfaceC1795t {

    /* renamed from: p */
    private final AbstractC1785o f7220p;

    /* renamed from: q */
    private final InterfaceC27315f f7221q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* loaded from: classes2.dex */
    public static final class C1744a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f7222t;

        /* renamed from: u */
        private /* synthetic */ Object f7223u;

        C1744a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C1744a c1744a = new C1744a(continuation);
            c1744a.f7223u = obj;
            return c1744a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f7222t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f7223u;
                if (LifecycleCoroutineScopeImpl.this.mo9208b().mo9336b().compareTo(AbstractC1785o.b.INITIALIZED) < 0) {
                    JobKt__JobKt.m112765d(coroutineScope.mo9207O(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.mo9208b().mo9335a(LifecycleCoroutineScopeImpl.this);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1744a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public LifecycleCoroutineScopeImpl(AbstractC1785o abstractC1785o, InterfaceC27315f interfaceC27315f) {
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        AbstractC19074t.m100208f(interfaceC27315f, "coroutineContext");
        this.f7220p = abstractC1785o;
        this.f7221q = interfaceC27315f;
        if (mo9208b().mo9336b() == AbstractC1785o.b.DESTROYED) {
            JobKt__JobKt.m112765d(mo9207O(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: O */
    public InterfaceC27315f mo9207O() {
        return this.f7221q;
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        if (mo9208b().mo9336b().compareTo(AbstractC1785o.b.DESTROYED) <= 0) {
            mo9208b().mo9338d(this);
            JobKt__JobKt.m112765d(mo9207O(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.AbstractC1791r
    /* renamed from: b */
    public AbstractC1785o mo9208b() {
        return this.f7220p;
    }

    /* renamed from: d */
    public final void m9209d() {
        BuildersKt__Builders_commonKt.m112540d(this, Dispatchers.m112681c().mo112861G0(), null, new C1744a(null), 2, null);
    }
}
