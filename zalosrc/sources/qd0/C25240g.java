package qd0;

import com.androidquery.util.BitmapEncoder;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.Random;
import me0.AbstractC23041d2;
import nh0.C23793c;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import on0.AbstractC24334o;
import p248iy.AbstractC20887g;
import p386ob.EnumC24191b;
import p645xh.C29628e;
import pm0.C24848g0;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25739e;
import td0.C26639b;

/* renamed from: qd0.g */
/* loaded from: classes4.dex */
public final class C25240g {

    /* renamed from: a */
    private final String f121031a;

    /* renamed from: b */
    private final EnumC25242i f121032b;

    /* renamed from: c */
    private final String f121033c;

    /* renamed from: d */
    private final boolean f121034d;

    /* renamed from: e */
    private final int f121035e;

    /* renamed from: f */
    private C24230h f121036f;

    /* renamed from: g */
    private final File f121037g;

    /* renamed from: h */
    private final File f121038h;

    /* renamed from: i */
    private final long f121039i;

    /* renamed from: j */
    private a f121040j;

    /* renamed from: k */
    private C25739e f121041k;

    /* renamed from: l */
    private EnumC25241h f121042l;

    /* renamed from: m */
    private long f121043m;

    /* renamed from: n */
    private long f121044n;

    /* renamed from: o */
    private long f121045o;

    /* renamed from: p */
    private long f121046p;

    /* renamed from: q */
    private long f121047q;

    /* renamed from: r */
    private long f121048r;

    /* renamed from: s */
    private long f121049s;

    /* renamed from: t */
    private long f121050t;

    /* renamed from: u */
    private long f121051u;

    /* renamed from: v */
    private long f121052v;

    /* renamed from: w */
    private long f121053w;

    /* renamed from: x */
    private EnumC24191b f121054x;

    /* renamed from: y */
    private boolean f121055y;

    /* renamed from: z */
    private int f121056z;

    /* renamed from: qd0.g$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo95407a(long j11);
    }

    /* renamed from: qd0.g$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC24232j {

        /* renamed from: b */
        final /* synthetic */ Object f121058b;

