package um0;

import com.google.android.gms.internal.ads.ya3;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import pm0.C24861r;
import vm0.AbstractC28298d;
import vm0.EnumC28295a;
import wm0.InterfaceC29097e;

/* renamed from: um0.h */
/* loaded from: classes7.dex */
public final class C27317h implements Continuation, InterfaceC29097e {

    /* renamed from: q */
    private static final a f128560q = new a(null);

    /* renamed from: r */
    private static final AtomicReferenceFieldUpdater f128561r = AtomicReferenceFieldUpdater.newUpdater(C27317h.class, Object.class, "result");

    /* renamed from: p */
    private final Continuation f128562p;
    private volatile Object result;

    /* renamed from: um0.h$a */
    /* loaded from: classes7.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C27317h(Continuation continuation, Object obj) {
        AbstractC19074t.m100208f(continuation, "delegate");
        this.f128562p = continuation;
        this.result = obj;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: C */
    public StackTraceElement mo112573C() {
        return null;
    }

    /* renamed from: a */
    public final Object m139856a() {
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        Object obj = this.result;
        EnumC28295a enumC28295a = EnumC28295a.f131998q;
        if (obj == enumC28295a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f128561r;
            m142578e2 = AbstractC28298d.m142578e();
            if (ya3.m28173a(atomicReferenceFieldUpdater, this, enumC28295a, m142578e2)) {
                m142578e3 = AbstractC28298d.m142578e();
                return m142578e3;
            }
            obj = this.result;
        }
        if (obj == EnumC28295a.f131999r) {
            m142578e = AbstractC28298d.m142578e();
            return m142578e;
        }
        if (!(obj instanceof C24861r.b)) {
            return obj;
        }
        throw ((C24861r.b) obj).f119266p;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: e */
    public InterfaceC29097e mo112582e() {
        Continuation continuation = this.f128562p;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        Object m142578e;
        Object m142578e2;
        while (true) {
            Object obj2 = this.result;
            EnumC28295a enumC28295a = EnumC28295a.f131998q;
            if (obj2 != enumC28295a) {
                m142578e = AbstractC28298d.m142578e();
                if (obj2 == m142578e) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f128561r;
                    m142578e2 = AbstractC28298d.m142578e();
                    if (ya3.m28173a(atomicReferenceFieldUpdater, this, m142578e2, EnumC28295a.f131999r)) {
                        this.f128562p.mo112492g(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (ya3.m28173a(f128561r, this, enumC28295a, obj)) {
                return;
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return this.f128562p.getContext();
    }

    public String toString() {
        return "SafeContinuation for " + this.f128562p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27317h(Continuation continuation) {
        this(continuation, EnumC28295a.f131998q);
        AbstractC19074t.m100208f(continuation, "delegate");
    }
}
