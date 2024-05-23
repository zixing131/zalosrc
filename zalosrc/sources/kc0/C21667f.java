package kc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p534u1.AbstractC26941a;

/* renamed from: kc0.f */
/* loaded from: classes6.dex */
public final class C21667f implements C1802w0.b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static C21667f f105131a;

    /* renamed from: kc0.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C21667f m111682a() {
            C21667f c21667f;
            c21667f = C21667f.f105131a;
            if (c21667f == null) {
                c21667f = new C21667f();
                C21667f.f105131a = c21667f;
            }
            return c21667f;
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
        if (cls.isAssignableFrom(C21666e.class)) {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C21666e c21666e = new C21666e(m120679j2);
            AbstractC1796t0 abstractC1796t0 = (AbstractC1796t0) cls.cast(c21666e);
            if (abstractC1796t0 != null) {
                return abstractC1796t0;
            }
            throw new ClassCastException("Cannot cast " + c21666e + " to " + cls.getName());
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
