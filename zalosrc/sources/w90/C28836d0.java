package w90;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import cl.C3570a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nh0.InterfaceC23792b;
import p089d2.InterfaceC17712d;
import p348mi.AbstractC23306f;
import p684yk.InterfaceC31005a;

/* renamed from: w90.d0 */
/* loaded from: classes6.dex */
public final class C28836d0 extends AbstractC1754a {

    /* renamed from: d */
    private final C3570a f133610d;

    /* renamed from: e */
    private final InterfaceC31005a f133611e;

    public /* synthetic */ C28836d0(C3570a c3570a, InterfaceC31005a interfaceC31005a, InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(c3570a, interfaceC31005a, interfaceC17712d, (i11 & 8) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C28830a0.class)) {
            C3570a c3570a = this.f133610d;
            InterfaceC31005a interfaceC31005a = this.f133611e;
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            return new C28830a0(c3570a, interfaceC31005a, m120579F1, c1780l0, null, 16, null);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28836d0(C3570a c3570a, InterfaceC31005a interfaceC31005a, InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(c3570a, "stickerPanelRepository");
        AbstractC19074t.m100208f(interfaceC31005a, "stickerRepository");
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f133610d = c3570a;
        this.f133611e = interfaceC31005a;
    }
}
