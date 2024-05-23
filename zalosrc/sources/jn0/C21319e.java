package jn0;

import fn0.AbstractC19060k;
import java.io.Serializable;

/* renamed from: jn0.e */
/* loaded from: classes7.dex */
public final class C21319e extends AbstractC21317c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: x */
    private static final a f103813x = new a(null);

    /* renamed from: r */
    private int f103814r;

    /* renamed from: s */
    private int f103815s;

    /* renamed from: t */
    private int f103816t;

    /* renamed from: u */
    private int f103817u;

    /* renamed from: v */
    private int f103818v;

    /* renamed from: w */
    private int f103819w;

    /* renamed from: jn0.e$a */
    /* loaded from: classes7.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21319e(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f103814r = i11;
        this.f103815s = i12;
        this.f103816t = i13;
        this.f103817u = i14;
        this.f103818v = i15;
        this.f103819w = i16;
        if ((i11 | i12 | i13 | i14 | i15) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i17 = 0; i17 < 64; i17++) {
            mo110372d();
        }
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: b */
    public int mo110370b(int i11) {
        return AbstractC21318d.m110387g(mo110372d(), i11);
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: d */
    public int mo110372d() {
        int i11 = this.f103814r;
        int i12 = i11 ^ (i11 >>> 2);
        this.f103814r = this.f103815s;
        this.f103815s = this.f103816t;
        this.f103816t = this.f103817u;
        int i13 = this.f103818v;
        this.f103817u = i13;
        int i14 = ((i12 ^ (i12 << 1)) ^ i13) ^ (i13 << 4);
        this.f103818v = i14;
        int i15 = this.f103819w + 362437;
        this.f103819w = i15;
        return i14 + i15;
    }

    public C21319e(int i11, int i12) {
        this(i11, i12, 0, 0, ~i11, (i11 << 10) ^ (i12 >>> 4));
    }
}
