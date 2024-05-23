package com.zing.zalo.p077ui.imageviewer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import com.androidquery.util.C3979l;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.ToolStorageImageViewer;
import com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k30.C21459a;
import l30.AbstractC22055v0;
import me0.AbstractC23034c6;
import me0.AbstractC23244v8;
import p227i3.C20218v;
import p266jg.AbstractC21244b;
import p363nh.C23744a;
import qm0.AbstractC25366r;
import ui0.C27280g;
import vg.AbstractRunnableC28185s6;

/* loaded from: classes5.dex */
public final class ToolStorageImageViewer extends BaseChatImageViewer {
    public static final C12057a Companion = new C12057a(null);

    /* renamed from: j3 */
    private View f62914j3;

    /* renamed from: k3 */
    private boolean f62915k3 = true;

    /* renamed from: l3 */
    private ToolStorageDetailPage.EnumC13333a f62916l3 = ToolStorageDetailPage.EnumC13333a.f68483q;

    /* renamed from: m3 */
    private final View.OnLayoutChangeListener f62917m3 = new View.OnLayoutChangeListener() { // from class: j70.n2
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            ToolStorageImageViewer.m67266CQ(ToolStorageImageViewer.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };

    /* renamed from: com.zing.zalo.ui.imageviewer.ToolStorageImageViewer$a */
    /* loaded from: classes5.dex */
    public static final class C12057a {
        private C12057a() {
        }

        public /* synthetic */ C12057a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.ToolStorageImageViewer$b */
    /* loaded from: classes5.dex */
    public static final class C12058b extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ ToolStorageImageViewer f62918A;

        /* renamed from: z */
        final /* synthetic */ View f62919z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12058b(View view, ToolStorageImageViewer toolStorageImageViewer, List list) {
            super((AbstractRunnableC28185s6.b) view, list, 1057);
            this.f62919z = view;
            this.f62918A = toolStorageImageViewer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m67283h(ArrayList arrayList, ToolStorageImageViewer toolStorageImageViewer, View view) {
            AbstractC19074t.m100208f(arrayList, "$profiles");
            AbstractC19074t.m100208f(toolStorageImageViewer, "this$0");
            if (arrayList.size() > 0) {
                Object obj = arrayList.get(0);
                AbstractC19074t.m100207e(obj, "get(...)");
                ContactProfile contactProfile = (ContactProfile) obj;
                ItemAlbumMobile itemAlbumMobile = toolStorageImageViewer.f62686n1;
                if (itemAlbumMobile != null) {
                    String str = contactProfile.f42434r;
                    AbstractC19074t.m100205c(itemAlbumMobile);
                    if (AbstractC19074t.m100204b(str, itemAlbumMobile.f42593q)) {
                        GroupAvatarView groupAvatarView = (GroupAvatarView) view;
                        groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(toolStorageImageViewer.getContext()));
                        groupAvatarView.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(toolStorageImageViewer.getContext())), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(toolStorageImageViewer.getContext())));
                        groupAvatarView.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                        groupAvatarView.m75731c(contactProfile);
                    }
                }
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(final ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "profiles");
            final ToolStorageImageViewer toolStorageImageViewer = this.f62918A;
            final View view = this.f62919z;
            toolStorageImageViewer.mo70710wy(new Runnable() { // from class: j70.s2
                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageImageViewer.C12058b.m67283h(arrayList, toolStorageImageViewer, view);
                }
            });
        }
    }

    /* renamed from: AQ */
    private final String m67264AQ(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            return itemAlbumMobile.m40536y();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BQ */
    public static final void m67265BQ(View view, float f11) {
        if (view instanceof MediaStorePopulatePage) {
            ((MediaStorePopulatePage) view).m69132G(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CQ */
    public static final void m67266CQ(ToolStorageImageViewer toolStorageImageViewer, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        List list;
        AbstractC19074t.m100208f(toolStorageImageViewer, "this$0");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (toolStorageImageViewer.f62650Q1 != null && (list = toolStorageImageViewer.f62684l1) != null && list.size() > 1) {
            toolStorageImageViewer.f62650Q1.m100950D(view.getHeight());
        }
    }

    /* renamed from: EQ */
    private final void m67267EQ() {
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 == null) {
                m92642L3 = new Bundle();
            }
            Intent intent = new Intent();
            intent.putExtras(m92642L3);
            ArrayList arrayList = this.f62687o1;
            if (arrayList != null && arrayList != null && arrayList.size() > 0) {
                intent.putStringArrayListExtra("deletedPhoto", this.f62687o1);
            }
            mo66825N9(-1, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FQ */
    private final void m67268FQ() {
        final long j11;
        ItemAlbumMobile itemAlbumMobile;
        try {
            Context context = getContext();
            if (context == null) {
                return;
            }
            List list = this.f62684l1;
            if (list != null && (itemAlbumMobile = (ItemAlbumMobile) list.get(this.f62685m1)) != null) {
                j11 = itemAlbumMobile.f42547B0;
            } else {
                j11 = 0;
            }
            C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String quantityString = context.getResources().getQuantityString(AbstractC7921d0.str_delete_my_cloud_item_title, 1, 1);
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            C16972e0.a m90918B = m90932i.m90918B(quantityString);
            String string = m92651WI().getString(AbstractC8020f0.str_delete_my_cloud_item_desc);
            AbstractC19074t.m100207e(string, "getString(...)");
            m90918B.m90949z(string).m90921E(true).m90942s(AbstractC8020f0.str_delete_my_cloud_btn_delete, new InterfaceC17463d.d() { // from class: j70.o2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageImageViewer.m67269GQ(ToolStorageImageViewer.this, j11, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: j70.p2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageImageViewer.m67270HQ(interfaceC17463d, i11);
                }
            }).m90927d().mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GQ */
    public static final void m67269GQ(ToolStorageImageViewer toolStorageImageViewer, long j11, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageImageViewer, "this$0");
        try {
            toolStorageImageViewer.m67280zQ(j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HQ */
    public static final void m67270HQ(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: IQ */
    private final void m67271IQ() {
        final long j11;
        ItemAlbumMobile itemAlbumMobile;
        try {
            List list = this.f62684l1;
            if (list != null && (itemAlbumMobile = (ItemAlbumMobile) list.get(this.f62685m1)) != null) {
                j11 = itemAlbumMobile.f42547B0;
            } else {
                j11 = 0;
            }
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m92652XI = m92652XI(AbstractC8020f0.str_confirm_delete_multi_item_media_title2_single);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C16972e0.a m90918B = m90932i.m90918B(m92652XI);
            Spanned m119746j = AbstractC23244v8.m119746j(m92653YI(AbstractC8020f0.str_tool_storage_overview_free_up_storage, C21459a.m111038f(j11, 0, 2, null)));
            AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
            m90918B.m90949z(m119746j).m90921E(true).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: j70.q2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageImageViewer.m67272JQ(ToolStorageImageViewer.this, j11, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_btn_later, new InterfaceC17463d.d() { // from class: j70.r2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageImageViewer.m67273KQ(interfaceC17463d, i11);
                }
            }).m90927d().mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JQ */
    public static final void m67272JQ(ToolStorageImageViewer toolStorageImageViewer, long j11, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageImageViewer, "this$0");
        try {
            toolStorageImageViewer.m67280zQ(j11);
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KQ */
    public static final void m67273KQ(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: zQ */
    private final void m67280zQ(long j11) {
        m66855dO(this.f62685m1);
        ToastUtils.showMess(true, (CharSequence) AbstractC23244v8.m119746j(m92653YI(AbstractC8020f0.str_tool_storage_overview_clear_cache_snackbar, C21459a.m111038f(j11, 0, 2, null))));
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: AO */
    public void mo66694AO() {
        super.mo66694AO();
        mo50252cO();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: CM */
    public void mo66812CM() {
        ActionBarMenuItem actionBarMenuItem = null;
        this.f62647P0 = null;
        if (this.f62915k3) {
            ActionBarMenuItem m66891yM = m66891yM(AbstractC6918a0.menu_photo_download, AbstractC16803z.icn_header_download_white);
            this.f62647P0 = m66891yM;
            m66891yM.setVisibility(0);
        }
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            int i11 = AbstractC6918a0.menu_delete;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            actionBarMenuItem = actionBarMenu.m92742i(i11, C27280g.m139659b(m92689tK, AbstractC16803z.ic_delete_line, AbstractC16801x.white));
        }
        this.f62914j3 = actionBarMenuItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(0);
        }
    }

    /* renamed from: DQ */
    public final void m67281DQ() {
        Handler handler = this.f62656T1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m67267EQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: HM */
    protected void mo66821HM() {
        m67281DQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        if (this.f62916l3 == ToolStorageDetailPage.EnumC13333a.f68485s) {
            C23744a.Companion.m124119a().m124116d(150806, new Object[0]);
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.menu_photo_download) {
                if (m66882sN()) {
                    m66731pP();
                } else {
                    mo66702OM();
                }
                return true;
            }
            if (i11 == AbstractC6918a0.menu_delete) {
                if (!this.f62915k3) {
                    m67268FQ();
                } else {
                    m67271IQ();
                }
                return true;
            }
            if (i11 == 16908332) {
                m67281DQ();
                return true;
            }
            return super.mo37491QJ(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: cO */
    public void mo50252cO() {
        View view;
        ItemAlbumMobile itemAlbumMobile;
        List m131496e;
        GroupAvatarView groupAvatarView;
        try {
            super.mo50252cO();
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null && actionBar.getAvatarLayout() == null && (groupAvatarView = (GroupAvatarView) this.f88760a0.m92717l(AbstractC7409c0.action_menu_item_group_avatar_layout).findViewById(AbstractC6918a0.imvAvatar)) != null) {
                groupAvatarView.setImageResource(AbstractC16803z.default_avatar);
            }
            ActionBar actionBar2 = this.f88760a0;
            if (actionBar2 != null) {
                view = actionBar2.getAvatarLayout();
            } else {
                view = null;
            }
            if ((view instanceof GroupAvatarView) && (itemAlbumMobile = this.f62686n1) != null) {
                AbstractC19074t.m100205c(itemAlbumMobile);
                m131496e = AbstractC25366r.m131496e(itemAlbumMobile.f42593q);
                new C12058b(view, this, m131496e).m141750b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: iN */
    public int mo66865iN() {
        List list = this.f62684l1;
        if (list != null) {
            AbstractC19074t.m100205c(list);
            return list.size() - this.f62698z1.size();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: iO */
    public String mo66866iO(ItemAlbumMobile itemAlbumMobile, int i11) {
        if (i11 == 1) {
            return m67264AQ(itemAlbumMobile);
        }
        return super.mo66866iO(itemAlbumMobile, i11);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: mp */
    public void mo66726mp(C12063c.g gVar, C12063c.f fVar, int i11, C3979l c3979l) {
        AbstractC19074t.m100208f(fVar, "photoLoadingData");
        super.mo66726mp(gVar, fVar, i11, c3979l);
        if (gVar != null) {
            gVar.m67338U(false);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            m67281DQ();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 109) {
            if (AbstractC23034c6.m118121G()) {
                if (m66882sN()) {
                    m66731pP();
                    return;
                } else {
                    mo66702OM();
                    return;
                }
            }
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C12063c c12063c = this.f62677e1;
        if (c12063c != null && this.f62629A1) {
            AbstractC19074t.m100205c(c12063c);
            c12063c.m67287C(this.f62685m1);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: q9 */
    public void mo66878q9(C12063c.g gVar, C12063c.f fVar, int i11) {
        super.mo66878q9(gVar, fVar, i11);
        if (gVar != null) {
            gVar.m67338U(true);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: qN */
    public void mo66733qN(View view) {
        Serializable serializable;
        AbstractC19074t.m100208f(view, "rootView");
        super.mo66733qN(view);
        ViewPager viewPager = this.f62675d1;
        boolean z11 = false;
        if (viewPager != null) {
            AbstractC19074t.m100205c(viewPager);
            viewPager.setPageTransformer(false, new ViewPager.InterfaceC6877l() { // from class: j70.m2
                @Override // com.zing.p058v4.view.ViewPager.InterfaceC6877l
                /* renamed from: a */
                public final void mo35330a(View view2, float f11) {
                    ToolStorageImageViewer.m67265BQ(view2, f11);
                }
            });
        }
        this.f62561O2.addOnLayoutChangeListener(this.f62917m3);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (serializable = m92642L3.getSerializable("EXTRA_ACCESS_FLOW")) != null) {
            AbstractC19074t.m100206d(serializable, "null cannot be cast to non-null type com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage.AccessFlow");
            ToolStorageDetailPage.EnumC13333a enumC13333a = (ToolStorageDetailPage.EnumC13333a) serializable;
            this.f62916l3 = enumC13333a;
            if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68483q) {
                z11 = true;
            }
            this.f62915k3 = z11;
        }
        this.f62564R2.m67384Z(this.f62915k3);
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
        return 0;
    }
}
