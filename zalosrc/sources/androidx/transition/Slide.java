package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.view.AbstractC1579n0;
import org.xmlpull.v1.XmlPullParser;
import p286k2.C21442f;

/* loaded from: classes2.dex */
public class Slide extends Visibility {

    /* renamed from: d0 */
    private static final TimeInterpolator f8460d0 = new DecelerateInterpolator();

    /* renamed from: e0 */
    private static final TimeInterpolator f8461e0 = new AccelerateInterpolator();

    /* renamed from: f0 */
    private static final InterfaceC1987g f8462f0 = new C1981a();

    /* renamed from: g0 */
    private static final InterfaceC1987g f8463g0 = new C1982b();

    /* renamed from: h0 */
    private static final InterfaceC1987g f8464h0 = new C1983c();

    /* renamed from: i0 */
    private static final InterfaceC1987g f8465i0 = new C1984d();

    /* renamed from: j0 */
    private static final InterfaceC1987g f8466j0 = new C1985e();

    /* renamed from: k0 */
    private static final InterfaceC1987g f8467k0 = new C1986f();

    /* renamed from: b0 */
    private InterfaceC1987g f8468b0;

    /* renamed from: c0 */
    private int f8469c0;

    /* renamed from: androidx.transition.Slide$a */
    /* loaded from: classes2.dex */
    static class C1981a extends AbstractC1988h {
        C1981a() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: b */
        public float mo10881b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    /* loaded from: classes2.dex */
    static class C1982b extends AbstractC1988h {
        C1982b() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: b */
        public float mo10881b(ViewGroup viewGroup, View view) {
            if (AbstractC1579n0.m7812G(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    /* loaded from: classes2.dex */
    static class C1983c extends AbstractC1989i {
        C1983c() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: a */
        public float mo10882a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    /* loaded from: classes2.dex */
    static class C1984d extends AbstractC1988h {
        C1984d() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: b */
        public float mo10881b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    /* loaded from: classes2.dex */
    static class C1985e extends AbstractC1988h {
        C1985e() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: b */
        public float mo10881b(ViewGroup viewGroup, View view) {
            if (AbstractC1579n0.m7812G(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    /* loaded from: classes2.dex */
    static class C1986f extends AbstractC1989i {
        C1986f() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: a */
        public float mo10882a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Slide$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC1987g {
        /* renamed from: a */
        float mo10882a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo10881b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC1988h implements InterfaceC1987g {
        private AbstractC1988h() {
        }

        /* synthetic */ AbstractC1988h(C1981a c1981a) {
            this();
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: a */
        public float mo10882a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC1989i implements InterfaceC1987g {
        private AbstractC1989i() {
        }

        /* synthetic */ AbstractC1989i(C1981a c1981a) {
            this();
        }

        @Override // androidx.transition.Slide.InterfaceC1987g
        /* renamed from: b */
        public float mo10881b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8468b0 = f8467k0;
        this.f8469c0 = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8598h);
        int m7111g = AbstractC1404k.m7111g(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        m10880z0(m7111g);
    }

    /* renamed from: r0 */
    private void m10879r0(C2030t c2030t) {
        int[] iArr = new int[2];
        c2030t.f8616b.getLocationOnScreen(iArr);
        c2030t.f8615a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        super.mo10818i(c2030t);
        m10879r0(c2030t);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        super.mo10819l(c2030t);
        m10879r0(c2030t);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: u0 */
    public Animator mo10873u0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        if (c2030t2 == null) {
            return null;
        }
        int[] iArr = (int[]) c2030t2.f8615a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return AbstractC2032v.m11033a(view, c2030t2, iArr[0], iArr[1], this.f8468b0.mo10881b(viewGroup, view), this.f8468b0.mo10882a(viewGroup, view), translationX, translationY, f8460d0, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: w0 */
    public Animator mo10874w0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        if (c2030t == null) {
            return null;
        }
        int[] iArr = (int[]) c2030t.f8615a.get("android:slide:screenPosition");
        return AbstractC2032v.m11033a(view, c2030t, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f8468b0.mo10881b(viewGroup, view), this.f8468b0.mo10882a(viewGroup, view), f8461e0, this);
    }

    /* renamed from: z0 */
    public void m10880z0(int i11) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 48) {
                    if (i11 != 80) {
                        if (i11 != 8388611) {
                            if (i11 == 8388613) {
                                this.f8468b0 = f8466j0;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.f8468b0 = f8463g0;
                        }
                    } else {
                        this.f8468b0 = f8467k0;
                    }
                } else {
                    this.f8468b0 = f8464h0;
                }
            } else {
                this.f8468b0 = f8465i0;
            }
        } else {
            this.f8468b0 = f8462f0;
        }
        this.f8469c0 = i11;
        C21442f c21442f = new C21442f();
        c21442f.m110986j(i11);
        mo10923m0(c21442f);
    }
}
