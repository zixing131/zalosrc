package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import th.AbstractC26683d;

/* renamed from: com.zing.zalo.ui.widget.p0 */
/* loaded from: classes6.dex */
public class C13703p0 {

    /* renamed from: r */
    public static final int f70894r = AbstractC23136l9.m118742r(28.0f);

    /* renamed from: s */
    public static final int f70895s = AbstractC23136l9.m118742r(28.0f);

    /* renamed from: a */
    View f70896a;

    /* renamed from: b */
    Drawable[] f70897b;

    /* renamed from: c */
    StaticLayout f70898c;

    /* renamed from: d */
    C13704p1 f70899d;

    /* renamed from: e */
    GradientDrawable f70900e;

    /* renamed from: f */
    boolean f70901f;

    /* renamed from: g */
    int f70902g;

    /* renamed from: h */
    int f70903h;

    /* renamed from: i */
    int f70904i;

    /* renamed from: j */
    int f70905j;

    /* renamed from: k */
    int f70906k;

    /* renamed from: l */
    Context f70907l;

    /* renamed from: m */
    Paint f70908m;

    /* renamed from: n */
    int f70909n;

    /* renamed from: o */
    public boolean f70910o;

    /* renamed from: p */
    private final boolean f70911p;

    /* renamed from: q */
    private String f70912q;

    public C13703p0(View view) {
        this(view, f70894r, f70895s, false, false);
    }

