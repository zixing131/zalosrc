package p239ih;

import android.os.ParcelFileDescriptor;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.InputStream;
import java.io.OutputStream;
import me0.AbstractC23041d2;
import me0.AbstractC23254w8;
import me0.C23257x1;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ih.f */
/* loaded from: classes.dex */
public final class C20556f {

    /* renamed from: a */
    private final InterfaceC24854k f100928a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ih.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f100929q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f100929q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC20552b mo12V4() {
            if (AbstractC23254w8.m119859g(this.f100929q)) {
                return new C20555e(this.f100929q);
            }
            return new C20553c(this.f100929q);
        }
    }

    public C20556f(String str) {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new a(str));
        this.f100928a = m129210a;
    }

    /* renamed from: g */
    private final InterfaceC20552b m106828g() {
        return (InterfaceC20552b) this.f100928a.getValue();
    }

    /* renamed from: a */
    public final boolean m106829a() {
        return m106828g().mo106811b();
    }

    /* renamed from: b */
    public final boolean m106830b() {
        return m106828g().mo106816g();
    }

    /* renamed from: c */
    public final String m106831c() {
        return m106828g().mo106823n();
    }

    /* renamed from: d */
    public final long m106832d() {
        return m106828g().mo106825p();
    }

    /* renamed from: e */
    public final C23257x1 m106833e() {
        return m106828g().mo106820k();
    }

    /* renamed from: f */
    public final String m106834f() {
        String m118216o = AbstractC23041d2.m118216o(m106828g().mo106822m());
        AbstractC19074t.m100207e(m118216o, "getExtension(fileInterface.getPath())");
        return m118216o;
    }

    /* renamed from: h */
    public final String m106835h() {
        return m106828g().mo106813d();
    }

    /* renamed from: i */
    public final String m106836i() {
        return m106828g().mo106817h();
    }

    /* renamed from: j */
    public final String m106837j() {
        return m106828g().mo106815f();
    }

    /* renamed from: k */
    public final InputStream m106838k() {
        return m106828g().mo106821l();
    }

    /* renamed from: l */
    public final float[] m106839l() {
        return m106828g().mo106819j();
    }

    /* renamed from: m */
    public final OutputStream m106840m() {
        return m106828g().mo106812c();
    }

    /* renamed from: n */
    public final ParcelFileDescriptor m106841n() {
        return m106828g().mo106810a();
    }

    /* renamed from: o */
    public final String m106842o() {
        return m106828g().mo106822m();
    }

    /* renamed from: p */
    public final String m106843p() {
        return m106828g().mo106814e();
    }

    /* renamed from: q */
    public final boolean m106844q() {
        return m106828g().mo106818i();
    }

    /* renamed from: r */
    public final long m106845r() {
        return m106828g().mo106824o();
    }
}
