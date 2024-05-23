package ge0;

import android.graphics.Bitmap;
import hu.C20131e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p239ih.C20556f;
import sh0.C26253e;

/* renamed from: ge0.c */
/* loaded from: classes4.dex */
public abstract class AbstractC19430c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m101580b(String str) {
        String str2;
        String str3 = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            String m106835h = new C20556f(str).m106835h();
            String m104945c = C20131e.f99303a.m104945c();
            if (m106835h != null) {
                str2 = AbstractC24341v.m127114D(m106835h, "gif", "png", false, 4, null);
            } else {
                str2 = null;
            }
            str3 = m104945c + str2;
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
            Bitmap mo88377d = new C26253e(str3, fileInputStream, 0, 4, null).mo88377d(0);
            if (mo88377d != null) {
                mo88377d.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return str3;
    }
}
