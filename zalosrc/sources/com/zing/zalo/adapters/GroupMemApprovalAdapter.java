package com.zing.zalo.adapters;

import am.AbstractC0924m0;
import am.C0943w;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupMemApprovalAdapter;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseChatSettingItemModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseHeaderTitleModuleView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import gw.C19637j;
import java.util.ArrayList;
import java.util.List;
import kd0.C21696f;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23999j;
import p716zh.C31973j5;
import p716zh.C32174x5;
import p716zh.C32188y5;

/* loaded from: classes3.dex */
public class GroupMemApprovalAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    public Context f38060r;

    /* renamed from: s */
    public LayoutInflater f38061s;

    /* renamed from: u */
    InterfaceC6957h f38063u;

    /* renamed from: v */
    C23528a f38064v;

    /* renamed from: t */
    public boolean f38062t = false;

    /* renamed from: w */
    List f38065w = new ArrayList();

    /* renamed from: x */
    String f38066x = "";

    /* renamed from: y */
    boolean f38067y = false;

    /* renamed from: z */
    public int f38068z = 0;

    /* loaded from: classes3.dex */
    public class MemberApprovalSettingModuleView extends BaseChatSettingItemModuleView implements InterfaceC6951b {
        public MemberApprovalSettingModuleView(Context context, boolean z11) {
            super(context);
            this.f64531N.m111958F1(AbstractC8020f0.str_membership_approval);
            if (z11) {
                this.f64532O.m111958F1(AbstractC8020f0.str_community_new_member_approval_desc);
            } else {
                this.f64532O.m111958F1(AbstractC8020f0.str_admin_tool_new_member_approval_subtitle_v3);
            }
            this.f64534Q.mo44614b1(0);
            this.f64529L.mo44614b1(8);
            this.f64534Q.mo89099H0(false);
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupMemApprovalAdapter.MemberApprovalSettingModuleView.this.m35678W(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m35678W(View view) {
            AbstractC23647d.m123897g("1591034");
            GroupMemApprovalAdapter.this.f38063u.mo35690kE(this.f64534Q, !r0.m89141i0());
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            this.f64534Q.mo89091D0(c32188y5.f148446e);
        }
    }

    /* loaded from: classes3.dex */
    public class SectionHeaderJoinPendingModuleView extends BaseHeaderTitleModuleView implements InterfaceC6951b {
        public SectionHeaderJoinPendingModuleView(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m35681W(C16719g c16719g) {
            if (GroupMemApprovalAdapter.this.f38063u != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int m89096G = iArr[0] + this.f64545L.m89096G();
                int m89098H = iArr[1] + this.f64545L.m89098H();
                GroupMemApprovalAdapter.this.f38063u.mo35687Fo(new Rect(m89096G, m89098H, this.f64545L.m89114P() + m89096G, this.f64545L.m89112O() + m89098H));
            }
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            int i12 = 0;
            this.f64546M.mo44614b1(0);
            int m102827H = C19637j.f97466a.m102827H(GroupMemApprovalAdapter.this.f38066x);
            if (m102827H == 0) {
                this.f64546M.m111958F1(AbstractC8020f0.str_setting_pending_requests_no_number);
                this.f64545L.mo44614b1(8);
            } else {
                this.f64546M.m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_setting_pending_requests, Integer.valueOf(m102827H)));
                this.f64545L.mo44614b1(0);
                this.f64545L.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.y1
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        GroupMemApprovalAdapter.SectionHeaderJoinPendingModuleView.this.m35681W(c16719g);
                    }
                });
            }
            C16719g c16719g = this.f64544K;
            if (!c32188y5.f148445d) {
                i12 = 8;
            }
            c16719g.mo44614b1(i12);
        }
    }

    /* loaded from: classes3.dex */
    public class SectionHeaderModuleView extends BaseHeaderTitleModuleView implements InterfaceC6951b {
        public SectionHeaderModuleView(Context context) {
            super(context);
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            int i12 = 0;
            this.f64546M.mo44614b1(0);
            this.f64546M.m111959G1(c32188y5.f148444c);
            C16719g c16719g = this.f64544K;
            if (!c32188y5.f148445d) {
                i12 = 8;
            }
            c16719g.mo44614b1(i12);
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$a */
    /* loaded from: classes3.dex */
    public class ViewOnClickListenerC6950a extends C6954e implements View.OnClickListener {

        /* renamed from: I */
        AvatarImageView f38072I;

        /* renamed from: J */
        RobotoTextView f38073J;

        /* renamed from: K */
        RobotoTextView f38074K;

        /* renamed from: L */
        View f38075L;

        /* renamed from: M */
        RobotoTextView f38076M;

        /* renamed from: N */
        RobotoTextView f38077N;

        /* renamed from: O */
        View f38078O;

        /* renamed from: P */
        C32174x5 f38079P;

        public ViewOnClickListenerC6950a(View view) {
            super(view);
            this.f38072I = (AvatarImageView) view.findViewById(AbstractC6918a0.avatar);
            this.f38073J = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_name);
            this.f38074K = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_desc);
            this.f38075L = view.findViewById(AbstractC6918a0.btns_container);
            this.f38076M = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_approve);
            this.f38077N = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_remove);
            this.f38078O = view.findViewById(AbstractC6918a0.separate_line);
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.C6954e, com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            if (c32188y5 != null) {
                try {
                    C32174x5 c32174x5 = c32188y5.f148443b;
                    if (c32174x5 == null) {
                        return;
                    }
                    this.f38079P = c32174x5;
                    String m114542i = AbstractC21935u.m114542i(c32174x5.f148356a, c32174x5.f148357b);
                    this.f38074K.setVisibility(0);
                    Context context = this.f7784p.getContext();
                    switch (this.f38079P.f148365j) {
                        case 0:
                        case 12:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                            C32174x5 c32174x52 = this.f38079P;
                            int i12 = c32174x52.f148359d;
                            if (i12 == 0) {
                                this.f38074K.setText(c32174x52.f148360e);
                            } else if (i12 == 1) {
                                String m114542i2 = AbstractC21935u.m114542i(c32174x52.f148362g, c32174x52.f148363h);
                                String format = String.format(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_invited_by), m114542i2);
                                SpannableString spannableString = new SpannableString(format);
                                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(context, AbstractC21196a.TextColor1)), format.length() - m114542i2.length(), spannableString.length(), 0);
                                this.f38074K.setText(spannableString);
                            }
                            if (TextUtils.isEmpty(this.f38074K.getText().toString())) {
                                this.f38074K.setText(AbstractC8020f0.str_join_group_default_msg);
                            }
                            this.f38076M.setVisibility(0);
                            this.f38077N.setVisibility(0);
                            break;
                        case 1:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_mem_approved));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 2:
                            this.f38074K.setVisibility(0);
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            if (!TextUtils.isEmpty(this.f38079P.f148366k)) {
                                this.f38074K.setText(this.f38079P.f148366k);
                            } else {
                                this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_error_please_try_again_later));
                            }
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 3:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_accepted_by_another_admin));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 4:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_rejected_by_another_admin));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 5:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_error_user_reach_max_groups));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 6:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_error_group_full_members));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 7:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            if (!TextUtils.isEmpty(this.f38079P.f148366k)) {
                                this.f38074K.setText(this.f38079P.f148366k);
                            } else {
                                this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_error_user_version_not_supported_e2ee));
                            }
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 8:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            if (TextUtils.isEmpty(this.f38079P.f148366k)) {
                                this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_group_exceed_max_member_e2ee, Integer.valueOf(AbstractC0924m0.m4248u3())));
                            } else {
                                this.f38074K.setText(this.f38079P.f148366k);
                            }
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 9:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            if (!TextUtils.isEmpty(this.f38079P.f148366k)) {
                                this.f38074K.setText(this.f38079P.f148366k);
                            } else {
                                this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_group_e2ee_member_blacklisted));
                            }
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 10:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_cannot_invite_this_user_to_group));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                        case 11:
                            this.f38074K.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                            this.f38074K.setText(GroupMemApprovalAdapter.this.f38060r.getString(AbstractC8020f0.str_msg_approving));
                            this.f38076M.setVisibility(8);
                            this.f38077N.setVisibility(8);
                            break;
                    }
                    this.f38073J.setText(m114542i);
                    ((C23528a) GroupMemApprovalAdapter.this.f38064v.m123612r(this.f38072I)).m123613s(AbstractC16803z.default_avatar);
                    if (!TextUtils.isEmpty(this.f38079P.f148358c)) {
                        if (C23302b.f113247a.m120523d(this.f38079P.f148358c) && !CoreUtility.f89233i.equals(this.f38079P.f148356a)) {
                            this.f38072I.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), C2343e.m12307a(this.f38079P.f148356a, false)));
                        } else if (!z11 || C23999j.m125696L2(this.f38079P.f148358c, C23278z2.m120143n())) {
                            ((C23528a) GroupMemApprovalAdapter.this.f38064v.m123612r(this.f38072I)).m123618x(this.f38079P.f148358c, C23278z2.m120143n());
                        }
                    }
                    this.f38076M.setOnClickListener(this);
                    this.f38077N.setOnClickListener(this);
                    this.f38072I.setOnClickListener(this);
                    this.f38073J.setOnClickListener(this);
                    this.f38074K.setOnClickListener(this);
                    if (this.f38076M.getVisibility() != 0 && this.f38077N.getVisibility() != 0) {
                        this.f38075L.setVisibility(8);
                        return;
                    }
                    this.f38075L.setVisibility(0);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f38079P == null) {
                return;
            }
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.avatar && id2 != AbstractC6918a0.tv_name) {
                if (id2 == AbstractC6918a0.btn_remove) {
                    if (GroupMemApprovalAdapter.this.f38063u != null) {
                        AbstractC23647d.m123897g("1591035");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f38079P);
                        GroupMemApprovalAdapter.this.f38063u.mo35689jz(arrayList);
                        return;
                    }
                    return;
                }
                if (id2 == AbstractC6918a0.btn_approve) {
                    if (GroupMemApprovalAdapter.this.f38063u != null) {
                        AbstractC23647d.m123897g("1591036");
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.f38079P);
                        GroupMemApprovalAdapter.this.f38063u.mo35692yj(arrayList2);
                        return;
                    }
                    return;
                }
                if (id2 == AbstractC6918a0.tv_desc && GroupMemApprovalAdapter.this.f38063u != null && this.f38079P.f148359d == 1) {
                    AbstractC23647d.m123897g("1591037");
                    GroupMemApprovalAdapter.this.f38063u.mo35691v1(this.f38079P.f148362g);
                    return;
                }
                return;
            }
            InterfaceC6957h interfaceC6957h = GroupMemApprovalAdapter.this.f38063u;
            if (interfaceC6957h != null) {
                interfaceC6957h.mo35691v1(this.f38079P.f148356a);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$b */
    /* loaded from: classes3.dex */
    private interface InterfaceC6951b {
        /* renamed from: K */
        void mo35679K(C32188y5 c32188y5, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$c */
    /* loaded from: classes3.dex */
    public static class C6952c extends C6954e {

        /* renamed from: I */
        RobotoTextView f38081I;

        public C6952c(View view) {
            super(view);
            this.f38081I = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_message);
            this.f38081I.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_join_pending_empty_v2));
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$d */
    /* loaded from: classes3.dex */
    public static class C6953d extends C6954e {

        /* renamed from: I */
        RobotoTextView f38082I;

        /* renamed from: J */
        AppCompatImageView f38083J;

        public C6953d(View view) {
            super(view);
            this.f38082I = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmpty);
            this.f38083J = (AppCompatImageView) view.findViewById(AbstractC6918a0.imvEmpty);
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.C6954e, com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            if (c32188y5.f148447f == 50001) {
                AppCompatImageView appCompatImageView = this.f38083J;
                appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView.getContext(), AbstractC16803z.im_connect));
                this.f38082I.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
            } else {
                this.f38083J.setImageResource(AbstractC16803z.im_servererror);
                this.f38082I.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loading_join_pending_requests));
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$e */
    /* loaded from: classes3.dex */
    public static class C6954e extends RecyclerView.AbstractC1876c0 implements InterfaceC6951b {
        public C6954e(View view) {
            super(view);
        }

        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$f */
    /* loaded from: classes3.dex */
    public class C6955f extends C6954e {

        /* renamed from: I */
        RobotoTextView f38084I;

        public C6955f(View view) {
            super(view);
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_content);
            this.f38084I = robotoTextView;
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GroupMemApprovalAdapter.C6955f.this.m35683j0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public /* synthetic */ void m35683j0(View view) {
            GroupMemApprovalAdapter.this.f38063u.mo35686Er();
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.C6954e, com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            this.f38084I.setText(c32188y5.f148444c);
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$g */
    /* loaded from: classes3.dex */
    public class C6956g extends C6954e {

        /* renamed from: I */
        LinearLayout f38086I;

        /* renamed from: J */
        LinearLayout f38087J;

        public C6956g(View view) {
            super(view);
            this.f38086I = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            this.f38087J = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public /* synthetic */ void m35685j0(View view) {
            InterfaceC6957h interfaceC6957h = GroupMemApprovalAdapter.this.f38063u;
            if (interfaceC6957h != null) {
                interfaceC6957h.mo35688i3();
            }
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.C6954e, com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            int i12 = GroupMemApprovalAdapter.this.f38068z;
            if (i12 != 1) {
                if (i12 != 2) {
                    this.f38087J.setVisibility(8);
                    this.f38086I.setVisibility(8);
                    return;
                } else {
                    this.f38087J.setVisibility(8);
                    this.f38086I.setVisibility(0);
                    this.f38086I.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.w1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupMemApprovalAdapter.C6956g.this.m35685j0(view);
                        }
                    });
                    return;
                }
            }
            this.f38086I.setVisibility(8);
            this.f38087J.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$h */
    /* loaded from: classes3.dex */
    public interface InterfaceC6957h {
        /* renamed from: Er */
        void mo35686Er();

        /* renamed from: Fo */
        void mo35687Fo(Rect rect);

        /* renamed from: i3 */
        void mo35688i3();

        /* renamed from: jz */
        void mo35689jz(ArrayList arrayList);

        /* renamed from: kE */
        void mo35690kE(C21696f c21696f, boolean z11);

        /* renamed from: v1 */
        void mo35691v1(String str);

        /* renamed from: yj */
        void mo35692yj(ArrayList arrayList);
    }

    /* renamed from: com.zing.zalo.adapters.GroupMemApprovalAdapter$i */
    /* loaded from: classes3.dex */
    public static class C6958i extends C6954e {

        /* renamed from: I */
        public ModulesView f38089I;

        public C6958i(ModulesView modulesView) {
            super(modulesView);
            this.f38089I = modulesView;
        }

        @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.C6954e, com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6951b
        /* renamed from: K */
        public void mo35679K(C32188y5 c32188y5, int i11, boolean z11) {
            ViewParent viewParent = this.f38089I;
            if (viewParent instanceof InterfaceC6951b) {
                ((InterfaceC6951b) viewParent).mo35679K(c32188y5, i11, z11);
            }
        }
    }

    public GroupMemApprovalAdapter(Context context, C23528a c23528a, InterfaceC6957h interfaceC6957h) {
        this.f38060r = context;
        this.f38064v = c23528a;
        this.f38063u = interfaceC6957h;
        this.f38061s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: L */
    public C32188y5 m35672L(int i11) {
        if (i11 < this.f38065w.size() && i11 >= 0) {
            return (C32188y5) this.f38065w.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C6954e c6954e, int i11) {
        try {
            c6954e.mo35679K(m35672L(i11), i11, this.f38062t);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public C6954e mo9992C(ViewGroup viewGroup, int i11) {
        switch (i11) {
            case 1:
                return new ViewOnClickListenerC6950a(this.f38061s.inflate(AbstractC7409c0.item_group_mem_approval, viewGroup, false));
            case 2:
                return new C6952c(this.f38061s.inflate(AbstractC7409c0.item_group_mem_approval_empty, viewGroup, false));
            case 3:
                return new C6953d(this.f38061s.inflate(AbstractC7409c0.item_group_mem_approval_error, viewGroup, false));
            case 4:
                return new C6956g(this.f38061s.inflate(AbstractC7409c0.group_rada_footer, viewGroup, false));
            case 5:
                return new C6958i(new SectionHeaderModuleView(this.f38060r));
            case 6:
                return new C6958i(new SectionHeaderJoinPendingModuleView(this.f38060r));
            case 7:
                return new C6958i(new MemberApprovalSettingModuleView(this.f38060r, this.f38067y));
            case 8:
                View inflate = this.f38061s.inflate(AbstractC7409c0.group_members_approval_join_question, viewGroup, false);
                if (this.f38067y) {
                    ((RobotoTextView) inflate.findViewById(AbstractC6918a0.group_members_approval_question_message)).setText(AbstractC8020f0.str_community_join_question_message);
                }
                return new C6955f(inflate);
            default:
                return new C6954e(new View(this.f38060r));
        }
    }

    /* renamed from: O */
    public void m35675O(String str) {
        boolean z11;
        this.f38066x = str;
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f38066x);
        if (m4472f != null && m4472f.m153747Y()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38067y = z11;
    }

    /* renamed from: P */
    public void m35676P(List list, int i11) {
        this.f38065w.clear();
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f38066x);
        if (m4472f == null) {
            return;
        }
        this.f38065w.add(new C32188y5(5, AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_app), false));
        this.f38065w.add(new C32188y5(7, m4472f.m153755d0()));
        if (m4472f.m153755d0()) {
            this.f38065w.add(new C32188y5(5, AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_approval_options), true));
            this.f38065w.add(new C32188y5(8, m4472f.m153785t(), false));
            this.f38065w.add(new C32188y5(6, "", true));
            if (i11 != 0) {
                this.f38065w.add(new C32188y5(3, i11));
                return;
            }
            if (list != null && list.size() != 0) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    this.f38065w.add(new C32188y5(1, (C32174x5) list.get(i12)));
                }
                this.f38065w.add(new C32188y5(4));
                return;
            }
            this.f38065w.add(new C32188y5(2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38065w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C32188y5 m35672L = m35672L(i11);
        if (m35672L != null) {
            return m35672L.f148442a;
        }
        return -1;
    }
}
