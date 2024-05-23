package com.zing.zalo.feed.components;

import com.zing.zalo.p077ui.widget.SlideShowSound;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.components.i6 */
/* loaded from: classes4.dex */
final class C8303i6 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FeedSongInfoView f45428q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8303i6(FeedSongInfoView feedSongInfoView) {
        super(0);
        this.f45428q = feedSongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final SlideShowSound mo12V4() {
        return new SlideShowSound(this.f45428q.getContext(), null);
    }
}
