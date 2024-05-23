package com.zing.zalo.chathead.ChatHeadUI;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23244v8;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p588vw.C28652r;

/* loaded from: classes3.dex */
public class ChatHeadTextView extends View {

    /* renamed from: F */
    private static TextPaint f42064F;

    /* renamed from: G */
    private static TextPaint f42065G;

    /* renamed from: H */
    private static Drawable f42066H;

    /* renamed from: p */
    private StaticLayout f42071p;

    /* renamed from: q */
    private StaticLayout f42072q;

    /* renamed from: r */
    private Rect f42073r;

    /* renamed from: s */
    private int f42074s;

    /* renamed from: t */
    private int f42075t;

    /* renamed from: u */
    private int f42076u;

    /* renamed from: v */
    private int f42077v;

    /* renamed from: w */
    public static final int f42067w = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: x */
    public static final int f42068x = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: y */
    public static final int f42069y = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: z */
    private static final int f42070z = AbstractC23136l9.m118742r(180.0f);

    /* renamed from: A */
    private static final int f42059A = AbstractC23136l9.m118742r(90.0f);

    /* renamed from: B */
    public static final int f42060B = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: C */
    private static final int f42061C = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: D */
    private static final int f42062D = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: E */
    private static final int f42063E = AbstractC23136l9.m118742r(2.0f);

    public ChatHeadTextView(Context context) {
        super(context);
        m39853e();
    }

    /* renamed from: a */
    private int m39850a(StaticLayout staticLayout) {
        int i11 = 0;
        for (int i12 = 0; i12 < staticLayout.getLineCount(); i12++) {
            i11 = Math.max(i11, (int) Math.min(f42070z, staticLayout.getLineWidth(i12)));
        }
        return Math.min(f42070z, Math.max((int) Math.ceil(i11), f42059A));
    }

    /* renamed from: b */
    private void m39851b() {
        StaticLayout staticLayout = this.f42071p;
        if (staticLayout != null) {
            int i11 = f42068x + f42061C;
            this.f42074s = i11;
            int i12 = f42067w + f42062D;
            this.f42075t = i12;
            if (this.f42072q != null) {
                this.f42076u = i11;
                this.f42077v = i12 + f42063E + staticLayout.getHeight();
            }
        }
    }

    /* renamed from: c */
    public static void m39852c() {
        f42066H = null;
        f42064F = null;
        f42065G = null;
        m39853e();
    }

    /* renamed from: e */
    private static void m39853e() {
        if (f42066H == null) {
            f42066H = C23212s8.m119608p(AbstractC16781w.bg_chathead_bubble_text);
        }
        if (f42064F == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f42064F = c13704p1;
            c13704p1.setColor(C23212s8.m119606n(AbstractC21196a.TextColor1));
            f42064F.linkColor = C23212s8.m119606n(AbstractC16781w.LinkColor);
            f42064F.setTextSize(AbstractC23136l9.m118742r(14.0f));
        }
        if (f42065G == null) {
            C13704p1 c13704p12 = new C13704p1(1);
            f42065G = c13704p12;
            c13704p12.setColor(C23212s8.m119606n(AbstractC21196a.TextColor2));
            f42065G.linkColor = C23212s8.m119606n(AbstractC16781w.LinkColor);
            f42065G.setTextSize(AbstractC23136l9.m118742r(14.0f));
        }
    }

    private void setTextMultiLayout(CharSequence charSequence) {
        int m119752p = AbstractC23244v8.m119752p(charSequence, '\n');
        if (m119752p <= 0) {
            setTextSingleLayout(charSequence);
            return;
        }
        CharSequence subSequence = charSequence.subSequence(0, m119752p);
        CharSequence subSequence2 = charSequence.subSequence(m119752p + 1, charSequence.length());
        CharSequence m143355F = C28652r.m143349v().m143355F((SpannableString) subSequence, f42064F.getTextSize());
        CharSequence m143355F2 = C28652r.m143349v().m143355F((SpannableString) subSequence2, f42065G.getTextSize());
        TextPaint textPaint = f42064F;
        int i11 = f42070z;
        this.f42071p = AbstractC23214t.m119630q(m143355F, textPaint, i11, 1);
        this.f42072q = AbstractC23214t.m119630q(m143355F2, f42065G, i11, 1);
    }

    private void setTextSingleLayout(CharSequence charSequence) {
        this.f42071p = AbstractC23214t.m119630q(C28652r.m143349v().m143355F((SpannableString) charSequence, f42064F.getTextSize()), f42064F, f42070z, 2);
        this.f42072q = null;
    }

    /* renamed from: d */
    public void m39854d(CharSequence charSequence, boolean z11) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (!(charSequence instanceof SpannableString)) {
            charSequence = new SpannableString(charSequence);
        }
        if (z11) {
            setTextMultiLayout(charSequence);
        } else {
            setTextSingleLayout(charSequence);
        }
        m39851b();
        requestLayout();
    }

    public int getViewHeight() {
        StaticLayout staticLayout = this.f42071p;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            StaticLayout staticLayout2 = this.f42072q;
            if (staticLayout2 != null) {
                height += f42063E + staticLayout2.getHeight();
            }
            return height + (f42062D * 2) + f42067w + f42069y;
        }
        return 0;
    }

    public int getViewWidth() {
        StaticLayout staticLayout = this.f42071p;
        if (staticLayout != null) {
            int m39850a = m39850a(staticLayout);
            StaticLayout staticLayout2 = this.f42072q;
            if (staticLayout2 != null) {
                m39850a = Math.max(m39850a, m39850a(staticLayout2));
            }
            return m39850a + ((f42068x + f42061C) * 2);
        }
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f42071p != null) {
            f42066H.setBounds(this.f42073r);
            f42066H.draw(canvas);
            canvas.save();
            canvas.translate(this.f42074s, this.f42075t);
            this.f42071p.draw(canvas);
            canvas.restore();
            if (this.f42072q != null) {
                canvas.save();
                canvas.translate(this.f42076u, this.f42077v);
                this.f42072q.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f42071p != null) {
            setMeasuredDimension(getViewWidth(), getViewHeight());
            this.f42073r = new Rect(0, 0, getViewWidth(), getViewHeight());
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
