package me0;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import p111du.AbstractC18070b;
import p239ih.C20556f;
import p348mi.C23307g;

/* renamed from: me0.f6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23067f6 {

    /* renamed from: a */
    private static final AbstractC18070b f112104a = new a(2);

    /* renamed from: me0.f6$a */
    /* loaded from: classes4.dex */
    class a extends AbstractC18070b {
        a(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f */
        public SimpleDateFormat mo15431d() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: g */
        public void mo96100e(SimpleDateFormat simpleDateFormat) {
            AbstractC23160o0.m119268l1(simpleDateFormat);
        }
    }

    /* renamed from: a */
    public static C23307g m118367a(String str) {
        return m118368b(str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114 A[Catch: all -> 0x00f1, Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:34:0x00e9, B:35:0x0105, B:36:0x010b, B:67:0x00ff, B:69:0x0114, B:73:0x0124, B:74:0x0131), top: B:26:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.core.util.h, du.b] */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.core.util.h, du.b] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.core.util.h, du.b] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.text.SimpleDateFormat, java.lang.Object, java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C23307g m118368b(String str, boolean z11) {
        Throwable th2;
        C20556f c20556f;
        boolean z12;
        BitmapFactory.Options options;
        ?? r92;
        float[] fArr;
        long j11;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        InputStream inputStream;
        InputStream inputStream2;
        Date date;
        InputStream inputStream3 = null;
        try {
            try {
                c20556f = new C20556f(str);
                if (!AbstractC23254w8.m119859g(str) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(c20556f.m106838k()))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                options = new BitmapFactory.Options();
                if (z12) {
                    ZJXLDecoder.Options options2 = new ZJXLDecoder.Options();
                    options2.f88636a = true;
                    if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(str, options2)) == 0) {
                        options.outWidth = options2.bmPreviewWidth;
                        options.outHeight = options2.bmPreviewHeight;
                    }
                } else {
                    options.inJustDecodeBounds = true;
                    InputStream m106838k = c20556f.m106838k();
                    try {
                        BitmapFactory.decodeStream(m106838k, null, options);
                        inputStream3 = m106838k;
                    } catch (Exception e11) {
                        e = e11;
                        inputStream3 = m106838k;
                        e.printStackTrace();
                        if (inputStream3 != null) {
                        }
                        return new C23307g(0, 0);
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream3 = m106838k;
                        if (inputStream3 != null) {
                        }
                    }
                }
                try {
                    fArr = new float[]{0.0f, 0.0f};
                } catch (Exception e12) {
                    e = e12;
                    r92 = inputStream3;
                } catch (Throwable th4) {
                    th = th4;
                    r92 = inputStream3;
                }
            } catch (Exception e13) {
                e = e13;
            }
            try {
                try {
                    String str2 = "";
                    ?? r02 = f112104a;
                    r92 = (SimpleDateFormat) r02.mo7484b();
                    long j12 = 0;
                    try {
                        if (z11) {
                            try {
                                C23257x1 m106833e = c20556f.m106833e();
                                if (m106833e == null) {
                                    C23307g c23307g = new C23307g(0, 0);
                                    r02.mo7483a(r92);
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (Exception e14) {
                                            AbstractC20110a.m104539h(e14);
                                        }
                                    }
                                    return c23307g;
                                }
                                i11 = m106833e.m119907h("Orientation", 1);
                                try {
                                    m106833e.m119908l(fArr);
                                    String m119906g = m106833e.m119906g("DateTime");
                                    if (m119906g != null) {
                                        Date parse = r92.parse(m119906g);
                                        Objects.requireNonNull(parse);
                                        j11 = parse.getTime();
                                    } else {
                                        j11 = 0;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    j11 = 0;
                                }
                                try {
                                    if (!TextUtils.isEmpty(m106833e.m119906g("Make"))) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    AbstractC20110a.m104539h(e);
                                    f112104a.mo7483a(r92);
                                    z13 = false;
                                    try {
                                        if (!c20556f.m106844q()) {
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        r92 = inputStream3;
                                    }
                                    String str3 = str2;
                                    long j13 = j12;
                                    long j14 = j11;
                                    if (i11 == 6) {
                                    }
                                    i12 = options.outHeight;
                                    i13 = options.outWidth;
                                    C23307g c23307g2 = new C23307g(i12, i13, fArr[0], fArr[1], j14, str3, j13, z13);
                                    if (r92 != 0) {
                                    }
                                    return c23307g2;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                j11 = 0;
                                i11 = 1;
                            }
                        } else {
                            j11 = 0;
                            z14 = false;
                            i11 = 1;
                        }
                        r02.mo7483a(r92);
                        z13 = z14;
                        try {
                            try {
                                if (!c20556f.m106844q()) {
                                    if (j11 == 0) {
                                        if (c20556f.m106832d() != -1) {
                                            inputStream2 = inputStream3;
                                            date = new Date(c20556f.m106832d());
                                        } else {
                                            inputStream2 = inputStream3;
                                            date = new Date();
                                        }
                                        j11 = date.getTime();
                                        inputStream = inputStream2;
                                    } else {
                                        inputStream = inputStream3;
                                    }
                                    str2 = c20556f.m106835h();
                                    j12 = c20556f.m106845r();
                                    r92 = inputStream;
                                } else {
                                    InputStream inputStream4 = inputStream3;
                                    File file = new File(str);
                                    r92 = inputStream4;
                                    if (file.exists()) {
                                        if (j11 == 0) {
                                            j11 = new Date(file.lastModified()).getTime();
                                        }
                                        str2 = AbstractC23041d2.m118199F(file.getName());
                                        j12 = file.length();
                                        r92 = inputStream4;
                                    }
                                }
                            } catch (Exception e19) {
                                e = e19;
                                r92 = r92;
                                try {
                                    AbstractC20110a.m104539h(e);
                                    r92 = r92;
                                    String str32 = str2;
                                    long j132 = j12;
                                    long j142 = j11;
                                    if (i11 == 6) {
                                    }
                                    i12 = options.outHeight;
                                    i13 = options.outWidth;
                                    C23307g c23307g22 = new C23307g(i12, i13, fArr[0], fArr[1], j142, str32, j132, z13);
                                    if (r92 != 0) {
                                    }
                                    return c23307g22;
                                } catch (Exception e21) {
                                    e = e21;
                                    inputStream3 = r92;
                                    e.printStackTrace();
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (Exception e22) {
                                            AbstractC20110a.m104539h(e22);
                                        }
                                    }
                                    return new C23307g(0, 0);
                                }
                            }
                            String str322 = str2;
                            long j1322 = j12;
                            long j1422 = j11;
                            if (i11 == 6 && i11 != 8) {
                                i12 = options.outWidth;
                                i13 = options.outHeight;
                            } else {
                                i12 = options.outHeight;
                                i13 = options.outWidth;
                            }
                            C23307g c23307g222 = new C23307g(i12, i13, fArr[0], fArr[1], j1422, str322, j1322, z13);
                            if (r92 != 0) {
                                try {
                                    r92.close();
                                } catch (Exception e23) {
                                    AbstractC20110a.m104539h(e23);
                                }
                            }
                            return c23307g222;
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            inputStream3 = r92;
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                    throw th2;
                                } catch (Exception e24) {
                                    AbstractC20110a.m104539h(e24);
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        f112104a.mo7483a(r92);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th2 = th;
                    if (inputStream3 != null) {
                    }
                }
            } catch (Exception e25) {
                e = e25;
                e.printStackTrace();
                if (inputStream3 != null) {
                }
                return new C23307g(0, 0);
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
