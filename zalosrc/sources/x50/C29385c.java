package x50;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.C13704p1;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: x50.c */
/* loaded from: classes5.dex */
public final class C29385c {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final int f135906g = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: h */
    private static final int f135907h = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: i */
    private static final int f135908i = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: j */
    private static final int f135909j;

    /* renamed from: k */
    private static final C13704p1 f135910k;

    /* renamed from: l */
    private static final int f135911l;

    /* renamed from: m */
    private static final Paint f135912m;

    /* renamed from: a */
    private String f135913a;

    /* renamed from: b */
    private final InterfaceC24854k f135914b;

    /* renamed from: c */
    private float f135915c;

    /* renamed from: d */
    private float f135916d;

    /* renamed from: e */
    private int f135917e;

    /* renamed from: f */
    private int f135918f;

    /* renamed from: x50.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: x50.c$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f135919q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RectF mo12V4() {
            return new RectF();
        }
    }

    static {
        int m118759w1 = AbstractC23136l9.m118759w1(11);
        f135909j = m118759w1;
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.setTypeface(Typeface.DEFAULT);
        c13704p1.setTextSize(m118759w1);
        c13704p1.setColor(C23212s8.m119606n(AbstractC16781w.ChatStateTextColor));
        f135910k = c13704p1;
        f135911l = AbstractC23136l9.m118761x0(c13704p1, "0");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(C23212s8.m119606n(AbstractC16781w.ChatStateBackgroundColor1));
        f135912m = paint;
    }

    public C29385c(String str) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "dateTimeText");
        this.f135913a = str;
        m129210a = AbstractC24856m.m129210a(b.f135919q);
        this.f135914b = m129210a;
        this.f135915c = -1.0f;
        this.f135916d = -1.0f;
        this.f135918f = f135911l + f135908i + f135906g + f135907h;
    }

    /* renamed from: b */
    private final void m146539b(Canvas canvas) {
        float f11 = 2;
        canvas.drawRoundRect(m146541d(), m146541d().height() / f11, m146541d().height() / f11, f135912m);
    }

    /* renamed from: c */
    private final void m146540c(Canvas canvas) {
        canvas.drawText(this.f135913a, this.f135915c, this.f135916d, f135910k);
    }

    /* renamed from: d */
    private final RectF m146541d() {
        return (RectF) this.f135914b.getValue();
    }

    /* renamed from: a */
    public final void m146542a(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        m146539b(canvas);
        m146540c(canvas);
    }

    /* renamed from: e */
    public final int m146543e() {
        return this.f135918f;
    }

    /* renamed from: f */
    public final String m146544f() {
        return this.f135913a;
    }

    /* renamed from: g */
    public final void m146545g(int i11, int i12, int i13, int i14, int i15) {
        int i16 = ((i13 + i11) / 2) - (this.f135917e / 2);
        int i17 = f135908i;
        int i18 = i16 - i17;
        if (i15 == 0) {
            i15 += f135906g;
        }
        RectF m146541d = m146541d();
        float f11 = i18;
        float f12 = i15;
        float f13 = i18 + this.f135917e + (i17 * 2);
        int i19 = f135911l;
        m146541d.set(f11, f12, f13, i15 + i19 + i17);
        this.f135915c = f11 + i17;
        this.f135916d = f12 + i19 + (i17 / 2);
    }

    /* renamed from: h */
    public final void m146546h(int i11) {
        int i12;
        int i13;
        this.f135917e = AbstractC23136l9.m118764y0(f135910k, this.f135913a);
        if (i11 == 0) {
            i12 = f135911l + f135908i + f135906g;
            i13 = f135907h;
        } else {
            i12 = f135911l + f135908i;
            i13 = f135907h;
        }
        this.f135918f = i12 + i13;
    }

    /* renamed from: i */
    public final void m146547i(String str) {
        AbstractC19074t.m100208f(str, "dateTimeText");
        this.f135913a = str;
    }
}
