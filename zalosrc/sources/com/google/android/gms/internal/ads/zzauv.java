package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzauv implements Comparator<zzauu>, Parcelable {
    public static final Parcelable.Creator<zzauv> CREATOR = new C4429dj();

    /* renamed from: p */
    private final zzauu[] f31848p;

    /* renamed from: q */
    private int f31849q;

    /* renamed from: r */
    public final int f31850r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauv(Parcel parcel) {
        zzauu[] zzauuVarArr = (zzauu[]) parcel.createTypedArray(zzauu.CREATOR);
        this.f31848p = zzauuVarArr;
        this.f31850r = zzauuVarArr.length;
    }

    /* renamed from: a */
    public final zzauu m28693a(int i11) {
        return this.f31848p[i11];
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzauu zzauuVar, zzauu zzauuVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzauu zzauuVar3 = zzauuVar;
        zzauu zzauuVar4 = zzauuVar2;
        UUID uuid5 = AbstractC5093vg.f29306b;
        uuid = zzauuVar3.f31844q;
        if (uuid5.equals(uuid)) {
            uuid4 = zzauuVar4.f31844q;
            if (!uuid5.equals(uuid4)) {
                return 1;
            }
            return 0;
        }
        uuid2 = zzauuVar3.f31844q;
        uuid3 = zzauuVar4.f31844q;
        return uuid2.compareTo(uuid3);
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
        if (obj != null && zzauv.class == obj.getClass()) {
            return Arrays.equals(this.f31848p, ((zzauv) obj).f31848p);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f31849q;
        if (i11 == 0) {
            int hashCode = Arrays.hashCode(this.f31848p);
            this.f31849q = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedArray(this.f31848p, 0);
    }

    public zzauv(List list) {
        this(false, (zzauu[]) list.toArray(new zzauu[list.size()]));
    }

    private zzauv(boolean z11, zzauu... zzauuVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzauuVarArr = z11 ? (zzauu[]) zzauuVarArr.clone() : zzauuVarArr;
        Arrays.sort(zzauuVarArr, this);
        int i11 = 1;
        while (true) {
            int length = zzauuVarArr.length;
            if (i11 >= length) {
                this.f31848p = zzauuVarArr;
                this.f31850r = length;
                return;
            }
            uuid = zzauuVarArr[i11 - 1].f31844q;
            uuid2 = zzauuVarArr[i11].f31844q;
            if (uuid.equals(uuid2)) {
                uuid3 = zzauuVarArr[i11].f31844q;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(uuid3)));
            }
            i11++;
        }
    }

    public zzauv(zzauu... zzauuVarArr) {
        this(true, zzauuVarArr);
    }
}
