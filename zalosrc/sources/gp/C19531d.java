package gp;

import androidx.work.AbstractC2144f;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gp.AbstractC19530c;
import p138ep.EnumC18536f;

/* renamed from: gp.d */
/* loaded from: classes4.dex */
public final class C19531d {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static boolean f96993b;

    /* renamed from: a */
    private EnumC18536f f96994a;

    /* renamed from: gp.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m102096a() {
            return C19531d.f96993b;
        }
    }

    /* renamed from: gp.d$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private boolean f96995a;

        /* renamed from: b */
        private boolean f96996b;

        /* renamed from: c */
        private boolean f96997c;

        /* renamed from: d */
        private boolean f96998d;

        /* renamed from: e */
        private boolean f96999e;

        /* renamed from: f */
        private boolean f97000f;

        /* renamed from: g */
        private boolean f97001g;

        /* renamed from: h */
        private boolean f97002h;

        /* renamed from: i */
        private boolean f97003i;

        /* renamed from: j */
        private boolean f97004j;

        /* renamed from: k */
        private boolean f97005k;

        /* renamed from: l */
        private boolean f97006l;

        /* renamed from: m */
        private boolean f97007m;

        /* renamed from: n */
        private boolean f97008n;

        /* renamed from: o */
        private boolean f97009o;

        /* renamed from: p */
        private float f97010p;

        public b(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, float f11) {
            this.f96995a = z11;
            this.f96996b = z12;
            this.f96997c = z13;
            this.f96998d = z14;
            this.f96999e = z15;
            this.f97000f = z16;
            this.f97001g = z17;
            this.f97002h = z18;
            this.f97003i = z19;
            this.f97004j = z21;
            this.f97005k = z22;
            this.f97006l = z23;
            this.f97007m = z24;
            this.f97008n = z25;
            this.f97009o = z26;
            this.f97010p = f11;
        }

        /* renamed from: b */
        public static /* synthetic */ b m102097b(b bVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, float f11, int i11, Object obj) {
            return bVar.m102098a((i11 & 1) != 0 ? bVar.f96995a : z11, (i11 & 2) != 0 ? bVar.f96996b : z12, (i11 & 4) != 0 ? bVar.f96997c : z13, (i11 & 8) != 0 ? bVar.f96998d : z14, (i11 & 16) != 0 ? bVar.f96999e : z15, (i11 & 32) != 0 ? bVar.f97000f : z16, (i11 & 64) != 0 ? bVar.f97001g : z17, (i11 & 128) != 0 ? bVar.f97002h : z18, (i11 & 256) != 0 ? bVar.f97003i : z19, (i11 & 512) != 0 ? bVar.f97004j : z21, (i11 & 1024) != 0 ? bVar.f97005k : z22, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? bVar.f97006l : z23, (i11 & 4096) != 0 ? bVar.f97007m : z24, (i11 & 8192) != 0 ? bVar.f97008n : z25, (i11 & 16384) != 0 ? bVar.f97009o : z26, (i11 & 32768) != 0 ? bVar.f97010p : f11);
        }

