package com.zing.zalo.zdesign.component.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ti0.C26702a;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.avatar.a */
/* loaded from: classes7.dex */
public final class C16945a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private View f86483a;

    /* renamed from: b */
    private Context f86484b;

    /* renamed from: c */
    private int f86485c;

    /* renamed from: d */
    private int f86486d;

    /* renamed from: e */
    private boolean f86487e;

    /* renamed from: f */
    private int f86488f;

    /* renamed from: g */
    private Drawable[] f86489g;

    /* renamed from: h */
    private int f86490h;

    /* renamed from: i */
    private int f86491i;

    /* renamed from: j */
    private int f86492j;

    /* renamed from: k */
    private Paint f86493k;

    /* renamed from: l */
    private String f86494l;

    /* renamed from: m */
    private StaticLayout f86495m;

    /* renamed from: n */
    private C26702a f86496n;

    /* renamed from: o */
    private GradientDrawable f86497o;

    /* renamed from: p */
    private boolean f86498p;

    /* renamed from: com.zing.zalo.zdesign.component.avatar.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C16945a(View view, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(view, "parent");
        this.f86488f = 1;
        this.f86489g = new Drawable[4];
        this.f86483a = view;
        Context context = view.getContext();
        AbstractC19074t.m100207e(context, "parent.context");
        this.f86484b = context;
        this.f86485c = i11;
        this.f86486d = i12;
        this.f86487e = z11;
        C26702a c26702a = new C26702a(this.f86484b, 1);
        this.f86496n = c26702a;
        c26702a.setColor(AbstractC2816j.Companion.m13592a(this.f86484b, AbstractC2807a.text_02));
        this.f86496n.m137272b();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86497o = gradientDrawable;
        gradientDrawable.setShape(1);
        Paint paint = new Paint();
        this.f86493k = paint;
        paint.setAntiAlias(true);
        this.f86493k.setStyle(Paint.Style.STROKE);
        this.f86490h = C27276c.m139649b(this.f86484b, 2);
        m90763e();
        m90767i(i11);
    }

    /* renamed from: b */
    private final void m90759b(Canvas canvas, Drawable drawable, int i11, int i12) {
        if (drawable != null) {
            int i13 = this.f86492j;
            drawable.setBounds(new Rect(i11, i12, i11 + i13, i13 + i12));
            drawable.draw(canvas);
            if (this.f86490h > 0) {
                canvas.save();
                canvas.translate(i11, i12);
                int i14 = this.f86492j;
                canvas.drawCircle(i14 / 2.0f, i14 / 2.0f, (this.f86490h + i14) / 2.0f, this.f86493k);
                canvas.restore();
            }
        }
    }

    /* renamed from: c */
    private final void m90760c(Canvas canvas, int i11, int i12) {
        if (this.f86495m != null) {
            m90759b(canvas, this.f86497o, i11, i12);
            canvas.save();
            int i13 = this.f86492j;
            StaticLayout staticLayout = this.f86495m;
            AbstractC19074t.m100205c(staticLayout);
            int width = i11 + ((i13 - staticLayout.getWidth()) / 2);
            int i14 = this.f86492j;
            AbstractC19074t.m100205c(this.f86495m);
            canvas.translate(width, i12 + ((i14 - r1.getHeight()) / 2));
            StaticLayout staticLayout2 = this.f86495m;
            AbstractC19074t.m100205c(staticLayout2);
            staticLayout2.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void m90761a(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int i11 = this.f86488f;
        if (i11 == 5) {
            m90759b(canvas, this.f86489g[0], 0, (this.f86491i - this.f86492j) / 2);
            if (this.f86498p) {
                int i12 = this.f86491i;
                int i13 = this.f86492j;
                m90760c(canvas, i12 - i13, (i12 - i13) / 2);
                return;
            }
            return;
        }
        if (i11 == 4) {
            m90759b(canvas, this.f86489g[2], 0, this.f86491i - this.f86492j);
            m90759b(canvas, this.f86489g[0], 0, 0);
            m90759b(canvas, this.f86489g[1], this.f86491i - this.f86492j, 0);
            if (this.f86498p) {
                int i14 = this.f86491i;
                int i15 = this.f86492j;
                m90760c(canvas, i14 - i15, i14 - i15);
                return;
            } else {
                Drawable drawable = this.f86489g[3];
                int i16 = this.f86491i;
                int i17 = this.f86492j;
                m90759b(canvas, drawable, i16 - i17, i16 - i17);
                return;
            }
        }
        if (i11 == 3) {
            Drawable drawable2 = this.f86489g[2];
            int i18 = this.f86491i;
            int i19 = this.f86492j;
            m90759b(canvas, drawable2, (i18 - i19) / 2, ((i18 - i19) / 2) + (this.f86490h * 4));
            m90759b(canvas, this.f86489g[0], 0, 0);
            m90759b(canvas, this.f86489g[1], this.f86491i - this.f86492j, 0);
            return;
        }
        if (i11 == 2) {
            m90759b(canvas, this.f86489g[0], 0, (this.f86491i - this.f86492j) / 2);
            Drawable drawable3 = this.f86489g[1];
            int i21 = this.f86492j;
            m90759b(canvas, drawable3, i21, (this.f86491i - i21) / 2);
            return;
        }
        Drawable drawable4 = this.f86489g[0];
        if (drawable4 != null) {
            AbstractC19074t.m100205c(drawable4);
            int i22 = this.f86491i;
            drawable4.setBounds(0, 0, i22, i22);
            Drawable drawable5 = this.f86489g[0];
            AbstractC19074t.m100205c(drawable5);
            drawable5.draw(canvas);
        }
    }

    /* renamed from: d */
    public final int m90762d() {
        return this.f86491i;
    }

    /* renamed from: e */
    public final void m90763e() {
        GradientDrawable gradientDrawable = this.f86497o;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        gradientDrawable.setColor(aVar.m13592a(this.f86484b, AbstractC2807a.avatar_counter_background));
        this.f86493k.setColor(aVar.m13592a(this.f86484b, AbstractC2807a.avatar_border));
    }

    /* renamed from: f */
    public final void m90764f(int i11) {
        if (i11 >= 0) {
            this.f86490h = i11;
        }
        this.f86493k.setStrokeWidth(this.f86490h);
    }

    /* renamed from: g */
    public final void m90765g(boolean z11) {
        this.f86487e = z11;
    }

    /* renamed from: h */
    public final void m90766h(int i11, String str, Drawable[] drawableArr) {
        AbstractC19074t.m100208f(drawableArr, "bitmap");
        this.f86494l = str;
        this.f86489g = drawableArr;
        this.f86488f = i11;
        if (str != null) {
            this.f86498p = true;
            this.f86495m = new StaticLayout(str, this.f86496n, this.f86491i / 2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.f86498p = false;
        }
        this.f86483a.invalidate();
    }

    /* renamed from: i */
    public final void m90767i(int i11) {
        this.f86491i = i11;
        this.f86492j = C27276c.m139648a(this.f86484b, 24.0f);
        this.f86493k.setStrokeWidth(this.f86490h);
        RobotoTextView robotoTextView = new RobotoTextView(this.f86484b);
        AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.avatar_text_xsmall);
        this.f86496n.m137273c(robotoTextView.getTextSize(), false);
        if (this.f86494l != null) {
            this.f86495m = new StaticLayout(this.f86494l, this.f86496n, this.f86491i / 2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        this.f86483a.invalidate();
    }
}
