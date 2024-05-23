package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p426pp.C24902e;
import p716zh.C32065p8;
import s00.AbstractC26080o;

/* loaded from: classes4.dex */
public class ProfileMusicView extends RelativeLayout implements View.OnClickListener, C23744a.c {

    /* renamed from: p */
    public final Animation f45094p;

    /* renamed from: q */
    private ExpandableProfileMusicView f45095q;

    /* renamed from: r */
    private ExpandableProfileMusicEmptyView f45096r;

    /* renamed from: s */
    private View f45097s;

    /* renamed from: t */
    private RobotoTextView f45098t;

    /* renamed from: u */
    private View f45099u;

    /* renamed from: v */
    C23528a f45100v;

    /* renamed from: w */
    InterfaceC8217b f45101w;

    /* renamed from: x */
    Handler f45102x;

    /* renamed from: y */
    private int f45103y;

    /* renamed from: z */
    private int f45104z;

    /* renamed from: com.zing.zalo.feed.components.ProfileMusicView$a */
    /* loaded from: classes4.dex */
    class HandlerC8216a extends Handler {
        HandlerC8216a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else if (ProfileMusicView.this.f45095q != null) {
                    ProfileMusicView.this.f45095q.m43628n();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.ProfileMusicView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8217b {
        /* renamed from: a */
        void mo44480a(int i11);

        /* renamed from: b */
        void mo44481b();

        /* renamed from: c */
        void mo44482c();
    }

    public ProfileMusicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45102x = new HandlerC8216a(Looper.getMainLooper());
        this.f45103y = 0;
        this.f45104z = -1;
        this.f45100v = new C23528a(context);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_in_short);
        this.f45094p = loadAnimation;
        loadAnimation.setDuration(300L);
        m44478d(context);
    }

