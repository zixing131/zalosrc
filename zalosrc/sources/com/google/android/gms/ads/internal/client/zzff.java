package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzff(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 2, this.zza);
        AbstractC2552a.m12914c(parcel, 3, this.zzb);
        AbstractC2552a.m12914c(parcel, 4, this.zzc);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzff(boolean z11, boolean z12, boolean z13) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = z13;
    }
}
