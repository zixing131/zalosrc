package com.zing.zalo.p077ui.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.zvideoutil.ZAbstractBase;

/* loaded from: classes6.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: p */
    private Animator f69401p;

    /* renamed from: q */
    private final int f69402q;

    /* renamed from: r */
    private final int f69403r;

    /* renamed from: s */
    private final int f69404s;

    /* renamed from: t */
    private final int f69405t;

    public MaterialProgressBar(Context context) {
        this(context, null, -1);
    }

    /* renamed from: a */
    private Drawable m75797a(int i11) {
        return new ClipDrawable(m75800d(i11), 8388611, 1);
    }

    /* renamed from: b */
    private Animator m75798b() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m75801e("secondaryProgress", new DecelerateInterpolator()), m75801e("progress", new AccelerateInterpolator()));
        animatorSet.setDuration(this.f69402q);
        return animatorSet;
    }

    /* renamed from: c */
    private void m75799c(int i11, int i12) {
        try {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            if (layerDrawable != null) {
                layerDrawable.mutate();
                layerDrawable.setDrawableByLayerId(R.id.background, m75800d(i11));
                layerDrawable.setDrawableByLayerId(R.id.progress, m75797a(i11));
                layerDrawable.setDrawableByLayerId(R.id.secondaryProgress, m75797a(i12));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    private ShapeDrawable m75800d(int i11) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        m75803g(shapeDrawable, i11);
        return shapeDrawable;
    }

    /* renamed from: e */
    private ObjectAnimator m75801e(String str, Interpolator interpolator) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, str, 0, 1000);
        ofInt.setInterpolator(interpolator);
        ofInt.setDuration(this.f69402q);
        ofInt.setRepeatMode(1);
        ofInt.setRepeatCount(-1);
        return ofInt;
    }

    /* renamed from: f */
    private boolean m75802f() {
        Animator animator = this.f69401p;
        if (animator != null && animator.isStarted()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m75803g(ShapeDrawable shapeDrawable, int i11) {
        shapeDrawable.getPaint().setColor(i11);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        if (m75802f()) {
            return;
        }
        Animator m75798b = m75798b();
        this.f69401p = m75798b;
        m75798b.setTarget(this);
        this.f69401p.start();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69401p = null;
        int i12 = AbstractC16801x.primary_blue_light;
        this.f69403r = i12;
        int i13 = AbstractC16801x.cM1;
        this.f69404s = i13;
        this.f69405t = ZAbstractBase.ZVU_PROCESS_FLUSH;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.MaterialProgressBar, i11, 0);
        try {
            int color = obtainStyledAttributes.getColor(AbstractC8923h0.MaterialProgressBar_backgroundColour, getResources().getColor(i12));
            int color2 = obtainStyledAttributes.getColor(AbstractC8923h0.MaterialProgressBar_progressColour, getResources().getColor(i13));
            this.f69402q = obtainStyledAttributes.getInteger(AbstractC8923h0.MaterialProgressBar_duration, ZAbstractBase.ZVU_PROCESS_FLUSH);
            obtainStyledAttributes.recycle();
            setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
            m75799c(color, color2);
            setMax(1000);
            super.setIndeterminate(false);
            setIndeterminate(true);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
