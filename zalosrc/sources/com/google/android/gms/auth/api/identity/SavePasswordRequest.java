package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new C4035e();

    /* renamed from: p */
    private final SignInPassword f16001p;

    /* renamed from: q */
    private final String f16002q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavePasswordRequest(SignInPassword signInPassword, String str) {
        this.f16001p = (SignInPassword) AbstractC4205o.m19722k(signInPassword);
        this.f16002q = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!AbstractC4199m.m19701a(this.f16001p, savePasswordRequest.f16001p) || !AbstractC4199m.m19701a(this.f16002q, savePasswordRequest.f16002q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f16001p, this.f16002q);
    }

    /* renamed from: t */
    public SignInPassword m19080t() {
        return this.f16001p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, m19080t(), i11, false);
        AbstractC2552a.m12934w(parcel, 2, this.f16002q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
