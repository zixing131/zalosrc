package ta0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19610a;
import kc0.C21680s;
import nl.C23870a;
import p019aj.C0876j;
import p213hl.C20087c;
import p348mi.AbstractC23306f;
import p534u1.AbstractC26941a;
import p716zh.C32034n6;
import u80.C27114d2;
import wa0.C28897w;
import xd0.C29588d;

/* renamed from: ta0.b */
/* loaded from: classes6.dex */
public final class C26612b implements C1802w0.b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static C26612b f126017a;

    /* renamed from: ta0.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C26612b m136634a() {
            C26612b c26612b;
            try {
                if (C26612b.f126017a == null) {
                    C26612b.f126017a = new C26612b();
                }
                c26612b = C26612b.f126017a;
                AbstractC19074t.m100205c(c26612b);
            } catch (Throwable th2) {
                throw th2;
            }
            return c26612b;
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
        Object c21680s;
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C28897w.class)) {
            C20087c m120582G1 = AbstractC23306f.m120582G1();
            AbstractC19074t.m100207e(m120582G1, "provideToolStorageRepository(...)");
            C0876j m120584H0 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
            C32034n6 m120716u0 = AbstractC23306f.m120716u0();
            AbstractC19074t.m100207e(m120716u0, "provideLocalFileCleaner(...)");
            c21680s = new C28897w(m120582G1, m120584H0, m120716u0);
        } else if (cls.isAssignableFrom(C27114d2.class)) {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C0876j m120584H02 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H02, "provideMessageRepo(...)");
            c21680s = new C27114d2(m120679j2, m120584H02);
        } else if (cls.isAssignableFrom(C21680s.class)) {
            C19610a m120607P = AbstractC23306f.m120607P();
            AbstractC19074t.m100207e(m120607P, "provideDeleteMessageManager(...)");
            C29588d m120604O = AbstractC23306f.m120604O();
            AbstractC19074t.m100207e(m120604O, "provideDeleteLocalMessagesUseCase(...)");
            C0876j m120584H03 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H03, "provideMessageRepo(...)");
            C23870a m120679j22 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j22, "provideZaloCloudRepo(...)");
            c21680s = new C21680s(m120607P, m120604O, m120584H03, m120679j22);
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }
        if (cls.isInstance(c21680s)) {
            Object cast = cls.cast(c21680s);
            AbstractC19074t.m100205c(cast);
            return (AbstractC1796t0) cast;
        }
        throw new ClassCastException("Cannot cast " + c21680s + " to " + cls.getName());
    }
}
