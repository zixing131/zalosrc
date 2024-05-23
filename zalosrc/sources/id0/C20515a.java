package id0;

import com.zing.zalo.uidrawing.C16719g;

/* renamed from: id0.a */
/* loaded from: classes4.dex */
class C20515a extends AbstractC20521g {
    @Override // id0.AbstractC20521g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float mo106578a(float f11) {
        Object obj = this.f100807a;
        if (obj != null && this.f100808b != null) {
            return Float.valueOf(((Float) obj).floatValue() + ((((Float) this.f100808b).floatValue() - ((Float) this.f100807a).floatValue()) * f11));
        }
        return Float.valueOf(1.0f);
    }

    @Override // id0.AbstractC20521g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float mo106579c(C16719g c16719g) {
        return Float.valueOf(c16719g.m89092E());
    }

    @Override // id0.AbstractC20521g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo106580d(C16719g c16719g, Float f11) {
        if (c16719g != null && f11 != null) {
            c16719g.mo89158x0(f11.floatValue());
            return true;
        }
        return false;
    }
}
