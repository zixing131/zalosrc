package p662xy;

import ae.C0766k;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import on0.AbstractC24340u;
import p185gc.AbstractC19378b;
import p348mi.AbstractC23306f;
import p405ov.C24561c;
import p623ww.C29252b;
import p625wy.C29268a;

/* renamed from: xy.a */
/* loaded from: classes4.dex */
public final class C30222a extends AbstractC19378b {
    public static final a Companion = new a(null);

    /* renamed from: xy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xy.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C29268a f140372a;

        /* renamed from: b */
        private final String f140373b;

        /* renamed from: c */
        private final String f140374c;

        /* renamed from: d */
        private final String f140375d;

        public b(C29268a c29268a, String str, String str2, String str3) {
            AbstractC19074t.m100208f(c29268a, "bankAccount");
            AbstractC19074t.m100208f(str, "senderId");
            AbstractC19074t.m100208f(str2, "ownerId");
            AbstractC19074t.m100208f(str3, "entryPointSendMsg");
            this.f140372a = c29268a;
            this.f140373b = str;
            this.f140374c = str2;
            this.f140375d = str3;
        }

        /* renamed from: a */
        public final C29268a m149012a() {
            return this.f140372a;
        }

        /* renamed from: b */
        public final String m149013b() {
            return this.f140375d;
        }

        /* renamed from: c */
        public final String m149014c() {
            return this.f140374c;
        }

        /* renamed from: d */
        public final String m149015d() {
            return this.f140373b;
        }
    }

    /* renamed from: xy.a$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final int f140376a;

        public c(int i11) {
            this.f140376a = i11;
        }

        /* renamed from: a */
        public final int m149016a() {
            return this.f140376a;
        }
    }

    /* renamed from: xy.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ AbstractC19378b.a f140377a;

        /* renamed from: b */
        final /* synthetic */ C30222a f140378b;

        /* renamed from: c */
        final /* synthetic */ b f140379c;

        d(AbstractC19378b.a aVar, C30222a c30222a, b bVar) {
            this.f140377a = aVar;
            this.f140378b = c30222a;
            this.f140379c = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0023, code lost:            if (r4 == null) goto L5;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            String str;
            if (c20096c != null) {
                str = c20096c.m104492d() + "(" + c20096c.m104491c() + ")";
            }
            str = "";
            AbstractC23350e.m122774d("QRWallet", "Api send bank card fail " + str);
            this.f140378b.m149009h(this.f140379c.m149014c(), this.f140379c.m149012a(), this.f140379c.m149013b());
            AbstractC19378b.a aVar = this.f140377a;
            if (aVar != null) {
                aVar.onSuccess(new c(2));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19378b.a aVar = this.f140377a;
            if (aVar != null) {
                aVar.onSuccess(new c(1));
            }
        }
    }

    /* renamed from: f */
    private final String m149008f(C29268a c29268a) {
        String str;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_wallet_msg_text_bank_card_account_number);
        String m146263c = c29268a.m146263c();
        String str2 = "";
        if (c29268a.m146264d().length() <= 0) {
            str = "";
        } else {
            str = "\n" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_wallet_msg_text_bank_card_account_name) + c29268a.m146264d();
        }
        if (c29268a.m146261a().length() > 0) {
            str2 = "\n" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_wallet_msg_text_bank_card_bank_name) + c29268a.m146261a();
        }
        return m118743r0 + m146263c + str + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m149009h(String str, C29268a c29268a, String str2) {
        AbstractC23112j7.m118534i0(str, m149008f(c29268a), null, null, str2);
    }

    /* renamed from: i */
    private final boolean m149010i(b bVar) {
        if (bVar.m149012a().m146265e() && bVar.m149015d().length() != 0 && bVar.m149014c().length() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19378b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1884d(b bVar, AbstractC19378b.a aVar) {
        Long m127109o;
        long j11;
        AbstractC19074t.m100208f(bVar, "params");
        if (!m149010i(bVar)) {
            C24561c.m127942b("QRWallet", "Send bank card invalid params");
            if (aVar != null) {
                aVar.mo1004b();
                return;
            }
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            m149009h(bVar.m149014c(), bVar.m149012a(), bVar.m149013b());
            if (aVar != null) {
                aVar.onSuccess(new c(2));
                return;
            }
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(aVar, this, bVar));
        m127109o = AbstractC24340u.m127109o(AbstractC23306f.m120599M0().m103086b());
        if (m127109o != null) {
            j11 = m127109o.longValue();
        } else {
            j11 = 0;
        }
        c0766k.m1872u0(bVar.m149015d(), bVar.m149014c(), j11, bVar.m149012a().m146262b(), bVar.m149012a().m146263c(), bVar.m149012a().m146264d(), 2, 5000L, 0L, C29252b.f135467a.m146046a(bVar.m149013b()));
    }
}
