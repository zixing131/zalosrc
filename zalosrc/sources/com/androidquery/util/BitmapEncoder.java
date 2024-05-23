package com.androidquery.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bn0.AbstractC2933b;
import com.zing.zalo.utils.Keep;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p173fz.C19172a;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import pm0.C24848g0;

@Keep
/* loaded from: classes2.dex */
public final class BitmapEncoder {

    /* renamed from: e */
    public static final C3967a f15688e = new C3967a(null);

    /* renamed from: a */
    private byte[] f15689a;

    /* renamed from: b */
    private Bitmap f15690b;

    @Keep
    private Bitmap bitmap;

    /* renamed from: c */
    private int f15691c = 100;

    /* renamed from: d */
    private Bitmap.CompressFormat f15692d = Bitmap.CompressFormat.JPEG;

    @Keep
    private byte[] jpegEncodeData;

    /* renamed from: com.androidquery.util.BitmapEncoder$a */
    /* loaded from: classes2.dex */
    public static final class C3967a {
        private C3967a() {
        }

        public /* synthetic */ C3967a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m18738a() {
            if (C19172a.m100600k("jxl_social@feed@uploadjxl", 0) != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final boolean m18739b() {
            if (C19172a.m100600k("jxl_social@story@uploadjxl", 0) != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m18740c() {
            if (C19172a.m100600k("jxl_chat@enable_upload", 0) <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m18741d() {
            if (C19172a.m100600k("jxl_chat@upload_e2ee", 0) <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final void m18742e(long j11, long j12, long j13, int i11, boolean z11) {
            int i12;
            if (z11) {
                i12 = 16891;
            } else {
                i12 = 16892;
            }
            if (i11 == 0) {
                AbstractC20887g.m109247y(i12, j11, j12, j13);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            AbstractC20887g.m109241s(i12, sb2.toString(), j11);
        }

        /* renamed from: f */
        public final void m18743f(long j11, long j12, long j13, int i11, int i12) {
            if (i11 == 0) {
                AbstractC20887g.m109247y(i12, j11, j12, j13);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            AbstractC20887g.m109241s(i12, sb2.toString(), j11);
        }
    }

    /* renamed from: a */
    public final byte[] m18734a() {
        return this.f15689a;
    }

    /* renamed from: b */
    public final void m18735b(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    /* renamed from: c */
    public final void m18736c(Bitmap.CompressFormat compressFormat) {
        AbstractC19074t.m100208f(compressFormat, "<set-?>");
        this.f15692d = compressFormat;
    }

    /* renamed from: d */
    public final void m18737d(int i11) {
        this.f15691c = i11;
    }

    @Keep
    public final int decodeImagePath(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "path");
        if (this.bitmap == null) {
            C20556f c20556f = new C20556f(str);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            InputStream m106838k = c20556f.m106838k();
            if (m106838k != null) {
                this.bitmap = BitmapFactory.decodeStream(m106838k, null, options);
                AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("path = " + str + ", encodeJXL ... BitmapFactory.decodeStream ... " + this.bitmap, new Object[0]);
            }
        }
        if (this.bitmap != null) {
            return 0;
        }
        return -1;
    }

    @Keep
    public final int decodeImagePathJpeg(String str, int i11, int i12) {
        ByteArrayOutputStream byteArrayOutputStream;
        AbstractC19074t.m100208f(str, "path");
        if (this.jpegEncodeData == null) {
            try {
                Bitmap bitmap = this.f15690b;
                if (bitmap != null) {
                    if (bitmap != null) {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            bitmap.compress(this.f15692d, this.f15691c, byteArrayOutputStream);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("inputPath = " + str + ", w = " + i11 + ", h = " + i12 + ", encodeJpgTime = " + currentTimeMillis2 + " s", new Object[0]);
                            bitmap.recycle();
                            this.jpegEncodeData = byteArrayOutputStream.toByteArray();
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            AbstractC2933b.m13890a(byteArrayOutputStream, null);
                        } finally {
                        }
                    }
                } else {
                    C20556f c20556f = new C20556f(str);
                    if (c20556f.m106830b()) {
                        InputStream m106838k = c20556f.m106838k();
                        if (m106838k != null) {
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = false;
                                Bitmap decodeStream = BitmapFactory.decodeStream(m106838k, null, options);
                                if (decodeStream != null) {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        decodeStream.compress(this.f15692d, this.f15691c, byteArrayOutputStream);
                                        decodeStream.recycle();
                                        this.jpegEncodeData = byteArrayOutputStream.toByteArray();
                                        C24848g0 c24848g02 = C24848g0.f119245a;
                                        AbstractC2933b.m13890a(byteArrayOutputStream, null);
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                                C24848g0 c24848g03 = C24848g0.f119245a;
                                AbstractC2933b.m13890a(m106838k, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } finally {
                                }
                            }
                        }
                        if (this.jpegEncodeData == null) {
                            byte[] bArr = new byte[ZVideoUtilMetadata.FF_PROFILE_H264_INTRA];
                            m106838k = c20556f.m106838k();
                            if (m106838k != null) {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        try {
                                            int read = m106838k.read(bArr, 0, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                                            if (read <= 0) {
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr, 0, read);
                                        } finally {
                                        }
                                    }
                                    this.jpegEncodeData = byteArrayOutputStream.toByteArray();
                                    C24848g0 c24848g04 = C24848g0.f119245a;
                                    AbstractC2933b.m13890a(byteArrayOutputStream, null);
                                    AbstractC2933b.m13890a(m106838k, null);
                                } catch (Throwable th22) {
                                    try {
                                        throw th22;
                                    } finally {
                                    }
                                }
                            }
                        }
                    } else {
                        AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("path = " + str + " not exist ...", new Object[0]);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("[JXL]").mo104552e(e11);
            }
        }
        if (this.jpegEncodeData != null) {
            return 0;
        }
        return -1;
    }

    @Keep
    public final int decodeImageUUID(byte[] bArr, int i11, int i12) {
        return this.bitmap != null ? 0 : -1;
    }

    @Keep
    public final int decodeImageUUIDJpeg(byte[] bArr, int i11, int i12) {
        return this.jpegEncodeData != null ? 0 : -1;
    }

    @Keep
    public final void setOutputArray(byte[] bArr) {
        this.f15689a = bArr;
    }
}
