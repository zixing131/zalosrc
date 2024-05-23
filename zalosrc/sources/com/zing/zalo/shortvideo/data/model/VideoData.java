package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$$serializer;
import com.zing.zalo.shortvideo.data.utils.AbstractC9464a;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.FooterVideoPromote;
import com.zing.zalo.shortvideo.p072ui.model.FooterVideoPromote$$serializer;
import com.zing.zalo.shortvideo.p072ui.model.VideoLabel;
import com.zing.zalo.shortvideo.p072ui.model.VideoLabel$$serializer;
import com.zing.zalo.shortvideo.p072ui.model.VideoPromote;
import com.zing.zalo.shortvideo.p072ui.model.VideoPromote$$serializer;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import ln0.AbstractC22543l;
import pm0.C24848g0;
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

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoData implements Parcelable {

    /* renamed from: A */
    private long f50029A;

    /* renamed from: B */
    private long f50030B;

    /* renamed from: C */
    private long f50031C;

    /* renamed from: D */
    private long f50032D;

    /* renamed from: E */
    private boolean f50033E;

    /* renamed from: F */
    private boolean f50034F;

    /* renamed from: G */
    private boolean f50035G;

    /* renamed from: H */
    private boolean f50036H;

    /* renamed from: I */
    private boolean f50037I;

    /* renamed from: J */
    private boolean f50038J;

    /* renamed from: K */
    private boolean f50039K;

    /* renamed from: L */
    private boolean f50040L;

    /* renamed from: M */
    private boolean f50041M;

    /* renamed from: N */
    private boolean f50042N;

    /* renamed from: O */
    private boolean f50043O;

    /* renamed from: P */
    private String f50044P;

    /* renamed from: Q */
    private String f50045Q;

    /* renamed from: R */
    private long f50046R;

    /* renamed from: S */
    private String f50047S;

    /* renamed from: T */
    private int f50048T;

    /* renamed from: U */
    private String f50049U;

    /* renamed from: V */
    private String f50050V;

    /* renamed from: W */
    private String f50051W;

    /* renamed from: X */
    private String f50052X;

    /* renamed from: Y */
    private String f50053Y;

    /* renamed from: Z */
    private String f50054Z;

    /* renamed from: a0 */
    private Integer f50055a0;

    /* renamed from: b0 */
    private boolean f50056b0;

    /* renamed from: c0 */
    private String f50057c0;

    /* renamed from: d0 */
    private String f50058d0;

    /* renamed from: e0 */
    private String f50059e0;

    /* renamed from: f0 */
    private VideoPromote f50060f0;

    /* renamed from: g0 */
    private FooterVideoPromote f50061g0;

    /* renamed from: h0 */
    private List f50062h0;

    /* renamed from: i0 */
    private List f50063i0;

    /* renamed from: j0 */
    private Boolean f50064j0;

    /* renamed from: k0 */
    private Boolean f50065k0;

    /* renamed from: l0 */
    private Boolean f50066l0;

    /* renamed from: m0 */
    private Boolean f50067m0;

    /* renamed from: n0 */
    private Integer f50068n0;

    /* renamed from: o0 */
    private long f50069o0;

    /* renamed from: p */
    private final String f50070p;

    /* renamed from: p0 */
    private List f50071p0;

    /* renamed from: q */
    private String f50072q;

    /* renamed from: q0 */
    private Integer f50073q0;

    /* renamed from: r */
    private String f50074r;

    /* renamed from: r0 */
    private boolean f50075r0;

    /* renamed from: s */
    private float f50076s;

    /* renamed from: s0 */
    private String f50077s0;

    /* renamed from: t */
    private long f50078t;

    /* renamed from: u */
    private float f50079u;

    /* renamed from: v */
    private String f50080v;

    /* renamed from: w */
    private String f50081w;

    /* renamed from: x */
    private String f50082x;

    /* renamed from: y */
    private final Channel f50083y;

    /* renamed from: z */
    private long f50084z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoData> CREATOR = new C9436a();

    /* renamed from: t0 */
    private static final KSerializer[] f50028t0 = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(VideoLabel$$serializer.INSTANCE), new C26788f(BottomSheetItem$$serializer.INSTANCE), null, null, null, null, null, null, new C26788f(CtaItem$$serializer.INSTANCE), null, null, null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.VideoData$a */
    /* loaded from: classes5.dex */
    public static final class C9436a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final VideoData createFromParcel(Parcel parcel) {
            boolean z11;
            ArrayList arrayList;
            long j11;
            ArrayList arrayList2;
            ArrayList arrayList3;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            float readFloat = parcel.readFloat();
            long readLong = parcel.readLong();
            float readFloat2 = parcel.readFloat();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Channel channel = (Channel) parcel.readParcelable(VideoData.class.getClassLoader());
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            long readLong6 = parcel.readLong();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            boolean z21 = parcel.readInt() != 0;
            boolean z22 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            long readLong7 = parcel.readLong();
            String readString9 = parcel.readString();
            int readInt = parcel.readInt();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z24 = parcel.readInt() != 0;
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            VideoPromote createFromParcel = parcel.readInt() == 0 ? null : VideoPromote.CREATOR.createFromParcel(parcel);
            FooterVideoPromote createFromParcel2 = parcel.readInt() == 0 ? null : FooterVideoPromote.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                z11 = z12;
                j11 = readLong2;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                z11 = z12;
                arrayList = new ArrayList(readInt2);
                j11 = readLong2;
                for (int i11 = 0; i11 != readInt2; i11++) {
                    arrayList.add(VideoLabel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    arrayList4.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                    i12++;
                    readInt3 = readInt3;
                }
                arrayList2 = arrayList4;
            }
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            long readLong8 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                int i13 = 0;
                while (i13 != readInt4) {
                    arrayList5.add(CtaItem.CREATOR.createFromParcel(parcel));
                    i13++;
                    readInt4 = readInt4;
                }
                arrayList3 = arrayList5;
            }
            return new VideoData(readString, readString2, readString3, readFloat, readLong, readFloat2, readString4, readString5, readString6, channel, j11, readLong3, readLong4, readLong5, readLong6, z11, z13, z14, z15, z16, z17, z18, z19, z21, z22, z23, readString7, readString8, readLong7, readString9, readInt, readString10, readString11, readString12, readString13, readString14, readString15, valueOf, z24, readString16, readString17, readString18, createFromParcel, createFromParcel2, arrayList, arrayList2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, readLong8, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final VideoData[] newArray(int i11) {
            return new VideoData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.VideoData$b */
    /* loaded from: classes5.dex */
    public static final class C9437b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f50085a = VideoData.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.VideoData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0146. Please report as an issue. */
            /* renamed from: a */
            public final VideoData m51386a(JsonObject jsonObject) {
                Channel channel;
                Iterator<Map.Entry<String, JsonElement>> it;
                List m131185M0;
                float m116587j;
                List m131185M02;
                List m131185M03;
                AbstractC19074t.m100208f(jsonObject, "json");
                String m51740u = AbstractC9465b.m51740u(jsonObject, "videoId", "video_id");
                JsonObject m51733n = AbstractC9465b.m51733n(jsonObject, "channel");
                if (m51733n == null || (channel = Channel.C9382b.Companion.m50798a(m51733n)) == null) {
                    try {
                        String[] m50799b = Channel.C9382b.Companion.m50799b();
                        channel = new Channel(AbstractC9465b.m51740u(jsonObject, (String[]) Arrays.copyOf(m50799b, m50799b.length)), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -2, 2047, (AbstractC19060k) null);
                    } catch (NoSuchElementException unused) {
                        channel = Channel.Anonymous.f49775h0;
                    }
                }
                VideoData videoData = new VideoData(m51740u, (String) null, (String) null, 0.0f, 0L, 0.0f, (String) null, (String) null, (String) null, channel, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, false, false, false, false, false, (String) null, (String) null, 0L, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, (String) null, (String) null, (String) null, (VideoPromote) null, (FooterVideoPromote) null, (List) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, 0L, (List) null, (Integer) null, false, (String) null, -514, 16777215, (AbstractC19060k) null);
                Iterator<Map.Entry<String, JsonElement>> it2 = jsonObject.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, JsonElement> next = it2.next();
                    String key = next.getKey();
                    JsonElement value = next.getValue();
                    String str = null;
                    switch (key.hashCode()) {
                        case -1992012396:
                            it = it2;
                            if (key.equals("duration")) {
                                videoData.m51292E0(AbstractC9465b.m51734o(value));
                            }
                            it2 = it;
                            break;
                        case -1724546052:
                            it = it2;
                            if (key.equals("description")) {
                                videoData.m51291D0(AbstractC9465b.m51739t(value));
                            }
                            it2 = it;
                            break;
                        case -1367544630:
                            it = it2;
                            if (key.equals("cateId")) {
                                videoData.m51378x0(Integer.valueOf(AbstractC9465b.m51726g(value)));
                            }
                            it2 = it;
                            break;
                        case -1268861541:
                            it = it2;
                            if (key.equals("footer")) {
                                JsonObject m139916m = AbstractC27331i.m139916m(value);
                                videoData.m51297H0(new FooterVideoPromote(AbstractC9465b.m51729j(m139916m, ZinstantMetaConstant.IMPRESSION_META_TYPE), AbstractC9465b.m51743x(m139916m, "icon"), AbstractC9465b.m51743x(m139916m, "title"), AbstractC9465b.m51743x(m139916m, "value"), AbstractC9465b.m51743x(m139916m, "iconChevron"), AbstractC9465b.m51724e(m139916m, "textColor"), AbstractC9465b.m51724e(m139916m, "backgroundColor")));
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            }
                            it2 = it;
                            break;
                        case -1110417409:
                            if (key.equals("labels")) {
                                JsonArray m139915l = AbstractC27331i.m139915l(value);
                                ArrayList arrayList = new ArrayList();
                                Iterator<JsonElement> it3 = m139915l.iterator();
                                while (it3.hasNext()) {
                                    JsonObject m139916m2 = AbstractC27331i.m139916m(it3.next());
                                    arrayList.add(new VideoLabel(AbstractC9465b.m51729j(m139916m2, ZinstantMetaConstant.IMPRESSION_META_TYPE), AbstractC9465b.m51743x(m139916m2, "icon"), AbstractC9465b.m51743x(m139916m2, "title"), AbstractC9465b.m51743x(m139916m2, "value"), AbstractC9465b.m51743x(m139916m2, "src"), AbstractC9465b.m51724e(m139916m2, "textColor"), AbstractC9465b.m51724e(m139916m2, "backgroundColor")));
                                    it2 = it2;
                                }
                                it = it2;
                                m131185M0 = AbstractC25332a0.m131185M0(arrayList);
                                videoData.m51306M0(m131185M0);
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                it2 = it;
                                break;
                            } else {
                                break;
                            }
                        case -982450867:
                            if (key.equals("poster")) {
                                videoData.m51295G0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case -892481550:
                            if (key.equals("status")) {
                                for (Map.Entry<String, JsonElement> entry : AbstractC27331i.m139916m(value).entrySet()) {
                                    String key2 = entry.getKey();
                                    JsonElement value2 = entry.getValue();
                                    if (AbstractC19074t.m100204b(key2, "id")) {
                                        videoData.m51333a1(AbstractC9465b.m51726g(value2));
                                    } else if (AbstractC19074t.m100204b(key2, "name")) {
                                        videoData.m51336b1(AbstractC9465b.m51739t(value2));
                                    }
                                }
                                C24848g0 c24848g03 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case -874661879:
                            if (key.equals("analyticsURL")) {
                                String m51739t = AbstractC9465b.m51739t(value);
                                if (m51739t.length() > 0 && !AbstractC19074t.m100204b(m51739t, "null")) {
                                    str = m51739t;
                                }
                                videoData.m51369q0(str);
                                break;
                            } else {
                                break;
                            }
                        case -810883302:
                            if (key.equals("volume")) {
                                m116587j = AbstractC22543l.m116587j(AbstractC9465b.m51725f(value), 0.0f, 1.0f);
                                videoData.m51348g1(m116587j);
                                break;
                            } else {
                                break;
                            }
                        case -799212381:
                            if (key.equals("promotion")) {
                                JsonObject m139916m3 = AbstractC27331i.m139916m(value);
                                videoData.m51345f1(new VideoPromote(AbstractC9465b.m51742w(m139916m3, new String[]{"title"}, null, 2, null), AbstractC9465b.m51742w(m139916m3, new String[]{"icon"}, null, 2, null), AbstractC9465b.m51742w(m139916m3, new String[]{"link"}, null, 2, null)));
                                C24848g0 c24848g04 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case -785673886:
                            if (key.equals("sensitiveTitle")) {
                                videoData.m51329Y0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case -743769840:
                            if (key.equals("shareURL")) {
                                String m51739t2 = AbstractC9465b.m51739t(value);
                                if (m51739t2.length() > 0 && !AbstractC19074t.m100204b(m51739t2, "null")) {
                                    str = m51739t2;
                                }
                                videoData.m51331Z0(str);
                                break;
                            } else {
                                break;
                            }
                        case -489909803:
                            if (key.equals("createdTime")) {
                                videoData.m51285A0(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -353339493:
                            if (key.equals("reportURL")) {
                                String m51739t3 = AbstractC9465b.m51739t(value);
                                if (m51739t3.length() > 0 && !AbstractC19074t.m100204b(m51739t3, "null")) {
                                    str = m51739t3;
                                }
                                videoData.m51325W0(str);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -333339063:
                            if (key.equals("linkExpiration")) {
                                videoData.m51308N0(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -183954275:
                            if (key.equals("firstFrame")) {
                                videoData.m51295G0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 98832:
                            if (key.equals("cta")) {
                                JsonArray m139915l2 = AbstractC27331i.m139915l(value);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<JsonElement> it4 = m139915l2.iterator();
                                while (it4.hasNext()) {
                                    CtaItem m50910a = CtaItem.Companion.m50910a(AbstractC27331i.m139916m(it4.next()));
                                    if (m50910a != null) {
                                        arrayList2.add(m50910a);
                                    }
                                }
                                m131185M02 = AbstractC25332a0.m131185M0(arrayList2);
                                videoData.m51289C0(m131185M02);
                                C24848g0 c24848g05 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 103407:
                            if (key.equals("hls")) {
                                videoData.m51303K0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 114148:
                            if (key.equals("src")) {
                                videoData.m51304L0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 3540564:
                            if (key.equals("stat")) {
                                JsonObject m139916m4 = AbstractC27331i.m139916m(value);
                                videoData.m51319T0(AbstractC9465b.m51736q(m139916m4, new String[]{"views"}, 0L, 2, null));
                                videoData.m51315R0(AbstractC9465b.m51736q(m139916m4, new String[]{"likes"}, 0L, 2, null));
                                videoData.m51313Q0(AbstractC9465b.m51736q(m139916m4, new String[]{"cmts"}, 0L, 2, null));
                                videoData.m51317S0(AbstractC9465b.m51736q(m139916m4, new String[]{"shares"}, 0L, 2, null));
                                videoData.m51311P0(AbstractC9465b.m51736q(m139916m4, new String[]{"bookmarks"}, 0L, 2, null));
                                C24848g0 c24848g06 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 96965648:
                            if (key.equals("extra")) {
                                videoData.m51294F0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 108285963:
                            if (key.equals("ratio")) {
                                videoData.m51323V0(AbstractC9465b.m51725f(value));
                                break;
                            } else {
                                break;
                            }
                        case 116014283:
                            if (key.equals("zmcId")) {
                                videoData.m51351h1(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 181879853:
                            if (key.equals("btSheet")) {
                                JsonArray m139915l3 = AbstractC27331i.m139915l(value);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<JsonElement> it5 = m139915l3.iterator();
                                while (it5.hasNext()) {
                                    BottomSheetItem m51416a = BottomSheetItem.Companion.m51416a(AbstractC27331i.m139916m(it5.next()));
                                    if (m51416a == null || !m51416a.isValid()) {
                                        m51416a = null;
                                    }
                                    if (m51416a != null) {
                                        arrayList3.add(m51416a);
                                    }
                                }
                                m131185M03 = AbstractC25332a0.m131185M0(arrayList3);
                                videoData.m51375v0(m131185M03);
                                C24848g0 c24848g07 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 316494091:
                            if (key.equals("sensitiveMsg")) {
                                videoData.m51327X0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 405645655:
                            if (key.equals("attributes")) {
                                int m51726g = AbstractC9465b.m51726g(value);
                                videoData.m51374u0(AbstractC9464a.m51718a(m51726g, 32));
                                videoData.m51372t0(AbstractC9464a.m51718a(m51726g, 1));
                                videoData.m51370r0(AbstractC9464a.m51718a(m51726g, 4194304));
                                videoData.m51367p0(!AbstractC9464a.m51718a(m51726g, 16));
                                videoData.m51321U0(AbstractC9464a.m51718a(m51726g, 4));
                                videoData.m51338c1(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA)));
                                videoData.m51343e1(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, 16384)));
                                videoData.m51381z0(Boolean.valueOf(AbstractC9464a.m51718a(m51726g, 32768)));
                                videoData.m51310O0(AbstractC9464a.m51718a(m51726g, 524288));
                                videoData.m51299I0(AbstractC9464a.m51718a(m51726g, 2097152));
                                C24848g0 c24848g08 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 1012201759:
                            if (key.equals("hls_url")) {
                                videoData.m51303K0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 1211021347:
                            if (key.equals("mp4_265")) {
                                videoData.m51301J0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 1325994004:
                            if (key.equals("link_expiration")) {
                                videoData.m51308N0(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case 1330532588:
                            if (key.equals("thumbnail")) {
                                videoData.m51340d1(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 1502662871:
                            if (key.equals("dangerousMsg")) {
                                videoData.m51287B0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 2132050813:
                            if (key.equals("poster_url")) {
                                videoData.m51295G0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return videoData;
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public VideoData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m51386a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, VideoData videoData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(videoData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50085a;
        }
    }

    public /* synthetic */ VideoData(int i11, int i12, String str, String str2, String str3, float f11, long j11, float f12, String str4, String str5, String str6, Channel channel, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, String str7, String str8, long j17, String str9, int i13, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, boolean z23, String str16, String str17, String str18, VideoPromote videoPromote, FooterVideoPromote footerVideoPromote, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, long j18, List list3, Integer num3, boolean z24, String str19, AbstractC26805k1 abstractC26805k1) {
        if ((513 != (i11 & 513)) | false) {
            AbstractC26774a1.m137799a(new int[]{i11, i12}, new int[]{513, 0}, VideoData$$serializer.INSTANCE.getDescriptor());
        }
        this.f50070p = str;
        if ((i11 & 2) == 0) {
            this.f50072q = null;
        } else {
            this.f50072q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f50074r = null;
        } else {
            this.f50074r = str3;
        }
        if ((i11 & 8) == 0) {
            this.f50076s = 1.0f;
        } else {
            this.f50076s = f11;
        }
        if ((i11 & 16) == 0) {
            this.f50078t = 0L;
        } else {
            this.f50078t = j11;
        }
        if ((i11 & 32) == 0) {
            this.f50079u = 1.0f;
        } else {
            this.f50079u = f12;
        }
        if ((i11 & 64) == 0) {
            this.f50080v = null;
        } else {
            this.f50080v = str4;
        }
        if ((i11 & 128) == 0) {
            this.f50081w = null;
        } else {
            this.f50081w = str5;
        }
        if ((i11 & 256) == 0) {
            this.f50082x = null;
        } else {
            this.f50082x = str6;
        }
        this.f50083y = channel;
        if ((i11 & 1024) == 0) {
            this.f50084z = 0L;
        } else {
            this.f50084z = j12;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f50029A = 0L;
        } else {
            this.f50029A = j13;
        }
        if ((i11 & 4096) == 0) {
            this.f50030B = 0L;
        } else {
            this.f50030B = j14;
        }
        if ((i11 & 8192) == 0) {
            this.f50031C = 0L;
        } else {
            this.f50031C = j15;
        }
        if ((i11 & 16384) == 0) {
            this.f50032D = 0L;
        } else {
            this.f50032D = j16;
        }
        if ((i11 & 32768) == 0) {
            this.f50033E = false;
        } else {
            this.f50033E = z11;
        }
        if ((i11 & 65536) == 0) {
            this.f50034F = false;
        } else {
            this.f50034F = z12;
        }
        if ((i11 & 131072) == 0) {
            this.f50035G = false;
        } else {
            this.f50035G = z13;
        }
        if ((262144 & i11) == 0) {
            this.f50036H = false;
        } else {
            this.f50036H = z14;
        }
        if ((524288 & i11) == 0) {
            this.f50037I = false;
        } else {
            this.f50037I = z15;
        }
        if ((1048576 & i11) == 0) {
            this.f50038J = false;
        } else {
            this.f50038J = z16;
        }
        if ((2097152 & i11) == 0) {
            this.f50039K = false;
        } else {
            this.f50039K = z17;
        }
        if ((4194304 & i11) == 0) {
            this.f50040L = false;
        } else {
            this.f50040L = z18;
        }
        if ((8388608 & i11) == 0) {
            this.f50041M = false;
        } else {
            this.f50041M = z19;
        }
        if ((16777216 & i11) == 0) {
            this.f50042N = false;
        } else {
            this.f50042N = z21;
        }
        this.f50043O = (33554432 & i11) != 0 ? z22 : true;
        if ((67108864 & i11) == 0) {
            this.f50044P = null;
        } else {
            this.f50044P = str7;
        }
        if ((134217728 & i11) == 0) {
            this.f50045Q = null;
        } else {
            this.f50045Q = str8;
        }
        this.f50046R = (268435456 & i11) != 0 ? j17 : 0L;
        if ((536870912 & i11) == 0) {
            this.f50047S = null;
        } else {
            this.f50047S = str9;
        }
        if ((1073741824 & i11) == 0) {
            this.f50048T = 0;
        } else {
            this.f50048T = i13;
        }
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.f50049U = null;
        } else {
            this.f50049U = str10;
        }
        if ((i12 & 1) == 0) {
            this.f50050V = null;
        } else {
            this.f50050V = str11;
        }
        if ((i12 & 2) == 0) {
            this.f50051W = null;
        } else {
            this.f50051W = str12;
        }
        if ((i12 & 4) == 0) {
            this.f50052X = null;
        } else {
            this.f50052X = str13;
        }
        if ((i12 & 8) == 0) {
            this.f50053Y = null;
        } else {
            this.f50053Y = str14;
        }
        if ((i12 & 16) == 0) {
            this.f50054Z = null;
        } else {
            this.f50054Z = str15;
        }
        if ((i12 & 32) == 0) {
            this.f50055a0 = null;
        } else {
            this.f50055a0 = num;
        }
        if ((i12 & 64) == 0) {
            this.f50056b0 = false;
        } else {
            this.f50056b0 = z23;
        }
        if ((i12 & 128) == 0) {
            this.f50057c0 = null;
        } else {
            this.f50057c0 = str16;
        }
        if ((i12 & 256) == 0) {
            this.f50058d0 = null;
        } else {
            this.f50058d0 = str17;
        }
        if ((i12 & 512) == 0) {
            this.f50059e0 = null;
        } else {
            this.f50059e0 = str18;
        }
        if ((i12 & 1024) == 0) {
            this.f50060f0 = null;
        } else {
            this.f50060f0 = videoPromote;
        }
        if ((i12 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f50061g0 = null;
        } else {
            this.f50061g0 = footerVideoPromote;
        }
        if ((i12 & 4096) == 0) {
            this.f50062h0 = null;
        } else {
            this.f50062h0 = list;
        }
        if ((i12 & 8192) == 0) {
            this.f50063i0 = null;
        } else {
            this.f50063i0 = list2;
        }
        if ((i12 & 16384) == 0) {
            this.f50064j0 = null;
        } else {
            this.f50064j0 = bool;
        }
        if ((i12 & 32768) == 0) {
            this.f50065k0 = null;
        } else {
            this.f50065k0 = bool2;
        }
        if ((i12 & 65536) == 0) {
            this.f50066l0 = null;
        } else {
            this.f50066l0 = bool3;
        }
        if ((i12 & 131072) == 0) {
            this.f50067m0 = null;
        } else {
            this.f50067m0 = bool4;
        }
        if ((262144 & i12) == 0) {
            this.f50068n0 = null;
        } else {
            this.f50068n0 = num2;
        }
        this.f50069o0 = (524288 & i12) == 0 ? -1L : j18;
        if ((1048576 & i12) == 0) {
            this.f50071p0 = null;
        } else {
            this.f50071p0 = list3;
        }
        if ((2097152 & i12) == 0) {
            this.f50073q0 = null;
        } else {
            this.f50073q0 = num3;
        }
        if ((4194304 & i12) == 0) {
            this.f50075r0 = false;
        } else {
            this.f50075r0 = z24;
        }
        if ((8388608 & i12) == 0) {
            this.f50077s0 = null;
        } else {
            this.f50077s0 = str19;
        }
    }

    /* renamed from: i1 */
    public static final /* synthetic */ void m51284i1(VideoData videoData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50028t0;
        interfaceC21886d.mo114035z(serialDescriptor, 0, videoData.f50070p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || videoData.f50072q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, videoData.f50072q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || videoData.f50074r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, videoData.f50074r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || Float.compare(videoData.f50076s, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 3, videoData.f50076s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || videoData.f50078t != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 4, videoData.f50078t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || Float.compare(videoData.f50079u, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 5, videoData.f50079u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || videoData.f50080v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, videoData.f50080v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || videoData.f50081w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, videoData.f50081w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || videoData.f50082x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26814n1.f127034a, videoData.f50082x);
        }
        interfaceC21886d.mo114029i(serialDescriptor, 9, Channel$$serializer.INSTANCE, videoData.f50083y);
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || videoData.f50084z != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 10, videoData.f50084z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || videoData.f50029A != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 11, videoData.f50029A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || videoData.f50030B != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 12, videoData.f50030B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || videoData.f50031C != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 13, videoData.f50031C);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || videoData.f50032D != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 14, videoData.f50032D);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || videoData.f50033E) {
            interfaceC21886d.mo114034y(serialDescriptor, 15, videoData.f50033E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || videoData.f50034F) {
            interfaceC21886d.mo114034y(serialDescriptor, 16, videoData.f50034F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || videoData.f50035G) {
            interfaceC21886d.mo114034y(serialDescriptor, 17, videoData.f50035G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || videoData.f50036H) {
            interfaceC21886d.mo114034y(serialDescriptor, 18, videoData.f50036H);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || videoData.f50037I) {
            interfaceC21886d.mo114034y(serialDescriptor, 19, videoData.f50037I);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || videoData.f50038J) {
            interfaceC21886d.mo114034y(serialDescriptor, 20, videoData.f50038J);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || videoData.f50039K) {
            interfaceC21886d.mo114034y(serialDescriptor, 21, videoData.f50039K);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || videoData.f50040L) {
            interfaceC21886d.mo114034y(serialDescriptor, 22, videoData.f50040L);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 23) || videoData.f50041M) {
            interfaceC21886d.mo114034y(serialDescriptor, 23, videoData.f50041M);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 24) || videoData.f50042N) {
            interfaceC21886d.mo114034y(serialDescriptor, 24, videoData.f50042N);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 25) || !videoData.f50043O) {
            interfaceC21886d.mo114034y(serialDescriptor, 25, videoData.f50043O);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 26) || videoData.f50044P != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 26, C26814n1.f127034a, videoData.f50044P);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 27) || videoData.f50045Q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 27, C26814n1.f127034a, videoData.f50045Q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 28) || videoData.f50046R != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 28, videoData.f50046R);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 29) || videoData.f50047S != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 29, C26814n1.f127034a, videoData.f50047S);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 30) || videoData.f50048T != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 30, videoData.f50048T);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 31) || videoData.f50049U != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 31, C26814n1.f127034a, videoData.f50049U);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 32) || videoData.f50050V != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 32, C26814n1.f127034a, videoData.f50050V);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 33) || videoData.f50051W != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 33, C26814n1.f127034a, videoData.f50051W);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 34) || videoData.f50052X != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 34, C26814n1.f127034a, videoData.f50052X);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 35) || videoData.f50053Y != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 35, C26814n1.f127034a, videoData.f50053Y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 36) || videoData.f50054Z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 36, C26814n1.f127034a, videoData.f50054Z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 37) || videoData.f50055a0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 37, C26783d0.f126989a, videoData.f50055a0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 38) || videoData.f50056b0) {
            interfaceC21886d.mo114034y(serialDescriptor, 38, videoData.f50056b0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 39) || videoData.f50057c0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 39, C26814n1.f127034a, videoData.f50057c0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 40) || videoData.f50058d0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 40, C26814n1.f127034a, videoData.f50058d0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 41) || videoData.f50059e0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 41, C26814n1.f127034a, videoData.f50059e0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 42) || videoData.f50060f0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 42, VideoPromote$$serializer.INSTANCE, videoData.f50060f0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 43) || videoData.f50061g0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 43, FooterVideoPromote$$serializer.INSTANCE, videoData.f50061g0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 44) || videoData.f50062h0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 44, kSerializerArr[44], videoData.f50062h0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 45) || videoData.f50063i0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 45, kSerializerArr[45], videoData.f50063i0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 46) || videoData.f50064j0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 46, C26794h.f127000a, videoData.f50064j0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 47) || videoData.f50065k0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 47, C26794h.f127000a, videoData.f50065k0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 48) || videoData.f50066l0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 48, C26794h.f127000a, videoData.f50066l0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 49) || videoData.f50067m0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 49, C26794h.f127000a, videoData.f50067m0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 50) || videoData.f50068n0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 50, C26783d0.f126989a, videoData.f50068n0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 51) || videoData.f50069o0 != -1) {
            interfaceC21886d.mo114022E(serialDescriptor, 51, videoData.f50069o0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 52) || videoData.f50071p0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 52, kSerializerArr[52], videoData.f50071p0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 53) || videoData.f50073q0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 53, C26783d0.f126989a, videoData.f50073q0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 54) || videoData.f50075r0) {
            interfaceC21886d.mo114034y(serialDescriptor, 54, videoData.f50075r0);
        }
        if (!interfaceC21886d.mo114019A(serialDescriptor, 55) && videoData.f50077s0 == null) {
            return;
        }
        interfaceC21886d.mo114028h(serialDescriptor, 55, C26814n1.f127034a, videoData.f50077s0);
    }

    /* renamed from: A0 */
    public final void m51285A0(long j11) {
        this.f50046R = j11;
    }

    /* renamed from: B */
    public final long m51286B() {
        return this.f50030B;
    }

    /* renamed from: B0 */
    public final void m51287B0(String str) {
        this.f50052X = str;
    }

    /* renamed from: C */
    public final long m51288C() {
        return this.f50029A;
    }

    /* renamed from: C0 */
    public final void m51289C0(List list) {
        this.f50071p0 = list;
    }

    /* renamed from: D */
    public final long m51290D() {
        return this.f50031C;
    }

    /* renamed from: D0 */
    public final void m51291D0(String str) {
        this.f50082x = str;
    }

    /* renamed from: E0 */
    public final void m51292E0(long j11) {
        this.f50078t = j11;
    }

    /* renamed from: F */
    public final long m51293F() {
        return this.f50084z;
    }

    /* renamed from: F0 */
    public final void m51294F0(String str) {
        this.f50057c0 = str;
    }

    /* renamed from: G0 */
    public final void m51295G0(String str) {
        this.f50080v = str;
    }

    /* renamed from: H */
    public final float m51296H() {
        return this.f50076s;
    }

    /* renamed from: H0 */
    public final void m51297H0(FooterVideoPromote footerVideoPromote) {
        this.f50061g0 = footerVideoPromote;
    }

    /* renamed from: I */
    public final String m51298I() {
        return this.f50059e0;
    }

    /* renamed from: I0 */
    public final void m51299I0(boolean z11) {
        this.f50075r0 = z11;
    }

    /* renamed from: J */
    public final String m51300J() {
        return this.f50051W;
    }

    /* renamed from: J0 */
    public final void m51301J0(String str) {
        this.f50074r = str;
    }

    /* renamed from: K */
    public final String m51302K() {
        return this.f50050V;
    }

    /* renamed from: K0 */
    public final void m51303K0(String str) {
        this.f50072q = str;
    }

    /* renamed from: L0 */
    public final void m51304L0(String str) {
        this.f50077s0 = str;
    }

    /* renamed from: M */
    public final String m51305M() {
        return this.f50044P;
    }

    /* renamed from: M0 */
    public final void m51306M0(List list) {
        this.f50062h0 = list;
    }

    /* renamed from: N */
    public final String m51307N() {
        return this.f50053Y;
    }

    /* renamed from: N0 */
    public final void m51308N0(long j11) {
        this.f50069o0 = j11;
    }

    /* renamed from: O */
    public final String m51309O() {
        return this.f50054Z;
    }

    /* renamed from: O0 */
    public final void m51310O0(boolean z11) {
        this.f50039K = z11;
    }

    /* renamed from: P0 */
    public final void m51311P0(long j11) {
        this.f50032D = j11;
    }

    /* renamed from: Q */
    public final int m51312Q() {
        return this.f50048T;
    }

    /* renamed from: Q0 */
    public final void m51313Q0(long j11) {
        this.f50030B = j11;
    }

    /* renamed from: R */
    public final String m51314R() {
        return this.f50049U;
    }

    /* renamed from: R0 */
    public final void m51315R0(long j11) {
        this.f50029A = j11;
    }

    /* renamed from: S */
    public final String m51316S() {
        return this.f50081w;
    }

    /* renamed from: S0 */
    public final void m51317S0(long j11) {
        this.f50031C = j11;
    }

    /* renamed from: T */
    public final Boolean m51318T() {
        return this.f50066l0;
    }

    /* renamed from: T0 */
    public final void m51319T0(long j11) {
        this.f50084z = j11;
    }

    /* renamed from: U */
    public final VideoPromote m51320U() {
        return this.f50060f0;
    }

    /* renamed from: U0 */
    public final void m51321U0(boolean z11) {
        this.f50040L = z11;
    }

    /* renamed from: V */
    public final float m51322V() {
        return this.f50079u;
    }

    /* renamed from: V0 */
    public final void m51323V0(float f11) {
        this.f50076s = f11;
    }

    /* renamed from: W */
    public final String m51324W() {
        return this.f50047S;
    }

    /* renamed from: W0 */
    public final void m51325W0(String str) {
        this.f50059e0 = str;
    }

    /* renamed from: X */
    public final boolean m51326X() {
        return this.f50038J;
    }

    /* renamed from: X0 */
    public final void m51327X0(String str) {
        this.f50051W = str;
    }

    /* renamed from: Y */
    public final boolean m51328Y() {
        return this.f50035G;
    }

    /* renamed from: Y0 */
    public final void m51329Y0(String str) {
        this.f50050V = str;
    }

    /* renamed from: Z */
    public final boolean m51330Z() {
        return this.f50034F;
    }

    /* renamed from: Z0 */
    public final void m51331Z0(String str) {
        this.f50044P = str;
    }

    /* renamed from: a0 */
    public final boolean m51332a0() {
        return this.f50033E;
    }

    /* renamed from: a1 */
    public final void m51333a1(int i11) {
        this.f50048T = i11;
    }

    /* renamed from: b */
    public final String m51334b() {
        return this.f50045Q;
    }

    /* renamed from: b0 */
    public final boolean m51335b0() {
        return this.f50037I;
    }

    /* renamed from: b1 */
    public final void m51336b1(String str) {
        this.f50049U = str;
    }

    /* renamed from: c */
    public final List m51337c() {
        return this.f50063i0;
    }

    /* renamed from: c1 */
    public final void m51338c1(Boolean bool) {
        this.f50064j0 = bool;
    }

    /* renamed from: d */
    public final Integer m51339d() {
        return this.f50068n0;
    }

    /* renamed from: d1 */
    public final void m51340d1(String str) {
        this.f50081w = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Channel m51341e() {
        return this.f50083y;
    }

    /* renamed from: e0 */
    public final boolean m51342e0() {
        return this.f50036H;
    }

    /* renamed from: e1 */
    public final void m51343e1(Boolean bool) {
        this.f50066l0 = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoData)) {
            return false;
        }
        VideoData videoData = (VideoData) obj;
        return AbstractC19074t.m100204b(this.f50070p, videoData.f50070p) && AbstractC19074t.m100204b(this.f50072q, videoData.f50072q) && AbstractC19074t.m100204b(this.f50074r, videoData.f50074r) && Float.compare(this.f50076s, videoData.f50076s) == 0 && this.f50078t == videoData.f50078t && Float.compare(this.f50079u, videoData.f50079u) == 0 && AbstractC19074t.m100204b(this.f50080v, videoData.f50080v) && AbstractC19074t.m100204b(this.f50081w, videoData.f50081w) && AbstractC19074t.m100204b(this.f50082x, videoData.f50082x) && AbstractC19074t.m100204b(this.f50083y, videoData.f50083y) && this.f50084z == videoData.f50084z && this.f50029A == videoData.f50029A && this.f50030B == videoData.f50030B && this.f50031C == videoData.f50031C && this.f50032D == videoData.f50032D && this.f50033E == videoData.f50033E && this.f50034F == videoData.f50034F && this.f50035G == videoData.f50035G && this.f50036H == videoData.f50036H && this.f50037I == videoData.f50037I && this.f50038J == videoData.f50038J && this.f50039K == videoData.f50039K && this.f50040L == videoData.f50040L && this.f50041M == videoData.f50041M && this.f50042N == videoData.f50042N && this.f50043O == videoData.f50043O && AbstractC19074t.m100204b(this.f50044P, videoData.f50044P) && AbstractC19074t.m100204b(this.f50045Q, videoData.f50045Q) && this.f50046R == videoData.f50046R && AbstractC19074t.m100204b(this.f50047S, videoData.f50047S) && this.f50048T == videoData.f50048T && AbstractC19074t.m100204b(this.f50049U, videoData.f50049U) && AbstractC19074t.m100204b(this.f50050V, videoData.f50050V) && AbstractC19074t.m100204b(this.f50051W, videoData.f50051W) && AbstractC19074t.m100204b(this.f50052X, videoData.f50052X) && AbstractC19074t.m100204b(this.f50053Y, videoData.f50053Y) && AbstractC19074t.m100204b(this.f50054Z, videoData.f50054Z) && AbstractC19074t.m100204b(this.f50055a0, videoData.f50055a0) && this.f50056b0 == videoData.f50056b0 && AbstractC19074t.m100204b(this.f50057c0, videoData.f50057c0) && AbstractC19074t.m100204b(this.f50058d0, videoData.f50058d0) && AbstractC19074t.m100204b(this.f50059e0, videoData.f50059e0) && AbstractC19074t.m100204b(this.f50060f0, videoData.f50060f0) && AbstractC19074t.m100204b(this.f50061g0, videoData.f50061g0) && AbstractC19074t.m100204b(this.f50062h0, videoData.f50062h0) && AbstractC19074t.m100204b(this.f50063i0, videoData.f50063i0) && AbstractC19074t.m100204b(this.f50064j0, videoData.f50064j0) && AbstractC19074t.m100204b(this.f50065k0, videoData.f50065k0) && AbstractC19074t.m100204b(this.f50066l0, videoData.f50066l0) && AbstractC19074t.m100204b(this.f50067m0, videoData.f50067m0) && AbstractC19074t.m100204b(this.f50068n0, videoData.f50068n0) && this.f50069o0 == videoData.f50069o0 && AbstractC19074t.m100204b(this.f50071p0, videoData.f50071p0) && AbstractC19074t.m100204b(this.f50073q0, videoData.f50073q0) && this.f50075r0 == videoData.f50075r0 && AbstractC19074t.m100204b(this.f50077s0, videoData.f50077s0);
    }

    /* renamed from: f */
    public final long m51344f() {
        return this.f50046R;
    }

    /* renamed from: f1 */
    public final void m51345f1(VideoPromote videoPromote) {
        this.f50060f0 = videoPromote;
    }

    /* renamed from: g */
    public final String m51346g() {
        return this.f50052X;
    }

    /* renamed from: g0 */
    public final boolean m51347g0() {
        return this.f50042N;
    }

    /* renamed from: g1 */
    public final void m51348g1(float f11) {
        this.f50079u = f11;
    }

    /* renamed from: h */
    public final List m51349h() {
        return this.f50071p0;
    }

    /* renamed from: h0 */
    public final Boolean m51350h0() {
        return this.f50067m0;
    }

    /* renamed from: h1 */
    public final void m51351h1(String str) {
        this.f50047S = str;
    }

    public int hashCode() {
        int hashCode = this.f50070p.hashCode() * 31;
        String str = this.f50072q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50074r;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Float.floatToIntBits(this.f50076s)) * 31) + AbstractC2147g0.m11521a(this.f50078t)) * 31) + Float.floatToIntBits(this.f50079u)) * 31;
        String str3 = this.f50080v;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50081w;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50082x;
        int hashCode6 = (((((((((((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f50083y.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f50084z)) * 31) + AbstractC2147g0.m11521a(this.f50029A)) * 31) + AbstractC2147g0.m11521a(this.f50030B)) * 31) + AbstractC2147g0.m11521a(this.f50031C)) * 31) + AbstractC2147g0.m11521a(this.f50032D)) * 31) + AbstractC2144f.m11520a(this.f50033E)) * 31) + AbstractC2144f.m11520a(this.f50034F)) * 31) + AbstractC2144f.m11520a(this.f50035G)) * 31) + AbstractC2144f.m11520a(this.f50036H)) * 31) + AbstractC2144f.m11520a(this.f50037I)) * 31) + AbstractC2144f.m11520a(this.f50038J)) * 31) + AbstractC2144f.m11520a(this.f50039K)) * 31) + AbstractC2144f.m11520a(this.f50040L)) * 31) + AbstractC2144f.m11520a(this.f50041M)) * 31) + AbstractC2144f.m11520a(this.f50042N)) * 31) + AbstractC2144f.m11520a(this.f50043O)) * 31;
        String str6 = this.f50044P;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f50045Q;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f50046R)) * 31;
        String str8 = this.f50047S;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f50048T) * 31;
        String str9 = this.f50049U;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f50050V;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f50051W;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f50052X;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f50053Y;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f50054Z;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.f50055a0;
        int hashCode16 = (((hashCode15 + (num == null ? 0 : num.hashCode())) * 31) + AbstractC2144f.m11520a(this.f50056b0)) * 31;
        String str15 = this.f50057c0;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f50058d0;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f50059e0;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        VideoPromote videoPromote = this.f50060f0;
        int hashCode20 = (hashCode19 + (videoPromote == null ? 0 : videoPromote.hashCode())) * 31;
        FooterVideoPromote footerVideoPromote = this.f50061g0;
        int hashCode21 = (hashCode20 + (footerVideoPromote == null ? 0 : footerVideoPromote.hashCode())) * 31;
        List list = this.f50062h0;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f50063i0;
        int hashCode23 = (hashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f50064j0;
        int hashCode24 = (hashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f50065k0;
        int hashCode25 = (hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f50066l0;
        int hashCode26 = (hashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f50067m0;
        int hashCode27 = (hashCode26 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.f50068n0;
        int hashCode28 = (((hashCode27 + (num2 == null ? 0 : num2.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f50069o0)) * 31;
        List list3 = this.f50071p0;
        int hashCode29 = (hashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num3 = this.f50073q0;
        int hashCode30 = (((hashCode29 + (num3 == null ? 0 : num3.hashCode())) * 31) + AbstractC2144f.m11520a(this.f50075r0)) * 31;
        String str18 = this.f50077s0;
        return hashCode30 + (str18 != null ? str18.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m51352i() {
        return this.f50082x;
    }

    /* renamed from: i0 */
    public final boolean m51353i0() {
        return this.f50056b0;
    }

    /* renamed from: j */
    public final long m51354j() {
        return this.f50078t;
    }

    /* renamed from: j0 */
    public final boolean m51355j0() {
        return this.f50041M;
    }

    /* renamed from: k */
    public final String m51356k() {
        return this.f50057c0;
    }

    /* renamed from: k0 */
    public final boolean m51357k0() {
        return this.f50039K;
    }

    /* renamed from: l */
    public final String m51358l() {
        return this.f50080v;
    }

    /* renamed from: l0 */
    public final boolean m51359l0() {
        return this.f50040L;
    }

    /* renamed from: m */
    public final FooterVideoPromote m51360m() {
        return this.f50061g0;
    }

    /* renamed from: m0 */
    public final boolean m51361m0() {
        return this.f50043O;
    }

    /* renamed from: n */
    public final boolean m51362n() {
        return this.f50075r0;
    }

    /* renamed from: n0 */
    public final Boolean m51363n0() {
        return this.f50065k0;
    }

    /* renamed from: o */
    public final String m51364o() {
        return this.f50058d0;
    }

    /* renamed from: o0 */
    public final Boolean m51365o0() {
        return this.f50064j0;
    }

    /* renamed from: p */
    public final String m51366p() {
        return this.f50074r;
    }

    /* renamed from: p0 */
    public final void m51367p0(boolean z11) {
        this.f50038J = z11;
    }

    /* renamed from: q */
    public final String m51368q() {
        return this.f50072q;
    }

    /* renamed from: q0 */
    public final void m51369q0(String str) {
        this.f50045Q = str;
    }

    /* renamed from: r0 */
    public final void m51370r0(boolean z11) {
        this.f50035G = z11;
    }

    /* renamed from: t */
    public final String m51371t() {
        return this.f50070p;
    }

    /* renamed from: t0 */
    public final void m51372t0(boolean z11) {
        this.f50034F = z11;
    }

    public String toString() {
        return "VideoData(id=" + this.f50070p + ", hls=" + this.f50072q + ", h265=" + this.f50074r + ", ratio=" + this.f50076s + ", duration=" + this.f50078t + ", volume=" + this.f50079u + ", firstFrame=" + this.f50080v + ", thumbnail=" + this.f50081w + ", description=" + this.f50082x + ", channel=" + this.f50083y + ", numOfView=" + this.f50084z + ", numOfLike=" + this.f50029A + ", numOfComment=" + this.f50030B + ", numOfShare=" + this.f50031C + ", numOfBookmark=" + this.f50032D + ", isBlockLike=" + this.f50033E + ", isBlockComment=" + this.f50034F + ", isBlockBookmark=" + this.f50035G + ", isBlockMyUser=" + this.f50036H + ", isBlockMyChannel=" + this.f50037I + ", isAllowSeek=" + this.f50038J + ", isMuted=" + this.f50039K + ", isPinned=" + this.f50040L + ", isLiked=" + this.f50041M + ", isBookmarked=" + this.f50042N + ", isPublic=" + this.f50043O + ", shareUrl=" + this.f50044P + ", analyticUrl=" + this.f50045Q + ", createdTime=" + this.f50046R + ", zmcId=" + this.f50047S + ", statusCode=" + this.f50048T + ", statusMessage=" + this.f50049U + ", sensitiveTitle=" + this.f50050V + ", sensitiveMessage=" + this.f50051W + ", dangerousMessage=" + this.f50052X + ", source=" + this.f50053Y + ", sourceInfo=" + this.f50054Z + ", listIndex=" + this.f50055a0 + ", isImpression=" + this.f50056b0 + ", extra=" + this.f50057c0 + ", fromRelatedId=" + this.f50058d0 + ", reportURL=" + this.f50059e0 + ", videoPromote=" + this.f50060f0 + ", footerPromote=" + this.f50061g0 + ", labels=" + this.f50062h0 + ", btSheet=" + this.f50063i0 + ", isSuggestShare=" + this.f50064j0 + ", isSuggestLike=" + this.f50065k0 + ", turnOfLockComment=" + this.f50066l0 + ", isCommentCensored=" + this.f50067m0 + ", cateId=" + this.f50068n0 + ", linkExpiration=" + this.f50069o0 + ", descCta=" + this.f50071p0 + ", videoType=" + this.f50073q0 + ", forceShowSimilarVideos=" + this.f50075r0 + ", identifier=" + this.f50077s0 + ")";
    }

    /* renamed from: u */
    public final String m51373u() {
        return this.f50077s0;
    }

    /* renamed from: u0 */
    public final void m51374u0(boolean z11) {
        this.f50033E = z11;
    }

    /* renamed from: v0 */
    public final void m51375v0(List list) {
        this.f50063i0 = list;
    }

    /* renamed from: w */
    public final List m51376w() {
        return this.f50062h0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f50070p);
        parcel.writeString(this.f50072q);
        parcel.writeString(this.f50074r);
        parcel.writeFloat(this.f50076s);
        parcel.writeLong(this.f50078t);
        parcel.writeFloat(this.f50079u);
        parcel.writeString(this.f50080v);
        parcel.writeString(this.f50081w);
        parcel.writeString(this.f50082x);
        parcel.writeParcelable(this.f50083y, i11);
        parcel.writeLong(this.f50084z);
        parcel.writeLong(this.f50029A);
        parcel.writeLong(this.f50030B);
        parcel.writeLong(this.f50031C);
        parcel.writeLong(this.f50032D);
        parcel.writeInt(this.f50033E ? 1 : 0);
        parcel.writeInt(this.f50034F ? 1 : 0);
        parcel.writeInt(this.f50035G ? 1 : 0);
        parcel.writeInt(this.f50036H ? 1 : 0);
        parcel.writeInt(this.f50037I ? 1 : 0);
        parcel.writeInt(this.f50038J ? 1 : 0);
        parcel.writeInt(this.f50039K ? 1 : 0);
        parcel.writeInt(this.f50040L ? 1 : 0);
        parcel.writeInt(this.f50041M ? 1 : 0);
        parcel.writeInt(this.f50042N ? 1 : 0);
        parcel.writeInt(this.f50043O ? 1 : 0);
        parcel.writeString(this.f50044P);
        parcel.writeString(this.f50045Q);
        parcel.writeLong(this.f50046R);
        parcel.writeString(this.f50047S);
        parcel.writeInt(this.f50048T);
        parcel.writeString(this.f50049U);
        parcel.writeString(this.f50050V);
        parcel.writeString(this.f50051W);
        parcel.writeString(this.f50052X);
        parcel.writeString(this.f50053Y);
        parcel.writeString(this.f50054Z);
        Integer num = this.f50055a0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f50056b0 ? 1 : 0);
        parcel.writeString(this.f50057c0);
        parcel.writeString(this.f50058d0);
        parcel.writeString(this.f50059e0);
        VideoPromote videoPromote = this.f50060f0;
        if (videoPromote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoPromote.writeToParcel(parcel, i11);
        }
        FooterVideoPromote footerVideoPromote = this.f50061g0;
        if (footerVideoPromote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footerVideoPromote.writeToParcel(parcel, i11);
        }
        List list = this.f50062h0;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoLabel) it.next()).writeToParcel(parcel, i11);
            }
        }
        List list2 = this.f50063i0;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((BottomSheetItem) it2.next()).writeToParcel(parcel, i11);
            }
        }
        Boolean bool = this.f50064j0;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f50065k0;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.f50066l0;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.f50067m0;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.f50068n0;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeLong(this.f50069o0);
        List list3 = this.f50071p0;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((CtaItem) it3.next()).writeToParcel(parcel, i11);
            }
        }
        Integer num3 = this.f50073q0;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.f50075r0 ? 1 : 0);
        parcel.writeString(this.f50077s0);
    }

    /* renamed from: x */
    public final long m51377x() {
        return this.f50069o0;
    }

    /* renamed from: x0 */
    public final void m51378x0(Integer num) {
        this.f50068n0 = num;
    }

    /* renamed from: y */
    public final Integer m51379y() {
        return this.f50055a0;
    }

    /* renamed from: z */
    public final long m51380z() {
        return this.f50032D;
    }

    /* renamed from: z0 */
    public final void m51381z0(Boolean bool) {
        this.f50067m0 = bool;
    }

    public VideoData(String str, String str2, String str3, float f11, long j11, float f12, String str4, String str5, String str6, Channel channel, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, String str7, String str8, long j17, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, boolean z23, String str16, String str17, String str18, VideoPromote videoPromote, FooterVideoPromote footerVideoPromote, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, long j18, List list3, Integer num3, boolean z24, String str19) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(channel, "channel");
        this.f50070p = str;
        this.f50072q = str2;
        this.f50074r = str3;
        this.f50076s = f11;
        this.f50078t = j11;
        this.f50079u = f12;
        this.f50080v = str4;
        this.f50081w = str5;
        this.f50082x = str6;
        this.f50083y = channel;
        this.f50084z = j12;
        this.f50029A = j13;
        this.f50030B = j14;
        this.f50031C = j15;
        this.f50032D = j16;
        this.f50033E = z11;
        this.f50034F = z12;
        this.f50035G = z13;
        this.f50036H = z14;
        this.f50037I = z15;
        this.f50038J = z16;
        this.f50039K = z17;
        this.f50040L = z18;
        this.f50041M = z19;
        this.f50042N = z21;
        this.f50043O = z22;
        this.f50044P = str7;
        this.f50045Q = str8;
        this.f50046R = j17;
        this.f50047S = str9;
        this.f50048T = i11;
        this.f50049U = str10;
        this.f50050V = str11;
        this.f50051W = str12;
        this.f50052X = str13;
        this.f50053Y = str14;
        this.f50054Z = str15;
        this.f50055a0 = num;
        this.f50056b0 = z23;
        this.f50057c0 = str16;
        this.f50058d0 = str17;
        this.f50059e0 = str18;
        this.f50060f0 = videoPromote;
        this.f50061g0 = footerVideoPromote;
        this.f50062h0 = list;
        this.f50063i0 = list2;
        this.f50064j0 = bool;
        this.f50065k0 = bool2;
        this.f50066l0 = bool3;
        this.f50067m0 = bool4;
        this.f50068n0 = num2;
        this.f50069o0 = j18;
        this.f50071p0 = list3;
        this.f50073q0 = num3;
        this.f50075r0 = z24;
        this.f50077s0 = str19;
    }

    public /* synthetic */ VideoData(String str, String str2, String str3, float f11, long j11, float f12, String str4, String str5, String str6, Channel channel, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, String str7, String str8, long j17, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, boolean z23, String str16, String str17, String str18, VideoPromote videoPromote, FooterVideoPromote footerVideoPromote, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, long j18, List list3, Integer num3, boolean z24, String str19, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? 0L : j11, (i12 & 32) != 0 ? 1.0f : f12, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : str6, channel, (i12 & 1024) != 0 ? 0L : j12, (i12 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0L : j13, (i12 & 4096) != 0 ? 0L : j14, (i12 & 8192) != 0 ? 0L : j15, (i12 & 16384) != 0 ? 0L : j16, (i12 & 32768) != 0 ? false : z11, (i12 & 65536) != 0 ? false : z12, (i12 & 131072) != 0 ? false : z13, (i12 & 262144) != 0 ? false : z14, (i12 & 524288) != 0 ? false : z15, (i12 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? false : z16, (i12 & 2097152) != 0 ? false : z17, (i12 & 4194304) != 0 ? false : z18, (i12 & 8388608) != 0 ? false : z19, (i12 & 16777216) != 0 ? false : z21, (i12 & 33554432) != 0 ? true : z22, (i12 & 67108864) != 0 ? null : str7, (i12 & 134217728) != 0 ? null : str8, (i12 & 268435456) != 0 ? 0L : j17, (536870912 & i12) != 0 ? null : str9, (1073741824 & i12) != 0 ? 0 : i11, (i12 & Integer.MIN_VALUE) != 0 ? null : str10, (i13 & 1) != 0 ? null : str11, (i13 & 2) != 0 ? null : str12, (i13 & 4) != 0 ? null : str13, (i13 & 8) != 0 ? null : str14, (i13 & 16) != 0 ? null : str15, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? false : z23, (i13 & 128) != 0 ? null : str16, (i13 & 256) != 0 ? null : str17, (i13 & 512) != 0 ? null : str18, (i13 & 1024) != 0 ? null : videoPromote, (i13 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : footerVideoPromote, (i13 & 4096) != 0 ? null : list, (i13 & 8192) != 0 ? null : list2, (i13 & 16384) != 0 ? null : bool, (32768 & i13) != 0 ? null : bool2, (i13 & 65536) != 0 ? null : bool3, (i13 & 131072) != 0 ? null : bool4, (i13 & 262144) != 0 ? null : num2, (i13 & 524288) != 0 ? -1L : j18, (1048576 & i13) != 0 ? null : list3, (2097152 & i13) != 0 ? null : num3, (4194304 & i13) != 0 ? false : z24, (i13 & 8388608) == 0 ? str19 : null);
    }
}
