package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import me0.AbstractC23136l9;
import p159fe.C18889a;

/* loaded from: classes6.dex */
public class AttendConfirmBottomPicker extends ListViewBottomPicker {

    /* renamed from: Z0 */
    C18889a f72159Z0;

    /* renamed from: a1 */
    InterfaceC14036a f72160a1;

    /* renamed from: b1 */
    int f72161b1;

    /* renamed from: c1 */
    boolean f72162c1;

    /* renamed from: com.zing.zalo.ui.zviews.AttendConfirmBottomPicker$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14036a extends BottomPickerView.InterfaceC14112a {
        /* renamed from: g */
        void mo78111g(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sL */
    public /* synthetic */ void m78103sL(AdapterView adapterView, View view, int i11, long j11) {
        int intValue;
        InterfaceC14036a interfaceC14036a;
        if (!this.f72162c1 && (intValue = mo78106nL().getItem(i11).intValue()) != this.f72161b1 && (interfaceC14036a = this.f72160a1) != null) {
            interfaceC14036a.mo78111g(intValue);
        }
    }

    /* renamed from: tL */
    public static AttendConfirmBottomPicker m78104tL(int i11, InterfaceC14036a interfaceC14036a) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        AttendConfirmBottomPicker attendConfirmBottomPicker = new AttendConfirmBottomPicker();
        attendConfirmBottomPicker.mo60305zK(m78535kL);
        attendConfirmBottomPicker.m78109uL(interfaceC14036a);
        attendConfirmBottomPicker.f72161b1 = i11;
        return attendConfirmBottomPicker;
    }

    /* renamed from: EG */
    public void m78105EG(boolean z11, boolean z12) {
        this.f72162c1 = z11;
        mo78106nL().m99035d(this.f72162c1);
        if (z12) {
            mo78106nL().notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ListViewBottomPicker
    /* renamed from: oL */
    protected AdapterView.OnItemClickListener mo78107oL() {
        return new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.k0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                AttendConfirmBottomPicker.this.m78103sL(adapterView, view, i11, j11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ListViewBottomPicker
    /* renamed from: rL, reason: merged with bridge method [inline-methods] */
    public C18889a mo78106nL() {
        if (this.f72159Z0 == null) {
            this.f72159Z0 = new C18889a(getContext());
        }
        return this.f72159Z0;
    }

    /* renamed from: uL */
    public void m78109uL(InterfaceC14036a interfaceC14036a) {
        this.f72160a1 = interfaceC14036a;
        this.f72452T0 = interfaceC14036a;
    }

    /* renamed from: vL */
    public void m78110vL(int i11, boolean z11) {
        this.f72161b1 = i11;
        mo78106nL().m99034c(this.f72161b1);
        if (z11) {
            mo78106nL().notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ListViewBottomPicker, com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m81142pL(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm));
        mo78106nL().m99034c(this.f72161b1);
        this.f72162c1 = false;
        mo78106nL().m99035d(this.f72162c1);
    }
}
