package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.zdesign.component.C16959c0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Calendar;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p132ej.C18440b;
import p132ej.C18443e;
import p132ej.C18446h;
import p132ej.C18451m;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class DeletedThreadMsgModuleView extends TabMsgCommonItemModuleView {

    /* renamed from: i0 */
    private final InterfaceC24854k f64830i0;

    /* renamed from: j0 */
    private final InterfaceC24854k f64831j0;

    /* renamed from: com.zing.zalo.ui.moduleview.message.DeletedThreadMsgModuleView$a */
    /* loaded from: classes6.dex */
    static final class C12419a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12419a f64832q = new C12419a();

        C12419a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar mo12V4() {
            return Calendar.getInstance();
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.message.DeletedThreadMsgModuleView$b */
    /* loaded from: classes6.dex */
    static final class C12420b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12420b f64833q = new C12420b();

        C12420b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar mo12V4() {
            return Calendar.getInstance();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletedThreadMsgModuleView(Context context, C12260j c12260j) {
        super(context, c12260j);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(C12419a.f64832q);
        this.f64830i0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C12420b.f64833q);
        this.f64831j0 = m129210a2;
    }

    private final Calendar getC1() {
        return (Calendar) this.f64830i0.getValue();
    }

    private final Calendar getC2() {
        return (Calendar) this.f64831j0.getValue();
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        AbstractC12441l.m69871c(getMAvatar(), ((C18443e) c18451m).m97737v().m154671e());
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: g0 */
    public void mo69765g0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C12260j parent = getParent();
        if (parent != null && parent.m68702V()) {
            getMListItemModule().m90820w1().mo89099H0(false);
            getMListItemModule().m90799A1(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type2), 0, 0, 0);
            getMListItemModule().m90820w1().mo44614b1(0);
        } else {
            getMListItemModule().m90820w1().mo89091D0(isSelected());
            getMListItemModule().m90820w1().mo44614b1(8);
            getMListItemModule().m90799A1(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type1), 0, 0, 0);
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: i0 */
    public void mo69766i0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69766i0(c18451m, z11);
        String m119220T0 = AbstractC23160o0.m119220T0(((C18440b) c18451m).m97734t(), getC1(), getC2());
        AbstractC19074t.m100207e(m119220T0, "getTimestampUntilNowForTabMsgItems(...)");
        getMTime().m111959G1(m119220T0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        CharSequence charSequence;
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        C18446h m97730p = ((C18440b) c18451m).m97730p();
        if (m97730p == null || (charSequence = m97730p.m97750j()) == null) {
            charSequence = "";
        }
        mListItemModule.m90800B1(charSequence);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        int i11;
        boolean z12;
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        String m40990d = Conversation.m40990d(((C18443e) c18451m).m97729o(), true, false, false, 4, null);
        int length = m40990d.length() - 1;
        int i12 = 0;
        boolean z13 = false;
        while (i12 <= length) {
            if (!z13) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(m40990d.charAt(i11), 32) <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z13) {
                if (!z12) {
                    z13 = true;
                } else {
                    i12++;
                }
            } else if (!z12) {
                break;
            } else {
                length--;
            }
        }
        mListItemModule.m90805G1(m40990d.subSequence(i12, length + 1).toString());
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: u0 */
    public void mo69769u0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        getMListItemModule().m89087B0(AbstractC2810d.bg_list_item);
        C12260j parent = getParent();
        if (parent != null && parent.m68702V()) {
            setEnabled(false);
            setAlpha(0.5f);
        } else {
            setEnabled(true);
            setAlpha(1.0f);
        }
    }
}
