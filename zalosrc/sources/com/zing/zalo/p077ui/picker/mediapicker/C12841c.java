package com.zing.zalo.p077ui.picker.mediapicker;

import android.text.Layout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import y50.C30795e;

/* renamed from: com.zing.zalo.ui.picker.mediapicker.c */
/* loaded from: classes6.dex */
final class C12841c extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ MediaPickerPermissionBanner f66744q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12841c(MediaPickerPermissionBanner mediaPickerPermissionBanner) {
        super(0);
        this.f66744q = mediaPickerPermissionBanner;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final C30795e mo12V4() {
        Layout layout = this.f66744q.getLayout();
        AbstractC19074t.m100207e(layout, "getLayout(...)");
        return new C30795e(layout);
    }
}
