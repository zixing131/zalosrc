package com.zing.zalo.register.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.register.bottomsheet.BottomSheetSelectAvatarMethodView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p649xl.C29721b1;
import pm0.C24848g0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class BottomSheetSelectAvatarMethodView extends BottomSheet {
    public static final C9312a Companion = new C9312a(null);

    /* renamed from: b1 */
    private C29721b1 f49375b1;

    /* renamed from: c1 */
    private boolean f49376c1;

    /* renamed from: com.zing.zalo.register.bottomsheet.BottomSheetSelectAvatarMethodView$a */
    /* loaded from: classes4.dex */
    public static final class C9312a {
        private C9312a() {
        }

        public /* synthetic */ C9312a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: LL */
    private final void m50050LL() {
        int i11;
        C29721b1 c29721b1 = this.f49375b1;
        C29721b1 c29721b12 = null;
        if (c29721b1 == null) {
            AbstractC19074t.m100223u("binding");
            c29721b1 = null;
        }
        ListItem listItem = c29721b1.f137290s;
        AbstractC19074t.m100205c(listItem);
        if (this.f49376c1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItem.setVisibility(i11);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
        zAppCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_user_circle_line_24, AbstractC2807a.list_item_title_leading_icon));
        listItem.m90587c(zAppCompatImageView);
        listItem.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        listItem.setOnClickListener(new View.OnClickListener() { // from class: dz.l
            public /* synthetic */ ViewOnClickListenerC18143l() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetSelectAvatarMethodView.m50052NL(BottomSheetSelectAvatarMethodView.this, view);
            }
        });
        C29721b1 c29721b13 = this.f49375b1;
        if (c29721b13 == null) {
            AbstractC19074t.m100223u("binding");
            c29721b13 = null;
        }
        ListItem listItem2 = c29721b13.f137289r;
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(listItem2.getContext());
        zAppCompatImageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(m92689tK2, AbstractC23322a.zds_ic_camera_line_24, AbstractC2807a.list_item_title_leading_icon));
        listItem2.m90587c(zAppCompatImageView2);
        listItem2.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        listItem2.setOnClickListener(new View.OnClickListener() { // from class: dz.m
            public /* synthetic */ ViewOnClickListenerC18144m() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetSelectAvatarMethodView.m50053OL(BottomSheetSelectAvatarMethodView.this, view);
            }
        });
        C29721b1 c29721b14 = this.f49375b1;
        if (c29721b14 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29721b12 = c29721b14;
        }
        ListItem listItem3 = c29721b12.f137288q;
        ZAppCompatImageView zAppCompatImageView3 = new ZAppCompatImageView(listItem3.getContext());
        zAppCompatImageView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        zAppCompatImageView3.setImageDrawable(C27280g.m139660c(m92689tK3, AbstractC23322a.zds_ic_add_photo_line_24, AbstractC2807a.list_item_title_leading_icon));
        listItem3.m90587c(zAppCompatImageView3);
        listItem3.m90592m(false);
        listItem3.setOnClickListener(new View.OnClickListener() { // from class: dz.n
            public /* synthetic */ ViewOnClickListenerC18145n() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetSelectAvatarMethodView.m50051ML(BottomSheetSelectAvatarMethodView.this, view);
            }
        });
    }

    /* renamed from: ML */
    public static final void m50051ML(BottomSheetSelectAvatarMethodView bottomSheetSelectAvatarMethodView, View view) {
        AbstractC19074t.m100208f(bottomSheetSelectAvatarMethodView, "this$0");
        Intent intent = new Intent();
        intent.putExtra("BOTTOM_SHEET_SELECTION", "SELECT_CHOOSE_FROM_DEVICE");
        C24848g0 c24848g0 = C24848g0.f119245a;
        bottomSheetSelectAvatarMethodView.mo50035CK(-1, intent);
        bottomSheetSelectAvatarMethodView.close();
    }

    /* renamed from: NL */
    public static final void m50052NL(BottomSheetSelectAvatarMethodView bottomSheetSelectAvatarMethodView, View view) {
        AbstractC19074t.m100208f(bottomSheetSelectAvatarMethodView, "this$0");
        Intent intent = new Intent();
        intent.putExtra("BOTTOM_SHEET_SELECTION", "SELECT_VIEW_PROFILE_AVATAR");
        C24848g0 c24848g0 = C24848g0.f119245a;
        bottomSheetSelectAvatarMethodView.mo50035CK(-1, intent);
        bottomSheetSelectAvatarMethodView.close();
    }

    /* renamed from: OL */
    public static final void m50053OL(BottomSheetSelectAvatarMethodView bottomSheetSelectAvatarMethodView, View view) {
        AbstractC19074t.m100208f(bottomSheetSelectAvatarMethodView, "this$0");
        Intent intent = new Intent();
        intent.putExtra("BOTTOM_SHEET_SELECTION", "SELECT_TAKE_NEW_PHOTO");
        C24848g0 c24848g0 = C24848g0.f119245a;
        bottomSheetSelectAvatarMethodView.mo50035CK(-1, intent);
        bottomSheetSelectAvatarMethodView.close();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f49376c1 = m92642L3.getBoolean("EXTRA_IS_SET_AVATAR", false);
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
        C29721b1 m147749c = C29721b1.m147749c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147749c, "inflate(...)");
        this.f49375b1 = m147749c;
        m90525tL(true);
        m90528wL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m50050LL();
    }
}
