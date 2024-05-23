package com.zing.zalo.p077ui.chat.rightmenu;

import ag0.AbstractC0837p0;
import ag0.C0804b;
import am.AbstractC0924m0;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.chat.rightmenu.C11705b;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.C19637j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import p055ce.C3432a;
import p130eh.C18430a;
import p142ey.C18631a;
import p162fh.C18932a;
import p162fh.C18935d;
import p210hh.C20060c;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p445qe.C25244a;
import p716zh.C31862c;
import p716zh.C31986k3;
import p716zh.C32037n9;
import t00.C26444a;
import th.AbstractC26683d;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vg.C28212v6;

/* renamed from: com.zing.zalo.ui.chat.rightmenu.b */
/* loaded from: classes5.dex */
public final class C11705b extends AbstractC11704a {

    /* renamed from: G */
    private int f60875G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11705b(InterfaceC11707d interfaceC11707d) {
        super(interfaceC11707d);
        AbstractC19074t.m100208f(interfaceC11707d, "mvpView");
    }

    /* renamed from: nq */
    private final void m65250nq() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h60.d
            @Override // java.lang.Runnable
            public final void run() {
                C11705b.m65251oq(C11705b.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oq */
    public static final void m65251oq(final C11705b c11705b) {
        AbstractC19074t.m100208f(c11705b, "this$0");
        int m102869v = C19637j.f97466a.m102869v(c11705b.m65221Qp().m17944I0());
        if (m102869v != c11705b.f60875G) {
            c11705b.f60875G = m102869v;
            AbstractC19444a.m101695c(new Runnable() { // from class: h60.e
                @Override // java.lang.Runnable
                public final void run() {
                    C11705b.m65252pq(C11705b.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pq */
    public static final void m65252pq(C11705b c11705b) {
        AbstractC19074t.m100208f(c11705b, "this$0");
        ((InterfaceC11707d) c11705b.m103742Dp()).mo65183d0();
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Pp */
    protected List mo65220Pp() {
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ChatInfoAdapter.C11692g c11692g;
        boolean z16;
        String m118743r0;
        ArrayList arrayList = new ArrayList();
        boolean m114515E = AbstractC21935u.m114515E(m65221Qp().m17944I0());
        boolean m114558y = AbstractC21935u.m114558y(m65221Qp().m17944I0());
        boolean m153137g = C21927m.m114302u().m114312J().m153137g(m65221Qp().m17944I0());
        ArrayList arrayList2 = new ArrayList();
        if (m65227Xp()) {
            arrayList2.add(new ChatInfoAdapter.C11692g(26, AbstractC8020f0.chat_menu_popup_search_message_v2, false, true));
        }
        arrayList2.add(new ChatInfoAdapter.C11692g(65, AbstractC8020f0.str_right_menu_option_user_profile_v2, false, true));
        arrayList2.add(new ChatInfoAdapter.C11692g(14, AbstractC8020f0.str_optionM_bg_v2, false, true));
        boolean m2033i = C0804b.m2025g().m2033i(m65221Qp().m17944I0());
        ChatInfoAdapter.C11692g c11692g2 = new ChatInfoAdapter.C11692g(22, AbstractC8020f0.str_setting_on_notif_newmsg_v2);
        c11692g2.m65120f(true, !m2033i);
        arrayList2.add(c11692g2);
        arrayList.add(new ChatInfoAdapter.C11693h(arrayList2, false));
        ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
        if (m65219Op != null && m65219Op.mo64103Fb(70, false)) {
            C31986k3 c31986k3 = C31986k3.f147083a;
            int m154140q1 = c31986k3.m154140q1(m65221Qp().m17944I0());
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_title_right_menu);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            SpannableString spannableString = new SpannableString(m118743r02);
            if (AbstractC0924m0.m3775e9()) {
                spannableString = new SpannableString(m118743r02 + "  ");
                Drawable m118665N = AbstractC23136l9.m118665N(((InterfaceC11707d) m103742Dp()).mo65180a3(), AbstractC16803z.ic_beta);
                if (m118665N != null) {
                    m118665N.setBounds(0, 0, AbstractC23136l9.m118742r(37.0f), AbstractC23136l9.m118742r(16.0f));
                    if (Build.VERSION.SDK_INT >= 29) {
                        spannableString.setSpan(new ImageSpan(m118665N, 2), m118743r02.length() + 1, spannableString.length(), 17);
                    } else {
                        spannableString.setSpan(new ImageSpan(m118665N, 1), m118743r02.length() + 1, spannableString.length(), 17);
                    }
                }
            }
            ChatInfoAdapter.C11692g c11692g3 = new ChatInfoAdapter.C11692g(70, AbstractC16803z.ic_e2ee_right_menu_setting, (Spannable) spannableString, false);
            if (c31986k3.m154106Q1()) {
                if (!c31986k3.m154105P1(m65221Qp().m17944I0())) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_not_upgraded);
                } else if (c31986k3.m154108R1(m65221Qp().m17944I0())) {
                    c11692g3.f60827r = true;
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgraded);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgraded_but_error);
                }
            } else if (m154140q1 != 3 && m154140q1 != 4) {
                if (m154140q1 != 5 && m154140q1 != 6) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_not_upgraded);
                } else {
                    c11692g3.f60827r = true;
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgraded);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgrade_in_progress);
            }
            c11692g3.f60814e = m118743r0;
            arrayList.add(c11692g3);
        }
        boolean z17 = false;
        if (C18631a.m98447m(m65221Qp().m17944I0())) {
            ChatInfoAdapter.C11692g c11692g4 = new ChatInfoAdapter.C11692g(45, AbstractC16803z.icn_edit_2, AbstractC8020f0.str_change_alias_name_title, false, true);
            ArrayList m141459o = AbstractC28025b8.m141459o("tip.csc.rightmenu.setalias");
            if (m141459o != null && m141459o.size() > 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            c11692g4.f60818i = z16;
            arrayList.add(c11692g4);
            z17 = true;
        }
        if (m114558y && C21927m.m114302u().m114351p() != null) {
            if (C21927m.m114302u().m114351p().contains(m65221Qp().m17944I0())) {
                c11692g = new ChatInfoAdapter.C11692g(34, AbstractC16803z.ic_star, AbstractC8020f0.markfavorite_zalouser, z17, !z17);
                c11692g.m65120f(true, true);
            } else {
                c11692g = new ChatInfoAdapter.C11692g(33, AbstractC16803z.ic_star, AbstractC8020f0.markfavorite_zalouser, z17, !z17);
                c11692g.m65120f(true, false);
            }
            arrayList.add(c11692g);
            z17 = true;
        }
        if (AbstractC26683d.f126401t && !m153137g && m114558y && (AbstractC26683d.f126397p || C21927m.m114302u().m114351p().contains(m65221Qp().m17944I0()))) {
            boolean m114511A = AbstractC21935u.m114511A(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g5 = new ChatInfoAdapter.C11692g(25, AbstractC16803z.icn_timeline, AbstractC8020f0.str_mutual_feed_title, z17, !z17);
            c11692g5.f60818i = m114511A;
            arrayList.add(c11692g5);
        }
        if (m65223Rp() != null) {
            C31862c m65223Rp = m65223Rp();
            AbstractC19074t.m100205c(m65223Rp);
            if (m65223Rp.m153155h()) {
                C31862c m65223Rp2 = m65223Rp();
                AbstractC19074t.m100205c(m65223Rp2);
                if (m65223Rp2.m153149a()) {
                    C31862c m65223Rp3 = m65223Rp();
                    AbstractC19074t.m100205c(m65223Rp3);
                    if (m65223Rp3.f146308a == 7) {
                        arrayList.add(new ChatInfoAdapter.C11687b());
                        arrayList.add(new ChatInfoAdapter.C11691f(m65223Rp()));
                    }
                }
            }
        }
        m65216Mp(arrayList, true);
        if (AbstractC23309i.m122193n2() && !m114515E && !m153137g) {
            String m40990d = Conversation.m40990d(m65221Qp().m17971y0(), true, false, false, 4, null);
            arrayList.add(new ChatInfoAdapter.C11692g(57, AbstractC16803z.ic_group_add, AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_common_with) + " " + m40990d, false));
            z11 = true;
        } else {
            z11 = false;
        }
        int m121041I8 = AbstractC23309i.m121041I8();
        if (AbstractC23309i.m121035I2() && m121041I8 > 0 && !m114515E && !m153137g) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_invite_to_multi_group, Conversation.m40990d(m65221Qp().m17971y0(), true, false, false, 4, null));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            ChatInfoAdapter.C11692g c11692g6 = new ChatInfoAdapter.C11692g(59, AbstractC16803z.ic_person_add, m118746s0, z11);
            c11692g6.f60825p = !z11;
            arrayList.add(c11692g6);
            z11 = true;
        }
        int i13 = this.f60875G;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_right_menu_option_view_group_in_common);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        SpannableString spannableString2 = new SpannableString(m118743r03);
        if (i13 > 0) {
            int length = m118743r03.length() + 1;
            String str = m118743r03 + " (" + i13 + ")";
            i12 = str.length();
            SpannableString spannableString3 = new SpannableString(str);
            i11 = length;
            spannableString2 = spannableString3;
        } else {
            i11 = -1;
            i12 = -1;
        }
        ChatInfoAdapter.C11692g c11692g7 = new ChatInfoAdapter.C11692g(54, AbstractC16803z.ic_group_in_common, spannableString2, z11);
        c11692g7.m65119e(((InterfaceC11707d) m103742Dp()).mo65180a3(), i11, i12);
        c11692g7.f60825p = !z11;
        arrayList.add(c11692g7);
        boolean z18 = false;
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99182f()) {
            C7860a.b bVar = C7860a.Companion;
            ArrayList m40274R = bVar.m40303b().m40274R(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g8 = new ChatInfoAdapter.C11692g(69, AbstractC16803z.ic_setting_chat_label, AbstractC8020f0.str_right_menu_setting_chat_labbel, false, true);
            if (!m40274R.isEmpty()) {
                c11692g8.f60814e = bVar.m40303b().m40272P(((C18430a) m40274R.get(0)).m97661a());
                z12 = false;
            } else {
                c11692g8.f60814e = bVar.m40303b().m40272P(-1);
                z12 = true;
            }
            arrayList.add(c11692g8);
            z18 = true;
        } else {
            z12 = true;
        }
        if (c18932a.m99184h()) {
            List m99228p = C18935d.Companion.m99234a().m99228p(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g9 = new ChatInfoAdapter.C11692g(73, AbstractC16803z.ic_setting_chat_tag, AbstractC8020f0.str_right_menu_setting_chat_tag, z18, !z18);
            if (!m99228p.isEmpty()) {
                c11692g9.f60814e = ((C20060c) m99228p.get(0)).m104216e();
            } else {
                c11692g9.f60814e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_right_menu_setting_chat_tag_desc_empty);
            }
            arrayList.add(c11692g9);
            z18 = true;
        }
        if (!AbstractC21935u.m114515E(m65221Qp().m17944I0()) && !AbstractC21935u.m114550q(m65221Qp().m17944I0()) && z12) {
            boolean m118442j = AbstractC23089h6.m118442j(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g10 = new ChatInfoAdapter.C11692g(46, AbstractC16803z.ic_pin, AbstractC8020f0.str_pin_message_title, z18, !z18);
            c11692g10.m65120f(true, m118442j);
            arrayList.add(c11692g10);
            m65235gq(true);
            z13 = true;
        } else {
            z13 = z18;
        }
        m65239jq(arrayList.size());
        if (!m65226Wp() && z12) {
            z14 = false;
        } else {
            z14 = true;
        }
        m65235gq(z14);
        if (m65228Yp()) {
            ChatInfoAdapter.C11692g c11692g11 = new ChatInfoAdapter.C11692g(29, AbstractC16803z.ic_hide, AbstractC8020f0.str_hide_message, z13, !z13);
            c11692g11.m65120f(true, true);
            arrayList.add(c11692g11);
        } else {
            ChatInfoAdapter.C11692g c11692g12 = new ChatInfoAdapter.C11692g(50, AbstractC16803z.ic_hide, AbstractC8020f0.str_hide_message, z13, !z13);
            c11692g12.m65120f(true, false);
            arrayList.add(c11692g12);
        }
        if (C25244a.f121072a.m130655s()) {
            ChatInfoAdapter.C11692g c11692g13 = new ChatInfoAdapter.C11692g(71, AbstractC16803z.ic_right_menu_mute_call, AbstractC8020f0.str_call_notif_rm_toggle, true, false);
            c11692g13.m65120f(true, !r3.m130656t(m65221Qp().m17944I0()));
            arrayList.add(c11692g13);
            m65238iq(arrayList.size());
        }
        ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
        if (m65219Op2 != null && m65219Op2.mo64103Fb(68, false)) {
            ChatInfoAdapter.C11692g c11692g14 = new ChatInfoAdapter.C11692g(68, AbstractC16803z.ic_countdown, AbstractC8020f0.str_disappear_messages, true, false);
            C32037n9 c32037n9 = C32037n9.f147516a;
            c11692g14.f60814e = c32037n9.m154555m(c32037n9.m154558r(m65221Qp().m17944I0()), true);
            arrayList.add(c11692g14);
        }
        ArrayList arrayList3 = new ArrayList();
        if (C26444a.m136319a().m136320b() && AbstractC21935u.m114554u(m65221Qp().m17944I0())) {
            arrayList3.add("tip.csc.rightmenu.createshortcutcall");
        }
        Iterator it = arrayList3.iterator();
        boolean z19 = false;
        while (it.hasNext()) {
            C28212v6 m141453i = AbstractC28025b8.m141453i((String) it.next());
            if (m141453i != null && (m141453i.f131579e || m141453i.f131580f)) {
                z15 = true;
            } else {
                z15 = false;
            }
            z19 |= z15;
        }
        ChatInfoAdapter.C11692g c11692g15 = new ChatInfoAdapter.C11692g(52, AbstractC16803z.ic_settings_personal, AbstractC8020f0.str_other_setting_personal, true, false);
        c11692g15.f60818i = z19;
        arrayList.add(c11692g15);
        arrayList.add(new ChatInfoAdapter.C11692g(4, AbstractC16803z.ic_warning, AbstractC8020f0.str_reportabuse, false, true));
        ChatInfoAdapter.C11692g c11692g16 = new ChatInfoAdapter.C11692g(5, AbstractC16803z.ic_block, AbstractC8020f0.str_block_manager);
        c11692g16.f60824o = true;
        arrayList.add(c11692g16);
        if (AbstractC23306f.m120732z1().m109408o()) {
            arrayList.add(new ChatInfoAdapter.C11692g(72, AbstractC16803z.ic_storage_line_24, AbstractC8020f0.str_conversation_storage));
        }
        arrayList.add(new ChatInfoAdapter.C11692g(2, AbstractC16803z.ic_trash, AbstractC8020f0.str_optionM_clearallMsg_v3));
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Ql */
    public void mo65253Ql(boolean z11) {
        if (m65219Op() != null) {
            ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
            AbstractC19074t.m100205c(m65219Op);
            m65219Op.mo64192vi(false);
            ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
            AbstractC19074t.m100205c(m65219Op2);
            ChatInfoView.InterfaceC11697a.a.m65203a(m65219Op2, null, "678920002", null, null, 13, null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: aq */
    protected void mo65230aq() {
        String str;
        int i11;
        boolean z11;
        ContactProfile m40998a = m65221Qp().m17971y0().m40998a();
        InterfaceC11707d interfaceC11707d = (InterfaceC11707d) m103742Dp();
        String m40383Q = m40998a.m40383Q(true, false);
        AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
        int length = m40383Q.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(m40383Q.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        interfaceC11707d.mo65187hf(m40383Q.subSequence(i12, length + 1).toString(), false);
        InterfaceC11707d interfaceC11707d2 = (InterfaceC11707d) m103742Dp();
        String str2 = m40998a.f42446v;
        AbstractC19074t.m100207e(str2, "avt");
        interfaceC11707d2.mo65190jp(str2);
        if (C3432a.f14402a.m17234c()) {
            if (!AbstractC21935u.m114558y(m40998a.f42434r)) {
                C28203u6 c28203u6 = C28203u6.f131407a;
                String str3 = m40998a.f42434r;
                AbstractC19074t.m100207e(str3, "uid");
                if (!c28203u6.m141818q(str3)) {
                    str = "";
                }
            }
            str = m40998a.f42458z;
        } else {
            str = m40998a.f42458z;
        }
        InterfaceC11707d interfaceC11707d3 = (InterfaceC11707d) m103742Dp();
        boolean isEmpty = true ^ TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str)) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_viewProfile);
        }
        AbstractC19074t.m100205c(str);
        interfaceC11707d3.mo65184db(isEmpty, str);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: lk */
    public void mo65254lk() {
        if (m65219Op() != null) {
            ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
            AbstractC19074t.m100205c(m65219Op);
            m65219Op.mo64192vi(true);
            ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
            AbstractC19074t.m100205c(m65219Op2);
            m65219Op2.mo64096Bb(2, "rmenu", 0, "rmenu_ava", false, 1, new String[0]);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: nj */
    public void mo65242nj() {
        super.mo65242nj();
        m65250nq();
    }
}
