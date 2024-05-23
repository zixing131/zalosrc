package p659xv;

import fn0.AbstractC19074t;

/* renamed from: xv.e */
/* loaded from: classes4.dex */
public final class C30207e implements Comparable {

    /* renamed from: p */
    private final int f140336p;

    public C30207e(int i11) {
        this.f140336p = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C30207e c30207e) {
        AbstractC19074t.m100208f(c30207e, "other");
        if (m148980c() == c30207e.m148980c()) {
            return AbstractC19074t.m100209g(m148981d(), c30207e.m148981d());
        }
        return AbstractC19074t.m100209g(m148980c(), c30207e.m148980c());
    }

    /* renamed from: c */
    public final int m148980c() {
        return this.f140336p >> 16;
    }

    /* renamed from: d */
    public final int m148981d() {
        return this.f140336p & 65535;
    }
}
