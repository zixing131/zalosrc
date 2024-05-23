package c20;

import android.graphics.Point;
import android.view.View;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.AbstractC24866w;
import pm0.C24860q;
import s20.AbstractC26112n;

/* renamed from: c20.p */
/* loaded from: classes5.dex */
public final class C3226p {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static int f13765d;

    /* renamed from: e */
    private static int f13766e;

    /* renamed from: f */
    private static int f13767f;

    /* renamed from: g */
    private static int f13768g;

    /* renamed from: h */
    private static boolean f13769h;

    /* renamed from: i */
    private static boolean f13770i;

    /* renamed from: j */
    private static boolean f13771j;

    /* renamed from: a */
    private View f13772a;

    /* renamed from: b */
    private float f13773b = 0.5625f;

    /* renamed from: c */
    private Point f13774c = new Point();

    /* renamed from: c20.p$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m16358a(int i11, int i12, int i13, int i14) {
            C3226p.f13765d = i13;
            C3226p.f13766e = i14;
            int i15 = (i11 / 9) * 16;
            if (i15 < (i12 / 4) * 5) {
                C3226p.f13771j = false;
                if (i15 >= i12) {
                    C3226p.f13767f = i12;
                    C3226p.f13769h = true;
                    C3226p.f13770i = true;
                    return i12;
                }
                int i16 = i12 - i14;
                C3226p.f13770i = false;
                if (i15 >= i16) {
                    C3226p.f13767f = i16;
                    C3226p.f13769h = true;
                    return i16;
                }
                int i17 = i16 - i13;
                C3226p.f13767f = i17;
                C3226p.f13769h = false;
                return i17;
            }
            int i18 = i12 - (i13 + i14);
            C3226p.f13767f = i18;
            C3226p.f13769h = false;
            C3226p.f13770i = false;
            C3226p.f13771j = true;
            return i18;
        }

        /* renamed from: b */
        public final int m16359b(int i11, int i12, boolean z11) {
            if (m16364g()) {
                C3226p.f13768g = i12 / 4;
            } else {
                C3226p.f13768g = (i11 * 9) / 16;
            }
            if (z11) {
                C3226p.f13768g = m16361d() / 3;
            }
            return m16361d();
        }

        /* renamed from: c */
        public final int m16360c() {
            return C3226p.f13767f;
        }

        /* renamed from: d */
        public final int m16361d() {
            return C3226p.f13768g;
        }

        /* renamed from: e */
        public final boolean m16362e() {
            return C3226p.f13770i;
        }

        /* renamed from: f */
        public final boolean m16363f() {
            return C3226p.f13769h;
        }

