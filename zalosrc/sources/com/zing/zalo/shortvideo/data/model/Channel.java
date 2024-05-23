package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
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
import java.util.Arrays;
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
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public class Channel implements Parcelable {

    /* renamed from: A */
    private String f49732A;

    /* renamed from: B */
    private long f49733B;

    /* renamed from: C */
    private long f49734C;

    /* renamed from: D */
    private long f49735D;

    /* renamed from: E */
    private long f49736E;

    /* renamed from: F */
    private long f49737F;

    /* renamed from: G */
    private long f49738G;

    /* renamed from: H */
    private long f49739H;

    /* renamed from: I */
    private long f49740I;

    /* renamed from: J */
    private boolean f49741J;

    /* renamed from: K */
    private boolean f49742K;

    /* renamed from: L */
    private boolean f49743L;

    /* renamed from: M */
    private boolean f49744M;

    /* renamed from: N */
    private boolean f49745N;

    /* renamed from: O */
    private boolean f49746O;

    /* renamed from: P */
    private Boolean f49747P;

    /* renamed from: Q */
    private Long f49748Q;

    /* renamed from: R */
    private Long f49749R;

    /* renamed from: S */
    private Long f49750S;

    /* renamed from: T */
    private Long f49751T;

    /* renamed from: U */
    private String f49752U;

    /* renamed from: V */
    private Section f49753V;

    /* renamed from: W */
    private String f49754W;

    /* renamed from: X */
    private Footer f49755X;

    /* renamed from: Y */
    private Boolean f49756Y;

    /* renamed from: Z */
    private List f49757Z;

    /* renamed from: a0 */
    private Boolean f49758a0;

    /* renamed from: b0 */
    private String f49759b0;

    /* renamed from: c0 */
    private List f49760c0;

    /* renamed from: d0 */
    private List f49761d0;

    /* renamed from: e0 */
    private List f49762e0;

    /* renamed from: f0 */
    private List f49763f0;

    /* renamed from: p */
    private final String f49764p;

    /* renamed from: q */
    private final String f49765q;

    /* renamed from: r */
    private String f49766r;

    /* renamed from: s */
    private String f49767s;

    /* renamed from: t */
    private String f49768t;

    /* renamed from: u */
    private String f49769u;

    /* renamed from: v */
    private String f49770v;

    /* renamed from: w */
    private String f49771w;

    /* renamed from: x */
    private String f49772x;

    /* renamed from: y */
    private String f49773y;

    /* renamed from: z */
    private String f49774z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Channel> CREATOR = new C9381a();

    /* renamed from: g0 */
    private static final KSerializer[] f49731g0 = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Section.CREATOR.serializer(Video$$serializer.INSTANCE), null, null, null, new C26788f(BottomSheetItem$$serializer.INSTANCE), null, null, new C26788f(CtaItem$$serializer.INSTANCE), new C26788f(SimilarChannel$$serializer.INSTANCE), new C26788f(Stats$$serializer.INSTANCE), new C26788f(LivestreamData$$serializer.INSTANCE)};

    /* loaded from: classes5.dex */
    public static final class Anonymous extends Channel {

        /* renamed from: h0 */
        public static final Anonymous f49775h0 = new Anonymous();

        private Anonymous() {
            super("-1", "null", "Anonymous", "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -16, 2047, (AbstractC19060k) null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Channel$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Channel$a */
    /* loaded from: classes5.dex */
    public static final class C9381a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Channel createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z11;
            ArrayList arrayList;
            long j11;
            Boolean valueOf3;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            long readLong6 = parcel.readLong();
            long readLong7 = parcel.readLong();
            long readLong8 = parcel.readLong();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString13 = parcel.readString();
            Section section = (Section) parcel.readParcelable(Channel.class.getClassLoader());
            String readString14 = parcel.readString();
            Footer createFromParcel = parcel.readInt() == 0 ? null : Footer.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                z11 = z12;
                j11 = readLong;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                z11 = z12;
                arrayList = new ArrayList(readInt);
                j11 = readLong;
                int i11 = 0;
                while (i11 != readInt) {
                    arrayList.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt = readInt;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt2);
                arrayList2 = arrayList;
                int i12 = 0;
                while (i12 != readInt2) {
                    arrayList10.add(CtaItem.CREATOR.createFromParcel(parcel));
                    i12++;
                    readInt2 = readInt2;
                }
                arrayList3 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt3);
                arrayList4 = arrayList3;
                int i13 = 0;
                while (i13 != readInt3) {
                    arrayList11.add(SimilarChannel.CREATOR.createFromParcel(parcel));
                    i13++;
                    readInt3 = readInt3;
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList7 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(readInt4);
                arrayList6 = arrayList5;
                int i14 = 0;
                while (i14 != readInt4) {
                    arrayList12.add(Stats.CREATOR.createFromParcel(parcel));
                    i14++;
                    readInt4 = readInt4;
                }
                arrayList7 = arrayList12;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList7;
                arrayList9 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(readInt5);
                arrayList8 = arrayList7;
                int i15 = 0;
                while (i15 != readInt5) {
                    arrayList13.add(LivestreamData.CREATOR.createFromParcel(parcel));
                    i15++;
                    readInt5 = readInt5;
                }
                arrayList9 = arrayList13;
            }
            return new Channel(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, j11, readLong2, readLong3, readLong4, readLong5, readLong6, readLong7, readLong8, z11, z13, z14, z15, z16, z17, valueOf, valueOf4, valueOf5, valueOf6, valueOf7, readString13, section, readString14, createFromParcel, valueOf2, arrayList2, valueOf3, readString15, arrayList4, arrayList6, arrayList8, arrayList9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Channel[] newArray(int i11) {
            return new Channel[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Channel$b */
    /* loaded from: classes5.dex */
    public static final class C9382b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: b */
        private static final String[] f49776b = {"channelId", "id", "channel_profile_id"};

        /* renamed from: a */
        private final SerialDescriptor f49777a = Channel.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.Channel$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: com.zing.zalo.shortvideo.data.model.Channel$b$a$a */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32717a extends C19071q implements InterfaceC18505l {
                C32717a(Object obj) {
                    super(1, obj, VideoData.C9437b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/VideoData;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h */
                public final VideoData mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((VideoData.C9437b.a) this.f94922q).m51386a(jsonObject);
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final Channel m50798a(JsonObject jsonObject) {
                Action action;
                int m131511r;
                List m131187O0;
                List m131185M0;
                List m131187O02;
                List m131185M02;
                List m131187O03;
                AbstractC19074t.m100208f(jsonObject, "json");
                String[] m50799b = m50799b();
                Channel channel = new Channel(AbstractC9465b.m51740u(jsonObject, (String[]) Arrays.copyOf(m50799b, m50799b.length)), AbstractC9465b.m51742w(jsonObject, new String[]{"encodeId"}, null, 2, null), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -4, 2047, (AbstractC19060k) null);
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    switch (key.hashCode()) {
                        case -2090050568:
                            if (key.equals("subTitle")) {
                                channel.m50726F0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case -1897155973:
                            if (key.equals("statURL")) {
                                String m51739t = AbstractC9465b.m51739t(value);
                                if (m51739t.length() <= 0 || AbstractC19074t.m100204b(m51739t, "null")) {
                                    m51739t = null;
                                }
                                channel.m50723D0(m51739t);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -1405959847:
                            if (key.equals("avatar")) {
                                channel.m50748X(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case -1268861541:
                            if (key.equals("footer")) {
                                JsonObject m139916m = AbstractC27331i.m139916m(value);
                                Long m51737r = AbstractC9465b.m51737r(m139916m, "timeoutMillis");
                                JsonObject m51733n = AbstractC9465b.m51733n(m139916m, "action");
                                if (m51733n != null) {
                                    action = new Action(AbstractC9465b.m51743x(m51733n, "title"), Integer.valueOf(AbstractC9465b.m51728i(m51733n, new String[]{ZinstantMetaConstant.IMPRESSION_META_TYPE}, 0, 2, null)));
                                } else {
                                    action = null;
                                }
                                channel.m50772m0(new Footer(AbstractC9465b.m51743x(m139916m, "thumb"), AbstractC9465b.m51743x(m139916m, "title"), m51737r, action));
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case -1086816731:
                            if (key.equals("changeBioTime")) {
                                channel.m50757e0(Long.valueOf(AbstractC9465b.m51726g(value) * 1000));
                                break;
                            } else {
                                break;
                            }
                        case -1059207406:
                            if (key.equals("timeJoinRoom")) {
                                channel.m50727G0(AbstractC9465b.m51734o(value));
                                break;
                            } else {
                                break;
                            }
                        case -1033339705:
                            if (key.equals("verifyInfo")) {
                                JsonObject m139916m2 = AbstractC27331i.m139916m(value);
                                channel.m50736L0(AbstractC9465b.m51743x(m139916m2, "text"));
                                channel.m50731I0(AbstractC9465b.m51743x(m139916m2, "color"));
                                channel.m50733J0(AbstractC9465b.m51743x(m139916m2, "icon"));
                                channel.m50735K0(AbstractC9465b.m51743x(m139916m2, "link"));
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case -816678056:
                            if (key.equals("videos")) {
                                Section m51738s = AbstractC9465b.m51738s(value, new C32717a(VideoData.C9437b.Companion));
                                List m51168m = m51738s.m51168m();
                                m131511r = AbstractC25370t.m131511r(m51168m, 10);
                                ArrayList arrayList = new ArrayList(m131511r);
                                Iterator it = m51168m.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new Video((VideoData) it.next()));
                                }
                                channel.m50738M0(new Section(arrayList, m51738s.m51170o(), m51738s.m51169n()));
                                break;
                            } else {
                                break;
                            }
                        case -743769840:
                            if (key.equals("shareURL")) {
                                String m51739t2 = AbstractC9465b.m51739t(value);
                                if (m51739t2.length() <= 0 || AbstractC19074t.m100204b(m51739t2, "null")) {
                                    m51739t2 = null;
                                }
                                channel.m50719B0(m51739t2);
                                break;
                            } else {
                                break;
                            }
                        case -489909803:
                            if (key.equals("createdTime")) {
                                channel.m50762h0(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -439267705:
                            if (key.equals("livestreams")) {
                                JsonArray m139915l = AbstractC27331i.m139915l(value);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<JsonElement> it2 = m139915l.iterator();
                                while (it2.hasNext()) {
                                    LivestreamData m51040a = LivestreamData.C9405b.Companion.m51040a(AbstractC27331i.m139916m(it2.next()));
                                    m51040a.m51007Z("channel_profile_full");
                                    arrayList2.add(m51040a);
                                }
                                m131187O0 = AbstractC25332a0.m131187O0(arrayList2);
                                channel.m50774n0(m131187O0);
                                C24848g0 c24848g03 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case -353339493:
                            if (key.equals("reportURL")) {
                                String m51739t3 = AbstractC9465b.m51739t(value);
                                if (m51739t3.length() <= 0 || AbstractC19074t.m100204b(m51739t3, "null")) {
                                    m51739t3 = null;
                                }
                                channel.m50717A0(m51739t3);
                                break;
                            } else {
                                break;
                            }
                        case 97544:
                            if (key.equals("bio")) {
                                channel.m50749Y(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 98832:
                            if (key.equals("cta")) {
                                JsonArray m139915l2 = AbstractC27331i.m139915l(value);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<JsonElement> it3 = m139915l2.iterator();
                                while (it3.hasNext()) {
                                    CtaItem m50910a = CtaItem.Companion.m50910a(AbstractC27331i.m139916m(it3.next()));
                                    if (m50910a != null) {
                                        arrayList3.add(m50910a);
                                    }
                                }
                                m131185M0 = AbstractC25332a0.m131185M0(arrayList3);
                                channel.m50764i0(m131185M0);
                                C24848g0 c24848g04 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 3373707:
                            if (key.equals("name")) {
                                channel.m50780q0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 3540564:
                            if (key.equals("stat")) {
                                JsonObject m139916m3 = AbstractC27331i.m139916m(value);
                                channel.m50789x0(AbstractC9465b.m51736q(m139916m3, new String[]{"videos"}, 0L, 2, null));
                                channel.m50783t0(AbstractC9465b.m51736q(m139916m3, new String[]{"followers"}, 0L, 2, null));
                                channel.m50792z0(AbstractC9465b.m51736q(m139916m3, new String[]{"views"}, 0L, 2, null));
                                channel.m50785u0(AbstractC9465b.m51736q(m139916m3, new String[]{"likes"}, 0L, 2, null));
                                channel.m50781r0(AbstractC9465b.m51736q(m139916m3, new String[]{"cmts"}, 0L, 2, null));
                                channel.m50786v0(AbstractC9465b.m51736q(m139916m3, new String[]{"shares"}, 0L, 2, null));
                                C24848g0 c24848g05 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 56641430:
                            if (key.equals("changeAvatarTime")) {
                                channel.m50753b0(Long.valueOf(AbstractC9465b.m51726g(value) * 1000));
                                break;
                            } else {
                                break;
                            }
                        case 92902992:
                            if (key.equals("alias")) {
                                channel.m50745U(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 109757599:
                            if (key.equals("stats")) {
                                JsonArray m139915l3 = AbstractC27331i.m139915l(value);
                                ArrayList arrayList4 = new ArrayList();
                                Iterator<JsonElement> it4 = m139915l3.iterator();
                                while (it4.hasNext()) {
                                    Stats m51217a = Stats.Companion.m51217a(AbstractC27331i.m139916m(it4.next()));
                                    if (m51217a != null) {
                                        arrayList4.add(m51217a);
                                    }
                                }
                                m131187O02 = AbstractC25332a0.m131187O0(arrayList4);
                                channel.m50724E0(m131187O02);
                                C24848g0 c24848g06 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 181879853:
                            if (key.equals("btSheet")) {
                                JsonArray m139915l4 = AbstractC27331i.m139915l(value);
                                ArrayList arrayList5 = new ArrayList();
                                Iterator<JsonElement> it5 = m139915l4.iterator();
                                while (it5.hasNext()) {
                                    BottomSheetItem m51416a = BottomSheetItem.Companion.m51416a(AbstractC27331i.m139916m(it5.next()));
                                    if (m51416a == null || !m51416a.isValid()) {
                                        m51416a = null;
                                    }
                                    if (m51416a != null) {
                                        arrayList5.add(m51416a);
                                    }
                                }
                                m131185M02 = AbstractC25332a0.m131185M0(arrayList5);
                                channel.m50750Z(m131185M02);
                                C24848g0 c24848g07 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 405645655:
                            if (key.equals("attributes")) {
                                int m51726g = AbstractC9465b.m51726g(value);
                                channel.m50747W(!AbstractC9464a.m51718a(m51726g, 2));
                                channel.m50746V(!AbstractC9464a.m51718a(m51726g, 8));
                                channel.m50778p0(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, 128)));
                                channel.m50768k0(AbstractC9464a.m51718a(m51726g, 1024));
                                channel.m50776o0(AbstractC9464a.m51718a(m51726g, 4096));
                                channel.m50729H0(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, 65536)));
                                channel.m50766j0(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, 131072)));
                                C24848g0 c24848g08 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 935070332:
                            if (key.equals("isFollowingChannel")) {
                                channel.m50770l0(AbstractC9465b.m51721b(value));
                                break;
                            } else {
                                break;
                            }
                        case 1337714541:
                            if (key.equals("changeAliasTime")) {
                                channel.m50751a0(Long.valueOf(AbstractC9465b.m51726g(value) * 1000));
                                break;
                            } else {
                                break;
                            }
                        case 1555024840:
                            if (key.equals("changeNameTime")) {
                                channel.m50760g0(Long.valueOf(AbstractC9465b.m51726g(value) * 1000));
                                break;
                            } else {
                                break;
                            }
                        case 2000044763:
                            if (key.equals("similarChannels")) {
                                JsonArray m139915l5 = AbstractC27331i.m139915l(value);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator<JsonElement> it6 = m139915l5.iterator();
                                while (it6.hasNext()) {
                                    SimilarChannel m51210a = SimilarChannel.Companion.m51210a(AbstractC27331i.m139916m(it6.next()));
                                    if (m51210a != null) {
                                        arrayList6.add(m51210a);
                                    }
                                }
                                m131187O03 = AbstractC25332a0.m131187O0(arrayList6);
                                channel.m50721C0(m131187O03);
                                C24848g0 c24848g09 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return channel;
            }

            /* renamed from: b */
            public final String[] m50799b() {
                return C9382b.f49776b;
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: b */
        public Channel deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m50798a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: c */
        public void serialize(Encoder encoder, Channel channel) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(channel, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49777a;
        }
    }

    public /* synthetic */ Channel(int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Boolean bool, Long l11, Long l12, Long l13, Long l14, String str13, Section section, String str14, Footer footer, Boolean bool2, List list, Boolean bool3, String str15, List list2, List list3, List list4, List list5, AbstractC26805k1 abstractC26805k1) {
        if ((1 != (i11 & 1)) | false) {
            AbstractC26774a1.m137799a(new int[]{i11, i12}, new int[]{1, 0}, Channel$$serializer.INSTANCE.getDescriptor());
        }
        this.f49764p = str;
        this.f49765q = (i11 & 2) == 0 ? "" : str2;
        if ((i11 & 4) == 0) {
            this.f49766r = null;
        } else {
            this.f49766r = str3;
        }
        if ((i11 & 8) == 0) {
            this.f49767s = null;
        } else {
            this.f49767s = str4;
        }
        if ((i11 & 16) == 0) {
            this.f49768t = null;
        } else {
            this.f49768t = str5;
        }
        if ((i11 & 32) == 0) {
            this.f49769u = null;
        } else {
            this.f49769u = str6;
        }
        if ((i11 & 64) == 0) {
            this.f49770v = null;
        } else {
            this.f49770v = str7;
        }
        if ((i11 & 128) == 0) {
            this.f49771w = null;
        } else {
            this.f49771w = str8;
        }
        if ((i11 & 256) == 0) {
            this.f49772x = null;
        } else {
            this.f49772x = str9;
        }
        if ((i11 & 512) == 0) {
            this.f49773y = null;
        } else {
            this.f49773y = str10;
        }
        if ((i11 & 1024) == 0) {
            this.f49774z = null;
        } else {
            this.f49774z = str11;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49732A = null;
        } else {
            this.f49732A = str12;
        }
        if ((i11 & 4096) == 0) {
            this.f49733B = 0L;
        } else {
            this.f49733B = j11;
        }
        if ((i11 & 8192) == 0) {
            this.f49734C = 0L;
        } else {
            this.f49734C = j12;
        }
        if ((i11 & 16384) == 0) {
            this.f49735D = 0L;
        } else {
            this.f49735D = j13;
        }
        if ((32768 & i11) == 0) {
            this.f49736E = 0L;
        } else {
            this.f49736E = j14;
        }
        if ((65536 & i11) == 0) {
            this.f49737F = 0L;
        } else {
            this.f49737F = j15;
        }
        if ((131072 & i11) == 0) {
            this.f49738G = 0L;
        } else {
            this.f49738G = j16;
        }
        if ((262144 & i11) == 0) {
            this.f49739H = 0L;
        } else {
            this.f49739H = j17;
        }
        this.f49740I = (524288 & i11) != 0 ? j18 : 0L;
        if ((1048576 & i11) == 0) {
            this.f49741J = false;
        } else {
            this.f49741J = z11;
        }
        if ((2097152 & i11) == 0) {
            this.f49742K = false;
        } else {
            this.f49742K = z12;
        }
        if ((4194304 & i11) == 0) {
            this.f49743L = false;
        } else {
            this.f49743L = z13;
        }
        if ((8388608 & i11) == 0) {
            this.f49744M = false;
        } else {
            this.f49744M = z14;
        }
        if ((16777216 & i11) == 0) {
            this.f49745N = false;
        } else {
            this.f49745N = z15;
        }
        if ((33554432 & i11) == 0) {
            this.f49746O = false;
        } else {
            this.f49746O = z16;
        }
        this.f49747P = (67108864 & i11) == 0 ? Boolean.FALSE : bool;
        if ((134217728 & i11) == 0) {
            this.f49748Q = null;
        } else {
            this.f49748Q = l11;
        }
        if ((268435456 & i11) == 0) {
            this.f49749R = null;
        } else {
            this.f49749R = l12;
        }
        if ((536870912 & i11) == 0) {
            this.f49750S = null;
        } else {
            this.f49750S = l13;
        }
        if ((1073741824 & i11) == 0) {
            this.f49751T = null;
        } else {
            this.f49751T = l14;
        }
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.f49752U = null;
        } else {
            this.f49752U = str13;
        }
        if ((i12 & 1) == 0) {
            this.f49753V = null;
        } else {
            this.f49753V = section;
        }
        if ((i12 & 2) == 0) {
            this.f49754W = null;
        } else {
            this.f49754W = str14;
        }
        if ((i12 & 4) == 0) {
            this.f49755X = null;
        } else {
            this.f49755X = footer;
        }
        if ((i12 & 8) == 0) {
            this.f49756Y = null;
        } else {
            this.f49756Y = bool2;
        }
        if ((i12 & 16) == 0) {
            this.f49757Z = null;
        } else {
            this.f49757Z = list;
        }
        if ((i12 & 32) == 0) {
            this.f49758a0 = null;
        } else {
            this.f49758a0 = bool3;
        }
        if ((i12 & 64) == 0) {
            this.f49759b0 = null;
        } else {
            this.f49759b0 = str15;
        }
        if ((i12 & 128) == 0) {
            this.f49760c0 = null;
        } else {
            this.f49760c0 = list2;
        }
        if ((i12 & 256) == 0) {
            this.f49761d0 = null;
        } else {
            this.f49761d0 = list3;
        }
        if ((i12 & 512) == 0) {
            this.f49762e0 = null;
        } else {
            this.f49762e0 = list4;
        }
        if ((i12 & 1024) == 0) {
            this.f49763f0 = null;
        } else {
            this.f49763f0 = list5;
        }
    }

    /* renamed from: N0 */
    public static final /* synthetic */ void m50715N0(Channel channel, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49731g0;
        interfaceC21886d.mo114035z(serialDescriptor, 0, channel.f49764p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(channel.f49765q, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, channel.f49765q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || channel.f49766r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, channel.f49766r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || channel.f49767s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, channel.f49767s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || channel.f49768t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, channel.f49768t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || channel.f49769u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, channel.f49769u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || channel.f49770v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, channel.f49770v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || channel.f49771w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, channel.f49771w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || channel.f49772x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26814n1.f127034a, channel.f49772x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || channel.f49773y != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26814n1.f127034a, channel.f49773y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || channel.f49774z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26814n1.f127034a, channel.f49774z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || channel.f49732A != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26814n1.f127034a, channel.f49732A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || channel.f49733B != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 12, channel.f49733B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || channel.f49734C != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 13, channel.f49734C);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || channel.f49735D != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 14, channel.f49735D);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || channel.f49736E != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 15, channel.f49736E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || channel.f49737F != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 16, channel.f49737F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || channel.f49738G != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 17, channel.f49738G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || channel.f49739H != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 18, channel.f49739H);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || channel.f49740I != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 19, channel.f49740I);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || channel.f49741J) {
            interfaceC21886d.mo114034y(serialDescriptor, 20, channel.f49741J);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || channel.f49742K) {
            interfaceC21886d.mo114034y(serialDescriptor, 21, channel.f49742K);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || channel.f49743L) {
            interfaceC21886d.mo114034y(serialDescriptor, 22, channel.f49743L);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 23) || channel.f49744M) {
            interfaceC21886d.mo114034y(serialDescriptor, 23, channel.f49744M);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 24) || channel.f49745N) {
            interfaceC21886d.mo114034y(serialDescriptor, 24, channel.f49745N);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 25) || channel.f49746O) {
            interfaceC21886d.mo114034y(serialDescriptor, 25, channel.f49746O);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 26) || !AbstractC19074t.m100204b(channel.f49747P, Boolean.FALSE)) {
            interfaceC21886d.mo114028h(serialDescriptor, 26, C26794h.f127000a, channel.f49747P);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 27) || channel.f49748Q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 27, C26810m0.f127024a, channel.f49748Q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 28) || channel.f49749R != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 28, C26810m0.f127024a, channel.f49749R);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 29) || channel.f49750S != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 29, C26810m0.f127024a, channel.f49750S);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 30) || channel.f49751T != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 30, C26810m0.f127024a, channel.f49751T);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 31) || channel.f49752U != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 31, C26814n1.f127034a, channel.f49752U);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 32) || channel.f49753V != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 32, kSerializerArr[32], channel.f49753V);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 33) || channel.f49754W != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 33, C26814n1.f127034a, channel.f49754W);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 34) || channel.f49755X != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 34, Footer$$serializer.INSTANCE, channel.f49755X);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 35) || channel.f49756Y != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 35, C26794h.f127000a, channel.f49756Y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 36) || channel.f49757Z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 36, kSerializerArr[36], channel.f49757Z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 37) || channel.f49758a0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 37, C26794h.f127000a, channel.f49758a0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 38) || channel.f49759b0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 38, C26814n1.f127034a, channel.f49759b0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 39) || channel.f49760c0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 39, kSerializerArr[39], channel.f49760c0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 40) || channel.f49761d0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 40, kSerializerArr[40], channel.f49761d0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 41) || channel.f49762e0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 41, kSerializerArr[41], channel.f49762e0);
        }
        if (!interfaceC21886d.mo114019A(serialDescriptor, 42) && channel.f49763f0 == null) {
            return;
        }
        interfaceC21886d.mo114028h(serialDescriptor, 42, kSerializerArr[42], channel.f49763f0);
    }

    /* renamed from: A0 */
    public final void m50717A0(String str) {
        this.f49754W = str;
    }

    /* renamed from: B */
    public final long m50718B() {
        return this.f49740I;
    }

    /* renamed from: B0 */
    public final void m50719B0(String str) {
        this.f49774z = str;
    }

    /* renamed from: C */
    public final Boolean m50720C() {
        return this.f49756Y;
    }

    /* renamed from: C0 */
    public final void m50721C0(List list) {
        this.f49761d0 = list;
    }

    /* renamed from: D */
    public final String m50722D() {
        return this.f49771w;
    }

    /* renamed from: D0 */
    public final void m50723D0(String str) {
        this.f49732A = str;
    }

    /* renamed from: E0 */
    public final void m50724E0(List list) {
        this.f49762e0 = list;
    }

    /* renamed from: F */
    public final String m50725F() {
        return this.f49772x;
    }

    /* renamed from: F0 */
    public final void m50726F0(String str) {
        this.f49759b0 = str;
    }

    /* renamed from: G0 */
    public final void m50727G0(long j11) {
        this.f49740I = j11;
    }

    /* renamed from: H */
    public final String m50728H() {
        return this.f49773y;
    }

    /* renamed from: H0 */
    public final void m50729H0(Boolean bool) {
        this.f49756Y = bool;
    }

    /* renamed from: I */
    public final String m50730I() {
        return this.f49770v;
    }

    /* renamed from: I0 */
    public final void m50731I0(String str) {
        this.f49771w = str;
    }

    /* renamed from: J */
    public final Section m50732J() {
        return this.f49753V;
    }

    /* renamed from: J0 */
    public final void m50733J0(String str) {
        this.f49772x = str;
    }

    /* renamed from: K */
    public final boolean m50734K() {
        return this.f49744M;
    }

    /* renamed from: K0 */
    public final void m50735K0(String str) {
        this.f49773y = str;
    }

    /* renamed from: L0 */
    public final void m50736L0(String str) {
        this.f49770v = str;
    }

    /* renamed from: M */
    public final boolean m50737M() {
        return this.f49743L;
    }

    /* renamed from: M0 */
    public final void m50738M0(Section section) {
        this.f49753V = section;
    }

    /* renamed from: N */
    public final boolean m50739N() {
        return this.f49742K;
    }

    /* renamed from: O */
    public final boolean m50740O() {
        return this.f49745N;
    }

    /* renamed from: Q */
    public final boolean m50741Q() {
        return this.f49741J;
    }

    /* renamed from: R */
    public final Boolean m50742R() {
        return this.f49747P;
    }

    /* renamed from: S */
    public final boolean m50743S() {
        return this.f49772x != null;
    }

    /* renamed from: T */
    public final void m50744T(PersonalizeChannel personalizeChannel) {
        AbstractC19074t.m100208f(personalizeChannel, "channel");
        this.f49741J = personalizeChannel.m51104c();
        this.f49742K = personalizeChannel.m51103b();
    }

    /* renamed from: U */
    public final void m50745U(String str) {
        this.f49752U = str;
    }

    /* renamed from: V */
    public final void m50746V(boolean z11) {
        this.f49744M = z11;
    }

    /* renamed from: W */
    public final void m50747W(boolean z11) {
        this.f49743L = z11;
    }

    /* renamed from: X */
    public final void m50748X(String str) {
        this.f49767s = str;
    }

    /* renamed from: Y */
    public final void m50749Y(String str) {
        this.f49768t = str;
    }

    /* renamed from: Z */
    public final void m50750Z(List list) {
        this.f49757Z = list;
    }

    /* renamed from: a0 */
    public final void m50751a0(Long l11) {
        this.f49750S = l11;
    }

    /* renamed from: b */
    public final String m50752b() {
        return this.f49752U;
    }

    /* renamed from: b0 */
    public final void m50753b0(Long l11) {
        this.f49748Q = l11;
    }

    /* renamed from: c */
    public final String m50754c() {
        return this.f49767s;
    }

    /* renamed from: d */
    public final String m50755d() {
        return this.f49768t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List m50756e() {
        return this.f49757Z;
    }

    /* renamed from: e0 */
    public final void m50757e0(Long l11) {
        this.f49751T = l11;
    }

    /* renamed from: f */
    public final Long m50758f() {
        return this.f49748Q;
    }

    /* renamed from: g */
    public final Long m50759g() {
        return this.f49751T;
    }

    /* renamed from: g0 */
    public final void m50760g0(Long l11) {
        this.f49749R = l11;
    }

    /* renamed from: h */
    public final Long m50761h() {
        return this.f49749R;
    }

    /* renamed from: h0 */
    public final void m50762h0(long j11) {
        this.f49739H = j11;
    }

    /* renamed from: i */
    public final List m50763i() {
        return this.f49760c0;
    }

    /* renamed from: i0 */
    public final void m50764i0(List list) {
        this.f49760c0 = list;
    }

    /* renamed from: j */
    public final Boolean m50765j() {
        return this.f49758a0;
    }

    /* renamed from: j0 */
    public final void m50766j0(Boolean bool) {
        this.f49758a0 = bool;
    }

    /* renamed from: k */
    public final Footer m50767k() {
        return this.f49755X;
    }

    /* renamed from: k0 */
    public final void m50768k0(boolean z11) {
        this.f49745N = z11;
    }

    /* renamed from: l */
    public final String m50769l() {
        return this.f49764p;
    }

    /* renamed from: l0 */
    public final void m50770l0(boolean z11) {
        this.f49741J = z11;
    }

    /* renamed from: m */
    public final List m50771m() {
        return this.f49763f0;
    }

    /* renamed from: m0 */
    public final void m50772m0(Footer footer) {
        this.f49755X = footer;
    }

    /* renamed from: n */
    public final boolean m50773n() {
        return this.f49746O;
    }

    /* renamed from: n0 */
    public final void m50774n0(List list) {
        this.f49763f0 = list;
    }

    /* renamed from: o */
    public final String m50775o() {
        return this.f49766r;
    }

    /* renamed from: o0 */
    public final void m50776o0(boolean z11) {
        this.f49746O = z11;
    }

    /* renamed from: p */
    public final long m50777p() {
        return this.f49734C;
    }

    /* renamed from: p0 */
    public final void m50778p0(Boolean bool) {
        this.f49747P = bool;
    }

    /* renamed from: q */
    public final long m50779q() {
        return this.f49736E;
    }

    /* renamed from: q0 */
    public final void m50780q0(String str) {
        this.f49766r = str;
    }

    /* renamed from: r0 */
    public final void m50781r0(long j11) {
        this.f49737F = j11;
    }

    /* renamed from: t */
    public final long m50782t() {
        return this.f49733B;
    }

    /* renamed from: t0 */
    public final void m50783t0(long j11) {
        this.f49734C = j11;
    }

    /* renamed from: u */
    public final String m50784u() {
        return this.f49754W;
    }

    /* renamed from: u0 */
    public final void m50785u0(long j11) {
        this.f49736E = j11;
    }

    /* renamed from: v0 */
    public final void m50786v0(long j11) {
        this.f49738G = j11;
    }

    /* renamed from: w */
    public final String m50787w() {
        return this.f49774z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49764p);
        parcel.writeString(this.f49765q);
        parcel.writeString(this.f49766r);
        parcel.writeString(this.f49767s);
        parcel.writeString(this.f49768t);
        parcel.writeString(this.f49769u);
        parcel.writeString(this.f49770v);
        parcel.writeString(this.f49771w);
        parcel.writeString(this.f49772x);
        parcel.writeString(this.f49773y);
        parcel.writeString(this.f49774z);
        parcel.writeString(this.f49732A);
        parcel.writeLong(this.f49733B);
        parcel.writeLong(this.f49734C);
        parcel.writeLong(this.f49735D);
        parcel.writeLong(this.f49736E);
        parcel.writeLong(this.f49737F);
        parcel.writeLong(this.f49738G);
        parcel.writeLong(this.f49739H);
        parcel.writeLong(this.f49740I);
        parcel.writeInt(this.f49741J ? 1 : 0);
        parcel.writeInt(this.f49742K ? 1 : 0);
        parcel.writeInt(this.f49743L ? 1 : 0);
        parcel.writeInt(this.f49744M ? 1 : 0);
        parcel.writeInt(this.f49745N ? 1 : 0);
        parcel.writeInt(this.f49746O ? 1 : 0);
        Boolean bool = this.f49747P;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l11 = this.f49748Q;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Long l12 = this.f49749R;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        Long l13 = this.f49750S;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
        Long l14 = this.f49751T;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l14.longValue());
        }
        parcel.writeString(this.f49752U);
        parcel.writeParcelable(this.f49753V, i11);
        parcel.writeString(this.f49754W);
        Footer footer = this.f49755X;
        if (footer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footer.writeToParcel(parcel, i11);
        }
        Boolean bool2 = this.f49756Y;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List list = this.f49757Z;
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
        Boolean bool3 = this.f49758a0;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f49759b0);
        List list2 = this.f49760c0;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((CtaItem) it2.next()).writeToParcel(parcel, i11);
            }
        }
        List list3 = this.f49761d0;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((SimilarChannel) it3.next()).writeToParcel(parcel, i11);
            }
        }
        List list4 = this.f49762e0;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                ((Stats) it4.next()).writeToParcel(parcel, i11);
            }
        }
        List list5 = this.f49763f0;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list5.size());
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            ((LivestreamData) it5.next()).writeToParcel(parcel, i11);
        }
    }

    /* renamed from: x */
    public final List m50788x() {
        return this.f49761d0;
    }

    /* renamed from: x0 */
    public final void m50789x0(long j11) {
        this.f49733B = j11;
    }

    /* renamed from: y */
    public final String m50790y() {
        return this.f49732A;
    }

    /* renamed from: z */
    public final List m50791z() {
        return this.f49762e0;
    }

    /* renamed from: z0 */
    public final void m50792z0(long j11) {
        this.f49735D = j11;
    }

    public Channel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Boolean bool, Long l11, Long l12, Long l13, Long l14, String str13, Section section, String str14, Footer footer, Boolean bool2, List list, Boolean bool3, String str15, List list2, List list3, List list4, List list5) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "encodedId");
        this.f49764p = str;
        this.f49765q = str2;
        this.f49766r = str3;
        this.f49767s = str4;
        this.f49768t = str5;
        this.f49769u = str6;
        this.f49770v = str7;
        this.f49771w = str8;
        this.f49772x = str9;
        this.f49773y = str10;
        this.f49774z = str11;
        this.f49732A = str12;
        this.f49733B = j11;
        this.f49734C = j12;
        this.f49735D = j13;
        this.f49736E = j14;
        this.f49737F = j15;
        this.f49738G = j16;
        this.f49739H = j17;
        this.f49740I = j18;
        this.f49741J = z11;
        this.f49742K = z12;
        this.f49743L = z13;
        this.f49744M = z14;
        this.f49745N = z15;
        this.f49746O = z16;
        this.f49747P = bool;
        this.f49748Q = l11;
        this.f49749R = l12;
        this.f49750S = l13;
        this.f49751T = l14;
        this.f49752U = str13;
        this.f49753V = section;
        this.f49754W = str14;
        this.f49755X = footer;
        this.f49756Y = bool2;
        this.f49757Z = list;
        this.f49758a0 = bool3;
        this.f49759b0 = str15;
        this.f49760c0 = list2;
        this.f49761d0 = list3;
        this.f49762e0 = list4;
        this.f49763f0 = list5;
    }

    public /* synthetic */ Channel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Boolean bool, Long l11, Long l12, Long l13, Long l14, String str13, Section section, String str14, Footer footer, Boolean bool2, List list, Boolean bool3, String str15, List list2, List list3, List list4, List list5, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : str12, (i11 & 4096) != 0 ? 0L : j11, (i11 & 8192) != 0 ? 0L : j12, (i11 & 16384) != 0 ? 0L : j13, (32768 & i11) != 0 ? 0L : j14, (65536 & i11) != 0 ? 0L : j15, (131072 & i11) != 0 ? 0L : j16, (262144 & i11) != 0 ? 0L : j17, (524288 & i11) == 0 ? j18 : 0L, (1048576 & i11) != 0 ? false : z11, (i11 & 2097152) != 0 ? false : z12, (i11 & 4194304) != 0 ? false : z13, (i11 & 8388608) != 0 ? false : z14, (i11 & 16777216) != 0 ? false : z15, (i11 & 33554432) == 0 ? z16 : false, (i11 & 67108864) != 0 ? Boolean.FALSE : bool, (i11 & 134217728) != 0 ? null : l11, (i11 & 268435456) != 0 ? null : l12, (i11 & 536870912) != 0 ? null : l13, (i11 & 1073741824) != 0 ? null : l14, (i11 & Integer.MIN_VALUE) != 0 ? null : str13, (i12 & 1) != 0 ? null : section, (i12 & 2) != 0 ? null : str14, (i12 & 4) != 0 ? null : footer, (i12 & 8) != 0 ? null : bool2, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : bool3, (i12 & 64) != 0 ? null : str15, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? null : list3, (i12 & 512) != 0 ? null : list4, (i12 & 1024) != 0 ? null : list5);
    }
}
