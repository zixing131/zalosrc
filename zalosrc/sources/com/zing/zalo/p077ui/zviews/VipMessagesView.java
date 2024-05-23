package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.MessagesListOAAdapter;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.zviews.AbstractC15426a6;
import com.zing.zalo.p077ui.zviews.VipMessagesView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import eg0.C18427b;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l30.AbstractC22055v0;
import l30.C22033k0;
import lk0.InterfaceC22508f;
import me0.AbstractC23028c0;
import me0.AbstractC23116k0;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.C23212s8;
import mg.C23288a;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p131ei.C18434b;
import p172fy.C19171b;
import p241ij.C20566c;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p394oj.C24275a;
import p420pb.C24709a;
import p510sq.C26365a;
import p604wb.C28905e;
import p716zh.C31862c;
import p716zh.C31965ic;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32044o1;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.C28203u6;
import wd0.C28923c;
import wd0.C28927g;

/* loaded from: classes6.dex */
public class VipMessagesView extends SlidableZaloView implements MessagesListOAAdapter.InterfaceC6988h, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: A1 */
    public static long f79314A1;

    /* renamed from: R0 */
    private k31 f79317R0;

    /* renamed from: S0 */
    ListView f79318S0;

    /* renamed from: T0 */
    MessagesListOAAdapter f79319T0;

    /* renamed from: X0 */
    MultiStateView f79323X0;

    /* renamed from: Y0 */
    C8009j f79324Y0;

    /* renamed from: b1 */
    C23528a f79327b1;

    /* renamed from: c1 */
    View f79328c1;

    /* renamed from: i1 */
    private FrameLayout f79334i1;

    /* renamed from: j1 */
    C31862c f79335j1;

    /* renamed from: l1 */
    ContactProfile f79337l1;

    /* renamed from: m1 */
    private C28923c f79338m1;

    /* renamed from: n1 */
    private C28927g f79339n1;

    /* renamed from: o1 */
    private C32044o1 f79340o1;

    /* renamed from: r1 */
    Snackbar f79343r1;

    /* renamed from: P0 */
    final String f79315P0 = VipMessagesView.class.getSimpleName();

    /* renamed from: Q0 */
    int f79316Q0 = 0;

    /* renamed from: U0 */
    final ArrayList f79320U0 = new ArrayList();

    /* renamed from: V0 */
    ArrayList f79321V0 = new ArrayList();

    /* renamed from: W0 */
    List f79322W0 = new ArrayList();

    /* renamed from: Z0 */
    UpdateListener f79325Z0 = new UpdateListener();

    /* renamed from: a1 */
    Boolean f79326a1 = Boolean.FALSE;

    /* renamed from: d1 */
    boolean f79329d1 = false;

    /* renamed from: e1 */
    boolean f79330e1 = false;

    /* renamed from: f1 */
    List f79331f1 = new ArrayList();

    /* renamed from: g1 */
    long f79332g1 = 0;

    /* renamed from: h1 */
    long f79333h1 = 0;

    /* renamed from: k1 */
    Map f79336k1 = new HashMap();

    /* renamed from: p1 */
    C0855y0 f79341p1 = new C0855y0();

    /* renamed from: q1 */
    private AbstractC15426a6 f79342q1 = AbstractC15426a6.b.f79784a;

    /* renamed from: s1 */
    boolean f79344s1 = false;

    /* renamed from: t1 */
    boolean f79345t1 = false;

    /* renamed from: u1 */
    boolean f79346u1 = false;

    /* renamed from: v1 */
    private final Runnable f79347v1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.s31
        public /* synthetic */ s31() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VipMessagesView.this.m86519QM();
        }
    };

    /* renamed from: w1 */
    boolean f79348w1 = false;

    /* renamed from: x1 */
    private final List f79349x1 = Collections.synchronizedList(new ArrayList());

    /* renamed from: y1 */
    boolean f79350y1 = false;

    /* renamed from: z1 */
    private final InterfaceC13567b1.a f79351z1 = new C15339c();

    /* loaded from: classes6.dex */
    protected class UpdateListener extends BroadcastReceiver {
        protected UpdateListener() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.zing.zalo.worker.AlarmSettingController.Chat")) {
                VipMessagesView.this.m86560cN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$a */
    /* loaded from: classes6.dex */
    public class C15337a implements InterfaceC20094a {
        C15337a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            VipMessagesView.this.f79348w1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    AbstractC23309i.m122481uu(obj.toString());
                    AbstractC23309i.m121022Hq(System.currentTimeMillis());
                    try {
                        if (((JSONObject) obj).optInt("error_code", -999) != 0) {
                            AbstractC23309i.m122481uu("");
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122774d(VipMessagesView.this.f79315P0, e12.toString());
                }
            } finally {
                VipMessagesView.this.f79348w1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$b */
    /* loaded from: classes6.dex */
    public class C15338b implements InterfaceC20094a {
        C15338b() {
        }

        /* renamed from: d */
        public static /* synthetic */ int m86569d(ContactProfile contactProfile, ContactProfile contactProfile2) {
            int i11 = contactProfile.f42353K1;
            int i12 = contactProfile2.f42353K1;
            if (i11 > i12) {
                return 1;
            }
            if (i11 < i12) {
                return -1;
            }
            return 0;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            VipMessagesView.this.f79350y1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    ArrayList arrayList = new ArrayList();
                    if (jSONObject != null && jSONObject.optInt("error_code", -999) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                        VipMessagesView.f79314A1 = System.currentTimeMillis() + (optJSONObject.optInt("media_expired_time") * 1000);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("ads");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i11);
                                    int i12 = optJSONObject3.getInt("pos") - 1;
                                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("item");
                                    if (optJSONObject4 != null) {
                                        String optString = optJSONObject4.optString("oaid");
                                        String optString2 = optJSONObject4.optString("avatar");
                                        String optString3 = optJSONObject4.optString("displayName");
                                        int optInt = optJSONObject4.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                        String optString4 = optJSONObject4.optString("desc");
                                        ContactProfile contactProfile = new ContactProfile(optString);
                                        contactProfile.f42437s = optString3;
                                        contactProfile.f42446v = optString2;
                                        contactProfile.f42352K0 = optInt;
                                        contactProfile.m40401d1(optString4);
                                        contactProfile.f42436r1 = new SpannableStringBuilder(optString4);
                                        contactProfile.f42353K1 = i12;
                                        contactProfile.f42356L1 = true;
                                        contactProfile.f42370Q0 = true;
                                        if (optJSONObject4.has("track_ads") && (optJSONObject2 = optJSONObject4.optJSONObject("track_ads")) != null) {
                                            int i13 = optJSONObject2.getInt("campid");
                                            int i14 = optJSONObject2.getInt("srcidx");
                                            String string = optJSONObject2.getString("distribute_id");
                                            contactProfile.f42350J1 = i13;
                                            contactProfile.f42376S0 = i14;
                                            contactProfile.f42422m0 = string;
                                        }
                                        arrayList.add(contactProfile);
                                    }
                                } catch (Exception e11) {
                                    AbstractC20110a.m104539h(e11);
                                }
                            }
                            Collections.sort(arrayList, new Comparator() { // from class: com.zing.zalo.ui.zviews.w31
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int m86569d;
                                    m86569d = VipMessagesView.C15338b.m86569d((ContactProfile) obj2, (ContactProfile) obj3);
                                    return m86569d;
                                }
                            });
                        }
                    }
                    synchronized (VipMessagesView.this.f79349x1) {
                        VipMessagesView.this.f79349x1.clear();
                        VipMessagesView.this.f79349x1.addAll(arrayList);
                    }
                    if (!VipMessagesView.this.f79349x1.isEmpty()) {
                        VipMessagesView.this.m86565lN();
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122774d(VipMessagesView.this.f79315P0, e12.toString());
                }
                VipMessagesView.this.f79350y1 = false;
            } catch (Throwable th2) {
                VipMessagesView.this.f79350y1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$c */
    /* loaded from: classes6.dex */
    public class C15339c implements InterfaceC13567b1.a {

        /* renamed from: p */
        private KeyEventCallbackC17462c f79355p;

        C15339c() {
        }

        /* renamed from: c */
        public /* synthetic */ void m86572c() {
            VipMessagesView vipMessagesView = VipMessagesView.this;
            vipMessagesView.f79335j1 = null;
            vipMessagesView.m86550yM();
        }

        /* renamed from: d */
        public /* synthetic */ void m86573d(SimpleAdapter simpleAdapter, C31862c c31862c, InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                try {
                    interfaceC17463d.dismiss();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC6918a0.menu_delete) {
                m86574e(c31862c);
                C0815e1.m2075D().m2092K(c31862c, "action.window.close", 3);
            }
        }

        /* renamed from: e */
        private void m86574e(C31862c c31862c) {
            C18434b.m97679l().m97691w(c31862c);
            if (c31862c == VipMessagesView.this.f79335j1) {
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.x31
                    public /* synthetic */ x31() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VipMessagesView.C15339c.this.m86572c();
                    }
                });
            }
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            boolean z11;
            if (c31862c != null && c31862c.m153153e()) {
                m86574e(c31862c);
                z11 = true;
            } else {
                z11 = false;
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("action.window.close")) {
                    if (!z11) {
                        m86574e(c31862c);
                        return;
                    }
                    return;
                }
                AbstractC28207v1.m141994i3(str, 4, VipMessagesView.this.f72421L0.m92676n2(), VipMessagesView.this, str2, null);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            if (c31862c != null && !c31862c.f146315h) {
                m86575f(c31862c);
            }
        }

        /* renamed from: f */
        void m86575f(C31862c c31862c) {
            if (c31862c != null) {
                KeyEventCallbackC17462c keyEventCallbackC17462c = this.f79355p;
                if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                    this.f79355p.dismiss();
                }
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
                hashMap.put("id", Integer.valueOf(AbstractC6918a0.menu_delete));
                arrayList.add(hashMap);
                SimpleAdapter simpleAdapter = new SimpleAdapter(VipMessagesView.this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(VipMessagesView.this.f72421L0.m92648SI());
                aVar.m43172u("");
                aVar.m43173v(100);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.y31

                    /* renamed from: q */
                    public final /* synthetic */ SimpleAdapter f82702q;

                    /* renamed from: r */
                    public final /* synthetic */ C31862c f82703r;

                    public /* synthetic */ y31(SimpleAdapter simpleAdapter2, C31862c c31862c2) {
                        r2 = simpleAdapter2;
                        r3 = c31862c2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        VipMessagesView.C15339c.this.m86573d(r2, r3, interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f79355p = m43152a;
                if (m43152a != null) {
                    m43152a.mo13822K();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$d */
    /* loaded from: classes6.dex */
    class C15340d extends AbstractC23116k0.a {
        C15340d() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            interfaceC17463d.dismiss();
            VipMessagesView.this.m86562hN(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$e */
    /* loaded from: classes6.dex */
    public class C15341e extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$e$a */
        /* loaded from: classes6.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.n f79359a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f79360b;

            /* renamed from: c */
            final /* synthetic */ int f79361c;

            a(AbstractC22055v0.n nVar, C31980jc c31980jc, int i11) {
                this.f79359a = nVar;
                this.f79360b = c31980jc;
                this.f79361c = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    AbstractC22055v0.n nVar = this.f79359a;
                    if (nVar != null) {
                        nVar.mo17230p(this.f79360b, VipMessagesView.this.f79327b1);
                    }
                    MessagesListOAAdapter messagesListOAAdapter = VipMessagesView.this.f79319T0;
                    if (messagesListOAAdapter != null) {
                        messagesListOAAdapter.notifyDataSetChanged();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (VipMessagesView.this.f72421L0.m92672lJ() && VipMessagesView.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (VipMessagesView.this.f72421L0.m92672lJ() && VipMessagesView.this.f72421L0.m92687sJ() && hVar != null) {
                    AbstractC23647d.m123897g("49150058");
                    bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    bundle.putInt("srcType", this.f79361c);
                    AbstractC22055v0.m115127Q(hVar, this.f79359a, VipMessagesView.this.f72421L0.m92676n2(), bundle, 1021);
                }
            }
        }

        C15341e() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, i11, new a(nVar, c31980jc, i11));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$f */
    /* loaded from: classes6.dex */
    public class C15342f implements AbsListView.OnScrollListener {

        /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$f$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f79364a;

            /* renamed from: b */
            final /* synthetic */ int f79365b;

            /* renamed from: c */
            final /* synthetic */ List f79366c;

            a(int i11, int i12, List list) {
                this.f79364a = i11;
                this.f79365b = i12;
                this.f79366c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                VipMessagesView.this.m86567xM(this.f79364a, this.f79365b, this.f79366c);
            }
        }

        C15342f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            try {
                VipMessagesView vipMessagesView = VipMessagesView.this;
                ListView listView = vipMessagesView.f79318S0;
                if (listView != null && vipMessagesView.f79319T0 != null) {
                    C0809c1.m2050b(new a(listView.getFirstVisiblePosition(), VipMessagesView.this.f79318S0.getLastVisiblePosition(), VipMessagesView.this.f79319T0.m35788l()));
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 0) {
                VipMessagesView.this.f79319T0.m35781A(false);
                VipMessagesView.this.m86558ZM();
            } else {
                VipMessagesView.this.f79319T0.m35781A(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$g */
    /* loaded from: classes6.dex */
    class C15343g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f79368a;

        /* renamed from: b */
        final /* synthetic */ String f79369b;

        C15343g(String str, String str2) {
            this.f79368a = str;
            this.f79369b = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            HashMap m2384b;
            try {
                C0855y0 c0855y0 = VipMessagesView.this.f79341p1;
                if (c0855y0 == null) {
                    m2384b = new HashMap();
                } else {
                    m2384b = c0855y0.m2384b();
                }
                if (m2384b.containsKey(this.f79368a)) {
                    C23669z c23669z = (C23669z) m2384b.get(this.f79368a);
                    if (c23669z instanceof C23651h) {
                        C23651h c23651h = (C23651h) c23669z;
                        String[] strArr = c23651h.f114659f;
                        if (strArr != null) {
                            if (strArr[2].equals(this.f79369b)) {
                                String str = c23651h.f114659f[0];
                                if (str == null || str.isEmpty()) {
                                    str = "1";
                                }
                                c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                            } else {
                                c23669z.f114656c = System.currentTimeMillis();
                                String[] strArr2 = c23651h.f114659f;
                                strArr2[2] = this.f79369b;
                                strArr2[0] = String.valueOf(1);
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    C23651h m123961i = C23651h.m123961i(7, String.valueOf(1), this.f79368a, this.f79369b);
                    if (m123961i == null) {
                        return;
                    }
                    m123961i.f114654a = 3;
                    m123961i.f114655b = 2;
                    m123961i.f114657d = 7;
                    m2384b.put(this.f79368a, m123961i);
                }
                C23669z c23669z2 = (C23669z) m2384b.get(this.f79368a);
                if (c23669z2 != null) {
                    C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
                }
                VipMessagesView vipMessagesView = VipMessagesView.this;
                if (vipMessagesView.f79341p1 == null) {
                    vipMessagesView.f79341p1 = new C0855y0();
                }
                VipMessagesView.this.f79341p1.m2387e(m2384b);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$h */
    /* loaded from: classes6.dex */
    public class C15344h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ long f79371a;

        C15344h(long j11) {
            this.f79371a = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7959d.m41638d1().m41745R2(this.f79371a);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$i */
    /* loaded from: classes6.dex */
    public class C15345i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f79373a;

        C15345i(C24275a c24275a) {
            this.f79373a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    VipMessagesView.this.m86564kN();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView.this.f79344s1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C7860a.Companion.m40303b().m40260C0();
                    C0804b.m2025g().m2029b(this.f79373a);
                    VipMessagesView.this.m86564kN();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView.this.f79344s1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$j */
    /* loaded from: classes6.dex */
    public class C15346j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79375a;

        C15346j(String str) {
            this.f79375a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    VipMessagesView.this.m86564kN();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView.this.f79344s1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C0804b.m2025g().m2035l(this.f79375a, true);
                    VipMessagesView.this.m86564kN();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView.this.f79344s1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$k */
    /* loaded from: classes6.dex */
    public class C15347k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79377a;

        /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$k$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42343ac(C15347k.this.f79377a);
                C7960e.m41971c6().m42376e4(C15347k.this.f79377a);
            }
        }

        C15347k(String str) {
            this.f79377a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (VipMessagesView.this.f72421L0.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView vipMessagesView = VipMessagesView.this;
                vipMessagesView.f79345t1 = false;
                vipMessagesView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        int optInt = jSONObject.optInt("error_code", -1000);
                        if (optInt == 0) {
                            C21927m.m114302u().m114342k0(this.f79377a);
                            VipMessagesView.this.m86513FM().m101508a(new C28927g.b(this.f79377a, true));
                            C0824j.m2153b(new a());
                            C31965ic c31965ic = (C31965ic) AbstractC23304d.f113405l.get(CoreUtility.f89233i);
                            if (c31965ic != null) {
                                int m153681a = c31965ic.m153681a();
                                if (m153681a > 0) {
                                    m153681a--;
                                }
                                c31965ic.m153684d(m153681a);
                            }
                            if (!TextUtils.isEmpty(this.f79377a)) {
                                AbstractC23181q.m119431d(this.f79377a, false);
                            }
                            VipMessagesView.this.m86560cN();
                        } else if (VipMessagesView.this.f72421L0.m92672lJ()) {
                            ToastUtils.m89264l(new C20096c(optInt, AbstractC23161o1.m119318c(optInt, "")));
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                VipMessagesView vipMessagesView = VipMessagesView.this;
                vipMessagesView.f79345t1 = false;
                vipMessagesView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                VipMessagesView vipMessagesView2 = VipMessagesView.this;
                vipMessagesView2.f79345t1 = false;
                vipMessagesView2.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$l */
    /* loaded from: classes6.dex */
    public class C15348l implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79380a;

        /* renamed from: com.zing.zalo.ui.zviews.VipMessagesView$l$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f79382a;

            a(ContactProfile contactProfile) {
                this.f79382a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f79382a);
            }
        }

        C15348l(String str) {
            this.f79380a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (VipMessagesView.this.f72421L0.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView vipMessagesView = VipMessagesView.this;
                vipMessagesView.f79346u1 = false;
                vipMessagesView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f79380a);
                        if (m141809c == null) {
                            ContactProfile contactProfile = VipMessagesView.this.f79337l1;
                            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                                m141809c = VipMessagesView.this.f79337l1;
                            } else {
                                return;
                            }
                        }
                        Map map = AbstractC23304d.f113405l;
                        C31965ic c31965ic = (C31965ic) map.get(this.f79380a);
                        if (c31965ic != null) {
                            m141809c.f42438s0 = c31965ic.m153681a();
                        }
                        m141809c.f42441t0 = true;
                        m141809c.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str)) {
                            m141809c.f42442t1 = str;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            m141809c.f42436r1 = new SpannableStringBuilder(str2);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(this.f79380a)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f79380a) != null) {
                                m141809c = C21927m.m114302u().m114357s().m153138j(this.f79380a);
                                m141809c.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    m141809c.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    m141809c.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        C31965ic c31965ic2 = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic2 != null) {
                            c31965ic2.m153684d(c31965ic2.m153681a() + 1);
                        }
                        c28203u6.m141806D(this.f79380a, false);
                        if (!TextUtils.isEmpty(m141809c.f42434r)) {
                            AbstractC23181q.m119431d(m141809c.f42434r, true);
                        }
                        VipMessagesView.this.m86560cN();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                VipMessagesView vipMessagesView = VipMessagesView.this;
                vipMessagesView.f79346u1 = false;
                vipMessagesView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: AM */
    private String m86509AM(int i11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("position", i11);
            jSONObject.put("mediabox", jSONObject2);
        } catch (JSONException e11) {
            AbstractC23350e.m122776f(this.f79315P0, e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: BM */
    private void m86510BM(String str) {
        if (AbstractC0924m0.m3194Kc()) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C20566c(str, null, 0L, false));
                C32044o1.m154612r().m154622Q(arrayList);
                m86535iN(true, arrayList.size());
                C19669z.m103146Y().m103198O0();
                return;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f79315P0, e11);
                return;
            }
        }
        C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: com.zing.zalo.ui.zviews.p31

            /* renamed from: q */
            public final /* synthetic */ String f81545q;

            public /* synthetic */ p31(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VipMessagesView.this.m86516NM(r2);
            }
        }));
    }

    /* renamed from: DM */
    private C32044o1 m86511DM() {
        if (this.f79340o1 == null) {
            this.f79340o1 = AbstractC23306f.m120598M();
        }
        return this.f79340o1;
    }

    /* renamed from: EM */
    private C28923c m86512EM() {
        if (this.f79338m1 == null) {
            this.f79338m1 = AbstractC23306f.m120601N();
        }
        return this.f79338m1;
    }

    /* renamed from: FM */
    public C28927g m86513FM() {
        if (this.f79339n1 == null) {
            this.f79339n1 = AbstractC23306f.m120616S();
        }
        return this.f79339n1;
    }

    /* renamed from: JM */
    private Pair m86514JM() {
        ContactProfile contactProfile;
        int m122533w8 = AbstractC23309i.m122533w8();
        AbstractC15426a6 abstractC15426a6 = this.f79342q1;
        if (abstractC15426a6 instanceof AbstractC15426a6.a) {
            m122533w8 = ((AbstractC15426a6.a) abstractC15426a6).m87257a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.f79321V0.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            try {
                contactProfile = (ContactProfile) this.f79321V0.get(i11);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (this.f79316Q0 == 0 && i12 >= m122533w8 && this.f79321V0.size() > m122533w8 + 1) {
                ContactProfile contactProfile2 = new ContactProfile("-5");
                contactProfile2.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.label_see_full_search_result);
                contactProfile2.f42352K0 = 0;
                arrayList.add(contactProfile2);
                if (this.f79321V0.size() - i11 > 3) {
                    for (int i13 = i11; i13 < i11 + 2; i13++) {
                        arrayList2.add((ContactProfile) this.f79321V0.get(i13));
                    }
                    ContactProfile contactProfile3 = new ContactProfile("-16");
                    if ((this.f79321V0.size() - i11) - 2 > 5) {
                        contactProfile3.f42437s = "5+";
                    } else {
                        contactProfile3.f42437s = String.valueOf((this.f79321V0.size() - i11) - 2);
                    }
                    arrayList2.add(contactProfile3);
                } else {
                    for (int i14 = i11; i14 < this.f79321V0.size(); i14++) {
                        arrayList2.add((ContactProfile) this.f79321V0.get(i14));
                    }
                }
            } else {
                contactProfile.f42399a1.clear();
                if (C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                    contactProfile.f42427o1 = AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false));
                }
                arrayList.add(contactProfile);
                i12++;
                i11++;
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    /* renamed from: KM */
    private void m86515KM() {
        this.f79317R0.m87320b0();
    }

    /* renamed from: NM */
    public /* synthetic */ void m86516NM(String str) {
        m86512EM().m101508a(new C28923c.b(str, this.f79315P0));
        m86560cN();
    }

    /* renamed from: OM */
    public /* synthetic */ void m86517OM(C31862c c31862c) {
        if (!c31862c.m153154f() && !c31862c.f146332y && c31862c.m153155h() && c31862c.m153149a()) {
            C31862c c31862c2 = this.f79335j1;
            if (c31862c2 == null || !c31862c2.m153159l(c31862c)) {
                this.f79335j1 = c31862c;
                m86550yM();
                return;
            }
            return;
        }
        if (this.f79335j1 != null) {
            this.f79335j1 = null;
            m86550yM();
        }
    }

    /* renamed from: PM */
    public /* synthetic */ void m86518PM(int i11, C31862c c31862c) {
        if (c31862c != null) {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.m31

                /* renamed from: q */
                public final /* synthetic */ C31862c f81084q;

                public /* synthetic */ m31(C31862c c31862c2) {
                    r2 = c31862c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VipMessagesView.this.m86517OM(r2);
                }
            });
        }
    }

    /* renamed from: QM */
    public /* synthetic */ void m86519QM() {
        try {
            if (this.f79329d1) {
                AbstractC23309i.m121924fz(0);
                C19636i1.m102737w().m102751I0("-8", 0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        try {
            try {
                List m41747S0 = C7959d.m41638d1().m41747S0(3);
                ArrayList arrayList = new ArrayList();
                Iterator it = m41747S0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Conversation) it.next()).m40996I());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it2.next();
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(contactProfile.f42434r);
                    if (m141809c != null) {
                        contactProfile.f42458z = m141809c.f42458z;
                    }
                }
                this.f79321V0.clear();
                this.f79321V0.addAll(arrayList);
                if (!this.f79317R0.m87319W()) {
                    m86554HM();
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f(this.f79315P0, e12);
            }
            this.f79329d1 = false;
            m86565lN();
        } catch (Throwable th2) {
            this.f79329d1 = false;
            m86565lN();
            throw th2;
        }
    }

    /* renamed from: RM */
    public /* synthetic */ void m86520RM(AbstractC15426a6 abstractC15426a6) {
        this.f79342q1 = abstractC15426a6;
        m86565lN();
    }

    /* renamed from: SM */
    public /* synthetic */ void m86521SM(InterfaceC22508f interfaceC22508f) {
        m86565lN();
    }

    /* renamed from: TM */
    public /* synthetic */ void m86522TM(SimpleAdapter simpleAdapter, ContactProfile contactProfile, InterfaceC17463d interfaceC17463d, int i11) {
        TrackingSource trackingSource;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_delete_conversation) {
            this.f72421L0.removeDialog(1);
            this.f72421L0.showDialog(1);
            return;
        }
        if (intValue == AbstractC8020f0.btn_vip_unfollow) {
            this.f72421L0.removeDialog(7);
            this.f72421L0.showDialog(7);
            return;
        }
        if (intValue == AbstractC8020f0.btn_vip_follow) {
            ContactProfile contactProfile2 = this.f79337l1;
            if (contactProfile2 != null && !TextUtils.isEmpty(contactProfile2.f42434r)) {
                if (contactProfile.f42350J1 != -1) {
                    trackingSource = new TrackingSource(280);
                    trackingSource.m40677a("campaignId", Integer.valueOf(contactProfile.f42350J1));
                    trackingSource.m40677a("srcId", Integer.valueOf(contactProfile.f42376S0));
                    trackingSource.m40677a("tracking_src", contactProfile.f42422m0);
                } else {
                    trackingSource = null;
                }
                m86552CM(this.f79337l1.f42434r, trackingSource);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_receiveNotification) {
            m86529dN(this.f79337l1.f42434r);
        } else if (intValue == AbstractC8020f0.str_optionM_muteConversation) {
            this.f72421L0.removeDialog(8);
            this.f72421L0.showDialog(8);
        }
    }

    /* renamed from: UM */
    public static /* synthetic */ void m86523UM() {
        AbstractC23309i.m121924fz(0);
        C19636i1.m102737w().m102751I0("-8", 0);
    }

    /* renamed from: VM */
    public /* synthetic */ void m86524VM(View view) {
        this.f79343r1.m90655n();
        m86528aN();
    }

    /* renamed from: WM */
    public /* synthetic */ void m86525WM() {
        try {
            this.f72421L0.mo49315c4();
            if (this.f79319T0 != null) {
                m86558ZM();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: XM */
    public /* synthetic */ void m86526XM() {
        int i11;
        try {
            Pair m86514JM = m86514JM();
            ArrayList arrayList = new ArrayList((Collection) m86514JM.first);
            AbstractC15426a6 abstractC15426a6 = this.f79342q1;
            if (abstractC15426a6 instanceof AbstractC15426a6.a) {
                i11 = ((AbstractC15426a6.a) abstractC15426a6).m87258b();
            } else {
                i11 = -1;
            }
            if (!this.f79317R0.m87319W()) {
                m86549wM(arrayList, i11);
            } else {
                m86548vM(arrayList);
            }
            AbstractC15426a6 abstractC15426a62 = this.f79342q1;
            int i12 = 2;
            if (abstractC15426a62 instanceof AbstractC15426a6.a) {
                this.f79319T0.m35785E(((AbstractC15426a6.a) abstractC15426a62).m87259c());
                if (i11 == 0) {
                    arrayList.add(0, new ContactProfile("-4"));
                } else if (i11 == 1) {
                    arrayList.add(((ArrayList) m86514JM.first).size(), new ContactProfile("-4"));
                } else {
                    arrayList.add(new ContactProfile("-4"));
                    i12 = ((ArrayList) m86514JM.first).size() > 0 ? 1 : 0;
                }
                this.f79319T0.m35791v(m86551zM(i11));
            }
            this.f79320U0.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (contactProfile.f42434r.equals("-7") && this.f79317R0.m87318U().mo9215f() != null) {
                    this.f79320U0.add(new MessagesListOAAdapter.C6987g(contactProfile, (InterfaceC22508f) this.f79317R0.m87318U().mo9215f(), m86509AM(i12)));
                } else if (m86511DM().m154637z(contactProfile.f42434r) == null) {
                    this.f79320U0.add(new MessagesListOAAdapter.C6986f(contactProfile));
                }
            }
            this.f79319T0.m35793x(this.f79320U0);
            this.f79319T0.m35794y((List) m86514JM.second);
            this.f79319T0.m35795z(this.f79322W0);
            m86558ZM();
            m86561gN(false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: YM */
    private void m86527YM() {
        C18434b.m97679l().m97686o(34, null, new C18434b.e() { // from class: com.zing.zalo.ui.zviews.o31
            public /* synthetic */ o31() {
            }

            @Override // p131ei.C18434b.e
            /* renamed from: a */
            public final void mo64321a(int i11, C31862c c31862c) {
                VipMessagesView.this.m86518PM(i11, c31862c);
            }
        });
    }

    /* renamed from: aN */
    private void m86528aN() {
        C32044o1.m154612r().m154626j();
        C32044o1.m154612r().m154617L("media_box", false);
    }

    /* renamed from: dN */
    private void m86529dN(String str) {
        if (this.f79344s1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15346j(str));
        this.f79344s1 = true;
        c0766k.mo1413D8(1, str, new MuteTrackingSource(1));
    }

    /* renamed from: eN */
    private void m86530eN() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.l31
            @Override // java.lang.Runnable
            public final void run() {
                VipMessagesView.m86523UM();
            }
        });
    }

    /* renamed from: fN */
    private void m86531fN() {
        ContactProfile contactProfile;
        long currentTimeMillis = System.currentTimeMillis();
        long m121153L9 = AbstractC23309i.m121153L9() * 60 * 1000;
        if (m121153L9 > 86400000) {
            m121153L9 -= 43200000;
        }
        long j11 = currentTimeMillis - m121153L9;
        boolean z11 = false;
        for (int i11 = 0; i11 < this.f79320U0.size(); i11++) {
            MessagesListOAAdapter.C6986f c6986f = (MessagesListOAAdapter.C6986f) this.f79320U0.get(i11);
            if (c6986f != null) {
                contactProfile = c6986f.m35799b();
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                long m40402e0 = contactProfile.m40402e0();
                if (C19636i1.m102737w().m102762S(str) && j11 > m40402e0) {
                    C19636i1.m102737w().m102792v0(str);
                    z11 = true;
                }
            }
        }
        if (z11) {
            C0824j.m2153b(new C15344h(j11));
        }
    }

    /* renamed from: iN */
    private void m86535iN(boolean z11, int i11) {
        String m118743r0;
        if (z11) {
            View m92691vK = m92691vK();
            if (i11 > 1) {
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_deleting_multi_conversations, Integer.valueOf(i11));
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleting_single_conversation);
            }
            Snackbar m90634w = Snackbar.m90634w(m92691vK, m118743r0, (int) AbstractC0924m0.m3653a7());
            this.f79343r1 = m90634w;
            m90634w.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.n31
                public /* synthetic */ n31() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VipMessagesView.this.m86524VM(view);
                }
            });
            this.f79343r1.m90641G(true);
            this.f79343r1.m90648N();
            C32044o1.m154612r().m154618M("media_box", false);
            return;
        }
        Snackbar snackbar = this.f79343r1;
        if (snackbar != null) {
            snackbar.m90655n();
        }
    }

    /* renamed from: uM */
    private void m86547uM(C24275a c24275a) {
        if (c24275a == null || this.f79344s1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15345i(c24275a));
        this.f79344s1 = true;
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(1));
    }

    /* renamed from: vM */
    private void m86548vM(ArrayList arrayList) {
        if (this.f79317R0.m87318U().mo9215f() != null) {
            arrayList.add(new ContactProfile("-7"));
        }
    }

    /* renamed from: wM */
    private void m86549wM(ArrayList arrayList, int i11) {
        int m120745A8 = AbstractC23309i.m120745A8();
        synchronized (this.f79349x1) {
            try {
                if (this.f79331f1.isEmpty()) {
                    if (!this.f79349x1.isEmpty()) {
                    }
                }
                if (!arrayList.isEmpty() && i11 != 1) {
                    arrayList.add(new ContactProfile("-2"));
                }
                ContactProfile contactProfile = new ContactProfile("-1");
                contactProfile.mo2476e(AbstractC23136l9.m118743r0(AbstractC8020f0.label_section_suggest_oa));
                arrayList.add(contactProfile);
                HashMap hashMap = new HashMap();
                Iterator it = this.f79349x1.iterator();
                while (it.hasNext()) {
                    hashMap.put(((ContactProfile) it.next()).f42434r, Boolean.TRUE);
                }
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                for (ContactProfile contactProfile2 : this.f79349x1) {
                    while (arrayList2.size() < contactProfile2.f42353K1 && arrayList2.size() < m120745A8 && i12 < this.f79331f1.size()) {
                        if (!hashMap.containsKey(((ContactProfile) this.f79331f1.get(i12)).f42434r)) {
                            arrayList2.add((ContactProfile) this.f79331f1.get(i12));
                        }
                        i12++;
                    }
                    arrayList2.add(contactProfile2);
                }
                while (arrayList2.size() < m120745A8 && i12 < this.f79331f1.size()) {
                    if (!hashMap.containsKey(((ContactProfile) this.f79331f1.get(i12)).f42434r)) {
                        arrayList2.add((ContactProfile) this.f79331f1.get(i12));
                    }
                    i12++;
                }
                this.f79322W0.clear();
                if (this.f79331f1.size() - i12 > 3) {
                    int i13 = 0;
                    while (i13 < 2) {
                        this.f79322W0.add((ContactProfile) this.f79331f1.get(i12));
                        i13++;
                        i12++;
                    }
                    ContactProfile contactProfile3 = new ContactProfile("-16");
                    if (this.f79331f1.size() - i12 > 5) {
                        contactProfile3.f42437s = "5+";
                    } else {
                        contactProfile3.f42437s = String.valueOf(this.f79331f1.size() - i12);
                    }
                    this.f79322W0.add(contactProfile3);
                } else {
                    while (i12 < this.f79331f1.size()) {
                        this.f79322W0.add((ContactProfile) this.f79331f1.get(i12));
                        i12++;
                    }
                }
                arrayList.addAll(arrayList2);
                ContactProfile contactProfile4 = new ContactProfile("-6");
                contactProfile4.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.label_see_full_search_result);
                contactProfile4.f42352K0 = 0;
                arrayList.add(contactProfile4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: yM */
    public void m86550yM() {
        ViewStub viewStub;
        try {
            if (this.f79335j1 != null) {
                if (this.f79334i1 == null && (viewStub = (ViewStub) this.f79328c1.findViewById(AbstractC6918a0.stub_top_quick_action)) != null) {
                    this.f79334i1 = (FrameLayout) viewStub.inflate();
                }
                FrameLayout frameLayout = this.f79334i1;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(this.f79334i1.getContext(), this.f79335j1.f146309b);
                    this.f79334i1.addView(quickActionViewLayout);
                    quickActionViewLayout.m75818b(this.f79335j1, this.f79351z1);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.f79334i1;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
                this.f79334i1.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: zM */
    private String m86551zM(int i11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("position", i11);
            if (AbstractC0924m0.m3987lb()) {
                jSONObject2.put("clear", true);
            }
            jSONObject.put("mediabox", jSONObject2);
        } catch (JSONException e11) {
            AbstractC23350e.m122776f(this.f79315P0, e11);
        }
        return jSONObject.toString();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f79327b1 = new C23528a(this.f72421L0.m92648SI());
        m92637BK(true);
    }

    /* renamed from: CM */
    void m86552CM(String str, TrackingSource trackingSource) {
        try {
            if (this.f79346u1) {
                return;
            }
            int parseInt = Integer.parseInt(str);
            if (!this.f79336k1.containsKey(str)) {
                this.f79336k1.put(str, str);
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15348l(str));
            this.f79346u1 = true;
            if (trackingSource == null) {
                trackingSource = new TrackingSource(280);
            }
            c0766k.mo1578Y4(parseInt, trackingSource);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        Context m92648SI = this.f72421L0.m92648SI();
        if (m92648SI == null) {
            return null;
        }
        if (i11 != 1) {
            if (i11 != 7) {
                if (i11 != 8) {
                    return null;
                }
                return AbstractC23116k0.m118580h(m92648SI, false, new C15340d());
            }
            C8009j.a aVar = new C8009j.a(m92648SI);
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_unfollow_oa)).m43173v(2).m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unfollow_vip_acc)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_no_unfollow), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_yes_unfollow), this);
            C8009j m43152a = aVar.m43152a();
            m43152a.m92873y(true);
            return m43152a;
        }
        C8009j.a aVar2 = new C8009j.a(m92648SI);
        aVar2.m43159h(1).m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_confirm_delete_dialog_single_conversation_title, this.f79337l1.m40383Q(true, false))).m43173v(2).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_this_conversation_desc_2)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel_delete), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), this);
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        actionBarMenu.m92750r();
        actionBarMenu.m92738e(1, AbstractC16803z.icon_header_search);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f79317R0 = (k31) new C1802w0(this).m9378a(k31.class);
        int i11 = 0;
        View inflate = layoutInflater.inflate(AbstractC7409c0.oa_rmessageslist, viewGroup, false);
        this.f79328c1 = inflate;
        try {
            m86556LM(inflate);
            this.f79328c1.setOnClickListener(AbstractC23136l9.f112240a);
            if (bundle != null) {
                if (bundle.containsKey("mCurrentMode")) {
                    i11 = bundle.getInt("mCurrentMode");
                }
                this.f79316Q0 = i11;
            }
            if (!this.f79317R0.m87319W()) {
                m86553GM();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return this.f79328c1;
    }

    /* renamed from: GM */
    void m86553GM() {
        if (System.currentTimeMillis() < f79314A1 || this.f79350y1) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15338b());
        this.f79350y1 = true;
        c0766k.mo1637f8(1);
    }

    /* renamed from: HM */
    void m86554HM() {
        JSONArray jSONArray;
        int optInt;
        JSONObject optJSONObject;
        try {
            String m120968G9 = AbstractC23309i.m120968G9();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(m120968G9)) {
                try {
                    JSONObject jSONObject = new JSONObject(m120968G9);
                    if (jSONObject.optInt("error_code", -999) == 0) {
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                        long j11 = 0;
                        if (optJSONObject2 != null) {
                            j11 = optJSONObject2.optLong("expired", 0L);
                        }
                        this.f79332g1 = j11;
                        this.f79333h1 = AbstractC23309i.m122045j6();
                        if (optJSONObject2 != null) {
                            jSONArray = optJSONObject2.optJSONArray("data");
                        } else {
                            jSONArray = null;
                        }
                        if (jSONArray != null && jSONArray.length() > 0) {
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                try {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                                    if (jSONObject2 != null && ((optInt = jSONObject2.optInt("oaType")) == 0 || optInt == 1)) {
                                        String optString = jSONObject2.optString("oaid");
                                        if (!C21927m.m114302u().m114318P(optString) || this.f79336k1.containsKey(optString)) {
                                            String optString2 = jSONObject2.optString("avatar");
                                            String optString3 = jSONObject2.optString("displayName");
                                            int optInt2 = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                            String optString4 = jSONObject2.optString("desc");
                                            ContactProfile contactProfile = new ContactProfile(optString);
                                            contactProfile.f42437s = optString3;
                                            contactProfile.f42446v = optString2;
                                            contactProfile.f42352K0 = optInt2;
                                            contactProfile.m40401d1(optString4);
                                            contactProfile.f42356L1 = true;
                                            if (jSONObject2.has("track_ads") && (optJSONObject = jSONObject2.optJSONObject("track_ads")) != null) {
                                                int i12 = optJSONObject.getInt("campid");
                                                int i13 = optJSONObject.getInt("srcidx");
                                                String string = optJSONObject.getString("distribute_id");
                                                contactProfile.f42350J1 = i12;
                                                contactProfile.f42376S0 = i13;
                                                contactProfile.f42422m0 = string;
                                            }
                                            arrayList.add(contactProfile);
                                        }
                                    }
                                } catch (Exception e11) {
                                    AbstractC20110a.m104539h(e11);
                                }
                            }
                        }
                    }
                    synchronized (this.f79349x1) {
                        this.f79331f1 = arrayList;
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
            if (TextUtils.isEmpty(AbstractC23309i.m120968G9()) || System.currentTimeMillis() - this.f79333h1 > this.f79332g1) {
                m86555IM();
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* renamed from: IM */
    void m86555IM() {
        if (this.f79348w1) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15337a());
        this.f79348w1 = true;
        c0766k.mo1785y8();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f == 7 && i11 == -1) {
                    interfaceC17463d.dismiss();
                    TrackingSource trackingSource = new TrackingSource(280);
                    int i12 = this.f79337l1.f42350J1;
                    if (i12 != -1) {
                        trackingSource.m40677a("campaignId", Integer.valueOf(i12));
                        trackingSource.m40677a("srcId", Integer.valueOf(this.f79337l1.f42376S0));
                        trackingSource.m40677a("tracking_src", this.f79337l1.f42422m0);
                    }
                    m86563jN(this.f79337l1.f42434r, trackingSource);
                    return;
                }
                return;
            }
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                m86510BM(this.f79337l1.f42434r);
                C32044o1.m154612r().m154624S("media_box", Collections.singletonList(this.f79337l1.f42434r));
            } else if (i11 == -2) {
                interfaceC17463d.dismiss();
                C32044o1.m154612r().m154616K("media_box", Collections.singletonList(this.f79337l1.f42434r), false);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: LJ */
    public void mo39029LJ() {
        super.mo39029LJ();
        C0855y0 c0855y0 = this.f79341p1;
        if (c0855y0 != null) {
            c0855y0.m2383a();
            this.f79341p1 = null;
        }
    }

    /* renamed from: LM */
    void m86556LM(View view) {
        this.f79318S0 = (ListView) view.findViewById(AbstractC6918a0.contactlist);
        MessagesListOAAdapter messagesListOAAdapter = new MessagesListOAAdapter(this, this.f79327b1, this.f72421L0.m92651WI());
        this.f79319T0 = messagesListOAAdapter;
        messagesListOAAdapter.m35792w(this);
        this.f79319T0.m35782B(new C15341e());
        this.f79318S0.setAdapter((ListAdapter) this.f79319T0);
        this.f79318S0.setOnScrollListener(new C15342f());
        MultiStateView multiStateView = (MultiStateView) this.f79328c1.findViewById(AbstractC6918a0.multi_state);
        this.f79323X0 = multiStateView;
        multiStateView.setEnableLoadingText(false);
        this.f79323X0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_msglist));
        if (C23212s8.m119602i()) {
            this.f79323X0.setEmptyImageResourceId(AbstractC23322a.zds_il_conversation_empty_dark_spot_1_1);
        } else {
            this.f79323X0.setEmptyImageResourceId(AbstractC23322a.zds_il_conversation_empty_light_spot_1_1);
        }
        m86561gN(true);
        this.f79329d1 = true;
        m86560cN();
        m86530eN();
        AbstractC23126l.m118627a(this.f79315P0);
    }

    /* renamed from: MM */
    boolean m86557MM() {
        m86531fN();
        this.f72421L0.finish();
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (i11 != 1) {
            if (i11 == 16908332) {
                m86557MM();
            }
            return super.mo37491QJ(i11);
        }
        m86559bN();
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            if (this.f79326a1.booleanValue()) {
                if (m92648SI() != null) {
                    m92648SI().unregisterReceiver(this.f79325Z0);
                }
                this.f79326a1 = Boolean.FALSE;
            }
            m86530eN();
            if (C32044o1.m154612r().m154614G()) {
                C32044o1.m154612r().m154628n();
            }
            m86535iN(false, 0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            super.mo37118SJ(bundle);
            bundle.putInt("mCurrentMode", this.f79316Q0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title));
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(6020);
        arrayList.add(6081);
        arrayList.add(13000);
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f79324Y0;
        if (c8009j != null && c8009j.m92868m()) {
            this.f79324Y0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        MessagesListOAAdapter messagesListOAAdapter = this.f79319T0;
        if (messagesListOAAdapter != null) {
            messagesListOAAdapter.m35781A(false);
        }
        if (z11) {
            this.f79330e1 = true;
            if (this.f79319T0 != null) {
                m86558ZM();
                m86561gN(false);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        super.mo49153YJ(z11, z12);
        MessagesListOAAdapter messagesListOAAdapter = this.f79319T0;
        if (messagesListOAAdapter != null) {
            messagesListOAAdapter.m35781A(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f79317R0.m87317T().m9219j(m92657cJ(), new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.q31
            public /* synthetic */ q31() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                VipMessagesView.this.m86520RM((AbstractC15426a6) obj);
            }
        });
        if (this.f79317R0.m87319W()) {
            this.f79317R0.m87318U().m9219j(m92657cJ(), new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.r31
                public /* synthetic */ r31() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    VipMessagesView.this.m86521SM((InterfaceC22508f) obj);
                }
            });
        }
    }

    /* renamed from: ZM */
    void m86558ZM() {
        this.f79319T0.notifyDataSetChanged();
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: ar */
    public void mo35802ar(ContactProfile contactProfile, int i11) {
        if (contactProfile != null) {
            try {
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    String mo2478b = contactProfile.mo2478b();
                    if (mo2478b.equals("-3")) {
                        m86559bN();
                        return;
                    }
                    if (contactProfile.f42434r.equals("-5")) {
                        this.f79316Q0 = 1;
                        m86560cN();
                        AbstractC23647d.m123906p("26027");
                        AbstractC23647d.m123893c();
                        return;
                    }
                    if (contactProfile.f42434r.equals("-6")) {
                        m86559bN();
                        return;
                    }
                    if (contactProfile.f42434r.startsWith("-")) {
                        return;
                    }
                    if (C19636i1.m102737w().m102761R(mo2478b)) {
                        AbstractC23647d.m123907q("26020", "");
                    } else {
                        AbstractC23647d.m123907q("26021", "");
                    }
                    AbstractC23647d.m123893c();
                    if (contactProfile.f42356L1 && !C21927m.m114302u().m114318P(mo2478b)) {
                        m86566mN(contactProfile, false);
                    } else {
                        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                        if (m92676n2() != null) {
                            m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                        }
                        if (AbstractC23309i.m120962G3(3) == 1) {
                            C0809c1.m2050b(new C15343g(mo2478b, String.valueOf(i11)));
                        }
                    }
                    if (contactProfile.f42350J1 != -1) {
                        C28905e.m144373n().m144399u(String.valueOf(contactProfile.f42350J1), 20, 96, contactProfile.f42376S0, System.currentTimeMillis(), contactProfile.f42422m0);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: bN */
    void m86559bN() {
        Bundle bundle = new Bundle();
        bundle.putInt("title_search", 3);
        bundle.putString("keyword_search", "");
        bundle.putBoolean("only_media", true);
        if (m92662fJ() != null) {
            m92662fJ().m93069k2(SearchResultDetail.class, bundle, 1, true);
        }
    }

    /* renamed from: cN */
    public void m86560cN() {
        AbstractC0837p0.m2225f().mo2040a(this.f79347v1);
        m86527YM();
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: d9 */
    public void mo35803d9(String str) {
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: dH */
    public boolean mo35804dH(ContactProfile contactProfile) {
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            this.f79337l1 = contactProfile;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && !this.f79337l1.f42434r.startsWith("-")) {
                ArrayList arrayList = new ArrayList();
                if (!this.f79337l1.f42356L1) {
                    boolean m2033i = C0804b.m2025g().m2033i(this.f79337l1.f42434r);
                    HashMap hashMap = new HashMap();
                    if (m2033i) {
                        i13 = AbstractC8020f0.str_optionM_receiveNotification;
                    } else {
                        i13 = AbstractC8020f0.str_optionM_muteConversation;
                    }
                    hashMap.put("name", AbstractC23136l9.m118743r0(i13));
                    if (m2033i) {
                        i14 = AbstractC8020f0.str_optionM_receiveNotification;
                    } else {
                        i14 = AbstractC8020f0.str_optionM_muteConversation;
                    }
                    hashMap.put("id", Integer.valueOf(i14));
                    arrayList.add(hashMap);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_conversation));
                    hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_delete_conversation));
                    arrayList.add(hashMap2);
                }
                boolean m114318P = C21927m.m114302u().m114318P(this.f79337l1.f42434r);
                HashMap hashMap3 = new HashMap();
                if (m114318P) {
                    i11 = AbstractC8020f0.btn_vip_unfollow;
                } else {
                    i11 = AbstractC8020f0.btn_vip_follow;
                }
                hashMap3.put("name", AbstractC23136l9.m118743r0(i11));
                if (m114318P) {
                    i12 = AbstractC8020f0.btn_vip_unfollow;
                } else {
                    i12 = AbstractC8020f0.btn_vip_follow;
                }
                hashMap3.put("id", Integer.valueOf(i12));
                arrayList.add(hashMap3);
                SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                ContactProfile contactProfile2 = this.f79337l1;
                if (contactProfile2 != null) {
                    aVar.m43172u(contactProfile2.m40383Q(true, false));
                }
                aVar.m43173v(100);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.t31

                    /* renamed from: q */
                    public final /* synthetic */ SimpleAdapter f82158q;

                    /* renamed from: r */
                    public final /* synthetic */ ContactProfile f82159r;

                    public /* synthetic */ t31(SimpleAdapter simpleAdapter2, ContactProfile contactProfile3) {
                        r2 = simpleAdapter2;
                        r3 = contactProfile3;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                        VipMessagesView.this.m86522TM(r2, r3, interfaceC17463d, i15);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f79324Y0 = m43152a;
                if (m43152a != null && !m43152a.m92868m()) {
                    this.f79324Y0.mo13822K();
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: gN */
    void m86561gN(boolean z11) {
        if (z11) {
            this.f79323X0.setVisibility(0);
            this.f79323X0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f79318S0.setVisibility(8);
            return;
        }
        MessagesListOAAdapter messagesListOAAdapter = this.f79319T0;
        if (messagesListOAAdapter != null && messagesListOAAdapter.getCount() > 0) {
            this.f79323X0.setVisibility(8);
            this.f79318S0.setVisibility(0);
        } else {
            this.f79323X0.setVisibility(0);
            this.f79318S0.setVisibility(8);
            this.f79323X0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "VipMessagesView";
    }

    /* renamed from: hN */
    public void m86562hN(int i11) {
        try {
            m86547uM(AbstractC19646n0.m103040w0(i11, this.f79337l1.f42434r, false, 3));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: jN */
    void m86563jN(String str, TrackingSource trackingSource) {
        try {
            if (this.f79345t1) {
                return;
            }
            int parseInt = Integer.parseInt(str);
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15347k(str));
            this.f79345t1 = true;
            if (trackingSource == null) {
                trackingSource = new TrackingSource(-1);
            }
            c0766k.mo1766w6(parseInt, trackingSource);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: kN */
    void m86564kN() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.v31
                public /* synthetic */ v31() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VipMessagesView.this.m86525WM();
                }
            });
        }
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: l6 */
    public void mo35805l6(ContactProfile contactProfile) {
        TrackingSource trackingSource;
        try {
            if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                if (m92676n2() != null) {
                    m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                    return;
                }
                return;
            }
            this.f79337l1 = contactProfile;
            if (contactProfile.f42350J1 != -1) {
                trackingSource = new TrackingSource(280);
                trackingSource.m40677a("campaignId", Integer.valueOf(contactProfile.f42350J1));
                trackingSource.m40677a("srcId", Integer.valueOf(contactProfile.f42376S0));
                trackingSource.m40677a("tracking_src", contactProfile.f42422m0);
            } else {
                trackingSource = null;
            }
            m86552CM(contactProfile.f42434r, trackingSource);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: lN */
    void m86565lN() {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.u31
            public /* synthetic */ u31() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VipMessagesView.this.m86526XM();
            }
        });
    }

    /* renamed from: mN */
    void m86566mN(ContactProfile contactProfile, boolean z11) {
        int i11;
        boolean z12;
        try {
            C32002l4 m154264g = C32002l4.m154264g(31);
            if (z11) {
                i11 = contactProfile.f42376S0;
                z12 = false;
            } else {
                TrackingSource trackingSource = new TrackingSource(280);
                int i12 = contactProfile.f42350J1;
                if (i12 != -1) {
                    trackingSource.m40677a("campaignId", Integer.valueOf(i12));
                    trackingSource.m40677a("srcId", Integer.valueOf(contactProfile.f42376S0));
                    trackingSource.m40677a("tracking_src", contactProfile.f42422m0);
                }
                C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                i11 = -1;
                z12 = true;
            }
            new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile.f42434r, m154264g).m135759r(z11).m135761t(z12).m135740G(i11).m135743b(), 0, 1));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: n0 */
    public void mo35806n0(int i11) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1021 && this.f79319T0 != null) {
            m86558ZM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return m86557MM();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f79317R0.m87321c0();
        try {
            if (!this.f79326a1.booleanValue()) {
                if (m92648SI() != null) {
                    m92648SI().registerReceiver(this.f79325Z0, new IntentFilter("com.zing.zalo.worker.AlarmSettingController.Chat"));
                }
                this.f79326a1 = Boolean.TRUE;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        try {
            if (!this.f79329d1) {
                m86560cN();
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: v4 */
    public AbstractC1785o mo35807v4() {
        return getLifecycle();
    }

    @Override // com.zing.zalo.adapters.MessagesListOAAdapter.InterfaceC6988h
    /* renamed from: wB */
    public int mo35808wB() {
        return 1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 6020) {
            if (i11 != 6081) {
                if (i11 == 13000) {
                    m86560cN();
                    return;
                }
                return;
            }
            m86515KM();
            return;
        }
        m86527YM();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0005, B:12:0x0019, B:14:0x001d, B:17:0x002d, B:22:0x0135, B:23:0x003c, B:29:0x004e, B:31:0x0052, B:33:0x005b, B:35:0x0067, B:37:0x006e, B:39:0x0074, B:42:0x0079, B:44:0x0089, B:46:0x008f, B:48:0x0097, B:50:0x00a5, B:52:0x00e5, B:54:0x00ef, B:55:0x00fc, B:57:0x0101, B:60:0x00ba, B:63:0x00d7, B:66:0x0120, B:68:0x0128, B:70:0x0132, B:73:0x013a, B:75:0x013e, B:76:0x0145, B:79:0x0026, B:80:0x0012), top: B:2:0x0005 }] */
    /* renamed from: xM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m86567xM(int i11, int i12, List list) {
        int size;
        HashMap m2385c;
        ContactProfile m35799b;
        C23669z c23669z;
        C23669z c23669z2;
        int i13 = 3;
        try {
            if (AbstractC23309i.m120962G3(3) != 1) {
                return;
            }
            char c11 = 0;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size == 0) {
                return;
            }
            C0855y0 c0855y0 = this.f79341p1;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            int i14 = 0;
            while (i14 < size) {
                MessagesListOAAdapter.C6986f c6986f = (MessagesListOAAdapter.C6986f) list.get(i14);
                if (c6986f != null && (m35799b = c6986f.m35799b()) != null) {
                    if (i14 >= i11 && i14 <= i12) {
                        if (m35799b.f42375S == i13) {
                            if (m2385c.containsKey(m35799b.f42434r)) {
                                C23669z c23669z3 = (C23669z) m2385c.get(m35799b.f42434r);
                                if (c23669z3 instanceof C23651h) {
                                    C23651h c23651h = (C23651h) c23669z3;
                                    if (c23651h.f114659f != null && c23651h.m123964l() && !c23669z3.f114660g) {
                                        c23669z3.f114660g = true;
                                        String valueOf = String.valueOf(i14);
                                        if (c23651h.f114659f[2].equals(valueOf)) {
                                            String str = c23651h.f114659f[c11];
                                            if (str == null || str.isEmpty()) {
                                                str = "1";
                                            }
                                            c23651h.f114659f[c11] = String.valueOf(Integer.parseInt(str) + 1);
                                        } else {
                                            c23669z3.f114656c = System.currentTimeMillis();
                                            c23651h.f114659f[0] = String.valueOf(1);
                                            c23651h.f114659f[2] = valueOf;
                                        }
                                    }
                                    i14++;
                                    i13 = 3;
                                }
                                c23669z2 = (C23669z) m2385c.get(m35799b.f42434r);
                                if (c23669z2 != null) {
                                    C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
                                }
                            } else {
                                String[] strArr = new String[i13];
                                strArr[0] = String.valueOf(1);
                                strArr[1] = m35799b.f42434r;
                                strArr[2] = String.valueOf(i14);
                                C23651h m123961i = C23651h.m123961i(7, strArr);
                                if (m123961i == null) {
                                    c11 = 0;
                                    i14++;
                                    i13 = 3;
                                } else {
                                    m123961i.f114654a = 3;
                                    m123961i.f114655b = 1;
                                    m123961i.f114657d = 7;
                                    m123961i.f114660g = true;
                                    m2385c.put(m35799b.f42434r, m123961i);
                                    c23669z2 = (C23669z) m2385c.get(m35799b.f42434r);
                                    if (c23669z2 != null) {
                                    }
                                }
                            }
                        }
                        if (m35799b.f42350J1 != -1) {
                            C28905e.m144373n().m144399u(String.valueOf(m35799b.f42350J1), 10, 96, m35799b.f42376S0, System.currentTimeMillis(), m35799b.f42422m0);
                        }
                    } else if (m2385c.containsKey(m35799b.f42434r) && (c23669z = (C23669z) m2385c.get(m35799b.f42434r)) != null) {
                        c11 = 0;
                        c23669z.f114660g = false;
                        i14++;
                        i13 = 3;
                    }
                    c11 = 0;
                    i14++;
                    i13 = 3;
                }
                i14++;
                i13 = 3;
            }
            if (this.f79341p1 == null) {
                this.f79341p1 = new C0855y0();
            }
            this.f79341p1.m2386d(m2385c);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
