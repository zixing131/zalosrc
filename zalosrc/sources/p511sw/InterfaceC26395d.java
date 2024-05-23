package p511sw;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p667y2.C30268e;

/* renamed from: sw.d */
/* loaded from: classes.dex */
public interface InterfaceC26395d {

    /* renamed from: sw.d$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: sw.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32973a {
            /* renamed from: a */
            public static void m136093a(a aVar, c.a aVar2) {
                AbstractC19074t.m100208f(aVar2, C30268e.f140632a);
            }
        }

        /* renamed from: a */
        void mo64203a(c.b bVar);

        /* renamed from: b */
        void mo64204b();

        /* renamed from: c */
        void mo64205c(c.a aVar);
    }

    /* renamed from: sw.d$b */
    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: a */
        private final int f125393a;

        /* renamed from: sw.d$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: b */
            private final InterfaceC26392a f125394b;

            /* renamed from: c */
            private final boolean f125395c;

            public /* synthetic */ a(InterfaceC26392a interfaceC26392a, int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
                this(interfaceC26392a, (i12 & 2) != 0 ? 20 : i11, (i12 & 4) != 0 ? true : z11);
            }

            /* renamed from: b */
            public final boolean m136095b() {
                return this.f125395c;
            }

            /* renamed from: c */
            public final InterfaceC26392a m136096c() {
                return this.f125394b;
            }

            public String toString() {
                return "Around(targetItem=" + this.f125394b + ", requestedSize=" + m136094a() + ", findExactly=" + this.f125395c + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC26392a interfaceC26392a, int i11, boolean z11) {
                super(i11, null);
                AbstractC19074t.m100208f(interfaceC26392a, "targetItem");
                this.f125394b = interfaceC26392a;
                this.f125395c = z11;
            }
        }

        /* renamed from: sw.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32974b extends b {
            public /* synthetic */ C32974b(int i11, int i12, AbstractC19060k abstractC19060k) {
                this((i12 & 1) != 0 ? 20 : i11);
            }

            public String toString() {
                return "Bottom(requestedSize=" + m136094a() + ")";
            }

            public C32974b(int i11) {
                super(i11, null);
            }
        }

        /* renamed from: sw.d$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b */
            private final InterfaceC26392a f125396b;

            public /* synthetic */ c(InterfaceC26392a interfaceC26392a, int i11, int i12, AbstractC19060k abstractC19060k) {
                this((i12 & 1) != 0 ? null : interfaceC26392a, (i12 & 2) != 0 ? 20 : i11);
            }

            /* renamed from: b */
            public final InterfaceC26392a m136097b() {
                return this.f125396b;
            }

            public String toString() {
                return "Initial(targetItem=" + this.f125396b + ", requestedSize=" + m136094a() + ")";
            }

            public c(InterfaceC26392a interfaceC26392a, int i11) {
                super(i11, null);
                this.f125396b = interfaceC26392a;
            }
        }

        /* renamed from: sw.d$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: b */
            private final boolean f125397b;

            public /* synthetic */ d(boolean z11, int i11, int i12, AbstractC19060k abstractC19060k) {
                this(z11, (i12 & 2) != 0 ? 20 : i11);
            }

            /* renamed from: b */
            public final boolean m136098b() {
                return this.f125397b;
            }

            public String toString() {
                return "More(top=" + this.f125397b + ", requestedSize=" + m136094a() + ")";
            }

            public d(boolean z11, int i11) {
                super(i11, null);
                this.f125397b = z11;
            }
        }

        public /* synthetic */ b(int i11, AbstractC19060k abstractC19060k) {
            this(i11);
        }

        /* renamed from: a */
        public final int m136094a() {
            return this.f125393a;
        }

        private b(int i11) {
            this.f125393a = i11;
        }
    }

    /* renamed from: sw.d$c */
    /* loaded from: classes4.dex */
    public static abstract class c {

        /* renamed from: sw.d$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends c {

            /* renamed from: a */
            private final Throwable f125398a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th2) {
                super(null);
                AbstractC19074t.m100208f(th2, "throwable");
                this.f125398a = th2;
            }

            /* renamed from: a */
            public final Throwable m136099a() {
                return this.f125398a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC19074t.m100204b(this.f125398a, ((a) obj).f125398a);
            }

            public int hashCode() {
                return this.f125398a.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.f125398a + ")";
            }
        }

        /* renamed from: sw.d$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends c {
            public static final a Companion = new a(null);

            /* renamed from: c */
            private static final b f125399c = new b(new C26394c("-1"), null);

            /* renamed from: a */
            private final C26394c f125400a;

            /* renamed from: b */
            private final InterfaceC26396e f125401b;

            /* renamed from: sw.d$c$b$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C26394c c26394c, InterfaceC26396e interfaceC26396e) {
                super(null);
                AbstractC19074t.m100208f(c26394c, "data");
                this.f125400a = c26394c;
                this.f125401b = interfaceC26396e;
            }

            /* renamed from: a */
            public final C26394c m136100a() {
                return this.f125400a;
            }

            /* renamed from: b */
            public final InterfaceC26396e m136101b() {
                return this.f125401b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC19074t.m100204b(this.f125400a, bVar.f125400a) && AbstractC19074t.m100204b(this.f125401b, bVar.f125401b);
            }

            public int hashCode() {
                int hashCode = this.f125400a.hashCode() * 31;
                InterfaceC26396e interfaceC26396e = this.f125401b;
                return hashCode + (interfaceC26396e == null ? 0 : interfaceC26396e.hashCode());
            }

            public String toString() {
                return "Page(data=" + this.f125400a + ", targetItem=" + this.f125401b + ")";
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public b(C26394c c26394c) {
                this(c26394c, null);
                AbstractC19074t.m100208f(c26394c, "data");
            }
        }

        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    void mo136089a(C26394c c26394c, b.C32974b c32974b, a aVar, InterfaceC18505l interfaceC18505l);

    /* renamed from: b */
    void mo136090b(C26394c c26394c, b.a aVar, a aVar2, InterfaceC18505l interfaceC18505l);

    /* renamed from: c */
    void mo136091c(C26394c c26394c, b.c cVar, a aVar, InterfaceC18505l interfaceC18505l);

    /* renamed from: d */
    void mo136092d(C26394c c26394c, b.d dVar, a aVar, InterfaceC18505l interfaceC18505l);
}
