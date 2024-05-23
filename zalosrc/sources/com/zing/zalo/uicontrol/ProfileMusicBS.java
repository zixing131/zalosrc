package com.zing.zalo.uicontrol;

import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.mvp.music.data.ExceptionFetchMusicUnknown;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.ProfileMusicBS;
import com.zing.zalo.uicontrol.ProfileMusicPlayerView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23283z7;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25453e;
import p456qp.C25454f;
import p542ub.InterfaceC27218a;
import p649xl.C29748ca;
import p716zh.C32065p8;
import s00.AbstractC26080o;
import ui0.C27280g;
import w20.InterfaceC28702e;

/* loaded from: classes4.dex */
public final class ProfileMusicBS extends BottomSheet implements C23744a.c, InterfaceC28702e {

    /* renamed from: b1 */
    private C29748ca f83300b1;

    /* renamed from: e1 */
    private C24902e f83303e1;

    /* renamed from: f1 */
    private C24903f f83304f1;

    /* renamed from: i1 */
    private boolean f83307i1;

    /* renamed from: j1 */
    private C23528a f83308j1;

    /* renamed from: k1 */
    private ContactProfile.C7871g f83309k1;

    /* renamed from: l1 */
    private boolean f83310l1;

    /* renamed from: c1 */
    private final EnumC17017m f83301c1 = EnumC17017m.HUG_CONTENT;

    /* renamed from: d1 */
    private Exception f83302d1 = ExceptionFetchMusicUnknown.f46307p;

    /* renamed from: g1 */
    private String f83305g1 = "";

    /* renamed from: h1 */
    private String f83306h1 = "";

    /* renamed from: m1 */
    private String f83311m1 = "";

    /* renamed from: n1 */
    private Handler f83312n1 = new HandlerC16476b(Looper.getMainLooper());

    /* renamed from: o1 */
    private final C16477c f83313o1 = new C16477c();

    /* renamed from: com.zing.zalo.uicontrol.ProfileMusicBS$a */
    /* loaded from: classes4.dex */
    public static final class C16475a implements C25453e.a {
        C16475a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m87820f(ProfileMusicBS profileMusicBS, Exception exc) {
            AbstractC19074t.m100208f(profileMusicBS, "this$0");
            AbstractC19074t.m100208f(exc, "$errorCode");
            profileMusicBS.f83307i1 = false;
            profileMusicBS.m87803aM(exc);
            profileMusicBS.m87816nM(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m87821g(C24902e c24902e, ProfileMusicBS profileMusicBS, C24903f c24903f) {
            AbstractC19074t.m100208f(c24902e, "$song");
            AbstractC19074t.m100208f(profileMusicBS, "this$0");
            AbstractC19074t.m100208f(c24903f, "$streaming");
            if (TextUtils.equals(c24902e.m129490f(), profileMusicBS.f83306h1)) {
                profileMusicBS.f83307i1 = true;
                profileMusicBS.f83303e1 = c24902e;
                profileMusicBS.f83304f1 = c24903f;
                profileMusicBS.m87804bM();
                profileMusicBS.m87816nM(0);
                C23744a.Companion.m124119a().m124116d(5001, new Object[0]);
            }
        }

        @Override // p456qp.C25453e.a
        /* renamed from: a */
        public void mo87822a(String str, final Exception exc) {
            AbstractC19074t.m100208f(str, "songId");
            AbstractC19074t.m100208f(exc, "errorCode");
            if (TextUtils.equals(str, str)) {
                final ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.uicontrol.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileMusicBS.C16475a.m87820f(ProfileMusicBS.this, exc);
                    }
                });
            }
        }

