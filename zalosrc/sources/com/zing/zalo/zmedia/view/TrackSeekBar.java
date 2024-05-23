package com.zing.zalo.zmedia.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.zing.zalo.zplayer.C17395R;

/* loaded from: classes7.dex */
public class TrackSeekBar extends SeekBar {

    /* renamed from: p */
    private Drawable f88186p;

    /* renamed from: q */
    boolean f88187q;

    public TrackSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88187q = true;
        m92266a();
    }

    /* renamed from: a */
    private void m92266a() {
        setPadding(getResources().getDimensionPixelSize(C17395R.dimen.seekbar_padding), getPaddingTop(), getResources().getDimensionPixelSize(C17395R.dimen.seekbar_padding), getPaddingBottom());
        setThumbOffset(getResources().getDimensionPixelSize(C17395R.dimen.thumb_size) / 2);
    }

    /* renamed from: b */
    public void m92267b() {
        int intrinsicHeight;
        Drawable drawable = this.f88186p;
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
        m92267b();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f88187q) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableTouch(boolean z11) {
        this.f88187q = z11;
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f88186p = drawable;
        m92267b();
        super.setThumb(drawable);
    }
}
