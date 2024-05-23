package com.zing.zalo.p077ui.floatingmp3;

import ac.C0732w;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bp0.AbstractC3096i0;
import com.zing.mp3.sdk.view.widgets.SongBtsView;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import me0.C23212s8;
import p156fb.InterfaceC18864j;
import p204hb.C19956a;
import p235ib.C20496k;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23994e;
import p379o3.C23995f;
import p681yh.EnumC30982b;

/* loaded from: classes5.dex */
public final class Mp3SongBottomSheet extends BottomSheet implements C23744a.c {

    /* renamed from: b1 */
    private SongBtsView f61938b1;

    /* renamed from: c1 */
    private String f61939c1;

    /* renamed from: d1 */
    private ImageView f61940d1;

    /* renamed from: com.zing.zalo.ui.floatingmp3.Mp3SongBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11889a extends C23994e {

        /* renamed from: w0 */
        final /* synthetic */ String f61942w0;

        /* renamed from: x0 */
        final /* synthetic */ ImageView f61943x0;

        C11889a(String str, ImageView imageView) {
            this.f61942w0 = str;
            this.f61943x0 = imageView;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, Bitmap bitmap, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c23995f, "status");
            Mp3SongBottomSheet.this.f61939c1 = this.f61942w0;
            Mp3SongBottomSheet.this.f61940d1 = this.f61943x0;
            if (c23995f.m125657h() == 200) {
                if (bitmap == null) {
                    return;
                }
                this.f61943x0.setImageBitmap(bitmap);
                return;
            }
            this.f61943x0.setImageBitmap(null);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.Mp3SongBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11890b implements InterfaceC18864j {
        C11890b() {
        }

        @Override // p156fb.InterfaceC18855a
        /* renamed from: b */
        public void mo66029b(ImageView imageView, String str) {
            AbstractC19074t.m100208f(imageView, "iv");
            AbstractC19074t.m100208f(str, "thumb");
            Mp3SongBottomSheet.this.m66046NL(imageView, str);
        }

        @Override // p156fb.InterfaceC18864j
        /* renamed from: c */
        public void mo66050c() {
            Mp3SongBottomSheet.this.close();
        }

        @Override // p156fb.InterfaceC18864j
        /* renamed from: d */
        public void mo66051d(C19956a c19956a) {
            AbstractC19074t.m100208f(c19956a, "mediaItem");
            C0732w.m1177r(C0732w.Companion.m1189a(), "floating_mp3_click_to_post_feed", null, null, null, 14, null);
            Mp3SongBottomSheet.this.m66047OL(c19956a);
        }

        @Override // p156fb.InterfaceC18864j
        /* renamed from: f */
        public void mo66052f() {
            Mp3SongBottomSheet.this.close();
        }

        @Override // p156fb.InterfaceC18864j
        /* renamed from: g */
        public void mo66053g(C19956a c19956a) {
            String m15495J;
            AbstractC19074t.m100208f(c19956a, "mediaItem");
            C0732w.m1177r(C0732w.Companion.m1189a(), "floating_mp3_click_to_open_zmelody", null, null, null, 14, null);
            String m103736c = c19956a.m103736c();
            if (m103736c != null && m103736c.length() != 0) {
                m15495J = c19956a.m103736c();
            } else {
                m15495J = AbstractC3096i0.m15495J();
            }
            ZaloWebView.Companion.m87168C(Mp3SongBottomSheet.this.m92676n2(), m15495J);
        }

        @Override // p156fb.InterfaceC18864j
        /* renamed from: h */
        public void mo66054h(C19956a c19956a) {
            AbstractC19074t.m100208f(c19956a, "mediaItem");
            C0732w.m1177r(C0732w.Companion.m1189a(), "floating_mp3_click_to_share", null, null, null, 14, null);
            Mp3SongBottomSheet.this.m66048PL(c19956a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public final void m66046NL(ImageView imageView, String str) {
        if (str.length() == 0) {
            return;
        }
        new C23528a(getContext()).m123596a(str, Bitmap.class, 0L, new C11889a(str, imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public final void m66047OL(C19956a c19956a) {
        ZaloActivity zaloActivity;
        Context m92648SI = m92648SI();
        C17487o0 c17487o0 = null;
        if (m92648SI instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m92648SI;
        } else {
            zaloActivity = null;
        }
        if (zaloActivity != null) {
            c17487o0 = zaloActivity.mo35579p();
        }
        if (c17487o0 == null || c17487o0.m92993D0(UpdateStatusView.class) != null) {
            return;
        }
        TrackingSource trackingSource = new TrackingSource(43);
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_SONG_ID", c19956a.m103734a());
        bundle.putString("extra_tracking_source", trackingSource.m40686z());
        c17487o0.m93069k2(UpdateStatusView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public final void m66048PL(C19956a c19956a) {
        ZaloActivity zaloActivity;
        Context m92648SI = m92648SI();
        C17487o0 c17487o0 = null;
        if (m92648SI instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m92648SI;
        } else {
            zaloActivity = null;
        }
        if (zaloActivity != null) {
            c17487o0 = zaloActivity.mo35579p();
        }
        if (c17487o0 == null || c17487o0.m92993D0(ShareView.class) != null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("linktoShare", c19956a.m103735b());
        bundle.putBoolean("bol_open_post_feed", false);
        bundle.putBoolean("bol_share_in_app", true);
        c17487o0.m93069k2(ShareView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.Companion.m124119a().m124115b(this, 73);
        SongBtsView songBtsView = this.f61938b1;
        if (songBtsView != null) {
            songBtsView.m35294l();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        SongBtsView songBtsView = this.f61938b1;
        if (songBtsView != null) {
            songBtsView.m35295m();
        }
        C23744a.Companion.m124119a().m124117e(this, 73);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        int i11;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        if (C23212s8.m119603k()) {
            i11 = AbstractC8915g0.ZingMP3SampleSongBts;
        } else {
            i11 = AbstractC8915g0.ZingMP3SampleSongBts_Dark;
        }
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(getContext(), i11));
        AbstractC19074t.m100207e(from, "from(...)");
        SongBtsView m106529a = C20496k.m106529a(from, linearLayout);
        this.f61938b1 = m106529a;
        m106529a.setListener(new C11890b());
        linearLayout.addView(this.f61938b1);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        String str;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 73 && objArr.length != 0) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.connection.state.ConnectionState");
            if (((EnumC30982b) obj) == EnumC30982b.CONNECTED && this.f61940d1 != null && (str = this.f61939c1) != null && str.length() != 0) {
                ImageView imageView = this.f61940d1;
                AbstractC19074t.m100205c(imageView);
                String str2 = this.f61939c1;
                AbstractC19074t.m100205c(str2);
                m66046NL(imageView, str2);
            }
        }
    }
}
