package com.zing.zalo.p077ui.backuprestore.widget;

import com.zing.zalo.biometric.AbstractC7354t0;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import me0.C23212s8;

/* renamed from: com.zing.zalo.ui.backuprestore.widget.b */
/* loaded from: classes5.dex */
final class C11153b extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ SyncStateView f56173q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11153b(SyncStateView syncStateView) {
        super(0);
        this.f56173q = syncStateView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final Integer mo12V4() {
        return Integer.valueOf(C23212s8.m119607o(this.f56173q.getContext(), AbstractC7354t0.NotificationColor1));
    }
}
