package me0;

import am.AbstractC0924m0;
import android.graphics.Bitmap;
import bn0.AbstractC2933b;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hu.AbstractC20130d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import p173fz.C19172a;
import p239ih.C20556f;
import p348mi.AbstractC23309i;
import p559uv.C27373c;

/* renamed from: me0.g6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23078g6 {
    public static final a Companion = new a(null);

    /* renamed from: me0.g6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m118386a(String str) {
            AbstractC19074t.m100208f(str, "path");
            String m118216o = AbstractC23041d2.m118216o(str);
            AbstractC19074t.m100207e(m118216o, "getExtension(...)");
            File m118218q = AbstractC23041d2.m118218q(str);
            if (m118218q != null && m118218q.exists()) {
                if (m118391f(m118216o) || (m118216o.length() == 0 && m118392g(str))) {
                    return m118387b(m118218q, "", str);
                }
                return str;
            }
            return str;
        }

        /* renamed from: b */
        public final String m118387b(File file, String str, String str2) {
            AbstractC19074t.m100208f(str, "outputPathExpect");
            AbstractC19074t.m100208f(str2, "fallbackPath");
            if (file != null && file.exists() && AbstractC23078g6.Companion.m118392g(file.getPath())) {
                if (str.length() == 0) {
                    str = AbstractC20130d.m104848O0() + "zalo_" + System.nanoTime() + ".jpg";
                }
                File file2 = new File(str);
                FileInputStream fileInputStream = null;
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            ZJXLDecoder.Options options = new ZJXLDecoder.Options();
                            options.f88636a = true;
                            if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(file.getPath(), options)) == 0) {
                                Bitmap createBitmap = Bitmap.createBitmap(options.bmPreviewWidth, options.bmPreviewHeight, Bitmap.Config.ARGB_8888);
                                AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
                                if (ZJXLDecoder.m92544d(ZJXLDecoder.m92543c(file.getPath(), 1, createBitmap)) == 0) {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                        AbstractC2933b.m13890a(fileOutputStream, null);
                                    } finally {
                                    }
                                }
                            }
                            fileInputStream2.close();
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            String absolutePath = file2.getAbsolutePath();
                            AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                            return absolutePath;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    String absolutePath2 = file2.getAbsolutePath();
                    AbstractC19074t.m100207e(absolutePath2, "getAbsolutePath(...)");
                    return absolutePath2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                return str2;
            }
        }

        /* renamed from: c */
        public final byte[] m118388c(String str) {
            ZJXLDecoder.Options options = new ZJXLDecoder.Options();
            options.f88636a = true;
            if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(str, options)) != 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(options.bmPreviewWidth, options.bmPreviewHeight, Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            if (ZJXLDecoder.m92544d(ZJXLDecoder.m92543c(str, 1, createBitmap)) != 0) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* renamed from: d */
        public final InputStream m118389d(byte[] bArr) {
            if (bArr != null) {
                return new ByteArrayInputStream(bArr);
            }
            return null;
        }

        /* renamed from: e */
        public final boolean m118390e(List list) {
            AbstractC19074t.m100208f(list, "selectedList");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((MediaItem) it.next()) instanceof VideoItem) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m118391f(String str) {
            AbstractC19074t.m100208f(str, "extension");
            return AbstractC19074t.m100204b(str, "jxl");
        }

        /* renamed from: g */
        public final boolean m118392g(String str) {
            if (!AbstractC23254w8.m119859g(str) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(new C20556f(str).m106838k()))) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final boolean m118393h() {
            if (AbstractC23309i.m122504vg() && AbstractC23309i.m121048If()) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public final boolean m118394i(C27373c c27373c) {
            VideoBlendingParam videoBlendingParam;
            if (c27373c == null || (videoBlendingParam = c27373c.f128947T) == null || videoBlendingParam.f48274Z.m40335i() < 720.0f) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final boolean m118395j() {
            if (C19172a.m100600k("chat@video@showHdOnboardEnable", 0) != 1 || AbstractC0924m0.m3252Mc()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final String m118383a(String str) {
        return Companion.m118386a(str);
    }

    /* renamed from: b */
    public static final String m118384b(File file, String str, String str2) {
        return Companion.m118387b(file, str, str2);
    }

    /* renamed from: c */
    public static final boolean m118385c(String str) {
        return Companion.m118392g(str);
    }
}
