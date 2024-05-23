package kc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kg0.C21719b;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p534u1.AbstractC26941a;

/* renamed from: kc0.p */
/* loaded from: classes6.dex */
public final class C21677p implements C1802w0.b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static C21677p f105202a;

    /* renamed from: kc0.p$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C21677p m111768a() {
            C21677p c21677p;
            c21677p = C21677p.f105202a;
            if (c21677p == null) {
                c21677p = new C21677p();
                C21677p.f105202a = c21677p;
            }
            return c21677p;
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
        if (cls.isAssignableFrom(C21672k.class)) {
            C21719b m120655d2 = AbstractC23306f.m120655d2();
            AbstractC19074t.m100207e(m120655d2, "provideZaloCloudManager(...)");
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C21672k c21672k = new C21672k(m120655d2, m120679j2);
            AbstractC1796t0 abstractC1796t0 = (AbstractC1796t0) cls.cast(c21672k);
            if (abstractC1796t0 != null) {
                return abstractC1796t0;
            }
            throw new ClassCastException("Cannot cast " + c21672k + " to " + cls.getName());
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
