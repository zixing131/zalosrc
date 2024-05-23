package nl0;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.zing.zalo.zlottie.jni.ZLottieJNI;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nl0.j */
/* loaded from: classes7.dex */
public abstract class AbstractC23880j {
    /* renamed from: a */
    public static Size m124934a(Context context, int i11) {
        return m124937d(context.getResources().openRawResource(i11));
    }

    /* renamed from: b */
    public static Size m124935b(Context context, Uri uri) {
        try {
            return m124937d(context.getContentResolver().openInputStream(uri));
        } catch (IOException e11) {
            AbstractC20110a.m104546o(e11);
            return new Size(0, 0);
        }
    }

    /* renamed from: c */
    public static Size m124936c(Context context, String str) {
        try {
            return m124937d(context.getResources().getAssets().open(str));
        } catch (IOException e11) {
            AbstractC20110a.m104546o(e11);
            return new Size(0, 0);
        }
    }

    /* renamed from: d */
    private static Size m124937d(InputStream inputStream) {
        return ZLottieJNI.m92130f(m124940g(inputStream), ZLottieJNI.EnumC17287a.JSON_DATA);
    }

    /* renamed from: e */
    public static Size m124938e(String str) {
        return ZLottieJNI.m92130f(str, ZLottieJNI.EnumC17287a.FILE_PATH);
    }

    /* renamed from: f */
    public static boolean m124939f(String str) {
        return str.matches("^[a-zA-Z0-9_.-]*$");
    }

    /* renamed from: g */
    public static String m124940g(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[65536];
        try {
            try {
                byte[] bArr2 = new byte[4096];
                int i11 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, 4096);
                    if (read >= 0) {
                        int i12 = i11 + read;
                        if (bArr.length < i12) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i11);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i11, read);
                            i11 = i12;
                        }
                    } else {
                        inputStream.close();
                        return new String(bArr, 0, i11);
                    }
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
