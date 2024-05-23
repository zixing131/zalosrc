package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.imageview.CircleImageView;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23278z2;
import p173fz.C19172a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p426pp.C24902e;
import p426pp.C24903f;
import p649xl.C29766da;
import p716zh.C32065p8;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ProfileMusicPlayerView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: p */
    private C29766da f83317p;

    /* renamed from: q */
    private boolean f83318q;

    /* renamed from: r */
    private C24902e f83319r;

    /* renamed from: s */
    private InterfaceC16479a f83320s;

    /* renamed from: t */
    private boolean f83321t;

    /* renamed from: u */
    private int f83322u;

    /* renamed from: com.zing.zalo.uicontrol.ProfileMusicPlayerView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16479a {
        /* renamed from: a */
        void mo87825a();

        /* renamed from: b */
        void mo87826b();

        /* renamed from: c */
        void mo87827c();

        /* renamed from: d */
        void mo87828d();

        /* renamed from: e */
        void mo87829e(int i11);

        /* renamed from: f */
        void mo87830f();

        /* renamed from: g */
        void mo87831g();
    }

    public ProfileMusicPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C29766da m147859b = C29766da.m147859b(LayoutInflater.from(getContext()), this);
        AbstractC19074t.m100207e(m147859b, "inflate(...)");
        this.f83317p = m147859b;
        this.f83322u = C19172a.m100600k("features@profile_music@enable_share_music_as_a_post", 1);
        this.f83317p.f137540J.setListener(new C16606j0(this));
        m87839l();
        m87836f();
        m87835e();
    }

    /* renamed from: d */
    private final void m87834d() {
        AbstractC23136l9.m118729m1(this.f83317p.f137554x, AbstractC23136l9.m118742r(8.0f));
        CircleImageView circleImageView = this.f83317p.f137549s;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        circleImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_delete_solid_24, AbstractC2807a.icon_tertiary));
        ImageView imageView = this.f83317p.f137531A;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        imageView.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_list_song_solid_24, AbstractC2807a.icon_tertiary));
        ImageView imageView2 = this.f83317p.f137532B;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        imageView2.setImageDrawable(C27280g.m139660c(context3, AbstractC2810d.zds_ic_post_solid_24, AbstractC2807a.icon_tertiary));
        RecyclingImageView recyclingImageView = this.f83317p.f137556z;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        recyclingImageView.setImageDrawable(C27280g.m139660c(context4, AbstractC2810d.zds_ic_user_profile_music_solid_24, AbstractC2807a.icon_tertiary));
    }

    /* renamed from: e */
    private final void m87835e() {
        this.f83317p.f137549s.setOnClickListener(this);
        this.f83317p.f137533C.setOnClickListener(this);
        this.f83317p.f137550t.setOnClickListener(this);
        this.f83317p.f137548r.setOnClickListener(this);
        this.f83317p.f137547q.setOnClickListener(this);
        this.f83317p.f137551u.setOnClickListener(this);
    }

    /* renamed from: f */
    private final void m87836f() {
        m87834d();
        if (this.f83322u != 1) {
            m87837g();
        }
    }

    /* renamed from: g */
    private final void m87837g() {
        this.f83317p.f137548r.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 2.0f;
        layoutParams.gravity = 1;
        this.f83317p.f137550t.setOrientation(0);
        this.f83317p.f137550t.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f83317p.f137531A.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f));
        this.f83317p.f137531A.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f83317p.f137543M.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.gravity = 16;
        layoutParams5.setMargins(0, 0, AbstractC23136l9.m118742r(8.0f), 0);
        this.f83317p.f137543M.setLayoutParams(layoutParams5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final boolean m87838h() {
        String str;
        C24903f m154689d = C32065p8.m154684c().m154689d();
        C24902e c24902e = this.f83319r;
        if (c24902e != null && m154689d != null) {
            if (c24902e != null) {
                str = c24902e.m129490f();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, m154689d.m129502e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private final void m87839l() {
        int i11 = this.f83322u;
        if (i11 == 0 || i11 == 1) {
            return;
        }
        this.f83322u = 1;
    }

    /* renamed from: c */
    public final void m87840c(C24902e c24902e, C23528a c23528a) {
        if (c24902e != null) {
            this.f83319r = c24902e;
            if (!TextUtils.isEmpty(c24902e.m129487c())) {
                this.f83317p.f137544N.setText(c24902e.m129487c());
            }
            if (!TextUtils.isEmpty(c24902e.m129492h())) {
                this.f83317p.f137545O.setText(c24902e.m129492h());
            }
            if (!TextUtils.isEmpty(c24902e.m129494j()) && c23528a != null) {
                RecyclingImageView recyclingImageView = this.f83317p.f137554x;
                recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.bg_feed));
                ((C23528a) c23528a.m123612r(this.f83317p.f137554x)).m123618x(c24902e.m129494j(), C23278z2.m120123e0());
            }
        }
        if (!this.f83321t) {
            this.f83317p.f137549s.setVisibility(8);
        } else {
            this.f83317p.f137549s.setVisibility(0);
        }
        m87843k();
    }

    public final InterfaceC16479a getListener() {
        return this.f83320s;
    }

    public final C24902e getSongContent() {
        return this.f83319r;
    }

    /* renamed from: i */
    public final boolean m87841i() {
        return this.f83318q;
    }

    /* renamed from: j */
    public final void m87842j(ContactProfile.C7871g c7871g, C23528a c23528a) {
        C23528a c23528a2;
        if (!this.f83321t) {
            this.f83317p.f137553w.setVisibility(0);
            this.f83317p.f137536F.setVisibility(8);
            if (c7871g != null && c7871g.m40463f()) {
                if (!TextUtils.isEmpty(c7871g.m40462e())) {
                    RecyclingImageView recyclingImageView = this.f83317p.f137556z;
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.bg_feed));
                    if (c23528a != null && (c23528a2 = (C23528a) c23528a.m123612r(this.f83317p.f137556z)) != null) {
                    }
                    this.f83317p.f137556z.setColorFilter(Color.parseColor("#909498"));
                }
                this.f83317p.f137542L.setText(c7871g.m40461d());
                this.f83317p.f137547q.setText(c7871g.m40460c());
                return;
            }
            RecyclingImageView recyclingImageView2 = this.f83317p.f137556z;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            recyclingImageView2.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_add_melody_solid_24, AbstractC2807a.icon_on_disabled_color));
            this.f83317p.f137542L.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_apply_music_for_you));
            this.f83317p.f137547q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_select_song_in_bts));
            return;
        }
        this.f83317p.f137553w.setVisibility(8);
        this.f83317p.f137536F.setVisibility(0);
    }

    /* renamed from: k */
    public final void m87843k() {
        try {
            if (m87838h()) {
                C24903f m154689d = C32065p8.m154684c().m154689d();
                AbstractC19074t.m100207e(m154689d, "getPlayingSong(...)");
                if (C32065p8.m154684c().m154691f()) {
                    this.f83317p.f137535E.setImageResource(AbstractC16803z.ic_btn_profile_music_pause);
                    this.f83317p.f137535E.setVisibility(0);
                    this.f83317p.f137534D.setVisibility(8);
                } else if (C32065p8.m154684c().m154692g()) {
                    this.f83317p.f137535E.setImageResource(AbstractC16803z.ic_btn_profile_music_play);
                    this.f83317p.f137535E.setVisibility(8);
                    this.f83317p.f137534D.setVisibility(0);
                } else {
                    this.f83317p.f137535E.setImageResource(AbstractC16803z.ic_btn_profile_music_play);
                    this.f83317p.f137535E.setVisibility(0);
                    this.f83317p.f137534D.setVisibility(8);
                }
                if (!this.f83318q) {
                    this.f83317p.f137540J.setSliderValue(C32065p8.m154684c().m154690e() / 100.0f);
                }
                if (!this.f83318q) {
                    String m119200J0 = AbstractC23160o0.m119200J0(C32065p8.m154684c().m154688b());
                    AbstractC19074t.m100207e(m119200J0, "getTimeMinutesSeconds(...)");
                    String m119200J02 = AbstractC23160o0.m119200J0(m154689d.m129501d());
                    AbstractC19074t.m100207e(m119200J02, "getTimeMinutesSeconds(...)");
                    if (TextUtils.isEmpty(m119200J0)) {
                        m119200J0 = "00:00";
                    }
                    if (TextUtils.isEmpty(m119200J02)) {
                        m119200J02 = "--:--";
                    }
                    this.f83317p.f137540J.m91246m(ZdsSlider.EnumC17049e.TEXT, m119200J0);
                    this.f83317p.f137540J.m91247n(ZdsSlider.EnumC17051g.TEXT, m119200J02);
                    return;
                }
                this.f83317p.f137535E.setImageResource(AbstractC16803z.ic_btn_profile_music_play);
                this.f83317p.f137535E.setVisibility(0);
                this.f83317p.f137534D.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        InterfaceC16479a interfaceC16479a;
        String str;
        if (this.f83320s == null) {
            return;
        }
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.music_player_button_container;
        if (num != null && num.intValue() == i11) {
            if (C32065p8.m154684c().m154691f()) {
                str = "800401";
            } else {
                str = "800400";
            }
            AbstractC23647d.m123897g(str);
            InterfaceC16479a interfaceC16479a2 = this.f83320s;
            if (interfaceC16479a2 != null) {
                interfaceC16479a2.mo87830f();
                return;
            }
            return;
        }
        int i12 = AbstractC6918a0.btn_select_song;
        if (num != null && num.intValue() == i12) {
            AbstractC23647d.m123897g("800405");
            InterfaceC16479a interfaceC16479a3 = this.f83320s;
            if (interfaceC16479a3 != null) {
                interfaceC16479a3.mo87825a();
                return;
            }
            return;
        }
        int i13 = AbstractC6918a0.btn_remove_song;
        if (num != null && num.intValue() == i13) {
            AbstractC23647d.m123897g("800404");
            InterfaceC16479a interfaceC16479a4 = this.f83320s;
            if (interfaceC16479a4 != null) {
                interfaceC16479a4.mo87831g();
                return;
            }
            return;
        }
        int i14 = AbstractC6918a0.btn_footer_action;
        if (num != null && num.intValue() == i14) {
            AbstractC23647d.m123897g("800406");
            InterfaceC16479a interfaceC16479a5 = this.f83320s;
            if (interfaceC16479a5 != null) {
                interfaceC16479a5.mo87827c();
                return;
            }
            return;
        }
        int i15 = AbstractC6918a0.btn_zing_mp3;
        if (num != null && num.intValue() == i15) {
            InterfaceC16479a interfaceC16479a6 = this.f83320s;
            if (interfaceC16479a6 != null) {
                interfaceC16479a6.mo87828d();
                return;
            }
            return;
        }
        int i16 = AbstractC6918a0.btn_post_on_timeline;
        if (num != null && num.intValue() == i16 && (interfaceC16479a = this.f83320s) != null) {
            interfaceC16479a.mo87826b();
        }
    }

    public final void setListener(InterfaceC16479a interfaceC16479a) {
        this.f83320s = interfaceC16479a;
    }

    public final void setLockTouch(boolean z11) {
        this.f83318q = z11;
    }

    public final void setMine(boolean z11) {
        this.f83321t = z11;
    }

    public final void setSongContent(C24902e c24902e) {
        this.f83319r = c24902e;
    }
}
