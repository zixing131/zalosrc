package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7129l5;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mp.C23418f;
import np.InterfaceC23923b;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p458qr.C25470c;
import p458qr.C25471d;
import p461qu.AbstractC25495a;
import p509sp.C26361j;
import p716zh.C32093r8;
import ui0.C27280g;
import vg.AbstractC28034c7;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class ProfilePickerView extends SlidableZaloView implements InterfaceC0733x, InterfaceC23923b {

    /* renamed from: G1 */
    static final String f76439G1 = "ProfilePickerView";

    /* renamed from: C1 */
    PrivacyInfo f76442C1;

    /* renamed from: P0 */
    TextView f76446P0;

    /* renamed from: Q0 */
    MultiStateView f76447Q0;

    /* renamed from: R0 */
    RecyclerView f76448R0;

    /* renamed from: S0 */
    C7005a5 f76449S0;

    /* renamed from: T0 */
    ListView f76450T0;

    /* renamed from: U0 */
    EditText f76451U0;

    /* renamed from: V0 */
    int f76452V0;

    /* renamed from: Z0 */
    C7129l5 f76456Z0;

    /* renamed from: d1 */
    C23528a f76460d1;

    /* renamed from: p1 */
    View f76472p1;

    /* renamed from: W0 */
    int f76453W0 = -1;

    /* renamed from: X0 */
    String f76454X0 = "";

    /* renamed from: Y0 */
    int f76455Y0 = -1;

    /* renamed from: a1 */
    int f76457a1 = 0;

    /* renamed from: b1 */
    boolean f76458b1 = false;

    /* renamed from: c1 */
    final String f76459c1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: e1 */
    int f76461e1 = 30;

    /* renamed from: f1 */
    boolean f76462f1 = false;

    /* renamed from: g1 */
    boolean f76463g1 = false;

    /* renamed from: h1 */
    boolean f76464h1 = false;

    /* renamed from: i1 */
    boolean f76465i1 = false;

    /* renamed from: j1 */
    LinkedHashMap f76466j1 = new LinkedHashMap();

    /* renamed from: k1 */
    volatile ArrayList f76467k1 = new ArrayList();

    /* renamed from: l1 */
    volatile ArrayList f76468l1 = new ArrayList();

    /* renamed from: m1 */
    ArrayList f76469m1 = new ArrayList();

    /* renamed from: n1 */
    ArrayList f76470n1 = new ArrayList();

    /* renamed from: o1 */
    String f76471o1 = null;

    /* renamed from: q1 */
    EnumC14809h f76473q1 = EnumC14809h.ZALO_FRIEND;

    /* renamed from: r1 */
    boolean f76474r1 = false;

    /* renamed from: s1 */
    boolean f76475s1 = false;

    /* renamed from: t1 */
    ArrayList f76476t1 = new ArrayList();

    /* renamed from: u1 */
    String f76477u1 = "";

    /* renamed from: v1 */
    boolean f76478v1 = false;

    /* renamed from: w1 */
    boolean f76479w1 = false;

    /* renamed from: x1 */
    Map f76480x1 = Collections.synchronizedMap(new HashMap());

    /* renamed from: y1 */
    Runnable f76481y1 = new RunnableC14802a();

    /* renamed from: z1 */
    boolean f76482z1 = false;

    /* renamed from: A1 */
    long f76440A1 = -1;

    /* renamed from: B1 */
    int f76441B1 = 0;

    /* renamed from: D1 */
    TextWatcher f76443D1 = new C14803b();

    /* renamed from: E1 */
    InterfaceC0765j f76444E1 = new C0766k();

    /* renamed from: F1 */
    InterfaceC20094a f76445F1 = new C14807f();

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$a */
    /* loaded from: classes6.dex */
    class RunnableC14802a implements Runnable {
        RunnableC14802a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ProfilePickerView.this.f76448R0.mo9854S1(r0.f76469m1.size() - 1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$b */
    /* loaded from: classes6.dex */
    class C14803b extends AbstractC18391a {
        C14803b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            EditText editText = ProfilePickerView.this.f76451U0;
            if (editText != null && editText.getText() != null) {
                new C14808g(ProfilePickerView.this.f76451U0.getText().toString().trim());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$c */
    /* loaded from: classes6.dex */
    public class C14804c extends AbstractC28034c7 {
        C14804c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    ProfilePickerView.this.f76456Z0.m36306e(false);
                    ProfilePickerView.this.f76456Z0.notifyDataSetChanged();
                } else {
                    ProfilePickerView.this.f76456Z0.m36306e(true);
                    AbstractC2379w.m12430d(ProfilePickerView.this.f76451U0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$d */
    /* loaded from: classes6.dex */
    class C14805d extends ZdsActionBar.AbstractC16987c {
        C14805d() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC2379w.m12430d(ProfilePickerView.this.f76451U0);
            ProfilePickerView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$e */
    /* loaded from: classes6.dex */
    public class C14806e implements C23418f.a {
        C14806e() {
        }

        /* renamed from: d */
        public /* synthetic */ void m83075d() {
            ProfilePickerView.this.m83064GM();
        }

        @Override // mp.C23418f.a
        /* renamed from: a */
        public void mo79430a(PrivacyInfo privacyInfo) {
            ProfilePickerView profilePickerView = ProfilePickerView.this;
            profilePickerView.f76442C1 = privacyInfo;
            profilePickerView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w70
                public /* synthetic */ w70() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ProfilePickerView.C14806e.this.m83075d();
                }
            });
        }

        @Override // mp.C23418f.a
        /* renamed from: b */
        public void mo79431b(boolean z11) {
            if (z11) {
                ProfilePickerView.this.mo46829Y();
            } else {
                ProfilePickerView.this.mo78960q3();
            }
        }

        @Override // mp.C23418f.a
        public void onError(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$f */
    /* loaded from: classes6.dex */
    public class C14807f implements InterfaceC20094a {
        C14807f() {
        }

        /* renamed from: g */
        public static /* synthetic */ int m83080g(ContactProfile contactProfile, ContactProfile contactProfile2) {
            return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
        }

        /* renamed from: h */
        public static /* synthetic */ int m83081h(InviteContactProfile inviteContactProfile, InviteContactProfile inviteContactProfile2) {
            return inviteContactProfile.f42440t.compareToIgnoreCase(inviteContactProfile2.f42440t);
        }

        /* renamed from: i */
        public /* synthetic */ void m83082i() {
            ProfilePickerView.this.m83064GM();
        }

        /* renamed from: j */
        public /* synthetic */ void m83083j(C20096c c20096c) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            try {
                int m104491c = c20096c.m104491c();
                ProfilePickerView.this.m83067JM(false);
                ProfilePickerView.this.f76447Q0.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView = ProfilePickerView.this.f76447Q0;
                if (m104491c == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                MultiStateView multiStateView2 = ProfilePickerView.this.f76447Q0;
                if (m104491c == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_tv_loadingGroupList_error;
                }
                multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    ProfilePickerView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.a80

                        /* renamed from: q */
                        public final /* synthetic */ C20096c f79792q;

                        public /* synthetic */ a80(C20096c c20096c2) {
                            r2 = c20096c2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.C14807f.this.m83083j(r2);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    ProfilePickerView.this.f76470n1.clear();
                    String optString = jSONObject2.optString("creatorId");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                    if (optJSONArray2 != null) {
                        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                            JSONObject jSONObject3 = (JSONObject) optJSONArray2.get(i11);
                            String optString2 = jSONObject3.optString("id");
                            String optString3 = jSONObject3.optString("dName");
                            String optString4 = jSONObject3.optString("avatar");
                            if (!TextUtils.isEmpty(optString2)) {
                                ContactProfile m141809c = C28203u6.f131407a.m141809c(optString2);
                                if (m141809c == null) {
                                    ContactProfile contactProfile = new ContactProfile(optString2);
                                    contactProfile.f42437s = optString3;
                                    contactProfile.f42446v = optString4;
                                    contactProfile.f42330D = System.currentTimeMillis();
                                    C7960e.m41971c6().m42221O7(contactProfile, false);
                                } else if (TextUtils.isEmpty(m141809c.f42437s) || TextUtils.isEmpty(m141809c.f42446v)) {
                                    ContactProfile contactProfile2 = new ContactProfile(optString2);
                                    contactProfile2.f42437s = optString3;
                                    contactProfile2.f42446v = optString4;
                                    contactProfile2.f42330D = System.currentTimeMillis();
                                    C7960e.m41971c6().m42221O7(contactProfile2, false);
                                }
                                if (!optString.equals(optString2)) {
                                    ProfilePickerView.this.f76470n1.add(m141809c);
                                }
                            }
                        }
                    }
                    ProfilePickerView.this.f76476t1.clear();
                    if (ProfilePickerView.this.f76474r1 && optString.equals(CoreUtility.f89233i) && (optJSONArray = jSONObject2.optJSONArray("admins")) != null) {
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            try {
                                JSONObject jSONObject4 = (JSONObject) optJSONArray.get(i12);
                                String optString5 = jSONObject4.optString("id");
                                String optString6 = jSONObject4.optString("dName");
                                String optString7 = jSONObject4.optString("avatar");
                                if (!TextUtils.isEmpty(optString5)) {
                                    ContactProfile m141809c2 = C28203u6.f131407a.m141809c(optString5);
                                    if (m141809c2 == null) {
                                        ContactProfile contactProfile3 = new ContactProfile(optString5);
                                        contactProfile3.f42437s = optString6;
                                        contactProfile3.f42446v = optString7;
                                        contactProfile3.f42330D = System.currentTimeMillis();
                                        C7960e.m41971c6().m42221O7(contactProfile3, false);
                                    }
                                    ProfilePickerView.this.f76476t1.add(new InviteContactProfile(m141809c2));
                                    ProfilePickerView.this.f76470n1.add(m141809c2);
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    int size = ProfilePickerView.this.f76470n1.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((ContactProfile) ProfilePickerView.this.f76470n1.get(i13)).f42440t = AbstractC23262x6.m120002o(((ContactProfile) ProfilePickerView.this.f76470n1.get(i13)).m40383Q(true, false)).trim();
                    }
                    Collections.sort(ProfilePickerView.this.f76470n1, new Comparator() { // from class: com.zing.zalo.ui.zviews.x70
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            int m83080g;
                            m83080g = ProfilePickerView.C14807f.m83080g((ContactProfile) obj2, (ContactProfile) obj3);
                            return m83080g;
                        }
                    });
                    ProfilePickerView profilePickerView = ProfilePickerView.this;
                    if (profilePickerView.f76475s1 && !profilePickerView.f76476t1.isEmpty()) {
                        int size2 = ProfilePickerView.this.f76476t1.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            ((InviteContactProfile) ProfilePickerView.this.f76476t1.get(i14)).f42440t = AbstractC23262x6.m120002o(((InviteContactProfile) ProfilePickerView.this.f76476t1.get(i14)).m40383Q(true, false)).trim();
                        }
                        Collections.sort(ProfilePickerView.this.f76476t1, new Comparator() { // from class: com.zing.zalo.ui.zviews.y70
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                int m83081h;
                                m83081h = ProfilePickerView.C14807f.m83081h((InviteContactProfile) obj2, (InviteContactProfile) obj3);
                                return m83081h;
                            }
                        });
                    }
                    ProfilePickerView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.z70
                        public /* synthetic */ z70() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.C14807f.this.m83082i();
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$g */
    /* loaded from: classes6.dex */
    public class C14808g extends Thread {

        /* renamed from: p */
        final String f76489p;

        /* renamed from: q */
        int f76490q;

        public C14808g(String str) {
            super("Z:ProfilePicker-Search");
            this.f76490q = 0;
            this.f76489p = str;
            start();
        }

        /* renamed from: c */
        public /* synthetic */ void m83086c() {
            if (TextUtils.isEmpty(ProfilePickerView.this.f76451U0.getText().toString().trim())) {
                ProfilePickerView.this.m83064GM();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m83087d(ArrayList arrayList) {
            int i11;
            try {
                if (this.f76489p.equals(ProfilePickerView.this.f76451U0.getText().toString().trim())) {
                    ProfilePickerView.this.f76467k1 = arrayList;
                    ProfilePickerView profilePickerView = ProfilePickerView.this;
                    profilePickerView.f76457a1 = this.f76490q;
                    profilePickerView.m83066IM(AbstractC8020f0.str_emptyResult);
                    ProfilePickerView.this.m83067JM(false);
                    ProfilePickerView profilePickerView2 = ProfilePickerView.this;
                    if (profilePickerView2.f76457a1 > 0) {
                        TextView textView = profilePickerView2.f76446P0;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_refix_number_of_friend);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(ProfilePickerView.this.f76457a1);
                        if (ProfilePickerView.this.f76457a1 > 1) {
                            i11 = AbstractC8020f0.str_more_s;
                        } else {
                            i11 = AbstractC8020f0.str_single_form;
                        }
                        objArr[1] = AbstractC23136l9.m118743r0(i11);
                        textView.setText(String.format(m118743r0, objArr));
                    }
                    ProfilePickerView profilePickerView3 = ProfilePickerView.this;
                    C7129l5 c7129l5 = profilePickerView3.f76456Z0;
                    if (c7129l5 != null) {
                        c7129l5.m36305d(profilePickerView3.f76467k1);
                        ProfilePickerView.this.f76456Z0.notifyDataSetChanged();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str = this.f76489p;
                if (str != null && !str.equals("")) {
                    ProfilePickerView.this.m83071sM(this.f76489p, arrayList2);
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) arrayList2.get(i11);
                        try {
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i)) {
                            if (!AbstractC25495a.m132086k(inviteContactProfile.f42434r)) {
                                if (!inviteContactProfile.m40372J0()) {
                                    if (C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && ProfilePickerView.this.f76473q1 == EnumC14809h.ZALO_FRIEND) {
                                    }
                                    arrayList.add(inviteContactProfile);
                                    this.f76490q++;
                                }
                            }
                        }
                    }
                    ProfilePickerView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.c80

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f80004q;

                        public /* synthetic */ c80(ArrayList arrayList3) {
                            r2 = arrayList3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.C14808g.this.m83087d(r2);
                        }
                    });
                    return;
                }
                if (ProfilePickerView.this.f72421L0.m92676n2() != null) {
                    ProfilePickerView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.b80
                        public /* synthetic */ b80() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.C14808g.this.m83086c();
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfilePickerView$h */
    /* loaded from: classes6.dex */
    public enum EnumC14809h {
        ZALO_FRIEND,
        GROUP_FRIEND
    }

    /* renamed from: AM */
    public /* synthetic */ void m83040AM() {
        int i11;
        try {
            if (this.f76473q1 == EnumC14809h.ZALO_FRIEND) {
                if (this.f76440A1 != -1) {
                    m83066IM(AbstractC8020f0.str_empty_picker_tag_friend_album);
                } else {
                    m83066IM(AbstractC8020f0.invitetalk01);
                }
            } else {
                m83066IM(AbstractC8020f0.str_emptyResult);
                m83065HM(AbstractC16803z.illus_empty);
            }
            m83067JM(false);
            if (this.f76457a1 > 0) {
                TextView textView = this.f76446P0;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_refix_number_of_friend);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.f76457a1);
                if (this.f76457a1 > 1) {
                    i11 = AbstractC8020f0.str_more_s;
                } else {
                    i11 = AbstractC8020f0.str_single_form;
                }
                objArr[1] = AbstractC23136l9.m118743r0(i11);
                textView.setText(String.format(m118743r0, objArr));
            }
            if (this.f76456Z0 != null) {
                if (this.f76475s1 && !this.f76476t1.isEmpty()) {
                    if (this.f76467k1.size() > 0) {
                        ((InviteContactProfile) this.f76467k1.get(0)).f42407e1 = false;
                    }
                    ArrayList arrayList = this.f76476t1;
                    ((InviteContactProfile) arrayList.get(arrayList.size() - 1)).f42405d1 = true;
                    this.f76467k1.addAll(0, this.f76476t1);
                    InviteContactProfile inviteContactProfile = new InviteContactProfile();
                    inviteContactProfile.f42437s = "Admin";
                    inviteContactProfile.m40403e1(false);
                    inviteContactProfile.f42407e1 = true;
                    this.f76467k1.add(0, inviteContactProfile);
                }
                this.f76456Z0.m36305d(this.f76467k1);
                this.f76456Z0.notifyDataSetChanged();
                if (this.f76455Y0 >= 0 && this.f76456Z0.getCount() > 0) {
                    this.f76450T0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.v70
                        public /* synthetic */ v70() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.this.m83062zM();
                        }
                    }, 100L);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ void m83041BM() {
        if (this.f76453W0 >= 0 && this.f76456Z0.getCount() > 0) {
            this.f76450T0.setSelection(this.f76453W0);
            this.f76453W0 = -1;
        }
    }

    /* renamed from: CM */
    public /* synthetic */ void m83042CM(RecyclerView recyclerView, int i11, View view) {
        try {
            String str = ((InviteContactProfile) this.f76469m1.get(i11)).f42434r;
            this.f76453W0 = -1;
            EditText editText = this.f76451U0;
            String str2 = "";
            if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                this.f76454X0 = ((InviteContactProfile) this.f76469m1.get(i11)).f42434r;
                C7129l5 c7129l5 = this.f76456Z0;
                if (c7129l5.m36302a().equals(str)) {
                    str = "";
                }
                c7129l5.m36307f(str);
                this.f76451U0.setText("");
                AbstractC2379w.m12430d(this.f76451U0);
                return;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= this.f76456Z0.getCount()) {
                    break;
                }
                if (this.f76456Z0.getItem(i12) != null && ((InviteContactProfile) this.f76456Z0.getItem(i12)).f42434r.equals(str)) {
                    if (!str.equals(this.f76456Z0.m36302a())) {
                        this.f76453W0 = i12;
                    }
                } else {
                    i12++;
                }
            }
            C7129l5 c7129l52 = this.f76456Z0;
            if (!c7129l52.m36302a().equals(str)) {
                str2 = str;
            }
            c7129l52.m36307f(str2);
            this.f76456Z0.notifyDataSetChanged();
            this.f76449S0.m35847N(str);
            this.f76449S0.m10008p();
            this.f76450T0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.u70
                public /* synthetic */ u70() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ProfilePickerView.this.m83041BM();
                }
            }, 100L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DM */
    public /* synthetic */ void m83043DM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            if (this.f76456Z0.m36303b()) {
                return;
            }
            this.f76452V0 = i11 - this.f76450T0.getHeaderViewsCount();
            C7129l5 c7129l5 = this.f76456Z0;
            if (c7129l5 != null && c7129l5.getCount() > 0) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f76456Z0.getItem(this.f76452V0);
                if (inviteContactProfile != null) {
                    if (this.f76466j1.containsKey(inviteContactProfile.f42434r)) {
                        this.f76469m1.remove(inviteContactProfile);
                        this.f76466j1.remove(inviteContactProfile.f42434r);
                        this.f76449S0.m35846M(this.f76469m1);
                        this.f76449S0.m10008p();
                        this.f76456Z0.m36305d(this.f76467k1);
                        this.f76456Z0.notifyDataSetChanged();
                        if (this.f76469m1.size() == 0) {
                            this.f76448R0.setVisibility(8);
                        }
                        C7129l5 c7129l52 = this.f76456Z0;
                        if (c7129l52 != null && c7129l52.m36302a().equals(inviteContactProfile.f42434r)) {
                            this.f76456Z0.m36307f("");
                            this.f76449S0.m35847N("");
                            this.f76449S0.m10008p();
                        }
                        EditText editText = this.f76451U0;
                        if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                            this.f76451U0.setText("");
                        }
                        m83070MM();
                        m83072tM();
                    } else {
                        int size = this.f76466j1.size();
                        int i12 = this.f76461e1;
                        if (size >= i12) {
                            if (this.f76482z1) {
                                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_profile_picker_max_except_inform, Integer.valueOf(i12)));
                            } else {
                                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.profile_picker_max_pick_inform, Integer.valueOf(i12)));
                            }
                        } else {
                            if (inviteContactProfile.m40374K0() && !this.f76468l1.contains(inviteContactProfile)) {
                                this.f76468l1.add(inviteContactProfile);
                            }
                            this.f76469m1.add(inviteContactProfile);
                            this.f76466j1.put(inviteContactProfile.f42434r, inviteContactProfile);
                            this.f76449S0.m35846M(this.f76469m1);
                            this.f76449S0.m10008p();
                            this.f76448R0.setVisibility(0);
                            this.f76448R0.post(this.f76481y1);
                            EditText editText2 = this.f76451U0;
                            if (editText2 != null && !TextUtils.isEmpty(editText2.getEditableText().toString())) {
                                this.f76451U0.setText("");
                            }
                            m83072tM();
                        }
                    }
                }
                this.f76456Z0.m36305d(this.f76467k1);
                this.f76456Z0.notifyDataSetChanged();
                m83070MM();
            }
            this.f76479w1 = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    public /* synthetic */ void m83044EM() {
        if (C23055e5.m118271f()) {
            m83073wM();
            return;
        }
        m83067JM(false);
        this.f76447Q0.setState(MultiStateView.EnumC15914e.ERROR);
        this.f76447Q0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        this.f76447Q0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
    }

    /* renamed from: NM */
    private void m83045NM() {
        int m119606n;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && m87077NK.getTrailingButton() != null) {
            if (m87077NK.getTrailingButton().isEnabled()) {
                m119606n = AbstractC23136l9.m118639A(AbstractC2808b.f150821b60);
            } else {
                m119606n = C23212s8.m119606n(AbstractC2807a.button_disabled_icon);
            }
            if (this.f76464h1) {
                m87077NK.getTrailingButton().setTextColor(m119606n);
            } else {
                m87077NK.setTrailingButton1Color(m119606n);
            }
        }
    }

    /* renamed from: nM */
    private void m83053nM(ArrayList arrayList) {
        InviteContactProfile inviteContactProfile;
        try {
            boolean z11 = this.f72421L0.m92642L3().getBoolean("extra_use_data_from_picker", false);
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Parcelable parcelable = (Parcelable) it.next();
                    if ((parcelable instanceof InviteContactProfile) && (inviteContactProfile = (InviteContactProfile) parcelable) != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                        if (z11) {
                            inviteContactProfile = m83059vM(inviteContactProfile);
                        }
                        if (this.f76466j1.containsKey(inviteContactProfile.f42434r)) {
                            this.f76469m1.remove(inviteContactProfile);
                            this.f76449S0.m35846M(this.f76469m1);
                            this.f76449S0.m10008p();
                            this.f76466j1.remove(inviteContactProfile.f42434r);
                            if (this.f76469m1.size() == 0) {
                                this.f76448R0.setVisibility(8);
                            }
                        } else {
                            this.f76469m1.add(inviteContactProfile);
                            this.f76449S0.m35846M(this.f76469m1);
                            this.f76449S0.m10008p();
                            this.f76466j1.put(inviteContactProfile.f42434r, inviteContactProfile);
                            this.f76448R0.setVisibility(0);
                            this.f76448R0.post(this.f76481y1);
                        }
                        this.f76478v1 = !this.f76466j1.isEmpty();
                        m83072tM();
                        m83070MM();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: oM */
    private void m83054oM() {
        try {
            if (this.f76440A1 != -1 && this.f76442C1 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = this.f76442C1.f45974q;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        LikeContactItem likeContactItem = (LikeContactItem) it.next();
                        if (likeContactItem != null) {
                            hashSet.add(likeContactItem.m56333d());
                        }
                    }
                }
                this.f76470n1 = m83058uM(this.f76470n1, hashSet, this.f76442C1.f45973p);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: pM */
    public static Bundle m83055pM(ArrayList arrayList, int i11, String str) {
        Bundle bundle = new Bundle();
        if (arrayList != null && arrayList.size() > 0) {
            bundle.putParcelableArrayList("extra_initial_selected_profiles", arrayList);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("extra_activity_title", str);
        }
        bundle.putInt("extra_max_pick_count", i11);
        return bundle;
    }

    /* renamed from: qM */
    public static Bundle m83056qM(ArrayList arrayList, int i11, String str) {
        Bundle bundle = new Bundle();
        if (arrayList != null && arrayList.size() > 0) {
            bundle.putParcelableArrayList("extra_initial_selected_profiles", arrayList);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("extra_activity_title", str);
        }
        bundle.putInt("extra_max_pick_count", i11);
        return bundle;
    }

    /* renamed from: rM */
    public static Intent m83057rM(Context context, ArrayList arrayList, int i11, String str) {
        Intent intent = new Intent();
        if (arrayList != null && arrayList.size() > 0) {
            intent.putParcelableArrayListExtra("extra_initial_selected_profiles", arrayList);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("extra_activity_title", str);
        }
        intent.putExtra("extra_max_pick_count", i11);
        return intent;
    }

    /* renamed from: uM */
    private ArrayList m83058uM(ArrayList arrayList, Set set, int i11) {
        if (arrayList == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    arrayList2.addAll(arrayList);
                } else if (set != null && !set.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ContactProfile contactProfile = (ContactProfile) it.next();
                        if (contactProfile != null && !set.contains(contactProfile.f42434r)) {
                            arrayList2.add(contactProfile);
                        }
                    }
                }
            } else if (set != null && !set.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ContactProfile contactProfile2 = (ContactProfile) it2.next();
                    if (contactProfile2 != null && set.contains(contactProfile2.f42434r)) {
                        arrayList2.add(contactProfile2);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: vM */
    private InviteContactProfile m83059vM(InviteContactProfile inviteContactProfile) {
        if (this.f76467k1 != null && !this.f76467k1.isEmpty() && inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
            Iterator it = this.f76467k1.iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile2 = (InviteContactProfile) it.next();
                if (inviteContactProfile2 != null && inviteContactProfile.f42434r.equals(inviteContactProfile2.f42434r)) {
                    return new InviteContactProfile(inviteContactProfile2);
                }
            }
            return inviteContactProfile;
        }
        return inviteContactProfile;
    }

    /* renamed from: xM */
    private void m83060xM() {
        long j11 = this.f76440A1;
        if (j11 == -1) {
            return;
        }
        C23418f.f113810a.m123074a(j11, this.f76441B1, new C14806e());
    }

    /* renamed from: yM */
    public /* synthetic */ void m83061yM(View view) {
        AbstractC2379w.m12430d(this.f76451U0);
        m83063FM();
    }

    /* renamed from: zM */
    public /* synthetic */ void m83062zM() {
        this.f76450T0.setSelection(this.f76455Y0);
        this.f76455Y0 = -1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        EnumC14809h enumC14809h;
        super.mo37111CJ(bundle);
        this.f76460d1 = new C23528a(this.f72421L0.m92648SI());
        this.f72421L0.m92676n2().mo35554O(32);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.getBoolean("extra_viewmode_group", false)) {
                enumC14809h = EnumC14809h.GROUP_FRIEND;
            } else {
                enumC14809h = EnumC14809h.ZALO_FRIEND;
            }
            this.f76473q1 = enumC14809h;
            this.f76474r1 = m92642L3.getBoolean("extra_show_full_member", false);
            this.f76475s1 = m92642L3.getBoolean("extra_show_section_admin", false);
            this.f76477u1 = m92642L3.getString("extra_group_id", "");
            if (m92642L3.containsKey("allow_empty_pick")) {
                this.f76463g1 = m92642L3.getBoolean("allow_empty_pick");
            }
            if (m92642L3.containsKey("extra_show_text_instead_icon")) {
                this.f76464h1 = m92642L3.getBoolean("extra_show_text_instead_icon");
            }
            if (m92642L3.containsKey("extra_activity_title")) {
                this.f76471o1 = m92642L3.getString("extra_activity_title");
            }
            if (m92642L3.containsKey("extra_type_exclude_friends")) {
                this.f76482z1 = m92642L3.getBoolean("extra_type_exclude_friends", false);
            }
            this.f76440A1 = m92642L3.getLong("extra_album_id_to_get_friend_list_privacy", -1L);
            this.f76441B1 = m92642L3.getInt("extra_album_privacy_type_to_get_friend_list_privacy", 0);
            this.f76465i1 = m92642L3.getBoolean("extra_enable_light_status_when_exit", false);
        }
    }

    /* renamed from: FM */
    void m83063FM() {
        try {
            if (this.f76458b1) {
                return;
            }
            this.f76458b1 = true;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            LinkedHashMap linkedHashMap = this.f76466j1;
            if (linkedHashMap != null) {
                for (InviteContactProfile inviteContactProfile : linkedHashMap.values()) {
                    if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r) && !TextUtils.isEmpty(inviteContactProfile.f42437s)) {
                        arrayList.add(inviteContactProfile);
                    }
                }
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("extra_selected_profiles", arrayList);
                intent.putExtra("extra_is_changed_list", this.f76479w1);
                this.f72421L0.mo50035CK(-1, intent);
            } else {
                Intent intent2 = new Intent();
                intent2.putParcelableArrayListExtra("extra_selected_profiles", null);
                intent2.putExtra("extra_is_changed_list", this.f76479w1);
                this.f72421L0.mo50035CK(-1, intent2);
            }
            finish();
        } catch (Exception unused) {
            if (!this.f72421L0.mo60294yp()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
            this.f76458b1 = false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76472p1 = layoutInflater.inflate(AbstractC7409c0.profile_picker_view, viewGroup, false);
        m92637BK(true);
        m83069LM();
        return this.f76472p1;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: GM */
    public synchronized void m83064GM() {
        try {
            try {
                if (this.f76473q1 == EnumC14809h.ZALO_FRIEND) {
                    this.f76470n1 = C18644n.m98531l().mo98465a(null, false);
                }
                m83054oM();
                if (this.f76467k1 == null) {
                    this.f76467k1 = new ArrayList();
                } else {
                    this.f76467k1.clear();
                }
                this.f76455Y0 = -1;
                this.f76457a1 = 0;
                int m122127lb = AbstractC23309i.m122127lb();
                int size = this.f76470n1.size();
                int i11 = -1;
                int i12 = 0;
                boolean z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    try {
                        ContactProfile contactProfile = (ContactProfile) this.f76470n1.get(i13);
                        if (contactProfile != null) {
                            InviteContactProfile inviteContactProfile = new InviteContactProfile(contactProfile);
                            if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && ((!C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) || this.f76473q1 != EnumC14809h.ZALO_FRIEND) && (m122127lb != 1 || inviteContactProfile.f42382U0 != 0 || this.f76473q1 != EnumC14809h.ZALO_FRIEND))) {
                                String str = "" + inviteContactProfile.f42440t.trim().charAt(0);
                                Locale locale = Locale.ENGLISH;
                                char charAt = str.toUpperCase(locale).charAt(0);
                                i11++;
                                if (i11 != 0) {
                                    try {
                                        char charAt2 = ("" + ((ContactProfile) this.f76470n1.get(i12)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                        if (this.f76459c1.indexOf(charAt2) != -1) {
                                            if (charAt > charAt2) {
                                                if (this.f76459c1.indexOf(charAt) != -1) {
                                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                                    inviteContactProfile2.f42437s = "" + charAt;
                                                    inviteContactProfile2.m40403e1(false);
                                                    if (!z11) {
                                                        inviteContactProfile2.f42407e1 = true;
                                                        z11 = true;
                                                    }
                                                    int size2 = this.f76467k1.size();
                                                    if (size2 > 0) {
                                                        int i14 = size2 - 1;
                                                        if (((InviteContactProfile) this.f76467k1.get(i14)).m40366G0()) {
                                                            ((InviteContactProfile) this.f76467k1.get(i14)).f42405d1 = true;
                                                        }
                                                    }
                                                    this.f76467k1.add(inviteContactProfile2);
                                                } else {
                                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                                    if (this.f76459c1.indexOf(charAt) == -1) {
                                                        inviteContactProfile3.f42437s = "##";
                                                    } else {
                                                        inviteContactProfile3.f42437s = "" + charAt;
                                                    }
                                                    inviteContactProfile3.m40403e1(false);
                                                    if (!z11) {
                                                        inviteContactProfile3.f42407e1 = true;
                                                        z11 = true;
                                                    }
                                                    this.f76467k1.add(inviteContactProfile3);
                                                }
                                            }
                                        } else if (this.f76459c1.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                            inviteContactProfile4.f42437s = "" + charAt;
                                            inviteContactProfile4.m40403e1(false);
                                            if (!z11) {
                                                inviteContactProfile4.f42407e1 = true;
                                                z11 = true;
                                            }
                                            int size3 = this.f76467k1.size();
                                            if (size3 > 0) {
                                                int i15 = size3 - 1;
                                                if (((InviteContactProfile) this.f76467k1.get(i15)).m40366G0()) {
                                                    ((InviteContactProfile) this.f76467k1.get(i15)).f42405d1 = true;
                                                }
                                            }
                                            this.f76467k1.add(inviteContactProfile4);
                                        }
                                    } catch (Exception e11) {
                                        AbstractC20110a.m104539h(e11);
                                    }
                                } else {
                                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                                    if (this.f76459c1.indexOf(charAt) == -1) {
                                        inviteContactProfile5.f42437s = "#";
                                    } else {
                                        inviteContactProfile5.f42437s = "" + charAt;
                                    }
                                    inviteContactProfile5.m40403e1(false);
                                    if (!z11) {
                                        inviteContactProfile5.f42407e1 = true;
                                        z11 = true;
                                    }
                                    this.f76467k1.add(inviteContactProfile5);
                                }
                                inviteContactProfile.f42399a1.clear();
                                this.f76467k1.add(inviteContactProfile);
                                this.f76457a1++;
                                try {
                                    if (this.f76455Y0 == -1 && !TextUtils.isEmpty(this.f76454X0) && this.f76454X0.equals(inviteContactProfile.f42434r)) {
                                        this.f76455Y0 = this.f76467k1.size() - 1;
                                        this.f76454X0 = "";
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
                try {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t70
                        public /* synthetic */ t70() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.this.m83040AM();
                        }
                    });
                } catch (Exception e14) {
                    e = e14;
                    AbstractC20110a.m104539h(e);
                }
            } catch (Exception e15) {
                AbstractC20110a.m104539h(e15);
                try {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t70
                        public /* synthetic */ t70() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfilePickerView.this.m83040AM();
                        }
                    });
                } catch (Exception e16) {
                    e = e16;
                    AbstractC20110a.m104539h(e);
                }
            }
        } catch (Throwable th2) {
            try {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t70
                    public /* synthetic */ t70() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfilePickerView.this.m83040AM();
                    }
                });
            } catch (Exception e17) {
                AbstractC20110a.m104539h(e17);
            }
            throw th2;
        }
    }

    /* renamed from: HM */
    void m83065HM(int i11) {
        MultiStateView multiStateView = this.f76447Q0;
        if (multiStateView != null) {
            multiStateView.setEmptyImageResourceId(i11);
        }
    }

    /* renamed from: IM */
    void m83066IM(int i11) {
        MultiStateView multiStateView = this.f76447Q0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: JM */
    void m83067JM(boolean z11) {
        this.f76446P0.setVisibility(0);
        if (z11) {
            this.f76446P0.setVisibility(8);
            this.f76447Q0.setVisibility(0);
            this.f76447Q0.setState(MultiStateView.EnumC15914e.LOADING);
        } else {
            if (this.f76457a1 > 0) {
                this.f76447Q0.setVisibility(8);
                return;
            }
            this.f76446P0.setVisibility(8);
            this.f76447Q0.setVisibility(0);
            this.f76447Q0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: KM */
    void m83068KM(int i11) {
        MultiStateView multiStateView = this.f76447Q0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: LM */
    void m83069LM() {
        try {
            RecyclerView recyclerView = (RecyclerView) this.f76472p1.findViewById(AbstractC6918a0.rv_bubbles);
            this.f76448R0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
            RecyclerView recyclerView2 = this.f76448R0;
            C7005a5 c7005a5 = new C7005a5();
            this.f76449S0 = c7005a5;
            recyclerView2.setAdapter(c7005a5);
            C31784b.m152808a(this.f76448R0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.q70
                public /* synthetic */ q70() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView3, int i11, View view) {
                    ProfilePickerView.this.m83042CM(recyclerView3, i11, view);
                }
            });
            EditText editText = (EditText) this.f76472p1.findViewById(AbstractC6918a0.search_input_text);
            this.f76451U0 = editText;
            editText.addTextChangedListener(this.f76443D1);
            this.f76450T0 = (ListView) this.f76472p1.findViewById(AbstractC6918a0.phoneList);
            MultiStateView multiStateView = (MultiStateView) this.f76472p1.findViewById(AbstractC6918a0.multi_state);
            this.f76447Q0 = multiStateView;
            multiStateView.setEnableLoadingText(true);
            m83066IM(AbstractC8020f0.empty_list);
            m83068KM(AbstractC8020f0.str_tv_findingFriend);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.friend_count_row, (ViewGroup) null, false);
            this.f76446P0 = (TextView) linearLayout.findViewById(AbstractC6918a0.num_friend);
            this.f76450T0.addFooterView(linearLayout);
            this.f76450T0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.r70
                public /* synthetic */ r70() {
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                    ProfilePickerView.this.m83043DM(adapterView, view, i11, j11);
                }
            });
            this.f76450T0.setOnScrollListener(new C14804c());
            C7129l5 c7129l5 = new C7129l5(this.f72421L0.m92648SI(), this.f76467k1, this.f76466j1, this.f76460d1, -1);
            this.f76456Z0 = c7129l5;
            this.f76450T0.setAdapter((ListAdapter) c7129l5);
            m83070MM();
            m83067JM(true);
            if (this.f76473q1 == EnumC14809h.ZALO_FRIEND) {
                m83064GM();
                m83060xM();
            } else {
                this.f76447Q0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.s70
                    public /* synthetic */ s70() {
                    }

                    @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                    /* renamed from: a */
                    public final void mo12138a() {
                        ProfilePickerView.this.m83044EM();
                    }
                });
                m83073wM();
            }
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("extra_max_pick_count")) {
                int i11 = m92642L3.getInt("extra_max_pick_count", 30);
                this.f76461e1 = i11;
                if (i11 < 0) {
                    this.f76461e1 = 30;
                }
            }
            AbstractC23126l.m118627a(f76439G1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    void m83070MM() {
        boolean z11;
        boolean z12;
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                if (m92642L3() != null && m92642L3().getBoolean("extra_show_selected_number", false)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m92642L3() != null && m92642L3().getBoolean("extra_show_total_selected", false)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    m87077NK.setMiddleSubtitle(AbstractC23136l9.m118746s0(AbstractC8020f0.profile_picker_selected_count, Integer.valueOf(this.f76466j1.size()), Integer.valueOf(this.f76461e1)));
                } else if (z12) {
                    m87077NK.setMiddleSubtitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_profile_picker_picked_count, Integer.valueOf(this.f76466j1.size())));
                } else {
                    m87077NK.setMiddleSubtitle("");
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        String m118743r0;
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (!TextUtils.isEmpty(this.f76471o1)) {
                m118743r0 = this.f76471o1;
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_picker_activity_title);
            }
            m87077NK.setMiddleTitle(m118743r0);
            m83070MM();
            m87077NK.setLeadingFunctionCallback(new C14805d());
            if (this.f76464h1) {
                m87077NK.setTrailingType(ZdsActionBar.EnumC16990f.TEXT.m91019c());
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_next);
                if (m92642L3() != null && m92642L3().containsKey("extra_menu_done_text")) {
                    m118743r02 = m92642L3().getString("extra_menu_done_text");
                }
                m87077NK.setTrailingButtonText(m118743r02);
            } else {
                m87077NK.setTrailingType(ZdsActionBar.EnumC16990f.ICON.m91019c());
                Drawable m139658a = C27280g.m139658a(m92689tK(), AbstractC23322a.zds_ic_send_solid_24);
                if (m139658a != null) {
                    m87077NK.setTrailingIconButton(m139658a);
                    m83045NM();
                }
            }
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.p70
                public /* synthetic */ p70() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfilePickerView.this.m83061yM(view);
                }
            });
            m83072tM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            C25470c c25470c = new C25470c();
            c25470c.m131948k("extra_save_selected_profiles", this.f76469m1);
            bundle.putInt("extra_data_retain_key", C25471d.m131951c().m131953a(c25470c));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this.f72421L0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f76439G1;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            finish();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), false);
    }

    /* renamed from: sM */
    public synchronized void m83071sM(String str, ArrayList arrayList) {
        boolean z11;
        ArrayList arrayList2;
        try {
            try {
                String m120002o = AbstractC23262x6.m120002o(str);
                if (this.f76473q1 == EnumC14809h.ZALO_FRIEND) {
                    this.f76470n1 = C18644n.m98531l().mo98465a(null, false);
                    boolean z12 = true;
                    if (AbstractC23309i.m122127lb() != 1) {
                        z12 = false;
                    }
                    z11 = z12;
                } else {
                    z11 = false;
                }
                m83054oM();
                String[] m119967B = AbstractC23262x6.m119967B(m120002o);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList3 = new ArrayList();
                if (!this.f76480x1.containsKey(m120002o)) {
                    for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                        String[] m119970E = AbstractC23262x6.m119970E((String) entry.getKey());
                        ArrayList arrayList4 = (ArrayList) entry.getValue();
                        float m120001n = AbstractC23262x6.m120001n(m119967B, m119970E);
                        if (m120001n > 0.0f) {
                            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                C32093r8 c32093r8 = new C32093r8();
                                c32093r8.f147887d = ((C32093r8) arrayList4.get(i11)).f147887d;
                                c32093r8.f147884a = ((C32093r8) arrayList4.get(i11)).f147884a;
                                c32093r8.f147886c = ((C32093r8) arrayList4.get(i11)).f147886c;
                                c32093r8.f147890g = m120001n;
                                c32093r8.f147885b = ((C32093r8) arrayList4.get(i11)).f147885b;
                                c32093r8.f147893j = ((C32093r8) arrayList4.get(i11)).f147893j;
                                arrayList3.add(c32093r8);
                            }
                            this.f76480x1.put(m120002o, arrayList3);
                        }
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = (ArrayList) this.f76480x1.get(m120002o);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TimeCheckTopHit: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                AbstractC23262x6.m120004q(m120002o, this.f76470n1, arrayList, z11, C19669z.f97573U, arrayList2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: tM */
    void m83072tM() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            LinkedHashMap linkedHashMap = this.f76466j1;
            if (linkedHashMap != null && linkedHashMap.isEmpty()) {
                m87077NK.setEnableTrailingButton(this.f76463g1);
            } else {
                m87077NK.setEnableTrailingButton(true);
            }
            m83045NM();
        }
    }

    /* renamed from: wM */
    void m83073wM() {
        if (TextUtils.isEmpty(this.f76477u1)) {
            return;
        }
        this.f76444E1.mo1704o8(this.f76445F1);
        this.f76444E1.mo1387A6(this.f76477u1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C25470c m131954b;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            int i11 = bundle.getInt("extra_data_retain_key", -1);
            if (i11 != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
                m83053nM(m131954b.m131942e("extra_save_selected_profiles"));
                return;
            }
            return;
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3.containsKey("extra_initial_selected_profiles")) {
            try {
                m83053nM(m92642L3.getParcelableArrayList("extra_initial_selected_profiles"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
