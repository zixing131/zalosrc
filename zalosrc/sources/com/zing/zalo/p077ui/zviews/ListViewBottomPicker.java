package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public abstract class ListViewBottomPicker extends BottomPickerView {

    /* renamed from: U0 */
    ImageView f74689U0;

    /* renamed from: V0 */
    RobotoTextView f74690V0;

    /* renamed from: W0 */
    ListView f74691W0;

    /* renamed from: X0 */
    BaseAdapter f74692X0;

    /* renamed from: Y0 */
    boolean f74693Y0 = false;

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        try {
            this.f74693Y0 = true;
            super.mo71219Kj(view, motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        try {
            this.f74693Y0 = false;
            super.mo71235TH(view, motionEvent, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo62728eL = super.mo62728eL(layoutInflater, viewGroup, bundle);
        this.f83659I0 = mo62728eL;
        ImageView imageView = (ImageView) mo62728eL.findViewById(AbstractC6918a0.btn_close);
        this.f74689U0 = imageView;
        imageView.setOnClickListener(this);
        this.f74690V0 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.bottom_picker_title);
        ListView listView = (ListView) this.f83659I0.findViewById(AbstractC6918a0.list_view_content);
        this.f74691W0 = listView;
        listView.setDivider(null);
        BaseAdapter mo78106nL = mo78106nL();
        this.f74692X0 = mo78106nL;
        this.f74691W0.setAdapter((ListAdapter) mo78106nL);
        this.f74691W0.setOnItemClickListener(mo78107oL());
        return this.f83659I0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        return this.f74691W0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        try {
            if (!this.f72450R0 && z11 && Math.abs(f12) < this.f72448P0) {
                return false;
            }
            boolean m118664M0 = AbstractC23136l9.m118664M0(mo78264lL(), motionEvent, view);
            if (!this.f72450R0) {
                if (!this.f74693Y0 && m118664M0) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.list_view_bottom_picker_layout;
    }

    /* renamed from: nL */
    protected abstract BaseAdapter mo78106nL();

    /* renamed from: oL */
    protected abstract AdapterView.OnItemClickListener mo78107oL();

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_close) {
            super.dismiss();
        }
        super.onClick(view);
    }

    /* renamed from: pL */
    public void m81142pL(String str) {
        this.f74690V0.setText(str);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m92594JK().m92867k().m92901h().flags |= 65536;
    }
}
