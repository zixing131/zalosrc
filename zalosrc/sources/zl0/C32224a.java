package zl0;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* renamed from: zl0.a */
/* loaded from: classes7.dex */
public class C32224a {

    /* renamed from: a */
    private final Properties f148625a;

    private C32224a() {
        FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        try {
            Properties properties = new Properties();
            this.f148625a = properties;
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public static C32224a m155398c() {
        return new C32224a();
    }

    /* renamed from: a */
    public String m155399a(String str) {
        return this.f148625a.getProperty(str);
    }

    /* renamed from: b */
    public String m155400b(String str, String str2) {
        return this.f148625a.getProperty(str, str2);
    }
}
