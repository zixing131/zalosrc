package com.zing.zalo.p077ui.widget.textview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23222t7;

/* loaded from: classes6.dex */
public class RoundedRobotoTextView extends RobotoTextView {

    /* renamed from: D */
    public static int f71432D = AbstractC23222t7.f112562h;

    /* renamed from: A */
    Paint f71433A;

    /* renamed from: B */
    RectF f71434B;

    /* renamed from: C */
    int f71435C;

    public RoundedRobotoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71434B = new RectF();
        this.f71435C = f71432D;
        m77061i();
    }

    /* renamed from: i */
    void m77061i() {
        this.f71433A = new Paint(1);
        setLayerType(1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.RobotoTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f71434B;
        int i11 = AbstractC23222t7.f112550b;
        rectF.set(i11, i11, getWidth() - AbstractC23222t7.f112550b, getHeight() - AbstractC23222t7.f112550b);
        RectF rectF2 = this.f71434B;
        int i12 = this.f71435C;
        canvas.drawRoundRect(rectF2, i12, i12, this.f71433A);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f71433A.setColor(i11);
        invalidate();
    }

    public void setRadius(int i11) {
        this.f71435C = i11;
    }
}
