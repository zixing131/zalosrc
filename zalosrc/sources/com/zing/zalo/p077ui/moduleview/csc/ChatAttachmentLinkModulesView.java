package com.zing.zalo.p077ui.moduleview.csc;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.C17014k0;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22126c0;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import nh0.C23793c;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p560uw.EnumC27374a;
import p560uw.EnumC27376c;
import p716zh.C32098s;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ChatAttachmentLinkModulesView extends ModulesView implements C16719g.c {
    public static final C12411b Companion = new C12411b(null);

    /* renamed from: g0 */
    private static final int f64665g0 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: h0 */
    private static final int f64666h0 = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: i0 */
    private static final int f64667i0 = AbstractC23136l9.m118742r(96.0f);

    /* renamed from: j0 */
    private static final int f64668j0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: k0 */
    private static final int f64669k0 = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: l0 */
    private static final int f64670l0 = AbstractC23136l9.m118742r(26.0f);

    /* renamed from: m0 */
    private static final int f64671m0 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: n0 */
    private static final int f64672n0 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: o0 */
    private static final int f64673o0 = AbstractC23136l9.m118742r(32.0f);

    /* renamed from: p0 */
    private static final int f64674p0 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: q0 */
    private static final int f64675q0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: r0 */
    private static final int f64676r0 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: s0 */
    private static final int f64677s0 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: t0 */
    private static final int f64678t0;

    /* renamed from: u0 */
    private static final int f64679u0;

    /* renamed from: v0 */
    private static final int f64680v0;

    /* renamed from: w0 */
    private static final int f64681w0;

    /* renamed from: K */
    private C16716d f64682K;

    /* renamed from: L */
    private C21693c f64683L;

    /* renamed from: M */
    private C21693c f64684M;

    /* renamed from: N */
    private C21693c f64685N;

    /* renamed from: O */
    private C16716d f64686O;

    /* renamed from: P */
    private C21693c f64687P;

    /* renamed from: Q */
    private C22126c0 f64688Q;

    /* renamed from: R */
    private C22126c0 f64689R;

    /* renamed from: S */
    private C22126c0 f64690S;

    /* renamed from: T */
    private C21693c f64691T;

    /* renamed from: U */
    private C23528a f64692U;

    /* renamed from: V */
    private C3977j f64693V;

    /* renamed from: W */
    private C3977j f64694W;

    /* renamed from: a0 */
    private ChatAttachmentContainer.C11728c f64695a0;

    /* renamed from: b0 */
    private ChatAttachmentContainer.ViewOnClickListenerC11730e f64696b0;

    /* renamed from: c0 */
    private C17014k0 f64697c0;

    /* renamed from: d0 */
    private C16716d f64698d0;

    /* renamed from: e0 */
    private C22126c0 f64699e0;

    /* renamed from: f0 */
    private C16977g f64700f0;

    /* renamed from: com.zing.zalo.ui.moduleview.csc.ChatAttachmentLinkModulesView$a */
    /* loaded from: classes6.dex */
    public static final class C12410a extends C22126c0 {

        /* renamed from: m1 */
        final /* synthetic */ ChatAttachmentLinkModulesView f64701m1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12410a(Context context, ChatAttachmentLinkModulesView chatAttachmentLinkModulesView) {
            super(context);
            this.f64701m1 = chatAttachmentLinkModulesView;
        }

        @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
        /* renamed from: q0 */
        public void mo44180q0(int i11, int i12, int i13, int i14) {
            int m116584g;
            int m116580c;
            super.mo44180q0(i11, i12, i13, i14);
            m116584g = AbstractC22543l.m116584g(m111975o1().getLineCount(), m111971k1());
            C22126c0 mDescTxt = this.f64701m1.getMDescTxt();
            if (mDescTxt != null) {
                m116580c = AbstractC22543l.m116580c(4 - m116584g, 1);
                mDescTxt.m111953A1(m116580c);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.csc.ChatAttachmentLinkModulesView$b */
    /* loaded from: classes6.dex */
    public static final class C12411b {
        private C12411b() {
        }

        public /* synthetic */ C12411b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.csc.ChatAttachmentLinkModulesView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12412c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64702a;

        static {
            int[] iArr = new int[EnumC27374a.values().length];
            try {
                iArr[EnumC27374a.f128968u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27374a.f128967t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64702a = iArr;
        }
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(14.0f);
        f64678t0 = m118742r;
        f64679u0 = m118742r;
        f64680v0 = AbstractC23136l9.m118742r(12.0f);
        f64681w0 = AbstractC23136l9.m118742r(33.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatAttachmentLinkModulesView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f64692U = new C23528a(context);
        this.f64693V = new C3977j(context);
        this.f64694W = new C3977j(context);
        AbstractC23136l9.m118699c1(this, C23212s8.m119607o(context, AbstractC2807a.page_background_03));
        m88987U(-1, -2);
        int i11 = f64665g0;
        setPadding(i11, i11, i11, i11);
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        C21693c c21693c = new C21693c(context);
        c21693c.mo111927x1(f64669k0);
        c21693c.m111929z1(5);
        C16718f m89106L = c21693c.m89106L();
        int i12 = f64667i0;
        C16718f m89028L = m89106L.m89028L(i12, i12);
        int i13 = f64668j0;
        m89028L.m89035S(i13);
        this.f64683L = c21693c;
        C16716d c16716d = new C16716d(context);
        c16716d.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.background_thumb_preview));
        c16716d.m89106L().m89028L(i12, i12).m89035S(i13);
        C17014k0 c17014k0 = new C17014k0(context, AbstractC2814h.ProgressBar_Size24_Blue);
        c17014k0.m89106L().m89028L(-2, -2).m89025I(true);
        c17014k0.m91065j1(true);
        c16716d.mo44614b1(8);
        c16716d.m89001g1(c17014k0);
        this.f64682K = c16716d;
        C21693c c21693c2 = new C21693c(context);
        c21693c2.mo44614b1(8);
        C16718f m89106L2 = c21693c2.m89106L();
        int i14 = f64670l0;
        m89106L2.m89028L(i14, i14).m89069v(this.f64683L).m89070w(this.f64683L);
        this.f64685N = c21693c2;
        C21693c c21693c3 = new C21693c(context);
        c21693c3.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_ic_head_close_black));
        C16718f m89106L3 = c21693c3.m89106L();
        int i15 = f64673o0;
        C16718f m89032P = m89106L3.m89028L(i15, i15).m89041Y(f64674p0).m89032P(0, -i11, -i11, 0);
        Boolean bool = Boolean.TRUE;
        m89032P.m89017A(bool);
        c21693c3.mo44614b1(8);
        this.f64691T = c21693c3;
        c21693c3.mo89109M0(this);
        C16716d c16716d2 = new C16716d(context);
        C16718f m89049e0 = c16716d2.m89106L().m89028L(-1, -2).m89020D(this.f64683L).m89054h0(this.f64683L).m89049e0(this.f64691T);
        int i16 = f64676r0;
        m89049e0.m89033Q(i16).m89036T(i16);
        this.f64686O = c16716d2;
        C21693c c21693c4 = new C21693c(context);
        c21693c4.mo111927x1(f64672n0);
        C16718f m89106L4 = c21693c4.m89106L();
        int i17 = f64671m0;
        C16718f m89027K = m89106L4.m89028L(i17, i17).m89027K(true);
        int i18 = f64677s0;
        m89027K.m89035S(i18);
        this.f64687P = c21693c4;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m111962J1(m119607o);
        c22126c0.mo111964L1(f64675q0);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m111982x1(false);
        c22126c0.m89106L().m89054h0(this.f64687P).m89027K(true);
        this.f64688Q = c22126c0;
        this.f64686O.m89001g1(this.f64687P);
        this.f64686O.m89001g1(this.f64688Q);
        C21693c c21693c5 = new C21693c(context);
        c21693c5.m111921r1(true);
        c21693c5.m89106L().m89028L(-2, f64666h0).m89033Q(i16).m89023G(this.f64686O);
        c21693c5.mo44614b1(8);
        this.f64684M = c21693c5;
        C12410a c12410a = new C12410a(context, this);
        this.f64689R = c12410a;
        c12410a.mo111964L1(f64678t0);
        this.f64689R.m111962J1(m119607o2);
        this.f64689R.mo111965M1(1);
        this.f64689R.m111953A1(3);
        this.f64689R.m111980v1(truncateAt);
        C16718f m89028L2 = this.f64689R.m89106L().m89028L(-1, -2);
        int i19 = f64680v0;
        m89028L2.m89035S(i19).m89054h0(this.f64683L).m89024H(new C20003a(this.f64686O, this.f64684M));
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.mo111964L1(f64679u0);
        c22126c02.m111962J1(m119607o2);
        c22126c02.m111980v1(truncateAt);
        c22126c02.m89106L().m89028L(-1, -2).m89035S(i19).m89023G(this.f64689R).m89054h0(this.f64683L);
        this.f64690S = c22126c02;
        C17014k0 c17014k02 = new C17014k0(context, AbstractC2814h.ProgressBar_Size24_Blue);
        C16718f m89025I = c17014k02.m89106L().m89028L(-2, -2).m89025I(true);
        int i21 = f64681w0;
        m89025I.m89036T(i21).m89033Q(i21);
        c17014k02.m91065j1(true);
        this.f64697c0 = c17014k02;
        C16977g c16977g = new C16977g(context);
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
        c16974f.m90971u(EnumC16980h.SIZE_16);
        c16977g.m90983u1(c16974f);
        c16977g.m89106L().m89025I(true);
        this.f64700f0 = c16977g;
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89001g1(this.f64700f0);
        c16716d3.m89085A0(C27280g.m139658a(context, AbstractC16803z.badge_warning_background));
        c16716d3.m89106L().m89028L(C27276c.m139649b(context, 48), C27276c.m139649b(context, 48)).m89073z(bool).m89031O(i18);
        c16716d3.mo44614b1(8);
        this.f64698d0 = c16716d3;
        C22126c0 c22126c03 = new C22126c0(context);
        new C26707f(c22126c03).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xsmall));
        c22126c03.m111962J1(C23212s8.m119606n(AbstractC2807a.text_secondary));
        c22126c03.m111953A1(1);
        c22126c03.m111980v1(truncateAt);
        c22126c03.m111982x1(false);
        c22126c03.m89106L().m89054h0(this.f64698d0).m89035S(i19).m89027K(true);
        c22126c03.mo44614b1(8);
        c22126c03.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.unsafe_link_warning_attacment));
        this.f64699e0 = c22126c03;
        mo69681L(this.f64683L);
        mo69681L(this.f64682K);
        mo69681L(this.f64685N);
        mo69681L(this.f64691T);
        mo69681L(this.f64686O);
        mo69681L(this.f64684M);
        mo69681L(this.f64689R);
        C22126c0 c22126c04 = this.f64690S;
        AbstractC19074t.m100205c(c22126c04);
        mo69681L(c22126c04);
        mo69681L(this.f64697c0);
        mo69681L(this.f64698d0);
        mo69681L(this.f64699e0);
    }

    /* renamed from: W */
    private final void m69735W() {
        this.f64683L.mo111924u1(null);
        this.f64683L.mo44614b1(8);
        this.f64685N.mo44614b1(8);
        this.f64682K.mo44614b1(8);
    }

    /* renamed from: X */
    private final void m69736X(C32098s c32098s) {
        int i11 = c32098s.f147956f;
        if (i11 != 4 && i11 != 2) {
            this.f64685N.mo44614b1(8);
        } else {
            this.f64685N.mo44614b1(0);
            this.f64685N.mo111926w1(AbstractC16803z.icn_csc_play_icon);
        }
    }

    /* renamed from: Y */
    private final void m69737Y(ChatAttachmentContainer.C11728c c11728c) {
        C23793c.b bVar = C23793c.Companion;
        long mo124319c = bVar.m124321a().mo124319c();
        String m154934d = c11728c.m65328f().f91251B.m154934d();
        AbstractC19074t.m100207e(m154934d, "getLocalPathThumbLink(...)");
        if (AbstractC23041d2.m118194A(m154934d) && AbstractC23041d2.m118224w(m154934d) > 0) {
            this.f64683L.mo44614b1(0);
            this.f64682K.mo44614b1(8);
            AbstractC23268y2.m120033g(this.f64692U, this.f64694W, this.f64683L, m154934d, C23278z2.m120136k0(), false);
            C32098s c32098s = c11728c.m65328f().f91251B;
            AbstractC19074t.m100207e(c32098s, "mLinkData");
            m69736X(c32098s);
            c11728c.m65328f().f91251B.f147944B = bVar.m124321a().mo124319c() - mo124319c;
            return;
        }
        m69735W();
    }

    /* renamed from: a0 */
    private final void m69738a0() {
        this.f64698d0.mo44614b1(0);
        this.f64699e0.mo44614b1(0);
        this.f64691T.mo44614b1(8);
        this.f64697c0.mo44614b1(8);
        this.f64683L.mo44614b1(8);
        this.f64685N.mo44614b1(8);
        this.f64686O.mo44614b1(8);
        this.f64684M.mo44614b1(8);
        this.f64689R.mo44614b1(8);
        C22126c0 c22126c0 = this.f64690S;
        if (c22126c0 != null) {
            c22126c0.mo44614b1(8);
        }
    }

    /* renamed from: b0 */
    private final void m69739b0(EnumC27374a enumC27374a) {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16974f c16974f = new C16974f(context);
        c16974f.m90971u(EnumC16980h.SIZE_16);
        int i11 = C12412c.f64702a[enumC27374a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
                C16716d c16716d = this.f64698d0;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                c16716d.m89085A0(C27280g.m139660c(context2, AbstractC16803z.badge_warning_background, AbstractC2807a.accent_yellow_background_subtle));
            }
        } else {
            c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_DANGER);
            C16716d c16716d2 = this.f64698d0;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            c16716d2.m89085A0(C27280g.m139660c(context3, AbstractC16803z.badge_warning_background, AbstractC2807a.accent_orange_background_subtle));
        }
        this.f64700f0.m90983u1(c16974f);
    }

    /* renamed from: V */
    public final void m69740V(ChatAttachmentContainer.C11728c c11728c, ChatAttachmentContainer.ViewOnClickListenerC11730e viewOnClickListenerC11730e) {
        String str;
        AbstractC19074t.m100208f(c11728c, "attachment");
        AbstractC19074t.m100208f(viewOnClickListenerC11730e, "onRemoveAttachmentClickListener");
        try {
            if (c11728c.m65332k()) {
                EnumC27374a m65325c = c11728c.m65325c();
                AbstractC19074t.m100207e(m65325c, "getMsgWarningType(...)");
                m69739b0(m65325c);
                m69738a0();
                return;
            }
            this.f64695a0 = c11728c;
            this.f64696b0 = viewOnClickListenerC11730e;
            if (c11728c.m65328f() == null) {
                this.f64697c0.mo44614b1(0);
                this.f64691T.mo44614b1(8);
                return;
            }
            this.f64697c0.mo44614b1(8);
            this.f64691T.mo44614b1(0);
            ChatAttachmentContainer.C11728c c11728c2 = this.f64695a0;
            AbstractC19074t.m100205c(c11728c2);
            if (c11728c2.m65330h() == 3) {
                ChatAttachmentContainer.C11728c c11728c3 = this.f64695a0;
                AbstractC19074t.m100205c(c11728c3);
                if (c11728c3.m65328f() != null) {
                    ChatAttachmentContainer.C11728c c11728c4 = this.f64695a0;
                    AbstractC19074t.m100205c(c11728c4);
                    if (c11728c4.m65328f().f91251B != null) {
                        ChatAttachmentContainer.C11728c c11728c5 = this.f64695a0;
                        AbstractC19074t.m100205c(c11728c5);
                        C32098s c32098s = c11728c5.m65328f().f91251B;
                        this.f64698d0.mo44614b1(8);
                        this.f64699e0.mo44614b1(8);
                        if (c32098s.f147956f == 6) {
                            this.f64684M.mo44614b1(0);
                            this.f64685N.mo44614b1(8);
                            this.f64683L.mo44614b1(8);
                            this.f64684M.mo111925v1(AbstractC11531v0.Companion.m62609s());
                        } else {
                            this.f64684M.mo44614b1(8);
                            ChatAttachmentContainer.C11728c c11728c6 = this.f64695a0;
                            AbstractC19074t.m100205c(c11728c6);
                            if (c11728c6.m65328f().f91251B.m154937g() == EnumC27376c.f128983r) {
                                ChatAttachmentContainer.C11728c c11728c7 = this.f64695a0;
                                AbstractC19074t.m100205c(c11728c7);
                                if (c11728c7.m65328f().f91251B.f147976z) {
                                    ChatAttachmentContainer.C11728c c11728c8 = this.f64695a0;
                                    AbstractC19074t.m100205c(c11728c8);
                                    String m154934d = c11728c8.m65328f().f91251B.m154934d();
                                    AbstractC19074t.m100207e(m154934d, "getLocalPathThumbLink(...)");
                                    if (m154934d.length() > 0) {
                                        ChatAttachmentContainer.C11728c c11728c9 = this.f64695a0;
                                        AbstractC19074t.m100205c(c11728c9);
                                        m69737Y(c11728c9);
                                    } else {
                                        this.f64682K.mo44614b1(0);
                                    }
                                }
                            }
                            ChatAttachmentContainer.C11728c c11728c10 = this.f64695a0;
                            AbstractC19074t.m100205c(c11728c10);
                            if (c11728c10.m65328f().f91013r.length() > 0) {
                                this.f64683L.mo44614b1(0);
                                C23528a c23528a = this.f64692U;
                                C3977j c3977j = this.f64694W;
                                C21693c c21693c = this.f64683L;
                                ChatAttachmentContainer.C11728c c11728c11 = this.f64695a0;
                                AbstractC19074t.m100205c(c11728c11);
                                AbstractC23268y2.m120033g(c23528a, c3977j, c21693c, c11728c11.m65328f().f91013r, C23278z2.m120136k0(), false);
                                AbstractC19074t.m100205c(c32098s);
                                m69736X(c32098s);
                            } else {
                                m69735W();
                            }
                        }
                        if (!TextUtils.isEmpty(c32098s.f147952b)) {
                            this.f64686O.mo44614b1(0);
                            this.f64688Q.m111959G1(c32098s.f147952b);
                            if (!TextUtils.isEmpty(c32098s.f147973w)) {
                                this.f64687P.mo44614b1(0);
                                AbstractC23268y2.m120033g(this.f64692U, this.f64693V, this.f64687P, c32098s.f147973w, C23278z2.m120148p0(), false);
                            } else {
                                this.f64687P.mo44614b1(8);
                            }
                        } else {
                            this.f64687P.mo111924u1(null);
                            this.f64686O.mo44614b1(8);
                        }
                        if (!TextUtils.isEmpty(c32098s.f147953c)) {
                            this.f64689R.m111959G1(c32098s.f147953c);
                            this.f64689R.mo44614b1(0);
                        } else {
                            this.f64689R.mo44614b1(8);
                            C22126c0 c22126c0 = this.f64690S;
                            if (c22126c0 != null) {
                                c22126c0.m111953A1(4);
                            }
                        }
                        int i11 = c32098s.f147956f;
                        if (i11 != 1 && i11 != 3) {
                            ChatAttachmentContainer.C11728c c11728c12 = this.f64695a0;
                            AbstractC19074t.m100205c(c11728c12);
                            str = c11728c12.m65328f().f91015t;
                        } else {
                            str = c32098s.f147957g;
                            if (str == null) {
                                str = "";
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C22126c0 c22126c02 = this.f64690S;
                            if (c22126c02 != null) {
                                c22126c02.m111959G1(str);
                            }
                            C22126c0 c22126c03 = this.f64690S;
                            if (c22126c03 != null) {
                                c22126c03.mo44614b1(0);
                                return;
                            }
                            return;
                        }
                        C22126c0 c22126c04 = this.f64690S;
                        if (c22126c04 != null) {
                            c22126c04.mo44614b1(8);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final C23528a getMAQuery() {
        return this.f64692U;
    }

    public final C22126c0 getMDescTxt() {
        return this.f64690S;
    }

    public final void setMAQuery(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f64692U = c23528a;
    }

    public final void setMDescTxt(C22126c0 c22126c0) {
        this.f64690S = c22126c0;
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        ChatAttachmentContainer.ViewOnClickListenerC11730e viewOnClickListenerC11730e;
        AbstractC19074t.m100208f(c16719g, "module");
        if (AbstractC19074t.m100204b(c16719g, this.f64691T) && (viewOnClickListenerC11730e = this.f64696b0) != null) {
            viewOnClickListenerC11730e.onClick(this);
        }
    }
}
