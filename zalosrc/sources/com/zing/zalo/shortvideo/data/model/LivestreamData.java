package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import on0.AbstractC24341v;
import pm0.C24848g0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LivestreamData implements Parcelable {

    /* renamed from: A */
    private long f49874A;

    /* renamed from: B */
    private float f49875B;

    /* renamed from: C */
    private float f49876C;

    /* renamed from: D */
    private final Channel f49877D;

    /* renamed from: E */
    private long f49878E;

    /* renamed from: F */
    private long f49879F;

    /* renamed from: G */
    private long f49880G;

    /* renamed from: H */
    private long f49881H;

    /* renamed from: I */
    private Long f49882I;

    /* renamed from: J */
    private Boolean f49883J;

    /* renamed from: K */
    private Boolean f49884K;

    /* renamed from: L */
    private String f49885L;

    /* renamed from: M */
    private String f49886M;

    /* renamed from: N */
    private final String f49887N;

    /* renamed from: O */
    private Integer f49888O;

    /* renamed from: P */
    private String f49889P;

    /* renamed from: p */
    private final String f49890p;

    /* renamed from: q */
    private String f49891q;

    /* renamed from: r */
    private String f49892r;

    /* renamed from: s */
    private String f49893s;

    /* renamed from: t */
    private int f49894t;

    /* renamed from: u */
    private String f49895u;

    /* renamed from: v */
    private String f49896v;

    /* renamed from: w */
    private long f49897w;

    /* renamed from: x */
    private long f49898x;

    /* renamed from: y */
    private long f49899y;

    /* renamed from: z */
    private long f49900z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LivestreamData> CREATOR = new C9404a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LivestreamData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.LivestreamData$a */
    /* loaded from: classes5.dex */
    public static final class C9404a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LivestreamData createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            Channel channel = (Channel) parcel.readParcelable(LivestreamData.class.getClassLoader());
            long readLong6 = parcel.readLong();
            long readLong7 = parcel.readLong();
            long readLong8 = parcel.readLong();
            long readLong9 = parcel.readLong();
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LivestreamData(readString, readString2, readString3, readString4, readInt, readString5, readString6, readLong, readLong2, readLong3, readLong4, readLong5, readFloat, readFloat2, channel, readLong6, readLong7, readLong8, readLong9, valueOf3, valueOf, valueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LivestreamData[] newArray(int i11) {
            return new LivestreamData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.LivestreamData$b */
    /* loaded from: classes5.dex */
    public static final class C9405b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f49901a = LivestreamData.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.LivestreamData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final LivestreamData m51040a(JsonObject jsonObject) {
                Channel channel;
                AbstractC19074t.m100208f(jsonObject, "json");
                String m51740u = AbstractC9465b.m51740u(jsonObject, "id");
                String str = null;
                String str2 = null;
                String str3 = null;
                int i11 = 0;
                String str4 = null;
                String str5 = null;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                float f11 = 0.0f;
                float f12 = 0.0f;
                JsonObject m51733n = AbstractC9465b.m51733n(jsonObject, "channel");
                if (m51733n == null || (channel = Channel.C9382b.Companion.m50798a(m51733n)) == null) {
                    try {
                        String[] m50799b = Channel.C9382b.Companion.m50799b();
                        channel = new Channel(AbstractC9465b.m51740u(jsonObject, (String[]) Arrays.copyOf(m50799b, m50799b.length)), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -2, 2047, (AbstractC19060k) null);
                    } catch (NoSuchElementException unused) {
                        channel = Channel.Anonymous.f49775h0;
                    }
                }
                LivestreamData livestreamData = new LivestreamData(m51740u, str, str2, str3, i11, str4, str5, j11, j12, 0L, j13, j14, f11, f12, channel, 0L, 0L, 0L, 0L, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 134201342, (AbstractC19060k) null);
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    String str6 = null;
                    switch (key.hashCode()) {
                        case -2129294769:
                            if (key.equals("startTime")) {
                                livestreamData.m51009a0(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -1607243192:
                            if (key.equals("endTime")) {
                                livestreamData.m50993J(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -1354792126:
                            if (key.equals("config")) {
                                livestreamData.m50992I(AbstractC9465b.m51743x(AbstractC27331i.m139916m(value), "domain"));
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case -892481550:
                            if (key.equals("status")) {
                                livestreamData.m51011b0(AbstractC9465b.m51726g(value));
                                break;
                            } else {
                                break;
                            }
                        case -743769840:
                            if (key.equals("shareURL")) {
                                String m51739t = AbstractC9465b.m51739t(value);
                                if (m51739t.length() > 0 && !AbstractC19074t.m100204b(m51739t, "null")) {
                                    str6 = m51739t;
                                }
                                livestreamData.m51006Y(str6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -489909803:
                            if (key.equals("createdTime")) {
                                livestreamData.m50991H(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case -353339493:
                            if (key.equals("reportURL")) {
                                String m51739t2 = AbstractC9465b.m51739t(value);
                                if (m51739t2.length() > 0 && !AbstractC19074t.m100204b(m51739t2, "null")) {
                                    str6 = m51739t2;
                                }
                                livestreamData.m51003V(str6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -315635249:
                            if (key.equals("streamURL")) {
                                livestreamData.m51015e0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 3540564:
                            if (key.equals("stat")) {
                                JsonObject m139916m = AbstractC27331i.m139916m(value);
                                livestreamData.m50999R(AbstractC9465b.m51736q(m139916m, new String[]{"views"}, 0L, 2, null));
                                livestreamData.m50997O(AbstractC9465b.m51736q(m139916m, new String[]{"likes"}, 0L, 2, null));
                                livestreamData.m50996N(AbstractC9465b.m51736q(m139916m, new String[]{"cmts"}, 0L, 2, null));
                                livestreamData.m50998Q(AbstractC9465b.m51736q(m139916m, new String[]{"shares"}, 0L, 2, null));
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                break;
                            } else {
                                break;
                            }
                        case 96965648:
                            if (key.equals("extra")) {
                                livestreamData.m50994K(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 108285963:
                            if (key.equals("ratio")) {
                                livestreamData.m51002U(AbstractC9465b.m51725f(value));
                                break;
                            } else {
                                break;
                            }
                        case 110342614:
                            if (key.equals("thumb")) {
                                livestreamData.m51018g0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 110371416:
                            if (key.equals("title")) {
                                livestreamData.m51020h0(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 594777307:
                            if (key.equals("scheduledEndTime")) {
                                livestreamData.m51004W(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                        case 888495138:
                            if (key.equals("scheduledStartTime")) {
                                livestreamData.m51005X(AbstractC9465b.m51734o(value) * 1000);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return livestreamData;
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LivestreamData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m51040a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, LivestreamData livestreamData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(livestreamData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49901a;
        }
    }

    public /* synthetic */ LivestreamData(int i11, String str, String str2, String str3, String str4, int i12, String str5, String str6, long j11, long j12, long j13, long j14, long j15, float f11, float f12, Channel channel, long j16, long j17, long j18, long j19, Long l11, Boolean bool, Boolean bool2, String str7, String str8, String str9, Integer num, String str10, AbstractC26805k1 abstractC26805k1) {
        if (16385 != (i11 & 16385)) {
            AbstractC26774a1.m137800b(i11, 16385, LivestreamData$$serializer.INSTANCE.getDescriptor());
        }
        this.f49890p = str;
        if ((i11 & 2) == 0) {
            this.f49891q = null;
        } else {
            this.f49891q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49892r = null;
        } else {
            this.f49892r = str3;
        }
        if ((i11 & 8) == 0) {
            this.f49893s = null;
        } else {
            this.f49893s = str4;
        }
        this.f49894t = (i11 & 16) == 0 ? 0 : i12;
        if ((i11 & 32) == 0) {
            this.f49895u = null;
        } else {
            this.f49895u = str5;
        }
        if ((i11 & 64) == 0) {
            this.f49896v = null;
        } else {
            this.f49896v = str6;
        }
        if ((i11 & 128) == 0) {
            this.f49897w = 0L;
        } else {
            this.f49897w = j11;
        }
        if ((i11 & 256) == 0) {
            this.f49898x = 0L;
        } else {
            this.f49898x = j12;
        }
        if ((i11 & 512) == 0) {
            this.f49899y = 0L;
        } else {
            this.f49899y = j13;
        }
        if ((i11 & 1024) == 0) {
            this.f49900z = 0L;
        } else {
            this.f49900z = j14;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49874A = 0L;
        } else {
            this.f49874A = j15;
        }
        if ((i11 & 4096) == 0) {
            this.f49875B = 1.0f;
        } else {
            this.f49875B = f11;
        }
        if ((i11 & 8192) == 0) {
            this.f49876C = 1.0f;
        } else {
            this.f49876C = f12;
        }
        this.f49877D = channel;
        if ((32768 & i11) == 0) {
            this.f49878E = 0L;
        } else {
            this.f49878E = j16;
        }
        if ((65536 & i11) == 0) {
            this.f49879F = 0L;
        } else {
            this.f49879F = j17;
        }
        if ((131072 & i11) == 0) {
            this.f49880G = 0L;
        } else {
            this.f49880G = j18;
        }
        if ((262144 & i11) == 0) {
            this.f49881H = 0L;
        } else {
            this.f49881H = j19;
        }
        this.f49882I = (524288 & i11) == 0 ? 0L : l11;
        this.f49883J = (1048576 & i11) == 0 ? Boolean.FALSE : bool;
        this.f49884K = (2097152 & i11) == 0 ? Boolean.FALSE : bool2;
        if ((4194304 & i11) == 0) {
            this.f49885L = null;
        } else {
            this.f49885L = str7;
        }
        if ((8388608 & i11) == 0) {
            this.f49886M = null;
        } else {
            this.f49886M = str8;
        }
        if ((16777216 & i11) == 0) {
            this.f49887N = null;
        } else {
            this.f49887N = str9;
        }
        if ((33554432 & i11) == 0) {
            this.f49888O = null;
        } else {
            this.f49888O = num;
        }
        if ((i11 & 67108864) == 0) {
            this.f49889P = null;
        } else {
            this.f49889P = str10;
        }
    }

    /* renamed from: i0 */
    public static final /* synthetic */ void m50986i0(LivestreamData livestreamData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        Long l11;
        interfaceC21886d.mo114035z(serialDescriptor, 0, livestreamData.f49890p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || livestreamData.f49891q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, livestreamData.f49891q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || livestreamData.f49892r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, livestreamData.f49892r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || livestreamData.f49893s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, livestreamData.f49893s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || livestreamData.f49894t != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 4, livestreamData.f49894t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || livestreamData.f49895u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, livestreamData.f49895u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || livestreamData.f49896v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, livestreamData.f49896v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || livestreamData.f49897w != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 7, livestreamData.f49897w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || livestreamData.f49898x != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 8, livestreamData.f49898x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || livestreamData.f49899y != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 9, livestreamData.f49899y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || livestreamData.f49900z != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 10, livestreamData.f49900z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || livestreamData.f49874A != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 11, livestreamData.f49874A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || Float.compare(livestreamData.f49875B, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 12, livestreamData.f49875B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || Float.compare(livestreamData.f49876C, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 13, livestreamData.f49876C);
        }
        interfaceC21886d.mo114029i(serialDescriptor, 14, Channel$$serializer.INSTANCE, livestreamData.f49877D);
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || livestreamData.f49878E != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 15, livestreamData.f49878E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || livestreamData.f49879F != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 16, livestreamData.f49879F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || livestreamData.f49880G != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 17, livestreamData.f49880G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || livestreamData.f49881H != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 18, livestreamData.f49881H);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || (l11 = livestreamData.f49882I) == null || l11.longValue() != 0) {
            interfaceC21886d.mo114028h(serialDescriptor, 19, C26810m0.f127024a, livestreamData.f49882I);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || !AbstractC19074t.m100204b(livestreamData.f49883J, Boolean.FALSE)) {
            interfaceC21886d.mo114028h(serialDescriptor, 20, C26794h.f127000a, livestreamData.f49883J);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || !AbstractC19074t.m100204b(livestreamData.f49884K, Boolean.FALSE)) {
            interfaceC21886d.mo114028h(serialDescriptor, 21, C26794h.f127000a, livestreamData.f49884K);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || livestreamData.f49885L != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 22, C26814n1.f127034a, livestreamData.f49885L);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 23) || livestreamData.f49886M != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 23, C26814n1.f127034a, livestreamData.f49886M);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 24) || livestreamData.f49887N != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 24, C26814n1.f127034a, livestreamData.f49887N);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 25) || livestreamData.f49888O != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 25, C26783d0.f126989a, livestreamData.f49888O);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 26) || livestreamData.f49889P != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 26, C26814n1.f127034a, livestreamData.f49889P);
        }
    }

    /* renamed from: B */
    public final Boolean m50987B() {
        return this.f49883J;
    }

    /* renamed from: C */
    public final boolean m50988C() {
        if (m51034y() && m51035z()) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final void m50989D(PersonalizeStream personalizeStream) {
        AbstractC19074t.m100208f(personalizeStream, "stream");
        this.f49877D.m50770l0(personalizeStream.m51119f());
        this.f49884K = Boolean.valueOf(personalizeStream.m51118e());
        this.f49883J = Boolean.valueOf(personalizeStream.m51117d());
        Integer m51116c = personalizeStream.m51116c();
        if (m51116c != null) {
            this.f49894t = m51116c.intValue();
        }
    }

    /* renamed from: F */
    public final void m50990F(Long l11) {
        this.f49882I = l11;
    }

    /* renamed from: H */
    public final void m50991H(long j11) {
        this.f49897w = j11;
    }

    /* renamed from: I */
    public final void m50992I(String str) {
        this.f49889P = str;
    }

    /* renamed from: J */
    public final void m50993J(long j11) {
        this.f49874A = j11;
    }

    /* renamed from: K */
    public final void m50994K(String str) {
        this.f49885L = str;
    }

    /* renamed from: M */
    public final void m50995M(Integer num) {
        this.f49888O = num;
    }

    /* renamed from: N */
    public final void m50996N(long j11) {
        this.f49880G = j11;
    }

    /* renamed from: O */
    public final void m50997O(long j11) {
        this.f49879F = j11;
    }

    /* renamed from: Q */
    public final void m50998Q(long j11) {
        this.f49881H = j11;
    }

    /* renamed from: R */
    public final void m50999R(long j11) {
        this.f49878E = j11;
    }

    /* renamed from: S */
    public final void m51000S(Boolean bool) {
        this.f49883J = bool;
    }

    /* renamed from: T */
    public final void m51001T(Boolean bool) {
        this.f49884K = bool;
    }

    /* renamed from: U */
    public final void m51002U(float f11) {
        this.f49875B = f11;
    }

    /* renamed from: V */
    public final void m51003V(String str) {
        this.f49896v = str;
    }

    /* renamed from: W */
    public final void m51004W(long j11) {
        this.f49899y = j11;
    }

    /* renamed from: X */
    public final void m51005X(long j11) {
        this.f49898x = j11;
    }

    /* renamed from: Y */
    public final void m51006Y(String str) {
        this.f49895u = str;
    }

    /* renamed from: Z */
    public final void m51007Z(String str) {
        this.f49886M = str;
    }

    /* renamed from: a */
    public final Long m51008a() {
        return this.f49882I;
    }

    /* renamed from: a0 */
    public final void m51009a0(long j11) {
        this.f49900z = j11;
    }

    /* renamed from: b */
    public final Channel m51010b() {
        return this.f49877D;
    }

    /* renamed from: b0 */
    public final void m51011b0(int i11) {
        this.f49894t = i11;
    }

    /* renamed from: c */
    public final String m51012c() {
        return this.f49889P;
    }

    /* renamed from: d */
    public final long m51013d() {
        return this.f49874A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m51014e() {
        return this.f49885L;
    }

    /* renamed from: e0 */
    public final void m51015e0(String str) {
        this.f49893s = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivestreamData)) {
            return false;
        }
        LivestreamData livestreamData = (LivestreamData) obj;
        return AbstractC19074t.m100204b(this.f49890p, livestreamData.f49890p) && AbstractC19074t.m100204b(this.f49891q, livestreamData.f49891q) && AbstractC19074t.m100204b(this.f49892r, livestreamData.f49892r) && AbstractC19074t.m100204b(this.f49893s, livestreamData.f49893s) && this.f49894t == livestreamData.f49894t && AbstractC19074t.m100204b(this.f49895u, livestreamData.f49895u) && AbstractC19074t.m100204b(this.f49896v, livestreamData.f49896v) && this.f49897w == livestreamData.f49897w && this.f49898x == livestreamData.f49898x && this.f49899y == livestreamData.f49899y && this.f49900z == livestreamData.f49900z && this.f49874A == livestreamData.f49874A && Float.compare(this.f49875B, livestreamData.f49875B) == 0 && Float.compare(this.f49876C, livestreamData.f49876C) == 0 && AbstractC19074t.m100204b(this.f49877D, livestreamData.f49877D) && this.f49878E == livestreamData.f49878E && this.f49879F == livestreamData.f49879F && this.f49880G == livestreamData.f49880G && this.f49881H == livestreamData.f49881H && AbstractC19074t.m100204b(this.f49882I, livestreamData.f49882I) && AbstractC19074t.m100204b(this.f49883J, livestreamData.f49883J) && AbstractC19074t.m100204b(this.f49884K, livestreamData.f49884K) && AbstractC19074t.m100204b(this.f49885L, livestreamData.f49885L) && AbstractC19074t.m100204b(this.f49886M, livestreamData.f49886M) && AbstractC19074t.m100204b(this.f49887N, livestreamData.f49887N) && AbstractC19074t.m100204b(this.f49888O, livestreamData.f49888O) && AbstractC19074t.m100204b(this.f49889P, livestreamData.f49889P);
    }

    /* renamed from: f */
    public final String m51016f() {
        return this.f49890p;
    }

    /* renamed from: g */
    public final Integer m51017g() {
        return this.f49888O;
    }

    /* renamed from: g0 */
    public final void m51018g0(String str) {
        this.f49892r = str;
    }

    /* renamed from: h */
    public final long m51019h() {
        return this.f49879F;
    }

    /* renamed from: h0 */
    public final void m51020h0(String str) {
        this.f49891q = str;
    }

    public int hashCode() {
        int hashCode = this.f49890p.hashCode() * 31;
        String str = this.f49891q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49892r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49893s;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f49894t) * 31;
        String str4 = this.f49895u;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f49896v;
        int hashCode6 = (((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f49897w)) * 31) + AbstractC2147g0.m11521a(this.f49898x)) * 31) + AbstractC2147g0.m11521a(this.f49899y)) * 31) + AbstractC2147g0.m11521a(this.f49900z)) * 31) + AbstractC2147g0.m11521a(this.f49874A)) * 31) + Float.floatToIntBits(this.f49875B)) * 31) + Float.floatToIntBits(this.f49876C)) * 31) + this.f49877D.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f49878E)) * 31) + AbstractC2147g0.m11521a(this.f49879F)) * 31) + AbstractC2147g0.m11521a(this.f49880G)) * 31) + AbstractC2147g0.m11521a(this.f49881H)) * 31;
        Long l11 = this.f49882I;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f49883J;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f49884K;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.f49885L;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f49886M;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f49887N;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f49888O;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.f49889P;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i */
    public final long m51021i() {
        return this.f49878E;
    }

    /* renamed from: j */
    public final float m51022j() {
        return this.f49875B;
    }

    /* renamed from: k */
    public final String m51023k() {
        return this.f49896v;
    }

    /* renamed from: l */
    public final long m51024l() {
        return this.f49898x;
    }

    /* renamed from: m */
    public final String m51025m() {
        return this.f49895u;
    }

    /* renamed from: n */
    public final String m51026n() {
        return this.f49886M;
    }

    /* renamed from: o */
    public final String m51027o() {
        return this.f49887N;
    }

    /* renamed from: p */
    public final long m51028p() {
        return this.f49900z;
    }

    /* renamed from: q */
    public final int m51029q() {
        return this.f49894t;
    }

    /* renamed from: t */
    public final String m51030t() {
        return this.f49893s;
    }

    public String toString() {
        return "LivestreamData(id=" + this.f49890p + ", title=" + this.f49891q + ", thumb=" + this.f49892r + ", streamUrl=" + this.f49893s + ", status=" + this.f49894t + ", shareUrl=" + this.f49895u + ", reportURL=" + this.f49896v + ", createdTime=" + this.f49897w + ", scheduledStartTime=" + this.f49898x + ", scheduledEndTime=" + this.f49899y + ", startTime=" + this.f49900z + ", endTime=" + this.f49874A + ", ratio=" + this.f49875B + ", volume=" + this.f49876C + ", channel=" + this.f49877D + ", numOfView=" + this.f49878E + ", numOfLike=" + this.f49879F + ", numOfComment=" + this.f49880G + ", numOfShare=" + this.f49881H + ", attribute=" + this.f49882I + ", isPersonalBlockCmt=" + this.f49883J + ", isPersonalBlockLike=" + this.f49884K + ", extra=" + this.f49885L + ", source=" + this.f49886M + ", sourceInfo=" + this.f49887N + ", listIndex=" + this.f49888O + ", domain=" + this.f49889P + ")";
    }

    /* renamed from: u */
    public final String m51031u() {
        return this.f49892r;
    }

    /* renamed from: w */
    public final String m51032w() {
        return this.f49891q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49890p);
        parcel.writeString(this.f49891q);
        parcel.writeString(this.f49892r);
        parcel.writeString(this.f49893s);
        parcel.writeInt(this.f49894t);
        parcel.writeString(this.f49895u);
        parcel.writeString(this.f49896v);
        parcel.writeLong(this.f49897w);
        parcel.writeLong(this.f49898x);
        parcel.writeLong(this.f49899y);
        parcel.writeLong(this.f49900z);
        parcel.writeLong(this.f49874A);
        parcel.writeFloat(this.f49875B);
        parcel.writeFloat(this.f49876C);
        parcel.writeParcelable(this.f49877D, i11);
        parcel.writeLong(this.f49878E);
        parcel.writeLong(this.f49879F);
        parcel.writeLong(this.f49880G);
        parcel.writeLong(this.f49881H);
        Long l11 = this.f49882I;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Boolean bool = this.f49883J;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f49884K;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f49885L);
        parcel.writeString(this.f49886M);
        parcel.writeString(this.f49887N);
        Integer num = this.f49888O;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f49889P);
    }

    /* renamed from: x */
    public final float m51033x() {
        return this.f49876C;
    }

    /* renamed from: y */
    public final boolean m51034y() {
        return !AbstractC19074t.m100204b(this.f49877D, Channel.Anonymous.f49775h0);
    }

    /* renamed from: z */
    public final boolean m51035z() {
        boolean m127128x;
        boolean m127126v;
        String str = this.f49893s;
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                m127126v = AbstractC24341v.m127126v(this.f49893s, "null", true);
                if (!m127126v) {
                    return true;
                }
            }
        }
        return false;
    }

    public LivestreamData(String str, String str2, String str3, String str4, int i11, String str5, String str6, long j11, long j12, long j13, long j14, long j15, float f11, float f12, Channel channel, long j16, long j17, long j18, long j19, Long l11, Boolean bool, Boolean bool2, String str7, String str8, String str9, Integer num, String str10) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(channel, "channel");
        this.f49890p = str;
        this.f49891q = str2;
        this.f49892r = str3;
        this.f49893s = str4;
        this.f49894t = i11;
        this.f49895u = str5;
        this.f49896v = str6;
        this.f49897w = j11;
        this.f49898x = j12;
        this.f49899y = j13;
        this.f49900z = j14;
        this.f49874A = j15;
        this.f49875B = f11;
        this.f49876C = f12;
        this.f49877D = channel;
        this.f49878E = j16;
        this.f49879F = j17;
        this.f49880G = j18;
        this.f49881H = j19;
        this.f49882I = l11;
        this.f49883J = bool;
        this.f49884K = bool2;
        this.f49885L = str7;
        this.f49886M = str8;
        this.f49887N = str9;
        this.f49888O = num;
        this.f49889P = str10;
    }

    public /* synthetic */ LivestreamData(String str, String str2, String str3, String str4, int i11, String str5, String str6, long j11, long j12, long j13, long j14, long j15, float f11, float f12, Channel channel, long j16, long j17, long j18, long j19, Long l11, Boolean bool, Boolean bool2, String str7, String str8, String str9, Integer num, String str10, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? 0L : j11, (i12 & 256) != 0 ? 0L : j12, (i12 & 512) != 0 ? 0L : j13, (i12 & 1024) != 0 ? 0L : j14, (i12 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0L : j15, (i12 & 4096) != 0 ? 1.0f : f11, (i12 & 8192) != 0 ? 1.0f : f12, channel, (32768 & i12) != 0 ? 0L : j16, (65536 & i12) != 0 ? 0L : j17, (131072 & i12) != 0 ? 0L : j18, (262144 & i12) != 0 ? 0L : j19, (524288 & i12) != 0 ? 0L : l11, (1048576 & i12) != 0 ? Boolean.FALSE : bool, (2097152 & i12) != 0 ? Boolean.FALSE : bool2, (4194304 & i12) != 0 ? null : str7, (8388608 & i12) != 0 ? null : str8, (16777216 & i12) != 0 ? null : str9, (33554432 & i12) != 0 ? null : num, (i12 & 67108864) != 0 ? null : str10);
    }
}
