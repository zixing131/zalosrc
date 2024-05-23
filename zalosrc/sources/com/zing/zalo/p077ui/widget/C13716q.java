package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.zview.AbstractC17450b;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.ui.widget.q */
/* loaded from: classes6.dex */
public class C13716q {

    /* renamed from: l */
    public static final int f70984l = AbstractC23136l9.m118742r(140.0f);

    /* renamed from: m */
    public static final int f70985m;

    /* renamed from: n */
    public static final int f70986n;

    /* renamed from: o */
    private static final int f70987o;

    /* renamed from: p */
    public static final int f70988p;

    /* renamed from: q */
    private static final int f70989q;

    /* renamed from: r */
    private static final int f70990r;

    /* renamed from: s */
    private static final int f70991s;

    /* renamed from: t */
    public static boolean f70992t;

    /* renamed from: u */
    static int f70993u;

    /* renamed from: v */
    static TextPaint f70994v;

    /* renamed from: w */
    private static final int f70995w;

    /* renamed from: x */
    private static final int f70996x;

    /* renamed from: y */
    private static final int f70997y;

    /* renamed from: z */
    static Paint f70998z;

    /* renamed from: a */
    private boolean f70999a = false;

    /* renamed from: b */
    private View f71000b;

    /* renamed from: c */
    private String f71001c;

    /* renamed from: d */
    private int f71002d;

    /* renamed from: e */
    private int f71003e;

    /* renamed from: f */
    private boolean f71004f;

    /* renamed from: g */
    RectF[] f71005g;

    /* renamed from: h */
    Handler f71006h;

    /* renamed from: i */
    Runnable f71007i;

    /* renamed from: j */
    private int[] f71008j;

    /* renamed from: k */
    private boolean[] f71009k;

    static {
        int m118742r = AbstractC23136l9.m118742r(28.0f);
        f70985m = m118742r;
        f70986n = AbstractC23136l9.m118742r(16.0f);
        f70987o = m118742r;
        f70988p = AbstractC23136l9.m118742r(9.0f);
        f70989q = m118742r - AbstractC23136l9.m118742r(6.0f);
        f70990r = AbstractC23136l9.m118742r(5.0f);
        f70991s = AbstractC23136l9.m118742r(2.0f);
        f70992t = false;
        int m118742r2 = AbstractC23136l9.m118742r(5.0f);
        f70995w = m118742r2;
        int m118742r3 = AbstractC23136l9.m118742r(10.0f) + m118742r;
        f70996x = m118742r3;
        f70997y = m118742r - AbstractC23136l9.m118742r(3.0f);
        f70993u = m118742r3 + (m118742r2 * 3) + (2 * AbstractC23136l9.m118742r(2.0f)) + AbstractC23136l9.m118742r(16.0f);
    }

