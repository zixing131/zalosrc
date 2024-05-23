package com.zing.zalo.shortvideo.data.remote.ws.response;

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

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class GetStatLivestreamRes implements Parcelable {

    /* renamed from: p */
    private final Long f50282p;

    /* renamed from: q */
    private final Long f50283q;

    /* renamed from: r */
    private final Long f50284r;

    /* renamed from: s */
    private final Long f50285s;

    /* renamed from: t */
    private final Long f50286t;

    /* renamed from: u */
    private final Long f50287u;

    /* renamed from: v */
    private final Long f50288v;

    /* renamed from: w */
    private final Long f50289w;

    /* renamed from: x */
    private final Long f50290x;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetStatLivestreamRes> CREATOR = new C9452a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return GetStatLivestreamRes$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.GetStatLivestreamRes$a */
    /* loaded from: classes5.dex */
    public static final class C9452a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetStatLivestreamRes createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new GetStatLivestreamRes(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GetStatLivestreamRes[] newArray(int i11) {
            return new GetStatLivestreamRes[i11];
        }
    }

    public /* synthetic */ GetStatLivestreamRes(int i11, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50282p = null;
        } else {
            this.f50282p = l11;
        }
        if ((i11 & 2) == 0) {
            this.f50283q = null;
        } else {
            this.f50283q = l12;
        }
        if ((i11 & 4) == 0) {
            this.f50284r = null;
        } else {
            this.f50284r = l13;
        }
        if ((i11 & 8) == 0) {
            this.f50285s = null;
        } else {
            this.f50285s = l14;
        }
        if ((i11 & 16) == 0) {
            this.f50286t = null;
        } else {
            this.f50286t = l15;
        }
        if ((i11 & 32) == 0) {
            this.f50287u = null;
        } else {
            this.f50287u = l16;
        }
        if ((i11 & 64) == 0) {
            this.f50288v = null;
        } else {
            this.f50288v = l17;
        }
        if ((i11 & 128) == 0) {
            this.f50289w = null;
        } else {
            this.f50289w = l18;
        }
        if ((i11 & 256) == 0) {
            this.f50290x = null;
        } else {
            this.f50290x = l19;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51656d(GetStatLivestreamRes getStatLivestreamRes, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || getStatLivestreamRes.f50282p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, getStatLivestreamRes.f50282p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || getStatLivestreamRes.f50283q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, getStatLivestreamRes.f50283q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || getStatLivestreamRes.f50284r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, getStatLivestreamRes.f50284r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || getStatLivestreamRes.f50285s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, getStatLivestreamRes.f50285s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || getStatLivestreamRes.f50286t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26810m0.f127024a, getStatLivestreamRes.f50286t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || getStatLivestreamRes.f50287u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, getStatLivestreamRes.f50287u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || getStatLivestreamRes.f50288v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26810m0.f127024a, getStatLivestreamRes.f50288v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || getStatLivestreamRes.f50289w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26810m0.f127024a, getStatLivestreamRes.f50289w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || getStatLivestreamRes.f50290x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26810m0.f127024a, getStatLivestreamRes.f50290x);
        }
    }

    /* renamed from: a */
    public final Long m51657a() {
        return this.f50284r;
    }

    /* renamed from: b */
    public final Long m51658b() {
        return this.f50288v;
    }

    /* renamed from: c */
    public final Long m51659c() {
        return this.f50282p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStatLivestreamRes)) {
            return false;
        }
        GetStatLivestreamRes getStatLivestreamRes = (GetStatLivestreamRes) obj;
        return AbstractC19074t.m100204b(this.f50282p, getStatLivestreamRes.f50282p) && AbstractC19074t.m100204b(this.f50283q, getStatLivestreamRes.f50283q) && AbstractC19074t.m100204b(this.f50284r, getStatLivestreamRes.f50284r) && AbstractC19074t.m100204b(this.f50285s, getStatLivestreamRes.f50285s) && AbstractC19074t.m100204b(this.f50286t, getStatLivestreamRes.f50286t) && AbstractC19074t.m100204b(this.f50287u, getStatLivestreamRes.f50287u) && AbstractC19074t.m100204b(this.f50288v, getStatLivestreamRes.f50288v) && AbstractC19074t.m100204b(this.f50289w, getStatLivestreamRes.f50289w) && AbstractC19074t.m100204b(this.f50290x, getStatLivestreamRes.f50290x);
    }

    public int hashCode() {
        Long l11 = this.f50282p;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f50283q;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f50284r;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f50285s;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f50286t;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f50287u;
        int hashCode6 = (hashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f50288v;
        int hashCode7 = (hashCode6 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f50289w;
        int hashCode8 = (hashCode7 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.f50290x;
        return hashCode8 + (l19 != null ? l19.hashCode() : 0);
    }

    public String toString() {
        return "GetStatLivestreamRes(liveId=" + this.f50282p + ", intervalMillis=" + this.f50283q + ", currentViewer=" + this.f50284r + ", maxViewer=" + this.f50285s + ", watchTime=" + this.f50286t + ", views=" + this.f50287u + ", likes=" + this.f50288v + ", shares=" + this.f50289w + ", cmts=" + this.f50290x + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        Long l11 = this.f50282p;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Long l12 = this.f50283q;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        Long l13 = this.f50284r;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
        Long l14 = this.f50285s;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l14.longValue());
        }
        Long l15 = this.f50286t;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l15.longValue());
        }
        Long l16 = this.f50287u;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l16.longValue());
        }
        Long l17 = this.f50288v;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l17.longValue());
        }
        Long l18 = this.f50289w;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l18.longValue());
        }
        Long l19 = this.f50290x;
        if (l19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l19.longValue());
        }
    }

    public GetStatLivestreamRes(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19) {
        this.f50282p = l11;
        this.f50283q = l12;
        this.f50284r = l13;
        this.f50285s = l14;
        this.f50286t = l15;
        this.f50287u = l16;
        this.f50288v = l17;
        this.f50289w = l18;
        this.f50290x = l19;
    }
}
