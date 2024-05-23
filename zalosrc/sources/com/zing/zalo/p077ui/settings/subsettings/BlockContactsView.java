package com.zing.zalo.p077ui.settings.subsettings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.settings.subsettings.BlockContactsView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31973j5;
import p716zh.C32002l4;
import pa0.C24708a;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class BlockContactsView extends SlidableZaloView implements InterfaceC17463d.d, C23744a.c, InterfaceC0733x {

    /* renamed from: Q0 */
    View f68178Q0;

    /* renamed from: R0 */
    RobotoTextView f68179R0;

    /* renamed from: S0 */
    ListView f68180S0;

    /* renamed from: T0 */
    MultiStateView f68181T0;

    /* renamed from: U0 */
    ArrayList f68182U0;

    /* renamed from: V0 */
    C24708a f68183V0;

    /* renamed from: X0 */
    boolean f68185X0;

    /* renamed from: Z0 */
    int f68187Z0;

    /* renamed from: b1 */
    String f68189b1;

    /* renamed from: P0 */
    private final int f68177P0 = AbstractC23309i.m122599y0();

    /* renamed from: W0 */
    long f68184W0 = 0;

    /* renamed from: Y0 */
    ContactProfile f68186Y0 = new ContactProfile();

    /* renamed from: a1 */
    EnumC13257h f68188a1 = EnumC13257h.ZALO_FRIEND;

    /* renamed from: c1 */
    boolean f68190c1 = false;

    /* renamed from: d1 */
    boolean f68191d1 = false;

    /* renamed from: e1 */
    boolean f68192e1 = false;

    /* renamed from: f1 */
    InterfaceC0765j f68193f1 = new C0766k();

    /* renamed from: g1 */
    InterfaceC20094a f68194g1 = new C13252c();

    /* renamed from: h1 */
    InterfaceC0765j f68195h1 = new C0766k();

    /* renamed from: i1 */
    InterfaceC20094a f68196i1 = new C13253d();

    /* renamed from: j1 */
    InterfaceC0765j f68197j1 = new C0766k();

    /* renamed from: k1 */
    InterfaceC20094a f68198k1 = new C13254e();

    /* renamed from: l1 */
    InterfaceC0765j f68199l1 = new C0766k();

    /* renamed from: m1 */
    boolean f68200m1 = false;

    /* renamed from: n1 */
    int f68201n1 = 0;

    /* renamed from: o1 */
    InterfaceC0765j f68202o1 = new C0766k();

    /* renamed from: p1 */
    InterfaceC20094a f68203p1 = new C13256g();

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$a */
    /* loaded from: classes6.dex */
    class C13250a implements AbsListView.OnScrollListener {
        C13250a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            if (i11 + i12 >= i13 - 1) {
                BlockContactsView blockContactsView = BlockContactsView.this;
                if (blockContactsView.f68200m1 && !blockContactsView.f68192e1 && blockContactsView.f68188a1 == EnumC13257h.GROUP_FRIEND) {
                    blockContactsView.m74450lM();
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            C24708a c24708a = BlockContactsView.this.f68183V0;
            if (c24708a != null) {
                if (i11 == 0) {
                    c24708a.f118675r = false;
                    c24708a.notifyDataSetChanged();
                } else {
                    c24708a.f118675r = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$b */
    /* loaded from: classes6.dex */
    public class C13251b extends AbstractC0939u {
        C13251b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public /* synthetic */ void m74461d() {
            try {
                BlockContactsView.this.f68182U0.clear();
                int size = C21927m.m114302u().m114312J().size();
                for (int i11 = 0; i11 < size; i11++) {
                    BlockContactsView.this.f68182U0.add((ContactProfile) C21927m.m114302u().m114312J().get(i11));
                }
                BlockContactsView.this.m74452qM();
                BlockContactsView.this.m74451mM(1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            if (C21927m.m114302u().m114312J() != null && C21927m.m114302u().m114312J().isEmpty()) {
                C7960e.m41971c6().m42140H5();
            }
            BlockContactsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.a
                @Override // java.lang.Runnable
                public final void run() {
                    BlockContactsView.C13251b.this.m74461d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$c */
    /* loaded from: classes6.dex */
    public class C13252c implements InterfaceC20094a {
        C13252c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74463d(C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            BlockContactsView.this.m74452qM();
            int m104491c = c20096c.m104491c();
            ArrayList arrayList = BlockContactsView.this.f68182U0;
            if (arrayList != null && arrayList.size() == 0) {
                BlockContactsView.this.f68181T0.setVisibility(0);
                MultiStateView multiStateView = BlockContactsView.this.f68181T0;
                if (m104491c == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_error_loadingList;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                BlockContactsView.this.f68181T0.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView2 = BlockContactsView.this.f68181T0;
                if (m104491c == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView2.setErrorType(enumC15915f);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            BlockContactsView blockContactsView = BlockContactsView.this;
            blockContactsView.f68192e1 = false;
            blockContactsView.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.b
                @Override // java.lang.Runnable
                public final void run() {
                    BlockContactsView.C13252c.this.m74463d(c20096c);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                HashMap hashMap = new HashMap();
                int i11 = 0;
                for (int i12 = 0; i12 < C21927m.m114302u().m114312J().size(); i12++) {
                    hashMap.put(((ContactProfile) C21927m.m114302u().m114312J().get(i12)).f42434r, ((ContactProfile) C21927m.m114302u().m114312J().get(i12)).f42434r);
                }
                JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                AbstractC23309i.m121467Tr(System.currentTimeMillis());
                C21927m.m114302u().m114312J().clear();
                int i13 = 0;
                while (i13 < jSONArray.length()) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i13);
                    String string = jSONObject.getString("userId");
                    String string2 = jSONObject.getString("username");
                    String string3 = jSONObject.getString("displayName");
                    String string4 = jSONObject.getString("avatar");
                    String string5 = jSONObject.getString("phoneNumber");
                    boolean equals = jSONObject.optString("isFr").equals("1");
                    long j11 = jSONObject.getLong("lastActionTime");
                    int i14 = jSONObject.getInt("isActive");
                    int optInt = jSONObject.optInt("gender", i11);
                    String optString = jSONObject.optString("globalId");
                    ContactProfile contactProfile = new ContactProfile(string);
                    contactProfile.f42443u = string2;
                    contactProfile.f42437s = string3;
                    contactProfile.f42446v = string4;
                    contactProfile.f42455y = string5;
                    contactProfile.f42382U0 = i14;
                    contactProfile.f42336F = j11;
                    contactProfile.f42449w = optInt;
                    contactProfile.m40407h1(optString);
                    C21927m.m114302u().m114312J().add(contactProfile);
                    hashMap.remove(string);
                    contactProfile.f42330D = System.currentTimeMillis();
                    C7960e.m41971c6().m42131G7(contactProfile, equals);
                    C28203u6.f131407a.m141824w(contactProfile);
                    C7960e.m41971c6().m42234Pb(contactProfile.f42434r);
                    i13++;
                    i11 = 0;
                }
                if (C7960e.m41971c6() != null) {
                    C7960e.m41971c6().m42288Uc(hashMap);
                }
                BlockContactsView.this.f68192e1 = false;
                C21927m.m114302u().m114314L();
                C18644n.m98524E();
                C19669z.m103146Y().m103198O0();
                BlockContactsView.this.f68182U0 = new ArrayList(C21927m.m114302u().m114312J());
                BlockContactsView.this.m74453rM();
            } catch (Exception unused) {
                BlockContactsView.this.m74453rM();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$d */
    /* loaded from: classes6.dex */
    public class C13253d implements InterfaceC20094a {
        C13253d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74465d() {
            try {
                BlockContactsView.this.f72421L0.mo49315c4();
                if (BlockContactsView.this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                }
                BlockContactsView blockContactsView = BlockContactsView.this;
                blockContactsView.f68182U0.remove(blockContactsView.f68187Z0);
                BlockContactsView blockContactsView2 = BlockContactsView.this;
                blockContactsView2.f68183V0.m128293b(blockContactsView2.f68182U0);
                BlockContactsView.this.f68183V0.notifyDataSetChanged();
                BlockContactsView.this.m74457vM(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            BlockContactsView blockContactsView = BlockContactsView.this;
            blockContactsView.f68185X0 = false;
            if (blockContactsView.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
            BlockContactsView.this.f72421L0.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            BlockContactsView blockContactsView;
            int i11;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                new JSONObject();
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                    if (!jSONObject2.isNull("code")) {
                        i11 = jSONObject2.getInt("code");
                    } else {
                        i11 = -999;
                    }
                    if (i11 != 0) {
                        ToastUtils.m89259g(i11);
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                try {
                    ContactProfile contactProfile = BlockContactsView.this.f68186Y0;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    blockContactsView = BlockContactsView.this;
                    blockContactsView.f68185X0 = false;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    BlockContactsView blockContactsView2 = BlockContactsView.this;
                    blockContactsView2.f68185X0 = false;
                    if (blockContactsView2.f72421L0.m92676n2() != null) {
                        m92676n2 = BlockContactsView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                BlockContactsView.C13253d.this.m74465d();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (blockContactsView.f72421L0.m92676n2() != null) {
                    m92676n2 = BlockContactsView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockContactsView.C13253d.this.m74465d();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                BlockContactsView blockContactsView3 = BlockContactsView.this;
                blockContactsView3.f68185X0 = false;
                if (blockContactsView3.f72421L0.m92676n2() != null) {
                    BlockContactsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockContactsView.C13253d.this.m74465d();
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$e */
    /* loaded from: classes6.dex */
    public class C13254e implements InterfaceC20094a {
        C13254e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74467d() {
            if (BlockContactsView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_toast_unbanned_mem_for_owner));
            }
            BlockContactsView blockContactsView = BlockContactsView.this;
            blockContactsView.f68182U0.remove(blockContactsView.f68187Z0);
            BlockContactsView blockContactsView2 = BlockContactsView.this;
            blockContactsView2.f68183V0.m128293b(blockContactsView2.f68182U0);
            BlockContactsView.this.f68183V0.notifyDataSetChanged();
            BlockContactsView.this.m74457vM(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                boolean z11 = false;
                BlockContactsView.this.f68185X0 = false;
                if (c20096c != null && c20096c.m104491c() != 0) {
                    C31973j5 m4472f = C0943w.f3447a.m4472f(BlockContactsView.this.f68189b1);
                    if (m4472f != null && m4472f.m153747Y()) {
                        z11 = true;
                    }
                    ToastUtils.m89261i(c20096c, z11);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
                BlockContactsView.this.f72421L0.mo78960q3();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                BlockContactsView blockContactsView = BlockContactsView.this;
                boolean z11 = false;
                blockContactsView.f68185X0 = false;
                blockContactsView.f72421L0.mo49315c4();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.isNull("data")) {
                    if (!jSONObject.isNull("error_code")) {
                    }
                    BlockContactsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockContactsView.C13254e.this.m74467d();
                        }
                    });
                }
                int i11 = jSONObject.getInt("error_code");
                if (i11 != 0) {
                    C31973j5 m4472f = C0943w.f3447a.m4472f(BlockContactsView.this.f68189b1);
                    if (m4472f != null && m4472f.m153747Y()) {
                        z11 = true;
                    }
                    ToastUtils.m89260h(i11, z11);
                    return;
                }
                BlockContactsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlockContactsView.C13254e.this.m74467d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$f */
    /* loaded from: classes6.dex */
    public class C13255f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f68209a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f68210b;

        C13255f(String str, ArrayList arrayList) {
            this.f68209a = str;
            this.f68210b = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74469d(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                Iterator it2 = BlockContactsView.this.f68182U0.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ContactProfile) it2.next()).f42434r.equals(contactProfile.f42434r)) {
                            break;
                        }
                    } else {
                        BlockContactsView.this.f68182U0.add(contactProfile);
                        break;
                    }
                }
            }
            BlockContactsView blockContactsView = BlockContactsView.this;
            blockContactsView.f68183V0.m128293b(blockContactsView.f68182U0);
            BlockContactsView.this.f68183V0.notifyDataSetChanged();
            BlockContactsView.this.m74457vM(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                boolean z11 = false;
                BlockContactsView.this.f68185X0 = false;
                if (c20096c != null && c20096c.m104491c() != 0) {
                    C31973j5 m4472f = C0943w.f3447a.m4472f(this.f68209a);
                    if (m4472f != null && m4472f.m153747Y()) {
                        z11 = true;
                    }
                    ToastUtils.m89260h(c20096c.m104491c(), z11);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
                BlockContactsView.this.f72421L0.mo78960q3();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                BlockContactsView blockContactsView = BlockContactsView.this;
                boolean z11 = false;
                blockContactsView.f68185X0 = false;
                blockContactsView.f72421L0.mo49315c4();
                try {
                    jSONObject = (JSONObject) obj;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (jSONObject.isNull("data")) {
                    if (!jSONObject.isNull("error_code")) {
                    }
                    InterfaceC27218a m92676n2 = BlockContactsView.this.f72421L0.m92676n2();
                    final ArrayList arrayList = this.f68210b;
                    m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockContactsView.C13255f.this.m74469d(arrayList);
                        }
                    });
                    AbstractC23304d.f113436s2 = true;
                }
                int i11 = jSONObject.getInt("error_code");
                if (i11 != 0) {
                    C31973j5 m4472f = C0943w.f3447a.m4472f(this.f68209a);
                    if (m4472f != null && m4472f.m153747Y()) {
                        z11 = true;
                    }
                    ToastUtils.m89260h(i11, z11);
                    return;
                }
                InterfaceC27218a m92676n22 = BlockContactsView.this.f72421L0.m92676n2();
                final ArrayList arrayList2 = this.f68210b;
                m92676n22.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlockContactsView.C13255f.this.m74469d(arrayList2);
                    }
                });
                AbstractC23304d.f113436s2 = true;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$g */
    /* loaded from: classes6.dex */
    public class C13256g implements InterfaceC20094a {
        C13256g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74471d(C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            BlockContactsView.this.m74452qM();
            int m104491c = c20096c.m104491c();
            ArrayList arrayList = BlockContactsView.this.f68182U0;
            if (arrayList != null && arrayList.size() == 0) {
                BlockContactsView.this.f68181T0.setVisibility(0);
                MultiStateView multiStateView = BlockContactsView.this.f68181T0;
                if (m104491c == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_error_loadingList;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                BlockContactsView.this.f68181T0.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView2 = BlockContactsView.this.f68181T0;
                if (m104491c == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView2.setErrorType(enumC15915f);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            BlockContactsView blockContactsView = BlockContactsView.this;
            blockContactsView.f68192e1 = false;
            blockContactsView.f68200m1 = false;
            blockContactsView.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.f
                @Override // java.lang.Runnable
                public final void run() {
                    BlockContactsView.C13256g.this.m74471d(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                BlockContactsView blockContactsView = BlockContactsView.this;
                if (blockContactsView.f68201n1 == 0) {
                    blockContactsView.f68182U0.clear();
                }
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                BlockContactsView blockContactsView2 = BlockContactsView.this;
                if (jSONObject.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                blockContactsView2.f68200m1 = z11;
                JSONArray jSONArray = jSONObject.getJSONArray("blockedMembers");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    String optString = jSONObject2.optString("id");
                    String optString2 = jSONObject2.optString("dName");
                    String optString3 = jSONObject2.optString("avatar");
                    String optString4 = jSONObject2.optString("phoneNumber");
                    if (!TextUtils.isEmpty(optString)) {
                        ContactProfile m141809c = C28203u6.f131407a.m141809c(optString);
                        if (m141809c == null) {
                            m141809c = new ContactProfile(optString);
                            m141809c.f42437s = optString2;
                            m141809c.f42446v = optString3;
                            m141809c.f42455y = optString4;
                        }
                        BlockContactsView.this.f68182U0.add(m141809c);
                    }
                }
                BlockContactsView blockContactsView3 = BlockContactsView.this;
                if (blockContactsView3.f68200m1) {
                    blockContactsView3.f68201n1++;
                }
                blockContactsView3.f68192e1 = false;
                blockContactsView3.m74453rM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockContactsView$h */
    /* loaded from: classes6.dex */
    public enum EnumC13257h {
        ZALO_FRIEND,
        GROUP_FRIEND
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m74445nM(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (System.currentTimeMillis() - this.f68184W0 > 1000 && intValue >= 0 && intValue < this.f68182U0.size() && !this.f68185X0) {
            m74449kM((ContactProfile) this.f68182U0.get(intValue), intValue);
            this.f68184W0 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m74446oM(AdapterView adapterView, View view, int i11, long j11) {
        ArrayList arrayList = this.f68182U0;
        if (arrayList != null && arrayList.size() > 0) {
            try {
                ContactProfile contactProfile = (ContactProfile) this.f68182U0.get(i11);
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile.f42434r, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 14)).m135744c(contactProfile).m135743b(), 0, 1));
                this.f68191d1 = true;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m74447pM() {
        if (this.f68188a1 == EnumC13257h.GROUP_FRIEND) {
            m74450lM();
        } else {
            m74451mM(1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        EnumC13257h enumC13257h;
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.getBoolean("extra_viewmode_group", false)) {
                enumC13257h = EnumC13257h.GROUP_FRIEND;
            } else {
                enumC13257h = EnumC13257h.ZALO_FRIEND;
            }
            this.f68188a1 = enumC13257h;
            if (enumC13257h == EnumC13257h.GROUP_FRIEND) {
                m92637BK(true);
            }
            if (m92642L3.containsKey("extra_group_id")) {
                str = m92642L3.getString("extra_group_id");
            } else {
                str = "";
            }
            this.f68189b1 = str;
            if (m92642L3.containsKey("EXTRA_IS_HIDE_ACTION_BAR")) {
                this.f68190c1 = m92642L3.getBoolean("EXTRA_IS_HIDE_ACTION_BAR");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_remove_from_ignorelist)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        actionBarMenu.m92744k(AbstractC6918a0.menu_add, AbstractC7409c0.action_bar_menu_item_add);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.ignore_list_view, viewGroup, false);
        this.f68178Q0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 0 && i11 == -1) {
                interfaceC17463d.dismiss();
                m74456uM(this.f68186Y0, this.f68187Z0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                if (this.f68190c1) {
                    m87077NK.setVisibility(8);
                } else if (this.f68188a1 == EnumC13257h.GROUP_FRIEND) {
                    m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_admin_tool_open_block_list_v2));
                } else {
                    m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.ignorelist));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.menu_add) {
                Bundle m83056qM = ProfilePickerView.m83056qM(new ArrayList(), this.f68177P0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_blacklist));
                m83056qM.putBoolean("extra_viewmode_group", true);
                m83056qM.putString("extra_group_id", this.f68189b1);
                m83056qM.putBoolean("extra_show_full_member", true);
                this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83056qM, 1000, 1, true);
                AbstractC23647d.m123897g("1591044");
            }
            return super.mo37491QJ(i11);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f68180S0 = (ListView) view.findViewById(AbstractC6918a0.lv_ignore);
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_block_hint);
        this.f68179R0 = robotoTextView;
        if (this.f68188a1 == EnumC13257h.GROUP_FRIEND) {
            robotoTextView.setText(AbstractC8020f0.str_group_blacklist_hint_v2);
        }
        this.f68181T0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f68182U0 = new ArrayList();
        C24708a c24708a = new C24708a(this.f68188a1, this.f68182U0, new View.OnClickListener() { // from class: oa0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BlockContactsView.this.m74445nM(view2);
            }
        });
        this.f68183V0 = c24708a;
        this.f68180S0.setAdapter((ListAdapter) c24708a);
        this.f68180S0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: oa0.j
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                BlockContactsView.this.m74446oM(adapterView, view2, i11, j11);
            }
        });
        this.f68180S0.setOnScrollListener(new C13250a());
        this.f68181T0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: oa0.k
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                BlockContactsView.this.m74447pM();
            }
        });
        this.f68181T0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.ignorelist_empty_v2));
        this.f68181T0.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BlockContactsView";
    }

    /* renamed from: jM */
    public void m74448jM(String str, ArrayList arrayList) {
        if (this.f68185X0) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f68185X0 = true;
        this.f68199l1.mo1704o8(new C13255f(str, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ContactProfile) it.next()).f42434r);
        }
        this.f68199l1.mo1781y4(str, arrayList2, true);
    }

    /* renamed from: kM */
    public void m74449kM(ContactProfile contactProfile, int i11) {
        this.f68186Y0 = contactProfile;
        this.f68187Z0 = i11;
        try {
            if (this.f68188a1 == EnumC13257h.GROUP_FRIEND) {
                m74455tM(contactProfile);
                AbstractC23647d.m123897g("1591046");
            } else {
                this.f72421L0.showDialog(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: lM */
    void m74450lM() {
        if (!this.f68192e1 && !TextUtils.isEmpty(this.f68189b1)) {
            this.f68192e1 = true;
            if (this.f68182U0.isEmpty()) {
                m74457vM(true);
            }
            this.f68202o1.mo1704o8(this.f68203p1);
            this.f68202o1.mo1730ra(this.f68189b1, this.f68201n1);
        }
    }

    /* renamed from: mM */
    void m74451mM(int i11) {
        try {
            if (this.f68192e1) {
                return;
            }
            if (C21927m.m114302u().m114312J().size() <= 0) {
                m74457vM(true);
            }
            this.f68192e1 = true;
            this.f68193f1.mo1704o8(this.f68194g1);
            this.f68193f1.mo1493N7(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1000 && i12 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
            m74448jM(this.f68189b1, intent.getParcelableArrayListExtra("extra_selected_profiles"));
            AbstractC23647d.m123897g("1591045");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 82) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.m124114c().m124115b(this, 27);
        if (this.f68191d1 && this.f68188a1 == EnumC13257h.ZALO_FRIEND) {
            m74454sM();
        }
        this.f68191d1 = false;
    }

    /* renamed from: qM */
    public void m74452qM() {
        try {
            this.f68183V0.m128293b(this.f68182U0);
            this.f68183V0.notifyDataSetChanged();
            m74457vM(false);
        } catch (Exception e11) {
            e11.printStackTrace();
            m74458wM(AbstractC8020f0.str_error_loadingList);
        }
    }

    /* renamed from: rM */
    void m74453rM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: oa0.h
                @Override // java.lang.Runnable
                public final void run() {
                    BlockContactsView.this.m74452qM();
                }
            });
        }
    }

    /* renamed from: sM */
    public void m74454sM() {
        C0824j.m2153b(new C13251b());
    }

    /* renamed from: tM */
    public void m74455tM(ContactProfile contactProfile) {
        try {
            if (this.f68185X0) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f68185X0 = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(contactProfile.f42434r);
            this.f68197j1.mo1704o8(this.f68198k1);
            this.f68197j1.mo1781y4(this.f68189b1, arrayList, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    public void m74456uM(ContactProfile contactProfile, int i11) {
        try {
            if (this.f68185X0) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f68185X0 = true;
            this.f68195h1.mo1704o8(this.f68196i1);
            this.f68195h1.mo1448Ha(contactProfile.f42434r, 2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    void m74457vM(boolean z11) {
        try {
            if (z11) {
                this.f68181T0.setVisibility(0);
                this.f68181T0.setState(MultiStateView.EnumC15914e.LOADING);
                this.f68180S0.setVisibility(8);
            } else if (this.f68183V0.getCount() > 0) {
                this.f68181T0.setVisibility(8);
                this.f68180S0.setVisibility(0);
            } else {
                this.f68181T0.setVisibility(0);
                this.f68180S0.setVisibility(8);
                m74459xM(AbstractC8020f0.ignorelist_empty_v2);
                this.f68181T0.setEmptyImageResourceId(AbstractC16803z.illus_emptystate_list);
                this.f68181T0.setState(MultiStateView.EnumC15914e.EMPTY);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    void m74458wM(int i11) {
        MultiStateView multiStateView = this.f68181T0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 27 && this.f68188a1 == EnumC13257h.GROUP_FRIEND && objArr != null && objArr.length >= 3) {
            String str = (String) objArr[0];
            if (((Integer) objArr[1]).intValue() != 0 && str.equals(this.f68189b1) && !C0943w.m4462l().m4472f(str).m153742T()) {
                finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (this.f68188a1 == EnumC13257h.GROUP_FRIEND) {
            m74450lM();
        } else {
            m74454sM();
        }
    }

    /* renamed from: xM */
    void m74459xM(int i11) {
        MultiStateView multiStateView = this.f68181T0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }
}
