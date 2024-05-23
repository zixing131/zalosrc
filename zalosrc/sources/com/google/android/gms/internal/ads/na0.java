package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* loaded from: classes2.dex */
public final class na0 implements MediationAdRequest {

    /* renamed from: a */
    private final Date f25097a;

    /* renamed from: b */
    private final int f25098b;

    /* renamed from: c */
    private final Set f25099c;

    /* renamed from: d */
    private final boolean f25100d;

    /* renamed from: e */
    private final Location f25101e;

    /* renamed from: f */
    private final int f25102f;

    /* renamed from: g */
    private final boolean f25103g;

    /* renamed from: h */
    private final String f25104h;

    public na0(Date date, int i11, Set set, Location location, boolean z11, int i12, boolean z12, int i13, String str) {
        this.f25097a = date;
        this.f25098b = i11;
        this.f25099c = set;
        this.f25101e = location;
        this.f25100d = z11;
        this.f25102f = i12;
        this.f25103g = z12;
        this.f25104h = str;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f25097a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f25098b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f25099c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f25101e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f25103g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f25100d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f25102f;
    }
}
