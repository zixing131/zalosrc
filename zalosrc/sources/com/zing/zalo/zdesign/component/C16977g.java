package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import bi0.AbstractC2814h;
import ci0.C3532a;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import kd0.C21693c;
import kd0.C21697g;
import ki0.C21737e;
import ki0.C21740h;
import pm0.C24860q;
import ri0.C25807a;
import ti0.C26703b;
import ti0.C26705d;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.g */
/* loaded from: classes7.dex */
public final class C16977g extends C21737e implements InterfaceC16976f1 {

    /* renamed from: M0 */
    private C25807a f86772M0;

    /* renamed from: N0 */
    private C3532a f86773N0;

    /* renamed from: O0 */
    private C21693c f86774O0;

    /* renamed from: P0 */
    private C21697g f86775P0;

    /* renamed from: Q0 */
    private String f86776Q0;

    /* renamed from: R0 */
    private C0708i f86777R0;

    /* renamed from: com.zing.zalo.zdesign.component.g$a */
    /* loaded from: classes7.dex */
    public static final class a implements C3532a.a {
        a() {
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.g$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86779a;

        static {
            int[] iArr = new int[EnumC16991i.values().length];
            try {
                iArr[EnumC16991i.SYSTEM_STATUS_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16991i.SYSTEM_STATUS_DANGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16991i.CHAT_MENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86779a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16977g(Context context) {
        super(context);
        float m139649b;
        Typeface m76486a;
        AbstractC19074t.m100208f(context, "context");
        this.f86776Q0 = "";
        this.f86773N0 = new C3532a(new a());
        C21693c c21693c = new C21693c(context);
        this.f86774O0 = c21693c;
        c21693c.m89106L().m89028L(-2, -2).m89029M(15);
        C21740h c21740h = new C21740h(context);
        c21740h.mo75850g(true);
        C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_xxxxsmall_m);
        Float m137292s = m137293a.m137292s();
        if (m137292s != null) {
            m139649b = m137292s.floatValue();
        } else {
            m139649b = C27276c.m139649b(context, 10);
        }
        c21740h.mo111964L1(m139649b);
        C13694n1 m137282i = m137293a.m137282i();
        if (m137282i == null) {
            m76486a = Typeface.DEFAULT_BOLD;
        } else {
            m76486a = C13699o1.f70798a.m76486a(context, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h()));
        }
        c21740h.mo111966N1(m76486a);
        this.f86775P0 = c21740h;
        c21740h.m89106L().m89028L(-2, -2).m89029M(15).m89054h0(this.f86774O0);
        m89001g1(this.f86774O0);
        m89001g1(this.f86775P0);
        this.f86772M0 = new C25807a(new WeakReference(this));
    }

    /* renamed from: o1 */
    private final void m90977o1() {
        C24860q c24860q;
        C3532a c3532a = this.f86773N0;
        Drawable drawable = null;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c24860q = c3532a.m17896a(context);
        } else {
            c24860q = null;
        }
        if (c24860q != null) {
            drawable = (Drawable) c24860q.m129215c();
        }
        m89085A0(drawable);
        if (c24860q != null && ((Boolean) c24860q.m129216d()).booleanValue()) {
            m89106L().m89028L(m89094F().getIntrinsicWidth(), m89094F().getIntrinsicHeight());
        } else {
            m89106L().m89028L(-2, -2);
        }
    }

    /* renamed from: p1 */
    private final void m90978p1() {
        C16974f m17898c;
        m90977o1();
        C3532a c3532a = this.f86773N0;
        if (c3532a != null && (m17898c = c3532a.m17898c()) != null) {
            int i11 = 0;
            this.f86774O0.mo44614b1(0);
            this.f86775P0.mo44614b1(0);
            this.f86775P0.m111959G1(m17898c.m90957g());
            this.f86775P0.m111962J1(m17898c.m90958h());
            m89106L().m89040X(0).m89039W(0);
            C3532a c3532a2 = this.f86773N0;
            if (c3532a2 != null) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                i11 = c3532a2.m17899d(context);
            }
            if (m17898c.m90954d() != null) {
                m90979r1(m17898c, i11);
            } else {
                m90980s1(m17898c, i11);
            }
        }
    }

