package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ya0 implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f30845a;

    /* renamed from: b */
    private final int f30846b;

    /* renamed from: c */
    private final Set f30847c;

    /* renamed from: d */
    private final boolean f30848d;

    /* renamed from: e */
    private final Location f30849e;

    /* renamed from: f */
    private final int f30850f;

    /* renamed from: g */
    private final zzbls f30851g;

    /* renamed from: i */
    private final boolean f30853i;

    /* renamed from: k */
    private final String f30855k;

    /* renamed from: h */
    private final List f30852h = new ArrayList();

    /* renamed from: j */
    private final Map f30854j = new HashMap();

    public ya0(Date date, int i11, Set set, Location location, boolean z11, int i12, zzbls zzblsVar, List list, boolean z12, int i13, String str) {
        this.f30845a = date;
        this.f30846b = i11;
        this.f30847c = set;
        this.f30849e = location;
        this.f30848d = z11;
        this.f30850f = i12;
        this.f30851g = zzblsVar;
        this.f30853i = z12;
        this.f30855k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f30854j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f30854j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f30852h.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzed.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f30845a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f30846b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f30847c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f30849e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzbls zzblsVar = this.f30851g;
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
                builder.setImageOrientation(zzblsVar.f31896r);
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
        builder.setImageOrientation(zzblsVar.f31896r);
        builder.setRequestMultipleImages(zzblsVar.f31897s);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbls.m28706t(this.f30851g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzed.zzf().zzv();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f30853i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f30848d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        if (this.f30852h.contains("6")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f30850f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.f30854j;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        if (this.f30852h.contains("3")) {
            return true;
        }
        return false;
    }
}
