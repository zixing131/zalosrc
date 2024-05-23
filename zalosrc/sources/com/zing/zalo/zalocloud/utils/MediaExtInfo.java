package com.zing.zalo.zalocloud.utils;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import p613wl.C29085a;
import qn0.InterfaceC25392g;
import tg0.C26676b;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

/* loaded from: classes7.dex */
public abstract class MediaExtInfo {
    public static final C16892a Companion = new C16892a(null);

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class Doodle extends MediaExtInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final int f86010a;

        /* renamed from: b */
        private final int f86011b;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return MediaExtInfo$Doodle$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Doodle(int i11, int i12, int i13, AbstractC26805k1 abstractC26805k1) {
            super(null);
            if ((i11 & 1) == 0) {
                this.f86010a = 0;
            } else {
                this.f86010a = i12;
            }
            if ((i11 & 2) == 0) {
                this.f86011b = 0;
            } else {
                this.f86011b = i13;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m90307d(Doodle doodle, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || doodle.f86010a != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 0, doodle.f86010a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || doodle.f86011b != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 1, doodle.f86011b);
            }
        }

        /* renamed from: b */
        public final int m90308b() {
            return this.f86011b;
        }

        /* renamed from: c */
        public final int m90309c() {
            return this.f86010a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Doodle)) {
                return false;
            }
            Doodle doodle = (Doodle) obj;
            return this.f86010a == doodle.f86010a && this.f86011b == doodle.f86011b;
        }

        public int hashCode() {
            return (this.f86010a * 31) + this.f86011b;
        }

        public String toString() {
            return "Doodle(width=" + this.f86010a + ", height=" + this.f86011b + ")";
        }

        public Doodle(int i11, int i12) {
            super(null);
            this.f86010a = i11;
            this.f86011b = i12;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class File extends MediaExtInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final String f86012a;

        /* renamed from: b */
        private final String f86013b;

        /* renamed from: c */
        private final int f86014c;

        /* renamed from: d */
        private final String f86015d;

        /* renamed from: e */
        private final String f86016e;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return MediaExtInfo$File$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ File(int i11, String str, String str2, int i12, String str3, String str4, AbstractC26805k1 abstractC26805k1) {
            super(null);
            if ((i11 & 1) == 0) {
                this.f86012a = "";
            } else {
                this.f86012a = str;
            }
            if ((i11 & 2) == 0) {
                this.f86013b = null;
            } else {
                this.f86013b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f86014c = -1;
            } else {
                this.f86014c = i12;
            }
            if ((i11 & 8) == 0) {
                this.f86015d = "";
            } else {
                this.f86015d = str3;
            }
            if ((i11 & 16) == 0) {
                this.f86016e = "";
            } else {
                this.f86016e = str4;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m90310d(File file, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(file.f86012a, "")) {
                interfaceC21886d.mo114035z(serialDescriptor, 0, file.f86012a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || file.f86013b != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, file.f86013b);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || file.f86014c != -1) {
                interfaceC21886d.mo114033x(serialDescriptor, 2, file.f86014c);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(file.f86015d, "")) {
                interfaceC21886d.mo114035z(serialDescriptor, 3, file.f86015d);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(file.f86016e, "")) {
                interfaceC21886d.mo114035z(serialDescriptor, 4, file.f86016e);
            }
        }

        /* renamed from: b */
        public final String m90311b() {
            return this.f86016e;
        }

        /* renamed from: c */
        public final String m90312c() {
            String str = this.f86012a;
            if (str.length() == 0) {
                String str2 = this.f86013b;
                if (str2 == null) {
                    return "";
                }
                return str2;
            }
            return str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof File)) {
                return false;
            }
            File file = (File) obj;
            return AbstractC19074t.m100204b(this.f86012a, file.f86012a) && AbstractC19074t.m100204b(this.f86013b, file.f86013b) && this.f86014c == file.f86014c && AbstractC19074t.m100204b(this.f86015d, file.f86015d) && AbstractC19074t.m100204b(this.f86016e, file.f86016e);
        }

        public int hashCode() {
            int hashCode = this.f86012a.hashCode() * 31;
            String str = this.f86013b;
            return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f86014c) * 31) + this.f86015d.hashCode()) * 31) + this.f86016e.hashCode();
        }

        public String toString() {
            return "File(title=" + this.f86012a + ", _fileName=" + this.f86013b + ", fType=" + this.f86014c + ", fData=" + this.f86015d + ", fileExt=" + this.f86016e + ")";
        }

        public /* synthetic */ File(String str, String str2, int i11, String str3, String str4, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? -1 : i11, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? "" : str4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public File(String str, String str2, int i11, String str3, String str4) {
            super(null);
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str3, "fData");
            AbstractC19074t.m100208f(str4, "fileExt");
            this.f86012a = str;
            this.f86013b = str2;
            this.f86014c = i11;
            this.f86015d = str3;
            this.f86016e = str4;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class Photo extends MediaExtInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final int f86017a;

        /* renamed from: b */
        private final int f86018b;

        /* renamed from: c */
        private final int f86019c;

        /* renamed from: d */
        private final int f86020d;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return MediaExtInfo$Photo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Photo(int i11, int i12, int i13, int i14, int i15, AbstractC26805k1 abstractC26805k1) {
            super(null);
            if ((i11 & 1) == 0) {
                this.f86017a = 0;
            } else {
                this.f86017a = i12;
            }
            if ((i11 & 2) == 0) {
                this.f86018b = 0;
            } else {
                this.f86018b = i13;
            }
            if ((i11 & 4) == 0) {
                this.f86019c = 0;
            } else {
                this.f86019c = i14;
            }
            if ((i11 & 8) == 0) {
                this.f86020d = 0;
            } else {
                this.f86020d = i15;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m90313d(Photo photo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || photo.f86017a != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 0, photo.f86017a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || photo.f86018b != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 1, photo.f86018b);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || photo.f86019c != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 2, photo.f86019c);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || photo.f86020d != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 3, photo.f86020d);
            }
        }

        /* renamed from: b */
        public final int m90314b() {
            return this.f86018b;
        }

        /* renamed from: c */
        public final int m90315c() {
            return this.f86017a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) obj;
            return this.f86017a == photo.f86017a && this.f86018b == photo.f86018b && this.f86019c == photo.f86019c && this.f86020d == photo.f86020d;
        }

        public int hashCode() {
            return (((((this.f86017a * 31) + this.f86018b) * 31) + this.f86019c) * 31) + this.f86020d;
        }

        public String toString() {
            return "Photo(width=" + this.f86017a + ", height=" + this.f86018b + ", thumbWidth=" + this.f86019c + ", thumbHeight=" + this.f86020d + ")";
        }

        public Photo(int i11, int i12, int i13, int i14) {
            super(null);
            this.f86017a = i11;
            this.f86018b = i12;
            this.f86019c = i13;
            this.f86020d = i14;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class Video extends MediaExtInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final int f86021a;

        /* renamed from: b */
        private final int f86022b;

        /* renamed from: c */
        private final int f86023c;

        /* renamed from: d */
        private final int f86024d;

        /* renamed from: e */
        private final long f86025e;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return MediaExtInfo$Video$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Video(int i11, int i12, int i13, int i14, int i15, long j11, AbstractC26805k1 abstractC26805k1) {
            super(null);
            if ((i11 & 1) == 0) {
                this.f86021a = 0;
            } else {
                this.f86021a = i12;
            }
            if ((i11 & 2) == 0) {
                this.f86022b = 0;
            } else {
                this.f86022b = i13;
            }
            if ((i11 & 4) == 0) {
                this.f86023c = 0;
            } else {
                this.f86023c = i14;
            }
            if ((i11 & 8) == 0) {
                this.f86024d = 0;
            } else {
                this.f86024d = i15;
            }
            if ((i11 & 16) == 0) {
                this.f86025e = 0L;
            } else {
                this.f86025e = j11;
            }
        }

        /* renamed from: e */
        public static final /* synthetic */ void m90316e(Video video, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || video.f86021a != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 0, video.f86021a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || video.f86022b != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 1, video.f86022b);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || video.f86023c != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 2, video.f86023c);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || video.f86024d != 0) {
                interfaceC21886d.mo114033x(serialDescriptor, 3, video.f86024d);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 4) || video.f86025e != 0) {
                interfaceC21886d.mo114022E(serialDescriptor, 4, video.f86025e);
            }
        }

        /* renamed from: b */
        public final long m90317b() {
            return this.f86025e;
        }

        /* renamed from: c */
        public final int m90318c() {
            return this.f86022b;
        }

        /* renamed from: d */
        public final int m90319d() {
            return this.f86021a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return this.f86021a == video.f86021a && this.f86022b == video.f86022b && this.f86023c == video.f86023c && this.f86024d == video.f86024d && this.f86025e == video.f86025e;
        }

        public int hashCode() {
            return (((((((this.f86021a * 31) + this.f86022b) * 31) + this.f86023c) * 31) + this.f86024d) * 31) + AbstractC2147g0.m11521a(this.f86025e);
        }

        public String toString() {
            return "Video(width=" + this.f86021a + ", height=" + this.f86022b + ", thumbWidth=" + this.f86023c + ", thumbHeight=" + this.f86024d + ", duration=" + this.f86025e + ")";
        }

        public Video(int i11, int i12, int i13, int i14, long j11) {
            super(null);
            this.f86021a = i11;
            this.f86022b = i12;
            this.f86023c = i13;
            this.f86024d = i14;
            this.f86025e = j11;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes7.dex */
    public static final class Voice extends MediaExtInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final long f86026a;

        /* renamed from: b */
        private final String f86027b;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return MediaExtInfo$Voice$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Voice(int i11, long j11, String str, AbstractC26805k1 abstractC26805k1) {
            super(null);
            this.f86026a = (i11 & 1) == 0 ? 0L : j11;
            if ((i11 & 2) == 0) {
                this.f86027b = "";
            } else {
                this.f86027b = str;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m90320d(Voice voice, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || voice.f86026a != 0) {
                interfaceC21886d.mo114022E(serialDescriptor, 0, voice.f86026a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(voice.f86027b, "")) {
                interfaceC21886d.mo114035z(serialDescriptor, 1, voice.f86027b);
            }
        }

        /* renamed from: b */
        public final long m90321b() {
            return this.f86026a;
        }

        /* renamed from: c */
        public final String m90322c() {
            return this.f86027b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Voice)) {
                return false;
            }
            Voice voice = (Voice) obj;
            return this.f86026a == voice.f86026a && AbstractC19074t.m100204b(this.f86027b, voice.f86027b);
        }

        public int hashCode() {
            return (AbstractC2147g0.m11521a(this.f86026a) * 31) + this.f86027b.hashCode();
        }

        public String toString() {
            return "Voice(duration=" + this.f86026a + ", fileExt=" + this.f86027b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Voice(long j11, String str) {
            super(null);
            AbstractC19074t.m100208f(str, "fileExt");
            this.f86026a = j11;
            this.f86027b = str;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.utils.MediaExtInfo$a */
    /* loaded from: classes7.dex */
    public static final class C16892a {
        private C16892a() {
        }

        public /* synthetic */ C16892a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final KSerializer m90323a(int i11) {
            if (AbstractC19646n0.m103031t1(i11)) {
                return Photo.Companion.serializer();
            }
            if (AbstractC19646n0.m102886D1(i11)) {
                return Video.Companion.serializer();
            }
            if (AbstractC19646n0.m102889E1(i11)) {
                return Voice.Companion.serializer();
            }
            if (AbstractC19646n0.m103003m1(i11)) {
                return File.Companion.serializer();
            }
            if (AbstractC19646n0.m102995k1(i11)) {
                return Doodle.Companion.serializer();
            }
            C26676b.m136961k("MediaExtInfo: Unsupported serializer for msgType=" + i11);
            return null;
        }
    }

    private MediaExtInfo() {
    }

    public /* synthetic */ MediaExtInfo(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final String m90306a() {
        if (this instanceof File) {
            return C29085a.f134890a.m145315b().mo131597b(File.Companion.serializer(), this);
        }
        if (this instanceof Photo) {
            return C29085a.f134890a.m145315b().mo131597b(Photo.Companion.serializer(), this);
        }
        if (this instanceof Video) {
            return C29085a.f134890a.m145315b().mo131597b(Video.Companion.serializer(), this);
        }
        if (this instanceof Voice) {
            return C29085a.f134890a.m145315b().mo131597b(Voice.Companion.serializer(), this);
        }
        if (this instanceof Doodle) {
            return C29085a.f134890a.m145315b().mo131597b(Doodle.Companion.serializer(), this);
        }
        throw new NoWhenBranchMatchedException();
    }
}
