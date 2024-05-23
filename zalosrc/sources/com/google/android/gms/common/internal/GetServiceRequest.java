package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC4187i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C4198l1();

    /* renamed from: D */
    static final Scope[] f16536D = new Scope[0];

    /* renamed from: E */
    static final Feature[] f16537E = new Feature[0];

    /* renamed from: A */
    int f16538A;

    /* renamed from: B */
    boolean f16539B;

    /* renamed from: C */
    private String f16540C;

    /* renamed from: p */
    final int f16541p;

    /* renamed from: q */
    final int f16542q;

    /* renamed from: r */
    int f16543r;

    /* renamed from: s */
    String f16544s;

    /* renamed from: t */
    IBinder f16545t;

    /* renamed from: u */
    Scope[] f16546u;

    /* renamed from: v */
    Bundle f16547v;

    /* renamed from: w */
    Account f16548w;

    /* renamed from: x */
    Feature[] f16549x;

    /* renamed from: y */
    Feature[] f16550y;

    /* renamed from: z */
    boolean f16551z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetServiceRequest(int i11, int i12, int i13, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z11, int i14, boolean z12, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f16536D : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f16537E : featureArr;
        featureArr2 = featureArr2 == null ? f16537E : featureArr2;
        this.f16541p = i11;
        this.f16542q = i12;
        this.f16543r = i13;
        if ("com.google.android.gms".equals(str)) {
            this.f16544s = "com.google.android.gms";
        } else {
            this.f16544s = str;
        }
        if (i11 < 2) {
            if (iBinder != null) {
                account2 = AbstractBinderC4163a.m19626Q(InterfaceC4187i.a.m19696N(iBinder));
            } else {
                account2 = null;
            }
            this.f16548w = account2;
        } else {
            this.f16545t = iBinder;
            this.f16548w = account;
        }
        this.f16546u = scopeArr;
        this.f16547v = bundle;
        this.f16549x = featureArr;
        this.f16550y = featureArr2;
        this.f16551z = z11;
        this.f16538A = i14;
        this.f16539B = z12;
        this.f16540C = str2;
    }

    /* renamed from: t */
    public final String m19617t() {
        return this.f16540C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C4198l1.m19700a(this, parcel, i11);
    }
}
