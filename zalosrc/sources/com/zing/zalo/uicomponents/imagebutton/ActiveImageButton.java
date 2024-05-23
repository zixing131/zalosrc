package com.zing.zalo.uicomponents.imagebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import pc0.AbstractC24725c;

/* loaded from: classes6.dex */
public class ActiveImageButton extends ImageButton {

    /* renamed from: p */
    Animation f82921p;

    /* renamed from: q */
    Animation f82922q;

    /* renamed from: r */
    int f82923r;

    /* renamed from: s */
    boolean f82924s;

    public ActiveImageButton(Context context) {
        super(context);
        this.f82923r = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        this.f82924s = false;
        m87603a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:            if (r0 == null) goto L11;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m87603a(AttributeSet attributeSet) {
        TypedArray typedArray = null;
        try {
            try {
                typedArray = getContext().obtainStyledAttributes(attributeSet, AbstractC24725c.ActiveImageButton);
                this.f82923r = typedArray.getInt(AbstractC24725c.ActiveImageButton_scaleAnimationDuration, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            typedArray.recycle();
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.4f, 1.0f, 1.4f, 1, 0.5f, 1, 0.5f);
            this.f82921p = scaleAnimation;
            scaleAnimation.setDuration(this.f82923r);
            this.f82921p.setInterpolator(new BounceInterpolator());
            this.f82921p.setFillAfter(true);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.4f, 1.0f, 1.4f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.f82922q = scaleAnimation2;
            scaleAnimation2.setDuration(this.f82923r);
            this.f82922q.setInterpolator(new BounceInterpolator());
        } catch (Throwable th2) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th2;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f82924s) {
                this.f82924s = false;
                startAnimation(this.f82922q);
            }
            return super.onTouchEvent(motionEvent);
        }
        if (isEnabled()) {
            this.f82924s = true;
            startAnimation(this.f82921p);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public ActiveImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82923r = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        this.f82924s = false;
        m87603a(attributeSet);
    }
}
