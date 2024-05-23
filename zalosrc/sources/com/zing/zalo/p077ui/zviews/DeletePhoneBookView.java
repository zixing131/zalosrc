package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7200s;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.DeletePhoneBookView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p716zh.C32002l4;
import vg.AbstractC28218w3;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class DeletePhoneBookView extends SlidableZaloView implements C7200s.a, View.OnClickListener, InterfaceC0733x, C23744a.c {

    /* renamed from: P0 */
    MultiStateView f73112P0;

    /* renamed from: Q0 */
    RecyclerView f73113Q0;

    /* renamed from: R0 */
    C7200s f73114R0;

    /* renamed from: S0 */
    private List f73115S0;

    /* renamed from: U0 */
    RobotoTextView f73117U0;

    /* renamed from: V0 */
    RobotoButton f73118V0;

    /* renamed from: Z0 */
    private Bundle f73122Z0;

    /* renamed from: d1 */
    ViewGroup f73126d1;

    /* renamed from: e1 */
    CheckBox f73127e1;

    /* renamed from: f1 */
    RobotoTextView f73128f1;

    /* renamed from: h1 */
    ContactProfile f73130h1;

    /* renamed from: T0 */
    int f73116T0 = 0;

    /* renamed from: W0 */
    private final String f73119W0 = "STATE_SELECTION_MODE";

    /* renamed from: X0 */
    private final String f73120X0 = "STATE_LIST_SUGGEST_DELETE";

    /* renamed from: Y0 */
    private final String f73121Y0 = ";";

    /* renamed from: a1 */
    private boolean f73123a1 = false;

    /* renamed from: b1 */
    volatile boolean f73124b1 = false;

    /* renamed from: c1 */
    int f73125c1 = 0;

    /* renamed from: g1 */
    private int f73129g1 = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.DeletePhoneBookView$a */
    /* loaded from: classes6.dex */
    public class C14218a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f73131a;

        C14218a(ArrayList arrayList) {
            this.f73131a = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m79267d() {
            try {
                AbstractC23088h5.m118426g();
                DeletePhoneBookView.this.m79251rM();
                if (DeletePhoneBookView.this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                }
                DeletePhoneBookView.this.m79260BM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89259g(c20096c.m104491c());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                DeletePhoneBookView.this.f73124b1 = false;
                DeletePhoneBookView.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        int i12 = -999;
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            if (i11 == -55) {
                                if (!jSONObject2.isNull("limit_friends_remove")) {
                                    i12 = jSONObject2.getInt("limit_friends_remove");
                                }
                                if (i12 > 0) {
                                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_number_out_of_accepted) + " (%s)", Integer.valueOf(i12)));
                                } else {
                                    ToastUtils.m89259g(i11);
                                }
                            } else {
                                ToastUtils.m89259g(i11);
                            }
                            DeletePhoneBookView.this.f73124b1 = false;
                            DeletePhoneBookView.this.f72421L0.mo78960q3();
                            C19669z.f97569Q.set(false);
                            C18644n.m98524E();
                            DeletePhoneBookView.this.f73124b1 = false;
                            DeletePhoneBookView.this.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    int size = this.f73131a.size();
                    ArrayList arrayList = new ArrayList(this.f73131a);
                    ArrayList arrayList2 = new ArrayList(size);
                    ArrayList arrayList3 = new ArrayList(size);
                    C7960e.m41971c6().m42194M(arrayList, "0");
                    for (int i13 = 0; i13 < size; i13++) {
                        String str = (String) this.f73131a.get(i13);
                        C28203u6.f131407a.m141827z(str, false);
                        arrayList2.add(C21927m.m114302u().m114312J().m153138j(str));
                        arrayList3.add(C18644n.m98531l().m98552o(str));
                    }
                    C18644n.m98531l().m98539G(arrayList);
                    C21927m.m114302u().m114343l(arrayList);
                    ArrayList m42347b6 = C7960e.m41971c6().m42347b6();
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    for (int i14 = 0; i14 < size; i14++) {
                        String str2 = (String) this.f73131a.get(i14);
                        C28203u6.f131407a.m141804B(str2, 0);
                        if (arrayList2.get(i14) == null && arrayList3.get(i14) != null) {
                            C7960e.m41971c6().m42221O7((ContactProfile) arrayList3.get(i14), false);
                        }
                        if (m42347b6 != null && !m42347b6.isEmpty() && m42347b6.contains(str2)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(Integer.valueOf(Integer.parseInt(str2)));
                        }
                        Map map = AbstractC23304d.f113421p;
                        synchronized (map) {
                            try {
                                if (map.containsKey(str2)) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(str2);
                                }
                            } finally {
                            }
                        }
                        AbstractC21935u.m114533W(str2, -1, "");
                        AbstractC23059e9.m118317F(str2);
                        C21920f.m114270a().m114272c(str2);
                    }
                    AbstractC0852x.m2347d(arrayList);
                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                        C21927m.m114302u().m114338i0(arrayList4);
                    }
                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                        C7960e.m41971c6().m42171K(arrayList5);
                    }
                    DeletePhoneBookView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.lb
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeletePhoneBookView.C14218a.this.m79267d();
                        }
                    });
                    C19669z.m103146Y().m103198O0();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DeletePhoneBookView", e11);
                }
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                DeletePhoneBookView.this.f73124b1 = false;
                DeletePhoneBookView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                DeletePhoneBookView.this.f73124b1 = false;
                DeletePhoneBookView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeletePhoneBookView$b */
    /* loaded from: classes6.dex */
    public static class C14219b {

        /* renamed from: a */
        public String f73133a;

        /* renamed from: b */
        public boolean f73134b;

        /* renamed from: c */
        public boolean f73135c;

        public C14219b(String str, boolean z11, boolean z12) {
            this.f73133a = str;
            this.f73134b = z11;
            this.f73135c = z12;
        }

        /* renamed from: a */
        public static C14219b m79268a(String str, boolean z11, boolean z12) {
            return new C14219b(str, z11, z12);
        }
    }

    /* renamed from: AM */
    private void m79235AM() {
        try {
            if (!this.f73127e1.isChecked()) {
                this.f73114R0.m36642c0(false);
                AbstractC23647d.m123897g("5801168");
            } else {
                this.f73114R0.m36642c0(true);
                AbstractC23647d.m123897g("5801159");
            }
            m79258yM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CM */
    private void m79236CM(HashMap hashMap) {
        if (this.f73124b1) {
            return;
        }
        this.f73124b1 = true;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        ArrayList arrayList = new ArrayList();
        try {
            for (Object obj : new HashMap(hashMap).keySet().toArray()) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.f73124b1 = false;
            this.f72421L0.mo49315c4();
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14218a(arrayList));
            c0766k.mo1409D4(arrayList, this.f73125c1, m79248oM());
        }
    }

    /* renamed from: DM */
    private void m79237DM() {
        this.f73116T0 = 0;
        C7200s c7200s = this.f73114R0;
        if (c7200s != null) {
            c7200s.m36628N();
        }
        this.f73123a1 = false;
    }

    /* renamed from: FM */
    private void m79238FM(Bundle bundle) {
        try {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("STATE_LIST_SUGGEST_DELETE");
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!TextUtils.isEmpty(next)) {
                        hashSet.add(next);
                    }
                }
                if (!hashSet.isEmpty()) {
                    AbstractC0852x.m2334K(hashSet);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: GM */
    private void m79239GM(Bundle bundle) {
        try {
            List<ContactProfile> list = this.f73115S0;
            if (list != null) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (ContactProfile contactProfile : list) {
                    if (contactProfile != null) {
                        arrayList.add(CoreUtility.f89233i + ";" + contactProfile.f42434r + ";" + contactProfile.f42455y);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("STATE_LIST_SUGGEST_DELETE", arrayList);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    private List m79247nM(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    arrayList.addAll(list);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: oM */
    private String m79248oM() {
        int i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("suggest_size_total", this.f73129g1);
            List list = this.f73115S0;
            if (list != null) {
                i11 = list.size();
            } else {
                i11 = 0;
            }
            jSONObject.put("suggest_size_cur", i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: pM */
    private void m79249pM(C14219b c14219b) {
        if (this.f88760a0.getActionMode() == null) {
            ActionBarMenu m92709d = this.f88760a0.m92709d();
            m92709d.m92750r();
            m92709d.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar_white);
            View m92744k = m92709d.m92744k(2, AbstractC7409c0.action_mode_back);
            if (m92744k instanceof ImageView) {
                ((ImageView) m92744k).setImageDrawable(AbstractC23136l9.m118665N(m92744k.getContext(), AbstractC16803z.stencils_ic_head_close_black));
            }
            RobotoTextView robotoTextView = (RobotoTextView) m92709d.m92745l(3, AbstractC7409c0.action_mode_title_count_select, 1);
            this.f73117U0 = robotoTextView;
            robotoTextView.setText("");
            ColorStateList m118645D = AbstractC23136l9.m118645D(this.f73118V0.getContext(), AbstractC16803z.action_menu_text_selector_delete_style_2);
            RobotoButton robotoButton = (RobotoButton) m92709d.m92744k(4, AbstractC7409c0.action_bar_menu_item_add);
            this.f73118V0 = robotoButton;
            robotoButton.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend));
            this.f73118V0.setAllCaps(true);
            if (m118645D != null) {
                this.f73118V0.setTextColor(m118645D);
            }
        }
        if (c14219b != null) {
            this.f73117U0.setText(c14219b.f73133a);
            this.f73118V0.setEnabled(c14219b.f73134b);
            this.f73127e1.setChecked(c14219b.f73135c);
        }
        this.f73126d1.setVisibility(0);
        this.f88760a0.m92725w();
    }

    /* renamed from: qM */
    private C14219b m79250qM() {
        boolean z11;
        int m36632S = this.f73114R0.m36632S();
        int m36629P = this.f73114R0.m36629P(null);
        String str = m36632S + "/" + m36629P;
        boolean z12 = false;
        if (m36632S > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m36632S == m36629P) {
            z12 = true;
        }
        return C14219b.m79268a(str, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public boolean m79251rM() {
        try {
            if (this.f73116T0 != 0) {
                this.f88760a0.m92716k();
                this.f73126d1.setVisibility(8);
                m79237DM();
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m79252sM(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (this.f73116T0 != 0 && !z11) {
            AbstractC23647d.m123897g("5801166");
            return;
        }
        AbstractC23647d.m123897g("5801164");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m79253tM(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (this.f73116T0 != 0 && !z11) {
                m79236CM(this.f73114R0.m36631R());
                AbstractC23647d.m123897g("5801165");
            }
            HashMap hashMap = new HashMap(1);
            ContactProfile contactProfile = this.f73130h1;
            hashMap.put(contactProfile.f42434r, contactProfile);
            m79236CM(hashMap);
            AbstractC23647d.m123897g("5801163");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m79254uM(List list) {
        if (list != null) {
            try {
                this.f73114R0.m36640a0(list);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m79261EM();
        if (this.f73115S0.isEmpty()) {
            m79251rM();
        }
        m79262HM(false);
        m79258yM();
        this.f72421L0.invalidateOptionsMenu();
        if (this.f73129g1 == -1 && !this.f73115S0.isEmpty()) {
            this.f73129g1 = this.f73115S0.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m79255vM() {
        List m2359p = AbstractC0852x.m2359p();
        this.f73115S0 = m2359p;
        final List m79247nM = m79247nM(m2359p);
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.kb
            @Override // java.lang.Runnable
            public final void run() {
                DeletePhoneBookView.this.m79254uM(m79247nM);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m79256wM(RecyclerView recyclerView, int i11, View view) {
        ContactProfile m36630Q;
        try {
            C7200s c7200s = this.f73114R0;
            if (c7200s != null && (m36630Q = c7200s.m36630Q(i11)) != null) {
                if (this.f73116T0 == 0) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(m36630Q.f42434r, C32002l4.m154264g(17)).m135743b(), 0, 1));
                    AbstractC23647d.m123897g("5801154");
                } else {
                    m79259zM(i11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ boolean m79257xM(RecyclerView recyclerView, int i11, View view) {
        ContactProfile m36630Q;
        try {
            C7200s c7200s = this.f73114R0;
            if (c7200s != null && (m36630Q = c7200s.m36630Q(i11)) != null && !TextUtils.isEmpty(m36630Q.f42434r)) {
                int i12 = this.f73116T0;
                boolean m79259zM = m79259zM(i11);
                if (i12 == 0 && this.f73116T0 != 0) {
                    AbstractC23647d.m123897g("5801156");
                }
                return m79259zM;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: yM */
    private void m79258yM() {
        if (this.f73116T0 != 0) {
            m79249pM(m79250qM());
        }
    }

    /* renamed from: zM */
    private boolean m79259zM(int i11) {
        try {
            C7200s c7200s = this.f73114R0;
            if (c7200s == null || !c7200s.m36643d0(i11)) {
                return false;
            }
            if (this.f73116T0 == 0) {
                this.f73116T0 = 1;
            }
            m79258yM();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: BM */
    public void m79260BM() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.jb
            @Override // java.lang.Runnable
            public final void run() {
                DeletePhoneBookView.this.m79255vM();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72421L0.m92637BK(true);
        this.f72421L0.m92676n2().mo35554O(32);
        this.f73123a1 = true;
        this.f73122Z0 = bundle;
        if (bundle != null) {
            m79238FM(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        HashMap m36631R;
        if (i11 != 1) {
            return null;
        }
        try {
            String str = "";
            int i12 = this.f73116T0;
            final boolean z11 = false;
            if (i12 == 0) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_desc_delete_zalo_friend_single, AbstractC23244v8.m119733C(AbstractC28218w3.m142177a(this.f73130h1)));
            } else if (i12 == 1 && (m36631R = this.f73114R0.m36631R()) != null && m36631R.size() > 0) {
                if (m36631R.size() == 1) {
                    ContactProfile contactProfile = (ContactProfile) m36631R.values().iterator().next();
                    if (contactProfile != null) {
                        str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_desc_delete_zalo_friend_single, AbstractC23244v8.m119733C(AbstractC28218w3.m142177a(contactProfile)));
                    }
                    this.f73130h1 = contactProfile;
                    z11 = true;
                } else {
                    str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_desc_delete_zalo_friend_multi, String.valueOf(m36631R.size()));
                }
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(1).m43162k(str).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.hb
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                    DeletePhoneBookView.this.m79252sM(z11, interfaceC17463d, i13);
                }
            }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ib
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                    DeletePhoneBookView.this.m79253tM(z11, interfaceC17463d, i13);
                }
            });
            return aVar.m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: EM */
    public void m79261EM() {
        Bundle bundle;
        if (this.f73123a1 && (bundle = this.f73122Z0) != null) {
            this.f73123a1 = false;
            int i11 = bundle.getInt("STATE_SELECTION_MODE", 0);
            this.f73116T0 = i11;
            if (i11 == 0) {
                return;
            }
            C7200s c7200s = this.f73114R0;
            if (c7200s != null) {
                c7200s.m36641b0(true);
                this.f73114R0.m36638Y(this.f73122Z0);
            }
            this.f73122Z0 = null;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            actionBarMenu.m92750r();
            List list = this.f73115S0;
            if (list != null && list.size() > 0) {
                actionBarMenu.m92738e(1, AbstractC16803z.ic_multi_select);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.delete_phone_book_view, viewGroup, false);
        m79265KM(inflate);
        return inflate;
    }

    /* renamed from: HM */
    void m79262HM(boolean z11) {
        if (z11) {
            this.f73112P0.setVisibility(0);
            this.f73112P0.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        C7200s c7200s = this.f73114R0;
        if (c7200s != null && c7200s.mo10003k() > 0) {
            this.f73114R0.m10008p();
            this.f73112P0.setVisibility(8);
        } else {
            this.f73112P0.setVisibility(0);
            this.f73112P0.setState(MultiStateView.EnumC15914e.EMPTY);
            AbstractC23309i.m122361rl(false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        AbstractC0852x.m2331H();
    }

    /* renamed from: IM */
    void m79263IM(int i11) {
        MultiStateView multiStateView = this.f73112P0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(m92652XI(i11));
        }
    }

    /* renamed from: JM */
    void m79264JM(int i11) {
        MultiStateView multiStateView = this.f73112P0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(m92652XI(i11));
        }
    }

    /* renamed from: KM */
    void m79265KM(View view) {
        try {
            MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f73112P0 = multiStateView;
            multiStateView.setEnableLoadingText(true);
            this.f73113Q0 = (RecyclerView) view.findViewById(AbstractC6918a0.recycle_view);
            this.f73126d1 = (ViewGroup) view.findViewById(AbstractC6918a0.ll_select_all);
            this.f73127e1 = (CheckBox) view.findViewById(AbstractC6918a0.checkbox_select_all);
            this.f73128f1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_select_all);
            this.f73127e1.setOnClickListener(this);
            this.f73128f1.setOnClickListener(this);
            this.f73113Q0.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
            C7200s c7200s = new C7200s(this);
            this.f73114R0 = c7200s;
            this.f73113Q0.setAdapter(c7200s);
            C31784b.m152808a(this.f73113Q0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.fb
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view2) {
                    DeletePhoneBookView.this.m79256wM(recyclerView, i11, view2);
                }
            });
            C31784b.m152808a(this.f73113Q0).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.gb
                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view2) {
                    boolean m79257xM;
                    m79257xM = DeletePhoneBookView.this.m79257xM(recyclerView, i11, view2);
                    return m79257xM;
                }
            });
            m79264JM(AbstractC8020f0.empty_list);
            m79263IM(AbstractC8020f0.str_tv_findingFriend);
            m79262HM(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 == 16908332) {
                        AbstractC23647d.m123897g("5801158");
                    }
                    return super.mo37491QJ(i11);
                }
                this.f72421L0.showDialog(1);
                AbstractC23647d.m123897g("5801162");
            } else {
                m79251rM();
                AbstractC23647d.m123897g("5801161");
            }
        } else {
            try {
                this.f73116T0 = i11;
                this.f73114R0.m36641b0(true);
                this.f73114R0.m10008p();
                m79258yM();
                AbstractC23647d.m123897g("5801157");
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        int i11 = this.f73116T0;
        if (i11 != 0) {
            bundle.putInt("STATE_SELECTION_MODE", i11);
            C7200s c7200s = this.f73114R0;
            if (c7200s != null) {
                c7200s.m36639Z(bundle);
            }
        }
        m79239GM(bundle);
    }

    @Override // com.zing.zalo.adapters.C7200s.a
    /* renamed from: Sj */
    public void mo36644Sj(ContactProfile contactProfile) {
        this.f73130h1 = contactProfile;
        this.f72421L0.showDialog(1);
        AbstractC23647d.m123897g("5801155");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_close_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_phonebook_friend));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this, 6084);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 6084);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeletePhoneBookView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_select_all) {
            this.f73127e1.setChecked(!r2.isChecked());
            m79235AM();
        } else if (id2 == AbstractC6918a0.checkbox_select_all) {
            m79235AM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                if (!m79251rM()) {
                    this.f72421L0.finish();
                    AbstractC23647d.m123897g("5801158");
                    return true;
                }
                AbstractC23647d.m123897g("5801161");
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m79260BM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6084) {
            m79260BM();
        }
    }
}
