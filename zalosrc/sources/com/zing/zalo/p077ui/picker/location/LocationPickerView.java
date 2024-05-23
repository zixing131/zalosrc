package com.zing.zalo.p077ui.picker.location;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import bo.C3063z0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.location.AbstractC8971q;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.LiveLocationBar;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import k90.C21615j;
import me0.AbstractC23034c6;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23046d7;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import np.InterfaceC23923b;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.C18460c;
import p227i3.C20218v;
import p227i3.C20219w;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p509sp.C26361j;
import p542ub.InterfaceC27218a;
import p667y2.C30271h;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.AbstractC28248z6;
import vg.C28139n5;
import vg.C28157p5;
import vg.C28239y6;
import z20.AbstractC31195a;

/* loaded from: classes6.dex */
public final class LocationPickerView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC0733x, InterfaceC23923b {
    public static final C12770a Companion = new C12770a(null);

    /* renamed from: A1 */
    private boolean f66415A1;

    /* renamed from: B1 */
    private boolean f66416B1;

    /* renamed from: C1 */
    private View f66417C1;

    /* renamed from: D1 */
    private SensitiveData f66418D1;

    /* renamed from: E1 */
    private final InterfaceC24854k f66419E1;

    /* renamed from: F1 */
    private final InterfaceC24854k f66420F1;

    /* renamed from: G1 */
    private InterfaceC12771b f66421G1;

    /* renamed from: H1 */
    private View f66422H1;

    /* renamed from: I1 */
    private int f66423I1;

    /* renamed from: J1 */
    private View f66424J1;

    /* renamed from: K1 */
    private RobotoTextView f66425K1;

    /* renamed from: L1 */
    private ImageButton f66426L1;

    /* renamed from: M1 */
    private LayoutInflater f66427M1;

    /* renamed from: N1 */
    private C23528a f66428N1;

    /* renamed from: O1 */
    private View f66429O1;

    /* renamed from: P0 */
    private ListView f66430P0;

    /* renamed from: P1 */
    private LiveLocationBar f66431P1;

    /* renamed from: Q0 */
    private boolean f66432Q0;

    /* renamed from: Q1 */
    private String f66433Q1;

    /* renamed from: R0 */
    private View f66434R0;

    /* renamed from: R1 */
    private MultiStateView f66435R1;

    /* renamed from: S0 */
    private TextView f66436S0;

    /* renamed from: S1 */
    private int f66437S1;

    /* renamed from: T0 */
    private boolean f66438T0;

    /* renamed from: T1 */
    private ActionLogChatLocation.FooterLogData f66439T1;

    /* renamed from: U1 */
    private int f66441U1;

    /* renamed from: V0 */
    private boolean f66442V0;

    /* renamed from: V1 */
    private String f66443V1;

    /* renamed from: W1 */
    private int[] f66445W1;

    /* renamed from: X0 */
    private int f66446X0;

    /* renamed from: X1 */
    private int f66447X1;

    /* renamed from: Y1 */
    private Button f66449Y1;

    /* renamed from: Z1 */
    private boolean f66451Z1;

    /* renamed from: a1 */
    private int f66452a1;

    /* renamed from: b1 */
    private int f66453b1;

    /* renamed from: e1 */
    private C21615j f66456e1;

    /* renamed from: f1 */
    private View f66457f1;

    /* renamed from: g1 */
    private View f66458g1;

    /* renamed from: h1 */
    private View f66459h1;

    /* renamed from: i1 */
    private View f66460i1;

    /* renamed from: j1 */
    private View f66461j1;

    /* renamed from: k1 */
    private LinearLayout f66462k1;

    /* renamed from: l1 */
    private LinearLayout f66463l1;

    /* renamed from: m1 */
    private FrameLayout f66464m1;

    /* renamed from: n1 */
    private AspectRatioImageView f66465n1;

    /* renamed from: o1 */
    private RobotoTextView f66466o1;

    /* renamed from: p1 */
    private ViewGroup f66467p1;

    /* renamed from: q1 */
    private View f66468q1;

    /* renamed from: r1 */
    private RobotoTextView f66469r1;

    /* renamed from: s1 */
    private RobotoTextView f66470s1;

    /* renamed from: t1 */
    private View f66471t1;

    /* renamed from: u1 */
    private C18460c f66472u1;

    /* renamed from: v1 */
    private Location f66473v1;

    /* renamed from: w1 */
    private long f66474w1;

    /* renamed from: x1 */
    private C18460c f66475x1;

    /* renamed from: z1 */
    private boolean f66477z1;

    /* renamed from: U0 */
    private String f66440U0 = "";

    /* renamed from: W0 */
    private int f66444W0 = 1;

    /* renamed from: Y0 */
    private String f66448Y0 = "";

    /* renamed from: Z0 */
    private String f66450Z0 = "";

    /* renamed from: c1 */
    private ArrayList f66454c1 = new ArrayList();

    /* renamed from: d1 */
    private HashMap f66455d1 = new HashMap();

