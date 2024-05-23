package k00;

import android.graphics.Bitmap;
import d00.C17689c;
import fn0.AbstractC19074t;

/* renamed from: k00.a */
/* loaded from: classes4.dex */
public final class C21424a {

    /* renamed from: a */
    public static final float[] f104416a;

    /* renamed from: b */
    public static final C21424a f104417b = new C21424a();

    static {
        float[] fArr = new float[256];
        f104416a = fArr;
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            f104416a[i11] = i11 / 255.0f;
        }
    }

    private C21424a() {
    }

    /* renamed from: a */
    public final C17689c m110928a(Bitmap bitmap, boolean z11) {
        AbstractC19074t.m100208f(bitmap, "image");
        int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return new C17689c(iArr, bitmap.getWidth(), bitmap.getHeight(), z11);
    }
}
