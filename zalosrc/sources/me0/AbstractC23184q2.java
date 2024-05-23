package me0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.PinMessageDetailView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import ee.C18408p;
import gg0.AbstractC19444a;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import ig0.AbstractC20550a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kd0.C21693c;
import kd0.C21697g;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3535c;
import p056cj.C3540h;
import p132ej.C18450l;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p459qs.C25489b;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p495rx.C25994h;
import p542ub.InterfaceC27218a;
import p594w1.C28685a;
import p716zh.C31870c7;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32058p1;
import ui0.C27280g;
import vg.AbstractC28207v1;
import vg.C28203u6;
import wd0.C28923c;
import wd0.C28931k;
import ws.C29210k;

/* renamed from: me0.q2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23184q2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.q2$a */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        int f112395a = 0;

        /* renamed from: b */
        int f112396b = 20;

        /* renamed from: c */
        final /* synthetic */ LinearLayoutManager f112397c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f112398d;

        /* renamed from: e */
        final /* synthetic */ GroupPollOptionsDetailRecyclerAdapter f112399e;

        a(LinearLayoutManager linearLayoutManager, ArrayList arrayList, GroupPollOptionsDetailRecyclerAdapter groupPollOptionsDetailRecyclerAdapter) {
            this.f112397c = linearLayoutManager;
            this.f112398d = arrayList;
            this.f112399e = groupPollOptionsDetailRecyclerAdapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 != 2) {
                int m9740Y1 = this.f112397c.m9740Y1();
                int m9745c2 = this.f112397c.m9745c2();
                int i12 = 0;
                if (Math.max(m9740Y1 - 5, 0) < this.f112395a || Math.min(m9745c2 + 5, this.f112398d.size() - 1) > this.f112396b) {
                    int i13 = m9740Y1 - 20;
                    int i14 = m9745c2 + 20;
                    if (i13 >= 0) {
                        i12 = i13;
                    }
                    if (i14 > this.f112398d.size() - 1) {
                        i14 = this.f112398d.size() - 1;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i15 = i12; i15 <= i14; i15++) {
                        String str = (String) this.f112398d.get(i15);
                        if (C28203u6.f131407a.m141809c(str) == null) {
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        GroupPollOptionsDetailRecyclerAdapter groupPollOptionsDetailRecyclerAdapter = this.f112399e;
                        Objects.requireNonNull(groupPollOptionsDetailRecyclerAdapter);
                        AbstractC23184q2.m119463u(arrayList, new RunnableC23173p2(groupPollOptionsDetailRecyclerAdapter));
                    }
                    this.f112395a = i12;
                    this.f112396b = i14;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.q2$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Conversation f112400a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f112401b;

        b(Conversation conversation, C17945a0 c17945a0) {
            this.f112400a = conversation;
            this.f112401b = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC23306f.m120612Q1().m101500a(new C28931k.b(this.f112400a, this.f112401b));
        }
    }

    /* renamed from: me0.q2$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Runnable f112402a;

        c(Runnable runnable) {
            this.f112402a = runnable;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                if (jSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            ContactProfile contactProfile = new ContactProfile(jSONObject.optString("uid"));
                            contactProfile.f42437s = jSONObject.optString("displayName");
                            contactProfile.f42446v = jSONObject.optString("avatar");
                            contactProfile.f42330D = System.currentTimeMillis();
                            C7960e.m41971c6().m42221O7(contactProfile, false);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            Runnable runnable = this.f112402a;
            if (runnable != null) {
                AbstractC19444a.m101695c(runnable);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* renamed from: A */
    public static void m119436A(HashMap hashMap, JSONArray jSONArray, boolean z11, HashSet hashSet) {
        ArrayList arrayList;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray2 = jSONObject.getJSONArray("uIds");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    if (z11) {
                        String m40353g0 = ContactProfile.m40353g0(jSONArray2.getString(i12));
                        arrayList2.add(m40353g0);
                        hashSet.add(m40353g0);
                    } else {
                        arrayList2.add(jSONArray2.getString(i12));
                    }
                }
                int optInt = jSONObject.optInt("errorCode");
                if (optInt != 17016 && optInt != 17032 && optInt != 17053 && optInt != 17049 && optInt != 17050 && optInt != 18007 && optInt != 18008) {
                    switch (optInt) {
                        case 17041:
                        case 17042:
                        case 17043:
                        case 17044:
                        case 17045:
                        case 17046:
                        case 17047:
                            break;
                        default:
                            switch (optInt) {
                                case 18002:
                                case 18003:
                                case 18004:
                                case 18005:
                                    break;
                                default:
                                    if (z11) {
                                        optInt = -2;
                                        break;
                                    } else {
                                        optInt = -1;
                                        break;
                                    }
                            }
                    }
                }
                if (!hashMap.containsKey(Integer.valueOf(optInt))) {
                    arrayList = new ArrayList();
                    hashMap.put(Integer.valueOf(optInt), arrayList);
                } else {
                    arrayList = (ArrayList) hashMap.get(Integer.valueOf(optInt));
                }
                arrayList.addAll(arrayList2);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: B */
    public static void m119437B(View view, long j11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 1.1f, 1.0f);
        ofFloat.setRepeatCount(2);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(450L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.1f, 1.0f);
        ofFloat2.setRepeatCount(2);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setDuration(450L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f, AbstractC23136l9.m118742r(6.0f), 0.0f);
        ofFloat3.setRepeatCount(2);
        ofFloat3.setRepeatMode(2);
        ofFloat3.setDuration(450L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setStartDelay(j11);
        animatorSet.start();
    }

    /* renamed from: C */
    public static void m119438C(String str) {
        m119439D(str, 0);
    }

    /* renamed from: D */
    public static void m119439D(String str, int i11) {
        m119440E(str, i11, "");
    }

    /* renamed from: E */
    public static void m119440E(String str, int i11, String str2) {
        AbstractC23304d.f113435s1.set(true);
        C23744a.m124114c().m124116d(27, str, Integer.valueOf(i11), str2);
        C23744a.m124114c().m124116d(6072, new Object[0]);
        Intent intent = new Intent();
        intent.setAction("com.zing.zalo.ACTION_REFRESH_GROUP_LIST");
        C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent);
    }

    /* renamed from: F */
    public static void m119441F(C21697g c21697g, C21693c c21693c, C7904b c7904b) {
        CharSequence m40774l;
        if (c7904b != null) {
            try {
                if (c7904b.m40778p()) {
                    int i11 = c7904b.f42729a;
                    if (i11 != 0) {
                        if (i11 != 5) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    c21693c.mo44614b1(0);
                                    c21693c.mo111925v1(C27280g.m139660c(c21693c.getContext(), AbstractC23322a.zds_ic_pin_solid_16, AbstractC2807a.icon_02));
                                    if (!TextUtils.isEmpty(c7904b.f42731c)) {
                                        m40774l = new SpannableStringBuilder(c7904b.f42731c).append((CharSequence) " ").append(c7904b.m40774l());
                                    } else {
                                        m40774l = c7904b.m40774l();
                                    }
                                } else {
                                    c21693c.mo44614b1(0);
                                    c21693c.mo111925v1(C27280g.m139659b(c21693c.getContext(), AbstractC23322a.zds_ic_poll_solid_16, AbstractC2808b.gr60));
                                    m40774l = c7904b.m40774l();
                                }
                            } else {
                                c21693c.mo44614b1(0);
                                c21693c.mo111925v1(C27280g.m139660c(c21693c.getContext(), AbstractC23322a.zds_ic_pin_solid_16, AbstractC2807a.icon_02));
                                m40774l = c7904b.m40774l();
                            }
                        } else {
                            c21693c.mo44614b1(0);
                            c21693c.mo111926w1(AbstractC16803z.icn_msg_album);
                            m40774l = c7904b.m40774l();
                        }
                    } else {
                        c21693c.mo44614b1(0);
                        c21693c.mo111925v1(C27280g.m139660c(c21693c.getContext(), AbstractC23322a.zds_ic_note_solid_16, AbstractC2807a.support_informative));
                        m40774l = c7904b.m40774l();
                    }
                    c21697g.mo44614b1(0);
                    c21697g.m111959G1(m40774l);
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (c7904b != null) {
            c21693c.mo44614b1(0);
            c21693c.mo111925v1(C27280g.m139660c(c21693c.getContext(), AbstractC23322a.zds_ic_pin_solid_16, AbstractC2807a.icon_02));
            c21697g.mo44614b1(0);
            c21697g.m111959G1(c7904b.f42736h);
            return;
        }
        c21697g.mo44614b1(8);
        c21693c.mo44614b1(8);
    }

    /* renamed from: G */
    public static String m119442G(String str, int i11) {
        if (str == null) {
            return "";
        }
        if (str.length() > i11) {
            return str.substring(0, i11 - 3) + "...";
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m119445c() {
        if (AbstractC23309i.m121078J8() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m119446d(String str, String str2) {
        C19637j.f97466a.m102858m(str);
        C0943w.m4462l().m4470d(str);
        C0943w.m4462l().m4471e(str);
        C7960e.m41971c6().m42356c4(str);
        C18408p.m97475R(new C18408p.a.InterfaceC32814a() { // from class: me0.n2

            /* renamed from: a */
            public final /* synthetic */ String f112276a;

            public /* synthetic */ C23151n2(String str3) {
                r1 = str3;
            }

            @Override // ee.C18408p.a.InterfaceC32814a
            /* renamed from: a */
            public final void mo2271a(C18408p c18408p) {
                c18408p.m97510G(r1);
            }
        });
        AbstractC21935u.m114533W("group_" + str3, 5, "");
        C7960e.m41971c6().m42376e4(str2);
        C21927m.m114302u().m114346m0(str2);
        AbstractC23306f.m120569C0().m17793t(str2);
        C29210k.m145804c0().m145860a1(str2, null);
        AbstractC23306f.m120584H0().m2630m(str2);
        try {
            C7959d.m41638d1().m41788h0(str2);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        C7959d.m41638d1().m41824s0(str2);
        AbstractC23306f.m120601N().m101508a(new C28923c.b(str2, "GroupUtils", false, false));
        C25994h.f124017a.m133922l(str2);
        C31986k3.f147083a.m154101N0(str2);
        C8967m.m47867E().m47930o0(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:            gw.C19669z.f97569Q.set(false);        gw.C19669z.m103146Y().m103198O0();     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119447e(String str) {
        C31973j5 c31973j5;
        try {
            m119446d(str, "group_" + str);
            try {
                if (C21933s.m114404I().m114451X().f147679k != null) {
                    Iterator it = C21933s.m114404I().m114451X().f147679k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C18450l c18450l = (C18450l) it.next();
                        if (c18450l.f92990a == 2 && (c31973j5 = c18450l.f92989l) != null && !TextUtils.isEmpty(c31973j5.m153781r()) && c18450l.f92989l.m153781r().equals(str)) {
                            break;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            m119438C(str);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: f */
    public static void m119448f(C3535c c3535c) {
        C32058p1 m132048j;
        if (c3535c == null || (m132048j = C25489b.f122105a.m132048j(c3535c.m17944I0())) == null) {
            return;
        }
        c3535c.m17968v0(true);
        c3535c.m17953R0(false);
        c3535c.m17966s0(m132048j.m154673g());
    }

    /* renamed from: g */
    public static void m119449g(int i11, String str, int i12, List list) {
        C7907e c7907e = new C7907e();
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                String str2 = "@" + contactProfile.f42437s;
                c7907e.m40852b(new C7907e.a(Long.parseLong(contactProfile.f42434r), sb2.length(), str2.length()));
                sb2.append(str2);
                sb2.append(" ");
            }
        } else {
            C7907e.a aVar = new C7907e.a();
            aVar.m40868f(1, -1L, 0, C31870c7.f146364m.length());
            c7907e.m40852b(aVar);
            sb2.append(C31870c7.f146364m);
            sb2.append(" ");
        }
        Conversation conversation = new Conversation(str);
        conversation.m40993D(2);
        conversation.m40991B(0);
        String sb3 = sb2.toString();
        C3540h c3540h = new C3540h(conversation.f42893q, sb3, c7907e);
        C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", conversation.f42893q, CoreUtility.f89233i), 0).m95382r(sb3).m95365a();
        m95365a.m94951M9();
        AbstractC23306f.m120562A().m2519L(conversation.f42893q, c3540h);
        C0824j.m2153b(new b(conversation, m95365a));
    }

    /* renamed from: h */
    public static int m119450h(String str) {
        C31973j5 m4472f;
        if (!AbstractC25495a.m132079d(str) || (m4472f = C0943w.m4462l().m4472f(str)) == null) {
            return 0;
        }
        return m4472f.m153732O();
    }

    /* renamed from: i */
    public static HashMap m119451i(String str, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("id", Integer.valueOf(i11));
        return hashMap;
    }

    /* renamed from: j */
    public static HashMap m119452j(String str, int i11, int i12) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("id", Integer.valueOf(i11));
        hashMap.put("color", Integer.valueOf(i12));
        return hashMap;
    }

    /* renamed from: k */
    public static String m119453k(String str, String str2, String str3) {
        C31973j5 m4473g;
        if (!TextUtils.isEmpty(str3) && (m4473g = C0943w.m4462l().m4473g(str3)) != null) {
            return m4473g.m153707B(str, str2);
        }
        return str2;
    }

    /* renamed from: l */
    public static String m119454l(boolean z11, boolean z12) {
        if (z11) {
            if (z12) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_settings_admin_permission_v2);
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_settings_admin_permission_v2);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_everone_permission_v2);
    }

    /* renamed from: m */
    public static String m119455m(int i11) {
        if (i11 > 999) {
            return String.format("+%dK", Integer.valueOf(i11 / 1000));
        }
        if (i11 > 99) {
            return String.format("+%d", Integer.valueOf(i11));
        }
        if (i11 > 9) {
            return String.format("+%d", Integer.valueOf(i11));
        }
        return String.format("+%d", Integer.valueOf(i11));
    }

    /* renamed from: n */
    public static String m119456n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String property = System.getProperty("line.separator");
        int length = str.split(property).length;
        if (length <= 3 && str.length() < 200) {
            return "";
        }
        if (length > 3) {
            StringBuilder sb2 = new StringBuilder();
            String[] split = str.split(property);
            for (int i11 = 0; i11 < 3; i11++) {
                sb2.append(split[i11]);
                sb2.append(property);
            }
            str = sb2.toString();
        }
        if (str.length() >= 200) {
            int lastIndexOf = str.lastIndexOf(" ", 149);
            int lastIndexOf2 = str.lastIndexOf(property, 149);
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            } else if (lastIndexOf2 > 0) {
                str = str.substring(0, lastIndexOf2);
            } else {
                str = str.substring(0, 149);
            }
        }
        return str + "...";
    }

    /* renamed from: o */
    public static View m119457o(Context context, C31961i8.a aVar, GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a interfaceC6959a) {
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            ArrayList arrayList = aVar.f146906f;
            if (arrayList != null && !arrayList.isEmpty()) {
                RecyclerView recyclerView = new RecyclerView(context);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                GroupPollOptionsDetailRecyclerAdapter groupPollOptionsDetailRecyclerAdapter = new GroupPollOptionsDetailRecyclerAdapter(context, arrayList, interfaceC6959a);
                recyclerView.setAdapter(groupPollOptionsDetailRecyclerAdapter);
                recyclerView.m9826E(new a(linearLayoutManager, arrayList, groupPollOptionsDetailRecyclerAdapter));
                int min = Math.min(20, arrayList.size() - 1);
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 <= min; i11++) {
                    String str = (String) arrayList.get(i11);
                    if (C28203u6.f131407a.m141809c(str) == null) {
                        arrayList2.add(str);
                    }
                }
                if (arrayList2.size() > 0) {
                    m119463u(arrayList2, new RunnableC23173p2(groupPollOptionsDetailRecyclerAdapter));
                }
                return recyclerView;
            }
            View inflate = layoutInflater.inflate(AbstractC7409c0.no_votes_view, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.text_no_vote);
            if (textView != null) {
                if (aVar.f146905e.equals("POLL_ID_NOT_YET_VOTE")) {
                    textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_noone_not_vote_yet));
                } else {
                    textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_votes_yet));
                }
            }
            return inflate;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public static boolean m119458p(String str) {
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        if (m4472f != null && m4472f.m153742T()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[Catch: Exception -> 0x000f, TRY_LEAVE, TryCatch #0 {Exception -> 0x000f, blocks: (B:15:0x0007, B:17:0x000a, B:6:0x0015), top: B:14:0x0007 }] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m119459q(String str, int i11, Object... objArr) {
        String str2;
        if (i11 == 52) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        str2 = (String) objArr[0];
                        if (str != null) {
                            if (TextUtils.equals("group_" + str, str2)) {
                                return true;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            str2 = "";
            if (str != null) {
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m119460r(Conversation conversation) {
        C31973j5 m4472f;
        if (!conversation.m41013q() || (m4472f = C0943w.m4462l().m4472f(conversation.f42893q)) == null || !m4472f.m153745W()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static /* synthetic */ void m119462t(ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            try {
                if (C28203u6.f131407a.m141809c((String) arrayList.get(i11)) == null) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) arrayList.get(i11))));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (arrayList2.size() > 0) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(runnable));
            c0766k.mo1782y5(arrayList2, new TrackingSource(-1));
        }
    }

    /* renamed from: u */
    public static void m119463u(ArrayList arrayList, Runnable runnable) {
        if (arrayList != null && arrayList.size() != 0) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.o2

                /* renamed from: p */
                public final /* synthetic */ ArrayList f112339p;

                /* renamed from: q */
                public final /* synthetic */ ArrayList f112340q;

                /* renamed from: r */
                public final /* synthetic */ Runnable f112341r;

                public /* synthetic */ RunnableC23162o2(ArrayList arrayList2, ArrayList arrayList3, Runnable runnable2) {
                    r1 = arrayList2;
                    r2 = arrayList3;
                    r3 = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23184q2.m119462t(r1, r2, r3);
                }
            });
        }
    }

    /* renamed from: v */
    public static void m119464v(ZaloView zaloView) {
        AbstractC28207v1.m141994i3("action.open.grouptab.with.tip", 3, zaloView.m92676n2(), zaloView, "", null);
    }

    /* renamed from: w */
    public static void m119465w(String str, Context context, InterfaceC27218a interfaceC27218a) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(AbstractC20550a.m106804a(str))) {
                    AbstractC20550a.m106805b(context, str);
                } else if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
                    ZaloWebView.m87105iS(interfaceC27218a, str, new Bundle());
                }
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_msg_link_not_found, new Object[0]);
            }
        } catch (ActivityNotFoundException unused) {
            AbstractC23152n3.m119048i0(context, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public static void m119466x(C7904b c7904b, String str, C17487o0 c17487o0, boolean z11) {
        if (c7904b == null || !c7904b.m40779q() || c17487o0 == null) {
            return;
        }
        try {
            AbstractC23647d.m123897g("1001683");
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_board_gen_id", C25490c.m132054j().m132059e(c7904b).m154218b());
            bundle.putString("extra_group_id", str);
            bundle.putBoolean("extra_shortcut_groupboard", z11);
            c17487o0.m93069k2(PinMessageDetailView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public static void m119467y(String str, String str2, C17487o0 c17487o0, boolean z11) {
        if (TextUtils.isEmpty(str) || c17487o0 == null) {
            return;
        }
        try {
            AbstractC23647d.m123897g("1001683");
            Bundle bundle = new Bundle();
            bundle.putString("extra_topic_id", str);
            bundle.putString("extra_group_id", str2);
            bundle.putBoolean("extra_shortcut_groupboard", z11);
            c17487o0.m93069k2(PinMessageDetailView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    public static void m119468z(JSONArray jSONArray, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                ArrayList arrayList7 = new ArrayList();
                JSONArray jSONArray2 = jSONObject.getJSONArray("uIds");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    arrayList7.add(jSONArray2.getString(i12));
                }
                int optInt = jSONObject.optInt("errorCode");
                if (optInt != 17041) {
                    if (optInt != 18002) {
                        if (optInt != 18005) {
                            if (optInt != 18007) {
                                if (optInt != 18008) {
                                    arrayList6.addAll(arrayList7);
                                } else {
                                    arrayList4.addAll(arrayList7);
                                }
                            } else {
                                arrayList3.addAll(arrayList7);
                            }
                        } else {
                            arrayList2.addAll(arrayList7);
                        }
                    } else {
                        arrayList.addAll(arrayList7);
                    }
                } else {
                    arrayList5.addAll(arrayList7);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }
}
