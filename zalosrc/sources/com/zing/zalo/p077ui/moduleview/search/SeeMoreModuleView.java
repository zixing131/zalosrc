package com.zing.zalo.p077ui.moduleview.search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.List;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p716zh.C32020m7;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class SeeMoreModuleView extends ModulesView {

    /* renamed from: K */
    C16719g f65139K;

    /* renamed from: L */
    C16719g f65140L;

    /* renamed from: M */
    C16719g f65141M;

    /* renamed from: N */
    C16716d f65142N;

    /* renamed from: O */
    C22126c0 f65143O;

    /* renamed from: P */
    C22129e[] f65144P;

    /* renamed from: Q */
    C22126c0 f65145Q;

    /* renamed from: R */
    C21693c f65146R;

    /* renamed from: S */
    int f65147S;

    /* renamed from: T */
    int f65148T;

    /* renamed from: U */
    int f65149U;

    /* renamed from: V */
    InterfaceC12457a f65150V;

    /* renamed from: W */
    final int f65151W;

    /* renamed from: com.zing.zalo.ui.moduleview.search.SeeMoreModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12457a {
        /* renamed from: h */
        List mo36667h(String str);
    }

    public SeeMoreModuleView(Context context, InterfaceC12457a interfaceC12457a) {
        super(context);
        C22129e c22129e;
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f65151W = m119607o;
        this.f65150V = interfaceC12457a;
        this.f65147S = AbstractC23136l9.m118655I(AbstractC16802y.avt_image_size_default);
        this.f65148T = AbstractC23136l9.m118742r(22.0f);
        this.f65149U = AbstractC23136l9.m118742r(1.0f);
        m88987U(-1, this.f65147S);
        C16719g c16719g = new C16719g(context);
        this.f65139K = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        this.f65139K.m89106L().m89028L(-1, AbstractC23136l9.m118742r(6.0f));
        C16719g c16719g2 = new C16719g(context);
        this.f65140L = c16719g2;
        c16719g2.mo89161z0(m119607o);
        this.f65140L.m89106L().m89028L(-1, 1).m89023G(this.f65139K);
        C16719g c16719g3 = new C16719g(context);
        this.f65141M = c16719g3;
        c16719g3.mo89161z0(m119607o);
        C16718f m89028L = this.f65141M.m89106L().m89028L(-1, 1);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool);
        C16716d c16716d = new C16716d(context);
        this.f65142N = c16716d;
        c16716d.m89106L().m89028L(-1, -1).m89023G(this.f65140L).m89066s(this.f65141M).m89035S(AbstractC23136l9.m118742r(16.0f));
        C21693c c21693c = new C21693c(context);
        this.f65146R = c21693c;
        c21693c.mo111926w1(AbstractC16803z.mat_ic_listarrow);
        this.f65146R.m89106L().m89028L(-2, -2).m89017A(bool).m89034R(AbstractC23136l9.m118742r(10.0f)).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f65145Q = c22126c0;
        c22126c0.m89087B0(AbstractC16803z.bg_count_see_more);
        this.f65145Q.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f65145Q.mo44614b1(8);
        this.f65145Q.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85301f8));
        this.f65145Q.m89106L().m89028L(-2, AbstractC23136l9.m118742r(22.0f)).m89034R(this.f65149U).m89027K(true).m89029M(15).m89040X(AbstractC23136l9.m118742r(22.0f)).m89046b0(AbstractC23136l9.m118742r(2.0f)).m89047c0(AbstractC23136l9.m118742r(2.0f)).m89049e0(this.f65146R);
        this.f65142N.m89001g1(this.f65146R);
        this.f65142N.m89001g1(this.f65145Q);
        this.f65144P = new C22129e[3];
        for (int i11 = 2; i11 >= 0; i11--) {
            this.f65144P[i11] = new C22129e(context, this.f65148T);
            this.f65144P[i11].mo44614b1(8);
            this.f65144P[i11].m89106L().m89027K(true);
            if (i11 > 0) {
                this.f65144P[i11].m89106L().m89034R(this.f65149U);
            }
            if (i11 < 2) {
                C22129e[] c22129eArr = this.f65144P;
                c22129eArr[i11].m89106L().m89049e0(c22129eArr[i11 + 1]);
            } else {
                this.f65144P[i11].m89106L().m89049e0(this.f65145Q);
            }
            this.f65142N.m89001g1(this.f65144P[i11]);
        }
        C22126c0 c22126c02 = new C22126c0(context);
        this.f65143O = c22126c02;
        c22126c02.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85298f5));
        this.f65143O.m111962J1(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
        this.f65143O.m111958F1(AbstractC8020f0.label_see_full_search_result);
        this.f65143O.m111953A1(1);
        this.f65143O.m111957E1(true);
        this.f65143O.m111980v1(TextUtils.TruncateAt.END);
        C16718f m89034R = this.f65143O.m89106L().m89028L(-1, -2).m89027K(true).m89034R(AbstractC23136l9.m118742r(16.0f));
        C22129e[] c22129eArr2 = this.f65144P;
        if (c22129eArr2 != null && c22129eArr2.length > 0) {
            c22129e = c22129eArr2[0];
        } else {
            c22129e = null;
        }
        m89034R.m89049e0(c22129e);
        this.f65142N.m89001g1(this.f65143O);
        mo69681L(this.f65139K);
        mo69681L(this.f65140L);
        mo69681L(this.f65141M);
        mo69681L(this.f65142N);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_white_with_press_state);
    }

    /* renamed from: V */
    public void m69926V(C32020m7 c32020m7, boolean z11, int i11) {
        List list;
        int i12;
        ContactProfile contactProfile = c32020m7.f147411b;
        C16719g c16719g = this.f65140L;
        if (c16719g != null) {
            if (contactProfile.f42407e1) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            c16719g.mo44614b1(i12);
        }
        for (int i13 = 0; i13 < 3; i13++) {
            this.f65144P[i13].mo44614b1(8);
        }
        this.f65145Q.mo44614b1(8);
        InterfaceC12457a interfaceC12457a = this.f65150V;
        if (interfaceC12457a != null) {
            list = interfaceC12457a.mo36667h(contactProfile.f42434r);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                try {
                    ContactProfile contactProfile2 = ((C32020m7) list.get(i14)).f147411b;
                    if (contactProfile2.f42434r.equals("-16")) {
                        this.f65145Q.m111959G1(contactProfile2.f42437s);
                        this.f65145Q.mo44614b1(0);
                    } else {
                        this.f65144P[i14].mo44614b1(0);
                        C22129e c22129e = this.f65144P[i14];
                        c22129e.f108931U0 = z11;
                        c22129e.m115433q1(contactProfile2);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        C22126c0 c22126c0 = this.f65143O;
        if (c22126c0 != null) {
            c22126c0.m111959G1(contactProfile.f42437s);
        }
    }
}
