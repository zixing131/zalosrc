package androidx.lifecycle;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes2.dex */
public abstract class AbstractC1791r implements CoroutineScope {

    /* renamed from: androidx.lifecycle.r$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f7384t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18509p f7386v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f7386v = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f7386v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f7384t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC1785o mo9208b = AbstractC1791r.this.mo9208b();
                InterfaceC18509p interfaceC18509p = this.f7386v;
                this.f7384t = 1;
                if (AbstractC1770g0.m9280a(mo9208b, interfaceC18509p, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: b */
    public abstract AbstractC1785o mo9208b();

    /* renamed from: c */
    public final Job m9355c(InterfaceC18509p interfaceC18509p) {
        Job m112540d;
        AbstractC19074t.m100208f(interfaceC18509p, "block");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this, null, null, new a(interfaceC18509p, null), 3, null);
        return m112540d;
    }
}
