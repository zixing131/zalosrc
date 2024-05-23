package n20;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: n20.a */
/* loaded from: classes5.dex */
public abstract class AbstractC23524a extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final MutableSharedFlow f114189s;

    /* renamed from: t */
    private final SharedFlow f114190t;

    /* renamed from: n20.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: n20.a$b */
    /* loaded from: classes5.dex */
    public static final class b {
        public static final a Companion;

        /* renamed from: c */
        private static final b f114191c;

        /* renamed from: a */
        private final String f114192a;

        /* renamed from: b */
        private final Object f114193b;

        /* renamed from: n20.a$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        static {
            AbstractC19060k abstractC19060k = null;
            Companion = new a(abstractC19060k);
            f114191c = new b("none", abstractC19060k, 2, abstractC19060k);
        }

        public b(String str, Object obj) {
            AbstractC19074t.m100208f(str, "name");
            this.f114192a = str;
            this.f114193b = obj;
        }

        /* renamed from: a */
        public final Object m123445a() {
            return this.f114193b;
        }

        /* renamed from: b */
        public final String m123446b() {
            return this.f114192a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f114192a, bVar.f114192a) && AbstractC19074t.m100204b(this.f114193b, bVar.f114193b);
        }

        public int hashCode() {
            int hashCode = this.f114192a.hashCode() * 31;
            Object obj = this.f114193b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Event(name=" + this.f114192a + ", data=" + this.f114193b + ")";
        }

        public /* synthetic */ b(String str, Object obj, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : obj);
        }
    }

    /* renamed from: n20.a$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114194t;

        /* renamed from: v */
        final /* synthetic */ b f114196v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f114196v = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f114196v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114194t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC23524a abstractC23524a = AbstractC23524a.this;
                b bVar = this.f114196v;
                this.f114194t = 1;
                if (abstractC23524a.m123444O(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public AbstractC23524a() {
        MutableSharedFlow m113478b = SharedFlowKt.m113478b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f114189s = m113478b;
        this.f114190t = FlowKt.m113283a(m113478b);
    }

    /* renamed from: M */
    public final SharedFlow m123442M() {
        return this.f114190t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m123443N(b bVar) {
        AbstractC19074t.m100208f(bVar, "event");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(bVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final Object m123444O(b bVar, Continuation continuation) {
        Object m142578e;
        Object mo12109b = this.f114189s.mo12109b(bVar, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo12109b == m142578e) {
            return mo12109b;
        }
        return C24848g0.f119245a;
    }
}
