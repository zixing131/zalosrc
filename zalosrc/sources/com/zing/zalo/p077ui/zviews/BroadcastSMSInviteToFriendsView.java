package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import am.AbstractC0906d0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7101j;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.BroadcastSMSInviteToFriendsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23056e6;
import me0.AbstractC23126l;
import me0.AbstractC23262x6;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p304ks.C21916c;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p716zh.C31901e8;
import p716zh.C31916f8;
import p716zh.C31934gb;
import vg.AbstractC28034c7;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class BroadcastSMSInviteToFriendsView extends SlidableZaloView implements C7101j.a, InterfaceC0733x {

    /* renamed from: Q0 */
    TextView f72514Q0;

    /* renamed from: R0 */
    RecyclerView f72515R0;

    /* renamed from: S0 */
    C7005a5 f72516S0;

    /* renamed from: T0 */
    EditText f72517T0;

    /* renamed from: U0 */
    ListView f72518U0;

    /* renamed from: V0 */
    TextView f72519V0;

    /* renamed from: W0 */
    MultiStateView f72520W0;

    /* renamed from: X0 */
    View f72521X0;

    /* renamed from: Y0 */
    int f72522Y0;

    /* renamed from: g1 */
    C7101j f72530g1;

    /* renamed from: m1 */
    String f72536m1;

    /* renamed from: y1 */
    View f72548y1;

    /* renamed from: P0 */
    private final String f72513P0 = BroadcastSMSInviteToFriendsView.class.getSimpleName();

    /* renamed from: Z0 */
    int f72523Z0 = -1;

    /* renamed from: a1 */
    String f72524a1 = "";

    /* renamed from: b1 */
    int f72525b1 = -1;

    /* renamed from: c1 */
    C31916f8 f72526c1 = new C31916f8();

    /* renamed from: d1 */
    ArrayList f72527d1 = new ArrayList();

    /* renamed from: e1 */
    ArrayList f72528e1 = new ArrayList();

    /* renamed from: f1 */
    ArrayList f72529f1 = new ArrayList();

    /* renamed from: h1 */
    int f72531h1 = 0;

    /* renamed from: i1 */
    final String f72532i1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: j1 */
    HashMap f72533j1 = new HashMap();

    /* renamed from: k1 */
    int f72534k1 = 0;

    /* renamed from: l1 */
    boolean f72535l1 = false;

    /* renamed from: n1 */
    String f72537n1 = "";

    /* renamed from: o1 */
    TextWatcher f72538o1 = new C14125a();

    /* renamed from: p1 */
    boolean f72539p1 = false;

    /* renamed from: q1 */
    InterfaceC0765j f72540q1 = new C0766k();

    /* renamed from: r1 */
    InterfaceC20094a f72541r1 = new C14127c();

    /* renamed from: s1 */
    boolean f72542s1 = false;

    /* renamed from: t1 */
    InterfaceC0765j f72543t1 = new C0766k();

    /* renamed from: u1 */
    InterfaceC20094a f72544u1 = new C14128d();

    /* renamed from: v1 */
    boolean f72545v1 = false;

    /* renamed from: w1 */
    InterfaceC0765j f72546w1 = new C0766k();

    /* renamed from: x1 */
    InterfaceC20094a f72547x1 = new C14129e();

    /* renamed from: com.zing.zalo.ui.zviews.BroadcastSMSInviteToFriendsView$a */
    /* loaded from: classes6.dex */
    class C14125a extends AbstractC18391a {
        C14125a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            EditText editText = BroadcastSMSInviteToFriendsView.this.f72517T0;
            if (editText != null && editText.getText() != null) {
                BroadcastSMSInviteToFriendsView.this.m78631xM(BroadcastSMSInviteToFriendsView.this.f72517T0.getText().toString().trim());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastSMSInviteToFriendsView$b */
    /* loaded from: classes6.dex */
    public class C14126b extends AbstractC28034c7 {
        C14126b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    BroadcastSMSInviteToFriendsView.this.f72530g1.m36190e(false);
                    BroadcastSMSInviteToFriendsView.this.f72530g1.notifyDataSetChanged();
                } else {
                    BroadcastSMSInviteToFriendsView.this.f72530g1.m36190e(true);
                    AbstractC2379w.m12430d(BroadcastSMSInviteToFriendsView.this.f72517T0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastSMSInviteToFriendsView$c */
    /* loaded from: classes6.dex */
    public class C14127c implements InterfaceC20094a {
        C14127c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m78636e() {
            BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
            if (broadcastSMSInviteToFriendsView.f72534k1 > 0) {
                broadcastSMSInviteToFriendsView.f72519V0.setText(String.format(broadcastSMSInviteToFriendsView.m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1), 0, Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1)));
                BroadcastSMSInviteToFriendsView.this.f72519V0.setVisibility(0);
            } else {
                broadcastSMSInviteToFriendsView.f72519V0.setVisibility(8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78637f() {
            BroadcastSMSInviteToFriendsView.this.f72421L0.mo49315c4();
            BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
            if (broadcastSMSInviteToFriendsView.f72534k1 > 0) {
                broadcastSMSInviteToFriendsView.f72519V0.setText(String.format(broadcastSMSInviteToFriendsView.m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1), 0, Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1)));
                BroadcastSMSInviteToFriendsView.this.f72519V0.setVisibility(0);
            } else {
                broadcastSMSInviteToFriendsView.f72519V0.setVisibility(8);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
            broadcastSMSInviteToFriendsView.f72539p1 = false;
            if (broadcastSMSInviteToFriendsView.f72421L0.m92676n2() != null) {
                BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.c4
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastSMSInviteToFriendsView.C14127c.this.m78637f();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        BroadcastSMSInviteToFriendsView.this.f72534k1 = jSONObject.getInt("data");
                        if (BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2() != null) {
                            BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BroadcastSMSInviteToFriendsView.C14127c.this.m78636e();
                                }
                            });
                        }
                    } else {
                        AbstractC2364o0.m12372o(BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2(), BroadcastSMSInviteToFriendsView.this.f72519V0, 8);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView.f72539p1 = false;
                broadcastSMSInviteToFriendsView.mo78960q3();
            } catch (Throwable th2) {
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView2 = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView2.f72539p1 = false;
                broadcastSMSInviteToFriendsView2.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BroadcastSMSInviteToFriendsView$d */
    /* loaded from: classes6.dex */
    public class C14128d implements InterfaceC20094a {
        C14128d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m78640e() {
            BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
            broadcastSMSInviteToFriendsView.f72519V0.setText(String.format(broadcastSMSInviteToFriendsView.m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1), 0, Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1)));
            if (BroadcastSMSInviteToFriendsView.this.m92672lJ()) {
                ToastUtils.showMess(BroadcastSMSInviteToFriendsView.this.m92652XI(AbstractC8020f0.str_send_broadcast_sms_success));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78641f() {
            BroadcastSMSInviteToFriendsView.this.f72421L0.mo49315c4();
            BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
            broadcastSMSInviteToFriendsView.f72519V0.setText(String.format(broadcastSMSInviteToFriendsView.m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1), 0, Integer.valueOf(BroadcastSMSInviteToFriendsView.this.f72534k1)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (BroadcastSMSInviteToFriendsView.this.m92672lJ()) {
                if (c20096c.m104491c() == 2013) {
                    ToastUtils.showMess(BroadcastSMSInviteToFriendsView.this.m92652XI(AbstractC8020f0.error_execeed_quota));
                } else {
                    ToastUtils.showMess(BroadcastSMSInviteToFriendsView.this.m92652XI(AbstractC8020f0.str_send_broadcast_sms_fail));
                }
            }
            BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
            broadcastSMSInviteToFriendsView.f72542s1 = false;
            if (broadcastSMSInviteToFriendsView.f72421L0.m92676n2() != null) {
                BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.f4
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastSMSInviteToFriendsView.C14128d.this.m78641f();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null && !jSONObject.isNull("data") && (i11 = jSONObject.getInt("data")) >= 0) {
                        BroadcastSMSInviteToFriendsView.this.f72534k1 = i11;
                    }
                    if (BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2() != null) {
                        BroadcastSMSInviteToFriendsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.e4
                            @Override // java.lang.Runnable
                            public final void run() {
                                BroadcastSMSInviteToFriendsView.C14128d.this.m78640e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView.f72542s1 = false;
                broadcastSMSInviteToFriendsView.mo78960q3();
            } catch (Throwable th2) {
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView2 = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView2.f72542s1 = false;
                broadcastSMSInviteToFriendsView2.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BroadcastSMSInviteToFriendsView$e */
    /* loaded from: classes6.dex */
    class C14129e implements InterfaceC20094a {
        C14129e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    String format = String.format(BroadcastSMSInviteToFriendsView.this.m92652XI(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s));
                    BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
                    broadcastSMSInviteToFriendsView.m78624QM(broadcastSMSInviteToFriendsView.f72536m1, format);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView2 = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView2.f72545v1 = false;
                broadcastSMSInviteToFriendsView2.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String format;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        format = new JSONObject(jSONObject.getString("data")).getString("text");
                    } else {
                        format = String.format(BroadcastSMSInviteToFriendsView.this.m92652XI(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s));
                    }
                    BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView = BroadcastSMSInviteToFriendsView.this;
                    broadcastSMSInviteToFriendsView.m78624QM(broadcastSMSInviteToFriendsView.f72536m1, format);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView2 = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView2.f72545v1 = false;
                broadcastSMSInviteToFriendsView2.mo78960q3();
            } catch (Throwable th2) {
                BroadcastSMSInviteToFriendsView broadcastSMSInviteToFriendsView3 = BroadcastSMSInviteToFriendsView.this;
                broadcastSMSInviteToFriendsView3.f72545v1 = false;
                broadcastSMSInviteToFriendsView3.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m78594AM() {
        int i11;
        m78627TM(AbstractC8020f0.str_emptyResult);
        m78625RM(false);
        if (this.f72531h1 > 0) {
            TextView textView = this.f72514Q0;
            String m92652XI = m92652XI(AbstractC8020f0.str_refix_number_of_friend);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f72531h1);
            if (this.f72531h1 > 1) {
                i11 = AbstractC8020f0.str_more_s;
            } else {
                i11 = AbstractC8020f0.str_single_form;
            }
            objArr[1] = m92652XI(i11);
            textView.setText(String.format(m92652XI, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m78595BM() {
        if (this.f72523Z0 >= 0 && this.f72530g1.getCount() > 0) {
            this.f72518U0.setSelection(this.f72523Z0);
            this.f72523Z0 = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m78596CM(RecyclerView recyclerView, int i11, View view) {
        try {
            String str = ((InviteContactProfile) this.f72529f1.get(i11)).f42455y;
            this.f72523Z0 = -1;
            EditText editText = this.f72517T0;
            if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                this.f72524a1 = ((InviteContactProfile) this.f72529f1.get(i11)).f42455y;
                C7101j c7101j = this.f72530g1;
                if (c7101j.m36186a().equals(str)) {
                    str = "";
                }
                c7101j.m36189d(str);
                this.f72517T0.setText("");
                AbstractC2379w.m12430d(this.f72517T0);
                return;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= this.f72530g1.getCount()) {
                    break;
                }
                if (this.f72530g1.getItem(i12) != null && ((InviteContactProfile) this.f72530g1.getItem(i12)).f42455y.equals(str)) {
                    if (!str.equals(this.f72530g1.m36186a())) {
                        this.f72523Z0 = i12;
                    }
                } else {
                    i12++;
                }
            }
            C7101j c7101j2 = this.f72530g1;
            if (c7101j2.m36186a().equals(str)) {
                str = "";
            }
            c7101j2.m36189d(str);
            this.f72530g1.notifyDataSetChanged();
            this.f72516S0.m35847N(((InviteContactProfile) this.f72529f1.get(i11)).f42455y);
            this.f72516S0.m10008p();
            this.f72518U0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.p3
                @Override // java.lang.Runnable
                public final void run() {
                    BroadcastSMSInviteToFriendsView.this.m78595BM();
                }
            }, 100L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m78597DM() {
        int size = this.f72533j1.size();
        int i11 = this.f72534k1;
        if (size < i11) {
            i11 = this.f72533j1.size();
        }
        this.f72519V0.setText(String.format(m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(this.f72534k1), Integer.valueOf(i11), Integer.valueOf(this.f72534k1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m78598EM() {
        try {
            this.f72515R0.mo9854S1(this.f72529f1.size() - 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m78599FM(AdapterView adapterView, View view, int i11, long j11) {
        boolean z11;
        View view2;
        try {
            this.f72522Y0 = i11 - this.f72518U0.getHeaderViewsCount();
            C7101j c7101j = this.f72530g1;
            if (c7101j != null && c7101j.getCount() > 0) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f72530g1.getItem(this.f72522Y0);
                inviteContactProfile.f42434r = "";
                if (this.f72533j1.containsKey(inviteContactProfile.f42455y)) {
                    this.f72533j1.remove(inviteContactProfile.f42455y);
                    this.f72529f1.remove(inviteContactProfile);
                    this.f72516S0.m35846M(this.f72529f1);
                    this.f72516S0.m10008p();
                    if (this.f72533j1.containsKey(inviteContactProfile.f42455y)) {
                        this.f72533j1.remove(inviteContactProfile.f42455y);
                    }
                    this.f72530g1.m36188c(this.f72526c1);
                    this.f72530g1.notifyDataSetChanged();
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.q3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastSMSInviteToFriendsView.this.m78597DM();
                        }
                    });
                    if (this.f72529f1.size() == 0 && (view2 = this.f72521X0) != null) {
                        view2.setVisibility(8);
                        this.f72515R0.setVisibility(8);
                    }
                    C7101j c7101j2 = this.f72530g1;
                    if (c7101j2 != null && c7101j2.m36186a().equals(inviteContactProfile.f42455y)) {
                        this.f72530g1.m36189d("");
                        this.f72516S0.m35847N("");
                        this.f72516S0.m10008p();
                    }
                    m78630wM();
                    int size = this.f72529f1.size();
                    int i12 = this.f72534k1;
                    if (size <= i12) {
                        i12 = this.f72529f1.size();
                    }
                    this.f72519V0.setText(String.format(m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(this.f72534k1), Integer.valueOf(i12), Integer.valueOf(this.f72534k1)));
                } else {
                    if (this.f72533j1.size() >= 5) {
                        ToastUtils.showMess(m92652XI(AbstractC8020f0.str_warning_limit_invite_sms));
                        return;
                    }
                    if (this.f72529f1.size() < this.f72534k1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    inviteContactProfile.f42538b2 = z11;
                    this.f72533j1.put(inviteContactProfile.f42455y, inviteContactProfile);
                    this.f72529f1.add(inviteContactProfile);
                    this.f72516S0.m35846M(this.f72529f1);
                    this.f72516S0.m10008p();
                    this.f72515R0.setVisibility(0);
                    this.f72515R0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.r3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastSMSInviteToFriendsView.this.m78598EM();
                        }
                    });
                    this.f72521X0.setVisibility(0);
                    EditText editText = this.f72517T0;
                    if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                        this.f72517T0.setText("");
                    }
                    int size2 = this.f72529f1.size();
                    int i13 = this.f72534k1;
                    if (size2 <= i13) {
                        i13 = this.f72529f1.size();
                    }
                    this.f72519V0.setText(String.format(m92652XI(AbstractC8020f0.str_hint_num_of_msg_free), Integer.valueOf(this.f72534k1), Integer.valueOf(i13), Integer.valueOf(this.f72534k1)));
                }
                this.f72530g1.m36188c(this.f72526c1);
                this.f72530g1.notifyDataSetChanged();
                m78630wM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m78600GM() {
        try {
            this.f72529f1.clear();
            this.f72516S0.m35846M(this.f72529f1);
            this.f72516S0.m10008p();
            this.f72533j1.clear();
            m78623PM(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m78601HM(C31916f8 c31916f8) {
        int i11;
        try {
            m78630wM();
            this.f72526c1 = c31916f8;
            m78627TM(AbstractC8020f0.empty_list);
            this.f72530g1.m36188c(this.f72526c1);
            this.f72530g1.notifyDataSetChanged();
            m78625RM(false);
            if (this.f72526c1.size() > 0) {
                TextView textView = this.f72514Q0;
                String m92652XI = m92652XI(AbstractC8020f0.str_refix_number_of_friend);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.f72531h1);
                if (this.f72531h1 > 1) {
                    i11 = AbstractC8020f0.str_more_s;
                } else {
                    i11 = AbstractC8020f0.str_single_form;
                }
                objArr[1] = m92652XI(i11);
                textView.setText(String.format(m92652XI, objArr));
            }
            if (this.f72525b1 >= 0 && this.f72530g1.getCount() > 0) {
                this.f72518U0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.s3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastSMSInviteToFriendsView.this.m78607NM();
                    }
                }, 100L);
            }
            this.f72421L0.mo49315c4();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:            if (r5.m153376g(r15.f42539c2) != false) goto L44;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f1 A[Catch: all -> 0x0036, Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x003c, B:10:0x0046, B:11:0x0049, B:13:0x0059, B:15:0x0075, B:16:0x0086, B:18:0x008c, B:25:0x0316, B:40:0x0111, B:49:0x02ae, B:51:0x02c1, B:53:0x02c9, B:55:0x02d3, B:56:0x02dd, B:58:0x02e1, B:60:0x02e9, B:62:0x02f1, B:63:0x0302, B:65:0x0306, B:67:0x030e, B:107:0x02ab, B:111:0x010e, B:113:0x031a, B:115:0x0320, B:117:0x0328, B:125:0x0337, B:127:0x033f, B:128:0x005f, B:130:0x0067), top: B:2:0x000e, outer: #0 }] */
    /* renamed from: IM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m78602IM() {
        InterfaceC27218a m92676n2;
        Runnable runnable;
        List m2802h;
        int i11;
        int i12;
        int i13;
        boolean z11;
        C31901e8 c31901e8;
        InviteContactProfile inviteContactProfile;
        ArrayList arrayList;
        HashMap hashMap;
        final C31916f8 c31916f8 = new C31916f8();
        try {
            try {
                this.f72525b1 = -1;
                this.f72531h1 = 0;
                List m42570w5 = C7960e.m41971c6().m42570w5();
                HashSet hashSet = new HashSet();
                Iterator it = m42570w5.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C31934gb) it.next()).f146730b);
                }
                Set m114216g = C21916c.m114210e().m114216g();
                if (m114216g != null) {
                    hashSet.addAll(m114216g);
                }
                m2802h = AbstractC0906d0.m2802h(this.f72421L0.m92648SI().getApplicationContext());
                if ((m2802h == null || m2802h.isEmpty()) && this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.x3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastSMSInviteToFriendsView.this.m78603JM();
                        }
                    });
                }
                AbstractC23056e6.m118285k(AbstractC23304d.f113394i0);
                Collections.sort(m2802h, new Comparator() { // from class: com.zing.zalo.ui.zviews.y3
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m78604KM;
                        m78604KM = BroadcastSMSInviteToFriendsView.m78604KM((C31901e8) obj, (C31901e8) obj2);
                        return m78604KM;
                    }
                });
                i11 = 0;
                i12 = 0;
                i13 = -1;
                z11 = false;
                while (i11 < m2802h.size()) {
                    c31901e8 = (C31901e8) m2802h.get(i11);
                    inviteContactProfile = new InviteContactProfile();
                    inviteContactProfile.f42434r = "";
                    inviteContactProfile.f42437s = c31901e8.m153295h();
                    inviteContactProfile.f42455y = c31901e8.m153297j();
                    inviteContactProfile.f42539c2 = c31901e8.m153298m();
                    try {
                        C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.m92648SI().getApplicationContext(), c31901e8.m153298m());
                        if (!hashSet.contains(m2800f.m153298m())) {
                            if (m2800f.m153300r() <= 0) {
                                if (c31901e8.m153301s()) {
                                    if (c31901e8.m153298m().equals(AbstractC23304d.f113394i0)) {
                                    }
                                }
                                if (!inviteContactProfile.f42539c2.trim().equals("")) {
                                    if (!inviteContactProfile.f42539c2.trim().equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    i11++;
                }
                if (c31916f8.isEmpty()) {
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.z3
                            @Override // java.lang.Runnable
                            public final void run() {
                                BroadcastSMSInviteToFriendsView.this.m78605LM();
                            }
                        });
                    }
                } else if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.a4
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastSMSInviteToFriendsView.this.m78606MM();
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (this.f72421L0.m92676n2() != null) {
                    m92676n2 = this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.b4
                        @Override // java.lang.Runnable
                        public final void run() {
                            BroadcastSMSInviteToFriendsView.this.m78601HM(c31916f8);
                        }
                    };
                } else {
                    return;
                }
            }
            if (this.f72421L0.m92676n2() != null) {
                m92676n2 = this.f72421L0.m92676n2();
                runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.b4
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastSMSInviteToFriendsView.this.m78601HM(c31916f8);
                    }
                };
                m92676n2.runOnUiThread(runnable);
                return;
            }
            return;
            char charAt = c31901e8.m153296i().trim().toUpperCase().charAt(0);
            i13++;
            if (i13 != 0) {
                try {
                    char charAt2 = ((C31901e8) m2802h.get(i12)).m153296i().trim().toUpperCase(Locale.ENGLISH).charAt(0);
                    if (this.f72532i1.indexOf(charAt2) != -1) {
                        if (charAt > charAt2) {
                            if (this.f72532i1.indexOf(charAt) != -1) {
                                InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                inviteContactProfile2.f42434r = "";
                                inviteContactProfile2.f42437s = "" + charAt;
                                inviteContactProfile2.m40403e1(false);
                                if (!z11) {
                                    inviteContactProfile2.f42407e1 = true;
                                    z11 = true;
                                }
                                inviteContactProfile2.f42455y = "" + charAt;
                                inviteContactProfile2.f42539c2 = "" + charAt;
                                int size = c31916f8.size();
                                if (size > 0) {
                                    int i14 = size - 1;
                                    if (((InviteContactProfile) c31916f8.get(i14)).m40366G0()) {
                                        ((InviteContactProfile) c31916f8.get(i14)).f42405d1 = true;
                                    }
                                }
                                c31916f8.add(inviteContactProfile2);
                            } else {
                                InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                inviteContactProfile3.f42434r = "";
                                inviteContactProfile3.f42437s = "##";
                                inviteContactProfile3.m40403e1(false);
                                if (!z11) {
                                    inviteContactProfile3.f42407e1 = true;
                                    z11 = true;
                                }
                                inviteContactProfile3.f42455y = "##";
                                inviteContactProfile3.f42539c2 = "##";
                                c31916f8.add(inviteContactProfile3);
                            }
                        }
                    } else if (this.f72532i1.indexOf(charAt) != -1) {
                        InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                        inviteContactProfile4.f42434r = "";
                        inviteContactProfile4.f42437s = "" + charAt;
                        inviteContactProfile4.m40403e1(false);
                        if (!z11) {
                            inviteContactProfile4.f42407e1 = true;
                            z11 = true;
                        }
                        inviteContactProfile4.f42455y = "" + charAt;
                        inviteContactProfile4.f42539c2 = "" + charAt;
                        int size2 = c31916f8.size();
                        if (size2 > 0) {
                            int i15 = size2 - 1;
                            if (((InviteContactProfile) c31916f8.get(i15)).m40366G0()) {
                                ((InviteContactProfile) c31916f8.get(i15)).f42405d1 = true;
                            }
                        }
                        c31916f8.add(inviteContactProfile4);
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            } else if (this.f72532i1.indexOf(charAt) == -1) {
                InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                inviteContactProfile5.f42434r = "";
                inviteContactProfile5.f42437s = "#";
                inviteContactProfile5.m40403e1(false);
                if (!z11) {
                    inviteContactProfile5.f42407e1 = true;
                    z11 = true;
                }
                inviteContactProfile5.f42455y = "#";
                inviteContactProfile5.f42539c2 = "#";
                c31916f8.add(inviteContactProfile5);
            } else {
                InviteContactProfile inviteContactProfile6 = new InviteContactProfile();
                inviteContactProfile6.f42434r = "";
                inviteContactProfile6.f42437s = "" + charAt;
                inviteContactProfile6.m40403e1(false);
                if (!z11) {
                    inviteContactProfile6.f42407e1 = true;
                    z11 = true;
                }
                inviteContactProfile6.f42455y = "" + charAt;
                inviteContactProfile6.f42539c2 = "" + charAt;
                c31916f8.add(inviteContactProfile6);
            }
            inviteContactProfile.f42399a1.clear();
            c31916f8.add(inviteContactProfile);
            this.f72531h1++;
            if (this.f72525b1 == -1 && !TextUtils.isEmpty(this.f72524a1) && this.f72524a1.equals(inviteContactProfile.f42455y)) {
                this.f72525b1 = c31916f8.size() - 1;
                this.f72524a1 = "";
            }
            arrayList = this.f72527d1;
            if (arrayList != null && arrayList.contains(inviteContactProfile.f42455y)) {
                if (!this.f72529f1.contains(inviteContactProfile)) {
                    this.f72529f1.add(inviteContactProfile);
                    this.f72516S0.m35846M(this.f72529f1);
                    this.f72516S0.m10008p();
                }
                hashMap = this.f72533j1;
                if (hashMap != null && !hashMap.containsKey(inviteContactProfile.f42455y)) {
                    this.f72533j1.put(inviteContactProfile.f42455y, inviteContactProfile);
                }
            }
            i12 = i11;
            i11++;
            inviteContactProfile.f42399a1.clear();
            c31916f8.add(inviteContactProfile);
            this.f72531h1++;
            if (this.f72525b1 == -1) {
                this.f72525b1 = c31916f8.size() - 1;
                this.f72524a1 = "";
            }
            arrayList = this.f72527d1;
            if (arrayList != null) {
                if (!this.f72529f1.contains(inviteContactProfile)) {
                }
                hashMap = this.f72533j1;
                if (hashMap != null) {
                    this.f72533j1.put(inviteContactProfile.f42455y, inviteContactProfile);
                }
            }
            i12 = i11;
            i11++;
        } catch (Throwable th2) {
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.b4
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastSMSInviteToFriendsView.this.m78601HM(c31916f8);
                    }
                });
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m78603JM() {
        try {
            this.f72515R0.setVisibility(8);
            m78627TM(AbstractC8020f0.empty_list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static /* synthetic */ int m78604KM(C31901e8 c31901e8, C31901e8 c31901e82) {
        return c31901e8.m153296i().compareToIgnoreCase(c31901e82.m153296i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m78605LM() {
        try {
            this.f72515R0.setVisibility(8);
            m78627TM(AbstractC8020f0.empty_list);
            this.f72517T0.setVisibility(8);
            this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.separate_bottom).setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m78606MM() {
        try {
            this.f72517T0.setVisibility(0);
            this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.separate_bottom).setVisibility(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m78607NM() {
        this.f72518U0.setSelection(this.f72525b1);
        this.f72525b1 = -1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        this.f72421L0.m92676n2().mo35554O(32);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        this.f72548y1 = actionBarMenu.m92738e(1, AbstractC16803z.action_menu_blue_send_icon_selector);
        m78630wM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.broadcast_msg_to_friends_view, viewGroup, false);
        m78633zM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.adapters.C7101j.a
    /* renamed from: N */
    public boolean mo36191N(String str) {
        return this.f72533j1.containsKey(str);
    }

    /* renamed from: OM */
    void m78622OM() {
        int i11;
        try {
            ArrayList arrayList = this.f72527d1;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.f72528e1;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            Iterator it = this.f72533j1.keySet().iterator();
            int i12 = 0;
            int i13 = 0;
            while (it.hasNext()) {
                this.f72527d1.add((String) it.next());
                i13++;
            }
            ArrayList arrayList3 = this.f72529f1;
            if (arrayList3 != null) {
                i11 = arrayList3.size();
            } else {
                i11 = 0;
            }
            if (i13 == 0) {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_hint_must_choose_friend));
            } else {
                int i14 = this.f72534k1;
                if (i11 > i14) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (int i15 = 0; i15 < i11; i15++) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) arrayList3.get(i15);
                        if (inviteContactProfile.f42538b2) {
                            arrayList4.add(inviteContactProfile.f42455y);
                        } else {
                            arrayList5.add(inviteContactProfile.f42455y);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    int size = arrayList4.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        sb2.append((String) arrayList4.get(i16));
                        if (i16 != size - 1) {
                            sb2.append(',');
                        }
                    }
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        sb3.append((String) arrayList5.get(i12));
                        if (i12 != size2 - 1) {
                            sb3.append(',');
                        }
                        i12++;
                    }
                    if (arrayList4.size() > 0) {
                        m78629vM(sb2.toString().replace(" ", ""));
                    }
                    if (arrayList5.size() > 0) {
                        m78632yM(sb3.toString().replace(" ", ""));
                    }
                } else if (i11 > 0 && i14 > 0 && i11 <= i14) {
                    int size3 = this.f72527d1.size();
                    while (i12 < size3) {
                        i12++;
                    }
                    m78629vM(this.f72527d1.toString().replace(" ", ""));
                    ArrayList arrayList6 = this.f72527d1;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                }
            }
            this.f72529f1.clear();
            this.f72516S0.m35846M(this.f72529f1);
            this.f72516S0.m10008p();
            this.f72533j1.clear();
            this.f72527d1.clear();
            this.f72517T0.setText("");
            AbstractC23647d.m123897g("5801108");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    public void m78623PM(boolean z11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.w3
            @Override // java.lang.Runnable
            public final void run() {
                BroadcastSMSInviteToFriendsView.this.m78602IM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 != 1) {
                if (i11 == 16908332) {
                    AbstractC2379w.m12430d(this.f72517T0);
                }
                return super.mo37491QJ(i11);
            }
            AbstractC2379w.m12430d(this.f72517T0);
            m78622OM();
            return super.mo37491QJ(i11);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: QM */
    void m78624QM(String str, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            startActivityForResult(intent, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    void m78625RM(boolean z11) {
        this.f72514Q0.setVisibility(0);
        if (z11) {
            this.f72514Q0.setVisibility(8);
            this.f72518U0.setVisibility(8);
            this.f72520W0.setVisibility(0);
            this.f72520W0.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        if (this.f72531h1 > 0) {
            this.f72518U0.setVisibility(0);
            this.f72514Q0.setVisibility(0);
            this.f72520W0.setVisibility(8);
        } else {
            this.f72514Q0.setVisibility(8);
            this.f72518U0.setVisibility(8);
            this.f72520W0.setVisibility(0);
            this.f72520W0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        ArrayList arrayList;
        try {
            HashMap hashMap = this.f72533j1;
            if (hashMap != null && hashMap.size() > 0 && (arrayList = this.f72529f1) != null && arrayList.size() > 0) {
                if (this.f72527d1 == null) {
                    this.f72527d1 = new ArrayList();
                }
                this.f72527d1.clear();
                Iterator it = this.f72533j1.entrySet().iterator();
                while (it.hasNext()) {
                    this.f72527d1.add((String) ((Map.Entry) it.next()).getKey());
                }
                bundle.putStringArrayList("arrItemSeltected", this.f72527d1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f72513P0, e11);
        }
        super.mo37118SJ(bundle);
    }

    /* renamed from: SM */
    void m78626SM(int i11) {
        MultiStateView multiStateView = this.f72520W0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(m92652XI(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m92652XI(AbstractC8020f0.str_title_shareVipAcc));
                this.f88760a0.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.getTitleTextView().setTextColor(C23212s8.m119607o(this.f88760a0.getContext(), AbstractC21196a.TextColor1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TM */
    void m78627TM(int i11) {
        MultiStateView multiStateView = this.f72520W0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(m92652XI(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.adapters.C7079h.b
    public Context getContext() {
        return this.f72421L0.m92648SI();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BroadcastSMSInviteToFriendsView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 0) {
            try {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.u3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BroadcastSMSInviteToFriendsView.this.m78600GM();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: uM */
    void m78628uM() {
        if (this.f72539p1) {
            return;
        }
        this.f72421L0.mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        this.f72539p1 = true;
        this.f72540q1.mo1704o8(this.f72541r1);
        this.f72540q1.mo1431Fa();
    }

    /* renamed from: vM */
    void m78629vM(String str) {
        if (this.f72542s1) {
            return;
        }
        this.f72421L0.mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        this.f72542s1 = true;
        this.f72543t1.mo1704o8(this.f72544u1);
        this.f72543t1.mo1555V5(str);
    }

    /* renamed from: wM */
    void m78630wM() {
        View view;
        try {
            if (this.f72533j1 != null && (view = this.f72548y1) != null) {
                view.setEnabled(!r0.isEmpty());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                if (bundle.containsKey("arrItemSeltected")) {
                    this.f72527d1 = bundle.getStringArrayList("arrItemSeltected");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m78628uM();
        m78625RM(true);
        m78623PM(true);
    }

    /* renamed from: xM */
    public void m78631xM(String str) {
        String m118285k;
        ListView listView;
        try {
            if (this.f72530g1 != null) {
                ArrayList arrayList = new ArrayList();
                C31916f8 c31916f8 = this.f72526c1;
                if (c31916f8 != null) {
                    c31916f8.clear();
                }
                this.f72531h1 = 0;
                if (str != null && !str.equals("")) {
                    AbstractC23262x6.m120005r(AbstractC23262x6.m120002o(str), (ArrayList) AbstractC0906d0.m2802h(this.f72421L0.m92648SI().getApplicationContext()), arrayList);
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile != null && contactProfile.f42455y.length() > 0) {
                        m118285k = AbstractC23304d.f113368c0.f42455y;
                    } else {
                        m118285k = AbstractC23056e6.m118285k(AbstractC23304d.f113394i0);
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        C31901e8 c31901e8 = (C31901e8) arrayList.get(i11);
                        InviteContactProfile inviteContactProfile = new InviteContactProfile();
                        inviteContactProfile.f42437s = c31901e8.m153295h();
                        inviteContactProfile.f42455y = c31901e8.m153297j();
                        inviteContactProfile.f42539c2 = c31901e8.m153298m();
                        inviteContactProfile.f42399a1 = c31901e8.f146553C;
                        try {
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (!m118285k.equals(c31901e8.m153298m())) {
                            if (!inviteContactProfile.f42539c2.trim().equals("") && !inviteContactProfile.f42539c2.trim().equalsIgnoreCase(AbstractC23056e6.f112062a) && this.f72526c1.m153376g(inviteContactProfile.f42539c2)) {
                            }
                            this.f72526c1.add(inviteContactProfile);
                            this.f72531h1++;
                        }
                    }
                    this.f72530g1.m36188c(this.f72526c1);
                    this.f72530g1.notifyDataSetChanged();
                    C31916f8 c31916f82 = this.f72526c1;
                    if (c31916f82 != null && !c31916f82.isEmpty() && (listView = this.f72518U0) != null) {
                        listView.setSelection(0);
                    }
                }
                m78623PM(false);
                return;
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.v3
            @Override // java.lang.Runnable
            public final void run() {
                BroadcastSMSInviteToFriendsView.this.m78594AM();
            }
        });
    }

    /* renamed from: yM */
    void m78632yM(String str) {
        if (this.f72545v1) {
            return;
        }
        this.f72421L0.mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        this.f72536m1 = str;
        this.f72545v1 = true;
        this.f72546w1.mo1704o8(this.f72547x1);
        this.f72546w1.mo1386A5(this.f72536m1);
    }

    /* renamed from: zM */
    void m78633zM(View view) {
        this.f72519V0 = (TextView) view.findViewById(AbstractC6918a0.str_info_quota);
        View findViewById = view.findViewById(AbstractC6918a0.separate_top);
        this.f72521X0 = findViewById;
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.rv_bubbles);
        this.f72515R0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
        RecyclerView recyclerView2 = this.f72515R0;
        C7005a5 c7005a5 = new C7005a5();
        this.f72516S0 = c7005a5;
        recyclerView2.setAdapter(c7005a5);
        C31784b.m152808a(this.f72515R0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.o3
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView3, int i11, View view2) {
                BroadcastSMSInviteToFriendsView.this.m78596CM(recyclerView3, i11, view2);
            }
        });
        EditText editText = (EditText) view.findViewById(AbstractC6918a0.search_input_text);
        this.f72517T0 = editText;
        editText.addTextChangedListener(this.f72538o1);
        this.f72518U0 = (ListView) view.findViewById(AbstractC6918a0.phoneList);
        this.f72520W0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        m78627TM(AbstractC8020f0.empty_list);
        m78626SM(AbstractC8020f0.str_tv_findingFriend);
        View inflate = this.f72421L0.m92676n2().getLayoutInflater().inflate(AbstractC7409c0.friend_count_row, (ViewGroup) null, false);
        this.f72514Q0 = (TextView) inflate.findViewById(AbstractC6918a0.num_friend);
        this.f72518U0.addFooterView(inflate);
        this.f72518U0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.t3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                BroadcastSMSInviteToFriendsView.this.m78599FM(adapterView, view2, i11, j11);
            }
        });
        this.f72518U0.setOnScrollListener(new C14126b());
        C7101j c7101j = new C7101j(this, this.f72526c1);
        this.f72530g1 = c7101j;
        this.f72518U0.setAdapter((ListAdapter) c7101j);
        ArrayList arrayList = this.f72527d1;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC23126l.m118627a(this.f72513P0);
    }
}
