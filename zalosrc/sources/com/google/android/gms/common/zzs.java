package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractBinderC4234x1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C4266u();

    /* renamed from: p */
    private final String f16799p;

    /* renamed from: q */
    private final AbstractBinderC4249n f16800q;

    /* renamed from: r */
    private final boolean f16801r;

    /* renamed from: s */
    private final boolean f16802s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, AbstractBinderC4249n abstractBinderC4249n, boolean z11, boolean z12) {
        this.f16799p = str;
        this.f16800q = abstractBinderC4249n;
        this.f16801r = z11;
        this.f16802s = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f16799p, false);
        AbstractBinderC4249n abstractBinderC4249n = this.f16800q;
        if (abstractBinderC4249n == null) {
            abstractBinderC4249n = null;
        }
        AbstractC2552a.m12923l(parcel, 2, abstractBinderC4249n, false);
        AbstractC2552a.m12914c(parcel, 3, this.f16801r);
        AbstractC2552a.m12914c(parcel, 4, this.f16802s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, IBinder iBinder, boolean z11, boolean z12) {
        this.f16799p = str;
        BinderC4250o binderC4250o = null;
        if (iBinder != null) {
            try {
                InterfaceC4271b zzd = AbstractBinderC4234x1.m19811N(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) BinderC4273d.m19914Q(zzd);
                if (bArr != null) {
                    binderC4250o = new BinderC4250o(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f16800q = binderC4250o;
        this.f16801r = z11;
        this.f16802s = z12;
    }
}
