package com.zing.zalo.shortvideo.data.p071db.entities;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogSession {
    public static final Companion Companion = new Companion(null);

    /* renamed from: m */
    private static final KSerializer[] f49650m;

    /* renamed from: a */
    private final Long f49651a;

    /* renamed from: b */
    private final Long f49652b;

    /* renamed from: c */
    private final Integer f49653c;

    /* renamed from: d */
    private final Integer f49654d;

    /* renamed from: e */
    private final Integer f49655e;

    /* renamed from: f */
    private final Integer f49656f;

    /* renamed from: g */
    private final String f49657g;

    /* renamed from: h */
    private final String f49658h;

    /* renamed from: i */
    private final List f49659i;

    /* renamed from: j */
    private final List f49660j;

    /* renamed from: k */
    private final Long f49661k;

    /* renamed from: l */
    private final String f49662l;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogSession$$serializer.INSTANCE;
        }
    }

    static {
        C26814n1 c26814n1 = C26814n1.f127034a;
        f49650m = new KSerializer[]{null, null, null, null, null, null, null, null, new C26788f(c26814n1), new C26788f(c26814n1), null, null};
    }

    public /* synthetic */ LogSession(int i11, Long l11, Long l12, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list, List list2, Long l13, String str3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49651a = null;
        } else {
            this.f49651a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f49652b = null;
        } else {
            this.f49652b = l12;
        }
        if ((i11 & 4) == 0) {
            this.f49653c = null;
        } else {
            this.f49653c = num;
        }
        if ((i11 & 8) == 0) {
            this.f49654d = null;
        } else {
            this.f49654d = num2;
        }
        if ((i11 & 16) == 0) {
            this.f49655e = null;
        } else {
            this.f49655e = num3;
        }
        if ((i11 & 32) == 0) {
            this.f49656f = null;
        } else {
            this.f49656f = num4;
        }
        if ((i11 & 64) == 0) {
            this.f49657g = null;
        } else {
            this.f49657g = str;
        }
        if ((i11 & 128) == 0) {
            this.f49658h = null;
        } else {
            this.f49658h = str2;
        }
        if ((i11 & 256) == 0) {
            this.f49659i = null;
        } else {
            this.f49659i = list;
        }
        if ((i11 & 512) == 0) {
            this.f49660j = null;
        } else {
            this.f49660j = list2;
        }
        if ((i11 & 1024) == 0) {
            this.f49661k = null;
        } else {
            this.f49661k = l13;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49662l = null;
        } else {
            this.f49662l = str3;
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m50610n(LogSession logSession, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49650m;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logSession.f49651a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, logSession.f49651a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logSession.f49652b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, logSession.f49652b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logSession.f49653c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26783d0.f126989a, logSession.f49653c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logSession.f49654d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26783d0.f126989a, logSession.f49654d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logSession.f49655e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26783d0.f126989a, logSession.f49655e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || logSession.f49656f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26783d0.f126989a, logSession.f49656f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || logSession.f49657g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, logSession.f49657g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || logSession.f49658h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, logSession.f49658h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || logSession.f49659i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, kSerializerArr[8], logSession.f49659i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || logSession.f49660j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, kSerializerArr[9], logSession.f49660j);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || logSession.f49661k != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26810m0.f127024a, logSession.f49661k);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || logSession.f49662l != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26814n1.f127034a, logSession.f49662l);
        }
    }

    /* renamed from: b */
    public final String m50611b() {
        return this.f49662l;
    }

    /* renamed from: c */
    public final Long m50612c() {
        return this.f49661k;
    }

    /* renamed from: d */
    public final String m50613d() {
        return this.f49657g;
    }

    /* renamed from: e */
    public final List m50614e() {
        return this.f49659i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogSession)) {
            return false;
        }
        LogSession logSession = (LogSession) obj;
        return AbstractC19074t.m100204b(this.f49651a, logSession.f49651a) && AbstractC19074t.m100204b(this.f49652b, logSession.f49652b) && AbstractC19074t.m100204b(this.f49653c, logSession.f49653c) && AbstractC19074t.m100204b(this.f49654d, logSession.f49654d) && AbstractC19074t.m100204b(this.f49655e, logSession.f49655e) && AbstractC19074t.m100204b(this.f49656f, logSession.f49656f) && AbstractC19074t.m100204b(this.f49657g, logSession.f49657g) && AbstractC19074t.m100204b(this.f49658h, logSession.f49658h) && AbstractC19074t.m100204b(this.f49659i, logSession.f49659i) && AbstractC19074t.m100204b(this.f49660j, logSession.f49660j) && AbstractC19074t.m100204b(this.f49661k, logSession.f49661k) && AbstractC19074t.m100204b(this.f49662l, logSession.f49662l);
    }

    /* renamed from: f */
    public final List m50615f() {
        return this.f49660j;
    }

    /* renamed from: g */
    public final Long m50616g() {
        return this.f49652b;
    }

    /* renamed from: h */
    public final String m50617h() {
        return this.f49658h;
    }

    public int hashCode() {
        Long l11 = this.f49651a;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f49652b;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.f49653c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f49654d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f49655e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f49656f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f49657g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49658h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f49659i;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f49660j;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l13 = this.f49661k;
        int hashCode11 = (hashCode10 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.f49662l;
        return hashCode11 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i */
    public final Long m50618i() {
        return this.f49651a;
    }

    /* renamed from: j */
    public final Integer m50619j() {
        return this.f49654d;
    }

    /* renamed from: k */
    public final Integer m50620k() {
        return this.f49655e;
    }

    /* renamed from: l */
    public final Integer m50621l() {
        return this.f49653c;
    }

    /* renamed from: m */
    public final Integer m50622m() {
        return this.f49656f;
    }

    public String toString() {
        return "LogSession(sessionStartTime=" + this.f49651a + ", sessionEndTime=" + this.f49652b + ", totalPlayedVideo=" + this.f49653c + ", totalComment=" + this.f49654d + ", totalLike=" + this.f49655e + ", totalShare=" + this.f49656f + ", defaultParams=" + this.f49657g + ", sessionId=" + this.f49658h + ", sessionDislikedCate=" + this.f49659i + ", sessionDislikedChannelId=" + this.f49660j + ", cellularDataUsage=" + this.f49661k + ", adsInfo=" + this.f49662l + ")";
    }

    public LogSession(Long l11, Long l12, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list, List list2, Long l13, String str3) {
        this.f49651a = l11;
        this.f49652b = l12;
        this.f49653c = num;
        this.f49654d = num2;
        this.f49655e = num3;
        this.f49656f = num4;
        this.f49657g = str;
        this.f49658h = str2;
        this.f49659i = list;
        this.f49660j = list2;
        this.f49661k = l13;
        this.f49662l = str3;
    }
}
