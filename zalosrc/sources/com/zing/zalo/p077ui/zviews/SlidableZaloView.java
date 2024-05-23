package com.zing.zalo.p077ui.zviews;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import com.zing.zalo.zview.SlideAnimationLayout;
import com.zing.zalo.zview.ZaloView;
import p363nh.C23744a;

/* loaded from: classes.dex */
public abstract class SlidableZaloView extends BaseZaloView implements SlideAnimationLayout.InterfaceC17409d {

    /* renamed from: M0 */
    protected boolean f77813M0;

    /* renamed from: N0 */
    protected boolean f77814N0;

    /* renamed from: O0 */
    private final C23744a.c f77815O0;

    public SlidableZaloView() {
        this.f77813M0 = false;
        this.f77814N0 = true;
        this.f77815O0 = new C23744a.c() { // from class: com.zing.zalo.ui.zviews.xk0
            @Override // p363nh.C23744a.c
            /* renamed from: x */
            public final void mo17795x(int i11, Object[] objArr) {
                SlidableZaloView.this.m84415eM(i11, objArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public /* synthetic */ void m84415eM(int i11, Object[] objArr) {
        if (i11 == 5112 && objArr != null && objArr.length > 0) {
            this.f77814N0 = ((Boolean) objArr[0]).booleanValue();
        }
    }

    /* renamed from: KB */
    public void mo73053KB() {
        this.f77813M0 = true;
        if (this.f72421L0.m92676n2() != null) {
            AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
        }
    }

    /* renamed from: Li */
    public boolean mo37488Li() {
        if (this.f77814N0 && this.f72421L0.m92674mJ() && m92685rJ() && m92687sJ() && !this.f88764e0) {
            return true;
        }
        return false;
    }

    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (z11) {
            if (!(this instanceof ZaloView.InterfaceC17421f)) {
                this.f72421L0.m92662fJ().m93094z(false);
            }
        } else {
            this.f88756W = 0;
            this.f72421L0.finish();
        }
        this.f77813M0 = false;
    }

    /* renamed from: Ps */
    public void mo62806Ps() {
        this.f72421L0.m92662fJ().m93094z(true);
    }

    /* renamed from: Tf */
    public View mo62809Tf() {
        ZaloView m93004H0 = this.f72421L0.m92662fJ().m93004H0();
        if (m93004H0 != null) {
            return m93004H0.m92656bJ();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this.f77815O0, 5112);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (this.f77813M0) {
            mo59740N7(false);
        }
        C23744a.m124114c().m124117e(this.f77815O0, 5112);
    }

    /* renamed from: fM */
    public void m84416fM(boolean z11) {
        if (this.f72421L0.m92656bJ() instanceof SlideAnimationLayout) {
            ((SlideAnimationLayout) this.f72421L0.m92656bJ()).setLeftEdgeMode(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f72421L0.m92656bJ() != null && this.f72421L0.m92656bJ().onKeyUp(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: qG */
    public View mo62819qG() {
        if (!equals(this.f72421L0.m92662fJ().m93012K0())) {
            return null;
        }
        return ((ViewGroup) this.f72421L0.m92656bJ()).getChildAt(0);
    }

    public SlidableZaloView(int i11) {
        super(i11);
        this.f77813M0 = false;
        this.f77814N0 = true;
        this.f77815O0 = new C23744a.c() { // from class: com.zing.zalo.ui.zviews.xk0
            @Override // p363nh.C23744a.c
            /* renamed from: x */
            public final void mo17795x(int i112, Object[] objArr) {
                SlidableZaloView.this.m84415eM(i112, objArr);
            }
        };
    }
}
