package id0;

import com.zing.zalo.uidrawing.C16719g;

/* renamed from: id0.j */
/* loaded from: classes4.dex */
class C20524j extends AbstractC20521g {
    @Override // id0.AbstractC20521g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer mo106578a(float f11) {
        Object obj = this.f100807a;
        if (obj != null && this.f100808b != null) {
            return Integer.valueOf(((Integer) obj).intValue() + ((int) ((((Integer) this.f100808b).intValue() - ((Integer) this.f100807a).intValue()) * f11)));
        }
        return 0;
    }

    @Override // id0.AbstractC20521g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer mo106579c(C16719g c16719g) {
        return Integer.valueOf(c16719g.m89134c0());
    }

    @Override // id0.AbstractC20521g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo106580d(C16719g c16719g, Integer num) {
        if (c16719g != null && num != null) {
            c16719g.m89132a1(num.intValue());
            return true;
        }
        return false;
    }
}
