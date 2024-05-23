package p023av;

import android.content.Context;
import fn0.AbstractC19074t;
import java.io.File;

/* renamed from: av.c */
/* loaded from: classes4.dex */
public final class C2385c implements InterfaceC2384b {
    @Override // p023av.InterfaceC2384b
    /* renamed from: a */
    public Long mo12444a(File file) {
        AbstractC19074t.m100208f(file, "folder");
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            long j11 = 0;
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j11 += file2.length();
                }
            }
            return Long.valueOf(j11);
        }
        return null;
    }

    @Override // p023av.InterfaceC2384b
    /* renamed from: b */
    public String mo12445b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        String absolutePath = context.getFilesDir().getAbsolutePath();
        AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // p023av.InterfaceC2384b
    /* renamed from: c */
    public String mo12446c(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "miniAppId");
        String mo12445b = mo12445b(context);
        char c11 = File.separatorChar;
        return mo12445b + c11 + "MiniApp" + c11 + str;
    }

    @Override // p023av.InterfaceC2384b
    /* renamed from: d */
    public String mo12447d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        String absolutePath = context.getCacheDir().getAbsolutePath();
        AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // p023av.InterfaceC2384b
    /* renamed from: e */
    public String mo12448e(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "miniAppId");
        String mo12447d = mo12447d(context);
        char c11 = File.separatorChar;
        return mo12447d + c11 + "MiniApp" + c11 + str;
    }

    @Override // p023av.InterfaceC2384b
    /* renamed from: f */
    public String mo12449f(Context context, String str, String str2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "fileName");
        AbstractC19074t.m100208f(str2, "miniAppId");
        String absolutePath = new File(mo12446c(context, str2), System.currentTimeMillis() + "_" + str).getAbsolutePath();
        AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
