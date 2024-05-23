package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
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
public final class InAppNotification implements Parcelable {

    /* renamed from: p */
    private final int f49858p;

    /* renamed from: q */
    private final long f49859q;

    /* renamed from: r */
    private final String f49860r;

    /* renamed from: s */
    private final String f49861s;

    /* renamed from: t */
    private final String f49862t;

    /* renamed from: u */
    private final Content f49863u;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InAppNotification> CREATOR = new C9403a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return InAppNotification$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.InAppNotification$a */
    /* loaded from: classes5.dex */
    public static final class C9403a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InAppNotification createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new InAppNotification(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), Content.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InAppNotification[] newArray(int i11) {
            return new InAppNotification[i11];
        }
    }

    public /* synthetic */ InAppNotification(int i11, int i12, long j11, String str, String str2, String str3, Content content, AbstractC26805k1 abstractC26805k1) {
        if (47 != (i11 & 47)) {
            AbstractC26774a1.m137800b(i11, 47, InAppNotification$$serializer.INSTANCE.getDescriptor());
        }
        this.f49858p = i12;
        this.f49859q = j11;
        this.f49860r = str;
        this.f49861s = str2;
        if ((i11 & 16) == 0) {
            this.f49862t = null;
        } else {
            this.f49862t = str3;
        }
        this.f49863u = content;
    }

    /* renamed from: g */
    public static final /* synthetic */ void m50966g(InAppNotification inAppNotification, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, inAppNotification.f49858p);
        interfaceC21886d.mo114022E(serialDescriptor, 1, inAppNotification.f49859q);
        interfaceC21886d.mo114035z(serialDescriptor, 2, inAppNotification.f49860r);
        interfaceC21886d.mo114035z(serialDescriptor, 3, inAppNotification.f49861s);
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || inAppNotification.f49862t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, inAppNotification.f49862t);
        }
        interfaceC21886d.mo114029i(serialDescriptor, 5, Content$$serializer.INSTANCE, inAppNotification.f49863u);
    }

    /* renamed from: a */
    public final Content m50967a() {
        return this.f49863u;
    }

    /* renamed from: b */
    public final String m50968b() {
        return this.f49860r;
    }

    /* renamed from: c */
    public final String m50969c() {
        return this.f49862t;
    }

    /* renamed from: d */
    public final int m50970d() {
        return this.f49858p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m50971e() {
        return this.f49859q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotification)) {
            return false;
        }
        InAppNotification inAppNotification = (InAppNotification) obj;
        return this.f49858p == inAppNotification.f49858p && this.f49859q == inAppNotification.f49859q && AbstractC19074t.m100204b(this.f49860r, inAppNotification.f49860r) && AbstractC19074t.m100204b(this.f49861s, inAppNotification.f49861s) && AbstractC19074t.m100204b(this.f49862t, inAppNotification.f49862t) && AbstractC19074t.m100204b(this.f49863u, inAppNotification.f49863u);
    }

    /* renamed from: f */
    public final String m50972f() {
        return this.f49861s;
    }

    public int hashCode() {
        int m11521a = ((((((this.f49858p * 31) + AbstractC2147g0.m11521a(this.f49859q)) * 31) + this.f49860r.hashCode()) * 31) + this.f49861s.hashCode()) * 31;
        String str = this.f49862t;
        return ((m11521a + (str == null ? 0 : str.hashCode())) * 31) + this.f49863u.hashCode();
    }

    public String toString() {
        return "InAppNotification(popupType=" + this.f49858p + ", timeoutMillis=" + this.f49859q + ", icon=" + this.f49860r + ", title=" + this.f49861s + ", link=" + this.f49862t + ", content=" + this.f49863u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f49858p);
        parcel.writeLong(this.f49859q);
        parcel.writeString(this.f49860r);
        parcel.writeString(this.f49861s);
        parcel.writeString(this.f49862t);
        this.f49863u.writeToParcel(parcel, i11);
    }

    public InAppNotification(int i11, long j11, String str, String str2, String str3, Content content) {
        AbstractC19074t.m100208f(str, "icon");
        AbstractC19074t.m100208f(str2, "title");
        AbstractC19074t.m100208f(content, "content");
        this.f49858p = i11;
        this.f49859q = j11;
        this.f49860r = str;
        this.f49861s = str2;
        this.f49862t = str3;
        this.f49863u = content;
    }
}