        /* renamed from: a */
        public final b m102098a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, float f11) {
            return new b(z11, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, z25, z26, f11);
        }

        /* renamed from: c */
        public final boolean m102099c() {
            return this.f97007m;
        }

        /* renamed from: d */
        public final boolean m102100d() {
            return this.f97004j;
        }

        /* renamed from: e */
        public final boolean m102101e() {
            return this.f96995a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f96995a == bVar.f96995a && this.f96996b == bVar.f96996b && this.f96997c == bVar.f96997c && this.f96998d == bVar.f96998d && this.f96999e == bVar.f96999e && this.f97000f == bVar.f97000f && this.f97001g == bVar.f97001g && this.f97002h == bVar.f97002h && this.f97003i == bVar.f97003i && this.f97004j == bVar.f97004j && this.f97005k == bVar.f97005k && this.f97006l == bVar.f97006l && this.f97007m == bVar.f97007m && this.f97008n == bVar.f97008n && this.f97009o == bVar.f97009o && Float.compare(this.f97010p, bVar.f97010p) == 0;
        }

        /* renamed from: f */
        public final boolean m102102f() {
            return this.f96997c;
        }

        /* renamed from: g */
        public final boolean m102103g() {
            return this.f97000f;
        }

        /* renamed from: h */
        public final boolean m102104h() {
            return this.f96999e;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((AbstractC2144f.m11520a(this.f96995a) * 31) + AbstractC2144f.m11520a(this.f96996b)) * 31) + AbstractC2144f.m11520a(this.f96997c)) * 31) + AbstractC2144f.m11520a(this.f96998d)) * 31) + AbstractC2144f.m11520a(this.f96999e)) * 31) + AbstractC2144f.m11520a(this.f97000f)) * 31) + AbstractC2144f.m11520a(this.f97001g)) * 31) + AbstractC2144f.m11520a(this.f97002h)) * 31) + AbstractC2144f.m11520a(this.f97003i)) * 31) + AbstractC2144f.m11520a(this.f97004j)) * 31) + AbstractC2144f.m11520a(this.f97005k)) * 31) + AbstractC2144f.m11520a(this.f97006l)) * 31) + AbstractC2144f.m11520a(this.f97007m)) * 31) + AbstractC2144f.m11520a(this.f97008n)) * 31) + AbstractC2144f.m11520a(this.f97009o)) * 31) + Float.floatToIntBits(this.f97010p);
        }

        /* renamed from: i */
        public final boolean m102105i() {
            return this.f97009o;
        }

        /* renamed from: j */
        public final boolean m102106j() {
            return this.f97005k;
        }

        /* renamed from: k */
        public final boolean m102107k() {
            return this.f97008n;
        }

        /* renamed from: l */
        public final boolean m102108l() {
            return this.f96996b;
        }

        /* renamed from: m */
        public final boolean m102109m() {
            return this.f96998d;
        }

        /* renamed from: n */
        public final float m102110n() {
            return this.f97010p;
        }

        public String toString() {
            return "FeedZShortViewState(debugView=" + this.f96995a + ", suggestView=" + this.f96996b + ", errorView=" + this.f96997c + ", videoThumb=" + this.f96998d + ", loadingView=" + this.f96999e + ", feedInternalHeader=" + this.f97000f + ", channelAvatar=" + this.f97001g + ", channelLogo=" + this.f97002h + ", channelName=" + this.f97003i + ", buttonSpeaker=" + this.f97004j + ", playButton=" + this.f97005k + ", barrierView=" + this.f97006l + ", animRhythmView=" + this.f97007m + ", retryView=" + this.f97008n + ", placeholder=" + this.f97009o + ", viewSize=" + this.f97010p + ")";
        }

        public /* synthetic */ b(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, float f11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? C19531d.Companion.m102096a() : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? false : z16, (i11 & 64) != 0 ? true : z17, (i11 & 128) != 0 ? true : z18, (i11 & 256) == 0 ? z19 : true, (i11 & 512) != 0 ? false : z21, (i11 & 1024) != 0 ? false : z22, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? false : z23, (i11 & 4096) != 0 ? false : z24, (i11 & 8192) != 0 ? false : z25, (i11 & 16384) != 0 ? false : z26, (i11 & 32768) != 0 ? 0.75f : f11);
        }
    }

    /* renamed from: b */
    public final EnumC18536f m102092b() {
        return this.f96994a;
    }

    /* renamed from: c */
    public final b m102093c(AbstractC19530c abstractC19530c) {
        AbstractC19074t.m100208f(abstractC19530c, "itemState");
        if ((abstractC19530c instanceof AbstractC19530c.b) || AbstractC19074t.m100204b(abstractC19530c, AbstractC19530c.h.f96990a)) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, 0.0f, 65511, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.i) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, 0.0f, 40959, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.a) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, 2.3f, 16379, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.d) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, 0.0f, 65519, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.g) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, 0.0f, 65023, null);
        }
        if (AbstractC19074t.m100204b(abstractC19530c, AbstractC19530c.c.f96985a)) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, 0.0f, 64503, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.f) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, 0.0f, 64511, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.j) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65525, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.e) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, 0.0f, 47103, null);
        }
        return new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null);
    }

    /* renamed from: d */
    public final b m102094d(AbstractC19530c abstractC19530c) {
        AbstractC19074t.m100208f(abstractC19530c, "itemState");
        if (abstractC19530c instanceof AbstractC19530c.a) {
            return b.m102097b(m102093c(abstractC19530c), false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, 2.3f, 9691, null);
        }
        if (abstractC19530c instanceof AbstractC19530c.j) {
            return b.m102097b(new b(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0f, 65535, null), false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, 0.0f, 58837, null);
        }
        b m102093c = m102093c(abstractC19530c);
        return b.m102097b(m102093c, false, false, false, false, false, true, false, false, false, false, false, false, m102093c.m102100d(), false, false, 0.0f, 58847, null);
    }

    /* renamed from: e */
    public final void m102095e(EnumC18536f enumC18536f) {
        this.f96994a = enumC18536f;
    }
}
