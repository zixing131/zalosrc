package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7271y4;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.p077ui.zviews.OAVideoFullPlayerView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.uicontrol.OAVideoItemView;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.ZaloView;
import hf0.AbstractC20049k;
import hf0.C20040b;
import hf0.C20043e;
import hm0.C20096c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import org.json.JSONObject;
import p172fy.C19170a;
import p172fy.C19171b;
import p304ks.C21927m;
import p394oj.C24278d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31840a7;
import p716zh.C32002l4;
import p716zh.C32106s7;
import p716zh.C32120t7;
import tj.C26712d;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public class OAVideoPlaylistView extends SlidableZaloView implements C31840a7.e, OAVideoFullPlayerView.InterfaceC14704b, ZaloView.InterfaceC17419d, InterfaceC0733x {

    /* renamed from: R0 */
    RecyclerView f75711R0;

    /* renamed from: S0 */
    C7271y4 f75712S0;

    /* renamed from: T0 */
    SmoothScrollLinearLayoutManager f75713T0;

    /* renamed from: U0 */
    C20040b f75714U0;

    /* renamed from: V0 */
    OAVideoFullPlayerView f75715V0;

    /* renamed from: W0 */
    OrientationEventListener f75716W0;

    /* renamed from: Y0 */
    boolean f75718Y0;

    /* renamed from: P0 */
    C32106s7 f75709P0 = null;

    /* renamed from: Q0 */
    C32120t7 f75710Q0 = new C32120t7();

    /* renamed from: X0 */
    int f75717X0 = -1;

    /* renamed from: Z0 */
    boolean f75719Z0 = false;

    /* renamed from: a1 */
    int f75720a1 = 0;

    /* renamed from: b1 */
    String f75721b1 = "";

    /* renamed from: c1 */
    int f75722c1 = -1;

    /* renamed from: d1 */
    Handler f75723d1 = new Handler(Looper.getMainLooper(), new C14705a());

    /* renamed from: e1 */
    boolean f75724e1 = false;

    /* renamed from: f1 */
    RecyclerView.AbstractC1892s f75725f1 = new C14707c();

    /* renamed from: g1 */
    OAVideoItemView.InterfaceC16474c f75726g1 = new C14708d();

    /* renamed from: com.zing.zalo.ui.zviews.OAVideoPlaylistView$a */
    /* loaded from: classes6.dex */
    class C14705a implements Handler.Callback {
        C14705a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            OAVideoPlaylistView oAVideoPlaylistView;
            C20040b c20040b;
            try {
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    OAVideoPlaylistView oAVideoPlaylistView2 = OAVideoPlaylistView.this;
                                    oAVideoPlaylistView2.m82412gM(oAVideoPlaylistView2.f75720a1 + 1);
                                }
                            } else {
                                OAVideoFullPlayerView oAVideoFullPlayerView = OAVideoPlaylistView.this.f75715V0;
                                if (oAVideoFullPlayerView != null) {
                                    oAVideoFullPlayerView.m82400fN();
                                }
                            }
                        } else if (OAVideoPlaylistView.this.m92672lJ() && (c20040b = (oAVideoPlaylistView = OAVideoPlaylistView.this).f75714U0) != null) {
                            c20040b.m104021w(oAVideoPlaylistView.f75711R0);
                        }
                    } else {
                        boolean booleanValue = ((Boolean) message.obj).booleanValue();
                        OAVideoPlaylistView.this.f75712S0.m37035W(false);
                        if (booleanValue) {
                            OAVideoPlaylistView oAVideoPlaylistView3 = OAVideoPlaylistView.this;
                            oAVideoPlaylistView3.f75712S0.m37037Y(oAVideoPlaylistView3.f75710Q0.f148084a);
                            C20040b c20040b2 = OAVideoPlaylistView.this.f75714U0;
                            if (c20040b2 != null && c20040b2.m104002J() != null) {
                                OAVideoPlaylistView.this.f75714U0.m104002J().m130834l();
                            }
                        }
                        OAVideoPlaylistView.this.f75712S0.m10008p();
                        OAVideoFullPlayerView oAVideoFullPlayerView2 = OAVideoPlaylistView.this.f75715V0;
                        if (oAVideoFullPlayerView2 != null) {
                            oAVideoFullPlayerView2.m82403iN(false);
                        }
                        if (booleanValue) {
                            OAVideoPlaylistView oAVideoPlaylistView4 = OAVideoPlaylistView.this;
                            if (oAVideoPlaylistView4.f75719Z0) {
                                oAVideoPlaylistView4.f75723d1.sendEmptyMessage(5);
                            }
                        }
                        OAVideoPlaylistView.this.f75719Z0 = false;
                    }
                } else {
                    OAVideoPlaylistView oAVideoPlaylistView5 = OAVideoPlaylistView.this;
                    oAVideoPlaylistView5.f75712S0.m37037Y(oAVideoPlaylistView5.f75710Q0.f148084a);
                    OAVideoPlaylistView.this.f75712S0.m10008p();
                    OAVideoPlaylistView.this.f75723d1.sendEmptyMessage(3);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.OAVideoPlaylistView$b */
    /* loaded from: classes6.dex */
    class C14706b extends OrientationEventListener {
        C14706b(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            try {
                OAVideoPlaylistView oAVideoPlaylistView = OAVideoPlaylistView.this;
                oAVideoPlaylistView.f75717X0 = i11;
                if (!oAVideoPlaylistView.f75718Y0 && Settings.System.getInt(oAVideoPlaylistView.f72421L0.m92648SI().getContentResolver(), "accelerometer_rotation") == 1) {
                    if ((i11 >= 30 && i11 <= 60) || ((i11 >= 120 && i11 <= 150) || ((i11 >= 210 && i11 <= 240) || (i11 >= 300 && i11 <= 330)))) {
                        OAVideoPlaylistView.this.m92676n2().setRequestedOrientation(-1);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.OAVideoPlaylistView$c */
    /* loaded from: classes6.dex */
    class C14707c extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        int f75729a = 0;

        C14707c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            C20040b.c cVar;
            int i12;
            super.mo952b(recyclerView, i11);
            OAVideoPlaylistView oAVideoPlaylistView = OAVideoPlaylistView.this;
            int i13 = 0;
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            oAVideoPlaylistView.f75724e1 = z11;
            if (i11 == 0) {
                C20040b c20040b = oAVideoPlaylistView.f75714U0;
                if (c20040b != null) {
                    cVar = c20040b.m104001I();
                } else {
                    cVar = null;
                }
                if (cVar != null && cVar.getNewVideoView() != null && cVar.getNewVideoView().getCurrentState() == 5) {
                    OAVideoPlaylistView.this.m82412gM(cVar.getDataPosition() + 1);
                }
                OAVideoPlaylistView.this.f75712S0.m10008p();
                OAVideoPlaylistView oAVideoPlaylistView2 = OAVideoPlaylistView.this;
                if (oAVideoPlaylistView2.f75709P0 != null) {
                    C32120t7 c32120t7 = oAVideoPlaylistView2.f75710Q0;
                    if (c32120t7.f148087d && !c32120t7.f148089f) {
                        int m9745c2 = oAVideoPlaylistView2.f75713T0.m9745c2();
                        ArrayList arrayList = OAVideoPlaylistView.this.f75710Q0.f148084a;
                        if (arrayList != null) {
                            i12 = arrayList.size() - 3;
                        } else {
                            i12 = 0;
                        }
                        if (i12 >= 0) {
                            i13 = i12;
                        }
                        if (m9745c2 >= i13) {
                            OAVideoPlaylistView oAVideoPlaylistView3 = OAVideoPlaylistView.this;
                            oAVideoPlaylistView3.f75710Q0.f148086c++;
                            oAVideoPlaylistView3.m82414iM(oAVideoPlaylistView3.f75709P0.m154974c(), OAVideoPlaylistView.this.f75710Q0.f148086c);
                        }
                    }
                }
            } else if (this.f75729a == 0) {
                oAVideoPlaylistView.f75719Z0 = false;
            }
            OAVideoPlaylistView.this.f75712S0.m37033U(recyclerView, i11);
            this.f75729a = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            C20040b.b bVar;
            super.mo10176d(recyclerView, i11, i12);
            int m9740Y1 = OAVideoPlaylistView.this.f75713T0.m9740Y1();
            int m10110a = OAVideoPlaylistView.this.f75713T0.m10110a();
            C7271y4 c7271y4 = OAVideoPlaylistView.this.f75712S0;
            if (i12 > 0) {
                bVar = C20040b.b.f98514q;
            } else {
                bVar = C20040b.b.f98513p;
            }
            c7271y4.m37032T(recyclerView, m9740Y1, m10110a, bVar);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.OAVideoPlaylistView$d */
    /* loaded from: classes6.dex */
    class C14708d implements OAVideoItemView.InterfaceC16474c {

        /* renamed from: com.zing.zalo.ui.zviews.OAVideoPlaylistView$d$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC28207v1.g0 {

            /* renamed from: a */
            final /* synthetic */ String f75732a;

            /* renamed from: b */
            final /* synthetic */ String f75733b;

            a(String str, String str2) {
                this.f75732a = str;
                this.f75733b = str2;
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: h */
            public void mo40743h() {
                OAVideoPlaylistView.this.m78964sL();
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: j */
            public void mo40745j(String str) {
                OAVideoPlaylistView.this.m78968wL(str);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: m */
            public void mo40748m(String str) {
                OAVideoPlaylistView.this.m78962rL(str, false);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: o */
            public void mo40750o() {
                OAVideoPlaylistView.this.m78971xL(this.f75733b);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: q */
            public void mo40752q(String str) {
                OAVideoPlaylistView.this.m78961qL(str);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: r */
            public void mo40753r(String str, String str2, String str3) {
                OAVideoPlaylistView.this.m78965tL(str2, str, 4, this.f75732a, this.f75733b, str3);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: s */
            public void mo40754s(String str) {
                OAVideoPlaylistView.this.m78962rL(str, true);
                OAVideoPlaylistView.this.f75723d1.sendEmptyMessage(1);
            }
        }

        C14708d() {
        }

        @Override // com.zing.zalo.uicontrol.OAVideoItemView.InterfaceC16474c
        /* renamed from: a */
        public void mo82418a(OAVideoItemView oAVideoItemView, C32106s7 c32106s7, C26712d c26712d) {
            if (c26712d == null) {
                return;
            }
            try {
                String m137334b = c26712d.m137334b();
                String m137333a = c26712d.m137333a();
                AbstractC28207v1.m141984g3(m137334b, 4, OAVideoPlaylistView.this.m92676n2(), OAVideoPlaylistView.this, m137333a, new a(m137334b, m137333a), null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.uicontrol.OAVideoItemView.InterfaceC16474c
        /* renamed from: b */
        public void mo82419b(OAVideoItemView oAVideoItemView, C32106s7 c32106s7) {
            if (c32106s7 != null && c32106s7.m154976e() != null) {
                String valueOf = String.valueOf(c32106s7.m154976e().f148011a);
                if (C21927m.m114302u().m114318P(valueOf)) {
                    new C19170a().m101508a(new C19170a.a(OAVideoPlaylistView.this.f72421L0.m92676n2(), valueOf, 0));
                } else {
                    new C19171b().m101508a(new C19171b.a(OAVideoPlaylistView.this.f72421L0.m92676n2(), new C26365a.b(valueOf, C32002l4.m154264g(21)).m135743b(), 0, 1));
                }
            }
        }

        @Override // com.zing.zalo.uicontrol.OAVideoItemView.InterfaceC16474c
        /* renamed from: c */
        public void mo82420c(OAVideoItemView oAVideoItemView) {
            OAVideoPlaylistView.this.m82416lM(oAVideoItemView, true);
        }

        @Override // com.zing.zalo.uicontrol.OAVideoItemView.InterfaceC16474c
        /* renamed from: d */
        public void mo82421d(OAVideoItemView oAVideoItemView, C32106s7 c32106s7) {
            String str;
            LinkAttachment linkAttachment = new LinkAttachment();
            linkAttachment.f42625q = c32106s7.f148006d;
            linkAttachment.f42624p = c32106s7.f148004b;
            linkAttachment.f42627s = c32106s7.f148007e;
            linkAttachment.f42626r = c32106s7.f148005c;
            if (c32106s7.m154976e() != null) {
                str = c32106s7.m154976e().f148013c;
            } else {
                str = "";
            }
            linkAttachment.f42628t = str;
            linkAttachment.f42630v = c32106s7.f148003a;
            Bundle bundle = new Bundle();
            bundle.putString("linktoShare", linkAttachment.f42624p);
            bundle.putString("subjectForLink", linkAttachment.f42625q);
            bundle.putParcelable("shareLinkAttachment", linkAttachment);
            OAVideoPlaylistView.this.m92676n2().mo35579p().m93069k2(ShareView.class, bundle, 1, true);
        }

        @Override // com.zing.zalo.uicontrol.OAVideoItemView.InterfaceC16474c
        /* renamed from: e */
        public void mo82422e(OAVideoItemView oAVideoItemView, int i11) {
            if (oAVideoItemView != null && i11 == 5) {
                OAVideoPlaylistView oAVideoPlaylistView = OAVideoPlaylistView.this;
                if (!oAVideoPlaylistView.f75724e1) {
                    oAVideoPlaylistView.m82412gM(oAVideoItemView.getDataPosition() + 1);
                }
            }
        }

        @Override // com.zing.zalo.uicontrol.OAVideoItemView.InterfaceC16474c
        /* renamed from: f */
        public void mo82423f(OAVideoItemView oAVideoItemView) {
            int dataPosition;
            if (oAVideoItemView != null && (dataPosition = oAVideoItemView.getDataPosition()) >= 0 && dataPosition < OAVideoPlaylistView.this.f75712S0.m37025M()) {
                OAVideoPlaylistView.this.f75711R0.mo9854S1(dataPosition);
                C20040b c20040b = OAVideoPlaylistView.this.f75714U0;
                if (c20040b != null) {
                    c20040b.m104013Z(oAVideoItemView, dataPosition);
                }
                OAVideoFullPlayerView oAVideoFullPlayerView = OAVideoPlaylistView.this.f75715V0;
                if (oAVideoFullPlayerView != null && oAVideoFullPlayerView.m92672lJ()) {
                    OAVideoPlaylistView.this.f75715V0.m82401gN(oAVideoItemView.getOaVideo(), dataPosition);
                }
                OAVideoPlaylistView.this.f75720a1 = dataPosition;
            }
        }
    }

    /* renamed from: kM */
    public static Bundle m82410kM(C32106s7 c32106s7, C17391z c17391z, int i11) {
        Bundle bundle = new Bundle();
        if (c32106s7 != null) {
            bundle.putString("EXTRA_OA_VIDEO_STRING", c32106s7.m154981j().toString());
        }
        if (c17391z != null) {
            bundle.putString("EXTRA_STRING_ORIGINAL_VIDEO_ID", c17391z.f88618a);
            bundle.putInt("EXTRA_INT_ORIGINAL_VIDEO_TYPE", i11);
        }
        return bundle;
    }

    @Override // p716zh.C31840a7.e
    /* renamed from: Af */
    public void mo82411Af(C32120t7 c32120t7, boolean z11, C20096c c20096c) {
        String m119318c;
        if (!z11 && m92672lJ() && c20096c != null) {
            int m104491c = c20096c.m104491c();
            if (m104491c != 121 && m104491c != 111 && m104491c != 112 && m104491c != 1001) {
                m119318c = c20096c.m104492d();
            } else {
                m119318c = AbstractC23161o1.m119318c(112, "");
            }
            if (!TextUtils.isEmpty(m119318c)) {
                ToastUtils.showMess(m119318c);
            }
        }
        this.f75723d1.sendMessage(this.f75723d1.obtainMessage(2, Boolean.valueOf(z11)));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int i11;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            String string = m92642L3.getString("EXTRA_OA_VIDEO_STRING");
            if (!TextUtils.isEmpty(string)) {
                C32106s7 c32106s7 = new C32106s7(new JSONObject(string));
                this.f75709P0 = c32106s7;
                this.f75710Q0.f148084a.add(c32106s7);
            }
            m82417mM(this.f75710Q0.f148084a, true);
            this.f75721b1 = m92642L3.getString("EXTRA_STRING_ORIGINAL_VIDEO_ID", "");
            this.f75722c1 = m92642L3.getInt("EXTRA_INT_ORIGINAL_VIDEO_TYPE", -1);
            if (!m92683qJ() && this.f75709P0 != null && !TextUtils.isEmpty(this.f75721b1) && (i11 = this.f75722c1) >= 0) {
                long m104111d = AbstractC20049k.m104111d(i11, this.f75721b1);
                if (m104111d >= 0) {
                    AbstractC20049k.m104119m(5, this.f75709P0.m154975d(), m104111d);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f75710Q0.f148084a.isEmpty()) {
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.oa_video_playlist_view, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.OAVideoFullPlayerView.InterfaceC14704b
    /* renamed from: Gl */
    public void mo82406Gl(int i11) {
        m82412gM(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C7271y4 c7271y4 = this.f75712S0;
        if (c7271y4 != null) {
            c7271y4.m37029Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setOccupyStatusBar(false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332 && !m92681pJ() && !m92677nJ()) {
            m82413hM();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        ZaloView m93012K0 = m92662fJ().m93012K0();
        if (!m92676n2().mo35576n3() && (m93012K0 == null || !(m93012K0 instanceof ZaloView.InterfaceC17419d))) {
            AbstractC23136l9.m118686X0(m92676n2().getWindow(), false);
            m92676n2().setRequestedOrientation(1);
        }
        C7271y4 c7271y4 = this.f75712S0;
        if (c7271y4 != null) {
            c7271y4.m37030R();
        }
        if (mo60294yp() || m92681pJ()) {
            ZMediaPlayer.setStopAllUrlCaching(ZMediaPlayerSettings.getVideoConfig(3));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        OrientationEventListener orientationEventListener = this.f75716W0;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C7271y4 c7271y4 = this.f75712S0;
        if (c7271y4 != null) {
            c7271y4.m37034V();
        }
        OrientationEventListener orientationEventListener = this.f75716W0;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.rv_oa_video_playlist);
        this.f75711R0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f75711R0.m9826E(this.f75725f1);
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(getContext(), 1, false);
        this.f75713T0 = smoothScrollLinearLayoutManager;
        smoothScrollLinearLayoutManager.m88005N2(50.0f);
        this.f75713T0.m88007P2(true);
        this.f75711R0.setLayoutManager(this.f75713T0);
        C7271y4 c7271y4 = new C7271y4();
        this.f75712S0 = c7271y4;
        c7271y4.m9999J(true);
        this.f75712S0.m37036X(this.f75726g1);
        this.f75712S0.m37037Y(this.f75710Q0.f148084a);
        this.f75711R0.setAdapter(this.f75712S0);
        C20040b m37024L = this.f75712S0.m37024L();
        this.f75714U0 = m37024L;
        C32106s7 c32106s7 = this.f75709P0;
        if (c32106s7 != null) {
            m37024L.m104010U(c32106s7.m154978g(), true);
        }
        C32106s7 c32106s72 = this.f75709P0;
        if (c32106s72 != null) {
            m82414iM(c32106s72.m154974c(), this.f75710Q0.f148086c);
        }
        ZaloView m92993D0 = m92662fJ().m92993D0(OAVideoFullPlayerView.class);
        if (m92993D0 != null) {
            this.f75715V0 = (OAVideoFullPlayerView) m92993D0;
            m82415jM();
        }
        this.f75716W0 = new C14706b(this.f72421L0.m92648SI(), 3);
    }

    @Override // com.zing.zalo.p077ui.zviews.OAVideoFullPlayerView.InterfaceC14704b
    /* renamed from: cE */
    public C32120t7 mo82407cE() {
        return this.f75710Q0;
    }

    @Override // p716zh.C31840a7.g
    /* renamed from: ds */
    public void mo43895ds(String str, String[] strArr, boolean z11) {
        try {
            Iterator it = this.f75710Q0.f148084a.iterator();
            while (it.hasNext()) {
                C32106s7 c32106s7 = (C32106s7) it.next();
                if (c32106s7 != null && !TextUtils.isEmpty(c32106s7.m154977f())) {
                    c32106s7.m154980i(C31840a7.m152973c().m152979g(c32106s7.m154977f(), c32106s7.m154975d()));
                }
            }
            this.f75723d1.sendEmptyMessage(1);
            this.f75723d1.sendEmptyMessage(3);
            this.f75723d1.sendEmptyMessage(4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    void m82412gM(int i11) {
        C20040b c20040b;
        if (i11 >= 0 && i11 < this.f75710Q0.f148084a.size()) {
            C32106s7 c32106s7 = (C32106s7) this.f75710Q0.f148084a.get(i11);
            if (c32106s7 != null) {
                this.f75711R0.mo9854S1(i11);
                OAVideoFullPlayerView oAVideoFullPlayerView = this.f75715V0;
                if (oAVideoFullPlayerView != null && oAVideoFullPlayerView.m92672lJ()) {
                    this.f75715V0.m82401gN(c32106s7, i11);
                } else {
                    RecyclerView.AbstractC1876c0 m9900t0 = this.f75711R0.m9900t0(i11);
                    if (m9900t0 != null && (m9900t0 instanceof C7271y4.a) && (c20040b = this.f75714U0) != null) {
                        c20040b.m104013Z(((C7271y4.a) m9900t0).f39884I, i11);
                    }
                }
                this.f75720a1 = i11;
                return;
            }
            return;
        }
        if (i11 >= this.f75710Q0.f148084a.size() && this.f75710Q0.f148089f) {
            this.f75719Z0 = true;
            OAVideoFullPlayerView oAVideoFullPlayerView2 = this.f75715V0;
            if (oAVideoFullPlayerView2 != null && oAVideoFullPlayerView2.m92672lJ()) {
                this.f75715V0.m82403iN(true);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OAVideoPlaylistView";
    }

    @Override // com.zing.zalo.p077ui.zviews.OAVideoFullPlayerView.InterfaceC14704b
    /* renamed from: gj */
    public void mo82408gj(C17391z c17391z, boolean z11) {
        C20040b c20040b = this.f75714U0;
        if (c20040b != null) {
            c20040b.m104010U(c17391z, z11);
        }
    }

    /* renamed from: hM */
    void m82413hM() {
        if (this.f75709P0 != null && !TextUtils.isEmpty(this.f75721b1) && this.f75722c1 >= 0) {
            long m104111d = AbstractC20049k.m104111d(5, this.f75709P0.m154975d());
            if (m104111d >= 0) {
                AbstractC20049k.m104119m(this.f75722c1, this.f75721b1, m104111d);
            }
        }
        finish();
    }

    /* renamed from: iM */
    void m82414iM(long j11, int i11) {
        this.f75712S0.m37035W(true);
        this.f75712S0.m10008p();
        C31840a7.m152973c().m152977e(this.f75710Q0, j11, i11, this);
    }

    /* renamed from: jM */
    void m82415jM() {
        OAVideoFullPlayerView oAVideoFullPlayerView = this.f75715V0;
        if (oAVideoFullPlayerView != null) {
            oAVideoFullPlayerView.m82402hN(this);
        }
    }

    /* renamed from: lM */
    void m82416lM(OAVideoItemView oAVideoItemView, boolean z11) {
        int i11;
        if (oAVideoItemView != null) {
            C32106s7 oaVideo = oAVideoItemView.getOaVideo();
            int dataPosition = oAVideoItemView.getDataPosition();
            if (oaVideo != null && dataPosition >= 0) {
                C17391z m154978g = oaVideo.m154978g();
                if (z11 && m154978g != null && m154978g.f88626i > 0.0f) {
                    InterfaceC27218a m92676n2 = m92676n2();
                    if (m154978g.f88626i <= 1.0f) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    m92676n2.setRequestedOrientation(i11);
                }
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_OA_VIDEO_STRING", oaVideo.m154981j().toString());
                bundle.putInt("EXTRA_OA_VIDEO_ORIGINAL_POSITION", dataPosition);
                bundle.putBoolean("EXTRA_BOOLEAN_HANDLE_SCREEN_ORIENTATION", false);
                C20040b c20040b = this.f75714U0;
                if (c20040b != null) {
                    c20040b.m104011V(true);
                    this.f75714U0.m104010U(m154978g, true);
                }
                this.f75715V0 = (OAVideoFullPlayerView) C20043e.m104030u(m92676n2(), m154978g, bundle, 1000);
                m82415jM();
            }
        }
        this.f75719Z0 = false;
    }

    /* renamed from: mM */
    void m82417mM(List list, boolean z11) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    Iterator it = list.iterator();
                    String str = null;
                    while (it.hasNext()) {
                        C32106s7 c32106s7 = (C32106s7) it.next();
                        if (c32106s7 != null && !TextUtils.isEmpty(c32106s7.m154977f()) && !TextUtils.isEmpty(c32106s7.m154975d())) {
                            str = c32106s7.m154977f();
                            String m154975d = c32106s7.m154975d();
                            C24278d m152979g = C31840a7.m152973c().m152979g(str, m154975d);
                            c32106s7.m154980i(m152979g);
                            if (m152979g != null && !m152979g.m126783a()) {
                            }
                            Set set = (Set) hashMap.get(str);
                            if (set == null) {
                                set = new HashSet();
                                hashMap.put(str, set);
                            }
                            set.add(m154975d);
                        }
                    }
                    if (z11) {
                        for (String str2 : hashMap.keySet()) {
                            Set set2 = (Set) hashMap.get(str);
                            if (set2 != null && !set2.isEmpty()) {
                                C31840a7.m152973c().m152976d(str2, (String[]) set2.toArray(new String[set2.size()]), this);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 1000) {
            super.onActivityResult(i11, i12, intent);
        } else {
            m92676n2().setRequestedOrientation(1);
            this.f75723d1.sendEmptyMessageDelayed(3, 1000L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        OAVideoFullPlayerView oAVideoFullPlayerView;
        C20040b.c cVar;
        super.onConfigurationChanged(configuration);
        try {
            this.f75718Y0 = false;
            int i11 = configuration.orientation;
            if (i11 == 2) {
                OAVideoFullPlayerView oAVideoFullPlayerView2 = this.f75715V0;
                if (oAVideoFullPlayerView2 != null && !oAVideoFullPlayerView2.mo60294yp()) {
                    return;
                }
                C20040b c20040b = this.f75714U0;
                if (c20040b != null) {
                    cVar = c20040b.m104001I();
                } else {
                    cVar = null;
                }
                if (cVar != null && (cVar instanceof OAVideoItemView)) {
                    m82416lM((OAVideoItemView) cVar, false);
                    return;
                }
                return;
            }
            if (i11 == 1 && (oAVideoFullPlayerView = this.f75715V0) != null && oAVideoFullPlayerView.m92672lJ() && !this.f75715V0.mo60294yp()) {
                this.f75715V0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m82413hM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (!m92676n2().mo35576n3()) {
            AbstractC23136l9.m118686X0(m92676n2().getWindow(), true);
        }
        C7271y4 c7271y4 = this.f75712S0;
        if (c7271y4 != null) {
            c7271y4.m37031S();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.OAVideoFullPlayerView.InterfaceC14704b
    /* renamed from: uz */
    public boolean mo82409uz(C32106s7 c32106s7, int i11) {
        m82412gM(i11 + 1);
        return true;
    }
}
