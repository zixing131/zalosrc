package my;

import android.graphics.Bitmap;
import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19074t;

/* renamed from: my.h */
/* loaded from: classes4.dex */
public final class C23485h extends AbstractC23487j {

    /* renamed from: b */
    private final Bitmap f114026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23485h(Result.Success success, Bitmap bitmap) {
        super(success, null);
        AbstractC19074t.m100208f(success, "qrCode");
        AbstractC19074t.m100208f(bitmap, "bitmap");
        this.f114026b = bitmap;
    }
}
