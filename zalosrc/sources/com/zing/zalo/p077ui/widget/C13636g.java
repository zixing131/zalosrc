package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import dj.C17984n0;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p450qj.C25301c;

/* renamed from: com.zing.zalo.ui.widget.g */
/* loaded from: classes6.dex */
public class C13636g {

    /* renamed from: e0 */
    private static final int f70265e0 = AbstractC23222t7.f112572m;

    /* renamed from: f0 */
    private static final int f70266f0 = AbstractC23222t7.f112576o;

    /* renamed from: g0 */
    private static final int f70267g0 = AbstractC23222t7.f112566j;

    /* renamed from: h0 */
    private static final int f70268h0 = AbstractC23222t7.f112539R;

    /* renamed from: i0 */
    private static final int f70269i0 = AbstractC23222t7.f112552c;

    /* renamed from: j0 */
    private static final int f70270j0 = AbstractC23222t7.f112562h;

    /* renamed from: k0 */
    private static final int f70271k0 = AbstractC23222t7.f112548a;

    /* renamed from: A */
    int f70272A;

    /* renamed from: B */
    int f70273B;

    /* renamed from: C */
    int f70274C;

    /* renamed from: D */
    int f70275D;

    /* renamed from: E */
    int f70276E;

    /* renamed from: F */
    int f70277F;

    /* renamed from: G */
    int f70278G;

    /* renamed from: J */
    int f70281J;

    /* renamed from: K */
    Drawable f70282K;

    /* renamed from: L */
    Drawable f70283L;

    /* renamed from: M */
    Drawable f70284M;

    /* renamed from: N */
    Drawable f70285N;

    /* renamed from: O */
    C23528a f70286O;

    /* renamed from: P */
    C3977j f70287P;

    /* renamed from: Q */
    C3977j f70288Q;

    /* renamed from: R */
    String f70289R;

    /* renamed from: S */
    boolean f70290S;

    /* renamed from: T */
    String f70291T;

    /* renamed from: U */
    boolean f70292U;

    /* renamed from: V */
    C25301c f70293V;

    /* renamed from: W */
    C25301c f70294W;

    /* renamed from: X */
    C25301c f70295X;

    /* renamed from: Y */
    boolean f70296Y;

    /* renamed from: Z */
    boolean f70297Z;

    /* renamed from: a */
    C17984n0 f70298a;

    /* renamed from: a0 */
    boolean f70299a0;

    /* renamed from: b */
    int f70300b;

    /* renamed from: b0 */
    boolean f70301b0;

    /* renamed from: c0 */
    boolean f70303c0;

    /* renamed from: d */
    int f70304d;

    /* renamed from: d0 */
    c f70305d0;

    /* renamed from: e */
    View f70306e;

    /* renamed from: f */
    StaticLayout f70307f;

    /* renamed from: g */
    StaticLayout f70308g;

    /* renamed from: h */
    StaticLayout f70309h;

    /* renamed from: i */
    StaticLayout f70310i;

    /* renamed from: j */
    StaticLayout f70311j;

    /* renamed from: k */
    StaticLayout f70312k;

    /* renamed from: l */
    Paint f70313l;

    /* renamed from: m */
    Paint f70314m;

    /* renamed from: n */
    C13704p1 f70315n;

    /* renamed from: o */
    C13704p1 f70316o;

    /* renamed from: p */
    C13704p1 f70317p;

    /* renamed from: q */
    C13704p1 f70318q;

    /* renamed from: r */
    C13697o f70319r;

    /* renamed from: s */
    Paint f70320s;

    /* renamed from: t */
    int f70321t;

    /* renamed from: u */
    int f70322u;

    /* renamed from: v */
    int f70323v;

    /* renamed from: w */
    int f70324w;

    /* renamed from: x */
    int f70325x;

    /* renamed from: y */
    int f70326y;

    /* renamed from: z */
    int f70327z;

    /* renamed from: c */
    int f70302c = AbstractC23222t7.f112531J0;

    /* renamed from: H */
    int f70279H = 0;

    /* renamed from: I */
    boolean f70280I = false;

