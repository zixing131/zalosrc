package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import au.C2343e;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.AbstractC12211a;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalocore.CoreUtility;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p132ej.C18450l;
import p132ej.C18451m;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31874cb;
import t00.C26446c;
import ti0.C26705d;
import ti0.C26707f;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class SuggestFriendItemModuleView extends TabMsgItemModulesView {

    /* renamed from: K */
    C16716d f64988K;

    /* renamed from: L */
    C21693c f64989L;

    /* renamed from: M */
    C16716d f64990M;

    /* renamed from: N */
    C22126c0 f64991N;

    /* renamed from: O */
    C22126c0 f64992O;

    /* renamed from: P */
    C22126c0 f64993P;

    /* renamed from: Q */
    C16716d f64994Q;

    /* renamed from: R */
    C17023o f64995R;

    /* renamed from: S */
    C17023o f64996S;

    /* renamed from: T */
    C17023o f64997T;

    /* renamed from: U */
    C16719g f64998U;

    /* renamed from: V */
    C23528a f64999V;

    /* renamed from: W */
    C12260j f65000W;

    /* renamed from: a0 */
    Context f65001a0;

    /* renamed from: b0 */
    C3977j f65002b0;

    public SuggestFriendItemModuleView(Context context, C23528a c23528a, C12260j c12260j) {
        super(context);
        this.f64999V = c23528a;
        this.f65000W = c12260j;
        this.f65001a0 = context;
        m88987U(-1, -2);
        this.f65002b0 = new C3977j(context);
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_2_w_xsmal);
        C16716d c16716d = new C16716d(context);
        this.f64988K = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89048d0(AbstractC23136l9.m118742r(10.0f)).m89044a0(AbstractC23136l9.m118742r(10.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f));
        C21693c c21693c = new C21693c(context);
        this.f64989L = c21693c;
        c21693c.mo111926w1(AbstractC16803z.ava01);
        C16718f m89106L = this.f64989L.m89106L();
        int i11 = AbstractC23222t7.f112539R;
        C16718f m89027K = m89106L.m89028L(i11, i11).m89035S(AbstractC23222t7.f112586t).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        this.f64988K.m89001g1(this.f64989L);
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonSmall_TertiaryNeutral);
        this.f64997T = c17023o;
        c17023o.m91112r1(AbstractC23136l9.m118663M(AbstractC23322a.zds_ic_close_line_16));
        this.f64997T.m89106L().m89028L(-2, -2).m89027K(true).m89017A(bool);
        this.f64988K.m89001g1(this.f64997T);
        C16716d c16716d2 = new C16716d(context);
        this.f64994Q = c16716d2;
        c16716d2.m89106L().m89028L(-2, -2).m89034R(AbstractC23136l9.m118742r(5.0f)).m89027K(true).m89049e0(this.f64997T).m89035S(AbstractC23136l9.m118742r(8.0f));
        this.f64988K.m89001g1(this.f64994Q);
        C17023o c17023o2 = new C17023o(context, AbstractC2814h.ButtonSmall_Secondary);
        this.f64995R = c17023o2;
        c17023o2.m91114u1(AbstractC8020f0.btn_func_Add);
        this.f64995R.m89106L().m89029M(15).m89046b0(AbstractC23136l9.m118742r(12.0f)).m89047c0(AbstractC23136l9.m118742r(12.0f)).m89040X(m118655I).m89028L(-2, AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
        this.f64994Q.m89001g1(this.f64995R);
        C17023o c17023o3 = new C17023o(context, AbstractC2814h.ButtonSmall_Secondary);
        this.f64996S = c17023o3;
        c17023o3.m91115v1(C26446c.m136326b().m136327a());
        this.f64996S.m89106L().m89029M(15).m89046b0(AbstractC23136l9.m118742r(12.0f)).m89047c0(AbstractC23136l9.m118742r(12.0f)).m89040X(m118655I).m89028L(-2, AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
        this.f64994Q.m89001g1(this.f64996S);
        C16716d c16716d3 = new C16716d(context);
        this.f64990M = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89054h0(this.f64989L).m89049e0(this.f64994Q).m89027K(true);
        this.f64988K.m89001g1(this.f64990M);
        this.f64991N = new C22126c0(context);
        new C26707f(this.f64991N).m137318a(C26705d.m137293a(context, AbstractC2814h.t_large));
        this.f64991N.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        this.f64991N.m111953A1(1);
        C22126c0 c22126c0 = this.f64991N;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        this.f64991N.m89106L().m89028L(-2, -2);
        this.f64990M.m89001g1(this.f64991N);
        this.f64992O = new C22126c0(context);
        new C26707f(this.f64992O).m137318a(C26705d.m137293a(context, AbstractC2814h.t_small));
        this.f64992O.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        this.f64992O.m111953A1(1);
        this.f64992O.m111980v1(truncateAt);
        this.f64992O.m89106L().m89028L(-2, -2).m89036T(AbstractC23222t7.f112552c).m89023G(this.f64991N);
        this.f64990M.m89001g1(this.f64992O);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64993P = c22126c02;
        c22126c02.mo111965M1(0);
        this.f64993P.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64993P.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64993P.m111953A1(1);
        this.f64993P.m111980v1(truncateAt);
        this.f64993P.m89106L().m89028L(-2, -2).m89023G(this.f64992O);
        this.f64990M.m89001g1(this.f64993P);
        C16719g c16719g = new C16719g(context);
        this.f64998U = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64998U.m89106L().m89028L(-1, 1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type1)).m89023G(this.f64988K);
        mo69681L(this.f64988K);
        mo69681L(this.f64998U);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_white_with_press_state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m69846Y(AbstractC12211a.b bVar, int i11, C16719g c16719g) {
        if (bVar != null) {
            bVar.mo68333Nq(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m69847a0(AbstractC12211a.b bVar, int i11, C16719g c16719g) {
        if (bVar != null) {
            bVar.mo68333Nq(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static /* synthetic */ void m69848b0(AbstractC12211a.b bVar, int i11, C16719g c16719g) {
        if (bVar != null) {
            bVar.mo68373nG(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12431b
    /* renamed from: C */
    public void mo69822C(C18451m c18451m, final int i11) {
        int i12;
        int i13;
        String m118339r;
        int i14;
        String trim;
        int i15;
        int i16;
        try {
            C31874cb c31874cb = ((C18450l) c18451m).f92982e;
            final AbstractC12211a.b bVar = this.f65000W.f63847w;
            if (c31874cb != null) {
                if (c31874cb.f146400p == 3 && !AbstractC23063f2.m118359k(c31874cb.f146385a) && !C18644n.m98531l().m98558u(c31874cb.f146385a)) {
                    c31874cb.f146400p = 1;
                }
                int i17 = 0;
                if (c31874cb.f146400p == 3) {
                    this.f64995R.mo44614b1(8);
                    C17023o c17023o = this.f64996S;
                    if (c31874cb.f146406v == 1) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    c17023o.mo44614b1(i16);
                    this.f64996S.m91115v1(this.f65001a0.getString(AbstractC8020f0.str_suggest_friend_send_msg));
                    this.f64993P.mo44614b1(8);
                    if (c31874cb.f146390f <= 0) {
                        if (c31874cb.f146399o == 2) {
                            this.f64992O.m111959G1(this.f65001a0.getString(AbstractC8020f0.str_done_action_friend_request_new));
                        } else {
                            this.f64992O.m111959G1(this.f65001a0.getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                        }
                        this.f64992O.mo44614b1(0);
                    } else if (!TextUtils.isEmpty(c31874cb.f146386b)) {
                        this.f64992O.m111959G1(c31874cb.f146386b);
                        this.f64992O.mo44614b1(0);
                    } else {
                        this.f64992O.mo44614b1(8);
                    }
                } else if (c31874cb.f146390f <= 0) {
                    String str = "";
                    if (c31874cb.f146399o == 2) {
                        this.f64995R.mo44614b1(8);
                        C17023o c17023o2 = this.f64996S;
                        if (c31874cb.f146406v == 1) {
                            i14 = 0;
                        } else {
                            i14 = 8;
                        }
                        c17023o2.mo44614b1(i14);
                        this.f64996S.m91115v1(this.f65001a0.getString(AbstractC8020f0.str_ok));
                        if (!TextUtils.isEmpty(c31874cb.f146396l)) {
                            str = c31874cb.f146396l;
                        }
                        if (!TextUtils.isEmpty(c31874cb.f146397m)) {
                            trim = c31874cb.f146397m;
                        } else {
                            int i18 = c31874cb.f146389e;
                            if (i18 != -1 && i18 != 30 && i18 != 10) {
                                trim = AbstractC23059e9.m118339r(c31874cb.f146399o, i18, c31874cb.f146394j);
                            }
                            trim = AbstractC23059e9.m118339r(c31874cb.f146399o, i18, c31874cb.f146394j).trim();
                        }
                        if (TextUtils.isEmpty(trim)) {
                            this.f64992O.mo44614b1(8);
                        } else {
                            this.f64992O.m111959G1(trim);
                            this.f64992O.mo44614b1(0);
                        }
                        if (TextUtils.isEmpty(str)) {
                            this.f64993P.mo44614b1(8);
                        } else {
                            this.f64993P.m111959G1(str);
                            this.f64993P.mo44614b1(0);
                        }
                    } else {
                        this.f64995R.m91115v1(this.f65001a0.getString(AbstractC8020f0.btn_func_Add));
                        C17023o c17023o3 = this.f64995R;
                        if (c31874cb.f146406v == 1) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        c17023o3.mo44614b1(i13);
                        this.f64996S.mo44614b1(8);
                        if (!TextUtils.isEmpty(c31874cb.f146397m)) {
                            m118339r = c31874cb.f146397m;
                        } else {
                            m118339r = AbstractC23059e9.m118339r(c31874cb.f146399o, c31874cb.f146389e, c31874cb.f146394j);
                        }
                        if (!TextUtils.isEmpty(c31874cb.f146396l)) {
                            str = c31874cb.f146396l;
                        }
                        if (!TextUtils.isEmpty(m118339r)) {
                            this.f64992O.m111959G1(m118339r);
                            this.f64992O.mo44614b1(0);
                        } else {
                            this.f64992O.mo44614b1(8);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f64993P.m111959G1(str);
                            this.f64993P.mo44614b1(0);
                        } else {
                            this.f64993P.mo44614b1(8);
                        }
                    }
                } else {
                    if (C21927m.m114302u().m114318P(c31874cb.f146385a)) {
                        this.f64995R.m91115v1(this.f65001a0.getString(AbstractC8020f0.str_suggest_friend_send_msg));
                    } else {
                        this.f64995R.m91115v1(this.f65001a0.getString(AbstractC8020f0.str_suggest_func_follow_page));
                    }
                    C17023o c17023o4 = this.f64995R;
                    if (c31874cb.f146406v == 1) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c17023o4.mo44614b1(i12);
                    this.f64995R.m89087B0(AbstractC16803z.bg_btn_type2_medium);
                    this.f64996S.mo44614b1(8);
                    if (!TextUtils.isEmpty(c31874cb.f146386b)) {
                        this.f64992O.m111959G1(c31874cb.f146386b);
                        this.f64992O.mo44614b1(0);
                    } else {
                        this.f64992O.mo44614b1(8);
                    }
                    this.f64993P.mo44614b1(8);
                }
                C17023o c17023o5 = this.f64997T;
                if (c31874cb.f146407w == 1) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                c17023o5.mo44614b1(i15);
                this.f64995R.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.r
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        SuggestFriendItemModuleView.m69846Y(AbstractC12211a.b.this, i11, c16719g);
                    }
                });
                this.f64996S.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.s
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        SuggestFriendItemModuleView.m69847a0(AbstractC12211a.b.this, i11, c16719g);
                    }
                });
                this.f64997T.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.t
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        SuggestFriendItemModuleView.m69848b0(AbstractC12211a.b.this, i11, c16719g);
                    }
                });
                this.f64991N.m111959G1(c31874cb.m153180d(true, false));
                if (!TextUtils.isEmpty(c31874cb.f146393i)) {
                    if (C23302b.f113247a.m120523d(c31874cb.f146393i) && !CoreUtility.f89233i.equals(c31874cb.f146385a)) {
                        int m12307a = C2343e.m12307a(c31874cb.f146385a, false);
                        this.f64989L.mo111925v1(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(c31874cb.m153180d(true, false)), m12307a));
                    } else {
                        AbstractC23268y2.m120033g(this.f64999V, this.f65002b0, this.f64989L, c31874cb.f146393i, C23278z2.m120143n(), false);
                    }
                } else {
                    this.f64989L.mo111925v1(C23212s8.m119609q(this.f65001a0, AbstractC16781w.default_avatar));
                }
                C16719g c16719g = this.f64998U;
                if (c31874cb.f146408x) {
                    i17 = 8;
                }
                c16719g.mo44614b1(i17);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
