package p227i3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.adtima.Adtima;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import p086d.C17682a;

/* renamed from: i3.l */
/* loaded from: classes2.dex */
public class C20208l {

    /* renamed from: b */
    private static final String f99902b = "l";

    /* renamed from: c */
    private static C20208l f99903c;

    /* renamed from: a */
    private C17682a f99904a = null;

    private C20208l() {
    }

    /* renamed from: b */
    public static C20208l m105404b() {
        if (f99903c == null) {
            f99903c = new C20208l();
        }
        return f99903c;
    }

    /* renamed from: c */
    private void m105405c() {
        try {
            this.f99904a = C17682a.m93664b();
        } catch (Exception e11) {
            Adtima.m18329e(f99902b, "initRamCache", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: Exception -> 0x000b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x000b, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x0010, B:9:0x0016, B:14:0x001b, B:25:0x005b), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap m105406a(String str) {
        C17682a c17682a;
        Bitmap bitmap = null;
        r1 = null;
        InputStream inputStream = null;
        try {
            if (this.f99904a == null) {
                m105405c();
            }
            if (str != null && str.length() != 0 && (c17682a = this.f99904a) != null) {
                Bitmap m93665a = c17682a.m93665a(str);
                if (m93665a != null) {
                    try {
                        if (!m93665a.isRecycled()) {
                            return m93665a;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bitmap = m93665a;
                        Adtima.m18329e(f99902b, "getBitmapUrl", e);
                        return bitmap;
                    }
                }
                try {
                    try {
                        inputStream = FirebasePerfUrlConnection.openStream(new URL(str));
                        if (inputStream != null) {
                            m93665a = BitmapFactory.decodeStream(inputStream);
                        }
                        try {
                            inputStream.close();
                        } catch (Exception e12) {
                            e = e12;
                            Adtima.m18329e(f99902b, "getBitmapUrl", e);
                            bitmap = m93665a;
                            if (bitmap == null) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            inputStream.close();
                        } catch (Exception e13) {
                            Adtima.m18329e(f99902b, "getBitmapUrl", e13);
                        }
                        throw th2;
                    }
                } catch (Exception e14) {
                    Adtima.m18329e(f99902b, "getBitmapUrl", e14);
                    try {
                        inputStream.close();
                    } catch (Exception e15) {
                        e = e15;
                        Adtima.m18329e(f99902b, "getBitmapUrl", e);
                        bitmap = m93665a;
                        if (bitmap == null) {
                        }
                    }
                }
                bitmap = m93665a;
                if (bitmap == null) {
                    return bitmap;
                }
                this.f99904a.m93666c(str, bitmap);
                return bitmap;
            }
            return null;
        } catch (Exception e16) {
            e = e16;
        }
    }
}
