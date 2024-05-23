package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C4074d();

    /* renamed from: p */
    final int f16162p;

    /* renamed from: q */
    private final String f16163q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i11, String str) {
        AbstractC4205o.m19719h(str, "scopeUri must not be null or empty");
        this.f16162p = i11;
        this.f16163q = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f16163q.equals(((Scope) obj).f16163q);
    }

    public int hashCode() {
        return this.f16163q.hashCode();
    }

    /* renamed from: t */
    public String m19219t() {
        return this.f16163q;
    }

    public String toString() {
        return this.f16163q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16162p);
        AbstractC2552a.m12934w(parcel, 2, m19219t(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
