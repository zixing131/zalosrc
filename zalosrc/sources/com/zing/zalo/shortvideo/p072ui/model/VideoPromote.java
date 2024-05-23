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
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoPromote implements Parcelable {

    /* renamed from: p */
    private final String f51442p;

    /* renamed from: q */
    private final String f51443q;

    /* renamed from: r */
    private final String f51444r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoPromote> CREATOR = new C9782a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoPromote$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.VideoPromote$a */
    /* loaded from: classes5.dex */
    public static final class C9782a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoPromote createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VideoPromote(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoPromote[] newArray(int i11) {
            return new VideoPromote[i11];
        }
    }

    public /* synthetic */ VideoPromote(int i11, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f51442p = null;
        } else {
            this.f51442p = str;
        }
        if ((i11 & 2) == 0) {
            this.f51443q = null;
        } else {
            this.f51443q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f51444r = null;
        } else {
            this.f51444r = str3;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m52957d(VideoPromote videoPromote, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || videoPromote.f51442p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, videoPromote.f51442p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || videoPromote.f51443q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, videoPromote.f51443q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || videoPromote.f51444r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, videoPromote.f51444r);
        }
    }

    /* renamed from: a */
    public final String m52958a() {
        return this.f51443q;
    }

    /* renamed from: b */
    public final String m52959b() {
        return this.f51444r;
    }

    /* renamed from: c */
    public final String m52960c() {
        return this.f51442p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPromote)) {
            return false;
        }
        VideoPromote videoPromote = (VideoPromote) obj;
        return AbstractC19074t.m100204b(this.f51442p, videoPromote.f51442p) && AbstractC19074t.m100204b(this.f51443q, videoPromote.f51443q) && AbstractC19074t.m100204b(this.f51444r, videoPromote.f51444r);
    }

    public int hashCode() {
        String str = this.f51442p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51443q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51444r;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isValid() {
        String str;
        String str2;
        String str3 = this.f51442p;
        if (str3 != null && str3.length() != 0 && (str = this.f51443q) != null && str.length() != 0 && (str2 = this.f51444r) != null && str2.length() != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "VideoPromote(title=" + this.f51442p + ", icon=" + this.f51443q + ", link=" + this.f51444r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51442p);
        parcel.writeString(this.f51443q);
        parcel.writeString(this.f51444r);
    }

    public VideoPromote(String str, String str2, String str3) {
        this.f51442p = str;
        this.f51443q = str2;
        this.f51444r = str3;
    }
}
