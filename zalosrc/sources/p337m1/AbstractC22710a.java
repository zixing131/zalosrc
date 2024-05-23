package p337m1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1603t0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.AbstractC1496b;
import androidx.core.view.accessibility.AbstractC1511i0;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.C1509h0;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.List;
import p337m1.AbstractC22711b;
import p665y0.C30246h;

/* renamed from: m1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC22710a extends C1490a {

    /* renamed from: n */
    private static final Rect f111260n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final AbstractC22711b.a f111261o = new a();

    /* renamed from: p */
    private static final AbstractC22711b.b f111262p = new b();

    /* renamed from: h */
    private final AccessibilityManager f111267h;

    /* renamed from: i */
    private final View f111268i;

    /* renamed from: j */
    private c f111269j;

    /* renamed from: d */
    private final Rect f111263d = new Rect();

    /* renamed from: e */
    private final Rect f111264e = new Rect();

    /* renamed from: f */
    private final Rect f111265f = new Rect();

    /* renamed from: g */
    private final int[] f111266g = new int[2];

    /* renamed from: k */
    int f111270k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f111271l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f111272m = Integer.MIN_VALUE;

    /* renamed from: m1.a$a */
    /* loaded from: classes2.dex */
    static class a implements AbstractC22711b.a {
        a() {
        }

        @Override // p337m1.AbstractC22711b.a
        /* renamed from: b */
        public void mo117459a(C1507g0 c1507g0, Rect rect) {
            c1507g0.m7631m(rect);
        }
    }

    /* renamed from: m1.a$b */
    /* loaded from: classes2.dex */
    static class b implements AbstractC22711b.b {
        b() {
        }

        @Override // p337m1.AbstractC22711b.b
        /* renamed from: c */
        public C1507g0 mo117461a(C30246h c30246h, int i11) {
            return (C1507g0) c30246h.m149180n(i11);
        }

        @Override // p337m1.AbstractC22711b.b
        /* renamed from: d */
        public int mo117462b(C30246h c30246h) {
            return c30246h.m149179m();
        }
    }

    /* renamed from: m1.a$c */
    /* loaded from: classes2.dex */
    private class c extends C1509h0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.C1509h0
        /* renamed from: b */
        public C1507g0 mo7666b(int i11) {
            return C1507g0.m7574R(AbstractC22710a.this.m117448J(i11));
        }

        @Override // androidx.core.view.accessibility.C1509h0
        /* renamed from: d */
        public C1507g0 mo7668d(int i11) {
            int i12;
            if (i11 == 2) {
                i12 = AbstractC22710a.this.f111270k;
            } else {
                i12 = AbstractC22710a.this.f111271l;
            }
            if (i12 == Integer.MIN_VALUE) {
                return null;
            }
            return mo7666b(i12);
        }

        @Override // androidx.core.view.accessibility.C1509h0
        /* renamed from: f */
        public boolean mo7670f(int i11, int i12, Bundle bundle) {
            return AbstractC22710a.this.m117452R(i11, i12, bundle);
        }
    }

    public AbstractC22710a(View view) {
        if (view != null) {
            this.f111268i = view;
            this.f111267h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (AbstractC1579n0.m7808E(view) == 0) {
                AbstractC1579n0.m7823L0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m117428D(View view, int i11, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    /* renamed from: G */
    private boolean m117429G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f111268i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f111268i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private static int m117430H(int i11) {
        if (i11 == 19) {
            return 33;
        }
        if (i11 != 21) {
            return i11 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: I */
    private boolean m117431I(int i11, Rect rect) {
        C1507g0 c1507g0;
        boolean z11;
        C1507g0 c1507g02;
        C30246h m117443y = m117443y();
        int i12 = this.f111271l;
        int i13 = Integer.MIN_VALUE;
        if (i12 == Integer.MIN_VALUE) {
            c1507g0 = null;
        } else {
            c1507g0 = (C1507g0) m117443y.m149172f(i12);
        }
        C1507g0 c1507g03 = c1507g0;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 17 && i11 != 33 && i11 != 66 && i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i14 = this.f111271l;
            if (i14 != Integer.MIN_VALUE) {
                m117444z(i14, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m117428D(this.f111268i, i11, rect2);
            }
            c1507g02 = (C1507g0) AbstractC22711b.m117467c(m117443y, f111262p, f111261o, c1507g03, rect2, i11);
        } else {
            if (AbstractC1579n0.m7812G(this.f111268i) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            c1507g02 = (C1507g0) AbstractC22711b.m117468d(m117443y, f111262p, f111261o, c1507g03, i11, z11, false);
        }
        if (c1507g02 != null) {
            i13 = m117443y.m149176j(m117443y.m149175i(c1507g02));
        }
        return m117453V(i13);
    }

    /* renamed from: S */
    private boolean m117432S(int i11, int i12, Bundle bundle) {
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 64) {
                    if (i12 != 128) {
                        return mo32061L(i11, i12, bundle);
                    }
                    return m117436n(i11);
                }
                return m117434U(i11);
            }
            return m117455o(i11);
        }
        return m117453V(i11);
    }

    /* renamed from: T */
    private boolean m117433T(int i11, Bundle bundle) {
        return AbstractC1579n0.m7894p0(this.f111268i, i11, bundle);
    }

    /* renamed from: U */
    private boolean m117434U(int i11) {
        int i12;
        if (!this.f111267h.isEnabled() || !this.f111267h.isTouchExplorationEnabled() || (i12 = this.f111270k) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            m117436n(i12);
        }
        this.f111270k = i11;
        this.f111268i.invalidate();
        m117454W(i11, 32768);
        return true;
    }

    /* renamed from: X */
    private void m117435X(int i11) {
        int i12 = this.f111272m;
        if (i12 == i11) {
            return;
        }
        this.f111272m = i11;
        m117454W(i11, 128);
        m117454W(i12, 256);
    }

    /* renamed from: n */
    private boolean m117436n(int i11) {
        if (this.f111270k == i11) {
            this.f111270k = Integer.MIN_VALUE;
            this.f111268i.invalidate();
            m117454W(i11, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m117437p() {
        int i11 = this.f111271l;
        if (i11 != Integer.MIN_VALUE && mo32061L(i11, 16, null)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private AccessibilityEvent m117438q(int i11, int i12) {
        if (i11 != -1) {
            return m117439r(i11, i12);
        }
        return m117440s(i12);
    }

    /* renamed from: r */
    private AccessibilityEvent m117439r(int i11, int i12) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        C1507g0 m117448J = m117448J(i11);
        obtain.getText().add(m117448J.m7650x());
        obtain.setContentDescription(m117448J.m7640r());
        obtain.setScrollable(m117448J.m7602L());
        obtain.setPassword(m117448J.m7601K());
        obtain.setEnabled(m117448J.m7595G());
        obtain.setChecked(m117448J.m7591E());
        m117451N(i11, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m117448J.m7637p());
        AbstractC1511i0.m7674c(obtain, this.f111268i, i11);
        obtain.setPackageName(this.f111268i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m117440s(int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        this.f111268i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C1507g0 m117441t(int i11) {
        boolean z11;
        C1507g0 m7572P = C1507g0.m7572P();
        m7572P.m7626i0(true);
        m7572P.m7629k0(true);
        m7572P.m7619d0("android.view.View");
        Rect rect = f111260n;
        m7572P.m7610Y(rect);
        m7572P.m7611Z(rect);
        m7572P.m7645t0(this.f111268i);
        mo32063P(i11, m7572P);
        if (m7572P.m7650x() == null && m7572P.m7640r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m7572P.m7631m(this.f111264e);
        if (!this.f111264e.equals(rect)) {
            int m7628k = m7572P.m7628k();
            if ((m7628k & 64) == 0) {
                if ((m7628k & 128) == 0) {
                    m7572P.m7641r0(this.f111268i.getContext().getPackageName());
                    m7572P.m7588C0(this.f111268i, i11);
                    if (this.f111270k == i11) {
                        m7572P.m7609W(true);
                        m7572P.m7612a(128);
                    } else {
                        m7572P.m7609W(false);
                        m7572P.m7612a(64);
                    }
                    if (this.f111271l == i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        m7572P.m7612a(2);
                    } else if (m7572P.m7597H()) {
                        m7572P.m7612a(1);
                    }
                    m7572P.m7630l0(z11);
                    this.f111268i.getLocationOnScreen(this.f111266g);
                    m7572P.m7633n(this.f111263d);
                    if (this.f111263d.equals(rect)) {
                        m7572P.m7631m(this.f111263d);
                        if (m7572P.f6420b != -1) {
                            C1507g0 m7572P2 = C1507g0.m7572P();
                            for (int i12 = m7572P.f6420b; i12 != -1; i12 = m7572P2.f6420b) {
                                m7572P2.m7646u0(this.f111268i, -1);
                                m7572P2.m7610Y(f111260n);
                                mo32063P(i12, m7572P2);
                                m7572P2.m7631m(this.f111264e);
                                Rect rect2 = this.f111263d;
                                Rect rect3 = this.f111264e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            m7572P2.m7607T();
                        }
                        this.f111263d.offset(this.f111266g[0] - this.f111268i.getScrollX(), this.f111266g[1] - this.f111268i.getScrollY());
                    }
                    if (this.f111268i.getLocalVisibleRect(this.f111265f)) {
                        this.f111265f.offset(this.f111266g[0] - this.f111268i.getScrollX(), this.f111266g[1] - this.f111268i.getScrollY());
                        if (this.f111263d.intersect(this.f111265f)) {
                            m7572P.m7611Z(this.f111263d);
                            if (m117429G(this.f111263d)) {
                                m7572P.m7596G0(true);
                            }
                        }
                    }
                    return m7572P;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    private C1507g0 m117442u() {
        C1507g0 m7573Q = C1507g0.m7573Q(this.f111268i);
        AbstractC1579n0.m7890n0(this.f111268i, m7573Q);
        ArrayList arrayList = new ArrayList();
        mo32060C(arrayList);
        if (m7573Q.m7635o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m7573Q.m7618d(this.f111268i, ((Integer) arrayList.get(i11)).intValue());
        }
        return m7573Q;
    }

    /* renamed from: y */
    private C30246h m117443y() {
        ArrayList arrayList = new ArrayList();
        mo32060C(arrayList);
        C30246h c30246h = new C30246h();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c30246h.m149177k(i11, m117441t(i11));
        }
        return c30246h;
    }

    /* renamed from: z */
    private void m117444z(int i11, Rect rect) {
        m117448J(i11).m7631m(rect);
    }

    /* renamed from: A */
    public final int m117445A() {
        return this.f111271l;
    }

    /* renamed from: B */
    protected abstract int mo32059B(float f11, float f12);

    /* renamed from: C */
    protected abstract void mo32060C(List list);

    /* renamed from: E */
    public final void m117446E(int i11) {
        m117447F(i11, 0);
    }

    /* renamed from: F */
    public final void m117447F(int i11, int i12) {
        ViewParent parent;
        if (i11 != Integer.MIN_VALUE && this.f111267h.isEnabled() && (parent = this.f111268i.getParent()) != null) {
            AccessibilityEvent m117438q = m117438q(i11, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
            AbstractC1496b.m7556b(m117438q, i12);
            AbstractC1603t0.m8193h(parent, this.f111268i, m117438q);
        }
    }

    /* renamed from: J */
    C1507g0 m117448J(int i11) {
        if (i11 == -1) {
            return m117442u();
        }
        return m117441t(i11);
    }

    /* renamed from: K */
    public final void m117449K(boolean z11, int i11, Rect rect) {
        int i12 = this.f111271l;
        if (i12 != Integer.MIN_VALUE) {
            m117455o(i12);
        }
        if (z11) {
            m117431I(i11, rect);
        }
    }

    /* renamed from: L */
    protected abstract boolean mo32061L(int i11, int i12, Bundle bundle);

    /* renamed from: M */
    protected void m117450M(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: N */
    protected void m117451N(int i11, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: O */
    protected void mo32062O(C1507g0 c1507g0) {
    }

    /* renamed from: P */
    protected abstract void mo32063P(int i11, C1507g0 c1507g0);

    /* renamed from: Q */
    protected void mo32064Q(int i11, boolean z11) {
    }

    /* renamed from: R */
    boolean m117452R(int i11, int i12, Bundle bundle) {
        if (i11 != -1) {
            return m117432S(i11, i12, bundle);
        }
        return m117433T(i12, bundle);
    }

    /* renamed from: V */
    public final boolean m117453V(int i11) {
        int i12;
        if ((!this.f111268i.isFocused() && !this.f111268i.requestFocus()) || (i12 = this.f111271l) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            m117455o(i12);
        }
        this.f111271l = i11;
        mo32064Q(i11, true);
        m117454W(i11, 8);
        return true;
    }

    /* renamed from: W */
    public final boolean m117454W(int i11, int i12) {
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.f111267h.isEnabled() || (parent = this.f111268i.getParent()) == null) {
            return false;
        }
        return AbstractC1603t0.m8193h(parent, this.f111268i, m117438q(i11, i12));
    }

    @Override // androidx.core.view.C1490a
    /* renamed from: b */
    public C1509h0 mo7507b(View view) {
        if (this.f111269j == null) {
            this.f111269j = new c();
        }
        return this.f111269j;
    }

    @Override // androidx.core.view.C1490a
    /* renamed from: f */
    public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo7509f(view, accessibilityEvent);
        m117450M(accessibilityEvent);
    }

    @Override // androidx.core.view.C1490a
    /* renamed from: g */
    public void mo7510g(View view, C1507g0 c1507g0) {
        super.mo7510g(view, c1507g0);
        mo32062O(c1507g0);
    }

    /* renamed from: o */
    public final boolean m117455o(int i11) {
        if (this.f111271l != i11) {
            return false;
        }
        this.f111271l = Integer.MIN_VALUE;
        mo32064Q(i11, false);
        m117454W(i11, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m117456v(MotionEvent motionEvent) {
        if (!this.f111267h.isEnabled() || !this.f111267h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f111272m == Integer.MIN_VALUE) {
                return false;
            }
            m117435X(Integer.MIN_VALUE);
            return true;
        }
        int mo32059B = mo32059B(motionEvent.getX(), motionEvent.getY());
        m117435X(mo32059B);
        if (mo32059B == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m117457w(KeyEvent keyEvent) {
        int i11 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int m117430H = m117430H(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z11 = false;
                        while (i11 < repeatCount && m117431I(m117430H, null)) {
                            i11++;
                            z11 = true;
                        }
                        return z11;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m117437p();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return m117431I(2, null);
        }
        if (!keyEvent.hasModifiers(1)) {
            return false;
        }
        return m117431I(1, null);
    }

    /* renamed from: x */
    public final int m117458x() {
        return this.f111270k;
    }
}