    /* renamed from: r1 */
    private final void m90979r1(C16974f c16974f, int i11) {
        Context context;
        int i12;
        C16718f m89106L = this.f86774O0.m89106L();
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        int m139649b = C27276c.m139649b(context2, c16974f.m90956f().m90985c());
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        m89106L.m89028L(m139649b, C27276c.m139649b(context3, c16974f.m90956f().m90985c()));
        if (c16974f.m90955e() != 0) {
            Drawable m90954d = c16974f.m90954d();
            AbstractC19074t.m100205c(m90954d);
            m90954d.setTint(c16974f.m90955e());
        }
        this.f86774O0.mo111925v1(c16974f.m90954d());
        if (c16974f.m90957g().length() > 0) {
            m89106L().m89029M(12).m89028L(-2, i11);
            C16718f m89027K = this.f86775P0.m89106L().m89027K(true);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            m89027K.m89044a0(C27276c.m139649b(context4, 1));
            this.f86774O0.m89106L().m89027K(true);
            if (!c16974f.m90964n()) {
                C16718f m89106L2 = this.f86775P0.m89106L();
                Context context5 = getContext();
                AbstractC19074t.m100207e(context5, "context");
                int m139649b2 = C27276c.m139649b(context5, 2);
                Context context6 = getContext();
                AbstractC19074t.m100207e(context6, "context");
                m89106L2.m89032P(m139649b2, 0, C27276c.m139649b(context6, 6), 0);
                return;
            }
            C16718f m89106L3 = this.f86774O0.m89106L();
            Context context7 = getContext();
            AbstractC19074t.m100207e(context7, "context");
            int m139649b3 = C27276c.m139649b(context7, 2);
            Context context8 = getContext();
            AbstractC19074t.m100207e(context8, "context");
            m89106L3.m89032P(m139649b3, 0, C27276c.m139649b(context8, 2), 0);
            C16718f m89106L4 = this.f86775P0.m89106L();
            Context context9 = getContext();
            AbstractC19074t.m100207e(context9, "context");
            int m139649b4 = C27276c.m139649b(context9, 0);
            Context context10 = getContext();
            AbstractC19074t.m100207e(context10, "context");
            m89106L4.m89032P(m139649b4, 0, C27276c.m139649b(context10, 8), 0);
            return;
        }
        this.f86775P0.mo44614b1(8);
        this.f86774O0.m89106L().m89025I(true);
        int i13 = b.f86779a[c16974f.m90961k().ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                m89106L().m89028L(i11, i11).m89029M(15);
                return;
            }
            if (c16974f.m90964n()) {
                context = getContext();
                AbstractC19074t.m100207e(context, "context");
                i12 = 24;
            } else {
                context = getContext();
                AbstractC19074t.m100207e(context, "context");
                i12 = 20;
            }
            m89106L().m89028L(C27276c.m139649b(context, i12), i11);
            return;
        }
        C16718f m89106L5 = this.f86774O0.m89106L();
        Context context11 = getContext();
        AbstractC19074t.m100207e(context11, "context");
        m89106L5.m89036T(C27276c.m139649b(context11, 1));
    }

