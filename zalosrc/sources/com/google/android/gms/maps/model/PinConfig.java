package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Arrays;
import p031b5.AbstractC2552a;
import p181g6.AbstractC19248n;
import p181g6.C19236b;

/* loaded from: classes2.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PinConfig> CREATOR = new C5913j();

    /* renamed from: p */
    private final int f33664p;

    /* renamed from: q */
    private final int f33665q;

    /* renamed from: r */
    private final Glyph f33666r;

    /* loaded from: classes2.dex */
    public static class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Glyph> CREATOR = new C5910g();

        /* renamed from: p */
        private String f33667p;

        /* renamed from: q */
        private C19236b f33668q;

        /* renamed from: r */
        private int f33669r;

        /* renamed from: s */
        private int f33670s;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Glyph(String str, IBinder iBinder, int i11, int i12) {
            C19236b c19236b;
            this.f33669r = -5041134;
            this.f33670s = -16777216;
            this.f33667p = str;
            if (iBinder == null) {
                c19236b = null;
            } else {
                c19236b = new C19236b(InterfaceC4271b.a.m19911N(iBinder));
            }
            this.f33668q = c19236b;
            this.f33669r = i11;
            this.f33670s = i12;
        }

        /* renamed from: F */
        public String m30734F() {
            return this.f33667p;
        }

        /* renamed from: J */
        public int m30735J() {
            return this.f33670s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.f33669r != glyph.f33669r || !AbstractC19248n.m100932a(this.f33667p, glyph.f33667p) || this.f33670s != glyph.f33670s) {
                return false;
            }
            C19236b c19236b = this.f33668q;
            if ((c19236b == null && glyph.f33668q != null) || (c19236b != null && glyph.f33668q == null)) {
                return false;
            }
            C19236b c19236b2 = glyph.f33668q;
            if (c19236b == null || c19236b2 == null) {
                return true;
            }
            return AbstractC19248n.m100932a(BinderC4273d.m19914Q(c19236b.m100918a()), BinderC4273d.m19914Q(c19236b2.m100918a()));
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f33667p, this.f33668q, Integer.valueOf(this.f33669r)});
        }

        /* renamed from: t */
        public int m30736t() {
            return this.f33669r;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            IBinder asBinder;
            int m12912a = AbstractC2552a.m12912a(parcel);
            AbstractC2552a.m12934w(parcel, 2, m30734F(), false);
            C19236b c19236b = this.f33668q;
            if (c19236b == null) {
                asBinder = null;
            } else {
                asBinder = c19236b.m100918a().asBinder();
            }
            AbstractC2552a.m12923l(parcel, 3, asBinder, false);
            AbstractC2552a.m12924m(parcel, 4, m30736t());
            AbstractC2552a.m12924m(parcel, 5, m30735J());
            AbstractC2552a.m12913b(parcel, m12912a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PinConfig(int i11, int i12, Glyph glyph) {
        this.f33664p = i11;
        this.f33665q = i12;
        this.f33666r = glyph;
    }

    /* renamed from: F */
    public int m30731F() {
        return this.f33665q;
    }

    /* renamed from: J */
    public Glyph m30732J() {
        return this.f33666r;
    }

    /* renamed from: t */
    public int m30733t() {
        return this.f33664p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, m30733t());
        AbstractC2552a.m12924m(parcel, 3, m30731F());
        AbstractC2552a.m12932u(parcel, 4, m30732J(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
