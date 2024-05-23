package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* loaded from: classes4.dex */
public class TrackSeekBar extends AppCompatSeekBar {

    /* renamed from: q */
    private Drawable f83595q;

    /* renamed from: r */
    private final boolean f83596r;

    public TrackSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83596r = false;
    }

    /* renamed from: a */
    public void m88215a() {
        int intrinsicHeight;
        Drawable drawable = this.f83595q;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i11 = (intrinsicHeight - 4) / 2;
        getProgressDrawable().setBounds(0, i11, (getWidth() - paddingLeft) - getPaddingRight(), ((getHeight() - paddingTop) - getPaddingBottom()) - i11);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m88215a();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f83595q = drawable;
        m88215a();
        super.setThumb(drawable);
    }
}
