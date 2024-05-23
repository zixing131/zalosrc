package com.zing.zalo.shortvideo.data.p071db.entities;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogUpload {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f49663a;

    /* renamed from: b */
    private final String f49664b;

    /* renamed from: c */
    private final String f49665c;

    /* renamed from: d */
    private final Long f49666d;

    /* renamed from: e */
    private final Integer f49667e;

    /* renamed from: f */
    private final String f49668f;

    /* renamed from: g */
    private final String f49669g;

    /* renamed from: h */
    private final String f49670h;

    /* renamed from: i */
    private final String f49671i;

    /* renamed from: j */
    private final String f49672j;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogUpload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogUpload(int i11, Integer num, String str, String str2, Long l11, Integer num2, String str3, String str4, String str5, String str6, String str7, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49663a = null;
        } else {
            this.f49663a = num;
        }
        if ((i11 & 2) == 0) {
            this.f49664b = null;
        } else {
            this.f49664b = str;
        }
        if ((i11 & 4) == 0) {
            this.f49665c = null;
        } else {
            this.f49665c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f49666d = null;
        } else {
            this.f49666d = l11;
        }
        if ((i11 & 16) == 0) {
            this.f49667e = null;
        } else {
            this.f49667e = num2;
        }
        if ((i11 & 32) == 0) {
            this.f49668f = null;
        } else {
            this.f49668f = str3;
        }
        if ((i11 & 64) == 0) {
            this.f49669g = null;
        } else {
            this.f49669g = str4;
        }
        if ((i11 & 128) == 0) {
            this.f49670h = null;
        } else {
            this.f49670h = str5;
        }
        if ((i11 & 256) == 0) {
            this.f49671i = null;
        } else {
            this.f49671i = str6;
        }
        if ((i11 & 512) == 0) {
            this.f49672j = null;
        } else {
            this.f49672j = str7;
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ void m50624m(LogUpload logUpload, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logUpload.f49663a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, logUpload.f49663a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logUpload.f49664b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logUpload.f49664b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logUpload.f49665c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, logUpload.f49665c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logUpload.f49666d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, logUpload.f49666d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logUpload.f49667e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26783d0.f126989a, logUpload.f49667e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || logUpload.f49668f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, logUpload.f49668f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || logUpload.f49669g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, logUpload.f49669g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || logUpload.f49670h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, logUpload.f49670h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || logUpload.f49671i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26814n1.f127034a, logUpload.f49671i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || logUpload.f49672j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26814n1.f127034a, logUpload.f49672j);
        }
    }

    /* renamed from: a */
    public final LogUpload m50625a(Integer num, String str, String str2, Long l11, Integer num2, String str3, String str4, String str5, String str6, String str7) {
        return new LogUpload(num, str, str2, l11, num2, str3, str4, str5, str6, str7);
    }

    /* renamed from: c */
    public final String m50626c() {
        return this.f49671i;
    }

    /* renamed from: d */
    public final String m50627d() {
        return this.f49672j;
    }

    /* renamed from: e */
    public final String m50628e() {
        return this.f49668f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogUpload)) {
            return false;
        }
        LogUpload logUpload = (LogUpload) obj;
        return AbstractC19074t.m100204b(this.f49663a, logUpload.f49663a) && AbstractC19074t.m100204b(this.f49664b, logUpload.f49664b) && AbstractC19074t.m100204b(this.f49665c, logUpload.f49665c) && AbstractC19074t.m100204b(this.f49666d, logUpload.f49666d) && AbstractC19074t.m100204b(this.f49667e, logUpload.f49667e) && AbstractC19074t.m100204b(this.f49668f, logUpload.f49668f) && AbstractC19074t.m100204b(this.f49669g, logUpload.f49669g) && AbstractC19074t.m100204b(this.f49670h, logUpload.f49670h) && AbstractC19074t.m100204b(this.f49671i, logUpload.f49671i) && AbstractC19074t.m100204b(this.f49672j, logUpload.f49672j);
    }

    /* renamed from: f */
    public final Long m50629f() {
        return this.f49666d;
    }

    /* renamed from: g */
    public final Integer m50630g() {
        return this.f49667e;
    }

    /* renamed from: h */
    public final String m50631h() {
        return this.f49669g;
    }

    public int hashCode() {
        Integer num = this.f49663a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f49664b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49665c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f49666d;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num2 = this.f49667e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f49668f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49669g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f49670h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f49671i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f49672j;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    /* renamed from: i */
    public final Integer m50632i() {
        return this.f49663a;
    }

    /* renamed from: j */
    public final String m50633j() {
        return this.f49670h;
    }

    /* renamed from: k */
    public final String m50634k() {
        return this.f49665c;
    }

    /* renamed from: l */
    public final String m50635l() {
        return this.f49664b;
    }

    public String toString() {
        return "LogUpload(videoDuration=" + this.f49663a + ", videoSize=" + this.f49664b + ", videoResolution=" + this.f49665c + ", processTime=" + this.f49666d + ", uploadStatus=" + this.f49667e + ", errorMessage=" + this.f49668f + ", videoDescription=" + this.f49669g + ", videoId=" + this.f49670h + ", decoLog=" + this.f49671i + ", defaultParam=" + this.f49672j + ")";
    }

    public LogUpload(Integer num, String str, String str2, Long l11, Integer num2, String str3, String str4, String str5, String str6, String str7) {
        this.f49663a = num;
        this.f49664b = str;
        this.f49665c = str2;
        this.f49666d = l11;
        this.f49667e = num2;
        this.f49668f = str3;
        this.f49669g = str4;
        this.f49670h = str5;
        this.f49671i = str6;
        this.f49672j = str7;
    }

    public /* synthetic */ LogUpload(Integer num, String str, String str2, Long l11, Integer num2, String str3, String str4, String str5, String str6, String str7, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) == 0 ? str7 : null);
    }
}
