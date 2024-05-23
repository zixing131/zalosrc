package com.zing.zalo.register.enterphonenumber;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.register.enterphonenumber.SelectCountryView;
import com.zing.zalo.zdesign.component.SearchField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import cz.C17667v0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import me0.AbstractC23262x6;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p143ez.C18652b0;
import p227i3.C20215s;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import p588vw.C28647m;
import p588vw.C28655u;
import p649xl.C29749cb;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class SelectCountryView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29749cb f49414P0;

    /* renamed from: Q0 */
    private C18652b0 f49415Q0 = new C18652b0();

    /* renamed from: R0 */
    private ArrayList f49416R0 = new ArrayList();

    /* renamed from: S0 */
    private ArrayList f49417S0 = new ArrayList();

    /* renamed from: T0 */
    private ArrayList f49418T0 = new ArrayList();

    /* renamed from: U0 */
    private C28655u f49419U0;

    /* renamed from: V0 */
    private final String f49420V0;

    /* renamed from: W0 */
    private boolean f49421W0;

    /* renamed from: X0 */
    private int f49422X0;

    /* renamed from: com.zing.zalo.register.enterphonenumber.SelectCountryView$a */
    /* loaded from: classes4.dex */
    public static final class C9323a implements InterfaceC20094a {
        C9323a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            SelectCountryView.this.m50175xM(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            SelectCountryView.this.m50175xM(false);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                if (!jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    JSONArray jSONArray = jSONObject2.getJSONArray("countries");
                    AbstractC19074t.m100207e(jSONArray, "getJSONArray(...)");
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("often_countries");
                    AbstractC19074t.m100207e(jSONArray2, "getJSONArray(...)");
                    if (jSONArray.length() > 0) {
                        C7960e.m41971c6().m42506q4();
                        SelectCountryView.this.m50171oM().clear();
                    }
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj2 = jSONArray.get(i11);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        SelectCountryView.this.m50171oM().add(SelectCountryView.this.m50168tM((JSONObject) obj2, i11));
                    }
                    if (SelectCountryView.this.m50171oM().size() > 0) {
                        C7960e.m41971c6().m42083C7(SelectCountryView.this.m50171oM());
                    }
                    SelectCountryView.this.m50173uM(jSONArray2);
                    AbstractC23309i.m121283Os(jSONArray2.toString());
                    C29749cb c29749cb = SelectCountryView.this.f49414P0;
                    C29749cb c29749cb2 = null;
                    if (c29749cb == null) {
                        AbstractC19074t.m100223u("binding");
                        c29749cb = null;
                    }
                    if (!TextUtils.isEmpty(c29749cb.f137429s.getEditText().getText())) {
                        SelectCountryView selectCountryView = SelectCountryView.this;
                        C29749cb c29749cb3 = selectCountryView.f49414P0;
                        if (c29749cb3 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c29749cb2 = c29749cb3;
                        }
                        selectCountryView.m50170lM(String.valueOf(c29749cb2.f137429s.getEditText().getText()));
                    } else {
                        SelectCountryView.this.m50174vM();
                    }
                    AbstractC23309i.m121885ey(System.currentTimeMillis());
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.SelectCountryView$b */
    /* loaded from: classes4.dex */
    public static final class C9324b implements TextWatcher {

        /* renamed from: q */
        final /* synthetic */ SearchField f49425q;

        C9324b(SearchField searchField) {
            this.f49425q = searchField;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
            SelectCountryView.this.m50170lM(String.valueOf(this.f49425q.getEditText().getText()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.register.enterphonenumber.SelectCountryView$c */
    /* loaded from: classes4.dex */
    public static final class C9325c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ RecyclerView f49426q;

        /* renamed from: r */
        final /* synthetic */ SelectCountryView f49427r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9325c(RecyclerView recyclerView, SelectCountryView selectCountryView) {
            super(1);
            this.f49426q = recyclerView;
            this.f49427r = selectCountryView;
        }

        /* renamed from: a */
        public final void m50177a(C28655u c28655u) {
            AbstractC19074t.m100208f(c28655u, "it");
            AbstractC23309i.m121870ej(c28655u.f132865c);
            AbstractC23309i.m122587xp(c28655u.f132864b);
            AbstractC23309i.m122669zx(3);
            AbstractC20887g.m109229g(125030, 125034, c28655u.f132864b);
            this.f49426q.postDelayed(this.f49427r.f88750Q, 300L);
            C17667v0.f89659a.m93647d(this.f49427r.m92676n2());
            SelectCountryView selectCountryView = this.f49427r;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_SELECTED_COUNTRY", c28655u.m143390a());
            C24848g0 c24848g0 = C24848g0.f119245a;
            selectCountryView.mo50035CK(-1, intent);
            this.f49427r.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m50177a((C28655u) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.SelectCountryView$d */
    /* loaded from: classes4.dex */
    public static final class C9326d extends ZdsActionBar.AbstractC16987c {
        C9326d() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            super.mo39914b();
            C17667v0.f89659a.m93647d(SelectCountryView.this.m92676n2());
            SelectCountryView.this.finish();
        }
    }

    public SelectCountryView() {
        String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_alphabe);
        AbstractC19074t.m100207e(string, "getString(...)");
        this.f49420V0 = string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m50163mM(SelectCountryView selectCountryView) {
        AbstractC19074t.m100208f(selectCountryView, "this$0");
        C29749cb c29749cb = selectCountryView.f49414P0;
        if (c29749cb == null) {
            AbstractC19074t.m100223u("binding");
            c29749cb = null;
        }
        c29749cb.f137427q.setEmptyViewString(selectCountryView.m92652XI(AbstractC8020f0.str_emptyResult));
        selectCountryView.m50176yM(false);
        selectCountryView.f49415Q0.m98578S(selectCountryView.f49418T0);
    }

    /* renamed from: nM */
    private final ArrayList m50164nM() {
        ArrayList arrayList = new ArrayList();
        C28655u c28655u = new C28655u("Vietnam", "VN", "84", -1, true, true);
        c28655u.f132871i = true;
        C28655u c28655u2 = this.f49419U0;
        if (c28655u2 != null) {
            AbstractC19074t.m100204b(c28655u.f132865c, c28655u2.f132865c);
        }
        arrayList.add(c28655u);
        return arrayList;
    }

    /* renamed from: qM */
    private final void m50165qM() {
        try {
            ArrayList m143327a = C28647m.m143325c().m143327a();
            AbstractC19074t.m100207e(m143327a, "getICCS(...)");
            this.f49416R0 = m143327a;
            String m122199n8 = AbstractC23309i.m122199n8();
            if (!TextUtils.isEmpty(m122199n8)) {
                m50173uM(new JSONArray(m122199n8));
            }
            if (!this.f49416R0.isEmpty()) {
                m50174vM();
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ez.c0
                @Override // java.lang.Runnable
                public final void run() {
                    SelectCountryView.m50166rM(SelectCountryView.this);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m50166rM(SelectCountryView selectCountryView) {
        AbstractC19074t.m100208f(selectCountryView, "this$0");
        ArrayList m42339a7 = C7960e.m41971c6().m42339a7();
        AbstractC19074t.m100207e(m42339a7, "getSupportedCountryList(...)");
        selectCountryView.f49416R0 = m42339a7;
        if (!m42339a7.isEmpty()) {
            selectCountryView.m50174vM();
        }
        selectCountryView.m50172pM();
    }

    /* renamed from: sM */
    private final void m50167sM() {
        C29749cb c29749cb = this.f49414P0;
        C29749cb c29749cb2 = null;
        if (c29749cb == null) {
            AbstractC19074t.m100223u("binding");
            c29749cb = null;
        }
        SearchField searchField = c29749cb.f137429s;
        searchField.m90619J(true);
        searchField.getEditText().addTextChangedListener(new C9324b(searchField));
        C29749cb c29749cb3 = this.f49414P0;
        if (c29749cb3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29749cb2 = c29749cb3;
        }
        RecyclerView recyclerView = c29749cb2.f137428r;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.f49415Q0);
        this.f49415Q0.m98577R(new C9325c(recyclerView, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public final C28655u m50168tM(JSONObject jSONObject, int i11) {
        String optString = jSONObject.optString("iso_country_code", "");
        String optString2 = jSONObject.optString("country_code", "");
        C28655u c28655u = new C28655u(jSONObject.optString("country_name", ""), optString, optString2, i11, jSONObject.optBoolean("sms", false), jSONObject.optBoolean("voice", false));
        C28655u c28655u2 = this.f49419U0;
        if (c28655u2 != null && AbstractC19074t.m100204b(optString2, c28655u2.f132865c)) {
            c28655u.f132872j = true;
        }
        return c28655u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m50169wM(SelectCountryView selectCountryView, ArrayList arrayList) {
        AbstractC19074t.m100208f(selectCountryView, "this$0");
        AbstractC19074t.m100208f(arrayList, "$itemHeadersTemp");
        if (selectCountryView.f49417S0.isEmpty()) {
            arrayList.addAll(0, selectCountryView.m50164nM());
        } else {
            ArrayList arrayList2 = selectCountryView.f49417S0;
            ((C28655u) arrayList2.get(arrayList2.size() - 1)).f132871i = true;
            arrayList.addAll(0, selectCountryView.f49417S0);
        }
        selectCountryView.f49418T0 = arrayList;
        C29749cb c29749cb = selectCountryView.f49414P0;
        if (c29749cb == null) {
            AbstractC19074t.m100223u("binding");
            c29749cb = null;
        }
        c29749cb.f137427q.setEmptyViewString(selectCountryView.m92652XI(AbstractC8020f0.empty_list));
        selectCountryView.m50176yM(false);
        selectCountryView.f49415Q0.m98578S(selectCountryView.f49418T0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String string;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (string = m92642L3.getString("icc")) != null) {
            this.f49419U0 = new C28655u(new JSONObject(string));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29749cb m147817c = C29749cb.m147817c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147817c, "inflate(...)");
        this.f49414P0 = m147817c;
        m50167sM();
        C29749cb c29749cb = this.f49414P0;
        if (c29749cb == null) {
            AbstractC19074t.m100223u("binding");
            c29749cb = null;
        }
        LinearLayout root = c29749cb.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C9326d());
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SelectCountryView";
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x024e A[Catch: Exception -> 0x004d, TryCatch #2 {Exception -> 0x004d, blocks: (B:3:0x000a, B:5:0x0019, B:8:0x0023, B:10:0x002f, B:11:0x0035, B:13:0x003b, B:16:0x0049, B:21:0x0050, B:23:0x005a, B:28:0x007e, B:34:0x0093, B:43:0x009a, B:46:0x009d, B:57:0x0248, B:59:0x024e, B:61:0x0258, B:63:0x025b, B:68:0x0243, B:137:0x0271, B:139:0x0277, B:143:0x0280), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025b A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: lM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m50170lM(String str) {
        String str2;
        int i11;
        char charAt;
        int m127172a0;
        int m127172a02;
        int m127172a03;
        int i12;
        boolean z11;
        C28655u c28655u;
        int m127172a04;
        int i13;
        boolean z12;
        String str3 = "convertSignToNoSign(...)";
        try {
            ArrayList arrayList = new ArrayList();
            this.f49422X0 = 0;
            this.f49418T0.clear();
            if (str != null && !AbstractC19074t.m100204b(str, "")) {
                String m120002o = AbstractC23262x6.m120002o(str);
                if (this.f49416R0.size() > 0) {
                    Iterator it = this.f49416R0.iterator();
                    while (it.hasNext()) {
                        C28655u c28655u2 = (C28655u) it.next();
                        if (AbstractC23262x6.m119986U(m120002o, c28655u2.f132863a)) {
                            arrayList.add(c28655u2);
                        }
                    }
                }
                int size = arrayList.size();
                int i14 = -1;
                int i15 = 0;
                boolean z13 = false;
                for (int i16 = 0; i16 < size; i16++) {
                    C28655u c28655u3 = (C28655u) arrayList.get(i16);
                    AbstractC19074t.m100205c(c28655u3);
                    String m120002o2 = AbstractC23262x6.m120002o(c28655u3.f132863a);
                    AbstractC19074t.m100207e(m120002o2, str3);
                    int length = m120002o2.length() - 1;
                    int i17 = 0;
                    boolean z14 = false;
                    while (i17 <= length) {
                        if (!z14) {
                            i13 = i17;
                        } else {
                            i13 = length;
                        }
                        if (AbstractC19074t.m100209g(m120002o2.charAt(i13), 32) <= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z14) {
                            if (!z12) {
                                z14 = true;
                            } else {
                                i17++;
                            }
                        } else if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String obj = m120002o2.subSequence(i17, length + 1).toString();
                    Locale locale = Locale.getDefault();
                    AbstractC19074t.m100207e(locale, "getDefault(...)");
                    String upperCase = obj.toUpperCase(locale);
                    AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                    char charAt2 = upperCase.charAt(0);
                    int i18 = i14 + 1;
                    if (i18 != 0) {
                        try {
                            Object obj2 = arrayList.get(i15);
                            AbstractC19074t.m100205c(obj2);
                            String m120002o3 = AbstractC23262x6.m120002o(((C28655u) obj2).f132863a);
                            AbstractC19074t.m100207e(m120002o3, str3);
                            int length2 = m120002o3.length() - 1;
                            boolean z15 = false;
                            int i19 = 0;
                            while (true) {
                                str2 = str3;
                                if (i19 <= length2) {
                                    if (!z15) {
                                        i12 = i19;
                                    } else {
                                        i12 = length2;
                                    }
                                    try {
                                        i11 = size;
                                        try {
                                            if (AbstractC19074t.m100209g(m120002o3.charAt(i12), 32) <= 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (!z15) {
                                                if (!z11) {
                                                    str3 = str2;
                                                    size = i11;
                                                    z15 = true;
                                                } else {
                                                    i19++;
                                                }
                                            } else if (!z11) {
                                                break;
                                            } else {
                                                length2--;
                                            }
                                            str3 = str2;
                                            size = i11;
                                        } catch (Exception e11) {
                                            e = e11;
                                            AbstractC20110a.f98889a.mo104552e(e);
                                            c28655u3.f132870h = z13;
                                            c28655u = this.f49419U0;
                                            if (c28655u == null) {
                                            }
                                            this.f49418T0.add(c28655u3);
                                            this.f49422X0++;
                                            i15 = i16;
                                            i14 = i18;
                                            str3 = str2;
                                            size = i11;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        i11 = size;
                                        AbstractC20110a.f98889a.mo104552e(e);
                                        c28655u3.f132870h = z13;
                                        c28655u = this.f49419U0;
                                        if (c28655u == null) {
                                        }
                                        this.f49418T0.add(c28655u3);
                                        this.f49422X0++;
                                        i15 = i16;
                                        i14 = i18;
                                        str3 = str2;
                                        size = i11;
                                    }
                                } else {
                                    i11 = size;
                                    break;
                                }
                            }
                            String obj3 = m120002o3.subSequence(i19, length2 + 1).toString();
                            Locale locale2 = Locale.getDefault();
                            AbstractC19074t.m100207e(locale2, "getDefault(...)");
                            String upperCase2 = obj3.toUpperCase(locale2);
                            AbstractC19074t.m100207e(upperCase2, "toUpperCase(...)");
                            charAt = upperCase2.charAt(0);
                            m127172a0 = AbstractC24342w.m127172a0(this.f49420V0, charAt, 0, false, 6, null);
                        } catch (Exception e13) {
                            e = e13;
                            str2 = str3;
                        }
                        if (m127172a0 == -1) {
                            m127172a02 = AbstractC24342w.m127172a0(this.f49420V0, charAt2, 0, false, 6, null);
                            if (m127172a02 != -1) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(charAt2);
                                C28655u c28655u4 = new C28655u(sb2.toString(), "", "", -1, false, false);
                                c28655u4.f132867e = false;
                                this.f49418T0.add(c28655u4);
                            }
                            c28655u3.f132870h = z13;
                            c28655u = this.f49419U0;
                            if (c28655u == null) {
                                c28655u3.f132872j = true;
                            }
                            this.f49418T0.add(c28655u3);
                            this.f49422X0++;
                            i15 = i16;
                            i14 = i18;
                            str3 = str2;
                            size = i11;
                        } else {
                            if (AbstractC19074t.m100209g(charAt2, charAt) > 0) {
                                m127172a03 = AbstractC24342w.m127172a0(this.f49420V0, charAt2, 0, false, 6, null);
                                if (m127172a03 != -1) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(charAt2);
                                    C28655u c28655u5 = new C28655u(sb3.toString(), "", "", -1, false, false);
                                    c28655u5.f132867e = false;
                                    this.f49418T0.add(c28655u5);
                                    if (arrayList.get(i15) != null) {
                                        Object obj4 = arrayList.get(i15);
                                        AbstractC19074t.m100205c(obj4);
                                        ((C28655u) obj4).f132871i = true;
                                    }
                                }
                            }
                            c28655u3.f132870h = z13;
                            c28655u = this.f49419U0;
                            if (c28655u == null && AbstractC19074t.m100204b(c28655u3.f132865c, c28655u.f132865c)) {
                                c28655u3.f132872j = true;
                            }
                            this.f49418T0.add(c28655u3);
                            this.f49422X0++;
                            i15 = i16;
                            i14 = i18;
                            str3 = str2;
                            size = i11;
                        }
                        z13 = true;
                        c28655u3.f132870h = z13;
                        c28655u = this.f49419U0;
                        if (c28655u == null) {
                        }
                        this.f49418T0.add(c28655u3);
                        this.f49422X0++;
                        i15 = i16;
                        i14 = i18;
                        str3 = str2;
                        size = i11;
                    } else {
                        str2 = str3;
                        i11 = size;
                        m127172a04 = AbstractC24342w.m127172a0(this.f49420V0, charAt2, 0, false, 6, null);
                        if (m127172a04 == -1) {
                            try {
                                C28655u c28655u6 = new C28655u("#", "", "", -1, false, false);
                                c28655u6.f132867e = false;
                                this.f49418T0.add(c28655u6);
                            } catch (Exception e14) {
                                e = e14;
                                AbstractC20110a.f98889a.mo104552e(e);
                                c28655u3.f132870h = z13;
                                c28655u = this.f49419U0;
                                if (c28655u == null) {
                                }
                                this.f49418T0.add(c28655u3);
                                this.f49422X0++;
                                i15 = i16;
                                i14 = i18;
                                str3 = str2;
                                size = i11;
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(charAt2);
                            C28655u c28655u7 = new C28655u(sb4.toString(), "", "", -1, false, false);
                            try {
                                c28655u7.f132867e = false;
                                this.f49418T0.add(c28655u7);
                                z13 = true;
                            } catch (Exception e15) {
                                e = e15;
                                AbstractC20110a.f98889a.mo104552e(e);
                                c28655u3.f132870h = z13;
                                c28655u = this.f49419U0;
                                if (c28655u == null) {
                                }
                                this.f49418T0.add(c28655u3);
                                this.f49422X0++;
                                i15 = i16;
                                i14 = i18;
                                str3 = str2;
                                size = i11;
                            }
                            c28655u3.f132870h = z13;
                            c28655u = this.f49419U0;
                            if (c28655u == null) {
                            }
                            this.f49418T0.add(c28655u3);
                            this.f49422X0++;
                            i15 = i16;
                            i14 = i18;
                            str3 = str2;
                            size = i11;
                        }
                    }
                    z13 = true;
                    c28655u3.f132870h = z13;
                    c28655u = this.f49419U0;
                    if (c28655u == null) {
                    }
                    this.f49418T0.add(c28655u3);
                    this.f49422X0++;
                    i15 = i16;
                    i14 = i18;
                    str3 = str2;
                    size = i11;
                }
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    m92676n2.runOnUiThread(new Runnable() { // from class: ez.d0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SelectCountryView.m50163mM(SelectCountryView.this);
                        }
                    });
                    return;
                }
                return;
            }
            m50174vM();
        } catch (Exception e16) {
            AbstractC20110a.f98889a.mo104552e(e16);
        }
    }

    /* renamed from: oM */
    public final ArrayList m50171oM() {
        return this.f49416R0;
    }

    /* renamed from: pM */
    public final void m50172pM() {
        if (this.f49421W0) {
            return;
        }
        this.f49421W0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9323a());
        c0766k.mo1482M4(AbstractC23309i.m121704a5(), true);
    }

    /* renamed from: uM */
    public final ArrayList m50173uM(JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "arrList");
        try {
            this.f49417S0.clear();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                this.f49417S0.add(m50168tM((JSONObject) obj, i11));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return this.f49417S0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0200 A[Catch: all -> 0x0062, Exception -> 0x0065, TryCatch #4 {Exception -> 0x0065, blocks: (B:3:0x000e, B:5:0x001b, B:10:0x0043, B:16:0x0058, B:25:0x005f, B:28:0x0068, B:39:0x01fa, B:41:0x0200, B:43:0x020a, B:44:0x020d, B:48:0x01f4), top: B:2:0x000e, outer: #1 }] */
    /* renamed from: vM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m50174vM() {
        InterfaceC27218a m92676n2;
        Runnable runnable;
        String str;
        char charAt;
        int m127172a0;
        int m127172a02;
        boolean z11;
        int m127172a03;
        int i11;
        boolean z12;
        C28655u c28655u;
        int m127172a04;
        int i12;
        boolean z13;
        String str2 = "convertSignToNoSign(...)";
        final ArrayList arrayList = new ArrayList();
        int i13 = 0;
        try {
            try {
                this.f49422X0 = 0;
                int size = this.f49416R0.size();
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < size) {
                    Object obj = this.f49416R0.get(i15);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    C28655u c28655u2 = (C28655u) obj;
                    String m120002o = AbstractC23262x6.m120002o(c28655u2.f132863a);
                    AbstractC19074t.m100207e(m120002o, str2);
                    int length = m120002o.length() - 1;
                    int i17 = 0;
                    boolean z14 = false;
                    while (i17 <= length) {
                        if (!z14) {
                            i12 = i17;
                        } else {
                            i12 = length;
                        }
                        if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z14) {
                            if (!z13) {
                                z14 = true;
                            } else {
                                i17++;
                            }
                        } else if (!z13) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String obj2 = m120002o.subSequence(i17, length + 1).toString();
                    Locale locale = Locale.getDefault();
                    AbstractC19074t.m100207e(locale, "getDefault(...)");
                    String upperCase = obj2.toUpperCase(locale);
                    AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                    char charAt2 = upperCase.charAt(i13);
                    int i18 = i14 + 1;
                    if (i18 != 0) {
                        try {
                            String m120002o2 = AbstractC23262x6.m120002o(((C28655u) this.f49416R0.get(i16)).f132863a);
                            AbstractC19074t.m100207e(m120002o2, str2);
                            int length2 = m120002o2.length() - 1;
                            boolean z15 = false;
                            while (true) {
                                if (i13 <= length2) {
                                    if (!z15) {
                                        i11 = i13;
                                    } else {
                                        i11 = length2;
                                    }
                                    str = str2;
                                    try {
                                        if (AbstractC19074t.m100209g(m120002o2.charAt(i11), 32) <= 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z15) {
                                            if (!z12) {
                                                str2 = str;
                                                z15 = true;
                                            } else {
                                                i13++;
                                            }
                                        } else if (!z12) {
                                            break;
                                        } else {
                                            length2--;
                                        }
                                        str2 = str;
                                    } catch (Exception e11) {
                                        e = e11;
                                        i13 = 0;
                                        AbstractC20110a.f98889a.mo104552e(e);
                                        z11 = false;
                                        c28655u2.f132870h = z11;
                                        c28655u = this.f49419U0;
                                        if (c28655u != null) {
                                        }
                                        arrayList.add(c28655u2);
                                        this.f49422X0++;
                                        i16 = i15;
                                        str2 = str;
                                        i15++;
                                        i14 = i18;
                                    }
                                } else {
                                    str = str2;
                                    break;
                                }
                            }
                            String obj3 = m120002o2.subSequence(i13, length2 + 1).toString();
                            Locale locale2 = Locale.getDefault();
                            AbstractC19074t.m100207e(locale2, "getDefault(...)");
                            String upperCase2 = obj3.toUpperCase(locale2);
                            AbstractC19074t.m100207e(upperCase2, "toUpperCase(...)");
                            charAt = upperCase2.charAt(0);
                            m127172a0 = AbstractC24342w.m127172a0(this.f49420V0, charAt, 0, false, 6, null);
                        } catch (Exception e12) {
                            e = e12;
                            str = str2;
                        }
                        if (m127172a0 == -1) {
                            m127172a02 = AbstractC24342w.m127172a0(this.f49420V0, charAt2, 0, false, 6, null);
                            if (m127172a02 != -1) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(charAt2);
                                C28655u c28655u3 = new C28655u(sb2.toString(), "", "", -1, false, false);
                                c28655u3.f132867e = false;
                                arrayList.add(c28655u3);
                                z11 = true;
                            }
                            i13 = 0;
                            z11 = false;
                        } else {
                            if (AbstractC19074t.m100209g(charAt2, charAt) > 0) {
                                m127172a03 = AbstractC24342w.m127172a0(this.f49420V0, charAt2, 0, false, 6, null);
                                if (m127172a03 != -1) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(charAt2);
                                    C28655u c28655u4 = new C28655u(sb3.toString(), "", "", -1, false, false);
                                    c28655u4.f132867e = false;
                                    ((C28655u) this.f49416R0.get(i16)).f132871i = true;
                                    arrayList.add(c28655u4);
                                    z11 = true;
                                }
                            }
                            i13 = 0;
                            z11 = false;
                        }
                        c28655u2.f132870h = z11;
                        c28655u = this.f49419U0;
                        if (c28655u != null && AbstractC19074t.m100204b(c28655u2.f132865c, c28655u.f132865c)) {
                            c28655u2.f132872j = true;
                        }
                        arrayList.add(c28655u2);
                        this.f49422X0++;
                        i16 = i15;
                        str2 = str;
                        i15++;
                        i14 = i18;
                    } else {
                        str = str2;
                        m127172a04 = AbstractC24342w.m127172a0(this.f49420V0, charAt2, 0, false, 6, null);
                        if (m127172a04 == -1) {
                            try {
                                C28655u c28655u5 = new C28655u("#", "", "", -1, false, false);
                                c28655u5.f132867e = false;
                                arrayList.add(c28655u5);
                                z11 = true;
                            } catch (Exception e13) {
                                e = e13;
                                i13 = 0;
                                AbstractC20110a.f98889a.mo104552e(e);
                                z11 = false;
                                c28655u2.f132870h = z11;
                                c28655u = this.f49419U0;
                                if (c28655u != null) {
                                }
                                arrayList.add(c28655u2);
                                this.f49422X0++;
                                i16 = i15;
                                str2 = str;
                                i15++;
                                i14 = i18;
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(charAt2);
                            C28655u c28655u6 = new C28655u(sb4.toString(), "", "", -1, false, false);
                            i13 = 0;
                            try {
                                c28655u6.f132867e = false;
                                arrayList.add(c28655u6);
                                z11 = true;
                            } catch (Exception e14) {
                                e = e14;
                                AbstractC20110a.f98889a.mo104552e(e);
                                z11 = false;
                                c28655u2.f132870h = z11;
                                c28655u = this.f49419U0;
                                if (c28655u != null) {
                                }
                                arrayList.add(c28655u2);
                                this.f49422X0++;
                                i16 = i15;
                                str2 = str;
                                i15++;
                                i14 = i18;
                            }
                            c28655u2.f132870h = z11;
                            c28655u = this.f49419U0;
                            if (c28655u != null) {
                                c28655u2.f132872j = true;
                            }
                            arrayList.add(c28655u2);
                            this.f49422X0++;
                            i16 = i15;
                            str2 = str;
                            i15++;
                            i14 = i18;
                        }
                    }
                    i13 = 0;
                    c28655u2.f132870h = z11;
                    c28655u = this.f49419U0;
                    if (c28655u != null) {
                    }
                    arrayList.add(c28655u2);
                    this.f49422X0++;
                    i16 = i15;
                    str2 = str;
                    i15++;
                    i14 = i18;
                }
                m92676n2 = m92676n2();
            } catch (Exception e15) {
                e15.printStackTrace();
                m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    runnable = new Runnable() { // from class: ez.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SelectCountryView.m50169wM(SelectCountryView.this, arrayList);
                        }
                    };
                } else {
                    return;
                }
            }
            if (m92676n2 != null) {
                runnable = new Runnable() { // from class: ez.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectCountryView.m50169wM(SelectCountryView.this, arrayList);
                    }
                };
                m92676n2.runOnUiThread(runnable);
            }
        } catch (Throwable th2) {
            InterfaceC27218a m92676n22 = m92676n2();
            if (m92676n22 != null) {
                m92676n22.runOnUiThread(new Runnable() { // from class: ez.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectCountryView.m50169wM(SelectCountryView.this, arrayList);
                    }
                });
            }
            throw th2;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m50165qM();
    }

    /* renamed from: xM */
    public final void m50175xM(boolean z11) {
        this.f49421W0 = z11;
    }

    /* renamed from: yM */
    public final void m50176yM(boolean z11) {
        C29749cb c29749cb = null;
        if (z11) {
            C29749cb c29749cb2 = this.f49414P0;
            if (c29749cb2 == null) {
                AbstractC19074t.m100223u("binding");
                c29749cb2 = null;
            }
            c29749cb2.f137428r.setVisibility(8);
            C29749cb c29749cb3 = this.f49414P0;
            if (c29749cb3 == null) {
                AbstractC19074t.m100223u("binding");
                c29749cb3 = null;
            }
            c29749cb3.f137427q.setState(MultiStateView.EnumC15914e.LOADING);
            C29749cb c29749cb4 = this.f49414P0;
            if (c29749cb4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29749cb = c29749cb4;
            }
            c29749cb.f137427q.setVisibility(0);
            return;
        }
        if (this.f49422X0 > 0) {
            C29749cb c29749cb5 = this.f49414P0;
            if (c29749cb5 == null) {
                AbstractC19074t.m100223u("binding");
                c29749cb5 = null;
            }
            c29749cb5.f137427q.setVisibility(8);
            C29749cb c29749cb6 = this.f49414P0;
            if (c29749cb6 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29749cb = c29749cb6;
            }
            c29749cb.f137428r.setVisibility(0);
            return;
        }
        C29749cb c29749cb7 = this.f49414P0;
        if (c29749cb7 == null) {
            AbstractC19074t.m100223u("binding");
            c29749cb7 = null;
        }
        c29749cb7.f137428r.setVisibility(8);
        C29749cb c29749cb8 = this.f49414P0;
        if (c29749cb8 == null) {
            AbstractC19074t.m100223u("binding");
            c29749cb8 = null;
        }
        c29749cb8.f137427q.setState(MultiStateView.EnumC15914e.EMPTY);
        C29749cb c29749cb9 = this.f49414P0;
        if (c29749cb9 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29749cb = c29749cb9;
        }
        c29749cb.f137427q.setVisibility(0);
    }
}
