package p012a6;

import com.google.android.gms.common.internal.AbstractC4199m;

/* renamed from: a6.rb */
/* loaded from: classes2.dex */
public final class C0479rb {

    /* renamed from: a */
    private final EnumC0441pb f1862a;

    /* renamed from: b */
    private final Integer f1863b;

    /* renamed from: c */
    private final Integer f1864c;

    /* renamed from: d */
    private final Boolean f1865d;

    public /* synthetic */ C0479rb(C0422ob c0422ob, AbstractC0460qb abstractC0460qb) {
        EnumC0441pb enumC0441pb;
        Integer num;
        enumC0441pb = c0422ob.f1726a;
        this.f1862a = enumC0441pb;
        num = c0422ob.f1727b;
        this.f1863b = num;
        this.f1864c = null;
        this.f1865d = null;
    }

    /* renamed from: a */
    public final EnumC0441pb m863a() {
        return this.f1862a;
    }

    /* renamed from: b */
    public final Integer m864b() {
        return this.f1863b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0479rb)) {
            return false;
        }
        C0479rb c0479rb = (C0479rb) obj;
        if (AbstractC4199m.m19701a(this.f1862a, c0479rb.f1862a) && AbstractC4199m.m19701a(this.f1863b, c0479rb.f1863b) && AbstractC4199m.m19701a(null, null) && AbstractC4199m.m19701a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f1862a, this.f1863b, null, null);
    }
}
