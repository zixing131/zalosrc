package com.google.android.flexbox;

import android.support.v4.view.MarginLayoutParamsCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
/* loaded from: classes2.dex */
class C4005c {

    /* renamed from: a */
    private final InterfaceC4003a f15875a;

    /* renamed from: b */
    private boolean[] f15876b;

    /* renamed from: c */
    int[] f15877c;

    /* renamed from: d */
    long[] f15878d;

    /* renamed from: e */
    private long[] f15879e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.c$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        List f15880a;

        /* renamed from: b */
        int f15881b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m19004a() {
            this.f15880a = null;
            this.f15881b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.c$c */
    /* loaded from: classes2.dex */
    public static class c implements Comparable {

        /* renamed from: p */
        int f15882p;

        /* renamed from: q */
        int f15883q;

        private c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i11 = this.f15883q;
            int i12 = cVar.f15883q;
            if (i11 != i12) {
                return i11 - i12;
            }
            return this.f15882p - cVar.f15882p;
        }

        public String toString() {
            return "Order{order=" + this.f15883q + ", index=" + this.f15882p + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4005c(InterfaceC4003a interfaceC4003a) {
        this.f15875a = interfaceC4003a;
    }

    /* renamed from: A */
    private int m18961A(boolean z11) {
        if (z11) {
            return this.f15875a.getPaddingTop();
        }
        return this.f15875a.getPaddingStart();
    }

    /* renamed from: B */
    private int m18962B(boolean z11) {
        if (z11) {
            return this.f15875a.getPaddingStart();
        }
        return this.f15875a.getPaddingTop();
    }

    /* renamed from: C */
    private int m18963C(View view, boolean z11) {
        if (z11) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: D */
    private int m18964D(View view, boolean z11) {
        if (z11) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: E */
    private boolean m18965E(int i11, int i12, C4004b c4004b) {
        if (i11 == i12 - 1 && c4004b.m18959b() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private boolean m18966G(View view, int i11, int i12, int i13, int i14, FlexItem flexItem, int i15, int i16) {
        if (this.f15875a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.mo18913L()) {
            return true;
        }
        if (i11 == 0) {
            return false;
        }
        int mo18946i = this.f15875a.mo18946i(view, i15, i16);
        if (mo18946i > 0) {
            i14 += mo18946i;
        }
        if (i12 >= i13 + i14) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    private void m18967K(int i11, int i12, C4004b c4004b, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        int i17;
        int i18 = c4004b.f15863e;
        float f11 = c4004b.f15869k;
        float f12 = 0.0f;
        if (f11 > 0.0f && i13 <= i18) {
            float f13 = (i18 - i13) / f11;
            c4004b.f15863e = i14 + c4004b.f15864f;
            if (!z11) {
                c4004b.f15865g = Integer.MIN_VALUE;
            }
            int i19 = 0;
            boolean z12 = false;
            int i21 = 0;
            float f14 = 0.0f;
            while (i19 < c4004b.f15866h) {
                int i22 = c4004b.f15873o + i19;
                View mo18944g = this.f15875a.mo18944g(i22);
                if (mo18944g == null || mo18944g.getVisibility() == 8) {
                    i15 = i18;
                    i16 = i19;
                } else {
                    FlexItem flexItem = (FlexItem) mo18944g.getLayoutParams();
                    int flexDirection = this.f15875a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i15 = i18;
                        int i23 = i19;
                        int measuredWidth = mo18944g.getMeasuredWidth();
                        long[] jArr = this.f15879e;
                        if (jArr != null) {
                            measuredWidth = m19003p(jArr[i22]);
                        }
                        int measuredHeight = mo18944g.getMeasuredHeight();
                        long[] jArr2 = this.f15879e;
                        if (jArr2 != null) {
                            measuredHeight = m19002o(jArr2[i22]);
                        }
                        if (!this.f15876b[i22] && flexItem.mo18918s() > 0.0f) {
                            float mo18918s = measuredWidth - (flexItem.mo18918s() * f13);
                            i16 = i23;
                            if (i16 == c4004b.f15866h - 1) {
                                mo18918s += f14;
                                f14 = 0.0f;
                            }
                            int round = Math.round(mo18918s);
                            if (round < flexItem.mo18920v()) {
                                round = flexItem.mo18920v();
                                this.f15876b[i22] = true;
                                c4004b.f15869k -= flexItem.mo18918s();
                                z12 = true;
                            } else {
                                f14 += mo18918s - round;
                                double d11 = f14;
                                if (d11 > 1.0d) {
                                    round++;
                                    f14 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    round--;
                                    f14 += 1.0f;
                                }
                            }
                            int m18978q = m18978q(i12, flexItem, c4004b.f15871m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            mo18944g.measure(makeMeasureSpec, m18978q);
                            int measuredWidth2 = mo18944g.getMeasuredWidth();
                            int measuredHeight2 = mo18944g.getMeasuredHeight();
                            m18971Q(i22, makeMeasureSpec, m18978q, mo18944g);
                            this.f15875a.mo18945h(i22, mo18944g);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            i16 = i23;
                        }
                        int max = Math.max(i21, measuredHeight + flexItem.mo18910A() + flexItem.mo18915c0() + this.f15875a.mo18942e(mo18944g));
                        c4004b.f15863e += measuredWidth + flexItem.mo18916d0() + flexItem.mo18919s0();
                        i17 = max;
                    } else {
                        int measuredHeight3 = mo18944g.getMeasuredHeight();
                        long[] jArr3 = this.f15879e;
                        if (jArr3 != null) {
                            measuredHeight3 = m19002o(jArr3[i22]);
                        }
                        int measuredWidth3 = mo18944g.getMeasuredWidth();
                        long[] jArr4 = this.f15879e;
                        if (jArr4 != null) {
                            measuredWidth3 = m19003p(jArr4[i22]);
                        }
                        if (!this.f15876b[i22] && flexItem.mo18918s() > f12) {
                            float mo18918s2 = measuredHeight3 - (flexItem.mo18918s() * f13);
                            if (i19 == c4004b.f15866h - 1) {
                                mo18918s2 += f14;
                                f14 = 0.0f;
                            }
                            int round2 = Math.round(mo18918s2);
                            if (round2 < flexItem.mo18921w0()) {
                                round2 = flexItem.mo18921w0();
                                this.f15876b[i22] = true;
                                c4004b.f15869k -= flexItem.mo18918s();
                                i15 = i18;
                                i16 = i19;
                                z12 = true;
                            } else {
                                f14 += mo18918s2 - round2;
                                i15 = i18;
                                i16 = i19;
                                double d12 = f14;
                                if (d12 > 1.0d) {
                                    round2++;
                                    f14 -= 1.0f;
                                } else if (d12 < -1.0d) {
                                    round2--;
                                    f14 += 1.0f;
                                }
                            }
                            int m18979r = m18979r(i11, flexItem, c4004b.f15871m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            mo18944g.measure(m18979r, makeMeasureSpec2);
                            measuredWidth3 = mo18944g.getMeasuredWidth();
                            int measuredHeight4 = mo18944g.getMeasuredHeight();
                            m18971Q(i22, m18979r, makeMeasureSpec2, mo18944g);
                            this.f15875a.mo18945h(i22, mo18944g);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i15 = i18;
                            i16 = i19;
                        }
                        i17 = Math.max(i21, measuredWidth3 + flexItem.mo18916d0() + flexItem.mo18919s0() + this.f15875a.mo18942e(mo18944g));
                        c4004b.f15863e += measuredHeight3 + flexItem.mo18910A() + flexItem.mo18915c0();
                    }
                    c4004b.f15865g = Math.max(c4004b.f15865g, i17);
                    i21 = i17;
                }
                i19 = i16 + 1;
                i18 = i15;
                f12 = 0.0f;
            }
            int i24 = i18;
            if (z12 && i24 != c4004b.f15863e) {
                m18967K(i11, i12, c4004b, i13, i14, true);
            }
        }
    }

    /* renamed from: L */
    private int[] m18968L(int i11, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i11];
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i13 = cVar.f15882p;
            iArr[i12] = i13;
            sparseIntArray.append(i13, cVar.f15883q);
            i12++;
        }
        return iArr;
    }

    /* renamed from: M */
    private void m18969M(View view, int i11, int i12) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i11 - flexItem.mo18916d0()) - flexItem.mo18919s0()) - this.f15875a.mo18942e(view), flexItem.mo18920v()), flexItem.mo18914P());
        long[] jArr = this.f15879e;
        if (jArr != null) {
            measuredHeight = m19002o(jArr[i12]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m18971Q(i12, makeMeasureSpec2, makeMeasureSpec, view);
        this.f15875a.mo18945h(i12, view);
    }

    /* renamed from: N */
    private void m18970N(View view, int i11, int i12) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i11 - flexItem.mo18910A()) - flexItem.mo18915c0()) - this.f15875a.mo18942e(view), flexItem.mo18921w0()), flexItem.mo18922y0());
        long[] jArr = this.f15879e;
        if (jArr != null) {
            measuredWidth = m19003p(jArr[i12]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m18971Q(i12, makeMeasureSpec, makeMeasureSpec2, view);
        this.f15875a.mo18945h(i12, view);
    }

    /* renamed from: Q */
    private void m18971Q(int i11, int i12, int i13, View view) {
        long[] jArr = this.f15878d;
        if (jArr != null) {
            jArr[i11] = m18991J(i12, i13);
        }
        long[] jArr2 = this.f15879e;
        if (jArr2 != null) {
            jArr2[i11] = m18991J(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private void m18972a(List list, C4004b c4004b, int i11, int i12) {
        c4004b.f15871m = i12;
        this.f15875a.mo18943f(c4004b);
        c4004b.f15874p = i11;
        list.add(c4004b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18973e(View view, int i11) {
        boolean z11;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z12 = true;
        if (measuredWidth < flexItem.mo18920v()) {
            measuredWidth = flexItem.mo18920v();
        } else if (measuredWidth > flexItem.mo18914P()) {
            measuredWidth = flexItem.mo18914P();
        } else {
            z11 = false;
            if (measuredHeight >= flexItem.mo18921w0()) {
                measuredHeight = flexItem.mo18921w0();
            } else if (measuredHeight > flexItem.mo18922y0()) {
                measuredHeight = flexItem.mo18922y0();
            } else {
                z12 = z11;
            }
            if (!z12) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                m18971Q(i11, makeMeasureSpec, makeMeasureSpec2, view);
                this.f15875a.mo18945h(i11, view);
                return;
            }
            return;
        }
        z11 = true;
        if (measuredHeight >= flexItem.mo18921w0()) {
        }
        if (!z12) {
        }
    }

    /* renamed from: f */
    private List m18974f(List list, int i11, int i12) {
        int i13 = (i11 - i12) / 2;
        ArrayList arrayList = new ArrayList();
        C4004b c4004b = new C4004b();
        c4004b.f15865g = i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 == 0) {
                arrayList.add(c4004b);
            }
            arrayList.add((C4004b) list.get(i14));
            if (i14 == list.size() - 1) {
                arrayList.add(c4004b);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private List m18975g(int i11) {
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            FlexItem flexItem = (FlexItem) this.f15875a.mo18940c(i12).getLayoutParams();
            c cVar = new c();
            cVar.f15883q = flexItem.getOrder();
            cVar.f15882p = i12;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: m */
    private void m18976m(int i11) {
        boolean[] zArr = this.f15876b;
        if (zArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f15876b = new boolean[i11];
        } else {
            if (zArr.length < i11) {
                int length = zArr.length * 2;
                if (length >= i11) {
                    i11 = length;
                }
                this.f15876b = new boolean[i11];
                return;
            }
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: n */
    private void m18977n(int i11, int i12, C4004b c4004b, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        int i17;
        double d11;
        int i18;
        double d12;
        float f11 = c4004b.f15868j;
        float f12 = 0.0f;
        if (f11 > 0.0f && i13 >= (i15 = c4004b.f15863e)) {
            float f13 = (i13 - i15) / f11;
            c4004b.f15863e = i14 + c4004b.f15864f;
            if (!z11) {
                c4004b.f15865g = Integer.MIN_VALUE;
            }
            int i19 = 0;
            boolean z12 = false;
            int i21 = 0;
            float f14 = 0.0f;
            while (i19 < c4004b.f15866h) {
                int i22 = c4004b.f15873o + i19;
                View mo18944g = this.f15875a.mo18944g(i22);
                if (mo18944g == null || mo18944g.getVisibility() == 8) {
                    i16 = i15;
                } else {
                    FlexItem flexItem = (FlexItem) mo18944g.getLayoutParams();
                    int flexDirection = this.f15875a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i23 = i15;
                        int measuredWidth = mo18944g.getMeasuredWidth();
                        long[] jArr = this.f15879e;
                        if (jArr != null) {
                            measuredWidth = m19003p(jArr[i22]);
                        }
                        int measuredHeight = mo18944g.getMeasuredHeight();
                        long[] jArr2 = this.f15879e;
                        i16 = i23;
                        if (jArr2 != null) {
                            measuredHeight = m19002o(jArr2[i22]);
                        }
                        if (!this.f15876b[i22] && flexItem.mo18911E() > 0.0f) {
                            float mo18911E = measuredWidth + (flexItem.mo18911E() * f13);
                            if (i19 == c4004b.f15866h - 1) {
                                mo18911E += f14;
                                f14 = 0.0f;
                            }
                            int round = Math.round(mo18911E);
                            if (round > flexItem.mo18914P()) {
                                round = flexItem.mo18914P();
                                this.f15876b[i22] = true;
                                c4004b.f15868j -= flexItem.mo18911E();
                                z12 = true;
                            } else {
                                f14 += mo18911E - round;
                                double d13 = f14;
                                if (d13 > 1.0d) {
                                    round++;
                                    d11 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    round--;
                                    d11 = d13 + 1.0d;
                                }
                                f14 = (float) d11;
                            }
                            int m18978q = m18978q(i12, flexItem, c4004b.f15871m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            mo18944g.measure(makeMeasureSpec, m18978q);
                            int measuredWidth2 = mo18944g.getMeasuredWidth();
                            int measuredHeight2 = mo18944g.getMeasuredHeight();
                            m18971Q(i22, makeMeasureSpec, m18978q, mo18944g);
                            this.f15875a.mo18945h(i22, mo18944g);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i21, measuredHeight + flexItem.mo18910A() + flexItem.mo18915c0() + this.f15875a.mo18942e(mo18944g));
                        c4004b.f15863e += measuredWidth + flexItem.mo18916d0() + flexItem.mo18919s0();
                        i17 = max;
                    } else {
                        int measuredHeight3 = mo18944g.getMeasuredHeight();
                        long[] jArr3 = this.f15879e;
                        if (jArr3 != null) {
                            measuredHeight3 = m19002o(jArr3[i22]);
                        }
                        int measuredWidth3 = mo18944g.getMeasuredWidth();
                        long[] jArr4 = this.f15879e;
                        if (jArr4 != null) {
                            measuredWidth3 = m19003p(jArr4[i22]);
                        }
                        if (!this.f15876b[i22] && flexItem.mo18911E() > f12) {
                            float mo18911E2 = measuredHeight3 + (flexItem.mo18911E() * f13);
                            if (i19 == c4004b.f15866h - 1) {
                                mo18911E2 += f14;
                                f14 = 0.0f;
                            }
                            int round2 = Math.round(mo18911E2);
                            if (round2 > flexItem.mo18922y0()) {
                                round2 = flexItem.mo18922y0();
                                this.f15876b[i22] = true;
                                c4004b.f15868j -= flexItem.mo18911E();
                                i18 = i15;
                                z12 = true;
                            } else {
                                f14 += mo18911E2 - round2;
                                i18 = i15;
                                double d14 = f14;
                                if (d14 > 1.0d) {
                                    round2++;
                                    d12 = d14 - 1.0d;
                                } else if (d14 < -1.0d) {
                                    round2--;
                                    d12 = d14 + 1.0d;
                                }
                                f14 = (float) d12;
                            }
                            int m18979r = m18979r(i11, flexItem, c4004b.f15871m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            mo18944g.measure(m18979r, makeMeasureSpec2);
                            measuredWidth3 = mo18944g.getMeasuredWidth();
                            int measuredHeight4 = mo18944g.getMeasuredHeight();
                            m18971Q(i22, m18979r, makeMeasureSpec2, mo18944g);
                            this.f15875a.mo18945h(i22, mo18944g);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i18 = i15;
                        }
                        i17 = Math.max(i21, measuredWidth3 + flexItem.mo18916d0() + flexItem.mo18919s0() + this.f15875a.mo18942e(mo18944g));
                        c4004b.f15863e += measuredHeight3 + flexItem.mo18910A() + flexItem.mo18915c0();
                        i16 = i18;
                    }
                    c4004b.f15865g = Math.max(c4004b.f15865g, i17);
                    i21 = i17;
                }
                i19++;
                i15 = i16;
                f12 = 0.0f;
            }
            int i24 = i15;
            if (z12 && i24 != c4004b.f15863e) {
                m18977n(i11, i12, c4004b, i13, i14, true);
            }
        }
    }

    /* renamed from: q */
    private int m18978q(int i11, FlexItem flexItem, int i12) {
        InterfaceC4003a interfaceC4003a = this.f15875a;
        int mo18941d = interfaceC4003a.mo18941d(i11, interfaceC4003a.getPaddingTop() + this.f15875a.getPaddingBottom() + flexItem.mo18910A() + flexItem.mo18915c0() + i12, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(mo18941d);
        if (size > flexItem.mo18922y0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo18922y0(), View.MeasureSpec.getMode(mo18941d));
        }
        if (size < flexItem.mo18921w0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo18921w0(), View.MeasureSpec.getMode(mo18941d));
        }
        return mo18941d;
    }

    /* renamed from: r */
    private int m18979r(int i11, FlexItem flexItem, int i12) {
        InterfaceC4003a interfaceC4003a = this.f15875a;
        int mo18939b = interfaceC4003a.mo18939b(i11, interfaceC4003a.getPaddingLeft() + this.f15875a.getPaddingRight() + flexItem.mo18916d0() + flexItem.mo18919s0() + i12, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(mo18939b);
        if (size > flexItem.mo18914P()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo18914P(), View.MeasureSpec.getMode(mo18939b));
        }
        if (size < flexItem.mo18920v()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo18920v(), View.MeasureSpec.getMode(mo18939b));
        }
        return mo18939b;
    }

    /* renamed from: s */
    private int m18980s(FlexItem flexItem, boolean z11) {
        if (z11) {
            return flexItem.mo18915c0();
        }
        return flexItem.mo18919s0();
    }

    /* renamed from: t */
    private int m18981t(FlexItem flexItem, boolean z11) {
        if (z11) {
            return flexItem.mo18919s0();
        }
        return flexItem.mo18915c0();
    }

    /* renamed from: u */
    private int m18982u(FlexItem flexItem, boolean z11) {
        if (z11) {
            return flexItem.mo18910A();
        }
        return flexItem.mo18916d0();
    }

    /* renamed from: v */
    private int m18983v(FlexItem flexItem, boolean z11) {
        if (z11) {
            return flexItem.mo18916d0();
        }
        return flexItem.mo18910A();
    }

    /* renamed from: w */
    private int m18984w(FlexItem flexItem, boolean z11) {
        if (z11) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    /* renamed from: x */
    private int m18985x(FlexItem flexItem, boolean z11) {
        if (z11) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    /* renamed from: y */
    private int m18986y(boolean z11) {
        if (z11) {
            return this.f15875a.getPaddingBottom();
        }
        return this.f15875a.getPaddingEnd();
    }

    /* renamed from: z */
    private int m18987z(boolean z11) {
        if (z11) {
            return this.f15875a.getPaddingEnd();
        }
        return this.f15875a.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m18988F(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f15875a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i11 = 0; i11 < flexItemCount; i11++) {
            View mo18940c = this.f15875a.mo18940c(i11);
            if (mo18940c != null && ((FlexItem) mo18940c.getLayoutParams()).getOrder() != sparseIntArray.get(i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m18989H(View view, C4004b c4004b, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f15875a.getAlignItems();
        if (flexItem.mo18917r() != -1) {
            alignItems = flexItem.mo18917r();
        }
        int i15 = c4004b.f15865g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.f15875a.getFlexWrap() != 2) {
                        int max = Math.max(c4004b.f15870l - view.getBaseline(), flexItem.mo18910A());
                        view.layout(i11, i12 + max, i13, i14 + max);
                        return;
                    } else {
                        int max2 = Math.max((c4004b.f15870l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo18915c0());
                        view.layout(i11, i12 - max2, i13, i14 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i15 - view.getMeasuredHeight()) + flexItem.mo18910A()) - flexItem.mo18915c0()) / 2;
                    if (this.f15875a.getFlexWrap() != 2) {
                        int i16 = i12 + measuredHeight;
                        view.layout(i11, i16, i13, view.getMeasuredHeight() + i16);
                        return;
                    } else {
                        int i17 = i12 - measuredHeight;
                        view.layout(i11, i17, i13, view.getMeasuredHeight() + i17);
                        return;
                    }
                }
            } else if (this.f15875a.getFlexWrap() != 2) {
                int i18 = i12 + i15;
                view.layout(i11, (i18 - view.getMeasuredHeight()) - flexItem.mo18915c0(), i13, i18 - flexItem.mo18915c0());
                return;
            } else {
                view.layout(i11, (i12 - i15) + view.getMeasuredHeight() + flexItem.mo18910A(), i13, (i14 - i15) + view.getMeasuredHeight() + flexItem.mo18910A());
                return;
            }
        }
        if (this.f15875a.getFlexWrap() != 2) {
            view.layout(i11, i12 + flexItem.mo18910A(), i13, i14 + flexItem.mo18910A());
        } else {
            view.layout(i11, i12 - flexItem.mo18915c0(), i13, i14 - flexItem.mo18915c0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m18990I(View view, C4004b c4004b, boolean z11, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f15875a.getAlignItems();
        if (flexItem.mo18917r() != -1) {
            alignItems = flexItem.mo18917r();
        }
        int i15 = c4004b.f15865g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i15 - view.getMeasuredWidth()) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams)) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                    if (!z11) {
                        view.layout(i11 + measuredWidth, i12, i13 + measuredWidth, i14);
                        return;
                    } else {
                        view.layout(i11 - measuredWidth, i12, i13 - measuredWidth, i14);
                        return;
                    }
                }
            } else if (!z11) {
                view.layout(((i11 + i15) - view.getMeasuredWidth()) - flexItem.mo18919s0(), i12, ((i13 + i15) - view.getMeasuredWidth()) - flexItem.mo18919s0(), i14);
                return;
            } else {
                view.layout((i11 - i15) + view.getMeasuredWidth() + flexItem.mo18916d0(), i12, (i13 - i15) + view.getMeasuredWidth() + flexItem.mo18916d0(), i14);
                return;
            }
        }
        if (!z11) {
            view.layout(i11 + flexItem.mo18916d0(), i12, i13 + flexItem.mo18916d0(), i14);
        } else {
            view.layout(i11 - flexItem.mo18919s0(), i12, i13 - flexItem.mo18919s0(), i14);
        }
    }

    /* renamed from: J */
    long m18991J(int i11, int i12) {
        return (i11 & 4294967295L) | (i12 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m18992O() {
        m18993P(0);
    }

    /* renamed from: P */
    void m18993P(int i11) {
        int i12;
        View mo18944g;
        if (i11 >= this.f15875a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f15875a.getFlexDirection();
        if (this.f15875a.getAlignItems() == 4) {
            int[] iArr = this.f15877c;
            if (iArr != null) {
                i12 = iArr[i11];
            } else {
                i12 = 0;
            }
            List flexLinesInternal = this.f15875a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i12 < size) {
                C4004b c4004b = (C4004b) flexLinesInternal.get(i12);
                int i13 = c4004b.f15866h;
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = c4004b.f15873o + i14;
                    if (i14 < this.f15875a.getFlexItemCount() && (mo18944g = this.f15875a.mo18944g(i15)) != null && mo18944g.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) mo18944g.getLayoutParams();
                        if (flexItem.mo18917r() == -1 || flexItem.mo18917r() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                                m18969M(mo18944g, c4004b.f15865g, i15);
                            } else {
                                m18970N(mo18944g, c4004b.f15865g, i15);
                            }
                        }
                    }
                }
                i12++;
            }
            return;
        }
        for (C4004b c4004b2 : this.f15875a.getFlexLinesInternal()) {
            for (Integer num : c4004b2.f15872n) {
                View mo18944g2 = this.f15875a.mo18944g(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                    m18969M(mo18944g2, c4004b2.f15865g, num.intValue());
                } else {
                    m18970N(mo18944g2, c4004b2.f15865g, num.intValue());
                }
            }
        }
    }

    /* renamed from: b */
    void m18994b(b bVar, int i11, int i12, int i13, int i14, int i15, List list) {
        List list2;
        boolean z11;
        int i16;
        b bVar2;
        List list3;
        int i17;
        int i18;
        int i19;
        List list4;
        int i21;
        View view;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        C4004b c4004b;
        int i27;
        int i28 = i11;
        int i29 = i15;
        boolean mo18947j = this.f15875a.mo18947j();
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        bVar.f15880a = list2;
        if (i29 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m18962B = m18962B(mo18947j);
        int m18987z = m18987z(mo18947j);
        int m18961A = m18961A(mo18947j);
        int m18986y = m18986y(mo18947j);
        C4004b c4004b2 = new C4004b();
        int i31 = i14;
        c4004b2.f15873o = i31;
        int i32 = m18987z + m18962B;
        c4004b2.f15863e = i32;
        int flexItemCount = this.f15875a.getFlexItemCount();
        boolean z12 = z11;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = Integer.MIN_VALUE;
        while (true) {
            if (i31 < flexItemCount) {
                View mo18944g = this.f15875a.mo18944g(i31);
                if (mo18944g == null) {
                    if (m18965E(i31, flexItemCount, c4004b2)) {
                        m18972a(list2, c4004b2, i31, i33);
                    }
                } else if (mo18944g.getVisibility() == 8) {
                    c4004b2.f15867i++;
                    c4004b2.f15866h++;
                    if (m18965E(i31, flexItemCount, c4004b2)) {
                        m18972a(list2, c4004b2, i31, i33);
                    }
                } else {
                    FlexItem flexItem = (FlexItem) mo18944g.getLayoutParams();
                    int i37 = flexItemCount;
                    if (flexItem.mo18917r() == 4) {
                        c4004b2.f15872n.add(Integer.valueOf(i31));
                    }
                    int m18985x = m18985x(flexItem, mo18947j);
                    if (flexItem.mo18912G() != -1.0f && mode == 1073741824) {
                        m18985x = Math.round(size * flexItem.mo18912G());
                    }
                    if (mo18947j) {
                        list3 = list2;
                        int mo18939b = this.f15875a.mo18939b(i28, i32 + m18983v(flexItem, true) + m18981t(flexItem, true), m18985x);
                        i17 = size;
                        int mo18941d = this.f15875a.mo18941d(i12, m18961A + m18986y + m18982u(flexItem, true) + m18980s(flexItem, true) + i33, m18984w(flexItem, true));
                        mo18944g.measure(mo18939b, mo18941d);
                        m18971Q(i31, mo18939b, mo18941d, mo18944g);
                        i18 = mo18939b;
                    } else {
                        list3 = list2;
                        i17 = size;
                        int mo18939b2 = this.f15875a.mo18939b(i12, m18961A + m18986y + m18982u(flexItem, false) + m18980s(flexItem, false) + i33, m18984w(flexItem, false));
                        int mo18941d2 = this.f15875a.mo18941d(i28, m18983v(flexItem, false) + i32 + m18981t(flexItem, false), m18985x);
                        mo18944g.measure(mo18939b2, mo18941d2);
                        m18971Q(i31, mo18939b2, mo18941d2, mo18944g);
                        i18 = mo18941d2;
                    }
                    this.f15875a.mo18945h(i31, mo18944g);
                    m18973e(mo18944g, i31);
                    i34 = View.combineMeasuredStates(i34, mo18944g.getMeasuredState());
                    int i38 = i33;
                    int i39 = i32;
                    C4004b c4004b3 = c4004b2;
                    i19 = mode;
                    int i41 = i31;
                    list4 = list3;
                    int i42 = i18;
                    if (m18966G(mo18944g, mode, i17, c4004b2.f15863e, m18981t(flexItem, mo18947j) + m18964D(mo18944g, mo18947j) + m18983v(flexItem, mo18947j), flexItem, i41, i35)) {
                        i31 = i41;
                        if (c4004b3.m18959b() > 0) {
                            if (i31 > 0) {
                                i27 = i31 - 1;
                                c4004b = c4004b3;
                            } else {
                                c4004b = c4004b3;
                                i27 = 0;
                            }
                            m18972a(list4, c4004b, i27, i38);
                            i33 = c4004b.f15865g + i38;
                        } else {
                            i33 = i38;
                        }
                        if (mo18947j) {
                            if (flexItem.getHeight() == -1) {
                                InterfaceC4003a interfaceC4003a = this.f15875a;
                                view = mo18944g;
                                view.measure(i42, interfaceC4003a.mo18941d(i12, interfaceC4003a.getPaddingTop() + this.f15875a.getPaddingBottom() + flexItem.mo18910A() + flexItem.mo18915c0() + i33, flexItem.getHeight()));
                                m18973e(view, i31);
                            } else {
                                view = mo18944g;
                            }
                        } else {
                            view = mo18944g;
                            if (flexItem.getWidth() == -1) {
                                InterfaceC4003a interfaceC4003a2 = this.f15875a;
                                view.measure(interfaceC4003a2.mo18939b(i12, interfaceC4003a2.getPaddingLeft() + this.f15875a.getPaddingRight() + flexItem.mo18916d0() + flexItem.mo18919s0() + i33, flexItem.getWidth()), i42);
                                m18973e(view, i31);
                            }
                        }
                        c4004b2 = new C4004b();
                        c4004b2.f15866h = 1;
                        i21 = i39;
                        c4004b2.f15863e = i21;
                        c4004b2.f15873o = i31;
                        i22 = 0;
                        i23 = Integer.MIN_VALUE;
                    } else {
                        i31 = i41;
                        c4004b2 = c4004b3;
                        i21 = i39;
                        view = mo18944g;
                        c4004b2.f15866h++;
                        i22 = i35 + 1;
                        i33 = i38;
                        i23 = i36;
                    }
                    int[] iArr = this.f15877c;
                    if (iArr != null) {
                        iArr[i31] = list4.size();
                    }
                    c4004b2.f15863e += m18964D(view, mo18947j) + m18983v(flexItem, mo18947j) + m18981t(flexItem, mo18947j);
                    c4004b2.f15868j += flexItem.mo18911E();
                    c4004b2.f15869k += flexItem.mo18918s();
                    this.f15875a.mo18938a(view, i31, i22, c4004b2);
                    int max = Math.max(i23, m18963C(view, mo18947j) + m18982u(flexItem, mo18947j) + m18980s(flexItem, mo18947j) + this.f15875a.mo18942e(view));
                    c4004b2.f15865g = Math.max(c4004b2.f15865g, max);
                    if (mo18947j) {
                        if (this.f15875a.getFlexWrap() != 2) {
                            c4004b2.f15870l = Math.max(c4004b2.f15870l, view.getBaseline() + flexItem.mo18910A());
                        } else {
                            c4004b2.f15870l = Math.max(c4004b2.f15870l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo18915c0());
                        }
                    }
                    i24 = i37;
                    if (m18965E(i31, i24, c4004b2)) {
                        m18972a(list4, c4004b2, i31, i33);
                        i33 += c4004b2.f15865g;
                    }
                    i25 = i15;
                    if (i25 != -1 && list4.size() > 0) {
                        if (((C4004b) list4.get(list4.size() - 1)).f15874p >= i25 && i31 >= i25 && !z12) {
                            i33 = -c4004b2.m18958a();
                            i26 = i13;
                            z12 = true;
                            if (i33 <= i26 && z12) {
                                bVar2 = bVar;
                                i16 = i34;
                                break;
                            }
                            i35 = i22;
                            i36 = max;
                            i31++;
                            i28 = i11;
                            flexItemCount = i24;
                            i32 = i21;
                            i29 = i25;
                            list2 = list4;
                            size = i17;
                            mode = i19;
                        }
                    }
                    i26 = i13;
                    if (i33 <= i26) {
                    }
                    i35 = i22;
                    i36 = max;
                    i31++;
                    i28 = i11;
                    flexItemCount = i24;
                    i32 = i21;
                    i29 = i25;
                    list2 = list4;
                    size = i17;
                    mode = i19;
                }
                i21 = i32;
                i17 = size;
                i19 = mode;
                i24 = flexItemCount;
                list4 = list2;
                i25 = i29;
                i31++;
                i28 = i11;
                flexItemCount = i24;
                i32 = i21;
                i29 = i25;
                list2 = list4;
                size = i17;
                mode = i19;
            } else {
                i16 = i34;
                bVar2 = bVar;
                break;
            }
        }
        bVar2.f15881b = i16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m18995c(b bVar, int i11, int i12) {
        m18994b(bVar, i11, i12, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m18996d(b bVar, int i11, int i12) {
        m18994b(bVar, i12, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m18997h(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f15875a.getFlexItemCount();
        return m18968L(flexItemCount, m18975g(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public int[] m18998i(View view, int i11, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f15875a.getFlexItemCount();
        List m18975g = m18975g(flexItemCount);
        c cVar = new c();
        if (view != null && (layoutParams instanceof FlexItem)) {
            cVar.f15883q = ((FlexItem) layoutParams).getOrder();
        } else {
            cVar.f15883q = 1;
        }
        if (i11 != -1 && i11 != flexItemCount) {
            if (i11 < this.f15875a.getFlexItemCount()) {
                cVar.f15882p = i11;
                while (i11 < flexItemCount) {
                    ((c) m18975g.get(i11)).f15882p++;
                    i11++;
                }
            } else {
                cVar.f15882p = flexItemCount;
            }
        } else {
            cVar.f15882p = flexItemCount;
        }
        m18975g.add(cVar);
        return m18968L(flexItemCount + 1, m18975g, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m18999j(int i11, int i12, int i13) {
        int i14;
        int i15;
        int flexDirection = this.f15875a.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            i14 = View.MeasureSpec.getMode(i11);
            i15 = View.MeasureSpec.getSize(i11);
        } else {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            i14 = mode;
            i15 = size;
        }
        List<C4004b> flexLinesInternal = this.f15875a.getFlexLinesInternal();
        if (i14 == 1073741824) {
            int sumOfCrossSize = this.f15875a.getSumOfCrossSize() + i13;
            int i16 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C4004b) flexLinesInternal.get(0)).f15865g = i15 - i13;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f15875a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i15) {
                                    float size2 = (i15 - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f11 = 0.0f;
                                    while (i16 < size3) {
                                        C4004b c4004b = (C4004b) flexLinesInternal.get(i16);
                                        float f12 = c4004b.f15865g + size2;
                                        if (i16 == flexLinesInternal.size() - 1) {
                                            f12 += f11;
                                            f11 = 0.0f;
                                        }
                                        int round = Math.round(f12);
                                        f11 += f12 - round;
                                        if (f11 > 1.0f) {
                                            round++;
                                            f11 -= 1.0f;
                                        } else if (f11 < -1.0f) {
                                            round--;
                                            f11 += 1.0f;
                                        }
                                        c4004b.f15865g = round;
                                        i16++;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (sumOfCrossSize >= i15) {
                                this.f15875a.setFlexLines(m18974f(flexLinesInternal, i15, sumOfCrossSize));
                                return;
                            }
                            int size4 = (i15 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                            ArrayList arrayList = new ArrayList();
                            C4004b c4004b2 = new C4004b();
                            c4004b2.f15865g = size4;
                            for (C4004b c4004b3 : flexLinesInternal) {
                                arrayList.add(c4004b2);
                                arrayList.add(c4004b3);
                                arrayList.add(c4004b2);
                            }
                            this.f15875a.setFlexLines(arrayList);
                            return;
                        }
                        if (sumOfCrossSize < i15) {
                            float size5 = (i15 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f13 = 0.0f;
                            while (i16 < size6) {
                                arrayList2.add((C4004b) flexLinesInternal.get(i16));
                                if (i16 != flexLinesInternal.size() - 1) {
                                    C4004b c4004b4 = new C4004b();
                                    if (i16 == flexLinesInternal.size() - 2) {
                                        c4004b4.f15865g = Math.round(f13 + size5);
                                        f13 = 0.0f;
                                    } else {
                                        c4004b4.f15865g = Math.round(size5);
                                    }
                                    int i17 = c4004b4.f15865g;
                                    f13 += size5 - i17;
                                    if (f13 > 1.0f) {
                                        c4004b4.f15865g = i17 + 1;
                                        f13 -= 1.0f;
                                    } else if (f13 < -1.0f) {
                                        c4004b4.f15865g = i17 - 1;
                                        f13 += 1.0f;
                                    }
                                    arrayList2.add(c4004b4);
                                }
                                i16++;
                            }
                            this.f15875a.setFlexLines(arrayList2);
                            return;
                        }
                        return;
                    }
                    this.f15875a.setFlexLines(m18974f(flexLinesInternal, i15, sumOfCrossSize));
                    return;
                }
                int i18 = i15 - sumOfCrossSize;
                C4004b c4004b5 = new C4004b();
                c4004b5.f15865g = i18;
                flexLinesInternal.add(0, c4004b5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m19000k(int i11, int i12) {
        m19001l(i11, i12, 0);
    }

    /* renamed from: l */
    void m19001l(int i11, int i12, int i13) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i14;
        m18976m(this.f15875a.getFlexItemCount());
        if (i13 >= this.f15875a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f15875a.getFlexDirection();
        int flexDirection2 = this.f15875a.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
            if (mode != 1073741824) {
                size = this.f15875a.getLargestMainSize();
            }
            paddingLeft = this.f15875a.getPaddingTop();
            paddingRight = this.f15875a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f15875a.getLargestMainSize();
            }
            paddingLeft = this.f15875a.getPaddingLeft();
            paddingRight = this.f15875a.getPaddingRight();
        }
        int i15 = paddingLeft + paddingRight;
        int[] iArr = this.f15877c;
        if (iArr != null) {
            i14 = iArr[i13];
        } else {
            i14 = 0;
        }
        List flexLinesInternal = this.f15875a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i14 < size2) {
            C4004b c4004b = (C4004b) flexLinesInternal.get(i14);
            if (c4004b.f15863e < size) {
                m18977n(i11, i12, c4004b, size, i15, false);
            } else {
                m18967K(i11, i12, c4004b, size, i15, false);
            }
            i14++;
        }
    }

    /* renamed from: o */
    int m19002o(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: p */
    int m19003p(long j11) {
        return (int) j11;
    }
}
