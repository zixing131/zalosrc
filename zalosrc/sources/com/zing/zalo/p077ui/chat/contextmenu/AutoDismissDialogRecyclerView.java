package com.zing.zalo.p077ui.chat.contextmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zview.DialogView;
import fn0.AbstractC19074t;
import p667y2.C30268e;
import y50.InterfaceC30793c;

/* loaded from: classes5.dex */
public final class AutoDismissDialogRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    private DialogView f59668V0;

    /* renamed from: W0 */
    private InterfaceC30793c.a f59669W0;

    /* renamed from: X0 */
    private Runnable f59670X0;

    /* renamed from: Y0 */
    private boolean f59671Y0;

    /* renamed from: Z0 */
    private boolean f59672Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoDismissDialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a2 */
    private final boolean m62639a2(InterfaceC30793c.a aVar, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    return false;
                }
                return aVar.mo61440c(this, motionEvent.getX(), motionEvent.getY());
            }
            return aVar.mo61438a(this, motionEvent.getX(), motionEvent.getY());
        }
        return aVar.mo61441d(this, motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: d2 */
    private final void m62640d2() {
        this.f59671Y0 = false;
        this.f59672Z0 = true;
        Runnable runnable = this.f59670X0;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b2 */
    public final boolean m62641b2() {
        return this.f59672Z0;
    }

    /* renamed from: c2 */
    public final void m62642c2() {
        this.f59671Y0 = true;
        this.f59672Z0 = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        InterfaceC30793c.a aVar = this.f59669W0;
        if (aVar != null) {
            if (this.f59671Y0) {
                if (motionEvent.getActionMasked() == 1) {
                    m62640d2();
                    return true;
                }
                if (aVar.mo61441d(this, motionEvent.getX(), motionEvent.getY())) {
                    requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
            if (motionEvent.getActionMasked() == 0 && aVar.mo61439b(this, motionEvent.getX(), motionEvent.getY())) {
                requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DialogView dialogView;
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        InterfaceC30793c.a aVar = this.f59669W0;
        if (aVar != null) {
            if (m62639a2(aVar, motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    if (this.f59671Y0) {
                        m62640d2();
                    }
                    requestDisallowInterceptTouchEvent(false);
                }
                return true;
            }
            requestDisallowInterceptTouchEvent(false);
        }
        if (motionEvent.getAction() == 1 && (dialogView = this.f59668V0) != null) {
            dialogView.dismiss();
        }
        return true;
    }

    public final void setMoveTextSelectHandleController(InterfaceC30793c.a aVar) {
        this.f59669W0 = aVar;
    }

    public final void setOnFirstReleaseAfterSelectingNewTextListener(Runnable runnable) {
        this.f59670X0 = runnable;
    }

    public final void setPopupDialog(DialogView dialogView) {
        this.f59668V0 = dialogView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoDismissDialogRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
