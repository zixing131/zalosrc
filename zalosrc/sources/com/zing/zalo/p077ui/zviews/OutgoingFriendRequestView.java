package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7282z4;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.OutgoingFriendRequestView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21913a0;
import p304ks.C21915b0;
import p304ks.C21920f;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31934gb;
import p716zh.C32002l4;
import t00.C26446c;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class OutgoingFriendRequestView extends SlidableZaloView implements C7282z4.c, C23744a.c, View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    private RecyclerView f75750P0;

    /* renamed from: Q0 */
    private C7282z4 f75751Q0;

    /* renamed from: R0 */
    private MultiStateView f75752R0;

    /* renamed from: S0 */
    private ContactProfile f75753S0;

    /* renamed from: T0 */
    private RobotoTextView f75754T0;

    /* renamed from: V0 */
    private LinearLayout f75756V0;

    /* renamed from: W0 */
    private LinearLayout f75757W0;

    /* renamed from: X0 */
    private LinearLayout f75758X0;

    /* renamed from: Y0 */
    private HashSet f75759Y0;

    /* renamed from: U0 */
    private int f75755U0 = 0;

    /* renamed from: Z0 */
    boolean f75760Z0 = false;

    /* renamed from: a1 */
    String f75761a1 = "";

    /* renamed from: b1 */
    boolean f75762b1 = false;

    /* renamed from: c1 */
    boolean f75763c1 = false;

    /* renamed from: d1 */
    InterfaceC0765j f75764d1 = new C0766k();

    /* renamed from: e1 */
    boolean f75765e1 = false;

    /* renamed from: f1 */
    InterfaceC0765j f75766f1 = new C0766k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OutgoingFriendRequestView$a */
    /* loaded from: classes6.dex */
    public class C14710a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f75767a;

        C14710a(ContactProfile contactProfile) {
            this.f75767a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82459d() {
            if (OutgoingFriendRequestView.this.f75751Q0 != null) {
                OutgoingFriendRequestView.this.f75751Q0.m10008p();
                OutgoingFriendRequestView.this.m82431AM();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            OutgoingFriendRequestView outgoingFriendRequestView = OutgoingFriendRequestView.this;
            outgoingFriendRequestView.f75760Z0 = false;
            outgoingFriendRequestView.mo78960q3();
            ToastUtils.showMess(String.format(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.error_message_with_code), Integer.valueOf(c20096c.m104491c())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int optInt = optJSONArray.optJSONObject(0).optInt("errorCode");
                    if (optInt == 0) {
                        AbstractC23063f2.m118363o(this.f75767a.f42434r);
                        C21920f.m114270a().m114273d(this.f75767a.f42434r);
                        if (OutgoingFriendRequestView.this.f75759Y0 == null) {
                            OutgoingFriendRequestView.this.f75759Y0 = new HashSet();
                        }
                        OutgoingFriendRequestView.this.f75759Y0.add(this.f75767a.f42434r);
                    } else if (optInt == -47) {
                        ToastUtils.showMess(String.format(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.error_undo_friend_request), Integer.valueOf(optInt)));
                    } else {
                        ToastUtils.showMess(String.format(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.error_message_with_code), Integer.valueOf(optInt)));
                    }
                }
                OutgoingFriendRequestView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.g30
                    @Override // java.lang.Runnable
                    public final void run() {
                        OutgoingFriendRequestView.C14710a.this.m82459d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            OutgoingFriendRequestView outgoingFriendRequestView = OutgoingFriendRequestView.this;
            outgoingFriendRequestView.f75760Z0 = false;
            outgoingFriendRequestView.mo78960q3();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OutgoingFriendRequestView$b */
    /* loaded from: classes6.dex */
    public class C14711b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f75769a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f75770b;

        C14711b(String str, ContactProfile contactProfile) {
            this.f75769a = str;
            this.f75770b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82461d() {
            try {
                if (OutgoingFriendRequestView.this.f75751Q0 != null) {
                    OutgoingFriendRequestView.this.f75751Q0.m10008p();
                    OutgoingFriendRequestView.this.m82431AM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                OutgoingFriendRequestView outgoingFriendRequestView = OutgoingFriendRequestView.this;
                outgoingFriendRequestView.f75762b1 = false;
                outgoingFriendRequestView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            int i11;
            int i12;
            int i13;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    boolean z11 = true;
                    if (jSONObject != null && !jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.isNull("isRequested")) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject2.getInt("isRequested");
                        }
                        if (jSONObject2.isNull("isFriend")) {
                            i12 = 0;
                        } else {
                            i12 = jSONObject2.getInt("isFriend");
                        }
                        if (jSONObject2.isNull("isRequesting")) {
                            i13 = 0;
                        } else {
                            i13 = jSONObject2.getInt("isRequesting");
                        }
                        int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                        int optInt2 = jSONObject2.optInt("ranking", 0);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(this.f75769a)) {
                                        OutgoingFriendRequestView.this.m82450CM(this.f75770b);
                                        z11 = false;
                                    } else {
                                        ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(this.f75769a);
                                        AbstractC21935u.m114533W(this.f75769a, 3, "");
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(this.f75769a);
                                    AbstractC21935u.m114533W(this.f75769a, 3, "");
                                    if (!AbstractC21935u.m114558y(this.f75769a)) {
                                        OutgoingFriendRequestView.this.m82453FM(this.f75769a);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(this.f75769a);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(this.f75769a, optInt2);
                                AbstractC2364o0.m12373p(OutgoingFriendRequestView.this, 15);
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(this.f75770b);
                                ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(this.f75769a);
                                AbstractC21935u.m114533W(this.f75769a, 3, "");
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(OutgoingFriendRequestView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            OutgoingFriendRequestView.this.f75761a1 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(OutgoingFriendRequestView.this, 100);
                        }
                    }
                    OutgoingFriendRequestView outgoingFriendRequestView = OutgoingFriendRequestView.this;
                    outgoingFriendRequestView.f75762b1 = false;
                    if (z11) {
                        outgoingFriendRequestView.mo78960q3();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    OutgoingFriendRequestView outgoingFriendRequestView2 = OutgoingFriendRequestView.this;
                    outgoingFriendRequestView2.f75762b1 = false;
                    outgoingFriendRequestView2.mo78960q3();
                    if (OutgoingFriendRequestView.this.f72421L0.m92676n2() != null) {
                        m92676n2 = OutgoingFriendRequestView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.h30
                            @Override // java.lang.Runnable
                            public final void run() {
                                OutgoingFriendRequestView.C14711b.this.m82461d();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (OutgoingFriendRequestView.this.f72421L0.m92676n2() != null) {
                    m92676n2 = OutgoingFriendRequestView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.h30
                        @Override // java.lang.Runnable
                        public final void run() {
                            OutgoingFriendRequestView.C14711b.this.m82461d();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                OutgoingFriendRequestView outgoingFriendRequestView3 = OutgoingFriendRequestView.this;
                outgoingFriendRequestView3.f75762b1 = false;
                outgoingFriendRequestView3.mo78960q3();
                if (OutgoingFriendRequestView.this.f72421L0.m92676n2() != null) {
                    OutgoingFriendRequestView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h30
                        @Override // java.lang.Runnable
                        public final void run() {
                            OutgoingFriendRequestView.C14711b.this.m82461d();
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OutgoingFriendRequestView$c */
    /* loaded from: classes6.dex */
    public class C14712c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f75772a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f75773b;

        C14712c(String str, ContactProfile contactProfile) {
            this.f75772a = str;
            this.f75773b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82463d(boolean z11) {
            try {
                OutgoingFriendRequestView.this.mo49315c4();
                if (z11) {
                    OutgoingFriendRequestView.this.m82449BM();
                    return;
                }
                if (OutgoingFriendRequestView.this.f75751Q0 != null) {
                    OutgoingFriendRequestView.this.f75751Q0.m10008p();
                }
                OutgoingFriendRequestView.this.m82431AM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                OutgoingFriendRequestView outgoingFriendRequestView = OutgoingFriendRequestView.this;
                outgoingFriendRequestView.f75763c1 = false;
                outgoingFriendRequestView.mo78960q3();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            final boolean z11;
            OutgoingFriendRequestView outgoingFriendRequestView;
            JSONObject jSONObject;
            final boolean z12 = false;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(this.f75772a);
                            AbstractC21935u.m114533W(this.f75772a, 3, "");
                            AbstractC23063f2.m118349a(this.f75773b);
                            z11 = true;
                            outgoingFriendRequestView = OutgoingFriendRequestView.this;
                            outgoingFriendRequestView.f75763c1 = false;
                            if (outgoingFriendRequestView.f72421L0.m92676n2() == null) {
                                OutgoingFriendRequestView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.i30
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        OutgoingFriendRequestView.C14712c.this.m82463d(z11);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        AbstractC23063f2.m118357i(i11, this.f75772a);
                        if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                            if (!AbstractC23216t1.m119641f(OutgoingFriendRequestView.this.f72421L0, i11, false)) {
                                ToastUtils.m89259g(i11);
                            }
                        }
                        OutgoingFriendRequestView.this.f75761a1 = AbstractC23161o1.m119317b(i11);
                        AbstractC2364o0.m12373p(OutgoingFriendRequestView.this, 100);
                    }
                    z11 = false;
                    outgoingFriendRequestView = OutgoingFriendRequestView.this;
                    outgoingFriendRequestView.f75763c1 = false;
                    if (outgoingFriendRequestView.f72421L0.m92676n2() == null) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    OutgoingFriendRequestView outgoingFriendRequestView2 = OutgoingFriendRequestView.this;
                    outgoingFriendRequestView2.f75763c1 = false;
                    if (outgoingFriendRequestView2.f72421L0.m92676n2() != null) {
                        OutgoingFriendRequestView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.i30
                            @Override // java.lang.Runnable
                            public final void run() {
                                OutgoingFriendRequestView.C14712c.this.m82463d(z12);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                OutgoingFriendRequestView outgoingFriendRequestView3 = OutgoingFriendRequestView.this;
                outgoingFriendRequestView3.f75763c1 = false;
                if (outgoingFriendRequestView3.f72421L0.m92676n2() != null) {
                    OutgoingFriendRequestView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.i30
                        @Override // java.lang.Runnable
                        public final void run() {
                            OutgoingFriendRequestView.C14712c.this.m82463d(z12);
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OutgoingFriendRequestView$d */
    /* loaded from: classes6.dex */
    public class C14713d implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.OutgoingFriendRequestView$d$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75776a;

            a(ContactProfile contactProfile) {
                this.f75776a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f75776a.f42434r);
            }
        }

        C14713d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("OutgoingFriendRequestView", e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OutgoingFriendRequestView$e */
    /* loaded from: classes6.dex */
    public class C14714e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f75778a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f75779b;

        C14714e(String str, ContactProfile contactProfile) {
            this.f75778a = str;
            this.f75779b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82466e(ContactProfile contactProfile) {
            AbstractC21935u.m114523M(OutgoingFriendRequestView.this.f72421L0.m92662fJ(), contactProfile);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82467f() {
            try {
                OutgoingFriendRequestView.this.mo49315c4();
                if (OutgoingFriendRequestView.this.f75751Q0 != null) {
                    OutgoingFriendRequestView.this.f75751Q0.m10008p();
                    OutgoingFriendRequestView.this.m82431AM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(OutgoingFriendRequestView.this.m92652XI(AbstractC8020f0.str_hint_acceptFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                OutgoingFriendRequestView outgoingFriendRequestView = OutgoingFriendRequestView.this;
                outgoingFriendRequestView.f75765e1 = false;
                outgoingFriendRequestView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            OutgoingFriendRequestView outgoingFriendRequestView;
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            AbstractC21935u.m114533W(this.f75778a, 3, "");
                            if (OutgoingFriendRequestView.this.f72421L0.m92676n2() != null) {
                                InterfaceC27218a m92676n22 = OutgoingFriendRequestView.this.f72421L0.m92676n2();
                                final ContactProfile contactProfile = this.f75779b;
                                m92676n22.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j30
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        OutgoingFriendRequestView.C14714e.this.m82466e(contactProfile);
                                    }
                                });
                            }
                        } else if (!AbstractC23216t1.m119641f(OutgoingFriendRequestView.this.f72421L0, i11, true)) {
                            ToastUtils.m89259g(i11);
                        }
                    }
                    outgoingFriendRequestView = OutgoingFriendRequestView.this;
                    outgoingFriendRequestView.f75765e1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    OutgoingFriendRequestView outgoingFriendRequestView2 = OutgoingFriendRequestView.this;
                    outgoingFriendRequestView2.f75765e1 = false;
                    if (outgoingFriendRequestView2.f72421L0.m92676n2() != null) {
                        m92676n2 = OutgoingFriendRequestView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.k30
                            @Override // java.lang.Runnable
                            public final void run() {
                                OutgoingFriendRequestView.C14714e.this.m82467f();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (outgoingFriendRequestView.f72421L0.m92676n2() != null) {
                    m92676n2 = OutgoingFriendRequestView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.k30
                        @Override // java.lang.Runnable
                        public final void run() {
                            OutgoingFriendRequestView.C14714e.this.m82467f();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                OutgoingFriendRequestView outgoingFriendRequestView3 = OutgoingFriendRequestView.this;
                outgoingFriendRequestView3.f75765e1 = false;
                if (outgoingFriendRequestView3.f72421L0.m92676n2() != null) {
                    OutgoingFriendRequestView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.k30
                        @Override // java.lang.Runnable
                        public final void run() {
                            OutgoingFriendRequestView.C14714e.this.m82467f();
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public void m82431AM() {
        String str;
        try {
            int m37048L = this.f75751Q0.m37048L();
            if (m37048L != this.f75755U0) {
                this.f75755U0 = m37048L;
                if (m37048L > 0) {
                    RobotoTextView robotoTextView = this.f75754T0;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_info_manage_friend_request);
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(m37048L);
                    if (m37048L > 1) {
                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                    } else {
                        str = "";
                    }
                    objArr[1] = str;
                    robotoTextView.setText(String.format(m118743r0, objArr));
                    this.f75754T0.setVisibility(0);
                    return;
                }
                this.f75754T0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    private void m82442sM() {
        HashSet hashSet = this.f75759Y0;
        if (hashSet != null && !hashSet.isEmpty()) {
            try {
                final HashSet hashSet2 = new HashSet(this.f75759Y0);
                AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.c30
                    @Override // java.lang.Runnable
                    public final void run() {
                        OutgoingFriendRequestView.m82444vM(hashSet2);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static /* synthetic */ int m82443uM(ContactProfile contactProfile, ContactProfile contactProfile2) {
        long j11 = contactProfile.f42330D;
        long j12 = contactProfile2.f42330D;
        if (j11 > j12) {
            return -1;
        }
        if (j11 < j12) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static /* synthetic */ void m82444vM(HashSet hashSet) {
        Iterator it;
        try {
            ArrayList m118352d = AbstractC23063f2.m118352d(false);
            if (m118352d != null && !m118352d.isEmpty()) {
                int size = m118352d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ContactProfile contactProfile = (ContactProfile) m118352d.get(i11);
                    if (contactProfile != null && hashSet.contains(contactProfile.f42434r)) {
                        hashSet.remove(contactProfile.f42434r);
                    }
                }
            }
            if (!hashSet.isEmpty() && (it = hashSet.iterator()) != null) {
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        C21927m.m114302u().m114352p0(str);
                        C7960e.m41971c6().m42099Dc(str);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m82445wM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m82454GM(this.f75753S0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m82446xM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        try {
            ContactProfile contactProfile = this.f75753S0;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                Bundle m140776b = new C27870vb(this.f75753S0.mo2478b()).m140780g(this.f75753S0).m140776b();
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m82447yM(ArrayList arrayList) {
        try {
            C7282z4 c7282z4 = this.f75751Q0;
            if (c7282z4 != null) {
                c7282z4.m37051P(arrayList);
                this.f75751Q0.m10008p();
            }
            m82431AM();
            m82451DM(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m82448zM() {
        final ArrayList m82456rM = m82456rM();
        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.e30
            @Override // java.lang.Runnable
            public final void run() {
                OutgoingFriendRequestView.this.m82447yM(m82456rM);
            }
        });
    }

    /* renamed from: BM */
    public void m82449BM() {
        try {
            Runnable runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.z20
                @Override // java.lang.Runnable
                public final void run() {
                    OutgoingFriendRequestView.this.m82448zM();
                }
            };
            if (AbstractC19444a.m101693a()) {
                AbstractC0837p0.m2227h().mo2040a(runnable);
            } else {
                runnable.run();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CM */
    public void m82450CM(ContactProfile contactProfile) {
        TrackingSource trackingSource;
        String str = contactProfile.f42434r;
        if (this.f75763c1) {
            return;
        }
        String m40378N = contactProfile.m40378N();
        this.f75763c1 = true;
        this.f75764d1.mo1704o8(new C14712c(str, contactProfile));
        int m114307E = C21927m.m114302u().m114307E(contactProfile.f42434r);
        if (m114307E == -1) {
            trackingSource = new TrackingSource(343);
        } else {
            trackingSource = new TrackingSource(m114307E);
        }
        trackingSource.m40677a("sourceView", 7);
        this.f75753S0 = contactProfile;
        this.f75764d1.mo1620d7(contactProfile.f42434r, m40378N, trackingSource.m40683t(), trackingSource.m40682o());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 15) {
            if (i11 != 100) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(5).m43172u(m92652XI(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f75761a1).m43165n(m92652XI(AbstractC8020f0.str_tv_sendmes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.b30
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    OutgoingFriendRequestView.this.m82446xM(interfaceC17463d, i12);
                }
            }).m43170s(m92652XI(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43172u(m92652XI(AbstractC8020f0.str_titleDlg2)).m43162k(m92652XI(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.btn_accept_Invitation), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.a30
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                OutgoingFriendRequestView.this.m82445wM(interfaceC17463d, i12);
            }
        });
        return aVar2.m43152a();
    }

    /* renamed from: DM */
    void m82451DM(boolean z11) {
        if (z11) {
            this.f75750P0.setVisibility(8);
            this.f75752R0.setVisibility(0);
            this.f75752R0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f75756V0.setVisibility(8);
            return;
        }
        C7282z4 c7282z4 = this.f75751Q0;
        if (c7282z4 != null && c7282z4.mo10003k() > 0) {
            this.f75752R0.setVisibility(8);
            this.f75750P0.setVisibility(0);
            this.f75756V0.setVisibility(8);
        } else {
            this.f75756V0.setVisibility(0);
            this.f75752R0.setVisibility(8);
            this.f75752R0.setState(MultiStateView.EnumC15914e.EMPTY);
            this.f75750P0.setVisibility(8);
        }
    }

    /* renamed from: EM */
    void m82452EM(ContactProfile contactProfile) {
        if (this.f75760Z0) {
            return;
        }
        this.f75760Z0 = true;
        mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14710a(contactProfile));
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 7);
        if (C21927m.m114302u().m114307E(contactProfile.f42434r) == -1) {
            C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
        }
        c0766k.mo1534S8(contactProfile.f42434r, trackingSource.m40682o());
    }

    /* renamed from: FM */
    public void m82453FM(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14713d());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1037));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.outgoing_friend_request, viewGroup, false);
        this.f75752R0 = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(AbstractC6918a0.recycler_view);
        this.f75750P0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C7282z4 c7282z4 = new C7282z4(false, this);
        this.f75751Q0 = c7282z4;
        this.f75750P0.setAdapter(c7282z4);
        this.f75754T0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_header_info);
        this.f75756V0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.ll_suggest_entry_points_add_friend);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(AbstractC6918a0.ll_entry_point_find_friend);
        this.f75757W0 = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f75758X0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.ll_entry_point_phonebook_suggestion);
        if (!AbstractC23309i.m122119l4() && !AbstractC23309i.m122157m4()) {
            this.f75758X0.setVisibility(8);
        } else {
            this.f75758X0.setVisibility(0);
            this.f75758X0.setOnClickListener(this);
        }
        m82451DM(true);
        return inflate;
    }

    /* renamed from: GM */
    public void m82454GM(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(343);
            trackingSource.m40677a("sourceView", 7);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            if (C26446c.m136326b().m136329d()) {
                Bundle bundle = new Bundle();
                bundle.putString("data", contactProfile.m40373K());
                bundle.putString("message", contactProfile.m40378N());
                this.f72421L0.m92662fJ().m93066i2(AcceptFriendView.class, bundle, 10099, 1, true);
            } else {
                m82455qM(contactProfile, false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.adapters.C7282z4.c
    /* renamed from: Il */
    public void mo37053Il(ContactProfile contactProfile) {
        AbstractC23647d.m123897g("4801126");
        if (contactProfile != null) {
            new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(22)).m135743b(), 0, 1));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("5801173");
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
                actionBar.setTitle(m92652XI(AbstractC8020f0.str_sent_friend_request));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this, 6001);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 6001);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            AbstractC23063f2.m118355g(1, true, new d30(this));
        }
    }

    @Override // com.zing.zalo.adapters.C7282z4.c
    /* renamed from: bA */
    public void mo37054bA(ContactProfile contactProfile, int i11) {
        if (contactProfile != null) {
            try {
                this.f75753S0 = contactProfile;
                if (i11 == 2) {
                    this.f72421L0.m92662fJ().m93069k2(ChatView.class, new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b(), 1, true);
                } else {
                    if (i11 != 1 && AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                        AbstractC23647d.m123897g("4801125");
                        m82452EM(contactProfile);
                    }
                    m82457tM(contactProfile);
                    AbstractC23647d.m123897g("5901191");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        m82442sM();
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OutgoingFriendRequestView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        C7282z4 c7282z4;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 10099 && i12 == -1 && (c7282z4 = this.f75751Q0) != null) {
            c7282z4.m10008p();
            m82431AM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C17487o0 mo35579p;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.ll_entry_point_find_friend) {
            C17487o0 mo35579p2 = this.f72421L0.m92676n2().mo35579p();
            if (mo35579p2 != null) {
                mo35579p2.m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.ll_entry_point_phonebook_suggestion && (mo35579p = this.f72421L0.m92676n2().mo35579p()) != null) {
            mo35579p.m93069k2(ListContactNativeView.class, null, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("5801173");
            m82442sM();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m82449BM();
    }

    /* renamed from: qM */
    public void m82455qM(ContactProfile contactProfile, boolean z11) {
        if (this.f75765e1) {
            return;
        }
        String str = contactProfile.f42434r;
        mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        this.f75765e1 = true;
        this.f75766f1.mo1704o8(new C14714e(str, contactProfile));
        this.f75766f1.mo1497O3(str);
    }

    /* renamed from: rM */
    public ArrayList m82456rM() {
        String str;
        C31934gb m114207j;
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList m118352d = AbstractC23063f2.m118352d(false);
            if (m118352d != null && !m118352d.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(m118352d.size());
                Iterator it = m118352d.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    if (contactProfile != null) {
                        contactProfile.m40400c1(false);
                        arrayList2.add(contactProfile.f42434r);
                        arrayList.add(contactProfile);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C18635e m141813j = C28203u6.f131407a.m141813j(arrayList2);
                    Iterator it2 = arrayList.iterator();
                    C21915b0 c21915b0 = null;
                    while (it2.hasNext()) {
                        ContactProfile contactProfile2 = (ContactProfile) it2.next();
                        ContactProfile mo98491j = m141813j.mo98491j(contactProfile2.f42434r);
                        if (mo98491j != null) {
                            str = mo98491j.f42455y;
                        } else {
                            str = contactProfile2.f42455y;
                        }
                        contactProfile2.f42455y = str;
                        if (TextUtils.isEmpty(str)) {
                            if (c21915b0 == null) {
                                c21915b0 = C21913a0.m114177i().m114182e();
                            }
                            if (c21915b0 != null && c21915b0.m114206g(contactProfile2.f42434r) && (m114207j = c21915b0.m114207j(contactProfile2.f42434r)) != null) {
                                contactProfile2.f42455y = m114207j.f146730b;
                            }
                        }
                        if (C23302b.f113247a.m120523d(contactProfile2.f42446v)) {
                            contactProfile2.f42427o1 = AbstractC23028c0.m118087g(contactProfile2.m40383Q(true, false));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new Comparator() { // from class: com.zing.zalo.ui.zviews.f30
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m82443uM;
                        m82443uM = OutgoingFriendRequestView.m82443uM((ContactProfile) obj, (ContactProfile) obj2);
                        return m82443uM;
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: tM */
    public void m82457tM(ContactProfile contactProfile) {
        try {
            String str = contactProfile.f42434r;
            if (this.f75762b1) {
                return;
            }
            mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
            this.f75762b1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14711b(str, contactProfile));
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f75762b1 = false;
            mo78960q3();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6001) {
            this.f72827B0.post(new d30(this));
        }
    }
}
