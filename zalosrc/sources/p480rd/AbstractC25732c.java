package p480rd;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: rd.c */
/* loaded from: classes3.dex */
public abstract class AbstractC25732c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f122853a;

    /* renamed from: b */
    private final String f122854b;

    /* renamed from: rd.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: rd.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC25732c {

        /* renamed from: c */
        private final boolean f122855c;

        public b(long j11, boolean z11) {
            super(j11, null);
            this.f122855c = z11;
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return "-1003";
        }

        /* renamed from: c */
        public final boolean m132832c() {
            return this.f122855c;
        }

        public /* synthetic */ b(long j11, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(j11, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* renamed from: rd.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC25732c {
        public c(long j11) {
            super(j11, null);
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return "-1004";
        }
    }

    /* renamed from: rd.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC25732c {

        /* renamed from: c */
        private final AbstractC25731b f122856c;

        /* renamed from: d */
        private boolean f122857d;

        public /* synthetic */ d(AbstractC25731b abstractC25731b, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(abstractC25731b, (i11 & 2) != 0 ? false : z11);
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return this.f122856c.m132824b();
        }

        /* renamed from: c */
        public final AbstractC25731b m132833c() {
            return this.f122856c;
        }

        /* renamed from: d */
        public final boolean m132834d() {
            return this.f122857d;
        }

        /* renamed from: e */
        public final void m132835e(boolean z11) {
            this.f122857d = z11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC25731b abstractC25731b, boolean z11) {
            super(abstractC25731b.mo132825c(), null);
            AbstractC19074t.m100208f(abstractC25731b, "eventInfo");
            this.f122856c = abstractC25731b;
            this.f122857d = z11;
        }
    }

    /* renamed from: rd.c$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC25732c {
        public e(long j11) {
            super(j11, null);
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return "-1005";
        }
    }

    /* renamed from: rd.c$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC25732c {
        public f(long j11) {
            super(j11, null);
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return "-1006";
        }
    }

    /* renamed from: rd.c$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC25732c {
        public g(long j11) {
            super(j11, null);
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return "-1001";
        }
    }

    /* renamed from: rd.c$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC25732c {
        public h(long j11) {
            super(j11, null);
        }

        @Override // p480rd.AbstractC25732c
        /* renamed from: a */
        public String mo132830a() {
            return "-1002";
        }
    }

    public /* synthetic */ AbstractC25732c(long j11, AbstractC19060k abstractC19060k) {
        this(j11);
    }

    /* renamed from: a */
    public abstract String mo132830a();

    /* renamed from: b */
    public final long m132831b() {
        return this.f122853a;
    }

    private AbstractC25732c(long j11) {
        this.f122853a = j11;
        this.f122854b = "";
    }
}
