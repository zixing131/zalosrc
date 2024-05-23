package mk;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lk.EnumC22502a;
import mg0.AbstractC23291c;

/* renamed from: mk.q */
/* loaded from: classes3.dex */
public final class C23339q extends AbstractC23323a {

    /* renamed from: r */
    private final long f113543r;

    /* renamed from: s */
    private final AbstractC23291c f113544s;

    public /* synthetic */ C23339q(long j11, AbstractC23291c abstractC23291c, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? null : abstractC23291c);
    }

    @Override // mk.AbstractC23323a
    /* renamed from: c */
    public long mo122714c() {
        return this.f113543r;
    }

    /* renamed from: e */
    public final AbstractC23291c m122744e() {
        return this.f113544s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23339q)) {
            return false;
        }
        C23339q c23339q = (C23339q) obj;
        return this.f113543r == c23339q.f113543r && AbstractC19074t.m100204b(this.f113544s, c23339q.f113544s);
    }

    public int hashCode() {
        int m11521a = AbstractC2147g0.m11521a(this.f113543r) * 31;
        AbstractC23291c abstractC23291c = this.f113544s;
        return m11521a + (abstractC23291c == null ? 0 : abstractC23291c.hashCode());
    }

    public String toString() {
        return "ZcloudChangeBackupKeyBannerItem(createTime=" + this.f113543r + ", state=" + this.f113544s + ")";
    }

    public C23339q(long j11, AbstractC23291c abstractC23291c) {
        super(EnumC22502a.f110121z, 8.0d);
        this.f113543r = j11;
        this.f113544s = abstractC23291c;
    }
}
