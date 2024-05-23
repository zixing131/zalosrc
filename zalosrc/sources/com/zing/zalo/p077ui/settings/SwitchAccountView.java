package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.C2352i0;
import bm.RunnableC2846d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.bottomsheet.LogoutConfirmView;
import com.zing.zalo.p077ui.settings.SwitchAccountView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.LoginView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kn.AbstractC21777d;
import la0.RunnableC22283m7;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23153n4;
import me0.AbstractC23161o1;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.C23055e5;
import mm0.AbstractC23352g;
import mm0.AbstractC23353h;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p579vl.C28290a;

/* loaded from: classes6.dex */
public class SwitchAccountView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    RecyclerView f68043P0;

    /* renamed from: Q0 */
    C13201h f68044Q0;

    /* renamed from: R0 */
    RobotoTextView f68045R0;

    /* renamed from: U0 */
    private String f68048U0;

    /* renamed from: V0 */
    private int f68049V0;

    /* renamed from: X0 */
    private InterfaceC23792b f68051X0;

    /* renamed from: Y0 */
    ContactProfile f68052Y0;

    /* renamed from: i1 */
    long f68062i1;

    /* renamed from: S0 */
    String f68046S0 = "";

    /* renamed from: T0 */
    Handler f68047T0 = new Handler(Looper.getMainLooper());

    /* renamed from: W0 */
    final sh0 f68050W0 = new sh0();

    /* renamed from: Z0 */
    Runnable f68053Z0 = null;

    /* renamed from: a1 */
    boolean f68054a1 = false;

    /* renamed from: b1 */
    boolean f68055b1 = false;

    /* renamed from: c1 */
    boolean f68056c1 = false;

    /* renamed from: d1 */
    final Object f68057d1 = new Object();

    /* renamed from: e1 */
    final Object f68058e1 = new Object();

    /* renamed from: f1 */
    boolean f68059f1 = false;

    /* renamed from: g1 */
    boolean f68060g1 = false;

    /* renamed from: h1 */
    Object f68061h1 = new Object();

    /* renamed from: j1 */
    private boolean f68063j1 = false;

    /* renamed from: k1 */
    private final Object f68064k1 = new Object();

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$a */
    /* loaded from: classes6.dex */
    public class C13194a implements C13201h.a {
        C13194a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m74336d(ContactProfile contactProfile) {
            try {
                SwitchAccountView switchAccountView = SwitchAccountView.this;
                if (switchAccountView.f68054a1) {
                    switchAccountView.f72421L0.mo49315c4();
                    SwitchAccountView.this.f68046S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap_deactivate_account);
                    SwitchAccountView.this.showDialog(4);
                } else if (AbstractC23304d.f113346X0 == 0) {
                    switchAccountView.f72421L0.mo49315c4();
                    SwitchAccountView.this.showDialog(5);
                } else if (contactProfile.f42434r.startsWith("-1")) {
                    SwitchAccountView.this.f72421L0.mo49315c4();
                    if (SwitchAccountView.this.f68044Q0.mo10003k() > AbstractC23309i.m121152L8()) {
                        AbstractC23647d.m123897g("36016");
                        SwitchAccountView.this.showDialog(3);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", 1);
                        bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", SwitchAccountView.this.f68049V0);
                        SwitchAccountView.this.m92662fJ().m93069k2(LoginView.class, bundle, 1, true);
                        AbstractC0924m0.m3287Ni(AbstractC23309i.m121704a5());
                    }
                } else if (!contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                    SwitchAccountView.this.m74330EM(contactProfile);
                    AbstractC23647d.m123897g("36005");
                } else {
                    SwitchAccountView.this.f72421L0.mo49315c4();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.settings.SwitchAccountView.C13201h.a
        /* renamed from: a */
        public void mo74337a(ContactProfile contactProfile) {
            if (!contactProfile.f42434r.startsWith("-1")) {
                SwitchAccountView switchAccountView = SwitchAccountView.this;
                switchAccountView.f68052Y0 = contactProfile;
                switchAccountView.showDialog(1);
            }
        }

        @Override // com.zing.zalo.p077ui.settings.SwitchAccountView.C13201h.a
        /* renamed from: b */
        public void mo74338b(ContactProfile contactProfile) {
            RunnableC13242r0 runnableC13242r0 = new Runnable() { // from class: com.zing.zalo.ui.settings.r0

                /* renamed from: q */
                public final /* synthetic */ ContactProfile f68162q;

                public /* synthetic */ RunnableC13242r0(ContactProfile contactProfile2) {
                    r2 = contactProfile2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SwitchAccountView.C13194a.this.m74336d(r2);
                }
            };
            synchronized (SwitchAccountView.this.f68057d1) {
                try {
                    SwitchAccountView switchAccountView = SwitchAccountView.this;
                    if (switchAccountView.f68055b1) {
                        runnableC13242r0.run();
                    } else {
                        switchAccountView.f68053Z0 = runnableC13242r0;
                        switchAccountView.m74331HM(false, contactProfile2.f42434r.startsWith("-1"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$b */
    /* loaded from: classes6.dex */
    class C13195b extends ZdsActionBar.AbstractC16987c {
        C13195b() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            super.mo39913a();
            AbstractC23647d.m123897g("36011");
            SwitchAccountView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$c */
    /* loaded from: classes6.dex */
    public class C13196c extends AbstractC0939u {
        C13196c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ContactProfile contactProfile = SwitchAccountView.this.f68052Y0;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                if (AbstractC23179p8.m119424j(SwitchAccountView.this.f68052Y0.f42434r)) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_switch_account_success));
                }
                SwitchAccountView.this.m74329DM();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$d */
    /* loaded from: classes6.dex */
    public class C13197d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f68068a;

        /* renamed from: b */
        final /* synthetic */ C2352i0 f68069b;

        C13197d(boolean z11, C2352i0 c2352i0) {
            this.f68068a = z11;
            this.f68069b = c2352i0;
        }

        /* renamed from: d */
        public static /* synthetic */ void m74340d(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            try {
                try {
                    if (!SwitchAccountView.this.f72421L0.m92677nJ() && !SwitchAccountView.this.f72421L0.m92681pJ() && !this.f68068a) {
                        if (AbstractC23216t1.m119643h(SwitchAccountView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.s0
                            @Override // me0.AbstractC23216t1.d
                            /* renamed from: a */
                            public final void mo68088a(String str) {
                                SwitchAccountView.C13197d.m74340d(str);
                            }
                        })) {
                            C2352i0 c2352i0 = this.f68069b;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("API validateAccount onErrorData, errorCode=");
                            if (c20096c != null) {
                                obj5 = Integer.valueOf(c20096c.m104491c());
                            } else {
                                obj5 = " ";
                            }
                            sb2.append(obj5);
                            AbstractC23179p8.m119427m(c2352i0, sb2.toString(), 123139);
                            SwitchAccountView.this.m74310IM(false, this.f68069b);
                            synchronized (SwitchAccountView.this.f68057d1) {
                                SwitchAccountView switchAccountView = SwitchAccountView.this;
                                switchAccountView.f68056c1 = false;
                                switchAccountView.f72421L0.mo49315c4();
                            }
                            return;
                        }
                        if (c20096c != null) {
                            ToastUtils.m89263k(c20096c);
                        }
                        C2352i0 c2352i02 = this.f68069b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("API validateAccount onErrorData, errorCode=");
                        if (c20096c != null) {
                            obj4 = Integer.valueOf(c20096c.m104491c());
                        } else {
                            obj4 = " ";
                        }
                        sb3.append(obj4);
                        AbstractC23179p8.m119427m(c2352i02, sb3.toString(), 123139);
                        SwitchAccountView.this.m74310IM(false, this.f68069b);
                        synchronized (SwitchAccountView.this.f68057d1) {
                            SwitchAccountView switchAccountView2 = SwitchAccountView.this;
                            switchAccountView2.f68056c1 = false;
                            switchAccountView2.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    C2352i0 c2352i03 = this.f68069b;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("API validateAccount onErrorData, errorCode=");
                    if (c20096c != null) {
                        obj3 = Integer.valueOf(c20096c.m104491c());
                    } else {
                        obj3 = " ";
                    }
                    sb4.append(obj3);
                    AbstractC23179p8.m119427m(c2352i03, sb4.toString(), 123139);
                    SwitchAccountView.this.m74310IM(false, this.f68069b);
                    synchronized (SwitchAccountView.this.f68057d1) {
                        SwitchAccountView switchAccountView3 = SwitchAccountView.this;
                        switchAccountView3.f68056c1 = false;
                        switchAccountView3.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C2352i0 c2352i04 = this.f68069b;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("API validateAccount onErrorData, errorCode=");
                    if (c20096c != null) {
                        obj = Integer.valueOf(c20096c.m104491c());
                    } else {
                        obj = " ";
                    }
                    sb5.append(obj);
                    AbstractC23179p8.m119427m(c2352i04, sb5.toString(), 123139);
                    SwitchAccountView.this.m74310IM(false, this.f68069b);
                    synchronized (SwitchAccountView.this.f68057d1) {
                        SwitchAccountView switchAccountView4 = SwitchAccountView.this;
                        switchAccountView4.f68056c1 = false;
                        switchAccountView4.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                C2352i0 c2352i05 = this.f68069b;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("API validateAccount onErrorData, errorCode=");
                if (c20096c != null) {
                    obj2 = Integer.valueOf(c20096c.m104491c());
                } else {
                    obj2 = " ";
                }
                sb6.append(obj2);
                AbstractC23179p8.m119427m(c2352i05, sb6.toString(), 123139);
                SwitchAccountView.this.m74310IM(false, this.f68069b);
                synchronized (SwitchAccountView.this.f68057d1) {
                    SwitchAccountView switchAccountView5 = SwitchAccountView.this;
                    switchAccountView5.f68056c1 = false;
                    switchAccountView5.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            boolean z11;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        i11 = optJSONObject.optInt("is_set");
                        SwitchAccountView switchAccountView = SwitchAccountView.this;
                        if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        switchAccountView.f68054a1 = z11;
                    } else {
                        i11 = 0;
                    }
                    AbstractC23304d.f113346X0 = i11;
                    AbstractC23309i.m122550wp(i11);
                    AbstractC23179p8.m119427m(this.f68069b, "API validateAccount onDataProcessed", 123105);
                    SwitchAccountView.this.m74310IM(false, this.f68069b);
                    synchronized (SwitchAccountView.this.f68057d1) {
                        try {
                            SwitchAccountView switchAccountView2 = SwitchAccountView.this;
                            switchAccountView2.f68056c1 = false;
                            switchAccountView2.f68055b1 = true;
                            if (switchAccountView2.f68053Z0 != null) {
                                if (switchAccountView2.m92676n2() != null) {
                                    SwitchAccountView.this.m92676n2().runOnUiThread(SwitchAccountView.this.f68053Z0);
                                }
                            } else {
                                switchAccountView2.f72421L0.mo49315c4();
                            }
                        } finally {
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    AbstractC23179p8.m119427m(this.f68069b, "API validateAccount onDataProcessed", 123105);
                    SwitchAccountView.this.m74310IM(false, this.f68069b);
                    synchronized (SwitchAccountView.this.f68057d1) {
                        try {
                            SwitchAccountView switchAccountView3 = SwitchAccountView.this;
                            switchAccountView3.f68056c1 = false;
                            switchAccountView3.f68055b1 = true;
                            if (switchAccountView3.f68053Z0 != null) {
                                if (switchAccountView3.m92676n2() != null) {
                                    SwitchAccountView.this.m92676n2().runOnUiThread(SwitchAccountView.this.f68053Z0);
                                }
                            } else {
                                switchAccountView3.f72421L0.mo49315c4();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                AbstractC23179p8.m119427m(this.f68069b, "API validateAccount onDataProcessed", 123105);
                SwitchAccountView.this.m74310IM(false, this.f68069b);
                synchronized (SwitchAccountView.this.f68057d1) {
                    try {
                        SwitchAccountView switchAccountView4 = SwitchAccountView.this;
                        switchAccountView4.f68056c1 = false;
                        switchAccountView4.f68055b1 = true;
                        if (switchAccountView4.f68053Z0 != null) {
                            if (switchAccountView4.m92676n2() != null) {
                                SwitchAccountView.this.m92676n2().runOnUiThread(SwitchAccountView.this.f68053Z0);
                            }
                        } else {
                            switchAccountView4.f72421L0.mo49315c4();
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$e */
    /* loaded from: classes6.dex */
    public class C13198e implements InterfaceC20094a {
        C13198e() {
        }

        /* renamed from: e */
        public /* synthetic */ void m74343e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!SwitchAccountView.this.f72421L0.m92677nJ() && !SwitchAccountView.this.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        SwitchAccountView.this.f72421L0.m92676n2().mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    SwitchAccountView.this.f72421L0.m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public static /* synthetic */ void m74344f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (SwitchAccountView.this.f68058e1) {
                    SwitchAccountView switchAccountView = SwitchAccountView.this;
                    switchAccountView.f68059f1 = false;
                    switchAccountView.f72421L0.mo49315c4();
                }
                if (SwitchAccountView.this.f72421L0.m92677nJ() || SwitchAccountView.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(SwitchAccountView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.t0
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SwitchAccountView.C13198e.m74344f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.settings.u0.<init>(com.zing.zalo.ui.settings.SwitchAccountView$e, boolean, boolean, boolean, org.json.JSONArray):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(java.lang.Object r10) {
            /*
                r9 = this;
                com.zing.zalo.ui.settings.SwitchAccountView r0 = com.zing.zalo.p077ui.settings.SwitchAccountView.this     // Catch: java.lang.Exception -> L76
                java.lang.Object r0 = r0.f68058e1     // Catch: java.lang.Exception -> L76
                monitor-enter(r0)     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.settings.SwitchAccountView r1 = com.zing.zalo.p077ui.settings.SwitchAccountView.this     // Catch: java.lang.Throwable -> L78
                r2 = 0
                r1.f68059f1 = r2     // Catch: java.lang.Throwable -> L78
                com.zing.zalo.ui.zviews.BaseZaloView r1 = r1.f72421L0     // Catch: java.lang.Throwable -> L78
                r1.mo49315c4()     // Catch: java.lang.Throwable -> L78
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
                if (r10 == 0) goto L7e
                org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch: java.lang.Exception -> L76
                java.lang.String r0 = "data"
                org.json.JSONObject r0 = r10.optJSONObject(r0)     // Catch: java.lang.Exception -> L76
                java.lang.String r1 = "error_code"
                r3 = -999(0xfffffffffffffc19, float:NaN)
                int r10 = r10.optInt(r1, r3)     // Catch: java.lang.Exception -> L76
                if (r10 != 0) goto L7e
                if (r0 == 0) goto L7e
                java.lang.String r10 = "isset_pwd"
                boolean r10 = r0.optBoolean(r10)     // Catch: java.lang.Exception -> L76
                r1 = 1
                p348mi.AbstractC23304d.f113346X0 = r10     // Catch: java.lang.Exception -> L76
                p348mi.AbstractC23309i.m122550wp(r10)     // Catch: java.lang.Exception -> L76
                java.lang.String r10 = "allow_change_phonenumber"
                int r10 = r0.optInt(r10, r2)     // Catch: java.lang.Exception -> L76
                if (r10 != r1) goto L3c
                r5 = 1
                goto L3d
            L3c:
                r5 = 0
            L3d:
                java.lang.String r10 = "unmap_profile"
                int r10 = r0.optInt(r10, r2)     // Catch: java.lang.Exception -> L76
                if (r10 != r1) goto L47
                r6 = 1
                goto L48
            L47:
                r6 = 0
            L48:
                java.lang.String r10 = "bypass_verify_pwd"
                int r10 = r0.optInt(r10, r2)     // Catch: java.lang.Exception -> L76
                if (r10 != r1) goto L52
                r7 = 1
                goto L53
            L52:
                r7 = 0
            L53:
                java.lang.String r10 = "valid_error"
                org.json.JSONArray r8 = r0.optJSONArray(r10)     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.settings.SwitchAccountView r10 = com.zing.zalo.p077ui.settings.SwitchAccountView.this     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.BaseZaloView r10 = r10.f72421L0     // Catch: java.lang.Exception -> L76
                ub.a r10 = r10.m92676n2()     // Catch: java.lang.Exception -> L76
                if (r10 == 0) goto L7e
                com.zing.zalo.ui.settings.SwitchAccountView r10 = com.zing.zalo.p077ui.settings.SwitchAccountView.this     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.zviews.BaseZaloView r10 = r10.f72421L0     // Catch: java.lang.Exception -> L76
                ub.a r10 = r10.m92676n2()     // Catch: java.lang.Exception -> L76
                com.zing.zalo.ui.settings.u0 r0 = new com.zing.zalo.ui.settings.u0     // Catch: java.lang.Exception -> L76
                r3 = r0
                r4 = r9
                r3.<init>()     // Catch: java.lang.Exception -> L76
                r10.runOnUiThread(r0)     // Catch: java.lang.Exception -> L76
                goto L7e
            L76:
                r10 = move-exception
                goto L7b
            L78:
                r10 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
                throw r10     // Catch: java.lang.Exception -> L76
            L7b:
                r10.printStackTrace()
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.settings.SwitchAccountView.C13198e.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$f */
    /* loaded from: classes6.dex */
    public class C13199f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C2352i0 f68072a;

        /* renamed from: b */
        final /* synthetic */ String f68073b;

        /* renamed from: c */
        final /* synthetic */ long f68074c;

        /* renamed from: d */
        final /* synthetic */ ContactProfile f68075d;

        C13199f(C2352i0 c2352i0, String str, long j11, ContactProfile contactProfile) {
            this.f68072a = c2352i0;
            this.f68073b = str;
            this.f68074c = j11;
            this.f68075d = contactProfile;
        }

        /* renamed from: d */
        public /* synthetic */ void m74346d(C20096c c20096c, ContactProfile contactProfile) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 502) {
                        ToastUtils.showMess(AbstractC23161o1.m119318c(502, ""));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", contactProfile.f42434r);
            jSONObject.put("avt", contactProfile.f42446v);
            jSONObject.put("name", contactProfile.f42437s);
            jSONObject.put("phone", contactProfile.f42455y);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", 2);
            bundle.putString("EXTRA_DATA_SWITCH_ACCOUNT", jSONObject.toString());
            bundle.putString("EXTRA_FILL_ACCOUNT", contactProfile.f42455y);
            bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", SwitchAccountView.this.f68049V0);
            SwitchAccountView.this.m92662fJ().m93069k2(LoginView.class, bundle, 1, true);
            AbstractC0924m0.m3287Ni(AbstractC23309i.m121704a5());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Object obj;
            try {
                C2352i0 c2352i0 = this.f68072a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("API resumeAccountSession onErrorData, errorCode=");
                if (c20096c != null) {
                    obj = Integer.valueOf(c20096c.m104491c());
                } else {
                    obj = " ";
                }
                sb2.append(obj);
                AbstractC23179p8.m119427m(c2352i0, sb2.toString(), 123140);
                SwitchAccountView.this.m74310IM(true, this.f68072a);
                if (SwitchAccountView.this.m92677nJ()) {
                    return;
                }
                synchronized (SwitchAccountView.this.f68061h1) {
                    SwitchAccountView switchAccountView = SwitchAccountView.this;
                    switchAccountView.f68060g1 = false;
                    switchAccountView.f72421L0.mo49315c4();
                }
                SwitchAccountView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.v0

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f68288q;

                    /* renamed from: r */
                    public final /* synthetic */ ContactProfile f68289r;

                    public /* synthetic */ RunnableC13284v0(C20096c c20096c2, ContactProfile contactProfile) {
                        r2 = c20096c2;
                        r3 = contactProfile;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SwitchAccountView.C13199f.this.m74346d(r2, r3);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (SwitchAccountView.this.m92677nJ()) {
                return;
            }
            AbstractC23179p8.m119427m(this.f68072a, "API resumeAccountSession onDataProcessed", 123106);
            AbstractC23153n4.m119089C(SwitchAccountView.this.m92676n2(), obj, this.f68073b, this.f68074c, SwitchAccountView.this.f68049V0, this.f68072a);
            SwitchAccountView.this.m74310IM(true, this.f68072a);
            synchronized (SwitchAccountView.this.f68061h1) {
                SwitchAccountView switchAccountView = SwitchAccountView.this;
                switchAccountView.f68060g1 = false;
                switchAccountView.f72421L0.mo49315c4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$g */
    /* loaded from: classes6.dex */
    public class C13200g implements InterfaceC20094a {
        C13200g() {
        }

        /* renamed from: h */
        public /* synthetic */ void m74352h() {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("password_mode", 0);
                bundle.putBoolean("logout_case", true);
                SwitchAccountView.this.f72421L0.m92662fJ().m93066i2(ChangePasswordView.class, bundle, 3231, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m74353i() {
            SwitchAccountView.this.f68046S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap);
            SwitchAccountView.this.f72421L0.showDialog(4);
        }

        /* renamed from: j */
        public /* synthetic */ void m74354j() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                SwitchAccountView.this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: k */
        public static /* synthetic */ void m74355k(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* renamed from: l */
        public /* synthetic */ void m74356l() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                SwitchAccountView.this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (AbstractC23216t1.m119643h(SwitchAccountView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.w0
                        @Override // me0.AbstractC23216t1.d
                        /* renamed from: a */
                        public final void mo68088a(String str) {
                            SwitchAccountView.C13200g.m74355k(str);
                        }
                    })) {
                        synchronized (SwitchAccountView.this.f68064k1) {
                            SwitchAccountView.this.f68063j1 = false;
                            SwitchAccountView.this.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 2003 && m104491c != 2004 && m104491c != 2001 && m104491c != 2002 && m104491c != 2020 && m104491c != 2028) {
                        ToastUtils.m89263k(c20096c);
                        synchronized (SwitchAccountView.this.f68064k1) {
                            SwitchAccountView.this.f68063j1 = false;
                            SwitchAccountView.this.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    AbstractC23179p8.m119426l(CoreUtility.f89233i);
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 9015, "", 0L, 9021, CoreUtility.f89236l);
                    AbstractC23148n.m118852z();
                    AbstractC23138m0.m118771c(false);
                    if (SwitchAccountView.this.f72421L0.m92676n2() != null) {
                        SwitchAccountView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.x0
                            public /* synthetic */ RunnableC13290x0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SwitchAccountView.C13200g.this.m74356l();
                            }
                        });
                    }
                    synchronized (SwitchAccountView.this.f68064k1) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SwitchAccountView.this.f68064k1) {
                        SwitchAccountView.this.f68063j1 = false;
                        SwitchAccountView.this.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SwitchAccountView.this.f68064k1) {
                    SwitchAccountView.this.f68063j1 = false;
                    SwitchAccountView.this.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        i12 = optJSONObject.optInt("unmap_profile", 0);
                        i11 = optJSONObject.optInt("is_set", 1);
                    } else {
                        i11 = 1;
                        i12 = 0;
                    }
                    if (i11 == 0) {
                        if (SwitchAccountView.this.f72421L0.m92676n2() != null) {
                            SwitchAccountView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.y0
                                public /* synthetic */ RunnableC13292y0() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwitchAccountView.C13200g.this.m74352h();
                                }
                            });
                        }
                    } else if (i12 == 1) {
                        if (SwitchAccountView.this.f72421L0.m92676n2() != null) {
                            SwitchAccountView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.z0
                                public /* synthetic */ RunnableC13294z0() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwitchAccountView.C13200g.this.m74353i();
                                }
                            });
                        }
                    } else {
                        AbstractC23179p8.m119426l(CoreUtility.f89233i);
                        AbstractC20887g.m109232j(CoreUtility.f89233i, 9015, "", 0L, 9021, CoreUtility.f89236l);
                        AbstractC23148n.m118852z();
                        AbstractC23138m0.m118771c(false);
                        if (SwitchAccountView.this.f72421L0.m92676n2() != null) {
                            SwitchAccountView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.a1
                                public /* synthetic */ RunnableC13204a1() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwitchAccountView.C13200g.this.m74354j();
                                }
                            });
                        }
                    }
                    synchronized (SwitchAccountView.this.f68064k1) {
                        SwitchAccountView.this.f68063j1 = false;
                        SwitchAccountView.this.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SwitchAccountView.this.f68064k1) {
                        SwitchAccountView.this.f68063j1 = false;
                        SwitchAccountView.this.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SwitchAccountView.this.f68064k1) {
                    SwitchAccountView.this.f68063j1 = false;
                    SwitchAccountView.this.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$h */
    /* loaded from: classes6.dex */
    public static class C13201h extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        List f68078r;

        /* renamed from: s */
        private final a f68079s;

        /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$h$a */
        /* loaded from: classes6.dex */
        public interface a {
            /* renamed from: a */
            void mo74337a(ContactProfile contactProfile);

            /* renamed from: b */
            void mo74338b(ContactProfile contactProfile);
        }

        /* renamed from: com.zing.zalo.ui.settings.SwitchAccountView$h$b */
        /* loaded from: classes6.dex */
        public class b extends RecyclerView.AbstractC1876c0 {

            /* renamed from: I */
            GroupAvatarView f68080I;

            /* renamed from: J */
            RobotoTextView f68081J;

            /* renamed from: K */
            RobotoTextView f68082K;

            /* renamed from: L */
            RobotoTextView f68083L;

            /* renamed from: M */
            ImageView f68084M;

            public b(View view) {
                super(view);
                this.f68080I = (GroupAvatarView) view.findViewById(AbstractC6918a0.img_avt);
                this.f68081J = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
                this.f68082K = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_login);
                this.f68084M = (ImageView) view.findViewById(AbstractC6918a0.ic_active);
                this.f68083L = (RobotoTextView) view.findViewById(AbstractC6918a0.tvLogin);
            }

            /* renamed from: m0 */
            public /* synthetic */ void m74365m0(ContactProfile contactProfile, View view) {
                if (C13201h.this.f68079s != null) {
                    C13201h.this.f68079s.mo74338b(contactProfile);
                }
            }

            /* renamed from: n0 */
            public /* synthetic */ void m74366n0(ContactProfile contactProfile, View view) {
                if (C13201h.this.f68079s != null) {
                    C13201h.this.f68079s.mo74338b(contactProfile);
                }
            }

            /* renamed from: o0 */
            public /* synthetic */ boolean m74367o0(ContactProfile contactProfile, View view) {
                if (C13201h.this.f68079s != null) {
                    C13201h.this.f68079s.mo74337a(contactProfile);
                    return true;
                }
                return true;
            }

            /* renamed from: l0 */
            public void m74368l0(ContactProfile contactProfile) {
                if (contactProfile.f42434r.startsWith("-1")) {
                    this.f68080I.setImageResource(AbstractC16803z.icn_add_item);
                    this.f68081J.setText(AbstractC8020f0.str_add_account);
                    this.f68082K.setVisibility(8);
                    this.f68083L.setVisibility(8);
                    this.f68084M.setVisibility(8);
                    this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.settings.b1

                        /* renamed from: q */
                        public final /* synthetic */ ContactProfile f68116q;

                        public /* synthetic */ ViewOnClickListenerC13207b1(ContactProfile contactProfile2) {
                            r2 = contactProfile2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SwitchAccountView.C13201h.b.this.m74365m0(r2, view);
                        }
                    });
                } else {
                    this.f68080I.m75731c(contactProfile2);
                    this.f68081J.setText(contactProfile2.mo2475c());
                    if (contactProfile2.f42434r.equals(CoreUtility.f89233i)) {
                        this.f68082K.setVisibility(8);
                        this.f68083L.setVisibility(0);
                        this.f68084M.setVisibility(0);
                        this.f7784p.setOnClickListener(null);
                    } else {
                        this.f68082K.setVisibility(0);
                        this.f68083L.setVisibility(8);
                        this.f68084M.setVisibility(8);
                        ViewOnClickListenerC13210c1 viewOnClickListenerC13210c1 = new View.OnClickListener() { // from class: com.zing.zalo.ui.settings.c1

                            /* renamed from: q */
                            public final /* synthetic */ ContactProfile f68120q;

                            public /* synthetic */ ViewOnClickListenerC13210c1(ContactProfile contactProfile2) {
                                r2 = contactProfile2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SwitchAccountView.C13201h.b.this.m74366n0(r2, view);
                            }
                        };
                        this.f68082K.setOnClickListener(viewOnClickListenerC13210c1);
                        this.f7784p.setOnClickListener(viewOnClickListenerC13210c1);
                    }
                }
                this.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.settings.d1

                    /* renamed from: q */
                    public final /* synthetic */ ContactProfile f68123q;

                    public /* synthetic */ ViewOnLongClickListenerC13213d1(ContactProfile contactProfile2) {
                        r2 = contactProfile2;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m74367o0;
                        m74367o0 = SwitchAccountView.C13201h.b.this.m74367o0(r2, view);
                        return m74367o0;
                    }
                });
            }
        }

        public C13201h(a aVar) {
            this.f68079s = aVar;
        }

        /* renamed from: M */
        public a m74358M() {
            return this.f68079s;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N */
        public void mo9990A(b bVar, int i11) {
            try {
                bVar.m74368l0((ContactProfile) this.f68078r.get(i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: O */
        public b mo9992C(ViewGroup viewGroup, int i11) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_switch_account, viewGroup, false));
        }

        /* renamed from: P */
        public void m74361P(List list) {
            this.f68078r = new ArrayList(list);
            m10008p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            List list = this.f68078r;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m74305AM(List list) {
        int i11;
        try {
            this.f68044Q0.m74361P(list);
            RobotoTextView robotoTextView = this.f68045R0;
            if (list.size() > 2) {
                i11 = AbstractC8020f0.str_hint_switch_account_2;
            } else {
                i11 = AbstractC8020f0.str_hint_switch_account_1;
            }
            robotoTextView.setText(i11);
            m74333qM(list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BM */
    private void m74306BM() {
        m74309GM();
        AbstractC23647d.m123897g("36013");
    }

    /* renamed from: CM */
    private void m74307CM(int i11) {
        if (i11 == 1) {
            AbstractC23647d.m123897g("36014");
            m74322sM();
        } else if (i11 == 2) {
            m74308FM();
        }
    }

    /* renamed from: FM */
    private void m74308FM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SOURCE_ACTION", -1);
        C22438j.m115953v(m92693xK(), bundle);
    }

    /* renamed from: GM */
    private void m74309GM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        m92693xK().mo89694j2(LogoutConfirmView.class, bundle, 2212, "LogoutConfirmView", 2, true);
    }

    /* renamed from: IM */
    public void m74310IM(boolean z11, C2352i0 c2352i0) {
        int i11;
        if (c2352i0 == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f68062i1;
            if (z11) {
                if (currentTimeMillis > 5000) {
                    i11 = 123102;
                } else {
                    i11 = 123101;
                }
            } else if (currentTimeMillis > 5000) {
                i11 = 123104;
            } else {
                i11 = 123103;
            }
            String m12333f = c2352i0.m12333f();
            if (!TextUtils.isEmpty(m12333f)) {
                AbstractC20887g.m109231i(m12333f, i11, c2352i0.m12332d(), currentTimeMillis, 123100, CoreUtility.f89236l);
            }
            AbstractC0837p0.m2225f().mo2040a(new RunnableC2846d());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    private boolean m74321rM() {
        return AbstractC21777d.m112310a(this.f72421L0.m92662fJ(), this.f72421L0.m92642L3());
    }

    /* renamed from: sM */
    private void m74322sM() {
        synchronized (this.f68064k1) {
            try {
                if (this.f68063j1) {
                    this.f72421L0.mo49282B8(null, false);
                    return;
                }
                this.f68063j1 = true;
                this.f72421L0.mo49282B8(null, false);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C13200g());
                c0766k.mo1436G7();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: tM */
    private void m74323tM() {
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("EXTRA_SHORTCUT_SWITCH_ACCOUNT_UID")) {
                this.f68048U0 = m92642L3.getString("EXTRA_SHORTCUT_SWITCH_ACCOUNT_UID");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    public /* synthetic */ void m74324vM() {
        if (this.f68054a1) {
            this.f72421L0.mo49315c4();
            this.f68046S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap_deactivate_account);
            showDialog(4);
        } else if (AbstractC23304d.f113346X0 == 0) {
            this.f72421L0.mo49315c4();
            showDialog(5);
        } else if (this.f68052Y0 != null) {
            AbstractC23647d.m123897g("36007");
            m74330EM(this.f68052Y0);
        } else {
            this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: wM */
    public /* synthetic */ void m74325wM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.login_title) {
            RunnableC22283m7 runnableC22283m7 = new Runnable() { // from class: la0.m7
                public /* synthetic */ RunnableC22283m7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SwitchAccountView.this.m74324vM();
                }
            };
            synchronized (this.f68057d1) {
                try {
                    if (this.f68055b1) {
                        runnableC22283m7.run();
                    } else {
                        this.f68053Z0 = runnableC22283m7;
                        m74331HM(false, false);
                    }
                } finally {
                }
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_remove_account) {
            AbstractC23647d.m123897g("36008");
            showDialog(2);
        } else if (intValue == AbstractC8020f0.menuframe_change_acc) {
            m74306BM();
        }
    }

    /* renamed from: xM */
    public static /* synthetic */ void m74326xM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("36010");
    }

    /* renamed from: yM */
    public /* synthetic */ void m74327yM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        C0824j.m2153b(new C13196c());
        AbstractC23647d.m123897g("36009");
    }

    /* renamed from: zM */
    public /* synthetic */ void m74328zM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("password_mode", 1);
        this.f72421L0.m92676n2().mo35573l4(ChangePasswordView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int i11;
        super.mo37111CJ(bundle);
        m74323tM();
        if (bundle != null) {
            this.f68049V0 = bundle.getInt("source_switch", 1);
        } else {
            if (TextUtils.isEmpty(this.f68048U0)) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f68049V0 = i11;
        }
        C28290a.f131979a.m142554l(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        try {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                if (i11 != 7) {
                                    return null;
                                }
                                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                                aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_not_exits)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                                return aVar.m43152a();
                            }
                            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                            aVar2.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_set_pass_switch_account)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_set_pass_switch_account)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_set_pass_switch_account), new InterfaceC17463d.d() { // from class: la0.l7
                                public /* synthetic */ C22274l7() {
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                    SwitchAccountView.this.m74328zM(interfaceC17463d, i12);
                                }
                            });
                            return aVar2.m43152a();
                        }
                        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                        View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
                        aVar3.m43177z(inflate);
                        ((TextView) inflate.findViewById(AbstractC6918a0.tvContent)).setText(this.f68046S0);
                        inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
                        inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(this);
                        inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(this);
                        return aVar3.m43152a();
                    }
                    C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar4.m43159h(4).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_max_switch_account), Integer.valueOf(AbstractC23309i.m121152L8()))).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                    return aVar4.m43152a();
                }
                C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_remove_account), this.f68052Y0.mo2475c());
                SpannableString spannableString = new SpannableString(format);
                spannableString.setSpan(new StyleSpan(1), format.indexOf(this.f68052Y0.mo2475c()), format.indexOf(this.f68052Y0.mo2475c()) + this.f68052Y0.mo2475c().length(), 33);
                aVar5.m43159h(7).m43162k(spannableString).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.d() { // from class: la0.j7
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SwitchAccountView.m74326xM(interfaceC17463d, i12);
                    }
                }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_account), new InterfaceC17463d.d() { // from class: la0.k7
                    public /* synthetic */ C22265k7() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SwitchAccountView.this.m74327yM(interfaceC17463d, i12);
                    }
                });
                return aVar5.m43152a();
            }
            ArrayList arrayList = new ArrayList();
            ContactProfile contactProfile = this.f68052Y0;
            if (contactProfile != null && contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                HashMap hashMap = new HashMap();
                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.menuframe_change_acc));
                hashMap.put("id", Integer.valueOf(AbstractC8020f0.menuframe_change_acc));
                arrayList.add(hashMap);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.login_title));
                hashMap2.put("id", Integer.valueOf(AbstractC8020f0.login_title));
                arrayList.add(hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_account));
                hashMap3.put("id", Integer.valueOf(AbstractC8020f0.str_remove_account));
                arrayList.add(hashMap3);
            }
            SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
            ContactProfile contactProfile2 = this.f68052Y0;
            if (contactProfile2 != null) {
                aVar6.m43172u(contactProfile2.mo2475c());
            }
            aVar6.m43173v(1);
            aVar6.m43155d(true);
            aVar6.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: la0.i7

                /* renamed from: q */
                public final /* synthetic */ SimpleAdapter f109398q;

                public /* synthetic */ C22247i7(SimpleAdapter simpleAdapter2) {
                    r2 = simpleAdapter2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SwitchAccountView.this.m74325wM(r2, interfaceC17463d, i12);
                }
            });
            C8009j m43152a = aVar6.m43152a();
            AbstractC23647d.m123897g("36006");
            return m43152a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: DM */
    public void m74329DM() {
        try {
            List m119419e = AbstractC23179p8.m119419e();
            if (m119419e.isEmpty()) {
                AbstractC23304d.f113368c0.f42362N1 = AbstractC23304d.f113410m0;
                m119419e.add(AbstractC23304d.f113368c0);
            }
            m119419e.add(new ContactProfile("-1"));
            this.f68047T0.post(new Runnable() { // from class: la0.h7

                /* renamed from: q */
                public final /* synthetic */ List f109386q;

                public /* synthetic */ RunnableC22238h7(List m119419e2) {
                    r2 = m119419e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SwitchAccountView.this.m74305AM(r2);
                }
            });
            AbstractC23179p8.m119423i(new RunnableC13240q0(this));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    void m74330EM(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (!TextUtils.isEmpty(contactProfile.f42455y) && contactProfile.f42455y.length() >= 5) {
                    if (C23055e5.m118272g(true)) {
                        String str = contactProfile.f42455y;
                        synchronized (this.f68061h1) {
                            try {
                                if (this.f68060g1) {
                                    this.f72421L0.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_signing), false);
                                    return;
                                }
                                this.f68062i1 = System.currentTimeMillis();
                                C2352i0 c2352i0 = new C2352i0("SwitchAccountFlow");
                                c2352i0.m12336i(CoreUtility.f89233i);
                                c2352i0.m12337j(contactProfile.f42434r);
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                C0766k c0766k = new C0766k();
                                c0766k.mo1704o8(new C13199f(c2352i0, str, elapsedRealtime, contactProfile));
                                c0766k.mo1643g6(contactProfile.f42455y, AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + contactProfile.f42455y), contactProfile.f42362N1), AbstractC23179p8.m119418d(AbstractC23304d.f113368c0.f42434r), this.f68049V0);
                                synchronized (this.f68061h1) {
                                    this.f68060g1 = true;
                                    this.f72421L0.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_signing), false);
                                }
                                return;
                            } finally {
                            }
                        }
                    }
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        showDialog(7);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.switch_account_view, viewGroup, false);
        try {
            m74334uM(inflate);
            this.f68051X0 = AbstractC23306f.m120579F1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    /* renamed from: HM */
    void m74331HM(boolean z11, boolean z12) {
        ContactProfile contactProfile;
        if (C23055e5.m118272g(!z11)) {
            synchronized (this.f68057d1) {
                try {
                    String str = null;
                    if (this.f68056c1) {
                        if (!z11) {
                            BaseZaloView baseZaloView = this.f72421L0;
                            if (!z12) {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_signing);
                            }
                            baseZaloView.mo78950cq(str);
                        }
                        return;
                    }
                    this.f68056c1 = true;
                    if (!z11) {
                        BaseZaloView baseZaloView2 = this.f72421L0;
                        if (!z12) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_signing);
                        }
                        baseZaloView2.mo78950cq(str);
                    }
                    this.f68062i1 = System.currentTimeMillis();
                    C2352i0 c2352i0 = new C2352i0("SwitchAccountFlow");
                    c2352i0.m12336i(CoreUtility.f89233i);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C13197d(z11, c2352i0));
                    String str2 = "";
                    if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                        str2 = AbstractC23304d.f113394i0;
                    }
                    if (TextUtils.isEmpty(str2) && (contactProfile = AbstractC23304d.f113368c0) != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
                        str2 = AbstractC23304d.f113368c0.f42455y;
                    }
                    c0766k.mo1402C5(str2, AbstractC23309i.m121704a5(), AbstractC23309i.m121477U0());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C13195b());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m74323tM();
        if (this.f72421L0.m92656bJ() != null) {
            m74329DM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f68050W0.m87414t();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        bundle.putInt("source_switch", this.f68049V0);
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        this.f68050W0.m87405e(this, 47);
    }

    /* renamed from: a7 */
    void m74332a7() {
        try {
            synchronized (this.f68058e1) {
                try {
                    if (this.f68059f1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    synchronized (this.f68058e1) {
                        this.f68059f1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C13198e());
                    c0766k.mo1743t7(1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (m74321rM()) {
            return;
        }
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SwitchAccountView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 2212) {
            m74307CM(i12);
        } else {
            super.onActivityResult(i11, i12, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_change_phone) {
                this.f72421L0.removeDialog(4);
                m74332a7();
                AbstractC23647d.m123897g("199719");
            } else if (id2 == AbstractC6918a0.btn_close) {
                this.f72421L0.removeDialog(4);
                AbstractC23647d.m123897g("199720");
            } else if (id2 == AbstractC6918a0.see_more) {
                this.f72421L0.removeDialog(4);
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
                ZaloWebView.m87105iS(this.f72421L0.m92676n2(), AbstractC23306f.m120583H().m110204g().f110080o, bundle);
                AbstractC23647d.m123897g("199718");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("36011");
            if (m74321rM()) {
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f68050W0.m87413s();
        try {
            String m3299O1 = AbstractC0924m0.m3299O1();
            if (!TextUtils.isEmpty(m3299O1) && !m3299O1.equals(AbstractC23309i.m121704a5())) {
                AbstractC23309i.m122587xp(m3299O1);
                AbstractC20887g.m109229g(125030, 125036, m3299O1);
            }
            AbstractC0924m0.m3287Ni("");
        } catch (Exception unused) {
        }
    }

    /* renamed from: qM */
    public void m74333qM(List list) {
        try {
            if (!TextUtils.isEmpty(this.f68048U0)) {
                if (CoreUtility.f89233i.equals(this.f68048U0)) {
                    this.f68048U0 = null;
                    return;
                }
                synchronized (this.f68061h1) {
                    try {
                        if (this.f68060g1) {
                            this.f68048U0 = null;
                            return;
                        }
                        String str = this.f68048U0;
                        this.f68048U0 = null;
                        Bundle m92642L3 = this.f72421L0.m92642L3();
                        if (m92642L3.containsKey("EXTRA_SHORTCUT_SWITCH_ACCOUNT_UID")) {
                            m92642L3.putString("EXTRA_SHORTCUT_SWITCH_ACCOUNT_UID", "");
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ContactProfile contactProfile = (ContactProfile) it.next();
                            if (str.equals(contactProfile.f42434r)) {
                                if (this.f68044Q0.m74358M() != null) {
                                    this.f68044Q0.m74358M().mo74338b(contactProfile);
                                    return;
                                }
                                return;
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m74334uM(View view) {
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_hint_switch_account);
        this.f68045R0 = robotoTextView;
        robotoTextView.setText(AbstractC8020f0.str_hint_switch_account_1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.recycle_view);
        this.f68043P0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(m92648SI()));
        C13201h c13201h = new C13201h(new C13194a());
        this.f68044Q0 = c13201h;
        this.f68043P0.setAdapter(c13201h);
        if (AbstractC23179p8.m119421g()) {
            m74329DM();
        } else {
            ArrayList arrayList = new ArrayList();
            AbstractC23304d.f113368c0.f42362N1 = AbstractC23304d.f113410m0;
            arrayList.add(AbstractC23304d.f113368c0);
            arrayList.add(new ContactProfile("-1"));
            this.f68044Q0.m74361P(arrayList);
            AbstractC0837p0.m2225f().mo2040a(new RunnableC13240q0(this));
        }
        m74331HM(true, false);
    }
}