        b(Object obj) {
            this.f121058b = obj;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            AbstractC19074t.m100208f(bVar, "uploadSuccess");
            try {
                try {
                    AbstractC20110a.f98889a.mo104548a("[InstantUploadItem] onDataProcessed: " + bVar.m132889b(), new Object[0]);
                    String str = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str, "currentUserUid");
                    AbstractC20887g.m109231i(str, 19203, "", System.currentTimeMillis() - C25240g.this.m130608y(), 19200, CoreUtility.f89236l);
                    C25240g.this.m130582M(C23793c.Companion.m124321a().mo124319c() - C25240g.this.m130607x());
                    C24230h c24230h = C25240g.this.f121036f;
                    if (c24230h != null) {
                        C25240g c25240g = C25240g.this;
                        c25240g.m130581L(c24230h.m126481B());
                        c25240g.m130580K(c24230h.m126483C());
                        c25240g.m130575F(c24230h.m126528v());
                        c25240g.m130576G(c24230h.m126530w());
                        c25240g.m130583N(c24230h.m126485D());
                        c25240g.m130584O(c24230h.m126487E());
                        c25240g.m130577H(c24230h.m126525t());
                        c25240g.m130579J(c24230h.m126479A());
                        c25240g.m130574E(c24230h.m126519q());
                        c25240g.m130573D(c24230h.m126493L());
                        c25240g.m130585P(c24230h.m126492I());
                    }
                    C25239f c25239f = C25239f.f121027a;
                    if (!c25239f.m130556f(C25240g.this)) {
                        Object obj = this.f121058b;
                        C25240g c25240g2 = C25240g.this;
                        synchronized (obj) {
                            c25240g2.f121042l = EnumC25241h.f121063t;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                        C25240g.this.m130589f();
                        c25239f.m130557g();
                        return;
                    }
                    Object obj2 = this.f121058b;
                    C25240g c25240g3 = C25240g.this;
                    synchronized (obj2) {
                        c25240g3.f121042l = EnumC25241h.f121061r;
                        AbstractC25751q m132889b = bVar.m132889b();
                        AbstractC19074t.m100206d(m132889b, "null cannot be cast to non-null type com.zing.zalo.upload.models.UploadChatPhotoResponse");
                        c25240g3.f121041k = (C25739e) m132889b;
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                    c25239f.m130557g();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    C25239f c25239f2 = C25239f.f121027a;
                    c25239f2.m130562p(C25240g.this);
                    Object obj3 = this.f121058b;
                    C25240g c25240g4 = C25240g.this;
                    synchronized (obj3) {
                        c25240g4.f121042l = EnumC25241h.f121062s;
                        C24848g0 c24848g03 = C24848g0.f119245a;
                        C25240g.this.m130589f();
                        c25239f2.m130557g();
                    }
                }
            } catch (Throwable th2) {
                C25239f.f121027a.m130557g();
                throw th2;
            }
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            AbstractC19074t.m100208f(aVar, "uploadFailure");
            try {
                AbstractC20110a.f98889a.mo104548a("[InstantUploadItem] onErrorData: " + aVar.m132886a(), new Object[0]);
                C25239f c25239f = C25239f.f121027a;
                c25239f.m130562p(C25240g.this);
                Object obj = this.f121058b;
                C25240g c25240g = C25240g.this;
                synchronized (obj) {
                    c25240g.f121042l = EnumC25241h.f121062s;
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109231i(str, 19204, "", System.currentTimeMillis() - C25240g.this.m130608y(), 19200, CoreUtility.f89236l);
                c25239f.m130557g();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
            C25240g.this.f121043m = j11;
            a m130598o = C25240g.this.m130598o();
            if (m130598o != null) {
                m130598o.mo95407a(j11);
            }
        }
    }

    public C25240g(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        String m118216o;
        AbstractC19074t.m100208f(str, "originPath");
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "receiverUid");
        this.f121031a = str;
        this.f121032b = enumC25242i;
        this.f121033c = str2;
        this.f121034d = z11;
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        this.f121035e = nextInt;
        this.f121037g = new File(str);
        this.f121039i = System.currentTimeMillis();
        this.f121042l = EnumC25241h.f121059p;
        this.f121054x = EnumC24191b.f116757q;
        String m130613b = C25243j.m130613b(nextInt, str, enumC25242i, str2);
        if (C26639b.m136764w(C25243j.m130614c(enumC25242i)) && (!z11 || BitmapEncoder.f15688e.m18741d())) {
            m118216o = "jxl";
        } else {
            m118216o = AbstractC23041d2.m118216o(str);
            AbstractC19074t.m100207e(m118216o, "getExtension(...)");
            if (m118216o.length() > 0 && !AbstractC19074t.m100204b("jpg", m118216o)) {
                m118216o = "jpg";
            }
        }
        this.f121038h = new File(AbstractC20130d.m104861V(), m130613b + "." + m118216o);
    }

    /* renamed from: A */
    private final InterfaceC24232j m130566A(Object obj) {
        return new b(obj);
    }

    /* renamed from: B */
    public final int m130571B() {
        return this.f121056z;
    }

    /* renamed from: C */
    public final boolean m130572C() {
        return this.f121055y;
    }

    /* renamed from: D */
    public final void m130573D(boolean z11) {
        this.f121055y = z11;
    }

    /* renamed from: E */
    public final void m130574E(long j11) {
        this.f121053w = j11;
    }

    /* renamed from: F */
    public final void m130575F(long j11) {
        this.f121050t = j11;
    }

    /* renamed from: G */
    public final void m130576G(long j11) {
        this.f121051u = j11;
    }

    /* renamed from: H */
    public final void m130577H(long j11) {
        this.f121052v = j11;
    }

    /* renamed from: I */
    public final void m130578I(a aVar) {
        this.f121040j = aVar;
    }

    /* renamed from: J */
    public final void m130579J(EnumC24191b enumC24191b) {
        AbstractC19074t.m100208f(enumC24191b, "<set-?>");
        this.f121054x = enumC24191b;
    }

    /* renamed from: K */
    public final void m130580K(long j11) {
        this.f121049s = j11;
    }

    /* renamed from: L */
    public final void m130581L(long j11) {
        this.f121048r = j11;
    }

    /* renamed from: M */
    public final void m130582M(long j11) {
        this.f121044n = j11;
    }

    /* renamed from: N */
    public final void m130583N(long j11) {
        this.f121046p = j11;
    }

    /* renamed from: O */
    public final void m130584O(long j11) {
        this.f121047q = j11;
    }

    /* renamed from: P */
    public final void m130585P(int i11) {
        this.f121056z = i11;
    }

    /* renamed from: Q */
    public final void m130586Q(Object obj) {
        AbstractC19074t.m100208f(obj, "locker");
        try {
            AbstractC20110a.f98889a.mo104548a("startUpload: " + this.f121037g.getAbsolutePath(), new Object[0]);
            this.f121045o = C23793c.Companion.m124321a().mo124319c();
            synchronized (obj) {
                EnumC25241h enumC25241h = this.f121042l;
                EnumC25241h enumC25241h2 = EnumC25241h.f121060q;
                if (enumC25241h == enumC25241h2) {
                    C25239f.f121027a.m130557g();
                    return;
                }
                EnumC24229g m130614c = C25243j.m130614c(this.f121032b);
                C24226d.b bVar = C24226d.Companion;
                int i11 = this.f121035e;
                String str = this.f121031a;
                String path = this.f121038h.getPath();
                AbstractC19074t.m100207e(path, "getPath(...)");
                C24230h m126433h = C24226d.b.m126433h(bVar, i11, m130614c, str, path, null, null, 0L, this.f121034d, 48, null);
                m126433h.m126482B0(this.f121033c);
                m126433h.m126505h(m130566A(obj));
                bVar.m126442j(m126433h);
                this.f121036f = m126433h;
                this.f121042l = enumC25241h2;
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109231i(str2, 19202, "type:" + this.f121032b, 0L, 19200, CoreUtility.f89236l);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            synchronized (obj) {
                this.f121042l = EnumC25241h.f121062s;
                C25239f.f121027a.m130557g();
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
        } catch (OutOfMemoryError e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
            synchronized (obj) {
                this.f121042l = EnumC25241h.f121062s;
                C25239f.f121027a.m130557g();
                C24848g0 c24848g03 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: R */
    public final void m130587R(long j11) {
        if (this.f121042l == EnumC25241h.f121060q) {
            C29628e.m147249E0().m93401c0(this.f121035e, j11);
        }
    }

    /* renamed from: e */
    public final void m130588e() {
        try {
            this.f121042l = EnumC25241h.f121063t;
            C24230h c24230h = this.f121036f;
            if (c24230h != null) {
                c24230h.m126509j();
                C24226d.Companion.m126434a(c24230h);
            }
            m130589f();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m130589f() {
        try {
            if (this.f121038h.exists()) {
                this.f121038h.delete();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final boolean m130590g(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (this.f121032b == enumC25242i && AbstractC19074t.m100204b(this.f121031a, str) && AbstractC19074t.m100204b(this.f121033c, str2) && this.f121034d == z11) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m130591h(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        EnumC25242i enumC25242i2 = this.f121032b;
        if ((enumC25242i2 != enumC25242i && (enumC25242i2 != EnumC25242i.f121067q || enumC25242i != EnumC25242i.f121066p)) || !AbstractC19074t.m100204b(this.f121031a, str) || !AbstractC19074t.m100204b(this.f121033c, str2) || this.f121034d != z11) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final long m130592i() {
        return this.f121043m;
    }

    /* renamed from: j */
    public final long m130593j() {
        return this.f121053w;
    }

    /* renamed from: k */
    public final long m130594k() {
        return this.f121050t;
    }

    /* renamed from: l */
    public final long m130595l() {
        return this.f121051u;
    }

    /* renamed from: m */
    public final long m130596m() {
        return this.f121052v;
    }

    /* renamed from: n */
    public final File m130597n() {
        return this.f121038h;
    }

    /* renamed from: o */
    public final a m130598o() {
        return this.f121040j;
    }

    /* renamed from: p */
    public final String m130599p() {
        return this.f121033c;
    }

    /* renamed from: q */
    public final EnumC24191b m130600q() {
        return this.f121054x;
    }

    /* renamed from: r */
    public final EnumC25241h m130601r() {
        return this.f121042l;
    }

    /* renamed from: s */
    public final long m130602s() {
        return this.f121049s;
    }

    /* renamed from: t */
    public final long m130603t() {
        return this.f121048r;
    }

    public String toString() {
        String str;
        String m127098f;
        int i11 = this.f121035e;
        EnumC25242i enumC25242i = this.f121032b;
        File file = this.f121037g;
        if (this.f121038h.exists()) {
            str = this.f121038h.toString();
        } else {
            str = "don't use";
        }
        m127098f = AbstractC24334o.m127098f("\n            uploadID:" + i11 + "\n            type:" + enumC25242i + "\n            source:" + file + "\n            cache:" + str + "\n            state:" + this.f121042l + "\n            receiverUid:" + this.f121033c + "\n            response:" + this.f121041k + "\n            \n            ");
        return m127098f;
    }

    /* renamed from: u */
    public final long m130604u() {
        return this.f121044n;
    }

    /* renamed from: v */
    public final long m130605v() {
        return this.f121046p;
    }

    /* renamed from: w */
    public final long m130606w() {
        return this.f121047q;
    }

    /* renamed from: x */
    public final long m130607x() {
        return this.f121045o;
    }

    /* renamed from: y */
    public final long m130608y() {
        return this.f121039i;
    }

    /* renamed from: z */
    public final C25739e m130609z() {
        return this.f121041k;
    }
}
