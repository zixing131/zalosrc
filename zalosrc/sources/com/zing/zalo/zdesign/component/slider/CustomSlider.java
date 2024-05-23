package com.zing.zalo.zdesign.component.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.material.slider.Slider;
import fn0.AbstractC19074t;
import ni0.C23797b;
import p357n6.AbstractC23577b;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class CustomSlider extends Slider {

    /* renamed from: r0 */
    private boolean f87220r0;

    /* renamed from: s0 */
    private C23797b f87221s0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.sliderStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    public final boolean getEnableTrackSidePadding() {
        return this.f87220r0;
    }

    public final C23797b getHelper() {
        return this.f87221s0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.slider.Slider, com.google.android.material.slider.BaseSlider, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f87220r0) {
            AbstractC19074t.m100207e(getContext(), "context");
            canvas.translate(-C27276c.m139649b(r0, 8), 0.0f);
        }
        super.onDraw(canvas);
        C23797b c23797b = this.f87221s0;
        if (c23797b != null) {
            c23797b.m124357j().set(0, Float.valueOf(getValue()));
            c23797b.m124353a(getTrackWidth());
            c23797b.m124356d(canvas, c23797b.m124357j());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.slider.Slider, com.google.android.material.slider.BaseSlider, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        int i15;
        if (!this.f87220r0) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i15 = C27276c.m139649b(context, 16);
        } else {
            i15 = 0;
        }
        super.onSizeChanged(i11 + i15, i12, i13, i14);
    }

    public final void setCustomTickActiveColor(int i11) {
        C23797b c23797b = this.f87221s0;
        if (c23797b != null) {
            c23797b.m124360p(i11);
        }
    }

    public final void setCustomTickInactiveColor(int i11) {
        C23797b c23797b = this.f87221s0;
        if (c23797b != null) {
            c23797b.m124361q(i11);
        }
    }

    public final void setEnableTrackSidePadding(boolean z11) {
        this.f87220r0 = z11;
    }

    /* renamed from: v0 */
    public final void m91232v0(float f11, float f12, float f13) {
        C23797b c23797b = this.f87221s0;
        if (c23797b != null) {
            c23797b.m124354b(f11, f12, f13);
        }
    }

    /* renamed from: w0 */
    public final void m91233w0() {
        C23797b c23797b = this.f87221s0;
        if (c23797b != null) {
            c23797b.m124358n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSlider(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f87220r0 = true;
        setTickVisible(false);
        C23797b c23797b = new C23797b(C27276c.m139649b(context, 4), C27276c.m139649b(context, 8), C27276c.m139649b(context, 100));
        c23797b.m124362r(getStepSize());
        c23797b.m124366v(getValueTo());
        c23797b.m124365u(getValueFrom());
        c23797b.m124363s(getTrackHeight());
        c23797b.m124357j().add(Float.valueOf(getValue()));
        c23797b.m124364t(getTrackSidePadding());
        c23797b.m124359o(this);
        this.f87221s0 = c23797b;
    }
}
