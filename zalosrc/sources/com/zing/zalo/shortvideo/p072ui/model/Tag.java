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
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Tag implements Parcelable {

    /* renamed from: p */
    private final String f51357p;

    /* renamed from: q */
    private final Integer f51358q;

    /* renamed from: r */
    private final Integer f51359r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Tag> CREATOR = new C9777a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Tag$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.Tag$a */
    /* loaded from: classes5.dex */
    public static final class C9777a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Tag createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Tag(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Tag[] newArray(int i11) {
            return new Tag[i11];
        }
    }

    public /* synthetic */ Tag(int i11, String str, Integer num, Integer num2, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, Tag$$serializer.INSTANCE.getDescriptor());
        }
        this.f51357p = str;
        this.f51358q = num;
        this.f51359r = num2;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m52826d(Tag tag, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, tag.f51357p);
        C26783d0 c26783d0 = C26783d0.f126989a;
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26783d0, tag.f51358q);
        interfaceC21886d.mo114028h(serialDescriptor, 2, c26783d0, tag.f51359r);
    }

    /* renamed from: a */
    public final Integer m52827a() {
        return this.f51359r;
    }

    /* renamed from: b */
    public final String m52828b() {
        return this.f51357p;
    }

    /* renamed from: c */
    public final Integer m52829c() {
        return this.f51358q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return AbstractC19074t.m100204b(this.f51357p, tag.f51357p) && AbstractC19074t.m100204b(this.f51358q, tag.f51358q) && AbstractC19074t.m100204b(this.f51359r, tag.f51359r);
    }

    public int hashCode() {
        String str = this.f51357p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f51358q;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f51359r;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Tag(text=" + this.f51357p + ", textColor=" + this.f51358q + ", bgColor=" + this.f51359r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51357p);
        Integer num = this.f51358q;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f51359r;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public Tag(String str, Integer num, Integer num2) {
        this.f51357p = str;
        this.f51358q = num;
        this.f51359r = num2;
    }
}
