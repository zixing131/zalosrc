package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C4051d();

    /* renamed from: p */
    private final int f15906p;

    /* renamed from: q */
    private final List f15907q;

    public AccountChangeEventsResponse(int i11, List list) {
        this.f15906p = i11;
        this.f15907q = (List) AbstractC4205o.m19722k(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f15906p);
        AbstractC2552a.m12907A(parcel, 2, this.f15907q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
