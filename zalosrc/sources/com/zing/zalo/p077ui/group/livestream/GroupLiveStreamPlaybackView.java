package com.zing.zalo.p077ui.group.livestream;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2351i;
import au.AbstractC2379w;
import bp0.AbstractC3096i0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.vng.zing.vn.zrtc.livestream.ZlsViewerCb;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7210s9;
import com.zing.zalo.adapters.C7221t9;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
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
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17999s0;
import eg0.C18427b;
import hf0.AbstractC20049k;
import hf0.C20043e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractC20276f;
import i40.InterfaceC20278h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import me0.AbstractC23112j7;
import me0.AbstractC23115k;
import me0.AbstractC23136l9;
import me0.AbstractC23185q3;
import me0.C23055e5;
import me0.C23278z2;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import p056cj.C3535c;
import p097db.EnumC17855n;
import p097db.EnumC17862u;
import p127eb.C18377f;
import p308kx.C21965i;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31973j5;
import uc0.InterfaceC27232a;
import vg.C28020b3;
import vg.C28075g8;
import vg.C28203u6;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zl0.AbstractC32232i;

/* loaded from: classes5.dex */
public class GroupLiveStreamPlaybackView extends BaseZaloView implements ZaloView.InterfaceC17422g, ZaloView.InterfaceC17423h, C23744a.c, TextWatcher, View.OnClickListener, ZaloView.InterfaceC17420e, InterfaceC0733x {

    /* renamed from: u2 */
    public static boolean f62124u2 = false;

    /* renamed from: v2 */
    public static int f62125v2;

    /* renamed from: w2 */
    public static long f62126w2;

    /* renamed from: x2 */
    private static long f62127x2;

    /* renamed from: A1 */
    Animation f62128A1;

    /* renamed from: B1 */
    C20043e f62129B1;

    /* renamed from: C1 */
    RobotoTextView f62130C1;

    /* renamed from: D1 */
    LinearLayout f62131D1;

    /* renamed from: E1 */
    ActionEditText f62132E1;

    /* renamed from: F1 */
    RelativeLayout f62133F1;

    /* renamed from: G1 */
    View f62134G1;

    /* renamed from: H1 */
    Button f62135H1;

    /* renamed from: I1 */
    RelativeLayout f62136I1;

    /* renamed from: J1 */
    RecyclerView f62137J1;

    /* renamed from: K1 */
    C7210s9 f62138K1;

    /* renamed from: L1 */
    TextView f62139L1;

    /* renamed from: M1 */
    ImageView f62141M1;

    /* renamed from: N0 */
    SurfaceViewRenderer f62142N0;

    /* renamed from: N1 */
    ImageView f62143N1;

    /* renamed from: O0 */
    TouchListView f62144O0;

    /* renamed from: P0 */
    C11944a f62146P0;

    /* renamed from: Q0 */
    LinearLayoutManager f62148Q0;

    /* renamed from: R0 */
    BroadcastReceiver f62150R0;

    /* renamed from: R1 */
    ImageView f62151R1;

    /* renamed from: S1 */
    LinearLayout f62153S1;

    /* renamed from: T1 */
    View f62155T1;

    /* renamed from: U0 */
    String f62156U0;

    /* renamed from: V0 */
    String f62158V0;

    /* renamed from: V1 */
    StickerPanelView f62159V1;

    /* renamed from: W0 */
    String f62160W0;

    /* renamed from: W1 */
    ImageView f62161W1;

    /* renamed from: X0 */
    String f62162X0;

    /* renamed from: X1 */
    public KeyboardFrameLayout f62163X1;

    /* renamed from: Y0 */
    String f62164Y0;

    /* renamed from: Z0 */
    String f62166Z0;

    /* renamed from: a1 */
    String f62168a1;

    /* renamed from: b1 */
    long f62170b1;

    /* renamed from: c1 */
    MessageId f62172c1;

    /* renamed from: e2 */
    C3535c f62177e2;

    /* renamed from: f2 */
    InterfaceC20278h f62179f2;

    /* renamed from: h2 */
    EglBase f62183h2;

    /* renamed from: i2 */
    float f62185i2;

    /* renamed from: j1 */
    C23528a f62186j1;

    /* renamed from: j2 */
    float f62187j2;

    /* renamed from: k1 */
    View f62188k1;

    /* renamed from: l1 */
    RelativeLayout f62190l1;

    /* renamed from: m1 */
    DraggableView f62192m1;

    /* renamed from: n1 */
    ZVideoView f62194n1;

    /* renamed from: o1 */
    ProgressBar f62196o1;

    /* renamed from: p1 */
    RobotoTextView f62198p1;

    /* renamed from: q1 */
    ImageView f62200q1;

    /* renamed from: r1 */
    ImageView f62202r1;

    /* renamed from: s1 */
    RobotoTextView f62204s1;

    /* renamed from: t1 */
    LinearLayout f62206t1;

    /* renamed from: u1 */
    RobotoTextView f62208u1;

    /* renamed from: v1 */
    RobotoTextView f62209v1;

    /* renamed from: w1 */
    RecyclingImageView f62210w1;

    /* renamed from: x1 */
    LinearLayout f62211x1;

    /* renamed from: y1 */
    RobotoTextView f62212y1;

    /* renamed from: z1 */
    Animation f62213z1;

    /* renamed from: M0 */
    C21965i f62140M0 = null;

    /* renamed from: S0 */
    private boolean f62152S0 = false;

    /* renamed from: T0 */
    boolean f62154T0 = true;

    /* renamed from: d1 */
    boolean f62174d1 = false;

    /* renamed from: e1 */
    boolean f62176e1 = false;

    /* renamed from: f1 */
    boolean f62178f1 = false;

    /* renamed from: g1 */
    boolean f62180g1 = false;

    /* renamed from: h1 */
    boolean f62182h1 = true;

    /* renamed from: i1 */
    float f62184i1 = 0.0f;

    /* renamed from: O1 */
    boolean f62145O1 = false;

    /* renamed from: P1 */
    boolean f62147P1 = false;

    /* renamed from: Q1 */
    long f62149Q1 = 0;

    /* renamed from: U1 */
    boolean f62157U1 = true;

    /* renamed from: Y1 */
    boolean f62165Y1 = false;

    /* renamed from: Z1 */
    List f62167Z1 = new ArrayList();

    /* renamed from: a2 */
    WeakHashMap f62169a2 = new WeakHashMap();

    /* renamed from: b2 */
    int f62171b2 = AbstractC23136l9.m118713h0();

    /* renamed from: c2 */
    int f62173c2 = AbstractC23136l9.m118742r(160.0f);

    /* renamed from: d2 */
    int f62175d2 = 30000;

    /* renamed from: g2 */
    boolean f62181g2 = false;

    /* renamed from: k2 */
    Handler f62189k2 = new HandlerC11923a(Looper.getMainLooper());

    /* renamed from: l2 */
    private boolean f62191l2 = false;

    /* renamed from: m2 */
    ZlsViewerCb f62193m2 = new C11927e();

    /* renamed from: n2 */
    boolean f62195n2 = false;

    /* renamed from: o2 */
    int f62197o2 = 0;

    /* renamed from: p2 */
    final Runnable f62199p2 = new RunnableC11924b();

    /* renamed from: q2 */
    int f62201q2 = 300;

    /* renamed from: r2 */
    final int f62203r2 = AbstractC23136l9.m118742r(160.0f);

    /* renamed from: s2 */
    boolean f62205s2 = false;

    /* renamed from: t2 */
    private final int f62207t2 = 8;

