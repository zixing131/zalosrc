package cl;

import am.AbstractC0924m0;
import c30.C3245i;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p104dl.C18023b;
import p104dl.InterfaceC18022a;
import p348mi.AbstractC23310j;
import p716zh.C31933ga;
import y90.EnumC30858b;
import y90.EnumC30859c;

/* renamed from: cl.a */
/* loaded from: classes3.dex */
public final class C3570a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC18022a f15130a;

    /* renamed from: b */
    private final C31933ga f15131b;

    /* renamed from: cl.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC23310j {

        /* renamed from: cl.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C32693a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32693a f15132q = new C32693a();

            C32693a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3570a mo12V4() {
                return new C3570a(new C18023b(), null);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C32693a.f15132q);
        }
    }

    /* renamed from: cl.a$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15133a;

        static {
            int[] iArr = new int[EnumC30858b.values().length];
            try {
                iArr[EnumC30858b.f142393q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30858b.f142392p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15133a = iArr;
        }
    }

    public /* synthetic */ C3570a(InterfaceC18022a interfaceC18022a, AbstractC19060k abstractC19060k) {
        this(interfaceC18022a);
    }

    /* renamed from: a */
    public final void m18132a() {
        this.f15131b.m153475r(EnumC30858b.f142392p);
    }

    /* renamed from: b */
    public final void m18133b(int i11) {
        this.f15131b.m153476s(i11);
    }

    /* renamed from: c */
    public final void m18134c(EnumC30859c enumC30859c) {
        AbstractC19074t.m100208f(enumC30859c, "reason");
        this.f15131b.m153477t(enumC30859c);
    }

    /* renamed from: d */
    public final int m18135d() {
        return this.f15131b.m153460a();
    }

    /* renamed from: e */
    public final EnumC30858b m18136e() {
        return this.f15131b.m153461b();
    }

    /* renamed from: f */
    public final int m18137f() {
        return this.f15131b.m153462c();
    }

    /* renamed from: g */
    public final EnumC30859c m18138g() {
        return this.f15131b.m153463d();
    }

    /* renamed from: h */
    public final int m18139h() {
        return this.f15131b.m153465f();
    }

    /* renamed from: i */
    public final int m18140i() {
        return this.f15131b.m153467h();
    }

    /* renamed from: j */
    public final long m18141j() {
        return this.f15131b.m153466g();
    }

    /* renamed from: k */
    public final int m18142k() {
        return this.f15131b.m153464e();
    }

    /* renamed from: l */
    public final boolean m18143l() {
        return AbstractC0924m0.m3956ka();
    }

    /* renamed from: m */
    public final void m18144m() {
        this.f15131b.m153473p();
    }

    /* renamed from: n */
    public final void m18145n(boolean z11) {
        AbstractC0924m0.m3813fh(z11);
    }

    /* renamed from: o */
    public final void m18146o(int i11) {
        this.f15131b.m153468k(i11);
    }

    /* renamed from: p */
    public final void m18147p(int i11, EnumC30858b enumC30858b, int i12) {
        AbstractC19074t.m100208f(enumC30858b, "forceSelectEmojiTabReason");
        this.f15131b.m153474q(i11);
        if (b.f15133a[enumC30858b.ordinal()] == 2) {
            this.f15131b.m153469l(i12);
        }
    }

    /* renamed from: q */
    public final void m18148q(int i11, int i12) {
        this.f15131b.m153474q(i11);
        this.f15131b.m153470m(i12);
    }

    /* renamed from: r */
    public final void m18149r(C3245i c3245i, int i11, int i12) {
        AbstractC19074t.m100208f(c3245i, "stickerCategory");
        this.f15131b.m153474q(i11);
        this.f15131b.m153471n(c3245i, i12);
    }

    /* renamed from: s */
    public final void m18150s(int i11, int i12) {
        this.f15131b.m153474q(i11);
        this.f15131b.m153472o(i12);
    }

    private C3570a(InterfaceC18022a interfaceC18022a) {
        this.f15130a = interfaceC18022a;
        this.f15131b = C31933ga.f146718a;
    }
}
