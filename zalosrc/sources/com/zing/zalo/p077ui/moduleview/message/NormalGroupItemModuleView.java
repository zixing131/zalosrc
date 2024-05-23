package com.zing.zalo.p077ui.moduleview.message;

import ag0.C0804b;
import ag0.C0814e0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19637j;
import hd0.C20003a;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import lb0.C22422x;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p132ej.C18446h;
import p193h0.AbstractC19694b;
import p207he.C20012f;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p495rx.C25994h;
import p577vj.C28266a;
import p716zh.C31924g1;
import p716zh.C31973j5;
import p716zh.C32020m7;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class NormalGroupItemModuleView extends MsgItemInfoModulesView {

    /* renamed from: A0 */
    private static final int f64876A0;

    /* renamed from: B0 */
    private static final int f64877B0;

    /* renamed from: C0 */
    private static final int f64878C0;
    public static final C12421a Companion = new C12421a(null);

    /* renamed from: D0 */
    private static final int f64879D0;

    /* renamed from: E0 */
    private static final int f64880E0;

    /* renamed from: F0 */
    private static final int f64881F0;

    /* renamed from: G0 */
    private static final int f64882G0;

    /* renamed from: H0 */
    private static final int f64883H0;

    /* renamed from: I0 */
    private static final int f64884I0;

    /* renamed from: i0 */
    private static int f64885i0;

    /* renamed from: j0 */
    private static int f64886j0;

    /* renamed from: k0 */
    private static int f64887k0;

    /* renamed from: l0 */
    private static int f64888l0;

    /* renamed from: m0 */
    private static int f64889m0;

    /* renamed from: n0 */
    private static int f64890n0;

    /* renamed from: o0 */
    private static int f64891o0;

    /* renamed from: p0 */
    private static int f64892p0;

    /* renamed from: q0 */
    private static int f64893q0;

    /* renamed from: r0 */
    private static int f64894r0;

    /* renamed from: s0 */
    private static int f64895s0;

    /* renamed from: t0 */
    private static int f64896t0;

    /* renamed from: u0 */
    private static int f64897u0;

    /* renamed from: v0 */
    private static int f64898v0;

    /* renamed from: w0 */
    private static int f64899w0;

    /* renamed from: x0 */
    private static final int f64900x0;

    /* renamed from: y0 */
    private static final int f64901y0;

    /* renamed from: z0 */
    private static final int f64902z0;

    /* renamed from: K */
    private final C16716d f64903K;

    /* renamed from: L */
    private final C22129e f64904L;

    /* renamed from: M */
    private final C21693c f64905M;

    /* renamed from: N */
    private final C22124b0 f64906N;

    /* renamed from: O */
    private final C21693c f64907O;

    /* renamed from: P */
    private final C16716d f64908P;

    /* renamed from: Q */
    private final C22126c0 f64909Q;

    /* renamed from: R */
    private final C21693c f64910R;

    /* renamed from: S */
    private final C16716d f64911S;

    /* renamed from: T */
    private final C21693c f64912T;

    /* renamed from: U */
    private final C22126c0 f64913U;

    /* renamed from: V */
    private final C16716d f64914V;

    /* renamed from: W */
    private final C16716d f64915W;

    /* renamed from: a0 */
    private final C21693c f64916a0;

    /* renamed from: b0 */
    private final C22126c0 f64917b0;

    /* renamed from: c0 */
    private final C21693c f64918c0;

    /* renamed from: d0 */
    private final C16719g f64919d0;

    /* renamed from: e0 */
    private final C23528a f64920e0;

    /* renamed from: f0 */
    private final InterfaceC24854k f64921f0;

    /* renamed from: g0 */
    private final InterfaceC24854k f64922g0;

    /* renamed from: h0 */
    private final InterfaceC24854k f64923h0;

    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalGroupItemModuleView$a */
    /* loaded from: classes6.dex */
    public static final class C12421a {
        private C12421a() {
        }

        public /* synthetic */ C12421a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalGroupItemModuleView$b */
    /* loaded from: classes6.dex */
    public static final class C12422b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12422b f64924q = new C12422b();

        C12422b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Calendar mo12V4() {
            return Calendar.getInstance();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalGroupItemModuleView$c */
    /* loaded from: classes6.dex */
    public static final class C12423c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12423c f64925q = new C12423c();

        C12423c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Calendar mo12V4() {
            return Calendar.getInstance();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalGroupItemModuleView$d */
    /* loaded from: classes6.dex */
    public static final class C12424d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f64926q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12424d(Context context) {
            super(0);
            this.f64926q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            return new C3977j(this.f64926q);
        }
    }

    static {
        int i11 = AbstractC23222t7.f112568k;
        f64900x0 = i11;
        f64901y0 = i11;
        int i12 = AbstractC23222t7.f112586t;
        f64902z0 = i12;
        f64876A0 = i12;
        f64877B0 = i12;
        int i13 = AbstractC23222t7.f112576o;
        f64878C0 = i13;
        f64879D0 = i13;
        f64880E0 = AbstractC23136l9.m118742r(12.0f);
        f64881F0 = AbstractC23136l9.m118742r(8.0f);
        f64882G0 = AbstractC23136l9.m118742r(8.0f);
        f64883H0 = AbstractC23136l9.m118742r(12.0f);
        f64884I0 = AbstractC23136l9.m118742r(6.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalGroupItemModuleView(Context context, C23528a c23528a) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "aq");
        this.f64920e0 = c23528a;
        m129210a = AbstractC24856m.m129210a(new C12424d(context));
        this.f64921f0 = m129210a;
        m69794f0();
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64903K = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89048d0(f64900x0).m89044a0(f64901y0).m89046b0(f64902z0).m89047c0(f64876A0);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.avt_La), AbstractC23136l9.m118655I(AbstractC16802y.avt_La)).m89027K(true);
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_La));
        this.f64904L = c22129e;
        C21693c c21693c = new C21693c(context);
        this.f64905M = c21693c;
        c21693c.mo111926w1(AbstractC16803z.ic_oa_verify);
        C16718f m89028L = c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool).m89017A(bool);
        c21693c.m111929z1(5);
        c16716d2.m89001g1(c22129e);
        c16716d2.m89001g1(c21693c);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89028L(-1, -2).m89054h0(c16716d2).m89027K(true).m89034R(AbstractC23136l9.m118742r(16.0f));
        C16716d c16716d4 = new C16716d(context);
        this.f64908P = c16716d4;
        c16716d4.m89106L().m89017A(bool).m89034R(f64880E0).m89035S(0).m89028L(-2, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64909Q = c22126c0;
        c22126c0.mo111965M1(0);
        c22126c0.mo111964L1(f64883H0);
        c22126c0.m111962J1(f64893q0);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m89106L().m89027K(true).m89028L(-2, -2).m89017A(bool);
        c16716d4.m89001g1(c22126c0);
        C16716d c16716d5 = new C16716d(context);
        c16716d5.m89106L().m89027K(true).m89028L(-2, -2).m89049e0(c22126c0);
        c16716d4.m89001g1(c16716d5);
        C21693c c21693c2 = new C21693c(context);
        this.f64910R = c21693c2;
        c21693c2.mo111926w1(AbstractC16803z.icn_msg_mute);
        c21693c2.m89106L().m89028L(-2, -2).m89035S(f64884I0).m89027K(true);
        c21693c2.mo44614b1(8);
        c16716d5.m89001g1(c21693c2);
        C16716d c16716d6 = new C16716d(context);
        this.f64914V = c16716d6;
        c16716d6.m89106L().m89028L(-2, -2).m89017A(bool).m89023G(c16716d4).m89036T(f64881F0).m89034R(f64882G0).m89035S(0);
        C21693c c21693c3 = new C21693c(context);
        this.f64918c0 = c21693c3;
        if (AbstractC23304d.f113463z1) {
            c21693c3.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89034R(AbstractC23136l9.m118742r(8.0f));
        } else {
            c21693c3.m89106L().m89028L(-2, -2).m89050f0(new C20003a(c16716d4, c16716d6)).m89027K(true).m89034R(AbstractC23136l9.m118742r(8.0f));
        }
        c21693c3.mo111926w1(AbstractC16803z.ic_call_audio_call_back_button);
        C16716d c16716d7 = new C16716d(context);
        c16716d7.m89106L().m89028L(-2, -2).m89073z(bool).m89050f0(new C20003a(true, c21693c3, c16716d4));
        C21693c c21693c4 = new C21693c(context);
        this.f64907O = c21693c4;
        c21693c4.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_group_solid_16, AbstractC2807a.chat_community_badge_icon));
        c21693c4.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_community_icon_tab_message));
        c21693c4.m89106L().m89028L(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(20.0f)).m89025I(true).m89041Y(AbstractC23136l9.m118742r(2.0f)).m89073z(bool).m89035S(AbstractC23136l9.m118742r(4.0f));
        c21693c4.mo44614b1(8);
        c16716d7.m89001g1(c21693c4);
        C22124b0 c22124b0 = new C22124b0(context);
        this.f64906N = c22124b0;
        c22124b0.f108888M0.mo111965M1(0);
        c22124b0.f108888M0.m111953A1(1);
        c22124b0.f108888M0.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        c22124b0.f108888M0.m111962J1(f64887k0);
        c22124b0.f108888M0.m111980v1(truncateAt);
        c22124b0.m115399p1(AbstractC23136l9.m118742r(4.0f));
        c22124b0.m89106L().m89028L(-2, -2).m89054h0(c21693c4);
        c16716d7.m89001g1(c22124b0);
        C16716d c16716d8 = new C16716d(context);
        this.f64911S = c16716d8;
        c16716d8.m89106L().m89028L(-1, -2).m89023G(c16716d7).m89050f0(new C20003a(true, c21693c3, c16716d6)).m89073z(bool).m89036T(AbstractC23136l9.m118742r(2.0f));
        C21693c c21693c5 = new C21693c(context);
        this.f64912T = c21693c5;
        c21693c5.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(4.0f)).m89027K(true).m89073z(bool);
        c16716d8.m89001g1(c21693c5);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64913U = c22126c02;
        c22126c02.mo111965M1(0);
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c02.m111962J1(f64889m0);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.m111968P1(true);
        c22126c02.m89106L().m89028L(-2, -2).m89027K(true).m89054h0(c21693c5);
        c16716d8.m89001g1(c22126c02);
        C16716d c16716d9 = new C16716d(context);
        this.f64915W = c16716d9;
        c16716d9.m89106L().m89028L(-1, -2).m89023G(c16716d8).m89073z(bool).m89050f0(new C20003a(true, c21693c3, c16716d6)).m89036T(AbstractC23136l9.m118742r(2.0f));
        C21693c c21693c6 = new C21693c(context);
        this.f64916a0 = c21693c6;
        c21693c6.mo111926w1(AbstractC16803z.icon);
        c21693c6.m89106L().m89028L(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f)).m89027K(true).m89035S(AbstractC23136l9.m118742r(6.0f));
        c16716d9.m89001g1(c21693c6);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64917b0 = c22126c03;
        c22126c03.mo111965M1(0);
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        c22126c03.m111962J1(f64891o0);
        c22126c03.m111953A1(1);
        c22126c03.m111980v1(truncateAt);
        c22126c03.m89106L().m89028L(-2, -2).m89027K(true).m89054h0(c21693c6);
        c16716d9.m89001g1(c22126c03);
        C16719g c16719g = new C16719g(context);
        this.f64919d0 = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c16719g.m89106L().m89028L(-1, 1).m89023G(c16716d).m89034R(AbstractC23136l9.m118742r(80.0f));
        c16716d3.m89001g1(c16716d4);
        c16716d3.m89001g1(c16716d6);
        c16716d3.m89001g1(c21693c3);
        c16716d3.m89001g1(c16716d7);
        c16716d3.m89001g1(c16716d8);
        c16716d3.m89001g1(c16716d9);
        c16716d.m89001g1(c16716d2);
        c16716d.m89001g1(c16716d3);
        mo69681L(c16716d);
        mo69681L(c16719g);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
        m129210a2 = AbstractC24856m.m129210a(C12422b.f64924q);
        this.f64922g0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C12423c.f64925q);
        this.f64923h0 = m129210a3;
    }

    /* renamed from: V */
    private final void m69785V(ContactProfile contactProfile, boolean z11) {
        C22129e c22129e = this.f64904L;
        c22129e.f108931U0 = z11;
        c22129e.m115433q1(contactProfile);
    }

    /* renamed from: W */
    private final void m69786W(C32020m7 c32020m7) {
        int i11;
        C16719g c16719g = this.f64919d0;
        if (c32020m7.f147415f) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c16719g.mo44614b1(i11);
    }

    /* renamed from: X */
    private final void m69787X(ContactProfile contactProfile, boolean z11) {
        this.f64909Q.mo44614b1(0);
        String m119220T0 = AbstractC23160o0.m119220T0(contactProfile.m40402e0(), getC1(), getC2());
        AbstractC19074t.m100207e(m119220T0, "getTimestampUntilNowForTabMsgItems(...)");
        if (z11) {
            m69795g0(true);
        } else {
            m69795g0(AbstractC19646n0.m102948Y0(contactProfile));
        }
        int m40432u0 = contactProfile.m40432u0();
        if (m40432u0 != 29 && m40432u0 != 36 && m40432u0 != 33) {
            if (!AbstractC19646n0.m102948Y0(contactProfile)) {
                int m40398b0 = contactProfile.m40398b0();
                if (m40398b0 != 0) {
                    if (m40398b0 == 1 && C0814e0.m2059e(contactProfile.m40394Y())) {
                        m119220T0 = AbstractC23136l9.m118743r0(AbstractC8020f0.sending_message_state);
                        AbstractC19074t.m100207e(m119220T0, "getString(...)");
                        this.f64909Q.m111962J1(f64897u0);
                        this.f64909Q.mo111965M1(1);
                    }
                } else {
                    m119220T0 = AbstractC23136l9.m118743r0(AbstractC8020f0.deliveried_message_send_fail);
                    AbstractC19074t.m100207e(m119220T0, "getString(...)");
                    this.f64909Q.m111962J1(f64895s0);
                    this.f64909Q.mo111965M1(1);
                }
            } else {
                this.f64909Q.mo111965M1(1);
                this.f64909Q.m111962J1(f64896t0);
                m119220T0 = AbstractC23136l9.m118743r0(AbstractC8020f0.deliveried_message_draft_state);
                AbstractC19074t.m100207e(m119220T0, "getString(...)");
            }
        }
        if (m119220T0.length() > 0) {
            this.f64909Q.m111959G1(m119220T0);
            this.f64909Q.mo44614b1(0);
        } else {
            this.f64909Q.mo44614b1(8);
        }
    }

    /* renamed from: Y */
    private final void m69788Y(ContactProfile contactProfile, boolean z11, boolean z12) {
        C18446h m40392W;
        int i11;
        this.f64913U.mo111965M1(0);
        this.f64913U.m111962J1(f64889m0);
        CharSequence m40380O = contactProfile.m40380O();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (contactProfile.f42375S != 3) {
                this.f64913U.m111962J1(f64888l0);
            } else {
                C22126c0 c22126c0 = this.f64913U;
                if (z11) {
                    i11 = f64889m0;
                } else {
                    i11 = f64888l0;
                }
                c22126c0.m111962J1(i11);
            }
        } else {
            this.f64913U.m111962J1(f64889m0);
        }
        this.f64913U.mo111965M1(0);
        int m40432u0 = contactProfile.m40432u0();
        String m40396a0 = contactProfile.m40396a0();
        AbstractC19074t.m100207e(m40396a0, "getLastMsgSenderNameGroup(...)");
        if (m40396a0.length() > 0 && contactProfile.m40374K0() && m40432u0 != 26 && m40432u0 != 20 && m40432u0 != 21 && m40432u0 != 29 && (m40432u0 != 24 || ((m40392W = contactProfile.m40392W()) != null && m40392W.m97745d()))) {
            String m119762z = AbstractC23244v8.m119762z(contactProfile.m40396a0());
            AbstractC19074t.m100207e(m119762z, "trimDisplayNameRulePreviewLastMsg(...)");
            spannableStringBuilder.append((CharSequence) m119762z).append((CharSequence) ": ").append(m40380O);
        } else {
            spannableStringBuilder.append(m40380O);
        }
        this.f64913U.m111959G1(spannableStringBuilder);
    }

    /* renamed from: a0 */
    private final void m69789a0(ContactProfile contactProfile, C31973j5 c31973j5, boolean z11) {
        String obj;
        int i11;
        boolean z12;
        this.f64906N.f108888M0.m111962J1(f64887k0);
        this.f64906N.f108888M0.mo111965M1(0);
        C22126c0 c22126c0 = this.f64906N.f108888M0;
        if (c31973j5 == null || (obj = c31973j5.m153793y()) == null) {
            String mo2475c = contactProfile.mo2475c();
            AbstractC19074t.m100207e(mo2475c, "getDpn(...)");
            int length = mo2475c.length() - 1;
            int i12 = 0;
            boolean z13 = false;
            while (i12 <= length) {
                if (!z13) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(mo2475c.charAt(i11), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13) {
                    if (!z12) {
                        z13 = true;
                    } else {
                        i12++;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length--;
                }
            }
            obj = mo2475c.subSequence(i12, length + 1).toString();
        }
        c22126c0.m111959G1(obj);
        if (z11) {
            this.f64906N.f108888M0.mo111965M1(1);
        } else {
            this.f64906N.f108888M0.mo111965M1(0);
        }
    }

    /* renamed from: b0 */
    private final void m69790b0() {
        this.f64912T.mo44614b1(0);
        this.f64912T.mo111926w1(AbstractC16803z.im_downloadfile);
        this.f64913U.m111962J1(f64894r0);
        this.f64913U.mo44614b1(0);
        this.f64913U.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_downloading));
    }

    /* renamed from: c0 */
    private final void m69791c0(ContactProfile contactProfile) {
        Drawable drawable;
        boolean m127120J;
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        if (contactProfile.m40432u0() == 35) {
            m127120J = AbstractC24341v.m127120J(mo2478b, "-", false, 2, null);
            if (!m127120J) {
                drawable = C23212s8.m119609q(getContext(), AbstractC16781w.icn_msg_new);
                this.f64906N.m115402s1(null, null, drawable, null);
            }
        }
        if (AbstractC23304d.f113448v2.containsKey(mo2478b)) {
            drawable = AbstractC19694b.m103336d(getContext(), AbstractC16803z.icn_msg_live);
        } else {
            drawable = null;
        }
        this.f64906N.m115402s1(null, null, drawable, null);
    }

    /* renamed from: d0 */
    private final void m69792d0(C31973j5 c31973j5, C32020m7 c32020m7) {
        this.f64905M.mo44614b1(8);
        this.f64905M.m89106L().m89031O(this.f64904L.m115432p1());
        if (C19637j.f97466a.m102828I() == 2) {
            if (c31973j5 != null && c31973j5.m153778p0()) {
                this.f64905M.mo44614b1(0);
                this.f64905M.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_status_icon_large), AbstractC23136l9.m118655I(AbstractC16802y.msg_item_status_icon_large));
                this.f64905M.mo111926w1(AbstractC16803z.icn_rightmenu_key_gold);
                return;
            } else {
                if (c31973j5 != null && c31973j5.m153743U()) {
                    this.f64905M.mo44614b1(0);
                    this.f64905M.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_status_icon_large), AbstractC23136l9.m118655I(AbstractC16802y.msg_item_status_icon_large));
                    this.f64905M.mo111926w1(AbstractC16803z.icn_rightmenu_key_silver);
                    return;
                }
                return;
            }
        }
        if (c32020m7.f147427r) {
            this.f64905M.mo44614b1(0);
            this.f64905M.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_status_icon_small), AbstractC23136l9.m118655I(AbstractC16802y.msg_item_status_icon_small));
            this.f64905M.mo111926w1(AbstractC16803z.online_status_green_ic_round);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f9 A[ADDED_TO_REGION] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m69793e0(ContactProfile contactProfile, C31973j5 c31973j5, boolean z11) {
        boolean z12;
        boolean z13;
        int i11;
        C28266a m102752J;
        String m118086f;
        int i12;
        String str;
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        this.f64915W.mo44614b1(8);
        this.f64917b0.mo111965M1(0);
        this.f64916a0.m89106L().m89028L(-2, -2);
        if (contactProfile.m40374K0()) {
            if (c31973j5 != null && C20012f.f98380a.m103860l(c31973j5.m153781r())) {
                C31924g1 m40395Z = contactProfile.m40395Z();
                if (m40395Z != null) {
                    str = m40395Z.f146660a;
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, "recommened.groupcall")) {
                    this.f64915W.mo44614b1(0);
                    this.f64916a0.mo44614b1(0);
                    C16718f m89106L = this.f64916a0.m89106L();
                    int i13 = f64878C0;
                    m89106L.m89028L(i13, i13);
                    this.f64916a0.mo111925v1(AbstractC11531v0.Companion.m62589l0());
                    this.f64917b0.mo44614b1(0);
                    this.f64917b0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_ongoing_status));
                    z12 = false;
                    z13 = true;
                    if (!z12 && !z13 && (m102752J = C19636i1.Companion.m102800a().m102752J(mo2478b)) != null) {
                        this.f64915W.mo44614b1(0);
                        this.f64916a0.mo44614b1(0);
                        C16718f m89106L2 = this.f64916a0.m89106L();
                        int i14 = f64879D0;
                        m89106L2.m89028L(i14, i14);
                        this.f64916a0.mo111925v1(new C22422x(m102752J.m142384c(), AbstractC23136l9.m118742r(10.0f)));
                        this.f64917b0.mo44614b1(0);
                        this.f64917b0.mo111965M1(1);
                        m118086f = AbstractC23028c0.m118086f(m102752J.m142388g(), false, AbstractC8020f0.str_me);
                        AbstractC19074t.m100205c(m118086f);
                        if (m118086f.length() == 0) {
                            m118086f = m102752J.m142387f();
                        }
                        if (contactProfile.m40374K0()) {
                            m118086f = AbstractC23184q2.m119453k(m102752J.m142388g(), m118086f, mo2478b);
                        }
                        this.f64917b0.m111959G1(m118086f);
                    }
                    C22126c0 c22126c0 = this.f64917b0;
                    if (z11 && !z13) {
                        i11 = f64891o0;
                    } else {
                        i11 = f64890n0;
                    }
                    c22126c0.m111962J1(i11);
                }
            }
            if (c31973j5 != null && c31973j5.m153724K().length() > 0) {
                String m153726L = c31973j5.m153726L();
                if (m153726L == null || m153726L.length() == 0) {
                    C7907e m153779q = c31973j5.m153779q();
                    AbstractC19074t.m100205c(m153779q);
                    List m40857g = m153779q.m40857g();
                    AbstractC19074t.m100205c(m40857g);
                    c31973j5.m153729M0(AbstractC19620d0.m102678O(m40857g, c31973j5.m153724K(), mo2478b));
                }
                this.f64915W.mo44614b1(0);
                this.f64916a0.mo44614b1(0);
                AbstractC23268y2.m120034h(this.f64920e0, getDumpSuggestIcon(), this.f64916a0, c31973j5.m153722J(), C23278z2.m120146o0(), false);
                this.f64917b0.mo44614b1(0);
                this.f64917b0.m111959G1(c31973j5.m153726L());
            } else {
                if (c31973j5 != null && c31973j5.m153713E() > 0 && c31973j5.m153742T()) {
                    this.f64915W.mo44614b1(0);
                    this.f64916a0.mo44614b1(0);
                    C16718f m89106L3 = this.f64916a0.m89106L();
                    int i15 = f64877B0;
                    m89106L3.m89028L(i15, i15);
                    this.f64916a0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_group_member_request_tab_message));
                    this.f64917b0.mo44614b1(0);
                    C22126c0 c22126c02 = this.f64917b0;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    if (c31973j5.m153747Y()) {
                        i12 = AbstractC8020f0.str_tip_request_join_community_info;
                    } else {
                        i12 = AbstractC8020f0.str_tip_request_join_group_info;
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(i12);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(c31973j5.m153713E())}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    c22126c02.m111959G1(format);
                    z12 = true;
                    z13 = false;
                    if (!z12) {
                        this.f64915W.mo44614b1(0);
                        this.f64916a0.mo44614b1(0);
                        C16718f m89106L22 = this.f64916a0.m89106L();
                        int i142 = f64879D0;
                        m89106L22.m89028L(i142, i142);
                        this.f64916a0.mo111925v1(new C22422x(m102752J.m142384c(), AbstractC23136l9.m118742r(10.0f)));
                        this.f64917b0.mo44614b1(0);
                        this.f64917b0.mo111965M1(1);
                        m118086f = AbstractC23028c0.m118086f(m102752J.m142388g(), false, AbstractC8020f0.str_me);
                        AbstractC19074t.m100205c(m118086f);
                        if (m118086f.length() == 0) {
                        }
                        if (contactProfile.m40374K0()) {
                        }
                        this.f64917b0.m111959G1(m118086f);
                    }
                    C22126c0 c22126c03 = this.f64917b0;
                    if (z11) {
                    }
                    i11 = f64890n0;
                    c22126c03.m111962J1(i11);
                }
                if (c31973j5 != null) {
                    C25994h c25994h = C25994h.f124017a;
                    if (!c25994h.m133919h(mo2478b).m133964p().isEmpty()) {
                        Object obj = c25994h.m133919h(mo2478b).m133964p().get(0);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        C7904b c7904b = (C7904b) obj;
                        if (c7904b.m40778p() && c7904b.m40776n()) {
                            this.f64915W.mo44614b1(0);
                            AbstractC23184q2.m119441F(this.f64917b0, this.f64916a0, c7904b);
                        }
                    }
                }
            }
        }
        z12 = false;
        z13 = false;
        if (!z12) {
        }
        C22126c0 c22126c032 = this.f64917b0;
        if (z11) {
        }
        i11 = f64890n0;
        c22126c032.m111962J1(i11);
    }

    /* renamed from: f0 */
    private final void m69794f0() {
        f64885i0 = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        int m119607o = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2);
        f64886j0 = m119607o;
        int i11 = f64885i0;
        f64887k0 = i11;
        f64888l0 = i11;
        f64889m0 = m119607o;
        f64890n0 = i11;
        f64891o0 = m119607o;
        f64892p0 = i11;
        f64893q0 = m119607o;
        f64894r0 = C23212s8.m119607o(getContext(), AbstractC16781w.AppAccentColor);
        f64895s0 = C23212s8.m119607o(getContext(), AbstractC7354t0.NotificationColor1);
        f64896t0 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.orange_color1);
        f64897u0 = f64894r0;
        f64898v0 = f64886j0;
        f64899w0 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.group_call_color);
    }

    /* renamed from: g0 */
    private final void m69795g0(boolean z11) {
        if (z11) {
            this.f64909Q.mo111965M1(1);
            this.f64909Q.m111962J1(f64892p0);
        } else {
            this.f64909Q.mo111965M1(0);
            this.f64909Q.m111962J1(f64893q0);
        }
    }

    private final Calendar getC1() {
        return (Calendar) this.f64922g0.getValue();
    }

    private final Calendar getC2() {
        return (Calendar) this.f64923h0.getValue();
    }

    private final C3977j getDumpSuggestIcon() {
        return (C3977j) this.f64921f0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:7:0x000d, B:9:0x0026, B:12:0x0033, B:15:0x003d, B:18:0x0048, B:20:0x0057, B:24:0x0065, B:28:0x0095, B:29:0x0098, B:32:0x00af, B:34:0x00bc, B:35:0x00c7, B:37:0x00d2, B:41:0x00c2), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:7:0x000d, B:9:0x0026, B:12:0x0033, B:15:0x003d, B:18:0x0048, B:20:0x0057, B:24:0x0065, B:28:0x0095, B:29:0x0098, B:32:0x00af, B:34:0x00bc, B:35:0x00c7, B:37:0x00d2, B:41:0x00c2), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:7:0x000d, B:9:0x0026, B:12:0x0033, B:15:0x003d, B:18:0x0048, B:20:0x0057, B:24:0x0065, B:28:0x0095, B:29:0x0098, B:32:0x00af, B:34:0x00bc, B:35:0x00c7, B:37:0x00d2, B:41:0x00c2), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        int m40432u0;
        CharSequence m111973m1;
        int i14;
        AbstractC19074t.m100208f(c32020m7, "msgItem");
        ContactProfile contactProfile = c32020m7.f147411b;
        if (contactProfile == null) {
            return;
        }
        AbstractC19646n0.m103016p2(contactProfile);
        try {
            String m154394a = c32020m7.m154394a();
            AbstractC19074t.m100207e(m154394a, "getUid(...)");
            C31973j5 m40388T = contactProfile.m40388T(true);
            boolean m2033i = C0804b.m2025g().m2033i(m154394a);
            if (m40388T != null && m40388T.m153746X()) {
                z12 = true;
            } else {
                z12 = false;
            }
            C21693c c21693c = this.f64907O;
            if (z12) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            c21693c.mo44614b1(i12);
            C21693c c21693c2 = this.f64910R;
            if (m2033i) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            c21693c2.mo44614b1(i13);
            C19636i1.b bVar = C19636i1.Companion;
            if (bVar.m102800a().m102746E(m154394a) <= 0 && !bVar.m102800a().m102765V(m154394a)) {
                z13 = false;
                m69789a0(contactProfile, m40388T, z13);
                m69791c0(contactProfile);
                m69785V(contactProfile, z11);
                m69793e0(contactProfile, m40388T, z13);
                m69792d0(m40388T, c32020m7);
                m69787X(contactProfile, z13);
                m69788Y(contactProfile, m2033i, z13);
                this.f64918c0.mo44614b1(8);
                this.f64912T.mo44614b1(8);
                m40432u0 = contactProfile.m40432u0();
                int m40393X = contactProfile.m40393X();
                if (AbstractC19646n0.m103003m1(m40432u0) && m40393X == 4) {
                    m69790b0();
                }
                C16716d c16716d = this.f64911S;
                m111973m1 = this.f64913U.m111973m1();
                AbstractC19074t.m100207e(m111973m1, "getText(...)");
                if (m111973m1.length() <= 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                c16716d.mo44614b1(i14);
                if (this.f64913U.m111974n1() != f64888l0) {
                    this.f64913U.mo111965M1(1);
                } else {
                    this.f64913U.mo111965M1(0);
                }
                m69786W(c32020m7);
                if (this.f64909Q.m89136d0() != 8) {
                    this.f64909Q.mo44614b1(0);
                    this.f64909Q.m111959G1("");
                    return;
                }
                return;
            }
            z13 = true;
            m69789a0(contactProfile, m40388T, z13);
            m69791c0(contactProfile);
            m69785V(contactProfile, z11);
            m69793e0(contactProfile, m40388T, z13);
            m69792d0(m40388T, c32020m7);
            m69787X(contactProfile, z13);
            m69788Y(contactProfile, m2033i, z13);
            this.f64918c0.mo44614b1(8);
            this.f64912T.mo44614b1(8);
            m40432u0 = contactProfile.m40432u0();
            int m40393X2 = contactProfile.m40393X();
            if (AbstractC19646n0.m103003m1(m40432u0)) {
                m69790b0();
            }
            C16716d c16716d2 = this.f64911S;
            m111973m1 = this.f64913U.m111973m1();
            AbstractC19074t.m100207e(m111973m1, "getText(...)");
            if (m111973m1.length() <= 0) {
            }
            c16716d2.mo44614b1(i14);
            if (this.f64913U.m111974n1() != f64888l0) {
            }
            m69786W(c32020m7);
            if (this.f64909Q.m89136d0() != 8) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("NormalMsgModuleView", e11);
        }
    }
}
