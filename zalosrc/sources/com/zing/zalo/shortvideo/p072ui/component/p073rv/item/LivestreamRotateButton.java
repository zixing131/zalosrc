package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class LivestreamRotateButton extends FrameLayout {

    /* renamed from: p */
    private final DecelerateInterpolator f50823p;

    /* renamed from: q */
    private long f50824q;

    /* renamed from: r */
    private long f50825r;

    /* renamed from: s */
    private boolean f50826s;

    /* renamed from: t */
    private final InterfaceC24854k f50827t;

    /* renamed from: u */
    private final InterfaceC24854k f50828u;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamRotateButton$a */
    /* loaded from: classes5.dex */
    static final class C9632a extends AbstractC19075u implements InterfaceC18494a {
        C9632a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return LivestreamRotateButton.this.findViewById(AbstractC27409d.icoRotate);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamRotateButton$b */
    /* loaded from: classes5.dex */
    static final class C9633b extends AbstractC19075u implements InterfaceC18494a {
        C9633b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return LivestreamRotateButton.this.findViewById(AbstractC27409d.txtRotate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamRotateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f50823p = new DecelerateInterpolator();
        this.f50825r = 300L;
        this.f50826s = true;
        m129210a = AbstractC24856m.m129210a(new C9632a());
        this.f50827t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9633b());
        this.f50828u = m129210a2;
    }

    /* renamed from: c */
    public static /* synthetic */ void m52301c(LivestreamRotateButton livestreamRotateButton, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        livestreamRotateButton.m52304b(z11);
    }

    /* renamed from: e */
    public static /* synthetic */ void m52302e(LivestreamRotateButton livestreamRotateButton, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        livestreamRotateButton.m52305d(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m52303f(LivestreamRotateButton livestreamRotateButton) {
        AbstractC19074t.m100208f(livestreamRotateButton, "this$0");
        livestreamRotateButton.requestLayout();
    }

    private final View getIcoRotate() {
        Object value = this.f50827t.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getTxtRotate() {
        Object value = this.f50828u.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* renamed from: b */
    public final void m52304b(boolean z11) {
        long j11;
        if (z11) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f50824q = j11;
        this.f50826s = false;
        requestLayout();
    }

    /* renamed from: d */
    public final void m52305d(boolean z11) {
        long j11;
        if (z11) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f50824q = j11;
        this.f50826s = true;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = (getMeasuredHeight() - getIcoRotate().getMeasuredHeight()) / 2;
        AbstractC26112n.m134383X(getIcoRotate(), measuredHeight, measuredHeight);
        int measuredWidth = getIcoRotate().getMeasuredWidth() + measuredHeight + measuredHeight;
        AbstractC26112n.m134383X(getTxtRotate(), measuredHeight + ((getIcoRotate().getMeasuredHeight() - getTxtRotate().getMeasuredHeight()) / 2), measuredWidth);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float m116587j;
        float f11;
        float f12;
        int size = View.MeasureSpec.getSize(i12);
        AbstractC26112n.m134387a0(getIcoRotate(), 0, 0, 0, 0);
        AbstractC26112n.m134387a0(getTxtRotate(), 0, 0, 0, 0);
        int measuredWidth = getIcoRotate().getMeasuredWidth() + getTxtRotate().getMeasuredWidth() + (((size - getIcoRotate().getMeasuredHeight()) / 2) * 3);
        if (this.f50824q > 0) {
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f50824q)) / ((float) this.f50825r);
            DecelerateInterpolator decelerateInterpolator = this.f50823p;
            m116587j = AbstractC22543l.m116587j(currentTimeMillis, 0.0f, 1.0f);
            float interpolation = decelerateInterpolator.getInterpolation(m116587j);
            if (this.f50826s) {
                f11 = size * (1.0f - interpolation);
                f12 = measuredWidth * interpolation;
            } else {
                f11 = size * interpolation;
                f12 = measuredWidth * (1.0f - interpolation);
            }
            measuredWidth = (int) (f11 + f12);
            if (interpolation < 1.0f) {
                post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        LivestreamRotateButton.m52303f(LivestreamRotateButton.this);
                    }
                });
            } else {
                this.f50824q = 0L;
            }
        } else if (!this.f50826s) {
            measuredWidth = size;
        }
        setMeasuredDimension(measuredWidth, size);
    }
}
