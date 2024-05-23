package com.zing.zalo.p077ui.imageviewer;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import au.EnumC2382z;
import b40.C2526d;
import ci.C3509j0;
import ci.C3522q;
import ci.C3531z;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.MediaStoreImageViewer;
import com.zing.zalo.p077ui.mediastore.C12340b;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import i40.C20275e;
import i40.InterfaceC20278h;
import is.C20815q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p103di.C17941h;
import p241ij.C20568e;
import p263jc.C21219v;
import p266jg.AbstractC21244b;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p361nb.C23662s;
import p361nb.EnumC23654k;
import p361nb.EnumC23663t;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31950hc;
import p716zh.C31973j5;
import v50.C27870vb;
import vg.AbstractRunnableC28185s6;

/* loaded from: classes5.dex */
public class MediaStoreImageViewer extends BaseChatImageViewer implements InterfaceC0733x {

    /* renamed from: j3 */
    boolean f62895j3;

    /* renamed from: l3 */
    View f62897l3;

    /* renamed from: m3 */
    View f62898m3;

    /* renamed from: n3 */
    Snackbar f62899n3;

    /* renamed from: o3 */
    ItemAlbumMobile f62900o3;

    /* renamed from: p3 */
    int f62901p3;

    /* renamed from: t3 */
    KeyEventCallbackC17462c f62905t3;

    /* renamed from: k3 */
    boolean f62896k3 = false;

    /* renamed from: q3 */
    Set f62902q3 = new HashSet();

    /* renamed from: r3 */
    int f62903r3 = 0;

    /* renamed from: s3 */
    EnumC23663t f62904s3 = EnumC23663t.f114624q;

    /* renamed from: com.zing.zalo.ui.imageviewer.MediaStoreImageViewer$a */
    /* loaded from: classes5.dex */
    public class C12051a extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ GroupAvatarView f62907z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12051a(AbstractRunnableC28185s6.b bVar, List list, int i11, GroupAvatarView groupAvatarView) {
            super(bVar, list, i11);
            this.f62907z = groupAvatarView;
        }

