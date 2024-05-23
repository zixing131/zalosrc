package com.zing.zalo.p077ui.moduleview.group;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p716zh.C31973j5;
import p716zh.C32020m7;

/* loaded from: classes6.dex */
public class GroupInCommonModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C16716d f64747K;

    /* renamed from: L */
    C22129e f64748L;

    /* renamed from: M */
    C16716d f64749M;

    /* renamed from: N */
    C22126c0 f64750N;

    /* renamed from: O */
    C22126c0 f64751O;

    /* renamed from: P */
    C16719g f64752P;

    public GroupInCommonModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64747K = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89048d0(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_tb_ui4)).m89044a0(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_tb_ui4)).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f));
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M));
        this.f64748L = c22129e;
        c22129e.m115440x1(AbstractC16803z.icn_rightmenu_addmem);
        this.f64748L.m89106L().m89028L(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f)).m89073z(Boolean.TRUE).m89035S(AbstractC23136l9.m118742r(16.0f)).m89027K(true);
        C16716d c16716d2 = new C16716d(context);
        this.f64749M = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(this.f64748L).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64750N = c22126c0;
        c22126c0.mo111965M1(0);
        this.f64750N.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        this.f64750N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f64750N.m89106L().m89028L(-1, -2);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64751O = c22126c02;
        c22126c02.mo111965M1(0);
        this.f64751O.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64751O.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64751O.m111984z1(AbstractC23222t7.f112552c, 1.0f);
        this.f64751O.m111953A1(2);
        this.f64751O.m89106L().m89023G(this.f64750N).m89028L(-1, -2);
        this.f64749M.m89001g1(this.f64750N);
        this.f64749M.m89001g1(this.f64751O);
        this.f64747K.m89001g1(this.f64748L);
        this.f64747K.m89001g1(this.f64749M);
        C16719g c16719g = new C16719g(context);
        this.f64752P = c16719g;
        c16719g.m89087B0(AbstractC16801x.stencils_line_vertical_divider);
        this.f64752P.m89106L().m89028L(-1, 1).m89023G(this.f64747K).m89036T(AbstractC23136l9.m118742r(2.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.separate_line_padding_left_ui4_type1));
        mo69681L(this.f64747K);
        mo69681L(this.f64752P);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        try {
            ContactProfile contactProfile = c32020m7.f147411b;
            if (contactProfile != null) {
                C31973j5 m40388T = contactProfile.m40388T(true);
                if (m40388T != null) {
                    if (contactProfile.f42399a1.isEmpty()) {
                        this.f64750N.m111959G1(m40388T.m153793y());
                    } else {
                        SpannableString spannableString = new SpannableString(m40388T.m153793y());
                        for (int i12 = 0; i12 < contactProfile.f42399a1.size() - 1; i12 += 2) {
                            if (((Integer) contactProfile.f42399a1.get(i12)).intValue() >= 0) {
                                int i13 = i12 + 1;
                                if (((Integer) contactProfile.f42399a1.get(i13)).intValue() > ((Integer) contactProfile.f42399a1.get(i12)).intValue()) {
                                    spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i12)).intValue(), ((Integer) contactProfile.f42399a1.get(i13)).intValue(), 33);
                                }
                            }
                        }
                        this.f64750N.m111959G1(spannableString);
                    }
                }
                if (!TextUtils.isEmpty(contactProfile.m40378N())) {
                    this.f64751O.mo44614b1(0);
                    this.f64751O.m111959G1(contactProfile.m40378N());
                } else {
                    this.f64751O.mo44614b1(8);
                }
                this.f64752P.mo44614b1(8);
                this.f64748L.m115437u1(m40388T);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
