package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C4057a();

    /* renamed from: p */
    Messenger f16135p;

    public zzd(IBinder iBinder) {
        this.f16135p = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder m19181a() {
        Messenger messenger = this.f16135p;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void m19182b(Message message) {
        Messenger messenger = this.f16135p;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m19181a().equals(((zzd) obj).m19181a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m19181a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Messenger messenger = this.f16135p;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
