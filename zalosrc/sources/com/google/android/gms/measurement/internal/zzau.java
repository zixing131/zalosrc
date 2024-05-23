package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p031b5.AbstractC2552a;

/* loaded from: classes.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C6122s();

    /* renamed from: p */
    private final Bundle f34675p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(Bundle bundle) {
        this.f34675p = bundle;
    }

    /* renamed from: F */
    public final Bundle m31509F() {
        return new Bundle(this.f34675p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final Double m31510J(String str) {
        return Double.valueOf(this.f34675p.getDouble("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final Long m31511K(String str) {
        return Long.valueOf(this.f34675p.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final Object m31512M(String str) {
        return this.f34675p.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final String m31513Q(String str) {
        return this.f34675p.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C6111r(this);
    }

    public final String toString() {
        return this.f34675p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12916e(parcel, 2, m31509F(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public final int zza() {
        return this.f34675p.size();
    }
}
