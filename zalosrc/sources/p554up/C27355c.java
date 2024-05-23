package p554up;

import ag0.C0815e1;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20791e;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p456qp.C25451c;
import p456qp.C25453e;
import p458qr.C25478k;
import p509sp.C26354c;
import p509sp.C26356e;
import p534u1.AbstractC26941a;
import p716zh.C32002l4;
import p716zh.C32017m4;

/* renamed from: up.c */
/* loaded from: classes4.dex */
public final class C27355c extends AbstractC19963b {

    /* renamed from: t */
    private final C25453e f128771t;

    /* renamed from: u */
    private boolean f128772u;

    /* renamed from: v */
    private final C32002l4 f128773v;

    /* renamed from: w */
    private final C1761c0 f128774w;

    /* renamed from: x */
    private final C1761c0 f128775x;

    /* renamed from: y */
    private final C25478k f128776y;

    /* renamed from: up.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements C1802w0.b {

        /* renamed from: a */
        private final C25453e f128777a;

        public a(C25453e c25453e) {
            AbstractC19074t.m100208f(c25453e, "getSongInfoUseCase");
            this.f128777a = c25453e;
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            if (cls.isAssignableFrom(C27355c.class)) {
                return new C27355c(this.f128777a);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }

        public /* synthetic */ a(C25453e c25453e, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? new C25453e(null, 1, null) : c25453e);
        }
    }

    /* renamed from: up.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a */
        private final String f128778a;

        /* renamed from: b */
        private final String f128779b;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "songId");
            AbstractC19074t.m100208f(str2, "thumbRec");
            this.f128778a = str;
            this.f128779b = str2;
        }

        /* renamed from: a */
        public final String m140057a() {
            return this.f128778a;
        }

        /* renamed from: b */
        public final String m140058b() {
            return this.f128779b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f128778a, bVar.f128778a) && AbstractC19074t.m100204b(this.f128779b, bVar.f128779b);
        }

        public int hashCode() {
            return (this.f128778a.hashCode() * 31) + this.f128779b.hashCode();
        }

        public String toString() {
            return "NavigatePostFeedMusicView(songId=" + this.f128778a + ", thumbRec=" + this.f128779b + ")";
        }
    }

    /* renamed from: up.c$c */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* renamed from: up.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: a */
        private final String f128780a;

        public d(String str) {
            AbstractC19074t.m100208f(str, "idSong");
            this.f128780a = str;
        }

        /* renamed from: a */
        public final String m140059a() {
            return this.f128780a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC19074t.m100204b(this.f128780a, ((d) obj).f128780a);
        }

        public int hashCode() {
            return this.f128780a.hashCode();
        }

        public String toString() {
            return "NavigateZingMp3WebView(idSong=" + this.f128780a + ")";
        }
    }

    public C27355c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: U */
    private final boolean m140050U() {
        C26354c c26354c = C26354c.f125196a;
        if (!c26354c.mo104102a() && (!c26354c.mo104103b() || !this.f128776y.mo131937b())) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public final LiveData m140051O() {
        return this.f128774w;
    }

    /* renamed from: P */
    public final LiveData m140052P() {
        return this.f128775x;
    }

    /* renamed from: Q */
    public final void m140053Q(String str, String str2) {
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(str2, "thumbRec");
        this.f128775x.mo9224q(new C19964c(new b(str, str2)));
    }

    /* renamed from: R */
    public final void m140054R(String str) {
        AbstractC19074t.m100208f(str, "songId");
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(this.f128773v.m154284u(69)), false);
        this.f128775x.mo9224q(new C19964c(new d(str)));
    }

    /* renamed from: S */
    public final void m140055S() {
        if (!this.f128772u) {
            C25451c.f121865a.m131816d();
        }
    }

    /* renamed from: T */
    public final void m140056T() {
        this.f128772u = C26356e.f125201a.m135680e();
        if (m140050U()) {
            C25451c.f121865a.m131817e();
        }
    }

    public C27355c(C25453e c25453e) {
        AbstractC19074t.m100208f(c25453e, "getSongInfoUseCase");
        this.f128771t = c25453e;
        this.f128772u = true;
        this.f128773v = C32002l4.Companion.m154287a(10027);
        this.f128774w = new C1761c0(Boolean.valueOf(C20791e.f102159a.m108487c()));
        this.f128775x = new C1761c0();
        this.f128776y = new C25478k();
    }

    public /* synthetic */ C27355c(C25453e c25453e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C25453e(null, 1, null) : c25453e);
    }
}
