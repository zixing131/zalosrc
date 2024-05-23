package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.CaptchaView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.AbstractC23244v8;
import me0.C23055e5;
import mm0.AbstractC23352g;
import mm0.AbstractC23353h;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class CaptchaView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    EditText f72565P0;

    /* renamed from: Q0 */
    View f72566Q0;

    /* renamed from: R0 */
    ImageView f72567R0;

    /* renamed from: S0 */
    View f72568S0;

    /* renamed from: T0 */
    TextView f72569T0;

    /* renamed from: U0 */
    String f72570U0;

    /* renamed from: V0 */
    String f72571V0;

    /* renamed from: W0 */
    String f72572W0;

    /* renamed from: Y0 */
    int f72574Y0;

    /* renamed from: Z0 */
    int f72575Z0;

    /* renamed from: a1 */
    int f72576a1;

    /* renamed from: X0 */
    boolean f72573X0 = false;

    /* renamed from: b1 */
    int f72577b1 = 0;

    /* renamed from: c1 */
    String f72578c1 = "";

    /* renamed from: d1 */
    String f72579d1 = "";

    /* renamed from: e1 */
    String f72580e1 = "";

    /* renamed from: f1 */
    String f72581f1 = "";

    /* renamed from: g1 */
    boolean f72582g1 = false;

    /* renamed from: h1 */
    String f72583h1 = "";

    /* renamed from: i1 */
    final Object f72584i1 = new Object();

    /* renamed from: j1 */
    boolean f72585j1 = false;

    /* renamed from: k1 */
    boolean f72586k1 = false;

    /* renamed from: l1 */
    boolean f72587l1 = false;

    /* renamed from: m1 */
    final Object f72588m1 = new Object();

    /* renamed from: com.zing.zalo.ui.zviews.CaptchaView$a */
    /* loaded from: classes6.dex */
    class C14132a extends AbstractC18391a {
        C14132a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            CaptchaView.this.m78658pM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CaptchaView$b */
    /* loaded from: classes6.dex */
    public class C14133b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f72590a;

        C14133b(boolean z11) {
            this.f72590a = z11;
        }

        /* renamed from: g */
        public /* synthetic */ void m78665g(JSONObject jSONObject) {
            Intent intent = new Intent();
            intent.putExtra("data", jSONObject.toString());
            intent.putExtra("srcType", CaptchaView.this.f72574Y0);
            CaptchaView.this.mo50035CK(-1, intent);
            CaptchaView.this.finish();
        }

        /* renamed from: h */
        public /* synthetic */ void m78666h(String str) {
            if (CaptchaView.this.f72569T0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    CaptchaView.this.f72569T0.setText(str);
                    CaptchaView.this.f72569T0.setVisibility(0);
                } else {
                    CaptchaView.this.f72569T0.setVisibility(8);
                }
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m78667i(Bitmap bitmap, boolean z11) {
            try {
                CaptchaView.this.f72567R0.setImageBitmap(bitmap);
                CaptchaView.this.f72565P0.setText("");
                if (z11) {
                    CaptchaView.this.f72569T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_captcha));
                    CaptchaView.this.f72569T0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m78668j(C20096c c20096c) {
            try {
                TextView textView = CaptchaView.this.f72569T0;
                if (textView != null) {
                    textView.setText(c20096c.m104492d());
                    CaptchaView.this.f72569T0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.m4.<init>(com.zing.zalo.ui.zviews.CaptchaView$b, android.graphics.Bitmap, boolean):void, class status: GENERATED_AND_UNLOADED
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
        /* renamed from: a */
        public void mo926a(hm0.C20096c r5) {
            /*
                r4 = this;
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this
                java.lang.Object r0 = r0.f72584i1
                monitor-enter(r0)
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Throwable -> Le6
                r2 = 0
                r1.f72585j1 = r2     // Catch: java.lang.Throwable -> Le6
                com.zing.zalo.ui.zviews.BaseZaloView r1 = r1.f72421L0     // Catch: java.lang.Throwable -> Le6
                r1.mo49315c4()     // Catch: java.lang.Throwable -> Le6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le6
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L1c
                boolean r0 = r0.f72573X0     // Catch: java.lang.Exception -> L1c
                if (r0 != 0) goto L1f
                java.lang.String r0 = "199724"
                p361nb.AbstractC23647d.m123897g(r0)     // Catch: java.lang.Exception -> L1c
                goto L1f
            L1c:
                r5 = move-exception
                goto Le2
            L1f:
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L1c
                boolean r0 = r0.m92672lJ()     // Catch: java.lang.Exception -> L1c
                if (r0 == 0) goto L36
                int r0 = r5.m104491c()     // Catch: java.lang.Exception -> L1c
                r1 = 50001(0xc351, float:7.0066E-41)
                if (r0 == r1) goto L36
                r0 = 1
                p135em.C18489c.m97852r(r0)     // Catch: java.lang.Exception -> L1c
            L36:
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.l4 r1 = new com.zing.zalo.ui.zviews.l4     // Catch: java.lang.Exception -> L1c
                r1.<init>()     // Catch: java.lang.Exception -> L1c
                boolean r0 = me0.AbstractC23216t1.m119643h(r0, r5, r1)     // Catch: java.lang.Exception -> L1c
                if (r0 == 0) goto L46
                return
            L46:
                int r0 = r5.m104491c()     // Catch: java.lang.Exception -> L1c
                r1 = 2050(0x802, float:2.873E-42)
                if (r0 != r1) goto La4
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9f
                java.lang.String r5 = r5.m104490b()     // Catch: java.lang.Exception -> L9f
                r0.<init>(r5)     // Catch: java.lang.Exception -> L9f
                java.lang.String r5 = "data"
                org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L9f
                r0.f72581f1 = r1     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                java.lang.String r1 = "captchaToken"
                java.lang.String r3 = ""
                java.lang.String r1 = r5.optString(r1, r3)     // Catch: java.lang.Exception -> L9f
                r0.f72570U0 = r1     // Catch: java.lang.Exception -> L9f
                java.lang.String r0 = "captchaBitmap"
                java.lang.String r1 = ""
                java.lang.String r5 = r5.optString(r0, r1)     // Catch: java.lang.Exception -> L9f
                byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.Exception -> L9f
                int r0 = r5.length     // Catch: java.lang.Exception -> L9f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r2, r0)     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L9f
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L9f
                if (r0 == 0) goto La3
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L9f
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L9f
                boolean r1 = r4.f72590a     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.m4 r2 = new com.zing.zalo.ui.zviews.m4     // Catch: java.lang.Exception -> L9f
                r2.<init>()     // Catch: java.lang.Exception -> L9f
                r0.runOnUiThread(r2)     // Catch: java.lang.Exception -> L9f
                goto La3
            L9f:
                r5 = move-exception
                r5.printStackTrace()     // Catch: java.lang.Exception -> L1c
            La3:
                return
            La4:
                int r0 = r5.m104491c()     // Catch: java.lang.Exception -> L1c
                r1 = 2060(0x80c, float:2.887E-42)
                if (r0 != r1) goto Lc7
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c
                java.lang.String r5 = r5.m104490b()     // Catch: java.lang.Exception -> L1c
                r0.<init>(r5)     // Catch: java.lang.Exception -> L1c
                java.lang.String r5 = "data"
                org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L1c
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L1c
                r1 = 1004(0x3ec, float:1.407E-42)
                me0.AbstractC23153n4.m119155v(r0, r5, r1)     // Catch: java.lang.Exception -> L1c
                return
            Lc7:
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L1c
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L1c
                if (r0 == 0) goto Le5
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L1c
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L1c
                com.zing.zalo.ui.zviews.n4 r1 = new com.zing.zalo.ui.zviews.n4     // Catch: java.lang.Exception -> L1c
                r1.<init>()     // Catch: java.lang.Exception -> L1c
                r0.runOnUiThread(r1)     // Catch: java.lang.Exception -> L1c
                goto Le5
            Le2:
                r5.printStackTrace()
            Le5:
                return
            Le6:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le6
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.CaptchaView.C14133b.mo926a(hm0.c):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.o4.<init>(com.zing.zalo.ui.zviews.CaptchaView$b, org.json.JSONObject):void, class status: GENERATED_AND_UNLOADED
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
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.String r0 = "199725"
                p361nb.AbstractC23647d.m123897g(r0)     // Catch: java.lang.Exception -> L22
                org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L22
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L22
                if (r0 == 0) goto L26
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L22
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.o4 r1 = new com.zing.zalo.ui.zviews.o4     // Catch: java.lang.Exception -> L22
                r1.<init>()     // Catch: java.lang.Exception -> L22
                r0.runOnUiThread(r1)     // Catch: java.lang.Exception -> L22
                goto L26
            L22:
                r3 = move-exception
                r3.printStackTrace()
            L26:
                com.zing.zalo.ui.zviews.CaptchaView r3 = com.zing.zalo.p077ui.zviews.CaptchaView.this
                java.lang.Object r3 = r3.f72584i1
                monitor-enter(r3)
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Throwable -> L37
                r1 = 0
                r0.f72585j1 = r1     // Catch: java.lang.Throwable -> L37
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Throwable -> L37
                r0.mo49315c4()     // Catch: java.lang.Throwable -> L37
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                return
            L37:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.CaptchaView.C14133b.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CaptchaView$c */
    /* loaded from: classes6.dex */
    public class C14134c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f72592a;

        C14134c(boolean z11) {
            this.f72592a = z11;
        }

        /* renamed from: g */
        public /* synthetic */ void m78673g(JSONObject jSONObject) {
            Intent intent = new Intent();
            intent.putExtra("data", jSONObject.toString());
            intent.putExtra("srcType", CaptchaView.this.f72574Y0);
            CaptchaView.this.mo50035CK(-1, intent);
            CaptchaView.this.finish();
        }

        /* renamed from: h */
        public /* synthetic */ void m78674h(String str) {
            if (CaptchaView.this.f72569T0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    CaptchaView.this.f72569T0.setText(str);
                    CaptchaView.this.f72569T0.setVisibility(0);
                } else {
                    CaptchaView.this.f72569T0.setVisibility(8);
                }
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m78675i(Bitmap bitmap, boolean z11) {
            try {
                CaptchaView.this.f72567R0.setImageBitmap(bitmap);
                CaptchaView.this.f72565P0.setText("");
                if (z11) {
                    CaptchaView.this.f72569T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_captcha));
                    CaptchaView.this.f72569T0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m78676j(C20096c c20096c) {
            try {
                TextView textView = CaptchaView.this.f72569T0;
                if (textView != null) {
                    textView.setText(c20096c.m104492d());
                    CaptchaView.this.f72569T0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.q4.<init>(com.zing.zalo.ui.zviews.CaptchaView$c, android.graphics.Bitmap, boolean):void, class status: GENERATED_AND_UNLOADED
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
        /* renamed from: a */
        public void mo926a(hm0.C20096c r6) {
            /*
                r5 = this;
                java.lang.String r0 = ""
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this
                r2 = 0
                r1.f72586k1 = r2
                r1.mo49315c4()
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L16
                boolean r1 = r1.f72573X0     // Catch: java.lang.Exception -> L16
                if (r1 != 0) goto L19
                java.lang.String r1 = "199724"
                p361nb.AbstractC23647d.m123897g(r1)     // Catch: java.lang.Exception -> L16
                goto L19
            L16:
                r6 = move-exception
                goto Ld6
            L19:
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.BaseZaloView r1 = r1.f72421L0     // Catch: java.lang.Exception -> L16
                boolean r1 = r1.m92672lJ()     // Catch: java.lang.Exception -> L16
                if (r1 == 0) goto L30
                int r1 = r6.m104491c()     // Catch: java.lang.Exception -> L16
                r3 = 50001(0xc351, float:7.0066E-41)
                if (r1 == r3) goto L30
                r1 = 1
                p135em.C18489c.m97852r(r1)     // Catch: java.lang.Exception -> L16
            L30:
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.BaseZaloView r1 = r1.f72421L0     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.p4 r3 = new com.zing.zalo.ui.zviews.p4     // Catch: java.lang.Exception -> L16
                r3.<init>()     // Catch: java.lang.Exception -> L16
                boolean r1 = me0.AbstractC23216t1.m119643h(r1, r6, r3)     // Catch: java.lang.Exception -> L16
                if (r1 == 0) goto L40
                return
            L40:
                int r1 = r6.m104491c()     // Catch: java.lang.Exception -> L16
                r3 = 2050(0x802, float:2.873E-42)
                java.lang.String r4 = "data"
                if (r1 != r3) goto L9a
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
                java.lang.String r6 = r6.m104490b()     // Catch: java.lang.Exception -> L95
                r1.<init>(r6)     // Catch: java.lang.Exception -> L95
                org.json.JSONObject r6 = r1.optJSONObject(r4)     // Catch: java.lang.Exception -> L95
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L95
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> L95
                r1.f72581f1 = r3     // Catch: java.lang.Exception -> L95
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L95
                java.lang.String r3 = "captchaToken"
                java.lang.String r3 = r6.optString(r3, r0)     // Catch: java.lang.Exception -> L95
                r1.f72570U0 = r3     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = "captchaBitmap"
                java.lang.String r6 = r6.optString(r1, r0)     // Catch: java.lang.Exception -> L95
                byte[] r6 = android.util.Base64.decode(r6, r2)     // Catch: java.lang.Exception -> L95
                int r0 = r6.length     // Catch: java.lang.Exception -> L95
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r2, r0)     // Catch: java.lang.Exception -> L95
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L95
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L95
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L95
                if (r0 == 0) goto L99
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L95
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L95
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L95
                boolean r1 = r5.f72592a     // Catch: java.lang.Exception -> L95
                com.zing.zalo.ui.zviews.q4 r2 = new com.zing.zalo.ui.zviews.q4     // Catch: java.lang.Exception -> L95
                r2.<init>()     // Catch: java.lang.Exception -> L95
                r0.runOnUiThread(r2)     // Catch: java.lang.Exception -> L95
                goto L99
            L95:
                r6 = move-exception
                r6.printStackTrace()     // Catch: java.lang.Exception -> L16
            L99:
                return
            L9a:
                int r0 = r6.m104491c()     // Catch: java.lang.Exception -> L16
                r1 = 2060(0x80c, float:2.887E-42)
                if (r0 != r1) goto Lbb
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L16
                java.lang.String r6 = r6.m104490b()     // Catch: java.lang.Exception -> L16
                r0.<init>(r6)     // Catch: java.lang.Exception -> L16
                org.json.JSONObject r6 = r0.optJSONObject(r4)     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L16
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L16
                r1 = 1004(0x3ec, float:1.407E-42)
                me0.AbstractC23153n4.m119155v(r0, r6, r1)     // Catch: java.lang.Exception -> L16
                return
            Lbb:
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L16
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L16
                if (r0 == 0) goto Ld9
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L16
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L16
                com.zing.zalo.ui.zviews.r4 r1 = new com.zing.zalo.ui.zviews.r4     // Catch: java.lang.Exception -> L16
                r1.<init>()     // Catch: java.lang.Exception -> L16
                r0.runOnUiThread(r1)     // Catch: java.lang.Exception -> L16
                goto Ld9
            Ld6:
                r6.printStackTrace()
            Ld9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.CaptchaView.C14134c.mo926a(hm0.c):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.s4.<init>(com.zing.zalo.ui.zviews.CaptchaView$c, org.json.JSONObject):void, class status: GENERATED_AND_UNLOADED
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
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.String r0 = "199725"
                p361nb.AbstractC23647d.m123897g(r0)     // Catch: java.lang.Exception -> L22
                org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L22
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L22
                if (r0 == 0) goto L26
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L22
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L22
                com.zing.zalo.ui.zviews.s4 r1 = new com.zing.zalo.ui.zviews.s4     // Catch: java.lang.Exception -> L22
                r1.<init>()     // Catch: java.lang.Exception -> L22
                r0.runOnUiThread(r1)     // Catch: java.lang.Exception -> L22
                goto L26
            L22:
                r3 = move-exception
                r3.printStackTrace()
            L26:
                com.zing.zalo.ui.zviews.CaptchaView r3 = com.zing.zalo.p077ui.zviews.CaptchaView.this
                r0 = 0
                r3.f72586k1 = r0
                r3.mo49315c4()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.CaptchaView.C14134c.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CaptchaView$d */
    /* loaded from: classes6.dex */
    public class C14135d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f72594a;

        /* renamed from: b */
        final /* synthetic */ String f72595b;

        /* renamed from: c */
        final /* synthetic */ String f72596c;

        /* renamed from: d */
        final /* synthetic */ String f72597d;

        /* renamed from: e */
        final /* synthetic */ long f72598e;

        C14135d(boolean z11, String str, String str2, String str3, long j11) {
            this.f72594a = z11;
            this.f72595b = str;
            this.f72596c = str2;
            this.f72597d = str3;
            this.f72598e = j11;
        }

        /* renamed from: g */
        public /* synthetic */ void m78681g(Object obj, String str, long j11) {
            try {
                Intent intent = new Intent();
                intent.putExtra("error_code", 0);
                intent.putExtra("data", obj.toString());
                intent.putExtra("phone_num", str);
                intent.putExtra("send_request_time", j11);
                CaptchaView.this.mo50035CK(-1, intent);
                CaptchaView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m78682h(String str) {
            if (CaptchaView.this.f72569T0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    CaptchaView.this.f72569T0.setVisibility(0);
                    CaptchaView.this.f72569T0.setText(str);
                } else {
                    CaptchaView.this.f72569T0.setVisibility(8);
                }
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m78683i(Bitmap bitmap, boolean z11) {
            try {
                CaptchaView.this.f72567R0.setImageBitmap(bitmap);
                CaptchaView.this.f72565P0.setText("");
                if (z11) {
                    CaptchaView.this.f72569T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_captcha));
                    CaptchaView.this.f72569T0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m78684j(C20096c c20096c, String str, String str2, String str3) {
            try {
                Intent intent = new Intent();
                intent.putExtra("error_code", c20096c.m104491c());
                intent.putExtra("msg", c20096c.m104492d());
                intent.putExtra("data", c20096c.m104490b());
                intent.putExtra("phone_num", str);
                intent.putExtra("password", str2);
                intent.putExtra("captcha_value", str3);
                intent.putExtra("captcha_token", CaptchaView.this.f72570U0);
                CaptchaView.this.mo50035CK(-1, intent);
                CaptchaView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.v4.<init>(com.zing.zalo.ui.zviews.CaptchaView$d, android.graphics.Bitmap, boolean):void, class status: GENERATED_AND_UNLOADED
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
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
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
        /* renamed from: a */
        public void mo926a(hm0.C20096c r9) {
            /*
                r8 = this;
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L43
                java.lang.Object r0 = r0.f72588m1     // Catch: java.lang.Exception -> L43
                monitor-enter(r0)     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.CaptchaView r1 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Throwable -> Lc8
                r2 = 0
                r1.f72587l1 = r2     // Catch: java.lang.Throwable -> Lc8
                com.zing.zalo.ui.zviews.BaseZaloView r1 = r1.f72421L0     // Catch: java.lang.Throwable -> Lc8
                r1.mo49315c4()     // Catch: java.lang.Throwable -> Lc8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc8
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.u4 r1 = new com.zing.zalo.ui.zviews.u4     // Catch: java.lang.Exception -> L43
                r1.<init>()     // Catch: java.lang.Exception -> L43
                boolean r0 = me0.AbstractC23216t1.m119643h(r0, r9, r1)     // Catch: java.lang.Exception -> L43
                if (r0 == 0) goto L20
                return
            L20:
                int r0 = r9.m104491c()     // Catch: java.lang.Exception -> L43
                r1 = 2060(0x80c, float:2.887E-42)
                if (r0 != r1) goto L46
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L43
                java.lang.String r9 = r9.m104490b()     // Catch: java.lang.Exception -> L43
                r0.<init>(r9)     // Catch: java.lang.Exception -> L43
                java.lang.String r9 = "data"
                org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L43
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L43
                r1 = 1005(0x3ed, float:1.408E-42)
                me0.AbstractC23153n4.m119155v(r0, r9, r1)     // Catch: java.lang.Exception -> L43
                return
            L43:
                r9 = move-exception
                goto Lcb
            L46:
                int r0 = r9.m104491c()     // Catch: java.lang.Exception -> L43
                r1 = 2058(0x80a, float:2.884E-42)
                if (r0 != r1) goto La4
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9f
                java.lang.String r9 = r9.m104490b()     // Catch: java.lang.Exception -> L9f
                r0.<init>(r9)     // Catch: java.lang.Exception -> L9f
                java.lang.String r9 = "data"
                org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> L9f
                r0.f72581f1 = r1     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                java.lang.String r1 = "captchaToken"
                java.lang.String r3 = ""
                java.lang.String r1 = r9.optString(r1, r3)     // Catch: java.lang.Exception -> L9f
                r0.f72570U0 = r1     // Catch: java.lang.Exception -> L9f
                java.lang.String r0 = "captchaBitmap"
                java.lang.String r1 = ""
                java.lang.String r9 = r9.optString(r0, r1)     // Catch: java.lang.Exception -> L9f
                byte[] r9 = android.util.Base64.decode(r9, r2)     // Catch: java.lang.Exception -> L9f
                int r0 = r9.length     // Catch: java.lang.Exception -> L9f
                android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r9, r2, r0)     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L9f
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L9f
                if (r0 == 0) goto La3
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L9f
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L9f
                boolean r1 = r8.f72594a     // Catch: java.lang.Exception -> L9f
                com.zing.zalo.ui.zviews.v4 r2 = new com.zing.zalo.ui.zviews.v4     // Catch: java.lang.Exception -> L9f
                r2.<init>()     // Catch: java.lang.Exception -> L9f
                r0.runOnUiThread(r2)     // Catch: java.lang.Exception -> L9f
                goto La3
            L9f:
                r9 = move-exception
                r9.printStackTrace()     // Catch: java.lang.Exception -> L43
            La3:
                return
            La4:
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L43
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L43
                if (r0 == 0) goto Ld0
                com.zing.zalo.ui.zviews.CaptchaView r0 = com.zing.zalo.p077ui.zviews.CaptchaView.this     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.BaseZaloView r0 = r0.f72421L0     // Catch: java.lang.Exception -> L43
                ub.a r0 = r0.m92676n2()     // Catch: java.lang.Exception -> L43
                java.lang.String r4 = r8.f72595b     // Catch: java.lang.Exception -> L43
                java.lang.String r5 = r8.f72596c     // Catch: java.lang.Exception -> L43
                java.lang.String r6 = r8.f72597d     // Catch: java.lang.Exception -> L43
                com.zing.zalo.ui.zviews.w4 r7 = new com.zing.zalo.ui.zviews.w4     // Catch: java.lang.Exception -> L43
                r1 = r7
                r2 = r8
                r3 = r9
                r1.<init>()     // Catch: java.lang.Exception -> L43
                r0.runOnUiThread(r7)     // Catch: java.lang.Exception -> L43
                goto Ld0
            Lc8:
                r9 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc8
                throw r9     // Catch: java.lang.Exception -> L43
            Lcb:
                java.lang.String r0 = "CaptchaView"
                mm0.AbstractC23350e.m122776f(r0, r9)
            Ld0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.CaptchaView.C14135d.mo926a(hm0.c):void");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            synchronized (CaptchaView.this.f72588m1) {
                CaptchaView captchaView = CaptchaView.this;
                captchaView.f72587l1 = false;
                captchaView.f72421L0.mo49315c4();
            }
            if (CaptchaView.this.f72421L0.m92676n2() != null) {
                CaptchaView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t4

                    /* renamed from: q */
                    public final /* synthetic */ Object f82161q;

                    /* renamed from: r */
                    public final /* synthetic */ String f82162r;

                    /* renamed from: s */
                    public final /* synthetic */ long f82163s;

                    public /* synthetic */ RunnableC16178t4(Object obj2, String str, long j11) {
                        r2 = obj2;
                        r3 = str;
                        r4 = j11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CaptchaView.C14135d.this.m78681g(r2, r3, r4);
                    }
                });
            }
        }
    }

    /* renamed from: lM */
    public /* synthetic */ void m78653lM(String str) {
        if (this.f72569T0 != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f72569T0.setText(str);
                this.f72569T0.setVisibility(0);
            } else {
                this.f72569T0.setVisibility(8);
            }
        }
    }

    /* renamed from: mM */
    public /* synthetic */ void m78654mM() {
        AbstractC2379w.m12432f(this.f72565P0);
    }

    /* renamed from: nM */
    public /* synthetic */ void m78655nM(Bitmap bitmap) {
        try {
            this.f72567R0.setImageBitmap(bitmap);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.k4.<init>(com.zing.zalo.ui.zviews.CaptchaView, android.graphics.Bitmap):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: oM */
    public /* synthetic */ void m78656oM() {
        /*
            r3 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r3.f72581f1     // Catch: java.lang.Exception -> L40
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L40
            if (r1 != 0) goto L44
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r3.f72581f1     // Catch: java.lang.Exception -> L40
            r1.<init>(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = "captchaToken"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch: java.lang.Exception -> L40
            r3.f72570U0 = r2     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = "captchaBitmap"
            java.lang.String r0 = r1.optString(r2, r0)     // Catch: java.lang.Exception -> L40
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L40
            int r2 = r0.length     // Catch: java.lang.Exception -> L40
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2)     // Catch: java.lang.Exception -> L40
            com.zing.zalo.ui.zviews.BaseZaloView r1 = r3.f72421L0     // Catch: java.lang.Exception -> L40
            ub.a r1 = r1.m92676n2()     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L44
            com.zing.zalo.ui.zviews.BaseZaloView r1 = r3.f72421L0     // Catch: java.lang.Exception -> L40
            ub.a r1 = r1.m92676n2()     // Catch: java.lang.Exception -> L40
            com.zing.zalo.ui.zviews.k4 r2 = new com.zing.zalo.ui.zviews.k4     // Catch: java.lang.Exception -> L40
            r2.<init>()     // Catch: java.lang.Exception -> L40
            r1.runOnUiThread(r2)     // Catch: java.lang.Exception -> L40
            goto L44
        L40:
            r0 = move-exception
            r0.printStackTrace()
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.CaptchaView.m78656oM():void");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f72574Y0 = m92642L3.getInt("EXTRA_SRC_TYPE", 0);
            this.f72575Z0 = m92642L3.getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f72576a1 = m92642L3.getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
            this.f72572W0 = m92642L3.getString("password", "");
            this.f72577b1 = m92642L3.getInt("login_by_password", 0);
            this.f72578c1 = m92642L3.getString("question_type", "");
            this.f72579d1 = m92642L3.getString("answer_type", "");
            this.f72580e1 = m92642L3.getString("answer_value", "");
            this.f72582g1 = m92642L3.getBoolean("EXTRA_FROM_REGISTER_NEW", false);
            this.f72583h1 = m92642L3.getString("EXTRA_SESSION_TOKEN", "");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.captcha_view, viewGroup, false);
        this.f72565P0 = (EditText) inflate.findViewById(AbstractC6918a0.edtCaptcha);
        this.f72566Q0 = inflate.findViewById(AbstractC6918a0.btnGetCaptcha);
        this.f72567R0 = (ImageView) inflate.findViewById(AbstractC6918a0.imgCaptcha);
        this.f72569T0 = (TextView) inflate.findViewById(AbstractC6918a0.tvError);
        this.f72568S0 = inflate.findViewById(AbstractC6918a0.btnNext);
        this.f72566Q0.setOnClickListener(this);
        this.f72568S0.setOnClickListener(this);
        this.f72565P0.addTextChangedListener(new C14132a());
        m78658pM();
        this.f72565P0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.i4
            public /* synthetic */ RunnableC15723i4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CaptchaView.this.m78654mM();
            }
        }, 300L);
        if (m92642L3() != null) {
            this.f72571V0 = m92642L3().getString("phoneNumber", "");
            if (bundle != null) {
                this.f72581f1 = bundle.getString("data_captcha", "");
            } else {
                this.f72581f1 = m92642L3().getString("data", "");
            }
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.j4
                public /* synthetic */ RunnableC15759j4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CaptchaView.this.m78656oM();
                }
            });
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("199726");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putString("data_captcha", this.f72581f1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.str_title_captcha));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CaptchaView";
    }

    /* renamed from: kM */
    public void m78657kM(String str, String str2, String str3, boolean z11) {
        String str4;
        if (C23055e5.m118272g(true)) {
            synchronized (this.f72588m1) {
                try {
                    if (this.f72587l1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    if (AbstractC23309i.m121859e9() == 1) {
                        str4 = AbstractC23309i.m121704a5();
                    } else {
                        str4 = "";
                    }
                    if (AbstractC23244v8.m119756t(str2)) {
                        str4 = "";
                    }
                    String str5 = str4;
                    String m118290p = AbstractC23056e6.m118290p(str2, str5);
                    synchronized (this.f72588m1) {
                        this.f72587l1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    String m122790b = AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + m118290p), str3);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14135d(z11, str2, str3, str, elapsedRealtime));
                    String str6 = "";
                    if (this.f72575Z0 > 0) {
                        str6 = AbstractC23179p8.m119418d(CoreUtility.f89233i);
                    }
                    String str7 = str6;
                    if (this.f72577b1 == 1) {
                        c0766k.mo1790z5(str2, m122790b, str5, this.f72578c1, this.f72579d1, this.f72580e1, 1, this.f72575Z0, str7, this.f72576a1, str, this.f72570U0);
                    } else {
                        c0766k.mo1490N4(str2, m122790b, str5, this.f72578c1, this.f72579d1, this.f72580e1, 1, "", this.f72575Z0, str7, this.f72576a1, str, this.f72570U0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 1004 && i11 != 1005) {
                super.onActivityResult(i11, i12, intent);
                return;
            }
            if (i12 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("data");
                if (!TextUtils.isEmpty(stringExtra)) {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    if (jSONObject.has("error_code")) {
                        int i13 = jSONObject.getInt("error_code");
                        if (i13 == 0) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            if (optJSONObject != null) {
                                if (i11 == 1004) {
                                    String optString = optJSONObject.optString("captchaToken", "");
                                    if (!TextUtils.isEmpty(optString)) {
                                        this.f72570U0 = optString;
                                        if (this.f72582g1) {
                                            m78660rM(this.f72571V0, "", true);
                                            return;
                                        } else {
                                            m78659qM(this.f72571V0, "", true);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                if (i11 == 1005) {
                                    String optString2 = optJSONObject.optString("captchaToken", "");
                                    this.f72570U0 = optString2;
                                    if (!TextUtils.isEmpty(optString2)) {
                                        m78657kM("", this.f72571V0, this.f72572W0, true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C20096c c20096c = new C20096c(i13, jSONObject.optString("error_message", ""));
                        c20096c.m104494f(stringExtra);
                        AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.h4
                            public /* synthetic */ C15686h4() {
                            }

                            @Override // me0.AbstractC23216t1.d
                            /* renamed from: a */
                            public final void mo68088a(String str) {
                                CaptchaView.this.m78653lM(str);
                            }
                        });
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btnNext) {
                this.f72573X0 = false;
                this.f72569T0.setVisibility(8);
                AbstractC2379w.m12430d(this.f72565P0);
                if (this.f72582g1) {
                    m78660rM(this.f72571V0, this.f72565P0.getText().toString(), true);
                    return;
                } else if (this.f72577b1 > 0) {
                    m78657kM(this.f72565P0.getText().toString(), this.f72571V0, this.f72572W0, true);
                    return;
                } else {
                    m78659qM(this.f72571V0, this.f72565P0.getText().toString(), true);
                    return;
                }
            }
            if (id2 == AbstractC6918a0.btnGetCaptcha) {
                this.f72573X0 = true;
                this.f72569T0.setVisibility(8);
                this.f72565P0.setText("");
                if (this.f72582g1) {
                    m78660rM(this.f72571V0, "", false);
                } else if (this.f72577b1 > 0) {
                    m78657kM("", this.f72571V0, this.f72572W0, false);
                } else {
                    m78659qM(this.f72571V0, "", false);
                }
                AbstractC23647d.m123897g("199723");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("199726");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72421L0.m92676n2().mo35554O(16);
    }

    /* renamed from: pM */
    public void m78658pM() {
        boolean z11;
        try {
            View view = this.f72568S0;
            if (view != null) {
                if (this.f72565P0.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
            TextView textView = this.f72569T0;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (this.f72565P0.length() > 10) {
                EditText editText = this.f72565P0;
                editText.setText(editText.getText().subSequence(0, 10));
                EditText editText2 = this.f72565P0;
                editText2.setSelection(editText2.length());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    public void m78659qM(String str, String str2, boolean z11) {
        AbstractC23304d.f113398j0 = str;
        synchronized (this.f72584i1) {
            try {
                if (this.f72585j1) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                this.f72585j1 = true;
                this.f72421L0.mo46829Y();
                String str3 = "";
                if (AbstractC23309i.m121859e9() == 1) {
                    str3 = AbstractC23309i.m121704a5();
                }
                String str4 = AbstractC18458a.f93019a;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14133b(z11));
                c0766k.m1809F0(str, str3, str4, str2, this.f72570U0, this.f72574Y0, this.f72575Z0, this.f72576a1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: rM */
    public void m78660rM(String str, String str2, boolean z11) {
        String str3;
        AbstractC23304d.f113398j0 = str;
        if (this.f72586k1) {
            mo46829Y();
            return;
        }
        this.f72586k1 = true;
        mo46829Y();
        if (AbstractC23309i.m121859e9() == 1) {
            str3 = AbstractC23309i.m121704a5();
        } else {
            str3 = "";
        }
        String str4 = str3;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14134c(z11));
        c0766k.mo1498O4(str, str4, str2, this.f72570U0, this.f72574Y0, this.f72583h1);
    }
}
