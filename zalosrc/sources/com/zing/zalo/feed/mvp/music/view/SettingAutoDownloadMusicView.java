package com.zing.zalo.feed.mvp.music.view;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.view.SettingAutoDownloadMusicView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p456qp.C25466r;
import p509sp.C26354c;
import p649xl.C29857ib;

/* loaded from: classes4.dex */
public final class SettingAutoDownloadMusicView extends SlidableZaloView implements View.OnClickListener {

    /* renamed from: P0 */
    private C29857ib f46382P0;

    /* renamed from: com.zing.zalo.feed.mvp.music.view.SettingAutoDownloadMusicView$a */
    /* loaded from: classes4.dex */
    public static final class C8614a implements C25466r.a {

        /* renamed from: b */
        final /* synthetic */ int f46384b;

        C8614a(int i11) {
            this.f46384b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m45838d(SettingAutoDownloadMusicView settingAutoDownloadMusicView, int i11) {
            AbstractC19074t.m100208f(settingAutoDownloadMusicView, "this$0");
            settingAutoDownloadMusicView.m45836jM(i11);
        }

        @Override // p456qp.C25466r.a
        /* renamed from: a */
        public void mo45839a(int i11) {
            Handler handler = ((CommonZaloview) SettingAutoDownloadMusicView.this).f72827B0;
            final SettingAutoDownloadMusicView settingAutoDownloadMusicView = SettingAutoDownloadMusicView.this;
            final int i12 = this.f46384b;
            handler.post(new Runnable() { // from class: tp.k
                @Override // java.lang.Runnable
                public final void run() {
                    SettingAutoDownloadMusicView.C8614a.m45838d(SettingAutoDownloadMusicView.this, i12);
                }
            });
            SettingAutoDownloadMusicView.this.mo49315c4();
        }

        @Override // p456qp.C25466r.a
        /* renamed from: c */
        public void mo45840c(Exception exc) {
            AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            if (exc instanceof ExceptionNoNetwork) {
                SettingAutoDownloadMusicView.this.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
            } else {
                String message = exc.getMessage();
                if (message != null) {
                    SettingAutoDownloadMusicView settingAutoDownloadMusicView = SettingAutoDownloadMusicView.this;
                    if (message.length() > 0) {
                        settingAutoDownloadMusicView.mo78936E(message);
                    }
                }
            }
            SettingAutoDownloadMusicView.this.mo49315c4();
        }
    }

    /* renamed from: iM */
    private final void m45834iM(int i11) {
        mo46829Y();
        C25466r c25466r = new C25466r();
        C8614a c8614a = new C8614a(i11);
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        c25466r.m101508a(new C25466r.b(i11, c8614a, AbstractC1803x.m9388a(m92657cJ)));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        C29857ib m148083c = C29857ib.m148083c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148083c, "inflate(...)");
        this.f46382P0 = m148083c;
        m45835hM();
        C29857ib c29857ib = this.f46382P0;
        if (c29857ib == null) {
            AbstractC19074t.m100223u("binding");
            c29857ib = null;
        }
        LinearLayout root = c29857ib.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingAutoDownloadMusicView";
    }

    /* renamed from: hM */
    public final void m45835hM() {
        try {
            C29857ib c29857ib = this.f46382P0;
            C29857ib c29857ib2 = null;
            if (c29857ib == null) {
                AbstractC19074t.m100223u("binding");
                c29857ib = null;
            }
            c29857ib.f138185u.setOnClickListener(this);
            C29857ib c29857ib3 = this.f46382P0;
            if (c29857ib3 == null) {
                AbstractC19074t.m100223u("binding");
                c29857ib3 = null;
            }
            c29857ib3.f138186v.setOnClickListener(this);
            C29857ib c29857ib4 = this.f46382P0;
            if (c29857ib4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29857ib2 = c29857ib4;
            }
            c29857ib2.f138184t.setOnClickListener(this);
            m45836jM(C26354c.f125196a.m135672c());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    public final void m45836jM(int i11) {
        C29857ib c29857ib = null;
        try {
            if (i11 != 0) {
                if (i11 != 2) {
                    C29857ib c29857ib2 = this.f46382P0;
                    if (c29857ib2 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29857ib2 = null;
                    }
                    c29857ib2.f138182r.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                    C29857ib c29857ib3 = this.f46382P0;
                    if (c29857ib3 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29857ib3 = null;
                    }
                    c29857ib3.f138181q.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                    C29857ib c29857ib4 = this.f46382P0;
                    if (c29857ib4 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29857ib = c29857ib4;
                    }
                    c29857ib.f138183s.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                    return;
                }
                C29857ib c29857ib5 = this.f46382P0;
                if (c29857ib5 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29857ib5 = null;
                }
                c29857ib5.f138182r.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                C29857ib c29857ib6 = this.f46382P0;
                if (c29857ib6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29857ib6 = null;
                }
                c29857ib6.f138181q.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                C29857ib c29857ib7 = this.f46382P0;
                if (c29857ib7 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29857ib = c29857ib7;
                }
                c29857ib.f138183s.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                return;
            }
            C29857ib c29857ib8 = this.f46382P0;
            if (c29857ib8 == null) {
                AbstractC19074t.m100223u("binding");
                c29857ib8 = null;
            }
            c29857ib8.f138182r.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
            C29857ib c29857ib9 = this.f46382P0;
            if (c29857ib9 == null) {
                AbstractC19074t.m100223u("binding");
                c29857ib9 = null;
            }
            c29857ib9.f138181q.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
            C29857ib c29857ib10 = this.f46382P0;
            if (c29857ib10 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29857ib = c29857ib10;
            }
            c29857ib.f138183s.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer valueOf;
        if (view != null) {
            try {
                valueOf = Integer.valueOf(view.getId());
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            valueOf = null;
        }
        int i11 = AbstractC6918a0.ll_enable_auto_download;
        if (valueOf != null && valueOf.intValue() == i11) {
            m45834iM(1);
            return;
        }
        int i12 = AbstractC6918a0.ll_enable_auto_download_with_wifi;
        if (valueOf != null && valueOf.intValue() == i12) {
            m45834iM(2);
            return;
        }
        int i13 = AbstractC6918a0.ll_disable_auto_download;
        if (valueOf != null && valueOf.intValue() == i13) {
            m45834iM(0);
        }
    }
}
