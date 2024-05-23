package com.zing.zalo.zqrcode;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.zqrcode.QRCodeManager;
import com.zing.zalo.zqrcode.Result;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import md.C22986b;
import me0.AbstractC23044d5;
import mm0.AbstractC23350e;
import on0.C24321d;
import p533u0.InterfaceC26918d;
import p664y.AbstractC30228a;
import pm0.C24848g0;
import sl0.EnumC26320a;

@Keep
/* loaded from: classes7.dex */
public final class QRCodeManager {
    public static final String TAG = "QRCodeManager";

    @Keep
    private static QRCodeManager instance;
    private WeakReference<InterfaceC17396a> mCallbackRef;
    private final Object mMutexDecoder = new Object();
    public static final Companion Companion = new Companion(null);
    private static Object mMutexInstance = new Object();

    @Keep
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public static /* synthetic */ QRCodeManager getInstance$default(Companion companion, Context context, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                context = null;
            }
            return companion.getInstance(context);
        }

        private final void loadLib(Context context) {
            synchronized (QRCodeManager.mMutexInstance) {
                try {
                    if (QRCodeManager.instance == null) {
                        try {
                            EnumC16739a enumC16739a = EnumC16739a.f84859B;
                            if (!AbstractC23044d5.m118229b(enumC16739a)) {
                                if (context == null) {
                                    context = CoreUtility.getAppContext();
                                }
                                AbstractC23044d5.m118231d(context, enumC16739a);
                            }
                        } catch (Throwable th2) {
                            AbstractC23350e.m122774d(QRCodeManager.TAG, th2.getMessage());
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: loadLibAsync$lambda-2, reason: not valid java name */
        public static final void m157967loadLibAsync$lambda2(AbstractC23044d5.a aVar) {
            AbstractC19074t.m100208f(aVar, "$nativeLibraryCallback");
            synchronized (QRCodeManager.mMutexInstance) {
                try {
                    if (QRCodeManager.instance == null) {
                        try {
                            EnumC16739a enumC16739a = EnumC16739a.f84859B;
                            if (!AbstractC23044d5.m118229b(enumC16739a)) {
                                AbstractC23044d5.m118232e(CoreUtility.getAppContext(), enumC16739a, aVar);
                            } else {
                                aVar.m118233a();
                            }
                        } catch (Throwable th2) {
                            aVar.onFailed();
                            AbstractC23350e.m122774d(QRCodeManager.TAG, th2.getMessage());
                        }
                    } else {
                        aVar.m118233a();
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final QRCodeManager getInstance() {
            return getInstance$default(this, null, 1, null);
        }

        public final void loadLibAsync(final AbstractC23044d5.a aVar) {
            AbstractC19074t.m100208f(aVar, "nativeLibraryCallback");
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable(aVar) { // from class: sl0.c
                @Override // java.lang.Runnable
                public final void run() {
                    QRCodeManager.Companion.m157967loadLibAsync$lambda2(null);
                }
            });
        }

        public final QRCodeManager getInstance(Context context) {
            if (QRCodeManager.instance == null) {
                loadLib(context);
            }
            return QRCodeManager.instance;
        }
    }

    /* renamed from: com.zing.zalo.zqrcode.QRCodeManager$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC17396a {
    }

    private QRCodeManager() {
    }

    @Keep
    private final void callbackDataCrop(byte[] bArr, int i11, int i12) {
    }

    @Keep
    private final void callbackResultPoint(ResultPoint resultPoint) {
        try {
            WeakReference<InterfaceC17396a> weakReference = this.mCallbackRef;
            if (weakReference != null) {
                AbstractC30228a.m149044a(weakReference.get());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static /* synthetic */ Bitmap encode$default(QRCodeManager qRCodeManager, String str, int i11, int i12, EnumC26320a enumC26320a, int i13, int i14, int i15, Charset charset, int i16, Object obj) {
        EnumC26320a enumC26320a2;
        int i17;
        int i18;
        int i19;
        Charset charset2;
        if ((i16 & 8) != 0) {
            enumC26320a2 = EnumC26320a.Medium;
        } else {
            enumC26320a2 = enumC26320a;
        }
        if ((i16 & 16) != 0) {
            i17 = 2;
        } else {
            i17 = i13;
        }
        if ((i16 & 32) != 0) {
            i18 = Color.parseColor("#006AF5");
        } else {
            i18 = i14;
        }
        if ((i16 & 64) != 0) {
            i19 = -1;
        } else {
            i19 = i15;
        }
        if ((i16 & 128) != 0) {
            charset2 = C24321d.f117408b;
        } else {
            charset2 = charset;
        }
        return qRCodeManager.encode(str, i11, i12, enumC26320a2, i17, i18, i19, charset2);
    }

    public static final QRCodeManager getInstance() {
        return Companion.getInstance();
    }

    public static final void loadLibAsync(AbstractC23044d5.a aVar) {
        Companion.loadLibAsync(aVar);
    }

    public synchronized Result decode(Bitmap bitmap, boolean z11, boolean z12) {
        Result nativeDecodeBitmap;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        synchronized (this.mMutexDecoder) {
            nativeDecodeBitmap = QRCodeManagerKt.nativeDecodeBitmap(bitmap, z11);
            if (z12) {
                bitmap.recycle();
            }
        }
        return nativeDecodeBitmap;
    }

    public final synchronized Result decodeBitmap(Bitmap bitmap, int i11, int i12, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        return decode(bitmap, z11, z12);
    }

    public final synchronized Result decodeYUV(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, InterfaceC17396a interfaceC17396a) {
        AbstractC19074t.m100208f(bArr, "data");
        return decode(bArr, i11, i12, i13, i14, i15, i16, interfaceC17396a, false, 1.0f);
    }

    public final Bitmap encode(String str, int i11, int i12, EnumC26320a enumC26320a, int i13, int i14, int i15, Charset charset) {
        Bitmap nativeEncodeString;
        AbstractC19074t.m100208f(str, "string");
        AbstractC19074t.m100208f(enumC26320a, "errorCorrectionLevel");
        AbstractC19074t.m100208f(charset, "stringEncoding");
        synchronized (this.mMutexDecoder) {
            int m117753b = C22986b.f111775a.m117753b();
            if (i11 >= 0 && i12 >= 0) {
                if (i11 <= m117753b && i12 <= m117753b) {
                    if (str.length() != 0) {
                        if (i13 >= 0) {
                            byte[] bytes = str.getBytes(charset);
                            AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
                            char m135463c = enumC26320a.m135463c();
                            String name = charset.name();
                            AbstractC19074t.m100207e(name, "stringEncoding.name()");
                            nativeEncodeString = QRCodeManagerKt.nativeEncodeString(bytes, i11, i12, m135463c, i13, i14, i15, name);
                        } else {
                            throw new IllegalArgumentException("Bad margin");
                        }
                    } else {
                        throw new IllegalArgumentException("string is empty");
                    }
                } else {
                    throw new IllegalArgumentException("requestWidth or requestHeight too big");
                }
            } else {
                throw new IllegalArgumentException("requestWidth or requestHeight too small");
            }
        }
        return nativeEncodeString;
    }

    public void freeResource() {
    }

    public static final QRCodeManager getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public synchronized Result decode(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, InterfaceC17396a interfaceC17396a, boolean z11, float f11) {
        Result failed;
        int i17;
        AbstractC19074t.m100208f(bArr, "yuvData");
        try {
            synchronized (this.mMutexDecoder) {
                try {
                    this.mCallbackRef = new WeakReference<>(interfaceC17396a);
                    i17 = i11 * i12;
                } catch (IllegalArgumentException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    failed = new Result.Failed(0L, Result.Failed.EnumC17397a.IllegalArgument.ordinal());
                }
                if (bArr.length < i17) {
                    throw new IllegalArgumentException("width * height must greater or equal to yuvData.length".toString());
                }
                if ((i14 * i11) + i13 < 0) {
                    throw new IllegalArgumentException("Invalid crop param: min_y * row_stride + min_x < 0".toString());
                }
                if (((i14 + (i16 - 1)) * i11) + i13 + (i15 - 1) < i17) {
                    failed = QRCodeManagerKt.nativeDecodeDataYUV(bArr, i11, i12, i13, i14, i15, i16, z11, f11);
                } else {
                    throw new IllegalArgumentException("Invalid crop param: max_y * row_stride + max_x >= width * height".toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return failed;
    }

    public final synchronized Result decode(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, int i15, InterfaceC17396a interfaceC17396a) {
        Result failed;
        AbstractC19074t.m100208f(byteBuffer, "yData");
        try {
            synchronized (this.mMutexDecoder) {
                try {
                } catch (IllegalArgumentException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    failed = new Result.Failed(0L, Result.Failed.EnumC17397a.IllegalArgument.ordinal());
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("yData not a direct ByteBuffer".toString());
                }
                if ((i13 * i11) + i12 >= 0) {
                    if ((((i15 - 1) + i13) * i11) + (i14 - 1) + i12 < byteBuffer.capacity()) {
                        this.mCallbackRef = new WeakReference<>(interfaceC17396a);
                        failed = QRCodeManagerKt.nativeDecodeDataY(byteBuffer, i11, i12, i13, i14, i15);
                    } else {
                        throw new IllegalArgumentException("Invalid crop param: max_y * row_stride + max_x >= width * height".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Invalid crop param: min_y * row_stride + min_x < 0".toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return failed;
    }

    public final synchronized Result decode(InterfaceC26918d interfaceC26918d, InterfaceC17396a interfaceC17396a) {
        Result.Failed failed;
        AbstractC19074t.m100208f(interfaceC26918d, "image");
        synchronized (this.mMutexDecoder) {
            interfaceC26918d.getFormat();
            int format = interfaceC26918d.getFormat();
            if (format != 35 && format != 39 && format != 40) {
                AbstractC20110a.f98889a.mo104551d("ImageFormat " + format + " not supported. Only support ImageFormat.YUV_420_888, ImageFormat.YUV_422_888 and ImageFormat.YUV_444_888", new Object[0]);
                failed = new Result.Failed(0L, Result.Failed.EnumC17397a.IllegalArgument.ordinal());
            } else {
                InterfaceC26918d.a aVar = interfaceC26918d.m138736X()[0];
                Rect m138737e0 = interfaceC26918d.m138737e0();
                AbstractC19074t.m100207e(m138737e0, "image.cropRect");
                if (m138737e0.isEmpty()) {
                    m138737e0.set(0, 0, interfaceC26918d.getWidth(), interfaceC26918d.getHeight());
                }
                throw null;
            }
        }
        return failed;
    }
}
