package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.p077ui.moduleview.message.NormalMsgModuleView;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.EnumC16991i;
import fn0.AbstractC19074t;
import gw.C19636i1;
import me0.AbstractC23136l9;
import p132ej.C18451m;
import p348mi.AbstractC23309i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class StrangerBoxModuleView extends TabMsgCommonItemModuleView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrangerBoxModuleView(Context context, C12260j c12260j) {
        super(context, c12260j);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        getMAvatar().m90889U1(AbstractC16803z.stranger_avatar);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.cm_strangermsg);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        mListItemModule.m90800B1(m118743r0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        mListItemModule.m90805G1(m118743r0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: l0 */
    public void mo69781l0(C18451m c18451m, boolean z11, int i11) {
        String str;
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69781l0(c18451m, z11, i11);
        EnumC16991i enumC16991i = EnumC16991i.CHAT_NUMBER;
        if (i11 > 0) {
            str = NormalMsgModuleView.C12425a.m69827b(NormalMsgModuleView.Companion, i11, false, 2, null);
        } else {
            enumC16991i = EnumC16991i.CHAT_DOT;
            str = "";
        }
        boolean z12 = !AbstractC23309i.m121567Wg();
        C16977g mUnreadBadge = getMUnreadBadge();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(enumC16991i);
        c16974f.m90972v(str);
        c16974f.m90969s(z12);
        c16974f.m90975y(true);
        mUnreadBadge.m90983u1(c16974f);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: q0 */
    public int mo69782q0(C18451m c18451m) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        return C19636i1.Companion.m102800a().m102741B();
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: r0 */
    public boolean mo69825r0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "item");
        if (i11 > 0 || (!C19636i1.Companion.m102800a().m102753K().isEmpty())) {
            return true;
        }
        return false;
    }
}
