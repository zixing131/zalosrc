package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.videoplayer.DraggableVideoView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import hf0.AbstractC20049k;
import java.util.ArrayList;
import org.json.JSONObject;
import p394oj.C24278d;
import p716zh.C31840a7;
import p716zh.C32106s7;
import p716zh.C32120t7;

/* loaded from: classes6.dex */
public class OAVideoFullPlayerView extends MinimizableVideoPlayerView implements ZaloView.InterfaceC17419d, InterfaceC0733x {

    /* renamed from: X1 */
    C32106s7 f75703X1;

    /* renamed from: Y1 */
    int f75704Y1;

    /* renamed from: Z1 */
    boolean f75705Z1 = false;

    /* renamed from: a2 */
    VideoController.AbstractC17311d f75706a2 = new C14703a();

    /* renamed from: b2 */
    InterfaceC14704b f75707b2;

    /* renamed from: com.zing.zalo.ui.zviews.OAVideoFullPlayerView$a */
    /* loaded from: classes6.dex */
    class C14703a extends VideoController.AbstractC17311d {
        C14703a() {
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: b */
        public void mo82405b(ZVideoView zVideoView, boolean z11) {
            InterfaceC14704b interfaceC14704b;
            if (zVideoView != null && zVideoView.getVideo() != null && (interfaceC14704b = OAVideoFullPlayerView.this.f75707b2) != null) {
                interfaceC14704b.mo82408gj(zVideoView.getVideo(), z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.OAVideoFullPlayerView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC14704b {
        /* renamed from: Gl */
        void mo82406Gl(int i11);

        /* renamed from: cE */
        C32120t7 mo82407cE();

        /* renamed from: gj */
        void mo82408gj(C17391z c17391z, boolean z11);

        /* renamed from: uz */
        boolean mo82409uz(C32106s7 c32106s7, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public /* synthetic */ void m82398eN(View view) {
        m82404jN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: DM */
    public void mo79705DM() {
        if (m92642L3() != null) {
            m92642L3().putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 5);
        }
        super.mo79705DM();
        Bundle bundle = this.f75267J1;
        if (bundle != null) {
            try {
                String string = bundle.getString("EXTRA_OA_VIDEO_STRING");
                if (!TextUtils.isEmpty(string)) {
                    this.f75703X1 = new C32106s7(new JSONObject(string));
                }
                this.f75704Y1 = this.f75267J1.getInt("EXTRA_OA_VIDEO_ORIGINAL_POSITION");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View findViewById = mo37483GJ.findViewById(AbstractC6918a0.zalo_action_bar);
        if (findViewById != null && findViewById.getParent() != null) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: TM */
    void mo79712TM() {
        ActionBar m92646QI = m92646QI();
        if (m92646QI != null) {
            m92646QI.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            VideoController videoController = zVideoView.getVideoController();
            videoController.setUseNextPrevious(true);
            videoController.f88210s.m92524q(true);
            videoController.setOnFullScreenClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.w20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OAVideoFullPlayerView.this.m82398eN(view2);
                }
            });
            videoController.m92307i(this.f75706a2);
        }
        this.f75304j1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: bN */
    public void mo81907bN() {
    }

    /* renamed from: dN */
    void m82399dN() {
        boolean z11;
        C32120t7 mo82407cE;
        ArrayList arrayList;
        InterfaceC14704b interfaceC14704b = this.f75707b2;
        boolean z12 = false;
        if (interfaceC14704b != null && this.f75704Y1 >= 0 && (mo82407cE = interfaceC14704b.mo82407cE()) != null && (arrayList = mo82407cE.f148084a) != null) {
            int size = arrayList.size();
            int i11 = this.f75704Y1;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 < size - 1) {
                z12 = true;
            }
        } else {
            z11 = false;
        }
        this.f75274O0.getVideoController().setNextEnabled(z12);
        this.f75274O0.getVideoController().setPreviousEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fN */
    public void m82400fN() {
        if (this.f75703X1 != null) {
            C24278d m152979g = C31840a7.m152973c().m152979g(this.f75703X1.m154977f(), this.f75703X1.m154975d());
            C32106s7 c32106s7 = this.f75703X1;
            if (c32106s7.f148009g != m152979g) {
                c32106s7.m154980i(m152979g);
                if (m92672lJ()) {
                    m82401gN(this.f75703X1, this.f75704Y1);
                    return;
                }
                ZVideoView zVideoView = this.f75274O0;
                if (zVideoView != null) {
                    zVideoView.m92429s0();
                    this.f75274O0.m92412f0(true);
                }
                this.f75705Z1 = true;
            }
        }
    }

    /* renamed from: gN */
    public void m82401gN(C32106s7 c32106s7, int i11) {
        this.f75703X1 = c32106s7;
        this.f75704Y1 = i11;
        this.f75276P0 = c32106s7.m154978g();
        DraggableVideoView draggableVideoView = this.f75270M0;
        if (draggableVideoView != null) {
            draggableVideoView.m89623H();
        }
        this.f75274O0.setZVideo(this.f75276P0);
        m81901PM();
        ZVideoView zVideoView = this.f75274O0;
        C17391z c17391z = this.f75276P0;
        AbstractC20049k.m104116j(zVideoView, c17391z, this.f75278Q0, c17391z.f88618a);
        if (this.f75703X1 != null && C31840a7.m152973c().m152980h(this.f75703X1.m154977f(), this.f75703X1.m154975d())) {
            this.f75274O0.m92419m0(true);
        }
        m82399dN();
        InterfaceC14704b interfaceC14704b = this.f75707b2;
        if (interfaceC14704b != null) {
            interfaceC14704b.mo82408gj(this.f75276P0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OAVideoFullPlayerView";
    }

    /* renamed from: hN */
    public void m82402hN(InterfaceC14704b interfaceC14704b) {
        this.f75707b2 = interfaceC14704b;
    }

    /* renamed from: iN */
    public void m82403iN(boolean z11) {
        if (z11) {
            mo78950cq(m92651WI().getString(AbstractC8020f0.str_tv_loading));
        } else {
            mo49315c4();
        }
        m82399dN();
    }

    /* renamed from: jN */
    void m82404jN() {
        mo81907bN();
        m92676n2().setRequestedOrientation(1);
        Intent intent = new Intent();
        intent.putExtras(new Bundle());
        mo50035CK(-1, intent);
        m81910wM(this.f75283S1);
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: k3 */
    public boolean mo79717k3(View view) {
        InterfaceC14704b interfaceC14704b;
        int id2 = view.getId();
        if (id2 == C17395R.id.video_btn_next) {
            InterfaceC14704b interfaceC14704b2 = this.f75707b2;
            if (interfaceC14704b2 != null) {
                interfaceC14704b2.mo82406Gl(this.f75704Y1 + 1);
            }
        } else if (id2 == C17395R.id.video_btn_previous && (interfaceC14704b = this.f75707b2) != null) {
            interfaceC14704b.mo82406Gl(this.f75704Y1 - 1);
        }
        return super.mo79717k3(view);
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m82404jN();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f75705Z1) {
            m82401gN(this.f75703X1, this.f75704Y1);
            this.f75705Z1 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
    public void onVideoCompletion(IMediaPlayer iMediaPlayer) {
        super.onVideoCompletion(iMediaPlayer);
        InterfaceC14704b interfaceC14704b = this.f75707b2;
        if (interfaceC14704b != null && !interfaceC14704b.mo82409uz(this.f75703X1, this.f75704Y1)) {
            m82404jN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m92637BK(false);
        if (this.f75703X1 != null && C31840a7.m152973c().m152980h(this.f75703X1.m154977f(), this.f75703X1.m154975d())) {
            this.f75274O0.m92419m0(true);
        }
        m82399dN();
    }
}
