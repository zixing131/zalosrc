package com.zing.zalo.p077ui.mediastore.link;

import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.mediastore.InterfaceC12371j;
import com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class MediaStoreLinkPagePresenter extends MediaStorePagePresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreLinkPagePresenter(InterfaceC12371j interfaceC12371j) {
        super(interfaceC12371j);
        AbstractC19074t.m100208f(interfaceC12371j, "mvpView");
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Jy */
    public boolean mo69047Jy(int i11) {
        if (i11 == AbstractC6918a0.action_bar_menu_more) {
            return true;
        }
        if (i11 == AbstractC6918a0.menu_change_layout_sub) {
            return false;
        }
        if (i11 == AbstractC6918a0.menu_multi_select) {
            return !mo69068fj();
        }
        return super.mo69047Jy(i11);
    }
}
