package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.b20;
import com.google.android.gms.internal.ads.c20;
import p031b5.AbstractC2552a;

@Deprecated
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    private final boolean zza;
    private final zzbz zzb;
    private final IBinder zzc;

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Builder {
        private ShouldDelayBannerRenderingListener zza;

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zza = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublisherAdViewOptions(boolean z11, IBinder iBinder, IBinder iBinder2) {
        zzbz zzbzVar;
        this.zza = z11;
        if (iBinder != null) {
            zzbzVar = zzby.zzd(iBinder);
        } else {
            zzbzVar = null;
        }
        this.zzb = zzbzVar;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        IBinder asBinder;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, this.zza);
        zzbz zzbzVar = this.zzb;
        if (zzbzVar == null) {
            asBinder = null;
        } else {
            asBinder = zzbzVar.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 2, asBinder, false);
        AbstractC2552a.m12923l(parcel, 3, this.zzc, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public final zzbz zza() {
        return this.zzb;
    }

    public final c20 zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return b20.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
