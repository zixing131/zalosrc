package com.zing.zalo.p077ui.moduleview.contact;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7200s;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.DeletePhoneBookFriendModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21691a;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import vg.AbstractC28218w3;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class DeletePhoneBookFriendModuleView extends ModulesView {

    /* renamed from: K */
    private final C7200s.a f64609K;

    /* renamed from: L */
    private final C7200s f64610L;

    /* renamed from: M */
    private final C16716d f64611M;

    /* renamed from: N */
    private final C16719g f64612N;

    /* renamed from: O */
    private final C22129e f64613O;

    /* renamed from: P */
    private final C21691a f64614P;

    /* renamed from: Q */
    private final C16716d f64615Q;

    /* renamed from: R */
    private final C22126c0 f64616R;

    /* renamed from: S */
    private final C22126c0 f64617S;

    /* renamed from: T */
    private final C22126c0 f64618T;

    /* renamed from: U */
    private final C22126c0 f64619U;

    /* renamed from: V */
    private int f64620V;

    public DeletePhoneBookFriendModuleView(Context context, C7200s c7200s, C7200s.a aVar) {
        super(context);
        this.f64620V = AbstractC16803z.stencils_bg_white_with_press_state;
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        int m119607o3 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        Drawable m118665N = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_unchecked);
        Drawable m118665N2 = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_checked);
        this.f64609K = aVar;
        this.f64610L = c7200s;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64611M = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112576o).m89047c0(AbstractC23222t7.f112576o).m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112576o);
        C21691a c21691a = new C21691a(context);
        this.f64614P = c21691a;
        C16718f m89106L = c21691a.m89106L();
        int i11 = AbstractC23222t7.f112518D;
        C16718f m89027K = m89106L.m89028L(i11, i11).m89035S(AbstractC23222t7.f112572m).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        c21691a.m111906k1(m118665N);
        c21691a.m111905j1(m118665N2);
        c21691a.mo89093E0(false);
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M));
        this.f64613O = c22129e;
        c22129e.m89106L().m89027K(true).m89054h0(c21691a).m89035S(AbstractC23222t7.f112576o);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64619U = c22126c0;
        C16718f m89029M = c22126c0.m89106L().m89028L(-2, AbstractC23222t7.f112518D).m89040X(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_3_w)).m89017A(bool).m89027K(true).m89034R(AbstractC23222t7.f112576o).m89029M(15);
        int i12 = AbstractC23222t7.f112576o;
        m89029M.m89042Z(i12, 0, i12, 0);
        c22126c0.m111979u1(true);
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend));
        AbstractC23022b5.m118023a(c22126c0, AbstractC8915g0.btnType3_xsmall);
        C16716d c16716d2 = new C16716d(context);
        this.f64615Q = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(c22129e).m89049e0(c22126c0).m89027K(true).m89029M(12);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64616R = c22126c02;
        c22126c02.m89106L().m89028L(-1, -2);
        c22126c02.mo111964L1(AbstractC23222t7.f112582r);
        c22126c02.m111962J1(m119607o2);
        c22126c02.mo111965M1(0);
        c22126c02.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64617S = c22126c03;
        c22126c03.m89106L().m89028L(-1, -2).m89023G(c22126c02);
        c22126c03.mo111964L1(AbstractC23222t7.f112580q);
        c22126c03.m111962J1(m119607o3);
        c22126c03.mo111965M1(0);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64618T = c22126c04;
        c22126c04.m89106L().m89028L(-1, -2).m89023G(c22126c03);
        c22126c04.mo111964L1(AbstractC23222t7.f112580q);
        c22126c04.m111962J1(m119607o3);
        c22126c04.mo111965M1(0);
        c22126c04.m111953A1(1);
        c22126c04.m111980v1(truncateAt);
        c16716d2.m89001g1(c22126c02);
        c16716d2.m89001g1(c22126c03);
        c16716d2.m89001g1(c22126c04);
        c16716d.m89001g1(c21691a);
        c16716d.m89001g1(c22129e);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c16716d2);
        C16719g c16719g = new C16719g(context);
        this.f64612N = c16719g;
        c16719g.mo89161z0(m119607o);
        c16719g.m89106L().m89028L(-1, 1).m89023G(c16716d);
        mo69681L(c16716d);
        mo69681L(c16719g);
        AbstractC23136l9.m118693a1(this, this.f64620V);
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m69716X(ContactProfile contactProfile, C16719g c16719g) {
        C7200s.a aVar = this.f64609K;
        if (aVar != null) {
            aVar.mo36644Sj(contactProfile);
        }
    }

    /* renamed from: W */
    public void m69717W(final ContactProfile contactProfile, boolean z11, int i11) {
        if (contactProfile != null) {
            try {
                C22129e c22129e = this.f64613O;
                c22129e.f108931U0 = z11;
                c22129e.m115433q1(contactProfile);
                this.f64616R.m111959G1(AbstractC28218w3.m142177a(contactProfile));
                String str = contactProfile.f42437s;
                boolean z12 = true;
                boolean z13 = false;
                if (!TextUtils.isEmpty(str)) {
                    this.f64618T.m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_zalo_name_text), str));
                    this.f64618T.mo44614b1(0);
                } else {
                    this.f64618T.mo44614b1(8);
                }
                if (!TextUtils.isEmpty(contactProfile.f42455y)) {
                    this.f64617S.m111959G1(contactProfile.f42455y);
                    this.f64617S.mo44614b1(0);
                } else {
                    this.f64617S.mo44614b1(8);
                }
                String str2 = contactProfile.f42434r;
                C7200s c7200s = this.f64610L;
                if (c7200s != null && c7200s.m36634U()) {
                    if (this.f64610L.m36635V(str2)) {
                        this.f64614P.mo89091D0(true);
                    } else {
                        this.f64614P.mo89091D0(false);
                        z12 = false;
                    }
                    this.f64614P.mo44614b1(0);
                    this.f64619U.mo44614b1(8);
                    z13 = z12;
                } else {
                    this.f64614P.mo44614b1(8);
                    this.f64619U.mo44614b1(0);
                }
                int i12 = AbstractC16803z.stencils_bg_white_with_press_state;
                if (z13) {
                    i12 = AbstractC16803z.stencils_contact_bg_highlight_delete_friend;
                }
                if (i12 != this.f64620V) {
                    this.f64620V = i12;
                    AbstractC23136l9.m118693a1(this, i12);
                }
                this.f64619U.mo89109M0(new C16719g.c() { // from class: h80.e
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        DeletePhoneBookFriendModuleView.this.m69716X(contactProfile, c16719g);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
