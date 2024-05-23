package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C4255a();

    /* renamed from: p */
    final int f16736p;

    /* renamed from: q */
    private final StringToIntConverter f16737q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaa(int i11, StringToIntConverter stringToIntConverter) {
        this.f16736p = i11;
        this.f16737q = stringToIntConverter;
    }

    /* renamed from: t */
    public static zaa m19855t(FastJsonResponse.InterfaceC4258a interfaceC4258a) {
        if (interfaceC4258a instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) interfaceC4258a);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: F */
    public final FastJsonResponse.InterfaceC4258a m19856F() {
        StringToIntConverter stringToIntConverter = this.f16737q;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16736p);
        AbstractC2552a.m12932u(parcel, 2, this.f16737q, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f16736p = 1;
        this.f16737q = stringToIntConverter;
    }
}
