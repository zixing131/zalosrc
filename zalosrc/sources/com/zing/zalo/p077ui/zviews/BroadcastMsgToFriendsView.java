package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7090i;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.BroadcastMsgToFriendsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import ed0.AbstractC18391a;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p716zh.C32093r8;
import p716zh.InterfaceC32149v8;
import vg.AbstractC28034c7;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class BroadcastMsgToFriendsView extends SlidableZaloView implements C7090i.a, InterfaceC0733x {

    /* renamed from: Q0 */
    TextView f72468Q0;

    /* renamed from: R0 */
    EditText f72469R0;

    /* renamed from: S0 */
    LinearLayout f72470S0;

    /* renamed from: T0 */
    LinearLayout f72471T0;

    /* renamed from: U0 */
    RecyclerView f72472U0;

    /* renamed from: V0 */
    C7005a5 f72473V0;

    /* renamed from: Z0 */
    ListView f72477Z0;

    /* renamed from: a1 */
    C7090i f72478a1;

    /* renamed from: b1 */
    MultiStateView f72479b1;

    /* renamed from: d1 */
    int f72481d1;

    /* renamed from: i1 */
    C23528a f72486i1;

    /* renamed from: l1 */
    View f72489l1;

    /* renamed from: m1 */
    InterfaceC32149v8 f72490m1;

    /* renamed from: n1 */
    ImageView f72491n1;

    /* renamed from: o1 */
    View f72492o1;

    /* renamed from: p1 */
    ValueAnimator f72493p1;

    /* renamed from: q1 */
    ValueAnimator f72494q1;

    /* renamed from: r1 */
    ViewTreeObserver.OnGlobalLayoutListener f72495r1;

    /* renamed from: P0 */
    final String f72467P0 = BroadcastMsgToFriendsView.class.getSimpleName();

    /* renamed from: W0 */
    ArrayList f72474W0 = new ArrayList();

    /* renamed from: X0 */
    ArrayList f72475X0 = new ArrayList();

    /* renamed from: Y0 */
    HashMap f72476Y0 = new HashMap();

    /* renamed from: c1 */
    ArrayList f72480c1 = new ArrayList();

    /* renamed from: e1 */
    String f72482e1 = "";

    /* renamed from: f1 */
    int f72483f1 = 0;

    /* renamed from: g1 */
    final String f72484g1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: h1 */
    Handler f72485h1 = new Handler(Looper.getMainLooper());

    /* renamed from: j1 */
    boolean f72487j1 = false;

    /* renamed from: k1 */
    Map f72488k1 = Collections.synchronizedMap(new HashMap());

    /* renamed from: s1 */
    TextWatcher f72496s1 = new C14118a();

    /* renamed from: t1 */
    boolean f72497t1 = false;

    /* renamed from: u1 */
    InterfaceC0765j f72498u1 = new C0766k();

    /* renamed from: v1 */
    InterfaceC20094a f72499v1 = new C14122e();

    /* renamed from: w1 */
    boolean f72500w1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$a */
    /* loaded from: classes6.dex */
    class C14118a extends AbstractC18391a {
        C14118a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            EditText editText = BroadcastMsgToFriendsView.this.f72469R0;
            if (editText != null && editText.getText() != null) {
                new C14124g(BroadcastMsgToFriendsView.this.f72469R0.getText().toString().trim());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$b */
    /* loaded from: classes6.dex */
    public class C14119b extends AnimatorListenerAdapter {
        C14119b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BroadcastMsgToFriendsView.this.f72492o1.setVisibility(0);
            BroadcastMsgToFriendsView.this.m78570yM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$c */
    /* loaded from: classes6.dex */
    public class C14120c extends AnimatorListenerAdapter {
        C14120c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BroadcastMsgToFriendsView.this.f72470S0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$d */
    /* loaded from: classes6.dex */
    public class C14121d extends AbstractC28034c7 {
        C14121d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    BroadcastMsgToFriendsView.this.f72478a1.m36159c(false);
                    BroadcastMsgToFriendsView.this.f72478a1.notifyDataSetChanged();
                } else {
                    BroadcastMsgToFriendsView.this.f72478a1.m36159c(true);
                    AbstractC2379w.m12430d(BroadcastMsgToFriendsView.this.f72469R0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$e */
    /* loaded from: classes6.dex */
    class C14122e implements InterfaceC20094a {
        C14122e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ArrayList arrayList = BroadcastMsgToFriendsView.this.f72475X0;
            if (arrayList != null) {
                arrayList.clear();
            }
            BroadcastMsgToFriendsView broadcastMsgToFriendsView = BroadcastMsgToFriendsView.this;
            broadcastMsgToFriendsView.f72497t1 = false;
            if (broadcastMsgToFriendsView.f72421L0.m92648SI() != null && BroadcastMsgToFriendsView.this.f72421L0.m92674mJ() && !BroadcastMsgToFriendsView.this.f72421L0.m92681pJ()) {
                ToastUtils.m89264l(c20096c);
            }
            BroadcastMsgToFriendsView.this.f72421L0.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (BroadcastMsgToFriendsView.this.f72421L0.m92648SI() != null && BroadcastMsgToFriendsView.this.f72421L0.m92674mJ() && !BroadcastMsgToFriendsView.this.f72421L0.m92681pJ()) {
                        ToastUtils.showMess(BroadcastMsgToFriendsView.this.m92652XI(AbstractC8020f0.str_msg_broadcastMsgSuccessfull));
                    }
                    BroadcastMsgToFriendsView broadcastMsgToFriendsView = BroadcastMsgToFriendsView.this;
                    Handler handler = broadcastMsgToFriendsView.f72485h1;
                    if (handler != null) {
                        handler.postDelayed(broadcastMsgToFriendsView.f88750Q, 500L);
                    }
                    ArrayList arrayList = BroadcastMsgToFriendsView.this.f72475X0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                BroadcastMsgToFriendsView broadcastMsgToFriendsView2 = BroadcastMsgToFriendsView.this;
                broadcastMsgToFriendsView2.f72497t1 = false;
                broadcastMsgToFriendsView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                BroadcastMsgToFriendsView broadcastMsgToFriendsView3 = BroadcastMsgToFriendsView.this;
                broadcastMsgToFriendsView3.f72497t1 = false;
                broadcastMsgToFriendsView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$f */
    /* loaded from: classes6.dex */
    public class C14123f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f72506a;

        /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$f$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f72508a;

            a(String str) {
                this.f72508a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42413h8(this.f72508a);
            }
        }

        C14123f(ArrayList arrayList) {
            this.f72506a = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m78589d() {
            try {
                BroadcastMsgToFriendsView broadcastMsgToFriendsView = BroadcastMsgToFriendsView.this;
                InterfaceC32149v8 interfaceC32149v8 = broadcastMsgToFriendsView.f72490m1;
                if (interfaceC32149v8 != null) {
                    interfaceC32149v8.onActivityResult(10010, -1, null);
                } else {
                    broadcastMsgToFriendsView.f72421L0.mo50035CK(-1, null);
                }
                BroadcastMsgToFriendsView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(BroadcastMsgToFriendsView.this.m92652XI(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                BroadcastMsgToFriendsView broadcastMsgToFriendsView = BroadcastMsgToFriendsView.this;
                broadcastMsgToFriendsView.f72500w1 = z11;
                broadcastMsgToFriendsView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            Integer num = (Integer) jSONArray.get(i11);
                            if (this.f72506a.contains(num)) {
                                this.f72506a.remove(num);
                            }
                        }
                        if (this.f72506a.isEmpty()) {
                            ToastUtils.showMess(BroadcastMsgToFriendsView.this.m92652XI(AbstractC8020f0.str_cant_add_favorite_friend));
                        }
                        int size = this.f72506a.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            String valueOf = String.valueOf(this.f72506a.get(i12));
                            if (!C21927m.m114302u().m114351p().contains(valueOf)) {
                                C21927m.m114302u().m114351p().add(valueOf);
                                AbstractC21935u.m114527Q(valueOf);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            C0824j.m2153b(new a(valueOf));
                            ContactProfile m98552o = C18644n.m98531l().m98552o(valueOf);
                            if (m98552o != null) {
                                String m114539f = AbstractC21935u.m114539f(m98552o.f42455y, valueOf, m98552o.f42437s);
                                String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_add_favorite_friend), m114539f, m114539f);
                                if (!z11) {
                                    AbstractC19646n0.m103026s0(valueOf, format);
                                }
                            }
                        }
                        Handler handler = BroadcastMsgToFriendsView.this.f72485h1;
                        if (handler != null) {
                            handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BroadcastMsgToFriendsView.C14123f.this.m78589d();
                                }
                            }, 100L);
                        }
                    } else {
                        ToastUtils.showMess(BroadcastMsgToFriendsView.this.m92652XI(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                BroadcastMsgToFriendsView broadcastMsgToFriendsView = BroadcastMsgToFriendsView.this;
                broadcastMsgToFriendsView.f72500w1 = false;
                broadcastMsgToFriendsView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastMsgToFriendsView$g */
    /* loaded from: classes6.dex */
    public class C14124g extends Thread {

        /* renamed from: p */
        final String f72510p;

        /* renamed from: q */
        int f72511q;

        public C14124g(String str) {
            super("Z:BroadcastMsgToFriends-Search");
            this.f72511q = 0;
            this.f72510p = str;
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m78592c() {
            if (TextUtils.isEmpty(BroadcastMsgToFriendsView.this.f72469R0.getText().toString().trim())) {
                BroadcastMsgToFriendsView.this.m78575NM();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m78593d(ArrayList arrayList) {
            ListView listView;
            int i11;
            try {
                if (this.f72510p.equals(BroadcastMsgToFriendsView.this.f72469R0.getText().toString().trim())) {
                    BroadcastMsgToFriendsView broadcastMsgToFriendsView = BroadcastMsgToFriendsView.this;
                    broadcastMsgToFriendsView.f72480c1 = arrayList;
                    int i12 = this.f72511q;
                    broadcastMsgToFriendsView.f72483f1 = i12;
                    if (i12 > 0) {
                        TextView textView = broadcastMsgToFriendsView.f72468Q0;
                        String m92652XI = broadcastMsgToFriendsView.m92652XI(AbstractC8020f0.str_refix_number_of_friend);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(BroadcastMsgToFriendsView.this.f72483f1);
                        BroadcastMsgToFriendsView broadcastMsgToFriendsView2 = BroadcastMsgToFriendsView.this;
                        if (broadcastMsgToFriendsView2.f72483f1 > 1) {
                            i11 = AbstractC8020f0.str_more_s;
                        } else {
                            i11 = AbstractC8020f0.str_single_form;
                        }
                        objArr[1] = broadcastMsgToFriendsView2.m92652XI(i11);
                        textView.setText(String.format(m92652XI, objArr));
                    }
                    BroadcastMsgToFriendsView broadcastMsgToFriendsView3 = BroadcastMsgToFriendsView.this;
                    broadcastMsgToFriendsView3.f72478a1.m36158b(broadcastMsgToFriendsView3.f72480c1);
                    BroadcastMsgToFriendsView.this.f72478a1.notifyDataSetChanged();
                    BroadcastMsgToFriendsView.this.m78579RM(AbstractC8020f0.str_emptyResult);
                    BroadcastMsgToFriendsView.this.m78576OM(false);
                    ArrayList arrayList2 = BroadcastMsgToFriendsView.this.f72480c1;
                    if (arrayList2 != null && !arrayList2.isEmpty() && (listView = BroadcastMsgToFriendsView.this.f72477Z0) != null) {
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
            boolean z11;
            try {
                final ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String str = this.f72510p;
                if (str != null && !str.equals("")) {
                    String m120002o = AbstractC23262x6.m120002o(this.f72510p);
                    String[] m119967B = AbstractC23262x6.m119967B(m120002o);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList4 = new ArrayList();
                    if (!BroadcastMsgToFriendsView.this.f72488k1.containsKey(m120002o)) {
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
                                BroadcastMsgToFriendsView.this.f72488k1.put(m120002o, arrayList4);
                            }
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = (ArrayList) BroadcastMsgToFriendsView.this.f72488k1.get(m120002o);
                    }
                    String str2 = BroadcastMsgToFriendsView.this.f72467P0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("TimeCheckTopHit: ");
                    sb2.append(System.currentTimeMillis() - currentTimeMillis);
                    C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                    if (AbstractC23309i.m122127lb() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC23262x6.m120004q(m120002o, mo98465a, arrayList3, z11, C19669z.f97573U, arrayList);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) arrayList3.get(i12);
                        try {
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i)) {
                            if (!AbstractC25495a.m132086k(inviteContactProfile.f42434r)) {
                                if (!inviteContactProfile.m40372J0()) {
                                    if (!C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r)) {
                                        if (BroadcastMsgToFriendsView.this.f72487j1 && C21927m.m114302u().m114351p() != null && C21927m.m114302u().m114351p().contains(inviteContactProfile.f42434r)) {
                                        }
                                        arrayList2.add(inviteContactProfile);
                                        this.f72511q++;
                                    }
                                }
                            }
                        }
                    }
                    if (BroadcastMsgToFriendsView.this.f72421L0.m92676n2() != null) {
                        BroadcastMsgToFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n3
                            @Override // java.lang.Runnable
                            public final void run() {
                                BroadcastMsgToFriendsView.C14124g.this.m78593d(arrayList2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (BroadcastMsgToFriendsView.this.f72421L0.m92676n2() != null) {
                    BroadcastMsgToFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.m3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastMsgToFriendsView.C14124g.this.m78592c();
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m78546AM() {
        try {
            this.f72472U0.mo9854S1(this.f72474W0.size() - 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m78547BM(ValueAnimator valueAnimator) {
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f72470S0.setTranslationY(r0.getHeight() * floatValue);
            this.f72470S0.setAlpha(1.0f - floatValue);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m78548CM(ValueAnimator valueAnimator) {
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f72470S0.setTranslationY(r0.getHeight() * floatValue);
            this.f72470S0.setAlpha(1.0f - floatValue);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m78549DM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            this.f72481d1 = i11 - this.f72477Z0.getHeaderViewsCount();
            C7090i c7090i = this.f72478a1;
            if (c7090i != null && c7090i.getCount() > 0) {
                m78585uM((InviteContactProfile) this.f72478a1.getItem(this.f72481d1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m78550EM(RecyclerView recyclerView, int i11, View view) {
        try {
            m78585uM((InviteContactProfile) this.f72474W0.get(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m78551FM() {
        LinearLayout linearLayout = this.f72471T0;
        if (linearLayout != null && linearLayout.getHeight() > 0) {
            m78556UM();
            m78580SM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m78552GM(View view) {
        AbstractC2379w.m12430d(this.f72469R0);
        m78574MM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m78553HM() {
        int i11;
        m78579RM(AbstractC8020f0.empty_list);
        if (this.f72480c1.size() > 0) {
            TextView textView = this.f72468Q0;
            String m92652XI = m92652XI(AbstractC8020f0.str_refix_number_of_friend);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f72483f1);
            if (this.f72483f1 > 1) {
                i11 = AbstractC8020f0.str_more_s;
            } else {
                i11 = AbstractC8020f0.str_single_form;
            }
            objArr[1] = m92652XI(i11);
            textView.setText(String.format(m92652XI, objArr));
            EditText editText = this.f72469R0;
            if (editText != null) {
                editText.setVisibility(0);
            }
        } else {
            EditText editText2 = this.f72469R0;
            if (editText2 != null) {
                editText2.setVisibility(8);
            }
        }
        this.f72478a1.m36158b(this.f72480c1);
        this.f72478a1.notifyDataSetChanged();
        m78576OM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m78554IM() {
        try {
            m78581TM(8);
            m78579RM(AbstractC8020f0.empty_list);
            this.f72469R0.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m78555JM() {
        try {
            this.f72469R0.setVisibility(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UM */
    private void m78556UM() {
        try {
            LinearLayout linearLayout = this.f72471T0;
            if (linearLayout != null && this.f72495r1 != null) {
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f72495r1);
                this.f72495r1 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    private void m78569vM() {
        C14119b c14119b = new C14119b();
        C14120c c14120c = new C14120c();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f72493p1 = ofFloat;
        ofFloat.setDuration(200L);
        this.f72493p1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.k3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BroadcastMsgToFriendsView.this.m78547BM(valueAnimator);
            }
        });
        this.f72493p1.addListener(c14119b);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f72494q1 = ofFloat2;
        ofFloat2.setDuration(200L);
        this.f72494q1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.b3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BroadcastMsgToFriendsView.this.m78548CM(valueAnimator);
            }
        });
        this.f72494q1.addListener(c14120c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public void m78570yM() {
        try {
            if (this.f72492o1.getLayoutParams().height != this.f72471T0.getHeight()) {
                this.f72492o1.getLayoutParams().height = this.f72471T0.getHeight();
                this.f72492o1.requestLayout();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m78571zM() {
        try {
            this.f72472U0.mo9854S1(this.f72474W0.size() - 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        boolean z11;
        super.mo37111CJ(bundle);
        try {
            if (this.f72421L0.m92642L3() != null) {
                if (this.f72421L0.m92642L3().containsKey("vipUid")) {
                    str = this.f72421L0.m92642L3().getString("vipUid");
                } else {
                    str = "";
                }
                this.f72482e1 = str;
                if (this.f72421L0.m92642L3().containsKey("bAddFavoriteGrid") && this.f72421L0.m92642L3().getBoolean("bAddFavoriteGrid")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f72487j1 = z11;
            }
            m92637BK(true);
            AbstractC23126l.m118627a(this.f72467P0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.broadcast_msg_to_friends_view_new, viewGroup, false);
        m78587xM(inflate, layoutInflater);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        m78556UM();
        super.mo37484JJ();
    }

    /* renamed from: KM */
    void m78572KM() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f72476Y0.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) ((Map.Entry) it.next()).getKey())));
            }
            if (arrayList.size() > 0) {
                m78583sM(arrayList);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    void m78573LM() {
        ContactProfile m141809c;
        try {
            if (this.f72475X0 == null) {
                this.f72475X0 = new ArrayList();
            }
            this.f72475X0.clear();
            Iterator it = this.f72476Y0.entrySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                this.f72475X0.add((String) ((Map.Entry) it.next()).getKey());
                i11++;
            }
            if (i11 == 0) {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_hint_chooseFriendToInvite));
                return;
            }
            if (C21927m.m114302u().m114318P(this.f72482e1)) {
                m141809c = C21927m.m114302u().m114357s().m153138j(this.f72482e1);
            } else {
                m141809c = C28203u6.f131407a.m141809c(this.f72482e1);
                if (!m141809c.m40387S0()) {
                    m141809c = null;
                }
            }
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42434r)) {
                String m103086b = AbstractC23306f.m120599M0().m103086b();
                String str = CoreUtility.f89233i;
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(m103086b, "", str, str), 0).m95382r(m141809c.f42458z).m95386v(1).m95368d(new C17969i0(m141809c.f42437s, 0, m141809c.f42446v, AbstractC23306f.m120583H().m110204g().m116324p(), m141809c.f42458z, "recommened.vip", m141809c.f42434r)).m95365a();
                m95365a.m94951M9();
                m78584tM(this.f72475X0.size(), this.f72475X0, m95365a);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: MM */
    void m78574MM() {
        if (!this.f72487j1) {
            m78573LM();
        } else {
            m78572KM();
        }
    }

    @Override // com.zing.zalo.adapters.C7090i.a
    /* renamed from: N */
    public boolean mo36161N(String str) {
        return this.f72476Y0.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: NM */
    public void m78575NM() {
        InterfaceC27218a m92676n2;
        Runnable runnable;
        String str;
        try {
            try {
                if (this.f72480c1 == null) {
                    this.f72480c1 = new ArrayList();
                }
                this.f72480c1.clear();
                this.f72483f1 = 0;
                int m122127lb = AbstractC23309i.m122127lb();
                C18635e mo98465a = C18644n.m98531l().mo98465a(null, this.f72487j1);
                int size = mo98465a.size();
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    try {
                        ContactProfile contactProfile = (ContactProfile) mo98465a.get(i13);
                        if (contactProfile != null) {
                            InviteContactProfile inviteContactProfile = new InviteContactProfile(contactProfile);
                            if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && ((ZaloListView.m86977gN() || !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r)) && ((!this.f72487j1 || C21927m.m114302u().m114351p() == null || !C21927m.m114302u().m114351p().contains(inviteContactProfile.f42434r)) && (m122127lb != 1 || inviteContactProfile.f42382U0 != 0)))) {
                                String str2 = "" + inviteContactProfile.f42440t.trim().charAt(0);
                                Locale locale = Locale.ENGLISH;
                                char charAt = str2.toUpperCase(locale).charAt(0);
                                i11++;
                                if (i11 != 0) {
                                    try {
                                        char charAt2 = ("" + ((ContactProfile) mo98465a.get(i12)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                        if (this.f72484g1.indexOf(charAt2) != -1) {
                                            if (charAt > charAt2) {
                                                if (this.f72484g1.indexOf(charAt) != -1) {
                                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                                    inviteContactProfile2.f42437s = "" + charAt;
                                                    inviteContactProfile2.m40403e1(false);
                                                    int size2 = this.f72480c1.size();
                                                    if (size2 > 0) {
                                                        int i14 = size2 - 1;
                                                        if (((InviteContactProfile) this.f72480c1.get(i14)).m40366G0()) {
                                                            ((InviteContactProfile) this.f72480c1.get(i14)).f42405d1 = true;
                                                        }
                                                    }
                                                    this.f72480c1.add(inviteContactProfile2);
                                                } else {
                                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                                    if (this.f72484g1.indexOf(charAt) == -1) {
                                                        str = "##";
                                                    } else {
                                                        str = "" + charAt;
                                                    }
                                                    inviteContactProfile3.f42437s = str;
                                                    inviteContactProfile3.m40403e1(false);
                                                    inviteContactProfile3.f42403c1 = false;
                                                    this.f72480c1.add(inviteContactProfile3);
                                                }
                                            }
                                        } else if (this.f72484g1.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                            inviteContactProfile4.f42437s = "" + charAt;
                                            inviteContactProfile4.m40403e1(false);
                                            int size3 = this.f72480c1.size();
                                            if (size3 > 0) {
                                                int i15 = size3 - 1;
                                                if (((InviteContactProfile) this.f72480c1.get(i15)).m40366G0()) {
                                                    ((InviteContactProfile) this.f72480c1.get(i15)).f42405d1 = true;
                                                }
                                            }
                                            this.f72480c1.add(inviteContactProfile4);
                                        }
                                    } catch (Exception e11) {
                                        AbstractC20110a.m104539h(e11);
                                    }
                                } else {
                                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                                    if (this.f72484g1.indexOf(charAt) == -1) {
                                        inviteContactProfile5.f42437s = "#";
                                    } else {
                                        inviteContactProfile5.f42437s = "" + charAt;
                                    }
                                    inviteContactProfile5.m40403e1(false);
                                    this.f72480c1.add(inviteContactProfile5);
                                }
                                inviteContactProfile.f42399a1.clear();
                                this.f72480c1.add(inviteContactProfile);
                                this.f72483f1++;
                                try {
                                    HashMap hashMap = this.f72476Y0;
                                    if (hashMap != null && hashMap.containsKey(inviteContactProfile.f42434r) && !this.f72474W0.contains(inviteContactProfile)) {
                                        this.f72474W0.add(inviteContactProfile);
                                        this.f72473V0.m35846M(this.f72474W0);
                                        this.f72473V0.m10008p();
                                    }
                                    i12 = i13;
                                } catch (Exception e12) {
                                    e = e12;
                                    i12 = i13;
                                    AbstractC20110a.m104539h(e);
                                }
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                }
                if (this.f72487j1) {
                    m78582VM(this.f72474W0.size());
                }
                if (!this.f72474W0.isEmpty()) {
                    m78581TM(0);
                }
                if (this.f72480c1.isEmpty()) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.f3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastMsgToFriendsView.this.m78554IM();
                        }
                    });
                } else {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.g3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastMsgToFriendsView.this.m78555JM();
                        }
                    });
                }
            } catch (Exception e14) {
                e14.printStackTrace();
                if (this.f72421L0.m92676n2() != null) {
                    m92676n2 = this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.h3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastMsgToFriendsView.this.m78553HM();
                        }
                    };
                } else {
                    return;
                }
            }
            if (this.f72421L0.m92676n2() != null) {
                m92676n2 = this.f72421L0.m92676n2();
                runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastMsgToFriendsView.this.m78553HM();
                    }
                };
                m92676n2.runOnUiThread(runnable);
            }
        } catch (Throwable th2) {
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastMsgToFriendsView.this.m78553HM();
                    }
                });
            }
            throw th2;
        }
    }

    /* renamed from: OM */
    void m78576OM(boolean z11) {
        this.f72468Q0.setVisibility(0);
        if (z11) {
            this.f72477Z0.setVisibility(8);
            this.f72468Q0.setVisibility(8);
            this.f72479b1.setVisibility(0);
            this.f72479b1.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        C7090i c7090i = this.f72478a1;
        if (c7090i != null && !c7090i.isEmpty()) {
            this.f72479b1.setVisibility(8);
            this.f72477Z0.setVisibility(0);
        } else {
            this.f72477Z0.setVisibility(8);
            this.f72468Q0.setVisibility(8);
            this.f72479b1.setVisibility(0);
            this.f72479b1.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: PM */
    void m78577PM(int i11) {
        MultiStateView multiStateView = this.f72479b1;
        if (multiStateView != null) {
            multiStateView.setLoadingString(m92652XI(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                AbstractC2379w.m12430d(this.f72469R0);
            } catch (Exception unused) {
                return false;
            }
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QM */
    public void m78578QM(InterfaceC32149v8 interfaceC32149v8) {
        this.f72490m1 = interfaceC32149v8;
    }

    /* renamed from: RM */
    void m78579RM(int i11) {
        MultiStateView multiStateView = this.f72479b1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(m92652XI(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            HashMap hashMap = this.f72476Y0;
            if (hashMap != null && hashMap.size() > 0) {
                if (this.f72475X0 == null) {
                    this.f72475X0 = new ArrayList();
                }
                this.f72475X0.clear();
                Iterator it = this.f72476Y0.entrySet().iterator();
                while (it.hasNext()) {
                    this.f72475X0.add((String) ((Map.Entry) it.next()).getKey());
                }
                bundle.putStringArrayList("arrItemSeltected", this.f72475X0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f72467P0, e11);
        }
        super.mo37118SJ(bundle);
    }

    /* renamed from: SM */
    void m78580SM() {
        ArrayList arrayList = this.f72474W0;
        if (arrayList != null && arrayList.size() > 0) {
            m78581TM(0);
        } else {
            m78581TM(8);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            AbstractC23136l9.m118690Z0(actionBar);
            this.f88760a0.setTitle(m92652XI(AbstractC8020f0.str_title_add_close_friend));
            if (this.f72487j1) {
                m78582VM(0);
            }
        }
    }

    /* renamed from: TM */
    void m78581TM(int i11) {
        try {
            if (i11 == 0) {
                if (this.f72494q1.isRunning()) {
                    this.f72494q1.cancel();
                }
                int visibility = this.f72470S0.getVisibility();
                this.f72470S0.setVisibility(0);
                if (!this.f72493p1.isRunning() && visibility != 0) {
                    this.f72493p1.start();
                    return;
                }
                return;
            }
            if (this.f72493p1.isRunning()) {
                this.f72493p1.cancel();
            }
            this.f72492o1.setVisibility(8);
            if (!this.f72494q1.isRunning() && this.f72470S0.getVisibility() == 0) {
                this.f72494q1.start();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    void m78582VM(int i11) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setSubtitle(String.format(Locale.US, m92652XI(AbstractC8020f0.str_count_character_invitation_prefix), Integer.valueOf(i11), Integer.valueOf(AbstractC23309i.m121115K8() - C21927m.m114302u().m114351p().size())));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BroadcastMsgToFriendsView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f72421L0.m92676n2() instanceof ZaloActivity) {
            this.f72421L0.m92676n2().mo35554O(18);
        }
    }

    /* renamed from: sM */
    void m78583sM(ArrayList arrayList) {
        if (this.f72500w1) {
            return;
        }
        this.f72421L0.mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14123f(arrayList));
        this.f72500w1 = true;
        c0766k.mo1653h8(arrayList);
    }

    /* renamed from: tM */
    void m78584tM(int i11, ArrayList arrayList, C17945a0 c17945a0) {
        if (this.f72497t1) {
            return;
        }
        this.f72421L0.mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        this.f72497t1 = true;
        this.f72498u1.mo1704o8(this.f72499v1);
        this.f72498u1.mo1792z7(i11, arrayList, c17945a0);
    }

    /* renamed from: uM */
    public void m78585uM(InviteContactProfile inviteContactProfile) {
        int i11;
        if (this.f72487j1) {
            i11 = this.f72474W0.size();
        } else {
            i11 = 0;
        }
        if (inviteContactProfile != null) {
            if (this.f72476Y0.containsKey(inviteContactProfile.f42434r)) {
                this.f72474W0.remove(inviteContactProfile);
                this.f72473V0.m35846M(this.f72474W0);
                this.f72473V0.m10008p();
                this.f72476Y0.remove(inviteContactProfile.f42434r);
                int size = this.f72474W0.size();
                if (this.f72476Y0.containsKey(inviteContactProfile.f42434r)) {
                    this.f72476Y0.remove(inviteContactProfile.f42434r);
                }
                this.f72478a1.m36158b(this.f72480c1);
                this.f72478a1.notifyDataSetChanged();
                if (this.f72487j1) {
                    m78582VM(size);
                }
                if (this.f72474W0.isEmpty()) {
                    m78581TM(8);
                }
                C7090i c7090i = this.f72478a1;
                if (c7090i != null && c7090i.m36157a().equals(inviteContactProfile.f42434r)) {
                    this.f72478a1.m36160d("");
                    this.f72473V0.m35847N("");
                    this.f72473V0.m10008p();
                }
            } else if (!this.f72487j1) {
                this.f72474W0.add(inviteContactProfile);
                this.f72473V0.m35846M(this.f72474W0);
                this.f72473V0.m10008p();
                m78581TM(0);
                this.f72485h1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.i3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastMsgToFriendsView.this.m78571zM();
                    }
                });
                EditText editText = this.f72469R0;
                if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                    this.f72469R0.setText("");
                }
                HashMap hashMap = this.f72476Y0;
                String str = inviteContactProfile.f42434r;
                hashMap.put(str, str);
            } else if (i11 < AbstractC23309i.m121115K8() - C21927m.m114302u().m114351p().size()) {
                this.f72474W0.add(inviteContactProfile);
                this.f72473V0.m35846M(this.f72474W0);
                this.f72473V0.m10008p();
                this.f72476Y0.put(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                m78581TM(0);
                this.f72485h1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.j3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastMsgToFriendsView.this.m78546AM();
                    }
                });
                EditText editText2 = this.f72469R0;
                if (editText2 != null && !TextUtils.isEmpty(editText2.getEditableText().toString())) {
                    this.f72469R0.setText("");
                }
                HashMap hashMap2 = this.f72476Y0;
                String str2 = inviteContactProfile.f42434r;
                hashMap2.put(str2, str2);
                m78582VM(i11 + 1);
            } else {
                ToastUtils.showMess(String.format(m92652XI(AbstractC8020f0.str_warning_limit_favorite_list), Integer.valueOf(AbstractC23309i.m121115K8())));
            }
        }
        C7090i c7090i2 = this.f72478a1;
        if (c7090i2 != null) {
            c7090i2.m36158b(this.f72480c1);
            this.f72478a1.notifyDataSetChanged();
        }
    }

    /* renamed from: wM */
    void m78586wM(Bundle bundle) {
        this.f72486i1 = new C23528a(this.f72421L0.m92648SI());
        this.f72469R0.addTextChangedListener(this.f72496s1);
        this.f72477Z0.addFooterView(this.f72489l1);
        this.f72477Z0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.e3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                BroadcastMsgToFriendsView.this.m78549DM(adapterView, view, i11, j11);
            }
        });
        this.f72477Z0.setOnScrollListener(new C14121d());
        C7090i c7090i = new C7090i(this, this.f72480c1, this.f72486i1);
        this.f72478a1 = c7090i;
        this.f72477Z0.setAdapter((ListAdapter) c7090i);
        m78579RM(AbstractC8020f0.empty_list);
        m78577PM(AbstractC8020f0.loading);
        m78576OM(true);
        ArrayList arrayList = this.f72475X0;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (bundle != null && bundle.containsKey("arrItemSeltected")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("arrItemSeltected");
            this.f72475X0 = stringArrayList;
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                try {
                    int size = this.f72475X0.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = (String) this.f72475X0.get(i11);
                        if (!TextUtils.isEmpty(str) && !this.f72476Y0.containsKey(str)) {
                            this.f72476Y0.put(str, str);
                        }
                    }
                    this.f72475X0.clear();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        m78575NM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m78586wM(bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    void m78587xM(View view, LayoutInflater layoutInflater) {
        try {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.rv_bubbles);
            this.f72472U0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
            C7005a5 c7005a5 = new C7005a5();
            this.f72473V0 = c7005a5;
            c7005a5.f38321u = true;
            c7005a5.f38320t = false;
            this.f72472U0.setAdapter(c7005a5);
            C31784b.m152808a(this.f72472U0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.a3
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView2, int i11, View view2) {
                    BroadcastMsgToFriendsView.this.m78550EM(recyclerView2, i11, view2);
                }
            });
            this.f72469R0 = (EditText) view.findViewById(AbstractC6918a0.search_input_text);
            this.f72477Z0 = (ListView) view.findViewById(AbstractC6918a0.phoneList);
            View inflate = layoutInflater.inflate(AbstractC7409c0.friend_count_row, (ViewGroup) null, false);
            this.f72489l1 = inflate;
            this.f72468Q0 = (TextView) inflate.findViewById(AbstractC6918a0.num_friend);
            this.f72479b1 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f72470S0 = (LinearLayout) view.findViewById(AbstractC6918a0.bubble_footer);
            this.f72492o1 = view.findViewById(AbstractC6918a0.fake_space_footer);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.content_bubble_footer);
            this.f72471T0 = linearLayout;
            ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.c3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    BroadcastMsgToFriendsView.this.m78551FM();
                }
            };
            this.f72495r1 = onGlobalLayoutListener;
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f72471T0.setOnClickListener(null);
            ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.btn_done_add_item);
            this.f72491n1 = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.d3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BroadcastMsgToFriendsView.this.m78552GM(view2);
                }
            });
            m78569vM();
            m78581TM(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
