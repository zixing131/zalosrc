package com.zing.zalo.camera.filterpicker.customviews;

import android.content.Context;
import com.androidquery.util.C3977j;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.camera.filterpicker.customviews.b */
/* loaded from: classes3.dex */
final class C7624b extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ FilterPickerRoundedCornerImageView f41251q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7624b(FilterPickerRoundedCornerImageView filterPickerRoundedCornerImageView) {
        super(0);
        this.f41251q = filterPickerRoundedCornerImageView;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final C3977j mo12V4() {
        Context context = this.f41251q.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return new C3977j(context);
    }
}
