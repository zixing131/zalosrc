package bj;

import com.zing.zalo.MainApplication;
import ho0.AbstractC20110a;
import java.io.File;

/* renamed from: bj.c */
/* loaded from: classes3.dex */
public abstract class AbstractC2819c {
    /* renamed from: a */
    public static String m13619a(String str) {
        return String.format("extra_chat_db_%s", str);
    }

    /* renamed from: b */
    public static boolean m13620b(String str) {
        try {
            String m13619a = m13619a(str);
            File databasePath = MainApplication.getAppContext().getDatabasePath(m13619a);
            if (databasePath != null && databasePath.exists()) {
                MainApplication.getAppContext().deleteDatabase(m13619a);
                return true;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104540i(e11, "[ZDB]", new Object[0]);
            return false;
        }
    }
}
