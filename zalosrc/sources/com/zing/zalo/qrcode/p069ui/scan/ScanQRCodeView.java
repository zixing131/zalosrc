package com.zing.zalo.qrcode.p069ui.scan;

import ac.C0697c0;
import ag0.AbstractC0837p0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.graphics.C1421e;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1801w;
import androidx.vectordrawable.graphics.drawable.C2040d;
import ap0.C2279a;
import au.C2348g0;
import bi0.AbstractC2808b;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.cameradecor.view.CameraPreviewGLView;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8010k;
import com.zing.zalo.dialog.QRCodeResultViewDialog;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.qrcode.p069ui.recent.RecentScanQRView;
import com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b;
import com.zing.zalo.qrcode.p069ui.scan.ScanQRCodeView;
import com.zing.zalo.qrcode.p069ui.sheet.JoinWifiSheet;
import com.zing.zalo.qrcode.p069ui.sheet.LinkSheet;
import com.zing.zalo.qrcode.p069ui.sheet.MoreSheet;
import com.zing.zalo.qrcode.p069ui.sheet.PCLoginErrorSheet;
import com.zing.zalo.qrcode.p069ui.sheet.PhoneNumberSheet;
import com.zing.zalo.qrcode.p069ui.sheet.ReportBadQRSheet;
import com.zing.zalo.qrcode.p069ui.sheet.SubMenuSheet;
import com.zing.zalo.qrcode.p069ui.sheet.TextSheet;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.utils.systemui.C16766d;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.utils.systemui.SystemUIUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import ho0.AbstractC20110a;
import id0.C20516b;
import java.util.HashSet;
import java.util.List;
import kd0.C21697g;
import kn.AbstractC21777d;
import ly.AbstractC22687v;
import ly.C22688w;
import ly.InterfaceC22667b;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23283z7;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mj0.AbstractC23322a;
import my.AbstractC23490m;
import my.C23488k;
import o80.C24117a;
import o80.C24129m;
import o80.C24130n;
import on0.C24329j;
import org.json.JSONObject;
import p100df.EnumC17910b;
import p140ev.C18616e;
import p140ev.C18620i;
import p189gv.C19609h;
import p207he.C20024r;
import p295kb.C21643a;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p374ny.AbstractC23958b;
import p374ny.C23959c;
import p374ny.C23960d;
import p374ny.C23961e;
import p374ny.C23962f;
import p374ny.C23963g;
import p465qy.InterfaceC25502a;
import p496ry.InterfaceC26029r;
import p500s1.C26087b;
import p542ub.InterfaceC27218a;
import p558uu.InterfaceC27367c;
import p716zh.C31877d;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qe0.AbstractC25247c;
import qe0.AbstractC25250f;
import qe0.C25246b;
import qe0.C25249e;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import sy.AbstractC26412d;
import th.C26691l;
import ui0.C27280g;
import vg.AbstractC28207v1;
import wh0.C29046a;
import xh0.C29655m;
import xh0.InterfaceC29634a;
import xh0.InterfaceC29636b;
import xh0.InterfaceC29653k;
import yf0.C30955t;
import zh0.AbstractC32212c;

/* loaded from: classes4.dex */
public final class ScanQRCodeView extends SlidableZaloView implements InterfaceC25502a, InterfaceC26029r, GalleryPickerView.InterfaceC12681b {

    /* renamed from: A1 */
    private C30955t.b f48890A1;

    /* renamed from: B1 */
    private C18616e f48891B1;

    /* renamed from: C1 */
    private final C9227f f48892C1;

    /* renamed from: D1 */
    private final C9230g0 f48893D1;

    /* renamed from: P0 */
    private ViewGroup f48894P0;

    /* renamed from: Q0 */
    private DecorModuleView f48895Q0;

    /* renamed from: R0 */
    private CameraPreviewGLView f48896R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f48897S0;

    /* renamed from: T0 */
    private InterfaceC22667b f48898T0;

    /* renamed from: U0 */
    private boolean f48899U0;

    /* renamed from: V0 */
    private final boolean f48900V0;

    /* renamed from: W0 */
    private long f48901W0;

    /* renamed from: X0 */
    private boolean f48902X0;

    /* renamed from: Y0 */
    private final Matrix f48903Y0;

    /* renamed from: Z0 */
    private InterfaceC29634a f48904Z0;

    /* renamed from: a1 */
    private final float[] f48905a1;

    /* renamed from: b1 */
    private Object f48906b1;

    /* renamed from: c1 */
    private final List f48907c1;

    /* renamed from: d1 */
    private final Rect f48908d1;

    /* renamed from: e1 */
    private final Rect f48909e1;

    /* renamed from: f1 */
    private final boolean f48910f1;

    /* renamed from: g1 */
    private SensitiveData f48911g1;

    /* renamed from: h1 */
    private InterfaceC18494a f48912h1;

    /* renamed from: i1 */
    private boolean f48913i1;

    /* renamed from: j1 */
    private boolean f48914j1;

    /* renamed from: k1 */
    private final C9232h0 f48915k1;

    /* renamed from: l1 */
    private final C9223d f48916l1;

    /* renamed from: m1 */
    private final C9219b f48917m1;

    /* renamed from: n1 */
    private String f48918n1;

    /* renamed from: o1 */
    private final C9221c f48919o1;

    /* renamed from: p1 */
    private JSONObject f48920p1;

    /* renamed from: q1 */
    private final Runnable f48921q1;

    /* renamed from: r1 */
    private final HashSet f48922r1;

    /* renamed from: s1 */
    private final String f48923s1;

    /* renamed from: t1 */
    private InterfaceC18494a f48924t1;

    /* renamed from: u1 */
    private InterfaceC18494a f48925u1;

    /* renamed from: v1 */
    private final C9225e f48926v1;

    /* renamed from: w1 */
    private final C9220b0 f48927w1;

    /* renamed from: x1 */
    private String f48928x1;

    /* renamed from: y1 */
    private final Runnable f48929y1;

    /* renamed from: z1 */
    private final Runnable f48930z1;

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$a */
    /* loaded from: classes4.dex */
    private static abstract class AbstractC9217a extends AbstractC22687v {
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$a0 */
    /* loaded from: classes4.dex */
    static final class C9218a0 extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        final /* synthetic */ Rect f48931q;

        /* renamed from: r */
        final /* synthetic */ ScanQRCodeView f48932r;

        /* renamed from: s */
        final /* synthetic */ Rect f48933s;

