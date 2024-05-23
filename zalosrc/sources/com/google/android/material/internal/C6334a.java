package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.AbstractC1477p;
import androidx.core.text.InterfaceC1476o;
import androidx.core.util.AbstractC1487i;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import com.google.android.material.internal.C6351r;
import p252j1.AbstractC20900a;
import p382o6.AbstractC24041a;
import p599w6.C28772a;
import p599w6.C28775d;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes3.dex */
public final class C6334a {

    /* renamed from: j0 */
    private static final boolean f35468j0 = false;

    /* renamed from: k0 */
    private static final Paint f35469k0 = null;

    /* renamed from: A */
    private C28772a f35470A;

    /* renamed from: B */
    private CharSequence f35471B;

    /* renamed from: C */
    private CharSequence f35472C;

    /* renamed from: D */
    private boolean f35473D;

    /* renamed from: F */
    private boolean f35475F;

    /* renamed from: G */
    private Bitmap f35476G;

    /* renamed from: H */
    private Paint f35477H;

    /* renamed from: I */
    private float f35478I;

    /* renamed from: J */
    private float f35479J;

    /* renamed from: K */
    private int[] f35480K;

    /* renamed from: L */
    private boolean f35481L;

    /* renamed from: M */
    private final TextPaint f35482M;

    /* renamed from: N */
    private final TextPaint f35483N;

    /* renamed from: O */
    private TimeInterpolator f35484O;

    /* renamed from: P */
    private TimeInterpolator f35485P;

    /* renamed from: Q */
    private float f35486Q;

    /* renamed from: R */
    private float f35487R;

    /* renamed from: S */
    private float f35488S;

    /* renamed from: T */
    private ColorStateList f35489T;

    /* renamed from: U */
    private float f35490U;

    /* renamed from: V */
    private float f35491V;

    /* renamed from: W */
    private float f35492W;

    /* renamed from: X */
    private ColorStateList f35493X;

    /* renamed from: Y */
    private float f35494Y;

    /* renamed from: Z */
    private float f35495Z;

    /* renamed from: a */
    private final View f35496a;

    /* renamed from: a0 */
    private StaticLayout f35497a0;

    /* renamed from: b */
    private boolean f35498b;

    /* renamed from: b0 */
    private float f35499b0;

    /* renamed from: c */
    private float f35500c;

    /* renamed from: c0 */
    private float f35501c0;

    /* renamed from: d */
    private boolean f35502d;

    /* renamed from: d0 */
    private float f35503d0;

    /* renamed from: e */
    private float f35504e;

    /* renamed from: e0 */
    private CharSequence f35505e0;

    /* renamed from: f */
    private float f35506f;

    /* renamed from: g */
    private int f35508g;

    /* renamed from: h */
    private final Rect f35510h;

    /* renamed from: i */
    private final Rect f35512i;

    /* renamed from: j */
    private final RectF f35514j;

    /* renamed from: o */
    private ColorStateList f35519o;

    /* renamed from: p */
    private ColorStateList f35520p;

    /* renamed from: q */
    private float f35521q;

    /* renamed from: r */
    private float f35522r;

    /* renamed from: s */
    private float f35523s;

    /* renamed from: t */
    private float f35524t;

    /* renamed from: u */
    private float f35525u;

    /* renamed from: v */
    private float f35526v;

    /* renamed from: w */
    private Typeface f35527w;

    /* renamed from: x */
    private Typeface f35528x;

    /* renamed from: y */
    private Typeface f35529y;

    /* renamed from: z */
    private C28772a f35530z;

    /* renamed from: k */
    private int f35515k = 16;

    /* renamed from: l */
    private int f35516l = 16;

    /* renamed from: m */
    private float f35517m = 15.0f;

    /* renamed from: n */
    private float f35518n = 15.0f;

    /* renamed from: E */
    private boolean f35474E = true;

    /* renamed from: f0 */
    private int f35507f0 = 1;

    /* renamed from: g0 */
    private float f35509g0 = 0.0f;

    /* renamed from: h0 */
    private float f35511h0 = 1.0f;

    /* renamed from: i0 */
    private int f35513i0 = C6351r.f35574n;

    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes3.dex */
    class a implements C28772a.a {
        a() {
        }

