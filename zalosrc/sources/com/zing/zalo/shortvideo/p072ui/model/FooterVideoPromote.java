package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class FooterVideoPromote implements Parcelable {

    /* renamed from: p */
    private final Integer f51340p;

    /* renamed from: q */
    private final String f51341q;

    /* renamed from: r */
    private final String f51342r;

    /* renamed from: s */
    private final String f51343s;

    /* renamed from: t */
    private final String f51344t;

    /* renamed from: u */
    private final Integer f51345u;

    /* renamed from: v */
    private final Integer f51346v;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FooterVideoPromote> CREATOR = new C9774a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return FooterVideoPromote$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.FooterVideoPromote$a */
    /* loaded from: classes5.dex */
    public static final class C9774a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FooterVideoPromote createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new FooterVideoPromote(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FooterVideoPromote[] newArray(int i11) {
            return new FooterVideoPromote[i11];
        }
    }

    public /* synthetic */ FooterVideoPromote(int i11, Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f51340p = null;
        } else {
            this.f51340p = num;
        }
        if ((i11 & 2) == 0) {
            this.f51341q = null;
        } else {
            this.f51341q = str;
        }
        if ((i11 & 4) == 0) {
            this.f51342r = null;
        } else {
            this.f51342r = str2;
        }
        if ((i11 & 8) == 0) {
            this.f51343s = null;
        } else {
            this.f51343s = str3;
        }
        if ((i11 & 16) == 0) {
            this.f51344t = null;
        } else {
            this.f51344t = str4;
        }
        if ((i11 & 32) == 0) {
            this.f51345u = null;
        } else {
            this.f51345u = num2;
        }
        if ((i11 & 64) == 0) {
            this.f51346v = null;
        } else {
            this.f51346v = num3;
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m52800i(FooterVideoPromote footerVideoPromote, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || footerVideoPromote.f51340p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, footerVideoPromote.f51340p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || footerVideoPromote.f51341q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, footerVideoPromote.f51341q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || footerVideoPromote.f51342r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, footerVideoPromote.f51342r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || footerVideoPromote.f51343s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, footerVideoPromote.f51343s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || footerVideoPromote.f51344t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, footerVideoPromote.f51344t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || footerVideoPromote.f51345u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26783d0.f126989a, footerVideoPromote.f51345u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || footerVideoPromote.f51346v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26783d0.f126989a, footerVideoPromote.f51346v);
        }
    }

    /* renamed from: a */
    public final Integer m52801a() {
        return this.f51346v;
    }

    /* renamed from: b */
    public final String m52802b() {
        return this.f51341q;
    }

    /* renamed from: c */
    public final String m52803c() {
        return this.f51344t;
    }

    /* renamed from: d */
    public final Integer m52804d() {
        return this.f51345u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m52805e() {
        return this.f51342r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterVideoPromote)) {
            return false;
        }
        FooterVideoPromote footerVideoPromote = (FooterVideoPromote) obj;
        return AbstractC19074t.m100204b(this.f51340p, footerVideoPromote.f51340p) && AbstractC19074t.m100204b(this.f51341q, footerVideoPromote.f51341q) && AbstractC19074t.m100204b(this.f51342r, footerVideoPromote.f51342r) && AbstractC19074t.m100204b(this.f51343s, footerVideoPromote.f51343s) && AbstractC19074t.m100204b(this.f51344t, footerVideoPromote.f51344t) && AbstractC19074t.m100204b(this.f51345u, footerVideoPromote.f51345u) && AbstractC19074t.m100204b(this.f51346v, footerVideoPromote.f51346v);
    }

    /* renamed from: f */
    public final Integer m52806f() {
        return this.f51340p;
    }

    /* renamed from: g */
    public final String m52807g() {
        return this.f51343s;
    }

    /* renamed from: h */
    public final boolean m52808h() {
        String str;
        Integer num = this.f51340p;
        if (num != null && num.intValue() >= 0 && (str = this.f51342r) != null && str.length() != 0 && this.f51345u != null && this.f51346v != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f51340p;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f51341q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51342r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51343s;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51344t;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f51345u;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f51346v;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "FooterVideoPromote(type=" + this.f51340p + ", icon=" + this.f51341q + ", title=" + this.f51342r + ", value=" + this.f51343s + ", iconChevron=" + this.f51344t + ", textColor=" + this.f51345u + ", backgroundColor=" + this.f51346v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        Integer num = this.f51340p;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f51341q);
        parcel.writeString(this.f51342r);
        parcel.writeString(this.f51343s);
        parcel.writeString(this.f51344t);
        Integer num2 = this.f51345u;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f51346v;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public FooterVideoPromote(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3) {
        this.f51340p = num;
        this.f51341q = str;
        this.f51342r = str2;
        this.f51343s = str3;
        this.f51344t = str4;
        this.f51345u = num2;
        this.f51346v = num3;
    }
}
