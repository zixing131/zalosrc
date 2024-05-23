package pa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p385oa.C24141a;

/* renamed from: pa.d */
/* loaded from: classes3.dex */
public class C24704d {

    /* renamed from: a */
    private static final C24704d f118669a = new C24704d();

    private C24704d() {
    }

    /* renamed from: a */
    public static ByteBuffer m128276a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: e */
    public static C24704d m128277e() {
        return f118669a;
    }

    /* renamed from: h */
    public static Bitmap m128278h(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        byte[] m128281k = m128281k(m128279i(byteBuffer, true).array(), i11, i12);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m128281k, 0, m128281k.length);
        return m128280j(decodeByteArray, i13, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    /* renamed from: i */
    public static ByteBuffer m128279i(ByteBuffer byteBuffer, boolean z11) {
        ByteBuffer allocateDirect;
        int i11;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i12 = limit / 6;
        if (z11) {
            allocateDirect = ByteBuffer.allocate(limit);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(limit);
        }
        int i13 = 0;
        while (true) {
            i11 = i12 * 4;
            if (i13 >= i11) {
                break;
            }
            allocateDirect.put(i13, byteBuffer.get(i13));
            i13++;
        }
        for (int i14 = 0; i14 < i12 + i12; i14++) {
            allocateDirect.put(i11 + i14, byteBuffer.get(((i14 % 2) * i12) + i11 + (i14 / 2)));
        }
        return allocateDirect;
    }

    /* renamed from: j */
    public static Bitmap m128280j(Bitmap bitmap, int i11, int i12, int i13) {
        if (i11 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
    }

    /* renamed from: k */
    private static byte[] m128281k(byte[] bArr, int i11, int i12) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new MlKitException("Image conversion error from NV21 format", 13, e11);
        }
    }

    /* renamed from: l */
    private static final void m128282l(Image.Plane plane, int i11, int i12, byte[] bArr, int i13, int i14) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i15 = i11 / (i12 / limit);
        int i16 = 0;
        for (int i17 = 0; i17 < limit; i17++) {
            int i18 = i16;
            for (int i19 = 0; i19 < i15; i19++) {
                bArr[i13] = buffer.get(i18);
                i13 += i14;
                i18 += plane.getPixelStride();
            }
            i16 += plane.getRowStride();
        }
    }

    /* renamed from: b */
    public byte[] m128283b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    /* renamed from: c */
    public ByteBuffer m128284c(C24141a c24141a, boolean z11) {
        ByteBuffer allocateDirect;
        Bitmap.Config config;
        int m126122g = c24141a.m126122g();
        if (m126122g != -1) {
            if (m126122g != 17) {
                if (m126122g != 35) {
                    if (m126122g == 842094169) {
                        return m128279i((ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e()), z11);
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return m128287g((Image.Plane[]) AbstractC4205o.m19722k(c24141a.m126125j()), c24141a.m126127l(), c24141a.m126123h());
            }
            if (z11) {
                return m128276a((ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e()));
            }
            return (ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e());
        }
        Bitmap bitmap = (Bitmap) AbstractC4205o.m19722k(c24141a.m126119d());
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i11;
        if (z11) {
            allocateDirect = ByteBuffer.allocate(ceil2);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(ceil2);
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14++) {
            int i15 = 0;
            while (i15 < width) {
                int i16 = iArr[i13];
                int i17 = i16 >> 16;
                int i18 = i16 >> 8;
                int i19 = i16 & 255;
                int i21 = i12 + 1;
                int i22 = i17 & 255;
                int i23 = i18 & 255;
                allocateDirect.put(i12, (byte) Math.min(255, (((((i22 * 66) + (i23 * 129)) + (i19 * 25)) + 128) >> 8) + 16));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    int i24 = ((((i22 * 112) - (i23 * 94)) - (i19 * 18)) + 128) >> 8;
                    int i25 = (((((i22 * (-38)) - (i23 * 74)) + (i19 * 112)) + 128) >> 8) + 128;
                    int i26 = i11 + 1;
                    allocateDirect.put(i11, (byte) Math.min(255, i24 + 128));
                    i11 += 2;
                    allocateDirect.put(i26, (byte) Math.min(255, i25));
                }
                i13++;
                i15++;
                i12 = i21;
            }
        }
        return allocateDirect;
    }

    /* renamed from: d */
    public Bitmap m128285d(C24141a c24141a) {
        int m126122g = c24141a.m126122g();
        if (m126122g != -1) {
            if (m126122g != 17) {
                if (m126122g != 35) {
                    if (m126122g == 842094169) {
                        return m128278h((ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e()), c24141a.m126127l(), c24141a.m126123h(), c24141a.m126126k());
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return m128286f(m128287g((Image.Plane[]) AbstractC4205o.m19722k(c24141a.m126125j()), c24141a.m126127l(), c24141a.m126123h()), c24141a.m126127l(), c24141a.m126123h(), c24141a.m126126k());
            }
            return m128286f((ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e()), c24141a.m126127l(), c24141a.m126123h(), c24141a.m126126k());
        }
        return m128280j((Bitmap) AbstractC4205o.m19722k(c24141a.m126119d()), c24141a.m126126k(), c24141a.m126127l(), c24141a.m126123h());
    }

    /* renamed from: f */
    public Bitmap m128286f(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        byte[] m128281k = m128281k(m128283b(byteBuffer), i11, i12);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m128281k, 0, m128281k.length);
        return m128280j(decodeByteArray, i13, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    /* renamed from: g */
    public ByteBuffer m128287g(Image.Plane[] planeArr, int i11, int i12) {
        boolean z11;
        int i13 = i11 * i12;
        int i14 = i13 / 4;
        byte[] bArr = new byte[i14 + i14 + i13];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i15 = (i13 + i13) / 4;
        if (buffer2.remaining() == i15 - 2 && buffer2.compareTo(buffer) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        buffer2.position(position);
        buffer.limit(limit);
        if (z11) {
            planeArr[0].getBuffer().get(bArr, 0, i13);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i13, 1);
            buffer3.get(bArr, i13 + 1, i15 - 1);
        } else {
            m128282l(planeArr[0], i11, i12, bArr, 0, 1);
            m128282l(planeArr[1], i11, i12, bArr, i13 + 1, 2);
            m128282l(planeArr[2], i11, i12, bArr, i13, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
