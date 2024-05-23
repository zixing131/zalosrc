package androidx.lifecycle;

import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;

/* renamed from: androidx.lifecycle.x0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1804x0 {
    /* renamed from: a */
    public static AbstractC1796t0 m9389a(C1802w0.b bVar, Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static AbstractC1796t0 m9390b(C1802w0.b bVar, Class cls, AbstractC26941a abstractC26941a) {
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(abstractC26941a, "extras");
        return bVar.mo1196b(cls);
    }
}
