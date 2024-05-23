package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new C5904a();

    /* renamed from: p */
    private final float f33714p;

    /* renamed from: q */
    private final int f33715q;

    /* renamed from: r */
    private final int f33716r;

    /* renamed from: s */
    private final boolean f33717s;

    /* renamed from: t */
    private final StampStyle f33718t;

    /* renamed from: com.google.android.gms.maps.model.StrokeStyle$a */
    /* loaded from: classes2.dex */
    public static final class C5903a {

        /* renamed from: a */
        private float f33719a;

        /* renamed from: b */
        private int f33720b;

        /* renamed from: c */
        private int f33721c;

        /* renamed from: d */
        private boolean f33722d;

        /* renamed from: e */
        private StampStyle f33723e;

        public C5903a(StrokeStyle strokeStyle) {
            this.f33719a = strokeStyle.m30762J();
            Pair m30763K = strokeStyle.m30763K();
            this.f33720b = ((Integer) m30763K.first).intValue();
            this.f33721c = ((Integer) m30763K.second).intValue();
            this.f33722d = strokeStyle.m30761F();
            this.f33723e = strokeStyle.m30764t();
        }

        /* renamed from: a */
        public StrokeStyle m30765a() {
            return new StrokeStyle(this.f33719a, this.f33720b, this.f33721c, this.f33722d, this.f33723e);
        }

        /* renamed from: b */
        public final C5903a m30766b(boolean z11) {
            this.f33722d = z11;
            return this;
        }

        /* renamed from: c */
        public final C5903a m30767c(float f11) {
            this.f33719a = f11;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StrokeStyle(float f11, int i11, int i12, boolean z11, StampStyle stampStyle) {
        this.f33714p = f11;
        this.f33715q = i11;
        this.f33716r = i12;
        this.f33717s = z11;
        this.f33718t = stampStyle;
    }

    /* renamed from: F */
    public boolean m30761F() {
        return this.f33717s;
    }

    /* renamed from: J */
    public final float m30762J() {
        return this.f33714p;
    }

    /* renamed from: K */
    public final Pair m30763K() {
        return new Pair(Integer.valueOf(this.f33715q), Integer.valueOf(this.f33716r));
    }

    /* renamed from: t */
    public StampStyle m30764t() {
        return this.f33718t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12921j(parcel, 2, this.f33714p);
        AbstractC2552a.m12924m(parcel, 3, this.f33715q);
        AbstractC2552a.m12924m(parcel, 4, this.f33716r);
        AbstractC2552a.m12914c(parcel, 5, m30761F());
        AbstractC2552a.m12932u(parcel, 6, m30764t(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
