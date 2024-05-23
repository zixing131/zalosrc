package com.zing.zalo.feed.components;

import android.widget.RelativeLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.components.m6 */
/* loaded from: classes4.dex */
final class C8336m6 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FeedSongInfoView f45522q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8336m6(FeedSongInfoView feedSongInfoView) {
        super(0);
        this.f45522q = feedSongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final RelativeLayout mo12V4() {
        return new RelativeLayout(this.f45522q.getContext());
    }
}
