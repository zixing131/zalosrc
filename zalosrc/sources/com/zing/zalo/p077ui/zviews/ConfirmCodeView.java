package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2351i;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import bi0.AbstractC2814h;
import ck.C3560a;
import com.androidquery.util.RecyclingImageView;
import com.google.android.gms.common.api.Status;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.ConfirmDialogView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ConfirmCodeView;
import com.zing.zalo.receiver.SMSReceiver;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zotp.VerifyByAnotherDeviceView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23161o1;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23225u;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p135em.C18489c;
import p207he.AbstractC20019m;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22882g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p472r4.AbstractC25644a;
import p542ub.InterfaceC27218a;
import y60.C30801c;

/* loaded from: classes6.dex */
public class ConfirmCodeView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: A1 */
    CountDownTimer f72927A1;

    /* renamed from: F1 */
    ConfirmDialogView f72932F1;

    /* renamed from: M0 */
    Button f72935M0;

    /* renamed from: N0 */
    TextView f72936N0;

    /* renamed from: O0 */
    EditText f72937O0;

    /* renamed from: P0 */
    TextView f72938P0;

    /* renamed from: Q0 */
    String f72939Q0;

    /* renamed from: R0 */
    SMSReceiver f72940R0;

    /* renamed from: V0 */
    C30801c[] f72944V0;

    /* renamed from: a1 */
    int f72949a1;

    /* renamed from: b1 */
    String f72950b1;

    /* renamed from: c1 */
    String f72951c1;

    /* renamed from: d1 */
    int f72952d1;

    /* renamed from: e1 */
    int f72953e1;

    /* renamed from: g1 */
    TextView f72955g1;

    /* renamed from: h1 */
    TextView f72956h1;

    /* renamed from: j1 */
    RecyclingImageView f72958j1;

    /* renamed from: k1 */
    String f72959k1;

    /* renamed from: o1 */
    int f72963o1;

    /* renamed from: p1 */
    RobotoTextView f72964p1;

    /* renamed from: s1 */
    private BroadcastReceiver f72967s1;

    /* renamed from: t1 */
    TextView[] f72968t1;

    /* renamed from: S0 */
    String f72941S0 = "";

    /* renamed from: T0 */
    boolean f72942T0 = false;

    /* renamed from: U0 */
    long f72943U0 = 0;

    /* renamed from: W0 */
    boolean f72945W0 = true;

    /* renamed from: X0 */
    boolean f72946X0 = false;

    /* renamed from: Y0 */
    boolean f72947Y0 = false;

    /* renamed from: Z0 */
    boolean f72948Z0 = false;

    /* renamed from: f1 */
    boolean f72954f1 = false;

    /* renamed from: i1 */
    String f72957i1 = "";

    /* renamed from: l1 */
    boolean f72960l1 = false;

    /* renamed from: m1 */
    String f72961m1 = "";

    /* renamed from: n1 */
    int f72962n1 = 0;

    /* renamed from: q1 */
    boolean f72965q1 = false;

    /* renamed from: r1 */
    String f72966r1 = "";

    /* renamed from: u1 */
    boolean f72969u1 = false;

    /* renamed from: v1 */
    boolean f72970v1 = true;

    /* renamed from: w1 */
    boolean f72971w1 = false;

    /* renamed from: x1 */
    final Object f72972x1 = new Object();

    /* renamed from: y1 */
    boolean f72973y1 = false;

    /* renamed from: z1 */
    final Object f72974z1 = new Object();

    /* renamed from: B1 */
    String f72928B1 = "";

    /* renamed from: C1 */
    Handler f72929C1 = new Handler(Looper.getMainLooper());

    /* renamed from: D1 */
    int f72930D1 = 0;

    /* renamed from: E1 */
    Runnable f72931E1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.f9
        public /* synthetic */ RunnableC15617f9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConfirmCodeView.this.m79054FM();
        }
    };

    /* renamed from: G1 */
    boolean f72933G1 = false;

    /* renamed from: H1 */
    final Object f72934H1 = new Object();

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$a */
    /* loaded from: classes6.dex */
    public class C14184a extends AbstractC18391a {
        C14184a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ConfirmCodeView confirmCodeView;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                confirmCodeView = ConfirmCodeView.this;
                boolean z12 = true;
                if (i11 >= confirmCodeView.f72953e1) {
                    break;
                }
                C30801c[] c30801cArr = confirmCodeView.f72944V0;
                if (c30801cArr[i11] == null) {
                    c30801cArr[i11] = new C30801c();
                }
                if (i11 < editable.length()) {
                    ConfirmCodeView.this.f72968t1[i11].setText(String.valueOf(editable.charAt(i11)));
                    C30801c c30801c = ConfirmCodeView.this.f72944V0[i11];
                    if (i11 != editable.length() - 1) {
                        z12 = false;
                    }
                    c30801c.m149867a(z12);
                } else {
                    ConfirmCodeView.this.f72944V0[i11].m149867a(false);
                    ConfirmCodeView.this.f72968t1[i11].setText("");
                }
                ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                AbstractC23136l9.m118696b1(confirmCodeView2.f72968t1[i11], confirmCodeView2.f72944V0[i11]);
                i11++;
            }
            Button button = confirmCodeView.f72935M0;
            if (editable.length() >= ConfirmCodeView.this.f72953e1) {
                z11 = true;
            }
            button.setEnabled(z11);
            ConfirmCodeView.this.f72938P0.setVisibility(8);
            int length = editable.length();
            ConfirmCodeView confirmCodeView3 = ConfirmCodeView.this;
            if (length >= confirmCodeView3.f72953e1 && confirmCodeView3.f72970v1) {
                confirmCodeView3.m79094bN();
                AbstractC23647d.m123897g("38537");
            }
            ConfirmCodeView.this.f72970v1 = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$b */
    /* loaded from: classes6.dex */
    public class C14185b implements InterfaceC20094a {
        C14185b() {
        }

        /* renamed from: f */
        public /* synthetic */ void m79104f(int i11) {
            ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
            if (i11 != confirmCodeView.f72953e1) {
                confirmCodeView.f72953e1 = i11;
                confirmCodeView.m79095cN();
            }
            ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
            if (confirmCodeView2.f72952d1 != 0) {
                confirmCodeView2.f72954f1 = false;
                confirmCodeView2.m79066UM(false);
                ConfirmCodeView.this.m79093ZM();
            }
        }

        /* renamed from: g */
        public /* synthetic */ void m79105g(String str) {
            ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
            if (confirmCodeView.f72938P0 != null) {
                confirmCodeView.m79092YM(str);
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m79106h(C20096c c20096c) {
            try {
                TextView textView = ConfirmCodeView.this.f72936N0;
                if (textView != null) {
                    textView.setEnabled(true);
                }
                if (c20096c.m104491c() != 2012 && c20096c.m104491c() != 2021) {
                    if (c20096c.m104491c() == 2003) {
                        ConfirmCodeView.this.f72421L0.showDialog(3);
                        return;
                    } else {
                        ConfirmCodeView.this.m79092YM(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                        return;
                    }
                }
                ConfirmCodeView.this.f72960l1 = false;
                JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                ConfirmCodeView.this.f72952d1 = optJSONObject.optInt("activationType");
                ConfirmCodeView.this.f72953e1 = optJSONObject.optInt("activationNumber");
                ConfirmCodeView.this.f72950b1 = optJSONObject.optString("activationToken");
                AbstractC23153n4.m119105S(optJSONObject, false);
                ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                confirmCodeView.f72954f1 = true;
                CountDownTimer countDownTimer = confirmCodeView.f72927A1;
                if (countDownTimer != null) {
                    try {
                        countDownTimer.cancel();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                confirmCodeView2.m79066UM(confirmCodeView2.f72954f1);
                ConfirmCodeView.this.f72421L0.showDialog(1);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            synchronized (ConfirmCodeView.this.f72972x1) {
                ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                confirmCodeView.f72971w1 = false;
                confirmCodeView.f72421L0.mo49315c4();
            }
            if (!AbstractC23216t1.m119643h(ConfirmCodeView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.s9
                public /* synthetic */ C16123s9() {
                }

                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    ConfirmCodeView.C14185b.this.m79105g(str);
                }
            }) && ConfirmCodeView.this.f72421L0.m92676n2() != null) {
                ConfirmCodeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t9

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f82187q;

                    public /* synthetic */ RunnableC16183t9(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfirmCodeView.C14185b.this.m79106h(r2);
                    }
                });
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.r9.<init>(com.zing.zalo.ui.zviews.ConfirmCodeView$b, int):void, class status: GENERATED_AND_UNLOADED
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
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
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
        public void mo927b(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 0
                org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                java.lang.String r1 = "data"
                org.json.JSONObject r5 = r5.optJSONObject(r1)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                if (r5 == 0) goto L4c
                com.zing.zalo.ui.zviews.ConfirmCodeView r1 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                java.lang.String r2 = "activationType"
                int r2 = r5.optInt(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                r1.f72952d1 = r2     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                java.lang.String r1 = "activationNumber"
                int r1 = r5.optInt(r1)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                com.zing.zalo.ui.zviews.ConfirmCodeView r2 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                java.lang.String r3 = "activationToken"
                java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                r2.f72950b1 = r3     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                com.zing.zalo.ui.zviews.ConfirmCodeView r2 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                r2.f72960l1 = r0     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                r2 = 1
                me0.AbstractC23153n4.m119105S(r5, r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                com.zing.zalo.ui.zviews.ConfirmCodeView r5 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                com.zing.zalo.ui.zviews.BaseZaloView r5 = r5.f72421L0     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                ub.a r5 = r5.m92676n2()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                if (r5 == 0) goto L4c
                com.zing.zalo.ui.zviews.ConfirmCodeView r5 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                com.zing.zalo.ui.zviews.BaseZaloView r5 = r5.f72421L0     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                ub.a r5 = r5.m92676n2()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                com.zing.zalo.ui.zviews.r9 r2 = new com.zing.zalo.ui.zviews.r9     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                r2.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                r5.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                goto L4c
            L48:
                r5 = move-exception
                goto L75
            L4a:
                r5 = move-exception
                goto L5f
            L4c:
                com.zing.zalo.ui.zviews.ConfirmCodeView r5 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this
                java.lang.Object r5 = r5.f72972x1
                monitor-enter(r5)
                com.zing.zalo.ui.zviews.ConfirmCodeView r1 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L5c
                r1.f72971w1 = r0     // Catch: java.lang.Throwable -> L5c
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r1.f72421L0     // Catch: java.lang.Throwable -> L5c
                r0.mo49315c4()     // Catch: java.lang.Throwable -> L5c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
                goto L71
            L5c:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
                throw r0
            L5f:
                r5.printStackTrace()     // Catch: java.lang.Throwable -> L48
                com.zing.zalo.ui.zviews.ConfirmCodeView r5 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this
                java.lang.Object r5 = r5.f72972x1
                monitor-enter(r5)
                com.zing.zalo.ui.zviews.ConfirmCodeView r1 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L72
                r1.f72971w1 = r0     // Catch: java.lang.Throwable -> L72
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r1.f72421L0     // Catch: java.lang.Throwable -> L72
                r0.mo49315c4()     // Catch: java.lang.Throwable -> L72
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
            L71:
                return
            L72:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
                throw r0
            L75:
                com.zing.zalo.ui.zviews.ConfirmCodeView r1 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this
                java.lang.Object r1 = r1.f72972x1
                monitor-enter(r1)
                com.zing.zalo.ui.zviews.ConfirmCodeView r2 = com.zing.zalo.p077ui.zviews.ConfirmCodeView.this     // Catch: java.lang.Throwable -> L85
                r2.f72971w1 = r0     // Catch: java.lang.Throwable -> L85
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r2.f72421L0     // Catch: java.lang.Throwable -> L85
                r0.mo49315c4()     // Catch: java.lang.Throwable -> L85
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
                throw r5
            L85:
                r5 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.ConfirmCodeView.C14185b.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$c */
    /* loaded from: classes6.dex */
    public class C14186c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f72977a;

        C14186c(long j11) {
            this.f72977a = j11;
        }

        /* renamed from: g */
        public /* synthetic */ void m79111g() {
            ConfirmCodeView confirmCodeView;
            int i11;
            try {
                ConfirmCodeView.this.f72937O0.setEnabled(false);
                ConfirmCodeView.this.f72970v1 = false;
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                while (true) {
                    confirmCodeView = ConfirmCodeView.this;
                    if (i12 >= confirmCodeView.f72953e1) {
                        break;
                    }
                    sb2.append("*");
                    i12++;
                }
                confirmCodeView.f72937O0.setText(sb2.toString());
                CountDownTimer countDownTimer = ConfirmCodeView.this.f72927A1;
                if (countDownTimer != null) {
                    try {
                        countDownTimer.cancel();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                Button button = ConfirmCodeView.this.f72935M0;
                if (button != null) {
                    button.setEnabled(false);
                }
                ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                TextView textView = confirmCodeView2.f72936N0;
                if (textView != null) {
                    if (confirmCodeView2.f72954f1) {
                        i11 = AbstractC8020f0.btn_manual_otp_sms;
                    } else {
                        i11 = AbstractC8020f0.str_text_resend_activation_code;
                    }
                    textView.setText(AbstractC23136l9.m118743r0(i11));
                    ConfirmCodeView.this.f72936N0.setEnabled(false);
                }
                ConfirmCodeView.this.m79090WM(false);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m79112h(String str) {
            int i11;
            ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
            if (confirmCodeView.f72938P0 != null) {
                confirmCodeView.m79092YM(str);
            }
            CountDownTimer countDownTimer = ConfirmCodeView.this.f72927A1;
            if (countDownTimer != null) {
                try {
                    countDownTimer.cancel();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            EditText editText = ConfirmCodeView.this.f72937O0;
            if (editText != null) {
                editText.setText("");
            }
            ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
            TextView textView = confirmCodeView2.f72936N0;
            if (textView != null) {
                if (confirmCodeView2.f72954f1) {
                    i11 = AbstractC8020f0.btn_manual_otp_sms;
                } else {
                    i11 = AbstractC8020f0.str_text_resend_activation_code;
                }
                textView.setText(AbstractC23136l9.m118743r0(i11));
                ConfirmCodeView.this.f72936N0.setEnabled(true);
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m79113i() {
            int i11;
            try {
                CountDownTimer countDownTimer = ConfirmCodeView.this.f72927A1;
                if (countDownTimer != null) {
                    try {
                        countDownTimer.cancel();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                EditText editText = ConfirmCodeView.this.f72937O0;
                if (editText != null) {
                    editText.setText("");
                }
                ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                TextView textView = confirmCodeView.f72936N0;
                if (textView != null) {
                    if (confirmCodeView.f72954f1) {
                        i11 = AbstractC8020f0.btn_manual_otp_sms;
                    } else {
                        i11 = AbstractC8020f0.str_text_resend_activation_code;
                    }
                    textView.setText(AbstractC23136l9.m118743r0(i11));
                    ConfirmCodeView.this.f72936N0.setEnabled(true);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m79114j(C20096c c20096c) {
            int i11;
            String str = "";
            try {
                AbstractC2364o0.m12370m(ConfirmCodeView.this.f72937O0, 200L);
                CountDownTimer countDownTimer = ConfirmCodeView.this.f72927A1;
                if (countDownTimer != null) {
                    try {
                        countDownTimer.cancel();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                ConfirmCodeView.this.f72937O0.setText("");
                ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                TextView textView = confirmCodeView.f72936N0;
                if (textView != null) {
                    if (confirmCodeView.f72954f1) {
                        i11 = AbstractC8020f0.btn_manual_otp_sms;
                    } else {
                        i11 = AbstractC8020f0.str_text_resend_activation_code;
                    }
                    textView.setText(AbstractC23136l9.m118743r0(i11));
                    ConfirmCodeView.this.f72936N0.setEnabled(true);
                }
                if (c20096c != null) {
                    if (c20096c.m104491c() == 2030) {
                        ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                        if (!TextUtils.isEmpty(c20096c.m104492d())) {
                            str = c20096c.m104492d();
                        }
                        confirmCodeView2.f72941S0 = str;
                        ConfirmCodeView.this.f72421L0.showDialog(2);
                        return;
                    }
                    if (c20096c.m104491c() == 2020) {
                        JSONObject jSONObject = new JSONObject(c20096c.m104490b()).getJSONObject("data");
                        if (jSONObject != null && !jSONObject.isNull("hasMsg") && jSONObject.getInt("hasMsg") == 1) {
                            C3560a c3560a = new C3560a();
                            c3560a.m18091e(1);
                            c3560a.m18090d(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_ban_dialog));
                            c3560a.m18089c(jSONObject.getString("message"));
                            ConfirmCodeView.this.m79091XM(c3560a);
                            return;
                        }
                        return;
                    }
                    if (c20096c.m104491c() == 2053) {
                        ConfirmCodeView confirmCodeView3 = ConfirmCodeView.this;
                        confirmCodeView3.f72960l1 = true;
                        confirmCodeView3.f72421L0.showDialog(4);
                    } else {
                        if (c20096c.m104491c() == 2042) {
                            ConfirmCodeView.this.m79092YM(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_account_creation_limit), Integer.valueOf(c20096c.m104491c())));
                            return;
                        }
                        if (c20096c.m104491c() == 2051) {
                            ConfirmCodeView.this.m79092YM(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pwd_token_expired), Integer.valueOf(c20096c.m104491c())));
                        } else if (c20096c.m104491c() == 2052) {
                            ConfirmCodeView.this.m79092YM(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_quota_question), Integer.valueOf(c20096c.m104491c())));
                        } else {
                            ConfirmCodeView.this.m79092YM(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            boolean z12;
            boolean z13 = true;
            try {
            } catch (Exception e11) {
                e = e11;
                z11 = true;
            } catch (Throwable th2) {
                th = th2;
            }
            if (AbstractC23216t1.m119643h(ConfirmCodeView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.u9
                public /* synthetic */ C16220u9() {
                }

                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    ConfirmCodeView.C14186c.this.m79112h(str);
                }
            })) {
                synchronized (ConfirmCodeView.this.f72974z1) {
                    ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                    confirmCodeView.f72973y1 = false;
                    confirmCodeView.f72421L0.mo49315c4();
                }
                return;
            }
            ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
            confirmCodeView2.f72930D1++;
            if (c20096c != null) {
                if (!confirmCodeView2.f72421L0.m92672lJ() || TextUtils.isEmpty(c20096c.m104490b()) || (c20096c.m104491c() != 2036 && c20096c.m104491c() != 2033 && c20096c.m104491c() != 2048)) {
                    if (c20096c.m104491c() == 2038) {
                        ConfirmCodeView confirmCodeView3 = ConfirmCodeView.this;
                        if (confirmCodeView3.f72930D1 < 4) {
                            Handler handler = confirmCodeView3.f72929C1;
                            if (handler != null) {
                                try {
                                    handler.removeCallbacks(confirmCodeView3.f72931E1);
                                    ConfirmCodeView confirmCodeView4 = ConfirmCodeView.this;
                                    confirmCodeView4.f72929C1.postDelayed(confirmCodeView4.f72931E1, AbstractC23304d.f113391h1);
                                    z12 = false;
                                    synchronized (ConfirmCodeView.this.f72974z1) {
                                        try {
                                            ConfirmCodeView confirmCodeView5 = ConfirmCodeView.this;
                                            confirmCodeView5.f72973y1 = false;
                                            if (z12) {
                                                confirmCodeView5.f72421L0.mo49315c4();
                                            }
                                        } finally {
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    z11 = false;
                                    try {
                                        e.printStackTrace();
                                        synchronized (ConfirmCodeView.this.f72974z1) {
                                            try {
                                                ConfirmCodeView confirmCodeView6 = ConfirmCodeView.this;
                                                confirmCodeView6.f72973y1 = false;
                                                if (z11) {
                                                    confirmCodeView6.f72421L0.mo49315c4();
                                                }
                                            } finally {
                                            }
                                        }
                                        if (ConfirmCodeView.this.f72421L0.m92672lJ()) {
                                            C18489c.m97852r(true);
                                        }
                                        AbstractC23126l.m118627a("Active Code failed");
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z13 = z11;
                                        synchronized (ConfirmCodeView.this.f72974z1) {
                                            try {
                                                ConfirmCodeView confirmCodeView7 = ConfirmCodeView.this;
                                                confirmCodeView7.f72973y1 = false;
                                                if (z13) {
                                                    confirmCodeView7.f72421L0.mo49315c4();
                                                }
                                            } finally {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z13 = false;
                                    synchronized (ConfirmCodeView.this.f72974z1) {
                                    }
                                }
                                if (ConfirmCodeView.this.f72421L0.m92672lJ() && c20096c != null && c20096c.m104491c() != 50001) {
                                    C18489c.m97852r(true);
                                }
                                AbstractC23126l.m118627a("Active Code failed");
                                return;
                            }
                        }
                    }
                    if (ConfirmCodeView.this.f72421L0.m92676n2() != null) {
                        ConfirmCodeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.w9

                            /* renamed from: q */
                            public final /* synthetic */ C20096c f82498q;

                            public /* synthetic */ RunnableC16294w9(C20096c c20096c2) {
                                r2 = c20096c2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ConfirmCodeView.C14186c.this.m79114j(r2);
                            }
                        });
                    }
                }
                ConfirmCodeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.v9
                    public /* synthetic */ RunnableC16257v9() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfirmCodeView.C14186c.this.m79113i();
                    }
                });
                if (c20096c2.m104491c() != 2036 && c20096c2.m104491c() != 2033) {
                    if (c20096c2.m104491c() == 2048) {
                        JSONObject optJSONObject = new JSONObject(c20096c2.m104490b()).optJSONObject("data");
                        ConfirmCodeView.this.f72961m1 = optJSONObject.optString("pwd_token", "");
                        AbstractC23153n4.m119155v(ConfirmCodeView.this.m92676n2(), optJSONObject, 999);
                    }
                    synchronized (ConfirmCodeView.this.f72974z1) {
                        ConfirmCodeView confirmCodeView8 = ConfirmCodeView.this;
                        confirmCodeView8.f72973y1 = false;
                        confirmCodeView8.f72421L0.mo49315c4();
                    }
                    return;
                }
                JSONObject optJSONObject2 = new JSONObject(c20096c2.m104490b()).optJSONObject("data");
                ConfirmCodeView.this.f72961m1 = optJSONObject2.optString("pwd_token", "");
                AbstractC23153n4.m119157w(ConfirmCodeView.this.m92676n2(), optJSONObject2, 1001, AbstractC23304d.f113398j0, ConfirmCodeView.this.f72961m1);
                synchronized (ConfirmCodeView.this.f72974z1) {
                }
            }
            z12 = true;
            synchronized (ConfirmCodeView.this.f72974z1) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            boolean z11;
            boolean z12;
            try {
                try {
                    ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                    if (confirmCodeView.f72952d1 == 1 && confirmCodeView.f72421L0.m92676n2() != null) {
                        ConfirmCodeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.x9
                            public /* synthetic */ RunnableC16331x9() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ConfirmCodeView.C14186c.this.m79111g();
                            }
                        });
                        AbstractC23304d.f113289J.clear();
                    }
                    InterfaceC27218a m92676n2 = ConfirmCodeView.this.m92676n2();
                    String str = AbstractC23304d.f113398j0;
                    long j11 = this.f72977a;
                    ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                    if (confirmCodeView2.f72962n1 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i11 = confirmCodeView2.f72963o1;
                    if (!confirmCodeView2.f72947Y0 && !confirmCodeView2.f72948Z0) {
                        z12 = false;
                        AbstractC23153n4.m119161y(m92676n2, obj, str, j11, z11, i11, false, z12);
                        AbstractC23647d.m123897g("38539");
                        synchronized (ConfirmCodeView.this.f72974z1) {
                            ConfirmCodeView confirmCodeView3 = ConfirmCodeView.this;
                            confirmCodeView3.f72973y1 = false;
                            confirmCodeView3.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    z12 = true;
                    AbstractC23153n4.m119161y(m92676n2, obj, str, j11, z11, i11, false, z12);
                    AbstractC23647d.m123897g("38539");
                    synchronized (ConfirmCodeView.this.f72974z1) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (ConfirmCodeView.this.f72974z1) {
                        ConfirmCodeView confirmCodeView4 = ConfirmCodeView.this;
                        confirmCodeView4.f72973y1 = false;
                        confirmCodeView4.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (ConfirmCodeView.this.f72974z1) {
                    ConfirmCodeView confirmCodeView5 = ConfirmCodeView.this;
                    confirmCodeView5.f72973y1 = false;
                    confirmCodeView5.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$d */
    /* loaded from: classes6.dex */
    public class CountDownTimerC14187d extends CountDownTimer {
        CountDownTimerC14187d(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            int i11;
            try {
                ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                TextView textView = confirmCodeView.f72936N0;
                if (textView != null) {
                    if (confirmCodeView.f72954f1) {
                        i11 = AbstractC8020f0.btn_manual_otp_sms;
                    } else {
                        i11 = AbstractC8020f0.str_text_resend_activation_code;
                    }
                    textView.setText(AbstractC23136l9.m118743r0(i11));
                    ConfirmCodeView.this.f72936N0.setEnabled(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            try {
                int i11 = (int) (j11 / 1000);
                if (ConfirmCodeView.this.f72936N0 != null) {
                    SpannableString spannableString = new SpannableString(String.format(ConfirmCodeView.this.m92652XI(AbstractC8020f0.str_btn_retry_code), Integer.valueOf(i11 / 60), Integer.valueOf(i11)));
                    spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118641B(ConfirmCodeView.this.f72936N0.getContext(), AbstractC16801x.cAccent1)), spannableString.length() - 5, spannableString.length(), 33);
                    ConfirmCodeView.this.f72936N0.setText(spannableString);
                    ConfirmCodeView.this.f72936N0.setEnabled(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$e */
    /* loaded from: classes6.dex */
    public class RunnableC14188e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f72980p;

        RunnableC14188e(String str) {
            this.f72980p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_URL", this.f72980p);
            ConfirmCodeView.this.m92676n2().mo35573l4(WebInAppView.class, bundle, 1, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$f */
    /* loaded from: classes6.dex */
    public class C14189f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f72982a;

        C14189f(long j11) {
            this.f72982a = j11;
        }

        /* renamed from: d */
        public /* synthetic */ void m79116d(C20096c c20096c) {
            if (c20096c != null) {
                String str = "";
                if (c20096c.m104491c() == 2030) {
                    ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                    if (!TextUtils.isEmpty(c20096c.m104492d())) {
                        str = c20096c.m104492d();
                    }
                    confirmCodeView.f72941S0 = str;
                    ConfirmCodeView.this.f72421L0.showDialog(2);
                    return;
                }
                if (c20096c.m104491c() == 2051) {
                    ConfirmCodeView.this.m79092YM(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pwd_token_expired), Integer.valueOf(c20096c.m104491c())));
                } else if (c20096c.m104491c() == 2052) {
                    ConfirmCodeView.this.m79092YM(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_quota_question), Integer.valueOf(c20096c.m104491c())));
                } else {
                    ConfirmCodeView.this.m79092YM(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (ConfirmCodeView.this.f72421L0.m92672lJ()) {
                        if (c20096c.m104491c() != 2036) {
                            if (c20096c.m104491c() == 2033) {
                            }
                        }
                        if (!TextUtils.isEmpty(c20096c.m104490b())) {
                            AbstractC23153n4.m119157w(ConfirmCodeView.this.m92676n2(), new JSONObject(c20096c.m104490b()).getJSONObject("data"), 1001, AbstractC23304d.f113398j0, ConfirmCodeView.this.f72961m1);
                            synchronized (ConfirmCodeView.this.f72934H1) {
                                ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
                                confirmCodeView.f72933G1 = false;
                                confirmCodeView.f72421L0.mo49315c4();
                            }
                            return;
                        }
                    }
                    if (ConfirmCodeView.this.f72421L0.m92672lJ() && c20096c.m104491c() == 2048) {
                        AbstractC23153n4.m119155v(ConfirmCodeView.this.m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 999);
                        synchronized (ConfirmCodeView.this.f72934H1) {
                            ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                            confirmCodeView2.f72933G1 = false;
                            confirmCodeView2.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    if (ConfirmCodeView.this.f72421L0.m92672lJ() && c20096c.m104491c() != 50001) {
                        C18489c.m97852r(true);
                    }
                    if (ConfirmCodeView.this.f72421L0.m92676n2() != null) {
                        ConfirmCodeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.y9

                            /* renamed from: q */
                            public final /* synthetic */ C20096c f82724q;

                            public /* synthetic */ RunnableC16368y9(C20096c c20096c2) {
                                r2 = c20096c2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ConfirmCodeView.C14189f.this.m79116d(r2);
                            }
                        });
                    }
                    synchronized (ConfirmCodeView.this.f72934H1) {
                        ConfirmCodeView confirmCodeView3 = ConfirmCodeView.this;
                        confirmCodeView3.f72933G1 = false;
                        confirmCodeView3.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("CommonZaloview", e11);
                    synchronized (ConfirmCodeView.this.f72934H1) {
                        ConfirmCodeView confirmCodeView4 = ConfirmCodeView.this;
                        confirmCodeView4.f72933G1 = false;
                        confirmCodeView4.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (ConfirmCodeView.this.f72934H1) {
                    ConfirmCodeView confirmCodeView5 = ConfirmCodeView.this;
                    confirmCodeView5.f72933G1 = false;
                    confirmCodeView5.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            boolean z12;
            InterfaceC27218a m92676n2 = ConfirmCodeView.this.m92676n2();
            String str = AbstractC23304d.f113398j0;
            long j11 = this.f72982a;
            ConfirmCodeView confirmCodeView = ConfirmCodeView.this;
            if (confirmCodeView.f72962n1 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = confirmCodeView.f72963o1;
            if (!confirmCodeView.f72947Y0 && !confirmCodeView.f72948Z0) {
                z12 = false;
            } else {
                z12 = true;
            }
            AbstractC23153n4.m119161y(m92676n2, obj, str, j11, z11, i11, false, z12);
            synchronized (ConfirmCodeView.this.f72934H1) {
                ConfirmCodeView confirmCodeView2 = ConfirmCodeView.this;
                confirmCodeView2.f72933G1 = false;
                confirmCodeView2.f72421L0.mo49315c4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmCodeView$g */
    /* loaded from: classes6.dex */
    public class C14190g extends BroadcastReceiver {
        C14190g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m19220F() == 0) {
                    try {
                        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        if (!TextUtils.isEmpty(str)) {
                            Matcher matcher = Pattern.compile("([0-9]{4,8})").matcher(str);
                            if (matcher.find()) {
                                ConfirmCodeView.this.f72937O0.setText(matcher.group(0).trim());
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m79049AM(View view) {
        showDialog(5);
    }

    /* renamed from: BM */
    public /* synthetic */ void m79050BM(View view) {
        m79094bN();
        AbstractC23647d.m123897g("38538");
    }

    /* renamed from: CM */
    public /* synthetic */ void m79051CM(View view) {
        m79088TM();
        AbstractC23647d.m123897g("38534");
    }

    /* renamed from: EM */
    public /* synthetic */ boolean m79053EM(Message message) {
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 == 2) {
                try {
                    m79099yM((String) message.obj, MainApplication.getAppContext());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            try {
                if (!TextUtils.isEmpty((String) message.obj)) {
                    this.f72970v1 = false;
                    this.f72937O0.setText((String) message.obj);
                    this.f72929C1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.h9

                        /* renamed from: q */
                        public final /* synthetic */ String f80563q;

                        public /* synthetic */ RunnableC15691h9(String str) {
                            r2 = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ConfirmCodeView.this.m79052DM(r2);
                        }
                    });
                    return true;
                }
                return true;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: FM */
    public /* synthetic */ void m79054FM() {
        m79052DM(this.f72928B1);
    }

    /* renamed from: GM */
    public /* synthetic */ void m79055GM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        mo50035CK(-1, null);
        VerifyByAnotherDeviceView.f88639a1 = true;
        finish();
    }

    /* renamed from: HM */
    public /* synthetic */ void m79056HM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m79088TM();
        AbstractC23647d.m123897g("38534");
    }

    /* renamed from: JM */
    public /* synthetic */ void m79058JM() {
        this.f72937O0.getText().clear();
        this.f72938P0.setVisibility(8);
    }

    /* renamed from: KM */
    public /* synthetic */ void m79059KM(InterfaceC17463d interfaceC17463d, int i11) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.g9
            public /* synthetic */ RunnableC15654g9() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ConfirmCodeView.this.m79058JM();
            }
        });
        interfaceC17463d.dismiss();
        this.f72965q1 = false;
        m79098xM();
    }

    /* renamed from: LM */
    public static /* synthetic */ void m79060LM(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23647d.m123907q("19308", "");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123893c();
        AbstractC23647d.m123897g("38536");
    }

    /* renamed from: MM */
    public /* synthetic */ void m79061MM(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23647d.m123907q("19307", "");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m79089VM();
        AbstractC23647d.m123893c();
        AbstractC23647d.m123897g("38535");
    }

    /* renamed from: NM */
    public /* synthetic */ void m79062NM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
    }

    /* renamed from: OM */
    public /* synthetic */ void m79063OM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m79087SM();
        AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
    }

    /* renamed from: PM */
    public /* synthetic */ void m79064PM(Void r42) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        AbstractC2351i.m12327a(MainApplication.getAppContext(), this.f72967s1, intentFilter, true);
    }

    /* renamed from: QM */
    public /* synthetic */ void m79065QM(View view) {
        AbstractC2379w.m12432f(this.f72937O0);
        AbstractC23647d.m123897g("38533");
    }

    /* renamed from: UM */
    public void m79066UM(boolean z11) {
        int i11;
        int i12 = 0;
        try {
            if (z11) {
                this.f72958j1.setImageResource(AbstractC16803z.graphic_onboard_sms);
                this.f72955g1.setText(this.f72959k1);
                this.f72956h1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_confirm_code_manual_sms));
                this.f72945W0 = false;
            } else {
                int i13 = this.f72952d1;
                String str = "";
                if (i13 != 1 && i13 != 2) {
                    if (i13 == 3) {
                        this.f72958j1.setImageResource(AbstractC16803z.graphic_onboard_sms);
                        TextView textView = this.f72955g1;
                        String m92652XI = m92652XI(AbstractC8020f0.str_title_confirm_code_sms);
                        Object[] objArr = new Object[1];
                        StringBuilder sb2 = new StringBuilder();
                        if (this.f72969u1) {
                            str = "\n";
                        }
                        sb2.append(str);
                        sb2.append(this.f72959k1);
                        objArr[0] = sb2.toString();
                        textView.setText(String.format(m92652XI, objArr));
                        this.f72956h1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_confirm_code_sms));
                        this.f72945W0 = false;
                    } else if (i13 == 4) {
                        this.f72958j1.setImageResource(AbstractC16803z.graphic_onboard_sms);
                        this.f72955g1.setText(this.f72959k1);
                        if (TextUtils.isEmpty(this.f72966r1)) {
                            this.f72956h1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_confirm_code_sms));
                        } else {
                            this.f72956h1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_confirm_code_z_otp_description, this.f72966r1));
                        }
                        this.f72945W0 = false;
                    } else {
                        this.f72958j1.setImageResource(AbstractC16803z.graphic_onboard_sms);
                        TextView textView2 = this.f72955g1;
                        String m92652XI2 = m92652XI(AbstractC8020f0.str_title_confirm_code_sms);
                        Object[] objArr2 = new Object[1];
                        StringBuilder sb3 = new StringBuilder();
                        if (this.f72969u1) {
                            str = "\n";
                        }
                        sb3.append(str);
                        sb3.append(this.f72959k1);
                        objArr2[0] = sb3.toString();
                        textView2.setText(String.format(m92652XI2, objArr2));
                        this.f72956h1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_confirm_code_sms));
                        this.f72945W0 = false;
                    }
                } else {
                    this.f72958j1.setImageResource(AbstractC16803z.graphic_onboard_incoming);
                    TextView textView3 = this.f72955g1;
                    String m92652XI3 = m92652XI(AbstractC8020f0.str_title_confirm_code_incoming);
                    Object[] objArr3 = new Object[1];
                    StringBuilder sb4 = new StringBuilder();
                    if (this.f72969u1) {
                        str = "\n";
                    }
                    sb4.append(str);
                    sb4.append(this.f72959k1);
                    objArr3[0] = sb4.toString();
                    textView3.setText(String.format(m92652XI3, objArr3));
                    this.f72956h1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_confirm_code_incoming));
                    this.f72945W0 = true;
                }
            }
            RobotoTextView robotoTextView = this.f72964p1;
            if (this.f72952d1 != 4) {
                i12 = 8;
            }
            robotoTextView.setVisibility(i12);
            TextView textView4 = this.f72936N0;
            if (z11) {
                i11 = AbstractC8020f0.btn_manual_otp_sms;
            } else {
                i11 = AbstractC8020f0.str_text_resend_activation_code;
            }
            textView4.setText(AbstractC23136l9.m118743r0(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aN */
    private void m79067aN() {
        this.f72967s1 = new C14190g();
        AbstractC22888j mo132539w = AbstractC25644a.m132538a(MainApplication.getAppContext()).mo132539w();
        mo132539w.mo117578g(new InterfaceC22882g() { // from class: com.zing.zalo.ui.zviews.p9
            public /* synthetic */ C16011p9() {
            }

            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj) {
                ConfirmCodeView.this.m79064PM((Void) obj);
            }
        });
        mo132539w.mo117576e(new C16048q9());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f72954f1 = m92642L3.getBoolean("isManualSms", false);
            String str = "";
            this.f72950b1 = m92642L3.getString("activationToken", "");
            this.f72951c1 = m92642L3.getString("sessionToken", "");
            this.f72952d1 = m92642L3.getInt("activationType");
            int i11 = m92642L3.getInt("activationNumber");
            this.f72953e1 = i11;
            this.f72953e1 = Math.max(4, Math.min(8, i11));
            this.f72965q1 = m92642L3.getBoolean("EXTRA_USER_HAVING_DEVICE", false);
            this.f72966r1 = m92642L3.getString("EXTRA_DEVICE_NAME", "");
            this.f72962n1 = m92642L3.getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f72963o1 = m92642L3.getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
            int i12 = m92642L3.getInt("EXTRA_SRC_TYPE", 0);
            this.f72949a1 = i12;
            boolean z12 = true;
            if (i12 == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f72946X0 = z11;
            if (i12 != 2) {
                z12 = false;
            }
            this.f72947Y0 = z12;
            this.f72948Z0 = m92642L3.getBoolean("isRenewAcc", false);
            this.f72957i1 = m92642L3.getString("phone_number", "");
            if (m92642L3.containsKey("EXTRA_FROM_USERNAME")) {
                str = m92642L3.getString("EXTRA_FROM_USERNAME");
            }
            if (!TextUtils.isEmpty(str)) {
                this.f72959k1 = str;
            }
            if (!TextUtils.isEmpty(this.f72957i1)) {
                AbstractC23304d.f113398j0 = this.f72957i1;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String str;
        String str2;
        String m118743r0;
        if (this.f72421L0.m92681pJ()) {
            return null;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        String m118282h = AbstractC23056e6.m118282h(this.f72957i1, AbstractC23309i.m121704a5().toUpperCase(), true);
                        try {
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(m118282h)) {
                            if (m118282h.equals(AbstractC23056e6.f112062a)) {
                            }
                            return new C16972e0.a(m92689tK()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m90949z(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral).m90934k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.n9
                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                    interfaceC17463d.dismiss();
                                }
                            }).m90945v(AbstractC2814h.ButtonMedium_Tertiary).m90943t(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.o9
                                public /* synthetic */ C15974o9() {
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                    ConfirmCodeView.this.m79059KM(interfaceC17463d, i12);
                                }
                            }).m90927d();
                        }
                        m118282h = this.f72957i1;
                        return new C16972e0.a(m92689tK()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m90949z(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral).m90934k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.n9
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                interfaceC17463d.dismiss();
                            }
                        }).m90945v(AbstractC2814h.ButtonMedium_Tertiary).m90943t(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.o9
                            public /* synthetic */ C15974o9() {
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                ConfirmCodeView.this.m79059KM(interfaceC17463d, i12);
                            }
                        }).m90927d();
                    }
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_general)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_expired_token)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.m9
                        public /* synthetic */ C15881m9() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            ConfirmCodeView.this.m79056HM(interfaceC17463d, i12);
                        }
                    });
                    return aVar.m43152a();
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_general)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_expired_session)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.back), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.l9
                    public /* synthetic */ C15844l9() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ConfirmCodeView.this.m79055GM(interfaceC17463d, i12);
                    }
                });
                return aVar2.m43152a();
            }
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlgUpdate)).m43162k(this.f72941S0).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close_app), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.j9
                public /* synthetic */ C15764j9() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ConfirmCodeView.this.m79062NM(interfaceC17463d, i12);
                }
            }).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlgUpdate), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.k9
                public /* synthetic */ C15807k9() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ConfirmCodeView.this.m79063OM(interfaceC17463d, i12);
                }
            });
            C8009j m43152a = aVar3.m43152a();
            m43152a.m92873y(false);
            return m43152a;
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        if (AbstractC23309i.m121704a5().equals("VN")) {
            if (TextUtils.isEmpty(AbstractC23304d.f113454x0)) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hintSendSmsToGetActiveCode);
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(AbstractC23304d.f113446v0)) {
                    m118743r0 = AbstractC23304d.f113446v0;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_phoneSendSMSActive);
                }
                objArr[0] = m118743r0;
                str = String.format(m118743r02, objArr);
            } else {
                str = AbstractC23304d.f113454x0;
            }
            if (TextUtils.isEmpty(AbstractC23304d.f113450w0)) {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2);
            } else {
                str2 = AbstractC23304d.f113450w0;
            }
            aVar4.m43173v(3).m43172u(str2).m43162k(str).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.y8
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ConfirmCodeView.m79060LM(interfaceC17463d, i12);
                }
            }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_send_sms_otp), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.i9
                public /* synthetic */ C15728i9() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ConfirmCodeView.this.m79061MM(interfaceC17463d, i12);
                }
            });
        } else {
            aVar4.m43173v(3).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_not_vn)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.EXCEED_SMS_TIMES_MSG)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
        }
        return aVar4.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.confirm_code_view, viewGroup, false);
        try {
            this.f72421L0.m92676n2().mo35554O(16);
            m79100zM(inflate);
            AbstractC23647d.m123897g("38530");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            if (this.f72967s1 != null) {
                MainApplication.getAppContext().unregisterReceiver(this.f72967s1);
            }
        } catch (Exception unused) {
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m79086RM();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        try {
            this.f72421L0.m92648SI().unregisterReceiver(this.f72940R0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo13886RJ();
    }

    /* renamed from: RM */
    public void m79086RM() {
        Handler handler = this.f72929C1;
        if (handler != null) {
            handler.removeCallbacks(this.f72931E1);
        }
        EditText editText = this.f72937O0;
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
        AbstractC23647d.m123897g("38531");
        TextView textView = this.f72936N0;
        if (textView != null && !textView.getText().toString().equals(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_resend_activation_code))) {
            AbstractC23647d.m123897g("38532");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            try {
                bundle.putString("onSave", AbstractC23304d.f113398j0);
                bundle.putBoolean("stopHandleIncomingCall", this.f72942T0);
                bundle.putStringArrayList("listCallNum", AbstractC23304d.f113289J);
                bundle.putInt("countDownTimeOtp", (int) AbstractC23304d.f113395i1);
                bundle.putInt("iTimeDelayRequestActiveByRejectCall", AbstractC23304d.f113391h1);
                bundle.putInt("src_type", this.f72949a1);
                bundle.putBoolean("isRenewAcc", this.f72948Z0);
                bundle.putString("zalo_phoneNumber", AbstractC23304d.f113438t0);
                bundle.putString("phoneNumberE164Server", AbstractC23304d.f113442u0);
                bundle.putString("sms_gateWay", AbstractC23304d.f113446v0);
                bundle.putString("sms_format", AbstractC23304d.f113458y0);
                bundle.putString("sms_content_hint", AbstractC23304d.f113454x0);
                bundle.putString("titlePopup", AbstractC23304d.f113450w0);
                bundle.putString("phoneNumE164", this.f72959k1);
                bundle.putBoolean("isManualSms", this.f72954f1);
                bundle.putInt("activationType", this.f72952d1);
                bundle.putInt("activationNumber", this.f72953e1);
                bundle.putString("pwd_token", this.f72961m1);
                bundle.putInt("srcSwitchAccount", this.f72962n1);
                bundle.putInt("source_switch", this.f72963o1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: SM */
    void m79087SM() {
        try {
            ZaloWebView.m87103hS(this.f72421L0.m92676n2(), String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ratezalo_url), this.f72421L0.m92648SI().getPackageName()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.title_confirm_forget_pass));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TM */
    void m79088TM() {
        TextView textView = this.f72938P0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        EditText editText = this.f72937O0;
        if (editText != null) {
            editText.setText("");
        }
        if (!this.f72954f1 && (this.f72960l1 || this.f72952d1 != 0)) {
            TextView textView2 = this.f72936N0;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
            m79098xM();
            return;
        }
        this.f72421L0.showDialog(1);
    }

    /* renamed from: VM */
    public void m79089VM() {
        String m118743r0;
        String str;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("smsto:");
            if (!TextUtils.isEmpty(AbstractC23304d.f113446v0)) {
                m118743r0 = AbstractC23304d.f113446v0;
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_phoneSendSMSActive);
            }
            sb2.append(m118743r0);
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb2.toString()));
            if (!TextUtils.isEmpty(AbstractC23304d.f113458y0)) {
                str = AbstractC23304d.f113458y0;
            } else {
                str = "Zalo";
            }
            intent.putExtra("sms_body", str);
            this.f72421L0.m92641HK(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WM */
    void m79090WM(boolean z11) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (z11) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            } else {
                actionBar.setBackButtonImage(0);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (!z12 || this.f72421L0.m92683qJ()) {
                AbstractC2364o0.m12370m(this.f72937O0, 50L);
            }
        }
    }

    /* renamed from: XM */
    void m79091XM(C3560a c3560a) {
        try {
            if (this.f72932F1 == null) {
                ConfirmDialogView confirmDialogView = (ConfirmDialogView) this.f72421L0.m92649TI().m92996E0("ban_dialog");
                this.f72932F1 = confirmDialogView;
                if (confirmDialogView != null) {
                    confirmDialogView.dismiss();
                    this.f72932F1 = null;
                }
            }
            if (this.f72932F1 == null) {
                this.f72932F1 = new ConfirmDialogView();
            }
            Spanned fromHtml = Html.fromHtml(c3560a.m18087a());
            SpannableString spannableString = new SpannableString(fromHtml);
            Linkify.addLinks(spannableString, 6);
            String obj = fromHtml.toString();
            int indexOf = obj.indexOf("(");
            int indexOf2 = obj.indexOf(")", indexOf);
            if (indexOf >= 0 && indexOf2 > indexOf) {
                int i11 = indexOf + 1;
                String trim = obj.substring(i11, indexOf2).trim();
                if (trim.startsWith("http")) {
                    spannableString.setSpan(new C23225u.a(i11, indexOf2, new RunnableC14188e(trim)), i11, indexOf2, 33);
                }
            }
            this.f72932F1.mo43041MK(true);
            this.f72932F1.m42854bL(c3560a.m18088b());
            this.f72932F1.m42850XK(spannableString);
            this.f72932F1.m42852ZK(AbstractC8020f0.str_close, new InterfaceC17463d.b());
            this.f72932F1.m92602UK(this.f72421L0.m92649TI(), "ban_dialog");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YM */
    public void m79092YM(String str) {
        TextView textView = this.f72938P0;
        if (textView != null) {
            textView.setText(str);
            if (!TextUtils.isEmpty(str)) {
                this.f72938P0.setVisibility(0);
            } else {
                this.f72938P0.setVisibility(8);
            }
        }
    }

    /* renamed from: ZM */
    void m79093ZM() {
        try {
            this.f72936N0.setEnabled(false);
            CountDownTimer countDownTimer = this.f72927A1;
            if (countDownTimer != null) {
                try {
                    countDownTimer.cancel();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            long j11 = AbstractC23304d.f113395i1;
            if (j11 <= 0) {
                j11 = 60000;
            }
            this.f72927A1 = new CountDownTimerC14187d(j11, 1000L).start();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: bN */
    void m79094bN() {
        AbstractC23647d.m123907q("19309", "");
        this.f72935M0.setEnabled(false);
        String trim = this.f72937O0.getText().toString().trim();
        this.f72939Q0 = trim;
        if (TextUtils.isEmpty(trim)) {
            m79092YM(AbstractC23136l9.m118743r0(AbstractC8020f0.verify_01));
        } else {
            m79052DM(this.f72939Q0);
        }
        AbstractC23647d.m123893c();
    }

    /* renamed from: cN */
    void m79095cN() {
        int m118742r;
        for (int i11 = 0; i11 < 8; i11++) {
            try {
                if (i11 < this.f72953e1) {
                    this.f72944V0[i11] = new C30801c();
                    AbstractC23136l9.m118696b1(this.f72968t1[i11], this.f72944V0[i11]);
                    this.f72968t1[i11].setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.z8
                        public /* synthetic */ ViewOnClickListenerC16404z8() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConfirmCodeView.this.m79065QM(view);
                        }
                    });
                    switch (this.f72953e1) {
                        case 4:
                            m118742r = AbstractC23136l9.m118742r(15.0f);
                            break;
                        case 5:
                            m118742r = AbstractC23136l9.m118742r(12.0f);
                            break;
                        case 6:
                            m118742r = AbstractC23136l9.m118742r(6.0f);
                            break;
                        case 7:
                        case 8:
                            m118742r = AbstractC23136l9.m118742r(4.0f);
                            break;
                        default:
                            m118742r = 0;
                            break;
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f72968t1[i11].getLayoutParams();
                    layoutParams.setMargins(m118742r, 0, m118742r, 0);
                    this.f72968t1[i11].setLayoutParams(layoutParams);
                    this.f72968t1[i11].setVisibility(0);
                } else {
                    this.f72968t1[i11].setVisibility(8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ConfirmCodeView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 999 && i12 == -1 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra("data");
                if (!TextUtils.isEmpty(stringExtra)) {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    if (jSONObject.has("error_code")) {
                        int i13 = jSONObject.getInt("error_code");
                        String str = "";
                        if (i13 == 0) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            if (optJSONObject != null && optJSONObject.optInt("verificationType", 0) == 1) {
                                String optString = optJSONObject.optString("verificationToken");
                                if (AbstractC23309i.m121859e9() == 1) {
                                    str = AbstractC23309i.m121704a5();
                                }
                                m79096vM(str, AbstractC23304d.f113398j0, optString);
                                return;
                            }
                            return;
                        }
                        C20096c c20096c = new C20096c(i13, jSONObject.optString("error_message", ""));
                        c20096c.m104494f(stringExtra);
                        if (AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.a9
                            public /* synthetic */ C15429a9() {
                            }

                            @Override // me0.AbstractC23216t1.d
                            /* renamed from: a */
                            public final void mo68088a(String str2) {
                                ConfirmCodeView.this.m79092YM(str2);
                            }
                        })) {
                            return;
                        }
                        if (i13 == 1002) {
                            m79092YM(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_session_expired_web, Integer.valueOf(i13)));
                        } else if (i13 == 1112) {
                            m79092YM(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i13)));
                        } else {
                            m79092YM(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i13)));
                        }
                    }
                }
            } catch (Exception e11) {
                try {
                    e11.printStackTrace();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            long currentTimeMillis = System.currentTimeMillis() - this.f72943U0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deltaTime: ");
            sb2.append(currentTimeMillis);
            if (currentTimeMillis < 300) {
                return true;
            }
            m79086RM();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            this.f72421L0.m92676n2().mo35554O(16);
            if (this.f72421L0.m92648SI() != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                intentFilter.setPriority(Integer.MAX_VALUE);
                AbstractC2351i.m12327a(this.f72421L0.m92648SI(), this.f72940R0, intentFilter, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f72943U0 = System.currentTimeMillis();
    }

    /* renamed from: vM */
    public void m79096vM(String str, String str2, String str3) {
        if (C23055e5.m118272g(true)) {
            synchronized (this.f72934H1) {
                try {
                    if (this.f72933G1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    if (AbstractC23244v8.m119756t(str2)) {
                        str = "";
                    }
                    String str4 = str;
                    synchronized (this.f72934H1) {
                        this.f72933G1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14189f(elapsedRealtime));
                    String str5 = "";
                    if (this.f72962n1 > 0) {
                        str5 = AbstractC23179p8.m119418d(CoreUtility.f89233i);
                    }
                    c0766k.mo1718q6(str2, "", str4, str3, this.f72961m1, this.f72962n1, str5, this.f72963o1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: wM */
    public void m79052DM(String str) {
        String str2;
        EditText editText = this.f72937O0;
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f72974z1) {
                try {
                    if (this.f72973y1) {
                        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                        return;
                    }
                    synchronized (this.f72974z1) {
                        this.f72973y1 = true;
                        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                    }
                    if (AbstractC23309i.m121859e9() == 1) {
                        str2 = AbstractC23309i.m121704a5();
                    } else {
                        str2 = "";
                    }
                    String str3 = str2;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14186c(elapsedRealtime));
                    String str4 = "";
                    if (this.f72962n1 > 0) {
                        str4 = AbstractC23179p8.m119418d(CoreUtility.f89233i);
                    }
                    String str5 = str4;
                    String str6 = "";
                    if (this.f72947Y0 || this.f72948Z0) {
                        str6 = AbstractC23304d.f113309O;
                    }
                    String str7 = str6;
                    String str8 = AbstractC23304d.f113398j0;
                    String m121487Ua = AbstractC23309i.m121487Ua();
                    int i11 = this.f72952d1;
                    String str9 = this.f72950b1;
                    boolean z11 = this.f72946X0;
                    boolean z12 = this.f72948Z0;
                    c0766k.mo1515Q5(str8, str, str3, m121487Ua, i11, str9, z11 ? 1 : 0, z12 ? 1 : 0, this.f72949a1, this.f72962n1, str5, this.f72963o1, str7);
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        m79092YM(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        boolean z11;
        boolean z12;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j11;
        super.mo37135xJ(bundle);
        boolean z13 = true;
        try {
            if (bundle != null) {
                String str7 = "";
                if (!bundle.containsKey("onSave")) {
                    str = "";
                } else {
                    str = bundle.getString("onSave");
                }
                AbstractC23304d.f113398j0 = str;
                this.f72959k1 = bundle.getString("phoneNumE164", str);
                this.f72954f1 = bundle.getBoolean("isManualSms");
                this.f72952d1 = bundle.getInt("activationType");
                this.f72953e1 = bundle.getInt("activationNumber");
                this.f72961m1 = bundle.getString("pwd_token", "");
                int i11 = 0;
                this.f72962n1 = bundle.getInt("srcSwitchAccount", 0);
                this.f72963o1 = bundle.getInt("source_switch", 0);
                m79095cN();
                if (bundle.containsKey("stopHandleIncomingCall") && bundle.getBoolean("stopHandleIncomingCall")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f72942T0 = z11;
                int i12 = bundle.getInt("src_type", 0);
                this.f72949a1 = i12;
                if (i12 == 3) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f72946X0 = z12;
                if (i12 != 2) {
                    z13 = false;
                }
                this.f72947Y0 = z13;
                if (!bundle.containsKey("zalo_phoneNumber")) {
                    str2 = "";
                } else {
                    str2 = bundle.getString("zalo_phoneNumber");
                }
                AbstractC23304d.f113438t0 = str2;
                if (!bundle.containsKey("phoneNumberE164Server")) {
                    str3 = "";
                } else {
                    str3 = bundle.getString("phoneNumberE164Server");
                }
                AbstractC23304d.f113442u0 = str3;
                if (!bundle.containsKey("sms_gateWay")) {
                    str4 = "";
                } else {
                    str4 = bundle.getString("sms_gateWay");
                }
                AbstractC23304d.f113446v0 = str4;
                if (!bundle.containsKey("sms_format")) {
                    str5 = "";
                } else {
                    str5 = bundle.getString("sms_format");
                }
                AbstractC23304d.f113458y0 = str5;
                if (!bundle.containsKey("sms_content_hint")) {
                    str6 = "";
                } else {
                    str6 = bundle.getString("sms_content_hint");
                }
                AbstractC23304d.f113454x0 = str6;
                if (bundle.containsKey("titlePopup")) {
                    str7 = bundle.getString("titlePopup");
                }
                AbstractC23304d.f113450w0 = str7;
                ArrayList arrayList = AbstractC23304d.f113289J;
                if (arrayList != null && arrayList.isEmpty() && bundle.containsKey("listCallNum")) {
                    AbstractC23304d.f113289J = bundle.getStringArrayList("listCallNum");
                }
                if (bundle.containsKey("countDownTimeOtp")) {
                    j11 = bundle.getInt("countDownTimeOtp");
                } else {
                    j11 = 60000;
                }
                AbstractC23304d.f113395i1 = j11;
                if (AbstractC23304d.f113391h1 == 0) {
                    if (bundle.containsKey("iTimeDelayRequestActiveByRejectCall")) {
                        i11 = bundle.getInt("iTimeDelayRequestActiveByRejectCall");
                    }
                    AbstractC23304d.f113391h1 = i11;
                }
                ConfirmDialogView confirmDialogView = (ConfirmDialogView) this.f72421L0.m92649TI().m92996E0("ban_dialog");
                this.f72932F1 = confirmDialogView;
                if (confirmDialogView != null) {
                    confirmDialogView.dismiss();
                    this.f72932F1 = null;
                }
            } else if (this.f72952d1 == 0) {
                this.f72421L0.showDialog(1);
            } else {
                m79093ZM();
            }
            m79067aN();
            AbstractC23647d.m123906p("19300");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    void m79098xM() {
        String str;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f72972x1) {
                try {
                    if (this.f72971w1) {
                        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                        return;
                    }
                    this.f72971w1 = true;
                    this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                    if (AbstractC23309i.m121859e9() == 1) {
                        str = AbstractC23309i.m121704a5();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14185b());
                    this.f72942T0 = false;
                    AbstractC23304d.f113289J.clear();
                    AbstractC23304d.f113399j1 = System.currentTimeMillis();
                    String str3 = AbstractC23304d.f113398j0;
                    String str4 = this.f72951c1;
                    boolean z11 = this.f72946X0;
                    boolean z12 = this.f72948Z0;
                    c0766k.mo1530S4(str3, str2, str4, z11 ? 1 : 0, z12 ? 1 : 0, this.f72949a1, this.f72962n1, this.f72963o1, AbstractC23034c6.m118110A(), this.f72965q1);
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        m79092YM(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
        TextView textView = this.f72936N0;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* renamed from: yM */
    public void m79099yM(String str, Context context) {
        try {
            if (this.f72942T0) {
                return;
            }
            this.f72942T0 = true;
            this.f72928B1 = str;
            if (!TextUtils.isEmpty(str) && AbstractC23304d.f113289J.size() > 0) {
                int length = ((String) AbstractC23304d.f113289J.get(0)).length();
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                for (int length2 = this.f72928B1.length() - 1; i11 < length && length2 >= 0; length2 -= 2) {
                    sb2.append(this.f72928B1.charAt(length2));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("value1: ");
                    sb3.append(this.f72928B1.charAt(length2));
                    i11++;
                }
                if (AbstractC23304d.f113289J.contains(sb2.toString())) {
                    this.f72930D1 = 0;
                    AbstractC20019m.m103895c(context);
                    Handler handler = this.f72929C1;
                    if (handler != null) {
                        handler.removeCallbacks(this.f72931E1);
                        if (System.currentTimeMillis() - AbstractC23304d.f113399j1 <= AbstractC23304d.f113395i1) {
                            this.f72421L0.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing), false);
                            this.f72929C1.postDelayed(this.f72931E1, AbstractC23304d.f113391h1);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    void m79100zM(View view) {
        StaticLayout staticLayout;
        boolean z11;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        if (TextUtils.isEmpty(this.f72959k1) && !TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            String m118281g = AbstractC23056e6.m118281g(AbstractC23304d.f113398j0, AbstractC23309i.m121704a5());
            if (TextUtils.isEmpty(m118281g) || m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                m118281g = AbstractC23304d.f113398j0;
            }
            this.f72959k1 = m118281g;
        }
        this.f72958j1 = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_avt);
        this.f72955g1 = (TextView) view.findViewById(AbstractC6918a0.tvTitle);
        String format = String.format(m92652XI(AbstractC8020f0.str_title_confirm_code_sms), this.f72959k1);
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(format, 0, format.length(), this.f72955g1.getPaint(), AbstractC23136l9.m118722k0());
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_CENTER);
            includePad = alignment.setIncludePad(false);
            breakStrategy = includePad.setBreakStrategy(1);
            staticLayout = breakStrategy.build();
        } else {
            staticLayout = new StaticLayout(format, this.f72955g1.getPaint(), AbstractC23136l9.m118722k0(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        if (staticLayout.getLineCount() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f72969u1 = z11;
        this.f72956h1 = (TextView) view.findViewById(AbstractC6918a0.tvDes);
        this.f72936N0 = (TextView) view.findViewById(AbstractC6918a0.btnGetActivationCode);
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tvHintSupport);
        this.f72964p1 = robotoTextView;
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.b9
            public /* synthetic */ ViewOnClickListenerC15466b9() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmCodeView.this.m79049AM(view2);
            }
        });
        m79066UM(this.f72954f1);
        this.f72937O0 = (EditText) view.findViewById(AbstractC6918a0.etActivationCode);
        TextView[] textViewArr = new TextView[8];
        this.f72968t1 = textViewArr;
        textViewArr[0] = (TextView) view.findViewById(AbstractC6918a0.tv1);
        this.f72968t1[1] = (TextView) view.findViewById(AbstractC6918a0.tv2);
        this.f72968t1[2] = (TextView) view.findViewById(AbstractC6918a0.tv3);
        this.f72968t1[3] = (TextView) view.findViewById(AbstractC6918a0.tv4);
        this.f72968t1[4] = (TextView) view.findViewById(AbstractC6918a0.tv5);
        this.f72968t1[5] = (TextView) view.findViewById(AbstractC6918a0.tv6);
        this.f72968t1[6] = (TextView) view.findViewById(AbstractC6918a0.tv7);
        this.f72968t1[7] = (TextView) view.findViewById(AbstractC6918a0.tv8);
        this.f72944V0 = new C30801c[8];
        m79095cN();
        this.f72937O0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f72953e1)});
        this.f72937O0.addTextChangedListener(new C14184a());
        Button button = (Button) view.findViewById(AbstractC6918a0.btnSubmitActivationCode);
        this.f72935M0 = button;
        button.setEnabled(false);
        this.f72935M0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.c9
            public /* synthetic */ ViewOnClickListenerC15502c9() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmCodeView.this.m79050BM(view2);
            }
        });
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvError);
        this.f72938P0 = textView;
        textView.setVisibility(8);
        this.f72936N0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.d9
            public /* synthetic */ ViewOnClickListenerC15543d9() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmCodeView.this.m79051CM(view2);
            }
        });
        this.f72940R0 = new SMSReceiver(new Handler(new Handler.Callback() { // from class: com.zing.zalo.ui.zviews.e9
            public /* synthetic */ C15580e9() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m79053EM;
                m79053EM = ConfirmCodeView.this.m79053EM(message);
                return m79053EM;
            }
        }));
    }
}
