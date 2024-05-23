package com.zing.zalo.p077ui.backuprestore.widget;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.ui.backuprestore.widget.c */
/* loaded from: classes5.dex */
final class C11154c extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ SyncStateView f56174q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11154c(SyncStateView syncStateView) {
        super(0);
        this.f56174q = syncStateView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer mo12V4() {
        return Integer.valueOf(C23212s8.m119607o(this.f56174q.getContext(), AbstractC21196a.TextColor1));
    }
}
