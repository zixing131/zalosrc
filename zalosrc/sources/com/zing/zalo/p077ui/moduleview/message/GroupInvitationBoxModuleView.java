package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import bi.C2806e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.zdesign.component.C16959c0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p132ej.C18451m;
import p656xs.AbstractC30200a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class GroupInvitationBoxModuleView extends TabMsgCommonItemModuleView {

    /* renamed from: i0 */
    private final C12260j f64850i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitationBoxModuleView(Context context, C12260j c12260j) {
        super(context, c12260j);
        AbstractC19074t.m100208f(context, "context");
        this.f64850i0 = c12260j;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        getMAvatar().m90889U1(AbstractC16803z.invitation_box_avatar);
    }

    public final C12260j getAdapter() {
        return this.f64850i0;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        C2806e c2806e = C2806e.f11255a;
        C16959c0 mListItemModule = getMListItemModule();
        String string = getResources().getString(AbstractC8020f0.str_group_invitation_item_message_singular_v2, Integer.valueOf(c2806e.m13582g()));
        AbstractC19074t.m100207e(string, "getString(...)");
        mListItemModule.m90800B1(string);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        if (AbstractC30200a.m148947f()) {
            i11 = AbstractC8020f0.str_group_invitation_item_title_v2;
        } else {
            i11 = AbstractC8020f0.str_group_invitation_item_title;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        mListItemModule.m90805G1(m118743r0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: l0 */
    public void mo69781l0(C18451m c18451m, boolean z11, int i11) {
        AbstractC19074t.m100208f(c18451m, "item");
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: q0 */
    public int mo69782q0(C18451m c18451m) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        return C2806e.f11255a.m13577b();
    }
}
