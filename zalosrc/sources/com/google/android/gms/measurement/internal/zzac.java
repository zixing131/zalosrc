package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C5957d();

    /* renamed from: p */
    public String f34664p;

    /* renamed from: q */
    public String f34665q;

    /* renamed from: r */
    public zzli f34666r;

    /* renamed from: s */
    public long f34667s;

    /* renamed from: t */
    public boolean f34668t;

    /* renamed from: u */
    public String f34669u;

    /* renamed from: v */
    public final zzaw f34670v;

    /* renamed from: w */
    public long f34671w;

    /* renamed from: x */
    public zzaw f34672x;

    /* renamed from: y */
    public final long f34673y;

    /* renamed from: z */
    public final zzaw f34674z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzac zzacVar) {
        AbstractC4205o.m19722k(zzacVar);
        this.f34664p = zzacVar.f34664p;
        this.f34665q = zzacVar.f34665q;
        this.f34666r = zzacVar.f34666r;
        this.f34667s = zzacVar.f34667s;
        this.f34668t = zzacVar.f34668t;
        this.f34669u = zzacVar.f34669u;
        this.f34670v = zzacVar.f34670v;
        this.f34671w = zzacVar.f34671w;
        this.f34672x = zzacVar.f34672x;
        this.f34673y = zzacVar.f34673y;
        this.f34674z = zzacVar.f34674z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f34664p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f34665q, false);
        AbstractC2552a.m12932u(parcel, 4, this.f34666r, i11, false);
        AbstractC2552a.m12929r(parcel, 5, this.f34667s);
        AbstractC2552a.m12914c(parcel, 6, this.f34668t);
        AbstractC2552a.m12934w(parcel, 7, this.f34669u, false);
        AbstractC2552a.m12932u(parcel, 8, this.f34670v, i11, false);
        AbstractC2552a.m12929r(parcel, 9, this.f34671w);
        AbstractC2552a.m12932u(parcel, 10, this.f34672x, i11, false);
        AbstractC2552a.m12929r(parcel, 11, this.f34673y);
        AbstractC2552a.m12932u(parcel, 12, this.f34674z, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(String str, String str2, zzli zzliVar, long j11, boolean z11, String str3, zzaw zzawVar, long j12, zzaw zzawVar2, long j13, zzaw zzawVar3) {
        this.f34664p = str;
        this.f34665q = str2;
        this.f34666r = zzliVar;
        this.f34667s = j11;
        this.f34668t = z11;
        this.f34669u = str3;
        this.f34670v = zzawVar;
        this.f34671w = j12;
        this.f34672x = zzawVar2;
        this.f34673y = j13;
        this.f34674z = zzawVar3;
    }
}
