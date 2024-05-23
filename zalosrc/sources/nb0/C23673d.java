package nb0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import me0.AbstractC23136l9;

/* renamed from: nb0.d */
/* loaded from: classes6.dex */
public class C23673d implements LeadingMarginSpan {

    /* renamed from: a */
    private int f114681a;

    /* renamed from: b */
    private int f114682b;

    /* renamed from: c */
    private int f114683c;

    public C23673d() {
        this(AbstractC23136l9.m118742r(18.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(3.0f));
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        if (z11 && ((Spanned) charSequence).getSpanStart(this) == i16) {
            float f11 = (i13 + i15) / 2.0f;
            float f12 = i11 + this.f114682b + this.f114681a;
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f12, f11, this.f114681a, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f114682b + (this.f114681a * 2) + this.f114683c;
    }

    public C23673d(int i11, int i12, int i13) {
        this.f114682b = i11;
        this.f114683c = i12;
        this.f114681a = i13;
    }
}
