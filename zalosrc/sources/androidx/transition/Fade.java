package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.view.AbstractC1579n0;

/* loaded from: classes2.dex */
public class Fade extends Visibility {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.Fade$a */
    /* loaded from: classes2.dex */
    public class C1979a extends AbstractC2027q {

        /* renamed from: p */
        final /* synthetic */ View f8453p;

        C1979a(View view) {
            this.f8453p = view;
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            AbstractC2004b0.m10974h(this.f8453p, 1.0f);
            AbstractC2004b0.m10967a(this.f8453p);
            transition.mo10910b0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Fade$b */
    /* loaded from: classes2.dex */
    public static class C1980b extends AnimatorListenerAdapter {

        /* renamed from: p */
        private final View f8455p;

        /* renamed from: q */
        private boolean f8456q = false;

        C1980b(View view) {
            this.f8455p = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2004b0.m10974h(this.f8455p, 1.0f);
            if (this.f8456q) {
                this.f8455p.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC1579n0.m7853a0(this.f8455p) && this.f8455p.getLayerType() == 0) {
                this.f8456q = true;
                this.f8455p.setLayerType(2, null);
            }
        }
    }

    public Fade(int i11) {
        m10958y0(i11);
    }

    /* renamed from: A0 */
    private static float m10875A0(C2030t c2030t, float f11) {
        Float f12;
        if (c2030t != null && (f12 = (Float) c2030t.f8615a.get("android:fade:transitionAlpha")) != null) {
            return f12.floatValue();
        }
        return f11;
    }

    /* renamed from: z0 */
    private Animator m10876z0(View view, float f11, float f12) {
        if (f11 == f12) {
            return null;
        }
        AbstractC2004b0.m10974h(view, f11);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC2004b0.f8544b, f12);
        ofFloat.addListener(new C1980b(view));
        mo10907a(new C1979a(view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        super.mo10819l(c2030t);
        c2030t.f8615a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC2004b0.m10969c(c2030t.f8616b)));
    }

    @Override // androidx.transition.Visibility
    /* renamed from: u0 */
    public Animator mo10873u0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        float f11 = 0.0f;
        float m10875A0 = m10875A0(c2030t, 0.0f);
        if (m10875A0 != 1.0f) {
            f11 = m10875A0;
        }
        return m10876z0(view, f11, 1.0f);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: w0 */
    public Animator mo10874w0(ViewGroup viewGroup, View view, C2030t c2030t, C2030t c2030t2) {
        AbstractC2004b0.m10971e(view);
        return m10876z0(view, m10875A0(c2030t, 1.0f), 0.0f);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8596f);
        m10958y0(AbstractC1404k.m7111g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, m10955s0()));
        obtainStyledAttributes.recycle();
    }
}