        @Override // p456qp.C25453e.a
        /* renamed from: b */
        public void mo87823b(final C24902e c24902e, final C24903f c24903f) {
            AbstractC19074t.m100208f(c24902e, "song");
            AbstractC19074t.m100208f(c24903f, "streaming");
            final ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.uicontrol.h0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileMusicBS.C16475a.m87821g(C24902e.this, profileMusicBS, c24903f);
                }
            });
        }

        @Override // p456qp.C25453e.a
        /* renamed from: c */
        public void mo87824c(Job job) {
            AbstractC19074t.m100208f(job, "job");
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.ProfileMusicBS$b */
    /* loaded from: classes4.dex */
    public static final class HandlerC16476b extends Handler {
        HandlerC16476b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            try {
                if (message.what == 1) {
                    C29748ca c29748ca = ProfileMusicBS.this.f83300b1;
                    if (c29748ca == null) {
                        AbstractC19074t.m100223u("_binding");
                        c29748ca = null;
                    }
                    c29748ca.f137425r.m87843k();
                    return;
                }
                super.handleMessage(message);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.ProfileMusicBS$c */
    /* loaded from: classes4.dex */
    public static final class C16477c implements ProfileMusicPlayerView.InterfaceC16479a {
        C16477c() {
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: a */
        public void mo87825a() {
            ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
            profileMusicBS.m87810hM(profileMusicBS.f83306h1);
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: b */
        public void mo87826b() {
            String str;
            if (ProfileMusicBS.this.f83303e1 != null) {
                C24902e c24902e = ProfileMusicBS.this.f83303e1;
                String str2 = null;
                if (c24902e != null) {
                    str = c24902e.m129495k();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
                    C24902e c24902e2 = profileMusicBS.f83303e1;
                    if (c24902e2 != null) {
                        str2 = c24902e2.m129495k();
                    }
                    profileMusicBS.m87812jM(str2, ProfileMusicBS.this.f83306h1);
                }
            }
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: c */
        public void mo87827c() {
            ContactProfile.C7871g c7871g;
            String str;
            if (ProfileMusicBS.this.f83309k1 != null && (c7871g = ProfileMusicBS.this.f83309k1) != null && c7871g.m40463f()) {
                ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
                ContactProfile.C7871g c7871g2 = profileMusicBS.f83309k1;
                String str2 = null;
                if (c7871g2 != null) {
                    str = c7871g2.m40459b();
                } else {
                    str = null;
                }
                ContactProfile.C7871g c7871g3 = ProfileMusicBS.this.f83309k1;
                if (c7871g3 != null) {
                    str2 = c7871g3.m40458a();
                }
                profileMusicBS.m87783Eh(str, str2);
            }
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: d */
        public void mo87828d() {
            String str;
            if (ProfileMusicBS.this.f83303e1 != null) {
                C24902e c24902e = ProfileMusicBS.this.f83303e1;
                String str2 = null;
                if (c24902e != null) {
                    str = c24902e.m129496l();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C0815e1.m2075D().m2100V(new C23648e(13, "", 0, "social_music_profile_play_on_zingmp3", new String[0]), false);
                    ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
                    C24902e c24902e2 = profileMusicBS.f83303e1;
                    if (c24902e2 != null) {
                        str2 = c24902e2.m129496l();
                    }
                    profileMusicBS.m87811iM(str2);
                }
            }
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: e */
        public void mo87829e(int i11) {
            C32065p8.m154684c().m154700q(i11);
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: f */
        public void mo87830f() {
            C24903f c24903f;
            if (ProfileMusicBS.this.f83304f1 != null) {
                C32065p8 m154684c = C32065p8.m154684c();
                C24903f c24903f2 = ProfileMusicBS.this.f83304f1;
                if (c24903f2 != null) {
                    c24903f = c24903f2.m129500c();
                } else {
                    c24903f = null;
                }
                m154684c.m154695j(c24903f);
            }
        }

        @Override // com.zing.zalo.uicontrol.ProfileMusicPlayerView.InterfaceC16479a
        /* renamed from: g */
        public void mo87831g() {
            ProfileMusicBS profileMusicBS = ProfileMusicBS.this;
            profileMusicBS.m87813kM(profileMusicBS.f83306h1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Eh */
    public final void m87783Eh(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("action_type", str);
        intent.putExtra("action_data", str2);
        m87815mM(1303, intent);
    }

    /* renamed from: Zb */
    private final void m87802Zb(String str) {
        View view;
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            view = m92650VI.m92656bJ();
        } else {
            view = null;
        }
        if (view != null) {
            com.zing.zalo.zdesign.component.Snackbar m90669d = com.zing.zalo.zdesign.component.Snackbar.Companion.m90669d(view, str, 0);
            m90669d.m90645K(m90517gL() + AbstractC23136l9.m118742r(12.0f));
            m90669d.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public final void m87803aM(Exception exc) {
        this.f83302d1 = exc;
        C29748ca c29748ca = this.f83300b1;
        C29748ca c29748ca2 = null;
        if (c29748ca == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca = null;
        }
        TextView textView = (TextView) c29748ca.f137424q.getErrorView().findViewById(AbstractC6918a0.error_title);
        C29748ca c29748ca3 = this.f83300b1;
        if (c29748ca3 == null) {
            AbstractC19074t.m100223u("_binding");
        } else {
            c29748ca2 = c29748ca3;
        }
        RobotoButton robotoButton = (RobotoButton) c29748ca2.f137424q.getErrorView().findViewById(AbstractC6918a0.btn_refresh);
        Exception exc2 = this.f83302d1;
        if (((exc2 instanceof ExceptionMusicStreaming) || (exc2 instanceof ExceptionMusicLoadInfo)) && TextUtils.equals(this.f83305g1, CoreUtility.f89233i)) {
            if (textView != null) {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_no_longer_exist));
            }
            if (robotoButton != null) {
                robotoButton.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_select_song));
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_error_msg));
        }
        if (robotoButton != null) {
            robotoButton.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public final void m87804bM() {
        C29748ca c29748ca = this.f83300b1;
        C23528a c23528a = null;
        if (c29748ca == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca = null;
        }
        ProfileMusicPlayerView profileMusicPlayerView = c29748ca.f137425r;
        C24902e c24902e = this.f83303e1;
        C23528a c23528a2 = this.f83308j1;
        if (c23528a2 == null) {
            AbstractC19074t.m100223u("aQuery");
            c23528a2 = null;
        }
        profileMusicPlayerView.m87840c(c24902e, c23528a2);
        C29748ca c29748ca2 = this.f83300b1;
        if (c29748ca2 == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca2 = null;
        }
        ProfileMusicPlayerView profileMusicPlayerView2 = c29748ca2.f137425r;
        ContactProfile.C7871g c7871g = this.f83309k1;
        C23528a c23528a3 = this.f83308j1;
        if (c23528a3 == null) {
            AbstractC19074t.m100223u("aQuery");
        } else {
            c23528a = c23528a3;
        }
        profileMusicPlayerView2.m87842j(c7871g, c23528a);
    }

    /* renamed from: cM */
    private final void m87805cM() {
        try {
            if (!TextUtils.isEmpty(this.f83306h1)) {
                m87816nM(1);
                new C25453e(null, 1, null).m101508a(new C25453e.b(this.f83306h1, GlobalScope.f105887p, new C16475a()));
            } else {
                m87803aM(ExceptionFetchMusicUnknown.f46307p);
                m87816nM(2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: dM */
    private final void m87806dM() {
        C24902e c24902e;
        C24903f c24903f;
        this.f83308j1 = new C23528a(getContext());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("user_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f83305g1 = string;
            String string2 = m92642L3.getString("song_id", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f83306h1 = string2;
            this.f83307i1 = m92642L3.getBoolean("is_ready", false);
            ContactProfile.C7871g c7871g = null;
            C25454f.a aVar = (C25454f.a) new C25454f(null, 1, null).m101509a(this.f83306h1);
            if (aVar != null) {
                c24902e = aVar.m131848a();
            } else {
                c24902e = null;
            }
            this.f83303e1 = c24902e;
            if (aVar != null) {
                c24903f = aVar.m131849b();
            } else {
                c24903f = null;
            }
            this.f83304f1 = c24903f;
            String string3 = m92642L3.getString("footer_info", "");
            if (!TextUtils.isEmpty(string3)) {
                c7871g = new ContactProfile.C7871g(new JSONObject(string3));
            }
            this.f83309k1 = c7871g;
            this.f83310l1 = m92642L3.getBoolean("is_show_snack_bar", false);
            String string4 = m92642L3.getString("snack_bar_msg", "");
            AbstractC19074t.m100207e(string4, "getString(...)");
            this.f83311m1 = string4;
        }
    }

    /* renamed from: eM */
    private final void m87807eM() {
        m90532yL(true);
        m90525tL(true);
        m90533zL(this.f83301c1);
        C29748ca c29748ca = this.f83300b1;
        C29748ca c29748ca2 = null;
        if (c29748ca == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca = null;
        }
        if (c29748ca.f137424q.getErrorView() != null) {
            C29748ca c29748ca3 = this.f83300b1;
            if (c29748ca3 == null) {
                AbstractC19074t.m100223u("_binding");
                c29748ca3 = null;
            }
            View findViewById = c29748ca3.f137424q.getErrorView().findViewById(AbstractC6918a0.btn_close);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProfileMusicBS.m87808fM(ProfileMusicBS.this, view);
                    }
                });
            }
            C29748ca c29748ca4 = this.f83300b1;
            if (c29748ca4 == null) {
                AbstractC19074t.m100223u("_binding");
                c29748ca4 = null;
            }
            c29748ca4.f137424q.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.uicontrol.g0
                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    ProfileMusicBS.m87809gM(ProfileMusicBS.this);
                }
            });
        }
        C29748ca c29748ca5 = this.f83300b1;
        if (c29748ca5 == null) {
            AbstractC19074t.m100223u("_binding");
        } else {
            c29748ca2 = c29748ca5;
        }
        c29748ca2.f137425r.setListener(this.f83313o1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public static final void m87808fM(ProfileMusicBS profileMusicBS, View view) {
        AbstractC19074t.m100208f(profileMusicBS, "this$0");
        AbstractC23647d.m123897g("800403");
        profileMusicBS.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static final void m87809gM(ProfileMusicBS profileMusicBS) {
        AbstractC19074t.m100208f(profileMusicBS, "this$0");
        Exception exc = profileMusicBS.f83302d1;
        if (((exc instanceof ExceptionMusicStreaming) || (exc instanceof ExceptionMusicLoadInfo)) && TextUtils.equals(profileMusicBS.f83305g1, CoreUtility.f89233i)) {
            profileMusicBS.m87810hM(profileMusicBS.f83306h1);
        } else {
            AbstractC23647d.m123897g("800407");
            profileMusicBS.m87805cM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public final void m87810hM(String str) {
        if (C23055e5.m118272g(false)) {
            Intent intent = new Intent();
            intent.putExtra("song_id", str);
            m87815mM(1302, intent);
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_network_try_again);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            m87817oM(m118743r0, C27280g.m139660c(context, AbstractC2810d.zds_ic_wifi_off_solid_24, AbstractC2807a.snackbar_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public final void m87811iM(String str) {
        if (C23055e5.m118272g(false)) {
            Intent intent = new Intent();
            intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
            m87815mM(1304, intent);
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_network_try_again);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            m87817oM(m118743r0, C27280g.m139660c(context, AbstractC2810d.zds_ic_wifi_off_solid_24, AbstractC2807a.snackbar_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public final void m87812jM(String str, String str2) {
        if (C23055e5.m118272g(false)) {
            Intent intent = new Intent();
            intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
            intent.putExtra("song_id", str2);
            m87815mM(1305, intent);
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_network_try_again);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        m87817oM(m118743r0, C27280g.m139660c(context, AbstractC2810d.zds_ic_wifi_off_solid_24, AbstractC2807a.snackbar_icon));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public final void m87813kM(String str) {
        if (C23055e5.m118272g(false)) {
            Intent intent = new Intent();
            intent.putExtra("song_id", str);
            m87815mM(1301, intent);
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_network_try_again);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            m87817oM(m118743r0, C27280g.m139660c(context, AbstractC2810d.zds_ic_wifi_off_solid_24, AbstractC2807a.snackbar_icon));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0014, B:8:0x0020, B:11:0x002f, B:13:0x0033, B:18:0x0046, B:20:0x005c, B:24:0x0066), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0014, B:8:0x0020, B:11:0x002f, B:13:0x0033, B:18:0x0046, B:20:0x005c, B:24:0x0066), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: lM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m87814lM() {
        boolean z11;
        String m129503f;
        C24903f c24903f;
        try {
            if (!C32065p8.m154684c().m154691f() && !C32065p8.m154684c().m154692g()) {
                C24903f m154689d = C32065p8.m154684c().m154689d();
                boolean z12 = true;
                if (m154689d != null && !TextUtils.isEmpty(m154689d.m129503f())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C24903f c24903f2 = this.f83304f1;
                if (c24903f2 != null) {
                    AbstractC19074t.m100205c(c24903f2);
                    if (!TextUtils.isEmpty(c24903f2.m129503f())) {
                        if (z11 && z12) {
                            AbstractC19074t.m100205c(m154689d);
                            m129503f = m154689d.m129503f();
                            c24903f = this.f83304f1;
                            AbstractC19074t.m100205c(c24903f);
                            if (TextUtils.equals(m129503f, c24903f.m129503f())) {
                                C32065p8.m154684c().m154694i();
                                return;
                            }
                        }
                        if (!z12) {
                            C32065p8 m154684c = C32065p8.m154684c();
                            C24903f c24903f3 = this.f83304f1;
                            AbstractC19074t.m100205c(c24903f3);
                            m154684c.m154697l(c24903f3.m129500c(), 0, false);
                            return;
                        }
                        return;
                    }
                }
                z12 = false;
                if (z11) {
                    AbstractC19074t.m100205c(m154689d);
                    m129503f = m154689d.m129503f();
                    c24903f = this.f83304f1;
                    AbstractC19074t.m100205c(c24903f);
                    if (TextUtils.equals(m129503f, c24903f.m129503f())) {
                    }
                }
                if (!z12) {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: mM */
    private final void m87815mM(int i11, Intent intent) {
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(i11, intent);
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public final void m87816nM(int i11) {
        C29748ca c29748ca = null;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        C29748ca c29748ca2 = this.f83300b1;
                        if (c29748ca2 == null) {
                            AbstractC19074t.m100223u("_binding");
                            c29748ca2 = null;
                        }
                        c29748ca2.f137425r.setVisibility(8);
                        C29748ca c29748ca3 = this.f83300b1;
                        if (c29748ca3 == null) {
                            AbstractC19074t.m100223u("_binding");
                        } else {
                            c29748ca = c29748ca3;
                        }
                        c29748ca.f137424q.setVisibility(8);
                        return;
                    }
                    C29748ca c29748ca4 = this.f83300b1;
                    if (c29748ca4 == null) {
                        AbstractC19074t.m100223u("_binding");
                        c29748ca4 = null;
                    }
                    c29748ca4.f137425r.setVisibility(8);
                    C29748ca c29748ca5 = this.f83300b1;
                    if (c29748ca5 == null) {
                        AbstractC19074t.m100223u("_binding");
                        c29748ca5 = null;
                    }
                    c29748ca5.f137424q.setState(MultiStateView.EnumC15914e.ERROR);
                    C29748ca c29748ca6 = this.f83300b1;
                    if (c29748ca6 == null) {
                        AbstractC19074t.m100223u("_binding");
                    } else {
                        c29748ca = c29748ca6;
                    }
                    c29748ca.f137424q.setVisibility(0);
                    return;
                }
                C29748ca c29748ca7 = this.f83300b1;
                if (c29748ca7 == null) {
                    AbstractC19074t.m100223u("_binding");
                    c29748ca7 = null;
                }
                c29748ca7.f137425r.setVisibility(8);
                C29748ca c29748ca8 = this.f83300b1;
                if (c29748ca8 == null) {
                    AbstractC19074t.m100223u("_binding");
                    c29748ca8 = null;
                }
                c29748ca8.f137424q.setState(MultiStateView.EnumC15914e.LOADING);
                C29748ca c29748ca9 = this.f83300b1;
                if (c29748ca9 == null) {
                    AbstractC19074t.m100223u("_binding");
                } else {
                    c29748ca = c29748ca9;
                }
                c29748ca.f137424q.setVisibility(0);
                return;
            }
            C29748ca c29748ca10 = this.f83300b1;
            if (c29748ca10 == null) {
                AbstractC19074t.m100223u("_binding");
                c29748ca10 = null;
            }
            c29748ca10.f137425r.setVisibility(0);
            C29748ca c29748ca11 = this.f83300b1;
            if (c29748ca11 == null) {
                AbstractC19074t.m100223u("_binding");
                c29748ca11 = null;
            }
            c29748ca11.f137424q.setState(MultiStateView.EnumC15914e.CONTENT);
            C29748ca c29748ca12 = this.f83300b1;
            if (c29748ca12 == null) {
                AbstractC19074t.m100223u("_binding");
            } else {
                c29748ca = c29748ca12;
            }
            c29748ca.f137424q.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oM */
    private final void m87817oM(String str, Drawable drawable) {
        InterfaceC27218a interfaceC27218a;
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            interfaceC27218a = m92650VI.m92676n2();
        } else {
            interfaceC27218a = null;
        }
        C23283z7.m120379l(interfaceC27218a, str, drawable, Integer.valueOf(m90517gL() + AbstractC23136l9.m118742r(12.0f)));
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29748ca c29748ca = this.f83300b1;
        if (c29748ca == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca = null;
        }
        FrameLayout root = c29748ca.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        C23744a.Companion.m124119a().m124117e(this, AbstractC26080o.a.f124275b);
        super.mo37712VJ();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    public void close() {
        AbstractC23647d.m123897g("800403");
        super.close();
    }

    @Override // w20.InterfaceC28702e
    /* renamed from: iH */
    public boolean mo67148iH() {
        return false;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29748ca m147814c = C29748ca.m147814c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147814c, "inflate(...)");
        this.f83300b1 = m147814c;
        m87807eM();
        m87806dM();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: nL */
    public void mo66255nL() {
        super.mo66255nL();
        if (this.f83310l1 && !TextUtils.isEmpty(this.f83311m1)) {
            m87802Zb(this.f83311m1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.Companion.m124119a().m124115b(this, AbstractC26080o.a.f124275b);
        C29748ca c29748ca = this.f83300b1;
        if (c29748ca == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca = null;
        }
        c29748ca.f137425r.m87843k();
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 5000) {
            try {
                this.f83312n1.sendEmptyMessage(1);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C29748ca c29748ca = this.f83300b1;
        if (c29748ca == null) {
            AbstractC19074t.m100223u("_binding");
            c29748ca = null;
        }
        c29748ca.f137425r.setMine(TextUtils.equals(this.f83305g1, CoreUtility.f89233i));
        if (this.f83303e1 != null && this.f83307i1) {
            m87814lM();
            m87804bM();
            m87816nM(0);
        } else {
            m87803aM(ExceptionFetchMusicUnknown.f46307p);
            m87816nM(2);
        }
    }
}