        /* renamed from: g */
        public final boolean m16364g() {
            return C3226p.f13771j;
        }
    }

    /* renamed from: o */
    private final C24860q m16352o(int i11, int i12) {
        int i13;
        int i14;
        float f11 = i11;
        float f12 = i12;
        float f13 = f11 / f12;
        int i15 = 0;
        if (f13771j) {
            float f14 = this.f13773b;
            if (f13 > (f14 / 4) * 5) {
                int i16 = (int) (f12 * f14);
                this.f13774c.set((i11 - i16) / 2, 0);
                return AbstractC24866w.m129235a(Integer.valueOf(i16), Integer.valueOf(i12));
            }
        }
        float f15 = this.f13773b;
        if (f13 > f15) {
            int i17 = (int) (f11 / f15);
            this.f13774c.set(0, (i12 - i17) / 2);
            return AbstractC24866w.m129235a(Integer.valueOf(i11), Integer.valueOf(i17));
        }
        if (f13770i) {
            int i18 = i12 - f13766e;
            i13 = i18;
            f13 = f11 / i18;
        } else {
            i13 = i12;
        }
        if (f13 > f15) {
            int i19 = (int) (f12 * f15);
            this.f13774c.set((i11 - i19) / 2, 0);
            return AbstractC24866w.m129235a(Integer.valueOf(i19), Integer.valueOf(i12));
        }
        boolean z11 = f13769h;
        if (z11) {
            int i21 = i13 - f13765d;
            f13 = f11 / i21;
            int i22 = i13;
            i13 = i21;
            i12 = i22;
        }
        if (f13 > f15) {
            int i23 = (int) (i12 * f15);
            this.f13774c.set((i11 - i23) / 2, 0);
            return AbstractC24866w.m129235a(Integer.valueOf(i23), Integer.valueOf(i12));
        }
        if (f11 / ((i13 / 5) * 4) > f15) {
            int i24 = (int) (i13 * f15);
            Point point = this.f13774c;
            int i25 = (i11 - i24) / 2;
            if (z11) {
                i15 = f13765d;
            }
            point.set(i25, i15);
            return AbstractC24866w.m129235a(Integer.valueOf(i24), Integer.valueOf(i13));
        }
        int i26 = (int) (f11 / f15);
        Point point2 = this.f13774c;
        int i27 = (i13 - i26) / 2;
        if (z11) {
            i14 = f13765d;
        } else {
            i14 = 0;
        }
        point2.set(0, i27 + i14);
        return AbstractC24866w.m129235a(Integer.valueOf(i11), Integer.valueOf(i26));
    }

    /* renamed from: p */
    private final C24860q m16353p(int i11, int i12) {
        Point point;
        int i13;
        Point point2;
        float f11 = i11;
        int i14 = f13768g;
        float f12 = f11 / i14;
        if (f12 > this.f13773b) {
            point2 = new Point((i11 - ((int) (this.f13773b * i14))) / 2, 0);
            i13 = ((Number) m16352o(i11, f13767f).m129216d()).intValue();
            point = this.f13774c;
        } else {
            Point point3 = new Point(0, (f13768g - ((int) (f11 / this.f13773b))) / 2);
            int intValue = ((Number) m16352o(i11, f13767f).m129215c()).intValue();
            point = this.f13774c;
            i14 = i11;
            i13 = intValue;
            point2 = point3;
        }
        int i15 = f13767f;
        float f13 = (i15 - i12) / (i15 - f13768g);
        float f14 = 1.0f - f13;
        int i16 = (int) ((i13 * f14) + (i14 * f13));
        this.f13774c.set((int) ((point.x * f14) + (point2.x * f13)), (int) ((point.y * f14) + (point2.y * f13)));
        float f15 = this.f13773b;
        if (f12 > f15) {
            return AbstractC24866w.m129235a(Integer.valueOf((int) (i16 * f15)), Integer.valueOf(i16));
        }
        return AbstractC24866w.m129235a(Integer.valueOf(i16), Integer.valueOf((int) (i16 / this.f13773b)));
    }

    /* renamed from: m */
    public final void m16354m(boolean z11, int i11, int i12, int i13, int i14) {
        Point point = this.f13774c;
        int i15 = i11 + point.x;
        int i16 = i12 + point.y;
        View view = this.f13772a;
        if (view != null) {
            AbstractC26112n.m134383X(view, i16, i15);
        }
    }

    /* renamed from: n */
    public final void m16355n(int i11, int i12) {
        C24860q m16353p;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (size2 == f13767f) {
            m16353p = m16352o(size, size2);
        } else {
            m16353p = m16353p(size, size2);
        }
        int intValue = ((Number) m16353p.m129213a()).intValue();
        int intValue2 = ((Number) m16353p.m129214b()).intValue();
        View view = this.f13772a;
        if (view != null) {
            AbstractC26112n.m134387a0(view, intValue, 1073741824, intValue2, 1073741824);
        }
    }

    /* renamed from: q */
    public final void m16356q(float f11) {
        this.f13773b = f11;
    }

    /* renamed from: r */
    public final void m16357r(View view) {
        AbstractC19074t.m100208f(view, "view");
        this.f13772a = view;
    }
}
