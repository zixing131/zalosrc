package lf0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23009a3;
import me0.AbstractC23238v2;
import org.json.JSONArray;
import p023av.EnumC2383a;
import qm0.AbstractC25332a0;

/* renamed from: lf0.c */
/* loaded from: classes5.dex */
public final class C22473c {

    /* renamed from: a */
    private final C22472b f109913a;

    /* renamed from: b */
    private final String f109914b;

    public C22473c(C22472b c22472b) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        this.f109913a = c22472b;
        this.f109914b = C22473c.class.getSimpleName();
    }

    /* renamed from: a */
    private final boolean m116205a(C22472b c22472b, File file, EnumC2383a enumC2383a) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (Math.max(options.outHeight, options.outWidth) >= enumC2383a.m12442e()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m116206b(Bitmap bitmap, int i11, OutputStream outputStream) {
        return bitmap.compress(Bitmap.CompressFormat.JPEG, i11, outputStream);
    }

    /* renamed from: e */
    private final String m116207e(C22472b c22472b, File file, File file2, EnumC2383a enumC2383a) {
        if (enumC2383a.m12440c() != EnumC2383a.f9952s.m12440c() && m116208g(c22472b, file, file2, enumC2383a)) {
            return file2.getAbsolutePath();
        }
        if (AbstractC23238v2.m119718c(file, file2)) {
            return file2.getAbsolutePath();
        }
        c22472b.m116198y(this.f109914b + ": handleMoveMedia: Cannot move file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        return null;
    }

    /* renamed from: g */
    private final boolean m116208g(C22472b c22472b, File file, File file2, EnumC2383a enumC2383a) {
        Bitmap bitmap;
        boolean z11 = false;
        if (!AbstractC19074t.m100204b(URLConnection.guessContentTypeFromName(file.getName()), "image/jpeg")) {
            return false;
        }
        c22472b.m116199z(this.f109914b + ": performCompressLevel: compress quality: " + enumC2383a.m12441d());
        boolean m116205a = m116205a(c22472b, file, enumC2383a);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        if (m116205a) {
            bitmap = AbstractC23009a3.m117968s(file.getAbsolutePath(), enumC2383a.m12442e(), enumC2383a.m12442e());
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            c22472b.m116199z(this.f109914b + ": performCompressLevel: the image is not resized");
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            AbstractC19074t.m100205c(decodeFile);
            if (m116206b(decodeFile, enumC2383a.m12441d(), fileOutputStream)) {
                decodeFile.recycle();
                z11 = true;
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            return z11;
        }
        if (m116206b(bitmap, enumC2383a.m12441d(), fileOutputStream)) {
            bitmap.recycle();
            z11 = true;
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        return z11;
    }

    /* renamed from: c */
    public final InputStream m116209c(String str) {
        AbstractC19074t.m100208f(str, "maSchemeFilesPath");
        File file = new File(AbstractC22474d.m116216d(str, this.f109913a.m116195t()));
        if (file.exists()) {
            return new FileInputStream(file);
        }
        this.f109913a.m116196u(-302, "File does not exist");
        this.f109913a.m116198y(this.f109914b + ": getMASchemeFilePathInputStream: " + str + " does not exist ");
        return null;
    }

    /* renamed from: d */
    public final String m116210d(String str) {
        AbstractC19074t.m100208f(str, "maSchemeFilesPath");
        File file = new File(AbstractC22474d.m116216d(str, this.f109913a.m116195t()));
        if (file.exists()) {
            return URLConnection.guessContentTypeFromName(file.getName());
        }
        this.f109913a.m116196u(-302, "File does not exist");
        this.f109913a.m116198y(this.f109914b + ": getMaSchemeFilePathMimeType: file path " + str + " does not exist");
        return null;
    }

    /* renamed from: f */
    public final List m116211f(C22472b c22472b, String str, JSONArray jSONArray, EnumC2383a enumC2383a) {
        List m131185M0;
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(str, "maCacheFolderPath");
        AbstractC19074t.m100208f(jSONArray, "mediaCachePaths");
        AbstractC19074t.m100208f(enumC2383a, "compressLevel");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            Object obj = jSONArray.get(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            File file = new File(str2);
            if (file.exists()) {
                String m116207e = m116207e(c22472b, file, new File(str, file.getName()), enumC2383a);
                if (m116207e != null) {
                    arrayList.add(m116207e);
                }
            } else {
                c22472b.m116196u(-302, "File does not exist");
                c22472b.m116198y(this.f109914b + ": moveMediaPickerCacheFilesToMaCacheFolder: file " + str2 + " does not exist");
            }
        }
        m131185M0 = AbstractC25332a0.m131185M0(arrayList);
        return m131185M0;
    }

    /* renamed from: h */
    public final void m116212h(File file) {
        File[] listFiles;
        AbstractC19074t.m100208f(file, "folder");
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    AbstractC19074t.m100205c(file2);
                    m116212h(file2);
                }
            }
            file.delete();
            return;
        }
        this.f109913a.m116198y(this.f109914b + ": " + file.getAbsolutePath() + " does not exist or is not a directory");
    }
}
