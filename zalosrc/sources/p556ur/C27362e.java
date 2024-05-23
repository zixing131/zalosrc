package p556ur;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;
import p330lp.C22633a;
import p330lp.C22634b;
import p330lp.C22635c;
import p534u1.AbstractC26941a;

/* renamed from: ur.e */
/* loaded from: classes4.dex */
public final class C27362e implements C1802w0.b {

    /* renamed from: a */
    private final C22634b f128915a;

    /* renamed from: b */
    private final C22635c f128916b;

    /* renamed from: c */
    private final C22633a f128917c;

    public C27362e(C22634b c22634b, C22635c c22635c, C22633a c22633a) {
        AbstractC19074t.m100208f(c22634b, "getListLikeFeed");
        AbstractC19074t.m100208f(c22635c, "getListLikePhoto");
        AbstractC19074t.m100208f(c22633a, "getListLikeComment");
        this.f128915a = c22634b;
        this.f128916b = c22635c;
        this.f128917c = c22633a;
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
        if (cls.isAssignableFrom(C27361d.class)) {
            return new C27361d(this.f128915a, this.f128916b, this.f128917c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
