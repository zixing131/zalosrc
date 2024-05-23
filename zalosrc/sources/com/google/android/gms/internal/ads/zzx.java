package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new wg4();

    /* renamed from: p */
    private final zzw[] f32167p;

    /* renamed from: q */
    private int f32168q;

    /* renamed from: r */
    public final String f32169r;

    /* renamed from: s */
    public final int f32170s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(Parcel parcel) {
        this.f32169r = parcel.readString();
        zzw[] zzwVarArr = (zzw[]) g92.m22347h((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.f32167p = zzwVarArr;
        this.f32170s = zzwVarArr.length;
    }

    /* renamed from: a */
    public final zzw m28835a(int i11) {
        return this.f32167p[i11];
    }

    /* renamed from: b */
    public final zzx m28836b(String str) {
        if (g92.m22362t(this.f32169r, str)) {
            return this;
        }
        return new zzx(str, false, this.f32167p);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzw zzwVar, zzw zzwVar2) {
        zzw zzwVar3 = zzwVar;
        zzw zzwVar4 = zzwVar2;
        UUID uuid = da4.f19166a;
        if (uuid.equals(zzwVar3.f32163q)) {
            if (!uuid.equals(zzwVar4.f32163q)) {
                return 1;
            }
            return 0;
        }
        return zzwVar3.f32163q.compareTo(zzwVar4.f32163q);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (g92.m22362t(this.f32169r, zzxVar.f32169r) && Arrays.equals(this.f32167p, zzxVar.f32167p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i11 = this.f32168q;
        if (i11 == 0) {
            String str = this.f32169r;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.f32167p);
            this.f32168q = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f32169r);
        parcel.writeTypedArray(this.f32167p, 0);
    }

    private zzx(String str, boolean z11, zzw... zzwVarArr) {
        this.f32169r = str;
        zzwVarArr = z11 ? (zzw[]) zzwVarArr.clone() : zzwVarArr;
        this.f32167p = zzwVarArr;
        this.f32170s = zzwVarArr.length;
        Arrays.sort(zzwVarArr, this);
    }

    public zzx(String str, zzw... zzwVarArr) {
        this(null, true, zzwVarArr);
    }

    public zzx(List list) {
        this(null, false, (zzw[]) list.toArray(new zzw[0]));
    }
}
