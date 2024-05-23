package cl0;

import bl0.AbstractC2841g;
import bl0.C2837c;
import bl0.C2839e;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.coroutines.Continuation;
import p620wt.AbstractC29238m;
import p648xk.C29688d;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: cl0.q */
/* loaded from: classes7.dex */
public final class C3587q extends AbstractC2841g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3587q(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // bl0.AbstractC2841g
    /* renamed from: j */
    public Object mo13721j(Continuation continuation) {
        if (((C2837c) m142531b()).m13698c()) {
            return m18194o();
        }
        return new C2839e(null, new C28284f(400, "layout cache - not found"), 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:            if (r6 == null) goto L17;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7, types: [xk.d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ZOMDocument m18191l(File file) {
        Throwable th2;
        C29688d c29688d;
        AbstractC19074t.m100208f(file, "layoutFile");
        ZOMDocument zOMDocument = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AbstractC29238m.m145998b(new FileInputStream(file), byteArrayOutputStream);
                c29688d = new C29688d(byteArrayOutputStream.toByteArray());
            } catch (Exception e11) {
                e = e11;
                c29688d = null;
            } catch (Throwable th3) {
                th2 = th3;
                file = 0;
                if (file != 0) {
                }
                throw th2;
            }
            try {
                zOMDocument = ZOMDocument.createFromSerialized(c29688d);
                file = c29688d;
            } catch (Exception e12) {
                e = e12;
                m142533d("layout cache - " + e.getMessage());
                file = c29688d;
            }
            file.m147669i();
            return zOMDocument;
        } catch (Throwable th4) {
            th2 = th4;
            if (file != 0) {
                file.m147669i();
            }
            throw th2;
        }
    }

    /* renamed from: m */
    public final C2839e m18192m() {
        return new C2839e(null, new C28284f(400, "layout cache - deserialization failure"), 1, 0 == true ? 1 : 0);
    }

    /* renamed from: n */
    public final C2839e m18193n(ZOMDocument zOMDocument) {
        AbstractC19074t.m100208f(zOMDocument, "zomDocument");
        ZOMDocument zOMDocument2 = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        if (zOMDocument.mHasScript) {
            return new C2839e(zOMDocument2, new C28284f(400, "layout cache - script?"), 1, b13 == true ? 1 : 0);
        }
        return new C2839e(zOMDocument, b12 == true ? 1 : 0, 2, b11 == true ? 1 : 0);
    }

    /* renamed from: o */
    public final C2839e m18194o() {
        ZOMDocument m18191l = m18191l(((C2837c) m142531b()).m13709n());
        if (m18191l != null) {
            return m18193n(m18191l);
        }
        return m18192m();
    }
}
