package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import au.C2343e;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalocore.CoreUtility;
import java.util.List;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p132ej.C18451m;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31874cb;
import ti0.C26705d;
import ti0.C26707f;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class SuggestFriendSeeMoreModuleView extends TabMsgItemModulesView {

    /* renamed from: K */
    C16719g f65003K;

    /* renamed from: L */
    C16716d f65004L;

    /* renamed from: M */
    C22126c0 f65005M;

    /* renamed from: N */
    C16716d f65006N;

    /* renamed from: O */
    C21693c[] f65007O;

    /* renamed from: P */
    C22126c0 f65008P;

    /* renamed from: Q */
    C21693c f65009Q;

    /* renamed from: R */
    C16719g f65010R;

    /* renamed from: S */
    C3977j[] f65011S;

    /* renamed from: T */
    C23528a f65012T;

    /* renamed from: U */
    C12260j f65013U;

    /* renamed from: V */
    Context f65014V;

    public SuggestFriendSeeMoreModuleView(Context context, C23528a c23528a, C12260j c12260j) {
        super(context);
        this.f65007O = new C21693c[3];
        this.f65011S = new C3977j[3];
        this.f65014V = context;
        this.f65012T = c23528a;
        this.f65013U = c12260j;
        for (int i11 = 0; i11 < 3; i11++) {
            this.f65011S[i11] = new C3977j(context);
        }
        m88987U(-1, -2);
        C16719g c16719g = new C16719g(context);
        this.f65003K = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f65003K.m89106L().m89028L(-1, 1);
        mo69681L(this.f65003K);
        C16716d c16716d = new C16716d(context);
        this.f65004L = c16716d;
        c16716d.m89106L().m89028L(-1, AbstractC23136l9.m118742r(48.0f)).m89023G(this.f65003K);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f65005M = c22126c0;
        c22126c0.m111958F1(AbstractC8020f0.label_see_full_search_result);
        new C26707f(this.f65005M).m137318a(C26705d.m137293a(context, AbstractC2814h.t_normal));
        this.f65005M.m111962J1(AbstractC23136l9.m118641B(context, AbstractC2808b.f150821b60));
        this.f65005M.m111953A1(1);
        this.f65005M.m111980v1(TextUtils.TruncateAt.END);
        C16718f m89028L = this.f65005M.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89027K(true).m89034R(AbstractC23136l9.m118742r(16.0f));
        this.f65004L.m89001g1(this.f65005M);
        C21693c c21693c = new C21693c(context);
        this.f65009Q = c21693c;
        c21693c.mo111926w1(AbstractC16803z.mat_ic_listarrow);
        this.f65009Q.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(16.0f)).m89034R(AbstractC23136l9.m118742r(10.0f)).m89027K(true).m89017A(bool);
        this.f65009Q.mo44614b1(8);
        this.f65009Q.m111929z1(5);
        this.f65004L.m89001g1(this.f65009Q);
        C16716d c16716d2 = new C16716d(context);
        this.f65006N = c16716d2;
        c16716d2.m89106L().m89028L(-2, -2).m89027K(true).m89049e0(this.f65009Q).m89035S(AbstractC23136l9.m118742r(16.0f));
        C22126c0 c22126c02 = new C22126c0(context);
        this.f65008P = c22126c02;
        c22126c02.mo111965M1(0);
        this.f65008P.m89087B0(AbstractC16803z.bg_count_see_more);
        this.f65008P.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f65008P.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f65008P.m111953A1(1);
        this.f65008P.m89106L().m89028L(AbstractC23136l9.m118742r(22.0f), AbstractC23136l9.m118742r(22.0f)).m89017A(bool).m89029M(15).m89034R(AbstractC23136l9.m118742r(1.0f));
        this.f65006N.m89001g1(this.f65008P);
        for (int i12 = 2; i12 >= 0; i12--) {
            this.f65007O[i12] = new C21693c(context);
            this.f65007O[i12].m89106L().m89028L(AbstractC23136l9.m118742r(22.0f), AbstractC23136l9.m118742r(22.0f)).m89034R(AbstractC23136l9.m118742r(1.0f));
            this.f65007O[i12].m111929z1(5);
            this.f65006N.m89001g1(this.f65007O[i12]);
            if (i12 == 2) {
                this.f65007O[i12].m89106L().m89049e0(this.f65008P);
            } else {
                this.f65007O[i12].m89106L().m89049e0(this.f65007O[i12 + 1]);
            }
        }
        this.f65004L.m89001g1(this.f65006N);
        C16719g c16719g2 = new C16719g(context);
        this.f65010R = c16719g2;
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f65010R.m89106L().m89028L(-1, 1).m89023G(this.f65004L);
        mo69681L(this.f65003K);
        mo69681L(this.f65004L);
        mo69681L(this.f65010R);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_bg_white_with_press_state);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12431b
    /* renamed from: C */
    public void mo69822C(C18451m c18451m, int i11) {
        for (int i12 = 0; i12 < 3; i12++) {
            try {
                this.f65007O[i12].mo44614b1(8);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        this.f65008P.mo44614b1(8);
        List list = this.f65013U.f63845u;
        if (list != null && !list.isEmpty()) {
            for (int i13 = 0; i13 < this.f65013U.f63845u.size(); i13++) {
                try {
                    C31874cb c31874cb = (C31874cb) this.f65013U.f63845u.get(i13);
                    if (c31874cb.f146385a.equals("-1")) {
                        this.f65008P.m111959G1(c31874cb.f146387c);
                        this.f65008P.mo44614b1(0);
                    } else {
                        this.f65007O[i13].mo44614b1(0);
                        if (C23302b.f113247a.m120523d(c31874cb.f146393i) && !CoreUtility.f89233i.equals(c31874cb.f146393i)) {
                            if (TextUtils.isEmpty(c31874cb.f146401q)) {
                                c31874cb.f146401q = AbstractC23028c0.m118087g(c31874cb.m153180d(true, false));
                            }
                            if (!TextUtils.isEmpty(c31874cb.f146401q)) {
                                this.f65007O[i13].mo111925v1(C16640q2.m88404a().mo88412f(c31874cb.f146401q, C2343e.m12307a(c31874cb.f146385a, false)));
                            }
                        } else {
                            AbstractC23268y2.m120033g(this.f65012T, this.f65011S[i13], this.f65007O[i13], c31874cb.f146393i, C23278z2.m120143n(), false);
                        }
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                }
            }
        }
    }
}
