package com.zing.zalo.p077ui.moduleview.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17075z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class E2eeDefault11Banner extends ModulesView {

    /* renamed from: K */
    private InterfaceC12435f f64834K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E2eeDefault11Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m69775Y(E2eeDefault11Banner e2eeDefault11Banner, C16719g c16719g) {
        AbstractC19074t.m100208f(e2eeDefault11Banner, "this$0");
        InterfaceC12435f interfaceC12435f = e2eeDefault11Banner.f64834K;
        if (interfaceC12435f != null) {
            interfaceC12435f.mo68395a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m69776a0(E2eeDefault11Banner e2eeDefault11Banner, C16719g c16719g) {
        AbstractC19074t.m100208f(e2eeDefault11Banner, "this$0");
        InterfaceC12435f interfaceC12435f = e2eeDefault11Banner.f64834K;
        if (interfaceC12435f != null) {
            interfaceC12435f.mo68396b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m69777b0(E2eeDefault11Banner e2eeDefault11Banner, View view) {
        AbstractC19074t.m100208f(e2eeDefault11Banner, "this$0");
        InterfaceC12435f interfaceC12435f = e2eeDefault11Banner.f64834K;
        if (interfaceC12435f != null) {
            interfaceC12435f.mo68395a();
        }
    }

    public final InterfaceC12435f getDelegate() {
        return this.f64834K;
    }

    public final void setDelegate(InterfaceC12435f interfaceC12435f) {
        this.f64834K = interfaceC12435f;
    }

    public /* synthetic */ E2eeDefault11Banner(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2eeDefault11Banner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        C21693c c21693c = new C21693c(context);
        C16718f m89032P = c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(40.0f)).m89032P(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f), 0, 0);
        Boolean bool = Boolean.TRUE;
        m89032P.m89073z(bool).m89018B(bool);
        c21693c.mo111926w1(AbstractC23322a.zds_bil_e2ee_spot_1_1);
        mo69681L(c21693c);
        C22122a0 c22122a0 = new C22122a0(context);
        c22122a0.m89106L().m89031O(AbstractC23136l9.m118742r(6.0f)).m89018B(bool).m89017A(bool);
        c22122a0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_24, AbstractC2807a.icon_tertiary));
        mo69681L(c22122a0);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89032P(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f), 0, 0).m89020D(c21693c).m89054h0(c21693c).m89049e0(c22122a0).m89032P(AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(12.0f), 0);
        c22126c0.m111958F1(AbstractC8020f0.e2ee_default_1_1_banner_desc);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        c22126c0.m111962J1(x3Var.m62600p());
        mo69681L(c22126c0);
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89071x(c22126c0).m89023G(c22126c0).m89036T(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(16.0f));
        c22126c02.mo111965M1(1);
        c22126c02.m111958F1(AbstractC8020f0.str_view_details);
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c02.m111962J1(x3Var.m62627z());
        mo69681L(c22126c02);
        C16719g c17075z = new C17075z(context);
        c17075z.m89106L().m89023G(c22126c02);
        mo69681L(c17075z);
        c22126c02.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.c
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                E2eeDefault11Banner.m69775Y(E2eeDefault11Banner.this, c16719g);
            }
        });
        c22122a0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.d
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                E2eeDefault11Banner.m69776a0(E2eeDefault11Banner.this, c16719g);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.moduleview.message.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E2eeDefault11Banner.m69777b0(E2eeDefault11Banner.this, view);
            }
        });
    }
}
