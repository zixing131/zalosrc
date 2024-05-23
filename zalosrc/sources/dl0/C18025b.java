package dl0;

import bl0.AbstractC2838d;
import bl0.C2837c;
import bl0.C2839e;
import com.zing.zalo.zinstant.utils.C17206r;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.C24861r;
import um0.C27317h;
import vk0.C28284f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import zk0.InterfaceC32222a;

/* renamed from: dl0.b */
/* loaded from: classes7.dex */
public final class C18025b extends AbstractC2838d {

    /* renamed from: c */
    private final ZOMDocument f91284c;

    /* renamed from: dl0.b$a */
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Continuation f91286q;

        a(Continuation continuation) {
            this.f91286q = continuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ZOMDocument layoutWithCache = C18025b.m95845h(C18025b.this).m13704i().m99744f().layoutWithCache(C18025b.this.m95846i(), C18025b.m95845h(C18025b.this).m13701f().m99721f(), C18025b.m95845h(C18025b.this).m13701f().m99722g(), C18025b.m95845h(C18025b.this).m13701f().m99727l(), C18025b.m95845h(C18025b.this).m13701f().m99720e(), C18025b.m95845h(C18025b.this).m13701f().m99723h(), C18025b.m95845h(C18025b.this).m13701f().m99724i(), C18025b.m95845h(C18025b.this).m13701f().m99726k(), C18025b.m95845h(C18025b.this).m13701f().m99718c(), !C18025b.this.m95846i().checkIntegrityFontFace(), C18025b.m95845h(C18025b.this).m13703h().m99736f(), C18025b.m95845h(C18025b.this).m13703h().m99731a(), C18025b.m95845h(C18025b.this).m13701f().m99717b(), C18025b.m95845h(C18025b.this).m13701f().m99725j(), C18025b.m95845h(C18025b.this).m13701f().m99719d());
            if (!AbstractC19074t.m100204b(layoutWithCache, C18025b.this.m95846i())) {
                C18025b.this.m142533d("native layout - create new document from layout with cache");
            }
            Continuation continuation = this.f91286q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new C2839e(layoutWithCache, null, 2, null)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18025b(ZOMDocument zOMDocument, C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(zOMDocument, "document");
        AbstractC19074t.m100208f(c2837c, "zomDocumentInfo");
        this.f91284c = zOMDocument;
    }

    /* renamed from: h */
    public static final /* synthetic */ C2837c m95845h(C18025b c18025b) {
        return (C2837c) c18025b.m142531b();
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        if (!this.f91284c.allowReuse()) {
            return new C2839e(null, new C28284f(400, "native layout - not allow reuse"), 1, null);
        }
        if (C17206r.m91844b(((C2837c) m142531b()).m13701f().m99717b(), this.f91284c.mDensity, 0.0d, 4, null) && C17206r.m91844b(((C2837c) m142531b()).m13701f().m99725j(), this.f91284c.mScaledDensity, 0.0d, 4, null)) {
            m142533d("native layout - with cache");
            m142576c = AbstractC28297c.m142576c(continuation);
            C27317h c27317h = new C27317h(m142576c);
            this.f91284c.queueNativeTask(new a(c27317h));
            Object m139856a = c27317h.m139856a();
            m142578e = AbstractC28298d.m142578e();
            if (m139856a == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m139856a;
        }
        return new C2839e(null, new C28284f(400, "native layout - density has been changed"), 1, null);
    }

    /* renamed from: i */
    public final ZOMDocument m95846i() {
        return this.f91284c;
    }
}
