package kc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;
import zg0.C31831a;

/* renamed from: kc0.w */
/* loaded from: classes6.dex */
public final class C21684w implements C1802w0.b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static C21684w f105240a;

    /* renamed from: kc0.w$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C21684w m111821a() {
            C21684w c21684w;
            c21684w = C21684w.f105240a;
            if (c21684w == null) {
                c21684w = new C21684w();
                C21684w.f105240a = c21684w;
            }
            return c21684w;
        }
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C21683v.class)) {
            C21683v c21683v = new C21683v(C31831a.Companion.m152940a());
            AbstractC1796t0 abstractC1796t0 = (AbstractC1796t0) cls.cast(c21683v);
            if (abstractC1796t0 != null) {
                return abstractC1796t0;
            }
            throw new ClassCastException("Cannot cast " + c21683v + " to " + cls.getName());
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
