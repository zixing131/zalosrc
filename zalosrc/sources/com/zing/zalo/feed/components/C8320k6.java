package com.zing.zalo.feed.components;

import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.components.k6 */
/* loaded from: classes4.dex */
final class C8320k6 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FeedSongInfoView f45465q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8320k6(FeedSongInfoView feedSongInfoView) {
        super(0);
        this.f45465q = feedSongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final AspectRatioImageView mo12V4() {
        return new AspectRatioImageView(this.f45465q.getContext());
    }
}