    public C13716q(View view) {
        if (f70994v == null || f70992t) {
            C13704p1 c13704p1 = new C13704p1(1);
            f70994v = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f70994v.setTextSize(AbstractC23136l9.m118742r(18.0f));
            f70994v.setColor(AbstractC11531v0.m62153I3());
            Paint paint = new Paint(1);
            f70998z = paint;
            paint.setStyle(Paint.Style.FILL);
            f70998z.setColor(C23212s8.m119607o(view.getContext(), AbstractC17450b.NormalIcon2));
            f70992t = false;
        }
        this.f71000b = view;
        this.f71001c = "--:--";
        this.f71002d = AbstractC23136l9.m118764y0(f70994v, "--:--");
        this.f71003e = AbstractC23136l9.m118761x0(f70994v, "00:00");
        this.f71004f = false;
        this.f71006h = new Handler();
        this.f71007i = new Runnable() { // from class: com.zing.zalo.ui.widget.p
            @Override // java.lang.Runnable
            public final void run() {
                C13716q.this.m76682d();
            }
        };
        view.invalidate();
        m76684c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m76682d() {
        try {
            m76691k();
            this.f71000b.invalidate();
            this.f71006h.postDelayed(this.f71007i, 7L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m76683b(Canvas canvas) {
        if (this.f71004f) {
            Drawable m62178N3 = AbstractC11531v0.m62178N3();
            int i11 = f70987o;
            m62178N3.setBounds(0, 0, i11, i11);
            AbstractC11531v0.m62178N3().draw(canvas);
        } else {
            Drawable m62173M3 = AbstractC11531v0.m62173M3();
            int i12 = f70987o;
            m62173M3.setBounds(0, 0, i12, i12);
            AbstractC11531v0.m62173M3().draw(canvas);
        }
        for (int i13 = 0; i13 < this.f71008j.length; i13++) {
            this.f71005g[i13].set(((AbstractC23136l9.m118742r(2.0f) + f70995w) * i13) + f70996x, r6 - this.f71008j[i13], r2 + ((AbstractC23136l9.m118742r(2.0f) + r3) * i13) + r3, f70997y);
            RectF rectF = this.f71005g[i13];
            int i14 = f70991s;
            canvas.drawRoundRect(rectF, i14, i14, f70998z);
        }
        String str = this.f71001c;
        float f11 = f70993u;
        int i15 = f70985m;
        canvas.drawText(str, f11, (i15 / 2) + (this.f71003e / 2), f70994v);
        if (this.f70999a && AbstractC11531v0.m62142G2() != null) {
            int m118742r = f70993u + this.f71002d + AbstractC23136l9.m118742r(8.0f);
            int i16 = f70986n;
            int i17 = (i15 / 2) - (i16 / 2);
            AbstractC11531v0.m62142G2().setBounds(m118742r, i17, m118742r + i16, i16 + i17);
            AbstractC11531v0.m62142G2().draw(canvas);
        }
    }

    /* renamed from: c */
    void m76684c() {
        this.f71008j = r1;
        int[] iArr = {AbstractC23136l9.m118742r(12.0f)};
        this.f71008j[1] = AbstractC23136l9.m118742r(5.0f);
        this.f71008j[2] = AbstractC23136l9.m118742r(18.0f);
        this.f71009k = r1;
        boolean[] zArr = {false, true, false};
        this.f71005g = new RectF[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.f71005g[i11] = new RectF(((AbstractC23136l9.m118742r(2.0f) + f70995w) * i11) + f70996x, r8 - this.f71008j[i11], r4 + ((AbstractC23136l9.m118742r(2.0f) + r5) * i11) + r5, f70997y);
        }
    }

    /* renamed from: e */
    public void m76685e() {
        if (!this.f71004f) {
            this.f71004f = true;
            this.f71006h.removeCallbacks(this.f71007i);
            m76688h();
        }
    }

    /* renamed from: f */
    public void m76686f(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = "--:--";
        }
        this.f71001c = str;
        this.f71002d = AbstractC23136l9.m118764y0(f70994v, str);
        TextPaint textPaint = f70994v;
        if (TextUtils.equals(this.f71001c, "--:--")) {
            str2 = "00:00";
        } else {
            str2 = this.f71001c;
        }
        this.f71003e = AbstractC23136l9.m118761x0(textPaint, str2);
        this.f71000b.invalidate();
    }

    /* renamed from: g */
    public void m76687g(boolean z11) {
        this.f70999a = z11;
    }

    /* renamed from: h */
    void m76688h() {
        this.f71006h.postDelayed(this.f71007i, 7L);
    }

    /* renamed from: i */
    public void m76689i() {
        this.f71004f = false;
        m76690j();
        m76684c();
    }

    /* renamed from: j */
    void m76690j() {
        this.f71006h.removeCallbacks(this.f71007i);
    }

    /* renamed from: k */
    void m76691k() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f71008j;
            if (i11 < iArr.length) {
                boolean[] zArr = this.f71009k;
                if (zArr[i11]) {
                    int i12 = iArr[i11] + 1;
                    iArr[i11] = i12;
                    if (i12 == f70989q) {
                        zArr[i11] = false;
                    }
                } else {
                    int i13 = iArr[i11] - 1;
                    iArr[i11] = i13;
                    if (i13 == f70990r) {
                        zArr[i11] = true;
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
