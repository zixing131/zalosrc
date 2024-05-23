package com.zing.zalo.shortvideo.p072ui.widget.seek;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import s20.AbstractC26104f;

/* loaded from: classes5.dex */
public class SeekBar extends View {

    /* renamed from: p */
    private boolean f54682p;

    /* renamed from: q */
    private boolean f54683q;

    /* renamed from: r */
    private InterfaceC10841a f54684r;

    /* renamed from: s */
    private int f54685s;

    /* renamed from: t */
    private int f54686t;

    /* renamed from: u */
    private int f54687u;

    /* renamed from: v */
    private MotionEvent f54688v;

    /* renamed from: w */
    private int f54689w;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.seek.SeekBar$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10841a {
        /* renamed from: a */
        void mo54689a(SeekBar seekBar, int i11, boolean z11);

        /* renamed from: b */
        void mo54690b(SeekBar seekBar);

        /* renamed from: c */
        void mo54691c(SeekBar seekBar, boolean z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54682p = true;
        this.f54687u = 100;
        this.f54689w = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final boolean m56229a() {
        return this.f54682p;
    }

    /* renamed from: b */
    public final boolean m56230b() {
        return this.f54683q;
    }

    /* renamed from: c */
    protected void mo56231c(MotionEvent motionEvent) {
        int m104529e;
        AbstractC19074t.m100208f(motionEvent, "event");
        float x11 = (motionEvent.getX() - getPaddingStart()) / getValidWidth();
        m104529e = AbstractC20104d.m104529e(this.f54686t + (x11 * (this.f54687u - r0)));
        int min = Math.min(Math.max(m104529e, this.f54686t), this.f54687u);
        if (this.f54685s != min) {
            this.f54685s = min;
            InterfaceC10841a interfaceC10841a = this.f54684r;
            if (interfaceC10841a != null) {
                interfaceC10841a.mo54689a(this, min, true);
            }
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getCurProgress() {
        return this.f54685s;
    }

    public final InterfaceC10841a getListener() {
        return this.f54684r;
    }

    public final int getMax() {
        return this.f54687u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMaxProgress() {
        return this.f54687u;
    }

    public final int getMin() {
        return this.f54686t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMinProgress() {
        return this.f54686t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float getPercentage() {
        Integer valueOf = Integer.valueOf(this.f54687u - this.f54686t);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return (this.f54685s - this.f54686t) / valueOf.intValue();
        }
        return 0.0f;
    }

    public final int getProgress() {
        return this.f54685s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float getValidWidth() {
        return ((getWidth() * 1.0f) - getPaddingStart()) - getPaddingEnd();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!this.f54682p) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f54683q = false;
                        this.f54688v = null;
                        InterfaceC10841a interfaceC10841a = this.f54684r;
                        if (interfaceC10841a != null) {
                            interfaceC10841a.mo54691c(this, true);
                        }
                    }
                } else {
                    MotionEvent motionEvent2 = this.f54688v;
                    if (motionEvent2 == null || AbstractC26104f.m134332c(motionEvent2, motionEvent, this.f54689w)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        mo56231c(motionEvent);
                        this.f54688v = null;
                    }
                }
            } else {
                mo56231c(motionEvent);
                this.f54683q = false;
                this.f54688v = null;
                InterfaceC10841a interfaceC10841a2 = this.f54684r;
                if (interfaceC10841a2 != null) {
                    interfaceC10841a2.mo54691c(this, false);
                }
            }
        } else {
            this.f54683q = true;
            this.f54688v = AbstractC26104f.m134330a(motionEvent);
            InterfaceC10841a interfaceC10841a3 = this.f54684r;
            if (interfaceC10841a3 != null) {
                interfaceC10841a3.mo54690b(this);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCurProgress(int i11) {
        this.f54685s = i11;
    }

    public final void setListener(InterfaceC10841a interfaceC10841a) {
        this.f54684r = interfaceC10841a;
    }

    public final void setMax(int i11) {
        if (this.f54687u != i11) {
            this.f54687u = i11;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setMaxProgress(int i11) {
        this.f54687u = i11;
    }

    public final void setMin(int i11) {
        if (this.f54686t != i11) {
            this.f54686t = i11;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setMinProgress(int i11) {
        this.f54686t = i11;
    }

    public final void setProgress(int i11) {
        if (this.f54685s != i11 && i11 >= this.f54686t && i11 <= this.f54687u) {
            this.f54685s = i11;
            InterfaceC10841a interfaceC10841a = this.f54684r;
            if (interfaceC10841a != null) {
                interfaceC10841a.mo54689a(this, i11, false);
            }
            invalidate();
        }
    }

    public final void setTouchable(boolean z11) {
        if (this.f54682p == z11) {
            return;
        }
        this.f54682p = z11;
        invalidate();
    }
}
