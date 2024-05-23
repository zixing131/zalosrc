package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: androidx.lifecycle.g0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1770g0 {

    /* renamed from: androidx.lifecycle.g0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f7309t;

        /* renamed from: u */
        private /* synthetic */ Object f7310u;

        /* renamed from: v */
        final /* synthetic */ AbstractC1785o f7311v;

        /* renamed from: w */
        final /* synthetic */ AbstractC1785o.b f7312w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18509p f7313x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC1785o abstractC1785o, AbstractC1785o.b bVar, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f7311v = abstractC1785o;
            this.f7312w = bVar;
            this.f7313x = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f7311v, this.f7312w, this.f7313x, continuation);
            aVar.f7310u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C1789q c1789q;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f7309t;
            if (i11 != 0) {
                if (i11 == 1) {
                    c1789q = (C1789q) this.f7310u;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        c1789q.m9350b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Job job = (Job) ((CoroutineScope) this.f7310u).mo9207O().mo112624d(Job.f105897m);
                if (job != null) {
                    C1768f0 c1768f0 = new C1768f0();
                    C1789q c1789q2 = new C1789q(this.f7311v, this.f7312w, c1768f0.f7306r, job);
                    try {
                        InterfaceC18509p interfaceC18509p = this.f7313x;
                        this.f7310u = c1789q2;
                        this.f7309t = 1;
                        obj = BuildersKt.m112534g(c1768f0, interfaceC18509p, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c1789q = c1789q2;
                    } catch (Throwable th3) {
                        th = th3;
                        c1789q = c1789q2;
                        c1789q.m9350b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            }
            c1789q.m9350b();
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final Object m9280a(AbstractC1785o abstractC1785o, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        return m9281b(abstractC1785o, AbstractC1785o.b.CREATED, interfaceC18509p, continuation);
    }

    /* renamed from: b */
    public static final Object m9281b(AbstractC1785o abstractC1785o, AbstractC1785o.b bVar, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112681c().mo112861G0(), new a(abstractC1785o, bVar, interfaceC18509p, null), continuation);
    }
}
