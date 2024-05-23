package com.zing.zalo.p077ui.imageviewer;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import b40.C2526d;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.MainChatImageViewer;
import com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import gw.AbstractC19646n0;
import i40.C20275e;
import i40.InterfaceC20278h;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p103di.C17938e;
import p263jc.C21219v;
import p279jw.C21373a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import v50.C27870vb;

/* loaded from: classes5.dex */
public class MainChatImageViewer extends BaseChatImageViewer implements InterfaceC0733x {

    /* renamed from: j3 */
    MediaStorePopulatePage.InterfaceC12300b f62893j3 = new C12050a();

    /* renamed from: com.zing.zalo.ui.imageviewer.MainChatImageViewer$a */
    /* loaded from: classes5.dex */
    class C12050a implements MediaStorePopulatePage.InterfaceC12300b {
        C12050a() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.InterfaceC12300b
        /* renamed from: a */
        public List mo67229a() {
            return MainChatImageViewer.this.f62684l1;
        }

        @Override // com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.InterfaceC12300b
        /* renamed from: b */
        public void mo67230b() {
            MainChatImageViewer.this.finish();
            MainChatImageViewer.this.m66715gQ("view_full_photo_populate");
        }

        @Override // com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.InterfaceC12300b
        /* renamed from: c */
        public String mo67231c() {
            return MainChatImageViewer.this.f62696x1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vQ */
    public static /* synthetic */ void m67224vQ(View view, float f11) {
        if (view instanceof MediaStorePopulatePage) {
            ((MediaStorePopulatePage) view).m69132G(f11);
        }
    }

    /* renamed from: xQ */
    private void m67225xQ() {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        int i17 = 0;
        if (itemAlbumMobile != null && itemAlbumMobile.m40511V()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m66882sN = m66882sN();
        View view = this.f62647P0;
        if (z11) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(view, i11);
        View view2 = this.f62641M0;
        if (this.f62659V0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(view2, i12);
        View view3 = this.f62549C2;
        if (z11) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        AbstractC23136l9.m118744r1(view3, i13);
        View view4 = this.f62551E2;
        if (z11) {
            i14 = 8;
        } else {
            i14 = 0;
        }
        AbstractC23136l9.m118744r1(view4, i14);
        View view5 = this.f62550D2;
        if (!m66882sN && !z11) {
            i15 = 0;
        } else {
            i15 = 8;
        }
        AbstractC23136l9.m118744r1(view5, i15);
        View view6 = this.f62552F2;
        if (!m66882sN && !z11) {
            i16 = 0;
        } else {
            i16 = 8;
        }
        AbstractC23136l9.m118744r1(view6, i16);
        View view7 = this.f62553G2;
        if (m66882sN || z11) {
            i17 = 8;
        }
        AbstractC23136l9.m118744r1(view7, i17);
        mo66696DO();
    }

    /* renamed from: yQ */
    private void m67226yQ() {
        try {
            ItemAlbumMobile m66856eN = m66856eN(this.f62685m1);
            if (m66856eN != null && m66856eN.f42598s0 != null) {
                ((C21219v) C21219v.Companion.m122672a()).m109954R(m66856eN.f42598s0.m40599m());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainChatImageViewer", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: AO */
    public void mo66694AO() {
        super.mo66694AO();
        m67225xQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        mo66819FM(true);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: CM */
    public void mo66812CM() {
        int i11;
        this.f62647P0 = null;
        if (this.f62693u1) {
            this.f62647P0 = m66891yM(AbstractC6918a0.menu_photo_download, AbstractC16803z.icn_header_download_white);
        }
        if (this.f62659V0) {
            this.f62641M0 = m66893zM(AbstractC6918a0.menu_view_original_msg_csc, AbstractC8020f0.str_view_original_msg);
        }
        if (this.f62582j2) {
            this.f62550D2 = m66893zM(AbstractC6918a0.menu_edit_photo, AbstractC8020f0.str_menu_edit_photo);
        }
        if (this.f62693u1) {
            this.f62549C2 = m66893zM(AbstractC6918a0.menu_photo_download, AbstractC8020f0.str_menu_photo_download);
        }
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null && AbstractC25495a.m132078c(this.f62686n1.m40496C().m41048l()) && C21373a.f104231a.m110807w().m110825b()) {
            this.f62554H2 = m66893zM(AbstractC6918a0.menu_add_to_collection, AbstractC8020f0.str_btn_add_item_to_collection);
        }
        if (this.f62694v1) {
            this.f62551E2 = m66893zM(AbstractC6918a0.menu_share, AbstractC8020f0.share);
        }
        if (this.f62587o2 && this.f62588p2) {
            this.f62552F2 = m66893zM(AbstractC6918a0.menu_update_group_avatar, AbstractC8020f0.str_change_avatar_group_title);
        }
        if (this.f62695w1 && this.f62588p2 && !this.f62587o2) {
            int i12 = AbstractC6918a0.menu_set_group_avatar;
            if (m66742vP()) {
                i11 = AbstractC8020f0.str_set_as_community_avatar;
            } else {
                i11 = AbstractC8020f0.str_set_as_group_avatar;
            }
            this.f62553G2 = m66893zM(i12, i11);
        }
        m67225xQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: FM */
    void mo66819FM(boolean z11) {
        List list;
        if (this.f62698z1.size() <= 0 && (list = this.f62684l1) != null && !list.isEmpty() && m67228wQ()) {
            if (!C23250w4.f112644a.m119844s()) {
                ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                itemAlbumMobile.f42591p = -1;
                itemAlbumMobile.f42579d0 = this.f62696x1;
                this.f62684l1.add(0, itemAlbumMobile);
                this.f62698z1.add(0);
                this.f62685m1++;
            }
            ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile();
            itemAlbumMobile2.f42591p = -1;
            itemAlbumMobile2.f42579d0 = this.f62696x1;
            this.f62684l1.add(itemAlbumMobile2);
            this.f62698z1.add(Integer.valueOf(this.f62684l1.size() - 1));
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: KM */
    public C12063c mo66822KM() {
        C12063c mo66822KM = super.mo66822KM();
        mo66822KM.f62931D = this.f62893j3;
        return mo66822KM;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.action_bar_menu_more) {
                AbstractC23647d.m123897g("90014410");
                return false;
            }
            if (i11 == AbstractC6918a0.menu_view_original_msg_csc) {
                m67227uQ();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_download) {
                AbstractC23647d.m123897g("90014412");
                if (m66882sN()) {
                    m66731pP();
                } else {
                    mo66702OM();
                }
                ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null) {
                    ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                    C2526d.f10270a.m12689M(AbstractC19646n0.m102950Z(itemAlbumMobile2.f42579d0, itemAlbumMobile2.m40496C()), -1, mo66847ZM(), this.f62655T0);
                }
                return true;
            }
            if (i11 == AbstractC6918a0.menu_share) {
                AbstractC23647d.m123897g("90014413");
                mo66737rP(8, 9, true, mo66847ZM());
                return true;
            }
            if (i11 == AbstractC6918a0.menu_edit_photo) {
                AbstractC23647d.m123897g("90014411");
                C0815e1.m2075D().m2100V(new C23648e(34, "chat_photomsg", 0, "photomsg_openedit", new String[0]), false);
                m66712eQ();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_shared_media) {
                AbstractC23647d.m123897g("90014415");
                m66715gQ("");
                return true;
            }
            if (i11 == AbstractC6918a0.menu_set_group_avatar) {
                m66722kQ();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_update_group_avatar) {
                mo66825N9(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, null);
                return true;
            }
            if (i11 == AbstractC6918a0.menu_add_to_collection) {
                m66709cQ("msg_fullscreen");
                return true;
            }
            return super.mo37491QJ(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: TN */
    public void mo66835TN() {
        super.mo66835TN();
        m67226yQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: c6 */
    public void mo66708c6(List list) {
        if (this.f62684l1 != list) {
            mo66819FM(false);
        }
        super.mo66708c6(list);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MainChatImageViewer";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: iN */
    public int mo66865iN() {
        List list = this.f62684l1;
        if (list != null) {
            return list.size() - this.f62698z1.size();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: iQ */
    public void mo66718iQ(String str, int i11, MessageId messageId, boolean z11) {
        super.mo66718iQ(str, i11, messageId, z11);
        if (!TextUtils.isEmpty(str) && str.equals(this.f62696x1) && !z11) {
            this.f62691s1 = true;
        }
        if (!this.f62698z1.isEmpty()) {
            for (int i12 = 0; i12 < this.f62675d1.getChildCount(); i12++) {
                View childAt = this.f62675d1.getChildAt(i12);
                if (childAt instanceof MediaStorePopulatePage) {
                    ((MediaStorePopulatePage) childAt).m69133H(messageId);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        super.mo66727nN(bundle);
        mo66736rO(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: oN */
    public void mo66876oN(Bundle bundle) {
        C20275e c20275e;
        SparseIntArray sparseIntArray;
        SparseArray sparseArray;
        super.mo66876oN(bundle);
        if (C23250w4.f112644a.m119844s()) {
            try {
                if (m66705aQ()) {
                    C17938e c17938e = new C17938e(this.f62696x1, this.f62695w1);
                    this.f62688p1 = c17938e;
                    c17938e.m94604u(this.f62672b2);
                    InterfaceC20278h interfaceC20278h = this.f62669a1;
                    if (interfaceC20278h != null) {
                        c20275e = interfaceC20278h.mo56694u();
                    } else {
                        c20275e = null;
                    }
                    if (c20275e != null) {
                        SparseIntArray m105872f = c20275e.m105872f();
                        sparseArray = c20275e.m105873g();
                        sparseIntArray = m105872f;
                    } else {
                        sparseIntArray = null;
                        sparseArray = null;
                    }
                    this.f62688p1.mo94600o(this.f62684l1, this.f62685m1, sparseIntArray, sparseArray, this.f62571Y2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C12063c c12063c = this.f62677e1;
        if (c12063c != null && this.f62629A1) {
            c12063c.m67287C(this.f62685m1);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: qN */
    public void mo66733qN(View view) {
        super.mo66733qN(view);
        ViewPager viewPager = this.f62675d1;
        if (viewPager != null) {
            viewPager.setPageTransformer(false, new ViewPager.InterfaceC6877l() { // from class: j70.j2
                @Override // com.zing.p058v4.view.ViewPager.InterfaceC6877l
                /* renamed from: a */
                public final void mo35330a(View view2, float f11) {
                    MainChatImageViewer.m67224vQ(view2, f11);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: sn */
    public void mo66883sn(C12063c.g gVar, int i11) {
        ActionBar actionBar;
        super.mo66883sn(gVar, i11);
        if (this.f62629A1 && (actionBar = this.f88760a0) != null) {
            actionBar.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: tP */
    public int mo66739tP() {
        return 4;
    }

    /* renamed from: uQ */
    void m67227uQ() {
        try {
            if (this.f62686n1 == null) {
                return;
            }
            this.f62691s1 = true;
            Bundle m140776b = new C27870vb(this.f62696x1).m140781h(this.f62686n1.m40496C()).m140776b();
            if (this.f72421L0.m92676n2() != null) {
                if (AbstractC25495a.m132078c(this.f62696x1)) {
                    C21373a c21373a = C21373a.f104231a;
                    if (c21373a.m110807w().m110825b()) {
                        c21373a.m110793P(C11598e.e.f60096p.ordinal());
                    }
                }
                this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: vN */
    protected boolean mo66887vN() {
        return true;
    }

    /* renamed from: wQ */
    boolean m67228wQ() {
        if (this.f62695w1 && m66723lP()) {
            return true;
        }
        return false;
    }
}
