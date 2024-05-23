package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1802w0;
import androidx.savedstate.C1938a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p089d2.InterfaceC17712d;
import p534u1.AbstractC26941a;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1754a extends C1802w0.d implements C1802w0.b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C1938a f7288a;

    /* renamed from: b */
    private AbstractC1785o f7289b;

    /* renamed from: c */
    private Bundle f7290c;

    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public AbstractC1754a(InterfaceC17712d interfaceC17712d, Bundle bundle) {
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f7288a = interfaceC17712d.mo4648jf();
        this.f7289b = interfaceC17712d.getLifecycle();
        this.f7290c = bundle;
    }

    /* renamed from: d */
    private final AbstractC1796t0 m9253d(String str, Class cls) {
        C1938a c1938a = this.f7288a;
        AbstractC19074t.m100205c(c1938a);
        AbstractC1785o abstractC1785o = this.f7289b;
        AbstractC19074t.m100205c(abstractC1785o);
        SavedStateHandleController m9204b = LegacySavedStateHandleController.m9204b(c1938a, abstractC1785o, str, this.f7290c);
        AbstractC1796t0 mo9255e = mo9255e(str, cls, m9204b.m9251c());
        mo9255e.m9372K("androidx.lifecycle.savedstate.vm.tag", m9204b);
        return mo9255e;
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(abstractC26941a, "extras");
        String str = (String) abstractC26941a.mo138786a(C1802w0.c.f7418b);
        if (str != null) {
            if (this.f7288a != null) {
                return m9253d(str, cls);
            }
            return mo9255e(str, cls, AbstractC1782m0.m9326b(abstractC26941a));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f7289b != null) {
                return m9253d(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1802w0.d
    /* renamed from: c */
    public void mo9254c(AbstractC1796t0 abstractC1796t0) {
        AbstractC19074t.m100208f(abstractC1796t0, "viewModel");
        C1938a c1938a = this.f7288a;
        if (c1938a != null) {
            AbstractC19074t.m100205c(c1938a);
            AbstractC1785o abstractC1785o = this.f7289b;
            AbstractC19074t.m100205c(abstractC1785o);
            LegacySavedStateHandleController.m9203a(abstractC1796t0, c1938a, abstractC1785o);
        }
    }

    /* renamed from: e */
    protected abstract AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0);
}
