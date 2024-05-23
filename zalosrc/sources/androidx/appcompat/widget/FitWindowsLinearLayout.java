package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: p */
    private InterfaceC1151a1 f4323p;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC1151a1 interfaceC1151a1 = this.f4323p;
        if (interfaceC1151a1 != null) {
            interfaceC1151a1.m5457a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC1151a1 interfaceC1151a1) {
    }
}
