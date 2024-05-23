package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.AbstractC1482d;
import androidx.core.util.C1486h;
import androidx.core.util.InterfaceC1484f;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import androidx.core.view.C1547f0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1539d0;
import androidx.core.view.InterfaceC1543e0;
import androidx.core.view.InterfaceC1551g0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p146f1.AbstractC18686a;
import p146f1.AbstractC18687b;
import p146f1.AbstractC18688c;

/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1539d0, InterfaceC1543e0 {

    /* renamed from: J */
    static final String f5785J;

    /* renamed from: K */
    static final Class[] f5786K;

    /* renamed from: L */
    static final ThreadLocal f5787L;

    /* renamed from: M */
    static final Comparator f5788M;

    /* renamed from: N */
    private static final InterfaceC1484f f5789N;

    /* renamed from: A */
    private View f5790A;

    /* renamed from: B */
    private ViewTreeObserverOnPreDrawListenerC1307f f5791B;

    /* renamed from: C */
    private boolean f5792C;

    /* renamed from: D */
    private C1580n1 f5793D;

    /* renamed from: E */
    private boolean f5794E;

    /* renamed from: F */
    private Drawable f5795F;

    /* renamed from: G */
    ViewGroup.OnHierarchyChangeListener f5796G;

    /* renamed from: H */
    private InterfaceC1551g0 f5797H;

    /* renamed from: I */
    private final C1547f0 f5798I;

    /* renamed from: p */
    private final List f5799p;

    /* renamed from: q */
    private final C1310b f5800q;

    /* renamed from: r */
    private final List f5801r;

    /* renamed from: s */
    private final List f5802s;

    /* renamed from: t */
    private Paint f5803t;

    /* renamed from: u */
    private final int[] f5804u;

    /* renamed from: v */
    private final int[] f5805v;

    /* renamed from: w */
    private boolean f5806w;

    /* renamed from: x */
    private boolean f5807x;

    /* renamed from: y */
    private int[] f5808y;

    /* renamed from: z */
    private View f5809z;

    /* loaded from: classes2.dex */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: A */
        public boolean mo6539A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
            if (i12 == 0) {
                return m6568z(coordinatorLayout, view, view2, view3, i11);
            }
            return false;
        }

        /* renamed from: B */
        public void m6540B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: C */
        public void mo6541C(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
            if (i11 == 0) {
                m6540B(coordinatorLayout, view, view2);
            }
        }

        /* renamed from: D */
        public boolean mo6542D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m6543a(CoordinatorLayout coordinatorLayout, View view) {
            if (m6546d(coordinatorLayout, view) > 0.0f) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo6544b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m6545c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        /* renamed from: d */
        public float m6546d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo6547e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: f */
        public C1580n1 m6548f(CoordinatorLayout coordinatorLayout, View view, C1580n1 c1580n1) {
            return c1580n1;
        }

        /* renamed from: g */
        public void mo6549g(C1306e c1306e) {
        }

        /* renamed from: h */
        public boolean mo6550h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* renamed from: i */
        public void mo6551i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* renamed from: j */
        public void mo6552j() {
        }

        /* renamed from: k */
        public boolean mo6553k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
            return false;
        }

        /* renamed from: m */
        public boolean mo6555m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int i14) {
            return false;
        }

        /* renamed from: n */
        public boolean m6556n(CoordinatorLayout coordinatorLayout, View view, View view2, float f11, float f12, boolean z11) {
            return false;
        }

        /* renamed from: o */
        public boolean mo6557o(CoordinatorLayout coordinatorLayout, View view, View view2, float f11, float f12) {
            return false;
        }

        /* renamed from: p */
        public void m6558p(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr) {
        }

        /* renamed from: q */
        public void mo6559q(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
            if (i13 == 0) {
                m6558p(coordinatorLayout, view, view2, i11, i12, iArr);
            }
        }

        /* renamed from: r */
        public void m6560r(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int i13, int i14) {
        }

        /* renamed from: s */
        public void m6561s(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int i13, int i14, int i15) {
            if (i15 == 0) {
                m6560r(coordinatorLayout, view, view2, i11, i12, i13, i14);
            }
        }

        /* renamed from: t */
        public void mo6562t(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
            m6561s(coordinatorLayout, view, view2, i11, i12, i13, i14, i15);
        }

        /* renamed from: u */
        public void m6563u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11) {
        }

        /* renamed from: v */
        public void m6564v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
            if (i12 == 0) {
                m6563u(coordinatorLayout, view, view2, view3, i11);
            }
        }

        /* renamed from: w */
        public boolean mo6565w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
            return false;
        }

        /* renamed from: x */
        public void mo6566x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo6567y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: z */
        public boolean m6568z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes2.dex */
    public class C1302a implements InterfaceC1551g0 {
        C1302a() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            return CoordinatorLayout.this.m6528c0(c1580n1);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1303b {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes2.dex */
    public @interface InterfaceC1304c {
        Class value();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes2.dex */
    public class ViewGroupOnHierarchyChangeListenerC1305d implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC1305d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f5796G;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m6523N(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f5796G;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes2.dex */
    public class ViewTreeObserverOnPreDrawListenerC1307f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC1307f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m6523N(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes2.dex */
    static class C1308g implements Comparator {
        C1308g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m7848Y = AbstractC1579n0.m7848Y(view);
            float m7848Y2 = AbstractC1579n0.m7848Y(view2);
            if (m7848Y > m7848Y2) {
                return -1;
            }
            if (m7848Y < m7848Y2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f5785J = str;
        f5788M = new C1308g();
        f5786K = new Class[]{Context.class, AttributeSet.class};
        f5787L = new ThreadLocal();
        f5789N = new C1486h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC18686a.coordinatorLayoutStyle);
    }

    /* renamed from: B */
    private void m6495B(View view, int i11, Rect rect, Rect rect2, C1306e c1306e, int i12, int i13) {
        int width;
        int height;
        int m8182b = AbstractC1602t.m8182b(m6508X(c1306e.f5815c), i11);
        int m8182b2 = AbstractC1602t.m8182b(m6509Y(c1306e.f5816d), i11);
        int i14 = m8182b & 7;
        int i15 = m8182b & 112;
        int i16 = m8182b2 & 7;
        int i17 = m8182b2 & 112;
        if (i16 != 1) {
            if (i16 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            if (i17 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i14 != 1) {
            if (i14 != 5) {
                width -= i12;
            }
        } else {
            width -= i12 / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height -= i13;
            }
        } else {
            height -= i13 / 2;
        }
        rect2.set(width, height, i12 + width, i13 + height);
    }

    /* renamed from: C */
    private int m6496C(int i11) {
        int[] iArr = this.f5808y;
        if (iArr == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No keylines defined for ");
            sb2.append(this);
            sb2.append(" - attempted index lookup ");
            sb2.append(i11);
            return 0;
        }
        if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Keyline index ");
        sb3.append(i11);
        sb3.append(" out of range for ");
        sb3.append(this);
        return 0;
    }

    /* renamed from: F */
    private void m6497F(List list) {
        int i11;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            list.add(getChildAt(i11));
        }
        Comparator comparator = f5788M;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: G */
    private boolean m6498G(View view) {
        return this.f5800q.m6604j(view);
    }

    /* renamed from: I */
    private void m6499I(View view, int i11) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        Rect m6514e = m6514e();
        m6514e.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306e).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1306e).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1306e).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin);
        if (this.f5793D != null && AbstractC1579n0.m7806D(this) && !AbstractC1579n0.m7806D(view)) {
            m6514e.left += this.f5793D.m8059k();
            m6514e.top += this.f5793D.m8061m();
            m6514e.right -= this.f5793D.m8060l();
            m6514e.bottom -= this.f5793D.m8058j();
        }
        Rect m6514e2 = m6514e();
        AbstractC1602t.m8181a(m6509Y(c1306e.f5815c), view.getMeasuredWidth(), view.getMeasuredHeight(), m6514e, m6514e2, i11);
        view.layout(m6514e2.left, m6514e2.top, m6514e2.right, m6514e2.bottom);
        m6506U(m6514e);
        m6506U(m6514e2);
    }

    /* renamed from: J */
    private void m6500J(View view, View view2, int i11) {
        Rect m6514e = m6514e();
        Rect m6514e2 = m6514e();
        try {
            m6538z(view2, m6514e);
            m6518A(view, i11, m6514e, m6514e2);
            view.layout(m6514e2.left, m6514e2.top, m6514e2.right, m6514e2.bottom);
        } finally {
            m6506U(m6514e);
            m6506U(m6514e2);
        }
    }

    /* renamed from: K */
    private void m6501K(View view, int i11, int i12) {
        int i13;
        C1306e c1306e = (C1306e) view.getLayoutParams();
        int m8182b = AbstractC1602t.m8182b(m6510Z(c1306e.f5815c), i12);
        int i14 = m8182b & 7;
        int i15 = m8182b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i12 == 1) {
            i11 = width - i11;
        }
        int m6496C = m6496C(i11) - measuredWidth;
        if (i14 != 1) {
            if (i14 == 5) {
                m6496C += measuredWidth;
            }
        } else {
            m6496C += measuredWidth / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                i13 = 0;
            } else {
                i13 = measuredHeight;
            }
        } else {
            i13 = measuredHeight / 2;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306e).leftMargin, Math.min(m6496C, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c1306e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1306e).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: L */
    private void m6502L(View view, Rect rect, int i11) {
        boolean z11;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        if (AbstractC1579n0.m7865e0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C1306e c1306e = (C1306e) view.getLayoutParams();
            Behavior m6580f = c1306e.m6580f();
            Rect m6514e = m6514e();
            Rect m6514e2 = m6514e();
            m6514e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m6580f != null && m6580f.mo6544b(this, view, m6514e)) {
                if (!m6514e2.contains(m6514e)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m6514e.toShortString() + " | Bounds:" + m6514e2.toShortString());
                }
            } else {
                m6514e.set(m6514e2);
            }
            m6506U(m6514e2);
            if (m6514e.isEmpty()) {
                m6506U(m6514e);
                return;
            }
            int m8182b = AbstractC1602t.m8182b(c1306e.f5820h, i11);
            boolean z12 = true;
            if ((m8182b & 48) == 48 && (i16 = (m6514e.top - ((ViewGroup.MarginLayoutParams) c1306e).topMargin) - c1306e.f5822j) < (i17 = rect.top)) {
                m6512b0(view, i17 - i16);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((m8182b & 80) == 80 && (height = ((getHeight() - m6514e.bottom) - ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin) + c1306e.f5822j) < (i15 = rect.bottom)) {
                m6512b0(view, height - i15);
            } else if (!z11) {
                m6512b0(view, 0);
            }
            if ((m8182b & 3) == 3 && (i13 = (m6514e.left - ((ViewGroup.MarginLayoutParams) c1306e).leftMargin) - c1306e.f5821i) < (i14 = rect.left)) {
                m6511a0(view, i14 - i13);
            } else {
                z12 = false;
            }
            if ((m8182b & 5) == 5 && (width = ((getWidth() - m6514e.right) - ((ViewGroup.MarginLayoutParams) c1306e).rightMargin) + c1306e.f5821i) < (i12 = rect.right)) {
                m6511a0(view, width - i12);
            } else if (!z12) {
                m6511a0(view, 0);
            }
            m6506U(m6514e);
        }
    }

    /* renamed from: Q */
    static Behavior m6503Q(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f5785J;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f5787L;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f5786K);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(context, attributeSet);
        } catch (Exception e11) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e11);
        }
    }

    /* renamed from: R */
    private boolean m6504R(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f5801r;
        m6497F(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) list.get(i12);
            C1306e c1306e = (C1306e) view.getLayoutParams();
            Behavior m6580f = c1306e.m6580f();
            if ((z11 || z12) && actionMasked != 0) {
                if (m6580f != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i11 != 0) {
                        if (i11 == 1) {
                            m6580f.mo6542D(this, view, motionEvent2);
                        }
                    } else {
                        m6580f.mo6553k(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && m6580f != null) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z11 = m6580f.mo6542D(this, view, motionEvent);
                        }
                    } else {
                        z11 = m6580f.mo6553k(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f5809z = view;
                    }
                }
                boolean m6577c = c1306e.m6577c();
                boolean m6583i = c1306e.m6583i(this, view);
                if (m6583i && !m6577c) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (m6583i && !z12) {
                    break;
                }
            }
        }
        list.clear();
        return z11;
    }

    /* renamed from: S */
    private void m6505S() {
        this.f5799p.clear();
        this.f5800q.m6599c();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C1306e m6520E = m6520E(childAt);
            m6520E.m6578d(this, childAt);
            this.f5800q.m6598b(childAt);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i11) {
                    View childAt2 = getChildAt(i12);
                    if (m6520E.m6576b(this, childAt, childAt2)) {
                        if (!this.f5800q.m6600d(childAt2)) {
                            this.f5800q.m6598b(childAt2);
                        }
                        this.f5800q.m6597a(childAt2, childAt);
                    }
                }
            }
        }
        this.f5799p.addAll(this.f5800q.m6603i());
        Collections.reverse(this.f5799p);
    }

    /* renamed from: U */
    private static void m6506U(Rect rect) {
        rect.setEmpty();
        f5789N.mo7483a(rect);
    }

    /* renamed from: W */
    private void m6507W(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            Behavior m6580f = ((C1306e) childAt.getLayoutParams()).m6580f();
            if (m6580f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z11) {
                    m6580f.mo6553k(this, childAt, obtain);
                } else {
                    m6580f.mo6542D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((C1306e) getChildAt(i12).getLayoutParams()).m6587m();
        }
        this.f5809z = null;
        this.f5806w = false;
    }

    /* renamed from: X */
    private static int m6508X(int i11) {
        if (i11 == 0) {
            return 17;
        }
        return i11;
    }

    /* renamed from: Y */
    private static int m6509Y(int i11) {
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        return (i11 & 112) == 0 ? i11 | 48 : i11;
    }

    /* renamed from: Z */
    private static int m6510Z(int i11) {
        if (i11 == 0) {
            return 8388661;
        }
        return i11;
    }

    /* renamed from: a0 */
    private void m6511a0(View view, int i11) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        int i12 = c1306e.f5821i;
        if (i12 != i11) {
            AbstractC1579n0.m7883k0(view, i11 - i12);
            c1306e.f5821i = i11;
        }
    }

    /* renamed from: b0 */
    private void m6512b0(View view, int i11) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        int i12 = c1306e.f5822j;
        if (i12 != i11) {
            AbstractC1579n0.m7886l0(view, i11 - i12);
            c1306e.f5822j = i11;
        }
    }

    /* renamed from: d0 */
    private void m6513d0() {
        if (AbstractC1579n0.m7806D(this)) {
            if (this.f5797H == null) {
                this.f5797H = new C1302a();
            }
            AbstractC1579n0.m7833Q0(this, this.f5797H);
            setSystemUiVisibility(1280);
            return;
        }
        AbstractC1579n0.m7833Q0(this, null);
    }

    /* renamed from: e */
    private static Rect m6514e() {
        Rect rect = (Rect) f5789N.mo7484b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: g */
    private static int m6515g(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    /* renamed from: h */
    private void m6516h(C1306e c1306e, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) c1306e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1306e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin));
        rect.set(max, max2, i11 + max, i12 + max2);
    }

    /* renamed from: l */
    private C1580n1 m6517l(C1580n1 c1580n1) {
        Behavior m6580f;
        if (c1580n1.m8064q()) {
            return c1580n1;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (AbstractC1579n0.m7806D(childAt) && (m6580f = ((C1306e) childAt.getLayoutParams()).m6580f()) != null) {
                c1580n1 = m6580f.m6548f(this, childAt, c1580n1);
                if (c1580n1.m8064q()) {
                    break;
                }
            }
        }
        return c1580n1;
    }

    /* renamed from: A */
    void m6518A(View view, int i11, Rect rect, Rect rect2) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m6495B(view, i11, rect, rect2, c1306e, measuredWidth, measuredHeight);
        m6516h(c1306e, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: D */
    void m6519D(View view, Rect rect) {
        rect.set(((C1306e) view.getLayoutParams()).m6582h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    C1306e m6520E(View view) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        if (!c1306e.f5814b) {
            if (view instanceof InterfaceC1303b) {
                c1306e.m6588o(((InterfaceC1303b) view).getBehavior());
                c1306e.f5814b = true;
            } else {
                InterfaceC1304c interfaceC1304c = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC1304c = (InterfaceC1304c) cls.getAnnotation(InterfaceC1304c.class);
                    if (interfaceC1304c != null) {
                        break;
                    }
                }
                if (interfaceC1304c != null) {
                    try {
                        c1306e.m6588o((Behavior) interfaceC1304c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Default behavior class ");
                        sb2.append(interfaceC1304c.value().getName());
                        sb2.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
                c1306e.f5814b = true;
            }
        }
        return c1306e;
    }

    /* renamed from: H */
    public boolean m6521H(View view, int i11, int i12) {
        Rect m6514e = m6514e();
        m6538z(view, m6514e);
        try {
            return m6514e.contains(i11, i12);
        } finally {
            m6506U(m6514e);
        }
    }

    /* renamed from: M */
    void m6522M(View view, int i11) {
        Behavior m6580f;
        C1306e c1306e = (C1306e) view.getLayoutParams();
        if (c1306e.f5823k != null) {
            Rect m6514e = m6514e();
            Rect m6514e2 = m6514e();
            Rect m6514e3 = m6514e();
            m6538z(c1306e.f5823k, m6514e);
            boolean z11 = false;
            m6535w(view, false, m6514e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m6495B(view, i11, m6514e, m6514e3, c1306e, measuredWidth, measuredHeight);
            if (m6514e3.left != m6514e2.left || m6514e3.top != m6514e2.top) {
                z11 = true;
            }
            m6516h(c1306e, m6514e3, measuredWidth, measuredHeight);
            int i12 = m6514e3.left - m6514e2.left;
            int i13 = m6514e3.top - m6514e2.top;
            if (i12 != 0) {
                AbstractC1579n0.m7883k0(view, i12);
            }
            if (i13 != 0) {
                AbstractC1579n0.m7886l0(view, i13);
            }
            if (z11 && (m6580f = c1306e.m6580f()) != null) {
                m6580f.mo6550h(this, view, c1306e.f5823k);
            }
            m6506U(m6514e);
            m6506U(m6514e2);
            m6506U(m6514e3);
        }
    }

    /* renamed from: N */
    final void m6523N(int i11) {
        boolean z11;
        int m7812G = AbstractC1579n0.m7812G(this);
        int size = this.f5799p.size();
        Rect m6514e = m6514e();
        Rect m6514e2 = m6514e();
        Rect m6514e3 = m6514e();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f5799p.get(i12);
            C1306e c1306e = (C1306e) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (c1306e.f5824l == ((View) this.f5799p.get(i13))) {
                        m6522M(view, m7812G);
                    }
                }
                m6535w(view, true, m6514e2);
                if (c1306e.f5819g != 0 && !m6514e2.isEmpty()) {
                    int m8182b = AbstractC1602t.m8182b(c1306e.f5819g, m7812G);
                    int i14 = m8182b & 112;
                    if (i14 != 48) {
                        if (i14 == 80) {
                            m6514e.bottom = Math.max(m6514e.bottom, getHeight() - m6514e2.top);
                        }
                    } else {
                        m6514e.top = Math.max(m6514e.top, m6514e2.bottom);
                    }
                    int i15 = m8182b & 7;
                    if (i15 != 3) {
                        if (i15 == 5) {
                            m6514e.right = Math.max(m6514e.right, getWidth() - m6514e2.left);
                        }
                    } else {
                        m6514e.left = Math.max(m6514e.left, m6514e2.right);
                    }
                }
                if (c1306e.f5820h != 0 && view.getVisibility() == 0) {
                    m6502L(view, m6514e, m7812G);
                }
                if (i11 != 2) {
                    m6519D(view, m6514e3);
                    if (!m6514e3.equals(m6514e2)) {
                        m6526T(view, m6514e2);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = (View) this.f5799p.get(i16);
                    C1306e c1306e2 = (C1306e) view2.getLayoutParams();
                    Behavior m6580f = c1306e2.m6580f();
                    if (m6580f != null && m6580f.mo6547e(this, view2, view)) {
                        if (i11 == 0 && c1306e2.m6581g()) {
                            c1306e2.m6585k();
                        } else {
                            if (i11 != 2) {
                                z11 = m6580f.mo6550h(this, view2, view);
                            } else {
                                m6580f.mo6551i(this, view2, view);
                                z11 = true;
                            }
                            if (i11 == 1) {
                                c1306e2.m6589p(z11);
                            }
                        }
                    }
                }
            }
        }
        m6506U(m6514e);
        m6506U(m6514e2);
        m6506U(m6514e3);
    }

    /* renamed from: O */
    public void m6524O(View view, int i11) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        if (!c1306e.m6575a()) {
            View view2 = c1306e.f5823k;
            if (view2 != null) {
                m6500J(view, view2, i11);
                return;
            }
            int i12 = c1306e.f5817e;
            if (i12 >= 0) {
                m6501K(view, i12, i11);
                return;
            } else {
                m6499I(view, i11);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: P */
    public void m6525P(View view, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* renamed from: T */
    void m6526T(View view, Rect rect) {
        ((C1306e) view.getLayoutParams()).m6590q(rect);
    }

    /* renamed from: V */
    void m6527V() {
        if (this.f5807x && this.f5791B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5791B);
        }
        this.f5792C = false;
    }

    /* renamed from: c0 */
    final C1580n1 m6528c0(C1580n1 c1580n1) {
        boolean z11;
        if (!AbstractC1482d.m7475a(this.f5793D, c1580n1)) {
            this.f5793D = c1580n1;
            boolean z12 = false;
            if (c1580n1 != null && c1580n1.m8061m() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5794E = z11;
            if (!z11 && getBackground() == null) {
                z12 = true;
            }
            setWillNotDraw(z12);
            C1580n1 m6517l = m6517l(c1580n1);
            requestLayout();
            return m6517l;
        }
        return c1580n1;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C1306e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        C1306e c1306e = (C1306e) view.getLayoutParams();
        Behavior behavior = c1306e.f5813a;
        if (behavior != null) {
            float m6546d = behavior.m6546d(this, view);
            if (m6546d > 0.0f) {
                if (this.f5803t == null) {
                    this.f5803t = new Paint();
                }
                this.f5803t.setColor(c1306e.f5813a.m6545c(this, view));
                this.f5803t.setAlpha(m6515g(Math.round(m6546d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f5803t);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5795F;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* renamed from: f */
    void m6529f() {
        if (this.f5807x) {
            if (this.f5791B == null) {
                this.f5791B = new ViewTreeObserverOnPreDrawListenerC1307f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5791B);
        }
        this.f5792C = true;
    }

    final List<View> getDependencySortedChildren() {
        m6505S();
        return Collections.unmodifiableList(this.f5799p);
    }

    public final C1580n1 getLastWindowInsets() {
        return this.f5793D;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5798I.m7761a();
    }

    public Drawable getStatusBarBackground() {
        return this.f5795F;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        Behavior m6580f;
        this.f5798I.m7763c(view, view2, i11, i12);
        this.f5790A = view2;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            C1306e c1306e = (C1306e) childAt.getLayoutParams();
            if (c1306e.m6584j(i12) && (m6580f = c1306e.m6580f()) != null) {
                m6580f.m6564v(this, childAt, view, view2, i11, i12);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: j */
    public void mo5177j(View view, int i11) {
        this.f5798I.m7765e(view, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            C1306e c1306e = (C1306e) childAt.getLayoutParams();
            if (c1306e.m6584j(i11)) {
                Behavior m6580f = c1306e.m6580f();
                if (m6580f != null) {
                    m6580f.mo6541C(this, childAt, view, i11);
                }
                c1306e.m6586l(i11);
                c1306e.m6585k();
            }
        }
        this.f5790A = null;
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        Behavior m6580f;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C1306e c1306e = (C1306e) childAt.getLayoutParams();
                if (c1306e.m6584j(i13) && (m6580f = c1306e.m6580f()) != null) {
                    int[] iArr2 = this.f5804u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m6580f.mo6559q(this, childAt, view, i11, i12, iArr2, i13);
                    int[] iArr3 = this.f5804u;
                    if (i11 > 0) {
                        min = Math.max(i14, iArr3[0]);
                    } else {
                        min = Math.min(i14, iArr3[0]);
                    }
                    i14 = min;
                    int[] iArr4 = this.f5804u;
                    if (i12 > 0) {
                        min2 = Math.max(i15, iArr4[1]);
                    } else {
                        min2 = Math.min(i15, iArr4[1]);
                    }
                    i15 = min2;
                    z11 = true;
                }
            }
        }
        iArr[0] = i14;
        iArr[1] = i15;
        if (z11) {
            m6523N(1);
        }
    }

    /* renamed from: m */
    public void m6530m(View view) {
        List m6601g = this.f5800q.m6601g(view);
        if (m6601g != null && !m6601g.isEmpty()) {
            for (int i11 = 0; i11 < m6601g.size(); i11++) {
                View view2 = (View) m6601g.get(i11);
                Behavior m6580f = ((C1306e) view2.getLayoutParams()).m6580f();
                if (m6580f != null) {
                    m6580f.mo6550h(this, view2, view);
                }
            }
        }
    }

    /* renamed from: n */
    void m6531n() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            if (m6498G(getChildAt(i11))) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (z11 != this.f5792C) {
            if (z11) {
                m6529f();
            } else {
                m6527V();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6507W(false);
        if (this.f5792C) {
            if (this.f5791B == null) {
                this.f5791B = new ViewTreeObserverOnPreDrawListenerC1307f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5791B);
        }
        if (this.f5793D == null && AbstractC1579n0.m7806D(this)) {
            AbstractC1579n0.m7910x0(this);
        }
        this.f5807x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6507W(false);
        if (this.f5792C && this.f5791B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5791B);
        }
        View view = this.f5790A;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f5807x = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        if (this.f5794E && this.f5795F != null) {
            C1580n1 c1580n1 = this.f5793D;
            if (c1580n1 != null) {
                i11 = c1580n1.m8061m();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                this.f5795F.setBounds(0, 0, getWidth(), i11);
                this.f5795F.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m6507W(true);
        }
        boolean m6504R = m6504R(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m6507W(true);
        }
        return m6504R;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Behavior m6580f;
        int m7812G = AbstractC1579n0.m7812G(this);
        int size = this.f5799p.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) this.f5799p.get(i15);
            if (view.getVisibility() != 8 && ((m6580f = ((C1306e) view.getLayoutParams()).m6580f()) == null || !m6580f.mo6554l(this, view, m7812G))) {
                m6524O(view, m7812G);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:            if (r0.mo6555m(r30, r20, r11, r21, r23, 0) == false) goto L102;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        Behavior m6580f;
        C1306e c1306e;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        m6505S();
        m6531n();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int m7812G = AbstractC1579n0.m7812G(this);
        if (m7812G == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f5793D != null && AbstractC1579n0.m7806D(this)) {
            z12 = true;
        } else {
            z12 = false;
        }
        int size3 = this.f5799p.size();
        int i26 = suggestedMinimumWidth;
        int i27 = suggestedMinimumHeight;
        int i28 = 0;
        int i29 = 0;
        while (i29 < size3) {
            View view = (View) this.f5799p.get(i29);
            if (view.getVisibility() == 8) {
                i22 = i29;
                i18 = size3;
                i19 = paddingLeft;
            } else {
                C1306e c1306e2 = (C1306e) view.getLayoutParams();
                int i31 = c1306e2.f5817e;
                if (i31 >= 0 && mode != 0) {
                    int m6496C = m6496C(i31);
                    int m8182b = AbstractC1602t.m8182b(m6510Z(c1306e2.f5815c), m7812G) & 7;
                    i13 = i28;
                    if ((m8182b == 3 && !z11) || (m8182b == 5 && z11)) {
                        i14 = Math.max(0, (size - paddingRight) - m6496C);
                    } else if ((m8182b == 5 && !z11) || (m8182b == 3 && z11)) {
                        i14 = Math.max(0, m6496C - paddingLeft);
                    }
                    if (!z12 && !AbstractC1579n0.m7806D(view)) {
                        int m8059k = this.f5793D.m8059k() + this.f5793D.m8060l();
                        int m8061m = this.f5793D.m8061m() + this.f5793D.m8058j();
                        i15 = View.MeasureSpec.makeMeasureSpec(size - m8059k, mode);
                        i16 = View.MeasureSpec.makeMeasureSpec(size2 - m8061m, mode2);
                    } else {
                        i15 = i11;
                        i16 = i12;
                    }
                    m6580f = c1306e2.m6580f();
                    if (m6580f == null) {
                        c1306e = c1306e2;
                        i21 = i13;
                        i22 = i29;
                        i17 = i27;
                        i19 = paddingLeft;
                        i23 = i26;
                        i18 = size3;
                    } else {
                        c1306e = c1306e2;
                        i17 = i27;
                        i18 = size3;
                        i19 = paddingLeft;
                        i21 = i13;
                        i22 = i29;
                        i23 = i26;
                    }
                    m6525P(view, i15, i14, i16, 0);
                    C1306e c1306e3 = c1306e;
                    int max = Math.max(i23, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1306e3).leftMargin + ((ViewGroup.MarginLayoutParams) c1306e3).rightMargin);
                    int max2 = Math.max(i17, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1306e3).topMargin + ((ViewGroup.MarginLayoutParams) c1306e3).bottomMargin);
                    i28 = View.combineMeasuredStates(i21, view.getMeasuredState());
                    i26 = max;
                    i27 = max2;
                } else {
                    i13 = i28;
                }
                i14 = 0;
                if (!z12) {
                }
                i15 = i11;
                i16 = i12;
                m6580f = c1306e2.m6580f();
                if (m6580f == null) {
                }
                m6525P(view, i15, i14, i16, 0);
                C1306e c1306e32 = c1306e;
                int max3 = Math.max(i23, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1306e32).leftMargin + ((ViewGroup.MarginLayoutParams) c1306e32).rightMargin);
                int max22 = Math.max(i17, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1306e32).topMargin + ((ViewGroup.MarginLayoutParams) c1306e32).bottomMargin);
                i28 = View.combineMeasuredStates(i21, view.getMeasuredState());
                i26 = max3;
                i27 = max22;
            }
            i29 = i22 + 1;
            paddingLeft = i19;
            size3 = i18;
        }
        int i32 = i28;
        setMeasuredDimension(View.resolveSizeAndState(i26, i11, (-16777216) & i32), View.resolveSizeAndState(i27, i12, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        Behavior m6580f;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1306e c1306e = (C1306e) childAt.getLayoutParams();
                if (c1306e.m6584j(0) && (m6580f = c1306e.m6580f()) != null) {
                    z12 |= m6580f.m6556n(this, childAt, view, f11, f12, z11);
                }
            }
        }
        if (z12) {
            m6523N(1);
        }
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        Behavior m6580f;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1306e c1306e = (C1306e) childAt.getLayoutParams();
                if (c1306e.m6584j(0) && (m6580f = c1306e.m6580f()) != null) {
                    z11 |= m6580f.mo6557o(this, childAt, view, f11, f12);
                }
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        mo5178k(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        mo5183s(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        mo5176i(view, view2, i11, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        SparseArray sparseArray = savedState.f5810r;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            Behavior m6580f = m6520E(childAt).m6580f();
            if (id2 != -1 && m6580f != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                m6580f.mo6566x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo6567y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            Behavior m6580f = ((C1306e) childAt.getLayoutParams()).m6580f();
            if (id2 != -1 && m6580f != null && (mo6567y = m6580f.mo6567y(this, childAt)) != null) {
                sparseArray.append(id2, mo6567y);
            }
        }
        savedState.f5810r = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return mo5184v(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo5177j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:            if (r3 != false) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean mo6542D;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5809z == null) {
            z11 = m6504R(motionEvent, 1);
        } else {
            z11 = false;
        }
        Behavior m6580f = ((C1306e) this.f5809z.getLayoutParams()).m6580f();
        if (m6580f != null) {
            mo6542D = m6580f.mo6542D(this, this.f5809z, motionEvent);
            motionEvent2 = null;
            if (this.f5809z != null) {
                mo6542D |= super.onTouchEvent(motionEvent);
            } else if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m6507W(false);
            }
            return mo6542D;
        }
        mo6542D = false;
        motionEvent2 = null;
        if (this.f5809z != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        m6507W(false);
        return mo6542D;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p */
    public C1306e generateDefaultLayoutParams() {
        return new C1306e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public C1306e generateLayoutParams(AttributeSet attributeSet) {
        return new C1306e(getContext(), attributeSet);
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        Behavior m6580f;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C1306e c1306e = (C1306e) childAt.getLayoutParams();
                if (c1306e.m6584j(i15) && (m6580f = c1306e.m6580f()) != null) {
                    int[] iArr2 = this.f5804u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m6580f.mo6562t(this, childAt, view, i11, i12, i13, i14, i15, iArr2);
                    int[] iArr3 = this.f5804u;
                    if (i13 > 0) {
                        min = Math.max(i16, iArr3[0]);
                    } else {
                        min = Math.min(i16, iArr3[0]);
                    }
                    i16 = min;
                    if (i14 > 0) {
                        min2 = Math.max(i17, this.f5804u[1]);
                    } else {
                        min2 = Math.min(i17, this.f5804u[1]);
                    }
                    i17 = min2;
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i16;
        iArr[1] = iArr[1] + i17;
        if (z11) {
            m6523N(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        Behavior m6580f = ((C1306e) view.getLayoutParams()).m6580f();
        if (m6580f != null && m6580f.mo6565w(this, view, rect, z11)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11 && !this.f5806w) {
            m6507W(false);
            this.f5806w = true;
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
        mo5182r(view, i11, i12, i13, i14, 0, this.f5805v);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        m6513d0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5796G = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z11;
        Drawable drawable2 = this.f5795F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5795F = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f5795F.setState(getDrawableState());
                }
                AbstractC1414a.m7195m(this.f5795F, AbstractC1579n0.m7812G(this));
                Drawable drawable4 = this.f5795F;
                if (getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                drawable4.setVisible(z11, false);
                this.f5795F.setCallback(this);
            }
            AbstractC1579n0.m7898r0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = AbstractC1388a.m6964f(getContext(), i11);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        boolean z11;
        super.setVisibility(i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable = this.f5795F;
        if (drawable != null && drawable.isVisible() != z11) {
            this.f5795F.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: u */
    public C1306e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1306e) {
            return new C1306e((C1306e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1306e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1306e(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1306e c1306e = (C1306e) childAt.getLayoutParams();
                Behavior m6580f = c1306e.m6580f();
                if (m6580f != null) {
                    boolean mo6539A = m6580f.mo6539A(this, childAt, view, view2, i11, i12);
                    z11 |= mo6539A;
                    c1306e.m6591r(i12, mo6539A);
                } else {
                    c1306e.m6591r(i12, false);
                }
            }
        }
        return z11;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f5795F) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    void m6535w(View view, boolean z11, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z11) {
                m6538z(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    /* renamed from: x */
    public List m6536x(View view) {
        List m6602h = this.f5800q.m6602h(view);
        this.f5802s.clear();
        if (m6602h != null) {
            this.f5802s.addAll(m6602h);
        }
        return this.f5802s;
    }

    /* renamed from: y */
    public List m6537y(View view) {
        List m6601g = this.f5800q.m6601g(view);
        this.f5802s.clear();
        if (m6601g != null) {
            this.f5802s.addAll(m6601g);
        }
        return this.f5802s;
    }

    /* renamed from: z */
    void m6538z(View view, Rect rect) {
        AbstractC1311c.m6605a(this, view, rect);
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes2.dex */
    public static class C1306e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        Behavior f5813a;

        /* renamed from: b */
        boolean f5814b;

        /* renamed from: c */
        public int f5815c;

        /* renamed from: d */
        public int f5816d;

        /* renamed from: e */
        public int f5817e;

        /* renamed from: f */
        int f5818f;

        /* renamed from: g */
        public int f5819g;

        /* renamed from: h */
        public int f5820h;

        /* renamed from: i */
        int f5821i;

        /* renamed from: j */
        int f5822j;

        /* renamed from: k */
        View f5823k;

        /* renamed from: l */
        View f5824l;

        /* renamed from: m */
        private boolean f5825m;

        /* renamed from: n */
        private boolean f5826n;

        /* renamed from: o */
        private boolean f5827o;

        /* renamed from: p */
        private boolean f5828p;

        /* renamed from: q */
        final Rect f5829q;

        /* renamed from: r */
        Object f5830r;

        public C1306e(int i11, int i12) {
            super(i11, i12);
            this.f5814b = false;
            this.f5815c = 0;
            this.f5816d = 0;
            this.f5817e = -1;
            this.f5818f = -1;
            this.f5819g = 0;
            this.f5820h = 0;
            this.f5829q = new Rect();
        }

        /* renamed from: n */
        private void m6572n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f5818f);
            this.f5823k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f5824l = null;
                        this.f5823k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f5824l = null;
                            this.f5823k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = parent;
                    }
                }
                this.f5824l = findViewById;
                return;
            }
            if (coordinatorLayout.isInEditMode()) {
                this.f5824l = null;
                this.f5823k = null;
                return;
            }
            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f5818f) + " to anchor view " + view);
        }

        /* renamed from: s */
        private boolean m6573s(View view, int i11) {
            int m8182b = AbstractC1602t.m8182b(((C1306e) view.getLayoutParams()).f5819g, i11);
            if (m8182b != 0 && (AbstractC1602t.m8182b(this.f5820h, i11) & m8182b) == m8182b) {
                return true;
            }
            return false;
        }

        /* renamed from: t */
        private boolean m6574t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f5823k.getId() != this.f5818f) {
                return false;
            }
            View view2 = this.f5823k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                } else {
                    this.f5824l = null;
                    this.f5823k = null;
                    return false;
                }
            }
            this.f5824l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m6575a() {
            return this.f5823k == null && this.f5818f != -1;
        }

        /* renamed from: b */
        boolean m6576b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            if (view2 != this.f5824l && !m6573s(view2, AbstractC1579n0.m7812G(coordinatorLayout)) && ((behavior = this.f5813a) == null || !behavior.mo6547e(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        boolean m6577c() {
            if (this.f5813a == null) {
                this.f5825m = false;
            }
            return this.f5825m;
        }

        /* renamed from: d */
        View m6578d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f5818f == -1) {
                this.f5824l = null;
                this.f5823k = null;
                return null;
            }
            if (this.f5823k == null || !m6574t(view, coordinatorLayout)) {
                m6572n(view, coordinatorLayout);
            }
            return this.f5823k;
        }

        /* renamed from: e */
        public int m6579e() {
            return this.f5818f;
        }

        /* renamed from: f */
        public Behavior m6580f() {
            return this.f5813a;
        }

        /* renamed from: g */
        boolean m6581g() {
            return this.f5828p;
        }

        /* renamed from: h */
        Rect m6582h() {
            return this.f5829q;
        }

        /* renamed from: i */
        boolean m6583i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z11;
            boolean z12 = this.f5825m;
            if (z12) {
                return true;
            }
            Behavior behavior = this.f5813a;
            if (behavior != null) {
                z11 = behavior.m6543a(coordinatorLayout, view);
            } else {
                z11 = false;
            }
            boolean z13 = z11 | z12;
            this.f5825m = z13;
            return z13;
        }

        /* renamed from: j */
        boolean m6584j(int i11) {
            if (i11 == 0) {
                return this.f5826n;
            }
            if (i11 != 1) {
                return false;
            }
            return this.f5827o;
        }

        /* renamed from: k */
        void m6585k() {
            this.f5828p = false;
        }

        /* renamed from: l */
        void m6586l(int i11) {
            m6591r(i11, false);
        }

        /* renamed from: m */
        void m6587m() {
            this.f5825m = false;
        }

        /* renamed from: o */
        public void m6588o(Behavior behavior) {
            Behavior behavior2 = this.f5813a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.mo6552j();
                }
                this.f5813a = behavior;
                this.f5830r = null;
                this.f5814b = true;
                if (behavior != null) {
                    behavior.mo6549g(this);
                }
            }
        }

        /* renamed from: p */
        void m6589p(boolean z11) {
            this.f5828p = z11;
        }

        /* renamed from: q */
        void m6590q(Rect rect) {
            this.f5829q.set(rect);
        }

        /* renamed from: r */
        void m6591r(int i11, boolean z11) {
            if (i11 == 0) {
                this.f5826n = z11;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.f5827o = z11;
            }
        }

        C1306e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5814b = false;
            this.f5815c = 0;
            this.f5816d = 0;
            this.f5817e = -1;
            this.f5818f = -1;
            this.f5819g = 0;
            this.f5820h = 0;
            this.f5829q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC18688c.CoordinatorLayout_Layout);
            this.f5815c = obtainStyledAttributes.getInteger(AbstractC18688c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f5818f = obtainStyledAttributes.getResourceId(AbstractC18688c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f5816d = obtainStyledAttributes.getInteger(AbstractC18688c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f5817e = obtainStyledAttributes.getInteger(AbstractC18688c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f5819g = obtainStyledAttributes.getInt(AbstractC18688c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f5820h = obtainStyledAttributes.getInt(AbstractC18688c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(AbstractC18688c.CoordinatorLayout_Layout_layout_behavior);
            this.f5814b = hasValue;
            if (hasValue) {
                this.f5813a = CoordinatorLayout.m6503Q(context, attributeSet, obtainStyledAttributes.getString(AbstractC18688c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f5813a;
            if (behavior != null) {
                behavior.mo6549g(this);
            }
        }

        public C1306e(C1306e c1306e) {
            super((ViewGroup.MarginLayoutParams) c1306e);
            this.f5814b = false;
            this.f5815c = 0;
            this.f5816d = 0;
            this.f5817e = -1;
            this.f5818f = -1;
            this.f5819g = 0;
            this.f5820h = 0;
            this.f5829q = new Rect();
        }

        public C1306e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5814b = false;
            this.f5815c = 0;
            this.f5816d = 0;
            this.f5817e = -1;
            this.f5818f = -1;
            this.f5819g = 0;
            this.f5820h = 0;
            this.f5829q = new Rect();
        }

        public C1306e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5814b = false;
            this.f5815c = 0;
            this.f5816d = 0;
            this.f5817e = -1;
            this.f5818f = -1;
            this.f5819g = 0;
            this.f5820h = 0;
            this.f5829q = new Rect();
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes;
        this.f5799p = new ArrayList();
        this.f5800q = new C1310b();
        this.f5801r = new ArrayList();
        this.f5802s = new ArrayList();
        this.f5804u = new int[2];
        this.f5805v = new int[2];
        this.f5798I = new C1547f0(this);
        if (i11 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC18688c.CoordinatorLayout, 0, AbstractC18687b.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC18688c.CoordinatorLayout, i11, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i11 == 0) {
                saveAttributeDataForStyleable(context, AbstractC18688c.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, AbstractC18687b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, AbstractC18688c.CoordinatorLayout, attributeSet, obtainStyledAttributes, i11, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC18688c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f5808y = resources.getIntArray(resourceId);
            float f11 = resources.getDisplayMetrics().density;
            int length = this.f5808y.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f5808y[i12] = (int) (r12[i12] * f11);
            }
        }
        this.f5795F = obtainStyledAttributes.getDrawable(AbstractC18688c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m6513d0();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1305d());
        if (AbstractC1579n0.m7808E(this) == 0) {
            AbstractC1579n0.m7823L0(this, 1);
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1301a();

        /* renamed from: r */
        SparseArray f5810r;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1301a implements Parcelable.ClassLoaderCreator {
            C1301a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f5810r = new SparseArray(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                this.f5810r.append(iArr[i11], readParcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            int i12;
            super.writeToParcel(parcel, i11);
            SparseArray sparseArray = this.f5810r;
            if (sparseArray != null) {
                i12 = sparseArray.size();
            } else {
                i12 = 0;
            }
            parcel.writeInt(i12);
            int[] iArr = new int[i12];
            Parcelable[] parcelableArr = new Parcelable[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = this.f5810r.keyAt(i13);
                parcelableArr[i13] = (Parcelable) this.f5810r.valueAt(i13);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i11);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
