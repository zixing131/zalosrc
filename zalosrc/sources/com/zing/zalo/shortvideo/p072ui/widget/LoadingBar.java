package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;
import v00.AbstractC27406a;

/* loaded from: classes5.dex */
public final class LoadingBar extends View {

    /* renamed from: p */
    private final int f54125p;

    /* renamed from: q */
    private float f54126q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final void setProgress(float f11) {
        if (f11 < 0.0f) {
            f11 = 1.0f;
        }
        this.f54126q = f11;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (getVisibility() == 0) {
            float width = (getWidth() * this.f54126q) / 2.0f;
            canvas.save();
            canvas.clipRect(width, 0.0f, getWidth() - width, getHeight());
            canvas.drawColor((((int) (255 * this.f54126q)) << 24) | this.f54125p);
            canvas.restore();
            setProgress(this.f54126q - 0.025f);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 != 0) {
            setProgress(1.0f);
        }
    }

    public /* synthetic */ LoadingBar(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f54125p = AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary) & 16777215;
        this.f54126q = 1.0f;
    }
}
