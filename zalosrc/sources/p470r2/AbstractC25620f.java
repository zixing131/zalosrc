package p470r2;

import androidx.work.AbstractC2253u;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p535u2.C26976w;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: r2.f */
/* loaded from: classes2.dex */
public abstract class AbstractC25620f {

    /* renamed from: a */
    private static final String f122481a;

    /* renamed from: r2.f$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122482t;

        /* renamed from: u */
        final /* synthetic */ C25619e f122483u;

        /* renamed from: v */
        final /* synthetic */ C26976w f122484v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC25618d f122485w;

        /* renamed from: r2.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C32966a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ InterfaceC25618d f122486p;

            /* renamed from: q */
            final /* synthetic */ C26976w f122487q;

            C32966a(InterfaceC25618d interfaceC25618d, C26976w c26976w) {
                this.f122486p = interfaceC25618d;
                this.f122487q = c26976w;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25616b abstractC25616b, Continuation continuation) {
                this.f122486p.mo11624b(this.f122487q, abstractC25616b);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C25619e c25619e, C26976w c26976w, InterfaceC25618d interfaceC25618d, Continuation continuation) {
            super(2, continuation);
            this.f122483u = c25619e;
            this.f122484v = c26976w;
            this.f122485w = interfaceC25618d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f122483u, this.f122484v, this.f122485w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122482t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow m132305b = this.f122483u.m132305b(this.f122484v);
                C32966a c32966a = new C32966a(this.f122485w, this.f122484v);
                this.f122482t = 1;
                if (m132305b.mo97893a(c32966a, this) == m142578e) {
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

    static {
        String m11897i = AbstractC2253u.m11897i("WorkConstraintsTracker");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f122481a = m11897i;
    }

    /* renamed from: a */
    public static final /* synthetic */ String m132309a() {
        return f122481a;
    }

    /* renamed from: b */
    public static final Job m132310b(C25619e c25619e, C26976w c26976w, CoroutineDispatcher coroutineDispatcher, InterfaceC25618d interfaceC25618d) {
        CompletableJob m112763b;
        AbstractC19074t.m100208f(c25619e, "<this>");
        AbstractC19074t.m100208f(c26976w, "spec");
        AbstractC19074t.m100208f(coroutineDispatcher, "dispatcher");
        AbstractC19074t.m100208f(interfaceC25618d, "listener");
        m112763b = JobKt__JobKt.m112763b(null, 1, null);
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(coroutineDispatcher.mo112823d0(m112763b)), null, null, new a(c25619e, c26976w, interfaceC25618d, null), 3, null);
        return m112763b;
    }
}
