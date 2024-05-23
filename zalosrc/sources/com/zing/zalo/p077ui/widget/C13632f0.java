package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.zing.zalo.ui.widget.f0 */
/* loaded from: classes6.dex */
public class C13632f0 extends ImageSpan {
    public C13632f0(C13637g0 c13637g0, int i11) {
        super(c13637g0, i11);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        int i16 = paint.getFontMetricsInt().descent;
        canvas.translate(f11, ((i14 + i16) - ((i16 - r3.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i13 = fontMetricsInt2.descent;
            int i14 = fontMetricsInt2.ascent;
            int i15 = i14 + ((i13 - i14) / 2);
            int i16 = (bounds.bottom - bounds.top) / 2;
            int i17 = i15 - i16;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.top = i17;
            int i18 = i15 + i16;
            fontMetricsInt.bottom = i18;
            fontMetricsInt.descent = i18;
        }
        return bounds.right;
    }
}
