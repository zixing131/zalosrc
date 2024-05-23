package com.zing.zalo.p077ui.chat.rightmenu;

import ag0.C0804b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import p130eh.C18430a;
import p162fh.C18932a;
import p162fh.C18935d;
import p210hh.C20060c;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;

/* renamed from: com.zing.zalo.ui.chat.rightmenu.h */
/* loaded from: classes5.dex */
public final class C11711h extends AbstractC11704a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11711h(InterfaceC11707d interfaceC11707d) {
        super(interfaceC11707d);
        AbstractC19074t.m100208f(interfaceC11707d, "mvpView");
        m65231dq(false);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Pp */
    protected List mo65220Pp() {
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z13 = false;
        if (m65227Xp()) {
            arrayList2.add(new ChatInfoAdapter.C11692g(26, AbstractC8020f0.chat_menu_popup_search_message_v2, false, true));
        }
        arrayList2.add(new ChatInfoAdapter.C11692g(64, AbstractC8020f0.str_right_menu_option_info, false, true));
        arrayList2.add(new ChatInfoAdapter.C11692g(49, AbstractC8020f0.str_right_menu_option_share, false, true));
        if (C21927m.m114302u().m114357s().m153137g(m65221Qp().m17944I0())) {
            boolean m2033i = C0804b.m2025g().m2033i(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g = new ChatInfoAdapter.C11692g(22, AbstractC8020f0.str_setting_on_notif_newmsg_v2);
            c11692g.m65120f(true, !m2033i);
            arrayList2.add(c11692g);
        }
        arrayList.add(new ChatInfoAdapter.C11693h(arrayList2, false));
        boolean z14 = false;
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99182f()) {
            C7860a.b bVar = C7860a.Companion;
            ArrayList m40274R = bVar.m40303b().m40274R(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g2 = new ChatInfoAdapter.C11692g(69, AbstractC16803z.ic_setting_chat_label, AbstractC8020f0.str_right_menu_setting_chat_labbel, false, true);
            if (!m40274R.isEmpty()) {
                c11692g2.f60814e = bVar.m40303b().m40272P(((C18430a) m40274R.get(0)).m97661a());
                z11 = false;
            } else {
                c11692g2.f60814e = bVar.m40303b().m40272P(-1);
                z11 = true;
            }
            arrayList.add(c11692g2);
            z14 = true;
        } else {
            z11 = true;
        }
        if (c18932a.m99184h()) {
            List m99228p = C18935d.Companion.m99234a().m99228p(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g3 = new ChatInfoAdapter.C11692g(73, AbstractC16803z.ic_setting_chat_tag, AbstractC8020f0.str_right_menu_setting_chat_tag, z14, !z14);
            if (!m99228p.isEmpty()) {
                c11692g3.f60814e = ((C20060c) m99228p.get(0)).m104216e();
            } else {
                c11692g3.f60814e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_right_menu_setting_chat_tag_desc_empty);
            }
            arrayList.add(c11692g3);
            z14 = true;
        }
        if (z11 && AbstractC25495a.m132086k(m65221Qp().m17944I0())) {
            boolean m118442j = AbstractC23089h6.m118442j(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g4 = new ChatInfoAdapter.C11692g(46, AbstractC16803z.ic_pin, AbstractC8020f0.str_pin_message_title, z14, !z14);
            c11692g4.m65120f(true, m118442j);
            arrayList.add(c11692g4);
            m65235gq(true);
            z12 = true;
        } else {
            z12 = z14;
        }
        m65239jq(arrayList.size());
        if (m65226Wp() || !z11) {
            z13 = true;
        }
        m65235gq(z13);
        arrayList.add(new ChatInfoAdapter.C11692g(66, AbstractC16803z.ic_warning, AbstractC8020f0.str_reportabuse, z12, !z12));
        if (AbstractC23306f.m120732z1().m109408o()) {
            arrayList.add(new ChatInfoAdapter.C11692g(72, AbstractC16803z.ic_storage_line_24, AbstractC8020f0.str_conversation_storage, true, false));
        }
        arrayList.add(new ChatInfoAdapter.C11692g(2, AbstractC16803z.ic_trash, AbstractC8020f0.str_optionM_clearallMsg_v3));
        if (!AbstractC25495a.m132086k(m65221Qp().m17944I0())) {
            if (C21927m.m114302u().m114357s().m153137g(m65221Qp().m17944I0())) {
                arrayList.add(new ChatInfoAdapter.C11692g(32, AbstractC16803z.ic_unsubscribe, AbstractC8020f0.btn_vip_unfollow));
            } else {
                arrayList.add(new ChatInfoAdapter.C11692g(51, AbstractC16803z.ic_subscribe, AbstractC8020f0.btn_vip_follow));
            }
        }
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
            ChatInfoView.InterfaceC11697a.a.m65203a(m65219Op2, null, null, "678930002", null, 11, null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: aq */
    protected void mo65230aq() {
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
        String str = m40998a.f42446v;
        AbstractC19074t.m100207e(str, "avt");
        interfaceC11707d2.mo65190jp(str);
        InterfaceC11707d interfaceC11707d3 = (InterfaceC11707d) m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sub_title_header_chat_oa);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        interfaceC11707d3.mo65184db(true, m118743r0);
        ((InterfaceC11707d) m103742Dp()).mo65194sI(ContactProfile.m40345C0(m40998a.f42352K0));
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
            m65219Op2.mo64096Bb(2, "rmenu", 0, "rmenu_ava", false, 4, new String[0]);
        }
    }
}
