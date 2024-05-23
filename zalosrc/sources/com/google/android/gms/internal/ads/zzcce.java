package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONArray;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcce> CREATOR = new og0();

    /* renamed from: p */
    public final String f32014p;

    /* renamed from: q */
    public final int f32015q;

    public zzcce(String str, int i11) {
        this.f32014p = str;
        this.f32015q = i11;
    }

    /* renamed from: t */
    public static zzcce m28718t(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            return new zzcce(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcce)) {
            zzcce zzcceVar = (zzcce) obj;
            if (AbstractC4199m.m19701a(this.f32014p, zzcceVar.f32014p) && AbstractC4199m.m19701a(Integer.valueOf(this.f32015q), Integer.valueOf(zzcceVar.f32015q))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f32014p, Integer.valueOf(this.f32015q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f32014p, false);
        AbstractC2552a.m12924m(parcel, 3, this.f32015q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
