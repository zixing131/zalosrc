package mm0;

import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;

/* renamed from: mm0.f */
/* loaded from: classes.dex */
public abstract class AbstractC23351f {
    /* renamed from: a */
    public static boolean m122784a(String str, boolean z11) {
        String str2;
        if (z11) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UserUid: ");
                sb2.append(CoreUtility.f89233i);
                sb2.append(" - ");
                sb2.append(CoreUtility.f89234j);
                sb2.append("\t");
                sb2.append(AbstractC20626a.m107390f());
                sb2.append("\t");
                sb2.append(AbstractC23349d.m122765c(System.currentTimeMillis()));
                sb2.append("\t");
                if (CoreUtility.f89235k.get()) {
                    str2 = "B";
                } else {
                    str2 = "F";
                }
                sb2.append(str2);
                sb2.append("\t");
                sb2.append(str);
                str = sb2.toString();
            } catch (Exception e11) {
                e11.getMessage();
                return false;
            }
        }
        AbstractC20110a.m104543l("LogConnection");
        AbstractC20110a.m104542k(10, str, new Object[0]);
        return true;
    }
}
