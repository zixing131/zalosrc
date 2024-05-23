package nr;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p458qr.C25480m;
import p458qr.InterfaceC25486s;
import p534u1.AbstractC26941a;
import p716zh.C32002l4;
import p716zh.C32017m4;

/* renamed from: nr.a */
/* loaded from: classes4.dex */
public final class C23928a extends AbstractC19963b {

    /* renamed from: t */
    private final InterfaceC25486s f115609t;

    /* renamed from: u */
    private final C32002l4 f115610u;

    /* renamed from: v */
    private final C1761c0 f115611v;

    /* renamed from: nr.a$a */
    /* loaded from: classes4.dex */
    public static final class a implements C1802w0.b {

        /* renamed from: a */
        private final InterfaceC25486s f115612a;

        public a(InterfaceC25486s interfaceC25486s) {
            AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
            this.f115612a = interfaceC25486s;
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
            if (cls.isAssignableFrom(C23928a.class)) {
                return new C23928a(this.f115612a);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }

        public /* synthetic */ a(InterfaceC25486s interfaceC25486s, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? C25480m.f122070a : interfaceC25486s);
        }
    }

    /* renamed from: nr.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a */
        private final String f115613a;

        public b(String str) {
            AbstractC19074t.m100208f(str, "songId");
            this.f115613a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f115613a, ((b) obj).f115613a);
        }

        public int hashCode() {
            return this.f115613a.hashCode();
        }

        public String toString() {
            return "NavigatePostStoryMusicView(songId=" + this.f115613a + ")";
        }
    }

    /* renamed from: nr.a$c */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* renamed from: nr.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: a */
        private final String f115614a;

        public d(String str) {
            AbstractC19074t.m100208f(str, "idSong");
            this.f115614a = str;
        }

        /* renamed from: a */
        public final String m125064a() {
            return this.f115614a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC19074t.m100204b(this.f115614a, ((d) obj).f115614a);
        }

        public int hashCode() {
            return this.f115614a.hashCode();
        }

        public String toString() {
            return "NavigateZingMp3WebView(idSong=" + this.f115614a + ")";
        }
    }

    public C23928a(InterfaceC25486s interfaceC25486s) {
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        this.f115609t = interfaceC25486s;
        this.f115610u = C32002l4.Companion.m154287a(10029);
        this.f115611v = new C1761c0();
    }

    /* renamed from: O */
    public final LiveData m125061O() {
        return this.f115611v;
    }

    /* renamed from: P */
    public final void m125062P(String str) {
        AbstractC19074t.m100208f(str, "songId");
        this.f115611v.mo9224q(new C19964c(new b(str)));
    }

    /* renamed from: Q */
    public final void m125063Q(String str) {
        AbstractC19074t.m100208f(str, "songId");
        InterfaceC25486s.a.m132025a(this.f115609t, C32017m4.m154326S().m154346U(this.f115610u.m154284u(80)), false, 2, null);
        this.f115611v.mo9224q(new C19964c(new d(str)));
    }
}
