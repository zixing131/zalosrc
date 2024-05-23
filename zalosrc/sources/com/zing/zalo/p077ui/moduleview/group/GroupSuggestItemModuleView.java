package com.zing.zalo.p077ui.moduleview.group;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import java.util.ArrayList;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22132g;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p692ys.C31070a;
import p716zh.C32020m7;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class GroupSuggestItemModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C16716d f64772K;

    /* renamed from: L */
    C21693c f64773L;

    /* renamed from: M */
    C16716d f64774M;

    /* renamed from: N */
    C22126c0 f64775N;

    /* renamed from: O */
    C22126c0 f64776O;

    /* renamed from: P */
    C16716d f64777P;

    /* renamed from: Q */
    C22132g f64778Q;

    /* renamed from: R */
    C22126c0 f64779R;

    /* renamed from: S */
    C16719g f64780S;

    /* renamed from: T */
    C16719g f64781T;

    /* renamed from: U */
    C3977j f64782U;

    /* renamed from: V */
    C23528a f64783V;

    public GroupSuggestItemModuleView(Context context, C23528a c23528a) {
        super(context);
        m88987U(-1, -2);
        this.f64782U = new C3977j(context);
        this.f64783V = c23528a;
        C16716d c16716d = new C16716d(context);
        this.f64772K = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f));
        C21693c c21693c = new C21693c(context);
        this.f64773L = c21693c;
        C16718f m89028L = c21693c.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.avt_L), AbstractC23136l9.m118655I(AbstractC16802y.avt_L));
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f));
        C16716d c16716d2 = new C16716d(context);
        this.f64774M = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(this.f64773L).m89035S(AbstractC23136l9.m118742r(12.0f));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64775N = c22126c0;
        c22126c0.mo111965M1(0);
        this.f64775N.m111953A1(1);
        this.f64775N.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        this.f64775N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        C22126c0 c22126c02 = this.f64775N;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        this.f64775N.m89106L().m89073z(bool).m89028L(-1, -2);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64776O = c22126c03;
        c22126c03.mo111965M1(0);
        this.f64776O.m111953A1(2);
        this.f64776O.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f64776O.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64776O.m111980v1(truncateAt);
        this.f64776O.m89106L().m89023G(this.f64775N).m89073z(bool).m89028L(-1, -2);
        C16716d c16716d3 = new C16716d(context);
        this.f64777P = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89023G(this.f64776O).m89073z(bool).m89036T(AbstractC23136l9.m118742r(6.0f));
        C22132g c22132g = new C22132g(context, AbstractC23136l9.m118742r(96.0f), 4, 1.0f, AbstractC23136l9.m118742r(4.0f));
        this.f64778Q = c22132g;
        c22132g.m89106L().m89028L(-1, -2).m89027K(true).m89073z(bool);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64779R = c22126c04;
        c22126c04.m89106L().m89028L(-2, -2).m89017A(bool).m89029M(15).m89027K(true).m89042Z(AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(12.0f), 0).m89023G(this.f64780S);
        AbstractC23022b5.m118023a(this.f64779R, AbstractC8915g0.btnType2_small);
        this.f64777P.m89001g1(this.f64778Q);
        this.f64777P.m89001g1(this.f64779R);
        C16719g c16719g = new C16719g(context);
        this.f64780S = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64780S.m89106L().m89028L(-1, 1).m89023G(this.f64772K).m89034R(AbstractC23136l9.m118742r(90.0f));
        C16719g c16719g2 = new C16719g(context);
        this.f64781T = c16719g2;
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        this.f64781T.m89106L().m89028L(-1, AbstractC23136l9.m118742r(10.0f)).m89023G(this.f64772K);
        this.f64774M.m89001g1(this.f64775N);
        this.f64774M.m89001g1(this.f64776O);
        this.f64774M.m89001g1(this.f64777P);
        this.f64772K.m89001g1(this.f64773L);
        this.f64772K.m89001g1(this.f64774M);
        mo69681L(this.f64772K);
        mo69681L(this.f64780S);
        mo69681L(this.f64781T);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        int i12;
        try {
            C31070a c31070a = c32020m7.f147418i;
            if (c31070a != null) {
                String str = c31070a.f143229b;
                String str2 = c31070a.f143230c;
                String str3 = c31070a.f143231d;
                this.f64775N.m111959G1(str2);
                this.f64776O.m111959G1(str3);
                AbstractC23268y2.m120034h(this.f64783V, this.f64782U, this.f64773L, str, C23278z2.m120143n(), z11);
                int i13 = 8;
                if (!TextUtils.isEmpty(c31070a.f143236i)) {
                    this.f64779R.mo44614b1(0);
                    String upperCase = c31070a.f143236i.toUpperCase();
                    if (upperCase.length() > 20) {
                        upperCase = upperCase.substring(0, 17) + "...";
                    }
                    this.f64779R.m111959G1(upperCase);
                } else {
                    this.f64779R.mo44614b1(8);
                }
                ArrayList arrayList = c31070a.f143239l;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                arrayList2.addAll(arrayList);
                this.f64778Q.m115449r1(arrayList2, c31070a.f143240m, z11);
                C16719g c16719g = this.f64780S;
                if (c32020m7.f147415f) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                c16719g.mo44614b1(i12);
                C16719g c16719g2 = this.f64781T;
                if (c32020m7.f147416g) {
                    i13 = 0;
                }
                c16719g2.mo44614b1(i13);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
