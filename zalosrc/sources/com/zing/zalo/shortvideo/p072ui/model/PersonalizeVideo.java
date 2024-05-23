package com.zing.zalo.shortvideo.p072ui.model;

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
public final class PersonalizeVideo implements Parcelable {

    /* renamed from: p */
    private final String f51347p;

    /* renamed from: q */
    private final String f51348q;

    /* renamed from: r */
    private final boolean f51349r;

    /* renamed from: s */
    private final boolean f51350s;

    /* renamed from: t */
    private final boolean f51351t;

    /* renamed from: u */
    private boolean f51352u;

    /* renamed from: v */
    private boolean f51353v;

    /* renamed from: w */
    private boolean f51354w;

    /* renamed from: x */
    private boolean f51355x;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonalizeVideo> CREATOR = new C9775a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PersonalizeVideo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.PersonalizeVideo$a */
    /* loaded from: classes5.dex */
    public static final class C9775a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PersonalizeVideo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new PersonalizeVideo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PersonalizeVideo[] newArray(int i11) {
            return new PersonalizeVideo[i11];
        }
    }

    public /* synthetic */ PersonalizeVideo(int i11, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, PersonalizeVideo$$serializer.INSTANCE.getDescriptor());
        }
        this.f51347p = str;
        this.f51348q = str2;
        if ((i11 & 4) == 0) {
            this.f51349r = false;
        } else {
            this.f51349r = z11;
        }
        if ((i11 & 8) == 0) {
            this.f51350s = false;
        } else {
            this.f51350s = z12;
        }
        if ((i11 & 16) == 0) {
            this.f51351t = false;
        } else {
            this.f51351t = z13;
        }
        if ((i11 & 32) == 0) {
            this.f51352u = false;
        } else {
            this.f51352u = z14;
        }
        if ((i11 & 64) == 0) {
            this.f51353v = false;
        } else {
            this.f51353v = z15;
        }
        if ((i11 & 128) == 0) {
            this.f51354w = false;
        } else {
            this.f51354w = z16;
        }
        if ((i11 & 256) == 0) {
            this.f51355x = false;
        } else {
            this.f51355x = z17;
        }
    }

    /* renamed from: j */
    public static final /* synthetic */ void m52811j(PersonalizeVideo personalizeVideo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, personalizeVideo.f51347p);
        interfaceC21886d.mo114035z(serialDescriptor, 1, personalizeVideo.f51348q);
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || personalizeVideo.f51349r) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, personalizeVideo.f51349r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || personalizeVideo.f51350s) {
            interfaceC21886d.mo114034y(serialDescriptor, 3, personalizeVideo.f51350s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || personalizeVideo.f51351t) {
            interfaceC21886d.mo114034y(serialDescriptor, 4, personalizeVideo.f51351t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || personalizeVideo.f51352u) {
            interfaceC21886d.mo114034y(serialDescriptor, 5, personalizeVideo.f51352u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || personalizeVideo.f51353v) {
            interfaceC21886d.mo114034y(serialDescriptor, 6, personalizeVideo.f51353v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || personalizeVideo.f51354w) {
            interfaceC21886d.mo114034y(serialDescriptor, 7, personalizeVideo.f51354w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || personalizeVideo.f51355x) {
            interfaceC21886d.mo114034y(serialDescriptor, 8, personalizeVideo.f51355x);
        }
    }

    /* renamed from: a */
    public final String m52812a() {
        return this.f51348q;
    }

    /* renamed from: b */
    public final String m52813b() {
        return this.f51347p;
    }

    /* renamed from: c */
    public final boolean m52814c() {
        return this.f51353v;
    }

    /* renamed from: d */
    public final boolean m52815d() {
        return this.f51352u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m52816e() {
        return this.f51350s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizeVideo)) {
            return false;
        }
        PersonalizeVideo personalizeVideo = (PersonalizeVideo) obj;
        return AbstractC19074t.m100204b(this.f51347p, personalizeVideo.f51347p) && AbstractC19074t.m100204b(this.f51348q, personalizeVideo.f51348q) && this.f51349r == personalizeVideo.f51349r && this.f51350s == personalizeVideo.f51350s && this.f51351t == personalizeVideo.f51351t && this.f51352u == personalizeVideo.f51352u && this.f51353v == personalizeVideo.f51353v && this.f51354w == personalizeVideo.f51354w && this.f51355x == personalizeVideo.f51355x;
    }

    /* renamed from: f */
    public final boolean m52817f() {
        return this.f51351t;
    }

    /* renamed from: g */
    public final boolean m52818g() {
        return this.f51355x;
    }

    /* renamed from: h */
    public final boolean m52819h() {
        return this.f51349r;
    }

    public int hashCode() {
        return (((((((((((((((this.f51347p.hashCode() * 31) + this.f51348q.hashCode()) * 31) + AbstractC2144f.m11520a(this.f51349r)) * 31) + AbstractC2144f.m11520a(this.f51350s)) * 31) + AbstractC2144f.m11520a(this.f51351t)) * 31) + AbstractC2144f.m11520a(this.f51352u)) * 31) + AbstractC2144f.m11520a(this.f51353v)) * 31) + AbstractC2144f.m11520a(this.f51354w)) * 31) + AbstractC2144f.m11520a(this.f51355x);
    }

    /* renamed from: i */
    public final boolean m52820i() {
        return this.f51354w;
    }

    public String toString() {
        return "PersonalizeVideo(id=" + this.f51347p + ", channelId=" + this.f51348q + ", isLiked=" + this.f51349r + ", isBookmarked=" + this.f51350s + ", isFollowing=" + this.f51351t + ", isBlockMyUser=" + this.f51352u + ", isBlockMyChannel=" + this.f51353v + ", isShareSuggestion=" + this.f51354w + ", isLikeSuggestion=" + this.f51355x + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51347p);
        parcel.writeString(this.f51348q);
        parcel.writeInt(this.f51349r ? 1 : 0);
        parcel.writeInt(this.f51350s ? 1 : 0);
        parcel.writeInt(this.f51351t ? 1 : 0);
        parcel.writeInt(this.f51352u ? 1 : 0);
        parcel.writeInt(this.f51353v ? 1 : 0);
        parcel.writeInt(this.f51354w ? 1 : 0);
        parcel.writeInt(this.f51355x ? 1 : 0);
    }

    public PersonalizeVideo(String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "channelId");
        this.f51347p = str;
        this.f51348q = str2;
        this.f51349r = z11;
        this.f51350s = z12;
        this.f51351t = z13;
        this.f51352u = z14;
        this.f51353v = z15;
        this.f51354w = z16;
        this.f51355x = z17;
    }
}