    /* renamed from: b */
    private void m76601b(Canvas canvas, Drawable drawable, int i11, int i12) {
        if (drawable != null) {
            int i13 = this.f70906k;
            Rect rect = new Rect(i11, i12, i11 + i13, i13 + i12);
            int i14 = this.f70903h;
            if (i14 > 0) {
                rect.inset(i14 - 1, i14 - 1);
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            if (this.f70903h > 0) {
                canvas.save();
                canvas.translate(i11, i12);
                int i15 = this.f70906k;
                canvas.drawCircle(i15 / 2.0f, i15 / 2.0f, (i15 - this.f70903h) / 2.0f, this.f70908m);
                canvas.restore();
            }
        }
    }

    /* renamed from: c */
    private void m76602c(Canvas canvas, int i11, int i12) {
        m76601b(canvas, this.f70900e, i11, i12);
        canvas.save();
        canvas.translate(i11 + ((this.f70906k - this.f70898c.getWidth()) / 2), i12 + ((this.f70906k - this.f70898c.getHeight()) / 2));
        this.f70898c.draw(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    public void m76603a(Canvas canvas) {
        int i11 = this.f70902g;
        if (i11 == 5) {
            canvas.save();
            int i12 = this.f70909n;
            canvas.translate(i12, i12);
            if (this.f70901f) {
                int i13 = this.f70905j;
                int i14 = this.f70906k;
                m76602c(canvas, i13 - i14, (i13 - i14) / 2);
            }
            m76601b(canvas, this.f70897b[0], 0, (this.f70905j - this.f70906k) / 2);
            canvas.restore();
            return;
        }
        if (i11 == 4) {
            canvas.save();
            int i15 = this.f70909n;
            canvas.translate(i15, i15);
            if (this.f70901f) {
                int i16 = this.f70905j;
                int i17 = this.f70906k;
                m76602c(canvas, i16 - i17, i16 - i17);
            } else {
                Drawable drawable = this.f70897b[3];
                int i18 = this.f70905j;
                int i19 = this.f70906k;
                m76601b(canvas, drawable, i18 - i19, i18 - i19);
            }
            m76601b(canvas, this.f70897b[2], 0, this.f70905j - this.f70906k);
            m76601b(canvas, this.f70897b[1], this.f70905j - this.f70906k, 0);
            m76601b(canvas, this.f70897b[0], 0, 0);
            canvas.restore();
            return;
        }
        if (i11 == 3) {
            canvas.save();
            int i21 = this.f70909n;
            canvas.translate(i21, i21);
            Drawable drawable2 = this.f70897b[2];
            int i22 = this.f70905j;
            int i23 = this.f70906k;
            m76601b(canvas, drawable2, i22 - i23, (i22 - i23) - (this.f70903h * 2));
            m76601b(canvas, this.f70897b[1], 0, (this.f70905j - this.f70906k) - (this.f70903h * 2));
            m76601b(canvas, this.f70897b[0], (this.f70905j - this.f70906k) / 2, 0);
            canvas.restore();
            return;
        }
        if (i11 == 2) {
            canvas.save();
            int i24 = this.f70909n;
            canvas.translate(i24, i24);
            Drawable drawable3 = this.f70897b[1];
            int i25 = this.f70905j;
            int i26 = this.f70906k;
            m76601b(canvas, drawable3, i25 - i26, (i25 - i26) / 2);
            m76601b(canvas, this.f70897b[0], 0, (this.f70905j - this.f70906k) / 2);
            canvas.restore();
            return;
        }
        Drawable drawable4 = this.f70897b[0];
        if (drawable4 != null) {
            int i27 = this.f70904i;
            drawable4.setBounds(0, 0, i27, i27);
            this.f70897b[0].draw(canvas);
        }
    }

    /* renamed from: d */
    public void m76604d() {
        GradientDrawable gradientDrawable = this.f70900e;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(C23212s8.m119607o(this.f70907l, AbstractC16781w.AvatarPlaceHolderColor));
        }
        Paint paint = this.f70908m;
        if (paint != null) {
            paint.setColor(C23212s8.m119607o(this.f70907l, AbstractC16781w.PrimaryBackgroundColor));
        }
    }

    /* renamed from: e */
    public void m76605e(Drawable[] drawableArr) {
        this.f70897b = drawableArr;
        this.f70896a.invalidate();
    }

    /* renamed from: f */
    public void m76606f(float f11) {
        if (f11 < 0.0f) {
            this.f70903h = (int) (this.f70905j * 0.041666668f);
        } else {
            this.f70903h = AbstractC23136l9.m118742r(f11);
        }
        this.f70908m.setStrokeWidth(this.f70903h);
    }

    /* renamed from: g */
    public void m76607g(int i11, int i12, Drawable[] drawableArr) {
        if (i12 > 4) {
            m76608h(i11, String.valueOf(i12), drawableArr);
        } else {
            m76608h(i11, null, drawableArr);
        }
    }

    /* renamed from: h */
    public void m76608h(int i11, String str, Drawable[] drawableArr) {
        this.f70912q = str;
        this.f70897b = drawableArr;
        this.f70902g = i11;
        if (str != null) {
            this.f70901f = true;
            this.f70898c = new StaticLayout(str, this.f70899d, this.f70905j / 2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.f70901f = false;
        }
        this.f70896a.invalidate();
    }

    /* renamed from: i */
    public void m76609i(int i11) {
        Paint paint = this.f70908m;
        if (paint != null) {
            paint.setColor(i11);
        }
    }

    /* renamed from: j */
    public void m76610j(int i11, int i12) {
        if (this.f70910o) {
            if (AbstractC26683d.f126391B && this.f70911p) {
                double d11 = i11;
                this.f70909n = (int) ((d11 - ((Math.sqrt(2.0d) / 2.0d) * d11)) / Math.sqrt(2.0d));
            } else {
                double d12 = i11;
                this.f70909n = (int) (((d12 / 2.0d) - (((Math.sqrt(2.0d) / 2.0d) * d12) / 2.0d)) / 1.5d);
            }
        } else {
            this.f70909n = 0;
        }
        this.f70904i = i11;
        int i13 = i11 - (this.f70909n * 2);
        this.f70905j = i13;
        this.f70906k = (int) (i13 * 0.5625f);
        this.f70903h = (int) (i13 * 0.041666668f);
        this.f70899d.setTextSize(i13 / 4.0f);
        this.f70908m.setStrokeWidth(this.f70903h);
        if (this.f70912q != null) {
            this.f70898c = new StaticLayout(this.f70912q, this.f70899d, this.f70905j / 2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        this.f70896a.invalidate();
    }

    public C13703p0(View view, int i11, int i12, boolean z11) {
        this(view, i11, i12, z11, false);
    }

    public C13703p0(View view, int i11, int i12, boolean z11, boolean z12) {
        this.f70897b = new Drawable[4];
        this.f70902g = 0;
        this.f70909n = 0;
        this.f70907l = view.getContext();
        this.f70896a = view;
        this.f70910o = z11;
        this.f70911p = z12;
        C13704p1 c13704p1 = new C13704p1(1);
        this.f70899d = c13704p1;
        c13704p1.setColor(C23212s8.m119607o(this.f70907l, AbstractC21196a.TextColor2));
        this.f70899d.m76613c();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f70900e = gradientDrawable;
        gradientDrawable.setShape(1);
        this.f70900e.setColor(C23212s8.m119607o(this.f70907l, AbstractC16781w.AvatarPlaceHolderColor));
        Paint paint = new Paint();
        this.f70908m = paint;
        paint.setAntiAlias(true);
        this.f70908m.setStyle(Paint.Style.STROKE);
        this.f70908m.setColor(C23212s8.m119607o(this.f70907l, AbstractC16781w.PrimaryBackgroundColor));
        m76610j(i11, i12);
    }
}
