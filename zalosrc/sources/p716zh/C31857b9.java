package p716zh;

import android.graphics.Bitmap;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.utils.ToastUtils;
import java.io.File;
import java.io.FileOutputStream;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;

/* renamed from: zh.b9 */
/* loaded from: classes3.dex */
public class C31857b9 implements InterfaceC31872c9 {

    /* renamed from: a */
    private final String f146281a;

    /* renamed from: b */
    private Bitmap f146282b;

    /* renamed from: c */
    private final boolean f146283c;

    public C31857b9(String str, Bitmap bitmap, boolean z11) {
        this.f146281a = str;
        this.f146282b = bitmap;
        this.f146283c = z11;
    }

    @Override // p716zh.InterfaceC31872c9
    /* renamed from: a */
    public void mo153143a() {
        if (AbstractC23238v2.m119727l()) {
            if (this.f146282b != null && !this.f146281a.equals("")) {
                File file = new File(this.f146281a);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        this.f146282b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        if (this.f146283c && !this.f146282b.isRecycled()) {
                            this.f146282b.recycle();
                            this.f146282b = null;
                        }
                        if (AbstractC23041d2.m118194A(this.f146281a) && !AbstractC23258x2.m119957p(file, true)) {
                            AbstractC23041d2.m118208g(this.f146281a);
                        }
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    if (AbstractC23041d2.m118194A(this.f146281a)) {
                        AbstractC23041d2.m118208g(this.f146281a);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
    }
}
