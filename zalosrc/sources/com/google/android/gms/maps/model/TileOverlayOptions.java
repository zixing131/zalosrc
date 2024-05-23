package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.InterfaceC19239e;
import p598w5.AbstractBinderC28748f;
import p598w5.InterfaceC28749g;

/* loaded from: classes2.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new C5906c();

    /* renamed from: p */
    private InterfaceC28749g f33729p;

    /* renamed from: q */
    private InterfaceC19239e f33730q;

    /* renamed from: r */
    private boolean f33731r;

    /* renamed from: s */
    private float f33732s;

    /* renamed from: t */
    private boolean f33733t;

    /* renamed from: u */
    private float f33734u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileOverlayOptions(IBinder iBinder, boolean z11, float f11, boolean z12, float f12) {
        C5905b c5905b;
        this.f33731r = true;
        this.f33733t = true;
        this.f33734u = 0.0f;
        InterfaceC28749g m143880N = AbstractBinderC28748f.m143880N(iBinder);
        this.f33729p = m143880N;
        if (m143880N == null) {
            c5905b = null;
        } else {
            c5905b = new C5905b(this);
        }
        this.f33730q = c5905b;
        this.f33731r = z11;
        this.f33732s = f11;
        this.f33733t = z12;
        this.f33734u = f12;
    }

    /* renamed from: F */
    public float m30771F() {
        return this.f33734u;
    }

    /* renamed from: J */
    public float m30772J() {
        return this.f33732s;
    }

    /* renamed from: K */
    public boolean m30773K() {
        return this.f33731r;
    }

    /* renamed from: t */
    public boolean m30774t() {
        return this.f33733t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        IBinder asBinder;
        int m12912a = AbstractC2552a.m12912a(parcel);
        InterfaceC28749g interfaceC28749g = this.f33729p;
        if (interfaceC28749g == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC28749g.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 2, asBinder, false);
        AbstractC2552a.m12914c(parcel, 3, m30773K());
        AbstractC2552a.m12921j(parcel, 4, m30772J());
        AbstractC2552a.m12914c(parcel, 5, m30774t());
        AbstractC2552a.m12921j(parcel, 6, m30771F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
