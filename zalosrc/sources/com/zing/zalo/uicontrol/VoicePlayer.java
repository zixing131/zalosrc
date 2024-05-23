package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.p077ui.widget.C13716q;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class VoicePlayer extends View {

    /* renamed from: s */
    private static final int f83600s = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: t */
    private static Paint f83601t;

    /* renamed from: p */
    private final C13716q f83602p;

    /* renamed from: q */
    private RectF f83603q;

    /* renamed from: r */
    private final int f83604r;

    public VoicePlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83604r = AbstractC23136l9.m118742r(20.0f);
        Paint paint = new Paint(1);
        f83601t = paint;
        paint.setColor(-2952961);
        f83601t.setStyle(Paint.Style.FILL);
        this.f83602p = new C13716q(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        try {
            RectF rectF = this.f83603q;
            int i11 = this.f83604r;
            canvas.drawRoundRect(rectF, i11, i11, f83601t);
            canvas.save();
            int i12 = f83600s;
            canvas.translate(i12, i12);
            this.f83602p.m76683b(canvas);
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = f83600s;
        setMeasuredDimension(C13716q.f70984l + i13 + i13, C13716q.f70985m + i13 + i13);
    }
}
