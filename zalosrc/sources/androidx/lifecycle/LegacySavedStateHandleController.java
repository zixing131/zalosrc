package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.C1938a;
import fn0.AbstractC19074t;
import java.util.Iterator;
import p089d2.InterfaceC17712d;

/* loaded from: classes2.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a */
    public static final LegacySavedStateHandleController f7217a = new LegacySavedStateHandleController();

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    /* loaded from: classes2.dex */
    public static final class C1743a implements C1938a.a {
        @Override // androidx.savedstate.C1938a.a
        /* renamed from: a */
        public void mo9206a(InterfaceC17712d interfaceC17712d) {
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
            if (interfaceC17712d instanceof InterfaceC1756a1) {
                C1808z0 mo4644Oc = ((InterfaceC1756a1) interfaceC17712d).mo4644Oc();
                C1938a mo4648jf = interfaceC17712d.mo4648jf();
                Iterator it = mo4644Oc.m9416c().iterator();
                while (it.hasNext()) {
                    AbstractC1796t0 m9415b = mo4644Oc.m9415b((String) it.next());
                    AbstractC19074t.m100205c(m9415b);
                    LegacySavedStateHandleController.m9203a(m9415b, mo4648jf, interfaceC17712d.getLifecycle());
                }
                if (!mo4644Oc.m9416c().isEmpty()) {
                    mo4648jf.m10710i(C1743a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    /* renamed from: a */
    public static final void m9203a(AbstractC1796t0 abstractC1796t0, C1938a c1938a, AbstractC1785o abstractC1785o) {
        AbstractC19074t.m100208f(abstractC1796t0, "viewModel");
        AbstractC19074t.m100208f(c1938a, "registry");
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC1796t0.m9371I("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.m9252d()) {
            savedStateHandleController.m9250b(c1938a, abstractC1785o);
            f7217a.m9205c(c1938a, abstractC1785o);
        }
    }

    /* renamed from: b */
    public static final SavedStateHandleController m9204b(C1938a c1938a, AbstractC1785o abstractC1785o, String str, Bundle bundle) {
        AbstractC19074t.m100208f(c1938a, "registry");
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        AbstractC19074t.m100205c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1780l0.f7345f.m9322a(c1938a.m10704b(str), bundle));
        savedStateHandleController.m9250b(c1938a, abstractC1785o);
        f7217a.m9205c(c1938a, abstractC1785o);
        return savedStateHandleController;
    }

    /* renamed from: c */
    private final void m9205c(final C1938a c1938a, final AbstractC1785o abstractC1785o) {
        AbstractC1785o.b mo9336b = abstractC1785o.mo9336b();
        if (mo9336b != AbstractC1785o.b.INITIALIZED && !mo9336b.m9345c(AbstractC1785o.b.STARTED)) {
            abstractC1785o.mo9335a(new InterfaceC1795t() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    AbstractC19074t.m100208f(interfaceC1801w, "source");
                    AbstractC19074t.m100208f(aVar, "event");
                    if (aVar == AbstractC1785o.a.ON_START) {
                        AbstractC1785o.this.mo9338d(this);
                        c1938a.m10710i(LegacySavedStateHandleController.C1743a.class);
                    }
                }
            });
        } else {
            c1938a.m10710i(C1743a.class);
        }
    }
}
