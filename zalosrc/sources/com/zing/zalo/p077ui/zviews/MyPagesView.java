package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7139m4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.zviews.MyPagesView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22033k0;
import me0.AbstractC23006a0;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23188q6;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p140ev.C18613b;
import p172fy.C19171b;
import p266jg.AbstractC21244b;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p594w1.C28685a;
import p716zh.C31853b5;
import p716zh.C31980jc;
import p716zh.C32002l4;
import v50.C27870vb;
import wd0.C28927g;

/* loaded from: classes6.dex */
public class MyPagesView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: C1 */
    KeyEventCallbackC17462c f75553C1;

    /* renamed from: N0 */
    FrameLayout f75557N0;

    /* renamed from: O0 */
    LinearLayout f75558O0;

    /* renamed from: P0 */
    View f75559P0;

    /* renamed from: Q0 */
    View f75560Q0;

    /* renamed from: R0 */
    View f75561R0;

    /* renamed from: S0 */
    LinearLayout f75562S0;

    /* renamed from: T0 */
    RecyclingImageView f75563T0;

    /* renamed from: U0 */
    RecyclingImageView f75564U0;

    /* renamed from: V0 */
    TextView f75565V0;

    /* renamed from: W0 */
    TextView f75566W0;

    /* renamed from: X0 */
    TextView f75567X0;

    /* renamed from: Y0 */
    LinearLayout f75568Y0;

    /* renamed from: Z0 */
    View f75569Z0;

    /* renamed from: a1 */
    TextView f75570a1;

    /* renamed from: b1 */
    ListView f75571b1;

    /* renamed from: d1 */
    C7139m4 f75573d1;

    /* renamed from: k1 */
    C23528a f75580k1;

    /* renamed from: u1 */
    MultiStateView f75590u1;

    /* renamed from: M0 */
    final String f75556M0 = MyPagesView.class.getSimpleName();

    /* renamed from: c1 */
    final C31853b5 f75572c1 = new C31853b5();

    /* renamed from: e1 */
    ContactProfile f75574e1 = new ContactProfile();

    /* renamed from: f1 */
    int f75575f1 = 0;

    /* renamed from: g1 */
    final String f75576g1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: h1 */
    String f75577h1 = "";

    /* renamed from: i1 */
    String f75578i1 = "";

    /* renamed from: j1 */
    int f75579j1 = 1;

    /* renamed from: l1 */
    boolean f75581l1 = false;

    /* renamed from: m1 */
    boolean f75582m1 = false;

    /* renamed from: n1 */
    int f75583n1 = 0;

    /* renamed from: o1 */
    String f75584o1 = "";

    /* renamed from: p1 */
    float f75585p1 = 0.0f;

    /* renamed from: q1 */
    float f75586q1 = 0.0f;

    /* renamed from: r1 */
    boolean f75587r1 = false;

    /* renamed from: s1 */
    boolean f75588s1 = false;

    /* renamed from: t1 */
    boolean f75589t1 = false;

    /* renamed from: v1 */
    Handler f75591v1 = new Handler();

    /* renamed from: w1 */
    BroadcastReceiver f75592w1 = new C14685a();

    /* renamed from: x1 */
    AbstractC22055v0.l f75593x1 = new C14687c();

    /* renamed from: y1 */
    boolean f75594y1 = false;

    /* renamed from: z1 */
    boolean f75595z1 = false;

    /* renamed from: A1 */
    InterfaceC0765j f75551A1 = new C0766k();

    /* renamed from: B1 */
    InterfaceC20094a f75552B1 = new C14688d();

    /* renamed from: D1 */
    boolean f75554D1 = false;

    /* renamed from: E1 */
    InterfaceC20094a f75555E1 = new C14689e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$a */
    /* loaded from: classes6.dex */
    public class C14685a extends BroadcastReceiver {
        C14685a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            C7139m4 c7139m4;
            ListView listView;
            ContactProfile contactProfile;
            try {
                if (MyPagesView.this.f72421L0.m92674mJ() && !MyPagesView.this.f72421L0.m92677nJ()) {
                    String str2 = "";
                    if (intent == null) {
                        str = "";
                    } else {
                        str = intent.getAction();
                    }
                    if (intent != null && intent.hasExtra("uid")) {
                        str2 = intent.getStringExtra("uid");
                    }
                    if ("com.zing.zalo.ACTION_REFRESH_AFTER_FOLLOW_PAGE".equals(str)) {
                        MyPagesView myPagesView = MyPagesView.this;
                        if (myPagesView.f75595z1) {
                            myPagesView.f75583n1 = 1;
                            myPagesView.f75584o1 = str2;
                            return;
                        }
                        if (C21927m.m114302u().m114357s().m153137g(str2)) {
                            contactProfile = C23024b7.f111993a.m118065l(str2, false);
                        } else {
                            contactProfile = null;
                        }
                        if (contactProfile != null && !MyPagesView.this.f75572c1.m153137g(contactProfile.f42434r)) {
                            contactProfile.f42440t = AbstractC23262x6.m120002o(contactProfile.f42437s);
                            MyPagesView.this.f75572c1.add(contactProfile);
                        }
                        MyPagesView.this.m82282DM();
                        return;
                    }
                    if ("com.zing.zalo.ACTION_REFRESH_AFTER_UNFOLLOW_PAGE".equals(str)) {
                        MyPagesView myPagesView2 = MyPagesView.this;
                        if (myPagesView2.f75595z1) {
                            myPagesView2.f75583n1 = 2;
                            myPagesView2.f75584o1 = str2;
                            return;
                        } else {
                            myPagesView2.m82283EM(str2);
                            return;
                        }
                    }
                    if ("com.zing.zalo.ACTION_SCROLL_TO_TOP_PAGES_LIST".equals(str) && (c7139m4 = MyPagesView.this.f75573d1) != null && c7139m4.getCount() > 0 && (listView = MyPagesView.this.f75571b1) != null) {
                        listView.setSelection(0);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(MyPagesView.this.f75556M0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$b */
    /* loaded from: classes6.dex */
    public class C14686b implements AbsListView.OnScrollListener {
        C14686b() {
        }

        /* renamed from: b */
        public /* synthetic */ void m82298b() {
            try {
                MyPagesView myPagesView = MyPagesView.this;
                if (myPagesView.f75589t1 && myPagesView.f72421L0.m92650VI() != null && (MyPagesView.this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                    ((ContactGroupMyPagesView) MyPagesView.this.f72421L0.m92650VI()).m67741rM(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            boolean z11;
            LinearLayout linearLayout;
            boolean z12;
            MyPagesView myPagesView = MyPagesView.this;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            myPagesView.f75589t1 = z11;
            if (i11 + i12 >= i13 - 1 && myPagesView.f75594y1 && !myPagesView.f75595z1 && (linearLayout = myPagesView.f75558O0) != null && linearLayout.getVisibility() != 0 && MyPagesView.this.f75590u1.getVisibility() != 0) {
                MyPagesView myPagesView2 = MyPagesView.this;
                if (!myPagesView2.f75582m1) {
                    int i14 = myPagesView2.f75579j1 + 1;
                    myPagesView2.f75579j1 = i14;
                    myPagesView2.f75594y1 = true;
                    int m117905e = AbstractC23006a0.m117905e();
                    String str = CoreUtility.f89233i;
                    if (MyPagesView.this.f75572c1.size() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    myPagesView2.m82292nM(i14, 100, m117905e, str, z12);
                    return;
                }
                myPagesView2.f75557N0.setVisibility(8);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    MyPagesView.this.f75573d1.m36344i(false);
                    MyPagesView.this.f75573d1.notifyDataSetChanged();
                    MyPagesView myPagesView = MyPagesView.this;
                    if (myPagesView.f75589t1 && myPagesView.f72421L0.m92650VI() != null && (MyPagesView.this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                        ((ContactGroupMyPagesView) MyPagesView.this.f72421L0.m92650VI()).m67741rM(true);
                    }
                    Handler handler = MyPagesView.this.f75591v1;
                    if (handler != null) {
                        handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.p10
                            public /* synthetic */ p10() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MyPagesView.C14686b.this.m82298b();
                            }
                        }, 500L);
                        return;
                    }
                    return;
                }
                MyPagesView.this.f75573d1.m36344i(true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$c */
    /* loaded from: classes6.dex */
    public class C14687c extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$c$a */
        /* loaded from: classes6.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.n f75599a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f75600b;

            /* renamed from: c */
            final /* synthetic */ int f75601c;

            a(AbstractC22055v0.n nVar, C31980jc c31980jc, int i11) {
                this.f75599a = nVar;
                this.f75600b = c31980jc;
                this.f75601c = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                C7139m4 c7139m4;
                try {
                    if (MyPagesView.this.f72421L0.m92672lJ()) {
                        AbstractC22055v0.n nVar = this.f75599a;
                        if (nVar != null) {
                            nVar.mo17230p(this.f75600b, MyPagesView.this.f75580k1);
                        }
                        if (C22013a0.m114928g() && C22013a0.m114924c().m114932h(3) && (c7139m4 = MyPagesView.this.f75573d1) != null) {
                            c7139m4.notifyDataSetChanged();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (MyPagesView.this.f72421L0.m92672lJ() && MyPagesView.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (MyPagesView.this.f72421L0.m92672lJ() && MyPagesView.this.f72421L0.m92687sJ() && hVar != null && bundle != null) {
                    if (this.f75599a == null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    }
                    bundle.putInt("srcType", this.f75601c);
                    AbstractC22055v0.m115127Q(hVar, this.f75599a, MyPagesView.this.f72421L0.m92676n2(), bundle, 0);
                }
            }
        }

        C14687c() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, i11, new a(nVar, c31980jc, i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$d */
    /* loaded from: classes6.dex */
    public class C14688d implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$d$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75604a;

            a(ContactProfile contactProfile) {
                this.f75604a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f75604a);
                C7960e.m41971c6().m42492od(this.f75604a);
            }
        }

        C14688d() {
        }

        /* renamed from: f */
        public /* synthetic */ void m82302f() {
            try {
                MyPagesView myPagesView = MyPagesView.this;
                FrameLayout frameLayout = myPagesView.f75557N0;
                if (frameLayout != null && myPagesView.f75558O0 != null) {
                    frameLayout.setVisibility(8);
                    MyPagesView.this.f75558O0.setVisibility(8);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* renamed from: g */
        public /* synthetic */ void m82303g() {
            try {
                MyPagesView.this.m82281CM();
                MyPagesView myPagesView = MyPagesView.this;
                myPagesView.f75594y1 = false;
                FrameLayout frameLayout = myPagesView.f75557N0;
                if (frameLayout != null && myPagesView.f75558O0 != null) {
                    frameLayout.setVisibility(8);
                    MyPagesView.this.f75558O0.setVisibility(8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122774d(MyPagesView.this.f75556M0, e11.toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        public /* synthetic */ void m82304h(C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            try {
                C31853b5 m114357s = C21927m.m114302u().m114357s();
                ArrayList arrayList = new ArrayList();
                int size = m114357s.size();
                for (int i12 = 0; i12 < size - 1; i12++) {
                    ContactProfile m118065l = C23024b7.f111993a.m118065l(((ContactProfile) m114357s.get(i12)).f42434r, false);
                    if (m118065l != null) {
                        arrayList.add(m118065l);
                    }
                }
                MyPagesView.this.f75572c1.clear();
                MyPagesView.this.f75572c1.addAll(arrayList);
                MyPagesView.this.m82281CM();
                MyPagesView.this.m82291mM();
                if (MyPagesView.this.f75572c1.size() <= 0) {
                    MyPagesView.this.f75590u1.setVisibility(0);
                    MyPagesView.this.f75590u1.setState(MultiStateView.EnumC15914e.ERROR);
                    MultiStateView multiStateView = MyPagesView.this.f75590u1;
                    if (c20096c.m104491c() == 50001) {
                        i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                    } else {
                        i11 = AbstractC8020f0.str_txt_load_followlist_error;
                    }
                    multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                    MultiStateView multiStateView2 = MyPagesView.this.f75590u1;
                    if (c20096c.m104491c() == 50001) {
                        enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                    } else {
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    }
                    multiStateView2.setErrorType(enumC15915f);
                    return;
                }
                MyPagesView.this.f75594y1 = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (MyPagesView.this.f72421L0.m92676n2() != null) {
                MyPagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.q10

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f81656q;

                    public /* synthetic */ q10(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MyPagesView.C14688d.this.m82304h(r2);
                    }
                });
            }
            MyPagesView.this.f75595z1 = false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:110:0x0216, code lost:            if (r3 == 2) goto L174;     */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0191, code lost:            if (r3 == 2) goto L174;     */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0193, code lost:            r0.m82283EM(r0.f75584o1);     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            MyPagesView myPagesView;
            ContactProfile contactProfile;
            ContactProfile contactProfile2;
            boolean z11;
            MyPagesView myPagesView2;
            ContactProfile contactProfile3;
            JSONArray jSONArray;
            int i11 = 1;
            int i12 = 0;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                    MyPagesView myPagesView3 = MyPagesView.this;
                    if (myPagesView3.f75579j1 == 1) {
                        myPagesView3.f75572c1.clear();
                    }
                    MyPagesView myPagesView4 = MyPagesView.this;
                    if (optJSONObject.optInt("loadmore", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    myPagesView4.f75594y1 = z11;
                    if (optJSONArray.length() > 0) {
                        int i13 = 0;
                        while (i13 < optJSONArray.length()) {
                            try {
                                JSONObject jSONObject = (JSONObject) optJSONArray.get(i13);
                                String optString = jSONObject.optString("uid");
                                boolean optBoolean = jSONObject.optBoolean("is_fan");
                                String optString2 = jSONObject.optString("avt");
                                String optString3 = jSONObject.optString("stt");
                                int optInt = jSONObject.optInt("ttf");
                                String optString4 = jSONObject.optString("dpn");
                                boolean optBoolean2 = jSONObject.optBoolean("chatable");
                                int optInt2 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                int optInt3 = jSONObject.optInt("group_msg", i11);
                                int optInt4 = jSONObject.optInt("acl", i12);
                                String optString5 = jSONObject.optString("desc");
                                jSONArray = optJSONArray;
                                try {
                                    String optString6 = jSONObject.optString("alias");
                                    ContactProfile contactProfile4 = new ContactProfile(optString);
                                    contactProfile4.f42441t0 = optBoolean;
                                    contactProfile4.f42446v = optString2;
                                    contactProfile4.f42458z = optString3;
                                    contactProfile4.f42438s0 = optInt;
                                    contactProfile4.f42437s = optString4;
                                    contactProfile4.f42444u0 = optBoolean2;
                                    contactProfile4.f42447v0 = optInt2;
                                    contactProfile4.f42352K0 = optInt2;
                                    contactProfile4.f42453x0 = optInt3;
                                    contactProfile4.f42440t = AbstractC23262x6.m120002o(optString4);
                                    contactProfile4.f42456y0 = optInt4;
                                    contactProfile4.f42436r1 = new SpannableStringBuilder(optString5);
                                    contactProfile4.f42442t1 = optString6;
                                    if (!MyPagesView.this.f75572c1.m153137g(contactProfile4.f42434r)) {
                                        MyPagesView.this.f75572c1.add(contactProfile4);
                                    }
                                    if (C21927m.m114302u().m114357s() != null) {
                                        if (C21927m.m114302u().m114318P(optString)) {
                                            C21927m.m114302u().m114342k0(optString);
                                        }
                                        C21927m.m114302u().m114357s().add(contactProfile4);
                                    }
                                    C0824j.m2153b(new a(contactProfile4));
                                } catch (Exception e11) {
                                    e = e11;
                                    e.printStackTrace();
                                    i13++;
                                    optJSONArray = jSONArray;
                                    i11 = 1;
                                    i12 = 0;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                jSONArray = optJSONArray;
                            }
                            i13++;
                            optJSONArray = jSONArray;
                            i11 = 1;
                            i12 = 0;
                        }
                        MyPagesView.this.m82282DM();
                    } else {
                        MyPagesView.this.m82282DM();
                    }
                    if (MyPagesView.this.f72421L0.m92676n2() != null) {
                        MyPagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.r10
                            public /* synthetic */ r10() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MyPagesView.C14688d.this.m82302f();
                            }
                        });
                    }
                    AbstractC23309i.m122639z3();
                    myPagesView2 = MyPagesView.this;
                    myPagesView2.f75595z1 = false;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    if (MyPagesView.this.f72421L0.m92676n2() != null) {
                        MyPagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.s10
                            public /* synthetic */ s10() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MyPagesView.C14688d.this.m82303g();
                            }
                        });
                    }
                    MyPagesView myPagesView5 = MyPagesView.this;
                    myPagesView5.f75595z1 = false;
                    if (myPagesView5.f75583n1 != 0 && !TextUtils.isEmpty(myPagesView5.f75584o1)) {
                        myPagesView = MyPagesView.this;
                        int i14 = myPagesView.f75583n1;
                        if (i14 == 1) {
                            if (C21927m.m114302u().m114357s().m153137g(MyPagesView.this.f75584o1)) {
                                contactProfile = C23024b7.f111993a.m118065l(MyPagesView.this.f75584o1, false);
                            } else {
                                contactProfile = null;
                            }
                            if (contactProfile != null && !MyPagesView.this.f75572c1.m153137g(contactProfile.f42434r)) {
                                contactProfile.f42440t = AbstractC23262x6.m120002o(contactProfile.f42437s);
                                MyPagesView.this.f75572c1.add(contactProfile);
                            }
                        }
                    }
                }
                if (myPagesView2.f75583n1 != 0 && !TextUtils.isEmpty(myPagesView2.f75584o1)) {
                    myPagesView = MyPagesView.this;
                    int i15 = myPagesView.f75583n1;
                    if (i15 == 1) {
                        if (C21927m.m114302u().m114357s().m153137g(MyPagesView.this.f75584o1)) {
                            contactProfile3 = C23024b7.f111993a.m118065l(MyPagesView.this.f75584o1, false);
                        } else {
                            contactProfile3 = null;
                        }
                        if (contactProfile3 != null && !MyPagesView.this.f75572c1.m153137g(contactProfile3.f42434r)) {
                            contactProfile3.f42440t = AbstractC23262x6.m120002o(contactProfile3.f42437s);
                            MyPagesView.this.f75572c1.add(contactProfile3);
                        }
                        MyPagesView.this.m82282DM();
                    }
                }
                MyPagesView myPagesView6 = MyPagesView.this;
                myPagesView6.f75583n1 = 0;
                myPagesView6.f75584o1 = "";
            } catch (Throwable th2) {
                MyPagesView myPagesView7 = MyPagesView.this;
                myPagesView7.f75595z1 = false;
                if (myPagesView7.f75583n1 != 0 && !TextUtils.isEmpty(myPagesView7.f75584o1)) {
                    MyPagesView myPagesView8 = MyPagesView.this;
                    int i16 = myPagesView8.f75583n1;
                    if (i16 == 1) {
                        if (C21927m.m114302u().m114357s().m153137g(MyPagesView.this.f75584o1)) {
                            contactProfile2 = C23024b7.f111993a.m118065l(MyPagesView.this.f75584o1, false);
                        } else {
                            contactProfile2 = null;
                        }
                        if (contactProfile2 != null && !MyPagesView.this.f75572c1.m153137g(contactProfile2.f42434r)) {
                            contactProfile2.f42440t = AbstractC23262x6.m120002o(contactProfile2.f42437s);
                            MyPagesView.this.f75572c1.add(contactProfile2);
                        }
                        MyPagesView.this.m82282DM();
                    } else if (i16 == 2) {
                        myPagesView8.m82283EM(myPagesView8.f75584o1);
                    }
                }
                MyPagesView myPagesView9 = MyPagesView.this;
                myPagesView9.f75583n1 = 0;
                myPagesView9.f75584o1 = "";
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$e */
    /* loaded from: classes6.dex */
    public class C14689e implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.MyPagesView$e$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42343ac(MyPagesView.this.f75574e1.f42434r);
                C7960e.m41971c6().m42376e4(MyPagesView.this.f75574e1.f42434r);
            }
        }

        C14689e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public /* synthetic */ void m82306d() {
            int i11;
            try {
                ArrayList arrayList = new ArrayList(MyPagesView.this.f75573d1.m36340c());
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    ContactProfile contactProfile = (ContactProfile) arrayList.get(size);
                    if (contactProfile != null && contactProfile.f42434r.equals(MyPagesView.this.f75574e1.f42434r)) {
                        if (((ContactProfile) arrayList.get(size)).f42405d1 && size > 0) {
                            int i12 = size - 1;
                            if (((ContactProfile) arrayList.get(i12)).m40366G0()) {
                                ((ContactProfile) arrayList.get(i12)).f42405d1 = true;
                            }
                        }
                        MyPagesView.this.f75575f1 = size;
                        arrayList.remove(size);
                    } else {
                        size--;
                    }
                }
                int size2 = MyPagesView.this.f75572c1.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        ContactProfile contactProfile2 = (ContactProfile) MyPagesView.this.f75572c1.get(size2);
                        if (contactProfile2 != null && contactProfile2.f42434r.equals(MyPagesView.this.f75574e1.f42434r)) {
                            MyPagesView.this.f75572c1.remove(size2);
                            break;
                        }
                        size2--;
                    } else {
                        break;
                    }
                }
                if (!arrayList.isEmpty() && (i11 = MyPagesView.this.f75575f1 - 1) >= 0 && i11 < arrayList.size()) {
                    if (MyPagesView.this.f75575f1 == arrayList.size()) {
                        if (!((ContactProfile) arrayList.get(i11)).m40366G0()) {
                            arrayList.remove(i11);
                        }
                    } else if (MyPagesView.this.f75575f1 < arrayList.size() && !((ContactProfile) arrayList.get(i11)).m40366G0() && !((ContactProfile) arrayList.get(MyPagesView.this.f75575f1)).m40366G0()) {
                        arrayList.remove(i11);
                    }
                }
                MyPagesView.this.f75573d1.m36343h(arrayList);
                MyPagesView.this.f75573d1.notifyDataSetChanged();
                MyPagesView.this.m82284FM(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MyPagesView myPagesView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    myPagesView = MyPagesView.this;
                    myPagesView.f75554D1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MyPagesView.this.f75554D1 = false;
                    myPagesView = MyPagesView.this;
                }
                myPagesView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                MyPagesView myPagesView2 = MyPagesView.this;
                myPagesView2.f75554D1 = false;
                myPagesView2.f72421L0.mo49315c4();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        int parseInt = Integer.parseInt(jSONObject.getString("error_code"));
                        if (parseInt == 0) {
                            if (MyPagesView.this.f75574e1 != null) {
                                C21927m.m114302u().m114342k0(MyPagesView.this.f75574e1.f42434r);
                                AbstractC23306f.m120616S().m101508a(new C28927g.b(MyPagesView.this.f75574e1.f42434r));
                                C0824j.m2153b(new a());
                                if (MyPagesView.this.f72421L0.m92676n2() != null) {
                                    MyPagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t10
                                        public /* synthetic */ t10() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MyPagesView.C14689e.this.m82306d();
                                        }
                                    });
                                }
                            }
                        } else {
                            ToastUtils.m89264l(new C20096c(parseInt, AbstractC23161o1.m119318c(parseInt, "")));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MyPagesView.this.f72421L0.mo49315c4();
                MyPagesView.this.f75554D1 = false;
            } catch (Throwable th2) {
                MyPagesView.this.f72421L0.mo49315c4();
                MyPagesView.this.f75554D1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m82262AM(String str, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m82288JM(Integer.parseInt(str));
    }

    /* renamed from: BM */
    private void m82263BM(ContactProfile contactProfile) {
        boolean m114318P = C21927m.m114302u().m114318P(contactProfile.f42434r);
        int i11 = contactProfile.f42456y0;
        if (i11 != 1 && !m114318P) {
            if (i11 == 0) {
                m82290LM();
                return;
            } else {
                m82290LM();
                return;
            }
        }
        m82293oM();
        C0815e1.m2075D().m2095O(String.valueOf(1), "31", contactProfile.f42434r, "");
    }

    /* renamed from: sM */
    public /* synthetic */ void m82273sM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            int headerViewsCount = i11 - this.f75571b1.getHeaderViewsCount();
            C7139m4 c7139m4 = this.f75573d1;
            if (c7139m4 != null && headerViewsCount >= 0 && c7139m4.getCount() > headerViewsCount) {
                ContactProfile contactProfile = (ContactProfile) this.f75573d1.getItem(headerViewsCount);
                this.f75574e1 = contactProfile;
                if (contactProfile != null) {
                    AbstractC23647d.m123897g("5801104");
                    m82263BM(this.f75574e1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    public /* synthetic */ boolean m82274tM(AdapterView adapterView, View view, int i11, long j11) {
        return m82294pM(i11);
    }

    /* renamed from: uM */
    public /* synthetic */ boolean m82275uM(View view, MotionEvent motionEvent) {
        int action;
        try {
            action = motionEvent.getAction();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (action != 0 && action != 1) {
            if (action != 2) {
                if (action != 3) {
                }
            } else {
                C7139m4 c7139m4 = this.f75573d1;
                if (c7139m4 != null && !c7139m4.isEmpty()) {
                    float y11 = motionEvent.getY();
                    if (this.f75586q1 == 0.0f) {
                        this.f75586q1 = y11;
                    }
                    if (this.f75585p1 == 0.0f) {
                        this.f75585p1 = y11;
                    }
                    if (!this.f75587r1 && !this.f75588s1) {
                        float f11 = this.f75586q1;
                        if (y11 > f11) {
                            this.f75588s1 = false;
                            this.f75587r1 = true;
                        } else if (y11 < f11) {
                            this.f75588s1 = true;
                            this.f75587r1 = false;
                        }
                    }
                    float f12 = this.f75586q1;
                    if (y11 > f12) {
                        if (this.f75588s1 && !this.f75587r1) {
                            this.f75585p1 = y11;
                            this.f75588s1 = false;
                            this.f75587r1 = true;
                        }
                    } else if (y11 < f12 && this.f75587r1 && !this.f75588s1) {
                        this.f75585p1 = y11;
                        this.f75588s1 = true;
                        this.f75587r1 = false;
                    }
                    double d11 = y11 - this.f75585p1;
                    if (d11 > 3.0d) {
                        if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                            ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67741rM(true);
                        }
                        this.f75585p1 = y11;
                        this.f75588s1 = false;
                        this.f75587r1 = false;
                    } else if (d11 < -3.0d) {
                        if (!this.f75589t1 && this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                            ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67741rM(false);
                        }
                        this.f75585p1 = y11;
                        this.f75588s1 = false;
                        this.f75587r1 = false;
                    }
                    this.f75586q1 = y11;
                }
            }
            return false;
        }
        this.f75585p1 = 0.0f;
        this.f75586q1 = 0.0f;
        this.f75587r1 = false;
        this.f75588s1 = false;
        return false;
    }

    /* renamed from: vM */
    public /* synthetic */ void m82276vM() {
        boolean z11;
        try {
            if (C23055e5.m118271f()) {
                this.f75579j1 = 1;
                this.f75594y1 = true;
                int m117905e = AbstractC23006a0.m117905e();
                String str = CoreUtility.f89233i;
                if (this.f75572c1.size() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m82292nM(1, 100, m117905e, str, z11);
            } else {
                m82291mM();
                this.f75590u1.setVisibility(0);
                this.f75590u1.setState(MultiStateView.EnumC15914e.ERROR);
                this.f75590u1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                this.f75590u1.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    public /* synthetic */ void m82277wM(ContactProfile contactProfile) {
        if (AbstractC22055v0.m115114D(contactProfile.f42434r, AbstractC21244b.m110054d(getContext()))) {
            C31980jc m115161u = AbstractC22055v0.m115161u(contactProfile.f42434r);
            m115161u.m153811A(true);
            this.f75593x1.mo47172c(m115161u, null, 345);
        } else {
            this.f75574e1 = contactProfile;
            m82263BM(contactProfile);
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m82278xM(View view) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93599r);
        bundle.putInt("EXTRA_SOURCE_LINK", 41);
        this.f72421L0.m92676n2().mo35579p().m93069k2(ZaloWebView.class, bundle, 1, true);
    }

    /* renamed from: yM */
    public /* synthetic */ void m82279yM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        this.f72421L0.removeDialog(1);
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.btn_vip_unfollow && (contactProfile = this.f75574e1) != null) {
            m82287IM("", contactProfile.f42434r);
            AbstractC23647d.m123897g("5801105");
        }
    }

    /* renamed from: zM */
    public static /* synthetic */ int m82280zM(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* renamed from: CM */
    public void m82281CM() {
        try {
            ArrayList arrayList = new ArrayList(this.f75572c1);
            Collections.sort(arrayList, new Comparator() { // from class: com.zing.zalo.ui.zviews.o10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m82280zM;
                    m82280zM = MyPagesView.m82280zM((ContactProfile) obj, (ContactProfile) obj2);
                    return m82280zM;
                }
            });
            this.f75573d1.m36343h(arrayList);
            this.f75573d1.notifyDataSetChanged();
            m82284FM(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_unfollow));
        hashMap.put("id", Integer.valueOf(AbstractC8020f0.btn_vip_unfollow));
        arrayList.add(hashMap);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        ContactProfile contactProfile = this.f75574e1;
        if (contactProfile != null) {
            aVar.m43172u(contactProfile.f42437s);
        }
        aVar.m43173v(100);
        aVar.m43155d(true);
        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.m10

            /* renamed from: q */
            public final /* synthetic */ SimpleAdapter f81076q;

            public /* synthetic */ m10(SimpleAdapter simpleAdapter2) {
                r2 = simpleAdapter2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                MyPagesView.this.m82279yM(r2, interfaceC17463d, i12);
            }
        });
        return aVar.m43152a();
    }

    /* renamed from: DM */
    void m82282DM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l10
                public /* synthetic */ l10() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MyPagesView.this.m82281CM();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: EM */
    void m82283EM(String str) {
        if (this.f75572c1.m153137g(str)) {
            int size = this.f75572c1.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (((ContactProfile) this.f75572c1.get(size)).f42434r.equals(str)) {
                    this.f75572c1.remove(size);
                    break;
                }
                size--;
            }
            m82282DM();
        }
    }

    /* renamed from: FM */
    public void m82284FM(boolean z11) {
        if (z11) {
            LinearLayout linearLayout = this.f75558O0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            this.f75571b1.setVisibility(8);
            this.f75570a1.setVisibility(8);
            this.f75590u1.setVisibility(0);
            this.f75590u1.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f75573d1.getCount() > 0) {
            this.f75590u1.setVisibility(8);
            this.f75571b1.setVisibility(0);
            this.f75570a1.setVisibility(0);
        } else {
            this.f75570a1.setVisibility(8);
            this.f75590u1.setVisibility(0);
            this.f75590u1.setState(MultiStateView.EnumC15914e.EMPTY);
            this.f75590u1.setBtnEmptyString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_start));
            this.f75590u1.setEmptyImageUrl(AbstractC23188q6.f112417b);
            m82286HM(AbstractC8020f0.page_empty_hint_find_more);
            this.f75571b1.setVisibility(0);
        }
        m82291mM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.mypages_fragment_layout, viewGroup, false);
        m82296rM(inflate, layoutInflater);
        return inflate;
    }

    /* renamed from: GM */
    public void m82285GM(int i11) {
        MultiStateView multiStateView = this.f75590u1;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: HM */
    public void m82286HM(int i11) {
        MultiStateView multiStateView = this.f75590u1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: IM */
    void m82287IM(String str, String str2) {
        try {
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f75553C1;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                this.f75553C1.dismiss();
            }
            if (TextUtils.isEmpty(str)) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unfollow_vip_acc);
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(7);
            aVar.m43155d(true);
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_unfollow_oa));
            aVar.m43173v(2);
            aVar.m43162k(str);
            aVar.m43169r(AbstractC8020f0.str_button_yes_unfollow, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.n10

                /* renamed from: q */
                public final /* synthetic */ String f81293q;

                public /* synthetic */ n10(String str22) {
                    r2 = str22;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    MyPagesView.this.m82262AM(r2, interfaceC17463d, i11);
                }
            });
            aVar.m43164m(AbstractC8020f0.str_button_no_unfollow, new InterfaceC17463d.b());
            this.f75553C1 = aVar.m43152a();
            if (this.f72421L0.m92672lJ()) {
                this.f75553C1.mo13822K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JM */
    void m82288JM(int i11) {
        try {
            if (this.f75554D1) {
                return;
            }
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f75555E1);
            this.f75554D1 = true;
            c0766k.mo1766w6(i11, new TrackingSource(-1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        try {
            C28685a.m143693b(this.f72421L0.m92648SI()).m143697e(this.f75592w1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f75556M0, e11);
        }
        super.mo40200KJ();
    }

    /* renamed from: KM */
    public void m82289KM() {
        C7139m4 c7139m4 = this.f75573d1;
        if (c7139m4 != null) {
            c7139m4.notifyDataSetChanged();
        }
    }

    /* renamed from: LM */
    void m82290LM() {
        C17487o0 c17487o0;
        try {
            ContactProfile contactProfile = this.f75574e1;
            if (contactProfile != null && contactProfile.f42434r.length() > 0) {
                C21927m.m114302u().m114330e0(this.f75574e1.f42434r, new TrackingSource(207));
                if (this.f72421L0.m92676n2() != null) {
                    c17487o0 = this.f72421L0.m92676n2().mo35579p();
                } else {
                    c17487o0 = null;
                }
                C26365a m135743b = new C26365a.b(this.f75574e1.f42434r, C32002l4.m154264g(19)).m135744c(this.f75574e1).m135743b();
                if (c17487o0 != null) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), m135743b, 0, 1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f75553C1;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyPagesView";
    }

    /* renamed from: mM */
    void m82291mM() {
        int m122639z3;
        C7139m4 c7139m4;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            m122639z3 = AbstractC23309i.m122639z3();
            c7139m4 = this.f75573d1;
        } catch (Exception e11) {
            LinearLayout linearLayout = this.f75562S0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f75568Y0;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            View view = this.f75569Z0;
            if (view != null) {
                view.setVisibility(0);
            }
            AbstractC23350e.m122774d(this.f75556M0, e11.toString());
        }
        if (c7139m4 != null && c7139m4.getCount() != 0) {
            if (m122639z3 != 0) {
                LinearLayout linearLayout3 = this.f75562S0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = this.f75568Y0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                View view2 = this.f75569Z0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            } else if (this.f75573d1.getCount() < 5) {
                this.f75563T0.setImageDrawable(this.f72421L0.m92651WI().getDrawable(AbstractC16803z.oa_less));
                this.f75565V0.setText(this.f72421L0.m92651WI().getString(AbstractC8020f0.mypages_find_more_title));
                this.f75566W0.setText(this.f72421L0.m92651WI().getString(AbstractC8020f0.mypages_find_more_desc));
                this.f75567X0.setText(this.f72421L0.m92651WI().getString(AbstractC8020f0.str_cap_start));
                this.f75564U0.setOnClickListener(this);
                this.f75562S0.setOnClickListener(this);
                LinearLayout linearLayout5 = this.f75568Y0;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                View view3 = this.f75569Z0;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                LinearLayout linearLayout6 = this.f75562S0;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } else {
                AbstractC23309i.m121912fn(1);
                LinearLayout linearLayout7 = this.f75562S0;
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(8);
                }
                LinearLayout linearLayout8 = this.f75568Y0;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                View view4 = this.f75569Z0;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkShowHideFindMorePageLayout: ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
        }
        LinearLayout linearLayout9 = this.f75562S0;
        if (linearLayout9 != null) {
            linearLayout9.setVisibility(8);
        }
        LinearLayout linearLayout10 = this.f75568Y0;
        if (linearLayout10 != null) {
            linearLayout10.setVisibility(8);
        }
        View view5 = this.f75569Z0;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append("checkShowHideFindMorePageLayout: ");
        sb22.append(System.currentTimeMillis() - currentTimeMillis);
    }

    /* renamed from: nM */
    void m82292nM(int i11, int i12, int i13, String str, boolean z11) {
        try {
            if (this.f75595z1) {
                return;
            }
            this.f75595z1 = true;
            m82284FM(z11);
            this.f75551A1.mo1704o8(this.f75552B1);
            this.f75551A1.mo1556V6(i11, i12, i13, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m82293oM() {
        try {
            AbstractC23059e9.m118318G(3);
            ContactProfile contactProfile = this.f75574e1;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                Bundle m140776b = new C27870vb(this.f75574e1.mo2478b()).m140780g(this.f75574e1).m140776b();
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z11;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.layout_find_more_page) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("title_search", 3);
                bundle.putString("keyword_search", "");
                bundle.putBoolean("extra_from_contact", true);
                C17487o0 mo35579p = this.f72421L0.m92676n2().mo35579p();
                if (mo35579p != null) {
                    mo35579p.m93069k2(SearchResultDetail.class, bundle, 1, true);
                }
                C0815e1.m2075D().m2095O(String.valueOf(1), "32", "", "");
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.layoutFeedFooterError) {
            if (C23055e5.m118272g(true)) {
                int i11 = this.f75579j1;
                int m117905e = AbstractC23006a0.m117905e();
                String str = CoreUtility.f89233i;
                if (this.f75572c1.size() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m82292nM(i11, 100, m117905e, str, z11);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.ic_close_view) {
            try {
                AbstractC23309i.m121912fn(1);
                LinearLayout linearLayout = this.f75562S0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f75568Y0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                View view2 = this.f75569Z0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                m82284FM(false);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.layout_find_more_friends) {
            try {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("title_search", 3);
                bundle2.putString("keyword_search", "");
                bundle2.putBoolean("extra_from_contact", true);
                C17487o0 mo35579p2 = this.f72421L0.m92676n2().mo35579p();
                if (mo35579p2 != null) {
                    mo35579p2.m93069k2(SearchResultDetail.class, bundle2, 1, true);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m82289KM();
    }

    /* renamed from: pM */
    public boolean m82294pM(int i11) {
        try {
            int headerViewsCount = i11 - this.f75571b1.getHeaderViewsCount();
            this.f75574e1 = null;
            C7139m4 c7139m4 = this.f75573d1;
            if (c7139m4 != null && headerViewsCount >= 0 && headerViewsCount < c7139m4.getCount()) {
                this.f75574e1 = (ContactProfile) this.f75573d1.getItem(headerViewsCount);
            }
            ContactProfile contactProfile = this.f75574e1;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                this.f72421L0.showDialog(1);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: qM */
    void m82295qM() {
        boolean z11;
        try {
            this.f75580k1 = new C23528a(this.f72421L0.m92648SI());
            this.f75568Y0.setOnClickListener(this);
            this.f75557N0.setVisibility(8);
            this.f75558O0.setVisibility(8);
            this.f75558O0.setOnClickListener(this);
            ((Activity) this.f72421L0.m92648SI()).registerForContextMenu(this.f75571b1);
            this.f75571b1.addHeaderView(this.f75561R0);
            this.f75571b1.addHeaderView(this.f75560Q0);
            this.f75571b1.addFooterView(this.f75559P0);
            this.f75571b1.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.g10
                public /* synthetic */ g10() {
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                    MyPagesView.this.m82273sM(adapterView, view, i11, j11);
                }
            });
            this.f75571b1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.zing.zalo.ui.zviews.h10
                public /* synthetic */ h10() {
                }

                @Override // android.widget.AdapterView.OnItemLongClickListener
                public final boolean onItemLongClick(AdapterView adapterView, View view, int i11, long j11) {
                    boolean m82274tM;
                    m82274tM = MyPagesView.this.m82274tM(adapterView, view, i11, j11);
                    return m82274tM;
                }
            });
            this.f75571b1.setOnScrollListener(new C14686b());
            this.f75571b1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.i10
                public /* synthetic */ i10() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m82275uM;
                    m82275uM = MyPagesView.this.m82275uM(view, motionEvent);
                    return m82275uM;
                }
            });
            this.f75590u1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.j10
                public /* synthetic */ j10() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    MyPagesView.this.m82276vM();
                }
            });
            C7139m4 c7139m4 = new C7139m4(this.f72421L0.m92676n2().getContext(), this.f75572c1, this.f75571b1, this.f75580k1);
            this.f75573d1 = c7139m4;
            c7139m4.m36342g(new C7139m4.a() { // from class: com.zing.zalo.ui.zviews.k10
                public /* synthetic */ k10() {
                }

                @Override // com.zing.zalo.adapters.C7139m4.a
                /* renamed from: a */
                public final void mo36346a(ContactProfile contactProfile) {
                    MyPagesView.this.m82277wM(contactProfile);
                }
            });
            this.f75573d1.m36345j(this.f75593x1);
            this.f75571b1.setAdapter((ListAdapter) this.f75573d1);
            m82286HM(AbstractC8020f0.empty_list);
            m82285GM(AbstractC8020f0.loading);
            this.f75579j1 = 1;
            this.f75594y1 = true;
            int m117905e = AbstractC23006a0.m117905e();
            String str = CoreUtility.f89233i;
            if (this.f75572c1.size() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m82292nM(1, 100, m117905e, str, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m82296rM(View view, LayoutInflater layoutInflater) {
        this.f75560Q0 = layoutInflater.inflate(AbstractC7409c0.header_view_mypageslist_subtab, (ViewGroup) null, false);
        this.f75561R0 = layoutInflater.inflate(AbstractC7409c0.header_view_fake_subtab, (ViewGroup) null, false);
        this.f75559P0 = layoutInflater.inflate(AbstractC7409c0.footer_loading, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) this.f75560Q0.findViewById(AbstractC6918a0.layout_find_more_friends);
        this.f75562S0 = linearLayout;
        this.f75563T0 = (RecyclingImageView) linearLayout.findViewById(AbstractC6918a0.buddy_dp);
        this.f75564U0 = (RecyclingImageView) this.f75562S0.findViewById(AbstractC6918a0.ic_close_view);
        this.f75565V0 = (TextView) this.f75562S0.findViewById(AbstractC6918a0.title_find_more);
        this.f75566W0 = (TextView) this.f75562S0.findViewById(AbstractC6918a0.desc_find_more);
        this.f75567X0 = (TextView) this.f75562S0.findViewById(AbstractC6918a0.action_find_more);
        this.f75568Y0 = (LinearLayout) this.f75560Q0.findViewById(AbstractC6918a0.layout_find_more_page);
        this.f75569Z0 = this.f75560Q0.findViewById(AbstractC6918a0.separate_line);
        this.f75570a1 = (TextView) this.f75560Q0.findViewById(AbstractC6918a0.title_page_list);
        this.f75559P0.findViewById(AbstractC6918a0.layoutFeedFooterLoading).setVisibility(8);
        this.f75557N0 = (FrameLayout) this.f75559P0.findViewById(AbstractC6918a0.layoutFeedFooter);
        this.f75558O0 = (LinearLayout) this.f75559P0.findViewById(AbstractC6918a0.layoutFeedFooterError);
        this.f75571b1 = (ListView) view.findViewById(AbstractC6918a0.viplist);
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f75590u1 = multiStateView;
        multiStateView.setEnableBtnEmpty(true);
        this.f75590u1.setEnableLoadingText(false);
        this.f75590u1.setEmptyOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.f10
            public /* synthetic */ f10() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyPagesView.this.m82278xM(view2);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m82295qM();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.ACTION_REFRESH_AFTER_FOLLOW_PAGE");
            intentFilter.addAction("com.zing.zalo.ACTION_REFRESH_AFTER_UNFOLLOW_PAGE");
            intentFilter.addAction("com.zing.zalo.ACTION_SCROLL_TO_TOP_PAGES_LIST");
            C28685a.m143693b(this.f72421L0.m92648SI()).m143695c(this.f75592w1, intentFilter);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f75556M0, e11);
        }
    }
}
