package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import p704z4.InterfaceC31224e;

/* renamed from: com.google.android.gms.common.internal.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC4167b0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC4167b0 m19629b(Activity activity, Intent intent, int i11) {
        return new C4238z(intent, activity, i11);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC4167b0 m19630c(InterfaceC31224e interfaceC31224e, Intent intent, int i11) {
        return new C4164a0(intent, interfaceC31224e, 2);
    }

    /* renamed from: a */
    protected abstract void mo19627a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        try {
            mo19627a();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
