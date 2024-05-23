package com.zing.zalo.zview;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.zview.ZaloView;
import wl0.InterfaceC29091d;

/* loaded from: classes7.dex */
public class ZVDialogView extends ZaloView implements InterfaceC29091d, ZaloView.InterfaceC17421f {

    /* renamed from: w0 */
    private boolean f88724w0;

    /* renamed from: x0 */
    private boolean f88725x0;

    /* renamed from: y0 */
    private boolean f88726y0;

    /* renamed from: z0 */
    private InterfaceC29091d.a f88727z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.ZVDialogView$a */
    /* loaded from: classes7.dex */
    public class ViewOnClickListenerC17412a implements View.OnClickListener {
        ViewOnClickListenerC17412a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ZVDialogView.this.f88725x0) {
                ZVDialogView.this.m92620KK();
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.ZVDialogView$b */
    /* loaded from: classes7.dex */
    protected static class C17413b {

        /* renamed from: a */
        private boolean f88729a = true;

        /* renamed from: b */
        private boolean f88730b = true;

        /* renamed from: c */
        private InterfaceC29091d.a f88731c;

        /* renamed from: d */
        private C17413b m92626d() {
            return this;
        }

        /* renamed from: e */
        public C17413b mo77085e(boolean z11) {
            this.f88729a = z11;
            return m92626d();
        }

        /* renamed from: f */
        public C17413b mo77086f(boolean z11) {
            this.f88730b = z11;
            return m92626d();
        }

        /* renamed from: g */
        public C17413b mo77087g(InterfaceC29091d.a aVar) {
            this.f88731c = aVar;
            return m92626d();
        }
    }

    public ZVDialogView() {
        this.f88724w0 = true;
        this.f88725x0 = true;
        this.f88726y0 = false;
    }

    /* renamed from: LK */
    private void m92619LK(View view, LayoutInflater layoutInflater) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(AbstractC17468f.zvdialog_base);
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new ViewOnClickListenerC17412a());
        }
        View mo77077NK = mo77077NK(layoutInflater);
        if (mo77077NK != null && (frameLayout = (FrameLayout) view.findViewById(AbstractC17468f.zvdialog_base_parent)) != null) {
            frameLayout.setOnClickListener(null);
            frameLayout.addView(mo77077NK);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f88724w0 = bundle.getBoolean("EXTRA_SAVED_CANCELABLE", true);
            this.f88725x0 = bundle.getBoolean("EXTRA_SAVED_CANCELABLE_ON_TOUCH_OUTSIDE", true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC17470g.zvdialog_base, viewGroup, false);
        m92619LK(inflate, layoutInflater);
        return inflate;
    }

    /* renamed from: KK */
    public void m92620KK() {
        InterfaceC29091d.a aVar = this.f88727z0;
        if (aVar != null) {
            aVar.mo87277a(this);
        }
        dismiss();
    }

    /* renamed from: MK */
    public boolean m92621MK() {
        return this.f88726y0;
    }

    /* renamed from: NK */
    protected View mo77077NK(LayoutInflater layoutInflater) {
        return null;
    }

    /* renamed from: OK */
    public void m92622OK(C17487o0 c17487o0, String str) {
        if (c17487o0 != null) {
            c17487o0.mo89693h2(this, str, 2, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        boolean z11 = this.f88724w0;
        if (!z11) {
            bundle.putBoolean("EXTRA_SAVED_CANCELABLE", z11);
        }
        boolean z12 = this.f88725x0;
        if (!z12) {
            bundle.putBoolean("EXTRA_SAVED_CANCELABLE_ON_TOUCH_OUTSIDE", z12);
        }
    }

    @Override // wl0.InterfaceC29091d
    public void dismiss() {
        try {
            this.f88726y0 = true;
            m92662fJ().mo92702G1(this, this.f88756W);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f88724w0) {
                m92620KK();
                return true;
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    public ZVDialogView(C17413b c17413b) {
        this.f88724w0 = true;
        this.f88725x0 = true;
        this.f88726y0 = false;
        this.f88724w0 = c17413b.f88729a;
        this.f88725x0 = c17413b.f88730b;
        this.f88727z0 = c17413b.f88731c;
    }
}
