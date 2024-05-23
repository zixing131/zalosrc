package wi0;

import android.net.Uri;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.io.File;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;

/* renamed from: wi0.a */
/* loaded from: classes.dex */
public final class C29051a {

    /* renamed from: a */
    public static final C29051a f134591a = new C29051a();

    private C29051a() {
    }

    /* renamed from: b */
    private final void m145081b(String str) {
        File[] listFiles;
        if (str != null && str.length() != 0) {
            try {
                File file = new File(str);
                if (file.exists() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        AbstractC23041d2.m118207f(file2);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: c */
    private final String m145082c(boolean z11) {
        try {
            File externalFilesDir = CoreUtility.getAppContext().getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return "";
            }
            if (!externalFilesDir.exists() && z11) {
                externalFilesDir.mkdirs();
            }
            String absolutePath = externalFilesDir.getAbsolutePath();
            if (absolutePath == null) {
                return "";
            }
            return absolutePath;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: d */
    private final String m145083d(boolean z11) {
        try {
            File filesDir = CoreUtility.getAppContext().getFilesDir();
            if (filesDir == null) {
                return "";
            }
            if (!filesDir.exists() && z11) {
                filesDir.mkdirs();
            }
            String absolutePath = filesDir.getAbsolutePath();
            if (absolutePath == null) {
                return "";
            }
            return absolutePath;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: e */
    private final File m145084e() {
        try {
            String m145082c = m145082c(true);
            if (m145082c.length() > 0) {
                File file = new File(m145082c);
                if (file.canWrite()) {
                    return file;
                }
                C29052b.m145093e("getSemiCacheDir(): External Storage is not writable. (Path=" + m145082c + ')');
            }
            String m145083d = m145083d(true);
            if (m145083d.length() > 0) {
                C29052b.m145093e("getSemiCacheDir(): Fallback to Internal Storage. (Path=" + m145083d + ')');
                return new File(m145083d);
            }
            C29052b.m145093e("getSemiCacheDir(): WTF?");
            return new File("");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return new File("");
        }
    }

    /* renamed from: a */
    public final void m145085a() {
        m145081b(m145086f());
    }

    /* renamed from: f */
    public final String m145086f() {
        try {
            String path = m145088h().getPath();
            AbstractC19074t.m100205c(path);
            AbstractC19074t.m100207e(path, "{\n            getSemiCacheUri().path!!\n        }");
            return path;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: g */
    public final String m145087g() {
        return "zalo/semicache";
    }

    /* renamed from: h */
    public final Uri m145088h() {
        Uri build = Uri.fromFile(m145084e()).buildUpon().appendPath("zalo").appendPath("semicache").build();
        AbstractC19074t.m100207e(build, "fromFile(dir)\n            .buildUpon()\n            .appendPath(PATH_ZALO)\n            .appendPath(PATH_SEMI_CACHE)\n            .build()");
        return build;
    }
}
