package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.lang.ref.WeakReference;
import mi0.C23313a;
import mi0.C23314b;
import ri0.C25808b;

/* loaded from: classes7.dex */
public final class ProgressBar extends android.widget.ProgressBar implements InterfaceC16976f1 {

    /* renamed from: p */
    private C25808b f86346p;

    /* renamed from: q */
    private C17024o0 f86347q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBar(Context context) {
        this(context, (AttributeSet) null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final void m90607c() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        this.f86347q = new C17024o0(context, new C17024o0.a() { // from class: com.zing.zalo.zdesign.component.i0
            @Override // com.zing.zalo.zdesign.component.C17024o0.a
            /* renamed from: a */
            public final void mo61929a() {
                ProgressBar.m90608d(ProgressBar.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m90608d(ProgressBar progressBar) {
        AbstractC19074t.m100208f(progressBar, "this$0");
        if (AbstractC19444a.m101693a()) {
            progressBar.invalidate();
        } else {
            progressBar.postInvalidate();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m90609f(ProgressBar progressBar, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        progressBar.m90611e(f11, z11);
    }

    /* renamed from: b */
    public final void m90610b(C23313a c23313a) {
        AbstractC19074t.m100208f(c23313a, "progressBarStyle");
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91152e(c23313a);
        }
    }

    /* renamed from: e */
    public final void m90611e(float f11, boolean z11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91139C(f11, z11);
        }
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            return c17024o0.m91154r();
        }
        return 0;
    }

    @Override // android.widget.ProgressBar
    public boolean isIndeterminate() {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            return c17024o0.m91158w();
        }
        return true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91159x();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91153i(canvas);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            AbstractC19074t.m100205c(c17024o0);
            if (c17024o0.m91156t() == EnumC17026p0.CIRCLE.m91165c()) {
                C17024o0 c17024o02 = this.f86347q;
                AbstractC19074t.m100205c(c17024o02);
                int m91155s = c17024o02.m91155s();
                C17024o0 c17024o03 = this.f86347q;
                AbstractC19074t.m100205c(c17024o03);
                setMeasuredDimension(m91155s, c17024o03.m91155s());
                return;
            }
            int measuredWidth = getMeasuredWidth();
            C17024o0 c17024o04 = this.f86347q;
            AbstractC19074t.m100205c(c17024o04);
            setMeasuredDimension(measuredWidth, c17024o04.m91155s());
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91149M(i11, i12);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86346p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminate(boolean z11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91137A(z11);
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91140D(i11, false);
        }
    }

    public final void setProgressBackgroundColor(int i11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91141E(i11);
        }
    }

    public final void setProgressIconColor(int i11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91143G(i11);
        }
    }

    public final void setProgressIndicatorColor(int i11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91144H(i11);
        }
    }

    public final void setProgressTextColor(int i11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91145I(i11);
        }
    }

    public final void setTimeCountDown(long j11) {
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91150N(j11);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86346p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        C17024o0 c17024o0;
        boolean z11;
        super.setVisibility(i11);
        C17024o0 c17024o02 = this.f86347q;
        if (c17024o02 != null) {
            if (i11 != 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            c17024o02.m91147K(z11);
        }
        if (i11 != 0 && (c17024o0 = this.f86347q) != null) {
            c17024o0.m91159x();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.progressBarDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86346p = new C25808b(new WeakReference(this));
        m90607c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.ProgressBar, i11, 0);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…ProgressBar, defStyle, 0)");
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91146J(obtainStyledAttributes.getInt(AbstractC2815i.ProgressBar_progressType, EnumC17026p0.CIRCLE.m91165c()));
            c17024o0.m91160y(obtainStyledAttributes.getBoolean(AbstractC2815i.ProgressBar_isCountDown, false));
            c17024o0.m91148L(obtainStyledAttributes.getBoolean(AbstractC2815i.ProgressBar_isShowIconCancel, false));
            c17024o0.m91137A(obtainStyledAttributes.getBoolean(AbstractC2815i.ProgressBar_android_indeterminate, false));
            c17024o0.m91142F(obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.ProgressBar_progressBarFixHeight, AbstractC2809c.progress_horizontal_height));
            int i12 = AbstractC2815i.ProgressBar_progressIndicatorColor;
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            c17024o0.m91144H(obtainStyledAttributes.getColor(i12, aVar.m13592a(context, AbstractC2807a.progress_indicator_blue)));
            c17024o0.m91141E(obtainStyledAttributes.getColor(AbstractC2815i.ProgressBar_progressBackgroundColor, aVar.m13592a(context, AbstractC2807a.progress_track_background_black)));
            c17024o0.m91145I(obtainStyledAttributes.getColor(AbstractC2815i.ProgressBar_progressTextColor, aVar.m13592a(context, AbstractC2807a.text_01)));
            c17024o0.m91143G(obtainStyledAttributes.getColor(AbstractC2815i.ProgressBar_progressIconColor, aVar.m13592a(context, AbstractC2807a.icon_02)));
        }
        String string = obtainStyledAttributes.getString(AbstractC2815i.ProgressBar_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
        C17024o0 c17024o02 = this.f86347q;
        if (c17024o02 != null) {
            c17024o02.m91157v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBar(Context context, int i11) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m90607c();
        C17024o0 c17024o0 = this.f86347q;
        if (c17024o0 != null) {
            c17024o0.m91152e(C23314b.m122698a(context, i11));
        }
    }
}
