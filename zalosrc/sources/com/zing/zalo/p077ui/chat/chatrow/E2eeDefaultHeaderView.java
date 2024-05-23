package com.zing.zalo.p077ui.chat.chatrow;

import android.animation.ObjectAnimator;
import android.content.Context;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class E2eeDefaultHeaderView extends ModulesView {

    /* renamed from: K */
    private InterfaceC18494a f59080K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2eeDefaultHeaderView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89027K(true).m89032P(AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_lock_solid_16, AbstractC2807a.text_secondary));
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        c22126c0.m111962J1(x3Var.m62499G1());
        c22126c0.m89106L().m89041Y(0).m89018B(Boolean.TRUE).m89054h0(c21693c).m89032P(0, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(12.0f), 0);
        c22126c0.m111958F1(AbstractC8020f0.conversation_is_e2ee);
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        c22126c02.m111962J1(x3Var.m62627z());
        c22126c02.mo111965M1(1);
        c22126c02.m89106L().m89023G(c22126c0).m89071x(c22126c0).m89019C(c22126c0).m89033Q(AbstractC23136l9.m118742r(8.0f));
        c22126c02.mo89093E0(true);
        c22126c02.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.chatrow.p2
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                E2eeDefaultHeaderView.m61903b0(E2eeDefaultHeaderView.this, c16719g);
            }
        });
        c22126c02.m111958F1(AbstractC8020f0.str_view_details);
        C16716d c16716d = new C16716d(context);
        c16716d.m89001g1(c21693c);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c22126c02);
        c16716d.m89106L().m89036T(AbstractC23136l9.m118742r(48.0f)).m89028L(-2, -2).m89026J(true);
        c16716d.m89087B0(AbstractC16803z.rounded_bubble_chat_background_normal);
        c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.chatrow.q2
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                E2eeDefaultHeaderView.m61904c0(E2eeDefaultHeaderView.this, c16719g);
            }
        });
        mo69681L(c16716d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m61902a0(E2eeDefaultHeaderView e2eeDefaultHeaderView) {
        AbstractC19074t.m100208f(e2eeDefaultHeaderView, "this$0");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e2eeDefaultHeaderView, "alpha", 0.3f, 1.0f);
        ofFloat.setDuration(300L);
        e2eeDefaultHeaderView.setVisibility(0);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m61903b0(E2eeDefaultHeaderView e2eeDefaultHeaderView, C16719g c16719g) {
        AbstractC19074t.m100208f(e2eeDefaultHeaderView, "this$0");
        InterfaceC18494a interfaceC18494a = e2eeDefaultHeaderView.f59080K;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m61904c0(E2eeDefaultHeaderView e2eeDefaultHeaderView, C16719g c16719g) {
        AbstractC19074t.m100208f(e2eeDefaultHeaderView, "this$0");
        InterfaceC18494a interfaceC18494a = e2eeDefaultHeaderView.f59080K;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: Y */
    public final void m61905Y() {
        AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.o2
            @Override // java.lang.Runnable
            public final void run() {
                E2eeDefaultHeaderView.m61902a0(E2eeDefaultHeaderView.this);
            }
        }, 500L);
    }

    public final InterfaceC18494a getOnDetailsClick() {
        return this.f59080K;
    }

    public final void setOnDetailsClick(InterfaceC18494a interfaceC18494a) {
        this.f59080K = interfaceC18494a;
    }
}
