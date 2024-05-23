package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.cloudmessaging.i */
/* loaded from: classes2.dex */
final class C4065i {

    /* renamed from: a */
    private final Messenger f16124a;

    /* renamed from: b */
    private final zzd f16125b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4065i(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f16124a = new Messenger(iBinder);
            this.f16125b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f16125b = new zzd(iBinder);
            this.f16124a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m19169a(Message message) {
        Messenger messenger = this.f16124a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f16125b;
        if (zzdVar != null) {
            zzdVar.m19182b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
