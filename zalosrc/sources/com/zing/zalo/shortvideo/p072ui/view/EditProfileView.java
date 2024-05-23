package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bi0.AbstractC2810d;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.EditProfileConfig;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.view.CropImagePageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import pm0.C24848g0;
import q10.C25001e1;
import q20.AbstractC25088k;
import q20.C25084g;
import q20.C25097t;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class EditProfileView extends SimpleView {
    public static final C10221a Companion = new C10221a(null);

    /* renamed from: B0 */
    private C25001e1 f52787B0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$a */
    /* loaded from: classes5.dex */
    public static final class C10221a {
        private C10221a() {
        }

        public /* synthetic */ C10221a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$b */
    /* loaded from: classes5.dex */
    static final class C10222b extends AbstractC19075u implements InterfaceC18505l {
        C10222b() {
            super(1);
        }

        /* renamed from: a */
        public final void m54295a(Uri uri) {
            AbstractC19074t.m100208f(uri, "uri");
            C17487o0 m92662fJ = EditProfileView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.mo57057c2(AbstractC27409d.masterFrame, EditChannelAvatarPageView.class, CropImagePageView.C10203b.m54235b(CropImagePageView.Companion, uri, 0.0f, false, 6, null), 9003, null, 0, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54295a((Uri) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$c */
    /* loaded from: classes5.dex */
    static final class C10223c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25001e1 f52790r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10223c(C25001e1 c25001e1) {
            super(1);
            this.f52790r = c25001e1;
        }

        /* renamed from: a */
        public final void m54296a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C25084g.f120484a.m130017a(EditProfileView.this.getContext(), this.f52790r.f119873E.getText().toString());
            C25097t.f120556a.m130154o(EditProfileView.this.getContext(), EditProfileView.this.m92652XI(AbstractC27413h.zch_page_edit_profile_copy_id));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54296a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$d */
    /* loaded from: classes5.dex */
    static final class C10224d extends AbstractC19075u implements InterfaceC18505l {
        C10224d() {
            super(1);
        }

        /* renamed from: a */
        public final void m54297a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileView.this.m54291hL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54297a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$e */
    /* loaded from: classes5.dex */
    static final class C10225e extends AbstractC19075u implements InterfaceC18505l {
        C10225e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54298a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileView.this.m54291hL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54298a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$f */
    /* loaded from: classes5.dex */
    static final class C10226f extends AbstractC19075u implements InterfaceC18505l {
        C10226f() {
            super(1);
        }

        /* renamed from: a */
        public final void m54299a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileView.this.m54290gL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54299a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$g */
    /* loaded from: classes5.dex */
    static final class C10227g extends AbstractC19075u implements InterfaceC18505l {
        C10227g() {
            super(1);
        }

        /* renamed from: a */
        public final void m54300a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileView.this.m54290gL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54300a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$h */
    /* loaded from: classes5.dex */
    static final class C10228h extends AbstractC19075u implements InterfaceC18505l {
        C10228h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54301a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileView.this.m54289fL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54301a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$i */
    /* loaded from: classes5.dex */
    static final class C10229i extends AbstractC19075u implements InterfaceC18505l {
        C10229i() {
            super(1);
        }

        /* renamed from: a */
        public final void m54302a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileView.this.m54289fL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54302a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileView$j */
    /* loaded from: classes5.dex */
    static final class C10230j extends AbstractC19075u implements InterfaceC18505l {
        C10230j() {
            super(1);
        }

        /* renamed from: a */
        public final void m54303a(View view) {
            Long l11;
            long j11;
            AbstractC19074t.m100208f(view, "it");
            C27417l c27417l = C27417l.f129055a;
            Channel m140377a = c27417l.m140377a();
            if (m140377a != null) {
                Long m50758f = m140377a.m50758f();
                if (m50758f != null) {
                    j11 = m50758f.longValue();
                } else {
                    j11 = 0;
                }
                if (j11 < c27417l.m140382f().m130131a()) {
                    AbstractC25088k.Companion.m130039j(EditProfileView.this);
                    C19205a c19205a = C19205a.f95429a;
                    String m92652XI = EditProfileView.this.m92652XI(AbstractC27413h.zch_action_key_change_avatar);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    c19205a.m100713L(m92652XI, null);
                }
            }
            Channel m140377a2 = c27417l.m140377a();
            if (m140377a2 != null) {
                l11 = m140377a2.m50758f();
            } else {
                l11 = null;
            }
            if (l11 != null) {
                C25097t c25097t = C25097t.f120556a;
                Context context = EditProfileView.this.getContext();
                EditProfileView editProfileView = EditProfileView.this;
                c25097t.m130154o(context, editProfileView.m92653YI(AbstractC27413h.zch_page_edit_profile_toast_time_allow_to_edit_channel_avatar, editProfileView.m54292iL(l11.longValue())));
            }
            C19205a c19205a2 = C19205a.f95429a;
            String m92652XI2 = EditProfileView.this.m92652XI(AbstractC27413h.zch_action_key_change_avatar);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            c19205a2.m100713L(m92652XI2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54303a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: eL */
    private final void m54288eL(String str) {
        ChannelReceiver.Companion.m53695b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public final void m54289fL() {
        Long l11;
        long j11;
        C27417l c27417l = C27417l.f129055a;
        Channel m140377a = c27417l.m140377a();
        if (m140377a != null) {
            Long m50759g = m140377a.m50759g();
            if (m50759g != null) {
                j11 = m50759g.longValue();
            } else {
                j11 = 0;
            }
            if (j11 < c27417l.m140382f().m130131a()) {
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.mo57057c2(AbstractC27409d.masterFrame, EditProfileDetailView.class, EditProfileDetailView.Companion.m54273a("TYPE_EDIT_INTRODUCE"), 9002, null, 0, true);
                }
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_change_bio);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                c19205a.m100713L(m92652XI, null);
            }
        }
        if (m140377a != null) {
            l11 = m140377a.m50759g();
        } else {
            l11 = null;
        }
        if (l11 != null) {
            C25097t.f120556a.m130154o(getContext(), m92653YI(AbstractC27413h.zch_page_edit_profile_toast_time_allow_to_edit_channel_bio, m54292iL(l11.longValue())));
        }
        C19205a c19205a2 = C19205a.f95429a;
        String m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_change_bio);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        c19205a2.m100713L(m92652XI2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gL */
    public final void m54290gL() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.mo57057c2(AbstractC27409d.masterFrame, EditProfileDetailView.class, EditProfileDetailView.Companion.m54273a("TYPE_EDIT_ID"), 9001, null, 0, true);
        }
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_change_alias);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        c19205a.m100713L(m92652XI, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hL */
    public final void m54291hL() {
        Long l11;
        long j11;
        C27417l c27417l = C27417l.f129055a;
        Channel m140377a = c27417l.m140377a();
        if (m140377a != null) {
            Long m50761h = m140377a.m50761h();
            if (m50761h != null) {
                j11 = m50761h.longValue();
            } else {
                j11 = 0;
            }
            if (j11 < c27417l.m140382f().m130131a()) {
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.mo57057c2(AbstractC27409d.masterFrame, EditProfileDetailView.class, EditProfileDetailView.Companion.m54273a("TYPE_EDIT_NAME"), 9000, null, 0, true);
                }
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_change_channel_name);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                c19205a.m100713L(m92652XI, null);
            }
        }
        if (m140377a != null) {
            l11 = m140377a.m50761h();
        } else {
            l11 = null;
        }
        if (l11 != null) {
            C25097t.f120556a.m130154o(getContext(), m92653YI(AbstractC27413h.zch_page_edit_profile_toast_time_allow_to_edit_channel_name, m54292iL(l11.longValue())));
        }
        C19205a c19205a2 = C19205a.f95429a;
        String m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_change_channel_name);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        c19205a2.m100713L(m92652XI2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public final String m54292iL(long j11) {
        String format = new SimpleDateFormat("HH:mm dd-MM-yyyy", Locale.getDefault()).format(Long.valueOf(j11));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0198, code lost:            if (r4 > r0.m140382f().m130131a()) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020a, code lost:            if (r4 > r0.m140382f().m130131a()) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0236, code lost:            if (r2 > r0.m140382f().m130131a()) goto L65;     */
    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j11;
        String m50752b;
        long j12;
        EditProfileConfig m51426c;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        C25001e1 m129799a = C25001e1.m129799a(m55010SK());
        AbstractC19074t.m100207e(m129799a, "bind(...)");
        this.f52787B0 = m129799a;
        String str = null;
        if (m129799a == null) {
            AbstractC19074t.m100223u("binding");
            m129799a = null;
        }
        C27417l c27417l = C27417l.f129055a;
        Channel m140377a = c27417l.m140377a();
        ChannelConfig m140381e = c27417l.m140381e();
        if (m140377a != null) {
            m129799a.f119878s.setAvatar(m140377a);
            m129799a.f119870B.setText(m140377a.m50775o());
            if (m140381e != null && (m51426c = m140381e.m51426c()) != null) {
                str = m51426c.m51464a();
            }
            if (str == null) {
                str = "";
            }
            String m50752b2 = m140377a.m50752b();
            if (m50752b2 != null && m50752b2.length() != 0) {
                if (str.length() == 0) {
                    EllipsizedTextView ellipsizedTextView = m129799a.f119873E;
                    AbstractC19074t.m100207e(ellipsizedTextView, "tvIDFull");
                    AbstractC26112n.m134367H(ellipsizedTextView);
                } else {
                    m129799a.f119873E.setText(str + "/" + m140377a.m50752b());
                    EllipsizedTextView ellipsizedTextView2 = m129799a.f119873E;
                    AbstractC19074t.m100207e(ellipsizedTextView2, "tvIDFull");
                    AbstractC26112n.m134431w0(ellipsizedTextView2);
                }
                EllipsizedTextView ellipsizedTextView3 = m129799a.f119872D;
                ellipsizedTextView3.setText(m140377a.m50752b());
                AbstractC19074t.m100205c(ellipsizedTextView3);
                ellipsizedTextView3.setTextColor(AbstractC26112n.m134426u(ellipsizedTextView3, AbstractC27406a.zch_icon_secondary));
            } else {
                EllipsizedTextView ellipsizedTextView4 = m129799a.f119873E;
                AbstractC19074t.m100207e(ellipsizedTextView4, "tvIDFull");
                AbstractC26112n.m134367H(ellipsizedTextView4);
                EllipsizedTextView ellipsizedTextView5 = m129799a.f119872D;
                ellipsizedTextView5.setText(m92652XI(AbstractC27413h.zch_page_edit_profile_add_id));
                AbstractC19074t.m100205c(ellipsizedTextView5);
                ellipsizedTextView5.setTextColor(AbstractC26112n.m134426u(ellipsizedTextView5, AbstractC27406a.zch_icon_tertiary));
            }
            String m50755d = m140377a.m50755d();
            if (m50755d != null && m50755d.length() != 0) {
                EllipsizedTextView ellipsizedTextView6 = m129799a.f119885z;
                ellipsizedTextView6.setText(m140377a.m50755d());
                AbstractC19074t.m100205c(ellipsizedTextView6);
                ellipsizedTextView6.setTextColor(AbstractC26112n.m134426u(ellipsizedTextView6, AbstractC27406a.zch_icon_secondary));
            } else {
                EllipsizedTextView ellipsizedTextView7 = m129799a.f119885z;
                ellipsizedTextView7.setText(m92652XI(AbstractC27413h.zch_page_edit_profile_add_bio));
                AbstractC19074t.m100205c(ellipsizedTextView7);
                ellipsizedTextView7.setTextColor(AbstractC26112n.m134426u(ellipsizedTextView7, AbstractC27406a.zch_icon_tertiary));
            }
        }
        ImageView imageView = m129799a.f119879t;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        imageView.setImageDrawable(C27280g.m139659b(m92689tK, AbstractC2810d.zds_ic_camera_line_16, AbstractC27406a.zch_icon_primary));
        ImageView imageView2 = m129799a.f119882w;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        imageView2.setImageDrawable(C27280g.m139659b(m92689tK2, AbstractC2810d.zds_ic_edit_text_line_16, AbstractC27406a.zch_icon_secondary));
        ImageView imageView3 = m129799a.f119881v;
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        imageView3.setImageDrawable(C27280g.m139659b(m92689tK3, AbstractC2810d.zds_ic_edit_text_line_16, AbstractC27406a.zch_icon_secondary));
        ImageView imageView4 = m129799a.f119883x;
        Context m92689tK4 = m92689tK();
        AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
        imageView4.setImageDrawable(C27280g.m139659b(m92689tK4, AbstractC2810d.zds_ic_edit_text_line_16, AbstractC27406a.zch_icon_secondary));
        ImageView imageView5 = m129799a.f119880u;
        AbstractC19074t.m100207e(imageView5, "ivCopy");
        AbstractC26112n.m134407k0(imageView5, new C10223c(m129799a));
        ImageView imageView6 = m129799a.f119882w;
        AbstractC19074t.m100207e(imageView6, "ivEditName");
        AbstractC26112n.m134407k0(imageView6, new C10224d());
        EllipsizedTextView ellipsizedTextView8 = m129799a.f119870B;
        AbstractC19074t.m100207e(ellipsizedTextView8, "tvChannelName");
        AbstractC26112n.m134407k0(ellipsizedTextView8, new C10225e());
        long j13 = 0;
        if (m140377a != null) {
            Long m50761h = m140377a.m50761h();
            if (m50761h != null) {
                j12 = m50761h.longValue();
            } else {
                j12 = 0;
            }
        }
        m129799a.f119882w.setAlpha(0.5f);
        if (m140377a != null && ((m50752b = m140377a.m50752b()) == null || m50752b.length() == 0)) {
            ImageView imageView7 = m129799a.f119881v;
            AbstractC19074t.m100207e(imageView7, "ivEditID");
            AbstractC26112n.m134407k0(imageView7, new C10226f());
            EllipsizedTextView ellipsizedTextView9 = m129799a.f119872D;
            AbstractC19074t.m100207e(ellipsizedTextView9, "tvID");
            AbstractC26112n.m134407k0(ellipsizedTextView9, new C10227g());
        } else {
            ImageView imageView8 = m129799a.f119881v;
            AbstractC19074t.m100207e(imageView8, "ivEditID");
            AbstractC26112n.m134367H(imageView8);
        }
        ImageView imageView9 = m129799a.f119883x;
        AbstractC19074t.m100207e(imageView9, "ivEdtBio");
        AbstractC26112n.m134407k0(imageView9, new C10228h());
        EllipsizedTextView ellipsizedTextView10 = m129799a.f119885z;
        AbstractC19074t.m100207e(ellipsizedTextView10, "tvBio");
        AbstractC26112n.m134407k0(ellipsizedTextView10, new C10229i());
        if (m140377a != null) {
            Long m50759g = m140377a.m50759g();
            if (m50759g != null) {
                j11 = m50759g.longValue();
            } else {
                j11 = 0;
            }
        }
        m129799a.f119883x.setAlpha(0.5f);
        AvatarImageView avatarImageView = m129799a.f119878s;
        AbstractC19074t.m100207e(avatarImageView, "ivAvatar");
        AbstractC26112n.m134407k0(avatarImageView, new C10230j());
        if (m140377a != null) {
            Long m50758f = m140377a.m50758f();
            if (m50758f != null) {
                j13 = m50758f.longValue();
            }
        }
        m129799a.f119879t.setAlpha(0.5f);
        return mo37483GJ;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: TK */
    public int mo54293TK() {
        return AbstractC27410e.zch_layout_edit_profile;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: VK */
    public String mo54294VK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_page_edit_profile_channel_info);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (intent != null) {
            try {
                if (AbstractC25088k.a.m130034f(AbstractC25088k.Companion, getContext(), i11, i12, intent, new C10222b(), null, 32, null)) {
                    return;
                }
                String stringExtra = intent.getStringExtra("EXTRA_EDIT_PROFILE");
                Channel m140377a = C27417l.f129055a.m140377a();
                C25001e1 c25001e1 = null;
                switch (i11) {
                    case 9000:
                        C25001e1 c25001e12 = this.f52787B0;
                        if (c25001e12 == null) {
                            AbstractC19074t.m100223u("binding");
                            c25001e12 = null;
                        }
                        c25001e12.f119870B.setText(stringExtra);
                        C25001e1 c25001e13 = this.f52787B0;
                        if (c25001e13 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c25001e1 = c25001e13;
                        }
                        c25001e1.f119882w.setAlpha(0.5f);
                        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_page_edit_profile_channel_name_success_toast);
                        if (m140377a != null) {
                            m54288eL(m140377a.m50769l());
                            return;
                        }
                        return;
                    case 9001:
                        C25001e1 c25001e14 = this.f52787B0;
                        if (c25001e14 == null) {
                            AbstractC19074t.m100223u("binding");
                            c25001e14 = null;
                        }
                        c25001e14.f119872D.setText(stringExtra);
                        C25001e1 c25001e15 = this.f52787B0;
                        if (c25001e15 == null) {
                            AbstractC19074t.m100223u("binding");
                            c25001e15 = null;
                        }
                        c25001e15.f119881v.setAlpha(0.5f);
                        C25001e1 c25001e16 = this.f52787B0;
                        if (c25001e16 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c25001e1 = c25001e16;
                        }
                        c25001e1.f119881v.setClickable(false);
                        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_page_edit_profile_channel_id_success_toast);
                        if (m140377a != null) {
                            m54288eL(m140377a.m50769l());
                            return;
                        }
                        return;
                    case 9002:
                        C25001e1 c25001e17 = this.f52787B0;
                        if (c25001e17 == null) {
                            AbstractC19074t.m100223u("binding");
                            c25001e17 = null;
                        }
                        c25001e17.f119885z.setText(stringExtra);
                        C25001e1 c25001e18 = this.f52787B0;
                        if (c25001e18 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c25001e1 = c25001e18;
                        }
                        c25001e1.f119883x.setAlpha(0.5f);
                        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_page_edit_profile_channel_bio_success_toast);
                        if (m140377a != null) {
                            m54288eL(m140377a.m50769l());
                            return;
                        }
                        return;
                    case 9003:
                        String stringExtra2 = intent.getStringExtra("EXTRA_EDIT_CHANNEL_AVATAR");
                        if (m140377a != null) {
                            m140377a.m50748X(stringExtra2);
                        }
                        C25001e1 c25001e19 = this.f52787B0;
                        if (c25001e19 == null) {
                            AbstractC19074t.m100223u("binding");
                            c25001e19 = null;
                        }
                        c25001e19.f119879t.setAlpha(0.5f);
                        if (m140377a != null) {
                            C25001e1 c25001e110 = this.f52787B0;
                            if (c25001e110 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c25001e1 = c25001e110;
                            }
                            c25001e1.f119878s.setAvatar(m140377a);
                            C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_page_edit_profile_channel_avatar_success_toast);
                            m54288eL(m140377a.m50769l());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
