package p115dy;

import com.zing.zalo.productcatalog.model.Product;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: dy.y0 */
/* loaded from: classes4.dex */
public abstract class AbstractC18129y0 {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private EnumC18118t f91757a;

    /* renamed from: b */
    private boolean f91758b;

    /* renamed from: c */
    private boolean f91759c;

    /* renamed from: dy.y0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC18129y0 {

        /* renamed from: d */
        private boolean f91760d;

        public a(boolean z11) {
            super(null);
            this.f91760d = z11;
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1006L;
        }

        /* renamed from: h */
        public final boolean m96419h() {
            return this.f91760d;
        }

        /* renamed from: i */
        public final void m96420i(boolean z11) {
            this.f91760d = z11;
        }
    }

    /* renamed from: dy.y0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.y0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC18129y0 {

        /* renamed from: d */
        public static final c f91761d = new c();

        private c() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1005L;
        }
    }

    /* renamed from: dy.y0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC18129y0 {

        /* renamed from: d */
        public static final d f91762d = new d();

        private d() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1004L;
        }
    }

    /* renamed from: dy.y0$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC18129y0 {

        /* renamed from: d */
        public static final e f91763d = new e();

        private e() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1003L;
        }
    }

    /* renamed from: dy.y0$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC18129y0 {

        /* renamed from: d */
        public static final f f91764d = new f();

        private f() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1002L;
        }
    }

    /* renamed from: dy.y0$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC18129y0 {

        /* renamed from: d */
        public static final g f91765d = new g();

        private g() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1000L;
        }
    }

    /* renamed from: dy.y0$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC18129y0 {

        /* renamed from: d */
        public static final h f91766d = new h();

        private h() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1001L;
        }
    }

    /* renamed from: dy.y0$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC18129y0 {

        /* renamed from: d */
        private final Product f91767d;

        /* renamed from: e */
        private boolean f91768e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Product product) {
            super(null);
            AbstractC19074t.m100208f(product, "product");
            this.f91767d = product;
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return this.f91767d.m48485i();
        }

        /* renamed from: h */
        public final Product m96421h() {
            return this.f91767d;
        }

        /* renamed from: i */
        public final boolean m96422i() {
            return this.f91768e;
        }

        /* renamed from: j */
        public final void m96423j(boolean z11) {
            this.f91768e = z11;
        }
    }

    /* renamed from: dy.y0$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC18129y0 {

        /* renamed from: d */
        private boolean f91769d;

        public j() {
            super(null);
        }

        @Override // p115dy.AbstractC18129y0
        /* renamed from: c */
        public long mo96414c() {
            return -1007L;
        }

        /* renamed from: h */
        public final boolean m96424h() {
            return this.f91769d;
        }

        /* renamed from: i */
        public final void m96425i(boolean z11) {
            this.f91769d = z11;
        }
    }

    public /* synthetic */ AbstractC18129y0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final boolean m96412a() {
        return this.f91759c;
    }

    /* renamed from: b */
    public final EnumC18118t m96413b() {
        return this.f91757a;
    }

    /* renamed from: c */
    public abstract long mo96414c();

    /* renamed from: d */
    public final boolean m96415d() {
        return this.f91758b;
    }

    /* renamed from: e */
    public final void m96416e(boolean z11) {
        this.f91759c = z11;
    }

    /* renamed from: f */
    public final void m96417f(EnumC18118t enumC18118t) {
        AbstractC19074t.m100208f(enumC18118t, "<set-?>");
        this.f91757a = enumC18118t;
    }

    /* renamed from: g */
    public final void m96418g(boolean z11) {
        this.f91758b = z11;
    }

    private AbstractC18129y0() {
        this.f91757a = EnumC18118t.f91728q;
        this.f91759c = true;
    }
}
