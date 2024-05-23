package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7017b5;
import com.zing.zalo.adapters.C7162o5;
import com.zing.zalo.adapters.QuickCreateGroupAdapter;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.AvatarPickerView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C18005u0;
import ed0.AbstractC18391a;
import ge.C19411c;
import gw.AbstractC19646n0;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import im.C20612c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.AbstractC23238v2;
import me0.AbstractC23262x6;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31887d9;
import p716zh.C31901e8;
import p716zh.C31916f8;
import p716zh.C31934gb;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C31997l;
import p716zh.C32039nb;
import p716zh.C32076q5;
import p716zh.C32119t6;
import p716zh.C32141v0;
import p720zl.C32223a;
import pd0.C24730d;
import pd0.EnumC24734h;
import v50.C27870vb;
import vg.C28020b3;
import vg.C28146o3;
import vg.C28157p5;
import vg.C28176r6;
import vg.C28203u6;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class QuickCreateGroupView extends BaseZaloView implements View.OnClickListener, View.OnKeyListener, InterfaceC17463d.d, C23744a.c, InterfaceC0733x {

    /* renamed from: M2 */
    public static int f76612M2 = 0;

    /* renamed from: N2 */
    public static int f76613N2 = 1;

    /* renamed from: O2 */
    public static int f76614O2 = 2;

    /* renamed from: P2 */
    public static int f76615P2 = 3;

    /* renamed from: Q2 */
    static final String f76616Q2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alphabe);

    /* renamed from: A1 */
    ArrayList f76617A1;

    /* renamed from: B1 */
    String f76619B1;

    /* renamed from: C1 */
    boolean f76621C1;

    /* renamed from: D1 */
    String f76623D1;

    /* renamed from: H1 */
    C19411c f76631H1;

    /* renamed from: I1 */
    C31961i8 f76633I1;

    /* renamed from: M0 */
    KeyboardFrameLayout f76641M0;

    /* renamed from: N0 */
    AppCompatImageView f76643N0;

    /* renamed from: O0 */
    LinearLayout f76645O0;

    /* renamed from: P0 */
    LinearLayout f76647P0;

    /* renamed from: P1 */
    RecyclerView f76648P1;

    /* renamed from: Q0 */
    View f76649Q0;

    /* renamed from: Q1 */
    QuickCreateGroupAdapter f76650Q1;

    /* renamed from: R0 */
    EditText f76651R0;

    /* renamed from: R1 */
    RecyclerView f76652R1;

    /* renamed from: S0 */
    CustomEditText f76653S0;

    /* renamed from: T0 */
    View f76655T0;

    /* renamed from: T1 */
    C7017b5 f76656T1;

    /* renamed from: U0 */
    AvatarImageView f76657U0;

    /* renamed from: V0 */
    ProgressBar f76659V0;

    /* renamed from: W0 */
    String f76661W0;

    /* renamed from: W1 */
    String f76662W1;

    /* renamed from: X0 */
    Drawable f76663X0;

    /* renamed from: X1 */
    ViewStub f76664X1;

    /* renamed from: Y0 */
    View f76665Y0;

    /* renamed from: Z0 */
    View f76667Z0;

    /* renamed from: Z1 */
    String f76668Z1;

    /* renamed from: a1 */
    StickerPanelView f76669a1;

    /* renamed from: a2 */
    long f76670a2;

    /* renamed from: b1 */
    AppCompatImageView f76671b1;

    /* renamed from: c1 */
    AppCompatImageView f76673c1;

    /* renamed from: d1 */
    View f76675d1;

    /* renamed from: e1 */
    View f76677e1;

    /* renamed from: f1 */
    LinearLayout f76679f1;

    /* renamed from: h2 */
    ViewPager f76684h2;

    /* renamed from: i2 */
    C7162o5 f76686i2;

    /* renamed from: j2 */
    TextView[] f76688j2;

    /* renamed from: k2 */
    View[] f76690k2;

    /* renamed from: l2 */
    View[] f76692l2;

    /* renamed from: m2 */
    View f76694m2;

    /* renamed from: n2 */
    MultiStateView f76696n2;

    /* renamed from: o2 */
    View f76698o2;

    /* renamed from: p2 */
    AppCompatImageView f76700p2;

    /* renamed from: q2 */
    RobotoTextView f76702q2;

    /* renamed from: t1 */
    C23528a f76707t1;

    /* renamed from: v1 */
    int f76711v1;

    /* renamed from: w1 */
    int f76713w1;

    /* renamed from: g1 */
    volatile ArrayList f76681g1 = new ArrayList();

    /* renamed from: h1 */
    volatile C32223a f76683h1 = new C32223a();

    /* renamed from: i1 */
    volatile ArrayList f76685i1 = new ArrayList();

    /* renamed from: j1 */
    volatile ArrayList f76687j1 = new ArrayList();

    /* renamed from: k1 */
    volatile ArrayList f76689k1 = new ArrayList();

    /* renamed from: l1 */
    volatile C32223a f76691l1 = new C32223a();

    /* renamed from: m1 */
    volatile Map f76693m1 = new HashMap();

    /* renamed from: n1 */
    volatile Map f76695n1 = new HashMap();

    /* renamed from: o1 */
    volatile ArrayList f76697o1 = new ArrayList();

    /* renamed from: p1 */
    volatile Map f76699p1 = new HashMap();

    /* renamed from: q1 */
    String f76701q1 = "";

    /* renamed from: r1 */
    String f76703r1 = "";

    /* renamed from: s1 */
    String f76705s1 = "";

    /* renamed from: u1 */
    boolean f76709u1 = false;

    /* renamed from: x1 */
    int f76715x1 = 0;

    /* renamed from: y1 */
    int f76717y1 = 0;

    /* renamed from: z1 */
    String f76719z1 = "";

    /* renamed from: E1 */
    boolean f76625E1 = true;

    /* renamed from: F1 */
    short f76627F1 = 0;

    /* renamed from: G1 */
    int f76629G1 = -1;

    /* renamed from: J1 */
    boolean f76635J1 = false;

    /* renamed from: K1 */
    long f76637K1 = 0;

    /* renamed from: L1 */
    boolean f76639L1 = true;

    /* renamed from: M1 */
    boolean f76642M1 = true;

    /* renamed from: N1 */
    boolean f76644N1 = false;

    /* renamed from: O1 */
    boolean f76646O1 = false;

    /* renamed from: S1 */
    final C32223a f76654S1 = new C32223a();

    /* renamed from: U1 */
    final HashSet f76658U1 = new HashSet();

    /* renamed from: V1 */
    final C32223a f76660V1 = new C32223a();

    /* renamed from: Y1 */
    boolean f76666Y1 = true;

    /* renamed from: b2 */
    String f76672b2 = "";

    /* renamed from: c2 */
    boolean f76674c2 = false;

    /* renamed from: d2 */
    boolean f76676d2 = true;

    /* renamed from: e2 */
    String f76678e2 = "";

    /* renamed from: f2 */
    String f76680f2 = "0";

    /* renamed from: g2 */
    private String f76682g2 = "";

    /* renamed from: r2 */
    int f76704r2 = 30;

    /* renamed from: s2 */
    float f76706s2 = 0.0f;

    /* renamed from: t2 */
    int f76708t2 = 0;

    /* renamed from: u2 */
    int f76710u2 = 0;

    /* renamed from: v2 */
    int f76712v2 = 200;

    /* renamed from: w2 */
    boolean f76714w2 = false;

    /* renamed from: x2 */
    String f76716x2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_tab_suggest);

    /* renamed from: y2 */
    ArrayList f76718y2 = null;

    /* renamed from: z2 */
    C32223a f76720z2 = new C32223a();

    /* renamed from: A2 */
    HashMap f76618A2 = new HashMap();

    /* renamed from: B2 */
    int f76620B2 = 0;

    /* renamed from: C2 */
    InviteContactProfile f76622C2 = null;

    /* renamed from: D2 */
    InviteContactProfile f76624D2 = null;

    /* renamed from: E2 */
    int f76626E2 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;

    /* renamed from: F2 */
    boolean f76628F2 = false;

    /* renamed from: G2 */
    QuickCreateGroupAdapter.InterfaceC6993d f76630G2 = new QuickCreateGroupAdapter.InterfaceC6993d() { // from class: com.zing.zalo.ui.zviews.h90
        public /* synthetic */ h90() {
        }

        @Override // com.zing.zalo.adapters.QuickCreateGroupAdapter.InterfaceC6993d
        /* renamed from: a */
        public final void mo35823a(InviteContactProfile inviteContactProfile) {
            QuickCreateGroupView.this.m83239WM(inviteContactProfile);
        }
    };

    /* renamed from: H2 */
    C28146o3 f76632H2 = null;

    /* renamed from: I2 */
    WeakHashMap f76634I2 = new WeakHashMap();

    /* renamed from: J2 */
    public AvatarPickerView f76636J2 = null;

    /* renamed from: K2 */
    int f76638K2 = 0;

    /* renamed from: L2 */
    final Runnable f76640L2 = new RunnableC14849h();

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$a */
    /* loaded from: classes6.dex */
    public class C14842a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ int f76721p;

        C14842a(int i11) {
            this.f76721p = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
            quickCreateGroupView.f76714w2 = false;
            try {
                quickCreateGroupView.f76706s2 = 0.0f;
                quickCreateGroupView.f76679f1.setVisibility(8);
                QuickCreateGroupView.this.m83271DN(true);
                QuickCreateGroupView.this.f76710u2 = 0;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            try {
                QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                quickCreateGroupView.f76714w2 = true;
                quickCreateGroupView.m83264AN(this.f76721p - quickCreateGroupView.f76708t2);
                QuickCreateGroupView.this.m83301qN(8);
                QuickCreateGroupView.this.m83299pN(0);
                AbstractC23136l9.m118696b1(QuickCreateGroupView.this.f76651R0, null);
            } catch (Exception e11) {
                QuickCreateGroupView.this.f76714w2 = false;
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$b */
    /* loaded from: classes6.dex */
    public class C14843b implements InterfaceC20094a {
        C14843b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m83321d(C31973j5 c31973j5, ContactProfile contactProfile) {
            if (QuickCreateGroupView.this.f76627F1 == 3) {
                Intent intent = new Intent();
                intent.putExtra("groupId", c31973j5.m153781r());
                QuickCreateGroupView.this.f72421L0.mo50035CK(-1, intent);
                QuickCreateGroupView.this.finish();
                return;
            }
            try {
                Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                m140776b.putString("groupId", c31973j5.m153781r());
                m140776b.putString("groupName", contactProfile.f42437s);
                m140776b.putBoolean("alreadyCreateGroup", true);
                if (!TextUtils.isEmpty(QuickCreateGroupView.this.f76623D1)) {
                    m140776b.putString("str_extra_prefill_text", QuickCreateGroupView.this.f76623D1);
                }
                m140776b.putInt("SHOW_WITH_FLAGS", 7340032);
                if (QuickCreateGroupView.this.f72421L0.m92676n2() != null) {
                    QuickCreateGroupView.this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() != 17015) {
                AbstractC23161o1.m119321f(c20096c, false);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                    if (jSONObject.has("maxUsers")) {
                        QuickCreateGroupView.this.f76626E2 = jSONObject.optInt("maxUsers");
                    }
                } catch (Exception e11) {
                    QuickCreateGroupView.this.f76626E2 = C19637j.f97466a.m102831L();
                    AbstractC23350e.m122778h(e11);
                }
                AbstractC2364o0.m12373p(QuickCreateGroupView.this.f72421L0, 1);
            }
            QuickCreateGroupView.this.f72421L0.mo49315c4();
            QuickCreateGroupView.this.f76709u1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            C31973j5 c31973j5;
            QuickCreateGroupView.this.f76621C1 = false;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = new JSONObject();
                String str = "";
                if (jSONObject.has("data") && jSONObject.has("error_code")) {
                    if (!jSONObject.getString("data").equals("null") && !jSONObject.getString("data").equals("")) {
                        jSONObject2 = new JSONObject(jSONObject.getString("data"));
                    }
                    if (!jSONObject.isNull("error_code")) {
                        i11 = jSONObject.getInt("error_code");
                    } else {
                        i11 = -999;
                    }
                } else {
                    i11 = 0;
                }
                if (i11 != 0) {
                    ToastUtils.m89260h(i11, false);
                } else {
                    String optString = jSONObject2.optString("id");
                    String optString2 = jSONObject2.optString("name");
                    String optString3 = jSONObject2.optString("desc");
                    String optString4 = jSONObject2.optString("members");
                    String optString5 = jSONObject2.optString("avt");
                    int optInt = jSONObject2.optInt("totalMembers");
                    int optInt2 = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    int optInt3 = jSONObject2.optInt("subType");
                    String optString6 = jSONObject2.optString("msgInfo");
                    String optString7 = jSONObject2.optString("setting");
                    String optString8 = jSONObject2.optString("extraInfo");
                    String optString9 = jSONObject2.optString("joinQuestion");
                    if (!jSONObject2.isNull("owner_id")) {
                        str = jSONObject2.getString("owner_id");
                    }
                    String str2 = str;
                    if (!TextUtils.isEmpty(optString)) {
                        c31973j5 = C0943w.m4462l().m4472f(optString);
                    } else {
                        c31973j5 = null;
                    }
                    if (c31973j5 != null && QuickCreateGroupView.this.f76627F1 == 6) {
                        AbstractC23647d.m123897g("27437");
                    }
                    if (c31973j5 == null) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(optString4)) {
                            arrayList.addAll(Arrays.asList(optString4.split(";")));
                        }
                        if (!TextUtils.isEmpty(optString) && !optString.equals("0")) {
                            if (!TextUtils.isEmpty(QuickCreateGroupView.this.f76661W0)) {
                                optString5 = QuickCreateGroupView.this.f76661W0;
                            }
                            c31973j5 = new C31973j5(optString, optString2, optString3, str2, "", optString5, arrayList, optInt, optString7, optInt2, optInt3, optString8, optString9);
                            C32076q5 c32076q5 = new C32076q5(optString);
                            c32076q5.m154715d(c31973j5, arrayList, new ArrayList());
                            if (C7960e.m41971c6() != null) {
                                QuickCreateGroupView.this.f76621C1 = TextUtils.isEmpty(c31973j5.m153773n());
                                C0943w.m4462l().m4477n(c31973j5, c32076q5);
                            }
                            if (AbstractC23309i.m120739A2()) {
                                AbstractC19646n0.m102971e1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_new_create_group), null, c31973j5, true);
                            }
                            if (!TextUtils.isEmpty(QuickCreateGroupView.this.f76661W0)) {
                                C24730d.m128465h().m128477p(QuickCreateGroupView.this.f76661W0, EnumC24734h.GROUP_AVATAR, Integer.parseInt(optString), false, QuickCreateGroupView.this.f76668Z1, null, null);
                            }
                            if (QuickCreateGroupView.this.f76621C1) {
                                C19637j.f97466a.m102856l(c31973j5.m153781r(), false);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(QuickCreateGroupView.this.f76619B1)) {
                        C19637j.f97466a.m102842a0(QuickCreateGroupView.this.f76619B1);
                    }
                    if (c31973j5 != null) {
                        QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                        if (quickCreateGroupView.f76627F1 == 2) {
                            quickCreateGroupView.m83316yM(optString);
                        }
                        AbstractC23184q2.m119438C(optString);
                        if (!TextUtils.isEmpty(optString6)) {
                            ToastUtils.showMess(optString6);
                        }
                        ContactProfile contactProfile = new ContactProfile(1, optString);
                        contactProfile.f42437s = optString2;
                        contactProfile.f42446v = optString5;
                        if (QuickCreateGroupView.this.f72421L0.m92676n2() != null) {
                            QuickCreateGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.s90

                                /* renamed from: q */
                                public final /* synthetic */ C31973j5 f81913q;

                                /* renamed from: r */
                                public final /* synthetic */ ContactProfile f81914r;

                                public /* synthetic */ s90(C31973j5 c31973j52, ContactProfile contactProfile2) {
                                    r2 = c31973j52;
                                    r3 = contactProfile2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    QuickCreateGroupView.C14843b.this.m83321d(r2, r3);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            QuickCreateGroupView.this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$c */
    /* loaded from: classes6.dex */
    public class C14844c implements InterfaceC20094a {
        C14844c() {
        }

        /* renamed from: f */
        public static /* synthetic */ int m83325f(ContactProfile contactProfile, ContactProfile contactProfile2) {
            return contactProfile.m40383Q(true, false).compareToIgnoreCase(contactProfile2.m40383Q(true, false));
        }

        /* renamed from: g */
        public /* synthetic */ void m83326g(ArrayList arrayList) {
            if (QuickCreateGroupView.this.f72421L0.m92672lJ()) {
                QuickCreateGroupView.this.f76687j1.clear();
                QuickCreateGroupView.this.f76687j1.addAll(arrayList);
                QuickCreateGroupView.this.m83292iN();
                QuickCreateGroupView.this.m83293kN();
                QuickCreateGroupChildTabView m83276HM = QuickCreateGroupView.this.m83276HM();
                if (m83276HM != null) {
                    m83276HM.m83232nM();
                }
                if (QuickCreateGroupView.this.f76687j1.size() < 2) {
                    ToastUtils.m89266n(AbstractC8020f0.str_copy_existing_group_error_not_enough_member, 3);
                    QuickCreateGroupView.this.finish();
                }
                QuickCreateGroupView.this.m83297oN(false, 0);
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m83327h(C20096c c20096c) {
            QuickCreateGroupView.this.m83297oN(false, c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
            quickCreateGroupView.f76628F2 = false;
            quickCreateGroupView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v90

                /* renamed from: q */
                public final /* synthetic */ C20096c f82400q;

                public /* synthetic */ v90(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickCreateGroupView.C14844c.this.m83327h(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("currentMems");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("admins");
                    ArrayList arrayList = new ArrayList(optJSONObject.optInt("totalMembers"));
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        InviteContactProfile inviteContactProfile = new InviteContactProfile(optJSONArray.getJSONObject(i11));
                        if (inviteContactProfile.f42352K0 == 0 && C28146o3.m141655e(inviteContactProfile, false) && !QuickCreateGroupView.this.f76634I2.containsKey(inviteContactProfile.f42434r)) {
                            arrayList.add(inviteContactProfile);
                        }
                    }
                    for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                        InviteContactProfile inviteContactProfile2 = new InviteContactProfile(optJSONArray2.getJSONObject(i12));
                        if (inviteContactProfile2.f42352K0 == 0 && C28146o3.m141655e(inviteContactProfile2, false) && !QuickCreateGroupView.this.f76634I2.containsKey(inviteContactProfile2.f42434r)) {
                            arrayList.add(inviteContactProfile2);
                        }
                    }
                    Collections.sort(arrayList, new Comparator() { // from class: com.zing.zalo.ui.zviews.t90
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            int m83325f;
                            m83325f = QuickCreateGroupView.C14844c.m83325f((ContactProfile) obj2, (ContactProfile) obj3);
                            return m83325f;
                        }
                    });
                    QuickCreateGroupView.this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.u90

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f82283q;

                        public /* synthetic */ u90(ArrayList arrayList2) {
                            r2 = arrayList2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            QuickCreateGroupView.C14844c.this.m83326g(r2);
                        }
                    }, 200L);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    ToastUtils.m89266n(AbstractC8020f0.str_error_loading_group_members, new Object[0]);
                    QuickCreateGroupView.this.finish();
                }
                QuickCreateGroupView.this.f76628F2 = false;
            } catch (Throwable th2) {
                QuickCreateGroupView.this.f76628F2 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$d */
    /* loaded from: classes6.dex */
    public class C14845d implements C28146o3.b {
        C14845d() {
        }

        @Override // vg.C28146o3.b
        /* renamed from: a */
        public void mo40211a() {
            if (TextUtils.isEmpty(QuickCreateGroupView.this.f76653S0.getText().toString().trim())) {
                QuickCreateGroupView.this.f76648P1.setVisibility(8);
            }
        }

        @Override // vg.C28146o3.b
        /* renamed from: b */
        public void mo40212b(boolean z11, String str, ArrayList arrayList, int i11) {
            try {
                if (str.equals(QuickCreateGroupView.this.f76653S0.getText().toString().trim())) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                            if (inviteContactProfile.m40381O0()) {
                                if (QuickCreateGroupView.this.f76618A2.containsKey(inviteContactProfile.f42434r)) {
                                    arrayList3.add(inviteContactProfile);
                                } else {
                                    arrayList4.add(inviteContactProfile);
                                }
                            } else if (AbstractC21935u.m114556w(inviteContactProfile.f42434r)) {
                                arrayList2.add(inviteContactProfile);
                            } else {
                                arrayList3.add(inviteContactProfile);
                            }
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList2.size() + arrayList3.size() + arrayList4.size());
                    arrayList5.addAll(arrayList2);
                    arrayList5.addAll(arrayList3);
                    arrayList5.addAll(arrayList4);
                    if (arrayList5.size() == 1) {
                        if (arrayList3.size() == 1) {
                            QuickCreateGroupView.this.f76650Q1.f38257z = true;
                        } else if (arrayList4.size() == 1) {
                            QuickCreateGroupView.this.f76650Q1.f38241B = true;
                        } else {
                            QuickCreateGroupAdapter quickCreateGroupAdapter = QuickCreateGroupView.this.f76650Q1;
                            quickCreateGroupAdapter.f38257z = false;
                            quickCreateGroupAdapter.f38241B = false;
                        }
                    } else {
                        QuickCreateGroupAdapter quickCreateGroupAdapter2 = QuickCreateGroupView.this.f76650Q1;
                        quickCreateGroupAdapter2.f38257z = false;
                        quickCreateGroupAdapter2.f38241B = false;
                    }
                    QuickCreateGroupView.this.f76648P1.setVisibility(0);
                    QuickCreateGroupView.this.f76648P1.m9837K1(0);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it2 = arrayList5.iterator();
                    int i12 = 0;
                    while (it2.hasNext()) {
                        InviteContactProfile inviteContactProfile2 = (InviteContactProfile) it2.next();
                        if (TextUtils.isEmpty(inviteContactProfile2.f42436r1) && TextUtils.isEmpty(inviteContactProfile2.f42439s1)) {
                            if (QuickCreateGroupView.this.f76660V1.m155391e(inviteContactProfile2)) {
                                arrayList6.add(new C32141v0(0, inviteContactProfile2));
                            } else if (QuickCreateGroupView.this.f76683h1.m155391e(inviteContactProfile2)) {
                                arrayList6.add(new C32141v0(0, inviteContactProfile2, 2));
                            } else {
                                arrayList6.add(new C32141v0(0, inviteContactProfile2));
                            }
                            i12++;
                        }
                        arrayList6.add(new C32141v0(0, inviteContactProfile2, 4));
                        i12++;
                    }
                    arrayList6.add(new C32141v0(2, null));
                    QuickCreateGroupView.this.f76650Q1.m35818Q(arrayList6);
                    QuickCreateGroupView.this.f76650Q1.m35819R(i12);
                    QuickCreateGroupView.this.f76650Q1.m10008p();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$e */
    /* loaded from: classes6.dex */
    public class C14846e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f76726a;

        C14846e(ContactProfile contactProfile) {
            this.f76726a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42221O7(this.f76726a, false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$f */
    /* loaded from: classes6.dex */
    public class C14847f implements AvatarPickerView.InterfaceC14082a {
        C14847f() {
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: a */
        public void mo64240a() {
            AbstractC23647d.m123897g("27412");
            try {
                String[] m118177s = AbstractC23034c6.m118177s();
                if (AbstractC23034c6.m118167n(QuickCreateGroupView.this.f72421L0.m92648SI(), m118177s) != 0) {
                    AbstractC23034c6.m118184v0(QuickCreateGroupView.this.f72421L0, m118177s, 111);
                } else {
                    QuickCreateGroupView.this.m83313vN();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            QuickCreateGroupView.this.m83291hy();
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: b */
        public void mo64241b() {
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: d */
        public void mo64242d(String str) {
            QuickCreateGroupView.this.m83295mN(str, new C20612c(-1, -1).m107293q());
            QuickCreateGroupView.this.m83291hy();
        }

        @Override // com.zing.zalo.p077ui.zviews.AvatarPickerView.InterfaceC14082a
        /* renamed from: f0 */
        public void mo64243f0() {
            AbstractC23647d.m123897g("27413");
            try {
                if (AbstractC23238v2.m119727l()) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_create_group_avatar", "group_avatar"));
                    AbstractC23211s7.m119589v(QuickCreateGroupView.this.f72421L0.m92676n2(), 1000, 7, true, bundle);
                } else if (QuickCreateGroupView.this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_sdcard));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            QuickCreateGroupView.this.m83291hy();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$g */
    /* loaded from: classes6.dex */
    public class C14848g extends C23999j {
        C14848g() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        QuickCreateGroupView.this.f76657U0.setImageInfo(c3979l);
                        ProgressBar progressBar = QuickCreateGroupView.this.f76659V0;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$h */
    /* loaded from: classes6.dex */
    class RunnableC14849h implements Runnable {
        RunnableC14849h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (QuickCreateGroupView.this.f76651R0.getText().length() > 0) {
                    QuickCreateGroupView.this.m83319zN();
                    QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                    quickCreateGroupView.f72827B0.postDelayed(quickCreateGroupView.f76640L2, 50L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$i */
    /* loaded from: classes6.dex */
    public class C14850i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f76731a;

        C14850i(String str) {
            this.f76731a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    C31961i8 c31961i8 = new C31961i8(optJSONObject);
                    C28176r6.m141702d().m141711l(c31961i8);
                    String m153669g = c31961i8.m153669g();
                    String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_create_poll), AbstractC23136l9.m118743r0(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g);
                    C7907e c7907e = new C7907e();
                    c7907e.m40852b(new C7907e.a(format.lastIndexOf(m153669g), m153669g.length()));
                    AbstractC19646n0.m102983h1(format, new C18005u0.a().m95727i(9).m95725g(c7907e).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i8.f146880a), AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_vote_action)).m95729k(c31961i8.f146880a, c31961i8.f146895p).m95722d("create"), C0943w.m4462l().m4472f(this.f76731a), -1L);
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    c31961i8.f146886g = contactProfile.f42446v;
                    c31961i8.f146885f = contactProfile.f42437s;
                    C25490c.m132054j().m132060f(c31961i8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$j */
    /* loaded from: classes6.dex */
    public class C14851j implements InterfaceC20094a {
        C14851j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    C19411c c19411c = new C19411c(optJSONObject);
                    Intent intent = new Intent();
                    intent.putExtra("STR_EXTRA_JSON_EVENT_DETAIL", c19411c.mo101533h().toString());
                    QuickCreateGroupView.this.f72421L0.mo50035CK(-1, intent);
                    QuickCreateGroupView.this.finish();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$k */
    /* loaded from: classes6.dex */
    class C14852k extends ZdsActionBar.AbstractC16987c {
        C14852k() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            QuickCreateGroupView.this.m83314wM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$l */
    /* loaded from: classes6.dex */
    public class C14853l extends AbstractC31727b {
        C14853l() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            QuickCreateGroupView.this.f76651R0.requestFocus();
            QuickCreateGroupView.this.m83280Ka(1);
            if ((50 - QuickCreateGroupView.this.f76651R0.length()) - str.length() >= 0) {
                QuickCreateGroupView.this.f76651R0.getText().insert(QuickCreateGroupView.this.f76651R0.getSelectionEnd(), str);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 50));
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                    quickCreateGroupView.f72827B0.postDelayed(quickCreateGroupView.f76640L2, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    QuickCreateGroupView quickCreateGroupView2 = QuickCreateGroupView.this;
                    quickCreateGroupView2.f72827B0.removeCallbacks(quickCreateGroupView2.f76640L2);
                    QuickCreateGroupView.this.m83319zN();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$m */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC14854m implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC14854m() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (QuickCreateGroupView.this.f76679f1.getHeight() > 0) {
                QuickCreateGroupView.this.f76679f1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                int height = quickCreateGroupView.f76679f1.getHeight();
                quickCreateGroupView.f76708t2 = height;
                quickCreateGroupView.f76710u2 = height;
                QuickCreateGroupView quickCreateGroupView2 = QuickCreateGroupView.this;
                if (quickCreateGroupView2.f76674c2) {
                    quickCreateGroupView2.m83300qM(quickCreateGroupView2.f76710u2, 0);
                    QuickCreateGroupView.this.f76674c2 = false;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$n */
    /* loaded from: classes6.dex */
    public class C14855n extends AbstractC18391a {
        C14855n() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (50 >= editable.toString().length()) {
                C28652r.m143349v().m143361W(editable);
            } else {
                QuickCreateGroupView.this.f76651R0.setText(editable.toString().substring(0, 50));
                EditText editText = QuickCreateGroupView.this.f76651R0;
                editText.setSelection(editText.getText().toString().length());
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 50));
            }
            QuickCreateGroupView.this.m83273EN();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$o */
    /* loaded from: classes6.dex */
    public class ViewOnTouchListenerC14856o implements View.OnTouchListener {

        /* renamed from: p */
        float f76738p;

        /* renamed from: q */
        float f76739q;

        /* renamed from: r */
        boolean f76740r;

        ViewOnTouchListenerC14856o() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:            if (r8 <= (r7 + r2)) goto L43;     */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    this.f76738p = motionEvent.getRawX();
                    this.f76739q = motionEvent.getRawY();
                    int[] iArr = new int[2];
                    QuickCreateGroupView.this.f76653S0.getLocationOnScreen(iArr);
                    float f11 = iArr[0];
                    float f12 = iArr[1];
                    float height = QuickCreateGroupView.this.f76653S0.getHeight();
                    float width = QuickCreateGroupView.this.f76653S0.getWidth();
                    float f13 = this.f76738p;
                    if (f13 >= f11 && f13 <= f11 + width) {
                        float f14 = this.f76739q;
                        if (f14 >= f12) {
                        }
                    }
                    this.f76740r = false;
                    QuickCreateGroupView.this.f76653S0.setCursorVisible(true);
                    boolean z11 = this.f76740r;
                    if (z11) {
                        QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                        if (!quickCreateGroupView.f76714w2) {
                            quickCreateGroupView.m83306sN(8);
                            QuickCreateGroupView.this.f76653S0.requestFocus();
                            QuickCreateGroupView.this.m83280Ka(1);
                        }
                    }
                    if (!z11) {
                        return true;
                    }
                }
            } else {
                this.f76740r = true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$p */
    /* loaded from: classes6.dex */
    public class C14857p extends AbstractC18391a {
        C14857p() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (charSequence.length() == 0) {
                QuickCreateGroupView.this.m83303rN(0);
                if (QuickCreateGroupView.f76615P2 > 1) {
                    QuickCreateGroupView.this.f76694m2.setVisibility(0);
                }
            } else if (charSequence.length() > 0) {
                QuickCreateGroupView.this.m83303rN(8);
                QuickCreateGroupView.this.f76694m2.setVisibility(8);
            }
            QuickCreateGroupView.this.m83265BM(charSequence.toString().trim());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$q */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC14858q implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC14858q() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (QuickCreateGroupView.this.f76647P0.getHeight() > 0) {
                QuickCreateGroupView.this.f76647P0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                QuickCreateGroupView.this.m83317yN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$r */
    /* loaded from: classes6.dex */
    public class C14859r implements KeyboardFrameLayout.InterfaceC13508a {
        C14859r() {
        }

        /* renamed from: c */
        public /* synthetic */ void m83330c() {
            QuickCreateGroupView.this.m83317yN();
            QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
            if (quickCreateGroupView.f76638K2 != 2) {
                quickCreateGroupView.m83280Ka(0);
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m83331d() {
            if (QuickCreateGroupView.this.f76651R0.isFocused()) {
                QuickCreateGroupView.this.m83301qN(0);
                AbstractC23136l9.m118693a1(QuickCreateGroupView.this.f76651R0, AbstractC16803z.stencils_bg_edit_text);
                QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                quickCreateGroupView.m83299pN(quickCreateGroupView.f76704r2);
                EditText editText = QuickCreateGroupView.this.f76651R0;
                editText.setSelection(editText.getText().toString().length());
                QuickCreateGroupView.this.f76653S0.setCursorVisible(false);
                QuickCreateGroupView.this.f76651R0.setCursorVisible(true);
                QuickCreateGroupView quickCreateGroupView2 = QuickCreateGroupView.this;
                if (quickCreateGroupView2.f76708t2 - quickCreateGroupView2.f76679f1.getHeight() > 0) {
                    QuickCreateGroupView quickCreateGroupView3 = QuickCreateGroupView.this;
                    quickCreateGroupView3.m83302rM(quickCreateGroupView3.f76708t2 - quickCreateGroupView3.f76679f1.getHeight(), QuickCreateGroupView.this.f76712v2, true);
                }
                QuickCreateGroupView.this.m83317yN();
                return;
            }
            if (QuickCreateGroupView.this.f76653S0.isFocused()) {
                QuickCreateGroupView.this.m83301qN(8);
                AbstractC23136l9.m118696b1(QuickCreateGroupView.this.f76651R0, null);
                QuickCreateGroupView.this.m83299pN(0);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                QuickCreateGroupView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.x90
                    public /* synthetic */ x90() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickCreateGroupView.C14859r.this.m83330c();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            QuickCreateGroupView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.w90
                public /* synthetic */ w90() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickCreateGroupView.C14859r.this.m83331d();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$s */
    /* loaded from: classes6.dex */
    public class C14860s extends ViewPager.C6879n {
        C14860s() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            QuickCreateGroupView quickCreateGroupView;
            C7162o5 c7162o5;
            if (i11 == 0 && (c7162o5 = (quickCreateGroupView = QuickCreateGroupView.this).f76686i2) != null) {
                c7162o5.m36439C(quickCreateGroupView.f76684h2.getCurrentItem());
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            QuickCreateGroupView.this.m83275GN(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupView$t */
    /* loaded from: classes6.dex */
    public class C14861t extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ int f76746p;

        /* renamed from: q */
        final /* synthetic */ boolean f76747q;

        C14861t(int i11, boolean z11) {
            this.f76746p = i11;
            this.f76747q = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
            quickCreateGroupView.f76714w2 = false;
            try {
                if (quickCreateGroupView.f76706s2 < 1.0d) {
                    quickCreateGroupView.m83301qN(8);
                    AbstractC23136l9.m118696b1(QuickCreateGroupView.this.f76651R0, null);
                    QuickCreateGroupView quickCreateGroupView2 = QuickCreateGroupView.this;
                    quickCreateGroupView2.m83299pN(quickCreateGroupView2.f76704r2);
                    QuickCreateGroupView.this.f76651R0.setCursorVisible(false);
                    return;
                }
                quickCreateGroupView.f76706s2 = 0.0f;
                quickCreateGroupView.m83271DN(false);
                if (this.f76747q) {
                    QuickCreateGroupView.this.m83301qN(0);
                    AbstractC23136l9.m118693a1(QuickCreateGroupView.this.f76651R0, AbstractC16803z.stencils_bg_edit_text);
                    QuickCreateGroupView quickCreateGroupView3 = QuickCreateGroupView.this;
                    quickCreateGroupView3.m83299pN(quickCreateGroupView3.f76704r2);
                    QuickCreateGroupView.this.m83280Ka(1);
                    EditText editText = QuickCreateGroupView.this.f76651R0;
                    editText.setSelection(editText.getText().toString().length());
                }
                QuickCreateGroupView quickCreateGroupView4 = QuickCreateGroupView.this;
                quickCreateGroupView4.f76710u2 = quickCreateGroupView4.f76708t2;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i11;
            try {
                QuickCreateGroupView quickCreateGroupView = QuickCreateGroupView.this;
                quickCreateGroupView.f76714w2 = true;
                if (quickCreateGroupView.f76679f1.getVisibility() == 8) {
                    QuickCreateGroupView.this.f76679f1.setVisibility(0);
                }
                int i12 = this.f76746p;
                QuickCreateGroupView quickCreateGroupView2 = QuickCreateGroupView.this;
                int i13 = quickCreateGroupView2.f76708t2;
                if (i12 == i13) {
                    i11 = -i13;
                } else {
                    i11 = i12 - i13;
                }
                quickCreateGroupView2.m83264AN(i11);
            } catch (Exception e11) {
                QuickCreateGroupView.this.f76714w2 = false;
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: FM */
    public static JSONObject m83233FM(int i11, String str) {
        JSONObject jSONObject = new JSONObject();
        int i12 = 1;
        if (i11 != 1) {
            i12 = 0;
        }
        try {
            jSONObject.put("scrollTop", i12);
            jSONObject.put("selectTabType", 0);
            jSONObject.put("actionTitle", str);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: GM */
    public static String m83234GM(int i11, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("initConfig", m83233FM(i11, str));
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: RM */
    private void m83235RM() {
        this.f76669a1.m72709oO(new C14853l());
    }

    /* renamed from: TM */
    public /* synthetic */ void m83236TM(int i11, int i12, ValueAnimator valueAnimator) {
        try {
            float currentPlayTime = ((float) (valueAnimator.getCurrentPlayTime() * 1.0d)) / i11;
            this.f76706s2 = currentPlayTime;
            if (currentPlayTime > 1.0d) {
                currentPlayTime = 1.0f;
            }
            this.f76706s2 = currentPlayTime;
            int round = Math.round(currentPlayTime * i12);
            m83264AN((i12 - this.f76708t2) - round);
            m83296nN(i12 - round);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: UM */
    public /* synthetic */ void m83237UM(int i11, int i12, ValueAnimator valueAnimator) {
        try {
            float currentPlayTime = ((float) (valueAnimator.getCurrentPlayTime() * 1.0d)) / i11;
            this.f76706s2 = currentPlayTime;
            if (currentPlayTime > 1.0d) {
                currentPlayTime = 1.0f;
            }
            this.f76706s2 = currentPlayTime;
            int round = Math.round(currentPlayTime * i12);
            int i13 = this.f76708t2;
            int i14 = (i13 - i12) + round;
            m83264AN(i14 - i13);
            m83296nN(i14);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: VM */
    public static /* synthetic */ int m83238VM(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* renamed from: WM */
    public /* synthetic */ void m83239WM(InviteContactProfile inviteContactProfile) {
        List<InviteContactProfile> list = (List) this.f76693m1.get(inviteContactProfile);
        if (list != null) {
            boolean z11 = !inviteContactProfile.f42543g2;
            for (InviteContactProfile inviteContactProfile2 : list) {
                if (z11) {
                    m83309uM(inviteContactProfile2);
                } else {
                    m83312vM(inviteContactProfile2);
                }
            }
            if (this.f76627F1 == 4 && z11) {
                if ("ALL_FRIENDS_SECTION_HEADER_ID".equals(inviteContactProfile.f42434r)) {
                    AbstractC23647d.m123897g("10300142");
                } else if ("ALL_STRANGERS_SECTION_HEADER_ID".equals(inviteContactProfile.f42434r)) {
                    AbstractC23647d.m123897g("10300143");
                }
            }
        }
    }

    /* renamed from: XM */
    public /* synthetic */ void m83240XM() {
        View view = this.f76649Q0;
        if (view != null) {
            view.requestLayout();
        }
    }

    /* renamed from: YM */
    public /* synthetic */ void m83241YM(View view) {
        if (this.f76714w2) {
            return;
        }
        if (f76615P2 > 1) {
            this.f76694m2.setVisibility(0);
        } else {
            this.f76694m2.setVisibility(8);
        }
        if (m83270DM() != null) {
            if (this.f76679f1.getHeight() < this.f76708t2 || this.f76679f1.getVisibility() != 0) {
                this.f76653S0.setText("");
                m83306sN(0);
                m83303rN(0);
                this.f76651R0.requestFocus();
                m83280Ka(1);
            }
        }
    }

    /* renamed from: ZM */
    public /* synthetic */ void m83242ZM() {
        if (this.f76627F1 == 4) {
            m83288fN();
        }
    }

    /* renamed from: aN */
    public /* synthetic */ void m83243aN(InviteContactProfile inviteContactProfile) {
        m83312vM(inviteContactProfile);
        this.f76650Q1.m10008p();
    }

    /* renamed from: bN */
    public /* synthetic */ void m83244bN(RecyclerView recyclerView, int i11, View view) {
        if (i11 >= 0) {
            try {
                this.f76656T1.m35873M(i11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: cN */
    public /* synthetic */ void m83245cN(RecyclerView recyclerView, int i11, View view) {
        InviteContactProfile m35813L = this.f76650Q1.m35813L(i11);
        if (m35813L != null) {
            m83307tM(m35813L, "27422");
            m83280Ka(1);
            this.f76650Q1.m10008p();
        }
    }

    /* renamed from: dN */
    public /* synthetic */ boolean m83247dN(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            AbstractC2379w.m12430d(this.f76653S0);
            return false;
        }
        return false;
    }

    /* renamed from: eN */
    public /* synthetic */ void m83249eN(int i11, View view) {
        m83280Ka(0);
        m83301qN(8);
        AbstractC23136l9.m118696b1(this.f76651R0, null);
        this.f76651R0.setCursorVisible(false);
        m83299pN(0);
        if (this.f76684h2.getCurrentItem() == i11) {
            QuickCreateGroupChildTabView m83270DM = m83270DM();
            if (m83270DM != null) {
                m83270DM.f76595N0.mo9854S1(0);
                return;
            }
            return;
        }
        if (i11 == f76614O2) {
            AbstractC23647d.m123897g("27418");
        }
        this.f76684h2.setCurrentItem(i11);
    }

    /* renamed from: jN */
    private void m83255jN() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            m92649TI().mo92702G1(m92996E0, 0);
        }
    }

    /* renamed from: wN */
    private void m83261wN() {
        if (this.f76669a1 != null) {
            this.f76665Y0.setVisibility(0);
            m83262xN(this.f76669a1, true);
            this.f76675d1.setVisibility(0);
            m83317yN();
        }
    }

    /* renamed from: xN */
    private void m83262xN(ZaloView zaloView, boolean z11) {
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
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: AM */
    void m83263AM(boolean z11) {
        m83279KM();
        if (z11) {
            m83280Ka(0);
        }
    }

    /* renamed from: AN */
    void m83264AN(int i11) {
        float f11 = i11;
        this.f76655T0.setTranslationY(f11);
        this.f76651R0.setTranslationY(f11);
    }

    /* renamed from: BM */
    void m83265BM(String str) {
        C28146o3 c28146o3 = this.f76632H2;
        if (c28146o3 != null) {
            c28146o3.m141659d();
        }
        C14845d c14845d = new C14845d();
        short s7 = this.f76627F1;
        if (s7 != 4) {
            if (s7 != 10 && s7 != 11) {
                this.f76632H2 = new C28146o3(str, AbstractC23184q2.m119445c(), this.f76691l1.m155392f(), this.f76720z2, c14845d);
            } else {
                this.f76632H2 = new C28146o3(str, false, this.f76689k1, null, c14845d);
            }
        } else {
            this.f76632H2 = new C28146o3(str, false, this.f76687j1, null, c14845d);
        }
        this.f76632H2.start();
    }

    /* renamed from: BN */
    public void m83266BN(InviteContactProfile inviteContactProfile) {
        this.f76654S1.m155396j(inviteContactProfile);
        m83305sM();
    }

    /* renamed from: C */
    void m83267C() {
        CustomEditText customEditText = this.f76653S0;
        if (customEditText != null && customEditText.isFocused()) {
            AbstractC2379w.m12430d(this.f76653S0);
            this.f76653S0.requestFocus();
            return;
        }
        EditText editText = this.f76651R0;
        if (editText != null && editText.isFocused()) {
            AbstractC2379w.m12430d(this.f76651R0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ArrayList<String> arrayList;
        try {
            super.mo37111CJ(bundle);
            this.f76670a2 = System.currentTimeMillis();
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                this.f72421L0.m92676n2().mo35554O(AbstractC2379w.m12428b());
            }
            m92637BK(true);
            this.f76707t1 = new C23528a(this.f72421L0.m92648SI());
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f76719z1 = m92642L3.getString("extra_preload_data", "");
                this.f76619B1 = m92642L3.getString("EXTRA_SUGGEST_ID", "");
                this.f76627F1 = m92642L3.getShort("SHORT_EXTRA_CREATE_SOURCE", (short) 0);
                arrayList = m92642L3.getStringArrayList("STR_EXTRA_SELECTED_UIDS");
                this.f76678e2 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                this.f76680f2 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
                if (m92642L3.containsKey("INT_EXTRA_SUGGEST_CONTENT_TYPE")) {
                    this.f76629G1 = m92642L3.getInt("INT_EXTRA_SUGGEST_CONTENT_TYPE");
                    this.f76635J1 = m92642L3.getBoolean("BOL_EXTRA_NEED_PIN");
                    int i11 = this.f76629G1;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            if (m92642L3.containsKey("extra_poll_info_json")) {
                                String string = m92642L3.getString("extra_poll_info_json");
                                if (!TextUtils.isEmpty(string)) {
                                    this.f76633I1 = new C31961i8(new JSONObject(string));
                                }
                            }
                            this.f76637K1 = m92642L3.getLong("LONG_EXTRA_END_TIME_POLL", 0L);
                            this.f76639L1 = m92642L3.getBoolean("BOL_EXTRA_IS_MULTI_CHOICE_POLL", true);
                            this.f76642M1 = m92642L3.getBoolean("BOL_EXTRA_IS_ADD_ANSWER_POLL", true);
                            this.f76644N1 = m92642L3.getBoolean("BOL_EXTRA_IS_ANONYMOUS_POLL", this.f76644N1);
                            this.f76646O1 = m92642L3.getBoolean("BOL_EXTRA_IS_HIDE_VOTE_PREVIEW_POLL", this.f76646O1);
                        }
                    } else if (m92642L3.containsKey("STR_EXTRA_JSON_EVENT_DETAIL")) {
                        String string2 = m92642L3.getString("STR_EXTRA_JSON_EVENT_DETAIL");
                        if (!TextUtils.isEmpty(string2)) {
                            try {
                                this.f76631H1 = new C19411c(new JSONObject(string2));
                            } catch (Exception e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                        }
                    }
                }
                short s7 = this.f76627F1;
                if (s7 == 4) {
                    this.f76662W1 = m92642L3.getString("extra_group_id");
                    this.f76666Y1 = false;
                } else if (s7 == 10 || s7 == 11) {
                    this.f76666Y1 = false;
                    if (m92642L3.containsKey("extra_group_id")) {
                        this.f76662W1 = m92642L3.getString("extra_group_id");
                    }
                }
                this.f76682g2 = m92642L3.getString("EXTRA_TITLE", "");
            } else {
                arrayList = null;
            }
            this.f76711v1 = AbstractC23309i.m122636z0();
            if (this.f76627F1 == 4) {
                this.f76713w1 = Integer.MAX_VALUE;
            } else {
                this.f76713w1 = AbstractC23309i.m121078J8();
            }
            this.f76658U1.clear();
            this.f76660V1.m155389c();
            if (bundle != null) {
                this.f76676d2 = false;
                try {
                    if (bundle.containsKey("arrItemSelected")) {
                        this.f76658U1.addAll(bundle.getStringArrayList("arrItemSelected"));
                    }
                    if (bundle.containsKey("arrStrangerContacts")) {
                        JSONArray jSONArray = new JSONArray(bundle.getString("arrStrangerContacts"));
                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                            this.f76660V1.m155387a(new InviteContactProfile(jSONArray.getJSONObject(i12)));
                        }
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                    return;
                }
            }
            if (arrayList != null) {
                this.f76658U1.addAll(arrayList);
            }
        } catch (JSONException e13) {
            AbstractC23350e.m122778h(e13);
        }
    }

    /* renamed from: CM */
    public void m83268CM() {
        this.f76653S0.requestFocus();
        this.f76653S0.setCursorVisible(true);
        m83300qM(this.f76708t2, this.f76712v2);
        m83280Ka(1);
    }

    /* renamed from: CN */
    void m83269CN() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && !AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_to_set_group_name).equals(m87077NK.getMiddleSubtitle())) {
            m87077NK.setMiddleSubtitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(this.f76654S1.m155397k())));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_existing_group_confirmdlg_title)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_existing_group_confirmdlg_message)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group), this);
                    C8009j m43152a = aVar.m43152a();
                    m43152a.m92873y(true);
                    return m43152a;
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_quit_creating_group)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this);
                return aVar2.m43152a();
            }
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_group_add_too_much_strangers)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
            C8009j m43152a2 = aVar3.m43152a();
            m43152a2.m92873y(true);
            return m43152a2;
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        aVar4.m43159h(4).m43162k(AbstractC23136l9.m118746s0(AbstractC8020f0.str_dialog_msg_user_join_over_max_groups, Integer.valueOf(this.f76626E2))).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_choose_group_to_leave), this);
        C8009j m43152a3 = aVar4.m43152a();
        m43152a3.m92873y(true);
        return m43152a3;
    }

    /* renamed from: DM */
    QuickCreateGroupChildTabView m83270DM() {
        ZaloView m93128x = this.f76686i2.m93128x(this.f76684h2.getCurrentItem());
        if (m93128x != null && (m93128x instanceof QuickCreateGroupChildTabView)) {
            return (QuickCreateGroupChildTabView) m93128x;
        }
        return null;
    }

    /* renamed from: DN */
    void m83271DN(boolean z11) {
        String m118743r0;
        String m118743r02;
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                if (z11) {
                    if (!TextUtils.isEmpty(this.f76651R0.getText())) {
                        m87077NK.m91007s(this.f76651R0.getText().toString(), AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(this.f76654S1.m155397k())));
                        return;
                    }
                    if (!TextUtils.isEmpty(this.f76672b2)) {
                        m118743r02 = this.f76672b2;
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unnamed_group);
                    }
                    m87077NK.m91007s(m118743r02, AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_to_set_group_name));
                    return;
                }
                if (!TextUtils.isEmpty(this.f76672b2)) {
                    m118743r0 = this.f76672b2;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_title_new);
                }
                m87077NK.m91007s(m118743r0, AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(this.f76654S1.m155397k())));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: EM */
    public ArrayList m83272EM(int i11) {
        if (i11 == f76612M2) {
            return this.f76681g1;
        }
        if (i11 == f76613N2) {
            return this.f76683h1.m155392f();
        }
        if (i11 == f76614O2) {
            return this.f76685i1;
        }
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:            if (android.text.TextUtils.isEmpty(r1.getText().toString().trim()) == false) goto L31;     */
    /* renamed from: EN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m83273EN() {
        boolean z11;
        AppCompatImageView appCompatImageView = this.f76643N0;
        if (appCompatImageView == null) {
            return;
        }
        if (this.f76654S1.m155397k() != 0) {
            z11 = true;
            if (this.f76654S1.m155397k() == 1) {
                EditText editText = this.f76651R0;
                if (editText != null) {
                }
            }
            appCompatImageView.setEnabled(z11);
        }
        z11 = false;
        appCompatImageView.setEnabled(z11);
    }

    /* renamed from: FN */
    void m83274FN() {
        if (this.f76625E1) {
            this.f76653S0.setInputType(180224);
            AppCompatImageView appCompatImageView = this.f76700p2;
            appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView.getContext(), AbstractC16803z.login_123));
        } else {
            this.f76653S0.setInputType(3);
            AppCompatImageView appCompatImageView2 = this.f76700p2;
            appCompatImageView2.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView2.getContext(), AbstractC16803z.login_abc));
        }
        m83268CM();
        if (this.f76710u2 > 0) {
            m83306sN(8);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) layoutInflater.inflate(AbstractC7409c0.quick_create_group_view, viewGroup, false);
        this.f76641M0 = keyboardFrameLayout;
        keyboardFrameLayout.getRootView().setBackgroundColor(C23212s8.m119607o(this.f76641M0.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        m83308tN();
        m83275GN(0);
        m83317yN();
        return this.f76641M0;
    }

    /* renamed from: GN */
    void m83275GN(int i11) {
        boolean z11;
        try {
            this.f76684h2.setCurrentItem(i11);
            for (int i12 = 0; i12 < f76615P2; i12++) {
                TextView textView = this.f76688j2[i12];
                if (i12 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                textView.setSelected(z11);
                if (i12 == i11) {
                    this.f76692l2[i12].setVisibility(0);
                } else {
                    this.f76692l2[i12].setVisibility(8);
                }
            }
            m83290hN();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QuickCreateGroupView", e11);
        }
    }

    /* renamed from: HM */
    QuickCreateGroupChildTabView m83276HM() {
        ZaloView m93128x;
        int i11 = f76614O2;
        if (i11 >= 0 && (m93128x = this.f76686i2.m93128x(i11)) != null && (m93128x instanceof QuickCreateGroupChildTabView)) {
            return (QuickCreateGroupChildTabView) m93128x;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: IM */
    void m83277IM() {
        InviteContactProfile inviteContactProfile;
        String str;
        boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
        int size = mo98465a.size();
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                ContactProfile contactProfile = (ContactProfile) mo98465a.get(i13);
                if (contactProfile != null) {
                    if (contactProfile instanceof InviteContactProfile) {
                        inviteContactProfile = (InviteContactProfile) contactProfile;
                    } else {
                        inviteContactProfile = new InviteContactProfile(contactProfile);
                    }
                    if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && (!z11 || !C21927m.m114302u().m114345m(inviteContactProfile.f42434r))) {
                        String str2 = "" + inviteContactProfile.f42440t.trim().charAt(0);
                        Locale locale = Locale.ENGLISH;
                        char charAt = str2.toUpperCase(locale).charAt(0);
                        i11++;
                        if (i11 != 0) {
                            try {
                                char charAt2 = ("" + ((ContactProfile) mo98465a.get(i12)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                String str3 = f76616Q2;
                                if (str3.indexOf(charAt2) != -1) {
                                    if (charAt > charAt2) {
                                        if (str3.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                            inviteContactProfile2.f42437s = "" + charAt;
                                            inviteContactProfile2.m40403e1(false);
                                            int size2 = this.f76718y2.size();
                                            if (size2 > 0) {
                                                int i14 = size2 - 1;
                                                if (((InviteContactProfile) this.f76718y2.get(i14)).m40366G0()) {
                                                    ((InviteContactProfile) this.f76718y2.get(i14)).f42405d1 = true;
                                                }
                                            }
                                            this.f76718y2.add(inviteContactProfile2);
                                        } else {
                                            InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                            if (str3.indexOf(charAt) == -1) {
                                                str = "##";
                                            } else {
                                                str = "" + charAt;
                                            }
                                            inviteContactProfile3.f42437s = str;
                                            inviteContactProfile3.m40403e1(false);
                                            inviteContactProfile3.f42403c1 = false;
                                            this.f76718y2.add(inviteContactProfile3);
                                        }
                                    }
                                } else if (str3.indexOf(charAt) != -1) {
                                    InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                    inviteContactProfile4.f42437s = "" + charAt;
                                    inviteContactProfile4.m40403e1(false);
                                    int size3 = this.f76718y2.size();
                                    if (size3 > 0) {
                                        int i15 = size3 - 1;
                                        if (((InviteContactProfile) this.f76718y2.get(i15)).m40366G0()) {
                                            ((InviteContactProfile) this.f76718y2.get(i15)).f42405d1 = true;
                                        }
                                    }
                                    this.f76718y2.add(inviteContactProfile4);
                                }
                            } catch (Exception e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                        } else {
                            InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                            if (f76616Q2.indexOf(charAt) == -1) {
                                inviteContactProfile5.f42437s = "#";
                            } else {
                                inviteContactProfile5.f42437s = "" + charAt;
                            }
                            inviteContactProfile5.m40403e1(false);
                            this.f76718y2.add(inviteContactProfile5);
                        }
                        inviteContactProfile.f42399a1.clear();
                        this.f76718y2.add(inviteContactProfile);
                        this.f76620B2++;
                        i12 = i13;
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: JM */
    void m83278JM(String str) {
        try {
            AbstractC23647d.m123897g("27414");
            if (this.f76627F1 == 6) {
                AbstractC23647d.m123897g("27436");
            }
            ContactProfile m98552o = C18644n.m98531l().m98552o(str);
            if (m98552o != null) {
                Bundle m140776b = new C27870vb(m98552o.mo2478b()).m140780g(m98552o).m140776b();
                if (!TextUtils.isEmpty("")) {
                    m140776b.putString("msgToCreateGroup", "");
                }
                m140776b.putInt("SHOW_WITH_FLAGS", 33554432);
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                    return;
                }
                return;
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                Bundle m140776b2 = new C27870vb(m141809c.mo2478b()).m140780g(m141809c).m140776b();
                if (!TextUtils.isEmpty("")) {
                    m140776b2.putString("msgToCreateGroup", "");
                }
                m140776b2.putInt("SHOW_WITH_FLAGS", 33554432);
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b2, 1, true);
                    return;
                }
                return;
            }
            Iterator it = this.f76654S1.m155392f().iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (inviteContactProfile.f42434r.equals(str)) {
                    inviteContactProfile.f42455y = "";
                    C0824j.m2153b(new C14846e(inviteContactProfile));
                    Bundle m140776b3 = new C27870vb(inviteContactProfile.mo2478b()).m140780g(inviteContactProfile).m140776b();
                    if (!TextUtils.isEmpty("")) {
                        m140776b3.putString("msgToCreateGroup", "");
                    }
                    m140776b3.putInt("SHOW_WITH_FLAGS", 33554432);
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b3, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f != 2) {
                if (mo92862f != 3) {
                    if (mo92862f == 4) {
                        if (i11 == -1) {
                            interfaceC17463d.dismiss();
                            m83318zM();
                            if (this.f76627F1 == 4) {
                                AbstractC23647d.m123897g("10300146");
                                return;
                            }
                            return;
                        }
                        if (i11 == -2) {
                            interfaceC17463d.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i11 == -1) {
                    if (this.f76654S1.m155397k() == 0) {
                        AbstractC23647d.m123897g("27424");
                        if (this.f76627F1 == 6) {
                            AbstractC23647d.m123897g("27435");
                        }
                    } else {
                        AbstractC23647d.m123897g("27425");
                        if (this.f76627F1 == 6) {
                            AbstractC23647d.m123897g("27433");
                        }
                    }
                    interfaceC17463d.dismiss();
                    finish();
                    StickerPanelView stickerPanelView = this.f76669a1;
                    if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
                        m83280Ka(0);
                        return;
                    }
                    return;
                }
                return;
            }
            interfaceC17463d.dismiss();
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            AbstractC23184q2.m119464v(this.f72421L0);
        } else if (i11 == -2) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: KM */
    void m83279KM() {
        StickerPanelView stickerPanelView = this.f76669a1;
        if (stickerPanelView != null) {
            m83262xN(stickerPanelView, false);
            this.f76665Y0.setVisibility(8);
            this.f76675d1.setVisibility(8);
            m83317yN();
        }
    }

    /* renamed from: Ka */
    public void m83280Ka(int i11) {
        this.f76638K2 = i11;
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        try {
            int i12 = this.f76638K2;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        AppCompatImageView appCompatImageView = this.f76671b1;
                        appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView.getContext(), AbstractC16803z.ic_postfeed_keyboard));
                        m83267C();
                        this.f76651R0.requestFocus();
                        this.f76651R0.setCursorVisible(true);
                        this.f76641M0.setPaddingBottom(m122007i5);
                        this.f76641M0.requestLayout();
                        if (this.f76665Y0 == null) {
                            m83281LM(m122007i5);
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                        }
                        m83261wN();
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView2 = this.f76671b1;
                appCompatImageView2.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView2.getContext(), AbstractC16803z.icn_emoji));
                m83279KM();
                if (this.f76653S0.isFocused()) {
                    AbstractC2379w.m12432f(this.f76653S0);
                    this.f76651R0.setCursorVisible(false);
                    this.f76653S0.requestFocus();
                    this.f76653S0.setCursorVisible(true);
                } else {
                    AbstractC2379w.m12432f(this.f76651R0);
                    this.f76653S0.setCursorVisible(false);
                    this.f76651R0.requestFocus();
                    this.f76651R0.setCursorVisible(true);
                }
                this.f76641M0.setPaddingBottom(m122007i5);
                this.f76641M0.requestLayout();
                return;
            }
            m83267C();
            m83279KM();
            this.f76641M0.setPaddingBottom(0);
            this.f76641M0.requestLayout();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LM */
    void m83281LM(int i11) {
        View inflate = this.f76664X1.inflate();
        this.f76675d1 = this.f76641M0.findViewById(AbstractC6918a0.sep_sticker_panel);
        this.f76665Y0 = inflate.findViewById(AbstractC6918a0.parentview_sticker_panel);
        ArrayList<View> arrayList = new ArrayList<>();
        View view = this.f76665Y0;
        if (view != null) {
            arrayList.add(view);
        }
        this.f76641M0.setBottomViewsGroup(arrayList);
        m83255jN();
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142419r, 0, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), true, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f76669a1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f76669a1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m83235RM();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:            if (r0 < 0) goto L161;     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:3:0x0008, B:6:0x0014, B:8:0x0021, B:10:0x0027, B:12:0x0033, B:13:0x004b, B:14:0x0053, B:16:0x005a, B:18:0x0060, B:20:0x0068, B:21:0x0070, B:23:0x0076, B:25:0x0082, B:27:0x008a, B:29:0x0092, B:30:0x00b6, B:32:0x00bc, B:34:0x00c2, B:36:0x00d8, B:37:0x00ef, B:39:0x00f5, B:41:0x00fb, B:44:0x0106, B:46:0x0120, B:48:0x0126, B:54:0x0147, B:56:0x014e, B:58:0x0152, B:60:0x015b, B:61:0x0137, B:64:0x013d, B:67:0x0142, B:71:0x015d, B:73:0x0161, B:76:0x0167, B:78:0x016b, B:79:0x0176, B:81:0x0170, B:83:0x0174, B:84:0x0184, B:86:0x0189, B:87:0x018c), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:3:0x0008, B:6:0x0014, B:8:0x0021, B:10:0x0027, B:12:0x0033, B:13:0x004b, B:14:0x0053, B:16:0x005a, B:18:0x0060, B:20:0x0068, B:21:0x0070, B:23:0x0076, B:25:0x0082, B:27:0x008a, B:29:0x0092, B:30:0x00b6, B:32:0x00bc, B:34:0x00c2, B:36:0x00d8, B:37:0x00ef, B:39:0x00f5, B:41:0x00fb, B:44:0x0106, B:46:0x0120, B:48:0x0126, B:54:0x0147, B:56:0x014e, B:58:0x0152, B:60:0x015b, B:61:0x0137, B:64:0x013d, B:67:0x0142, B:71:0x015d, B:73:0x0161, B:76:0x0167, B:78:0x016b, B:79:0x0176, B:81:0x0170, B:83:0x0174, B:84:0x0184, B:86:0x0189, B:87:0x018c), top: B:2:0x0008 }] */
    /* renamed from: MM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m83282MM() {
        String str;
        int i11;
        C31961i8 c31961i8;
        C19411c c19411c;
        JSONObject optJSONObject;
        boolean z11;
        int i12;
        C7162o5 c7162o5;
        ViewPager viewPager;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        try {
            str = "";
        } catch (Exception e11) {
            AbstractC23350e.m122774d("QuickCreateGroupView", e11.toString());
            return;
        }
        if (!TextUtils.isEmpty(this.f76719z1)) {
            JSONObject jSONObject = new JSONObject(this.f76719z1);
            if (jSONObject.has("suggestGroupName") && (optJSONObject4 = jSONObject.optJSONObject("suggestGroupName")) != null) {
                String optString = optJSONObject4.optString("name");
                if (!TextUtils.isEmpty(optString)) {
                    this.f76651R0.setText(optString);
                    this.f76651R0.setSelection(optString.length());
                    m83280Ka(1);
                    m83317yN();
                }
                this.f76715x1 = optJSONObject4.optInt("forceSetName");
            }
            int i13 = 0;
            if (jSONObject.has("suggestGroupAvatar") && (optJSONObject3 = jSONObject.optJSONObject("suggestGroupAvatar")) != null) {
                JSONArray optJSONArray = optJSONObject3.optJSONArray("avatarList");
                if (optJSONArray != null) {
                    this.f76617A1 = new ArrayList();
                    for (int i14 = 0; i14 < optJSONArray.length(); i14++) {
                        this.f76617A1.add(optJSONArray.getString(i14));
                    }
                }
                if (optJSONObject3.optInt("preloadRandom") == 1 && this.f76617A1.size() > 0) {
                    m83295mN((String) this.f76617A1.get(new Random().nextInt(this.f76617A1.size())), new C20612c(-1, -1).m107293q());
                }
            }
            if (jSONObject.has("contentFirst") && (optJSONObject2 = jSONObject.optJSONObject("contentFirst")) != null) {
                C31887d9 m155014e = C32119t6.m155009c().m155014e(optJSONObject2.optJSONObject("data").optInt("completionType"));
                if (m155014e != null) {
                    this.f76623D1 = m155014e.m153213c() + " ";
                }
            }
            if (jSONObject.has("initConfig") && (optJSONObject = jSONObject.optJSONObject("initConfig")) != null) {
                if (optJSONObject.optInt("scrollTop", 0) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int optInt = optJSONObject.optInt("selectTabType", 0);
                this.f76672b2 = optJSONObject.optString("actionTitle", "");
                if (TextUtils.isEmpty(this.f76651R0.getText()) && m87077NK() != null) {
                    m87077NK().setMiddleTitle(this.f76672b2);
                }
                if (optInt != 1) {
                    if (optInt != 2) {
                        if (optInt == 3) {
                            i12 = f76614O2;
                        }
                        m83275GN(i13);
                        c7162o5 = this.f76686i2;
                        if (c7162o5 != null && (viewPager = this.f76684h2) != null) {
                            c7162o5.m36439C(viewPager.getCurrentItem());
                        }
                        if (z11) {
                            this.f76674c2 = true;
                        }
                    } else {
                        i12 = f76612M2;
                        if (i12 >= 0) {
                            i13 = i12;
                        }
                        m83275GN(i13);
                        c7162o5 = this.f76686i2;
                        if (c7162o5 != null) {
                            c7162o5.m36439C(viewPager.getCurrentItem());
                        }
                        if (z11) {
                        }
                    }
                } else {
                    i12 = f76613N2;
                    if (i12 >= 0) {
                        i13 = i12;
                    }
                    m83275GN(i13);
                    c7162o5 = this.f76686i2;
                    if (c7162o5 != null) {
                    }
                    if (z11) {
                    }
                }
                AbstractC23350e.m122774d("QuickCreateGroupView", e11.toString());
                return;
            }
        }
        if (this.f76627F1 == 2 && (i11 = this.f76629G1) >= 0) {
            if (i11 == 0 && (c19411c = this.f76631H1) != null) {
                str = c19411c.f96273m;
            } else if (i11 == 1 && (c31961i8 = this.f76633I1) != null) {
                str = c31961i8.f146881b;
            }
            this.f76651R0.setText(str);
            this.f76651R0.setSelection(str.length());
        }
        if (this.f76627F1 == 4) {
            m83288fN();
        }
        m83311ug();
    }

    /* renamed from: NM */
    void m83283NM() {
        C31901e8 m2800f;
        if (this.f76718y2 == null) {
            this.f76718y2 = new ArrayList();
            this.f76618A2.clear();
            if (AbstractC23309i.m120998H2() && AbstractC23184q2.m119445c()) {
                List m2802h = AbstractC0906d0.m2802h(this.f72421L0.m92648SI().getApplicationContext());
                List<C31934gb> m42570w5 = C7960e.m41971c6().m42570w5();
                HashMap hashMap = new HashMap();
                for (C31934gb c31934gb : m42570w5) {
                    hashMap.put(c31934gb.f146730b, c31934gb);
                }
                ArrayList arrayList = new ArrayList();
                C31916f8 c31916f8 = new C31916f8();
                for (int i11 = 0; i11 < m2802h.size(); i11++) {
                    C31901e8 c31901e8 = (C31901e8) m2802h.get(i11);
                    InviteContactProfile inviteContactProfile = new InviteContactProfile();
                    String m153295h = c31901e8.m153295h();
                    inviteContactProfile.f42437s = m153295h;
                    inviteContactProfile.f42440t = AbstractC23262x6.m120002o(m153295h);
                    String m153298m = c31901e8.m153298m();
                    inviteContactProfile.f42455y = m153298m;
                    inviteContactProfile.f42539c2 = m153298m;
                    inviteContactProfile.f42446v = C23302b.f113247a.m120521a();
                    inviteContactProfile.f42434r = ContactProfile.m40353g0(inviteContactProfile.f42539c2);
                    if (TextUtils.isEmpty(inviteContactProfile.f42455y)) {
                        inviteContactProfile.f42541e2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_from_phonebook);
                    } else {
                        inviteContactProfile.f42541e2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_search_result_from_phonebook, inviteContactProfile.f42455y);
                    }
                    try {
                        m2800f = AbstractC0906d0.m2800f(this.f72421L0.m92648SI().getApplicationContext(), c31901e8.m153298m());
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    if (m2800f != null && m2800f.m153300r() > 0) {
                        String valueOf = String.valueOf(m2800f.m153300r());
                        if (!AbstractC21935u.m114556w(valueOf)) {
                            ContactProfile m141811g = C28203u6.f131407a.m141811g(valueOf);
                            if (m141811g != null) {
                                inviteContactProfile.f42446v = m141811g.f42446v;
                            }
                            arrayList.add(inviteContactProfile);
                            this.f76618A2.put(inviteContactProfile.f42434r, valueOf);
                        }
                    } else {
                        if (c31901e8.m153301s()) {
                            if (c31901e8.m153298m().equals(AbstractC23304d.f113394i0)) {
                            }
                        }
                        if (!inviteContactProfile.f42539c2.trim().equals("")) {
                            if (!inviteContactProfile.f42539c2.trim().equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                if (c31916f8.m153376g(inviteContactProfile.f42539c2)) {
                                }
                                if (hashMap.containsKey(inviteContactProfile.f42539c2)) {
                                    C31934gb c31934gb2 = (C31934gb) hashMap.get(inviteContactProfile.f42539c2);
                                    String str = c31934gb2.f146729a;
                                    inviteContactProfile.f42434r = str;
                                    inviteContactProfile.f42446v = c31934gb2.f146733e;
                                    this.f76618A2.put(str, str);
                                }
                                arrayList.add(inviteContactProfile);
                            }
                        }
                    }
                }
                if (arrayList.size() <= AbstractC23309i.m120930F8()) {
                    Collections.sort(arrayList, new Comparator() { // from class: com.zing.zalo.ui.zviews.i90
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m83238VM;
                            m83238VM = QuickCreateGroupView.m83238VM((ContactProfile) obj, (ContactProfile) obj2);
                            return m83238VM;
                        }
                    });
                    this.f76720z2.m155388b(arrayList);
                }
            }
            m83277IM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            m83317yN();
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setLeadingFunctionCallback(new C14852k());
                m83271DN(false);
                m87077NK.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.g90
                    public /* synthetic */ g90() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        QuickCreateGroupView.this.m83241YM(view);
                    }
                });
            }
            m83317yN();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: OM */
    void m83284OM() {
        this.f76683h1.m155389c();
        ArrayList m103224k0 = C19669z.m103146Y().m103224k0(AbstractC23184q2.m119445c(), false);
        if (m103224k0.size() >= 5) {
            this.f76683h1.m155388b(m103224k0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: PM */
    void m83285PM() {
        this.f76691l1.m155389c();
        this.f76691l1.m155388b(this.f76683h1.m155392f());
        this.f76691l1.m155388b(this.f76681g1);
        this.f76691l1.m155388b(this.f76718y2);
        this.f76691l1.m155388b(this.f76660V1.m155392f());
        this.f76691l1.m155388b(this.f76720z2.m155392f());
        try {
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0()) && C21927m.m114302u().m114358t().size() > 0) {
                C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                int size = mo98465a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ContactProfile contactProfile = (ContactProfile) mo98465a.get(i11);
                    if (contactProfile != null && C21927m.m114302u().m114345m(contactProfile.f42434r)) {
                        this.f76691l1.m155387a(new InviteContactProfile(contactProfile));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: QM */
    void m83286QM() {
        ContactProfile m141811g;
        try {
            this.f76697o1.clear();
            this.f76699p1.clear();
            this.f76695n1.clear();
            if (!TextUtils.isEmpty(this.f76719z1)) {
                JSONObject jSONObject = new JSONObject(this.f76719z1);
                if (jSONObject.has("pollQuestion")) {
                    this.f76701q1 = jSONObject.getString("pollQuestion");
                }
                if (jSONObject.has("reminderTitle")) {
                    this.f76703r1 = jSONObject.getString("reminderTitle");
                }
                if (jSONObject.has("groupId")) {
                    this.f76705s1 = jSONObject.getString("groupId");
                }
                boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                if (jSONObject.has("listSectionSuggest")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("listSectionSuggest");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        InviteContactProfile inviteContactProfile = new InviteContactProfile();
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                        inviteContactProfile.f42434r = "section_" + i11;
                        inviteContactProfile.f42437s = jSONObject2.getString("sectionTitle");
                        boolean z12 = jSONObject2.getBoolean("autoSelect");
                        JSONArray jSONArray2 = (JSONArray) jSONObject2.get("listMember");
                        if (jSONArray2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                                JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i12);
                                String optString = jSONObject3.optString("id");
                                if (!CoreUtility.f89233i.equals(optString) && (!z11 || !C21927m.m114302u().m114345m(optString))) {
                                    String optString2 = jSONObject3.optString("dName");
                                    String optString3 = jSONObject3.optString("avatar");
                                    if ((TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) && (m141811g = C28203u6.f131407a.m141811g(optString)) != null) {
                                        optString2 = m141811g.m40383Q(true, false);
                                        optString3 = m141811g.f42446v;
                                    }
                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile(optString, optString3, optString2);
                                    if (C28146o3.m141655e(inviteContactProfile2, false)) {
                                        arrayList.add(inviteContactProfile2);
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                this.f76699p1.put(inviteContactProfile, Boolean.valueOf(z12));
                                this.f76697o1.add(inviteContactProfile);
                                this.f76695n1.put(inviteContactProfile, arrayList);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m83280Ka(0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            if (this.f76654S1.m155397k() > 0) {
                bundle.putStringArrayList("arrItemSelected", new ArrayList<>(this.f76654S1.m155394h()));
            }
            if (!this.f76660V1.m155395i()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f76660V1.m155392f().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((InviteContactProfile) it.next()).m40488x1());
                }
                bundle.putString("arrStrangerContacts", jSONArray.toString());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QuickCreateGroupView", e11);
        }
        super.mo37118SJ(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:3:0x0004, B:5:0x0011, B:7:0x0029, B:9:0x002f, B:12:0x0038, B:14:0x003e, B:16:0x005c, B:20:0x0075, B:24:0x0090, B:25:0x0080, B:27:0x008b, B:30:0x0065, B:32:0x006d, B:34:0x0093, B:36:0x009d, B:37:0x00a3, B:40:0x00b1, B:41:0x00b7, B:43:0x00bd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[SYNTHETIC] */
    /* renamed from: SM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m83287SM() {
        JSONArray optJSONArray;
        InviteContactProfile inviteContactProfile;
        try {
            this.f76681g1.clear();
            if (!TextUtils.isEmpty(this.f76719z1)) {
                JSONObject jSONObject = new JSONObject(this.f76719z1);
                boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                if (jSONObject.has("suggestGroupMember")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("suggestGroupMember");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("memberList")) != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i11);
                            String optString = jSONObject2.optString("id");
                            String optString2 = jSONObject2.optString("dName");
                            String optString3 = jSONObject2.optString("avatar");
                            if (!TextUtils.isEmpty(optString2)) {
                                if (TextUtils.isEmpty(optString3)) {
                                }
                                if (z11 || !C21927m.m114302u().m114345m(optString)) {
                                    inviteContactProfile = new InviteContactProfile(optString, optString3, optString2);
                                    if (!C28146o3.m141655e(inviteContactProfile, false)) {
                                        this.f76681g1.add(inviteContactProfile);
                                    }
                                }
                            }
                            ContactProfile m141811g = C28203u6.f131407a.m141811g(optString);
                            if (m141811g != null) {
                                optString2 = m141811g.m40383Q(true, false);
                                optString3 = m141811g.f42446v;
                            }
                            if (z11) {
                            }
                            inviteContactProfile = new InviteContactProfile(optString, optString3, optString2);
                            if (!C28146o3.m141655e(inviteContactProfile, false)) {
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("sectionLabel"))) {
                        this.f76716x2 = optJSONObject.optString("sectionLabel");
                    }
                    int optInt = optJSONObject.optInt("autoSelect");
                    this.f76717y1 = optInt;
                    if (this.f76676d2 && optInt == 1) {
                        Iterator it = this.f76681g1.iterator();
                        while (it.hasNext()) {
                            m83294lN((InviteContactProfile) it.next());
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        short s7 = this.f76627F1;
        if (s7 == 4 || s7 == 11 || s7 == 10) {
            C23744a.m124114c().m124115b(this, 52);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        short s7 = this.f76627F1;
        if (s7 == 4 || s7 == 11 || s7 == 10) {
            C23744a.m124114c().m124117e(this, 52);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (m92672lJ() && m92674mJ() && z11 && this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
            this.f72421L0.m92676n2().mo35554O(AbstractC2379w.m12428b());
        }
    }

    /* renamed from: fN */
    void m83288fN() {
        if (TextUtils.isEmpty(this.f76662W1) || this.f76628F2) {
            return;
        }
        this.f76628F2 = true;
        m83297oN(true, 0);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14844c());
        c0766k.mo1387A6(this.f76662W1);
    }

    /* renamed from: gN */
    public void m83289gN(boolean z11, int i11, int i12) {
        if (z11) {
            if (this.f76710u2 == this.f76708t2) {
                m83301qN(8);
                AbstractC23136l9.m118696b1(this.f76651R0, null);
                m83299pN(0);
                m83280Ka(0);
                this.f76651R0.setCursorVisible(false);
                this.f76651R0.requestLayout();
            }
            int i13 = this.f76710u2;
            if (i13 - i12 > 0) {
                int i14 = i13 - i12;
                this.f76710u2 = i14;
                m83264AN(i14 - this.f76708t2);
                m83296nN(this.f76710u2);
                return;
            }
            if (i13 != 0) {
                this.f76710u2 = 0;
                m83264AN(0);
                m83296nN(0);
                this.f76679f1.setVisibility(8);
                m83271DN(true);
                return;
            }
            return;
        }
        if (this.f76679f1.getVisibility() == 8) {
            this.f76679f1.setVisibility(0);
        }
        int i15 = this.f76710u2;
        int i16 = i15 + i12;
        int i17 = this.f76708t2;
        if (i16 < i17) {
            int i18 = i15 + i12;
            this.f76710u2 = i18;
            m83264AN(i18 - i17);
            m83296nN(this.f76710u2);
            return;
        }
        if (i15 != i17) {
            this.f76710u2 = i17;
            m83264AN(0);
            m83296nN(this.f76710u2);
            m83271DN(false);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickCreateGroupView";
    }

    /* renamed from: hN */
    void m83290hN() {
        QuickCreateGroupChildTabView m83270DM = m83270DM();
        if (m83270DM != null) {
            m83270DM.m83227d0();
        }
    }

    /* renamed from: hy */
    public void m83291hy() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("AvatarPickerView");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iN */
    void m83292iN() {
        this.f76685i1.clear();
        if (!this.f76660V1.m155395i()) {
            if (this.f76622C2 == null) {
                InviteContactProfile inviteContactProfile = new InviteContactProfile();
                this.f76622C2 = inviteContactProfile;
                inviteContactProfile.f42434r = "STRANGER_SECTION_HEADER_ID";
                inviteContactProfile.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_to_group_stranger_section_header);
                this.f76622C2.m40403e1(false);
            }
            this.f76685i1.add(this.f76622C2);
            this.f76685i1.addAll(this.f76660V1.m155392f());
        }
        if (this.f76666Y1) {
            m83283NM();
            if (this.f76624D2 == null) {
                InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                this.f76624D2 = inviteContactProfile2;
                inviteContactProfile2.f42434r = "FROM_NATIVE_PHONEBOOK_SECTION_HEADER_ID";
                inviteContactProfile2.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_from_phonebook);
                this.f76624D2.m40403e1(false);
            }
            if (this.f76620B2 <= AbstractC23309i.m121447T7()) {
                if (!this.f76720z2.m155395i()) {
                    this.f76685i1.add(this.f76624D2);
                    this.f76685i1.addAll(this.f76720z2.m155392f());
                }
                this.f76685i1.addAll(this.f76718y2);
                return;
            }
            this.f76685i1.addAll(this.f76718y2);
            if (!this.f76720z2.m155395i()) {
                this.f76685i1.add(this.f76624D2);
                this.f76685i1.addAll(this.f76720z2.m155392f());
                return;
            }
            return;
        }
        m83298pM();
    }

    /* renamed from: kN */
    void m83293kN() {
        Iterator it = this.f76691l1.m155392f().iterator();
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (this.f76658U1.contains(inviteContactProfile.f42434r)) {
                m83294lN(inviteContactProfile);
            }
        }
        this.f76658U1.clear();
    }

    /* renamed from: lN */
    public void m83294lN(InviteContactProfile inviteContactProfile) {
        inviteContactProfile.f42540d2 = null;
        this.f76654S1.m155387a(inviteContactProfile);
        m83305sM();
    }

    /* renamed from: mN */
    void m83295mN(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f76661W0 = str;
                this.f76668Z1 = str2;
                C14848g c14848g = new C14848g();
                ProgressBar progressBar = this.f76659V0;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                c14848g.m125774f3(1000);
                ((C23528a) this.f76707t1.m123612r(this.f76657U0)).m123583G(str, false, true, AbstractC23006a0.m117905e(), AbstractC16803z.default_avatar, this.f76663X0, c14848g, C23278z2.m120110a());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: nN */
    void m83296nN(int i11) {
        this.f76679f1.getLayoutParams().height = i11;
        this.f76679f1.requestLayout();
    }

    /* renamed from: oN */
    void m83297oN(boolean z11, int i11) {
        String m118743r0;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                MultiStateView multiStateView = this.f76696n2;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f76696n2.setState(MultiStateView.EnumC15914e.LOADING);
                    return;
                }
                return;
            }
            if (i11 == 0) {
                this.f76696n2.setVisibility(8);
                return;
            }
            if (i11 != 17007) {
                if (i11 != 50001) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loading_group_members);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire);
            }
            this.f76696n2.setState(MultiStateView.EnumC15914e.ERROR);
            this.f76696n2.setErrorTitleString(m118743r0);
            MultiStateView multiStateView2 = this.f76696n2;
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView2.setErrorType(enumC15915f);
            this.f76696n2.setVisibility(0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        MediaItem mediaItem;
        if (i11 != 1000) {
            if (i11 == 1001 && i12 == -1) {
                try {
                    String stringExtra = intent.getStringExtra("extra_result_output_path");
                    String stringExtra2 = intent.getStringExtra("extra_result_camera_log");
                    if (TextUtils.isEmpty(stringExtra2)) {
                        stringExtra2 = new C20612c(-1, 1).m107293q();
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        m83295mN(stringExtra, stringExtra2);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            return;
        }
        if (i12 == -1 && intent != null) {
            try {
                List m71440ZM = GalleryPickerView.m71440ZM(intent);
                if (m71440ZM != null && m71440ZM.size() > 0 && (mediaItem = (MediaItem) m71440ZM.get(0)) != null) {
                    String str = "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        str = mediaItem.m41113N();
                    } else if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                        str = mediaItem.mo41081Q();
                    }
                    String m41175w = mediaItem.m41175w();
                    if (TextUtils.isEmpty(m41175w)) {
                        m41175w = new C20612c(-1, 0).m107293q();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m83295mN(str, m41175w);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RecyclerView recyclerView;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.imv_avatar) {
            m83310uN();
            m83280Ka(0);
            return;
        }
        if (id2 == AbstractC6918a0.et_group_name) {
            if (!this.f76714w2) {
                this.f76651R0.requestFocus();
                m83301qN(0);
                AbstractC23136l9.m118693a1(this.f76651R0, AbstractC16803z.stencils_bg_edit_text);
                m83299pN(this.f76704r2);
                m83306sN(0);
                this.f76651R0.setCursorVisible(true);
                m83280Ka(1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_emo) {
            if (this.f76638K2 == 2) {
                m83280Ka(1);
                return;
            } else {
                m83280Ka(2);
                return;
            }
        }
        if (id2 == AbstractC6918a0.btn_done_input_group_name) {
            m83263AM(false);
            m83268CM();
            QuickCreateGroupChildTabView m83270DM = m83270DM();
            if (m83270DM != null && (recyclerView = m83270DM.f76595N0) != null) {
                recyclerView.m9837K1(0);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_input_type) {
            this.f76625E1 = !this.f76625E1;
            m83274FN();
        } else if (id2 == AbstractC6918a0.btn_done_create_group) {
            if (this.f76627F1 == 4) {
                AbstractC23647d.m123897g("10300145");
            }
            if (this.f76627F1 == 4 && m83315xM() > 0) {
                this.f72421L0.showDialog(4);
            } else {
                m83318zM();
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.et_group_name) {
            if (keyEvent.getAction() != 1 || i11 != 66) {
                return false;
            }
            m83263AM(false);
            m83268CM();
            return true;
        }
        if (id2 != AbstractC6918a0.edt_search || keyEvent.getAction() != 1 || i11 != 66) {
            return false;
        }
        m83280Ka(0);
        this.f76653S0.setCursorVisible(true);
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                View view = this.f76665Y0;
                if (view != null && view.getVisibility() == 0) {
                    m83263AM(true);
                    return true;
                }
                return m83314wM();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("QuickCreateGroupView", e11);
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 111) {
            try {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118177s()) == 0) {
                    m83313vN();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.r90
                public /* synthetic */ r90() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickCreateGroupView.this.m83240XM();
                }
            }, 200L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pM */
    void m83298pM() {
        short s7 = this.f76627F1;
        if (s7 != 10 && s7 != 11) {
            ArrayList arrayList = new ArrayList();
            this.f76693m1.clear();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = this.f76687j1.iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (AbstractC21935u.m114554u(inviteContactProfile.f42434r)) {
                    arrayList2.add(inviteContactProfile);
                } else {
                    inviteContactProfile.f42373R0 = 31;
                    arrayList3.add(inviteContactProfile);
                }
            }
            if (!arrayList3.isEmpty()) {
                InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                inviteContactProfile2.f42434r = "ALL_STRANGERS_SECTION_HEADER_ID";
                inviteContactProfile2.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_clone_existing_group_section_strangers);
                inviteContactProfile2.m40403e1(false);
                inviteContactProfile2.f42542f2 = true;
                this.f76693m1.put(inviteContactProfile2, new ArrayList(arrayList3));
                arrayList3.add(0, inviteContactProfile2);
                ((InviteContactProfile) arrayList3.get(arrayList3.size() - 1)).f42405d1 = true;
                arrayList.addAll(0, arrayList3);
            }
            if (!arrayList2.isEmpty()) {
                InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                inviteContactProfile3.f42434r = "ALL_FRIENDS_SECTION_HEADER_ID";
                inviteContactProfile3.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_clone_existing_group_section_friends);
                inviteContactProfile3.m40403e1(false);
                inviteContactProfile3.f42542f2 = true;
                this.f76693m1.put(inviteContactProfile3, new ArrayList(arrayList2));
                arrayList2.add(0, inviteContactProfile3);
                ((InviteContactProfile) arrayList2.get(arrayList2.size() - 1)).f42405d1 = true;
                arrayList.addAll(0, arrayList2);
            }
            this.f76685i1.addAll(arrayList);
            m83305sM();
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        if (!this.f76697o1.isEmpty()) {
            for (int i11 = 0; i11 < this.f76697o1.size(); i11++) {
                ArrayList arrayList5 = new ArrayList();
                InviteContactProfile inviteContactProfile4 = (InviteContactProfile) this.f76697o1.get(i11);
                inviteContactProfile4.m40403e1(false);
                inviteContactProfile4.f42542f2 = true;
                inviteContactProfile4.f42543g2 = ((Boolean) this.f76699p1.get(inviteContactProfile4)).booleanValue();
                arrayList5.addAll((Collection) this.f76695n1.get(inviteContactProfile4));
                this.f76693m1.put(inviteContactProfile4, (List) this.f76695n1.get(inviteContactProfile4));
                if (inviteContactProfile4.f42543g2) {
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        m83294lN((InviteContactProfile) it2.next());
                    }
                }
                arrayList5.add(0, inviteContactProfile4);
                ((InviteContactProfile) arrayList5.get(arrayList5.size() - 1)).f42405d1 = true;
                arrayList4.addAll(arrayList5);
            }
            this.f76689k1.addAll(arrayList4);
        }
        this.f76685i1.addAll(arrayList4);
        m83305sM();
    }

    /* renamed from: pN */
    void m83299pN(int i11) {
        EditText editText = this.f76651R0;
        if (editText != null) {
            editText.setPadding(AbstractC23136l9.m118742r(3.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(i11), 0);
            this.f76651R0.requestLayout();
        }
    }

    /* renamed from: qM */
    public void m83300qM(int i11, int i12) {
        p90 p90Var = new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.p90

            /* renamed from: q */
            public final /* synthetic */ int f81566q;

            /* renamed from: r */
            public final /* synthetic */ int f81567r;

            public /* synthetic */ p90(int i122, int i112) {
                r2 = i122;
                r3 = i112;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                QuickCreateGroupView.this.m83236TM(r2, r3, valueAnimator);
            }
        };
        C14842a c14842a = new C14842a(i112);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f76667Z0, (Property<View, Float>) View.TRANSLATION_Y, 0.0f).setDuration(i122);
        duration.addListener(c14842a);
        duration.addUpdateListener(p90Var);
        duration.start();
    }

    /* renamed from: qN */
    void m83301qN(int i11) {
        this.f76671b1.setVisibility(i11);
        if (i11 == 0) {
            m83299pN(this.f76704r2);
        } else {
            m83299pN(0);
        }
        AppCompatImageView appCompatImageView = this.f76673c1;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(i11);
        }
    }

    /* renamed from: rM */
    public void m83302rM(int i11, int i12, boolean z11) {
        C14861t c14861t = new C14861t(i11, z11);
        q90 q90Var = new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.q90

            /* renamed from: q */
            public final /* synthetic */ int f81686q;

            /* renamed from: r */
            public final /* synthetic */ int f81687r;

            public /* synthetic */ q90(int i122, int i112) {
                r2 = i122;
                r3 = i112;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                QuickCreateGroupView.this.m83237UM(r2, r3, valueAnimator);
            }
        };
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f76667Z0, (Property<View, Float>) View.TRANSLATION_Y, 0.0f).setDuration(i122);
        duration.addListener(c14861t);
        duration.addUpdateListener(q90Var);
        duration.start();
    }

    /* renamed from: rN */
    void m83303rN(int i11) {
        if (AbstractC23184q2.m119445c()) {
            this.f76700p2.setVisibility(i11);
            if (i11 == 0) {
                this.f76653S0.setPadding(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(8.0f));
                return;
            } else {
                if (i11 == 8) {
                    this.f76653S0.setPadding(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(8.0f));
                    return;
                }
                return;
            }
        }
        this.f76700p2.setVisibility(8);
        this.f76653S0.setPadding(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(8.0f));
    }

    /* renamed from: rc */
    public int m83304rc() {
        return this.f76638K2;
    }

    /* renamed from: sM */
    void m83305sM() {
        for (Map.Entry entry : this.f76693m1.entrySet()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) entry.getKey();
            List list = (List) entry.getValue();
            boolean z11 = false;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                boolean z12 = true;
                while (it.hasNext()) {
                    if (!this.f76654S1.m155391e((InviteContactProfile) it.next())) {
                        z12 = false;
                    }
                }
                z11 = z12;
            }
            inviteContactProfile.f42543g2 = z11;
        }
    }

    /* renamed from: sN */
    void m83306sN(int i11) {
        if (this.f76710u2 != this.f76708t2 && i11 == 0) {
            this.f76679f1.setVisibility(i11);
            m83302rM(this.f76708t2 - this.f76710u2, this.f76712v2, true);
        } else if (this.f76679f1.getVisibility() != 8 && i11 == 8) {
            m83300qM(this.f76710u2, this.f76712v2);
        }
    }

    /* renamed from: tM */
    public void m83307tM(InviteContactProfile inviteContactProfile, String str) {
        if (inviteContactProfile == null) {
            return;
        }
        if (this.f76654S1.m155391e(inviteContactProfile)) {
            m83312vM(inviteContactProfile);
        } else {
            AbstractC23647d.m123897g(str);
            m83309uM(inviteContactProfile);
        }
    }

    /* renamed from: tN */
    void m83308tN() {
        MultiStateView multiStateView = (MultiStateView) this.f76641M0.findViewById(AbstractC6918a0.multi_state);
        this.f76696n2 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.j90
            public /* synthetic */ j90() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                QuickCreateGroupView.this.m83242ZM();
            }
        });
        this.f76696n2.setEnableBtnEmpty(false);
        RecyclerView recyclerView = (RecyclerView) this.f76641M0.findViewById(AbstractC6918a0.selected_recycler_view);
        this.f76652R1 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext(), 0, false));
        C7017b5 c7017b5 = new C7017b5(this.f72421L0.getContext(), new C7017b5.a() { // from class: com.zing.zalo.ui.zviews.k90
            public /* synthetic */ k90() {
            }

            @Override // com.zing.zalo.adapters.C7017b5.a
            /* renamed from: a */
            public final void mo35877a(InviteContactProfile inviteContactProfile) {
                QuickCreateGroupView.this.m83243aN(inviteContactProfile);
            }
        });
        this.f76656T1 = c7017b5;
        this.f76652R1.setAdapter(c7017b5);
        C31784b.m152808a(this.f76652R1).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.l90
            public /* synthetic */ l90() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                QuickCreateGroupView.this.m83244bN(recyclerView2, i11, view);
            }
        });
        this.f76677e1 = this.f76641M0.findViewById(AbstractC6918a0.header_view);
        LinearLayout linearLayout = (LinearLayout) this.f76641M0.findViewById(AbstractC6918a0.layout_update_avatar);
        this.f76679f1 = linearLayout;
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14854m());
        this.f76696n2.bringToFront();
        this.f76655T0 = this.f76641M0.findViewById(AbstractC6918a0.avatar_container);
        AvatarImageView avatarImageView = (AvatarImageView) this.f76641M0.findViewById(AbstractC6918a0.imv_avatar);
        this.f76657U0 = avatarImageView;
        avatarImageView.setOnClickListener(this);
        this.f76659V0 = (ProgressBar) this.f76641M0.findViewById(AbstractC6918a0.pb_upload_avatar);
        EditText editText = (EditText) this.f76641M0.findViewById(AbstractC6918a0.et_group_name);
        this.f76651R0 = editText;
        editText.addTextChangedListener(new C14855n());
        this.f76651R0.setOnClickListener(this);
        this.f76651R0.setOnKeyListener(this);
        this.f76694m2 = this.f76641M0.findViewById(AbstractC6918a0.tab_container);
        this.f76698o2 = this.f76641M0.findViewById(AbstractC6918a0.dock_view);
        this.f76653S0 = (CustomEditText) this.f76641M0.findViewById(AbstractC6918a0.edt_search);
        if (AbstractC23184q2.m119445c()) {
            this.f76653S0.setHint(AbstractC8020f0.hint_search_create_group);
        } else {
            this.f76653S0.setHint(AbstractC8020f0.hint_search_member);
        }
        this.f76653S0.setOnTouchListener(new ViewOnTouchListenerC14856o());
        this.f76653S0.setOnKeyListener(this);
        this.f76653S0.addTextChangedListener(new C14857p());
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f76641M0.findViewById(AbstractC6918a0.btn_input_type);
        this.f76700p2 = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        this.f76702q2 = (RobotoTextView) this.f76641M0.findViewById(AbstractC6918a0.tab_desc);
        if (this.f76682g2.isEmpty()) {
            this.f76702q2.setVisibility(8);
        } else {
            this.f76702q2.setVisibility(0);
            this.f76702q2.setText(this.f76682g2);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.f76641M0.findViewById(AbstractC6918a0.section_footer);
        this.f76645O0 = linearLayout2;
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) this.f76641M0.findViewById(AbstractC6918a0.content_section_footer);
        this.f76647P0 = linearLayout3;
        linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14858q());
        View findViewById = this.f76641M0.findViewById(AbstractC6918a0.main_container);
        this.f76649Q0 = findViewById;
        this.f76641M0.setTopViewGroup(findViewById);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f76641M0.findViewById(AbstractC6918a0.btn_done_create_group);
        this.f76643N0 = appCompatImageView2;
        appCompatImageView2.setOnClickListener(this);
        this.f76667Z0 = this.f76641M0.findViewById(AbstractC6918a0.main_layout);
        this.f76664X1 = (ViewStub) this.f76641M0.findViewById(AbstractC6918a0.viewstub_sticker_panel);
        this.f76641M0.setOnKeyboardListener(new C14859r());
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.f76641M0.findViewById(AbstractC6918a0.btn_emo);
        this.f76671b1 = appCompatImageView3;
        appCompatImageView3.setBackgroundDrawable(AbstractC23136l9.m118718j(this.f76641M0.getContext()));
        m83301qN(8);
        this.f76671b1.setOnClickListener(this);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) this.f76641M0.findViewById(AbstractC6918a0.btn_done_input_group_name);
        this.f76673c1 = appCompatImageView4;
        appCompatImageView4.setBackgroundDrawable(AbstractC23136l9.m118718j(this.f76641M0.getContext()));
        this.f76673c1.setOnClickListener(this);
        RecyclerView recyclerView2 = (RecyclerView) this.f76641M0.findViewById(AbstractC6918a0.search_recycle_view);
        this.f76648P1 = recyclerView2;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext()));
        QuickCreateGroupAdapter quickCreateGroupAdapter = new QuickCreateGroupAdapter(this.f72421L0.getContext(), this.f76654S1.m155394h(), true, -1);
        this.f76650Q1 = quickCreateGroupAdapter;
        this.f76648P1.setAdapter(quickCreateGroupAdapter);
        C31784b.m152808a(this.f76648P1).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.m90
            public /* synthetic */ m90() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView3, int i11, View view) {
                QuickCreateGroupView.this.m83245cN(recyclerView3, i11, view);
            }
        });
        this.f76650Q1.m35817P(this.f76630G2);
        this.f76648P1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.n90
            public /* synthetic */ n90() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m83247dN;
                m83247dN = QuickCreateGroupView.this.m83247dN(view, motionEvent);
                return m83247dN;
            }
        });
        short s7 = this.f76627F1;
        if (s7 != 10 && s7 != 11) {
            if (s7 != 4) {
                m83287SM();
                m83284OM();
                m83292iN();
                m83285PM();
                m83293kN();
            }
        } else {
            m83286QM();
            m83292iN();
        }
        f76612M2 = 0;
        f76613N2 = 1;
        f76614O2 = 2;
        f76615P2 = 3;
        if (this.f76681g1.size() == 0) {
            f76612M2 = -1;
            f76613N2--;
            f76614O2--;
            f76615P2--;
            this.f76641M0.findViewById(AbstractC6918a0.tab_suggest).setVisibility(8);
        }
        if (this.f76683h1.m155397k() < 5) {
            f76613N2 = -1;
            f76614O2--;
            f76615P2--;
            this.f76641M0.findViewById(AbstractC6918a0.tab_recently).setVisibility(8);
        }
        int i11 = f76615P2;
        TextView[] textViewArr = new TextView[i11];
        this.f76688j2 = textViewArr;
        this.f76690k2 = new View[i11];
        this.f76692l2 = new View[i11];
        int i12 = f76612M2;
        if (i12 >= 0) {
            textViewArr[i12] = (TextView) this.f76641M0.findViewById(AbstractC6918a0.tv_suggest);
            this.f76688j2[f76612M2].setText(this.f76716x2);
            this.f76690k2[f76612M2] = this.f76641M0.findViewById(AbstractC6918a0.tab_suggest);
            this.f76692l2[f76612M2] = this.f76641M0.findViewById(AbstractC6918a0.line_suggest);
        }
        int i13 = f76613N2;
        if (i13 >= 0) {
            this.f76688j2[i13] = (TextView) this.f76641M0.findViewById(AbstractC6918a0.tv_recently);
            this.f76690k2[f76613N2] = this.f76641M0.findViewById(AbstractC6918a0.tab_recently);
            this.f76692l2[f76613N2] = this.f76641M0.findViewById(AbstractC6918a0.line_recently);
        }
        int i14 = f76614O2;
        if (i14 >= 0) {
            this.f76688j2[i14] = (TextView) this.f76641M0.findViewById(AbstractC6918a0.tv_phonebook);
            this.f76690k2[f76614O2] = this.f76641M0.findViewById(AbstractC6918a0.tab_phonebook);
            this.f76692l2[f76614O2] = this.f76641M0.findViewById(AbstractC6918a0.line_phonebook);
            if (f76614O2 == 0) {
                this.f76694m2.setVisibility(8);
            }
        }
        for (int i15 = 0; i15 < f76615P2; i15++) {
            this.f76690k2[i15].setVisibility(0);
            this.f76690k2[i15].setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.o90

                /* renamed from: q */
                public final /* synthetic */ int f81450q;

                public /* synthetic */ o90(int i152) {
                    r2 = i152;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickCreateGroupView.this.m83249eN(r2, view);
                }
            });
        }
        ViewPager viewPager = (ViewPager) this.f76641M0.findViewById(AbstractC6918a0.pager);
        this.f76684h2 = viewPager;
        viewPager.addOnPageChangeListener(new C14860s());
        C7162o5 c7162o5 = new C7162o5(this.f72421L0.m92649TI());
        this.f76686i2 = c7162o5;
        this.f76684h2.setAdapter(c7162o5);
        this.f76684h2.setOffscreenPageLimit(f76615P2);
        this.f76653S0.setCursorVisible(false);
        this.f76651R0.setCursorVisible(false);
        m83273EN();
        m83303rN(0);
    }

    /* renamed from: uM */
    public void m83309uM(InviteContactProfile inviteContactProfile) {
        if (this.f76654S1.m155391e(inviteContactProfile)) {
            return;
        }
        int m155397k = this.f76654S1.m155397k() + 1;
        int i11 = this.f76711v1;
        if (m155397k < i11) {
            if (m83315xM() >= this.f76713w1) {
                this.f72421L0.showDialog(2);
                return;
            }
            if (!AbstractC21935u.m114554u(inviteContactProfile.f42434r) && this.f76627F1 != 4 && inviteContactProfile.f42540d2 != null && !this.f76660V1.m155391e(inviteContactProfile)) {
                this.f76660V1.m155387a(inviteContactProfile);
                this.f76691l1.m155387a(inviteContactProfile);
                m83292iN();
                QuickCreateGroupChildTabView m83276HM = m83276HM();
                if (m83276HM != null) {
                    m83276HM.m83232nM();
                }
            }
            if (this.f76653S0.isFocused()) {
                this.f76653S0.setText("");
            }
            m83294lN(inviteContactProfile);
            m83311ug();
            this.f76656T1.m35875O();
            m83290hN();
            m83317yN();
            m83269CN();
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_warning_limit_member_to_invite, Integer.valueOf(i11)));
        }
        m83273EN();
    }

    /* renamed from: uN */
    public void m83310uN() {
        try {
            AbstractC23647d.m123897g("27411");
            this.f76636J2 = AvatarPickerView.m78263nL(new C14847f(), this.f76617A1, false);
            this.f72421L0.m92649TI().m93060e2(0, this.f76636J2, "AvatarPickerView", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ug */
    public void m83311ug() {
        C7017b5 c7017b5 = this.f76656T1;
        if (c7017b5 != null) {
            c7017b5.m35876P(this.f76654S1.m155392f());
            this.f76656T1.m10008p();
            m83317yN();
        }
    }

    /* renamed from: vM */
    public void m83312vM(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile != null) {
            this.f76656T1.m35872L(inviteContactProfile.f42434r);
            m83266BN(inviteContactProfile);
            m83269CN();
            m83311ug();
            m83290hN();
            m83317yN();
            m83273EN();
        }
    }

    /* renamed from: vN */
    void m83313vN() {
        if (AbstractC23238v2.m119727l()) {
            CameraInputParams m39200j = CameraInputParams.m39200j();
            m39200j.f41138w0 = new SensitiveData("create_group_avatar_camera", "group_avatar");
            AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 1001, 1, m39200j);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
    }

    /* renamed from: wM */
    boolean m83314wM() {
        if (TextUtils.isEmpty(this.f76651R0.getText()) && this.f76654S1.m155397k() <= 0 && TextUtils.isEmpty(this.f76661W0)) {
            AbstractC23647d.m123897g("27424");
            if (this.f76627F1 == 6) {
                AbstractC23647d.m123897g("27435");
            }
            finish();
            return false;
        }
        this.f72421L0.showDialog(3);
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (AbstractC23184q2.m119459q(this.f76662W1, i11, objArr)) {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            if (this.f76663X0 == null) {
                this.f76663X0 = C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar);
            }
            m83282MM();
            C0815e1.m2075D().m2100V(new C23648e(5, this.f76678e2, 1, "gr_create", this.f76680f2), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    int m83315xM() {
        ArrayList m155392f = this.f76660V1.m155392f();
        Iterator it = this.f76654S1.m155392f().iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (inviteContactProfile.m40381O0()) {
                i12++;
            } else if (m155392f.contains(inviteContactProfile)) {
                i11++;
            }
        }
        return i11 + i12;
    }

    /* renamed from: yM */
    void m83316yM(String str) {
        int i11 = this.f76629G1;
        if (i11 >= 0) {
            if (i11 == 1 && this.f76633I1 != null) {
                if (!TextUtils.isEmpty(str)) {
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14850i(str));
                    C31961i8 c31961i8 = this.f76633I1;
                    c0766k.mo1513Q3("", str, c31961i8.f146881b, c31961i8.m153667e(), this.f76635J1, this.f76637K1, this.f76639L1, this.f76642M1, this.f76644N1, this.f76646O1);
                    return;
                }
                return;
            }
            if (i11 == 0 && this.f76631H1 != null) {
                C0766k c0766k2 = new C0766k();
                c0766k2.mo1704o8(new C14851j());
                ArrayList arrayList = new ArrayList();
                C19411c.a aVar = new C19411c.a();
                aVar.f96288b = new C19411c.a.c(str, C0943w.m4462l().m4472f(str).m153793y());
                C19411c c19411c = this.f76631H1;
                C19411c.a aVar2 = c19411c.f96281u;
                if (aVar2 != null) {
                    aVar.f96293g = aVar2.f96293g;
                }
                arrayList.add(new C31997l(0, Integer.valueOf(c19411c.f96279s)));
                arrayList.add(new C31997l(2, aVar.m101534a()));
                arrayList.add(new C31997l(3, new Object[]{this.f76631H1.f96273m, null}));
                arrayList.add(new C31997l(9, this.f76631H1.f96282v.m101542a()));
                arrayList.add(new C31997l(6, new Object[]{Integer.valueOf(this.f76631H1.f96272l), Long.valueOf(this.f76631H1.f96262b), Long.valueOf(this.f76631H1.f96262b), Integer.valueOf(this.f76631H1.f96266f)}));
                arrayList.add(new C31997l(7, Integer.valueOf(this.f76631H1.f96276p)));
                arrayList.add(new C31997l(8, Integer.valueOf(this.f76631H1.f96277q)));
                arrayList.add(new C31997l(4, this.f76631H1.f96270j));
                arrayList.add(new C31997l(10, Integer.valueOf(this.f76635J1 ? 1 : 0)));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("srcType", 7);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                c0766k2.mo1388A7(arrayList, jSONObject.toString());
            }
        }
    }

    /* renamed from: yN */
    void m83317yN() {
        try {
            if (this.f76654S1.m155397k() > 0) {
                this.f76645O0.setVisibility(0);
                this.f76647P0.setOnClickListener(null);
            } else {
                this.f76645O0.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: zM */
    void m83318zM() {
        boolean z11;
        double d11;
        double d12;
        String jSONObject;
        C31973j5 m4472f;
        C31973j5 m4472f2;
        AbstractC23647d.m123897g("27410");
        if (this.f76654S1.m155397k() == 0 || this.f76709u1) {
            return;
        }
        this.f76709u1 = true;
        String obj = this.f76651R0.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            if (this.f76715x1 == 1) {
                ToastUtils.m89266n(AbstractC8020f0.str_require_group_name, new Object[0]);
                this.f76651R0.requestFocus();
                m83280Ka(1);
                this.f76709u1 = false;
                return;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42437s)) {
                    sb2.append(AbstractC23304d.f113368c0.f42437s);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.f76654S1.m155397k() && i11 < 2; i12++) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f76654S1.m155392f().get(i12);
                    if (!inviteContactProfile.m40381O0()) {
                        sb2.append(", ");
                        sb2.append(inviteContactProfile.mo2475c());
                        i11++;
                    }
                }
                obj = sb2.toString();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f76654S1.m155397k() == 1 && !z11) {
            InviteContactProfile inviteContactProfile2 = (InviteContactProfile) this.f76654S1.m155392f().get(0);
            if (!inviteContactProfile2.m40381O0()) {
                m83278JM(inviteContactProfile2.f42434r);
                return;
            } else {
                this.f76709u1 = false;
                return;
            }
        }
        if (this.f76654S1.m155397k() == 1) {
            if (z11) {
                AbstractC23647d.m123897g("27415");
            }
        } else if (this.f76654S1.m155397k() >= 2) {
            if (z11) {
                AbstractC23647d.m123897g("27417");
            } else {
                AbstractC23647d.m123897g("27416");
            }
        }
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14843b());
        if (obj.length() > 50) {
            obj = obj.substring(0, 50);
        }
        String str = obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        Location m141673c = C28157p5.m141667d().m141673c();
        if (m141673c != null) {
            d11 = m141673c.getLatitude();
            d12 = m141673c.getLongitude();
        } else {
            d11 = 0.0d;
            d12 = 0.0d;
        }
        String c32039nb = new C32039nb(this.f76670a2, System.currentTimeMillis(), false).toString();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = this.f76654S1.m155392f().iterator();
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile3 = (InviteContactProfile) it.next();
            if (inviteContactProfile3.m40381O0()) {
                arrayList2.add(inviteContactProfile3.f42434r.substring(12));
            } else {
                arrayList3.add(inviteContactProfile3);
            }
        }
        short s7 = this.f76627F1;
        if (s7 != 10) {
            if (s7 != 11) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("title", this.f76703r1);
                    if (!TextUtils.isEmpty(this.f76705s1) && (m4472f2 = C0943w.m4462l().m4472f(this.f76705s1)) != null && m4472f2.m153716G() != 0) {
                        jSONObject2.put("groupName", m4472f2.m153793y());
                    }
                } catch (JSONException e12) {
                    JSONObject jSONObject3 = new JSONObject();
                    AbstractC23350e.m122778h(e12);
                    jSONObject2 = jSONObject3;
                }
                jSONObject = jSONObject2.toString();
            }
        } else {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("title", this.f76701q1);
                if (!TextUtils.isEmpty(this.f76705s1) && (m4472f = C0943w.m4462l().m4472f(this.f76705s1)) != null && m4472f.m153716G() != 0) {
                    jSONObject4.put("groupName", m4472f.m153793y());
                }
            } catch (JSONException e13) {
                JSONObject jSONObject5 = new JSONObject();
                AbstractC23350e.m122778h(e13);
                jSONObject4 = jSONObject5;
            }
            jSONObject = jSONObject4.toString();
        }
        c0766k.mo1721q9(c32039nb, str, "", arrayList3, z11, this.f76619B1, 0, 0, true, this.f76627F1, arrayList, d11, d12, arrayList2, jSONObject);
    }

    /* renamed from: zN */
    void m83319zN() {
        try {
            EditText editText = this.f76651R0;
            if (editText != null) {
                editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f76651R0.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
