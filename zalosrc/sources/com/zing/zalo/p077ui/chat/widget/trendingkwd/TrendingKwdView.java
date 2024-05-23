package com.zing.zalo.p077ui.chat.widget.trendingkwd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p588vw.C28652r;
import p611wj.C29059g;

/* loaded from: classes5.dex */
public class TrendingKwdView extends View {

    /* renamed from: B */
    private static Paint f61552B;

    /* renamed from: A */
    private boolean f61553A;

    /* renamed from: p */
    private final int f61554p;

    /* renamed from: q */
    private final int f61555q;

    /* renamed from: r */
    private final int f61556r;

    /* renamed from: s */
    private final C13704p1 f61557s;

    /* renamed from: t */
    private RectF f61558t;

    /* renamed from: u */
    private C29059g f61559u;

    /* renamed from: v */
    private StaticLayout f61560v;

    /* renamed from: w */
    private int f61561w;

    /* renamed from: x */
    private int f61562x;

    /* renamed from: y */
    private int f61563y;

    /* renamed from: z */
    private CharSequence f61564z;

    public TrendingKwdView(Context context) {
        super(context);
        this.f61554p = AbstractC23136l9.m118742r(24.0f);
        this.f61555q = AbstractC23136l9.m118742r(12.0f);
        this.f61556r = AbstractC23136l9.m118742r(15.0f);
        C13704p1 c13704p1 = new C13704p1(1);
        this.f61557s = c13704p1;
        c13704p1.setTypeface(Typeface.DEFAULT);
        c13704p1.setTextSize(AbstractC23136l9.m118742r(14.0f));
        if (f61552B == null) {
            Paint paint = new Paint(1);
            f61552B = paint;
            paint.setStyle(Paint.Style.FILL);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.f61553A) {
                RectF rectF = this.f61558t;
                int i11 = this.f61556r;
                canvas.drawRoundRect(rectF, i11, i11, f61552B);
            }
            canvas.save();
            canvas.translate(this.f61555q, this.f61563y);
            this.f61560v.draw(canvas);
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f61561w + (this.f61555q * 2), this.f61554p);
    }

    public void setData(C29059g c29059g) {
        try {
            this.f61553A = false;
            this.f61559u = c29059g;
            this.f61564z = c29059g.f134631a;
            this.f61564z = C28652r.m143349v().m143354E(new SpannableString(this.f61564z));
            this.f61557s.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            f61552B.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.sticker_panel_trending_kwd_highlight_bg_color));
            C29059g c29059g2 = this.f61559u;
            if (c29059g2 != null && !TextUtils.isEmpty(c29059g2.f134631a)) {
                this.f61561w = AbstractC23136l9.m118764y0(this.f61557s, this.f61559u.f134631a);
                StaticLayout m119625l = AbstractC23214t.m119625l(this.f61564z, this.f61557s, Integer.MAX_VALUE, 1);
                this.f61560v = m119625l;
                if (m119625l != null) {
                    this.f61562x = m119625l.getHeight();
                    this.f61561w = (int) this.f61560v.getLineWidth(0);
                }
                this.f61558t = new RectF(0.0f, 0.0f, this.f61561w + (this.f61555q * 2), this.f61554p);
                this.f61563y = (this.f61554p - this.f61562x) / 2;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        try {
            this.f61553A = z11;
            if (z11) {
                this.f61557s.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.btn_type_3_text_n));
                this.f61557s.m76613c();
            } else {
                this.f61557s.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
                this.f61557s.m76612b(5);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
