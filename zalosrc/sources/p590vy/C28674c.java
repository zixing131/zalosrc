package p590vy;

import ag0.AbstractC0837p0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.LiveData;
import bg0.C2797c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p205hc.AbstractC19963b;
import p405ov.C24561c;
import p534u1.AbstractC26941a;
import p625wy.C29268a;
import p625wy.C29269b;
import p625wy.InterfaceC29270c;
import p662xy.C30222a;
import p662xy.C30223b;
import pm0.C24848g0;
import pm0.InterfaceC24847g;

/* renamed from: vy.c */
/* loaded from: classes4.dex */
public final class C28674c extends AbstractC19963b {
    public static final c Companion = new c(null);

    /* renamed from: A */
    private final List f133090A;

    /* renamed from: B */
    private volatile boolean f133091B;

    /* renamed from: C */
    private final C2797c f133092C;

    /* renamed from: t */
    private final C1761c0 f133093t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f133094u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f133095v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f133096w = new C1761c0();

    /* renamed from: x */
    private final C1761c0 f133097x;

    /* renamed from: y */
    private final C1761c0 f133098y;

    /* renamed from: z */
    private final C1755a0 f133099z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vy.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m143608a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue() && C28674c.this.f133098y.mo9215f() != null) {
                C28674c.this.f133099z.mo9221n(C28674c.this.f133098y.mo9215f());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143608a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vy.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m143609a(InterfaceC22508f interfaceC22508f) {
            if (AbstractC19074t.m100204b(C28674c.this.f133097x.mo9215f(), Boolean.TRUE)) {
                C28674c.this.f133099z.mo9221n(interfaceC22508f);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143609a((InterfaceC22508f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vy.c$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: vy.c$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private final InterfaceC29270c f133102a;

        /* renamed from: b */
        private int f133103b;

        public d(InterfaceC29270c interfaceC29270c, int i11) {
            AbstractC19074t.m100208f(interfaceC29270c, "qrWalletItem");
            this.f133102a = interfaceC29270c;
            this.f133103b = i11;
        }

        /* renamed from: a */
        public final InterfaceC29270c m143610a() {
            return this.f133102a;
        }

        /* renamed from: b */
        public final int m143611b() {
            return this.f133103b;
        }

        /* renamed from: c */
        public final void m143612c(int i11) {
            this.f133103b = i11;
        }

        public /* synthetic */ d(InterfaceC29270c interfaceC29270c, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(interfaceC29270c, (i12 & 2) != 0 ? 0 : i11);
        }
    }

    /* renamed from: vy.c$e */
    /* loaded from: classes4.dex */
    public static final class e implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C28674c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vy.c$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f133104p;

        f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f133104p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f133104p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f133104p.mo205i9(obj);
        }
    }

    /* renamed from: vy.c$g */
    /* loaded from: classes4.dex */
    public static final class g implements AbstractC19378b.a {

        /* renamed from: a */
        final /* synthetic */ d f133105a;

        /* renamed from: b */
        final /* synthetic */ C28674c f133106b;

        g(d dVar, C28674c c28674c) {
            this.f133105a = dVar;
            this.f133106b = c28674c;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a */
        public void onSuccess(C30222a.c cVar) {
            AbstractC19074t.m100208f(cVar, "response");
            C24561c.m127942b("QRWallet", "sendBankCard success, type=" + cVar.m149016a());
            this.f133105a.m143612c(1);
            this.f133106b.m143593a0();
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            C24561c.m127942b("QRWallet", "sendBankCard error");
            this.f133105a.m143612c(2);
            this.f133106b.m143593a0();
        }
    }

    /* renamed from: vy.c$h */
    /* loaded from: classes4.dex */
    public static final class h implements AbstractC19378b.a {

        /* renamed from: a */
        final /* synthetic */ d f133107a;

        /* renamed from: b */
        final /* synthetic */ C28674c f133108b;

        h(d dVar, C28674c c28674c) {
            this.f133107a = dVar;
            this.f133108b = c28674c;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a */
        public void onSuccess(C30223b.c cVar) {
            AbstractC19074t.m100208f(cVar, "response");
            C24561c.m127942b("QRWallet", "sendPersonalIdentity success");
            this.f133107a.m143612c(1);
            this.f133108b.m143593a0();
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            C24561c.m127942b("QRWallet", "sendPersonalIdentity error");
            this.f133107a.m143612c(2);
            this.f133108b.m143593a0();
        }
    }

    public C28674c() {
        C1761c0 c1761c0 = new C1761c0();
        this.f133097x = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f133098y = c1761c02;
        C1755a0 c1755a0 = new C1755a0();
        this.f133099z = c1755a0;
        this.f133090A = new ArrayList();
        this.f133092C = new C2797c(AbstractC0837p0.Companion.m2237f());
        c1755a0.m9256r(c1761c0, new f(new a()));
        c1755a0.m9256r(c1761c02, new f(new b()));
    }

    /* renamed from: T */
    private final void m143591T(List list, String str, String str2, String str3) {
        long j11;
        ArrayList<d> arrayList = new ArrayList();
        synchronized (this.f133090A) {
            try {
                this.f133090A.clear();
                Iterator it = list.iterator();
                j11 = 0;
                int i11 = 0;
                while (it.hasNext()) {
                    InterfaceC29270c interfaceC29270c = (InterfaceC29270c) it.next();
                    this.f133090A.add(new d(interfaceC29270c, 0, 2, null));
                    if ((interfaceC29270c instanceof C29269b) && (i11 = i11 + 1) >= 2) {
                        j11 = 150;
                    }
                }
                arrayList.addAll(this.f133090A);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (d dVar : arrayList) {
            InterfaceC29270c m143610a = dVar.m143610a();
            if (m143610a instanceof C29268a) {
                m143596h0(dVar, str, str2, str3);
            } else if (m143610a instanceof C29269b) {
                m143597i0(dVar, str2, str3, j11);
            }
        }
    }

    /* renamed from: V */
    private final String m143592V() {
        String m143584b;
        C28672a c28672a = (C28672a) m103747M();
        if (c28672a == null || (m143584b = c28672a.m143584b()) == null) {
            return "";
        }
        return m143584b;
    }

    /* renamed from: a0 */
    public final void m143593a0() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        synchronized (this.f133090A) {
            Iterator it = this.f133090A.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).m143611b() == 0) {
                    return;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            int size = this.f133090A.size();
            synchronized (this.f133090A) {
                try {
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                    for (d dVar : this.f133090A) {
                        if (dVar.m143610a() instanceof C29268a) {
                            i11++;
                            if (dVar.m143611b() == 1) {
                                i12++;
                            } else if (dVar.m143611b() == 2) {
                                i13++;
                            }
                        } else if (dVar.m143610a() instanceof C29269b) {
                            i14++;
                            if (dVar.m143611b() == 1) {
                                i15++;
                            } else if (dVar.m143611b() == 2) {
                                i16++;
                            }
                        }
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24561c.m127942b("QRWallet", "Send all DONE: total=" + size + "; [Bank] total=" + i11 + ", success=" + i12 + ", fail=" + i13 + "; [CCCD] total=" + i14 + ", success=" + i15 + ", fail=" + i16);
            int i17 = i12 + i15;
            if (i17 >= 0 && i17 < size) {
                if (i16 > 0) {
                    if (i16 > 1) {
                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                    } else {
                        str = "";
                    }
                    AbstractC19074t.m100205c(str);
                    this.f133093t.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_wallet_send_error) + str);
                } else {
                    this.f133093t.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_wallet_send_fail_all));
                }
                if (i17 > 0) {
                    this.f133094u.mo9221n(Boolean.TRUE);
                }
            } else if (i17 == size) {
                this.f133094u.mo9221n(Boolean.TRUE);
            }
            m143594b0();
        }
    }

    /* renamed from: b0 */
    private final void m143594b0() {
        this.f133096w.mo9221n(Boolean.FALSE);
        this.f133091B = false;
    }

    /* renamed from: f0 */
    private final List m143595f0(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("bank_account");
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        AbstractC19074t.m100205c(optJSONObject);
                        arrayList.add(C29268a.Companion.m146266a(optJSONObject));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("personal_identity");
            if (optJSONArray2 != null) {
                AbstractC19074t.m100205c(optJSONArray2);
                int length2 = optJSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i12);
                    if (optJSONObject2 != null) {
                        AbstractC19074t.m100205c(optJSONObject2);
                        arrayList.add(C29269b.Companion.m146271a(optJSONObject2));
                    }
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
        }
        return arrayList;
    }

    /* renamed from: h0 */
    private final void m143596h0(d dVar, String str, String str2, String str3) {
        try {
            if (dVar.m143610a() instanceof C29268a) {
                new C30222a().m101501b(new C30222a.b((C29268a) dVar.m143610a(), str, str2, str3), new g(dVar, this));
                return;
            }
            throw new IllegalArgumentException("[BankAccount] qrWalletItem is invalid type ");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
            dVar.m143612c(2);
            m143593a0();
        }
    }

    /* renamed from: i0 */
    private final void m143597i0(d dVar, String str, String str2, long j11) {
        try {
            if (dVar.m143610a() instanceof C29269b) {
                new C30223b().m101501b(new C30223b.b((C29269b) dVar.m143610a(), str, str2, this.f133092C, j11), new h(dVar, this));
                return;
            }
            throw new IllegalArgumentException("[PersonalIdentity] qrWalletItem is invalid type");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
            dVar.m143612c(2);
            m143593a0();
        }
    }

    /* renamed from: j0 */
    private final void m143598j0(String str) {
        if (str != null && str.length() != 0) {
            String str2 = CoreUtility.f89233i;
            if (str2 != null && str2.length() != 0) {
                String m143592V = m143592V();
                if (m143592V.length() == 0) {
                    C24561c.m127942b("QRWallet", "sendQRWallet ownerId is invalid");
                    return;
                } else {
                    if (this.f133091B) {
                        return;
                    }
                    this.f133091B = true;
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vy.b

                        /* renamed from: q */
                        public final /* synthetic */ String f133087q;

                        /* renamed from: r */
                        public final /* synthetic */ String f133088r;

                        /* renamed from: s */
                        public final /* synthetic */ String f133089s;

                        public /* synthetic */ RunnableC28673b(String str3, String str22, String m143592V2) {
                            r2 = str3;
                            r3 = str22;
                            r4 = m143592V2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C28674c.m143599k0(C28674c.this, r2, r3, r4);
                        }
                    });
                    return;
                }
            }
            C24561c.m127942b("QRWallet", "sendQRWallet senderId is invalid");
            return;
        }
        C24561c.m127942b("QRWallet", "sendQRWallet data is empty");
    }

    /* renamed from: k0 */
    public static final void m143599k0(C28674c c28674c, String str, String str2, String str3) {
        AbstractC19074t.m100208f(c28674c, "this$0");
        AbstractC19074t.m100208f(str3, "$ownerId");
        List m143595f0 = c28674c.m143595f0(str);
        if (m143595f0.isEmpty()) {
            C24561c.m127942b("QRWallet", "listQRWalletNeedSend is empty");
            c28674c.f133093t.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG));
            c28674c.m143594b0();
        } else {
            AbstractC19074t.m100205c(str2);
            c28674c.m143591T(m143595f0, str2, str3, "chat_send");
        }
    }

    /* renamed from: U */
    public final LiveData m143600U() {
        return this.f133094u;
    }

    /* renamed from: W */
    public final LiveData m143601W() {
        return this.f133096w;
    }

    /* renamed from: X */
    public final LiveData m143602X() {
        return this.f133093t;
    }

    /* renamed from: Y */
    public final LiveData m143603Y() {
        return this.f133095v;
    }

    /* renamed from: Z */
    public final LiveData m143604Z() {
        return this.f133099z;
    }

    /* renamed from: c0 */
    public void m143605c0(C28672a c28672a) {
        JSONObject jSONObject;
        super.m103748N(c28672a);
        if (c28672a == null) {
            this.f133095v.mo9221n(C24848g0.f119245a);
            return;
        }
        if (c28672a.m143584b().length() == 0) {
            this.f133095v.mo9221n(C24848g0.f119245a);
            return;
        }
        if (c28672a.m143583a().length() == 0) {
            this.f133095v.mo9221n(C24848g0.f119245a);
            return;
        }
        C24848g0 c24848g0 = null;
        try {
            jSONObject = new JSONObject(c28672a.m143583a());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
            this.f133095v.mo9221n(C24848g0.f119245a);
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                InterfaceC22508f m92064b = new C17244x0(45, jSONObject).m92064b();
                if (m92064b != null) {
                    C24561c.m127942b("QRWallet", "Success build zinstant data");
                    this.f133098y.mo9221n(m92064b);
                    c24848g0 = C24848g0.f119245a;
                }
                if (c24848g0 == null) {
                    C24561c.m127942b("QRWallet", "Error build zinstant data");
                    this.f133095v.mo9221n(C24848g0.f119245a);
                }
            } catch (Exception unused) {
                C24561c.m127942b("QRWallet", "Error build zinstant data");
                this.f133095v.mo9221n(C24848g0.f119245a);
            }
        }
    }

    /* renamed from: e0 */
    public final void m143606e0() {
        this.f133097x.mo9224q(Boolean.TRUE);
    }

    /* renamed from: g0 */
    public final boolean m143607g0(String str, String str2) {
        if (str == null) {
            return true;
        }
        if (AbstractC19074t.m100204b(str, "action.qrwallet.close")) {
            this.f133094u.mo9221n(Boolean.FALSE);
        } else if (AbstractC19074t.m100204b(str, "action.qrwallet.send")) {
            m143598j0(str2);
        } else {
            return false;
        }
        return true;
    }
}
