package nb0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import me0.AbstractC23136l9;

/* renamed from: nb0.e */
/* loaded from: classes6.dex */
public class C23674e implements LeadingMarginSpan {

    /* renamed from: d */
    private static int f114684d;

    /* renamed from: e */
    private static int f114685e;

    /* renamed from: a */
    private int f114686a;

    /* renamed from: b */
    private String f114687b;

    /* renamed from: c */
    private float f114688c;

    public C23674e(int i11) {
        this.f114686a = i11;
        m124007a();
        this.f114687b = this.f114686a + ".";
    }

    /* renamed from: a */
    private void m124007a() {
        if (f114684d == 0) {
            f114684d = AbstractC23136l9.m118742r(30.0f);
            f114685e = AbstractC23136l9.m118742r(6.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        if (z11 && ((Spanned) charSequence).getSpanStart(this) == i16) {
            if (this.f114688c == 0.0f) {
                this.f114688c = paint.measureText(String.valueOf(this.f114686a));
            }
            canvas.drawText(this.f114687b, (f114684d - f114685e) - this.f114688c, i14, paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return f114684d;
    }
}
