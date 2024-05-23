package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p045c1.AbstractC3192k;
import p045c1.AbstractC3194m;
import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3189h;
import p088d1.C17693b;

/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: M */
    private static C1299g f5463M;

    /* renamed from: A */
    private int f5464A;

    /* renamed from: B */
    private HashMap f5465B;

    /* renamed from: C */
    private int f5466C;

    /* renamed from: D */
    private int f5467D;

    /* renamed from: E */
    int f5468E;

    /* renamed from: F */
    int f5469F;

    /* renamed from: G */
    int f5470G;

    /* renamed from: H */
    int f5471H;

    /* renamed from: I */
    private SparseArray f5472I;

    /* renamed from: J */
    C1292b f5473J;

    /* renamed from: K */
    private int f5474K;

    /* renamed from: L */
    private int f5475L;

    /* renamed from: p */
    SparseArray f5476p;

    /* renamed from: q */
    private ArrayList f5477q;

    /* renamed from: r */
    protected C3187f f5478r;

    /* renamed from: s */
    private int f5479s;

    /* renamed from: t */
    private int f5480t;

    /* renamed from: u */
    private int f5481u;

    /* renamed from: v */
    private int f5482v;

    /* renamed from: w */
    protected boolean f5483w;

    /* renamed from: x */
    private int f5484x;

    /* renamed from: y */
    private C1295c f5485y;

    /* renamed from: z */
    protected C1294b f5486z;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C1291a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5563a;

        static {
            int[] iArr = new int[C3186e.b.values().length];
            f5563a = iArr;
            try {
                iArr[C3186e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5563a[C3186e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5563a[C3186e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5563a[C3186e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes2.dex */
    public class C1292b implements C17693b.b {

        /* renamed from: a */
        ConstraintLayout f5564a;

        /* renamed from: b */
        int f5565b;

        /* renamed from: c */
        int f5566c;

        /* renamed from: d */
        int f5567d;

        /* renamed from: e */
        int f5568e;

        /* renamed from: f */
        int f5569f;

        /* renamed from: g */
        int f5570g;

        public C1292b(ConstraintLayout constraintLayout) {
            this.f5564a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m6391d(int i11, int i12, int i13) {
            if (i11 == i12) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i11);
            View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i13 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // p088d1.C17693b.b
        /* renamed from: a */
        public final void mo6392a() {
            int childCount = this.f5564a.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f5564a.getChildAt(i11);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).m6399b(this.f5564a);
                }
            }
            int size = this.f5564a.f5477q.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ((ConstraintHelper) this.f5564a.f5477q.get(i12)).m6366s(this.f5564a);
                }
            }
        }

        @Override // p088d1.C17693b.b
        /* renamed from: b */
        public final void mo6393b(C3186e c3186e, C17693b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            int baseline;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z21;
            boolean z22;
            boolean z23;
            if (c3186e == null) {
                return;
            }
            if (c3186e.m16068X() == 8 && !c3186e.m16100l0()) {
                aVar.f89706e = 0;
                aVar.f89707f = 0;
                aVar.f89708g = 0;
                return;
            }
            if (c3186e.m16048M() == null) {
                return;
            }
            C3186e.b bVar = aVar.f89702a;
            C3186e.b bVar2 = aVar.f89703b;
            int i16 = aVar.f89704c;
            int i17 = aVar.f89705d;
            int i18 = this.f5565b + this.f5566c;
            int i19 = this.f5567d;
            View view = (View) c3186e.m16123u();
            int[] iArr = C1291a.f5563a;
            int i21 = iArr[bVar.ordinal()];
            if (i21 != 1) {
                if (i21 != 2) {
                    if (i21 != 3) {
                        if (i21 != 4) {
                            makeMeasureSpec = 0;
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5569f, i19, -2);
                            if (c3186e.f13565w == 1) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            int i22 = aVar.f89711j;
                            if (i22 == C17693b.a.f89700l || i22 == C17693b.a.f89701m) {
                                if (view.getMeasuredHeight() == c3186e.m16133z()) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (aVar.f89711j == C17693b.a.f89701m || !z22 || ((z22 && z23) || (view instanceof Placeholder) || c3186e.mo15987p0())) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c3186e.m16070Y(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5569f, i19 + c3186e.m16030D(), -1);
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5569f, i19, -2);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            }
            int i23 = iArr[bVar2.ordinal()];
            if (i23 != 1) {
                if (i23 != 2) {
                    if (i23 != 3) {
                        if (i23 != 4) {
                            makeMeasureSpec2 = 0;
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5570g, i18, -2);
                            if (c3186e.f13567x == 1) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            int i24 = aVar.f89711j;
                            if (i24 == C17693b.a.f89700l || i24 == C17693b.a.f89701m) {
                                if (view.getMeasuredWidth() == c3186e.m16070Y()) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (aVar.f89711j == C17693b.a.f89701m || !z19 || ((z19 && z21) || (view instanceof Placeholder) || c3186e.mo15988q0())) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c3186e.m16133z(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5570g, i18 + c3186e.m16066W(), -1);
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5570g, i18, -2);
                }
            } else {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
            }
            C3187f c3187f = (C3187f) c3186e.m16048M();
            if (c3187f != null && AbstractC3192k.m16241b(ConstraintLayout.this.f5484x, 256) && view.getMeasuredWidth() == c3186e.m16070Y() && view.getMeasuredWidth() < c3187f.m16070Y() && view.getMeasuredHeight() == c3186e.m16133z() && view.getMeasuredHeight() < c3187f.m16133z() && view.getBaseline() == c3186e.m16114r() && !c3186e.m16108o0() && m6391d(c3186e.m16032E(), makeMeasureSpec, c3186e.m16070Y()) && m6391d(c3186e.m16034F(), makeMeasureSpec2, c3186e.m16133z())) {
                aVar.f89706e = c3186e.m16070Y();
                aVar.f89707f = c3186e.m16133z();
                aVar.f89708g = c3186e.m16114r();
                return;
            }
            C3186e.b bVar3 = C3186e.b.MATCH_CONSTRAINT;
            if (bVar == bVar3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (bVar2 == bVar3) {
                z12 = true;
            } else {
                z12 = false;
            }
            C3186e.b bVar4 = C3186e.b.MATCH_PARENT;
            if (bVar2 != bVar4 && bVar2 != C3186e.b.FIXED) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (bVar != bVar4 && bVar != C3186e.b.FIXED) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (z11 && c3186e.f13532f0 > 0.0f) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z12 && c3186e.f13532f0 > 0.0f) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i25 = aVar.f89711j;
            if (i25 != C17693b.a.f89700l && i25 != C17693b.a.f89701m && z11 && c3186e.f13565w == 0 && z12 && c3186e.f13567x == 0) {
                i15 = -1;
                i13 = 0;
                baseline = 0;
                i11 = 0;
            } else {
                if ((view instanceof VirtualLayout) && (c3186e instanceof AbstractC3194m)) {
                    ((VirtualLayout) view).mo5938y((AbstractC3194m) c3186e, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                c3186e.m16071Y0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i26 = c3186e.f13571z;
                if (i26 > 0) {
                    i11 = Math.max(i26, measuredWidth);
                } else {
                    i11 = measuredWidth;
                }
                int i27 = c3186e.f13476A;
                if (i27 > 0) {
                    i11 = Math.min(i27, i11);
                }
                int i28 = c3186e.f13480C;
                if (i28 > 0) {
                    i13 = Math.max(i28, measuredHeight);
                    i12 = makeMeasureSpec;
                } else {
                    i12 = makeMeasureSpec;
                    i13 = measuredHeight;
                }
                int i29 = c3186e.f13482D;
                if (i29 > 0) {
                    i13 = Math.min(i29, i13);
                }
                if (!AbstractC3192k.m16241b(ConstraintLayout.this.f5484x, 1)) {
                    if (z15 && z13) {
                        i11 = (int) ((i13 * c3186e.f13532f0) + 0.5f);
                    } else if (z16 && z14) {
                        i13 = (int) ((i11 / c3186e.f13532f0) + 0.5f);
                    }
                }
                if (measuredWidth != i11 || measuredHeight != i13) {
                    if (measuredWidth != i11) {
                        i14 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    } else {
                        i14 = i12;
                    }
                    if (measuredHeight != i13) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    }
                    view.measure(i14, makeMeasureSpec2);
                    c3186e.m16071Y0(i14, makeMeasureSpec2);
                    i11 = view.getMeasuredWidth();
                    i13 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i15 = -1;
            }
            if (baseline != i15) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i11 == aVar.f89704c && i13 == aVar.f89705d) {
                z18 = false;
            } else {
                z18 = true;
            }
            aVar.f89710i = z18;
            if (layoutParams.f5526g0) {
                z17 = true;
            }
            if (z17 && baseline != -1 && c3186e.m16114r() != baseline) {
                aVar.f89710i = true;
            }
            aVar.f89706e = i11;
            aVar.f89707f = i13;
            aVar.f89709h = z17;
            aVar.f89708g = baseline;
        }

        /* renamed from: c */
        public void m6394c(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f5565b = i13;
            this.f5566c = i14;
            this.f5567d = i15;
            this.f5568e = i16;
            this.f5569f = i11;
            this.f5570g = i12;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5476p = new SparseArray();
        this.f5477q = new ArrayList(4);
        this.f5478r = new C3187f();
        this.f5479s = 0;
        this.f5480t = 0;
        this.f5481u = Integer.MAX_VALUE;
        this.f5482v = Integer.MAX_VALUE;
        this.f5483w = true;
        this.f5484x = 257;
        this.f5485y = null;
        this.f5486z = null;
        this.f5464A = -1;
        this.f5465B = new HashMap();
        this.f5466C = -1;
        this.f5467D = -1;
        this.f5468E = -1;
        this.f5469F = -1;
        this.f5470G = 0;
        this.f5471H = 0;
        this.f5472I = new SparseArray();
        this.f5473J = new C1292b(this);
        this.f5474K = 0;
        this.f5475L = 0;
        m6374n(attributeSet, 0, 0);
    }

    /* renamed from: B */
    private void m6369B(C3186e c3186e, LayoutParams layoutParams, SparseArray sparseArray, int i11, C3185d.b bVar) {
        View view = (View) this.f5476p.get(i11);
        C3186e c3186e2 = (C3186e) sparseArray.get(i11);
        if (c3186e2 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f5526g0 = true;
            C3185d.b bVar2 = C3185d.b.BASELINE;
            if (bVar == bVar2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f5526g0 = true;
                layoutParams2.f5556v0.m16051N0(true);
            }
            c3186e.mo16112q(bVar2).m15999b(c3186e2.mo16112q(bVar), layoutParams.f5490D, layoutParams.f5489C, true);
            c3186e.m16051N0(true);
            c3186e.mo16112q(C3185d.b.TOP).m16014q();
            c3186e.mo16112q(C3185d.b.BOTTOM).m16014q();
        }
    }

    /* renamed from: C */
    private boolean m6370C() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            if (getChildAt(i11).isLayoutRequested()) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (z11) {
            m6376y();
        }
        return z11;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static C1299g getSharedValues() {
        if (f5463M == null) {
            f5463M = new C1299g();
        }
        return f5463M;
    }

    /* renamed from: h */
    private final C3186e m6373h(int i11) {
        if (i11 == 0) {
            return this.f5478r;
        }
        View view = (View) this.f5476p.get(i11);
        if (view == null && (view = findViewById(i11)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f5478r;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f5556v0;
    }

    /* renamed from: n */
    private void m6374n(AttributeSet attributeSet, int i11, int i12) {
        this.f5478r.m16033E0(this);
        this.f5478r.m16159Y1(this.f5473J);
        this.f5476p.put(getId(), this);
        this.f5485y = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout, i11, i12);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == AbstractC1298f.ConstraintLayout_Layout_android_minWidth) {
                    this.f5479s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5479s);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_minHeight) {
                    this.f5480t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5480t);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_maxWidth) {
                    this.f5481u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5481u);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_maxHeight) {
                    this.f5482v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5482v);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f5484x = obtainStyledAttributes.getInt(index, this.f5484x);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo6013u(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5486z = null;
                        }
                    }
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1295c c1295c = new C1295c();
                        this.f5485y = c1295c;
                        c1295c.m6442D(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f5485y = null;
                    }
                    this.f5464A = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5478r.m16160Z1(this.f5484x);
    }

    /* renamed from: q */
    private void m6375q() {
        this.f5483w = true;
        this.f5466C = -1;
        this.f5467D = -1;
        this.f5468E = -1;
        this.f5469F = -1;
        this.f5470G = 0;
        this.f5471H = 0;
    }

    /* renamed from: y */
    private void m6376y() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            C3186e m6383m = m6383m(getChildAt(i11));
            if (m6383m != null) {
                m6383m.mo16126v0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m6387z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m6373h(childAt.getId()).m16035F0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f5464A != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f5464A && (childAt2 instanceof Constraints)) {
                    this.f5485y = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C1295c c1295c = this.f5485y;
        if (c1295c != null) {
            c1295c.m6452k(this, true);
        }
        this.f5478r.m16266x1();
        int size = this.f5477q.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((ConstraintHelper) this.f5477q.get(i14)).m6367v(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).m6400c(this);
            }
        }
        this.f5472I.clear();
        this.f5472I.put(0, this.f5478r);
        this.f5472I.put(getId(), this.f5478r);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.f5472I.put(childAt4.getId(), m6383m(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            C3186e m6383m2 = m6383m(childAt5);
            if (m6383m2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f5478r.m16263a(m6383m2);
                m6378d(isInEditMode, childAt5, m6383m2, layoutParams, this.f5472I);
            }
        }
    }

    /* renamed from: A */
    protected void m6377A(C3187f c3187f, int i11, int i12, int i13, int i14) {
        C3186e.b bVar;
        C1292b c1292b = this.f5473J;
        int i15 = c1292b.f5568e;
        int i16 = c1292b.f5567d;
        C3186e.b bVar2 = C3186e.b.FIXED;
        int childCount = getChildCount();
        if (i11 != Integer.MIN_VALUE) {
            if (i11 != 0) {
                if (i11 != 1073741824) {
                    bVar = bVar2;
                    i12 = 0;
                } else {
                    i12 = Math.min(this.f5481u - i16, i12);
                    bVar = bVar2;
                }
            } else {
                bVar = C3186e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i12 = Math.max(0, this.f5479s);
                }
                i12 = 0;
            }
        } else {
            bVar = C3186e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.f5479s);
            }
        }
        if (i13 != Integer.MIN_VALUE) {
            if (i13 != 0) {
                if (i13 == 1073741824) {
                    i14 = Math.min(this.f5482v - i15, i14);
                }
                i14 = 0;
            } else {
                bVar2 = C3186e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i14 = Math.max(0, this.f5480t);
                }
                i14 = 0;
            }
        } else {
            bVar2 = C3186e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.f5480t);
            }
        }
        if (i12 != c3187f.m16070Y() || i14 != c3187f.m16133z()) {
            c3187f.m16153Q1();
        }
        c3187f.m16111p1(0);
        c3187f.m16113q1(0);
        c3187f.m16075a1(this.f5481u - i16);
        c3187f.m16073Z0(this.f5482v - i15);
        c3187f.m16081d1(0);
        c3187f.m16079c1(0);
        c3187f.m16059S0(bVar);
        c3187f.m16106n1(i12);
        c3187f.m16095j1(bVar2);
        c3187f.m16053O0(i14);
        c3187f.m16081d1(this.f5479s - i16);
        c3187f.m16079c1(this.f5480t - i15);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m6378d(boolean z11, View view, C3186e c3186e, LayoutParams layoutParams, SparseArray sparseArray) {
        C3186e c3186e2;
        C3186e c3186e3;
        C3186e c3186e4;
        C3186e c3186e5;
        int i11;
        layoutParams.m6390c();
        layoutParams.f5558w0 = false;
        c3186e.m16104m1(view.getVisibility());
        if (layoutParams.f5532j0) {
            c3186e.m16067W0(true);
            c3186e.m16104m1(8);
        }
        c3186e.m16033E0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).mo5937q(c3186e, this.f5478r.m16155S1());
        }
        if (layoutParams.f5528h0) {
            C3189h c3189h = (C3189h) c3186e;
            int i12 = layoutParams.f5550s0;
            int i13 = layoutParams.f5552t0;
            float f11 = layoutParams.f5554u0;
            if (f11 != -1.0f) {
                c3189h.m16227C1(f11);
                return;
            } else if (i12 != -1) {
                c3189h.m16225A1(i12);
                return;
            } else {
                if (i13 != -1) {
                    c3189h.m16226B1(i13);
                    return;
                }
                return;
            }
        }
        int i14 = layoutParams.f5536l0;
        int i15 = layoutParams.f5538m0;
        int i16 = layoutParams.f5540n0;
        int i17 = layoutParams.f5542o0;
        int i18 = layoutParams.f5544p0;
        int i19 = layoutParams.f5546q0;
        float f12 = layoutParams.f5548r0;
        int i21 = layoutParams.f5543p;
        if (i21 != -1) {
            C3186e c3186e6 = (C3186e) sparseArray.get(i21);
            if (c3186e6 != null) {
                c3186e.m16102m(c3186e6, layoutParams.f5547r, layoutParams.f5545q);
            }
        } else {
            if (i14 != -1) {
                C3186e c3186e7 = (C3186e) sparseArray.get(i14);
                if (c3186e7 != null) {
                    C3185d.b bVar = C3185d.b.LEFT;
                    c3186e.m16088g0(bVar, c3186e7, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i18);
                }
            } else if (i15 != -1 && (c3186e2 = (C3186e) sparseArray.get(i15)) != null) {
                c3186e.m16088g0(C3185d.b.LEFT, c3186e2, C3185d.b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i18);
            }
            if (i16 != -1) {
                C3186e c3186e8 = (C3186e) sparseArray.get(i16);
                if (c3186e8 != null) {
                    c3186e.m16088g0(C3185d.b.RIGHT, c3186e8, C3185d.b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i19);
                }
            } else if (i17 != -1 && (c3186e3 = (C3186e) sparseArray.get(i17)) != null) {
                C3185d.b bVar2 = C3185d.b.RIGHT;
                c3186e.m16088g0(bVar2, c3186e3, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i19);
            }
            int i22 = layoutParams.f5529i;
            if (i22 != -1) {
                C3186e c3186e9 = (C3186e) sparseArray.get(i22);
                if (c3186e9 != null) {
                    C3185d.b bVar3 = C3185d.b.TOP;
                    c3186e.m16088g0(bVar3, c3186e9, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f5559x);
                }
            } else {
                int i23 = layoutParams.f5531j;
                if (i23 != -1 && (c3186e4 = (C3186e) sparseArray.get(i23)) != null) {
                    c3186e.m16088g0(C3185d.b.TOP, c3186e4, C3185d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f5559x);
                }
            }
            int i24 = layoutParams.f5533k;
            if (i24 != -1) {
                C3186e c3186e10 = (C3186e) sparseArray.get(i24);
                if (c3186e10 != null) {
                    c3186e.m16088g0(C3185d.b.BOTTOM, c3186e10, C3185d.b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f5561z);
                }
            } else {
                int i25 = layoutParams.f5535l;
                if (i25 != -1 && (c3186e5 = (C3186e) sparseArray.get(i25)) != null) {
                    C3185d.b bVar4 = C3185d.b.BOTTOM;
                    c3186e.m16088g0(bVar4, c3186e5, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f5561z);
                }
            }
            int i26 = layoutParams.f5537m;
            if (i26 != -1) {
                m6369B(c3186e, layoutParams, sparseArray, i26, C3185d.b.BASELINE);
            } else {
                int i27 = layoutParams.f5539n;
                if (i27 != -1) {
                    m6369B(c3186e, layoutParams, sparseArray, i27, C3185d.b.TOP);
                } else {
                    int i28 = layoutParams.f5541o;
                    if (i28 != -1) {
                        m6369B(c3186e, layoutParams, sparseArray, i28, C3185d.b.BOTTOM);
                    }
                }
            }
            if (f12 >= 0.0f) {
                c3186e.m16055P0(f12);
            }
            float f13 = layoutParams.f5494H;
            if (f13 >= 0.0f) {
                c3186e.m16089g1(f13);
            }
        }
        if (z11 && ((i11 = layoutParams.f5510X) != -1 || layoutParams.f5511Y != -1)) {
            c3186e.m16084e1(i11, layoutParams.f5511Y);
        }
        if (!layoutParams.f5522e0) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.f5514a0) {
                    c3186e.m16059S0(C3186e.b.MATCH_CONSTRAINT);
                } else {
                    c3186e.m16059S0(C3186e.b.MATCH_PARENT);
                }
                c3186e.mo16112q(C3185d.b.LEFT).f13461g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                c3186e.mo16112q(C3185d.b.RIGHT).f13461g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                c3186e.m16059S0(C3186e.b.MATCH_CONSTRAINT);
                c3186e.m16106n1(0);
            }
        } else {
            c3186e.m16059S0(C3186e.b.FIXED);
            c3186e.m16106n1(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                c3186e.m16059S0(C3186e.b.WRAP_CONTENT);
            }
        }
        if (!layoutParams.f5524f0) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.f5516b0) {
                    c3186e.m16095j1(C3186e.b.MATCH_CONSTRAINT);
                } else {
                    c3186e.m16095j1(C3186e.b.MATCH_PARENT);
                }
                c3186e.mo16112q(C3185d.b.TOP).f13461g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                c3186e.mo16112q(C3185d.b.BOTTOM).f13461g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                c3186e.m16095j1(C3186e.b.MATCH_CONSTRAINT);
                c3186e.m16053O0(0);
            }
        } else {
            c3186e.m16095j1(C3186e.b.FIXED);
            c3186e.m16053O0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                c3186e.m16095j1(C3186e.b.WRAP_CONTENT);
            }
        }
        c3186e.m16037G0(layoutParams.f5495I);
        c3186e.m16063U0(layoutParams.f5498L);
        c3186e.m16101l1(layoutParams.f5499M);
        c3186e.m16057Q0(layoutParams.f5500N);
        c3186e.m16090h1(layoutParams.f5501O);
        c3186e.m16109o1(layoutParams.f5520d0);
        c3186e.m16061T0(layoutParams.f5502P, layoutParams.f5504R, layoutParams.f5506T, layoutParams.f5508V);
        c3186e.m16098k1(layoutParams.f5503Q, layoutParams.f5505S, layoutParams.f5507U, layoutParams.f5509W);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f5477q;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((ConstraintHelper) this.f5477q.get(i11)).mo5943u(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i13 = (int) ((parseInt / 1080.0f) * width);
                        int i14 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f11 = i13;
                        float f12 = i14;
                        float f13 = i13 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f11, f12, f13, f12, paint);
                        float parseInt4 = i14 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f13, f12, f13, parseInt4, paint);
                        canvas.drawLine(f13, parseInt4, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f11, f12, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f11, f12, f13, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f13, f12, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        m6375q();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object m6381g(int i11, Object obj) {
        if (i11 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap hashMap = this.f5465B;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f5465B.get(str);
            }
            return null;
        }
        return null;
    }

    public int getMaxHeight() {
        return this.f5482v;
    }

    public int getMaxWidth() {
        return this.f5481u;
    }

    public int getMinHeight() {
        return this.f5480t;
    }

    public int getMinWidth() {
        return this.f5479s;
    }

    public int getOptimizationLevel() {
        return this.f5478r.m16149M1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f5478r.f13549o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f5478r.f13549o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f5478r.f13549o = "parent";
            }
        }
        if (this.f5478r.m16125v() == null) {
            C3187f c3187f = this.f5478r;
            c3187f.m16035F0(c3187f.f13549o);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" setDebugName ");
            sb3.append(this.f5478r.m16125v());
        }
        Iterator it = this.f5478r.m16264u1().iterator();
        while (it.hasNext()) {
            C3186e c3186e = (C3186e) it.next();
            View view = (View) c3186e.m16123u();
            if (view != null) {
                if (c3186e.f13549o == null && (id2 = view.getId()) != -1) {
                    c3186e.f13549o = getContext().getResources().getResourceEntryName(id2);
                }
                if (c3186e.m16125v() == null) {
                    c3186e.m16035F0(c3186e.f13549o);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(" setDebugName ");
                    sb4.append(c3186e.m16125v());
                }
            }
        }
        this.f5478r.mo16056Q(sb2);
        return sb2.toString();
    }

    /* renamed from: l */
    public View m6382l(int i11) {
        return (View) this.f5476p.get(i11);
    }

    /* renamed from: m */
    public final C3186e m6383m(View view) {
        if (view == this) {
            return this.f5478r;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams) view.getLayoutParams()).f5556v0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams) view.getLayoutParams()).f5556v0;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C3186e c3186e = layoutParams.f5556v0;
            if ((childAt.getVisibility() != 8 || layoutParams.f5528h0 || layoutParams.f5530i0 || layoutParams.f5534k0 || isInEditMode) && !layoutParams.f5532j0) {
                int m16072Z = c3186e.m16072Z();
                int m16074a0 = c3186e.m16074a0();
                int m16070Y = c3186e.m16070Y() + m16072Z;
                int m16133z = c3186e.m16133z() + m16074a0;
                childAt.layout(m16072Z, m16074a0, m16070Y, m16133z);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m16072Z, m16074a0, m16070Y, m16133z);
                }
            }
        }
        int size = this.f5477q.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                ((ConstraintHelper) this.f5477q.get(i16)).mo5942r(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f5474K == i11) {
            int i13 = this.f5475L;
        }
        if (!this.f5483w) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (getChildAt(i14).isLayoutRequested()) {
                    this.f5483w = true;
                    break;
                }
                i14++;
            }
        }
        this.f5474K = i11;
        this.f5475L = i12;
        this.f5478r.m16162b2(m6384p());
        if (this.f5483w) {
            this.f5483w = false;
            if (m6370C()) {
                this.f5478r.m16164d2();
            }
        }
        m6386x(this.f5478r, this.f5484x, i11, i12);
        m6385w(i11, i12, this.f5478r.m16070Y(), this.f5478r.m16133z(), this.f5478r.m16156T1(), this.f5478r.m16154R1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C3186e m6383m = m6383m(view);
        if ((view instanceof Guideline) && !(m6383m instanceof C3189h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C3189h c3189h = new C3189h();
            layoutParams.f5556v0 = c3189h;
            layoutParams.f5528h0 = true;
            c3189h.m16228D1(layoutParams.f5512Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m6368x();
            ((LayoutParams) view.getLayoutParams()).f5530i0 = true;
            if (!this.f5477q.contains(constraintHelper)) {
                this.f5477q.add(constraintHelper);
            }
        }
        this.f5476p.put(view.getId(), view);
        this.f5483w = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5476p.remove(view.getId());
        this.f5478r.m16265w1(m6383m(view));
        this.f5477q.remove(view);
        this.f5483w = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean m6384p() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m6375q();
        super.requestLayout();
    }

    public void setConstraintSet(C1295c c1295c) {
        this.f5485y = c1295c;
    }

    @Override // android.view.View
    public void setId(int i11) {
        this.f5476p.remove(getId());
        super.setId(i11);
        this.f5476p.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.f5482v) {
            return;
        }
        this.f5482v = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.f5481u) {
            return;
        }
        this.f5481u = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.f5480t) {
            return;
        }
        this.f5480t = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.f5479s) {
            return;
        }
        this.f5479s = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1296d abstractC1296d) {
        C1294b c1294b = this.f5486z;
        if (c1294b != null) {
            c1294b.m6414c(abstractC1296d);
        }
    }

    public void setOptimizationLevel(int i11) {
        this.f5484x = i11;
        this.f5478r.m16160Z1(i11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    protected void mo6013u(int i11) {
        this.f5486z = new C1294b(getContext(), this, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public void m6385w(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        C1292b c1292b = this.f5473J;
        int i15 = c1292b.f5568e;
        int resolveSizeAndState = View.resolveSizeAndState(i13 + c1292b.f5567d, i11, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i14 + i15, i12, 0) & 16777215;
        int min = Math.min(this.f5481u, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f5482v, resolveSizeAndState2);
        if (z11) {
            min |= 16777216;
        }
        if (z12) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f5466C = min;
        this.f5467D = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void m6386x(C3187f c3187f, int i11, int i12, int i13) {
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i15 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f5473J.m6394c(i12, i13, max, max2, paddingWidth, i15);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i14 = Math.max(0, getPaddingLeft());
        } else if (m6384p()) {
            i14 = max4;
        } else {
            i14 = max3;
        }
        int i16 = size - paddingWidth;
        int i17 = size2 - i15;
        m6377A(c3187f, mode, i16, mode2, i17);
        c3187f.m16157U1(i11, mode, i16, mode2, i17, this.f5466C, this.f5467D, i14, max);
    }

    /* renamed from: z */
    public void m6387z(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f5465B == null) {
                this.f5465B = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f5465B.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5476p = new SparseArray();
        this.f5477q = new ArrayList(4);
        this.f5478r = new C3187f();
        this.f5479s = 0;
        this.f5480t = 0;
        this.f5481u = Integer.MAX_VALUE;
        this.f5482v = Integer.MAX_VALUE;
        this.f5483w = true;
        this.f5484x = 257;
        this.f5485y = null;
        this.f5486z = null;
        this.f5464A = -1;
        this.f5465B = new HashMap();
        this.f5466C = -1;
        this.f5467D = -1;
        this.f5468E = -1;
        this.f5469F = -1;
        this.f5470G = 0;
        this.f5471H = 0;
        this.f5472I = new SparseArray();
        this.f5473J = new C1292b(this);
        this.f5474K = 0;
        this.f5475L = 0;
        m6374n(attributeSet, i11, 0);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f5487A;

        /* renamed from: B */
        public int f5488B;

        /* renamed from: C */
        public int f5489C;

        /* renamed from: D */
        public int f5490D;

        /* renamed from: E */
        boolean f5491E;

        /* renamed from: F */
        boolean f5492F;

        /* renamed from: G */
        public float f5493G;

        /* renamed from: H */
        public float f5494H;

        /* renamed from: I */
        public String f5495I;

        /* renamed from: J */
        float f5496J;

        /* renamed from: K */
        int f5497K;

        /* renamed from: L */
        public float f5498L;

        /* renamed from: M */
        public float f5499M;

        /* renamed from: N */
        public int f5500N;

        /* renamed from: O */
        public int f5501O;

        /* renamed from: P */
        public int f5502P;

        /* renamed from: Q */
        public int f5503Q;

        /* renamed from: R */
        public int f5504R;

        /* renamed from: S */
        public int f5505S;

        /* renamed from: T */
        public int f5506T;

        /* renamed from: U */
        public int f5507U;

        /* renamed from: V */
        public float f5508V;

        /* renamed from: W */
        public float f5509W;

        /* renamed from: X */
        public int f5510X;

        /* renamed from: Y */
        public int f5511Y;

        /* renamed from: Z */
        public int f5512Z;

        /* renamed from: a */
        public int f5513a;

        /* renamed from: a0 */
        public boolean f5514a0;

        /* renamed from: b */
        public int f5515b;

        /* renamed from: b0 */
        public boolean f5516b0;

        /* renamed from: c */
        public float f5517c;

        /* renamed from: c0 */
        public String f5518c0;

        /* renamed from: d */
        public boolean f5519d;

        /* renamed from: d0 */
        public int f5520d0;

        /* renamed from: e */
        public int f5521e;

        /* renamed from: e0 */
        boolean f5522e0;

        /* renamed from: f */
        public int f5523f;

        /* renamed from: f0 */
        boolean f5524f0;

        /* renamed from: g */
        public int f5525g;

        /* renamed from: g0 */
        boolean f5526g0;

        /* renamed from: h */
        public int f5527h;

        /* renamed from: h0 */
        boolean f5528h0;

        /* renamed from: i */
        public int f5529i;

        /* renamed from: i0 */
        boolean f5530i0;

        /* renamed from: j */
        public int f5531j;

        /* renamed from: j0 */
        boolean f5532j0;

        /* renamed from: k */
        public int f5533k;

        /* renamed from: k0 */
        boolean f5534k0;

        /* renamed from: l */
        public int f5535l;

        /* renamed from: l0 */
        int f5536l0;

        /* renamed from: m */
        public int f5537m;

        /* renamed from: m0 */
        int f5538m0;

        /* renamed from: n */
        public int f5539n;

        /* renamed from: n0 */
        int f5540n0;

        /* renamed from: o */
        public int f5541o;

        /* renamed from: o0 */
        int f5542o0;

        /* renamed from: p */
        public int f5543p;

        /* renamed from: p0 */
        int f5544p0;

        /* renamed from: q */
        public int f5545q;

        /* renamed from: q0 */
        int f5546q0;

        /* renamed from: r */
        public float f5547r;

        /* renamed from: r0 */
        float f5548r0;

        /* renamed from: s */
        public int f5549s;

        /* renamed from: s0 */
        int f5550s0;

        /* renamed from: t */
        public int f5551t;

        /* renamed from: t0 */
        int f5552t0;

        /* renamed from: u */
        public int f5553u;

        /* renamed from: u0 */
        float f5554u0;

        /* renamed from: v */
        public int f5555v;

        /* renamed from: v0 */
        C3186e f5556v0;

        /* renamed from: w */
        public int f5557w;

        /* renamed from: w0 */
        public boolean f5558w0;

        /* renamed from: x */
        public int f5559x;

        /* renamed from: y */
        public int f5560y;

        /* renamed from: z */
        public int f5561z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        /* loaded from: classes2.dex */
        private static class C1290a {

            /* renamed from: a */
            public static final SparseIntArray f5562a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f5562a = sparseIntArray;
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(AbstractC1298f.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5513a = -1;
            this.f5515b = -1;
            this.f5517c = -1.0f;
            this.f5519d = true;
            this.f5521e = -1;
            this.f5523f = -1;
            this.f5525g = -1;
            this.f5527h = -1;
            this.f5529i = -1;
            this.f5531j = -1;
            this.f5533k = -1;
            this.f5535l = -1;
            this.f5537m = -1;
            this.f5539n = -1;
            this.f5541o = -1;
            this.f5543p = -1;
            this.f5545q = 0;
            this.f5547r = 0.0f;
            this.f5549s = -1;
            this.f5551t = -1;
            this.f5553u = -1;
            this.f5555v = -1;
            this.f5557w = Integer.MIN_VALUE;
            this.f5559x = Integer.MIN_VALUE;
            this.f5560y = Integer.MIN_VALUE;
            this.f5561z = Integer.MIN_VALUE;
            this.f5487A = Integer.MIN_VALUE;
            this.f5488B = Integer.MIN_VALUE;
            this.f5489C = Integer.MIN_VALUE;
            this.f5490D = 0;
            this.f5491E = true;
            this.f5492F = true;
            this.f5493G = 0.5f;
            this.f5494H = 0.5f;
            this.f5495I = null;
            this.f5496J = 0.0f;
            this.f5497K = 1;
            this.f5498L = -1.0f;
            this.f5499M = -1.0f;
            this.f5500N = 0;
            this.f5501O = 0;
            this.f5502P = 0;
            this.f5503Q = 0;
            this.f5504R = 0;
            this.f5505S = 0;
            this.f5506T = 0;
            this.f5507U = 0;
            this.f5508V = 1.0f;
            this.f5509W = 1.0f;
            this.f5510X = -1;
            this.f5511Y = -1;
            this.f5512Z = -1;
            this.f5514a0 = false;
            this.f5516b0 = false;
            this.f5518c0 = null;
            this.f5520d0 = 0;
            this.f5522e0 = true;
            this.f5524f0 = true;
            this.f5526g0 = false;
            this.f5528h0 = false;
            this.f5530i0 = false;
            this.f5532j0 = false;
            this.f5534k0 = false;
            this.f5536l0 = -1;
            this.f5538m0 = -1;
            this.f5540n0 = -1;
            this.f5542o0 = -1;
            this.f5544p0 = Integer.MIN_VALUE;
            this.f5546q0 = Integer.MIN_VALUE;
            this.f5548r0 = 0.5f;
            this.f5556v0 = new C3186e();
            this.f5558w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = C1290a.f5562a.get(index);
                switch (i12) {
                    case 1:
                        this.f5512Z = obtainStyledAttributes.getInt(index, this.f5512Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f5543p);
                        this.f5543p = resourceId;
                        if (resourceId == -1) {
                            this.f5543p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f5545q = obtainStyledAttributes.getDimensionPixelSize(index, this.f5545q);
                        break;
                    case 4:
                        float f11 = obtainStyledAttributes.getFloat(index, this.f5547r) % 360.0f;
                        this.f5547r = f11;
                        if (f11 < 0.0f) {
                            this.f5547r = (360.0f - f11) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f5513a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5513a);
                        break;
                    case 6:
                        this.f5515b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5515b);
                        break;
                    case 7:
                        this.f5517c = obtainStyledAttributes.getFloat(index, this.f5517c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f5521e);
                        this.f5521e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f5521e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f5523f);
                        this.f5523f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f5523f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f5525g);
                        this.f5525g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f5525g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f5527h);
                        this.f5527h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f5527h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f5529i);
                        this.f5529i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f5529i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f5531j);
                        this.f5531j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f5531j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f5533k);
                        this.f5533k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f5533k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f5535l);
                        this.f5535l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f5535l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f5537m);
                        this.f5537m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f5537m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f5549s);
                        this.f5549s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f5549s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f5551t);
                        this.f5551t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f5551t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f5553u);
                        this.f5553u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f5553u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f5555v);
                        this.f5555v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f5555v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f5557w = obtainStyledAttributes.getDimensionPixelSize(index, this.f5557w);
                        break;
                    case 22:
                        this.f5559x = obtainStyledAttributes.getDimensionPixelSize(index, this.f5559x);
                        break;
                    case 23:
                        this.f5560y = obtainStyledAttributes.getDimensionPixelSize(index, this.f5560y);
                        break;
                    case 24:
                        this.f5561z = obtainStyledAttributes.getDimensionPixelSize(index, this.f5561z);
                        break;
                    case 25:
                        this.f5487A = obtainStyledAttributes.getDimensionPixelSize(index, this.f5487A);
                        break;
                    case 26:
                        this.f5488B = obtainStyledAttributes.getDimensionPixelSize(index, this.f5488B);
                        break;
                    case 27:
                        this.f5514a0 = obtainStyledAttributes.getBoolean(index, this.f5514a0);
                        break;
                    case 28:
                        this.f5516b0 = obtainStyledAttributes.getBoolean(index, this.f5516b0);
                        break;
                    case 29:
                        this.f5493G = obtainStyledAttributes.getFloat(index, this.f5493G);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        this.f5494H = obtainStyledAttributes.getFloat(index, this.f5494H);
                        break;
                    case 31:
                        this.f5502P = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        this.f5503Q = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f5504R = obtainStyledAttributes.getDimensionPixelSize(index, this.f5504R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f5504R) == -2) {
                                this.f5504R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f5506T = obtainStyledAttributes.getDimensionPixelSize(index, this.f5506T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f5506T) == -2) {
                                this.f5506T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f5508V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f5508V));
                        this.f5502P = 2;
                        break;
                    case 36:
                        try {
                            this.f5505S = obtainStyledAttributes.getDimensionPixelSize(index, this.f5505S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f5505S) == -2) {
                                this.f5505S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f5507U = obtainStyledAttributes.getDimensionPixelSize(index, this.f5507U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f5507U) == -2) {
                                this.f5507U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f5509W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f5509W));
                        this.f5503Q = 2;
                        break;
                    default:
                        switch (i12) {
                            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                C1295c.m6422I(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f5498L = obtainStyledAttributes.getFloat(index, this.f5498L);
                                break;
                            case 46:
                                this.f5499M = obtainStyledAttributes.getFloat(index, this.f5499M);
                                break;
                            case 47:
                                this.f5500N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f5501O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f5510X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5510X);
                                break;
                            case 50:
                                this.f5511Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5511Y);
                                break;
                            case 51:
                                this.f5518c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f5539n);
                                this.f5539n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f5539n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f5541o);
                                this.f5541o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f5541o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f5490D = obtainStyledAttributes.getDimensionPixelSize(index, this.f5490D);
                                break;
                            case 55:
                                this.f5489C = obtainStyledAttributes.getDimensionPixelSize(index, this.f5489C);
                                break;
                            default:
                                switch (i12) {
                                    case 64:
                                        C1295c.m6420G(this, obtainStyledAttributes, index, 0);
                                        this.f5491E = true;
                                        break;
                                    case 65:
                                        C1295c.m6420G(this, obtainStyledAttributes, index, 1);
                                        this.f5492F = true;
                                        break;
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                        this.f5520d0 = obtainStyledAttributes.getInt(index, this.f5520d0);
                                        break;
                                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                        this.f5519d = obtainStyledAttributes.getBoolean(index, this.f5519d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m6390c();
        }

        /* renamed from: a */
        public String m6388a() {
            return this.f5518c0;
        }

        /* renamed from: b */
        public C3186e m6389b() {
            return this.f5556v0;
        }

        /* renamed from: c */
        public void m6390c() {
            this.f5528h0 = false;
            this.f5522e0 = true;
            this.f5524f0 = true;
            int i11 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i11 == -2 && this.f5514a0) {
                this.f5522e0 = false;
                if (this.f5502P == 0) {
                    this.f5502P = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.f5516b0) {
                this.f5524f0 = false;
                if (this.f5503Q == 0) {
                    this.f5503Q = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f5522e0 = false;
                if (i11 == 0 && this.f5502P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f5514a0 = true;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f5524f0 = false;
                if (i12 == 0 && this.f5503Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f5516b0 = true;
                }
            }
            if (this.f5517c != -1.0f || this.f5513a != -1 || this.f5515b != -1) {
                this.f5528h0 = true;
                this.f5522e0 = true;
                this.f5524f0 = true;
                if (!(this.f5556v0 instanceof C3189h)) {
                    this.f5556v0 = new C3189h();
                }
                ((C3189h) this.f5556v0).m16228D1(this.f5512Z);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i11) {
            boolean z11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i17 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i11);
            boolean z12 = false;
            if (1 == getLayoutDirection()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5540n0 = -1;
            this.f5542o0 = -1;
            this.f5536l0 = -1;
            this.f5538m0 = -1;
            this.f5544p0 = this.f5557w;
            this.f5546q0 = this.f5560y;
            float f11 = this.f5493G;
            this.f5548r0 = f11;
            int i18 = this.f5513a;
            this.f5550s0 = i18;
            int i19 = this.f5515b;
            this.f5552t0 = i19;
            float f12 = this.f5517c;
            this.f5554u0 = f12;
            if (z11) {
                int i21 = this.f5549s;
                if (i21 != -1) {
                    this.f5540n0 = i21;
                } else {
                    int i22 = this.f5551t;
                    if (i22 != -1) {
                        this.f5542o0 = i22;
                    }
                    i12 = this.f5553u;
                    if (i12 != -1) {
                        this.f5538m0 = i12;
                        z12 = true;
                    }
                    i13 = this.f5555v;
                    if (i13 != -1) {
                        this.f5536l0 = i13;
                        z12 = true;
                    }
                    i14 = this.f5487A;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f5546q0 = i14;
                    }
                    i15 = this.f5488B;
                    if (i15 != Integer.MIN_VALUE) {
                        this.f5544p0 = i15;
                    }
                    if (z12) {
                        this.f5548r0 = 1.0f - f11;
                    }
                    if (this.f5528h0 && this.f5512Z == 1 && this.f5519d) {
                        if (f12 == -1.0f) {
                            this.f5554u0 = 1.0f - f12;
                            this.f5550s0 = -1;
                            this.f5552t0 = -1;
                        } else if (i18 != -1) {
                            this.f5552t0 = i18;
                            this.f5550s0 = -1;
                            this.f5554u0 = -1.0f;
                        } else if (i19 != -1) {
                            this.f5550s0 = i19;
                            this.f5552t0 = -1;
                            this.f5554u0 = -1.0f;
                        }
                    }
                }
                z12 = true;
                i12 = this.f5553u;
                if (i12 != -1) {
                }
                i13 = this.f5555v;
                if (i13 != -1) {
                }
                i14 = this.f5487A;
                if (i14 != Integer.MIN_VALUE) {
                }
                i15 = this.f5488B;
                if (i15 != Integer.MIN_VALUE) {
                }
                if (z12) {
                }
                if (this.f5528h0) {
                    if (f12 == -1.0f) {
                    }
                }
            } else {
                int i23 = this.f5549s;
                if (i23 != -1) {
                    this.f5538m0 = i23;
                }
                int i24 = this.f5551t;
                if (i24 != -1) {
                    this.f5536l0 = i24;
                }
                int i25 = this.f5553u;
                if (i25 != -1) {
                    this.f5540n0 = i25;
                }
                int i26 = this.f5555v;
                if (i26 != -1) {
                    this.f5542o0 = i26;
                }
                int i27 = this.f5487A;
                if (i27 != Integer.MIN_VALUE) {
                    this.f5544p0 = i27;
                }
                int i28 = this.f5488B;
                if (i28 != Integer.MIN_VALUE) {
                    this.f5546q0 = i28;
                }
            }
            if (this.f5553u == -1 && this.f5555v == -1 && this.f5551t == -1 && this.f5549s == -1) {
                int i29 = this.f5525g;
                if (i29 != -1) {
                    this.f5540n0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                    }
                } else {
                    int i31 = this.f5527h;
                    if (i31 != -1) {
                        this.f5542o0 = i31;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                        }
                    }
                }
                int i32 = this.f5521e;
                if (i32 != -1) {
                    this.f5536l0 = i32;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                        return;
                    }
                    return;
                }
                int i33 = this.f5523f;
                if (i33 != -1) {
                    this.f5538m0 = i33;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                    }
                }
            }
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f5513a = -1;
            this.f5515b = -1;
            this.f5517c = -1.0f;
            this.f5519d = true;
            this.f5521e = -1;
            this.f5523f = -1;
            this.f5525g = -1;
            this.f5527h = -1;
            this.f5529i = -1;
            this.f5531j = -1;
            this.f5533k = -1;
            this.f5535l = -1;
            this.f5537m = -1;
            this.f5539n = -1;
            this.f5541o = -1;
            this.f5543p = -1;
            this.f5545q = 0;
            this.f5547r = 0.0f;
            this.f5549s = -1;
            this.f5551t = -1;
            this.f5553u = -1;
            this.f5555v = -1;
            this.f5557w = Integer.MIN_VALUE;
            this.f5559x = Integer.MIN_VALUE;
            this.f5560y = Integer.MIN_VALUE;
            this.f5561z = Integer.MIN_VALUE;
            this.f5487A = Integer.MIN_VALUE;
            this.f5488B = Integer.MIN_VALUE;
            this.f5489C = Integer.MIN_VALUE;
            this.f5490D = 0;
            this.f5491E = true;
            this.f5492F = true;
            this.f5493G = 0.5f;
            this.f5494H = 0.5f;
            this.f5495I = null;
            this.f5496J = 0.0f;
            this.f5497K = 1;
            this.f5498L = -1.0f;
            this.f5499M = -1.0f;
            this.f5500N = 0;
            this.f5501O = 0;
            this.f5502P = 0;
            this.f5503Q = 0;
            this.f5504R = 0;
            this.f5505S = 0;
            this.f5506T = 0;
            this.f5507U = 0;
            this.f5508V = 1.0f;
            this.f5509W = 1.0f;
            this.f5510X = -1;
            this.f5511Y = -1;
            this.f5512Z = -1;
            this.f5514a0 = false;
            this.f5516b0 = false;
            this.f5518c0 = null;
            this.f5520d0 = 0;
            this.f5522e0 = true;
            this.f5524f0 = true;
            this.f5526g0 = false;
            this.f5528h0 = false;
            this.f5530i0 = false;
            this.f5532j0 = false;
            this.f5534k0 = false;
            this.f5536l0 = -1;
            this.f5538m0 = -1;
            this.f5540n0 = -1;
            this.f5542o0 = -1;
            this.f5544p0 = Integer.MIN_VALUE;
            this.f5546q0 = Integer.MIN_VALUE;
            this.f5548r0 = 0.5f;
            this.f5556v0 = new C3186e();
            this.f5558w0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5513a = -1;
            this.f5515b = -1;
            this.f5517c = -1.0f;
            this.f5519d = true;
            this.f5521e = -1;
            this.f5523f = -1;
            this.f5525g = -1;
            this.f5527h = -1;
            this.f5529i = -1;
            this.f5531j = -1;
            this.f5533k = -1;
            this.f5535l = -1;
            this.f5537m = -1;
            this.f5539n = -1;
            this.f5541o = -1;
            this.f5543p = -1;
            this.f5545q = 0;
            this.f5547r = 0.0f;
            this.f5549s = -1;
            this.f5551t = -1;
            this.f5553u = -1;
            this.f5555v = -1;
            this.f5557w = Integer.MIN_VALUE;
            this.f5559x = Integer.MIN_VALUE;
            this.f5560y = Integer.MIN_VALUE;
            this.f5561z = Integer.MIN_VALUE;
            this.f5487A = Integer.MIN_VALUE;
            this.f5488B = Integer.MIN_VALUE;
            this.f5489C = Integer.MIN_VALUE;
            this.f5490D = 0;
            this.f5491E = true;
            this.f5492F = true;
            this.f5493G = 0.5f;
            this.f5494H = 0.5f;
            this.f5495I = null;
            this.f5496J = 0.0f;
            this.f5497K = 1;
            this.f5498L = -1.0f;
            this.f5499M = -1.0f;
            this.f5500N = 0;
            this.f5501O = 0;
            this.f5502P = 0;
            this.f5503Q = 0;
            this.f5504R = 0;
            this.f5505S = 0;
            this.f5506T = 0;
            this.f5507U = 0;
            this.f5508V = 1.0f;
            this.f5509W = 1.0f;
            this.f5510X = -1;
            this.f5511Y = -1;
            this.f5512Z = -1;
            this.f5514a0 = false;
            this.f5516b0 = false;
            this.f5518c0 = null;
            this.f5520d0 = 0;
            this.f5522e0 = true;
            this.f5524f0 = true;
            this.f5526g0 = false;
            this.f5528h0 = false;
            this.f5530i0 = false;
            this.f5532j0 = false;
            this.f5534k0 = false;
            this.f5536l0 = -1;
            this.f5538m0 = -1;
            this.f5540n0 = -1;
            this.f5542o0 = -1;
            this.f5544p0 = Integer.MIN_VALUE;
            this.f5546q0 = Integer.MIN_VALUE;
            this.f5548r0 = 0.5f;
            this.f5556v0 = new C3186e();
            this.f5558w0 = false;
        }
    }
}
