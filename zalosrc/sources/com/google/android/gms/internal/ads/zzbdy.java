package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbdy> CREATOR = new C5216yr();

    /* renamed from: p */
    private ParcelFileDescriptor f31877p;

    /* renamed from: q */
    private final boolean f31878q;

    /* renamed from: r */
    private final boolean f31879r;

    /* renamed from: s */
    private final long f31880s;

    /* renamed from: t */
    private final boolean f31881t;

    public zzbdy() {
        this(null, false, false, 0L, false);
    }

    /* renamed from: F */
    final synchronized ParcelFileDescriptor m28698F() {
        return this.f31877p;
    }

    /* renamed from: J */
    public final synchronized InputStream m28699J() {
        if (this.f31877p == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f31877p);
        this.f31877p = null;
        return autoCloseInputStream;
    }

    /* renamed from: K */
    public final synchronized boolean m28700K() {
        return this.f31878q;
    }

    /* renamed from: M */
    public final synchronized boolean m28701M() {
        return this.f31877p != null;
    }

    /* renamed from: Q */
    public final synchronized boolean m28702Q() {
        return this.f31879r;
    }

    /* renamed from: Z */
    public final synchronized boolean m28703Z() {
        return this.f31881t;
    }

    /* renamed from: t */
    public final synchronized long m28704t() {
        return this.f31880s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, m28698F(), i11, false);
        AbstractC2552a.m12914c(parcel, 3, m28700K());
        AbstractC2552a.m12914c(parcel, 4, m28702Q());
        AbstractC2552a.m12929r(parcel, 5, m28704t());
        AbstractC2552a.m12914c(parcel, 6, m28703Z());
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzbdy(ParcelFileDescriptor parcelFileDescriptor, boolean z11, boolean z12, long j11, boolean z13) {
        this.f31877p = parcelFileDescriptor;
        this.f31878q = z11;
        this.f31879r = z12;
        this.f31880s = j11;
        this.f31881t = z13;
    }
}
