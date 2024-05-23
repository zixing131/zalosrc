package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.androidquery.util.C3979l;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class AspectRatioImageView extends com.showingphotolib.view.AspectRatioImageView {

    /* renamed from: p */
    private boolean f68947p;

    /* renamed from: q */
    private C13804v0 f68948q;

    /* renamed from: r */
    private int[] f68949r;

    public AspectRatioImageView(Context context) {
        super(context);
        this.f68949r = new int[]{0, -16538118};
        m75537i();
    }

    /* renamed from: i */
    private void m75537i() {
        this.f68948q = new C13804v0(this);
    }

    /* renamed from: j */
    private Drawable m75538j(C3979l c3979l) {
        return new BitmapDrawable(getResources(), c3979l.m18839c());
    }

    public C13804v0 getLoadingView() {
        return this.f68948q;
    }

    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f68948q != null && this.f68947p) {
            this.f68948q.m77067f((getWidth() / 2) - (this.f68948q.m77064c() / 2), (getHeight() / 2) - (this.f68948q.m77063b() / 2));
            this.f68948q.m77062a(canvas);
        }
    }

    public void setImageInfoAnim(C3979l c3979l) {
        AlphaAnimation alphaAnimation;
        Drawable drawable;
        try {
            Drawable m75538j = m75538j(c3979l);
            Drawable drawable2 = getDrawable();
            if (drawable2 == null) {
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                alphaAnimation.setDuration(1000L);
                drawable = m75538j;
            } else {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, m75538j});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(1000);
                alphaAnimation = null;
                drawable = transitionDrawable;
            }
            setImageInfo(c3979l, false);
            setImageDrawable(drawable);
            if (alphaAnimation != null) {
                alphaAnimation.setStartTime(AnimationUtils.currentAnimationTimeMillis());
                startAnimation(alphaAnimation);
            } else {
                setAnimation(null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            setImageInfo(c3979l);
        }
    }

    public void setLoadingColor(int[] iArr) {
        try {
            if (!Arrays.equals(this.f68949r, iArr)) {
                this.f68949r = iArr;
                this.f68948q.m77065d(iArr);
                invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setShowLoading(boolean z11) {
        this.f68947p = z11;
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68949r = new int[]{0, -16538118};
        m75537i();
    }
}
