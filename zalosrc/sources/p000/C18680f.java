package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import fn0.AbstractC19074t;

/* renamed from: f */
/* loaded from: classes2.dex */
public final class C18680f extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ int f93900a;

    public C18680f(int i11) {
        this.f93900a = i11;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(outline, "outline");
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f93900a);
    }
}
