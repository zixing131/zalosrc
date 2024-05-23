package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Banner implements Parcelable {

    /* renamed from: p */
    private final String f51327p;

    /* renamed from: q */
    private final String f51328q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Banner> CREATOR = new C9771a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Banner$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.Banner$a */
    /* loaded from: classes5.dex */
    public static final class C9771a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Banner createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Banner(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Banner[] newArray(int i11) {
            return new Banner[i11];
        }
    }

    public /* synthetic */ Banner(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, Banner$$serializer.INSTANCE.getDescriptor());
        }
        this.f51327p = str;
        this.f51328q = str2;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m52778c(Banner banner, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 0, c26814n1, banner.f51327p);
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26814n1, banner.f51328q);
    }

    /* renamed from: a */
    public final String m52779a() {
        return this.f51328q;
    }

    /* renamed from: b */
    public final String m52780b() {
        return this.f51327p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        return AbstractC19074t.m100204b(this.f51327p, banner.f51327p) && AbstractC19074t.m100204b(this.f51328q, banner.f51328q);
    }

    public int hashCode() {
        String str = this.f51327p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51328q;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Banner(image=" + this.f51327p + ", actionLink=" + this.f51328q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51327p);
        parcel.writeString(this.f51328q);
    }

    public Banner(String str, String str2) {
        this.f51327p = str;
        this.f51328q = str2;
    }
}
