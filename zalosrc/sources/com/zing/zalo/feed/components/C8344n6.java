package com.zing.zalo.feed.components;

import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.components.n6 */
/* loaded from: classes4.dex */
final class C8344n6 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FeedSongInfoView f45539q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8344n6(FeedSongInfoView feedSongInfoView) {
        super(0);
        this.f45539q = feedSongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final RoundedImageView mo12V4() {
        return new RoundedImageView(this.f45539q.getContext());
    }
}
