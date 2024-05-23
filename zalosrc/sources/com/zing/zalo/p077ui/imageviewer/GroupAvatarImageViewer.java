package com.zing.zalo.p077ui.imageviewer;

import ac.InterfaceC0733x;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.GroupAvatarImageViewer;
import com.zing.zalo.p077ui.mediastore.MediaStoreAvatarPickerView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.AvatarPickerView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import hm0.C20096c;
import im.C20612c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import od0.InterfaceC24223a;
import p161fg.C18922m;
import p266jg.AbstractC21244b;
import p322lf.AbstractC22470k;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import pd0.C24730d;
import pd0.EnumC24734h;
import vg.AbstractRunnableC28185s6;

/* loaded from: classes5.dex */
public class GroupAvatarImageViewer extends BaseChatImageViewer implements InterfaceC0733x {

    /* renamed from: j3 */
    View f62876j3;

    /* renamed from: k3 */
    RobotoTextView f62877k3;

    /* renamed from: n3 */
    C31973j5 f62880n3;

    /* renamed from: l3 */
    boolean f62878l3 = true;

    /* renamed from: m3 */
    boolean f62879m3 = true;

    /* renamed from: o3 */
    boolean f62881o3 = false;

    /* renamed from: p3 */
    public AvatarPickerView f62882p3 = null;

    /* renamed from: q3 */
    boolean f62883q3 = false;

    /* renamed from: r3 */
    String f62884r3 = "";

    /* renamed from: s3 */
    String f62885s3 = "";

    /* renamed from: t3 */
    boolean f62886t3 = true;

