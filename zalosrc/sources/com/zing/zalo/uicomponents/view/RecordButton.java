package com.zing.zalo.uicomponents.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import p500s1.C26087b;
import p663xz.C30226b;
import p663xz.InterfaceC30225a;

/* loaded from: classes6.dex */
public abstract class RecordButton extends View {

    /* renamed from: p */
    protected final InterfaceC30225a f83007p;

    /* renamed from: q */
    public int f83008q;

    /* renamed from: r */
    public int f83009r;

    /* renamed from: s */
    public boolean f83010s;

    /* renamed from: t */
    protected Animator f83011t;

    /* renamed from: u */
    protected AnimatorSet f83012u;

    /* renamed from: v */
    public boolean f83013v;

    /* renamed from: w */
    public boolean f83014w;

    /* renamed from: x */
    protected ArgbEvaluator f83015x;

    /* renamed from: y */
    protected Interpolator f83016y;

    /* renamed from: z */
    private Animator f83017z;

    public RecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83007p = new C30226b(getContext());
        this.f83008q = ZAbstractBase.ZVU_PROCESS_FLUSH;
        this.f83009r = 0;
        this.f83010s = true;
        this.f83011t = null;
        this.f83013v = false;
        this.f83014w = false;
        this.f83015x = new ArgbEvaluator();
        this.f83016y = new C26087b();
        this.f83017z = null;
    }

    /* renamed from: a */
    public abstract void mo87626a(Animator.AnimatorListener animatorListener);

    /* renamed from: b */
    public abstract void mo87627b(boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m87634c(int[] iArr, int[] iArr2, int i11, float f11) {
        if (this.f83015x == null) {
            this.f83015x = new ArgbEvaluator();
        }
        return ((Integer) this.f83015x.evaluate(f11, Integer.valueOf(iArr[i11]), Integer.valueOf(iArr2[i11]))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public float m87635d(float[] fArr, float[] fArr2, int i11, float f11) {
        float f12 = fArr[i11];
        return f12 + (f11 * (fArr2[i11] - f12));
    }

    /* renamed from: e */
    public boolean m87636e(float f11, float f12) {
        return getTouchableRect().contains(f11, f12);
    }

    /* renamed from: f */
    public boolean m87637f() {
        Animator animator = this.f83011t;
        if (animator != null && animator.isRunning()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m87638g(boolean z11) {
        Animator animator = this.f83017z;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (z11) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 0.9f), ObjectAnimator.ofFloat(this, "scaleY", 0.9f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f));
        }
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new C26087b());
        this.f83017z = animatorSet;
        animatorSet.start();
    }

    protected RectF getTouchableRect() {
        return new RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    /* renamed from: h */
    public abstract void mo87628h(Animator.AnimatorListener animatorListener);

    /* renamed from: i */
    public abstract void mo87629i(Animator.AnimatorListener animatorListener);

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.f83012u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f83012u = null;
        }
        super.onDetachedFromWindow();
    }

    public void setBoomerangMode(boolean z11) {
    }

    public RecordButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83007p = new C30226b(getContext());
        this.f83008q = ZAbstractBase.ZVU_PROCESS_FLUSH;
        this.f83009r = 0;
        this.f83010s = true;
        this.f83011t = null;
        this.f83013v = false;
        this.f83014w = false;
        this.f83015x = new ArgbEvaluator();
        this.f83016y = new C26087b();
        this.f83017z = null;
    }
}
