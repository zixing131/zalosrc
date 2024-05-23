package com.zing.zalo.shortvideo.data.p071db.entities;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogViewVideo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49686a;

    /* renamed from: b */
    private final String f49687b;

    /* renamed from: c */
    private final Long f49688c;

    /* renamed from: d */
    private final Integer f49689d;

    /* renamed from: e */
    private final Integer f49690e;

    /* renamed from: f */
    private final Integer f49691f;

    /* renamed from: g */
    private final Long f49692g;

    /* renamed from: h */
    private final Long f49693h;

    /* renamed from: i */
    private final Long f49694i;

    /* renamed from: j */
    private final Boolean f49695j;

    /* renamed from: k */
    private final Boolean f49696k;

    /* renamed from: l */
    private final String f49697l;

    /* renamed from: m */
    private final String f49698m;

    /* renamed from: n */
    private final Boolean f49699n;

    /* renamed from: o */
    private final Boolean f49700o;

    /* renamed from: p */
    private final String f49701p;

    /* renamed from: q */
    private final Integer f49702q;

    /* renamed from: r */
    private final Boolean f49703r;

    /* renamed from: s */
    private final String f49704s;

    /* renamed from: t */
    private final String f49705t;

    /* renamed from: u */
    private final String f49706u;

    /* renamed from: v */
    private final Boolean f49707v;

    /* renamed from: w */
    private final Boolean f49708w;

    /* renamed from: x */
    private final String f49709x;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogViewVideo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogViewVideo(int i11, String str, String str2, Long l11, Integer num, Integer num2, Integer num3, Long l12, Long l13, Long l14, Boolean bool, Boolean bool2, String str3, String str4, Boolean bool3, Boolean bool4, String str5, Integer num4, Boolean bool5, String str6, String str7, String str8, Boolean bool6, Boolean bool7, String str9, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49686a = null;
        } else {
            this.f49686a = str;
        }
        if ((i11 & 2) == 0) {
            this.f49687b = null;
        } else {
            this.f49687b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49688c = null;
        } else {
            this.f49688c = l11;
        }
        if ((i11 & 8) == 0) {
            this.f49689d = null;
        } else {
            this.f49689d = num;
        }
        if ((i11 & 16) == 0) {
            this.f49690e = null;
        } else {
            this.f49690e = num2;
        }
        if ((i11 & 32) == 0) {
            this.f49691f = null;
        } else {
            this.f49691f = num3;
        }
        if ((i11 & 64) == 0) {
            this.f49692g = null;
        } else {
            this.f49692g = l12;
        }
        if ((i11 & 128) == 0) {
            this.f49693h = null;
        } else {
            this.f49693h = l13;
        }
        if ((i11 & 256) == 0) {
            this.f49694i = null;
        } else {
            this.f49694i = l14;
        }
        if ((i11 & 512) == 0) {
            this.f49695j = null;
        } else {
            this.f49695j = bool;
        }
        if ((i11 & 1024) == 0) {
            this.f49696k = null;
        } else {
            this.f49696k = bool2;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49697l = null;
        } else {
            this.f49697l = str3;
        }
        if ((i11 & 4096) == 0) {
            this.f49698m = null;
        } else {
            this.f49698m = str4;
        }
        if ((i11 & 8192) == 0) {
            this.f49699n = null;
        } else {
            this.f49699n = bool3;
        }
        if ((i11 & 16384) == 0) {
            this.f49700o = null;
        } else {
            this.f49700o = bool4;
        }
        if ((32768 & i11) == 0) {
            this.f49701p = null;
        } else {
            this.f49701p = str5;
        }
        if ((65536 & i11) == 0) {
            this.f49702q = null;
        } else {
            this.f49702q = num4;
        }
        if ((131072 & i11) == 0) {
            this.f49703r = null;
        } else {
            this.f49703r = bool5;
        }
        if ((262144 & i11) == 0) {
            this.f49704s = null;
        } else {
            this.f49704s = str6;
        }
        if ((524288 & i11) == 0) {
            this.f49705t = null;
        } else {
            this.f49705t = str7;
        }
        if ((1048576 & i11) == 0) {
            this.f49706u = null;
        } else {
            this.f49706u = str8;
        }
        if ((2097152 & i11) == 0) {
            this.f49707v = null;
        } else {
            this.f49707v = bool6;
        }
        if ((4194304 & i11) == 0) {
            this.f49708w = null;
        } else {
            this.f49708w = bool7;
        }
        if ((i11 & 8388608) == 0) {
            this.f49709x = null;
        } else {
            this.f49709x = str9;
        }
    }

    /* renamed from: y */
    public static final /* synthetic */ void m50650y(LogViewVideo logViewVideo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logViewVideo.f49686a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, logViewVideo.f49686a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logViewVideo.f49687b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logViewVideo.f49687b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logViewVideo.f49688c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, logViewVideo.f49688c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logViewVideo.f49689d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26783d0.f126989a, logViewVideo.f49689d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logViewVideo.f49690e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26783d0.f126989a, logViewVideo.f49690e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || logViewVideo.f49691f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26783d0.f126989a, logViewVideo.f49691f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || logViewVideo.f49692g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26810m0.f127024a, logViewVideo.f49692g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || logViewVideo.f49693h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26810m0.f127024a, logViewVideo.f49693h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || logViewVideo.f49694i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26810m0.f127024a, logViewVideo.f49694i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || logViewVideo.f49695j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26794h.f127000a, logViewVideo.f49695j);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || logViewVideo.f49696k != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26794h.f127000a, logViewVideo.f49696k);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || logViewVideo.f49697l != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26814n1.f127034a, logViewVideo.f49697l);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || logViewVideo.f49698m != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 12, C26814n1.f127034a, logViewVideo.f49698m);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || logViewVideo.f49699n != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 13, C26794h.f127000a, logViewVideo.f49699n);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || logViewVideo.f49700o != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 14, C26794h.f127000a, logViewVideo.f49700o);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || logViewVideo.f49701p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 15, C26814n1.f127034a, logViewVideo.f49701p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || logViewVideo.f49702q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 16, C26783d0.f126989a, logViewVideo.f49702q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || logViewVideo.f49703r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 17, C26794h.f127000a, logViewVideo.f49703r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || logViewVideo.f49704s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 18, C26814n1.f127034a, logViewVideo.f49704s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || logViewVideo.f49705t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 19, C26814n1.f127034a, logViewVideo.f49705t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || logViewVideo.f49706u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 20, C26814n1.f127034a, logViewVideo.f49706u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || logViewVideo.f49707v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 21, C26794h.f127000a, logViewVideo.f49707v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || logViewVideo.f49708w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 22, C26794h.f127000a, logViewVideo.f49708w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 23) || logViewVideo.f49709x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 23, C26814n1.f127034a, logViewVideo.f49709x);
        }
    }

    /* renamed from: a */
    public final String m50651a() {
        return this.f49709x;
    }

    /* renamed from: b */
    public final Boolean m50652b() {
        return this.f49696k;
    }

    /* renamed from: c */
    public final Boolean m50653c() {
        return this.f49695j;
    }

    /* renamed from: d */
    public final String m50654d() {
        return this.f49706u;
    }

    /* renamed from: e */
    public final Boolean m50655e() {
        return this.f49703r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogViewVideo)) {
            return false;
        }
        LogViewVideo logViewVideo = (LogViewVideo) obj;
        return AbstractC19074t.m100204b(this.f49686a, logViewVideo.f49686a) && AbstractC19074t.m100204b(this.f49687b, logViewVideo.f49687b) && AbstractC19074t.m100204b(this.f49688c, logViewVideo.f49688c) && AbstractC19074t.m100204b(this.f49689d, logViewVideo.f49689d) && AbstractC19074t.m100204b(this.f49690e, logViewVideo.f49690e) && AbstractC19074t.m100204b(this.f49691f, logViewVideo.f49691f) && AbstractC19074t.m100204b(this.f49692g, logViewVideo.f49692g) && AbstractC19074t.m100204b(this.f49693h, logViewVideo.f49693h) && AbstractC19074t.m100204b(this.f49694i, logViewVideo.f49694i) && AbstractC19074t.m100204b(this.f49695j, logViewVideo.f49695j) && AbstractC19074t.m100204b(this.f49696k, logViewVideo.f49696k) && AbstractC19074t.m100204b(this.f49697l, logViewVideo.f49697l) && AbstractC19074t.m100204b(this.f49698m, logViewVideo.f49698m) && AbstractC19074t.m100204b(this.f49699n, logViewVideo.f49699n) && AbstractC19074t.m100204b(this.f49700o, logViewVideo.f49700o) && AbstractC19074t.m100204b(this.f49701p, logViewVideo.f49701p) && AbstractC19074t.m100204b(this.f49702q, logViewVideo.f49702q) && AbstractC19074t.m100204b(this.f49703r, logViewVideo.f49703r) && AbstractC19074t.m100204b(this.f49704s, logViewVideo.f49704s) && AbstractC19074t.m100204b(this.f49705t, logViewVideo.f49705t) && AbstractC19074t.m100204b(this.f49706u, logViewVideo.f49706u) && AbstractC19074t.m100204b(this.f49707v, logViewVideo.f49707v) && AbstractC19074t.m100204b(this.f49708w, logViewVideo.f49708w) && AbstractC19074t.m100204b(this.f49709x, logViewVideo.f49709x);
    }

    /* renamed from: f */
    public final String m50656f() {
        return this.f49687b;
    }

    /* renamed from: g */
    public final Long m50657g() {
        return this.f49692g;
    }

    /* renamed from: h */
    public final Integer m50658h() {
        return this.f49690e;
    }

    public int hashCode() {
        String str = this.f49686a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49687b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f49688c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f49689d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f49690e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f49691f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l12 = this.f49692g;
        int hashCode7 = (hashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f49693h;
        int hashCode8 = (hashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f49694i;
        int hashCode9 = (hashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.f49695j;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f49696k;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f49697l;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49698m;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.f49699n;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f49700o;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str5 = this.f49701p;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.f49702q;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool5 = this.f49703r;
        int hashCode18 = (hashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str6 = this.f49704s;
        int hashCode19 = (hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f49705t;
        int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f49706u;
        int hashCode21 = (hashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool6 = this.f49707v;
        int hashCode22 = (hashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f49708w;
        int hashCode23 = (hashCode22 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str9 = this.f49709x;
        return hashCode23 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m50659i() {
        return this.f49705t;
    }

    /* renamed from: j */
    public final String m50660j() {
        return this.f49701p;
    }

    /* renamed from: k */
    public final Integer m50661k() {
        return this.f49691f;
    }

    /* renamed from: l */
    public final String m50662l() {
        return this.f49704s;
    }

    /* renamed from: m */
    public final Boolean m50663m() {
        return this.f49707v;
    }

    /* renamed from: n */
    public final Boolean m50664n() {
        return this.f49708w;
    }

    /* renamed from: o */
    public final Long m50665o() {
        return this.f49694i;
    }

    /* renamed from: p */
    public final Integer m50666p() {
        return this.f49702q;
    }

    /* renamed from: q */
    public final Long m50667q() {
        return this.f49693h;
    }

    /* renamed from: r */
    public final String m50668r() {
        return this.f49697l;
    }

    /* renamed from: s */
    public final String m50669s() {
        return this.f49698m;
    }

    /* renamed from: t */
    public final Long m50670t() {
        return this.f49688c;
    }

    public String toString() {
        return "LogViewVideo(videoId=" + this.f49686a + ", channelId=" + this.f49687b + ", timeBuffering=" + this.f49688c + ", watchTime=" + this.f49689d + ", currentPlayTime=" + this.f49690e + ", duration=" + this.f49691f + ", commentCount=" + this.f49692g + ", shareCount=" + this.f49693h + ", likeCount=" + this.f49694i + ", allowShare=" + this.f49695j + ", allowComment=" + this.f49696k + ", source=" + this.f49697l + ", sourceInfo=" + this.f49698m + ", isSeen=" + this.f49699n + ", isLoop=" + this.f49700o + ", description=" + this.f49701p + ", listIndex=" + this.f49702q + ", autoScroll=" + this.f49703r + ", extra=" + this.f49704s + ", defaultParam=" + this.f49705t + ", apiExtra=" + this.f49706u + ", inSessionDislikedCate=" + this.f49707v + ", inSessionDislikedChannel=" + this.f49708w + ", adsInfo=" + this.f49709x + ")";
    }

    /* renamed from: u */
    public final String m50671u() {
        return this.f49686a;
    }

    /* renamed from: v */
    public final Integer m50672v() {
        return this.f49689d;
    }

    /* renamed from: w */
    public final Boolean m50673w() {
        return this.f49700o;
    }

    /* renamed from: x */
    public final Boolean m50674x() {
        return this.f49699n;
    }

    public LogViewVideo(String str, String str2, Long l11, Integer num, Integer num2, Integer num3, Long l12, Long l13, Long l14, Boolean bool, Boolean bool2, String str3, String str4, Boolean bool3, Boolean bool4, String str5, Integer num4, Boolean bool5, String str6, String str7, String str8, Boolean bool6, Boolean bool7, String str9) {
        this.f49686a = str;
        this.f49687b = str2;
        this.f49688c = l11;
        this.f49689d = num;
        this.f49690e = num2;
        this.f49691f = num3;
        this.f49692g = l12;
        this.f49693h = l13;
        this.f49694i = l14;
        this.f49695j = bool;
        this.f49696k = bool2;
        this.f49697l = str3;
        this.f49698m = str4;
        this.f49699n = bool3;
        this.f49700o = bool4;
        this.f49701p = str5;
        this.f49702q = num4;
        this.f49703r = bool5;
        this.f49704s = str6;
        this.f49705t = str7;
        this.f49706u = str8;
        this.f49707v = bool6;
        this.f49708w = bool7;
        this.f49709x = str9;
    }

    public /* synthetic */ LogViewVideo(String str, String str2, Long l11, Integer num, Integer num2, Integer num3, Long l12, Long l13, Long l14, Boolean bool, Boolean bool2, String str3, String str4, Boolean bool3, Boolean bool4, String str5, Integer num4, Boolean bool5, String str6, String str7, String str8, Boolean bool6, Boolean bool7, String str9, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : l12, (i11 & 128) != 0 ? null : l13, (i11 & 256) != 0 ? null : l14, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : bool2, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : str3, (i11 & 4096) != 0 ? null : str4, (i11 & 8192) != 0 ? null : bool3, (i11 & 16384) != 0 ? null : bool4, (i11 & 32768) != 0 ? null : str5, (i11 & 65536) != 0 ? null : num4, (i11 & 131072) != 0 ? null : bool5, (i11 & 262144) != 0 ? null : str6, (i11 & 524288) != 0 ? null : str7, (i11 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? null : str8, (i11 & 2097152) != 0 ? null : bool6, (i11 & 4194304) != 0 ? null : bool7, (i11 & 8388608) != 0 ? null : str9);
    }
}
