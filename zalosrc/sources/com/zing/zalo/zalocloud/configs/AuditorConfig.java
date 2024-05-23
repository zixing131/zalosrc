package com.zing.zalo.zalocloud.configs;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import p613wl.C29085a;
import qn0.InterfaceC25392g;
import tg0.C26676b;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;

@InterfaceC25392g
/* loaded from: classes7.dex */
public final class AuditorConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f85310a;

    /* renamed from: b */
    private final int f85311b;

    /* renamed from: c */
    private final int f85312c;

    /* renamed from: d */
    private final int f85313d;

    /* renamed from: e */
    private final int f85314e;

    /* renamed from: f */
    private final int f85315f;

    /* renamed from: g */
    private final MediaDownload f85316g;

    /* renamed from: h */
    private final DataCorrection f85317h;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AuditorConfig m89751a(String str) {
            AbstractC19074t.m100208f(str, "json");
            if (str.length() == 0) {
                C26676b.m136958h("Parse Auditor config: Empty json", null, 2, null);
                return new AuditorConfig(0, 0, 0, 0, 0, 0, (MediaDownload) null, (DataCorrection) null, 255, (AbstractC19060k) null);
            }
            try {
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                m145315b.mo131586a();
                return (AuditorConfig) m145315b.m139867d(AuditorConfig.Companion.serializer(), str);
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return new AuditorConfig(0, 0, 0, 0, 0, 0, (MediaDownload) null, (DataCorrection) null, 255, (AbstractC19060k) null);
            }
        }

        public final KSerializer serializer() {
            return AuditorConfig$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class DataCorrection {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final int f85318a;

        /* renamed from: b */
        private final long f85319b;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return AuditorConfig$DataCorrection$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DataCorrection(int i11, int i12, long j11, AbstractC26805k1 abstractC26805k1) {
            this.f85318a = (i11 & 1) == 0 ? 0 : i12;
            if ((i11 & 2) == 0) {
                this.f85319b = 86400L;
            } else {
                this.f85319b = j11;
            }
        }

        /* renamed from: c */
        public static final /* synthetic */ void m89752c(DataCorrection dataCorrection, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || dataCorrection.f85318a != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 0, dataCorrection.f85318a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || dataCorrection.f85319b != 86400) {
                interfaceC21886d.mo114022E(serialDescriptor, 1, dataCorrection.f85319b);
            }
        }

        /* renamed from: a */
        public final long m89753a() {
            return this.f85319b;
        }

        /* renamed from: b */
        public final boolean m89754b() {
            return this.f85318a == 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataCorrection)) {
                return false;
            }
            DataCorrection dataCorrection = (DataCorrection) obj;
            return this.f85318a == dataCorrection.f85318a && this.f85319b == dataCorrection.f85319b;
        }

        public int hashCode() {
            return (this.f85318a * 31) + AbstractC2147g0.m11521a(this.f85319b);
        }

        public String toString() {
            return "DataCorrection(enable=" + this.f85318a + ", msgDeltaTime=" + this.f85319b + ")";
        }

        public DataCorrection(int i11, long j11) {
            this.f85318a = i11;
            this.f85319b = j11;
        }

        public /* synthetic */ DataCorrection(int i11, long j11, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 86400L : j11);
        }
    }

    public /* synthetic */ AuditorConfig(int i11, int i12, int i13, int i14, int i15, int i16, int i17, MediaDownload mediaDownload, DataCorrection dataCorrection, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f85310a = 0;
        } else {
            this.f85310a = i12;
        }
        if ((i11 & 2) == 0) {
            this.f85311b = 0;
        } else {
            this.f85311b = i13;
        }
        this.f85312c = (i11 & 4) == 0 ? 604800 : i14;
        this.f85313d = (i11 & 8) == 0 ? 15 : i15;
        this.f85314e = (i11 & 16) == 0 ? 600000 : i16;
        this.f85315f = (i11 & 32) == 0 ? 5 : i17;
        this.f85316g = (i11 & 64) == 0 ? new MediaDownload(0, 0L, (MediaDownload.Sampling) null, 7, (AbstractC19060k) null) : mediaDownload;
        this.f85317h = (i11 & 128) == 0 ? new DataCorrection(0, 0L, 3, (AbstractC19060k) null) : dataCorrection;
    }

    /* renamed from: i */
    public static final /* synthetic */ void m89742i(AuditorConfig auditorConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || auditorConfig.f85310a != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, auditorConfig.f85310a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || auditorConfig.f85311b != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, auditorConfig.f85311b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || auditorConfig.f85312c != 604800) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, auditorConfig.f85312c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || auditorConfig.f85313d != 15) {
            interfaceC21886d.mo114033x(serialDescriptor, 3, auditorConfig.f85313d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || auditorConfig.f85314e != 600000) {
            interfaceC21886d.mo114033x(serialDescriptor, 4, auditorConfig.f85314e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || auditorConfig.f85315f != 5) {
            interfaceC21886d.mo114033x(serialDescriptor, 5, auditorConfig.f85315f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || !AbstractC19074t.m100204b(auditorConfig.f85316g, new MediaDownload(0, 0L, (MediaDownload.Sampling) null, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 6, AuditorConfig$MediaDownload$$serializer.INSTANCE, auditorConfig.f85316g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || !AbstractC19074t.m100204b(auditorConfig.f85317h, new DataCorrection(0, 0L, 3, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 7, AuditorConfig$DataCorrection$$serializer.INSTANCE, auditorConfig.f85317h);
        }
    }

    /* renamed from: a */
    public final DataCorrection m89743a() {
        return this.f85317h;
    }

    /* renamed from: b */
    public final int m89744b() {
        return this.f85312c;
    }

    /* renamed from: c */
    public final int m89745c() {
        return this.f85314e;
    }

    /* renamed from: d */
    public final MediaDownload m89746d() {
        return this.f85316g;
    }

    /* renamed from: e */
    public final int m89747e() {
        return this.f85313d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuditorConfig)) {
            return false;
        }
        AuditorConfig auditorConfig = (AuditorConfig) obj;
        return this.f85310a == auditorConfig.f85310a && this.f85311b == auditorConfig.f85311b && this.f85312c == auditorConfig.f85312c && this.f85313d == auditorConfig.f85313d && this.f85314e == auditorConfig.f85314e && this.f85315f == auditorConfig.f85315f && AbstractC19074t.m100204b(this.f85316g, auditorConfig.f85316g) && AbstractC19074t.m100204b(this.f85317h, auditorConfig.f85317h);
    }

    /* renamed from: f */
    public final int m89748f() {
        return this.f85315f;
    }

    /* renamed from: g */
    public final boolean m89749g() {
        return this.f85310a == 1;
    }

    /* renamed from: h */
    public final boolean m89750h() {
        return this.f85311b == 1;
    }

    public int hashCode() {
        return (((((((((((((this.f85310a * 31) + this.f85311b) * 31) + this.f85312c) * 31) + this.f85313d) * 31) + this.f85314e) * 31) + this.f85315f) * 31) + this.f85316g.hashCode()) * 31) + this.f85317h.hashCode();
    }

    public String toString() {
        return "AuditorConfig(enable=" + this.f85310a + ", enableSubmitAPI=" + this.f85311b + ", interval=" + this.f85312c + ", minBattery=" + this.f85313d + ", maxCloudInfoDeltaTime=" + this.f85314e + ", mismatchUsageDiff=" + this.f85315f + ", mediaDownload=" + this.f85316g + ", dataCorrection=" + this.f85317h + ")";
    }

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class MediaDownload {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final int f85320a;

        /* renamed from: b */
        private final long f85321b;

        /* renamed from: c */
        private final Sampling f85322c;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return AuditorConfig$MediaDownload$$serializer.INSTANCE;
            }
        }

        @InterfaceC25392g
        /* loaded from: classes7.dex */
        public static final class Sampling {
            public static final Companion Companion = new Companion(null);

            /* renamed from: a */
            private final int f85323a;

            /* renamed from: b */
            private final int f85324b;

            /* renamed from: c */
            private final int f85325c;

            /* renamed from: d */
            private final int f85326d;

            /* loaded from: classes7.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                    this();
                }

                public final KSerializer serializer() {
                    return AuditorConfig$MediaDownload$Sampling$$serializer.INSTANCE;
                }
            }

            public Sampling(int i11, int i12, int i13, int i14) {
                this.f85323a = i11;
                this.f85324b = i12;
                this.f85325c = i13;
                this.f85326d = i14;
            }

            /* renamed from: e */
            public static final /* synthetic */ void m89759e(Sampling sampling, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
                if (interfaceC21886d.mo114019A(serialDescriptor, 0) || sampling.f85323a != 10) {
                    interfaceC21886d.mo114033x(serialDescriptor, 0, sampling.f85323a);
                }
                if (interfaceC21886d.mo114019A(serialDescriptor, 1) || sampling.f85324b != 10) {
                    interfaceC21886d.mo114033x(serialDescriptor, 1, sampling.f85324b);
                }
                if (interfaceC21886d.mo114019A(serialDescriptor, 2) || sampling.f85325c != 10) {
                    interfaceC21886d.mo114033x(serialDescriptor, 2, sampling.f85325c);
                }
                if (interfaceC21886d.mo114019A(serialDescriptor, 3) || sampling.f85326d != 10) {
                    interfaceC21886d.mo114033x(serialDescriptor, 3, sampling.f85326d);
                }
            }

            /* renamed from: a */
            public final int m89760a() {
                return this.f85325c;
            }

            /* renamed from: b */
            public final int m89761b() {
                return this.f85323a;
            }

            /* renamed from: c */
            public final int m89762c() {
                return this.f85324b;
            }

            /* renamed from: d */
            public final int m89763d() {
                return this.f85326d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Sampling)) {
                    return false;
                }
                Sampling sampling = (Sampling) obj;
                return this.f85323a == sampling.f85323a && this.f85324b == sampling.f85324b && this.f85325c == sampling.f85325c && this.f85326d == sampling.f85326d;
            }

            public int hashCode() {
                return (((((this.f85323a * 31) + this.f85324b) * 31) + this.f85325c) * 31) + this.f85326d;
            }

            public String toString() {
                return "Sampling(photo=" + this.f85323a + ", video=" + this.f85324b + ", file=" + this.f85325c + ", voice=" + this.f85326d + ")";
            }

            public /* synthetic */ Sampling(int i11, int i12, int i13, int i14, int i15, AbstractC26805k1 abstractC26805k1) {
                if ((i11 & 1) == 0) {
                    this.f85323a = 10;
                } else {
                    this.f85323a = i12;
                }
                if ((i11 & 2) == 0) {
                    this.f85324b = 10;
                } else {
                    this.f85324b = i13;
                }
                if ((i11 & 4) == 0) {
                    this.f85325c = 10;
                } else {
                    this.f85325c = i14;
                }
                if ((i11 & 8) == 0) {
                    this.f85326d = 10;
                } else {
                    this.f85326d = i15;
                }
            }

            public /* synthetic */ Sampling(int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
                this((i15 & 1) != 0 ? 10 : i11, (i15 & 2) != 0 ? 10 : i12, (i15 & 4) != 0 ? 10 : i13, (i15 & 8) != 0 ? 10 : i14);
            }
        }

        public /* synthetic */ MediaDownload(int i11, int i12, long j11, Sampling sampling, AbstractC26805k1 abstractC26805k1) {
            this.f85320a = (i11 & 1) == 0 ? 0 : i12;
            if ((i11 & 2) == 0) {
                this.f85321b = 100000000L;
            } else {
                this.f85321b = j11;
            }
            if ((i11 & 4) == 0) {
                this.f85322c = new Sampling(0, 0, 0, 0, 15, (AbstractC19060k) null);
            } else {
                this.f85322c = sampling;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m89755d(MediaDownload mediaDownload, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || mediaDownload.f85320a != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 0, mediaDownload.f85320a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || mediaDownload.f85321b != 100000000) {
                interfaceC21886d.mo114022E(serialDescriptor, 1, mediaDownload.f85321b);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(mediaDownload.f85322c, new Sampling(0, 0, 0, 0, 15, (AbstractC19060k) null))) {
                interfaceC21886d.mo114029i(serialDescriptor, 2, AuditorConfig$MediaDownload$Sampling$$serializer.INSTANCE, mediaDownload.f85322c);
            }
        }

        /* renamed from: a */
        public final long m89756a() {
            return this.f85321b;
        }

        /* renamed from: b */
        public final Sampling m89757b() {
            return this.f85322c;
        }

        /* renamed from: c */
        public final boolean m89758c() {
            return this.f85320a == 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaDownload)) {
                return false;
            }
            MediaDownload mediaDownload = (MediaDownload) obj;
            return this.f85320a == mediaDownload.f85320a && this.f85321b == mediaDownload.f85321b && AbstractC19074t.m100204b(this.f85322c, mediaDownload.f85322c);
        }

        public int hashCode() {
            return (((this.f85320a * 31) + AbstractC2147g0.m11521a(this.f85321b)) * 31) + this.f85322c.hashCode();
        }

        public String toString() {
            return "MediaDownload(enable=" + this.f85320a + ", maxFileSize=" + this.f85321b + ", sampling=" + this.f85322c + ")";
        }

        public MediaDownload(int i11, long j11, Sampling sampling) {
            AbstractC19074t.m100208f(sampling, "sampling");
            this.f85320a = i11;
            this.f85321b = j11;
            this.f85322c = sampling;
        }

        public /* synthetic */ MediaDownload(int i11, long j11, Sampling sampling, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 100000000L : j11, (i12 & 4) != 0 ? new Sampling(0, 0, 0, 0, 15, (AbstractC19060k) null) : sampling);
        }
    }

    public AuditorConfig(int i11, int i12, int i13, int i14, int i15, int i16, MediaDownload mediaDownload, DataCorrection dataCorrection) {
        AbstractC19074t.m100208f(mediaDownload, "mediaDownload");
        AbstractC19074t.m100208f(dataCorrection, "dataCorrection");
        this.f85310a = i11;
        this.f85311b = i12;
        this.f85312c = i13;
        this.f85313d = i14;
        this.f85314e = i15;
        this.f85315f = i16;
        this.f85316g = mediaDownload;
        this.f85317h = dataCorrection;
    }

    public /* synthetic */ AuditorConfig(int i11, int i12, int i13, int i14, int i15, int i16, MediaDownload mediaDownload, DataCorrection dataCorrection, int i17, AbstractC19060k abstractC19060k) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) == 0 ? i12 : 0, (i17 & 4) != 0 ? 604800 : i13, (i17 & 8) != 0 ? 15 : i14, (i17 & 16) != 0 ? 600000 : i15, (i17 & 32) != 0 ? 5 : i16, (i17 & 64) != 0 ? new MediaDownload(0, 0L, (MediaDownload.Sampling) null, 7, (AbstractC19060k) null) : mediaDownload, (i17 & 128) != 0 ? new DataCorrection(0, 0L, 3, (AbstractC19060k) null) : dataCorrection);
    }
}
