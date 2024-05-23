package mk;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lk.EnumC22502a;

/* renamed from: mk.c */
/* loaded from: classes3.dex */
public final class C23325c extends AbstractC23323a {

    /* renamed from: r */
    private final long f113518r;

    /* renamed from: s */
    private final int f113519s;

    /* renamed from: t */
    private final CharSequence f113520t;

    public /* synthetic */ C23325c(long j11, int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str);
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113518r;
    }

    /* renamed from: e */
    public final int m122716e() {
        return this.f113519s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23325c)) {
            return false;
        }
        C23325c c23325c = (C23325c) obj;
        return this.f113518r == c23325c.f113518r && this.f113519s == c23325c.f113519s && AbstractC19074t.m100204b(this.f113520t, c23325c.f113520t);
    }

    /* renamed from: g */
    public final CharSequence m122717g() {
        return this.f113520t;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f113518r) * 31) + this.f113519s) * 31) + this.f113520t.hashCode();
    }

    public String toString() {
        return "NetworkBannerItem(createTime=" + this.f113518r + ", bgColor=" + this.f113519s + ", text=" + ((Object) this.f113520t) + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23325c(long j11, int i11, CharSequence charSequence) {
        super(EnumC22502a.f110111p, 0.0d);
        AbstractC19074t.m100208f(charSequence, "text");
        this.f113518r = j11;
        this.f113519s = i11;
        this.f113520t = charSequence;
    }
}
