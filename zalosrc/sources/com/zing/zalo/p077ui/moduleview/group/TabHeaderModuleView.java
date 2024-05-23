package com.zing.zalo.p077ui.moduleview.group;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p692ys.C31070a;
import p716zh.C32020m7;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class TabHeaderModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C16716d f64788K;

    /* renamed from: L */
    C16716d f64789L;

    /* renamed from: M */
    C21693c f64790M;

    /* renamed from: N */
    C22126c0 f64791N;

    /* renamed from: O */
    C21693c f64792O;

    /* renamed from: P */
    C16716d f64793P;

    /* renamed from: Q */
    C21693c f64794Q;

    /* renamed from: R */
    C22126c0 f64795R;

    /* renamed from: S */
    C16719g f64796S;

    /* renamed from: T */
    C3977j f64797T;

    /* renamed from: U */
    C23528a f64798U;

    /* renamed from: V */
    Context f64799V;

    /* renamed from: W */
    int f64800W;

    public TabHeaderModuleView(Context context, C23528a c23528a) {
        super(context);
        this.f64800W = -1;
        m88987U(-1, -2);
        this.f64798U = c23528a;
        this.f64799V = context;
        this.f64797T = new C3977j(context);
        C16716d c16716d = new C16716d(context);
        this.f64788K = c16716d;
        c16716d.m89106L().m89028L(-1, -2);
        C16716d c16716d2 = new C16716d(context);
        this.f64789L = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f));
        C21693c c21693c = new C21693c(context);
        this.f64790M = c21693c;
        c21693c.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_creategroup_32_line_placeholder));
        C16718f m89028L = this.f64790M.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.avt_L), AbstractC23136l9.m118655I(AbstractC16802y.avt_L));
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89036T(AbstractC23136l9.m118742r(10.0f)).m89033Q(AbstractC23136l9.m118742r(10.0f));
        C21693c c21693c2 = new C21693c(context);
        this.f64792O = c21693c2;
        c21693c2.mo111926w1(AbstractC16803z.mat_ic_listarrow);
        this.f64792O.m89106L().m89028L(-2, -2).m89027K(true).m89017A(bool);
        this.f64792O.mo44614b1(8);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64791N = c22126c0;
        c22126c0.mo111965M1(0);
        this.f64791N.m111953A1(2);
        this.f64791N.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64791N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f64791N.m111980v1(TextUtils.TruncateAt.END);
        this.f64791N.m89106L().m89054h0(this.f64790M).m89049e0(this.f64792O).m89027K(true).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(6.0f)).m89028L(-1, -2);
        this.f64789L.m89001g1(this.f64790M);
        this.f64789L.m89001g1(this.f64792O);
        this.f64789L.m89001g1(this.f64791N);
        C16716d c16716d3 = new C16716d(context);
        this.f64793P = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89023G(this.f64789L).m89048d0(AbstractC23136l9.m118742r(6.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
        C21693c c21693c3 = new C21693c(context);
        this.f64794Q = c21693c3;
        c21693c3.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_creategroup_32_line_placeholder));
        this.f64794Q.m89106L().m89028L(AbstractC23136l9.m118742r(58.0f), AbstractC23136l9.m118742r(58.0f)).m89026J(true).m89036T(AbstractC23136l9.m118742r(6.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89041Y(AbstractC23136l9.m118742r(5.0f));
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64795R = c22126c02;
        c22126c02.mo111965M1(0);
        this.f64795R.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64795R.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f64795R.m89106L().m89023G(this.f64794Q).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89029M(3).m89028L(-1, -2);
        this.f64793P.m89001g1(this.f64794Q);
        this.f64793P.m89001g1(this.f64795R);
        C16719g c16719g = new C16719g(context);
        this.f64796S = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        this.f64796S.m89106L().m89028L(-1, AbstractC23136l9.m118742r(8.0f)).m89023G(this.f64788K);
        this.f64788K.m89001g1(this.f64789L);
        this.f64788K.m89001g1(this.f64793P);
        mo69681L(this.f64788K);
        mo69681L(this.f64796S);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        int i12 = c32020m7.f147410a;
        if (i12 != 16) {
            if (i12 != 17) {
                if (i12 == 36) {
                    this.f64789L.mo44614b1(0);
                    this.f64793P.mo44614b1(8);
                    this.f64790M.mo111925v1(AbstractC23136l9.m118665N(this.f64799V, AbstractC16803z.icn_groupcall_tabgroup));
                    this.f64791N.m111958F1(AbstractC8020f0.group_header_create_group_call);
                    this.f64796S.m89106L().m89028L(-1, AbstractC23222t7.f112550b);
                }
            } else {
                this.f64789L.mo44614b1(8);
                this.f64793P.mo44614b1(0);
                this.f64794Q.mo111925v1(AbstractC23136l9.m118665N(this.f64799V, AbstractC16803z.ic_creategroup_32_line_placeholder));
                this.f64795R.m111958F1(AbstractC8020f0.str_group_tab_empty_hint);
            }
        } else {
            this.f64789L.mo44614b1(0);
            this.f64793P.mo44614b1(8);
            C31070a c31070a = c32020m7.f147418i;
            if (c31070a != null) {
                AbstractC23268y2.m120034h(this.f64798U, this.f64797T, this.f64790M, c31070a.f143229b, C23278z2.m120087O0(), z11);
                if (!TextUtils.isEmpty(c32020m7.f147418i.f143230c)) {
                    this.f64791N.m111959G1(c32020m7.f147418i.f143230c);
                } else {
                    this.f64791N.m111959G1("");
                }
            } else {
                this.f64790M.mo111925v1(AbstractC23136l9.m118665N(this.f64799V, AbstractC16803z.ic_add_members_blue_24));
                this.f64791N.m111958F1(AbstractC8020f0.group_header_create_title);
            }
        }
        if (this.f64800W != c32020m7.f147410a) {
            requestLayout();
        }
        this.f64800W = c32020m7.f147410a;
    }
}
