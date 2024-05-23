package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;
import p181g6.C19236b;

/* loaded from: classes2.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new C5907d();

    /* renamed from: p */
    private final int f33610p;

    /* renamed from: q */
    private final C19236b f33611q;

    /* renamed from: r */
    private final Float f33612r;

    /* JADX INFO: Access modifiers changed from: protected */
    public Cap(int i11) {
        this(i11, (C19236b) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.f33610p == cap.f33610p && AbstractC4199m.m19701a(this.f33611q, cap.f33611q) && AbstractC4199m.m19701a(this.f33612r, cap.f33612r)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33610p), this.f33611q, this.f33612r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final Cap m30690t() {
        boolean z11;
        int i11 = this.f33610p;
        if (i11 != 0) {
            boolean z12 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unknown Cap type: ");
                        sb2.append(i11);
                        return this;
                    }
                    if (this.f33611q != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC4205o.m19727p(z11, "bitmapDescriptor must not be null");
                    if (this.f33612r == null) {
                        z12 = false;
                    }
                    AbstractC4205o.m19727p(z12, "bitmapRefWidth must not be null");
                    return new CustomCap(this.f33611q, this.f33612r.floatValue());
                }
                return new RoundCap();
            }
            return new SquareCap();
        }
        return new ButtCap();
    }

    public String toString() {
        return "[Cap: type=" + this.f33610p + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        IBinder asBinder;
        int i12 = this.f33610p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, i12);
        C19236b c19236b = this.f33611q;
        if (c19236b == null) {
            asBinder = null;
        } else {
            asBinder = c19236b.m100918a().asBinder();
        }
        AbstractC2552a.m12923l(parcel, 3, asBinder, false);
        AbstractC2552a.m12922k(parcel, 4, this.f33612r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cap(int i11, IBinder iBinder, Float f11) {
        this(i11, iBinder == null ? null : new C19236b(InterfaceC4271b.a.m19911N(iBinder)), f11);
    }

    private Cap(int i11, C19236b c19236b, Float f11) {
        boolean z11;
        boolean z12 = f11 != null && f11.floatValue() > 0.0f;
        if (i11 == 3) {
            if (c19236b == null || !z12) {
                i11 = 3;
                z11 = false;
                AbstractC4205o.m19713b(z11, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i11), c19236b, f11));
                this.f33610p = i11;
                this.f33611q = c19236b;
                this.f33612r = f11;
            }
            i11 = 3;
        }
        z11 = true;
        AbstractC4205o.m19713b(z11, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i11), c19236b, f11));
        this.f33610p = i11;
        this.f33611q = c19236b;
        this.f33612r = f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Cap(C19236b c19236b, float f11) {
        this(3, c19236b, Float.valueOf(f11));
    }
}
