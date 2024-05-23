package p492rr;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;

/* renamed from: rr.n */
/* loaded from: classes4.dex */
public final class C25971n implements C1802w0.b {

    /* renamed from: a */
    private final C25972o f123920a;

    /* renamed from: b */
    private final C25960c f123921b;

    public C25971n(C25972o c25972o, C25960c c25960c) {
        AbstractC19074t.m100208f(c25972o, "repository");
        AbstractC19074t.m100208f(c25960c, "dateManipulator");
        this.f123920a = c25972o;
        this.f123921b = c25960c;
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C25970m.class)) {
            return new C25970m(this.f123920a, this.f123921b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
