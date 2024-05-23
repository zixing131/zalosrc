package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0852x;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.SensitiveData;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p716zh.C31849b1;

/* loaded from: classes6.dex */
public class OperateEnableSubmitContactView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    private final SensitiveData f75749P0 = new SensitiveData("phonebook_scan_via_action_common", "action_common");

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.operate_enable_submit_contact_view, viewGroup, false);
        inflate.findViewById(AbstractC6918a0.btnEnable).setOnClickListener(this);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvSkip);
        textView.setOnClickListener(this);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        return inflate;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OperateEnableSubmitContactView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnEnable) {
            AbstractC23309i.m121139Kw(6);
            AbstractC23057e7.m118305l(true);
            Context m92648SI = this.f72421L0.m92648SI();
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI, strArr) == 0) {
                AbstractC0852x.m2338O(this.f75749P0);
                finish();
            } else {
                AbstractC23034c6.m118184v0(this, strArr, 108);
            }
            AbstractC23647d.m123897g("3000300");
            return;
        }
        if (id2 == AbstractC6918a0.tvSkip) {
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 108 && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
            AbstractC0852x.m2338O(this.f75749P0);
            C31849b1.m153097n().m153106h(true);
            finish();
        }
    }
}
