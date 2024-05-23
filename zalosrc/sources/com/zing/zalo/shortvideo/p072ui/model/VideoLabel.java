package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import t20.C26466c;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoLabel implements Parcelable {

    /* renamed from: p */
    private final Integer f51433p;

    /* renamed from: q */
    private final String f51434q;

    /* renamed from: r */
    private final String f51435r;

    /* renamed from: s */
    private final String f51436s;

    /* renamed from: t */
    private final String f51437t;

    /* renamed from: u */
    private final Integer f51438u;

    /* renamed from: v */
    private final Integer f51439v;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoLabel> CREATOR = new C9780a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoLabel$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.VideoLabel$a */
    /* loaded from: classes5.dex */
    public static final class C9780a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final VideoLabel createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VideoLabel(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final VideoLabel[] newArray(int i11) {
            return new VideoLabel[i11];
        }
    }

    public /* synthetic */ VideoLabel(int i11, Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f51433p = null;
        } else {
            this.f51433p = num;
        }
        if ((i11 & 2) == 0) {
            this.f51434q = null;
        } else {
            this.f51434q = str;
        }
        if ((i11 & 4) == 0) {
            this.f51435r = null;
        } else {
            this.f51435r = str2;
        }
        if ((i11 & 8) == 0) {
            this.f51436s = null;
        } else {
            this.f51436s = str3;
        }
        if ((i11 & 16) == 0) {
            this.f51437t = null;
        } else {
            this.f51437t = str4;
        }
        if ((i11 & 32) == 0) {
            this.f51438u = null;
        } else {
            this.f51438u = num2;
        }
        if ((i11 & 64) == 0) {
            this.f51439v = null;
        } else {
            this.f51439v = num3;
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m52941i(VideoLabel videoLabel, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || videoLabel.f51433p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, videoLabel.f51433p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || videoLabel.f51434q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, videoLabel.f51434q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || videoLabel.f51435r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, videoLabel.f51435r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || videoLabel.f51436s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, videoLabel.f51436s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || videoLabel.f51437t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, videoLabel.f51437t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || videoLabel.f51438u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26783d0.f126989a, videoLabel.f51438u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || videoLabel.f51439v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26783d0.f126989a, videoLabel.f51439v);
        }
    }

    /* renamed from: a */
    public final Integer m52942a() {
        return this.f51439v;
    }

    /* renamed from: b */
    public final String m52943b() {
        return this.f51434q;
    }

    /* renamed from: c */
    public final String m52944c() {
        return this.f51437t;
    }

    /* renamed from: d */
    public final Integer m52945d() {
        return this.f51438u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m52946e() {
        return this.f51435r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLabel)) {
            return false;
        }
        VideoLabel videoLabel = (VideoLabel) obj;
        return AbstractC19074t.m100204b(this.f51433p, videoLabel.f51433p) && AbstractC19074t.m100204b(this.f51434q, videoLabel.f51434q) && AbstractC19074t.m100204b(this.f51435r, videoLabel.f51435r) && AbstractC19074t.m100204b(this.f51436s, videoLabel.f51436s) && AbstractC19074t.m100204b(this.f51437t, videoLabel.f51437t) && AbstractC19074t.m100204b(this.f51438u, videoLabel.f51438u) && AbstractC19074t.m100204b(this.f51439v, videoLabel.f51439v);
    }

    /* renamed from: f */
    public final Integer m52947f() {
        return this.f51433p;
    }

    /* renamed from: g */
    public final String m52948g() {
        return this.f51436s;
    }

    /* renamed from: h */
    public final boolean m52949h() {
        String str;
        if (C26466c.f125664a.m136380a(this.f51433p) && this.f51438u != null && this.f51439v != null && (str = this.f51435r) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f51433p;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f51434q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51435r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51436s;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51437t;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f51438u;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f51439v;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "VideoLabel(type=" + this.f51433p + ", icon=" + this.f51434q + ", title=" + this.f51435r + ", value=" + this.f51436s + ", src=" + this.f51437t + ", textColor=" + this.f51438u + ", backgroundColor=" + this.f51439v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        Integer num = this.f51433p;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f51434q);
        parcel.writeString(this.f51435r);
        parcel.writeString(this.f51436s);
        parcel.writeString(this.f51437t);
        Integer num2 = this.f51438u;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f51439v;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public VideoLabel(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3) {
        this.f51433p = num;
        this.f51434q = str;
        this.f51435r = str2;
        this.f51436s = str3;
        this.f51437t = str4;
        this.f51438u = num2;
        this.f51439v = num3;
    }
}
