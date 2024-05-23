package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import me0.AbstractC23136l9;
import p588vw.C28652r;
import p716zh.C31972j4;

/* renamed from: com.zing.zalo.ui.widget.g0 */
/* loaded from: classes6.dex */
public class C13637g0 extends Drawable {

    /* renamed from: c */
    private static final Paint f70330c;

    /* renamed from: a */
    private int f70331a = 0;

    /* renamed from: b */
    private final Rect f70332b;

    static {
        Paint paint = new Paint();
        f70330c = paint;
        paint.setFilterBitmap(true);
    }

    public C13637g0(C31972j4 c31972j4, int i11) {
        this.f70332b = new Rect(c31972j4.m153698a() * 77, c31972j4.m153699b() * 77, (c31972j4.m153698a() * 77) + 72, (c31972j4.m153699b() * 77) + 72);
        m76238a(i11);
    }

    /* renamed from: a */
    public void m76238a(int i11) {
        int m118742r = AbstractC23136l9.m118742r(i11);
        this.f70331a = m118742r;
        setBounds(0, 0, m118742r, m118742r);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C28652r.m143348p() != null) {
            Rect copyBounds = copyBounds();
            int centerX = copyBounds.centerX();
            int centerY = copyBounds.centerY();
            int i11 = this.f70331a;
            copyBounds.left = centerX - (i11 / 2);
            copyBounds.right = centerX + (i11 / 2);
            copyBounds.top = centerY - (i11 / 2);
            copyBounds.bottom = centerY + (i11 / 2);
            canvas.drawBitmap(C28652r.m143348p(), this.f70332b, copyBounds, f70330c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
