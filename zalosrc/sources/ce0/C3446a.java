package ce0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import bn0.AbstractC2933b;
import com.zing.zalo.SensitiveData;
import fn0.AbstractC19074t;
import java.io.InputStream;
import me0.AbstractC23280z4;
import p239ih.C20556f;
import pm0.C24848g0;
import th.AbstractC26689j;

/* renamed from: ce0.a */
/* loaded from: classes4.dex */
public final class C3446a extends C3449d {
    @Override // ce0.C3449d
    /* renamed from: f */
    protected String mo17344f(String str, String str2, SensitiveData sensitiveData) {
        String str3;
        AbstractC19074t.m100208f(str, "sourcePath");
        AbstractC19074t.m100208f(str2, "outFileName");
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        InputStream m106838k = new C20556f(str).m106838k();
        if (m106838k == null) {
            return null;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(m106838k);
            if (decodeStream != null) {
                AbstractC19074t.m100205c(decodeStream);
                Bitmap createBitmap = Bitmap.createBitmap(decodeStream.getWidth(), decodeStream.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(-1);
                AbstractC19074t.m100207e(createBitmap, "apply(...)");
                new Canvas(createBitmap).drawBitmap(decodeStream, 0.0f, 0.0f, (Paint) null);
                decodeStream.recycle();
                str3 = AbstractC23280z4.m120302N(createBitmap, Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), sensitiveData);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                str3 = null;
            }
            AbstractC2933b.m13890a(m106838k, null);
            return str3;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(m106838k, th2);
                throw th3;
            }
        }
    }
}
