package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13704p1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import ui0.C27276c;

/* renamed from: com.zing.zalo.ui.chat.chatrow.h0 */
/* loaded from: classes5.dex */
public final class C11479h0 {

    /* renamed from: g */
    private static boolean f59139g;

    /* renamed from: h */
    private static float f59140h;

    /* renamed from: i */
    private static float f59141i;

    /* renamed from: j */
    private static float f59142j;

    /* renamed from: k */
    private static Paint f59143k;

    /* renamed from: l */
    private static Paint f59144l;

    /* renamed from: m */
    private static C13704p1 f59145m;

    /* renamed from: o */
    private static float f59147o;

    /* renamed from: p */
    private static float f59148p;

    /* renamed from: r */
    private static float f59150r;

    /* renamed from: s */
    private static float f59151s;

    /* renamed from: t */
    private static float f59152t;

    /* renamed from: u */
    private static float f59153u;

    /* renamed from: v */
    private static float f59154v;

    /* renamed from: a */
    private boolean f59155a;

    /* renamed from: b */
    private boolean f59156b;

    /* renamed from: d */
    private float f59158d;

    /* renamed from: e */
    private float f59159e;
    public static final a Companion = new a(null);

    /* renamed from: n */
    private static String f59146n = "";

    /* renamed from: q */
    private static String f59149q = "";

    /* renamed from: c */
    private String f59157c = "";

    /* renamed from: f */
    private final RectF f59160f = new RectF();