        @Override // p599w6.C28772a.a
        /* renamed from: a */
        public void mo32553a(Typeface typeface) {
            C6334a.this.m32526d0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* loaded from: classes3.dex */
    class b implements C28772a.a {
        b() {
        }

        @Override // p599w6.C28772a.a
        /* renamed from: a */
        public void mo32553a(Typeface typeface) {
            C6334a.this.m32535n0(typeface);
        }
    }

    public C6334a(View view) {
        this.f35496a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f35482M = textPaint;
        this.f35483N = new TextPaint(textPaint);
        this.f35512i = new Rect();
        this.f35510h = new Rect();
        this.f35514j = new RectF();
        this.f35506f = m32486f();
    }

    /* renamed from: D0 */
    private boolean m32471D0() {
        return this.f35507f0 > 1 && (!this.f35473D || this.f35502d) && !this.f35475F;
    }

    /* renamed from: L */
    private void m32472L(TextPaint textPaint) {
        textPaint.setTextSize(this.f35518n);
        textPaint.setTypeface(this.f35527w);
        textPaint.setLetterSpacing(this.f35494Y);
    }

    /* renamed from: M */
    private void m32473M(TextPaint textPaint) {
        textPaint.setTextSize(this.f35517m);
        textPaint.setTypeface(this.f35528x);
        textPaint.setLetterSpacing(this.f35495Z);
    }

    /* renamed from: N */
    private void m32474N(float f11) {
        Rect rect;
        if (this.f35502d) {
            RectF rectF = this.f35514j;
            if (f11 < this.f35506f) {
                rect = this.f35510h;
            } else {
                rect = this.f35512i;
            }
            rectF.set(rect);
            return;
        }
        this.f35514j.left = m32478S(this.f35510h.left, this.f35512i.left, f11, this.f35484O);
        this.f35514j.top = m32478S(this.f35521q, this.f35522r, f11, this.f35484O);
        this.f35514j.right = m32478S(this.f35510h.right, this.f35512i.right, f11, this.f35484O);
        this.f35514j.bottom = m32478S(this.f35510h.bottom, this.f35512i.bottom, f11, this.f35484O);
    }

    /* renamed from: O */
    private static boolean m32475O(float f11, float f12) {
        if (Math.abs(f11 - f12) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private boolean m32476P() {
        if (AbstractC1579n0.m7812G(this.f35496a) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m32477R(CharSequence charSequence, boolean z11) {
        InterfaceC1476o interfaceC1476o;
        if (z11) {
            interfaceC1476o = AbstractC1477p.f6362d;
        } else {
            interfaceC1476o = AbstractC1477p.f6361c;
        }
        return interfaceC1476o.mo7465a(charSequence, 0, charSequence.length());
    }

    /* renamed from: S */
    private static float m32478S(float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f13);
        }
        return AbstractC24041a.m125910a(f11, f12, f13);
    }

    /* renamed from: W */
    private static boolean m32479W(Rect rect, int i11, int i12, int i13, int i14) {
        if (rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m32480a(int i11, int i12, float f11) {
        float f12 = 1.0f - f11;
        return Color.argb((int) ((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), (int) ((Color.red(i11) * f12) + (Color.red(i12) * f11)), (int) ((Color.green(i11) * f12) + (Color.green(i12) * f11)), (int) ((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    /* renamed from: a0 */
    private void m32481a0(float f11) {
        this.f35499b0 = f11;
        AbstractC1579n0.m7898r0(this.f35496a);
    }

    /* renamed from: b */
    private void m32482b(boolean z11) {
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        float f14 = this.f35479J;
        m32490j(this.f35518n, z11);
        CharSequence charSequence = this.f35472C;
        if (charSequence != null && (staticLayout = this.f35497a0) != null) {
            this.f35505e0 = TextUtils.ellipsize(charSequence, this.f35482M, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f35505e0;
        float f15 = 0.0f;
        if (charSequence2 != null) {
            f11 = this.f35482M.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f11 = 0.0f;
        }
        int m8182b = AbstractC1602t.m8182b(this.f35516l, this.f35473D ? 1 : 0);
        int i11 = m8182b & 112;
        if (i11 != 48) {
            if (i11 != 80) {
                this.f35522r = this.f35512i.centerY() - ((this.f35482M.descent() - this.f35482M.ascent()) / 2.0f);
            } else {
                this.f35522r = this.f35512i.bottom + this.f35482M.ascent();
            }
        } else {
            this.f35522r = this.f35512i.top;
        }
        int i12 = m8182b & 8388615;
        if (i12 != 1) {
            if (i12 != 5) {
                this.f35524t = this.f35512i.left;
            } else {
                this.f35524t = this.f35512i.right - f11;
            }
        } else {
            this.f35524t = this.f35512i.centerX() - (f11 / 2.0f);
        }
        m32490j(this.f35517m, z11);
        StaticLayout staticLayout2 = this.f35497a0;
        if (staticLayout2 != null) {
            f12 = staticLayout2.getHeight();
        } else {
            f12 = 0.0f;
        }
        CharSequence charSequence3 = this.f35472C;
        if (charSequence3 != null) {
            f13 = this.f35482M.measureText(charSequence3, 0, charSequence3.length());
        } else {
            f13 = 0.0f;
        }
        StaticLayout staticLayout3 = this.f35497a0;
        if (staticLayout3 != null && this.f35507f0 > 1) {
            f13 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f35497a0;
        if (staticLayout4 != null) {
            if (this.f35507f0 > 1) {
                f15 = staticLayout4.getLineStart(0);
            } else {
                f15 = staticLayout4.getLineLeft(0);
            }
        }
        this.f35503d0 = f15;
        int m8182b2 = AbstractC1602t.m8182b(this.f35515k, this.f35473D ? 1 : 0);
        int i13 = m8182b2 & 112;
        if (i13 != 48) {
            if (i13 != 80) {
                this.f35521q = this.f35510h.centerY() - (f12 / 2.0f);
            } else {
                this.f35521q = (this.f35510h.bottom - f12) + this.f35482M.descent();
            }
        } else {
            this.f35521q = this.f35510h.top;
        }
        int i14 = m8182b2 & 8388615;
        if (i14 != 1) {
            if (i14 != 5) {
                this.f35523s = this.f35510h.left;
            } else {
                this.f35523s = this.f35510h.right - f13;
            }
        } else {
            this.f35523s = this.f35510h.centerX() - (f13 / 2.0f);
        }
        m32492k();
        m32498t0(f14);
    }

    /* renamed from: d */
    private void m32483d() {
        m32488h(this.f35500c);
    }

    /* renamed from: e */
    private float m32484e(float f11) {
        float f12 = this.f35506f;
        if (f11 <= f12) {
            return AbstractC24041a.m125911b(1.0f, 0.0f, this.f35504e, f12, f11);
        }
        return AbstractC24041a.m125911b(0.0f, 1.0f, f12, 1.0f, f11);
    }

    /* renamed from: e0 */
    private boolean m32485e0(Typeface typeface) {
        C28772a c28772a = this.f35470A;
        if (c28772a != null) {
            c28772a.m143968c();
        }
        if (this.f35527w != typeface) {
            this.f35527w = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private float m32486f() {
        float f11 = this.f35504e;
        return f11 + ((1.0f - f11) * 0.5f);
    }

    /* renamed from: g */
    private boolean m32487g(CharSequence charSequence) {
        boolean m32476P = m32476P();
        if (this.f35474E) {
            return m32477R(charSequence, m32476P);
        }
        return m32476P;
    }

    /* renamed from: h */
    private void m32488h(float f11) {
        float f12;
        m32474N(f11);
        if (this.f35502d) {
            if (f11 < this.f35506f) {
                this.f35525u = this.f35523s;
                this.f35526v = this.f35521q;
                m32498t0(this.f35517m);
                f12 = 0.0f;
            } else {
                this.f35525u = this.f35524t;
                this.f35526v = this.f35522r - Math.max(0, this.f35508g);
                m32498t0(this.f35518n);
                f12 = 1.0f;
            }
        } else {
            this.f35525u = m32478S(this.f35523s, this.f35524t, f11, this.f35484O);
            this.f35526v = m32478S(this.f35521q, this.f35522r, f11, this.f35484O);
            m32498t0(m32478S(this.f35517m, this.f35518n, f11, this.f35485P));
            f12 = f11;
        }
        TimeInterpolator timeInterpolator = AbstractC24041a.f116359b;
        m32481a0(1.0f - m32478S(0.0f, 1.0f, 1.0f - f11, timeInterpolator));
        m32491j0(m32478S(1.0f, 0.0f, f11, timeInterpolator));
        if (this.f35520p != this.f35519o) {
            this.f35482M.setColor(m32480a(m32501y(), m32547w(), f12));
        } else {
            this.f35482M.setColor(m32547w());
        }
        float f13 = this.f35494Y;
        float f14 = this.f35495Z;
        if (f13 != f14) {
            this.f35482M.setLetterSpacing(m32478S(f14, f13, f11, timeInterpolator));
        } else {
            this.f35482M.setLetterSpacing(f13);
        }
        this.f35482M.setShadowLayer(m32478S(this.f35490U, this.f35486Q, f11, null), m32478S(this.f35491V, this.f35487R, f11, null), m32478S(this.f35492W, this.f35488S, f11, null), m32480a(m32500x(this.f35493X), m32500x(this.f35489T), f11));
        if (this.f35502d) {
            this.f35482M.setAlpha((int) (m32484e(f11) * 255.0f));
        }
        AbstractC1579n0.m7898r0(this.f35496a);
    }

    /* renamed from: i */
    private void m32489i(float f11) {
        m32490j(f11, false);
    }

    /* renamed from: j */
    private void m32490j(float f11, boolean z11) {
        boolean z12;
        float f12;
        boolean z13;
        if (this.f35471B == null) {
            return;
        }
        float width = this.f35512i.width();
        float width2 = this.f35510h.width();
        boolean z14 = false;
        int i11 = 1;
        if (m32475O(f11, this.f35518n)) {
            f12 = this.f35518n;
            this.f35478I = 1.0f;
            Typeface typeface = this.f35529y;
            Typeface typeface2 = this.f35527w;
            if (typeface != typeface2) {
                this.f35529y = typeface2;
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            float f13 = this.f35517m;
            Typeface typeface3 = this.f35529y;
            Typeface typeface4 = this.f35528x;
            if (typeface3 != typeface4) {
                this.f35529y = typeface4;
                z12 = true;
            } else {
                z12 = false;
            }
            if (m32475O(f11, f13)) {
                this.f35478I = 1.0f;
            } else {
                this.f35478I = f11 / this.f35517m;
            }
            float f14 = this.f35518n / this.f35517m;
            float f15 = width2 * f14;
            if (z11 || f15 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f14, width2);
            }
            f12 = f13;
            z13 = z12;
        }
        if (width > 0.0f) {
            if (this.f35479J == f12 && !this.f35481L && !z13) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.f35479J = f12;
            this.f35481L = false;
        }
        if (this.f35472C == null || z13) {
            this.f35482M.setTextSize(this.f35479J);
            this.f35482M.setTypeface(this.f35529y);
            TextPaint textPaint = this.f35482M;
            if (this.f35478I != 1.0f) {
                z14 = true;
            }
            textPaint.setLinearText(z14);
            this.f35473D = m32487g(this.f35471B);
            if (m32471D0()) {
                i11 = this.f35507f0;
            }
            StaticLayout m32493l = m32493l(i11, width, this.f35473D);
            this.f35497a0 = m32493l;
            this.f35472C = m32493l.getText();
        }
    }

    /* renamed from: j0 */
    private void m32491j0(float f11) {
        this.f35501c0 = f11;
        AbstractC1579n0.m7898r0(this.f35496a);
    }

    /* renamed from: k */
    private void m32492k() {
        Bitmap bitmap = this.f35476G;
        if (bitmap != null) {
            bitmap.recycle();
            this.f35476G = null;
        }
    }

    /* renamed from: l */
    private StaticLayout m32493l(int i11, float f11, boolean z11) {
        StaticLayout staticLayout;
        try {
            staticLayout = C6351r.m32612c(this.f35471B, this.f35482M, (int) f11).m32615e(TextUtils.TruncateAt.END).m32618h(z11).m32614d(Layout.Alignment.ALIGN_NORMAL).m32617g(false).m32620j(i11).m32619i(this.f35509g0, this.f35511h0).m32616f(this.f35513i0).m32613a();
        } catch (C6351r.a e11) {
            e11.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) AbstractC1487i.m7492g(staticLayout);
    }

    /* renamed from: n */
    private void m32494n(Canvas canvas, float f11, float f12) {
        int alpha = this.f35482M.getAlpha();
        canvas.translate(f11, f12);
        float f13 = alpha;
        this.f35482M.setAlpha((int) (this.f35501c0 * f13));
        this.f35497a0.draw(canvas);
        this.f35482M.setAlpha((int) (this.f35499b0 * f13));
        int lineBaseline = this.f35497a0.getLineBaseline(0);
        CharSequence charSequence = this.f35505e0;
        float f14 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, this.f35482M);
        if (!this.f35502d) {
            String trim = this.f35505e0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f35482M.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f35497a0.getLineEnd(0), str.length()), 0.0f, f14, (Paint) this.f35482M);
        }
    }

    /* renamed from: o */
    private void m32495o() {
        if (this.f35476G == null && !this.f35510h.isEmpty() && !TextUtils.isEmpty(this.f35472C)) {
            m32488h(0.0f);
            int width = this.f35497a0.getWidth();
            int height = this.f35497a0.getHeight();
            if (width > 0 && height > 0) {
                this.f35476G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f35497a0.draw(new Canvas(this.f35476G));
                if (this.f35477H == null) {
                    this.f35477H = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o0 */
    private boolean m32496o0(Typeface typeface) {
        C28772a c28772a = this.f35530z;
        if (c28772a != null) {
            c28772a.m143968c();
        }
        if (this.f35528x != typeface) {
            this.f35528x = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private float m32497t(int i11, int i12) {
        if (i12 != 17 && (i12 & 7) != 1) {
            if ((i12 & 8388613) != 8388613 && (i12 & 5) != 5) {
                if (this.f35473D) {
                    return this.f35512i.right - m32524c();
                }
                return this.f35512i.left;
            }
            if (this.f35473D) {
                return this.f35512i.left;
            }
            return this.f35512i.right - m32524c();
        }
        return (i11 / 2.0f) - (m32524c() / 2.0f);
    }

    /* renamed from: t0 */
    private void m32498t0(float f11) {
        boolean z11;
        m32489i(f11);
        if (f35468j0 && this.f35478I != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35475F = z11;
        if (z11) {
            m32495o();
        }
        AbstractC1579n0.m7898r0(this.f35496a);
    }

    /* renamed from: u */
    private float m32499u(RectF rectF, int i11, int i12) {
        if (i12 != 17 && (i12 & 7) != 1) {
            if ((i12 & 8388613) != 8388613 && (i12 & 5) != 5) {
                if (this.f35473D) {
                    return this.f35512i.right;
                }
                return rectF.left + m32524c();
            }
            if (this.f35473D) {
                return rectF.left + m32524c();
            }
            return this.f35512i.right;
        }
        return (i11 / 2.0f) + (m32524c() / 2.0f);
    }

    /* renamed from: x */
    private int m32500x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f35480K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: y */
    private int m32501y() {
        return m32500x(this.f35519o);
    }

    /* renamed from: A */
    public int m32502A() {
        return this.f35515k;
    }

    /* renamed from: A0 */
    public void m32503A0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f35471B, charSequence)) {
            this.f35471B = charSequence;
            this.f35472C = null;
            m32492k();
            m32518U();
        }
    }

    /* renamed from: B */
    public float m32504B() {
        m32473M(this.f35483N);
        return -this.f35483N.ascent();
    }

    /* renamed from: B0 */
    public void m32505B0(TimeInterpolator timeInterpolator) {
        this.f35485P = timeInterpolator;
        m32518U();
    }

    /* renamed from: C */
    public Typeface m32506C() {
        Typeface typeface = this.f35528x;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    /* renamed from: C0 */
    public void m32507C0(Typeface typeface) {
        boolean m32485e0 = m32485e0(typeface);
        boolean m32496o0 = m32496o0(typeface);
        if (m32485e0 || m32496o0) {
            m32518U();
        }
    }

    /* renamed from: D */
    public float m32508D() {
        return this.f35500c;
    }

    /* renamed from: E */
    public float m32509E() {
        return this.f35506f;
    }

    /* renamed from: F */
    public int m32510F() {
        return this.f35513i0;
    }

    /* renamed from: G */
    public int m32511G() {
        StaticLayout staticLayout = this.f35497a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: H */
    public float m32512H() {
        return this.f35497a0.getSpacingAdd();
    }

    /* renamed from: I */
    public float m32513I() {
        return this.f35497a0.getSpacingMultiplier();
    }

    /* renamed from: J */
    public int m32514J() {
        return this.f35507f0;
    }

    /* renamed from: K */
    public CharSequence m32515K() {
        return this.f35471B;
    }

    /* renamed from: Q */
    public final boolean m32516Q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f35520p;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f35519o) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    void m32517T() {
        boolean z11;
        if (this.f35512i.width() > 0 && this.f35512i.height() > 0 && this.f35510h.width() > 0 && this.f35510h.height() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35498b = z11;
    }

    /* renamed from: U */
    public void m32518U() {
        m32519V(false);
    }

    /* renamed from: V */
    public void m32519V(boolean z11) {
        if ((this.f35496a.getHeight() > 0 && this.f35496a.getWidth() > 0) || z11) {
            m32482b(z11);
            m32483d();
        }
    }

    /* renamed from: X */
    public void m32520X(int i11, int i12, int i13, int i14) {
        if (!m32479W(this.f35512i, i11, i12, i13, i14)) {
            this.f35512i.set(i11, i12, i13, i14);
            this.f35481L = true;
            m32517T();
        }
    }

    /* renamed from: Y */
    public void m32521Y(Rect rect) {
        m32520X(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: Z */
    public void m32522Z(int i11) {
        C28775d c28775d = new C28775d(this.f35496a.getContext(), i11);
        ColorStateList colorStateList = c28775d.f133362a;
        if (colorStateList != null) {
            this.f35520p = colorStateList;
        }
        float f11 = c28775d.f133375n;
        if (f11 != 0.0f) {
            this.f35518n = f11;
        }
        ColorStateList colorStateList2 = c28775d.f133365d;
        if (colorStateList2 != null) {
            this.f35489T = colorStateList2;
        }
        this.f35487R = c28775d.f133370i;
        this.f35488S = c28775d.f133371j;
        this.f35486Q = c28775d.f133372k;
        this.f35494Y = c28775d.f133374m;
        C28772a c28772a = this.f35470A;
        if (c28772a != null) {
            c28772a.m143968c();
        }
        this.f35470A = new C28772a(new a(), c28775d.m143986e());
        c28775d.m143989h(this.f35496a.getContext(), this.f35470A);
        m32518U();
    }

    /* renamed from: b0 */
    public void m32523b0(ColorStateList colorStateList) {
        if (this.f35520p != colorStateList) {
            this.f35520p = colorStateList;
            m32518U();
        }
    }

    /* renamed from: c */
    public float m32524c() {
        if (this.f35471B == null) {
            return 0.0f;
        }
        m32472L(this.f35483N);
        TextPaint textPaint = this.f35483N;
        CharSequence charSequence = this.f35471B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public void m32525c0(int i11) {
        if (this.f35516l != i11) {
            this.f35516l = i11;
            m32518U();
        }
    }

    /* renamed from: d0 */
    public void m32526d0(Typeface typeface) {
        if (m32485e0(typeface)) {
            m32518U();
        }
    }

    /* renamed from: f0 */
    public void m32527f0(int i11) {
        this.f35508g = i11;
    }

    /* renamed from: g0 */
    public void m32528g0(int i11, int i12, int i13, int i14) {
        if (!m32479W(this.f35510h, i11, i12, i13, i14)) {
            this.f35510h.set(i11, i12, i13, i14);
            this.f35481L = true;
            m32517T();
        }
    }

    /* renamed from: h0 */
    public void m32529h0(Rect rect) {
        m32528g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: i0 */
    public void m32530i0(int i11) {
        C28775d c28775d = new C28775d(this.f35496a.getContext(), i11);
        ColorStateList colorStateList = c28775d.f133362a;
        if (colorStateList != null) {
            this.f35519o = colorStateList;
        }
        float f11 = c28775d.f133375n;
        if (f11 != 0.0f) {
            this.f35517m = f11;
        }
        ColorStateList colorStateList2 = c28775d.f133365d;
        if (colorStateList2 != null) {
            this.f35493X = colorStateList2;
        }
        this.f35491V = c28775d.f133370i;
        this.f35492W = c28775d.f133371j;
        this.f35490U = c28775d.f133372k;
        this.f35495Z = c28775d.f133374m;
        C28772a c28772a = this.f35530z;
        if (c28772a != null) {
            c28772a.m143968c();
        }
        this.f35530z = new C28772a(new b(), c28775d.m143986e());
        c28775d.m143989h(this.f35496a.getContext(), this.f35530z);
        m32518U();
    }

    /* renamed from: k0 */
    public void m32531k0(ColorStateList colorStateList) {
        if (this.f35519o != colorStateList) {
            this.f35519o = colorStateList;
            m32518U();
        }
    }

    /* renamed from: l0 */
    public void m32532l0(int i11) {
        if (this.f35515k != i11) {
            this.f35515k = i11;
            m32518U();
        }
    }

    /* renamed from: m */
    public void m32533m(Canvas canvas) {
        float lineLeft;
        int save = canvas.save();
        if (this.f35472C != null && this.f35498b) {
            boolean z11 = true;
            if (this.f35507f0 > 1) {
                lineLeft = this.f35497a0.getLineStart(0);
            } else {
                lineLeft = this.f35497a0.getLineLeft(0);
            }
            float f11 = (this.f35525u + lineLeft) - (this.f35503d0 * 2.0f);
            this.f35482M.setTextSize(this.f35479J);
            float f12 = this.f35525u;
            float f13 = this.f35526v;
            if (!this.f35475F || this.f35476G == null) {
                z11 = false;
            }
            float f14 = this.f35478I;
            if (f14 != 1.0f && !this.f35502d) {
                canvas.scale(f14, f14, f12, f13);
            }
            if (z11) {
                canvas.drawBitmap(this.f35476G, f12, f13, this.f35477H);
                canvas.restoreToCount(save);
                return;
            }
            if (m32471D0() && (!this.f35502d || this.f35500c > this.f35506f)) {
                m32494n(canvas, f11, f13);
            } else {
                canvas.translate(f12, f13);
                this.f35497a0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m0 */
    public void m32534m0(float f11) {
        if (this.f35517m != f11) {
            this.f35517m = f11;
            m32518U();
        }
    }

    /* renamed from: n0 */
    public void m32535n0(Typeface typeface) {
        if (m32496o0(typeface)) {
            m32518U();
        }
    }

    /* renamed from: p */
    public void m32536p(RectF rectF, int i11, int i12) {
        this.f35473D = m32487g(this.f35471B);
        rectF.left = m32497t(i11, i12);
        rectF.top = this.f35512i.top;
        rectF.right = m32499u(rectF, i11, i12);
        rectF.bottom = this.f35512i.top + m32542s();
    }

    /* renamed from: p0 */
    public void m32537p0(float f11) {
        float m109344a = AbstractC20900a.m109344a(f11, 0.0f, 1.0f);
        if (m109344a != this.f35500c) {
            this.f35500c = m109344a;
            m32483d();
        }
    }

    /* renamed from: q */
    public ColorStateList m32538q() {
        return this.f35520p;
    }

    /* renamed from: q0 */
    public void m32539q0(boolean z11) {
        this.f35502d = z11;
    }

    /* renamed from: r */
    public int m32540r() {
        return this.f35516l;
    }

    /* renamed from: r0 */
    public void m32541r0(float f11) {
        this.f35504e = f11;
        this.f35506f = m32486f();
    }

    /* renamed from: s */
    public float m32542s() {
        m32472L(this.f35483N);
        return -this.f35483N.ascent();
    }

    /* renamed from: s0 */
    public void m32543s0(int i11) {
        this.f35513i0 = i11;
    }

    /* renamed from: u0 */
    public void m32544u0(float f11) {
        this.f35509g0 = f11;
    }

    /* renamed from: v */
    public Typeface m32545v() {
        Typeface typeface = this.f35527w;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    /* renamed from: v0 */
    public void m32546v0(float f11) {
        this.f35511h0 = f11;
    }

    /* renamed from: w */
    public int m32547w() {
        return m32500x(this.f35520p);
    }

    /* renamed from: w0 */
    public void m32548w0(int i11) {
        if (i11 != this.f35507f0) {
            this.f35507f0 = i11;
            m32492k();
            m32518U();
        }
    }

    /* renamed from: x0 */
    public void m32549x0(TimeInterpolator timeInterpolator) {
        this.f35484O = timeInterpolator;
        m32518U();
    }

    /* renamed from: y0 */
    public void m32550y0(boolean z11) {
        this.f35474E = z11;
    }

    /* renamed from: z */
    public float m32551z() {
        m32473M(this.f35483N);
        return (-this.f35483N.ascent()) + this.f35483N.descent();
    }

    /* renamed from: z0 */
    public final boolean m32552z0(int[] iArr) {
        this.f35480K = iArr;
        if (m32516Q()) {
            m32518U();
            return true;
        }
        return false;
    }
}
