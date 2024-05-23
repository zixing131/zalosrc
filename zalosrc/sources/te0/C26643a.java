package te0;

import android.graphics.Bitmap;
import bn0.AbstractC2933b;
import com.androidquery.util.BitmapEncoder;
import com.zing.zalo.zmedia.zjxl.ZJXLEncoder;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.io.OutputStream;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import p239ih.C20556f;
import pm0.C24848g0;
import th.AbstractC26689j;

/* renamed from: te0.a */
/* loaded from: classes4.dex */
public final class C26643a {

    /* renamed from: a */
    public static final C26643a f126106a = new C26643a();

    private C26643a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3 A[Catch: all -> 0x005c, TryCatch #5 {all -> 0x005c, blocks: (B:4:0x0007, B:6:0x0016, B:9:0x0030, B:10:0x0085, B:11:0x005f, B:15:0x008e, B:17:0x0094, B:20:0x00aa, B:23:0x00b6, B:25:0x00d0, B:28:0x00d7, B:30:0x00e2, B:31:0x00ea, B:50:0x0104, B:34:0x010f, B:38:0x0143, B:40:0x0154, B:42:0x015c, B:59:0x010b, B:60:0x010e, B:63:0x0169, B:68:0x01a0, B:70:0x01b0, B:71:0x01b3, B:74:0x01b6, B:76:0x01c0, B:78:0x01c6, B:80:0x01de, B:82:0x01f3, B:84:0x0221, B:88:0x01d5), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #5 {all -> 0x005c, blocks: (B:4:0x0007, B:6:0x0016, B:9:0x0030, B:10:0x0085, B:11:0x005f, B:15:0x008e, B:17:0x0094, B:20:0x00aa, B:23:0x00b6, B:25:0x00d0, B:28:0x00d7, B:30:0x00e2, B:31:0x00ea, B:50:0x0104, B:34:0x010f, B:38:0x0143, B:40:0x0154, B:42:0x015c, B:59:0x010b, B:60:0x010e, B:63:0x0169, B:68:0x01a0, B:70:0x01b0, B:71:0x01b3, B:74:0x01b6, B:76:0x01c0, B:78:0x01c6, B:80:0x01de, B:82:0x01f3, B:84:0x0221, B:88:0x01d5), top: B:3:0x0007 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized int m136770a(String str, String str2, int i11, int i12, Bitmap.CompressFormat compressFormat, boolean z11) {
        boolean z12;
        int i13;
        C20556f c20556f;
        synchronized (C26643a.class) {
            try {
                Bitmap m117968s = AbstractC23009a3.m117968s(str, AbstractC26689j.m137112u(i12), AbstractC26689j.m137112u(i12));
                int i14 = 0;
                if (!z11) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int m117972w = AbstractC23009a3.m117972w(m117968s, compressFormat, i11, str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j11 = currentTimeMillis2 - currentTimeMillis;
                    if (AbstractC26689j.m137089P(i12)) {
                        if (m117972w == 0) {
                            AbstractC20110a.f98889a.m104564x("[JPEG]").mo104548a("outputPath = " + str2 + ", encodeImageFile in : " + j11 + " ms", new Object[0]);
                        } else {
                            AbstractC20110a.f98889a.m104564x("[JPEG]").mo104548a("encodeError = " + m117972w + ", inputPath = " + str, new Object[0]);
                        }
                        BitmapEncoder.f15688e.m18742e(currentTimeMillis, currentTimeMillis2, j11, m117972w, false);
                    }
                    return m117972w;
                }
                if (!AbstractC23254w8.m119859g(str) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(new C20556f(str).m106838k()))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                int i15 = 502;
                if (!z12) {
                    if (m117968s != null) {
                        BitmapEncoder bitmapEncoder = new BitmapEncoder();
                        bitmapEncoder.m18735b(m117968s);
                        double m92548b = ZJXLEncoder.m92548b(bitmapEncoder, str, m117968s.getWidth(), m117968s.getHeight(), false);
                        int m92549c = ZJXLEncoder.m92549c(m92548b);
                        if (m92549c == 0) {
                            int m92550d = ZJXLEncoder.m92550d(m92548b);
                            long j12 = m92550d;
                            long j13 = currentTimeMillis3 + j12;
                            try {
                                C20556f c20556f2 = new C20556f(str2);
                                if (c20556f2.m106830b()) {
                                    c20556f2.m106829a();
                                }
                                OutputStream m106840m = c20556f2.m106840m();
                                if (m106840m != null) {
                                    try {
                                        if (bitmapEncoder.m18734a() != null) {
                                            m106840m.write(bitmapEncoder.m18734a());
                                        }
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        AbstractC2933b.m13890a(m106840m, null);
                                    } finally {
                                    }
                                }
                                try {
                                    BitmapEncoder.f15688e.m18742e(currentTimeMillis3, j13, j12, m92549c, true);
                                    AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("outputPath = " + str2 + ", encodeImageFile in : " + m92550d + " ms", new Object[0]);
                                } catch (IOException e11) {
                                    e = e11;
                                    AbstractC20110a.f98889a.m104564x("[JXL]").mo104552e(e);
                                    if (AbstractC23227u1.m119701a(e) || !AbstractC23238v2.m119726k()) {
                                        i14 = 601;
                                    }
                                    BitmapEncoder.f15688e.m18742e(currentTimeMillis3, 0L, 0L, i14, true);
                                    i15 = i14;
                                    return i15;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                i14 = 502;
                            }
                        } else {
                            AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("encodeError = " + m92549c + ", inputPath = " + str, new Object[0]);
                            BitmapEncoder.f15688e.m18742e(currentTimeMillis3, 0L, 0L, m92549c, true);
                            i14 = 502;
                        }
                        i15 = i14;
                    }
                } else {
                    try {
                        c20556f = new C20556f(str2);
                        C20556f c20556f3 = new C20556f(str);
                        if (c20556f.m106830b()) {
                            c20556f.m106829a();
                        }
                        AbstractC23238v2.m119716a(c20556f3, c20556f);
                        try {
                        } catch (IOException unused) {
                            i15 = 0;
                            if (!AbstractC23238v2.m119726k()) {
                                i13 = 601;
                                long currentTimeMillis4 = System.currentTimeMillis();
                                long j14 = currentTimeMillis4 - currentTimeMillis3;
                                BitmapEncoder.f15688e.m18742e(currentTimeMillis3, currentTimeMillis4, j14, i13, true);
                                if (i13 != 0) {
                                }
                                i15 = i13;
                                return i15;
                            }
                            i13 = i15;
                            long currentTimeMillis42 = System.currentTimeMillis();
                            long j142 = currentTimeMillis42 - currentTimeMillis3;
                            BitmapEncoder.f15688e.m18742e(currentTimeMillis3, currentTimeMillis42, j142, i13, true);
                            if (i13 != 0) {
                            }
                            i15 = i13;
                            return i15;
                        }
                    } catch (IOException unused2) {
                    }
                    if (c20556f.m106845r() == 0 && !AbstractC23238v2.m119726k()) {
                        AbstractC23041d2.m118208g(c20556f.m106842o());
                        i13 = 601;
                        long currentTimeMillis422 = System.currentTimeMillis();
                        long j1422 = currentTimeMillis422 - currentTimeMillis3;
                        BitmapEncoder.f15688e.m18742e(currentTimeMillis3, currentTimeMillis422, j1422, i13, true);
                        if (i13 != 0) {
                        }
                        i15 = i13;
                    } else {
                        i13 = 0;
                        long currentTimeMillis4222 = System.currentTimeMillis();
                        long j14222 = currentTimeMillis4222 - currentTimeMillis3;
                        BitmapEncoder.f15688e.m18742e(currentTimeMillis3, currentTimeMillis4222, j14222, i13, true);
                        if (i13 != 0) {
                            AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("outputPath = " + str2 + ", copyFile in : " + j14222 + " ms", new Object[0]);
                        } else {
                            AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("copyFile, errorCode = " + i13 + ", inputPath = " + str, new Object[0]);
                        }
                        i15 = i13;
                    }
                }
                return i15;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static final synchronized int m136771b(String str, String str2, int i11, int i12, Bitmap.CompressFormat compressFormat) {
        int m117972w;
        synchronized (C26643a.class) {
            m117972w = AbstractC23009a3.m117972w(AbstractC23009a3.m117963n(str, AbstractC26689j.m137112u(i12)), compressFormat, i11, str2);
        }
        return m117972w;
    }
}
