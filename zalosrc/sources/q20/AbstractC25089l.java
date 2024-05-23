package q20;

import android.graphics.Bitmap;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: q20.l */
/* loaded from: classes5.dex */
public abstract class AbstractC25089l {
    public static final a Companion = new a(null);

    /* renamed from: q20.l$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final File m130044c(String str) {
            File externalFilesDir = CoreUtility.getAppContext().getExternalFilesDir(str);
            if (externalFilesDir == null) {
                externalFilesDir = new File(CoreUtility.getAppContext().getFilesDir(), str);
                if (!externalFilesDir.exists()) {
                    externalFilesDir.mkdir();
                }
            }
            return externalFilesDir;
        }

        /* renamed from: a */
        public final String m130045a() {
            return m130044c("crop").getAbsolutePath() + "/cropped_" + m130047d() + ".jpg";
        }

        /* renamed from: b */
        public final void m130046b(String... strArr) {
            File[] listFiles;
            AbstractC19074t.m100208f(strArr, "directoryPaths");
            for (String str : strArr) {
                if (str != null) {
                    File file = new File(str);
                    if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        AbstractC19074t.m100205c(listFiles);
                        for (File file2 : listFiles) {
                            AbstractC25089l.Companion.m130046b(file2.getAbsolutePath());
                        }
                    }
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: d */
        public final String m130047d() {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        /* renamed from: e */
        public final boolean m130048e(File file, Bitmap bitmap) {
            AbstractC19074t.m100208f(file, "destination");
            AbstractC19074t.m100208f(bitmap, "bitmap");
            try {
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }
}
