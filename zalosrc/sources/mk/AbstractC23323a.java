package mk;

import fn0.AbstractC19074t;
import lk.EnumC22502a;

/* renamed from: mk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC23323a implements Comparable {

    /* renamed from: p */
    private final EnumC22502a f113515p;

    /* renamed from: q */
    private final double f113516q;

    public AbstractC23323a(EnumC22502a enumC22502a, double d11) {
        AbstractC19074t.m100208f(enumC22502a, "itemType");
        this.f113515p = enumC22502a;
        this.f113516q = d11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC23323a abstractC23323a) {
        AbstractC19074t.m100208f(abstractC23323a, "other");
        double d11 = this.f113516q;
        double d12 = abstractC23323a.f113516q;
        if (d11 == d12) {
            return AbstractC19074t.m100210h(abstractC23323a.mo122714c(), mo122714c());
        }
        if (d11 - d12 > 0.0d) {
            return 1;
        }
        return -1;
    }

    /* renamed from: c */
    public abstract long mo122714c();

    /* renamed from: d */
    public final EnumC22502a m122715d() {
        return this.f113515p;
    }
}
