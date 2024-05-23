package com.zing.zalo.p077ui.moduleview.privacy;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class PrivacyRowModuleView extends ModulesView {

    /* renamed from: K */
    public C16719g f65073K;

    /* renamed from: L */
    public C21693c f65074L;

    /* renamed from: M */
    public C21693c f65075M;

    /* renamed from: N */
    public C22126c0 f65076N;

    /* renamed from: O */
    public C22126c0 f65077O;

    /* renamed from: P */
    public C21693c f65078P;

    /* renamed from: Q */
    public C21693c f65079Q;

    public PrivacyRowModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m69875V(context);
    }

    /* renamed from: V */
    void m69875V(Context context) {
        try {
            C16719g c16719g = new C16719g(context);
            this.f65073K = c16719g;
            C16718f m89028L = c16719g.m89106L().m89028L(-1, 1);
            Boolean bool = Boolean.TRUE;
            m89028L.m89018B(bool).m89034R(AbstractC23136l9.m118742r(44.0f));
            this.f65073K.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            mo69681L(this.f65073K);
            C21693c c21693c = new C21693c(context);
            this.f65074L = c21693c;
            c21693c.m89106L().m89028L(-2, -2).m89073z(bool).m89027K(true).m89034R(AbstractC23136l9.m118742r(16.0f));
            this.f65074L.mo111926w1(AbstractC16803z.btn_radio_off_holo_light);
            mo69681L(this.f65074L);
            C21693c c21693c2 = new C21693c(context);
            this.f65075M = c21693c2;
            c21693c2.m89106L().m89028L(-2, -2).m89054h0(this.f65074L).m89027K(true).m89034R(AbstractC23136l9.m118742r(6.0f));
            this.f65075M.mo111926w1(AbstractC16803z.timeline_icon_friends);
            this.f65075M.mo44614b1(8);
            mo69681L(this.f65075M);
            C21693c c21693c3 = new C21693c(context);
            this.f65078P = c21693c3;
            c21693c3.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89041Y(AbstractC23136l9.m118742r(12.0f));
            this.f65078P.mo111926w1(AbstractC16803z.icn_social_form_edit_list);
            mo69681L(this.f65078P);
            C21693c c21693c4 = new C21693c(context);
            this.f65079Q = c21693c4;
            c21693c4.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89041Y(AbstractC23136l9.m118742r(12.0f));
            this.f65079Q.mo111926w1(AbstractC16803z.icn_profile_postfeed_arrow);
            this.f65079Q.mo44614b1(8);
            mo69681L(this.f65079Q);
            C20003a c20003a = new C20003a(this.f65078P, this.f65079Q);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2).m89027K(true).m89054h0(this.f65075M).m89050f0(c20003a).m89034R(AbstractC23136l9.m118742r(6.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89036T(AbstractC23136l9.m118742r(6.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89029M(12);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f65076N = c22126c0;
            c22126c0.m89106L().m89028L(-1, -2).m89018B(bool);
            this.f65076N.mo111964L1(AbstractC23136l9.m118742r(16.0f));
            this.f65076N.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cMTitle1));
            c16716d.m89001g1(this.f65076N);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f65077O = c22126c02;
            c22126c02.m89106L().m89028L(-1, -2).m89023G(this.f65076N);
            this.f65077O.mo111964L1(AbstractC23136l9.m118742r(12.0f));
            this.f65077O.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.calendar_event_expired));
            c16716d.m89001g1(this.f65077O);
            mo69681L(c16716d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public PrivacyRowModuleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m69875V(context);
    }
}
