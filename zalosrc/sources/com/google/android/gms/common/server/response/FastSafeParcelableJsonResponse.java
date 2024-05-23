package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public Object mo19859c(String str) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: e */
    public boolean mo19860e(String str) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : mo19034a().values()) {
            if (mo19036d(field)) {
                if (!fastJsonResponse.mo19036d(field) || !AbstractC4199m.m19701a(mo19035b(field), fastJsonResponse.mo19035b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo19036d(field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i11 = 0;
        for (FastJsonResponse.Field field : mo19034a().values()) {
            if (mo19036d(field)) {
                i11 = (i11 * 31) + AbstractC4205o.m19722k(mo19035b(field)).hashCode();
            }
        }
        return i11;
    }
}
