package jc0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: jc0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC21220a {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private final int f103452a;

    /* renamed from: jc0.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC21220a {

        /* renamed from: b */
        private final C21221b f103453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21221b c21221b) {
            super(1, null);
            AbstractC19074t.m100208f(c21221b, "zCloudConnectItem");
            this.f103453b = c21221b;
        }

        /* renamed from: b */
        public final C21221b m109963b() {
            return this.f103453b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f103453b, ((a) obj).f103453b);
        }

        public int hashCode() {
            return this.f103453b.hashCode();
        }

        public String toString() {
            return "BodyView(zCloudConnectItem=" + this.f103453b + ")";
        }
    }

    /* renamed from: jc0.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC21220a {

        /* renamed from: b */
        public static final b f103454b = new b();

        private b() {
            super(2, null);
        }
    }

    /* renamed from: jc0.a$c */
    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: jc0.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC21220a {

        /* renamed from: b */
        public static final d f103455b = new d();

        private d() {
            super(0, null);
        }
    }

    public /* synthetic */ AbstractC21220a(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m109962a() {
        return this.f103452a;
    }

    private AbstractC21220a(int i11) {
        this.f103452a = i11;
    }
}
