package p670y5;

import com.google.android.gms.common.internal.AbstractC4199m;

/* renamed from: y5.rb */
/* loaded from: classes2.dex */
public final class C30632rb {

    /* renamed from: a */
    private final EnumC30594pb f141739a;

    /* renamed from: b */
    private final Integer f141740b;

    /* renamed from: c */
    private final Integer f141741c;

    /* renamed from: d */
    private final Boolean f141742d;

    public /* synthetic */ C30632rb(C30575ob c30575ob, AbstractC30613qb abstractC30613qb) {
        EnumC30594pb enumC30594pb;
        Integer num;
        enumC30594pb = c30575ob.f141601a;
        this.f141739a = enumC30594pb;
        num = c30575ob.f141602b;
        this.f141740b = num;
        this.f141741c = null;
        this.f141742d = null;
    }

    /* renamed from: a */
    public final EnumC30594pb m149618a() {
        return this.f141739a;
    }

    /* renamed from: b */
    public final Integer m149619b() {
        return this.f141740b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30632rb)) {
            return false;
        }
        C30632rb c30632rb = (C30632rb) obj;
        if (AbstractC4199m.m19701a(this.f141739a, c30632rb.f141739a) && AbstractC4199m.m19701a(this.f141740b, c30632rb.f141740b) && AbstractC4199m.m19701a(null, null) && AbstractC4199m.m19701a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f141739a, this.f141740b, null, null);
    }
}
