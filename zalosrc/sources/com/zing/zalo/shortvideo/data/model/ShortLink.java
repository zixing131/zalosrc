package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class ShortLink implements Parcelable {

    /* renamed from: p */
    private final String f49976p;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShortLink> CREATOR = new C9428a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ShortLink$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.ShortLink$a */
    /* loaded from: classes5.dex */
    public static final class C9428a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShortLink createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ShortLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ShortLink[] newArray(int i11) {
            return new ShortLink[i11];
        }
    }

    public /* synthetic */ ShortLink(int i11, String str, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, ShortLink$$serializer.INSTANCE.getDescriptor());
        }
        this.f49976p = str;
    }

    /* renamed from: a */
    public final String m51196a() {
        return this.f49976p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortLink) && AbstractC19074t.m100204b(this.f49976p, ((ShortLink) obj).f49976p);
    }

    public int hashCode() {
        return this.f49976p.hashCode();
    }

    public String toString() {
        return "ShortLink(link=" + this.f49976p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49976p);
    }

    public ShortLink(String str) {
        AbstractC19074t.m100208f(str, "link");
        this.f49976p = str;
    }
}
