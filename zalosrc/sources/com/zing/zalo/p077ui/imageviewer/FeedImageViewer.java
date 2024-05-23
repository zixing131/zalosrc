package com.zing.zalo.p077ui.imageviewer;

import ac.C0697c0;
import ac.C0708i;
import ac.C0732w;
import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import ao.InterfaceC2263e;
import as.InterfaceC2333h;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import bn.C2874g1;
import bn.C2880i1;
import bn.C2913t1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3051w0;
import bo.EnumC2963d3;
import bo.InterfaceC2946a1;
import bp0.AbstractC3102n;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.FeedSongInfoView;
import com.zing.zalo.feed.models.ActionDataImageViewer;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBottomSheet;
import com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBottomSheet;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.uicontrols.FeedLikeButtonModulesView;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.FeedImageViewer;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScanQrButton;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.social.controls.FeedLikeStatus;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import g60.C19258d;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.C20275e;
import i40.InterfaceC20278h;
import is.AbstractC20789d;
import is.AbstractC20805l;
import is.AbstractC20826v0;
import is.C20785b;
import is.C20791e;
import is.C20807m;
import is.C20815q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import l30.C22013a0;
import l80.C22126c0;
import me0.AbstractC23009a3;
import me0.AbstractC23022b5;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.AbstractC23171p0;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.C23055e5;
import me0.C23099i5;
import me0.C23212s8;
import me0.C23250w4;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mv.InterfaceC23448a;
import np.InterfaceC23923b;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import org.json.JSONArray;
import org.json.JSONObject;
import p039bp.C3067a;
import p084cs.AbstractC17569c;
import p084cs.C17567a;
import p084cs.C17570d;
import p109ds.C18062a;
import p109ds.C18063b;
import p109ds.C18064c;
import p111du.AbstractC18069a;
import p140ev.C18620i;
import p164fn.AbstractC19037k;
import p167fs.C19136a;
import p167fs.C19140e;
import p172fy.C19171b;
import p205hc.C19964c;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p398oo.C24371m0;
import p427pq.EnumC24904a;
import p455qo.C25424n0;
import p456qp.C25451c;
import p457qq.EnumC25467a;
import p509sp.C26361j;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p554up.C27353a;
import p555uq.C27357a;
import p559uv.C27373c;
import p583vq.C28570b;
import p588vw.C28652r;
import p690yq.C31050b;
import p691yr.AbstractC31062l;
import p691yr.AbstractC31064n;
import p691yr.C31060j;
import p691yr.C31063m;
import p716zh.AbstractC32146v5;
import p716zh.AbstractC32173x4;
import p716zh.C31965ic;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32065p8;
import p716zh.C32187y4;
import p726zr.C32546b;
import p726zr.C32547c;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25742h;
import sa0.C26203c;
import sa0.C26209i;
import sa0.EnumC26202b;
import td0.C26638a;
import th.AbstractC26683d;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;
import ti0.C26708g;
import tr.C26878b;
import ui0.C27280g;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28245z3;
import vg.C28203u6;
import vg.C28212v6;
import w20.InterfaceC28702e;
import wh0.C29046a;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public class FeedImageViewer extends BaseImageViewer implements InterfaceC28702e, InterfaceC0733x, InterfaceC2263e, InterfaceC23923b, View.OnLongClickListener {

    /* renamed from: d4 */
    static int f62728d4 = 1;

    /* renamed from: C3 */
    private ContentObserver f62734C3;

    /* renamed from: D3 */
    private C27357a f62736D3;

    /* renamed from: I2 */
    private boolean f62745I2;

    /* renamed from: K2 */
    ActionDataImageViewer f62749K2;

    /* renamed from: N2 */
    int f62755N2;

    /* renamed from: O2 */
    int f62757O2;

    /* renamed from: P2 */
    C10873l f62759P2;

    /* renamed from: Q2 */
    String f62761Q2;

    /* renamed from: T2 */
    LinearLayout f62767T2;

    /* renamed from: U2 */
    TextView f62769U2;

    /* renamed from: V2 */
    View f62771V2;

    /* renamed from: W2 */
    RelativeLayout f62773W2;

    /* renamed from: X2 */
    FeedLikeButtonModulesView f62775X2;

    /* renamed from: Y2 */
    RobotoTextView f62777Y2;

    /* renamed from: Y3 */
    C24230h f62778Y3;

    /* renamed from: Z2 */
    RelativeLayout f62779Z2;

    /* renamed from: Z3 */
    InterfaceC24232j f62780Z3;

    /* renamed from: a3 */
    RecyclingImageView f62781a3;

    /* renamed from: a4 */
    int f62782a4;

    /* renamed from: b3 */
    RobotoTextView f62783b3;

    /* renamed from: c3 */
    FeedSongInfoView f62785c3;

    /* renamed from: d3 */
    View f62787d3;

    /* renamed from: e3 */
    ModulesView f62788e3;

    /* renamed from: f3 */
    C16716d f62789f3;

    /* renamed from: g3 */
    C18063b f62790g3;

    /* renamed from: h3 */
    C18064c f62791h3;

    /* renamed from: i3 */
    C22126c0 f62792i3;

    /* renamed from: j3 */
    C22126c0 f62794j3;

    /* renamed from: n3 */
    ActionBarMenuItem f62802n3;

    /* renamed from: o3 */
    KeyEventCallbackC17462c f62804o3;

    /* renamed from: p3 */
    KeyEventCallbackC17462c f62806p3;

    /* renamed from: q2 */
    boolean f62807q2;

    /* renamed from: q3 */
    boolean f62808q3;

    /* renamed from: r3 */
    boolean f62810r3;

    /* renamed from: t3 */
    C27353a f62814t3;

    /* renamed from: u3 */
    C3067a f62816u3;

    /* renamed from: w3 */
    private Map f62820w3;

    /* renamed from: x3 */
    private Map f62822x3;

    /* renamed from: y3 */
    private Map f62824y3;

    /* renamed from: z3 */
    private Map f62826z3;

    /* renamed from: j2 */
    String f62793j2 = "";

    /* renamed from: k2 */
    int f62795k2 = 0;

    /* renamed from: l2 */
    long f62797l2 = 0;

    /* renamed from: m2 */
    long f62799m2 = 0;

    /* renamed from: n2 */
    int f62801n2 = 0;

    /* renamed from: o2 */
    int f62803o2 = 0;

    /* renamed from: p2 */
    boolean f62805p2 = false;

    /* renamed from: r2 */
    boolean f62809r2 = false;

    /* renamed from: s2 */
    boolean f62811s2 = false;

    /* renamed from: t2 */
    boolean f62813t2 = false;

    /* renamed from: u2 */
    boolean f62815u2 = false;

    /* renamed from: v2 */
    boolean f62817v2 = false;

    /* renamed from: w2 */
    boolean f62819w2 = false;

    /* renamed from: x2 */
    boolean f62821x2 = false;

    /* renamed from: y2 */
    int f62823y2 = -1;

    /* renamed from: z2 */
    boolean f62825z2 = false;

    /* renamed from: A2 */
    boolean f62729A2 = false;

    /* renamed from: B2 */
    boolean f62731B2 = false;

    /* renamed from: C2 */
    boolean f62733C2 = false;

    /* renamed from: D2 */
    boolean f62735D2 = false;

    /* renamed from: E2 */
    boolean f62737E2 = false;

    /* renamed from: F2 */
    boolean f62739F2 = false;

    /* renamed from: G2 */
    boolean f62741G2 = true;

    /* renamed from: H2 */
    boolean f62743H2 = false;

    /* renamed from: J2 */
    boolean f62747J2 = false;

    /* renamed from: L2 */
    boolean f62751L2 = false;

    /* renamed from: M2 */
    boolean f62753M2 = true;

    /* renamed from: R2 */
    private InterfaceC2946a1 f62763R2 = null;

    /* renamed from: S2 */
    boolean f62765S2 = false;

    /* renamed from: k3 */
    private final C13704p1 f62796k3 = new C13704p1(1);

    /* renamed from: l3 */
    boolean f62798l3 = false;

    /* renamed from: m3 */
    boolean f62800m3 = true;

    /* renamed from: s3 */
    private Snackbar f62812s3 = null;

    /* renamed from: v3 */
    private final boolean f62818v3 = AbstractC23309i.m122466uf();

    /* renamed from: A3 */
    Map f62730A3 = new HashMap();

    /* renamed from: B3 */
    private boolean f62732B3 = true;

    /* renamed from: E3 */
    Handler f62738E3 = new HandlerC12034k(Looper.getMainLooper());

    /* renamed from: F3 */
    private boolean f62740F3 = false;

    /* renamed from: G3 */
    long f62742G3 = 0;

    /* renamed from: H3 */
    boolean f62744H3 = false;

    /* renamed from: I3 */
    boolean f62746I3 = false;

    /* renamed from: J3 */
    int f62748J3 = 0;

    /* renamed from: K3 */
    boolean f62750K3 = false;

    /* renamed from: L3 */
    boolean f62752L3 = false;

    /* renamed from: M3 */
    private final View.OnLayoutChangeListener f62754M3 = new View.OnLayoutChangeListener() { // from class: j70.d2
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            FeedImageViewer.this.m66984RQ(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };

    /* renamed from: N3 */
    boolean f62756N3 = false;

    /* renamed from: O3 */
    boolean f62758O3 = false;

    /* renamed from: P3 */
    ArrayList f62760P3 = new ArrayList();

    /* renamed from: Q3 */
    boolean f62762Q3 = false;

    /* renamed from: R3 */
    boolean f62764R3 = true;

    /* renamed from: S3 */
    boolean f62766S3 = false;

    /* renamed from: T3 */
    Set f62768T3 = new HashSet();

    /* renamed from: U3 */
    boolean f62770U3 = false;

    /* renamed from: V3 */
    InterfaceC0765j f62772V3 = new C0766k();

    /* renamed from: W3 */
    C13306b.c f62774W3 = new C12031h();

    /* renamed from: X3 */
    String f62776X3 = "";

    /* renamed from: b4 */
    C2874g1.b f62784b4 = new C2874g1.b() { // from class: j70.e2
        @Override // bn.C2874g1.b
        /* renamed from: a */
        public final void mo13802a(int i11) {
            FeedImageViewer.this.m66981QQ(i11);
        }
    };

    /* renamed from: c4 */
    InterfaceC20094a f62786c4 = new C12033j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$a */
    /* loaded from: classes5.dex */
    public class C12024a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C10873l f62827a;

        C12024a(C10873l c10873l) {
            this.f62827a = c10873l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m67172d() {
            try {
                FeedImageViewer.this.f62685m1 = -1;
                Intent intent = new Intent();
                ArrayList arrayList = FeedImageViewer.this.f62760P3;
                if (arrayList != null && arrayList.size() > 0) {
                    intent.putStringArrayListExtra("EXTRA_DELETED_COMMENTS", new ArrayList<>(FeedImageViewer.this.f62760P3));
                }
                FeedImageViewer.this.m67146gS();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                FeedImageViewer.this.f72421L0.mo49315c4();
                if (FeedImageViewer.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                FeedImageViewer.this.f62760P3.add(this.f62827a.m56493u());
                if (FeedImageViewer.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_photo_delete_done));
                }
                FeedImageViewer.this.f72421L0.mo49315c4();
                FeedImageViewer.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedImageViewer.C12024a.this.m67172d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$b */
    /* loaded from: classes5.dex */
    public class C12025b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ItemAlbumMobile f62829a;

        C12025b(ItemAlbumMobile itemAlbumMobile) {
            this.f62829a = itemAlbumMobile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                FeedImageViewer.this.f72421L0.mo49315c4();
                if (FeedImageViewer.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                FeedImageViewer.this.f72421L0.mo49315c4();
                FeedImageViewer.this.m67111IS(this.f62829a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$c */
    /* loaded from: classes5.dex */
    public class C12026c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f62831a;

        C12026c(int i11) {
            this.f62831a = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m67175e(Object obj, int i11) {
            try {
                FeedImageViewer.this.f72421L0.mo49315c4();
                ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                if (C7960e.m41971c6() != null) {
                    C7960e.m41971c6().m42221O7(contactProfile, false);
                }
                if (i11 == FeedImageViewer.f62728d4) {
                    FeedImageViewer.this.m67110IR(contactProfile);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m67176f() {
            try {
                if (FeedImageViewer.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
                FeedImageViewer.this.f72421L0.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            FeedImageViewer.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.o
                @Override // java.lang.Runnable
                public final void run() {
                    FeedImageViewer.C12026c.this.m67176f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            BaseZaloView baseZaloView = FeedImageViewer.this.f72421L0;
            final int i11 = this.f62831a;
            baseZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.n
                @Override // java.lang.Runnable
                public final void run() {
                    FeedImageViewer.C12026c.this.m67175e(obj, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$d */
    /* loaded from: classes5.dex */
    public class C12027d implements InterfaceC20094a {
        C12027d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            FeedImageViewer.this.f72421L0.mo49315c4();
            if (!FeedImageViewer.this.f72421L0.m92681pJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            FeedImageViewer.this.f72421L0.mo49315c4();
            if (!FeedImageViewer.this.f72421L0.m92681pJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(C20815q.m108698l(FeedImageViewer.this.f62686n1)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$e */
    /* loaded from: classes5.dex */
    public class C12028e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f62834a;

        C12028e(String str) {
            this.f62834a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            if (!FeedImageViewer.this.f72421L0.m92677nJ() && !FeedImageViewer.this.f72421L0.m92681pJ()) {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                String str = this.f62834a;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = 0;
                }
                feedImageViewer.m67096zR(str, i11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ItemAlbumMobile itemAlbumMobile;
            JSONObject optJSONObject;
            try {
                if (!FeedImageViewer.this.f72421L0.m92677nJ() && !FeedImageViewer.this.f72421L0.m92681pJ()) {
                    boolean z11 = false;
                    if ((obj instanceof JSONObject) && (optJSONObject = ((JSONObject) obj).optJSONObject("data")) != null) {
                        itemAlbumMobile = ItemAlbumMobile.m40493h0(optJSONObject);
                        if (itemAlbumMobile != null) {
                            z11 = true;
                        }
                    } else {
                        itemAlbumMobile = null;
                    }
                    if (!z11) {
                        FeedImageViewer.this.m67096zR(this.f62834a, 2);
                        return;
                    }
                    itemAlbumMobile.f42612z0 = System.currentTimeMillis();
                    FeedImageViewer.this.m66997VR(itemAlbumMobile);
                    FeedImageViewer.this.m66931AR(this.f62834a, itemAlbumMobile);
                    FeedImageViewer feedImageViewer = FeedImageViewer.this;
                    if (TextUtils.equals(((ItemAlbumMobile) feedImageViewer.f62684l1.get(feedImageViewer.f62685m1)).f42595r, this.f62834a)) {
                        FeedImageViewer.this.m67065pR(itemAlbumMobile);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedImageViewer.this.m67096zR(this.f62834a, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$f */
    /* loaded from: classes5.dex */
    public class C12029f implements InterfaceC20094a {
        C12029f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            FeedImageViewer feedImageViewer = FeedImageViewer.this;
            feedImageViewer.f62770U3 = false;
            feedImageViewer.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            FeedImageViewer feedImageViewer = FeedImageViewer.this;
            feedImageViewer.f62770U3 = false;
            feedImageViewer.f72421L0.mo49315c4();
            if (obj != null) {
                try {
                    FeedImageViewer.this.m67121NR(obj);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$g */
    /* loaded from: classes5.dex */
    public class C12030g extends AbstractC32173x4 {
        C12030g(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // p716zh.AbstractC32173x4
        /* renamed from: d */
        public boolean mo46310d(C32187y4 c32187y4) {
            if (m155151j() == null) {
                return false;
            }
            Iterator it = m155151j().iterator();
            while (it.hasNext()) {
                if (((C32187y4) it.next()).m155183k() == c32187y4.m155183k()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$h */
    /* loaded from: classes5.dex */
    class C12031h extends C13306b.c {
        C12031h() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str = c28212v6.f131577c;
            str.hashCode();
            if (!str.equals("tip.open_qr")) {
                if (!str.equals("tip.socialviewfull.msgfeed")) {
                    return super.mo66900a(c28212v6);
                }
                ActionBarMenuItem actionBarMenuItem = FeedImageViewer.this.f62802n3;
                if (actionBarMenuItem == null || actionBarMenuItem.getVisibility() != 0) {
                    return false;
                }
                return true;
            }
            View view = FeedImageViewer.this.f62679g1;
            if (!(view instanceof ScanQrButton) || view.getVisibility() != 0) {
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            str.hashCode();
            if (!str.equals("tip.open_qr")) {
                if (str.equals("tip.socialviewfull.msgfeed")) {
                    c26203c.f124525p = -AbstractC23136l9.m118742r(6.0f);
                }
            } else {
                C28212v6 c28212v62 = c26203c.f124532w;
                c28212v62.f131592r = 5L;
                c28212v62.f131593s = true;
                c26203c.f124507D = EnumC26202b.TOP;
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130862s;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (!str.equals("tip.open_qr")) {
                if (str.equals("tip.socialviewfull.msgfeed")) {
                    return new C26209i(FeedImageViewer.this.f62802n3);
                }
                return null;
            }
            View view = FeedImageViewer.this.f62679g1;
            if (view instanceof ScanQrButton) {
                return new C26209i(view);
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (FeedImageViewer.this.f72421L0.m92672lJ() && FeedImageViewer.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: m */
        public void mo66905m(ShowcaseView showcaseView, C28212v6 c28212v6) {
            if (c28212v6 != null) {
                String str = c28212v6.f131577c;
                str.hashCode();
                if (str.equals("tip.open_qr")) {
                    AbstractC28025b8.f130836M = true;
                    AbstractC0924m0.m4030mo(AbstractC0924m0.m3245M5() + 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$i */
    /* loaded from: classes5.dex */
    public class C12032i implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f62839a;

        C12032i(String str) {
            this.f62839a = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            FeedImageViewer.this.m67076tQ(this.f62839a, bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            FeedImageViewer.this.m67073sQ(aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$j */
    /* loaded from: classes5.dex */
    public class C12033j implements InterfaceC20094a {
        C12033j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m67179e() {
            try {
                if (FeedImageViewer.this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
                }
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.f62691s1 = true;
                new C19171b().m101508a(new C19171b.a(FeedImageViewer.this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, feedImageViewer.f62648P1).m135743b(), 0, 1));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m67180f() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_deniedAvtgallery));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (FeedImageViewer.this.f72421L0.m92674mJ() && !FeedImageViewer.this.f72421L0.m92677nJ()) {
                    FeedImageViewer.this.f72421L0.mo49315c4();
                    FeedImageViewer.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedImageViewer.C12033j.m67180f();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (FeedImageViewer.this.f72421L0.m92674mJ() && !FeedImageViewer.this.f72421L0.m92677nJ()) {
                    FeedImageViewer.this.f72421L0.mo49315c4();
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        String optString = jSONObject.optJSONObject("data").optString("org", "");
                        ContactProfile contactProfile = AbstractC23304d.f113368c0;
                        contactProfile.f42446v = optString;
                        contactProfile.f42323A1 = optString;
                        AbstractC23309i.m121068Iz(contactProfile.m40373K());
                        FeedImageViewer.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedImageViewer.C12033j.this.m67179e();
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$k */
    /* loaded from: classes5.dex */
    class HandlerC12034k extends Handler {
        HandlerC12034k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C13306b c13306b;
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    FeedImageViewer.this.m66934CP();
                } else if (i11 != 2) {
                    if (i11 == 3 && FeedImageViewer.this.m92685rJ() && FeedImageViewer.this.m92674mJ() && (c13306b = FeedImageViewer.this.f62681i1) != null) {
                        c13306b.m74699e("tip.socialviewfull.msgfeed");
                    }
                } else {
                    FeedImageViewer.this.m67153kQ();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$l */
    /* loaded from: classes5.dex */
    class C12035l extends LinkedHashMap {
        C12035l() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 15) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$m */
    /* loaded from: classes5.dex */
    public class C12036m extends ContentObserver {
        C12036m(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11, Uri uri) {
            String m119855c;
            super.onChange(z11, uri);
            if (uri != null && (m119855c = AbstractC23254w8.m119855c(FeedImageViewer.this.getContext(), uri)) != null && AbstractC23009a3.m117960k(m119855c)) {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.m67074sR(feedImageViewer.f62686n1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$n */
    /* loaded from: classes5.dex */
    public class C12037n implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f62845a;

        /* renamed from: b */
        final /* synthetic */ ItemAlbumMobile f62846b;

        /* renamed from: c */
        final /* synthetic */ boolean f62847c;

        C12037n(String str, ItemAlbumMobile itemAlbumMobile, boolean z11) {
            this.f62845a = str;
            this.f62846b = itemAlbumMobile;
            this.f62847c = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m67183e(boolean z11, String str, List list) {
            ItemAlbumMobile itemAlbumMobile;
            try {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                ActionDataImageViewer actionDataImageViewer = feedImageViewer.f62749K2;
                if (actionDataImageViewer != null && actionDataImageViewer.f45945p) {
                    feedImageViewer.f62751L2 = true;
                    feedImageViewer.m67164sS(true);
                }
                FeedImageViewer.this.m67168vS(true);
                FeedImageViewer feedImageViewer2 = FeedImageViewer.this;
                feedImageViewer2.f62753M2 = true;
                if (z11) {
                    if (feedImageViewer2.m67109IQ(feedImageViewer2.f62685m1)) {
                        FeedImageViewer feedImageViewer3 = FeedImageViewer.this;
                        itemAlbumMobile = (ItemAlbumMobile) feedImageViewer3.f62684l1.get(feedImageViewer3.f62685m1);
                    } else {
                        itemAlbumMobile = null;
                    }
                    if (itemAlbumMobile != null) {
                        itemAlbumMobile.f42548C = str;
                        itemAlbumMobile.f42607x = str;
                    }
                } else if (list != null) {
                    feedImageViewer2.f62684l1 = new ArrayList(list);
                }
                FeedImageViewer.this.m67137WR();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m67184f(String str, C20096c c20096c) {
            FeedImageViewer.this.m67156mR(str);
            FeedImageViewer.this.m67151jQ(c20096c);
            FeedImageViewer feedImageViewer = FeedImageViewer.this;
            feedImageViewer.m66874nO(feedImageViewer.f62685m1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (FeedImageViewer.this.f72421L0.m92674mJ() && !FeedImageViewer.this.f72421L0.m92677nJ()) {
                    FeedImageViewer.this.f72421L0.mo49315c4();
                    BaseZaloView baseZaloView = FeedImageViewer.this.f72421L0;
                    final String str = this.f62845a;
                    baseZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedImageViewer.C12037n.this.m67184f(str, c20096c);
                        }
                    });
                }
            } finally {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.f62746I3 = false;
                feedImageViewer.f62744H3 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (FeedImageViewer.this.f72421L0.m92674mJ() && !FeedImageViewer.this.f72421L0.m92677nJ()) {
                    FeedImageViewer.this.f72421L0.mo49315c4();
                    if (obj != null) {
                        final List m67122OR = FeedImageViewer.this.m67122OR(obj, this.f62845a, this.f62846b);
                        BaseZaloView baseZaloView = FeedImageViewer.this.f72421L0;
                        final boolean z11 = this.f62847c;
                        final String str = this.f62845a;
                        baseZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedImageViewer.C12037n.this.m67183e(z11, str, m67122OR);
                            }
                        });
                    }
                }
            } finally {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.f62746I3 = false;
                feedImageViewer.f62744H3 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$o */
    /* loaded from: classes5.dex */
    public class C12038o implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f62849a;

        /* renamed from: b */
        final /* synthetic */ int f62850b;

        /* renamed from: c */
        final /* synthetic */ boolean f62851c;

        C12038o(String str, int i11, boolean z11) {
            this.f62849a = str;
            this.f62850b = i11;
            this.f62851c = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m67187e(boolean z11, int i11, String str, List list) {
            ItemAlbumMobile itemAlbumMobile;
            try {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                ActionDataImageViewer actionDataImageViewer = feedImageViewer.f62749K2;
                if (actionDataImageViewer != null && actionDataImageViewer.f45945p) {
                    feedImageViewer.f62751L2 = true;
                    feedImageViewer.m67164sS(true);
                }
                FeedImageViewer.this.m67168vS(true);
                if (z11) {
                    if (FeedImageViewer.this.m67109IQ(i11)) {
                        itemAlbumMobile = (ItemAlbumMobile) FeedImageViewer.this.f62684l1.get(i11);
                    } else {
                        itemAlbumMobile = null;
                    }
                    if (itemAlbumMobile != null) {
                        itemAlbumMobile.f42548C = str;
                        itemAlbumMobile.f42607x = str;
                    }
                } else if (list != null) {
                    FeedImageViewer.this.f62684l1 = new ArrayList(list);
                }
                FeedImageViewer.this.m67137WR();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m67188f(String str, int i11, C20096c c20096c) {
            FeedImageViewer.this.m67158nR(str, i11);
            FeedImageViewer.this.m67151jQ(c20096c);
            FeedImageViewer feedImageViewer = FeedImageViewer.this;
            feedImageViewer.m66874nO(feedImageViewer.f62685m1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (FeedImageViewer.this.f72421L0.m92674mJ() && !FeedImageViewer.this.f72421L0.m92677nJ()) {
                    FeedImageViewer.this.f72421L0.mo49315c4();
                    BaseZaloView baseZaloView = FeedImageViewer.this.f72421L0;
                    final String str = this.f62849a;
                    final int i11 = this.f62850b;
                    baseZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedImageViewer.C12038o.this.m67188f(str, i11, c20096c);
                        }
                    });
                }
            } finally {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.f62750K3 = false;
                feedImageViewer.f62752L3 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (FeedImageViewer.this.f72421L0.m92674mJ() && !FeedImageViewer.this.f72421L0.m92677nJ()) {
                    FeedImageViewer.this.f72421L0.mo49315c4();
                    if (obj != null) {
                        final List m67124PR = FeedImageViewer.this.m67124PR(obj);
                        BaseZaloView baseZaloView = FeedImageViewer.this.f72421L0;
                        final boolean z11 = this.f62851c;
                        final int i11 = this.f62850b;
                        final String str = this.f62849a;
                        baseZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedImageViewer.C12038o.this.m67187e(z11, i11, str, m67124PR);
                            }
                        });
                    }
                }
            } finally {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.f62750K3 = false;
                feedImageViewer.f62752L3 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$p */
    /* loaded from: classes5.dex */
    public class C12039p implements BaseImageViewer.InterfaceC12022n {
        C12039p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m67190d(String str) {
            FeedImageViewer.this.m67141eQ(str);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            FeedImageViewer.this.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(C12063c.f fVar, final String str) {
            try {
                if (!FeedImageViewer.this.f72421L0.m92677nJ() && FeedImageViewer.this.f72421L0.m92687sJ() && !TextUtils.isEmpty(str)) {
                    FeedImageViewer.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedImageViewer.C12039p.this.m67190d(str);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$q */
    /* loaded from: classes5.dex */
    public class C12040q implements BaseImageViewer.InterfaceC12022n {
        C12040q() {
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            FeedImageViewer.this.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(C12063c.f fVar, String str) {
            try {
                if (!FeedImageViewer.this.f72421L0.m92677nJ() && FeedImageViewer.this.f72421L0.m92687sJ()) {
                    if (TextUtils.isEmpty(str)) {
                        ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
                    } else {
                        FeedImageViewer.this.m67126RP(str);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$r */
    /* loaded from: classes5.dex */
    public class C12041r implements AbstractC19037k.f {
        C12041r() {
        }

        @Override // p164fn.AbstractC19037k.f
        /* renamed from: a */
        public void mo463a(AbstractC19037k.e eVar, long j11) {
        }

        @Override // p164fn.AbstractC19037k.f
        /* renamed from: b */
        public void mo464b(boolean z11, AbstractC19037k.e eVar, int i11) {
            try {
                FeedImageViewer feedImageViewer = FeedImageViewer.this;
                feedImageViewer.f62758O3 = false;
                feedImageViewer.f72421L0.mo49315c4();
                if (z11) {
                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_video_already_save_in), eVar.f94898d));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$s */
    /* loaded from: classes5.dex */
    public class C12042s implements BaseImageViewer.InterfaceC12022n {
        C12042s() {
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            FeedImageViewer.this.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(C12063c.f fVar, String str) {
            try {
                if (!FeedImageViewer.this.f72421L0.m92677nJ() && FeedImageViewer.this.f72421L0.m92687sJ() && !TextUtils.isEmpty(str)) {
                    FeedImageViewer.this.m66873mO(str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FeedImageViewer$t */
    /* loaded from: classes5.dex */
    public static class C12043t {

        /* renamed from: a */
        private final String f62857a;

        /* renamed from: b */
        private final boolean f62858b;

        /* renamed from: c */
        private final long f62859c;

        public C12043t(String str, boolean z11, long j11) {
            this.f62857a = str;
            this.f62858b = z11;
            this.f62859c = j11;
        }

        /* renamed from: a */
        public boolean m67191a() {
            if (System.currentTimeMillis() - this.f62859c > 120000) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m67192b() {
            return this.f62858b;
        }
    }

    /* renamed from: AP */
    private void m66929AP() {
        Map map;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42593q) && (map = this.f62826z3) != null) {
            ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
            final String str = itemAlbumMobile2.f42593q;
            String str2 = itemAlbumMobile2.f42595r;
            if (map.containsKey(str)) {
                List list = (List) this.f62826z3.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals((String) it.next(), str2)) {
                            return;
                        }
                    }
                    list.add(str2);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                this.f62826z3.put(str, arrayList);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str2);
            this.f62826z3.put(str, arrayList2);
            if (m67011ZP(str) != null) {
                m66967MQ(str);
            } else {
                AbstractC21935u.m114537d(str, new InterfaceC23448a() { // from class: j70.m1
                    @Override // mv.InterfaceC23448a
                    /* renamed from: a */
                    public final void mo87300a(boolean z11) {
                        FeedImageViewer.this.m66970NQ(str, z11);
                    }
                });
            }
        }
    }

    /* renamed from: AQ */
    private void m66930AQ(Bundle bundle) {
        ItemAlbumMobile itemAlbumMobile;
        String str;
        try {
            this.f62809r2 = bundle.getBoolean("hideImageFunction", false);
            if (m67109IQ(this.f62685m1)) {
                itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(this.f62685m1);
            } else {
                itemAlbumMobile = null;
            }
            if (itemAlbumMobile != null) {
                str = itemAlbumMobile.f42607x;
            } else {
                str = "";
            }
            m66973OP(str, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AR */
    public void m66931AR(final String str, final ItemAlbumMobile itemAlbumMobile) {
        m67003XR(str);
        this.f72421L0.mo70710wy(new Runnable() { // from class: j70.t1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.this.m67000WQ(str, itemAlbumMobile);
            }
        });
    }

    /* renamed from: BP */
    private void m66932BP() {
        boolean z11 = true;
        if (this.f62737E2) {
            BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull = new BottomSheetMenuBundleDataPhotoViewfull();
            bottomSheetMenuBundleDataPhotoViewfull.m45548t(1);
            m66961KR(bottomSheetMenuBundleDataPhotoViewfull);
            return;
        }
        if (this.f62817v2) {
            BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull2 = new BottomSheetMenuBundleDataPhotoViewfull();
            bottomSheetMenuBundleDataPhotoViewfull2.m45548t(2);
            m66961KR(bottomSheetMenuBundleDataPhotoViewfull2);
        } else {
            if (this.f62757O2 != 0) {
                BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull3 = new BottomSheetMenuBundleDataPhotoViewfull();
                bottomSheetMenuBundleDataPhotoViewfull3.m45548t(3);
                bottomSheetMenuBundleDataPhotoViewfull3.m45526Q(this.f62793j2);
                C10873l c10873l = this.f62759P2;
                if (c10873l == null || !TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                    z11 = false;
                }
                bottomSheetMenuBundleDataPhotoViewfull3.m45520I(z11);
                bottomSheetMenuBundleDataPhotoViewfull3.m45550w(this.f62761Q2);
                m66961KR(bottomSheetMenuBundleDataPhotoViewfull3);
                return;
            }
            m66929AP();
        }
    }

    /* renamed from: BQ */
    private void m66933BQ(Bundle bundle) {
        try {
            int i11 = this.f62685m1;
            if (i11 >= 0) {
                if (i11 >= this.f62684l1.size()) {
                }
                this.f62811s2 = bundle.getBoolean("previewUploadPhoto", false);
                this.f62809r2 = bundle.getBoolean("hideImageFunction", true);
            }
            this.f62685m1 = 0;
            this.f62811s2 = bundle.getBoolean("previewUploadPhoto", false);
            this.f62809r2 = bundle.getBoolean("hideImageFunction", true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CP */
    public void m66934CP() {
        if (this.f62811s2) {
            m67138WS();
            m67102DS();
            m67166uS(false);
            return;
        }
        m66962KS();
    }

    /* renamed from: CQ */
    private void m66935CQ() {
        try {
            List list = this.f62684l1;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ItemAlbumMobile) it.next()).f42593q = this.f62793j2;
                }
                this.f62803o2 = this.f62684l1.size();
                mo66708c6(this.f62684l1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CR */
    private void m66936CR() {
        if (C28570b.m142996a().m142998b(1)) {
            m67119MR();
        } else {
            m67113JR();
        }
    }

    /* renamed from: DP */
    private void m66937DP() {
        Map map;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42593q) && (map = this.f62826z3) != null) {
            ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
            String str = itemAlbumMobile2.f42593q;
            String str2 = itemAlbumMobile2.f42595r;
            if (map.containsKey(str)) {
                List list = (List) this.f62826z3.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals((String) it.next(), str2)) {
                            return;
                        }
                    }
                    list.add(str2);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                this.f62826z3.put(str, arrayList);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str2);
            this.f62826z3.put(str, arrayList2);
            m67094zP(str);
        }
    }

    /* renamed from: DQ */
    private void m66938DQ() {
        this.f62796k3.m76614d(this.f62794j3.m111977q1(), false);
        this.f62796k3.setTypeface(this.f62794j3.m111978r1());
    }

    /* renamed from: DR */
    private void m66939DR(int i11) {
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 == 7) {
                        AbstractC23152n3.m119040e0(m92676n2(), this, C18620i.f93672O);
                        return;
                    }
                    return;
                }
                m67129S6(CoreUtility.f89233i, 0, this.f62648P1);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_change_detail_avatar", "profile_avatar"));
            AbstractC23211s7.m119589v(m92676n2(), 15, 1, true, bundle);
            return;
        }
        m67101CS(13);
    }

    /* renamed from: EP */
    private boolean m66941EP(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f62824y3) != null) {
            C12043t c12043t = (C12043t) map.get(str);
            if (c12043t != null && !c12043t.m67191a()) {
                return true;
            }
            m67013ZR(str);
        }
        return false;
    }

    /* renamed from: EQ */
    private void m66942EQ() {
        this.f62816u3 = (C3067a) new C1802w0(this, new C3067a.c(this, null)).m9378a(C3067a.class);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 instanceof ZaloActivity) {
            this.f62814t3 = (C27353a) new C1802w0((ZaloActivity) m92676n2, new C27353a.e(this, null)).m9378a(C27353a.class);
        }
    }

    /* renamed from: ER */
    private void m66943ER(int i11) {
        if (i11 != 8) {
            if (i11 == 9) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_change_detail_cover", "profile_cover"));
                AbstractC23211s7.m119589v(m92676n2(), 16, 2, true, bundle);
                return;
            }
            return;
        }
        m67101CS(14);
    }

    /* renamed from: FP */
    private boolean m66945FP(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f62820w3) != null) {
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) map.get(str);
            if (itemAlbumMobile != null && System.currentTimeMillis() - itemAlbumMobile.f42612z0 < 60000) {
                return true;
            }
            m67018aS(str);
        }
        return false;
    }

    /* renamed from: FQ */
    private boolean m66946FQ(ItemAlbumMobile itemAlbumMobile) {
        if (this.f62677e1 != null && itemAlbumMobile != null && !m66952HQ(itemAlbumMobile.f42595r)) {
            return true;
        }
        return false;
    }

    /* renamed from: GQ */
    private boolean m66948GQ() {
        if (AbstractC23136l9.m118687Y(m92689tK()) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: GS */
    private void m66949GS(boolean z11, boolean z12) {
        C22126c0 c22126c0 = this.f62794j3;
        if (c22126c0 != null) {
            if (z11 && !z12) {
                c22126c0.m89106L().m89017A(Boolean.FALSE).m89073z(Boolean.TRUE);
            } else {
                c22126c0.m89106L().m89073z(Boolean.FALSE).m89017A(Boolean.TRUE);
            }
        }
    }

    /* renamed from: HP */
    private void m66951HP() {
        C16719g c16719g;
        if (this.f62790g3 != null && this.f62791h3 != null) {
            if (C31060j.m150913U()) {
                this.f62791h3.mo44614b1(0);
                this.f62790g3.mo44614b1(8);
                c16719g = this.f62791h3;
            } else {
                this.f62790g3.mo44614b1(0);
                this.f62791h3.mo44614b1(8);
                c16719g = this.f62790g3;
            }
            C22126c0 c22126c0 = this.f62792i3;
            if (c22126c0 != null) {
                c22126c0.m89106L().m89054h0(c16719g);
            }
        }
    }

    /* renamed from: HQ */
    private boolean m66952HQ(String str) {
        Map map = this.f62822x3;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: HR */
    private void m66953HR(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42594q0 != null) {
            new C31050b().m101508a(new C31050b.a(itemAlbumMobile.f42594q0));
        }
    }

    /* renamed from: HS */
    private void m66954HS(ItemAlbumMobile itemAlbumMobile) {
        boolean z11;
        int m118475a = C23099i5.m118475a(itemAlbumMobile.f42561L);
        int m118475a2 = C23099i5.m118475a(itemAlbumMobile.f42560K);
        C22126c0 c22126c0 = this.f62794j3;
        boolean z12 = true;
        if (c22126c0 != null) {
            if (m118475a > 0) {
                this.f62794j3.m111959G1(AbstractC23136l9.m118698c0().getQuantityString(AbstractC7921d0.str_reaction_comment, m118475a, Integer.valueOf(m118475a)));
                this.f62794j3.mo44614b1(0);
            } else {
                c22126c0.mo44614b1(8);
            }
        }
        if (m118475a > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m118475a2 <= 0) {
            z12 = false;
        }
        m66949GS(z11, z12);
    }

    /* renamed from: JQ */
    private boolean m66957JQ() {
        boolean z11;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null) {
            z11 = itemAlbumMobile.f42593q.equals(CoreUtility.f89233i);
        } else {
            z11 = false;
        }
        if (!this.f62729A2 || !z11 || this.f62685m1 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: KP */
    private void m66959KP() {
        C20275e c20275e;
        if (this.f62739F2) {
            InterfaceC20278h interfaceC20278h = this.f62669a1;
            if (interfaceC20278h != null) {
                c20275e = interfaceC20278h.mo56694u();
            } else {
                c20275e = null;
            }
            if (c20275e != null) {
                c20275e.m105883v(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KQ */
    public /* synthetic */ void m66960KQ(final String str, boolean z11) {
        if (!m92677nJ() && !m92681pJ()) {
            m66992UR(str, new C12043t(str, z11, System.currentTimeMillis()));
            mo70710wy(new Runnable() { // from class: j70.w1
                @Override // java.lang.Runnable
                public final void run() {
                    FeedImageViewer.this.m66964LQ(str);
                }
            });
        }
    }

    /* renamed from: KR */
    private void m66961KR(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(6);
        bottomSheetMenuBundleData.m45508i(bottomSheetMenuBundleDataPhotoViewfull);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        if (bottomSheetMenuBundleDataPhotoViewfull.m45534d() != null) {
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
        }
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 21, 1, true);
    }

    /* renamed from: KS */
    private void m66962KS() {
        ItemAlbumMobile itemAlbumMobile;
        if (m67109IQ(this.f62685m1)) {
            itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(this.f62685m1);
        } else {
            itemAlbumMobile = null;
        }
        if (itemAlbumMobile != null) {
            m67138WS();
            m67102DS();
            m66980QP(itemAlbumMobile.f42595r);
            m66987SR();
            return;
        }
        m67138WS();
        m67102DS();
        m67120MS(null, false);
        m67019aT(null, false);
        m67166uS(false);
    }

    /* renamed from: LR */
    private void m66965LR() {
        C12043t c12043t;
        if (this.f62686n1 == null) {
            return;
        }
        BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull = new BottomSheetMenuBundleDataPhotoViewfull();
        boolean z11 = false;
        bottomSheetMenuBundleDataPhotoViewfull.m45548t(0);
        bottomSheetMenuBundleDataPhotoViewfull.m45519H(this.f62686n1);
        bottomSheetMenuBundleDataPhotoViewfull.m45526Q(this.f62793j2);
        bottomSheetMenuBundleDataPhotoViewfull.m45550w(this.f62761Q2);
        bottomSheetMenuBundleDataPhotoViewfull.m45515B(this.f62813t2);
        bottomSheetMenuBundleDataPhotoViewfull.m45553z(this.f62731B2);
        bottomSheetMenuBundleDataPhotoViewfull.m45552y(this.f62729A2);
        bottomSheetMenuBundleDataPhotoViewfull.m45551x(this.f62825z2);
        bottomSheetMenuBundleDataPhotoViewfull.m45517D(this.f62821x2);
        bottomSheetMenuBundleDataPhotoViewfull.m45516C(this.f62733C2);
        Map map = this.f62824y3;
        if (map != null) {
            c12043t = (C12043t) map.get(this.f62686n1.f42593q);
        } else {
            c12043t = null;
        }
        if (c12043t != null && c12043t.m67192b()) {
            z11 = true;
        }
        bottomSheetMenuBundleDataPhotoViewfull.m45521J(z11);
        bottomSheetMenuBundleDataPhotoViewfull.m45518F(this.f62640L1);
        bottomSheetMenuBundleDataPhotoViewfull.m45522K(this.f62642M1);
        bottomSheetMenuBundleDataPhotoViewfull.m45549u(this.f62685m1);
        m66961KR(bottomSheetMenuBundleDataPhotoViewfull);
    }

    /* renamed from: NP */
    private void m66969NP(String str, ItemAlbumMobile itemAlbumMobile, boolean z11) {
        try {
            if (this.f62746I3) {
                return;
            }
            this.f62746I3 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12037n(str, itemAlbumMobile, z11));
            this.f62742G3 = System.currentTimeMillis();
            c0766k.mo1641g4(this.f62793j2, "1", "1");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NQ */
    public /* synthetic */ void m66970NQ(final String str, boolean z11) {
        if (!m92677nJ() && !m92681pJ()) {
            m66992UR(str, new C12043t(str, z11, System.currentTimeMillis()));
            mo70710wy(new Runnable() { // from class: j70.v1
                @Override // java.lang.Runnable
                public final void run() {
                    FeedImageViewer.this.m66967MQ(str);
                }
            });
        }
    }

    /* renamed from: NS */
    private void m66971NS(ItemAlbumMobile itemAlbumMobile, C32547c c32547c) {
        String str;
        itemAlbumMobile.f42560K = c32547c.m157611b() + "";
        if (c32547c.m157612c()) {
            str = "1";
        } else {
            str = "0";
        }
        itemAlbumMobile.f42552E = str;
        itemAlbumMobile.f42563N = c32547c.m157610a();
    }

    /* renamed from: OP */
    private void m66973OP(String str, boolean z11) {
        try {
            if (this.f62750K3) {
                return;
            }
            this.f62750K3 = true;
            int i11 = this.f62685m1;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12038o(str, i11, z11));
            this.f62742G3 = System.currentTimeMillis();
            c0766k.mo1529S3(this.f62793j2, 1, 1, this.f62748J3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PP */
    private void m66976PP(String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12028e(str));
        c0766k.mo1507P5(str, 1, "", false, C32017m4.m154326S().m154379y(this.f62648P1), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PQ */
    public /* synthetic */ void m66977PQ() {
        int i11;
        InterfaceC20278h interfaceC20278h = this.f62669a1;
        if (interfaceC20278h != null && (i11 = this.f62685m1) > -1) {
            interfaceC20278h.mo56684H0(this, i11);
            m66894zO();
        }
    }

    /* renamed from: PS */
    private void m66978PS(String str, C32547c c32547c) {
        ItemAlbumMobile m67016aQ;
        if (m66945FP(str) && (m67016aQ = m67016aQ(str)) != null) {
            m66971NS(m67016aQ, c32547c);
        }
    }

    /* renamed from: QP */
    private void m66980QP(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!m66952HQ(str)) {
                m67039fS(str);
                ItemAlbumMobile m67016aQ = m67016aQ(str);
                if (m67016aQ != null) {
                    m66931AR(str, m67016aQ);
                    if (TextUtils.equals(((ItemAlbumMobile) this.f62684l1.get(this.f62685m1)).f42595r, str)) {
                        m67065pR(m67016aQ);
                        return;
                    }
                    return;
                }
                m66976PP(str);
                return;
            }
            return;
        }
        m67096zR(str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QQ */
    public /* synthetic */ void m66981QQ(int i11) {
        try {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 == 6) {
                                m67129S6(CoreUtility.f89233i, 0, this.f62648P1);
                            }
                        } else {
                            AbstractC23211s7.m119587t(m92676n2(), 16, 2);
                        }
                    } else {
                        m67101CS(14);
                    }
                } else {
                    AbstractC23211s7.m119587t(m92676n2(), 15, 1);
                }
            } else {
                m67101CS(13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: QR */
    private void m66982QR(ItemAlbumMobile itemAlbumMobile) {
        C17391z m108789V;
        if (itemAlbumMobile.f42591p == 2 && (this.f62677e1.m67289w() instanceof C12063c.h)) {
            if (itemAlbumMobile.f42588m0 == null && (m108789V = AbstractC20826v0.m108789V(itemAlbumMobile.f42594q0)) != null) {
                itemAlbumMobile.f42588m0 = m67030dQ(m108789V);
                itemAlbumMobile.f42587l0 = m108789V.m92540e().toString();
            }
            if (itemAlbumMobile.f42588m0 != null) {
                this.f62650Q1.m100955I();
                C12063c.h hVar = (C12063c.h) this.f62677e1.m67289w();
                int height = this.f62767T2.getHeight();
                C19258d c19258d = this.f62650Q1;
                C23528a c23528a = this.f62667Z0;
                if (height <= 0) {
                    height = AbstractC23136l9.m118742r(60.0f);
                }
                c19258d.m100964u(c23528a, itemAlbumMobile, hVar, height);
                return;
            }
            return;
        }
        C19258d c19258d2 = this.f62650Q1;
        if (c19258d2 != null) {
            c19258d2.m100955I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RQ */
    public /* synthetic */ void m66984RQ(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.f62650Q1 != null) {
            this.f62650Q1.m100950D(view.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SQ */
    public /* synthetic */ void m66986SQ(C19964c c19964c) {
        C3067a.a aVar = (C3067a.a) c19964c.m103749a();
        if (aVar instanceof C3067a.b) {
            m67070rQ((C3067a.b) aVar);
            return;
        }
        if (aVar instanceof C3067a.d) {
            C3067a.d dVar = (C3067a.d) aVar;
            m67093yS(dVar.m14759c(), dVar.m14760d(), dVar.m14758b(), dVar.m14757a(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.imageviewer.l
                @Override // as.InterfaceC2333h
                /* renamed from: b */
                public final void mo12288b(int i11) {
                    FeedImageViewer.this.m67104FR(i11);
                }
            });
        } else {
            if (aVar instanceof C3067a.f) {
                C3067a.f fVar = (C3067a.f) aVar;
                if (m92672lJ()) {
                    ToastUtils.showMess(fVar.m14761a());
                    return;
                }
                return;
            }
            if (aVar instanceof C3067a.e) {
                m67170xS(C19140e.m100450e(m92689tK()));
            }
        }
    }

    /* renamed from: SR */
    private void m66987SR() {
        ItemAlbumMobile itemAlbumMobile;
        int i11;
        List list = this.f62684l1;
        if (list != null && this.f62818v3) {
            ItemAlbumMobile itemAlbumMobile2 = null;
            if (list.size() > 1 && (i11 = this.f62685m1) > 0) {
                itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(i11 - 1);
            } else {
                itemAlbumMobile = null;
            }
            if (this.f62684l1.size() > 1 && this.f62685m1 < this.f62684l1.size() - 1) {
                itemAlbumMobile2 = (ItemAlbumMobile) this.f62684l1.get(this.f62685m1 + 1);
            }
            if (itemAlbumMobile != null) {
                m66980QP(itemAlbumMobile.f42595r);
            }
            if (itemAlbumMobile2 != null) {
                m66980QP(itemAlbumMobile2.f42595r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TQ */
    public /* synthetic */ void m66989TQ(final C19964c c19964c) {
        this.f72827B0.post(new Runnable() { // from class: j70.p1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.this.m66986SQ(c19964c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UQ */
    public /* synthetic */ void m66991UQ(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (this.f62745I2) {
            this.f62691s1 = true;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_AVATAR_PICID", this.f62686n1.f42595r);
            intent.putExtra("EXTRA_RESULT_AVATAR_PATH", this.f62686n1.f42607x);
            mo50035CK(-1, intent);
            finish();
            return;
        }
        int i13 = this.f62755N2;
        if (i13 == AbstractC6918a0.menu_reuse_avatar) {
            i12 = 6;
        } else if (i13 == AbstractC6918a0.btn_action) {
            i12 = 5;
        } else {
            i12 = 0;
        }
        TrackingSource m154335G = C32017m4.m154326S().m154335G(this.f62648P1.m154284u(i12));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f62786c4);
        c0766k.mo1520Qa(Long.parseLong(this.f62686n1.f42595r), true, m154335G);
    }

    /* renamed from: UR */
    private void m66992UR(String str, C12043t c12043t) {
        Map map;
        if (c12043t != null && (map = this.f62824y3) != null) {
            map.put(str, c12043t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: US */
    public void m66993US() {
        InterfaceC2946a1 interfaceC2946a1 = this.f62763R2;
        if (interfaceC2946a1 != null) {
            this.f62785c3.m44419f(interfaceC2946a1, this);
            this.f62785c3.setVisibility(0);
        } else {
            this.f62785c3.setVisibility(8);
        }
        m67027cS();
    }

    /* renamed from: VP */
    private List m66995VP(int i11) {
        List list = this.f62684l1;
        if (list != null && !list.isEmpty() && m67109IQ(i11)) {
            String str = ((ItemAlbumMobile) list.get(i11)).f42599t;
            ArrayList arrayList = new ArrayList();
            if (this.f62815u2) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) list.get(i12);
                    if (str.equals(itemAlbumMobile.f42599t)) {
                        arrayList.add(itemAlbumMobile);
                    }
                }
            } else if (this.f62825z2) {
                int max = Math.max(0, i11 - 30);
                int max2 = Math.max(Math.min(list.size() - 1, i11 + 30), 0);
                if (list.size() > 0 && max2 < list.size() && max < max2) {
                    while (max <= max2) {
                        ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) list.get(max);
                        if (str.equals(itemAlbumMobile2.f42599t)) {
                            arrayList.add(itemAlbumMobile2);
                        }
                        max++;
                    }
                } else if (m67109IQ(i11)) {
                    arrayList.add((ItemAlbumMobile) list.get(i11));
                }
            } else if (m67109IQ(i11)) {
                arrayList.add((ItemAlbumMobile) list.get(i11));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VQ */
    public /* synthetic */ void m66996VQ(String str, int i11) {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && TextUtils.equals(str, itemAlbumMobile.f42595r)) {
            if (i11 == 50001) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.image_view_get_info_error_network));
            }
            if (this.f62821x2) {
                m67116LS(str);
                return;
            }
            m67138WS();
            m67102DS();
            m67105FS(null, false);
            m67120MS(null, false);
            m67019aT(null, false);
            m67165tS(false);
            m66998VS(this.f62686n1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VR */
    public void m66997VR(ItemAlbumMobile itemAlbumMobile) {
        Map map;
        if (itemAlbumMobile != null && (map = this.f62820w3) != null) {
            map.put(itemAlbumMobile.f42595r, itemAlbumMobile);
        }
    }

    /* renamed from: VS */
    private void m66998VS(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        if (this.f62686n1 != null && itemAlbumMobile != null) {
            if (!z11) {
                this.f62763R2 = null;
            }
            m66993US();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WQ */
    public /* synthetic */ void m67000WQ(String str, ItemAlbumMobile itemAlbumMobile) {
        ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
        if (itemAlbumMobile2 != null && TextUtils.equals(itemAlbumMobile2.f42595r, str)) {
            m67056mQ(itemAlbumMobile);
            m67092yR(itemAlbumMobile);
            m67116LS(str);
            m66953HR(itemAlbumMobile);
            return;
        }
        m67056mQ(itemAlbumMobile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XQ */
    public /* synthetic */ void m67002XQ() {
        this.f62801n2++;
        m67115LP();
    }

    /* renamed from: XR */
    private void m67003XR(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f62822x3) != null) {
            map.remove(str);
        }
    }

    /* renamed from: XS */
    private void m67004XS(String str, ItemAlbumMobile itemAlbumMobile) {
        Map map;
        long currentTimeMillis;
        if (!TextUtils.isEmpty(str) && itemAlbumMobile != null && (map = this.f62820w3) != null) {
            ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) map.get(str);
            if (itemAlbumMobile2 != null) {
                currentTimeMillis = itemAlbumMobile2.f42612z0;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            itemAlbumMobile.f42612z0 = currentTimeMillis;
            this.f62820w3.put(str, itemAlbumMobile);
        }
    }

    /* renamed from: YP */
    private ItemAlbumMobile m67006YP() {
        int i11;
        try {
            List list = this.f62684l1;
            if (list == null || (i11 = this.f62685m1) < 0) {
                return null;
            }
            return m67016aQ(((ItemAlbumMobile) list.get(i11)).f42595r);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YQ */
    public /* synthetic */ void m67007YQ(ArrayList arrayList) {
        try {
            if (arrayList.size() == 0) {
                if (this.f62805p2) {
                    this.f62770U3 = false;
                    this.f72421L0.mo70710wy(new Runnable() { // from class: j70.u1
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedImageViewer.this.m67002XQ();
                        }
                    });
                }
            } else {
                this.f62684l1.addAll(arrayList);
                this.f62801n2++;
                mo66708c6(this.f62684l1);
                this.f62738E3.removeMessages(1);
                this.f62738E3.sendEmptyMessageDelayed(1, 1000L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YR */
    private void m67008YR() {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: j70.f2
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.m67026cR();
            }
        });
    }

    /* renamed from: YS */
    private void m67009YS() {
        if (AbstractC23136l9.m118666N0(this.f62783b3)) {
            this.f62783b3.setTranslationY((AbstractC23136l9.m118722k0() / 2) + AbstractC23136l9.m118742r(30.0f));
        }
    }

    /* renamed from: ZP */
    private C12043t m67011ZP(String str) {
        Map map;
        if (!m66941EP(str) || (map = this.f62824y3) == null) {
            return null;
        }
        return (C12043t) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZQ */
    public static /* synthetic */ void m67012ZQ(C3979l c3979l, C12063c.g gVar, C12063c.f fVar) {
        if (c3979l != null && c3979l.m18849m()) {
            gVar.mo67340n(fVar, c3979l);
            View view = gVar.f62961g;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: ZR */
    private void m67013ZR(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f62824y3) != null) {
            map.remove(str);
        }
    }

    /* renamed from: ZS */
    private void m67014ZS(ItemAlbumMobile itemAlbumMobile) {
        List arrayList;
        String str;
        int i11;
        C3051w0 c3051w0 = itemAlbumMobile.f42562M;
        C32546b c32546b = itemAlbumMobile.f42563N;
        C17570d c17570d = new C17570d(m92689tK());
        int m118475a = C23099i5.m118475a(itemAlbumMobile.f42560K);
        if (c3051w0 != null) {
            arrayList = AbstractC20826v0.m108792W0(c3051w0.f12301a);
        } else {
            arrayList = new ArrayList();
        }
        String m93559b = AbstractC17569c.Companion.m93559b(c17570d, itemAlbumMobile.f42552E.equals("1"), arrayList, m118475a, 10);
        C22126c0 c22126c0 = this.f62794j3;
        if (c22126c0 != null) {
            str = c22126c0.m111973m1().toString();
        } else {
            str = "";
        }
        float measureText = this.f62796k3.measureText(m93559b);
        float measureText2 = this.f62796k3.measureText(str);
        if (c32546b != null) {
            i11 = c32546b.m157606b().size();
        } else {
            i11 = 0;
        }
        C17567a c17567a = new C17567a();
        c17567a.m93550a(this.f62796k3, c17570d, measureText, measureText2, itemAlbumMobile.f42552E.equals("1"), m118475a);
        this.f62792i3.m111959G1(c17567a.m93551c(10, i11, m93559b));
    }

    /* renamed from: aQ */
    private ItemAlbumMobile m67016aQ(String str) {
        if (m66945FP(str)) {
            return (ItemAlbumMobile) this.f62820w3.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aR */
    public /* synthetic */ void m67017aR(final C12063c.g gVar, final C12063c.f fVar, int i11, final C3979l c3979l, int i12) {
        this.f72421L0.mo70710wy(new Runnable() { // from class: j70.s1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.m67012ZQ(C3979l.this, gVar, fVar);
            }
        });
    }

    /* renamed from: aS */
    private void m67018aS(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f62820w3) != null) {
            map.remove(str);
        }
    }

    /* renamed from: aT */
    private void m67019aT(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        boolean z12;
        int i11;
        int i12 = 8;
        try {
            if (z11) {
                ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                if (itemAlbumMobile2 != null && itemAlbumMobile != null && TextUtils.equals(itemAlbumMobile.f42595r, itemAlbumMobile2.f42595r)) {
                    int m118475a = C23099i5.m118475a(itemAlbumMobile.f42560K);
                    int m118475a2 = C23099i5.m118475a(itemAlbumMobile.f42561L);
                    boolean z13 = true;
                    if (m118475a > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (m118475a2 <= 0) {
                        z13 = false;
                    }
                    m66954HS(itemAlbumMobile);
                    m67023bT(itemAlbumMobile);
                    m67014ZS(itemAlbumMobile);
                    C16716d c16716d = this.f62789f3;
                    if (m118475a > 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    AbstractC23022b5.m118028f(c16716d, i11);
                    View view = this.f62787d3;
                    if (z12 || z13) {
                        i12 = 0;
                    }
                    AbstractC23136l9.m118744r1(view, i12);
                }
            } else {
                this.f62787d3.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bR */
    public /* synthetic */ void m67021bR() {
        try {
            mo66708c6(this.f62684l1);
            m66874nO(this.f62685m1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bS */
    private void m67022bS() {
        C23744a.m124114c().m124117e(this, 15000);
        C23744a.m124114c().m124117e(this, 15001);
    }

    /* renamed from: bT */
    private void m67023bT(ItemAlbumMobile itemAlbumMobile) {
        boolean z11;
        int m118475a = C23099i5.m118475a(itemAlbumMobile.f42560K);
        boolean equals = itemAlbumMobile.f42552E.equals("1");
        if (!equals && m118475a <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C3051w0 c3051w0 = itemAlbumMobile.f42562M;
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (C31060j.m150913U()) {
            m67084wP(m118475a, equals, c3051w0, c32546b);
        } else {
            m67081vP(z11, c32546b);
        }
    }

    /* renamed from: cQ */
    private int m67025cQ() {
        if (this.f62729A2) {
            return 1;
        }
        return this.f62731B2 ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cR */
    public static /* synthetic */ void m67026cR() {
        C20807m.m108556a().m108557b();
    }

    /* renamed from: cS */
    private void m67027cS() {
        String str;
        TextView textView = this.f62769U2;
        if (textView != null && textView.getVisibility() == 0) {
            str = this.f62769U2.getText().toString();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && this.f62763R2 == null) {
            this.f62771V2.setVisibility(8);
        } else {
            this.f62771V2.setVisibility(0);
        }
    }

    /* renamed from: cT */
    private void m67028cT(final String str, final String str2, final boolean z11) {
        mo49315c4();
        mo70710wy(new Runnable() { // from class: j70.h1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.this.m67054lR(z11, str, str2);
            }
        });
    }

    /* renamed from: dQ */
    public static C27373c m67030dQ(C17391z c17391z) {
        C27373c c27373c = null;
        try {
            String str = c17391z.f88620c;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C27373c c27373c2 = new C27373c();
            try {
                c27373c2.m140250e0(str);
                c27373c2.m140237V(c17391z.f88622e);
                return c27373c2;
            } catch (Exception e11) {
                e = e11;
                c27373c = c27373c2;
                AbstractC23350e.m122778h(e);
                return c27373c;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dR */
    public /* synthetic */ void m67031dR(C16719g c16719g) {
        m67169wS();
    }

    /* renamed from: dS */
    private void m67032dS() {
        this.f62763R2 = null;
        m66993US();
        C27353a c27353a = this.f62814t3;
        if (c27353a != null) {
            c27353a.m140004w0();
        }
    }

    /* renamed from: dT */
    private void m67033dT(String str, boolean z11) {
        if (m92672lJ() && !z11) {
            if (TextUtils.isEmpty(str)) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtFail));
            } else {
                m67034dj(str, 3000);
            }
        }
    }

    /* renamed from: dj */
    private void m67034dj(final String str, final int i11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: j70.e1
                @Override // java.lang.Runnable
                public final void run() {
                    FeedImageViewer.this.m67049jR(str, i11);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eR */
    public /* synthetic */ void m67036eR(C16719g c16719g) {
        m66936CR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fR */
    public /* synthetic */ void m67038fR(View view) {
        InterfaceC2946a1 interfaceC2946a1 = this.f62763R2;
        if (interfaceC2946a1 != null && interfaceC2946a1.mo14160c().getState() == EnumC2963d3.f11684s) {
            Snackbar.m90634w(this.f62673c1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description), -1).m90644J(C27280g.m139659b(m92689tK(), AbstractC23322a.zds_ic_info_circle_solid_24, AbstractC2808b.ng60)).m90645K(AbstractC23222t7.f112591v0).m90648N();
        }
    }

    /* renamed from: fS */
    private void m67039fS(String str) {
        Map map;
        if (!TextUtils.isEmpty(str) && (map = this.f62822x3) != null) {
            map.put(str, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gQ, reason: merged with bridge method [inline-methods] */
    public void m66967MQ(String str) {
        List list;
        Map map = this.f62826z3;
        if (map != null && this.f62686n1 != null && (list = (List) map.remove(str)) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals((String) it.next(), this.f62686n1.f42595r)) {
                    m66965LR();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gR */
    public /* synthetic */ void m67042gR(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        m67009YS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hQ, reason: merged with bridge method [inline-methods] */
    public void m66964LQ(String str) {
        List list;
        Map map = this.f62826z3;
        if (map != null && this.f62686n1 != null && (list = (List) map.remove(str)) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals((String) it.next(), this.f62686n1.f42595r)) {
                    m67131SS();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hR */
    public /* synthetic */ void m67045hR(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null) {
                if (this.f62757O2 != 0) {
                    m67112JP(this.f62759P2);
                } else if (itemAlbumMobile.f42595r.length() > 0) {
                    m67108IP(itemAlbumMobile);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iR */
    public /* synthetic */ void m67047iR(int i11, String str) {
        String m108699m;
        if (!TextUtils.isEmpty(this.f62686n1.f42593q) && !TextUtils.isEmpty(this.f62686n1.f42595r)) {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12027d());
            if (this.f62757O2 != 0) {
                m108699m = "12";
            } else {
                m108699m = C20815q.m108699m(this.f62686n1);
            }
            String str2 = m108699m;
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            c0766k.mo1787ya(itemAlbumMobile.f42593q, str2, itemAlbumMobile.f42595r, "", i11, str);
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_report_abuse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jR */
    public /* synthetic */ void m67049jR(String str, int i11) {
        m67079uQ();
        this.f62812s3 = AbstractC20826v0.m108786T0(this.f62673c1, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kR */
    public /* synthetic */ void m67051kR(int i11) {
        try {
            m66855dO(i11);
            if (this.f62813t2) {
                AbstractC23304d.f113277G = new ArrayList(this.f62684l1);
            }
            if (this.f62684l1.size() > 0) {
                m66934CP();
            } else {
                this.f62685m1 = -1;
                m67146gS();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lQ */
    public void m67053lQ(InterfaceC2946a1 interfaceC2946a1) {
        if (this.f62686n1 != null && interfaceC2946a1.mo13947I().equals(this.f62686n1.f42599t)) {
            this.f62763R2 = interfaceC2946a1;
        }
        this.f72827B0.post(new Runnable() { // from class: j70.r1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.this.m66993US();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lR */
    public /* synthetic */ void m67054lR(boolean z11, String str, String str2) {
        if (m92672lJ() && !z11) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
        }
        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
        itemAlbumMobile.f42593q = this.f62793j2;
        itemAlbumMobile.f42607x = str;
        itemAlbumMobile.f42595r = str2;
        m67100BS(itemAlbumMobile);
    }

    /* renamed from: mQ */
    private void m67056mQ(ItemAlbumMobile itemAlbumMobile) {
        C3051w0 c3051w0;
        if (itemAlbumMobile != null) {
            try {
                if (this.f62684l1 != null) {
                    for (int i11 = 0; i11 < this.f62684l1.size(); i11++) {
                        ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) this.f62684l1.get(i11);
                        if (itemAlbumMobile2.f42595r.equals(itemAlbumMobile.f42595r)) {
                            itemAlbumMobile2.f42591p = itemAlbumMobile.f42591p;
                            itemAlbumMobile2.f42556G = itemAlbumMobile.f42556G;
                            itemAlbumMobile2.f42608x0 = itemAlbumMobile.f42556G;
                            itemAlbumMobile2.f42560K = itemAlbumMobile.f42560K;
                            C3051w0 c3051w02 = itemAlbumMobile.f42562M;
                            C32546b c32546b = null;
                            if (c3051w02 != null) {
                                c3051w0 = new C3051w0(c3051w02);
                            } else {
                                c3051w0 = null;
                            }
                            itemAlbumMobile2.f42562M = c3051w0;
                            if (itemAlbumMobile.f42563N != null) {
                                c32546b = new C32546b(itemAlbumMobile.f42563N);
                            }
                            itemAlbumMobile2.f42563N = c32546b;
                            itemAlbumMobile2.f42561L = itemAlbumMobile.f42561L;
                            itemAlbumMobile2.f42552E = itemAlbumMobile.f42552E;
                            itemAlbumMobile2.f42558I = itemAlbumMobile.f42558I;
                            itemAlbumMobile2.f42599t = itemAlbumMobile.f42599t;
                            itemAlbumMobile2.f42605w = itemAlbumMobile.f42605w;
                            itemAlbumMobile2.f42564O = itemAlbumMobile.f42564O;
                            itemAlbumMobile2.f42593q = itemAlbumMobile.f42593q;
                            itemAlbumMobile2.f42574Y = itemAlbumMobile.f42574Y;
                            itemAlbumMobile2.f42554F = itemAlbumMobile.f42554F;
                            itemAlbumMobile2.m40524l0(itemAlbumMobile.m40502K());
                            itemAlbumMobile2.f42594q0 = itemAlbumMobile.f42594q0;
                            itemAlbumMobile2.f42570U = itemAlbumMobile.f42570U;
                            itemAlbumMobile2.f42569T = itemAlbumMobile.f42569T;
                            m67114JS((ItemAlbumMobile) this.f62684l1.get(i11));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: mS */
    private void m67057mS() {
        this.f62779Z2.setOnClickListener(this);
        AbstractC31062l m150961a = C31063m.f143208a.m150961a(m92689tK(), C31063m.a.f143210p);
        this.f62779Z2.setBackground(AbstractC31064n.m150965a(m150961a));
        this.f62781a3.setImageDrawable(m150961a.m150959c());
        this.f62779Z2.setVisibility(4);
    }

    /* renamed from: nQ */
    private void m67059nQ(int i11, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_ERROR", false);
        if (i11 == -1) {
            if (booleanExtra) {
                String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                if (TextUtils.isEmpty(stringExtra)) {
                    m67034dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    return;
                } else {
                    m67034dj(stringExtra, 3000);
                    return;
                }
            }
            this.f62808q3 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true);
            m67143eT(m67139XP(intent));
        }
    }

    /* renamed from: nS */
    private void m67060nS() {
        this.f62773W2.setOnClickListener(this);
        this.f62773W2.setOnLongClickListener(this);
        RelativeLayout relativeLayout = this.f62773W2;
        C31060j c31060j = C31060j.f143193a;
        Context m92689tK = m92689tK();
        C31063m.a aVar = C31063m.a.f143210p;
        relativeLayout.setBackground(c31060j.m150941g(0, m92689tK, aVar));
        this.f62775X2.m47306V(10, AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
        this.f62775X2.m47308X(false, 0);
        new C26708g(this.f62777Y2).m137319a(C19140e.f95172a.m100454d(m92689tK()));
        this.f62777Y2.setTextColor(c31060j.m150933J(0, m92689tK(), aVar));
        this.f62773W2.setVisibility(4);
    }

    /* renamed from: oQ */
    private void m67062oQ(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        m67034dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    } else {
                        m67034dj(stringExtra, 3000);
                    }
                } else {
                    this.f62810r3 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false);
                    m67145fT(m67139XP(intent));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: pQ */
    private void m67064pQ(int i11, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_ERROR", false);
        if (i11 == -1) {
            if (booleanExtra) {
                String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                if (TextUtils.isEmpty(stringExtra)) {
                    m67034dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    return;
                } else {
                    m67034dj(stringExtra, 3000);
                    return;
                }
            }
            this.f62808q3 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true);
            m67143eT(m67140bQ(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pR */
    public void m67065pR(ItemAlbumMobile itemAlbumMobile) {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1054h(getTrackingKey(), "date_time", Long.valueOf(itemAlbumMobile.f42564O));
        bVar.m1054h(getTrackingKey(), "privacy_setting", Integer.valueOf(itemAlbumMobile.f42594q0.f12042V.f45973p));
        bVar.m1054h(getTrackingKey(), "likes", Integer.valueOf(Integer.parseInt(itemAlbumMobile.f42560K)));
        bVar.m1054h(getTrackingKey(), "comments", Integer.valueOf(Integer.parseInt(itemAlbumMobile.f42561L)));
        bVar.m1054h(getTrackingKey(), "media_type", Integer.valueOf(itemAlbumMobile.f42591p));
    }

    /* renamed from: qP */
    private void m67066qP() {
        String m154360f;
        if (this.f62740F3) {
            this.f62740F3 = false;
            return;
        }
        if (this.f62747J2) {
            m154360f = C32017m4.m154326S().m154361g(this.f62648P1);
        } else {
            m154360f = C32017m4.m154326S().m154360f(this.f62648P1);
        }
        AbstractC23647d.m123897g(m154360f);
    }

    /* renamed from: qQ */
    private void m67067qQ(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        m67034dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    } else {
                        m67034dj(stringExtra, 3000);
                    }
                } else {
                    this.f62810r3 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false);
                    m67145fT(m67140bQ(intent));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: qR */
    private void m67068qR(ItemAlbumMobile itemAlbumMobile) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108457g(itemAlbumMobile.f42593q, "viewfull_photodetail");
            } else if (itemAlbumMobile.f42594q0.m14512j0()) {
                C20785b.f102138a.m108458h(itemAlbumMobile.f42593q, "viewfull_photodetail");
            }
        }
    }

    /* renamed from: rP */
    private void m67069rP() {
        String m154362h;
        if (this.f62747J2) {
            m154362h = C32017m4.m154326S().m154363i(this.f62648P1);
        } else {
            m154362h = C32017m4.m154326S().m154362h(this.f62648P1);
        }
        AbstractC23647d.m123897g(m154362h);
        if (this.f62685m1 != 0) {
            this.f62740F3 = true;
        }
    }

    /* renamed from: rQ */
    private void m67070rQ(C3067a.b bVar) {
        m67123OS(this.f62685m1, bVar.m14755b());
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.f42595r.equals(bVar.m14754a())) {
            m67120MS(itemAlbumMobile, true);
            m67019aT(itemAlbumMobile, true);
            if (bVar.m14756c()) {
                if (this.f62821x2) {
                    AbstractC20805l.m108554l(this.f62730A3, itemAlbumMobile);
                }
                if (itemAlbumMobile.f42594q0 != null) {
                    C23744a.m124114c().m124116d(6101, itemAlbumMobile.f42594q0.f12057p);
                }
                m67071rR(itemAlbumMobile, bVar.m14755b().m157612c());
            }
        }
    }

    /* renamed from: rR */
    private void m67071rR(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108459i(itemAlbumMobile.f42593q, "viewfull_photodetail", z11);
            } else if (itemAlbumMobile.f42594q0.m14512j0()) {
                C20785b.f102138a.m108460j(itemAlbumMobile.f42593q, "viewfull_photodetail", z11);
            }
        }
    }

    /* renamed from: sP */
    private void m67072sP() {
        C26703b m137293a = C26705d.m137293a(m92689tK(), AbstractC2814h.t_xsmall_m);
        if (this.f62789f3 == null) {
            C16716d c16716d = new C16716d(this.f72421L0.getContext());
            this.f62789f3 = c16716d;
            c16716d.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89073z(Boolean.TRUE);
            this.f62789f3.mo44614b1(8);
        }
        if (this.f62790g3 == null) {
            C18063b c18063b = new C18063b(m92689tK());
            this.f62790g3 = c18063b;
            c18063b.m89106L().m89027K(true);
        }
        C18064c c18064c = new C18064c(m92689tK());
        this.f62791h3 = c18064c;
        c18064c.m89106L().m89028L(-2, -2).m89027K(true);
        if (this.f62792i3 == null) {
            C22126c0 c22126c0 = new C22126c0(this.f72421L0.getContext());
            this.f62792i3 = c22126c0;
            c22126c0.m89106L().m89034R(AbstractC23222t7.f112562h).m89027K(true).m89029M(12);
            new C26707f(this.f62792i3).m137318a(m137293a);
            this.f62792i3.m111962J1(C23212s8.m119606n(AbstractC2807a.constant_white));
        }
        if (this.f62794j3 == null) {
            C22126c0 c22126c02 = new C22126c0(this.f72421L0.getContext());
            this.f62794j3 = c22126c02;
            c22126c02.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89035S(AbstractC23222t7.f112582r);
            new C26707f(this.f62794j3).m137318a(m137293a);
            this.f62794j3.m111962J1(C23212s8.m119606n(AbstractC2807a.constant_white));
        }
        this.f62788e3.mo44090O();
        this.f62789f3.m89001g1(this.f62790g3);
        this.f62789f3.m89001g1(this.f62791h3);
        this.f62789f3.m89001g1(this.f62792i3);
        this.f62788e3.mo69681L(this.f62789f3);
        this.f62788e3.mo69681L(this.f62794j3);
        m66951HP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sQ */
    public void m67073sQ(C20096c c20096c) {
        try {
            try {
                mo49315c4();
                if (m92672lJ()) {
                    m67034dj(AbstractC23047d8.m118252d(c20096c), 3000);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            this.f62778Y3 = null;
            this.f62780Z3 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sR */
    public void m67074sR(ItemAlbumMobile itemAlbumMobile) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108461k(itemAlbumMobile.f42593q, "viewfull_photodetail");
            } else if (itemAlbumMobile.f42594q0.m14512j0()) {
                C20785b.f102138a.m108462l(itemAlbumMobile.f42593q, "viewfull_photodetail");
            }
        }
    }

    /* renamed from: tP */
    private void m67075tP() {
        C23744a.m124114c().m124115b(this, 15000);
        C23744a.m124114c().m124115b(this, 15001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tQ */
    public void m67076tQ(final String str, AbstractC25751q abstractC25751q) {
        try {
            try {
                mo49315c4();
                if (abstractC25751q instanceof C25742h) {
                    C25742h c25742h = (C25742h) abstractC25751q;
                    String m132869b = c25742h.m132869b();
                    final String m132868a = c25742h.m132868a();
                    if (!"null".equals(m132869b) && !m132869b.trim().equals("") && !"-2".equals(m132869b)) {
                        mo70710wy(new Runnable() { // from class: j70.y1
                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedImageViewer.this.m66974OQ(str, m132868a);
                            }
                        });
                    }
                    m67073sQ(new C20096c(502, AbstractC23161o1.m119318c(502, m132869b)));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                m67073sQ(C26638a.f126094a.m136734c());
            }
            this.f62778Y3 = null;
            this.f62780Z3 = null;
        } catch (Throwable th2) {
            this.f62778Y3 = null;
            this.f62780Z3 = null;
            throw th2;
        }
    }

    /* renamed from: tR */
    private void m67077tR(ItemAlbumMobile itemAlbumMobile) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108463m(itemAlbumMobile.f42593q, "viewfull_photodetail");
            } else if (itemAlbumMobile.f42594q0.m14512j0()) {
                C20785b.f102138a.m108464n(itemAlbumMobile.f42593q, "viewfull_photodetail");
            }
        }
    }

    /* renamed from: uP */
    private void m67078uP(String str) {
        C27353a c27353a;
        if (mo45894h0() && !m92681pJ() && (c27353a = this.f62814t3) != null) {
            c27353a.m139995n0(str);
        }
    }

    /* renamed from: uQ */
    private void m67079uQ() {
        Snackbar snackbar = this.f62812s3;
        if (snackbar != null && snackbar.m90661t()) {
            this.f62812s3.m90655n();
            this.f62812s3 = null;
        }
    }

    /* renamed from: uR */
    private void m67080uR() {
        if (this.f62814t3 != null) {
            m67083vR();
        }
    }

    /* renamed from: vP */
    private void m67081vP(boolean z11, C32546b c32546b) {
        List m150943l;
        C18063b c18063b = this.f62790g3;
        if (c18063b == null) {
            return;
        }
        if (z11) {
            if (c32546b != null) {
                m150943l = c32546b.m157606b();
            } else {
                m150943l = C31060j.f143193a.m150943l();
            }
            c18063b.m96028o1(m150943l);
            return;
        }
        c18063b.m96028o1(new ArrayList());
    }

    /* renamed from: vQ */
    private void m67082vQ() {
        if (this.f62733C2 || this.f62813t2) {
            this.f62644N1 = "";
            this.f62646O1 = "";
        }
    }

    /* renamed from: vR */
    private void m67083vR() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: j70.n1
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedImageViewer.this.m67053lQ((InterfaceC2946a1) obj);
            }
        };
        C27353a c27353a = this.f62814t3;
        if (c27353a != null) {
            c27353a.m139983W().m9219j(this, interfaceC1764d0);
        }
    }

    /* renamed from: wP */
    private void m67084wP(int i11, boolean z11, C3051w0 c3051w0, C32546b c32546b) {
        C18064c c18064c = this.f62791h3;
        if (c18064c == null) {
            return;
        }
        if (i11 <= 0 && !z11) {
            c18064c.m96030p1(new ArrayList());
        } else {
            this.f62791h3.m96030p1(new C18062a().m96027b(z11, i11, c3051w0, c32546b, C31063m.a.f143210p));
        }
    }

    /* renamed from: wQ */
    private void m67085wQ() {
        this.f62734C3 = new C12036m(this.f72827B0);
    }

    /* renamed from: wR */
    private void m67086wR() {
        this.f62816u3.m14750U().m9219j(this, new InterfaceC1764d0() { // from class: j70.c1
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedImageViewer.this.m66989TQ((C19964c) obj);
            }
        });
    }

    /* renamed from: xP */
    private void m67087xP(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("EXTRA_BOL_UPDATE_STATUS_FINISHED", false)) {
            m66959KP();
        }
    }

    /* renamed from: xQ */
    private void m67088xQ(Bundle bundle) {
        String str;
        if (bundle == null) {
            return;
        }
        try {
            this.f62809r2 = bundle.getBoolean("hideImageFunction", false);
            this.f62684l1 = new ArrayList();
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            if (bundle.containsKey("defaultAvatar")) {
                str = bundle.getString("defaultAvatar");
            } else {
                str = "";
            }
            itemAlbumMobile.f42548C = str;
            itemAlbumMobile.f42607x = str;
            itemAlbumMobile.f42575Z = true;
            this.f62684l1.add(itemAlbumMobile);
            mo66708c6(this.f62684l1);
            m66969NP(str, itemAlbumMobile, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xR */
    private void m67089xR() {
        m67080uR();
        m67086wR();
    }

    /* renamed from: yP */
    private void m67090yP() {
        ActionDataImageViewer actionDataImageViewer = this.f62749K2;
        if (actionDataImageViewer != null && actionDataImageViewer.f45947r == 3 && actionDataImageViewer.f45945p && this.f62685m1 != 0) {
            this.f62751L2 = true;
            m67103ES();
        }
    }

    /* renamed from: yQ */
    private void m67091yQ(Bundle bundle) {
        String str;
        if (bundle == null) {
            return;
        }
        try {
            Iterator it = this.f62684l1.iterator();
            while (it.hasNext()) {
                ((ItemAlbumMobile) it.next()).f42593q = this.f62793j2;
            }
            this.f62811s2 = true;
            this.f62809r2 = true;
            String str2 = "";
            if (!bundle.containsKey("EXTRA_COMMENT_ITEM")) {
                str = "";
            } else {
                str = bundle.getString("EXTRA_COMMENT_ITEM");
            }
            if (!TextUtils.isEmpty(str)) {
                this.f62759P2 = AbstractC20789d.m108477k(new JSONObject(str));
            }
            if (bundle.containsKey("EXTRA_COMMENT_FEED_OWNER_ID")) {
                str2 = bundle.getString("EXTRA_COMMENT_FEED_OWNER_ID");
            }
            this.f62761Q2 = str2;
            mo66708c6(this.f62684l1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yR */
    private void m67092yR(ItemAlbumMobile itemAlbumMobile) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null && C26361j.f125215a.m135701g(c3020p0) && C20791e.f102159a.m108488d()) {
            C27353a c27353a = this.f62814t3;
            if (c27353a != null) {
                String str = itemAlbumMobile.f42599t;
                C3020p0 c3020p02 = itemAlbumMobile.f42594q0;
                c27353a.m139997p0(str, c3020p02.f12023C.f12108Q, c3020p02.f12027G);
            }
            if (this.f62630B1 == 0) {
                m67078uP(itemAlbumMobile.f42599t);
                return;
            }
            return;
        }
        m67032dS();
    }

    /* renamed from: yS */
    private void m67093yS(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        C8848a.b.a aVar;
        if (m66948GQ()) {
            aVar = C8848a.b.a.f47280q;
        } else {
            aVar = C8848a.b.a.f47279p;
        }
        m92639EK(4, new C8848a.a(new C8848a.b(i11, i12, i13, aVar), new C8848a.c(list, AbstractC23136l9.m118663M(AbstractC16803z.feed_reaction_bar_background_on_color)), interfaceC2333h));
    }

    /* renamed from: zP */
    private void m67094zP(final String str) {
        if (m67011ZP(str) != null) {
            m66964LQ(str);
        } else {
            AbstractC21935u.m114537d(str, new InterfaceC23448a() { // from class: j70.x1
                @Override // mv.InterfaceC23448a
                /* renamed from: a */
                public final void mo87300a(boolean z11) {
                    FeedImageViewer.this.m66960KQ(str, z11);
                }
            });
        }
    }

    /* renamed from: zQ */
    private void m67095zQ(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            Iterator it = this.f62684l1.iterator();
            while (it.hasNext()) {
                ((ItemAlbumMobile) it.next()).f42593q = this.f62793j2;
            }
            if (bundle.containsKey("hasGridPhoto")) {
                this.f62685m1 = bundle.getInt("currentIndex", 0);
            }
            if (this.f62697y1) {
                this.f62811s2 = true;
                this.f62809r2 = true;
            }
            mo66708c6(this.f62684l1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zR */
    public void m67096zR(final String str, final int i11) {
        m67003XR(str);
        this.f72421L0.mo70710wy(new Runnable() { // from class: j70.l1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.this.m66996VQ(str, i11);
            }
        });
    }

    /* renamed from: zS */
    private void m67097zS() {
        try {
            if (m92662fJ() != null && !m92662fJ().m93026P(this) && (C32065p8.m154684c().m154692g() || C32065p8.m154684c().m154691f())) {
                return;
            }
            if (!C25451c.f121865a.m131820h().get()) {
                C32065p8.m154684c().m154701r(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            C32065p8.m154684c().m154701r(false);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: AO */
    public void mo66694AO() {
        super.mo66694AO();
    }

    /* renamed from: AS */
    void m67098AS() {
        try {
            this.f62762Q3 = false;
            this.f62738E3.removeMessages(2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: BO */
    public void mo66695BO() {
        super.mo66695BO();
        m67159oR();
        m67090yP();
    }

    /* renamed from: BR */
    public void m67099BR() {
        ItemAlbumMobile itemAlbumMobile;
        int[] iArr = new int[2];
        this.f62773W2.getLocationOnScreen(iArr);
        List list = this.f62684l1;
        if (list != null && (itemAlbumMobile = (ItemAlbumMobile) list.get(this.f62685m1)) != null) {
            this.f62816u3.m14752Z(itemAlbumMobile, iArr[0], iArr[1], this.f62773W2.getHeight());
        }
    }

    /* renamed from: BS */
    void m67100BS(ItemAlbumMobile itemAlbumMobile) {
        try {
            List list = this.f62684l1;
            if (list != null) {
                if (list.size() > 1) {
                    this.f62684l1.add(0, itemAlbumMobile);
                } else {
                    this.f62684l1.clear();
                    this.f62684l1.add(itemAlbumMobile);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                this.f62684l1 = arrayList;
                arrayList.add(itemAlbumMobile);
            }
            this.f62685m1 = 0;
            mo66708c6(this.f62684l1);
            String str = "";
            if (this.f62813t2 && !this.f62744H3) {
                if (itemAlbumMobile != null) {
                    str = itemAlbumMobile.f42607x;
                }
                m66969NP(str, itemAlbumMobile, true);
            } else {
                if (this.f62733C2 && !this.f62752L3) {
                    if (itemAlbumMobile != null) {
                        str = itemAlbumMobile.f42607x;
                    }
                    m66973OP(str, true);
                    return;
                }
                m66874nO(this.f62685m1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f62820w3 = Collections.synchronizedMap(new C12035l());
        this.f62822x3 = Collections.synchronizedMap(new HashMap());
        this.f62824y3 = Collections.synchronizedMap(new HashMap());
        this.f62826z3 = Collections.synchronizedMap(new HashMap());
        m67008YR();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: CM */
    public void mo66812CM() {
        try {
            if (this.f62697y1) {
                return;
            }
            ActionBarMenuItem m66891yM = m66891yM(AbstractC6918a0.menu_msg_feed, AbstractC16803z.ic_head_chat);
            this.f62802n3 = m66891yM;
            m66891yM.setVisibility(8);
            this.f62643N0 = this.f88763d0.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            this.f62798l3 = true;
            m67138WS();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CS */
    public void m67101CS(int i11) {
        try {
            this.f62782a4 = i11;
            String[] m118179t = AbstractC23034c6.m118179t();
            if (AbstractC23034c6.m118167n(m92686rK(), m118179t) != 0) {
                AbstractC23034c6.m118184v0(this, m118179t, 111);
            } else {
                m67161pS();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.img_popup_cover);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    try {
                        C8009j.a aVar = new C8009j.a(m92648SI());
                        aVar.m43159h(4);
                        aVar.m43161j(AbstractC8020f0.str_choose_existed_photo_for_avatar_confirm_desc);
                        aVar.m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.b());
                        aVar.m43169r(AbstractC8020f0.str_update, new InterfaceC17463d.d() { // from class: j70.g1
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                FeedImageViewer.this.m66991UQ(interfaceC17463d, i12);
                            }
                        });
                        return aVar.m43152a();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
            return new C2874g1.a(this.f72421L0.m92676n2()).m13812j(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changecover_dialog_title)).m13813k(AbstractC23136l9.m118742r(5.0f)).m13810h(m118665N).m13814l(m118665N.getIntrinsicWidth()).m13811i(C2880i1.m13836d(m92689tK())).m13809g(this.f62784b4).m13806c();
        }
        return new C2874g1.a(this.f72421L0.m92676n2()).m13812j(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changeavt_dialog_title)).m13811i(C2880i1.m13834b(m92689tK(), true)).m13809g(this.f62784b4).m13806c();
    }

    /* renamed from: DS */
    void m67102DS() {
        try {
            mo66890xO();
            m66863gO(0L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 4 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    /* renamed from: ES */
    void m67103ES() {
        boolean z11;
        if (this.f62751L2 && (!this.f62729A2 || m66957JQ())) {
            z11 = true;
        } else {
            z11 = false;
        }
        m67164sS(z11);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Ee */
    public void mo66697Ee(C12063c.c cVar, int i11) {
        ItemAlbumMobile itemAlbumMobile;
        super.mo66697Ee(cVar, i11);
        if (cVar != null && i11 == this.f62685m1) {
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                itemAlbumMobile = c12063c.m67290x(i11);
            } else {
                itemAlbumMobile = null;
            }
            if (itemAlbumMobile != null) {
                m66982QR(itemAlbumMobile);
            }
        }
        m67133TR(cVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: FR */
    public void m67104FR(int i11) {
        ItemAlbumMobile itemAlbumMobile;
        List list = this.f62684l1;
        if (list != null && (itemAlbumMobile = (ItemAlbumMobile) list.get(this.f62685m1)) != null) {
            this.f62816u3.m14753a0(itemAlbumMobile, i11, this.f62816u3.m14749T(itemAlbumMobile, this.f62648P1, this.f62821x2, this.f62823y2));
        }
    }

    /* renamed from: FS */
    void m67105FS(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        if (itemAlbumMobile != null && z11) {
            try {
                if (!m66882sN()) {
                    CharSequence m40500I = itemAlbumMobile.m40500I(this.f72421L0.m92676n2());
                    if (m40500I.length() > 0) {
                        Iterator it = itemAlbumMobile.m40530q().iterator();
                        while (it.hasNext()) {
                            C10866e c10866e = (C10866e) it.next();
                            c10866e.m56377U(this.f72421L0.m92651WI().getColor(AbstractC16801x.cTime1));
                            c10866e.m56365I(this.f72421L0.m92676n2());
                        }
                        if (itemAlbumMobile.m40506Q() && itemAlbumMobile.m40533u() != null) {
                            Iterator it2 = itemAlbumMobile.m40533u().iterator();
                            while (it2.hasNext()) {
                                C10866e c10866e2 = (C10866e) it2.next();
                                c10866e2.m56377U(this.f72421L0.m92651WI().getColor(AbstractC16801x.cTime1));
                                C10866e.m56358d(c10866e2, this.f72421L0.m92676n2(), itemAlbumMobile.f42595r, itemAlbumMobile.f42593q, itemAlbumMobile.f42599t, itemAlbumMobile.m40501J());
                            }
                        }
                        this.f62769U2.setVisibility(0);
                        this.f62769U2.setText(m40500I);
                        this.f62769U2.scrollTo(0, 0);
                        this.f62769U2.setMovementMethod(CustomMovementMethod.m56305e());
                        if (AbstractC26683d.f126393l) {
                            AbstractC28245z3.m142219b(m40500I, this.f62769U2);
                        }
                    } else {
                        this.f62769U2.setVisibility(8);
                    }
                    m67027cS();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42556G)) {
                    CharSequence m143350A = C28652r.m143349v().m143350A(AbstractC23047d8.m118261m(itemAlbumMobile.f42556G));
                    TextView textView = this.f62769U2;
                    if (textView != null) {
                        textView.setText(m143350A);
                        if (AbstractC26683d.f126393l) {
                            AbstractC28245z3.m142219b(m143350A, this.f62769U2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.f62769U2.setVisibility(8);
        m67027cS();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.mo37483GJ(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: GP */
    void m67106GP() {
        try {
            TextView textView = this.f62769U2;
            if (textView != null) {
                if (AbstractC26683d.f126393l) {
                    AbstractC28245z3.m142218a(textView.getText(), this.f62769U2);
                }
                this.f62769U2.setMovementMethod(null);
                this.f62769U2 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: GR, reason: merged with bridge method [inline-methods] */
    public void m66974OQ(String str, String str2) {
        try {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            contactProfile.f42324B = str;
            AbstractC23309i.m121068Iz(contactProfile.m40373K());
            if (m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateCoverSuccess));
            }
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.f42593q = this.f62793j2;
            itemAlbumMobile.f42607x = str;
            itemAlbumMobile.f42595r = str2;
            m67100BS(itemAlbumMobile);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: HM */
    void mo66821HM() {
        this.f62691s1 = true;
        Handler handler = this.f62656T1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m67146gS();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f62767T2.removeOnLayoutChangeListener(this.f62754M3);
        this.f62738E3.removeMessages(2);
        this.f62738E3.removeMessages(1);
        m67106GP();
    }

    /* renamed from: IP */
    void m67108IP(ItemAlbumMobile itemAlbumMobile) {
        try {
            String str = itemAlbumMobile.f42595r;
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12025b(itemAlbumMobile));
            c0766k.mo1722qa(str, m67025cQ());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IQ */
    boolean m67109IQ(int i11) {
        List list = this.f62684l1;
        if (list != null && list.size() > 0 && i11 >= 0 && i11 < this.f62684l1.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: IR */
    void m67110IR(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    if (contactProfile.m40387S0() && !C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                        return;
                    }
                    Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: IS */
    void m67111IS(ItemAlbumMobile itemAlbumMobile) {
        try {
            String str = itemAlbumMobile.f42595r;
            String str2 = itemAlbumMobile.f42593q;
            final int m67136WP = m67136WP(str);
            if (m67136WP == -1) {
                return;
            }
            this.f62735D2 = true;
            int i11 = this.f62795k2;
            if (i11 > 0) {
                this.f62795k2 = i11 - 1;
            }
            Map map = AbstractC23304d.f113405l;
            if (map.get(str2) != null) {
                int m153682b = ((C31965ic) map.get(str2)).m153682b();
                if (m153682b > 0) {
                    m153682b--;
                }
                ((C31965ic) map.get(str2)).m153686f(m153682b);
                if (str2 != null && str2.equals(CoreUtility.f89233i)) {
                    AbstractC23309i.m121105Jz(m153682b);
                }
            }
            if (this.f72421L0.m92687sJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(C20815q.m108696j(itemAlbumMobile)));
            }
            this.f72421L0.mo70710wy(new Runnable() { // from class: j70.j1
                @Override // java.lang.Runnable
                public final void run() {
                    FeedImageViewer.this.m67051kR(m67136WP);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f72421L0.mo49315c4();
        super.mo37484JJ();
        m67022bS();
    }

    /* renamed from: JP */
    void m67112JP(C10873l c10873l) {
        if (c10873l == null) {
            return;
        }
        try {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12024a(c10873l));
            int i11 = this.f62757O2;
            if (i11 == 1) {
                c0766k.mo1500O6(c10873l.m56487r(), c10873l.m56493u());
            } else if (i11 == 2) {
                c0766k.mo1605b8(c10873l.m56491t(), c10873l.m56493u());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JR */
    void m67113JR() {
        String str = "";
        try {
            AbstractC23647d.m123907q("17400", "");
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                m92642L3.putString("picid", itemAlbumMobile.f42595r);
                m92642L3.putString("userId", itemAlbumMobile.f42593q);
                m92642L3.putBoolean("allowComment", this.f62807q2);
                m92642L3.putBoolean("extra_should_prevent_screenshot", this.f62737E2);
                if (this.f62807q2) {
                    m92642L3.putBoolean("extra_scroll_last_comment", true);
                    m92642L3.putBoolean("showKeyboard", false);
                }
                C32002l4 c32002l4 = this.f62648P1;
                if (c32002l4 != null) {
                    m92642L3.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                if (this.f62733C2) {
                    m92642L3.putBoolean("extra_view_cover", true);
                } else if (this.f62813t2) {
                    m92642L3.putBoolean("extra_view_avatar", true);
                } else {
                    if (!TextUtils.isEmpty(itemAlbumMobile.f42599t)) {
                        str = itemAlbumMobile.f42599t;
                    } else if (m92642L3.getBoolean("fromFeed", false) && m92642L3.containsKey("feedId")) {
                        str = m92642L3.getString("feedId");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (!C23055e5.m118272g(true) && !m66945FP(itemAlbumMobile.f42595r)) {
                            return;
                        } else {
                            m92642L3.putString("extra_feed_id", str);
                        }
                    }
                }
            }
            m67018aS(this.f62686n1.f42595r);
            this.f72421L0.m92676n2().mo35579p().m93066i2(ImageCommentView.class, m92642L3, 11, 1, true);
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JS */
    void m67114JS(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            if (this.f62821x2) {
                AbstractC20805l.m108554l(this.f62730A3, itemAlbumMobile);
            }
            new C25424n0().m101508a(itemAlbumMobile);
            if (!itemAlbumMobile.m40506Q()) {
                this.f62766S3 = true;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: KM */
    public C12063c mo66822KM() {
        C12063c mo66822KM = super.mo66822KM();
        mo66822KM.f62933F = AbstractC23309i.m121604Xg();
        return mo66822KM;
    }

    /* renamed from: LP */
    void m67115LP() {
        try {
            if (this.f62770U3) {
                return;
            }
            this.f62770U3 = true;
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f62772V3.mo1704o8(new C12029f());
            this.f62772V3.mo1733s5(this.f62793j2, this.f62801n2, 48, this.f62797l2, this.f62799m2, "", C23250w4.m119786E(), C32017m4.m154326S().m154371q(this.f62648P1));
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f62770U3 = false;
        }
    }

    /* renamed from: LS */
    void m67116LS(String str) {
        ItemAlbumMobile itemAlbumMobile;
        try {
            if (!this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ() && (itemAlbumMobile = this.f62686n1) != null && itemAlbumMobile.f42595r.equals(str)) {
                m67102DS();
                m67138WS();
                m67105FS(this.f62686n1, true);
                m67019aT(this.f62686n1, true);
                m67120MS(this.f62686n1, true);
                m67103ES();
                m67166uS(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: MJ */
    public void mo67117MJ(boolean z11) {
        super.mo67117MJ(z11);
        try {
            if (z11) {
                this.f72421L0.m92676n2().setRequestedOrientation(1);
            } else {
                this.f72421L0.m92676n2().setRequestedOrientation(2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MP */
    void m67118MP(String str, int i11) {
        int i12;
        try {
            if (C23055e5.m118272g(true)) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                if (m141809c != null) {
                    i12 = m141809c.f42385V0;
                } else {
                    i12 = 0;
                }
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C12026c(i11));
                c0766k.mo1514Q4(str, i12, new TrackingSource((short) 1030));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MR */
    void m67119MR() {
        int i11;
        try {
            this.f62743H2 = true;
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            Bundle m92642L3 = m92642L3();
            String str = "";
            if (!TextUtils.isEmpty(itemAlbumMobile.f42599t)) {
                str = itemAlbumMobile.f42599t;
            } else if (m92642L3.getBoolean("fromFeed", false) && m92642L3.containsKey("feedId")) {
                str = m92642L3.getString("feedId");
            }
            if (this.f72421L0.m92676n2() != null) {
                C3000l0 mo127471c = C24371m0.m127468p().mo127471c(str);
                if (mo127471c != null) {
                    C26878b.m138449b().m138453e(mo127471c, mo127471c.m14322a0());
                    i11 = mo127471c.f11896q0;
                } else {
                    i11 = -1;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    if (!C23055e5.m118272g(true) && !m66945FP(itemAlbumMobile.f42595r)) {
                        return;
                    } else {
                        bundle.putString("EXTRA_FEED_ID", str);
                    }
                }
                bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 2);
                bundle.putString("EXTRA_PHOTO_ID", itemAlbumMobile.f42595r);
                bundle.putString("EXTRA_OWNER_ID", itemAlbumMobile.f42593q);
                bundle.putParcelable("EXTRA_PHOTO_ITEM", new ItemAlbumMobile(itemAlbumMobile));
                bundle.putBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", this.f62741G2);
                bundle.putInt("extra_action_request", 24);
                bundle.putInt("fromTimelineTab", i11);
                bundle.putBoolean("EXTRA_IS_FROM_VIEW_FULL", true);
                C32002l4 c32002l4 = this.f62648P1;
                if (c32002l4 != null) {
                    bundle.putString("EXTRA_ENTRY_POINT_FLOW", c32002l4.m154277l());
                }
                bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
                this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 20, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MS */
    void m67120MS(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        int i11;
        if (itemAlbumMobile != null) {
            try {
                if (itemAlbumMobile.f42552E.equals("1")) {
                    C32546b c32546b = itemAlbumMobile.f42563N;
                    if (c32546b != null) {
                        i11 = c32546b.m157605a();
                    } else {
                        i11 = 1;
                    }
                    this.f62775X2.m47308X(true, i11);
                    FeedLikeButtonModulesView feedLikeButtonModulesView = this.f62775X2;
                    int i12 = AbstractC23222t7.f112594x;
                    feedLikeButtonModulesView.m47307W(i12, i12);
                    this.f62773W2.setPadding(AbstractC23222t7.f112576o, AbstractC23222t7.f112558f, AbstractC23222t7.f112576o, AbstractC23222t7.f112558f);
                    RelativeLayout relativeLayout = this.f62773W2;
                    C31060j c31060j = C31060j.f143193a;
                    Context m92689tK = m92689tK();
                    C31063m.a aVar = C31063m.a.f143210p;
                    relativeLayout.setBackground(c31060j.m150941g(i11, m92689tK, aVar));
                    this.f62777Y2.setTextColor(c31060j.m150933J(i11, m92689tK(), aVar));
                    this.f62777Y2.setText(c31060j.m150931H(i11, m92689tK()));
                } else {
                    this.f62775X2.m47308X(false, 0);
                    FeedLikeButtonModulesView feedLikeButtonModulesView2 = this.f62775X2;
                    int i13 = AbstractC23222t7.f112514B;
                    feedLikeButtonModulesView2.m47307W(i13, i13);
                    this.f62773W2.setPadding(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
                    RelativeLayout relativeLayout2 = this.f62773W2;
                    C31060j c31060j2 = C31060j.f143193a;
                    Context m92689tK2 = m92689tK();
                    C31063m.a aVar2 = C31063m.a.f143210p;
                    relativeLayout2.setBackground(c31060j2.m150941g(0, m92689tK2, aVar2));
                    this.f62777Y2.setTextColor(c31060j2.m150933J(0, m92689tK(), aVar2));
                    this.f62777Y2.setText(c31060j2.m150931H(0, m92689tK()));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        m67165tS(z11);
    }

    @Override // ao.InterfaceC2263e
    /* renamed from: N4 */
    public void mo11979N4(String str) {
        C27353a c27353a = this.f62814t3;
        if (c27353a != null) {
            c27353a.m140000s0(str, C32002l4.m154264g(4));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        C27353a c27353a;
        if (i11 == 24 && this.f62763R2 != null && (c27353a = this.f62814t3) != null) {
            c27353a.m139993i0(C32002l4.m154264g(4));
        }
        return super.mo39030NJ(i11, keyEvent);
    }

    /* renamed from: NR */
    void m67121NR(Object obj) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (obj != null) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                this.f62797l2 = AbstractC18069a.m96087f(jSONObject, "lastPhotoId");
                this.f62799m2 = AbstractC18069a.m96087f(jSONObject, "lastAlbumId");
                if (AbstractC18069a.m96087f(jSONObject, "hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f62805p2 = z11;
                if (jSONObject.has("page")) {
                    this.f62801n2 = AbstractC18069a.m96085d(jSONObject, "page");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("content");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            arrayList.add(new C12030g(optJSONObject));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            AbstractC32173x4 abstractC32173x4 = (AbstractC32173x4) arrayList.get(i12);
            if (abstractC32173x4.m155151j() != null) {
                for (int i13 = 0; i13 < abstractC32173x4.m155151j().size(); i13++) {
                    C32187y4 c32187y4 = (C32187y4) abstractC32173x4.m155151j().get(i13);
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.f42607x = c32187y4.m155185m();
                    itemAlbumMobile.f42548C = c32187y4.m155187o();
                    itemAlbumMobile.f42593q = c32187y4.m155182j();
                    itemAlbumMobile.f42591p = c32187y4.m155188p();
                    itemAlbumMobile.f42594q0 = new C3020p0();
                    itemAlbumMobile.f42595r = c32187y4.m155183k() + "";
                    arrayList2.add(itemAlbumMobile);
                }
            }
        }
        this.f72421L0.mo70710wy(new Runnable() { // from class: j70.o1
            @Override // java.lang.Runnable
            public final void run() {
                FeedImageViewer.this.m67007YQ(arrayList2);
            }
        });
    }

    /* renamed from: OR */
    List m67122OR(Object obj, String str, ItemAlbumMobile itemAlbumMobile) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.isNull("data")) {
                jSONObject = null;
            } else {
                jSONObject = jSONObject2.getJSONObject("data");
            }
            if (jSONObject == null) {
                optJSONArray = null;
            } else {
                optJSONArray = jSONObject.optJSONArray("list");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile(optJSONArray.optJSONObject(i11));
                itemAlbumMobile2.f42576a0 = true;
                itemAlbumMobile2.f42575Z = false;
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f62793j2);
                if (m141809c != null && !m141809c.f42446v.equals(itemAlbumMobile2.f42548C)) {
                    m141809c.f42446v = itemAlbumMobile2.f42548C;
                    C7960e.m41971c6().m42221O7(m141809c, AbstractC21935u.m114558y(m141809c.f42434r));
                }
                itemAlbumMobile2.f42548C = str;
                arrayList.add(itemAlbumMobile2);
            }
            return arrayList;
        }
        itemAlbumMobile.f42575Z = false;
        return null;
    }

    /* renamed from: OS */
    void m67123OS(int i11, C32547c c32547c) {
        try {
            for (ItemAlbumMobile itemAlbumMobile : m66995VP(i11)) {
                m66971NS(itemAlbumMobile, c32547c);
                m66978PS(itemAlbumMobile.f42595r, c32547c);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: PR */
    List m67124PR(Object obj) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.isNull("data")) {
                jSONObject = null;
            } else {
                jSONObject = jSONObject2.getJSONObject("data");
            }
            if (jSONObject != null && jSONObject.has("enable_like_comment")) {
                boolean z11 = true;
                if (jSONObject.optInt("enable_like_comment") != 1) {
                    z11 = false;
                }
                this.f62753M2 = z11;
            }
            if (jSONObject == null) {
                optJSONArray = null;
            } else {
                optJSONArray = jSONObject.optJSONArray("list");
            }
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile(optJSONArray.optJSONObject(i11));
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f62793j2);
                    if (m141809c != null && !m141809c.f42324B.equals(itemAlbumMobile.f42607x)) {
                        m141809c.f42324B = itemAlbumMobile.f42607x;
                        C7960e.m41971c6().m42221O7(m141809c, AbstractC21935u.m114558y(m141809c.f42434r));
                    }
                    arrayList.add(itemAlbumMobile);
                }
                return arrayList;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.menu_msg_feed) {
                m67142eS();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_forward) {
                super.m66885tO(12);
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_post_feed) {
                m67160oS();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_download) {
                AbstractC23647d.m123907q("17120", "");
                m67130SP();
                AbstractC23647d.m123893c();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_photo_delete) {
                m67162qS();
                return true;
            }
            if (i11 == AbstractC6918a0.menu_reuse_avatar) {
                this.f62755N2 = i11;
                showDialog(3);
                return true;
            }
            if (i11 == AbstractC6918a0.action_bar_menu_more) {
                m66932BP();
                return true;
            }
            return super.mo37491QJ(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: QS */
    void m67125QS() {
        try {
            C22013a0.m114928g();
            this.f62793j2.equals(CoreUtility.f89233i);
            C10873l c10873l = this.f62759P2;
            int i11 = 0;
            if (c10873l == null || !TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
            }
            TextUtils.equals(this.f62761Q2, CoreUtility.f89233i);
            this.f62643N0.setEnabled(true);
            ActionBarMenuItem actionBarMenuItem = this.f62643N0;
            if (!this.f62800m3) {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Qo */
    public C12063c.f mo66829Qo(C12063c.g gVar, ItemAlbumMobile itemAlbumMobile) {
        if (!TextUtils.isEmpty(itemAlbumMobile.f42548C)) {
            return AbstractC32146v5.m155118a(itemAlbumMobile.f42548C, 0);
        }
        if (!TextUtils.isEmpty(gVar.m67344s())) {
            return AbstractC32146v5.m155118a(gVar.m67344s(), 1);
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (this.f62734C3 != null) {
            m78956lL().getContentResolver().unregisterContentObserver(this.f62734C3);
        }
    }

    /* renamed from: RP */
    void m67126RP(String str) {
        try {
            if (!this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ() && !TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
                this.f72421L0.m92676n2().setRequestedOrientation(1);
                AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 12, 0, CameraInputParams.m39206p(str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RR */
    void m67127RR() {
        try {
            if (this.f62686n1 == null) {
                return;
            }
            C12063c.f m66845YM = m66845YM();
            if (m66845YM == null) {
                m66762EN(1);
                return;
            }
            File mo66832Rd = mo66832Rd(m66845YM.f62951b, m66845YM.f62952c);
            if (mo66832Rd != null && mo66832Rd.exists() && mo66832Rd.length() > 0) {
                m67126RP(mo66832Rd.getPath());
            } else {
                m66830RM(m66845YM, false, true, new C12040q());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RS */
    void m67128RS() {
        int i11;
        try {
            C22013a0.m114928g();
            this.f62643N0.setEnabled(true);
            ActionBarMenuItem actionBarMenuItem = this.f62643N0;
            if (this.f62800m3) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S6 */
    public void m67129S6(String str, int i11, C32002l4 c32002l4) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", str);
                bundle.putInt("extra_album_type", i11);
                bundle.putBoolean("extra_is_mode_pick_avatar", false);
                bundle.putBoolean("extra_bol_only_show_grid_photo", true);
                if (c32002l4 != null) {
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                m92662fJ.m93066i2(ProfileAlbumDetailView.class, bundle, 0, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", this.f62737E2);
        bundle.putBoolean("BOL_EXTRA_PUSH_FEED_AVATAR", this.f62808q3);
        bundle.putBoolean("BOL_EXTRA_PUSH_FEED_COVER", this.f62810r3);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: SM */
    public void mo66833SM() {
        Handler handler = this.f62656T1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m67146gS();
    }

    /* renamed from: SP */
    void m67130SP() {
        if (this.f62758O3) {
            return;
        }
        try {
            if (this.f62686n1 == null) {
                return;
            }
            m67098AS();
            if (m66882sN()) {
                m67135UP(this.f62686n1);
            } else {
                m67132TP(this.f62686n1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m66762EN(-1);
        }
    }

    /* renamed from: SS */
    void m67131SS() {
        boolean z11;
        boolean z12;
        int i11;
        ActionBarMenuItem actionBarMenuItem;
        try {
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile == null) {
                return;
            }
            C3020p0 c3020p0 = itemAlbumMobile.f42594q0;
            int i12 = 0;
            if (c3020p0 != null && AbstractC20826v0.m108828p0(c3020p0.f12058q, c3020p0.m14518m0()) && !CoreUtility.f89233i.equals(itemAlbumMobile.f42594q0.m14465A())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((this.f62821x2 || this.f62825z2 || this.f62813t2 || this.f62733C2) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f62643N0.setEnabled(true);
            ActionBarMenuItem actionBarMenuItem2 = this.f62643N0;
            if (this.f62800m3) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem2.setVisibility(i11);
            ActionBarMenuItem actionBarMenuItem3 = this.f62802n3;
            if (!z12) {
                i12 = 8;
            }
            actionBarMenuItem3.setVisibility(i12);
            if (this.f62738E3 != null && (actionBarMenuItem = this.f62802n3) != null && actionBarMenuItem.getVisibility() == 0) {
                this.f62738E3.removeMessages(3);
                this.f62738E3.sendEmptyMessageDelayed(3, 1000L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        try {
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92674mJ()) {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    actionBar.getSubtitleTextView().setTextColor(this.f72421L0.m92651WI().getColor(AbstractC16801x.white_70));
                }
                mo66890xO();
                super.mo37493TJ();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TP */
    void m67132TP(ItemAlbumMobile itemAlbumMobile) {
        try {
            if (!AbstractC23034c6.m118118E() && m92676n2() != null) {
                AbstractC23034c6.m118186w0(m92676n2(), AbstractC23034c6.f112029f, 109);
                return;
            }
            C12063c.f m66845YM = m66845YM();
            if (m66845YM == null) {
                m66762EN(1);
                return;
            }
            File mo66832Rd = mo66832Rd(m66845YM.f62951b, m66845YM.f62952c);
            if (mo66832Rd != null && mo66832Rd.exists() && mo66832Rd.length() > 0 && mo66884tN(m66845YM.f62951b, m66845YM.f62952c)) {
                m66873mO(mo66832Rd.getAbsolutePath());
            } else {
                m66830RM(m66845YM, false, true, new C12042s());
            }
            m67068qR(itemAlbumMobile);
        } catch (Exception e11) {
            e11.printStackTrace();
            m66762EN(-1);
        }
    }

    /* renamed from: TR */
    public void m67133TR(C12063c.c cVar, int i11) {
        final C12063c.g gVar;
        C12063c.f fVar;
        if (cVar != null && (cVar instanceof C12063c.g) && (fVar = (gVar = (C12063c.g) cVar).f62966l) != null) {
            mo66826Ot(gVar.f62960f, fVar, i11, new C12063c.d.a() { // from class: j70.k1
                @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                /* renamed from: a */
                public final void mo67298a(C12063c.f fVar2, int i12, C3979l c3979l, int i13) {
                    FeedImageViewer.this.m67017aR(gVar, fVar2, i12, c3979l, i13);
                }
            });
        }
    }

    /* renamed from: TS */
    void m67134TS() {
        int i11;
        try {
            this.f62643N0.setEnabled(true);
            ActionBarMenuItem actionBarMenuItem = this.f62643N0;
            if (this.f62800m3) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f62681i1;
        if (c13306b != null) {
            c13306b.m74697c(this.f62774W3);
        }
    }

    /* renamed from: UP */
    void m67135UP(ItemAlbumMobile itemAlbumMobile) {
        try {
            if (!AbstractC23034c6.m118118E() && m92676n2() != null) {
                AbstractC23034c6.m118186w0(m92676n2(), AbstractC23034c6.f112029f, 109);
                return;
            }
            C17391z m108789V = AbstractC20826v0.m108789V(itemAlbumMobile.f42594q0);
            if (m108789V != null) {
                this.f72421L0.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_loading), true);
                this.f62758O3 = true;
                AbstractC19037k.m100125k(AbstractC19037k.e.m100141d(m108789V, true, new C12041r()), m108789V.m92538c(), new SensitiveData("gallery_save_video_detail", "video_download"));
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.media_being_loaded_message));
        } catch (Exception unused) {
            m66762EN(-1);
            this.f62758O3 = false;
            this.f72421L0.mo49315c4();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f62804o3;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f62804o3.dismiss();
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f62806p3;
        if (keyEventCallbackC17462c2 != null && keyEventCallbackC17462c2.m92868m()) {
            this.f62806p3.dismiss();
        }
        C13306b c13306b = this.f62681i1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
        m67097zS();
        if (this.f62737E2 && !this.f62732B3) {
            this.f62732B3 = true;
            if (AbstractC23304d.f113455x1.decrementAndGet() == 0) {
                this.f72421L0.m92676n2().getWindow().clearFlags(8192);
            }
        }
    }

    /* renamed from: WP */
    int m67136WP(String str) {
        if (this.f62684l1 != null) {
            for (int i11 = 0; i11 < this.f62684l1.size(); i11++) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(i11);
                if (itemAlbumMobile != null && itemAlbumMobile.f42595r.equals(str)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* renamed from: WR */
    void m67137WR() {
        try {
            if (System.currentTimeMillis() - this.f62742G3 < 200) {
                this.f62738E3.postDelayed(new Runnable() { // from class: j70.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedImageViewer.this.m67021bR();
                    }
                }, 300L);
            } else {
                mo66708c6(this.f62684l1);
                m66874nO(this.f62685m1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WS */
    void m67138WS() {
        try {
            if (this.f62798l3 && !this.f62697y1) {
                if (this.f62737E2) {
                    m67134TS();
                } else if (this.f62817v2) {
                    m67128RS();
                } else if (this.f62757O2 != 0) {
                    m67125QS();
                } else {
                    if (!this.f62811s2 && m66946FQ(this.f62686n1)) {
                        m66937DP();
                    }
                    int i11 = 0;
                    this.f62643N0.setEnabled(false);
                    ActionBarMenuItem actionBarMenuItem = this.f62643N0;
                    if (!this.f62800m3) {
                        i11 = 8;
                    }
                    actionBarMenuItem.setVisibility(i11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XP */
    String m67139XP(Intent intent) {
        if (intent != null) {
            if (intent.hasExtra("extra_result_camera_log")) {
                this.f62776X3 = intent.getStringExtra("extra_result_camera_log");
            }
            if (intent.hasExtra("extra_result_output_path")) {
                return intent.getStringExtra("extra_result_output_path");
            }
            return "";
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: YN */
    public void mo66846YN() {
        C3020p0 c3020p0;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null && C26361j.f125215a.m135701g(c3020p0)) {
            m67078uP(this.f62686n1.f42599t);
        } else {
            m67032dS();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        m67085wQ();
        m67075tP();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: aO */
    public void mo66850aO(C12063c.f fVar, String str, boolean z11, int i11) {
        try {
            if (!this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ()) {
                File file = new File(str);
                if (file.exists() && file.length() > 0) {
                    String absolutePath = file.getAbsolutePath();
                    this.f72421L0.m92676n2().setRequestedOrientation(1);
                    Bundle bundle = new Bundle();
                    bundle.putString("imagePathUri", absolutePath);
                    bundle.putBoolean("bol_share_in_app", true);
                    bundle.putBoolean("bol_extra_photo_hd", z11);
                    bundle.putInt("extra_source_log", i11);
                    bundle.putString("extra_tracking_source_feed", m66867jN());
                    bundle.putBoolean("EXTRA_SHARE_TIMELINE_FORWARD_REQUEST_CODE", true);
                    this.f72421L0.m92676n2().mo35579p().m93066i2(ShareView.class, bundle, 18, 1, true);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bQ */
    String m67140bQ(Intent intent) {
        List m71440ZM;
        MediaItem mediaItem;
        if (intent != null && (m71440ZM = GalleryPickerView.m71440ZM(intent)) != null && m71440ZM.size() > 0 && (mediaItem = (MediaItem) m71440ZM.get(0)) != null) {
            this.f62776X3 = mediaItem.m41175w();
            if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                return mediaItem.m41113N();
            }
            return mediaItem.mo41081Q();
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: cN */
    protected String mo66854cN(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            return itemAlbumMobile.m40537z(this.f72421L0.m92648SI());
        }
        return "";
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        InterfaceC2946a1 interfaceC2946a1 = this.f62763R2;
        if (interfaceC2946a1 != null) {
            return interfaceC2946a1.mo13947I();
        }
        return C26361j.f125215a.m135697c(this.f72421L0);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.layout_image_viewer_feed;
    }

    /* renamed from: eQ */
    void m67141eQ(String str) {
        try {
            this.f72421L0.m92676n2().setRequestedOrientation(1);
            Bundle bundle = new Bundle();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            bundle.putStringArrayList("path", arrayList);
            bundle.putBoolean("fromShareVia", true);
            bundle.putString("extra_tracking_source", m66867jN());
            this.f72421L0.m92676n2().mo35579p().m93066i2(UpdateStatusView.class, bundle, 19, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eS */
    void m67142eS() {
        try {
            if (!this.f62811s2 && !this.f62635G1 && m66946FQ(this.f62686n1)) {
                String str = this.f62686n1.f42593q;
                if (str != null && AbstractC23304d.f113368c0 != null && !str.equals(CoreUtility.f89233i)) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m141809c != null) {
                        m67110IR(m141809c);
                    } else {
                        m67118MP(str, f62728d4);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eT */
    void m67143eT(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo46829Y();
            if (this.f62736D3 == null) {
                this.f62736D3 = AbstractC23306f.m120609P1();
            }
            this.f62736D3.m101508a(new C27357a.a(str, this.f62808q3, this.f62776X3, C32017m4.m154326S().m154339K(this.f62648P1), false));
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: el */
    public void mo66859el(C12063c.g gVar) {
        View view = gVar.f62961g;
        if (view != null) {
            view.setVisibility(8);
        }
        gVar.f62961g = null;
    }

    /* renamed from: fQ */
    void m67144fQ(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        if (intent != null) {
            try {
                if (!intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") || (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) == null || bottomSheetMenuResult.m45566b() == null || bottomSheetMenuResult.m45569e() != 6 || bottomSheetMenuResult.m45571g() == 0 || this.f62686n1 == null) {
                    return;
                }
                ItemAlbumMobile m67006YP = m67006YP();
                switch (bottomSheetMenuResult.m45571g()) {
                    case 22:
                        AbstractC23647d.m123907q("17140", "");
                        if (this.f62686n1 != null) {
                            m67163rS();
                        }
                        AbstractC23647d.m123893c();
                        return;
                    case 23:
                        AbstractC23647d.m123907q("17120", "");
                        m67130SP();
                        AbstractC23647d.m123893c();
                        return;
                    case 24:
                        super.m66885tO(12);
                        m67077tR(this.f62686n1);
                        C0708i c0708i = new C0708i();
                        if (m67006YP != null) {
                            c0708i.m1073d("date_time", m67006YP.f42564O);
                            c0708i.m1072c("privacy_setting", m67006YP.f42594q0.f12042V.f45973p);
                            c0708i.m1075f("likes", m67006YP.f42560K);
                            c0708i.m1075f("comments", m67006YP.f42561L);
                        }
                        c0708i.m1072c(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                        C0732w.Companion.m1189a().m1187q("post_timeline", "", c0708i, null);
                        return;
                    case 25:
                        C0708i c0708i2 = new C0708i();
                        if (m67006YP != null) {
                            c0708i2.m1073d("date_time", m67006YP.f42564O);
                            c0708i2.m1072c("privacy_setting", m67006YP.f42594q0.f12042V.f45973p);
                            c0708i2.m1075f("likes", m67006YP.f42560K);
                            c0708i2.m1075f("comments", m67006YP.f42561L);
                        }
                        c0708i2.m1072c(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
                        C0732w.Companion.m1189a().m1187q("post_timeline", "", c0708i2, null);
                        m67160oS();
                        return;
                    case 26:
                        m67127RR();
                        return;
                    case 27:
                        m67162qS();
                        return;
                    default:
                        return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: fT */
    void m67145fT(String str) {
        try {
            mo46829Y();
            this.f62778Y3 = C24226d.m126395Q(new Random().nextInt(Integer.MAX_VALUE), EnumC24229g.f116987u, str, 0L, false);
            C12032i c12032i = new C12032i(str);
            this.f62780Z3 = c12032i;
            this.f62778Y3.m126505h(c12032i);
            this.f62778Y3.m126524s0(this.f62810r3);
            this.f62778Y3.m126535z0(C32017m4.m154326S().m154340L(this.f62648P1));
            C24226d.m126402Z(this.f62778Y3);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: gS */
    public void m67146gS() {
        List list;
        try {
            if (this.f62735D2) {
                m67154kS();
            } else if (this.f62795k2 > 0 && (list = this.f62684l1) != null && list.size() > this.f62803o2) {
                m67152jS();
            } else if (this.f62821x2) {
                m67150iS();
            } else if (this.f62819w2) {
                m67155lS();
            } else if (this.f62757O2 != 0) {
                m67147hS();
            } else {
                mo66825N9(-1, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FeedImageViewer";
    }

    /* renamed from: hS */
    void m67147hS() {
        try {
            Intent intent = new Intent();
            ArrayList arrayList = this.f62760P3;
            if (arrayList != null && arrayList.size() > 0) {
                intent.putStringArrayListExtra("EXTRA_DELETED_COMMENTS", new ArrayList<>(this.f62760P3));
            }
            mo66825N9(-1, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // w20.InterfaceC28702e
    /* renamed from: iH */
    public boolean mo67148iH() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: iN */
    public int mo66865iN() {
        int i11 = this.f62795k2;
        if (i11 <= 0) {
            return super.mo66865iN();
        }
        return i11;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: iO */
    public String mo66866iO(ItemAlbumMobile itemAlbumMobile, int i11) {
        String mo66866iO = super.mo66866iO(itemAlbumMobile, i11);
        if (TextUtils.isEmpty(mo66866iO)) {
            return null;
        }
        return mo66866iO;
    }

    /* renamed from: iQ */
    void m67149iQ() {
        ItemAlbumMobile itemAlbumMobile;
        if (this.f62684l1 != null && m67109IQ(this.f62685m1) && (itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(this.f62685m1)) != null) {
            this.f62816u3.m14751Y(itemAlbumMobile, this.f62816u3.m14749T(itemAlbumMobile, this.f62648P1, this.f62821x2, this.f62823y2));
        }
    }

    /* renamed from: iS */
    void m67150iS() {
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            Intent intent = new Intent();
            String string = m92642L3.getString("feedId");
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra("feedId", string);
                if (this.f62766S3) {
                    intent.putExtra("extra_feed_empty_tag", true);
                }
                Set set = this.f62768T3;
                if (set != null && set.size() > 0) {
                    intent.putStringArrayListExtra("extra_deleted_tag_uids", new ArrayList<>(this.f62768T3));
                }
                if (this.f62743H2) {
                    intent.putExtra("EXTRA_SHOULD_REFRESH_TIMELINE", true);
                }
                FeedLikeStatus feedLikeStatus = (FeedLikeStatus) this.f62730A3.get(string);
                if (feedLikeStatus != null) {
                    intent.putExtra("extra_feed_like_status", feedLikeStatus);
                }
                mo66825N9(-1, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: jO */
    public void mo66868jO(Bundle bundle) {
        super.mo66868jO(bundle);
        if (bundle == null) {
            return;
        }
        try {
            ArrayList arrayList = this.f62687o1;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f62735D2 = true;
            }
            this.f62737E2 = bundle.getBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", this.f62737E2);
            this.f62808q3 = bundle.getBoolean("BOL_EXTRA_PUSH_FEED_AVATAR", this.f62808q3);
            this.f62810r3 = bundle.getBoolean("BOL_EXTRA_PUSH_FEED_COVER", this.f62810r3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jQ */
    void m67151jQ(C20096c c20096c) {
        try {
            if (c20096c.m104491c() != 1001 && c20096c.m104491c() == 500 && this.f72421L0.m92687sJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_deniedAvtgallery));
            }
            this.f62753M2 = false;
            m67166uS(false);
            ActionDataImageViewer actionDataImageViewer = this.f62749K2;
            if (actionDataImageViewer != null && actionDataImageViewer.f45945p) {
                this.f62751L2 = true;
                m67164sS(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jS */
    void m67152jS() {
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(this.f62793j2) && !this.f62793j2.equals(CoreUtility.f89233i)) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i11 = 0; i11 < this.f62684l1.size(); i11++) {
                    arrayList.add(new ItemAlbumMobile((ItemAlbumMobile) this.f62684l1.get(i11)));
                }
                intent.putExtras(m92642L3);
                intent.putParcelableArrayListExtra("medialist", arrayList);
                intent.putExtra("currentIndex", this.f62685m1);
                intent.putExtra("userId", this.f62793j2);
            } else {
                intent.putExtras(m92642L3);
            }
            mo66825N9(-1, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kQ */
    void m67153kQ() {
        try {
            if (this.f62762Q3) {
                if (this.f62685m1 == this.f62677e1.mo35335g() - 1) {
                    this.f62762Q3 = false;
                } else {
                    int i11 = this.f62685m1 + 1;
                    this.f62685m1 = i11;
                    m66874nO(i11);
                }
            }
            Message message = new Message();
            message.what = 2;
            this.f62738E3.sendMessageDelayed(message, 3000L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kS */
    void m67154kS() {
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            Intent intent = new Intent();
            intent.putExtras(m92642L3);
            intent.putExtra("totalPhoto", this.f62795k2);
            if (this.f62821x2) {
                String string = m92642L3.getString("feedId");
                if (!TextUtils.isEmpty(string)) {
                    intent.putExtra("feedId", string);
                    if (this.f62766S3) {
                        intent.putExtra("extra_feed_empty_tag", true);
                    }
                    Set set = this.f62768T3;
                    if (set != null && set.size() > 0) {
                        intent.putStringArrayListExtra("extra_deleted_tag_uids", new ArrayList<>(this.f62768T3));
                    }
                }
            }
            ArrayList arrayList = this.f62687o1;
            if (arrayList != null && arrayList.size() > 0) {
                intent.putStringArrayListExtra("deletedPhoto", this.f62687o1);
            }
            mo66825N9(-1, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2263e
    /* renamed from: kb */
    public void mo11980kb(String str, String str2) {
        C27353a c27353a = this.f62814t3;
        if (c27353a != null) {
            c27353a.m140001t0(str, str2);
        }
    }

    /* renamed from: lS */
    void m67155lS() {
        try {
            Intent intent = new Intent();
            if (this.f62743H2) {
                intent.putExtra("EXTRA_SHOULD_REFRESH_TIMELINE", true);
            }
            if (this.f62686n1 != null) {
                intent.putExtra("EXTRA_RESULT_ITEM_ALBUM_MOBILE", new ItemAlbumMobile(this.f62686n1));
            }
            mo66825N9(-1, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mR */
    void m67156mR(String str) {
        try {
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.f42548C = str;
            itemAlbumMobile.f42607x = str;
            itemAlbumMobile.f42593q = this.f62793j2;
            this.f62684l1.clear();
            this.f62684l1.add(itemAlbumMobile);
            mo66708c6(this.f62684l1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mw */
    public void m67157mw(String str, String str2) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UID", str);
        bundle.putString("EXTRA_OPTION_VARIANT", str2);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileAvatarBottomSheet.class, bundle, 1300, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        String str;
        int i11;
        int i12;
        long j11;
        boolean z11;
        boolean z12;
        int i13;
        super.mo66727nN(bundle);
        if (bundle != null) {
            if (!bundle.containsKey("userId")) {
                str = "";
            } else {
                str = bundle.getString("userId");
            }
            this.f62793j2 = str;
            if (bundle.containsKey("totalPhoto")) {
                i11 = bundle.getInt("totalPhoto");
            } else {
                i11 = 0;
            }
            this.f62795k2 = i11;
            if (bundle.containsKey("EXTRA_INT_PAGE_PHOTO")) {
                i12 = bundle.getInt("EXTRA_INT_PAGE_PHOTO");
            } else {
                i12 = 0;
            }
            this.f62801n2 = i12;
            long j12 = 0;
            if (bundle.containsKey("EXTRA_LONG_LAST_PHOTO")) {
                j11 = bundle.getLong("EXTRA_LONG_LAST_PHOTO");
            } else {
                j11 = 0;
            }
            this.f62797l2 = j11;
            if (bundle.containsKey("EXTRA_LONG_LAST_ALBUM")) {
                j12 = bundle.getLong("EXTRA_LONG_LAST_ALBUM");
            }
            this.f62799m2 = j12;
            if (bundle.containsKey("EXTRA_BOL_LOADMORE_PHOTO") && bundle.getBoolean("EXTRA_BOL_LOADMORE_PHOTO")) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f62805p2 = z11;
            this.f62757O2 = bundle.getInt("BOL_EXTRA_FROM_COMMENT_PHOTO", 0);
            this.f62749K2 = (ActionDataImageViewer) bundle.getParcelable("extra_action_data");
            this.f62815u2 = bundle.containsKey("hasGridPhoto");
            this.f62817v2 = bundle.getBoolean("showLimitMenu", false);
            this.f62819w2 = bundle.getBoolean("BOL_FROM_IMAGE_COMMENT", false);
            this.f62825z2 = bundle.getBoolean("fromAlbum", false);
            this.f62729A2 = bundle.getBoolean("fromAlbumAvatar", false);
            this.f62731B2 = bundle.getBoolean("fromAlbumCover", false);
            this.f62733C2 = bundle.getBoolean("fromProfileCover", false);
            this.f62745I2 = bundle.getBoolean("EXTRA_BOL_IS_PICK_AVATAR", false);
            boolean z13 = !TextUtils.isEmpty(this.f62793j2);
            this.f62821x2 = bundle.getBoolean("fromFeed");
            this.f62823y2 = bundle.getInt("fromTimelineTab", -1);
            this.f62747J2 = bundle.getBoolean("fromMyProfile");
            this.f62813t2 = !TextUtils.isEmpty(bundle.getString("avatarPhoto"));
            this.f62737E2 = bundle.getBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", false);
            if (bundle.getString("vipPhoto") != null && bundle.getString("vipPhoto").length() > 0 && AbstractC23304d.f113281H.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = bundle.getBoolean("extra_profile_latest_photos", false);
            this.f62739F2 = bundle.getBoolean("EXTRA_BOL_ALLOW_DISABLE_BACK_ANIM", false);
            this.f62741G2 = bundle.getBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", true);
            if (this.f62757O2 != 0) {
                m67091yQ(bundle);
            } else if (z13) {
                this.f62807q2 = true;
                if (this.f62821x2) {
                    m67095zQ(bundle);
                } else if (this.f62813t2) {
                    m67088xQ(bundle);
                } else if (this.f62733C2) {
                    m66930AQ(bundle);
                } else {
                    m66935CQ();
                }
                m67090yP();
            } else if (z12) {
                this.f62807q2 = true;
                ArrayList arrayList = new ArrayList();
                if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(this.f72421L0.m92648SI())) {
                    arrayList.addAll(AbstractC23304d.f113281H);
                } else {
                    for (int i14 = 0; i14 < AbstractC23304d.f113281H.size(); i14++) {
                        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) AbstractC23304d.f113281H.get(i14);
                        itemAlbumMobile.f42548C = "";
                        arrayList.add(itemAlbumMobile);
                    }
                }
                mo66708c6(arrayList);
            } else if (z14) {
                m66933BQ(bundle);
            } else {
                this.f62811s2 = bundle.getBoolean("previewUploadPhoto", false);
                this.f62809r2 = bundle.getBoolean("hideImageFunction", true);
            }
            this.f62663X0 = C3979l.b.FEED_VIEW_FULL_NORMAL;
            if (this.f62825z2) {
                i13 = 5;
            } else if (this.f62821x2 || !this.f62813t2) {
                i13 = 4;
            } else {
                i13 = 6;
            }
            mo66736rO(i13);
            m66942EQ();
            m67089xR();
            m67069rP();
            this.f62653S0 = 30;
        }
    }

    /* renamed from: nR */
    void m67158nR(String str, int i11) {
        ItemAlbumMobile itemAlbumMobile;
        try {
            int i12 = this.f62685m1;
            if (i11 == i12) {
                if (m67109IQ(i12)) {
                    itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(this.f62685m1);
                } else {
                    itemAlbumMobile = null;
                }
                if (itemAlbumMobile != null) {
                    itemAlbumMobile.f42548C = str;
                    itemAlbumMobile.f42607x = str;
                    itemAlbumMobile.f42593q = this.f62793j2;
                    mo66708c6(this.f62684l1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oR */
    void m67159oR() {
        boolean z11;
        boolean z12;
        long j11;
        try {
            if (this.f62746I3 && this.f62813t2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f62750K3 && this.f62733C2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && !z12) {
                this.f62738E3.post(new Runnable() { // from class: j70.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedImageViewer.this.m66977PQ();
                    }
                });
                if (m66945FP(this.f62686n1.f42595r)) {
                    m66934CP();
                } else {
                    m67166uS(false);
                    this.f62738E3.removeMessages(1);
                    Handler handler = this.f62738E3;
                    if (this.f62764R3) {
                        j11 = 0;
                    } else {
                        j11 = 1000;
                    }
                    handler.sendEmptyMessageDelayed(1, j11);
                }
                this.f62764R3 = false;
                if (this.f62805p2 && this.f62685m1 == this.f62684l1.size() - 1) {
                    m67115LP();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oS */
    void m67160oS() {
        try {
            if (this.f62686n1 == null) {
                return;
            }
            C12063c.f m66845YM = m66845YM();
            if (m66845YM == null) {
                m66762EN(1);
            } else {
                m66830RM(m66845YM, false, true, new C12039p());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle extras;
        Bundle extras2;
        try {
            this.f72421L0.invalidateOptionsMenu();
            if (i11 == 12) {
                if (i12 == -1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_photo_post_story_successful));
                    return;
                }
                return;
            }
            if (i11 == 10) {
                if (i12 == -1 && intent != null && !TagsListView.m84992tM(intent)) {
                    int i13 = 0;
                    if (TagsListView.m84991sM(intent)) {
                        this.f62766S3 = true;
                        String stringExtra = intent.getStringExtra("extra_photo_id");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            while (i13 < this.f62684l1.size()) {
                                if (((ItemAlbumMobile) this.f62684l1.get(i13)).f42595r.equals(stringExtra)) {
                                    ((ItemAlbumMobile) this.f62684l1.get(i13)).m40525m();
                                    mo66708c6(this.f62684l1);
                                    this.f62738E3.removeMessages(1);
                                    this.f62738E3.sendEmptyMessage(1);
                                    return;
                                }
                                i13++;
                            }
                            return;
                        }
                        return;
                    }
                    ArrayList m84989oM = TagsListView.m84989oM(intent);
                    if (m84989oM != null && m84989oM.size() > 0) {
                        this.f62768T3.addAll(m84989oM);
                        String stringExtra2 = intent.getStringExtra("extra_photo_id");
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            while (i13 < this.f62684l1.size()) {
                                if (((ItemAlbumMobile) this.f62684l1.get(i13)).f42595r.equals(stringExtra2)) {
                                    ((ItemAlbumMobile) this.f62684l1.get(i13)).m40522j0(m84989oM, true);
                                    mo66708c6(this.f62684l1);
                                    this.f62738E3.removeMessages(1);
                                    this.f62738E3.sendEmptyMessage(1);
                                    return;
                                }
                                i13++;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 != 11 && i11 != 20) {
                if (i11 == 10014) {
                    if (i12 == -1 && (extras2 = intent.getExtras()) != null) {
                        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) extras2.getParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE");
                        AbstractC20805l.m108550h(itemAlbumMobile, this.f62684l1, this.f62815u2);
                        if (extras2.getBoolean("EXTRA_BOOL_FEED_DELETED")) {
                            m67111IS(itemAlbumMobile);
                        }
                        mo66708c6(this.f62684l1);
                        this.f62738E3.removeMessages(1);
                        this.f62738E3.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                if (i11 == 13) {
                    m67059nQ(i12, intent);
                    return;
                }
                if (i11 == 14) {
                    m67062oQ(i12, intent);
                    return;
                }
                if (i11 == 15) {
                    m67064pQ(i12, intent);
                    return;
                }
                if (i11 == 16) {
                    m67067qQ(i12, intent);
                    return;
                }
                if (i11 == 18) {
                    if (i12 == -1) {
                        m67087xP(intent.getExtras());
                        return;
                    }
                    return;
                }
                if (i11 == 19) {
                    if (i12 == -1) {
                        m67087xP(intent.getExtras());
                        return;
                    }
                    return;
                }
                if (i11 == 21 && i12 == -1) {
                    m67144fQ(intent);
                    return;
                }
                if (i11 == 1300) {
                    if (i12 == -1 && intent != null && intent.getExtras() != null) {
                        m66939DR(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                        return;
                    }
                    return;
                }
                if (i11 == 1400 && i12 == -1 && intent != null && intent.getExtras() != null) {
                    m66943ER(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                    return;
                }
                return;
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) extras.getParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE");
                if (itemAlbumMobile2 != null) {
                    if (!itemAlbumMobile2.f42552E.equals(this.f62686n1.f42552E)) {
                        m67123OS(this.f62685m1, C19140e.f95172a.m100453c(itemAlbumMobile2));
                    }
                    AbstractC20805l.m108550h(itemAlbumMobile2, this.f62684l1, this.f62815u2);
                    m67004XS(itemAlbumMobile2.f42595r, itemAlbumMobile2);
                }
                mo66708c6(this.f62684l1);
                this.f62738E3.removeMessages(1);
                this.f62738E3.sendEmptyMessage(1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_comment) {
                if (this.f62635G1) {
                    return;
                }
                RelativeLayout relativeLayout = this.f62779Z2;
                if (relativeLayout != null) {
                    relativeLayout.clearFocus();
                }
                if (C28570b.m142996a().m142998b(1)) {
                    m67119MR();
                    return;
                } else {
                    m67113JR();
                    return;
                }
            }
            if (id2 == AbstractC6918a0.btn_action) {
                ActionDataImageViewer actionDataImageViewer = this.f62749K2;
                if (actionDataImageViewer != null) {
                    int i11 = actionDataImageViewer.f45947r;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                this.f62755N2 = view.getId();
                                showDialog(3);
                                return;
                            }
                            return;
                        }
                        AbstractC23647d.m123897g("6402");
                        m67157mw(CoreUtility.f89233i, EnumC24904a.f119497s.m129507c());
                        return;
                    }
                    AbstractC23647d.m123897g("6302");
                    m67167uf(EnumC25467a.f122044r.m131933c());
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.layout_like_description_container) {
                m67169wS();
            } else if (id2 == AbstractC6918a0.btn_like) {
                C19136a.f95164a.m100437b(view);
                m67149iQ();
            } else {
                super.onClick(view);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
            if (configuration.orientation == 2) {
                TextView textView = this.f62769U2;
                if (textView != null) {
                    textView.setMaxLines(2);
                }
                AbstractC23647d.m123906p("17800");
                AbstractC23647d.m123893c();
            } else {
                TextView textView2 = this.f62769U2;
                if (textView2 != null) {
                    textView2.setMaxLines(5);
                }
            }
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                c12063c.mo35341m();
            }
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                AbstractC32226c.m155413l(this, actionBar);
                this.f88760a0.requestLayout();
            }
            removeDialog(4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m67146gS();
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_like) {
            m67099BR();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        ItemAlbumMobile itemAlbumMobile;
        C12063c c12063c = this.f62677e1;
        if (c12063c != null) {
            itemAlbumMobile = c12063c.m67290x(i11);
        } else {
            itemAlbumMobile = null;
        }
        if (itemAlbumMobile == null) {
            return;
        }
        super.onPageSelected(i11);
        m66982QR(itemAlbumMobile);
        m67066qP();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        try {
            if (i11 != 109) {
                if (i11 != 111) {
                    if (i11 != 125) {
                        super.onRequestPermissionsResult(i11, strArr, iArr);
                        return;
                    } else if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112030g) == 0) {
                        AbstractC3102n.m15597p(this.f72421L0);
                        return;
                    } else {
                        AbstractC23034c6.m118162k0(this, 125);
                        return;
                    }
                }
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118179t()) == 0) {
                    m67161pS();
                    return;
                }
                return;
            }
            if (AbstractC23034c6.m118121G()) {
                if (m66882sN()) {
                    m67135UP(this.f62686n1);
                } else {
                    m67132TP(this.f62686n1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            m67138WS();
            if (this.f62737E2 && this.f62732B3) {
                this.f62732B3 = false;
                AbstractC23304d.f113455x1.getAndIncrement();
                this.f72421L0.m92676n2().getWindow().addFlags(8192);
            }
            if (this.f62734C3 != null) {
                m78956lL().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f62734C3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pS */
    void m67161pS() {
        try {
            if (AbstractC23238v2.m119727l()) {
                CameraInputParams cameraInputParams = new CameraInputParams();
                cameraInputParams.f41129s = 0;
                cameraInputParams.f41087F = true;
                C29046a.f134547b = "FeedImageViewer";
                int i11 = this.f62782a4;
                if (i11 != 13) {
                    if (i11 == 14) {
                        cameraInputParams.f41085D = true;
                        cameraInputParams.f41138w0 = new SensitiveData("profile_change_detail_cover_camera", "profile_cover");
                        AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 14, 1, cameraInputParams);
                    }
                } else {
                    cameraInputParams.f41084C = true;
                    cameraInputParams.f41133u = 2;
                    cameraInputParams.f41138w0 = new SensitiveData("profile_change_detail_avatar_camera", "profile_avatar");
                    cameraInputParams.f41105X = "6";
                    AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 13, 1, cameraInputParams);
                }
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: qN */
    public void mo66733qN(View view) {
        super.mo66733qN(view);
        this.f62767T2 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutImageFunction);
        this.f62769U2 = (TextView) view.findViewById(AbstractC6918a0.tvDescription);
        this.f62771V2 = view.findViewById(AbstractC6918a0.seperatorView);
        this.f62773W2 = (RelativeLayout) view.findViewById(AbstractC6918a0.btn_like);
        this.f62775X2 = (FeedLikeButtonModulesView) view.findViewById(AbstractC6918a0.btn_like_icon);
        this.f62777Y2 = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_like_text);
        this.f62779Z2 = (RelativeLayout) view.findViewById(AbstractC6918a0.btn_comment);
        this.f62781a3 = (RecyclingImageView) view.findViewById(AbstractC6918a0.btn_comment_icon);
        this.f62783b3 = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_action);
        this.f62787d3 = view.findViewById(AbstractC6918a0.layout_like_description_container);
        this.f62788e3 = (ModulesView) view.findViewById(AbstractC6918a0.layout_like_desc);
        m67072sP();
        m66938DQ();
        FeedSongInfoView feedSongInfoView = (FeedSongInfoView) view.findViewById(AbstractC6918a0.feed_music_info);
        this.f62785c3 = feedSongInfoView;
        feedSongInfoView.m44420g(10);
        this.f62785c3.setVisibility(8);
        this.f62767T2.addOnLayoutChangeListener(this.f62754M3);
    }

    /* renamed from: qS */
    void m67162qS() {
        try {
            CharSequence m108693g = C20815q.m108693g(this.f62686n1);
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(7).m43162k(m108693g).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: j70.d1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    FeedImageViewer.this.m67045hR(interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f62804o3 = m43152a;
            m43152a.m92873y(false);
            this.f62804o3.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2263e
    /* renamed from: qg */
    public void mo11981qg(String str, String str2, EnumC2963d3 enumC2963d3) {
    }

    /* renamed from: rS */
    void m67163rS() {
        try {
            C2913t1.a m13861a = new C2913t1(this.f72421L0.getContext()).m13865e(new C2913t1.b() { // from class: j70.f1
                @Override // bn.C2913t1.b
                /* renamed from: a */
                public final void mo13056a(int i11, String str) {
                    FeedImageViewer.this.m67047iR(i11, str);
                }
            }).m13862b(AbstractC23136l9.m118743r0(C20815q.m108697k(this.f62686n1)), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no)).m13861a();
            this.f62806p3 = m13861a;
            m13861a.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: sO */
    public void mo66738sO() {
        boolean z11;
        try {
            super.mo66738sO();
            m67060nS();
            m67057mS();
            this.f62783b3.setOnClickListener(this);
            this.f62789f3.mo89109M0(new C16719g.c() { // from class: j70.z1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedImageViewer.this.m67031dR(c16719g);
                }
            });
            this.f62794j3.mo89109M0(new C16719g.c() { // from class: j70.a2
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedImageViewer.this.m67036eR(c16719g);
                }
            });
            this.f62785c3.setOnClickListener(new View.OnClickListener() { // from class: j70.b2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedImageViewer.this.m67038fR(view);
                }
            });
            m66877pO(this.f62767T2, 8);
            this.f62769U2.setVisibility(0);
            this.f62771V2.setVisibility(8);
            this.f62787d3.setVisibility(8);
            ActionDataImageViewer actionDataImageViewer = this.f62749K2;
            if (actionDataImageViewer != null && actionDataImageViewer.f45945p) {
                z11 = true;
            } else {
                z11 = false;
            }
            m67164sS(z11);
            this.f62673c1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: j70.c2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    FeedImageViewer.this.m67042gR(view, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            });
            ActionDataImageViewer actionDataImageViewer2 = this.f62749K2;
            if (actionDataImageViewer2 != null) {
                this.f62783b3.setText(actionDataImageViewer2.f45946q);
            }
            if (this.f62697y1 || this.f62809r2) {
                m67166uS(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sS */
    void m67164sS(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = this.f62783b3;
        if (z11 && this.f62751L2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        m66879qO(robotoTextView, i11, true);
    }

    /* renamed from: tS */
    void m67165tS(boolean z11) {
        int i11;
        RelativeLayout relativeLayout = this.f62773W2;
        int i12 = 8;
        if (relativeLayout != null) {
            if (z11 && this.f62753M2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            relativeLayout.setVisibility(i11);
        }
        RelativeLayout relativeLayout2 = this.f62779Z2;
        if (relativeLayout2 != null) {
            if (z11 && this.f62753M2) {
                i12 = 0;
            }
            relativeLayout2.setVisibility(i12);
        }
    }

    /* renamed from: uS */
    void m67166uS(boolean z11) {
        int i11 = 0;
        if (this.f62697y1 || this.f62809r2) {
            z11 = false;
        }
        LinearLayout linearLayout = this.f62767T2;
        if (!z11) {
            i11 = 8;
        }
        m66879qO(linearLayout, i11, true);
    }

    /* renamed from: uf */
    public void m67167uf(String str) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_OPTION_VARIANT", str);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileCoverBottomSheet.class, bundle, 1400, 0, true);
        }
    }

    /* renamed from: vS */
    void m67168vS(boolean z11) {
        int i11;
        this.f62800m3 = z11;
        ActionBarMenuItem actionBarMenuItem = this.f62643N0;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    /* renamed from: wS */
    void m67169wS() {
        String str;
        C17487o0 mo35579p;
        if (this.f62686n1 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_PHOTO_ID", this.f62686n1.f42595r);
            bundle.putInt("EXTRA_MODE", 1);
            bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
            C32002l4 c32002l4 = this.f62648P1;
            String str2 = "";
            if (c32002l4 == null) {
                str = "";
            } else {
                str = c32002l4.m154277l();
            }
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", str);
            C3020p0 c3020p0 = this.f62686n1.f42594q0;
            if (c3020p0 != null) {
                str2 = c3020p0.m14465A();
            }
            bundle.putString("EXTRA_FEED_OWNER_ID", str2);
            if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
                mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 0, 0, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0010, B:8:0x0013, B:10:0x0019, B:11:0x001f, B:13:0x0022, B:15:0x0028, B:16:0x002e, B:20:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003f, B:27:0x0042, B:29:0x0048, B:30:0x004b, B:32:0x004f, B:34:0x0055, B:35:0x005b), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0010, B:8:0x0013, B:10:0x0019, B:11:0x001f, B:13:0x0022, B:15:0x0028, B:16:0x002e, B:20:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003f, B:27:0x0042, B:29:0x0048, B:30:0x004b, B:32:0x004f, B:34:0x0055, B:35:0x005b), top: B:2:0x0009 }] */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo17795x(int i11, Object... objArr) {
        String str;
        super.mo17795x(i11, objArr);
        String str2 = "";
        boolean z11 = false;
        try {
            if (i11 != 15000) {
                if (i11 == 15001) {
                    if (objArr.length > 0) {
                        Object obj = objArr[0];
                        if (obj instanceof String) {
                            str2 = (String) obj;
                        }
                    }
                    if (objArr.length > 1) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof Boolean) {
                            z11 = ((Boolean) obj2).booleanValue();
                        }
                    }
                    m67033dT(str2, z11);
                    return;
                }
                return;
            }
            if (objArr.length > 0) {
                Object obj3 = objArr[0];
                if (obj3 instanceof String) {
                    str = (String) obj3;
                    if (objArr.length > 1) {
                        Object obj4 = objArr[1];
                        if (obj4 instanceof String) {
                            str2 = (String) obj4;
                        }
                    }
                    if (objArr.length > 2) {
                        Object obj5 = objArr[2];
                        if (obj5 instanceof Boolean) {
                            z11 = ((Boolean) obj5).booleanValue();
                        }
                    }
                    m67028cT(str, str2, z11);
                }
            }
            str = "";
            if (objArr.length > 1) {
            }
            if (objArr.length > 2) {
            }
            m67028cT(str, str2, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: xO */
    public void mo66890xO() {
        super.mo66890xO();
        m67082vQ();
    }

    /* renamed from: xS */
    public void m67170xS(String str) {
        if (m92676n2() != null && !m92676n2().isFinishing() && m92687sJ()) {
            ToastUtils.showMess(str);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: yO */
    public void mo66745yO(C12063c.g gVar) {
    }
}
