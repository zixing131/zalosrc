package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Footer implements Parcelable {

    /* renamed from: p */
    private final String f49845p;

    /* renamed from: q */
    private final String f49846q;

    /* renamed from: r */
    private final Long f49847r;

    /* renamed from: s */
    private final Action f49848s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Footer> CREATOR = new C9398a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Footer$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Footer$a */
    /* loaded from: classes5.dex */
    public static final class C9398a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Footer createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Footer(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Footer[] newArray(int i11) {
            return new Footer[i11];
        }
    }

    public /* synthetic */ Footer(int i11, String str, String str2, Long l11, Action action, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49845p = null;
        } else {
            this.f49845p = str;
        }
        if ((i11 & 2) == 0) {
            this.f49846q = null;
        } else {
            this.f49846q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49847r = null;
        } else {
            this.f49847r = l11;
        }
        if ((i11 & 8) == 0) {
            this.f49848s = null;
        } else {
            this.f49848s = action;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m50936d(Footer footer, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || footer.f49845p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, footer.f49845p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || footer.f49846q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, footer.f49846q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || footer.f49847r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, footer.f49847r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || footer.f49848s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, Action$$serializer.INSTANCE, footer.f49848s);
        }
    }

    /* renamed from: a */
    public final Action m50937a() {
        return this.f49848s;
    }

    /* renamed from: b */
    public final Long m50938b() {
        return this.f49847r;
    }

    /* renamed from: c */
    public final String m50939c() {
        return this.f49846q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Footer)) {
            return false;
        }
        Footer footer = (Footer) obj;
        return AbstractC19074t.m100204b(this.f49845p, footer.f49845p) && AbstractC19074t.m100204b(this.f49846q, footer.f49846q) && AbstractC19074t.m100204b(this.f49847r, footer.f49847r) && AbstractC19074t.m100204b(this.f49848s, footer.f49848s);
    }

    public int hashCode() {
        String str = this.f49845p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49846q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f49847r;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Action action = this.f49848s;
        return hashCode3 + (action != null ? action.hashCode() : 0);
    }

    public final boolean isValid() {
        String str;
        Long l11;
        Action action;
        String str2 = this.f49845p;
        if (str2 != null && str2.length() != 0 && (str = this.f49846q) != null && str.length() != 0 && (l11 = this.f49847r) != null && l11.longValue() > 0 && (action = this.f49848s) != null && action.isValid()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Footer(thumb=" + this.f49845p + ", title=" + this.f49846q + ", timeoutMillis=" + this.f49847r + ", action=" + this.f49848s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49845p);
        parcel.writeString(this.f49846q);
        Long l11 = this.f49847r;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Action action = this.f49848s;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i11);
        }
    }

    public Footer(String str, String str2, Long l11, Action action) {
        this.f49845p = str;
        this.f49846q = str2;
        this.f49847r = l11;
        this.f49848s = action;
    }
}
