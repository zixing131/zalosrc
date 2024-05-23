package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.R;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7216t4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.UpdatePersonalInfoView;
import com.zing.zalo.uicontrol.CustomAutoCompleteTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import x60.AbstractC29394g;

/* loaded from: classes6.dex */
public class UpdatePersonalInfoView extends SlidableZaloView implements View.OnClickListener, View.OnFocusChangeListener, TextWatcher, InterfaceC17463d.d, TextView.OnEditorActionListener, InterfaceC0733x {

    /* renamed from: F1 */
    private static final String f78590F1 = "UpdatePersonalInfoView";

    /* renamed from: P0 */
    private KeyboardFrameLayout f78596P0;

    /* renamed from: Q0 */
    private ScrollView f78597Q0;

    /* renamed from: R0 */
    private View f78598R0;

    /* renamed from: V0 */
    private RelativeLayout f78602V0;

    /* renamed from: W0 */
    private CustomAutoCompleteTextView f78603W0;

    /* renamed from: X0 */
    private RobotoTextView f78604X0;

    /* renamed from: a1 */
    private RelativeLayout f78607a1;

    /* renamed from: b1 */
    private CustomAutoCompleteTextView f78608b1;

    /* renamed from: c1 */
    private RobotoTextView f78609c1;

    /* renamed from: f1 */
    private RelativeLayout f78612f1;

    /* renamed from: g1 */
    private CustomAutoCompleteTextView f78613g1;

    /* renamed from: h1 */
    private RobotoTextView f78614h1;

    /* renamed from: k1 */
    private RelativeLayout f78617k1;

    /* renamed from: l1 */
    private CustomEditText f78618l1;

    /* renamed from: m1 */
    private RobotoTextView f78619m1;

    /* renamed from: n1 */
    private RelativeLayout f78620n1;

    /* renamed from: o1 */
    private CustomEditText f78621o1;

    /* renamed from: p1 */
    private RobotoTextView f78622p1;

    /* renamed from: q1 */
    private RelativeLayout f78623q1;

    /* renamed from: r1 */
    private RobotoTextView f78624r1;

    /* renamed from: u1 */
    private RobotoTextView f78627u1;

    /* renamed from: S0 */
    private final boolean f78599S0 = false;

    /* renamed from: T0 */
    private View f78600T0 = null;

    /* renamed from: U0 */
    private Button f78601U0 = null;

    /* renamed from: Y0 */
    private String f78605Y0 = "";

    /* renamed from: Z0 */
    private boolean f78606Z0 = false;

    /* renamed from: d1 */
    private String f78610d1 = "";

    /* renamed from: e1 */
    private boolean f78611e1 = false;

    /* renamed from: i1 */
    private String f78615i1 = "";

    /* renamed from: j1 */
    private boolean f78616j1 = false;

    /* renamed from: s1 */
    private String f78625s1 = "";

    /* renamed from: t1 */
    private boolean f78626t1 = false;

    /* renamed from: v1 */
    private final List f78628v1 = new ArrayList();

    /* renamed from: w1 */
    private boolean f78629w1 = false;

    /* renamed from: x1 */
    int f78630x1 = -1;

    /* renamed from: y1 */
    KeyEventCallbackC17462c f78631y1 = null;

    /* renamed from: z1 */
    private InterfaceC0765j f78632z1 = null;

    /* renamed from: A1 */
    private boolean f78591A1 = false;

    /* renamed from: B1 */
    private final List f78592B1 = new ArrayList();

    /* renamed from: C1 */
    private final List f78593C1 = new ArrayList();

    /* renamed from: D1 */
    private final List f78594D1 = new ArrayList();

    /* renamed from: E1 */
    private int f78595E1 = -1;

