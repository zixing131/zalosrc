package com.zing.zalo.p077ui.widget.reaction;

import android.content.Context;
import android.graphics.Point;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerContainerView;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.AbstractC19646n0;
import p266jg.AbstractC21244b;
import ph.C24753f;

/* renamed from: com.zing.zalo.ui.widget.reaction.b */
/* loaded from: classes6.dex */
public class C13751b extends KeyEventCallbackC17462c {

    /* renamed from: com.zing.zalo.ui.widget.reaction.b$a */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a */
        Context f71196a;

        /* renamed from: b */
        String f71197b;

        /* renamed from: c */
        MessageId f71198c;

        /* renamed from: d */
        ReactionPickerView.InterfaceC13747a f71199d;

        /* renamed from: e */
        Point f71200e;

        /* renamed from: f */
        boolean f71201f;

        /* renamed from: g */
        boolean f71202g;

        public a(Context context, String str, MessageId messageId, ReactionPickerView.InterfaceC13747a interfaceC13747a, Point point, boolean z11, boolean z12) {
            this.f71196a = context;
            this.f71197b = str;
            this.f71198c = messageId;
            this.f71199d = interfaceC13747a;
            this.f71200e = point;
            this.f71201f = z11;
            this.f71202g = z12;
        }

        /* renamed from: b */
        public C13751b m76831b() {
            String str;
            C24753f m102909L0 = AbstractC19646n0.m102909L0(this.f71197b, this.f71198c);
            if (m102909L0 != null) {
                str = m102909L0.m128595h();
            } else {
                str = null;
            }
            final ReactionPickerContainerView reactionPickerContainerView = new ReactionPickerContainerView(this.f71196a, this.f71200e, this.f71201f, this.f71199d, str, "msg_reaction_btn");
            C13751b c13751b = new C13751b(this.f71196a);
            c13751b.m92851B(reactionPickerContainerView);
            c13751b.mo88280H(new InterfaceC17463d.g() { // from class: lb0.a0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
                /* renamed from: a */
                public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                    ReactionPickerContainerView.this.m76801b();
                }
            });
            C17465f m92867k = c13751b.m92867k();
            m92867k.m92889H(-1, -1);
            m92867k.m92890I(1);
            m92867k.m92895b(131072);
            if (!AbstractC21244b.m110054d(this.f71196a)) {
                m92867k.m92895b(Integer.MIN_VALUE);
            } else {
                m92867k.m92895b(256);
            }
            if (!this.f71202g) {
                m92867k.m92886E(0.0f);
            }
            return c13751b;
        }
    }

    public C13751b(Context context) {
        super(context);
    }
}
