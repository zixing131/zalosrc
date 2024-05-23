package p624wx;

import com.zing.zalo.productcatalog.model.Product;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: wx.f */
/* loaded from: classes4.dex */
public abstract class AbstractC29263f {

    /* renamed from: a */
    private boolean f135583a;

    /* renamed from: wx.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29263f {

        /* renamed from: b */
        private final C29259b f135584b;

        /* renamed from: c */
        private final int f135585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29259b c29259b, int i11) {
            super(null);
            AbstractC19074t.m100208f(c29259b, "newCatalog");
            this.f135584b = c29259b;
            this.f135585c = i11;
        }

        /* renamed from: c */
        public final int m146185c() {
            return this.f135585c;
        }
    }

    /* renamed from: wx.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29263f {

        /* renamed from: b */
        private final C29259b f135586b;

        /* renamed from: c */
        private final int f135587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29259b c29259b, int i11) {
            super(null);
            AbstractC19074t.m100208f(c29259b, "editedCatalog");
            this.f135586b = c29259b;
            this.f135587c = i11;
        }

        /* renamed from: c */
        public final C29259b m146186c() {
            return this.f135586b;
        }
    }

    /* renamed from: wx.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29263f {

        /* renamed from: b */
        public static final c f135588b = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: wx.f$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29263f {

        /* renamed from: b */
        private final long f135589b;

        public d(long j11) {
            super(null);
            this.f135589b = j11;
        }

        /* renamed from: c */
        public final long m146187c() {
            return this.f135589b;
        }
    }

    /* renamed from: wx.f$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29263f {

        /* renamed from: b */
        private final List f135590b;

        /* renamed from: c */
        private final int f135591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, int i11) {
            super(null);
            AbstractC19074t.m100208f(list, "deletedCatalogIds");
            this.f135590b = list;
            this.f135591c = i11;
        }

        /* renamed from: c */
        public final List m146188c() {
            return this.f135590b;
        }
    }

    /* renamed from: wx.f$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29263f {

        /* renamed from: b */
        public static final f f135592b = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: wx.f$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29263f {

        /* renamed from: b */
        private final boolean f135593b;

        public g(boolean z11) {
            super(null);
            this.f135593b = z11;
        }

        /* renamed from: c */
        public final boolean m146189c() {
            return this.f135593b;
        }
    }

    /* renamed from: wx.f$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29263f {

        /* renamed from: b */
        private final Product f135594b;

        /* renamed from: c */
        private final int f135595c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Product product, int i11) {
            super(null);
            AbstractC19074t.m100208f(product, "newProduct");
            this.f135594b = product;
            this.f135595c = i11;
        }

        /* renamed from: c */
        public final Product m146190c() {
            return this.f135594b;
        }
    }

    /* renamed from: wx.f$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29263f {

        /* renamed from: b */
        private final long f135596b;

        /* renamed from: c */
        private final int f135597c;

        /* renamed from: d */
        private final List f135598d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j11, int i11, List list) {
            super(null);
            AbstractC19074t.m100208f(list, "deletedProductIds");
            this.f135596b = j11;
            this.f135597c = i11;
            this.f135598d = list;
        }

        /* renamed from: c */
        public final long m146191c() {
            return this.f135596b;
        }

        /* renamed from: d */
        public final List m146192d() {
            return this.f135598d;
        }
    }

    /* renamed from: wx.f$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC29263f {

        /* renamed from: b */
        private final Product f135599b;

        /* renamed from: c */
        private final int f135600c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Product product, int i11) {
            super(null);
            AbstractC19074t.m100208f(product, "editedProduct");
            this.f135599b = product;
            this.f135600c = i11;
        }

        /* renamed from: c */
        public final Product m146193c() {
            return this.f135599b;
        }
    }

    /* renamed from: wx.f$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC29263f {

        /* renamed from: b */
        private final long f135601b;

        /* renamed from: c */
        private final long f135602c;

        /* renamed from: d */
        private final List f135603d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j11, long j12, List list) {
            super(null);
            AbstractC19074t.m100208f(list, "movedProductIds");
            this.f135601b = j11;
            this.f135602c = j12;
            this.f135603d = list;
        }

        /* renamed from: c */
        public final long m146194c() {
            return this.f135602c;
        }

        /* renamed from: d */
        public final List m146195d() {
            return this.f135603d;
        }

        /* renamed from: e */
        public final long m146196e() {
            return this.f135601b;
        }
    }

    private AbstractC29263f() {
    }

    public /* synthetic */ AbstractC29263f(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final boolean m146183a() {
        return this.f135583a;
    }

    /* renamed from: b */
    public final void m146184b(boolean z11) {
        this.f135583a = z11;
    }
}