    /* loaded from: classes5.dex */
    protected static class HeadSetReceiver extends BroadcastReceiver {
        protected HeadSetReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (intent.getAction().compareTo("android.intent.action.HEADSET_PLUG") == 0) {
                    int intExtra = intent.getIntExtra("state", -1);
                    if (intExtra == 0) {
                        C7853b.m40052a0().m40141m1(true);
                    } else if (intExtra == 1) {
                        C7853b.m40052a0().m40141m1(false);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$a */
    /* loaded from: classes5.dex */
    public class HandlerC11923a extends Handler {

        /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$a$a */
        /* loaded from: classes5.dex */
        class a implements InterfaceC20094a {
            a() {
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                if (GroupLiveStreamPlaybackView.this.f72421L0.m92674mJ() && GroupLiveStreamPlaybackView.this.m92648SI() != null) {
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                    if (groupLiveStreamPlaybackView.f62178f1 && !groupLiveStreamPlaybackView.f62180g1) {
                        groupLiveStreamPlaybackView.f62189k2.sendEmptyMessageDelayed(12, groupLiveStreamPlaybackView.f62175d2);
                    }
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                if (GroupLiveStreamPlaybackView.this.f72421L0.m92674mJ() && GroupLiveStreamPlaybackView.this.m92648SI() != null) {
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                    if (groupLiveStreamPlaybackView.f62178f1 && !groupLiveStreamPlaybackView.f62180g1) {
                        groupLiveStreamPlaybackView.f62189k2.sendEmptyMessageDelayed(12, groupLiveStreamPlaybackView.f62175d2);
                    }
                }
            }
        }

        HandlerC11923a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int top;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 12) {
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new a());
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                        c0766k.mo1561W3(groupLiveStreamPlaybackView.f62164Y0, groupLiveStreamPlaybackView.f62166Z0, CoreUtility.f89233i);
                        return;
                    }
                    return;
                }
                if (GroupLiveStreamPlaybackView.this.f72421L0.m92674mJ()) {
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                    if (groupLiveStreamPlaybackView2.f62144O0 != null && groupLiveStreamPlaybackView2.f62146P0 != null) {
                        int m9740Y1 = groupLiveStreamPlaybackView2.f62148Q0.m9740Y1();
                        View mo9732P = GroupLiveStreamPlaybackView.this.f62148Q0.mo9732P(m9740Y1);
                        if (mo9732P == null) {
                            top = 0;
                        } else {
                            top = (mo9732P.getTop() - GroupLiveStreamPlaybackView.this.f62148Q0.m10136l0(mo9732P)) - GroupLiveStreamPlaybackView.this.f62144O0.getPaddingTop();
                        }
                        GroupLiveStreamPlaybackView.this.f62146P0.m66467N();
                        if (mo9732P != null) {
                            GroupLiveStreamPlaybackView.this.f62148Q0.m9721B2(m9740Y1, top);
                        }
                        TouchListView touchListView = GroupLiveStreamPlaybackView.this.f62144O0;
                        if (touchListView != null) {
                            touchListView.m76951x2(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (GroupLiveStreamPlaybackView.this.f72421L0.m92674mJ() && !GroupLiveStreamPlaybackView.this.mo60294yp() && GroupLiveStreamPlaybackView.this.m92676n2() != null && !GroupLiveStreamPlaybackView.this.m92676n2().isFinishing()) {
                GroupLiveStreamPlaybackView.this.f62212y1.setText(AbstractC23185q3.m119472d(C23793c.m124316k().mo124311f() - GroupLiveStreamPlaybackView.f62126w2));
                GroupLiveStreamPlaybackView.this.f62189k2.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$b */
    /* loaded from: classes5.dex */
    class RunnableC11924b implements Runnable {
        RunnableC11924b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (GroupLiveStreamPlaybackView.this.f62132E1.getText().length() > 0) {
                    GroupLiveStreamPlaybackView.this.m66379JM();
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                    groupLiveStreamPlaybackView.f62189k2.postDelayed(groupLiveStreamPlaybackView.f62199p2, 50L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$c */
    /* loaded from: classes5.dex */
    public class C11925c implements InterfaceC20094a {
        C11925c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupLiveStreamPlaybackView.this.f62205s2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            GroupLiveStreamPlaybackView.this.f62205s2 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$d */
    /* loaded from: classes5.dex */
    public class C11926d extends AbstractC31727b {
        C11926d() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            char charAt;
            try {
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                ActionEditText actionEditText = groupLiveStreamPlaybackView.f62132E1;
                if (actionEditText != null && (groupLiveStreamPlaybackView.f62201q2 - actionEditText.length()) - str.length() >= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    int selectionEnd = GroupLiveStreamPlaybackView.this.f62132E1.getSelectionEnd();
                    StringBuffer stringBuffer = new StringBuffer(GroupLiveStreamPlaybackView.this.f62132E1.getText().toString());
                    if (selectionEnd == GroupLiveStreamPlaybackView.this.f62132E1.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                        if (selectionEnd > 0 && (charAt = GroupLiveStreamPlaybackView.this.f62132E1.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                            sb2.append(" ");
                            sb2.append(str);
                        }
                        if (selectionEnd == GroupLiveStreamPlaybackView.this.f62132E1.getText().length()) {
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
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                        ActionEditText actionEditText2 = groupLiveStreamPlaybackView2.f62132E1;
                        if (actionEditText2 != null && (groupLiveStreamPlaybackView2.f62201q2 - actionEditText2.length()) - str.length() >= 0) {
                            stringBuffer.insert(selectionEnd, str);
                            GroupLiveStreamPlaybackView.this.f62132E1.setText(stringBuffer.toString());
                            GroupLiveStreamPlaybackView.this.f62132E1.setSelection(selectionEnd + str.length());
                            return;
                        }
                        ToastUtils.showMess(GroupLiveStreamPlaybackView.this.m92652XI(AbstractC8020f0.limit_input_text));
                        return;
                    }
                    stringBuffer.insert(selectionEnd, str);
                    GroupLiveStreamPlaybackView.this.f62132E1.setText(stringBuffer.toString());
                    GroupLiveStreamPlaybackView.this.f62132E1.setSelection(selectionEnd + str.length());
                    return;
                }
                ToastUtils.showMess(GroupLiveStreamPlaybackView.this.m92652XI(AbstractC8020f0.limit_input_text));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                    groupLiveStreamPlaybackView.f62189k2.postDelayed(groupLiveStreamPlaybackView.f62199p2, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                    groupLiveStreamPlaybackView2.f62189k2.removeCallbacks(groupLiveStreamPlaybackView2.f62199p2);
                    GroupLiveStreamPlaybackView.this.m66379JM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$e */
    /* loaded from: classes5.dex */
    public class C11927e implements ZlsViewerCb {
        C11927e() {
        }

        /* renamed from: d */
        public /* synthetic */ void m66390d() {
            try {
                RecyclingImageView recyclingImageView = GroupLiveStreamPlaybackView.this.f62210w1;
                if (recyclingImageView != null) {
                    recyclingImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                GroupLiveStreamPlaybackView.this.f62196o1.setVisibility(4);
                AbstractC23115k.m118570a(GroupLiveStreamPlaybackView.this.f62210w1, AbstractC10919t.fadeout);
                GroupLiveStreamPlaybackView.this.f62142N0.setVisibility(0);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                if (!groupLiveStreamPlaybackView.f62174d1 && groupLiveStreamPlaybackView.f62157U1) {
                    groupLiveStreamPlaybackView.f62211x1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62137J1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62153S1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62133F1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62132E1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62212y1.setText("00:00");
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                    groupLiveStreamPlaybackView2.m66380Ka(groupLiveStreamPlaybackView2.f62197o2);
                }
                GroupLiveStreamPlaybackView.this.f62189k2.sendEmptyMessage(1);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: e */
        public static /* synthetic */ void m66391e(C17945a0 c17945a0) {
            C7956b.m41474B().m41513J0(c17945a0, c17945a0.m94929K2());
        }

        /* renamed from: f */
        public /* synthetic */ void m66392f() {
            String str;
            try {
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView.f62180g1 = true;
                AbstractC23185q3.m119470b(groupLiveStreamPlaybackView.f62164Y0, groupLiveStreamPlaybackView.f62172c1);
                GroupLiveStreamPlaybackView.this.f62211x1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62137J1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62198p1.setVisibility(8);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                if (groupLiveStreamPlaybackView2.f62178f1) {
                    groupLiveStreamPlaybackView2.m66380Ka(0);
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(GroupLiveStreamPlaybackView.this.f62162X0);
                    if (m141809c != null) {
                        str = m141809c.m40383Q(true, false);
                    } else {
                        str = "";
                    }
                    String m119472d = AbstractC23185q3.m119472d(C23793c.m124316k().mo124311f() - GroupLiveStreamPlaybackView.f62126w2);
                    String charSequence = GroupLiveStreamPlaybackView.this.f62139L1.getText().toString();
                    String format = String.format(GroupLiveStreamPlaybackView.this.m92652XI(AbstractC8020f0.ls_des_live_streaming), str, m119472d, charSequence);
                    SpannableString spannableString = new SpannableString(format);
                    spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
                    int indexOf = format.indexOf(m119472d, str.length());
                    if (indexOf > 0) {
                        spannableString.setSpan(new StyleSpan(1), indexOf, m119472d.length() + indexOf, 33);
                    }
                    int lastIndexOf = format.lastIndexOf(charSequence);
                    if (lastIndexOf > 0) {
                        spannableString.setSpan(new StyleSpan(1), lastIndexOf, charSequence.length() + lastIndexOf, 33);
                    }
                    GroupLiveStreamPlaybackView.this.f62196o1.setVisibility(4);
                    GroupLiveStreamPlaybackView.this.f62209v1.setText(spannableString);
                    GroupLiveStreamPlaybackView.this.f62206t1.setVisibility(0);
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView3 = GroupLiveStreamPlaybackView.this;
                    if (groupLiveStreamPlaybackView3.f62154T0) {
                        groupLiveStreamPlaybackView3.f62192m1.setAllowDrag(false);
                    }
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView4 = GroupLiveStreamPlaybackView.this;
                    if (groupLiveStreamPlaybackView4.f62174d1) {
                        groupLiveStreamPlaybackView4.f62192m1.m88313w();
                    }
                    GroupLiveStreamPlaybackView.this.f62200q1.setVisibility(8);
                    GroupLiveStreamPlaybackView.this.f62134G1.setVisibility(8);
                    GroupLiveStreamPlaybackView.this.f62133F1.setVisibility(8);
                    GroupLiveStreamPlaybackView.this.f62132E1.setVisibility(8);
                    GroupLiveStreamPlaybackView.this.f62155T1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62204s1.setVisibility(0);
                    ((RelativeLayout.LayoutParams) GroupLiveStreamPlaybackView.this.f62204s1.getLayoutParams()).setMargins(0, ((GroupLiveStreamPlaybackView.this.f62171b2 - AbstractC23136l9.m118742r(195.0f)) / 2) - AbstractC23136l9.m118742r(30.0f), 0, 0);
                    GroupLiveStreamPlaybackView.this.f62204s1.requestLayout();
                    return;
                }
                RecyclingImageView recyclingImageView = groupLiveStreamPlaybackView2.f62210w1;
                if (recyclingImageView != null) {
                    recyclingImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView5 = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView5.f62176e1 = true;
                groupLiveStreamPlaybackView5.f62142N0.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62143N1.setVisibility(0);
                GroupLiveStreamPlaybackView.this.f62200q1.setVisibility(8);
                String valueOf = String.valueOf(System.currentTimeMillis());
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView6 = GroupLiveStreamPlaybackView.this;
                String str2 = groupLiveStreamPlaybackView6.f62156U0;
                String str3 = groupLiveStreamPlaybackView6.f62160W0;
                int i11 = C23278z2.m120136k0().f116260a;
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView7 = GroupLiveStreamPlaybackView.this;
                C17391z c17391z = new C17391z(valueOf, "", str2, str2, str3, i11, true, 0, groupLiveStreamPlaybackView7.f62184i1, 5, groupLiveStreamPlaybackView7.f62156U0, "", 0);
                GroupLiveStreamPlaybackView.this.f62194n1.setUseVideoRatio(false);
                GroupLiveStreamPlaybackView.this.f62194n1.setViewRatio((AbstractC23136l9.m118722k0() * 1.0f) / GroupLiveStreamPlaybackView.this.f62171b2);
                GroupLiveStreamPlaybackView.this.f62194n1.setExcludeSystemDecorationSize(false);
                GroupLiveStreamPlaybackView.this.f62194n1.setIsFocusing(true);
                GroupLiveStreamPlaybackView.this.f62194n1.getVideoController().setEnableFullScreen(false);
                GroupLiveStreamPlaybackView.this.f62194n1.setZVideo(c17391z);
                int currentState = GroupLiveStreamPlaybackView.this.f62194n1.getCurrentState();
                if (currentState == 0) {
                    GroupLiveStreamPlaybackView.this.f62129B1 = new C20043e(GroupLiveStreamPlaybackView.this.f62194n1, 7);
                    AbstractC20049k.m104116j(GroupLiveStreamPlaybackView.this.f62194n1, c17391z, 7, c17391z.f88618a);
                } else if (currentState == 2 || currentState == 6 || currentState == 4) {
                    GroupLiveStreamPlaybackView.this.f62194n1.start();
                }
                GroupLiveStreamPlaybackView.this.f62194n1.setVisibility(0);
                GroupLiveStreamPlaybackView.this.f62196o1.setVisibility(0);
                GroupLiveStreamPlaybackView.this.f62143N1.setVisibility(0);
                GroupLiveStreamPlaybackView.this.f62210w1.setVisibility(0);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZlsViewerCb
        public void onZlsPlayerReady(int i11, int i12) {
            GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
            if (!groupLiveStreamPlaybackView.f62180g1 && !groupLiveStreamPlaybackView.f62191l2) {
                GroupLiveStreamPlaybackView.this.f62191l2 = true;
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView2.f62178f1 = true;
                groupLiveStreamPlaybackView2.m66384oM();
                GroupLiveStreamPlaybackView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.l
                    public /* synthetic */ RunnableC11961l() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamPlaybackView.C11927e.this.m66390d();
                    }
                });
                AbstractC20110a.m104542k(8, "LiveStreamPlaybackView onZlsPlayerReady width= " + i11 + ", height= " + i12, new Object[0]);
            }
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZlsViewerCb
        public void onZlsPlayerStats(String str) {
        }

        @Override // com.vng.zing.vn.zrtc.livestream.ZlsViewerCb
        public void onZlsStreamEnded() {
            try {
                C17945a0 m2636s = AbstractC23306f.m120584H0().m2636s(GroupLiveStreamPlaybackView.this.f62172c1);
                if (m2636s != null && (m2636s.m94929K2() instanceof C17999s0) && !((C17999s0) m2636s.m94929K2()).f91168B) {
                    ((C17999s0) m2636s.m94929K2()).m95712i(true);
                    C23288a.f113033a.mo13474a(new C18427b(m2636s.mo95039W2(), new Runnable() { // from class: com.zing.zalo.ui.group.livestream.m
                        public /* synthetic */ RunnableC11962m() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupLiveStreamPlaybackView.C11927e.m66391e(C17945a0.this);
                        }
                    }));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (GroupLiveStreamPlaybackView.this.f72421L0.m92674mJ() && !GroupLiveStreamPlaybackView.this.mo60294yp() && GroupLiveStreamPlaybackView.this.m92676n2() != null && !GroupLiveStreamPlaybackView.this.m92676n2().isFinishing()) {
                GroupLiveStreamPlaybackView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.n
                    public /* synthetic */ RunnableC11963n() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamPlaybackView.C11927e.this.m66392f();
                    }
                });
            }
            AbstractC20110a.m104542k(8, "LiveStreamPlaybackView onZlsStreamEnded", new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$f */
    /* loaded from: classes5.dex */
    public class C11928f implements KeyboardFrameLayout.InterfaceC13508a {
        C11928f() {
        }

        /* renamed from: b */
        public /* synthetic */ void m66394b() {
            try {
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                if (groupLiveStreamPlaybackView.f62197o2 != 2) {
                    groupLiveStreamPlaybackView.m66380Ka(0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
            if (groupLiveStreamPlaybackView.f62174d1) {
                return;
            }
            groupLiveStreamPlaybackView.f62165Y1 = false;
            groupLiveStreamPlaybackView.f62189k2.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.o
                public /* synthetic */ RunnableC11964o() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupLiveStreamPlaybackView.C11928f.this.m66394b();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
            if (groupLiveStreamPlaybackView.f62174d1) {
                return;
            }
            groupLiveStreamPlaybackView.f62165Y1 = true;
            try {
                if (groupLiveStreamPlaybackView.f72421L0.m92674mJ()) {
                    GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                    if (groupLiveStreamPlaybackView2.f62178f1) {
                        groupLiveStreamPlaybackView2.f62134G1.setVisibility(0);
                        if (!GroupLiveStreamPlaybackView.this.f62134G1.isFocused()) {
                            GroupLiveStreamPlaybackView.this.f62134G1.requestFocus();
                        }
                        GroupLiveStreamPlaybackView.this.f62133F1.setVisibility(0);
                        GroupLiveStreamPlaybackView.this.f62133F1.requestLayout();
                        GroupLiveStreamPlaybackView.this.f62131D1.setVisibility(4);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView3 = GroupLiveStreamPlaybackView.this;
                        groupLiveStreamPlaybackView3.f62173c2 = (((((groupLiveStreamPlaybackView3.f62171b2 - i11) - AbstractC23136l9.m118742r(46.0f)) - GroupLiveStreamPlaybackView.this.f62211x1.getHeight()) - ((RelativeLayout.LayoutParams) GroupLiveStreamPlaybackView.this.f62211x1.getLayoutParams()).topMargin) - GroupLiveStreamPlaybackView.this.f62137J1.getHeight()) - AbstractC23136l9.m118742r(16.0f);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView4 = GroupLiveStreamPlaybackView.this;
                        int i12 = groupLiveStreamPlaybackView4.f62173c2;
                        int i13 = groupLiveStreamPlaybackView4.f62203r2;
                        if (i12 > i13) {
                            groupLiveStreamPlaybackView4.f62173c2 = i13;
                        }
                        groupLiveStreamPlaybackView4.m66381LM();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$g */
    /* loaded from: classes5.dex */
    class C11929g extends SmoothScrollLinearLayoutManager {
        C11929g(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: J1 */
        public boolean mo9654J1() {
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$h */
    /* loaded from: classes5.dex */
    class C11930h extends RecyclerView.AbstractC1892s {
        C11930h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            super.mo952b(recyclerView, i11);
            try {
                C11944a c11944a = GroupLiveStreamPlaybackView.this.f62146P0;
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

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$i */
    /* loaded from: classes5.dex */
    class C11931i implements InterfaceC27232a {
        C11931i() {
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: Ef */
        public void mo66395Ef(float f11, float f12) {
            if (Build.VERSION.SDK_INT < 24) {
                GroupLiveStreamPlaybackView.this.f62142N0.scale(f11);
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: Gn */
        public void mo66396Gn() {
            GroupLiveStreamPlaybackView.this.m66371xM();
            if (GroupLiveStreamPlaybackView.this.f62174d1) {
                AbstractC23647d.m123906p("10008404");
                AbstractC23647d.m123893c();
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: H5 */
        public void mo66397H5() {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            String str;
            try {
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                if (groupLiveStreamPlaybackView.f62178f1 && !groupLiveStreamPlaybackView.f62180g1) {
                    if (groupLiveStreamPlaybackView.f62197o2 == 0) {
                        int i16 = 0;
                        boolean z11 = !groupLiveStreamPlaybackView.f62157U1;
                        groupLiveStreamPlaybackView.f62157U1 = z11;
                        ImageView imageView = groupLiveStreamPlaybackView.f62143N1;
                        if (z11) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        imageView.setVisibility(i11);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                        LinearLayout linearLayout = groupLiveStreamPlaybackView2.f62211x1;
                        if (groupLiveStreamPlaybackView2.f62157U1) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        linearLayout.setVisibility(i12);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView3 = GroupLiveStreamPlaybackView.this;
                        RecyclerView recyclerView = groupLiveStreamPlaybackView3.f62137J1;
                        if (groupLiveStreamPlaybackView3.f62157U1) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        recyclerView.setVisibility(i13);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView4 = GroupLiveStreamPlaybackView.this;
                        LinearLayout linearLayout2 = groupLiveStreamPlaybackView4.f62153S1;
                        if (groupLiveStreamPlaybackView4.f62157U1) {
                            i14 = 0;
                        } else {
                            i14 = 8;
                        }
                        linearLayout2.setVisibility(i14);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView5 = GroupLiveStreamPlaybackView.this;
                        RelativeLayout relativeLayout = groupLiveStreamPlaybackView5.f62133F1;
                        if (groupLiveStreamPlaybackView5.f62157U1) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        relativeLayout.setVisibility(i15);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView6 = GroupLiveStreamPlaybackView.this;
                        LinearLayout linearLayout3 = groupLiveStreamPlaybackView6.f62131D1;
                        if (!groupLiveStreamPlaybackView6.f62157U1) {
                            i16 = 8;
                        }
                        linearLayout3.setVisibility(i16);
                        GroupLiveStreamPlaybackView groupLiveStreamPlaybackView7 = GroupLiveStreamPlaybackView.this;
                        if (!groupLiveStreamPlaybackView7.f62147P1 && !groupLiveStreamPlaybackView7.f62174d1) {
                            if (groupLiveStreamPlaybackView7.f62157U1) {
                                str = "10008305";
                            } else {
                                str = "10008304";
                            }
                            AbstractC23647d.m123906p(str);
                            AbstractC23647d.m123893c();
                        }
                    }
                    AbstractC2379w.m12430d(GroupLiveStreamPlaybackView.this.f62130C1);
                    AbstractC2379w.m12430d(GroupLiveStreamPlaybackView.this.f62132E1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: Ir */
        public void mo66398Ir() {
            GroupLiveStreamPlaybackView.this.m66371xM();
            if (GroupLiveStreamPlaybackView.this.f62174d1) {
                AbstractC23647d.m123906p("10008404");
                AbstractC23647d.m123893c();
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: f2 */
        public void mo66399f2() {
            try {
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView.f62145O1 = true;
                groupLiveStreamPlaybackView.m66378IM(true);
                GroupLiveStreamPlaybackView.this.m92662fJ().m93094z(true);
                GroupLiveStreamPlaybackView.this.f62198p1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62153S1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62200q1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62143N1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62133F1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62131D1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62211x1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62137J1.setVisibility(8);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: g7 */
        public void mo66400g7() {
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: hE */
        public void mo66401hE() {
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: n1 */
        public void mo66402n1() {
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: qq */
        public void mo66403qq() {
            int i11;
            int i12;
            int i13;
            try {
                if (GroupLiveStreamPlaybackView.this.f62174d1) {
                    AbstractC23647d.m123906p("10008403");
                    AbstractC23647d.m123893c();
                }
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView.f62174d1 = false;
                groupLiveStreamPlaybackView.m66378IM(false);
                if (GroupLiveStreamPlaybackView.this.m92662fJ() != null) {
                    GroupLiveStreamPlaybackView.this.m92662fJ().m93094z(false);
                    GroupLiveStreamPlaybackView.this.m92662fJ().mo93079r1(false);
                }
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView2.f62157U1 = true;
                LinearLayout linearLayout = groupLiveStreamPlaybackView2.f62153S1;
                int i14 = 8;
                if (!groupLiveStreamPlaybackView2.f62180g1 && groupLiveStreamPlaybackView2.f62178f1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView3 = GroupLiveStreamPlaybackView.this;
                ImageView imageView = groupLiveStreamPlaybackView3.f62143N1;
                if (groupLiveStreamPlaybackView3.f62180g1 && groupLiveStreamPlaybackView3.f62178f1) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                imageView.setVisibility(i12);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView4 = GroupLiveStreamPlaybackView.this;
                LinearLayout linearLayout2 = groupLiveStreamPlaybackView4.f62211x1;
                if (!groupLiveStreamPlaybackView4.f62180g1 && groupLiveStreamPlaybackView4.f62178f1) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                linearLayout2.setVisibility(i13);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView5 = GroupLiveStreamPlaybackView.this;
                RecyclerView recyclerView = groupLiveStreamPlaybackView5.f62137J1;
                if (!groupLiveStreamPlaybackView5.f62180g1 && groupLiveStreamPlaybackView5.f62178f1) {
                    i14 = 0;
                }
                recyclerView.setVisibility(i14);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView6 = GroupLiveStreamPlaybackView.this;
                if (groupLiveStreamPlaybackView6.f62178f1) {
                    groupLiveStreamPlaybackView6.f62133F1.setVisibility(0);
                    GroupLiveStreamPlaybackView.this.f62131D1.setVisibility(0);
                }
                GroupLiveStreamPlaybackView.this.f62145O1 = false;
                if (C11891a.m66068n0()) {
                    C11891a.m66067m0(null).m66075s0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: v7 */
        public void mo66404v7() {
            GroupLiveStreamPlaybackView.this.m66371xM();
            if (GroupLiveStreamPlaybackView.this.f62174d1) {
                AbstractC23647d.m123906p("10008404");
                AbstractC23647d.m123893c();
            }
        }

        @Override // uc0.InterfaceC27232a
        /* renamed from: xE */
        public void mo66405xE() {
            try {
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
                if (groupLiveStreamPlaybackView.f62178f1 && groupLiveStreamPlaybackView.f62180g1) {
                    groupLiveStreamPlaybackView.f62192m1.m88313w();
                    return;
                }
                if (!groupLiveStreamPlaybackView.f62174d1 && groupLiveStreamPlaybackView.f62145O1 && !groupLiveStreamPlaybackView.f62147P1) {
                    AbstractC23647d.m123906p("10008302");
                    AbstractC23647d.m123893c();
                }
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView2 = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView2.f62157U1 = false;
                groupLiveStreamPlaybackView2.f62174d1 = true;
                groupLiveStreamPlaybackView2.m66378IM(true);
                if (GroupLiveStreamPlaybackView.this.m92662fJ() != null) {
                    GroupLiveStreamPlaybackView.this.m92662fJ().mo93079r1(true);
                }
                GroupLiveStreamPlaybackView.this.f62198p1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62153S1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62200q1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62143N1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62211x1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62137J1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62133F1.setVisibility(8);
                GroupLiveStreamPlaybackView.this.f62131D1.setVisibility(8);
                GroupLiveStreamPlaybackView groupLiveStreamPlaybackView3 = GroupLiveStreamPlaybackView.this;
                groupLiveStreamPlaybackView3.f62145O1 = false;
                groupLiveStreamPlaybackView3.f62147P1 = false;
                if (C11891a.m66068n0()) {
                    C11891a.m66067m0(null).m66074r0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$j */
    /* loaded from: classes5.dex */
    class C11932j extends C23999j {
        C11932j() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
            InterfaceC20278h interfaceC20278h = groupLiveStreamPlaybackView.f62179f2;
            if (interfaceC20278h != null) {
                interfaceC20278h.mo56690i1(groupLiveStreamPlaybackView, c3979l);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$k */
    /* loaded from: classes5.dex */
    public class C11933k implements InterfaceC20094a {
        C11933k() {
        }

        /* renamed from: d */
        public /* synthetic */ void m66407d() {
            GroupLiveStreamPlaybackView groupLiveStreamPlaybackView = GroupLiveStreamPlaybackView.this;
            groupLiveStreamPlaybackView.f62138K1.m36690L(groupLiveStreamPlaybackView.f62167Z1);
            GroupLiveStreamPlaybackView.this.f62139L1.setText("" + GroupLiveStreamPlaybackView.this.f62167Z1.size());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            ContactProfile m141810d;
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (jSONObject.has("pingPeriod")) {
                    i11 = jSONObject.getInt("pingPeriod");
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    GroupLiveStreamPlaybackView.this.f62175d2 = i11 * 1000;
                }
                if (jSONObject.has("viewerProfiles")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("viewerProfiles");
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("name");
                        String optString3 = jSONObject2.optString("avt");
                        if (!TextUtils.isEmpty(optString)) {
                            if (CoreUtility.f89233i.equals(optString)) {
                                m141810d = AbstractC23304d.f113368c0;
                            } else {
                                m141810d = C28203u6.f131407a.m141810d(optString, new TrackingSource((short) 1016));
                            }
                            if (m141810d == null) {
                                m141810d = new ContactProfile(optString);
                                if (optString3 == null) {
                                    optString3 = "";
                                }
                                m141810d.f42446v = optString3;
                                if (optString2 == null) {
                                    optString2 = "";
                                }
                                m141810d.f42437s = optString2;
                            }
                            if (!GroupLiveStreamPlaybackView.this.f62169a2.containsKey(optString)) {
                                GroupLiveStreamPlaybackView.this.f62169a2.put(optString, optString);
                                GroupLiveStreamPlaybackView.this.f62167Z1.add(m141810d);
                            }
                        }
                    }
                    if (jSONObject.length() > 0) {
                        GroupLiveStreamPlaybackView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.p
                            public /* synthetic */ RunnableC11965p() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupLiveStreamPlaybackView.C11933k.this.m66407d();
                            }
                        });
                    }
                }
                if (GroupLiveStreamPlaybackView.this.f72421L0.m92674mJ() && GroupLiveStreamPlaybackView.this.m92676n2() != null && !GroupLiveStreamPlaybackView.this.m92676n2().isFinishing()) {
                    GroupLiveStreamPlaybackView.this.f62189k2.removeMessages(12);
                    GroupLiveStreamPlaybackView.this.f62189k2.sendEmptyMessage(12);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.livestream.GroupLiveStreamPlaybackView$l */
    /* loaded from: classes5.dex */
    public class C11934l implements InterfaceC20094a {
        C11934l() {
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

    static {
        AbstractC3096i0.m15525Z();
    }

    /* renamed from: AM */
    public /* synthetic */ void m66349AM(int i11) {
        try {
            if (i11 != -1) {
                if (i11 != 0 && i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f62210w1.setVisibility(4);
                            if (this.f62182h1) {
                                this.f62210w1.startAnimation(this.f62213z1);
                                this.f62182h1 = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f62143N1.setVisibility(0);
                    this.f62210w1.setVisibility(0);
                    this.f62196o1.setVisibility(4);
                    this.f62194n1.setForceHideController(false);
                    return;
                }
                this.f62210w1.setVisibility(0);
                this.f62196o1.setVisibility(0);
                this.f62143N1.setVisibility(0);
                return;
            }
            this.f62196o1.setVisibility(4);
            this.f62210w1.setVisibility(4);
            C3979l m123610p = this.f62186j1.m123610p(this.f62160W0, C23278z2.m120110a());
            if (m123610p != null) {
                this.f62194n1.setLoadingViewImageInfo(m123610p);
            }
            if (m92672lJ()) {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.youtube_player_error));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ void m66350BM() {
        try {
            if (this.f62192m1 != null && !mo66383c8()) {
                this.f62192m1.m88295A();
                this.f62192m1.requestLayout();
                this.f62192m1.m88316z();
                m66382MM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CM */
    public /* synthetic */ void m66351CM() {
        float f11;
        try {
            float width = this.f62190l1.getWidth();
            float height = this.f62190l1.getHeight();
            float f12 = width / height;
            float m118731n0 = AbstractC23136l9.m118731n0(m92648SI()) / 2;
            float m118719j0 = AbstractC23136l9.m118719j0(m92648SI()) / 4;
            if (f12 < m118731n0 / m118719j0) {
                f11 = m118719j0 / height;
            } else {
                f11 = m118731n0 / width;
            }
            this.f62192m1.setMinimizeScale(f11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: HM */
    private void m66352HM(ZaloView zaloView, boolean z11) {
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

    /* renamed from: KM */
    private void m66353KM() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f62159V1 = (StickerPanelView) m92996E0;
        }
        if (this.f62159V1 != null) {
            m66366sM();
        }
    }

    /* renamed from: rM */
    private void m66365rM(int i11) {
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), false, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f62159V1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f62159V1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m66366sM();
        }
    }

    /* renamed from: sM */
    private void m66366sM() {
        this.f62159V1.m72709oO(new C11926d());
    }

    /* renamed from: tM */
    private boolean m66367tM(float f11, float f12, float f13, float f14) {
        float abs = Math.abs(f11 - f12);
        float abs2 = Math.abs(f13 - f14);
        if (abs <= 8.0f && abs2 <= 8.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: vM */
    public /* synthetic */ void m66369vM() {
        try {
            this.f62138K1.m36690L(this.f62167Z1);
            this.f62139L1.setText(String.valueOf(this.f62167Z1.size()));
            C11944a c11944a = this.f62146P0;
            if (c11944a != null) {
                c11944a.m66467N();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wM */
    public /* synthetic */ void m66370wM() {
        try {
            this.f62138K1.m36690L(this.f62167Z1);
            this.f62139L1.setText(String.valueOf(this.f62167Z1.size()));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: yM */
    public /* synthetic */ boolean m66372yM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6 || i11 == 4) {
            m66377GM();
            return false;
        }
        return false;
    }

    /* renamed from: zM */
    public /* synthetic */ boolean m66373zM(View view, MotionEvent motionEvent) {
        if (this.f62144O0.m9893m0(motionEvent.getX(), motionEvent.getY()) == null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && m66367tM(this.f62185i2, motionEvent.getX(), this.f62187j2, motionEvent.getY())) {
                    AbstractC2379w.m12430d(this.f62130C1);
                    AbstractC2379w.m12430d(this.f62132E1);
                    return false;
                }
                return false;
            }
            this.f62185i2 = motionEvent.getX();
            this.f62187j2 = motionEvent.getY();
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (m92676n2() != null) {
                m92676n2().getWindow().addFlags(128);
                AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
            }
            this.f62186j1 = new C23528a(m92648SI());
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            this.f62213z1 = alphaAnimation;
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            this.f62213z1.setDuration(500L);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            this.f62128A1 = alphaAnimation2;
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            this.f62128A1.setDuration(200L);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f62184i1 = m92642L3.getFloat("extra_video_ratio");
            }
            this.f62183h2 = EglBase.create();
            if (bundle != null) {
                finish();
            } else if (m92642L3() != null) {
                this.f62154T0 = m92642L3().getBoolean("EXTRA_MINIMIZE", true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: DM, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m66371xM() {
        try {
            this.f62189k2.removeMessages(12);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C11934l());
            if (this.f62178f1) {
                c0766k.mo1609c4(this.f62164Y0, this.f62166Z0, this.f62162X0);
            }
            m66375EM();
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: EM */
    void m66375EM() {
        try {
            if (this.f62195n2) {
                return;
            }
            this.f62195n2 = true;
            SurfaceViewRenderer surfaceViewRenderer = this.f62142N0;
            if (surfaceViewRenderer != null) {
                surfaceViewRenderer.finishRender();
            }
            C18377f.m97372b().m97380j();
            C18377f.m97372b();
            C18377f.m97371a();
            C21965i c21965i = this.f62140M0;
            if (c21965i != null && c21965i.m114696B()) {
                this.f62140M0.m114697N();
            }
            f62125v2 = 0;
            f62124u2 = false;
            C7853b.m40052a0().m40128g();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FM */
    public void m66376FM(String str, String str2) {
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || TextUtils.isEmpty(str2) || this.f62205s2) {
                return;
            }
            this.f62205s2 = true;
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 42).m95386v(1).m95365a();
            m95365a.m94951M9();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C11925c());
            c0766k.mo1421E8(str, m95365a, str2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f62205s2 = false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_live_stream_playback, (ViewGroup) null);
        this.f62188k1 = inflate;
        this.f62136I1 = (RelativeLayout) inflate.findViewById(AbstractC6918a0.top_view);
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) this.f62188k1.findViewById(AbstractC6918a0.ll_main);
        this.f62163X1 = keyboardFrameLayout;
        keyboardFrameLayout.setTopViewGroup(this.f62136I1);
        this.f62163X1.setOnKeyboardListener(new C11928f());
        this.f62134G1 = this.f62188k1.findViewById(AbstractC6918a0.live_stream_send_message_layout);
        this.f62131D1 = (LinearLayout) this.f62188k1.findViewById(AbstractC6918a0.ll_input_live_chat);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(100.0f), AbstractC23136l9.m118742r(36.0f));
        layoutParams.setMargins(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), 0, 0);
        layoutParams.addRule(12);
        this.f62131D1.setLayoutParams(layoutParams);
        this.f62133F1 = (RelativeLayout) this.f62188k1.findViewById(AbstractC6918a0.ll_chat_container);
        ActionEditText actionEditText = (ActionEditText) this.f62188k1.findViewById(AbstractC6918a0.edit_input);
        this.f62132E1 = actionEditText;
        actionEditText.addTextChangedListener(this);
        this.f62132E1.setOnClickListener(this);
        this.f62132E1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.group.livestream.h
            public /* synthetic */ C11957h() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m66372yM;
                m66372yM = GroupLiveStreamPlaybackView.this.m66372yM(textView, i11, keyEvent);
                return m66372yM;
            }
        });
        RobotoTextView robotoTextView = (RobotoTextView) this.f62188k1.findViewById(AbstractC6918a0.input_chat);
        this.f62130C1 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        ImageView imageView = (ImageView) this.f62188k1.findViewById(AbstractC6918a0.imv_close);
        this.f62143N1 = imageView;
        imageView.setOnClickListener(this);
        Button button = (Button) this.f62188k1.findViewById(AbstractC6918a0.btn_live_msg_send);
        this.f62135H1 = button;
        button.setEnabled(false);
        this.f62135H1.setOnClickListener(this);
        this.f62196o1 = (ProgressBar) this.f62188k1.findViewById(AbstractC6918a0.holoCircularProgressBar);
        this.f62200q1 = (ImageView) this.f62188k1.findViewById(AbstractC6918a0.btn_minimum);
        this.f62198p1 = (RobotoTextView) this.f62188k1.findViewById(AbstractC6918a0.btn_close);
        this.f62153S1 = (LinearLayout) this.f62188k1.findViewById(AbstractC6918a0.ll_like);
        this.f62151R1 = (ImageView) this.f62188k1.findViewById(AbstractC6918a0.btnLike);
        this.f62153S1.setOnClickListener(this);
        this.f62204s1 = (RobotoTextView) this.f62188k1.findViewById(AbstractC6918a0.tv_end_live);
        this.f62206t1 = (LinearLayout) this.f62188k1.findViewById(AbstractC6918a0.ll_des_ended_live);
        this.f62209v1 = (RobotoTextView) this.f62188k1.findViewById(AbstractC6918a0.tv_des_ended_live_video);
        this.f62208u1 = (RobotoTextView) this.f62188k1.findViewById(AbstractC6918a0.btn_back_conversation);
        this.f62211x1 = (LinearLayout) this.f62188k1.findViewById(AbstractC6918a0.ln_state);
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        int m118742r2 = AbstractC23136l9.m118742r(10.0f);
        int m118742r3 = AbstractC23136l9.m118742r(12.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        AbstractC17484n.b bVar = AbstractC17484n.Companion;
        layoutParams2.setMargins(m118742r, bVar.m92931b() + m118742r2, 0, 0);
        this.f62143N1.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(m118742r, bVar.m92931b() + m118742r2, 0, 0);
        this.f62200q1.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, AbstractC23136l9.m118742r(27.0f));
        layoutParams4.setMargins(0, bVar.m92931b() + m118742r3, 0, 0);
        layoutParams4.addRule(14);
        this.f62211x1.setLayoutParams(layoutParams4);
        RecyclerView recyclerView = (RecyclerView) this.f62188k1.findViewById(AbstractC6918a0.rv_user_seen);
        this.f62137J1 = recyclerView;
        recyclerView.setOverScrollMode(2);
        this.f62137J1.setItemAnimator(null);
        this.f62137J1.setLayoutAnimation(null);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f62188k1.getContext());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f62137J1.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        this.f62137J1.m9816A(new C7221t9(AbstractC23136l9.m118742r(4.0f)));
        C7210s9 c7210s9 = new C7210s9(m92648SI(), new ArrayList());
        this.f62138K1 = c7210s9;
        this.f62137J1.setAdapter(c7210s9);
        this.f62212y1 = (RobotoTextView) this.f62188k1.findViewById(AbstractC6918a0.tv_duration);
        TouchListView touchListView = (TouchListView) this.f62188k1.findViewById(AbstractC6918a0.lv_chat);
        this.f62144O0 = touchListView;
        touchListView.setVisibility(0);
        C11929g c11929g = new C11929g(m92648SI());
        this.f62148Q0 = c11929g;
        c11929g.m9723C2(1);
        this.f62148Q0.mo9649E2(true);
        this.f62144O0.setLayoutManager(this.f62148Q0);
        this.f62144O0.setOverScrollMode(2);
        this.f62144O0.m9826E(new C11930h());
        this.f62144O0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.group.livestream.i
            public /* synthetic */ ViewOnTouchListenerC11958i() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m66373zM;
                m66373zM = GroupLiveStreamPlaybackView.this.m66373zM(view, motionEvent);
                return m66373zM;
            }
        });
        C11944a c11944a = new C11944a(m92648SI());
        this.f62146P0 = c11944a;
        this.f62144O0.setAdapter(c11944a);
        this.f62134G1.setVisibility(8);
        this.f62133F1.setVisibility(8);
        this.f62132E1.setVisibility(8);
        this.f62208u1.setOnClickListener(this);
        this.f62198p1.setOnClickListener(this);
        this.f62200q1.setOnClickListener(this);
        ImageView imageView2 = (ImageView) this.f62188k1.findViewById(AbstractC6918a0.btn_emoji);
        this.f62141M1 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        this.f62190l1 = (RelativeLayout) this.f62188k1.findViewById(AbstractC6918a0.layout_main_render);
        SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) this.f62188k1.findViewById(AbstractC6918a0.live_render_widown);
        this.f62142N0 = surfaceViewRenderer;
        surfaceViewRenderer.init(this.f62183h2.getEglBaseContext());
        this.f62142N0.setZOrderMediaOverlay(true);
        this.f62142N0.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        this.f62142N0.setMirror(false);
        this.f62142N0.requestLayout();
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f62188k1.findViewById(AbstractC6918a0.imv_thumb);
        this.f62210w1 = recyclingImageView;
        recyclingImageView.setVisibility(0);
        ZVideoView zVideoView = (ZVideoView) this.f62188k1.findViewById(AbstractC6918a0.zalo_video_view);
        this.f62194n1 = zVideoView;
        if (zVideoView.getVideoController() != null) {
            if (this.f62194n1.getLoadingView() != null) {
                this.f62194n1.getLoadingView().setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            C3979l m123610p = this.f62186j1.m123610p(this.f62160W0, C23278z2.m120110a());
            if (m123610p != null) {
                this.f62194n1.setLoadingViewImageInfo(m123610p);
            }
        }
        this.f62194n1.setAudioFocusControl(C28075g8.m141538e());
        this.f62194n1.setOnPlayerStateChangedListener(new ZVideoView.InterfaceC17345q() { // from class: com.zing.zalo.ui.group.livestream.j
            public /* synthetic */ C11959j() {
            }

            @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
            /* renamed from: D */
            public final void mo44076D(int i11) {
                GroupLiveStreamPlaybackView.this.m66349AM(i11);
            }
        });
        this.f62202r1 = new ImageView(m92648SI());
        DraggableView draggableView = (DraggableView) this.f62188k1.findViewById(AbstractC6918a0.draggable_view);
        this.f62192m1 = draggableView;
        draggableView.setAllowDrag(this.f62154T0);
        DraggableView draggableView2 = this.f62192m1;
        draggableView2.f83721g0 = false;
        draggableView2.setDraggableListener(new C11931i());
        this.f62192m1.f83730x = AbstractC23136l9.m118742r(2.0f);
        this.f62192m1.f83729w = AbstractC23136l9.m118742r(2.0f) + ((int) m92651WI().getDimension(AbstractC16802y.abs__action_bar_default_height));
        m92648SI().getResources().getDisplayMetrics();
        m66382MM();
        ImageView imageView3 = (ImageView) this.f62188k1.findViewById(AbstractC6918a0.ic_emoji);
        this.f62161W1 = imageView3;
        imageView3.setOnClickListener(this);
        this.f62139L1 = (TextView) this.f62188k1.findViewById(AbstractC6918a0.tv_viewed);
        ArrayList<View> arrayList = new ArrayList<>();
        View findViewById = this.f62188k1.findViewById(AbstractC6918a0.sticker_panel_container);
        if (findViewById != null) {
            arrayList.add(findViewById);
        }
        this.f62163X1.setBottomViewsGroup(arrayList);
        this.f62155T1 = this.f62188k1.findViewById(AbstractC6918a0.playback_overlay);
        return this.f62188k1;
    }

    /* renamed from: GM */
    void m66377GM() {
        try {
            String trim = this.f62132E1.getText().toString().trim();
            if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(this.f62164Y0) && !TextUtils.isEmpty(this.f62166Z0)) {
                if (C23055e5.m118271f()) {
                    AbstractC23112j7.m118518a0(this.f62164Y0, trim, this.f62166Z0);
                    this.f62132E1.setText("");
                } else {
                    ToastUtils.showMess(m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG));
                }
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
            m92676n2().getWindow().clearFlags(128);
            try {
                m66375EM();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            ZVideoView zVideoView = this.f62194n1;
            if (zVideoView != null) {
                zVideoView.m92430t0();
                this.f62194n1.m92412f0(true);
            }
            C20043e c20043e = this.f62129B1;
            if (c20043e != null) {
                c20043e.m104034p();
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: IM */
    public void m66378IM(boolean z11) {
    }

    /* renamed from: JM */
    void m66379JM() {
        try {
            ActionEditText actionEditText = this.f62132E1;
            if (actionEditText != null) {
                actionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f62132E1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 32);
        C23744a.m124114c().m124117e(this, 33);
        C23744a.m124114c().m124117e(this, 34);
        C23744a.m124114c().m124117e(this, 35);
        C23744a.m124114c().m124117e(this, 42);
        C23744a.m124114c().m124117e(this, 10037);
        C23744a.m124114c().m124117e(this, 160);
        try {
            InterfaceC20278h interfaceC20278h = this.f62179f2;
            if (interfaceC20278h != null) {
                interfaceC20278h.mo56687X0(this.f62181g2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Ka */
    public void m66380Ka(int i11) {
        this.f62197o2 = i11;
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        try {
            int i12 = this.f62197o2;
            int i13 = 8;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        AbstractC2379w.m12430d(this.f62132E1);
                        this.f62161W1.setImageResource(AbstractC16803z.icon_viewfull_kb_keyboard);
                        this.f62200q1.setVisibility(8);
                        this.f62143N1.setVisibility(0);
                        this.f62198p1.setVisibility(8);
                        this.f62153S1.setVisibility(8);
                        if (this.f62154T0) {
                            this.f62192m1.setAllowDrag(false);
                        }
                        this.f62163X1.setPaddingBottom(m122007i5);
                        this.f62163X1.requestLayout();
                        if (this.f62159V1 == null) {
                            m66365rM(m122007i5);
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                        }
                        m66352HM(this.f62159V1, true);
                        return;
                    }
                    return;
                }
                this.f62134G1.setVisibility(0);
                m66352HM(this.f62159V1, false);
                this.f62161W1.setImageResource(AbstractC16803z.icon_viewfull_kb_emoticon);
                this.f62163X1.setPaddingBottom(m122007i5);
                this.f62163X1.requestLayout();
                AbstractC2379w.m12432f(this.f62132E1);
                this.f62198p1.setVisibility(8);
                this.f62153S1.setVisibility(8);
                this.f62200q1.setVisibility(8);
                this.f62143N1.setVisibility(0);
                if (this.f62154T0) {
                    this.f62192m1.setAllowDrag(false);
                    return;
                }
                return;
            }
            AbstractC2379w.m12430d(this.f62132E1);
            m66352HM(this.f62159V1, false);
            this.f62134G1.setVisibility(8);
            this.f62131D1.setVisibility(0);
            this.f62153S1.setVisibility(0);
            this.f62161W1.setImageResource(AbstractC16803z.icon_viewfull_kb_emoticon);
            ImageView imageView = this.f62143N1;
            if (!this.f62180g1) {
                i13 = 0;
            }
            imageView.setVisibility(i13);
            if (this.f62154T0) {
                this.f62192m1.setAllowDrag(!this.f62180g1);
            }
            this.f62163X1.setPaddingBottom(0);
            this.f62163X1.requestLayout();
            m66381LM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LM */
    void m66381LM() {
        int i11;
        try {
            if (this.f62197o2 == 0) {
                i11 = this.f62203r2;
            } else {
                i11 = this.f62173c2;
            }
            TouchListView touchListView = this.f62144O0;
            if (touchListView != null && this.f62146P0 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) touchListView.getLayoutParams();
                layoutParams.height = i11;
                layoutParams.addRule(2, this.f62131D1.getId());
                this.f62144O0.setLayoutParams(layoutParams);
                this.f62144O0.m76952y2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: MM */
    public void m66382MM() {
        this.f62190l1.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.k
            public /* synthetic */ RunnableC11960k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupLiveStreamPlaybackView.this.m66351CM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 27);
        m66378IM(true);
        C20043e c20043e = this.f62129B1;
        if (c20043e != null) {
            c20043e.m104036r();
        }
        if (this.f62150R0 != null && this.f62152S0) {
            m92648SI().unregisterReceiver(this.f62150R0);
            this.f62150R0 = null;
            this.f62152S0 = false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        long j11;
        super.mo37118SJ(bundle);
        try {
            bundle.putBoolean("isLiveStreaming", this.f62178f1);
            ZVideoView zVideoView = this.f62194n1;
            if (zVideoView != null && this.f62176e1) {
                j11 = zVideoView.getCurrentPosition();
            } else {
                j11 = 0;
            }
            bundle.putLong("currentTimePlayback", j11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C20043e c20043e = this.f62129B1;
        if (c20043e != null) {
            c20043e.m104038t();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            try {
                if (m92676n2() != null && m92676n2().getWindow() != null) {
                    m92676n2().mo35554O(18);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        if (z11 && !z12) {
            try {
                if (m92642L3() != null && m92642L3().getBoolean("extra_bol_ended_live")) {
                    this.f62193m2.onZlsStreamEnded();
                } else {
                    m66385pM(this.f62156U0, this.f62158V0);
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
        View view = this.f62188k1;
        if (view != null) {
            view.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.b
                public /* synthetic */ RunnableC11946b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupLiveStreamPlaybackView.this.m66350BM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        m66386qM();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.length() > this.f62201q2) {
            this.f62132E1.setText(this.f62132E1.getText().toString().trim().substring(0, this.f62201q2));
            this.f62132E1.setSelection(this.f62201q2);
        }
        C28652r.m143349v().m143361W(editable);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: bK */
    public void mo39045bK(boolean z11) {
        super.mo39045bK(z11);
        if (m92672lJ() && z11) {
            m92662fJ().m93012K0();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // com.zing.zalo.zview.ZaloView.InterfaceC17423h
    /* renamed from: c8 */
    public boolean mo66383c8() {
        return this.f62174d1;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupLiveStreamPlaybackView";
    }

    /* renamed from: oM */
    void m66384oM() {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11933k());
        c0766k.mo1483M5(this.f62164Y0, this.f62166Z0, this.f62162X0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ic_emoji) {
                if (this.f62197o2 == 2) {
                    m66380Ka(1);
                    return;
                } else {
                    m66380Ka(2);
                    return;
                }
            }
            if (id2 != AbstractC6918a0.btn_back_conversation && id2 != AbstractC6918a0.btn_close) {
                if (id2 == AbstractC6918a0.ll_like) {
                    AbstractC20276f.m105891d(this.f62151R1, 1.8f, 200L, true);
                    if (!TextUtils.isEmpty(this.f62164Y0) && !TextUtils.isEmpty(this.f62166Z0)) {
                        m66376FM(this.f62164Y0, this.f62166Z0);
                        SurfaceViewRenderer surfaceViewRenderer = this.f62142N0;
                        if (surfaceViewRenderer != null) {
                            surfaceViewRenderer.addHeart();
                        }
                    }
                    AbstractC23647d.m123906p("10008303");
                    AbstractC23647d.m123893c();
                    return;
                }
                if (id2 == AbstractC6918a0.btn_live_msg_send) {
                    m66377GM();
                    return;
                }
                if (id2 == AbstractC6918a0.imv_close) {
                    this.f62181g2 = true;
                    m66371xM();
                    return;
                }
                if (id2 == AbstractC6918a0.input_chat) {
                    if (!this.f62165Y1) {
                        this.f62131D1.setVisibility(4);
                        m66380Ka(1);
                        return;
                    }
                    return;
                }
                if (id2 == AbstractC6918a0.edit_input) {
                    if (!this.f62165Y1) {
                        m66380Ka(1);
                        return;
                    }
                    return;
                }
                if (id2 == AbstractC6918a0.btn_minimum) {
                    this.f62147P1 = true;
                    DraggableView draggableView = this.f62192m1;
                    if (draggableView != null) {
                        draggableView.m88314x();
                    }
                    this.f62198p1.setVisibility(8);
                    this.f62153S1.setVisibility(8);
                    this.f62200q1.setVisibility(8);
                    this.f62211x1.setVisibility(8);
                    this.f62137J1.setVisibility(8);
                    AbstractC23647d.m123906p("10008301");
                    AbstractC23647d.m123893c();
                    return;
                }
                if (id2 == AbstractC6918a0.btn_emoji && this.f72421L0.m92674mJ() && this.f62178f1) {
                    this.f62134G1.setVisibility(0);
                    if (!this.f62134G1.isFocused()) {
                        this.f62134G1.requestFocus();
                    }
                    this.f62131D1.setVisibility(4);
                    m66380Ka(2);
                    return;
                }
                return;
            }
            this.f62181g2 = true;
            m66371xM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent) || i11 != 4 || this.f62165Y1) {
            return true;
        }
        StickerPanelView stickerPanelView = this.f62159V1;
        if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
            m66380Ka(0);
        } else {
            this.f62181g2 = true;
            m66371xM();
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.m124114c().m124115b(this, 27);
        m66378IM(false);
        C20043e c20043e = this.f62129B1;
        if (c20043e != null) {
            c20043e.m104037s();
        }
        C11944a c11944a = this.f62146P0;
        if (c11944a != null) {
            c11944a.m66467N();
            this.f62146P0.mo10003k();
            m66381LM();
            TouchListView touchListView = this.f62144O0;
            if (touchListView != null) {
                touchListView.m76952y2();
            }
        }
        if (!this.f62152S0) {
            if (this.f62150R0 == null) {
                this.f62150R0 = new HeadSetReceiver();
            }
            AbstractC2351i.m12327a(m92686rK(), this.f62150R0, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
            this.f62152S0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        boolean z11;
        Button button = this.f62135H1;
        if (button != null) {
            if (this.f62132E1.getText().toString().trim().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            button.setEnabled(z11);
        }
    }

    /* renamed from: pM */
    void m66385pM(String str, String str2) {
        try {
            C21965i c21965i = new C21965i(1, "ZRtcWakeLog");
            this.f62140M0 = c21965i;
            c21965i.m114700x();
            int m97374d = C18377f.m97372b().m97374d(MainApplication.getAppContext());
            AbstractC20110a.m104542k(8, "LiveStreamPlaybackView initPeer setAppContext err=" + m97374d, new Object[0]);
            EnumC17862u enumC17862u = EnumC17862u.SUCCESS;
            if (m97374d != enumC17862u.m94384b()) {
                return;
            }
            int m97376f = C18377f.m97372b().m97376f(this.f62183h2.getEglBaseContext());
            AbstractC20110a.m104542k(8, "LiveStreamPlaybackView initPeer setEglContext err=" + m97376f, new Object[0]);
            if (m97376f != enumC17862u.m94384b()) {
                return;
            }
            C18377f.m97372b().m97375e(0);
            C18377f.m97372b().m97377g(EnumC17855n.ZRTC_LOG_NONE.ordinal());
            C18377f.m97372b().m97373c(this.f62193m2);
            C18377f.m97372b().m97378h(this.f62142N0);
            int m97379i = C18377f.m97372b().m97379i(str2);
            AbstractC20110a.m104542k(8, "LiveStreamPlaybackView initPeer start err=" + m97379i, new Object[0]);
            if (m97379i != enumC17862u.m94384b()) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
                finish();
            }
            C7853b.m40052a0().m40143n1();
            long mo124311f = C23793c.m124316k().mo124311f();
            long j11 = f62126w2;
            if (j11 != 0 && mo124311f - j11 >= 0) {
                mo124311f = j11;
            }
            f62126w2 = mo124311f;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: qM */
    void m66386qM() {
        Point m155456d = AbstractC32232i.m155456d(m92656bJ());
        int i11 = m155456d.x;
        int i12 = m155456d.y;
        this.f62171b2 = i12;
        if (this.f62184i1 == 0.0f) {
            this.f62184i1 = (i11 * 1.0f) / i12;
        }
        ZVideoView zVideoView = this.f62194n1;
        if (zVideoView != null) {
            zVideoView.setViewRatio((i11 * 1.0f) / i12);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        SurfaceViewRenderer surfaceViewRenderer;
        int i12 = 0;
        try {
            if (i11 != 27) {
                if (i11 != 42) {
                    if (i11 != 160) {
                        if (i11 != 10037) {
                            switch (i11) {
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    String str = (String) objArr[0];
                                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f62166Z0)) {
                                        this.f62189k2.sendEmptyMessage(2);
                                        return;
                                    }
                                    return;
                                case 33:
                                    String str2 = (String) objArr[0];
                                    ContactProfile contactProfile = (ContactProfile) objArr[1];
                                    if (this.f72421L0.m92674mJ() && this.f62166Z0.equals(str2) && !this.f62169a2.containsKey(contactProfile.f42434r)) {
                                        WeakHashMap weakHashMap = this.f62169a2;
                                        String str3 = contactProfile.f42434r;
                                        weakHashMap.put(str3, str3);
                                        this.f62167Z1.add(contactProfile);
                                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.d
                                            public /* synthetic */ RunnableC11950d() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                GroupLiveStreamPlaybackView.this.m66369vM();
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 34:
                                    String str4 = (String) objArr[0];
                                    ContactProfile contactProfile2 = (ContactProfile) objArr[1];
                                    if (this.f72421L0.m92674mJ() && this.f62166Z0.equals(str4) && this.f62169a2.containsKey(contactProfile2.f42434r)) {
                                        this.f62169a2.remove(contactProfile2.f42434r);
                                        while (true) {
                                            if (i12 < this.f62167Z1.size()) {
                                                if (((ContactProfile) this.f62167Z1.get(i12)).f42434r.equals(contactProfile2.f42434r)) {
                                                    this.f62167Z1.remove(i12);
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.e
                                            public /* synthetic */ RunnableC11952e() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                GroupLiveStreamPlaybackView.this.m66370wM();
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 35:
                                    String str5 = (String) objArr[0];
                                    if (!TextUtils.isEmpty(str5) && TextUtils.equals(this.f62166Z0, str5) && (surfaceViewRenderer = this.f62142N0) != null) {
                                        surfaceViewRenderer.addHeart();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                    } else {
                        if (objArr[0].equals(this.f62166Z0)) {
                            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.g
                                public /* synthetic */ RunnableC11956g() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    GroupLiveStreamPlaybackView.this.m66371xM();
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.c
                    public /* synthetic */ RunnableC11948c() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLiveStreamPlaybackView.this.m66368uM();
                    }
                });
                return;
            }
            if (objArr != null && objArr.length >= 3) {
                String str6 = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                boolean contains = arrayList.contains(CoreUtility.f89233i);
                if (this.f62168a1.equals(str6) && !arrayList.isEmpty() && intValue == 4 && contains) {
                    this.f62189k2.post(new Runnable() { // from class: com.zing.zalo.ui.group.livestream.f
                        public /* synthetic */ RunnableC11954f() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupLiveStreamPlaybackView.this.m66371xM();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        RecyclingImageView recyclingImageView;
        String str;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                this.f62178f1 = bundle.getBoolean("isLiveStreaming");
                f62127x2 = bundle.getLong("currentTimePlayback");
                m66353KM();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f62156U0 = m92642L3.getString("extra_playback_url");
            this.f62158V0 = m92642L3.getString("extra_live_url");
            this.f62160W0 = m92642L3.getString("extra_thumb_url");
            this.f62162X0 = m92642L3.getString("extra_uid_live_streaming");
            this.f62164Y0 = m92642L3.getString("extra_ownerid_live");
            this.f62166Z0 = m92642L3.getString("extra_streamId");
            this.f62170b1 = m92642L3.getLong("extra_timestamp_live");
            this.f62172c1 = (MessageId) m92642L3.getParcelable("extra_message_id_live");
            if (m92642L3.getString("extra_group_id") != null) {
                str = AbstractC25495a.m132088m(m92642L3.getString("extra_group_id"));
            } else {
                str = "";
            }
            this.f62168a1 = str;
            m92642L3.getBoolean("extra_bol_ended_live");
            AbstractC20110a.m104542k(8, "LiveStreamPlaybackView init mStreamId= " + this.f62166Z0, new Object[0]);
        }
        f62126w2 = this.f62170b1;
        if (!TextUtils.isEmpty(this.f62156U0) && !TextUtils.isEmpty(this.f62158V0) && !TextUtils.isEmpty(this.f62166Z0)) {
            C3535c m2640w = AbstractC23306f.m120584H0().m2640w("livestream_" + this.f62166Z0);
            this.f62177e2 = m2640w;
            this.f62146P0.m66470Q(m2640w);
            this.f62146P0.m66467N();
            m66381LM();
            if (!TextUtils.isEmpty(this.f62160W0) && (recyclingImageView = this.f62210w1) != null) {
                ((C23528a) this.f62186j1.m123612r(recyclingImageView)).m123577A(this.f62160W0, C23278z2.m120068F(), 10, new C11932j());
            }
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f62168a1);
            if (m4472f != null && m4472f.m153747Y()) {
                this.f62208u1.setText(AbstractC8020f0.str_back_community_conversation);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Empty playback url or live url");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: yJ */
    public void mo46830yJ(WindowInsets windowInsets) {
        super.mo46830yJ(windowInsets);
        m66386qM();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        if (zaloActivity instanceof InterfaceC20278h) {
            this.f62179f2 = (InterfaceC20278h) zaloActivity;
        }
        C23744a.m124114c().m124115b(this, 32);
        C23744a.m124114c().m124115b(this, 33);
        C23744a.m124114c().m124115b(this, 34);
        C23744a.m124114c().m124115b(this, 35);
        C23744a.m124114c().m124115b(this, 42);
        C23744a.m124114c().m124115b(this, 10037);
        C23744a.m124114c().m124115b(this, 160);
    }
}
