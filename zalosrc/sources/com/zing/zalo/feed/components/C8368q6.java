package com.zing.zalo.feed.components;

import android.widget.FrameLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.components.q6 */
/* loaded from: classes4.dex */
final class C8368q6 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FeedSongInfoView f45637q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8368q6(FeedSongInfoView feedSongInfoView) {
        super(0);
        this.f45637q = feedSongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FrameLayout mo12V4() {
        return new FrameLayout(this.f45637q.getContext());
    }
}
