package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.C1507g0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1888o implements RecyclerView.AbstractC1898y.b {

    /* renamed from: B */
    private BitSet f7883B;

    /* renamed from: G */
    private boolean f7888G;

    /* renamed from: H */
    private boolean f7889H;

    /* renamed from: I */
    private SavedState f7890I;

    /* renamed from: J */
    private int f7891J;

    /* renamed from: O */
    private int[] f7896O;

    /* renamed from: t */
    C1904c[] f7899t;

    /* renamed from: u */
    AbstractC1928u f7900u;

    /* renamed from: v */
    AbstractC1928u f7901v;

    /* renamed from: w */
    private int f7902w;

    /* renamed from: x */
    private int f7903x;

    /* renamed from: y */
    private final C1922o f7904y;

    /* renamed from: s */
    private int f7898s = -1;

    /* renamed from: z */
    boolean f7905z = false;

    /* renamed from: A */
    boolean f7882A = false;

    /* renamed from: C */
    int f7884C = -1;

    /* renamed from: D */
    int f7885D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f7886E = new LazySpanLookup();

    /* renamed from: F */
    private int f7887F = 2;

    /* renamed from: K */
    private final Rect f7892K = new Rect();

    /* renamed from: L */
    private final C1903b f7893L = new C1903b();

    /* renamed from: M */
    private boolean f7894M = false;

    /* renamed from: N */
    private boolean f7895N = true;

    /* renamed from: P */
    private final Runnable f7897P = new RunnableC1902a();

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        C1904c f7906e;

        /* renamed from: f */
        boolean f7907f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: f */
        public final int m10317f() {
            C1904c c1904c = this.f7906e;
            if (c1904c == null) {
                return -1;
            }
            return c1904c.f7936e;
        }

        /* renamed from: g */
        public boolean m10318g() {
            return this.f7907f;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1901a();

        /* renamed from: p */
        int f7914p;

        /* renamed from: q */
        int f7915q;

        /* renamed from: r */
        int f7916r;

        /* renamed from: s */
        int[] f7917s;

        /* renamed from: t */
        int f7918t;

        /* renamed from: u */
        int[] f7919u;

        /* renamed from: v */
        List f7920v;

        /* renamed from: w */
        boolean f7921w;

        /* renamed from: x */
        boolean f7922x;

        /* renamed from: y */
        boolean f7923y;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1901a implements Parcelable.Creator {
            C1901a() {
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
        void m10337a() {
            this.f7917s = null;
            this.f7916r = 0;
            this.f7914p = -1;
            this.f7915q = -1;
        }

        /* renamed from: b */
        void m10338b() {
            this.f7917s = null;
            this.f7916r = 0;
            this.f7918t = 0;
            this.f7919u = null;
            this.f7920v = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f7914p);
            parcel.writeInt(this.f7915q);
            parcel.writeInt(this.f7916r);
            if (this.f7916r > 0) {
                parcel.writeIntArray(this.f7917s);
            }
            parcel.writeInt(this.f7918t);
            if (this.f7918t > 0) {
                parcel.writeIntArray(this.f7919u);
            }
            parcel.writeInt(this.f7921w ? 1 : 0);
            parcel.writeInt(this.f7922x ? 1 : 0);
            parcel.writeInt(this.f7923y ? 1 : 0);
            parcel.writeList(this.f7920v);
        }

        SavedState(Parcel parcel) {
            this.f7914p = parcel.readInt();
            this.f7915q = parcel.readInt();
            int readInt = parcel.readInt();
            this.f7916r = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f7917s = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f7918t = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f7919u = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f7921w = parcel.readInt() == 1;
            this.f7922x = parcel.readInt() == 1;
            this.f7923y = parcel.readInt() == 1;
            this.f7920v = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f7916r = savedState.f7916r;
            this.f7914p = savedState.f7914p;
            this.f7915q = savedState.f7915q;
            this.f7917s = savedState.f7917s;
            this.f7918t = savedState.f7918t;
            this.f7919u = savedState.f7919u;
            this.f7921w = savedState.f7921w;
            this.f7922x = savedState.f7922x;
            this.f7923y = savedState.f7923y;
            this.f7920v = savedState.f7920v;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes2.dex */
    class RunnableC1902a implements Runnable {
        RunnableC1902a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m10307Q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes2.dex */
    public class C1903b {

        /* renamed from: a */
        int f7925a;

        /* renamed from: b */
        int f7926b;

        /* renamed from: c */
        boolean f7927c;

        /* renamed from: d */
        boolean f7928d;

        /* renamed from: e */
        boolean f7929e;

        /* renamed from: f */
        int[] f7930f;

        C1903b() {
            m10343c();
        }

        /* renamed from: a */
        void m10341a() {
            int mo10656n;
            if (this.f7927c) {
                mo10656n = StaggeredGridLayoutManager.this.f7900u.mo10651i();
            } else {
                mo10656n = StaggeredGridLayoutManager.this.f7900u.mo10656n();
            }
            this.f7926b = mo10656n;
        }

        /* renamed from: b */
        void m10342b(int i11) {
            if (this.f7927c) {
                this.f7926b = StaggeredGridLayoutManager.this.f7900u.mo10651i() - i11;
            } else {
                this.f7926b = StaggeredGridLayoutManager.this.f7900u.mo10656n() + i11;
            }
        }

        /* renamed from: c */
        void m10343c() {
            this.f7925a = -1;
            this.f7926b = Integer.MIN_VALUE;
            this.f7927c = false;
            this.f7928d = false;
            this.f7929e = false;
            int[] iArr = this.f7930f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m10344d(C1904c[] c1904cArr) {
            int length = c1904cArr.length;
            int[] iArr = this.f7930f;
            if (iArr == null || iArr.length < length) {
                this.f7930f = new int[StaggeredGridLayoutManager.this.f7899t.length];
            }
            for (int i11 = 0; i11 < length; i11++) {
                this.f7930f[i11] = c1904cArr[i11].m10360p(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes2.dex */
    public class C1904c {

        /* renamed from: a */
        ArrayList f7932a = new ArrayList();

        /* renamed from: b */
        int f7933b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f7934c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f7935d = 0;

        /* renamed from: e */
        final int f7936e;

        C1904c(int i11) {
            this.f7936e = i11;
        }

        /* renamed from: a */
        void m10345a(View view) {
            LayoutParams m10358n = m10358n(view);
            m10358n.f7906e = this;
            this.f7932a.add(view);
            this.f7934c = Integer.MIN_VALUE;
            if (this.f7932a.size() == 1) {
                this.f7933b = Integer.MIN_VALUE;
            }
            if (m10358n.m9915d() || m10358n.m9914c()) {
                this.f7935d += StaggeredGridLayoutManager.this.f7900u.mo10647e(view);
            }
        }

        /* renamed from: b */
        void m10346b(boolean z11, int i11) {
            int m10360p;
            if (z11) {
                m10360p = m10356l(Integer.MIN_VALUE);
            } else {
                m10360p = m10360p(Integer.MIN_VALUE);
            }
            m10349e();
            if (m10360p == Integer.MIN_VALUE) {
                return;
            }
            if (!z11 || m10360p >= StaggeredGridLayoutManager.this.f7900u.mo10651i()) {
                if (!z11 && m10360p > StaggeredGridLayoutManager.this.f7900u.mo10656n()) {
                    return;
                }
                if (i11 != Integer.MIN_VALUE) {
                    m10360p += i11;
                }
                this.f7934c = m10360p;
                this.f7933b = m10360p;
            }
        }

        /* renamed from: c */
        void m10347c() {
            LazySpanLookup.FullSpanItem m10327f;
            ArrayList arrayList = this.f7932a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams m10358n = m10358n(view);
            this.f7934c = StaggeredGridLayoutManager.this.f7900u.mo10646d(view);
            if (m10358n.f7907f && (m10327f = StaggeredGridLayoutManager.this.f7886E.m10327f(m10358n.m9913b())) != null && m10327f.f7911q == 1) {
                this.f7934c += m10327f.m10334a(this.f7936e);
            }
        }

        /* renamed from: d */
        void m10348d() {
            LazySpanLookup.FullSpanItem m10327f;
            View view = (View) this.f7932a.get(0);
            LayoutParams m10358n = m10358n(view);
            this.f7933b = StaggeredGridLayoutManager.this.f7900u.mo10649g(view);
            if (m10358n.f7907f && (m10327f = StaggeredGridLayoutManager.this.f7886E.m10327f(m10358n.m9913b())) != null && m10327f.f7911q == -1) {
                this.f7933b -= m10327f.m10334a(this.f7936e);
            }
        }

        /* renamed from: e */
        void m10349e() {
            this.f7932a.clear();
            m10361q();
            this.f7935d = 0;
        }

        /* renamed from: f */
        public int m10350f() {
            if (StaggeredGridLayoutManager.this.f7905z) {
                return m10353i(this.f7932a.size() - 1, -1, true);
            }
            return m10353i(0, this.f7932a.size(), true);
        }

        /* renamed from: g */
        public int m10351g() {
            if (StaggeredGridLayoutManager.this.f7905z) {
                return m10353i(0, this.f7932a.size(), true);
            }
            return m10353i(this.f7932a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m10352h(int i11, int i12, boolean z11, boolean z12, boolean z13) {
            int i13;
            boolean z14;
            int mo10656n = StaggeredGridLayoutManager.this.f7900u.mo10656n();
            int mo10651i = StaggeredGridLayoutManager.this.f7900u.mo10651i();
            if (i12 > i11) {
                i13 = 1;
            } else {
                i13 = -1;
            }
            while (i11 != i12) {
                View view = (View) this.f7932a.get(i11);
                int mo10649g = StaggeredGridLayoutManager.this.f7900u.mo10649g(view);
                int mo10646d = StaggeredGridLayoutManager.this.f7900u.mo10646d(view);
                boolean z15 = false;
                if (!z13 ? mo10649g < mo10651i : mo10649g <= mo10651i) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z13 ? mo10646d > mo10656n : mo10646d >= mo10656n) {
                    z15 = true;
                }
                if (z14 && z15) {
                    if (z11 && z12) {
                        if (mo10649g >= mo10656n && mo10646d <= mo10651i) {
                            return StaggeredGridLayoutManager.this.m10112b(view);
                        }
                    } else {
                        if (z12) {
                            return StaggeredGridLayoutManager.this.m10112b(view);
                        }
                        if (mo10649g < mo10656n || mo10646d > mo10651i) {
                            return StaggeredGridLayoutManager.this.m10112b(view);
                        }
                    }
                }
                i11 += i13;
            }
            return -1;
        }

        /* renamed from: i */
        int m10353i(int i11, int i12, boolean z11) {
            return m10352h(i11, i12, false, false, z11);
        }

        /* renamed from: j */
        public int m10354j() {
            return this.f7935d;
        }

        /* renamed from: k */
        int m10355k() {
            int i11 = this.f7934c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            m10347c();
            return this.f7934c;
        }

        /* renamed from: l */
        int m10356l(int i11) {
            int i12 = this.f7934c;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f7932a.size() == 0) {
                return i11;
            }
            m10347c();
            return this.f7934c;
        }

        /* renamed from: m */
        public View m10357m(int i11, int i12) {
            View view = null;
            if (i12 == -1) {
                int size = this.f7932a.size();
                int i13 = 0;
                while (i13 < size) {
                    View view2 = (View) this.f7932a.get(i13);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f7905z && staggeredGridLayoutManager.m10112b(view2) <= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f7905z && staggeredGridLayoutManager2.m10112b(view2) >= i11) || !view2.hasFocusable()) {
                        break;
                    }
                    i13++;
                    view = view2;
                }
            } else {
                int size2 = this.f7932a.size() - 1;
                while (size2 >= 0) {
                    View view3 = (View) this.f7932a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f7905z && staggeredGridLayoutManager3.m10112b(view3) >= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f7905z && staggeredGridLayoutManager4.m10112b(view3) <= i11) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        LayoutParams m10358n(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: o */
        int m10359o() {
            int i11 = this.f7933b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            m10348d();
            return this.f7933b;
        }

        /* renamed from: p */
        int m10360p(int i11) {
            int i12 = this.f7933b;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f7932a.size() == 0) {
                return i11;
            }
            m10348d();
            return this.f7933b;
        }

        /* renamed from: q */
        void m10361q() {
            this.f7933b = Integer.MIN_VALUE;
            this.f7934c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m10362r(int i11) {
            int i12 = this.f7933b;
            if (i12 != Integer.MIN_VALUE) {
                this.f7933b = i12 + i11;
            }
            int i13 = this.f7934c;
            if (i13 != Integer.MIN_VALUE) {
                this.f7934c = i13 + i11;
            }
        }

        /* renamed from: s */
        void m10363s() {
            int size = this.f7932a.size();
            View view = (View) this.f7932a.remove(size - 1);
            LayoutParams m10358n = m10358n(view);
            m10358n.f7906e = null;
            if (m10358n.m9915d() || m10358n.m9914c()) {
                this.f7935d -= StaggeredGridLayoutManager.this.f7900u.mo10647e(view);
            }
            if (size == 1) {
                this.f7933b = Integer.MIN_VALUE;
            }
            this.f7934c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m10364t() {
            View view = (View) this.f7932a.remove(0);
            LayoutParams m10358n = m10358n(view);
            m10358n.f7906e = null;
            if (this.f7932a.size() == 0) {
                this.f7934c = Integer.MIN_VALUE;
            }
            if (m10358n.m9915d() || m10358n.m9914c()) {
                this.f7935d -= StaggeredGridLayoutManager.this.f7900u.mo10647e(view);
            }
            this.f7933b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m10365u(View view) {
            LayoutParams m10358n = m10358n(view);
            m10358n.f7906e = this;
            this.f7932a.add(0, view);
            this.f7933b = Integer.MIN_VALUE;
            if (this.f7932a.size() == 1) {
                this.f7934c = Integer.MIN_VALUE;
            }
            if (m10358n.m9915d() || m10358n.m9914c()) {
                this.f7935d += StaggeredGridLayoutManager.this.f7900u.mo10647e(view);
            }
        }

        /* renamed from: v */
        void m10366v(int i11) {
            this.f7933b = i11;
            this.f7934c = i11;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        RecyclerView.AbstractC1888o.d m10075h0 = RecyclerView.AbstractC1888o.m10075h0(context, attributeSet, i11, i12);
        m10299F2(m10075h0.f7831a);
        m10301H2(m10075h0.f7832b);
        m10300G2(m10075h0.f7833c);
        this.f7904y = new C1922o();
        m10279Y1();
    }

    /* renamed from: A2 */
    private void m10259A2(RecyclerView.C1894u c1894u, int i11) {
        while (m10110a() > 0) {
            View m10105V = m10105V(0);
            if (this.f7900u.mo10646d(m10105V) <= i11 && this.f7900u.mo10659q(m10105V) <= i11) {
                LayoutParams layoutParams = (LayoutParams) m10105V.getLayoutParams();
                if (layoutParams.f7907f) {
                    for (int i12 = 0; i12 < this.f7898s; i12++) {
                        if (this.f7899t[i12].f7932a.size() == 1) {
                            return;
                        }
                    }
                    for (int i13 = 0; i13 < this.f7898s; i13++) {
                        this.f7899t[i13].m10364t();
                    }
                } else if (layoutParams.f7906e.f7932a.size() == 1) {
                    return;
                } else {
                    layoutParams.f7906e.m10364t();
                }
                m10134k1(m10105V, c1894u);
            } else {
                return;
            }
        }
    }

    /* renamed from: B2 */
    private void m10260B2() {
        if (this.f7901v.mo10654l() == 1073741824) {
            return;
        }
        int m10110a = m10110a();
        float f11 = 0.0f;
        for (int i11 = 0; i11 < m10110a; i11++) {
            View m10105V = m10105V(i11);
            float mo10647e = this.f7901v.mo10647e(m10105V);
            if (mo10647e >= f11) {
                if (((LayoutParams) m10105V.getLayoutParams()).m10318g()) {
                    mo10647e = (mo10647e * 1.0f) / this.f7898s;
                }
                f11 = Math.max(f11, mo10647e);
            }
        }
        int i12 = this.f7903x;
        int round = Math.round(f11 * this.f7898s);
        if (this.f7901v.mo10654l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f7901v.mo10657o());
        }
        m10306N2(round);
        if (this.f7903x == i12) {
            return;
        }
        for (int i13 = 0; i13 < m10110a; i13++) {
            View m10105V2 = m10105V(i13);
            LayoutParams layoutParams = (LayoutParams) m10105V2.getLayoutParams();
            if (!layoutParams.f7907f) {
                if (m10315r2() && this.f7902w == 1) {
                    int i14 = this.f7898s;
                    int i15 = layoutParams.f7906e.f7936e;
                    m10105V2.offsetLeftAndRight(((-((i14 - 1) - i15)) * this.f7903x) - ((-((i14 - 1) - i15)) * i12));
                } else {
                    int i16 = layoutParams.f7906e.f7936e;
                    int i17 = this.f7903x * i16;
                    int i18 = i16 * i12;
                    if (this.f7902w == 1) {
                        m10105V2.offsetLeftAndRight(i17 - i18);
                    } else {
                        m10105V2.offsetTopAndBottom(i17 - i18);
                    }
                }
            }
        }
    }

    /* renamed from: C2 */
    private void m10261C2() {
        if (this.f7902w != 1 && m10315r2()) {
            this.f7882A = !this.f7905z;
        } else {
            this.f7882A = this.f7905z;
        }
    }

    /* renamed from: E2 */
    private void m10262E2(int i11) {
        boolean z11;
        C1922o c1922o = this.f7904y;
        c1922o.f8194e = i11;
        boolean z12 = this.f7882A;
        int i12 = 1;
        if (i11 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z12 != z11) {
            i12 = -1;
        }
        c1922o.f8193d = i12;
    }

    /* renamed from: I2 */
    private void m10263I2(int i11, int i12) {
        for (int i13 = 0; i13 < this.f7898s; i13++) {
            if (!this.f7899t[i13].f7932a.isEmpty()) {
                m10269O2(this.f7899t[i13], i11, i12);
            }
        }
    }

    /* renamed from: J2 */
    private boolean m10264J2(RecyclerView.C1899z c1899z, C1903b c1903b) {
        int m10281a2;
        if (this.f7888G) {
            m10281a2 = m10282e2(c1899z.m10253b());
        } else {
            m10281a2 = m10281a2(c1899z.m10253b());
        }
        c1903b.f7925a = m10281a2;
        c1903b.f7926b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: K1 */
    private void m10265K1(View view) {
        for (int i11 = this.f7898s - 1; i11 >= 0; i11--) {
            this.f7899t[i11].m10345a(view);
        }
    }

    /* renamed from: L1 */
    private void m10266L1(C1903b c1903b) {
        int mo10656n;
        SavedState savedState = this.f7890I;
        int i11 = savedState.f7916r;
        if (i11 > 0) {
            if (i11 == this.f7898s) {
                for (int i12 = 0; i12 < this.f7898s; i12++) {
                    this.f7899t[i12].m10349e();
                    SavedState savedState2 = this.f7890I;
                    int i13 = savedState2.f7917s[i12];
                    if (i13 != Integer.MIN_VALUE) {
                        if (savedState2.f7922x) {
                            mo10656n = this.f7900u.mo10651i();
                        } else {
                            mo10656n = this.f7900u.mo10656n();
                        }
                        i13 += mo10656n;
                    }
                    this.f7899t[i12].m10366v(i13);
                }
            } else {
                savedState.m10338b();
                SavedState savedState3 = this.f7890I;
                savedState3.f7914p = savedState3.f7915q;
            }
        }
        SavedState savedState4 = this.f7890I;
        this.f7889H = savedState4.f7923y;
        m10300G2(savedState4.f7921w);
        m10261C2();
        SavedState savedState5 = this.f7890I;
        int i14 = savedState5.f7914p;
        if (i14 != -1) {
            this.f7884C = i14;
            c1903b.f7927c = savedState5.f7922x;
        } else {
            c1903b.f7927c = this.f7882A;
        }
        if (savedState5.f7918t > 1) {
            LazySpanLookup lazySpanLookup = this.f7886E;
            lazySpanLookup.f7908a = savedState5.f7919u;
            lazySpanLookup.f7909b = savedState5.f7920v;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* renamed from: M2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m10267M2(int i11, RecyclerView.C1899z c1899z) {
        int i12;
        int i13;
        int m10254c;
        boolean z11;
        C1922o c1922o = this.f7904y;
        boolean z12 = false;
        c1922o.f8191b = 0;
        c1922o.f8192c = i11;
        if (m10158v0() && (m10254c = c1899z.m10254c()) != -1) {
            boolean z13 = this.f7882A;
            if (m10254c < i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z13 == z11) {
                i12 = this.f7900u.mo10657o();
            } else {
                i13 = this.f7900u.mo10657o();
                i12 = 0;
                if (!m10107Y()) {
                    this.f7904y.f8195f = this.f7900u.mo10656n() - i13;
                    this.f7904y.f8196g = this.f7900u.mo10651i() + i12;
                } else {
                    this.f7904y.f8196g = this.f7900u.mo10650h() + i12;
                    this.f7904y.f8195f = -i13;
                }
                C1922o c1922o2 = this.f7904y;
                c1922o2.f8197h = false;
                c1922o2.f8190a = true;
                if (this.f7900u.mo10654l() == 0 && this.f7900u.mo10650h() == 0) {
                    z12 = true;
                }
                c1922o2.f8198i = z12;
            }
        } else {
            i12 = 0;
        }
        i13 = 0;
        if (!m10107Y()) {
        }
        C1922o c1922o22 = this.f7904y;
        c1922o22.f8197h = false;
        c1922o22.f8190a = true;
        if (this.f7900u.mo10654l() == 0) {
            z12 = true;
        }
        c1922o22.f8198i = z12;
    }

    /* renamed from: O1 */
    private void m10268O1(View view, LayoutParams layoutParams, C1922o c1922o) {
        if (c1922o.f8194e == 1) {
            if (layoutParams.f7907f) {
                m10265K1(view);
                return;
            } else {
                layoutParams.f7906e.m10345a(view);
                return;
            }
        }
        if (layoutParams.f7907f) {
            m10295x2(view);
        } else {
            layoutParams.f7906e.m10365u(view);
        }
    }

    /* renamed from: O2 */
    private void m10269O2(C1904c c1904c, int i11, int i12) {
        int m10354j = c1904c.m10354j();
        if (i11 == -1) {
            if (c1904c.m10359o() + m10354j <= i12) {
                this.f7883B.set(c1904c.f7936e, false);
            }
        } else if (c1904c.m10355k() - m10354j >= i12) {
            this.f7883B.set(c1904c.f7936e, false);
        }
    }

    /* renamed from: P1 */
    private int m10270P1(int i11) {
        boolean z11;
        if (m10110a() == 0) {
            if (!this.f7882A) {
                return -1;
            }
            return 1;
        }
        if (i11 < m10311h2()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != this.f7882A) {
            return -1;
        }
        return 1;
    }

    /* renamed from: P2 */
    private int m10271P2(int i11, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return i11;
        }
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i11;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode);
    }

    /* renamed from: R1 */
    private boolean m10272R1(C1904c c1904c) {
        if (this.f7882A) {
            if (c1904c.m10355k() < this.f7900u.mo10651i()) {
                ArrayList arrayList = c1904c.f7932a;
                return !c1904c.m10358n((View) arrayList.get(arrayList.size() - 1)).f7907f;
            }
        } else if (c1904c.m10359o() > this.f7900u.mo10656n()) {
            return !c1904c.m10358n((View) c1904c.f7932a.get(0)).f7907f;
        }
        return false;
    }

    /* renamed from: S1 */
    private int m10273S1(RecyclerView.C1899z c1899z) {
        if (m10110a() == 0) {
            return 0;
        }
        return AbstractC1932y.m10675a(c1899z, this.f7900u, m10309c2(!this.f7895N), m10308b2(!this.f7895N), this, this.f7895N);
    }

    /* renamed from: T1 */
    private int m10274T1(RecyclerView.C1899z c1899z) {
        if (m10110a() == 0) {
            return 0;
        }
        return AbstractC1932y.m10676b(c1899z, this.f7900u, m10309c2(!this.f7895N), m10308b2(!this.f7895N), this, this.f7895N, this.f7882A);
    }

    /* renamed from: U1 */
    private int m10275U1(RecyclerView.C1899z c1899z) {
        if (m10110a() == 0) {
            return 0;
        }
        return AbstractC1932y.m10677c(c1899z, this.f7900u, m10309c2(!this.f7895N), m10308b2(!this.f7895N), this, this.f7895N);
    }

    /* renamed from: V1 */
    private int m10276V1(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 17) {
                    if (i11 != 33) {
                        if (i11 != 66) {
                            if (i11 == 130 && this.f7902w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f7902w == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f7902w == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f7902w == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f7902w != 1 && m10315r2()) {
                return -1;
            }
            return 1;
        }
        if (this.f7902w == 1 || !m10315r2()) {
            return -1;
        }
        return 1;
    }

    /* renamed from: W1 */
    private LazySpanLookup.FullSpanItem m10277W1(int i11) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f7912r = new int[this.f7898s];
        for (int i12 = 0; i12 < this.f7898s; i12++) {
            fullSpanItem.f7912r[i12] = i11 - this.f7899t[i12].m10356l(i11);
        }
        return fullSpanItem;
    }

    /* renamed from: X1 */
    private LazySpanLookup.FullSpanItem m10278X1(int i11) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f7912r = new int[this.f7898s];
        for (int i12 = 0; i12 < this.f7898s; i12++) {
            fullSpanItem.f7912r[i12] = this.f7899t[i12].m10360p(i11) - i11;
        }
        return fullSpanItem;
    }

    /* renamed from: Y1 */
    private void m10279Y1() {
        this.f7900u = AbstractC1928u.m10644b(this, this.f7902w);
        this.f7901v = AbstractC1928u.m10644b(this, 1 - this.f7902w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: Z1 */
    private int m10280Z1(RecyclerView.C1894u c1894u, C1922o c1922o, RecyclerView.C1899z c1899z) {
        int i11;
        int i12;
        int mo10656n;
        int m10285j2;
        boolean z11;
        C1904c c1904c;
        int m10360p;
        int mo10647e;
        int i13;
        int mo10656n2;
        int i14;
        int mo10647e2;
        int mo10651i;
        boolean m10305N1;
        int m10356l;
        ?? r92 = 0;
        this.f7883B.set(0, this.f7898s, true);
        if (this.f7904y.f8198i) {
            if (c1922o.f8194e == 1) {
                i12 = Integer.MAX_VALUE;
            } else {
                i12 = Integer.MIN_VALUE;
            }
        } else {
            if (c1922o.f8194e == 1) {
                i11 = c1922o.f8196g + c1922o.f8191b;
            } else {
                i11 = c1922o.f8195f - c1922o.f8191b;
            }
            i12 = i11;
        }
        m10263I2(c1922o.f8194e, i12);
        if (this.f7882A) {
            mo10656n = this.f7900u.mo10651i();
        } else {
            mo10656n = this.f7900u.mo10656n();
        }
        int i15 = mo10656n;
        boolean z12 = false;
        while (c1922o.m10614a(c1899z) && (this.f7904y.f8198i || !this.f7883B.isEmpty())) {
            View m10615b = c1922o.m10615b(c1894u);
            LayoutParams layoutParams = (LayoutParams) m10615b.getLayoutParams();
            int m9913b = layoutParams.m9913b();
            int m10328g = this.f7886E.m10328g(m9913b);
            if (m10328g == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (layoutParams.f7907f) {
                    c1904c = this.f7899t[r92];
                } else {
                    c1904c = m10289n2(c1922o);
                }
                this.f7886E.m10332n(m9913b, c1904c);
            } else {
                c1904c = this.f7899t[m10328g];
            }
            C1904c c1904c2 = c1904c;
            layoutParams.f7906e = c1904c2;
            if (c1922o.f8194e == 1) {
                m10149q(m10615b);
            } else {
                m10151r(m10615b, r92);
            }
            m10292t2(m10615b, layoutParams, r92);
            if (c1922o.f8194e == 1) {
                if (layoutParams.f7907f) {
                    m10356l = m10285j2(i15);
                } else {
                    m10356l = c1904c2.m10356l(i15);
                }
                int mo10647e3 = this.f7900u.mo10647e(m10615b) + m10356l;
                if (z11 && layoutParams.f7907f) {
                    LazySpanLookup.FullSpanItem m10277W1 = m10277W1(m10356l);
                    m10277W1.f7911q = -1;
                    m10277W1.f7910p = m9913b;
                    this.f7886E.m10322a(m10277W1);
                }
                i13 = mo10647e3;
                mo10647e = m10356l;
            } else {
                if (layoutParams.f7907f) {
                    m10360p = m10288m2(i15);
                } else {
                    m10360p = c1904c2.m10360p(i15);
                }
                mo10647e = m10360p - this.f7900u.mo10647e(m10615b);
                if (z11 && layoutParams.f7907f) {
                    LazySpanLookup.FullSpanItem m10278X1 = m10278X1(m10360p);
                    m10278X1.f7911q = 1;
                    m10278X1.f7910p = m9913b;
                    this.f7886E.m10322a(m10278X1);
                }
                i13 = m10360p;
            }
            if (layoutParams.f7907f && c1922o.f8193d == -1) {
                if (z11) {
                    this.f7894M = true;
                } else {
                    if (c1922o.f8194e == 1) {
                        m10305N1 = m10304M1();
                    } else {
                        m10305N1 = m10305N1();
                    }
                    if (!m10305N1) {
                        LazySpanLookup.FullSpanItem m10327f = this.f7886E.m10327f(m9913b);
                        if (m10327f != null) {
                            m10327f.f7913s = true;
                        }
                        this.f7894M = true;
                    }
                }
            }
            m10268O1(m10615b, layoutParams, c1922o);
            if (m10315r2() && this.f7902w == 1) {
                if (layoutParams.f7907f) {
                    mo10651i = this.f7901v.mo10651i();
                } else {
                    mo10651i = this.f7901v.mo10651i() - (((this.f7898s - 1) - c1904c2.f7936e) * this.f7903x);
                }
                mo10647e2 = mo10651i;
                i14 = mo10651i - this.f7901v.mo10647e(m10615b);
            } else {
                if (layoutParams.f7907f) {
                    mo10656n2 = this.f7901v.mo10656n();
                } else {
                    mo10656n2 = (c1904c2.f7936e * this.f7903x) + this.f7901v.mo10656n();
                }
                i14 = mo10656n2;
                mo10647e2 = this.f7901v.mo10647e(m10615b) + mo10656n2;
            }
            if (this.f7902w == 1) {
                mo10161x0(m10615b, i14, mo10647e, mo10647e2, i13);
            } else {
                mo10161x0(m10615b, mo10647e, i14, i13, mo10647e2);
            }
            if (layoutParams.f7907f) {
                m10263I2(this.f7904y.f8194e, i12);
            } else {
                m10269O2(c1904c2, this.f7904y.f8194e, i12);
            }
            m10296y2(c1894u, this.f7904y);
            if (this.f7904y.f8197h && m10615b.hasFocusable()) {
                if (layoutParams.f7907f) {
                    this.f7883B.clear();
                } else {
                    this.f7883B.set(c1904c2.f7936e, false);
                    z12 = true;
                    r92 = 0;
                }
            }
            z12 = true;
            r92 = 0;
        }
        if (!z12) {
            m10296y2(c1894u, this.f7904y);
        }
        if (this.f7904y.f8194e == -1) {
            m10285j2 = this.f7900u.mo10656n() - m10288m2(this.f7900u.mo10656n());
        } else {
            m10285j2 = m10285j2(this.f7900u.mo10651i()) - this.f7900u.mo10651i();
        }
        if (m10285j2 > 0) {
            return Math.min(c1922o.f8191b, m10285j2);
        }
        return 0;
    }

    /* renamed from: a2 */
    private int m10281a2(int i11) {
        int m10110a = m10110a();
        for (int i12 = 0; i12 < m10110a; i12++) {
            int m10112b = m10112b(m10105V(i12));
            if (m10112b >= 0 && m10112b < i11) {
                return m10112b;
            }
        }
        return 0;
    }

    /* renamed from: e2 */
    private int m10282e2(int i11) {
        for (int m10110a = m10110a() - 1; m10110a >= 0; m10110a--) {
            int m10112b = m10112b(m10105V(m10110a));
            if (m10112b >= 0 && m10112b < i11) {
                return m10112b;
            }
        }
        return 0;
    }

    /* renamed from: f2 */
    private void m10283f2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, boolean z11) {
        int mo10651i;
        int m10285j2 = m10285j2(Integer.MIN_VALUE);
        if (m10285j2 != Integer.MIN_VALUE && (mo10651i = this.f7900u.mo10651i() - m10285j2) > 0) {
            int i11 = mo10651i - (-m10298D2(-mo10651i, c1894u, c1899z));
            if (z11 && i11 > 0) {
                this.f7900u.mo10661s(i11);
            }
        }
    }

    /* renamed from: g2 */
    private void m10284g2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, boolean z11) {
        int mo10656n;
        int m10288m2 = m10288m2(Integer.MAX_VALUE);
        if (m10288m2 != Integer.MAX_VALUE && (mo10656n = m10288m2 - this.f7900u.mo10656n()) > 0) {
            int m10298D2 = mo10656n - m10298D2(mo10656n, c1894u, c1899z);
            if (z11 && m10298D2 > 0) {
                this.f7900u.mo10661s(-m10298D2);
            }
        }
    }

    /* renamed from: j2 */
    private int m10285j2(int i11) {
        int m10356l = this.f7899t[0].m10356l(i11);
        for (int i12 = 1; i12 < this.f7898s; i12++) {
            int m10356l2 = this.f7899t[i12].m10356l(i11);
            if (m10356l2 > m10356l) {
                m10356l = m10356l2;
            }
        }
        return m10356l;
    }

    /* renamed from: k2 */
    private int m10286k2(int i11) {
        int m10360p = this.f7899t[0].m10360p(i11);
        for (int i12 = 1; i12 < this.f7898s; i12++) {
            int m10360p2 = this.f7899t[i12].m10360p(i11);
            if (m10360p2 > m10360p) {
                m10360p = m10360p2;
            }
        }
        return m10360p;
    }

    /* renamed from: l2 */
    private int m10287l2(int i11) {
        int m10356l = this.f7899t[0].m10356l(i11);
        for (int i12 = 1; i12 < this.f7898s; i12++) {
            int m10356l2 = this.f7899t[i12].m10356l(i11);
            if (m10356l2 < m10356l) {
                m10356l = m10356l2;
            }
        }
        return m10356l;
    }

    /* renamed from: m2 */
    private int m10288m2(int i11) {
        int m10360p = this.f7899t[0].m10360p(i11);
        for (int i12 = 1; i12 < this.f7898s; i12++) {
            int m10360p2 = this.f7899t[i12].m10360p(i11);
            if (m10360p2 < m10360p) {
                m10360p = m10360p2;
            }
        }
        return m10360p;
    }

    /* renamed from: n2 */
    private C1904c m10289n2(C1922o c1922o) {
        int i11;
        int i12;
        int i13;
        if (m10294v2(c1922o.f8194e)) {
            i12 = this.f7898s - 1;
            i11 = -1;
            i13 = -1;
        } else {
            i11 = this.f7898s;
            i12 = 0;
            i13 = 1;
        }
        C1904c c1904c = null;
        if (c1922o.f8194e == 1) {
            int mo10656n = this.f7900u.mo10656n();
            int i14 = Integer.MAX_VALUE;
            while (i12 != i11) {
                C1904c c1904c2 = this.f7899t[i12];
                int m10356l = c1904c2.m10356l(mo10656n);
                if (m10356l < i14) {
                    c1904c = c1904c2;
                    i14 = m10356l;
                }
                i12 += i13;
            }
            return c1904c;
        }
        int mo10651i = this.f7900u.mo10651i();
        int i15 = Integer.MIN_VALUE;
        while (i12 != i11) {
            C1904c c1904c3 = this.f7899t[i12];
            int m10360p = c1904c3.m10360p(mo10651i);
            if (m10360p > i15) {
                c1904c = c1904c3;
                i15 = m10360p;
            }
            i12 += i13;
        }
        return c1904c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* renamed from: o2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m10290o2(int i11, int i12, int i13) {
        int m10311h2;
        int i14;
        int i15;
        int m10312i2;
        if (this.f7882A) {
            m10311h2 = m10312i2();
        } else {
            m10311h2 = m10311h2();
        }
        if (i13 == 8) {
            if (i11 < i12) {
                i14 = i12 + 1;
            } else {
                i14 = i11 + 1;
                i15 = i12;
                this.f7886E.m10329h(i15);
                if (i13 == 1) {
                    if (i13 != 2) {
                        if (i13 == 8) {
                            this.f7886E.m10331k(i11, 1);
                            this.f7886E.m10330j(i12, 1);
                        }
                    } else {
                        this.f7886E.m10331k(i11, i12);
                    }
                } else {
                    this.f7886E.m10330j(i11, i12);
                }
                if (i14 > m10311h2) {
                    return;
                }
                if (this.f7882A) {
                    m10312i2 = m10311h2();
                } else {
                    m10312i2 = m10312i2();
                }
                if (i15 <= m10312i2) {
                    m10152r1();
                    return;
                }
                return;
            }
        } else {
            i14 = i11 + i12;
        }
        i15 = i11;
        this.f7886E.m10329h(i15);
        if (i13 == 1) {
        }
        if (i14 > m10311h2) {
        }
    }

    /* renamed from: s2 */
    private void m10291s2(View view, int i11, int i12, boolean z11) {
        boolean m10086D1;
        m10159w(view, this.f7892K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f7892K;
        int m10271P2 = m10271P2(i11, i13 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f7892K;
        int m10271P22 = m10271P2(i12, i14 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z11) {
            m10086D1 = m10089F1(view, m10271P2, m10271P22, layoutParams);
        } else {
            m10086D1 = m10086D1(view, m10271P2, m10271P22, layoutParams);
        }
        if (m10086D1) {
            view.measure(m10271P2, m10271P22);
        }
    }

    /* renamed from: t2 */
    private void m10292t2(View view, LayoutParams layoutParams, boolean z11) {
        if (layoutParams.f7907f) {
            if (this.f7902w == 1) {
                m10291s2(view, this.f7891J, RecyclerView.AbstractC1888o.m10073W(getHeight(), m10114c0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z11);
                return;
            } else {
                m10291s2(view, RecyclerView.AbstractC1888o.m10073W(getWidth(), m10141n0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f7891J, z11);
                return;
            }
        }
        if (this.f7902w == 1) {
            m10291s2(view, RecyclerView.AbstractC1888o.m10073W(this.f7903x, m10141n0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.AbstractC1888o.m10073W(getHeight(), m10114c0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z11);
        } else {
            m10291s2(view, RecyclerView.AbstractC1888o.m10073W(getWidth(), m10141n0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.AbstractC1888o.m10073W(this.f7903x, m10114c0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:            if (m10307Q1() != false) goto L87;     */
    /* renamed from: u2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m10293u2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, boolean z11) {
        boolean z12;
        SavedState savedState;
        C1903b c1903b = this.f7893L;
        if ((this.f7890I != null || this.f7884C != -1) && c1899z.m10253b() == 0) {
            m10129i1(c1894u);
            c1903b.m10343c();
            return;
        }
        boolean z13 = true;
        if (c1903b.f7929e && this.f7884C == -1 && this.f7890I == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            c1903b.m10343c();
            if (this.f7890I != null) {
                m10266L1(c1903b);
            } else {
                m10261C2();
                c1903b.f7927c = this.f7882A;
            }
            m10303L2(c1899z, c1903b);
            c1903b.f7929e = true;
        }
        if (this.f7890I == null && this.f7884C == -1 && (c1903b.f7927c != this.f7888G || m10315r2() != this.f7889H)) {
            this.f7886E.m10323b();
            c1903b.f7928d = true;
        }
        if (m10110a() > 0 && ((savedState = this.f7890I) == null || savedState.f7916r < 1)) {
            if (c1903b.f7928d) {
                for (int i11 = 0; i11 < this.f7898s; i11++) {
                    this.f7899t[i11].m10349e();
                    int i12 = c1903b.f7926b;
                    if (i12 != Integer.MIN_VALUE) {
                        this.f7899t[i11].m10366v(i12);
                    }
                }
            } else if (!z12 && this.f7893L.f7930f != null) {
                for (int i13 = 0; i13 < this.f7898s; i13++) {
                    C1904c c1904c = this.f7899t[i13];
                    c1904c.m10349e();
                    c1904c.m10366v(this.f7893L.f7930f[i13]);
                }
            } else {
                for (int i14 = 0; i14 < this.f7898s; i14++) {
                    this.f7899t[i14].m10346b(this.f7882A, c1903b.f7926b);
                }
                this.f7893L.m10344d(this.f7899t);
            }
        }
        m10092J(c1894u);
        this.f7904y.f8190a = false;
        this.f7894M = false;
        m10306N2(this.f7901v.mo10657o());
        m10267M2(c1903b.f7925a, c1899z);
        if (c1903b.f7927c) {
            m10262E2(-1);
            m10280Z1(c1894u, this.f7904y, c1899z);
            m10262E2(1);
            C1922o c1922o = this.f7904y;
            c1922o.f8192c = c1903b.f7925a + c1922o.f8193d;
            m10280Z1(c1894u, c1922o, c1899z);
        } else {
            m10262E2(1);
            m10280Z1(c1894u, this.f7904y, c1899z);
            m10262E2(-1);
            C1922o c1922o2 = this.f7904y;
            c1922o2.f8192c = c1903b.f7925a + c1922o2.f8193d;
            m10280Z1(c1894u, c1922o2, c1899z);
        }
        m10260B2();
        if (m10110a() > 0) {
            if (this.f7882A) {
                m10283f2(c1894u, c1899z, true);
                m10284g2(c1894u, c1899z, false);
            } else {
                m10284g2(c1894u, c1899z, true);
                m10283f2(c1894u, c1899z, false);
            }
        }
        if (z11 && !c1899z.m10256e() && this.f7887F != 0 && m10110a() > 0 && (this.f7894M || m10313p2() != null)) {
            m10139m1(this.f7897P);
        }
        z13 = false;
        if (c1899z.m10256e()) {
            this.f7893L.m10343c();
        }
        this.f7888G = c1903b.f7927c;
        this.f7889H = m10315r2();
        if (z13) {
            this.f7893L.m10343c();
            m10293u2(c1894u, c1899z, false);
        }
    }

    /* renamed from: v2 */
    private boolean m10294v2(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f7902w == 0) {
            if (i11 == -1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 == this.f7882A) {
                return false;
            }
            return true;
        }
        if (i11 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == this.f7882A) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 != m10315r2()) {
            return false;
        }
        return true;
    }

    /* renamed from: x2 */
    private void m10295x2(View view) {
        for (int i11 = this.f7898s - 1; i11 >= 0; i11--) {
            this.f7899t[i11].m10365u(view);
        }
    }

    /* renamed from: y2 */
    private void m10296y2(RecyclerView.C1894u c1894u, C1922o c1922o) {
        int min;
        int min2;
        if (c1922o.f8190a && !c1922o.f8198i) {
            if (c1922o.f8191b == 0) {
                if (c1922o.f8194e == -1) {
                    m10297z2(c1894u, c1922o.f8196g);
                    return;
                } else {
                    m10259A2(c1894u, c1922o.f8195f);
                    return;
                }
            }
            if (c1922o.f8194e == -1) {
                int i11 = c1922o.f8195f;
                int m10286k2 = i11 - m10286k2(i11);
                if (m10286k2 < 0) {
                    min2 = c1922o.f8196g;
                } else {
                    min2 = c1922o.f8196g - Math.min(m10286k2, c1922o.f8191b);
                }
                m10297z2(c1894u, min2);
                return;
            }
            int m10287l2 = m10287l2(c1922o.f8196g) - c1922o.f8196g;
            if (m10287l2 < 0) {
                min = c1922o.f8195f;
            } else {
                min = Math.min(m10287l2, c1922o.f8191b) + c1922o.f8195f;
            }
            m10259A2(c1894u, min);
        }
    }

    /* renamed from: z2 */
    private void m10297z2(RecyclerView.C1894u c1894u, int i11) {
        for (int m10110a = m10110a() - 1; m10110a >= 0; m10110a--) {
            View m10105V = m10105V(m10110a);
            if (this.f7900u.mo10649g(m10105V) >= i11 && this.f7900u.mo10660r(m10105V) >= i11) {
                LayoutParams layoutParams = (LayoutParams) m10105V.getLayoutParams();
                if (layoutParams.f7907f) {
                    for (int i12 = 0; i12 < this.f7898s; i12++) {
                        if (this.f7899t[i12].f7932a.size() == 1) {
                            return;
                        }
                    }
                    for (int i13 = 0; i13 < this.f7898s; i13++) {
                        this.f7899t[i13].m10363s();
                    }
                } else if (layoutParams.f7906e.f7932a.size() == 1) {
                    return;
                } else {
                    layoutParams.f7906e.m10363s();
                }
                m10134k1(m10105V, c1894u);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: A0 */
    public void mo10080A0(int i11) {
        super.mo10080A0(i11);
        for (int i12 = 0; i12 < this.f7898s; i12++) {
            this.f7899t[i12].m10362r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: A1 */
    public void mo9647A1(Rect rect, int i11, int i12) {
        int m10071A;
        int m10071A2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f7902w == 1) {
            m10071A2 = RecyclerView.AbstractC1888o.m10071A(i12, rect.height() + paddingTop, m10122f0());
            m10071A = RecyclerView.AbstractC1888o.m10071A(i11, (this.f7903x * this.f7898s) + paddingLeft, m10124g0());
        } else {
            m10071A = RecyclerView.AbstractC1888o.m10071A(i11, rect.width() + paddingLeft, m10124g0());
            m10071A2 = RecyclerView.AbstractC1888o.m10071A(i12, (this.f7903x * this.f7898s) + paddingTop, m10122f0());
        }
        m10166z1(m10071A, m10071A2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: B */
    public void mo9720B(int i11, int i12, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1888o.c cVar) {
        int m10356l;
        int i13;
        if (this.f7902w != 0) {
            i11 = i12;
        }
        if (m10110a() != 0 && i11 != 0) {
            m10316w2(i11, c1899z);
            int[] iArr = this.f7896O;
            if (iArr == null || iArr.length < this.f7898s) {
                this.f7896O = new int[this.f7898s];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f7898s; i15++) {
                C1922o c1922o = this.f7904y;
                if (c1922o.f8193d == -1) {
                    m10356l = c1922o.f8195f;
                    i13 = this.f7899t[i15].m10360p(m10356l);
                } else {
                    m10356l = this.f7899t[i15].m10356l(c1922o.f8196g);
                    i13 = this.f7904y.f8196g;
                }
                int i16 = m10356l - i13;
                if (i16 >= 0) {
                    this.f7896O[i14] = i16;
                    i14++;
                }
            }
            Arrays.sort(this.f7896O, 0, i14);
            for (int i17 = 0; i17 < i14 && this.f7904y.m10614a(c1899z); i17++) {
                cVar.mo10172a(this.f7904y.f8192c, this.f7896O[i17]);
                C1922o c1922o2 = this.f7904y;
                c1922o2.f8192c += c1922o2.f8193d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: B0 */
    public void mo10081B0(int i11) {
        super.mo10081B0(i11);
        for (int i12 = 0; i12 < this.f7898s; i12++) {
            this.f7899t[i12].m10362r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: D */
    public int mo9724D(RecyclerView.C1899z c1899z) {
        return m10273S1(c1899z);
    }

    /* renamed from: D2 */
    int m10298D2(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (m10110a() == 0 || i11 == 0) {
            return 0;
        }
        m10316w2(i11, c1899z);
        int m10280Z1 = m10280Z1(c1894u, this.f7904y, c1899z);
        if (this.f7904y.f8191b >= m10280Z1) {
            if (i11 < 0) {
                i11 = -m10280Z1;
            } else {
                i11 = m10280Z1;
            }
        }
        this.f7900u.mo10661s(-i11);
        this.f7888G = this.f7882A;
        C1922o c1922o = this.f7904y;
        c1922o.f8191b = 0;
        m10296y2(c1894u, c1922o);
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: E */
    public int mo9648E(RecyclerView.C1899z c1899z) {
        return m10274T1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: F */
    public int mo9650F(RecyclerView.C1899z c1899z) {
        return m10275U1(c1899z);
    }

    /* renamed from: F2 */
    public void m10299F2(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo9755t(null);
        if (i11 == this.f7902w) {
            return;
        }
        this.f7902w = i11;
        AbstractC1928u abstractC1928u = this.f7900u;
        this.f7900u = this.f7901v;
        this.f7901v = abstractC1928u;
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G */
    public int mo9727G(RecyclerView.C1899z c1899z) {
        return m10273S1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G0 */
    public void mo9728G0(RecyclerView recyclerView, RecyclerView.C1894u c1894u) {
        super.mo9728G0(recyclerView, c1894u);
        m10139m1(this.f7897P);
        for (int i11 = 0; i11 < this.f7898s; i11++) {
            this.f7899t[i11].m10349e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G1 */
    public void mo9729G1(RecyclerView recyclerView, RecyclerView.C1899z c1899z, int i11) {
        C1923p c1923p = new C1923p(recyclerView.getContext());
        c1923p.m10244p(i11);
        m10090H1(c1923p);
    }

    /* renamed from: G2 */
    public void m10300G2(boolean z11) {
        mo9755t(null);
        SavedState savedState = this.f7890I;
        if (savedState != null && savedState.f7921w != z11) {
            savedState.f7921w = z11;
        }
        this.f7905z = z11;
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: H */
    public int mo9651H(RecyclerView.C1899z c1899z) {
        return m10274T1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: H0 */
    public View mo9652H0(View view, int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        View m10100O;
        int m10311h2;
        boolean z11;
        boolean z12;
        int m10351g;
        int m10351g2;
        int m10351g3;
        View m10357m;
        if (m10110a() == 0 || (m10100O = m10100O(view)) == null) {
            return null;
        }
        m10261C2();
        int m10276V1 = m10276V1(i11);
        if (m10276V1 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) m10100O.getLayoutParams();
        boolean z13 = layoutParams.f7907f;
        C1904c c1904c = layoutParams.f7906e;
        if (m10276V1 == 1) {
            m10311h2 = m10312i2();
        } else {
            m10311h2 = m10311h2();
        }
        m10267M2(m10311h2, c1899z);
        m10262E2(m10276V1);
        C1922o c1922o = this.f7904y;
        c1922o.f8192c = c1922o.f8193d + m10311h2;
        c1922o.f8191b = (int) (this.f7900u.mo10657o() * 0.33333334f);
        C1922o c1922o2 = this.f7904y;
        c1922o2.f8197h = true;
        c1922o2.f8190a = false;
        m10280Z1(c1894u, c1922o2, c1899z);
        this.f7888G = this.f7882A;
        if (!z13 && (m10357m = c1904c.m10357m(m10311h2, m10276V1)) != null && m10357m != m10100O) {
            return m10357m;
        }
        if (m10294v2(m10276V1)) {
            for (int i12 = this.f7898s - 1; i12 >= 0; i12--) {
                View m10357m2 = this.f7899t[i12].m10357m(m10311h2, m10276V1);
                if (m10357m2 != null && m10357m2 != m10100O) {
                    return m10357m2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f7898s; i13++) {
                View m10357m3 = this.f7899t[i13].m10357m(m10311h2, m10276V1);
                if (m10357m3 != null && m10357m3 != m10100O) {
                    return m10357m3;
                }
            }
        }
        boolean z14 = !this.f7905z;
        if (m10276V1 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z14 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z13) {
            if (z12) {
                m10351g3 = c1904c.m10350f();
            } else {
                m10351g3 = c1904c.m10351g();
            }
            View mo9732P = mo9732P(m10351g3);
            if (mo9732P != null && mo9732P != m10100O) {
                return mo9732P;
            }
        }
        if (m10294v2(m10276V1)) {
            for (int i14 = this.f7898s - 1; i14 >= 0; i14--) {
                if (i14 != c1904c.f7936e) {
                    if (z12) {
                        m10351g2 = this.f7899t[i14].m10350f();
                    } else {
                        m10351g2 = this.f7899t[i14].m10351g();
                    }
                    View mo9732P2 = mo9732P(m10351g2);
                    if (mo9732P2 != null && mo9732P2 != m10100O) {
                        return mo9732P2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f7898s; i15++) {
                if (z12) {
                    m10351g = this.f7899t[i15].m10350f();
                } else {
                    m10351g = this.f7899t[i15].m10351g();
                }
                View mo9732P3 = mo9732P(m10351g);
                if (mo9732P3 != null && mo9732P3 != m10100O) {
                    return mo9732P3;
                }
            }
        }
        return null;
    }

    /* renamed from: H2 */
    public void m10301H2(int i11) {
        mo9755t(null);
        if (i11 != this.f7898s) {
            m10314q2();
            this.f7898s = i11;
            this.f7883B = new BitSet(this.f7898s);
            this.f7899t = new C1904c[this.f7898s];
            for (int i12 = 0; i12 < this.f7898s; i12++) {
                this.f7899t[i12] = new C1904c(i12);
            }
            m10152r1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: I */
    public int mo9653I(RecyclerView.C1899z c1899z) {
        return m10275U1(c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: I0 */
    public void mo9730I0(AccessibilityEvent accessibilityEvent) {
        super.mo9730I0(accessibilityEvent);
        if (m10110a() > 0) {
            View m10309c2 = m10309c2(false);
            View m10308b2 = m10308b2(false);
            if (m10309c2 != null && m10308b2 != null) {
                int m10112b = m10112b(m10309c2);
                int m10112b2 = m10112b(m10308b2);
                if (m10112b < m10112b2) {
                    accessibilityEvent.setFromIndex(m10112b);
                    accessibilityEvent.setToIndex(m10112b2);
                } else {
                    accessibilityEvent.setFromIndex(m10112b2);
                    accessibilityEvent.setToIndex(m10112b);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: J1 */
    public boolean mo9654J1() {
        return this.f7890I == null;
    }

    /* renamed from: K2 */
    boolean m10302K2(RecyclerView.C1899z c1899z, C1903b c1903b) {
        int i11;
        int m10311h2;
        int mo10656n;
        boolean z11 = false;
        if (!c1899z.m10256e() && (i11 = this.f7884C) != -1) {
            if (i11 >= 0 && i11 < c1899z.m10253b()) {
                SavedState savedState = this.f7890I;
                if (savedState != null && savedState.f7914p != -1 && savedState.f7916r >= 1) {
                    c1903b.f7926b = Integer.MIN_VALUE;
                    c1903b.f7925a = this.f7884C;
                } else {
                    View mo9732P = mo9732P(this.f7884C);
                    if (mo9732P != null) {
                        if (this.f7882A) {
                            m10311h2 = m10312i2();
                        } else {
                            m10311h2 = m10311h2();
                        }
                        c1903b.f7925a = m10311h2;
                        if (this.f7885D != Integer.MIN_VALUE) {
                            if (c1903b.f7927c) {
                                c1903b.f7926b = (this.f7900u.mo10651i() - this.f7885D) - this.f7900u.mo10646d(mo9732P);
                            } else {
                                c1903b.f7926b = (this.f7900u.mo10656n() + this.f7885D) - this.f7900u.mo10649g(mo9732P);
                            }
                            return true;
                        }
                        if (this.f7900u.mo10647e(mo9732P) > this.f7900u.mo10657o()) {
                            if (c1903b.f7927c) {
                                mo10656n = this.f7900u.mo10651i();
                            } else {
                                mo10656n = this.f7900u.mo10656n();
                            }
                            c1903b.f7926b = mo10656n;
                            return true;
                        }
                        int mo10649g = this.f7900u.mo10649g(mo9732P) - this.f7900u.mo10656n();
                        if (mo10649g < 0) {
                            c1903b.f7926b = -mo10649g;
                            return true;
                        }
                        int mo10651i = this.f7900u.mo10651i() - this.f7900u.mo10646d(mo9732P);
                        if (mo10651i < 0) {
                            c1903b.f7926b = mo10651i;
                            return true;
                        }
                        c1903b.f7926b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f7884C;
                        c1903b.f7925a = i12;
                        int i13 = this.f7885D;
                        if (i13 == Integer.MIN_VALUE) {
                            if (m10270P1(i12) == 1) {
                                z11 = true;
                            }
                            c1903b.f7927c = z11;
                            c1903b.m10341a();
                        } else {
                            c1903b.m10342b(i13);
                        }
                        c1903b.f7928d = true;
                    }
                }
                return true;
            }
            this.f7884C = -1;
            this.f7885D = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: L2 */
    void m10303L2(RecyclerView.C1899z c1899z, C1903b c1903b) {
        if (m10302K2(c1899z, c1903b) || m10264J2(c1899z, c1903b)) {
            return;
        }
        c1903b.m10341a();
        c1903b.f7925a = 0;
    }

    /* renamed from: M1 */
    boolean m10304M1() {
        int m10356l = this.f7899t[0].m10356l(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f7898s; i11++) {
            if (this.f7899t[i11].m10356l(Integer.MIN_VALUE) != m10356l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: N0 */
    public void mo9656N0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, View view, C1507g0 c1507g0) {
        int i11;
        int i12;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.m10098M0(view, c1507g0);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.f7902w == 0) {
            int m10317f = layoutParams2.m10317f();
            if (layoutParams2.f7907f) {
                i12 = this.f7898s;
            } else {
                i12 = 1;
            }
            c1507g0.m7623g0(C1507g0.c.m7662a(m10317f, i12, -1, -1, false, false));
            return;
        }
        int m10317f2 = layoutParams2.m10317f();
        if (layoutParams2.f7907f) {
            i11 = this.f7898s;
        } else {
            i11 = 1;
        }
        c1507g0.m7623g0(C1507g0.c.m7662a(-1, -1, m10317f2, i11, false, false));
    }

    /* renamed from: N1 */
    boolean m10305N1() {
        int m10360p = this.f7899t[0].m10360p(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f7898s; i11++) {
            if (this.f7899t[i11].m10360p(Integer.MIN_VALUE) != m10360p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N2 */
    void m10306N2(int i11) {
        this.f7903x = i11 / this.f7898s;
        this.f7891J = View.MeasureSpec.makeMeasureSpec(i11, this.f7901v.mo10654l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: P0 */
    public void mo9657P0(RecyclerView recyclerView, int i11, int i12) {
        m10290o2(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Q */
    public RecyclerView.LayoutParams mo9658Q() {
        if (this.f7902w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Q0 */
    public void mo9659Q0(RecyclerView recyclerView) {
        this.f7886E.m10323b();
        m10152r1();
    }

    /* renamed from: Q1 */
    boolean m10307Q1() {
        int m10311h2;
        int m10312i2;
        int i11;
        if (m10110a() == 0 || this.f7887F == 0 || !m10147p0()) {
            return false;
        }
        if (this.f7882A) {
            m10311h2 = m10312i2();
            m10312i2 = m10311h2();
        } else {
            m10311h2 = m10311h2();
            m10312i2 = m10312i2();
        }
        if (m10311h2 == 0 && m10313p2() != null) {
            this.f7886E.m10323b();
            m10154s1();
            m10152r1();
            return true;
        }
        if (!this.f7894M) {
            return false;
        }
        if (this.f7882A) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        int i12 = m10312i2 + 1;
        LazySpanLookup.FullSpanItem m10326e = this.f7886E.m10326e(m10311h2, i12, i11, true);
        if (m10326e == null) {
            this.f7894M = false;
            this.f7886E.m10325d(i12);
            return false;
        }
        LazySpanLookup.FullSpanItem m10326e2 = this.f7886E.m10326e(m10311h2, m10326e.f7910p, i11 * (-1), true);
        if (m10326e2 == null) {
            this.f7886E.m10325d(m10326e.f7910p);
        } else {
            this.f7886E.m10325d(m10326e2.f7910p + 1);
        }
        m10154s1();
        m10152r1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: R */
    public RecyclerView.LayoutParams mo9660R(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: R0 */
    public void mo9661R0(RecyclerView recyclerView, int i11, int i12, int i13) {
        m10290o2(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: S */
    public RecyclerView.LayoutParams mo9662S(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: S0 */
    public void mo9663S0(RecyclerView recyclerView, int i11, int i12) {
        m10290o2(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: U0 */
    public void mo9664U0(RecyclerView recyclerView, int i11, int i12, Object obj) {
        m10290o2(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: V0 */
    public void mo9665V0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        m10293u2(c1894u, c1899z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: W0 */
    public void mo9666W0(RecyclerView.C1899z c1899z) {
        super.mo9666W0(c1899z);
        this.f7884C = -1;
        this.f7885D = Integer.MIN_VALUE;
        this.f7890I = null;
        this.f7893L.m10343c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Z */
    public int mo9669Z(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7902w == 1) {
            return this.f7898s;
        }
        return super.mo9669Z(c1894u, c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: a1 */
    public void mo9742a1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7890I = (SavedState) parcelable;
            m10152r1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: b1 */
    public Parcelable mo9743b1() {
        int m10311h2;
        int m10360p;
        int mo10656n;
        int[] iArr;
        if (this.f7890I != null) {
            return new SavedState(this.f7890I);
        }
        SavedState savedState = new SavedState();
        savedState.f7921w = this.f7905z;
        savedState.f7922x = this.f7888G;
        savedState.f7923y = this.f7889H;
        LazySpanLookup lazySpanLookup = this.f7886E;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f7908a) != null) {
            savedState.f7919u = iArr;
            savedState.f7918t = iArr.length;
            savedState.f7920v = lazySpanLookup.f7909b;
        } else {
            savedState.f7918t = 0;
        }
        if (m10110a() > 0) {
            if (this.f7888G) {
                m10311h2 = m10312i2();
            } else {
                m10311h2 = m10311h2();
            }
            savedState.f7914p = m10311h2;
            savedState.f7915q = m10310d2();
            int i11 = this.f7898s;
            savedState.f7916r = i11;
            savedState.f7917s = new int[i11];
            for (int i12 = 0; i12 < this.f7898s; i12++) {
                if (this.f7888G) {
                    m10360p = this.f7899t[i12].m10356l(Integer.MIN_VALUE);
                    if (m10360p != Integer.MIN_VALUE) {
                        mo10656n = this.f7900u.mo10651i();
                        m10360p -= mo10656n;
                        savedState.f7917s[i12] = m10360p;
                    } else {
                        savedState.f7917s[i12] = m10360p;
                    }
                } else {
                    m10360p = this.f7899t[i12].m10360p(Integer.MIN_VALUE);
                    if (m10360p != Integer.MIN_VALUE) {
                        mo10656n = this.f7900u.mo10656n();
                        m10360p -= mo10656n;
                        savedState.f7917s[i12] = m10360p;
                    } else {
                        savedState.f7917s[i12] = m10360p;
                    }
                }
            }
        } else {
            savedState.f7914p = -1;
            savedState.f7915q = -1;
            savedState.f7916r = 0;
        }
        return savedState;
    }

    /* renamed from: b2 */
    View m10308b2(boolean z11) {
        int mo10656n = this.f7900u.mo10656n();
        int mo10651i = this.f7900u.mo10651i();
        View view = null;
        for (int m10110a = m10110a() - 1; m10110a >= 0; m10110a--) {
            View m10105V = m10105V(m10110a);
            int mo10649g = this.f7900u.mo10649g(m10105V);
            int mo10646d = this.f7900u.mo10646d(m10105V);
            if (mo10646d > mo10656n && mo10649g < mo10651i) {
                if (mo10646d > mo10651i && z11) {
                    if (view == null) {
                        view = m10105V;
                    }
                } else {
                    return m10105V;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: c1 */
    public void mo10115c1(int i11) {
        if (i11 == 0) {
            m10307Q1();
        }
    }

    /* renamed from: c2 */
    View m10309c2(boolean z11) {
        int mo10656n = this.f7900u.mo10656n();
        int mo10651i = this.f7900u.mo10651i();
        int m10110a = m10110a();
        View view = null;
        for (int i11 = 0; i11 < m10110a; i11++) {
            View m10105V = m10105V(i11);
            int mo10649g = this.f7900u.mo10649g(m10105V);
            if (this.f7900u.mo10646d(m10105V) > mo10656n && mo10649g < mo10651i) {
                if (mo10649g < mo10656n && z11) {
                    if (view == null) {
                        view = m10105V;
                    }
                } else {
                    return m10105V;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y.b
    /* renamed from: d */
    public PointF mo9746d(int i11) {
        int m10270P1 = m10270P1(i11);
        PointF pointF = new PointF();
        if (m10270P1 == 0) {
            return null;
        }
        if (this.f7902w == 0) {
            pointF.x = m10270P1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m10270P1;
        }
        return pointF;
    }

    /* renamed from: d2 */
    int m10310d2() {
        View m10309c2;
        if (this.f7882A) {
            m10309c2 = m10308b2(true);
        } else {
            m10309c2 = m10309c2(true);
        }
        if (m10309c2 == null) {
            return -1;
        }
        return m10112b(m10309c2);
    }

    /* renamed from: h2 */
    int m10311h2() {
        if (m10110a() == 0) {
            return 0;
        }
        return m10112b(m10105V(0));
    }

    /* renamed from: i2 */
    int m10312i2() {
        int m10110a = m10110a();
        if (m10110a == 0) {
            return 0;
        }
        return m10112b(m10105V(m10110a - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: j0 */
    public int mo9673j0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7902w == 0) {
            return this.f7898s;
        }
        return super.mo9673j0(c1894u, c1899z);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* renamed from: p2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View m10313p2() {
        char c11;
        int i11;
        boolean z11;
        boolean z12;
        int m10110a = m10110a();
        int i12 = m10110a - 1;
        BitSet bitSet = new BitSet(this.f7898s);
        bitSet.set(0, this.f7898s, true);
        int i13 = -1;
        if (this.f7902w == 1 && m10315r2()) {
            c11 = 1;
        } else {
            c11 = 65535;
        }
        if (this.f7882A) {
            m10110a = -1;
        } else {
            i12 = 0;
        }
        if (i12 < m10110a) {
            i13 = 1;
        }
        while (i12 != m10110a) {
            View m10105V = m10105V(i12);
            LayoutParams layoutParams = (LayoutParams) m10105V.getLayoutParams();
            if (bitSet.get(layoutParams.f7906e.f7936e)) {
                if (m10272R1(layoutParams.f7906e)) {
                    return m10105V;
                }
                bitSet.clear(layoutParams.f7906e.f7936e);
            }
            if (!layoutParams.f7907f && (i11 = i12 + i13) != m10110a) {
                View m10105V2 = m10105V(i11);
                if (this.f7882A) {
                    int mo10646d = this.f7900u.mo10646d(m10105V);
                    int mo10646d2 = this.f7900u.mo10646d(m10105V2);
                    if (mo10646d < mo10646d2) {
                        return m10105V;
                    }
                    if (mo10646d != mo10646d2) {
                        continue;
                    }
                    if (layoutParams.f7906e.f7936e - ((LayoutParams) m10105V2.getLayoutParams()).f7906e.f7936e >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c11 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 == z12) {
                        return m10105V;
                    }
                } else {
                    int mo10649g = this.f7900u.mo10649g(m10105V);
                    int mo10649g2 = this.f7900u.mo10649g(m10105V2);
                    if (mo10649g > mo10649g2) {
                        return m10105V;
                    }
                    if (mo10649g != mo10649g2) {
                        continue;
                    }
                    if (layoutParams.f7906e.f7936e - ((LayoutParams) m10105V2.getLayoutParams()).f7906e.f7936e >= 0) {
                    }
                    if (c11 >= 0) {
                    }
                    if (z11 == z12) {
                    }
                }
            }
            i12 += i13;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: q0 */
    public boolean mo9753q0() {
        return this.f7887F != 0;
    }

    /* renamed from: q2 */
    public void m10314q2() {
        this.f7886E.m10323b();
        m10152r1();
    }

    /* renamed from: r2 */
    boolean m10315r2() {
        if (m10116d0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: t */
    public void mo9755t(String str) {
        if (this.f7890I == null) {
            super.mo9755t(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: u1 */
    public int mo9676u1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        return m10298D2(i11, c1894u, c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: v1 */
    public void mo9756v1(int i11) {
        SavedState savedState = this.f7890I;
        if (savedState != null && savedState.f7914p != i11) {
            savedState.m10337a();
        }
        this.f7884C = i11;
        this.f7885D = Integer.MIN_VALUE;
        m10152r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: w1 */
    public int mo9677w1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        return m10298D2(i11, c1894u, c1899z);
    }

    /* renamed from: w2 */
    void m10316w2(int i11, RecyclerView.C1899z c1899z) {
        int m10311h2;
        int i12;
        if (i11 > 0) {
            m10311h2 = m10312i2();
            i12 = 1;
        } else {
            m10311h2 = m10311h2();
            i12 = -1;
        }
        this.f7904y.f8190a = true;
        m10267M2(m10311h2, c1899z);
        m10262E2(i12);
        C1922o c1922o = this.f7904y;
        c1922o.f8192c = m10311h2 + c1922o.f8193d;
        c1922o.f8191b = Math.abs(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: x */
    public boolean mo9757x() {
        return this.f7902w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: y */
    public boolean mo9758y() {
        return this.f7902w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: z */
    public boolean mo9678z(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class LazySpanLookup {

        /* renamed from: a */
        int[] f7908a;

        /* renamed from: b */
        List f7909b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m10319i(int i11) {
            if (this.f7909b == null) {
                return -1;
            }
            FullSpanItem m10327f = m10327f(i11);
            if (m10327f != null) {
                this.f7909b.remove(m10327f);
            }
            int size = this.f7909b.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    if (((FullSpanItem) this.f7909b.get(i12)).f7910p >= i11) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f7909b.get(i12);
            this.f7909b.remove(i12);
            return fullSpanItem.f7910p;
        }

        /* renamed from: l */
        private void m10320l(int i11, int i12) {
            List list = this.f7909b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f7909b.get(size);
                int i13 = fullSpanItem.f7910p;
                if (i13 >= i11) {
                    fullSpanItem.f7910p = i13 + i12;
                }
            }
        }

        /* renamed from: m */
        private void m10321m(int i11, int i12) {
            List list = this.f7909b;
            if (list == null) {
                return;
            }
            int i13 = i11 + i12;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f7909b.get(size);
                int i14 = fullSpanItem.f7910p;
                if (i14 >= i11) {
                    if (i14 < i13) {
                        this.f7909b.remove(size);
                    } else {
                        fullSpanItem.f7910p = i14 - i12;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m10322a(FullSpanItem fullSpanItem) {
            if (this.f7909b == null) {
                this.f7909b = new ArrayList();
            }
            int size = this.f7909b.size();
            for (int i11 = 0; i11 < size; i11++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f7909b.get(i11);
                if (fullSpanItem2.f7910p == fullSpanItem.f7910p) {
                    this.f7909b.remove(i11);
                }
                if (fullSpanItem2.f7910p >= fullSpanItem.f7910p) {
                    this.f7909b.add(i11, fullSpanItem);
                    return;
                }
            }
            this.f7909b.add(fullSpanItem);
        }

        /* renamed from: b */
        void m10323b() {
            int[] iArr = this.f7908a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f7909b = null;
        }

        /* renamed from: c */
        void m10324c(int i11) {
            int[] iArr = this.f7908a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i11, 10) + 1];
                this.f7908a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[m10333o(i11)];
                this.f7908a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f7908a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m10325d(int i11) {
            List list = this.f7909b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f7909b.get(size)).f7910p >= i11) {
                        this.f7909b.remove(size);
                    }
                }
            }
            return m10329h(i11);
        }

        /* renamed from: e */
        public FullSpanItem m10326e(int i11, int i12, int i13, boolean z11) {
            List list = this.f7909b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f7909b.get(i14);
                int i15 = fullSpanItem.f7910p;
                if (i15 >= i12) {
                    return null;
                }
                if (i15 >= i11 && (i13 == 0 || fullSpanItem.f7911q == i13 || (z11 && fullSpanItem.f7913s))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m10327f(int i11) {
            List list = this.f7909b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f7909b.get(size);
                if (fullSpanItem.f7910p == i11) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m10328g(int i11) {
            int[] iArr = this.f7908a;
            if (iArr != null && i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        /* renamed from: h */
        int m10329h(int i11) {
            int[] iArr = this.f7908a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            int m10319i = m10319i(i11);
            if (m10319i == -1) {
                int[] iArr2 = this.f7908a;
                Arrays.fill(iArr2, i11, iArr2.length, -1);
                return this.f7908a.length;
            }
            int i12 = m10319i + 1;
            Arrays.fill(this.f7908a, i11, i12, -1);
            return i12;
        }

        /* renamed from: j */
        void m10330j(int i11, int i12) {
            int[] iArr = this.f7908a;
            if (iArr != null && i11 < iArr.length) {
                int i13 = i11 + i12;
                m10324c(i13);
                int[] iArr2 = this.f7908a;
                System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
                Arrays.fill(this.f7908a, i11, i13, -1);
                m10320l(i11, i12);
            }
        }

        /* renamed from: k */
        void m10331k(int i11, int i12) {
            int[] iArr = this.f7908a;
            if (iArr != null && i11 < iArr.length) {
                int i13 = i11 + i12;
                m10324c(i13);
                int[] iArr2 = this.f7908a;
                System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
                int[] iArr3 = this.f7908a;
                Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
                m10321m(i11, i12);
            }
        }

        /* renamed from: n */
        void m10332n(int i11, C1904c c1904c) {
            m10324c(i11);
            this.f7908a[i11] = c1904c.f7936e;
        }

        /* renamed from: o */
        int m10333o(int i11) {
            int length = this.f7908a.length;
            while (length <= i11) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes2.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1900a();

            /* renamed from: p */
            int f7910p;

            /* renamed from: q */
            int f7911q;

            /* renamed from: r */
            int[] f7912r;

            /* renamed from: s */
            boolean f7913s;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            /* loaded from: classes2.dex */
            static class C1900a implements Parcelable.Creator {
                C1900a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i11) {
                    return new FullSpanItem[i11];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f7910p = parcel.readInt();
                this.f7911q = parcel.readInt();
                this.f7913s = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f7912r = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m10334a(int i11) {
                int[] iArr = this.f7912r;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i11];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f7910p + ", mGapDir=" + this.f7911q + ", mHasUnwantedGapAfter=" + this.f7913s + ", mGapPerSpan=" + Arrays.toString(this.f7912r) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.f7910p);
                parcel.writeInt(this.f7911q);
                parcel.writeInt(this.f7913s ? 1 : 0);
                int[] iArr = this.f7912r;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f7912r);
                } else {
                    parcel.writeInt(0);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
