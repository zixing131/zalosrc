package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$$serializer;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Banner;
import com.zing.zalo.shortvideo.p072ui.model.Button;
import com.zing.zalo.shortvideo.p072ui.model.Ended;
import com.zing.zalo.shortvideo.p072ui.model.Ended$$serializer;
import com.zing.zalo.shortvideo.p072ui.model.Tag;
import com.zing.zalo.shortvideo.p072ui.model.Tag$$serializer;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25332a0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoAdsData implements Parcelable {

    /* renamed from: A */
    private final String f50012A;

    /* renamed from: B */
    private final String f50013B;

    /* renamed from: C */
    private final boolean f50014C;

    /* renamed from: D */
    private final List f50015D;

    /* renamed from: p */
    private final int f50016p;

    /* renamed from: q */
    private final int f50017q;

    /* renamed from: r */
    private final int f50018r;

    /* renamed from: s */
    private final String f50019s;

    /* renamed from: t */
    private final String f50020t;

    /* renamed from: u */
    private final VideoData f50021u;

    /* renamed from: v */
    private final Tag f50022v;

    /* renamed from: w */
    private final long f50023w;

    /* renamed from: x */
    private final com.zing.zalo.shortvideo.p072ui.model.Action f50024x;

    /* renamed from: y */
    private final com.zing.zalo.shortvideo.p072ui.model.Action f50025y;

    /* renamed from: z */
    private final Ended f50026z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoAdsData> CREATOR = new C9434a();

    /* renamed from: E */
    private static final KSerializer[] f50011E = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(BottomSheetItem$$serializer.INSTANCE)};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoAdsData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.VideoAdsData$a */
    /* loaded from: classes5.dex */
    public static final class C9434a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoAdsData createFromParcel(Parcel parcel) {
            boolean z11;
            ArrayList arrayList;
            String str;
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            VideoData createFromParcel = VideoData.CREATOR.createFromParcel(parcel);
            Tag createFromParcel2 = Tag.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            com.zing.zalo.shortvideo.p072ui.model.Action createFromParcel3 = parcel.readInt() == 0 ? null : com.zing.zalo.shortvideo.p072ui.model.Action.CREATOR.createFromParcel(parcel);
            com.zing.zalo.shortvideo.p072ui.model.Action createFromParcel4 = com.zing.zalo.shortvideo.p072ui.model.Action.CREATOR.createFromParcel(parcel);
            Ended createFromParcel5 = parcel.readInt() == 0 ? null : Ended.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z11 = z12;
                arrayList = null;
                str = readString3;
            } else {
                int readInt4 = parcel.readInt();
                z11 = z12;
                arrayList = new ArrayList(readInt4);
                str = readString3;
                int i11 = 0;
                while (i11 != readInt4) {
                    arrayList.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt4 = readInt4;
                }
            }
            return new VideoAdsData(readInt, readInt2, readInt3, readString, readString2, createFromParcel, createFromParcel2, readLong, createFromParcel3, createFromParcel4, createFromParcel5, str, readString4, z11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoAdsData[] newArray(int i11) {
            return new VideoAdsData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.VideoAdsData$b */
    /* loaded from: classes5.dex */
    public static final class C9435b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f50027a = VideoAdsData.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.VideoAdsData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final VideoAdsData m51282a(JsonObject jsonObject) {
                Ended ended;
                String str;
                Tag tag;
                Ended ended2;
                com.zing.zalo.shortvideo.p072ui.model.Action action;
                Banner banner;
                Button button;
                List list;
                Banner banner2;
                Button button2;
                AbstractC19074t.m100208f(jsonObject, "json");
                JsonObject m51732m = AbstractC9465b.m51732m(jsonObject, "tag");
                Tag tag2 = new Tag(AbstractC9465b.m51740u(m51732m, "text"), AbstractC9465b.m51724e(m51732m, "textColor"), AbstractC9465b.m51724e(m51732m, "backgroundColor"));
                JsonObject m51733n = AbstractC9465b.m51733n(jsonObject, "ended");
                if (m51733n != null) {
                    ended = new Ended(AbstractC9465b.m51743x(m51733n, "thumb"), AbstractC9465b.m51743x(m51733n, "title"), AbstractC9465b.m51743x(m51733n, "desc"), AbstractC9465b.m51740u(AbstractC9465b.m51732m(m51733n, "cta"), "actionLink"), AbstractC9465b.m51740u(AbstractC9465b.m51732m(m51733n, "cta"), "text"), AbstractC9465b.m51724e(AbstractC9465b.m51732m(m51733n, "cta"), "textColor"), AbstractC9465b.m51724e(AbstractC9465b.m51732m(m51733n, "cta"), "backgroundColor"));
                } else {
                    ended = null;
                }
                JsonObject m51733n2 = AbstractC9465b.m51733n(jsonObject, "actionBefore");
                if (m51733n2 == null) {
                    str = "textColor";
                    tag = tag2;
                    ended2 = ended;
                    action = null;
                } else {
                    JsonObject m51733n3 = AbstractC9465b.m51733n(m51733n2, "banner");
                    if (m51733n3 != null) {
                        banner2 = new Banner(AbstractC9465b.m51743x(m51733n3, "image"), AbstractC9465b.m51743x(m51733n3, "actionLink"));
                    } else {
                        banner2 = null;
                    }
                    JsonObject m51733n4 = AbstractC9465b.m51733n(m51733n2, "button");
                    if (m51733n4 == null) {
                        str = "textColor";
                        tag = tag2;
                        ended2 = ended;
                        button2 = null;
                    } else {
                        ended2 = ended;
                        tag = tag2;
                        str = "textColor";
                        button2 = new Button(AbstractC9465b.m51743x(m51733n4, "actionLink"), AbstractC9465b.m51743x(m51733n4, "text"), AbstractC9465b.m51724e(m51733n4, "textColor"), AbstractC9465b.m51724e(m51733n4, "backgroundColor"));
                    }
                    action = new com.zing.zalo.shortvideo.p072ui.model.Action(AbstractC9465b.m51728i(m51733n2, new String[]{ZinstantMetaConstant.IMPRESSION_META_TYPE}, 0, 2, null), banner2, button2);
                }
                JsonObject m51732m2 = AbstractC9465b.m51732m(jsonObject, "actionAfter");
                JsonObject m51733n5 = AbstractC9465b.m51733n(m51732m2, "banner");
                if (m51733n5 != null) {
                    banner = new Banner(AbstractC9465b.m51743x(m51733n5, "image"), AbstractC9465b.m51743x(m51733n5, "actionLink"));
                } else {
                    banner = null;
                }
                JsonObject m51733n6 = AbstractC9465b.m51733n(m51732m2, "button");
                if (m51733n6 != null) {
                    button = new Button(AbstractC9465b.m51743x(m51733n6, "actionLink"), AbstractC9465b.m51743x(m51733n6, "text"), AbstractC9465b.m51724e(m51733n6, str), AbstractC9465b.m51724e(m51733n6, "backgroundColor"));
                } else {
                    button = null;
                }
                com.zing.zalo.shortvideo.p072ui.model.Action action2 = new com.zing.zalo.shortvideo.p072ui.model.Action(AbstractC9465b.m51728i(m51732m2, new String[]{ZinstantMetaConstant.IMPRESSION_META_TYPE}, 0, 2, null), banner, button);
                JsonArray m51731l = AbstractC9465b.m51731l(jsonObject, "adBtSheet");
                if (m51731l != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<JsonElement> it = m51731l.iterator();
                    while (it.hasNext()) {
                        BottomSheetItem m51416a = BottomSheetItem.Companion.m51416a(AbstractC27331i.m139916m(it.next()));
                        if (m51416a == null || !m51416a.isValid()) {
                            m51416a = null;
                        }
                        if (m51416a != null) {
                            arrayList.add(m51416a);
                        }
                    }
                    list = AbstractC25332a0.m131185M0(arrayList);
                } else {
                    list = null;
                }
                return new VideoAdsData(AbstractC9465b.m51728i(jsonObject, new String[]{"index"}, 0, 2, null), AbstractC9465b.m51728i(jsonObject, new String[]{"adType"}, 0, 2, null), AbstractC9465b.m51728i(jsonObject, new String[]{"templateId"}, 0, 2, null), AbstractC9465b.m51743x(jsonObject, "adId"), AbstractC9465b.m51743x(jsonObject, "adSrc"), VideoData.C9437b.Companion.m51386a(AbstractC9465b.m51732m(jsonObject, "video")), tag, AbstractC9465b.m51735p(AbstractC9465b.m51732m(jsonObject, "config"), new String[]{"watchTimeMillis"}, 3000L), action, action2, ended2, AbstractC9465b.m51743x(jsonObject, "shareURL"), AbstractC9465b.m51743x(jsonObject, "reportURL"), AbstractC9465b.m51723d(jsonObject, new String[]{"isForce"}, false, 2, null), list);
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoAdsData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m51282a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, VideoAdsData videoAdsData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(videoAdsData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50027a;
        }
    }

    public /* synthetic */ VideoAdsData(int i11, int i12, int i13, int i14, String str, String str2, VideoData videoData, Tag tag, long j11, com.zing.zalo.shortvideo.p072ui.model.Action action, com.zing.zalo.shortvideo.p072ui.model.Action action2, Ended ended, String str3, String str4, boolean z11, List list, AbstractC26805k1 abstractC26805k1) {
        if (32767 != (i11 & 32767)) {
            AbstractC26774a1.m137800b(i11, 32767, VideoAdsData$$serializer.INSTANCE.getDescriptor());
        }
        this.f50016p = i12;
        this.f50017q = i13;
        this.f50018r = i14;
        this.f50019s = str;
        this.f50020t = str2;
        this.f50021u = videoData;
        this.f50022v = tag;
        this.f50023w = j11;
        this.f50024x = action;
        this.f50025y = action2;
        this.f50026z = ended;
        this.f50012A = str3;
        this.f50013B = str4;
        this.f50014C = z11;
        this.f50015D = list;
    }

    /* renamed from: q */
    public static final /* synthetic */ void m51262q(VideoAdsData videoAdsData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50011E;
        interfaceC21886d.mo114033x(serialDescriptor, 0, videoAdsData.f50016p);
        interfaceC21886d.mo114033x(serialDescriptor, 1, videoAdsData.f50017q);
        interfaceC21886d.mo114033x(serialDescriptor, 2, videoAdsData.f50018r);
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26814n1, videoAdsData.f50019s);
        interfaceC21886d.mo114028h(serialDescriptor, 4, c26814n1, videoAdsData.f50020t);
        interfaceC21886d.mo114029i(serialDescriptor, 5, VideoData$$serializer.INSTANCE, videoAdsData.f50021u);
        interfaceC21886d.mo114029i(serialDescriptor, 6, Tag$$serializer.INSTANCE, videoAdsData.f50022v);
        interfaceC21886d.mo114022E(serialDescriptor, 7, videoAdsData.f50023w);
        com.zing.zalo.shortvideo.p072ui.model.Action$$serializer action$$serializer = com.zing.zalo.shortvideo.p072ui.model.Action$$serializer.INSTANCE;
        interfaceC21886d.mo114028h(serialDescriptor, 8, action$$serializer, videoAdsData.f50024x);
        interfaceC21886d.mo114029i(serialDescriptor, 9, action$$serializer, videoAdsData.f50025y);
        interfaceC21886d.mo114028h(serialDescriptor, 10, Ended$$serializer.INSTANCE, videoAdsData.f50026z);
        interfaceC21886d.mo114028h(serialDescriptor, 11, c26814n1, videoAdsData.f50012A);
        interfaceC21886d.mo114028h(serialDescriptor, 12, c26814n1, videoAdsData.f50013B);
        interfaceC21886d.mo114034y(serialDescriptor, 13, videoAdsData.f50014C);
        interfaceC21886d.mo114028h(serialDescriptor, 14, kSerializerArr[14], videoAdsData.f50015D);
    }

    /* renamed from: b */
    public final com.zing.zalo.shortvideo.p072ui.model.Action m51263b() {
        return this.f50025y;
    }

    /* renamed from: c */
    public final com.zing.zalo.shortvideo.p072ui.model.Action m51264c() {
        return this.f50024x;
    }

    /* renamed from: d */
    public final String m51265d() {
        return this.f50019s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m51266e() {
        return this.f50020t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdsData)) {
            return false;
        }
        VideoAdsData videoAdsData = (VideoAdsData) obj;
        return this.f50016p == videoAdsData.f50016p && this.f50017q == videoAdsData.f50017q && this.f50018r == videoAdsData.f50018r && AbstractC19074t.m100204b(this.f50019s, videoAdsData.f50019s) && AbstractC19074t.m100204b(this.f50020t, videoAdsData.f50020t) && AbstractC19074t.m100204b(this.f50021u, videoAdsData.f50021u) && AbstractC19074t.m100204b(this.f50022v, videoAdsData.f50022v) && this.f50023w == videoAdsData.f50023w && AbstractC19074t.m100204b(this.f50024x, videoAdsData.f50024x) && AbstractC19074t.m100204b(this.f50025y, videoAdsData.f50025y) && AbstractC19074t.m100204b(this.f50026z, videoAdsData.f50026z) && AbstractC19074t.m100204b(this.f50012A, videoAdsData.f50012A) && AbstractC19074t.m100204b(this.f50013B, videoAdsData.f50013B) && this.f50014C == videoAdsData.f50014C && AbstractC19074t.m100204b(this.f50015D, videoAdsData.f50015D);
    }

    /* renamed from: f */
    public final int m51267f() {
        return this.f50017q;
    }

    /* renamed from: g */
    public final List m51268g() {
        return this.f50015D;
    }

    /* renamed from: h */
    public final Ended m51269h() {
        return this.f50026z;
    }

    public int hashCode() {
        int i11 = ((((this.f50016p * 31) + this.f50017q) * 31) + this.f50018r) * 31;
        String str = this.f50019s;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50020t;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f50021u.hashCode()) * 31) + this.f50022v.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f50023w)) * 31;
        com.zing.zalo.shortvideo.p072ui.model.Action action = this.f50024x;
        int hashCode3 = (((hashCode2 + (action == null ? 0 : action.hashCode())) * 31) + this.f50025y.hashCode()) * 31;
        Ended ended = this.f50026z;
        int hashCode4 = (hashCode3 + (ended == null ? 0 : ended.hashCode())) * 31;
        String str3 = this.f50012A;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50013B;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + AbstractC2144f.m11520a(this.f50014C)) * 31;
        List list = this.f50015D;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: i */
    public final int m51270i() {
        return this.f50016p;
    }

    /* renamed from: j */
    public final String m51271j() {
        return this.f50013B;
    }

    /* renamed from: k */
    public final String m51272k() {
        return this.f50012A;
    }

    /* renamed from: l */
    public final Tag m51273l() {
        return this.f50022v;
    }

    /* renamed from: m */
    public final int m51274m() {
        return this.f50018r;
    }

    /* renamed from: n */
    public final VideoData m51275n() {
        return this.f50021u;
    }

    /* renamed from: o */
    public final long m51276o() {
        return this.f50023w;
    }

    /* renamed from: p */
    public final boolean m51277p() {
        return this.f50014C;
    }

    public String toString() {
        return "VideoAdsData(index=" + this.f50016p + ", adsType=" + this.f50017q + ", templateId=" + this.f50018r + ", adId=" + this.f50019s + ", adSrc=" + this.f50020t + ", video=" + this.f50021u + ", tag=" + this.f50022v + ", watchTimeChangeAction=" + this.f50023w + ", actionBefore=" + this.f50024x + ", actionAfter=" + this.f50025y + ", ended=" + this.f50026z + ", shareUrl=" + this.f50012A + ", reportURL=" + this.f50013B + ", isForce=" + this.f50014C + ", btSheet=" + this.f50015D + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f50016p);
        parcel.writeInt(this.f50017q);
        parcel.writeInt(this.f50018r);
        parcel.writeString(this.f50019s);
        parcel.writeString(this.f50020t);
        this.f50021u.writeToParcel(parcel, i11);
        this.f50022v.writeToParcel(parcel, i11);
        parcel.writeLong(this.f50023w);
        com.zing.zalo.shortvideo.p072ui.model.Action action = this.f50024x;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i11);
        }
        this.f50025y.writeToParcel(parcel, i11);
        Ended ended = this.f50026z;
        if (ended == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ended.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f50012A);
        parcel.writeString(this.f50013B);
        parcel.writeInt(this.f50014C ? 1 : 0);
        List list = this.f50015D;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BottomSheetItem) it.next()).writeToParcel(parcel, i11);
        }
    }

    public VideoAdsData(int i11, int i12, int i13, String str, String str2, VideoData videoData, Tag tag, long j11, com.zing.zalo.shortvideo.p072ui.model.Action action, com.zing.zalo.shortvideo.p072ui.model.Action action2, Ended ended, String str3, String str4, boolean z11, List list) {
        AbstractC19074t.m100208f(videoData, "video");
        AbstractC19074t.m100208f(tag, "tag");
        AbstractC19074t.m100208f(action2, "actionAfter");
        this.f50016p = i11;
        this.f50017q = i12;
        this.f50018r = i13;
        this.f50019s = str;
        this.f50020t = str2;
        this.f50021u = videoData;
        this.f50022v = tag;
        this.f50023w = j11;
        this.f50024x = action;
        this.f50025y = action2;
        this.f50026z = ended;
        this.f50012A = str3;
        this.f50013B = str4;
        this.f50014C = z11;
        this.f50015D = list;
    }
}
