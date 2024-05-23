package p396ol;

import ch0.C3487b;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import in.C20627a;
import in.InterfaceC20633g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import ln0.AbstractC22543l;
import p239ih.C20556f;
import p487rl.C25821b;
import p613wl.AbstractC29087c;
import p620wt.AbstractC29238m;
import qg0.AbstractC25270e;
import sg0.C26245a;
import sg0.C26247c;
import tg0.C26676b;

/* renamed from: ol.c */
/* loaded from: classes3.dex */
public abstract class AbstractC24300c implements InterfaceC20633g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f117337a;

    /* renamed from: b */
    private final C25821b f117338b;

    /* renamed from: ol.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public AbstractC24300c(String str, C25821b c25821b) {
        AbstractC19074t.m100208f(str, "downloadUrl");
        AbstractC19074t.m100208f(c25821b, "cloudMediaItem");
        this.f117337a = str;
        this.f117338b = c25821b;
    }

    /* renamed from: d */
    private final String m126882d(String str, String str2) {
        OutputStream m106840m;
        AbstractC25270e m90325b = AbstractC16893a.m90325b(this.f117338b);
        if (m90325b == null) {
            C26676b.m136955e("SMLZCloudDownloadFileListener", "decryptFile(): encryptionKey is null", C26676b.b.f126335t);
            return null;
        }
        C20556f c20556f = new C20556f(str2);
        File m17465f = C3487b.m17465f(C3487b.f14598a, c20556f.m106835h(), null, 2, null);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C26676b.m136957g("SMLZCloudDownloadFileListener", "Decrypting file on algoVer: " + m90325b.m130786a(), null, 4, null);
            String m106842o = c20556f.m106842o();
            if (m106842o != null) {
                String absolutePath = m17465f.getAbsolutePath();
                C26247c c26247c = C26247c.f124659a;
                AbstractC19074t.m100205c(absolutePath);
                c26247c.m134968b(m90325b, m106842o, absolutePath);
                if (m90325b.m130786a() == 2) {
                    String m133164a = this.f117338b.m133145h().m133164a();
                    if (m133164a.length() > 0 && !AbstractC19074t.m100204b(C26245a.m134940o(C26245a.f124654a, new FileInputStream(m17465f), 0, 2, null), m133164a)) {
                        throw new RuntimeException("Decrypted file checksum not match");
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                C26676b.m136957g("SMLZCloudDownloadFileListener", "Successfully decrypted file: id=" + str + ", length=" + m17465f.length() + " bytes in " + (currentTimeMillis2 - currentTimeMillis) + " ms.", null, 4, null);
                if (c20556f.m106829a() && (m106840m = c20556f.m106840m()) != null) {
                    AbstractC29238m.m145998b(new FileInputStream(m17465f), m106840m);
                    m17465f.delete();
                    return c20556f.m106842o();
                }
                C26676b.m136962l("SMLZCloudDownloadFileListener", "Could not rename to the original, returning path: " + m17465f.getAbsolutePath());
                return m17465f.getAbsolutePath();
            }
            throw new FileNotFoundException("Input file not found");
        } catch (Exception e11) {
            if (m17465f.exists()) {
                m17465f.delete();
            }
            C26676b.m136955e("SMLZCloudDownloadFileListener", "Error occurred while decrypting the file: id=" + str + ", err=" + e11.getMessage() + ", inputPath=" + str2, C26676b.b.f126335t);
            return null;
        }
    }

    /* renamed from: h */
    private final boolean m126883h(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        int m133147j = this.f117338b.m133147j();
        if (m133147j == 2 || m133147j == 3) {
            C20627a.m107407U(this.f117337a, file);
        }
        return file.exists();
    }

    @Override // in.InterfaceC20633g
    /* renamed from: a */
    public void mo62757a(String str, long j11) {
        long m104531g;
        long m116585h;
        AbstractC19074t.m100208f(str, "id");
        m104531g = AbstractC20104d.m104531g(((float) j11) * 0.8f);
        m116585h = AbstractC22543l.m116585h(m104531g, 100L);
        mo126881g(str, m116585h);
    }

    @Override // in.InterfaceC20633g
    /* renamed from: b */
    public void mo62758b(String str, int i11) {
        AbstractC19074t.m100208f(str, "id");
        mo126879e(str, i11);
    }

    @Override // in.InterfaceC20633g
    /* renamed from: c */
    public void mo62759c(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "path");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataProcessed():  id=");
        sb2.append(str);
        sb2.append(", path=");
        sb2.append(str2);
        sb2.append(", isFromCache=");
        sb2.append(z11);
        String m126882d = m126882d(str, str2);
        if (m126882d != null || !AbstractC29087c.m145335c(this.f117338b.m133146i())) {
            str2 = m126882d;
        }
        if (str2 != null && str2.length() != 0) {
            if (m126883h(str2)) {
                mo126880f(str, str2);
                mo126881g(str, 100L);
                return;
            } else {
                mo126879e(str, 6);
                return;
            }
        }
        mo126879e(str, 1001);
    }

    /* renamed from: e */
    public abstract void mo126879e(String str, int i11);

    /* renamed from: f */
    public abstract void mo126880f(String str, String str2);

    /* renamed from: g */
    public abstract void mo126881g(String str, long j11);
}
