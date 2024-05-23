package com.zing.zalo.p077ui.toolstoragev1.detail;

import ab0.C0685m;
import ab0.InterfaceC0673a;
import ab0.InterfaceC0674b;
import ac.C0697c0;
import ac.InterfaceC0733x;
import am.C0943w;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import au.C2343e;
import bi0.AbstractC2814h;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstoragev1.detail.StorageUsageDetailView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import k30.C21459a;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p348mi.C23302b;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p649xl.C30054tc;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class StorageUsageDetailView extends SlidableZaloView implements InterfaceC0674b, InterfaceC0733x {

    /* renamed from: P0 */
    private C30054tc f68913P0;

    /* renamed from: Q0 */
    private C23528a f68914Q0;

    /* renamed from: S0 */
    private InterfaceC0673a f68916S0;

    /* renamed from: T0 */
    private C13463a f68917T0;

    /* renamed from: R0 */
    private C16972e0 f68915R0 = null;

    /* renamed from: U0 */
    private final ActionBar.C17431a f68918U0 = new C13462a();

    /* renamed from: com.zing.zalo.ui.toolstoragev1.detail.StorageUsageDetailView$a */
    /* loaded from: classes6.dex */
    class C13462a extends ActionBar.C17431a {
        C13462a() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            if (i11 == 16908332 && !StorageUsageDetailView.this.f68913P0.f139489q.isAttachedToWindow()) {
                StorageUsageDetailView.this.f68916S0.mo963Tn();
            } else {
                super.mo46831b(i11);
                StorageUsageDetailView.this.mo37491QJ(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static /* synthetic */ boolean m75464pM(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static /* synthetic */ boolean m75465qM(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m75466rM(View view) {
        this.f68916S0.mo964dh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m75467sM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68916S0.mo967rn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m75468tM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68916S0.mo961Lc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m75469uM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68916S0.mo965j6();
    }

    /* renamed from: wM */
    private void m75470wM() {
        int m119607o = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        this.f68913P0.f139484L.setText(m92652XI(AbstractC8020f0.str_tool_storage_detail_all_msg));
        this.f68913P0.f139495w.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_storage_menu_message));
        RecyclingImageView recyclingImageView = this.f68913P0.f139495w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        recyclingImageView.setColorFilter(m119607o, mode);
        this.f68913P0.f139483K.setText(m92652XI(AbstractC8020f0.str_tool_storage_detail_photo_msg));
        this.f68913P0.f139494v.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_storage_menu_photo));
        this.f68913P0.f139494v.setColorFilter(m119607o, mode);
        this.f68913P0.f139485M.setText(m92652XI(AbstractC8020f0.str_tool_storage_detail_other_msg));
        this.f68913P0.f139496x.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_icn_storage_menu_others));
        this.f68913P0.f139496x.setColorFilter(m119607o, mode);
        this.f68913P0.f139486N.setText(m92652XI(AbstractC8020f0.str_tool_storage_detail_voice_msg));
        this.f68913P0.f139497y.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_icn_storage_menu_voice));
        this.f68913P0.f139497y.setColorFilter(m119607o, mode);
        this.f68913P0.f139491s.setText("0");
        this.f68913P0.f139480H.setText("0 B");
        this.f68913P0.f139490r.setText("0");
        this.f68913P0.f139475C.setText("0 B");
        this.f68913P0.f139492t.setText("0");
        this.f68913P0.f139481I.setText("0 B");
        this.f68913P0.f139493u.setText("0");
        this.f68913P0.f139482J.setText("0 B");
        this.f68913P0.f139489q.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_usage_storage_clear, "0 B"));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        this.f68914Q0 = new C23528a(this.f72421L0.m92648SI());
        this.f68917T0 = C13463a.Companion.m75485a(m92642L3());
        this.f68916S0 = new C0685m(this, AbstractC23306f.m120570C1(), AbstractC23306f.m120601N());
        C13463a c13463a = this.f68917T0;
        if (c13463a.f68922c == null && TextUtils.isEmpty(c13463a.f68923d)) {
            mo974nH();
        }
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: EA */
    public void mo968EA(ThreadStorageInfo threadStorageInfo) {
        boolean z11;
        this.f68913P0.f139491s.setText(String.valueOf(threadStorageInfo.m74805m()));
        this.f68913P0.f139480H.setText(C21459a.m111036d(threadStorageInfo.m74770F()));
        this.f68913P0.f139490r.setText(String.valueOf(threadStorageInfo.m74809o()));
        this.f68913P0.f139475C.setText(C21459a.m111036d(threadStorageInfo.m74772I()));
        this.f68913P0.f139492t.setText(String.valueOf(threadStorageInfo.m74795h()));
        this.f68913P0.f139481I.setText(C21459a.m111036d(threadStorageInfo.m74797i()));
        this.f68913P0.f139493u.setText(String.valueOf(threadStorageInfo.m74811p()));
        this.f68913P0.f139482J.setText(C21459a.m111036d(threadStorageInfo.m74773J()));
        this.f68913P0.f139498z.removeAllViews();
        C30054tc c30054tc = this.f68913P0;
        c30054tc.f139498z.addView(c30054tc.f139489q);
        Button button = this.f68913P0.f139489q;
        if (threadStorageInfo.m74777O() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        button.setEnabled(z11);
        this.f68913P0.f139489q.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_usage_storage_clear, C21459a.m111036d(threadStorageInfo.m74777O())));
        mo970Id(threadStorageInfo);
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: EH */
    public void mo969EH() {
        C16972e0 c16972e0 = this.f68915R0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C30054tc m148542c = C30054tc.m148542c(layoutInflater, viewGroup, false);
        this.f68913P0 = m148542c;
        m148542c.f139473A.setOnTouchListener(new View.OnTouchListener() { // from class: ab0.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m75464pM;
                m75464pM = StorageUsageDetailView.m75464pM(view, motionEvent);
                return m75464pM;
            }
        });
        this.f68913P0.f139474B.setOnTouchListener(new View.OnTouchListener() { // from class: ab0.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m75465qM;
                m75465qM = StorageUsageDetailView.m75465qM(view, motionEvent);
                return m75465qM;
            }
        });
        m75470wM();
        this.f68913P0.f139489q.setOnClickListener(new View.OnClickListener() { // from class: ab0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorageUsageDetailView.this.m75466rM(view);
            }
        });
        m75471oM(false);
        this.f68916S0.mo995Nd(this.f68917T0, null);
        return this.f68913P0.getRoot();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C16972e0 c16972e0 = this.f68915R0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            this.f68915R0.dismiss();
        }
        this.f68916S0.mo994F2();
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: Id */
    public void mo970Id(ThreadStorageInfo threadStorageInfo) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && threadStorageInfo != null) {
            actionBar.setSubtitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_used_storage) + " " + C21459a.m111036d(threadStorageInfo.m74777O()));
        }
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: Q7 */
    public void mo971Q7(boolean z11) {
        try {
            if (z11) {
                this.f68913P0.f139473A.setVisibility(0);
                this.f68913P0.f139473A.setState(MultiStateView.EnumC15914e.LOADING);
            } else {
                this.f68913P0.f139473A.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        this.f68916S0.mo966k();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: b8 */
    public void mo972b8(ThreadStorageInfo threadStorageInfo) {
        boolean z11;
        int i11;
        C31973j5 m4472f;
        this.f68913P0.f139491s.setText(String.valueOf(threadStorageInfo.m74805m()));
        this.f68913P0.f139480H.setText(C21459a.m111036d(threadStorageInfo.m74770F()));
        this.f68913P0.f139490r.setText(String.valueOf(threadStorageInfo.m74809o()));
        this.f68913P0.f139475C.setText(C21459a.m111036d(threadStorageInfo.m74772I()));
        this.f68913P0.f139492t.setText(String.valueOf(threadStorageInfo.m74795h()));
        this.f68913P0.f139481I.setText(C21459a.m111036d(threadStorageInfo.m74797i()));
        this.f68913P0.f139493u.setText(String.valueOf(threadStorageInfo.m74811p()));
        this.f68913P0.f139482J.setText(C21459a.m111036d(threadStorageInfo.m74773J()));
        Button button = this.f68913P0.f139489q;
        if (threadStorageInfo.m74777O() == 0 && this.f68913P0.f139491s.getText().toString().equals("0")) {
            z11 = false;
        } else {
            z11 = true;
        }
        button.setEnabled(z11);
        this.f68913P0.f139489q.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_usage_storage_clear, C21459a.m111036d(threadStorageInfo.m74777O())));
        if (AbstractC25495a.m132079d(threadStorageInfo.m74822z()) && (m4472f = C0943w.m4462l().m4472f(threadStorageInfo.m74822z())) != null) {
            i11 = m4472f.m153732O();
        } else {
            i11 = 0;
        }
        m75472vM(AbstractC25495a.m132089n(threadStorageInfo.m74822z()), !AbstractC25495a.m132079d(threadStorageInfo.m74822z()) ? 1 : 0, i11, C21459a.m111035c(threadStorageInfo.m74777O()), threadStorageInfo.m74811p(), C21459a.m111035c(threadStorageInfo.m74773J()), threadStorageInfo.m74809o(), C21459a.m111035c(threadStorageInfo.m74772I()), threadStorageInfo.m74780S(), C21459a.m111035c(threadStorageInfo.m74781T()), threadStorageInfo.m74813q(), C21459a.m111035c(threadStorageInfo.m74816t()), threadStorageInfo.m74820x(), C21459a.m111035c(threadStorageInfo.m74821y()));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ToolStorageThreadDetail";
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: ml */
    public void mo973ml(ThreadStorageInfo threadStorageInfo, boolean z11) {
        Intent intent = new Intent();
        intent.putExtra("details", threadStorageInfo);
        mo50035CK(-1, intent);
        if (z11) {
            finish();
        }
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: nH */
    public void mo974nH() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        finish();
    }

    /* renamed from: oM */
    public void m75471oM(boolean z11) {
        this.f68913P0.f139489q.setEnabled(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && !this.f68913P0.f139489q.isAttachedToWindow()) {
            this.f68916S0.mo963Tn();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: u7 */
    public void mo975u7() {
        ThreadStorageInfo mo962Ra = this.f68916S0.mo962Ra();
        if (mo962Ra == null) {
            return;
        }
        this.f68915R0 = new C16972e0.a(m92689tK()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(m92653YI(AbstractC8020f0.str_storage_title_delete_conversation, mo962Ra.m74779R())).m90922F(true).m90942s(AbstractC8020f0.str_storage_btn_delete_conversation, new InterfaceC17463d.d() { // from class: ab0.q
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageUsageDetailView.this.m75467sM(interfaceC17463d, i11);
            }
        }).m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger).m90938o(AbstractC8020f0.str_storage_btn_delete_conversation_photo_video, new InterfaceC17463d.d() { // from class: ab0.r
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageUsageDetailView.this.m75468tM(interfaceC17463d, i11);
            }
        }).m90940q(AbstractC2814h.ButtonMedium_TertiaryDanger).m90933j(AbstractC8020f0.str_storage_btn_delete_cancel, new InterfaceC17463d.d() { // from class: ab0.s
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageUsageDetailView.this.m75469uM(interfaceC17463d, i11);
            }
        }).m90935l(AbstractC2814h.ButtonMedium_Tertiary).m90931h("delete_data_dialog").m90947x("delete_data_button").m90941r("delete_only_media_button").m90937n("close_dialog_button").m90923G();
    }

    /* renamed from: vM */
    public void m75472vM(String str, int i11, int i12, double d11, long j11, double d12, long j12, double d13, long j13, double d14, long j14, double d15, long j15, double d16) {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1052f(this, "thread_id", str);
        bVar.m1050d(this, "thread_type", i11);
        bVar.m1050d(this, "thread_member_size", i12);
        bVar.m1049c(this, "thread_size", d11);
        bVar.m1051e(this, "a_num", j11);
        bVar.m1049c(this, "a_size", d12);
        bVar.m1051e(this, "p_num", j12);
        bVar.m1049c(this, "p_size", d13);
        bVar.m1051e(this, "v_num", j13);
        bVar.m1049c(this, "v_size", d14);
        bVar.m1051e(this, "f_num", j14);
        bVar.m1049c(this, "f_size", d15);
        bVar.m1051e(this, "o_num", j15);
        bVar.m1049c(this, "o_size", d16);
    }

    @Override // ab0.InterfaceC0674b
    /* renamed from: vv */
    public void mo976vv(ThreadStorageInfo threadStorageInfo) {
        try {
            if (this.f88760a0 != null) {
                if (threadStorageInfo != null) {
                    ContactProfile contactProfile = new ContactProfile(threadStorageInfo.m74822z());
                    if (contactProfile.m40374K0()) {
                        this.f88760a0.m92717l(AbstractC7409c0.storage_avatar_action_bar_for_group);
                        GroupAvatarView groupAvatarView = (GroupAvatarView) this.f88760a0.getAvatarLayout().findViewById(AbstractC6918a0.avatar_on_action_bar);
                        if (threadStorageInfo.m74778Q() != null) {
                            groupAvatarView.m75734f(contactProfile.m40389U());
                        }
                    } else {
                        this.f88760a0.m92717l(AbstractC7409c0.storage_avatar_action_bar_for_friend);
                        View avatarLayout = this.f88760a0.getAvatarLayout();
                        RecyclingImageView recyclingImageView = (RecyclingImageView) avatarLayout.findViewById(AbstractC6918a0.avatar_on_action_bar);
                        ImageView imageView = (ImageView) avatarLayout.findViewById(AbstractC6918a0.status_icon);
                        if (!TextUtils.isEmpty(threadStorageInfo.m74778Q())) {
                            if (C23302b.f113247a.m120523d(threadStorageInfo.m74778Q())) {
                                recyclingImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(threadStorageInfo.m74779R()), C2343e.m12307a(threadStorageInfo.m74822z(), false)));
                            } else {
                                ((C23528a) this.f68914Q0.m123612r(recyclingImageView)).m123618x(threadStorageInfo.m74778Q(), C23278z2.m120143n());
                            }
                        } else {
                            recyclingImageView.setImageDrawable(C23212s8.m119609q(recyclingImageView.getContext(), AbstractC16781w.default_avatar));
                        }
                        if (AbstractC25495a.m132078c(threadStorageInfo.m74822z())) {
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                        }
                    }
                    this.f88760a0.setTitle(threadStorageInfo.m74779R());
                    mo970Id(threadStorageInfo);
                }
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setActionBarMenuOnItemClick(this.f68918U0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }
}
