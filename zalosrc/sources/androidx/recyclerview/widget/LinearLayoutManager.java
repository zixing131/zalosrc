package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1919l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1888o implements C1919l.h, RecyclerView.AbstractC1898y.b {

    /* renamed from: A */
    int f7640A;

    /* renamed from: B */
    int f7641B;

    /* renamed from: C */
    private boolean f7642C;

    /* renamed from: D */
    SavedState f7643D;

    /* renamed from: E */
    final C1867a f7644E;

    /* renamed from: F */
    private final C1868b f7645F;

    /* renamed from: G */
    private int f7646G;

    /* renamed from: H */
    private int[] f7647H;

    /* renamed from: s */
    int f7648s;

    /* renamed from: t */
    private C1869c f7649t;

    /* renamed from: u */
    AbstractC1928u f7650u;

    /* renamed from: v */
    private boolean f7651v;

    /* renamed from: w */
    private boolean f7652w;

    /* renamed from: x */
    boolean f7653x;

    /* renamed from: y */
    private boolean f7654y;

    /* renamed from: z */
    private boolean f7655z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1866a();

        /* renamed from: p */
        int f7656p;

        /* renamed from: q */
        int f7657q;

        /* renamed from: r */
        boolean f7658r;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1866a implements Parcelable.Creator {
            C1866a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        boolean m9760a() {
            return this.f7656p >= 0;
        }

        /* renamed from: b */
        void m9761b() {
            this.f7656p = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f7656p);
            parcel.writeInt(this.f7657q);
            parcel.writeInt(this.f7658r ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f7656p = parcel.readInt();
            this.f7657q = parcel.readInt();
            this.f7658r = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f7656p = savedState.f7656p;
            this.f7657q = savedState.f7657q;
            this.f7658r = savedState.f7658r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C1867a {

        /* renamed from: a */
        AbstractC1928u f7659a;

        /* renamed from: b */
        int f7660b;

        /* renamed from: c */
        int f7661c;

        /* renamed from: d */
        boolean f7662d;

        /* renamed from: e */
        boolean f7663e;

        C1867a() {
            m9768e();
        }

        /* renamed from: a */
        void m9764a() {
            int mo10656n;
            if (this.f7662d) {
                mo10656n = this.f7659a.mo10651i();
            } else {
                mo10656n = this.f7659a.mo10656n();
            }
            this.f7661c = mo10656n;
        }

        /* renamed from: b */
        public void m9765b(View view, int i11) {
            if (this.f7662d) {
                this.f7661c = this.f7659a.mo10646d(view) + this.f7659a.m10658p();
            } else {
                this.f7661c = this.f7659a.mo10649g(view);
            }
            this.f7660b = i11;
        }

        /* renamed from: c */
        public void m9766c(View view, int i11) {
            int m10658p = this.f7659a.m10658p();
            if (m10658p >= 0) {
                m9765b(view, i11);
                return;
            }
            this.f7660b = i11;
            if (this.f7662d) {
                int mo10651i = (this.f7659a.mo10651i() - m10658p) - this.f7659a.mo10646d(view);
                this.f7661c = this.f7659a.mo10651i() - mo10651i;
                if (mo10651i > 0) {
                    int mo10647e = this.f7661c - this.f7659a.mo10647e(view);
                    int mo10656n = this.f7659a.mo10656n();
                    int min = mo10647e - (mo10656n + Math.min(this.f7659a.mo10649g(view) - mo10656n, 0));
                    if (min < 0) {
                        this.f7661c += Math.min(mo10651i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo10649g = this.f7659a.mo10649g(view);
            int mo10656n2 = mo10649g - this.f7659a.mo10656n();
            this.f7661c = mo10649g;
            if (mo10656n2 > 0) {
                int mo10651i2 = (this.f7659a.mo10651i() - Math.min(0, (this.f7659a.mo10651i() - m10658p) - this.f7659a.mo10646d(view))) - (mo10649g + this.f7659a.mo10647e(view));
                if (mo10651i2 < 0) {
                    this.f7661c -= Math.min(mo10656n2, -mo10651i2);
                }
            }
        }

        /* renamed from: d */
        boolean m9767d(View view, RecyclerView.C1899z c1899z) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.m9915d() && layoutParams.m9913b() >= 0 && layoutParams.m9913b() < c1899z.m10253b()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        void m9768e() {
            this.f7660b = -1;
            this.f7661c = Integer.MIN_VALUE;
            this.f7662d = false;
            this.f7663e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f7660b + ", mCoordinate=" + this.f7661c + ", mLayoutFromEnd=" + this.f7662d + ", mValid=" + this.f7663e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C1868b {

        /* renamed from: a */
        public int f7664a;

        /* renamed from: b */
        public boolean f7665b;

        /* renamed from: c */
        public boolean f7666c;

        /* renamed from: d */
        public boolean f7667d;

        protected C1868b() {
        }

        /* renamed from: a */
        void m9769a() {
            this.f7664a = 0;
            this.f7665b = false;
            this.f7666c = false;
            this.f7667d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes2.dex */
    public static class C1869c {

        /* renamed from: b */
        int f7669b;

        /* renamed from: c */
        int f7670c;

        /* renamed from: d */
        int f7671d;

        /* renamed from: e */
        int f7672e;

        /* renamed from: f */
        int f7673f;

        /* renamed from: g */
        int f7674g;

        /* renamed from: k */
        int f7678k;

        /* renamed from: m */
        boolean f7680m;

        /* renamed from: a */
        boolean f7668a = true;

        /* renamed from: h */
        int f7675h = 0;

        /* renamed from: i */
        int f7676i = 0;

        /* renamed from: j */
        boolean f7677j = false;

        /* renamed from: l */
        List f7679l = null;

        C1869c() {
        }

        /* renamed from: e */
        private View m9770e() {
            int size = this.f7679l.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = ((RecyclerView.AbstractC1876c0) this.f7679l.get(i11)).f7784p;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.m9915d() && this.f7671d == layoutParams.m9913b()) {
                    m9772b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m9771a() {
            m9772b(null);
        }

        /* renamed from: b */
        public void m9772b(View view) {
            View m9775f = m9775f(view);
            if (m9775f == null) {
                this.f7671d = -1;
            } else {
                this.f7671d = ((RecyclerView.LayoutParams) m9775f.getLayoutParams()).m9913b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m9773c(RecyclerView.C1899z c1899z) {
            int i11 = this.f7671d;
            if (i11 >= 0 && i11 < c1899z.m10253b()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m9774d(RecyclerView.C1894u c1894u) {
            if (this.f7679l != null) {
                return m9770e();
            }
            View m10218o = c1894u.m10218o(this.f7671d);
            this.f7671d += this.f7672e;
            return m10218o;
        }

        /* renamed from: f */
        public View m9775f(View view) {
            int m9913b;
            int size = this.f7679l.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = ((RecyclerView.AbstractC1876c0) this.f7679l.get(i12)).f7784p;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.m9915d() && (m9913b = (layoutParams.m9913b() - this.f7671d) * this.f7672e) >= 0 && m9913b < i11) {
                    view2 = view3;
                    if (m9913b == 0) {
                        break;
                    }
                    i11 = m9913b;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: F2 */
    private boolean m9690F2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, C1867a c1867a) {
        View m9708j2;
        int mo10656n;
        if (m10110a() == 0) {
            return false;
        }
        View m10113b0 = m10113b0();
        if (m10113b0 != null && c1867a.m9767d(m10113b0, c1899z)) {
            c1867a.m9766c(m10113b0, m10112b(m10113b0));
            return true;
        }
        if (this.f7651v != this.f7654y) {
            return false;
        }
        if (c1867a.f7662d) {
            m9708j2 = m9707i2(c1894u, c1899z);
        } else {
            m9708j2 = m9708j2(c1894u, c1899z);
        }
        if (m9708j2 == null) {
            return false;
        }
        c1867a.m9765b(m9708j2, m10112b(m9708j2));
        if (!c1899z.m10256e() && mo9654J1() && (this.f7650u.mo10649g(m9708j2) >= this.f7650u.mo10651i() || this.f7650u.mo10646d(m9708j2) < this.f7650u.mo10656n())) {
            if (c1867a.f7662d) {
                mo10656n = this.f7650u.mo10651i();
            } else {
                mo10656n = this.f7650u.mo10656n();
            }
            c1867a.f7661c = mo10656n;
        }
        return true;
    }

    /* renamed from: G2 */
    private boolean m9691G2(RecyclerView.C1899z c1899z, C1867a c1867a) {
        int i11;
        boolean z11;
        int mo10649g;
        boolean z12 = false;
        if (!c1899z.m10256e() && (i11 = this.f7640A) != -1) {
            if (i11 >= 0 && i11 < c1899z.m10253b()) {
                c1867a.f7660b = this.f7640A;
                SavedState savedState = this.f7643D;
                if (savedState != null && savedState.m9760a()) {
                    boolean z13 = this.f7643D.f7658r;
                    c1867a.f7662d = z13;
                    if (z13) {
                        c1867a.f7661c = this.f7650u.mo10651i() - this.f7643D.f7657q;
                    } else {
                        c1867a.f7661c = this.f7650u.mo10656n() + this.f7643D.f7657q;
                    }
                    return true;
                }
                if (this.f7641B == Integer.MIN_VALUE) {
                    View mo9732P = mo9732P(this.f7640A);
                    if (mo9732P != null) {
                        if (this.f7650u.mo10647e(mo9732P) > this.f7650u.mo10657o()) {
                            c1867a.m9764a();
                            return true;
                        }
                        if (this.f7650u.mo10649g(mo9732P) - this.f7650u.mo10656n() < 0) {
                            c1867a.f7661c = this.f7650u.mo10656n();
                            c1867a.f7662d = false;
                            return true;
                        }
                        if (this.f7650u.mo10651i() - this.f7650u.mo10646d(mo9732P) < 0) {
                            c1867a.f7661c = this.f7650u.mo10651i();
                            c1867a.f7662d = true;
                            return true;
                        }
                        if (c1867a.f7662d) {
                            mo10649g = this.f7650u.mo10646d(mo9732P) + this.f7650u.m10658p();
                        } else {
                            mo10649g = this.f7650u.mo10649g(mo9732P);
                        }
                        c1867a.f7661c = mo10649g;
                    } else {
                        if (m10110a() > 0) {
                            if (this.f7640A < m10112b(m10105V(0))) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 == this.f7653x) {
                                z12 = true;
                            }
                            c1867a.f7662d = z12;
                        }
                        c1867a.m9764a();
                    }
                    return true;
                }
                boolean z14 = this.f7653x;
                c1867a.f7662d = z14;
                if (z14) {
                    c1867a.f7661c = this.f7650u.mo10651i() - this.f7641B;
                } else {
                    c1867a.f7661c = this.f7650u.mo10656n() + this.f7641B;
                }
                return true;
            }
            this.f7640A = -1;
            this.f7641B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: H2 */
    private void m9692H2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, C1867a c1867a) {
        int i11;
        if (m9691G2(c1899z, c1867a) || m9690F2(c1894u, c1899z, c1867a)) {
            return;
        }
        c1867a.m9764a();
        if (this.f7654y) {
            i11 = c1899z.m10253b() - 1;
        } else {
            i11 = 0;
        }
        c1867a.f7660b = i11;
    }

    /* renamed from: I2 */
    private void m9693I2(int i11, int i12, boolean z11, RecyclerView.C1899z c1899z) {
        int i13;
        int mo10656n;
        this.f7649t.f7680m = m9759y2();
        this.f7649t.f7673f = i11;
        int[] iArr = this.f7647H;
        boolean z12 = false;
        iArr[0] = 0;
        int i14 = 1;
        iArr[1] = 0;
        mo9731K1(c1899z, iArr);
        int max = Math.max(0, this.f7647H[0]);
        int max2 = Math.max(0, this.f7647H[1]);
        if (i11 == 1) {
            z12 = true;
        }
        C1869c c1869c = this.f7649t;
        if (z12) {
            i13 = max2;
        } else {
            i13 = max;
        }
        c1869c.f7675h = i13;
        if (!z12) {
            max = max2;
        }
        c1869c.f7676i = max;
        if (z12) {
            c1869c.f7675h = i13 + this.f7650u.mo10652j();
            View m9711m2 = m9711m2();
            C1869c c1869c2 = this.f7649t;
            if (this.f7653x) {
                i14 = -1;
            }
            c1869c2.f7672e = i14;
            int m10112b = m10112b(m9711m2);
            C1869c c1869c3 = this.f7649t;
            c1869c2.f7671d = m10112b + c1869c3.f7672e;
            c1869c3.f7669b = this.f7650u.mo10646d(m9711m2);
            mo10656n = this.f7650u.mo10646d(m9711m2) - this.f7650u.mo10651i();
        } else {
            View m9712n2 = m9712n2();
            this.f7649t.f7675h += this.f7650u.mo10656n();
            C1869c c1869c4 = this.f7649t;
            if (!this.f7653x) {
                i14 = -1;
            }
            c1869c4.f7672e = i14;
            int m10112b2 = m10112b(m9712n2);
            C1869c c1869c5 = this.f7649t;
            c1869c4.f7671d = m10112b2 + c1869c5.f7672e;
            c1869c5.f7669b = this.f7650u.mo10649g(m9712n2);
            mo10656n = (-this.f7650u.mo10649g(m9712n2)) + this.f7650u.mo10656n();
        }
        C1869c c1869c6 = this.f7649t;
        c1869c6.f7670c = i12;
        if (z11) {
            c1869c6.f7670c = i12 - mo10656n;
        }
        c1869c6.f7674g = mo10656n;
    }

    /* renamed from: J2 */
    private void m9694J2(int i11, int i12) {
        int i13;
        this.f7649t.f7670c = this.f7650u.mo10651i() - i12;
        C1869c c1869c = this.f7649t;
        if (this.f7653x) {
            i13 = -1;
        } else {
            i13 = 1;
        }
        c1869c.f7672e = i13;
        c1869c.f7671d = i11;
        c1869c.f7673f = 1;
        c1869c.f7669b = i12;
        c1869c.f7674g = Integer.MIN_VALUE;
    }

    /* renamed from: K2 */
    private void m9695K2(C1867a c1867a) {
        m9694J2(c1867a.f7660b, c1867a.f7661c);
    }

    /* renamed from: L2 */
    private void m9696L2(int i11, int i12) {
        int i13;
        this.f7649t.f7670c = i12 - this.f7650u.mo10656n();
        C1869c c1869c = this.f7649t;
        c1869c.f7671d = i11;
        if (this.f7653x) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        c1869c.f7672e = i13;
        c1869c.f7673f = -1;
        c1869c.f7669b = i12;
        c1869c.f7674g = Integer.MIN_VALUE;
    }

    /* renamed from: M1 */
    private int m9697M1(RecyclerView.C1899z c1899z) {
        if (m10110a() == 0) {
            return 0;
        }
        m9735R1();
        return AbstractC1932y.m10675a(c1899z, this.f7650u, m9739X1(!this.f7655z, true), m9738W1(!this.f7655z, true), this, this.f7655z);
    }

    /* renamed from: M2 */
    private void m9698M2(C1867a c1867a) {
        m9696L2(c1867a.f7660b, c1867a.f7661c);
    }

    /* renamed from: N1 */
    private int m9699N1(RecyclerView.C1899z c1899z) {
        if (m10110a() == 0) {
            return 0;
        }
        m9735R1();
        return AbstractC1932y.m10676b(c1899z, this.f7650u, m9739X1(!this.f7655z, true), m9738W1(!this.f7655z, true), this, this.f7655z, this.f7653x);
    }

    /* renamed from: O1 */
    private int m9700O1(RecyclerView.C1899z c1899z) {
        if (m10110a() == 0) {
            return 0;
        }
        m9735R1();
        return AbstractC1932y.m10677c(c1899z, this.f7650u, m9739X1(!this.f7655z, true), m9738W1(!this.f7655z, true), this, this.f7655z);
    }

    /* renamed from: U1 */
    private View m9701U1() {
        return m9747d2(0, m10110a());
    }

    /* renamed from: V1 */
    private View m9702V1(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        return mo9672h2(c1894u, c1899z, 0, m10110a(), c1899z.m10253b());
    }

    /* renamed from: a2 */
    private View m9703a2() {
        return m9747d2(m10110a() - 1, -1);
    }

    /* renamed from: b2 */
    private View m9704b2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        return mo9672h2(c1894u, c1899z, m10110a() - 1, -1, c1899z.m10253b());
    }

    /* renamed from: f2 */
    private View m9705f2() {
        if (this.f7653x) {
            return m9701U1();
        }
        return m9703a2();
    }

    /* renamed from: g2 */
    private View m9706g2() {
        if (this.f7653x) {
            return m9703a2();
        }
        return m9701U1();
    }

    /* renamed from: i2 */
    private View m9707i2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7653x) {
            return m9702V1(c1894u, c1899z);
        }
        return m9704b2(c1894u, c1899z);
    }

    /* renamed from: j2 */
    private View m9708j2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7653x) {
            return m9704b2(c1894u, c1899z);
        }
        return m9702V1(c1894u, c1899z);
    }

    /* renamed from: k2 */
    private int m9709k2(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, boolean z11) {
        int mo10651i;
        int mo10651i2 = this.f7650u.mo10651i() - i11;
        if (mo10651i2 > 0) {
            int i12 = -m9719A2(-mo10651i2, c1894u, c1899z);
            int i13 = i11 + i12;
            if (z11 && (mo10651i = this.f7650u.mo10651i() - i13) > 0) {
                this.f7650u.mo10661s(mo10651i);
                return mo10651i + i12;
            }
            return i12;
        }
        return 0;
    }

    /* renamed from: l2 */
    private int m9710l2(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, boolean z11) {
        int mo10656n;
        int mo10656n2 = i11 - this.f7650u.mo10656n();
        if (mo10656n2 > 0) {
            int i12 = -m9719A2(mo10656n2, c1894u, c1899z);
            int i13 = i11 + i12;
            if (z11 && (mo10656n = i13 - this.f7650u.mo10656n()) > 0) {
                this.f7650u.mo10661s(-mo10656n);
                return i12 - mo10656n;
            }
            return i12;
        }
        return 0;
    }

    /* renamed from: m2 */
    private View m9711m2() {
        int m10110a;
        if (this.f7653x) {
            m10110a = 0;
        } else {
            m10110a = m10110a() - 1;
        }
        return m10105V(m10110a);
    }

    /* renamed from: n2 */
    private View m9712n2() {
        int i11;
        if (this.f7653x) {
            i11 = m10110a() - 1;
        } else {
            i11 = 0;
        }
        return m10105V(i11);
    }

    /* renamed from: s2 */
    private void m9713s2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11, int i12) {
        boolean z11;
        if (c1899z.m10258g() && m10110a() != 0 && !c1899z.m10256e() && mo9654J1()) {
            List m10214k = c1894u.m10214k();
            int size = m10214k.size();
            int m10112b = m10112b(m10105V(0));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                RecyclerView.AbstractC1876c0 abstractC1876c0 = (RecyclerView.AbstractC1876c0) m10214k.get(i15);
                if (!abstractC1876c0.m9941Q()) {
                    if (abstractC1876c0.m9932F() < m10112b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != this.f7653x) {
                        i13 += this.f7650u.mo10647e(abstractC1876c0.f7784p);
                    } else {
                        i14 += this.f7650u.mo10647e(abstractC1876c0.f7784p);
                    }
                }
            }
            this.f7649t.f7679l = m10214k;
            if (i13 > 0) {
                m9696L2(m10112b(m9712n2()), i11);
                C1869c c1869c = this.f7649t;
                c1869c.f7675h = i13;
                c1869c.f7670c = 0;
                c1869c.m9771a();
                m9736S1(c1894u, this.f7649t, c1899z, false);
            }
            if (i14 > 0) {
                m9694J2(m10112b(m9711m2()), i12);
                C1869c c1869c2 = this.f7649t;
                c1869c2.f7675h = i14;
                c1869c2.f7670c = 0;
                c1869c2.m9771a();
                m9736S1(c1894u, this.f7649t, c1899z, false);
            }
            this.f7649t.f7679l = null;
        }
    }

    /* renamed from: u2 */
    private void m9714u2(RecyclerView.C1894u c1894u, C1869c c1869c) {
        if (c1869c.f7668a && !c1869c.f7680m) {
            int i11 = c1869c.f7674g;
            int i12 = c1869c.f7676i;
            if (c1869c.f7673f == -1) {
                m9716w2(c1894u, i11, i12);
            } else {
                m9717x2(c1894u, i11, i12);
            }
        }
    }

    /* renamed from: v2 */
    private void m9715v2(RecyclerView.C1894u c1894u, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 > i11) {
            for (int i13 = i12 - 1; i13 >= i11; i13--) {
                m10137l1(i13, c1894u);
            }
            return;
        }
        while (i11 > i12) {
            m10137l1(i11, c1894u);
            i11--;
        }
    }

    /* renamed from: w2 */
    private void m9716w2(RecyclerView.C1894u c1894u, int i11, int i12) {
        int m10110a = m10110a();
        if (i11 < 0) {
            return;
        }
        int mo10650h = (this.f7650u.mo10650h() - i11) + i12;
        if (this.f7653x) {
            for (int i13 = 0; i13 < m10110a; i13++) {
                View m10105V = m10105V(i13);
                if (this.f7650u.mo10649g(m10105V) < mo10650h || this.f7650u.mo10660r(m10105V) < mo10650h) {
                    m9715v2(c1894u, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = m10110a - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View m10105V2 = m10105V(i15);
            if (this.f7650u.mo10649g(m10105V2) < mo10650h || this.f7650u.mo10660r(m10105V2) < mo10650h) {
                m9715v2(c1894u, i14, i15);
                return;
            }
        }
    }

    /* renamed from: x2 */
    private void m9717x2(RecyclerView.C1894u c1894u, int i11, int i12) {
        if (i11 < 0) {
            return;
        }
        int i13 = i11 - i12;
        int m10110a = m10110a();
        if (this.f7653x) {
            int i14 = m10110a - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                View m10105V = m10105V(i15);
                if (this.f7650u.mo10646d(m10105V) > i13 || this.f7650u.mo10659q(m10105V) > i13) {
                    m9715v2(c1894u, i14, i15);
                    return;
                }
            }
            return;
        }
        for (int i16 = 0; i16 < m10110a; i16++) {
            View m10105V2 = m10105V(i16);
            if (this.f7650u.mo10646d(m10105V2) > i13 || this.f7650u.mo10659q(m10105V2) > i13) {
                m9715v2(c1894u, 0, i16);
                return;
            }
        }
    }

    /* renamed from: z2 */
    private void m9718z2() {
        if (this.f7648s != 1 && m9752p2()) {
            this.f7653x = !this.f7652w;
        } else {
            this.f7653x = this.f7652w;
        }
    }

    /* renamed from: A2 */
    int m9719A2(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        int i12;
        if (m10110a() == 0 || i11 == 0) {
            return 0;
        }
        m9735R1();
        this.f7649t.f7668a = true;
        if (i11 > 0) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        int abs = Math.abs(i11);
        m9693I2(i12, abs, true, c1899z);
        C1869c c1869c = this.f7649t;
        int m9736S1 = c1869c.f7674g + m9736S1(c1894u, c1869c, c1899z, false);
        if (m9736S1 < 0) {
            return 0;
        }
        if (abs > m9736S1) {
            i11 = i12 * m9736S1;
        }
        this.f7650u.mo10661s(-i11);
        this.f7649t.f7678k = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: B */
    public void mo9720B(int i11, int i12, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1888o.c cVar) {
        int i13;
        if (this.f7648s != 0) {
            i11 = i12;
        }
        if (m10110a() != 0 && i11 != 0) {
            m9735R1();
            if (i11 > 0) {
                i13 = 1;
            } else {
                i13 = -1;
            }
            m9693I2(i13, Math.abs(i11), true, c1899z);
            mo9655L1(c1899z, this.f7649t, cVar);
        }
    }

    /* renamed from: B2 */
    public void m9721B2(int i11, int i12) {
        this.f7640A = i11;
        this.f7641B = i12;
        SavedState savedState = this.f7643D;
        if (savedState != null) {
            savedState.m9761b();
        }
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: C */
    public void mo9722C(int i11, RecyclerView.AbstractC1888o.c cVar) {
        boolean z11;
        int i12;
        SavedState savedState = this.f7643D;
        int i13 = -1;
        if (savedState != null && savedState.m9760a()) {
            SavedState savedState2 = this.f7643D;
            z11 = savedState2.f7658r;
            i12 = savedState2.f7656p;
        } else {
            m9718z2();
            z11 = this.f7653x;
            i12 = this.f7640A;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        }
        if (!z11) {
            i13 = 1;
        }
        for (int i14 = 0; i14 < this.f7646G && i12 >= 0 && i12 < i11; i14++) {
            cVar.mo10172a(i12, 0);
            i12 += i13;
        }
    }

    /* renamed from: C2 */
    public void m9723C2(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        mo9755t(null);
        if (i11 != this.f7648s || this.f7650u == null) {
            AbstractC1928u m10644b = AbstractC1928u.m10644b(this, i11);
            this.f7650u = m10644b;
            this.f7644E.f7659a = m10644b;
            this.f7648s = i11;
            m10152r1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: D */
    public int mo9724D(RecyclerView.C1899z c1899z) {
        return m9697M1(c1899z);
    }

    /* renamed from: D2 */
    public void m9725D2(boolean z11) {
        mo9755t(null);
        if (z11 == this.f7652w) {
            return;
        }
        this.f7652w = z11;
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: E */
    public int mo9648E(RecyclerView.C1899z c1899z) {
        return m9699N1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: E1 */
    boolean mo9726E1() {
        if (m10114c0() != 1073741824 && m10141n0() != 1073741824 && m10144o0()) {
            return true;
        }
        return false;
    }

    /* renamed from: E2 */
    public void mo9649E2(boolean z11) {
        mo9755t(null);
        if (this.f7654y == z11) {
            return;
        }
        this.f7654y = z11;
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: F */
    public int mo9650F(RecyclerView.C1899z c1899z) {
        return m9700O1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G */
    public int mo9727G(RecyclerView.C1899z c1899z) {
        return m9697M1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G0 */
    public void mo9728G0(RecyclerView recyclerView, RecyclerView.C1894u c1894u) {
        super.mo9728G0(recyclerView, c1894u);
        if (this.f7642C) {
            m10129i1(c1894u);
            c1894u.m10206c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G1 */
    public void mo9729G1(RecyclerView recyclerView, RecyclerView.C1899z c1899z, int i11) {
        C1923p c1923p = new C1923p(recyclerView.getContext());
        c1923p.m10244p(i11);
        m10090H1(c1923p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: H */
    public int mo9651H(RecyclerView.C1899z c1899z) {
        return m9699N1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: H0 */
    public View mo9652H0(View view, int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        int m9733P1;
        View m9705f2;
        View m9711m2;
        m9718z2();
        if (m10110a() == 0 || (m9733P1 = m9733P1(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        m9735R1();
        m9693I2(m9733P1, (int) (this.f7650u.mo10657o() * 0.33333334f), false, c1899z);
        C1869c c1869c = this.f7649t;
        c1869c.f7674g = Integer.MIN_VALUE;
        c1869c.f7668a = false;
        m9736S1(c1894u, c1869c, c1899z, true);
        if (m9733P1 == -1) {
            m9705f2 = m9706g2();
        } else {
            m9705f2 = m9705f2();
        }
        if (m9733P1 == -1) {
            m9711m2 = m9712n2();
        } else {
            m9711m2 = m9711m2();
        }
        if (m9711m2.hasFocusable()) {
            if (m9705f2 == null) {
                return null;
            }
            return m9711m2;
        }
        return m9705f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: I */
    public int mo9653I(RecyclerView.C1899z c1899z) {
        return m9700O1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: I0 */
    public void mo9730I0(AccessibilityEvent accessibilityEvent) {
        super.mo9730I0(accessibilityEvent);
        if (m10110a() > 0) {
            accessibilityEvent.setFromIndex(m9740Y1());
            accessibilityEvent.setToIndex(m9745c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: J1 */
    public boolean mo9654J1() {
        return this.f7643D == null && this.f7651v == this.f7654y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K1 */
    public void mo9731K1(RecyclerView.C1899z c1899z, int[] iArr) {
        int i11;
        int mo9751o2 = mo9751o2(c1899z);
        if (this.f7649t.f7673f == -1) {
            i11 = 0;
        } else {
            i11 = mo9751o2;
            mo9751o2 = 0;
        }
        iArr[0] = mo9751o2;
        iArr[1] = i11;
    }

    /* renamed from: L1 */
    void mo9655L1(RecyclerView.C1899z c1899z, C1869c c1869c, RecyclerView.AbstractC1888o.c cVar) {
        int i11 = c1869c.f7671d;
        if (i11 >= 0 && i11 < c1899z.m10253b()) {
            cVar.mo10172a(i11, Math.max(0, c1869c.f7674g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: P */
    public View mo9732P(int i11) {
        int m10110a = m10110a();
        if (m10110a == 0) {
            return null;
        }
        int m10112b = i11 - m10112b(m10105V(0));
        if (m10112b >= 0 && m10112b < m10110a) {
            View m10105V = m10105V(m10112b);
            if (m10112b(m10105V) == i11) {
                return m10105V;
            }
        }
        return super.mo9732P(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P1 */
    public int m9733P1(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 17) {
                    if (i11 != 33) {
                        if (i11 != 66) {
                            if (i11 == 130 && this.f7648s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f7648s == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f7648s == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f7648s == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f7648s != 1 && m9752p2()) {
                return -1;
            }
            return 1;
        }
        if (this.f7648s == 1 || !m9752p2()) {
            return -1;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Q */
    public RecyclerView.LayoutParams mo9658Q() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: Q1 */
    C1869c m9734Q1() {
        return new C1869c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R1 */
    public void m9735R1() {
        if (this.f7649t == null) {
            this.f7649t = m9734Q1();
        }
    }

    /* renamed from: S1 */
    int m9736S1(RecyclerView.C1894u c1894u, C1869c c1869c, RecyclerView.C1899z c1899z, boolean z11) {
        int i11 = c1869c.f7670c;
        int i12 = c1869c.f7674g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                c1869c.f7674g = i12 + i11;
            }
            m9714u2(c1894u, c1869c);
        }
        int i13 = c1869c.f7670c + c1869c.f7675h;
        C1868b c1868b = this.f7645F;
        while (true) {
            if ((!c1869c.f7680m && i13 <= 0) || !c1869c.m9773c(c1899z)) {
                break;
            }
            c1868b.m9769a();
            mo9674r2(c1894u, c1899z, c1869c, c1868b);
            if (!c1868b.f7665b) {
                c1869c.f7669b += c1868b.f7664a * c1869c.f7673f;
                if (!c1868b.f7666c || c1869c.f7679l != null || !c1899z.m10256e()) {
                    int i14 = c1869c.f7670c;
                    int i15 = c1868b.f7664a;
                    c1869c.f7670c = i14 - i15;
                    i13 -= i15;
                }
                int i16 = c1869c.f7674g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + c1868b.f7664a;
                    c1869c.f7674g = i17;
                    int i18 = c1869c.f7670c;
                    if (i18 < 0) {
                        c1869c.f7674g = i17 + i18;
                    }
                    m9714u2(c1894u, c1869c);
                }
                if (z11 && c1868b.f7667d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - c1869c.f7670c;
    }

    /* renamed from: T1 */
    public int m9737T1() {
        View m9748e2 = m9748e2(0, m10110a(), true, false);
        if (m9748e2 == null) {
            return -1;
        }
        return m10112b(m9748e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: V0 */
    public void mo9665V0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int m9709k2;
        int i16;
        View mo9732P;
        int mo10649g;
        int i17;
        int i18 = -1;
        if ((this.f7643D != null || this.f7640A != -1) && c1899z.m10253b() == 0) {
            m10129i1(c1894u);
            return;
        }
        SavedState savedState = this.f7643D;
        if (savedState != null && savedState.m9760a()) {
            this.f7640A = this.f7643D.f7656p;
        }
        m9735R1();
        this.f7649t.f7668a = false;
        m9718z2();
        View m10113b0 = m10113b0();
        C1867a c1867a = this.f7644E;
        if (c1867a.f7663e && this.f7640A == -1 && this.f7643D == null) {
            if (m10113b0 != null && (this.f7650u.mo10649g(m10113b0) >= this.f7650u.mo10651i() || this.f7650u.mo10646d(m10113b0) <= this.f7650u.mo10656n())) {
                this.f7644E.m9766c(m10113b0, m10112b(m10113b0));
            }
        } else {
            c1867a.m9768e();
            C1867a c1867a2 = this.f7644E;
            c1867a2.f7662d = this.f7653x ^ this.f7654y;
            m9692H2(c1894u, c1899z, c1867a2);
            this.f7644E.f7663e = true;
        }
        C1869c c1869c = this.f7649t;
        if (c1869c.f7678k >= 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        c1869c.f7673f = i11;
        int[] iArr = this.f7647H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo9731K1(c1899z, iArr);
        int max = Math.max(0, this.f7647H[0]) + this.f7650u.mo10656n();
        int max2 = Math.max(0, this.f7647H[1]) + this.f7650u.mo10652j();
        if (c1899z.m10256e() && (i16 = this.f7640A) != -1 && this.f7641B != Integer.MIN_VALUE && (mo9732P = mo9732P(i16)) != null) {
            if (this.f7653x) {
                i17 = this.f7650u.mo10651i() - this.f7650u.mo10646d(mo9732P);
                mo10649g = this.f7641B;
            } else {
                mo10649g = this.f7650u.mo10649g(mo9732P) - this.f7650u.mo10656n();
                i17 = this.f7641B;
            }
            int i19 = i17 - mo10649g;
            if (i19 > 0) {
                max += i19;
            } else {
                max2 -= i19;
            }
        }
        C1867a c1867a3 = this.f7644E;
        if (!c1867a3.f7662d ? !this.f7653x : this.f7653x) {
            i18 = 1;
        }
        mo9675t2(c1894u, c1899z, c1867a3, i18);
        m10092J(c1894u);
        this.f7649t.f7680m = m9759y2();
        this.f7649t.f7677j = c1899z.m10256e();
        this.f7649t.f7676i = 0;
        C1867a c1867a4 = this.f7644E;
        if (c1867a4.f7662d) {
            m9698M2(c1867a4);
            C1869c c1869c2 = this.f7649t;
            c1869c2.f7675h = max;
            m9736S1(c1894u, c1869c2, c1899z, false);
            C1869c c1869c3 = this.f7649t;
            i13 = c1869c3.f7669b;
            int i21 = c1869c3.f7671d;
            int i22 = c1869c3.f7670c;
            if (i22 > 0) {
                max2 += i22;
            }
            m9695K2(this.f7644E);
            C1869c c1869c4 = this.f7649t;
            c1869c4.f7675h = max2;
            c1869c4.f7671d += c1869c4.f7672e;
            m9736S1(c1894u, c1869c4, c1899z, false);
            C1869c c1869c5 = this.f7649t;
            i12 = c1869c5.f7669b;
            int i23 = c1869c5.f7670c;
            if (i23 > 0) {
                m9696L2(i21, i13);
                C1869c c1869c6 = this.f7649t;
                c1869c6.f7675h = i23;
                m9736S1(c1894u, c1869c6, c1899z, false);
                i13 = this.f7649t.f7669b;
            }
        } else {
            m9695K2(c1867a4);
            C1869c c1869c7 = this.f7649t;
            c1869c7.f7675h = max2;
            m9736S1(c1894u, c1869c7, c1899z, false);
            C1869c c1869c8 = this.f7649t;
            i12 = c1869c8.f7669b;
            int i24 = c1869c8.f7671d;
            int i25 = c1869c8.f7670c;
            if (i25 > 0) {
                max += i25;
            }
            m9698M2(this.f7644E);
            C1869c c1869c9 = this.f7649t;
            c1869c9.f7675h = max;
            c1869c9.f7671d += c1869c9.f7672e;
            m9736S1(c1894u, c1869c9, c1899z, false);
            C1869c c1869c10 = this.f7649t;
            i13 = c1869c10.f7669b;
            int i26 = c1869c10.f7670c;
            if (i26 > 0) {
                m9694J2(i24, i12);
                C1869c c1869c11 = this.f7649t;
                c1869c11.f7675h = i26;
                m9736S1(c1894u, c1869c11, c1899z, false);
                i12 = this.f7649t.f7669b;
            }
        }
        if (m10110a() > 0) {
            if (this.f7653x ^ this.f7654y) {
                int m9709k22 = m9709k2(i12, c1894u, c1899z, true);
                i14 = i13 + m9709k22;
                i15 = i12 + m9709k22;
                m9709k2 = m9710l2(i14, c1894u, c1899z, false);
            } else {
                int m9710l2 = m9710l2(i13, c1894u, c1899z, true);
                i14 = i13 + m9710l2;
                i15 = i12 + m9710l2;
                m9709k2 = m9709k2(i15, c1894u, c1899z, false);
            }
            i13 = i14 + m9709k2;
            i12 = i15 + m9709k2;
        }
        m9713s2(c1894u, c1899z, i13, i12);
        if (!c1899z.m10256e()) {
            this.f7650u.m10662t();
        } else {
            this.f7644E.m9768e();
        }
        this.f7651v = this.f7654y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: W0 */
    public void mo9666W0(RecyclerView.C1899z c1899z) {
        super.mo9666W0(c1899z);
        this.f7643D = null;
        this.f7640A = -1;
        this.f7641B = Integer.MIN_VALUE;
        this.f7644E.m9768e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W1 */
    public View m9738W1(boolean z11, boolean z12) {
        if (this.f7653x) {
            return m9748e2(0, m10110a(), z11, z12);
        }
        return m9748e2(m10110a() - 1, -1, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View m9739X1(boolean z11, boolean z12) {
        if (this.f7653x) {
            return m9748e2(m10110a() - 1, -1, z11, z12);
        }
        return m9748e2(0, m10110a(), z11, z12);
    }

    /* renamed from: Y1 */
    public int m9740Y1() {
        View m9748e2 = m9748e2(0, m10110a(), false, true);
        if (m9748e2 == null) {
            return -1;
        }
        return m10112b(m9748e2);
    }

    /* renamed from: Z1 */
    public int m9741Z1() {
        View m9748e2 = m9748e2(m10110a() - 1, -1, true, false);
        if (m9748e2 == null) {
            return -1;
        }
        return m10112b(m9748e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: a1 */
    public void mo9742a1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7643D = (SavedState) parcelable;
            m10152r1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: b1 */
    public Parcelable mo9743b1() {
        if (this.f7643D != null) {
            return new SavedState(this.f7643D);
        }
        SavedState savedState = new SavedState();
        if (m10110a() > 0) {
            m9735R1();
            boolean z11 = this.f7651v ^ this.f7653x;
            savedState.f7658r = z11;
            if (z11) {
                View m9711m2 = m9711m2();
                savedState.f7657q = this.f7650u.mo10651i() - this.f7650u.mo10646d(m9711m2);
                savedState.f7656p = m10112b(m9711m2);
            } else {
                View m9712n2 = m9712n2();
                savedState.f7656p = m10112b(m9712n2);
                savedState.f7657q = this.f7650u.mo10649g(m9712n2) - this.f7650u.mo10656n();
            }
        } else {
            savedState.m9761b();
        }
        return savedState;
    }

    /* renamed from: c */
    public boolean m9744c() {
        return this.f7652w;
    }

    /* renamed from: c2 */
    public int m9745c2() {
        View m9748e2 = m9748e2(m10110a() - 1, -1, false, true);
        if (m9748e2 == null) {
            return -1;
        }
        return m10112b(m9748e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y.b
    /* renamed from: d */
    public PointF mo9746d(int i11) {
        if (m10110a() == 0) {
            return null;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 < m10112b(m10105V(0))) {
            z11 = true;
        }
        if (z11 != this.f7653x) {
            i12 = -1;
        }
        if (this.f7648s == 0) {
            return new PointF(i12, 0.0f);
        }
        return new PointF(0.0f, i12);
    }

    /* renamed from: d2 */
    View m9747d2(int i11, int i12) {
        int i13;
        int i14;
        m9735R1();
        if (i12 > i11 || i12 < i11) {
            if (this.f7650u.mo10649g(m10105V(i11)) < this.f7650u.mo10656n()) {
                i13 = 16644;
                i14 = 16388;
            } else {
                i13 = 4161;
                i14 = 4097;
            }
            if (this.f7648s == 0) {
                return this.f7815e.m10410a(i11, i12, i13, i14);
            }
            return this.f7816f.m10410a(i11, i12, i13, i14);
        }
        return m10105V(i11);
    }

    /* renamed from: e2 */
    View m9748e2(int i11, int i12, boolean z11, boolean z12) {
        int i13;
        m9735R1();
        int i14 = 320;
        if (z11) {
            i13 = 24579;
        } else {
            i13 = 320;
        }
        if (!z12) {
            i14 = 0;
        }
        if (this.f7648s == 0) {
            return this.f7815e.m10410a(i11, i12, i13, i14);
        }
        return this.f7816f.m10410a(i11, i12, i13, i14);
    }

    @Override // androidx.recyclerview.widget.C1919l.h
    /* renamed from: g */
    public void mo9749g(View view, View view2, int i11, int i12) {
        char c11;
        mo9755t("Cannot drop a view during a scroll or layout calculation");
        m9735R1();
        m9718z2();
        int m10112b = m10112b(view);
        int m10112b2 = m10112b(view2);
        if (m10112b < m10112b2) {
            c11 = 1;
        } else {
            c11 = 65535;
        }
        if (this.f7653x) {
            if (c11 == 1) {
                m9721B2(m10112b2, this.f7650u.mo10651i() - (this.f7650u.mo10649g(view2) + this.f7650u.mo10647e(view)));
                return;
            } else {
                m9721B2(m10112b2, this.f7650u.mo10651i() - this.f7650u.mo10646d(view2));
                return;
            }
        }
        if (c11 == 65535) {
            m9721B2(m10112b2, this.f7650u.mo10649g(view2));
        } else {
            m9721B2(m10112b2, this.f7650u.mo10646d(view2) - this.f7650u.mo10647e(view));
        }
    }

    /* renamed from: h */
    public int m9750h() {
        return this.f7648s;
    }

    /* renamed from: h2 */
    View mo9672h2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11, int i12, int i13) {
        int i14;
        m9735R1();
        int mo10656n = this.f7650u.mo10656n();
        int mo10651i = this.f7650u.mo10651i();
        if (i12 > i11) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View m10105V = m10105V(i11);
            int m10112b = m10112b(m10105V);
            if (m10112b >= 0 && m10112b < i13) {
                if (((RecyclerView.LayoutParams) m10105V.getLayoutParams()).m9915d()) {
                    if (view2 == null) {
                        view2 = m10105V;
                    }
                } else {
                    if (this.f7650u.mo10649g(m10105V) < mo10651i && this.f7650u.mo10646d(m10105V) >= mo10656n) {
                        return m10105V;
                    }
                    if (view == null) {
                        view = m10105V;
                    }
                }
            }
            i11 += i14;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o2 */
    public int mo9751o2(RecyclerView.C1899z c1899z) {
        if (c1899z.m10255d()) {
            return this.f7650u.mo10657o();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p2 */
    public boolean m9752p2() {
        if (m10116d0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: q0 */
    public boolean mo9753q0() {
        return true;
    }

    /* renamed from: q2 */
    public boolean m9754q2() {
        return this.f7655z;
    }

    /* renamed from: r2 */
    void mo9674r2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, C1869c c1869c, C1868b c1868b) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int mo10648f;
        boolean z12;
        View m9774d = c1869c.m9774d(c1894u);
        if (m9774d == null) {
            c1868b.f7665b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) m9774d.getLayoutParams();
        if (c1869c.f7679l == null) {
            boolean z13 = this.f7653x;
            if (c1869c.f7673f == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z13 == z12) {
                m10149q(m9774d);
            } else {
                m10151r(m9774d, 0);
            }
        } else {
            boolean z14 = this.f7653x;
            if (c1869c.f7673f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z14 == z11) {
                m10143o(m9774d);
            } else {
                m10146p(m9774d, 0);
            }
        }
        m10163y0(m9774d, 0, 0);
        c1868b.f7664a = this.f7650u.mo10647e(m9774d);
        if (this.f7648s == 1) {
            if (m9752p2()) {
                mo10648f = getWidth() - getPaddingRight();
                i14 = mo10648f - this.f7650u.mo10648f(m9774d);
            } else {
                i14 = getPaddingLeft();
                mo10648f = this.f7650u.mo10648f(m9774d) + i14;
            }
            if (c1869c.f7673f == -1) {
                int i15 = c1869c.f7669b;
                i13 = i15;
                i12 = mo10648f;
                i11 = i15 - c1868b.f7664a;
            } else {
                int i16 = c1869c.f7669b;
                i11 = i16;
                i12 = mo10648f;
                i13 = c1868b.f7664a + i16;
            }
        } else {
            int paddingTop = getPaddingTop();
            int mo10648f2 = this.f7650u.mo10648f(m9774d) + paddingTop;
            if (c1869c.f7673f == -1) {
                int i17 = c1869c.f7669b;
                i12 = i17;
                i11 = paddingTop;
                i13 = mo10648f2;
                i14 = i17 - c1868b.f7664a;
            } else {
                int i18 = c1869c.f7669b;
                i11 = paddingTop;
                i12 = c1868b.f7664a + i18;
                i13 = mo10648f2;
                i14 = i18;
            }
        }
        mo10161x0(m9774d, i14, i11, i12, i13);
        if (layoutParams.m9915d() || layoutParams.m9914c()) {
            c1868b.f7666c = true;
        }
        c1868b.f7667d = m9774d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: t */
    public void mo9755t(String str) {
        if (this.f7643D == null) {
            super.mo9755t(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2 */
    public void mo9675t2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, C1867a c1867a, int i11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: u1 */
    public int mo9676u1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7648s == 1) {
            return 0;
        }
        return m9719A2(i11, c1894u, c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: v1 */
    public void mo9756v1(int i11) {
        this.f7640A = i11;
        this.f7641B = Integer.MIN_VALUE;
        SavedState savedState = this.f7643D;
        if (savedState != null) {
            savedState.m9761b();
        }
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: w1 */
    public int mo9677w1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7648s == 0) {
            return 0;
        }
        return m9719A2(i11, c1894u, c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: x */
    public boolean mo9757x() {
        return this.f7648s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: y */
    public boolean mo9758y() {
        return this.f7648s == 1;
    }

    /* renamed from: y2 */
    boolean m9759y2() {
        if (this.f7650u.mo10654l() == 0 && this.f7650u.mo10650h() == 0) {
            return true;
        }
        return false;
    }

    public LinearLayoutManager(Context context, int i11, boolean z11) {
        this.f7648s = 1;
        this.f7652w = false;
        this.f7653x = false;
        this.f7654y = false;
        this.f7655z = true;
        this.f7640A = -1;
        this.f7641B = Integer.MIN_VALUE;
        this.f7643D = null;
        this.f7644E = new C1867a();
        this.f7645F = new C1868b();
        this.f7646G = 2;
        this.f7647H = new int[2];
        m9723C2(i11);
        m9725D2(z11);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f7648s = 1;
        this.f7652w = false;
        this.f7653x = false;
        this.f7654y = false;
        this.f7655z = true;
        this.f7640A = -1;
        this.f7641B = Integer.MIN_VALUE;
        this.f7643D = null;
        this.f7644E = new C1867a();
        this.f7645F = new C1868b();
        this.f7646G = 2;
        this.f7647H = new int[2];
        RecyclerView.AbstractC1888o.d m10075h0 = RecyclerView.AbstractC1888o.m10075h0(context, attributeSet, i11, i12);
        m9723C2(m10075h0.f7831a);
        m9725D2(m10075h0.f7833c);
        mo9649E2(m10075h0.f7834d);
    }
}
