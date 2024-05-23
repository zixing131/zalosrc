package com.zing.zalo.zdesign.component.inputfield;

import ac.C0708i;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ri0.C25808b;

/* loaded from: classes7.dex */
public class EditText extends EditTextWithContextMenu implements InterfaceC16976f1 {

    /* renamed from: E */
    private C25808b f86918E;

    /* renamed from: F */
    private ArrayList f86919F;

    /* renamed from: G */
    private boolean f86920G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f86919F = new ArrayList();
        this.f86918E = new C25808b(new WeakReference(this));
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        if (Build.VERSION.SDK_INT >= 26 && this.f86920G) {
            return 0;
        }
        return super.getAutofillType();
    }

    public final boolean getForceOffAutoFill$zdesign_release() {
        return this.f86920G;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        Iterator it = this.f86919F.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(this, z11);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i11);
        if (i11 == 16908322 && getTextContextChangeListener() != null) {
            EditTextWithContextMenu.AbstractC13498a textContextChangeListener = getTextContextChangeListener();
            AbstractC19074t.m100205c(textContextChangeListener);
            textContextChangeListener.mo36093a();
        }
        return onTextContextMenuItem;
    }

    public final void setForceOffAutoFill$zdesign_release(boolean z11) {
        this.f86920G = z11;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86918E;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86918E;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        AbstractC19074t.m100208f(onFocusChangeListener, "l");
        if (this.f86919F == null) {
            this.f86919F = new ArrayList();
        }
        this.f86919F.add(onFocusChangeListener);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86918E;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86919F = new ArrayList();
        this.f86918E = new C25808b(new WeakReference(this));
    }
}
