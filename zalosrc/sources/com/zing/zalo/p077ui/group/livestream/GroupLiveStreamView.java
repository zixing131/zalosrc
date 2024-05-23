package com.zing.zalo.p077ui.group.livestream;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bp0.AbstractC3096i0;
import bp0.AbstractC3106r;
import com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7210s9;
import com.zing.zalo.adapters.C7221t9;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import com.zing.zalo.uicontrol.draggableview.DraggableView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import me0.AbstractC23059e9;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23185q3;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import p056cj.C3535c;
import p097db.EnumC17855n;
import p097db.EnumC17862u;
import p097db.EnumC17863v;
import p127eb.C18373b;
import p127eb.C18374c;
import p127eb.C18375d;
import p308kx.C21965i;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C32062p5;
import ro0.AbstractRunnableC25943g;
import uc0.InterfaceC27232a;
import vg.C28020b3;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zm.voip.service.C32252b;
import zm.voip.service.HandlerC32324p;

/* loaded from: classes5.dex */
public class GroupLiveStreamView extends BaseZaloView implements ZaloView.InterfaceC17422g, View.OnClickListener, C23744a.c, TextWatcher, InterfaceC27232a, CameraVideoCapturer.CameraEventsHandler, ZaloView.InterfaceC17420e, InterfaceC0733x {

    /* renamed from: s2 */
    static final int f62227s2 = AbstractC23136l9.m118742r(160.0f);

    /* renamed from: A1 */
    ImageButton f62228A1;

    /* renamed from: B1 */
    LinearLayoutManager f62229B1;

    /* renamed from: C1 */
    View f62230C1;

    /* renamed from: D1 */
    RelativeLayout f62231D1;

    /* renamed from: E1 */
    KeyboardFrameLayout f62232E1;

    /* renamed from: F1 */
    StickerPanelView f62233F1;

    /* renamed from: G1 */
    ImageView f62234G1;

    /* renamed from: H1 */
    RecyclerView f62235H1;

    /* renamed from: I1 */
    C7210s9 f62236I1;

    /* renamed from: J1 */
    int f62237J1;

    /* renamed from: N0 */
    SurfaceViewRenderer f62242N0;

    /* renamed from: N1 */
    String f62243N1;

    /* renamed from: O0 */
    C32062p5 f62244O0;

    /* renamed from: P0 */
    C3535c f62246P0;

    /* renamed from: S0 */
    C23528a f62252S0;

    /* renamed from: T0 */
    View f62254T0;

    /* renamed from: U0 */
    ViewGroup f62256U0;

    /* renamed from: V0 */
    LinearLayout f62258V0;

    /* renamed from: W0 */
    TextView f62260W0;

    /* renamed from: X0 */
    TextView f62262X0;

    /* renamed from: Y0 */
    TextView f62264Y0;

    /* renamed from: Z0 */
    TextView f62266Z0;

    /* renamed from: a1 */
    DraggableView f62268a1;

    /* renamed from: b1 */
    TextView f62270b1;

    /* renamed from: b2 */
    KeyEventCallbackC17462c f62271b2;

    /* renamed from: c1 */
    ImageView f62272c1;

    /* renamed from: c2 */
    EglBase f62273c2;

    /* renamed from: d1 */
    ImageView f62274d1;

    /* renamed from: d2 */
    C18374c f62275d2;

    /* renamed from: e1 */
    ProgressBar f62276e1;

    /* renamed from: f1 */
    ImageView f62278f1;

    /* renamed from: f2 */
    boolean f62279f2;

    /* renamed from: g1 */
    Button f62280g1;

    /* renamed from: g2 */
    float f62281g2;

    /* renamed from: h1 */
    Button f62282h1;

    /* renamed from: h2 */
    float f62283h2;

    /* renamed from: i1 */
    TextView f62284i1;

    /* renamed from: j1 */
    View f62286j1;

    /* renamed from: k1 */
    ImageView f62288k1;

    /* renamed from: l1 */
    View f62290l1;

    /* renamed from: m1 */
    TextView f62292m1;

    /* renamed from: n1 */
    TextView f62294n1;

    /* renamed from: o1 */
    Button f62296o1;

    /* renamed from: p1 */
    View f62298p1;

    /* renamed from: q1 */
    View f62300q1;

    /* renamed from: r1 */
    View f62302r1;

    /* renamed from: s1 */
    View f62304s1;

    /* renamed from: t1 */
    RobotoTextView f62305t1;

    /* renamed from: u1 */
    ActionEditText f62306u1;

    /* renamed from: v1 */
    View f62307v1;

    /* renamed from: w1 */
    View f62308w1;

    /* renamed from: x1 */
    TouchListView f62309x1;

    /* renamed from: y1 */
    C11944a f62310y1;

    /* renamed from: z1 */
    View f62311z1;

    /* renamed from: M0 */
    C21965i f62240M0 = null;

    /* renamed from: Q0 */
    long f62248Q0 = 0;

    /* renamed from: R0 */
    boolean f62250R0 = true;

    /* renamed from: K1 */
    boolean f62238K1 = false;

    /* renamed from: L1 */
    boolean f62239L1 = true;

    /* renamed from: M1 */
    String f62241M1 = "";

    /* renamed from: O1 */
    boolean f62245O1 = false;

    /* renamed from: P1 */
    boolean f62247P1 = false;

    /* renamed from: Q1 */
    boolean f62249Q1 = false;

    /* renamed from: R1 */
    boolean f62251R1 = false;

    /* renamed from: S1 */
    List f62253S1 = new ArrayList();

    /* renamed from: T1 */
    WeakHashMap f62255T1 = new WeakHashMap();

    /* renamed from: U1 */
    int f62257U1 = AbstractC23136l9.m118713h0();

    /* renamed from: V1 */
    int f62259V1 = f62227s2;

    /* renamed from: W1 */
    boolean f62261W1 = false;

    /* renamed from: X1 */
    boolean f62263X1 = false;

    /* renamed from: Y1 */
    boolean f62265Y1 = false;

    /* renamed from: Z1 */
    int f62267Z1 = 0;

    /* renamed from: a2 */
    int f62269a2 = 0;

    /* renamed from: e2 */
    volatile boolean f62277e2 = false;

    /* renamed from: i2 */
    ZRtcLiveStreamCb f62285i2 = new C11935a();

    /* renamed from: j2 */
    int f62287j2 = 0;

    /* renamed from: k2 */
    Handler f62289k2 = new HandlerC11940f(Looper.getMainLooper());

    /* renamed from: l2 */
    volatile boolean f62291l2 = false;

    /* renamed from: m2 */
    boolean f62293m2 = false;

    /* renamed from: n2 */
    int f62295n2 = 0;

    /* renamed from: o2 */
    final Runnable f62297o2 = new RunnableC11942h();

    /* renamed from: p2 */
    int f62299p2 = 300;

    /* renamed from: q2 */
    boolean f62301q2 = true;

    /* renamed from: r2 */
    private final int f62303r2 = 8;

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$a */
    /* loaded from: classes5.dex */
    public class C11935a implements ZRtcLiveStreamCb {
        C11935a() {
        }

