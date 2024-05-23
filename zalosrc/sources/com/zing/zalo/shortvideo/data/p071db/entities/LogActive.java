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
public final class LogActive {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49625a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogActive$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogActive(int i11, String str, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49625a = null;
        } else {
            this.f49625a = str;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m50580b(LogActive logActive, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logActive.f49625a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, logActive.f49625a);
        }
    }

    /* renamed from: a */
    public final String m50581a() {
        return this.f49625a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogActive) && AbstractC19074t.m100204b(this.f49625a, ((LogActive) obj).f49625a);
    }

    public int hashCode() {
        String str = this.f49625a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "LogActive(defaultParam=" + this.f49625a + ")";
    }

    public LogActive(String str) {
        this.f49625a = str;
    }
}
