package p041bu;

import android.graphics.Bitmap;
import android.util.LruCache;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: bu.a */
/* loaded from: classes4.dex */
public final class C3142a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f13257c;

    /* renamed from: a */
    private final LruCache f13258a;

    /* renamed from: b */
    private final LruCache f13259b;

    /* renamed from: bu.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f13260q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3142a mo12V4() {
            return c.f13261a.m15824a();
        }
    }

    /* renamed from: bu.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3142a m15823a() {
            return (C3142a) C3142a.f13257c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bu.a$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f13261a = new c();

        /* renamed from: b */
        private static final C3142a f13262b = new C3142a(null);

        private c() {
        }

        /* renamed from: a */
        public final C3142a m15824a() {
            return f13262b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f13260q);
        f13257c = m129210a;
    }

    public /* synthetic */ C3142a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    public static final C3142a m15817c() {
        return Companion.m15823a();
    }

    /* renamed from: b */
    public final Bitmap m15818b(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (Bitmap) this.f13259b.get(str);
    }

    /* renamed from: d */
    public final Bitmap m15819d(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (Bitmap) this.f13258a.get(str);
    }

    /* renamed from: e */
    public final void m15820e(String str, Bitmap bitmap) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(bitmap, "bitmap");
        if (m15818b(str) == null) {
            this.f13259b.put(str, bitmap);
        }
    }

    /* renamed from: f */
    public final void m15821f(String str, Bitmap bitmap) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(bitmap, "bitmap");
        if (m15819d(str) == null) {
            this.f13258a.put(str, bitmap);
        }
    }

    private C3142a() {
        this.f13258a = new LruCache(10);
        this.f13259b = new LruCache(3);
    }
}
