package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import fn0.AbstractC19074t;

/* renamed from: b0 */
/* loaded from: classes2.dex */
public final class C2474b0 extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ float f10083a;

    public C2474b0(float f11) {
        this.f10083a = f11;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(outline, "outline");
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f10083a);
    }
}
