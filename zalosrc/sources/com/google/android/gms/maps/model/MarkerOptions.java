package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;
import p181g6.C19236b;

/* loaded from: classes2.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C5912i();

    /* renamed from: A */
    private float f33643A;

    /* renamed from: B */
    private float f33644B;

    /* renamed from: C */
    private float f33645C;

    /* renamed from: D */
    private int f33646D;

    /* renamed from: E */
    private View f33647E;

    /* renamed from: F */
    private int f33648F;

    /* renamed from: G */
    private String f33649G;

    /* renamed from: H */
    private float f33650H;

    /* renamed from: p */
    private LatLng f33651p;

    /* renamed from: q */
    private String f33652q;

    /* renamed from: r */
    private String f33653r;

    /* renamed from: s */
    private C19236b f33654s;

    /* renamed from: t */
    private float f33655t;

    /* renamed from: u */
    private float f33656u;

    /* renamed from: v */
    private boolean f33657v;

    /* renamed from: w */
    private boolean f33658w;

    /* renamed from: x */
    private boolean f33659x;

    /* renamed from: y */
    private float f33660y;

    /* renamed from: z */
    private float f33661z;

    public MarkerOptions() {
        this.f33655t = 0.5f;
        this.f33656u = 1.0f;
        this.f33658w = true;
        this.f33659x = false;
        this.f33660y = 0.0f;
        this.f33661z = 0.5f;
        this.f33643A = 0.0f;
        this.f33644B = 1.0f;
        this.f33646D = 0;
    }

    /* renamed from: D0 */
    public String m30715D0() {
        return this.f33652q;
    }

    /* renamed from: E0 */
    public float m30716E0() {
        return this.f33645C;
    }

    /* renamed from: F */
    public float m30717F() {
        return this.f33655t;
    }

    /* renamed from: F0 */
    public MarkerOptions mo30679F0(C19236b c19236b) {
        this.f33654s = c19236b;
        return this;
    }

    /* renamed from: G0 */
    public boolean m30718G0() {
        return this.f33657v;
    }

    /* renamed from: H0 */
    public boolean m30719H0() {
        return this.f33659x;
    }

    /* renamed from: I0 */
    public boolean m30720I0() {
        return this.f33658w;
    }

    /* renamed from: J */
    public float m30721J() {
        return this.f33656u;
    }

    /* renamed from: J0 */
    public MarkerOptions mo30680J0(LatLng latLng) {
        if (latLng != null) {
            this.f33651p = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: K */
    public C19236b m30722K() {
        return this.f33654s;
    }

    /* renamed from: K0 */
    public final int m30723K0() {
        return this.f33648F;
    }

    /* renamed from: L0 */
    public final MarkerOptions m30724L0(int i11) {
        this.f33648F = 1;
        return this;
    }

    /* renamed from: M */
    public float m30725M() {
        return this.f33661z;
    }

    /* renamed from: Q */
    public float m30726Q() {
        return this.f33643A;
    }

    /* renamed from: Z */
    public LatLng m30727Z() {
        return this.f33651p;
    }

    /* renamed from: i0 */
    public float m30728i0() {
        return this.f33660y;
    }

    /* renamed from: o0 */
    public String m30729o0() {
        return this.f33653r;
    }

    /* renamed from: t */
    public float m30730t() {
        return this.f33644B;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        IBinder asBinder;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, m30727Z(), i11, false);
        AbstractC2552a.m12934w(parcel, 3, m30715D0(), false);
        AbstractC2552a.m12934w(parcel, 4, m30729o0(), false);
        C19236b c19236b = this.f33654s;
        if (c19236b == null) {
            asBinder = null;
        } else {
            asBinder = c19236b.m100918a().asBinder();
        }
        AbstractC2552a.m12923l(parcel, 5, asBinder, false);
        AbstractC2552a.m12921j(parcel, 6, m30717F());
        AbstractC2552a.m12921j(parcel, 7, m30721J());
        AbstractC2552a.m12914c(parcel, 8, m30718G0());
        AbstractC2552a.m12914c(parcel, 9, m30720I0());
        AbstractC2552a.m12914c(parcel, 10, m30719H0());
        AbstractC2552a.m12921j(parcel, 11, m30728i0());
        AbstractC2552a.m12921j(parcel, 12, m30725M());
        AbstractC2552a.m12921j(parcel, 13, m30726Q());
        AbstractC2552a.m12921j(parcel, 14, m30730t());
        AbstractC2552a.m12921j(parcel, 15, m30716E0());
        AbstractC2552a.m12924m(parcel, 17, this.f33646D);
        AbstractC2552a.m12923l(parcel, 18, BinderC4273d.m19913I3(this.f33647E).asBinder(), false);
        AbstractC2552a.m12924m(parcel, 19, this.f33648F);
        AbstractC2552a.m12934w(parcel, 20, this.f33649G, false);
        AbstractC2552a.m12921j(parcel, 21, this.f33650H);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f11, float f12, boolean z11, boolean z12, boolean z13, float f13, float f14, float f15, float f16, float f17, int i11, IBinder iBinder2, int i12, String str3, float f18) {
        this.f33655t = 0.5f;
        this.f33656u = 1.0f;
        this.f33658w = true;
        this.f33659x = false;
        this.f33660y = 0.0f;
        this.f33661z = 0.5f;
        this.f33643A = 0.0f;
        this.f33644B = 1.0f;
        this.f33646D = 0;
        this.f33651p = latLng;
        this.f33652q = str;
        this.f33653r = str2;
        if (iBinder == null) {
            this.f33654s = null;
        } else {
            this.f33654s = new C19236b(InterfaceC4271b.a.m19911N(iBinder));
        }
        this.f33655t = f11;
        this.f33656u = f12;
        this.f33657v = z11;
        this.f33658w = z12;
        this.f33659x = z13;
        this.f33660y = f13;
        this.f33661z = f14;
        this.f33643A = f15;
        this.f33644B = f16;
        this.f33645C = f17;
        this.f33648F = i12;
        this.f33646D = i11;
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(iBinder2);
        this.f33647E = m19911N != null ? (View) BinderC4273d.m19914Q(m19911N) : null;
        this.f33649G = str3;
        this.f33650H = f18;
    }
}
