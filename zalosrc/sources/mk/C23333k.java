package mk;

import android.text.SpannableString;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lk.EnumC22502a;

/* renamed from: mk.k */
/* loaded from: classes3.dex */
public final class C23333k extends AbstractC23323a {

    /* renamed from: r */
    private final long f113535r;

    /* renamed from: s */
    private final SpannableString f113536s;

    /* renamed from: t */
    private final int f113537t;

    public /* synthetic */ C23333k(long j11, SpannableString spannableString, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? null : spannableString, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113535r;
    }

    /* renamed from: e */
    public final int m122742e() {
        return this.f113537t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23333k)) {
            return false;
        }
        C23333k c23333k = (C23333k) obj;
        return this.f113535r == c23333k.f113535r && AbstractC19074t.m100204b(this.f113536s, c23333k.f113536s) && this.f113537t == c23333k.f113537t;
    }

    /* renamed from: g */
    public final SpannableString m122743g() {
        return this.f113536s;
    }

    public int hashCode() {
        int m11521a = AbstractC2147g0.m11521a(this.f113535r) * 31;
        SpannableString spannableString = this.f113536s;
        return ((m11521a + (spannableString == null ? 0 : spannableString.hashCode())) * 31) + this.f113537t;
    }

    public String toString() {
        long j11 = this.f113535r;
        SpannableString spannableString = this.f113536s;
        return "RemindNotifyBannerItem(createTime=" + j11 + ", spannableString=" + ((Object) spannableString) + ", currentHintOnBanner=" + this.f113537t + ")";
    }

    public C23333k(long j11, SpannableString spannableString, int i11) {
        super(EnumC22502a.f110112q, 10.0d);
        this.f113535r = j11;
        this.f113536s = spannableString;
        this.f113537t = i11;
    }
}
