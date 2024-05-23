package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.AbstractC1638j;
import p175g0.AbstractC19187j;

/* loaded from: classes2.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    private static final boolean f4270b = false;

    /* renamed from: a */
    private boolean f4271a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m5245a(context, attributeSet, i11, 0);
    }

    /* renamed from: a */
    private void m5245a(Context context, AttributeSet attributeSet, int i11, int i12) {
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.PopupWindow, i11, i12);
        if (m5716v.m5735s(AbstractC19187j.PopupWindow_overlapAnchor)) {
            m5246b(m5716v.m5717a(AbstractC19187j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(m5716v.m5723g(AbstractC19187j.PopupWindow_android_popupBackground));
        m5716v.m5736w();
    }

    /* renamed from: b */
    private void m5246b(boolean z11) {
        if (f4270b) {
            this.f4271a = z11;
        } else {
            AbstractC1638j.m8401a(this, z11);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12) {
        if (f4270b && this.f4271a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i11, int i12, int i13, int i14) {
        if (f4270b && this.f4271a) {
            i12 -= view.getHeight();
        }
        super.update(view, i11, i12, i13, i14);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        m5245a(context, attributeSet, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12, int i13) {
        if (f4270b && this.f4271a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12, i13);
    }
}
