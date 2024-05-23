package com.zing.zalo.zinstant.component.p081ui.scrollview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import ok0.InterfaceC24284a;
import ok0.InterfaceC24289f;
import uk0.InterfaceC27292f;

/* loaded from: classes7.dex */
public abstract class ZinstantScrollViewBase extends NestedScrollView implements InterfaceC17123a {

    /* renamed from: T */
    Runnable f87560T;

    /* renamed from: U */
    int f87561U;

    /* renamed from: V */
    private InterfaceC17123a.a f87562V;

    /* renamed from: W */
    private boolean f87563W;

    /* renamed from: a0 */
    private Handler f87564a0;

    /* renamed from: b0 */
    protected ZinstantLayout f87565b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.scrollview.ZinstantScrollViewBase$a */
    /* loaded from: classes7.dex */
    public class RunnableC17121a implements Runnable {
        RunnableC17121a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int scrollY = ZinstantScrollViewBase.this.getScrollY();
            ZinstantScrollViewBase zinstantScrollViewBase = ZinstantScrollViewBase.this;
            if (zinstantScrollViewBase.f87561U - scrollY == 0) {
                zinstantScrollViewBase.removeCallbacks(zinstantScrollViewBase.f87560T);
                ZinstantScrollViewBase.this.setScrollState(true);
                ZinstantLayout zinstantLayout = ZinstantScrollViewBase.this.f87565b0;
                if (zinstantLayout != null) {
                    zinstantLayout.m92000s();
                    return;
                }
                return;
            }
            zinstantScrollViewBase.f87561U = zinstantScrollViewBase.getScrollY();
            ZinstantScrollViewBase zinstantScrollViewBase2 = ZinstantScrollViewBase.this;
            zinstantScrollViewBase2.postDelayed(zinstantScrollViewBase2.f87560T, 100L);
        }
    }

    public ZinstantScrollViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87563W = true;
        m91549p0();
    }

    /* renamed from: p0 */
    private void m91549p0() {
        this.f87564a0 = new Handler(Looper.getMainLooper());
        this.f87560T = new RunnableC17121a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception unused) {
            super.onRestoreInstanceState(onSaveInstanceState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        if (this.f87562V != null || this.f87565b0 != null) {
            setScrollState(false);
            this.f87564a0.removeCallbacks(this.f87560T);
            this.f87564a0.postDelayed(this.f87560T, 100L);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof ZinstantLayout) {
            this.f87565b0 = (ZinstantLayout) view;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f87565b0 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo91550q0(View view, boolean z11) {
    }

    public abstract void setImageLoader(InterfaceC24289f interfaceC24289f);

    public abstract void setInteractionTracker(InterfaceC27292f interfaceC27292f);

    public abstract void setLayoutGateway(InterfaceC17139d interfaceC17139d);

    public abstract void setOnClickListener(InterfaceC24284a interfaceC24284a);

    public void setOnIdleListener(InterfaceC17123a.a aVar) {
        this.f87562V = aVar;
        if (aVar != null) {
            aVar.mo68087a(this, this.f87563W);
        }
    }

    public void setScrollListener(InterfaceC17123a.b bVar) {
    }

    void setScrollState(boolean z11) {
        if (this.f87563W == z11) {
            return;
        }
        this.f87563W = z11;
        InterfaceC17123a.a aVar = this.f87562V;
        if (aVar != null) {
            aVar.mo68087a(this, z11);
        }
        mo91550q0(this, z11);
    }

    public abstract void setZINSNode(ZOMContainer zOMContainer);

    public ZinstantScrollViewBase(Context context) {
        super(context);
        this.f87563W = true;
        m91549p0();
    }
}