    /* renamed from: y1 */
    private String f66476y1 = "";

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12770a {
        private C12770a() {
        }

        public /* synthetic */ C12770a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3063z0 m72045a(Intent intent) {
            String str;
            String str2;
            AbstractC19074t.m100208f(intent, "intent");
            double doubleExtra = intent.getDoubleExtra("extra_selected_long", -1.0d);
            double doubleExtra2 = intent.getDoubleExtra("extra_selected_lat", -1.0d);
            String stringExtra = intent.getStringExtra("extra_selected_name");
            if (stringExtra == null) {
                str = "";
            } else {
                str = stringExtra;
            }
            String stringExtra2 = intent.getStringExtra("extra_selected_id");
            if (stringExtra2 == null) {
                str2 = "";
            } else {
                str2 = stringExtra2;
            }
            if (doubleExtra != -1.0d && doubleExtra2 != -1.0d && str.length() > 0) {
                return new C3063z0(str2, doubleExtra, doubleExtra2, str, true);
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12771b {
        /* renamed from: a */
        void mo60384a(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData);

        /* renamed from: h */
        void mo60385h();
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$c */
    /* loaded from: classes6.dex */
    public static final class C12772c implements InterfaceC20094a {
        C12772c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m72048e(LocationPickerView locationPickerView, C18460c c18460c) {
            AbstractC19074t.m100208f(locationPickerView, "this$0");
            C21615j c21615j = locationPickerView.f66456e1;
            if (c21615j != null) {
                c21615j.m111551e(locationPickerView.f66475x1);
            }
            C21615j c21615j2 = locationPickerView.f66456e1;
            if (c21615j2 != null) {
                c21615j2.m111549c(locationPickerView.f66454c1);
            }
            locationPickerView.f66415A1 = false;
            LocationPickerView.m71992XM(locationPickerView, false, null, 2, null);
            if (c18460c != null) {
                String str = c18460c.f93020a;
                String str2 = c18460c.f93021b;
                String str3 = c18460c.f93022c;
                locationPickerView.m71984ON(str, str2, str3, str3, c18460c.f93025f, c18460c.f93026g, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m72049f(LocationPickerView locationPickerView, C20096c c20096c) {
            AbstractC19074t.m100208f(locationPickerView, "this$0");
            if (!locationPickerView.f66454c1.isEmpty()) {
                C21615j c21615j = locationPickerView.f66456e1;
                if (c21615j != null) {
                    c21615j.m111551e(locationPickerView.f66475x1);
                }
                C21615j c21615j2 = locationPickerView.f66456e1;
                if (c21615j2 != null) {
                    c21615j2.m111549c(locationPickerView.f66454c1);
                }
            }
            locationPickerView.m71991WM(false, c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            LocationPickerView.this.f66415A1 = false;
            LocationPickerView.this.f66442V0 = false;
            final LocationPickerView locationPickerView = LocationPickerView.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: k90.s
                @Override // java.lang.Runnable
                public final void run() {
                    LocationPickerView.C12772c.m72049f(LocationPickerView.this, c20096c);
                }
            });
            LocationPickerView.this.f66477z1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Runnable runnable;
            int i11;
            String string;
            String string2;
            int i12;
            int i13;
            JSONObject optJSONObject;
            boolean z11;
            AbstractC19074t.m100208f(obj, "entity");
            final C18460c c18460c = null;
            try {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    LocationPickerView locationPickerView = LocationPickerView.this;
                    if (jSONObject.isNull("srcType")) {
                        i11 = 0;
                    } else {
                        i11 = jSONObject.getInt("srcType");
                    }
                    locationPickerView.f66446X0 = i11;
                    LocationPickerView locationPickerView2 = LocationPickerView.this;
                    String str = "";
                    if (jSONObject.isNull("appId")) {
                        string = "";
                    } else {
                        string = jSONObject.getString("appId");
                        AbstractC19074t.m100207e(string, "getString(...)");
                    }
                    locationPickerView2.f66476y1 = string;
                    LocationPickerView locationPickerView3 = LocationPickerView.this;
                    if (jSONObject.isNull("providerDesc")) {
                        string2 = "";
                    } else {
                        string2 = jSONObject.getString("providerDesc");
                        AbstractC19074t.m100207e(string2, "getString(...)");
                    }
                    locationPickerView3.f66448Y0 = string2;
                    LocationPickerView locationPickerView4 = LocationPickerView.this;
                    if (!jSONObject.isNull("providerIcon")) {
                        str = jSONObject.getString("providerIcon");
                        AbstractC19074t.m100207e(str, "getString(...)");
                    }
                    locationPickerView4.f66450Z0 = str;
                    LocationPickerView locationPickerView5 = LocationPickerView.this;
                    if (jSONObject.isNull(C20219w.f100062c)) {
                        i12 = 0;
                    } else {
                        i12 = jSONObject.getInt(C20219w.f100062c);
                    }
                    locationPickerView5.f66452a1 = i12;
                    LocationPickerView locationPickerView6 = LocationPickerView.this;
                    if (jSONObject.isNull(C30271h.f140642d)) {
                        i13 = 0;
                    } else {
                        i13 = jSONObject.getInt(C30271h.f140642d);
                    }
                    locationPickerView6.f66453b1 = i13;
                    if (LocationPickerView.this.f66476y1.length() > 0) {
                        AbstractC23309i.m120872Do(LocationPickerView.this.f66476y1);
                    }
                    if (jSONObject.has("entries")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("entries");
                        int length = jSONArray.length();
                        for (int i14 = 0; i14 < length; i14++) {
                            C18460c.a aVar = C18460c.Companion;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                            C18460c m97791a = aVar.m97791a(jSONObject2);
                            if (!LocationPickerView.this.f66455d1.containsKey(m97791a.f93020a)) {
                                LocationPickerView.this.f66454c1.add(m97791a);
                                HashMap hashMap = LocationPickerView.this.f66455d1;
                                String str2 = m97791a.f93020a;
                                hashMap.put(str2, str2);
                            }
                        }
                        LocationPickerView locationPickerView7 = LocationPickerView.this;
                        if (jSONArray.length() >= 20) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        locationPickerView7.f66442V0 = z11;
                    }
                    if (jSONObject.has("current_location") && (optJSONObject = jSONObject.optJSONObject("current_location")) != null) {
                        c18460c = C18460c.Companion.m97791a(optJSONObject);
                    }
                    LocationPickerView.this.f66444W0++;
                    final LocationPickerView locationPickerView8 = LocationPickerView.this;
                    runnable = new Runnable() { // from class: k90.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationPickerView.C12772c.m72048e(LocationPickerView.this, c18460c);
                        }
                    };
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    final LocationPickerView locationPickerView9 = LocationPickerView.this;
                    runnable = new Runnable() { // from class: k90.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationPickerView.C12772c.m72048e(LocationPickerView.this, c18460c);
                        }
                    };
                }
                AbstractC19444a.m101697e(runnable);
                LocationPickerView.this.f66477z1 = false;
            } catch (Throwable th2) {
                final LocationPickerView locationPickerView10 = LocationPickerView.this;
                AbstractC19444a.m101697e(new Runnable() { // from class: k90.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationPickerView.C12772c.m72048e(LocationPickerView.this, c18460c);
                    }
                });
                LocationPickerView.this.f66477z1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$d */
    /* loaded from: classes6.dex */
    public static final class C12773d extends AbstractC28248z6.f {

        /* renamed from: b */
        final /* synthetic */ boolean f66480b;

        C12773d(boolean z11) {
            this.f66480b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m72052d(LocationPickerView locationPickerView, boolean z11) {
            AbstractC19074t.m100208f(locationPickerView, "this$0");
            locationPickerView.m71993YM(z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m72053e(LocationPickerView locationPickerView, C20096c c20096c) {
            AbstractC19074t.m100208f(locationPickerView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            locationPickerView.m71991WM(false, c20096c);
            if (new C28239y6().m142223b(locationPickerView.m92648SI()) == 1) {
                locationPickerView.m71977KN(3);
            }
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            Object obj;
            String str;
            int i12;
            if (location == null) {
                obj = "NULL";
            } else {
                obj = location;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadLocation: received ");
            sb2.append(obj);
            C28157p5 m141667d = C28157p5.m141667d();
            if (location == null) {
                str = "RECEIVER---LOCATION---NULL";
            } else {
                str = "RECEIVE---LOCATION---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime();
            }
            m141667d.m141676k(str);
            if (LocationPickerView.this.m92674mJ() && !LocationPickerView.this.m92677nJ()) {
                if (location != null) {
                    LocationPickerView.this.f66473v1 = location;
                    LocationPickerView.this.f66474w1 = System.currentTimeMillis();
                    if (AbstractC19444a.m101693a()) {
                        LocationPickerView.this.m71993YM(this.f66480b);
                    } else {
                        final LocationPickerView locationPickerView = LocationPickerView.this;
                        final boolean z11 = this.f66480b;
                        AbstractC19444a.m101695c(new Runnable() { // from class: k90.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocationPickerView.C12773d.m72052d(LocationPickerView.this, z11);
                            }
                        });
                    }
                } else {
                    if (!C23055e5.m118272g(false)) {
                        i12 = 50001;
                    } else {
                        i12 = 112;
                    }
                    final C20096c c20096c = new C20096c(i12, AbstractC23161o1.m119318c(i12, ""));
                    final LocationPickerView locationPickerView2 = LocationPickerView.this;
                    AbstractC19444a.m101697e(new Runnable() { // from class: k90.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationPickerView.C12773d.m72053e(LocationPickerView.this, c20096c);
                        }
                    });
                }
            }
            LocationPickerView.this.f66416B1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$e */
    /* loaded from: classes6.dex */
    static final class C12774e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12774e f66481q = new C12774e();

        /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$e$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC20094a {
            a() {
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC23350e.m122774d("LocationPickerView", "Report location failed: " + c20096c);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
            }
        }

        C12774e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0766k mo12V4() {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a());
            return c0766k;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$f */
    /* loaded from: classes6.dex */
    static final class C12775f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12775f f66482q = new C12775f();

        C12775f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0766k mo12V4() {
            return new C0766k();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$g */
    /* loaded from: classes6.dex */
    public static final class C12776g implements LiveLocationBar.InterfaceC8979b {
        C12776g() {
        }

        @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
        /* renamed from: a */
        public void mo48007a() {
            LocationPickerView.this.m71975JN();
        }

        @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
        /* renamed from: b */
        public void mo48008b() {
            C8969o m47910L = C8967m.m47867E().m47910L(LocationPickerView.this.f66433Q1);
            if (m47910L != null) {
                C8967m.m47867E().m47938t(m47910L);
            }
        }

        @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
        /* renamed from: c */
        public void mo48009c() {
            LocationPickerView.this.m71975JN();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.LocationPickerView$h */
    /* loaded from: classes6.dex */
    public static final class C12777h implements AbsListView.OnScrollListener {
        C12777h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(absListView, "view");
            if ((i11 + i12) - 1 >= i13 - 1 && !LocationPickerView.this.f66415A1 && LocationPickerView.this.f66442V0) {
                AbstractC23647d.m123906p("917811");
                LocationPickerView.this.m71997cN(C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m());
                AbstractC23647d.m123893c();
            }
            LocationPickerView.this.m72039MN();
            if (!LocationPickerView.this.f66442V0) {
                LocationPickerView.this.m71967FN(8);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            AbstractC19074t.m100208f(absListView, "view");
            if (i11 == 0) {
                C21615j c21615j = LocationPickerView.this.f66456e1;
                if (c21615j != null) {
                    c21615j.m111550d(false);
                }
                C21615j c21615j2 = LocationPickerView.this.f66456e1;
                if (c21615j2 != null) {
                    c21615j2.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C21615j c21615j3 = LocationPickerView.this.f66456e1;
            if (c21615j3 != null) {
                c21615j3.m111550d(true);
            }
        }
    }

    public LocationPickerView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(C12775f.f66482q);
        this.f66419E1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C12774e.f66481q);
        this.f66420F1 = m129210a2;
        this.f66433Q1 = "";
        this.f66445W1 = new int[2];
        this.f66447X1 = -1;
    }

    /* renamed from: CN */
    private final void m71961CN() {
        try {
            C18460c c18460c = this.f66475x1;
            Intent intent = new Intent();
            if (c18460c != null) {
                if (!TextUtils.isEmpty(c18460c.f93021b)) {
                    intent.putExtra("extra_selected_name", c18460c.f93021b);
                } else {
                    intent.putExtra("extra_selected_name", c18460c.f93022c);
                }
                intent.putExtra("extra_selected_address", c18460c.f93022c);
                intent.putExtra("extra_selected_long", c18460c.f93025f);
                intent.putExtra("extra_selected_lat", c18460c.f93026g);
                intent.putExtra("extra_selected_id", c18460c.f93020a);
            }
            mo50035CK(-1, intent);
            finish();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: DN */
    private final void m71963DN(int i11) {
        View view = this.f66458g1;
        if (view != null) {
            view.setVisibility(i11);
        }
        View view2 = this.f66457f1;
        if (view2 != null) {
            view2.setVisibility(i11);
        }
        View view3 = this.f66459h1;
        if (view3 != null) {
            view3.setVisibility(i11);
        }
    }

    /* renamed from: EN */
    private final void m71965EN(int i11) {
        int i12;
        AspectRatioImageView aspectRatioImageView;
        int i13;
        if (this.f66460i1 == null) {
            LayoutInflater layoutInflater = this.f66427M1;
            View view = null;
            if (layoutInflater != null) {
                view = layoutInflater.inflate(AbstractC7409c0.layout_pick_location_footer, (ViewGroup) null, false);
            }
            this.f66460i1 = view;
            if (view != null) {
                view.setVisibility(8);
                View findViewById = view.findViewById(AbstractC6918a0.layoutLocationSource);
                this.f66434R0 = findViewById;
                if (findViewById != null) {
                    findViewById.setOnClickListener(AbstractC23136l9.f112240a);
                }
                AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) view.findViewById(AbstractC6918a0.imv_location_provider);
                this.f66465n1 = aspectRatioImageView2;
                if (aspectRatioImageView2 != null) {
                    aspectRatioImageView2.setScaleOption(5);
                }
                this.f66466o1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_name_provider);
                this.f66469r1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_desc);
                this.f66470s1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_desc_2);
                this.f66467p1 = (ViewGroup) view.findViewById(AbstractC6918a0.layout_report);
                View findViewById2 = view.findViewById(AbstractC6918a0.btn_dismiss);
                this.f66468q1 = findViewById2;
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(this);
                }
                View findViewById3 = view.findViewById(AbstractC6918a0.btn_report);
                this.f66471t1 = findViewById3;
                if (findViewById3 != null) {
                    findViewById3.setOnClickListener(this);
                }
            }
        }
        if (i11 == 0 && (this.f66448Y0.length() > 0 || this.f66450Z0.length() > 0)) {
            RobotoTextView robotoTextView = this.f66466o1;
            if (robotoTextView != null) {
                if (TextUtils.isEmpty(this.f66448Y0)) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                robotoTextView.setVisibility(i13);
                robotoTextView.setText(this.f66448Y0);
            }
            int i14 = this.f66452a1;
            if (i14 > 0 && (i12 = this.f66453b1) > 0 && (aspectRatioImageView = this.f66465n1) != null && aspectRatioImageView != null) {
                aspectRatioImageView.setRatio((i12 * 1.0f) / i14);
            }
            if (this.f66450Z0.length() > 0) {
                AspectRatioImageView aspectRatioImageView3 = this.f66465n1;
                if (aspectRatioImageView3 != null) {
                    aspectRatioImageView3.setVisibility(0);
                }
                AspectRatioImageView aspectRatioImageView4 = this.f66465n1;
                if (aspectRatioImageView4 != null) {
                    aspectRatioImageView4.setImageDrawable(C23212s8.m119609q(getContext(), AbstractC16781w.google_map_provider));
                }
            } else {
                AspectRatioImageView aspectRatioImageView5 = this.f66465n1;
                if (aspectRatioImageView5 != null) {
                    aspectRatioImageView5.setVisibility(8);
                }
            }
        }
        m71988SM(this.f66460i1, i11);
        View view2 = this.f66460i1;
        if (view2 != null) {
            view2.setVisibility(i11);
        }
        View view3 = this.f66434R0;
        if (view3 != null) {
            view3.setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public final void m71967FN(int i11) {
        if (this.f66461j1 == null) {
            LayoutInflater layoutInflater = this.f66427M1;
            View view = null;
            if (layoutInflater != null) {
                view = layoutInflater.inflate(AbstractC7409c0.footer_loading, (ViewGroup) null, false);
            }
            this.f66461j1 = view;
            if (view != null) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(AbstractC6918a0.layoutFeedFooter);
                this.f66464m1 = frameLayout;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
                this.f66462k1 = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
                this.f66463l1 = linearLayout2;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
        }
        m71988SM(this.f66464m1, i11);
        FrameLayout frameLayout2 = this.f66464m1;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(i11);
        }
        FrameLayout frameLayout3 = this.f66464m1;
        if (frameLayout3 != null) {
            frameLayout3.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PopupBackgroundColor));
        }
        LinearLayout linearLayout3 = this.f66463l1;
        if (linearLayout3 != null) {
            linearLayout3.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PopupBackgroundColor));
        }
        AbstractC23136l9.m118747s1(this.f66463l1, i11, false);
    }

    /* renamed from: GN */
    private final void m71969GN() {
        View view;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        View view3;
        ListView listView;
        ListView listView2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ListView listView3;
        View view4;
        LiveLocationBar liveLocationBar;
        ListView listView4;
        View view5 = this.f66417C1;
        View view6 = null;
        if (view5 == null) {
            AbstractC19074t.m100223u("mRootView");
            view5 = null;
        }
        this.f66430P0 = (ListView) view5.findViewById(AbstractC6918a0.location_list);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.getBoolean("EXTRA_BOOL_HAS_LIVE_LOCATION_HEADER")) {
                LayoutInflater layoutInflater = this.f66427M1;
                if (layoutInflater != null) {
                    view4 = layoutInflater.inflate(AbstractC7409c0.layout_pick_location_header_live_location, (ViewGroup) this.f66430P0, false);
                } else {
                    view4 = null;
                }
                this.f66429O1 = view4;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                View view7 = this.f66429O1;
                if (view7 != null && (listView4 = this.f66430P0) != null) {
                    listView4.addHeaderView(view7);
                }
                View view8 = this.f66429O1;
                if (view8 != null) {
                    liveLocationBar = (LiveLocationBar) view8.findViewById(AbstractC6918a0.live_location_bar);
                } else {
                    liveLocationBar = null;
                }
                this.f66431P1 = liveLocationBar;
                if (liveLocationBar != null) {
                    liveLocationBar.setMode(3);
                    liveLocationBar.setVisibility(8);
                    liveLocationBar.getLayoutParams().width = -1;
                    liveLocationBar.setBackgroundResource(AbstractC16803z.rectangle_transparent);
                    liveLocationBar.setHandleClickListener(true);
                    liveLocationBar.setListener(new C12776g());
                }
            }
            if (m92642L3.getBoolean("EXTRA_BOOL_HAS_NESTED_SCROLL_BEHAVIOR") && (listView3 = this.f66430P0) != null) {
                AbstractC1579n0.m7831P0(listView3, true);
            }
            if (m92642L3.getBoolean("EXTRA_BOOL_CONFIG_UI_FOR_BOTTOM_SHEET_PICKER") && (listView2 = this.f66430P0) != null) {
                this.f66451Z1 = true;
                ViewGroup.LayoutParams layoutParams2 = listView2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = AbstractC23136l9.m118742r(8.0f);
                }
                listView2.setVerticalFadingEdgeEnabled(true);
                listView2.setFadingEdgeLength(AbstractC23136l9.m118742r(8.0f));
            }
            if (m92642L3.getBoolean("EXTRA_BOOL_HAS_NEARBY_PLACES_TITLE")) {
                LayoutInflater layoutInflater2 = this.f66427M1;
                if (layoutInflater2 != null) {
                    view3 = layoutInflater2.inflate(AbstractC7409c0.layout_pick_location_header_nearby_places, (ViewGroup) null, false);
                } else {
                    view3 = null;
                }
                this.f66458g1 = view3;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                View view9 = this.f66458g1;
                if (view9 != null && (listView = this.f66430P0) != null) {
                    listView.addHeaderView(view9);
                }
            }
        }
        LayoutInflater layoutInflater3 = this.f66427M1;
        if (layoutInflater3 != null) {
            view = layoutInflater3.inflate(AbstractC7409c0.layout_pick_location_header, (ViewGroup) null, false);
        } else {
            view = null;
        }
        this.f66457f1 = view;
        if (view != null) {
            view.setVisibility(8);
        }
        View view10 = this.f66457f1;
        if (view10 != null) {
            View findViewById = view10.findViewById(AbstractC6918a0.current_location_info);
            this.f66459h1 = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(this);
                findViewById.setAlpha(0.5f);
                findViewById.setVisibility(8);
            }
            this.f66436S0 = (TextView) view10.findViewById(AbstractC6918a0.current_location_address);
            if (this.f66451Z1 && (textView = (TextView) view10.findViewById(AbstractC6918a0.location_title)) != null) {
                textView.setText(AbstractC8020f0.str_location_current_location_2);
            }
            ListView listView5 = this.f66430P0;
            if (listView5 != null) {
                listView5.addHeaderView(view10);
            }
        }
        LayoutInflater layoutInflater4 = this.f66427M1;
        if (layoutInflater4 != null) {
            view2 = layoutInflater4.inflate(AbstractC7409c0.layout_pick_location_header_multistate, (ViewGroup) this.f66430P0, false);
        } else {
            view2 = null;
        }
        if (view2 != null) {
            ListView listView6 = this.f66430P0;
            if (listView6 != null) {
                listView6.addHeaderView(view2);
            }
            MultiStateView multiStateView = (MultiStateView) view2.findViewById(AbstractC6918a0.multi_state);
            this.f66435R1 = multiStateView;
            if (multiStateView != null) {
                multiStateView.setEnableLoadingText(true);
                multiStateView.setEnableImageErrorView(true);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(32.0f), AbstractC23136l9.m118742r(32.0f));
                layoutParams3.addRule(14);
                layoutParams3.setMargins(0, AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f));
                multiStateView.setLayoutParamsPbLoading(layoutParams3);
                multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: k90.l
                    @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                    /* renamed from: a */
                    public final void mo12138a() {
                        LocationPickerView.m71971HN(LocationPickerView.this);
                    }
                });
                multiStateView.setEmptyLayoutResourceId(AbstractC7409c0.layout_empty_location);
                multiStateView.setErrorLayoutResourceId(AbstractC7409c0.layout_error_location);
            }
        }
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        C21615j c21615j = new C21615j(m92692wK);
        this.f66456e1 = c21615j;
        final ListView listView7 = this.f66430P0;
        if (listView7 != null) {
            listView7.setAdapter((ListAdapter) c21615j);
            listView7.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: k90.m
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view11, int i11, long j11) {
                    LocationPickerView.m71973IN(LocationPickerView.this, listView7, adapterView, view11, i11, j11);
                }
            });
            listView7.setOnScrollListener(new C12777h());
        }
        View view11 = this.f66417C1;
        if (view11 == null) {
            AbstractC19074t.m100223u("mRootView");
            view11 = null;
        }
        View findViewById2 = view11.findViewById(AbstractC6918a0.view_offset);
        this.f66422H1 = findViewById2;
        if (findViewById2 != null) {
            layoutParams = findViewById2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.height = this.f66423I1;
        }
        View view12 = this.f66417C1;
        if (view12 == null) {
            AbstractC19074t.m100223u("mRootView");
            view12 = null;
        }
        this.f66424J1 = view12.findViewById(AbstractC6918a0.layout_selected_location);
        View view13 = this.f66417C1;
        if (view13 == null) {
            AbstractC19074t.m100223u("mRootView");
            view13 = null;
        }
        this.f66425K1 = (RobotoTextView) view13.findViewById(AbstractC6918a0.tv_selected_location);
        View view14 = this.f66417C1;
        if (view14 == null) {
            AbstractC19074t.m100223u("mRootView");
        } else {
            view6 = view14;
        }
        ImageButton imageButton = (ImageButton) view6.findViewById(AbstractC6918a0.btn_remove_selected_location);
        this.f66426L1 = imageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public static final void m71971HN(LocationPickerView locationPickerView) {
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        locationPickerView.m71989UM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public static final void m71973IN(LocationPickerView locationPickerView, ListView listView, AdapterView adapterView, View view, int i11, long j11) {
        C18460c c18460c;
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        AbstractC19074t.m100208f(listView, "$this_apply");
        C21615j c21615j = locationPickerView.f66456e1;
        if (c21615j != null) {
            c18460c = c21615j.getItem(i11 - listView.getHeaderViewsCount());
        } else {
            c18460c = null;
        }
        locationPickerView.m72015oN(c18460c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public final void m71975JN() {
        m71977KN(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public final void m71977KN(int i11) {
        if (m92672lJ() && !m92679oJ()) {
            removeDialog(i11);
            showDialog(i11);
        }
    }

    /* renamed from: LN */
    private final void m71979LN(int i11) {
        m71965EN(8);
        m72035yN(i11);
    }

    /* renamed from: NN */
    private final void m71982NN() {
        int i11;
        Button button = this.f66449Y1;
        if (button != null) {
            boolean z11 = false;
            if (this.f66432Q0 && this.f66475x1 != null) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            button.setVisibility(i11);
            if (this.f66475x1 != null) {
                z11 = true;
            }
            button.setEnabled(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public final void m71984ON(String str, String str2, String str3, String str4, double d11, double d12, boolean z11) {
        String str5;
        C18460c c18460c = this.f66472u1;
        if (c18460c != null) {
            str5 = c18460c.f93022c;
        } else {
            str5 = null;
        }
        if (TextUtils.isEmpty(str5) || (z11 && str3.length() > 0)) {
            this.f66472u1 = new C18460c(str, str2, str3, d11, d12);
            TextView textView = this.f66436S0;
            if (textView != null) {
                if (str4.length() > 0) {
                    textView.setText(str4);
                    textView.setVisibility(0);
                } else {
                    textView.setText("");
                    textView.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: RM */
    private final void m71987RM() {
        ArrayList arrayList;
        try {
            C8969o m47910L = C8967m.m47867E().m47910L(this.f66433Q1);
            if (m47910L != null) {
                arrayList = new ArrayList();
                arrayList.add(m47910L);
            } else {
                arrayList = null;
            }
            LiveLocationBar liveLocationBar = this.f66431P1;
            if (liveLocationBar != null) {
                liveLocationBar.m48002a(arrayList, this.f66433Q1);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: SM */
    private final void m71988SM(View view, int i11) {
        ListView listView;
        ListView listView2;
        if (view == null) {
            return;
        }
        if (view.getVisibility() == 8 && i11 == 0 && (listView2 = this.f66430P0) != null) {
            listView2.addFooterView(view);
        }
        if (view.getVisibility() == 0 && i11 == 8 && (listView = this.f66430P0) != null) {
            listView.removeFooterView(view);
        }
    }

    /* renamed from: UM */
    private final void m71989UM() {
        if (!m72007kN()) {
            m72025tN();
        }
        C28157p5.m141667d().m141676k("CHECK---PERMISSION---AND---LOAD---LOCATION");
        C21615j c21615j = this.f66456e1;
        boolean z11 = false;
        if (c21615j != null && c21615j.getCount() == 0) {
            z11 = true;
        }
        m72013nN(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m71990VM(int i11, LocationPickerView locationPickerView) {
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        if (i11 == 83) {
            locationPickerView.m71987RM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: WM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m71991WM(boolean z11, C20096c c20096c) {
        boolean z12;
        int i11;
        int i12;
        int i13 = 8;
        try {
            m71967FN(8);
            if (!this.f66454c1.isEmpty()) {
                MultiStateView multiStateView = this.f66435R1;
                if (multiStateView != null) {
                    multiStateView.setVisibility(8);
                }
                m72027uN();
            } else if (z11) {
                m72031wN(MultiStateView.EnumC15915f.UNKNOWN_ERROR, AbstractC8020f0.str_location_request_permistion);
            } else if (c20096c == null) {
                m72029vN();
            } else if (c20096c.m104491c() == 50001) {
                m72031wN(MultiStateView.EnumC15915f.NETWORK_ERROR, AbstractC8020f0.location_no_network);
            } else if (m72009lN(c20096c)) {
                m72031wN(MultiStateView.EnumC15915f.UNKNOWN_ERROR, AbstractC8020f0.str_sensitive_location_block_title);
            } else {
                m72031wN(MultiStateView.EnumC15915f.UNKNOWN_ERROR, AbstractC8020f0.location_unknown_error);
            }
            if (((!this.f66454c1.isEmpty()) || (!z11 && (c20096c == null || c20096c.m104491c() != 50001))) && !m72009lN(c20096c)) {
                z12 = true;
                if (!z12) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                m72033xN(i11);
                if (!z12) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                m71963DN(i12);
                if (!(!this.f66454c1.isEmpty()) || (!z11 && c20096c == null)) {
                    i13 = 0;
                }
                m71965EN(i13);
            }
            z12 = false;
            if (!z12) {
            }
            m72033xN(i11);
            if (!z12) {
            }
            m71963DN(i12);
            if (!(!this.f66454c1.isEmpty())) {
            }
            i13 = 0;
            m71965EN(i13);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: XM */
    static /* synthetic */ void m71992XM(LocationPickerView locationPickerView, boolean z11, C20096c c20096c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c20096c = null;
        }
        locationPickerView.m71991WM(z11, c20096c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public final synchronized void m71993YM(boolean z11) {
        int m104529e;
        String str;
        String str2;
        try {
            if (this.f66477z1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doCheckin: showLoading=");
            sb2.append(z11);
            this.f66477z1 = true;
            if (z11) {
                m71979LN(AbstractC8020f0.location_loading_place);
            }
            m71997cN(C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m());
            if (this.f66472u1 == null) {
                double m141640m = C28139n5.m141620j().m141640m();
                double m141645r = C28139n5.m141620j().m141645r();
                m104529e = AbstractC20104d.m104529e(C28139n5.m141620j().m141634f());
                if (!this.f66432Q0) {
                    str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_location_current_location_desc_new, Integer.valueOf(m104529e));
                    AbstractC19074t.m100207e(str, "getString(...)");
                    str2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_location_current_location_desc, Double.valueOf(m141640m), Double.valueOf(m141645r));
                    AbstractC19074t.m100207e(str2, "getString(...)");
                } else {
                    str = "";
                    str2 = "";
                }
                m71984ON("vitrihientai", "", str2, str, m141645r, m141640m, false);
            }
            View view = this.f66459h1;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: k90.p
                @Override // java.lang.Runnable
                public final void run() {
                    LocationPickerView.m71994ZM(LocationPickerView.this);
                }
            });
            C28139n5.m141620j().m141651z();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m71994ZM(final LocationPickerView locationPickerView) {
        int m104529e;
        final String str;
        final String str2;
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        try {
            if (C28139n5.m141620j().m141642o() == 4) {
                AbstractC19444a.m101697e(new Runnable() { // from class: k90.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationPickerView.m71995aN(LocationPickerView.this);
                    }
                });
            }
            String m151997b = AbstractC31195a.m151997b(locationPickerView.m92648SI(), C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m());
            AbstractC19074t.m100207e(m151997b, "getAddressFromLocation(...)");
            if (locationPickerView.m92674mJ() && !locationPickerView.m92677nJ()) {
                final double m141640m = C28139n5.m141620j().m141640m();
                final double m141645r = C28139n5.m141620j().m141645r();
                m104529e = AbstractC20104d.m104529e(C28139n5.m141620j().m141634f());
                if (!locationPickerView.f66432Q0) {
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_location_current_location_desc_new, Integer.valueOf(m104529e));
                    AbstractC19074t.m100207e(m118746s0, "getString(...)");
                    if (m151997b.length() == 0) {
                        m151997b = AbstractC23136l9.m118746s0(AbstractC8020f0.str_location_current_location_desc, Double.valueOf(m141640m), Double.valueOf(m141645r));
                        AbstractC19074t.m100207e(m151997b, "getString(...)");
                    }
                    str = m151997b;
                    str2 = m118746s0;
                } else {
                    if (m151997b.length() == 0) {
                        m151997b = AbstractC23136l9.m118746s0(AbstractC8020f0.str_location_current_location_desc, Double.valueOf(m141640m), Double.valueOf(m141645r));
                        AbstractC19074t.m100207e(m151997b, "getString(...)");
                    }
                    str = m151997b;
                    str2 = str;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get address done: ");
                sb2.append(str);
                AbstractC19444a.m101697e(new Runnable() { // from class: k90.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationPickerView.m71996bN(LocationPickerView.this, str, str2, m141645r, m141640m);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m71995aN(LocationPickerView locationPickerView) {
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        locationPickerView.m71977KN(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m71996bN(LocationPickerView locationPickerView, String str, String str2, double d11, double d12) {
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        AbstractC19074t.m100208f(str, "$addressText");
        AbstractC19074t.m100208f(str2, "$addressTextShow");
        locationPickerView.m71984ON("vitrihientai", "", str, str2, d11, d12, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public final void m71997cN(double d11, double d12) {
        if (this.f66415A1) {
            return;
        }
        this.f66415A1 = true;
        m71967FN(0);
        m71965EN(8);
        m72004iN().mo1704o8(new C12772c());
        m72004iN().mo1471K9(d11, d12, this.f66444W0, 20, this.f66446X0);
    }

    /* renamed from: dN */
    public static final C3063z0 m71998dN(Intent intent) {
        return Companion.m72045a(intent);
    }

    /* renamed from: gN */
    private final int m72000gN(AbsListView absListView) {
        if (absListView.getChildCount() == 0) {
            return -1;
        }
        int childCount = absListView.getChildCount() - 1;
        absListView.getLocationInWindow(this.f66445W1);
        int i11 = this.f66445W1[1];
        absListView.getRootView().getLocationInWindow(this.f66445W1);
        int i12 = i11 - this.f66445W1[1];
        int height = absListView.getRootView().getHeight();
        while (childCount > 0) {
            View childAt = absListView.getChildAt(childCount);
            if (childAt == null) {
                return -1;
            }
            if (i12 + childAt.getY() + childAt.getHeight() < height) {
                break;
            }
            childCount--;
        }
        return absListView.getPositionForView(absListView.getChildAt(childCount));
    }

    /* renamed from: hN */
    private final InterfaceC0765j m72002hN() {
        return (InterfaceC0765j) this.f66420F1.getValue();
    }

    /* renamed from: iN */
    private final InterfaceC0765j m72004iN() {
        return (InterfaceC0765j) this.f66419E1.getValue();
    }

    /* renamed from: kN */
    private final boolean m72007kN() {
        Context context = getContext();
        if (context == null || AbstractC23034c6.m118167n(context, AbstractC23034c6.f112034k) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: lN */
    private final boolean m72009lN(C20096c c20096c) {
        if (c20096c != null && c20096c.m104491c() == -3 && AbstractC19074t.m100204b(c20096c.m104492d(), m92652XI(AbstractC8020f0.str_sensitive_location_block_title))) {
            return true;
        }
        return false;
    }

    /* renamed from: mN */
    private final boolean m72011mN() {
        return false;
    }

    /* renamed from: nN */
    private final void m72013nN(boolean z11) {
        if (this.f66416B1) {
            return;
        }
        C28157p5.m141667d().m141676k("ENTER---LOAD---LOCATION");
        this.f66416B1 = true;
        if (z11) {
            m71979LN(AbstractC8020f0.location_loading_location);
        }
        C12773d c12773d = new C12773d(z11);
        String str = null;
        if (m72007kN()) {
            C28239y6 c28239y6 = new C28239y6();
            c28239y6.m142229k(false);
            if (!c28239y6.m142225f(m92648SI(), c12773d, this.f66418D1)) {
                this.f66416B1 = false;
                SensitiveData sensitiveData = this.f66418D1;
                if (sensitiveData != null) {
                    str = sensitiveData.m35528c();
                }
                if (!C8937j0.m47663l(str)) {
                    m71977KN(5);
                    m71991WM(false, new C20096c(-3, m92652XI(AbstractC8020f0.str_sensitive_location_block_title)));
                    return;
                } else {
                    m71977KN(1);
                    return;
                }
            }
            return;
        }
        m71992XM(this, true, null, 2, null);
        this.f66416B1 = false;
    }

    /* renamed from: oN */
    private final void m72015oN(C18460c c18460c) {
        String str;
        String str2;
        if (c18460c == null) {
            return;
        }
        if (m72011mN()) {
            this.f66475x1 = c18460c;
            if (this.f66438T0) {
                View view = this.f66424J1;
                if (view != null) {
                    view.setVisibility(0);
                }
                if (!TextUtils.isEmpty(c18460c.f93021b)) {
                    str2 = c18460c.f93021b;
                } else {
                    str2 = c18460c.f93022c;
                }
                RobotoTextView robotoTextView = this.f66425K1;
                if (robotoTextView != null) {
                    robotoTextView.setText(str2);
                }
                m71982NN();
                C21615j c21615j = this.f66456e1;
                if (c21615j != null) {
                    c21615j.m111551e(this.f66475x1);
                }
                C21615j c21615j2 = this.f66456e1;
                if (c21615j2 != null) {
                    c21615j2.notifyDataSetChanged();
                    return;
                }
                return;
            }
            m71961CN();
            return;
        }
        if (AbstractC19074t.m100204b(c18460c.f93020a, "vitrihientai")) {
            str = "0";
        } else {
            str = c18460c.f93020a;
        }
        String str3 = str;
        InterfaceC12771b interfaceC12771b = this.f66421G1;
        if (interfaceC12771b != null) {
            interfaceC12771b.mo60384a(c18460c, this.f66476y1, str3, this.f66437S1, this.f66439T1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m72017pN(LocationPickerView locationPickerView) {
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        if (!locationPickerView.m72007kN()) {
            locationPickerView.m72025tN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m72019qN(LocationPickerView locationPickerView, int i11) {
        AbstractC19074t.m100208f(locationPickerView, "this$0");
        if (i11 != -7) {
            if (i11 != 0) {
                if (i11 != -4) {
                    if (i11 == -3) {
                        locationPickerView.m71977KN(1);
                        return;
                    }
                    return;
                }
                locationPickerView.m71977KN(3);
                return;
            }
            ActionLogChatLocation actionLogChatLocation = ActionLogChatLocation.f55164a;
            actionLogChatLocation.m56651e(actionLogChatLocation.m56652h(locationPickerView.f66433Q1), locationPickerView.f66437S1, true, locationPickerView.f66439T1);
            return;
        }
        locationPickerView.m71977KN(5);
    }

    /* renamed from: rN */
    private final void m72021rN() {
        m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* renamed from: sN */
    private final void m72023sN() {
        C18460c c18460c = this.f66472u1;
        if (c18460c != null) {
            double d11 = c18460c.f93025f;
            if (c18460c != null) {
                m72002hN().mo1450I4(d11, c18460c.f93026g);
            }
        }
    }

    /* renamed from: tN */
    private final void m72025tN() {
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112034k, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
    }

    /* renamed from: uN */
    private final void m72027uN() {
        C18460c c18460c = this.f66475x1;
        if (c18460c != null) {
            View view = this.f66424J1;
            if (view != null) {
                view.setVisibility(0);
            }
            RobotoTextView robotoTextView = this.f66425K1;
            if (robotoTextView != null) {
                String str = c18460c.f93021b;
                if (str.length() == 0) {
                    str = c18460c.f93022c;
                }
                robotoTextView.setText(str);
            }
        }
    }

    /* renamed from: vN */
    private final void m72029vN() {
        MultiStateView multiStateView = this.f66435R1;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: wN */
    private final void m72031wN(MultiStateView.EnumC15915f enumC15915f, int i11) {
        MultiStateView multiStateView = this.f66435R1;
        if (multiStateView != null) {
            boolean z11 = false;
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
            multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
            if (enumC15915f == MultiStateView.EnumC15915f.NETWORK_ERROR) {
                z11 = true;
            }
            multiStateView.setEnableImageErrorView(z11);
            multiStateView.setErrorType(enumC15915f);
        }
    }

    /* renamed from: xN */
    private final void m72033xN(int i11) {
        View view = this.f66429O1;
        if (view != null) {
            view.setVisibility(i11);
        }
        LiveLocationBar liveLocationBar = this.f66431P1;
        if (liveLocationBar != null) {
            liveLocationBar.setVisibility(i11);
        }
    }

    /* renamed from: yN */
    private final void m72035yN(int i11) {
        MultiStateView multiStateView = this.f66435R1;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            if (i11 != 0) {
                multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
                multiStateView.setVisibilityLoadingText(0);
            } else {
                multiStateView.setVisibilityLoadingText(8);
            }
        }
    }

    /* renamed from: AN */
    public final void m72037AN(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "locationId");
        if (AbstractC19074t.m100204b(str, "vitrihientai")) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f66441U1 = i11;
        this.f66443V1 = str;
    }

    /* renamed from: BN */
    public final void m72038BN() {
        this.f66441U1 = 1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        super.mo37111CJ(bundle);
        this.f66428N1 = new C23528a(getContext());
        m92637BK(true);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_receiver_dpn")) {
                String string = m92642L3.getString("extra_receiver_dpn", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f66440U0 = string;
            }
            if (m92642L3.containsKey("extra_from_update_status")) {
                this.f66432Q0 = m92642L3.getBoolean("extra_from_update_status");
            }
            if (m92642L3.containsKey("height_view_offset")) {
                this.f66423I1 = m92642L3.getInt("height_view_offset");
            }
            if (m92642L3.containsKey("has_location")) {
                boolean z12 = m92642L3.getBoolean("has_location");
                this.f66438T0 = z12;
                if (z12) {
                    double d11 = m92642L3.getDouble("extra_selected_long", -1.0d);
                    double d12 = m92642L3.getDouble("extra_selected_lat", -1.0d);
                    String string2 = m92642L3.getString("extra_selected_name", "");
                    String string3 = m92642L3.getString("extra_selected_id", "");
                    AbstractC19074t.m100205c(string2);
                    if (string2.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (d11 != -1.0d && d12 != -1.0d && z11) {
                        AbstractC19074t.m100205c(string3);
                        this.f66475x1 = new C18460c(string3, string2, "", d11, d12);
                    }
                    m71982NN();
                }
            }
            if (m92642L3.containsKey("EXTRA_STR_CHAT_CONVERSATION_ID")) {
                String string4 = m92642L3.getString("EXTRA_STR_CHAT_CONVERSATION_ID", "");
                AbstractC19074t.m100207e(string4, "getString(...)");
                this.f66433Q1 = string4;
            }
            if (m92642L3.containsKey("EXTRA_SENSITIVE_DATA")) {
                this.f66418D1 = (SensitiveData) m92642L3.getParcelable("EXTRA_SENSITIVE_DATA");
            }
            this.f66437S1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
            this.f66439T1 = (ActionLogChatLocation.FooterLogData) m92642L3.getParcelable("EXTRA_FOOTER_LOG_DATA");
        }
        this.f66444W0 = 1;
        this.f66447X1 = -1;
        this.f66441U1 = 0;
        this.f66443V1 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = null;
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            Context m92689tK = m92689tK();
                            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                            keyEventCallbackC17462c = C23046d7.m118240c(m92689tK);
                        }
                        return keyEventCallbackC17462c;
                    }
                    keyEventCallbackC17462c = AbstractC8971q.m47970b(this, this.f66433Q1, new C8967m.h() { // from class: k90.n
                        @Override // com.zing.zalo.location.C8967m.h
                        /* renamed from: a */
                        public final void mo47962a(int i12) {
                            LocationPickerView.m72019qN(LocationPickerView.this, i12);
                        }
                    });
                } else if (AbstractC23309i.m121488Ub()) {
                    keyEventCallbackC17462c = AbstractC23093i.m118457j(m92648SI(), this);
                }
            } else {
                long m141644q = C28139n5.m141620j().m141644q();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy", Locale.getDefault());
                Date date = new Date(m141644q);
                String str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_last_location_warning) + " " + simpleDateFormat.format(date);
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43162k(str).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                keyEventCallbackC17462c = aVar.m43152a();
            }
        } else {
            C8009j.a aVar2 = new C8009j.a(m92648SI());
            aVar2.m43171t(AbstractC8020f0.location_open_gps_dialog_title).m43159h(4);
            aVar2.m43161j(AbstractC8020f0.GPS_Enable_Message);
            aVar2.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this);
            aVar2.m43169r(AbstractC8020f0.str_yes, this);
            keyEventCallbackC17462c = aVar2.m43152a();
        }
        return keyEventCallbackC17462c;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        Button button;
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        actionBarMenu.m92750r();
        View m92744k = actionBarMenu.m92744k(AbstractC6918a0.menu_next, AbstractC7409c0.action_bar_menu_item_white_text_only);
        if (m92744k instanceof Button) {
            button = (Button) m92744k;
        } else {
            button = null;
        }
        this.f66449Y1 = button;
        if (button != null) {
            button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_next));
        }
        m71982NN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f66427M1 = layoutInflater;
        View inflate = layoutInflater.inflate(AbstractC7409c0.location_pick, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        this.f66417C1 = inflate;
        m71969GN();
        View view = this.f66417C1;
        if (view == null) {
            AbstractC19074t.m100223u("mRootView");
            return null;
        }
        return view;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        boolean z11;
        super.mo39024IJ();
        try {
            ActionLogChatLocation actionLogChatLocation = ActionLogChatLocation.f55164a;
            String m56652h = actionLogChatLocation.m56652h(this.f66433Q1);
            int i11 = this.f66441U1;
            ArrayList arrayList = this.f66454c1;
            int i12 = this.f66447X1;
            String str = this.f66443V1;
            C18460c c18460c = this.f66472u1;
            View view = this.f66459h1;
            if (view != null && view.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            actionLogChatLocation.m56647a(m56652h, i11, arrayList, i12, str, c18460c, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f != 3) {
                if (mo92862f == 5 && i11 == -1) {
                    interfaceC17463d.dismiss();
                    return;
                }
                return;
            }
            m72021rN();
            interfaceC17463d.dismiss();
            return;
        }
        if (i11 != -2) {
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                m72021rN();
                AbstractC23647d.m123906p("917801");
                AbstractC23647d.m123893c();
                return;
            }
            return;
        }
        interfaceC17463d.dismiss();
        AbstractC23647d.m123906p("917800");
        AbstractC23647d.m123893c();
    }

    /* renamed from: MN */
    public final void m72039MN() {
        ListView listView;
        if (!m92685rJ() || (listView = this.f66430P0) == null) {
            return;
        }
        int lastVisiblePosition = listView.getLastVisiblePosition();
        int headerViewsCount = listView.getHeaderViewsCount();
        if (lastVisiblePosition > this.f66447X1 && lastVisiblePosition >= headerViewsCount) {
            try {
                this.f66447X1 = Math.max(this.f66447X1, m72000gN(listView) - headerViewsCount);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("917810");
            mo50035CK(0, null);
            finish();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_next) {
            m71961CN();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        C18460c c18460c = this.f66475x1;
        if (c18460c != null) {
            bundle.putBoolean("bol_has_selected_location", true);
            bundle.putDouble("extra_selected_long", c18460c.f93025f);
            bundle.putDouble("extra_selected_lat", c18460c.f93026g);
            bundle.putString("extra_selected_name", c18460c.f93021b);
            bundle.putString("extra_selected_address", c18460c.f93022c);
        }
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", this.f66418D1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        int i11;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (m72011mN()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBar.setVisibility(i11);
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            actionBar.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_landing_page_edit_more_location));
        }
    }

    /* renamed from: TM */
    public final void m72040TM() {
        C28157p5.m141667d().m141676k("ENTER---checkLocationNeedToUpdate---");
        if (this.f66473v1 != null) {
            if (System.currentTimeMillis() - this.f66474w1 < 300000) {
                C28157p5.m141667d().m141676k("PICK---VIEW---HAS---LOCATION---CACHED---NOT---EXPIRE");
                if (C28157p5.m141668f(C28157p5.m141667d().m141673c(), this.f66473v1)) {
                    m71989UM();
                    return;
                }
                return;
            }
            C28157p5.m141667d().m141676k("PICK---VIEW---HAS---LOCATION---CACHED---EXPIRED");
            m71989UM();
            return;
        }
        C28157p5.m141667d().m141676k("PICK---VIEW---NO---LOCATION---CACHED---");
        if (!m72007kN()) {
            m72025tN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.Companion.m124119a().m124115b(this, 83);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f66477z1 = false;
        this.f66415A1 = false;
        C23744a.Companion.m124119a().m124117e(this, 83);
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this);
    }

    /* renamed from: eN */
    public final ListView m72041eN() {
        return this.f66430P0;
    }

    /* renamed from: fN */
    public final int m72042fN() {
        ViewGroup.LayoutParams layoutParams;
        ListView listView = this.f66430P0;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (listView != null) {
            layoutParams = listView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        int i11 = 0;
        if (marginLayoutParams == null) {
            return 0;
        }
        if (this.f66429O1 != null) {
            i11 = AbstractC23136l9.m118742r(60.0f);
        }
        return marginLayoutParams.topMargin + i11 + AbstractC23136l9.m118742r(150.0f);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LocationPickerView";
    }

    /* renamed from: jN */
    public final View m72043jN() {
        return this.f66422H1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.current_location_info) {
            m72015oN(this.f66472u1);
            return;
        }
        if (id2 == AbstractC6918a0.btn_remove_selected_location) {
            this.f66475x1 = null;
            View view2 = this.f66424J1;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            InterfaceC12771b interfaceC12771b = this.f66421G1;
            if (interfaceC12771b != null) {
                interfaceC12771b.mo60385h();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_dismiss) {
            ViewGroup viewGroup = this.f66467p1;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_report) {
            if (C23055e5.m118272g(false)) {
                m72023sN();
                RobotoTextView robotoTextView = this.f66469r1;
                if (robotoTextView != null) {
                    robotoTextView.setText(AbstractC8020f0.location_report_desc_1_after);
                }
                RobotoTextView robotoTextView2 = this.f66470s1;
                if (robotoTextView2 != null) {
                    robotoTextView2.setVisibility(8);
                }
                View view3 = this.f66471t1;
                if (view3 != null) {
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            ToastUtils.m89262j();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 120 && m72007kN()) {
            m71975JN();
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (!this.f66477z1 && !this.f66415A1) {
            C21615j c21615j = this.f66456e1;
            if (c21615j != null && c21615j.getCount() == 0) {
                C28157p5.m141667d().m141676k("ONRESUME---LOAD---LOCATION");
                m72013nN(true);
            } else {
                this.f66442V0 = true;
                m72040TM();
            }
        }
        m71987RM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        AbstractC19444a.m101695c(new Runnable() { // from class: k90.o
            @Override // java.lang.Runnable
            public final void run() {
                LocationPickerView.m71990VM(i11, this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:            if (r7.length() > 0) goto L11;     */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37135xJ(Bundle bundle) {
        SensitiveData sensitiveData;
        Object parcelable;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            boolean z11 = false;
            if (bundle.getBoolean("bol_has_selected_location", false)) {
                double d11 = bundle.getDouble("extra_selected_long", -1.0d);
                double d12 = bundle.getDouble("extra_selected_lat", -1.0d);
                String string = bundle.getString("extra_selected_name", "");
                String string2 = bundle.getString("extra_selected_address", "");
                AbstractC19074t.m100205c(string);
                if (string.length() <= 0) {
                    AbstractC19074t.m100205c(string2);
                }
                z11 = true;
                if (d11 != -1.0d && d12 != -1.0d && z11) {
                    AbstractC19074t.m100205c(string2);
                    this.f66475x1 = new C18460c("", string, string2, d11, d12);
                }
            }
            if (bundle.containsKey("EXTRA_SENSITIVE_DATA")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = bundle.getParcelable("EXTRA_SENSITIVE_DATA", SensitiveData.class);
                    sensitiveData = (SensitiveData) parcelable;
                } else {
                    sensitiveData = (SensitiveData) bundle.getParcelable("EXTRA_SENSITIVE_DATA");
                }
                this.f66418D1 = sensitiveData;
            }
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: k90.k
            @Override // java.lang.Runnable
            public final void run() {
                LocationPickerView.m72017pN(LocationPickerView.this);
            }
        }, 500L);
    }

    /* renamed from: zN */
    public final void m72044zN(InterfaceC12771b interfaceC12771b) {
        this.f66421G1 = interfaceC12771b;
    }
}
