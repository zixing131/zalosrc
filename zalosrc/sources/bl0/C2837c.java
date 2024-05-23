package bl0;

import com.zing.zalo.zinstant.utils.C17205q;
import com.zing.zalo.zinstant.utils.C17207s;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fl0.AbstractC18997h;
import fl0.C18990a;
import fl0.C18991b;
import fl0.C18992c;
import fl0.C18995f;
import fl0.C18996g;
import fn0.AbstractC19074t;
import ik0.AbstractC20596s;
import ik0.AbstractC20601x;
import ik0.InterfaceC20578a0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import on0.C24321d;
import p620wt.AbstractC29238m;

/* renamed from: bl0.c */
/* loaded from: classes7.dex */
public class C2837c extends AbstractC18997h {

    /* renamed from: b */
    private final C18995f f11330b;

    /* renamed from: c */
    private final C18990a f11331c;

    /* renamed from: d */
    private final C18992c f11332d;

    /* renamed from: e */
    private final C18996g f11333e;

    /* renamed from: f */
    private final AbstractC20596s f11334f;

    /* renamed from: g */
    private File f11335g;

    /* renamed from: h */
    private File f11336h;

    /* renamed from: i */
    private File f11337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2837c(C18995f c18995f, C18990a c18990a, C18992c c18992c, C18996g c18996g, AbstractC20596s abstractC20596s, AbstractC20601x abstractC20601x) {
        super(abstractC20601x);
        AbstractC19074t.m100208f(c18995f, "requestInfo");
        AbstractC19074t.m100208f(c18990a, "config");
        AbstractC19074t.m100208f(c18992c, "environment");
        AbstractC19074t.m100208f(c18996g, "utility");
        AbstractC19074t.m100208f(abstractC20596s, "layoutRequest");
        AbstractC19074t.m100208f(abstractC20601x, "zinstantRequest");
        this.f11330b = c18995f;
        this.f11331c = c18990a;
        this.f11332d = c18992c;
        this.f11333e = c18996g;
        this.f11334f = abstractC20596s;
    }

    /* renamed from: q */
    private final ZOMDocument m13696q() {
        return this.f11333e.m99743e().m107189c(m99746a(), this.f11334f, 0);
    }

    /* renamed from: b */
    public final ZOMDocument m13697b() {
        ZOMDocument m13696q = m13696q();
        if (m13696q != null) {
            return m13696q;
        }
        return m13716v();
    }

    /* renamed from: c */
    public final boolean m13698c() {
        String m13707l = m13707l();
        if (m13707l == null) {
            return false;
        }
        File m13709n = m13709n();
        if (!m13709n.exists()) {
            return false;
        }
        return C17207s.m91848c(m13707l, m13709n);
    }

    /* renamed from: d */
    public final InterfaceC20578a0 m13699d() {
        InterfaceC20578a0 mo107087e = m99746a().mo107087e();
        if (mo107087e == null || !AbstractC19074t.m100204b(mo107087e.checksum(), this.f11330b.m99736f()) || !AbstractC19074t.m100204b(mo107087e.identifyKey(), this.f11330b.m99735e())) {
            return null;
        }
        return mo107087e;
    }

    /* renamed from: e */
    public final C18990a m13700e() {
        return this.f11331c;
    }

    /* renamed from: f */
    public final C18992c m13701f() {
        return this.f11332d;
    }

    /* renamed from: g */
    public final AbstractC20596s m13702g() {
        return this.f11334f;
    }

    /* renamed from: h */
    public final C18995f m13703h() {
        return this.f11330b;
    }

    /* renamed from: i */
    public final C18996g m13704i() {
        return this.f11333e;
    }

    /* renamed from: j */
    public final boolean m13705j(File file) {
        AbstractC19074t.m100208f(file, "layoutChecksumFile");
        if (file.exists() && file.length() <= 32) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final String m13706k(AbstractC20596s abstractC20596s) {
        AbstractC19074t.m100208f(abstractC20596s, "layoutRequest");
        return this.f11333e.m99740b().m99729b(abstractC20596s);
    }

    /* renamed from: l */
    public final String m13707l() {
        File m13708m = m13708m();
        if (m13705j(m13708m)) {
            return C17205q.m91841d(m13708m);
        }
        return null;
    }

    /* renamed from: m */
    public final File m13708m() {
        if (this.f11337i == null) {
            this.f11337i = C18991b.m99714b(this.f11333e.m99739a(), m13710o(this.f11330b.m99736f()), this.f11330b.m99734d(), null, 4, null);
        }
        File file = this.f11337i;
        AbstractC19074t.m100206d(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    /* renamed from: n */
    public final File m13709n() {
        if (this.f11336h == null) {
            this.f11336h = C18991b.m99714b(this.f11333e.m99739a(), m13711p(this.f11330b.m99736f()), this.f11330b.m99734d(), null, 4, null);
        }
        File file = this.f11336h;
        AbstractC19074t.m100206d(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    /* renamed from: o */
    public final String m13710o(String str) {
        AbstractC19074t.m100208f(str, "fileName");
        return str + "_lc";
    }

    /* renamed from: p */
    public final String m13711p(String str) {
        AbstractC19074t.m100208f(str, "fileName");
        return str + "_l";
    }

    /* renamed from: r */
    public final void m13712r(ZOMDocument zOMDocument) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        boolean allowReuse = zOMDocument.allowReuse();
        this.f11333e.m99743e().m107190e(m99746a(), this.f11334f, zOMDocument, allowReuse ? 1 : 0, zOMDocument.isStrongCache());
    }

    /* renamed from: s */
    public final File m13713s() {
        if (this.f11335g == null) {
            this.f11335g = this.f11333e.m99739a().m99715a(this.f11330b.m99736f(), this.f11330b.m99734d(), this.f11330b.m99732b());
        }
        File file = this.f11335g;
        AbstractC19074t.m100206d(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    /* renamed from: t */
    public final void m13714t(ZOMDocument zOMDocument) {
        AbstractC19074t.m100208f(zOMDocument, "zomDocument");
        m13712r(zOMDocument);
        m13715u(zOMDocument);
    }

    /* renamed from: u */
    public final void m13715u(ZOMDocument zOMDocument) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        if (!zOMDocument.mHasScript && zOMDocument.mFontFace == null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zOMDocument.toByteArray());
                File m13709n = m13709n();
                File m13708m = m13708m();
                AbstractC29238m.m145998b(byteArrayInputStream, new FileOutputStream(m13709n));
                byteArrayInputStream.reset();
                String m91847b = C17207s.m91847b(byteArrayInputStream);
                if (m91847b == null) {
                    return;
                }
                byte[] bytes = m91847b.getBytes(C24321d.f117408b);
                AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
                AbstractC29238m.m145998b(new ByteArrayInputStream(bytes), new FileOutputStream(m13708m));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: v */
    public final ZOMDocument m13716v() {
        ZOMDocument m107189c = this.f11333e.m99743e().m107189c(m99746a(), this.f11334f, 1);
        if (m107189c != null && !m107189c.cachingState()) {
            this.f11333e.m99743e().m107191f(m99746a(), this.f11334f, 1);
            return null;
        }
        return m107189c;
    }

    /* renamed from: w */
    public final boolean m13717w() {
        File m13713s = m13713s();
        if (!m13713s.exists()) {
            return false;
        }
        if (this.f11331c.m99713a()) {
            return true;
        }
        return AbstractC19074t.m100204b(this.f11330b.m99736f(), C17207s.m91846a(m13713s));
    }
}
