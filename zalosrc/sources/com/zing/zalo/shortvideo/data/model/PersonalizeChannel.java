package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class PersonalizeChannel implements Parcelable {

    /* renamed from: p */
    private final String f49933p;

    /* renamed from: q */
    private final boolean f49934q;

    /* renamed from: r */
    private final boolean f49935r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonalizeChannel> CREATOR = new C9414a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PersonalizeChannel$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.PersonalizeChannel$a */
    /* loaded from: classes5.dex */
    public static final class C9414a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PersonalizeChannel createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new PersonalizeChannel(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PersonalizeChannel[] newArray(int i11) {
            return new PersonalizeChannel[i11];
        }
    }

    public /* synthetic */ PersonalizeChannel(int i11, String str, boolean z11, boolean z12, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, PersonalizeChannel$$serializer.INSTANCE.getDescriptor());
        }
        this.f49933p = str;
        if ((i11 & 2) == 0) {
            this.f49934q = false;
        } else {
            this.f49934q = z11;
        }
        if ((i11 & 4) == 0) {
            this.f49935r = false;
        } else {
            this.f49935r = z12;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51101d(PersonalizeChannel personalizeChannel, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, personalizeChannel.f49933p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || personalizeChannel.f49934q) {
            interfaceC21886d.mo114034y(serialDescriptor, 1, personalizeChannel.f49934q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || personalizeChannel.f49935r) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, personalizeChannel.f49935r);
        }
    }

    /* renamed from: a */
    public final String m51102a() {
        return this.f49933p;
    }

    /* renamed from: b */
    public final boolean m51103b() {
        return this.f49935r;
    }

    /* renamed from: c */
    public final boolean m51104c() {
        return this.f49934q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizeChannel)) {
            return false;
        }
        PersonalizeChannel personalizeChannel = (PersonalizeChannel) obj;
        return AbstractC19074t.m100204b(this.f49933p, personalizeChannel.f49933p) && this.f49934q == personalizeChannel.f49934q && this.f49935r == personalizeChannel.f49935r;
    }

    public int hashCode() {
        return (((this.f49933p.hashCode() * 31) + AbstractC2144f.m11520a(this.f49934q)) * 31) + AbstractC2144f.m11520a(this.f49935r);
    }

    public String toString() {
        return "PersonalizeChannel(id=" + this.f49933p + ", isFollowing=" + this.f49934q + ", isBlocked=" + this.f49935r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49933p);
        parcel.writeInt(this.f49934q ? 1 : 0);
        parcel.writeInt(this.f49935r ? 1 : 0);
    }

    public PersonalizeChannel(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "id");
        this.f49933p = str;
        this.f49934q = z11;
        this.f49935r = z12;
    }
}
