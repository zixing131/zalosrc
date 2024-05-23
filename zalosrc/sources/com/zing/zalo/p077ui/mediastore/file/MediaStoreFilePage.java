package com.zing.zalo.p077ui.mediastore.file;

import ac.InterfaceC0733x;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.p077ui.mediastore.InterfaceC12370i;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;

/* loaded from: classes6.dex */
public class MediaStoreFilePage extends MediaStoreBasePage<InterfaceC12370i> implements InterfaceC0733x {
    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C7226u3 m68868IM = m68868IM();
        if (m68868IM != null) {
            m68868IM.m36820y0();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: UM */
    public InterfaceC12370i mo68889UM() {
        return new MediaStoreFilePagePresenter(this);
    }
}
