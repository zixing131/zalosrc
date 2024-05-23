package p710zb;

import ae.C0766k;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.InterfaceC20094a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: zb.b */
/* loaded from: classes3.dex */
public final class C31749b implements InterfaceC31748a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f145829a;

    /* renamed from: zb.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f145830q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C31749b mo12V4() {
            return c.f145831a.m152731a();
        }
    }

    /* renamed from: zb.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C31749b m152730a() {
            return (C31749b) C31749b.f145829a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zb.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f145831a = new c();

        /* renamed from: b */
        private static final C31749b f145832b = new C31749b();

        private c() {
        }

        /* renamed from: a */
        public final C31749b m152731a() {
            return f145832b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f145830q);
        f145829a = m129210a;
    }

    /* renamed from: c */
    public static final C31749b m152728c() {
        return Companion.m152730a();
    }

    @Override // p710zb.InterfaceC31748a
    /* renamed from: a */
    public void mo152726a(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "aliasNew");
        AbstractC19074t.m100208f(interfaceC20094a, "listener");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.m1800A0(Integer.parseInt(str), str2);
    }
}
