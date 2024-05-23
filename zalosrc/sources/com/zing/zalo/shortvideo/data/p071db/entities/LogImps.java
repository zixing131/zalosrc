package com.zing.zalo.shortvideo.data.p071db.entities;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogImps {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49634a;

    /* renamed from: b */
    private final String f49635b;

    /* renamed from: c */
    private final Integer f49636c;

    /* renamed from: d */
    private final Boolean f49637d;

    /* renamed from: e */
    private final String f49638e;

    /* renamed from: f */
    private final String f49639f;

    /* renamed from: g */
    private final String f49640g;

    /* renamed from: h */
    private final String f49641h;

    /* renamed from: i */
    private final Boolean f49642i;

    /* renamed from: j */
    private final String f49643j;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogImps$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogImps(int i11, String str, String str2, Integer num, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49634a = null;
        } else {
            this.f49634a = str;
        }
        if ((i11 & 2) == 0) {
            this.f49635b = null;
        } else {
            this.f49635b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49636c = null;
        } else {
            this.f49636c = num;
        }
        if ((i11 & 8) == 0) {
            this.f49637d = null;
        } else {
            this.f49637d = bool;
        }
        if ((i11 & 16) == 0) {
            this.f49638e = null;
        } else {
            this.f49638e = str3;
        }
        if ((i11 & 32) == 0) {
            this.f49639f = null;
        } else {
            this.f49639f = str4;
        }
        if ((i11 & 64) == 0) {
            this.f49640g = null;
        } else {
            this.f49640g = str5;
        }
        if ((i11 & 128) == 0) {
            this.f49641h = null;
        } else {
            this.f49641h = str6;
        }
        if ((i11 & 256) == 0) {
            this.f49642i = null;
        } else {
            this.f49642i = bool2;
        }
        if ((i11 & 512) == 0) {
            this.f49643j = null;
        } else {
            this.f49643j = str7;
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ void m50592k(LogImps logImps, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logImps.f49634a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, logImps.f49634a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logImps.f49635b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logImps.f49635b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logImps.f49636c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26783d0.f126989a, logImps.f49636c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logImps.f49637d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26794h.f127000a, logImps.f49637d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logImps.f49638e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, logImps.f49638e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || logImps.f49639f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, logImps.f49639f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || logImps.f49640g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, logImps.f49640g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || logImps.f49641h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, logImps.f49641h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || logImps.f49642i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26794h.f127000a, logImps.f49642i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || logImps.f49643j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26814n1.f127034a, logImps.f49643j);
        }
    }

    /* renamed from: a */
    public final String m50593a() {
        return this.f49640g;
    }

    /* renamed from: b */
    public final String m50594b() {
        return this.f49641h;
    }

    /* renamed from: c */
    public final String m50595c() {
        return this.f49639f;
    }

    /* renamed from: d */
    public final String m50596d() {
        return this.f49638e;
    }

    /* renamed from: e */
    public final Integer m50597e() {
        return this.f49636c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogImps)) {
            return false;
        }
        LogImps logImps = (LogImps) obj;
        return AbstractC19074t.m100204b(this.f49634a, logImps.f49634a) && AbstractC19074t.m100204b(this.f49635b, logImps.f49635b) && AbstractC19074t.m100204b(this.f49636c, logImps.f49636c) && AbstractC19074t.m100204b(this.f49637d, logImps.f49637d) && AbstractC19074t.m100204b(this.f49638e, logImps.f49638e) && AbstractC19074t.m100204b(this.f49639f, logImps.f49639f) && AbstractC19074t.m100204b(this.f49640g, logImps.f49640g) && AbstractC19074t.m100204b(this.f49641h, logImps.f49641h) && AbstractC19074t.m100204b(this.f49642i, logImps.f49642i) && AbstractC19074t.m100204b(this.f49643j, logImps.f49643j);
    }

    /* renamed from: f */
    public final String m50598f() {
        return this.f49643j;
    }

    /* renamed from: g */
    public final String m50599g() {
        return this.f49635b;
    }

    /* renamed from: h */
    public final String m50600h() {
        return this.f49634a;
    }

    public int hashCode() {
        String str = this.f49634a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49635b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f49636c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f49637d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f49638e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49639f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f49640g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f49641h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.f49642i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f49643j;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    /* renamed from: i */
    public final Boolean m50601i() {
        return this.f49637d;
    }

    /* renamed from: j */
    public final Boolean m50602j() {
        return this.f49642i;
    }

    public String toString() {
        return "LogImps(videoId=" + this.f49634a + ", source=" + this.f49635b + ", listIndex=" + this.f49636c + ", isSeen=" + this.f49637d + ", extra=" + this.f49638e + ", defaultParam=" + this.f49639f + ", apiExtra=" + this.f49640g + ", channelId=" + this.f49641h + ", isVideo=" + this.f49642i + ", pageSource=" + this.f49643j + ")";
    }

    public LogImps(String str, String str2, Integer num, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7) {
        this.f49634a = str;
        this.f49635b = str2;
        this.f49636c = num;
        this.f49637d = bool;
        this.f49638e = str3;
        this.f49639f = str4;
        this.f49640g = str5;
        this.f49641h = str6;
        this.f49642i = bool2;
        this.f49643j = str7;
    }
}
