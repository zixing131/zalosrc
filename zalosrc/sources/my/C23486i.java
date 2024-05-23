package my;

import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19074t;

/* renamed from: my.i */
/* loaded from: classes4.dex */
public final class C23486i extends AbstractC23487j {

    /* renamed from: b */
    private final byte[] f114027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23486i(Result.Success success, byte[] bArr) {
        super(success, null);
        AbstractC19074t.m100208f(success, "qrCode");
        AbstractC19074t.m100208f(bArr, "frames");
        this.f114027b = bArr;
    }

    /* renamed from: b */
    public final byte[] m123278b() {
        return this.f114027b;
    }
}
