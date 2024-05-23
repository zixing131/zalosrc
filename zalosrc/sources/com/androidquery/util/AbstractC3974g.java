package com.androidquery.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import bn0.AbstractC2933b;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.InputStream;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import pm0.C24848g0;

/* renamed from: com.androidquery.util.g */
/* loaded from: classes2.dex */
public abstract class AbstractC3974g {

    /* renamed from: a */
    public static final a f15714a = new a(null);

    /* renamed from: com.androidquery.util.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final BitmapFactory.Options m18820a(String str) {
            boolean z11;
            AbstractC19074t.m100208f(str, "inputPath");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C20556f c20556f = new C20556f(str);
            if (!AbstractC23254w8.m119859g(str) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(c20556f.m106838k()))) {
                z11 = true;
            } else {
                z11 = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (z11) {
                ZJXLDecoder.Options options2 = new ZJXLDecoder.Options();
                options2.f88636a = true;
                double m92545e = ZJXLDecoder.m92545e(str, options2);
                int m92544d = ZJXLDecoder.m92544d(m92545e);
                if (m92544d == 0) {
                    int m92547g = ZJXLDecoder.m92547g(m92545e);
                    AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a(str + ", getInfoFromFile in : " + m92547g + " ms, width/height: " + options2.bmPreviewWidth + " / " + options2.bmPreviewHeight, new Object[0]);
                    long j11 = (long) m92547g;
                    AbstractC20887g.m109216C(16869, "", currentTimeMillis, currentTimeMillis + j11, j11);
                    options.outWidth = options2.bmPreviewWidth;
                    options.outHeight = options2.bmPreviewHeight;
                } else {
                    AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("ZJXLDecoder.getInfoFromFile fail: path=" + str + ", err=" + m92544d, new Object[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m92544d);
                    AbstractC20887g.m109241s(16869, sb2.toString(), currentTimeMillis);
                }
            } else if (Build.VERSION.SDK_INT >= 29 && !AbstractC23254w8.m119859g(str)) {
                BitmapFactory.decodeFile(str, options);
                AbstractC20110a.f98889a.m104564x("[JPEG]").mo104548a(str + ", getInfoFromFile in : " + (System.currentTimeMillis() - currentTimeMillis) + " ms, width/height: " + options.outWidth + " / " + options.outHeight, new Object[0]);
            } else {
                try {
                    ParcelFileDescriptor m106841n = c20556f.m106841n();
                    if (m106841n != null) {
                        try {
                            BitmapFactory.decodeFileDescriptor(m106841n.getFileDescriptor(), null, options);
                            AbstractC20110a.f98889a.m104564x("[JPEG]").mo104548a(str + ", getInfoFromFile in : " + (System.currentTimeMillis() - currentTimeMillis) + " ms, width/height: " + options.outWidth + " / " + options.outHeight, new Object[0]);
                        } finally {
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC2933b.m13890a(m106841n, null);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return options;
        }

        /* renamed from: b */
        public final Bitmap m18821b(String str, InputStream inputStream, BitmapFactory.Options options, int i11, int i12) {
            AbstractC19074t.m100208f(str, "inputPath");
            AbstractC19074t.m100208f(inputStream, "inputStream");
            AbstractC19074t.m100208f(options, "option");
            int i13 = options.inSampleSize;
            Bitmap createBitmap = Bitmap.createBitmap(i11 / i13, i12 / i13, Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            if (!AbstractC23254w8.m119859g(str) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(inputStream))) {
                double m92543c = ZJXLDecoder.m92543c(str, options.inSampleSize, createBitmap);
                if (ZJXLDecoder.m92544d(m92543c) == 0) {
                    int m92547g = ZJXLDecoder.m92547g(m92543c);
                    AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a(str + ", decodeImageFile in : " + m92547g + " ms", new Object[0]);
                    return createBitmap;
                }
                return createBitmap;
            }
            options.inJustDecodeBounds = false;
            if (Build.VERSION.SDK_INT >= 29 && !AbstractC23254w8.m119859g(str)) {
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                AbstractC19074t.m100207e(decodeFile, "decodeFile(...)");
                return decodeFile;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (decodeStream != null) {
                return decodeStream;
            }
            return createBitmap;
        }
    }
}