        /* renamed from: b */
        public /* synthetic */ void m66459b() {
            try {
                GroupLiveStreamView.this.f62260W0.setText(Html.fromHtml(String.format("%s:%d Kbit/s,%s:%d Kbit/s, rtt:%dms", "&#9650", Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92761o), "&#9660", Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92762p), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92763q))));
                GroupLiveStreamView.this.f62262X0.setText(String.format("Audio:%d pkg/s, Video:%d pkg/s, Key frame:%d", Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92748b), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92759m), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92760n)));
                GroupLiveStreamView.this.f62264Y0.setText(String.format("Nack: Audio:%d, Video:%d, Bwe: %d, Remb:%d", Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92747a), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92755i), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92757k), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92758l)));
                GroupLiveStreamView.this.f62266Z0.setText(String.format("Fps: capture:%d(%dx%d), encode:%d(%dx%d)", Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92753g), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92750d), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92749c), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92754h), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92752f), Integer.valueOf(GroupLiveStreamView.this.f62275d2.f92751e)));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public int onCheckNwType() {
            return AbstractC3106r.m15709b(MainApplication.getAppContext());
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onError(int i11) {
            if (i11 == EnumC17862u.SESSION_EXPIRED.m94384b() && GroupLiveStreamView.this.f72421L0.m92674mJ() && GroupLiveStreamView.this.f72421L0.m92648SI() != null) {
                GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                if (groupLiveStreamView.f62271b2 == null) {
                    groupLiveStreamView.m66453sM(i11);
                }
            }
            AbstractC20110a.m104542k(8, "LiveStreamView onError error= " + i11, new Object[0]);
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onFinishFlushData() {
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onFlushData(int i11) {
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onFrameEncode(ByteBuffer byteBuffer) {
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onNetworkStateChange(int i11) {
            if (i11 == EnumC17863v.DISCONNECT.m94385b()) {
                GroupLiveStreamView.this.m66453sM(i11);
            } else {
                GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                int i12 = groupLiveStreamView.f62237J1;
                if (i12 == 9 || i12 == 5) {
                    groupLiveStreamView.f62289k2.sendEmptyMessage(6);
                }
            }
            AbstractC20110a.m104542k(8, "LiveStreamView onNetworkStateChange state= " + i11, new Object[0]);
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onRawAudio(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onStats(String str) {
            try {
                if (!GroupLiveStreamView.this.f62277e2) {
                    return;
                }
                GroupLiveStreamView.this.f62275d2.m97356a(str);
                GroupLiveStreamView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.d0
                    public /* synthetic */ RunnableC11951d0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamView.C11935a.this.m66459b();
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZRtcLiveStreamCb
        public void onSwitchCameraDone(boolean z11) {
            GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
            groupLiveStreamView.f62293m2 = false;
            groupLiveStreamView.f62242N0.setMirror(z11);
            AbstractC20110a.m104542k(8, "LiveStreamView onSwitchCameraDone isFront= " + z11, new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$b */
    /* loaded from: classes5.dex */
    public class C11936b implements KeyboardFrameLayout.InterfaceC13508a {
        C11936b() {
        }

        /* renamed from: b */
        public /* synthetic */ void m66461b() {
            try {
                GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                if (groupLiveStreamView.f62295n2 != 2) {
                    groupLiveStreamView.m66439Ka(0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
            if (groupLiveStreamView.f62238K1) {
                return;
            }
            groupLiveStreamView.f62251R1 = false;
            groupLiveStreamView.f62289k2.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.e0
                public /* synthetic */ RunnableC11953e0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupLiveStreamView.C11936b.this.m66461b();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
            if (groupLiveStreamView.f62238K1) {
                return;
            }
            groupLiveStreamView.f62251R1 = true;
            if (groupLiveStreamView.f72421L0.m92672lJ()) {
                GroupLiveStreamView groupLiveStreamView2 = GroupLiveStreamView.this;
                if (groupLiveStreamView2.f62237J1 == 6) {
                    groupLiveStreamView2.f62307v1.setVisibility(0);
                    GroupLiveStreamView.this.f62308w1.setVisibility(4);
                    GroupLiveStreamView groupLiveStreamView3 = GroupLiveStreamView.this;
                    groupLiveStreamView3.f62259V1 = ((((groupLiveStreamView3.f62257U1 - i11) - AbstractC23136l9.m118742r(46.0f)) - GroupLiveStreamView.this.f62298p1.getHeight()) - ((RelativeLayout.LayoutParams) GroupLiveStreamView.this.f62298p1.getLayoutParams()).topMargin) - AbstractC23136l9.m118742r(16.0f);
                    GroupLiveStreamView groupLiveStreamView4 = GroupLiveStreamView.this;
                    int i12 = groupLiveStreamView4.f62259V1;
                    int i13 = GroupLiveStreamView.f62227s2;
                    if (i12 > i13) {
                        groupLiveStreamView4.f62259V1 = i13;
                    }
                    groupLiveStreamView4.m66448XM();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$c */
    /* loaded from: classes5.dex */
    class C11937c extends RecyclerView.AbstractC1892s {
        C11937c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            super.mo952b(recyclerView, i11);
            try {
                C11944a c11944a = GroupLiveStreamView.this.f62310y1;
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c11944a.m66471R(z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$d */
    /* loaded from: classes5.dex */
    class C11938d extends AbstractRunnableC25943g {
        C11938d() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if (C32252b.m155705e().m155709b() || C32252b.m155705e().m155708a()) {
                C18373b.m97334c().m97346m();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$e */
    /* loaded from: classes5.dex */
    public class C11939e implements InterfaceC20094a {
        C11939e() {
        }

        /* renamed from: d */
        public /* synthetic */ void m66464d() {
            if (!GroupLiveStreamView.this.f62291l2) {
                GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                groupLiveStreamView.m66455uM(groupLiveStreamView.f62244O0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str;
            try {
                GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                if (c20096c != null) {
                    str = AbstractC23161o1.m119318c(c20096c.m104491c(), c20096c.m104492d());
                } else {
                    str = "";
                }
                groupLiveStreamView.m66454tM(11, str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupLiveStreamView.this.f62244O0 = new C32062p5((JSONObject) obj);
                GroupLiveStreamView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.f0
                    public /* synthetic */ RunnableC11955f0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamView.C11939e.this.m66464d();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$f */
    /* loaded from: classes5.dex */
    class HandlerC11940f extends Handler {
        HandlerC11940f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                int i11 = 0;
                switch (message.what) {
                    case 1:
                        GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                        groupLiveStreamView.f62237J1 = 2;
                        if (groupLiveStreamView.f62287j2 <= 0) {
                            groupLiveStreamView.f62284i1.setVisibility(8);
                            GroupLiveStreamView.this.f62300q1.setVisibility(8);
                            GroupLiveStreamView.this.f62289k2.sendEmptyMessage(6);
                            return;
                        }
                        groupLiveStreamView.f62284i1.setText("" + GroupLiveStreamView.this.f62287j2);
                        GroupLiveStreamView groupLiveStreamView2 = GroupLiveStreamView.this;
                        groupLiveStreamView2.f62287j2 = groupLiveStreamView2.f62287j2 - 1;
                        groupLiveStreamView2.f62289k2.sendEmptyMessageDelayed(1, 1000L);
                        return;
                    case 2:
                    case 10:
                    default:
                        return;
                    case 3:
                        GroupLiveStreamView groupLiveStreamView3 = GroupLiveStreamView.this;
                        groupLiveStreamView3.f62237J1 = 3;
                        groupLiveStreamView3.f62298p1.setVisibility(0);
                        GroupLiveStreamView.this.f62286j1.setVisibility(0);
                        GroupLiveStreamView.this.f62300q1.setVisibility(0);
                        GroupLiveStreamView.this.f62274d1.setVisibility(0);
                        GroupLiveStreamView.this.f62286j1.setVisibility(0);
                        GroupLiveStreamView.this.f62270b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.ls_preparing));
                        GroupLiveStreamView.this.f62282h1.setVisibility(4);
                        return;
                    case 4:
                        GroupLiveStreamView groupLiveStreamView4 = GroupLiveStreamView.this;
                        groupLiveStreamView4.f62237J1 = 4;
                        groupLiveStreamView4.f62298p1.setVisibility(0);
                        GroupLiveStreamView.this.f62274d1.setVisibility(0);
                        GroupLiveStreamView.this.f62286j1.setVisibility(8);
                        GroupLiveStreamView.this.f62302r1.setVisibility(0);
                        AbstractC2379w.m12430d(GroupLiveStreamView.this.f62306u1);
                        return;
                    case 5:
                        GroupLiveStreamView groupLiveStreamView5 = GroupLiveStreamView.this;
                        groupLiveStreamView5.f62237J1 = 5;
                        groupLiveStreamView5.f62300q1.setVisibility(0);
                        GroupLiveStreamView.this.f62241M1 = AbstractC23136l9.m118743r0(AbstractC8020f0.ls_error_unknow);
                        Object obj = message.obj;
                        if (obj != null) {
                            GroupLiveStreamView.this.f62241M1 = (String) obj;
                        }
                        GroupLiveStreamView.this.f62274d1.setVisibility(4);
                        GroupLiveStreamView.this.f62286j1.setVisibility(8);
                        GroupLiveStreamView.this.f62298p1.setVisibility(8);
                        GroupLiveStreamView.this.f62296o1.setVisibility(8);
                        GroupLiveStreamView.this.f62289k2.removeMessages(8);
                        GroupLiveStreamView.this.f72421L0.removeDialog(1);
                        GroupLiveStreamView.this.f72421L0.showDialog(1);
                        return;
                    case 6:
                        GroupLiveStreamView groupLiveStreamView6 = GroupLiveStreamView.this;
                        groupLiveStreamView6.f62237J1 = 6;
                        if (groupLiveStreamView6.f62248Q0 == 0) {
                            groupLiveStreamView6.f62248Q0 = System.currentTimeMillis();
                        }
                        GroupLiveStreamView.this.f62274d1.setVisibility(0);
                        GroupLiveStreamView.this.f62300q1.setVisibility(8);
                        GroupLiveStreamView.this.f62298p1.setVisibility(0);
                        GroupLiveStreamView.this.f62286j1.setVisibility(8);
                        GroupLiveStreamView.this.f62302r1.setVisibility(8);
                        GroupLiveStreamView.this.f62290l1.setVisibility(0);
                        GroupLiveStreamView.this.f62235H1.setVisibility(0);
                        GroupLiveStreamView.this.f62272c1.setVisibility(0);
                        GroupLiveStreamView.this.f62309x1.setVisibility(0);
                        GroupLiveStreamView.this.f62308w1.setVisibility(0);
                        GroupLiveStreamView.this.f62289k2.removeMessages(8);
                        GroupLiveStreamView.this.f62289k2.sendEmptyMessage(8);
                        GroupLiveStreamView.this.f62246P0 = AbstractC23306f.m120584H0().m2640w("livestream_" + GroupLiveStreamView.this.f62244O0.f147627b);
                        GroupLiveStreamView groupLiveStreamView7 = GroupLiveStreamView.this;
                        groupLiveStreamView7.f62310y1.m66470Q(groupLiveStreamView7.f62246P0);
                        GroupLiveStreamView.this.f62310y1.m66467N();
                        GroupLiveStreamView.this.m66448XM();
                        GroupLiveStreamView.this.m66442PM();
                        C32252b.m155705e().m155713h();
                        return;
                    case 7:
                        GroupLiveStreamView.this.f62304s1.setVisibility(8);
                        GroupLiveStreamView.this.m66441OM();
                        GroupLiveStreamView.this.f72421L0.finish();
                        C32252b.m155705e().m155711d();
                        return;
                    case 8:
                        if (GroupLiveStreamView.this.f72421L0.m92674mJ() && !GroupLiveStreamView.this.f72421L0.mo60294yp() && GroupLiveStreamView.this.f72421L0.m92676n2() != null && !GroupLiveStreamView.this.f72421L0.m92676n2().isFinishing()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            GroupLiveStreamView groupLiveStreamView8 = GroupLiveStreamView.this;
                            long j11 = currentTimeMillis - groupLiveStreamView8.f62248Q0;
                            groupLiveStreamView8.f62294n1.setText(AbstractC23185q3.m119472d(j11));
                            GroupLiveStreamView groupLiveStreamView9 = GroupLiveStreamView.this;
                            if (j11 >= groupLiveStreamView9.f62244O0.f147629d * 1000) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ls_video_exceeds_max_duration));
                                GroupLiveStreamView.this.m66451qM();
                                return;
                            } else {
                                groupLiveStreamView9.f62289k2.sendEmptyMessageDelayed(8, 1000L);
                                return;
                            }
                        }
                        return;
                    case 9:
                        GroupLiveStreamView groupLiveStreamView10 = GroupLiveStreamView.this;
                        groupLiveStreamView10.f62237J1 = 9;
                        groupLiveStreamView10.f62300q1.setVisibility(0);
                        GroupLiveStreamView.this.f62286j1.setVisibility(0);
                        GroupLiveStreamView.this.f62282h1.setVisibility(0);
                        GroupLiveStreamView.this.f62302r1.setVisibility(8);
                        GroupLiveStreamView.this.f62270b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.ls_retry));
                        GroupLiveStreamView.this.f62274d1.setVisibility(4);
                        GroupLiveStreamView.this.f62296o1.setVisibility(8);
                        GroupLiveStreamView.this.f62284i1.setVisibility(8);
                        GroupLiveStreamView.this.f62289k2.removeMessages(1);
                        return;
                    case 11:
                        if (GroupLiveStreamView.this.f72421L0.m92674mJ()) {
                            GroupLiveStreamView groupLiveStreamView11 = GroupLiveStreamView.this;
                            if (groupLiveStreamView11.f62309x1 != null && groupLiveStreamView11.f62310y1 != null) {
                                int m9740Y1 = groupLiveStreamView11.f62229B1.m9740Y1();
                                View mo9732P = GroupLiveStreamView.this.f62229B1.mo9732P(m9740Y1);
                                if (mo9732P != null) {
                                    i11 = (mo9732P.getTop() - GroupLiveStreamView.this.f62229B1.m10136l0(mo9732P)) - GroupLiveStreamView.this.f62309x1.getPaddingTop();
                                }
                                GroupLiveStreamView.this.f62310y1.m66467N();
                                if (mo9732P != null) {
                                    GroupLiveStreamView.this.f62229B1.m9721B2(m9740Y1, i11);
                                }
                                GroupLiveStreamView.this.m66446UM();
                                return;
                            }
                            return;
                        }
                        return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$g */
    /* loaded from: classes5.dex */
    public class C11941g implements InterfaceC20094a {
        C11941g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$h */
    /* loaded from: classes5.dex */
    class RunnableC11942h implements Runnable {
        RunnableC11942h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (GroupLiveStreamView.this.f62306u1.getText().length() > 0) {
                    GroupLiveStreamView.this.m66445TM();
                    GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                    groupLiveStreamView.f62289k2.postDelayed(groupLiveStreamView.f62297o2, 50L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamView$i */
    /* loaded from: classes5.dex */
    public class C11943i extends AbstractC31727b {
        C11943i() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            GroupLiveStreamView.this.m66450cl(str);
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    GroupLiveStreamView groupLiveStreamView = GroupLiveStreamView.this;
                    groupLiveStreamView.f62289k2.postDelayed(groupLiveStreamView.f62297o2, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    GroupLiveStreamView groupLiveStreamView2 = GroupLiveStreamView.this;
                    groupLiveStreamView2.f62289k2.removeCallbacks(groupLiveStreamView2.f62297o2);
                    GroupLiveStreamView.this.m66445TM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    static {
        AbstractC3096i0.m15525Z();
    }

    /* renamed from: AM */
    public /* synthetic */ void m66408AM() {
        try {
            this.f62236I1.m36690L(this.f62253S1);
            this.f62292m1.setText(String.valueOf(this.f62253S1.size()));
            C11944a c11944a = this.f62310y1;
            if (c11944a != null) {
                c11944a.m66467N();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ void m66409BM() {
        try {
            this.f62236I1.m36690L(this.f62253S1);
            this.f62292m1.setText(String.valueOf(this.f62253S1.size()));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CM */
    public /* synthetic */ void m66410CM() {
        m66441OM();
        this.f72421L0.finish();
    }

    /* renamed from: DM */
    public /* synthetic */ void m66411DM() {
        m66441OM();
        this.f72421L0.finish();
    }

    /* renamed from: EM */
    public /* synthetic */ void m66412EM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        m66441OM();
        this.f72421L0.finish();
    }

    /* renamed from: FM */
    public /* synthetic */ void m66413FM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        if (this.f62237J1 == 6) {
            m66451qM();
        } else {
            m66441OM();
            this.f72421L0.finish();
        }
    }

    /* renamed from: GM */
    public /* synthetic */ void m66414GM(View view) {
        LinearLayout linearLayout;
        int i11;
        if (this.f62277e2 && (linearLayout = this.f62258V0) != null) {
            if (linearLayout.getVisibility() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }
    }

    /* renamed from: HM */
    public /* synthetic */ boolean m66415HM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6 || i11 == 4) {
            m66443QM();
            return false;
        }
        return false;
    }

    /* renamed from: IM */
    public /* synthetic */ boolean m66416IM(View view, MotionEvent motionEvent) {
        if (this.f62309x1.m9893m0(motionEvent.getX(), motionEvent.getY()) == null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && m66437xM(this.f62281g2, motionEvent.getX(), this.f62283h2, motionEvent.getY())) {
                    AbstractC2379w.m12430d(this.f62305t1);
                    AbstractC2379w.m12430d(this.f62306u1);
                    return false;
                }
                return false;
            }
            this.f62281g2 = motionEvent.getX();
            this.f62283h2 = motionEvent.getY();
            return false;
        }
        return false;
    }

    /* renamed from: JM */
    public /* synthetic */ boolean m66417JM(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3 || action == 6) {
                this.f62265Y1 = false;
            }
        } else {
            this.f62265Y1 = true;
        }
        return false;
    }

    /* renamed from: KM */
    public /* synthetic */ void m66418KM() {
        SurfaceViewRenderer surfaceViewRenderer = this.f62242N0;
        if (surfaceViewRenderer != null) {
            this.f62267Z1 = surfaceViewRenderer.getWidth();
            this.f62269a2 = this.f62242N0.getHeight();
        }
    }

    /* renamed from: LM */
    public /* synthetic */ void m66419LM() {
        if (this.f62268a1 != null && !mo66383c8()) {
            this.f62268a1.m88295A();
            this.f62268a1.requestLayout();
            this.f62268a1.m88316z();
            m66449YM();
            this.f62289k2.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.s
                public /* synthetic */ RunnableC11968s() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupLiveStreamView.this.m66418KM();
                }
            });
        }
    }

    /* renamed from: MM */
    public /* synthetic */ void m66420MM() {
        float f11;
        try {
            float width = this.f62256U0.getWidth();
            float height = this.f62256U0.getHeight();
            float f12 = width / height;
            float m118731n0 = AbstractC23136l9.m118731n0(this.f72421L0.m92648SI()) / 2;
            float m118719j0 = AbstractC23136l9.m118719j0(this.f72421L0.m92648SI()) / 4;
            if (f12 < m118731n0 / m118719j0) {
                f11 = m118719j0 / height;
            } else {
                f11 = m118731n0 / width;
            }
            this.f62268a1.setMinimizeScale(f11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: SM */
    private void m66421SM(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: WM */
    private void m66422WM() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f62233F1 = (StickerPanelView) m92996E0;
        }
        if (this.f62233F1 != null) {
            m66436wM();
        }
    }

    /* renamed from: wM */
    private void m66436wM() {
        this.f62233F1.m72709oO(new C11943i());
    }

    /* renamed from: xM */
    private boolean m66437xM(float f11, float f12, float f13, float f14) {
        float abs = Math.abs(f11 - f12);
        float abs2 = Math.abs(f13 - f14);
        if (abs <= 8.0f && abs2 <= 8.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: zM */
    private boolean m66438zM() {
        return this.f62295n2 != 0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (!C8937j0.m47663l("csc_attachment_live_stream")) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_camera_block_title));
                finish();
            }
            if (!C8937j0.m47663l("micro_csc_attachment_livestream")) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_micro_block_title));
                finish();
            }
            this.f72421L0.m92676n2().getWindow().addFlags(128);
            if (this.f72421L0.m92676n2() != null) {
                AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
            }
            this.f62257U1 = AbstractC23136l9.m118713h0();
            if (bundle != null) {
                this.f62279f2 = true;
                this.f72421L0.finish();
            } else if (this.f72421L0.m92642L3() != null) {
                this.f62250R0 = this.f72421L0.m92642L3().getBoolean("EXTRA_MINIMIZE", true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                try {
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(7);
                    aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ls_confirm_finish));
                    aVar.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                    aVar.m43169r(AbstractC8020f0.str_end_ls_confirm_dialog_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.group.livestream.r
                        public /* synthetic */ C11967r() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            GroupLiveStreamView.this.m66413FM(interfaceC17463d, i12);
                        }
                    });
                    return aVar.m43152a();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return null;
                }
            }
            return null;
        }
        try {
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            aVar2.m43159h(4);
            aVar2.m43155d(false);
            aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.ls_can_not_live_title));
            String str = this.f62241M1;
            if (str == null) {
                str = "";
            }
            aVar2.m43162k(str);
            aVar2.m43169r(AbstractC8020f0.ls_ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.group.livestream.c0
                public /* synthetic */ C11949c0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    GroupLiveStreamView.this.m66412EM(interfaceC17463d, i12);
                }
            });
            C8009j m43152a = aVar2.m43152a();
            this.f62271b2 = m43152a;
            return m43152a;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            return null;
        }
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: Ef */
    public void mo66395Ef(float f11, float f12) {
        if (Build.VERSION.SDK_INT < 24) {
            this.f62242N0.scale(f11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_live_stream_view, viewGroup, false);
        this.f62254T0 = inflate;
        if (this.f62279f2) {
            return inflate;
        }
        this.f62231D1 = (RelativeLayout) inflate.findViewById(AbstractC6918a0.top_view);
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) this.f62254T0.findViewById(AbstractC6918a0.ll_backgroundmain);
        this.f62232E1 = keyboardFrameLayout;
        keyboardFrameLayout.setTopViewGroup(this.f62231D1);
        this.f62232E1.setOnKeyboardListener(new C11936b());
        this.f62252S0 = new C23528a(this.f72421L0.m92648SI());
        this.f62273c2 = EglBase.create();
        this.f62275d2 = new C18374c();
        SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) this.f62254T0.findViewById(AbstractC6918a0.live_render_widown);
        this.f62242N0 = surfaceViewRenderer;
        surfaceViewRenderer.init(this.f62273c2.getEglBaseContext());
        this.f62242N0.setZOrderMediaOverlay(true);
        this.f62242N0.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        this.f62242N0.setMirror(this.f62239L1);
        this.f62242N0.requestLayout();
        this.f62256U0 = (ViewGroup) this.f62254T0.findViewById(AbstractC6918a0.layout_main_render);
        this.f62258V0 = (LinearLayout) this.f62254T0.findViewById(AbstractC6918a0.layout_debug);
        this.f62260W0 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.text_view_bandwidth);
        this.f62262X0 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.text_view_packet_rate);
        this.f62264Y0 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.text_view_bwe);
        this.f62266Z0 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.text_view_coding);
        this.f62286j1 = this.f62254T0.findViewById(AbstractC6918a0.rl_status);
        this.f62270b1 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.tv_status);
        this.f62272c1 = (ImageView) this.f62254T0.findViewById(AbstractC6918a0.img_close);
        this.f62274d1 = (ImageView) this.f62254T0.findViewById(AbstractC6918a0.img_switch_camera);
        this.f62276e1 = (ProgressBar) this.f62254T0.findViewById(AbstractC6918a0.progress_bar);
        this.f62278f1 = (ImageView) this.f62254T0.findViewById(AbstractC6918a0.img_golive);
        this.f62280g1 = (Button) this.f62254T0.findViewById(AbstractC6918a0.btn_golive);
        this.f62282h1 = (Button) this.f62254T0.findViewById(AbstractC6918a0.btn_cancel);
        this.f62284i1 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.tv_count_down);
        this.f62288k1 = (ImageView) this.f62254T0.findViewById(AbstractC6918a0.img_minimize);
        this.f62294n1 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.tv_duration);
        this.f62292m1 = (TextView) this.f62254T0.findViewById(AbstractC6918a0.tv_viewed);
        this.f62296o1 = (Button) this.f62254T0.findViewById(AbstractC6918a0.btn_finish);
        View findViewById = this.f62254T0.findViewById(AbstractC6918a0.ln_state);
        this.f62290l1 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.group.livestream.q
                public /* synthetic */ ViewOnClickListenerC11966q() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupLiveStreamView.this.m66414GM(view);
                }
            });
        }
        this.f62298p1 = this.f62254T0.findViewById(AbstractC6918a0.rl_function);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC17484n.Companion.m92931b(), 0, 0);
        this.f62298p1.setLayoutParams(layoutParams);
        this.f62300q1 = this.f62254T0.findViewById(AbstractC6918a0.overlay);
        this.f62304s1 = this.f62254T0.findViewById(AbstractC6918a0.rl_ended_ls);
        this.f62302r1 = this.f62254T0.findViewById(AbstractC6918a0.rl_golive);
        this.f62311z1 = this.f62254T0.findViewById(AbstractC6918a0.rl_ui_views);
        ImageButton imageButton = (ImageButton) this.f62254T0.findViewById(AbstractC6918a0.btn_live_msg_send);
        this.f62228A1 = imageButton;
        imageButton.setEnabled(false);
        this.f62230C1 = this.f62254T0.findViewById(AbstractC6918a0.rl_chat_container);
        this.f62228A1.setOnClickListener(this);
        this.f62280g1.setOnClickListener(this);
        this.f62272c1.setOnClickListener(this);
        this.f62274d1.setOnClickListener(this);
        this.f62296o1.setOnClickListener(this);
        this.f62288k1.setOnClickListener(this);
        this.f62282h1.setOnClickListener(this);
        View findViewById2 = this.f62254T0.findViewById(AbstractC6918a0.ll_input_live_chat);
        this.f62308w1 = findViewById2;
        findViewById2.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(100.0f), AbstractC23136l9.m118742r(36.0f));
        layoutParams2.setMargins(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), 0, 0);
        layoutParams2.addRule(12);
        this.f62308w1.setLayoutParams(layoutParams2);
        this.f62307v1 = this.f62254T0.findViewById(AbstractC6918a0.live_stream_send_message_layout);
        this.f62305t1 = (RobotoTextView) this.f62254T0.findViewById(AbstractC6918a0.input_chat);
        ActionEditText actionEditText = (ActionEditText) this.f62254T0.findViewById(AbstractC6918a0.edit_input);
        this.f62306u1 = actionEditText;
        actionEditText.addTextChangedListener(this);
        this.f62306u1.setOnClickListener(this);
        this.f62306u1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.group.livestream.u
            public /* synthetic */ C11970u() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m66415HM;
                m66415HM = GroupLiveStreamView.this.m66415HM(textView, i11, keyEvent);
                return m66415HM;
            }
        });
        ImageView imageView = (ImageView) this.f62254T0.findViewById(AbstractC6918a0.ic_emoji);
        this.f62234G1 = imageView;
        imageView.setOnClickListener(this);
        this.f62309x1 = (TouchListView) this.f62254T0.findViewById(AbstractC6918a0.lv_chat);
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(this.f72421L0.m92648SI(), 1, false);
        this.f62229B1 = smoothScrollLinearLayoutManager;
        smoothScrollLinearLayoutManager.m9723C2(1);
        this.f62229B1.mo9649E2(true);
        this.f62309x1.setLayoutManager(this.f62229B1);
        this.f62309x1.setOverScrollMode(2);
        this.f62309x1.m9826E(new C11937c());
        this.f62309x1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.group.livestream.v
            public /* synthetic */ ViewOnTouchListenerC11971v() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m66416IM;
                m66416IM = GroupLiveStreamView.this.m66416IM(view, motionEvent);
                return m66416IM;
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f62254T0.findViewById(AbstractC6918a0.rv_user_seen);
        this.f62235H1 = recyclerView;
        recyclerView.setOverScrollMode(2);
        this.f62235H1.setItemAnimator(null);
        this.f62235H1.setLayoutAnimation(null);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f62254T0.getContext());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f62235H1.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        this.f62235H1.m9816A(new C7221t9(AbstractC23136l9.m118742r(4.0f)));
        C7210s9 c7210s9 = new C7210s9(this.f72421L0.m92648SI(), new ArrayList());
        this.f62236I1 = c7210s9;
        this.f62235H1.setAdapter(c7210s9);
        C11944a c11944a = new C11944a(this.f72421L0.m92648SI());
        this.f62310y1 = c11944a;
        this.f62309x1.setAdapter(c11944a);
        this.f62309x1.setVisibility(8);
        this.f62307v1.setVisibility(8);
        this.f62308w1.setVisibility(8);
        ImageView imageView2 = (ImageView) this.f62254T0.findViewById(AbstractC6918a0.btn_emoji);
        imageView2.setImageResource(AbstractC16803z.icon_viewfull_kb_emoticon);
        imageView2.setOnClickListener(this);
        DraggableView draggableView = (DraggableView) this.f62254T0.findViewById(AbstractC6918a0.draggable_view);
        this.f62268a1 = draggableView;
        draggableView.setAllowDrag(this.f62250R0);
        DraggableView draggableView2 = this.f62268a1;
        draggableView2.f83721g0 = false;
        draggableView2.setDraggableListener(this);
        this.f62268a1.f83730x = AbstractC23136l9.m118742r(2.0f);
        this.f62268a1.f83729w = AbstractC23136l9.m118742r(2.0f) + AbstractC23136l9.m118655I(AbstractC16802y.abs__action_bar_default_height);
        this.f62268a1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.group.livestream.w
            public /* synthetic */ ViewOnTouchListenerC11972w() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m66417JM;
                m66417JM = GroupLiveStreamView.this.m66417JM(view, motionEvent);
                return m66417JM;
            }
        });
        m66449YM();
        ArrayList<View> arrayList = new ArrayList<>();
        View findViewById3 = this.f62254T0.findViewById(AbstractC6918a0.sticker_panel_container);
        if (findViewById3 != null) {
            arrayList.add(findViewById3);
        }
        this.f62232E1.setBottomViewsGroup(arrayList);
        return this.f62254T0;
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: Gn */
    public void mo66396Gn() {
        m66441OM();
        this.f72421L0.finish();
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: H5 */
    public void mo66397H5() {
        String str;
        try {
            if (!this.f62238K1 && this.f62237J1 == 6) {
                if (this.f62295n2 == 0) {
                    int i11 = 0;
                    boolean z11 = !this.f62301q2;
                    this.f62301q2 = z11;
                    if (z11) {
                        str = "10008208";
                    } else {
                        str = "10008207";
                    }
                    AbstractC23647d.m123906p(str);
                    AbstractC23647d.m123893c();
                    View view = this.f62311z1;
                    if (!this.f62301q2) {
                        i11 = 8;
                    }
                    view.setVisibility(i11);
                }
                AbstractC2379w.m12430d(this.f62305t1);
                AbstractC2379w.m12430d(this.f62306u1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        try {
            m66441OM();
            this.f72421L0.m92676n2().getWindow().clearFlags(128);
            this.f62271b2 = null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: Ir */
    public void mo66398Ir() {
        m66441OM();
        this.f72421L0.finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 32);
        C23744a.m124114c().m124117e(this, 33);
        C23744a.m124114c().m124117e(this, 34);
        C23744a.m124114c().m124117e(this, 35);
        C23744a.m124114c().m124117e(this, 27);
        C23744a.m124114c().m124117e(this, 42);
        C23744a.m124114c().m124117e(this, 10037);
        C23744a.m124114c().m124117e(this, 160);
    }

    /* renamed from: Ka */
    public void m66439Ka(int i11) {
        this.f62295n2 = i11;
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        try {
            int i12 = this.f62295n2;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        AbstractC2379w.m12430d(this.f62306u1);
                        this.f62234G1.setImageResource(AbstractC16803z.icon_viewfull_kb_keyboard);
                        this.f62232E1.setPaddingBottom(m122007i5);
                        this.f62232E1.requestLayout();
                        if (this.f62250R0) {
                            this.f62268a1.setAllowDrag(false);
                        }
                        this.f62288k1.setVisibility(8);
                        this.f62296o1.setVisibility(8);
                        if (this.f62233F1 == null) {
                            m66456vM(m122007i5);
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                        }
                        m66421SM(this.f62233F1, true);
                        return;
                    }
                    return;
                }
                m66421SM(this.f62233F1, false);
                this.f62234G1.setImageResource(AbstractC16803z.icon_viewfull_kb_emoticon);
                this.f62232E1.setPaddingBottom(m122007i5);
                this.f62232E1.requestLayout();
                AbstractC2379w.m12432f(this.f62306u1);
                if (this.f62250R0) {
                    this.f62268a1.setAllowDrag(false);
                }
                this.f62288k1.setVisibility(8);
                this.f62296o1.setVisibility(8);
                return;
            }
            if (this.f62250R0) {
                this.f62268a1.setAllowDrag(true);
            }
            AbstractC2379w.m12430d(this.f62306u1);
            m66421SM(this.f62233F1, false);
            this.f62234G1.setSelected(false);
            this.f62307v1.setVisibility(8);
            this.f62234G1.setImageResource(AbstractC16803z.icon_viewfull_kb_emoticon);
            int i13 = this.f62237J1;
            if (i13 == 6 || i13 == 9) {
                this.f62309x1.setVisibility(0);
                this.f62308w1.setVisibility(0);
            }
            this.f62232E1.setPaddingBottom(0);
            this.f62232E1.requestLayout();
            m66448XM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: NM */
    public void m66440NM() {
        try {
            this.f62268a1.m88313w();
            this.f62265Y1 = false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: OM */
    void m66441OM() {
        try {
            if (this.f62291l2) {
                return;
            }
            this.f62291l2 = true;
            String m97337d = C18373b.m97334c().m97337d(this.f62244O0.f147627b);
            SurfaceViewRenderer surfaceViewRenderer = this.f62242N0;
            if (surfaceViewRenderer != null) {
                surfaceViewRenderer.finishRender();
            }
            C18373b.m97334c().m97335a();
            C18373b.m97334c().m97336b();
            m66447VM(m97337d);
            C21965i c21965i = this.f62240M0;
            if (c21965i != null && c21965i.m114696B()) {
                this.f62240M0.m114697N();
            }
            C7853b.m40052a0().m40128g();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: PM */
    void m66442PM() {
        try {
            TouchListView touchListView = this.f62309x1;
            if (touchListView != null) {
                touchListView.m76952y2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            this.f72421L0.finish();
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QM */
    void m66443QM() {
        try {
            String trim = this.f62306u1.getText().toString().trim();
            if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(this.f62243N1) && !TextUtils.isEmpty(this.f62244O0.f147627b)) {
                AbstractC23112j7.m118518a0(this.f62243N1, trim, this.f62244O0.f147627b);
                this.f62306u1.setText("");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (this.f62279f2) {
            return;
        }
        try {
            C18373b.m97334c().m97344k();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: RM */
    void m66444RM() {
        this.f62286j1.setVisibility(8);
        this.f62302r1.setVisibility(8);
        this.f62284i1.setVisibility(0);
        this.f62287j2 = 3;
        this.f62289k2.sendEmptyMessage(1);
    }

    /* renamed from: TM */
    void m66445TM() {
        try {
            ActionEditText actionEditText = this.f62306u1;
            if (actionEditText != null) {
                actionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f62306u1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            if (!C32252b.m155705e().m155708a() && !C32252b.m155705e().m155709b()) {
                return;
            }
            HandlerC32324p.m156352e(new C11938d(), ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: UM */
    void m66446UM() {
        try {
            TouchListView touchListView = this.f62309x1;
            if (touchListView != null) {
                touchListView.m76951x2(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: VM */
    void m66447VM(String str) {
        if (!C23055e5.m118271f()) {
            return;
        }
        String m132089n = AbstractC25495a.m132089n(this.f62243N1);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11941g());
        c0766k.mo1486M8(m132089n, str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                this.f72421L0.m92676n2().mo35554O(18);
            }
            View view = this.f62254T0;
            if (view != null) {
                view.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.b0
                    public /* synthetic */ RunnableC11947b0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamView.this.m66419LM();
                    }
                });
            }
        }
    }

    /* renamed from: XM */
    void m66448XM() {
        int i11;
        try {
            if (this.f62295n2 == 0) {
                i11 = f62227s2;
            } else {
                i11 = this.f62259V1;
            }
            TouchListView touchListView = this.f62309x1;
            if (touchListView != null && this.f62310y1 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) touchListView.getLayoutParams();
                layoutParams.height = i11;
                layoutParams.addRule(2, this.f62308w1.getId());
                this.f62309x1.setLayoutParams(layoutParams);
                this.f62309x1.m76952y2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: YM */
    public void m66449YM() {
        this.f62256U0.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.t
            public /* synthetic */ RunnableC11969t() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupLiveStreamView.this.m66420MM();
            }
        });
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.length() > this.f62299p2) {
            this.f62306u1.setText(this.f62306u1.getText().toString().trim().substring(0, this.f62299p2));
            this.f62306u1.setSelection(this.f62299p2);
        }
        C28652r.m143349v().m143361W(editable);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: bK */
    public void mo39045bK(boolean z11) {
        super.mo39045bK(z11);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // com.zing.zalo.zview.ZaloView.InterfaceC17423h
    /* renamed from: c8 */
    public boolean mo66383c8() {
        return this.f62238K1;
    }

    /* renamed from: cl */
    public void m66450cl(String str) {
        char charAt;
        try {
            ActionEditText actionEditText = this.f62306u1;
            if (actionEditText != null && (this.f62299p2 - actionEditText.length()) - str.length() >= 0) {
                StringBuilder sb2 = new StringBuilder();
                int selectionEnd = this.f62306u1.getSelectionEnd();
                StringBuffer stringBuffer = new StringBuffer(this.f62306u1.getText().toString());
                if (selectionEnd == this.f62306u1.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                    if (selectionEnd > 0 && (charAt = this.f62306u1.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                        sb2.append(" ");
                        sb2.append(str);
                    }
                    if (selectionEnd == this.f62306u1.getText().length()) {
                        if (sb2.length() == 0) {
                            sb2.append(str);
                            sb2.append(" ");
                        } else {
                            sb2.append(" ");
                        }
                    }
                    if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                        str = sb2.toString();
                    }
                    ActionEditText actionEditText2 = this.f62306u1;
                    if (actionEditText2 != null && (this.f62299p2 - actionEditText2.length()) - str.length() >= 0) {
                        stringBuffer.insert(selectionEnd, str);
                        this.f62306u1.setText(stringBuffer.toString());
                        this.f62306u1.setSelection(selectionEnd + str.length());
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                    return;
                }
                stringBuffer.insert(selectionEnd, str);
                this.f62306u1.setText(stringBuffer.toString());
                this.f62306u1.setSelection(selectionEnd + str.length());
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: f2 */
    public void mo66399f2() {
        this.f72421L0.m92662fJ().m93094z(true);
        this.f62274d1.setEnabled(false);
        this.f62311z1.setVisibility(8);
        if (this.f72421L0.m92676n2() != null) {
            AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
        }
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: g7 */
    public void mo66400g7() {
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupLiveStreamView";
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: hE */
    public void mo66401hE() {
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: n1 */
    public void mo66402n1() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        this.f62263X1 = true;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str) {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:            r7 = "10008102";     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x000e, B:9:0x0016, B:11:0x001b, B:13:0x001f, B:17:0x003c, B:19:0x0041, B:21:0x0047, B:25:0x004e, B:26:0x0059, B:28:0x0054, B:29:0x0063, B:31:0x0067, B:33:0x006e, B:35:0x0072, B:37:0x0081, B:39:0x0086, B:41:0x008a, B:45:0x008f, B:47:0x0093, B:48:0x0098, B:55:0x00b6, B:56:0x00cf, B:58:0x00d8, B:59:0x00dd, B:61:0x00e4, B:63:0x00ea, B:67:0x00db, B:71:0x00c1, B:75:0x00cc, B:78:0x00f1, B:80:0x00f5, B:83:0x00fa, B:85:0x0100, B:88:0x0106, B:90:0x010a, B:92:0x010e, B:94:0x0112, B:96:0x0116, B:97:0x0119, B:99:0x0122, B:101:0x0126, B:103:0x012a, B:106:0x012e, B:108:0x0132, B:110:0x013a, B:112:0x013f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x000e, B:9:0x0016, B:11:0x001b, B:13:0x001f, B:17:0x003c, B:19:0x0041, B:21:0x0047, B:25:0x004e, B:26:0x0059, B:28:0x0054, B:29:0x0063, B:31:0x0067, B:33:0x006e, B:35:0x0072, B:37:0x0081, B:39:0x0086, B:41:0x008a, B:45:0x008f, B:47:0x0093, B:48:0x0098, B:55:0x00b6, B:56:0x00cf, B:58:0x00d8, B:59:0x00dd, B:61:0x00e4, B:63:0x00ea, B:67:0x00db, B:71:0x00c1, B:75:0x00cc, B:78:0x00f1, B:80:0x00f5, B:83:0x00fa, B:85:0x0100, B:88:0x0106, B:90:0x010a, B:92:0x010e, B:94:0x0112, B:96:0x0116, B:97:0x0119, B:99:0x0122, B:101:0x0126, B:103:0x012a, B:106:0x012e, B:108:0x0132, B:110:0x013a, B:112:0x013f), top: B:1:0x0000 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        int i11;
        String str;
        String str2;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ic_emoji) {
                if (this.f62295n2 == 2) {
                    m66439Ka(1);
                    return;
                } else {
                    m66439Ka(2);
                    return;
                }
            }
            if (id2 == AbstractC6918a0.btn_golive) {
                AbstractC23647d.m123906p("10008104");
                AbstractC23647d.m123893c();
                m66444RM();
                int m97354u = C18373b.m97334c().m97354u();
                if (m97354u != EnumC17862u.SUCCESS.m94384b()) {
                    m66453sM(m97354u);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.img_close) {
                int i12 = this.f62237J1;
                if (i12 != 3 && i12 != 4) {
                    AbstractC23647d.m123906p("10008105");
                    AbstractC23647d.m123893c();
                    this.f72421L0.showDialog(2);
                    return;
                }
                AbstractC23647d.m123906p("10008101");
                AbstractC23647d.m123893c();
                this.f72421L0.showDialog(2);
                return;
            }
            if (id2 == AbstractC6918a0.btn_cancel) {
                this.f72421L0.showDialog(2);
                return;
            }
            if (id2 == AbstractC6918a0.btn_finish) {
                AbstractC23647d.m123906p("10008206");
                AbstractC23647d.m123893c();
                this.f72421L0.showDialog(2);
                return;
            }
            if (id2 == AbstractC6918a0.img_switch_camera) {
                if (!this.f62265Y1 && !this.f62293m2) {
                    if (this.f62250R0) {
                        this.f62268a1.setAllowDrag(false);
                    }
                    this.f62293m2 = true;
                    C18373b.m97334c().m97355v();
                    boolean z11 = !this.f62239L1;
                    this.f62239L1 = z11;
                    int i13 = this.f62237J1;
                    if (i13 != 3 && i13 != 4) {
                        if (i13 == 2) {
                            if (z11) {
                                str2 = "10008106";
                            } else {
                                str2 = "10008107";
                            }
                            AbstractC23647d.m123906p(str2);
                        } else {
                            if (z11) {
                                str = "10008203";
                            } else {
                                str = "10008204";
                            }
                            AbstractC23647d.m123906p(str);
                        }
                        AbstractC23647d.m123893c();
                        ImageView imageView = this.f62274d1;
                        if (!this.f62239L1) {
                            i11 = AbstractC16803z.icon_viewfull_switchcamera_back;
                        } else {
                            i11 = AbstractC16803z.icon_viewfull_switchcamera_front;
                        }
                        imageView.setImageResource(i11);
                        if (!this.f62250R0 && !m66438zM()) {
                            this.f62268a1.setAllowDrag(true);
                            return;
                        }
                        return;
                    }
                    String str3 = "10008103";
                    AbstractC23647d.m123906p(str3);
                    AbstractC23647d.m123893c();
                    ImageView imageView2 = this.f62274d1;
                    if (!this.f62239L1) {
                    }
                    imageView2.setImageResource(i11);
                    if (!this.f62250R0) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (id2 == AbstractC6918a0.img_minimize) {
                if (!this.f62250R0) {
                    return;
                }
                this.f62261W1 = true;
                if (!this.f62251R1) {
                    this.f62268a1.m88314x();
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.btn_live_msg_send) {
                m66443QM();
                return;
            }
            if (id2 == AbstractC6918a0.ll_input_live_chat) {
                View view2 = this.f62307v1;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                this.f62308w1.setVisibility(4);
                m66439Ka(1);
                return;
            }
            if (id2 == AbstractC6918a0.edit_input) {
                if (!this.f62251R1) {
                    m66439Ka(1);
                }
            } else if (id2 == AbstractC6918a0.btn_emoji && this.f72421L0.m92672lJ() && this.f62237J1 == 6) {
                this.f62307v1.setVisibility(0);
                this.f62308w1.setVisibility(4);
                m66439Ka(2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent) || i11 != 4 || this.f62251R1) {
            return true;
        }
        StickerPanelView stickerPanelView = this.f62233F1;
        if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
            m66439Ka(0);
        } else {
            this.f72421L0.showDialog(2);
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f62279f2) {
            return;
        }
        try {
            C18373b.m97334c().m97347n();
            if (this.f62263X1) {
                C18373b.m97334c().m97346m();
                this.f62263X1 = false;
            }
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f62271b2;
            if (keyEventCallbackC17462c != null && !keyEventCallbackC17462c.m92868m()) {
                this.f62271b2.mo13822K();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        boolean z11;
        ImageButton imageButton = this.f62228A1;
        if (imageButton != null) {
            if (this.f62306u1.getText().toString().trim().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            imageButton.setEnabled(z11);
        }
    }

    /* renamed from: qM */
    void m66451qM() {
        this.f62289k2.removeMessages(8);
        this.f62298p1.setVisibility(8);
        this.f62286j1.setVisibility(8);
        this.f62302r1.setVisibility(8);
        this.f62304s1.setVisibility(0);
        this.f62296o1.setVisibility(8);
        this.f62309x1.setVisibility(8);
        this.f62307v1.setVisibility(8);
        this.f62308w1.setVisibility(8);
        this.f62289k2.sendEmptyMessageDelayed(7, 500L);
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: qq */
    public void mo66403qq() {
        try {
            this.f62238K1 = false;
            this.f62301q2 = true;
            this.f62274d1.setEnabled(true);
            this.f62311z1.setVisibility(0);
            if (this.f72421L0.m92662fJ() != null) {
                this.f72421L0.m92662fJ().m93094z(false);
                this.f72421L0.m92662fJ().mo93079r1(false);
            }
            if (C11891a.m66068n0()) {
                C11891a.m66067m0(null).m66075s0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    void m66452rM(String str) {
        int i11;
        this.f62249Q1 = true;
        this.f62289k2.removeMessages(10);
        if (!C23055e5.m118271f()) {
            m66453sM(10);
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11939e());
        String m118332k = AbstractC23059e9.m118332k();
        try {
            i11 = ((ActivityManager) this.f72421L0.m92648SI().getSystemService("activity")).getMemoryClass();
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(m118332k);
            jSONObject.put("Screen_Width", AbstractC23136l9.m118731n0(MainApplication.getAppContext()));
            jSONObject.put("Screen_Height", AbstractC23136l9.m118719j0(MainApplication.getAppContext()));
            jSONObject.put("Heap_Size", i11);
            m118332k = jSONObject.toString();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        c0766k.mo1685m4(str, m118332k);
    }

    /* renamed from: sM */
    void m66453sM(int i11) {
        m66454tM(i11, "");
    }

    /* renamed from: tM */
    void m66454tM(int i11, String str) {
        if (i11 != EnumC17862u.NETWORK_DISCONNECTED.m94384b() && i11 != EnumC17863v.DISCONNECT.m94385b()) {
            if (TextUtils.isEmpty(str)) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.ls_error_unknow);
            }
            if (i11 == 10) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.ls_error_network);
            } else if (i11 == EnumC17862u.SESSION_EXPIRED.m94384b()) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ls_session_expired);
            }
            this.f62289k2.sendMessage(this.f62289k2.obtainMessage(5, str));
            this.f62289k2.removeMessages(8);
            return;
        }
        this.f62289k2.sendEmptyMessage(9);
    }

    /* renamed from: uM */
    void m66455uM(C32062p5 c32062p5) {
        try {
            boolean z11 = true;
            C21965i c21965i = new C21965i(1, "ZRtcWakeLog");
            this.f62240M0 = c21965i;
            c21965i.m114700x();
            int m97348o = C18373b.m97334c().m97348o(MainApplication.getAppContext());
            AbstractC20110a.m104542k(8, "LiveStreamView initPeer setAppContext err=" + m97348o, new Object[0]);
            EnumC17862u enumC17862u = EnumC17862u.SUCCESS;
            if (m97348o != enumC17862u.m94384b()) {
                m66453sM(m97348o);
                return;
            }
            int m97350q = C18373b.m97334c().m97350q(this.f62273c2.getEglBaseContext());
            AbstractC20110a.m104542k(8, "LiveStreamView initPeer setEglContext err=" + m97350q, new Object[0]);
            if (m97350q != enumC17862u.m94384b()) {
                m66453sM(m97350q);
                return;
            }
            C18373b.m97334c().m97349p(0);
            C18373b.m97334c().m97353t(EnumC17855n.ZRTC_LOG_NONE.ordinal());
            C18375d c18375d = new C18375d();
            c18375d.m97362f(c32062p5.f147626a);
            c18375d.m97361e(c32062p5.f147630e);
            c18375d.m97360d(c32062p5.f147628c);
            C18373b.m97334c().m97351r(c18375d);
            C18373b.m97334c().m97345l(this.f62285i2);
            int m97338e = C18373b.m97334c().m97338e();
            AbstractC20110a.m104542k(8, "LiveStreamView initPeer init err=" + m97338e, new Object[0]);
            if (m97338e != enumC17862u.m94384b()) {
                m66453sM(m97338e);
                return;
            }
            int m97352s = C18373b.m97334c().m97352s(this.f62242N0);
            AbstractC20110a.m104542k(8, "LiveStreamView initPeer setLocalRenderWnd err=" + m97352s, new Object[0]);
            if (m97352s != enumC17862u.m94384b()) {
                m66453sM(m97352s);
                return;
            }
            C18373b.m97334c().m97343j();
            C7853b.m40052a0().m40104Q0(3);
            if (c32062p5.f147631f != 1) {
                z11 = false;
            }
            this.f62277e2 = z11;
            this.f62289k2.sendEmptyMessage(4);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: v7 */
    public void mo66404v7() {
        this.f72421L0.finish();
    }

    /* renamed from: vM */
    void m66456vM(int i11) {
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), false, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f62233F1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f62233F1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m66436wM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        SurfaceViewRenderer surfaceViewRenderer;
        boolean z11 = true;
        int i12 = 0;
        try {
            if (i11 != 27) {
                if (i11 != 42) {
                    if (i11 != 160) {
                        if (i11 != 10037) {
                            switch (i11) {
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    String str = (String) objArr[0];
                                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f62244O0.f147627b)) {
                                        this.f62289k2.sendEmptyMessage(11);
                                        return;
                                    }
                                    return;
                                case 33:
                                    String str2 = (String) objArr[0];
                                    ContactProfile contactProfile = (ContactProfile) objArr[1];
                                    if (this.f72421L0.m92674mJ() && this.f62244O0.f147627b.equals(str2) && !this.f62255T1.containsKey(contactProfile.f42434r)) {
                                        WeakHashMap weakHashMap = this.f62255T1;
                                        String str3 = contactProfile.f42434r;
                                        weakHashMap.put(str3, str3);
                                        this.f62253S1.add(contactProfile);
                                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.y
                                            public /* synthetic */ RunnableC11974y() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                GroupLiveStreamView.this.m66408AM();
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 34:
                                    String str4 = (String) objArr[0];
                                    ContactProfile contactProfile2 = (ContactProfile) objArr[1];
                                    if (this.f72421L0.m92674mJ() && this.f62244O0.f147627b.equals(str4) && this.f62255T1.containsKey(contactProfile2.f42434r)) {
                                        this.f62255T1.remove(contactProfile2.f42434r);
                                        while (true) {
                                            if (i12 < this.f62253S1.size()) {
                                                if (((ContactProfile) this.f62253S1.get(i12)).f42434r.equals(contactProfile2.f42434r)) {
                                                    this.f62253S1.remove(i12);
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.z
                                            public /* synthetic */ RunnableC11975z() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                GroupLiveStreamView.this.m66409BM();
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 35:
                                    String str5 = (String) objArr[0];
                                    if (this.f72421L0.m92674mJ() && !TextUtils.isEmpty(str5) && TextUtils.equals(str5, this.f62244O0.f147627b) && (surfaceViewRenderer = this.f62242N0) != null) {
                                        surfaceViewRenderer.addHeart();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                    } else {
                        if (objArr[0].equals(this.f62244O0.f147627b)) {
                            m66451qM();
                            return;
                        }
                        return;
                    }
                }
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.x
                    public /* synthetic */ RunnableC11973x() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamView.this.m66411DM();
                    }
                });
                return;
            }
            if (objArr != null && objArr.length >= 3) {
                String str6 = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                if (arrayList.isEmpty() || !arrayList.contains(CoreUtility.f89233i)) {
                    z11 = false;
                }
                if (AbstractC25495a.m132089n(this.f62243N1).equals(str6) && z11 && intValue == 4) {
                    this.f62289k2.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.a0
                        public /* synthetic */ RunnableC11945a0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupLiveStreamView.this.m66410CM();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // uc0.InterfaceC27232a
    /* renamed from: xE */
    public void mo66405xE() {
        String str;
        try {
            ZaloView m93004H0 = this.f72421L0.m92662fJ().m93004H0();
            if (m93004H0 != null && (m93004H0 instanceof ChatView)) {
                if (!this.f62238K1) {
                    if (this.f62261W1) {
                        str = "10008201";
                    } else {
                        str = "10008202";
                    }
                    AbstractC23647d.m123906p(str);
                    AbstractC23647d.m123893c();
                }
                this.f62261W1 = false;
                this.f62238K1 = true;
                this.f62301q2 = false;
                if (this.f72421L0.m92662fJ() != null) {
                    this.f72421L0.m92662fJ().mo93079r1(true);
                }
                if (C11891a.m66068n0()) {
                    C11891a.m66067m0(null).m66074r0();
                    return;
                }
                return;
            }
            m66441OM();
            this.f72421L0.finish();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (this.f62279f2) {
            return;
        }
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f62243N1 = m92642L3.getString("extra_group_id");
            }
            if (!TextUtils.isEmpty(this.f62243N1)) {
                this.f62289k2.sendEmptyMessage(3);
                this.f62245O1 = true;
                m66452rM(AbstractC25495a.m132089n(this.f62243N1));
                if (bundle != null) {
                    m66422WM();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Empty group id");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: yM */
    public boolean m66457yM(String str) {
        C32062p5 c32062p5 = this.f62244O0;
        if (c32062p5 != null && !TextUtils.isEmpty(c32062p5.f147627b) && this.f62244O0.f147627b.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 32);
        C23744a.m124114c().m124115b(this, 33);
        C23744a.m124114c().m124115b(this, 34);
        C23744a.m124114c().m124115b(this, 35);
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 42);
        C23744a.m124114c().m124115b(this, 10037);
        C23744a.m124114c().m124115b(this, 160);
    }
}
