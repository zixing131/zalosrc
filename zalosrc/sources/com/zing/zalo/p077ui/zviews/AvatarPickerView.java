package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7057f;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import java.util.ArrayList;
import me0.AbstractC23188q6;
import p322lf.AbstractC22470k;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class AvatarPickerView extends BottomPickerView implements C7057f.a {

    /* renamed from: U0 */
    InterfaceC14082a f72251U0;

    /* renamed from: V0 */
    View f72252V0;

    /* renamed from: W0 */
    View f72253W0;

    /* renamed from: X0 */
    View f72254X0;

    /* renamed from: Y0 */
    View f72255Y0;

    /* renamed from: Z0 */
    RecyclerView f72256Z0;

    /* renamed from: a1 */
    C7057f f72257a1;

    /* renamed from: b1 */
    boolean f72258b1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.AvatarPickerView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14082a extends BottomPickerView.InterfaceC14112a {
        /* renamed from: a */
        void mo64240a();

        /* renamed from: b */
        void mo64241b();

        /* renamed from: d */
        void mo64242d(String str);

        /* renamed from: f0 */
        void mo64243f0();
    }

    /* renamed from: nL */
    public static AvatarPickerView m78263nL(InterfaceC14082a interfaceC14082a, ArrayList arrayList, boolean z11) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        if (arrayList != null && !arrayList.isEmpty()) {
            m78535kL.putStringArrayList("avatarList", arrayList);
        }
        AvatarPickerView avatarPickerView = new AvatarPickerView();
        avatarPickerView.m78265oL(interfaceC14082a);
        avatarPickerView.mo60305zK(m78535kL);
        avatarPickerView.m78266pL(z11);
        return avatarPickerView;
    }

    @Override // com.zing.zalo.adapters.C7057f.a
    /* renamed from: K9 */
    public void mo36036K9(String str) {
        AbstractC23647d.m123906p("27301");
        InterfaceC14082a interfaceC14082a = this.f72251U0;
        if (interfaceC14082a != null) {
            interfaceC14082a.mo64242d(str);
        }
        AbstractC23647d.m123893c();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        return this.f72256Z0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.avatar_picker_popup;
    }

    /* renamed from: oL */
    public void m78265oL(InterfaceC14082a interfaceC14082a) {
        this.f72251U0 = interfaceC14082a;
        this.f72452T0 = interfaceC14082a;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_take_photo) {
                if (!AbstractC22470k.m116154f(true)) {
                    return;
                }
                AbstractC23647d.m123906p("27303");
                InterfaceC14082a interfaceC14082a = this.f72251U0;
                if (interfaceC14082a != null) {
                    interfaceC14082a.mo64240a();
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.btn_pick_gallery) {
                AbstractC23647d.m123906p("27302");
                InterfaceC14082a interfaceC14082a2 = this.f72251U0;
                if (interfaceC14082a2 != null) {
                    interfaceC14082a2.mo64243f0();
                }
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.btn_pick_from_media_store) {
                AbstractC23647d.m123897g("10015513");
                InterfaceC14082a interfaceC14082a3 = this.f72251U0;
                if (interfaceC14082a3 != null) {
                    interfaceC14082a3.mo64241b();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pL */
    public void m78266pL(boolean z11) {
        this.f72258b1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        ArrayList<String> m119483a;
        super.mo37135xJ(bundle);
        try {
            this.f72256Z0 = (RecyclerView) this.f83659I0.findViewById(AbstractC6918a0.list_avatar_template);
            this.f72255Y0 = this.f83659I0.findViewById(AbstractC6918a0.separate_line);
            Bundle m92642L3 = this.f88762c0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("avatarList")) {
                m119483a = m92642L3.getStringArrayList("avatarList");
            } else {
                m119483a = AbstractC23188q6.m119483a();
            }
            int i11 = 8;
            if (m119483a != null) {
                this.f72255Y0.setVisibility(0);
                this.f72256Z0.setVisibility(0);
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f88762c0.getContext());
                noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
                C7057f c7057f = new C7057f(this.f72447O0);
                this.f72257a1 = c7057f;
                c7057f.m36034P(m119483a);
                this.f72257a1.m36035Q(this);
                this.f72256Z0.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
                this.f72256Z0.setAdapter(this.f72257a1);
            } else {
                this.f72255Y0.setVisibility(8);
                this.f72256Z0.setVisibility(8);
            }
            View findViewById = this.f83659I0.findViewById(AbstractC6918a0.btn_take_photo);
            this.f72252V0 = findViewById;
            findViewById.setOnClickListener(this);
            View findViewById2 = this.f83659I0.findViewById(AbstractC6918a0.btn_pick_gallery);
            this.f72253W0 = findViewById2;
            findViewById2.setOnClickListener(this);
            View findViewById3 = this.f83659I0.findViewById(AbstractC6918a0.btn_pick_from_media_store);
            this.f72254X0 = findViewById3;
            findViewById3.setOnClickListener(this);
            View view = this.f72254X0;
            if (this.f72258b1) {
                i11 = 0;
            }
            view.setVisibility(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
