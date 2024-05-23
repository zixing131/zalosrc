package au;

import android.content.Context;
import android.net.Uri;
import com.zing.zalocore.CoreUtility;
import java.io.File;
import me0.AbstractC23254w8;
import p239ih.C20556f;
import p412p1.AbstractC24595a;

/* renamed from: au.t0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2374t0 {
    /* renamed from: a */
    public static void m12414a(Context context, C20556f c20556f) {
        Uri parse;
        if (c20556f.m106830b()) {
            if (!AbstractC23254w8.m119859g(c20556f.m106842o())) {
                File file = new File(c20556f.m106842o());
                parse = Uri.fromFile(file);
                file.delete();
            } else {
                parse = Uri.parse(c20556f.m106842o());
                AbstractC24595a m128084b = AbstractC24595a.m128084b(CoreUtility.getAppContext(), parse);
                if (m128084b != null) {
                    m128084b.mo128085a();
                }
            }
            context.getContentResolver().notifyChange(parse, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Deleted temp photo file: ");
            sb2.append(c20556f);
        }
    }
}
