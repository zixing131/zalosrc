package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19187j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes2.dex */
public class C1179j extends C1176i {

    /* renamed from: d */
    private final SeekBar f4643d;

    /* renamed from: e */
    private Drawable f4644e;

    /* renamed from: f */
    private ColorStateList f4645f;

    /* renamed from: g */
    private PorterDuff.Mode f4646g;

    /* renamed from: h */
    private boolean f4647h;

    /* renamed from: i */
    private boolean f4648i;

    public C1179j(SeekBar seekBar) {
        super(seekBar);
        this.f4645f = null;
        this.f4646g = null;
        this.f4647h = false;
        this.f4648i = false;
        this.f4643d = seekBar;
    }

    /* renamed from: f */
    private void m5571f() {
        Drawable drawable = this.f4644e;
        if (drawable != null) {
            if (this.f4647h || this.f4648i) {
                Drawable m7200r = AbstractC1414a.m7200r(drawable.mutate());
                this.f4644e = m7200r;
                if (this.f4647h) {
                    AbstractC1414a.m7197o(m7200r, this.f4645f);
                }
                if (this.f4648i) {
                    AbstractC1414a.m7198p(this.f4644e, this.f4646g);
                }
                if (this.f4644e.isStateful()) {
                    this.f4644e.setState(this.f4643d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1176i
    /* renamed from: c */
    public void mo5568c(AttributeSet attributeSet, int i11) {
        super.mo5568c(attributeSet, i11);
        C1211t1 m5716v = C1211t1.m5716v(this.f4643d.getContext(), attributeSet, AbstractC19187j.AppCompatSeekBar, i11, 0);
        SeekBar seekBar = this.f4643d;
        AbstractC1579n0.m7912y0(seekBar, seekBar.getContext(), AbstractC19187j.AppCompatSeekBar, attributeSet, m5716v.m5734r(), i11, 0);
        Drawable m5724h = m5716v.m5724h(AbstractC19187j.AppCompatSeekBar_android_thumb);
        if (m5724h != null) {
            this.f4643d.setThumb(m5724h);
        }
        m5575j(m5716v.m5723g(AbstractC19187j.AppCompatSeekBar_tickMark));
        if (m5716v.m5735s(AbstractC19187j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f4646g = AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC19187j.AppCompatSeekBar_tickMarkTintMode, -1), this.f4646g);
            this.f4648i = true;
        }
        if (m5716v.m5735s(AbstractC19187j.AppCompatSeekBar_tickMarkTint)) {
            this.f4645f = m5716v.m5719c(AbstractC19187j.AppCompatSeekBar_tickMarkTint);
            this.f4647h = true;
        }
        m5716v.m5736w();
        m5571f();
    }

    /* renamed from: g */
    public void m5572g(Canvas canvas) {
        int i11;
        if (this.f4644e != null) {
            int max = this.f4643d.getMax();
            int i12 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f4644e.getIntrinsicWidth();
                int intrinsicHeight = this.f4644e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i11 = intrinsicWidth / 2;
                } else {
                    i11 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i12 = intrinsicHeight / 2;
                }
                this.f4644e.setBounds(-i11, -i12, i11, i12);
                float width = ((this.f4643d.getWidth() - this.f4643d.getPaddingLeft()) - this.f4643d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f4643d.getPaddingLeft(), this.f4643d.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f4644e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m5573h() {
        Drawable drawable = this.f4644e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f4643d.getDrawableState())) {
            this.f4643d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m5574i() {
        Drawable drawable = this.f4644e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m5575j(Drawable drawable) {
        Drawable drawable2 = this.f4644e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4644e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f4643d);
            AbstractC1414a.m7195m(drawable, AbstractC1579n0.m7812G(this.f4643d));
            if (drawable.isStateful()) {
                drawable.setState(this.f4643d.getDrawableState());
            }
            m5571f();
        }
        this.f4643d.invalidate();
    }
}
