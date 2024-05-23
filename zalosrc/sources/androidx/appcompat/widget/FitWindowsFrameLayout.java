package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: p */
    private InterfaceC1151a1 f4322p;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC1151a1 interfaceC1151a1 = this.f4322p;
        if (interfaceC1151a1 != null) {
            interfaceC1151a1.m5457a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC1151a1 interfaceC1151a1) {
    }
}
