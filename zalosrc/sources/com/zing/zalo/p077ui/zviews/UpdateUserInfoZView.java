package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0852x;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import bn.C2874g1;
import bn.C2880i1;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBottomSheet;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoZView;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.AbstractC17461b;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import fo0.C19092c;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractC20276f;
import is.AbstractC20826v0;
import is.C20834z0;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23059e9;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.AbstractC23211s7;
import me0.AbstractC23216t1;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p140ev.C18620i;
import p172fy.C19171b;
import p239ih.C20551a;
import p262jb.AbstractC21196a;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p427pq.EnumC24904a;
import p458qr.C25487t;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p555uq.C27357a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pd0.C24730d;
import pd0.C24732f;
import pd0.EnumC24733g;
import ui0.C27280g;
import vg.C28203u6;
import x60.C29395h;

/* loaded from: classes6.dex */
public class UpdateUserInfoZView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: L1 */
    protected static final String f78917L1 = "UpdateUserInfoZView";

    /* renamed from: C1 */
    private C27357a f78920C1;

    /* renamed from: D1 */
    private C16572d1 f78921D1;

    /* renamed from: E1 */
    View f78922E1;

    /* renamed from: J1 */
    File f78927J1;

    /* renamed from: P0 */
    RecyclingImageView f78929P0;

    /* renamed from: Q0 */
    View f78930Q0;

    /* renamed from: R0 */
    Button f78931R0;

    /* renamed from: S0 */
    ImageButton f78932S0;

    /* renamed from: T0 */
    EditText f78933T0;

    /* renamed from: U0 */
    View f78934U0;

    /* renamed from: V0 */
    TextView f78935V0;

    /* renamed from: W0 */
    TextView f78936W0;

    /* renamed from: X0 */
    TextView f78937X0;

    /* renamed from: Y0 */
    RadioButton f78938Y0;

    /* renamed from: Z0 */
    RadioButton f78939Z0;

    /* renamed from: b1 */
    private Drawable f78941b1;

    /* renamed from: c1 */
    C23528a f78942c1;

    /* renamed from: d1 */
    View f78943d1;

    /* renamed from: o1 */
    File f78954o1;

    /* renamed from: q1 */
    int f78956q1;

    /* renamed from: r1 */
    int f78957r1;

    /* renamed from: s1 */
    int f78958s1;

    /* renamed from: t1 */
    int f78959t1;

    /* renamed from: u1 */
    RelativeLayout f78960u1;

    /* renamed from: v1 */
    RobotoTextView f78961v1;

    /* renamed from: w1 */
    ImageButton f78962w1;

    /* renamed from: x1 */
    RobotoTextView f78963x1;

    /* renamed from: y1 */
    String f78964y1;

    /* renamed from: a1 */
    boolean f78940a1 = false;

    /* renamed from: e1 */
    boolean f78944e1 = false;

    /* renamed from: f1 */
    boolean f78945f1 = false;

    /* renamed from: g1 */
    boolean f78946g1 = false;

    /* renamed from: h1 */
    boolean f78947h1 = false;

    /* renamed from: i1 */
    boolean f78948i1 = false;

    /* renamed from: j1 */
    boolean f78949j1 = false;

    /* renamed from: k1 */
    boolean f78950k1 = false;

    /* renamed from: l1 */
    boolean f78951l1 = false;

    /* renamed from: m1 */
    String f78952m1 = "";

    /* renamed from: n1 */
    String f78953n1 = "";

    /* renamed from: p1 */
    boolean f78955p1 = false;

    /* renamed from: z1 */
    String f78965z1 = "";

    /* renamed from: A1 */
    private String f78918A1 = null;

    /* renamed from: B1 */
    private Snackbar f78919B1 = null;

    /* renamed from: F1 */
    C2874g1.b f78923F1 = new C2874g1.b() { // from class: com.zing.zalo.ui.zviews.rz0
        public /* synthetic */ rz0() {
        }

        @Override // bn.C2874g1.b
        /* renamed from: a */
        public final void mo13802a(int i11) {
            UpdateUserInfoZView.this.m86047JM(i11);
        }
    };

    /* renamed from: G1 */
    InterfaceC0765j f78924G1 = new C0766k();

    /* renamed from: H1 */
    boolean f78925H1 = false;

    /* renamed from: I1 */
    InterfaceC20094a f78926I1 = new C15288c();

    /* renamed from: K1 */
    AbstractC17461b.a f78928K1 = new C15292g();

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$a */
    /* loaded from: classes6.dex */
    public class C15286a extends AbstractC18391a {
        C15286a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            UpdateUserInfoZView.this.m86093fN();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$b */
    /* loaded from: classes6.dex */
    public class C15287b implements InterfaceC20094a {
        C15287b() {
        }

        /* renamed from: f */
        public /* synthetic */ void m86109f() {
            String str = UpdateUserInfoZView.this.f78952m1;
            if (str != null && AbstractC23041d2.m118194A(str)) {
                UpdateUserInfoZView updateUserInfoZView = UpdateUserInfoZView.this;
                updateUserInfoZView.m86091dN(updateUserInfoZView.f78952m1);
            }
        }

        /* renamed from: g */
        public /* synthetic */ void m86110g() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isIgnoreUpdatePassword", true);
                bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                UpdateUserInfoZView.this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m86111h(String str) {
            if (!TextUtils.isEmpty(str)) {
                UpdateUserInfoZView.this.m86088aN(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    UpdateUserInfoZView.this.m86084WM(false);
                    AbstractC23126l.m118627a("do UpdateAccount failed");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (AbstractC23216t1.m119643h(UpdateUserInfoZView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.a01
                    public /* synthetic */ a01() {
                    }

                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        UpdateUserInfoZView.C15287b.this.m86111h(str);
                    }
                })) {
                    return;
                }
                UpdateUserInfoZView.this.m86088aN(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                AbstractC2379w.m12430d(UpdateUserInfoZView.this.f78933T0);
            } finally {
                UpdateUserInfoZView.this.f78925H1 = false;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:(14:8|9|10|11|(1:13)|14|(2:16|(1:18))|19|(5:21|(1:23)|24|(1:32)|(1:34))(1:54)|35|(2:37|(2:39|(1:41)))(5:47|(1:49)|50|(1:52)|53)|42|43|44)|10|11|(0)|14|(0)|19|(0)(0)|35|(0)(0)|42|43|44|(2:(1:58)|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x004a, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:            r0.printStackTrace();     */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[Catch: all -> 0x0047, Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:11:0x0032, B:13:0x0038, B:14:0x004d, B:16:0x0051, B:18:0x005d, B:19:0x0066, B:21:0x006b, B:23:0x00a6, B:24:0x00aa, B:26:0x00b7, B:28:0x00bf, B:30:0x00cb, B:32:0x00d1, B:34:0x00dc, B:35:0x00ea, B:37:0x00f0, B:39:0x010c, B:41:0x011b, B:42:0x0153, B:47:0x012c, B:49:0x0136, B:50:0x013b, B:52:0x0149, B:53:0x014c), top: B:10:0x0032, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0047, Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:11:0x0032, B:13:0x0038, B:14:0x004d, B:16:0x0051, B:18:0x005d, B:19:0x0066, B:21:0x006b, B:23:0x00a6, B:24:0x00aa, B:26:0x00b7, B:28:0x00bf, B:30:0x00cb, B:32:0x00d1, B:34:0x00dc, B:35:0x00ea, B:37:0x00f0, B:39:0x010c, B:41:0x011b, B:42:0x0153, B:47:0x012c, B:49:0x0136, B:50:0x013b, B:52:0x0149, B:53:0x014c), top: B:10:0x0032, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x0047, Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:11:0x0032, B:13:0x0038, B:14:0x004d, B:16:0x0051, B:18:0x005d, B:19:0x0066, B:21:0x006b, B:23:0x00a6, B:24:0x00aa, B:26:0x00b7, B:28:0x00bf, B:30:0x00cb, B:32:0x00d1, B:34:0x00dc, B:35:0x00ea, B:37:0x00f0, B:39:0x010c, B:41:0x011b, B:42:0x0153, B:47:0x012c, B:49:0x0136, B:50:0x013b, B:52:0x0149, B:53:0x014c), top: B:10:0x0032, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[Catch: all -> 0x0047, Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:11:0x0032, B:13:0x0038, B:14:0x004d, B:16:0x0051, B:18:0x005d, B:19:0x0066, B:21:0x006b, B:23:0x00a6, B:24:0x00aa, B:26:0x00b7, B:28:0x00bf, B:30:0x00cb, B:32:0x00d1, B:34:0x00dc, B:35:0x00ea, B:37:0x00f0, B:39:0x010c, B:41:0x011b, B:42:0x0153, B:47:0x012c, B:49:0x0136, B:50:0x013b, B:52:0x0149, B:53:0x014c), top: B:10:0x0032, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012c A[Catch: all -> 0x0047, Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:11:0x0032, B:13:0x0038, B:14:0x004d, B:16:0x0051, B:18:0x005d, B:19:0x0066, B:21:0x006b, B:23:0x00a6, B:24:0x00aa, B:26:0x00b7, B:28:0x00bf, B:30:0x00cb, B:32:0x00d1, B:34:0x00dc, B:35:0x00ea, B:37:0x00f0, B:39:0x010c, B:41:0x011b, B:42:0x0153, B:47:0x012c, B:49:0x0136, B:50:0x013b, B:52:0x0149, B:53:0x014c), top: B:10:0x0032, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            double d11;
            UpdateUserInfoZView updateUserInfoZView;
            boolean z11;
            UpdateUserInfoZView updateUserInfoZView2;
            JSONObject jSONObject;
            try {
                jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (!jSONObject.isNull("update_status")) {
                    AbstractC23309i.m122037iz(jSONObject.getJSONObject("update_status").toString());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                if (jSONObject.has("name_score")) {
                    d11 = jSONObject.optDouble("name_score", -2.147483648E9d);
                    updateUserInfoZView = UpdateUserInfoZView.this;
                    if (!updateUserInfoZView.f78950k1) {
                        updateUserInfoZView.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.b01
                            public /* synthetic */ b01() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateUserInfoZView.C15287b.this.m86109f();
                            }
                        });
                    }
                    if (AbstractC23304d.f113368c0 == null) {
                        ContactProfile m141809c = C28203u6.f131407a.m141809c(CoreUtility.f89233i);
                        AbstractC23304d.f113368c0 = m141809c;
                        if (m141809c == null) {
                            AbstractC23304d.f113368c0 = new ContactProfile(CoreUtility.f89233i);
                        }
                    }
                    if (AbstractC23304d.f113373d0 == null) {
                        z11 = !AbstractC23304d.f113368c0.f42437s.equals(AbstractC23304d.f113373d0.f42437s);
                        AbstractC23304d.f113368c0.f42437s = AbstractC23304d.f113373d0.f42437s;
                        AbstractC23304d.f113368c0.f42449w = AbstractC23304d.f113373d0.f42449w;
                        AbstractC23304d.f113368c0.f42452x = AbstractC23304d.f113373d0.f42452x;
                        AbstractC23304d.f113368c0.f42400b0 = UpdateUserInfoZView.this.m86072tM(AbstractC23304d.f113373d0.f42452x, AbstractC23304d.f113368c0.f42400b0);
                        if (d11 != -2.147483648E9d) {
                            AbstractC23304d.f113368c0.f42357M = d11;
                        }
                        AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
                        ContactProfile contactProfile = AbstractC23304d.f113368c0;
                        if (contactProfile != null && contactProfile.f42434r.length() > 0 && !AbstractC23304d.f113368c0.f42434r.equalsIgnoreCase("null") && C7960e.m41971c6() != null) {
                            C7960e.m41971c6().m42221O7(AbstractC23304d.f113368c0, false);
                        }
                        if (z11) {
                            C20834z0.f102412a.m108925d(true);
                            C25487t.f122084a.m132028c(C25487t.a.f122102z);
                        }
                    } else {
                        z11 = false;
                    }
                    updateUserInfoZView2 = UpdateUserInfoZView.this;
                    if (!updateUserInfoZView2.f78945f1) {
                        String str = UpdateUserInfoZView.f78917L1;
                        AbstractC0852x.m2333J();
                        AbstractC0852x.m2338O(new SensitiveData("phonebook_sync_scan_on_update_profile_info", "phonebook_sync"));
                        UpdateUserInfoZView.this.m86084WM(false);
                        if (UpdateUserInfoZView.this.f78949j1) {
                            AbstractC23304d.f113346X0 = 0;
                            AbstractC23309i.m122550wp(0);
                            if (UpdateUserInfoZView.this.f72421L0.m92676n2() != null) {
                                UpdateUserInfoZView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.c01
                                    public /* synthetic */ c01() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        UpdateUserInfoZView.C15287b.this.m86110g();
                                    }
                                });
                            }
                        }
                    } else {
                        updateUserInfoZView2.m86084WM(false);
                        Intent intent = new Intent();
                        if (z11) {
                            intent.putExtra("extra_dpn_changed", true);
                        }
                        UpdateUserInfoZView.this.f72421L0.mo50035CK(-1, intent);
                        UpdateUserInfoZView updateUserInfoZView3 = UpdateUserInfoZView.this;
                        if (updateUserInfoZView3.f78951l1) {
                            updateUserInfoZView3.m86089bN();
                        }
                        UpdateUserInfoZView.this.f72421L0.finish();
                    }
                    AbstractC2379w.m12430d(UpdateUserInfoZView.this.f78933T0);
                    UpdateUserInfoZView.this.f78925H1 = false;
                    return;
                }
                updateUserInfoZView = UpdateUserInfoZView.this;
                if (!updateUserInfoZView.f78950k1) {
                }
                if (AbstractC23304d.f113368c0 == null) {
                }
                if (AbstractC23304d.f113373d0 == null) {
                }
                updateUserInfoZView2 = UpdateUserInfoZView.this;
                if (!updateUserInfoZView2.f78945f1) {
                }
                AbstractC2379w.m12430d(UpdateUserInfoZView.this.f78933T0);
                UpdateUserInfoZView.this.f78925H1 = false;
                return;
            } catch (Throwable th2) {
                UpdateUserInfoZView.this.f78925H1 = false;
                throw th2;
            }
            d11 = -2.147483648E9d;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$c */
    /* loaded from: classes6.dex */
    public class C15288c implements InterfaceC20094a {
        C15288c() {
        }

        /* renamed from: e */
        public /* synthetic */ void m86114e() {
            try {
                if (UpdateUserInfoZView.this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
                }
                UpdateUserInfoZView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public static /* synthetic */ void m86115f() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_deniedAvtgallery));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (UpdateUserInfoZView.this.f72421L0.m92674mJ() && !UpdateUserInfoZView.this.f72421L0.m92677nJ()) {
                    UpdateUserInfoZView.this.f72421L0.mo49315c4();
                    UpdateUserInfoZView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.d01
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateUserInfoZView.C15288c.m86115f();
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
                if (UpdateUserInfoZView.this.f72421L0.m92674mJ() && !UpdateUserInfoZView.this.f72421L0.m92677nJ()) {
                    UpdateUserInfoZView.this.f72421L0.mo49315c4();
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        String optString = jSONObject.optJSONObject("data").optString("org", "");
                        ContactProfile contactProfile = AbstractC23304d.f113368c0;
                        contactProfile.f42446v = optString;
                        contactProfile.f42323A1 = optString;
                        AbstractC23309i.m121068Iz(contactProfile.m40373K());
                        UpdateUserInfoZView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.e01
                            public /* synthetic */ e01() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateUserInfoZView.C15288c.this.m86114e();
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$d */
    /* loaded from: classes6.dex */
    public class C15289d extends AbstractC18391a {
        C15289d() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            UpdateUserInfoZView updateUserInfoZView = UpdateUserInfoZView.this;
            if (!TextUtils.isEmpty(editable) && !editable.toString().equals(AbstractC23304d.f113368c0.f42437s)) {
                z11 = true;
            } else {
                z11 = false;
            }
            updateUserInfoZView.f78955p1 = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$e */
    /* loaded from: classes6.dex */
    public class C15290e extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f78970l1;

        C15290e(String str) {
            this.f78970l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                UpdateUserInfoZView.this.f78929P0.setImageInfo(c3979l);
                File m123603i = UpdateUserInfoZView.this.f78942c1.m123603i(this.f78970l1);
                UpdateUserInfoZView.this.f78954o1 = new File(m123603i.getAbsolutePath() + ".jpg");
                AbstractC23238v2.m119717b(m123603i, UpdateUserInfoZView.this.f78954o1);
                UpdateUserInfoZView updateUserInfoZView = UpdateUserInfoZView.this;
                updateUserInfoZView.f78952m1 = updateUserInfoZView.f78954o1.getAbsolutePath();
                View view = UpdateUserInfoZView.this.f78930Q0;
                if (view != null) {
                    view.setVisibility(8);
                }
            } catch (IOException e11) {
                View view2 = UpdateUserInfoZView.this.f78930Q0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                AbstractC23350e.m122776f("", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$f */
    /* loaded from: classes6.dex */
    public class C15291f extends C23999j {
        C15291f() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        UpdateUserInfoZView.this.f78929P0.setImageInfo(c3979l);
                        View view = UpdateUserInfoZView.this.f78930Q0;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoZView$g */
    /* loaded from: classes6.dex */
    class C15292g implements AbstractC17461b.a {
        C15292g() {
        }

        @Override // com.zing.zalo.zview.dialog.AbstractC17461b.a
        /* renamed from: a */
        public void mo86116a(DatePicker datePicker, int i11, int i12, int i13) {
            AbstractC23647d.m123906p("19512");
            UpdateUserInfoZView updateUserInfoZView = UpdateUserInfoZView.this;
            updateUserInfoZView.f78955p1 = true;
            if (i11 < 1935) {
                updateUserInfoZView.f78956q1 = 1935;
            } else {
                updateUserInfoZView.f78956q1 = i11;
            }
            updateUserInfoZView.f78957r1 = i12 + 1;
            updateUserInfoZView.f78958s1 = i13;
            updateUserInfoZView.m86094gN();
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: CM */
    private void m86043CM() {
        Snackbar snackbar = this.f78919B1;
        if (snackbar != null && snackbar.m90661t()) {
            this.f78919B1.m90655n();
            this.f78919B1 = null;
        }
    }

    /* renamed from: GM */
    public /* synthetic */ void m86044GM() {
        m86091dN(this.f78952m1);
    }

    /* renamed from: HM */
    public /* synthetic */ void m86045HM(CompoundButton compoundButton, boolean z11) {
        this.f78955p1 = true;
        AbstractC23647d.m123906p("19508");
        this.f78938Y0.setChecked(z11);
        this.f78939Z0.setChecked(true ^ z11);
        AbstractC23647d.m123893c();
    }

    /* renamed from: IM */
    public /* synthetic */ void m86046IM(CompoundButton compoundButton, boolean z11) {
        this.f78955p1 = true;
        AbstractC23647d.m123906p("19509");
        this.f78939Z0.setChecked(z11);
        this.f78938Y0.setChecked(true ^ z11);
        AbstractC23647d.m123893c();
    }

    /* renamed from: JM */
    public /* synthetic */ void m86047JM(int i11) {
        try {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 6) {
                        m86080S6(CoreUtility.f89233i, 0, C32002l4.m154264g(10015));
                    }
                } else {
                    m86105zM();
                }
            } else {
                AbstractC23647d.m123907q("19502", "");
                m86097mD();
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public static /* synthetic */ void m86048KM(View view, View.OnFocusChangeListener onFocusChangeListener, View view2, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z11) {
            layoutParams.height = AbstractC23136l9.m118742r(2.0f);
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.SeparatorColor2));
        } else {
            layoutParams.height = 1;
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
        }
        view.setLayoutParams(layoutParams);
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view2, z11);
        }
    }

    /* renamed from: LM */
    public /* synthetic */ void m86049LM(String str) {
        if (this.f78937X0 != null && !TextUtils.isEmpty(str)) {
            this.f78937X0.setText(str);
            this.f78937X0.setVisibility(0);
        }
    }

    /* renamed from: MM */
    public /* synthetic */ void m86050MM(String str, int i11) {
        m86043CM();
        this.f78919B1 = AbstractC20826v0.m108786T0(this.f78943d1, str, i11);
    }

    /* renamed from: NM */
    public /* synthetic */ void m86051NM() {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, C32002l4.m154264g(10015)).m135767z(true).m135743b(), 0, 1));
    }

    /* renamed from: OM */
    public /* synthetic */ void m86052OM(String str, boolean z11) {
        try {
            View view = this.f78930Q0;
            if (view != null) {
                view.setVisibility(0);
            }
            ImageButton imageButton = this.f78932S0;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            this.f78952m1 = str;
            m86096lN(str, z11);
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67701oN();
            }
            if (this.f78940a1) {
                this.f78940a1 = false;
                this.f72421L0.mo50035CK(-1, new Intent());
                if (this.f78951l1) {
                    m86089bN();
                }
                this.f72421L0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    public /* synthetic */ void m86053PM(String str, boolean z11) {
        m86060iN();
        if (!TextUtils.isEmpty(str) && !z11) {
            m86056dj(str, 3000);
        }
    }

    /* renamed from: RM */
    private void m86054RM(int i11) {
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 == 7) {
                        AbstractC23152n3.m119040e0(m92676n2(), this, C18620i.f93672O);
                        return;
                    }
                    return;
                }
                m86080S6(CoreUtility.f89233i, 0, C32002l4.m154264g(10015));
                return;
            }
            m86105zM();
            return;
        }
        m86097mD();
    }

    /* renamed from: VM */
    private void m86055VM() {
        C23744a.m124114c().m124117e(this, 15000);
        C23744a.m124114c().m124117e(this, 15001);
    }

    /* renamed from: dj */
    private void m86056dj(String str, int i11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yz0

                /* renamed from: q */
                public final /* synthetic */ String f82788q;

                /* renamed from: r */
                public final /* synthetic */ int f82789r;

                public /* synthetic */ yz0(String str2, int i112) {
                    r2 = str2;
                    r3 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateUserInfoZView.this.m86050MM(r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iN */
    private void m86060iN() {
        try {
            if (C24730d.m128465h().m128473g(CoreUtility.f89233i) != null) {
                View view = this.f78930Q0;
                if (view != null) {
                    view.setVisibility(8);
                }
                ImageButton imageButton = this.f78932S0;
                if (imageButton != null) {
                    imageButton.setVisibility(0);
                    return;
                }
                return;
            }
            View view2 = this.f78930Q0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ImageButton imageButton2 = this.f78932S0;
            if (imageButton2 != null) {
                imageButton2.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: jN */
    private void m86062jN(String str, boolean z11) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.wz0

            /* renamed from: q */
            public final /* synthetic */ String f82575q;

            /* renamed from: r */
            public final /* synthetic */ boolean f82576r;

            public /* synthetic */ wz0(String str2, boolean z112) {
                r2 = str2;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateUserInfoZView.this.m86052OM(r2, r3);
            }
        });
    }

    /* renamed from: kN */
    private void m86064kN(String str, boolean z11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.xz0

                /* renamed from: q */
                public final /* synthetic */ String f82683q;

                /* renamed from: r */
                public final /* synthetic */ boolean f82684r;

                public /* synthetic */ xz0(String str2, boolean z112) {
                    r2 = str2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateUserInfoZView.this.m86053PM(r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    private void m86071rM() {
        C23744a.m124114c().m124115b(this, 15000);
        C23744a.m124114c().m124115b(this, 15001);
    }

    /* renamed from: tM */
    public long m86072tM(String str, long j11) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (TextUtils.isEmpty(str)) {
            return j11;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        Date parse = simpleDateFormat.parse(str);
        if (parse != null) {
            return parse.getTime() / 1000;
        }
        return j11;
    }

    /* renamed from: AM */
    void m86073AM(Uri uri) {
        if (uri != null) {
            try {
                m86081SM(AbstractC23280z4.m120351s(uri));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: BM */
    void m86074BM(int i11, Intent intent) {
        MediaItem mediaItem;
        String str = "";
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        m86056dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                        return;
                    } else {
                        m86056dj(stringExtra, 3000);
                        return;
                    }
                }
                List m71440ZM = GalleryPickerView.m71440ZM(intent);
                if (m71440ZM != null && m71440ZM.size() > 0 && (mediaItem = (MediaItem) m71440ZM.get(0)) != null) {
                    this.f78953n1 = "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        str = mediaItem.m41113N();
                    } else if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                        str = mediaItem.mo41081Q();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m86085XM(str);
                        if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                            this.f78953n1 = mediaItem.m41175w();
                        }
                        File file = this.f78954o1;
                        if (file != null && file.exists()) {
                            this.f78954o1.delete();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:22|23|(27:25|(1:27)|28|(1:30)|31|(1:33)|34|35|36|(1:38)|40|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|65)|68|28|(0)|31|(0)|34|35|36|(0)|40|(0)|43|(0)|46|(0)|49|(0)|52|(0)|55|(0)|58|(0)|61|(0)|65) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #0 {Exception -> 0x0136, blocks: (B:36:0x0118, B:38:0x011e), top: B:35:0x0118, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145 A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167 A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4 A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7 A[Catch: Exception -> 0x00e2, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d0 A[Catch: Exception -> 0x00e2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e2, blocks: (B:23:0x00d6, B:25:0x00da, B:28:0x00e9, B:30:0x00ed, B:31:0x00ef, B:33:0x00f3, B:34:0x00f5, B:40:0x013a, B:42:0x0145, B:43:0x014a, B:45:0x0154, B:46:0x015d, B:48:0x0167, B:49:0x0170, B:51:0x017a, B:52:0x0183, B:54:0x018e, B:55:0x019a, B:57:0x01a4, B:58:0x01b0, B:60:0x01b7, B:61:0x01c9, B:63:0x01d0, B:67:0x0137, B:68:0x00e5, B:36:0x0118, B:38:0x011e), top: B:22:0x00d6, inners: #0 }] */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C29395h c29395h;
        View m92864h;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        FrameLayout frameLayout;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        Button m92826L;
        Button m92826L2;
        if (i11 != 0) {
            if (i11 != 3) {
                switch (i11) {
                    case 9:
                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                        aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_submit_change)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                        return aVar.m43152a();
                    case 10:
                        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar2.m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_exit)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                        return aVar2.m43152a();
                    case 11:
                        try {
                            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                            aVar3.m43159h(4);
                            aVar3.m43155d(true);
                            aVar3.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_start_create_username));
                            aVar3.m43169r(AbstractC8020f0.str_yes, this);
                            aVar3.m43164m(AbstractC8020f0.str_no, this);
                            return aVar3.m43152a();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            break;
                        }
                }
                return super.mo39014DJ(i11);
            }
            return new C2874g1.a(this.f72421L0.m92676n2()).m13812j(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_changeavt_dialog_title)).m13811i(C2880i1.m13834b(m92689tK(), true ^ C23302b.f113247a.m120523d(AbstractC23304d.f113368c0.f42446v))).m13809g(this.f78923F1).m13806c();
        }
        try {
            int i12 = this.f78956q1;
            if (i12 > 0) {
                if (this.f78959t1 - i12 > 100) {
                }
                if (this.f78957r1 <= 0) {
                    this.f78957r1 = 1;
                }
                if (this.f78958s1 <= 0) {
                    this.f78958s1 = 1;
                }
                Context m92648SI = this.f72421L0.m92648SI();
                c29395h = new C29395h(m92648SI, AbstractC8915g0.DatePickerTheme, this.f78928K1, this.f78956q1, this.f78957r1 - 1, this.f78958s1, true);
                c29395h.mo43148J(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_dateofbirth_hint_new));
                if (c29395h.m92845Q() != null) {
                    c29395h.m92845Q().setMaxDate(System.currentTimeMillis() - 1000);
                    c29395h.m92845Q().setDescendantFocusability(393216);
                }
                c29395h.mo13822K();
                m92864h = c29395h.m92864h(AbstractC17468f.titleDivider);
                if (m92864h != null) {
                    m92864h.setVisibility(8);
                }
                linearLayout = (LinearLayout) c29395h.m92864h(AbstractC6918a0.topPanel);
                if (linearLayout != null) {
                    linearLayout.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                }
                linearLayout2 = (LinearLayout) c29395h.m92864h(AbstractC6918a0.contentPanel);
                if (linearLayout2 != null) {
                    linearLayout2.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                }
                frameLayout = (FrameLayout) c29395h.m92864h(AbstractC6918a0.customPanel);
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                }
                linearLayout3 = (LinearLayout) c29395h.m92864h(AbstractC6918a0.buttonPanel);
                if (linearLayout3 != null) {
                    linearLayout3.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                    linearLayout3.setShowDividers(0);
                }
                linearLayout4 = (LinearLayout) c29395h.m92864h(AbstractC17468f.buttonBars);
                if (linearLayout4 != null) {
                    linearLayout4.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                    linearLayout4.setShowDividers(0);
                }
                m92826L = c29395h.m92826L(-1);
                if (m92826L != null) {
                    m92826L.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                    m92826L.setTextColor(C23212s8.m119607o(m92648SI, AbstractC21196a.TextColor1));
                }
                m92826L2 = c29395h.m92826L(-2);
                if (m92826L2 != null) {
                    m92826L2.setBackgroundColor(C23212s8.m119607o(m92648SI, AbstractC16781w.PopupBackgroundColor));
                    m92826L2.setTextColor(C23212s8.m119607o(m92648SI, AbstractC21196a.TextColor1));
                }
                return c29395h;
            }
            this.f78956q1 = 1980;
            if (this.f78957r1 <= 0) {
            }
            if (this.f78958s1 <= 0) {
            }
            Context m92648SI2 = this.f72421L0.m92648SI();
            c29395h = new C29395h(m92648SI2, AbstractC8915g0.DatePickerTheme, this.f78928K1, this.f78956q1, this.f78957r1 - 1, this.f78958s1, true);
            c29395h.mo43148J(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_dateofbirth_hint_new));
            if (c29395h.m92845Q() != null) {
            }
            c29395h.mo13822K();
            m92864h = c29395h.m92864h(AbstractC17468f.titleDivider);
            if (m92864h != null) {
            }
            linearLayout = (LinearLayout) c29395h.m92864h(AbstractC6918a0.topPanel);
            if (linearLayout != null) {
            }
            linearLayout2 = (LinearLayout) c29395h.m92864h(AbstractC6918a0.contentPanel);
            if (linearLayout2 != null) {
            }
            frameLayout = (FrameLayout) c29395h.m92864h(AbstractC6918a0.customPanel);
            if (frameLayout != null) {
            }
            linearLayout3 = (LinearLayout) c29395h.m92864h(AbstractC6918a0.buttonPanel);
            if (linearLayout3 != null) {
            }
            linearLayout4 = (LinearLayout) c29395h.m92864h(AbstractC17468f.buttonBars);
            if (linearLayout4 != null) {
            }
            m92826L = c29395h.m92826L(-1);
            if (m92826L != null) {
            }
            m92826L2 = c29395h.m92826L(-2);
            if (m92826L2 != null) {
            }
            return c29395h;
        } catch (Exception e12) {
            e12.printStackTrace();
            return super.mo39014DJ(i11);
        }
    }

    /* renamed from: DM */
    void m86075DM() {
        if (this.f78941b1 == null) {
            this.f78941b1 = C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar);
        }
        if (this.f78945f1) {
            AbstractC23304d.f113358a0 = true;
        }
        m86078QM();
        m86093fN();
    }

    /* renamed from: EM */
    void m86076EM() {
        int i11;
        String str;
        if (AbstractC23304d.f113368c0 == null) {
            AbstractC23304d.f113368c0 = new ContactProfile();
        }
        try {
            Button button = (Button) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.btn_done);
            this.f78931R0 = button;
            button.setOnClickListener(this);
            EditText editText = (EditText) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.first_name);
            this.f78933T0 = editText;
            editText.setOnClickListener(this);
            this.f78933T0.addTextChangedListener(new C15286a());
            EditText editText2 = this.f78933T0;
            editText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C27280g.m139660c(editText2.getContext(), AbstractC23322a.zds_ic_edit_text_line_24, AbstractC21196a.TextColor1), (Drawable) null);
            this.f78921D1 = new C16572d1(this.f78933T0, false, null);
            View findViewById = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.line_input);
            this.f78934U0 = findViewById;
            m86086YM(this.f78933T0, findViewById);
            TextView textView = (TextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tvError);
            this.f78937X0 = textView;
            textView.setVisibility(8);
            if (!this.f78950k1) {
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                if (!this.f78944e1) {
                    this.f88760a0.setBackButtonImage(0);
                } else {
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                }
                TextView textView2 = (TextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tvUpdateProfileHint);
                this.f78936W0 = textView2;
                if (this.f78946g1) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                TextView textView3 = (TextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.date_of_birth);
                this.f78935V0 = textView3;
                textView3.setOnClickListener(this);
                TextView textView4 = this.f78935V0;
                textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C27280g.m139660c(textView4.getContext(), AbstractC23322a.zds_ic_edit_text_line_24, AbstractC21196a.TextColor1), (Drawable) null);
                try {
                    this.f78959t1 = Calendar.getInstance().get(1);
                    if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42452x)) {
                        String[] split = AbstractC23304d.f113368c0.f42452x.split("/");
                        this.f78958s1 = Integer.parseInt(split[0]);
                        this.f78957r1 = Integer.parseInt(split[1]);
                        this.f78956q1 = Integer.parseInt(split[2]);
                    } else {
                        this.f78958s1 = 1;
                        this.f78957r1 = 1;
                        this.f78956q1 = 1980;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                m86094gN();
                RadioButton radioButton = (RadioButton) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.rbMale);
                this.f78938Y0 = radioButton;
                radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.uz0
                    public /* synthetic */ uz0() {
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        UpdateUserInfoZView.this.m86045HM(compoundButton, z11);
                    }
                });
                RadioButton radioButton2 = (RadioButton) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.rbFemale);
                this.f78939Z0 = radioButton2;
                radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.vz0
                    public /* synthetic */ vz0() {
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        UpdateUserInfoZView.this.m86046IM(compoundButton, z11);
                    }
                });
                View findViewById2 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.pbUploadAvatar);
                this.f78930Q0 = findViewById2;
                findViewById2.setVisibility(8);
                ImageButton imageButton = (ImageButton) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.btnRetryUploadAvatar);
                this.f78932S0 = imageButton;
                imageButton.setVisibility(8);
                this.f78932S0.setOnClickListener(this);
                RecyclingImageView recyclingImageView = (RecyclingImageView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.imvAvatar);
                this.f78929P0 = recyclingImageView;
                recyclingImageView.setOnClickListener(this);
                RelativeLayout relativeLayout = (RelativeLayout) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layout_username);
                this.f78960u1 = relativeLayout;
                if (this.f78947h1) {
                    i11 = AbstractC16801x.highlight_username;
                } else {
                    i11 = AbstractC16803z.stencils_comment_bg;
                }
                relativeLayout.setBackgroundResource(i11);
                this.f78960u1.setVisibility(8);
                this.f78961v1 = (RobotoTextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tv_username);
                this.f78962w1 = (ImageButton) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.icon_username);
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null) {
                    str = contactProfile.f42460z1;
                } else {
                    str = "";
                }
                this.f78965z1 = str;
                m86083UM();
                this.f78960u1.setOnClickListener(this);
                this.f78963x1 = (RobotoTextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tv_tooltips);
                if (!TextUtils.isEmpty(this.f78964y1)) {
                    this.f78963x1.setText(this.f78964y1);
                    this.f78963x1.setVisibility(0);
                } else {
                    this.f78963x1.setVisibility(8);
                }
                View findViewById3 = this.f78943d1.findViewById(AbstractC6918a0.ic_hint_update_avt);
                if (findViewById3 != null) {
                    AbstractC20276f.m105889b(findViewById3, 1000L);
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f78917L1, e12);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        ActionBar actionBar;
        super.mo37482FJ(actionBarMenu);
        try {
            if (!this.f78944e1 && (actionBar = this.f88760a0) != null) {
                actionBar.setBackButtonImage(0);
            }
            if (actionBarMenu.m92752u(AbstractC6918a0.menu_item_progress) == null) {
                this.f78922E1 = actionBarMenu.m92744k(AbstractC6918a0.menu_item_progress, AbstractC7409c0.holo_circular_progress_bar_abs);
            }
            this.f78922E1.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FM */
    boolean m86077FM() {
        if (this.f78949j1 && !AbstractC23309i.m121868eh()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        m92637BK(true);
        m86082TM();
        if (this.f78950k1) {
            i11 = AbstractC7409c0.update_short_user_info_zview;
        } else {
            i11 = AbstractC7409c0.update_user_info_zview;
        }
        View inflate = layoutInflater.inflate(i11, viewGroup, false);
        this.f78943d1 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f78946g1 = false;
        this.f78945f1 = false;
        this.f78944e1 = false;
        AbstractC23304d.f113358a0 = false;
        AbstractC23304d.f113426q0 = null;
        AbstractC23304d.f113434s0 = null;
        AbstractC23304d.f113430r0 = null;
        try {
            if (this.f78941b1 != null) {
                this.f78941b1 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AbstractC2379w.m12430d(this.f78933T0);
        m86055VM();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d == null) {
            return;
        }
        switch (interfaceC17463d.mo92862f()) {
            case 9:
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    m86095hN();
                    return;
                } else {
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        this.f72421L0.finish();
                        return;
                    }
                    return;
                }
            case 10:
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
                    AbstractC23126l.m118627a("Exit Zalo");
                    return;
                } else {
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    return;
                }
            case 11:
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    m86090cN();
                    return;
                } else {
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC2379w.m12430d(this.f78933T0);
            if (this.f78944e1) {
                if (this.f78948i1 && this.f78951l1) {
                    m86089bN();
                    this.f72421L0.finish();
                    return true;
                }
                if (this.f78955p1) {
                    m86099sM(9);
                    return true;
                }
                this.f72421L0.finish();
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: QM */
    void m86078QM() {
        ContactProfile contactProfile;
        try {
            if (this.f78945f1) {
                m86103xM(AbstractC23304d.f113426q0, AbstractC23304d.f113434s0);
                m86101vM(AbstractC23304d.f113430r0);
            } else if (this.f78944e1 && (contactProfile = AbstractC23304d.f113368c0) != null) {
                m86102wM(contactProfile.f42437s, contactProfile.f42449w);
                ((C23528a) this.f78942c1.m123612r(this.f78929P0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
            }
            C24732f m128473g = C24730d.m128465h().m128473g(CoreUtility.f89233i);
            if (m128473g != null) {
                if (m128473g.f118782d == EnumC24733g.UPLOADING) {
                    this.f78930Q0.setVisibility(0);
                    this.f78932S0.setVisibility(8);
                } else {
                    this.f78930Q0.setVisibility(8);
                    this.f78932S0.setVisibility(0);
                }
                this.f78952m1 = m128473g.f118779a;
                return;
            }
            this.f78930Q0.setVisibility(8);
            this.f78932S0.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S1 */
    void m86079S1() {
        TextView textView = this.f78937X0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: S6 */
    public void m86080S6(String str, int i11, C32002l4 c32002l4) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", str);
                bundle.putInt("extra_album_type", i11);
                bundle.putBoolean("extra_is_mode_pick_avatar", true);
                bundle.putBoolean("extra_bol_only_show_grid_photo", true);
                if (c32002l4 != null) {
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                m92662fJ.m93066i2(ProfileAlbumDetailView.class, bundle, 5003, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            File file = this.f78927J1;
            if (file != null) {
                bundle.putString("cameraImageUri", file.getPath());
            }
            bundle.putString("avata_path", this.f78952m1);
            bundle.putString("avatar_camera_log", this.f78953n1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    void m86081SM(String str) {
        try {
            if (C20551a.m106806a(str)) {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null && actionBar.getVisibility() == 0) {
                    this.f88760a0.setVisibility(8);
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 1005, 1, CameraInputParams.m39209u(str));
                    return;
                }
                return;
            }
            ToastUtils.m89273u();
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
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            if (!this.f78944e1) {
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_update_short_user_info));
                this.f88760a0.setBackButtonImage(0);
            } else {
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_titleBar3));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            }
        }
    }

    /* renamed from: TM */
    void m86082TM() {
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("update")) {
                    this.f78944e1 = m92642L3.getBoolean("update");
                }
                if (m92642L3.containsKey("fromVerifyCode")) {
                    this.f78945f1 = m92642L3.getBoolean("fromVerifyCode");
                }
                if (m92642L3.containsKey("isNewUser")) {
                    this.f78949j1 = m92642L3.getBoolean("isNewUser");
                }
                if (m92642L3.containsKey("showUpdateProfileHint")) {
                    this.f78946g1 = m92642L3.getBoolean("showUpdateProfileHint");
                }
                if (m92642L3.containsKey("extra_extra_highlight_username")) {
                    this.f78947h1 = m92642L3.getBoolean("extra_extra_highlight_username");
                }
                if (m92642L3.containsKey("extra_str_tool_tips")) {
                    this.f78964y1 = m92642L3.getString("extra_str_tool_tips");
                }
                if (m92642L3.containsKey("extra_need_from_action_list")) {
                    this.f78951l1 = m92642L3.getBoolean("extra_need_from_action_list");
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f78917L1, e11);
        }
    }

    /* renamed from: UM */
    void m86083UM() {
        String m118743r0;
        try {
            if (AbstractC23309i.m122577xf() && !m86077FM()) {
                boolean z11 = !TextUtils.isEmpty(this.f78965z1);
                this.f78962w1.setVisibility(8);
                this.f78960u1.setEnabled(!z11);
                RobotoTextView robotoTextView = this.f78961v1;
                if (z11) {
                    m118743r0 = this.f78965z1;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_your_username);
                }
                robotoTextView.setText(m118743r0);
                return;
            }
            this.f78960u1.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WM */
    public void m86084WM(boolean z11) {
        int i11;
        try {
            if (this.f78922E1 != null && this.f72421L0.m92676n2() != null) {
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                View view = this.f78922E1;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                AbstractC2364o0.m12372o(m92676n2, view, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XM */
    void m86085XM(String str) {
        try {
            this.f78955p1 = true;
            if (!TextUtils.isEmpty(str)) {
                this.f78952m1 = str;
                C15291f c15291f = new C15291f();
                this.f78930Q0.setVisibility(0);
                this.f78932S0.setVisibility(8);
                c15291f.m125774f3(1000);
                ((C23528a) this.f78942c1.m123612r(this.f78929P0)).m123583G(this.f78952m1, false, true, AbstractC23006a0.m117905e(), AbstractC16803z.default_avatar, this.f78941b1, c15291f, C23278z2.m120110a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.zz0.<init>(android.view.View, android.view.View$OnFocusChangeListener):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: YM */
    public void m86086YM(android.widget.EditText r3, android.view.View r4) {
        /*
            r2 = this;
            android.view.View$OnFocusChangeListener r0 = r3.getOnFocusChangeListener()
            if (r4 == 0) goto Le
            com.zing.zalo.ui.zviews.zz0 r1 = new com.zing.zalo.ui.zviews.zz0
            r1.<init>()
            r3.setOnFocusChangeListener(r1)
        Le:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.UpdateUserInfoZView.m86086YM(android.widget.EditText, android.view.View):void");
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        m86071rM();
    }

    /* renamed from: ZM */
    void m86087ZM() {
        if (AbstractC23238v2.m119727l()) {
            CameraInputParams m39210w = CameraInputParams.m39210w();
            m39210w.f41138w0 = new SensitiveData("profile_menu_change_info_avatar_camera", "profile_avatar");
            AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 5, 1, m39210w);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
    }

    /* renamed from: aN */
    void m86088aN(String str) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.sz0

            /* renamed from: q */
            public final /* synthetic */ String f82143q;

            public /* synthetic */ sz0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateUserInfoZView.this.m86049LM(r2);
            }
        });
    }

    /* renamed from: bN */
    void m86089bN() {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.qz0
            public /* synthetic */ qz0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateUserInfoZView.this.m86051NM();
            }
        });
    }

    /* renamed from: cN */
    void m86090cN() {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        C17487o0 c17487o02 = c17487o0;
        if (c17487o02 != null) {
            c17487o02.m93066i2(CreateUserNameView.class, null, 5002, 1, true);
        }
    }

    /* renamed from: dN */
    public void m86091dN(String str) {
        if (this.f78930Q0.getVisibility() == 0) {
            return;
        }
        this.f78930Q0.setVisibility(0);
        if (this.f78920C1 == null) {
            this.f78920C1 = AbstractC23306f.m120609P1();
        }
        this.f78920C1.m101508a(new C27357a.a(str, false, this.f78953n1, C32017m4.m154326S().m154339K(C32002l4.m154264g(10015)), false));
    }

    /* renamed from: eN */
    void m86092eN(String str) {
        try {
            C15290e c15290e = new C15290e(str);
            c15290e.m125611h1(26005, 0);
            this.f78930Q0.setVisibility(0);
            this.f78932S0.setVisibility(8);
            c15290e.m125774f3(1000);
            ((C23528a) this.f78942c1.m123612r(this.f78929P0)).m123583G(str, false, true, 0, AbstractC16803z.default_avatar, this.f78941b1, c15290e, C23278z2.m120110a());
        } catch (Exception e11) {
            View view = this.f78930Q0;
            if (view != null) {
                view.setVisibility(8);
            }
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    void m86093fN() {
        boolean z11;
        try {
            Button button = this.f78931R0;
            if (this.f78933T0.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            button.setEnabled(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gN */
    void m86094gN() {
        try {
            TextView textView = this.f78935V0;
            if (textView != null) {
                if (this.f78958s1 > 0 && this.f78957r1 > 0 && this.f78956q1 > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f78958s1);
                    sb2.append('/');
                    sb2.append(this.f78957r1);
                    sb2.append('/');
                    sb2.append(this.f78956q1);
                    sb2.append(' ');
                    textView.setText(sb2);
                } else {
                    textView.setText("");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78917L1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* renamed from: hN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m86095hN() {
        boolean z11;
        String str;
        boolean z12;
        String str2;
        m86079S1();
        if (C23055e5.m118271f()) {
            int i11 = 1;
            if (!this.f78950k1) {
                int i12 = this.f78959t1;
                int i13 = this.f78956q1;
                if (i12 - i13 <= 6 || i12 - i13 >= 100) {
                    z11 = false;
                    String trim = this.f78933T0.getText().toString().trim();
                    str = "";
                    z12 = !trim.equals("");
                    if (!z12 && z11) {
                        if (AbstractC23304d.f113373d0 == null) {
                            AbstractC23304d.f113373d0 = new ContactProfile();
                        }
                        AbstractC23304d.f113373d0.f42437s = trim;
                        if (this.f78950k1 || this.f78938Y0.isChecked()) {
                            i11 = 0;
                        }
                        ContactProfile contactProfile = AbstractC23304d.f113373d0;
                        contactProfile.f42449w = (byte) i11;
                        if (this.f78950k1) {
                            str2 = "1/1/1980";
                        } else {
                            str2 = this.f78958s1 + "/" + this.f78957r1 + "/" + this.f78956q1;
                        }
                        contactProfile.f42452x = str2;
                        if (this.f78950k1) {
                            m86100uM("", trim, "1", "1", "1980", "" + i11, "");
                            return;
                        }
                        m86100uM("", trim, "" + this.f78958s1, "" + this.f78957r1, "" + this.f78956q1, "" + i11, "");
                        return;
                    }
                    if (!z12) {
                        str = "" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_missing_name_input);
                    }
                    if (!z11) {
                        str = str + AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_dateofbirth_incorrect);
                    }
                    m86088aN(str);
                    return;
                }
            }
            z11 = true;
            String trim2 = this.f78933T0.getText().toString().trim();
            str = "";
            z12 = !trim2.equals("");
            if (!z12) {
            }
            if (!z12) {
            }
            if (!z11) {
            }
            m86088aN(str);
            return;
        }
        m86088aN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_update_info_network_error));
    }

    /* renamed from: lN */
    public void m86096lN(String str, boolean z11) {
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        contactProfile.f42446v = str;
        contactProfile.f42323A1 = str;
        ((C23528a) this.f78942c1.m123612r(this.f78929P0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
        this.f78954o1 = null;
        this.f78952m1 = "";
        this.f78953n1 = "";
        C20834z0.f102412a.m108925d(true);
        C25487t.f122084a.m132028c(C25487t.a.f122086A);
        try {
            AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f72421L0.m92672lJ() && !z11) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
        }
        this.f78930Q0.setVisibility(8);
    }

    /* renamed from: mD */
    public void m86097mD() {
        try {
            String[] m118179t = AbstractC23034c6.m118179t();
            if (AbstractC23034c6.m118167n(m92686rK(), m118179t) != 0) {
                AbstractC23034c6.m118184v0(this, m118179t, 111);
            } else {
                m86087ZM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mw */
    public void m86098mw(String str, String str2) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UID", str);
        bundle.putString("EXTRA_OPTION_VARIANT", str2);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileAvatarBottomSheet.class, bundle, 1300, 0, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        String str2;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 == 4) {
            if (i12 == -1) {
                m86073AM(intent.getData());
                return;
            }
            return;
        }
        if (i11 == 1002) {
            m86074BM(i12, intent);
            return;
        }
        if (i11 == 5) {
            if (i12 == -1) {
                try {
                    String stringExtra = intent.getStringExtra("extra_result_output_path");
                    if (intent.hasExtra("extra_result_camera_log")) {
                        this.f78953n1 = intent.getStringExtra("extra_result_camera_log");
                    }
                    if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                        String stringExtra2 = intent.getStringExtra("EXTRA_ERROR_MSG");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            m86056dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                            return;
                        } else {
                            m86056dj(stringExtra2, 3000);
                            return;
                        }
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        m86085XM(stringExtra);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            }
            return;
        }
        String str3 = "";
        if (i11 == 1005) {
            if (i12 == -1 && intent != null) {
                String stringExtra3 = intent.getStringExtra("extra_result_output_path");
                if (intent.hasExtra("extra_result_original_path")) {
                    str2 = intent.getStringExtra("extra_result_original_path");
                } else {
                    str2 = null;
                }
                if (intent.hasExtra("extra_result_camera_log")) {
                    this.f78953n1 = intent.getStringExtra("extra_result_camera_log");
                }
                if (TextUtils.isEmpty(stringExtra3) || !new File(stringExtra3).exists()) {
                    stringExtra3 = str2;
                }
                m86085XM(stringExtra3);
            }
            try {
                File file = this.f78954o1;
                if (file != null && file.exists()) {
                    this.f78954o1.delete();
                }
            } catch (Exception e13) {
                AbstractC23350e.m122776f("", e13);
            }
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null && actionBar.getVisibility() == 8) {
                this.f88760a0.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 == 5002) {
            if (i12 == -1 && intent != null) {
                String stringExtra4 = intent.getStringExtra("extra_user_name");
                this.f78965z1 = stringExtra4;
                AbstractC23304d.f113368c0.f42460z1 = stringExtra4;
                m86083UM();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_success));
                this.f78948i1 = true;
                return;
            }
            return;
        }
        if (i11 == 5003) {
            if (i12 == -1 && intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str = "";
                } else {
                    str = extras.getString("extra_result_avatar_path", "");
                }
                if (extras != null) {
                    str3 = extras.getString("extra_result_avatar_picid", "");
                }
                this.f78918A1 = str3;
                this.f78955p1 = true;
                if (!TextUtils.isEmpty(str)) {
                    C23999j c23999j = new C23999j();
                    c23999j.m125774f3(1000);
                    ((C23528a) this.f78942c1.m123612r(this.f78929P0)).m123583G(str, false, true, AbstractC23006a0.m117905e(), AbstractC16803z.default_avatar, this.f78941b1, c23999j, C23278z2.m120110a());
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 1300 && i12 == -1 && intent != null && intent.getExtras() != null) {
            m86054RM(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
            return;
        }
        return;
        e11.printStackTrace();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_done) {
            AbstractC23647d.m123907q("19513", "");
            m86095hN();
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.first_name) {
            AbstractC23647d.m123907q("19505", "");
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.date_of_birth) {
            AbstractC23647d.m123906p("19510");
            m86099sM(0);
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.btnRetryUploadAvatar) {
            ImageButton imageButton = this.f78932S0;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            m86091dN(this.f78952m1);
            return;
        }
        if (id2 == AbstractC6918a0.imvAvatar) {
            try {
                if (this.f78930Q0.getVisibility() != 0 && this.f78932S0.getVisibility() != 0) {
                    AbstractC23647d.m123907q("19501", "");
                    AbstractC2379w.m12430d(this.f78933T0);
                    m86098mw(CoreUtility.f89233i, EnumC24904a.f119497s.m129507c());
                    AbstractC23647d.m123893c();
                    return;
                }
                return;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (id2 == AbstractC6918a0.layout_username) {
            this.f72421L0.m92662fJ().m93069k2(IntroUsernameView.class, null, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (!this.f78944e1) {
                m86099sM(10);
                return true;
            }
            if (this.f78948i1 && this.f78951l1) {
                m86089bN();
            } else if (this.f78955p1) {
                m86099sM(9);
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 111) {
            try {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118179t()) == 0) {
                    m86087ZM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        try {
            if (this.f78945f1) {
                AbstractC23304d.f113358a0 = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.onResume();
    }

    /* renamed from: sM */
    void m86099sM(int i11) {
        if (this.f72421L0.m92648SI() != null && !this.f72421L0.mo60294yp()) {
            this.f72421L0.removeDialog(i11);
            this.f72421L0.showDialog(i11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:7|8|9|(2:87|88)(1:13)|14|15|(2:17|(15:71|72|73|74|75|76|25|26|(2:28|(4:30|31|32|(2:63|64)(6:46|(1:50)|51|(1:62)(2:(1:56)|(1:58))|59|60))(1:65))|67|31|32|(1:34)|63|64)(1:23))(1:84)|24|25|26|(0)|67|31|32|(0)|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:            r0 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2 A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:26:0x00dc, B:28:0x00e2, B:65:0x00ee), top: B:25:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* renamed from: uM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m86100uM(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        String str10;
        Exception exc;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String valueOf;
        String str28 = "";
        if (C23055e5.m118272g(true) && !this.f78925H1) {
            this.f78924G1.mo1704o8(new C15287b());
            if (str2.length() > 0) {
                String m100289a = C19092c.m100289a(str2, true);
                boolean z11 = false;
                try {
                    if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42437s) && AbstractC23304d.f113368c0.f42437s.equals(m100289a)) {
                        str26 = "";
                        str25 = str26;
                    } else {
                        str25 = m100289a;
                        str26 = AbstractC23304d.f113368c0.f42437s;
                    }
                    try {
                    } catch (Exception e11) {
                        e = e11;
                        str8 = str3;
                        str9 = str4;
                        str10 = str5;
                        str12 = "";
                        str13 = str12;
                        str14 = str13;
                    }
                } catch (Exception e12) {
                    str8 = str3;
                    str9 = str4;
                    str10 = str5;
                    exc = e12;
                    str11 = "";
                    str12 = str11;
                    str13 = str12;
                    str14 = str13;
                }
                if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42452x)) {
                    String[] split = AbstractC23304d.f113368c0.f42452x.split("/");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt == Integer.parseInt(str3) && parseInt2 == Integer.parseInt(str4) && parseInt3 == Integer.parseInt(str5)) {
                        str8 = "";
                        str9 = str8;
                        str10 = str9;
                        str12 = str10;
                    } else {
                        String valueOf2 = String.valueOf(parseInt);
                        try {
                            valueOf = String.valueOf(parseInt2);
                        } catch (Exception e13) {
                            e = e13;
                            str9 = str4;
                            str10 = str5;
                            str12 = "";
                            str14 = str12;
                            str13 = valueOf2;
                            str8 = str3;
                        }
                        try {
                            str10 = str5;
                            str12 = String.valueOf(parseInt3);
                            str13 = valueOf2;
                            str14 = valueOf;
                            str8 = str3;
                            str9 = str4;
                        } catch (Exception e14) {
                            e = e14;
                            str10 = str5;
                            str12 = "";
                            str13 = valueOf2;
                            str14 = valueOf;
                            str8 = str3;
                            str9 = str4;
                            String str29 = str25;
                            exc = e;
                            str11 = str26;
                            m100289a = str29;
                            exc.printStackTrace();
                            str15 = str11;
                            str16 = "";
                            str17 = str12;
                            str18 = str13;
                            str19 = str14;
                            str20 = str6;
                            str21 = str10;
                            str22 = str9;
                            str23 = str8;
                            str24 = m100289a;
                            if (!TextUtils.isEmpty(str)) {
                            }
                            this.f78925H1 = true;
                            m86084WM(true);
                            this.f78924G1.mo1449I3(str, str24, str23, str22, str21, str20, str7, str15, str18, str19, str17, str16, "");
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            int parseInt4 = Integer.parseInt(str6);
                            int i11 = AbstractC23304d.f113368c0.f42449w;
                            if (parseInt4 == i11) {
                                str27 = "";
                                str16 = str27;
                                str15 = str26;
                                str17 = str12;
                                str18 = str13;
                                str19 = str14;
                                str20 = str28;
                                str21 = str10;
                                str22 = str9;
                                str23 = str8;
                                str24 = str25;
                                if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str24) && TextUtils.isEmpty(str23) && TextUtils.isEmpty(str22) && TextUtils.isEmpty(str21) && TextUtils.isEmpty(str20) && TextUtils.isEmpty(str7)) {
                                    if (!TextUtils.isEmpty(this.f78952m1) && AbstractC23041d2.m118194A(this.f78952m1)) {
                                        z11 = true;
                                    }
                                    boolean z12 = !TextUtils.isEmpty(this.f78918A1);
                                    if (!this.f78950k1 && (z11 || z12)) {
                                        if (z11) {
                                            this.f78940a1 = true;
                                            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.tz0
                                                public /* synthetic */ tz0() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    UpdateUserInfoZView.this.m86044GM();
                                                }
                                            });
                                        }
                                        if (z12) {
                                            TrackingSource m154335G = C32017m4.m154326S().m154335G(C32002l4.m154264g(10015));
                                            C0766k c0766k = new C0766k();
                                            c0766k.mo1704o8(this.f78926I1);
                                            c0766k.mo1520Qa(Long.parseLong(this.f78918A1), true, m154335G);
                                        }
                                    } else {
                                        this.f72421L0.finish();
                                    }
                                    AbstractC2379w.m12430d(this.f78933T0);
                                    return;
                                }
                                this.f78925H1 = true;
                                m86084WM(true);
                                this.f78924G1.mo1449I3(str, str24, str23, str22, str21, str20, str7, str15, str18, str19, str17, str16, "");
                            }
                            str28 = String.valueOf(i11);
                        }
                        str27 = str28;
                        str28 = str6;
                        str16 = str27;
                        str15 = str26;
                        str17 = str12;
                        str18 = str13;
                        str19 = str14;
                        str20 = str28;
                        str21 = str10;
                        str22 = str9;
                        str23 = str8;
                        str24 = str25;
                        if (!TextUtils.isEmpty(str)) {
                        }
                        this.f78925H1 = true;
                        m86084WM(true);
                        this.f78924G1.mo1449I3(str, str24, str23, str22, str21, str20, str7, str15, str18, str19, str17, str16, "");
                    }
                } else {
                    str8 = str3;
                    str9 = str4;
                    str10 = str5;
                    str12 = "";
                }
                str13 = str12;
                str14 = str13;
                if (!TextUtils.isEmpty(str6)) {
                }
                str27 = str28;
                str28 = str6;
                str16 = str27;
                str15 = str26;
                str17 = str12;
                str18 = str13;
                str19 = str14;
                str20 = str28;
                str21 = str10;
                str22 = str9;
                str23 = str8;
                str24 = str25;
                if (!TextUtils.isEmpty(str)) {
                }
                this.f78925H1 = true;
                m86084WM(true);
                this.f78924G1.mo1449I3(str, str24, str23, str22, str21, str20, str7, str15, str18, str19, str17, str16, "");
            }
        }
    }

    /* renamed from: vM */
    void m86101vM(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                m86092eN(str);
            } catch (Exception e11) {
                if (this.f78930Q0 != null) {
                    this.f78930Q0.setVisibility(8);
                }
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: wM */
    void m86102wM(String str, int i11) {
        try {
            m86079S1();
            this.f78933T0.addTextChangedListener(new C15289d());
            if (i11 == 0) {
                this.f78938Y0.setChecked(true);
            } else if (i11 == 1) {
                this.f78939Z0.setChecked(true);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f78933T0.setText(str);
            } else {
                this.f78933T0.setText(m86104yM());
            }
            EditText editText = this.f78933T0;
            editText.setSelection(editText.length());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        super.mo17795x(i11, objArr);
        String str = "";
        boolean z11 = false;
        try {
            if (i11 != 15000) {
                if (i11 == 15001) {
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
                    m86064kN(str, z11);
                    return;
                }
                return;
            }
            if (objArr.length > 0) {
                Object obj3 = objArr[0];
                if (obj3 instanceof String) {
                    str = (String) obj3;
                }
            }
            if (objArr.length > 2) {
                Object obj4 = objArr[2];
                if (obj4 instanceof Boolean) {
                    z11 = ((Boolean) obj4).booleanValue();
                }
            }
            m86062jN(str, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f78942c1 = new C23528a(this.f72421L0.m92648SI());
        m86076EM();
        m86075DM();
        if (bundle != null) {
            if (bundle.containsKey("cameraImageUri")) {
                this.f78927J1 = new File(bundle.getString("cameraImageUri"));
            }
            String string = bundle.getString("avata_path");
            this.f78953n1 = bundle.getString("avatar_camera_log");
            m86085XM(string);
        }
        AbstractC23647d.m123906p("19500");
        AbstractC23647d.m123893c();
    }

    /* renamed from: xM */
    void m86103xM(String str, String str2) {
        int i11;
        if (str2 != null) {
            try {
                i11 = !"male".equals(str2) ? 1 : 0;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            i11 = -1;
        }
        m86102wM(str, i11);
    }

    /* renamed from: yM */
    String m86104yM() {
        try {
            Account[] accountsByType = AccountManager.get(this.f72421L0.m92648SI()).getAccountsByType("com.google");
            if (accountsByType.length <= 0) {
                return "";
            }
            String[] split = accountsByType[0].name.split("@");
            if (split.length <= 0) {
                return "";
            }
            String str = split[0];
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: zM */
    void m86105zM() {
        try {
            if (AbstractC23238v2.m119727l()) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_menu_change_info_avatar", "profile_avatar"));
                AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true, bundle);
            } else if (this.f72421L0.m92672lJ()) {
                m86088aN(AbstractC23136l9.m118743r0(AbstractC8020f0.error_sdcard));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
