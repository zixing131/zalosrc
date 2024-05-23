package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$$serializer;
import com.zing.zalo.shortvideo.data.utils.AbstractC9464a;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.Video$$serializer;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;
import v00.C27417l;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Comment implements Parcelable {

    /* renamed from: A */
    private Comment f49784A;

    /* renamed from: B */
    private Section f49785B;

    /* renamed from: C */
    private long f49786C;

    /* renamed from: D */
    private String f49787D;

    /* renamed from: E */
    private Integer f49788E;

    /* renamed from: F */
    private List f49789F;

    /* renamed from: G */
    private Video f49790G;

    /* renamed from: H */
    private Boolean f49791H;

    /* renamed from: p */
    private String f49792p;

    /* renamed from: q */
    private final Identity f49793q;

    /* renamed from: r */
    private final String f49794r;

    /* renamed from: s */
    private Identity f49795s;

    /* renamed from: t */
    private String f49796t;

    /* renamed from: u */
    private String f49797u;

    /* renamed from: v */
    private boolean f49798v;

    /* renamed from: w */
    private boolean f49799w;

    /* renamed from: x */
    private long f49800x;

    /* renamed from: y */
    private long f49801y;

    /* renamed from: z */
    private String f49802z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Comment> CREATOR = new C9386a();

    /* renamed from: I */
    private static final KSerializer[] f49783I = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(BottomSheetItem$$serializer.INSTANCE), null, null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Comment$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Identity implements Parcelable {

        /* renamed from: p */
        private final String f49804p;

        /* renamed from: q */
        private final int f49805q;

        /* renamed from: r */
        private String f49806r;

        /* renamed from: s */
        private String f49807s;

        /* renamed from: t */
        private String f49808t;

        /* renamed from: u */
        private String f49809u;

        /* renamed from: v */
        private String f49810v;

        /* renamed from: w */
        private String f49811w;

        /* renamed from: x */
        private boolean f49812x;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Identity> CREATOR = new C9385a();

        /* renamed from: y */
        private static final Identity f49803y = new Identity("Unknown", 1, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 508, (AbstractC19060k) null);

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final Identity m50868a(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                Identity identity = new Identity(AbstractC9465b.m51740u(jsonObject, "id"), AbstractC9465b.m51728i(jsonObject, new String[]{ZinstantMetaConstant.IMPRESSION_META_TYPE}, 0, 2, null), AbstractC9465b.m51743x(jsonObject, "name"), AbstractC9465b.m51743x(jsonObject, "avatar"), (String) null, (String) null, (String) null, (String) null, false, 496, (AbstractC19060k) null);
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    if (AbstractC19074t.m100204b(key, "attributes")) {
                        AbstractC9465b.m51726g(value);
                    } else if (AbstractC19074t.m100204b(key, "verifyInfo")) {
                        JsonObject m139916m = AbstractC27331i.m139916m(value);
                        identity.m50867q(AbstractC9465b.m51743x(m139916m, "text"));
                        identity.m50864n(AbstractC9465b.m51743x(m139916m, "color"));
                        identity.m50865o(AbstractC9465b.m51743x(m139916m, "icon"));
                        identity.m50866p(AbstractC9465b.m51743x(m139916m, "link"));
                    }
                }
                return identity;
            }

            /* renamed from: b */
            public final Identity m50869b() {
                return Identity.f49803y;
            }

            public final KSerializer serializer() {
                return Comment$Identity$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.Comment$Identity$a */
        /* loaded from: classes5.dex */
        public static final class C9385a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Identity createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Identity(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Identity[] newArray(int i11) {
                return new Identity[i11];
            }
        }

        public /* synthetic */ Identity(int i11, String str, int i12, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, AbstractC26805k1 abstractC26805k1) {
            if (3 != (i11 & 3)) {
                AbstractC26774a1.m137800b(i11, 3, Comment$Identity$$serializer.INSTANCE.getDescriptor());
            }
            this.f49804p = str;
            this.f49805q = i12;
            if ((i11 & 4) == 0) {
                this.f49806r = null;
            } else {
                this.f49806r = str2;
            }
            if ((i11 & 8) == 0) {
                this.f49807s = null;
            } else {
                this.f49807s = str3;
            }
            if ((i11 & 16) == 0) {
                this.f49808t = null;
            } else {
                this.f49808t = str4;
            }
            if ((i11 & 32) == 0) {
                this.f49809u = null;
            } else {
                this.f49809u = str5;
            }
            if ((i11 & 64) == 0) {
                this.f49810v = null;
            } else {
                this.f49810v = str6;
            }
            if ((i11 & 128) == 0) {
                this.f49811w = null;
            } else {
                this.f49811w = str7;
            }
            if ((i11 & 256) == 0) {
                this.f49812x = false;
            } else {
                this.f49812x = z11;
            }
        }

        /* renamed from: t */
        public static final /* synthetic */ void m50851t(Identity identity, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, identity.f49804p);
            interfaceC21886d.mo114033x(serialDescriptor, 1, identity.f49805q);
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || identity.f49806r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, identity.f49806r);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || identity.f49807s != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, identity.f49807s);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 4) || identity.f49808t != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, identity.f49808t);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 5) || identity.f49809u != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, identity.f49809u);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 6) || identity.f49810v != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, identity.f49810v);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 7) || identity.f49811w != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, identity.f49811w);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 8) || identity.f49812x) {
                interfaceC21886d.mo114034y(serialDescriptor, 8, identity.f49812x);
            }
        }

        /* renamed from: b */
        public final Channel m50852b() {
            return new Channel(this.f49804p, (String) null, this.f49806r, this.f49807s, (String) null, (String) null, this.f49808t, this.f49809u, this.f49810v, this.f49811w, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -974, 2047, (AbstractC19060k) null);
        }

        /* renamed from: c */
        public final String m50853c() {
            return this.f49807s;
        }

        /* renamed from: d */
        public final String m50854d() {
            return this.f49804p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String m50855e() {
            return this.f49806r;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Identity)) {
                return false;
            }
            Identity identity = (Identity) obj;
            return AbstractC19074t.m100204b(this.f49804p, identity.f49804p) && this.f49805q == identity.f49805q && AbstractC19074t.m100204b(this.f49806r, identity.f49806r) && AbstractC19074t.m100204b(this.f49807s, identity.f49807s) && AbstractC19074t.m100204b(this.f49808t, identity.f49808t) && AbstractC19074t.m100204b(this.f49809u, identity.f49809u) && AbstractC19074t.m100204b(this.f49810v, identity.f49810v) && AbstractC19074t.m100204b(this.f49811w, identity.f49811w) && this.f49812x == identity.f49812x;
        }

        /* renamed from: f */
        public final int m50856f() {
            return this.f49805q;
        }

        /* renamed from: g */
        public final String m50857g() {
            return this.f49810v;
        }

        /* renamed from: h */
        public final boolean m50858h() {
            return this.f49812x;
        }

        public int hashCode() {
            int hashCode = ((this.f49804p.hashCode() * 31) + this.f49805q) * 31;
            String str = this.f49806r;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f49807s;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f49808t;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f49809u;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f49810v;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f49811w;
            return ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f49812x);
        }

        /* renamed from: i */
        public final boolean m50859i() {
            return this.f49805q == 2;
        }

        /* renamed from: j */
        public final boolean m50860j() {
            if (m50862l() && AbstractC19074t.m100204b(this.f49804p, C27417l.f129055a.m140378b().m51234g())) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public final boolean m50861k() {
            String str;
            if (m50859i()) {
                String str2 = this.f49804p;
                Channel m140377a = C27417l.f129055a.m140377a();
                if (m140377a != null) {
                    str = m140377a.m50769l();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str2, str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public final boolean m50862l() {
            return this.f49805q == 1;
        }

        /* renamed from: m */
        public final void m50863m(boolean z11) {
            this.f49812x = z11;
        }

        /* renamed from: n */
        public final void m50864n(String str) {
            this.f49809u = str;
        }

        /* renamed from: o */
        public final void m50865o(String str) {
            this.f49810v = str;
        }

        /* renamed from: p */
        public final void m50866p(String str) {
            this.f49811w = str;
        }

        /* renamed from: q */
        public final void m50867q(String str) {
            this.f49808t = str;
        }

        public String toString() {
            return "Identity(id=" + this.f49804p + ", type=" + this.f49805q + ", name=" + this.f49806r + ", avatar=" + this.f49807s + ", verifiedTitle=" + this.f49808t + ", verifiedColor=" + this.f49809u + ", verifiedIcon=" + this.f49810v + ", verifiedLink=" + this.f49811w + ", isBlocked=" + this.f49812x + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeString(this.f49804p);
            parcel.writeInt(this.f49805q);
            parcel.writeString(this.f49806r);
            parcel.writeString(this.f49807s);
            parcel.writeString(this.f49808t);
            parcel.writeString(this.f49809u);
            parcel.writeString(this.f49810v);
            parcel.writeString(this.f49811w);
            parcel.writeInt(this.f49812x ? 1 : 0);
        }

        public Identity(String str, int i11, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            this.f49804p = str;
            this.f49805q = i11;
            this.f49806r = str2;
            this.f49807s = str3;
            this.f49808t = str4;
            this.f49809u = str5;
            this.f49810v = str6;
            this.f49811w = str7;
            this.f49812x = z11;
        }

        public /* synthetic */ Identity(String str, int i11, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, int i12, AbstractC19060k abstractC19060k) {
            this(str, i11, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? false : z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Comment$a */
    /* loaded from: classes5.dex */
    public static final class C9386a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Comment createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            Parcelable.Creator<Identity> creator = Identity.CREATOR;
            Identity createFromParcel = creator.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Identity createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString5 = parcel.readString();
            Comment createFromParcel3 = parcel.readInt() == 0 ? null : Comment.CREATOR.createFromParcel(parcel);
            Section section = (Section) parcel.readParcelable(Comment.class.getClassLoader());
            long readLong3 = parcel.readLong();
            String readString6 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList2.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Comment(readString, createFromParcel, readString2, createFromParcel2, readString3, readString4, z11, z12, readLong, readLong2, readString5, createFromParcel3, section, readLong3, readString6, valueOf, arrayList, parcel.readInt() == 0 ? null : Video.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Comment[] newArray(int i11) {
            return new Comment[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Comment$b */
    /* loaded from: classes5.dex */
    public static final class C9387b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f49813a = Comment.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.Comment$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: com.zing.zalo.shortvideo.data.model.Comment$b$a$a */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32718a extends C19071q implements InterfaceC18505l {
                C32718a(Object obj) {
                    super(1, obj, a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/Comment;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h */
                public final Comment mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((a) this.f94922q).m50876a(jsonObject);
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final Comment m50876a(JsonObject jsonObject) {
                List m131185M0;
                AbstractC19074t.m100208f(jsonObject, "json");
                Comment comment = new Comment(AbstractC9465b.m51740u(jsonObject, "cmtId"), Identity.Companion.m50868a(AbstractC9465b.m51732m(jsonObject, "owner")), AbstractC9465b.m51742w(jsonObject, new String[]{"videoId"}, null, 2, null), (Identity) null, (String) null, (String) null, false, false, 0L, 0L, (String) null, (Comment) null, (Section) null, 0L, (String) null, (Integer) 0, (List) null, (Video) null, (Boolean) null, 491512, (AbstractC19060k) null);
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    switch (key.hashCode()) {
                        case -2070216145:
                            if (key.equals("statusMsg")) {
                                comment.m50820N(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case -650479410:
                            if (key.equals("replyCounts")) {
                                comment.m50822Q(AbstractC9465b.m51734o(value));
                                break;
                            } else {
                                break;
                            }
                        case -489909803:
                            if (key.equals("createdTime")) {
                                comment.m50816I(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -353339493:
                            if (key.equals("reportURL")) {
                                String m51739t = AbstractC9465b.m51739t(value);
                                if (m51739t.length() <= 0 || AbstractC19074t.m100204b(m51739t, "null")) {
                                    m51739t = null;
                                }
                                comment.m50826U(m51739t);
                                break;
                            } else {
                                break;
                            }
                        case -68055753:
                            if (key.equals("attachedVideo")) {
                                comment.m50812C(new Video(VideoData.C9437b.Companion.m51386a(AbstractC27331i.m139916m(value))));
                                break;
                            } else {
                                break;
                            }
                        case 102974396:
                            if (key.equals("likes")) {
                                comment.m50821O(AbstractC9465b.m51734o(value));
                                break;
                            } else {
                                break;
                            }
                        case 181879853:
                            if (key.equals("btSheet")) {
                                JsonArray m139915l = AbstractC27331i.m139915l(value);
                                ArrayList arrayList = new ArrayList();
                                Iterator<JsonElement> it = m139915l.iterator();
                                while (it.hasNext()) {
                                    BottomSheetItem m51416a = BottomSheetItem.Companion.m51416a(AbstractC27331i.m139916m(it.next()));
                                    if (m51416a == null || !m51416a.isValid()) {
                                        m51416a = null;
                                    }
                                    if (m51416a != null) {
                                        arrayList.add(m51416a);
                                    }
                                }
                                m131185M0 = AbstractC25332a0.m131185M0(arrayList);
                                comment.m50813D(m131185M0);
                                break;
                            } else {
                                break;
                            }
                        case 405645655:
                            if (key.equals("attributes")) {
                                int m51726g = AbstractC9465b.m51726g(value);
                                comment.m50818K(AbstractC9464a.m51718a(m51726g, 1));
                                comment.m50814F(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, 4)));
                                break;
                            } else {
                                break;
                            }
                        case 950345194:
                            if (key.equals("mention")) {
                                comment.m50819M(Identity.Companion.m50868a(AbstractC27331i.m139916m(value)));
                                break;
                            } else {
                                break;
                            }
                        case 951530617:
                            if (key.equals("content")) {
                                comment.m50815H(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 989151611:
                            if (key.equals("parentCmtId")) {
                                comment.m50823R(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 1094504712:
                            if (key.equals("replies")) {
                                comment.m50824S(AbstractC9465b.m51738s(value, new C32718a(this)));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return comment;
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public Comment deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m50876a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, Comment comment) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(comment, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49813a;
        }
    }

    public /* synthetic */ Comment(int i11, String str, Identity identity, String str2, Identity identity2, String str3, String str4, boolean z11, boolean z12, long j11, long j12, String str5, Comment comment, Section section, long j13, String str6, Integer num, List list, Video video, Boolean bool, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, Comment$$serializer.INSTANCE.getDescriptor());
        }
        this.f49792p = str;
        this.f49793q = identity;
        this.f49794r = str2;
        if ((i11 & 8) == 0) {
            this.f49795s = null;
        } else {
            this.f49795s = identity2;
        }
        if ((i11 & 16) == 0) {
            this.f49796t = null;
        } else {
            this.f49796t = str3;
        }
        if ((i11 & 32) == 0) {
            this.f49797u = null;
        } else {
            this.f49797u = str4;
        }
        if ((i11 & 64) == 0) {
            this.f49798v = false;
        } else {
            this.f49798v = z11;
        }
        if ((i11 & 128) == 0) {
            this.f49799w = false;
        } else {
            this.f49799w = z12;
        }
        if ((i11 & 256) == 0) {
            this.f49800x = 0L;
        } else {
            this.f49800x = j11;
        }
        if ((i11 & 512) == 0) {
            this.f49801y = 0L;
        } else {
            this.f49801y = j12;
        }
        if ((i11 & 1024) == 0) {
            this.f49802z = null;
        } else {
            this.f49802z = str5;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49784A = null;
        } else {
            this.f49784A = comment;
        }
        if ((i11 & 4096) == 0) {
            this.f49785B = null;
        } else {
            this.f49785B = section;
        }
        this.f49786C = (i11 & 8192) != 0 ? j13 : 0L;
        if ((i11 & 16384) == 0) {
            this.f49787D = null;
        } else {
            this.f49787D = str6;
        }
        if ((32768 & i11) == 0) {
            this.f49788E = null;
        } else {
            this.f49788E = num;
        }
        if ((65536 & i11) == 0) {
            this.f49789F = null;
        } else {
            this.f49789F = list;
        }
        if ((131072 & i11) == 0) {
            this.f49790G = null;
        } else {
            this.f49790G = video;
        }
        if ((i11 & 262144) == 0) {
            this.f49791H = null;
        } else {
            this.f49791H = bool;
        }
    }

    /* renamed from: W */
    public static final /* synthetic */ void m50809W(Comment comment, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49783I;
        interfaceC21886d.mo114035z(serialDescriptor, 0, comment.f49792p);
        Comment$Identity$$serializer comment$Identity$$serializer = Comment$Identity$$serializer.INSTANCE;
        interfaceC21886d.mo114029i(serialDescriptor, 1, comment$Identity$$serializer, comment.f49793q);
        interfaceC21886d.mo114035z(serialDescriptor, 2, comment.f49794r);
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || comment.f49795s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, comment$Identity$$serializer, comment.f49795s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || comment.f49796t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, comment.f49796t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || comment.f49797u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, comment.f49797u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || comment.f49798v) {
            interfaceC21886d.mo114034y(serialDescriptor, 6, comment.f49798v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || comment.f49799w) {
            interfaceC21886d.mo114034y(serialDescriptor, 7, comment.f49799w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || comment.f49800x != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 8, comment.f49800x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || comment.f49801y != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 9, comment.f49801y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || comment.f49802z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26814n1.f127034a, comment.f49802z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || comment.f49784A != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, Comment$$serializer.INSTANCE, comment.f49784A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || comment.f49785B != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 12, Section.CREATOR.serializer(Comment$$serializer.INSTANCE), comment.f49785B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || comment.f49786C != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 13, comment.f49786C);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || comment.f49787D != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 14, C26814n1.f127034a, comment.f49787D);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || comment.f49788E != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 15, C26783d0.f126989a, comment.f49788E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || comment.f49789F != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 16, kSerializerArr[16], comment.f49789F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || comment.f49790G != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 17, Video$$serializer.INSTANCE, comment.f49790G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || comment.f49791H != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 18, C26794h.f127000a, comment.f49791H);
        }
    }

    /* renamed from: B */
    public final void m50811B(PersonalizeComment personalizeComment) {
        AbstractC19074t.m100208f(personalizeComment, "comment");
        this.f49798v = personalizeComment.m51110c();
        this.f49793q.m50863m(personalizeComment.m51109b());
    }

    /* renamed from: C */
    public final void m50812C(Video video) {
        this.f49790G = video;
    }

    /* renamed from: D */
    public final void m50813D(List list) {
        this.f49789F = list;
    }

    /* renamed from: F */
    public final void m50814F(Boolean bool) {
        this.f49791H = bool;
    }

    /* renamed from: H */
    public final void m50815H(String str) {
        this.f49796t = str;
    }

    /* renamed from: I */
    public final void m50816I(long j11) {
        this.f49786C = j11;
    }

    /* renamed from: J */
    public final void m50817J(boolean z11) {
        this.f49798v = z11;
    }

    /* renamed from: K */
    public final void m50818K(boolean z11) {
        this.f49799w = z11;
    }

    /* renamed from: M */
    public final void m50819M(Identity identity) {
        this.f49795s = identity;
    }

    /* renamed from: N */
    public final void m50820N(String str) {
        this.f49797u = str;
    }

    /* renamed from: O */
    public final void m50821O(long j11) {
        this.f49800x = j11;
    }

    /* renamed from: Q */
    public final void m50822Q(long j11) {
        this.f49801y = j11;
    }

    /* renamed from: R */
    public final void m50823R(String str) {
        this.f49802z = str;
    }

    /* renamed from: S */
    public final void m50824S(Section section) {
        this.f49785B = section;
    }

    /* renamed from: T */
    public final void m50825T(Comment comment) {
        this.f49784A = comment;
    }

    /* renamed from: U */
    public final void m50826U(String str) {
        this.f49787D = str;
    }

    /* renamed from: V */
    public final void m50827V(Integer num) {
        this.f49788E = num;
    }

    /* renamed from: b */
    public final Video m50828b() {
        return this.f49790G;
    }

    /* renamed from: c */
    public final List m50829c() {
        return this.f49789F;
    }

    /* renamed from: d */
    public final Boolean m50830d() {
        return this.f49791H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m50831e() {
        return this.f49796t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        return AbstractC19074t.m100204b(this.f49792p, comment.f49792p) && AbstractC19074t.m100204b(this.f49793q, comment.f49793q) && AbstractC19074t.m100204b(this.f49794r, comment.f49794r) && AbstractC19074t.m100204b(this.f49795s, comment.f49795s) && AbstractC19074t.m100204b(this.f49796t, comment.f49796t) && AbstractC19074t.m100204b(this.f49797u, comment.f49797u) && this.f49798v == comment.f49798v && this.f49799w == comment.f49799w && this.f49800x == comment.f49800x && this.f49801y == comment.f49801y && AbstractC19074t.m100204b(this.f49802z, comment.f49802z) && AbstractC19074t.m100204b(this.f49784A, comment.f49784A) && AbstractC19074t.m100204b(this.f49785B, comment.f49785B) && this.f49786C == comment.f49786C && AbstractC19074t.m100204b(this.f49787D, comment.f49787D) && AbstractC19074t.m100204b(this.f49788E, comment.f49788E) && AbstractC19074t.m100204b(this.f49789F, comment.f49789F) && AbstractC19074t.m100204b(this.f49790G, comment.f49790G) && AbstractC19074t.m100204b(this.f49791H, comment.f49791H);
    }

    /* renamed from: f */
    public final long m50832f() {
        return this.f49786C;
    }

    /* renamed from: g */
    public final String m50833g() {
        return this.f49792p;
    }

    /* renamed from: h */
    public final Identity m50834h() {
        return this.f49795s;
    }

    public int hashCode() {
        int hashCode = ((((this.f49792p.hashCode() * 31) + this.f49793q.hashCode()) * 31) + this.f49794r.hashCode()) * 31;
        Identity identity = this.f49795s;
        int hashCode2 = (hashCode + (identity == null ? 0 : identity.hashCode())) * 31;
        String str = this.f49796t;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49797u;
        int hashCode4 = (((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + AbstractC2144f.m11520a(this.f49798v)) * 31) + AbstractC2144f.m11520a(this.f49799w)) * 31) + AbstractC2147g0.m11521a(this.f49800x)) * 31) + AbstractC2147g0.m11521a(this.f49801y)) * 31;
        String str3 = this.f49802z;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Comment comment = this.f49784A;
        int hashCode6 = (hashCode5 + (comment == null ? 0 : comment.hashCode())) * 31;
        Section section = this.f49785B;
        int hashCode7 = (((hashCode6 + (section == null ? 0 : section.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f49786C)) * 31;
        String str4 = this.f49787D;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f49788E;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f49789F;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Video video = this.f49790G;
        int hashCode11 = (hashCode10 + (video == null ? 0 : video.hashCode())) * 31;
        Boolean bool = this.f49791H;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m50835i() {
        return this.f49797u;
    }

    /* renamed from: j */
    public final long m50836j() {
        return this.f49800x;
    }

    /* renamed from: k */
    public final long m50837k() {
        return this.f49801y;
    }

    /* renamed from: l */
    public final Identity m50838l() {
        return this.f49793q;
    }

    /* renamed from: m */
    public final String m50839m() {
        return this.f49802z;
    }

    /* renamed from: n */
    public final Section m50840n() {
        return this.f49785B;
    }

    /* renamed from: o */
    public final Comment m50841o() {
        return this.f49784A;
    }

    /* renamed from: p */
    public final String m50842p() {
        return this.f49787D;
    }

    /* renamed from: q */
    public final Integer m50843q() {
        return this.f49788E;
    }

    /* renamed from: t */
    public final String m50844t() {
        return this.f49794r;
    }

    public String toString() {
        return "Comment(id=" + this.f49792p + ", owner=" + this.f49793q + ", sourceId=" + this.f49794r + ", mention=" + this.f49795s + ", content=" + this.f49796t + ", message=" + this.f49797u + ", isLiked=" + this.f49798v + ", isLikedByAuthor=" + this.f49799w + ", numOfLike=" + this.f49800x + ", numOfReply=" + this.f49801y + ", parentId=" + this.f49802z + ", reply=" + this.f49784A + ", replies=" + this.f49785B + ", createdTime=" + this.f49786C + ", reportURL=" + this.f49787D + ", sendingStatus=" + this.f49788E + ", btSheet=" + this.f49789F + ", attachVideo=" + this.f49790G + ", canPin=" + this.f49791H + ")";
    }

    /* renamed from: u */
    public final boolean m50845u() {
        String str = this.f49796t;
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m50846w() {
        boolean z11;
        String str = this.f49797u;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49792p);
        this.f49793q.writeToParcel(parcel, i11);
        parcel.writeString(this.f49794r);
        Identity identity = this.f49795s;
        if (identity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            identity.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f49796t);
        parcel.writeString(this.f49797u);
        parcel.writeInt(this.f49798v ? 1 : 0);
        parcel.writeInt(this.f49799w ? 1 : 0);
        parcel.writeLong(this.f49800x);
        parcel.writeLong(this.f49801y);
        parcel.writeString(this.f49802z);
        Comment comment = this.f49784A;
        if (comment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comment.writeToParcel(parcel, i11);
        }
        parcel.writeParcelable(this.f49785B, i11);
        parcel.writeLong(this.f49786C);
        parcel.writeString(this.f49787D);
        Integer num = this.f49788E;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List list = this.f49789F;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BottomSheetItem) it.next()).writeToParcel(parcel, i11);
            }
        }
        Video video = this.f49790G;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, i11);
        }
        Boolean bool = this.f49791H;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: x */
    public final boolean m50847x() {
        return this.f49798v;
    }

    /* renamed from: y */
    public final boolean m50848y() {
        return this.f49799w;
    }

    /* renamed from: z */
    public final boolean m50849z() {
        if (!this.f49793q.m50860j() && !this.f49793q.m50861k()) {
            return false;
        }
        return true;
    }

    public Comment(String str, Identity identity, String str2, Identity identity2, String str3, String str4, boolean z11, boolean z12, long j11, long j12, String str5, Comment comment, Section section, long j13, String str6, Integer num, List list, Video video, Boolean bool) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(identity, "owner");
        AbstractC19074t.m100208f(str2, "sourceId");
        this.f49792p = str;
        this.f49793q = identity;
        this.f49794r = str2;
        this.f49795s = identity2;
        this.f49796t = str3;
        this.f49797u = str4;
        this.f49798v = z11;
        this.f49799w = z12;
        this.f49800x = j11;
        this.f49801y = j12;
        this.f49802z = str5;
        this.f49784A = comment;
        this.f49785B = section;
        this.f49786C = j13;
        this.f49787D = str6;
        this.f49788E = num;
        this.f49789F = list;
        this.f49790G = video;
        this.f49791H = bool;
    }

    public /* synthetic */ Comment(String str, Identity identity, String str2, Identity identity2, String str3, String str4, boolean z11, boolean z12, long j11, long j12, String str5, Comment comment, Section section, long j13, String str6, Integer num, List list, Video video, Boolean bool, int i11, AbstractC19060k abstractC19060k) {
        this(str, identity, str2, (i11 & 8) != 0 ? null : identity2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? false : z12, (i11 & 256) != 0 ? 0L : j11, (i11 & 512) != 0 ? 0L : j12, (i11 & 1024) != 0 ? null : str5, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : comment, (i11 & 4096) != 0 ? null : section, (i11 & 8192) != 0 ? 0L : j13, (i11 & 16384) != 0 ? null : str6, (32768 & i11) != 0 ? null : num, (65536 & i11) != 0 ? null : list, (131072 & i11) != 0 ? null : video, (i11 & 262144) != 0 ? null : bool);
    }
}
