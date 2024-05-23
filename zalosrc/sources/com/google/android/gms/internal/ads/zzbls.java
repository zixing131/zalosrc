package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbls extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbls> CREATOR = new C5224yz();

    /* renamed from: p */
    public final int f31894p;

    /* renamed from: q */
    public final boolean f31895q;

    /* renamed from: r */
    public final int f31896r;

    /* renamed from: s */
    public final boolean f31897s;

    /* renamed from: t */
    public final int f31898t;

    /* renamed from: u */
    public final zzff f31899u;

    /* renamed from: v */
    public final boolean f31900v;

    /* renamed from: w */
    public final int f31901w;

    public zzbls(int i11, boolean z11, int i12, boolean z12, int i13, zzff zzffVar, boolean z13, int i14) {
        this.f31894p = i11;
        this.f31895q = z11;
        this.f31896r = i12;
        this.f31897s = z12;
        this.f31898t = i13;
        this.f31899u = zzffVar;
        this.f31900v = z13;
        this.f31901w = i14;
    }

    /* renamed from: t */
    public static NativeAdOptions m28706t(zzbls zzblsVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblsVar == null) {
            return builder.build();
        }
        int i11 = zzblsVar.f31894p;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    builder.setRequestCustomMuteThisAd(zzblsVar.f31900v);
                    builder.setMediaAspectRatio(zzblsVar.f31901w);
                }
                builder.setReturnUrlsForImageAssets(zzblsVar.f31895q);
                builder.setRequestMultipleImages(zzblsVar.f31897s);
                return builder.build();
            }
            zzff zzffVar = zzblsVar.f31899u;
            if (zzffVar != null) {
                builder.setVideoOptions(new VideoOptions(zzffVar));
            }
        }
        builder.setAdChoicesPlacement(zzblsVar.f31898t);
        builder.setReturnUrlsForImageAssets(zzblsVar.f31895q);
        builder.setRequestMultipleImages(zzblsVar.f31897s);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f31894p);
        AbstractC2552a.m12914c(parcel, 2, this.f31895q);
        AbstractC2552a.m12924m(parcel, 3, this.f31896r);
        AbstractC2552a.m12914c(parcel, 4, this.f31897s);
        AbstractC2552a.m12924m(parcel, 5, this.f31898t);
        AbstractC2552a.m12932u(parcel, 6, this.f31899u, i11, false);
        AbstractC2552a.m12914c(parcel, 7, this.f31900v);
        AbstractC2552a.m12924m(parcel, 8, this.f31901w);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzbls(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
