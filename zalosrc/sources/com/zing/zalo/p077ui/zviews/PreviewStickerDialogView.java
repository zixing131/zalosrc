package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import c30.C3246i0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import mm0.AbstractC23350e;
import p471r3.C25630b;
import p588vw.C28644j;

/* loaded from: classes6.dex */
public class PreviewStickerDialogView extends DialogView {

    /* renamed from: H0 */
    ZaloView f76065H0;

    /* renamed from: I0 */
    Object f76066I0;

    /* renamed from: J0 */
    public KeyEventCallbackC17462c f76067J0;

    /* renamed from: K0 */
    public C3246i0.a f76068K0;

    /* renamed from: WK */
    public static PreviewStickerDialogView m82808WK(int i11, ZaloView zaloView, Object obj) {
        PreviewStickerDialogView previewStickerDialogView = new PreviewStickerDialogView();
        previewStickerDialogView.m82810YK(zaloView);
        previewStickerDialogView.m82809XK(obj);
        Bundle bundle = new Bundle();
        bundle.putInt("id", i11);
        previewStickerDialogView.mo60305zK(bundle);
        return previewStickerDialogView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        try {
            if (this.f76065H0 == null || bundle != null) {
                dismiss();
                return super.mo13885LK(bundle);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f88762c0.m92642L3().getInt("id") != 301) {
            return null;
        }
        try {
            Object obj = this.f76066I0;
            if (obj == null) {
                return null;
            }
            C25630b c25630b = (C25630b) ((Bundle) obj).getSerializable("gifInfo");
            if (c25630b != null) {
                C25630b m143282P0 = C28644j.m143233Y().m143282P0(c25630b);
                C3246i0.a aVar = new C3246i0.a(this.f76065H0.getContext());
                this.f76068K0 = aVar;
                C3246i0 m16484i = aVar.m16495z(this.f88762c0.m92652XI(AbstractC8020f0.str_tab_sticker_voice)).m16492w(this.f88762c0.m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m16494y(m143282P0).m16484i();
                this.f76067J0 = m16484i;
                m16484i.m92874z(false);
            }
            return this.f76067J0;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            return null;
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        C3246i0.a aVar = this.f76068K0;
        if (aVar != null) {
            aVar.m16483h();
        }
        super.mo12457Tv(interfaceC17463d);
    }

    /* renamed from: XK */
    public void m82809XK(Object obj) {
        this.f76066I0 = obj;
    }

    /* renamed from: YK */
    public void m82810YK(ZaloView zaloView) {
        this.f76065H0 = zaloView;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        try {
            super.mo37135xJ(bundle);
            if (this.f88762c0.m92642L3() != null && this.f88762c0.m92642L3().getInt("id") == 301) {
                C17465f m92867k = m92594JK().m92867k();
                m92867k.m92890I(1);
                m92867k.m92895b(131072);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
