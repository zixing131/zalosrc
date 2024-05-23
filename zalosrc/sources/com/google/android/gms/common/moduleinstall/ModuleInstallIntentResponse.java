package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p122e5.C18205f;

/* loaded from: classes2.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new C18205f();

    /* renamed from: p */
    private final PendingIntent f16699p;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f16699p = pendingIntent;
    }

    /* renamed from: t */
    public PendingIntent m19830t() {
        return this.f16699p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, m19830t(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
