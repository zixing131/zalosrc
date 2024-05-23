package com.zing.zalo.zinstant;

import android.content.DialogInterface;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.zinstant.a1 */
/* loaded from: classes7.dex */
final class DialogInterfaceC17101a1 implements DialogInterface {

    /* renamed from: p */
    private final InterfaceC17463d f87471p;

    public DialogInterfaceC17101a1(InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        this.f87471p = interfaceC17463d;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.f87471p.cancel();
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.f87471p.dismiss();
    }
}