    /* renamed from: b */
    private String m44476b(int i11) {
        if (i11 == 600) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error);
        }
        if (i11 == 700) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_no_longer_exist);
        }
        if (i11 == 800) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_error_msg);
    }

    /* renamed from: c */
    public static int m44477c(Exception exc) {
        if (!(exc instanceof ExceptionMusicStreaming) && !(exc instanceof ExceptionMusicLoadInfo)) {
            if (exc instanceof ExceptionMusicLocationNotSupported) {
                return IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
            }
            return ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        }
        return IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
    }

    /* renamed from: d */
    private void m44478d(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(AbstractC7409c0.profile_music_view, this);
            this.f45095q = (ExpandableProfileMusicView) findViewById(AbstractC6918a0.expandable_profile_music_view);
            this.f45096r = (ExpandableProfileMusicEmptyView) findViewById(AbstractC6918a0.expandable_profile_music_empty_view);
            this.f45097s = findViewById(AbstractC6918a0.profile_music_error_view);
            this.f45098t = (RobotoTextView) findViewById(AbstractC6918a0.tv_profile_music_error);
            this.f45099u = findViewById(AbstractC6918a0.fake_touch_view);
            AbstractC23136l9.m118729m1(this.f45097s, AbstractC23136l9.m118742r(3.0f));
            this.f45095q.setOnClickListener(this);
            this.f45096r.setOnClickListener(this);
            this.f45097s.setOnClickListener(this);
            this.f45099u.setOnClickListener(this);
            this.f45098t.setShadowLayer(AbstractC23136l9.m118742r(2.0f), 0.0f, AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118641B(context, AbstractC16801x.profile_music_sticky_text_shadow));
            m44479e(0, null, false);
        }
    }

    /* renamed from: e */
    public void m44479e(int i11, Object obj, boolean z11) {
        try {
            this.f45095q.setVisibility(8);
            this.f45096r.setVisibility(8);
            this.f45097s.setVisibility(8);
            this.f45103y = i11;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        this.f45098t.setText(m44476b(this.f45104z));
                        this.f45097s.setVisibility(0);
                    }
                } else {
                    this.f45096r.m43624k((ContactProfile.C7870f) obj, this.f45100v);
                    this.f45096r.setVisibility(0);
                    if (z11) {
                        this.f45096r.m43619c(false);
                    } else {
                        this.f45096r.m43618b(false);
                    }
                }
            } else {
                this.f45095q.m43627k((C24902e) obj, this.f45100v);
                this.f45095q.setVisibility(0);
                if (z11) {
                    this.f45095q.m43619c(false);
                } else {
                    this.f45095q.m43618b(false);
                }
            }
            startAnimation(this.f45094p);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C23744a.m124114c().m124115b(this, AbstractC26080o.a.f124275b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC8217b interfaceC8217b;
        try {
            int id2 = view.getId();
            String str = "800302";
            String str2 = "800303";
            if (id2 == AbstractC6918a0.expandable_profile_music_view) {
                InterfaceC8217b interfaceC8217b2 = this.f45101w;
                if (interfaceC8217b2 != null) {
                    interfaceC8217b2.mo44481b();
                    if (this.f45095q != null) {
                        if (C32065p8.m154684c().m154691f()) {
                            if (this.f45095q.m43620d()) {
                                str2 = "800301";
                            }
                            AbstractC23647d.m123897g(str2);
                        } else {
                            if (this.f45095q.m43620d()) {
                                str = "800300";
                            }
                            AbstractC23647d.m123897g(str);
                        }
                    }
                }
            } else if (id2 == AbstractC6918a0.profile_music_error_view) {
                InterfaceC8217b interfaceC8217b3 = this.f45101w;
                if (interfaceC8217b3 != null) {
                    interfaceC8217b3.mo44480a(this.f45104z);
                    AbstractC23647d.m123897g("800102");
                }
            } else {
                String str3 = "800101";
                if (id2 == AbstractC6918a0.expandable_profile_music_empty_view) {
                    InterfaceC8217b interfaceC8217b4 = this.f45101w;
                    if (interfaceC8217b4 != null) {
                        interfaceC8217b4.mo44482c();
                        ExpandableProfileMusicEmptyView expandableProfileMusicEmptyView = this.f45096r;
                        if (expandableProfileMusicEmptyView != null) {
                            if (expandableProfileMusicEmptyView.m43620d()) {
                                str3 = "800100";
                            }
                            AbstractC23647d.m123897g(str3);
                        }
                    }
                } else if (id2 == AbstractC6918a0.fake_touch_view && (interfaceC8217b = this.f45101w) != null) {
                    int i11 = this.f45103y;
                    if (i11 == 1) {
                        interfaceC8217b.mo44481b();
                        if (this.f45095q != null) {
                            if (C32065p8.m154684c().m154691f()) {
                                if (this.f45095q.m43620d()) {
                                    str2 = "800301";
                                }
                                AbstractC23647d.m123897g(str2);
                            } else {
                                if (this.f45095q.m43620d()) {
                                    str = "800300";
                                }
                                AbstractC23647d.m123897g(str);
                            }
                        }
                    } else if (i11 == 2) {
                        interfaceC8217b.mo44482c();
                        ExpandableProfileMusicEmptyView expandableProfileMusicEmptyView2 = this.f45096r;
                        if (expandableProfileMusicEmptyView2 != null) {
                            if (expandableProfileMusicEmptyView2.m43620d()) {
                                str3 = "800100";
                            }
                            AbstractC23647d.m123897g(str3);
                        }
                    } else if (i11 == 3) {
                        interfaceC8217b.mo44480a(this.f45104z);
                        AbstractC23647d.m123897g("800102");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C23744a.m124114c().m124117e(this, AbstractC26080o.a.f124275b);
        super.onDetachedFromWindow();
    }

    public void setCallback(InterfaceC8217b interfaceC8217b) {
        this.f45101w = interfaceC8217b;
    }

    public void setErrorCode(int i11) {
        this.f45104z = i11;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 5000) {
            this.f45102x.sendEmptyMessage(1);
        }
    }
}
