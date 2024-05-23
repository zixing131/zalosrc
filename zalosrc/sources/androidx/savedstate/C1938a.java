package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.savedstate.C1938a;
import androidx.savedstate.Recreator;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Map;
import p089d2.InterfaceC17712d;
import p376o0.C23974b;

/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C1938a {

    /* renamed from: g */
    private static final b f8233g = new b(null);

    /* renamed from: b */
    private boolean f8235b;

    /* renamed from: c */
    private Bundle f8236c;

    /* renamed from: d */
    private boolean f8237d;

    /* renamed from: e */
    private Recreator.C1937b f8238e;

    /* renamed from: a */
    private final C23974b f8234a = new C23974b();

    /* renamed from: f */
    private boolean f8239f = true;

    /* renamed from: androidx.savedstate.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo9206a(InterfaceC17712d interfaceC17712d);
    }

    /* renamed from: androidx.savedstate.a$b */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.a$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        Bundle mo4659a();
    }

    /* renamed from: d */
    public static final void m10703d(C1938a c1938a, InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(c1938a, "this$0");
        AbstractC19074t.m100208f(interfaceC1801w, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(aVar, "event");
        if (aVar == AbstractC1785o.a.ON_START) {
            c1938a.f8239f = true;
        } else if (aVar == AbstractC1785o.a.ON_STOP) {
            c1938a.f8239f = false;
        }
    }

    /* renamed from: b */
    public final Bundle m10704b(String str) {
        Bundle bundle;
        AbstractC19074t.m100208f(str, "key");
        if (this.f8237d) {
            Bundle bundle2 = this.f8236c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f8236c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f8236c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f8236c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final c m10705c(String str) {
        AbstractC19074t.m100208f(str, "key");
        Iterator it = this.f8234a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC19074t.m100207e(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (AbstractC19074t.m100204b(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m10706e(AbstractC1785o abstractC1785o) {
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        if (!this.f8235b) {
            abstractC1785o.mo9335a(new InterfaceC1795t() { // from class: d2.b
                public /* synthetic */ C17710b() {
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public final void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    C1938a.m10703d(C1938a.this, interfaceC1801w, aVar);
                }
            });
            this.f8235b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void m10707f(Bundle bundle) {
        Bundle bundle2;
        if (this.f8235b) {
            if (!this.f8237d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                this.f8236c = bundle2;
                this.f8237d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    /* renamed from: g */
    public final void m10708g(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f8236c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C23974b.d m125462g = this.f8234a.m125462g();
        AbstractC19074t.m100207e(m125462g, "this.components.iteratorWithAdditions()");
        while (m125462g.hasNext()) {
            Map.Entry entry = (Map.Entry) m125462g.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).mo4659a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: h */
    public final void m10709h(String str, c cVar) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cVar, "provider");
        if (((c) this.f8234a.mo125458l(str, cVar)) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void m10710i(Class cls) {
        AbstractC19074t.m100208f(cls, "clazz");
        if (this.f8239f) {
            Recreator.C1937b c1937b = this.f8238e;
            if (c1937b == null) {
                c1937b = new Recreator.C1937b(this);
            }
            this.f8238e = c1937b;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1937b c1937b2 = this.f8238e;
                if (c1937b2 != null) {
                    String name = cls.getName();
                    AbstractC19074t.m100207e(name, "clazz.name");
                    c1937b2.m10701b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e11) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
