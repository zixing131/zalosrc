package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.AbstractC1404k;
import androidx.transition.Transition;
import p286k2.AbstractC21441e;

/* loaded from: classes2.dex */
public abstract class Visibility extends Transition {

    /* renamed from: a0 */
    private static final String[] f8522a0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Z */
    private int f8523Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.Visibility$a */
    /* loaded from: classes2.dex */
    public class C1998a extends AbstractC2027q {

        /* renamed from: p */
        final /* synthetic */ ViewGroup f8524p;

        /* renamed from: q */
        final /* synthetic */ View f8525q;

        /* renamed from: r */
        final /* synthetic */ View f8526r;

        C1998a(ViewGroup viewGroup, View view, View view2) {
            this.f8524p = viewGroup;
            this.f8525q = view;
            this.f8526r = view2;
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: a */
        public void mo10834a(Transition transition) {
            if (this.f8525q.getParent() == null) {
                AbstractC2035y.m11037b(this.f8524p).mo11034c(this.f8525q);
            } else {
                Visibility.this.m10916h();
            }
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: c */
        public void mo10835c(Transition transition) {
            AbstractC2035y.m11037b(this.f8524p).mo11035d(this.f8525q);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            this.f8526r.setTag(AbstractC21441e.save_overlay_view, null);
            AbstractC2035y.m11037b(this.f8524p).mo11035d(this.f8525q);
            transition.mo10910b0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Visibility$b */
    /* loaded from: classes2.dex */
    public static class C1999b extends AnimatorListenerAdapter implements Transition.InterfaceC1995f {

        /* renamed from: p */
        private final View f8528p;

        /* renamed from: q */
        private final int f8529q;

        /* renamed from: r */
        private final ViewGroup f8530r;

        /* renamed from: s */
        private final boolean f8531s;

        /* renamed from: t */
        private boolean f8532t;

        /* renamed from: u */
        boolean f8533u = false;

        C1999b(View view, int i11, boolean z11) {
            this.f8528p = view;
            this.f8529q = i11;
            this.f8530r = (ViewGroup) view.getParent();
            this.f8531s = z11;
            m10960g(true);
        }

        /* renamed from: f */
        private void m10959f() {
            if (!this.f8533u) {
                AbstractC2004b0.m10975i(this.f8528p, this.f8529q);
                ViewGroup viewGroup = this.f8530r;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m10960g(false);
        }

        /* renamed from: g */
        private void m10960g(boolean z11) {
            ViewGroup viewGroup;
            if (this.f8531s && this.f8532t != z11 && (viewGroup = this.f8530r) != null) {
                this.f8532t = z11;
                AbstractC2035y.m11039d(viewGroup, z11);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: a */
        public void mo10834a(Transition transition) {
            m10960g(true);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: b */
        public void mo10939b(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: c */
        public void mo10835c(Transition transition) {
            m10960g(false);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            m10959f();
            transition.mo10910b0(this);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: e */
        public void mo10837e(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8533u = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m10959f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f8533u) {
                AbstractC2004b0.m10975i(this.f8528p, this.f8529q);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f8533u) {
                AbstractC2004b0.m10975i(this.f8528p, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Visibility$c */
    /* loaded from: classes2.dex */
    public static class C2000c {

        /* renamed from: a */
        boolean f8534a;

        /* renamed from: b */
        boolean f8535b;

        /* renamed from: c */
        int f8536c;

        /* renamed from: d */
        int f8537d;

        /* renamed from: e */
        ViewGroup f8538e;

        /* renamed from: f */
        ViewGroup f8539f;

        C2000c() {
        }
    }

    public Visibility() {
        this.f8523Z = 3;
    }

    /* renamed from: r0 */
    private void m10953r0(C2030t c2030t) {
        c2030t.f8615a.put("android:visibility:visibility", Integer.valueOf(c2030t.f8616b.getVisibility()));
        c2030t.f8615a.put("android:visibility:parent", c2030t.f8616b.getParent());
        int[] iArr = new int[2];
        c2030t.f8616b.getLocationOnScreen(iArr);
        c2030t.f8615a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: t0 */
    private C2000c m10954t0(C2030t c2030t, C2030t c2030t2) {
        C2000c c2000c = new C2000c();
        c2000c.f8534a = false;
        c2000c.f8535b = false;
        if (c2030t != null && c2030t.f8615a.containsKey("android:visibility:visibility")) {
            c2000c.f8536c = ((Integer) c2030t.f8615a.get("android:visibility:visibility")).intValue();
            c2000c.f8538e = (ViewGroup) c2030t.f8615a.get("android:visibility:parent");
        } else {
            c2000c.f8536c = -1;
            c2000c.f8538e = null;
        }
        if (c2030t2 != null && c2030t2.f8615a.containsKey("android:visibility:visibility")) {
            c2000c.f8537d = ((Integer) c2030t2.f8615a.get("android:visibility:visibility")).intValue();
            c2000c.f8539f = (ViewGroup) c2030t2.f8615a.get("android:visibility:parent");
        } else {
            c2000c.f8537d = -1;
            c2000c.f8539f = null;
        }
        if (c2030t != null && c2030t2 != null) {
            int i11 = c2000c.f8536c;
            int i12 = c2000c.f8537d;
            if (i11 == i12 && c2000c.f8538e == c2000c.f8539f) {
                return c2000c;
            }
            if (i11 != i12) {
                if (i11 == 0) {
                    c2000c.f8535b = false;
                    c2000c.f8534a = true;
                } else if (i12 == 0) {
                    c2000c.f8535b = true;
                    c2000c.f8534a = true;
                }
            } else if (c2000c.f8539f == null) {
                c2000c.f8535b = false;
                c2000c.f8534a = true;
            } else if (c2000c.f8538e == null) {
                c2000c.f8535b = true;
                c2000c.f8534a = true;
            }
        } else if (c2030t == null && c2000c.f8537d == 0) {
            c2000c.f8535b = true;
            c2000c.f8534a = true;
        } else if (c2030t2 == null && c2000c.f8536c == 0) {
            c2000c.f8535b = false;
            c2000c.f8534a = true;
        }
        return c2000c;
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public String[] mo10817I() {
        return f8522a0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: N */
    public boolean mo10904N(C2030t c2030t, C2030t c2030t2) {
        if (c2030t == null && c2030t2 == null) {
            return false;
        }
        if (c2030t != null && c2030t2 != null && c2030t2.f8615a.containsKey("android:visibility:visibility") != c2030t.f8615a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2000c m10954t0 = m10954t0(c2030t, c2030t2);
        if (!m10954t0.f8534a) {
            return false;
        }
        if (m10954t0.f8536c != 0 && m10954t0.f8537d != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m10953r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m10953r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        C2000c m10954t0 = m10954t0(c2030t, c2030t2);
        if (m10954t0.f8534a) {
            if (m10954t0.f8538e != null || m10954t0.f8539f != null) {
                if (m10954t0.f8535b) {
                    return m10956v0(viewGroup, c2030t, m10954t0.f8536c, c2030t2, m10954t0.f8537d);
                }
                return m10957x0(viewGroup, c2030t, m10954t0.f8536c, c2030t2, m10954t0.f8537d);
            }
            return null;
        }
        return null;
    }

    /* renamed from: s0 */
    public int m10955s0() {
        return this.f8523Z;
    }

    /* renamed from: u0 */
    public Animator mo10873u0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        return null;
    }

    /* renamed from: v0 */
    public Animator m10956v0(ViewGroup viewGroup, C2030t c2030t, int i11, C2030t c2030t2, int i12) {
        if ((this.f8523Z & 1) != 1 || c2030t2 == null) {
            return null;
        }
        if (c2030t == null) {
            View view = (View) c2030t2.f8616b.getParent();
            if (m10954t0(m10935x(view, false), m10903L(view, false)).f8534a) {
                return null;
            }
        }
        return mo10873u0(viewGroup, c2030t2.f8616b, c2030t, c2030t2);
    }

    /* renamed from: w0 */
    public Animator mo10874w0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:            if (r10.f8484L != false) goto L44;     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator m10957x0(ViewGroup viewGroup, C2030t c2030t, int i11, C2030t c2030t2, int i12) {
        View view;
        View view2;
        boolean z11;
        boolean z12;
        View view3;
        if ((this.f8523Z & 2) != 2 || c2030t == null) {
            return null;
        }
        View view4 = c2030t.f8616b;
        if (c2030t2 != null) {
            view = c2030t2.f8616b;
        } else {
            view = null;
        }
        View view5 = (View) view4.getTag(AbstractC21441e.save_overlay_view);
        if (view5 != null) {
            view3 = null;
            z12 = true;
        } else if (view != null && view.getParent() != null) {
            if (i12 == 4 || view4 == view) {
                view2 = view;
                z11 = false;
                view = null;
                if (z11) {
                }
                z12 = false;
                View view6 = view2;
                view5 = view;
                view3 = view6;
            }
            view = null;
            view2 = null;
            z11 = true;
            if (z11) {
            }
            z12 = false;
            View view62 = view2;
            view5 = view;
            view3 = view62;
        } else {
            if (view != null) {
                view2 = null;
                z11 = false;
                if (z11) {
                    if (view4.getParent() != null) {
                        if (view4.getParent() instanceof View) {
                            View view7 = (View) view4.getParent();
                            if (!m10954t0(m10903L(view7, true), m10935x(view7, true)).f8534a) {
                                view = AbstractC2029s.m11029a(viewGroup, view4, view7);
                            } else {
                                int id2 = view7.getId();
                                if (view7.getParent() == null) {
                                    if (id2 != -1) {
                                        if (viewGroup.findViewById(id2) != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    view3 = view2;
                    z12 = false;
                    view5 = view4;
                }
                z12 = false;
                View view622 = view2;
                view5 = view;
                view3 = view622;
            }
            view = null;
            view2 = null;
            z11 = true;
            if (z11) {
            }
            z12 = false;
            View view6222 = view2;
            view5 = view;
            view3 = view6222;
        }
        if (view5 != null) {
            if (!z12) {
                int[] iArr = (int[]) c2030t.f8615a.get("android:visibility:screenLocation");
                int i13 = iArr[0];
                int i14 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i13 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i14 - iArr2[1]) - view5.getTop());
                AbstractC2035y.m11037b(viewGroup).mo11034c(view5);
            }
            Animator mo10874w0 = mo10874w0(viewGroup, view5, c2030t, c2030t2);
            if (!z12) {
                if (mo10874w0 == null) {
                    AbstractC2035y.m11037b(viewGroup).mo11035d(view5);
                } else {
                    view4.setTag(AbstractC21441e.save_overlay_view, view5);
                    mo10907a(new C1998a(viewGroup, view5, view4));
                }
            }
            return mo10874w0;
        }
        if (view3 == null) {
            return null;
        }
        int visibility = view3.getVisibility();
        AbstractC2004b0.m10975i(view3, 0);
        Animator mo10874w02 = mo10874w0(viewGroup, view3, c2030t, c2030t2);
        if (mo10874w02 != null) {
            C1999b c1999b = new C1999b(view3, i12, true);
            mo10874w02.addListener(c1999b);
            AbstractC2001a.m10961a(mo10874w02, c1999b);
            mo10907a(c1999b);
        } else {
            AbstractC2004b0.m10975i(view3, visibility);
        }
        return mo10874w02;
    }

    /* renamed from: y0 */
    public void m10958y0(int i11) {
        if ((i11 & (-4)) == 0) {
            this.f8523Z = i11;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8523Z = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8595e);
        int m7111g = AbstractC1404k.m7111g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (m7111g != 0) {
            m10958y0(m7111g);
        }
    }
}
