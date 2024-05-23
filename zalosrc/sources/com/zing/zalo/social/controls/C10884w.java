package com.zing.zalo.social.controls;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.social.controls.w */
/* loaded from: classes5.dex */
public class C10884w extends ReplacementSpan {

    /* renamed from: r */
    static final int f54991r = AbstractC23136l9.m118762x1(16.0f);

    /* renamed from: s */
    static final int f54992s = AbstractC23136l9.m118762x1(4.0f);

    /* renamed from: p */
    Bitmap f54993p;

    /* renamed from: q */
    int f54994q;

    public C10884w(Bitmap bitmap, int i11) {
        this.f54993p = bitmap;
        this.f54994q = i11;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        int width = this.f54994q - this.f54993p.getWidth();
        canvas.drawBitmap(this.f54993p, width, (i14 - r9.getHeight()) + f54992s, paint);
        paint.setColor(-3355444);
        canvas.drawRect(f11, i14 - 2, width - f54991r, i14, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        return 0;
    }
}
