package p531ty;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p089d2.InterfaceC17712d;

/* renamed from: ty.b */
/* loaded from: classes4.dex */
public final class C26905b extends AbstractC1754a {
    public /* synthetic */ C26905b(InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC17712d, (i11 & 2) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C26904a.class)) {
            return new C26904a();
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26905b(InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
    }
}
