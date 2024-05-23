package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import androidx.savedstate.C1938a;
import fn0.AbstractC19074t;

/* loaded from: classes2.dex */
public final class SavedStateHandleController implements InterfaceC1795t {

    /* renamed from: p */
    private final String f7281p;

    /* renamed from: q */
    private final C1780l0 f7282q;

    /* renamed from: r */
    private boolean f7283r;

    public SavedStateHandleController(String str, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(c1780l0, "handle");
        this.f7281p = str;
        this.f7282q = c1780l0;
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        if (aVar == AbstractC1785o.a.ON_DESTROY) {
            this.f7283r = false;
            interfaceC1801w.getLifecycle().mo9338d(this);
        }
    }

    /* renamed from: b */
    public final void m9250b(C1938a c1938a, AbstractC1785o abstractC1785o) {
        AbstractC19074t.m100208f(c1938a, "registry");
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        if (!this.f7283r) {
            this.f7283r = true;
            abstractC1785o.mo9335a(this);
            c1938a.m10709h(this.f7281p, this.f7282q.m9320e());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    /* renamed from: c */
    public final C1780l0 m9251c() {
        return this.f7282q;
    }

    /* renamed from: d */
    public final boolean m9252d() {
        return this.f7283r;
    }
}
