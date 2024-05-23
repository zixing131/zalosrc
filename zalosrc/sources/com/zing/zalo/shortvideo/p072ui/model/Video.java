package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Channel$$serializer;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import com.zing.zalo.shortvideo.data.model.CtaItem$$serializer;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$$serializer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import on0.AbstractC24341v;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26814n1;
import w00.AbstractC28684a;
import x00.InterfaceC29283d;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Video implements Parcelable {

    /* renamed from: A */
    private long f51361A;

    /* renamed from: B */
    private long f51362B;

    /* renamed from: C */
    private long f51363C;

    /* renamed from: D */
    private long f51364D;

    /* renamed from: E */
    private boolean f51365E;

    /* renamed from: F */
    private boolean f51366F;

    /* renamed from: G */
    private boolean f51367G;

    /* renamed from: H */
    private boolean f51368H;

    /* renamed from: I */
    private boolean f51369I;

    /* renamed from: J */
    private boolean f51370J;

    /* renamed from: K */
    private boolean f51371K;

    /* renamed from: L */
    private boolean f51372L;

    /* renamed from: M */
    private boolean f51373M;

    /* renamed from: N */
    private boolean f51374N;

    /* renamed from: O */
    private boolean f51375O;

    /* renamed from: P */
    private String f51376P;

    /* renamed from: Q */
    private String f51377Q;

    /* renamed from: R */
    private long f51378R;

    /* renamed from: S */
    private String f51379S;

    /* renamed from: T */
    private int f51380T;

    /* renamed from: U */
    private String f51381U;

    /* renamed from: V */
    private String f51382V;

    /* renamed from: W */
    private String f51383W;

    /* renamed from: X */
    private String f51384X;

    /* renamed from: Y */
    private String f51385Y;

    /* renamed from: Z */
    private String f51386Z;

    /* renamed from: a0 */
    private Integer f51387a0;

    /* renamed from: b0 */
    private boolean f51388b0;

    /* renamed from: c0 */
    private String f51389c0;

    /* renamed from: d0 */
    private String f51390d0;

    /* renamed from: e0 */
    private String f51391e0;

    /* renamed from: f0 */
    private VideoPromote f51392f0;

    /* renamed from: g0 */
    private FooterVideoPromote f51393g0;

    /* renamed from: h0 */
    private List f51394h0;

    /* renamed from: i0 */
    private Boolean f51395i0;

    /* renamed from: j0 */
    private Boolean f51396j0;

    /* renamed from: k0 */
    private Boolean f51397k0;

    /* renamed from: l0 */
    private Boolean f51398l0;

    /* renamed from: m0 */
    private Integer f51399m0;

    /* renamed from: n0 */
    private VideoAdsInfo f51400n0;

    /* renamed from: o0 */
    private List f51401o0;

    /* renamed from: p */
    private final String f51402p;

    /* renamed from: p0 */
    private long f51403p0;

    /* renamed from: q */
    private String f51404q;

    /* renamed from: q0 */
    private List f51405q0;

    /* renamed from: r */
    private String f51406r;

    /* renamed from: r0 */
    private Integer f51407r0;

    /* renamed from: s */
    private float f51408s;

    /* renamed from: s0 */
    private Integer f51409s0;

    /* renamed from: t */
    private long f51410t;

    /* renamed from: t0 */
    private boolean f51411t0;

    /* renamed from: u */
    private float f51412u;

    /* renamed from: u0 */
    private String f51413u0;

    /* renamed from: v */
    private String f51414v;

    /* renamed from: w */
    private String f51415w;

    /* renamed from: x */
    private String f51416x;

    /* renamed from: y */
    private final Channel f51417y;

    /* renamed from: z */
    private long f51418z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Video> CREATOR = new C9778a();

    /* renamed from: v0 */
    private static final KSerializer[] f51360v0 = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(BottomSheetItem$$serializer.INSTANCE), null, null, null, null, null, null, new C26788f(VideoLabel$$serializer.INSTANCE), null, new C26788f(CtaItem$$serializer.INSTANCE), null, null, null, null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Video$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.Video$a */
    /* loaded from: classes5.dex */
    public static final class C9778a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Video createFromParcel(Parcel parcel) {
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
            Channel channel = (Channel) parcel.readParcelable(Video.class.getClassLoader());
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
                    arrayList.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                }
            }
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VideoAdsInfo createFromParcel3 = parcel.readInt() == 0 ? null : VideoAdsInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    arrayList4.add(VideoLabel.CREATOR.createFromParcel(parcel));
                    i12++;
                    readInt3 = readInt3;
                }
                arrayList2 = arrayList4;
            }
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
            return new Video(readString, readString2, readString3, readFloat, readLong, readFloat2, readString4, readString5, readString6, channel, j11, readLong3, readLong4, readLong5, readLong6, z11, z13, z14, z15, z16, z17, z18, z19, z21, z22, z23, readString7, readString8, readLong7, readString9, readInt, readString10, readString11, readString12, readString13, readString14, readString15, valueOf, z24, readString16, readString17, readString18, createFromParcel, createFromParcel2, arrayList, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, createFromParcel3, arrayList2, readLong8, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Video[] newArray(int i11) {
            return new Video[i11];
        }
    }

    public /* synthetic */ Video(int i11, int i12, String str, String str2, String str3, float f11, long j11, float f12, String str4, String str5, String str6, Channel channel, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, String str7, String str8, long j17, String str9, int i13, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, boolean z23, String str16, String str17, String str18, VideoPromote videoPromote, FooterVideoPromote footerVideoPromote, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, VideoAdsInfo videoAdsInfo, List list2, long j18, List list3, Integer num3, Integer num4, boolean z24, String str19, AbstractC26805k1 abstractC26805k1) {
        if ((513 != (i11 & 513)) | false) {
            AbstractC26774a1.m137799a(new int[]{i11, i12}, new int[]{513, 0}, Video$$serializer.INSTANCE.getDescriptor());
        }
        this.f51402p = str;
        if ((i11 & 2) == 0) {
            this.f51404q = null;
        } else {
            this.f51404q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f51406r = null;
        } else {
            this.f51406r = str3;
        }
        if ((i11 & 8) == 0) {
            this.f51408s = 1.0f;
        } else {
            this.f51408s = f11;
        }
        if ((i11 & 16) == 0) {
            this.f51410t = 0L;
        } else {
            this.f51410t = j11;
        }
        if ((i11 & 32) == 0) {
            this.f51412u = 1.0f;
        } else {
            this.f51412u = f12;
        }
        if ((i11 & 64) == 0) {
            this.f51414v = null;
        } else {
            this.f51414v = str4;
        }
        if ((i11 & 128) == 0) {
            this.f51415w = null;
        } else {
            this.f51415w = str5;
        }
        if ((i11 & 256) == 0) {
            this.f51416x = null;
        } else {
            this.f51416x = str6;
        }
        this.f51417y = channel;
        if ((i11 & 1024) == 0) {
            this.f51418z = 0L;
        } else {
            this.f51418z = j12;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f51361A = 0L;
        } else {
            this.f51361A = j13;
        }
        if ((i11 & 4096) == 0) {
            this.f51362B = 0L;
        } else {
            this.f51362B = j14;
        }
        if ((i11 & 8192) == 0) {
            this.f51363C = 0L;
        } else {
            this.f51363C = j15;
        }
        if ((i11 & 16384) == 0) {
            this.f51364D = 0L;
        } else {
            this.f51364D = j16;
        }
        if ((i11 & 32768) == 0) {
            this.f51365E = false;
        } else {
            this.f51365E = z11;
        }
        if ((i11 & 65536) == 0) {
            this.f51366F = false;
        } else {
            this.f51366F = z12;
        }
        if ((i11 & 131072) == 0) {
            this.f51367G = false;
        } else {
            this.f51367G = z13;
        }
        if ((262144 & i11) == 0) {
            this.f51368H = false;
        } else {
            this.f51368H = z14;
        }
        if ((524288 & i11) == 0) {
            this.f51369I = false;
        } else {
            this.f51369I = z15;
        }
        if ((1048576 & i11) == 0) {
            this.f51370J = false;
        } else {
            this.f51370J = z16;
        }
        if ((2097152 & i11) == 0) {
            this.f51371K = false;
        } else {
            this.f51371K = z17;
        }
        if ((4194304 & i11) == 0) {
            this.f51372L = false;
        } else {
            this.f51372L = z18;
        }
        if ((8388608 & i11) == 0) {
            this.f51373M = false;
        } else {
            this.f51373M = z19;
        }
        if ((16777216 & i11) == 0) {
            this.f51374N = false;
        } else {
            this.f51374N = z21;
        }
        this.f51375O = (33554432 & i11) != 0 ? z22 : true;
        if ((67108864 & i11) == 0) {
            this.f51376P = null;
        } else {
            this.f51376P = str7;
        }
        if ((134217728 & i11) == 0) {
            this.f51377Q = null;
        } else {
            this.f51377Q = str8;
        }
        this.f51378R = (268435456 & i11) != 0 ? j17 : 0L;
        if ((536870912 & i11) == 0) {
            this.f51379S = null;
        } else {
            this.f51379S = str9;
        }
        if ((1073741824 & i11) == 0) {
            this.f51380T = 0;
        } else {
            this.f51380T = i13;
        }
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.f51381U = null;
        } else {
            this.f51381U = str10;
        }
        if ((i12 & 1) == 0) {
            this.f51382V = null;
        } else {
            this.f51382V = str11;
        }
        if ((i12 & 2) == 0) {
            this.f51383W = null;
        } else {
            this.f51383W = str12;
        }
        if ((i12 & 4) == 0) {
            this.f51384X = null;
        } else {
            this.f51384X = str13;
        }
        if ((i12 & 8) == 0) {
            this.f51385Y = null;
        } else {
            this.f51385Y = str14;
        }
        if ((i12 & 16) == 0) {
            this.f51386Z = null;
        } else {
            this.f51386Z = str15;
        }
        if ((i12 & 32) == 0) {
            this.f51387a0 = null;
        } else {
            this.f51387a0 = num;
        }
        if ((i12 & 64) == 0) {
            this.f51388b0 = false;
        } else {
            this.f51388b0 = z23;
        }
        if ((i12 & 128) == 0) {
            this.f51389c0 = null;
        } else {
            this.f51389c0 = str16;
        }
        if ((i12 & 256) == 0) {
            this.f51390d0 = null;
        } else {
            this.f51390d0 = str17;
        }
        if ((i12 & 512) == 0) {
            this.f51391e0 = null;
        } else {
            this.f51391e0 = str18;
        }
        if ((i12 & 1024) == 0) {
            this.f51392f0 = null;
        } else {
            this.f51392f0 = videoPromote;
        }
        if ((i12 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f51393g0 = null;
        } else {
            this.f51393g0 = footerVideoPromote;
        }
        if ((i12 & 4096) == 0) {
            this.f51394h0 = null;
        } else {
            this.f51394h0 = list;
        }
        if ((i12 & 8192) == 0) {
            this.f51395i0 = null;
        } else {
            this.f51395i0 = bool;
        }
        if ((i12 & 16384) == 0) {
            this.f51396j0 = null;
        } else {
            this.f51396j0 = bool2;
        }
        if ((i12 & 32768) == 0) {
            this.f51397k0 = null;
        } else {
            this.f51397k0 = bool3;
        }
        if ((i12 & 65536) == 0) {
            this.f51398l0 = null;
        } else {
            this.f51398l0 = bool4;
        }
        if ((i12 & 131072) == 0) {
            this.f51399m0 = null;
        } else {
            this.f51399m0 = num2;
        }
        if ((262144 & i12) == 0) {
            this.f51400n0 = null;
        } else {
            this.f51400n0 = videoAdsInfo;
        }
        if ((524288 & i12) == 0) {
            this.f51401o0 = null;
        } else {
            this.f51401o0 = list2;
        }
        this.f51403p0 = (1048576 & i12) == 0 ? -1L : j18;
        if ((2097152 & i12) == 0) {
            this.f51405q0 = null;
        } else {
            this.f51405q0 = list3;
        }
        if ((4194304 & i12) == 0) {
            this.f51407r0 = null;
        } else {
            this.f51407r0 = num3;
        }
        if ((8388608 & i12) == 0) {
            this.f51409s0 = null;
        } else {
            this.f51409s0 = num4;
        }
        if ((16777216 & i12) == 0) {
            this.f51411t0 = false;
        } else {
            this.f51411t0 = z24;
        }
        if ((33554432 & i12) == 0) {
            this.f51413u0 = null;
        } else {
            this.f51413u0 = str19;
        }
    }

    /* renamed from: Z0 */
    public static final /* synthetic */ void m52832Z0(Video video, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f51360v0;
        interfaceC21886d.mo114035z(serialDescriptor, 0, video.f51402p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || video.f51404q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, video.f51404q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || video.f51406r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, video.f51406r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || Float.compare(video.f51408s, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 3, video.f51408s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || video.f51410t != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 4, video.f51410t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || Float.compare(video.f51412u, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 5, video.f51412u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || video.f51414v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, video.f51414v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || video.f51415w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, video.f51415w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || video.f51416x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26814n1.f127034a, video.f51416x);
        }
        interfaceC21886d.mo114029i(serialDescriptor, 9, Channel$$serializer.INSTANCE, video.f51417y);
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || video.f51418z != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 10, video.f51418z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || video.f51361A != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 11, video.f51361A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || video.f51362B != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 12, video.f51362B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || video.f51363C != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 13, video.f51363C);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || video.f51364D != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 14, video.f51364D);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || video.f51365E) {
            interfaceC21886d.mo114034y(serialDescriptor, 15, video.f51365E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || video.f51366F) {
            interfaceC21886d.mo114034y(serialDescriptor, 16, video.f51366F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || video.f51367G) {
            interfaceC21886d.mo114034y(serialDescriptor, 17, video.f51367G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || video.f51368H) {
            interfaceC21886d.mo114034y(serialDescriptor, 18, video.f51368H);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || video.f51369I) {
            interfaceC21886d.mo114034y(serialDescriptor, 19, video.f51369I);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || video.f51370J) {
            interfaceC21886d.mo114034y(serialDescriptor, 20, video.f51370J);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || video.f51371K) {
            interfaceC21886d.mo114034y(serialDescriptor, 21, video.f51371K);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || video.f51372L) {
            interfaceC21886d.mo114034y(serialDescriptor, 22, video.f51372L);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 23) || video.f51373M) {
            interfaceC21886d.mo114034y(serialDescriptor, 23, video.f51373M);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 24) || video.f51374N) {
            interfaceC21886d.mo114034y(serialDescriptor, 24, video.f51374N);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 25) || !video.f51375O) {
            interfaceC21886d.mo114034y(serialDescriptor, 25, video.f51375O);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 26) || video.f51376P != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 26, C26814n1.f127034a, video.f51376P);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 27) || video.f51377Q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 27, C26814n1.f127034a, video.f51377Q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 28) || video.f51378R != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 28, video.f51378R);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 29) || video.f51379S != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 29, C26814n1.f127034a, video.f51379S);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 30) || video.f51380T != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 30, video.f51380T);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 31) || video.f51381U != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 31, C26814n1.f127034a, video.f51381U);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 32) || video.f51382V != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 32, C26814n1.f127034a, video.f51382V);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 33) || video.f51383W != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 33, C26814n1.f127034a, video.f51383W);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 34) || video.f51384X != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 34, C26814n1.f127034a, video.f51384X);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 35) || video.f51385Y != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 35, C26814n1.f127034a, video.f51385Y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 36) || video.f51386Z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 36, C26814n1.f127034a, video.f51386Z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 37) || video.f51387a0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 37, C26783d0.f126989a, video.f51387a0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 38) || video.f51388b0) {
            interfaceC21886d.mo114034y(serialDescriptor, 38, video.f51388b0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 39) || video.f51389c0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 39, C26814n1.f127034a, video.f51389c0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 40) || video.f51390d0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 40, C26814n1.f127034a, video.f51390d0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 41) || video.f51391e0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 41, C26814n1.f127034a, video.f51391e0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 42) || video.f51392f0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 42, VideoPromote$$serializer.INSTANCE, video.f51392f0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 43) || video.f51393g0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 43, FooterVideoPromote$$serializer.INSTANCE, video.f51393g0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 44) || video.f51394h0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 44, kSerializerArr[44], video.f51394h0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 45) || video.f51395i0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 45, C26794h.f127000a, video.f51395i0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 46) || video.f51396j0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 46, C26794h.f127000a, video.f51396j0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 47) || video.f51397k0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 47, C26794h.f127000a, video.f51397k0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 48) || video.f51398l0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 48, C26794h.f127000a, video.f51398l0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 49) || video.f51399m0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 49, C26783d0.f126989a, video.f51399m0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 50) || video.f51400n0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 50, VideoAdsInfo$$serializer.INSTANCE, video.f51400n0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 51) || video.f51401o0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 51, kSerializerArr[51], video.f51401o0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 52) || video.f51403p0 != -1) {
            interfaceC21886d.mo114022E(serialDescriptor, 52, video.f51403p0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 53) || video.f51405q0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 53, kSerializerArr[53], video.f51405q0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 54) || video.f51407r0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 54, C26783d0.f126989a, video.f51407r0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 55) || video.f51409s0 != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 55, C26783d0.f126989a, video.f51409s0);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 56) || video.f51411t0) {
            interfaceC21886d.mo114034y(serialDescriptor, 56, video.f51411t0);
        }
        if (!interfaceC21886d.mo114019A(serialDescriptor, 57) && video.f51413u0 == null) {
            return;
        }
        interfaceC21886d.mo114028h(serialDescriptor, 57, C26814n1.f127034a, video.f51413u0);
    }

    /* renamed from: A0 */
    public final boolean m52834A0() {
        return this.f51400n0 != null;
    }

    /* renamed from: B */
    public final long m52835B() {
        return this.f51364D;
    }

    /* renamed from: B0 */
    public final boolean m52836B0() {
        Integer num = this.f51407r0;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final long m52837C() {
        return this.f51362B;
    }

    /* renamed from: C0 */
    public final void m52838C0(PersonalizeVideo personalizeVideo) {
        AbstractC19074t.m100208f(personalizeVideo, "video");
        this.f51373M = personalizeVideo.m52819h();
        this.f51368H = personalizeVideo.m52815d();
        this.f51369I = personalizeVideo.m52814c();
        this.f51417y.m50770l0(personalizeVideo.m52817f());
        this.f51374N = personalizeVideo.m52816e();
        this.f51395i0 = Boolean.valueOf(personalizeVideo.m52820i());
        this.f51396j0 = Boolean.valueOf(personalizeVideo.m52818g());
    }

    /* renamed from: D */
    public final long m52839D() {
        return this.f51361A;
    }

    /* renamed from: D0 */
    public final void m52840D0(VideoAdsInfo videoAdsInfo) {
        this.f51400n0 = videoAdsInfo;
    }

    /* renamed from: E0 */
    public final void m52841E0(boolean z11) {
        this.f51366F = z11;
    }

    /* renamed from: F */
    public final long m52842F() {
        return this.f51363C;
    }

    /* renamed from: F0 */
    public final void m52843F0(boolean z11) {
        this.f51369I = z11;
    }

    /* renamed from: G0 */
    public final void m52844G0(boolean z11) {
        this.f51368H = z11;
    }

    /* renamed from: H */
    public final long m52845H() {
        return this.f51418z;
    }

    /* renamed from: H0 */
    public final void m52846H0(boolean z11) {
        this.f51374N = z11;
    }

    /* renamed from: I */
    public final float m52847I() {
        return this.f51408s;
    }

    /* renamed from: I0 */
    public final void m52848I0(String str) {
        this.f51390d0 = str;
    }

    /* renamed from: J */
    public final String m52849J() {
        return this.f51391e0;
    }

    /* renamed from: J0 */
    public final void m52850J0(boolean z11) {
        this.f51388b0 = z11;
    }

    /* renamed from: K */
    public final String m52851K() {
        return this.f51383W;
    }

    /* renamed from: K0 */
    public final void m52852K0(boolean z11) {
        this.f51373M = z11;
    }

    /* renamed from: L0 */
    public final void m52853L0(Integer num) {
        this.f51387a0 = num;
    }

    /* renamed from: M */
    public final String m52854M() {
        return this.f51382V;
    }

    /* renamed from: M0 */
    public final void m52855M0(Integer num) {
        this.f51409s0 = num;
    }

    /* renamed from: N */
    public final String m52856N() {
        return this.f51376P;
    }

    /* renamed from: N0 */
    public final void m52857N0(long j11) {
        this.f51364D = j11;
    }

    /* renamed from: O */
    public final String m52858O() {
        return this.f51385Y;
    }

    /* renamed from: O0 */
    public final void m52859O0(long j11) {
        this.f51362B = j11;
    }

    /* renamed from: P0 */
    public final void m52860P0(long j11) {
        this.f51361A = j11;
    }

    /* renamed from: Q */
    public final String m52861Q() {
        return this.f51386Z;
    }

    /* renamed from: Q0 */
    public final void m52862Q0(boolean z11) {
        this.f51371K = z11;
    }

    /* renamed from: R */
    public final int m52863R() {
        return this.f51380T;
    }

    /* renamed from: R0 */
    public final void m52864R0(float f11) {
        this.f51408s = f11;
    }

    /* renamed from: S */
    public final String m52865S() {
        return this.f51381U;
    }

    /* renamed from: S0 */
    public final void m52866S0(String str) {
        this.f51376P = str;
    }

    /* renamed from: T */
    public final String m52867T() {
        return this.f51415w;
    }

    /* renamed from: T0 */
    public final void m52868T0(String str) {
        this.f51385Y = str;
    }

    /* renamed from: U */
    public final Boolean m52869U() {
        return this.f51397k0;
    }

    /* renamed from: U0 */
    public final void m52870U0(String str) {
        this.f51386Z = str;
    }

    /* renamed from: V */
    public final String m52871V() {
        if (m52834A0()) {
            String str = this.f51402p;
            VideoAdsInfo videoAdsInfo = this.f51400n0;
            AbstractC19074t.m100205c(videoAdsInfo);
            String m52928d = videoAdsInfo.m52928d();
            VideoAdsInfo videoAdsInfo2 = this.f51400n0;
            AbstractC19074t.m100205c(videoAdsInfo2);
            return str + "-" + m52928d + "-" + videoAdsInfo2.m52933i();
        }
        return this.f51402p;
    }

    /* renamed from: V0 */
    public final void m52872V0(Boolean bool) {
        this.f51396j0 = bool;
    }

    /* renamed from: W */
    public final VideoPromote m52873W() {
        return this.f51392f0;
    }

    /* renamed from: W0 */
    public final void m52874W0(Boolean bool) {
        this.f51395i0 = bool;
    }

    /* renamed from: X */
    public final float m52875X() {
        return this.f51412u;
    }

    /* renamed from: X0 */
    public final void m52876X0(String str) {
        this.f51415w = str;
    }

    /* renamed from: Y */
    public final boolean m52877Y() {
        return !AbstractC19074t.m100204b(this.f51417y, Channel.Anonymous.f49775h0);
    }

    /* renamed from: Y0 */
    public final void m52878Y0(Integer num) {
        this.f51407r0 = num;
    }

    /* renamed from: Z */
    public final boolean m52879Z() {
        boolean m127128x;
        boolean m127126v;
        String str = this.f51404q;
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                m127126v = AbstractC24341v.m127126v(this.f51404q, "null", true);
                if (!m127126v) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m52880a0() {
        return this.f51370J;
    }

    /* renamed from: b */
    public final VideoAdsInfo m52881b() {
        return this.f51400n0;
    }

    /* renamed from: b0 */
    public final boolean m52882b0() {
        return this.f51367G;
    }

    /* renamed from: c */
    public final String m52883c() {
        return this.f51377Q;
    }

    /* renamed from: d */
    public final List m52884d() {
        return this.f51394h0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Integer m52885e() {
        return this.f51399m0;
    }

    /* renamed from: e0 */
    public final boolean m52886e0() {
        return this.f51366F;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return AbstractC19074t.m100204b(this.f51402p, video.f51402p) && AbstractC19074t.m100204b(this.f51404q, video.f51404q) && AbstractC19074t.m100204b(this.f51406r, video.f51406r) && Float.compare(this.f51408s, video.f51408s) == 0 && this.f51410t == video.f51410t && Float.compare(this.f51412u, video.f51412u) == 0 && AbstractC19074t.m100204b(this.f51414v, video.f51414v) && AbstractC19074t.m100204b(this.f51415w, video.f51415w) && AbstractC19074t.m100204b(this.f51416x, video.f51416x) && AbstractC19074t.m100204b(this.f51417y, video.f51417y) && this.f51418z == video.f51418z && this.f51361A == video.f51361A && this.f51362B == video.f51362B && this.f51363C == video.f51363C && this.f51364D == video.f51364D && this.f51365E == video.f51365E && this.f51366F == video.f51366F && this.f51367G == video.f51367G && this.f51368H == video.f51368H && this.f51369I == video.f51369I && this.f51370J == video.f51370J && this.f51371K == video.f51371K && this.f51372L == video.f51372L && this.f51373M == video.f51373M && this.f51374N == video.f51374N && this.f51375O == video.f51375O && AbstractC19074t.m100204b(this.f51376P, video.f51376P) && AbstractC19074t.m100204b(this.f51377Q, video.f51377Q) && this.f51378R == video.f51378R && AbstractC19074t.m100204b(this.f51379S, video.f51379S) && this.f51380T == video.f51380T && AbstractC19074t.m100204b(this.f51381U, video.f51381U) && AbstractC19074t.m100204b(this.f51382V, video.f51382V) && AbstractC19074t.m100204b(this.f51383W, video.f51383W) && AbstractC19074t.m100204b(this.f51384X, video.f51384X) && AbstractC19074t.m100204b(this.f51385Y, video.f51385Y) && AbstractC19074t.m100204b(this.f51386Z, video.f51386Z) && AbstractC19074t.m100204b(this.f51387a0, video.f51387a0) && this.f51388b0 == video.f51388b0 && AbstractC19074t.m100204b(this.f51389c0, video.f51389c0) && AbstractC19074t.m100204b(this.f51390d0, video.f51390d0) && AbstractC19074t.m100204b(this.f51391e0, video.f51391e0) && AbstractC19074t.m100204b(this.f51392f0, video.f51392f0) && AbstractC19074t.m100204b(this.f51393g0, video.f51393g0) && AbstractC19074t.m100204b(this.f51394h0, video.f51394h0) && AbstractC19074t.m100204b(this.f51395i0, video.f51395i0) && AbstractC19074t.m100204b(this.f51396j0, video.f51396j0) && AbstractC19074t.m100204b(this.f51397k0, video.f51397k0) && AbstractC19074t.m100204b(this.f51398l0, video.f51398l0) && AbstractC19074t.m100204b(this.f51399m0, video.f51399m0) && AbstractC19074t.m100204b(this.f51400n0, video.f51400n0) && AbstractC19074t.m100204b(this.f51401o0, video.f51401o0) && this.f51403p0 == video.f51403p0 && AbstractC19074t.m100204b(this.f51405q0, video.f51405q0) && AbstractC19074t.m100204b(this.f51407r0, video.f51407r0) && AbstractC19074t.m100204b(this.f51409s0, video.f51409s0) && this.f51411t0 == video.f51411t0 && AbstractC19074t.m100204b(this.f51413u0, video.f51413u0);
    }

    /* renamed from: f */
    public final Channel m52887f() {
        return this.f51417y;
    }

    /* renamed from: g */
    public final long m52888g() {
        return this.f51378R;
    }

    /* renamed from: g0 */
    public final boolean m52889g0() {
        return this.f51365E;
    }

    /* renamed from: h */
    public final String m52890h() {
        return this.f51384X;
    }

    /* renamed from: h0 */
    public final boolean m52891h0() {
        return this.f51369I;
    }

    public int hashCode() {
        int hashCode = this.f51402p.hashCode() * 31;
        String str = this.f51404q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51406r;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Float.floatToIntBits(this.f51408s)) * 31) + AbstractC2147g0.m11521a(this.f51410t)) * 31) + Float.floatToIntBits(this.f51412u)) * 31;
        String str3 = this.f51414v;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51415w;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51416x;
        int hashCode6 = (((((((((((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f51417y.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f51418z)) * 31) + AbstractC2147g0.m11521a(this.f51361A)) * 31) + AbstractC2147g0.m11521a(this.f51362B)) * 31) + AbstractC2147g0.m11521a(this.f51363C)) * 31) + AbstractC2147g0.m11521a(this.f51364D)) * 31) + AbstractC2144f.m11520a(this.f51365E)) * 31) + AbstractC2144f.m11520a(this.f51366F)) * 31) + AbstractC2144f.m11520a(this.f51367G)) * 31) + AbstractC2144f.m11520a(this.f51368H)) * 31) + AbstractC2144f.m11520a(this.f51369I)) * 31) + AbstractC2144f.m11520a(this.f51370J)) * 31) + AbstractC2144f.m11520a(this.f51371K)) * 31) + AbstractC2144f.m11520a(this.f51372L)) * 31) + AbstractC2144f.m11520a(this.f51373M)) * 31) + AbstractC2144f.m11520a(this.f51374N)) * 31) + AbstractC2144f.m11520a(this.f51375O)) * 31;
        String str6 = this.f51376P;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f51377Q;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f51378R)) * 31;
        String str8 = this.f51379S;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f51380T) * 31;
        String str9 = this.f51381U;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f51382V;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f51383W;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f51384X;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f51385Y;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f51386Z;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.f51387a0;
        int hashCode16 = (((hashCode15 + (num == null ? 0 : num.hashCode())) * 31) + AbstractC2144f.m11520a(this.f51388b0)) * 31;
        String str15 = this.f51389c0;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f51390d0;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f51391e0;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        VideoPromote videoPromote = this.f51392f0;
        int hashCode20 = (hashCode19 + (videoPromote == null ? 0 : videoPromote.hashCode())) * 31;
        FooterVideoPromote footerVideoPromote = this.f51393g0;
        int hashCode21 = (hashCode20 + (footerVideoPromote == null ? 0 : footerVideoPromote.hashCode())) * 31;
        List list = this.f51394h0;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f51395i0;
        int hashCode23 = (hashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f51396j0;
        int hashCode24 = (hashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f51397k0;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f51398l0;
        int hashCode26 = (hashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.f51399m0;
        int hashCode27 = (hashCode26 + (num2 == null ? 0 : num2.hashCode())) * 31;
        VideoAdsInfo videoAdsInfo = this.f51400n0;
        int hashCode28 = (hashCode27 + (videoAdsInfo == null ? 0 : videoAdsInfo.hashCode())) * 31;
        List list2 = this.f51401o0;
        int hashCode29 = (((hashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f51403p0)) * 31;
        List list3 = this.f51405q0;
        int hashCode30 = (hashCode29 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num3 = this.f51407r0;
        int hashCode31 = (hashCode30 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f51409s0;
        int hashCode32 = (((hashCode31 + (num4 == null ? 0 : num4.hashCode())) * 31) + AbstractC2144f.m11520a(this.f51411t0)) * 31;
        String str18 = this.f51413u0;
        return hashCode32 + (str18 != null ? str18.hashCode() : 0);
    }

    /* renamed from: i */
    public final List m52892i() {
        return this.f51405q0;
    }

    /* renamed from: i0 */
    public final boolean m52893i0() {
        return this.f51368H;
    }

    /* renamed from: j */
    public final String m52894j() {
        return this.f51416x;
    }

    /* renamed from: j0 */
    public final boolean m52895j0() {
        return this.f51374N;
    }

    /* renamed from: k */
    public final String m52896k() {
        return this.f51389c0;
    }

    /* renamed from: k0 */
    public final Boolean m52897k0() {
        return this.f51398l0;
    }

    /* renamed from: l */
    public final String m52898l() {
        return this.f51414v;
    }

    /* renamed from: l0 */
    public final boolean m52899l0() {
        return this.f51384X != null;
    }

    /* renamed from: m */
    public final FooterVideoPromote m52900m() {
        return this.f51393g0;
    }

    /* renamed from: m0 */
    public final boolean m52901m0() {
        return AbstractC19074t.m100204b(this.f51402p, "-1");
    }

    /* renamed from: n */
    public final boolean m52902n() {
        return this.f51411t0;
    }

    /* renamed from: n0 */
    public final boolean m52903n0() {
        if (m52877Y() && m52905o0()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final String m52904o() {
        return this.f51390d0;
    }

    /* renamed from: o0 */
    public final boolean m52905o0() {
        if (m52879Z() && this.f51380T == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final String m52906p() {
        return this.f51406r;
    }

    /* renamed from: p0 */
    public final boolean m52907p0() {
        return this.f51388b0;
    }

    /* renamed from: q */
    public final String m52908q() {
        return this.f51404q;
    }

    /* renamed from: q0 */
    public final boolean m52909q0() {
        return this.f51373M;
    }

    /* renamed from: r0 */
    public final boolean m52910r0() {
        return this.f51372L;
    }

    /* renamed from: t */
    public final String m52911t() {
        return this.f51402p;
    }

    /* renamed from: t0 */
    public final boolean m52912t0() {
        return this.f51371K;
    }

    public String toString() {
        return "Video(id=" + this.f51402p + ", hls=" + this.f51404q + ", h265=" + this.f51406r + ", ratio=" + this.f51408s + ", duration=" + this.f51410t + ", volume=" + this.f51412u + ", firstFrame=" + this.f51414v + ", thumbnail=" + this.f51415w + ", description=" + this.f51416x + ", channel=" + this.f51417y + ", numOfView=" + this.f51418z + ", numOfLike=" + this.f51361A + ", numOfComment=" + this.f51362B + ", numOfShare=" + this.f51363C + ", numOfBookmark=" + this.f51364D + ", isBlockLike=" + this.f51365E + ", isBlockComment=" + this.f51366F + ", isBlockBookmark=" + this.f51367G + ", isBlockMyUser=" + this.f51368H + ", isBlockMyChannel=" + this.f51369I + ", isAllowSeek=" + this.f51370J + ", isPinned=" + this.f51371K + ", isMuted=" + this.f51372L + ", isLiked=" + this.f51373M + ", isBookmarked=" + this.f51374N + ", isPublic=" + this.f51375O + ", shareUrl=" + this.f51376P + ", analyticUrl=" + this.f51377Q + ", createdTime=" + this.f51378R + ", zmcId=" + this.f51379S + ", statusCode=" + this.f51380T + ", statusMessage=" + this.f51381U + ", sensitiveTitle=" + this.f51382V + ", sensitiveMessage=" + this.f51383W + ", dangerousMessage=" + this.f51384X + ", source=" + this.f51385Y + ", sourceInfo=" + this.f51386Z + ", listIndex=" + this.f51387a0 + ", isImpression=" + this.f51388b0 + ", extra=" + this.f51389c0 + ", fromRelatedId=" + this.f51390d0 + ", reportURL=" + this.f51391e0 + ", videoPromote=" + this.f51392f0 + ", footerPromote=" + this.f51393g0 + ", btSheet=" + this.f51394h0 + ", isSuggestShare=" + this.f51395i0 + ", isSuggestLike=" + this.f51396j0 + ", turnOfLockComment=" + this.f51397k0 + ", isCommentCensored=" + this.f51398l0 + ", cateId=" + this.f51399m0 + ", adsInfo=" + this.f51400n0 + ", labels=" + this.f51401o0 + ", linkExpiration=" + this.f51403p0 + ", descCta=" + this.f51405q0 + ", videoType=" + this.f51407r0 + ", listIndexBase=" + this.f51409s0 + ", forceShowSimilarVideos=" + this.f51411t0 + ", identifier=" + this.f51413u0 + ")";
    }

    /* renamed from: u */
    public final String m52913u() {
        return this.f51413u0;
    }

    /* renamed from: u0 */
    public final boolean m52914u0() {
        return this.f51375O;
    }

    /* renamed from: v0 */
    public final boolean m52915v0() {
        return (this.f51382V == null && this.f51383W == null) ? false : true;
    }

    /* renamed from: w */
    public final List m52916w() {
        return this.f51401o0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51402p);
        parcel.writeString(this.f51404q);
        parcel.writeString(this.f51406r);
        parcel.writeFloat(this.f51408s);
        parcel.writeLong(this.f51410t);
        parcel.writeFloat(this.f51412u);
        parcel.writeString(this.f51414v);
        parcel.writeString(this.f51415w);
        parcel.writeString(this.f51416x);
        parcel.writeParcelable(this.f51417y, i11);
        parcel.writeLong(this.f51418z);
        parcel.writeLong(this.f51361A);
        parcel.writeLong(this.f51362B);
        parcel.writeLong(this.f51363C);
        parcel.writeLong(this.f51364D);
        parcel.writeInt(this.f51365E ? 1 : 0);
        parcel.writeInt(this.f51366F ? 1 : 0);
        parcel.writeInt(this.f51367G ? 1 : 0);
        parcel.writeInt(this.f51368H ? 1 : 0);
        parcel.writeInt(this.f51369I ? 1 : 0);
        parcel.writeInt(this.f51370J ? 1 : 0);
        parcel.writeInt(this.f51371K ? 1 : 0);
        parcel.writeInt(this.f51372L ? 1 : 0);
        parcel.writeInt(this.f51373M ? 1 : 0);
        parcel.writeInt(this.f51374N ? 1 : 0);
        parcel.writeInt(this.f51375O ? 1 : 0);
        parcel.writeString(this.f51376P);
        parcel.writeString(this.f51377Q);
        parcel.writeLong(this.f51378R);
        parcel.writeString(this.f51379S);
        parcel.writeInt(this.f51380T);
        parcel.writeString(this.f51381U);
        parcel.writeString(this.f51382V);
        parcel.writeString(this.f51383W);
        parcel.writeString(this.f51384X);
        parcel.writeString(this.f51385Y);
        parcel.writeString(this.f51386Z);
        Integer num = this.f51387a0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f51388b0 ? 1 : 0);
        parcel.writeString(this.f51389c0);
        parcel.writeString(this.f51390d0);
        parcel.writeString(this.f51391e0);
        VideoPromote videoPromote = this.f51392f0;
        if (videoPromote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoPromote.writeToParcel(parcel, i11);
        }
        FooterVideoPromote footerVideoPromote = this.f51393g0;
        if (footerVideoPromote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footerVideoPromote.writeToParcel(parcel, i11);
        }
        List list = this.f51394h0;
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
        Boolean bool = this.f51395i0;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f51396j0;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.f51397k0;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.f51398l0;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.f51399m0;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        VideoAdsInfo videoAdsInfo = this.f51400n0;
        if (videoAdsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAdsInfo.writeToParcel(parcel, i11);
        }
        List list2 = this.f51401o0;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((VideoLabel) it2.next()).writeToParcel(parcel, i11);
            }
        }
        parcel.writeLong(this.f51403p0);
        List list3 = this.f51405q0;
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
        Integer num3 = this.f51407r0;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.f51409s0;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeInt(this.f51411t0 ? 1 : 0);
        parcel.writeString(this.f51413u0);
    }

    /* renamed from: x */
    public final long m52917x() {
        return this.f51403p0;
    }

    /* renamed from: x0 */
    public final Boolean m52918x0() {
        return this.f51396j0;
    }

    /* renamed from: y */
    public final Integer m52919y() {
        return this.f51387a0;
    }

    /* renamed from: z */
    public final Integer m52920z() {
        return this.f51409s0;
    }

    /* renamed from: z0 */
    public final Boolean m52921z0() {
        return this.f51395i0;
    }

    public Video(String str, String str2, String str3, float f11, long j11, float f12, String str4, String str5, String str6, Channel channel, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, String str7, String str8, long j17, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, boolean z23, String str16, String str17, String str18, VideoPromote videoPromote, FooterVideoPromote footerVideoPromote, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, VideoAdsInfo videoAdsInfo, List list2, long j18, List list3, Integer num3, Integer num4, boolean z24, String str19) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(channel, "channel");
        this.f51402p = str;
        this.f51404q = str2;
        this.f51406r = str3;
        this.f51408s = f11;
        this.f51410t = j11;
        this.f51412u = f12;
        this.f51414v = str4;
        this.f51415w = str5;
        this.f51416x = str6;
        this.f51417y = channel;
        this.f51418z = j12;
        this.f51361A = j13;
        this.f51362B = j14;
        this.f51363C = j15;
        this.f51364D = j16;
        this.f51365E = z11;
        this.f51366F = z12;
        this.f51367G = z13;
        this.f51368H = z14;
        this.f51369I = z15;
        this.f51370J = z16;
        this.f51371K = z17;
        this.f51372L = z18;
        this.f51373M = z19;
        this.f51374N = z21;
        this.f51375O = z22;
        this.f51376P = str7;
        this.f51377Q = str8;
        this.f51378R = j17;
        this.f51379S = str9;
        this.f51380T = i11;
        this.f51381U = str10;
        this.f51382V = str11;
        this.f51383W = str12;
        this.f51384X = str13;
        this.f51385Y = str14;
        this.f51386Z = str15;
        this.f51387a0 = num;
        this.f51388b0 = z23;
        this.f51389c0 = str16;
        this.f51390d0 = str17;
        this.f51391e0 = str18;
        this.f51392f0 = videoPromote;
        this.f51393g0 = footerVideoPromote;
        this.f51394h0 = list;
        this.f51395i0 = bool;
        this.f51396j0 = bool2;
        this.f51397k0 = bool3;
        this.f51398l0 = bool4;
        this.f51399m0 = num2;
        this.f51400n0 = videoAdsInfo;
        this.f51401o0 = list2;
        this.f51403p0 = j18;
        this.f51405q0 = list3;
        this.f51407r0 = num3;
        this.f51409s0 = num4;
        this.f51411t0 = z24;
        this.f51413u0 = str19;
    }

    public /* synthetic */ Video(String str, String str2, String str3, float f11, long j11, float f12, String str4, String str5, String str6, Channel channel, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, String str7, String str8, long j17, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, boolean z23, String str16, String str17, String str18, VideoPromote videoPromote, FooterVideoPromote footerVideoPromote, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, VideoAdsInfo videoAdsInfo, List list2, long j18, List list3, Integer num3, Integer num4, boolean z24, String str19, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? 0L : j11, (i12 & 32) != 0 ? 1.0f : f12, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : str6, channel, (i12 & 1024) != 0 ? 0L : j12, (i12 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0L : j13, (i12 & 4096) != 0 ? 0L : j14, (i12 & 8192) != 0 ? 0L : j15, (i12 & 16384) != 0 ? 0L : j16, (i12 & 32768) != 0 ? false : z11, (i12 & 65536) != 0 ? false : z12, (i12 & 131072) != 0 ? false : z13, (i12 & 262144) != 0 ? false : z14, (i12 & 524288) != 0 ? false : z15, (i12 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? false : z16, (i12 & 2097152) != 0 ? false : z17, (i12 & 4194304) != 0 ? false : z18, (i12 & 8388608) != 0 ? false : z19, (i12 & 16777216) != 0 ? false : z21, (i12 & 33554432) != 0 ? true : z22, (i12 & 67108864) != 0 ? null : str7, (i12 & 134217728) != 0 ? null : str8, (i12 & 268435456) != 0 ? 0L : j17, (536870912 & i12) != 0 ? null : str9, (1073741824 & i12) != 0 ? 0 : i11, (i12 & Integer.MIN_VALUE) != 0 ? null : str10, (i13 & 1) != 0 ? null : str11, (i13 & 2) != 0 ? null : str12, (i13 & 4) != 0 ? null : str13, (i13 & 8) != 0 ? null : str14, (i13 & 16) != 0 ? null : str15, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? false : z23, (i13 & 128) != 0 ? null : str16, (i13 & 256) != 0 ? null : str17, (i13 & 512) != 0 ? null : str18, (i13 & 1024) != 0 ? null : videoPromote, (i13 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : footerVideoPromote, (i13 & 4096) != 0 ? null : list, (i13 & 8192) != 0 ? null : bool, (i13 & 16384) != 0 ? null : bool2, (32768 & i13) != 0 ? null : bool3, (i13 & 65536) != 0 ? null : bool4, (i13 & 131072) != 0 ? null : num2, (i13 & 262144) != 0 ? null : videoAdsInfo, (i13 & 524288) != 0 ? null : list2, (1048576 & i13) != 0 ? -1L : j18, (2097152 & i13) != 0 ? null : list3, (4194304 & i13) != 0 ? null : num3, (8388608 & i13) != 0 ? null : num4, (16777216 & i13) != 0 ? false : z24, (i13 & 33554432) == 0 ? str19 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Video(VideoData videoData) {
        this(videoData.m51371t(), videoData.m51368q(), videoData.m51366p(), videoData.m51296H(), videoData.m51354j(), videoData.m51322V(), videoData.m51358l(), videoData.m51316S(), videoData.m51352i(), videoData.m51341e(), videoData.m51293F(), videoData.m51288C(), videoData.m51286B(), videoData.m51290D(), videoData.m51380z(), videoData.m51332a0(), videoData.m51330Z(), videoData.m51328Y(), videoData.m51342e0(), videoData.m51335b0(), videoData.m51326X(), videoData.m51359l0(), videoData.m51357k0(), videoData.m51355j0(), videoData.m51347g0(), videoData.m51361m0(), videoData.m51305M(), videoData.m51334b(), videoData.m51344f(), videoData.m51324W(), videoData.m51312Q(), videoData.m51314R(), videoData.m51302K(), videoData.m51300J(), videoData.m51346g(), videoData.m51307N(), videoData.m51309O(), videoData.m51379y(), videoData.m51353i0(), videoData.m51356k(), videoData.m51364o(), videoData.m51298I(), videoData.m51320U(), videoData.m51360m(), videoData.m51337c(), videoData.m51365o0(), videoData.m51363n0(), videoData.m51318T(), videoData.m51350h0(), videoData.m51339d(), (VideoAdsInfo) null, videoData.m51376w(), videoData.m51377x(), videoData.m51349h(), (Integer) null, (Integer) null, videoData.m51362n(), videoData.m51373u(), 0, 12845056, (AbstractC19060k) null);
        AbstractC19074t.m100208f(videoData, "data");
        InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
        InterfaceC29283d.a.m146385b(m143692z, this.f51402p, null, Long.valueOf(this.f51361A), 2, null);
        InterfaceC29283d.a.m146384a(m143692z, this.f51402p, null, Long.valueOf(this.f51364D), 2, null);
    }
}
