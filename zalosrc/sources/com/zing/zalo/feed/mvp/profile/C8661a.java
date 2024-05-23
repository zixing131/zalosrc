package com.zing.zalo.feed.mvp.profile;

import android.content.Context;
import com.zing.zalo.uicontrol.C16662u0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.feed.mvp.profile.a */
/* loaded from: classes4.dex */
final class C8661a extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ DiscoverySkeletonView f46608q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8661a(DiscoverySkeletonView discoverySkeletonView) {
        super(0);
        this.f46608q = discoverySkeletonView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final C16662u0 mo12V4() {
        Context context = this.f46608q.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return new C16662u0(context);
    }
}
