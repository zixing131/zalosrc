package com.zing.zalo.shortvideo.data.remote.ws.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Comment;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class GetCommentLiveRes implements Parcelable {

    /* renamed from: p */
    private final List f50262p;

    /* renamed from: q */
    private final Integer f50263q;

    /* renamed from: r */
    private final Boolean f50264r;

    /* renamed from: s */
    private final Long f50265s;

    /* renamed from: t */
    private final Integer f50266t;

    /* renamed from: u */
    private final Long f50267u;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetCommentLiveRes> CREATOR = new C9451a();

    /* renamed from: v */
    private static final KSerializer[] f50261v = {new C26788f(GetCommentLiveRes$CommentData$$serializer.INSTANCE), null, null, null, null, null};

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class CommentData implements Parcelable {

        /* renamed from: p */
        private final Long f50268p;

        /* renamed from: q */
        private final Long f50269q;

        /* renamed from: r */
        private final String f50270r;

        /* renamed from: s */
        private final String f50271s;

        /* renamed from: t */
        private final Long f50272t;

        /* renamed from: u */
        private final Long f50273u;

        /* renamed from: v */
        private final Integer f50274v;

        /* renamed from: w */
        private final String f50275w;

        /* renamed from: x */
        private final Owner f50276x;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<CommentData> CREATOR = new C9449a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return GetCommentLiveRes$CommentData$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes$CommentData$a */
        /* loaded from: classes5.dex */
        public static final class C9449a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CommentData createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new CommentData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Owner.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CommentData[] newArray(int i11) {
                return new CommentData[i11];
            }
        }

        public /* synthetic */ CommentData(int i11, Long l11, Long l12, String str, String str2, Long l13, Long l14, Integer num, String str3, Owner owner, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f50268p = null;
            } else {
                this.f50268p = l11;
            }
            if ((i11 & 2) == 0) {
                this.f50269q = null;
            } else {
                this.f50269q = l12;
            }
            if ((i11 & 4) == 0) {
                this.f50270r = null;
            } else {
                this.f50270r = str;
            }
            if ((i11 & 8) == 0) {
                this.f50271s = null;
            } else {
                this.f50271s = str2;
            }
            if ((i11 & 16) == 0) {
                this.f50272t = null;
            } else {
                this.f50272t = l13;
            }
            if ((i11 & 32) == 0) {
                this.f50273u = null;
            } else {
                this.f50273u = l14;
            }
            if ((i11 & 64) == 0) {
                this.f50274v = null;
            } else {
                this.f50274v = num;
            }
            if ((i11 & 128) == 0) {
                this.f50275w = null;
            } else {
                this.f50275w = str3;
            }
            if ((i11 & 256) == 0) {
                this.f50276x = null;
            } else {
                this.f50276x = owner;
            }
        }

        /* renamed from: e */
        public static final /* synthetic */ void m51642e(CommentData commentData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || commentData.f50268p != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, commentData.f50268p);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || commentData.f50269q != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, commentData.f50269q);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || commentData.f50270r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, commentData.f50270r);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || commentData.f50271s != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, commentData.f50271s);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 4) || commentData.f50272t != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 4, C26810m0.f127024a, commentData.f50272t);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 5) || commentData.f50273u != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, commentData.f50273u);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 6) || commentData.f50274v != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 6, C26783d0.f126989a, commentData.f50274v);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 7) || commentData.f50275w != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, commentData.f50275w);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 8) || commentData.f50276x != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 8, GetCommentLiveRes$Owner$$serializer.INSTANCE, commentData.f50276x);
            }
        }

        /* renamed from: a */
        public final Long m51643a() {
            return this.f50268p;
        }

        /* renamed from: b */
        public final Long m51644b() {
            return this.f50269q;
        }

        /* renamed from: c */
        public final String m51645c() {
            return this.f50271s;
        }

        /* renamed from: d */
        public final C9440a m51646d(boolean z11) {
            Owner owner = this.f50276x;
            if (owner == null) {
                return null;
            }
            return new C9440a(String.valueOf(this.f50268p), owner.m51651a(), this.f50270r, this.f50271s, z11, false, 32, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommentData)) {
                return false;
            }
            CommentData commentData = (CommentData) obj;
            return AbstractC19074t.m100204b(this.f50268p, commentData.f50268p) && AbstractC19074t.m100204b(this.f50269q, commentData.f50269q) && AbstractC19074t.m100204b(this.f50270r, commentData.f50270r) && AbstractC19074t.m100204b(this.f50271s, commentData.f50271s) && AbstractC19074t.m100204b(this.f50272t, commentData.f50272t) && AbstractC19074t.m100204b(this.f50273u, commentData.f50273u) && AbstractC19074t.m100204b(this.f50274v, commentData.f50274v) && AbstractC19074t.m100204b(this.f50275w, commentData.f50275w) && AbstractC19074t.m100204b(this.f50276x, commentData.f50276x);
        }

        public int hashCode() {
            Long l11 = this.f50268p;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Long l12 = this.f50269q;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f50270r;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f50271s;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l13 = this.f50272t;
            int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.f50273u;
            int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Integer num = this.f50274v;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f50275w;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Owner owner = this.f50276x;
            return hashCode8 + (owner != null ? owner.hashCode() : 0);
        }

        public String toString() {
            return "CommentData(cmtId=" + this.f50268p + ", liveId=" + this.f50269q + ", content=" + this.f50270r + ", statusMsg=" + this.f50271s + ", likes=" + this.f50272t + ", createdTime=" + this.f50273u + ", attributes=" + this.f50274v + ", reportURL=" + this.f50275w + ", owner=" + this.f50276x + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            Long l11 = this.f50268p;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            Long l12 = this.f50269q;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l12.longValue());
            }
            parcel.writeString(this.f50270r);
            parcel.writeString(this.f50271s);
            Long l13 = this.f50272t;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l13.longValue());
            }
            Long l14 = this.f50273u;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l14.longValue());
            }
            Integer num = this.f50274v;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.f50275w);
            Owner owner = this.f50276x;
            if (owner == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                owner.writeToParcel(parcel, i11);
            }
        }

        public CommentData(Long l11, Long l12, String str, String str2, Long l13, Long l14, Integer num, String str3, Owner owner) {
            this.f50268p = l11;
            this.f50269q = l12;
            this.f50270r = str;
            this.f50271s = str2;
            this.f50272t = l13;
            this.f50273u = l14;
            this.f50274v = num;
            this.f50275w = str3;
            this.f50276x = owner;
        }

        public /* synthetic */ CommentData(Long l11, Long l12, String str, String str2, Long l13, Long l14, Integer num, String str3, Owner owner, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : l13, (i11 & 32) != 0 ? null : l14, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str3, (i11 & 256) == 0 ? owner : null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CommentData m51649a(long j11, Long l11, String str, Owner owner) {
            AbstractC19074t.m100208f(str, "content");
            AbstractC19074t.m100208f(owner, "owner");
            return new CommentData(Long.valueOf(j11), l11, str, (String) null, (Long) null, (Long) null, (Integer) null, (String) null, owner, 248, (AbstractC19060k) null);
        }

        public final KSerializer serializer() {
            return GetCommentLiveRes$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Owner implements Parcelable {

        /* renamed from: p */
        private final Long f50277p;

        /* renamed from: q */
        private final Integer f50278q;

        /* renamed from: r */
        private final Integer f50279r;

        /* renamed from: s */
        private final String f50280s;

        /* renamed from: t */
        private final String f50281t;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Owner> CREATOR = new C9450a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return GetCommentLiveRes$Owner$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes$Owner$a */
        /* loaded from: classes5.dex */
        public static final class C9450a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Owner createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Owner(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Owner[] newArray(int i11) {
                return new Owner[i11];
            }
        }

        public /* synthetic */ Owner(int i11, Long l11, Integer num, Integer num2, String str, String str2, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f50277p = null;
            } else {
                this.f50277p = l11;
            }
            if ((i11 & 2) == 0) {
                this.f50278q = null;
            } else {
                this.f50278q = num;
            }
            if ((i11 & 4) == 0) {
                this.f50279r = null;
            } else {
                this.f50279r = num2;
            }
            if ((i11 & 8) == 0) {
                this.f50280s = null;
            } else {
                this.f50280s = str;
            }
            if ((i11 & 16) == 0) {
                this.f50281t = null;
            } else {
                this.f50281t = str2;
            }
        }

        /* renamed from: b */
        public static final /* synthetic */ void m51650b(Owner owner, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || owner.f50277p != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, owner.f50277p);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || owner.f50278q != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26783d0.f126989a, owner.f50278q);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || owner.f50279r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, C26783d0.f126989a, owner.f50279r);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || owner.f50280s != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, owner.f50280s);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 4) || owner.f50281t != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, owner.f50281t);
            }
        }

        /* renamed from: a */
        public final Comment.Identity m51651a() {
            String str;
            int i11;
            Long l11 = this.f50277p;
            if (l11 == null || (str = l11.toString()) == null) {
                str = "";
            }
            String str2 = str;
            Integer num = this.f50278q;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            return new Comment.Identity(str2, i11, this.f50280s, this.f50281t, (String) null, (String) null, (String) null, (String) null, false, 496, (AbstractC19060k) null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            return AbstractC19074t.m100204b(this.f50277p, owner.f50277p) && AbstractC19074t.m100204b(this.f50278q, owner.f50278q) && AbstractC19074t.m100204b(this.f50279r, owner.f50279r) && AbstractC19074t.m100204b(this.f50280s, owner.f50280s) && AbstractC19074t.m100204b(this.f50281t, owner.f50281t);
        }

        public int hashCode() {
            Long l11 = this.f50277p;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Integer num = this.f50278q;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f50279r;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.f50280s;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f50281t;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Owner(id=" + this.f50277p + ", type=" + this.f50278q + ", attributes=" + this.f50279r + ", name=" + this.f50280s + ", avatar=" + this.f50281t + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            Long l11 = this.f50277p;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            Integer num = this.f50278q;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.f50279r;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.f50280s);
            parcel.writeString(this.f50281t);
        }

        public Owner(Long l11, Integer num, Integer num2, String str, String str2) {
            this.f50277p = l11;
            this.f50278q = num;
            this.f50279r = num2;
            this.f50280s = str;
            this.f50281t = str2;
        }

        public /* synthetic */ Owner(Long l11, Integer num, Integer num2, String str, String str2, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes$a */
    /* loaded from: classes5.dex */
    public static final class C9451a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetCommentLiveRes createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList2.add(CommentData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GetCommentLiveRes(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GetCommentLiveRes[] newArray(int i11) {
            return new GetCommentLiveRes[i11];
        }
    }

    public /* synthetic */ GetCommentLiveRes(int i11, List list, Integer num, Boolean bool, Long l11, Integer num2, Long l12, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50262p = null;
        } else {
            this.f50262p = list;
        }
        if ((i11 & 2) == 0) {
            this.f50263q = null;
        } else {
            this.f50263q = num;
        }
        if ((i11 & 4) == 0) {
            this.f50264r = null;
        } else {
            this.f50264r = bool;
        }
        if ((i11 & 8) == 0) {
            this.f50265s = null;
        } else {
            this.f50265s = l11;
        }
        if ((i11 & 16) == 0) {
            this.f50266t = null;
        } else {
            this.f50266t = num2;
        }
        if ((i11 & 32) == 0) {
            this.f50267u = null;
        } else {
            this.f50267u = l12;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m51637f(GetCommentLiveRes getCommentLiveRes, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50261v;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || getCommentLiveRes.f50262p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, kSerializerArr[0], getCommentLiveRes.f50262p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || getCommentLiveRes.f50263q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26783d0.f126989a, getCommentLiveRes.f50263q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || getCommentLiveRes.f50264r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26794h.f127000a, getCommentLiveRes.f50264r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || getCommentLiveRes.f50265s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, getCommentLiveRes.f50265s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || getCommentLiveRes.f50266t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26783d0.f126989a, getCommentLiveRes.f50266t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || getCommentLiveRes.f50267u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, getCommentLiveRes.f50267u);
        }
    }

    /* renamed from: b */
    public final List m51638b() {
        return this.f50262p;
    }

    /* renamed from: c */
    public final Long m51639c() {
        return this.f50265s;
    }

    /* renamed from: d */
    public final Integer m51640d() {
        return this.f50266t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long m51641e() {
        return this.f50267u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCommentLiveRes)) {
            return false;
        }
        GetCommentLiveRes getCommentLiveRes = (GetCommentLiveRes) obj;
        return AbstractC19074t.m100204b(this.f50262p, getCommentLiveRes.f50262p) && AbstractC19074t.m100204b(this.f50263q, getCommentLiveRes.f50263q) && AbstractC19074t.m100204b(this.f50264r, getCommentLiveRes.f50264r) && AbstractC19074t.m100204b(this.f50265s, getCommentLiveRes.f50265s) && AbstractC19074t.m100204b(this.f50266t, getCommentLiveRes.f50266t) && AbstractC19074t.m100204b(this.f50267u, getCommentLiveRes.f50267u);
    }

    public int hashCode() {
        List list = this.f50262p;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f50263q;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f50264r;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.f50265s;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num2 = this.f50266t;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.f50267u;
        return hashCode5 + (l12 != null ? l12.hashCode() : 0);
    }

    public String toString() {
        return "GetCommentLiveRes(items=" + this.f50262p + ", total=" + this.f50263q + ", hasMore=" + this.f50264r + ", lastId=" + this.f50265s + ", lastIndex=" + this.f50266t + ", liveId=" + this.f50267u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        List list = this.f50262p;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((CommentData) it.next()).writeToParcel(parcel, i11);
            }
        }
        Integer num = this.f50263q;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.f50264r;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l11 = this.f50265s;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Integer num2 = this.f50266t;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l12 = this.f50267u;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
    }

    public GetCommentLiveRes(List list, Integer num, Boolean bool, Long l11, Integer num2, Long l12) {
        this.f50262p = list;
        this.f50263q = num;
        this.f50264r = bool;
        this.f50265s = l11;
        this.f50266t = num2;
        this.f50267u = l12;
    }
}
