package com.zing.zalo.p077ui.toolstorage.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2807a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageVoiceViewer;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import i60.C20338d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k30.C21459a;
import l30.AbstractC22055v0;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p241ij.C20568e;
import p266jg.AbstractC21244b;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import p649xl.AbstractC29961o7;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import ui0.C27280g;
import vg.AbstractRunnableC28185s6;
import wa0.C28877h0;

/* loaded from: classes6.dex */
public final class ToolStorageVoiceViewer extends BaseZaloView {
    public static final C13375a Companion = new C13375a(null);

    /* renamed from: M0 */
    private AbstractC29961o7 f68569M0;

    /* renamed from: N0 */
    private C28877h0 f68570N0;

    /* renamed from: O0 */
    private C16972e0 f68571O0;

    /* renamed from: P0 */
    private ArrayList f68572P0;

    /* renamed from: Q0 */
    private int f68573Q0;

    /* renamed from: R0 */
    private View f68574R0;

    /* renamed from: S0 */
    private View f68575S0;

    /* renamed from: T0 */
    private ArrayList f68576T0 = new ArrayList();

    /* renamed from: U0 */
    private ToolStorageDetailPage.EnumC13333a f68577U0 = ToolStorageDetailPage.EnumC13333a.f68483q;

    /* renamed from: V0 */
    private final InterfaceC24854k f68578V0;

    /* renamed from: W0 */
    private final C13378d f68579W0;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageVoiceViewer$a */
    /* loaded from: classes6.dex */
    public static final class C13375a {
        private C13375a() {
        }

        public /* synthetic */ C13375a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageVoiceViewer$b */
    /* loaded from: classes6.dex */
    public static final class C13376b extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ ToolStorageVoiceViewer f68580A;

        /* renamed from: B */
        final /* synthetic */ MessageId f68581B;

