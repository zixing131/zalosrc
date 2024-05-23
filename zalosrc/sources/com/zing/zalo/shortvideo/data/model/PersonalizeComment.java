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
public final class PersonalizeComment implements Parcelable {

    /* renamed from: p */
    private final String f49936p;

    /* renamed from: q */
    private final boolean f49937q;

    /* renamed from: r */
    private final boolean f49938r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonalizeComment> CREATOR = new C9415a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PersonalizeComment$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.PersonalizeComment$a */
    /* loaded from: classes5.dex */
    public static final class C9415a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PersonalizeComment createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new PersonalizeComment(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PersonalizeComment[] newArray(int i11) {
            return new PersonalizeComment[i11];
        }
    }

    public /* synthetic */ PersonalizeComment(int i11, String str, boolean z11, boolean z12, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, PersonalizeComment$$serializer.INSTANCE.getDescriptor());
        }
        this.f49936p = str;
        if ((i11 & 2) == 0) {
            this.f49937q = false;
        } else {
            this.f49937q = z11;
        }
        if ((i11 & 4) == 0) {
            this.f49938r = false;
        } else {
            this.f49938r = z12;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51107d(PersonalizeComment personalizeComment, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, personalizeComment.f49936p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || personalizeComment.f49937q) {
            interfaceC21886d.mo114034y(serialDescriptor, 1, personalizeComment.f49937q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || personalizeComment.f49938r) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, personalizeComment.f49938r);
        }
    }

    /* renamed from: a */
    public final String m51108a() {
        return this.f49936p;
    }

    /* renamed from: b */
    public final boolean m51109b() {
        return this.f49938r;
    }

    /* renamed from: c */
    public final boolean m51110c() {
        return this.f49937q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizeComment)) {
            return false;
        }
        PersonalizeComment personalizeComment = (PersonalizeComment) obj;
        return AbstractC19074t.m100204b(this.f49936p, personalizeComment.f49936p) && this.f49937q == personalizeComment.f49937q && this.f49938r == personalizeComment.f49938r;
    }

    public int hashCode() {
        return (((this.f49936p.hashCode() * 31) + AbstractC2144f.m11520a(this.f49937q)) * 31) + AbstractC2144f.m11520a(this.f49938r);
    }

    public String toString() {
        return "PersonalizeComment(id=" + this.f49936p + ", isLiked=" + this.f49937q + ", isBlocked=" + this.f49938r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49936p);
        parcel.writeInt(this.f49937q ? 1 : 0);
        parcel.writeInt(this.f49938r ? 1 : 0);
    }

    public PersonalizeComment(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "id");
        this.f49936p = str;
        this.f49937q = z11;
        this.f49938r = z12;
    }
}
