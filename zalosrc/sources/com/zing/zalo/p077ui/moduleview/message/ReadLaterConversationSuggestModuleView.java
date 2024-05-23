package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.maintab.msg.AbstractC12211a;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.C17075z;
import com.zing.zalo.zdesign.component.avatar.EnumC16947c;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import dg0.AbstractC17930e;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p132ej.C18451m;
import p354n3.C23528a;
import vg.C28203u6;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class ReadLaterConversationSuggestModuleView extends TabMsgItemModulesView {

    /* renamed from: K */
    private C23528a f64972K;

    /* renamed from: L */
    private C12260j f64973L;

    /* renamed from: M */
    private C16959c0 f64974M;

    /* renamed from: N */
    private C16971e f64975N;

    /* renamed from: O */
    private C17023o f64976O;

    /* renamed from: P */
    private C17023o f64977P;

    /* renamed from: Q */
    private int f64978Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadLaterConversationSuggestModuleView(Context context, C23528a c23528a, C12260j c12260j) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "mAQ");
        AbstractC19074t.m100208f(c12260j, "parent");
        this.f64972K = c23528a;
        this.f64973L = c12260j;
        m88987U(-1, -2);
        this.f64975N = new C16971e(context, EnumC16949e.SIZE_48);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-2, -2).m89034R(AbstractC23222t7.f112558f).m89027K(true);
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonSmall_Secondary);
        this.f64976O = c17023o;
        c17023o.m91114u1(AbstractC8020f0.str_add);
        C17023o c17023o2 = new C17023o(context, AbstractC2814h.ButtonSmall_TertiaryNeutral);
        this.f64977P = c17023o2;
        c17023o2.m91112r1(AbstractC23136l9.m118663M(AbstractC23322a.zds_ic_close_line_16));
        this.f64977P.m89106L().m89027K(true).m89054h0(this.f64976O).m89034R(AbstractC23222t7.f112562h);
        c16716d.m89001g1(this.f64976O);
        c16716d.m89001g1(this.f64977P);
        C16959c0 c16959c0 = new C16959c0(context);
        this.f64974M = c16959c0;
        c16959c0.m89106L().m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112576o).m89047c0(AbstractC23222t7.f112566j);
        this.f64974M.m90814p1(this.f64975N);
        this.f64974M.m90816r1(c16716d);
        mo69681L(this.f64974M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m69838a0(AbstractC12211a.b bVar, ContactProfile contactProfile, C16719g c16719g) {
        AbstractC19074t.m100208f(contactProfile, "$profileData");
        if (bVar != null) {
            bVar.mo68364ic(new Conversation(contactProfile));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m69839b0(AbstractC12211a.b bVar, ContactProfile contactProfile, C16719g c16719g) {
        AbstractC19074t.m100208f(contactProfile, "$profileData");
        if (bVar != null) {
            bVar.mo68387uw(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m69840c0(final ReadLaterConversationSuggestModuleView readLaterConversationSuggestModuleView, final C18451m c18451m, final int i11) {
        AbstractC19074t.m100208f(readLaterConversationSuggestModuleView, "this$0");
        AbstractC19074t.m100208f(c18451m, "$tabMsgItem");
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.moduleview.message.q
            @Override // java.lang.Runnable
            public final void run() {
                ReadLaterConversationSuggestModuleView.m69841d0(ReadLaterConversationSuggestModuleView.this, c18451m, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m69841d0(ReadLaterConversationSuggestModuleView readLaterConversationSuggestModuleView, C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(readLaterConversationSuggestModuleView, "this$0");
        AbstractC19074t.m100208f(c18451m, "$tabMsgItem");
        readLaterConversationSuggestModuleView.f64978Q++;
        readLaterConversationSuggestModuleView.mo69822C(c18451m, i11);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12431b
    /* renamed from: C */
    public void mo69822C(final C18451m c18451m, final int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        final ContactProfile contactProfile = c18451m.f92992c;
        if (contactProfile == null) {
            return;
        }
        final AbstractC12211a.b bVar = this.f64973L.f63847w;
        this.f64976O.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.n
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ReadLaterConversationSuggestModuleView.m69838a0(AbstractC12211a.b.this, contactProfile, c16719g);
            }
        });
        this.f64977P.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.o
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ReadLaterConversationSuggestModuleView.m69839b0(AbstractC12211a.b.this, contactProfile, c16719g);
            }
        });
        AbstractC12441l.m69869a(this.f64975N, contactProfile);
        int i12 = 0;
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, contactProfile.f42434r, false, 2, null);
        if (m141800i != null && m141800i.m40359B0()) {
            this.f64975N.m90896b2(EnumC16947c.OA);
        } else {
            this.f64975N.m90896b2(EnumC16947c.OFFLINE);
        }
        C16959c0 c16959c0 = this.f64974M;
        String m40383Q = contactProfile.m40383Q(true, false);
        AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
        c16959c0.m90805G1(m40383Q);
        String str = contactProfile.f42437s;
        if ((str == null || str.length() == 0) && this.f64978Q < 3) {
            AbstractC17930e.Companion.m94550a().mo94531e(new Runnable() { // from class: com.zing.zalo.ui.moduleview.message.p
                @Override // java.lang.Runnable
                public final void run() {
                    ReadLaterConversationSuggestModuleView.m69840c0(ReadLaterConversationSuggestModuleView.this, c18451m, i11);
                }
            }, 500L);
        }
        C17075z m90821x1 = this.f64974M.m90821x1();
        if (c18451m.f92993d) {
            i12 = 8;
        }
        m90821x1.mo44614b1(i12);
    }

    public final C23528a getMAQ() {
        return this.f64972K;
    }

    public final C16971e getMAvatar() {
        return this.f64975N;
    }

    @Override // android.view.View, android.view.ViewParent
    public final C12260j getParent() {
        return this.f64973L;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f64972K = c23528a;
    }

    public final void setMAvatar(C16971e c16971e) {
        AbstractC19074t.m100208f(c16971e, "<set-?>");
        this.f64975N = c16971e;
    }

    public final void setParent(C12260j c12260j) {
        AbstractC19074t.m100208f(c12260j, "<set-?>");
        this.f64973L = c12260j;
    }
}
