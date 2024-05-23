package com.zing.zalo.camera.filterpicker.customviews;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.camera.filterpicker.customviews.a */
/* loaded from: classes3.dex */
final class C7623a extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FilterPickerRoundedCornerImageView f41250q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7623a(FilterPickerRoundedCornerImageView filterPickerRoundedCornerImageView) {
        super(0);
        this.f41250q = filterPickerRoundedCornerImageView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final C23528a mo12V4() {
        return new C23528a(this.f41250q.getContext());
    }
}
