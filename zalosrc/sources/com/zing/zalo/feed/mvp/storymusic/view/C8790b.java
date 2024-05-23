package com.zing.zalo.feed.mvp.storymusic.view;

import android.content.Context;
import com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.mvp.storymusic.view.b */
/* loaded from: classes4.dex */
final class C8790b extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ StorySongInfoView f47102q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8790b(StorySongInfoView storySongInfoView) {
        super(0);
        this.f47102q = storySongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final StorySongInfoView.ErrorView mo12V4() {
        Context context = this.f47102q.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return new StorySongInfoView.ErrorView(context);
    }
}
