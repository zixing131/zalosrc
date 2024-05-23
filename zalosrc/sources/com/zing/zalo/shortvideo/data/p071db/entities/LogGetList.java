package com.zing.zalo.shortvideo.data.p071db.entities;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogGetList {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f49629a;

    /* renamed from: b */
    private final String f49630b;

    /* renamed from: c */
    private final String f49631c;

    /* renamed from: d */
    private final String f49632d;

    /* renamed from: e */
    private final String f49633e;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogGetList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogGetList(int i11, Integer num, String str, String str2, String str3, String str4, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49629a = null;
        } else {
            this.f49629a = num;
        }
        if ((i11 & 2) == 0) {
            this.f49630b = null;
        } else {
            this.f49630b = str;
        }
        if ((i11 & 4) == 0) {
            this.f49631c = null;
        } else {
            this.f49631c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f49632d = null;
        } else {
            this.f49632d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f49633e = null;
        } else {
            this.f49633e = str4;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m50586f(LogGetList logGetList, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logGetList.f49629a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, logGetList.f49629a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logGetList.f49630b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logGetList.f49630b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logGetList.f49631c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, logGetList.f49631c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logGetList.f49632d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, logGetList.f49632d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logGetList.f49633e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, logGetList.f49633e);
        }
    }

    /* renamed from: a */
    public final String m50587a() {
        return this.f49633e;
    }

    /* renamed from: b */
    public final String m50588b() {
        return this.f49632d;
    }

    /* renamed from: c */
    public final String m50589c() {
        return this.f49631c;
    }

    /* renamed from: d */
    public final Integer m50590d() {
        return this.f49629a;
    }

    /* renamed from: e */
    public final String m50591e() {
        return this.f49630b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogGetList)) {
            return false;
        }
        LogGetList logGetList = (LogGetList) obj;
        return AbstractC19074t.m100204b(this.f49629a, logGetList.f49629a) && AbstractC19074t.m100204b(this.f49630b, logGetList.f49630b) && AbstractC19074t.m100204b(this.f49631c, logGetList.f49631c) && AbstractC19074t.m100204b(this.f49632d, logGetList.f49632d) && AbstractC19074t.m100204b(this.f49633e, logGetList.f49633e);
    }

    public int hashCode() {
        Integer num = this.f49629a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f49630b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49631c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49632d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49633e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "LogGetList(videoCount=" + this.f49629a + ", videoIds=" + this.f49630b + ", source=" + this.f49631c + ", extra=" + this.f49632d + ", defaultParam=" + this.f49633e + ")";
    }

    public LogGetList(Integer num, String str, String str2, String str3, String str4) {
        this.f49629a = num;
        this.f49630b = str;
        this.f49631c = str2;
        this.f49632d = str3;
        this.f49633e = str4;
    }
}
