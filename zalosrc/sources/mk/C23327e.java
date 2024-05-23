package mk;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lk.EnumC22502a;

/* renamed from: mk.e */
/* loaded from: classes3.dex */
public final class C23327e extends AbstractC23323a {

    /* renamed from: r */
    private final long f113527r;

    /* renamed from: s */
    private final String f113528s;

    /* renamed from: t */
    private final String f113529t;

    /* renamed from: u */
    private final EnumC23326d f113530u;

    public /* synthetic */ C23327e(long j11, String str, String str2, EnumC23326d enumC23326d, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? EnumC23326d.f113522q : enumC23326d);
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113527r;
    }

    /* renamed from: e */
    public final String m122719e() {
        return this.f113529t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23327e)) {
            return false;
        }
        C23327e c23327e = (C23327e) obj;
        return this.f113527r == c23327e.f113527r && AbstractC19074t.m100204b(this.f113528s, c23327e.f113528s) && AbstractC19074t.m100204b(this.f113529t, c23327e.f113529t) && this.f113530u == c23327e.f113530u;
    }

    /* renamed from: g */
    public final EnumC23326d m122720g() {
        return this.f113530u;
    }

    /* renamed from: h */
    public final String m122721h() {
        return this.f113528s;
    }

    public int hashCode() {
        return (((((AbstractC2147g0.m11521a(this.f113527r) * 31) + this.f113528s.hashCode()) * 31) + this.f113529t.hashCode()) * 31) + this.f113530u.hashCode();
    }

    public String toString() {
        return "NotificationRestrictItem(createTime=" + this.f113527r + ", hintMsg=" + this.f113528s + ", actionName=" + this.f113529t + ", cause=" + this.f113530u + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23327e(long j11, String str, String str2, EnumC23326d enumC23326d) {
        super(EnumC22502a.f110113r, 11.0d);
        AbstractC19074t.m100208f(str, "hintMsg");
        AbstractC19074t.m100208f(str2, "actionName");
        AbstractC19074t.m100208f(enumC23326d, "cause");
        this.f113527r = j11;
        this.f113528s = str;
        this.f113529t = str2;
        this.f113530u = enumC23326d;
    }
}
