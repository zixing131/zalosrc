package com.zing.zalo.p077ui.chat.widget.banners;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20003a;
import k60.InterfaceC21485c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import p354n3.C23528a;
import p716zh.C31922g;

/* loaded from: classes5.dex */
public class UserSafetyWarningBannerModulesView extends ModulesView implements C16719g.c {

    /* renamed from: K */
    C23528a f60986K;

    /* renamed from: L */
    C16716d f60987L;

    /* renamed from: M */
    C22122a0 f60988M;

    /* renamed from: N */
    C22126c0 f60989N;

    /* renamed from: O */
    C22126c0 f60990O;

    /* renamed from: P */
    C16716d f60991P;

    /* renamed from: Q */
    C22126c0 f60992Q;

    /* renamed from: R */
    C22126c0 f60993R;

    /* renamed from: S */
    C22126c0 f60994S;

    /* renamed from: T */
    C22126c0 f60995T;

    /* renamed from: U */
    C22126c0 f60996U;

    /* renamed from: V */
    C22126c0 f60997V;

    /* renamed from: W */
    C16716d f60998W;

    /* renamed from: a0 */
    C22126c0 f60999a0;

    /* renamed from: b0 */
    C22126c0 f61000b0;

    /* renamed from: c0 */
    C22126c0 f61001c0;

    /* renamed from: d0 */
    InterfaceC21485c f61002d0;

    public UserSafetyWarningBannerModulesView(Context context) {
        super(context);
        this.f60986K = new C23528a(context);
        m65346W(context);
    }

