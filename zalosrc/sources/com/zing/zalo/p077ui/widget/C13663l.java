package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.l */
/* loaded from: classes6.dex */
public class C13663l extends C13687m {

    /* renamed from: s */
    private static final int f70557s = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: t */
    private static final int f70558t = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: u */
    private static final Path f70559u;

    /* renamed from: v */
    private static final Paint f70560v;

    /* renamed from: w */
    private static final RectF f70561w;

    /* renamed from: r */
    private boolean f70562r;

    static {
        Paint paint = new Paint(1);
        f70560v = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        f70559u = new Path();
        f70561w = new RectF();
    }

    public C13663l(View view) {
        super(view);
    }

    /* renamed from: p */
    private void m76344p(Canvas canvas) {
        float f11;
        canvas.save();
        int i11 = C13687m.f70697p;
        canvas.translate(i11, i11);
        if (this.f70713o == 2) {
            f11 = 3.0f;
        } else {
            f11 = 2.0f;
        }
        int m118742r = AbstractC23136l9.m118742r(f11);
        int i12 = (int) (r2 * 2 * 0.35d);
        int i13 = ((this.f70699a * 2) - i12) / 2;
        int m118742r2 = ((this.f70699a * 2) - (AbstractC23136l9.m118742r(4.0f) + (m118742r * 2))) / 2;
        RectF rectF = f70561w;
        float f12 = i13;
        float f13 = i13 + i12;
        rectF.set(m118742r2, f12, m118742r + m118742r2, f13);
        int i14 = f70558t;
        Paint paint = f70560v;
        canvas.drawRoundRect(rectF, i14, i14, paint);
        rectF.set(r0 + AbstractC23136l9.m118742r(4.0f), f12, m118742r2 + r4 + AbstractC23136l9.m118742r(4.0f), f13);
        canvas.drawRoundRect(rectF, i14, i14, paint);
        canvas.restore();
    }

    /* renamed from: q */
    private void m76345q(Canvas canvas) {
        canvas.save();
        int i11 = C13687m.f70697p;
        canvas.translate(i11, i11);
        Path path = f70559u;
        path.reset();
        int i12 = (int) (this.f70699a * 2 * 0.35d);
        int sqrt = (int) ((i12 * Math.sqrt(3.0d)) / 2.0d);
        int i13 = this.f70699a;
        int i14 = ((i13 * 2) - i12) / 2;
        int m118742r = (((i13 * 2) - sqrt) / 2) + AbstractC23136l9.m118742r(2.0f);
        int i15 = sqrt + m118742r;
        int i16 = (i12 / 2) + i14;
        int i17 = i12 + i14;
        float f11 = m118742r;
        float f12 = i14;
        path.moveTo(f11, f12);
        path.lineTo(i15, i16);
        path.lineTo(f11, i17);
        path.lineTo(f11, f12);
        canvas.drawPath(path, f70560v);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.C13687m
    /* renamed from: c */
    public void mo76239c(Canvas canvas) {
        if (this.f70562r) {
            m76344p(canvas);
        } else {
            m76345q(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.C13687m
    /* renamed from: d */
    public void mo76346d(Canvas canvas) {
        if (this.f70562r) {
            super.mo76346d(canvas);
        }
    }

    /* renamed from: r */
    public int m76347r() {
        return (this.f70699a + C13687m.f70697p) * 2;
    }

    /* renamed from: s */
    public int m76348s() {
        return (this.f70699a + C13687m.f70697p) * 2;
    }

    /* renamed from: t */
    public void m76349t(boolean z11) {
        this.f70562r = z11;
    }
}
