package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.AbstractC0924m0;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import au.AbstractC2373t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.C13701o3;
import com.zing.zalo.p077ui.zviews.ZinstantZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a;
import com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewImpl;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import ik0.C20599v;
import java.lang.ref.WeakReference;
import lk0.InterfaceC22508f;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23212s8;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import pj0.AbstractC24788n;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24785k;
import pj0.InterfaceC24787m;
import su.AbstractC26389c;
import vg.AbstractC28207v1;
import vg.AbstractC28248z6;
import vg.C28239y6;
import zl0.AbstractC32226c;
import zl0.AbstractC32229f;

/* loaded from: classes6.dex */
public class ZinstantZaloView extends SlidableZaloView implements InterfaceC0733x, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Q0 */
    protected View f79720Q0;

    /* renamed from: R0 */
    protected MultiStateView f79721R0;

    /* renamed from: S0 */
    protected ZaloZinstantLayout f79722S0;

    /* renamed from: T0 */
    private InterfaceC22508f f79723T0;

    /* renamed from: U0 */
    private ZinstantScrollViewImpl f79724U0;

    /* renamed from: e1 */
    private String f79734e1;

    /* renamed from: f1 */
    private String f79735f1;

    /* renamed from: g1 */
    private String f79736g1;

    /* renamed from: P0 */
    private final InterfaceC24775a f79719P0 = new C15412a();

    /* renamed from: V0 */
    private String f79725V0 = null;

    /* renamed from: W0 */
    private String f79726W0 = null;

    /* renamed from: X0 */
    private C8009j f79727X0 = null;

    /* renamed from: Y0 */
    private AbstractC28207v1.j0 f79728Y0 = null;

    /* renamed from: Z0 */
    private C13701o3 f79729Z0 = null;

    /* renamed from: a1 */
    private int f79730a1 = 0;

    /* renamed from: b1 */
    private final AbstractC23803b f79731b1 = new C15413b();

    /* renamed from: c1 */
    private final InterfaceC24787m f79732c1 = new C15414c();

    /* renamed from: d1 */
    protected int f79733d1 = 0;

    /* renamed from: h1 */
    private int f79737h1 = 7;

    /* renamed from: i1 */
    private int f79738i1 = 1;

    /* renamed from: j1 */
    protected int f79739j1 = 1;

    /* renamed from: k1 */
    private boolean f79740k1 = false;

    /* renamed from: l1 */
    private boolean f79741l1 = false;

    /* renamed from: m1 */
    private int f79742m1 = 0;

    /* renamed from: n1 */
    private boolean f79743n1 = false;

    /* renamed from: o1 */
    private boolean f79744o1 = false;

    /* renamed from: p1 */
    private int f79745p1 = 0;

    /* renamed from: q1 */
    private final C23744a.c f79746q1 = new C23744a.c() { // from class: com.zing.zalo.ui.zviews.k81
        public /* synthetic */ k81() {
        }

        @Override // p363nh.C23744a.c
        /* renamed from: x */
        public final void mo17795x(int i11, Object[] objArr) {
            ZinstantZaloView.this.m87222eM(i11, objArr);
        }
    };

    /* renamed from: r1 */
    public C17170o f79747r1 = new C15415d();

    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$a */
    /* loaded from: classes6.dex */
    public class C15412a implements InterfaceC24775a {
        C15412a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m87249d(Exception exc) {
            ZinstantZaloView.this.m87240xM(exc);
        }

        /* renamed from: e */
        public /* synthetic */ void m87250e() {
            ZinstantZaloView.this.m87241yM();
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            if (AbstractC19444a.m101693a()) {
                ZinstantZaloView.this.m87240xM(exc);
            } else {
                ZinstantZaloView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.o81

                    /* renamed from: q */
                    public final /* synthetic */ Exception f81447q;

                    public /* synthetic */ o81(Exception exc2) {
                        r2 = exc2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantZaloView.C15412a.this.m87249d(r2);
                    }
                });
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: f */
        public void onSuccess(Void r22) {
            if (AbstractC19444a.m101693a()) {
                ZinstantZaloView.this.m87241yM();
            } else {
                ZinstantZaloView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.p81
                    public /* synthetic */ p81() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantZaloView.C15412a.this.m87250e();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$b */
    /* loaded from: classes6.dex */
    public class C15413b extends AbstractC23803b {
        C15413b() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            try {
                ZinstantZaloView.this.m87244XM(str3, str4, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$c */
    /* loaded from: classes6.dex */
    public class C15414c extends AbstractC24788n {
        C15414c() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: W2 */
        public boolean mo87252W2() {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.r81
                public /* synthetic */ r81() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantZaloView.this.mo46829Y();
                }
            });
            return true;
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            try {
                ZinstantZaloView.this.m87244XM(str, str2, interfaceC24785k);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: b */
        public boolean mo87253b() {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.q81
                public /* synthetic */ q81() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantZaloView.this.mo49315c4();
                }
            });
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$d */
    /* loaded from: classes6.dex */
    public class C15415d extends C17170o {
        C15415d() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            MultiStateView multiStateView = ZinstantZaloView.this.f79721R0;
            if (multiStateView != null) {
                return multiStateView.getWidth();
            }
            return super.mo35797c();
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return ZinstantZaloView.this.f79721R0.getHeight() + ";" + ZinstantZaloView.this.f79721R0.getWidth();
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: m */
        public int mo72953m() {
            ZinstantZaloView zinstantZaloView = ZinstantZaloView.this;
            int i11 = zinstantZaloView.f79733d1;
            if (i11 != 1 && i11 != 2) {
                MultiStateView multiStateView = zinstantZaloView.f79721R0;
                if (multiStateView != null) {
                    return multiStateView.getHeight();
                }
                return super.mo72953m();
            }
            return -1;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$e */
    /* loaded from: classes6.dex */
    public class C15416e implements InterfaceC20094a {
        C15416e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", c20096c.m104491c());
                ZinstantZaloView.this.m87243VM("action.zinstant.get.zotp", jSONObject.toString());
            } catch (Exception unused) {
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    String m135986b = AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), ((JSONObject) obj).optJSONObject("data").optString("activeCode", ""));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_code", 0);
                    jSONObject.put("zotp", m135986b);
                    ZinstantZaloView.this.m87243VM("action.zinstant.get.zotp", jSONObject.toString());
                } catch (Exception unused) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error_code", -1);
                    ZinstantZaloView.this.m87243VM("action.zinstant.get.zotp", jSONObject2.toString());
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$f */
    /* loaded from: classes6.dex */
    public class C15417f extends AbstractC28248z6.f {
        C15417f() {
        }

        /* renamed from: c */
        public /* synthetic */ void m87255c(Location location) {
            if (location != null) {
                ZinstantZaloView.this.m87216UM(location);
            } else {
                ZinstantZaloView.this.m87214SM();
            }
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.s81

                /* renamed from: q */
                public final /* synthetic */ Location f81910q;

                public /* synthetic */ s81(Location location2) {
                    r2 = location2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantZaloView.C15417f.this.m87255c(r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZinstantZaloView$g */
    /* loaded from: classes6.dex */
    public static class C15418g extends AbstractC28207v1.g0 {

        /* renamed from: a */
        private final WeakReference f79754a;

        /* renamed from: b */
        private final String f79755b;

        /* renamed from: c */
        private final String f79756c;

        /* renamed from: d */
        private final int f79757d;

        public C15418g(BaseZaloView baseZaloView, String str, String str2, int i11) {
            this.f79754a = new WeakReference(baseZaloView);
            this.f79755b = str;
            this.f79756c = str2;
            this.f79757d = i11;
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: h */
        public void mo40743h() {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78964sL();
            }
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: j */
        public void mo40745j(String str) {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78968wL(str);
            }
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: m */
        public void mo40748m(String str) {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78962rL(str, false);
            }
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: o */
        public void mo40750o() {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78971xL(this.f79756c);
            }
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: q */
        public void mo40752q(String str) {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78961qL(str);
            }
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: r */
        public void mo40753r(String str, String str2, String str3) {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78965tL(str2, str, this.f79757d, this.f79755b, this.f79756c, str3);
            }
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: s */
        public void mo40754s(String str) {
            BaseZaloView baseZaloView = (BaseZaloView) this.f79754a.get();
            if (baseZaloView != null) {
                baseZaloView.m78962rL(str, true);
                baseZaloView.mo78939UL(this.f79755b);
            }
        }
    }

    /* renamed from: AM */
    private boolean m87198AM(Bundle bundle) {
        boolean z11;
        try {
            m87239wM(bundle);
            this.f79733d1 = bundle.getInt("ZinstantZaloView_typeView", 0);
            if (bundle.containsKey("ZinstantZaloView_featureType")) {
                this.f79737h1 = bundle.getInt("ZinstantZaloView_featureType");
            }
            if (bundle.containsKey("ZinstantZaloView_Identification")) {
                this.f79725V0 = bundle.getString("ZinstantZaloView_Identification");
            }
            if (bundle.containsKey("ZinstantZaloView_optionsMenu")) {
                String string = bundle.getString("ZinstantZaloView_optionsMenu");
                this.f79736g1 = string;
                if (!TextUtils.isEmpty(string)) {
                    C13701o3 c13701o3 = new C13701o3(this);
                    this.f79729Z0 = c13701o3;
                    c13701o3.m76574h(this.f79736g1);
                }
            }
            if (bundle.containsKey("ZinstantZaloView_dialog_msg_exit")) {
                this.f79726W0 = bundle.getString("ZinstantZaloView_dialog_msg_exit");
            }
            if (bundle.containsKey("ZinstantZaloView_hideWhenClickOut")) {
                this.f79738i1 = bundle.getInt("ZinstantZaloView_hideWhenClickOut");
            }
            if (bundle.containsKey("ZinstantZaloView_disableBack")) {
                if (bundle.getInt("ZinstantZaloView_disableBack") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f79740k1 = z11;
            }
            if (bundle.containsKey("ZinstantZaloView_background_option")) {
                this.f79739j1 = bundle.getInt("ZinstantZaloView_background_option");
            }
            C17244x0 c17244x0 = new C17244x0(this.f79737h1, new JSONObject(bundle.getString("ZinstantZaloView_ZinstantAPIInfo", "")));
            if (c17244x0.m92065c()) {
                this.f79723T0 = c17244x0.m92064b();
                return true;
            }
            m87240xM(null);
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            m87240xM(null);
            return false;
        }
    }

    /* renamed from: BM */
    private boolean m87199BM(String str, String str2, AbstractC28207v1.h0 h0Var) {
        if (str == null) {
            return false;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1285925533:
                if (str.equals("action.zinstant.request.location")) {
                    c11 = 0;
                    break;
                }
                break;
            case 923588664:
                if (str.equals("action.zinstant.get.zotp")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1614341938:
                if (str.equals("action.window.close")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                m87218ZM(str2);
                return true;
            case 1:
                m87217WM(str2);
                return true;
            case 2:
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("isClearData") && jSONObject.getInt("isClearData") == 1) {
                            AbstractC0924m0.m3721cf("");
                        }
                    }
                    String str3 = this.f79726W0;
                    if (str3 != null) {
                        if (this.f79727X0 == null) {
                            this.f79727X0 = m87212OM(str3, h0Var);
                        }
                        if (!this.f79727X0.m92868m()) {
                            this.f79727X0.mo13822K();
                        }
                    } else {
                        mo79149uM(3);
                        if (h0Var != null) {
                            h0Var.mo39930a("", "");
                        }
                    }
                } catch (Exception unused) {
                    mo79149uM(3);
                    if (h0Var != null) {
                        h0Var.mo39930a("", "");
                    }
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: CM */
    private boolean m87200CM() {
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null && zaloZinstantLayout.getZinstantRootTree() != null) {
            C23855s0 zinstantRootTree = this.f79722S0.getZinstantRootTree();
            if (zinstantRootTree.mo124396d() != null && zinstantRootTree.mo124396d().mHasScript) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: DM */
    private void m87201DM(int i11) {
        this.f79733d1 = i11;
        View view = this.f79720Q0;
        if (view == null) {
            return;
        }
        if (i11 == 1) {
            int m118742r = AbstractC23136l9.m118742r(20.0f);
            int m118742r2 = AbstractC23136l9.m118742r(30.0f);
            this.f79720Q0.setPadding(m118742r, m118742r2, m118742r, m118742r2);
            this.f79720Q0.setBackgroundColor(m92651WI().getColor(AbstractC16801x.black_60));
            return;
        }
        if (i11 == 2) {
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f79720Q0.setBackgroundColor(m92651WI().getColor(AbstractC16801x.transparent));
            return;
        }
        if (i11 == 3) {
            if (this.f79739j1 == 0) {
                view.setBackgroundColor(m92651WI().getColor(AbstractC16801x.transparent));
            } else {
                view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.PrimaryBackgroundColor));
            }
            View findViewById = this.f79720Q0.findViewById(AbstractC6918a0.btn_close);
            int i12 = AbstractC32226c.m155411j(m92676n2()).top;
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin += i12;
            if (!this.f79743n1) {
                ((ViewGroup.MarginLayoutParams) this.f79721R0.getLayoutParams()).topMargin += i12;
            }
            findViewById.setVisibility(8);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.m81
                public /* synthetic */ m81() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ZinstantZaloView.this.m87205HM(view2);
                }
            });
        }
    }

    /* renamed from: EM */
    private void m87202EM() {
        if (m92676n2() != null) {
            m92676n2().mo35554O(32);
        }
    }

    /* renamed from: FM */
    private boolean m87203FM() {
        int i11 = this.f79733d1;
        return i11 == 0 || i11 == 3;
    }

    /* renamed from: GM */
    public /* synthetic */ void m87204GM(ZinstantException zinstantException, View view) {
        if (zinstantException != null && zinstantException.m91678c()) {
            m87219aN();
        } else {
            mo79149uM(2);
        }
    }

    /* renamed from: HM */
    public /* synthetic */ void m87205HM(View view) {
        mo79149uM(0);
    }

    /* renamed from: IM */
    public /* synthetic */ void m87206IM(AbstractC28207v1.h0 h0Var, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        mo79149uM(3);
        if (h0Var != null) {
            h0Var.mo39930a("", "");
        }
    }

    /* renamed from: JM */
    public /* synthetic */ void m87207JM(View view) {
        if (this.f79733d1 == 1 && this.f79738i1 == 1) {
            mo79149uM(0);
        }
    }

    /* renamed from: KM */
    public /* synthetic */ void m87208KM(InterfaceC17123a interfaceC17123a, boolean z11) {
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null && z11) {
            zaloZinstantLayout.m91993g0();
        }
    }

    /* renamed from: LM */
    public /* synthetic */ void m87209LM() {
        if (!new C28239y6().m142225f(m92689tK(), new C15417f(), new SensitiveData("zinstant_zalo_view", "zinstant"))) {
            m87214SM();
        }
    }

    /* renamed from: MM */
    public /* synthetic */ C1580n1 m87210MM(View view, C1580n1 c1580n1) {
        m87220bN();
        return c1580n1;
    }

    /* renamed from: NM */
    public /* synthetic */ void m87211NM() {
        try {
            AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112034k, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
        } catch (Exception e11) {
            AbstractC20110a.m104543l("ZinstantZaloView").mo104552e(e11);
        }
    }

    /* renamed from: OM */
    private synchronized C8009j m87212OM(String str, AbstractC28207v1.h0 h0Var) {
        C8009j.a aVar;
        try {
            if (TextUtils.isEmpty(str)) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_exit_confirm_webview);
            }
            aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(3).m43162k(str).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.a()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.n81

                /* renamed from: q */
                public final /* synthetic */ AbstractC28207v1.h0 f81331q;

                public /* synthetic */ n81(AbstractC28207v1.h0 h0Var2) {
                    r2 = h0Var2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZinstantZaloView.this.m87206IM(r2, interfaceC17463d, i11);
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.m43152a();
    }

    /* renamed from: PM */
    private String m87213PM() {
        String str;
        String str2 = this.f79734e1;
        if (!TextUtils.equals(AbstractC17158i1.f87698h, "vi") && (str = this.f79735f1) != null && !str.isEmpty()) {
            return str;
        }
        return str2;
    }

    /* renamed from: SM */
    public void m87214SM() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latitude", "-1");
            jSONObject.put("longitude", "-1");
            m87243VM("js.action.location", jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.m104543l("ZinstantZaloView").mo104552e(e11);
        }
    }

    /* renamed from: TM */
    private void m87215TM() {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.e81
            public /* synthetic */ e81() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantZaloView.this.m87209LM();
            }
        });
    }

    /* renamed from: UM */
    public void m87216UM(Location location) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latitude", String.valueOf(location.getLatitude()));
            jSONObject.put("longitude", String.valueOf(location.getLongitude()));
            m87243VM("js.action.location", jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.m104543l("ZinstantZaloView").mo104552e(e11);
        }
    }

    /* renamed from: WM */
    private void m87217WM(String str) {
        String str2;
        try {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            String str3 = "";
            if (contactProfile == null || TextUtils.isEmpty(contactProfile.f42455y)) {
                str2 = "";
            } else {
                str2 = AbstractC23304d.f113368c0.f42455y;
            }
            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                str2 = AbstractC23304d.f113394i0;
            }
            if (AbstractC23309i.m121859e9() == 1) {
                str3 = AbstractC23309i.m121704a5();
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15416e());
            c0766k.mo1564W6(str2, str3, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ZM */
    private void m87218ZM(String str) {
        if (!C8937j0.m47663l("zinstant_zalo_view")) {
            m87214SM();
            return;
        }
        if (AbstractC23034c6.m118165m(m92689tK(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            if (str != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            if (new JSONObject(str).optBoolean("silent_request", false)) {
                                m87214SM();
                                return;
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.m104536e(e11);
                        }
                    }
                } catch (Exception unused) {
                    m87214SM();
                    return;
                }
            }
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.l81
                public /* synthetic */ l81() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantZaloView.this.m87211NM();
                }
            }, 200L);
            return;
        }
        m87215TM();
    }

    /* renamed from: aN */
    private void m87219aN() {
        this.f79721R0.setState(MultiStateView.EnumC15914e.LOADING);
        if (m87203FM()) {
            m87223eN(-1, -1);
        } else {
            m87223eN(this.f79721R0.getWidth(), this.f79721R0.getHeight());
        }
        this.f79722S0.mo91437z0();
    }

    /* renamed from: bN */
    public void m87220bN() {
        C1580n1 m7824M;
        View view = this.f79720Q0;
        if (view == null || (m7824M = AbstractC1579n0.m7824M(view)) == null) {
            return;
        }
        int max = Math.max(m7824M.m8054f(C1580n1.m.m8114b()).f6233d - m7824M.m8054f(C1580n1.m.m8118f()).f6233d, 0);
        if (this.f79730a1 == max) {
            return;
        }
        int width = this.f79722S0.getWidth();
        if (max > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", width);
                jSONObject.put("height", max);
                if (m87243VM("js.action.keyboard.willshow", jSONObject.toString())) {
                    this.f79730a1 = max;
                    return;
                }
                return;
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (m87243VM("js.action.keyboard.willhide", null)) {
            this.f79730a1 = max;
        }
    }

    /* renamed from: cN */
    private void m87221cN() {
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null && this.f79733d1 != 1) {
            Rect m87238vM = m87238vM(zaloZinstantLayout);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("left", m87238vM.left);
                jSONObject.put("right", m87238vM.right);
                jSONObject.put("bottom", m87238vM.bottom);
                jSONObject.put("top", m87238vM.top);
                m87243VM("js.action.zinstant.window.insets", jSONObject.toString());
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: eM */
    public /* synthetic */ void m87222eM(int i11, Object[] objArr) {
        if (i11 == 6027 && objArr != null && objArr.length > 0 && TextUtils.equals(objArr[0].toString(), this.f79725V0)) {
            mo79149uM(4);
        }
    }

    /* renamed from: eN */
    private void m87223eN(int i11, int i12) {
        if (this.f79721R0.getLayoutParams() != null) {
            this.f79721R0.getLayoutParams().width = i11;
            this.f79721R0.getLayoutParams().height = i12;
        }
    }

    /* renamed from: vM */
    private static Rect m87238vM(View view) {
        Rect rect;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (view != null && view.getVisibility() != 8) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            View rootView = view.getRootView();
            int width = rootView.getWidth();
            int height = rootView.getHeight();
            Rect m155407f = AbstractC32226c.m155407f(rootView);
            if (Build.VERSION.SDK_INT >= 26) {
                rect = AbstractC32229f.m155440l(rootView);
            } else {
                rect = null;
            }
            if (rect == null) {
                rect = new Rect();
            }
            int max = Math.max(m155407f.left, rect.left);
            int max2 = Math.max(m155407f.top, rect.top);
            int max3 = Math.max(m155407f.right, rect.right);
            int max4 = Math.max(m155407f.bottom, rect.bottom);
            if (i15 < max) {
                i11 = max - i15;
            } else {
                i11 = 0;
            }
            if (i16 < max2) {
                i12 = max2 - i16;
            } else {
                i12 = 0;
            }
            int measuredWidth = i15 + view.getMeasuredWidth();
            int measuredHeight = i16 + view.getMeasuredHeight();
            int i17 = width - max3;
            if (measuredWidth > i17) {
                i13 = measuredWidth - i17;
            } else {
                i13 = 0;
            }
            int i18 = height - max4;
            if (measuredHeight > i18) {
                i14 = measuredHeight - i18;
            }
            return new Rect(i11, i12, i13, i14);
        }
        return new Rect(0, 0, 0, 0);
    }

    /* renamed from: wM */
    private void m87239wM(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f79734e1 = bundle.getString("ZinstantZaloView_title", "");
        this.f79735f1 = bundle.getString("ZinstantZaloView_title_en", "");
        this.f79742m1 = bundle.getInt("ZinstantZaloView_dismissOnFailure", 0);
        boolean z11 = true;
        if (bundle.getInt("ZinstantZaloView_disableSlideToBack", 0) != 1) {
            z11 = false;
        }
        this.f79741l1 = z11;
        this.f79743n1 = bundle.getBoolean("ZinstantZaloView_occupyStatusBar", false);
        this.f79744o1 = bundle.getBoolean("ZinstantZaloView_handleOnBackPressed", false);
    }

    /* renamed from: xM */
    public void m87240xM(Exception exc) {
        ZinstantException zinstantException;
        View view;
        View findViewById;
        if (exc instanceof ZinstantException) {
            zinstantException = (ZinstantException) exc;
        } else {
            zinstantException = null;
        }
        m87246fN();
        String m92652XI = m92652XI(AbstractC8020f0.str_exit);
        if (zinstantException != null && zinstantException.m91678c()) {
            if (this.f79742m1 == 2) {
                mo79149uM(1);
                return;
            } else {
                m92652XI = m92652XI(AbstractC8020f0.str_retry);
                this.f79721R0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                this.f79721R0.setErrorTitleString(m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG));
            }
        } else {
            int i11 = this.f79742m1;
            if (i11 != 2 && i11 != 1) {
                this.f79721R0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                this.f79721R0.setErrorTitleString(m92652XI(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG));
            } else {
                mo79149uM(1);
                return;
            }
        }
        if (m87203FM()) {
            m87223eN(-1, -1);
        } else {
            m87223eN(-1, -2);
        }
        this.f79721R0.setState(MultiStateView.EnumC15914e.ERROR);
        int i12 = 0;
        if (this.f79733d1 == 0) {
            this.f79721R0.setBackgroundResource(0);
        } else {
            this.f79721R0.setBackgroundResource(AbstractC16803z.bubble_left_background);
        }
        this.f79721R0.getErrorView().setPadding(0, 0, 0, AbstractC23136l9.m118742r(30.0f));
        Button buttonRetry = this.f79721R0.getButtonRetry();
        buttonRetry.setVisibility(0);
        buttonRetry.setText(m92652XI);
        buttonRetry.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.h81

            /* renamed from: q */
            public final /* synthetic */ ZinstantException f80561q;

            public /* synthetic */ h81(ZinstantException zinstantException2) {
                r2 = zinstantException2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ZinstantZaloView.this.m87204GM(r2, view2);
            }
        });
        if (this.f79733d1 == 3 && (view = this.f79720Q0) != null && (findViewById = view.findViewById(AbstractC6918a0.btn_close)) != null) {
            if (this.f79740k1) {
                i12 = 8;
            }
            findViewById.setVisibility(i12);
        }
    }

    /* renamed from: yM */
    public void m87241yM() {
        View view;
        View findViewById;
        m87246fN();
        if (m87203FM()) {
            m87223eN(-1, -1);
        } else {
            m87223eN(-1, -2);
        }
        this.f79721R0.setState(MultiStateView.EnumC15914e.CONTENT);
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStart();
        }
        if (this.f79733d1 == 3 && (view = this.f79720Q0) != null && (findViewById = view.findViewById(AbstractC6918a0.btn_close)) != null) {
            findViewById.setVisibility(8);
        }
        m87221cN();
        m87220bN();
    }

    /* renamed from: zM */
    private void m87242zM(Bundle bundle) {
        try {
            if (bundle == null) {
                m87198AM(m92642L3());
                return;
            }
            m87239wM(bundle);
            boolean z11 = false;
            this.f79733d1 = bundle.getInt("ZinstantZaloView_typeView", 0);
            C17244x0 c17244x0 = new C17244x0(this.f79737h1, new JSONObject(bundle.getString("ZinstantZaloView_ZinstantConfig", "{}")));
            this.f79737h1 = bundle.getInt("ZinstantZaloView_featureType", 7);
            if (bundle.containsKey("ZinstantZaloView_Identification")) {
                this.f79725V0 = bundle.getString("ZinstantZaloView_Identification");
            }
            if (bundle.containsKey("ZinstantZaloView_optionsMenu")) {
                String string = bundle.getString("ZinstantZaloView_optionsMenu");
                this.f79736g1 = string;
                if (!TextUtils.isEmpty(string)) {
                    C13701o3 c13701o3 = new C13701o3(this);
                    this.f79729Z0 = c13701o3;
                    c13701o3.m76574h(this.f79736g1);
                }
            }
            if (bundle.containsKey("ZinstantZaloView_dialog_msg_exit")) {
                this.f79726W0 = bundle.getString("ZinstantZaloView_dialog_msg_exit");
            }
            if (bundle.containsKey("ZinstantZaloView_hideWhenClickOut")) {
                this.f79738i1 = bundle.getInt("ZinstantZaloView_hideWhenClickOut");
            }
            if (bundle.containsKey("ZinstantZaloView_disableBack")) {
                if (bundle.getInt("ZinstantZaloView_disableBack") == 1) {
                    z11 = true;
                }
                this.f79740k1 = z11;
            }
            if (bundle.containsKey("ZinstantZaloView_background_option")) {
                this.f79739j1 = bundle.getInt("ZinstantZaloView_background_option");
            }
            if (!c17244x0.m92065c()) {
                return;
            }
            this.f79723T0 = c17244x0.m92064b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m87242zM(bundle);
        C23744a.m124114c().m124115b(this.f79746q1, 6027);
        if (m92676n2() != null && m92676n2().getWindow() != null) {
            this.f79745p1 = m92676n2().getWindow().getAttributes().softInputMode;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        C13701o3 c13701o3;
        if (m92648SI() != null && this.f72421L0.m92674mJ() && !m92681pJ() && (c13701o3 = this.f79729Z0) != null) {
            c13701o3.m76576p(actionBarMenu);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo80764QM = mo80764QM(layoutInflater, viewGroup, bundle);
        this.f79720Q0 = mo80764QM;
        if (mo80764QM == null) {
            int i11 = this.f79733d1;
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    this.f79720Q0 = layoutInflater.inflate(AbstractC7409c0.zinstant_zalo_full_view, viewGroup, false);
                } else {
                    this.f79720Q0 = layoutInflater.inflate(AbstractC7409c0.zinstant_zalo_full_content_view, viewGroup, false);
                }
            } else {
                this.f79720Q0 = layoutInflater.inflate(AbstractC7409c0.zinstant_zalo_popup_view, viewGroup, false);
            }
        }
        this.f79724U0 = (ZinstantScrollViewImpl) this.f79720Q0.findViewById(AbstractC6918a0.parentScrollView);
        this.f79722S0 = (ZaloZinstantLayout) this.f79720Q0.findViewById(AbstractC6918a0.zinstant_layout);
        MultiStateView multiStateView = (MultiStateView) this.f79720Q0.findViewById(AbstractC6918a0.multi_state_container);
        this.f79721R0 = multiStateView;
        multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
        this.f79720Q0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.i81
            public /* synthetic */ i81() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZinstantZaloView.this.m87207JM(view);
            }
        });
        this.f79724U0.setOnIdleListener(new InterfaceC17123a.a() { // from class: com.zing.zalo.ui.zviews.j81
            public /* synthetic */ j81() {
            }

            @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a.a
            /* renamed from: a */
            public final void mo68087a(InterfaceC17123a interfaceC17123a, boolean z11) {
                ZinstantZaloView.this.m87208KM(interfaceC17123a, z11);
            }
        });
        m87201DM(this.f79733d1);
        return this.f79720Q0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m87246fN();
        C23855s0 zinstantRootTree = this.f79722S0.getZinstantRootTree();
        if (zinstantRootTree != null && zinstantRootTree.f115178b != null) {
            C20599v.m107204a().m107218l(zinstantRootTree.f115178b);
        }
        C23744a.m124114c().m124117e(this.f79746q1, 6027);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        int i11 = this.f79733d1;
        if (i11 == 0) {
            return super.mo37488Li();
        }
        if (i11 != 3 || this.f79740k1 || this.f79741l1) {
            return false;
        }
        return super.mo37488Li();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        return super.mo39030NJ(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        C13701o3 c13701o3 = this.f79729Z0;
        if (c13701o3 != null && c13701o3.m76577s(i11)) {
            return true;
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QM */
    public View mo80764QM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m87246fN();
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStop();
        }
        if (m92676n2() != null && m92676n2().getWindow() != null) {
            m92676n2().getWindow().setSoftInputMode(this.f79745p1);
        }
    }

    /* renamed from: RM */
    public void mo79146RM(Bundle bundle) {
        try {
            AbstractC20110a.m104543l("ZinstantZaloView").mo104548a("onNewIntent: %s", bundle);
            if (m87198AM(bundle)) {
                m87201DM(this.f79733d1);
                mo37493TJ();
                this.f79722S0.m91447b1(this.f79723T0, null);
                m87219aN();
                ZinstantScrollViewImpl zinstantScrollViewImpl = this.f79724U0;
                if (zinstantScrollViewImpl != null) {
                    zinstantScrollViewImpl.m8329j0(0, 0);
                }
            }
        } catch (Exception e11) {
            m87240xM(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        InterfaceC22508f interfaceC22508f = this.f79723T0;
        if (interfaceC22508f != null) {
            try {
                JSONObject m92063a = C17244x0.m92063a(interfaceC22508f);
                if (m92063a != null) {
                    if (m92063a.has("zinstantdata")) {
                        JSONObject jSONObject = m92063a.getJSONObject("zinstantdata");
                        if (jSONObject.has("data_base64") && jSONObject.getString("data_base64").getBytes().length >= 49152) {
                            jSONObject.remove("data_base64");
                        }
                    }
                    bundle.putString("ZinstantZaloView_ZinstantConfig", m92063a.toString());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(this.f79725V0)) {
            bundle.putString("ZinstantZaloView_Identification", this.f79725V0);
        }
        bundle.putInt("ZinstantZaloView_featureType", this.f79737h1);
        bundle.putInt("ZinstantZaloView_typeView", this.f79733d1);
        bundle.putString("ZinstantZaloView_title", this.f79734e1);
        bundle.putString("ZinstantZaloView_title_en", this.f79735f1);
        String str = this.f79726W0;
        if (str != null) {
            bundle.putString("ZinstantZaloView_dialog_msg_exit", str);
        }
        bundle.putInt("ZinstantZaloView_hideWhenClickOut", this.f79738i1);
        bundle.putInt("ZinstantZaloView_disableBack", this.f79740k1 ? 1 : 0);
        bundle.putInt("ZinstantZaloView_disableSlideToBack", this.f79741l1 ? 1 : 0);
        bundle.putInt("ZinstantZaloView_background_option", this.f79739j1);
        bundle.putInt("ZinstantZaloView_dismissOnFailure", this.f79742m1);
        bundle.putBoolean("ZinstantZaloView_occupyStatusBar", this.f79743n1);
        bundle.putBoolean("ZinstantZaloView_handleOnBackPressed", this.f79744o1);
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m87213PM());
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                int i11 = this.f79733d1;
                if (i11 == 2 || i11 == 1 || i11 == 3) {
                    this.f88760a0.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    public boolean m87243VM(String str, String str2) {
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null && zaloZinstantLayout.getZinstantRootTree() != null) {
            this.f79722S0.m91999q0(str, str2);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m87202EM();
        if (z11) {
            try {
                if (m92642L3() != null && m92642L3().containsKey("ZinstantZaloView_index_removeOldView")) {
                    int i11 = m92642L3().getInt("ZinstantZaloView_index_removeOldView", -1);
                    C17487o0 m92662fJ = m92662fJ();
                    if (i11 > -1 && m92662fJ != null) {
                        m92662fJ.m92985A0(i11);
                    }
                    m92642L3().remove("ZinstantZaloView_index_removeOldView");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: XM */
    public void m87244XM(String str, String str2, InterfaceC24785k interfaceC24785k) {
        AbstractC28207v1.h0 h0Var;
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null) {
            h0Var = zaloZinstantLayout.m91448V0(str, str2, interfaceC24785k);
        } else {
            h0Var = null;
        }
        AbstractC28207v1.h0 h0Var2 = h0Var;
        if (m87199BM(str, str2, h0Var2)) {
            return;
        }
        AbstractC28207v1.j0 j0Var = this.f79728Y0;
        if (j0Var != null) {
            j0Var.mo87297a(this, str, 2, str2, h0Var2, "", new C15418g(this, str, str2, 2), null);
        } else {
            AbstractC28207v1.m141989h3(str, 2, m92676n2(), this, str2, h0Var2, null, new C15418g(this, str, str2, 2), null);
        }
    }

    /* renamed from: YM */
    protected void m87245YM() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f79720Q0;
        if (view != null) {
            viewTreeObserver = view.getViewTreeObserver();
        } else {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        InterfaceC22508f interfaceC22508f = this.f79723T0;
        if (interfaceC22508f == null) {
            m87240xM(null);
            return;
        }
        this.f79722S0.m91447b1(interfaceC22508f, null);
        this.f79722S0.setOnZinstantClickListener(this.f79731b1);
        this.f79722S0.setExternalScriptListener(this.f79732c1);
        this.f79722S0.m91445Y0(this.f79747r1, this.f79719P0);
        this.f79722S0.setUseProgressLoading(false);
        if (Build.VERSION.SDK_INT < 30) {
            this.f79722S0.setOnLayoutListener(new ZaloZinstantLayout.InterfaceC17098c() { // from class: com.zing.zalo.ui.zviews.f81
                public /* synthetic */ f81() {
                }

                @Override // com.zing.zalo.zinstant.ZaloZinstantLayout.InterfaceC17098c
                /* renamed from: a */
                public final void mo87299a() {
                    ZinstantZaloView.this.m87220bN();
                }
            });
        } else {
            AbstractC1579n0.m7833Q0(this.f79722S0, new InterfaceC1551g0() { // from class: com.zing.zalo.ui.zviews.g81
                public /* synthetic */ g81() {
                }

                @Override // androidx.core.view.InterfaceC1551g0
                /* renamed from: c */
                public final C1580n1 mo4846c(View view2, C1580n1 c1580n1) {
                    C1580n1 m87210MM;
                    m87210MM = ZinstantZaloView.this.m87210MM(view2, c1580n1);
                    return m87210MM;
                }
            });
        }
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(m87213PM());
        }
    }

    /* renamed from: dN */
    public void mo79514dN(AbstractC28207v1.j0 j0Var) {
        this.f79728Y0 = j0Var;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: eJ */
    public String mo81386eJ() {
        if (!TextUtils.isEmpty(this.f79725V0)) {
            return this.f79725V0;
        }
        return null;
    }

    /* renamed from: fN */
    public void m87246fN() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f79720Q0;
        if (view != null) {
            viewTreeObserver = view.getViewTreeObserver();
        } else {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public String getTrackingKey() {
        return "ZinstantZaloView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m87245YM();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f79722S0.mo91437z0();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            int i12 = 0;
            if (this.f79733d1 == 3) {
                if (this.f79744o1 && m87200CM()) {
                    this.f79722S0.m91999q0("js.action.zinstant.onback", "");
                    return true;
                }
                if (!this.f79740k1) {
                    if (this.f79721R0.getState() == MultiStateView.EnumC15914e.ERROR) {
                        i12 = 2;
                    }
                    mo79149uM(i12);
                }
                return true;
            }
            if (this.f79721R0.getState() == MultiStateView.EnumC15914e.ERROR) {
                i12 = 2;
            }
            mo79149uM(i12);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 110) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118165m(m92689tK(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                m87215TM();
                return;
            } else {
                m87214SM();
                return;
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStart();
        }
        m87202EM();
    }

    /* renamed from: uM */
    protected void mo79149uM(int i11) {
        Intent intent = new Intent();
        intent.putExtra("ZinstantZaloView_result_exitType", i11);
        mo50035CK(-1, intent);
        if (m92662fJ() != null && (m92662fJ().m93012K0() instanceof ZinstantZaloView)) {
            m92662fJ().m93012K0().finish();
        } else {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (this.f79733d1 == 0) {
            m84416fM(true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: yJ */
    public void mo46830yJ(WindowInsets windowInsets) {
        super.mo46830yJ(windowInsets);
        m87220bN();
    }
}
