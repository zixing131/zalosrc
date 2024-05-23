package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p597w4.C28724b;

/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C28724b();

    /* renamed from: p */
    Intent f16108p;

    public CloudMessage(Intent intent) {
        this.f16108p = intent;
    }

    /* renamed from: t */
    public Intent m19155t() {
        return this.f16108p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f16108p, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
