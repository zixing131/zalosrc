package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import am.AbstractC0906d0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import au.C2343e;
import bn.C2874g1;
import bn.C2880i1;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.models.ActionDataImageViewer;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBottomSheet;
import com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBottomSheet;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView;
import com.zing.zalo.p077ui.zviews.UserInfoDetailView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i40.C20275e;
import is.AbstractC20826v0;
import is.C20785b;
import is.C20834z0;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23047d8;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.AbstractC23199r6;
import me0.AbstractC23211s7;
import me0.AbstractC23216t1;
import me0.AbstractC23238v2;
import me0.C23212s8;
import me0.C23278z2;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import mv.InterfaceC23448a;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import org.json.JSONArray;
import p055ce.C3432a;
import p055ce.C3433b;
import p140ev.C18613b;
import p140ev.C18620i;
import p142ey.C18631a;
import p172fy.C19171b;
import p175g0.AbstractC19181d;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p427pq.EnumC24904a;
import p457qq.EnumC25467a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p555uq.C27357a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pd0.C24730d;
import pd0.C24732f;
import pd0.EnumC24733g;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25742h;
import td0.C26638a;
import v50.C27870vb;
import vg.C28203u6;
import wh0.C29046a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class UserInfoDetailView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x, C23744a.c {

    /* renamed from: A1 */
    View f79051A1;

    /* renamed from: B1 */
    View f79052B1;

    /* renamed from: C1 */
    View f79053C1;

    /* renamed from: D1 */
    View f79054D1;

    /* renamed from: E1 */
    View f79055E1;

    /* renamed from: F1 */
    View f79056F1;

    /* renamed from: G1 */
    View f79057G1;

    /* renamed from: H1 */
    View f79058H1;

    /* renamed from: I1 */
    View f79059I1;

    /* renamed from: J1 */
    TextView f79060J1;

    /* renamed from: K1 */
    TextView f79061K1;

    /* renamed from: L1 */
    TextView f79062L1;

    /* renamed from: M1 */
    TextView f79063M1;

    /* renamed from: N1 */
    TextView f79064N1;

    /* renamed from: O1 */
    TextView f79065O1;

    /* renamed from: P0 */
    View f79066P0;

    /* renamed from: P1 */
    View f79067P1;

    /* renamed from: Q0 */
    String f79068Q0;

    /* renamed from: Q1 */
    View f79069Q1;

    /* renamed from: R0 */
    ContactProfile f79070R0;

    /* renamed from: R1 */
    View f79071R1;

    /* renamed from: S0 */
    RelativeLayout f79072S0;

    /* renamed from: S1 */
    View f79073S1;

    /* renamed from: T0 */
    LinearLayout f79074T0;

    /* renamed from: T1 */
    View f79075T1;

    /* renamed from: U0 */
    RelativeLayout f79076U0;

    /* renamed from: U1 */
    View f79077U1;

    /* renamed from: V0 */
    TextView f79078V0;

    /* renamed from: V1 */
    Button f79079V1;

    /* renamed from: W0 */
    TextView f79080W0;

    /* renamed from: W1 */
    RobotoTextView f79081W1;

    /* renamed from: X0 */
    Button f79082X0;

    /* renamed from: X1 */
    RelativeLayout f79083X1;

    /* renamed from: Y0 */
    String[] f79084Y0;

    /* renamed from: Z0 */
    C23528a f79086Z0;

    /* renamed from: Z1 */
    Handler f79087Z1;

    /* renamed from: a1 */
    RecyclingImageView f79088a1;

    /* renamed from: a2 */
    boolean f79089a2;

    /* renamed from: b1 */
    RecyclingImageView f79090b1;

    /* renamed from: b2 */
    boolean f79091b2;

    /* renamed from: c1 */
    View f79092c1;

    /* renamed from: d1 */
    View f79094d1;

    /* renamed from: d2 */
    C24230h f79095d2;

    /* renamed from: e1 */
    CircleImage f79096e1;

    /* renamed from: e2 */
    InterfaceC24232j f79097e2;

    /* renamed from: f1 */
    AutoMeasureTextView f79098f1;

    /* renamed from: g1 */
    boolean f79100g1;

    /* renamed from: g2 */
    int f79101g2;

    /* renamed from: i2 */
    KeyEventCallbackC17462c f79105i2;

    /* renamed from: k1 */
    LinearLayout f79108k1;

    /* renamed from: l1 */
    CircleImage f79110l1;

    /* renamed from: m1 */
    RobotoTextView f79111m1;

    /* renamed from: n1 */
    String f79112n1;

    /* renamed from: o1 */
    String f79113o1;

    /* renamed from: p1 */
    View f79114p1;

    /* renamed from: q1 */
    TextView f79115q1;

    /* renamed from: r1 */
    TextView f79116r1;

    /* renamed from: s1 */
    String f79117s1;

    /* renamed from: t1 */
    ProgressBar f79118t1;

    /* renamed from: u1 */
    View f79119u1;

    /* renamed from: v1 */
    String f79120v1;

    /* renamed from: w1 */
    C27357a f79121w1;

    /* renamed from: x1 */
    RobotoTextView f79122x1;

    /* renamed from: y1 */
    InterfaceC15314f f79123y1;

    /* renamed from: h1 */
    int f79102h1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material) + AbstractC17484n.Companion.m92931b();

    /* renamed from: i1 */
    int f79104i1 = 0;

    /* renamed from: j1 */
    int f79106j1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.cover_height);

    /* renamed from: z1 */
    boolean f79124z1 = false;

    /* renamed from: Y1 */
    private Snackbar f79085Y1 = null;

    /* renamed from: c2 */
    String f79093c2 = "";

    /* renamed from: f2 */
    private final AtomicBoolean f79099f2 = new AtomicBoolean(false);

    /* renamed from: h2 */
    C2874g1.b f79103h2 = new C2874g1.b() { // from class: com.zing.zalo.ui.zviews.i11
        public /* synthetic */ i11() {
        }

        @Override // bn.C2874g1.b
        /* renamed from: a */
        public final void mo13802a(int i11) {
            UserInfoDetailView.this.m86304GM(i11);
        }
    };

    /* renamed from: j2 */
    final Object f79107j2 = new Object();

    /* renamed from: k2 */
    boolean f79109k2 = false;

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoDetailView$a */
    /* loaded from: classes6.dex */
    class C15309a implements AutoMeasureTextView.InterfaceC13795a {
        C15309a() {
        }

        @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
        /* renamed from: a */
        public void mo43324a(CharSequence charSequence) {
        }

        @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
        /* renamed from: b */
        public void mo43325b() {
            if (UserInfoDetailView.this.f79070R0 != null) {
                SensitiveData sensitiveData = new SensitiveData("phonebook_update_alias_in_user_profile_details", "phonebook_update");
                InterfaceC27218a m92676n2 = UserInfoDetailView.this.f72421L0.m92676n2();
                ContactProfile contactProfile = UserInfoDetailView.this.f79070R0;
                m92676n2.mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37078GM(contactProfile.f42434r, contactProfile.f42437s, 691, sensitiveData), 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoDetailView$b */
    /* loaded from: classes6.dex */
    class ViewOnLongClickListenerC15310b implements View.OnLongClickListener {
        ViewOnLongClickListenerC15310b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            String str;
            if (view instanceof TextView) {
                String trim = ((TextView) view).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(view.getContext(), trim, new SensitiveData("clipboard_copy_info_user", "profile_info"));
                    int id2 = view.getId();
                    if (id2 == AbstractC6918a0.tv_link) {
                        str = "0";
                    } else if (id2 == AbstractC6918a0.tv_address) {
                        str = "3";
                    } else if (id2 == AbstractC6918a0.tv_website) {
                        str = "4";
                    } else if (id2 == AbstractC6918a0.tv_email) {
                        str = "5";
                    } else {
                        str = "";
                    }
                    C0815e1.m2075D().m2099U(3, 2, 44, "1", "0", str);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoDetailView$c */
    /* loaded from: classes6.dex */
    public class C15311c implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f79127a;

        C15311c(String str) {
            this.f79127a = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            UserInfoDetailView.this.m86333zM(this.f79127a, bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            UserInfoDetailView.this.m86332yM(aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoDetailView$d */
    /* loaded from: classes6.dex */
    public class C15312d implements InterfaceC20094a {
        C15312d() {
        }

        /* renamed from: e */
        public /* synthetic */ void m86357e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!UserInfoDetailView.this.f72421L0.m92677nJ() && !UserInfoDetailView.this.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 3);
                        UserInfoDetailView.this.f72421L0.m92676n2().mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    UserInfoDetailView.this.f72421L0.m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public static /* synthetic */ void m86358f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (UserInfoDetailView.this.f79107j2) {
                    UserInfoDetailView userInfoDetailView = UserInfoDetailView.this;
                    userInfoDetailView.f79109k2 = false;
                    userInfoDetailView.f72421L0.mo49315c4();
                }
                if (UserInfoDetailView.this.f72421L0.m92677nJ() || UserInfoDetailView.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(UserInfoDetailView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.q11
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        UserInfoDetailView.C15312d.m86358f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.p11.<init>(com.zing.zalo.ui.zviews.UserInfoDetailView$d, boolean, boolean, boolean, org.json.JSONArray):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(java.lang.Object r10) {
            /*
                r9 = this;
                com.zing.zalo.ui.zviews.UserInfoDetailView r0 = com.zing.zalo.p077ui.zviews.UserInfoDetailView.this     // Catch: java.lang.Exception -> L76
                java.lang.Object r0 = r0.f79107j2     // Catch: java.lang.Exception -> L76
                monitor-enter(r0)     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.UserInfoDetailView r1 = com.zing.zalo.p077ui.zviews.UserInfoDetailView.this     // Catch: java.lang.Throwable -> L78
                r2 = 0
                r1.f79109k2 = r2     // Catch: java.lang.Throwable -> L78
                com.zing.zalo.ui.zviews.BaseZaloView r1 = r1.f72421L0     // Catch: java.lang.Throwable -> L78
                r1.mo49315c4()     // Catch: java.lang.Throwable -> L78
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
                if (r10 == 0) goto L7e
                org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch: java.lang.Exception -> L76
                java.lang.String r0 = "data"
                org.json.JSONObject r0 = r10.optJSONObject(r0)     // Catch: java.lang.Exception -> L76
                java.lang.String r1 = "error_code"
                r3 = -999(0xfffffffffffffc19, float:NaN)
                int r10 = r10.optInt(r1, r3)     // Catch: java.lang.Exception -> L76
                if (r10 != 0) goto L7e
                if (r0 == 0) goto L7e
                java.lang.String r10 = "isset_pwd"
                boolean r10 = r0.optBoolean(r10)     // Catch: java.lang.Exception -> L76
                r1 = 1
                p348mi.AbstractC23304d.f113346X0 = r10     // Catch: java.lang.Exception -> L76
                p348mi.AbstractC23309i.m122550wp(r10)     // Catch: java.lang.Exception -> L76
                java.lang.String r10 = "allow_change_phonenumber"
                int r10 = r0.optInt(r10, r2)     // Catch: java.lang.Exception -> L76
                if (r10 != r1) goto L3c
                r5 = 1
                goto L3d
            L3c:
                r5 = 0
            L3d:
                java.lang.String r10 = "unmap_profile"
                int r10 = r0.optInt(r10, r2)     // Catch: java.lang.Exception -> L76
                if (r10 != r1) goto L47
                r6 = 1
                goto L48
            L47:
                r6 = 0
            L48:
                java.lang.String r10 = "bypass_verify_pwd"
                int r10 = r0.optInt(r10, r2)     // Catch: java.lang.Exception -> L76
                if (r10 != r1) goto L52
                r7 = 1
                goto L53
            L52:
                r7 = 0
            L53:
                java.lang.String r10 = "valid_error"
                org.json.JSONArray r8 = r0.optJSONArray(r10)     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.UserInfoDetailView r10 = com.zing.zalo.p077ui.zviews.UserInfoDetailView.this     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.BaseZaloView r10 = r10.f72421L0     // Catch: java.lang.Exception -> L76
                ub.a r10 = r10.m92676n2()     // Catch: java.lang.Exception -> L76
                if (r10 == 0) goto L7e
                com.zing.zalo.ui.zviews.UserInfoDetailView r10 = com.zing.zalo.p077ui.zviews.UserInfoDetailView.this     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.BaseZaloView r10 = r10.f72421L0     // Catch: java.lang.Exception -> L76
                ub.a r10 = r10.m92676n2()     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.p11 r0 = new com.zing.zalo.ui.zviews.p11     // Catch: java.lang.Exception -> L76
                r3 = r0
                r4 = r9
                r3.<init>()     // Catch: java.lang.Exception -> L76
                r10.runOnUiThread(r0)     // Catch: java.lang.Exception -> L76
                goto L7e
            L76:
                r10 = move-exception
                goto L7b
            L78:
                r10 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
                throw r10     // Catch: java.lang.Exception -> L76
            L7b:
                r10.printStackTrace()
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.UserInfoDetailView.C15312d.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoDetailView$e */
    /* loaded from: classes6.dex */
    public class C15313e extends C10866e {
        public C15313e(InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            UserInfoDetailView.this.m86348a7();
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserInfoDetailView$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC15314f {
        /* renamed from: b0 */
        void mo82208b0(boolean z11);
    }

    /* renamed from: AM */
    private void m86299AM() {
        Snackbar snackbar = this.f79085Y1;
        if (snackbar != null && snackbar.m90661t()) {
            this.f79085Y1.m90655n();
            this.f79085Y1 = null;
        }
    }

    /* renamed from: CM */
    private boolean m86300CM() {
        String str = this.f79112n1;
        if (str != null && C23302b.f113247a.m120523d(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: DM */
    public /* synthetic */ void m86301DM(int i11, boolean z11) {
        if (i11 != 0) {
            if (i11 == 1) {
                m86350eN(z11);
                return;
            }
            return;
        }
        m86314dN(z11);
    }

    /* renamed from: EM */
    public /* synthetic */ void m86302EM(int i11, boolean z11) {
        if (!m92677nJ() && !m92681pJ()) {
            this.f79099f2.set(false);
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n11

                /* renamed from: q */
                public final /* synthetic */ int f81295q;

                /* renamed from: r */
                public final /* synthetic */ boolean f81296r;

                public /* synthetic */ n11(int i112, boolean z112) {
                    r2 = i112;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserInfoDetailView.this.m86301DM(r2, r3);
                }
            });
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    /* renamed from: GM */
    public /* synthetic */ void m86304GM(int i11) {
        try {
            switch (i11) {
                case 0:
                    m86328sM(1);
                    return;
                case 1:
                    m86328sM(0);
                    return;
                case 2:
                    m86347YM(5004);
                    return;
                case 3:
                    AbstractC23211s7.m119587t(m92676n2(), 5005, 1);
                    return;
                case 4:
                    m86347YM(5002);
                    return;
                case 5:
                    AbstractC23211s7.m119587t(m92676n2(), 5003, 2);
                    return;
                case 6:
                    m86340S6(CoreUtility.f89233i, 0, C32002l4.m154264g(10014));
                    return;
                default:
                    return;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HM */
    public /* synthetic */ void m86305HM(View view) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(this.f79068Q0, C32002l4.m154264g(28)).m135738E(7340032).m135743b(), 0, 1));
        C0815e1.m2075D().m2099U(3, 2, 44, "1", "0", "0");
    }

    /* renamed from: IM */
    public /* synthetic */ void m86306IM(View view) {
        String charSequence = this.f79064N1.getText().toString();
        if (!TextUtils.isEmpty(this.f79112n1)) {
            if (!charSequence.startsWith("http")) {
                charSequence = "https://" + charSequence;
            }
            ZaloWebView.m87103hS(m92676n2(), charSequence);
            C0815e1.m2075D().m2099U(3, 2, 44, "1", "0", "4");
        }
    }

    /* renamed from: JM */
    public /* synthetic */ void m86307JM(String str, int i11) {
        m86299AM();
        this.f79085Y1 = AbstractC20826v0.m108786T0(this.f79066P0, str, i11);
    }

    /* renamed from: KM */
    public /* synthetic */ void m86308KM() {
        try {
            ProgressBar progressBar = this.f79118t1;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            View view = this.f79119u1;
            if (view != null) {
                view.setVisibility(8);
            }
            ((C23528a) this.f79086Z0.m123612r(this.f79096e1)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    public /* synthetic */ void m86309LM(String str, boolean z11) {
        m86311ZM();
        if (!TextUtils.isEmpty(str) && !z11) {
            m86315dj(str, 3000);
        }
    }

    /* renamed from: RM */
    private void m86310RM() {
        C23744a.m124114c().m124117e(this, 15000);
        C23744a.m124114c().m124117e(this, 15001);
    }

    /* renamed from: ZM */
    private void m86311ZM() {
        try {
            if (C24730d.m128465h().m128473g(CoreUtility.f89233i) != null) {
                ProgressBar progressBar = this.f79118t1;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                View view = this.f79119u1;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            ProgressBar progressBar2 = this.f79118t1;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            View view2 = this.f79119u1;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: aN */
    private void m86312aN() {
        this.f79124z1 = true;
        C20834z0.f102412a.m108925d(true);
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.m11
            public /* synthetic */ m11() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UserInfoDetailView.this.m86308KM();
            }
        });
    }

    /* renamed from: bN */
    private void m86313bN(String str, boolean z11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l11

                /* renamed from: q */
                public final /* synthetic */ String f80966q;

                /* renamed from: r */
                public final /* synthetic */ boolean f80967r;

                public /* synthetic */ l11(String str2, boolean z112) {
                    r2 = str2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserInfoDetailView.this.m86309LM(r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: dN */
    private void m86314dN(boolean z11) {
        boolean z12;
        String str;
        try {
            ContactProfile contactProfile = this.f79070R0;
            if (contactProfile != null) {
                if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                    AbstractC23647d.m123897g("6401");
                } else {
                    if (this.f79070R0.m40387S0()) {
                        str = "8400";
                    } else {
                        str = "7400";
                    }
                    AbstractC23647d.m123907q(str, this.f72829D0);
                    AbstractC23647d.m123893c();
                }
                C20785b.f102138a.m108465o(this.f79070R0.f42434r, "user_info");
            }
            ContactProfile contactProfile2 = this.f79070R0;
            if (contactProfile2 != null && !TextUtils.isEmpty(contactProfile2.f42434r) && !this.f79070R0.f42434r.equalsIgnoreCase("null") && !C23302b.f113247a.m120523d(this.f79112n1)) {
                Bundle bundle = new Bundle();
                bundle.putString("avatarPhoto", "1");
                if ((!TextUtils.equals(this.f79070R0.f42434r, CoreUtility.f89233i)) && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bundle.putBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", z12);
                bundle.putString("userId", this.f79070R0.f42434r);
                bundle.putString("defaultAvatar", this.f79112n1);
                bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                if (CoreUtility.f89233i.equals(this.f79070R0.f42434r)) {
                    bundle.putParcelable("extra_action_data", ActionDataImageViewer.m45080a());
                }
                C20275e c20275e = new C20275e();
                c20275e.m105883v(true);
                m86344VM(null, null, null, bundle, c20275e, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dj */
    private void m86315dj(String str, int i11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h11

                /* renamed from: q */
                public final /* synthetic */ String f80531q;

                /* renamed from: r */
                public final /* synthetic */ int f80532r;

                public /* synthetic */ h11(String str2, int i112) {
                    r2 = str2;
                    r3 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserInfoDetailView.this.m86307JM(r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    private void m86327rM() {
        C23744a.m124114c().m124115b(this, 15000);
        C23744a.m124114c().m124115b(this, 15001);
    }

    /* renamed from: sM */
    private void m86328sM(int i11) {
        if (this.f79070R0 != null && !this.f79099f2.get()) {
            this.f79099f2.set(true);
            AbstractC21935u.m114537d(this.f79070R0.f42434r, new InterfaceC23448a() { // from class: com.zing.zalo.ui.zviews.g11

                /* renamed from: b */
                public final /* synthetic */ int f80422b;

                public /* synthetic */ g11(int i112) {
                    r2 = i112;
                }

                @Override // mv.InterfaceC23448a
                /* renamed from: a */
                public final void mo87300a(boolean z11) {
                    UserInfoDetailView.this.m86302EM(r2, z11);
                }
            });
        }
    }

    /* renamed from: tM */
    private void m86329tM() {
        try {
            String m17233b = C3432a.f14402a.m17233b();
            if (TextUtils.isEmpty(m17233b)) {
                AbstractC23350e.m122778h(new Exception("Business Account editUrl is empty"));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", m17233b);
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93605x);
            bundle.putInt("EXTRA_SOURCE_LINK", 103);
            ZaloWebView.m87105iS(m92692wK(), m17233b, bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wM */
    private void m86330wM(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        m86315dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    } else {
                        m86315dj(stringExtra, 3000);
                    }
                } else {
                    this.f79091b2 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false);
                    m86349cN(m86352uM(intent));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: xM */
    private void m86331xM(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        m86315dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    } else {
                        m86315dj(stringExtra, 3000);
                    }
                } else {
                    this.f79091b2 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false);
                    m86349cN(m86354vM(intent));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: yM */
    public void m86332yM(C20096c c20096c) {
        try {
            try {
                mo49315c4();
                if (m92672lJ()) {
                    m86315dj(AbstractC23047d8.m118252d(c20096c), 3000);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            this.f79095d2 = null;
            this.f79097e2 = null;
        }
    }

    /* renamed from: zM */
    public void m86333zM(String str, AbstractC25751q abstractC25751q) {
        try {
            try {
                mo49315c4();
                if (abstractC25751q instanceof C25742h) {
                    String m132869b = ((C25742h) abstractC25751q).m132869b();
                    if (!"null".equals(m132869b) && !m132869b.trim().equals("") && !"-2".equals(m132869b)) {
                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.o11

                            /* renamed from: q */
                            public final /* synthetic */ String f81411q;

                            public /* synthetic */ o11(String str2) {
                                r2 = str2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UserInfoDetailView.this.m86303FM(r2);
                            }
                        });
                    }
                    m86332yM(new C20096c(502, AbstractC23161o1.m119318c(502, m132869b)));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                m86332yM(C26638a.f126094a.m136734c());
            }
            this.f79095d2 = null;
            this.f79097e2 = null;
        } catch (Throwable th2) {
            this.f79095d2 = null;
            this.f79097e2 = null;
            throw th2;
        }
    }

    /* renamed from: BM */
    void m86334BM() {
        try {
            if (this.f79072S0 != null) {
                this.f79100g1 = false;
                int m118742r = AbstractC23136l9.m118742r(215.0f);
                if (this.f79072S0.getLayoutParams() != null) {
                    this.f79072S0.getLayoutParams().height = m118742r;
                    this.f79072S0.requestLayout();
                }
                m86341SM(m118742r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        this.f79086Z0 = new C23528a(this.f72421L0.m92648SI());
        this.f79084Y0 = AbstractC23136l9.m118755v0(AbstractC16775v.sex_text);
        if (this.f72421L0.m92642L3() != null) {
            this.f79068Q0 = this.f72421L0.m92642L3().getString("extra_contact_uid");
        }
        if (bundle != null) {
            this.f79089a2 = bundle.getBoolean("BOL_EXTRA_PUSH_FEED_AVATAR", this.f79089a2);
            this.f79091b2 = bundle.getBoolean("BOL_EXTRA_PUSH_FEED_COVER", this.f79091b2);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.img_popup_cover);
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return new C2874g1.a(this.f72421L0.m92676n2()).m13812j(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changeavt_dialog_title)).m13811i(C2880i1.m13833a(m92689tK(), !m86300CM(), true ^ m86300CM())).m13809g(this.f79103h2).m13806c();
                }
            } else {
                return new C2874g1.a(this.f72421L0.m92676n2()).m13812j(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changecover_dialog_title)).m13813k(AbstractC23136l9.m118742r(5.0f)).m13810h(m118665N).m13814l(m118665N.getIntrinsicWidth()).m13811i(C2880i1.m13835c(m92689tK())).m13809g(this.f79103h2).m13806c();
            }
        } else {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(4);
                aVar.m43155d(true);
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_start_create_username));
                aVar.m43169r(AbstractC8020f0.str_yes, this);
                aVar.m43164m(AbstractC8020f0.str_no, new InterfaceC17463d.b());
                C8009j m43152a = aVar.m43152a();
                this.f79105i2 = m43152a;
                return m43152a;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.user_info_details_view, viewGroup, false);
        this.f79066P0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f79105i2 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m86310RM();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                interfaceC17463d.dismiss();
                m86345WM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    public void m86335MM() {
        this.f79124z1 = true;
        Handler handler = this.f79087Z1;
        if (handler != null) {
            handler.post(new f11(this));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11) {
            this.f88756W = 0;
            InterfaceC15314f interfaceC15314f = this.f79123y1;
            if (interfaceC15314f != null) {
                interfaceC15314f.mo82208b0(this.f79124z1);
            }
            this.f72421L0.finish();
        }
        this.f77813M0 = false;
    }

    /* renamed from: NM */
    public void m86336NM(int i11) {
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 == 7) {
                            AbstractC23152n3.m119040e0(m92676n2(), this, C18620i.f93672O);
                            return;
                        }
                        return;
                    }
                    m86340S6(CoreUtility.f89233i, 0, C32002l4.m154264g(10014));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_menu_info_avatar", "profile_avatar"));
                AbstractC23211s7.m119589v(m92676n2(), 5005, 1, true, bundle);
                return;
            }
            m86347YM(5004);
            return;
        }
        m86328sM(0);
    }

    /* renamed from: OM */
    public void m86337OM(int i11) {
        if (i11 != 7) {
            if (i11 != 8) {
                if (i11 == 9) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_menu_info_cover", "profile_cover"));
                    AbstractC23211s7.m119589v(m92676n2(), 5003, 2, true, bundle);
                    return;
                }
                return;
            }
            m86347YM(5002);
            return;
        }
        m86328sM(1);
    }

    /* renamed from: PM */
    public void m86303FM(String str) {
        try {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            contactProfile.f42324B = str;
            AbstractC23309i.m121068Iz(contactProfile.m40373K());
            if (m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateCoverSuccess));
            }
            m86339QM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Ps */
    public void mo62806Ps() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 != 16908332) {
            return super.mo37491QJ(i11);
        }
        InterfaceC15314f interfaceC15314f = this.f79123y1;
        if (interfaceC15314f != null) {
            interfaceC15314f.mo82208b0(this.f79124z1);
        }
        this.f72421L0.finish();
        return true;
    }

    /* renamed from: QM */
    public void m86339QM() {
        boolean z11;
        boolean z12;
        ContactProfile contactProfile;
        C3433b m40364F;
        String str;
        String m17257j;
        String m17251d;
        String m17252e;
        String m17249b;
        String m17259l;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        try {
            if (this.f79068Q0.equals(AbstractC23304d.f113368c0.f42434r)) {
                this.f79070R0 = AbstractC23304d.f113368c0;
            } else {
                this.f79070R0 = C28203u6.f131407a.m141809c(this.f79068Q0);
            }
            if (this.f79070R0 != null) {
                m86334BM();
                CircleImage circleImage = this.f79096e1;
                circleImage.setImageDrawable(C23212s8.m119609q(circleImage.getContext(), AbstractC16781w.default_avatar));
                String str2 = this.f79070R0.f42446v;
                this.f79112n1 = str2;
                if (!TextUtils.isEmpty(str2) && !this.f79112n1.equalsIgnoreCase("null")) {
                    if (C23302b.f113247a.m120523d(this.f79112n1) && !CoreUtility.f89233i.equals(this.f79070R0.f42434r)) {
                        this.f79096e1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f79070R0.m40383Q(true, false)), C2343e.m12307a(this.f79070R0.f42434r, false)));
                    } else {
                        ((C23528a) this.f79086Z0.m123612r(this.f79096e1)).m123618x(this.f79112n1, C23278z2.m120143n());
                    }
                }
                this.f79053C1.setVisibility(8);
                if (C3432a.f14402a.m17234c() && this.f79070R0.m40357A0() && (m40364F = this.f79070R0.m40364F()) != null) {
                    if (!this.f79070R0.f42434r.equals(CoreUtility.f89233i) && TextUtils.isEmpty(this.f79070R0.f42460z1) && TextUtils.isEmpty(m40364F.m17257j()) && TextUtils.isEmpty(m40364F.m17251d()) && TextUtils.isEmpty(m40364F.m17252e()) && TextUtils.isEmpty(m40364F.m17249b()) && TextUtils.isEmpty(m40364F.m17259l()) && TextUtils.isEmpty(m40364F.m17253f())) {
                        this.f79053C1.setVisibility(8);
                    } else {
                        this.f79053C1.setVisibility(0);
                        RobotoTextView robotoTextView = this.f79081W1;
                        String str3 = "";
                        if (TextUtils.isEmpty(this.f79070R0.f42460z1)) {
                            str = "";
                        } else {
                            str = this.f79070R0.f42460z1;
                        }
                        robotoTextView.setText(str);
                        TextView textView = this.f79060J1;
                        if (TextUtils.isEmpty(m40364F.m17257j())) {
                            m17257j = "";
                        } else {
                            m17257j = m40364F.m17257j();
                        }
                        textView.setText(m17257j);
                        TextView textView2 = this.f79061K1;
                        if (TextUtils.isEmpty(m40364F.m17251d())) {
                            m17251d = "";
                        } else {
                            m17251d = m40364F.m17251d();
                        }
                        textView2.setText(m17251d);
                        TextView textView3 = this.f79062L1;
                        if (TextUtils.isEmpty(m40364F.m17252e())) {
                            m17252e = "";
                        } else {
                            m17252e = m40364F.m17252e();
                        }
                        textView3.setText(m17252e);
                        TextView textView4 = this.f79063M1;
                        if (TextUtils.isEmpty(m40364F.m17249b())) {
                            m17249b = "";
                        } else {
                            m17249b = m40364F.m17249b();
                        }
                        textView4.setText(m17249b);
                        TextView textView5 = this.f79064N1;
                        if (TextUtils.isEmpty(m40364F.m17259l())) {
                            m17259l = "";
                        } else {
                            m17259l = m40364F.m17259l();
                        }
                        textView5.setText(m17259l);
                        TextView textView6 = this.f79065O1;
                        if (!TextUtils.isEmpty(m40364F.m17253f())) {
                            str3 = m40364F.m17253f();
                        }
                        textView6.setText(str3);
                        RelativeLayout relativeLayout = this.f79083X1;
                        if (TextUtils.isEmpty(this.f79070R0.f42460z1)) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        relativeLayout.setVisibility(i11);
                        if (!this.f79070R0.f42434r.equals(CoreUtility.f89233i)) {
                            View view = this.f79054D1;
                            if (TextUtils.isEmpty(m40364F.m17257j())) {
                                i13 = 8;
                            } else {
                                i13 = 0;
                            }
                            view.setVisibility(i13);
                            View view2 = this.f79055E1;
                            if (TextUtils.isEmpty(m40364F.m17251d())) {
                                i14 = 8;
                            } else {
                                i14 = 0;
                            }
                            view2.setVisibility(i14);
                            View view3 = this.f79056F1;
                            if (TextUtils.isEmpty(m40364F.m17252e())) {
                                i15 = 8;
                            } else {
                                i15 = 0;
                            }
                            view3.setVisibility(i15);
                            View view4 = this.f79057G1;
                            if (TextUtils.isEmpty(m40364F.m17249b())) {
                                i16 = 8;
                            } else {
                                i16 = 0;
                            }
                            view4.setVisibility(i16);
                            View view5 = this.f79058H1;
                            if (TextUtils.isEmpty(m40364F.m17259l())) {
                                i17 = 8;
                            } else {
                                i17 = 0;
                            }
                            view5.setVisibility(i17);
                            View view6 = this.f79059I1;
                            if (TextUtils.isEmpty(m40364F.m17253f())) {
                                i18 = 8;
                            } else {
                                i18 = 0;
                            }
                            view6.setVisibility(i18);
                            if (this.f79059I1.getVisibility() == 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            View view7 = this.f79077U1;
                            if (z13) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            view7.setVisibility(i19);
                            if (this.f79058H1.getVisibility() == 0) {
                                z13 = true;
                            }
                            View view8 = this.f79075T1;
                            if (z13) {
                                i21 = 0;
                            } else {
                                i21 = 8;
                            }
                            view8.setVisibility(i21);
                            if (this.f79057G1.getVisibility() == 0) {
                                z13 = true;
                            }
                            View view9 = this.f79073S1;
                            if (z13) {
                                i22 = 0;
                            } else {
                                i22 = 8;
                            }
                            view9.setVisibility(i22);
                            if (this.f79056F1.getVisibility() == 0) {
                                z13 = true;
                            }
                            View view10 = this.f79071R1;
                            if (z13) {
                                i23 = 0;
                            } else {
                                i23 = 8;
                            }
                            view10.setVisibility(i23);
                            if (this.f79055E1.getVisibility() == 0) {
                                z13 = true;
                            }
                            View view11 = this.f79069Q1;
                            if (z13) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            view11.setVisibility(i24);
                            if (this.f79054D1.getVisibility() == 0) {
                                z13 = true;
                            }
                            View view12 = this.f79067P1;
                            if (z13) {
                                i25 = 0;
                            } else {
                                i25 = 8;
                            }
                            view12.setVisibility(i25);
                        }
                        Button button = this.f79079V1;
                        if (this.f79070R0.f42434r.equals(CoreUtility.f89233i)) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        button.setVisibility(i12);
                    }
                }
                String str4 = this.f79070R0.f42324B;
                this.f79113o1 = str4;
                if (!TextUtils.isEmpty(str4) && !this.f79113o1.equalsIgnoreCase("null")) {
                    ((C23528a) this.f79086Z0.m123612r(this.f79090b1)).m123618x(this.f79070R0.f42324B, C23278z2.m120132i0());
                }
                String m40383Q = this.f79070R0.m40383Q(true, false);
                this.f79117s1 = m40383Q;
                if (!TextUtils.isEmpty(m40383Q)) {
                    this.f79098f1.setText(this.f79117s1);
                    String str5 = this.f79070R0.f42434r;
                    boolean m114558y = AbstractC21935u.m114558y(str5);
                    if (!m114558y && (((contactProfile = this.f79070R0) == null || contactProfile.f42352K0 <= 0) && !C21927m.m114302u().m114318P(str5))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!TextUtils.isEmpty(str5) && str5.equals(CoreUtility.f89233i)) {
                        m86342TM(false);
                    } else {
                        if (!m114558y && (!z11 || !C18631a.m98446i().f93750b)) {
                            z12 = false;
                            m86342TM(z12);
                        }
                        z12 = true;
                        m86342TM(z12);
                    }
                }
                if (!TextUtils.isEmpty(this.f79070R0.f42458z)) {
                    this.f79122x1.setVisibility(8);
                    this.f79122x1.setText(this.f79070R0.f42458z);
                } else {
                    this.f79122x1.setVisibility(8);
                }
                int i26 = this.f79070R0.f42449w;
                if (i26 != 0 && i26 != 1) {
                    this.f79080W0.setText(this.f79084Y0[2]);
                    if (this.f79070R0.f42434r.equals(CoreUtility.f89233i)) {
                        this.f79066P0.findViewById(AbstractC6918a0.profile_header_gender).setVisibility(0);
                    } else {
                        this.f79066P0.findViewById(AbstractC6918a0.profile_header_gender).setVisibility(8);
                    }
                } else {
                    this.f79066P0.findViewById(AbstractC6918a0.profile_header_gender).setVisibility(0);
                    this.f79080W0.setText(this.f79084Y0[this.f79070R0.f42449w]);
                }
                if (!TextUtils.isEmpty(this.f79070R0.f42452x)) {
                    this.f79078V0.setText(this.f79070R0.f42452x);
                } else {
                    this.f79078V0.setText("••/••/••••");
                }
                if (this.f79070R0.f42434r.equals(CoreUtility.f89233i)) {
                    ContactProfile contactProfile2 = this.f79070R0;
                    if (contactProfile2.f42341G1 == 1) {
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title);
                        String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_number_unmap_profile), m118743r0);
                        SpannableString spannableString = new SpannableString(format);
                        int indexOf = format.indexOf(m118743r0);
                        spannableString.setSpan(new C15313e(this.f72421L0.m92676n2(), indexOf, m118743r0.length() + indexOf), indexOf, m118743r0.length() + indexOf, 33);
                        this.f79115q1.setMovementMethod(CustomMovementMethod.m56305e());
                        this.f79115q1.setText(spannableString);
                        this.f79116r1.setVisibility(8);
                    } else {
                        String m118282h = AbstractC23056e6.m118282h(contactProfile2.f42455y, AbstractC23309i.m121704a5(), false);
                        if (TextUtils.isEmpty(m118282h) || m118282h.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                            m118282h = this.f79070R0.f42455y;
                        }
                        this.f79115q1.setText(m118282h);
                        this.f79115q1.setMaxLines(1);
                        this.f79115q1.setEllipsize(TextUtils.TruncateAt.END);
                        this.f79116r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_show_my_phone_num_desc));
                    }
                } else if (AbstractC0906d0.m2796b(MainApplication.getAppContext(), this.f79070R0.f42455y)) {
                    String m118282h2 = AbstractC23056e6.m118282h(this.f79070R0.f42455y, AbstractC23309i.m121704a5(), false);
                    if (TextUtils.isEmpty(m118282h2) || m118282h2.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        m118282h2 = this.f79070R0.f42455y;
                    }
                    this.f79115q1.setText(m118282h2);
                    this.f79116r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_show_phone_num_desc));
                } else {
                    this.f79115q1.setText("••••••••••");
                    this.f79116r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hidden_phone_num_desc));
                }
                AbstractC23136l9.m118744r1(this.f79116r1, 0);
                if (this.f79070R0.f42434r.equals(CoreUtility.f89233i)) {
                    this.f79082X0.setIdTracking("btn_edit_profile_info");
                    this.f79082X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_edit));
                    this.f79082X0.setOnClickListener(this);
                } else {
                    this.f79082X0.setVisibility(8);
                }
            }
            C24732f m128473g = C24730d.m128465h().m128473g(CoreUtility.f89233i);
            if (m128473g != null) {
                if (m128473g.f118782d == EnumC24733g.UPLOADING) {
                    this.f79118t1.setVisibility(0);
                    this.f79119u1.setVisibility(8);
                } else {
                    this.f79118t1.setVisibility(8);
                    this.f79119u1.setVisibility(0);
                }
                this.f79120v1 = m128473g.f118779a;
                return;
            }
            this.f79118t1.setVisibility(8);
            this.f79119u1.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 6075);
    }

    /* renamed from: S6 */
    public void m86340S6(String str, int i11, C32002l4 c32002l4) {
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
                m92662fJ.m93066i2(ProfileAlbumDetailView.class, bundle, 5006, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            bundle.putBoolean("BOL_EXTRA_PUSH_FEED_AVATAR", this.f79089a2);
            bundle.putBoolean("BOL_EXTRA_PUSH_FEED_COVER", this.f79091b2);
        }
    }

    /* renamed from: SM */
    void m86341SM(int i11) {
        try {
            int i12 = this.f79106j1;
            int i13 = i12 - i11;
            if (i12 == 0) {
                this.f79106j1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.cover_height);
            }
            if (this.f79102h1 == 0) {
                this.f79102h1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material) + AbstractC32226c.m155405d(this.f72421L0.m92676n2());
            }
            int i14 = this.f79102h1 - this.f79106j1;
            RecyclingImageView recyclingImageView = this.f79090b1;
            if (recyclingImageView != null) {
                AbstractC1579n0.m7857b1(recyclingImageView, AbstractC23199r6.m119528a((-i13) / 2, i14, 0.0f));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            if (this.f79108k1 == null) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.layout_avatar_action_bar, (ViewGroup) null);
                this.f79108k1 = linearLayout;
                CircleImage circleImage = (CircleImage) linearLayout.findViewById(AbstractC6918a0.imvAvatar);
                this.f79110l1 = circleImage;
                circleImage.setEnableRoundPadding(false);
                this.f79111m1 = (RobotoTextView) this.f79108k1.findViewById(AbstractC6918a0.tvTitle);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                layoutParams.setMargins(AbstractC23136l9.m118742r(56.0f), 0, AbstractC23136l9.m118742r(40.0f), 0);
                layoutParams.gravity = 16;
                this.f88760a0.addView(this.f79108k1, layoutParams);
            }
            ActionBar actionBar2 = this.f88760a0;
            if (actionBar2 != null) {
                actionBar2.setBackgroundColor(0);
            }
        }
    }

    /* renamed from: TM */
    void m86342TM(boolean z11) {
        boolean z12 = z11 & C18631a.m98446i().f93749a;
        AutoMeasureTextView autoMeasureTextView = this.f79098f1;
        if (autoMeasureTextView != null) {
            autoMeasureTextView.setDrawableVisible(z12);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Tf */
    public View mo62809Tf() {
        if (this.f72421L0.m92650VI() != null) {
            return this.f72421L0.m92650VI().m92656bJ();
        }
        return null;
    }

    /* renamed from: UM */
    void m86343UM() {
        try {
            if (AbstractC23238v2.m119727l()) {
                CameraInputParams cameraInputParams = new CameraInputParams();
                cameraInputParams.f41129s = 0;
                cameraInputParams.f41087F = true;
                C29046a.f134547b = "UserInfoDetailView";
                int i11 = this.f79101g2;
                if (i11 != 5002) {
                    if (i11 == 5004) {
                        cameraInputParams.f41084C = true;
                        cameraInputParams.f41133u = 2;
                        cameraInputParams.f41105X = "6";
                        cameraInputParams.f41138w0 = new SensitiveData("profile_menu_info_avatar_camera", "profile_avatar");
                        AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 5004, 1, cameraInputParams);
                    }
                } else {
                    cameraInputParams.f41085D = true;
                    cameraInputParams.f41138w0 = new SensitiveData("profile_menu_info_cover_camera", "profile_cover");
                    AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 5002, 1, cameraInputParams);
                }
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 5400);
    }

    /* renamed from: VM */
    public void m86344VM(ImageView imageView, C23528a c23528a, String str, Bundle bundle, C20275e c20275e, int i11) {
        c20275e.m105885x(false);
        try {
            this.f72421L0.m92676n2().mo35556V(imageView, str, bundle, c20275e, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WM */
    void m86345WM() {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        C17487o0 c17487o02 = c17487o0;
        if (c17487o02 != null) {
            c17487o02.m93066i2(CreateUserNameView.class, null, 5001, 1, true);
        }
    }

    /* renamed from: XM */
    public void m86346XM(String str) {
        if (this.f79118t1.getVisibility() == 0) {
            return;
        }
        this.f79118t1.setVisibility(0);
        if (this.f79121w1 == null) {
            this.f79121w1 = AbstractC23306f.m120609P1();
        }
        this.f79121w1.m101508a(new C27357a.a(str, this.f79089a2, "", C32017m4.m154326S().m154339K(C32002l4.m154265h(10014, 20)), false));
    }

    /* renamed from: YM */
    public void m86347YM(int i11) {
        try {
            this.f79101g2 = i11;
            String[] m118179t = AbstractC23034c6.m118179t();
            if (AbstractC23034c6.m118167n(m92686rK(), m118179t) != 0) {
                AbstractC23034c6.m118184v0(this, m118179t, 111);
            } else {
                m86343UM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        try {
            this.f79090b1 = (RecyclingImageView) this.f79066P0.findViewById(AbstractC6918a0.imv_cover);
            this.f79072S0 = (RelativeLayout) this.f79066P0.findViewById(AbstractC6918a0.fake_cover_image);
            View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.layout_header_cover_avatar, (ViewGroup) null);
            this.f79092c1 = inflate;
            RecyclingImageView recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.cover_image_oa);
            this.f79088a1 = recyclingImageView;
            recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC17466e.transparent));
            this.f79094d1 = this.f79092c1.findViewById(AbstractC6918a0.contact_info_oa);
            this.f79096e1 = (CircleImage) this.f79092c1.findViewById(AbstractC6918a0.imv_avatar_oa);
            this.f79118t1 = (ProgressBar) this.f79092c1.findViewById(AbstractC6918a0.pb_upload_avatar);
            View findViewById = this.f79092c1.findViewById(AbstractC6918a0.btn_retry_upload_avatar);
            this.f79119u1 = findViewById;
            findViewById.setOnClickListener(this);
            this.f79087Z1 = new Handler(Looper.getMainLooper());
            this.f79096e1.setOnClickListener(this);
            this.f79090b1.setOnClickListener(this);
            AutoMeasureTextView autoMeasureTextView = (AutoMeasureTextView) this.f79092c1.findViewById(AbstractC6918a0.user_display_name_oa);
            this.f79098f1 = autoMeasureTextView;
            autoMeasureTextView.setClickListener(new C15309a());
            m86342TM(false);
            this.f79122x1 = (RobotoTextView) this.f79092c1.findViewById(AbstractC6918a0.user_display_status_oa);
            RelativeLayout relativeLayout = this.f79072S0;
            if (relativeLayout != null && relativeLayout.getChildCount() == 0) {
                this.f79072S0.addView(this.f79092c1);
            }
            this.f79078V0 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_dob);
            this.f79080W0 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_sex);
            View findViewById2 = view.findViewById(AbstractC6918a0.profile_header_phone_layout);
            this.f79114p1 = findViewById2;
            findViewById2.setVisibility(0);
            this.f79115q1 = (TextView) view.findViewById(AbstractC6918a0.tv_phone_number);
            this.f79116r1 = (TextView) view.findViewById(AbstractC6918a0.tv_phone_desc);
            this.f79082X0 = (Button) this.f79066P0.findViewById(AbstractC6918a0.btn_edit_bio);
            this.f79053C1 = this.f79066P0.findViewById(AbstractC6918a0.ba_layout);
            this.f79054D1 = this.f79066P0.findViewById(AbstractC6918a0.rl_link);
            this.f79055E1 = this.f79066P0.findViewById(AbstractC6918a0.rl_category);
            this.f79056F1 = this.f79066P0.findViewById(AbstractC6918a0.rl_desc);
            this.f79057G1 = this.f79066P0.findViewById(AbstractC6918a0.rl_address);
            this.f79058H1 = this.f79066P0.findViewById(AbstractC6918a0.rl_website);
            this.f79059I1 = this.f79066P0.findViewById(AbstractC6918a0.rl_email);
            this.f79060J1 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_link);
            this.f79061K1 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_category);
            this.f79062L1 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_description);
            this.f79063M1 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_address);
            this.f79064N1 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_website);
            this.f79065O1 = (TextView) this.f79066P0.findViewById(AbstractC6918a0.tv_email);
            this.f79067P1 = this.f79066P0.findViewById(AbstractC6918a0.line_username);
            this.f79069Q1 = this.f79066P0.findViewById(AbstractC6918a0.line_link);
            this.f79071R1 = this.f79066P0.findViewById(AbstractC6918a0.line_category);
            this.f79073S1 = this.f79066P0.findViewById(AbstractC6918a0.line_description);
            this.f79075T1 = this.f79066P0.findViewById(AbstractC6918a0.line_address);
            this.f79077U1 = this.f79066P0.findViewById(AbstractC6918a0.line_website);
            this.f79079V1 = (Button) this.f79066P0.findViewById(AbstractC6918a0.btn_edit_ba);
            this.f79053C1.setVisibility(8);
            this.f79079V1.setIdTracking("btn_edit_ba_info");
            this.f79079V1.setOnClickListener(this);
            this.f79083X1 = (RelativeLayout) this.f79066P0.findViewById(AbstractC6918a0.profile_header_username_layout);
            this.f79081W1 = (RobotoTextView) this.f79066P0.findViewById(AbstractC6918a0.tv_username);
            this.f79074T0 = (LinearLayout) this.f79066P0.findViewById(AbstractC6918a0.layout_info);
            this.f79076U0 = (RelativeLayout) this.f79066P0.findViewById(AbstractC6918a0.layout_avatar_oa);
            this.f79052B1 = this.f79092c1.findViewById(AbstractC6918a0.top_profile_cover_gradient_oa);
            this.f79051A1 = this.f79092c1.findViewById(AbstractC6918a0.profile_cover_gradient_oa);
            this.f79052B1.setVisibility(0);
            this.f79051A1.setVisibility(0);
            ViewOnLongClickListenerC15310b viewOnLongClickListenerC15310b = new ViewOnLongClickListenerC15310b();
            this.f79060J1.setOnLongClickListener(viewOnLongClickListenerC15310b);
            this.f79063M1.setOnLongClickListener(viewOnLongClickListenerC15310b);
            this.f79064N1.setOnLongClickListener(viewOnLongClickListenerC15310b);
            this.f79065O1.setOnLongClickListener(viewOnLongClickListenerC15310b);
            this.f79060J1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.j11
                public /* synthetic */ j11() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UserInfoDetailView.this.m86305HM(view2);
                }
            });
            this.f79064N1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.k11
                public /* synthetic */ k11() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UserInfoDetailView.this.m86306IM(view2);
                }
            });
            m86327rM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a7 */
    public void m86348a7() {
        try {
            synchronized (this.f79107j2) {
                try {
                    if (this.f79109k2) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    synchronized (this.f79107j2) {
                        this.f79109k2 = true;
                        this.f72421L0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15312d());
                    c0766k.mo1743t7(3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cN */
    void m86349cN(String str) {
        try {
            mo46829Y();
            this.f79095d2 = C24226d.m126395Q(new Random().nextInt(Integer.MAX_VALUE), EnumC24229g.f116987u, str, 0L, false);
            C15311c c15311c = new C15311c(str);
            this.f79097e2 = c15311c;
            this.f79095d2.m126505h(c15311c);
            this.f79095d2.m126535z0(C32017m4.m154326S().m154340L(C32002l4.m154265h(10014, 21)));
            this.f79095d2.m126524s0(this.f79091b2);
            C24226d.m126402Z(this.f79095d2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: eN */
    void m86350eN(boolean z11) {
        ItemAlbumMobile itemAlbumMobile;
        try {
            ContactProfile contactProfile = this.f79070R0;
            if (contactProfile != null) {
                itemAlbumMobile = contactProfile.m40376M();
            } else {
                itemAlbumMobile = null;
            }
            ItemAlbumMobile itemAlbumMobile2 = itemAlbumMobile;
            if (itemAlbumMobile2 != null) {
                ContactProfile contactProfile2 = this.f79070R0;
                if (contactProfile2 != null) {
                    if (contactProfile2.f42434r.equals(CoreUtility.f89233i)) {
                        AbstractC23647d.m123897g("6301");
                    } else {
                        AbstractC23647d.m123897g("7301");
                    }
                    C20785b.f102138a.m108466p(this.f79070R0.f42434r, "user_info");
                }
                FeedActionZUtils.m47546d0(this.f72421L0.m92676n2(), this.f79086Z0, itemAlbumMobile2, 0, z11, C32002l4.m154264g(10014));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserInfoDetailView";
    }

    /* renamed from: mw */
    public void m86351mw(String str, String str2) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UID", str);
        bundle.putString("EXTRA_OPTION_VARIANT", str2);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileAvatarBottomSheet.class, bundle, 5007, 0, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        switch (i11) {
            case 5001:
                if (i12 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("extra_user_name");
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile != null) {
                        contactProfile.f42460z1 = stringExtra;
                        AbstractC23309i.m121068Iz(contactProfile.m40373K());
                    }
                    ContactProfile contactProfile2 = this.f79070R0;
                    if (contactProfile2 != null) {
                        contactProfile2.f42460z1 = stringExtra;
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_success));
                        break;
                    }
                }
                break;
            case 5002:
                m86330wM(i12, intent);
                break;
            case 5003:
                m86331xM(i12, intent);
                break;
            case 5004:
                if (i12 == -1 && intent != null) {
                    String m86352uM = m86352uM(intent);
                    this.f79089a2 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true);
                    if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                        String stringExtra2 = intent.getStringExtra("EXTRA_ERROR_MSG");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            m86315dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                            break;
                        } else {
                            m86315dj(stringExtra2, 3000);
                            break;
                        }
                    } else if (!TextUtils.isEmpty(m86352uM)) {
                        this.f79120v1 = m86352uM;
                        m86346XM(m86352uM);
                        break;
                    }
                }
                break;
            case 5005:
                if (i12 == -1 && intent != null) {
                    String m86354vM = m86354vM(intent);
                    this.f79089a2 = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true);
                    if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                        String stringExtra3 = intent.getStringExtra("EXTRA_ERROR_MSG");
                        if (TextUtils.isEmpty(stringExtra3)) {
                            m86315dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                            break;
                        } else {
                            m86315dj(stringExtra3, 3000);
                            break;
                        }
                    } else if (!TextUtils.isEmpty(m86354vM)) {
                        this.f79120v1 = m86354vM;
                        m86346XM(m86354vM);
                        break;
                    }
                }
                break;
            case 5007:
                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                    m86336NM(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                    break;
                }
                break;
            case 5008:
                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                    m86337OM(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                    break;
                }
                break;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_retry_upload_avatar) {
                View view2 = this.f79119u1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                m86346XM(this.f79120v1);
                return;
            }
            if (id2 == AbstractC6918a0.imv_avatar_oa) {
                ContactProfile contactProfile = this.f79070R0;
                if (contactProfile != null) {
                    if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                        m86351mw(CoreUtility.f89233i, EnumC24904a.f119496r.m129507c());
                        return;
                    } else {
                        m86328sM(0);
                        return;
                    }
                }
                return;
            }
            C17487o0 c17487o0 = null;
            if (id2 == AbstractC6918a0.profile_header_username_layout) {
                if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35579p() != null) {
                    this.f72421L0.m92676n2().mo35579p().m93069k2(IntroUsernameView.class, null, 1, true);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.btn_edit_bio) {
                if (this.f79070R0.f42434r.equals(CoreUtility.f89233i)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("update", true);
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(UpdateUserInfoZView.class, bundle, 1005, 1, true);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(this.f79070R0.f42434r)) {
                    ContactProfile contactProfile2 = new ContactProfile(this.f79070R0.f42434r);
                    contactProfile2.f42437s = this.f79117s1;
                    contactProfile2.f42446v = this.f79112n1;
                    contactProfile2.f42458z = this.f79070R0.f42458z;
                    Intent intent = new Intent();
                    Bundle m140776b = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                    m140776b.putString("SOURCE_ACTION", "7802");
                    intent.putExtras(m140776b);
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.imv_cover) {
                ContactProfile contactProfile3 = this.f79070R0;
                if (contactProfile3 != null) {
                    if (contactProfile3.f42434r.equals(CoreUtility.f89233i)) {
                        m86353uf(EnumC25467a.f122043q.m131933c());
                        return;
                    } else {
                        m86328sM(1);
                        return;
                    }
                }
                return;
            }
            if (id2 == AbstractC6918a0.btn_edit_ba) {
                m86329tM();
                C0815e1.m2075D().m2099U(3, 2, 44, "1", "0", "6");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && !this.f77813M0) {
            InterfaceC15314f interfaceC15314f = this.f79123y1;
            if (interfaceC15314f != null) {
                interfaceC15314f.mo82208b0(this.f79124z1);
            }
            this.f72421L0.finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 111) {
            try {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118179t()) == 0) {
                    m86343UM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m86339QM();
        C23744a.m124114c().m124115b(this, 5400);
        C23744a.m124114c().m124115b(this, 6075);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: qG */
    public View mo62819qG() {
        return this.f79066P0;
    }

    /* renamed from: uM */
    String m86352uM(Intent intent) {
        if (intent != null) {
            try {
                if (intent.hasExtra("extra_result_camera_log")) {
                    this.f79093c2 = intent.getStringExtra("extra_result_camera_log");
                }
                if (intent.hasExtra("extra_result_output_path")) {
                    return intent.getStringExtra("extra_result_output_path");
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
        return "";
    }

    /* renamed from: uf */
    public void m86353uf(String str) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_OPTION_VARIANT", str);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileCoverBottomSheet.class, bundle, 5008, 0, true);
        }
    }

    /* renamed from: vM */
    String m86354vM(Intent intent) {
        MediaItem mediaItem;
        if (intent != null) {
            try {
                List m71440ZM = GalleryPickerView.m71440ZM(intent);
                if (m71440ZM != null && m71440ZM.size() > 0 && (mediaItem = (MediaItem) m71440ZM.get(0)) != null) {
                    this.f79093c2 = mediaItem.m41175w();
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        return mediaItem.m41113N();
                    }
                    return mediaItem.mo41081Q();
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 5400) {
                if (i11 != 6075) {
                    boolean z11 = false;
                    if (i11 != 15000) {
                        if (i11 == 15001) {
                            String str = "";
                            if (objArr.length > 0) {
                                Object obj = objArr[0];
                                if (obj instanceof String) {
                                    str = (String) obj;
                                }
                            }
                            if (objArr.length > 1) {
                                Object obj2 = objArr[1];
                                if (obj2 instanceof Boolean) {
                                    z11 = ((Boolean) obj2).booleanValue();
                                }
                            }
                            m86313bN(str, z11);
                            return;
                        }
                        return;
                    }
                    if (objArr.length > 0) {
                        Object obj3 = objArr[0];
                        if (obj3 instanceof String) {
                            this.f79120v1 = (String) obj3;
                        }
                    }
                    m86312aN();
                    return;
                }
                m86335MM();
                return;
            }
            mo70710wy(new f11(this));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        int i11 = AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
        int dimensionPixelSize = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material);
        if (!AbstractC32226c.m155415n(m92676n2())) {
            i11 = 0;
        }
        this.f79102h1 = dimensionPixelSize + i11;
        this.f79104i1 = 0;
        if (this.f72421L0.m92650VI() != null) {
            if ((this.f72421L0.m92650VI() instanceof MyInfoView) || (this.f72421L0.m92650VI() instanceof UserDetailsView)) {
                this.f79123y1 = (InterfaceC15314f) this.f72421L0.m92650VI();
            }
        }
    }
}
