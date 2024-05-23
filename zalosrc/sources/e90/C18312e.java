package e90;

import android.graphics.Bitmap;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: e90.e */
/* loaded from: classes6.dex */
public final class C18312e {

    /* renamed from: a */
    private final String f92607a;

    /* renamed from: b */
    private final Bitmap f92608b;

    /* renamed from: c */
    private final int[] f92609c;

    /* renamed from: d */
    private final Float f92610d;

    /* renamed from: e */
    private final Integer f92611e;

    public C18312e(String str, Bitmap bitmap, int[] iArr, Float f11, Integer num) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(iArr, "samplingAreas");
        this.f92607a = str;
        this.f92608b = bitmap;
        this.f92609c = iArr;
        this.f92610d = f11;
        this.f92611e = num;
    }

    /* renamed from: a */
    public final Bitmap m97237a() {
        return this.f92608b;
    }

    /* renamed from: b */
    public final int[] m97238b() {
        return this.f92609c;
    }

    /* renamed from: c */
    public final Float m97239c() {
        return this.f92610d;
    }

    /* renamed from: d */
    public final Integer m97240d() {
        return this.f92611e;
    }

    /* renamed from: e */
    public final String m97241e() {
        return this.f92607a;
    }

    public /* synthetic */ C18312e(String str, Bitmap bitmap, int[] iArr, Float f11, Integer num, int i11, AbstractC19060k abstractC19060k) {
        this(str, bitmap, (i11 & 4) != 0 ? new int[]{0} : iArr, (i11 & 8) != 0 ? null : f11, (i11 & 16) != 0 ? null : num);
    }
}
