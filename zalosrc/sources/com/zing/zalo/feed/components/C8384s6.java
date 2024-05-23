package com.zing.zalo.feed.components;

import android.content.Context;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.components.s6 */
/* loaded from: classes4.dex */
final class C8384s6 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FeedSongInfoView f45678q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8384s6(FeedSongInfoView feedSongInfoView) {
        super(0);
        this.f45678q = feedSongInfoView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final RobotoTextView mo12V4() {
        Context context = this.f45678q.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return new RobotoTextView(context);
    }
}
