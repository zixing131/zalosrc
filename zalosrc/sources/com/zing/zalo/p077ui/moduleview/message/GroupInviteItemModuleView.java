package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p716zh.C31973j5;
import p716zh.C32020m7;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class GroupInviteItemModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C16716d f64851K;

    /* renamed from: L */
    C22129e f64852L;

    /* renamed from: M */
    C21693c f64853M;

    /* renamed from: N */
    C3977j f64854N;

    /* renamed from: O */
    C22126c0 f64855O;

    /* renamed from: P */
    C22126c0 f64856P;

    /* renamed from: Q */
    C21691a f64857Q;

    /* renamed from: R */
    C22126c0 f64858R;

    /* renamed from: S */
    C23528a f64859S;

    /* renamed from: T */
    int f64860T;

    /* renamed from: U */
    int f64861U;

    /* renamed from: V */
    Drawable f64862V;

    /* renamed from: W */
    Drawable f64863W;

    public GroupInviteItemModuleView(Context context, C23528a c23528a) {
        super(context);
        this.f64859S = c23528a;
        this.f64860T = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64861U = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f64862V = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_unchecked);
        this.f64863W = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_checked);
        m88987U(-1, -2);
        setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
        this.f64854N = new C3977j(context);
        C16716d c16716d = new C16716d(context);
        this.f64851K = c16716d;
        c16716d.m89106L().m89028L(AbstractC23222t7.f112567j0, -2).m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h).m89027K(true);
        this.f64852L = new C22129e(context, AbstractC23222t7.f112539R);
        C21693c c21693c = new C21693c(context);
        this.f64853M = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112586t;
        C16718f m89028L = m89106L.m89028L(i11, i11);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool).m89017A(bool);
        this.f64853M.m111929z1(5);
        this.f64851K.m89001g1(this.f64852L);
        this.f64851K.m89001g1(this.f64853M);
        C21691a c21691a = new C21691a(context);
        this.f64857Q = c21691a;
        C16718f m89027K = c21691a.m89106L().m89017A(bool).m89034R(AbstractC23222t7.f112572m).m89035S(AbstractC23222t7.f112586t).m89027K(true);
        int i12 = AbstractC23222t7.f112514B;
        m89027K.m89028L(i12, i12);
        this.f64857Q.m111906k1(this.f64862V);
        this.f64857Q.m111905j1(this.f64863W);
        this.f64857Q.mo89093E0(false);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64858R = c22126c0;
        c22126c0.m111962J1(this.f64861U);
        this.f64858R.mo111964L1(AbstractC23222t7.f112580q);
        this.f64858R.m89106L().m89017A(bool).m89034R(AbstractC23222t7.f112572m).m89035S(AbstractC23222t7.f112586t).m89027K(true);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true);
        c16716d2.m89001g1(this.f64857Q);
        c16716d2.m89001g1(this.f64858R);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89054h0(this.f64851K).m89049e0(c16716d2).m89027K(true).m89029M(12).m89028L(-1, -2);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64855O = c22126c02;
        c22126c02.m89106L().m89028L(-1, -2);
        this.f64855O.m111953A1(1);
        C22126c0 c22126c03 = this.f64855O;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        this.f64855O.mo111964L1(AbstractC23222t7.f112586t);
        this.f64855O.m111962J1(this.f64860T);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64856P = c22126c04;
        c22126c04.m89106L().m89023G(this.f64855O).m89028L(-1, -2);
        this.f64856P.m111953A1(1);
        this.f64856P.m111980v1(truncateAt);
        this.f64856P.mo111964L1(AbstractC23222t7.f112582r);
        this.f64856P.m111962J1(this.f64861U);
        c16716d3.m89001g1(this.f64855O);
        c16716d3.m89001g1(this.f64856P);
        mo69681L(this.f64851K);
        mo69681L(c16716d2);
        mo69681L(c16716d3);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        try {
            C31973j5 c31973j5 = c32020m7.f147413d;
            ContactProfile contactProfile = c32020m7.f147411b;
            if (c31973j5 != null && contactProfile != null) {
                SpannableString spannableString = new SpannableString(c31973j5.m153793y());
                boolean z12 = false;
                for (int i12 = 0; i12 < contactProfile.f42399a1.size() - 1; i12 += 2) {
                    if (((Integer) contactProfile.f42399a1.get(i12)).intValue() >= 0) {
                        int i13 = i12 + 1;
                        if (((Integer) contactProfile.f42399a1.get(i13)).intValue() > ((Integer) contactProfile.f42399a1.get(i12)).intValue()) {
                            spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i12)).intValue(), ((Integer) contactProfile.f42399a1.get(i13)).intValue(), 33);
                        }
                    }
                }
                this.f64855O.m111959G1(spannableString);
                this.f64856P.mo44614b1(8);
                this.f64852L.m115437u1(c31973j5);
                this.f64853M.mo44614b1(8);
                if (c31973j5.m153742T()) {
                    this.f64853M.mo44614b1(0);
                    if (c31973j5.m153778p0()) {
                        this.f64853M.mo111926w1(AbstractC16803z.icn_rightmenu_key_gold);
                    } else {
                        this.f64853M.mo111926w1(AbstractC16803z.icn_rightmenu_key_silver);
                    }
                }
                if (c32020m7.f147424o.optBoolean("invitee_is_group_member")) {
                    this.f64857Q.mo44614b1(8);
                    this.f64858R.mo44614b1(0);
                    this.f64858R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_group_row_joined));
                } else {
                    this.f64857Q.mo44614b1(0);
                    this.f64858R.mo44614b1(8);
                }
                if (c32020m7.f147424o.has("is_selected") && c32020m7.f147424o.getBoolean("is_selected")) {
                    z12 = true;
                }
                this.f64857Q.mo89091D0(z12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
