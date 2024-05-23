package p565v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.AbstractC2253u;

/* renamed from: v2.s */
/* loaded from: classes.dex */
public abstract class AbstractC27465s {

    /* renamed from: a */
    private static final String f129198a = AbstractC2253u.m11897i("PackageManagerHelper");

    /* renamed from: a */
    private static int m140513a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    /* renamed from: b */
    private static boolean m140514b(int i11, boolean z11) {
        return i11 == 0 ? z11 : i11 == 1;
    }

    /* renamed from: c */
    public static void m140515c(Context context, Class cls, boolean z11) {
        int i11;
        String str;
        String str2 = "disabled";
        try {
            if (z11 == m140514b(m140513a(context, cls.getName()), false)) {
                AbstractC2253u.m11895e().mo11898a(f129198a, "Skipping component enablement for " + cls.getName());
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z11) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i11, 1);
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            String str3 = f129198a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            if (!z11) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            sb2.append(str);
            m11895e.mo11898a(str3, sb2.toString());
        } catch (Exception e11) {
            AbstractC2253u m11895e2 = AbstractC2253u.m11895e();
            String str4 = f129198a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (z11) {
                str2 = "enabled";
            }
            sb3.append(str2);
            m11895e2.mo11899b(str4, sb3.toString(), e11);
        }
    }
}
