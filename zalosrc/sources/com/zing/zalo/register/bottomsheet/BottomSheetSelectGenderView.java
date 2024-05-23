package com.zing.zalo.register.bottomsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.register.bottomsheet.BottomSheetSelectGenderView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p649xl.C29739c1;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class BottomSheetSelectGenderView extends BottomSheet {

    /* renamed from: b1 */
    private C29739c1 f49377b1;

    /* renamed from: c1 */
    private int f49378c1 = -1;

    /* renamed from: LL */
    private final void m50057LL() {
        boolean z11;
        boolean z12;
        C29739c1 c29739c1 = this.f49377b1;
        C29739c1 c29739c12 = null;
        if (c29739c1 == null) {
            AbstractC19074t.m100223u("binding");
            c29739c1 = null;
        }
        ListItemSetting listItemSetting = c29739c1.f137381s;
        boolean z13 = false;
        if (this.f49378c1 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setTick(z11);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: dz.o
            public /* synthetic */ ViewOnClickListenerC18146o() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetSelectGenderView.m50058ML(BottomSheetSelectGenderView.this, view);
            }
        });
        C29739c1 c29739c13 = this.f49377b1;
        if (c29739c13 == null) {
            AbstractC19074t.m100223u("binding");
            c29739c13 = null;
        }
        ListItemSetting listItemSetting2 = c29739c13.f137380r;
        if (this.f49378c1 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        listItemSetting2.setTick(z12);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: dz.p
            public /* synthetic */ ViewOnClickListenerC18147p() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetSelectGenderView.m50059NL(BottomSheetSelectGenderView.this, view);
            }
        });
        C29739c1 c29739c14 = this.f49377b1;
        if (c29739c14 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29739c12 = c29739c14;
        }
        ListItemSetting listItemSetting3 = c29739c12.f137379q;
        if (this.f49378c1 == 2) {
            z13 = true;
        }
        listItemSetting3.setTick(z13);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: dz.q
            public /* synthetic */ ViewOnClickListenerC18148q() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetSelectGenderView.m50060OL(BottomSheetSelectGenderView.this, view);
            }
        });
    }

    /* renamed from: ML */
    public static final void m50058ML(BottomSheetSelectGenderView bottomSheetSelectGenderView, View view) {
        AbstractC19074t.m100208f(bottomSheetSelectGenderView, "this$0");
        bottomSheetSelectGenderView.f49378c1 = 0;
        bottomSheetSelectGenderView.m50061cG();
    }

    /* renamed from: NL */
    public static final void m50059NL(BottomSheetSelectGenderView bottomSheetSelectGenderView, View view) {
        AbstractC19074t.m100208f(bottomSheetSelectGenderView, "this$0");
        bottomSheetSelectGenderView.f49378c1 = 1;
        bottomSheetSelectGenderView.m50061cG();
    }

    /* renamed from: OL */
    public static final void m50060OL(BottomSheetSelectGenderView bottomSheetSelectGenderView, View view) {
        AbstractC19074t.m100208f(bottomSheetSelectGenderView, "this$0");
        bottomSheetSelectGenderView.f49378c1 = 2;
        bottomSheetSelectGenderView.m50061cG();
    }

    /* renamed from: cG */
    private final void m50061cG() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_GENDER", this.f49378c1);
        C24848g0 c24848g0 = C24848g0.f119245a;
        mo50035CK(-1, intent);
        close();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f49378c1 = m92642L3.getInt("EXTRA_SELECTED_GENDER", -1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CK */
    public void mo50035CK(int i11, Intent intent) {
        ZaloView m92650VI;
        super.mo50035CK(i11, intent);
        if ((m92650VI() instanceof RegisterLayoutBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(i11, intent);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29739c1 m147795c = C29739c1.m147795c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147795c, "inflate(...)");
        this.f49377b1 = m147795c;
        m90525tL(true);
        m90528wL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m50057LL();
    }
}
