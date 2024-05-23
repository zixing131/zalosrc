package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
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
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7156o;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.ChooseMultiFriendsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import en0.InterfaceC18505l;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l30.C22035l0;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.C21912a;
import p304ks.C21927m;
import p304ks.C21937w;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p445qe.C25244a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32093r8;
import pm0.C24848g0;
import to.C26853c;
import vg.AbstractC28034c7;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class ChooseMultiFriendsView extends SlidableZaloView implements C7156o.a, InterfaceC0733x {

    /* renamed from: A1 */
    ZAppCompatImageView f72698A1;

    /* renamed from: F1 */
    C22035l0 f72703F1;

    /* renamed from: Q0 */
    TextView f72705Q0;

    /* renamed from: R0 */
    MultiStateView f72706R0;

    /* renamed from: S0 */
    RecyclerView f72707S0;

    /* renamed from: T0 */
    C7005a5 f72708T0;

    /* renamed from: U0 */
    EditText f72709U0;

    /* renamed from: V0 */
    View f72710V0;

    /* renamed from: W0 */
    ListView f72711W0;

    /* renamed from: X0 */
    int f72712X0;

    /* renamed from: f1 */
    C7156o f72720f1;

    /* renamed from: t1 */
    C23528a f72734t1;

    /* renamed from: z1 */
    ZdsActionBar f72740z1;

    /* renamed from: P0 */
    final String f72704P0 = ChooseMultiFriendsView.class.getSimpleName();

    /* renamed from: Y0 */
    int f72713Y0 = -1;

    /* renamed from: Z0 */
    String f72714Z0 = "";

    /* renamed from: a1 */
    int f72715a1 = -1;

    /* renamed from: b1 */
    ArrayList f72716b1 = new ArrayList();

    /* renamed from: c1 */
    ArrayList f72717c1 = new ArrayList();

    /* renamed from: d1 */
    ArrayList f72718d1 = new ArrayList();

    /* renamed from: e1 */
    ArrayList f72719e1 = new ArrayList();

    /* renamed from: g1 */
    int f72721g1 = 0;

    /* renamed from: h1 */
    int f72722h1 = 0;

    /* renamed from: i1 */
    final String f72723i1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: j1 */
    HashMap f72724j1 = new HashMap();

    /* renamed from: k1 */
    Handler f72725k1 = new Handler();

    /* renamed from: l1 */
    boolean f72726l1 = false;

    /* renamed from: m1 */
    boolean f72727m1 = false;

    /* renamed from: n1 */
    boolean f72728n1 = false;

    /* renamed from: o1 */
    boolean f72729o1 = false;

    /* renamed from: p1 */
    boolean f72730p1 = false;

    /* renamed from: q1 */
    boolean f72731q1 = false;

    /* renamed from: r1 */
    boolean f72732r1 = false;

    /* renamed from: s1 */
    boolean f72733s1 = false;

    /* renamed from: u1 */
    int f72735u1 = -1;

    /* renamed from: v1 */
    int f72736v1 = 0;

    /* renamed from: w1 */
    Map f72737w1 = Collections.synchronizedMap(new HashMap());

    /* renamed from: x1 */
    TextWatcher f72738x1 = new C14151a();

    /* renamed from: y1 */
    Runnable f72739y1 = new RunnableC14152b();

    /* renamed from: B1 */
    boolean f72699B1 = false;

    /* renamed from: C1 */
    boolean f72700C1 = false;

    /* renamed from: D1 */
    InterfaceC0765j f72701D1 = new C0766k();

    /* renamed from: E1 */
    InterfaceC20094a f72702E1 = new C14157g();

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$a */
    /* loaded from: classes6.dex */
    class C14151a extends AbstractC18391a {
        C14151a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            EditText editText = ChooseMultiFriendsView.this.f72709U0;
            if (editText != null && editText.getText() != null) {
                new C14160j(ChooseMultiFriendsView.this.f72709U0.getText().toString().trim());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$b */
    /* loaded from: classes6.dex */
    class RunnableC14152b implements Runnable {
        RunnableC14152b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ChooseMultiFriendsView.this.f72707S0.mo9854S1(r0.f72719e1.size() - 1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$c */
    /* loaded from: classes6.dex */
    class C14153c extends ZdsActionBar.AbstractC16987c {
        C14153c() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC2379w.m12430d(ChooseMultiFriendsView.this.f72709U0);
            ChooseMultiFriendsView.this.m78800FM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$d */
    /* loaded from: classes6.dex */
    public class C14154d extends AbstractC28034c7 {
        C14154d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    C7156o c7156o = ChooseMultiFriendsView.this.f72720f1;
                    c7156o.f39148q = false;
                    c7156o.notifyDataSetChanged();
                } else {
                    ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
                    chooseMultiFriendsView.f72720f1.f39148q = true;
                    AbstractC2379w.m12430d(chooseMultiFriendsView.f72709U0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$e */
    /* loaded from: classes6.dex */
    public class C14155e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f72745a;

        C14155e(List list) {
            this.f72745a = list;
        }

        /* renamed from: d */
        public /* synthetic */ void m78814d() {
            try {
                ChooseMultiFriendsView.this.f72421L0.mo50035CK(-1, null);
                ChooseMultiFriendsView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
                chooseMultiFriendsView.f72699B1 = false;
                chooseMultiFriendsView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ChooseMultiFriendsView chooseMultiFriendsView2 = ChooseMultiFriendsView.this;
                chooseMultiFriendsView2.f72699B1 = false;
                chooseMultiFriendsView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (this.f72745a.isEmpty()) {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                    } else {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 2);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (String str : this.f72745a) {
                        JSONObject jSONObject2 = new JSONObject();
                        ContactProfile m98552o = C18644n.m98531l().m98552o(str);
                        if (m98552o != null) {
                            jSONObject2.put("userId", m98552o.f42434r);
                            jSONObject2.put("avatar", m98552o.f42446v);
                            jSONObject2.put("displayName", m98552o.f42437s);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("list_uid", jSONArray);
                    AbstractC23309i.m121176Lw(jSONObject.toString());
                    if (ChooseMultiFriendsView.this.f72421L0.m92676n2() != null) {
                        ChooseMultiFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j6
                            public /* synthetic */ RunnableC15761j6() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ChooseMultiFriendsView.C14155e.this.m78814d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
                chooseMultiFriendsView.f72699B1 = false;
                chooseMultiFriendsView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ChooseMultiFriendsView chooseMultiFriendsView2 = ChooseMultiFriendsView.this;
                chooseMultiFriendsView2.f72699B1 = false;
                chooseMultiFriendsView2.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$f */
    /* loaded from: classes6.dex */
    public class C14156f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f72747a;

        C14156f(List list) {
            this.f72747a = list;
        }

        /* renamed from: d */
        public /* synthetic */ void m78816d() {
            try {
                ChooseMultiFriendsView.this.f72421L0.mo50035CK(-1, null);
                ChooseMultiFriendsView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
                chooseMultiFriendsView.f72699B1 = false;
                chooseMultiFriendsView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                ChooseMultiFriendsView chooseMultiFriendsView2 = ChooseMultiFriendsView.this;
                chooseMultiFriendsView2.f72699B1 = false;
                chooseMultiFriendsView2.f72421L0.mo49315c4();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (this.f72747a.isEmpty()) {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                    } else {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 2);
                    }
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f72747a.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put("list_uid", jSONArray);
                    AbstractC23309i.m121213Mw(jSONObject.toString());
                    if (ChooseMultiFriendsView.this.f72421L0.m92676n2() != null) {
                        ChooseMultiFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.k6
                            public /* synthetic */ RunnableC15804k6() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ChooseMultiFriendsView.C14156f.this.m78816d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
                chooseMultiFriendsView.f72699B1 = false;
                chooseMultiFriendsView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                ChooseMultiFriendsView chooseMultiFriendsView2 = ChooseMultiFriendsView.this;
                chooseMultiFriendsView2.f72699B1 = false;
                chooseMultiFriendsView2.f72421L0.mo49315c4();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$g */
    /* loaded from: classes6.dex */
    class C14157g implements InterfaceC20094a {
        C14157g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
            chooseMultiFriendsView.f72700C1 = false;
            if (chooseMultiFriendsView.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
            chooseMultiFriendsView.f72700C1 = false;
            if (chooseMultiFriendsView.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_blacklist_success));
            }
            ChooseMultiFriendsView chooseMultiFriendsView2 = ChooseMultiFriendsView.this;
            chooseMultiFriendsView2.f72726l1 = true;
            chooseMultiFriendsView2.m78800FM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$h */
    /* loaded from: classes6.dex */
    public class C14158h implements C26853c.a {
        C14158h() {
        }

        @Override // to.C26853c.a
        /* renamed from: a */
        public void mo78817a() {
            if (ChooseMultiFriendsView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_hiddenlist_success));
            }
            ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
            chooseMultiFriendsView.f72726l1 = true;
            chooseMultiFriendsView.m78800FM();
        }

        @Override // to.C26853c.a
        /* renamed from: b */
        public void mo78818b() {
            if (ChooseMultiFriendsView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // to.C26853c.a
        /* renamed from: c */
        public void mo78819c() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$i */
    /* loaded from: classes6.dex */
    public class C14159i extends C22035l0.d {
        C14159i() {
        }

        @Override // l30.C22035l0.d
        /* renamed from: a */
        public void mo78820a(int i11, String str) {
            if (i11 != 0) {
                if (ChooseMultiFriendsView.this.f72421L0.m92672lJ()) {
                    if (!TextUtils.isEmpty(str)) {
                        ToastUtils.showMess(str);
                        return;
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                        return;
                    }
                }
                return;
            }
            if (ChooseMultiFriendsView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_story_block_list_success));
            }
            ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
            chooseMultiFriendsView.f72726l1 = true;
            chooseMultiFriendsView.m78800FM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChooseMultiFriendsView$j */
    /* loaded from: classes6.dex */
    public class C14160j extends Thread {

        /* renamed from: p */
        final String f72752p;

        /* renamed from: q */
        int f72753q;

        public C14160j(String str) {
            super("Z:ChooseMultiFriends-Search");
            this.f72753q = 0;
            this.f72752p = str;
            start();
        }

        /* renamed from: c */
        public /* synthetic */ void m78823c() {
            if (TextUtils.isEmpty(ChooseMultiFriendsView.this.f72709U0.getText().toString().trim())) {
                ChooseMultiFriendsView.this.m78801GM();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m78824d(ArrayList arrayList) {
            ListView listView;
            int i11;
            try {
                if (this.f72752p.equals(ChooseMultiFriendsView.this.f72709U0.getText().toString().trim())) {
                    ChooseMultiFriendsView chooseMultiFriendsView = ChooseMultiFriendsView.this;
                    chooseMultiFriendsView.f72716b1 = arrayList;
                    chooseMultiFriendsView.f72722h1 = this.f72753q;
                    chooseMultiFriendsView.f72720f1.m36390a(arrayList);
                    ChooseMultiFriendsView.this.f72720f1.notifyDataSetChanged();
                    ChooseMultiFriendsView.this.m78802HM(AbstractC8020f0.str_emptyResult);
                    ChooseMultiFriendsView.this.m78803IM(false);
                    ChooseMultiFriendsView chooseMultiFriendsView2 = ChooseMultiFriendsView.this;
                    if (chooseMultiFriendsView2.f72722h1 > 0) {
                        TextView textView = chooseMultiFriendsView2.f72705Q0;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_refix_number_of_friend);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(ChooseMultiFriendsView.this.f72722h1);
                        if (ChooseMultiFriendsView.this.f72722h1 > 1) {
                            i11 = AbstractC8020f0.str_more_s;
                        } else {
                            i11 = AbstractC8020f0.str_single_form;
                        }
                        objArr[1] = AbstractC23136l9.m118743r0(i11);
                        textView.setText(String.format(m118743r0, objArr));
                    }
                    ArrayList arrayList2 = ChooseMultiFriendsView.this.f72716b1;
                    if (arrayList2 != null && !arrayList2.isEmpty() && (listView = ChooseMultiFriendsView.this.f72711W0) != null) {
                        listView.setSelection(0);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String str = this.f72752p;
                if (str != null && !str.equals("")) {
                    String m120002o = AbstractC23262x6.m120002o(this.f72752p);
                    String[] m119967B = AbstractC23262x6.m119967B(m120002o);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList4 = new ArrayList();
                    if (!ChooseMultiFriendsView.this.f72737w1.containsKey(m120002o)) {
                        for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                            String[] m119970E = AbstractC23262x6.m119970E((String) entry.getKey());
                            ArrayList arrayList5 = (ArrayList) entry.getValue();
                            float m120001n = AbstractC23262x6.m120001n(m119967B, m119970E);
                            if (m120001n > 0.0f) {
                                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                                    C32093r8 c32093r8 = new C32093r8();
                                    c32093r8.f147887d = ((C32093r8) arrayList5.get(i11)).f147887d;
                                    c32093r8.f147884a = ((C32093r8) arrayList5.get(i11)).f147884a;
                                    c32093r8.f147886c = ((C32093r8) arrayList5.get(i11)).f147886c;
                                    c32093r8.f147890g = m120001n;
                                    c32093r8.f147885b = ((C32093r8) arrayList5.get(i11)).f147885b;
                                    c32093r8.f147893j = ((C32093r8) arrayList5.get(i11)).f147893j;
                                    arrayList4.add(c32093r8);
                                }
                                ChooseMultiFriendsView.this.f72737w1.put(m120002o, arrayList4);
                            }
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = (ArrayList) ChooseMultiFriendsView.this.f72737w1.get(m120002o);
                    }
                    String str2 = ChooseMultiFriendsView.this.f72704P0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("TimeCheckTopHit: ");
                    sb2.append(System.currentTimeMillis() - currentTimeMillis);
                    AbstractC23262x6.m120004q(m120002o, C18644n.m98531l().mo98465a(null, false), arrayList3, false, C19669z.f97573U, arrayList);
                    int size = arrayList3.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) arrayList3.get(i12);
                        if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && ((!ChooseMultiFriendsView.this.f72728n1 || !C21912a.m114159g().m114169j(inviteContactProfile.f42434r)) && ((!ChooseMultiFriendsView.this.f72727m1 || !C21937w.f108027a.m114574m(inviteContactProfile.f42434r)) && (!ChooseMultiFriendsView.this.f72729o1 || !C21927m.m114302u().m114309G().m153137g(inviteContactProfile.f42434r))))) {
                            arrayList2.add(inviteContactProfile);
                            this.f72753q++;
                        }
                    }
                    ChooseMultiFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.m6

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f81096q;

                        public /* synthetic */ RunnableC15878m6(ArrayList arrayList22) {
                            r2 = arrayList22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChooseMultiFriendsView.C14160j.this.m78824d(r2);
                        }
                    });
                    return;
                }
                if (ChooseMultiFriendsView.this.f72421L0.m92676n2() != null) {
                    ChooseMultiFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l6
                        public /* synthetic */ RunnableC15841l6() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChooseMultiFriendsView.C14160j.this.m78823c();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m78778AM(View view) {
        try {
            AbstractC2379w.m12430d(this.f72709U0);
            ArrayList arrayList = this.f72717c1;
            if (arrayList != null) {
                arrayList.clear();
            }
            Iterator it = this.f72724j1.entrySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                this.f72717c1.add((String) ((Map.Entry) it.next()).getKey());
                i11++;
            }
            if (i11 == 0 && !this.f72730p1 && !this.f72731q1) {
                if (this.f72728n1 || this.f72727m1 || this.f72729o1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_choose_to_add));
                    return;
                }
                return;
            }
            if (this.f72728n1) {
                m78808oM(this.f72717c1.toString());
            } else if (this.f72727m1) {
                m78809pM(this.f72717c1);
            } else if (this.f72729o1) {
                m78810qM(this.f72717c1);
            } else if (this.f72730p1) {
                m78806NM(new ArrayList(this.f72717c1));
            } else if (this.f72731q1) {
                m78807OM(new ArrayList(this.f72717c1));
            } else if (this.f72732r1) {
                m78805MM(new ArrayList(this.f72717c1));
            }
            ArrayList arrayList2 = this.f72717c1;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122775e(this.f72704P0, "choose_multi_friend_abs_menu_done", e11);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ C24848g0 m78779BM(Boolean bool) {
        this.f72699B1 = false;
        mo49315c4();
        if (bool.booleanValue()) {
            this.f72726l1 = true;
            m78800FM();
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
        }
        return C24848g0.f119245a;
    }

    /* renamed from: CM */
    private void m78780CM() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154284u(76)), false);
    }

    /* renamed from: DM */
    private void m78781DM() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154284u(75)), false);
    }

    /* renamed from: EM */
    private void m78782EM() {
        if (this.f72732r1) {
            showDialog(1);
        } else {
            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_limit_black_hidden_add_item), Integer.valueOf(m78793sM())));
        }
    }

    /* renamed from: KM */
    private void m78783KM() {
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(m92689tK());
        this.f72698A1 = zAppCompatImageView;
        zAppCompatImageView.setImageResource(AbstractC16803z.action_menu_blue_send_icon_selector);
        this.f72698A1.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f72698A1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.e6
            public /* synthetic */ ViewOnClickListenerC15577e6() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMultiFriendsView.this.m78778AM(view);
            }
        });
    }

    /* renamed from: LM */
    private void m78784LM() {
        this.f72724j1.clear();
        this.f72719e1.clear();
        Iterator it = this.f72717c1.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                this.f72724j1.put(str, str);
                this.f72719e1.add(new InviteContactProfile(m141809c));
            }
        }
        this.f72708T0.m35846M(this.f72719e1);
        this.f72708T0.m10008p();
    }

    /* renamed from: sM */
    private int m78793sM() {
        if (this.f72732r1) {
            return Math.min(C25244a.m130615B(), this.f72721g1);
        }
        return 10;
    }

    /* renamed from: uM */
    public /* synthetic */ void m78794uM() {
        if (this.f72713Y0 >= 0 && this.f72720f1.getCount() > 0) {
            this.f72711W0.setSelection(this.f72713Y0);
            this.f72713Y0 = -1;
        }
    }

    /* renamed from: vM */
    public /* synthetic */ void m78795vM(RecyclerView recyclerView, int i11, View view) {
        try {
            String str = ((InviteContactProfile) this.f72719e1.get(i11)).f42434r;
            this.f72713Y0 = -1;
            EditText editText = this.f72709U0;
            if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                this.f72714Z0 = ((InviteContactProfile) this.f72719e1.get(i11)).f42434r;
                C7156o c7156o = this.f72720f1;
                if (c7156o.f39149r.equals(str)) {
                    str = "";
                }
                c7156o.f39149r = str;
                this.f72709U0.setText("");
                AbstractC2379w.m12430d(this.f72709U0);
                return;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= this.f72720f1.getCount()) {
                    break;
                }
                if (this.f72720f1.getItem(i12) != null && ((InviteContactProfile) this.f72720f1.getItem(i12)).f42434r.equals(str)) {
                    if (!str.equals(this.f72720f1.f39149r)) {
                        this.f72713Y0 = i12;
                    }
                } else {
                    i12++;
                }
            }
            this.f72708T0.m35847N(str);
            this.f72708T0.m10008p();
            C7156o c7156o2 = this.f72720f1;
            if (c7156o2.f39149r.equals(str)) {
                str = "";
            }
            c7156o2.f39149r = str;
            this.f72720f1.notifyDataSetChanged();
            this.f72711W0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.i6
                public /* synthetic */ RunnableC15725i6() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChooseMultiFriendsView.this.m78794uM();
                }
            }, 100L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:2:0x0000, B:5:0x000f, B:7:0x0017, B:9:0x0024, B:11:0x0028, B:13:0x002c, B:15:0x0030, B:17:0x0034, B:22:0x0046, B:25:0x0054, B:27:0x0083, B:28:0x008a, B:30:0x009d, B:32:0x00a1, B:34:0x00a5, B:36:0x00d2, B:38:0x00da, B:40:0x00de, B:41:0x00e8, B:43:0x00ec, B:45:0x00f6, B:46:0x01f8, B:47:0x00a9, B:49:0x00af, B:50:0x0106, B:52:0x010a, B:54:0x010e, B:56:0x0112, B:58:0x0116, B:60:0x011a, B:62:0x011e, B:64:0x014d, B:66:0x015b, B:67:0x0160, B:68:0x0169, B:70:0x016f, B:72:0x0173, B:75:0x0178, B:76:0x017d, B:78:0x01ac, B:80:0x01ba, B:81:0x01bf, B:83:0x01ca, B:85:0x01ce, B:87:0x01d4, B:88:0x01fb, B:92:0x003e), top: B:1:0x0000 }] */
    /* renamed from: wM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m78796wM(AdapterView adapterView, View view, int i11, long j11) {
        int size;
        View view2;
        try {
            int headerViewsCount = i11 - this.f72711W0.getHeaderViewsCount();
            this.f72712X0 = headerViewsCount;
            C7156o c7156o = this.f72720f1;
            if (c7156o != null && headerViewsCount >= 0) {
                int count = c7156o.getCount();
                int i12 = this.f72712X0;
                if (count > i12) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f72720f1.getItem(i12);
                    if (!this.f72727m1 && !this.f72728n1 && !this.f72729o1 && !this.f72730p1 && !this.f72731q1 && !this.f72732r1) {
                        size = 0;
                        if (inviteContactProfile != null) {
                            if (this.f72724j1.containsKey(inviteContactProfile.f42434r)) {
                                this.f72719e1.remove(inviteContactProfile);
                                this.f72708T0.m35846M(this.f72719e1);
                                this.f72708T0.m10008p();
                                this.f72717c1.remove(inviteContactProfile.f42434r);
                                this.f72724j1.remove(inviteContactProfile.f42434r);
                                int size2 = this.f72719e1.size();
                                if (this.f72724j1.containsKey(inviteContactProfile.f42434r)) {
                                    this.f72724j1.remove(inviteContactProfile.f42434r);
                                }
                                this.f72720f1.m36390a(this.f72716b1);
                                this.f72720f1.notifyDataSetChanged();
                                m78811rM();
                                if ((this.f72728n1 || this.f72727m1 || this.f72729o1 || this.f72732r1) && m87077NK() != null) {
                                    m87077NK().setMiddleSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_count_character_invitation), Integer.valueOf(size2), Integer.valueOf(m78793sM())));
                                }
                                if (this.f72719e1.size() == 0 && (view2 = this.f72710V0) != null) {
                                    view2.setVisibility(8);
                                    this.f72707S0.setVisibility(8);
                                }
                                C7156o c7156o2 = this.f72720f1;
                                if (c7156o2 != null && c7156o2.f39149r.equals(inviteContactProfile.f42434r)) {
                                    this.f72720f1.f39149r = "";
                                    this.f72708T0.m35847N("");
                                    this.f72708T0.m10008p();
                                }
                            } else if (!this.f72727m1 && !this.f72728n1 && !this.f72729o1 && !this.f72730p1 && !this.f72731q1 && !this.f72732r1) {
                                this.f72719e1.add(inviteContactProfile);
                                this.f72708T0.m35846M(this.f72719e1);
                                this.f72708T0.m10008p();
                                this.f72724j1.put(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                                this.f72707S0.setVisibility(0);
                                this.f72725k1.post(this.f72739y1);
                                this.f72710V0.setVisibility(0);
                                EditText editText = this.f72709U0;
                                if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                                    this.f72709U0.setText("");
                                }
                                HashMap hashMap = this.f72724j1;
                                String str = inviteContactProfile.f42434r;
                                hashMap.put(str, str);
                            } else {
                                if (size >= m78793sM() && !this.f72730p1 && !this.f72731q1) {
                                    m78782EM();
                                }
                                this.f72719e1.add(inviteContactProfile);
                                this.f72708T0.m35846M(this.f72719e1);
                                this.f72708T0.m10008p();
                                this.f72724j1.put(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                                this.f72707S0.setVisibility(0);
                                this.f72725k1.post(this.f72739y1);
                                this.f72710V0.setVisibility(0);
                                EditText editText2 = this.f72709U0;
                                if (editText2 != null && !TextUtils.isEmpty(editText2.getEditableText().toString())) {
                                    this.f72709U0.setText("");
                                }
                                HashMap hashMap2 = this.f72724j1;
                                String str2 = inviteContactProfile.f42434r;
                                hashMap2.put(str2, str2);
                                if (!this.f72730p1 && !this.f72731q1 && m87077NK() != null) {
                                    m87077NK().setMiddleSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_count_character_invitation), Integer.valueOf(size + 1), Integer.valueOf(m78793sM())));
                                }
                            }
                            m78811rM();
                        }
                        this.f72720f1.m36390a(this.f72716b1);
                        this.f72720f1.notifyDataSetChanged();
                    }
                    size = this.f72719e1.size();
                    if (inviteContactProfile != null) {
                    }
                    this.f72720f1.m36390a(this.f72716b1);
                    this.f72720f1.notifyDataSetChanged();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m78797xM() {
        Intent intent = new Intent();
        if (this.f72726l1) {
            this.f72421L0.mo50035CK(-1, intent);
        } else {
            this.f72421L0.mo50035CK(0, intent);
        }
        finish();
    }

    /* renamed from: yM */
    public /* synthetic */ void m78798yM() {
        this.f72711W0.setSelection(this.f72715a1);
        this.f72715a1 = -1;
    }

    /* renamed from: zM */
    public /* synthetic */ void m78799zM() {
        int i11;
        m78802HM(AbstractC8020f0.empty_list);
        this.f72720f1.m36390a(this.f72716b1);
        this.f72720f1.notifyDataSetChanged();
        m78803IM(false);
        if (this.f72716b1.size() > 0) {
            TextView textView = this.f72705Q0;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_refix_number_of_friend);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f72722h1);
            if (this.f72722h1 > 1) {
                i11 = AbstractC8020f0.str_more_s;
            } else {
                i11 = AbstractC8020f0.str_single_form;
            }
            objArr[1] = AbstractC23136l9.m118743r0(i11);
            textView.setText(String.format(m118743r0, objArr));
        }
        if (this.f72715a1 >= 0 && this.f72720f1.getCount() > 0) {
            this.f72711W0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.g6
                public /* synthetic */ RunnableC15651g6() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChooseMultiFriendsView.this.m78798yM();
                }
            }, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList<String> arrayList;
        super.mo37111CJ(bundle);
        boolean z16 = true;
        m92637BK(true);
        this.f72734t1 = new C23528a(this.f72421L0.m92648SI());
        this.f72421L0.m92676n2().mo35554O(32);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("fromHiddenListActivity") && m92642L3.getBoolean("fromHiddenListActivity")) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f72727m1 = z11;
            if (m92642L3.containsKey("fromBlackListActivity") && m92642L3.getBoolean("fromBlackListActivity")) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f72728n1 = z12;
            if (m92642L3.containsKey("fromStoryBlockList") && m92642L3.getBoolean("fromStoryBlockList")) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f72729o1 = z13;
            if (m92642L3.containsKey("fromSettingNotiFeed") && m92642L3.getBoolean("fromSettingNotiFeed")) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f72730p1 = z14;
            if (m92642L3.containsKey("fromSettingMutedCallers") && m92642L3.getBoolean("fromSettingMutedCallers")) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f72731q1 = z15;
            if (!m92642L3.containsKey("fromSettingNotiStory") || !m92642L3.getBoolean("fromSettingNotiStory")) {
                z16 = false;
            }
            this.f72732r1 = z16;
            if (m92642L3.containsKey("fromSettingNotiFeedArrUid")) {
                arrayList = m92642L3.getStringArrayList("fromSettingNotiFeedArrUid");
            } else {
                arrayList = new ArrayList<>();
            }
            this.f72718d1 = arrayList;
            int i11 = -1;
            if (m92642L3.containsKey("intExtraTrackingSource")) {
                i11 = m92642L3.getInt("intExtraTrackingSource", -1);
            }
            this.f72735u1 = i11;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            C8009j.a aVar = new C8009j.a(getContext());
            aVar.m43159h(4).m43162k(AbstractC23136l9.m118746s0(AbstractC8020f0.str_call_setting_notif_except_exceed_limit, Integer.valueOf(C25244a.m130642v()))).m43169r(AbstractC8020f0.str_call_setting_notif_except_exceed_limit_confirm, new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        return super.mo39014DJ(i11);
    }

    /* renamed from: FM */
    void m78800FM() {
        this.f72725k1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.d6
            public /* synthetic */ RunnableC15540d6() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChooseMultiFriendsView.this.m78797xM();
            }
        }, 300L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.choose_multi_friend_list_view, viewGroup, false);
        m78812tM(inflate, bundle);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea A[Catch: all -> 0x000e, Exception -> 0x0011, TryCatch #5 {Exception -> 0x0011, blocks: (B:3:0x0002, B:5:0x0006, B:6:0x0014, B:19:0x0061, B:98:0x02c7, B:33:0x02ca, B:146:0x02ce, B:148:0x02d6, B:150:0x02da, B:152:0x030e, B:158:0x02de, B:160:0x02ea, B:164:0x005e), top: B:2:0x0002, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: GM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m78801GM() {
        InterfaceC27218a m92676n2;
        RunnableC15614f6 runnableC15614f6;
        int size;
        int i11;
        String str;
        C18635e m98553p;
        try {
            try {
                if (this.f72716b1 == null) {
                    this.f72716b1 = new ArrayList();
                }
                this.f72715a1 = -1;
                this.f72716b1.clear();
                this.f72722h1 = 0;
                try {
                    m98553p = C18644n.m98531l().m98553p();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                m92676n2 = this.f72421L0.m92676n2();
                runnableC15614f6 = new Runnable() { // from class: com.zing.zalo.ui.zviews.f6
                    public /* synthetic */ RunnableC15614f6() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChooseMultiFriendsView.this.m78799zM();
                    }
                };
            }
            if (!m98553p.isEmpty() && (m98553p.size() != 1 || m98553p.get(0) == 0 || !AbstractC25495a.m132086k(((ContactProfile) m98553p.get(0)).f42434r))) {
                this.f72709U0.setVisibility(0);
                C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                size = mo98465a.size();
                int i12 = -1;
                int i13 = 0;
                boolean z11 = false;
                for (i11 = 0; i11 < size; i11++) {
                    try {
                        ContactProfile contactProfile = (ContactProfile) mo98465a.get(i11);
                        if (contactProfile != null) {
                            InviteContactProfile inviteContactProfile = new InviteContactProfile(contactProfile);
                            if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && ((!this.f72728n1 || !C21912a.m114159g().m114169j(inviteContactProfile.f42434r)) && ((!this.f72727m1 || !C21937w.f108027a.m114574m(inviteContactProfile.f42434r)) && ((!this.f72729o1 || !C21927m.m114302u().m114309G().m153137g(inviteContactProfile.f42434r)) && (!this.f72732r1 || !C25244a.f121072a.m130656t(inviteContactProfile.f42434r)))))) {
                                String str2 = "" + inviteContactProfile.f42440t.trim().charAt(0);
                                Locale locale = Locale.ENGLISH;
                                char charAt = str2.toUpperCase(locale).charAt(0);
                                i12++;
                                if (i12 != 0) {
                                    try {
                                        char charAt2 = ("" + ((ContactProfile) mo98465a.get(i13)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                        if (this.f72723i1.indexOf(charAt2) != -1) {
                                            if (charAt > charAt2) {
                                                if (this.f72723i1.indexOf(charAt) != -1) {
                                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                                    inviteContactProfile2.f42437s = "" + charAt;
                                                    inviteContactProfile2.m40403e1(false);
                                                    if (!z11) {
                                                        inviteContactProfile2.f42407e1 = true;
                                                        z11 = true;
                                                    }
                                                    int size2 = this.f72716b1.size();
                                                    if (size2 > 0) {
                                                        int i14 = size2 - 1;
                                                        if (((InviteContactProfile) this.f72716b1.get(i14)).m40366G0()) {
                                                            ((InviteContactProfile) this.f72716b1.get(i14)).f42405d1 = true;
                                                        }
                                                    }
                                                    this.f72716b1.add(inviteContactProfile2);
                                                } else {
                                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                                    if (this.f72723i1.indexOf(charAt) == -1) {
                                                        str = "##";
                                                    } else {
                                                        str = "" + charAt;
                                                    }
                                                    inviteContactProfile3.f42437s = str;
                                                    inviteContactProfile3.m40403e1(false);
                                                    if (!z11) {
                                                        inviteContactProfile3.f42407e1 = true;
                                                        z11 = true;
                                                    }
                                                    inviteContactProfile3.f42403c1 = false;
                                                    this.f72716b1.add(inviteContactProfile3);
                                                }
                                            }
                                        } else if (this.f72723i1.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                            inviteContactProfile4.f42437s = "" + charAt;
                                            inviteContactProfile4.m40403e1(false);
                                            if (!z11) {
                                                inviteContactProfile4.f42407e1 = true;
                                                z11 = true;
                                            }
                                            int size3 = this.f72716b1.size();
                                            if (size3 > 0) {
                                                int i15 = size3 - 1;
                                                if (((InviteContactProfile) this.f72716b1.get(i15)).m40366G0()) {
                                                    ((InviteContactProfile) this.f72716b1.get(i15)).f42405d1 = true;
                                                }
                                            }
                                            this.f72716b1.add(inviteContactProfile4);
                                        }
                                    } catch (Exception e13) {
                                        AbstractC20110a.m104539h(e13);
                                    }
                                } else {
                                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                                    if (this.f72723i1.indexOf(charAt) == -1) {
                                        inviteContactProfile5.f42437s = "#";
                                    } else {
                                        inviteContactProfile5.f42437s = "" + charAt;
                                    }
                                    inviteContactProfile5.m40403e1(false);
                                    if (!z11) {
                                        inviteContactProfile5.f42407e1 = true;
                                        z11 = true;
                                    }
                                    this.f72716b1.add(inviteContactProfile5);
                                }
                                inviteContactProfile.f42399a1.clear();
                                this.f72716b1.add(inviteContactProfile);
                                this.f72722h1++;
                                try {
                                    if (this.f72715a1 == -1 && !TextUtils.isEmpty(this.f72714Z0) && this.f72714Z0.equals(inviteContactProfile.f42434r)) {
                                        this.f72715a1 = this.f72716b1.size() - 1;
                                        this.f72714Z0 = "";
                                    }
                                    ArrayList arrayList = this.f72717c1;
                                    if (arrayList != null && arrayList.contains(inviteContactProfile.f42434r)) {
                                        if (!this.f72719e1.contains(inviteContactProfile)) {
                                            this.f72719e1.add(inviteContactProfile);
                                            this.f72708T0.m35846M(this.f72719e1);
                                            this.f72708T0.m10008p();
                                        }
                                        HashMap hashMap = this.f72724j1;
                                        if (hashMap != null && !hashMap.containsKey(inviteContactProfile.f42434r)) {
                                            this.f72724j1.put(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                                        }
                                    }
                                    i13 = i11;
                                } catch (Exception e14) {
                                    e = e14;
                                    i13 = i11;
                                    AbstractC20110a.m104539h(e);
                                }
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                }
                this.f72721g1 = this.f72722h1;
                if (!this.f72728n1 || this.f72727m1 || this.f72732r1) {
                    int size4 = this.f72719e1.size();
                    if (m87077NK() != null) {
                        m87077NK().setMiddleSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_count_character_invitation), Integer.valueOf(size4), Integer.valueOf(m78793sM())));
                    }
                }
                m78811rM();
                m92676n2 = this.f72421L0.m92676n2();
                runnableC15614f6 = new Runnable() { // from class: com.zing.zalo.ui.zviews.f6
                    public /* synthetic */ RunnableC15614f6() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChooseMultiFriendsView.this.m78799zM();
                    }
                };
                m92676n2.runOnUiThread(runnableC15614f6);
                this.f72736v1 = C18644n.m98531l().m98555r();
            }
            this.f72707S0.setVisibility(8);
            this.f72709U0.setVisibility(8);
            C18635e mo98465a2 = C18644n.m98531l().mo98465a(null, false);
            size = mo98465a2.size();
            int i122 = -1;
            int i132 = 0;
            boolean z112 = false;
            while (i11 < size) {
            }
            this.f72721g1 = this.f72722h1;
            if (!this.f72728n1) {
            }
            int size42 = this.f72719e1.size();
            if (m87077NK() != null) {
            }
            m78811rM();
            m92676n2 = this.f72421L0.m92676n2();
            runnableC15614f6 = new Runnable() { // from class: com.zing.zalo.ui.zviews.f6
                public /* synthetic */ RunnableC15614f6() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChooseMultiFriendsView.this.m78799zM();
                }
            };
            m92676n2.runOnUiThread(runnableC15614f6);
            this.f72736v1 = C18644n.m98531l().m98555r();
        } catch (Throwable th2) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.f6
                public /* synthetic */ RunnableC15614f6() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChooseMultiFriendsView.this.m78799zM();
                }
            });
            this.f72736v1 = C18644n.m98531l().m98555r();
            throw th2;
        }
    }

    /* renamed from: HM */
    void m78802HM(int i11) {
        this.f72706R0.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
    }

    /* renamed from: IM */
    void m78803IM(boolean z11) {
        this.f72705Q0.setVisibility(0);
        if (z11) {
            this.f72711W0.setVisibility(8);
            this.f72705Q0.setVisibility(8);
            this.f72706R0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f72706R0.setVisibility(0);
            return;
        }
        C7156o c7156o = this.f72720f1;
        if (c7156o != null && c7156o.getCount() > 0) {
            this.f72706R0.setVisibility(8);
            this.f72711W0.setVisibility(0);
        } else {
            this.f72711W0.setVisibility(8);
            this.f72705Q0.setVisibility(8);
            this.f72706R0.setState(MultiStateView.EnumC15914e.EMPTY);
            this.f72706R0.setVisibility(0);
        }
    }

    /* renamed from: JM */
    void m78804JM(int i11) {
        this.f72706R0.setLoadingString(AbstractC23136l9.m118743r0(i11));
    }

    /* renamed from: MM */
    void m78805MM(List list) {
        try {
            if (this.f72699B1) {
                return;
            }
            C25244a.m130645z("setting_notification");
            if (C23055e5.m118272g(true)) {
                this.f72699B1 = true;
                mo46829Y();
                C25244a.m130634k(list, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.h6
                    public /* synthetic */ C15688h6() {
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public final Object mo205i9(Object obj) {
                        C24848g0 m78779BM;
                        m78779BM = ChooseMultiFriendsView.this.m78779BM((Boolean) obj);
                        return m78779BM;
                    }
                });
            } else {
                this.f72699B1 = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7156o.a
    /* renamed from: N */
    public boolean mo36391N(String str) {
        return this.f72724j1.containsKey(str);
    }

    /* renamed from: NM */
    void m78806NM(List list) {
        try {
            if (this.f72699B1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f72699B1 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14155e(list));
                if (list.isEmpty()) {
                    c0766k.mo1562W4(14, 1, null);
                    m78781DM();
                } else {
                    c0766k.mo1562W4(14, 2, list);
                    m78780CM();
                }
            } else {
                this.f72699B1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo49315c4();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            this.f72740z1 = m87077NK;
            if (m87077NK != null) {
                m87077NK.setLeadingFunctionCallback(new C14153c());
                this.f72740z1.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_broadcast_VIP));
                if (!this.f72727m1) {
                    if (!this.f72728n1) {
                        if (!this.f72729o1) {
                            if (this.f72732r1) {
                            }
                            m78783KM();
                            this.f72740z1.setCustomTrailingItem(this.f72698A1);
                            m78811rM();
                        }
                    }
                }
                this.f72740z1.setMiddleSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_count_character_invitation), 0, Integer.valueOf(m78793sM())));
                ZdsActionBar zdsActionBar = this.f72740z1;
                zdsActionBar.setMiddleSubTitleTextColor(C23212s8.m119607o(zdsActionBar.getContext(), AbstractC21196a.TextColor1));
                m78783KM();
                this.f72740z1.setCustomTrailingItem(this.f72698A1);
                m78811rM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    void m78807OM(List list) {
        try {
            if (this.f72699B1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f72699B1 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14156f(list));
                if (list.isEmpty()) {
                    c0766k.mo1562W4(16, 1, null);
                } else {
                    c0766k.mo1562W4(16, 2, list);
                }
            } else {
                this.f72699B1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            this.f72736v1 = C18644n.m98531l().m98555r();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            HashMap hashMap = this.f72724j1;
            if (hashMap != null && hashMap.size() > 0) {
                if (this.f72717c1 == null) {
                    this.f72717c1 = new ArrayList();
                }
                this.f72717c1.clear();
                Iterator it = this.f72724j1.entrySet().iterator();
                while (it.hasNext()) {
                    this.f72717c1.add((String) ((Map.Entry) it.next()).getKey());
                }
                bundle.putStringArrayList("arrItemSeltected", this.f72717c1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f72704P0, e11);
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.adapters.C7079h.b
    public Context getContext() {
        return this.f72421L0.m92648SI();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChooseMultiFriendsView";
    }

    /* renamed from: oM */
    void m78808oM(String str) {
        if (this.f72700C1) {
            return;
        }
        this.f72700C1 = true;
        this.f72701D1.mo1704o8(this.f72702E1);
        InterfaceC0765j interfaceC0765j = this.f72701D1;
        int i11 = this.f72735u1;
        if (i11 == -1) {
            i11 = 150;
        }
        interfaceC0765j.mo1481M3(str, new TrackingSource(i11));
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m78800FM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pM */
    void m78809pM(List list) {
        C26853c c26853c = new C26853c();
        int i11 = this.f72735u1;
        if (i11 == -1) {
            i11 = 150;
        }
        c26853c.m101508a(new C26853c.b(list, new TrackingSource(i11), getLifecycle(), new C14158h()));
    }

    /* renamed from: qM */
    void m78810qM(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            if (this.f72703F1 == null) {
                this.f72703F1 = new C22035l0(new C14159i());
            }
            C22035l0 c22035l0 = this.f72703F1;
            if (c22035l0.f108541e) {
                return;
            }
            int i11 = this.f72735u1;
            if (i11 == -1) {
                i11 = 150;
            }
            c22035l0.m115023b(arrayList, new TrackingSource(i11));
        }
    }

    /* renamed from: rM */
    void m78811rM() {
        ZAppCompatImageView zAppCompatImageView;
        try {
            if (m87077NK() != null) {
                if (!this.f72730p1 && !this.f72731q1) {
                    if (this.f72724j1 != null && (zAppCompatImageView = this.f72698A1) != null) {
                        zAppCompatImageView.setEnabled(!r0.isEmpty());
                    }
                }
                this.f72698A1.setEnabled(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: tM */
    void m78812tM(View view, Bundle bundle) {
        View findViewById = view.findViewById(AbstractC6918a0.separate_top_view);
        this.f72710V0 = findViewById;
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.rv_bubbles);
        this.f72707S0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
        RecyclerView recyclerView2 = this.f72707S0;
        C7005a5 c7005a5 = new C7005a5();
        this.f72708T0 = c7005a5;
        recyclerView2.setAdapter(c7005a5);
        C31784b.m152808a(this.f72707S0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.b6
            public /* synthetic */ C15463b6() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView3, int i11, View view2) {
                ChooseMultiFriendsView.this.m78795vM(recyclerView3, i11, view2);
            }
        });
        EditText editText = (EditText) view.findViewById(AbstractC6918a0.edt_search);
        this.f72709U0 = editText;
        editText.addTextChangedListener(this.f72738x1);
        this.f72711W0 = (ListView) view.findViewById(AbstractC6918a0.lv_friend);
        LinearLayout linearLayout = (LinearLayout) this.f72421L0.m92676n2().getLayoutInflater().inflate(AbstractC7409c0.friend_count_row, (ViewGroup) null, false);
        this.f72705Q0 = (TextView) linearLayout.findViewById(AbstractC6918a0.num_friend);
        this.f72711W0.addFooterView(linearLayout);
        this.f72711W0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.c6
            public /* synthetic */ C15499c6() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                ChooseMultiFriendsView.this.m78796wM(adapterView, view2, i11, j11);
            }
        });
        this.f72711W0.setOnScrollListener(new C14154d());
        C7156o c7156o = new C7156o(this, this.f72716b1, this.f72734t1);
        this.f72720f1 = c7156o;
        this.f72711W0.setAdapter((ListAdapter) c7156o);
        this.f72706R0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        m78802HM(AbstractC8020f0.empty_list);
        m78804JM(AbstractC8020f0.str_tv_findingFriend);
        ArrayList arrayList = this.f72717c1;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f72718d1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            this.f72717c1 = new ArrayList(this.f72718d1);
            m78784LM();
            this.f72707S0.setVisibility(0);
            this.f72725k1.post(this.f72739y1);
            this.f72710V0.setVisibility(0);
        }
        if (bundle != null && bundle.containsKey("arrItemSeltected")) {
            this.f72717c1 = bundle.getStringArrayList("arrItemSeltected");
            m78784LM();
        }
        AbstractC23126l.m118627a(this.f72704P0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m78801GM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
