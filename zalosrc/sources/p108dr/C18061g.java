package p108dr;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import fn0.AbstractC19074t;
import p089d2.InterfaceC17712d;
import q30.C25106c;
import q30.C25107d;

/* renamed from: dr.g */
/* loaded from: classes4.dex */
public final class C18061g extends AbstractC1754a {

    /* renamed from: d */
    private final C25107d f91444d;

    /* renamed from: e */
    private final C25106c f91445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18061g(InterfaceC17712d interfaceC17712d, Bundle bundle, C25107d c25107d, C25106c c25106c) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        AbstractC19074t.m100208f(c25107d, "saveStoryToLocalGalleryUseCase");
        AbstractC19074t.m100208f(c25106c, "saveStoryAndDoSomethingUseCase");
        this.f91444d = c25107d;
        this.f91445e = c25106c;
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C18055a.class)) {
            return new C18055a(this.f91444d, this.f91445e, c1780l0);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18061g(InterfaceC17712d interfaceC17712d, Bundle bundle) {
        this(interfaceC17712d, bundle, new C25107d(), new C25106c());
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
    }
}