    /* renamed from: W */
    private void m65346W(Context context) {
        m88987U(-1, -2);
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        setPadding(m118742r, m118742r, m118742r, m118742r);
        setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        setClipChildren(false);
        setClipToOutline(false);
        setClickable(true);
        C16716d c16716d = new C16716d(context);
        this.f60987L = c16716d;
        c16716d.m89106L().m89028L(-1, -2);
        mo69681L(this.f60987L);
        C22122a0 c22122a0 = new C22122a0(context);
        this.f60988M = c22122a0;
        c22122a0.mo89109M0(this);
        this.f60988M.m89106L().m89028L(AbstractC23136l9.m118742r(56.0f), AbstractC23136l9.m118742r(56.0f));
        this.f60987L.m89001g1(this.f60988M);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f60989N = c22126c0;
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f60989N.m111962J1(AbstractC11531v0.m62153I3());
        this.f60989N.mo111965M1(1);
        this.f60989N.m111979u1(true);
        this.f60989N.m111953A1(1);
        C22126c0 c22126c02 = this.f60989N;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        C16718f m89054h0 = this.f60989N.m89106L().m89054h0(this.f60988M);
        Boolean bool = Boolean.TRUE;
        m89054h0.m89017A(bool).m89032P(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        this.f60987L.m89001g1(this.f60989N);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f60990O = c22126c03;
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f60990O.m111962J1(AbstractC11531v0.m62153I3());
        this.f60990O.m111981w1(true);
        this.f60990O.m111953A1(3);
        this.f60990O.m89106L().m89023G(this.f60989N).m89071x(this.f60989N).m89019C(this.f60989N);
        this.f60987L.m89001g1(this.f60990O);
        C16716d c16716d2 = new C16716d(context);
        this.f60991P = c16716d2;
        c16716d2.m89007n1(false);
        this.f60991P.m89106L().m89023G(this.f60990O).m89071x(this.f60989N).m89036T(AbstractC23136l9.m118742r(8.0f));
        this.f60987L.m89001g1(this.f60991P);
        int m118742r2 = AbstractC23136l9.m118742r(4.0f);
        int m118742r3 = AbstractC23136l9.m118742r(12.0f);
        int m118742r4 = AbstractC23136l9.m118742r(10.0f);
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.btn_type_3_text_n);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f60992Q = c22126c04;
        c22126c04.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60992Q.m111962J1(m119607o);
        this.f60992Q.mo111965M1(1);
        this.f60992Q.m111958F1(AbstractC8020f0.btn_func_Add);
        this.f60992Q.m111979u1(true);
        this.f60992Q.m111953A1(1);
        this.f60992Q.m115422R1();
        this.f60992Q.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_medium));
        this.f60992Q.mo89109M0(this);
        this.f60992Q.m89106L().m89029M(15).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89073z(bool).m89035S(m118742r4);
        this.f60991P.m89001g1(this.f60992Q);
        C22126c0 c22126c05 = new C22126c0(context);
        this.f60993R = c22126c05;
        c22126c05.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60993R.m111962J1(m119607o);
        this.f60993R.mo111965M1(1);
        this.f60993R.m111958F1(AbstractC8020f0.str_radar_accept);
        this.f60993R.m111979u1(true);
        this.f60993R.m111953A1(1);
        this.f60993R.m115422R1();
        this.f60993R.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_medium));
        this.f60993R.mo89109M0(this);
        this.f60993R.m89106L().m89029M(15).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89073z(bool).m89035S(m118742r4);
        this.f60991P.m89001g1(this.f60993R);
        C22126c0 c22126c06 = new C22126c0(context);
        this.f60994S = c22126c06;
        c22126c06.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60994S.m111962J1(m119607o);
        this.f60994S.mo111965M1(1);
        this.f60994S.m111958F1(AbstractC8020f0.btn_undo_friend_request);
        this.f60994S.m111979u1(true);
        this.f60994S.m111953A1(1);
        this.f60994S.m115422R1();
        this.f60994S.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_medium));
        this.f60994S.mo89109M0(this);
        this.f60994S.m89106L().m89029M(15).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89073z(bool).m89035S(m118742r4);
        this.f60991P.m89001g1(this.f60994S);
        C22126c0 c22126c07 = new C22126c0(context);
        this.f60995T = c22126c07;
        c22126c07.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60995T.m111962J1(m119607o);
        this.f60995T.mo111965M1(1);
        this.f60995T.m111958F1(AbstractC8020f0.btn_func_Block);
        this.f60995T.m111979u1(true);
        this.f60995T.m111953A1(1);
        this.f60995T.m115422R1();
        this.f60995T.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_medium));
        this.f60995T.mo89109M0(this);
        this.f60995T.m89106L().m89029M(15).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89056i0(new C20003a(this.f60993R, this.f60992Q, this.f60994S)).m89035S(m118742r4);
        this.f60991P.m89001g1(this.f60995T);
        C22126c0 c22126c08 = new C22126c0(context);
        this.f60996U = c22126c08;
        c22126c08.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60996U.m111962J1(m119607o);
        this.f60996U.mo111965M1(1);
        this.f60996U.m111958F1(AbstractC8020f0.btn_func_Unblock);
        this.f60996U.m111979u1(true);
        this.f60996U.m111953A1(1);
        this.f60996U.m115422R1();
        this.f60996U.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_medium));
        this.f60996U.mo89109M0(this);
        this.f60996U.m89106L().m89029M(15).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89056i0(new C20003a(this.f60993R, this.f60992Q, this.f60994S)).m89035S(m118742r4);
        this.f60991P.m89001g1(this.f60996U);
        C22126c0 c22126c09 = new C22126c0(context);
        this.f60997V = c22126c09;
        c22126c09.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60997V.m111962J1(m119607o);
        this.f60997V.mo111965M1(1);
        this.f60997V.m111958F1(AbstractC8020f0.str_report_btn);
        this.f60997V.m111979u1(true);
        this.f60997V.m111953A1(1);
        this.f60997V.m115422R1();
        this.f60997V.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type3_medium));
        this.f60997V.mo89109M0(this);
        this.f60997V.m89106L().m89029M(15).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89056i0(new C20003a(this.f60995T, this.f60996U));
        this.f60991P.m89001g1(this.f60997V);
        C16716d c16716d3 = new C16716d(context);
        this.f60998W = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2);
        mo69681L(this.f60998W);
        C22126c0 c22126c010 = new C22126c0(context);
        this.f61001c0 = c22126c010;
        c22126c010.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f61001c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.btn_type_5_text_n));
        this.f61001c0.mo111965M1(1);
        this.f61001c0.m111958F1(AbstractC8020f0.str_report_btn);
        this.f61001c0.m111979u1(true);
        this.f61001c0.m111953A1(1);
        this.f61001c0.m115422R1();
        this.f61001c0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type5_medium));
        this.f61001c0.mo89109M0(this);
        this.f61001c0.m89106L().m89029M(15).m89027K(true).m89042Z(m118742r3, m118742r2, m118742r3, m118742r2).m89017A(bool).m89035S(m118742r4);
        this.f60998W.m89001g1(this.f61001c0);
        C22126c0 c22126c011 = new C22126c0(context);
        this.f60999a0 = c22126c011;
        c22126c011.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f60999a0.m111962J1(AbstractC11531v0.m62153I3());
        this.f60999a0.mo111965M1(1);
        this.f60999a0.m111979u1(true);
        this.f60999a0.m111953A1(1);
        this.f60999a0.m111980v1(truncateAt);
        this.f60999a0.m89106L().m89073z(bool).m89049e0(this.f61001c0).m89032P(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        this.f60998W.m89001g1(this.f60999a0);
        C22126c0 c22126c012 = new C22126c0(context);
        this.f61000b0 = c22126c012;
        c22126c012.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f61000b0.m111962J1(AbstractC11531v0.m62153I3());
        this.f61000b0.m111981w1(true);
        this.f61000b0.m111953A1(3);
        this.f61000b0.m89106L().m89071x(this.f60999a0).m89019C(this.f60999a0).m89023G(this.f60999a0);
        this.f60998W.m89001g1(this.f61000b0);
    }

    /* renamed from: V */
    public void m65347V(ContactProfile contactProfile, boolean z11, C31922g c31922g, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16;
        int i11;
        int i12;
        int i13;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_scam_alert);
        String m153383e = c31922g.m153383e(z12);
        if (c31922g.m153382d() == 2) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z12) {
            if (!z16) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_this_user_is_not_friend_yet);
            }
            this.f60987L.mo44614b1(0);
            this.f60998W.mo44614b1(8);
            C22122a0 c22122a0 = this.f60988M;
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c22122a0.mo44614b1(i11);
            C22126c0 c22126c0 = this.f60997V;
            Context context = getContext();
            if (z16) {
                i12 = AbstractC16781w.btn_type_6_text_n;
            } else {
                i12 = AbstractC16781w.btn_type_5_text_n;
            }
            c22126c0.m111962J1(C23212s8.m119607o(context, i12));
            C22126c0 c22126c02 = this.f60997V;
            Context context2 = getContext();
            if (z16) {
                i13 = AbstractC16803z.bg_btn_type6_medium;
            } else {
                i13 = AbstractC16803z.bg_btn_type5_medium;
            }
            c22126c02.m89085A0(AbstractC23136l9.m118665N(context2, i13));
            if (z15) {
                this.f60996U.mo44614b1(0);
                this.f60995T.mo44614b1(8);
                this.f60993R.mo44614b1(8);
                this.f60992Q.mo44614b1(8);
                this.f60994S.mo44614b1(8);
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_user_has_been_block);
            } else if (z13) {
                this.f60996U.mo44614b1(8);
                this.f60995T.mo44614b1(0);
                this.f60993R.mo44614b1(8);
                this.f60992Q.mo44614b1(8);
                this.f60994S.mo44614b1(0);
            } else {
                this.f60995T.mo44614b1(0);
                this.f60996U.mo44614b1(8);
                if (z14) {
                    this.f60993R.mo44614b1(0);
                    this.f60992Q.mo44614b1(8);
                    this.f60994S.mo44614b1(8);
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_received_friend_request_from_stranger);
                } else {
                    this.f60993R.mo44614b1(8);
                    this.f60992Q.mo44614b1(0);
                    this.f60994S.mo44614b1(8);
                }
            }
            this.f60989N.m111959G1(m118743r0);
            this.f60990O.m111959G1(m153383e);
            AbstractC23268y2.m120030d(this.f60986K, this.f60988M, contactProfile);
            return;
        }
        if (z15) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_user_has_been_block);
        }
        this.f60987L.mo44614b1(8);
        this.f60998W.mo44614b1(0);
        this.f60999a0.m111959G1(m118743r0);
        this.f61000b0.m111959G1(m153383e);
    }

    public void setListener(InterfaceC21485c interfaceC21485c) {
        this.f61002d0 = interfaceC21485c;
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        InterfaceC21485c interfaceC21485c;
        try {
            if (c16719g == this.f60988M) {
                InterfaceC21485c interfaceC21485c2 = this.f61002d0;
                if (interfaceC21485c2 != null) {
                    interfaceC21485c2.mo64417a();
                }
            } else if (c16719g == this.f60992Q) {
                InterfaceC21485c interfaceC21485c3 = this.f61002d0;
                if (interfaceC21485c3 != null) {
                    interfaceC21485c3.mo64422f();
                }
            } else if (c16719g == this.f60993R) {
                InterfaceC21485c interfaceC21485c4 = this.f61002d0;
                if (interfaceC21485c4 != null) {
                    interfaceC21485c4.mo64420d();
                }
            } else if (c16719g == this.f60994S) {
                InterfaceC21485c interfaceC21485c5 = this.f61002d0;
                if (interfaceC21485c5 != null) {
                    interfaceC21485c5.mo64418b();
                }
            } else if (c16719g == this.f60995T) {
                InterfaceC21485c interfaceC21485c6 = this.f61002d0;
                if (interfaceC21485c6 != null) {
                    interfaceC21485c6.mo64419c();
                }
            } else if (c16719g == this.f60996U) {
                InterfaceC21485c interfaceC21485c7 = this.f61002d0;
                if (interfaceC21485c7 != null) {
                    interfaceC21485c7.mo64421e();
                }
            } else if ((c16719g == this.f60997V || c16719g == this.f61001c0) && (interfaceC21485c = this.f61002d0) != null) {
                interfaceC21485c.mo64416D0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
