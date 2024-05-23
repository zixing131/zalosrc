package com.zing.zalo.p077ui.moduleview.contact;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7282z4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.SentFriendRequestItemModuleView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p361nb.AbstractC23647d;
import y60.C30802d;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class SentFriendRequestItemModuleView extends ModulesView {

    /* renamed from: K */
    private final C7282z4.c f64621K;

    /* renamed from: L */
    private final C7282z4 f64622L;

    /* renamed from: M */
    private C16716d f64623M;

    /* renamed from: N */
    private C16719g f64624N;

    /* renamed from: O */
    private C16716d f64625O;

    /* renamed from: P */
    private C16716d f64626P;

    /* renamed from: Q */
    private C22129e f64627Q;

    /* renamed from: R */
    private C16716d f64628R;

    /* renamed from: S */
    private C22126c0 f64629S;

    /* renamed from: T */
    private C22126c0 f64630T;

    /* renamed from: U */
    private C22126c0 f64631U;

    /* renamed from: V */
    private C22126c0 f64632V;

    /* renamed from: W */
    private C22126c0 f64633W;

    /* renamed from: a0 */
    private C22126c0 f64634a0;

    /* renamed from: b0 */
    private int f64635b0;

    /* renamed from: c0 */
    private final int f64636c0;

    /* renamed from: d0 */
    private final int f64637d0;

    /* renamed from: e0 */
    private final int f64638e0;

    /* renamed from: f0 */
    private final int f64639f0;

    /* renamed from: g0 */
    private C13704p1 f64640g0;

    /* renamed from: h0 */
    private boolean f64641h0;

    public SentFriendRequestItemModuleView(Context context, C7282z4 c7282z4, boolean z11, C7282z4.c cVar) {
        super(context);
        this.f64639f0 = AbstractC23136l9.m118722k0() - ((AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r) * 2) + (AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_tb_ui4) * 2));
        this.f64621K = cVar;
        this.f64622L = c7282z4;
        this.f64641h0 = z11;
        this.f64636c0 = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f64637d0 = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64638e0 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        m69721a0(context);
    }

    /* renamed from: a0 */
    private void m69721a0(Context context) {
        int i11;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64623M = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t).m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112572m);
        C16716d c16716d2 = new C16716d(context);
        this.f64625O = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89044a0(AbstractC23222t7.f112552c);
        C16716d c16716d3 = new C16716d(context);
        this.f64626P = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89023G(this.f64625O).m89046b0(AbstractC23222t7.f112576o).m89047c0(AbstractC23222t7.f112576o);
        C30802d c30802d = new C30802d(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(0.5f), C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c30802d.m149868a(true);
        c30802d.m149869b(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        this.f64626P.m89085A0(c30802d);
        if (this.f64641h0) {
            i11 = AbstractC16802y.avt_L;
        } else {
            i11 = AbstractC16802y.avt_M;
        }
        this.f64635b0 = AbstractC23136l9.m118655I(i11);
        C22129e c22129e = new C22129e(context, this.f64635b0);
        this.f64627Q = c22129e;
        C16718f m89106L = c22129e.m89106L();
        Boolean bool = Boolean.TRUE;
        m89106L.m89018B(bool).m89035S(AbstractC23222t7.f112576o);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64634a0 = c22126c0;
        C16718f m89029M = c22126c0.m89106L().m89028L(-2, -2).m89040X(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_2_w_xsmal)).m89017A(bool).m89027K(true).m89034R(AbstractC23222t7.f112572m).m89029M(15);
        int i12 = AbstractC23222t7.f112572m;
        m89029M.m89042Z(i12, 0, i12, 0);
        this.f64634a0.m111979u1(true);
        this.f64634a0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_undo_request_friend));
        AbstractC23022b5.m118023a(this.f64634a0, AbstractC8915g0.btnType3_xsmall);
        C16716d c16716d4 = new C16716d(context);
        this.f64628R = c16716d4;
        c16716d4.m89106L().m89028L(-1, -2).m89054h0(this.f64627Q).m89049e0(this.f64634a0).m89027K(true).m89029M(12);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64629S = c22126c02;
        c22126c02.m89106L().m89028L(-1, -2);
        this.f64629S.mo111964L1(AbstractC23222t7.f112582r);
        this.f64629S.m111962J1(this.f64637d0);
        this.f64629S.m111953A1(1);
        C22126c0 c22126c03 = this.f64629S;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64630T = c22126c04;
        c22126c04.m89106L().m89028L(-1, -2).m89023G(this.f64629S);
        this.f64630T.mo111964L1(AbstractC23222t7.f112582r);
        this.f64630T.m111962J1(this.f64638e0);
        this.f64630T.m111953A1(1);
        this.f64630T.m111980v1(truncateAt);
        C22126c0 c22126c05 = new C22126c0(context);
        this.f64631U = c22126c05;
        c22126c05.m89106L().m89028L(-1, -2).m89023G(this.f64630T);
        this.f64631U.mo111964L1(AbstractC23222t7.f112582r);
        this.f64631U.m111962J1(this.f64638e0);
        this.f64631U.m111953A1(1);
        this.f64631U.m111980v1(truncateAt);
        C16719g c16719g = new C16719g(context);
        this.f64624N = c16719g;
        c16719g.m89106L().m89028L(-1, 1).m89023G(this.f64623M);
        this.f64624N.mo89161z0(this.f64636c0);
        C22126c0 c22126c06 = new C22126c0(context);
        this.f64633W = c22126c06;
        c22126c06.m89106L().m89028L(-2, -2).m89017A(bool).m89048d0(AbstractC23222t7.f112556e).m89044a0(AbstractC23222t7.f112556e).m89034R(AbstractC23222t7.f112566j).m89048d0(AbstractC23222t7.f112586t).m89044a0(AbstractC23222t7.f112572m);
        this.f64633W.mo111964L1(AbstractC23222t7.f112580q);
        this.f64633W.m111962J1(this.f64637d0);
        this.f64633W.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more));
        C22126c0 c22126c07 = new C22126c0(context);
        this.f64632V = c22126c07;
        c22126c07.m89106L().m89028L(-1, -2).m89049e0(this.f64633W).m89048d0(AbstractC23222t7.f112586t).m89044a0(AbstractC23222t7.f112572m);
        this.f64632V.mo111964L1(AbstractC23222t7.f112580q);
        this.f64632V.m111962J1(this.f64638e0);
        this.f64632V.m111953A1(1);
        this.f64632V.m111980v1(truncateAt);
        C13704p1 c13704p1 = new C13704p1(1);
        this.f64640g0 = c13704p1;
        c13704p1.setTextSize(AbstractC23222t7.f112580q);
        this.f64640g0.setColor(this.f64638e0);
        this.f64628R.m89001g1(this.f64629S);
        this.f64628R.m89001g1(this.f64630T);
        this.f64628R.m89001g1(this.f64631U);
        this.f64625O.m89001g1(this.f64627Q);
        this.f64625O.m89001g1(this.f64634a0);
        this.f64625O.m89001g1(this.f64628R);
        this.f64626P.m89001g1(this.f64633W);
        this.f64626P.m89001g1(this.f64632V);
        this.f64623M.m89001g1(this.f64625O);
        this.f64623M.m89001g1(this.f64626P);
        mo69681L(this.f64623M);
        mo69681L(this.f64624N);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_white_with_press_state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m69722b0(ContactProfile contactProfile, C16719g c16719g) {
        if (contactProfile != null) {
            try {
                contactProfile.m40400c1(true);
                C7282z4 c7282z4 = this.f64622L;
                if (c7282z4 != null) {
                    c7282z4.m10008p();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        AbstractC23647d.m123897g("5901190");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m69723c0(ContactProfile contactProfile, int i11, C16719g c16719g) {
        C7282z4.c cVar = this.f64621K;
        if (cVar != null) {
            cVar.mo37054bA(contactProfile, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m69724d0(ContactProfile contactProfile, View view) {
        C7282z4.c cVar = this.f64621K;
        if (cVar != null) {
            cVar.mo37053Il(contactProfile);
        }
    }

    /* renamed from: Y */
    public void m69725Y(final ContactProfile contactProfile, boolean z11, int i11) {
        if (contactProfile != null) {
            try {
                C22129e c22129e = this.f64627Q;
                c22129e.f108931U0 = z11;
                c22129e.m115433q1(contactProfile);
                int i12 = 0;
                this.f64629S.m111959G1(contactProfile.m40383Q(true, false));
                String m118339r = AbstractC23059e9.m118339r(2, contactProfile.f42373R0, contactProfile.f42455y);
                if (!TextUtils.isEmpty(m118339r)) {
                    this.f64630T.m111959G1(m118339r);
                    this.f64630T.mo44614b1(0);
                } else {
                    this.f64630T.mo44614b1(8);
                }
                String m119270m0 = AbstractC23160o0.m119270m0(contactProfile.f42330D);
                if (!TextUtils.isEmpty(m119270m0)) {
                    this.f64631U.m111959G1(m119270m0);
                    this.f64631U.mo44614b1(0);
                } else {
                    this.f64631U.mo44614b1(8);
                }
                if (!this.f64641h0 && !TextUtils.isEmpty(contactProfile.m40378N())) {
                    String m40378N = contactProfile.m40378N();
                    if (contactProfile.m40365F0()) {
                        this.f64632V.m111953A1(Integer.MAX_VALUE);
                        this.f64633W.mo44614b1(8);
                    } else {
                        C13704p1 c13704p1 = this.f64640g0;
                        if (c13704p1 != null && c13704p1.measureText(m40378N) > this.f64639f0) {
                            this.f64632V.m111953A1(1);
                            this.f64633W.mo44614b1(0);
                            this.f64633W.mo89109M0(new C16719g.c() { // from class: h80.f
                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    SentFriendRequestItemModuleView.this.m69722b0(contactProfile, c16719g);
                                }
                            });
                        } else {
                            this.f64632V.m111953A1(Integer.MAX_VALUE);
                            this.f64633W.mo44614b1(8);
                        }
                    }
                    this.f64632V.m111959G1(m40378N);
                    this.f64626P.mo44614b1(0);
                } else {
                    this.f64626P.mo44614b1(8);
                }
                final int m37047M = C7282z4.m37047M(contactProfile.f42434r);
                if (m37047M == 2) {
                    this.f64634a0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes));
                    AbstractC23022b5.m118023a(this.f64634a0, AbstractC8915g0.btnType2_xsmall);
                } else if (m37047M == 0) {
                    this.f64634a0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_undo_request_friend));
                    AbstractC23022b5.m118023a(this.f64634a0, AbstractC8915g0.btnType3_xsmall);
                } else {
                    this.f64634a0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                    AbstractC23022b5.m118023a(this.f64634a0, AbstractC8915g0.btnType2_xsmall);
                    this.f64630T.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_recall));
                    this.f64630T.mo44614b1(0);
                    this.f64631U.mo44614b1(8);
                    this.f64626P.mo44614b1(8);
                }
                this.f64634a0.mo89109M0(new C16719g.c() { // from class: h80.g
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        SentFriendRequestItemModuleView.this.m69723c0(contactProfile, m37047M, c16719g);
                    }
                });
                C16719g c16719g = this.f64624N;
                if (this.f64641h0) {
                    i12 = 8;
                }
                c16719g.mo44614b1(i12);
                setOnClickListener(new View.OnClickListener() { // from class: h80.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SentFriendRequestItemModuleView.this.m69724d0(contactProfile, view);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
