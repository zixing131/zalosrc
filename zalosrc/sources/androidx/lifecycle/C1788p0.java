package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1802w0;
import androidx.savedstate.C1938a;
import fn0.AbstractC19074t;
import java.lang.reflect.Constructor;
import java.util.List;
import p089d2.InterfaceC17712d;
import p534u1.AbstractC26941a;

/* renamed from: androidx.lifecycle.p0 */
/* loaded from: classes.dex */
public final class C1788p0 extends C1802w0.d implements C1802w0.b {

    /* renamed from: a */
    private Application f7373a;

    /* renamed from: b */
    private final C1802w0.b f7374b;

    /* renamed from: c */
    private Bundle f7375c;

    /* renamed from: d */
    private AbstractC1785o f7376d;

    /* renamed from: e */
    private C1938a f7377e;

    public C1788p0() {
        this.f7374b = new C1802w0.a();
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        List list;
        Constructor m9353c;
        List list2;
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(abstractC26941a, "extras");
        String str = (String) abstractC26941a.mo138786a(C1802w0.c.f7418b);
        if (str != null) {
            if (abstractC26941a.mo138786a(AbstractC1782m0.f7352a) != null && abstractC26941a.mo138786a(AbstractC1782m0.f7353b) != null) {
                Application application = (Application) abstractC26941a.mo138786a(C1802w0.a.f7414f);
                boolean isAssignableFrom = AbstractC1757b.class.isAssignableFrom(cls);
                if (!isAssignableFrom || application == null) {
                    list = AbstractC1790q0.f7383b;
                    m9353c = AbstractC1790q0.m9353c(cls, list);
                } else {
                    list2 = AbstractC1790q0.f7382a;
                    m9353c = AbstractC1790q0.m9353c(cls, list2);
                }
                if (m9353c == null) {
                    return this.f7374b.mo1195a(cls, abstractC26941a);
                }
                if (isAssignableFrom && application != null) {
                    return AbstractC1790q0.m9354d(cls, m9353c, application, AbstractC1782m0.m9326b(abstractC26941a));
                }
                return AbstractC1790q0.m9354d(cls, m9353c, AbstractC1782m0.m9326b(abstractC26941a));
            }
            if (this.f7376d != null) {
                return m9347d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m9347d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1802w0.d
    /* renamed from: c */
    public void mo9254c(AbstractC1796t0 abstractC1796t0) {
        AbstractC19074t.m100208f(abstractC1796t0, "viewModel");
        if (this.f7376d != null) {
            C1938a c1938a = this.f7377e;
            AbstractC19074t.m100205c(c1938a);
            AbstractC1785o abstractC1785o = this.f7376d;
            AbstractC19074t.m100205c(abstractC1785o);
            LegacySavedStateHandleController.m9203a(abstractC1796t0, c1938a, abstractC1785o);
        }
    }

    /* renamed from: d */
    public final AbstractC1796t0 m9347d(String str, Class cls) {
        List list;
        Constructor m9353c;
        AbstractC1796t0 m9354d;
        Application application;
        List list2;
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC1785o abstractC1785o = this.f7376d;
        if (abstractC1785o != null) {
            boolean isAssignableFrom = AbstractC1757b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f7373a == null) {
                list = AbstractC1790q0.f7383b;
                m9353c = AbstractC1790q0.m9353c(cls, list);
            } else {
                list2 = AbstractC1790q0.f7382a;
                m9353c = AbstractC1790q0.m9353c(cls, list2);
            }
            if (m9353c == null) {
                if (this.f7373a != null) {
                    return this.f7374b.mo1196b(cls);
                }
                return C1802w0.c.Companion.m9387a().mo1196b(cls);
            }
            C1938a c1938a = this.f7377e;
            AbstractC19074t.m100205c(c1938a);
            SavedStateHandleController m9204b = LegacySavedStateHandleController.m9204b(c1938a, abstractC1785o, str, this.f7375c);
            if (isAssignableFrom && (application = this.f7373a) != null) {
                AbstractC19074t.m100205c(application);
                m9354d = AbstractC1790q0.m9354d(cls, m9353c, application, m9204b.m9251c());
            } else {
                m9354d = AbstractC1790q0.m9354d(cls, m9353c, m9204b.m9251c());
            }
            m9354d.m9372K("androidx.lifecycle.savedstate.vm.tag", m9204b);
            return m9354d;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1788p0(Application application, InterfaceC17712d interfaceC17712d) {
        this(application, interfaceC17712d, null);
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
    }

    public C1788p0(Application application, InterfaceC17712d interfaceC17712d, Bundle bundle) {
        C1802w0.a aVar;
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f7377e = interfaceC17712d.mo4648jf();
        this.f7376d = interfaceC17712d.getLifecycle();
        this.f7375c = bundle;
        this.f7373a = application;
        if (application != null) {
            aVar = C1802w0.a.f7412d.m9384b(application);
        } else {
            aVar = new C1802w0.a();
        }
        this.f7374b = aVar;
    }
}
