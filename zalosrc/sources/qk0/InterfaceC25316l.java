package qk0;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import nk0.AbstractC23825g0;
import nk0.InterfaceC23860v;
import qk0.InterfaceC25307c;
import uk0.C27291e;

/* renamed from: qk0.l */
/* loaded from: classes7.dex */
public interface InterfaceC25316l {
    /* renamed from: a */
    void mo91510a(Drawable drawable, Runnable runnable);

    /* renamed from: b */
    void mo91511b(Drawable drawable, Runnable runnable, long j11);

    View getView();

    Rect getVisibleRect();

    InterfaceC23860v getZinstantHandler();

    void invalidate();

    /* renamed from: o */
    void mo91516o(AbstractC23825g0 abstractC23825g0, InterfaceC25307c.a aVar);

    void postInvalidate();

    void requestLayout();

    /* renamed from: t */
    boolean mo91518t(C27291e c27291e);
}
