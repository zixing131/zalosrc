package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Size;
import bi0.AbstractC2807a;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17994q1;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C32027n;
import vg.C28203u6;

/* renamed from: com.zing.zalo.ui.widget.c3 */
/* loaded from: classes6.dex */
public final class C13574c3 {

    /* renamed from: A */
    private String f69931A;

    /* renamed from: B */
    private Drawable f69932B;

    /* renamed from: C */
    private C3977j f69933C;

    /* renamed from: D */
    private String f69934D;

    /* renamed from: E */
    private boolean f69935E;

    /* renamed from: F */
    private final Drawable f69936F;

    /* renamed from: a */
    private final Context f69937a;

    /* renamed from: b */
    private a f69938b;

    /* renamed from: c */
    private C17945a0 f69939c;

    /* renamed from: d */
    private int f69940d;

    /* renamed from: e */
    private int f69941e;

    /* renamed from: f */
    private int f69942f;

    /* renamed from: g */
    private int f69943g;

    /* renamed from: h */
    private int f69944h;

    /* renamed from: i */
    private int f69945i;

    /* renamed from: j */
    private int f69946j;

    /* renamed from: k */
    private int f69947k;

    /* renamed from: l */
    private int f69948l;

    /* renamed from: m */
    private int f69949m;

    /* renamed from: n */
    private int f69950n;

    /* renamed from: o */
    private int f69951o;

    /* renamed from: p */
    private int f69952p;

    /* renamed from: q */
    private int f69953q;

    /* renamed from: r */
    private int f69954r;

    /* renamed from: s */
    private int f69955s;

    /* renamed from: t */
    private int f69956t;

    /* renamed from: u */
    private int f69957u;

    /* renamed from: v */
    private int f69958v;

    /* renamed from: w */
    private C13704p1 f69959w;

    /* renamed from: x */
    private C13704p1 f69960x;

    /* renamed from: y */
    private StaticLayout f69961y;

    /* renamed from: z */
    private StaticLayout f69962z;

