package uk0;

import com.zing.zalo.zinstant.utils.AbstractC17201m;

/* renamed from: uk0.g */
/* loaded from: classes7.dex */
public class C27293g {

    /* renamed from: a */
    public final C27291e f128389a;

    /* renamed from: b */
    public final String f128390b;

    /* renamed from: c */
    public final int f128391c;

    public C27293g(int i11, C27291e c27291e, String str) {
        this.f128391c = i11;
        this.f128389a = c27291e;
        this.f128390b = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C27293g)) {
            return false;
        }
        C27293g c27293g = (C27293g) obj;
        if (!AbstractC17201m.m91810b(Integer.valueOf(this.f128391c), Integer.valueOf(c27293g.f128391c)) || !AbstractC17201m.m91810b(this.f128390b, c27293g.f128390b)) {
            return false;
        }
        C27291e c27291e = this.f128389a;
        C27291e c27291e2 = c27293g.f128389a;
        if (c27291e != c27291e2 && (c27291e == null || c27291e2 == null || !AbstractC17201m.m91810b(c27291e.f128387a, c27291e2.f128387a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC17201m.m91818j(Integer.valueOf(this.f128391c), this.f128390b, this.f128389a.f128387a);
    }
}
