package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.C17791z;

/* loaded from: classes2.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new C17791z();

    /* renamed from: p */
    private final int f33514p;

    /* renamed from: q */
    private final int f33515q;

    /* renamed from: r */
    private final int f33516r;

    /* renamed from: s */
    private final int f33517s;

    /* renamed from: t */
    private final int f33518t;

    /* renamed from: u */
    private final int f33519u;

    /* renamed from: v */
    private final int f33520v;

    /* renamed from: w */
    private final boolean f33521w;

    /* renamed from: x */
    private final int f33522x;

    public SleepClassifyEvent(int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, int i18) {
        this.f33514p = i11;
        this.f33515q = i12;
        this.f33516r = i13;
        this.f33517s = i14;
        this.f33518t = i15;
        this.f33519u = i16;
        this.f33520v = i17;
        this.f33521w = z11;
        this.f33522x = i18;
    }

    /* renamed from: F */
    public int m30621F() {
        return this.f33517s;
    }

    /* renamed from: J */
    public int m30622J() {
        return this.f33516r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.f33514p == sleepClassifyEvent.f33514p && this.f33515q == sleepClassifyEvent.f33515q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33514p), Integer.valueOf(this.f33515q));
    }

    /* renamed from: t */
    public int m30623t() {
        return this.f33515q;
    }

    public String toString() {
        int i11 = this.f33514p;
        int i12 = this.f33515q;
        int i13 = this.f33516r;
        int i14 = this.f33517s;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append(i11);
        sb2.append(" Conf:");
        sb2.append(i12);
        sb2.append(" Motion:");
        sb2.append(i13);
        sb2.append(" Light:");
        sb2.append(i14);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33514p);
        AbstractC2552a.m12924m(parcel, 2, m30623t());
        AbstractC2552a.m12924m(parcel, 3, m30622J());
        AbstractC2552a.m12924m(parcel, 4, m30621F());
        AbstractC2552a.m12924m(parcel, 5, this.f33518t);
        AbstractC2552a.m12924m(parcel, 6, this.f33519u);
        AbstractC2552a.m12924m(parcel, 7, this.f33520v);
        AbstractC2552a.m12914c(parcel, 8, this.f33521w);
        AbstractC2552a.m12924m(parcel, 9, this.f33522x);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