        /* renamed from: h */
        public /* synthetic */ void m67254h(ArrayList arrayList, GroupAvatarView groupAvatarView) {
            ContactProfile contactProfile;
            ItemAlbumMobile itemAlbumMobile;
            if (arrayList.size() > 0 && (contactProfile = (ContactProfile) arrayList.get(0)) != null && (itemAlbumMobile = MediaStoreImageViewer.this.f62686n1) != null && contactProfile.f42434r.equals(itemAlbumMobile.f42593q)) {
                groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(groupAvatarView.getContext()));
                groupAvatarView.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(MediaStoreImageViewer.this.getContext())), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(MediaStoreImageViewer.this.getContext())));
                groupAvatarView.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                groupAvatarView.m75731c(contactProfile);
                groupAvatarView.setOnClickListener(MediaStoreImageViewer.this);
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            MediaStoreImageViewer.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.a0

                /* renamed from: q */
                public final /* synthetic */ ArrayList f62922q;

                /* renamed from: r */
                public final /* synthetic */ GroupAvatarView f62923r;

                public /* synthetic */ RunnableC12060a0(ArrayList arrayList2, GroupAvatarView groupAvatarView) {
                    r2 = arrayList2;
                    r3 = groupAvatarView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreImageViewer.C12051a.this.m67254h(r2, r3);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.MediaStoreImageViewer$b */
    /* loaded from: classes5.dex */
    public class C12052b implements BaseImageViewer.InterfaceC12022n {
        C12052b() {
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            MediaStoreImageViewer.this.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(C12063c.f fVar, String str) {
            try {
                if (!TextUtils.isEmpty(str) && MediaStoreImageViewer.this.f72421L0.m92676n2() != null) {
                    MediaStoreImageViewer mediaStoreImageViewer = MediaStoreImageViewer.this;
                    ((CommonZaloview) mediaStoreImageViewer).f72837z0 = mediaStoreImageViewer.f72421L0.m92676n2().getRequestedOrientation();
                    MediaStoreImageViewer.this.f72421L0.m92676n2().setRequestedOrientation(1);
                    Bundle bundle = new Bundle();
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(str);
                    bundle.putStringArrayList("path", arrayList);
                    bundle.putBoolean("fromShareVia", true);
                    bundle.putString("extra_tracking_source", MediaStoreImageViewer.this.m66867jN());
                    MediaStoreImageViewer.this.f72421L0.m92676n2().mo35579p().m93069k2(UpdateStatusView.class, bundle, 1, true);
                } else {
                    MediaStoreImageViewer.this.m66762EN(2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.MediaStoreImageViewer$c */
    /* loaded from: classes5.dex */
    public class C12053c implements C12340b.a {
        C12053c() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.C12340b.a
        /* renamed from: a */
        public void mo67255a(List list) {
            if (MediaStoreImageViewer.this.f62686n1 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(MediaStoreImageViewer.this.f62686n1.f42598s0.m40599m());
                C31950hc.f146830a.m153638L("chat_storedmedia", 0, "msg_chat_delete_withdraw", arrayList, null);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.C12340b.a
        /* renamed from: b */
        public void mo67256b(String str, List list, boolean z11) {
            MediaStoreImageViewer mediaStoreImageViewer = MediaStoreImageViewer.this;
            mediaStoreImageViewer.m67248HQ(mediaStoreImageViewer.f62686n1, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.MediaStoreImageViewer$d */
    /* loaded from: classes5.dex */
    public class C12054d implements C3522q.d {
        C12054d() {
        }

        /* renamed from: d */
        public /* synthetic */ void m67260d(boolean z11, MessageId messageId) {
            try {
                if (MediaStoreImageViewer.this.m92674mJ()) {
                    if (z11) {
                        MediaStoreImageViewer.this.m67247GQ(Collections.singletonList(messageId.m41042C()));
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_photo_delete_done));
                    } else {
                        MediaStoreImageViewer.this.m67246FQ();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: e */
        public /* synthetic */ void m67261e(boolean z11) {
            if (MediaStoreImageViewer.this.m92674mJ()) {
                if (z11) {
                    MediaStoreImageViewer.this.mo46829Y();
                } else {
                    MediaStoreImageViewer.this.mo49315c4();
                }
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m67262f(String str) {
            if (MediaStoreImageViewer.this.m92674mJ()) {
                ToastUtils.showMess(str);
            }
        }

        @Override // ci.C3522q.d
        /* renamed from: E */
        public void mo17825E(String str) {
            MediaStoreImageViewer.this.f62656T1.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.b0

                /* renamed from: q */
                public final /* synthetic */ String f62926q;

                public /* synthetic */ RunnableC12062b0(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreImageViewer.C12054d.this.m67262f(r2);
                }
            });
        }

        @Override // ci.C3522q.d
        /* renamed from: F */
        public void mo17826F(boolean z11) {
            MediaStoreImageViewer.this.f62656T1.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.d0

                /* renamed from: q */
                public final /* synthetic */ boolean f62999q;

                public /* synthetic */ RunnableC12066d0(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreImageViewer.C12054d.this.m67261e(r2);
                }
            });
        }

        @Override // ci.C3522q.d
        /* renamed from: G */
        public void mo17827G(MessageId messageId, boolean z11) {
            MediaStoreImageViewer.this.f62656T1.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.c0

                /* renamed from: q */
                public final /* synthetic */ boolean f62994q;

                /* renamed from: r */
                public final /* synthetic */ MessageId f62995r;

                public /* synthetic */ RunnableC12064c0(boolean z112, MessageId messageId2) {
                    r2 = z112;
                    r3 = messageId2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreImageViewer.C12054d.this.m67260d(r2, r3);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.MediaStoreImageViewer$e */
    /* loaded from: classes5.dex */
    class C12055e implements AbstractC22055v0.g {
        C12055e() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            MediaStoreImageViewer.this.mo50252cO();
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (MediaStoreImageViewer.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* renamed from: A */
    private void m67232A() {
        MessageId messageId = this.f62572Z2;
        boolean z11 = false;
        if (messageId != null) {
            if (!this.f62573a3 && C31950hc.f146830a.m153636I(Collections.singletonList(messageId))) {
                ToastUtils.m89266n(AbstractC8020f0.str_unable_perform_action, new Object[0]);
            }
            this.f62572Z2 = null;
            this.f62573a3 = false;
            z11 = true;
        }
        C31950hc.f146830a.m153639l();
        List list = this.f62684l1;
        if (list != null && !z11) {
            list.add(this.f62901p3, this.f62900o3);
            mo66708c6(this.f62684l1);
            int i11 = this.f62901p3;
            if ((i11 == 0 && this.f62685m1 == 0) || (i11 != 0 && this.f62685m1 == i11 - 1)) {
                mo66729oO(i11, Boolean.FALSE);
            } else {
                int i12 = this.f62685m1;
                if (i12 >= i11) {
                    mo66729oO(i12 + 1, Boolean.FALSE);
                }
            }
            this.f62900o3 = null;
            this.f62901p3 = -1;
        }
    }

    /* renamed from: BQ */
    private void m67233BQ(ItemAlbumMobile itemAlbumMobile) {
        this.f62900o3 = itemAlbumMobile;
        int i11 = this.f62685m1;
        this.f62901p3 = i11;
        m66855dO(i11);
    }

    /* renamed from: CQ */
    public /* synthetic */ void m67234CQ(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m67248HQ(this.f62686n1, false);
    }

    /* renamed from: DQ */
    public /* synthetic */ void m67235DQ(List list, View view) {
        long max = Math.max(0L, C23793c.m124316k().mo124319c() - C31950hc.f146830a.m153641s());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dur", max);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MediaStoreImageViewer", e11);
        }
        C31950hc.f146830a.m153638L("chat_storedmedia", 0, "msg_chat_delete_undo", list, jSONObject.toString());
        this.f62899n3.m90655n();
        m67232A();
    }

    /* renamed from: LQ */
    private void m67236LQ() {
        try {
            ItemAlbumMobile m66856eN = m66856eN(this.f62685m1);
            if (m66856eN != null) {
                ((C21219v) C21219v.Companion.m122672a()).m109954R(m66856eN.f42598s0.m40599m());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MediaStoreImageViewer", e11);
        }
    }

    /* renamed from: wQ */
    private void m67240wQ(boolean z11) {
        int i11;
        EnumC23654k enumC23654k = EnumC23654k.f114595q;
        if (z11) {
            if (this.f62695w1) {
                enumC23654k = EnumC23654k.f114597s;
            } else {
                enumC23654k = EnumC23654k.f114596r;
            }
        }
        C31973j5 m4473g = C0943w.m4462l().m4473g(AbstractC25495a.m132088m(this.f62696x1));
        if (m4473g != null) {
            i11 = m4473g.m153732O();
        } else {
            i11 = 0;
        }
        C2526d.f10270a.m12710f0(this.f62686n1, "chat_storedmedia", new C23662s(this.f62904s3, enumC23654k, i11), this.f62655T0);
    }

    /* renamed from: yQ */
    private void m67241yQ() {
        C0815e1.m2075D().m2100V(new C23648e(35, this.f62657U0, 1, "open_view_full_photo", this.f62655T0), false);
    }

    /* renamed from: z */
    private void m67242z(boolean z11, List list) {
        if (z11) {
            if (list == null) {
                return;
            }
            View m92691vK = m92691vK();
            int i11 = AbstractC8020f0.str_snackbar_title_undo_deleting_single_item;
            C31950hc c31950hc = C31950hc.f146830a;
            Snackbar m90633v = Snackbar.m90633v(m92691vK, i11, c31950hc.m153645x());
            this.f62899n3 = m90633v;
            m90633v.m90645K(AbstractC23222t7.f112553c0);
            this.f62899n3.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: j70.k2

                /* renamed from: q */
                public final /* synthetic */ List f102982q;

                public /* synthetic */ ViewOnClickListenerC21033k2(List list2) {
                    r2 = list2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MediaStoreImageViewer.this.m67235DQ(r2, view);
                }
            });
            this.f62899n3.m90641G(true);
            this.f62899n3.m90648N();
            c31950hc.m153638L("chat_storedmedia", 1, "msg_chat_delete_undo_toast", list2, null);
            return;
        }
        Snackbar snackbar = this.f62899n3;
        if (snackbar != null) {
            snackbar.m90655n();
        }
    }

    /* renamed from: zQ */
    private void m67243zQ(C12063c.f fVar) {
        MediaStoreItem mediaStoreItem;
        ItemAlbumMobile itemAlbumMobile = fVar.f62950a;
        if (itemAlbumMobile != null && (mediaStoreItem = itemAlbumMobile.f42598s0) != null && TextUtils.equals(mediaStoreItem.m40599m().m95090b5(), fVar.f62951b)) {
            C3531z.f14843a.m17893e(itemAlbumMobile.f42598s0, fVar.f62951b);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: AO */
    public void mo66694AO() {
        super.mo66694AO();
        m67250JQ();
    }

    /* renamed from: AQ */
    void m67244AQ() {
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
            AbstractC23647d.m123897g("1001509");
            AbstractC23647d.m123906p("1001500");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: BM */
    boolean mo66810BM() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: CM */
    public void mo66812CM() {
        int i11;
        this.f62647P0 = null;
        this.f62647P0 = m66891yM(AbstractC6918a0.action_bar_menu_download, AbstractC16803z.icn_header_download_white);
        this.f62641M0 = m66893zM(AbstractC6918a0.menu_view_original_msg_csc, AbstractC8020f0.str_view_original_msg);
        this.f62549C2 = m66893zM(AbstractC6918a0.menu_photo_download, AbstractC8020f0.str_menu_photo_download);
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null && AbstractC25495a.m132078c(this.f62686n1.m40496C().m41048l()) && C21373a.f104231a.m110807w().m110825b()) {
            this.f62554H2 = m66893zM(AbstractC6918a0.menu_add_to_collection, AbstractC8020f0.str_btn_add_item_to_collection);
        }
        this.f62551E2 = m66893zM(AbstractC6918a0.menu_photo_forward, AbstractC8020f0.share);
        this.f62898m3 = m66893zM(AbstractC6918a0.menu_photo_post_feed, AbstractC8020f0.str_optionM_shareVipAccOnTimeLine);
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
        this.f62897l3 = m66893zM(AbstractC6918a0.menu_photo_delete, AbstractC8020f0.str_menu_photo_delete);
        m67250JQ();
    }

    /* renamed from: EQ */
    void m67245EQ() {
        try {
            ItemAlbumMobile m66856eN = m66856eN(this.f62685m1);
            if (m66856eN != null) {
                this.f62902q3.add(m66856eN.f42595r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FQ */
    void m67246FQ() {
        try {
            this.f72421L0.mo49315c4();
            if (this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: GQ */
    void m67247GQ(List list) {
        try {
            if (this.f62684l1 == null) {
                return;
            }
            this.f72421L0.mo49315c4();
            ArrayList arrayList = new ArrayList();
            int size = this.f62684l1.size();
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    if (list.contains(((ItemAlbumMobile) this.f62684l1.get(i11)).f42595r)) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            Collections.sort(arrayList);
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                m66855dO(((Integer) arrayList.get(size2)).intValue());
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: HQ */
    void m67248HQ(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        String str;
        if (itemAlbumMobile != null) {
            try {
                if (itemAlbumMobile.f42595r.length() > 0) {
                    AbstractC23647d.m123897g("1001504");
                    JSONObject jSONObject = new JSONObject();
                    if (z11) {
                        str = "all";
                    } else {
                        str = "me";
                    }
                    try {
                        jSONObject.put("delete_for", str);
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("MediaStoreImageViewer", e11);
                    }
                    C31950hc c31950hc = C31950hc.f146830a;
                    c31950hc.m153638L("chat_storedmedia", 0, "msg_chat_delete", Collections.singletonList(itemAlbumMobile.f42598s0.m40599m()), jSONObject.toString());
                    if (!z11 && c31950hc.m153644w()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(itemAlbumMobile.f42598s0.m40599m());
                        C23744a.m124114c().m124116d(176, Boolean.TRUE);
                        c31950hc.m153637J(this.f62696x1, arrayList);
                        m67233BQ(itemAlbumMobile);
                        m67242z(true, arrayList);
                        return;
                    }
                    if (C3522q.f14777a.m17820l(AbstractC23306f.m120569C0(), this.f62696x1, EnumC2382z.f9945r, itemAlbumMobile, z11, new C12054d())) {
                        m67240wQ(z11);
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        if (!this.f62902q3.isEmpty()) {
            C3509j0.m17724j(this.f62696x1, this.f62903r3, this.f62902q3.size());
        }
    }

    /* renamed from: IQ */
    void m67249IQ() {
        C12063c.f m66845YM = m66845YM();
        if (this.f62686n1 != null && m66845YM != null) {
            AbstractC23647d.m123897g("1001507");
            m66828QM(m66845YM, true, new C12052b());
        } else {
            m66762EN(1);
        }
    }

    /* renamed from: JQ */
    void m67250JQ() {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.m40511V()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m66882sN = m66882sN();
        View view = this.f62647P0;
        int i18 = 8;
        if (z11) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(view, i11);
        View view2 = this.f62549C2;
        if (z11) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        AbstractC23136l9.m118744r1(view2, i12);
        View view3 = this.f62551E2;
        if (z11) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        AbstractC23136l9.m118744r1(view3, i13);
        View view4 = this.f62641M0;
        if (this.f62895j3) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        AbstractC23136l9.m118744r1(view4, i14);
        View view5 = this.f62898m3;
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
        if (!m66882sN && !z11) {
            i18 = 0;
        }
        AbstractC23136l9.m118744r1(view7, i18);
        View view8 = this.f62897l3;
        if (view8 instanceof TextView) {
            TextView textView = (TextView) view8;
            if (m66882sN) {
                i17 = AbstractC8020f0.str_menu_video_delete;
            } else {
                i17 = AbstractC8020f0.str_menu_photo_delete;
            }
            textView.setText(i17);
        }
        AbstractC23136l9.m118744r1(this.f62897l3, 0);
        mo66696DO();
    }

    /* renamed from: KQ */
    void m67251KQ() {
        if (this.f62686n1 == null) {
            m66762EN(1);
            return;
        }
        if (AbstractC23309i.m121010He()) {
            this.f62905t3 = C12340b.m69422c(this.f62665Y0, this.f62696x1, Collections.singletonList(this.f62686n1), new C12053c());
        } else {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(C20815q.m108694h(this.f62686n1))).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: j70.l2
                public /* synthetic */ C21037l2() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    MediaStoreImageViewer.this.m67234CQ(interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f62905t3 = m43152a;
            m43152a.m92873y(false);
        }
        this.f62905t3.mo13822K();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: N9 */
    public void mo66825N9(int i11, Intent intent) {
        ArrayList arrayList = this.f62687o1;
        if (arrayList != null && arrayList.size() > 0) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putStringArrayListExtra("deletedPhoto", this.f62687o1);
            i11 = -1;
        }
        super.mo66825N9(i11, intent);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.action_bar_menu_more) {
                AbstractC23647d.m123897g("10015012");
                return true;
            }
            if (i11 == AbstractC6918a0.menu_view_original_msg_csc) {
                m67244AQ();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_forward) {
                mo66737rP(8, 9, true, mo66847ZM());
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_post_feed) {
                m67249IQ();
                return true;
            }
            if (i11 == AbstractC6918a0.action_bar_menu_download) {
                AbstractC23647d.m123897g("10015011");
                if (m66882sN()) {
                    m66731pP();
                } else {
                    mo66702OM();
                }
                C3509j0.m17719e(this.f62696x1, this.f62903r3, EnumC2382z.f9945r, 1);
                ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                if (itemAlbumMobile != null) {
                    C2526d.f10270a.m12686K(itemAlbumMobile, mo66847ZM(), this.f62655T0);
                }
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_download) {
                AbstractC23647d.m123897g("1001505");
                if (m66882sN()) {
                    m66731pP();
                } else {
                    mo66702OM();
                }
                C3509j0.m17719e(this.f62696x1, this.f62903r3, EnumC2382z.f9945r, 1);
                ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                if (itemAlbumMobile2 != null) {
                    C2526d.f10270a.m12686K(itemAlbumMobile2, mo66847ZM(), this.f62655T0);
                }
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
            if (i11 == AbstractC6918a0.menu_photo_delete) {
                m67251KQ();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: SN */
    public void mo66704SN(C12063c.f fVar) {
        super.mo66704SN(fVar);
        m67243zQ(fVar);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: TN */
    public void mo66835TN() {
        super.mo66835TN();
        m67236LQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C3509j0.m17726l(this.f62696x1);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        List list;
        super.mo37712VJ();
        C3509j0.m17730p(this.f62696x1);
        C31950hc c31950hc = C31950hc.f146830a;
        if (c31950hc.m153634E() && (list = this.f62684l1) != null && !list.isEmpty()) {
            c31950hc.m153640o();
        }
        C23744a.m124114c().m124116d(176, Boolean.FALSE);
        m67242z(false, null);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: ZM */
    public String mo66847ZM() {
        return "chat_storedmedia";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: cO */
    public void mo50252cO() {
        String mo66866iO;
        View view;
        GroupAvatarView groupAvatarView;
        try {
            if (this.f62629A1) {
                mo66866iO = "";
            } else {
                mo66866iO = mo66866iO(this.f62686n1, this.f62671b1);
            }
            this.f62646O1 = mo66866iO;
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
            if ((view instanceof GroupAvatarView) && this.f62686n1 != null) {
                GroupAvatarView groupAvatarView2 = (GroupAvatarView) view;
                new C12051a(groupAvatarView2, Collections.singletonList(this.f62686n1.f42593q), 1057, groupAvatarView2).m141750b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaStoreImageViewer";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: mp */
    public void mo66726mp(C12063c.g gVar, C12063c.f fVar, int i11, C3979l c3979l) {
        super.mo66726mp(gVar, fVar, i11, c3979l);
        m67243zQ(fVar);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        boolean z11;
        super.mo66727nN(bundle);
        this.f62671b1 = 2;
        if (bundle != null) {
            boolean z12 = true;
            if (bundle.containsKey("EXTRA_CAN_JUMP_TO_MSG_IN_SUBMENU") && !bundle.getBoolean("EXTRA_CAN_JUMP_TO_MSG_IN_SUBMENU")) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f62895j3 = z11;
            if (!bundle.containsKey("EXTRA_FROM_SEARCH_MODE") || !bundle.getBoolean("EXTRA_FROM_SEARCH_MODE")) {
                z12 = false;
            }
            this.f62896k3 = z12;
            if (bundle.containsKey("EXTRA_MEDIA_STORE_ZALO_TRACKING_SOURCE")) {
                this.f62903r3 = bundle.getInt("EXTRA_MEDIA_STORE_ZALO_TRACKING_SOURCE");
            }
            int i11 = bundle.getInt("EXTRA_MSG_REMOVE_SUB_ENTRYPOINT", 0);
            for (EnumC23663t enumC23663t : EnumC23663t.values()) {
                if (enumC23663t.m123986c() == i11) {
                    this.f62904s3 = enumC23663t;
                }
            }
        }
        mo66736rO(3);
        m67245EQ();
        m67241yQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: oN */
    public void mo66876oN(Bundle bundle) {
        C20275e c20275e;
        SparseIntArray sparseIntArray;
        SparseArray sparseArray;
        boolean z11;
        super.mo66876oN(bundle);
        if (m66705aQ()) {
            C17941h c17941h = new C17941h(this.f62696x1, this.f62695w1, C17941h.a.f90569p);
            this.f62688p1 = c17941h;
            c17941h.m94604u(this.f62672b2);
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
            c17941h.mo94600o(this.f62684l1, this.f62685m1, sparseIntArray, sparseArray, false);
            if (this.f62695w1) {
                if (bundle != null && bundle.getBoolean("EXTRA_BOL_USE_GROUP_MEDIASTORE_DATASOURCE")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c17941h.m94626L(z11);
                List m94599n = c17941h.m94599n();
                this.f62684l1 = m94599n;
                if (m94599n.isEmpty()) {
                    finish();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_share) {
                if (!m66815DM()) {
                    return;
                }
                mo66737rP(8, 9, true, mo66847ZM());
                return;
            }
            if (id2 == AbstractC6918a0.imvAvatar) {
                C12055e c12055e = new C12055e();
                ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                if (itemAlbumMobile != null && AbstractC22055v0.m115146f(itemAlbumMobile.f42593q, m92676n2(), this, ZAbstractBase.ZVU_BLEND_GEN_THUMB, 353, null, c12055e)) {
                    mo50252cO();
                } else {
                    m66848ZN();
                }
            }
            super.onClick(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        super.onPageSelected(i11);
        m67245EQ();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: rP */
    public void mo66737rP(int i11, int i12, boolean z11, String str) {
        super.mo66737rP(i11, i12, z11, str);
        AbstractC23647d.m123897g("1001506");
        C3509j0.m17720f(this.f62696x1, this.f62903r3, EnumC2382z.f9945r, 1);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: tP */
    public int mo66739tP() {
        return 2;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: uP */
    protected void mo66741uP(C20568e c20568e) {
        if (c20568e == null) {
            return;
        }
        mo66718iQ(c20568e.m107020d(), c20568e.m107019c(), c20568e.m107018b(), c20568e.m107022f());
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: vN */
    protected boolean mo66887vN() {
        return true;
    }

    /* renamed from: xQ */
    public void m67252xQ(boolean z11, List list) {
        int i11;
        EnumC23654k enumC23654k = EnumC23654k.f114595q;
        if (z11) {
            if (this.f62695w1) {
                enumC23654k = EnumC23654k.f114597s;
            } else {
                enumC23654k = EnumC23654k.f114596r;
            }
        }
        C31973j5 m4473g = C0943w.m4462l().m4473g(AbstractC25495a.m132088m(this.f62696x1));
        if (m4473g != null) {
            i11 = m4473g.m153732O();
        } else {
            i11 = 0;
        }
        C2526d.f10270a.m12713h0(list, "chat_storedmedia", new C23662s(this.f62904s3, enumC23654k, i11), this.f62655T0);
    }
}
