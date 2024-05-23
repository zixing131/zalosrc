package p460qt;

import ag0.AbstractC0837p0;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import me0.AbstractC23227u1;
import me0.AbstractC23237v1;
import me0.AbstractC23238v2;
import me0.AbstractC23277z1;
import me0.C23267y1;
import p306ku.AbstractC21943a;
import u30.AbstractRunnableC27007b;

/* renamed from: qt.d */
/* loaded from: classes4.dex */
public abstract class AbstractC25494d extends AbstractRunnableC27007b {

    /* renamed from: r */
    private final ContentResolver f122122r;

    /* renamed from: s */
    private final Bitmap.CompressFormat f122123s;

    /* renamed from: t */
    private final int f122124t;

    /* renamed from: u */
    private final double f122125u;

    /* renamed from: v */
    private final double f122126v;

    /* renamed from: qt.d$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        Uri f122127a;

        /* renamed from: b */
        String f122128b;

        /* renamed from: c */
        int f122129c;

        public a(Uri uri, String str, int i11) {
            this.f122127a = uri;
            this.f122128b = str;
            this.f122129c = i11;
        }

        /* renamed from: a */
        public int m132074a() {
            return this.f122129c;
        }

        /* renamed from: b */
        public String m132075b() {
            return this.f122128b;
        }
    }

    public AbstractC25494d(ContentResolver contentResolver, Bitmap.CompressFormat compressFormat, int i11, double d11, double d12) {
        super(AbstractC0837p0.m2225f());
        this.f122122r = contentResolver;
        this.f122123s = compressFormat;
        this.f122124t = i11;
        this.f122125u = d11;
        this.f122126v = d12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a mo132071g(Bitmap... bitmapArr) {
        int i11;
        FileOutputStream fileOutputStream;
        Exception exc;
        int i12;
        try {
            Bitmap bitmap = bitmapArr[0];
            File mo132070h = mo132070h();
            if (mo132070h == null) {
                try {
                    AbstractC20110a.m104535d("Could not save photo - probably failed to create directory", new Object[0]);
                    return new a(null, null, -1);
                } catch (Exception e11) {
                    exc = e11;
                    fileOutputStream = null;
                    i12 = 1;
                    Object[] objArr = new Object[i12];
                    objArr[0] = Log.getStackTraceString(exc);
                    AbstractC20110a.m104538g("Problem saving image\n %s", objArr);
                    if (fileOutputStream != null) {
                    }
                    if (AbstractC23227u1.m119701a(exc)) {
                    }
                    return new a(null, null, 78002);
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    fileOutputStream = null;
                    i11 = 1;
                    Object[] objArr2 = new Object[i11];
                    objArr2[0] = Log.getStackTraceString(e);
                    AbstractC20110a.m104538g("Problem saving image\n %s", objArr2);
                    if (fileOutputStream != null) {
                    }
                    return new a(null, null, 78001);
                }
            }
            AbstractC20110a.m104535d("Saving final bitmap to file: %s", mo132070h.toString());
            AbstractC23237v1.m119714b("capture", "start compress");
            fileOutputStream = new FileOutputStream(mo132070h);
            try {
                bitmap.compress(this.f122123s, this.f122124t, fileOutputStream);
                if (mo132073j()) {
                    bitmap.recycle();
                }
                AbstractC23237v1.m119714b("capture", "end compress");
                fileOutputStream.flush();
                fileOutputStream.close();
                if (mo132070h.length() == 0) {
                    if (!AbstractC23238v2.m119726k()) {
                        return new a(null, null, 78002);
                    }
                    return new a(null, null, -1);
                }
                if (mo132072i()) {
                    File file = new File(mo132070h.getPath());
                    AbstractC21943a.m114582f(this.f122122r, file, file.getName(), false, this.f122125u, this.f122126v);
                } else {
                    C23267y1 c23267y1 = new C23267y1();
                    c23267y1.m120025b(this.f122126v, this.f122125u);
                    c23267y1.m120024a(false);
                    AbstractC23277z1.m120059c(c23267y1, mo132070h);
                }
                return new a(null, mo132070h.getPath(), 0);
            } catch (Exception e13) {
                exc = e13;
                i12 = 1;
                Object[] objArr3 = new Object[i12];
                objArr3[0] = Log.getStackTraceString(exc);
                AbstractC20110a.m104538g("Problem saving image\n %s", objArr3);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                }
                if (AbstractC23227u1.m119701a(exc) && (!(exc instanceof IOException) || AbstractC23238v2.m119726k())) {
                    return new a(null, null, -1);
                }
                return new a(null, null, 78002);
            } catch (OutOfMemoryError e15) {
                e = e15;
                i11 = 1;
                Object[] objArr22 = new Object[i11];
                objArr22[0] = Log.getStackTraceString(e);
                AbstractC20110a.m104538g("Problem saving image\n %s", objArr22);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e16) {
                        e16.printStackTrace();
                    }
                }
                return new a(null, null, 78001);
            }
        } catch (Exception e17) {
            exc = e17;
            i12 = 1;
            fileOutputStream = null;
        } catch (OutOfMemoryError e18) {
            e = e18;
            i11 = 1;
            fileOutputStream = null;
        }
    }

    /* renamed from: h */
    protected abstract File mo132070h();

    /* renamed from: i */
    protected abstract boolean mo132072i();

    /* renamed from: j */
    protected abstract boolean mo132073j();
}
