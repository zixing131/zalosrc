package p192h;

import java.net.SocketTimeoutException;
import javax.net.ssl.SSLException;
import p001a.p002a.p003f.p004a.C0002f;

/* renamed from: h.d */
/* loaded from: classes2.dex */
public class C19689d {

    /* renamed from: a */
    protected static final int[] f97686a = {1, 2, 4, 7, 12, 20, 30, 60, 120};

    /* renamed from: b */
    static final C19689d f97687b = new C19689d();

    /* renamed from: a */
    public void m103300a(int i11) {
        int[] iArr = f97686a;
        try {
            Thread.sleep(iArr[Math.min(i11, iArr.length - 1)] * 1000);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw new C0002f(e11);
        }
    }

    /* renamed from: b */
    public boolean m103301b(C0002f c0002f) {
        Throwable cause = c0002f.getCause();
        if (cause == null) {
            return false;
        }
        return ((cause instanceof SSLException) && ((SSLException) cause).toString().toLowerCase().contains("connection reset by peer")) || (cause instanceof SocketTimeoutException);
    }

    /* renamed from: c */
    public boolean m103302c(C19688c c19688c) {
        int m103298d = c19688c.m103298d();
        return m103298d == 503 || m103298d == 504 || m103298d >= 520;
    }
}
