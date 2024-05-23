package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import androidx.core.util.AbstractC1487i;
import java.util.ArrayList;
import p357n6.AbstractC23578c;
import p634x6.AbstractC29387b;
import p671y6.InterfaceC30798b;
import p706z6.C31689h;
import p706z6.C31694m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.e */
/* loaded from: classes3.dex */
public class C6324e extends AbstractC6323d {

    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    /* loaded from: classes3.dex */
    public static class a extends C31689h {
        a(C31694m c31694m) {
            super(c31694m);
        }

        @Override // p706z6.C31689h, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C6324e(FloatingActionButton floatingActionButton, InterfaceC30798b interfaceC30798b) {
        super(floatingActionButton, interfaceC30798b);
    }

    /* renamed from: i0 */
    private Animator m32439i0(float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f35390y, "elevation", f11).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f35390y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f12).setDuration(100L));
        animatorSet.setInterpolator(AbstractC6323d.f35354F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: B */
    public void mo32389B() {
        m32419e0();
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: D */
    public void mo32391D(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f35390y.isEnabled()) {
                this.f35390y.setElevation(this.f35373h);
                if (this.f35390y.isPressed()) {
                    this.f35390y.setTranslationZ(this.f35375j);
                    return;
                } else if (!this.f35390y.isFocused() && !this.f35390y.isHovered()) {
                    this.f35390y.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f35390y.setTranslationZ(this.f35374i);
                    return;
                }
            }
            this.f35390y.setElevation(0.0f);
            this.f35390y.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: E */
    void mo32392E(float f11, float f12, float f13) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 21) {
            this.f35390y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(AbstractC6323d.f35355G, m32439i0(f11, f13));
            stateListAnimator.addState(AbstractC6323d.f35356H, m32439i0(f11, f12));
            stateListAnimator.addState(AbstractC6323d.f35357I, m32439i0(f11, f12));
            stateListAnimator.addState(AbstractC6323d.f35358J, m32439i0(f11, f12));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f35390y, "elevation", f11).setDuration(0L));
            if (i11 >= 22 && i11 <= 24) {
                FloatingActionButton floatingActionButton = this.f35390y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f35390y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(AbstractC6323d.f35354F);
            stateListAnimator.addState(AbstractC6323d.f35359K, animatorSet);
            stateListAnimator.addState(AbstractC6323d.f35360L, m32439i0(0.0f, 0.0f));
            this.f35390y.setStateListAnimator(stateListAnimator);
        }
        if (mo32412Y()) {
            m32419e0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: J */
    boolean mo32397J() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: U */
    public void mo32408U(ColorStateList colorStateList) {
        Drawable drawable = this.f35368c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(AbstractC29387b.m146554d(colorStateList));
        } else {
            super.mo32408U(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: Y */
    boolean mo32412Y() {
        if (!this.f35391z.mo32356b() && m32413a0()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: c0 */
    void mo32415c0() {
    }

    /* renamed from: h0 */
    C6322c m32440h0(int i11, ColorStateList colorStateList) {
        Context context = this.f35390y.getContext();
        C6322c c6322c = new C6322c((C31694m) AbstractC1487i.m7492g(this.f35366a));
        c6322c.m32375e(AbstractC1388a.m6961c(context, AbstractC23578c.design_fab_stroke_top_outer_color), AbstractC1388a.m6961c(context, AbstractC23578c.design_fab_stroke_top_inner_color), AbstractC1388a.m6961c(context, AbstractC23578c.design_fab_stroke_end_inner_color), AbstractC1388a.m6961c(context, AbstractC23578c.design_fab_stroke_end_outer_color));
        c6322c.m32374d(i11);
        c6322c.m32373c(colorStateList);
        return c6322c;
    }

    /* renamed from: j0 */
    C31689h m32441j0() {
        return new a((C31694m) AbstractC1487i.m7492g(this.f35366a));
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: m */
    public float mo32423m() {
        return this.f35390y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: r */
    public void mo32427r(Rect rect) {
        if (this.f35391z.mo32356b()) {
            super.mo32427r(rect);
        } else if (!m32413a0()) {
            int sizeDimension = (this.f35376k - this.f35390y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: w */
    public void mo32432w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i11) {
        Drawable drawable;
        C31689h m32441j0 = m32441j0();
        this.f35367b = m32441j0;
        m32441j0.setTintList(colorStateList);
        if (mode != null) {
            this.f35367b.setTintMode(mode);
        }
        this.f35367b.m152435R(this.f35390y.getContext());
        if (i11 > 0) {
            this.f35369d = m32440h0(i11, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) AbstractC1487i.m7492g(this.f35369d), (Drawable) AbstractC1487i.m7492g(this.f35367b)});
        } else {
            this.f35369d = null;
            drawable = this.f35367b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC29387b.m146554d(colorStateList2), drawable, null);
        this.f35368c = rippleDrawable;
        this.f35370e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6323d
    /* renamed from: z */
    public void mo32435z() {
    }
}
