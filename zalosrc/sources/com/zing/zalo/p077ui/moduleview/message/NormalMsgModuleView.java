package com.zing.zalo.p077ui.moduleview.message;

import ag0.C0804b;
import ag0.C0814e0;
import am.C0943w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.graphics.drawable.AbstractC1414a;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.maintab.msg.AbstractC12211a;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.avatar.EnumC16947c;
import dj.C17975k0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19636i1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l80.C22126c0;
import lb0.C22422x;
import ln0.AbstractC22543l;
import me0.AbstractC23028c0;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p019aj.C0872f;
import p132ej.C18440b;
import p132ej.C18446h;
import p132ej.C18451m;
import p162fh.C18932a;
import p162fh.C18935d;
import p173fz.C19172a;
import p207he.C20012f;
import p210hh.C20060c;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p304ks.C21914b;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p495rx.C25994h;
import p577vj.C28266a;
import p716zh.C31924g1;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import ui0.C27280g;
import vg.C28203u6;
import vl0.AbstractC28291a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class NormalMsgModuleView extends TabMsgCommonItemModuleView {

    /* renamed from: E0 */
    private static int f64927E0;

    /* renamed from: F0 */
    private static int f64928F0;

    /* renamed from: G0 */
    private static int f64929G0;

    /* renamed from: H0 */
    private static int f64930H0;

    /* renamed from: I0 */
    private static int f64931I0;

    /* renamed from: J0 */
    private static int f64932J0;

    /* renamed from: K0 */
    private static int f64933K0;

    /* renamed from: L0 */
    private static int f64934L0;

    /* renamed from: N0 */
    private static final int f64936N0;

    /* renamed from: O0 */
    private static final int f64937O0;

    /* renamed from: P0 */
    private static final int f64938P0;

    /* renamed from: A0 */
    private C22126c0 f64939A0;

    /* renamed from: B0 */
    private C21693c f64940B0;

    /* renamed from: C0 */
    private final InterfaceC24854k f64941C0;

    /* renamed from: D0 */
    private final InterfaceC24854k f64942D0;

    /* renamed from: i0 */
    private final InterfaceC12426b f64943i0;

    /* renamed from: j0 */
    private final int f64944j0;

    /* renamed from: k0 */
    private C21693c f64945k0;

    /* renamed from: l0 */
    private C21693c f64946l0;

    /* renamed from: m0 */
    private final C21693c f64947m0;

    /* renamed from: n0 */
    private C16977g f64948n0;

    /* renamed from: o0 */
    private C21693c f64949o0;

    /* renamed from: p0 */
    private C16716d f64950p0;

    /* renamed from: q0 */
    private C21693c f64951q0;

    /* renamed from: r0 */
    private C22126c0 f64952r0;

    /* renamed from: s0 */
    private C16716d f64953s0;

    /* renamed from: t0 */
    private C16716d f64954t0;

    /* renamed from: u0 */
    private C21693c f64955u0;

    /* renamed from: v0 */
    private C22126c0 f64956v0;

    /* renamed from: w0 */
    private C16716d f64957w0;

    /* renamed from: x0 */
    private C21693c f64958x0;

    /* renamed from: y0 */
    private C22126c0 f64959y0;

    /* renamed from: z0 */
    private C16716d f64960z0;
    public static final C12425a Companion = new C12425a(null);

    /* renamed from: M0 */
    private static final int f64935M0 = AbstractC23222t7.f112586t;

    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalMsgModuleView$a */
    /* loaded from: classes6.dex */
    public static final class C12425a {
        private C12425a() {
        }

        public /* synthetic */ C12425a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m69827b(C12425a c12425a, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                z11 = false;
            }
            return c12425a.m69828a(i11, z11);
        }

        /* renamed from: a */
        public final String m69828a(int i11, boolean z11) {
            if (z11) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_N_character);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            }
            if (i11 <= 5) {
                return String.valueOf(i11);
            }
            if (C0872f.Companion.m2569a().m2525T() && C19172a.m100600k("features@jump_csc@unread_limit", 0) != 0) {
                if (i11 > 999) {
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unread_over);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    return m118743r02;
                }
                return String.valueOf(i11);
            }
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_over_5);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            return m118743r03;
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalMsgModuleView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12426b {
        /* renamed from: Sh */
        boolean mo68343Sh(String str);

        /* renamed from: c2 */
        void mo68357c2(String str, int i11);
    }

    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalMsgModuleView$c */
    /* loaded from: classes6.dex */
    static final class C12427c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12427c f64961q = new C12427c();

        C12427c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar mo12V4() {
            return Calendar.getInstance();
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.message.NormalMsgModuleView$d */
    /* loaded from: classes6.dex */
    static final class C12428d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12428d f64962q = new C12428d();

        C12428d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar mo12V4() {
            return Calendar.getInstance();
        }
    }

    static {
        int i11 = AbstractC23222t7.f112576o;
        f64936N0 = i11;
        f64937O0 = i11;
        f64938P0 = AbstractC23222t7.f112556e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalMsgModuleView(Context context, C12260j c12260j, InterfaceC12426b interfaceC12426b, int i11) {
        super(context, c12260j);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f64943i0 = interfaceC12426b;
        this.f64944j0 = i11;
        C21693c c21693c = new C21693c(context);
        this.f64947m0 = c21693c;
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_group_solid_16, AbstractC2807a.chat_community_badge_icon));
        c21693c.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_community_icon_tab_message));
        C16718f m89106L = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112594x;
        m89106L.m89028L(i12, i12).m89041Y(AbstractC23222t7.f112552c).m89035S(AbstractC23222t7.f112556e);
        c21693c.mo44614b1(8);
        getMListItemModule().m90808J1(c21693c);
        C21693c c21693c2 = new C21693c(context);
        this.f64949o0 = c21693c2;
        C16718f m89106L2 = c21693c2.m89106L();
        int i13 = AbstractC23222t7.f112586t;
        m89106L2.m89028L(i13, i13).m89035S(AbstractC23222t7.f112556e).m89027K(true).m89073z(Boolean.TRUE);
        getMListItemModule().m90803E1(this.f64949o0);
        getMListItemModule().m90816r1(m69813O0());
        getMListItemModule().m90813o1(m69815Q0());
        m129210a = AbstractC24856m.m129210a(C12427c.f64961q);
        this.f64941C0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C12428d.f64962q);
        this.f64942D0 = m129210a2;
    }

    /* renamed from: A0 */
    private final void m69799A0(C18440b c18440b, C31924g1 c31924g1) {
        String m118743r0;
        C17975k0 c17975k0 = c31924g1.f146662c;
        if (c17975k0 == null) {
            return;
        }
        this.f64949o0.mo44614b1(0);
        C18446h m97730p = c18440b.m97730p();
        if (m97730p != null && m97730p.m97758w()) {
            if (c17975k0.f91038a == 0) {
                this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62574g0());
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_audio_success_outgoing_call_info);
            } else {
                this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62504I0());
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_video_success_outgoing_call_info);
            }
            AbstractC19074t.m100205c(m118743r0);
        } else {
            if (c17975k0.f91038a == 0) {
                this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62571f0());
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_audio_success_incoming_call_info);
            } else {
                this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62501H0());
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_video_success_incoming_call_info);
            }
            AbstractC19074t.m100205c(m118743r0);
        }
        getMListItemModule().m90800B1(m118743r0);
    }

    /* renamed from: B0 */
    private final boolean m69800B0(final C18440b c18440b) {
        C18446h m97730p;
        C31924g1 m97751m;
        final C17975k0 c17975k0;
        int i11;
        C21693c c21693c = this.f64940B0;
        C21693c c21693c2 = null;
        if (c21693c == null) {
            AbstractC19074t.m100223u("mCallBackButton");
            c21693c = null;
        }
        c21693c.mo44614b1(8);
        if (this.f64944j0 == 3 || (m97730p = c18440b.m97730p()) == null || (m97751m = m97730p.m97751m()) == null || (c17975k0 = m97751m.f146662c) == null || !AbstractC19074t.m100204b(m97751m.f146660a, "recommened.misscall") || AbstractC23309i.m121195Me() == 0 || C21914b.f107731a.m114200k(c18440b.mo97719a()) || AbstractC19646n0.m102951Z0(c18440b.m97729o()) || !m97751m.f146662c.m95615a() || AbstractC23306f.m120579F1().mo124314i() - c18440b.m97734t() > AbstractC23304d.f113255A1) {
            return false;
        }
        C21693c c21693c3 = this.f64940B0;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mCallBackButton");
            c21693c3 = null;
        }
        c21693c3.mo44614b1(0);
        getMLine1RightSide().mo44614b1(8);
        getMLine2RightSide().mo44614b1(8);
        if (c17975k0.f91038a == 0) {
            i11 = AbstractC16803z.ic_call_audio_call_back_button;
        } else {
            i11 = AbstractC16803z.ic_call_video_call_back_button;
        }
        C21693c c21693c4 = this.f64940B0;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("mCallBackButton");
            c21693c4 = null;
        }
        c21693c4.mo111926w1(i11);
        C21693c c21693c5 = this.f64940B0;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("mCallBackButton");
        } else {
            c21693c2 = c21693c5;
        }
        c21693c2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.i
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                NormalMsgModuleView.m69801C0(NormalMsgModuleView.this, c18440b, c17975k0, c16719g);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m69801C0(NormalMsgModuleView normalMsgModuleView, C18440b c18440b, C17975k0 c17975k0, C16719g c16719g) {
        AbstractC19074t.m100208f(normalMsgModuleView, "this$0");
        AbstractC19074t.m100208f(c18440b, "$chatItem");
        AbstractC19074t.m100208f(c17975k0, "$richContentCall");
        InterfaceC12426b interfaceC12426b = normalMsgModuleView.f64943i0;
        if (interfaceC12426b != null) {
            interfaceC12426b.mo68357c2(c18440b.mo97719a(), c17975k0.f91038a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.zing.zalo.uidrawing.d] */
    /* JADX WARN: Type inference failed for: r12v26, types: [com.zing.zalo.uidrawing.d] */
    /* JADX WARN: Type inference failed for: r12v27, types: [com.zing.zalo.uidrawing.d] */
    /* renamed from: D0 */
    private final boolean m69802D0(C18440b c18440b) {
        Drawable m118665N;
        Object m131207g0;
        Object m131207g02;
        C22126c0 c22126c0 = null;
        if (!C18932a.f94442a.m99186j()) {
            ?? r12 = this.f64953s0;
            if (r12 == 0) {
                AbstractC19074t.m100223u("mChatTagContainer");
            } else {
                c22126c0 = r12;
            }
            c22126c0.mo44614b1(8);
            return false;
        }
        String mo97719a = c18440b.mo97719a();
        List m99228p = C18935d.Companion.m99234a().m99228p(mo97719a);
        if (m99228p.isEmpty()) {
            ?? r122 = this.f64953s0;
            if (r122 == 0) {
                AbstractC19074t.m100223u("mChatTagContainer");
            } else {
                c22126c0 = r122;
            }
            c22126c0.mo44614b1(8);
            return false;
        }
        C16716d c16716d = this.f64953s0;
        if (c16716d == null) {
            AbstractC19074t.m100223u("mChatTagContainer");
            c16716d = null;
        }
        c16716d.mo44614b1(0);
        if (m69816t0(mo97719a)) {
            C16716d c16716d2 = this.f64953s0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mChatTagContainer");
                c16716d2 = null;
            }
            m118665N = AbstractC23136l9.m118665N(c16716d2.getContext(), AbstractC16803z.bg_input_chip_tag_msg_item_pin);
        } else {
            C16716d c16716d3 = this.f64953s0;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mChatTagContainer");
                c16716d3 = null;
            }
            m118665N = AbstractC23136l9.m118665N(c16716d3.getContext(), AbstractC16803z.bg_input_chip_tag_msg_item);
        }
        C16716d c16716d4 = this.f64954t0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mFirstTagView");
            c16716d4 = null;
        }
        c16716d4.m89085A0(m118665N);
        C16716d c16716d5 = this.f64957w0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mSecondTagView");
            c16716d5 = null;
        }
        c16716d5.m89085A0(m118665N);
        C16716d c16716d6 = this.f64960z0;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mMoreTagView");
            c16716d6 = null;
        }
        c16716d6.m89085A0(m118665N);
        m131207g0 = AbstractC25332a0.m131207g0(m99228p, 0);
        C20060c c20060c = (C20060c) m131207g0;
        if (c20060c != null) {
            C16716d c16716d7 = this.f64954t0;
            if (c16716d7 == null) {
                AbstractC19074t.m100223u("mFirstTagView");
                c16716d7 = null;
            }
            c16716d7.mo44614b1(0);
            C22126c0 c22126c02 = this.f64956v0;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mFirstTagTitle");
                c22126c02 = null;
            }
            c22126c02.m111959G1(c20060c.m104217f(30));
            Context context = c16716d7.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.icon_tag_in_tab_msg);
            int parseColor = Color.parseColor(c20060c.m104212a());
            if (m139658a != null) {
                AbstractC1414a.m7196n(m139658a, parseColor);
                C21693c c21693c = this.f64955u0;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("mFirstTagIcon");
                    c21693c = null;
                }
                c21693c.mo111925v1(m139658a);
            }
        } else {
            C16716d c16716d8 = this.f64954t0;
            if (c16716d8 == null) {
                AbstractC19074t.m100223u("mFirstTagView");
                c16716d8 = null;
            }
            c16716d8.mo44614b1(8);
        }
        m131207g02 = AbstractC25332a0.m131207g0(m99228p, 1);
        C20060c c20060c2 = (C20060c) m131207g02;
        if (c20060c2 != null) {
            C16716d c16716d9 = this.f64957w0;
            if (c16716d9 == null) {
                AbstractC19074t.m100223u("mSecondTagView");
                c16716d9 = null;
            }
            c16716d9.mo44614b1(0);
            C22126c0 c22126c03 = this.f64959y0;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mSecondTagTitle");
                c22126c03 = null;
            }
            c22126c03.m111959G1(c20060c2.m104217f(30));
            Context context2 = c16716d9.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            Drawable m139658a2 = C27280g.m139658a(context2, AbstractC16803z.icon_tag_in_tab_msg);
            int parseColor2 = Color.parseColor(c20060c2.m104212a());
            if (m139658a2 != null) {
                AbstractC1414a.m7196n(m139658a2, parseColor2);
                C21693c c21693c2 = this.f64958x0;
                if (c21693c2 == null) {
                    AbstractC19074t.m100223u("mSecondTagIcon");
                    c21693c2 = null;
                }
                c21693c2.mo111925v1(m139658a2);
            }
        } else {
            C16716d c16716d10 = this.f64957w0;
            if (c16716d10 == null) {
                AbstractC19074t.m100223u("mSecondTagView");
                c16716d10 = null;
            }
            c16716d10.mo44614b1(8);
        }
        int size = m99228p.size() - 2;
        if (size > 0) {
            C16716d c16716d11 = this.f64960z0;
            if (c16716d11 == null) {
                AbstractC19074t.m100223u("mMoreTagView");
                c16716d11 = null;
            }
            c16716d11.mo44614b1(0);
            C22126c0 c22126c04 = this.f64939A0;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mMoreTagTitle");
            } else {
                c22126c0 = c22126c04;
            }
            c22126c0.m111959G1("+" + size);
        } else {
            ?? r02 = this.f64960z0;
            if (r02 == 0) {
                AbstractC19074t.m100223u("mMoreTagView");
            } else {
                c22126c0 = r02;
            }
            c22126c0.mo44614b1(8);
        }
        return true;
    }

    /* renamed from: E0 */
    private final void m69803E0() {
        this.f64949o0.mo44614b1(0);
        this.f64949o0.mo111926w1(AbstractC23322a.zds_ffic_attachment_colored_48);
        getMListItemModule().m90801C1(f64929G0);
        C16959c0 mListItemModule = getMListItemModule();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_downloading);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        mListItemModule.m90800B1(m118743r0);
    }

    /* renamed from: F0 */
    private final void m69804F0(C18440b c18440b) {
        C16716d c16716d = null;
        if (m69809K0(c18440b, m69802D0(c18440b))) {
            C16716d c16716d2 = this.f64950p0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mExtraDataContainer");
            } else {
                c16716d = c16716d2;
            }
            c16716d.mo44614b1(0);
            return;
        }
        C16716d c16716d3 = this.f64950p0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mExtraDataContainer");
        } else {
            c16716d = c16716d3;
        }
        c16716d.mo44614b1(8);
    }

    /* renamed from: G0 */
    private final void m69805G0(boolean z11) {
        if (z11) {
            this.f64949o0.mo44614b1(0);
            this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62592m0());
            C16959c0 mListItemModule = getMListItemModule();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_ongoing_status);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            mListItemModule.m90800B1(m118743r0);
            getMListItemModule().m90801C1(f64934L0);
            return;
        }
        C16959c0 mListItemModule2 = getMListItemModule();
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_ended_status);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        mListItemModule2.m90800B1(m118743r02);
    }

    /* renamed from: H0 */
    private final void m69806H0(String str) {
        int i11;
        boolean m2033i = C0804b.m2025g().m2033i(str);
        boolean m69816t0 = m69816t0(str);
        C21693c c21693c = this.f64946l0;
        C21693c c21693c2 = null;
        if (c21693c == null) {
            AbstractC19074t.m100223u("mPinIcon");
            c21693c = null;
        }
        int i12 = 8;
        if (m69816t0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c21693c.mo44614b1(i11);
        C21693c c21693c3 = this.f64945k0;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mMuteIcon");
        } else {
            c21693c2 = c21693c3;
        }
        if (m2033i) {
            i12 = 0;
        }
        c21693c2.mo44614b1(i12);
    }

    /* renamed from: I0 */
    private final void m69807I0(String str) {
        m69812N0(str);
    }

    /* renamed from: J0 */
    private final void m69808J0(C18440b c18440b, C31924g1 c31924g1, boolean z11) {
        String m118743r0;
        C17975k0 c17975k0 = c31924g1.f146662c;
        if (c17975k0 == null) {
            return;
        }
        C16716d c16716d = this.f64950p0;
        if (c16716d == null) {
            AbstractC19074t.m100223u("mExtraDataContainer");
            c16716d = null;
        }
        c16716d.mo44614b1(8);
        this.f64949o0.mo44614b1(0);
        C18446h m97730p = c18440b.m97730p();
        if (m97730p != null && m97730p.m97758w()) {
            if (c17975k0.f91038a == 0) {
                int i11 = c17975k0.f91040c;
                if (i11 != 3 && i11 != 4 && i11 != 5) {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62574g0());
                } else {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62565d0());
                }
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_audio_failed_outgoing_call_info);
                AbstractC19074t.m100205c(m118743r0);
            } else {
                int i12 = c17975k0.f91040c;
                if (i12 != 3 && i12 != 4 && i12 != 5) {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62504I0());
                } else {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62495F0());
                }
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_video_failed_outgoing_call_info);
                AbstractC19074t.m100205c(m118743r0);
            }
        } else {
            if (c17975k0.f91038a == 0) {
                if (z11) {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62568e0());
                } else {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62565d0());
                }
                if (c17975k0.f91040c == 3) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_audio_declined_incoming_call_info);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_audio_failed_incoming_call_info);
                }
                AbstractC19074t.m100205c(m118743r0);
            } else {
                if (z11) {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62498G0());
                } else {
                    this.f64949o0.mo111925v1(AbstractC11531v0.Companion.m62495F0());
                }
                if (c17975k0.f91040c == 3) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_video_declined_incoming_call_info);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_video_failed_incoming_call_info);
                }
                AbstractC19074t.m100205c(m118743r0);
            }
            if (z11) {
                getMListItemModule().m90801C1(f64930H0);
            }
        }
        getMListItemModule().m90800B1(m118743r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027c  */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m69809K0(C18440b c18440b, boolean z11) {
        C31973j5 c31973j5;
        boolean z12;
        boolean z13;
        C22126c0 c22126c0;
        int i11;
        C22126c0 c22126c02;
        CharSequence m111973m1;
        C28266a m102752J;
        C21693c c21693c;
        C22126c0 c22126c03;
        float m116579b;
        C21693c c21693c2;
        C21693c c21693c3;
        C22126c0 c22126c04;
        String m118085e;
        C22126c0 c22126c05;
        int i12;
        String str;
        C31924g1 m97751m;
        C22126c0 c22126c06 = null;
        if (z11) {
            C21693c c21693c4 = this.f64951q0;
            if (c21693c4 == null) {
                AbstractC19074t.m100223u("mOtherInfoIcon");
                c21693c4 = null;
            }
            c21693c4.mo44614b1(8);
            C22126c0 c22126c07 = this.f64952r0;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("mOtherInfoMessage");
            } else {
                c22126c06 = c22126c07;
            }
            c22126c06.mo44614b1(8);
            return true;
        }
        String mo97719a = c18440b.mo97719a();
        if (c18440b.mo97724g()) {
            c31973j5 = C0943w.m4462l().m4472f(mo97719a);
        } else {
            c31973j5 = null;
        }
        C21693c c21693c5 = this.f64951q0;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("mOtherInfoIcon");
            c21693c5 = null;
        }
        c21693c5.mo44614b1(8);
        C22126c0 c22126c08 = this.f64952r0;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c08 = null;
        }
        c22126c08.mo44614b1(8);
        C22126c0 c22126c09 = this.f64952r0;
        if (c22126c09 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c09 = null;
        }
        c22126c09.mo111965M1(0);
        C21693c c21693c6 = this.f64951q0;
        if (c21693c6 == null) {
            AbstractC19074t.m100223u("mOtherInfoIcon");
            c21693c6 = null;
        }
        c21693c6.m89106L().m89028L(-2, -2);
        if (c31973j5 != null) {
            if (C20012f.f98380a.m103860l(c31973j5.m153781r())) {
                C18446h m97730p = c18440b.m97730p();
                if (m97730p != null && (m97751m = m97730p.m97751m()) != null) {
                    str = m97751m.f146660a;
                } else {
                    str = null;
                }
                if (!AbstractC19074t.m100204b("recommened.groupcall", str)) {
                    C21693c c21693c7 = this.f64951q0;
                    if (c21693c7 == null) {
                        AbstractC19074t.m100223u("mOtherInfoIcon");
                        c21693c7 = null;
                    }
                    c21693c7.mo44614b1(0);
                    C22126c0 c22126c010 = this.f64952r0;
                    if (c22126c010 == null) {
                        AbstractC19074t.m100223u("mOtherInfoMessage");
                        c22126c010 = null;
                    }
                    c22126c010.mo44614b1(0);
                    C21693c c21693c8 = this.f64951q0;
                    if (c21693c8 == null) {
                        AbstractC19074t.m100223u("mOtherInfoIcon");
                        c21693c8 = null;
                    }
                    C16718f m89106L = c21693c8.m89106L();
                    int i13 = f64936N0;
                    m89106L.m89028L(i13, i13);
                    C21693c c21693c9 = this.f64951q0;
                    if (c21693c9 == null) {
                        AbstractC19074t.m100223u("mOtherInfoIcon");
                        c21693c9 = null;
                    }
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    c21693c9.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_video_solid_16, AbstractC2807a.support_success));
                    C22126c0 c22126c011 = this.f64952r0;
                    if (c22126c011 == null) {
                        AbstractC19074t.m100223u("mOtherInfoMessage");
                        c22126c011 = null;
                    }
                    c22126c011.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_ongoing_status));
                    z12 = false;
                    z13 = true;
                    if (!z12 && !z13 && (m102752J = C19636i1.Companion.m102800a().m102752J(mo97719a)) != null) {
                        c21693c = this.f64951q0;
                        if (c21693c == null) {
                            AbstractC19074t.m100223u("mOtherInfoIcon");
                            c21693c = null;
                        }
                        c21693c.mo44614b1(0);
                        c22126c03 = this.f64952r0;
                        if (c22126c03 == null) {
                            AbstractC19074t.m100223u("mOtherInfoMessage");
                            c22126c03 = null;
                        }
                        c22126c03.mo44614b1(0);
                        float m76962c = C13778s1.m76962c();
                        int i14 = f64937O0;
                        m116579b = AbstractC22543l.m116579b(i14 * m76962c, i14 * 1.0f);
                        int i15 = (int) m116579b;
                        c21693c2 = this.f64951q0;
                        if (c21693c2 == null) {
                            AbstractC19074t.m100223u("mOtherInfoIcon");
                            c21693c2 = null;
                        }
                        c21693c2.m89106L().m89028L(i15, i15);
                        c21693c3 = this.f64951q0;
                        if (c21693c3 == null) {
                            AbstractC19074t.m100223u("mOtherInfoIcon");
                            c21693c3 = null;
                        }
                        c21693c3.mo111925v1(new C22422x(m102752J.m142384c(), i15 - AbstractC23136l9.m118742r(2.0f)));
                        c22126c04 = this.f64952r0;
                        if (c22126c04 == null) {
                            AbstractC19074t.m100223u("mOtherInfoMessage");
                            c22126c04 = null;
                        }
                        c22126c04.mo111965M1(1);
                        m118085e = AbstractC23028c0.m118085e(C28203u6.m141800i(C28203u6.f131407a, m102752J.m142388g(), false, 2, null), false, AbstractC8020f0.str_me);
                        if (m118085e.length() == 0) {
                            m118085e = m102752J.m142387f();
                        }
                        if (c18440b.mo97724g()) {
                            m118085e = AbstractC23184q2.m119453k(m102752J.m142388g(), m118085e, mo97719a);
                        }
                        c22126c05 = this.f64952r0;
                        if (c22126c05 == null) {
                            AbstractC19074t.m100223u("mOtherInfoMessage");
                            c22126c05 = null;
                        }
                        c22126c05.m111959G1(m118085e);
                    }
                    c22126c0 = this.f64952r0;
                    if (c22126c0 == null) {
                        AbstractC19074t.m100223u("mOtherInfoMessage");
                        c22126c0 = null;
                    }
                    if (mo69825r0(c18440b, mo69782q0(c18440b)) && !z13) {
                        i11 = f64928F0;
                    } else {
                        i11 = f64927E0;
                    }
                    c22126c0.m111962J1(i11);
                    c22126c02 = this.f64952r0;
                    if (c22126c02 == null) {
                        AbstractC19074t.m100223u("mOtherInfoMessage");
                    } else {
                        c22126c06 = c22126c02;
                    }
                    m111973m1 = c22126c06.m111973m1();
                    AbstractC19074t.m100207e(m111973m1, "getText(...)");
                    if (m111973m1.length() > 0) {
                        return true;
                    }
                    return false;
                }
            }
            if (c31973j5.m153713E() > 0 && c31973j5.m153742T()) {
                C21693c c21693c10 = this.f64951q0;
                if (c21693c10 == null) {
                    AbstractC19074t.m100223u("mOtherInfoIcon");
                    c21693c10 = null;
                }
                c21693c10.mo44614b1(0);
                C22126c0 c22126c012 = this.f64952r0;
                if (c22126c012 == null) {
                    AbstractC19074t.m100223u("mOtherInfoMessage");
                    c22126c012 = null;
                }
                c22126c012.mo44614b1(0);
                C21693c c21693c11 = this.f64951q0;
                if (c21693c11 == null) {
                    AbstractC19074t.m100223u("mOtherInfoIcon");
                    c21693c11 = null;
                }
                C16718f m89106L2 = c21693c11.m89106L();
                int i16 = f64935M0;
                m89106L2.m89028L(i16, i16);
                C21693c c21693c12 = this.f64951q0;
                if (c21693c12 == null) {
                    AbstractC19074t.m100223u("mOtherInfoIcon");
                    c21693c12 = null;
                }
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                c21693c12.mo111925v1(C27280g.m139659b(context2, AbstractC23322a.zds_ic_user_solid_24, AbstractC2808b.skb60));
                C22126c0 c22126c013 = this.f64952r0;
                if (c22126c013 == null) {
                    AbstractC19074t.m100223u("mOtherInfoMessage");
                    c22126c013 = null;
                }
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
                c22126c013.m111959G1(format);
                z12 = true;
                z13 = false;
                if (!z12) {
                    c21693c = this.f64951q0;
                    if (c21693c == null) {
                    }
                    c21693c.mo44614b1(0);
                    c22126c03 = this.f64952r0;
                    if (c22126c03 == null) {
                    }
                    c22126c03.mo44614b1(0);
                    float m76962c2 = C13778s1.m76962c();
                    int i142 = f64937O0;
                    m116579b = AbstractC22543l.m116579b(i142 * m76962c2, i142 * 1.0f);
                    int i152 = (int) m116579b;
                    c21693c2 = this.f64951q0;
                    if (c21693c2 == null) {
                    }
                    c21693c2.m89106L().m89028L(i152, i152);
                    c21693c3 = this.f64951q0;
                    if (c21693c3 == null) {
                    }
                    c21693c3.mo111925v1(new C22422x(m102752J.m142384c(), i152 - AbstractC23136l9.m118742r(2.0f)));
                    c22126c04 = this.f64952r0;
                    if (c22126c04 == null) {
                    }
                    c22126c04.mo111965M1(1);
                    m118085e = AbstractC23028c0.m118085e(C28203u6.m141800i(C28203u6.f131407a, m102752J.m142388g(), false, 2, null), false, AbstractC8020f0.str_me);
                    if (m118085e.length() == 0) {
                    }
                    if (c18440b.mo97724g()) {
                    }
                    c22126c05 = this.f64952r0;
                    if (c22126c05 == null) {
                    }
                    c22126c05.m111959G1(m118085e);
                }
                c22126c0 = this.f64952r0;
                if (c22126c0 == null) {
                }
                if (mo69825r0(c18440b, mo69782q0(c18440b))) {
                }
                i11 = f64927E0;
                c22126c0.m111962J1(i11);
                c22126c02 = this.f64952r0;
                if (c22126c02 == null) {
                }
                m111973m1 = c22126c06.m111973m1();
                AbstractC19074t.m100207e(m111973m1, "getText(...)");
                if (m111973m1.length() > 0) {
                }
            } else {
                C25994h c25994h = C25994h.f124017a;
                if (!c25994h.m133919h(mo97719a).m133964p().isEmpty()) {
                    Object obj = c25994h.m133919h(mo97719a).m133964p().get(0);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    C7904b c7904b = (C7904b) obj;
                    if (c7904b.m40778p() && c7904b.m40776n()) {
                        C22126c0 c22126c014 = this.f64952r0;
                        if (c22126c014 == null) {
                            AbstractC19074t.m100223u("mOtherInfoMessage");
                            c22126c014 = null;
                        }
                        C21693c c21693c13 = this.f64951q0;
                        if (c21693c13 == null) {
                            AbstractC19074t.m100223u("mOtherInfoIcon");
                            c21693c13 = null;
                        }
                        AbstractC23184q2.m119441F(c22126c014, c21693c13, c7904b);
                    }
                }
            }
        }
        z12 = false;
        z13 = false;
        if (!z12) {
        }
        c22126c0 = this.f64952r0;
        if (c22126c0 == null) {
        }
        if (mo69825r0(c18440b, mo69782q0(c18440b))) {
        }
        i11 = f64927E0;
        c22126c0.m111962J1(i11);
        c22126c02 = this.f64952r0;
        if (c22126c02 == null) {
        }
        m111973m1 = c22126c06.m111973m1();
        AbstractC19074t.m100207e(m111973m1, "getText(...)");
        if (m111973m1.length() > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m69810L0(C18440b c18440b) {
        boolean m127120J;
        String mo97719a = c18440b.mo97719a();
        int i11 = 0;
        C16974f c16974f = null;
        if (c18440b.m97735u() == 35) {
            m127120J = AbstractC24341v.m127120J(mo97719a, "-", false, 2, null);
            if (!m127120J) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                c16974f = new C16974f(context);
                c16974f.m90974x(EnumC16991i.NEW_TEXT);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_cm_new_indicator);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                c16974f.m90972v(m118743r0);
                if (c16974f != null) {
                    getMListItemModule().m90819v1().m90983u1(c16974f);
                }
                C16977g m90819v1 = getMListItemModule().m90819v1();
                if (c16974f == null) {
                    i11 = 8;
                }
                m90819v1.mo44614b1(i11);
            }
        }
        if (AbstractC23304d.f113448v2.containsKey(mo97719a)) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            c16974f = new C16974f(context2);
            c16974f.m90974x(EnumC16991i.CUSTOM);
            c16974f.m90971u(EnumC16980h.SIZE_16);
            c16974f.m90965o(C23212s8.m119606n(AbstractC28291a.layer_background_selected_alt));
            c16974f.m90967q(C27280g.m139660c(c16974f.m90953c(), AbstractC23322a.zds_ic_center_dot_line_16, AbstractC2807a.support_error));
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.ls_live);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            c16974f.m90972v(m118743r02);
            c16974f.m90973w(TabMsgCommonItemModuleView.Companion.m69868h());
        }
        if (c16974f != null) {
        }
        C16977g m90819v12 = getMListItemModule().m90819v1();
        if (c16974f == null) {
        }
        m90819v12.mo44614b1(i11);
    }

    /* renamed from: M0 */
    private final void m69811M0(C18440b c18440b) {
        if (m69800B0(c18440b)) {
            getMListItemModule().m90811M1(0);
        } else {
            getMListItemModule().m90811M1(8);
        }
    }

    /* renamed from: N0 */
    private final void m69812N0(String str) {
        C16977g c16977g = null;
        if (C19636i1.Companion.m102800a().m102749H(str) != null) {
            C16977g c16977g2 = this.f64948n0;
            if (c16977g2 == null) {
                AbstractC19074t.m100223u("mMentionBadge");
            } else {
                c16977g = c16977g2;
            }
            c16977g.mo44614b1(0);
            return;
        }
        C16977g c16977g3 = this.f64948n0;
        if (c16977g3 == null) {
            AbstractC19074t.m100223u("mMentionBadge");
        } else {
            c16977g = c16977g3;
        }
        c16977g.mo44614b1(8);
    }

    /* renamed from: O0 */
    private final C21693c m69813O0() {
        C21693c c21693c = new C21693c(getContext());
        this.f64940B0 = c21693c;
        return c21693c;
    }

    /* renamed from: P0 */
    private final C16716d m69814P0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, -2).m89073z(Boolean.TRUE).m89036T(AbstractC23136l9.m118742r(4.0f));
        c16716d.mo44614b1(8);
        this.f64953s0 = c16716d;
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(14.06f), AbstractC23136l9.m118742r(8.49f)).m89027K(true).m89035S(AbstractC23136l9.m118742r(4.97f));
        c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.icon_tag_in_tab_msg));
        this.f64955u0 = c21693c;
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        C21693c c21693c2 = this.f64955u0;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mFirstTagIcon");
            c21693c2 = null;
        }
        m89028L.m89054h0(c21693c2).m89027K(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m111953A1(1);
        c22126c0.m111984z1(AbstractC23136l9.m118759w1(2), 0.0f);
        c22126c0.m89132a1(AbstractC23136l9.m118759w1(-1));
        c22126c0.m111962J1(C23212s8.m119606n(AbstractC2807a.text_02));
        c22126c0.mo111964L1(AbstractC23136l9.m118759w1(12));
        this.f64956v0 = c22126c0;
        C16716d c16716d2 = new C16716d(getContext());
        c16716d2.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(4.0f)).m89042Z(AbstractC23136l9.m118742r(6.73f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(2.0f)).m89027K(true);
        c16716d2.m89085A0(AbstractC23136l9.m118665N(c16716d2.getContext(), AbstractC16803z.bg_input_chip_tag_msg_item));
        C21693c c21693c3 = this.f64955u0;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mFirstTagIcon");
            c21693c3 = null;
        }
        c16716d2.m89001g1(c21693c3);
        C22126c0 c22126c02 = this.f64956v0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mFirstTagTitle");
            c22126c02 = null;
        }
        c16716d2.m89001g1(c22126c02);
        this.f64954t0 = c16716d2;
        C21693c c21693c4 = new C21693c(getContext());
        c21693c4.m89106L().m89028L(AbstractC23136l9.m118742r(14.06f), AbstractC23136l9.m118742r(8.49f)).m89027K(true).m89035S(AbstractC23136l9.m118742r(4.97f));
        c21693c4.mo111925v1(AbstractC23136l9.m118665N(c21693c4.getContext(), AbstractC16803z.icon_tag_in_tab_msg));
        this.f64958x0 = c21693c4;
        C22126c0 c22126c03 = new C22126c0(getContext());
        C16718f m89028L2 = c22126c03.m89106L().m89028L(-2, -2);
        C21693c c21693c5 = this.f64958x0;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("mSecondTagIcon");
            c21693c5 = null;
        }
        m89028L2.m89054h0(c21693c5).m89027K(true);
        c22126c03.m111980v1(truncateAt);
        c22126c03.m111953A1(1);
        c22126c03.m111984z1(AbstractC23136l9.m118759w1(2), 0.0f);
        c22126c03.m89132a1(AbstractC23136l9.m118759w1(-1));
        c22126c03.m111962J1(C23212s8.m119606n(AbstractC2807a.text_02));
        c22126c03.mo111964L1(AbstractC23136l9.m118759w1(12));
        this.f64959y0 = c22126c03;
        C16716d c16716d3 = new C16716d(getContext());
        C16718f m89042Z = c16716d3.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(4.0f)).m89042Z(AbstractC23136l9.m118742r(6.73f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(2.0f));
        C16716d c16716d4 = this.f64954t0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mFirstTagView");
            c16716d4 = null;
        }
        m89042Z.m89054h0(c16716d4).m89027K(true);
        c16716d3.m89085A0(AbstractC23136l9.m118665N(c16716d3.getContext(), AbstractC16803z.bg_input_chip_tag_msg_item));
        C21693c c21693c6 = this.f64958x0;
        if (c21693c6 == null) {
            AbstractC19074t.m100223u("mSecondTagIcon");
            c21693c6 = null;
        }
        c16716d3.m89001g1(c21693c6);
        C22126c0 c22126c04 = this.f64959y0;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mSecondTagTitle");
            c22126c04 = null;
        }
        c16716d3.m89001g1(c22126c04);
        this.f64957w0 = c16716d3;
        C22126c0 c22126c05 = new C22126c0(getContext());
        C16718f m89028L3 = c22126c05.m89106L().m89028L(-2, -2);
        C21693c c21693c7 = this.f64958x0;
        if (c21693c7 == null) {
            AbstractC19074t.m100223u("mSecondTagIcon");
            c21693c7 = null;
        }
        m89028L3.m89054h0(c21693c7).m89027K(true);
        c22126c05.m111980v1(truncateAt);
        c22126c05.m111953A1(1);
        c22126c05.m111984z1(AbstractC23136l9.m118759w1(2), 0.0f);
        c22126c05.m89132a1(AbstractC23136l9.m118759w1(-1));
        c22126c05.m111962J1(C23212s8.m119606n(AbstractC2807a.text_02));
        c22126c05.mo111964L1(AbstractC23136l9.m118759w1(12));
        this.f64939A0 = c22126c05;
        C16716d c16716d5 = new C16716d(getContext());
        C16718f m89042Z2 = c16716d5.m89106L().m89028L(-2, -2).m89042Z(AbstractC23136l9.m118742r(6.73f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(2.0f));
        C16716d c16716d6 = this.f64957w0;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mSecondTagView");
            c16716d6 = null;
        }
        m89042Z2.m89054h0(c16716d6).m89027K(true);
        c16716d5.m89085A0(AbstractC23136l9.m118665N(c16716d5.getContext(), AbstractC16803z.bg_input_chip_tag_msg_item));
        C22126c0 c22126c06 = this.f64939A0;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("mMoreTagTitle");
            c22126c06 = null;
        }
        c16716d5.m89001g1(c22126c06);
        this.f64960z0 = c16716d5;
        C16716d c16716d7 = this.f64953s0;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mChatTagContainer");
            c16716d7 = null;
        }
        C16716d c16716d8 = this.f64954t0;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("mFirstTagView");
            c16716d8 = null;
        }
        c16716d7.m89001g1(c16716d8);
        C16716d c16716d9 = this.f64953s0;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("mChatTagContainer");
            c16716d9 = null;
        }
        C16716d c16716d10 = this.f64957w0;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("mSecondTagView");
            c16716d10 = null;
        }
        c16716d9.m89001g1(c16716d10);
        C16716d c16716d11 = this.f64953s0;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mChatTagContainer");
            c16716d11 = null;
        }
        C16716d c16716d12 = this.f64960z0;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mMoreTagView");
            c16716d12 = null;
        }
        c16716d11.m89001g1(c16716d12);
        C16716d c16716d13 = this.f64953s0;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("mChatTagContainer");
            return null;
        }
        return c16716d13;
    }

    /* renamed from: Q0 */
    private final C16719g m69815Q0() {
        C16716d c16716d = new C16716d(getContext());
        this.f64950p0 = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89073z(Boolean.TRUE).m89036T(AbstractC23136l9.m118742r(2.0f));
        C21693c c21693c = new C21693c(getContext());
        this.f64951q0 = c21693c;
        c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f)).m89027K(true).m89035S(AbstractC23136l9.m118742r(6.0f));
        C16716d c16716d2 = this.f64950p0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mExtraDataContainer");
            c16716d2 = null;
        }
        C21693c c21693c2 = this.f64951q0;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mOtherInfoIcon");
            c21693c2 = null;
        }
        c16716d2.m89001g1(c21693c2);
        C22126c0 c22126c0 = new C22126c0(getContext());
        this.f64952r0 = c22126c0;
        c22126c0.mo111965M1(0);
        C22126c0 c22126c02 = this.f64952r0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c02 = null;
        }
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        C22126c0 c22126c03 = this.f64952r0;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c03 = null;
        }
        c22126c03.m111962J1(f64928F0);
        C22126c0 c22126c04 = this.f64952r0;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c04 = null;
        }
        c22126c04.m111953A1(1);
        C22126c0 c22126c05 = this.f64952r0;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c05 = null;
        }
        c22126c05.m111980v1(TextUtils.TruncateAt.END);
        C22126c0 c22126c06 = this.f64952r0;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c06 = null;
        }
        C16718f m89027K = c22126c06.m89106L().m89028L(-2, -2).m89027K(true);
        C21693c c21693c3 = this.f64951q0;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mOtherInfoIcon");
            c21693c3 = null;
        }
        m89027K.m89054h0(c21693c3);
        C16716d c16716d3 = this.f64950p0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mExtraDataContainer");
            c16716d3 = null;
        }
        C22126c0 c22126c07 = this.f64952r0;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mOtherInfoMessage");
            c22126c07 = null;
        }
        c16716d3.m89001g1(c22126c07);
        C16716d m69814P0 = m69814P0();
        C16716d c16716d4 = this.f64950p0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mExtraDataContainer");
            c16716d4 = null;
        }
        c16716d4.m89001g1(m69814P0);
        C16716d c16716d5 = this.f64950p0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mExtraDataContainer");
            return null;
        }
        return c16716d5;
    }

    private final Calendar getC1() {
        return (Calendar) this.f64941C0.getValue();
    }

    private final Calendar getC2() {
        return (Calendar) this.f64942D0.getValue();
    }

    /* renamed from: t0 */
    private final boolean m69816t0(String str) {
        if (this.f64944j0 == 1) {
            return AbstractC23089h6.m118442j(AbstractC23089h6.m118443k(str));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m69820y0(NormalMsgModuleView normalMsgModuleView, String str, C16719g c16719g) {
        AbstractC19074t.m100208f(normalMsgModuleView, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        InterfaceC12426b interfaceC12426b = normalMsgModuleView.f64943i0;
        if (interfaceC12426b != null && !interfaceC12426b.mo68343Sh(str)) {
            normalMsgModuleView.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m69821z0(NormalMsgModuleView normalMsgModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(normalMsgModuleView, "this$0");
        normalMsgModuleView.performLongClick();
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView, com.zing.zalo.p077ui.moduleview.message.InterfaceC12431b
    /* renamed from: C */
    public void mo69822C(C18451m c18451m, int i11) {
        AbstractC12211a.b bVar;
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69822C(c18451m, i11);
        C18440b c18440b = (C18440b) c18451m;
        String mo97719a = c18440b.mo97719a();
        AbstractC19646n0.m103020q2(c18440b.m97729o());
        setTag(mo97719a);
        C12260j parent = getParent();
        if (parent != null && (bVar = parent.f63847w) != null) {
            bVar.mo68346Uv();
        }
        m69806H0(mo97719a);
        m69807I0(mo97719a);
        m69804F0(c18440b);
        m69811M0(c18440b);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        final String mo97719a = c18451m.mo97719a();
        if (this.f64944j0 != 3) {
            getMAvatar().m90905k2(AbstractC22055v0.m115116F(mo97719a, AbstractC21244b.m110054d(this.f84675p)), AbstractC22055v0.m115115E(mo97719a, AbstractC21244b.m110054d(this.f84675p)));
            getMAvatar().m90900f2(AbstractC22055v0.m115112B(mo97719a));
            getMAvatar().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.j
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    NormalMsgModuleView.m69820y0(NormalMsgModuleView.this, mo97719a, c16719g);
                }
            });
            getMAvatar().m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.moduleview.message.k
                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    NormalMsgModuleView.m69821z0(NormalMsgModuleView.this, c16719g);
                }
            });
        }
        AbstractC12441l.m69870b(getMAvatar(), ((C18440b) c18451m).m97729o());
        boolean z11 = false;
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, mo97719a, false, 2, null);
        if (m141800i != null) {
            z11 = m141800i.m40359B0();
        }
        if (!c18451m.mo97726j() && !z11) {
            getMAvatar().m90896b2(EnumC16947c.OFFLINE);
        } else {
            getMAvatar().m90896b2(EnumC16947c.OA);
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: i0 */
    public void mo69766i0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        C18440b c18440b = (C18440b) c18451m;
        super.mo69766i0(c18451m, z11);
        getMLine1RightSide().mo44614b1(0);
        getMLine2RightSide().mo44614b1(0);
        String m119220T0 = AbstractC23160o0.m119220T0(c18440b.m97734t(), getC1(), getC2());
        AbstractC19074t.m100207e(m119220T0, "getTimestampUntilNowForTabMsgItems(...)");
        int m97735u = c18440b.m97735u();
        if (m97735u != 29 && m97735u != 36 && m97735u != 33) {
            if (AbstractC19646n0.m102951Z0(c18440b.m97729o())) {
                getMTime().m111962J1(f64931I0);
                m119220T0 = AbstractC23136l9.m118743r0(AbstractC8020f0.deliveried_message_draft_state);
                AbstractC19074t.m100207e(m119220T0, "getString(...)");
            } else {
                int m97733s = c18440b.m97733s();
                if (m97733s != 0) {
                    if (m97733s == 1 && C0814e0.m2059e(c18440b.m97732r())) {
                        m119220T0 = AbstractC23136l9.m118743r0(AbstractC8020f0.sending_message_state);
                        AbstractC19074t.m100207e(m119220T0, "getString(...)");
                        getMTime().m111962J1(f64932J0);
                    }
                } else {
                    m119220T0 = AbstractC23136l9.m118743r0(AbstractC8020f0.deliveried_message_send_fail);
                    AbstractC19074t.m100207e(m119220T0, "getString(...)");
                    getMTime().m111962J1(f64930H0);
                }
            }
        }
        getMTime().m111959G1(m119220T0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        CharSequence charSequence;
        String str;
        int i11;
        String m97752q;
        String str2;
        C18446h m97730p;
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        this.f64949o0.mo44614b1(8);
        C18440b c18440b = (C18440b) c18451m;
        int m97735u = c18440b.m97735u();
        C18446h m97730p2 = c18440b.m97730p();
        if (m97730p2 == null || (charSequence = m97730p2.m97750j()) == null) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C18446h m97730p3 = c18440b.m97730p();
        C31924g1 c31924g1 = null;
        if (m97730p3 != null && (m97752q = m97730p3.m97752q()) != null && m97752q.length() > 0 && c18440b.mo97724g() && m97735u != 26 && m97735u != 20 && m97735u != 21 && m97735u != 29 && (m97735u != 24 || ((m97730p = c18440b.m97730p()) != null && m97730p.m97745d()))) {
            C18446h m97730p4 = c18440b.m97730p();
            if (m97730p4 != null) {
                str2 = m97730p4.m97752q();
            } else {
                str2 = null;
            }
            String m119762z = AbstractC23244v8.m119762z(str2);
            AbstractC19074t.m100207e(m119762z, "trimDisplayNameRulePreviewLastMsg(...)");
            spannableStringBuilder.append((CharSequence) m119762z).append((CharSequence) ": ").append(charSequence);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        getMListItemModule().m90800B1(spannableStringBuilder);
        String mo97719a = c18440b.mo97719a();
        int m97731q = c18440b.m97731q();
        C18446h m97730p5 = c18440b.m97730p();
        if (m97730p5 != null) {
            c31924g1 = m97730p5.m97751m();
        }
        if (C21927m.m114302u().m114312J().m153137g(mo97719a)) {
            if (C21914b.f107731a.m114200k(mo97719a)) {
                i11 = AbstractC8020f0.str_hint_block_chat_and_call;
            } else {
                i11 = AbstractC8020f0.str_hint_block_chat;
            }
            C16959c0 mListItemModule = getMListItemModule();
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            mListItemModule.m90800B1(m118743r0);
            return;
        }
        if (AbstractC19646n0.m103003m1(m97735u) && m97731q == 4) {
            m69803E0();
            return;
        }
        if (m97735u == 12 && c31924g1 != null && (str = c31924g1.f146660a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2138772447) {
                if (hashCode != -1103456014) {
                    if (hashCode == -302954634 && str.equals("recommened.groupcall")) {
                        m69805G0(C20012f.f98380a.m103861o(c31924g1.f146662c.f91043f));
                        return;
                    }
                    return;
                }
                if (str.equals("recommened.calltime")) {
                    m69799A0(c18440b, c31924g1);
                    return;
                }
                return;
            }
            if (str.equals("recommened.misscall")) {
                m69808J0(c18440b, c31924g1, z11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        C18440b c18440b = (C18440b) c18451m;
        C31973j5 m41001e = c18440b.m97729o().m41001e(true);
        if (m41001e != null) {
            z12 = m41001e.m153747Y();
        } else {
            z12 = false;
        }
        C21693c c21693c = this.f64947m0;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c21693c.mo44614b1(i11);
        C16959c0 mListItemModule = getMListItemModule();
        String m40990d = Conversation.m40990d(c18440b.m97729o(), true, false, false, 4, null);
        int length = m40990d.length() - 1;
        int i13 = 0;
        boolean z14 = false;
        while (i13 <= length) {
            if (!z14) {
                i12 = i13;
            } else {
                i12 = length;
            }
            if (AbstractC19074t.m100209g(m40990d.charAt(i12), 32) <= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z14) {
                if (!z13) {
                    z14 = true;
                } else {
                    i13++;
                }
            } else if (!z13) {
                break;
            } else {
                length--;
            }
        }
        mListItemModule.m90805G1(m40990d.subSequence(i13, length + 1).toString());
        m69810L0(c18440b);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: l0 */
    public void mo69781l0(C18451m c18451m, boolean z11, int i11) {
        boolean z12;
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69781l0(c18451m, z11, i11);
        C18440b c18440b = (C18440b) c18451m;
        String mo97719a = c18440b.mo97719a();
        if (this.f64944j0 == 1) {
            z12 = AbstractC19646n0.m103017q(c18440b.m97729o());
        } else {
            z12 = false;
        }
        EnumC16991i enumC16991i = EnumC16991i.CHAT_NUMBER;
        String str = "";
        if (AbstractC21935u.m114518H(mo97719a) && !c18451m.mo97728n()) {
            enumC16991i = EnumC16991i.CHAT_DOT;
        } else if (AbstractC23184q2.m119460r(c18440b.m97729o())) {
            if (1 <= i11 && i11 < 6) {
                str = String.valueOf(i11);
            } else {
                enumC16991i = EnumC16991i.CHAT_DOT;
            }
        } else if (i11 > 0) {
            str = C12425a.m69827b(Companion, i11, false, 2, null);
        } else {
            enumC16991i = EnumC16991i.CHAT_DOT;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(enumC16991i);
        c16974f.m90972v(str);
        c16974f.m90969s(z12);
        c16974f.m90975y(true);
        getMUnreadBadge().m90983u1(c16974f);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: n0 */
    public C16716d mo69823n0() {
        C16716d mo69823n0 = super.mo69823n0();
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89027K(true).m89028L(-2, -2).m89049e0(getMTime());
        mo69823n0.m89001g1(c16716d);
        C21693c c21693c = new C21693c(getContext());
        this.f64945k0 = c21693c;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_notif_off_solid_16, AbstractC2807a.icon_03));
        C21693c c21693c2 = this.f64945k0;
        C21693c c21693c3 = null;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mMuteIcon");
            c21693c2 = null;
        }
        C16718f m89028L = c21693c2.m89106L().m89028L(-2, -2);
        int i11 = f64938P0;
        m89028L.m89035S(i11).m89017A(Boolean.TRUE).m89027K(true);
        C21693c c21693c4 = new C21693c(getContext());
        this.f64946l0 = c21693c4;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        c21693c4.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_pin_solid_16, AbstractC2807a.icon_03));
        C21693c c21693c5 = this.f64946l0;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("mPinIcon");
            c21693c5 = null;
        }
        C16718f m89035S = c21693c5.m89106L().m89028L(-2, -2).m89035S(i11);
        C21693c c21693c6 = this.f64945k0;
        if (c21693c6 == null) {
            AbstractC19074t.m100223u("mMuteIcon");
            c21693c6 = null;
        }
        m89035S.m89049e0(c21693c6).m89027K(true);
        C21693c c21693c7 = this.f64945k0;
        if (c21693c7 == null) {
            AbstractC19074t.m100223u("mMuteIcon");
            c21693c7 = null;
        }
        c16716d.m89001g1(c21693c7);
        C21693c c21693c8 = this.f64946l0;
        if (c21693c8 == null) {
            AbstractC19074t.m100223u("mPinIcon");
        } else {
            c21693c3 = c21693c8;
        }
        c16716d.m89001g1(c21693c3);
        return mo69823n0;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: o0 */
    public C16716d mo69824o0() {
        C16716d mo69824o0 = super.mo69824o0();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16977g c16977g = new C16977g(context);
        this.f64948n0 = c16977g;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C16974f c16974f = new C16974f(context2);
        c16974f.m90974x(EnumC16991i.CHAT_MENTION);
        c16974f.m90975y(true);
        c16977g.m90983u1(c16974f);
        C16977g c16977g2 = this.f64948n0;
        C16977g c16977g3 = null;
        if (c16977g2 == null) {
            AbstractC19074t.m100223u("mMentionBadge");
            c16977g2 = null;
        }
        c16977g2.m89106L().m89035S(AbstractC23222t7.f112556e).m89049e0(getMUnreadBadge());
        C16977g c16977g4 = this.f64948n0;
        if (c16977g4 == null) {
            AbstractC19074t.m100223u("mMentionBadge");
        } else {
            c16977g3 = c16977g4;
        }
        mo69824o0.m89001g1(c16977g3);
        return mo69824o0;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: q0 */
    public int mo69782q0(C18451m c18451m) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        return C19636i1.Companion.m102800a().m102746E(c18451m.mo97719a());
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: r0 */
    public boolean mo69825r0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "item");
        if (i11 <= 0) {
            C19636i1.b bVar = C19636i1.Companion;
            if (!bVar.m102800a().m102765V(c18451m.mo97719a()) && !bVar.m102800a().m102766W(c18451m.mo97719a())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: s0 */
    public void mo69826s0() {
        super.mo69826s0();
        TabMsgCommonItemModuleView.C12429a c12429a = TabMsgCommonItemModuleView.Companion;
        f64927E0 = c12429a.m69866f();
        f64928F0 = c12429a.m69867g();
        f64929G0 = C23212s8.m119606n(AbstractC2807a.accent_sky_blue_text);
        f64930H0 = C23212s8.m119606n(AbstractC7354t0.NotificationColor1);
        f64931I0 = AbstractC23136l9.m118639A(AbstractC16801x.orange_color1);
        f64932J0 = f64929G0;
        f64933K0 = c12429a.m69867g();
        f64934L0 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.group_call_color);
    }
}
