package com.zing.zalo.shortvideo.data.p071db.entities;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49626a;

    /* renamed from: b */
    private final String f49627b;

    /* renamed from: c */
    private final String f49628c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogEvent(int i11, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49626a = null;
        } else {
            this.f49626a = str;
        }
        if ((i11 & 2) == 0) {
            this.f49627b = null;
        } else {
            this.f49627b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49628c = null;
        } else {
            this.f49628c = str3;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m50582d(LogEvent logEvent, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logEvent.f49626a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, logEvent.f49626a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logEvent.f49627b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logEvent.f49627b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logEvent.f49628c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, logEvent.f49628c);
        }
    }

    /* renamed from: a */
    public final String m50583a() {
        return this.f49626a;
    }

    /* renamed from: b */
    public final String m50584b() {
        return this.f49628c;
    }

    /* renamed from: c */
    public final String m50585c() {
        return this.f49627b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        return AbstractC19074t.m100204b(this.f49626a, logEvent.f49626a) && AbstractC19074t.m100204b(this.f49627b, logEvent.f49627b) && AbstractC19074t.m100204b(this.f49628c, logEvent.f49628c);
    }

    public int hashCode() {
        String str = this.f49626a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49627b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49628c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent(actionKey=" + this.f49626a + ", extData=" + this.f49627b + ", defaultParam=" + this.f49628c + ")";
    }

    public LogEvent(String str, String str2, String str3) {
        this.f49626a = str;
        this.f49627b = str2;
        this.f49628c = str3;
    }
}
