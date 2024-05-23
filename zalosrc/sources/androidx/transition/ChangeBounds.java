package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.view.AbstractC1579n0;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* renamed from: c0 */
    private static final String[] f8375c0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: d0 */
    private static final Property f8376d0 = new C1959b(PointF.class, "boundsOrigin");

    /* renamed from: e0 */
    private static final Property f8377e0 = new C1960c(PointF.class, "topLeft");

    /* renamed from: f0 */
    private static final Property f8378f0 = new C1961d(PointF.class, "bottomRight");

    /* renamed from: g0 */
    private static final Property f8379g0 = new C1962e(PointF.class, "bottomRight");

    /* renamed from: h0 */
    private static final Property f8380h0 = new C1963f(PointF.class, "topLeft");

    /* renamed from: i0 */
    private static final Property f8381i0 = new C1964g(PointF.class, "position");

    /* renamed from: j0 */
    private static C2024n f8382j0 = new C2024n();

    /* renamed from: Z */
    private int[] f8383Z;

    /* renamed from: a0 */
    private boolean f8384a0;

    /* renamed from: b0 */
    private boolean f8385b0;

    /* renamed from: androidx.transition.ChangeBounds$a */
    /* loaded from: classes2.dex */
    class C1958a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ ViewGroup f8386p;

        /* renamed from: q */
        final /* synthetic */ BitmapDrawable f8387q;

        /* renamed from: r */
        final /* synthetic */ View f8388r;

        /* renamed from: s */
        final /* synthetic */ float f8389s;

        C1958a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f11) {
            this.f8386p = viewGroup;
            this.f8387q = bitmapDrawable;
            this.f8388r = view;
            this.f8389s = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2004b0.m10968b(this.f8386p).mo10965b(this.f8387q);
            AbstractC2004b0.m10974h(this.f8388r, this.f8389s);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    /* loaded from: classes2.dex */
    static class C1959b extends Property {

        /* renamed from: a */
        private Rect f8391a;

        C1959b(Class cls, String str) {
            super(cls, str);
            this.f8391a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f8391a);
            Rect rect = this.f8391a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f8391a);
            this.f8391a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f8391a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    /* loaded from: classes2.dex */
    static class C1960c extends Property {
        C1960c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C1968k c1968k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C1968k c1968k, PointF pointF) {
            c1968k.m10840c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    /* loaded from: classes2.dex */
    static class C1961d extends Property {
        C1961d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C1968k c1968k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C1968k c1968k, PointF pointF) {
            c1968k.m10839a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    /* loaded from: classes2.dex */
    static class C1962e extends Property {
        C1962e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC2004b0.m10973g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    /* loaded from: classes2.dex */
    static class C1963f extends Property {
        C1963f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC2004b0.m10973g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    /* loaded from: classes2.dex */
    static class C1964g extends Property {
        C1964g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AbstractC2004b0.m10973g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    /* loaded from: classes2.dex */
    class C1965h extends AnimatorListenerAdapter {
        private C1968k mViewBounds;

        /* renamed from: p */
        final /* synthetic */ C1968k f8392p;

        C1965h(C1968k c1968k) {
            this.f8392p = c1968k;
            this.mViewBounds = c1968k;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    /* loaded from: classes2.dex */
    class C1966i extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f8394p;

        /* renamed from: q */
        final /* synthetic */ View f8395q;

        /* renamed from: r */
        final /* synthetic */ Rect f8396r;

        /* renamed from: s */
        final /* synthetic */ int f8397s;

        /* renamed from: t */
        final /* synthetic */ int f8398t;

        /* renamed from: u */
        final /* synthetic */ int f8399u;

        /* renamed from: v */
        final /* synthetic */ int f8400v;

        C1966i(View view, Rect rect, int i11, int i12, int i13, int i14) {
            this.f8395q = view;
            this.f8396r = rect;
            this.f8397s = i11;
            this.f8398t = i12;
            this.f8399u = i13;
            this.f8400v = i14;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8394p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f8394p) {
                AbstractC1579n0.m7815H0(this.f8395q, this.f8396r);
                AbstractC2004b0.m10973g(this.f8395q, this.f8397s, this.f8398t, this.f8399u, this.f8400v);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    /* loaded from: classes2.dex */
    class C1967j extends AbstractC2027q {

        /* renamed from: p */
        boolean f8402p = false;

        /* renamed from: q */
        final /* synthetic */ ViewGroup f8403q;

        C1967j(ViewGroup viewGroup) {
            this.f8403q = viewGroup;
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: a */
        public void mo10834a(Transition transition) {
            AbstractC2035y.m11039d(this.f8403q, true);
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: c */
        public void mo10835c(Transition transition) {
            AbstractC2035y.m11039d(this.f8403q, false);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            if (!this.f8402p) {
                AbstractC2035y.m11039d(this.f8403q, false);
            }
            transition.mo10910b0(this);
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: e */
        public void mo10837e(Transition transition) {
            AbstractC2035y.m11039d(this.f8403q, false);
            this.f8402p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeBounds$k */
    /* loaded from: classes2.dex */
    public static class C1968k {

        /* renamed from: a */
        private int f8405a;

        /* renamed from: b */
        private int f8406b;

        /* renamed from: c */
        private int f8407c;

        /* renamed from: d */
        private int f8408d;

        /* renamed from: e */
        private View f8409e;

        /* renamed from: f */
        private int f8410f;

        /* renamed from: g */
        private int f8411g;

        C1968k(View view) {
            this.f8409e = view;
        }

        /* renamed from: b */
        private void m10838b() {
            AbstractC2004b0.m10973g(this.f8409e, this.f8405a, this.f8406b, this.f8407c, this.f8408d);
            this.f8410f = 0;
            this.f8411g = 0;
        }

        /* renamed from: a */
        void m10839a(PointF pointF) {
            this.f8407c = Math.round(pointF.x);
            this.f8408d = Math.round(pointF.y);
            int i11 = this.f8411g + 1;
            this.f8411g = i11;
            if (this.f8410f == i11) {
                m10838b();
            }
        }

        /* renamed from: c */
        void m10840c(PointF pointF) {
            this.f8405a = Math.round(pointF.x);
            this.f8406b = Math.round(pointF.y);
            int i11 = this.f8410f + 1;
            this.f8410f = i11;
            if (i11 == this.f8411g) {
                m10838b();
            }
        }
    }

    public ChangeBounds() {
        this.f8383Z = new int[2];
        this.f8384a0 = false;
        this.f8385b0 = false;
    }

    /* renamed from: r0 */
    private void m10815r0(C2030t c2030t) {
        View view = c2030t.f8616b;
        if (AbstractC1579n0.m7865e0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            c2030t.f8615a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c2030t.f8615a.put("android:changeBounds:parent", c2030t.f8616b.getParent());
            if (this.f8385b0) {
                c2030t.f8616b.getLocationInWindow(this.f8383Z);
                c2030t.f8615a.put("android:changeBounds:windowX", Integer.valueOf(this.f8383Z[0]));
                c2030t.f8615a.put("android:changeBounds:windowY", Integer.valueOf(this.f8383Z[1]));
            }
            if (this.f8384a0) {
                c2030t.f8615a.put("android:changeBounds:clip", AbstractC1579n0.m7911y(view));
            }
        }
    }

    /* renamed from: s0 */
    private boolean m10816s0(View view, View view2) {
        if (!this.f8385b0) {
            return true;
        }
        C2030t m10935x = m10935x(view, true);
        if (m10935x == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m10935x.f8616b) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public String[] mo10817I() {
        return f8375c0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m10815r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m10815r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        int i11;
        View view;
        ObjectAnimator m11019a;
        int i12;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator m11031c;
        if (c2030t == null || c2030t2 == null) {
            return null;
        }
        Map map = c2030t.f8615a;
        Map map2 = c2030t2.f8615a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c2030t2.f8616b;
        if (m10816s0(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) c2030t.f8615a.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) c2030t2.f8615a.get("android:changeBounds:bounds");
            int i13 = rect3.left;
            int i14 = rect4.left;
            int i15 = rect3.top;
            int i16 = rect4.top;
            int i17 = rect3.right;
            int i18 = rect4.right;
            int i19 = rect3.bottom;
            int i21 = rect4.bottom;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            int i24 = i18 - i14;
            int i25 = i21 - i16;
            Rect rect5 = (Rect) c2030t.f8615a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) c2030t2.f8615a.get("android:changeBounds:clip");
            if ((i22 != 0 && i23 != 0) || (i24 != 0 && i25 != 0)) {
                if (i13 == i14 && i15 == i16) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if (i17 != i18 || i19 != i21) {
                    i11++;
                }
            } else {
                i11 = 0;
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i11++;
            }
            if (i11 > 0) {
                if (!this.f8384a0) {
                    view = view2;
                    AbstractC2004b0.m10973g(view, i13, i15, i17, i19);
                    if (i11 == 2) {
                        if (i22 == i24 && i23 == i25) {
                            m11031c = AbstractC2022l.m11019a(view, f8381i0, m10937z().mo10810a(i13, i15, i14, i16));
                        } else {
                            C1968k c1968k = new C1968k(view);
                            ObjectAnimator m11019a2 = AbstractC2022l.m11019a(c1968k, f8377e0, m10937z().mo10810a(i13, i15, i14, i16));
                            ObjectAnimator m11019a3 = AbstractC2022l.m11019a(c1968k, f8378f0, m10937z().mo10810a(i17, i19, i18, i21));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(m11019a2, m11019a3);
                            animatorSet.addListener(new C1965h(c1968k));
                            m11031c = animatorSet;
                        }
                    } else if (i13 == i14 && i15 == i16) {
                        m11031c = AbstractC2022l.m11019a(view, f8379g0, m10937z().mo10810a(i17, i19, i18, i21));
                    } else {
                        m11031c = AbstractC2022l.m11019a(view, f8380h0, m10937z().mo10810a(i13, i15, i14, i16));
                    }
                } else {
                    view = view2;
                    AbstractC2004b0.m10973g(view, i13, i15, Math.max(i22, i24) + i13, Math.max(i23, i25) + i15);
                    if (i13 == i14 && i15 == i16) {
                        m11019a = null;
                    } else {
                        m11019a = AbstractC2022l.m11019a(view, f8381i0, m10937z().mo10810a(i13, i15, i14, i16));
                    }
                    if (rect5 == null) {
                        i12 = 0;
                        rect = new Rect(0, 0, i22, i23);
                    } else {
                        i12 = 0;
                        rect = rect5;
                    }
                    if (rect6 == null) {
                        rect2 = new Rect(i12, i12, i24, i25);
                    } else {
                        rect2 = rect6;
                    }
                    if (!rect.equals(rect2)) {
                        AbstractC1579n0.m7815H0(view, rect);
                        C2024n c2024n = f8382j0;
                        Object[] objArr = new Object[2];
                        objArr[i12] = rect;
                        objArr[1] = rect2;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c2024n, objArr);
                        ofObject.addListener(new C1966i(view, rect6, i14, i16, i18, i21));
                        objectAnimator = ofObject;
                    } else {
                        objectAnimator = null;
                    }
                    m11031c = AbstractC2029s.m11031c(m11019a, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    AbstractC2035y.m11039d(viewGroup4, true);
                    mo10907a(new C1967j(viewGroup4));
                }
                return m11031c;
            }
            return null;
        }
        int intValue = ((Integer) c2030t.f8615a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) c2030t.f8615a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) c2030t2.f8615a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) c2030t2.f8615a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f8383Z);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float m10969c = AbstractC2004b0.m10969c(view2);
        AbstractC2004b0.m10974h(view2, 0.0f);
        AbstractC2004b0.m10968b(viewGroup).mo10964a(bitmapDrawable);
        PathMotion m10937z = m10937z();
        int[] iArr = this.f8383Z;
        int i26 = iArr[0];
        int i27 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC2023m.m11020a(f8376d0, m10937z.mo10810a(intValue - i26, intValue2 - i27, intValue3 - i26, intValue4 - i27)));
        ofPropertyValuesHolder.addListener(new C1958a(viewGroup, bitmapDrawable, view2, m10969c));
        return ofPropertyValuesHolder;
    }

    /* renamed from: t0 */
    public void m10821t0(boolean z11) {
        this.f8384a0 = z11;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8383Z = new int[2];
        this.f8384a0 = false;
        this.f8385b0 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8594d);
        boolean m7105a = AbstractC1404k.m7105a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        m10821t0(m7105a);
    }
}
