package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ao.InterfaceC2259a;
import bi0.AbstractC2814h;
import bo.AbstractC3059y0;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3039t0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.components.C8406v1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import id0.C20516b;
import id0.C20517c;
import is.AbstractC20826v0;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p109ds.C18065d;
import p167fs.C19136a;
import p167fs.C19140e;
import p175g0.AbstractC19178a;
import p361nb.AbstractC23647d;
import p691yr.AbstractC31062l;
import p691yr.AbstractC31064n;
import p691yr.C31060j;
import p691yr.C31063m;
import p716zh.C32002l4;
import p726zr.C32546b;
import ti0.C26705d;
import ti0.C26707f;
import vl0.AbstractC28291a;

/* renamed from: com.zing.zalo.feed.components.l1 */
/* loaded from: classes4.dex */
public class C8323l1 extends C16716d implements C16719g.c, C16719g.d {

    /* renamed from: n1 */
    public static final int f45469n1 = AbstractC23222t7.f112572m;

    /* renamed from: o1 */
    public static final int f45470o1 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item);

    /* renamed from: p1 */
    public static final int f45471p1 = AbstractC23222t7.f112534M;

    /* renamed from: M0 */
    private String f45472M0;

    /* renamed from: N0 */
    int f45473N0;

    /* renamed from: O0 */
    Handler f45474O0;

    /* renamed from: P0 */
    C20517c f45475P0;

    /* renamed from: Q0 */
    C16716d f45476Q0;

    /* renamed from: R0 */
    C16719g f45477R0;

    /* renamed from: S0 */
    C16719g f45478S0;

    /* renamed from: T0 */
    C16716d f45479T0;

    /* renamed from: U0 */
    C8240b6 f45480U0;

    /* renamed from: V0 */
    C22126c0 f45481V0;

    /* renamed from: W0 */
    C16716d f45482W0;

    /* renamed from: X0 */
    C21693c f45483X0;

    /* renamed from: Y0 */
    C16716d f45484Y0;

    /* renamed from: Z0 */
    C22126c0 f45485Z0;

    /* renamed from: a1 */
    C21693c f45486a1;

    /* renamed from: b1 */
    private C21693c f45487b1;

    /* renamed from: c1 */
    C22122a0 f45488c1;

    /* renamed from: d1 */
    C22122a0 f45489d1;

    /* renamed from: e1 */
    C16719g f45490e1;

    /* renamed from: f1 */
    C22126c0 f45491f1;

    /* renamed from: g1 */
    C8406v1.a f45492g1;

    /* renamed from: h1 */
    C18065d f45493h1;

    /* renamed from: i1 */
    InterfaceC2259a f45494i1;

    /* renamed from: j1 */
    C3000l0 f45495j1;

    /* renamed from: k1 */
    int f45496k1;

    /* renamed from: l1 */
    boolean f45497l1;

    /* renamed from: m1 */
    private boolean f45498m1;

    public C8323l1(Context context) {
        super(context);
        this.f45472M0 = "";
        this.f45481V0 = new C22126c0(getContext());
        this.f45498m1 = false;
    }

    /* renamed from: A1 */
    private void m44738A1(Context context) {
        C16716d c16716d = new C16716d(context);
        this.f45484Y0 = c16716d;
        c16716d.m89106L().m89028L(-1, AbstractC23222t7.f112528I).m89054h0(this.f45479T0);
        this.f45484Y0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_rounded_border_comment));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f45485Z0 = c22126c0;
        c22126c0.m89106L().m89060k0(-1).m89030N(-1).m89073z(Boolean.TRUE).m89029M(12).m89034R(AbstractC23222t7.f112586t).m89027K(true);
        this.f45485Z0.m111953A1(1);
        this.f45485Z0.m111980v1(TextUtils.TruncateAt.END);
        this.f45485Z0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_default_text));
        new C26707f(this.f45485Z0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_small));
        this.f45485Z0.m111962J1(C23212s8.m119607o(context, AbstractC28291a.text_tertiary));
        this.f45484Y0.m89001g1(this.f45485Z0);
    }

    /* renamed from: B1 */
    private void m44739B1(Context context) {
        C16716d c16716d = new C16716d(context);
        this.f45482W0 = c16716d;
        c16716d.m89106L().m89028L(-2, -2).m89042Z(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e).m89027K(true).m89054h0(this.f45479T0);
        C21693c c21693c = new C21693c(context);
        this.f45483X0 = c21693c;
        c21693c.m89106L().m89028L(m44758t1(), m44758t1()).m89027K(true);
        this.f45482W0.m89001g1(this.f45483X0);
        AbstractC31062l m150961a = C31063m.f143208a.m150961a(getContext(), C31060j.f143193a.m150937S(this.f45473N0));
        this.f45482W0.m89085A0(AbstractC31064n.m150965a(m150961a));
        this.f45483X0.mo111925v1(m150961a.m150959c());
    }

    /* renamed from: C1 */
    private void m44740C1(Context context) {
        boolean z11;
        C16716d c16716d;
        m44739B1(context);
        m44738A1(context);
        if (this.f45473N0 != 0 && !m44750O1()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (C31060j.m150913U() && z11) {
            this.f45476Q0.m89001g1(this.f45484Y0);
            c16716d = this.f45484Y0;
        } else {
            this.f45476Q0.m89001g1(this.f45482W0);
            c16716d = this.f45482W0;
        }
        if (c16716d != null) {
            int i11 = this.f45473N0;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 11) {
                        if (i11 != 12) {
                            c16716d.m89106L().m89046b0(AbstractC20826v0.f102351a).m89047c0(AbstractC20826v0.f102352b);
                            return;
                        }
                    } else {
                        c16716d.mo44614b1(8);
                        return;
                    }
                } else {
                    c16716d.m89106L().m89023G(null).m89034R(AbstractC23222t7.f112562h);
                    return;
                }
            }
            c16716d.m89106L().m89032P(AbstractC23222t7.f112566j, AbstractC23222t7.f112576o, AbstractC23222t7.f112582r, AbstractC23222t7.f112576o);
        }
    }

    /* renamed from: D1 */
    private void m44741D1(Context context) {
        C16719g c16719g = new C16719g(this.f84786r);
        this.f45490e1 = c16719g;
        c16719g.m89106L().m89060k0(-1);
        this.f45490e1.m89106L().m89030N(AbstractC23136l9.m118742r(10.0f));
        this.f45490e1.m89106L().m89023G(this.f45477R0);
        m89001g1(this.f45490e1);
    }

    /* renamed from: E1 */
    private void m44742E1(Context context) {
        C22122a0 c22122a0 = new C22122a0(this.f84786r);
        this.f45489d1 = c22122a0;
        c22122a0.m89106L().m89060k0(-2);
        this.f45489d1.m89106L().m89030N(-1);
        this.f45489d1.m89106L().m89049e0(this.f45486a1);
        this.f45489d1.m89106L().m89046b0(AbstractC23136l9.m118742r(8.0f));
        this.f45489d1.m89106L().m89048d0(AbstractC23136l9.m118742r(4.0f));
        this.f45489d1.m89106L().m89047c0(AbstractC23136l9.m118742r(8.0f));
        this.f45489d1.m89106L().m89044a0(AbstractC23136l9.m118742r(4.0f));
        this.f45489d1.mo111926w1(AbstractC16803z.icn_profile_message_feed);
        this.f45489d1.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
        this.f45489d1.mo44614b1(0);
        this.f45476Q0.m89001g1(this.f45489d1);
    }

    /* renamed from: F1 */
    private void m44743F1(Context context, int i11) {
        m44745H1(context);
        m44740C1(context);
        m44749L1(context);
        m44746I1(context);
        m44748K1(context);
        mo44764N1(context);
    }

    /* renamed from: G1 */
    private void m44744G1(Context context, int i11) {
        m44763M1();
        m44745H1(context);
        m44740C1(context);
        m44749L1(context);
        m44761y1(context);
        m44742E1(context);
        if (!this.f45498m1) {
            m44747J1();
        }
        m44741D1(context);
        m44762z1(context);
        m44746I1(context);
        m44748K1(context);
    }

    /* renamed from: H1 */
    private void m44745H1(Context context) {
        C16716d c16716d = new C16716d(context);
        this.f45479T0 = c16716d;
        C16718f m89042Z = c16716d.m89106L().m89028L(-2, AbstractC23222t7.f112528I).m89042Z(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
        Boolean bool = Boolean.TRUE;
        m89042Z.m89073z(bool).m89027K(true);
        this.f45479T0.m89101I0(AbstractC6918a0.like_touch_delegate);
        this.f45479T0.m89007n1(false);
        this.f45479T0.mo89109M0(this);
        this.f45479T0.m89111N0(this);
        this.f45480U0 = new C8240b6(context, this.f45473N0);
        int m44758t1 = m44758t1();
        this.f45480U0.m89106L().m89028L(m44758t1, m44758t1).m89027K(true).m89073z(bool);
        this.f45480U0.m44635B1();
        this.f45479T0.m89001g1(this.f45480U0);
        this.f45476Q0.m89001g1(this.f45479T0);
        C31060j c31060j = C31060j.f143193a;
        if (c31060j.m150936O(this.f45473N0)) {
            this.f45481V0.m89106L().m89028L(-2, -2).m89054h0(this.f45480U0).m89034R(AbstractC23222t7.f112556e).m89027K(true);
            this.f45481V0.m111959G1(AbstractC23136l9.m118749t0(context, AbstractC8020f0.str_feed_reaction_default_emoji_heart_text));
            new C26707f(this.f45481V0).m137318a(C19140e.f95172a.m100454d(context));
            this.f45481V0.m111962J1(c31060j.m150932I(0, context, this.f45473N0));
            this.f45479T0.m89001g1(this.f45481V0);
        }
        int i11 = this.f45473N0;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 11) {
                    if (i11 != 12) {
                        this.f45479T0.m89106L().m89046b0(AbstractC20826v0.f102351a).m89047c0(AbstractC20826v0.f102352b);
                    }
                } else {
                    this.f45479T0.mo44614b1(8);
                }
            } else {
                this.f45479T0.m89106L().m89034R(f45470o1).m89023G(null);
            }
            this.f45480U0.m44636E1(false, 0);
            this.f45479T0.m89085A0(c31060j.m150940f(0, getContext(), this.f45473N0));
        }
        C16718f m89106L = this.f45479T0.m89106L();
        int i12 = AbstractC23222t7.f112582r;
        int i13 = AbstractC23222t7.f112576o;
        m89106L.m89032P(i12, i13, 0, i13);
        this.f45480U0.m44636E1(false, 0);
        this.f45479T0.m89085A0(c31060j.m150940f(0, getContext(), this.f45473N0));
    }

    /* renamed from: I1 */
    private void m44746I1(Context context) {
        C16719g c16719g = new C16719g(context);
        this.f45478S0 = c16719g;
        c16719g.m89106L().m89028L(-1, -1);
        if (m44765P1()) {
            this.f45478S0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
            this.f45478S0.m89085A0(m44757r1());
        } else {
            this.f45478S0.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.feed_overlay));
        }
        this.f45478S0.mo44614b1(8);
        m89001g1(this.f45478S0);
    }

    /* renamed from: J1 */
    private void m44747J1() {
        C21693c c21693c = new C21693c(this.f84786r);
        this.f45487b1 = c21693c;
        c21693c.m89101I0(AbstractC6918a0.tvPrivacyInfo);
        this.f45487b1.m89106L().m89028L(-2, -1).m89046b0(AbstractC20826v0.f102351a / 2).m89047c0(AbstractC20826v0.f102352b / 2).m89027K(true).m89029M(15).m89049e0(this.f45486a1);
        this.f45487b1.mo44614b1(8);
        this.f45487b1.m89087B0(C23212s8.m119610r(AbstractC19178a.selectableItemBackground));
        this.f45476Q0.m89001g1(this.f45487b1);
    }

    /* renamed from: K1 */
    private void m44748K1(Context context) {
        int i11;
        int i12;
        C18065d c18065d = new C18065d(context, this.f45473N0);
        this.f45493h1 = c18065d;
        C16718f m89066s = c18065d.m89106L().m89030N(f45471p1).m89060k0(-1).m89073z(Boolean.TRUE).m89066s(this.f45476Q0);
        if (this.f45473N0 == 2) {
            i11 = AbstractC23222t7.f112518D;
        } else {
            i11 = AbstractC20826v0.f102352b;
        }
        C16718f m89034R = m89066s.m89035S(i11).m89034R(m44759u1(this.f45473N0));
        if (this.f45473N0 == 11) {
            i12 = 0;
        } else {
            i12 = AbstractC23222t7.f112576o;
        }
        m89034R.m89048d0(i12).m89027K(true);
        if (this.f45473N0 == 11) {
            this.f45493h1.m96051u1();
            this.f45493h1.m96054z1();
        }
        m89001g1(this.f45493h1);
    }

    /* renamed from: L1 */
    private void m44749L1(Context context) {
        C21693c c21693c = new C21693c(context);
        this.f45486a1 = c21693c;
        C16718f m89046b0 = c21693c.m89106L().m89028L(-2, -1).m89046b0(AbstractC20826v0.f102351a / 2);
        int i11 = AbstractC20826v0.f102352b;
        m89046b0.m89047c0(i11 / 2).m89027K(true).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile) + (i11 / 2)).m89029M(15).m89017A(Boolean.TRUE);
        this.f45486a1.m89087B0(C23212s8.m119610r(AbstractC19178a.selectableItemBackground));
        this.f45476Q0.m89001g1(this.f45486a1);
        this.f45486a1.mo111926w1(AbstractC16803z.button_option_menu);
    }

    /* renamed from: O1 */
    private boolean m44750O1() {
        int i11 = this.f45473N0;
        return i11 == 12 || i11 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m44751Q1(C3020p0 c3020p0, C16719g c16719g) {
        ContactProfile m118084d = AbstractC23028c0.m118084d(c3020p0.f12022B.f12280b);
        InterfaceC2259a interfaceC2259a = this.f45494i1;
        if (interfaceC2259a != null && m118084d != null) {
            interfaceC2259a.mo11959k0(m118084d);
            AbstractC23647d.m123897g("4914003");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public static /* synthetic */ void m44752R1(C3020p0 c3020p0, boolean z11, InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        String str;
        if (!c3020p0.m14493X()) {
            if (z11) {
                str = "6516";
            } else {
                str = "490201";
            }
            AbstractC23647d.m123906p(str);
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11948c1(c3020p0);
            }
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: b2 */
    private void m44753b2(C3020p0 c3020p0) {
        boolean z11;
        if (this.f45493h1 != null) {
            int i11 = this.f45473N0;
            boolean z12 = true;
            if (i11 != 0 && i11 != 11 && !m44750O1() && this.f45473N0 != 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (c3020p0 == null || c3020p0.f12025E == null) {
                z12 = false;
            }
            if (z11 && z12) {
                C3039t0 c3039t0 = c3020p0.f12025E;
                if (c3039t0.f12244b <= 0 && c3039t0.f12243a <= 0) {
                    this.f45493h1.mo44614b1(8);
                    return;
                } else {
                    this.f45493h1.m96048C1(c3020p0);
                    return;
                }
            }
            this.f45493h1.mo44614b1(8);
        }
    }

    /* renamed from: q1 */
    private Drawable m44756q1() {
        return AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed_profile_bottom);
    }

    /* renamed from: r1 */
    private Drawable m44757r1() {
        return AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed_profile_bottom_overlay);
    }

    /* renamed from: t1 */
    private int m44758t1() {
        return AbstractC23222t7.f112514B;
    }

    /* renamed from: u1 */
    private int m44759u1(int i11) {
        if (i11 != 2) {
            if (i11 != 11) {
                return AbstractC20826v0.f102351a;
            }
            return AbstractC23222t7.f112576o;
        }
        return f45470o1;
    }

    /* renamed from: x1 */
    private void m44760x1() {
        int i11 = this.f45473N0;
        if (i11 == 2 || i11 == 3) {
            C16719g c16719g = new C16719g(getContext());
            c16719g.m89085A0(m44756q1());
            c16719g.m89106L().m89028L(-1, -1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
            m89001g1(c16719g);
        }
    }

    /* renamed from: y1 */
    private void m44761y1(Context context) {
        C22122a0 c22122a0 = new C22122a0(this.f84786r);
        this.f45488c1 = c22122a0;
        c22122a0.m89106L().m89060k0(-2);
        this.f45488c1.m89106L().m89030N(-1);
        this.f45488c1.m89106L().m89054h0(this.f45482W0);
        this.f45488c1.m89106L().m89046b0(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile));
        this.f45488c1.m89106L().m89044a0(AbstractC23136l9.m118742r(2.0f));
        this.f45488c1.mo111926w1(AbstractC16803z.bg_feed_share);
        this.f45488c1.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
        this.f45488c1.mo44614b1(8);
        this.f45476Q0.m89001g1(this.f45488c1);
    }

    /* renamed from: z1 */
    private void m44762z1(Context context) {
        C22126c0 c22126c0 = new C22126c0(this.f84786r);
        this.f45491f1 = c22126c0;
        AbstractC20826v0.m108823n(AbstractC20826v0.k.ROBOTO_F7, c22126c0);
        this.f45491f1.m89106L().m89060k0(-1);
        this.f45491f1.m89106L().m89030N(AbstractC23136l9.m118742r(45.0f));
        this.f45491f1.m89087B0(AbstractC16803z.rectangle_white);
        this.f45491f1.m89106L().m89023G(this.f45476Q0);
        this.f45491f1.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_more_action));
        this.f45491f1.m111963K1(AbstractC23136l9.m118645D(context, AbstractC16803z.bg_view_more_action_text));
        this.f45491f1.m89106L().m89029M(15);
        this.f45491f1.mo44614b1(8);
        m89001g1(this.f45491f1);
    }

    /* renamed from: M1 */
    public void m44763M1() {
        C8406v1.a aVar = new C8406v1.a(this.f84786r);
        this.f45492g1 = aVar;
        aVar.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_timebar_marginleft));
        m89001g1(this.f45492g1);
    }

    /* renamed from: N1 */
    public void mo44764N1(Context context) {
        C16719g c16719g = new C16719g(context);
        this.f45477R0 = c16719g;
        c16719g.m89106L().m89028L(-1, 1);
        this.f45477R0.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        m89001g1(this.f45477R0);
        if (m44765P1()) {
            this.f45477R0.m89106L().m89034R(f45470o1).m89035S(AbstractC20826v0.f102352b).m89023G(this.f45476Q0);
            this.f45477R0.m89106L().m89023G(this.f45476Q0);
        } else if (this.f45473N0 != 0 && !m44750O1()) {
            this.f45477R0.m89106L().m89018B(Boolean.TRUE);
        } else {
            this.f45477R0.m89106L().m89066s(this.f45493h1);
        }
    }

    /* renamed from: P1 */
    boolean m44765P1() {
        int i11 = this.f45473N0;
        return i11 == 2 || i11 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019a A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:6:0x0005, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:17:0x0024, B:19:0x0028, B:20:0x0031, B:21:0x0094, B:23:0x0064, B:24:0x0099, B:26:0x00a3, B:28:0x00a7, B:30:0x00ab, B:32:0x00af, B:34:0x00b3, B:35:0x00b9, B:37:0x00d6, B:38:0x00f0, B:40:0x00f4, B:41:0x00f9, B:43:0x00fd, B:44:0x0102, B:48:0x010e, B:50:0x0111, B:52:0x0117, B:54:0x011d, B:58:0x0125, B:61:0x012b, B:66:0x013a, B:68:0x013d, B:75:0x014b, B:78:0x0151, B:80:0x0159, B:82:0x015f, B:84:0x0165, B:87:0x016d, B:90:0x0175, B:94:0x017a, B:96:0x017e, B:98:0x0182, B:100:0x0186, B:102:0x018a, B:103:0x0229, B:107:0x018f, B:109:0x019a, B:112:0x01a2, B:114:0x01a5, B:116:0x01a9, B:118:0x01af, B:120:0x01b7, B:122:0x01bb, B:124:0x01c1, B:125:0x01c7, B:126:0x01cc, B:128:0x01d0, B:129:0x01d3, B:131:0x01d7, B:133:0x01e3, B:135:0x01ef, B:138:0x01f9, B:141:0x0201, B:144:0x020e, B:146:0x0212, B:147:0x0219, B:149:0x021d, B:152:0x0226), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a9 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:6:0x0005, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:17:0x0024, B:19:0x0028, B:20:0x0031, B:21:0x0094, B:23:0x0064, B:24:0x0099, B:26:0x00a3, B:28:0x00a7, B:30:0x00ab, B:32:0x00af, B:34:0x00b3, B:35:0x00b9, B:37:0x00d6, B:38:0x00f0, B:40:0x00f4, B:41:0x00f9, B:43:0x00fd, B:44:0x0102, B:48:0x010e, B:50:0x0111, B:52:0x0117, B:54:0x011d, B:58:0x0125, B:61:0x012b, B:66:0x013a, B:68:0x013d, B:75:0x014b, B:78:0x0151, B:80:0x0159, B:82:0x015f, B:84:0x0165, B:87:0x016d, B:90:0x0175, B:94:0x017a, B:96:0x017e, B:98:0x0182, B:100:0x0186, B:102:0x018a, B:103:0x0229, B:107:0x018f, B:109:0x019a, B:112:0x01a2, B:114:0x01a5, B:116:0x01a9, B:118:0x01af, B:120:0x01b7, B:122:0x01bb, B:124:0x01c1, B:125:0x01c7, B:126:0x01cc, B:128:0x01d0, B:129:0x01d3, B:131:0x01d7, B:133:0x01e3, B:135:0x01ef, B:138:0x01f9, B:141:0x0201, B:144:0x020e, B:146:0x0212, B:147:0x0219, B:149:0x021d, B:152:0x0226), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d0 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:6:0x0005, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:17:0x0024, B:19:0x0028, B:20:0x0031, B:21:0x0094, B:23:0x0064, B:24:0x0099, B:26:0x00a3, B:28:0x00a7, B:30:0x00ab, B:32:0x00af, B:34:0x00b3, B:35:0x00b9, B:37:0x00d6, B:38:0x00f0, B:40:0x00f4, B:41:0x00f9, B:43:0x00fd, B:44:0x0102, B:48:0x010e, B:50:0x0111, B:52:0x0117, B:54:0x011d, B:58:0x0125, B:61:0x012b, B:66:0x013a, B:68:0x013d, B:75:0x014b, B:78:0x0151, B:80:0x0159, B:82:0x015f, B:84:0x0165, B:87:0x016d, B:90:0x0175, B:94:0x017a, B:96:0x017e, B:98:0x0182, B:100:0x0186, B:102:0x018a, B:103:0x0229, B:107:0x018f, B:109:0x019a, B:112:0x01a2, B:114:0x01a5, B:116:0x01a9, B:118:0x01af, B:120:0x01b7, B:122:0x01bb, B:124:0x01c1, B:125:0x01c7, B:126:0x01cc, B:128:0x01d0, B:129:0x01d3, B:131:0x01d7, B:133:0x01e3, B:135:0x01ef, B:138:0x01f9, B:141:0x0201, B:144:0x020e, B:146:0x0212, B:147:0x0219, B:149:0x021d, B:152:0x0226), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d7 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:6:0x0005, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:17:0x0024, B:19:0x0028, B:20:0x0031, B:21:0x0094, B:23:0x0064, B:24:0x0099, B:26:0x00a3, B:28:0x00a7, B:30:0x00ab, B:32:0x00af, B:34:0x00b3, B:35:0x00b9, B:37:0x00d6, B:38:0x00f0, B:40:0x00f4, B:41:0x00f9, B:43:0x00fd, B:44:0x0102, B:48:0x010e, B:50:0x0111, B:52:0x0117, B:54:0x011d, B:58:0x0125, B:61:0x012b, B:66:0x013a, B:68:0x013d, B:75:0x014b, B:78:0x0151, B:80:0x0159, B:82:0x015f, B:84:0x0165, B:87:0x016d, B:90:0x0175, B:94:0x017a, B:96:0x017e, B:98:0x0182, B:100:0x0186, B:102:0x018a, B:103:0x0229, B:107:0x018f, B:109:0x019a, B:112:0x01a2, B:114:0x01a5, B:116:0x01a9, B:118:0x01af, B:120:0x01b7, B:122:0x01bb, B:124:0x01c1, B:125:0x01c7, B:126:0x01cc, B:128:0x01d0, B:129:0x01d3, B:131:0x01d7, B:133:0x01e3, B:135:0x01ef, B:138:0x01f9, B:141:0x0201, B:144:0x020e, B:146:0x0212, B:147:0x0219, B:149:0x021d, B:152:0x0226), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0212 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:6:0x0005, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:17:0x0024, B:19:0x0028, B:20:0x0031, B:21:0x0094, B:23:0x0064, B:24:0x0099, B:26:0x00a3, B:28:0x00a7, B:30:0x00ab, B:32:0x00af, B:34:0x00b3, B:35:0x00b9, B:37:0x00d6, B:38:0x00f0, B:40:0x00f4, B:41:0x00f9, B:43:0x00fd, B:44:0x0102, B:48:0x010e, B:50:0x0111, B:52:0x0117, B:54:0x011d, B:58:0x0125, B:61:0x012b, B:66:0x013a, B:68:0x013d, B:75:0x014b, B:78:0x0151, B:80:0x0159, B:82:0x015f, B:84:0x0165, B:87:0x016d, B:90:0x0175, B:94:0x017a, B:96:0x017e, B:98:0x0182, B:100:0x0186, B:102:0x018a, B:103:0x0229, B:107:0x018f, B:109:0x019a, B:112:0x01a2, B:114:0x01a5, B:116:0x01a9, B:118:0x01af, B:120:0x01b7, B:122:0x01bb, B:124:0x01c1, B:125:0x01c7, B:126:0x01cc, B:128:0x01d0, B:129:0x01d3, B:131:0x01d7, B:133:0x01e3, B:135:0x01ef, B:138:0x01f9, B:141:0x0201, B:144:0x020e, B:146:0x0212, B:147:0x0219, B:149:0x021d, B:152:0x0226), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021d A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:6:0x0005, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:17:0x0024, B:19:0x0028, B:20:0x0031, B:21:0x0094, B:23:0x0064, B:24:0x0099, B:26:0x00a3, B:28:0x00a7, B:30:0x00ab, B:32:0x00af, B:34:0x00b3, B:35:0x00b9, B:37:0x00d6, B:38:0x00f0, B:40:0x00f4, B:41:0x00f9, B:43:0x00fd, B:44:0x0102, B:48:0x010e, B:50:0x0111, B:52:0x0117, B:54:0x011d, B:58:0x0125, B:61:0x012b, B:66:0x013a, B:68:0x013d, B:75:0x014b, B:78:0x0151, B:80:0x0159, B:82:0x015f, B:84:0x0165, B:87:0x016d, B:90:0x0175, B:94:0x017a, B:96:0x017e, B:98:0x0182, B:100:0x0186, B:102:0x018a, B:103:0x0229, B:107:0x018f, B:109:0x019a, B:112:0x01a2, B:114:0x01a5, B:116:0x01a9, B:118:0x01af, B:120:0x01b7, B:122:0x01bb, B:124:0x01c1, B:125:0x01c7, B:126:0x01cc, B:128:0x01d0, B:129:0x01d3, B:131:0x01d7, B:133:0x01e3, B:135:0x01ef, B:138:0x01f9, B:141:0x0201, B:144:0x020e, B:146:0x0212, B:147:0x0219, B:149:0x021d, B:152:0x0226), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m44766S1() {
        final C3020p0 m14324b0;
        boolean z11;
        C21693c c21693c;
        int i11;
        C16719g c16719g;
        C22122a0 c22122a0;
        C22126c0 c22126c0;
        int i12;
        int i13;
        boolean z12;
        C16716d c16716d;
        C3039t0 c3039t0;
        int i14;
        int i15;
        C22126c0 c22126c02;
        int i16;
        C32546b c32546b;
        int i17;
        C32546b c32546b2;
        try {
            C3000l0 c3000l0 = this.f45495j1;
            if (c3000l0 == null || (m14324b0 = c3000l0.m14324b0(this.f45496k1)) == null) {
                return;
            }
            boolean m14493X = m14324b0.m14493X();
            C8240b6 c8240b6 = this.f45480U0;
            boolean z13 = true;
            int i18 = 0;
            if (c8240b6 != null && this.f45479T0 != null) {
                if (m14324b0.f12064w) {
                    C3039t0 c3039t02 = m14324b0.f12025E;
                    if (c3039t02 != null && (c32546b2 = c3039t02.f12247e) != null) {
                        i17 = c32546b2.m157605a();
                    } else {
                        i17 = 1;
                    }
                    this.f45480U0.m44636E1(true, i17);
                    C16718f m89106L = this.f45480U0.m89106L();
                    int i19 = AbstractC23222t7.f112594x;
                    m89106L.m89028L(i19, i19);
                    this.f45479T0.m89106L().m89042Z(AbstractC23222t7.f112576o, AbstractC23222t7.f112558f, AbstractC23222t7.f112576o, AbstractC23222t7.f112558f);
                    this.f45479T0.m89085A0(C31060j.f143193a.m150940f(i17, getContext(), this.f45473N0));
                } else {
                    c8240b6.m44636E1(false, 0);
                    C16718f m89106L2 = this.f45480U0.m89106L();
                    int i21 = AbstractC23222t7.f112514B;
                    m89106L2.m89028L(i21, i21);
                    this.f45479T0.m89106L().m89042Z(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
                    this.f45479T0.m89085A0(C31060j.f143193a.m150940f(0, getContext(), this.f45473N0));
                }
                this.f45479T0.requestLayout();
            }
            C31060j c31060j = C31060j.f143193a;
            if (c31060j.m150936O(this.f45473N0) && (c22126c02 = this.f45481V0) != null) {
                if (m14324b0.f12064w) {
                    C3039t0 c3039t03 = m14324b0.f12025E;
                    if (c3039t03 != null && (c32546b = c3039t03.f12247e) != null) {
                        i16 = c32546b.m157605a();
                    } else {
                        i16 = 1;
                    }
                    this.f45481V0.m111962J1(c31060j.m150932I(i16, getContext(), this.f45473N0));
                    this.f45481V0.m111959G1(c31060j.m150931H(i16, getContext()));
                } else {
                    c22126c02.m111962J1(c31060j.m150932I(0, getContext(), this.f45473N0));
                    this.f45481V0.m111959G1(c31060j.m150931H(0, getContext()));
                }
            }
            C16716d c16716d2 = this.f45479T0;
            if (c16716d2 != null) {
                c16716d2.mo89099H0(!m14493X);
            }
            C16716d c16716d3 = this.f45482W0;
            if (c16716d3 != null) {
                c16716d3.mo89099H0(!m14493X);
            }
            C16719g c16719g2 = this.f45478S0;
            if (c16719g2 != null) {
                if (m14493X) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                c16719g2.mo44614b1(i15);
            }
            if (this.f45473N0 != 0 && !m44750O1() && this.f45473N0 != 11) {
                z11 = false;
                c21693c = this.f45486a1;
                if (c21693c != null) {
                    if (!m14493X && !this.f45495j1.m14297H0() && !z11) {
                        i14 = 0;
                        c21693c.mo44614b1(i14);
                    }
                    i14 = 8;
                    c21693c.mo44614b1(i14);
                }
                i11 = this.f45473N0;
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f45477R0 != null) {
                        if (i11 != 0 || (!this.f45495j1.m14300I0() && !m14324b0.m14470C0() && !m14324b0.m14468B0() && !m14324b0.m14486Q())) {
                            z13 = false;
                        }
                        C16719g c16719g3 = this.f45477R0;
                        if (z12 || z13) {
                            i18 = 8;
                        }
                        c16719g3.mo44614b1(i18);
                    }
                    if (z12 && (c16716d = this.f45476Q0) != null && (c3039t0 = m14324b0.f12025E) != null && (c3039t0.f12244b > 0 || c3039t0.f12243a > 0)) {
                        c16716d.mo44614b1(8);
                    }
                    m44753b2(m14324b0);
                }
                this.f45492g1.m44940r1(this.f45495j1, m14324b0);
                c16719g = this.f45477R0;
                if (c16719g != null) {
                    if (m14324b0.f12047a0) {
                        i13 = 8;
                    } else {
                        i13 = 0;
                    }
                    c16719g.mo44614b1(i13);
                }
                if (this.f45490e1 != null) {
                    String str = this.f45495j1.f11869R;
                    if (str != null && !str.equals(this.f45472M0) && (m14324b0.f12045Y || this.f45495j1.f11874W)) {
                        this.f45490e1.mo44614b1(8);
                    } else {
                        this.f45490e1.mo44614b1(0);
                    }
                }
                c22122a0 = this.f45488c1;
                if (c22122a0 != null) {
                    c22122a0.mo44614b1(8);
                }
                if (this.f45489d1 != null) {
                    if (!AbstractC20826v0.m108828p0(m14324b0.f12058q, m14324b0.m14518m0()) || CoreUtility.f89233i.equals(m14324b0.m14465A()) || !AbstractC3059y0.m14708c(this.f45473N0)) {
                        z13 = false;
                    }
                    C22122a0 c22122a02 = this.f45489d1;
                    if (z13) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c22122a02.mo44614b1(i12);
                    this.f45489d1.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.j1
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g4) {
                            C8323l1.this.m44751Q1(m14324b0, c16719g4);
                        }
                    });
                }
                if (!this.f45498m1) {
                    m44774a2(this.f45495j1, m14324b0, this.f45494i1);
                }
                c22126c0 = this.f45491f1;
                if (c22126c0 != null) {
                    if (!this.f45495j1.f11874W) {
                        i18 = 8;
                    }
                    c22126c0.mo44614b1(i18);
                }
                m44753b2(m14324b0);
            }
            z11 = true;
            c21693c = this.f45486a1;
            if (c21693c != null) {
            }
            i11 = this.f45473N0;
            if (i11 != 2) {
                if (i11 != 11) {
                }
                if (this.f45477R0 != null) {
                }
                if (z12) {
                    c16716d.mo44614b1(8);
                }
                m44753b2(m14324b0);
            }
            this.f45492g1.m44940r1(this.f45495j1, m14324b0);
            c16719g = this.f45477R0;
            if (c16719g != null) {
            }
            if (this.f45490e1 != null) {
            }
            c22122a0 = this.f45488c1;
            if (c22122a0 != null) {
            }
            if (this.f45489d1 != null) {
            }
            if (!this.f45498m1) {
            }
            c22126c0 = this.f45491f1;
            if (c22126c0 != null) {
            }
            m44753b2(m14324b0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: T1 */
    public void m44767T1(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a, boolean z11) {
        try {
            this.f45494i1 = interfaceC2259a;
            this.f45495j1 = c3000l0;
            this.f45496k1 = i11;
            this.f45497l1 = z11;
            m44766S1();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: U1 */
    public void m44768U1(boolean z11) {
        this.f45498m1 = z11;
    }

    /* renamed from: V1 */
    public void m44769V1(C16719g.c cVar) {
        C16716d c16716d = this.f45482W0;
        if (c16716d != null) {
            c16716d.mo89109M0(cVar);
        }
        C16716d c16716d2 = this.f45484Y0;
        if (c16716d2 != null) {
            c16716d2.mo89109M0(cVar);
        }
        C18065d c18065d = this.f45493h1;
        if (c18065d != null) {
            c18065d.m96053y1(cVar);
        }
    }

    /* renamed from: W1 */
    public void m44770W1(C16719g.c cVar) {
        C21693c c21693c = this.f45486a1;
        if (c21693c != null) {
            c21693c.mo89109M0(cVar);
        }
    }

    /* renamed from: X1 */
    public void m44771X1(C16719g.c cVar) {
        C18065d c18065d = this.f45493h1;
        if (c18065d != null) {
            c18065d.m96052x1(cVar);
        }
    }

    /* renamed from: Y1 */
    public void m44772Y1(C16719g.c cVar) {
        C22126c0 c22126c0 = this.f45491f1;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }

    /* renamed from: Z1 */
    public void m44773Z1(boolean z11) {
        int i11;
        C16719g c16719g = this.f45477R0;
        if (c16719g != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c16719g.mo44614b1(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000c, B:9:0x0012, B:16:0x0021, B:17:0x0030, B:20:0x002a, B:22:0x0045), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000c, B:9:0x0012, B:16:0x0021, B:17:0x0030, B:20:0x002a, B:22:0x0045), top: B:2:0x0002 }] */
    /* renamed from: a2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m44774a2(C3000l0 c3000l0, final C3020p0 c3020p0, final InterfaceC2259a interfaceC2259a) {
        final boolean z11;
        int m45142j;
        if (c3020p0 != null) {
            try {
                if (this.f45487b1 != null) {
                    if (c3020p0.m14495Z() && !c3020p0.m14493X()) {
                        int i11 = this.f45473N0;
                        if (i11 != 2 && i11 != 3) {
                            z11 = false;
                            if (!z11) {
                                m45142j = c3020p0.f12042V.m45143k();
                            } else {
                                m45142j = c3020p0.f12042V.m45142j();
                            }
                            this.f45487b1.mo111926w1(m45142j);
                            this.f45487b1.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.k1
                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    C8323l1.m44752R1(C3020p0.this, z11, interfaceC2259a, c16719g);
                                }
                            });
                            this.f45487b1.mo44614b1(0);
                            return;
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        this.f45487b1.mo111926w1(m45142j);
                        this.f45487b1.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.k1
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                C8323l1.m44752R1(C3020p0.this, z11, interfaceC2259a, c16719g);
                            }
                        });
                        this.f45487b1.mo44614b1(0);
                        return;
                    }
                    this.f45487b1.mo44614b1(8);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g.d
    /* renamed from: f */
    public void mo942f(C16719g c16719g) {
        C3000l0 c3000l0;
        C3020p0 m14324b0;
        int i11;
        int i12;
        if (c16719g.m89102J() != AbstractC6918a0.like_touch_delegate || (c3000l0 = this.f45495j1) == null || (m14324b0 = c3000l0.m14324b0(this.f45496k1)) == null) {
            return;
        }
        Rect m108795Y = AbstractC20826v0.m108795Y(this.f45479T0);
        if (m108795Y != null) {
            i11 = m108795Y.left;
        } else {
            i11 = 0;
        }
        if (m108795Y != null) {
            i12 = m108795Y.top;
        } else {
            i12 = 0;
        }
        this.f45494i1.mo11972v3(m14324b0, m44776s1(this.f45495j1), i11, i12, this.f45479T0.getCurrentHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
    }

    /* renamed from: s1 */
    C32002l4 m44776s1(C3000l0 c3000l0) {
        int i11;
        int i12 = this.f45473N0;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                if (i12 != 12) {
                    i11 = 10000;
                }
            } else if (this.f45498m1) {
                i11 = 10003;
            } else {
                i11 = 10001;
            }
            return C32002l4.m154264g(i11);
        }
        if (c3000l0 != null && c3000l0.m14287D0()) {
            i11 = 10002;
        } else {
            i11 = 10031;
        }
        return C32002l4.m154264g(i11);
    }

    /* renamed from: v1 */
    void m44777v1() {
        C3000l0 c3000l0 = this.f45495j1;
        if (c3000l0 == null) {
            return;
        }
        C3020p0 m14324b0 = c3000l0.m14324b0(this.f45496k1);
        InterfaceC2259a interfaceC2259a = this.f45494i1;
        if (interfaceC2259a != null && m14324b0 != null) {
            interfaceC2259a.mo11930Q2(m14324b0, m44776s1(this.f45495j1));
        }
    }

    /* renamed from: w1 */
    public void m44778w1(Context context, int i11) {
        try {
            this.f45473N0 = i11;
            this.f45474O0 = new Handler(Looper.getMainLooper());
            this.f45472M0 = context.getString(AbstractC8020f0.profile_today);
            m44760x1();
            boolean m44765P1 = m44765P1();
            C16716d c16716d = new C16716d(context);
            this.f45476Q0 = c16716d;
            if (m44765P1) {
                c16716d.m89106L().m89028L(-1, -2).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
            } else if (this.f45473N0 == 11) {
                c16716d.m89106L().m89028L(-1, f45469n1);
            } else {
                c16716d.m89106L().m89028L(-1, -2);
            }
            m89001g1(this.f45476Q0);
            this.f45475P0 = new C20517c().m106598o(new C20516b().m106588d(1.0f).m106595l(1.8f).m106589e(1.0f).m106596m(1.8f).m106593j(100L)).m106598o(new C20516b().m106588d(1.8f).m106595l(1.0f).m106589e(1.8f).m106596m(1.0f).m106593j(100L));
            int i12 = this.f45473N0;
            if (i12 != 2 && i12 != 3) {
                if (i12 != 1) {
                    m89087B0(AbstractC16803z.bg_with_bottom_border);
                }
                m44743F1(context, i11);
                return;
            }
            mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
            m44744G1(context, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        if (c16719g.m89102J() == AbstractC6918a0.like_touch_delegate) {
            this.f45479T0.m89135c1(C19136a.f95164a.m100436a());
            m44777v1();
        }
    }
}
