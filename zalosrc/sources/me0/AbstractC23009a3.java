package me0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p239ih.C20556f;
import p620wt.AbstractC29237l;

/* renamed from: me0.a3 */
/* loaded from: classes.dex */
public abstract class AbstractC23009a3 {

    /* renamed from: a */
    public static boolean f111957a = true;

    /* renamed from: b */
    public static int f111958b = 960;

    /* renamed from: c */
    public static int f111959c = 960;

    /* renamed from: a */
    private static synchronized int m117950a(int i11, int i12) {
        int ceil;
        synchronized (AbstractC23009a3.class) {
            ceil = (int) Math.ceil(((i11 * 1.0d) - 0.5d) * i12);
        }
        return ceil;
    }

    /* renamed from: b */
    public static synchronized boolean m117951b(Bitmap bitmap, int i11, int i12) {
        boolean z11;
        synchronized (AbstractC23009a3.class) {
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            if (max <= i11 && min <= i12) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: c */
    public static synchronized boolean m117952c(String str, int i11, int i12) {
        boolean z11;
        synchronized (AbstractC23009a3.class) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            z11 = true;
            options.inJustDecodeBounds = true;
            InputStream m106838k = new C20556f(str).m106838k();
            BitmapFactory.decodeStream(m106838k, null, options);
            AbstractC29237l.m145996a(m106838k);
            int max = Math.max(options.outWidth, options.outHeight);
            int min = Math.min(options.outWidth, options.outHeight);
            if (max > i11 || min > i12) {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public static synchronized boolean m117953d(Bitmap bitmap, int i11) {
        boolean z11;
        synchronized (AbstractC23009a3.class) {
            if (bitmap.getWidth() * bitmap.getHeight() <= i11 * i11) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: e */
    public static synchronized int[] m117954e(String str) {
        int[] iArr;
        synchronized (AbstractC23009a3.class) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream m106838k = new C20556f(str).m106838k();
            BitmapFactory.decodeStream(m106838k, null, options);
            iArr = new int[]{options.outWidth, options.outHeight};
            AbstractC29237l.m145996a(m106838k);
        }
        return iArr;
    }

    /* renamed from: f */
    private static synchronized BitmapFactory.Options m117955f(int i11, int i12, int i13) {
        BitmapFactory.Options options;
        float f11;
        float f12;
        synchronized (AbstractC23009a3.class) {
            options = new BitmapFactory.Options();
            if (i11 > i12 || i12 <= i11) {
                f11 = i13;
                f12 = i11;
            } else {
                f11 = i13;
                f12 = i12;
            }
            float f13 = f11 / f12;
            options.outWidth = (int) ((i11 * f13) + 0.5f);
            options.outHeight = (int) ((i12 * f13) + 0.5f);
        }
        return options;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:            if ((r6 * r2) > r7) goto L8;     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized BitmapFactory.Options m117956g(int i11, int i12, int i13, int i14) {
        BitmapFactory.Options options;
        float f11;
        float f12;
        float f13;
        synchronized (AbstractC23009a3.class) {
            options = new BitmapFactory.Options();
            if (i11 > i12) {
                f11 = i13 / i11;
                f12 = i12;
                f13 = i14;
            } else {
                f11 = i13 / i12;
                f12 = i11;
                f13 = i14;
                if (f11 * f12 > f13) {
                    f11 = f13 / f12;
                }
                options.outWidth = (int) ((i11 * f11) + 0.5f);
                options.outHeight = (int) ((i12 * f11) + 0.5f);
            }
        }
        return options;
    }

    /* renamed from: h */
    private static synchronized BitmapFactory.Options m117957h(int i11, int i12, int i13) {
        BitmapFactory.Options options;
        synchronized (AbstractC23009a3.class) {
            options = new BitmapFactory.Options();
            double d11 = i13 * i13;
            double d12 = i11;
            double d13 = i12;
            options.outWidth = (int) Math.sqrt((d11 * d12) / d13);
            options.outHeight = (int) Math.sqrt((d11 * d13) / d12);
        }
        return options;
    }

    /* renamed from: i */
    public static int m117958i(int i11, int i12, int i13, int i14) {
        int max = Math.max(i11, i12);
        int min = Math.min(i11, i12);
        int i15 = 1;
        while (max / i15 > i13) {
            i15++;
        }
        while (min / i15 > i14) {
            i15++;
        }
        int i16 = i15 - 1;
        if (i16 < 1) {
            return 1;
        }
        return i16;
    }

    /* renamed from: j */
    public static void m117959j(boolean z11) {
        if (z11) {
            f111958b = 720;
            f111959c = 720;
        } else {
            f111958b = 960;
            f111959c = 960;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:            if (r13.startsWith(r6) != false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:            if (r13.startsWith(r9) != false) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:            if (r13.startsWith(r10) != false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:            if (r13.startsWith(r11) != false) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:            if (r13.startsWith(r4) == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:            return true;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m117960k(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(AbstractC23204s0.m119554e().getAbsolutePath());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 29) {
                arrayList.add(Environment.getExternalStorageDirectory().getAbsolutePath());
            }
            arrayList.addAll(AbstractC23204s0.m119556g());
            String str2 = "";
            if (AbstractC23254w8.m119859g(str)) {
                C20556f c20556f = new C20556f(str);
                if (i11 >= 29) {
                    str2 = c20556f.m106843p();
                    if (str2 != null && str2.endsWith("/")) {
                        str2 = str2.substring(0, str2.length() - 1);
                    }
                } else {
                    str = c20556f.m106831c();
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                String str3 = (String) arrayList.get(i12);
                String str4 = str3 + "/" + Environment.DIRECTORY_DCIM + "/Screenshots";
                String str5 = str3 + "/" + Environment.DIRECTORY_PICTURES + "/Screenshots";
                String str6 = str3 + "/" + Environment.DIRECTORY_MOVIES + "/Screenshots";
                String str7 = str3 + "/Screenshots";
                String str8 = str3 + "/Screenshot";
                if (str2 != null && str2.length() != 0) {
                    if (str4.endsWith(str2) || str5.endsWith(str2) || str6.endsWith(str2) || str7.endsWith(str2) || str8.endsWith(str2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return false;
    }

    /* renamed from: l */
    public static Bitmap m117961l(String str) {
        try {
            return m117967r(str, 200);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static synchronized Bitmap m117962m(Bitmap bitmap, int i11) {
        Bitmap bitmap2;
        synchronized (AbstractC23009a3.class) {
            try {
                Matrix matrix = new Matrix();
                BitmapFactory.Options m117957h = m117957h(bitmap.getWidth(), bitmap.getHeight(), i11);
                matrix.postScale(m117957h.outWidth / bitmap.getWidth(), m117957h.outHeight / bitmap.getHeight());
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception | OutOfMemoryError unused) {
                bitmap2 = null;
            }
        }
        return bitmap2;
    }

    /* renamed from: n */
    public static synchronized Bitmap m117963n(String str, int i11) {
        int i12;
        synchronized (AbstractC23009a3.class) {
            try {
                AbstractC20110a.m104535d("resampleImageByAreaWithMatrix: %d [%s]", Integer.valueOf(i11), str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C20556f c20556f = new C20556f(str);
                InputStream m106838k = c20556f.m106838k();
                BitmapFactory.decodeStream(m106838k, null, options);
                AbstractC20110a.m104535d("resampleImageByAreaWithMatrix#beforeDecode: %d-%d [%s]", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), str);
                int i13 = options.outWidth;
                if (i13 > 0 && (i12 = options.outHeight) > 0) {
                    int m117970u = m117970u(i13, i12, i11);
                    double d11 = i11 * i11;
                    int sqrt = (int) Math.sqrt((options.outWidth * d11) / options.outHeight);
                    int sqrt2 = (int) Math.sqrt((d11 * options.outHeight) / options.outWidth);
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = m117970u;
                    if (f111957a) {
                        options2.inMutable = true;
                        options2.inScaled = true;
                        options2.inDensity = Math.max(options.outHeight, options.outWidth);
                        options2.inTargetDensity = m117950a(Math.max(sqrt, sqrt2), options2.inSampleSize);
                    }
                    InputStream m106838k2 = c20556f.m106838k();
                    try {
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(m106838k2, null, options2);
                            if (decodeStream != null) {
                                AbstractC20110a.m104535d("resampleImageByAreaWithMatrix#afterDecode: %d-%d [%s]", Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()), str);
                                int m120057a = AbstractC23277z1.m120057a(c20556f);
                                if (m120057a != 0) {
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(m120057a);
                                    decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                                }
                            }
                            return decodeStream;
                        } catch (Exception | OutOfMemoryError e11) {
                            AbstractC20110a.m104539h(e11);
                            throw e11;
                        }
                    } finally {
                        AbstractC29237l.m145996a(m106838k);
                        AbstractC29237l.m145996a(m106838k2);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    /* renamed from: o */
    public static Bitmap m117964o(String str, int i11) {
        int i12;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C20556f c20556f = new C20556f(str);
        InputStream m106838k = c20556f.m106838k();
        BitmapFactory.decodeStream(m106838k, null, options);
        int i13 = options.outWidth;
        if (i13 <= 0 || (i12 = options.outHeight) <= 0) {
            return null;
        }
        int m117970u = m117970u(i13, i12, i11);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = m117970u;
        InputStream m106838k2 = c20556f.m106838k();
        try {
            return BitmapFactory.decodeStream(m106838k2, null, options2);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        } finally {
            AbstractC29237l.m145996a(m106838k);
            AbstractC29237l.m145996a(m106838k2);
        }
    }

    /* renamed from: p */
    public static synchronized Bitmap m117965p(Bitmap bitmap, int i11, int i12) {
        Bitmap bitmap2;
        synchronized (AbstractC23009a3.class) {
            bitmap2 = null;
            try {
                int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (max > i11 || min > i12) {
                    Matrix matrix = new Matrix();
                    BitmapFactory.Options m117956g = m117956g(bitmap.getWidth(), bitmap.getHeight(), i11, i12);
                    matrix.postScale(m117956g.outWidth / bitmap.getWidth(), m117956g.outHeight / bitmap.getHeight());
                    bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (Exception | OutOfMemoryError unused) {
            }
        }
        return bitmap2;
    }

    /* renamed from: q */
    public static synchronized Bitmap m117966q(String str) {
        Bitmap m117968s;
        synchronized (AbstractC23009a3.class) {
            m117968s = m117968s(str, f111958b, f111959c);
        }
        return m117968s;
    }

    /* renamed from: r */
    public static synchronized Bitmap m117967r(String str, int i11) {
        int i12;
        synchronized (AbstractC23009a3.class) {
            try {
                AbstractC20110a.m104535d("resampleImageWithMatrix: %d [%s]", Integer.valueOf(i11), str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C20556f c20556f = new C20556f(str);
                InputStream m106838k = c20556f.m106838k();
                BitmapFactory.decodeStream(m106838k, null, options);
                AbstractC20110a.m104535d("resampleImageWithMatrix#beforeDecode: %d-%d [%s]", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), str);
                int i13 = options.outWidth;
                if (i13 > 0 && (i12 = options.outHeight) > 0) {
                    int m117969t = m117969t(Math.max(i13, i12), i11);
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = m117969t;
                    if (f111957a) {
                        options2.inMutable = true;
                        options2.inScaled = true;
                        options2.inDensity = Math.max(options.outHeight, options.outWidth);
                        options2.inTargetDensity = m117950a(i11, options2.inSampleSize);
                    }
                    InputStream m106838k2 = c20556f.m106838k();
                    try {
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(m106838k2, null, options2);
                            if (decodeStream != null) {
                                AbstractC20110a.m104535d("resampleImageWithMatrix#afterDecode: %d-%d [%s]", Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()), str);
                                if (decodeStream.getWidth() <= i11) {
                                    if (decodeStream.getHeight() > i11) {
                                    }
                                }
                                Matrix matrix = new Matrix();
                                BitmapFactory.Options m117955f = m117955f(decodeStream.getWidth(), decodeStream.getHeight(), i11);
                                matrix.postScale(m117955f.outWidth / decodeStream.getWidth(), m117955f.outHeight / decodeStream.getHeight());
                                int m120057a = AbstractC23277z1.m120057a(c20556f);
                                if (m120057a != 0) {
                                    matrix.postRotate(m120057a);
                                }
                                decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                                AbstractC20110a.m104535d("resampleImageWithMatrix#afterApplyMatrix: %d-%d [%s]", Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()), str);
                            }
                            AbstractC29237l.m145996a(m106838k);
                            AbstractC29237l.m145996a(m106838k2);
                            return decodeStream;
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC20110a.m104539h(e);
                            throw e;
                        } catch (OutOfMemoryError e12) {
                            e = e12;
                            AbstractC20110a.m104539h(e);
                            throw e;
                        }
                    } catch (Throwable th2) {
                        AbstractC29237l.m145996a(m106838k);
                        AbstractC29237l.m145996a(m106838k2);
                        throw th2;
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: s */
    public static synchronized Bitmap m117968s(String str, int i11, int i12) {
        boolean z11;
        InputStream m106838k;
        int i13;
        Bitmap decodeStream;
        Bitmap bitmap;
        Bitmap createBitmap;
        synchronized (AbstractC23009a3.class) {
            try {
                AbstractC20110a.m104535d("resampleImageWithMatrix: %d-%d [%s]", Integer.valueOf(i11), Integer.valueOf(i12), str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C20556f c20556f = new C20556f(str);
                if (!AbstractC23254w8.m119859g(str) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(c20556f.m106838k()))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Bitmap bitmap2 = null;
                if (z11) {
                    ZJXLDecoder.Options options2 = new ZJXLDecoder.Options();
                    options2.f88636a = true;
                    if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(str, options2)) == 0) {
                        options.outWidth = options2.bmPreviewWidth;
                        options.outHeight = options2.bmPreviewHeight;
                    } else {
                        AbstractC20110a.m104538g("resampleImageByAreaWithMatrix#decodeJXLImageBounds fail", new Object[0]);
                    }
                } else {
                    m106838k = c20556f.m106838k();
                    try {
                        try {
                            BitmapFactory.decodeStream(m106838k, null, options);
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    } finally {
                        AbstractC29237l.m145996a(m106838k);
                    }
                }
                AbstractC20110a.m104535d("resampleImageWithMatrix#beforeDecode: %d-%d [%s]", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), str);
                int i14 = options.outWidth;
                if (i14 > 0 && (i13 = options.outHeight) > 0) {
                    int max = Math.max(1, Integer.highestOneBit(m117958i(i14, i13, i11, i12)));
                    BitmapFactory.Options options3 = new BitmapFactory.Options();
                    options3.inSampleSize = max;
                    if (f111957a) {
                        options3.inMutable = true;
                        options3.inScaled = true;
                        options3.inDensity = Math.max(options.outHeight, options.outWidth);
                        options3.inTargetDensity = m117950a(i11, options3.inSampleSize);
                    }
                    m106838k = c20556f.m106838k();
                    try {
                        if (z11) {
                            int i15 = options.outWidth;
                            int i16 = options3.inSampleSize;
                            decodeStream = Bitmap.createBitmap(i15 / i16, options.outHeight / i16, Bitmap.Config.ARGB_8888);
                            if (ZJXLDecoder.m92544d(ZJXLDecoder.m92543c(str, options3.inSampleSize, decodeStream)) != 0) {
                                AbstractC20110a.m104538g("resampleImageByAreaWithMatrix#decodeJXLImage fail", new Object[0]);
                            }
                        } else {
                            decodeStream = BitmapFactory.decodeStream(m106838k, null, options3);
                        }
                        bitmap = decodeStream;
                    } catch (Exception | OutOfMemoryError unused) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    if (bitmap != null) {
                        AbstractC20110a.m104535d("resampleImageWithMatrix#afterDecode: %d-%d [%s]", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), str);
                        int max2 = Math.max(bitmap.getWidth(), bitmap.getHeight());
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        if (max2 <= i11 && min <= i12) {
                            int m120057a = AbstractC23277z1.m120057a(c20556f);
                            if (m120057a != 0) {
                                Matrix matrix = new Matrix();
                                matrix.postRotate(m120057a);
                                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                bitmap2 = createBitmap;
                                AbstractC29237l.m145996a(m106838k);
                                return bitmap2;
                            }
                        }
                        Matrix matrix2 = new Matrix();
                        BitmapFactory.Options m117956g = m117956g(bitmap.getWidth(), bitmap.getHeight(), i11, i12);
                        matrix2.postScale(m117956g.outWidth / bitmap.getWidth(), m117956g.outHeight / bitmap.getHeight());
                        int m120057a2 = AbstractC23277z1.m120057a(c20556f);
                        if (m120057a2 != 0) {
                            matrix2.postRotate(m120057a2);
                        }
                        createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                        AbstractC20110a.m104535d("resampleImageWithMatrix#afterApplyMatrix: %d-%d [%s]", Integer.valueOf(createBitmap.getWidth()), Integer.valueOf(createBitmap.getHeight()), str);
                        bitmap2 = createBitmap;
                        AbstractC29237l.m145996a(m106838k);
                        return bitmap2;
                    }
                    bitmap2 = bitmap;
                    AbstractC29237l.m145996a(m106838k);
                    return bitmap2;
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: t */
    public static int m117969t(int i11, int i12) {
        int i13 = 1;
        for (int i14 = 0; i14 < 10 && i11 >= i12 * 2; i14++) {
            i11 /= 2;
            i13 *= 2;
        }
        return i13;
    }

    /* renamed from: u */
    public static int m117970u(int i11, int i12, int i13) {
        double d11;
        int i14 = 1;
        if (i11 <= 240 && i12 <= 240) {
            return 1;
        }
        if (Math.min(i11, i12) * 2 <= Math.max(i11, i12)) {
            d11 = 1.3333333333333333d;
        } else {
            d11 = 0.75d;
        }
        double d12 = i13;
        double d13 = d12 * d12 * d11;
        if (i11 * i12 <= d13) {
            return 1;
        }
        for (int i15 = 0; i15 < 10; i15++) {
            if (i11 * i12 <= d13) {
                return i14 / 2;
            }
            i11 /= 2;
            i12 /= 2;
            i14 *= 2;
        }
        return i14;
    }

    /* renamed from: v */
    public static void m117971v(Bitmap bitmap, String str, int i11) {
        try {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                File file2 = new File(AbstractC23204s0.m119558i(), file.getName());
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, fileOutputStream);
                        bitmap.recycle();
                        fileOutputStream.flush();
                        if (file2.exists() && file2.length() >= 0) {
                            AbstractC23238v2.m119718c(file2, file);
                        }
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: w */
    public static int m117972w(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11, String str) {
        int i12 = 502;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(compressFormat, i11, byteArrayOutputStream);
                    bitmap.recycle();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray.length > 0) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(str);
                            try {
                                fileOutputStream.write(byteArray);
                                fileOutputStream.flush();
                                i12 = 0;
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                            if (AbstractC23227u1.m119701a(e11) || ((e11 instanceof IOException) && !AbstractC23238v2.m119726k())) {
                                i12 = 601;
                            }
                        }
                    }
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
        return i12;
    }
}
