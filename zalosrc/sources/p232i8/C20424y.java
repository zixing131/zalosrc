package p232i8;

import android.content.Context;

/* renamed from: i8.y */
/* loaded from: classes.dex */
class C20424y {

    /* renamed from: a */
    private String f100592a;

    /* renamed from: b */
    private static String m106433b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m106434a(Context context) {
        String str;
        try {
            if (this.f100592a == null) {
                this.f100592a = m106433b(context);
            }
            if ("".equals(this.f100592a)) {
                str = null;
            } else {
                str = this.f100592a;
            }
        } finally {
        }
        return str;
    }
}
