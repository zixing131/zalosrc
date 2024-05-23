package com.zing.zalo.p077ui.mediastore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class NestedScrollViewParent extends NestedScrollView {

    /* renamed from: T */
    private int f64176T;

    /* renamed from: U */
    private RecyclerView f64177U;

    /* renamed from: V */
    private InterfaceC12337a f64178V;

    /* renamed from: com.zing.zalo.ui.mediastore.NestedScrollViewParent$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12337a {
        /* renamed from: a */
        void mo69409a(int i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollViewParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100205c(context);
    }

    public final int getMaxHeight() {
        return this.f64176T;
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(iArr, "consumed");
        super.mo5178k(view, i11, i12, iArr, i13);
        if (this.f64176T == 0) {
            super.mo5178k(view, i11, i12, iArr, i13);
            return;
        }
        if (i12 > 0) {
            int scrollY = getScrollY() + i12;
            int i14 = this.f64176T;
            if (scrollY <= i14) {
                m69411p0(i12, iArr);
            } else {
                m69411p0(i14 - getScrollY(), iArr);
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        if (this.f64176T == 0) {
            return super.onNestedPreFling(view, f11, f12);
        }
        if (this.f64177U == null) {
            if (view instanceof RecyclerView) {
                this.f64177U = (RecyclerView) view;
            } else if (view instanceof SwipeRefreshListView) {
                this.f64177U = ((SwipeRefreshListView) view).f83582p0;
            }
        }
        RecyclerView recyclerView = this.f64177U;
        if (recyclerView != null && recyclerView.computeVerticalScrollOffset() == 0) {
            m8322L((int) f12);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        InterfaceC12337a interfaceC12337a = this.f64178V;
        if (interfaceC12337a != null) {
            interfaceC12337a.mo69409a(i12);
        }
    }

    /* renamed from: p0 */
    public final void m69411p0(int i11, int[] iArr) {
        AbstractC19074t.m100208f(iArr, "consumed");
        if (i11 != 0) {
            scrollBy(0, i11);
            iArr[1] = i11;
        }
    }

    /* renamed from: q0 */
    public final void m69412q0() {
        this.f64177U = null;
    }

    public final void setMaxHeight(int i11) {
        this.f64176T = i11;
    }

    public final void setOnScrollListener(InterfaceC12337a interfaceC12337a) {
        this.f64178V = interfaceC12337a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollViewParent(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100205c(context);
    }
}
