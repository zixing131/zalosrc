package com.zing.zalo.zdesign.component.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.slider.InterfaceC6398a;
import com.google.android.material.slider.RangeSlider;
import com.zing.zalo.zdesign.component.slider.CustomRangeSlider;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import ni0.C23797b;
import p357n6.AbstractC23577b;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class CustomRangeSlider extends RangeSlider {

    /* renamed from: t0 */
    private boolean f87216t0;

    /* renamed from: u0 */
    private C23797b f87217u0;

    /* renamed from: v0 */
    private boolean f87218v0;

    /* renamed from: w0 */
    private final boolean f87219w0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomRangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.sliderStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m91228x0(CustomRangeSlider customRangeSlider, RangeSlider rangeSlider, float f11, boolean z11) {
        AbstractC19074t.m100208f(customRangeSlider, "this$0");
        AbstractC19074t.m100208f(rangeSlider, "<anonymous parameter 0>");
        customRangeSlider.m91229A0();
    }

    /* renamed from: A0 */
    public final void m91229A0() {
        C23797b c23797b = this.f87217u0;
        if (c23797b != null) {
            c23797b.m124362r(getStepSize());
            c23797b.m124366v(getValueTo());
            c23797b.m124365u(getValueFrom());
            c23797b.m124363s(getTrackHeight());
            List<Float> values = getValues();
            AbstractC19074t.m100206d(values, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Float>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Float> }");
            c23797b.m124367w((ArrayList) values);
            c23797b.m124364t(getTrackSidePadding());
        }
    }

    public final boolean getEnableTrackSidePadding() {
        return this.f87216t0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.slider.RangeSlider, com.google.android.material.slider.BaseSlider, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f87216t0) {
            AbstractC19074t.m100207e(getContext(), "context");
            canvas.translate(-C27276c.m139649b(r0, 8), 0.0f);
        }
        super.onDraw(canvas);
        C23797b c23797b = this.f87217u0;
        if (c23797b != null) {
            c23797b.m124353a(getTrackWidth());
            List<Float> values = getValues();
            AbstractC19074t.m100206d(values, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Float>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Float> }");
            c23797b.m124356d(canvas, (ArrayList) values);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.slider.RangeSlider, com.google.android.material.slider.BaseSlider, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        int i15;
        if (!this.f87216t0) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i15 = C27276c.m139649b(context, 16);
        } else {
            i15 = 0;
        }
        super.onSizeChanged(i11 + i15, i12, i13, i14);
    }

    @Override // com.google.android.material.slider.RangeSlider, com.google.android.material.slider.BaseSlider, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f87219w0) {
            if (motionEvent.getActionMasked() == 0) {
                C23797b c23797b = this.f87217u0;
                if (c23797b != null && !c23797b.m124355c(motionEvent.getX(), getThumbRadius())) {
                    this.f87218v0 = true;
                    return true;
                }
            } else if (motionEvent.getActionMasked() == 2) {
                if (this.f87218v0) {
                    return true;
                }
            } else if (motionEvent.getActionMasked() == 1 && this.f87218v0) {
                this.f87218v0 = false;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCustomTickActiveColor(int i11) {
        C23797b c23797b = this.f87217u0;
        if (c23797b != null) {
            c23797b.m124360p(i11);
        }
    }

    public final void setCustomTickInactiveColor(int i11) {
        C23797b c23797b = this.f87217u0;
        if (c23797b != null) {
            c23797b.m124361q(i11);
        }
    }

    public final void setEnableTrackSidePadding(boolean z11) {
        this.f87216t0 = z11;
    }

    /* renamed from: y0 */
    public final void m91230y0(float f11, float f12, float f13) {
        C23797b c23797b = this.f87217u0;
        if (c23797b != null) {
            c23797b.m124354b(f11, f12, f13);
        }
    }

    /* renamed from: z0 */
    public final void m91231z0() {
        C23797b c23797b = this.f87217u0;
        if (c23797b != null) {
            c23797b.m124358n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRangeSlider(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f87216t0 = true;
        this.f87219w0 = true;
        setTickVisible(false);
        C23797b c23797b = new C23797b(C27276c.m139649b(context, 4), C27276c.m139649b(context, 8), C27276c.m139649b(context, 100));
        c23797b.m124359o(this);
        this.f87217u0 = c23797b;
        m91229A0();
        mo32911h(new InterfaceC6398a() { // from class: ni0.a
            @Override // com.google.android.material.slider.InterfaceC6398a
            /* renamed from: a */
            public final void mo32926a(Object obj, float f11, boolean z11) {
                CustomRangeSlider.m91228x0(CustomRangeSlider.this, (RangeSlider) obj, f11, z11);
            }
        });
    }
}