    /* renamed from: s1 */
    private final void m90980s1(C16974f c16974f, int i11) {
        int m139649b;
        this.f86774O0.mo44614b1(8);
        if (c16974f.m90957g().length() > 0) {
            m89106L().m89028L(-2, i11).m89029M(15);
            C16718f m89032P = this.f86775P0.m89106L().m89025I(true).m89032P(0, 0, 0, 0);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            m89032P.m89044a0(C27276c.m139649b(context, 1));
            EnumC16991i m90961k = c16974f.m90961k();
            EnumC16991i enumC16991i = EnumC16991i.CHAT_NUMBER;
            if (m90961k == enumC16991i) {
                C16718f m89106L = this.f86775P0.m89106L();
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                m89106L.m89044a0(C27276c.m139649b(context2, 0));
            }
            if (c16974f.m90957g().length() == 1) {
                if (c16974f.m90961k() == enumC16991i) {
                    C16718f m89106L2 = m89106L();
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    C16718f m89039W = m89106L2.m89039W(C27276c.m139649b(context3, 16));
                    if (c16974f.m90964n()) {
                        Context context4 = getContext();
                        AbstractC19074t.m100207e(context4, "context");
                        m139649b = C27276c.m139649b(context4, 24);
                    } else {
                        Context context5 = getContext();
                        AbstractC19074t.m100207e(context5, "context");
                        m139649b = C27276c.m139649b(context5, 20);
                    }
                    m89039W.m89040X(m139649b).m89029M(15);
                } else {
                    m89106L().m89028L(i11, i11).m89029M(15);
                }
            } else if (!c16974f.m90964n()) {
                if (c16974f.m90961k() == enumC16991i) {
                    C16718f m89106L3 = this.f86775P0.m89106L();
                    Context context6 = getContext();
                    AbstractC19074t.m100207e(context6, "context");
                    int m139649b2 = C27276c.m139649b(context6, 4);
                    Context context7 = getContext();
                    AbstractC19074t.m100207e(context7, "context");
                    m89106L3.m89032P(m139649b2, 0, C27276c.m139649b(context7, 4), 0);
                } else {
                    C16718f m89106L4 = this.f86775P0.m89106L();
                    Context context8 = getContext();
                    AbstractC19074t.m100207e(context8, "context");
                    int m139649b3 = C27276c.m139649b(context8, 6);
                    Context context9 = getContext();
                    AbstractC19074t.m100207e(context9, "context");
                    m89106L4.m89032P(m139649b3, 0, C27276c.m139649b(context9, 6), 0);
                }
            } else if (c16974f.m90961k() == enumC16991i) {
                C16718f m89106L5 = this.f86775P0.m89106L();
                Context context10 = getContext();
                AbstractC19074t.m100207e(context10, "context");
                int m139649b4 = C27276c.m139649b(context10, 6);
                Context context11 = getContext();
                AbstractC19074t.m100207e(context11, "context");
                m89106L5.m89032P(m139649b4, 0, C27276c.m139649b(context11, 6), 0);
            } else {
                C16718f m89106L6 = this.f86775P0.m89106L();
                Context context12 = getContext();
                AbstractC19074t.m100207e(context12, "context");
                int m139649b5 = C27276c.m139649b(context12, 8);
                Context context13 = getContext();
                AbstractC19074t.m100207e(context13, "context");
                m89106L6.m89032P(m139649b5, 0, C27276c.m139649b(context13, 8), 0);
            }
            this.f86775P0.m111959G1(c16974f.m90957g());
            this.f86775P0.m111962J1(c16974f.m90958h());
            return;
        }
        this.f86775P0.mo44614b1(8);
        m89106L().m89028L(i11, i11);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f86772M0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "drawable");
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        C3532a c3532a = this.f86773N0;
        if (c3532a != null) {
            c3532a.m17897b(canvas, m89114P(), m89112O());
        }
    }

    /* renamed from: q1 */
    public final C16974f m90981q1() {
        C3532a c3532a = this.f86773N0;
        if (c3532a != null) {
            return c3532a.m17898c();
        }
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f86772M0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f86772M0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }

    /* renamed from: t1 */
    public final void m90982t1(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "text");
        C3532a c3532a = this.f86773N0;
        if (c3532a != null) {
            c3532a.m17901g(charSequence);
        }
        m90978p1();
    }

    /* renamed from: u1 */
    public final void m90983u1(C16974f c16974f) {
        AbstractC19074t.m100208f(c16974f, "config");
        C3532a c3532a = this.f86773N0;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c3532a.m17903i(context, c16974f);
        }
        this.f86776Q0 = c16974f.m90960j();
        this.f86777R0 = c16974f.m90959i();
        if (this.f86776Q0.length() > 0) {
            setIdTracking(this.f86776Q0);
            setTrackingExtraData(this.f86777R0);
        }
        m90978p1();
        requestLayout();
    }
}