    /* renamed from: com.zing.zalo.ui.zviews.UpdatePersonalInfoView$a */
    /* loaded from: classes6.dex */
    class C15236a implements KeyboardFrameLayout.InterfaceC13508a {
        C15236a() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            UpdatePersonalInfoView.this.f78629w1 = false;
            UpdatePersonalInfoView.this.m85631QM();
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            UpdatePersonalInfoView.this.f78629w1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdatePersonalInfoView$b */
    /* loaded from: classes6.dex */
    public class C15237b implements InterfaceC20094a {
        C15237b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC23350e.m122774d(UpdatePersonalInfoView.f78590F1, "cannot get extend profile .... " + c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj instanceof JSONObject) {
                AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d((JSONObject) obj);
                AbstractC23309i.m122097kj(AbstractC23304d.f113368c0.f42366P.m40451f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdatePersonalInfoView$c */
    /* loaded from: classes6.dex */
    public class C15238c implements AbstractC29394g.a {
        C15238c() {
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: a */
        public void mo57176a() {
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: b */
        public void mo57177b(int i11) {
            try {
                UpdatePersonalInfoView updatePersonalInfoView = UpdatePersonalInfoView.this;
                updatePersonalInfoView.f78630x1 = i11;
                updatePersonalInfoView.f78624r1.setText((CharSequence) AbstractC23304d.f113378e0.get(i11));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdatePersonalInfoView$d */
    /* loaded from: classes6.dex */
    public class C15239d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile.C7868d f78636a;

        /* renamed from: b */
        final /* synthetic */ boolean f78637b;

        C15239d(ContactProfile.C7868d c7868d, boolean z11) {
            this.f78636a = c7868d;
            this.f78637b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m85634e(boolean z11) {
            try {
                try {
                    UpdatePersonalInfoView.this.m85601OM();
                    UpdatePersonalInfoView.this.f72421L0.mo49315c4();
                    ToastUtils.showMess(UpdatePersonalInfoView.this.m92651WI().getString(AbstractC8020f0.str_ext_profile_update_success));
                    if (!z11) {
                        return;
                    }
                } catch (RuntimeException e11) {
                    AbstractC23350e.m122778h(e11);
                    UpdatePersonalInfoView.this.f72421L0.mo49315c4();
                    ToastUtils.showMess(UpdatePersonalInfoView.this.m92651WI().getString(AbstractC8020f0.str_ext_profile_update_success));
                    if (!z11) {
                        return;
                    }
                }
                UpdatePersonalInfoView.this.f72421L0.finish();
            } catch (Throwable th2) {
                UpdatePersonalInfoView.this.f72421L0.mo49315c4();
                ToastUtils.showMess(UpdatePersonalInfoView.this.m92651WI().getString(AbstractC8020f0.str_ext_profile_update_success));
                if (z11) {
                    UpdatePersonalInfoView.this.f72421L0.finish();
                }
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m85635f() {
            UpdatePersonalInfoView.this.f72421L0.mo49315c4();
            UpdatePersonalInfoView.this.f78627u1.setVisibility(0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            UpdatePersonalInfoView.this.f78591A1 = false;
            UpdatePersonalInfoView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.mw0
                @Override // java.lang.Runnable
                public final void run() {
                    UpdatePersonalInfoView.C15239d.this.m85635f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            UpdatePersonalInfoView.this.f78591A1 = false;
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            ContactProfile.C7868d c7868d = this.f78636a;
            contactProfile.f42366P = c7868d;
            AbstractC23309i.m122097kj(c7868d.m40451f());
            UpdatePersonalInfoView updatePersonalInfoView = UpdatePersonalInfoView.this;
            final boolean z11 = this.f78637b;
            updatePersonalInfoView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    UpdatePersonalInfoView.C15239d.this.m85634e(z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdatePersonalInfoView$e */
    /* loaded from: classes6.dex */
    public class C15240e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f78639a;

        /* renamed from: b */
        final /* synthetic */ String f78640b;

        C15240e(int i11, String str) {
            this.f78639a = i11;
            this.f78640b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m85639f(String str) {
            try {
                if (UpdatePersonalInfoView.this.f78613g1.getAdapter() == null) {
                    C7216t4 c7216t4 = new C7216t4(UpdatePersonalInfoView.this.getContext(), R.layout.simple_list_item_1, new ArrayList());
                    c7216t4.m35957i(true);
                    UpdatePersonalInfoView.this.f78613g1.setAdapter(c7216t4);
                    UpdatePersonalInfoView.this.f78613g1.setThreshold(1);
                }
                C7216t4 c7216t42 = (C7216t4) UpdatePersonalInfoView.this.f78613g1.getAdapter();
                c7216t42.m35953b();
                ArrayList arrayList = new ArrayList(UpdatePersonalInfoView.this.f78592B1);
                c7216t42.m35952a(arrayList);
                c7216t42.getFilter().filter(str);
                if (UpdatePersonalInfoView.this.f78613g1.isFocused() && arrayList.size() > 0) {
                    UpdatePersonalInfoView.this.f78613g1.showDropDown();
                } else {
                    UpdatePersonalInfoView.this.f78613g1.dismissDropDown();
                }
            } catch (RuntimeException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m85640g(String str) {
            try {
                if (UpdatePersonalInfoView.this.f78608b1.getAdapter() == null) {
                    C7216t4 c7216t4 = new C7216t4(UpdatePersonalInfoView.this.getContext(), R.layout.simple_list_item_1, new ArrayList());
                    c7216t4.m35957i(true);
                    UpdatePersonalInfoView.this.f78608b1.setAdapter(c7216t4);
                    UpdatePersonalInfoView.this.f78608b1.setThreshold(1);
                }
                C7216t4 c7216t42 = (C7216t4) UpdatePersonalInfoView.this.f78608b1.getAdapter();
                c7216t42.m35953b();
                ArrayList arrayList = new ArrayList(UpdatePersonalInfoView.this.f78593C1);
                c7216t42.m35952a(arrayList);
                c7216t42.getFilter().filter(str);
                if (UpdatePersonalInfoView.this.f78608b1.isFocused() && arrayList.size() > 0) {
                    UpdatePersonalInfoView.this.f78608b1.showDropDown();
                } else {
                    UpdatePersonalInfoView.this.f78608b1.dismissDropDown();
                }
            } catch (RuntimeException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m85641h(String str) {
            try {
                if (UpdatePersonalInfoView.this.f78603W0.getAdapter() == null) {
                    C7216t4 c7216t4 = new C7216t4(UpdatePersonalInfoView.this.getContext(), R.layout.simple_list_item_1, new ArrayList());
                    c7216t4.m35957i(true);
                    UpdatePersonalInfoView.this.f78603W0.setAdapter(c7216t4);
                    UpdatePersonalInfoView.this.f78603W0.setThreshold(1);
                }
                C7216t4 c7216t42 = (C7216t4) UpdatePersonalInfoView.this.f78603W0.getAdapter();
                c7216t42.m35953b();
                ArrayList arrayList = new ArrayList(UpdatePersonalInfoView.this.f78594D1);
                c7216t42.m35952a(arrayList);
                c7216t42.getFilter().filter(str);
                if (UpdatePersonalInfoView.this.f78603W0.isFocused() && arrayList.size() > 0) {
                    UpdatePersonalInfoView.this.f78603W0.showDropDown();
                } else {
                    UpdatePersonalInfoView.this.f78603W0.dismissDropDown();
                }
            } catch (RuntimeException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    JSONArray jSONArray = jSONObject.getJSONArray("listResult");
                    if (jSONArray != null) {
                        if (optInt == 3) {
                            UpdatePersonalInfoView.this.f78592B1.clear();
                        } else if (optInt == 2) {
                            UpdatePersonalInfoView.this.f78593C1.clear();
                        } else if (optInt == 18) {
                            UpdatePersonalInfoView.this.f78594D1.clear();
                        } else if (optInt == 17) {
                            AbstractC23304d.f113378e0.clear();
                        }
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            if (optInt == 3) {
                                UpdatePersonalInfoView.this.f78592B1.add(jSONArray.getJSONObject(i11).getString("name"));
                            } else if (optInt == 2) {
                                UpdatePersonalInfoView.this.f78593C1.add(jSONArray.getJSONObject(i11).getString("name"));
                            } else if (optInt == 18) {
                                UpdatePersonalInfoView.this.f78594D1.add(jSONArray.getString(i11));
                            } else if (optInt == 17) {
                                AbstractC23304d.f113378e0.add(jSONArray.getString(i11));
                            }
                        }
                    }
                }
                if (UpdatePersonalInfoView.this.f78592B1 != null && this.f78639a == 3) {
                    InterfaceC27218a m92676n2 = UpdatePersonalInfoView.this.f72421L0.m92676n2();
                    final String str = this.f78640b;
                    m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ow0
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdatePersonalInfoView.C15240e.this.m85639f(str);
                        }
                    });
                }
                if (UpdatePersonalInfoView.this.f78593C1 != null && this.f78639a == 2) {
                    InterfaceC27218a m92676n22 = UpdatePersonalInfoView.this.f72421L0.m92676n2();
                    final String str2 = this.f78640b;
                    m92676n22.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdatePersonalInfoView.C15240e.this.m85640g(str2);
                        }
                    });
                }
                if (UpdatePersonalInfoView.this.f78594D1 != null && this.f78639a == 18) {
                    InterfaceC27218a m92676n23 = UpdatePersonalInfoView.this.f72421L0.m92676n2();
                    final String str3 = this.f78640b;
                    m92676n23.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.qw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdatePersonalInfoView.C15240e.this.m85641h(str3);
                        }
                    });
                }
            } catch (RuntimeException e11) {
                e = e11;
                AbstractC23350e.m122778h(e);
            } catch (JSONException e12) {
                e = e12;
                AbstractC23350e.m122778h(e);
            }
        }
    }

    /* renamed from: DM */
    private void m85591DM(ContactProfile.C7868d c7868d) {
        if (c7868d != null) {
            try {
                if (!TextUtils.isEmpty(c7868d.f42471e)) {
                    String trim = c7868d.f42471e.trim();
                    this.f78605Y0 = trim;
                    this.f78603W0.setText(trim);
                } else {
                    this.f78603W0.setText("");
                    this.f78605Y0 = "";
                }
                this.f78603W0.clearFocus();
                this.f78606Z0 = c7868d.f42472f;
                ContactProfile.C7876l c7876l = c7868d.f42467a;
                if (c7876l != null && !TextUtils.isEmpty(c7876l.m40474a())) {
                    String trim2 = c7868d.f42467a.m40474a().trim();
                    this.f78610d1 = trim2;
                    this.f78608b1.setText(trim2);
                    this.f78611e1 = c7868d.f42467a.f42517c;
                } else {
                    this.f78608b1.setText("");
                    this.f78610d1 = "";
                }
                this.f78608b1.clearFocus();
                ContactProfile.C7876l c7876l2 = c7868d.f42468b;
                if (c7876l2 != null && !TextUtils.isEmpty(c7876l2.m40474a())) {
                    String trim3 = c7868d.f42468b.m40474a().trim();
                    this.f78615i1 = trim3;
                    this.f78613g1.setText(trim3);
                    this.f78616j1 = c7868d.f42468b.f42517c;
                } else {
                    this.f78613g1.setText("");
                    this.f78615i1 = "";
                }
                this.f78613g1.clearFocus();
                if (!TextUtils.isEmpty(c7868d.f42475i)) {
                    this.f78618l1.setOrgText(c7868d.f42475i.trim());
                } else {
                    this.f78618l1.setOrgText("");
                }
                this.f78618l1.clearFocus();
                if (!TextUtils.isEmpty(c7868d.f42476j)) {
                    this.f78621o1.setOrgText(c7868d.f42476j.trim());
                } else {
                    this.f78621o1.setOrgText("");
                }
                this.f78621o1.clearFocus();
                if (!TextUtils.isEmpty(c7868d.f42477k)) {
                    String trim4 = c7868d.f42477k.trim();
                    this.f78625s1 = trim4;
                    this.f78624r1.setText(trim4);
                } else {
                    this.f78624r1.setText("");
                    this.f78625s1 = "";
                }
                this.f78626t1 = c7868d.f42478l;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m85592FM(AdapterView adapterView, View view, int i11, long j11) {
        m85628C();
        this.f78603W0.clearFocus();
        this.f78603W0.dismissDropDown();
        this.f78606Z0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m85593GM(AdapterView adapterView, View view, int i11, long j11) {
        m85628C();
        this.f78608b1.clearFocus();
        this.f78608b1.dismissDropDown();
        this.f78611e1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m85594HM(AdapterView adapterView, View view, int i11, long j11) {
        m85628C();
        this.f78613g1.clearFocus();
        this.f78613g1.dismissDropDown();
        this.f78616j1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m85595IM() {
        this.f78597Q0.smoothScrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m85596JM() {
        ViewGroup.LayoutParams layoutParams = this.f78598R0.getLayoutParams();
        layoutParams.width = this.f78597Q0.getLayoutParams().width;
        layoutParams.height = 0;
        this.f78598R0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m85597KM() {
        this.f78597Q0.smoothScrollTo(0, ((View) this.f78628v1.get(0)).getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m85598LM() {
        this.f78597Q0.smoothScrollTo(0, ((View) this.f78628v1.get(1)).getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m85599MM() {
        this.f78597Q0.smoothScrollTo(0, ((View) this.f78628v1.get(2)).getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m85600NM() {
        this.f78597Q0.smoothScrollTo(0, ((View) this.f78628v1.get(3)).getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public void m85601OM() {
        m85591DM(AbstractC23304d.f113368c0.f42366P);
        try {
            this.f78601U0.setEnabled(m85629CM());
            this.f78627u1.setVisibility(8);
            this.f78604X0.setVisibility(8);
            this.f78609c1.setVisibility(8);
            this.f78614h1.setVisibility(8);
            this.f78619m1.setVisibility(8);
            this.f78622p1.setVisibility(8);
            this.f78603W0.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
            this.f78608b1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
            this.f78613g1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
            this.f78618l1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
            this.f78621o1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: PM */
    private void m85602PM(EditText editText) {
        if (editText != null) {
            if (editText.isFocused()) {
                AbstractC2379w.m12432f(editText);
                m85606UM(editText, true);
            } else {
                AbstractC2379w.m12432f(editText);
                editText.setSelection(editText.getText().toString().length());
            }
        }
    }

    /* renamed from: RM */
    private void m85603RM(int i11, String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15240e(i11, str));
        c0766k.m1808F(i11, str);
    }

    /* renamed from: SM */
    private void m85604SM() {
        List list;
        try {
            List list2 = AbstractC23304d.f113378e0;
            if (list2 != null && list2.size() > 0) {
                KeyEventCallbackC17462c keyEventCallbackC17462c = this.f78631y1;
                if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                    this.f78631y1.dismiss();
                }
                int i11 = 0;
                while (true) {
                    list = AbstractC23304d.f113378e0;
                    if (i11 >= list.size()) {
                        break;
                    }
                    if (this.f78624r1.getText().toString().equals(list.get(i11))) {
                        this.f78630x1 = i11;
                        break;
                    }
                    i11++;
                }
                this.f78631y1 = AbstractC29394g.m146570o(this.f72421L0.m92648SI(), (String[]) list.toArray(new String[0]), new int[]{AbstractC17466e.transparent, AbstractC16803z.icn_check}, this.f78630x1, this.f72421L0.m92652XI(AbstractC8020f0.str_select_relationship_status), new C15238c(), 1);
                return;
            }
            m85603RM(17, "");
        } catch (RuntimeException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    private void m85605TM(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ContactProfile.C7868d c7868d;
        try {
            int i21 = 8;
            this.f78627u1.setVisibility(8);
            if (C23055e5.m118271f() && !this.f78591A1) {
                String trim = this.f78603W0.getText().toString().trim();
                String trim2 = this.f78608b1.getText().toString().trim();
                String trim3 = this.f78613g1.getText().toString().trim();
                String trim4 = this.f78618l1.getText().toString().trim();
                String trim5 = this.f78621o1.getText().toString().trim();
                boolean m118330i = AbstractC23059e9.m118330i(trim);
                boolean m118330i2 = AbstractC23059e9.m118330i(trim2);
                boolean m118330i3 = AbstractC23059e9.m118330i(trim3);
                boolean m118330i4 = AbstractC23059e9.m118330i(trim4);
                boolean m118330i5 = AbstractC23059e9.m118330i(trim5);
                RobotoTextView robotoTextView = this.f78604X0;
                if (m118330i) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                robotoTextView.setVisibility(i11);
                CustomAutoCompleteTextView customAutoCompleteTextView = this.f78603W0;
                if (m118330i) {
                    i12 = AbstractC16803z.bg_edit_text_v2;
                } else {
                    i12 = AbstractC16803z.bg_edit_text_error;
                }
                customAutoCompleteTextView.setBackgroundResource(i12);
                RobotoTextView robotoTextView2 = this.f78609c1;
                if (m118330i2) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                robotoTextView2.setVisibility(i13);
                CustomAutoCompleteTextView customAutoCompleteTextView2 = this.f78608b1;
                if (m118330i2) {
                    i14 = AbstractC16803z.bg_edit_text_v2;
                } else {
                    i14 = AbstractC16803z.bg_edit_text_error;
                }
                customAutoCompleteTextView2.setBackgroundResource(i14);
                RobotoTextView robotoTextView3 = this.f78614h1;
                if (m118330i3) {
                    i15 = 8;
                } else {
                    i15 = 0;
                }
                robotoTextView3.setVisibility(i15);
                CustomAutoCompleteTextView customAutoCompleteTextView3 = this.f78613g1;
                if (m118330i3) {
                    i16 = AbstractC16803z.bg_edit_text_v2;
                } else {
                    i16 = AbstractC16803z.bg_edit_text_error;
                }
                customAutoCompleteTextView3.setBackgroundResource(i16);
                RobotoTextView robotoTextView4 = this.f78619m1;
                if (m118330i4) {
                    i17 = 8;
                } else {
                    i17 = 0;
                }
                robotoTextView4.setVisibility(i17);
                CustomEditText customEditText = this.f78618l1;
                if (m118330i4) {
                    i18 = AbstractC16803z.bg_edit_text_v2;
                } else {
                    i18 = AbstractC16803z.bg_edit_text_error;
                }
                customEditText.setBackgroundResource(i18);
                RobotoTextView robotoTextView5 = this.f78622p1;
                if (!m118330i5) {
                    i21 = 0;
                }
                robotoTextView5.setVisibility(i21);
                CustomEditText customEditText2 = this.f78621o1;
                if (m118330i5) {
                    i19 = AbstractC16803z.bg_edit_text_v2;
                } else {
                    i19 = AbstractC16803z.bg_edit_text_error;
                }
                customEditText2.setBackgroundResource(i19);
                if (m118330i && m118330i2 && m118330i3 && m118330i4 && m118330i5 && (c7868d = AbstractC23304d.f113368c0.f42366P) != null) {
                    if (this.f78632z1 == null) {
                        C0766k c0766k = new C0766k();
                        this.f78632z1 = c0766k;
                        c0766k.mo1704o8(new C15239d(c7868d, z11));
                    }
                    c7868d.f42471e = this.f78603W0.getText().toString().trim();
                    c7868d.f42472f = this.f78606Z0;
                    if (this.f78608b1.getText().length() > 0) {
                        c7868d.f42467a = new ContactProfile.C7876l(this.f78608b1.getText().toString().trim(), "");
                    } else {
                        c7868d.f42467a = new ContactProfile.C7876l();
                    }
                    c7868d.f42467a.f42517c = this.f78611e1;
                    if (this.f78613g1.getText().length() > 0) {
                        c7868d.f42468b = new ContactProfile.C7876l(this.f78613g1.getText().toString().trim(), "");
                    } else {
                        c7868d.f42468b = new ContactProfile.C7876l();
                    }
                    c7868d.f42468b.f42517c = this.f78616j1;
                    c7868d.f42475i = this.f78618l1.getText().toString().trim();
                    c7868d.f42476j = this.f78621o1.getText().toString().trim();
                    c7868d.f42477k = this.f78624r1.getText().toString().trim();
                    c7868d.f42478l = false;
                    this.f78591A1 = true;
                    this.f78632z1.mo1592Za(c7868d.m40448c());
                    this.f72421L0.mo46829Y();
                    return;
                }
                return;
            }
            this.f78591A1 = false;
            ToastUtils.showMess(this.f72421L0.m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG));
        } catch (RuntimeException unused) {
            this.f78591A1 = false;
            this.f78627u1.setVisibility(0);
        }
    }

    /* renamed from: UM */
    private void m85606UM(View view, boolean z11) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (view instanceof CustomEditText) {
            ((CustomEditText) view).setFocus(z11);
        } else if (view instanceof CustomAutoCompleteTextView) {
            ((CustomAutoCompleteTextView) view).setFocus(z11);
        }
        int id2 = view.getId();
        this.f78595E1 = id2;
        if (z11) {
            float f16 = 0.0f;
            if (id2 == AbstractC6918a0.et_hometown) {
                float m118719j0 = AbstractC23136l9.m118719j0(MainApplication.getAppContext()) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
                float y11 = this.f78598R0.getY();
                if (m118719j0 > y11) {
                    float y12 = (((View) this.f78628v1.get(0)).getY() + m118719j0) - y11;
                    f16 = this.f78597Q0.getLayoutParams().width;
                    f15 = y12;
                } else {
                    f15 = 0.0f;
                }
                ViewGroup.LayoutParams layoutParams = this.f78598R0.getLayoutParams();
                layoutParams.width = (int) f16;
                layoutParams.height = (int) f15;
                this.f78598R0.setLayoutParams(layoutParams);
                return;
            }
            if (id2 == AbstractC6918a0.et_high_school) {
                float m118719j02 = AbstractC23136l9.m118719j0(MainApplication.getAppContext()) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
                float y13 = this.f78598R0.getY();
                if (m118719j02 > y13) {
                    float y14 = (((View) this.f78628v1.get(0)).getY() + m118719j02) - y13;
                    f16 = this.f78597Q0.getLayoutParams().width;
                    f14 = y14;
                } else {
                    f14 = 0.0f;
                }
                ViewGroup.LayoutParams layoutParams2 = this.f78598R0.getLayoutParams();
                layoutParams2.width = (int) f16;
                layoutParams2.height = (int) f14;
                this.f78598R0.setLayoutParams(layoutParams2);
                this.f78597Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdatePersonalInfoView.this.m85597KM();
                    }
                });
                return;
            }
            if (id2 == AbstractC6918a0.et_university) {
                float m118719j03 = AbstractC23136l9.m118719j0(MainApplication.getAppContext()) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
                float y15 = this.f78598R0.getY();
                if (m118719j03 > y15) {
                    float y16 = (((View) this.f78628v1.get(1)).getY() + m118719j03) - y15;
                    f16 = this.f78597Q0.getLayoutParams().width;
                    f13 = y16;
                } else {
                    f13 = 0.0f;
                }
                ViewGroup.LayoutParams layoutParams3 = this.f78598R0.getLayoutParams();
                layoutParams3.width = (int) f16;
                layoutParams3.height = (int) f13;
                this.f78598R0.setLayoutParams(layoutParams3);
                this.f78597Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdatePersonalInfoView.this.m85598LM();
                    }
                });
                return;
            }
            if (id2 == AbstractC6918a0.et_position) {
                float m118719j04 = AbstractC23136l9.m118719j0(MainApplication.getAppContext()) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
                float y17 = this.f78598R0.getY();
                if (m118719j04 > y17) {
                    float y18 = (((View) this.f78628v1.get(2)).getY() + m118719j04) - y17;
                    f16 = this.f78597Q0.getLayoutParams().width;
                    f12 = y18;
                } else {
                    f12 = 0.0f;
                }
                ViewGroup.LayoutParams layoutParams4 = this.f78598R0.getLayoutParams();
                layoutParams4.width = (int) f16;
                layoutParams4.height = (int) f12;
                this.f78598R0.setLayoutParams(layoutParams4);
                this.f78597Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.iw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdatePersonalInfoView.this.m85599MM();
                    }
                });
                return;
            }
            if (id2 == AbstractC6918a0.et_company) {
                float m118719j05 = AbstractC23136l9.m118719j0(MainApplication.getAppContext()) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
                float y19 = this.f78598R0.getY();
                if (m118719j05 > y19) {
                    float y21 = (((View) this.f78628v1.get(3)).getY() + m118719j05) - y19;
                    f16 = this.f78597Q0.getLayoutParams().width;
                    f11 = y21;
                } else {
                    f11 = 0.0f;
                }
                ViewGroup.LayoutParams layoutParams5 = this.f78598R0.getLayoutParams();
                layoutParams5.width = (int) f16;
                layoutParams5.height = (int) f11;
                this.f78598R0.setLayoutParams(layoutParams5);
                this.f78597Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdatePersonalInfoView.this.m85600NM();
                    }
                });
            }
        }
    }

    /* renamed from: BM */
    void m85627BM(int i11) {
        if (this.f72421L0.m92648SI() != null && !this.f72421L0.mo60294yp()) {
            this.f72421L0.removeDialog(i11);
            this.f72421L0.showDialog(i11);
        }
    }

    /* renamed from: C */
    void m85628C() {
        AbstractC2379w.m12430d(this.f78603W0);
        AbstractC2379w.m12430d(this.f78608b1);
        AbstractC2379w.m12430d(this.f78613g1);
        AbstractC2379w.m12430d(this.f78618l1);
        AbstractC2379w.m12430d(this.f78621o1);
    }

    /* renamed from: CM */
    boolean m85629CM() {
        try {
            if (!this.f78618l1.m87732G() && !this.f78621o1.m87732G() && this.f78603W0.getText().toString().equals(this.f78605Y0) && this.f78613g1.getText().toString().equals(this.f78615i1) && this.f78608b1.getText().toString().equals(this.f78610d1)) {
                if (this.f78624r1.getText().toString().equals(this.f78625s1)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_submit_change)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar.m43152a();
    }

    /* renamed from: EM */
    void m85630EM() {
        if (AbstractC23304d.f113368c0 == null) {
            try {
                String m121675Zd = AbstractC23309i.m121675Zd();
                if (!TextUtils.isEmpty(m121675Zd)) {
                    AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null && contactProfile.f42366P == null) {
            String m121700a1 = AbstractC23309i.m121700a1();
            if (!TextUtils.isEmpty(m121700a1)) {
                try {
                    JSONObject jSONObject = new JSONObject(m121700a1);
                    AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d(jSONObject);
                    return;
                } catch (JSONException e12) {
                    AbstractC23350e.m122778h(e12);
                    return;
                }
            }
            if (C23055e5.m118271f()) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15237b());
                c0766k.m1804D(CoreUtility.f89233i);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(0);
            }
            if (actionBarMenu.m92752u(AbstractC6918a0.menu_item_progress) == null) {
                this.f78600T0 = actionBarMenu.m92744k(AbstractC6918a0.menu_item_progress, AbstractC7409c0.holo_circular_progress_bar_abs);
            }
            this.f78600T0.setVisibility(8);
            Button button = (Button) actionBarMenu.m92744k(AbstractC6918a0.option_update_extend_profile, AbstractC7409c0.action_bar_menu_item_blue_text_only);
            this.f78601U0 = button;
            if (button != null) {
                button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved));
                this.f78601U0.setOnClickListener(this);
                this.f78601U0.setEnabled(m85629CM());
            }
        } catch (RuntimeException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) layoutInflater.inflate(AbstractC7409c0.update_personal_info_view, viewGroup, false);
        this.f78596P0 = keyboardFrameLayout;
        keyboardFrameLayout.setOnClickListener(this);
        this.f78596P0.setOnKeyboardListener(new C15236a());
        this.f78597Q0 = (ScrollView) this.f78596P0.findViewById(AbstractC6918a0.root_scroll_view);
        View findViewById = this.f78596P0.findViewById(AbstractC6918a0.empty_view);
        this.f78598R0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f78628v1.add(this.f78596P0.findViewById(AbstractC6918a0.line_hometown));
        this.f78628v1.add(this.f78596P0.findViewById(AbstractC6918a0.line_highSchool));
        this.f78628v1.add(this.f78596P0.findViewById(AbstractC6918a0.line_university));
        this.f78628v1.add(this.f78596P0.findViewById(AbstractC6918a0.line_position));
        this.f78628v1.add(this.f78596P0.findViewById(AbstractC6918a0.line_company));
        for (View view : this.f78628v1) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f78596P0.findViewById(AbstractC6918a0.root_update_hometown);
        this.f78602V0 = relativeLayout;
        relativeLayout.setOnClickListener(this);
        CustomAutoCompleteTextView customAutoCompleteTextView = (CustomAutoCompleteTextView) this.f78596P0.findViewById(AbstractC6918a0.et_hometown);
        this.f78603W0 = customAutoCompleteTextView;
        customAutoCompleteTextView.setOnFocusChangeListener(this);
        this.f78603W0.addTextChangedListener(this);
        this.f78603W0.setOnClickListener(this);
        this.f78603W0.setOnEditorActionListener(this);
        this.f78603W0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.dw0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                UpdatePersonalInfoView.this.m85592FM(adapterView, view2, i11, j11);
            }
        });
        RobotoTextView robotoTextView = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_hometown_error);
        this.f78604X0 = robotoTextView;
        robotoTextView.setVisibility(4);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f78596P0.findViewById(AbstractC6918a0.root_update_high_school);
        this.f78607a1 = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        CustomAutoCompleteTextView customAutoCompleteTextView2 = (CustomAutoCompleteTextView) this.f78596P0.findViewById(AbstractC6918a0.et_high_school);
        this.f78608b1 = customAutoCompleteTextView2;
        customAutoCompleteTextView2.setOnFocusChangeListener(this);
        this.f78608b1.setOnClickListener(this);
        this.f78608b1.addTextChangedListener(this);
        this.f78608b1.setOnEditorActionListener(this);
        this.f78608b1.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.ew0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                UpdatePersonalInfoView.this.m85593GM(adapterView, view2, i11, j11);
            }
        });
        RobotoTextView robotoTextView2 = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_high_school_error);
        this.f78609c1 = robotoTextView2;
        robotoTextView2.setVisibility(8);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f78596P0.findViewById(AbstractC6918a0.root_update_university);
        this.f78612f1 = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        CustomAutoCompleteTextView customAutoCompleteTextView3 = (CustomAutoCompleteTextView) this.f78596P0.findViewById(AbstractC6918a0.et_university);
        this.f78613g1 = customAutoCompleteTextView3;
        customAutoCompleteTextView3.setOnFocusChangeListener(this);
        this.f78613g1.setOnClickListener(this);
        this.f78613g1.addTextChangedListener(this);
        this.f78613g1.setOnEditorActionListener(this);
        this.f78613g1.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.fw0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                UpdatePersonalInfoView.this.m85594HM(adapterView, view2, i11, j11);
            }
        });
        RobotoTextView robotoTextView3 = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_university_error);
        this.f78614h1 = robotoTextView3;
        robotoTextView3.setVisibility(8);
        RelativeLayout relativeLayout4 = (RelativeLayout) this.f78596P0.findViewById(AbstractC6918a0.root_update_position);
        this.f78617k1 = relativeLayout4;
        relativeLayout4.setOnClickListener(this);
        CustomEditText customEditText = (CustomEditText) this.f78596P0.findViewById(AbstractC6918a0.et_position);
        this.f78618l1 = customEditText;
        customEditText.setOnFocusChangeListener(this);
        this.f78618l1.setOnClickListener(this);
        this.f78618l1.addTextChangedListener(this);
        this.f78618l1.setOnEditorActionListener(this);
        RobotoTextView robotoTextView4 = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_position_error);
        this.f78619m1 = robotoTextView4;
        robotoTextView4.setVisibility(8);
        RelativeLayout relativeLayout5 = (RelativeLayout) this.f78596P0.findViewById(AbstractC6918a0.root_update_company);
        this.f78620n1 = relativeLayout5;
        relativeLayout5.setOnClickListener(this);
        CustomEditText customEditText2 = (CustomEditText) this.f78596P0.findViewById(AbstractC6918a0.et_company);
        this.f78621o1 = customEditText2;
        customEditText2.setOnFocusChangeListener(this);
        this.f78621o1.setOnClickListener(this);
        this.f78621o1.addTextChangedListener(this);
        this.f78621o1.setOnEditorActionListener(this);
        RobotoTextView robotoTextView5 = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_company_error);
        this.f78622p1 = robotoTextView5;
        robotoTextView5.setVisibility(8);
        RelativeLayout relativeLayout6 = (RelativeLayout) this.f78596P0.findViewById(AbstractC6918a0.root_update_relationship);
        this.f78623q1 = relativeLayout6;
        relativeLayout6.setOnClickListener(this);
        RobotoTextView robotoTextView6 = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_relationship);
        this.f78624r1 = robotoTextView6;
        robotoTextView6.addTextChangedListener(this);
        RobotoTextView robotoTextView7 = (RobotoTextView) this.f78596P0.findViewById(AbstractC6918a0.tv_general_error);
        this.f78627u1 = robotoTextView7;
        robotoTextView7.setVisibility(8);
        m85630EM();
        m85591DM(AbstractC23304d.f113368c0.f42366P);
        return this.f78596P0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null && interfaceC17463d.mo92862f() == 1) {
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                m85605TM(true);
            } else if (i11 == -2) {
                interfaceC17463d.dismiss();
                this.f72421L0.finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m85628C();
            if (this.f78601U0.isEnabled()) {
                m85627BM(1);
            } else {
                this.f72421L0.finish();
            }
        }
        return true;
    }

    /* renamed from: QM */
    public void m85631QM() {
        this.f78603W0.setFocus(false);
        this.f78608b1.setFocus(false);
        this.f78613g1.setFocus(false);
        this.f78618l1.setFocus(false);
        this.f78621o1.setFocus(false);
        this.f78597Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.kw0
            @Override // java.lang.Runnable
            public final void run() {
                UpdatePersonalInfoView.this.m85595IM();
            }
        });
        this.f78597Q0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.lw0
            @Override // java.lang.Runnable
            public final void run() {
                UpdatePersonalInfoView.this.m85596JM();
            }
        }, 200L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(AbstractC16801x.white);
            this.f88760a0.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.str_update_personal_user_info_title));
            this.f88760a0.m92724v(getContext(), AbstractC16801x.black);
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        Bundle m92642L3;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12 && (m92642L3 = this.f72421L0.m92642L3()) != null) {
            switch (m92642L3.getInt("EXTRA_DATA_FOCUS_FIELD", -1)) {
                case 1:
                    m85602PM(this.f78603W0);
                    return;
                case 2:
                    m85602PM(this.f78608b1);
                    return;
                case 3:
                    m85602PM(this.f78613g1);
                    return;
                case 4:
                    m85602PM(this.f78618l1);
                    return;
                case 5:
                    m85602PM(this.f78621o1);
                    return;
                case 6:
                    onClick(this.f78623q1);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Button button = this.f78601U0;
        if (button != null) {
            button.setEnabled(m85629CM());
        }
        String obj = editable.toString();
        int i11 = this.f78595E1;
        if (i11 == AbstractC6918a0.et_hometown) {
            if (this.f78603W0.isFocused() && !TextUtils.isEmpty(obj)) {
                this.f78606Z0 = true;
                m85603RM(18, obj);
            }
            if (TextUtils.isEmpty(obj)) {
                this.f78604X0.setVisibility(8);
                this.f78603W0.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
                return;
            }
            return;
        }
        if (i11 == AbstractC6918a0.et_high_school) {
            if (TextUtils.isEmpty(obj)) {
                this.f78609c1.setVisibility(8);
                this.f78608b1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
                return;
            } else {
                if (this.f78608b1.isFocused() && !TextUtils.isEmpty(obj)) {
                    this.f78611e1 = true;
                    m85603RM(2, obj);
                    return;
                }
                return;
            }
        }
        if (i11 == AbstractC6918a0.et_university) {
            if (TextUtils.isEmpty(obj)) {
                this.f78614h1.setVisibility(8);
                this.f78613g1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
                return;
            } else {
                if (this.f78613g1.isFocused() && !TextUtils.isEmpty(obj)) {
                    this.f78616j1 = true;
                    m85603RM(3, obj);
                    return;
                }
                return;
            }
        }
        if (i11 == AbstractC6918a0.et_position) {
            if (TextUtils.isEmpty(obj)) {
                this.f78619m1.setVisibility(8);
                this.f78618l1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
                return;
            }
            return;
        }
        if (i11 == AbstractC6918a0.et_company && TextUtils.isEmpty(obj)) {
            this.f78622p1.setVisibility(8);
            this.f78621o1.setBackgroundResource(AbstractC16803z.bg_edit_text_v2);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78590F1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.option_update_extend_profile) {
            m85628C();
            m85605TM(false);
            return;
        }
        if (id2 == AbstractC6918a0.root_update_relationship) {
            AbstractC23647d.m123907q("785006", this.f72829D0);
            m85628C();
            m85604SM();
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 != AbstractC6918a0.et_hometown && id2 != AbstractC6918a0.et_high_school && id2 != AbstractC6918a0.et_university && id2 != AbstractC6918a0.et_position && id2 != AbstractC6918a0.et_company) {
            if (id2 == AbstractC6918a0.root_update_hometown) {
                AbstractC23647d.m123907q("785001", this.f72829D0);
                m85602PM(this.f78603W0);
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.root_update_high_school) {
                AbstractC23647d.m123907q("785002", this.f72829D0);
                m85602PM(this.f78608b1);
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.root_update_university) {
                AbstractC23647d.m123907q("785003", this.f72829D0);
                m85602PM(this.f78613g1);
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.root_update_position) {
                AbstractC23647d.m123907q("785004", this.f72829D0);
                m85602PM(this.f78618l1);
                AbstractC23647d.m123893c();
                return;
            } else if (id2 == AbstractC6918a0.root_update_company) {
                AbstractC23647d.m123907q("785005", this.f72829D0);
                m85602PM(this.f78621o1);
                AbstractC23647d.m123893c();
                return;
            } else if (id2 == AbstractC6918a0.root_bg_main) {
                m85628C();
                return;
            } else {
                if (id2 == AbstractC6918a0.empty_view) {
                    m85628C();
                    return;
                }
                return;
            }
        }
        if (view.getId() == AbstractC6918a0.et_hometown) {
            AbstractC23647d.m123907q("785001", this.f72829D0);
        } else if (view.getId() == AbstractC6918a0.et_high_school) {
            AbstractC23647d.m123907q("785002", this.f72829D0);
        } else if (view.getId() == AbstractC6918a0.et_university) {
            AbstractC23647d.m123907q("785003", this.f72829D0);
        } else if (view.getId() == AbstractC6918a0.et_position) {
            AbstractC23647d.m123907q("785004", this.f72829D0);
        } else if (view.getId() == AbstractC6918a0.et_company) {
            AbstractC23647d.m123907q("785005", this.f72829D0);
        }
        m85606UM(view, true);
        AbstractC23647d.m123893c();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6) {
            try {
                m85628C();
                return true;
            } catch (RuntimeException e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z11) {
        if (view != null) {
            m85606UM(view, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f78601U0.isEnabled()) {
            m85628C();
            m85627BM(1);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