        /* renamed from: z */
        final /* synthetic */ View f68582z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13376b(View view, ToolStorageVoiceViewer toolStorageVoiceViewer, MessageId messageId, List list) {
            super((AbstractRunnableC28185s6.b) view, list, 1057);
            this.f68582z = view;
            this.f68580A = toolStorageVoiceViewer;
            this.f68581B = messageId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m75056h(ArrayList arrayList, MessageId messageId, View view, ToolStorageVoiceViewer toolStorageVoiceViewer) {
            AbstractC19074t.m100208f(arrayList, "$profiles");
            AbstractC19074t.m100208f(messageId, "$it");
            AbstractC19074t.m100208f(toolStorageVoiceViewer, "this$0");
            if (arrayList.size() > 0) {
                Object obj = arrayList.get(0);
                AbstractC19074t.m100207e(obj, "get(...)");
                ContactProfile contactProfile = (ContactProfile) obj;
                if (AbstractC19074t.m100204b(contactProfile.f42434r, messageId.m41048l())) {
                    GroupAvatarView groupAvatarView = (GroupAvatarView) view;
                    groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(toolStorageVoiceViewer.getContext()));
                    groupAvatarView.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(toolStorageVoiceViewer.getContext())), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(toolStorageVoiceViewer.getContext())));
                    groupAvatarView.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                    groupAvatarView.m75731c(contactProfile);
                }
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(final ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "profiles");
            final ToolStorageVoiceViewer toolStorageVoiceViewer = this.f68580A;
            final MessageId messageId = this.f68581B;
            final View view = this.f68582z;
            toolStorageVoiceViewer.mo70710wy(new Runnable() { // from class: wa0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageVoiceViewer.C13376b.m75056h(arrayList, messageId, view, toolStorageVoiceViewer);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageVoiceViewer$c */
    /* loaded from: classes6.dex */
    static final class C13377c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13377c f68583q = new C13377c();

        C13377c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageVoiceViewer$d */
    /* loaded from: classes6.dex */
    public static final class C13378d implements ViewPager.InterfaceC6875j {
        C13378d() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            ArrayList arrayList = ToolStorageVoiceViewer.this.f68572P0;
            String str = null;
            if (arrayList == null) {
                AbstractC19074t.m100223u("voiceViewerItems");
                arrayList = null;
            }
            Object obj = arrayList.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            VoiceViewerItem voiceViewerItem = (VoiceViewerItem) obj;
            ToolStorageVoiceViewer.this.f68573Q0 = i11;
            ToolStorageVoiceViewer toolStorageVoiceViewer = ToolStorageVoiceViewer.this;
            ActionBar actionBar = toolStorageVoiceViewer.f88760a0;
            Context context = toolStorageVoiceViewer.getContext();
            if (context != null) {
                str = context.getString(AbstractC8020f0.share_voice);
            }
            actionBar.setTitle(str);
            ToolStorageVoiceViewer toolStorageVoiceViewer2 = ToolStorageVoiceViewer.this;
            toolStorageVoiceViewer2.f88760a0.setSubtitle(toolStorageVoiceViewer2.m75045qM(voiceViewerItem.m75064f()));
            ToolStorageVoiceViewer.this.m75044pM(i11);
            if (voiceViewerItem.m75062d().length() > 0) {
                C28877h0 c28877h0 = ToolStorageVoiceViewer.this.f68570N0;
                if (c28877h0 != null) {
                    c28877h0.m144314H(i11);
                    return;
                }
                return;
            }
            if (voiceViewerItem.m75063e() != null) {
                C28877h0 c28877h02 = ToolStorageVoiceViewer.this.f68570N0;
                if (c28877h02 != null) {
                    c28877h02.m144313G(i11, voiceViewerItem.m75065g());
                    return;
                }
                return;
            }
            ToastUtils.showMess(ToolStorageVoiceViewer.this.m92652XI(AbstractC8020f0.error_unknown));
        }
    }

    public ToolStorageVoiceViewer() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C13377c.f68583q);
        this.f68578V0 = m129210a;
        this.f68579W0 = new C13378d();
    }

    /* renamed from: AM */
    private final void m75029AM() {
        try {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m92652XI = m92652XI(AbstractC8020f0.str_confirm_delete_multi_item_media_title2_single);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C16972e0.a m90918B = m90932i.m90918B(m92652XI);
            int i11 = AbstractC8020f0.str_tool_storage_overview_free_up_storage;
            Object[] objArr = new Object[1];
            ArrayList arrayList = this.f68572P0;
            if (arrayList == null) {
                AbstractC19074t.m100223u("voiceViewerItems");
                arrayList = null;
            }
            objArr[0] = C21459a.m111038f(((VoiceViewerItem) arrayList.get(this.f68573Q0)).m75061c(), 0, 2, null);
            Spanned m119746j = AbstractC23244v8.m119746j(m92653YI(i11, objArr));
            AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
            this.f68571O0 = m90918B.m90949z(m119746j).m90921E(true).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: wa0.b0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ToolStorageVoiceViewer.m75030BM(ToolStorageVoiceViewer.this, interfaceC17463d, i12);
                }
            }).m90933j(AbstractC8020f0.str_btn_later, new InterfaceC17463d.d() { // from class: wa0.c0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ToolStorageVoiceViewer.m75031CM(interfaceC17463d, i12);
                }
            }).m90931h("delete_data_dialog").m90947x("delete_only_media_button").m90937n("close_dialog_button").m90923G();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m75030BM(ToolStorageVoiceViewer toolStorageVoiceViewer, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageVoiceViewer, "this$0");
        try {
            ArrayList arrayList = toolStorageVoiceViewer.f68572P0;
            if (arrayList == null) {
                AbstractC19074t.m100223u("voiceViewerItems");
                arrayList = null;
            }
            long m75061c = ((VoiceViewerItem) arrayList.get(toolStorageVoiceViewer.f68573Q0)).m75061c();
            toolStorageVoiceViewer.m75042nM(toolStorageVoiceViewer.f68573Q0);
            ToastUtils.showMess(true, (CharSequence) AbstractC23244v8.m119746j(toolStorageVoiceViewer.m92653YI(AbstractC8020f0.str_tool_storage_overview_clear_cache_snackbar, C21459a.m111038f(m75061c, 0, 2, null))));
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m75031CM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: nM */
    private final void m75042nM(int i11) {
        ArrayList arrayList = this.f68576T0;
        ArrayList arrayList2 = this.f68572P0;
        ArrayList arrayList3 = null;
        if (arrayList2 == null) {
            AbstractC19074t.m100223u("voiceViewerItems");
            arrayList2 = null;
        }
        arrayList.add(((VoiceViewerItem) arrayList2.get(i11)).m75060b(this.f68577U0));
        ArrayList arrayList4 = this.f68572P0;
        if (arrayList4 == null) {
            AbstractC19074t.m100223u("voiceViewerItems");
        } else {
            arrayList3 = arrayList4;
        }
        arrayList3.remove(i11);
        m75051wM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m75043oM(C20568e c20568e, ToolStorageVoiceViewer toolStorageVoiceViewer, MessageId messageId) {
        AbstractC19074t.m100208f(toolStorageVoiceViewer, "this$0");
        try {
            if (c20568e != null) {
                toolStorageVoiceViewer.m75047sM(c20568e);
            } else {
                toolStorageVoiceViewer.m75049uM(messageId);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public final void m75044pM(int i11) {
        View view;
        List m131496e;
        GroupAvatarView groupAvatarView;
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getAvatarLayout() == null && (groupAvatarView = (GroupAvatarView) this.f88760a0.m92717l(AbstractC7409c0.action_menu_item_group_avatar_layout).findViewById(AbstractC6918a0.imvAvatar)) != null) {
            groupAvatarView.setImageResource(AbstractC16803z.default_avatar);
        }
        ActionBar actionBar2 = this.f88760a0;
        ArrayList arrayList = null;
        if (actionBar2 != null) {
            view = actionBar2.getAvatarLayout();
        } else {
            view = null;
        }
        if (view instanceof GroupAvatarView) {
            ArrayList arrayList2 = this.f68572P0;
            if (arrayList2 == null) {
                AbstractC19074t.m100223u("voiceViewerItems");
            } else {
                arrayList = arrayList2;
            }
            Object obj = arrayList.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            MessageId m75063e = ((VoiceViewerItem) obj).m75063e();
            if (m75063e != null) {
                m131496e = AbstractC25366r.m131496e(m75063e.m41048l());
                new C13376b(view, this, m75063e, m131496e).m141750b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final String m75045qM(long j11) {
        if (j11 <= 0) {
            return "";
        }
        try {
            return new SimpleDateFormat("dd-MM-yyyy • HH:mm").format(new Date(j11));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: rM */
    private final Handler m75046rM() {
        return (Handler) this.f68578V0.getValue();
    }

    /* renamed from: sM */
    private final void m75047sM(C20568e c20568e) {
        if (c20568e == null || c20568e.m107019c() != 6) {
            return;
        }
        m75049uM(c20568e.m107018b());
    }

    /* renamed from: tM */
    private final void m75048tM() {
        C28877h0 c28877h0 = new C28877h0();
        this.f68570N0 = c28877h0;
        ArrayList arrayList = this.f68572P0;
        AbstractC29961o7 abstractC29961o7 = null;
        if (arrayList == null) {
            AbstractC19074t.m100223u("voiceViewerItems");
            arrayList = null;
        }
        c28877h0.m144315I(arrayList);
        AbstractC29961o7 abstractC29961o72 = this.f68569M0;
        if (abstractC29961o72 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29961o72 = null;
        }
        abstractC29961o72.f138876P.setPageMargin(5);
        AbstractC29961o7 abstractC29961o73 = this.f68569M0;
        if (abstractC29961o73 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29961o73 = null;
        }
        abstractC29961o73.f138876P.setAdapter(this.f68570N0);
        AbstractC29961o7 abstractC29961o74 = this.f68569M0;
        if (abstractC29961o74 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            abstractC29961o7 = abstractC29961o74;
        }
        abstractC29961o7.f138876P.addOnPageChangeListener(this.f68579W0);
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar_white);
        }
        ActionBar actionBar2 = this.f88760a0;
        if (actionBar2 != null) {
            actionBar2.setTitleColor(C23212s8.m119606n(AbstractC2807a.text_01));
        }
        ActionBar actionBar3 = this.f88760a0;
        if (actionBar3 != null) {
            actionBar3.setSubTitleColor(C23212s8.m119606n(AbstractC2807a.text_02));
        }
    }

    /* renamed from: uM */
    private final void m75049uM(MessageId messageId) {
        int i11;
        try {
            ArrayList arrayList = this.f68572P0;
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                AbstractC19074t.m100223u("voiceViewerItems");
                arrayList = null;
            }
            if (arrayList.size() > 0) {
                ArrayList arrayList3 = this.f68572P0;
                if (arrayList3 == null) {
                    AbstractC19074t.m100223u("voiceViewerItems");
                    arrayList3 = null;
                }
                synchronized (arrayList3) {
                    try {
                        ArrayList arrayList4 = this.f68572P0;
                        if (arrayList4 == null) {
                            AbstractC19074t.m100223u("voiceViewerItems");
                            arrayList4 = null;
                        }
                        int size = arrayList4.size();
                        i11 = -1;
                        for (int i12 = 0; i12 < size; i12++) {
                            ArrayList arrayList5 = this.f68572P0;
                            if (arrayList5 == null) {
                                AbstractC19074t.m100223u("voiceViewerItems");
                                arrayList5 = null;
                            }
                            Object obj = arrayList5.get(i12);
                            AbstractC19074t.m100207e(obj, "get(...)");
                            VoiceViewerItem voiceViewerItem = (VoiceViewerItem) obj;
                            if (messageId != null && AbstractC19074t.m100204b(messageId, voiceViewerItem.m75063e())) {
                                i11 = i12;
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
            } else {
                i11 = -1;
            }
            if (i11 > -1) {
                ArrayList arrayList6 = this.f68576T0;
                ArrayList arrayList7 = this.f68572P0;
                if (arrayList7 == null) {
                    AbstractC19074t.m100223u("voiceViewerItems");
                } else {
                    arrayList2 = arrayList7;
                }
                arrayList6.add(((VoiceViewerItem) arrayList2.get(i11)).m75060b(this.f68577U0));
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_deleted));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    private final void m75050vM(int i11) {
        String str;
        AbstractC29961o7 abstractC29961o7 = this.f68569M0;
        ArrayList arrayList = null;
        if (abstractC29961o7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29961o7 = null;
        }
        abstractC29961o7.f138876P.setCurrentItem(i11);
        ActionBar actionBar = this.f88760a0;
        Context context = getContext();
        if (context != null) {
            str = context.getString(AbstractC8020f0.share_voice);
        } else {
            str = null;
        }
        actionBar.setTitle(str);
        ActionBar actionBar2 = this.f88760a0;
        ArrayList arrayList2 = this.f68572P0;
        if (arrayList2 == null) {
            AbstractC19074t.m100223u("voiceViewerItems");
        } else {
            arrayList = arrayList2;
        }
        actionBar2.setSubtitle(m75045qM(((VoiceViewerItem) arrayList.get(i11)).m75064f()));
    }

    /* renamed from: wM */
    private final void m75051wM() {
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 == null) {
                m92642L3 = new Bundle();
            }
            Intent intent = new Intent();
            intent.putExtras(m92642L3);
            if (this.f68576T0.size() > 0) {
                intent.putStringArrayListExtra("deleted_voices", this.f68576T0);
            }
            mo50035CK(-1, intent);
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: xM */
    private final void m75052xM() {
        try {
            Context context = getContext();
            if (context == null) {
                return;
            }
            ArrayList arrayList = this.f68572P0;
            if (arrayList == null) {
                AbstractC19074t.m100223u("voiceViewerItems");
                arrayList = null;
            }
            final long m75061c = ((VoiceViewerItem) arrayList.get(this.f68573Q0)).m75061c();
            C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String quantityString = context.getResources().getQuantityString(AbstractC7921d0.str_delete_my_cloud_item_title, 1, 1);
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            C16972e0.a m90918B = m90932i.m90918B(quantityString);
            String string = m92651WI().getString(AbstractC8020f0.str_delete_my_cloud_item_desc);
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f68571O0 = m90918B.m90949z(string).m90921E(true).m90942s(AbstractC8020f0.str_delete_my_cloud_btn_delete, new InterfaceC17463d.d() { // from class: wa0.d0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageVoiceViewer.m75053yM(ToolStorageVoiceViewer.this, m75061c, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: wa0.e0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageVoiceViewer.m75054zM(interfaceC17463d, i11);
                }
            }).m90923G();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m75053yM(ToolStorageVoiceViewer toolStorageVoiceViewer, long j11, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageVoiceViewer, "this$0");
        try {
            toolStorageVoiceViewer.m75042nM(toolStorageVoiceViewer.f68573Q0);
            ToastUtils.showMess(true, (CharSequence) AbstractC23244v8.m119746j(toolStorageVoiceViewer.m92653YI(AbstractC8020f0.str_tool_storage_overview_clear_cache_snackbar, C21459a.m111038f(j11, 0, 2, null))));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m75054zM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ArrayList arrayList;
        int i11;
        String m74885c;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        ArrayList arrayList2 = null;
        if (m92642L3 != null) {
            arrayList = m92642L3.getParcelableArrayList("voice_list");
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f68572P0 = arrayList;
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("select_pos", 0);
        } else {
            i11 = 0;
        }
        this.f68573Q0 = i11;
        ToolStorageDetailPage.EnumC13333a.a aVar = ToolStorageDetailPage.EnumC13333a.Companion;
        Bundle m92642L33 = m92642L3();
        if (m92642L33 == null || (m74885c = m92642L33.getString("EXTRA_TYPE")) == null) {
            m74885c = ToolStorageDetailPage.EnumC13333a.f68483q.m74885c();
        }
        AbstractC19074t.m100205c(m74885c);
        this.f68577U0 = aVar.m74886a(m74885c);
        int i12 = this.f68573Q0;
        ArrayList arrayList3 = this.f68572P0;
        if (arrayList3 == null) {
            AbstractC19074t.m100223u("voiceViewerItems");
        } else {
            arrayList2 = arrayList3;
        }
        if (i12 >= arrayList2.size()) {
            this.f68573Q0 = 0;
        }
        if (bundle != null && bundle.containsKey("deleted_voices")) {
            this.f68576T0.clear();
            ArrayList arrayList4 = this.f68576T0;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("deleted_voices");
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            arrayList4.addAll(stringArrayList);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC29961o7 m148320Q = AbstractC29961o7.m148320Q(layoutInflater.inflate(AbstractC7409c0.layout_tool_storage_voice_viewer, viewGroup, false));
        AbstractC19074t.m100207e(m148320Q, "bind(...)");
        this.f68569M0 = m148320Q;
        m92637BK(true);
        AbstractC29961o7 abstractC29961o7 = this.f68569M0;
        if (abstractC29961o7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29961o7 = null;
        }
        View root = abstractC29961o7.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AbstractC29961o7 abstractC29961o7 = this.f68569M0;
        if (abstractC29961o7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29961o7 = null;
        }
        abstractC29961o7.f138876P.removeOnPageChangeListener(this.f68579W0);
        C16972e0 c16972e0 = this.f68571O0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 9);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.menu_photo_download) {
                ArrayList arrayList = this.f68572P0;
                if (arrayList == null) {
                    AbstractC19074t.m100223u("voiceViewerItems");
                    arrayList = null;
                }
                ((VoiceViewerItem) arrayList.get(this.f68573Q0)).m75067i();
            } else if (i11 == AbstractC6918a0.menu_delete) {
                if (this.f68577U0 != ToolStorageDetailPage.EnumC13333a.f68483q) {
                    m75052xM();
                } else {
                    m75029AM();
                }
            } else if (i11 == 16908332) {
                m75051wM();
            }
            return super.mo37491QJ(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putStringArrayList("deleted_voices", this.f68576T0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBarMenuItem actionBarMenuItem;
        super.mo37493TJ();
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
        }
        if (C23212s8.m119603k()) {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_black);
            }
        } else {
            ActionBar actionBar2 = this.f88760a0;
            if (actionBar2 != null) {
                actionBar2.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            }
        }
        ActionBarMenuItem actionBarMenuItem2 = null;
        if (this.f68577U0 == ToolStorageDetailPage.EnumC13333a.f68483q) {
            ActionBarMenu actionBarMenu2 = this.f88763d0;
            if (actionBarMenu2 != null) {
                int i11 = AbstractC6918a0.menu_photo_download;
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                actionBarMenuItem = actionBarMenu2.m92742i(i11, C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_download_line_24, AbstractC2807a.icon_01));
            } else {
                actionBarMenuItem = null;
            }
            this.f68575S0 = actionBarMenuItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
        }
        ActionBarMenu actionBarMenu3 = this.f88763d0;
        if (actionBarMenu3 != null) {
            int i12 = AbstractC6918a0.menu_delete;
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
            actionBarMenuItem2 = actionBarMenu3.m92742i(i12, C27280g.m139660c(m92689tK2, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.icon_01));
        }
        this.f68574R0 = actionBarMenuItem2;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setVisibility(0);
        }
        m75048tM();
        m75050vM(this.f68573Q0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            m75051wM();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            ArrayList arrayList = AbstractC23304d.f113413n;
            if (arrayList.size() > 0) {
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    m75047sM((C20568e) it.next());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 9) {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.chat.transfer.EventMessageUndoParam");
                C20338d c20338d = (C20338d) obj;
                int m106043a = c20338d.m106043a();
                final MessageId m106044b = c20338d.m106044b();
                final C20568e m106045c = c20338d.m106045c();
                if (m106043a != 6) {
                    return;
                }
                m75046rM().post(new Runnable() { // from class: wa0.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ToolStorageVoiceViewer.m75043oM(C20568e.this, this, m106044b);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 9);
    }
}
