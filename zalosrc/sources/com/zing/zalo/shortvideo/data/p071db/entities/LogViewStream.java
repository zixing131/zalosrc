package com.zing.zalo.shortvideo.data.p071db.entities;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
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
public final class LogViewStream {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49673a;

    /* renamed from: b */
    private final String f49674b;

    /* renamed from: c */
    private final Long f49675c;

    /* renamed from: d */
    private final Integer f49676d;

    /* renamed from: e */
    private final Long f49677e;

    /* renamed from: f */
    private final Long f49678f;

    /* renamed from: g */
    private final String f49679g;

    /* renamed from: h */
    private final String f49680h;

    /* renamed from: i */
    private final Boolean f49681i;

    /* renamed from: j */
    private final Boolean f49682j;

    /* renamed from: k */
    private final String f49683k;

    /* renamed from: l */
    private final String f49684l;

    /* renamed from: m */
    private final String f49685m;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogViewStream$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogViewStream(int i11, String str, String str2, Long l11, Integer num, Long l12, Long l13, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6, String str7, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49673a = null;
        } else {
            this.f49673a = str;
        }
        if ((i11 & 2) == 0) {
            this.f49674b = null;
        } else {
            this.f49674b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49675c = null;
        } else {
            this.f49675c = l11;
        }
        if ((i11 & 8) == 0) {
            this.f49676d = null;
        } else {
            this.f49676d = num;
        }
        if ((i11 & 16) == 0) {
            this.f49677e = null;
        } else {
            this.f49677e = l12;
        }
        if ((i11 & 32) == 0) {
            this.f49678f = null;
        } else {
            this.f49678f = l13;
        }
        if ((i11 & 64) == 0) {
            this.f49679g = null;
        } else {
            this.f49679g = str3;
        }
        if ((i11 & 128) == 0) {
            this.f49680h = null;
        } else {
            this.f49680h = str4;
        }
        if ((i11 & 256) == 0) {
            this.f49681i = null;
        } else {
            this.f49681i = bool;
        }
        if ((i11 & 512) == 0) {
            this.f49682j = null;
        } else {
            this.f49682j = bool2;
        }
        if ((i11 & 1024) == 0) {
            this.f49683k = null;
        } else {
            this.f49683k = str5;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49684l = null;
        } else {
            this.f49684l = str6;
        }
        if ((i11 & 4096) == 0) {
            this.f49685m = null;
        } else {
            this.f49685m = str7;
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m50636n(LogViewStream logViewStream, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || logViewStream.f49673a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, logViewStream.f49673a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || logViewStream.f49674b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, logViewStream.f49674b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || logViewStream.f49675c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, logViewStream.f49675c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || logViewStream.f49676d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26783d0.f126989a, logViewStream.f49676d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || logViewStream.f49677e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26810m0.f127024a, logViewStream.f49677e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || logViewStream.f49678f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, logViewStream.f49678f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || logViewStream.f49679g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, logViewStream.f49679g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || logViewStream.f49680h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, logViewStream.f49680h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || logViewStream.f49681i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26794h.f127000a, logViewStream.f49681i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || logViewStream.f49682j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26794h.f127000a, logViewStream.f49682j);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || logViewStream.f49683k != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26814n1.f127034a, logViewStream.f49683k);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || logViewStream.f49684l != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26814n1.f127034a, logViewStream.f49684l);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || logViewStream.f49685m != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 12, C26814n1.f127034a, logViewStream.f49685m);
        }
    }

    /* renamed from: a */
    public final String m50637a() {
        return this.f49684l;
    }

    /* renamed from: b */
    public final String m50638b() {
        return this.f49674b;
    }

    /* renamed from: c */
    public final String m50639c() {
        return this.f49685m;
    }

    /* renamed from: d */
    public final Long m50640d() {
        return this.f49678f;
    }

    /* renamed from: e */
    public final String m50641e() {
        return this.f49683k;
    }

    /* renamed from: f */
    public final String m50642f() {
        return this.f49673a;
    }

    /* renamed from: g */
    public final String m50643g() {
        return this.f49679g;
    }

    /* renamed from: h */
    public final String m50644h() {
        return this.f49680h;
    }

    /* renamed from: i */
    public final Long m50645i() {
        return this.f49677e;
    }

    /* renamed from: j */
    public final Long m50646j() {
        return this.f49675c;
    }

    /* renamed from: k */
    public final Integer m50647k() {
        return this.f49676d;
    }

    /* renamed from: l */
    public final Boolean m50648l() {
        return this.f49682j;
    }

    /* renamed from: m */
    public final Boolean m50649m() {
        return this.f49681i;
    }

    public LogViewStream(String str, String str2, Long l11, Integer num, Long l12, Long l13, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6, String str7) {
        this.f49673a = str;
        this.f49674b = str2;
        this.f49675c = l11;
        this.f49676d = num;
        this.f49677e = l12;
        this.f49678f = l13;
        this.f49679g = str3;
        this.f49680h = str4;
        this.f49681i = bool;
        this.f49682j = bool2;
        this.f49683k = str5;
        this.f49684l = str6;
        this.f49685m = str7;
    }
}
