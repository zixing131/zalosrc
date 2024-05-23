package xb0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.p077ui.widget.C13704p1;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p148f3.C18711c;
import pm0.C24848g0;
import ti0.C26703b;
import ti0.C26705d;

/* renamed from: xb0.b */
/* loaded from: classes6.dex */
public final class C29573b implements LeadingMarginSpan {

    /* renamed from: a */
    private final int f136486a;

    /* renamed from: b */
    private final int f136487b;

    /* renamed from: c */
    private final int f136488c;

    /* renamed from: d */
    private final int f136489d;

    /* renamed from: e */
    private final int f136490e;

    /* renamed from: f */
    private final Integer f136491f;

    /* renamed from: g */
    private final Integer f136492g;

    /* renamed from: h */
    private final C13704p1 f136493h = new C13704p1(1);

    /* renamed from: i */
    private final Paint f136494i;

    public C29573b(int i11, int i12, int i13, int i14, int i15, Integer num, Integer num2) {
        this.f136486a = i11;
        this.f136487b = i12;
        this.f136488c = i13;
        this.f136489d = i14;
        this.f136490e = i15;
        this.f136491f = num;
        this.f136492g = num2;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f136494i = paint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:            if (r3 == null) goto L35;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m146958a(Paint paint, int i11, int i12, int i13, int i14, int i15, Canvas canvas) {
        int color;
        this.f136494i.setColor(this.f136490e);
        canvas.drawCircle(i14 + (i15 * r4), (i11 + i12) / 2.0f, this.f136489d, this.f136494i);
        C13704p1 c13704p1 = this.f136493h;
        Integer num = this.f136491f;
        if (num != null) {
            color = num.intValue();
        } else {
            color = paint.getColor();
        }
        c13704p1.setColor(color);
        Integer num2 = this.f136492g;
        if (num2 != null) {
            int intValue = num2.intValue();
            MainApplication.C6895a c6895a = MainApplication.Companion;
            C26703b m137293a = C26705d.m137293a(c6895a.m35500c(), intValue);
            C13694n1 m137282i = m137293a.m137282i();
            if (m137282i != null) {
                this.f136493h.setTypeface(C13699o1.f70798a.m76486a(c6895a.m35500c(), m137282i.m76440b(), Integer.valueOf(m137282i.m76446h())));
            }
            Float m137292s = m137293a.m137292s();
            if (m137292s != null) {
                this.f136493h.setTextSize(m137292s.floatValue());
            } else {
                m137292s = null;
            }
        }
        this.f136493h.setTypeface(paint.getTypeface());
        this.f136493h.setTextSize(paint.getTextSize());
        C24848g0 c24848g0 = C24848g0.f119245a;
        canvas.drawText(String.valueOf(this.f136486a), this.f136489d - (AbstractC23136l9.m118764y0(this.f136493h, String.valueOf(this.f136486a)) / 2), this.f136489d + (AbstractC23136l9.m118761x0(this.f136493h, String.valueOf(this.f136486a)) / 2), this.f136493h);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        AbstractC19074t.m100208f(canvas, C18711c.f94014e);
        AbstractC19074t.m100208f(paint, "p");
        AbstractC19074t.m100208f(charSequence, "text");
        if (((Spanned) charSequence).getSpanStart(this) == i16) {
            m146958a(paint, i13, i15, i14, i11, i12, canvas);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f136488c + (this.f136489d * 2) + this.f136487b;
    }
}
