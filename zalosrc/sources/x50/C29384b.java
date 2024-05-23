package x50;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.StaticLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.widget.C13704p1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;

/* renamed from: x50.b */
/* loaded from: classes5.dex */
public final class C29384b {
    public static final a Companion = new a(null);

    /* renamed from: k */
    public static final int f135890k = AbstractC23136l9.m118742r(64.0f);

    /* renamed from: l */
    private static final int f135891l = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: m */
    private static final int f135892m = AbstractC23136l9.m118742r(24.0f);

    /* renamed from: n */
    private static final int f135893n = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: o */
    private static final int f135894o = AbstractC23136l9.m118639A(AbstractC16801x.Light_TextColor1);

    /* renamed from: p */
    private static final int f135895p = C23212s8.m119606n(AbstractC16781w.TextColor3);

    /* renamed from: a */
    private final StaticLayout f135896a;

    /* renamed from: b */
    private final Paint f135897b;

    /* renamed from: c */
    private final C13704p1 f135898c;

    /* renamed from: d */
    private final int f135899d;

    /* renamed from: e */
    private final int f135900e;

    /* renamed from: f */
    private float f135901f;

    /* renamed from: g */
    private float f135902g;

    /* renamed from: h */
    private float f135903h;

    /* renamed from: i */
    private final int f135904i;

    /* renamed from: j */
    private final int f135905j;

    /* renamed from: x50.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m146537a() {
            return C29384b.f135894o;
        }

        /* renamed from: b */
        public final int m146538b() {
            return C29384b.f135895p;
        }
    }

    public C29384b(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "displayText");
        Paint paint = new Paint(1);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f135897b = paint;
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.setTextSize(AbstractC23136l9.m118742r(12.0f));
        c13704p1.setTypeface(Typeface.DEFAULT);
        this.f135898c = c13704p1;
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        StaticLayout m119625l = AbstractC23214t.m119625l(upperCase, c13704p1, (int) c13704p1.measureText(upperCase), 1);
        AbstractC19074t.m100207e(m119625l, "generateStaticLayout(...)");
        this.f135896a = m119625l;
        int m118766z = AbstractC23136l9.m118766z(context);
        int width = (m118766z / 2) - (m119625l.getWidth() / 2);
        this.f135899d = width;
        this.f135900e = width + m119625l.getWidth();
        int i11 = f135892m;
        this.f135901f = i11;
        this.f135902g = 0.0f;
        this.f135903h = m118766z;
        this.f135904i = m119625l.getHeight() / 2;
        this.f135905j = m119625l.getHeight() + (i11 * 2);
        m146533j(C23212s8.m119606n(AbstractC16781w.TextColor3));
    }

    /* renamed from: d */
    private final void m146526d(Canvas canvas) {
        float f11 = this.f135902g;
        int i11 = this.f135904i;
        float f12 = this.f135901f;
        float f13 = this.f135899d;
        int i12 = f135893n;
        canvas.drawLine(f11, i11 + f12, f13 - i12, i11 + f12, this.f135897b);
        int i13 = this.f135904i;
        float f14 = this.f135901f;
        canvas.drawLine(this.f135900e + i12, i13 + f14, this.f135903h, i13 + f14, this.f135897b);
    }

    /* renamed from: e */
    private final void m146527e(Canvas canvas) {
        canvas.translate(this.f135899d, this.f135901f);
        this.f135896a.draw(canvas);
    }

    /* renamed from: f */
    public static final int m146528f() {
        return Companion.m146537a();
    }

    /* renamed from: g */
    public static final int m146529g() {
        return Companion.m146538b();
    }

    /* renamed from: c */
    public final void m146530c(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.save();
        m146527e(canvas);
        canvas.restore();
        m146526d(canvas);
    }

    /* renamed from: h */
    public final int m146531h() {
        return this.f135905j;
    }

    /* renamed from: i */
    public final void m146532i(int i11, int i12, int i13, int i14, int i15) {
        m146536m(i15);
        int i16 = f135891l;
        m146534k(i11 + i16);
        m146535l(i13 - i16);
    }

    /* renamed from: j */
    public final void m146533j(int i11) {
        this.f135898c.setColor(i11);
        this.f135897b.setColor(i11);
    }

    /* renamed from: k */
    public final void m146534k(int i11) {
        this.f135902g = i11;
    }

    /* renamed from: l */
    public final void m146535l(int i11) {
        this.f135903h = i11;
    }

    /* renamed from: m */
    public final void m146536m(int i11) {
        this.f135901f = i11 + f135892m;
    }
}
