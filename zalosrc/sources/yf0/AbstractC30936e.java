package yf0;

import ag0.AbstractC0837p0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import yf0.AbstractC30936e;

/* renamed from: yf0.e */
/* loaded from: classes5.dex */
public abstract class AbstractC30936e {
    public static final a Companion = new a(null);

    /* renamed from: yf0.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:            if (r0 == null) goto L22;     */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m150458c(String str, b bVar) {
            InputStream inputStream;
            AbstractC19074t.m100208f(str, "$fileUrl");
            AbstractC19074t.m100208f(bVar, "$listener");
            URL url = new URL(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = null;
            r1 = null;
            byte[] bArr = null;
            try {
                inputStream = FirebasePerfUrlConnection.openStream(url);
            } catch (Exception e11) {
                e = e11;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
            try {
                try {
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        AbstractC19074t.m100205c(inputStream);
                        int read = inputStream.read(bArr2);
                        if (read <= 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                AbstractC20110a.f98889a.mo104552e(e);
            }
            inputStream.close();
            bVar.mo150327d(bArr);
        }

        /* renamed from: b */
        public final void m150459b(final String str, final b bVar) {
            AbstractC19074t.m100208f(str, "fileUrl");
            AbstractC19074t.m100208f(bVar, "listener");
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yf0.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC30936e.a.m150458c(str, bVar);
                }
            });
        }
    }

    /* renamed from: yf0.e$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: d */
        void mo150327d(byte[] bArr);
    }
}
