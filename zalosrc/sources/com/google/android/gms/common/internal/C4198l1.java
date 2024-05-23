package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p031b5.AbstractC2552a;

/* renamed from: com.google.android.gms.common.internal.l1 */
/* loaded from: classes2.dex */
public final class C4198l1 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m19700a(GetServiceRequest getServiceRequest, Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, getServiceRequest.f16541p);
        AbstractC2552a.m12924m(parcel, 2, getServiceRequest.f16542q);
        AbstractC2552a.m12924m(parcel, 3, getServiceRequest.f16543r);
        AbstractC2552a.m12934w(parcel, 4, getServiceRequest.f16544s, false);
        AbstractC2552a.m12923l(parcel, 5, getServiceRequest.f16545t, false);
        AbstractC2552a.m12937z(parcel, 6, getServiceRequest.f16546u, i11, false);
        AbstractC2552a.m12916e(parcel, 7, getServiceRequest.f16547v, false);
        AbstractC2552a.m12932u(parcel, 8, getServiceRequest.f16548w, i11, false);
        AbstractC2552a.m12937z(parcel, 10, getServiceRequest.f16549x, i11, false);
        AbstractC2552a.m12937z(parcel, 11, getServiceRequest.f16550y, i11, false);
        AbstractC2552a.m12914c(parcel, 12, getServiceRequest.f16551z);
        AbstractC2552a.m12924m(parcel, 13, getServiceRequest.f16538A);
        AbstractC2552a.m12914c(parcel, 14, getServiceRequest.f16539B);
        AbstractC2552a.m12934w(parcel, 15, getServiceRequest.m19617t(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m19765N = SafeParcelReader.m19765N(parcel);
        Scope[] scopeArr = GetServiceRequest.f16536D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f16537E;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            switch (SafeParcelReader.m19789v(m19755D)) {
                case 1:
                    i11 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 2:
                    i12 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 3:
                    i13 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 4:
                    str = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m19756E(parcel, m19755D);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m19786s(parcel, m19755D, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m19773f(parcel, m19755D);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m19782o(parcel, m19755D, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.m19764M(parcel, m19755D);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m19786s(parcel, m19755D, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m19786s(parcel, m19755D, Feature.CREATOR);
                    break;
                case 12:
                    z11 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 13:
                    i14 = SafeParcelReader.m19757F(parcel, m19755D);
                    break;
                case 14:
                    z12 = SafeParcelReader.m19790w(parcel, m19755D);
                    break;
                case 15:
                    str2 = SafeParcelReader.m19783p(parcel, m19755D);
                    break;
            }
        }
        SafeParcelReader.m19788u(parcel, m19765N);
        return new GetServiceRequest(i11, i12, i13, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z11, i14, z12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GetServiceRequest[i11];
    }
}
