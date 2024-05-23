package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7178q;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23126l;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import p588vw.C28647m;
import p588vw.C28655u;
import vg.AbstractC28034c7;

/* loaded from: classes6.dex */
public final class CountryListView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: h1 */
    public static final String f73003h1 = "CountryListView";

    /* renamed from: P0 */
    ListView f73004P0;

    /* renamed from: Q0 */
    TextView f73005Q0;

    /* renamed from: R0 */
    MultiStateView f73006R0;

    /* renamed from: S0 */
    EditText f73007S0;

    /* renamed from: T0 */
    View f73008T0;

    /* renamed from: X0 */
    C7178q f73012X0;

    /* renamed from: U0 */
    ArrayList f73009U0 = new ArrayList();

    /* renamed from: V0 */
    ArrayList f73010V0 = new ArrayList();

    /* renamed from: W0 */
    ArrayList f73011W0 = new ArrayList();

    /* renamed from: Y0 */
    int f73013Y0 = -1;

    /* renamed from: Z0 */
    int f73014Z0 = 0;

    /* renamed from: a1 */
    final String f73015a1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: b1 */
    Handler f73016b1 = new Handler();

    /* renamed from: c1 */
    boolean f73017c1 = false;

    /* renamed from: d1 */
    boolean f73018d1 = false;

    /* renamed from: e1 */
    InterfaceC0765j f73019e1 = new C0766k();

    /* renamed from: f1 */
    InterfaceC20094a f73020f1 = new C14195b();

    /* renamed from: g1 */
    ActionBarMenuItem.C17435d f73021g1 = new C14196c();

    /* renamed from: com.zing.zalo.ui.zviews.CountryListView$a */
    /* loaded from: classes6.dex */
    public class C14194a extends AbstractC28034c7 {
        C14194a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            EditText editText;
            if (i11 != 0 && (editText = CountryListView.this.f73007S0) != null && editText.isFocused()) {
                CountryListView.this.f73007S0.clearFocus();
                AbstractC2379w.m12430d(CountryListView.this.f73007S0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CountryListView$b */
    /* loaded from: classes6.dex */
    class C14195b implements InterfaceC20094a {
        C14195b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            CountryListView.this.f73018d1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String string;
            String string2;
            String string3;
            boolean z11;
            CountryListView.this.f73018d1 = false;
            JSONObject jSONObject = (JSONObject) obj;
            new JSONArray();
            new JSONArray();
            try {
                if (!jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    JSONArray jSONArray = jSONObject2.getJSONArray("countries");
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("often_countries");
                    if (jSONArray.length() > 0) {
                        C7960e.m41971c6().m42506q4();
                        CountryListView.this.f73009U0.clear();
                    }
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject3 = (JSONObject) jSONArray.get(i11);
                        if (jSONObject3.isNull("iso_country_code")) {
                            string = "";
                        } else {
                            string = jSONObject3.getString("iso_country_code");
                        }
                        if (jSONObject3.isNull("country_code")) {
                            string2 = "";
                        } else {
                            string2 = jSONObject3.getString("country_code");
                        }
                        if (jSONObject3.isNull("country_name")) {
                            string3 = "";
                        } else {
                            string3 = jSONObject3.getString("country_name");
                        }
                        boolean z12 = true;
                        if (!jSONObject3.isNull("sms") && jSONObject3.getBoolean("sms")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (jSONObject3.isNull("voice") || !jSONObject3.getBoolean("voice")) {
                            z12 = false;
                        }
                        CountryListView.this.f73009U0.add(new C28655u(string3, string, string2, i11, z11, z12));
                    }
                    if (CountryListView.this.f73009U0.size() > 0) {
                        C7960e.m41971c6().m42083C7(CountryListView.this.f73009U0);
                    }
                    CountryListView.this.m79171vM(jSONArray2);
                    AbstractC23309i.m121283Os(jSONArray2.toString());
                    EditText editText = CountryListView.this.f73007S0;
                    if (editText != null && !TextUtils.isEmpty(editText.getText())) {
                        CountryListView countryListView = CountryListView.this;
                        countryListView.m79166lM(countryListView.f73007S0.getText().toString());
                    } else {
                        CountryListView.this.m79172wM();
                    }
                    AbstractC23309i.m121885ey(System.currentTimeMillis());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CountryListView$c */
    /* loaded from: classes6.dex */
    class C14196c extends ActionBarMenuItem.C17435d {
        C14196c() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            CountryListView.this.m79166lM(editText.getText().toString());
            if (TextUtils.isEmpty(editText.getText())) {
                CountryListView.this.f73008T0.setVisibility(8);
            } else {
                CountryListView.this.f73008T0.setVisibility(0);
            }
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m79161qM() {
        this.f73006R0.setEmptyViewString(m92652XI(AbstractC8020f0.str_emptyResult));
        m79173xM(false);
        if (this.f73014Z0 > 0) {
            this.f73005Q0.setText(this.f73014Z0 + m92652XI(AbstractC8020f0.str_refix_number_of_country));
        }
        this.f73012X0.m36476b(this.f73011W0);
        this.f73012X0.notifyDataSetChanged();
    }

    /* renamed from: rM */
    public /* synthetic */ void m79162rM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            EditText editText = this.f73007S0;
            if (editText != null) {
                AbstractC2379w.m12430d(editText);
            }
            int headerViewsCount = i11 - this.f73004P0.getHeaderViewsCount();
            this.f73013Y0 = headerViewsCount;
            C28655u c28655u = (C28655u) this.f73011W0.get(headerViewsCount);
            if (!this.f73017c1) {
                AbstractC23309i.m121870ej(c28655u.f132865c);
                AbstractC23309i.m122587xp(c28655u.f132864b);
                AbstractC20887g.m109229g(125030, 125037, c28655u.f132864b);
                AbstractC23309i.m122669zx(3);
                this.f73016b1.postDelayed(this.f88750Q, 300L);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_COUNTRY_CODE", c28655u.f132865c);
            intent.putExtra("EXTRA_RESULT_ISO_COUNTRY_CODE", c28655u.f132864b);
            this.f72421L0.mo50035CK(-1, intent);
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122775e(f73003h1, "countryList", e11);
        }
    }

    /* renamed from: sM */
    public /* synthetic */ void m79163sM() {
        ArrayList m42339a7 = C7960e.m41971c6().m42339a7();
        this.f73009U0 = m42339a7;
        if (!m42339a7.isEmpty()) {
            m79172wM();
        }
        m79168nM();
    }

    /* renamed from: tM */
    public /* synthetic */ void m79164tM() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.m92723u("");
        }
    }

    /* renamed from: uM */
    public /* synthetic */ void m79165uM(ArrayList arrayList) {
        if (this.f73010V0.isEmpty()) {
            arrayList.addAll(0, m79167mM());
        } else {
            ArrayList arrayList2 = this.f73010V0;
            ((C28655u) arrayList2.get(arrayList2.size() - 1)).f132871i = true;
            arrayList.addAll(0, this.f73010V0);
        }
        this.f73011W0 = arrayList;
        this.f73006R0.setEmptyViewString(m92652XI(AbstractC8020f0.empty_list));
        m79173xM(false);
        if (this.f73011W0.size() > 0) {
            this.f73005Q0.setText(this.f73014Z0 + m92652XI(AbstractC8020f0.str_refix_number_of_country));
        }
        this.f73012X0.m36476b(this.f73011W0);
        this.f73012X0.notifyDataSetChanged();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f73017c1 = m92642L3.getBoolean("EXTRA_DISCARD");
            }
            m92637BK(true);
            AbstractC23126l.m118627a(f73003h1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(0, 0);
            m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            m92738e.m92767A(this.f73021g1);
            EditText searchField = m92738e.getSearchField();
            this.f73007S0 = searchField;
            if (searchField != null) {
                searchField.setEllipsize(TextUtils.TruncateAt.END);
                this.f73007S0.setHintTextColor(AbstractC1388a.m6961c(this.f72421L0.m92648SI(), AbstractC16801x.white_50));
                this.f73007S0.setTextColor(AbstractC1388a.m6961c(this.f72421L0.m92648SI(), AbstractC16801x.white));
                EditText editText = this.f73007S0;
                if (editText != null) {
                    editText.setHint(m92652XI(AbstractC8020f0.hint_default_search));
                }
                View clearButton = m92738e.getClearButton();
                this.f73008T0 = clearButton;
                if (clearButton != null) {
                    clearButton.setVisibility(8);
                }
                if (this.f73007S0.getParent() != null) {
                    ((View) this.f73007S0.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.country_code_list_view, viewGroup, false);
        m79170pM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                EditText editText = this.f73007S0;
                if (editText != null) {
                    AbstractC2379w.m12430d(editText);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if ((!z12 || this.f72421L0.m92683qJ()) && this.f72421L0.m92656bJ() != null) {
                this.f72421L0.m92656bJ().post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ia
                    public /* synthetic */ RunnableC15729ia() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CountryListView.this.m79164tM();
                    }
                });
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f73003h1;
    }

    /* renamed from: lM */
    public void m79166lM(String str) {
        char charAt;
        try {
            if (this.f73012X0 != null) {
                ArrayList arrayList = new ArrayList();
                this.f73014Z0 = 0;
                ArrayList arrayList2 = this.f73011W0;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                if (str != null && !str.equals("")) {
                    String m120002o = AbstractC23262x6.m120002o(str);
                    ArrayList arrayList3 = this.f73009U0;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        Iterator it = this.f73009U0.iterator();
                        while (it.hasNext()) {
                            C28655u c28655u = (C28655u) it.next();
                            if (AbstractC23262x6.m119986U(m120002o, c28655u.f132863a)) {
                                arrayList.add(c28655u);
                            }
                        }
                    }
                    int i11 = -1;
                    int i12 = 0;
                    int i13 = 0;
                    boolean z11 = false;
                    while (i12 < arrayList.size()) {
                        C28655u c28655u2 = (C28655u) arrayList.get(i12);
                        char charAt2 = AbstractC23262x6.m120002o(c28655u2.f132863a).trim().toUpperCase().charAt(0);
                        int i14 = i11 + 1;
                        if (i14 != 0) {
                            try {
                                charAt = AbstractC23262x6.m120002o(((C28655u) arrayList.get(i13)).f132863a).trim().toUpperCase().charAt(0);
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                            if (this.f73015a1.indexOf(charAt) != -1) {
                                if (charAt2 > charAt && this.f73015a1.indexOf(charAt2) != -1) {
                                    C28655u c28655u3 = new C28655u("" + charAt2, "", "", -1, false, false);
                                    c28655u3.f132867e = false;
                                    this.f73011W0.add(c28655u3);
                                    if (arrayList.get(i13) != null) {
                                        ((C28655u) arrayList.get(i13)).f132871i = true;
                                    }
                                }
                                c28655u2.f132870h = z11;
                                this.f73011W0.add(c28655u2);
                                this.f73014Z0++;
                                i13 = i12;
                                i12++;
                                i11 = i14;
                            } else if (this.f73015a1.indexOf(charAt2) != -1) {
                                C28655u c28655u4 = new C28655u("" + charAt2, "", "", -1, false, false);
                                c28655u4.f132867e = false;
                                this.f73011W0.add(c28655u4);
                            } else {
                                c28655u2.f132870h = z11;
                                this.f73011W0.add(c28655u2);
                                this.f73014Z0++;
                                i13 = i12;
                                i12++;
                                i11 = i14;
                            }
                        } else if (this.f73015a1.indexOf(charAt2) == -1) {
                            C28655u c28655u5 = new C28655u("#", "", "", -1, false, false);
                            c28655u5.f132867e = false;
                            this.f73011W0.add(c28655u5);
                        } else {
                            C28655u c28655u6 = new C28655u("" + charAt2, "", "", -1, false, false);
                            c28655u6.f132867e = false;
                            this.f73011W0.add(c28655u6);
                        }
                        z11 = true;
                        c28655u2.f132870h = z11;
                        this.f73011W0.add(c28655u2);
                        this.f73014Z0++;
                        i13 = i12;
                        i12++;
                        i11 = i14;
                    }
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ga
                        public /* synthetic */ RunnableC15655ga() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            CountryListView.this.m79161qM();
                        }
                    });
                    return;
                }
                m79172wM();
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: mM */
    public ArrayList m79167mM() {
        ArrayList arrayList = new ArrayList();
        C28655u c28655u = new C28655u("Vietnam", "VN", "84", -1, true, true);
        c28655u.f132871i = true;
        arrayList.add(c28655u);
        return arrayList;
    }

    /* renamed from: nM */
    void m79168nM() {
        if (this.f73018d1) {
            return;
        }
        this.f73018d1 = true;
        this.f73019e1.mo1704o8(this.f73020f1);
        this.f73019e1.mo1482M4(AbstractC23309i.m121704a5(), true);
    }

    /* renamed from: oM */
    void m79169oM() {
        this.f73004P0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.ea
            public /* synthetic */ C15581ea() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                CountryListView.this.m79162rM(adapterView, view, i11, j11);
            }
        });
        this.f73004P0.setOnScrollListener(new C14194a());
        try {
            this.f73009U0 = C28647m.m143325c().m143327a();
            String m122199n8 = AbstractC23309i.m122199n8();
            if (!TextUtils.isEmpty(m122199n8)) {
                m79171vM(new JSONArray(m122199n8));
            }
            if (!this.f73009U0.isEmpty()) {
                m79172wM();
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.fa
                public /* synthetic */ RunnableC15618fa() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CountryListView.this.m79163sM();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72421L0.m92676n2().mo35554O(19);
    }

    /* renamed from: pM */
    void m79170pM(View view) {
        ListView listView = (ListView) view.findViewById(AbstractC6918a0.lv_country_code);
        this.f73004P0 = listView;
        listView.setFastScrollEnabled(true);
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) this.f72421L0.m92648SI().getSystemService("layout_inflater")).inflate(AbstractC7409c0.friend_count_row, (ViewGroup) null, false);
        TextView textView = (TextView) linearLayout.findViewById(AbstractC6918a0.num_friend);
        this.f73005Q0 = textView;
        textView.setClickable(false);
        this.f73004P0.addFooterView(linearLayout, null, false);
        C7178q c7178q = new C7178q(this.f72421L0.m92648SI(), this.f73011W0);
        this.f73012X0 = c7178q;
        this.f73004P0.setAdapter((ListAdapter) c7178q);
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f73006R0 = multiStateView;
        multiStateView.setEmptyViewString(m92652XI(AbstractC8020f0.empty_list));
        this.f73006R0.setLoadingString(m92652XI(AbstractC8020f0.loading));
    }

    /* renamed from: vM */
    public ArrayList m79171vM(JSONArray jSONArray) {
        String string;
        String string2;
        String string3;
        boolean z11;
        boolean z12;
        try {
            this.f73010V0.clear();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i11);
                if (jSONObject.isNull("iso_country_code")) {
                    string = "";
                } else {
                    string = jSONObject.getString("iso_country_code");
                }
                if (jSONObject.isNull("country_code")) {
                    string2 = "";
                } else {
                    string2 = jSONObject.getString("country_code");
                }
                if (jSONObject.isNull("country_name")) {
                    string3 = "";
                } else {
                    string3 = jSONObject.getString("country_name");
                }
                if (!jSONObject.isNull("sms") && jSONObject.getBoolean("sms")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!jSONObject.isNull("voice") && jSONObject.getBoolean("voice")) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f73010V0.add(new C28655u(string3, string, string2, i11, z11, z12));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return this.f73010V0;
    }

    /* renamed from: wM */
    public void m79172wM() {
        InterfaceC27218a m92676n2;
        RunnableC15692ha runnableC15692ha;
        boolean z11;
        char charAt;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                this.f73014Z0 = 0;
                int size = this.f73009U0.size();
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                while (i12 < size) {
                    C28655u c28655u = (C28655u) this.f73009U0.get(i12);
                    char charAt2 = AbstractC23262x6.m120002o(c28655u.f132863a).trim().toUpperCase().charAt(0);
                    int i14 = i11 + 1;
                    if (i14 != 0) {
                        try {
                            charAt = AbstractC23262x6.m120002o(((C28655u) this.f73009U0.get(i13)).f132863a).trim().toUpperCase().charAt(0);
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                        if (this.f73015a1.indexOf(charAt) != -1) {
                            if (charAt2 > charAt && this.f73015a1.indexOf(charAt2) != -1) {
                                C28655u c28655u2 = new C28655u("" + charAt2, "", "", -1, false, false);
                                c28655u2.f132867e = false;
                                if (this.f73009U0.get(i13) != null) {
                                    ((C28655u) this.f73009U0.get(i13)).f132871i = true;
                                }
                                arrayList.add(c28655u2);
                            }
                            z11 = false;
                            c28655u.f132870h = z11;
                            arrayList.add(c28655u);
                            this.f73014Z0++;
                            i13 = i12;
                            i12++;
                            i11 = i14;
                        } else {
                            if (this.f73015a1.indexOf(charAt2) != -1) {
                                C28655u c28655u3 = new C28655u("" + charAt2, "", "", -1, false, false);
                                c28655u3.f132867e = false;
                                arrayList.add(c28655u3);
                            }
                            z11 = false;
                            c28655u.f132870h = z11;
                            arrayList.add(c28655u);
                            this.f73014Z0++;
                            i13 = i12;
                            i12++;
                            i11 = i14;
                        }
                    } else if (this.f73015a1.indexOf(charAt2) == -1) {
                        C28655u c28655u4 = new C28655u("#", "", "", -1, false, false);
                        c28655u4.f132867e = false;
                        arrayList.add(c28655u4);
                    } else {
                        C28655u c28655u5 = new C28655u("" + charAt2, "", "", -1, false, false);
                        c28655u5.f132867e = false;
                        arrayList.add(c28655u5);
                    }
                    z11 = true;
                    c28655u.f132870h = z11;
                    arrayList.add(c28655u);
                    this.f73014Z0++;
                    i13 = i12;
                    i12++;
                    i11 = i14;
                }
                m92676n2 = this.f72421L0.m92676n2();
                runnableC15692ha = new Runnable() { // from class: com.zing.zalo.ui.zviews.ha

                    /* renamed from: q */
                    public final /* synthetic */ ArrayList f80566q;

                    public /* synthetic */ RunnableC15692ha(ArrayList arrayList2) {
                        r2 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CountryListView.this.m79165uM(r2);
                    }
                };
            } catch (Throwable th2) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ha

                    /* renamed from: q */
                    public final /* synthetic */ ArrayList f80566q;

                    public /* synthetic */ RunnableC15692ha(ArrayList arrayList2) {
                        r2 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CountryListView.this.m79165uM(r2);
                    }
                });
                throw th2;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            m92676n2 = this.f72421L0.m92676n2();
            runnableC15692ha = new Runnable() { // from class: com.zing.zalo.ui.zviews.ha

                /* renamed from: q */
                public final /* synthetic */ ArrayList f80566q;

                public /* synthetic */ RunnableC15692ha(ArrayList arrayList2) {
                    r2 = arrayList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CountryListView.this.m79165uM(r2);
                }
            };
        }
        m92676n2.runOnUiThread(runnableC15692ha);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m79169oM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    void m79173xM(boolean z11) {
        if (z11) {
            this.f73004P0.setVisibility(8);
            this.f73005Q0.setVisibility(8);
            this.f73006R0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f73006R0.setVisibility(0);
            return;
        }
        if (this.f73014Z0 > 0) {
            this.f73005Q0.setVisibility(0);
            this.f73006R0.setVisibility(8);
            this.f73004P0.setVisibility(0);
        } else {
            this.f73004P0.setVisibility(8);
            this.f73005Q0.setVisibility(8);
            this.f73006R0.setState(MultiStateView.EnumC15914e.EMPTY);
            this.f73006R0.setVisibility(0);
        }
    }
}
