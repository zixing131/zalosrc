package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC16803z;

/* loaded from: classes5.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: p */
    private boolean f61703p;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(AbstractC16803z.photo_button_selector);
    }

    /* renamed from: f */
    public void mo65856f() {
    }

    /* renamed from: g */
    public void mo65857g() {
        clearColorFilter();
    }

    /* renamed from: h */
    public void mo65858h() {
        setColorFilter(-7829368);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (isEnabled()) {
            boolean z12 = false;
            if (motionEvent.getAction() == 0) {
                this.f61703p = false;
                mo65858h();
            }
            if (motionEvent.getAction() == 1 && !this.f61703p) {
                mo65857g();
                mo65856f();
            } else if (motionEvent.getAction() == 2 && !this.f61703p) {
                if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= getWidth()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (motionEvent.getY() < 0.0f || motionEvent.getY() > getHeight()) {
                    z12 = true;
                }
                if (z11 || z12) {
                    mo65857g();
                    this.f61703p = true;
                }
            } else if (motionEvent.getAction() == 3) {
                mo65857g();
                this.f61703p = true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
