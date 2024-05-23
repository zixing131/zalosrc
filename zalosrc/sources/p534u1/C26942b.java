package p534u1;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;

/* renamed from: u1.b */
/* loaded from: classes.dex */
public final class C26942b implements C1802w0.b {

    /* renamed from: a */
    private final C26946f[] f127384a;

    public C26942b(C26946f... c26946fArr) {
        AbstractC19074t.m100208f(c26946fArr, "initializers");
        this.f127384a = c26946fArr;
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(abstractC26941a, "extras");
        AbstractC1796t0 abstractC1796t0 = null;
        for (C26946f c26946f : this.f127384a) {
            if (AbstractC19074t.m100204b(c26946f.m138791a(), cls)) {
                Object mo205i9 = c26946f.m138792b().mo205i9(abstractC26941a);
                if (mo205i9 instanceof AbstractC1796t0) {
                    abstractC1796t0 = (AbstractC1796t0) mo205i9;
                } else {
                    abstractC1796t0 = null;
                }
            }
        }
        if (abstractC1796t0 != null) {
            return abstractC1796t0;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public /* synthetic */ AbstractC1796t0 mo1196b(Class cls) {
        return AbstractC1804x0.m9389a(this, cls);
    }
}
