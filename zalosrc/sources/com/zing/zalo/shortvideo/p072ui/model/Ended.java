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
public final class Ended implements Parcelable {

    /* renamed from: p */
    private final String f51333p;

    /* renamed from: q */
    private final String f51334q;

    /* renamed from: r */
    private final String f51335r;

    /* renamed from: s */
    private final String f51336s;

    /* renamed from: t */
    private final String f51337t;

    /* renamed from: u */
    private final Integer f51338u;

    /* renamed from: v */
    private final Integer f51339v;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Ended> CREATOR = new C9773a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Ended$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.Ended$a */
    /* loaded from: classes5.dex */
    public static final class C9773a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ended createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Ended(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ended[] newArray(int i11) {
            return new Ended[i11];
        }
    }

    public /* synthetic */ Ended(int i11, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, AbstractC26805k1 abstractC26805k1) {
        if (127 != (i11 & 127)) {
            AbstractC26774a1.m137800b(i11, 127, Ended$$serializer.INSTANCE.getDescriptor());
        }
        this.f51333p = str;
        this.f51334q = str2;
        this.f51335r = str3;
        this.f51336s = str4;
        this.f51337t = str5;
        this.f51338u = num;
        this.f51339v = num2;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m52790h(Ended ended, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 0, c26814n1, ended.f51333p);
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26814n1, ended.f51334q);
        interfaceC21886d.mo114028h(serialDescriptor, 2, c26814n1, ended.f51335r);
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26814n1, ended.f51336s);
        interfaceC21886d.mo114028h(serialDescriptor, 4, c26814n1, ended.f51337t);
        C26783d0 c26783d0 = C26783d0.f126989a;
        interfaceC21886d.mo114028h(serialDescriptor, 5, c26783d0, ended.f51338u);
        interfaceC21886d.mo114028h(serialDescriptor, 6, c26783d0, ended.f51339v);
    }

    /* renamed from: a */
    public final Integer m52791a() {
        return this.f51339v;
    }

    /* renamed from: b */
    public final String m52792b() {
        return this.f51336s;
    }

    /* renamed from: c */
    public final String m52793c() {
        return this.f51337t;
    }

    /* renamed from: d */
    public final Integer m52794d() {
        return this.f51338u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m52795e() {
        return this.f51333p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ended)) {
            return false;
        }
        Ended ended = (Ended) obj;
        return AbstractC19074t.m100204b(this.f51333p, ended.f51333p) && AbstractC19074t.m100204b(this.f51334q, ended.f51334q) && AbstractC19074t.m100204b(this.f51335r, ended.f51335r) && AbstractC19074t.m100204b(this.f51336s, ended.f51336s) && AbstractC19074t.m100204b(this.f51337t, ended.f51337t) && AbstractC19074t.m100204b(this.f51338u, ended.f51338u) && AbstractC19074t.m100204b(this.f51339v, ended.f51339v);
    }

    /* renamed from: f */
    public final String m52796f() {
        return this.f51335r;
    }

    /* renamed from: g */
    public final String m52797g() {
        return this.f51334q;
    }

    public int hashCode() {
        String str = this.f51333p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51334q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51335r;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51336s;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51337t;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f51338u;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f51339v;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Ended(avatar=" + this.f51333p + ", name=" + this.f51334q + ", message=" + this.f51335r + ", actionLink=" + this.f51336s + ", actionText=" + this.f51337t + ", actionTextColor=" + this.f51338u + ", actionBgColor=" + this.f51339v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51333p);
        parcel.writeString(this.f51334q);
        parcel.writeString(this.f51335r);
        parcel.writeString(this.f51336s);
        parcel.writeString(this.f51337t);
        Integer num = this.f51338u;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f51339v;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public Ended(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        this.f51333p = str;
        this.f51334q = str2;
        this.f51335r = str3;
        this.f51336s = str4;
        this.f51337t = str5;
        this.f51338u = num;
        this.f51339v = num2;
    }
}
