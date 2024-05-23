package com.zing.zalo.p077ui.moduleview.message;

import android.content.Context;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import fn0.AbstractC19074t;
import java.util.Calendar;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p132ej.C18439a;
import p132ej.C18451m;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public final class RemindEventMsgModuleView extends TabMsgCommonItemModuleView {

    /* renamed from: i0 */
    private C22126c0 f64983i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindEventMsgModuleView(Context context, C12260j c12260j) {
        super(context, c12260j);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c12260j, "adapter");
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        C22126c0 c22126c0 = this.f64983i0;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("avatarWithCurrentDay");
            c22126c0 = null;
        }
        c22126c0.m111959G1(String.valueOf(Calendar.getInstance().get(5)));
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        getMListItemModule().m90801C1(TabMsgCommonItemModuleView.Companion.m69866f());
        getMListItemModule().m90800B1(((C18439a) c18451m).m97717o());
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        getMListItemModule().m90809K1(true);
        C16959c0 mListItemModule = getMListItemModule();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_titlebar);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        mListItemModule.m90805G1(m118743r0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: m0 */
    public C16719g mo69842m0() {
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89106L = c22126c0.m89106L();
        int i11 = AbstractC23222t7.f112545X;
        m89106L.m89028L(i11, i11).m89048d0(AbstractC23222t7.f112564i).m89029M(15);
        c22126c0.m89087B0(AbstractC16803z.icn_calendar_tabmessage_bg);
        c22126c0.mo111965M1(1);
        c22126c0.mo111964L1(AbstractC23222t7.f112588u);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        this.f64983i0 = c22126c0;
        return c22126c0;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: u0 */
    public void mo69769u0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        getMListItemModule().m89087B0(AbstractC2810d.bg_list_item_pinned);
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
