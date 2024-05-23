package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C1507g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f7625I;

    /* renamed from: J */
    int f7626J;

    /* renamed from: K */
    int[] f7627K;

    /* renamed from: L */
    View[] f7628L;

    /* renamed from: M */
    final SparseIntArray f7629M;

    /* renamed from: N */
    final SparseIntArray f7630N;

    /* renamed from: O */
    AbstractC1865b f7631O;

    /* renamed from: P */
    final Rect f7632P;

    /* renamed from: Q */
    private boolean f7633Q;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        int f7634e;

        /* renamed from: f */
        int f7635f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7634e = -1;
            this.f7635f = 0;
        }

        /* renamed from: f */
        public int m9679f() {
            return this.f7634e;
        }

        /* renamed from: g */
        public int m9680g() {
            return this.f7635f;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f7634e = -1;
            this.f7635f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7634e = -1;
            this.f7635f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7634e = -1;
            this.f7635f = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes2.dex */
    public static final class C1864a extends AbstractC1865b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: e */
        public int mo9681e(int i11, int i12) {
            return i11 % i12;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1865b {

        /* renamed from: a */
        final SparseIntArray f7636a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f7637b = new SparseIntArray();

        /* renamed from: c */
        private boolean f7638c = false;

        /* renamed from: d */
        private boolean f7639d = false;

        /* renamed from: a */
        static int m9683a(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 >= 0 && i14 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i14);
            }
            return -1;
        }

        /* renamed from: b */
        int m9684b(int i11, int i12) {
            if (!this.f7639d) {
                return m9686d(i11, i12);
            }
            int i13 = this.f7637b.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int m9686d = m9686d(i11, i12);
            this.f7637b.put(i11, m9686d);
            return m9686d;
        }

        /* renamed from: c */
        int m9685c(int i11, int i12) {
            if (!this.f7638c) {
                return mo9681e(i11, i12);
            }
            int i13 = this.f7636a.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int mo9681e = mo9681e(i11, i12);
            this.f7636a.put(i11, mo9681e);
            return mo9681e;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m9686d(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int mo9682f;
            int m9683a;
            if (this.f7639d && (m9683a = m9683a(this.f7637b, i11)) != -1) {
                i13 = this.f7637b.get(m9683a);
                i14 = m9683a + 1;
                i15 = m9685c(m9683a, i12) + mo9682f(m9683a);
                if (i15 == i12) {
                    i13++;
                }
                mo9682f = mo9682f(i11);
                while (i14 < i11) {
                    int mo9682f2 = mo9682f(i14);
                    i15 += mo9682f2;
                    if (i15 == i12) {
                        i13++;
                        i15 = 0;
                    } else if (i15 > i12) {
                        i13++;
                        i15 = mo9682f2;
                    }
                    i14++;
                }
                if (i15 + mo9682f <= i12) {
                    return i13 + 1;
                }
                return i13;
            }
            i13 = 0;
            i14 = 0;
            i15 = 0;
            mo9682f = mo9682f(i11);
            while (i14 < i11) {
            }
            if (i15 + mo9682f <= i12) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo9681e(int i11, int i12) {
            int i13;
            int i14;
            int mo9682f = mo9682f(i11);
            if (mo9682f == i12) {
                return 0;
            }
            if (this.f7638c && (i13 = m9683a(this.f7636a, i11)) >= 0) {
                i14 = this.f7636a.get(i13) + mo9682f(i13);
                i13++;
                if (i13 >= i11) {
                }
            } else {
                i13 = 0;
                i14 = 0;
                if (i13 >= i11) {
                    int mo9682f2 = mo9682f(i13);
                    i14 += mo9682f2;
                    if (i14 == i12) {
                        i14 = 0;
                    } else if (i14 > i12) {
                        i14 = mo9682f2;
                    }
                    i13++;
                    if (i13 >= i11) {
                        if (mo9682f + i14 > i12) {
                            return 0;
                        }
                        return i14;
                    }
                }
            }
        }

        /* renamed from: f */
        public abstract int mo9682f(int i11);

        /* renamed from: g */
        public void m9687g() {
            this.f7637b.clear();
        }

        /* renamed from: h */
        public void m9688h() {
            this.f7636a.clear();
        }

        /* renamed from: i */
        public void m9689i(boolean z11) {
            if (!z11) {
                this.f7637b.clear();
            }
            this.f7638c = z11;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f7625I = false;
        this.f7626J = -1;
        this.f7629M = new SparseIntArray();
        this.f7630N = new SparseIntArray();
        this.f7631O = new C1864a();
        this.f7632P = new Rect();
        m9670e3(RecyclerView.AbstractC1888o.m10075h0(context, attributeSet, i11, i12).f7832b);
    }

    /* renamed from: N2 */
    private void m9631N2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (z11) {
            i13 = i11;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = i11 - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View view = this.f7628L[i12];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int m9642a3 = m9642a3(c1894u, c1899z, m10112b(view));
            layoutParams.f7635f = m9642a3;
            layoutParams.f7634e = i15;
            i15 += m9642a3;
            i12 += i14;
        }
    }

    /* renamed from: O2 */
    private void m9632O2() {
        int m10110a = m10110a();
        for (int i11 = 0; i11 < m10110a; i11++) {
            LayoutParams layoutParams = (LayoutParams) m10105V(i11).getLayoutParams();
            int m9913b = layoutParams.m9913b();
            this.f7629M.put(m9913b, layoutParams.m9680g());
            this.f7630N.put(m9913b, layoutParams.m9679f());
        }
    }

    /* renamed from: P2 */
    private void m9633P2(int i11) {
        this.f7627K = m9634Q2(this.f7627K, this.f7626J, i11);
    }

    /* renamed from: Q2 */
    static int[] m9634Q2(int[] iArr, int i11, int i12) {
        int i13;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i12) {
            iArr = new int[i11 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i12 / i11;
        int i16 = i12 % i11;
        int i17 = 0;
        for (int i18 = 1; i18 <= i11; i18++) {
            i14 += i16;
            if (i14 > 0 && i11 - i14 < i16) {
                i13 = i15 + 1;
                i14 -= i11;
            } else {
                i13 = i15;
            }
            i17 += i13;
            iArr[i18] = i17;
        }
        return iArr;
    }

    /* renamed from: R2 */
    private void m9635R2() {
        this.f7629M.clear();
        this.f7630N.clear();
    }

    /* renamed from: S2 */
    private int m9636S2(RecyclerView.C1899z c1899z) {
        int max;
        if (m10110a() != 0 && c1899z.m10253b() != 0) {
            m9735R1();
            boolean m9754q2 = m9754q2();
            View m9739X1 = m9739X1(!m9754q2, true);
            View m9738W1 = m9738W1(!m9754q2, true);
            if (m9739X1 != null && m9738W1 != null) {
                int m9684b = this.f7631O.m9684b(m10112b(m9739X1), this.f7626J);
                int m9684b2 = this.f7631O.m9684b(m10112b(m9738W1), this.f7626J);
                int min = Math.min(m9684b, m9684b2);
                int max2 = Math.max(m9684b, m9684b2);
                int m9684b3 = this.f7631O.m9684b(c1899z.m10253b() - 1, this.f7626J) + 1;
                if (this.f7653x) {
                    max = Math.max(0, (m9684b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!m9754q2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f7650u.mo10646d(m9738W1) - this.f7650u.mo10649g(m9739X1)) / ((this.f7631O.m9684b(m10112b(m9738W1), this.f7626J) - this.f7631O.m9684b(m10112b(m9739X1), this.f7626J)) + 1))) + (this.f7650u.mo10656n() - this.f7650u.mo10649g(m9739X1)));
            }
        }
        return 0;
    }

    /* renamed from: T2 */
    private int m9637T2(RecyclerView.C1899z c1899z) {
        if (m10110a() != 0 && c1899z.m10253b() != 0) {
            m9735R1();
            View m9739X1 = m9739X1(!m9754q2(), true);
            View m9738W1 = m9738W1(!m9754q2(), true);
            if (m9739X1 != null && m9738W1 != null) {
                if (!m9754q2()) {
                    return this.f7631O.m9684b(c1899z.m10253b() - 1, this.f7626J) + 1;
                }
                int mo10646d = this.f7650u.mo10646d(m9738W1) - this.f7650u.mo10649g(m9739X1);
                int m9684b = this.f7631O.m9684b(m10112b(m9739X1), this.f7626J);
                return (int) ((mo10646d / ((this.f7631O.m9684b(m10112b(m9738W1), this.f7626J) - m9684b) + 1)) * (this.f7631O.m9684b(c1899z.m10253b() - 1, this.f7626J) + 1));
            }
        }
        return 0;
    }

    /* renamed from: U2 */
    private void m9638U2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, LinearLayoutManager.C1867a c1867a, int i11) {
        boolean z11;
        if (i11 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m9641Z2 = m9641Z2(c1894u, c1899z, c1867a.f7660b);
        if (z11) {
            while (m9641Z2 > 0) {
                int i12 = c1867a.f7660b;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    c1867a.f7660b = i13;
                    m9641Z2 = m9641Z2(c1894u, c1899z, i13);
                } else {
                    return;
                }
            }
            return;
        }
        int m10253b = c1899z.m10253b() - 1;
        int i14 = c1867a.f7660b;
        while (i14 < m10253b) {
            int i15 = i14 + 1;
            int m9641Z22 = m9641Z2(c1894u, c1899z, i15);
            if (m9641Z22 <= m9641Z2) {
                break;
            }
            i14 = i15;
            m9641Z2 = m9641Z22;
        }
        c1867a.f7660b = i14;
    }

    /* renamed from: V2 */
    private void m9639V2() {
        View[] viewArr = this.f7628L;
        if (viewArr == null || viewArr.length != this.f7626J) {
            this.f7628L = new View[this.f7626J];
        }
    }

    /* renamed from: Y2 */
    private int m9640Y2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11) {
        if (!c1899z.m10256e()) {
            return this.f7631O.m9684b(i11, this.f7626J);
        }
        int m10209f = c1894u.m10209f(i11);
        if (m10209f == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot find span size for pre layout position. ");
            sb2.append(i11);
            return 0;
        }
        return this.f7631O.m9684b(m10209f, this.f7626J);
    }

    /* renamed from: Z2 */
    private int m9641Z2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11) {
        if (!c1899z.m10256e()) {
            return this.f7631O.m9685c(i11, this.f7626J);
        }
        int i12 = this.f7630N.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int m10209f = c1894u.m10209f(i11);
        if (m10209f == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb2.append(i11);
            return 0;
        }
        return this.f7631O.m9685c(m10209f, this.f7626J);
    }

    /* renamed from: a3 */
    private int m9642a3(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11) {
        if (!c1899z.m10256e()) {
            return this.f7631O.mo9682f(i11);
        }
        int i12 = this.f7629M.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int m10209f = c1894u.m10209f(i11);
        if (m10209f == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb2.append(i11);
            return 1;
        }
        return this.f7631O.mo9682f(m10209f);
    }

    /* renamed from: b3 */
    private void m9643b3(float f11, int i11) {
        m9633P2(Math.max(Math.round(f11 * this.f7626J), i11));
    }

    /* renamed from: c3 */
    private void m9644c3(View view, int i11, boolean z11) {
        int i12;
        int i13;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f7763b;
        int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int m9667W2 = m9667W2(layoutParams.f7634e, layoutParams.f7635f);
        if (this.f7648s == 1) {
            i13 = RecyclerView.AbstractC1888o.m10073W(m9667W2, i11, i15, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i12 = RecyclerView.AbstractC1888o.m10073W(this.f7650u.mo10657o(), m10114c0(), i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int m10073W = RecyclerView.AbstractC1888o.m10073W(m9667W2, i11, i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int m10073W2 = RecyclerView.AbstractC1888o.m10073W(this.f7650u.mo10657o(), m10141n0(), i15, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i12 = m10073W;
            i13 = m10073W2;
        }
        m9645d3(view, i13, i12, z11);
    }

    /* renamed from: d3 */
    private void m9645d3(View view, int i11, int i12, boolean z11) {
        boolean m10086D1;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z11) {
            m10086D1 = m10089F1(view, i11, i12, layoutParams);
        } else {
            m10086D1 = m10086D1(view, i11, i12, layoutParams);
        }
        if (m10086D1) {
            view.measure(i11, i12);
        }
    }

    /* renamed from: g3 */
    private void m9646g3() {
        int height;
        int paddingTop;
        if (m9750h() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m9633P2(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: A1 */
    public void mo9647A1(Rect rect, int i11, int i12) {
        int m10071A;
        int m10071A2;
        if (this.f7627K == null) {
            super.mo9647A1(rect, i11, i12);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f7648s == 1) {
            m10071A2 = RecyclerView.AbstractC1888o.m10071A(i12, rect.height() + paddingTop, m10122f0());
            int[] iArr = this.f7627K;
            m10071A = RecyclerView.AbstractC1888o.m10071A(i11, iArr[iArr.length - 1] + paddingLeft, m10124g0());
        } else {
            m10071A = RecyclerView.AbstractC1888o.m10071A(i11, rect.width() + paddingLeft, m10124g0());
            int[] iArr2 = this.f7627K;
            m10071A2 = RecyclerView.AbstractC1888o.m10071A(i12, iArr2[iArr2.length - 1] + paddingTop, m10122f0());
        }
        m10166z1(m10071A, m10071A2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: E */
    public int mo9648E(RecyclerView.C1899z c1899z) {
        if (this.f7633Q) {
            return m9636S2(c1899z);
        }
        return super.mo9648E(c1899z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E2 */
    public void mo9649E2(boolean z11) {
        if (!z11) {
            super.mo9649E2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: F */
    public int mo9650F(RecyclerView.C1899z c1899z) {
        if (this.f7633Q) {
            return m9637T2(c1899z);
        }
        return super.mo9650F(c1899z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: H */
    public int mo9651H(RecyclerView.C1899z c1899z) {
        if (this.f7633Q) {
            return m9636S2(c1899z);
        }
        return super.mo9651H(c1899z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:            if (r13 == r7) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:            if (r13 == r10) goto L159;     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo9652H0(View view, int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        boolean z11;
        int m10110a;
        int i12;
        int i13;
        boolean z12;
        View view2;
        View view3;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        RecyclerView.C1894u c1894u2 = c1894u;
        RecyclerView.C1899z c1899z2 = c1899z;
        View m10100O = m10100O(view);
        View view4 = null;
        if (m10100O == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) m10100O.getLayoutParams();
        int i18 = layoutParams.f7634e;
        int i19 = layoutParams.f7635f + i18;
        if (super.mo9652H0(view, i11, c1894u, c1899z) == null) {
            return null;
        }
        if (m9733P1(i11) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != this.f7653x) {
            i12 = m10110a() - 1;
            m10110a = -1;
            i13 = -1;
        } else {
            m10110a = m10110a();
            i12 = 0;
            i13 = 1;
        }
        if (this.f7648s == 1 && m9752p2()) {
            z12 = true;
        } else {
            z12 = false;
        }
        int m9640Y2 = m9640Y2(c1894u2, c1899z2, i12);
        int i21 = i12;
        int i22 = 0;
        int i23 = -1;
        int i24 = -1;
        int i25 = 0;
        View view5 = null;
        while (i21 != m10110a) {
            int m9640Y22 = m9640Y2(c1894u2, c1899z2, i21);
            View m10105V = m10105V(i21);
            if (m10105V == m10100O) {
                break;
            }
            if (m10105V.hasFocusable() && m9640Y22 != m9640Y2) {
                if (view4 != null) {
                    break;
                }
                view2 = m10100O;
                view3 = view5;
            } else {
                LayoutParams layoutParams2 = (LayoutParams) m10105V.getLayoutParams();
                int i26 = layoutParams2.f7634e;
                view2 = m10100O;
                int i27 = layoutParams2.f7635f + i26;
                if (m10105V.hasFocusable() && i26 == i18 && i27 == i19) {
                    return m10105V;
                }
                if ((m10105V.hasFocusable() && view4 == null) || (!m10105V.hasFocusable() && view5 == null)) {
                    view3 = view5;
                } else {
                    view3 = view5;
                    int min = Math.min(i27, i19) - Math.max(i26, i18);
                    if (m10105V.hasFocusable()) {
                        if (min <= i22) {
                            if (min == i22) {
                                if (i26 > i23) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                        }
                    } else if (view4 == null) {
                        i14 = i22;
                        i15 = m10110a;
                        boolean z14 = true;
                        if (m10160w0(m10105V, false, true)) {
                            i16 = i25;
                            if (min > i16) {
                                i17 = i24;
                            } else {
                                if (min == i16) {
                                    i17 = i24;
                                    if (i26 <= i17) {
                                        z14 = false;
                                    }
                                } else {
                                    i17 = i24;
                                }
                                i24 = i17;
                                i25 = i16;
                                i22 = i14;
                                view5 = view3;
                                i21 += i13;
                                c1894u2 = c1894u;
                                c1899z2 = c1899z;
                                m10100O = view2;
                                m10110a = i15;
                            }
                            if (!m10105V.hasFocusable()) {
                                i23 = layoutParams2.f7634e;
                                i24 = i17;
                                i25 = i16;
                                view5 = view3;
                                view4 = m10105V;
                                i22 = Math.min(i27, i19) - Math.max(i26, i18);
                            } else {
                                int i28 = layoutParams2.f7634e;
                                i25 = Math.min(i27, i19) - Math.max(i26, i18);
                                i24 = i28;
                                i22 = i14;
                                view5 = m10105V;
                            }
                            i21 += i13;
                            c1894u2 = c1894u;
                            c1899z2 = c1899z;
                            m10100O = view2;
                            m10110a = i15;
                        }
                        i17 = i24;
                        i16 = i25;
                        i24 = i17;
                        i25 = i16;
                        i22 = i14;
                        view5 = view3;
                        i21 += i13;
                        c1894u2 = c1894u;
                        c1899z2 = c1899z;
                        m10100O = view2;
                        m10110a = i15;
                    }
                }
                i14 = i22;
                i15 = m10110a;
                i17 = i24;
                i16 = i25;
                if (!m10105V.hasFocusable()) {
                }
                i21 += i13;
                c1894u2 = c1894u;
                c1899z2 = c1899z;
                m10100O = view2;
                m10110a = i15;
            }
            i14 = i22;
            i15 = m10110a;
            i17 = i24;
            i16 = i25;
            i24 = i17;
            i25 = i16;
            i22 = i14;
            view5 = view3;
            i21 += i13;
            c1894u2 = c1894u;
            c1899z2 = c1899z;
            m10100O = view2;
            m10110a = i15;
        }
        View view6 = view5;
        if (view4 == null) {
            return view6;
        }
        return view4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: I */
    public int mo9653I(RecyclerView.C1899z c1899z) {
        if (this.f7633Q) {
            return m9637T2(c1899z);
        }
        return super.mo9653I(c1899z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: J1 */
    public boolean mo9654J1() {
        return this.f7643D == null && !this.f7625I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: L1 */
    void mo9655L1(RecyclerView.C1899z c1899z, LinearLayoutManager.C1869c c1869c, RecyclerView.AbstractC1888o.c cVar) {
        int i11 = this.f7626J;
        for (int i12 = 0; i12 < this.f7626J && c1869c.m9773c(c1899z) && i11 > 0; i12++) {
            int i13 = c1869c.f7671d;
            cVar.mo10172a(i13, Math.max(0, c1869c.f7674g));
            i11 -= this.f7631O.mo9682f(i13);
            c1869c.f7671d += c1869c.f7672e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: N0 */
    public void mo9656N0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, View view, C1507g0 c1507g0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.m10098M0(view, c1507g0);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int m9640Y2 = m9640Y2(c1894u, c1899z, layoutParams2.m9913b());
        if (this.f7648s == 0) {
            c1507g0.m7623g0(C1507g0.c.m7662a(layoutParams2.m9679f(), layoutParams2.m9680g(), m9640Y2, 1, false, false));
        } else {
            c1507g0.m7623g0(C1507g0.c.m7662a(m9640Y2, 1, layoutParams2.m9679f(), layoutParams2.m9680g(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: P0 */
    public void mo9657P0(RecyclerView recyclerView, int i11, int i12) {
        this.f7631O.m9688h();
        this.f7631O.m9687g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Q */
    public RecyclerView.LayoutParams mo9658Q() {
        if (this.f7648s == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Q0 */
    public void mo9659Q0(RecyclerView recyclerView) {
        this.f7631O.m9688h();
        this.f7631O.m9687g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: R */
    public RecyclerView.LayoutParams mo9660R(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: R0 */
    public void mo9661R0(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.f7631O.m9688h();
        this.f7631O.m9687g();
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
        this.f7631O.m9688h();
        this.f7631O.m9687g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: U0 */
    public void mo9664U0(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.f7631O.m9688h();
        this.f7631O.m9687g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: V0 */
    public void mo9665V0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (c1899z.m10256e()) {
            m9632O2();
        }
        super.mo9665V0(c1894u, c1899z);
        m9635R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: W0 */
    public void mo9666W0(RecyclerView.C1899z c1899z) {
        super.mo9666W0(c1899z);
        this.f7625I = false;
    }

    /* renamed from: W2 */
    int m9667W2(int i11, int i12) {
        if (this.f7648s == 1 && m9752p2()) {
            int[] iArr = this.f7627K;
            int i13 = this.f7626J;
            return iArr[i13 - i11] - iArr[(i13 - i11) - i12];
        }
        int[] iArr2 = this.f7627K;
        return iArr2[i12 + i11] - iArr2[i11];
    }

    /* renamed from: X2 */
    public int m9668X2() {
        return this.f7626J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: Z */
    public int mo9669Z(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7648s == 1) {
            return this.f7626J;
        }
        if (c1899z.m10253b() < 1) {
            return 0;
        }
        return m9640Y2(c1894u, c1899z, c1899z.m10253b() - 1) + 1;
    }

    /* renamed from: e3 */
    public void m9670e3(int i11) {
        if (i11 == this.f7626J) {
            return;
        }
        this.f7625I = true;
        if (i11 >= 1) {
            this.f7626J = i11;
            this.f7631O.m9688h();
            m10152r1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i11);
        }
    }

    /* renamed from: f3 */
    public void m9671f3(AbstractC1865b abstractC1865b) {
        this.f7631O = abstractC1865b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (m10112b >= 0 && m10112b < i13 && m9641Z2(c1894u, c1899z, m10112b) == 0) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: j0 */
    public int mo9673j0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        if (this.f7648s == 0) {
            return this.f7626J;
        }
        if (c1899z.m10253b() < 1) {
            return 0;
        }
        return m9640Y2(c1894u, c1899z, c1899z.m10253b() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:            r21.f7665b = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:            return;     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: r2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void mo9674r2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, LinearLayoutManager.C1869c c1869c, LinearLayoutManager.C1868b c1868b) {
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int mo10648f;
        int i21;
        int i22;
        int m10073W;
        int i23;
        View m9774d;
        int mo10655m = this.f7650u.mo10655m();
        if (mo10655m != 1073741824) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m10110a() > 0) {
            i11 = this.f7627K[this.f7626J];
        } else {
            i11 = 0;
        }
        if (z11) {
            m9646g3();
        }
        if (c1869c.f7672e == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i24 = this.f7626J;
        if (!z12) {
            i24 = m9641Z2(c1894u, c1899z, c1869c.f7671d) + m9642a3(c1894u, c1899z, c1869c.f7671d);
        }
        int i25 = 0;
        while (i25 < this.f7626J && c1869c.m9773c(c1899z) && i24 > 0) {
            int i26 = c1869c.f7671d;
            int m9642a3 = m9642a3(c1894u, c1899z, i26);
            if (m9642a3 <= this.f7626J) {
                i24 -= m9642a3;
                if (i24 < 0 || (m9774d = c1869c.m9774d(c1894u)) == null) {
                    break;
                }
                this.f7628L[i25] = m9774d;
                i25++;
            } else {
                throw new IllegalArgumentException("Item at position " + i26 + " requires " + m9642a3 + " spans but GridLayoutManager has only " + this.f7626J + " spans.");
            }
        }
        m9631N2(c1894u, c1899z, i25, z12);
        float f11 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i25; i28++) {
            View view = this.f7628L[i28];
            if (c1869c.f7679l == null) {
                if (z12) {
                    m10149q(view);
                } else {
                    m10151r(view, 0);
                }
            } else if (z12) {
                m10143o(view);
            } else {
                m10146p(view, 0);
            }
            m10159w(view, this.f7632P);
            m9644c3(view, mo10655m, false);
            int mo10647e = this.f7650u.mo10647e(view);
            if (mo10647e > i27) {
                i27 = mo10647e;
            }
            float mo10648f2 = (this.f7650u.mo10648f(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).f7635f;
            if (mo10648f2 > f11) {
                f11 = mo10648f2;
            }
        }
        if (z11) {
            m9643b3(f11, i11);
            i27 = 0;
            for (int i29 = 0; i29 < i25; i29++) {
                View view2 = this.f7628L[i29];
                m9644c3(view2, 1073741824, true);
                int mo10647e2 = this.f7650u.mo10647e(view2);
                if (mo10647e2 > i27) {
                    i27 = mo10647e2;
                }
            }
        }
        for (int i31 = 0; i31 < i25; i31++) {
            View view3 = this.f7628L[i31];
            if (this.f7650u.mo10647e(view3) != i27) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f7763b;
                int i32 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i33 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int m9667W2 = m9667W2(layoutParams.f7634e, layoutParams.f7635f);
                if (this.f7648s == 1) {
                    i23 = RecyclerView.AbstractC1888o.m10073W(m9667W2, 1073741824, i33, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    m10073W = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i33, 1073741824);
                    m10073W = RecyclerView.AbstractC1888o.m10073W(m9667W2, 1073741824, i32, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    i23 = makeMeasureSpec;
                }
                m9645d3(view3, i23, m10073W, true);
            }
        }
        c1868b.f7664a = i27;
        if (this.f7648s == 1) {
            if (c1869c.f7673f == -1) {
                i17 = c1869c.f7669b;
                i22 = i17 - i27;
            } else {
                i22 = c1869c.f7669b;
                i17 = i22 + i27;
            }
            i15 = i22;
            i16 = 0;
            i14 = 0;
        } else {
            if (c1869c.f7673f == -1) {
                i13 = c1869c.f7669b;
                i12 = i13 - i27;
            } else {
                i12 = c1869c.f7669b;
                i13 = i12 + i27;
            }
            i14 = i12;
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        int i34 = 0;
        while (i34 < i25) {
            View view4 = this.f7628L[i34];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f7648s == 1) {
                if (m9752p2()) {
                    int paddingLeft = getPaddingLeft() + this.f7627K[this.f7626J - layoutParams2.f7634e];
                    i14 = paddingLeft - this.f7650u.mo10648f(view4);
                    mo10648f = i17;
                    i19 = paddingLeft;
                    i18 = i15;
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f7627K[layoutParams2.f7634e];
                    mo10648f = i17;
                    i21 = paddingLeft2;
                    i18 = i15;
                    i19 = this.f7650u.mo10648f(view4) + paddingLeft2;
                    mo10161x0(view4, i21, i18, i19, mo10648f);
                    if (!layoutParams2.m9915d() || layoutParams2.m9914c()) {
                        c1868b.f7666c = true;
                    }
                    c1868b.f7667d |= view4.hasFocusable();
                    i34++;
                    i17 = mo10648f;
                    i16 = i19;
                    i15 = i18;
                    i14 = i21;
                }
            } else {
                int paddingTop = getPaddingTop() + this.f7627K[layoutParams2.f7634e];
                i18 = paddingTop;
                i19 = i16;
                mo10648f = this.f7650u.mo10648f(view4) + paddingTop;
            }
            i21 = i14;
            mo10161x0(view4, i21, i18, i19, mo10648f);
            if (!layoutParams2.m9915d()) {
            }
            c1868b.f7666c = true;
            c1868b.f7667d |= view4.hasFocusable();
            i34++;
            i17 = mo10648f;
            i16 = i19;
            i15 = i18;
            i14 = i21;
        }
        Arrays.fill(this.f7628L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: t2 */
    public void mo9675t2(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, LinearLayoutManager.C1867a c1867a, int i11) {
        super.mo9675t2(c1894u, c1899z, c1867a, i11);
        m9646g3();
        if (c1899z.m10253b() > 0 && !c1899z.m10256e()) {
            m9638U2(c1894u, c1899z, c1867a, i11);
        }
        m9639V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: u1 */
    public int mo9676u1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        m9646g3();
        m9639V2();
        return super.mo9676u1(i11, c1894u, c1899z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: w1 */
    public int mo9677w1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
        m9646g3();
        m9639V2();
        return super.mo9677w1(i11, c1894u, c1899z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: z */
    public boolean mo9678z(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        this.f7625I = false;
        this.f7626J = -1;
        this.f7629M = new SparseIntArray();
        this.f7630N = new SparseIntArray();
        this.f7631O = new C1864a();
        this.f7632P = new Rect();
        m9670e3(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i12, z11);
        this.f7625I = false;
        this.f7626J = -1;
        this.f7629M = new SparseIntArray();
        this.f7630N = new SparseIntArray();
        this.f7631O = new C1864a();
        this.f7632P = new Rect();
        m9670e3(i11);
    }
}
