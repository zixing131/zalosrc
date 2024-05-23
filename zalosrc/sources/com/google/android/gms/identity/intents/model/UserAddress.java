package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C4298a();

    /* renamed from: A */
    private String f16840A;

    /* renamed from: B */
    private boolean f16841B;

    /* renamed from: C */
    private String f16842C;

    /* renamed from: D */
    private String f16843D;

    /* renamed from: p */
    private String f16844p;

    /* renamed from: q */
    private String f16845q;

    /* renamed from: r */
    private String f16846r;

    /* renamed from: s */
    private String f16847s;

    /* renamed from: t */
    private String f16848t;

    /* renamed from: u */
    private String f16849u;

    /* renamed from: v */
    private String f16850v;

    /* renamed from: w */
    private String f16851w;

    /* renamed from: x */
    private String f16852x;

    /* renamed from: y */
    private String f16853y;

    /* renamed from: z */
    private String f16854z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z11, String str13, String str14) {
        this.f16844p = str;
        this.f16845q = str2;
        this.f16846r = str3;
        this.f16847s = str4;
        this.f16848t = str5;
        this.f16849u = str6;
        this.f16850v = str7;
        this.f16851w = str8;
        this.f16852x = str9;
        this.f16853y = str10;
        this.f16854z = str11;
        this.f16840A = str12;
        this.f16841B = z11;
        this.f16842C = str13;
        this.f16843D = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f16844p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f16845q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f16846r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f16847s, false);
        AbstractC2552a.m12934w(parcel, 6, this.f16848t, false);
        AbstractC2552a.m12934w(parcel, 7, this.f16849u, false);
        AbstractC2552a.m12934w(parcel, 8, this.f16850v, false);
        AbstractC2552a.m12934w(parcel, 9, this.f16851w, false);
        AbstractC2552a.m12934w(parcel, 10, this.f16852x, false);
        AbstractC2552a.m12934w(parcel, 11, this.f16853y, false);
        AbstractC2552a.m12934w(parcel, 12, this.f16854z, false);
        AbstractC2552a.m12934w(parcel, 13, this.f16840A, false);
        AbstractC2552a.m12914c(parcel, 14, this.f16841B);
        AbstractC2552a.m12934w(parcel, 15, this.f16842C, false);
        AbstractC2552a.m12934w(parcel, 16, this.f16843D, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
