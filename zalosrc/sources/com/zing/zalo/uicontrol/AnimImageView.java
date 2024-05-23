package com.zing.zalo.uicontrol;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class AnimImageView extends AppCompatImageView {

    /* renamed from: p */
    int f83079p;

    /* renamed from: q */
    int f83080q;

    /* renamed from: r */
    long f83081r;

    /* renamed from: s */
    boolean f83082s;

    /* renamed from: t */
    int[] f83083t;

    /* renamed from: u */
    Handler f83084u;

    /* renamed from: com.zing.zalo.uicontrol.AnimImageView$a */
    /* loaded from: classes4.dex */
    class HandlerC16450a extends Handler {
        HandlerC16450a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                AnimImageView animImageView = AnimImageView.this;
                if (animImageView.f83082s && animImageView.isShown()) {
                    try {
                        AnimImageView animImageView2 = AnimImageView.this;
                        int[] iArr = animImageView2.f83083t;
                        if (iArr != null) {
                            if (animImageView2.f83080q >= iArr.length) {
                                animImageView2.f83080q = 0;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("ANIMATION ");
                            sb2.append(AnimImageView.this.f83080q);
                            AnimImageView animImageView3 = AnimImageView.this;
                            animImageView3.setImageResource(animImageView3.f83083t[animImageView3.f83080q]);
                            AnimImageView.this.invalidate();
                            AnimImageView.this.f83080q++;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    AnimImageView animImageView4 = AnimImageView.this;
                    animImageView4.f83084u.sendEmptyMessageDelayed(0, animImageView4.f83081r);
                } else {
                    AnimImageView.this.f83082s = false;
                    return;
                }
            }
            super.handleMessage(message);
        }
    }

    public AnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83079p = -1;
        this.f83080q = 0;
        this.f83081r = 240L;
        this.f83082s = false;
        this.f83083t = null;
        this.f83084u = new HandlerC16450a(Looper.getMainLooper());
    }

    /* renamed from: f */
    public void m87662f() {
        if (!this.f83082s) {
            this.f83084u.sendEmptyMessageDelayed(0, this.f83081r);
        }
        this.f83082s = true;
    }

    /* renamed from: g */
    public void m87663g(int i11) {
        try {
            this.f83082s = false;
            this.f83084u.removeMessages(0);
            this.f83084u.sendEmptyMessage(0);
            setImageResource(i11);
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public int[] getAnimArray() {
        return this.f83083t;
    }

    public long getSleepTime() {
        return this.f83081r;
    }

    public void setAnimArray(int[] iArr) {
        this.f83083t = iArr;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.f83079p = i11;
        super.setImageResource(i11);
    }

    public void setSleepTime(long j11) {
        this.f83081r = j11;
    }
}
