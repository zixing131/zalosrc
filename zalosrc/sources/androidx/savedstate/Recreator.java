package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.savedstate.C1938a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p089d2.InterfaceC17712d;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC1795t {

    /* renamed from: q */
    public static final C1936a f8230q = new C1936a(null);

    /* renamed from: p */
    private final InterfaceC17712d f8231p;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C1936a {
        private C1936a() {
        }

        public /* synthetic */ C1936a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    /* loaded from: classes2.dex */
    public static final class C1937b implements C1938a.c {

        /* renamed from: a */
        private final Set f8232a;

        public C1937b(C1938a c1938a) {
            AbstractC19074t.m100208f(c1938a, "registry");
            this.f8232a = new LinkedHashSet();
            c1938a.m10709h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.C1938a.c
        /* renamed from: a */
        public Bundle mo4659a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f8232a));
            return bundle;
        }

        /* renamed from: b */
        public final void m10701b(String str) {
            AbstractC19074t.m100208f(str, "className");
            this.f8232a.add(str);
        }
    }

    public Recreator(InterfaceC17712d interfaceC17712d) {
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f8231p = interfaceC17712d;
    }

    /* renamed from: b */
    private final void m10700b(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1938a.a.class);
            AbstractC19074t.m100207e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    AbstractC19074t.m100207e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C1938a.a) newInstance).mo9206a(this.f8231p);
                } catch (Exception e11) {
                    throw new RuntimeException("Failed to instantiate " + str, e11);
                }
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("Class " + str + " wasn't found", e13);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        if (aVar == AbstractC1785o.a.ON_CREATE) {
            interfaceC1801w.getLifecycle().mo9338d(this);
            Bundle m10704b = this.f8231p.mo4648jf().m10704b("androidx.savedstate.Restarter");
            if (m10704b == null) {
                return;
            }
            ArrayList<String> stringArrayList = m10704b.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    m10700b(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
