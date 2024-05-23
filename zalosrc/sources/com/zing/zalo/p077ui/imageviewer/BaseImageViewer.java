package com.zing.zalo.p077ui.imageviewer;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import b40.C2526d;
import b40.C2535j;
import ce0.C3449d;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.C13700o2;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScanQrButton;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import com.zing.zalo.zqrcode.Result;
import com.zing.zalo.zqrcode.ResultPoint;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C18009w0;
import g60.C19258d;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import i40.C20275e;
import i40.InterfaceC20278h;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kf0.C21703a;
import l80.C22122a0;
import ly.C22688w;
import ly.HandlerC22666a;
import me0.AbstractC23006a0;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23222t7;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;
import me0.C23055e5;
import me0.C23278z2;
import me0.C23283z7;
import mm0.AbstractC23350e;
import p103di.AbstractC17936c;
import p140ev.C18620i;
import p172fy.C19171b;
import p189gv.C19609h;
import p239ih.C20551a;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p471r3.EnumC25629a;
import p487rl.C25821b;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p698yz.AbstractC31111g;
import p716zh.AbstractC32146v5;
import p716zh.C31950hc;
import p716zh.C32002l4;
import p716zh.C32027n;
import sa0.C26203c;
import sa0.C26209i;
import sa0.EnumC26202b;
import tg0.C26676b;
import th.AbstractC26689j;
import vg.AbstractC28025b8;
import vg.C28212v6;
import xd0.C29604t;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public class BaseImageViewer extends BaseZaloView implements C12063c.a, ViewPager.InterfaceC6875j, View.OnClickListener, C12063c.d {

    /* renamed from: e2 */
    public static boolean f62624e2 = false;

    /* renamed from: f2 */
    private static final int f62625f2 = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: g2 */
    private static final int f62626g2 = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: h2 */
    private static final int f62627h2 = AbstractC23136l9.m118655I(AbstractC16802y.scan_qr_button_width);

    /* renamed from: i2 */
    public static HandlerThread f62628i2;

    /* renamed from: C1 */
    boolean f62631C1;

    /* renamed from: D1 */
    boolean f62632D1;

    /* renamed from: F1 */
    boolean f62634F1;

    /* renamed from: G1 */
    boolean f62635G1;

    /* renamed from: H1 */
    boolean f62636H1;

    /* renamed from: I1 */
    boolean f62637I1;

    /* renamed from: J1 */
    boolean f62638J1;

    /* renamed from: L1 */
    boolean f62640L1;

    /* renamed from: M0 */
    protected View f62641M0;

    /* renamed from: M1 */
    String f62642M1;

    /* renamed from: N0 */
    public ActionBarMenuItem f62643N0;

    /* renamed from: N1 */
    String f62644N1;

    /* renamed from: O1 */
    String f62646O1;

    /* renamed from: P0 */
    protected View f62647P0;

    /* renamed from: P1 */
    protected C32002l4 f62648P1;

    /* renamed from: Q0 */
    protected boolean f62649Q0;

    /* renamed from: Q1 */
    C19258d f62650Q1;

    /* renamed from: W1 */
    HandlerC22666a f62662W1;

    /* renamed from: Y0 */
    Context f62665Y0;

    /* renamed from: Z0 */
    C23528a f62667Z0;

    /* renamed from: a1 */
    InterfaceC20278h f62669a1;

    /* renamed from: a2 */
    public C3449d f62670a2;

    /* renamed from: b1 */
    int f62671b1;

    /* renamed from: c1 */
    View f62673c1;

    /* renamed from: c2 */
    private Animation f62674c2;

    /* renamed from: d1 */
    ViewPager f62675d1;

    /* renamed from: d2 */
    private Animation f62676d2;

    /* renamed from: e1 */
    C12063c f62677e1;

    /* renamed from: f1 */
    View f62678f1;

    /* renamed from: g1 */
    View f62679g1;

    /* renamed from: i1 */
    C13306b f62681i1;

    /* renamed from: k1 */
    View f62683k1;

    /* renamed from: l1 */
    List f62684l1;

    /* renamed from: m1 */
    int f62685m1;

    /* renamed from: n1 */
    ItemAlbumMobile f62686n1;

    /* renamed from: o1 */
    public ArrayList f62687o1;

    /* renamed from: p1 */
    AbstractC17936c f62688p1;

    /* renamed from: r1 */
    boolean f62690r1;

    /* renamed from: s1 */
    boolean f62691s1;

    /* renamed from: t1 */
    RecyclingImageView f62692t1;

    /* renamed from: w1 */
    public boolean f62695w1;

    /* renamed from: x1 */
    public String f62696x1;

    /* renamed from: y1 */
    public boolean f62697y1;

    /* renamed from: O0 */
    protected final List f62645O0 = new ArrayList();

    /* renamed from: R0 */
    protected int f62651R0 = -1;

    /* renamed from: S0 */
    protected int f62653S0 = -1;

    /* renamed from: T0 */
    public String f62655T0 = "0";

    /* renamed from: U0 */
    public String f62657U0 = "";

    /* renamed from: V0 */
    protected boolean f62659V0 = false;

    /* renamed from: W0 */
    protected int f62661W0 = -1;

    /* renamed from: X0 */
    protected C3979l.b f62663X0 = C3979l.b.UNKNOWN;

    /* renamed from: h1 */
    private boolean f62680h1 = false;

    /* renamed from: j1 */
    public C13306b.c f62682j1 = new C12013e();

    /* renamed from: q1 */
    int f62689q1 = -1;

    /* renamed from: u1 */
    public boolean f62693u1 = true;

    /* renamed from: v1 */
    public boolean f62694v1 = true;

    /* renamed from: z1 */
    List f62698z1 = new ArrayList();

    /* renamed from: A1 */
    public boolean f62629A1 = false;

    /* renamed from: B1 */
    public int f62630B1 = 0;

    /* renamed from: E1 */
    boolean f62633E1 = false;

    /* renamed from: K1 */
    boolean f62639K1 = true;

    /* renamed from: R1 */
    private boolean f62652R1 = true;

    /* renamed from: S1 */
    public Map f62654S1 = new HashMap();

    /* renamed from: T1 */
    public Handler f62656T1 = new HandlerC12014f(Looper.getMainLooper());

    /* renamed from: U1 */
    ActionBar.C17431a f62658U1 = new C12016h();

    /* renamed from: V1 */
    long f62660V1 = 0;

    /* renamed from: X1 */
    HandlerC22666a.b f62664X1 = new C12009a();

    /* renamed from: Y1 */
    View.OnClickListener f62666Y1 = new View.OnClickListener() { // from class: j70.v0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseImageViewer.this.m66761DN(view);
        }
    };

    /* renamed from: Z1 */
    boolean f62668Z1 = false;

    /* renamed from: b2 */
    AbstractC17936c.b f62672b2 = new C12012d();

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$a */
    /* loaded from: classes5.dex */
    class C12009a implements HandlerC22666a.b {
        C12009a() {
        }

        @Override // ly.HandlerC22666a.b
        /* renamed from: a */
        public void mo66895a(int i11) {
            C17945a0 m102950Z;
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) BaseImageViewer.this.f62684l1.get(i11);
            if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null && (m102950Z = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C())) != null && (m102950Z.m94929K2() instanceof C18009w0)) {
                C18009w0 c18009w0 = (C18009w0) m102950Z.m94929K2();
                if (TextUtils.isEmpty(c18009w0.m95791y()) && !c18009w0.m95744I()) {
                    m102950Z.m95212nc("", null, true);
                }
            }
            BaseImageViewer.this.m66837UN(i11);
        }

        @Override // ly.HandlerC22666a.b
        /* renamed from: b */
        public void mo66896b(Result.Success success, int i11) {
            C17945a0 m102950Z;
            if (i11 == -1) {
                return;
            }
            try {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) BaseImageViewer.this.f62684l1.get(i11);
                if (itemAlbumMobile != null) {
                    itemAlbumMobile.f42600t0 = success;
                    ResultPoint resultPoint = success.m92584d()[0];
                    ResultPoint resultPoint2 = success.m92584d()[2];
                    itemAlbumMobile.f42606w0 = new PointF(((resultPoint.getX() + resultPoint2.getX()) / 2.0f) / itemAlbumMobile.f42602u0, ((resultPoint.getY() + resultPoint2.getY()) / 2.0f) / itemAlbumMobile.f42604v0);
                    if (itemAlbumMobile.m40496C() != null && (m102950Z = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C())) != null && (m102950Z.m94929K2() instanceof C18009w0) && TextUtils.isEmpty(((C18009w0) m102950Z.m94929K2()).m95791y())) {
                        m102950Z.m95212nc(success.m92585e(), itemAlbumMobile.f42606w0, true);
                    }
                }
                BaseImageViewer.this.m66840VN(i11, success.m92585e());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$b */
    /* loaded from: classes5.dex */
    public class C12010b implements InterfaceC12022n {

        /* renamed from: a */
        final /* synthetic */ ItemAlbumMobile f62700a;

        C12010b(ItemAlbumMobile itemAlbumMobile) {
            this.f62700a = itemAlbumMobile;
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            baseImageViewer.f62668Z1 = false;
            baseImageViewer.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(C12063c.f fVar, String str) {
            BaseImageViewer.this.f62668Z1 = false;
            try {
                if (!TextUtils.isEmpty(str)) {
                    BaseImageViewer.this.m66871lO(this.f62700a, fVar.f62951b, fVar.f62952c, str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$c */
    /* loaded from: classes5.dex */
    public class C12011c implements InterfaceC12022n {

        /* renamed from: a */
        final /* synthetic */ boolean f62702a;

        /* renamed from: b */
        final /* synthetic */ int f62703b;

        C12011c(boolean z11, int i11) {
            this.f62702a = z11;
            this.f62703b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m66898d(C12063c.f fVar, String str, boolean z11, int i11) {
            BaseImageViewer.this.mo66850aO(fVar, str, z11, i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            BaseImageViewer.this.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(final C12063c.f fVar, final String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Handler handler = BaseImageViewer.this.f62656T1;
                    final boolean z11 = this.f62702a;
                    final int i11 = this.f62703b;
                    handler.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseImageViewer.C12011c.this.m66898d(fVar, str, z11, i11);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$d */
    /* loaded from: classes5.dex */
    class C12012d implements AbstractC17936c.b {
        C12012d() {
        }

        @Override // p103di.AbstractC17936c.b
        /* renamed from: a */
        public void mo66899a() {
            ItemAlbumMobile itemAlbumMobile;
            MessageId messageId;
            List m94599n = BaseImageViewer.this.f62688p1.m94599n();
            if (m94599n.isEmpty()) {
                return;
            }
            int m66860fN = BaseImageViewer.this.m66860fN();
            BaseImageViewer.this.m66861fO();
            int size = BaseImageViewer.this.f62684l1.size();
            if (m66860fN >= size) {
                m66860fN = size - 1;
            }
            C20275e c20275e = null;
            if (m66860fN >= 0) {
                itemAlbumMobile = (ItemAlbumMobile) BaseImageViewer.this.f62684l1.get(m66860fN);
            } else {
                itemAlbumMobile = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onMediaListChanged: oldPhotoIndex= ");
            sb2.append(m66860fN);
            sb2.append(", oldPhotoListSize= ");
            sb2.append(size);
            sb2.append(", backupItem= ");
            sb2.append(itemAlbumMobile);
            int i11 = -1;
            if (itemAlbumMobile != null && itemAlbumMobile.f42591p != -1) {
                messageId = itemAlbumMobile.m40496C();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onMediaListChanged: restoreMsgId= ");
                sb3.append(messageId);
            } else {
                messageId = null;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onMediaListChanged: newPhotoListSize= ");
            sb4.append(BaseImageViewer.this.f62684l1.size());
            BaseImageViewer.this.f62684l1.clear();
            BaseImageViewer.this.f62684l1.addAll(m94599n);
            int size2 = BaseImageViewer.this.f62684l1.size();
            if (messageId != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= BaseImageViewer.this.f62684l1.size()) {
                        break;
                    }
                    ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) BaseImageViewer.this.f62684l1.get(i12);
                    if (itemAlbumMobile2.m40496C() != null && itemAlbumMobile2.m40496C() == messageId) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
                BaseImageViewer.this.f62685m1 = i11;
            } else {
                BaseImageViewer.this.f62685m1 = m66860fN;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onMediaListChanged: newPhotoIndex= ");
            sb5.append(i11);
            if (i11 >= 0) {
                BaseImageViewer.this.f62685m1 = i11;
            } else {
                BaseImageViewer.this.f62685m1 = (size2 - size) + m66860fN;
            }
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            if (baseImageViewer.f62685m1 < 0) {
                baseImageViewer.f62685m1 = 0;
            }
            if (baseImageViewer.f62685m1 >= baseImageViewer.f62684l1.size()) {
                BaseImageViewer.this.f62685m1 = r0.f62684l1.size() - 1;
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onMediaListChanged: mCurrentPhotoIndex(restore)= ");
            sb6.append(BaseImageViewer.this.f62685m1);
            BaseImageViewer.this.mo66819FM(false);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onMediaListChanged: mCurrentPhotoIndex(after adding populated items)= ");
            sb7.append(BaseImageViewer.this.f62685m1);
            sb7.append("mPhotoList size= ");
            sb7.append(BaseImageViewer.this.f62684l1.size());
            SparseIntArray m94598m = BaseImageViewer.this.f62688p1.m94598m();
            SparseArray m94597l = BaseImageViewer.this.f62688p1.m94597l();
            InterfaceC20278h interfaceC20278h = BaseImageViewer.this.f62669a1;
            if (interfaceC20278h != null) {
                c20275e = interfaceC20278h.mo56694u();
            }
            if (c20275e != null) {
                c20275e.m105865K(i11);
                c20275e.m105857C(m94598m);
                c20275e.m105859E(m94597l);
                c20275e.m105863I(false);
            }
            BaseImageViewer.this.mo66694AO();
            BaseImageViewer baseImageViewer2 = BaseImageViewer.this;
            int i13 = baseImageViewer2.f62685m1;
            baseImageViewer2.mo66708c6(baseImageViewer2.f62684l1);
            BaseImageViewer.this.mo66729oO(i13, Boolean.FALSE);
            BaseImageViewer.this.mo50252cO();
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$e */
    /* loaded from: classes5.dex */
    class C12013e extends C13306b.c {
        C12013e() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            if ("tip.open_qr".equals(c28212v6.f131577c)) {
                View view = BaseImageViewer.this.f62679g1;
                if ((view instanceof ScanQrButton) && view.getVisibility() == 0) {
                    return true;
                }
                return false;
            }
            return super.mo66900a(c28212v6);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            if ("tip.open_qr".equals(str)) {
                C28212v6 c28212v62 = c26203c.f124532w;
                c28212v62.f131592r = 5L;
                c28212v62.f131593s = true;
                c26203c.f124507D = EnumC26202b.TOP;
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130863t;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            if ("tip.open_qr".equals(str)) {
                View view = BaseImageViewer.this.f62679g1;
                if (view instanceof ScanQrButton) {
                    return new C26209i(view);
                }
                return null;
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (BaseImageViewer.this.m92672lJ() && BaseImageViewer.this.m92687sJ()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: m */
        public void mo66905m(ShowcaseView showcaseView, C28212v6 c28212v6) {
            if (c28212v6 != null && "tip.open_qr".equals(c28212v6.f131577c)) {
                AbstractC28025b8.f130836M = true;
                AbstractC0924m0.m4030mo(AbstractC0924m0.m3245M5() + 1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$f */
    /* loaded from: classes5.dex */
    class HandlerC12014f extends Handler {
        HandlerC12014f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseImageViewer.this.mo66721kN(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$g */
    /* loaded from: classes5.dex */
    public class C12015g implements C19258d.a {
        C12015g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m66907e(C12063c.h hVar, ItemAlbumMobile itemAlbumMobile) {
            hVar.m67339V(itemAlbumMobile.f42585j0);
            if (itemAlbumMobile.m40511V()) {
                BaseImageViewer.this.mo66694AO();
            }
        }

        @Override // g60.C19258d.a
        /* renamed from: a */
        public boolean mo66908a(C12063c.h hVar, ItemAlbumMobile itemAlbumMobile) {
            return true;
        }

        @Override // g60.C19258d.a
        /* renamed from: b */
        public void mo66909b(ItemAlbumMobile itemAlbumMobile, long j11, long j12) {
            if (BaseImageViewer.this.mo66887vN()) {
                BaseImageViewer.this.m66772MM(itemAlbumMobile, j11, j12);
            }
        }

        @Override // g60.C19258d.a
        /* renamed from: c */
        public void mo66910c(final C12063c.h hVar, final ItemAlbumMobile itemAlbumMobile) {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.h
                @Override // java.lang.Runnable
                public final void run() {
                    BaseImageViewer.C12015g.this.m66907e(hVar, itemAlbumMobile);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$h */
    /* loaded from: classes5.dex */
    class C12016h extends ActionBar.C17431a {
        C12016h() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: a */
        public boolean mo66911a() {
            return BaseImageViewer.this.m66816EM(true);
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            boolean z11;
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            if (i11 == AbstractC6918a0.action_bar_menu_more) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!baseImageViewer.m66816EM(z11)) {
                return;
            }
            BaseImageViewer.this.mo37491QJ(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$i */
    /* loaded from: classes5.dex */
    class ViewOnAttachStateChangeListenerC12017i implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC12017i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (BaseImageViewer.this.m92656bJ() != null) {
                BaseImageViewer.this.m92656bJ().removeOnAttachStateChangeListener(this);
                BaseImageViewer baseImageViewer = BaseImageViewer.this;
                AbstractC32226c.m155413l(baseImageViewer, baseImageViewer.f88760a0);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$j */
    /* loaded from: classes5.dex */
    public class C12018j extends C22688w.b {
        C12018j(BaseZaloView baseZaloView, InterfaceC27218a interfaceC27218a, boolean z11) {
            super(baseZaloView, interfaceC27218a, z11);
        }

        /* renamed from: q0 */
        private C18620i m66913q0() {
            C18620i c18620i;
            C18620i c18620i2 = C18620i.f93694q;
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            int i11 = baseImageViewer.f62651R0;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 12) {
                            c18620i = c18620i2;
                        } else {
                            c18620i = C18620i.f93664G;
                        }
                    } else {
                        c18620i = C18620i.f93663F;
                    }
                } else if (baseImageViewer.f62695w1) {
                    c18620i = C18620i.f93659B;
                } else {
                    c18620i = C18620i.f93700w;
                }
            } else if (baseImageViewer.f62695w1) {
                c18620i = C18620i.f93658A;
            } else {
                c18620i = C18620i.f93699v;
            }
            if (c18620i == c18620i2) {
                C21703a.f105414a.m112011a(null, "BaseImageViewer.getSourceOpenMiniApp");
            }
            return c18620i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r0 */
        public /* synthetic */ void m66914r0(Class cls, Bundle bundle, int i11) {
            try {
                BaseImageViewer.this.f72421L0.m92676n2().mo35581q(cls, bundle, i11, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: a */
        public void mo49370a(int i11) {
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: f */
        public void mo49373f(C19609h c19609h, C18620i c18620i) {
            InterfaceC27218a m92676n2 = BaseImageViewer.this.f72421L0.m92676n2();
            C18620i m66913q0 = m66913q0();
            if (m92676n2 != null) {
                WebBaseView.m86649WQ(m92676n2, c19609h, null, m66913q0);
            }
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: u */
        public void mo49386u(final Class cls, final Bundle bundle, final int i11) {
            BaseImageViewer.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.i
                @Override // java.lang.Runnable
                public final void run() {
                    BaseImageViewer.C12018j.this.m66914r0(cls, bundle, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$k */
    /* loaded from: classes5.dex */
    public class C12019k implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ C25821b f62712a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f62713b;

        /* renamed from: c */
        final /* synthetic */ C12063c.f f62714c;

        /* renamed from: d */
        final /* synthetic */ int f62715d;

        /* renamed from: e */
        final /* synthetic */ C12063c.d.a f62716e;

        C12019k(C25821b c25821b, WeakReference weakReference, C12063c.f fVar, int i11, C12063c.d.a aVar) {
            this.f62712a = c25821b;
            this.f62713b = weakReference;
            this.f62714c = fVar;
            this.f62715d = i11;
            this.f62716e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m66917i(String str, C25821b c25821b, WeakReference weakReference, C12063c.f fVar, String str2, int i11, C12063c.d.a aVar) {
            C26676b.m136952b("ImageViewer", "loadPhotoOnCloud success: isDestroyed = " + BaseImageViewer.this.f62680h1 + " - url = " + str + " - cloudID = " + c25821b.m133141d());
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            baseImageViewer.f62638J1 = true;
            baseImageViewer.f62637I1 = false;
            if (!baseImageViewer.f62680h1) {
                BaseImageViewer.this.m66774NN((RecyclingImageView) weakReference.get(), fVar, str2, i11, aVar, false);
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return true;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return EnumC24298a.f117298q;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            C26676b.m136952b("ImageViewer", "loadPhotoOnCloud failed: isDestroyed = " + BaseImageViewer.this.f62680h1 + " - url = " + str + " - cloudID = " + this.f62712a.m133141d());
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            final C12063c.d.a aVar = this.f62716e;
            final C12063c.f fVar = this.f62714c;
            final int i12 = this.f62715d;
            baseImageViewer.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.j
                @Override // java.lang.Runnable
                public final void run() {
                    C12063c.d.a.this.mo67298a(fVar, i12, null, 10);
                }
            });
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(final String str, final String str2) {
            BaseImageViewer baseImageViewer = BaseImageViewer.this;
            final C25821b c25821b = this.f62712a;
            final WeakReference weakReference = this.f62713b;
            final C12063c.f fVar = this.f62714c;
            final int i11 = this.f62715d;
            final C12063c.d.a aVar = this.f62716e;
            baseImageViewer.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.k
                @Override // java.lang.Runnable
                public final void run() {
                    BaseImageViewer.C12019k.this.m66917i(str, c25821b, weakReference, fVar, str2, i11, aVar);
                }
            });
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$l */
    /* loaded from: classes5.dex */
    public class C12020l extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C12063c.f f62718l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f62719m1;

        /* renamed from: n1 */
        final /* synthetic */ RecyclingImageView f62720n1;

        /* renamed from: o1 */
        final /* synthetic */ int f62721o1;

        /* renamed from: p1 */
        final /* synthetic */ C12063c.d.a f62722p1;

        C12020l(C12063c.f fVar, boolean z11, RecyclingImageView recyclingImageView, int i11, C12063c.d.a aVar) {
            this.f62718l1 = fVar;
            this.f62719m1 = z11;
            this.f62720n1 = recyclingImageView;
            this.f62721o1 = i11;
            this.f62722p1 = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0014, B:11:0x0050, B:13:0x006e, B:15:0x0072, B:18:0x0080, B:20:0x008a, B:22:0x00ad, B:24:0x00b3, B:28:0x0022, B:30:0x002a, B:33:0x0032, B:35:0x0038, B:39:0x0044), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0014, B:11:0x0050, B:13:0x006e, B:15:0x0072, B:18:0x0080, B:20:0x008a, B:22:0x00ad, B:24:0x00b3, B:28:0x0022, B:30:0x002a, B:33:0x0032, B:35:0x0038, B:39:0x0044), top: B:2:0x0002 }] */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            int i11;
            try {
                C12063c.f fVar = this.f62718l1;
                ItemAlbumMobile itemAlbumMobile = fVar.f62950a;
                if (fVar.f62952c != 2 || (c23995f.m125658i() != 301 && c23995f.m125658i() != 302)) {
                    if (c23995f.m125657h() == 404) {
                        if (this.f62718l1.f62954e || itemAlbumMobile == null || !AbstractC31111g.m151136q(itemAlbumMobile) || this.f62718l1.f62952c != 2) {
                            i11 = 8;
                        }
                    } else if (c23995f.m125657h() == -103) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    C26676b.m136952b("ImageViewer", "loadPhotoByAquery: resultCode = " + i11 + " - url = " + str);
                    if (i11 == 0) {
                        if (this.f62719m1) {
                            BaseImageViewer.this.m66775ON(this.f62720n1, this.f62718l1, this.f62721o1, this.f62722p1, i11);
                            return;
                        } else {
                            this.f62722p1.mo67298a(this.f62718l1, this.f62721o1, c3979l, i11);
                            return;
                        }
                    }
                    C26676b.m136952b("ImageViewer", "loadPhotoByAquery: success - photoLoadingData quality " + this.f62718l1.f62952c);
                    this.f62722p1.mo67298a(this.f62718l1, this.f62721o1, c3979l, i11);
                    if (c3979l != null && c3979l.m18849m()) {
                        C26676b.m136952b("ImageViewer", "loadPhotoByAquery: valid bitmap - url = " + str);
                        BaseImageViewer.this.mo66704SN(this.f62718l1);
                        C22122a0.d.m115394g(c3979l, c23995f.m125661l());
                        return;
                    }
                    return;
                }
                i11 = 3;
                C26676b.m136952b("ImageViewer", "loadPhotoByAquery: resultCode = " + i11 + " - url = " + str);
                if (i11 == 0) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$m */
    /* loaded from: classes5.dex */
    public class C12021m extends ReplacementSpan {
        C12021m() {
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
            RectF rectF = new RectF(f11, i13, paint.measureText(charSequence, i11, i12) + f11 + (BaseImageViewer.f62626g2 * 2), i15);
            paint.setColor(1711276032);
            canvas.drawRoundRect(rectF, BaseImageViewer.f62625f2, BaseImageViewer.f62625f2, paint);
            paint.setColor(-1);
            canvas.drawText(charSequence, i11, i12, f11 + BaseImageViewer.f62626g2, i14, paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
            return Math.round(paint.measureText(charSequence, i11, i12)) + (BaseImageViewer.f62626g2 * 2);
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$n */
    /* loaded from: classes5.dex */
    public interface InterfaceC12022n {
        /* renamed from: a */
        void mo66756a(int i11);

        /* renamed from: b */
        void mo66757b(C12063c.f fVar, String str);
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$o */
    /* loaded from: classes5.dex */
    public static class C12023o {

        /* renamed from: a */
        a f62725a;

        /* renamed from: b */
        String f62726b;

        /* renamed from: c */
        String f62727c;

        /* renamed from: com.zing.zalo.ui.imageviewer.BaseImageViewer$o$a */
        /* loaded from: classes5.dex */
        public interface a {
            /* renamed from: a */
            void mo66928a(int i11);
        }

        public C12023o(String str, String str2, a aVar) {
            this.f62725a = aVar;
            this.f62726b = str;
            this.f62727c = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m66926c() {
            long currentTimeMillis = System.currentTimeMillis();
            ZJXLDecoder.Options options = new ZJXLDecoder.Options();
            double m92545e = ZJXLDecoder.m92545e(this.f62726b, options);
            int m92544d = ZJXLDecoder.m92544d(m92545e);
            if (m92544d != 0) {
                AbstractC20887g.m109241s(16871, "" + m92544d, currentTimeMillis);
                AbstractC20110a.m104543l("[JXL]").mo104548a("JxlImageDecodeTask-ZJXLDecoder.getInfoFromFile fail: path=" + this.f62726b + ", err=" + m92544d, new Object[0]);
                this.f62725a.mo66928a(m92544d);
                return;
            }
            int m92547g = ZJXLDecoder.m92547g(m92545e);
            long j11 = m92547g;
            AbstractC20110a.m104543l("[JXL]").mo104548a("JxlImageDecodeTask-ZJXLDecoder.getInfoFromFile success: path=" + this.f62726b + ", in " + m92547g + "ms, width/height: " + options.bmPreviewWidth + "/" + options.bmPreviewHeight, new Object[0]);
            AbstractC20887g.m109216C(16871, "", currentTimeMillis, currentTimeMillis + j11, j11);
            Bitmap createBitmap = Bitmap.createBitmap(options.bmPreviewWidth, options.bmPreviewHeight, Bitmap.Config.ARGB_8888);
            long currentTimeMillis2 = System.currentTimeMillis();
            double m92543c = ZJXLDecoder.m92543c(this.f62726b, 1, createBitmap);
            int m92544d2 = ZJXLDecoder.m92544d(m92543c);
            if (m92544d2 == 0) {
                int m92547g2 = ZJXLDecoder.m92547g(m92543c);
                long j12 = m92547g2;
                AbstractC20110a.m104543l("[JXL]").mo104548a("JxlImageDecodeTask-" + this.f62726b + ", decodeImageFile in : " + m92547g2 + "ms", new Object[0]);
                AbstractC20887g.m109247y(16870, currentTimeMillis2, currentTimeMillis2 + j12, j12);
                this.f62725a.mo66928a(AbstractC23009a3.m117972w(createBitmap, Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), this.f62727c));
                return;
            }
            AbstractC20110a.m104543l("[JXL]").mo104548a("JxlImageDecodeTask-ZJXLDecoder.decodeImageFile fail: path=" + this.f62726b + ", err=" + m92544d2, new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(m92544d2);
            AbstractC20887g.m109241s(16870, sb2.toString(), currentTimeMillis2);
            this.f62725a.mo66928a(m92544d2);
        }

        /* renamed from: b */
        public void m66927b() {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.b1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseImageViewer.C12023o.this.m66926c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public /* synthetic */ void m66758AN() {
        ActionBar m92646QI = m92646QI();
        this.f88760a0 = m92646QI;
        if (m92646QI != null && m92666hJ()) {
            if (this.f88763d0 == null) {
                this.f88763d0 = this.f88760a0.m92712g();
            }
            mo37482FJ(this.f88763d0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public /* synthetic */ void m66760CN(ItemAlbumMobile itemAlbumMobile, final C12063c.f fVar, WeakReference weakReference, final int i11, final C12063c.d.a aVar, final int i12) {
        C25821b m124795W;
        if (itemAlbumMobile != null) {
            try {
                if (itemAlbumMobile.m40496C() != null) {
                    if (C24302e.m126898v() && (m124795W = AbstractC23306f.m120679j2().m124795W(itemAlbumMobile.m40496C())) != null && (!AbstractC19646n0.m102886D1(m124795W.m133147j()) || (AbstractC19646n0.m102886D1(m124795W.m133147j()) && m124795W.m133144g() != null && m124795W.m133144g().m133161a() == 1))) {
                        m66776PN(itemAlbumMobile, m124795W, fVar, weakReference, i11, aVar);
                        return;
                    } else {
                        mo70710wy(new Runnable() { // from class: j70.p0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C12063c.d.a.this.mo67298a(fVar, i11, null, i12);
                            }
                        });
                        return;
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
        throw new Exception("Can not find msg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public /* synthetic */ void m66761DN(View view) {
        m66848ZN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public /* synthetic */ void m66763FN() {
        if (this.f62678f1 == null) {
            this.f62678f1 = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.hd_reminder_toast_layout, (ViewGroup) null);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_viewing_hd_reminder);
            int indexOf = m118743r0.indexOf("HD");
            if (indexOf == -1) {
                ((RobotoTextView) this.f62678f1.findViewById(AbstractC6918a0.content)).setText(m118743r0);
            } else {
                int i11 = indexOf + 2;
                SpannableString spannableString = new SpannableString(m118743r0);
                spannableString.setSpan(new StyleSpan(1), indexOf, i11, 33);
                spannableString.setSpan(new C12021m(), indexOf, i11, 33);
                ((RobotoTextView) this.f62678f1.findViewById(AbstractC6918a0.content)).setText(spannableString);
            }
        }
        ToastUtils.m89257e(this.f62678f1, 49);
    }

    /* renamed from: GM */
    public static void m66764GM() {
        synchronized (C13700o2.class) {
            try {
                HandlerThread handlerThread = f62628i2;
                if (handlerThread != null) {
                    handlerThread.quit();
                    f62628i2 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static /* synthetic */ void m66765GN(InterfaceC12022n interfaceC12022n, C12063c.f fVar, String str, int i11) {
        int i12;
        if (i11 == 0) {
            interfaceC12022n.mo66757b(fVar, str);
            return;
        }
        if (i11 == 601) {
            i12 = 4;
        } else {
            i12 = -1;
        }
        interfaceC12022n.mo66756a(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public static /* synthetic */ void m66766HN(int i11, InterfaceC12022n interfaceC12022n, C12063c.f fVar, String str) {
        int i12;
        if (i11 == 0) {
            interfaceC12022n.mo66757b(fVar, str);
            return;
        }
        if (i11 == 601) {
            i12 = 4;
        } else {
            i12 = -1;
        }
        interfaceC12022n.mo66756a(i12);
    }

    /* renamed from: IM */
    private int m66767IM(String str, String str2) {
        try {
            if (str.equals(str2)) {
                return 0;
            }
            AbstractC23238v2.m119717b(new File(str), new File(str2));
            return 0;
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
            if (!AbstractC23227u1.m119701a(e11) && AbstractC23238v2.m119726k()) {
                return 502;
            }
            return 601;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public /* synthetic */ void m66768IN(String str, final String str2, final InterfaceC12022n interfaceC12022n, final C12063c.f fVar) {
        final int m66767IM = m66767IM(str, str2);
        AbstractC19444a.m101695c(new Runnable() { // from class: j70.m0
            @Override // java.lang.Runnable
            public final void run() {
                BaseImageViewer.m66766HN(m66767IM, interfaceC12022n, fVar, str2);
            }
        });
    }

    /* renamed from: JM */
    public static void m66769JM() {
        synchronized (C13700o2.class) {
            try {
                if (f62628i2 == null) {
                    HandlerThread handlerThread = new HandlerThread("Z:QrcodeDecoder");
                    f62628i2 = handlerThread;
                    handlerThread.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public static /* synthetic */ int m66770JN(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public /* synthetic */ void m66771KN(int i11) {
        if (this.f62640L1) {
            m66824LN(i11);
        }
        m66888vO(mo66740uN());
        if (this.f62640L1 && (this.f62679g1 instanceof ScanQrButton)) {
            this.f62681i1.m74699e("tip.open_qr");
            ((ScanQrButton) this.f62679g1).m75866h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public void m66772MM(ItemAlbumMobile itemAlbumMobile, long j11, long j12) {
        MessageId m40496C = itemAlbumMobile.m40496C();
        if (m40496C == null) {
            return;
        }
        C17945a0 m2636s = AbstractC23306f.m120584H0().m2636s(m40496C);
        if (m2636s != null) {
            AbstractC23306f.m120652d().m109871X(CoreUtility.f89233i, m2636s, j11, j12, false);
        } else {
            AbstractC23306f.m120652d().m109856J0(CoreUtility.f89233i, m40496C, j11, j12);
        }
    }

    /* renamed from: MN */
    private void m66773MN(RecyclingImageView recyclingImageView, C12063c.f fVar, int i11, C12063c.d.a aVar) {
        if (fVar.f62952c == 2 && AbstractC23304d.f113361a3.contains(fVar.f62951b)) {
            aVar.mo67298a(fVar, i11, null, 3);
            return;
        }
        C26676b.m136952b("ImageViewer", "loadPhoto - loadPhotoByAquery: url = " + fVar.f62951b);
        m66774NN(recyclingImageView, fVar, fVar.f62951b, i11, aVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public void m66774NN(RecyclingImageView recyclingImageView, C12063c.f fVar, String str, int i11, C12063c.d.a aVar, boolean z11) {
        RecyclingImageView recyclingImageView2;
        boolean z12;
        boolean z13;
        if (recyclingImageView != null) {
            recyclingImageView2 = recyclingImageView;
        } else {
            recyclingImageView2 = new RecyclingImageView(getContext());
        }
        C12020l c12020l = new C12020l(fVar, z11, recyclingImageView2, i11, aVar);
        c12020l.m125773e3(true);
        if (this.f62663X0 == C3979l.b.FEED_VIEW_FULL_NORMAL && fVar.f62952c == 2) {
            this.f62663X0 = C3979l.b.FEED_VIEW_FULL_HQ;
        }
        int i12 = this.f62651R0;
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 12) {
                                c12020l.m125611h1(0, 0);
                            }
                        } else {
                            c12020l.m125611h1(26011, 0);
                        }
                    } else {
                        c12020l.m125611h1(26007, 0);
                    }
                }
                c12020l.m125611h1(26009, 0);
            } else {
                c12020l.m125611h1(26004, 0);
            }
        } else if (fVar.f62952c == 2) {
            c12020l.m125611h1(26001, 0);
        } else {
            c12020l.m125611h1(26000, 0);
        }
        C23528a c23528a = (C23528a) this.f62667Z0.m123612r(recyclingImageView2);
        C3979l.b bVar = this.f62663X0;
        if (fVar.f62952c < 2 && recyclingImageView != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i13 = fVar.f62953d;
        EnumC25629a m120110a = C23278z2.m120110a();
        if (fVar.f62952c < 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        c23528a.m123617w(str, bVar, z12, true, i13, 0, c12020l, false, m120110a, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public void m66775ON(RecyclingImageView recyclingImageView, final C12063c.f fVar, final int i11, final C12063c.d.a aVar, final int i12) {
        C26676b.m136952b("ImageViewer", "loadPhotoOnCloud: photoLoadingData = " + fVar.f62951b);
        final ItemAlbumMobile itemAlbumMobile = fVar.f62950a;
        final WeakReference weakReference = new WeakReference(recyclingImageView);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.o0
            @Override // java.lang.Runnable
            public final void run() {
                BaseImageViewer.this.m66760CN(itemAlbumMobile, fVar, weakReference, i11, aVar, i12);
            }
        });
    }

    /* renamed from: PN */
    private void m66776PN(ItemAlbumMobile itemAlbumMobile, C25821b c25821b, C12063c.f fVar, WeakReference weakReference, int i11, C12063c.d.a aVar) {
        if (c25821b != null) {
            C24302e.m126895s().m126908q(c25821b, new C12019k(c25821b, weakReference, fVar, i11, aVar));
            return;
        }
        throw new Exception("Can not find msg");
    }

    /* renamed from: QN */
    private void m66777QN(ItemAlbumMobile itemAlbumMobile) {
        C17945a0 m102950Z;
        if (itemAlbumMobile.f42600t0 == null && itemAlbumMobile.m40496C() != null && (m102950Z = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C())) != null && (m102950Z.m94929K2() instanceof C18009w0)) {
            C18009w0 c18009w0 = (C18009w0) m102950Z.m94929K2();
            if (!TextUtils.isEmpty(c18009w0.m95791y())) {
                itemAlbumMobile.f42600t0 = new Result.Success(0L, c18009w0.m95791y(), new byte[0], new float[0], new float[0]);
                itemAlbumMobile.f42606w0 = new PointF(c18009w0.m95770i(), c18009w0.m95772j());
            } else if (c18009w0.m95744I() && c18009w0.m95791y() != null) {
                itemAlbumMobile.f42600t0 = new Result.Success(0L, "", new byte[0], new float[0], new float[0]);
            }
        }
    }

    /* renamed from: mN */
    private void m66788mN() {
        for (View view : this.f62654S1.keySet()) {
            Integer num = (Integer) this.f62654S1.get(view);
            if (num != null && num.intValue() == 0) {
                AbstractC32146v5.m155122e(view, m66851bN());
            }
        }
    }

    /* renamed from: pN */
    private void m66792pN(View view) {
        int i11;
        if (this.f62639K1) {
            if (AbstractC0924m0.m4361y0() == 1) {
                i11 = AbstractC6918a0.qrCode;
            } else {
                i11 = AbstractC6918a0.qrCodeTextView;
            }
            View findViewById = view.findViewById(i11);
            this.f62679g1 = findViewById;
            findViewById.setOnClickListener(this);
        }
    }

    /* renamed from: uO */
    private void m66798uO(boolean z11) {
        this.f62690r1 = z11;
        if (z11) {
            m66802wO();
        } else {
            m66788mN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public /* synthetic */ void m66801wN() {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
    }

    /* renamed from: wO */
    private void m66802wO() {
        for (View view : this.f62654S1.keySet()) {
            Integer num = (Integer) this.f62654S1.get(view);
            if (num != null && num.intValue() == 0) {
                AbstractC32146v5.m155123f(view, m66849aN());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public /* synthetic */ void m66804xN() {
        this.f72421L0.mo49315c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public /* synthetic */ void m66805yN(boolean z11, boolean z12, InterfaceC12022n interfaceC12022n, C12063c.f fVar, int i11, C3979l c3979l, int i12) {
        try {
            if (!this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ()) {
                if (z11) {
                    this.f62656T1.post(new Runnable() { // from class: j70.l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseImageViewer.this.m66804xN();
                        }
                    });
                }
                File mo66832Rd = mo66832Rd(fVar.f62951b, fVar.f62952c);
                if (mo66832Rd != null && AbstractC23258x2.m119958q(mo66832Rd.getPath())) {
                    m66852bO(fVar, mo66832Rd.getAbsolutePath(), z12, interfaceC12022n);
                    return;
                }
                if (i12 == 0) {
                    i12 = 2;
                }
                interfaceC12022n.mo66756a(i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public static /* synthetic */ int m66806zN(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    /* renamed from: AM */
    public TextView m66807AM(int i11, int i12, int i13) {
        ActionBarMenu actionBarMenu;
        if (this.f62643N0 == null && (actionBarMenu = this.f88763d0) != null) {
            this.f62643N0 = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            this.f62645O0.clear();
        }
        ActionBarMenuItem actionBarMenuItem = this.f62643N0;
        if (actionBarMenuItem != null) {
            TextView textView = (TextView) actionBarMenuItem.m92774j(AbstractC23136l9.m118727m(m92689tK(), i11, i12, i13));
            this.f62645O0.add(textView);
            return textView;
        }
        return null;
    }

    /* renamed from: AO */
    public void mo66694AO() {
        try {
            if (this.f62669a1 != null) {
                if (!this.f62698z1.isEmpty()) {
                    if (!this.f62698z1.contains(Integer.valueOf(this.f62685m1))) {
                    }
                }
                this.f62669a1.mo56684H0(this, m66860fN());
            }
            m66863gO(100L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ImageViewer", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Al */
    public void mo66808Al(C12063c.g gVar, int i11) {
        this.f62656T1.sendEmptyMessage(3);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: B3 */
    public void mo66809B3(float f11) {
        if (!this.f62633E1) {
            this.f62633E1 = true;
            AbstractC23647d.m123897g("900144048");
        }
    }

    /* renamed from: BM */
    boolean mo66810BM() {
        return false;
    }

    /* renamed from: BO */
    public void mo66695BO() {
        try {
            this.f62644N1 = null;
            this.f62646O1 = null;
            this.f62631C1 = false;
            this.f62633E1 = false;
            this.f62635G1 = false;
            this.f62637I1 = false;
            this.f62636H1 = false;
            this.f62638J1 = false;
            this.f62649Q0 = true;
            m66813CO(null, this.f62685m1, false);
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null) {
                Result result = itemAlbumMobile.f42600t0;
                if (result instanceof Result.Success) {
                    Result.Success success = (Result.Success) result;
                    if (!TextUtils.isEmpty(success.m92585e())) {
                        m66840VN(this.f62685m1, success.m92585e());
                    }
                }
                mo66890xO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d
    /* renamed from: CE */
    public C3979l mo66811CE(String str, int i11, C12063c.e eVar) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int i12 = 1;
                if (i11 == 1) {
                    eVar.mo67299a();
                    return C23999j.m125676A2(str, AbstractC23006a0.m117875E(), C23278z2.m120110a());
                }
                if (i11 == 0) {
                    i12 = 0;
                }
                while (true) {
                    int[] iArr = AbstractC23006a0.f111910b;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    C3979l m125676A2 = C23999j.m125676A2(str, iArr[i12], C23278z2.m120110a());
                    if (m125676A2 != null && m125676A2.m18839c() != null) {
                        eVar.mo67299a();
                        return m125676A2;
                    }
                    i12++;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        eVar.mo67300b();
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Context context = getContext();
        this.f62665Y0 = context;
        this.f62667Z0 = new C23528a(context);
        Bundle m92642L3 = m92642L3();
        mo66727nN(m92642L3);
        mo66868jO(bundle);
        mo66876oN(m92642L3);
        List list = this.f62684l1;
        if (list != null && this.f62685m1 >= list.size()) {
            this.f62685m1 = this.f62684l1.size() - 1;
        }
        if (this.f62685m1 < 0) {
            this.f62685m1 = 0;
        }
        C19258d c19258d = new C19258d(this.f62652R1);
        this.f62650Q1 = c19258d;
        c19258d.m100949C(mo66853bz());
        this.f62650Q1.m100954H(new C12015g());
    }

    /* renamed from: CM */
    public void mo66812CM() {
    }

    /* renamed from: CO */
    public void m66813CO(String str, final int i11, boolean z11) {
        this.f62640L1 = z11;
        this.f62642M1 = str;
        this.f62656T1.post(new Runnable() { // from class: j70.s0
            @Override // java.lang.Runnable
            public final void run() {
                BaseImageViewer.this.m66771KN(i11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Co */
    public boolean mo66814Co() {
        int m122451u0 = AbstractC23309i.m122451u0();
        if (m122451u0 == 1 && C23055e5.m118271f()) {
            return true;
        }
        if (m122451u0 == 2 && C23055e5.m118270e()) {
            return true;
        }
        return false;
    }

    /* renamed from: DM */
    public boolean m66815DM() {
        return m66816EM(false);
    }

    /* renamed from: DO */
    public void mo66696DO() {
    }

    /* renamed from: EM */
    public boolean m66816EM(boolean z11) {
        if (mo60294yp() || m92677nJ()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f62660V1 < 400) {
            return false;
        }
        if (!z11) {
            this.f62660V1 = elapsedRealtime;
            return true;
        }
        return true;
    }

    /* renamed from: Ee */
    public void mo66697Ee(C12063c.c cVar, int i11) {
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Ev */
    public void mo66817Ev(C12063c.g gVar, int i11) {
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: F1 */
    public void mo66818F1(boolean z11, String str) {
        if (!m92681pJ() && !m92677nJ()) {
            if (z11 && !TextUtils.isEmpty(str)) {
                if (m92672lJ() && AbstractC23041d2.m118194A(str)) {
                    AbstractC23152n3.m119011N0(this.f72421L0.m92676n2(), str, true, false, this.f62653S0);
                    return;
                }
                return;
            }
            if (m92672lJ()) {
                ToastUtils.m89266n(AbstractC8020f0.str_capture_video_snapshot_failed, new Object[0]);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            if (!this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ()) {
                actionBarMenu.m92750r();
                this.f62643N0 = null;
                mo66812CM();
                mo66696DO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FM */
    void mo66819FM(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: G6 */
    public void mo66820G6(C12063c.g gVar, int i11) {
        if (gVar != null) {
            try {
                if (gVar.f62964j != null) {
                    gVar.m67338U(true);
                    gVar.m67339V(false);
                    if (i11 == this.f62685m1) {
                        this.f62634F1 = true;
                        this.f62637I1 = false;
                        this.f62638J1 = false;
                        this.f62635G1 = false;
                        this.f62636H1 = false;
                        mo66745yO(gVar);
                        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                        if (itemAlbumMobile != null) {
                            Result result = itemAlbumMobile.f42600t0;
                            if (result instanceof Result.Success) {
                                Result.Success success = (Result.Success) result;
                                if (!TextUtils.isEmpty(success.m92585e())) {
                                    m66840VN(this.f62685m1, success.m92585e());
                                }
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
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo50253dN(), viewGroup, false);
        this.f62673c1 = inflate;
        mo66733qN(inflate);
        mo66738sO();
        m66874nO(this.f62685m1);
        m66798uO(true);
        C13306b c13306b = new C13306b(this.f72421L0.m92648SI());
        this.f62681i1 = c13306b;
        c13306b.m74687C((ViewGroup) this.f62673c1);
        this.f62681i1.f68385e = 1000;
        return this.f62673c1;
    }

    /* renamed from: HM */
    void mo66821HM() {
        this.f62691s1 = true;
        mo66833SM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        ItemAlbumMobile itemAlbumMobile;
        super.mo39024IJ();
        C24302e.m126895s().m126902h(EnumC24298a.f117298q);
        this.f62680h1 = true;
        try {
            boolean z11 = false;
            if (this.f88756W == 0 && this.f62685m1 > -1 && !this.f62691s1 && this.f72421L0.m92681pJ() && (itemAlbumMobile = this.f62686n1) != null && itemAlbumMobile.f42577b0 != 2) {
                z11 = true;
            }
            if (z11) {
                z11 = m66894zO();
            }
            this.f62691s1 = true ^ z11;
            ViewPager viewPager = this.f62675d1;
            if (viewPager != null) {
                viewPager.setAdapter(null);
                this.f62675d1.destroyDrawingCache();
                this.f62675d1 = null;
            }
            this.f62677e1 = null;
            this.f72421L0.mo49315c4();
            C23528a c23528a = this.f62667Z0;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f62667Z0 = null;
            }
            m66764GM();
            C3449d c3449d = this.f62670a2;
            if (c3449d != null) {
                c3449d.m17352e();
                this.f62670a2 = null;
            }
            AbstractC17936c abstractC17936c = this.f62688p1;
            if (abstractC17936c != null) {
                abstractC17936c.mo94601p();
            }
            C19258d c19258d = this.f62650Q1;
            if (c19258d != null) {
                c19258d.m100955I();
                this.f62650Q1.m100966y();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ic */
    public void mo66699Ic(C12063c.g gVar, C12063c.f fVar, int i11, int i12) {
        if (gVar != null) {
            try {
                if (gVar.f62964j != null && fVar != null) {
                    gVar.m67338U(false);
                    if (fVar.f62952c == 2) {
                        gVar.f62966l = gVar.f62968n;
                    }
                    ItemAlbumMobile itemAlbumMobile = gVar.f62964j;
                    if (itemAlbumMobile != null && itemAlbumMobile.m40511V()) {
                        ItemAlbumMobile itemAlbumMobile2 = gVar.f62964j;
                        if (itemAlbumMobile2.f42579d0 != null && itemAlbumMobile2.m40496C() != null && gVar.f62964j.f42593q != null) {
                            C29604t m120618S1 = AbstractC23306f.m120618S1();
                            String str = CoreUtility.f89233i;
                            ItemAlbumMobile itemAlbumMobile3 = gVar.f62964j;
                            m120618S1.m101508a(new C29604t.a(str, itemAlbumMobile3.f42579d0, itemAlbumMobile3.m40496C(), gVar.f62964j.f42593q, mo66853bz()));
                        }
                        gVar.m67339V(true);
                    }
                    if (i11 == this.f62685m1) {
                        if (fVar.f62952c == 2) {
                            this.f62637I1 = false;
                            this.f62638J1 = false;
                            this.f62635G1 = false;
                        } else {
                            this.f62635G1 = false;
                            this.f62636H1 = false;
                        }
                        mo66745yO(gVar);
                        if (i12 == 10) {
                            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
                            return;
                        }
                        if (i12 == 4) {
                            ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                            return;
                        }
                        ItemAlbumMobile itemAlbumMobile4 = this.f62686n1;
                        if (itemAlbumMobile4 != null && itemAlbumMobile4.m40511V()) {
                            mo66694AO();
                            C2535j.f10308a.m12773q(mo66853bz(), this.f62686n1, true);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        boolean z11;
        super.mo40200KJ();
        if (this.f62669a1 != null) {
            if (!this.f62691s1) {
                C17487o0 m92662fJ = m92662fJ();
                C20275e mo56694u = this.f62669a1.mo56694u();
                if (m92662fJ != null && mo56694u != null && m92662fJ.m93012K0() == mo56694u.m105876l() && mo56694u.m105876l() != null && !m92662fJ.m93042W0()) {
                    z11 = true;
                    this.f62669a1.mo56687X0(z11);
                    this.f62669a1.mo56689i(this);
                }
            }
            z11 = false;
            this.f62669a1.mo56687X0(z11);
            this.f62669a1.mo56689i(this);
        }
        this.f62691s1 = false;
    }

    /* renamed from: KM */
    public C12063c mo66822KM() {
        return new C12063c(m92692wK(), this, this.f62656T1, this, this.f62650Q1);
    }

    /* renamed from: LM */
    public void m66823LM(ItemAlbumMobile itemAlbumMobile, int i11, C3979l c3979l) {
        String str;
        int i12 = itemAlbumMobile.f42591p;
        if (i12 != 2 && i12 != -1) {
            m66777QN(itemAlbumMobile);
            Result result = itemAlbumMobile.f42600t0;
            if (result != null) {
                if (result instanceof Result.Success) {
                    Result.Success success = (Result.Success) result;
                    if (!TextUtils.isEmpty(success.m92585e())) {
                        m66840VN(i11, success.m92585e());
                        return;
                    } else {
                        m66837UN(i11);
                        return;
                    }
                }
                m66837UN(i11);
                return;
            }
            String str2 = itemAlbumMobile.f42607x;
            try {
                Bitmap m18839c = c3979l.m18839c();
                List list = this.f62684l1;
                if (list != null && list.size() > i11 && (str = itemAlbumMobile.f42607x) != null && str.equals(str2) && m18839c != null && m18839c.getConfig() != null && m18839c.getConfig().equals(Bitmap.Config.ARGB_8888) && !m18839c.isRecycled()) {
                    if (this.f62662W1 == null) {
                        m66769JM();
                        HandlerC22666a handlerC22666a = new HandlerC22666a(f62628i2.getLooper());
                        this.f62662W1 = handlerC22666a;
                        handlerC22666a.m117294a(this.f62664X1);
                    }
                    Message obtainMessage = this.f62662W1.obtainMessage();
                    obtainMessage.what = 1;
                    obtainMessage.obj = m18839c;
                    obtainMessage.arg1 = 0;
                    obtainMessage.arg2 = 0;
                    Bundle bundle = new Bundle();
                    bundle.putInt("QR_DECODE_SENDING_UID", i11);
                    obtainMessage.setData(bundle);
                    itemAlbumMobile.f42602u0 = m18839c.getWidth();
                    itemAlbumMobile.f42604v0 = m18839c.getHeight();
                    obtainMessage.sendToTarget();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: LN */
    public void m66824LN(int i11) {
        ItemAlbumMobile m66856eN;
        try {
            if ((this.f62679g1 instanceof ScanQrButton) && (m66856eN = m66856eN(i11)) != null && m66839VM() != null && m66839VM().mo67294b() != null) {
                PointF pointF = m66856eN.f42606w0;
                float[] fArr = {pointF.x, pointF.y};
                PhotoView mo67294b = m66839VM().mo67294b();
                if (mo67294b.getPhotoViewAttacher() != null) {
                    fArr[0] = fArr[0] * mo67294b.getDrawable().getIntrinsicWidth();
                    fArr[1] = fArr[1] * mo67294b.getDrawable().getIntrinsicHeight();
                    mo67294b.getPhotoViewAttacher().m48396r().mapPoints(fArr);
                    float f11 = fArr[0];
                    int i12 = f62627h2;
                    int round = Math.round(f11 - (i12 / 2.0f));
                    int round2 = Math.round(fArr[1] - (i12 / 2.0f));
                    this.f62679g1.setTranslationX(round);
                    this.f62679g1.setTranslationY(round2);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: N9 */
    public void mo66825N9(int i11, Intent intent) {
        try {
            int i12 = this.f72421L0.m92648SI().getResources().getConfiguration().orientation;
            DisplayMetrics displayMetrics = this.f72421L0.m92651WI().getDisplayMetrics();
            if (i12 != 0 && displayMetrics.widthPixels > displayMetrics.heightPixels) {
                this.f62691s1 = true;
            }
            this.f72421L0.m92676n2().setRequestedOrientation(1);
            this.f72421L0.mo50035CK(i11, intent);
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ImageViewer", e11);
        }
    }

    /* renamed from: NM */
    public void mo66701NM(ItemAlbumMobile itemAlbumMobile, String str, int i11, String str2) {
        try {
            new C3449d().m17353g(new C3449d.d(str2), new C3449d.a() { // from class: j70.u0
                @Override // ce0.C3449d.a
                /* renamed from: a */
                public final void mo17354a(C3449d.e eVar) {
                    BaseImageViewer.this.m66842WN(eVar);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: OM */
    public void mo66702OM() {
        boolean z11;
        if (!this.f62638J1 && !this.f62637I1) {
            z11 = false;
        } else {
            z11 = true;
        }
        m66827PM(z11);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d
    /* renamed from: Ot */
    public void mo66826Ot(RecyclingImageView recyclingImageView, C12063c.f fVar, int i11, C12063c.d.a aVar) {
        try {
            if (this.f62667Z0 != null && !TextUtils.isEmpty(fVar.f62951b)) {
                m66773MN(recyclingImageView, fVar, i11, aVar);
            } else {
                aVar.mo67298a(fVar, i11, null, 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        mo66727nN(this.f72421L0.m92642L3());
        mo66738sO();
        m66874nO(this.f62685m1);
    }

    /* renamed from: PM */
    public void m66827PM(boolean z11) {
        try {
            if (!AbstractC23034c6.m118118E() && m92676n2() != null) {
                AbstractC23034c6.m118186w0(m92676n2(), AbstractC23034c6.f112029f, 109);
                return;
            }
            if (this.f62668Z1) {
                ToastUtils.m89266n(AbstractC8020f0.loading, new Object[0]);
                return;
            }
            if (this.f62686n1 == null) {
                m66762EN(1);
                return;
            }
            C12063c.f m66845YM = m66845YM();
            if (z11 && (m66845YM == null || (m66845YM.f62952c < 2 && !TextUtils.isEmpty(this.f62686n1.f42544A)))) {
                m66845YM = AbstractC32146v5.m155118a(this.f62686n1.f42544A, 2);
            }
            if (m66845YM == null) {
                ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                if (itemAlbumMobile.f42566Q) {
                    m66845YM = AbstractC32146v5.m155118a(itemAlbumMobile.f42544A, 2);
                } else {
                    m66845YM = AbstractC32146v5.m155118a(itemAlbumMobile.f42607x, 1);
                }
            }
            if (TextUtils.isEmpty(m66845YM.f62951b)) {
                m66762EN(1);
            } else {
                this.f62668Z1 = true;
                m66828QM(m66845YM, true, new C12010b(this.f62686n1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m66762EN(-1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                mo66833SM();
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: QM */
    public void m66828QM(C12063c.f fVar, boolean z11, InterfaceC12022n interfaceC12022n) {
        m66830RM(fVar, z11, false, interfaceC12022n);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Qo */
    public C12063c.f mo66829Qo(C12063c.g gVar, ItemAlbumMobile itemAlbumMobile) {
        if (!TextUtils.isEmpty(gVar.m67344s())) {
            return AbstractC32146v5.m155118a(gVar.m67344s(), 1);
        }
        if (!TextUtils.isEmpty(itemAlbumMobile.f42550D)) {
            return AbstractC32146v5.m155118a(itemAlbumMobile.f42550D, 0);
        }
        if (!TextUtils.isEmpty(itemAlbumMobile.f42548C)) {
            return AbstractC32146v5.m155118a(itemAlbumMobile.f42548C, 0);
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            if (!this.f72421L0.m92676n2().mo35576n3()) {
                AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), false);
            }
            C13306b c13306b = this.f62681i1;
            if (c13306b != null) {
                c13306b.m74709u();
            }
            C19258d c19258d = this.f62650Q1;
            if (c19258d != null) {
                c19258d.m100963t();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x000f, B:9:0x001a, B:12:0x0023, B:16:0x004c, B:18:0x0052, B:21:0x0058, B:22:0x0062, B:25:0x002c, B:27:0x0034, B:29:0x003c, B:31:0x0046), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x000f, B:9:0x001a, B:12:0x0023, B:16:0x004c, B:18:0x0052, B:21:0x0058, B:22:0x0062, B:25:0x002c, B:27:0x0034, B:29:0x003c, B:31:0x0046), top: B:1:0x0000 }] */
    /* renamed from: RM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m66830RM(C12063c.f fVar, final boolean z11, final boolean z12, final InterfaceC12022n interfaceC12022n) {
        try {
            if (TextUtils.isEmpty(fVar.f62951b)) {
                interfaceC12022n.mo66756a(1);
                return;
            }
            String str = fVar.f62951b;
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                if (AbstractC23041d2.m118194A(str)) {
                    if (str == null && !TextUtils.isEmpty(str)) {
                        m66852bO(fVar, str, z12, interfaceC12022n);
                        return;
                    }
                    if (z11) {
                        this.f62656T1.post(new Runnable() { // from class: j70.w0
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseImageViewer.this.m66801wN();
                            }
                        });
                    }
                    C26676b.m136952b("ImageViewer", "downloadPhotoAndDoSomething ENTRY");
                    mo66826Ot(null, fVar, this.f62685m1, new C12063c.d.a() { // from class: j70.x0
                        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                        /* renamed from: a */
                        public final void mo67298a(C12063c.f fVar2, int i11, C3979l c3979l, int i12) {
                            BaseImageViewer.this.m66805yN(z11, z12, interfaceC12022n, fVar2, i11, c3979l, i12);
                        }
                    });
                }
                str = null;
                if (str == null) {
                }
                if (z11) {
                }
                C26676b.m136952b("ImageViewer", "downloadPhotoAndDoSomething ENTRY");
                mo66826Ot(null, fVar, this.f62685m1, new C12063c.d.a() { // from class: j70.x0
                    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                    /* renamed from: a */
                    public final void mo67298a(C12063c.f fVar2, int i11, C3979l c3979l, int i12) {
                        BaseImageViewer.this.m66805yN(z11, z12, interfaceC12022n, fVar2, i11, c3979l, i12);
                    }
                });
            }
            File mo66832Rd = mo66832Rd(str, fVar.f62952c);
            if (mo66832Rd != null && !mo66884tN(str, fVar.f62952c) && AbstractC23258x2.m119958q(mo66832Rd.getPath())) {
                str = mo66832Rd.getAbsolutePath();
                if (str == null) {
                }
                if (z11) {
                }
                C26676b.m136952b("ImageViewer", "downloadPhotoAndDoSomething ENTRY");
                mo66826Ot(null, fVar, this.f62685m1, new C12063c.d.a() { // from class: j70.x0
                    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                    /* renamed from: a */
                    public final void mo67298a(C12063c.f fVar2, int i11, C3979l c3979l, int i12) {
                        BaseImageViewer.this.m66805yN(z11, z12, interfaceC12022n, fVar2, i11, c3979l, i12);
                    }
                });
            }
            str = null;
            if (str == null) {
            }
            if (z11) {
            }
            C26676b.m136952b("ImageViewer", "downloadPhotoAndDoSomething ENTRY");
            mo66826Ot(null, fVar, this.f62685m1, new C12063c.d.a() { // from class: j70.x0
                @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                /* renamed from: a */
                public final void mo67298a(C12063c.f fVar2, int i11, C3979l c3979l, int i12) {
                    BaseImageViewer.this.m66805yN(z11, z12, interfaceC12022n, fVar2, i11, c3979l, i12);
                }
            });
        } catch (Exception e11) {
            try {
                interfaceC12022n.mo66756a(-1);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            e11.printStackTrace();
        }
    }

    /* renamed from: RN, reason: merged with bridge method [inline-methods] */
    public void m66762EN(int i11) {
        try {
            if (i11 != -1 && i11 != 0 && i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 9) {
                            if (i11 == 10) {
                                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
                            }
                            ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_picker_storage_permission_deny_desc));
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_general_error_code, 78001));
                    return;
                }
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                return;
            }
            if (!AbstractC23238v2.m119726k()) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                return;
            }
            if (i11 == 2) {
                ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
                return;
            }
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            if (!f62624e2) {
                CoreUtility.m93148a().mo100074a(new Exception("ImageViewer download failed"));
                f62624e2 = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d
    /* renamed from: Rd */
    public File mo66832Rd(String str, int i11) {
        ItemAlbumMobile itemAlbumMobile;
        try {
            if (AbstractC23306f.m120691m2().m2466q() && (itemAlbumMobile = this.f62686n1) != null && itemAlbumMobile.m40496C() != null) {
                File m126896t = C24302e.m126896t(this.f62686n1.m40496C().toString());
                if (m126896t.exists()) {
                    return m126896t;
                }
            }
            C23528a c23528a = this.f62667Z0;
            if (c23528a != null) {
                File m123603i = c23528a.m123603i(str);
                if (m123603i != null && m123603i.exists() && m123603i.length() == 0) {
                    if (!m123603i.delete()) {
                        AbstractC23350e.m122774d("ImageViewer", "Can not delete");
                    }
                    return null;
                }
                return this.f62667Z0.m123603i(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                m92642L3.remove("medialist");
                ArrayList<? extends Parcelable> m66862gN = m66862gN();
                if (m66862gN.size() > 100) {
                    bundle.putBoolean("EXTRA_BOOLEAN_DISMISS_VIEW", true);
                } else {
                    m92642L3.putInt("currentIndex", m66860fN());
                    m92642L3.putParcelableArrayList("medialist", m66862gN);
                }
            }
            ArrayList arrayList = this.f62687o1;
            if (arrayList != null && !arrayList.isEmpty()) {
                bundle.putStringArrayList("deletedPhoto", this.f62687o1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    public void mo66833SM() {
        Handler handler = this.f62656T1;
        Intent intent = null;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (C31950hc.f146830a.m153634E() && mo66865iN() <= 0) {
            intent = new Intent();
        }
        if (intent != null) {
            intent.putExtra("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_ITEM_FROM_VIEWFULL", true);
        }
        mo66825N9(0, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: SN */
    public void mo66704SN(C12063c.f fVar) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        String m118743r0;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            m66877pO(actionBar, 0);
            m66798uO(this.f62690r1);
            if (m92656bJ() != null) {
                if (m92656bJ().isAttachedToWindow()) {
                    AbstractC32226c.m155413l(this, this.f88760a0);
                } else {
                    m92656bJ().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12017i());
                }
            }
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            this.f88760a0.setActionBarHeight(this.f72421L0.m92651WI().getDimensionPixelSize(AbstractC17454d.action_bar_default_big_height));
            this.f88760a0.setBigHeight(true);
            ActionBar actionBar2 = this.f88760a0;
            if (this.f62629A1) {
                m118743r0 = "";
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_activity_title);
            }
            actionBar2.setTitle(m118743r0);
            if (this.f88760a0.getTitleTextView() != null) {
                this.f88760a0.getTitleTextView().setTextColor(-1);
            }
            this.f88760a0.setClickable(true);
            this.f88760a0.setBackgroundResource(AbstractC16803z.action_bar_viewfull_gradient);
            this.f88760a0.setActionBarMenuOnItemClick(this.f62658U1);
            mo50252cO();
        }
    }

    /* renamed from: TM */
    public String m66834TM() {
        return this.f62646O1;
    }

    /* renamed from: TN */
    public void mo66835TN() {
        try {
            mo66745yO(null);
            mo66695BO();
            mo66694AO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f62681i1;
        if (c13306b != null) {
            c13306b.m74697c(this.f62682j1);
        }
    }

    /* renamed from: UM */
    public String m66836UM() {
        return this.f62644N1;
    }

    /* renamed from: UN */
    public void m66837UN(int i11) {
        ViewPager viewPager = this.f62675d1;
        if (viewPager != null && viewPager.getCurrentItem() == i11) {
            m66813CO(null, i11, false);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Uw */
    public void mo66838Uw(C12063c.g gVar, C12063c.f fVar, int i11) {
        this.f62634F1 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        try {
            if (!(this.f72421L0.m92662fJ().m93012K0() instanceof ZaloCameraView)) {
                this.f72421L0.m92676n2().setRequestedOrientation(1);
            }
            C13306b c13306b = this.f62681i1;
            if (c13306b != null) {
                c13306b.m74701i();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    public C12063c.c m66839VM() {
        C12063c c12063c = this.f62677e1;
        if (c12063c != null) {
            return c12063c.m67289w();
        }
        return null;
    }

    /* renamed from: VN */
    public void m66840VN(int i11, String str) {
        ViewPager viewPager = this.f62675d1;
        if (viewPager != null && viewPager.getCurrentItem() == i11) {
            m66813CO(str, i11, true);
        }
    }

    /* renamed from: WM */
    public int m66841WM() {
        ViewPager viewPager = this.f62675d1;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return 0;
    }

    /* renamed from: WN */
    public void m66842WN(C3449d.e eVar) {
        final int i11;
        this.f62670a2 = null;
        if (eVar != null) {
            try {
                if (!TextUtils.isEmpty(eVar.m17363b())) {
                    this.f62656T1.post(new Runnable() { // from class: j70.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseImageViewer.this.m66844XN();
                        }
                    });
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (this.f72421L0.m92674mJ() && !this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ()) {
                    m66762EN(-1);
                    return;
                }
                return;
            }
        }
        if (eVar != null && eVar.m17362a() == 78001) {
            MainApplication.m35468b0();
            i11 = 5;
        } else if (eVar != null && eVar.m17362a() == 78002) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f62656T1.post(new Runnable() { // from class: j70.r0
            @Override // java.lang.Runnable
            public final void run() {
                BaseImageViewer.this.m66762EN(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            try {
                this.f72421L0.m92676n2().setRequestedOrientation(2);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (z11 && z12 && !this.f72421L0.m92676n2().mo35576n3()) {
            AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), true);
        }
    }

    /* renamed from: XM */
    public C12063c.f m66843XM() {
        C12063c.c m66839VM = m66839VM();
        if (m66839VM instanceof C12063c.g) {
            return ((C12063c.g) m66839VM).f62966l;
        }
        return null;
    }

    /* renamed from: XN */
    public void m66844XN() {
        if (m92687sJ()) {
            ToastUtils.m89266n(AbstractC8020f0.str_msg_already_save_in, new Object[0]);
        }
    }

    /* renamed from: YM */
    public C12063c.f m66845YM() {
        C12063c.c m66839VM = m66839VM();
        if (m66839VM instanceof C12063c.g) {
            return ((C12063c.g) m66839VM).f62966l;
        }
        return null;
    }

    /* renamed from: YN */
    public void mo66846YN() {
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(-16777216);
        m89412p.m89426U(Boolean.FALSE);
    }

    /* renamed from: ZM */
    public String mo66847ZM() {
        int i11 = this.f62661W0;
        return (i11 != 0 && i11 == 1) ? "collection_detail" : "csc_msg_photo_full";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ZN */
    public void m66848ZN() {
        ItemAlbumMobile itemAlbumMobile;
        C32002l4 c32002l4;
        try {
            if (mo66810BM() && (itemAlbumMobile = this.f62686n1) != null && !TextUtils.isEmpty(itemAlbumMobile.f42593q)) {
                C32002l4 c32002l42 = this.f62648P1;
                if (c32002l42 != null) {
                    c32002l4 = c32002l42.m154284u(1);
                } else {
                    c32002l4 = null;
                }
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(this.f62686n1.f42593q, c32002l4).m135741H(new TrackingSource(-1)).m135743b(), 0, 1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: aN */
    public Animation m66849aN() {
        if (this.f62674c2 == null) {
            this.f62674c2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_in_short);
        }
        return this.f62674c2;
    }

    /* renamed from: aO */
    public void mo66850aO(C12063c.f fVar, String str, boolean z11, int i11) {
        ItemAlbumMobile itemAlbumMobile;
        C32027n m118497G;
        try {
            if (!this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ()) {
                C20556f c20556f = new C20556f(str);
                if (c20556f.m106830b()) {
                    String m106842o = c20556f.m106842o();
                    this.f72421L0.m92676n2().setRequestedOrientation(1);
                    Bundle bundle = new Bundle();
                    bundle.putString("imagePathUri", m106842o);
                    bundle.putBoolean("bol_share_in_app", true);
                    bundle.putBoolean("bol_extra_photo_hd", z11);
                    bundle.putInt("extra_source_log", i11);
                    bundle.putString("extra_tracking_source_feed", m66867jN());
                    if (fVar != null && (itemAlbumMobile = fVar.f62950a) != null && (m118497G = AbstractC23112j7.m118497G(itemAlbumMobile)) != null) {
                        bundle.putString("original_message_reference", m118497G.m154459M().toString());
                    }
                    this.f72421L0.m92676n2().mo35579p().m93069k2(ShareView.class, bundle, 1, true);
                    return;
                }
                ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bN */
    public Animation m66851bN() {
        if (this.f62676d2 == null) {
            this.f62676d2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_out_short);
        }
        return this.f62676d2;
    }

    /* renamed from: bO */
    public void m66852bO(final C12063c.f fVar, final String str, boolean z11, final InterfaceC12022n interfaceC12022n) {
        try {
            if (z11) {
                if (!C20551a.m106806a(str)) {
                    final String str2 = str + ".jpg";
                    File file = new File(str2);
                    boolean m119952k = AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(new C20556f(str).m106838k()));
                    if (file.exists() && file.length() > 0) {
                        interfaceC12022n.mo66757b(fVar, str2);
                    } else if (m119952k) {
                        new C12023o(str, str2, new C12023o.a() { // from class: j70.y0
                            @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.C12023o.a
                            /* renamed from: a */
                            public final void mo66928a(int i11) {
                                BaseImageViewer.m66765GN(BaseImageViewer.InterfaceC12022n.this, fVar, str2, i11);
                            }
                        }).m66927b();
                    } else {
                        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.z0
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseImageViewer.this.m66768IN(str, str2, interfaceC12022n, fVar);
                            }
                        });
                    }
                } else {
                    interfaceC12022n.mo66757b(fVar, str);
                }
            } else {
                interfaceC12022n.mo66757b(fVar, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: bz */
    public String mo66853bz() {
        if (m92642L3() != null) {
            int i11 = m92642L3().getInt("EXTRA_INT_IMAGE_VIEWER_TYPE");
            if (i11 == 2) {
                return "csc";
            }
            if (i11 == 3) {
                return "chat_storedmedia";
            }
        }
        return "";
    }

    /* renamed from: c6 */
    public void mo66708c6(List list) {
        ArrayList arrayList;
        if (this.f62684l1 != list) {
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = new ArrayList();
            }
            this.f62684l1 = arrayList;
        }
        C12063c c12063c = this.f62677e1;
        if (c12063c != null) {
            c12063c.m67288E(this.f62684l1);
        }
    }

    /* renamed from: cN */
    protected String mo66854cN(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            return itemAlbumMobile.m40535x(this.f72421L0.m92648SI());
        }
        return "";
    }

    /* renamed from: cO */
    public void mo50252cO() {
        String m66836UM;
        this.f62656T1.removeMessages(2);
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            String str = "";
            if (this.f62629A1) {
                m66836UM = "";
            } else {
                m66836UM = m66836UM();
            }
            actionBar.setTitle(m66836UM);
            ActionBar actionBar2 = this.f88760a0;
            if (!this.f62629A1) {
                str = m66834TM();
            }
            actionBar2.setSubtitle(str);
            if (!this.f62629A1 && mo66810BM()) {
                if (this.f88760a0.getTitleTextView() != null) {
                    this.f88760a0.getTitleTextView().setOnClickListener(this.f62666Y1);
                }
                if (this.f88760a0.getSubtitleTextView() != null) {
                    this.f88760a0.getSubtitleTextView().setOnClickListener(this.f62666Y1);
                }
            }
        }
    }

    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.layout_image_viewer_base;
    }

    /* renamed from: dO */
    public boolean m66855dO(int i11) {
        return m66857eO(i11, false);
    }

    /* renamed from: dr */
    public void mo66711dr(C12063c.g gVar, int i11, float f11) {
        try {
            if (!this.f62631C1) {
                AbstractC23647d.m123906p("90014402");
                AbstractC23647d.m123893c();
            }
            this.f62631C1 = true;
            if (this.f62690r1) {
                m66798uO(false);
                m66888vO(false);
            }
            C12063c.f m66843XM = m66843XM();
            if (this.f62686n1 != null && m66843XM != null && m66843XM.f62952c == 2 && this.f62649Q0) {
                this.f62649Q0 = false;
                this.f62656T1.postDelayed(new Runnable() { // from class: j70.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseImageViewer.this.m66763FN();
                    }
                }, 500L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eN */
    public ItemAlbumMobile m66856eN(int i11) {
        List list = this.f62684l1;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (ItemAlbumMobile) this.f62684l1.get(i11);
        }
        return null;
    }

    /* renamed from: eO */
    public boolean m66857eO(int i11, boolean z11) {
        boolean z12;
        boolean z13 = false;
        try {
            List list = this.f62684l1;
            if (list == null || i11 <= -1 || i11 >= list.size()) {
                return false;
            }
            if (i11 == this.f62685m1) {
                z12 = true;
            } else {
                z12 = false;
            }
            try {
                InterfaceC20278h interfaceC20278h = this.f62669a1;
                if (interfaceC20278h != null && !this.f62691s1) {
                    interfaceC20278h.mo56681D(i11);
                }
                m66869kO((ItemAlbumMobile) this.f62684l1.remove(i11), z11);
                int size = this.f62698z1.size();
                for (int i12 = 0; i12 < size; i12++) {
                    int intValue = ((Integer) this.f62698z1.get(i12)).intValue();
                    if (intValue > i11) {
                        this.f62698z1.set(i12, Integer.valueOf(intValue - 1));
                    }
                }
                int i13 = this.f62685m1;
                if (this.f62684l1.size() > size) {
                    int i14 = this.f62685m1;
                    if (i14 > 0 && i14 >= i11) {
                        i13 = i14 - 1;
                        if (this.f62698z1.contains(Integer.valueOf(i13))) {
                            int i15 = i13;
                            while (this.f62698z1.contains(Integer.valueOf(i15))) {
                                i15++;
                            }
                            if (i15 < this.f62684l1.size()) {
                                i13 = i15;
                            }
                        }
                    }
                    mo66708c6(this.f62684l1);
                    m66874nO(i13);
                } else {
                    mo66821HM();
                }
                return z12;
            } catch (Exception e11) {
                e = e11;
                z13 = z12;
                e.printStackTrace();
                return z13;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: ea */
    public int mo66858ea() {
        ViewPager viewPager = this.f62675d1;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return this.f62685m1;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: el */
    public void mo66859el(C12063c.g gVar) {
    }

    /* renamed from: fN */
    int m66860fN() {
        Iterator it = this.f62698z1.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() <= this.f62685m1) {
                i11++;
            }
        }
        int i12 = this.f62685m1 - i11;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    /* renamed from: fO */
    void m66861fO() {
        if (this.f62698z1.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f62698z1);
        Collections.sort(arrayList, new Comparator() { // from class: j70.n0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m66770JN;
                m66770JN = BaseImageViewer.m66770JN((Integer) obj, (Integer) obj2);
                return m66770JN;
            }
        });
        if (this.f62684l1 != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                int intValue = ((Integer) arrayList.get(i11)).intValue();
                if (intValue >= 0 && intValue < this.f62684l1.size()) {
                    this.f62684l1.remove(intValue);
                }
            }
        }
        this.f62698z1.clear();
    }

    /* renamed from: gN */
    ArrayList m66862gN() {
        ArrayList arrayList;
        if (this.f62684l1 != null) {
            arrayList = new ArrayList(this.f62684l1);
        } else {
            arrayList = new ArrayList();
        }
        if (this.f62698z1.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(this.f62698z1);
        Collections.sort(arrayList2, new Comparator() { // from class: j70.k0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m66806zN;
                m66806zN = BaseImageViewer.m66806zN((Integer) obj, (Integer) obj2);
                return m66806zN;
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            int intValue = ((Integer) arrayList2.get(i11)).intValue();
            if (intValue >= 0 && intValue < arrayList.size()) {
                arrayList.remove(intValue);
            }
        }
        return arrayList;
    }

    /* renamed from: gO */
    public void m66863gO(long j11) {
        this.f62656T1.removeMessages(2);
        this.f62656T1.sendEmptyMessageDelayed(2, j11);
    }

    public String getTrackingKey() {
        return "BaseImageViewer";
    }

    /* renamed from: hN */
    public Rect m66864hN() {
        View view = this.f62673c1;
        if (view != null) {
            int left = view.getLeft();
            int top = this.f62673c1.getTop();
            return new Rect(left, top, this.f62673c1.getWidth() + left, this.f62673c1.getHeight() + top);
        }
        return null;
    }

    /* renamed from: hO */
    public String mo50254hO(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.m40498F())) {
            return itemAlbumMobile.m40498F();
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_activity_title);
    }

    /* renamed from: iN */
    public int mo66865iN() {
        List list = this.f62684l1;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: iO */
    public String mo66866iO(ItemAlbumMobile itemAlbumMobile, int i11) {
        String format;
        try {
            int mo66865iN = mo66865iN();
            int m66860fN = m66860fN();
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (mo66865iN == 1) {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_fragment_photo_position_single_format), Integer.valueOf(m66860fN + 1), Integer.valueOf(mo66865iN));
                    } else {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_fragment_photo_position_format), Integer.valueOf(m66860fN + 1), Integer.valueOf(mo66865iN));
                    }
                    if (!TextUtils.isEmpty(format)) {
                        sb2.append(format);
                    }
                    String mo66854cN = mo66854cN(itemAlbumMobile);
                    if (!TextUtils.isEmpty(mo66854cN)) {
                        if (sb2.length() > 0) {
                            sb2.append(" - ");
                        }
                        sb2.append(mo66854cN);
                    }
                    return sb2.toString();
                }
                if (mo66865iN == 1) {
                    return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_fragment_photo_position_single_format), Integer.valueOf(m66860fN + 1), Integer.valueOf(mo66865iN));
                }
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_fragment_photo_position_format), Integer.valueOf(m66860fN + 1), Integer.valueOf(mo66865iN));
            }
            return mo66854cN(itemAlbumMobile);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, p205hc.InterfaceC19970i
    public void invalidateOptionsMenu() {
        View view = this.f62673c1;
        if (view != null) {
            view.post(new Runnable() { // from class: j70.t0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseImageViewer.this.m66758AN();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jN */
    public String m66867jN() {
        int i11;
        List list;
        int i12;
        ItemAlbumMobile itemAlbumMobile;
        int i13 = this.f62651R0;
        int i14 = 6;
        if (i13 != 2) {
            if (i13 != 3) {
                i11 = 0;
                if ((i13 == 4 || i13 == 5 || i13 == 6 || i13 == 12) && (list = this.f62684l1) != null && (i12 = this.f62685m1) >= 0 && i12 < list.size() && (itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(this.f62685m1)) != null && !TextUtils.isEmpty(itemAlbumMobile.f42593q)) {
                    i11 = itemAlbumMobile.f42593q.equals(CoreUtility.f89233i) ? 18 : 19;
                }
            } else {
                i11 = this.f62695w1 ? 9 : 7;
            }
        } else {
            if (this.f62695w1) {
                i14 = 8;
            }
            i11 = i14;
        }
        return new TrackingSource(i11).m40686z();
    }

    /* renamed from: jO */
    public void mo66868jO(Bundle bundle) {
        List list;
        if (bundle != null) {
            if (bundle.containsKey("deletedPhoto")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("deletedPhoto");
                this.f62687o1 = stringArrayList;
                if (stringArrayList != null && (list = this.f62684l1) != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (this.f62687o1.contains(((ItemAlbumMobile) it.next()).f42595r)) {
                            it.remove();
                        }
                    }
                }
            }
            if (bundle.getBoolean("EXTRA_BOOLEAN_DISMISS_VIEW", false)) {
                mo66821HM();
            }
        }
    }

    /* renamed from: kN */
    public void mo66721kN(Message message) {
        try {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            this.f62632D1 = true;
                            m66798uO(false);
                            m66888vO(false);
                        }
                    } else {
                        this.f62632D1 = false;
                        mo66821HM();
                    }
                } else {
                    mo50252cO();
                }
            } else {
                m66798uO(!this.f62690r1);
                m66888vO(mo66740uN());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kO */
    public void m66869kO(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42595r)) {
            if (this.f62687o1 == null) {
                this.f62687o1 = new ArrayList();
            }
            this.f62687o1.add(itemAlbumMobile.f42595r);
        }
    }

    /* renamed from: lN */
    public void m66870lN(String str) {
        if (!TextUtils.isEmpty(str)) {
            C12018j c12018j = new C12018j(this, m92676n2(), true);
            C22688w c22688w = new C22688w();
            c22688w.mo117295a(c12018j);
            c22688w.m117350h(str, 3);
        }
    }

    /* renamed from: lO */
    void m66871lO(ItemAlbumMobile itemAlbumMobile, String str, int i11, String str2) {
        mo66701NM(itemAlbumMobile, str, i11, str2);
    }

    /* renamed from: la */
    public boolean mo66724la() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: mF */
    public void mo66872mF(C12063c.g gVar, int i11) {
        this.f72421L0.m92662fJ().m93094z(true);
        m66798uO(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mO */
    public void m66873mO(String str) {
        m66871lO(null, null, 1, str);
    }

    /* renamed from: mp */
    public void mo66726mp(C12063c.g gVar, C12063c.f fVar, int i11, C3979l c3979l) {
        if (gVar != null) {
            try {
                if (gVar.f62964j != null) {
                    gVar.m67338U(false);
                    gVar.m67339V(false);
                    if (i11 == this.f62685m1) {
                        if (fVar.f62952c == 2) {
                            this.f62635G1 = false;
                            this.f62637I1 = false;
                            this.f62638J1 = true;
                        } else {
                            this.f62635G1 = false;
                            this.f62636H1 = true;
                        }
                        mo66745yO(gVar);
                        if (c3979l != null && this.f62639K1) {
                            m66823LM(gVar.f62964j, i11, c3979l);
                        }
                    }
                    if (this.f62686n1 != null) {
                        C2535j.f10308a.m12773q(mo66853bz(), this.f62686n1, false);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        int i11;
        int i12;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        boolean z15;
        boolean z16 = false;
        if (bundle != null) {
            if (bundle.containsKey("extra_entry_point_flow")) {
                this.f62648P1 = C32002l4.m154269m(bundle.getString("extra_entry_point_flow")).m154271a(4);
            } else {
                this.f62648P1 = C32002l4.m154264g(4);
            }
            if (bundle.containsKey("extra_source_log")) {
                i11 = bundle.getInt("extra_source_log");
            } else {
                i11 = this.f62689q1;
            }
            this.f62689q1 = i11;
            if (bundle.containsKey("currentIndex")) {
                i12 = bundle.getInt("currentIndex");
            } else {
                i12 = 0;
            }
            this.f62685m1 = i12;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("medialist");
            if (parcelableArrayList != null) {
                this.f62684l1 = new ArrayList(parcelableArrayList);
            }
            this.f62695w1 = bundle.getBoolean("extra_is_group", false);
            if (!bundle.containsKey("EXTRA_STR_CONVERSATION_ID")) {
                str = "";
            } else {
                str = bundle.getString("EXTRA_STR_CONVERSATION_ID");
            }
            this.f62696x1 = str;
            if (bundle.containsKey("EXTRA_BOL_ENABLE_QR_CODE_PARSE") && !bundle.getBoolean("EXTRA_BOL_ENABLE_QR_CODE_PARSE")) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f62639K1 = z11;
            if (bundle.containsKey("EXTRA_BOL_ENABLE_DOWNLOAD_PHOTO") && !bundle.getBoolean("EXTRA_BOL_ENABLE_DOWNLOAD_PHOTO")) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f62693u1 = z12;
            if (bundle.containsKey("EXTRA_BOL_ENABLE_SHARE") && !bundle.getBoolean("EXTRA_BOL_ENABLE_SHARE")) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.f62694v1 = z13;
            if (bundle.containsKey("viewOnly") && bundle.getBoolean("viewOnly")) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f62697y1 = z14;
            if (bundle.containsKey("EXTRA_INT_SUB_TITLE_MODE")) {
                i13 = bundle.getInt("EXTRA_INT_SUB_TITLE_MODE");
            } else {
                i13 = 0;
            }
            this.f62671b1 = i13;
            this.f62655T0 = bundle.getString("STR_LOG_CHAT_TYPE", "0");
            this.f62657U0 = bundle.getString("STR_SOURCE_START_VIEW", "");
            if (bundle.containsKey("extra_enable_build_original_msg") && bundle.getBoolean("extra_enable_build_original_msg")) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f62659V0 = z15;
            this.f62652R1 = bundle.getBoolean("EXTRA_BOL_IS_ENABLE_SNAPSHOT", true);
            if (bundle.containsKey("EXTRA_MY_CLOUD_VIEW_MODE")) {
                this.f62661W0 = bundle.getInt("EXTRA_MY_CLOUD_VIEW_MODE", -1);
            }
            this.f62651R0 = bundle.getInt("EXTRA_INT_IMAGE_VIEWER_TYPE", -1);
        }
        boolean z17 = this.f62639K1;
        if (AbstractC0924m0.m4361y0() != 0) {
            z16 = true;
        }
        this.f62639K1 = z17 & z16;
        if (AbstractC0924m0.m4332x0() == 1) {
            this.f62639K1 &= AbstractC0924m0.m3776ea();
        }
        boolean z18 = this.f62693u1;
        boolean z19 = this.f62697y1;
        this.f62693u1 = z18 & (!z19);
        this.f62694v1 &= !z19;
        this.f62639K1 &= !z19;
    }

    /* renamed from: nO */
    public void m66874nO(int i11) {
        mo66729oO(i11, null);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: ns */
    public void mo66875ns(C12063c.g gVar, int i11) {
        this.f62656T1.sendEmptyMessage(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: oN */
    public void mo66876oN(Bundle bundle) {
        if (this.f62684l1 == null) {
            this.f62684l1 = new ArrayList();
        }
    }

    /* renamed from: oO */
    public void mo66729oO(int i11, Boolean bool) {
        List list = this.f62684l1;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            this.f62685m1 = i11;
            this.f62686n1 = m66856eN(i11);
            mo66835TN();
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                c12063c.m67287C(i11);
            }
            ViewPager viewPager = this.f62675d1;
            if (viewPager != null) {
                if (bool == null) {
                    viewPager.setCurrentItem(this.f62685m1);
                } else {
                    viewPager.setCurrentItem(this.f62685m1, bool.booleanValue());
                }
            }
        }
    }

    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_load_hq_image) {
                if (!m66815DM()) {
                    return;
                }
                C12063c c12063c = this.f62677e1;
                if (c12063c != null) {
                    c12063c.m67286A(this.f62685m1);
                }
            } else if (id2 == AbstractC6918a0.view_hd_image) {
                if (!m66815DM()) {
                    return;
                }
                if (m66881rN()) {
                    C23283z7.m120375h(this, AbstractC8020f0.toast_seeing_hd_photo, 0, Integer.valueOf(AbstractC23222t7.f112581q0));
                } else {
                    C23283z7.m120375h(this, AbstractC8020f0.toast_seeing_hd_video, 0, Integer.valueOf(AbstractC23222t7.f112581q0));
                    C2526d.f10270a.m12685J0(this.f62655T0);
                }
            } else if (id2 == AbstractC6918a0.qrCodeTextView || id2 == AbstractC6918a0.qrCode) {
                if (!m66815DM()) {
                    return;
                }
                ItemAlbumMobile m66856eN = m66856eN(this.f62685m1);
                if (m66856eN != null) {
                    Result result = m66856eN.f42600t0;
                    if (result instanceof Result.Success) {
                        Result.Success success = (Result.Success) result;
                        if (!TextUtils.isEmpty(success.m92585e())) {
                            m66870lN(success.m92585e());
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            mo66833SM();
            return true;
        }
        return false;
    }

    public void onPageScrollStateChanged(int i11) {
        try {
            this.f62630B1 = i11;
            if (i11 == 0) {
                int m66841WM = m66841WM();
                if (this.f62685m1 != m66841WM) {
                    AbstractC23647d.m123898h("17200", "");
                    this.f62685m1 = m66841WM;
                    this.f62686n1 = m66856eN(m66841WM);
                    mo66835TN();
                } else {
                    m66888vO(mo66740uN());
                }
                mo66846YN();
                return;
            }
            if (i11 == 1 && this.f62640L1) {
                AbstractC23136l9.m118744r1(this.f62679g1, 8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(int i11, float f11, int i12) {
    }

    public void onPageSelected(int i11) {
        try {
            if (i11 != this.f62685m1) {
                this.f62685m1 = i11;
                this.f62686n1 = m66856eN(i11);
                mo66835TN();
            }
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                c12063c.m67287C(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 109) {
            if (AbstractC23034c6.m118121G()) {
                mo66702OM();
                return;
            }
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        C12063c c12063c;
        super.onResume();
        try {
            if (m66881rN() && (c12063c = this.f62677e1) != null) {
                c12063c.mo35341m();
            }
            this.f72421L0.m92676n2().setRequestedOrientation(13);
            C13306b c13306b = this.f62681i1;
            if (c13306b != null) {
                c13306b.m74710v();
            }
            if (!this.f72421L0.m92676n2().mo35576n3()) {
                AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), true);
            }
            C19258d c19258d = this.f62650Q1;
            if (c19258d != null) {
                c19258d.m100948B(this.f62667Z0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pO */
    public void m66877pO(View view, int i11) {
        m66879qO(view, i11, false);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: q9 */
    public void mo66878q9(C12063c.g gVar, C12063c.f fVar, int i11) {
        if (gVar != null) {
            try {
                if (gVar.f62964j != null && fVar != null) {
                    if (fVar.f62952c < 2) {
                        gVar.m67338U(true);
                    }
                    gVar.m67339V(false);
                    if (i11 == this.f62685m1) {
                        if (fVar.f62952c == 2) {
                            this.f62637I1 = true;
                            this.f62638J1 = false;
                        } else {
                            this.f62635G1 = true;
                            this.f62636H1 = false;
                        }
                        mo66745yO(gVar);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: qN */
    public void mo66733qN(View view) {
        this.f62675d1 = (ViewPager) view.findViewById(AbstractC6918a0.gallery);
        this.f62683k1 = view.findViewById(AbstractC6918a0.photo_gallery_background);
        m66792pN(view);
    }

    /* renamed from: qO */
    public void m66879qO(View view, int i11, boolean z11) {
        if (view != null) {
            this.f62654S1.put(view, Integer.valueOf(i11));
            if (z11 && this.f62690r1) {
                if (i11 == 0) {
                    AbstractC32146v5.m155123f(view, m66849aN());
                    return;
                } else {
                    AbstractC32146v5.m155122e(view, m66851bN());
                    return;
                }
            }
            if (!this.f62690r1) {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: r7 */
    public void mo66880r7(C12063c.g gVar, int i11) {
        Handler handler = this.f62656T1;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: rN */
    public boolean m66881rN() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: rO */
    public void mo66736rO(int i11) {
        this.f62651R0 = i11;
    }

    /* renamed from: sN */
    public boolean m66882sN() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: sO */
    public void mo66738sO() {
        m92637BK(true);
        ViewPager viewPager = this.f62675d1;
        if (viewPager != null) {
            viewPager.setPageMargin(5);
            C12063c mo66822KM = mo66822KM();
            this.f62677e1 = mo66822KM;
            mo66822KM.m67288E(this.f62684l1);
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                this.f62675d1.setAdapter(c12063c);
            }
            this.f62675d1.setOnPageChangeListener(this);
        }
        this.f62690r1 = true;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: sn */
    public void mo66883sn(C12063c.g gVar, int i11) {
        if (!mo60294yp()) {
            this.f72421L0.m92662fJ().m93094z(false);
        }
    }

    /* renamed from: tN */
    public boolean mo66884tN(String str, int i11) {
        return C23999j.m125690I2(str);
    }

    /* renamed from: tO */
    public void m66885tO(int i11) {
        boolean z11;
        try {
            C12063c.f m66845YM = m66845YM();
            if (m66845YM == null) {
                m66762EN(1);
                return;
            }
            if (m66845YM.f62952c == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            m66830RM(m66845YM, true, true, new C12011c(z11, i11));
        } catch (Exception e11) {
            e11.printStackTrace();
            m66762EN(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: uN */
    public boolean mo66740uN() {
        if (this.f62651R0 == 12 || !this.f62640L1 || !this.f62690r1 || m66839VM() == null || m66839VM().mo67294b() == null || m66839VM().mo67294b().getScale() != 1.0f) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: ue */
    public View mo66886ue() {
        return this.f62683k1;
    }

    /* renamed from: vN */
    protected boolean mo66887vN() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: vO */
    public void m66888vO(boolean z11) {
        if (z11) {
            AbstractC32146v5.m155123f(this.f62679g1, m66849aN());
        } else {
            AbstractC32146v5.m155122e(this.f62679g1, m66851bN());
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: wm */
    public void mo66889wm(boolean z11) {
        if (this.f62656T1 != null && m66882sN() && (z11 ^ this.f62690r1)) {
            this.f62656T1.removeMessages(1);
            this.f62656T1.sendEmptyMessage(1);
        }
    }

    /* renamed from: xO */
    public void mo66890xO() {
        String mo50254hO;
        String str = "";
        if (this.f62629A1) {
            mo50254hO = "";
        } else {
            mo50254hO = mo50254hO(this.f62686n1);
        }
        this.f62644N1 = mo50254hO;
        if (!this.f62629A1) {
            str = mo66866iO(this.f62686n1, this.f62671b1);
        }
        this.f62646O1 = str;
    }

    /* renamed from: yM */
    public ActionBarMenuItem m66891yM(int i11, int i12) {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            return actionBarMenu.m92738e(i11, i12);
        }
        return null;
    }

    /* renamed from: yO */
    public void mo66745yO(C12063c.g gVar) {
        if (gVar != null) {
            gVar.m67338U(this.f62635G1);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: yr */
    public boolean mo66892yr() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        if (zaloActivity instanceof InterfaceC20278h) {
            InterfaceC20278h interfaceC20278h = (InterfaceC20278h) zaloActivity;
            this.f62669a1 = interfaceC20278h;
            C20275e mo56694u = interfaceC20278h.mo56694u();
            if (mo56694u != null && mo56694u.m105876l() == null) {
                mo56694u.m105868N(zaloActivity.mo35579p().m93004H0());
            }
        }
    }

    /* renamed from: zM */
    public TextView m66893zM(int i11, int i12) {
        return m66807AM(i11, i12, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:            if (r4.m18849m() == false) goto L43;     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: zO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m66894zO() {
        C3979l c3979l;
        C3979l mo66811CE;
        C3979l c3979l2 = null;
        try {
            if (this.f62669a1 != null) {
                C12063c.c m66839VM = m66839VM();
                ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                if (itemAlbumMobile != null && (m66839VM instanceof C12063c.g)) {
                    String m67344s = ((C12063c.g) m66839VM).m67344s();
                    if (!TextUtils.isEmpty(m67344s)) {
                        c3979l = mo66811CE(m67344s, 0, ((C12063c.g) m66839VM).f62978x);
                    } else {
                        c3979l = null;
                    }
                    if (c3979l != null) {
                        try {
                            if (c3979l.m18839c().getWidth() < 240) {
                            }
                            if ((c3979l != null || c3979l.m18839c().getWidth() * c3979l.m18839c().getHeight() < 57600) && this.f62677e1 != null && this.f62685m1 > -1 && m66839VM.mo67294b() != null) {
                                c3979l = m66839VM.mo67294b().getImageInfo();
                                RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
                                this.f62692t1 = recyclingImageView;
                                recyclingImageView.setImageInfo(c3979l);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            c3979l2 = c3979l;
                            AbstractC23350e.m122776f("ImageViewer", e);
                            if (c3979l2 != null) {
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(itemAlbumMobile.f42548C) && (mo66811CE = mo66811CE(itemAlbumMobile.f42548C, 0, ((C12063c.g) m66839VM).f62978x)) != null) {
                        c3979l = mo66811CE;
                    }
                    if (c3979l != null) {
                    }
                    c3979l = m66839VM.mo67294b().getImageInfo();
                    RecyclingImageView recyclingImageView2 = new RecyclingImageView(getContext());
                    this.f62692t1 = recyclingImageView2;
                    recyclingImageView2.setImageInfo(c3979l);
                } else {
                    c3979l = null;
                }
                if (c3979l != null) {
                }
                c3979l2 = c3979l;
                this.f62669a1.mo56690i1(this, c3979l2);
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (c3979l2 != null) {
            return false;
        }
        return true;
    }
}