        /* renamed from: t */
        final /* synthetic */ int f48934t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9218a0(Rect rect, ScanQRCodeView scanQRCodeView, Rect rect2, int i11) {
            super(4);
            this.f48931q = rect;
            this.f48932r = scanQRCodeView;
            this.f48933s = rect2;
            this.f48934t = i11;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m49341a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49341a(int i11, int i12, int i13, int i14) {
            C24129m c24129m;
            C24130n c24130n;
            Rect rect = this.f48931q;
            if (rect.left != i11 || rect.top != i12 || rect.right != i13 || rect.bottom != i14) {
                rect.set(i11, i12, i13, i14);
                DecorModuleView decorModuleView = this.f48932r.f48895Q0;
                if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null) {
                    c24129m = c24130n.m126083F1();
                } else {
                    c24129m = null;
                }
                if (c24129m != null) {
                    Rect rect2 = this.f48933s;
                    int i15 = rect2.right;
                    int i16 = rect2.top;
                    int i17 = rect2.bottom;
                    int i18 = rect2.left;
                    float[] fArr = {i15, i16, i15, i17, i18, i17, i18, i16};
                    ScanQRUIUtils.f49155a.m49624e(fArr, -0.0390625f);
                    c24129m.m126062G1(fArr);
                }
                this.f48932r.m49262pO(this.f48931q, this.f48933s, this.f48934t);
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$b */
    /* loaded from: classes4.dex */
    public static final class C9219b implements InterfaceC29653k.a, InterfaceC29636b {
        C9219b() {
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: a */
        public void mo38606a(boolean z11) {
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: b */
        public void mo38607b(boolean z11, Exception exc) {
            ScanQRCodeView.this.m49270tN().mo49451Zj(z11, exc);
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: c */
        public void mo38608c(byte[] bArr, boolean z11) {
            AbstractC19074t.m100208f(bArr, "data");
            ScanQRCodeView.this.m49270tN().mo49470ve(bArr, z11);
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: d */
        public void mo38609d(boolean z11, Exception exc) {
        }

        @Override // xh0.InterfaceC29653k.a
        public void onError(int i11) {
        }

        @Override // xh0.InterfaceC29636b
        /* renamed from: qC */
        public void mo38592qC(InterfaceC29634a interfaceC29634a) {
            boolean z11;
            int i11;
            int i12;
            C29655m mo147374e;
            C29655m mo147374e2;
            C29655m mo147374e3;
            ScanQRCodeView.this.f48904Z0 = interfaceC29634a;
            InterfaceC9256b m49270tN = ScanQRCodeView.this.m49270tN();
            int i13 = 0;
            if (interfaceC29634a != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (interfaceC29634a != null && (mo147374e3 = interfaceC29634a.mo147374e()) != null) {
                i11 = mo147374e3.f136920a;
            } else {
                i11 = 0;
            }
            if (interfaceC29634a != null && (mo147374e2 = interfaceC29634a.mo147374e()) != null) {
                i12 = mo147374e2.f136921b;
            } else {
                i12 = 0;
            }
            if (interfaceC29634a != null && (mo147374e = interfaceC29634a.mo147374e()) != null) {
                i13 = mo147374e.f136922c;
            }
            m49270tN.mo49448Y4(z11, i11, i12, i13);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$b0 */
    /* loaded from: classes4.dex */
    public static final class C9220b0 extends BottomSheet.AbstractC16910a {
        C9220b0() {
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            ScanQRCodeView.this.m49270tN().mo49459g6(true);
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
            ScanQRCodeView.this.m49270tN().mo49459g6(false);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$c */
    /* loaded from: classes4.dex */
    public static final class C9221c implements InterfaceC29634a.a {
        C9221c() {
        }

        @Override // xh0.InterfaceC29634a.a
        /* renamed from: a */
        public void mo38618a(boolean z11) {
            C24130n c24130n;
            C24117a m126093u1;
            DecorModuleView decorModuleView = ScanQRCodeView.this.f48895Q0;
            if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126093u1 = c24130n.m126093u1()) != null) {
                m126093u1.m126022v1();
            }
        }

        @Override // xh0.InterfaceC29634a.a
        /* renamed from: b */
        public void mo38619b(String str) {
            AbstractC19074t.m100208f(str, "flashMode");
            ScanQRCodeView.this.m49270tN().mo49440M6();
        }

        @Override // xh0.InterfaceC29634a.a
        /* renamed from: c */
        public void mo38620c(byte[] bArr, int i11) {
            AbstractC19074t.m100208f(bArr, "data");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$c0 */
    /* loaded from: classes4.dex */
    public static final class C9222c0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48938q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9222c0(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48938q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49342a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49342a() {
            this.f48938q.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$d */
    /* loaded from: classes4.dex */
    public static final class C9223d implements C24117a.a {
        C9223d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m49345h(final InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "$onEnd");
            AbstractC19444a.m101697e(new Runnable() { // from class: qy.j1
                @Override // java.lang.Runnable
                public final void run() {
                    ScanQRCodeView.C9223d.m49346i(InterfaceC18494a.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m49346i(InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "$onEnd");
            interfaceC18494a.mo12V4();
        }

        @Override // o80.C24117a.a
        /* renamed from: a */
        public int mo49347a() {
            InterfaceC29634a interfaceC29634a = ScanQRCodeView.this.f48904Z0;
            if (interfaceC29634a != null) {
                return interfaceC29634a.mo147370a();
            }
            return 0;
        }

        @Override // o80.C24117a.a
        /* renamed from: b */
        public boolean mo49348b(boolean z11) {
            InterfaceC29634a interfaceC29634a = ScanQRCodeView.this.f48904Z0;
            if (interfaceC29634a != null) {
                return interfaceC29634a.mo147371b(z11);
            }
            return false;
        }

        @Override // o80.C24117a.a
        /* renamed from: c */
        public void mo49349c(float f11, float f12, int i11, int i12, final InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "onEnd");
            int m155331a = AbstractC32212c.m155331a(ScanQRCodeView.this.m92689tK());
            InterfaceC29634a interfaceC29634a = ScanQRCodeView.this.f48904Z0;
            if (interfaceC29634a != null) {
                interfaceC29634a.mo147375f(m155331a, f11, f12, i11, i12, new InterfaceC29634a.b() { // from class: qy.i1
                    @Override // xh0.InterfaceC29634a.b
                    /* renamed from: a */
                    public final void mo39486a() {
                        ScanQRCodeView.C9223d.m49345h(InterfaceC18494a.this);
                    }
                });
            }
        }

        @Override // o80.C24117a.a
        /* renamed from: d */
        public boolean mo49350d() {
            return ScanQRCodeView.this.m49270tN().mo49467rh();
        }

        @Override // o80.C24117a.a
        /* renamed from: e */
        public boolean mo49351e() {
            return ScanQRCodeView.this.m49270tN().mo49467rh();
        }

        @Override // o80.C24117a.a
        public void onDoubleTap(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, "event");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$d0 */
    /* loaded from: classes4.dex */
    public static final class C9224d0 extends AbstractC19075u implements InterfaceC18494a {
        C9224d0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49352a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49352a() {
            ScanQRCodeView.this.f48913i1 = true;
            ScanQRCodeView.this.m49203QN();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$e */
    /* loaded from: classes4.dex */
    public static final class C9225e extends BottomSheet.AbstractC16910a {
        C9225e() {
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            InterfaceC9256b.a.m49473a(ScanQRCodeView.this.m49270tN(), 0, 1, null);
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$e0 */
    /* loaded from: classes4.dex */
    static final class C9226e0 extends AbstractC19075u implements InterfaceC18494a {
        C9226e0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9257c mo12V4() {
            return new C9257c(ScanQRCodeView.this);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$f */
    /* loaded from: classes4.dex */
    public static final class C9227f implements C30955t.c {

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$f$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C18616e f48944q;

            /* renamed from: r */
            final /* synthetic */ ScanQRCodeView f48945r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C18616e c18616e, ScanQRCodeView scanQRCodeView) {
                super(0);
                this.f48944q = c18616e;
                this.f48945r = scanQRCodeView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BottomSheet mo12V4() {
                JoinWifiSheet joinWifiSheet = new JoinWifiSheet();
                C18616e c18616e = this.f48944q;
                ScanQRCodeView scanQRCodeView = this.f48945r;
                joinWifiSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("name", "sheet-join-wifi"), AbstractC24866w.m129235a("body", c18616e.m98376e())));
                AbstractC25247c.m130673a(joinWifiSheet, scanQRCodeView.f48926v1);
                return joinWifiSheet;
            }
        }

        C9227f() {
        }

        @Override // yf0.C30955t.c
        /* renamed from: a */
        public void mo49354a() {
            ScanQRCodeView.this.m49320jO(AbstractC8020f0.error_general);
        }

        @Override // yf0.C30955t.c
        /* renamed from: b */
        public void mo49355b() {
            ScanQRCodeView.this.m49320jO(AbstractC8020f0.error_general);
        }

        @Override // yf0.C30955t.c
        /* renamed from: c */
        public void mo49356c(C18616e c18616e, C30955t.b bVar) {
            AbstractC19074t.m100208f(c18616e, "wifiConfig");
            AbstractC19074t.m100208f(bVar, "delegate");
            ScanQRCodeView.this.f48890A1 = bVar;
            ScanQRCodeView.this.f48891B1 = c18616e;
            ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            scanQRCodeView.m49217XN(new a(c18616e, scanQRCodeView));
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$f0 */
    /* loaded from: classes4.dex */
    static final class C9228f0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC27218a f48946q;

        /* renamed from: r */
        final /* synthetic */ AbstractC23958b f48947r;

        /* renamed from: s */
        final /* synthetic */ ScanQRCodeView f48948s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9228f0(InterfaceC27218a interfaceC27218a, AbstractC23958b abstractC23958b, ScanQRCodeView scanQRCodeView) {
            super(0);
            this.f48946q = interfaceC27218a;
            this.f48947r = abstractC23958b;
            this.f48948s = scanQRCodeView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49358a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49358a() {
            if (this.f48946q.mo35572i0() && !this.f48946q.isDestroyed() && !this.f48946q.isFinishing()) {
                ZaloWebView.Companion.m87171F(this.f48946q, ((C23961e) this.f48947r).m125391j(), new Bundle());
            }
            InterfaceC9256b m49270tN = this.f48948s.m49270tN();
            String m125391j = ((C23961e) this.f48947r).m125391j();
            if (m125391j == null) {
                m125391j = "";
            }
            String m125391j2 = ((C23961e) this.f48947r).m125391j();
            if (m125391j2 == null) {
                m125391j2 = "";
            }
            String m125385g = this.f48947r.m125385g();
            String m125389h = ((C23961e) this.f48947r).m125389h();
            if (m125389h == null) {
                m125389h = "";
            }
            m49270tN.mo49433Em(m125391j, m125391j2, m125385g, m125389h, ((C23961e) this.f48947r).m125390i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g */
    /* loaded from: classes4.dex */
    public static final class C9229g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f48949q;

        /* renamed from: r */
        final /* synthetic */ ScanQRCodeView f48950r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9229g(String str, ScanQRCodeView scanQRCodeView) {
            super(0);
            this.f48949q = str;
            this.f48950r = scanQRCodeView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49359a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49359a() {
            try {
                Intent intent = new Intent("android.intent.action.CALL");
                intent.setData(Uri.parse("tel:" + AbstractC3102n.m15603v(this.f48949q)));
                CoreUtility.getAppContext().startActivity(intent);
            } catch (Exception e11) {
                this.f48950r.m49320jO(AbstractC8020f0.error_general);
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0 */
    /* loaded from: classes4.dex */
    public static final class C9230g0 extends AbstractC9217a {

        /* renamed from: c */
        private final boolean f48951c;

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f48953q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49391a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m49391a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CharSequence f48954q;

            /* renamed from: r */
            final /* synthetic */ String f48955r;

            /* renamed from: s */
            final /* synthetic */ int f48956s;

            /* renamed from: t */
            final /* synthetic */ ScanQRCodeView f48957t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CharSequence charSequence, String str, int i11, ScanQRCodeView scanQRCodeView) {
                super(0);
                this.f48954q = charSequence;
                this.f48955r = str;
                this.f48956s = i11;
                this.f48957t = scanQRCodeView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BottomSheet mo12V4() {
                PhoneNumberSheet phoneNumberSheet = new PhoneNumberSheet();
                CharSequence charSequence = this.f48954q;
                String str = this.f48955r;
                int i11 = this.f48956s;
                ScanQRCodeView scanQRCodeView = this.f48957t;
                phoneNumberSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("name", "sheet-phone-number"), AbstractC24866w.m129235a("body-title", charSequence), AbstractC24866w.m129235a("body", str), AbstractC24866w.m129235a("source-scan", Integer.valueOf(i11))));
                AbstractC25247c.m130673a(phoneNumberSheet, scanQRCodeView.f48926v1);
                return phoneNumberSheet;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ AbstractC23490m f48958q;

            /* renamed from: r */
            final /* synthetic */ int f48959r;

            /* renamed from: s */
            final /* synthetic */ ScanQRCodeView f48960s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC23490m abstractC23490m, int i11, ScanQRCodeView scanQRCodeView) {
                super(0);
                this.f48958q = abstractC23490m;
                this.f48959r = i11;
                this.f48960s = scanQRCodeView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BottomSheet mo12V4() {
                TextSheet textSheet = new TextSheet();
                AbstractC23490m abstractC23490m = this.f48958q;
                int i11 = this.f48959r;
                ScanQRCodeView scanQRCodeView = this.f48960s;
                textSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("name", "sheet-text"), AbstractC24866w.m129235a("body", abstractC23490m.m123294b()), AbstractC24866w.m129235a("source-scan", Integer.valueOf(i11))));
                AbstractC25247c.m130673a(textSheet, scanQRCodeView.f48926v1);
                return textSheet;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ AbstractC23490m f48961q;

            /* renamed from: r */
            final /* synthetic */ int f48962r;

            /* renamed from: s */
            final /* synthetic */ ScanQRCodeView f48963s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AbstractC23490m abstractC23490m, int i11, ScanQRCodeView scanQRCodeView) {
                super(0);
                this.f48961q = abstractC23490m;
                this.f48962r = i11;
                this.f48963s = scanQRCodeView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BottomSheet mo12V4() {
                LinkSheet linkSheet = new LinkSheet();
                AbstractC23490m abstractC23490m = this.f48961q;
                int i11 = this.f48962r;
                ScanQRCodeView scanQRCodeView = this.f48963s;
                linkSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("name", "sheet-link"), AbstractC24866w.m129235a("body-title", abstractC23490m.m123294b()), AbstractC24866w.m129235a("body", abstractC23490m.m123294b()), AbstractC24866w.m129235a("source-scan", Integer.valueOf(i11))));
                AbstractC25247c.m130673a(linkSheet, scanQRCodeView.f48926v1);
                return linkSheet;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f48964q;

            /* renamed from: r */
            final /* synthetic */ String f48965r;

            /* renamed from: s */
            final /* synthetic */ String f48966s;

            /* renamed from: t */
            final /* synthetic */ String f48967t;

            /* renamed from: u */
            final /* synthetic */ int f48968u;

            /* renamed from: v */
            final /* synthetic */ ScanQRCodeView f48969v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, String str2, String str3, String str4, int i11, ScanQRCodeView scanQRCodeView) {
                super(0);
                this.f48964q = str;
                this.f48965r = str2;
                this.f48966s = str3;
                this.f48967t = str4;
                this.f48968u = i11;
                this.f48969v = scanQRCodeView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BottomSheet mo12V4() {
                LinkSheet linkSheet = new LinkSheet();
                String str = this.f48964q;
                String str2 = this.f48965r;
                String str3 = this.f48966s;
                String str4 = this.f48967t;
                int i11 = this.f48968u;
                ScanQRCodeView scanQRCodeView = this.f48969v;
                linkSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("name", "sheet-link"), AbstractC24866w.m129235a("body-title", str), AbstractC24866w.m129235a("body-subtitle", str2), AbstractC24866w.m129235a("body-thumb", str3), AbstractC24866w.m129235a("body", str4), AbstractC24866w.m129235a("source-scan", Integer.valueOf(i11))));
                AbstractC25247c.m130673a(linkSheet, scanQRCodeView.f48926v1);
                return linkSheet;
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$f */
        /* loaded from: classes4.dex */
        public static final class f implements QRCodeResultViewDialog.InterfaceC7995b {

            /* renamed from: a */
            final /* synthetic */ String f48970a;

            /* renamed from: b */
            final /* synthetic */ ScanQRCodeView f48971b;

            f(String str, ScanQRCodeView scanQRCodeView) {
                this.f48970a = str;
                this.f48971b = scanQRCodeView;
            }

            @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
            /* renamed from: a */
            public void mo43049a(DialogView dialogView) {
                Object m129218b;
                AbstractC19074t.m100208f(dialogView, "dialog");
                if (!dialogView.m92687sJ()) {
                    dialogView = null;
                }
                if (dialogView != null) {
                    try {
                        C24861r.a aVar = C24861r.f119264q;
                        dialogView.dismiss();
                        m129218b = C24861r.m129218b(C24848g0.f119245a);
                    } catch (Throwable th2) {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                    }
                    C24861r.m129217a(m129218b);
                }
            }

            @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
            /* renamed from: b */
            public void mo43050b(DialogView dialogView) {
                Object m129218b;
                AbstractC19074t.m100208f(dialogView, "dialog");
                if (!dialogView.m92687sJ()) {
                    dialogView = null;
                }
                if (dialogView != null) {
                    try {
                        C24861r.a aVar = C24861r.f119264q;
                        dialogView.dismiss();
                        m129218b = C24861r.m129218b(C24848g0.f119245a);
                    } catch (Throwable th2) {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                    }
                    C24861r.m129217a(m129218b);
                }
            }

            @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
            /* renamed from: c */
            public void mo43051c(DialogView dialogView) {
                Object m129218b;
                AbstractC19074t.m100208f(dialogView, "dialog");
                if (!dialogView.m92687sJ()) {
                    dialogView = null;
                }
                if (dialogView != null) {
                    String str = this.f48970a;
                    ScanQRCodeView scanQRCodeView = this.f48971b;
                    try {
                        C24861r.a aVar = C24861r.f119264q;
                        dialogView.dismiss();
                        Intent intent = new Intent();
                        intent.putExtra("extra_result_qr_content", str);
                        scanQRCodeView.mo50035CK(-1, intent);
                        scanQRCodeView.mo49313Zg();
                        m129218b = C24861r.m129218b(C24848g0.f119245a);
                    } catch (Throwable th2) {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                    }
                    C24861r.m129217a(m129218b);
                }
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$g */
        /* loaded from: classes4.dex */
        public static final class g extends C17487o0.j {

            /* renamed from: a */
            final /* synthetic */ ScanQRCodeView f48972a;

            g(ScanQRCodeView scanQRCodeView) {
                this.f48972a = scanQRCodeView;
            }

            @Override // com.zing.zalo.zview.C17487o0.j
            /* renamed from: c */
            public void mo37232c(C17487o0 c17487o0, ZaloView zaloView) {
                AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
                AbstractC19074t.m100208f(zaloView, "zaloView");
                if (AbstractC19074t.m100204b(zaloView.m92654ZI(), "result-dialog-view")) {
                    this.f48972a.m92649TI().m93075n2(this);
                    this.f48972a.m49270tN().mo49459g6(true);
                }
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$h */
        /* loaded from: classes4.dex */
        static final class h extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: r */
            final /* synthetic */ JSONObject f48974r;

            /* renamed from: s */
            final /* synthetic */ Bundle f48975s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(JSONObject jSONObject, Bundle bundle) {
                super(0);
                this.f48974r = jSONObject;
                this.f48975s = bundle;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public static final void m49397c(C9230g0 c9230g0, JSONObject jSONObject, Bundle bundle) {
                AbstractC19074t.m100208f(c9230g0, "this$0");
                AbstractC19074t.m100208f(jSONObject, "$zinstantSocketData");
                AbstractC19074t.m100208f(bundle, "$extraBundle");
                C9230g0.super.mo49380l0(jSONObject, bundle);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49398b();
                return C24848g0.f119245a;
            }

            /* renamed from: b */
            public final void m49398b() {
                final C9230g0 c9230g0 = C9230g0.this;
                final JSONObject jSONObject = this.f48974r;
                final Bundle bundle = this.f48975s;
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.qrcode.ui.scan.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanQRCodeView.C9230g0.h.m49397c(ScanQRCodeView.C9230g0.this, jSONObject, bundle);
                    }
                });
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$i */
        /* loaded from: classes4.dex */
        static final class i extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC27218a f48976q;

            /* renamed from: r */
            final /* synthetic */ C19609h f48977r;

            /* renamed from: s */
            final /* synthetic */ C18620i f48978s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(InterfaceC27218a interfaceC27218a, C19609h c19609h, C18620i c18620i) {
                super(0);
                this.f48976q = interfaceC27218a;
                this.f48977r = c19609h;
                this.f48978s = c18620i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public static final void m49400c(InterfaceC27218a interfaceC27218a, C19609h c19609h, C18620i c18620i) {
                AbstractC19074t.m100208f(interfaceC27218a, "$activity");
                AbstractC19074t.m100208f(c19609h, "$miniProgramInfo");
                if (interfaceC27218a.mo35572i0() && !interfaceC27218a.isDestroyed() && !interfaceC27218a.isFinishing()) {
                    WebBaseView.Companion.m86843s(interfaceC27218a, c19609h, null, c18620i);
                }
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49401b();
                return C24848g0.f119245a;
            }

            /* renamed from: b */
            public final void m49401b() {
                final InterfaceC27218a interfaceC27218a = this.f48976q;
                final C19609h c19609h = this.f48977r;
                final C18620i c18620i = this.f48978s;
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.qrcode.ui.scan.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanQRCodeView.C9230g0.i.m49400c(InterfaceC27218a.this, c19609h, c18620i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$j */
        /* loaded from: classes4.dex */
        public static final class j extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ScanQRCodeView f48979q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(ScanQRCodeView scanQRCodeView) {
                super(1);
                this.f48979q = scanQRCodeView;
            }

            /* renamed from: a */
            public final void m49402a(InterfaceC1801w interfaceC1801w) {
                AbstractC19074t.m100208f(interfaceC1801w, "it");
                this.f48979q.m49270tN().mo49459g6(true);
                this.f48979q.m49270tN().mo49453am(1000);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m49402a((InterfaceC1801w) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$g0$k */
        /* loaded from: classes4.dex */
        public static final class k extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ScanQRCodeView f48980q;

            /* renamed from: r */
            final /* synthetic */ Bundle f48981r;

            /* renamed from: s */
            final /* synthetic */ InterfaceC27218a f48982s;

            /* renamed from: t */
            final /* synthetic */ Class f48983t;

            /* renamed from: u */
            final /* synthetic */ int f48984u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(ScanQRCodeView scanQRCodeView, Bundle bundle, InterfaceC27218a interfaceC27218a, Class cls, int i11) {
                super(0);
                this.f48980q = scanQRCodeView;
                this.f48981r = bundle;
                this.f48982s = interfaceC27218a;
                this.f48983t = cls;
                this.f48984u = i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public static final void m49404c(ScanQRCodeView scanQRCodeView, Bundle bundle, InterfaceC27218a interfaceC27218a, Class cls, int i11) {
                C17487o0 mo35579p;
                int i12;
                AbstractC19074t.m100208f(scanQRCodeView, "this$0");
                AbstractC19074t.m100208f(bundle, "$data");
                AbstractC19074t.m100208f(interfaceC27218a, "$activity");
                AbstractC19074t.m100208f(cls, "$cls");
                if (!scanQRCodeView.m49279yN() && bundle.getInt("SHOW_WITH_FLAGS") == 33554432) {
                    bundle.remove("SHOW_WITH_FLAGS");
                }
                if (interfaceC27218a.mo35572i0() && !interfaceC27218a.isDestroyed() && !interfaceC27218a.isFinishing() && (mo35579p = interfaceC27218a.mo35579p()) != null) {
                    if (i11 == -1) {
                        i12 = ZAbstractBase.ZVU_BLEND_PERCENTAGE;
                    } else {
                        i12 = i11;
                    }
                    mo35579p.m93066i2(cls, bundle, i12, 1, true);
                }
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49405b();
                return C24848g0.f119245a;
            }

            /* renamed from: b */
            public final void m49405b() {
                final ScanQRCodeView scanQRCodeView = this.f48980q;
                final Bundle bundle = this.f48981r;
                final InterfaceC27218a interfaceC27218a = this.f48982s;
                final Class cls = this.f48983t;
                final int i11 = this.f48984u;
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.qrcode.ui.scan.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanQRCodeView.C9230g0.k.m49404c(ScanQRCodeView.this, bundle, interfaceC27218a, cls, i11);
                    }
                });
            }
        }

        C9230g0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public static final void m49364t0(ScanQRCodeView scanQRCodeView, JSONObject jSONObject, boolean z11) {
            AbstractC19074t.m100208f(scanQRCodeView, "this$0");
            AbstractC19074t.m100208f(jSONObject, "$data");
            if (scanQRCodeView.m49279yN()) {
                scanQRCodeView.f48920p1 = jSONObject;
                scanQRCodeView.m49270tN().mo49446T9(z11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x0 */
        public static final void m49365x0(ScanQRCodeView scanQRCodeView, String str, C9230g0 c9230g0) {
            AbstractC19074t.m100208f(scanQRCodeView, "this$0");
            AbstractC19074t.m100208f(str, "$resultValue");
            AbstractC19074t.m100208f(c9230g0, "this$1");
            if (scanQRCodeView.m49279yN()) {
                C8010k.a aVar = new C8010k.a(scanQRCodeView.m92689tK());
                aVar.m43047f(AbstractC8020f0.str_yes);
                aVar.m43045d(AbstractC8020f0.str_no);
                aVar.m43048g(AbstractC8020f0.str_titleDlg2);
                aVar.m43046e(scanQRCodeView.m92653YI(AbstractC8020f0.qrcode_send_raw_content_dialog_msg, str));
                aVar.m43044c(new f(str, scanQRCodeView));
                c9230g0.m117341Z(aVar.m43042a());
                QRCodeResultViewDialog m117340S = c9230g0.m117340S();
                if (m117340S != null) {
                    scanQRCodeView.m92649TI().m92997E1(new g(scanQRCodeView), false);
                    scanQRCodeView.m49270tN().mo49459g6(false);
                    m117340S.m92602UK(scanQRCodeView.m92649TI(), "result-dialog-view");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z0 */
        public static final void m49366z0(C9230g0 c9230g0, C20096c c20096c, AbstractC23490m abstractC23490m, int i11, ScanQRCodeView scanQRCodeView) {
            AbstractC19074t.m100208f(c9230g0, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errMsg");
            AbstractC19074t.m100208f(abstractC23490m, "$preData");
            AbstractC19074t.m100208f(scanQRCodeView, "this$1");
            super.mo49381m(c20096c, abstractC23490m, i11);
            QRCodeResultViewDialog m117340S = c9230g0.m117340S();
            if (m117340S == null) {
                return;
            }
            scanQRCodeView.m49270tN().mo49459g6(false);
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            AbstractC1785o lifecycle = m117340S.getLifecycle();
            AbstractC19074t.m100207e(lifecycle, "<get-lifecycle>(...)");
            scanQRUIUtils.m49631n(lifecycle, AbstractC1785o.a.ON_DESTROY, new j(scanQRCodeView));
        }

        @Override // ly.AbstractC22687v
        /* renamed from: R */
        public InterfaceC27218a mo49367R() {
            return ScanQRCodeView.this.m92676n2();
        }

        @Override // ly.AbstractC22687v
        /* renamed from: T */
        public int mo49368T() {
            C17487o0 m92662fJ;
            if (!mo49369U().mo60294yp() && (m92662fJ = mo49369U().m92662fJ()) != null && m92662fJ.m93018M0() == 1) {
                return 33554432;
            }
            return 134217728;
        }

        @Override // ly.AbstractC22687v
        /* renamed from: U */
        public BaseZaloView mo49369U() {
            return ScanQRCodeView.this;
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: a */
        public void mo49370a(int i11) {
            if (i11 == -2 || i11 == 1) {
                try {
                    if (ScanQRCodeView.this.m49279yN()) {
                        ScanQRCodeView.this.m49221ZN(a.f48953q);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: b */
        public void mo49371b() {
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: e */
        public void mo49372e(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: f */
        public void mo49373f(C19609h c19609h, C18620i c18620i) {
            AbstractC19074t.m100208f(c19609h, "miniProgramInfo");
            InterfaceC27218a m92676n2 = ScanQRCodeView.this.m92676n2();
            if (m92676n2 != null) {
                ScanQRCodeView.this.m49221ZN(new i(m92676n2, c19609h, c18620i));
            }
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: g */
        public void mo49374g(int i11) {
            ScanQRCodeView.this.m49320jO(i11);
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: h */
        public boolean mo49375h() {
            return true;
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: i */
        public void mo49376i(int i11) {
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: j */
        public boolean mo49377j(AbstractC23490m abstractC23490m) {
            AbstractC19074t.m100208f(abstractC23490m, "data");
            return ScanQRCodeView.this.m49270tN().mo49437Jd(abstractC23490m.m123293a());
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: k */
        public void mo49378k(AbstractC23490m abstractC23490m, C20096c c20096c, int i11) {
            AbstractC19074t.m100208f(abstractC23490m, "result");
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            mo49382n(abstractC23490m, i11);
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: l */
        public void mo49379l(AbstractC23490m abstractC23490m, String str, String str2, String str3, int i11) {
            int i12;
            AbstractC19074t.m100208f(abstractC23490m, "result");
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "domain");
            AbstractC19074t.m100208f(str3, "thumbUrl");
            String m123294b = abstractC23490m.m123294b();
            if (i11 == 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            m49388v0(m123294b, str, str2, str3, i12);
        }

        @Override // ly.AbstractC22687v
        /* renamed from: l0 */
        public void mo49380l0(JSONObject jSONObject, Bundle bundle) {
            AbstractC19074t.m100208f(jSONObject, "zinstantSocketData");
            AbstractC19074t.m100208f(bundle, "extraBundle");
            ScanQRCodeView.this.m49221ZN(new h(jSONObject, bundle));
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: m */
        public void mo49381m(C20096c c20096c, AbstractC23490m abstractC23490m, int i11) {
            AbstractC19074t.m100208f(c20096c, "errMsg");
            AbstractC19074t.m100208f(abstractC23490m, "preData");
            ScanQRCodeView.this.m49270tN().mo49457f7(AbstractC26412d.Companion.m136248w(c20096c), abstractC23490m, i11);
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: n */
        public void mo49382n(AbstractC23490m abstractC23490m, int i11) {
            AbstractC19074t.m100208f(abstractC23490m, "result");
            int i12 = 1;
            if (i11 != 1) {
                i12 = 2;
            }
            m49387u0(abstractC23490m, i12);
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: o */
        public void mo49383o(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, JSONObject jSONObject) {
            AbstractC19074t.m100208f(str, "pcName");
            ScanQRCodeView.this.m49270tN().mo49430B4();
            super.mo49383o(str, str2, str3, str4, str5, str6, str7, z11, z12, jSONObject);
        }

        @Override // ly.AbstractC22687v, ly.InterfaceC22668c
        /* renamed from: p */
        public void mo49384p(String str, int i11, String str2, C31877d c31877d) {
            Object m129218b;
            String str3;
            JSONObject jSONObject;
            AbstractC19074t.m100208f(str, "strAction");
            AbstractC19074t.m100208f(str2, "itemData");
            if (AbstractC19074t.m100204b("action.mp.join.wifi", str)) {
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    if (str2.length() > 0) {
                        jSONObject = new JSONObject(str2);
                    } else {
                        jSONObject = null;
                    }
                    m129218b = C24861r.m129218b(jSONObject);
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                if (C24861r.m129223g(m129218b)) {
                    m129218b = null;
                }
                JSONObject jSONObject2 = (JSONObject) m129218b;
                if (AbstractC28207v1.m141987h1(str, str2, jSONObject2, null) && jSONObject2 != null) {
                    if (ScanQRCodeView.this.m49270tN().mo49441Mh()) {
                        str3 = "wifi_join_from_qr_code";
                    } else {
                        str3 = "wifi_join_from_gallery_qr_code";
                    }
                    SensitiveData sensitiveData = new SensitiveData(str3, "scan_qr", null, 4, null);
                    C30955t m150567a = C30955t.Companion.m150567a();
                    Context m92689tK = ScanQRCodeView.this.m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    m150567a.m150565i(m92689tK, ScanQRCodeView.this.f48892C1, jSONObject2, sensitiveData);
                    return;
                }
                ScanQRCodeView.this.m49320jO(AbstractC8020f0.error_general);
                return;
            }
            super.mo49384p(str, i11, str2, c31877d);
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: q */
        public void mo49385q(final JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            final boolean z11 = true;
            if (jSONObject.optInt("callType") != 1) {
                z11 = false;
            }
            final ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: qy.l1
                @Override // java.lang.Runnable
                public final void run() {
                    ScanQRCodeView.C9230g0.m49364t0(ScanQRCodeView.this, jSONObject, z11);
                }
            });
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: u */
        public void mo49386u(Class cls, Bundle bundle, int i11) {
            AbstractC19074t.m100208f(cls, "cls");
            AbstractC19074t.m100208f(bundle, "data");
            InterfaceC27218a m92676n2 = ScanQRCodeView.this.m92676n2();
            if (m92676n2 == null) {
                return;
            }
            ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            scanQRCodeView.m49221ZN(new k(scanQRCodeView, bundle, m92676n2, cls, i11));
        }

        /* renamed from: u0 */
        public void m49387u0(AbstractC23490m abstractC23490m, int i11) {
            AbstractC19074t.m100208f(abstractC23490m, "result");
            if (abstractC23490m instanceof AbstractC23490m.c) {
                String m123300c = ((AbstractC23490m.c) abstractC23490m).m123300c();
                CharSequence m12320c = C2348g0.f9864a.m12320c(m123300c);
                ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
                scanQRCodeView.m49217XN(new b(m12320c, m123300c, i11, scanQRCodeView));
                return;
            }
            if (abstractC23490m instanceof AbstractC23490m.e) {
                ScanQRCodeView scanQRCodeView2 = ScanQRCodeView.this;
                scanQRCodeView2.m49217XN(new c(abstractC23490m, i11, scanQRCodeView2));
            } else if (this.f48951c && i11 == 2) {
                mo49386u(ZaloWebView.class, ZaloWebView.Companion.m87179u(abstractC23490m.m123294b()), -1);
            } else {
                ScanQRCodeView scanQRCodeView3 = ScanQRCodeView.this;
                scanQRCodeView3.m49217XN(new d(abstractC23490m, i11, scanQRCodeView3));
            }
        }

        /* renamed from: v0 */
        public void m49388v0(String str, String str2, String str3, String str4, int i11) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "title");
            AbstractC19074t.m100208f(str3, "domain");
            AbstractC19074t.m100208f(str4, "thumbUrl");
            ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            scanQRCodeView.m49217XN(new e(str2, str3, str4, str, i11, scanQRCodeView));
        }

        /* renamed from: w0 */
        public void m49389w0(final String str) {
            AbstractC19074t.m100208f(str, "resultValue");
            final ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: qy.m1
                @Override // java.lang.Runnable
                public final void run() {
                    ScanQRCodeView.C9230g0.m49365x0(ScanQRCodeView.this, str, this);
                }
            });
        }

        /* renamed from: y0 */
        public void m49390y0(final C20096c c20096c, final AbstractC23490m abstractC23490m, final int i11) {
            AbstractC19074t.m100208f(c20096c, "errMsg");
            AbstractC19074t.m100208f(abstractC23490m, "preData");
            final ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: qy.k1
                @Override // java.lang.Runnable
                public final void run() {
                    ScanQRCodeView.C9230g0.m49366z0(ScanQRCodeView.C9230g0.this, c20096c, abstractC23490m, i11, scanQRCodeView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$h */
    /* loaded from: classes4.dex */
    public static final class C9231h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f48985q;

        /* renamed from: r */
        final /* synthetic */ C19059j0 f48986r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f48987s;

        /* renamed from: t */
        final /* synthetic */ boolean f48988t;

        /* renamed from: u */
        final /* synthetic */ int f48989u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f48990v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9231h(int i11, C19059j0 c19059j0, C19059j0 c19059j02, boolean z11, int i12, C19059j0 c19059j03) {
            super(0);
            this.f48985q = i11;
            this.f48986r = c19059j0;
            this.f48987s = c19059j02;
            this.f48988t = z11;
            this.f48989u = i12;
            this.f48990v = c19059j03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m49407c(int i11, C19059j0 c19059j0, C19059j0 c19059j02, boolean z11, int i12, C19059j0 c19059j03) {
            AbstractC19074t.m100208f(c19059j0, "$oaName");
            AbstractC19074t.m100208f(c19059j02, "$oaAvatar");
            AbstractC19074t.m100208f(c19059j03, "$info");
            AbstractC23306f.m120722w0().m101508a(new C2279a.a(String.valueOf(i11), (String) c19059j0.f94941p, (String) c19059j02.f94941p, z11, i12, (String) c19059j03.f94941p));
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49408b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m49408b() {
            final int i11 = this.f48985q;
            final C19059j0 c19059j0 = this.f48986r;
            final C19059j0 c19059j02 = this.f48987s;
            final boolean z11 = this.f48988t;
            final int i12 = this.f48989u;
            final C19059j0 c19059j03 = this.f48990v;
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.qrcode.ui.scan.d
                @Override // java.lang.Runnable
                public final void run() {
                    ScanQRCodeView.C9231h.m49407c(i11, c19059j0, c19059j02, z11, i12, c19059j03);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$h0 */
    /* loaded from: classes4.dex */
    public static final class C9232h0 implements C24129m.a {
        C9232h0() {
        }

        @Override // o80.C24129m.a
        /* renamed from: a */
        public void mo49409a(boolean z11) {
            C24130n c24130n;
            C24130n c24130n2;
            C21697g m126097y1;
            C24130n.a aVar;
            C24130n c24130n3;
            C24130n.a m126080C1;
            C2040d c2040d;
            C24130n c24130n4;
            C24130n c24130n5;
            C24130n c24130n6;
            C24130n c24130n7;
            C21697g m126097y12;
            ScanQRCodeView.this.f48899U0 = z11;
            C24130n.a aVar2 = null;
            r2 = null;
            C2040d c2040d2 = null;
            aVar2 = null;
            if (!z11) {
                DecorModuleView decorModuleView = ScanQRCodeView.this.f48895Q0;
                if (decorModuleView != null && (c24130n7 = (C24130n) decorModuleView.getModule()) != null && (m126097y12 = c24130n7.m126097y1()) != null) {
                    m126097y12.m89135c1(new C20516b().mo106594k(1.0f).m106593j(150L));
                }
                DecorModuleView decorModuleView2 = ScanQRCodeView.this.f48895Q0;
                if (decorModuleView2 != null && (c24130n6 = (C24130n) decorModuleView2.getModule()) != null) {
                    aVar = c24130n6.m126080C1();
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.mo44614b1(0);
                }
                DecorModuleView decorModuleView3 = ScanQRCodeView.this.f48895Q0;
                if (decorModuleView3 != null && (c24130n3 = (C24130n) decorModuleView3.getModule()) != null && (m126080C1 = c24130n3.m126080C1()) != null) {
                    ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
                    DecorModuleView decorModuleView4 = ScanQRCodeView.this.f48895Q0;
                    if (decorModuleView4 != null && (c24130n5 = (C24130n) decorModuleView4.getModule()) != null) {
                        c2040d = c24130n5.m126078A1();
                    } else {
                        c2040d = null;
                    }
                    DecorModuleView decorModuleView5 = ScanQRCodeView.this.f48895Q0;
                    if (decorModuleView5 != null && (c24130n4 = (C24130n) decorModuleView5.getModule()) != null) {
                        c2040d2 = c24130n4.m126079B1();
                    }
                    ScanQRUIUtils.m49613i(scanQRUIUtils, m126080C1, c2040d, c2040d2, true, null, 8, null);
                    return;
                }
                return;
            }
            DecorModuleView decorModuleView6 = ScanQRCodeView.this.f48895Q0;
            if (decorModuleView6 != null && (c24130n2 = (C24130n) decorModuleView6.getModule()) != null && (m126097y1 = c24130n2.m126097y1()) != null) {
                m126097y1.m89135c1(new C20516b().mo106594k(0.0f).m106593j(150L));
            }
            DecorModuleView decorModuleView7 = ScanQRCodeView.this.f48895Q0;
            if (decorModuleView7 != null && (c24130n = (C24130n) decorModuleView7.getModule()) != null) {
                aVar2 = c24130n.m126080C1();
            }
            if (aVar2 != null) {
                aVar2.mo44614b1(4);
            }
        }

        @Override // o80.C24129m.a
        /* renamed from: b */
        public void mo49410b() {
            if (ScanQRCodeView.this.f48900V0 && ScanQRCodeView.this.f48899U0) {
                ScanQRCodeView.this.m49270tN().mo49447U0();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$i */
    /* loaded from: classes4.dex */
    static final class C9233i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9233i f48992q = new C9233i();

        C9233i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49411a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49411a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$i0 */
    /* loaded from: classes4.dex */
    public static final class C9234i0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f48994r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$i0$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ScanQRCodeView f48995q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC18494a f48996r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ScanQRCodeView scanQRCodeView, InterfaceC18494a interfaceC18494a) {
                super(0);
                this.f48995q = scanQRCodeView;
                this.f48996r = interfaceC18494a;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49415a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m49415a() {
                this.f48995q.m92649TI().mo93055b2(ModalBottomSheet.Companion.m81935a(), (ZaloView) this.f48996r.mo12V4(), null, 0, "bottom-sheet", 2, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9234i0(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48994r = interfaceC18494a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m49413c(ScanQRCodeView scanQRCodeView, InterfaceC18494a interfaceC18494a) {
            BottomSheet bottomSheet;
            AbstractC19074t.m100208f(scanQRCodeView, "this$0");
            AbstractC19074t.m100208f(interfaceC18494a, "$onCreateBottomSheet");
            if (scanQRCodeView.m49279yN()) {
                a aVar = new a(scanQRCodeView, interfaceC18494a);
                ZaloView m92996E0 = scanQRCodeView.m92649TI().m92996E0("bottom-sheet");
                ModalBottomSheet modalBottomSheet = null;
                if (m92996E0 instanceof BottomSheet) {
                    bottomSheet = (BottomSheet) m92996E0;
                } else {
                    bottomSheet = null;
                }
                if (bottomSheet != null) {
                    AbstractC25247c.m130675c(bottomSheet, scanQRCodeView.f48926v1);
                    AbstractC25247c.m130673a(bottomSheet, new C25246b(aVar));
                    bottomSheet.close();
                    return;
                }
                if (m92996E0 instanceof ModalBottomSheet) {
                    modalBottomSheet = (ModalBottomSheet) m92996E0;
                }
                if (modalBottomSheet != null) {
                    AbstractC25250f.m130680b(modalBottomSheet, scanQRCodeView.f48926v1);
                    AbstractC25250f.m130679a(modalBottomSheet, new C25249e(aVar));
                    modalBottomSheet.m81928iM();
                } else {
                    aVar.mo12V4();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49414b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m49414b() {
            final ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
            final InterfaceC18494a interfaceC18494a = this.f48994r;
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.qrcode.ui.scan.h
                @Override // java.lang.Runnable
                public final void run() {
                    ScanQRCodeView.C9234i0.m49413c(ScanQRCodeView.this, interfaceC18494a);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$j */
    /* loaded from: classes4.dex */
    public static final class C9235j extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f48997p;

        /* renamed from: q */
        final /* synthetic */ View f48998q;

        /* renamed from: r */
        final /* synthetic */ Runnable f48999r;

        C9235j(boolean z11, View view, Runnable runnable) {
            this.f48997p = z11;
            this.f48998q = view;
            this.f48999r = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (this.f48997p) {
                this.f48998q.setLayerType(0, null);
            }
            Runnable runnable = this.f48999r;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (this.f48997p) {
                this.f48998q.setLayerType(2, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$j0 */
    /* loaded from: classes4.dex */
    public static final class C9236j0 extends Snackbar.AbstractC16924b {
        C9236j0() {
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.AbstractC16924b
        /* renamed from: a */
        public void mo49166a(Snackbar snackbar, int i11) {
            if (i11 == 2) {
                ScanQRCodeView.this.m49270tN().mo49464o9();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$k */
    /* loaded from: classes4.dex */
    static final class C9237k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC27218a f49001q;

        /* renamed from: r */
        final /* synthetic */ C30955t.b f49002r;

        /* renamed from: s */
        final /* synthetic */ C18616e f49003s;

        /* renamed from: t */
        final /* synthetic */ ScanQRCodeView f49004t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9237k(InterfaceC27218a interfaceC27218a, C30955t.b bVar, C18616e c18616e, ScanQRCodeView scanQRCodeView) {
            super(0);
            this.f49001q = interfaceC27218a;
            this.f49002r = bVar;
            this.f49003s = c18616e;
            this.f49004t = scanQRCodeView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49416a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49416a() {
            C30955t.b bVar;
            if (this.f49001q.mo35572i0() && !this.f49001q.isDestroyed() && !this.f49001q.isFinishing() && (bVar = this.f49002r) != null) {
                bVar.mo150540a(this.f49001q, true);
            }
            if (this.f49003s != null) {
                this.f49004t.m49270tN().mo49435Ic("", this.f49003s.m98376e(), this.f49003s.m98372a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$k0 */
    /* loaded from: classes4.dex */
    public static final class C9238k0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$k0$a */
        /* loaded from: classes4.dex */
        public static final class a extends BottomSheet.AbstractC16910a {

            /* renamed from: a */
            final /* synthetic */ ScanQRCodeView f49006a;

            public a(ScanQRCodeView scanQRCodeView) {
                this.f49006a = scanQRCodeView;
            }

            @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
            /* renamed from: a */
            public void mo45955a() {
                this.f49006a.m49270tN().mo49464o9();
            }

            @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
            /* renamed from: b */
            public void mo45956b() {
            }
        }

        C9238k0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49417a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49417a() {
            Bundle m7340a = AbstractC1438d.m7340a();
            ReportBadQRSheet reportBadQRSheet = new ReportBadQRSheet();
            AbstractC25250f.m130679a(reportBadQRSheet, new a(ScanQRCodeView.this));
            ScanQRCodeView.this.m92649TI().mo93055b2(AbstractC6918a0.rootView, reportBadQRSheet, m7340a, 0, "bottom-sheet", 2, true);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$l */
    /* loaded from: classes4.dex */
    static final class C9239l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC27218a f49007q;

        /* renamed from: r */
        final /* synthetic */ String f49008r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9239l(InterfaceC27218a interfaceC27218a, String str) {
            super(0);
            this.f49007q = interfaceC27218a;
            this.f49008r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49418a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49418a() {
            ScanQRUIUtils.f49155a.m49618C(this.f49007q, this.f49008r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$l0 */
    /* loaded from: classes4.dex */
    public static final class C9240l0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C23488k f49009q;

        /* renamed from: r */
        final /* synthetic */ ScanQRCodeView f49010r;

        /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$l0$a */
        /* loaded from: classes4.dex */
        public static final class a extends BottomSheet.AbstractC16910a {

            /* renamed from: a */
            final /* synthetic */ ScanQRCodeView f49011a;

            public a(ScanQRCodeView scanQRCodeView) {
                this.f49011a = scanQRCodeView;
            }

            @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
            /* renamed from: a */
            public void mo45955a() {
                this.f49011a.m49270tN().mo49431Bi();
            }

            @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
            /* renamed from: b */
            public void mo45956b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9240l0(C23488k c23488k, ScanQRCodeView scanQRCodeView) {
            super(0);
            this.f49009q = c23488k;
            this.f49010r = scanQRCodeView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49419a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49419a() {
            PCLoginErrorSheet pCLoginErrorSheet = new PCLoginErrorSheet();
            Bundle m7340a = AbstractC1438d.m7340a();
            m7340a.putString("body-title", this.f49009q.m123285f());
            m7340a.putString("body-subtitle", this.f49009q.m123281b());
            m7340a.putCharSequence("body-sub-subtitle", this.f49009q.m123286g());
            m7340a.putString("primary-button", this.f49009q.m123280a());
            AbstractC25250f.m130679a(pCLoginErrorSheet, new a(this.f49010r));
            AbstractC25250f.m130679a(pCLoginErrorSheet, this.f49010r.f48926v1);
            this.f49010r.m92649TI().mo93055b2(AbstractC6918a0.rootView, pCLoginErrorSheet, m7340a, 0, "bottom-sheet", 2, true);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$m */
    /* loaded from: classes4.dex */
    static final class C9241m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC27218a f49012q;

        /* renamed from: r */
        final /* synthetic */ String f49013r;

        /* renamed from: s */
        final /* synthetic */ ScanQRCodeView f49014s;

        /* renamed from: t */
        final /* synthetic */ String f49015t;

        /* renamed from: u */
        final /* synthetic */ String f49016u;

        /* renamed from: v */
        final /* synthetic */ String f49017v;

        /* renamed from: w */
        final /* synthetic */ String f49018w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9241m(InterfaceC27218a interfaceC27218a, String str, ScanQRCodeView scanQRCodeView, String str2, String str3, String str4, String str5) {
            super(0);
            this.f49012q = interfaceC27218a;
            this.f49013r = str;
            this.f49014s = scanQRCodeView;
            this.f49015t = str2;
            this.f49016u = str3;
            this.f49017v = str4;
            this.f49018w = str5;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49420a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49420a() {
            if (this.f49012q.mo35572i0() && !this.f49012q.isDestroyed() && !this.f49012q.isFinishing()) {
                ZaloWebView.Companion.m87171F(this.f49012q, this.f49013r, new Bundle());
            }
            this.f49014s.m49270tN().mo49433Em(this.f49015t, this.f49013r, this.f49016u, this.f49017v, this.f49018w);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$n */
    /* loaded from: classes4.dex */
    public static final class C9242n extends BottomSheet.AbstractC16910a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC27218a f49019a;

        public C9242n(InterfaceC27218a interfaceC27218a) {
            this.f49019a = interfaceC27218a;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (this.f49019a.mo35572i0() && !this.f49019a.isDestroyed() && !this.f49019a.isFinishing()) {
                ScanQRUIUtils.f49155a.m49627j(this.f49019a);
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$o */
    /* loaded from: classes4.dex */
    public static final class C9243o extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC27218a f49021b;

        /* renamed from: c */
        final /* synthetic */ String f49022c;

        public C9243o(InterfaceC27218a interfaceC27218a, String str) {
            this.f49021b = interfaceC27218a;
            this.f49022c = str;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (ScanQRCodeView.this.m49279yN()) {
                ScanQRCodeView.this.m49195MN(new C9239l(this.f49021b, this.f49022c));
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$p */
    /* loaded from: classes4.dex */
    public static final class C9244p extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC27218a f49024b;

        /* renamed from: c */
        final /* synthetic */ String f49025c;

        public C9244p(InterfaceC27218a interfaceC27218a, String str) {
            this.f49024b = interfaceC27218a;
            this.f49025c = str;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            C17487o0 mo35579p;
            if (ScanQRCodeView.this.m49279yN() && this.f49024b.mo35572i0() && !this.f49024b.isDestroyed() && !this.f49024b.isFinishing()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("bol_share_in_app", true);
                bundle.putString("linktoShare", this.f49025c);
                bundle.putBoolean("BOL_EXTRA_SHARE_LINK_FROM_SCAN_QR_VIEW", true);
                bundle.putString("STR_LOG_CHAT_TYPE", "0");
                bundle.putString("STR_SOURCE_START_VIEW", "chat_storedmedia");
                InterfaceC27218a m92676n2 = ScanQRCodeView.this.m92676n2();
                if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                    mo35579p.m93069k2(ShareView.class, bundle, 1, true);
                }
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$q */
    /* loaded from: classes4.dex */
    public static final class C9245q extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ String f49027b;

        /* renamed from: c */
        final /* synthetic */ String f49028c;

        /* renamed from: d */
        final /* synthetic */ String f49029d;

        public C9245q(String str, String str2, String str3) {
            this.f49027b = str;
            this.f49028c = str2;
            this.f49029d = str3;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (ScanQRCodeView.this.m49279yN()) {
                Bundle m7341b = AbstractC1438d.m7341b(AbstractC24866w.m129235a("body", this.f49027b), AbstractC24866w.m129235a("source-sheet", this.f49028c), AbstractC24866w.m129235a("source-scan", this.f49029d));
                SubMenuSheet subMenuSheet = new SubMenuSheet();
                AbstractC25250f.m130679a(subMenuSheet, ScanQRCodeView.this.f48926v1);
                AbstractC25250f.m130679a(subMenuSheet, ScanQRCodeView.this.f48927w1);
                ScanQRCodeView.this.m92649TI().mo93055b2(AbstractC6918a0.rootView, subMenuSheet, m7341b, 0, "bottom-sheet", 2, true);
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$r */
    /* loaded from: classes4.dex */
    public static final class C9246r extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ String f49031b;

        /* renamed from: c */
        final /* synthetic */ String f49032c;

        public C9246r(String str, String str2) {
            this.f49031b = str;
            this.f49032c = str2;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (ScanQRCodeView.this.m49279yN()) {
                ScanQRCodeView.this.m49270tN().mo49466pi(this.f49031b);
                InterfaceC9256b m49270tN = ScanQRCodeView.this.m49270tN();
                String str = this.f49031b;
                m49270tN.mo49472z5(str, str, this.f49032c);
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$s */
    /* loaded from: classes4.dex */
    public static final class C9247s extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ String f49034b;

        /* renamed from: c */
        final /* synthetic */ String f49035c;

        /* renamed from: d */
        final /* synthetic */ String f49036d;

        public C9247s(String str, String str2, String str3) {
            this.f49034b = str;
            this.f49035c = str2;
            this.f49036d = str3;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (ScanQRCodeView.this.m49279yN()) {
                Bundle m7341b = AbstractC1438d.m7341b(AbstractC24866w.m129235a("body", this.f49034b), AbstractC24866w.m129235a("source-sheet", this.f49035c), AbstractC24866w.m129235a("source-scan", this.f49036d));
                SubMenuSheet subMenuSheet = new SubMenuSheet();
                AbstractC25250f.m130679a(subMenuSheet, ScanQRCodeView.this.f48926v1);
                AbstractC25250f.m130679a(subMenuSheet, ScanQRCodeView.this.f48927w1);
                ScanQRCodeView.this.m92649TI().mo93055b2(AbstractC6918a0.rootView, subMenuSheet, m7341b, 0, "bottom-sheet", 2, true);
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$t */
    /* loaded from: classes4.dex */
    public static final class C9248t extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ String f49038b;

        /* renamed from: c */
        final /* synthetic */ String f49039c;

        /* renamed from: d */
        final /* synthetic */ String f49040d;

        public C9248t(String str, String str2, String str3) {
            this.f49038b = str;
            this.f49039c = str2;
            this.f49040d = str3;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (ScanQRCodeView.this.m49279yN()) {
                Bundle m7341b = AbstractC1438d.m7341b(AbstractC24866w.m129235a("body", this.f49038b), AbstractC24866w.m129235a("source-sheet", this.f49039c), AbstractC24866w.m129235a("source-scan", this.f49040d));
                SubMenuSheet subMenuSheet = new SubMenuSheet();
                AbstractC25250f.m130679a(subMenuSheet, ScanQRCodeView.this.f48926v1);
                AbstractC25250f.m130679a(subMenuSheet, ScanQRCodeView.this.f48927w1);
                ScanQRCodeView.this.m92649TI().mo93055b2(AbstractC6918a0.rootView, subMenuSheet, m7341b, 0, "bottom-sheet", 2, true);
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$u */
    /* loaded from: classes4.dex */
    public static final class C9249u extends BottomSheet.AbstractC16910a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC27218a f49042b;

        /* renamed from: c */
        final /* synthetic */ C30955t.b f49043c;

        /* renamed from: d */
        final /* synthetic */ C18616e f49044d;

        public C9249u(InterfaceC27218a interfaceC27218a, C30955t.b bVar, C18616e c18616e) {
            this.f49042b = interfaceC27218a;
            this.f49043c = bVar;
            this.f49044d = c18616e;
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            if (ScanQRCodeView.this.m49279yN()) {
                ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
                scanQRCodeView.m49195MN(new C9237k(this.f49042b, this.f49043c, this.f49044d, scanQRCodeView));
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$v */
    /* loaded from: classes4.dex */
    static final class C9250v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9250v f49045q = new C9250v();

        C9250v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49421a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49421a() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$w */
    /* loaded from: classes4.dex */
    static final class C9251w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ BaseZaloActivity f49046q;

        /* renamed from: r */
        final /* synthetic */ ScanQRCodeView f49047r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9251w(BaseZaloActivity baseZaloActivity, ScanQRCodeView scanQRCodeView) {
            super(0);
            this.f49046q = baseZaloActivity;
            this.f49047r = scanQRCodeView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49422a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49422a() {
            this.f49046q.m56680B3(null);
            this.f49047r.m49270tN().mo49449Z2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$x */
    /* loaded from: classes4.dex */
    public static final class C9252x extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC27218a f49048q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9252x(InterfaceC27218a interfaceC27218a) {
            super(0);
            this.f49048q = interfaceC27218a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49423a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49423a() {
            ScanQRUIUtils.f49155a.m49641z(this.f49048q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$y */
    /* loaded from: classes4.dex */
    public static final class C9253y extends AbstractC19075u implements InterfaceC18494a {
        C9253y() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49424a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49424a() {
            Bundle m7340a = AbstractC1438d.m7340a();
            MoreSheet moreSheet = new MoreSheet();
            AbstractC25250f.m130679a(moreSheet, ScanQRCodeView.this.f48926v1);
            AbstractC25250f.m130679a(moreSheet, ScanQRCodeView.this.f48927w1);
            ScanQRCodeView.this.m92649TI().mo93055b2(AbstractC6918a0.rootView, moreSheet, m7340a, 0, "bottom-sheet", 2, true);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.ScanQRCodeView$z */
    /* loaded from: classes4.dex */
    static final class C9254z extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        final /* synthetic */ Rect f49050q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9254z(Rect rect) {
            super(4);
            this.f49050q = rect;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m49425a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49425a(int i11, int i12, int i13, int i14) {
            this.f49050q.set(i11, i12, i13, i14);
        }
    }

    public ScanQRCodeView() {
        InterfaceC24854k m129210a;
        List m131505m;
        m129210a = AbstractC24856m.m129210a(new C9226e0());
        this.f48897S0 = m129210a;
        this.f48900V0 = true;
        this.f48903Y0 = new Matrix();
        this.f48905a1 = new float[0];
        m131505m = AbstractC25368s.m131505m(0, 2);
        this.f48907c1 = m131505m;
        this.f48908d1 = new Rect();
        this.f48909e1 = new Rect();
        this.f48910f1 = true;
        this.f48912h1 = C9233i.f48992q;
        this.f48915k1 = new C9232h0();
        this.f48916l1 = new C9223d();
        this.f48917m1 = new C9219b();
        this.f48918n1 = "";
        this.f48919o1 = new C9221c();
        this.f48921q1 = new Runnable() { // from class: qy.h1
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49236gO(ScanQRCodeView.this);
            }
        };
        this.f48922r1 = new HashSet();
        this.f48923s1 = "general";
        this.f48926v1 = new C9225e();
        this.f48927w1 = new C9220b0();
        this.f48929y1 = new Runnable() { // from class: qy.w
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49253mO(ScanQRCodeView.this);
            }
        };
        this.f48930z1 = new Runnable() { // from class: qy.x
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49276wN(ScanQRCodeView.this);
            }
        };
        this.f48892C1 = new C9227f();
        this.f48893D1 = new C9230g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m49171AN(ScanQRCodeView scanQRCodeView) {
        boolean z11;
        int i11;
        JSONObject optJSONObject;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        try {
            JSONObject jSONObject = scanQRCodeView.f48920p1;
            if (jSONObject == null) {
                scanQRCodeView.m49320jO(AbstractC8020f0.error_general);
                return;
            }
            scanQRCodeView.f48920p1 = null;
            if (!C23055e5.m118272g(false)) {
                scanQRCodeView.m49320jO(AbstractC8020f0.error_general);
                return;
            }
            if (C20024r.m103941j()) {
                scanQRCodeView.m49320jO(AbstractC8020f0.str_warning_make_newcall_while_calling);
                return;
            }
            int optInt = jSONObject.optInt("userId", 0);
            C19059j0 c19059j0 = new C19059j0();
            c19059j0.f94941p = "";
            C19059j0 c19059j02 = new C19059j0();
            c19059j02.f94941p = "";
            if (jSONObject.optInt("callType") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            C19059j0 c19059j03 = new C19059j0();
            c19059j03.f94941p = "";
            if (jSONObject.has("info") && (optJSONObject = jSONObject.optJSONObject("info")) != null) {
                String jSONObject2 = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                c19059j03.f94941p = jSONObject2;
                String string = optJSONObject.getString("avatar");
                AbstractC19074t.m100207e(string, "getString(...)");
                c19059j0.f94941p = string;
                String string2 = optJSONObject.getString("name");
                AbstractC19074t.m100207e(string2, "getString(...)");
                c19059j02.f94941p = string2;
            }
            if (z11) {
                i11 = 26;
            } else {
                i11 = 25;
            }
            scanQRCodeView.m49195MN(new C9231h(optInt, c19059j02, c19059j0, z11, i11, c19059j03));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public static final void m49173BN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            if (scanQRCodeView.f48906b1 == null) {
                scanQRCodeView.m49270tN().mo49469ud();
            }
            scanQRCodeView.m49270tN().mo49461gn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m49175CN(ScanQRCodeView scanQRCodeView, C16719g c16719g) {
        BottomSheet bottomSheet;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            C9253y c9253y = new C9253y();
            ZaloView m92996E0 = scanQRCodeView.m92649TI().m92996E0("bottom-sheet");
            ModalBottomSheet modalBottomSheet = null;
            if (m92996E0 instanceof BottomSheet) {
                bottomSheet = (BottomSheet) m92996E0;
            } else {
                bottomSheet = null;
            }
            if (bottomSheet != null) {
                AbstractC25247c.m130675c(bottomSheet, scanQRCodeView.f48926v1);
                AbstractC25247c.m130673a(bottomSheet, new C25246b(c9253y));
                bottomSheet.close();
                return;
            }
            if (m92996E0 instanceof ModalBottomSheet) {
                modalBottomSheet = (ModalBottomSheet) m92996E0;
            }
            if (modalBottomSheet != null) {
                AbstractC25250f.m130680b(modalBottomSheet, scanQRCodeView.f48926v1);
                AbstractC25250f.m130679a(modalBottomSheet, new C25249e(c9253y));
                modalBottomSheet.m81928iM();
            } else {
                c9253y.mo12V4();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public static final void m49177DN(ScanQRCodeView scanQRCodeView, C16719g c16719g) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        scanQRCodeView.m49270tN().mo49445Qj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public static final void m49179EN(ScanQRCodeView scanQRCodeView, C16719g c16719g) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        scanQRCodeView.m49270tN().mo49452Zo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public static final void m49181FN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        scanQRCodeView.m49270tN().mo49458g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static final void m49183GN(ScanQRCodeView scanQRCodeView, C1421e c1421e) {
        C24130n c24130n;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        AbstractC19074t.m100208f(c1421e, "it");
        int[] iArr = {c1421e.f6230a, c1421e.f6231b, c1421e.f6232c, c1421e.f6233d};
        DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
        if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null) {
            c24130n.m126086I1(iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public static final void m49185HN(ScanQRCodeView scanQRCodeView, C16719g c16719g) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        scanQRCodeView.mo49313Zg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public static final void m49187IN(ScanQRCodeView scanQRCodeView, C16719g c16719g) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        InterfaceC27218a m92692wK = scanQRCodeView.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        scanQRCodeView.m49195MN(new C9252x(m92692wK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public static final void m49189JN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            GalleryPickerDialogView galleryPickerDialogView = new GalleryPickerDialogView();
            galleryPickerDialogView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("extra_photo_type", 8)));
            galleryPickerDialogView.m79282PK(scanQRCodeView.m92649TI(), "GalleryPickerDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public static final void m49191KN(ScanQRCodeView scanQRCodeView) {
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && (m92662fJ = scanQRCodeView.m92662fJ()) != null) {
            m92662fJ.m93069k2(RecentScanQRView.class, AbstractC1438d.m7340a(), 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public static final void m49193LN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        CameraPreviewGLView cameraPreviewGLView = scanQRCodeView.f48896R0;
        if (cameraPreviewGLView != null) {
            cameraPreviewGLView.m39677p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public final void m49195MN(InterfaceC18494a interfaceC18494a) {
        if (m49337xN()) {
            interfaceC18494a.mo12V4();
        } else {
            m49332qN(new C9222c0(interfaceC18494a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public static final void m49197NN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && !scanQRCodeView.m92691vK().performHapticFeedback(0, 2)) {
            ScanQRUIUtils.f49155a.m49622K(30L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public static final void m49199ON(ScanQRCodeView scanQRCodeView) {
        C24130n c24130n;
        C24130n.a m126098z1;
        C2040d c2040d;
        C24130n c24130n2;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
        if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126098z1 = c24130n.m126098z1()) != null) {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            DecorModuleView decorModuleView2 = scanQRCodeView.f48895Q0;
            if (decorModuleView2 != null && (c24130n2 = (C24130n) decorModuleView2.getModule()) != null) {
                c2040d = c24130n2.m126082E1();
            } else {
                c2040d = null;
            }
            ScanQRUIUtils.m49612g(scanQRUIUtils, m126098z1, c2040d, null, 2, null);
        }
        scanQRCodeView.f48914j1 = true;
        scanQRCodeView.m49203QN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PN */
    public static final void m49201PN(ScanQRCodeView scanQRCodeView) {
        C24130n c24130n;
        C24130n.a m126080C1;
        C2040d c2040d;
        C24130n c24130n2;
        C24130n c24130n3;
        C21697g m126097y1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
        if (decorModuleView != null && (c24130n3 = (C24130n) decorModuleView.getModule()) != null && (m126097y1 = c24130n3.m126097y1()) != null) {
            m126097y1.m89135c1(new C20516b().mo106594k(1.0f).m106593j(250L));
        }
        DecorModuleView decorModuleView2 = scanQRCodeView.f48895Q0;
        if (decorModuleView2 != null && (c24130n = (C24130n) decorModuleView2.getModule()) != null && (m126080C1 = c24130n.m126080C1()) != null) {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            DecorModuleView decorModuleView3 = scanQRCodeView.f48895Q0;
            if (decorModuleView3 != null && (c24130n2 = (C24130n) decorModuleView3.getModule()) != null) {
                c2040d = c24130n2.m126081D1();
            } else {
                c2040d = null;
            }
            scanQRUIUtils.m49625f(m126080C1, c2040d, new C9224d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public final void m49203QN() {
        C24130n c24130n;
        C24130n.a m126080C1;
        C2040d c2040d;
        C24130n c24130n2;
        if (this.f48914j1 && this.f48913i1) {
            this.f48914j1 = false;
            this.f48913i1 = false;
            DecorModuleView decorModuleView = this.f48895Q0;
            if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126080C1 = c24130n.m126080C1()) != null) {
                ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
                DecorModuleView decorModuleView2 = this.f48895Q0;
                if (decorModuleView2 != null && (c24130n2 = (C24130n) decorModuleView2.getModule()) != null) {
                    c2040d = c24130n2.m126079B1();
                } else {
                    c2040d = null;
                }
                ScanQRUIUtils.m49612g(scanQRUIUtils, m126080C1, c2040d, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public static final void m49205RN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        CameraPreviewGLView cameraPreviewGLView = scanQRCodeView.f48896R0;
        if (cameraPreviewGLView != null) {
            cameraPreviewGLView.mo39678q();
            C29046a.f134547b = "QrCode";
            AbstractC22470k.m116160l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SN */
    public static final void m49207SN(boolean z11, ScanQRCodeView scanQRCodeView, String str) {
        C24130n c24130n;
        C24130n c24130n2;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        AbstractC19074t.m100208f(str, "$text");
        C21697g c21697g = null;
        if (z11) {
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null && (c24130n2 = (C24130n) decorModuleView.getModule()) != null) {
                c21697g = c24130n2.m126089q1();
            }
        } else {
            DecorModuleView decorModuleView2 = scanQRCodeView.f48895Q0;
            if (decorModuleView2 != null && (c24130n = (C24130n) decorModuleView2.getModule()) != null) {
                c21697g = c24130n.m126090r1();
            }
        }
        if (c21697g != null) {
            c21697g.m111959G1(str);
        }
    }

    /* renamed from: TN */
    private final void m49209TN(C9255a c9255a) {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1053g(this, "ui_v2", true);
        bVar.m1050d(this, "src_open_scan", c9255a.m49428c());
    }

    /* renamed from: UN */
    private final void m49211UN(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.c0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49213VN(ScanQRCodeView.this, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m49213VN(ScanQRCodeView scanQRCodeView, boolean z11) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126059D1(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public static final void m49215WN(ScanQRCodeView scanQRCodeView, String str) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null) {
            c24130n.m126084G1(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XN */
    public final void m49217XN(InterfaceC18494a interfaceC18494a) {
        if (this.f48925u1 == null) {
            this.f48925u1 = new C9234i0(interfaceC18494a);
            m49270tN().mo49444Oo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YN */
    public static final void m49219YN(ScanQRCodeView scanQRCodeView, boolean z11) {
        C16719g c16719g;
        int i11;
        C24130n c24130n;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null) {
                c16719g = c24130n.m126095w1();
            } else {
                c16719g = null;
            }
            if (c16719g != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                c16719g.mo44614b1(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public final void m49221ZN(InterfaceC18494a interfaceC18494a) {
        if (this.f48924t1 == null) {
            this.f48924t1 = interfaceC18494a;
            m49270tN().mo49432C3();
            if (this.f48900V0 && this.f48899U0) {
                m49211UN(true);
            } else {
                m49270tN().mo49447U0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public static final void m49223aO(ScanQRCodeView scanQRCodeView, boolean z11) {
        C16716d c16716d;
        int i11;
        C24130n c24130n;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null) {
                c16716d = c24130n.m126096x1();
            } else {
                c16716d = null;
            }
            if (c16716d != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                c16716d.mo44614b1(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public static final void m49225bO(boolean z11, ScanQRCodeView scanQRCodeView, float[] fArr) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        AbstractC19074t.m100208f(fArr, "$points");
        if (z11 && scanQRCodeView.m92674mJ() && !scanQRCodeView.m92681pJ() && scanQRCodeView.m92685rJ() && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126061F1(fArr, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cO */
    public static final void m49227cO(ScanQRCodeView scanQRCodeView, List list, List list2) {
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
        if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126058A1(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public static final void m49229dO(ScanQRCodeView scanQRCodeView, String str) {
        C21697g c21697g;
        C24130n c24130n;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        AbstractC19074t.m100208f(str, "$text");
        DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
        if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null) {
            c21697g = c24130n.m126091s1();
        } else {
            c21697g = null;
        }
        if (c21697g != null) {
            c21697g.m111959G1(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eO */
    public static final void m49231eO(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        CameraPreviewGLView cameraPreviewGLView = scanQRCodeView.f48896R0;
        if (cameraPreviewGLView != null) {
            C9219b c9219b = scanQRCodeView.f48917m1;
            cameraPreviewGLView.m39727F(0, c9219b, c9219b, scanQRCodeView.f48911g1);
        }
    }

    /* renamed from: fO */
    private final void m49233fO(String str) {
        if (m49279yN()) {
            this.f48922r1.add(str);
            if (!this.f48902X0 && this.f48901W0 == 0) {
                this.f48901W0 = System.currentTimeMillis();
                AbstractC19444a.m101696d(this.f48921q1);
                AbstractC19444a.m101694b(this.f48921q1, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gO */
    public static final void m49236gO(ScanQRCodeView scanQRCodeView) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && !scanQRCodeView.f48902X0 && System.currentTimeMillis() - scanQRCodeView.f48901W0 >= 500 && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126060E1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hO */
    public static final void m49239hO(ScanQRCodeView scanQRCodeView) {
        int i11;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            Snackbar.C16925c c16925c = Snackbar.Companion;
            View m92691vK = scanQRCodeView.m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            Snackbar m90668c = c16925c.m90668c(m92691vK, AbstractC8020f0.str_scan_qr_code_misprint_rescan, -1);
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null) {
                i11 = Integer.valueOf(decorModuleView.getHeight() - ((C24130n) decorModuleView.getModule()).m126087o1().m89098H()).intValue();
            } else {
                i11 = 0;
            }
            m90668c.m90645K(i11);
            m90668c.m90642H(10000);
            m90668c.m90640F(new C9236j0());
            m90668c.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iO */
    public static final void m49242iO(ScanQRCodeView scanQRCodeView) {
        int i11;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            Snackbar.C16925c c16925c = Snackbar.Companion;
            View m92691vK = scanQRCodeView.m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            Snackbar m90668c = c16925c.m90668c(m92691vK, AbstractC8020f0.str_report_qr_report_sent, -1);
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null) {
                i11 = Integer.valueOf(decorModuleView.getHeight() - ((C24130n) decorModuleView.getModule()).m126087o1().m89098H()).intValue();
            } else {
                i11 = 0;
            }
            m90668c.m90645K(i11);
            m90668c.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kO */
    public static final void m49247kO(ScanQRCodeView scanQRCodeView) {
        int i11;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            Snackbar.C16925c c16925c = Snackbar.Companion;
            View m92691vK = scanQRCodeView.m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            Snackbar m90668c = c16925c.m90668c(m92691vK, AbstractC8020f0.str_scan_qr_code_no_qr_in_image_found, -1);
            Context m92689tK = scanQRCodeView.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            m90668c.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2808b.f150829r50));
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null) {
                i11 = Integer.valueOf(decorModuleView.getHeight() - ((C24130n) decorModuleView.getModule()).m126087o1().m89098H()).intValue();
            } else {
                i11 = 0;
            }
            m90668c.m90645K(i11);
            m90668c.m90642H(3000);
            m90668c.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lO */
    public static final void m49250lO(ScanQRCodeView scanQRCodeView) {
        int i11;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            Snackbar.C16925c c16925c = Snackbar.Companion;
            View m92691vK = scanQRCodeView.m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            Snackbar m90668c = c16925c.m90668c(m92691vK, AbstractC8020f0.UNKNOWN_EXCEPTION_MSG, -1);
            Context m92689tK = scanQRCodeView.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            m90668c.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2808b.f150829r50));
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null) {
                i11 = Integer.valueOf(decorModuleView.getHeight() - ((C24130n) decorModuleView.getModule()).m126087o1().m89098H()).intValue();
            } else {
                i11 = 0;
            }
            m90668c.m90645K(i11);
            m90668c.m90642H(3000);
            m90668c.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mO */
    public static final void m49253mO(ScanQRCodeView scanQRCodeView) {
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            String str = scanQRCodeView.f48928x1;
            if (str == null) {
                str = scanQRCodeView.m92689tK().getResources().getString(AbstractC8020f0.str_scan_qr_code_instruction_text);
                scanQRCodeView.f48928x1 = str;
                AbstractC19074t.m100207e(str, "also(...)");
            }
            DecorModuleView decorModuleView = scanQRCodeView.f48895Q0;
            if (decorModuleView != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
                m126083F1.m126063H1(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m49255nN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.f48896R0 == null) {
            CameraPreviewGLView cameraPreviewGLView = new CameraPreviewGLView(scanQRCodeView.m92689tK(), true);
            scanQRCodeView.f48896R0 = cameraPreviewGLView;
            ViewGroup viewGroup = scanQRCodeView.f48894P0;
            if (viewGroup != null) {
                viewGroup.addView(cameraPreviewGLView, 0, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nO */
    public static final void m49256nO(ScanQRCodeView scanQRCodeView) {
        BottomSheet bottomSheet;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            C9238k0 c9238k0 = new C9238k0();
            ZaloView m92996E0 = scanQRCodeView.m92649TI().m92996E0("bottom-sheet");
            ModalBottomSheet modalBottomSheet = null;
            if (m92996E0 instanceof BottomSheet) {
                bottomSheet = (BottomSheet) m92996E0;
            } else {
                bottomSheet = null;
            }
            if (bottomSheet != null) {
                AbstractC25247c.m130675c(bottomSheet, scanQRCodeView.f48926v1);
                AbstractC25247c.m130673a(bottomSheet, new C25246b(c9238k0));
                bottomSheet.close();
                return;
            }
            if (m92996E0 instanceof ModalBottomSheet) {
                modalBottomSheet = (ModalBottomSheet) m92996E0;
            }
            if (modalBottomSheet != null) {
                AbstractC25250f.m130680b(modalBottomSheet, scanQRCodeView.f48926v1);
                AbstractC25250f.m130679a(modalBottomSheet, new C25249e(c9238k0));
                modalBottomSheet.m81928iM();
            } else {
                c9238k0.mo12V4();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m49258oN(boolean z11, ScanQRCodeView scanQRCodeView) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (z11 && scanQRCodeView.m92674mJ() && !scanQRCodeView.m92681pJ() && scanQRCodeView.m92685rJ() && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126061F1(scanQRCodeView.f48905a1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oO */
    public static final void m49259oO(ScanQRCodeView scanQRCodeView, C23488k c23488k) {
        BottomSheet bottomSheet;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        AbstractC19074t.m100208f(c23488k, "$error");
        if (scanQRCodeView.m49279yN()) {
            C9240l0 c9240l0 = new C9240l0(c23488k, scanQRCodeView);
            ZaloView m92996E0 = scanQRCodeView.m92649TI().m92996E0("bottom-sheet");
            ModalBottomSheet modalBottomSheet = null;
            if (m92996E0 instanceof BottomSheet) {
                bottomSheet = (BottomSheet) m92996E0;
            } else {
                bottomSheet = null;
            }
            if (bottomSheet != null) {
                AbstractC25247c.m130675c(bottomSheet, scanQRCodeView.f48926v1);
                AbstractC25247c.m130673a(bottomSheet, new C25246b(c9240l0));
                bottomSheet.close();
                return;
            }
            if (m92996E0 instanceof ModalBottomSheet) {
                modalBottomSheet = (ModalBottomSheet) m92996E0;
            }
            if (modalBottomSheet != null) {
                AbstractC25250f.m130680b(modalBottomSheet, scanQRCodeView.f48926v1);
                AbstractC25250f.m130679a(modalBottomSheet, new C25249e(c9240l0));
                modalBottomSheet.m81928iM();
            } else {
                c9240l0.mo12V4();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m49261pN(ScanQRCodeView scanQRCodeView) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN()) {
            scanQRCodeView.m49264qO();
            if (!scanQRCodeView.m49337xN() || !AbstractC21777d.m112310a(scanQRCodeView.m92693xK(), scanQRCodeView.m92642L3())) {
                scanQRCodeView.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pO */
    public final void m49262pO(Rect rect, Rect rect2, int i11) {
        if (!rect.isEmpty() && !rect2.isEmpty()) {
            this.f48908d1.set(rect);
            if (!m49270tN().mo49460g9() && Math.min(rect2.width(), rect2.height()) >= i11) {
                rect = rect2;
            }
            this.f48909e1.set(rect);
            m49270tN().mo49456d7(true);
            return;
        }
        m49270tN().mo49456d7(false);
    }

    /* renamed from: qO */
    private final void m49264qO() {
        C2040d c2040d;
        C24130n c24130n;
        C24129m m126083F1;
        C24130n c24130n2;
        DecorModuleView decorModuleView = this.f48895Q0;
        C2040d c2040d2 = null;
        if (decorModuleView != null && (c24130n2 = (C24130n) decorModuleView.getModule()) != null) {
            c2040d = c24130n2.m126079B1();
        } else {
            c2040d = null;
        }
        if (c2040d instanceof Animatable) {
            c2040d2 = c2040d;
        }
        if (c2040d2 != null) {
            c2040d2.stop();
        }
        DecorModuleView decorModuleView2 = this.f48895Q0;
        if (decorModuleView2 != null && (c24130n = (C24130n) decorModuleView2.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126064o1();
        }
    }

    /* renamed from: rN */
    private final void m49266rN(String str) {
        if (!m49279yN() || !this.f48922r1.contains(str)) {
            return;
        }
        this.f48922r1.remove(str);
        if (!this.f48922r1.isEmpty()) {
            return;
        }
        AbstractC19444a.m101696d(this.f48921q1);
        this.f48901W0 = 0L;
        this.f48902X0 = false;
        AbstractC19444a.m101695c(new Runnable() { // from class: qy.g1
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49268sN(ScanQRCodeView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m49268sN(ScanQRCodeView scanQRCodeView) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126060E1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final InterfaceC9256b m49270tN() {
        return (InterfaceC9256b) this.f48897S0.getValue();
    }

    /* renamed from: uN */
    private final int m49272uN() {
        View mo35570g0 = m92692wK().mo35570g0();
        Integer num = null;
        if (mo35570g0 != null) {
            Integer valueOf = Integer.valueOf(mo35570g0.getHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        Integer valueOf2 = Integer.valueOf(m92691vK().getHeight());
        if (valueOf2.intValue() > 0) {
            num = valueOf2;
        }
        if (num != null) {
            return num.intValue();
        }
        return AbstractC23136l9.m118716i0(m92689tK());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:            if (r4 != null) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:            if (r4.intValue() > 0) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:            if (r1 == null) goto L46;     */
    /* renamed from: vN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m49274vN(boolean z11) {
        int i11;
        Integer valueOf;
        int[] m49635r;
        ZaloActivity zaloActivity;
        Integer num;
        Window window;
        View decorView;
        Integer num2 = null;
        if (z11) {
            InterfaceC27218a m92692wK = m92692wK();
            if (m92692wK instanceof ZaloActivity) {
                zaloActivity = (ZaloActivity) m92692wK;
            } else {
                zaloActivity = null;
            }
            if (zaloActivity != null && (window = zaloActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                num = Integer.valueOf(decorView.getHeight());
                if (num.intValue() <= 0) {
                    num = null;
                }
            }
            View mo35570g0 = m92692wK().mo35570g0();
            if (mo35570g0 != null) {
                num = Integer.valueOf(mo35570g0.getHeight());
            }
            num = null;
            if (num == null) {
                Integer valueOf2 = Integer.valueOf(m92691vK().getHeight());
                if (valueOf2.intValue() > 0) {
                    num2 = valueOf2;
                }
                if (num2 != null) {
                    return num2.intValue();
                }
                return AbstractC23136l9.m118716i0(m92689tK());
            }
            return num.intValue();
        }
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (m49635r = ScanQRUIUtils.f49155a.m49635r(m92676n2)) != null) {
            i11 = m49635r[3];
        } else {
            i11 = 0;
        }
        View mo35570g02 = m92692wK().mo35570g0();
        if (mo35570g02 != null) {
            valueOf = Integer.valueOf(mo35570g02.getHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
        }
        valueOf = Integer.valueOf(m92691vK().getHeight());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            Integer valueOf3 = Integer.valueOf(valueOf.intValue() - i11);
            if (valueOf3.intValue() > 0) {
                num2 = valueOf3;
            }
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return AbstractC23136l9.m118716i0(m92689tK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public static final void m49276wN(ScanQRCodeView scanQRCodeView) {
        DecorModuleView decorModuleView;
        C24130n c24130n;
        C24129m m126083F1;
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        if (scanQRCodeView.m49279yN() && (decorModuleView = scanQRCodeView.f48895Q0) != null && (c24130n = (C24130n) decorModuleView.getModule()) != null && (m126083F1 = c24130n.m126083F1()) != null) {
            m126083F1.m126063H1("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public final boolean m49279yN() {
        return !mo60294yp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public static final void m49281zN(ScanQRCodeView scanQRCodeView, String str) {
        AbstractC19074t.m100208f(scanQRCodeView, "this$0");
        AbstractC19074t.m100208f(str, "$phone");
        if (scanQRCodeView.m49279yN()) {
            scanQRCodeView.m49195MN(new C9229g(str, scanQRCodeView));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: B8 */
    public void mo49282B8(CharSequence charSequence, boolean z11) {
        m49233fO(this.f48923s1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            C26691l.m137148w();
        }
        C9255a m49429a = C9255a.Companion.m49429a(m92642L3());
        m49270tN().mo995Nd(m49429a, null);
        m49209TN(m49429a);
        this.f48898T0 = new C22688w();
        this.f48911g1 = new SensitiveData("qr_scan", "scan_qr", null, 4, null);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Dj */
    public void mo49283Dj() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.h0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49189JN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Dp */
    public void mo49284Dp() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.i0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49255nN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Ei */
    public void mo49285Ei(final List list, final List list2) {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.w0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49227cO(ScanQRCodeView.this, list, list2);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Ex */
    public void mo49286Ex() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.t0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49247kO(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: F8 */
    public void mo49287F8() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.q0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49250lO(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: FB */
    public long mo49288FB() {
        return 200L;
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Fy */
    public void mo49289Fy() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.v0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49239hO(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: G4 */
    public void mo49290G4() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.a1
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49242iO(ScanQRCodeView.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(AbstractC6918a0.rootView);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        this.f48894P0 = frameLayout;
        Context context = layoutInflater.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Context context2 = layoutInflater.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        DecorModuleView decorModuleView = new DecorModuleView(context, new C24130n(context2, null));
        frameLayout.addView(decorModuleView);
        this.f48895Q0 = decorModuleView;
        View frameLayout2 = new FrameLayout(layoutInflater.getContext());
        frameLayout2.setId(ModalBottomSheet.Companion.m81935a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Gz */
    public void mo49291Gz(final boolean z11, String str, byte[] bArr, final float[] fArr) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(bArr, "rawBytes");
        AbstractC19074t.m100208f(fArr, "points");
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.s0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49225bO(z11, this, fArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        int i11;
        int m49274vN;
        boolean z12;
        long j11;
        if (this.f48910f1) {
            if (z11) {
                i11 = m49272uN();
            } else {
                i11 = 0;
            }
            if (z11) {
                m49274vN = 0;
            } else if (Build.VERSION.SDK_INT >= 26) {
                m49274vN = m49272uN();
            } else {
                m49274vN = m49274vN(false);
            }
            View m92691vK = m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            if (z11 && ScanQRUIUtils.f49155a.m49639x()) {
                z12 = true;
            } else {
                z12 = false;
            }
            m92691vK.setTranslationY(i11);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(m92691vK, "translationY", m49274vN));
            if (z11) {
                j11 = 425;
            } else {
                j11 = 400;
            }
            animatorSet.setDuration(j11);
            animatorSet.setInterpolator(new C26087b());
            animatorSet.addListener(new C9235j(z12, m92691vK, runnable));
            return animatorSet;
        }
        return super.mo39022HJ(z11, runnable);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Hv */
    public void mo49292Hv() {
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112035l, 123);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Ig */
    public boolean mo49293Ig() {
        return AbstractC23034c6.m118127M();
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Ih */
    public boolean mo49294Ih(int[] iArr, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(iArr, "cameraCropRect");
        Rect m49632o = ScanQRUIUtils.f49155a.m49632o(this.f48903Y0, i11, i12, i13, this.f48908d1, this.f48909e1);
        if (m49632o == null) {
            return false;
        }
        iArr[0] = m49632o.left;
        iArr[1] = m49632o.top;
        iArr[2] = m49632o.right;
        iArr[3] = m49632o.bottom;
        return true;
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Iq */
    public boolean mo49295Iq() {
        return AbstractC23034c6.m118114C(m92689tK(), "android.permission.CAMERA");
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: It */
    public void mo49296It(boolean z11) {
        if (m49279yN()) {
            if (z11) {
                AbstractC19444a.m101696d(this.f48930z1);
                AbstractC19444a.m101694b(this.f48929y1, 125L);
            } else {
                AbstractC19444a.m101696d(this.f48929y1);
                AbstractC19444a.m101695c(this.f48930z1);
            }
        }
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Iv */
    public void mo49297Iv(AbstractC23958b abstractC23958b) {
        AbstractC19074t.m100208f(abstractC23958b, "item");
        if (abstractC23958b instanceof C23963g) {
            this.f48893D1.m49387u0(new AbstractC23490m.d(0, abstractC23958b.m125380b()), 3);
            return;
        }
        if (abstractC23958b instanceof C23962f) {
            C9230g0 c9230g0 = this.f48893D1;
            String m125380b = abstractC23958b.m125380b();
            String m136244p = AbstractC26412d.Companion.m136244p(abstractC23958b.m125380b());
            if (m136244p == null) {
                m136244p = "";
            }
            c9230g0.m49387u0(new AbstractC23490m.c(0, m125380b, m136244p), 3);
            return;
        }
        if (abstractC23958b instanceof C23961e) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 == null) {
                return;
            }
            m49195MN(new C9228f0(m92676n2, abstractC23958b, this));
            return;
        }
        if (abstractC23958b instanceof C23960d) {
            SensitiveData sensitiveData = new SensitiveData("wifi_join_from_recent_qr_code", "scan_qr", null, 4, null);
            C23960d c23960d = (C23960d) abstractC23958b;
            if (c23960d.m125387h() != null) {
                C30955t m150567a = C30955t.Companion.m150567a();
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                m150567a.m150565i(m92689tK, this.f48892C1, c23960d.m125387h(), sensitiveData);
                return;
            }
            return;
        }
        if (abstractC23958b instanceof C23959c) {
            m49320jO(AbstractC8020f0.error_general);
        }
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Iw */
    public void mo49298Iw(float[] fArr, int[] iArr) {
        AbstractC19074t.m100208f(fArr, "points");
        AbstractC19074t.m100208f(iArr, "cameraCropRect");
        ScanQRUIUtils.f49155a.m49640y(fArr, iArr, this.f48903Y0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        m49270tN().mo49468t2();
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 6066);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Kc */
    public void mo49299Kc(final String str) {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.n0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49215WN(ScanQRCodeView.this, str);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: LH */
    public String mo49300LH() {
        return this.f48918n1;
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: N8 */
    public void mo49301N8(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.u0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49258oN(z11, this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: O1 */
    public void mo49302O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: OF */
    public void mo49303OF() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.y
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49199ON(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Ol */
    public void mo49304Ol() {
        m49320jO(AbstractC8020f0.str_sensitive_camera_block_title);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Pe */
    public void mo49305Pe(boolean z11) {
        String[] strArr;
        int i11;
        if (z11) {
            strArr = AbstractC23034c6.f112033j;
        } else {
            strArr = AbstractC23034c6.f112030g;
        }
        if (z11) {
            i11 = 149;
        } else {
            i11 = 148;
        }
        AbstractC23034c6.m118184v0(this, strArr, i11);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: QG */
    public void mo49306QG() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.p0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49197NN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Qb */
    public void mo49307Qb() {
        try {
            InterfaceC29634a interfaceC29634a = this.f48904Z0;
            if (interfaceC29634a != null) {
                interfaceC29634a.mo147384o(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Qv */
    public void mo49308Qv(final String str) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.x0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49229dO(ScanQRCodeView.this, str);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m49270tN().mo49439M2();
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: S8 */
    public boolean mo49309S8() {
        return AbstractC23034c6.m118116D(m92689tK(), AbstractC23034c6.f112035l);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: VE */
    public void mo49310VE() {
        InterfaceC18494a interfaceC18494a = this.f48925u1;
        if (interfaceC18494a == null) {
            return;
        }
        this.f48925u1 = null;
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        super.mo37122XJ(z11, z12);
        InterfaceC9256b m49270tN = m49270tN();
        boolean z16 = false;
        if (z11 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z11 && !z12) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z11 && z12) {
            z16 = true;
        }
        m49270tN.mo49463n2(z13, z14, z15, z16);
        if (!z11 && z12) {
            InterfaceC18494a interfaceC18494a = this.f48912h1;
            this.f48912h1 = C9250v.f49045q;
            interfaceC18494a.mo12V4();
        }
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Y5 */
    public void mo49311Y5() {
        AbstractC23034c6.m118186w0(m92692wK(), new String[]{"android.permission.CAMERA"}, 143);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        super.mo49153YJ(z11, z12);
        InterfaceC9256b m49270tN = m49270tN();
        boolean z16 = false;
        if (z11 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z11 && !z12) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z11 && z12) {
            z16 = true;
        }
        m49270tN.mo49462j2(z13, z14, z15, z16);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Yp */
    public void mo49312Yp(boolean z11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.a0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49171AN(ScanQRCodeView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        C24130n.a aVar;
        C24130n c24130n;
        C24117a c24117a;
        C24129m c24129m;
        BaseZaloActivity baseZaloActivity;
        C24130n c24130n2;
        C24130n c24130n3;
        C24130n c24130n4;
        C24130n c24130n5;
        C16716d m126094v1;
        C24130n c24130n6;
        C16716d m126092t1;
        C24130n c24130n7;
        C16719g m126095w1;
        C24130n c24130n8;
        C16716d m126096x1;
        C24130n c24130n9;
        C17023o m126088p1;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        C16766d c16766d = new C16766d(bool, bool2, null, null, null, bool2, bool2, 0, 28, null);
        BaseZaloActivity baseZaloActivity2 = null;
        SystemUIUtils.m89446k(this, c16766d, null, 2, null);
        SystemUI m89489a = AbstractC16768f.m89489a(view);
        SystemUIUtils.f85039a.m89451i(m89489a, Integer.valueOf(AbstractC23136l9.m118641B(view.getContext(), AbstractC17452c.statusBarColor)), 0);
        m89489a.m89426U(bool2);
        m89489a.m89430n(new InterfaceC27367c() { // from class: qy.g0
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                ScanQRCodeView.m49183GN(ScanQRCodeView.this, c1421e);
            }
        });
        DecorModuleView decorModuleView = this.f48895Q0;
        if (decorModuleView != null && (c24130n9 = (C24130n) decorModuleView.getModule()) != null && (m126088p1 = c24130n9.m126088p1()) != null) {
            m126088p1.mo89109M0(new C16719g.c() { // from class: qy.r0
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ScanQRCodeView.m49185HN(ScanQRCodeView.this, c16719g);
                }
            });
        }
        DecorModuleView decorModuleView2 = this.f48895Q0;
        if (decorModuleView2 != null && (c24130n8 = (C24130n) decorModuleView2.getModule()) != null && (m126096x1 = c24130n8.m126096x1()) != null) {
            m126096x1.mo89109M0(new C16719g.c() { // from class: qy.b1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ScanQRCodeView.m49187IN(ScanQRCodeView.this, c16719g);
                }
            });
        }
        DecorModuleView decorModuleView3 = this.f48895Q0;
        if (decorModuleView3 != null && (c24130n7 = (C24130n) decorModuleView3.getModule()) != null && (m126095w1 = c24130n7.m126095w1()) != null) {
            m126095w1.mo89109M0(new C16719g.c() { // from class: qy.c1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ScanQRCodeView.m49175CN(ScanQRCodeView.this, c16719g);
                }
            });
        }
        DecorModuleView decorModuleView4 = this.f48895Q0;
        if (decorModuleView4 != null && (c24130n6 = (C24130n) decorModuleView4.getModule()) != null && (m126092t1 = c24130n6.m126092t1()) != null) {
            m126092t1.mo89109M0(new C16719g.c() { // from class: qy.d1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ScanQRCodeView.m49177DN(ScanQRCodeView.this, c16719g);
                }
            });
        }
        DecorModuleView decorModuleView5 = this.f48895Q0;
        if (decorModuleView5 != null && (c24130n5 = (C24130n) decorModuleView5.getModule()) != null && (m126094v1 = c24130n5.m126094v1()) != null) {
            m126094v1.mo89109M0(new C16719g.c() { // from class: qy.e1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ScanQRCodeView.m49179EN(ScanQRCodeView.this, c16719g);
                }
            });
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        int m118712h = AbstractC23136l9.m118712h(m92689tK(), 200.0f);
        DecorModuleView decorModuleView6 = this.f48895Q0;
        if (decorModuleView6 != null && (c24130n4 = (C24130n) decorModuleView6.getModule()) != null) {
            aVar = c24130n4.m126080C1();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.m126102E1(new C9254z(rect2));
        }
        DecorModuleView decorModuleView7 = this.f48895Q0;
        if (decorModuleView7 != null) {
            c24130n = (C24130n) decorModuleView7.getModule();
        } else {
            c24130n = null;
        }
        if (c24130n != null) {
            c24130n.m126085H1(new C9218a0(rect, this, rect2, m118712h));
        }
        DecorModuleView decorModuleView8 = this.f48895Q0;
        if (decorModuleView8 != null && (c24130n3 = (C24130n) decorModuleView8.getModule()) != null) {
            c24117a = c24130n3.m126093u1();
        } else {
            c24117a = null;
        }
        if (c24117a != null) {
            c24117a.m126023w1(this.f48916l1);
        }
        DecorModuleView decorModuleView9 = this.f48895Q0;
        if (decorModuleView9 != null && (c24130n2 = (C24130n) decorModuleView9.getModule()) != null) {
            c24129m = c24130n2.m126083F1();
        } else {
            c24129m = null;
        }
        if (c24129m != null) {
            c24129m.m126066z1(this.f48915k1);
        }
        m49270tN().mo49438L();
        Context m92648SI = m92648SI();
        if (m92648SI instanceof BaseZaloActivity) {
            baseZaloActivity = (BaseZaloActivity) m92648SI;
        } else {
            baseZaloActivity = null;
        }
        if (baseZaloActivity != null) {
            if (m49337xN() && !baseZaloActivity.m56696x3()) {
                baseZaloActivity2 = baseZaloActivity;
            }
            if (baseZaloActivity2 != null) {
                baseZaloActivity2.m56680B3(new C9251w(baseZaloActivity2, this));
                AbstractC19444a.m101695c(new Runnable() { // from class: qy.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScanQRCodeView.m49181FN(ScanQRCodeView.this);
                    }
                });
            }
        }
        m49270tN().mo49449Z2();
        AbstractC19444a.m101695c(new Runnable() { // from class: qy.f1
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49181FN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: Zg */
    public void mo49313Zg() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.d0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49261pN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: a1 */
    public void mo49314a1() {
        InterfaceC18494a interfaceC18494a = this.f48924t1;
        if (interfaceC18494a == null) {
            return;
        }
        this.f48924t1 = null;
        m49211UN(false);
        m49195MN(interfaceC18494a);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: c4 */
    public void mo49315c4() {
        m49266rN(this.f48923s1);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: cz */
    public void mo49316cz(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.j0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49223aO(ScanQRCodeView.this, z11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView.InterfaceC12681b
    /* renamed from: dl */
    public void mo39091dl(Intent intent) {
        AbstractC19074t.m100208f(intent, "data");
        this.f48906b1 = intent;
        m49270tN().mo49455d6();
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: gG */
    public void mo49317gG() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.z
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49193LN(ScanQRCodeView.this);
            }
        });
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QRCodeView";
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: hF */
    public void mo49318hF() {
        this.f48906b1 = null;
        this.f48918n1 = "";
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: hu */
    public void mo49319hu(C23488k c23488k, AbstractC23490m abstractC23490m, int i11) {
        AbstractC19074t.m100208f(c23488k, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AbstractC19074t.m100208f(abstractC23490m, "preData");
        this.f48893D1.m49390y0(c23488k.m123282c(), abstractC23490m, i11);
    }

    /* renamed from: jO */
    public void m49320jO(int i11) {
        DecorModuleView decorModuleView;
        Integer num = null;
        if (m49279yN() && (decorModuleView = this.f48895Q0) != null) {
            num = Integer.valueOf(decorModuleView.getHeight() - ((C24130n) decorModuleView.getModule()).m126087o1().m89098H());
        }
        C23283z7.m120377j(m92676n2(), i11, 0, num);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: kD */
    public void mo49321kD() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.b0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49205RN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: kh */
    public void mo49322kh(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        if (z11) {
            m49233fO(str);
        } else {
            m49266rN(str);
        }
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: kj */
    public void mo49323kj(final C23488k c23488k, AbstractC23490m abstractC23490m, int i11) {
        AbstractC19074t.m100208f(c23488k, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AbstractC19074t.m100208f(abstractC23490m, "preData");
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.o0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49259oO(ScanQRCodeView.this, c23488k);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: kp */
    public void mo49324kp() {
        InterfaceC29634a interfaceC29634a = this.f48904Z0;
        if (interfaceC29634a != null) {
            interfaceC29634a.mo147382m(this.f48919o1);
        }
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: li */
    public void mo49325li() {
        m49320jO(AbstractC8020f0.qrcode_msg_camera_framework_bug);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: lo */
    public void mo49326lo(final String str) {
        AbstractC19074t.m100208f(str, "phone");
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.e0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49281zN(ScanQRCodeView.this, str);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: m9 */
    public void mo49327m9() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.f0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49201PN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: nq */
    public void mo49328nq() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.y0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49256nO(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: nt */
    public Bitmap mo49329nt() {
        Intent intent;
        Object m131205e0;
        Object obj = this.f48906b1;
        if (obj instanceof Intent) {
            intent = (Intent) obj;
        } else {
            intent = null;
        }
        if (intent != null) {
            List m71478a = GalleryPickerView.Companion.m71478a(intent);
            if (m71478a.size() == 1) {
                m131205e0 = AbstractC25332a0.m131205e0(m71478a);
                String mo41081Q = ((MediaItem) m131205e0).mo41081Q();
                Bitmap m49634q = ScanQRUIUtils.f49155a.m49634q(mo41081Q, 921600);
                if (m49634q != null) {
                    this.f48918n1 = mo41081Q;
                    return m49634q;
                }
                throw new Resources.NotFoundException("Image not found");
            }
            throw new IllegalArgumentException("Pick more than 1 images!");
        }
        throw new IllegalArgumentException("Data is invalid");
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 1001) {
            if (i11 != 1608) {
                super.onActivityResult(i11, i12, intent);
            }
        } else if (i12 == -1 && intent != null) {
            mo39091dl(intent);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        boolean z11;
        ModalBottomSheet modalBottomSheet;
        if (i11 == 4 && m49279yN()) {
            ZaloView m93012K0 = m92649TI().m93012K0();
            BottomSheet bottomSheet = null;
            if (m93012K0 instanceof ModalBottomSheet) {
                modalBottomSheet = (ModalBottomSheet) m93012K0;
            } else {
                modalBottomSheet = null;
            }
            if (modalBottomSheet != null) {
                modalBottomSheet.m81928iM();
            } else {
                ZaloView m93012K02 = m92649TI().m93012K0();
                if (m93012K02 instanceof BottomSheet) {
                    bottomSheet = (BottomSheet) m93012K02;
                }
                if (bottomSheet != null) {
                    AbstractC25247c.m130675c(bottomSheet, this.f48926v1);
                    bottomSheet.close();
                }
            }
            z11 = true;
            if (i11 == 4 && !z11 && m49279yN()) {
                m49264qO();
            }
            if (z11 && !super.onKeyUp(i11, keyEvent)) {
                return false;
            }
            return true;
        }
        z11 = false;
        if (i11 == 4) {
            m49264qO();
        }
        if (z11) {
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 != 123) {
            if (i11 != 143) {
                if (i11 != 148) {
                    if (i11 != 149) {
                        super.onRequestPermissionsResult(i11, strArr, iArr);
                        return;
                    } else {
                        m49270tN().mo49443Oa();
                        return;
                    }
                }
                m49270tN().mo49443Oa();
                return;
            }
            m49270tN().mo49450Zi(mo49295Iq());
            return;
        }
        m49270tN().mo49434Ge(mo49309S8());
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m49270tN().mo49442N0();
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: pw */
    public void mo49330pw(boolean z11, boolean z12, AbstractC23490m abstractC23490m) {
        int i11;
        AbstractC19074t.m100208f(abstractC23490m, "preData");
        if (!z11) {
            InterfaceC22667b interfaceC22667b = this.f48898T0;
            if (interfaceC22667b != null) {
                interfaceC22667b.mo117295a(this.f48893D1);
            }
            InterfaceC22667b interfaceC22667b2 = this.f48898T0;
            if (interfaceC22667b2 != null) {
                if (z12) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                interfaceC22667b2.mo117296b(abstractC23490m, i11);
                return;
            }
            return;
        }
        this.f48893D1.m49389w0(abstractC23490m.m123294b());
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: qD */
    public void mo49331qD() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.k0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49231eO(ScanQRCodeView.this);
            }
        });
    }

    /* renamed from: qN */
    public void m49332qN(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f48912h1 = interfaceC18494a;
        mo49313Zg();
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: qt */
    public void mo49333qt(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.l0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49219YN(ScanQRCodeView.this, z11);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: rg */
    public void mo49334rg() {
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.m0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49191KN(ScanQRCodeView.this);
            }
        });
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: tb */
    public void mo49335tb(final boolean z11, final String str) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19444a.m101697e(new Runnable() { // from class: qy.z0
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49207SN(z11, this, str);
            }
        });
    }

    @Override // p496ry.InterfaceC26029r
    /* renamed from: w6 */
    public void mo49336w6(ZaloView zaloView, String str, String str2) {
        BottomSheet bottomSheet;
        String str3;
        String string;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String string2;
        String string3;
        String string4;
        String string5;
        String str9;
        String string6;
        String string7;
        String str10;
        String string8;
        String str11;
        String string9;
        String string10;
        String string11;
        AbstractC19074t.m100208f(zaloView, "sheet");
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "key");
        boolean z11 = false;
        BottomSheet bottomSheet2 = null;
        ModalBottomSheet modalBottomSheet = null;
        ModalBottomSheet modalBottomSheet2 = null;
        ModalBottomSheet modalBottomSheet3 = null;
        BottomSheet bottomSheet3 = null;
        BottomSheet bottomSheet4 = null;
        ModalBottomSheet modalBottomSheet4 = null;
        BottomSheet bottomSheet5 = null;
        ModalBottomSheet modalBottomSheet5 = null;
        BottomSheet bottomSheet6 = null;
        String str12 = "";
        switch (str.hashCode()) {
            case -1966476566:
                if (str.equals("sheet-join-wifi")) {
                    if (AbstractC19074t.m100204b(str2, "primary-button")) {
                        if (zaloView instanceof BottomSheet) {
                            bottomSheet = (BottomSheet) zaloView;
                        } else {
                            bottomSheet = null;
                        }
                        if (bottomSheet != null) {
                            C30955t.b bVar = this.f48890A1;
                            C18616e c18616e = this.f48891B1;
                            InterfaceC27218a m92692wK = m92692wK();
                            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                            this.f48890A1 = null;
                            this.f48891B1 = null;
                            AbstractC25247c.m130675c(bottomSheet, this.f48926v1);
                            AbstractC25247c.m130673a(bottomSheet, new C9249u(m92692wK, bVar, c18616e));
                            bottomSheet.close();
                            return;
                        }
                        return;
                    }
                    if (AbstractC19074t.m100204b(str2, "secondary-button")) {
                        if (zaloView instanceof BottomSheet) {
                            bottomSheet2 = (BottomSheet) zaloView;
                        }
                        if (bottomSheet2 != null) {
                            bottomSheet2.close();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case -1676281944:
                if (str.equals("sheet-link")) {
                    if (AbstractC19074t.m100204b(str2, "primary-button")) {
                        InterfaceC27218a m92692wK2 = m92692wK();
                        AbstractC19074t.m100207e(m92692wK2, "requireZaloActivity(...)");
                        Bundle m92642L3 = zaloView.m92642L3();
                        if (m92642L3 == null || (string5 = m92642L3.getString("body")) == null) {
                            str4 = "";
                        } else {
                            str4 = string5;
                        }
                        if (new C24329j("(?i)^(http://|https://).*").m127018f(str4)) {
                            str5 = str4;
                        } else {
                            str5 = "https://" + str4;
                        }
                        Bundle m92642L32 = zaloView.m92642L3();
                        if (m92642L32 == null || (string4 = m92642L32.getString("body-title")) == null) {
                            str6 = "";
                        } else {
                            str6 = string4;
                        }
                        Bundle m92642L33 = zaloView.m92642L3();
                        if (m92642L33 == null || (string3 = m92642L33.getString("body-subtitle")) == null) {
                            str7 = "";
                        } else {
                            str7 = string3;
                        }
                        Bundle m92642L34 = zaloView.m92642L3();
                        if (m92642L34 == null || (string2 = m92642L34.getString("body-thumb")) == null) {
                            str8 = "";
                        } else {
                            str8 = string2;
                        }
                        m49195MN(new C9241m(m92692wK2, str5, this, str4, str6, str7, str8));
                        return;
                    }
                    if (AbstractC19074t.m100204b(str2, "more-button")) {
                        if (zaloView instanceof BottomSheet) {
                            bottomSheet6 = (BottomSheet) zaloView;
                        }
                        if (bottomSheet6 != null) {
                            BottomSheet bottomSheet7 = (BottomSheet) zaloView;
                            Bundle m92642L35 = bottomSheet7.m92642L3();
                            if (m92642L35 == null || (str3 = m92642L35.getString("body")) == null) {
                                str3 = "";
                            }
                            AbstractC19074t.m100205c(str3);
                            Bundle m92642L36 = bottomSheet7.m92642L3();
                            if (m92642L36 != null && (string = m92642L36.getString("source-scan")) != null) {
                                str12 = string;
                            }
                            AbstractC19074t.m100205c(str12);
                            AbstractC25247c.m130675c(bottomSheet6, this.f48926v1);
                            AbstractC25247c.m130673a(bottomSheet6, new C9248t(str3, str, str12));
                            bottomSheet6.close();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case -1676246269:
                if (str.equals("sheet-more") && AbstractC19074t.m100204b(str2, "primary-button")) {
                    InterfaceC27218a m92692wK3 = m92692wK();
                    AbstractC19074t.m100207e(m92692wK3, "requireZaloActivity(...)");
                    if (zaloView instanceof ModalBottomSheet) {
                        modalBottomSheet5 = (ModalBottomSheet) zaloView;
                    }
                    if (modalBottomSheet5 != null) {
                        AbstractC25250f.m130679a(modalBottomSheet5, new C9242n(m92692wK3));
                        modalBottomSheet5.close();
                        return;
                    }
                    return;
                }
                return;
            case -1676047141:
                if (str.equals("sheet-text")) {
                    if (AbstractC19074t.m100204b(str2, "primary-button")) {
                        Bundle m92642L37 = zaloView.m92642L3();
                        if (m92642L37 != null && (string7 = m92642L37.getString("body")) != null) {
                            str12 = string7;
                        }
                        SensitiveData sensitiveData = new SensitiveData("clipboard_copy_text_qr", "scan_qr", null, 4, null);
                        if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                            ToastUtils.showMess(m92689tK().getString(AbstractC8020f0.str_sensitive_clipboard_block_title));
                            return;
                        }
                        Context m92689tK = m92689tK();
                        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                        ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(m92689tK, str12, sensitiveData, false);
                        Snackbar.C16925c c16925c = Snackbar.Companion;
                        View m92691vK = m92691vK();
                        AbstractC19074t.m100207e(m92691vK, "requireView(...)");
                        Snackbar m90668c = c16925c.m90668c(m92691vK, AbstractC8020f0.str_copied, -1);
                        m90668c.m90645K(((BottomSheet) zaloView).m90512bL());
                        m90668c.m90648N();
                        m49270tN().mo49436J9(str12);
                        return;
                    }
                    if (AbstractC19074t.m100204b(str2, "more-button")) {
                        if (zaloView instanceof BottomSheet) {
                            bottomSheet5 = (BottomSheet) zaloView;
                        }
                        if (bottomSheet5 != null) {
                            BottomSheet bottomSheet8 = (BottomSheet) zaloView;
                            Bundle m92642L38 = bottomSheet8.m92642L3();
                            if (m92642L38 == null || (str9 = m92642L38.getString("body")) == null) {
                                str9 = "";
                            }
                            AbstractC19074t.m100205c(str9);
                            Bundle m92642L39 = bottomSheet8.m92642L3();
                            if (m92642L39 != null && (string6 = m92642L39.getString("source-scan")) != null) {
                                str12 = string6;
                            }
                            AbstractC19074t.m100205c(str12);
                            AbstractC25247c.m130675c(bottomSheet5, this.f48926v1);
                            AbstractC25247c.m130673a(bottomSheet5, new C9245q(str9, str, str12));
                            bottomSheet5.close();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case -589885516:
                if (str.equals("sheet-report-bad-qr") && AbstractC19074t.m100204b(str2, "primary-button")) {
                    if (zaloView instanceof ModalBottomSheet) {
                        modalBottomSheet4 = (ModalBottomSheet) zaloView;
                    }
                    if (modalBottomSheet4 != null) {
                        Bundle m92642L310 = ((ModalBottomSheet) zaloView).m92642L3();
                        if (m92642L310 != null) {
                            z11 = m92642L310.getBoolean("primary-check");
                        }
                        m49270tN().mo49471yp(z11);
                        modalBottomSheet4.close();
                        return;
                    }
                    return;
                }
                return;
            case 1354263094:
                if (str.equals("sheet-phone-number")) {
                    if (AbstractC19074t.m100204b(str2, "primary-button")) {
                        if (zaloView instanceof BottomSheet) {
                            bottomSheet3 = (BottomSheet) zaloView;
                        }
                        if (bottomSheet3 != null) {
                            BottomSheet bottomSheet9 = (BottomSheet) zaloView;
                            Bundle m92642L311 = bottomSheet9.m92642L3();
                            if (m92642L311 == null || (str11 = m92642L311.getString("body")) == null) {
                                str11 = "";
                            }
                            AbstractC19074t.m100205c(str11);
                            Bundle m92642L312 = bottomSheet9.m92642L3();
                            if (m92642L312 != null && (string9 = m92642L312.getString("body-title")) != null) {
                                str12 = string9;
                            }
                            AbstractC19074t.m100205c(str12);
                            AbstractC25247c.m130675c(bottomSheet3, this.f48926v1);
                            AbstractC25247c.m130673a(bottomSheet3, new C9246r(str11, str12));
                            bottomSheet3.close();
                            return;
                        }
                        return;
                    }
                    if (AbstractC19074t.m100204b(str2, "more-button")) {
                        if (zaloView instanceof BottomSheet) {
                            bottomSheet4 = (BottomSheet) zaloView;
                        }
                        if (bottomSheet4 != null) {
                            BottomSheet bottomSheet10 = (BottomSheet) zaloView;
                            Bundle m92642L313 = bottomSheet10.m92642L3();
                            if (m92642L313 == null || (str10 = m92642L313.getString("body")) == null) {
                                str10 = "";
                            }
                            AbstractC19074t.m100205c(str10);
                            Bundle m92642L314 = bottomSheet10.m92642L3();
                            if (m92642L314 != null && (string8 = m92642L314.getString("source-scan")) != null) {
                                str12 = string8;
                            }
                            AbstractC19074t.m100205c(str12);
                            AbstractC25247c.m130675c(bottomSheet4, this.f48926v1);
                            AbstractC25247c.m130673a(bottomSheet4, new C9247s(str10, str, str12));
                            bottomSheet4.close();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1707352442:
                if (str.equals("sheet-sub-menu")) {
                    if (AbstractC19074t.m100204b(str2, "primary-button")) {
                        InterfaceC27218a m92692wK4 = m92692wK();
                        AbstractC19074t.m100207e(m92692wK4, "requireZaloActivity(...)");
                        Bundle m92642L315 = zaloView.m92642L3();
                        if (m92642L315 != null && (string11 = m92642L315.getString("body")) != null) {
                            str12 = string11;
                        }
                        if (zaloView instanceof ModalBottomSheet) {
                            modalBottomSheet2 = (ModalBottomSheet) zaloView;
                        }
                        if (modalBottomSheet2 != null) {
                            AbstractC25250f.m130679a(modalBottomSheet2, new C9243o(m92692wK4, str12));
                            modalBottomSheet2.m81928iM();
                            return;
                        }
                        return;
                    }
                    if (AbstractC19074t.m100204b(str2, "secondary-button")) {
                        InterfaceC27218a m92692wK5 = m92692wK();
                        AbstractC19074t.m100207e(m92692wK5, "requireZaloActivity(...)");
                        Bundle m92642L316 = zaloView.m92642L3();
                        if (m92642L316 != null && (string10 = m92642L316.getString("body")) != null) {
                            str12 = string10;
                        }
                        if (zaloView instanceof ModalBottomSheet) {
                            modalBottomSheet3 = (ModalBottomSheet) zaloView;
                        }
                        if (modalBottomSheet3 != null) {
                            AbstractC25250f.m130679a(modalBottomSheet3, new C9244p(m92692wK5, str12));
                            modalBottomSheet3.m81928iM();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1909044216:
                if (str.equals("sheet-pc-login-error") && AbstractC19074t.m100204b(str2, "primary-button")) {
                    if (zaloView instanceof ModalBottomSheet) {
                        modalBottomSheet = (ModalBottomSheet) zaloView;
                    }
                    if (modalBottomSheet != null) {
                        m49270tN().mo49465p7();
                        modalBottomSheet.close();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6066) {
            try {
                if (objArr.length == 1 && (objArr[0] instanceof AbstractC23958b)) {
                    InterfaceC9256b m49270tN = m49270tN();
                    Object obj = objArr[0];
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.qrcode.model.recent.RecentScanQRItem");
                    m49270tN.mo49454cf((AbstractC23958b) obj);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: xN */
    public boolean m49337xN() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView.InterfaceC12681b
    /* renamed from: y9 */
    public void mo39092y9() {
        AbstractC19444a.m101694b(new Runnable() { // from class: qy.v
            @Override // java.lang.Runnable
            public final void run() {
                ScanQRCodeView.m49173BN(ScanQRCodeView.this);
            }
        }, 125L);
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: yB */
    public boolean mo49338yB() {
        Integer num;
        C21643a mo147378i;
        int[] m111568e;
        InterfaceC29634a interfaceC29634a = this.f48904Z0;
        if (interfaceC29634a != null && (mo147378i = interfaceC29634a.mo147378i()) != null && (m111568e = mo147378i.m111568e()) != null) {
            int length = m111568e.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (this.f48907c1.contains(Integer.valueOf(m111568e[i11]))) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            num = Integer.valueOf(i11);
        } else {
            num = null;
        }
        if (num == null || num.intValue() == -1) {
            return false;
        }
        return true;
    }

    @Override // p465qy.InterfaceC25502a
    /* renamed from: yq */
    public boolean mo49339yq(boolean z11) {
        String[] strArr;
        Context m92689tK = m92689tK();
        if (z11) {
            strArr = AbstractC23034c6.f112033j;
        } else {
            strArr = AbstractC23034c6.f112030g;
        }
        return AbstractC23034c6.m118116D(m92689tK, strArr);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        EnumC17910b.INSTANCE.m94490g(this);
        C23744a.Companion.m124119a().m124115b(this, 6066);
    }
}
