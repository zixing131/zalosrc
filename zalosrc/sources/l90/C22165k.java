package l90;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hk.InterfaceC20079a;
import p089d2.InterfaceC17712d;

/* renamed from: l90.k */
/* loaded from: classes6.dex */
public final class C22165k extends AbstractC1754a {

    /* renamed from: d */
    private final InterfaceC20079a f109276d;

    public /* synthetic */ C22165k(InterfaceC20079a interfaceC20079a, InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC20079a, interfaceC17712d, (i11 & 4) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C22164j.class)) {
            return new C22164j(this.f109276d, c1780l0);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22165k(InterfaceC20079a interfaceC20079a, InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(interfaceC20079a, "mediaPickerRepository");
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f109276d = interfaceC20079a;
    }
}
