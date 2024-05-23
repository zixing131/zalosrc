package p716zh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZVideoUtil;
import en0.InterfaceC18494a;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import me0.AbstractC23009a3;
import me0.AbstractC23258x2;
import me0.AbstractC23277z1;

/* renamed from: zh.k7 */
/* loaded from: classes3.dex */
public abstract class AbstractC31990k7 {
    /* renamed from: b */
    public static Bitmap m154221b(String str, String str2, int i11, int i12, String str3) {
        Bitmap bitmap;
        String lowerCase;
        if (str2 == null) {
            return null;
        }
        try {
            lowerCase = str2.toLowerCase();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (lowerCase.equals("pdf")) {
            bitmap = m154223d(str, i11, i12);
        } else if (m154226g(lowerCase)) {
            bitmap = m154222c(str, i11, i12);
        } else {
            if (m154228i(lowerCase) || m154225f(lowerCase)) {
                bitmap = m154224e(str, i11);
            }
            bitmap = null;
        }
        if (bitmap != null) {
            m154230k(str3, bitmap, Bitmap.CompressFormat.JPEG, 80, null);
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: Exception -> 0x003c, LOOP:0: B:13:0x0051->B:15:0x0057, LOOP_END, TryCatch #0 {Exception -> 0x003c, blocks: (B:3:0x0004, B:12:0x0043, B:15:0x0057, B:17:0x005e, B:19:0x0077, B:25:0x0038, B:27:0x0040), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:3:0x0004, B:12:0x0043, B:15:0x0057, B:17:0x005e, B:19:0x0077, B:25:0x0038, B:27:0x0040), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:3:0x0004, B:12:0x0043, B:15:0x0057, B:17:0x005e, B:19:0x0077, B:25:0x0038, B:27:0x0040), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap m154222c(String str, int i11, int i12) {
        int i13;
        int i14;
        float f11;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(str, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            int width = newInstance.getWidth();
            int height = newInstance.getHeight();
            int m120058b = AbstractC23277z1.m120058b(str);
            if (m120058b != 90 && m120058b != 270) {
                i14 = i11;
                i13 = i12;
                if (i14 != 0 && i13 == 0) {
                    i14 = width;
                    i13 = height;
                } else if (i14 != 0) {
                    i14 = (width * i13) / height;
                } else if (i13 == 0) {
                    i13 = (height * i14) / width;
                }
                float f12 = i14;
                float f13 = i13;
                float max = Math.max(f12 / width, f13 / height);
                int i15 = 1;
                f11 = max;
                while (f11 <= 0.5f) {
                    f11 *= 2.0f;
                    i15 *= 2;
                }
                int i16 = (int) (f12 / max);
                int i17 = (int) (f13 / max);
                int i18 = (width - i16) / 2;
                int i19 = (height - i17) / 2;
                options.inSampleSize = i15;
                Bitmap decodeRegion = newInstance.decodeRegion(new Rect(i18, i19, i16 + i18, i17 + i19), options);
                if (m120058b == 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(m120058b);
                    return Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix, false);
                }
                return decodeRegion;
            }
            i13 = i11;
            i14 = i12;
            if (i14 != 0) {
            }
            if (i14 != 0) {
            }
            float f122 = i14;
            float f132 = i13;
            float max2 = Math.max(f122 / width, f132 / height);
            int i152 = 1;
            f11 = max2;
            while (f11 <= 0.5f) {
            }
            int i162 = (int) (f122 / max2);
            int i172 = (int) (f132 / max2);
            int i182 = (width - i162) / 2;
            int i192 = (height - i172) / 2;
            options.inSampleSize = i152;
            Bitmap decodeRegion2 = newInstance.decodeRegion(new Rect(i182, i192, i162 + i182, i172 + i192), options);
            if (m120058b == 0) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[Catch: Exception -> 0x006e, TRY_ENTER, TryCatch #2 {Exception -> 0x006e, blocks: (B:38:0x00a3, B:40:0x00a8, B:42:0x00ad, B:16:0x006a, B:17:0x0070, B:19:0x0075), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[Catch: Exception -> 0x006e, TryCatch #2 {Exception -> 0x006e, blocks: (B:38:0x00a3, B:40:0x00a8, B:42:0x00ad, B:16:0x006a, B:17:0x0070, B:19:0x0075), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #2 {Exception -> 0x006e, blocks: (B:38:0x00a3, B:40:0x00a8, B:42:0x00ad, B:16:0x006a, B:17:0x0070, B:19:0x0075), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[Catch: Exception -> 0x00b7, TryCatch #7 {Exception -> 0x00b7, blocks: (B:70:0x00b3, B:61:0x00bb, B:63:0x00c0), top: B:69:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0 A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #7 {Exception -> 0x00b7, blocks: (B:70:0x00b3, B:61:0x00bb, B:63:0x00c0), top: B:69:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.pdf.PdfRenderer] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.pdf.PdfRenderer] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.graphics.pdf.PdfRenderer] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.graphics.pdf.PdfRenderer$Page] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.os.ParcelFileDescriptor] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap m154223d(String str, int i11, int i12) {
        Object obj;
        Bitmap bitmap;
        ?? r02 = Build.VERSION.SDK_INT;
        ?? r12 = 28;
        Bitmap bitmap2 = null;
        bitmap2 = null;
        r2 = null;
        r2 = null;
        bitmap2 = null;
        PdfRenderer.Page page = null;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                page = r12;
                if (page != null) {
                    try {
                        page.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        throw th;
                    }
                }
                if (r02 != 0) {
                    r02.close();
                }
                if (str != 0) {
                    str.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        if (r02 < 28) {
            return null;
        }
        try {
            str = ParcelFileDescriptor.open(new File((String) str), 268435456);
            try {
                r02 = new PdfRenderer(str);
            } catch (Exception e13) {
                e = e13;
                bitmap = null;
                obj = str;
                Bitmap bitmap3 = bitmap;
                r12 = bitmap3;
                r02 = bitmap3;
                str = obj;
                e.printStackTrace();
                if (bitmap != null) {
                }
                bitmap2 = bitmap;
                if (r12 != 0) {
                }
                if (r02 != 0) {
                }
                if (str != 0) {
                }
                return bitmap2;
            } catch (Throwable th3) {
                th = th3;
                r02 = 0;
            }
        } catch (Exception e14) {
            e = e14;
            obj = null;
            bitmap = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            r02 = 0;
        }
        try {
            PdfRenderer.Page openPage = r02.openPage(0);
            if (openPage != null) {
                try {
                    int width = openPage.getWidth();
                    int height = openPage.getHeight();
                    if (i11 == 0 && i12 == 0) {
                        i11 = width;
                        i12 = height;
                    } else if (i11 == 0) {
                        i11 = (width * i12) / height;
                    } else if (i12 == 0) {
                        i12 = (height * i11) / width;
                    }
                    float max = Math.max(i11 / width, i12 / height);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    try {
                        createBitmap.eraseColor(-1);
                        Matrix matrix = new Matrix();
                        matrix.setScale(max, max);
                        openPage.render(createBitmap, null, matrix, 1);
                        bitmap2 = createBitmap;
                    } catch (Exception e15) {
                        bitmap = createBitmap;
                        e = e15;
                        r02 = r02;
                        r12 = openPage;
                        str = str;
                        e.printStackTrace();
                        if (bitmap != null) {
                            try {
                                bitmap.recycle();
                            } catch (Exception e16) {
                                e16.printStackTrace();
                                bitmap2 = bitmap;
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (r02 != 0) {
                                    r02.close();
                                }
                                if (str != 0) {
                                    str.close();
                                }
                                return bitmap2;
                            }
                            if (r12 != 0) {
                            }
                            if (r02 != 0) {
                            }
                            if (str != 0) {
                            }
                            return bitmap2;
                        }
                        bitmap2 = bitmap;
                        if (r12 != 0) {
                        }
                        if (r02 != 0) {
                        }
                        if (str != 0) {
                        }
                        return bitmap2;
                    }
                } catch (Exception e17) {
                    e = e17;
                    bitmap = null;
                    r02 = r02;
                    r12 = openPage;
                    str = str;
                }
            }
            if (openPage != null) {
                openPage.close();
            }
            r02.close();
            if (str != 0) {
                str.close();
            }
        } catch (Exception e18) {
            e = e18;
            bitmap = null;
            r12 = 0;
            r02 = r02;
            str = str;
        } catch (Throwable th5) {
            th = th5;
            if (page != null) {
            }
            if (r02 != 0) {
            }
            if (str != 0) {
            }
            throw th;
        }
        return bitmap2;
    }

    /* renamed from: e */
    public static Bitmap m154224e(String str, int i11) {
        Bitmap frameAtTime;
        Bitmap m117965p;
        Bitmap bitmap = null;
        if (str != null && i11 > 0) {
            try {
                File file = new File(str);
                if (file.exists() && file.length() != 0) {
                    bitmap = ZVideoUtil.extractFirstFrame(str, i11, 0);
                    if (bitmap == null) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(str);
                            frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            if (!AbstractC23009a3.m117951b(frameAtTime, i11, i11) && (m117965p = AbstractC23009a3.m117965p(frameAtTime, i11, i11)) != null && frameAtTime != m117965p) {
                                frameAtTime.recycle();
                                bitmap = m117965p;
                            } else {
                                bitmap = frameAtTime;
                            }
                            mediaMetadataRetriever.release();
                        } catch (Throwable th3) {
                            th = th3;
                            mediaMetadataRetriever.release();
                            throw th;
                        }
                    }
                }
                return null;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return bitmap;
    }

    /* renamed from: f */
    public static boolean m154225f(String str) {
        if (str == null) {
            return false;
        }
        return str.toLowerCase().equals("gif");
    }

    /* renamed from: g */
    public static boolean m154226g(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("bmp") && !lowerCase.startsWith("png") && !lowerCase.startsWith("jpg") && !lowerCase.startsWith("jpeg") && !lowerCase.startsWith("webp")) {
            if (!AbstractC23258x2.f112740a) {
                return false;
            }
            if (!lowerCase.startsWith("heic") && !lowerCase.startsWith("heif")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m154227h(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!m154226g(lowerCase) && !m154228i(lowerCase) && !m154225f(lowerCase)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m154228i(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("flv") && !lowerCase.startsWith("ogg") && !lowerCase.startsWith("mov") && !lowerCase.startsWith("mpg") && !lowerCase.startsWith("mkv") && !lowerCase.startsWith("avi") && !lowerCase.startsWith("asf") && !lowerCase.startsWith("wmv") && !lowerCase.startsWith("mp4") && !lowerCase.startsWith("3gp")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Long m154229j(long j11) {
        return Long.valueOf(System.currentTimeMillis() - j11);
    }

    /* renamed from: k */
    public static void m154230k(String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11, C32135u8 c32135u8) {
        C32135u8.m155105l(c32135u8, new InterfaceC18494a() { // from class: zh.i7
            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                return Long.valueOf(System.currentTimeMillis());
            }
        });
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    try {
                        final long currentTimeMillis = System.currentTimeMillis();
                        bitmap.compress(compressFormat, i11, fileOutputStream2);
                        C32135u8.m155104j(c32135u8, new InterfaceC18494a() { // from class: zh.j7
                            @Override // en0.InterfaceC18494a
                            /* renamed from: V4 */
                            public final Object mo12V4() {
                                Long m154229j;
                                m154229j = AbstractC31990k7.m154229j(currentTimeMillis);
                                return m154229j;
                            }
                        });
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        C32135u8.m155102f(c32135u8, new InterfaceC18494a() { // from class: zh.i7
                            @Override // en0.InterfaceC18494a
                            /* renamed from: V4 */
                            public final Object mo12V4() {
                                return Long.valueOf(System.currentTimeMillis());
                            }
                        });
                        C32135u8.m155103h(c32135u8, 0);
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        C32135u8.m155102f(c32135u8, new InterfaceC18494a() { // from class: zh.i7
                            @Override // en0.InterfaceC18494a
                            /* renamed from: V4 */
                            public final Object mo12V4() {
                                return Long.valueOf(System.currentTimeMillis());
                            }
                        });
                        C32135u8.m155103h(c32135u8, 502);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        C32135u8.m155102f(c32135u8, new InterfaceC18494a() { // from class: zh.i7
                            @Override // en0.InterfaceC18494a
                            /* renamed from: V4 */
                            public final Object mo12V4() {
                                return Long.valueOf(System.currentTimeMillis());
                            }
                        });
                        C32135u8.m155103h(c32135u8, 0);
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            C32135u8.m155102f(c32135u8, new InterfaceC18494a() { // from class: zh.i7
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    return Long.valueOf(System.currentTimeMillis());
                }
            });
            C32135u8.m155103h(c32135u8, 17001);
        }
    }

    /* renamed from: l */
    public static boolean m154231l(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("pdf") && !m154226g(lowerCase) && !m154228i(lowerCase) && !m154225f(lowerCase)) {
            return false;
        }
        return true;
    }
}