    /* renamed from: u3 */
    InterfaceC24223a f62887u3 = new C12047b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.GroupAvatarImageViewer$a */
    /* loaded from: classes5.dex */
    public class C12046a implements AvatarPickerView.InterfaceC14082a {
        C12046a() {
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: a */
        public void mo64240a() {
            GroupAvatarImageViewer.this.m67215mD();
            GroupAvatarImageViewer.this.m67214hy();
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: b */
        public void mo64241b() {
            GroupAvatarImageViewer.this.m67217vQ();
            GroupAvatarImageViewer.this.m67214hy();
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: d */
        public void mo64242d(String str) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                GroupAvatarImageViewer groupAvatarImageViewer = GroupAvatarImageViewer.this;
                groupAvatarImageViewer.f62886t3 = false;
                groupAvatarImageViewer.m67213F0(str, new C20612c(0, -1).m107293q());
            }
            GroupAvatarImageViewer.this.m67214hy();
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: f0 */
        public void mo64243f0() {
            GroupAvatarImageViewer.this.m67216uQ();
            GroupAvatarImageViewer.this.m67214hy();
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.GroupAvatarImageViewer$b */
    /* loaded from: classes5.dex */
    class C12047b implements InterfaceC24223a {
        C12047b() {
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: a */
        public void mo50006a(Intent intent) {
            int i11;
            try {
                try {
                    C31973j5 m4472f = C0943w.m4462l().m4472f(GroupAvatarImageViewer.this.f62696x1);
                    if (m4472f != null) {
                        String stringExtra = intent.getStringExtra("urlUploadedServer");
                        if (TextUtils.isEmpty(stringExtra)) {
                            stringExtra = GroupAvatarImageViewer.this.f62884r3;
                        }
                        C0943w.m4462l().m4481u(m4472f.m153781r(), stringExtra);
                        AbstractC23184q2.m119438C(m4472f.m153781r());
                    }
                    if (m4472f != null) {
                        C18922m.m99141t().m99151U("group_" + m4472f.m153781r(), m4472f.m153756e());
                    }
                    GroupAvatarImageViewer.this.m67220zQ();
                    if (m4472f != null && m4472f.m153747Y()) {
                        i11 = AbstractC8020f0.str_notice_avatar_community_update;
                    } else {
                        i11 = AbstractC8020f0.str_notice_avatar_group_update;
                    }
                    ToastUtils.m89266n(i11, new Object[0]);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                GroupAvatarImageViewer groupAvatarImageViewer = GroupAvatarImageViewer.this;
                groupAvatarImageViewer.f62884r3 = "";
                groupAvatarImageViewer.f62885s3 = "";
                groupAvatarImageViewer.f62883q3 = false;
                groupAvatarImageViewer.mo49315c4();
            } catch (Throwable th2) {
                GroupAvatarImageViewer groupAvatarImageViewer2 = GroupAvatarImageViewer.this;
                groupAvatarImageViewer2.f62884r3 = "";
                groupAvatarImageViewer2.f62885s3 = "";
                groupAvatarImageViewer2.f62883q3 = false;
                groupAvatarImageViewer2.mo49315c4();
                throw th2;
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: b */
        public void mo50007b(String str) {
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: c */
        public void mo50008c(C20096c c20096c) {
            GroupAvatarImageViewer groupAvatarImageViewer;
            try {
                try {
                    if (c20096c.m104491c() == 17007) {
                        ToastUtils.m89266n(AbstractC8020f0.str_change_avatar_group_error_group_does_not_permission, new Object[0]);
                    } else {
                        ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
                    }
                    groupAvatarImageViewer = GroupAvatarImageViewer.this;
                    groupAvatarImageViewer.f62884r3 = "";
                    groupAvatarImageViewer.f62885s3 = "";
                    groupAvatarImageViewer.f62883q3 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    groupAvatarImageViewer = GroupAvatarImageViewer.this;
                }
                groupAvatarImageViewer.mo49315c4();
            } catch (Throwable th2) {
                GroupAvatarImageViewer.this.mo49315c4();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.GroupAvatarImageViewer$c */
    /* loaded from: classes5.dex */
    public class C12048c extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ GroupAvatarView f62891z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12048c(AbstractRunnableC28185s6.b bVar, List list, int i11, GroupAvatarView groupAvatarView) {
            super(bVar, list, i11);
            this.f62891z = groupAvatarView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m67222h(ArrayList arrayList, GroupAvatarView groupAvatarView) {
            ContactProfile contactProfile;
            if (arrayList.size() > 0 && (contactProfile = (ContactProfile) arrayList.get(0)) != null && contactProfile.f42434r.equals(GroupAvatarImageViewer.this.f62686n1.f42593q)) {
                groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(groupAvatarView.getContext()));
                groupAvatarView.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(GroupAvatarImageViewer.this.getContext())), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(GroupAvatarImageViewer.this.getContext())));
                groupAvatarView.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                groupAvatarView.m75731c(contactProfile);
                groupAvatarView.setOnClickListener(GroupAvatarImageViewer.this);
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(final ArrayList arrayList) {
            GroupAvatarImageViewer groupAvatarImageViewer = GroupAvatarImageViewer.this;
            final GroupAvatarView groupAvatarView = this.f62891z;
            groupAvatarImageViewer.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.z
                @Override // java.lang.Runnable
                public final void run() {
                    GroupAvatarImageViewer.C12048c.this.m67222h(arrayList, groupAvatarView);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.GroupAvatarImageViewer$d */
    /* loaded from: classes5.dex */
    class C12049d implements AbstractC22055v0.g {
        C12049d() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            GroupAvatarImageViewer.this.mo50252cO();
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (GroupAvatarImageViewer.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yQ */
    public /* synthetic */ void m67208yQ(View view) {
        AbstractC23647d.m123897g("10015512");
        m67210BQ();
    }

    /* renamed from: AQ */
    void m67209AQ(int i11, Intent intent) {
        try {
            this.f62691s1 = true;
            this.f72421L0.m92676n2().setRequestedOrientation(1);
            this.f72421L0.mo50035CK(i11, intent);
            this.f72421L0.finish();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupAvatarImageViewer", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: BM */
    boolean mo66810BM() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42593q)) {
            return true;
        }
        return false;
    }

    /* renamed from: BQ */
    public void m67210BQ() {
        try {
            C31973j5 m4473g = C0943w.m4462l().m4473g(this.f62696x1);
            if (m4473g != null) {
                if (!m4473g.m153778p0() && !m4473g.m153743U() && m4473g.m153761g0()) {
                    ToastUtils.showMess(m92652XI(AbstractC8020f0.str_not_perform_action));
                } else {
                    C12046a c12046a = new C12046a();
                    boolean z11 = true;
                    if (m4473g.m153790w() != 1) {
                        z11 = false;
                    }
                    this.f62882p3 = AvatarPickerView.m78263nL(c12046a, null, z11);
                    this.f72421L0.m92649TI().m93060e2(0, this.f62882p3, "AvatarPickerView", 0, false);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: CM */
    public void mo66812CM() {
        if (this.f62693u1) {
            m66891yM(AbstractC6918a0.menu_photo_download, AbstractC16803z.icn_header_download_white);
        }
        if (this.f62582j2) {
            m66893zM(AbstractC6918a0.menu_edit_photo, AbstractC8020f0.str_menu_edit_photo);
        }
        if (this.f62693u1) {
            m66893zM(AbstractC6918a0.menu_photo_download, AbstractC8020f0.str_menu_photo_download);
        }
        if (this.f62694v1) {
            m66893zM(AbstractC6918a0.menu_share, AbstractC8020f0.share);
        }
        if (this.f62586n2 != 0) {
            m66893zM(AbstractC6918a0.menu_shared_media, AbstractC8020f0.menu_stored_media);
        }
    }

    /* renamed from: CQ */
    void m67211CQ(int i11) {
        CameraInputParams m39200j = CameraInputParams.m39200j();
        m39200j.f41138w0 = new SensitiveData("csc_group_rmenu_avatar_camera", "group_avatar");
        AbstractC22470k.m116167s(m92676n2(), i11, 1, m39200j);
    }

    /* renamed from: DQ */
    void m67212DQ(boolean z11) {
        int i11;
        Animation m66851bN;
        if (this.f62587o2) {
            View view = this.f62876j3;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            if (this.f62876j3.getVisibility() != 8 || z11) {
                View view2 = this.f62876j3;
                if (z11) {
                    m66851bN = m66849aN();
                } else {
                    m66851bN = m66851bN();
                }
                view2.startAnimation(m66851bN);
                return;
            }
            return;
        }
        this.f62876j3.setVisibility(8);
    }

    /* renamed from: F0 */
    public void m67213F0(String str, String str2) {
        try {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f62696x1);
            if (m4472f == null || TextUtils.isEmpty(str) || this.f62883q3) {
                return;
            }
            this.f62883q3 = true;
            this.f62884r3 = str;
            this.f62885s3 = str2;
            mo46829Y();
            C24730d.m128465h().m128477p(str, EnumC24734h.GROUP_AVATAR, Integer.parseInt(m4472f.m153781r()), true, str2, null, this.f62887u3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.menu_photo_download) {
                mo66702OM();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_share) {
                mo66737rP(8, 9, true, "");
                return true;
            }
            if (i11 == AbstractC6918a0.menu_edit_photo) {
                m66712eQ();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_shared_media) {
                m66715gQ("");
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
        GroupAvatarView groupAvatarView;
        try {
            super.mo50252cO();
            if (TextUtils.isEmpty(this.f62686n1.f42593q)) {
                return;
            }
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
            if (view instanceof GroupAvatarView) {
                GroupAvatarView groupAvatarView2 = (GroupAvatarView) view;
                new C12048c(groupAvatarView2, Collections.singletonList(this.f62686n1.f42593q), 1056, groupAvatarView2).m141750b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.layout_image_viewer_group_avatar;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: dr */
    public void mo66711dr(C12063c.g gVar, int i11, float f11) {
        super.mo66711dr(gVar, i11, f11);
        this.f62878l3 = false;
        m67212DQ(false);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupAvatarImageViewer";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: hO */
    public String mo50254hO(ItemAlbumMobile itemAlbumMobile) {
        int i11;
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.m40498F())) {
            return itemAlbumMobile.m40498F();
        }
        if (this.f62881o3) {
            i11 = AbstractC8020f0.str_community_avatar;
        } else {
            i11 = AbstractC8020f0.group_avatar;
        }
        return AbstractC23136l9.m118743r0(i11);
    }

    /* renamed from: hy */
    public void m67214hy() {
        try {
            m66700KH("AvatarPickerView");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
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

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: kN */
    public void mo66721kN(Message message) {
        super.mo66721kN(message);
        if (message.what == 1) {
            boolean z11 = !this.f62878l3;
            this.f62878l3 = z11;
            m67212DQ(z11);
        }
    }

    /* renamed from: mD */
    public void m67215mD() {
        try {
            String[] m118177s = AbstractC23034c6.m118177s();
            if (AbstractC23034c6.m118167n(this.f72421L0.getContext(), m118177s) != 0) {
                AbstractC23034c6.m118184v0(this, m118177s, 118);
            } else if (AbstractC23238v2.m119727l()) {
                m67211CQ(1020);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupAvatarImageViewer", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: mF */
    public void mo66872mF(C12063c.g gVar, int i11) {
        super.mo66872mF(gVar, i11);
        this.f62878l3 = false;
        m67212DQ(false);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        String str;
        boolean z11;
        super.mo66727nN(bundle);
        mo66736rO(8);
        boolean z12 = true;
        if (bundle != null) {
            if (bundle.containsKey("EXTRA_ENABLE_MENU_SHARE_MEDIA_SIMILAR") && !bundle.getBoolean("EXTRA_ENABLE_MENU_SHARE_MEDIA_SIMILAR")) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f62879m3 = z11;
        }
        if (!this.f62879m3) {
            AbstractC23647d.m123897g("10015511");
        }
        if (AbstractC25495a.m132079d(this.f62696x1)) {
            str = AbstractC25495a.m132088m(this.f62696x1);
        } else {
            str = this.f62696x1;
        }
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        this.f62880n3 = m4472f;
        if (m4472f == null || !m4472f.m153747Y()) {
            z12 = false;
        }
        this.f62881o3 = z12;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            switch (i11) {
                case 1019:
                    m67218wQ(i12, intent);
                    break;
                case 1020:
                    if (i12 == -1) {
                        try {
                            String stringExtra = intent.getStringExtra("extra_result_output_path");
                            String stringExtra2 = intent.getStringExtra("extra_result_camera_log");
                            if (TextUtils.isEmpty(stringExtra2)) {
                                stringExtra2 = new C20612c(0, 1).m107293q();
                            }
                            if (!TextUtils.isEmpty(stringExtra)) {
                                m67213F0(stringExtra, stringExtra2);
                                break;
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            break;
                        }
                    }
                    break;
                case 1021:
                    m67219xQ(i12, intent);
                    break;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.imvAvatar) {
                if (AbstractC22055v0.m115146f(this.f62686n1.f42593q, m92676n2(), this, ZAbstractBase.ZVU_BLEND_GEN_THUMB, 353, null, new C12049d())) {
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
        int i11;
        super.mo66733qN(view);
        this.f62876j3 = view.findViewById(AbstractC6918a0.btn_change_group_avatar);
        m67212DQ(this.f62878l3);
        this.f62876j3.setOnClickListener(new View.OnClickListener() { // from class: j70.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupAvatarImageViewer.this.m67208yQ(view2);
            }
        });
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_change_group_avatar_title);
        this.f62877k3 = robotoTextView;
        if (this.f62881o3) {
            i11 = AbstractC8020f0.str_change_community_avatar;
        } else {
            i11 = AbstractC8020f0.str_title_btn_change_group_avatar;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(i11).toUpperCase());
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: tP */
    public int mo66739tP() {
        return 4;
    }

    /* renamed from: uQ */
    public void m67216uQ() {
        try {
            if (AbstractC23238v2.m119727l()) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_csc_group_menu_avatar", "group_avatar"));
                AbstractC23211s7.m119589v(m92676n2(), 1019, 7, true, bundle);
            } else if (this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.error_sdcard));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vQ */
    public void m67217vQ() {
        try {
            C31973j5 m4473g = C0943w.m4462l().m4473g(this.f62696x1);
            Bundle bundle = new Bundle();
            bundle.putString("extra_create_album_group_id", m4473g.m153781r());
            bundle.putBoolean("EXTRA_IS_COMMUNITY", m4473g.m153747Y());
            this.f72421L0.m92676n2().mo35579p().m93066i2(MediaStoreAvatarPickerView.class, bundle, 1021, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wQ */
    void m67218wQ(int i11, Intent intent) {
        MediaItem mediaItem;
        if (i11 == -1 && intent != null) {
            try {
                List m71440ZM = GalleryPickerView.m71440ZM(intent);
                if (m71440ZM != null && m71440ZM.size() > 0 && (mediaItem = (MediaItem) m71440ZM.get(0)) != null) {
                    String str = "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        str = mediaItem.m41113N();
                    } else if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                        str = mediaItem.mo41081Q();
                    }
                    String m41175w = mediaItem.m41175w();
                    if (TextUtils.isEmpty(m41175w)) {
                        m41175w = new C20612c(0, 0).m107293q();
                    }
                    m67213F0(str, m41175w);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: xQ */
    void m67219xQ(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                m67213F0(intent.getStringExtra("PHOTO_PATH_PICKED"), new C20612c(0, 45).m107293q());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zQ */
    void m67220zQ() {
        m67209AQ(-1, new Intent());
    }
}
