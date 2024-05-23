package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class PickMediaDialogView extends DialogView implements InterfaceC17463d.d {

    /* renamed from: H0 */
    private PickMediaProgressView f75915H0;

    /* renamed from: YK */
    public static PickMediaDialogView m82601YK() {
        PickMediaDialogView pickMediaDialogView = new PickMediaDialogView();
        pickMediaDialogView.m92596NK(false);
        return pickMediaDialogView;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        if (bundle != null) {
            try {
                dismiss();
                return super.mo13885LK(bundle);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        C8009j.a aVar = new C8009j.a(this.f88762c0.m92648SI());
        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.pick_media_dialog_view, (ViewGroup) null);
        this.f75915H0 = (PickMediaProgressView) inflate.findViewById(AbstractC6918a0.pick_media_progress_view);
        aVar.m43150A(inflate, AbstractC23136l9.m118712h(m92686rK(), 10.0f), 0, 0, 0);
        aVar.m43162k(this.f88762c0.m92652XI(AbstractC8020f0.PROCESSING));
        aVar.m43155d(true);
        final C8009j m43152a = aVar.m43152a();
        m43152a.m92874z(false);
        this.f75915H0.findViewById(AbstractC6918a0.btn_cancel_upload).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.s40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyEventCallbackC17462c.this.cancel();
            }
        });
        return m43152a;
    }

    /* renamed from: ZK */
    public void m82602ZK(int i11) {
        this.f75915H0.m82606d(i11);
    }
}