    /* renamed from: com.zing.zalo.ui.widget.c3$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo61133a(String str);

        /* renamed from: b */
        void mo61134b(int i11, int i12, int i13, int i14);
    }

    /* renamed from: com.zing.zalo.ui.widget.c3$b */
    /* loaded from: classes6.dex */
    public static final class b extends C23999j {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (C13574c3.this.m76050j() != null && TextUtils.equals(str, C13574c3.this.m76053m())) {
                    if (c3979l != null) {
                        bitmap = c3979l.m18839c();
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null && (c3979l.m18839c().getWidth() != 1 || c3979l.m18839c().getHeight() != 1)) {
                        C13574c3.this.m76063z(true);
                        C13574c3.this.m76048h().setImageInfo(c3979l, false);
                        if (c23995f.m125666q() == 4) {
                            C13574c3.this.m76062y(new BitmapDrawable(C13574c3.this.m76046f().getResources(), c3979l.m18839c()));
                        } else {
                            C13574c3.this.m76062y(new TransitionDrawable(new Drawable[]{C13574c3.this.m76055o(), new BitmapDrawable(C13574c3.this.m76046f().getResources(), c3979l.m18839c())}));
                            Drawable m76051k = C13574c3.this.m76051k();
                            AbstractC19074t.m100206d(m76051k, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                            ((TransitionDrawable) m76051k).setCrossFadeEnabled(true);
                            Drawable m76051k2 = C13574c3.this.m76051k();
                            AbstractC19074t.m100206d(m76051k2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                            ((TransitionDrawable) m76051k2).startTransition(100);
                        }
                    } else {
                        C13574c3 c13574c3 = C13574c3.this;
                        c13574c3.m76062y(c13574c3.m76055o());
                    }
                    C13574c3.this.m76047g().mo61134b(C13574c3.this.m76057q(), C13574c3.this.m76058r(), C13574c3.this.m76057q() + C13574c3.this.m76052l(), C13574c3.this.m76058r() + C13574c3.this.m76052l());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C13574c3(Context context, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "delegate");
        this.f69937a = context;
        this.f69938b = aVar;
        int i11 = AbstractC23222t7.f112566j;
        this.f69951o = i11;
        this.f69952p = i11;
        this.f69953q = i11;
        this.f69954r = AbstractC23222t7.f112576o;
        this.f69955s = AbstractC23222t7.f112556e;
        int i12 = AbstractC23222t7.f112586t;
        this.f69956t = i12;
        this.f69957u = i12;
        this.f69958v = AbstractC23222t7.f112576o;
        this.f69931A = "";
        this.f69933C = new C3977j(context);
        this.f69934D = "";
        this.f69936F = C23278z2.m120143n().f116261b;
        m76039s();
    }

    /* renamed from: B */
    private final boolean m76036B() {
        return !TextUtils.isEmpty(this.f69934D);
    }

    /* renamed from: b */
    private final void m76037b() {
        Number number;
        int m62528Q0 = AbstractC11531v0.Companion.m62528Q0() - (this.f69954r + this.f69952p);
        StaticLayout m119625l = AbstractC23214t.m119625l(TextUtils.ellipsize(AbstractC23136l9.m118743r0(AbstractC8020f0.str_from), this.f69960x, m62528Q0, TextUtils.TruncateAt.END), this.f69960x, m62528Q0, 1);
        this.f69962z = m119625l;
        if (m119625l != null) {
            number = Float.valueOf(m119625l.getLineWidth(0));
        } else {
            number = 0;
        }
        this.f69945i = number.intValue();
    }

    /* renamed from: c */
    private final void m76038c(int i11) {
        float f11;
        m76037b();
        if (!TextUtils.isEmpty(this.f69931A)) {
            int i12 = i11 - (((((this.f69954r + this.f69952p) + (this.f69955s * 3)) + this.f69956t) + this.f69945i) + this.f69957u);
            StaticLayout m119625l = AbstractC23214t.m119625l(TextUtils.ellipsize(this.f69931A, this.f69959w, i12, TextUtils.TruncateAt.END), this.f69959w, i12, 1);
            this.f69961y = m119625l;
            if (m119625l != null) {
                AbstractC19074t.m100205c(m119625l);
                f11 = m119625l.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.f69948l = (int) f11;
            return;
        }
        this.f69961y = null;
    }

    /* renamed from: s */
    private final void m76039s() {
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.m76612b(7);
        c13704p1.setColor(C23212s8.m119607o(this.f69937a, AbstractC2807a.text_01));
        c13704p1.setTextSize(this.f69958v);
        this.f69959w = c13704p1;
        C13704p1 c13704p12 = new C13704p1(1);
        c13704p12.m76612b(5);
        c13704p12.setColor(C23212s8.m119607o(this.f69937a, AbstractC2807a.text_02));
        c13704p12.setTextSize(this.f69958v);
        this.f69960x = c13704p12;
    }

    /* renamed from: u */
    private final void m76040u(boolean z11, C23528a c23528a) {
        try {
            AbstractC3972e.m18781f0(this.f69933C);
            Drawable drawable = this.f69936F;
            this.f69932B = drawable;
            this.f69933C.setImageDrawable(drawable);
            if (!m76036B()) {
                return;
            }
            if (!z11 && !C23999j.m125696L2(this.f69934D, C23278z2.m120143n())) {
                return;
            }
            ((C23528a) c23528a.m123612r(this.f69933C)).m123579C(this.f69934D, C23278z2.m120143n(), new b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    private final void m76041v() {
        C17994q1 m95239r4;
        C32027n c32027n;
        this.f69931A = "";
        C17945a0 c17945a0 = this.f69939c;
        if (c17945a0 != null && (m95239r4 = c17945a0.m95239r4()) != null && (c32027n = m95239r4.f91143e) != null) {
            String valueOf = String.valueOf(c32027n.m154472m());
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, valueOf, false, 2, null);
            if (m141800i != null) {
                String m40383Q = m141800i.m40383Q(true, false);
                AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                this.f69931A = m40383Q;
                String str = m141800i.f42446v;
                AbstractC19074t.m100207e(str, "avt");
                this.f69934D = str;
                return;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            this.f69931A = m118743r0;
            this.f69934D = "";
            this.f69938b.mo61133a(valueOf);
        }
    }

    /* renamed from: A */
    public final void m76042A(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        this.f69939c = c17945a0;
        m76041v();
    }

    /* renamed from: a */
    public final void m76043a(boolean z11, C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        if (!this.f69935E) {
            m76040u(z11, c23528a);
        }
    }

    /* renamed from: d */
    public final void m76044d(Canvas canvas) {
        StaticLayout staticLayout;
        int i11;
        Drawable drawable;
        StaticLayout staticLayout2;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f69943g >= 0 && this.f69944h >= 0 && (staticLayout2 = this.f69962z) != null) {
            canvas.save();
            canvas.translate(this.f69943g, this.f69944h);
            staticLayout2.draw(canvas);
            canvas.restore();
        }
        int i12 = this.f69940d;
        if (i12 >= 0 && (i11 = this.f69941e) >= 0 && (drawable = this.f69932B) != null) {
            int i13 = this.f69956t;
            drawable.setBounds(i12, i11, i12 + i13, i13 + i11);
            drawable.draw(canvas);
        }
        if (this.f69946j >= 0 && this.f69947k >= 0 && (staticLayout = this.f69961y) != null) {
            canvas.save();
            canvas.translate(this.f69946j, this.f69947k);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        if (this.f69949m >= 0 && this.f69950n >= 0) {
            canvas.save();
            Drawable m62548X = AbstractC11531v0.Companion.m62548X();
            if (m62548X != null) {
                int i14 = this.f69949m;
                int i15 = this.f69950n;
                int i16 = this.f69957u;
                m62548X.setBounds(i14, i15, i14 + i16, i16 + i15);
            }
            if (m62548X != null) {
                m62548X.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: e */
    public final int m76045e() {
        return this.f69941e + this.f69956t + this.f69953q;
    }

    /* renamed from: f */
    public final Context m76046f() {
        return this.f69937a;
    }

    /* renamed from: g */
    public final a m76047g() {
        return this.f69938b;
    }

    /* renamed from: h */
    public final C3977j m76048h() {
        return this.f69933C;
    }

    /* renamed from: i */
    public final int m76049i() {
        return this.f69943g - this.f69954r;
    }

    /* renamed from: j */
    public final C17945a0 m76050j() {
        return this.f69939c;
    }

    /* renamed from: k */
    public final Drawable m76051k() {
        return this.f69932B;
    }

    /* renamed from: l */
    public final int m76052l() {
        return this.f69956t;
    }

    /* renamed from: m */
    public final String m76053m() {
        return this.f69934D;
    }

    /* renamed from: n */
    public final int m76054n() {
        return this.f69949m + this.f69957u + this.f69952p;
    }

    /* renamed from: o */
    public final Drawable m76055o() {
        return this.f69936F;
    }

    /* renamed from: p */
    public final int m76056p() {
        return this.f69944h - this.f69951o;
    }

    /* renamed from: q */
    public final int m76057q() {
        return this.f69940d;
    }

    /* renamed from: r */
    public final int m76058r() {
        return this.f69941e;
    }

    /* renamed from: t */
    public final int m76059t(int i11, int i12, int i13) {
        int i14 = i12 + this.f69954r;
        this.f69943g = i14;
        int i15 = this.f69951o;
        int i16 = this.f69956t;
        int i17 = this.f69958v;
        this.f69944h = i13 + i15 + ((i16 - i17) / 2);
        int i18 = this.f69955s;
        int i19 = i14 + i18 + this.f69945i;
        this.f69940d = i19;
        int i21 = i13 + i15;
        this.f69941e = i21;
        int i22 = i19 + i18 + i16;
        this.f69946j = i22;
        this.f69947k = ((i16 - i17) / 2) + i21;
        this.f69949m = i22 + this.f69948l;
        this.f69950n = i21 + AbstractC23222t7.f112550b;
        int i23 = this.f69953q;
        this.f69942f = i11 + i16 + i15 + i23;
        return i16 + i15 + i23;
    }

    /* renamed from: w */
    public final Size m76060w(int i11, int i12) {
        this.f69953q = AbstractC23136l9.m118742r(8.0f) - i11;
        m76038c(i12);
        int i13 = this.f69954r + this.f69952p + this.f69945i;
        int i14 = this.f69955s;
        int i15 = this.f69956t;
        return new Size(i13 + i14 + i15 + i14 + this.f69948l + i14 + this.f69957u, i15 + this.f69951o + this.f69953q);
    }

    /* renamed from: x */
    public final void m76061x() {
        this.f69940d = -1;
        this.f69941e = -1;
        this.f69942f = 0;
        this.f69943g = -1;
        this.f69944h = -1;
        this.f69945i = 0;
        this.f69946j = -1;
        this.f69947k = -1;
        this.f69948l = 0;
        this.f69949m = -1;
        this.f69950n = -1;
        this.f69961y = null;
        this.f69962z = null;
        this.f69931A = "";
        this.f69932B = null;
        this.f69933C = new C3977j(this.f69937a);
        this.f69934D = "";
        this.f69935E = false;
    }

    /* renamed from: y */
    public final void m76062y(Drawable drawable) {
        this.f69932B = drawable;
    }

    /* renamed from: z */
    public final void m76063z(boolean z11) {
        this.f69935E = z11;
    }
}
