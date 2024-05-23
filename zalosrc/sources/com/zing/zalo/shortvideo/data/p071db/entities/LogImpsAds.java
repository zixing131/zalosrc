package com.zing.zalo.shortvideo.data.p071db.entities;

import com.zing.zalo.shortvideo.data.model.ComplexAds;
import com.zing.zalo.shortvideo.data.model.ComplexAds$Config$$serializer;
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
public final class LogImpsAds {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49644a;

    /* renamed from: b */
    private final String f49645b;

    /* renamed from: c */
    private final Integer f49646c;

    /* renamed from: d */
    private final Integer f49647d;

    /* renamed from: e */
    private final ComplexAds.Config f49648e;

    /* renamed from: f */
    private final String f49649f;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogImpsAds$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogImpsAds(int i11, String str, String str2, Integer num, Integer num2, ComplexAds.Config config, String str3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49644a = null;
        } else {
            this.f49644a = str;
        }
        if ((i11 & 2) == 0) {
            this.f49645b = null;
        } else {
            this.f49645b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49646c = null;
        } else {
            this.f49646c = num;
        }
        if ((i11 & 8) == 0) {
            this.f49647d = null;
        } else {
            this.f49647d = num2;
        }
        if ((i11 & 16) == 0) {
            this.f49648e = null;
        } else {
            this.f49648e = config;
        }
        if ((i11 & 32) == 0) {
            this.f49649f = null;
        } else {
            this.f49649f = str3;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m50603f(LogImpsAds logImpsAds, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logImpsAds.f49644a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, logImpsAds.f49644a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logImpsAds.f49645b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logImpsAds.f49645b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logImpsAds.f49646c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26783d0.f126989a, logImpsAds.f49646c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logImpsAds.f49647d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26783d0.f126989a, logImpsAds.f49647d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logImpsAds.f49648e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, ComplexAds$Config$$serializer.INSTANCE, logImpsAds.f49648e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || logImpsAds.f49649f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, logImpsAds.f49649f);
        }
    }

    /* renamed from: a */
    public final String m50604a() {
        return this.f49644a;
    }

    /* renamed from: b */
    public final Integer m50605b() {
        return this.f49646c;
    }

    /* renamed from: c */
    public final String m50606c() {
        return this.f49645b;
    }

    /* renamed from: d */
    public final String m50607d() {
        return this.f49649f;
    }

    /* renamed from: e */
    public final Integer m50608e() {
        return this.f49647d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogImpsAds)) {
            return false;
        }
        LogImpsAds logImpsAds = (LogImpsAds) obj;
        return AbstractC19074t.m100204b(this.f49644a, logImpsAds.f49644a) && AbstractC19074t.m100204b(this.f49645b, logImpsAds.f49645b) && AbstractC19074t.m100204b(this.f49646c, logImpsAds.f49646c) && AbstractC19074t.m100204b(this.f49647d, logImpsAds.f49647d) && AbstractC19074t.m100204b(this.f49648e, logImpsAds.f49648e) && AbstractC19074t.m100204b(this.f49649f, logImpsAds.f49649f);
    }

    public int hashCode() {
        String str = this.f49644a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49645b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f49646c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f49647d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ComplexAds.Config config = this.f49648e;
        int hashCode5 = (hashCode4 + (config == null ? 0 : config.hashCode())) * 31;
        String str3 = this.f49649f;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LogImpsAds(adId=" + this.f49644a + ", addSrc=" + this.f49645b + ", adIndex=" + this.f49646c + ", numShowedAds=" + this.f49647d + ", adsConfig=" + this.f49648e + ", defaultParam=" + this.f49649f + ")";
    }

    public LogImpsAds(String str, String str2, Integer num, Integer num2, ComplexAds.Config config, String str3) {
        this.f49644a = str;
        this.f49645b = str2;
        this.f49646c = num;
        this.f49647d = num2;
        this.f49648e = config;
        this.f49649f = str3;
    }

    public /* synthetic */ LogImpsAds(String str, String str2, Integer num, Integer num2, ComplexAds.Config config, String str3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : config, (i11 & 32) != 0 ? null : str3);
    }
}
