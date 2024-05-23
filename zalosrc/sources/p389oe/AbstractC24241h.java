package p389oe;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: oe.h */
/* loaded from: classes3.dex */
public abstract class AbstractC24241h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f117074a;

    /* renamed from: oe.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: oe.h$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC24241h {

        /* renamed from: b */
        private String f117075b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1, null);
            AbstractC19074t.m100208f(str, "message");
            this.f117075b = str;
        }

        /* renamed from: b */
        public final String m126544b() {
            return this.f117075b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f117075b, ((b) obj).f117075b);
        }

        public int hashCode() {
            return this.f117075b.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f117075b + ")";
        }
    }

    /* renamed from: oe.h$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC24241h {

        /* renamed from: b */
        private String f117076b;

        /* renamed from: c */
        private String f117077c;

        /* renamed from: d */
        private String f117078d;

        /* renamed from: e */
        private String f117079e;

        /* renamed from: f */
        private String f117080f;

        /* renamed from: g */
        private boolean f117081g;

        /* renamed from: h */
        private boolean f117082h;

        /* renamed from: i */
        private int f117083i;

        /* renamed from: j */
        private boolean f117084j;

        /* renamed from: k */
        private boolean f117085k;

        /* renamed from: l */
        private boolean f117086l;

        public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15, int i12, AbstractC19060k abstractC19060k) {
            this(str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) == 0 ? str5 : "", (i12 & 32) != 0 ? true : z11, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? 0 : i11, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? false : z14, (i12 & 1024) == 0 ? z15 : false);
        }

        /* renamed from: b */
        public final c m126546b(String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15) {
            AbstractC19074t.m100208f(str, "idSong");
            AbstractC19074t.m100208f(str2, "thumbURL");
            AbstractC19074t.m100208f(str3, "songName");
            AbstractC19074t.m100208f(str4, "artistName");
            AbstractC19074t.m100208f(str5, "src");
            return new c(str, str2, str3, str4, str5, z11, z12, i11, z13, z14, z15);
        }

        /* renamed from: d */
        public final String m126547d() {
            return this.f117079e;
        }

        /* renamed from: e */
        public final String m126548e() {
            return this.f117076b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f117076b, cVar.f117076b) && AbstractC19074t.m100204b(this.f117077c, cVar.f117077c) && AbstractC19074t.m100204b(this.f117078d, cVar.f117078d) && AbstractC19074t.m100204b(this.f117079e, cVar.f117079e) && AbstractC19074t.m100204b(this.f117080f, cVar.f117080f) && this.f117081g == cVar.f117081g && this.f117082h == cVar.f117082h && this.f117083i == cVar.f117083i && this.f117084j == cVar.f117084j && this.f117085k == cVar.f117085k && this.f117086l == cVar.f117086l;
        }

        /* renamed from: f */
        public final int m126549f() {
            return this.f117083i;
        }

        /* renamed from: g */
        public final String m126550g() {
            return this.f117078d;
        }

        /* renamed from: h */
        public final String m126551h() {
            return this.f117080f;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f117076b.hashCode() * 31) + this.f117077c.hashCode()) * 31) + this.f117078d.hashCode()) * 31) + this.f117079e.hashCode()) * 31) + this.f117080f.hashCode()) * 31) + AbstractC2144f.m11520a(this.f117081g)) * 31) + AbstractC2144f.m11520a(this.f117082h)) * 31) + this.f117083i) * 31) + AbstractC2144f.m11520a(this.f117084j)) * 31) + AbstractC2144f.m11520a(this.f117085k)) * 31) + AbstractC2144f.m11520a(this.f117086l);
        }

        /* renamed from: i */
        public final String m126552i() {
            return this.f117077c;
        }

        /* renamed from: j */
        public final boolean m126553j() {
            return AbstractC19074t.m100204b(this.f117076b, "0");
        }

        /* renamed from: k */
        public final boolean m126554k() {
            return this.f117081g;
        }

        /* renamed from: l */
        public final boolean m126555l() {
            return this.f117085k;
        }

        /* renamed from: m */
        public final boolean m126556m() {
            return this.f117082h;
        }

        /* renamed from: n */
        public final boolean m126557n() {
            return this.f117084j;
        }

        /* renamed from: o */
        public final boolean m126558o() {
            return this.f117086l;
        }

        /* renamed from: p */
        public final void m126559p(boolean z11) {
            this.f117085k = z11;
        }

        /* renamed from: q */
        public final void m126560q(boolean z11) {
            this.f117082h = z11;
        }

        /* renamed from: r */
        public final void m126561r(int i11) {
            this.f117083i = i11;
        }

        /* renamed from: s */
        public final void m126562s(boolean z11) {
            this.f117084j = z11;
        }

        /* renamed from: t */
        public final void m126563t(boolean z11) {
            this.f117086l = z11;
        }

        public String toString() {
            return "RingBackTone(idSong=" + this.f117076b + ", thumbURL=" + this.f117077c + ", songName=" + this.f117078d + ", artistName=" + this.f117079e + ", src=" + this.f117080f + ", isEnable=" + this.f117081g + ", isPlaying=" + this.f117082h + ", progress=" + this.f117083i + ", isSelected=" + this.f117084j + ", isLoading=" + this.f117085k + ", isSelecting=" + this.f117086l + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15) {
            super(0, null);
            AbstractC19074t.m100208f(str, "idSong");
            AbstractC19074t.m100208f(str2, "thumbURL");
            AbstractC19074t.m100208f(str3, "songName");
            AbstractC19074t.m100208f(str4, "artistName");
            AbstractC19074t.m100208f(str5, "src");
            this.f117076b = str;
            this.f117077c = str2;
            this.f117078d = str3;
            this.f117079e = str4;
            this.f117080f = str5;
            this.f117081g = z11;
            this.f117082h = z12;
            this.f117083i = i11;
            this.f117084j = z13;
            this.f117085k = z14;
            this.f117086l = z15;
        }
    }

    /* renamed from: oe.h$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC24241h {

        /* renamed from: b */
        public static final d f117087b = new d();

        private d() {
            super(2, null);
        }
    }

    public /* synthetic */ AbstractC24241h(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m126543a() {
        return this.f117074a;
    }

    private AbstractC24241h(int i11) {
        this.f117074a = i11;
    }
}
