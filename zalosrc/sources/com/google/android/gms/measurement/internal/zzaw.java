package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C6133t();

    /* renamed from: p */
    public final String f34676p;

    /* renamed from: q */
    public final zzau f34677q;

    /* renamed from: r */
    public final String f34678r;

    /* renamed from: s */
    public final long f34679s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzaw zzawVar, long j11) {
        AbstractC4205o.m19722k(zzawVar);
        this.f34676p = zzawVar.f34676p;
        this.f34677q = zzawVar.f34677q;
        this.f34678r = zzawVar.f34678r;
        this.f34679s = j11;
    }

    public final String toString() {
        return "origin=" + this.f34678r + ",name=" + this.f34676p + ",params=" + String.valueOf(this.f34677q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C6133t.m31450a(this, parcel, i11);
    }

    public zzaw(String str, zzau zzauVar, String str2, long j11) {
        this.f34676p = str;
        this.f34677q = zzauVar;
        this.f34678r = str2;
        this.f34679s = j11;
    }
}