    /* renamed from: com.zing.zalo.ui.chat.chatrow.h0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m61943a(boolean z11) {
            C11479h0.f59139g = z11;
        }
    }

    public C11479h0(Context context) {
        if (f59143k == null || f59139g) {
            context = context == null ? MainApplication.Companion.m35500c() : context;
            f59140h = context.getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            f59141i = context.getResources().getDimensionPixelSize(AbstractC16802y.label_radius);
            f59142j = context.getResources().getDimensionPixelSize(AbstractC16802y.label_padding);
            Paint paint = new Paint(1);
            paint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.label_background_color));
            f59143k = paint;
            Paint paint2 = new Paint(1);
            paint2.setColor(AbstractC23136l9.m118639A(AbstractC16801x.white_60));
            f59144l = paint2;
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setColor(AbstractC23136l9.m118639A(AbstractC16801x.label_text_color));
            c13704p1.m76613c();
            c13704p1.m76614d(context.getResources().getDimension(AbstractC16802y.label_text_size), false);
            f59145m = c13704p1;
            String string = context.getString(AbstractC8020f0.str_label_hd);
            AbstractC19074t.m100207e(string, "getString(...)");
            f59146n = string;
            float f11 = 2;
            f59147o = AbstractC23136l9.m118764y0(f59145m, string) + (f59142j * f11);
            f59148p = AbstractC23136l9.m118761x0(f59145m, f59146n) + (f59142j * f11);
            String string2 = context.getString(AbstractC8020f0.str_label_gif);
            AbstractC19074t.m100207e(string2, "getString(...)");
            f59149q = string2;
            f59150r = AbstractC23136l9.m118764y0(f59145m, string2) + (f59142j * f11);
            f59151s = AbstractC23136l9.m118761x0(f59145m, f59149q) + (f59142j * f11);
            float m139648a = C27276c.m139648a(context, 0.5f);
            f59152t = m139648a;
            float f12 = f59147o;
            f59153u = f12;
            f59154v = f12 + m139648a;
            f59139g = false;
        }
    }

    /* renamed from: c */
    private final void m61931c(Canvas canvas) {
        Paint paint = f59143k;
        if (paint != null) {
            RectF rectF = this.f59160f;
            float f11 = f59141i;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
    }

    /* renamed from: d */
    private final void m61932d(Canvas canvas) {
        Paint paint = f59144l;
        if (paint != null) {
            RectF rectF = this.f59160f;
            float f11 = rectF.left;
            float f12 = f59153u + f11;
            float f13 = rectF.top;
            float f14 = f59142j;
            canvas.drawRect(f12, f13 + f14, f59154v + f11, rectF.bottom - f14, paint);
        }
    }

    /* renamed from: e */
    private final void m61933e(Canvas canvas) {
        if (this.f59155a) {
            m61937i(canvas, this.f59157c);
        } else {
            m61936h(canvas, this.f59157c);
        }
    }

    /* renamed from: f */
    private final void m61934f(Canvas canvas) {
        m61936h(canvas, f59149q);
    }

    /* renamed from: g */
    private final void m61935g(Canvas canvas) {
        m61936h(canvas, f59146n);
    }

    /* renamed from: h */
    private final void m61936h(Canvas canvas, String str) {
        C13704p1 c13704p1 = f59145m;
        if (c13704p1 != null) {
            RectF rectF = this.f59160f;
            float f11 = rectF.left;
            float f12 = f59142j;
            canvas.drawText(str, f11 + f12, rectF.bottom - f12, c13704p1);
        }
    }

    /* renamed from: i */
    private final void m61937i(Canvas canvas, String str) {
        C13704p1 c13704p1 = f59145m;
        if (c13704p1 != null) {
            RectF rectF = this.f59160f;
            float f11 = rectF.left + f59154v;
            float f12 = f59142j;
            canvas.drawText(str, f11 + f12, rectF.bottom - f12, c13704p1);
        }
    }

    /* renamed from: b */
    public final void m61938b(Canvas canvas, int i11, int i12) {
        AbstractC19074t.m100208f(canvas, "canvas");
        RectF rectF = this.f59160f;
        float f11 = f59140h;
        float f12 = i11 + f11;
        rectF.left = f12;
        float f13 = i12 + f11;
        rectF.top = f13;
        if (this.f59156b) {
            rectF.right = f12 + f59150r;
            rectF.bottom = f13 + f59151s;
            m61931c(canvas);
            m61934f(canvas);
            return;
        }
        if (this.f59157c.length() == 0) {
            if (this.f59155a) {
                RectF rectF2 = this.f59160f;
                rectF2.right = rectF2.left + f59147o;
                rectF2.bottom = rectF2.top + f59148p;
                m61931c(canvas);
                m61935g(canvas);
                return;
            }
            return;
        }
        if (this.f59157c.length() > 0) {
            if (this.f59155a) {
                RectF rectF3 = this.f59160f;
                rectF3.right = rectF3.left + f59147o + f59152t + this.f59158d;
                rectF3.bottom = rectF3.top + Math.max(f59148p, this.f59159e);
                m61931c(canvas);
                m61935g(canvas);
                m61932d(canvas);
                m61933e(canvas);
                return;
            }
            RectF rectF4 = this.f59160f;
            rectF4.right = rectF4.left + this.f59158d;
            rectF4.bottom = rectF4.top + this.f59159e;
            m61931c(canvas);
            m61933e(canvas);
        }
    }

    /* renamed from: j */
    public final void m61939j() {
        this.f59155a = false;
        this.f59156b = false;
        this.f59157c = "";
        this.f59158d = 0.0f;
        this.f59159e = 0.0f;
        this.f59160f.setEmpty();
    }

    /* renamed from: k */
    public final void m61940k(long j11) {
        if (j11 < 0) {
            return;
        }
        String m17440h = AbstractC3460h.m17440h(j11);
        AbstractC19074t.m100207e(m17440h, "formatTime(...)");
        this.f59157c = m17440h;
        float f11 = 2;
        this.f59158d = AbstractC23136l9.m118764y0(f59145m, m17440h) + (f59142j * f11);
        this.f59159e = AbstractC23136l9.m118761x0(f59145m, this.f59157c) + (f59142j * f11);
    }

    /* renamed from: l */
    public final void m61941l(boolean z11) {
        this.f59156b = z11;
    }

    /* renamed from: m */
    public final void m61942m(boolean z11) {
        this.f59155a = z11;
    }
}
