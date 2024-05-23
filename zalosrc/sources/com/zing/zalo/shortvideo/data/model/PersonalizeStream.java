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
import tn0.C26783d0;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class PersonalizeStream implements Parcelable {

    /* renamed from: p */
    private final String f49939p;

    /* renamed from: q */
    private final String f49940q;

    /* renamed from: r */
    private final boolean f49941r;

    /* renamed from: s */
    private final boolean f49942s;

    /* renamed from: t */
    private final boolean f49943t;

    /* renamed from: u */
    private final boolean f49944u;

    /* renamed from: v */
    private final Integer f49945v;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonalizeStream> CREATOR = new C9416a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PersonalizeStream$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.PersonalizeStream$a */
    /* loaded from: classes5.dex */
    public static final class C9416a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PersonalizeStream createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new PersonalizeStream(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PersonalizeStream[] newArray(int i11) {
            return new PersonalizeStream[i11];
        }
    }

    public /* synthetic */ PersonalizeStream(int i11, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Integer num, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, PersonalizeStream$$serializer.INSTANCE.getDescriptor());
        }
        this.f49939p = str;
        this.f49940q = str2;
        if ((i11 & 4) == 0) {
            this.f49941r = false;
        } else {
            this.f49941r = z11;
        }
        if ((i11 & 8) == 0) {
            this.f49942s = false;
        } else {
            this.f49942s = z12;
        }
        if ((i11 & 16) == 0) {
            this.f49943t = false;
        } else {
            this.f49943t = z13;
        }
        if ((i11 & 32) == 0) {
            this.f49944u = false;
        } else {
            this.f49944u = z14;
        }
        if ((i11 & 64) == 0) {
            this.f49945v = null;
        } else {
            this.f49945v = num;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m51113g(PersonalizeStream personalizeStream, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, personalizeStream.f49939p);
        interfaceC21886d.mo114035z(serialDescriptor, 1, personalizeStream.f49940q);
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || personalizeStream.f49941r) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, personalizeStream.f49941r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || personalizeStream.f49942s) {
            interfaceC21886d.mo114034y(serialDescriptor, 3, personalizeStream.f49942s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || personalizeStream.f49943t) {
            interfaceC21886d.mo114034y(serialDescriptor, 4, personalizeStream.f49943t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || personalizeStream.f49944u) {
            interfaceC21886d.mo114034y(serialDescriptor, 5, personalizeStream.f49944u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || personalizeStream.f49945v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26783d0.f126989a, personalizeStream.f49945v);
        }
    }

    /* renamed from: a */
    public final String m51114a() {
        return this.f49940q;
    }

    /* renamed from: b */
    public final String m51115b() {
        return this.f49939p;
    }

    /* renamed from: c */
    public final Integer m51116c() {
        return this.f49945v;
    }

    /* renamed from: d */
    public final boolean m51117d() {
        return this.f49942s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m51118e() {
        return this.f49943t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizeStream)) {
            return false;
        }
        PersonalizeStream personalizeStream = (PersonalizeStream) obj;
        return AbstractC19074t.m100204b(this.f49939p, personalizeStream.f49939p) && AbstractC19074t.m100204b(this.f49940q, personalizeStream.f49940q) && this.f49941r == personalizeStream.f49941r && this.f49942s == personalizeStream.f49942s && this.f49943t == personalizeStream.f49943t && this.f49944u == personalizeStream.f49944u && AbstractC19074t.m100204b(this.f49945v, personalizeStream.f49945v);
    }

    /* renamed from: f */
    public final boolean m51119f() {
        return this.f49941r;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f49939p.hashCode() * 31) + this.f49940q.hashCode()) * 31) + AbstractC2144f.m11520a(this.f49941r)) * 31) + AbstractC2144f.m11520a(this.f49942s)) * 31) + AbstractC2144f.m11520a(this.f49943t)) * 31) + AbstractC2144f.m11520a(this.f49944u)) * 31;
        Integer num = this.f49945v;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PersonalizeStream(id=" + this.f49939p + ", channelId=" + this.f49940q + ", isFollowing=" + this.f49941r + ", isBlockedCmt=" + this.f49942s + ", isBlockedLike=" + this.f49943t + ", isLiked=" + this.f49944u + ", status=" + this.f49945v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int intValue;
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49939p);
        parcel.writeString(this.f49940q);
        parcel.writeInt(this.f49941r ? 1 : 0);
        parcel.writeInt(this.f49942s ? 1 : 0);
        parcel.writeInt(this.f49943t ? 1 : 0);
        parcel.writeInt(this.f49944u ? 1 : 0);
        Integer num = this.f49945v;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public PersonalizeStream(String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Integer num) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "channelId");
        this.f49939p = str;
        this.f49940q = str2;
        this.f49941r = z11;
        this.f49942s = z12;
        this.f49943t = z13;
        this.f49944u = z14;
        this.f49945v = num;
    }
}
