package p320ld;

import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import me0.AbstractC23034c6;

/* renamed from: ld.m */
/* loaded from: classes3.dex */
public final class C22441m {

    /* renamed from: a */
    public static final C22441m f109793a = new C22441m();

    private C22441m() {
    }

    /* renamed from: a */
    public static final boolean m115982a(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        return AbstractC23034c6.m118116D(zaloView.m92686rK(), AbstractC23034c6.f112032i);
    }

    /* renamed from: b */
    public static final void m115983b(ZaloView zaloView, int i11) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        if (zaloView.m92648SI() instanceof ZaloActivity) {
            AbstractC23034c6.m118186w0(zaloView.m92692wK(), AbstractC23034c6.f112032i, i11);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m115984c(ZaloView zaloView, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 150;
        }
        m115983b(zaloView, i11);
    }
}
