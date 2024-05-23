package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageButton;
import com.zing.zalo.AbstractC16803z;

/* loaded from: classes5.dex */
public class PhotoButton extends ImageButton {

    /* renamed from: p */
    private final int f61674p;

    /* renamed from: q */
    private boolean f61675q;

    /* renamed from: r */
    private float f61676r;

    /* renamed from: s */
    private float f61677s;

    public PhotoButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(AbstractC16803z.photo_button_selector);
        this.f61674p = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    protected void mo65840a() {
    }

    /* renamed from: b */
    protected void mo65841b() {
        clearColorFilter();
    }

    /* renamed from: c */
    protected void mo65842c() {
        setColorFilter(-7829368);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (motionEvent.getAction() == 0) {
                this.f61676r = motionEvent.getX();
                this.f61677s = motionEvent.getY();
                this.f61675q = false;
                mo65842c();
            } else if (motionEvent.getAction() == 1 && !this.f61675q) {
                mo65841b();
                mo65840a();
            } else if (motionEvent.getAction() == 2 && !this.f61675q) {
                float x11 = motionEvent.getX() - this.f61676r;
                float y11 = motionEvent.getY() - this.f61677s;
                if (Math.abs(x11) > this.f61674p || Math.abs(y11) > this.f61674p) {
                    mo65841b();
                    this.f61675q = true;
                }
            } else if (motionEvent.getAction() == 3) {
                mo65841b();
                this.f61675q = true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
