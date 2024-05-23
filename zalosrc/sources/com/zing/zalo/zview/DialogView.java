package com.zing.zalo.zview;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* loaded from: classes7.dex */
public class DialogView extends ZaloView implements InterfaceC17463d.c, InterfaceC17463d.e, InterfaceC17463d.f, ZaloView.InterfaceC17421f, InterfaceC17463d.h {

    /* renamed from: E0 */
    protected InterfaceC17463d.c f88680E0;

    /* renamed from: F0 */
    protected InterfaceC17463d.f f88681F0;

    /* renamed from: G0 */
    protected InterfaceC17463d.h f88682G0;

    /* renamed from: y0 */
    KeyEventCallbackC17462c f88685y0;

    /* renamed from: w0 */
    int f88683w0 = 0;

    /* renamed from: x0 */
    int f88684x0 = 0;

    /* renamed from: z0 */
    boolean f88686z0 = true;

    /* renamed from: A0 */
    boolean f88676A0 = false;

    /* renamed from: B0 */
    boolean f88677B0 = false;

    /* renamed from: C0 */
    boolean f88678C0 = true;

    /* renamed from: D0 */
    boolean f88679D0 = true;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        super.mo37111CJ(bundle);
        if (this.f88739F == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f88686z0 = z11;
        if (bundle != null) {
            this.f88678C0 = bundle.getBoolean("zView:cancelable", true);
            this.f88679D0 = bundle.getBoolean("zView:canceledOnTouchOutside", true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f88677B0 = true;
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f88685y0;
        if (keyEventCallbackC17462c != null) {
            this.f88676A0 = true;
            keyEventCallbackC17462c.dismiss();
            this.f88685y0 = null;
        }
    }

    /* renamed from: JK */
    public KeyEventCallbackC17462c m92594JK() {
        return this.f88685y0;
    }

    /* renamed from: KK */
    public boolean m92595KK() {
        if (m92674mJ() && !this.f88676A0 && this.f88775p > 2) {
            return true;
        }
        return false;
    }

    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        return new KeyEventCallbackC17462c(getContext(), this.f88684x0);
    }

    /* renamed from: MK */
    public void mo43041MK(boolean z11) {
        this.f88678C0 = z11;
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f88685y0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.m92873y(z11);
        }
    }

    /* renamed from: NK */
    public void m92596NK(boolean z11) {
        this.f88679D0 = z11;
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f88685y0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.m92874z(z11);
        }
    }

    /* renamed from: OK */
    public void m92597OK(InterfaceC17463d.c cVar) {
        this.f88680E0 = cVar;
    }

    /* renamed from: PK */
    public void m92598PK(InterfaceC17463d.f fVar) {
        this.f88681F0 = fVar;
    }

    /* renamed from: QK */
    public void m92599QK(InterfaceC17463d.h hVar) {
        this.f88682G0 = hVar;
    }

    /* renamed from: RK */
    public void m92600RK(boolean z11) {
        this.f88686z0 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        boolean z11 = this.f88678C0;
        if (!z11) {
            bundle.putBoolean("zView:cancelable", z11);
        }
        boolean z12 = this.f88679D0;
        if (!z12) {
            bundle.putBoolean("zView:canceledOnTouchOutside", z12);
        }
    }

    /* renamed from: SK */
    public void m92601SK(int i11, int i12) {
        this.f88683w0 = i11;
        if (i11 == 2 || i11 == 3) {
            this.f88684x0 = R.style.Theme.Panel;
        }
        if (i12 != 0) {
            this.f88684x0 = i12;
        }
    }

    /* renamed from: TK */
    public void mo83093TK(C17487o0 c17487o0) {
        if (c17487o0 != null) {
            c17487o0.m93060e2(0, this, null, 0, false);
            this.f88736C = c17487o0;
        }
    }

    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        if (!this.f88676A0) {
            dismiss();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.f
    /* renamed from: Tx */
    public boolean mo87296Tx(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
        InterfaceC17463d.f fVar = this.f88681F0;
        if (fVar != null) {
            return fVar.mo87296Tx(interfaceC17463d, i11, keyEvent);
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UI */
    public LayoutInflater mo79283UI(Bundle bundle) {
        if (!this.f88686z0) {
            return super.mo79283UI(bundle);
        }
        KeyEventCallbackC17462c mo13885LK = mo13885LK(bundle);
        this.f88685y0 = mo13885LK;
        this.f88677B0 = false;
        if (mo13885LK != null) {
            mo13885LK.m92857I(this);
            int i11 = this.f88683w0;
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    this.f88685y0.m92867k().m92895b(24);
                }
                return (LayoutInflater) this.f88685y0.m92865i().getSystemService("layout_inflater");
            }
            this.f88685y0.m92870v(1);
            return (LayoutInflater) this.f88685y0.m92865i().getSystemService("layout_inflater");
        }
        return super.mo79283UI(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        boolean z11;
        boolean z12;
        KeyEventCallbackC17462c keyEventCallbackC17462c;
        super.mo37584UJ();
        if (m92676n2() != null) {
            z11 = m92676n2().isDestroyed();
            z12 = m92676n2().isFinishing();
        } else {
            z11 = false;
            z12 = false;
        }
        if (!z11 && !z12 && (keyEventCallbackC17462c = this.f88685y0) != null) {
            this.f88676A0 = false;
            keyEventCallbackC17462c.mo13822K();
        }
    }

    /* renamed from: UK */
    public void m92602UK(C17487o0 c17487o0, String str) {
        if (c17487o0 != null) {
            c17487o0.m93060e2(0, this, str, 0, false);
            this.f88736C = c17487o0;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f88685y0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.mo88281l();
        }
    }

    /* renamed from: VK */
    public void m92603VK(C17487o0 c17487o0, String str, Bundle bundle) {
        if (c17487o0 != null) {
            c17487o0.mo93055b2(0, this, bundle, 0, str, 0, false);
            this.f88736C = c17487o0;
        }
    }

    public void dismiss() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f88685y0;
        C17478k c17478k = null;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
            this.f88685y0 = null;
        }
        this.f88676A0 = true;
        if (!m92662fJ().f89111e.isEmpty()) {
            int size = m92662fJ().f89111e.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (this.f88781s.equals(((C17478k) m92662fJ().f89111e.get(size)).f89078e)) {
                    c17478k = (C17478k) m92662fJ().f89111e.get(size);
                    break;
                }
                size--;
            }
        }
        if (c17478k != null) {
            m92662fJ().m93005H1(c17478k, this.f88756W);
        } else {
            m92662fJ().mo92702G1(this, this.f88756W);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.h
    /* renamed from: n7 */
    public void mo92604n7() {
        InterfaceC17463d.h hVar = this.f88682G0;
        if (hVar != null) {
            hVar.mo92604n7();
        }
    }

    /* renamed from: p7 */
    public void mo13013p7(InterfaceC17463d interfaceC17463d) {
        InterfaceC17463d.c cVar = this.f88680E0;
        if (cVar != null) {
            cVar.mo13013p7(interfaceC17463d);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (this.f88685y0 == null || !this.f88686z0) {
            return;
        }
        View m92656bJ = m92656bJ();
        if (m92656bJ != null) {
            if (m92656bJ.getParent() == null) {
                this.f88685y0.m92851B(m92656bJ);
            } else {
                throw new IllegalStateException("DialogView can not be attached to a container view");
            }
        }
        this.f88685y0.m92856G(this);
        this.f88685y0.m92873y(this.f88678C0);
        this.f88685y0.m92874z(this.f88679D0);
        this.f88685y0.m92854E(this);
        this.f88685y0.m92855F(this);
    }
}