    /* renamed from: com.zing.zalo.ui.widget.g$a */
    /* loaded from: classes6.dex */
    public class a extends C23999j {
        a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, C13636g.this.f70291T)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        C13636g c13636g = C13636g.this;
                        c13636g.f70285N = c13636g.f70284M;
                        C13636g.this.f70306e.invalidate();
                    }
                    C13636g c13636g2 = C13636g.this;
                    c13636g2.f70292U = true;
                    C3977j c3977j = c13636g2.f70288Q;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13636g.this.f70285N = new BitmapDrawable(C13636g.this.f70306e.getResources(), c3979l.m18839c());
                    C13636g.this.f70306e.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.g$b */
    /* loaded from: classes6.dex */
    public class b extends C23999j {
        b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, C13636g.this.f70289R) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    C13636g c13636g = C13636g.this;
                    c13636g.f70290S = true;
                    C3977j c3977j = c13636g.f70287P;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13636g.this.f70319r.m76480u(c3979l.m18839c(), true);
                    C13636g.this.f70306e.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.g$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: e */
        void mo61200e(C25301c c25301c);
    }

    public C13636g(View view) {
        this.f70306e = view;
        Context context = view.getContext();
        this.f70286O = new C23528a(context);
        this.f70287P = new C3977j(context);
        this.f70288Q = new C3977j(context);
        this.f70284M = C23278z2.m120143n().f116261b;
        this.f70282K = AbstractC1388a.m6964f(context, AbstractC16803z.rounded_bubble_chat_background_normal);
        this.f70283L = AbstractC1388a.m6964f(context, AbstractC16803z.rounded_bubble_chat_background_pressed);
        Paint paint = new Paint(1);
        this.f70313l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70313l.setColor(C23212s8.m119607o(context, AbstractC7354t0.ItemBackgroundPress));
        C13704p1 c13704p1 = new C13704p1(1);
        this.f70315n = c13704p1;
        Typeface typeface = Typeface.DEFAULT;
        c13704p1.setTypeface(typeface);
        this.f70315n.setTextSize(AbstractC23222t7.f112582r);
        this.f70315n.setColor(AbstractC11531v0.m62153I3());
        C13704p1 c13704p12 = new C13704p1(1);
        this.f70316o = c13704p12;
        c13704p12.setTypeface(typeface);
        this.f70316o.setTextSize(AbstractC23222t7.f112582r);
        this.f70316o.setColor(AbstractC11531v0.m62222Y2());
        Paint paint2 = new Paint(1);
        this.f70314m = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f70314m.setColor(-1711276033);
        this.f70314m.setStrokeWidth(f70269i0);
        C13704p1 c13704p13 = new C13704p1(1);
        this.f70317p = c13704p13;
        c13704p13.m76613c();
        this.f70317p.setTextSize(AbstractC23222t7.f112584s);
        C13704p1 c13704p14 = new C13704p1(1);
        this.f70318q = c13704p14;
        c13704p14.setTypeface(typeface);
        this.f70318q.setTextSize(AbstractC23222t7.f112582r);
        Paint paint3 = new Paint();
        this.f70320s = paint3;
        paint3.setStyle(style);
        this.f70320s.setStrokeWidth(1.0f);
        this.f70320s.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatSeparator));
        C13697o c13697o = new C13697o(view);
        this.f70319r = c13697o;
        float f11 = AbstractC23222t7.f112572m;
        c13697o.m76461I(new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    /* renamed from: a */
    public void m76219a(Canvas canvas) {
        if (this.f70301b0) {
            Drawable drawable = this.f70283L;
            if (drawable != null) {
                drawable.setBounds(0, 0, this.f70302c, this.f70300b);
                this.f70283L.draw(canvas);
            }
        } else {
            Drawable drawable2 = this.f70282K;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, this.f70302c, this.f70300b);
                this.f70282K.draw(canvas);
            }
        }
        int i11 = this.f70279H;
        if (i11 != 0) {
            canvas.drawLine(0.0f, i11, this.f70302c, i11, this.f70320s);
        }
        if (this.f70307f != null) {
            canvas.save();
            int i12 = f70265e0;
            canvas.translate(i12, i12);
            this.f70307f.draw(canvas);
            canvas.restore();
        }
        if (this.f70321t > 0) {
            if (this.f70296Y) {
                if (this.f70281J == 2) {
                    canvas.drawRect(f70271k0, this.f70278G, this.f70302c - r2, r3 + r0, this.f70313l);
                } else {
                    int i13 = f70271k0;
                    int i14 = this.f70278G;
                    RectF rectF = new RectF(i13, i14 - AbstractC23222t7.f112594x, this.f70302c - i13, i14 + this.f70321t);
                    int i15 = AbstractC23222t7.f112572m;
                    canvas.drawRoundRect(rectF, i15, i15, this.f70313l);
                }
            } else if (this.f70297Z) {
                canvas.drawRect(f70271k0, this.f70278G, this.f70302c / 2, (r3 + r0) - r2, this.f70313l);
            } else if (this.f70299a0) {
                int i16 = this.f70302c;
                int i17 = this.f70278G;
                int i18 = f70271k0;
                canvas.drawRect(i16 / 2, i17, i16 - i18, (i17 + r0) - i18, this.f70313l);
            }
        }
        C13697o c13697o = this.f70319r;
        if (c13697o != null) {
            c13697o.m76467d(canvas);
        }
        if (this.f70303c0) {
            canvas.drawCircle(this.f70324w, this.f70325x, (f70268h0 / 2) + (f70269i0 / 2), this.f70314m);
            this.f70285N.setBounds(this.f70326y, this.f70327z, this.f70272A, this.f70273B);
            this.f70285N.draw(canvas);
        }
        if (this.f70308g != null) {
            canvas.save();
            canvas.translate(this.f70274C, this.f70275D);
            this.f70308g.draw(canvas);
            canvas.restore();
        }
        if (this.f70309h != null) {
            canvas.save();
            canvas.translate(this.f70276E, this.f70277F);
            this.f70309h.draw(canvas);
            canvas.restore();
        }
        if (this.f70312k == null) {
            if (this.f70310i != null) {
                canvas.save();
                canvas.translate(f70265e0, this.f70278G + f70266f0);
                this.f70310i.draw(canvas);
                canvas.restore();
            }
            if (this.f70311j != null) {
                canvas.save();
                canvas.translate((this.f70302c / 2) + f70265e0, this.f70278G + f70266f0);
                this.f70311j.draw(canvas);
                canvas.restore();
            }
            StaticLayout staticLayout = this.f70310i;
            if (staticLayout != null && this.f70311j != null) {
                int max = Math.max(staticLayout.getHeight(), this.f70311j.getHeight());
                int i19 = this.f70302c;
                canvas.drawLine(i19 / 2, this.f70278G, i19 / 2, r3 + (f70266f0 * 2) + max, this.f70320s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.translate(f70265e0, this.f70278G + f70266f0);
        this.f70312k.draw(canvas);
        canvas.restore();
    }

    /* renamed from: b */
    public int m76220b() {
        return this.f70300b;
    }

    /* renamed from: c */
    public String m76221c() {
        StringBuilder sb2 = new StringBuilder();
        try {
            C17984n0 c17984n0 = this.f70298a;
            if (c17984n0 != null) {
                if (!TextUtils.isEmpty(c17984n0.f91011p)) {
                    sb2.append(this.f70298a.f91011p);
                    sb2.append("\n");
                }
                if (!TextUtils.isEmpty(this.f70298a.f91015t)) {
                    sb2.append(this.f70298a.f91015t);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public int m76222d() {
        return this.f70302c;
    }

    /* renamed from: e */
    boolean m76223e(float f11, float f12) {
        return this.f70312k != null && f11 > 0.0f && f11 < ((float) this.f70302c) && f12 > ((float) this.f70278G) && f12 < ((float) this.f70300b);
    }

    /* renamed from: f */
    boolean m76224f(float f11, float f12) {
        if (this.f70310i == null || f11 <= 0.0f || f11 >= this.f70302c / 2 || f12 <= this.f70278G || f12 >= this.f70300b) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    boolean m76225g(float f11, float f12) {
        if (this.f70311j == null) {
            return false;
        }
        int i11 = this.f70302c;
        if (f11 <= i11 / 2 || f11 >= i11 || f12 <= this.f70278G || f12 >= this.f70300b) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    boolean m76226h(float f11, float f12) {
        return f11 > 0.0f && f11 < ((float) this.f70302c) && f12 < ((float) this.f70278G) && f12 > ((float) this.f70322u);
    }

    /* renamed from: i */
    void m76227i() {
        AbstractC3972e.m18781f0(this.f70288Q);
        this.f70285N = this.f70284M;
        String str = this.f70298a.f91013r;
        this.f70291T = str;
        if (TextUtils.isEmpty(str)) {
            this.f70292U = true;
            return;
        }
        C24003n m120143n = C23278z2.m120143n();
        if (this.f70280I || C23999j.m125696L2(this.f70291T, m120143n)) {
            ((C23528a) this.f70286O.m123612r(this.f70288Q)).m123579C(this.f70291T, m120143n, new a());
        }
    }

    /* renamed from: j */
    void m76228j() {
        C24003n m120068F;
        try {
            String str = this.f70298a.f91014s;
            this.f70289R = str;
            if (TextUtils.isEmpty(str)) {
                this.f70290S = true;
                this.f70319r.m76477r();
                this.f70306e.invalidate();
                return;
            }
            if (this.f70281J == 2) {
                m120068F = C23278z2.m120144n0();
            } else {
                m120068F = C23278z2.m120068F();
            }
            if (!TextUtils.isEmpty(this.f70289R)) {
                if (C23999j.m125696L2(this.f70289R, m120068F)) {
                    C3979l m123606l = this.f70286O.m123606l(this.f70289R, m120068F.f116260a, m120068F.f116263d, m120068F.f116266g);
                    if (m123606l != null) {
                        this.f70290S = true;
                        C3977j c3977j = this.f70287P;
                        if (c3977j != null) {
                            c3977j.setImageInfo(m123606l, false);
                        }
                        this.f70319r.m76480u(m123606l.m18839c(), false);
                        this.f70306e.invalidate();
                        return;
                    }
                    return;
                }
                this.f70319r.m76477r();
                if (this.f70280I) {
                    ((C23528a) this.f70286O.m123612r(this.f70287P)).m123579C(this.f70289R, m120068F, new b());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m76229k() {
        if (!this.f70290S) {
            m76228j();
        }
        if (!this.f70292U) {
            m76227i();
        }
    }

    /* renamed from: l */
    public boolean m76230l(int i11, float f11, float f12) {
        C25301c c25301c;
        C25301c c25301c2;
        C25301c c25301c3;
        C25301c c25301c4;
        if (i11 == 0) {
            if (m76223e(f11, f12)) {
                this.f70296Y = true;
                return true;
            }
            if (m76224f(f11, f12)) {
                this.f70297Z = true;
                return true;
            }
            if (m76225g(f11, f12)) {
                this.f70299a0 = true;
                return true;
            }
            if (m76226h(f11, f12)) {
                this.f70301b0 = true;
                return true;
            }
        } else if (i11 == 1 || i11 == 3) {
            if (this.f70296Y) {
                this.f70296Y = false;
                if (i11 == 1 && m76223e(f11, f12)) {
                    c cVar = this.f70305d0;
                    if (cVar != null && (c25301c4 = this.f70294W) != null) {
                        cVar.mo61200e(c25301c4);
                    }
                    return true;
                }
            }
            if (this.f70297Z) {
                this.f70297Z = false;
                if (i11 == 1 && m76224f(f11, f12)) {
                    c cVar2 = this.f70305d0;
                    if (cVar2 != null && (c25301c3 = this.f70294W) != null) {
                        cVar2.mo61200e(c25301c3);
                    }
                    return true;
                }
            }
            if (this.f70299a0) {
                this.f70299a0 = false;
                if (i11 == 1 && m76225g(f11, f12)) {
                    c cVar3 = this.f70305d0;
                    if (cVar3 != null && (c25301c2 = this.f70295X) != null) {
                        cVar3.mo61200e(c25301c2);
                    }
                    return true;
                }
            }
            if (this.f70301b0) {
                this.f70301b0 = false;
                if (i11 == 1 && m76226h(f11, f12)) {
                    c cVar4 = this.f70305d0;
                    if (cVar4 != null && (c25301c = this.f70293V) != null) {
                        cVar4.mo61200e(c25301c);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    void m76231m() {
        int i11;
        if (this.f70281J == 2) {
            i11 = AbstractC23222t7.f112581q0;
        } else {
            i11 = AbstractC23222t7.f112523F0;
        }
        this.f70304d = i11;
        if (!TextUtils.isEmpty(this.f70298a.f91079B)) {
            String str = this.f70298a.f91079B;
            C13704p1 c13704p1 = this.f70315n;
            int i12 = this.f70302c;
            int i13 = f70265e0;
            StaticLayout m119623j = AbstractC23214t.m119623j(str, c13704p1, i12 - (i13 * 2), 7, Layout.Alignment.ALIGN_CENTER);
            this.f70307f = m119623j;
            int height = m119623j.getHeight() + i13 + i13;
            this.f70322u = height;
            this.f70323v = height + this.f70304d;
        } else {
            this.f70307f = null;
            this.f70322u = f70271k0;
            this.f70323v = this.f70304d;
        }
        if (this.f70281J == 2) {
            C13697o c13697o = this.f70319r;
            if (c13697o != null) {
                c13697o.m76463K(5, this.f70302c, this.f70304d);
                this.f70319r.m76460H(0, this.f70322u);
            }
        } else {
            C13697o c13697o2 = this.f70319r;
            if (c13697o2 != null) {
                int i14 = this.f70302c;
                int i15 = f70271k0;
                c13697o2.m76463K(5, i14 - (i15 * 2), this.f70304d);
                this.f70319r.m76460H(i15, this.f70322u);
            }
        }
        C25301c c25301c = this.f70294W;
        if (c25301c == null) {
            this.f70321t = 0;
            this.f70310i = null;
            this.f70311j = null;
            this.f70312k = null;
        } else if (this.f70295X != null) {
            String str2 = c25301c.f121347a;
            C13704p1 c13704p12 = this.f70316o;
            int i16 = this.f70302c / 2;
            int i17 = f70265e0;
            this.f70310i = AbstractC23214t.m119629p(str2, c13704p12, i16 - (i17 * 2));
            this.f70311j = AbstractC23214t.m119629p(this.f70295X.f121347a, this.f70316o, (this.f70302c / 2) - (i17 * 2));
            this.f70312k = null;
            this.f70321t = Math.max(this.f70310i.getHeight(), this.f70311j.getHeight()) + (f70266f0 * 2);
        } else {
            this.f70310i = null;
            this.f70311j = null;
            StaticLayout m119629p = AbstractC23214t.m119629p(c25301c.f121347a, this.f70316o, this.f70302c - (f70265e0 * 2));
            this.f70312k = m119629p;
            this.f70321t = m119629p.getHeight() + (f70266f0 * 2);
        }
        this.f70303c0 = !TextUtils.isEmpty(this.f70298a.f91013r);
        int i18 = this.f70281J;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 == 2) {
                    this.f70303c0 = false;
                    this.f70278G = this.f70323v;
                    this.f70317p.setTextSize(AbstractC23222t7.f112582r);
                    this.f70317p.setColor(AbstractC11531v0.m62153I3());
                    this.f70317p.clearShadowLayer();
                    this.f70318q.setTextSize(AbstractC23222t7.f112576o);
                    this.f70318q.setColor(AbstractC11531v0.m62143G3());
                    this.f70318q.clearShadowLayer();
                    int i19 = f70265e0;
                    this.f70276E = i19;
                    this.f70274C = i19;
                    if (!TextUtils.isEmpty(this.f70298a.f91011p)) {
                        StaticLayout m119623j2 = AbstractC23214t.m119623j(this.f70298a.f91011p, this.f70317p, this.f70302c - (i19 * 2), 2, Layout.Alignment.ALIGN_CENTER);
                        this.f70308g = m119623j2;
                        int i21 = this.f70278G + AbstractC23222t7.f112572m;
                        this.f70275D = i21;
                        this.f70278G = i21 + m119623j2.getHeight();
                    } else {
                        this.f70308g = null;
                    }
                    if (!TextUtils.isEmpty(this.f70298a.f91015t)) {
                        StaticLayout m119623j3 = AbstractC23214t.m119623j(this.f70298a.f91015t, this.f70318q, this.f70302c - (i19 * 2), 5, Layout.Alignment.ALIGN_CENTER);
                        this.f70309h = m119623j3;
                        int i22 = this.f70278G + AbstractC23222t7.f112552c;
                        this.f70277F = i22;
                        this.f70278G = i22 + m119623j3.getHeight();
                    } else {
                        this.f70309h = null;
                    }
                    int i23 = this.f70278G + AbstractC23222t7.f112572m;
                    this.f70279H = i23;
                    this.f70278G = i23 + AbstractC23222t7.f112550b;
                }
            } else {
                this.f70317p.setColor(-1);
                C13704p1 c13704p13 = this.f70317p;
                int i24 = f70271k0;
                c13704p13.setShadowLayer(i24, 1.0f, 1.0f, 1275068416);
                this.f70318q.setColor(-1);
                this.f70318q.setShadowLayer(i24, 1.0f, 1.0f, 1275068416);
                int i25 = f70265e0;
                this.f70276E = i25;
                this.f70274C = i25;
                if (!TextUtils.isEmpty(this.f70298a.f91015t)) {
                    StaticLayout m119623j4 = AbstractC23214t.m119623j(this.f70298a.f91015t, this.f70318q, this.f70302c - (i25 * 2), 1, Layout.Alignment.ALIGN_CENTER);
                    this.f70309h = m119623j4;
                    this.f70277F = (this.f70323v - f70267g0) - m119623j4.getHeight();
                } else {
                    this.f70309h = null;
                    this.f70277F = this.f70323v - f70267g0;
                }
                if (!TextUtils.isEmpty(this.f70298a.f91011p)) {
                    StaticLayout m119623j5 = AbstractC23214t.m119623j(this.f70298a.f91011p, this.f70317p, this.f70302c - (i25 * 2), 1, Layout.Alignment.ALIGN_CENTER);
                    this.f70308g = m119623j5;
                    this.f70275D = this.f70277F - m119623j5.getHeight();
                } else {
                    this.f70308g = null;
                    this.f70275D = this.f70277F;
                }
                int i26 = this.f70302c;
                this.f70324w = i26 / 2;
                int i27 = this.f70275D;
                int i28 = f70270j0;
                int i29 = f70269i0;
                int i31 = f70268h0;
                this.f70325x = ((i27 - i28) - i29) - (i31 / 2);
                this.f70326y = (i26 / 2) - (i31 / 2);
                this.f70327z = ((i27 - i28) - i31) - i29;
                this.f70272A = (i26 / 2) + (i31 / 2);
                this.f70273B = (i27 - i28) - i29;
            }
        } else {
            this.f70317p.setColor(-1);
            this.f70317p.clearShadowLayer();
            this.f70318q.setColor(-1);
            this.f70318q.clearShadowLayer();
            int i32 = f70265e0;
            int i33 = f70268h0;
            int i34 = f70269i0;
            this.f70324w = (i33 / 2) + i32 + i34;
            int i35 = this.f70323v;
            this.f70325x = ((i35 - i32) - (i33 / 2)) - i34;
            this.f70326y = i32 + i34;
            this.f70327z = ((i35 - i32) - i33) - i34;
            this.f70272A = i32 + i33 + i34;
            this.f70273B = (i35 - i32) - i34;
            if (this.f70303c0) {
                int i36 = i32 + i33 + i34 + i32;
                this.f70276E = i36;
                this.f70274C = i36;
                if (!TextUtils.isEmpty(this.f70298a.f91011p) && !TextUtils.isEmpty(this.f70298a.f91015t)) {
                    String str3 = this.f70298a.f91011p;
                    C13704p1 c13704p14 = this.f70317p;
                    int i37 = (this.f70302c - this.f70274C) - i32;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.f70308g = AbstractC23214t.m119623j(str3, c13704p14, i37, 1, alignment);
                    this.f70275D = ((this.f70323v - i33) - i34) - AbstractC23222t7.f112558f;
                    this.f70309h = AbstractC23214t.m119623j(this.f70298a.f91015t, this.f70318q, (this.f70302c - this.f70276E) - i32, 1, alignment);
                    this.f70277F = this.f70275D + this.f70308g.getHeight();
                } else {
                    int i38 = this.f70323v - ((((i33 / 2) + i34) + i32) + AbstractC23222t7.f112558f);
                    this.f70275D = i38;
                    this.f70277F = i38;
                    this.f70309h = null;
                    this.f70308g = null;
                    if (!TextUtils.isEmpty(this.f70298a.f91011p)) {
                        this.f70308g = AbstractC23214t.m119623j(this.f70298a.f91011p, this.f70317p, (this.f70302c - this.f70274C) - i32, 1, Layout.Alignment.ALIGN_NORMAL);
                    } else if (!TextUtils.isEmpty(this.f70298a.f91015t)) {
                        this.f70309h = AbstractC23214t.m119623j(this.f70298a.f91015t, this.f70318q, (this.f70302c - this.f70276E) - i32, 1, Layout.Alignment.ALIGN_NORMAL);
                    }
                }
            } else {
                this.f70276E = i32;
                this.f70274C = i32;
                if (!TextUtils.isEmpty(this.f70298a.f91015t)) {
                    StaticLayout m119625l = AbstractC23214t.m119625l(this.f70298a.f91015t, this.f70318q, this.f70302c - (i32 * 2), 1);
                    this.f70309h = m119625l;
                    this.f70277F = (this.f70323v - i32) - m119625l.getHeight();
                } else {
                    this.f70309h = null;
                    this.f70277F = this.f70323v - i32;
                }
                if (!TextUtils.isEmpty(this.f70298a.f91011p)) {
                    StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f70298a.f91011p, this.f70317p, this.f70302c - (i32 * 2), 1);
                    this.f70308g = m119625l2;
                    this.f70275D = this.f70277F - m119625l2.getHeight();
                } else {
                    this.f70308g = null;
                    this.f70275D = this.f70277F;
                }
            }
        }
        if (this.f70281J == 2) {
            this.f70300b = this.f70278G + this.f70321t;
            return;
        }
        int i39 = this.f70322u + this.f70304d;
        this.f70278G = i39;
        this.f70300b = i39 + this.f70321t;
    }

    /* renamed from: n */
    public void m76232n() {
    }

    /* renamed from: o */
    public void m76233o() {
    }

    /* renamed from: p */
    public void m76234p(c cVar) {
        this.f70305d0 = cVar;
    }

    /* renamed from: q */
    public void m76235q(C17984n0 c17984n0) {
        try {
            if (this.f70298a != c17984n0 && c17984n0 != null) {
                this.f70298a = c17984n0;
                this.f70281J = c17984n0.f91080C;
                this.f70290S = false;
                this.f70292U = false;
                this.f70295X = null;
                this.f70294W = null;
                this.f70293V = null;
                for (int i11 = 0; i11 < this.f70298a.f91081D.size(); i11++) {
                    C25301c c25301c = (C25301c) this.f70298a.f91081D.get(i11);
                    if (c25301c.f121349c == 1) {
                        this.f70293V = c25301c;
                    } else if (this.f70294W == null) {
                        this.f70294W = c25301c;
                    } else if (this.f70295X == null) {
                        this.f70295X = c25301c;
                    }
                }
                if (this.f70302c > 0 && this.f70304d > 0) {
                    m76231m();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public void m76236r(boolean z11) {
        this.f70280I = z11;
    }

    /* renamed from: s */
    public void m76237s(int i11, int i12) {
        if (i11 != this.f70302c) {
            this.f70302c = i11;
            this.f70304d = i12;
            m76231m();
        }
    }
}
