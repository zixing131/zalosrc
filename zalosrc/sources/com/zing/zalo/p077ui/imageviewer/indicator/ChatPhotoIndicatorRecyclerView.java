package com.zing.zalo.p077ui.imageviewer.indicator;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.C1924q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer;
import com.zing.zalo.p077ui.imageviewer.indicator.C12073a;
import com.zing.zalo.p077ui.imageviewer.indicator.ChatPhotoIndicatorRecyclerView;
import mm0.AbstractC23350e;
import p361nb.AbstractC23647d;

/* loaded from: classes5.dex */
public class ChatPhotoIndicatorRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    private boolean f63014V0;

    /* renamed from: W0 */
    private final C1924q f63015W0;

    /* renamed from: X0 */
    private boolean f63016X0;

    /* renamed from: Y0 */
    private BaseChatImageViewer f63017Y0;

    /* renamed from: Z0 */
    protected Handler f63018Z0;

    /* renamed from: a1 */
    private boolean f63019a1;

    /* renamed from: b1 */
    private final Runnable f63020b1;

    /* renamed from: com.zing.zalo.ui.imageviewer.indicator.ChatPhotoIndicatorRecyclerView$a */
    /* loaded from: classes5.dex */
    public class C12072a extends RecyclerView.AbstractC1892s {
        C12072a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 1 && !ChatPhotoIndicatorRecyclerView.this.f63014V0) {
                ChatPhotoIndicatorRecyclerView.this.f63014V0 = true;
                C12073a c12073a = (C12073a) ChatPhotoIndicatorRecyclerView.this.getAdapter();
                if (c12073a != null) {
                    c12073a.m67375O();
                }
                if (ChatPhotoIndicatorRecyclerView.this.f63016X0) {
                    ChatPhotoIndicatorRecyclerView.this.f63016X0 = false;
                    AbstractC23647d.m123897g("10015026");
                    return;
                }
                return;
            }
            if (i11 == 0 && ChatPhotoIndicatorRecyclerView.this.f63014V0) {
                ChatPhotoIndicatorRecyclerView.this.f63014V0 = false;
                ChatPhotoIndicatorRecyclerView.this.m67363h2();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
        }
    }

    public ChatPhotoIndicatorRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63014V0 = false;
        this.f63015W0 = new C1924q();
        this.f63016X0 = true;
        this.f63017Y0 = null;
        this.f63018Z0 = new Handler(Looper.getMainLooper());
        this.f63019a1 = false;
        this.f63020b1 = new Runnable() { // from class: k70.e
            public /* synthetic */ RunnableC21564e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatPhotoIndicatorRecyclerView.this.m67365k2();
            }
        };
        m67364j2();
    }

    /* renamed from: h2 */
    public int m67363h2() {
        C12073a.b bVar;
        try {
            View mo10402h = this.f63015W0.mo10402h(getLayoutManager());
            if (mo10402h != null && (bVar = (C12073a.b) m9823C0(mo10402h)) != null) {
                int m9929A = bVar.m9929A();
                if (bVar.m67416y0() == -1) {
                    if (m9929A < getAdapter().mo10003k() / 2) {
                        m9929A++;
                    } else {
                        m9929A--;
                    }
                }
                BaseChatImageViewer baseChatImageViewer = this.f63017Y0;
                if (baseChatImageViewer != null) {
                    baseChatImageViewer.mo66729oO(m9929A - 1, Boolean.FALSE);
                }
                return m9929A;
            }
            return 0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 0;
        }
    }

    /* renamed from: j2 */
    private void m67364j2() {
        setItemAnimator(null);
        this.f63016X0 = true;
        this.f63019a1 = true;
        m9826E(new C12072a());
    }

    /* renamed from: k2 */
    public /* synthetic */ void m67365k2() {
        C12073a.b bVar;
        try {
            C12073a c12073a = (C12073a) getAdapter();
            if (c12073a != null && (bVar = (C12073a.b) m9900t0(c12073a.m67376P())) != null) {
                int width = this.f63015W0.mo10398c(getLayoutManager(), bVar.f7784p)[0] + ((bVar.m67411A0()[0] - bVar.f7784p.getWidth()) / 2);
                if (width != 0) {
                    m9866X1();
                    m9847P1(width, 0, new LinearInterpolator());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l2 */
    public /* synthetic */ void m67366l2() {
        int i11;
        C12073a c12073a = (C12073a) getAdapter();
        if (c12073a != null) {
            c12073a.m67374N();
            BaseChatImageViewer baseChatImageViewer = this.f63017Y0;
            if (baseChatImageViewer != null) {
                i11 = baseChatImageViewer.m66841WM();
            } else {
                i11 = 0;
            }
            m67368i2(i11);
        }
    }

    /* renamed from: m2 */
    private void m67367m2(int i11, boolean z11) {
        int i12;
        C12073a c12073a = (C12073a) getAdapter();
        if (c12073a != null) {
            c12073a.m67383Y(i11, z11);
            removeCallbacks(this.f63020b1);
            if (!z11) {
                post(this.f63020b1);
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (linearLayoutManager != null) {
                if (linearLayoutManager.getWidth() > 0) {
                    i12 = (linearLayoutManager.getWidth() / 2) - (c12073a.m67377S(i11) / 2);
                } else {
                    i12 = 0;
                }
                linearLayoutManager.m9721B2(i11, i12);
            }
        }
    }

    /* renamed from: i2 */
    public void m67368i2(int i11) {
        this.f63014V0 = false;
        m9866X1();
        m67367m2(i11 + 1, true);
    }

    /* renamed from: n2 */
    public void m67369n2(int i11) {
        m67367m2(i11 + 1, false);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f63018Z0.post(new Runnable() { // from class: k70.f
            public /* synthetic */ RunnableC21565f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatPhotoIndicatorRecyclerView.this.m67366l2();
            }
        });
    }

    public void setBaseChatImageViewer(BaseChatImageViewer baseChatImageViewer) {
        this.f63017Y0 = baseChatImageViewer;
    }

    public void setIsForceSnapAfterFastScroll(boolean z11) {
        this.f63019a1 = z11;
    }

    public ChatPhotoIndicatorRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f63014V0 = false;
        this.f63015W0 = new C1924q();
        this.f63016X0 = true;
        this.f63017Y0 = null;
        this.f63018Z0 = new Handler(Looper.getMainLooper());
        this.f63019a1 = false;
        this.f63020b1 = new Runnable() { // from class: k70.e
            public /* synthetic */ RunnableC21564e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatPhotoIndicatorRecyclerView.this.m67365k2();
            }
        };
        m67364j2();
    }
}
