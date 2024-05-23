package e60;

import ag0.C0815e1;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p089d2.InterfaceC17712d;
import p646xi.C29669a;
import zd0.C31792a;

/* renamed from: e60.c */
/* loaded from: classes5.dex */
public final class C18273c extends AbstractC1754a {

    /* renamed from: d */
    private final C29669a f92516d;

    /* renamed from: e */
    private final C0815e1 f92517e;

    /* renamed from: f */
    private final C31792a f92518f;

    public /* synthetic */ C18273c(C29669a c29669a, C0815e1 c0815e1, C31792a c31792a, InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(c29669a, c0815e1, c31792a, interfaceC17712d, (i11 & 16) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C18272b.class)) {
            return new C18272b(c1780l0, this.f92516d, this.f92517e, this.f92518f);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18273c(C29669a c29669a, C0815e1 c0815e1, C31792a c31792a, InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(c29669a, "cameraRepository");
        AbstractC19074t.m100208f(c0815e1, "zaloTrackingManager");
        AbstractC19074t.m100208f(c31792a, "saveDoodleUseCase");
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f92516d = c29669a;
        this.f92517e = c0815e1;
        this.f92518f = c31792a;
    }
}
