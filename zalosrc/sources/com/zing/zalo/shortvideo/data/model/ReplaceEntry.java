package com.zing.zalo.shortvideo.data.model;

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
public final class ReplaceEntry implements Parcelable {

    /* renamed from: p */
    private final String f49946p;

    /* renamed from: q */
    private final String f49947q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReplaceEntry> CREATOR = new C9417a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ReplaceEntry$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.ReplaceEntry$a */
    /* loaded from: classes5.dex */
    public static final class C9417a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReplaceEntry createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ReplaceEntry(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReplaceEntry[] newArray(int i11) {
            return new ReplaceEntry[i11];
        }
    }

    public /* synthetic */ ReplaceEntry(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, ReplaceEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.f49946p = str;
        if ((i11 & 2) == 0) {
            this.f49947q = null;
        } else {
            this.f49947q = str2;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m51122c(ReplaceEntry replaceEntry, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, replaceEntry.f49946p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || replaceEntry.f49947q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, replaceEntry.f49947q);
        }
    }

    /* renamed from: a */
    public final String m51123a() {
        return this.f49947q;
    }

    /* renamed from: b */
    public final String m51124b() {
        return this.f49946p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceEntry)) {
            return false;
        }
        ReplaceEntry replaceEntry = (ReplaceEntry) obj;
        return AbstractC19074t.m100204b(this.f49946p, replaceEntry.f49946p) && AbstractC19074t.m100204b(this.f49947q, replaceEntry.f49947q);
    }

    public int hashCode() {
        int hashCode = this.f49946p.hashCode() * 31;
        String str = this.f49947q;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplaceEntry(videoId=" + this.f49946p + ", identifier=" + this.f49947q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49946p);
        parcel.writeString(this.f49947q);
    }

    public ReplaceEntry(String str, String str2) {
        AbstractC19074t.m100208f(str, "videoId");
        this.f49946p = str;
        this.f49947q = str2;
    }
}
