package com.zing.zalo.uicontrol.drawer;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1591q0;
import androidx.core.view.AbstractC1602t;
import androidx.core.view.AbstractC1622z;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import au.AbstractC2349h;
import com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout;
import java.util.ArrayList;
import java.util.List;
import p337m1.C22712c;

/* loaded from: classes4.dex */
public class ZaloDrawerLayout extends ViewGroup implements InterfaceC16584c {

    /* renamed from: a0 */
    static final int[] f83733a0 = {R.attr.layout_gravity};

    /* renamed from: b0 */
    static final InterfaceC16577c f83734b0 = new C16578d();

    /* renamed from: A */
    boolean f83735A;

    /* renamed from: B */
    boolean f83736B;

    /* renamed from: C */
    int f83737C;

    /* renamed from: D */
    int f83738D;

    /* renamed from: E */
    boolean f83739E;

    /* renamed from: F */
    boolean f83740F;

    /* renamed from: G */
    boolean f83741G;

    /* renamed from: H */
    InterfaceC16579e f83742H;

    /* renamed from: I */
    boolean f83743I;

    /* renamed from: J */
    float f83744J;

    /* renamed from: K */
    float f83745K;

    /* renamed from: L */
    Drawable f83746L;

    /* renamed from: M */
    Drawable f83747M;

    /* renamed from: N */
    Drawable f83748N;

    /* renamed from: O */
    CharSequence f83749O;

    /* renamed from: P */
    CharSequence f83750P;

    /* renamed from: Q */
    Object f83751Q;

    /* renamed from: R */
    boolean f83752R;

    /* renamed from: S */
    Drawable f83753S;

    /* renamed from: T */
    Drawable f83754T;

    /* renamed from: U */
    Drawable f83755U;

    /* renamed from: V */
    Drawable f83756V;

    /* renamed from: W */
    final ArrayList f83757W;

    /* renamed from: p */
    final C16576b f83758p;

    /* renamed from: q */
    float f83759q;

    /* renamed from: r */
    int f83760r;

    /* renamed from: s */
    int f83761s;

    /* renamed from: t */
    float f83762t;

    /* renamed from: u */
    Paint f83763u;

    /* renamed from: v */
    final C22712c f83764v;

    /* renamed from: w */
    final C22712c f83765w;

    /* renamed from: x */
    final C16581g f83766x;

    /* renamed from: y */
    final C16581g f83767y;

    /* renamed from: z */
    int f83768z;

    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$a */
    /* loaded from: classes4.dex */
    class C16575a extends C1490a {

        /* renamed from: d */
        private final Rect f83776d = new Rect();

