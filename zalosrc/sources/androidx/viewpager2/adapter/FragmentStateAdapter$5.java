package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;

/* loaded from: classes2.dex */
class FragmentStateAdapter$5 implements InterfaceC1795t {

    /* renamed from: p */
    final /* synthetic */ Handler f8868p;

    /* renamed from: q */
    final /* synthetic */ Runnable f8869q;

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        if (aVar == AbstractC1785o.a.ON_DESTROY) {
            this.f8868p.removeCallbacks(this.f8869q);
            interfaceC1801w.getLifecycle().mo9338d(this);
        }
    }
}
