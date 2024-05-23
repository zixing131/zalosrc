package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class CtaItem implements Parcelable {

    /* renamed from: p */
    private final String f49830p;

    /* renamed from: q */
    private final String f49831q;

    /* renamed from: r */
    private final String f49832r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CtaItem> CREATOR = new C9393a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CtaItem m50910a(JsonObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }
            return new CtaItem(AbstractC9465b.m51743x(jsonObject, "text"), AbstractC9465b.m51743x(jsonObject, "icon"), AbstractC9465b.m51743x(jsonObject, "targetLink"));
        }

        public final KSerializer serializer() {
            return CtaItem$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.CtaItem$a */
    /* loaded from: classes5.dex */
    public static final class C9393a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CtaItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CtaItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CtaItem[] newArray(int i11) {
            return new CtaItem[i11];
        }
    }

    public /* synthetic */ CtaItem(int i11, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49830p = null;
        } else {
            this.f49830p = str;
        }
        if ((i11 & 2) == 0) {
            this.f49831q = null;
        } else {
            this.f49831q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49832r = null;
        } else {
            this.f49832r = str3;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m50906d(CtaItem ctaItem, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || ctaItem.f49830p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, ctaItem.f49830p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || ctaItem.f49831q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, ctaItem.f49831q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || ctaItem.f49832r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, ctaItem.f49832r);
        }
    }

    /* renamed from: a */
    public final String m50907a() {
        return this.f49831q;
    }

    /* renamed from: b */
    public final String m50908b() {
        return this.f49832r;
    }

    /* renamed from: c */
    public final String m50909c() {
        return this.f49830p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaItem)) {
            return false;
        }
        CtaItem ctaItem = (CtaItem) obj;
        return AbstractC19074t.m100204b(this.f49830p, ctaItem.f49830p) && AbstractC19074t.m100204b(this.f49831q, ctaItem.f49831q) && AbstractC19074t.m100204b(this.f49832r, ctaItem.f49832r);
    }

    public int hashCode() {
        String str = this.f49830p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49831q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49832r;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isValid() {
        String str;
        String str2;
        String str3 = this.f49830p;
        if (str3 != null && str3.length() != 0 && (str = this.f49831q) != null && str.length() != 0 && (str2 = this.f49832r) != null && str2.length() != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "CtaItem(text=" + this.f49830p + ", icon=" + this.f49831q + ", targetLink=" + this.f49832r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49830p);
        parcel.writeString(this.f49831q);
        parcel.writeString(this.f49832r);
    }

    public CtaItem(String str, String str2, String str3) {
        this.f49830p = str;
        this.f49831q = str2;
        this.f49832r = str3;
    }
}