        C16575a() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: a */
        public boolean mo7506a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m88347m = ZaloDrawerLayout.this.m88347m();
                if (m88347m != null) {
                    CharSequence m88349p = ZaloDrawerLayout.this.m88349p(ZaloDrawerLayout.this.m88350q(m88347m));
                    if (m88349p != null) {
                        text.add(m88349p);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.mo7506a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo7509f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ZaloDrawerLayout.class.getName());
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7619d0(ZaloDrawerLayout.class.getName());
            c1507g0.m7629k0(false);
            c1507g0.m7630l0(false);
            AbstractC2349h.m12322b(c1507g0);
            AbstractC2349h.m12321a(c1507g0);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: i */
        public boolean mo7512i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return super.mo7512i(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$b */
    /* loaded from: classes4.dex */
    static final class C16576b extends C1490a {
        C16576b() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            if (!ZaloDrawerLayout.m88323x(view)) {
                c1507g0.m7645t0(null);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$c */
    /* loaded from: classes4.dex */
    interface InterfaceC16577c {
        /* renamed from: a */
        void mo88356a(View view, Object obj, int i11);

        /* renamed from: b */
        Drawable mo88357b(Context context);

        /* renamed from: c */
        void mo88358c(View view);

        /* renamed from: d */
        void mo88359d(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i11);

        /* renamed from: e */
        int mo88360e(Object obj);
    }

    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$d */
    /* loaded from: classes4.dex */
    static class C16578d implements InterfaceC16577c {
        C16578d() {
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16577c
        /* renamed from: a */
        public void mo88356a(View view, Object obj, int i11) {
            try {
                AbstractC16583b.m88367c(view, obj, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16577c
        /* renamed from: b */
        public Drawable mo88357b(Context context) {
            try {
                return AbstractC16583b.m88368d(context);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16577c
        /* renamed from: c */
        public void mo88358c(View view) {
            try {
                AbstractC16583b.m88366b(view);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16577c
        /* renamed from: d */
        public void mo88359d(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i11) {
            try {
                AbstractC16583b.m88365a(marginLayoutParams, obj, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout.InterfaceC16577c
        /* renamed from: e */
        public int mo88360e(Object obj) {
            try {
                return AbstractC16583b.m88369e(obj);
            } catch (Exception e11) {
                e11.printStackTrace();
                return 0;
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC16579e {
        /* renamed from: F1 */
        void mo60362F1(int i11);

        /* renamed from: a */
        void mo60363a(View view);

        /* renamed from: b */
        void mo60364b(View view);

        /* renamed from: c */
        void mo60365c(View view, float f11);
    }

    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$f */
    /* loaded from: classes4.dex */
    public interface InterfaceC16580f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$g */
    /* loaded from: classes4.dex */
    public class C16581g extends C22712c.c {

        /* renamed from: a */
        private final int f83778a;

        /* renamed from: b */
        private C22712c f83779b;

        /* renamed from: c */
        private final Runnable f83780c = new Runnable() { // from class: com.zing.zalo.uicontrol.drawer.a
            @Override // java.lang.Runnable
            public final void run() {
                ZaloDrawerLayout.C16581g.this.m88362o();
            }
        };

        public C16581g(int i11) {
            this.f83778a = i11;
        }

        /* renamed from: n */
        private void m88361n() {
            int i11 = 3;
            if (this.f83778a == 3) {
                i11 = 5;
            }
            View m88345k = ZaloDrawerLayout.this.m88345k(i11);
            if (m88345k != null) {
                ZaloDrawerLayout.this.m88338d(m88345k);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: a */
        public int mo8626a(View view, int i11, int i12) {
            if (ZaloDrawerLayout.this.m88337c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i11, 0));
            }
            int width = ZaloDrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i11, width));
        }

        @Override // p337m1.C22712c.c
        /* renamed from: b */
        public int mo8627b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: d */
        public int mo8628d(View view) {
            if (ZaloDrawerLayout.this.m88325B(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: f */
        public void mo8629f(int i11, int i12) {
            View m88345k;
            if ((i11 & 1) == 1) {
                m88345k = ZaloDrawerLayout.this.m88345k(3);
            } else {
                m88345k = ZaloDrawerLayout.this.m88345k(5);
            }
            if (m88345k != null && ZaloDrawerLayout.this.m88348n(m88345k) == 0) {
                this.f83779b.m117515c(m88345k, i12);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: g */
        public boolean mo8630g(int i11) {
            return false;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: h */
        public void mo8631h(int i11, int i12) {
            ZaloDrawerLayout zaloDrawerLayout = ZaloDrawerLayout.this;
            if (zaloDrawerLayout.f83741G) {
                zaloDrawerLayout.postDelayed(this.f83780c, 160L);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: i */
        public void mo8632i(View view, int i11) {
            ((LayoutParams) view.getLayoutParams()).f83771c = false;
            m88361n();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: j */
        public void mo8633j(int i11) {
            ZaloDrawerLayout.this.m88334M(this.f83778a, i11, this.f83779b.m117520w());
        }

        @Override // p337m1.C22712c.c
        /* renamed from: k */
        public void mo8634k(View view, int i11, int i12, int i13, int i14) {
            float width;
            int i15;
            int width2 = view.getWidth();
            if (ZaloDrawerLayout.this.m88337c(view, 3)) {
                width = i11 + width2;
            } else {
                width = ZaloDrawerLayout.this.getWidth() - i11;
            }
            float f11 = width / width2;
            ZaloDrawerLayout.this.m88333K(view, f11);
            if (f11 == 0.0f) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            view.setVisibility(i15);
            ZaloDrawerLayout.this.invalidate();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: l */
        public void mo8635l(View view, float f11, float f12) {
            int i11;
            float m88351r = ZaloDrawerLayout.this.m88351r(view);
            int width = view.getWidth();
            if (ZaloDrawerLayout.this.m88337c(view, 3)) {
                if (f11 <= 0.0f && (f11 != 0.0f || m88351r <= 0.5f)) {
                    i11 = -width;
                } else {
                    i11 = 0;
                }
            } else {
                int width2 = ZaloDrawerLayout.this.getWidth();
                if (f11 < 0.0f || (f11 == 0.0f && m88351r > 0.5f)) {
                    width2 -= width;
                }
                i11 = width2;
            }
            this.f83779b.m117509N(i11, view.getTop());
            ZaloDrawerLayout.this.invalidate();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: m */
        public boolean mo8636m(View view, int i11) {
            if (ZaloDrawerLayout.this.m88325B(view) && ZaloDrawerLayout.this.m88337c(view, this.f83778a) && ZaloDrawerLayout.this.m88348n(view) == 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m88362o() {
            boolean z11;
            View m88345k;
            int width;
            int m117521x = this.f83779b.m117521x();
            int i11 = 0;
            if (this.f83778a == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                m88345k = ZaloDrawerLayout.this.m88345k(3);
                if (m88345k != null) {
                    i11 = -m88345k.getWidth();
                }
                width = i11 + m117521x;
            } else {
                m88345k = ZaloDrawerLayout.this.m88345k(5);
                width = ZaloDrawerLayout.this.getWidth() - m117521x;
            }
            if (m88345k != null) {
                if (((z11 && m88345k.getLeft() < width) || (!z11 && m88345k.getLeft() > width)) && ZaloDrawerLayout.this.m88348n(m88345k) == 0) {
                    LayoutParams layoutParams = (LayoutParams) m88345k.getLayoutParams();
                    this.f83779b.m117511P(m88345k, width, m88345k.getTop());
                    layoutParams.f83771c = true;
                    ZaloDrawerLayout.this.invalidate();
                    m88361n();
                    ZaloDrawerLayout.this.m88336b();
                }
            }
        }

        /* renamed from: p */
        public void m88363p() {
            ZaloDrawerLayout.this.removeCallbacks(this.f83780c);
        }

        /* renamed from: q */
        public void m88364q(C22712c c22712c) {
            this.f83779b = c22712c;
        }
    }

    public ZaloDrawerLayout(Context context) {
        this(context, null);
    }

    /* renamed from: H */
    private void m88317H() {
    }

    /* renamed from: L */
    private void m88318L(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((!z11 && !m88325B(childAt)) || (z11 && childAt == view)) {
                AbstractC1579n0.m7823L0(childAt, 1);
            } else {
                AbstractC1579n0.m7823L0(childAt, 4);
            }
        }
    }

    /* renamed from: s */
    static String m88319s(int i11) {
        if ((i11 & 3) == 3) {
            return "LEFT";
        }
        if ((i11 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i11);
    }

    /* renamed from: u */
    private static boolean m88320u(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m88321v() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((LayoutParams) getChildAt(i11).getLayoutParams()).f83771c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    private boolean m88322w() {
        if (m88347m() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    static boolean m88323x(View view) {
        if (AbstractC1579n0.m7808E(view) != 4 && AbstractC1579n0.m7808E(view) != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public boolean m88324A(View view) {
        if (m88325B(view)) {
            return ((LayoutParams) view.getLayoutParams()).f83772d;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: B */
    boolean m88325B(View view) {
        if ((AbstractC1602t.m8182b(((LayoutParams) view.getLayoutParams()).f83769a, AbstractC1579n0.m7812G(view)) & 7) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m88326C(int i11) {
        View m88345k = m88345k(i11);
        if (m88345k != null) {
            return m88327D(m88345k);
        }
        return false;
    }

    /* renamed from: D */
    public boolean m88327D(View view) {
        if (m88325B(view)) {
            if (((LayoutParams) view.getLayoutParams()).f83770b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: E */
    public boolean m88328E() {
        if (this.f83765w.m117501A() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    void m88329F(View view, float f11) {
        float m88351r = m88351r(view);
        float width = view.getWidth();
        int i11 = ((int) (width * f11)) - ((int) (m88351r * width));
        if (!m88337c(view, 3)) {
            i11 = -i11;
        }
        view.offsetLeftAndRight(i11);
        m88333K(view, f11);
    }

    /* renamed from: G */
    public void m88330G(View view) {
        if (m88325B(view)) {
            if (this.f83736B) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f83770b = 1.0f;
                layoutParams.f83772d = true;
                m88318L(view, true);
            } else if (m88337c(view, 3)) {
                this.f83764v.m117511P(view, 0, view.getTop());
            } else {
                this.f83765w.m117511P(view, getWidth() - view.getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: I */
    public void m88331I(int i11, int i12) {
        View m88345k;
        C22712c c22712c;
        int m8182b = AbstractC1602t.m8182b(i12, AbstractC1579n0.m7812G(this));
        if (m8182b == 3) {
            this.f83737C = i11;
        } else if (m8182b == 5) {
            this.f83738D = i11;
        }
        if (i11 != 0) {
            if (m8182b == 3) {
                c22712c = this.f83764v;
            } else {
                c22712c = this.f83765w;
            }
            c22712c.m117514b();
        }
        if (i11 != 1) {
            if (i11 == 2 && (m88345k = m88345k(m8182b)) != null) {
                m88330G(m88345k);
                return;
            }
            return;
        }
        View m88345k2 = m88345k(m8182b);
        if (m88345k2 != null) {
            m88338d(m88345k2);
        }
    }

    /* renamed from: J */
    public void m88332J(int i11, View view) {
        if (m88325B(view)) {
            m88331I(i11, ((LayoutParams) view.getLayoutParams()).f83769a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    /* renamed from: K */
    void m88333K(View view, float f11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f11 == layoutParams.f83770b) {
            return;
        }
        layoutParams.f83770b = f11;
        m88344j(view, f11);
    }

    /* renamed from: M */
    void m88334M(int i11, int i12, View view) {
        int m117501A = this.f83764v.m117501A();
        int m117501A2 = this.f83765w.m117501A();
        int i13 = 1;
        if (m117501A != 1 && m117501A2 != 1) {
            i13 = 2;
            if (m117501A != 2 && m117501A2 != 2) {
                i13 = 0;
            }
        }
        if (view != null && i12 == 0) {
            float f11 = ((LayoutParams) view.getLayoutParams()).f83770b;
            if (f11 == 0.0f) {
                m88342h(view);
            } else if (f11 == 1.0f) {
                m88343i(view);
            }
        }
        if (i13 != this.f83768z) {
            this.f83768z = i13;
            InterfaceC16579e interfaceC16579e = this.f83742H;
            if (interfaceC16579e != null) {
                interfaceC16579e.mo60362F1(i13);
            }
        }
    }

    @Override // com.zing.zalo.uicontrol.drawer.InterfaceC16584c
    /* renamed from: a */
    public void mo88335a(Object obj, boolean z11) {
        boolean z12;
        this.f83751Q = obj;
        this.f83752R = z11;
        if (!z11 && getBackground() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i11, int i12) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (m88325B(childAt)) {
                if (m88324A(childAt)) {
                    childAt.addFocusables(arrayList, i11, i12);
                    z11 = true;
                }
            } else {
                this.f83757W.add(childAt);
            }
        }
        if (!z11) {
            int size = this.f83757W.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = (View) this.f83757W.get(i14);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i11, i12);
                }
            }
        }
        this.f83757W.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (m88346l() == null && !m88325B(view)) {
            AbstractC1579n0.m7823L0(view, 1);
        } else {
            AbstractC1579n0.m7823L0(view, 4);
        }
    }

    /* renamed from: b */
    void m88336b() {
        if (!this.f83740F) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f83740F = true;
        }
    }

    /* renamed from: c */
    boolean m88337c(View view, int i11) {
        if ((m88350q(view) & i11) == i11) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f11 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            f11 = Math.max(f11, ((LayoutParams) getChildAt(i11).getLayoutParams()).f83770b);
        }
        this.f83762t = f11;
        if (this.f83764v.m117518n(true) | this.f83765w.m117518n(true)) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: d */
    public void m88338d(View view) {
        if (m88325B(view)) {
            if (this.f83736B) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f83770b = 0.0f;
                layoutParams.f83772d = false;
            } else if (m88337c(view, 3)) {
                this.f83764v.m117511P(view, -view.getWidth(), view.getTop());
            } else {
                this.f83765w.m117511P(view, getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        int height = getHeight();
        boolean m88352y = m88352y(view);
        int width = getWidth();
        int save = canvas.save();
        int i11 = 0;
        if (m88352y) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view && childAt.getVisibility() == 0 && m88320u(childAt) && m88325B(childAt) && childAt.getHeight() >= height) {
                    if (m88337c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
            i11 = i12;
        }
        boolean drawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(save);
        float f11 = this.f83762t;
        if (f11 > 0.0f && m88352y) {
            this.f83763u.setColor((this.f83761s & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f11)) << 24));
            canvas.drawRect(i11, 0.0f, width, getHeight(), this.f83763u);
        } else if (this.f83747M != null && m88337c(view, 3)) {
            int intrinsicWidth = this.f83747M.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f83764v.m117521x(), 1.0f));
            this.f83747M.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f83747M.setAlpha((int) (max * 255.0f));
            this.f83747M.draw(canvas);
        } else if (this.f83748N != null && m88337c(view, 5)) {
            int intrinsicWidth2 = this.f83748N.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f83765w.m117521x(), 1.0f));
            this.f83748N.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f83748N.setAlpha((int) (max2 * 255.0f));
            this.f83748N.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void m88339e(int i11) {
        View m88345k = m88345k(i11);
        if (m88345k != null) {
            m88329F(m88345k, 0.0f);
            LayoutParams layoutParams = (LayoutParams) m88345k.getLayoutParams();
            layoutParams.f83770b = 0.0f;
            layoutParams.f83772d = false;
            invalidate();
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m88319s(i11));
    }

    /* renamed from: f */
    public void m88340f() {
        m88341g(false);
    }

    /* renamed from: g */
    void m88341g(boolean z11) {
        boolean m117511P;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m88325B(childAt) && (!z11 || layoutParams.f83771c)) {
                int width = childAt.getWidth();
                if (m88337c(childAt, 3)) {
                    m117511P = this.f83764v.m117511P(childAt, -width, childAt.getTop());
                } else {
                    m117511P = this.f83765w.m117511P(childAt, getWidth(), childAt.getTop());
                }
                z12 |= m117511P;
                layoutParams.f83771c = false;
            }
        }
        this.f83766x.m88363p();
        this.f83767y.m88363p();
        if (z12) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        return this.f83759q;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f83746L;
    }

    /* renamed from: h */
    void m88342h(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f83772d) {
            layoutParams.f83772d = false;
            InterfaceC16579e interfaceC16579e = this.f83742H;
            if (interfaceC16579e != null) {
                interfaceC16579e.mo60364b(view);
            }
            m88318L(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: i */
    void m88343i(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f83772d) {
            layoutParams.f83772d = true;
            InterfaceC16579e interfaceC16579e = this.f83742H;
            if (interfaceC16579e != null) {
                interfaceC16579e.mo60363a(view);
            }
            m88318L(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    /* renamed from: j */
    void m88344j(View view, float f11) {
        InterfaceC16579e interfaceC16579e = this.f83742H;
        if (interfaceC16579e != null) {
            interfaceC16579e.mo60365c(view, f11);
        }
    }

    /* renamed from: k */
    View m88345k(int i11) {
        int m8182b = AbstractC1602t.m8182b(i11, AbstractC1579n0.m7812G(this)) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((m88350q(childAt) & 7) == m8182b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: l */
    View m88346l() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f83772d) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: m */
    View m88347m() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (m88325B(childAt) && m88327D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    public int m88348n(View view) {
        int m88350q = m88350q(view);
        if (m88350q == 3) {
            return this.f83737C;
        }
        if (m88350q == 5) {
            return this.f83738D;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f83736B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f83736B = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int mo88360e;
        super.onDraw(canvas);
        if (this.f83752R && this.f83746L != null && (mo88360e = f83734b0.mo88360e(this.f83751Q)) > 0) {
            this.f83746L.setBounds(0, 0, getWidth(), mo88360e);
            this.f83746L.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:            if (r0 != 3) goto L22;     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        View m117519u;
        int m8275c = AbstractC1622z.m8275c(motionEvent);
        try {
            z11 = this.f83764v.m117510O(motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
            z11 = false;
        }
        try {
            z12 = this.f83765w.m117510O(motionEvent);
        } catch (Exception e12) {
            e12.printStackTrace();
            z12 = false;
        }
        boolean z14 = z11 | z12 | this.f83743I;
        if (m8275c != 0) {
            if (m8275c != 1) {
                if (m8275c == 2) {
                    if (this.f83764v.m117516e(3)) {
                        this.f83766x.m88363p();
                        this.f83767y.m88363p();
                    }
                }
                z13 = false;
            }
            m88341g(true);
            this.f83739E = false;
            this.f83740F = false;
            z13 = false;
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f83744J = x11;
            this.f83745K = y11;
            if (this.f83762t > 0.0f && (m117519u = this.f83764v.m117519u((int) x11, (int) y11)) != null && m88352y(m117519u)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f83739E = false;
            this.f83740F = false;
        }
        if (!z14 && !z13 && !m88321v() && !this.f83740F) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m88322w()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            View m88347m = m88347m();
            if (m88347m != null && m88348n(m88347m) == 0) {
                m88340f();
            }
            if (m88347m != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        float f11;
        int i15;
        boolean z12;
        int i16;
        this.f83735A = true;
        int i17 = i13 - i11;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m88352y(childAt)) {
                    int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i19, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i19, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m88337c(childAt, 3)) {
                        float f12 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (layoutParams.f83770b * f12));
                        f11 = (measuredWidth + i15) / f12;
                    } else {
                        float f13 = measuredWidth;
                        f11 = (i17 - r11) / f13;
                        i15 = i17 - ((int) (layoutParams.f83770b * f13));
                    }
                    if (f11 != layoutParams.f83770b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = layoutParams.f83769a & 112;
                    if (i21 != 16) {
                        if (i21 != 80) {
                            int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            childAt.layout(i15, i22, measuredWidth + i15, measuredHeight + i22);
                        } else {
                            int i23 = i14 - i12;
                            childAt.layout(i15, (i23 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i23 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        }
                    } else {
                        int i24 = i14 - i12;
                        int i25 = (i24 - measuredHeight) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = i25 + measuredHeight;
                            int i28 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i27 > i24 - i28) {
                                i25 = (i24 - i28) - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i25, measuredWidth + i15, measuredHeight + i25);
                    }
                    if (z12) {
                        m88333K(childAt, f11);
                    }
                    if (layoutParams.f83770b > 0.0f) {
                        i16 = 0;
                    } else {
                        i16 = 4;
                    }
                    if (childAt.getVisibility() != i16) {
                        childAt.setVisibility(i16);
                    }
                }
            }
        }
        this.f83735A = false;
        this.f83736B = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f83751Q != null && AbstractC1579n0.m7806D(this)) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m7812G = AbstractC1579n0.m7812G(this);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z11) {
                    int m8182b = AbstractC1602t.m8182b(layoutParams.f83769a, m7812G);
                    if (AbstractC1579n0.m7806D(childAt)) {
                        f83734b0.mo88356a(childAt, this.f83751Q, m8182b);
                    } else {
                        f83734b0.mo88359d(layoutParams, this.f83751Q, m8182b);
                    }
                }
                if (m88352y(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else if (m88325B(childAt)) {
                    float m7800A = AbstractC1579n0.m7800A(childAt);
                    float f11 = this.f83759q;
                    if (m7800A != f11) {
                        AbstractC1579n0.m7817I0(childAt, f11);
                    }
                    m88350q(childAt);
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f83760r + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m88345k;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i11 = savedState.f83773p;
        if (i11 != 0 && (m88345k = m88345k(i11)) != null) {
            m88330G(m88345k);
        }
        m88331I(savedState.f83774q, 3);
        m88331I(savedState.f83775r, 5);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        m88317H();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        View m88346l = m88346l();
        if (m88346l != null) {
            savedState.f83773p = ((LayoutParams) m88346l.getLayoutParams()).f83769a;
        }
        savedState.f83774q = this.f83737C;
        savedState.f83775r = this.f83738D;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View m88346l;
        try {
            this.f83764v.m117505F(motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            this.f83765w.m117505F(motionEvent);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        m88341g(true);
                        this.f83739E = false;
                        this.f83740F = false;
                    }
                } else if (this.f83743I) {
                    motionEvent.getX();
                    motionEvent.getY();
                    this.f83744J = motionEvent.getX();
                    this.f83745K = motionEvent.getY();
                    m88336b();
                    return true;
                }
            } else {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                View m117519u = this.f83764v.m117519u((int) x11, (int) y11);
                if (m117519u != null && m88352y(m117519u)) {
                    float f11 = x11 - this.f83744J;
                    float f12 = y11 - this.f83745K;
                    int m117522z = this.f83764v.m117522z();
                    if ((f11 * f11) + (f12 * f12) < m117522z * m117522z && (m88346l = m88346l()) != null && m88348n(m88346l) != 2) {
                        z11 = false;
                        m88341g(z11);
                        this.f83739E = false;
                    }
                }
                z11 = true;
                m88341g(z11);
                this.f83739E = false;
            }
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            this.f83744J = x12;
            this.f83745K = y12;
            this.f83739E = false;
            this.f83740F = false;
        }
        return true;
    }

    /* renamed from: p */
    public CharSequence m88349p(int i11) {
        int m8182b = AbstractC1602t.m8182b(i11, AbstractC1579n0.m7812G(this));
        if (m8182b == 3) {
            return this.f83749O;
        }
        if (m8182b == 5) {
            return this.f83750P;
        }
        return null;
    }

    /* renamed from: q */
    int m88350q(View view) {
        return AbstractC1602t.m8182b(((LayoutParams) view.getLayoutParams()).f83769a, AbstractC1579n0.m7812G(this));
    }

    /* renamed from: r */
    float m88351r(View view) {
        return ((LayoutParams) view.getLayoutParams()).f83770b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        this.f83739E = z11;
        if (z11) {
            m88341g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f83735A) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f11) {
        this.f83759q = f11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (m88325B(childAt)) {
                AbstractC1579n0.m7817I0(childAt, this.f83759q);
            }
        }
    }

    public void setDrawerListener(InterfaceC16579e interfaceC16579e) {
        this.f83742H = interfaceC16579e;
    }

    public void setDrawerLockMode(int i11) {
        m88331I(i11, 3);
        m88331I(i11, 5);
    }

    public void setEnableQuickPeekMode(boolean z11) {
        this.f83741G = z11;
    }

    public void setScrimColor(int i11) {
        this.f83761s = i11;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f83746L = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.f83746L = new ColorDrawable(i11);
        invalidate();
    }

    public void setTouchInterceptionListener(InterfaceC16580f interfaceC16580f) {
    }

    /* renamed from: y */
    boolean m88352y(View view) {
        if (((LayoutParams) view.getLayoutParams()).f83769a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m88353z(int i11) {
        View m88345k = m88345k(i11);
        if (m88345k != null) {
            return m88324A(m88345k);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16574a();

        /* renamed from: p */
        int f83773p;

        /* renamed from: q */
        int f83774q;

        /* renamed from: r */
        int f83775r;

        /* renamed from: com.zing.zalo.uicontrol.drawer.ZaloDrawerLayout$SavedState$a */
        /* loaded from: classes4.dex */
        class C16574a implements Parcelable.Creator {
            C16574a() {
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

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f83773p = 0;
            this.f83774q = 0;
            this.f83775r = 0;
            this.f83773p = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f83773p);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f83773p = 0;
            this.f83774q = 0;
            this.f83775r = 0;
        }
    }

    public ZaloDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setStatusBarBackground(int i11) {
        this.f83746L = i11 != 0 ? AbstractC1388a.m6964f(getContext(), i11) : null;
        invalidate();
    }

    public ZaloDrawerLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83758p = new C16576b();
        this.f83761s = -1728053248;
        this.f83763u = new Paint();
        this.f83736B = true;
        this.f83741G = true;
        this.f83743I = false;
        this.f83753S = null;
        this.f83754T = null;
        this.f83755U = null;
        this.f83756V = null;
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f83760r = (int) ((0.0f * f11) + 0.5f);
        float f12 = 400.0f * f11;
        C16581g c16581g = new C16581g(3);
        this.f83766x = c16581g;
        C16581g c16581g2 = new C16581g(5);
        this.f83767y = c16581g2;
        C22712c m117493o = C22712c.m117493o(this, 1.0f, c16581g);
        this.f83764v = m117493o;
        m117493o.m117507L(1);
        m117493o.m117508M(f12);
        c16581g.m88364q(m117493o);
        C22712c m117493o2 = C22712c.m117493o(this, 1.0f, c16581g2);
        this.f83765w = m117493o2;
        m117493o2.m117507L(2);
        m117493o2.m117508M(f12);
        c16581g2.m88364q(m117493o2);
        setFocusableInTouchMode(true);
        AbstractC1579n0.m7823L0(this, 1);
        AbstractC1579n0.m7801A0(this, new C16575a());
        AbstractC1591q0.m8138b(this, false);
        if (AbstractC1579n0.m7806D(this)) {
            InterfaceC16577c interfaceC16577c = f83734b0;
            interfaceC16577c.mo88358c(this);
            this.f83746L = interfaceC16577c.mo88357b(context);
        }
        this.f83759q = f11 * 10.0f;
        this.f83757W = new ArrayList();
    }

    /* loaded from: classes4.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f83769a;

        /* renamed from: b */
        float f83770b;

        /* renamed from: c */
        boolean f83771c;

        /* renamed from: d */
        boolean f83772d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f83769a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZaloDrawerLayout.f83733a0);
            this.f83769a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f83769a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f83769a = 0;
            this.f83769a = layoutParams.f83769a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f83769a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f83769a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
