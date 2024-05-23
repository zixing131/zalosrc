package q50;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;

/* renamed from: q50.b */
/* loaded from: classes5.dex */
public final class C25133b implements C1802w0.b {
    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C25132a.class)) {
            return new C25132a();
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
