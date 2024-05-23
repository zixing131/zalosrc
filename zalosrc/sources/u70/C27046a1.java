package u70;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nh0.InterfaceC23792b;
import p089d2.InterfaceC17712d;

/* renamed from: u70.a1 */
/* loaded from: classes5.dex */
public final class C27046a1 extends AbstractC1754a {

    /* renamed from: d */
    private final InterfaceC23792b f127700d;

    public /* synthetic */ C27046a1(InterfaceC23792b interfaceC23792b, InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC23792b, interfaceC17712d, (i11 & 4) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C27096z0.class)) {
            return new C27096z0(this.f127700d);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27046a1(InterfaceC23792b interfaceC23792b, InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f127700d = interfaceC23792b;
    }
}
