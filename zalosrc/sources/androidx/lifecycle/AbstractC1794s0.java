package androidx.lifecycle;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.InterfaceC19066n;
import pm0.C24848g0;
import pm0.InterfaceC24847g;

/* renamed from: androidx.lifecycle.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1794s0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.s0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C1755a0 f7395q;

        /* renamed from: r */
        final /* synthetic */ C19051f0 f7396r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1755a0 c1755a0, C19051f0 c19051f0) {
            super(1);
            this.f7395q = c1755a0;
            this.f7396r = c19051f0;
        }

        /* renamed from: a */
        public final void m9366a(Object obj) {
            Object mo9215f = this.f7395q.mo9215f();
            if (this.f7396r.f94928p || ((mo9215f == null && obj != null) || (mo9215f != null && !AbstractC19074t.m100204b(mo9215f, obj)))) {
                this.f7396r.f94928p = false;
                this.f7395q.mo9224q(obj);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m9366a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: androidx.lifecycle.s0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C1755a0 f7397q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f7398r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1755a0 c1755a0, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f7397q = c1755a0;
            this.f7398r = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m9367a(Object obj) {
            this.f7397q.mo9224q(this.f7398r.mo205i9(obj));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m9367a(obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.s0$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f7399p;

        c(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f7399p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f7399p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f7399p.mo205i9(obj);
        }
    }

    /* renamed from: a */
    public static final LiveData m9364a(LiveData liveData) {
        AbstractC19074t.m100208f(liveData, "<this>");
        C1755a0 c1755a0 = new C1755a0();
        C19051f0 c19051f0 = new C19051f0();
        c19051f0.f94928p = true;
        if (liveData.m9218i()) {
            c1755a0.mo9224q(liveData.mo9215f());
            c19051f0.f94928p = false;
        }
        c1755a0.m9256r(liveData, new c(new a(c1755a0, c19051f0)));
        return c1755a0;
    }

    /* renamed from: b */
    public static final LiveData m9365b(LiveData liveData, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(liveData, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "transform");
        C1755a0 c1755a0 = new C1755a0();
        c1755a0.m9256r(liveData, new c(new b(c1755a0, interfaceC18505l)));
        return c1755a0;
    }
}
