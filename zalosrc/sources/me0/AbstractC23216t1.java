package me0;

import am.AbstractC0924m0;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import hm0.C20096c;
import me0.AbstractC23216t1;
import org.json.JSONObject;
import p055ce.C3432a;
import p133ek.AbstractC18458a;
import p542ub.InterfaceC27218a;

/* renamed from: me0.t1 */
/* loaded from: classes4.dex */
public abstract class AbstractC23216t1 {

    /* renamed from: me0.t1$a */
    /* loaded from: classes4.dex */
    public class a extends c {

        /* renamed from: a */
        final /* synthetic */ d f112493a;

        a(d dVar) {
            this.f112493a = dVar;
        }

        @Override // me0.AbstractC23216t1.c
        /* renamed from: b */
        public void mo50140b(String str) {
            d dVar = this.f112493a;
            if (dVar != null) {
                dVar.mo68088a(str);
            }
        }
    }

    /* renamed from: me0.t1$b */
    /* loaded from: classes4.dex */
    public static class b extends C10866e {

        /* renamed from: g0 */
        String f112494g0;

        public b(String str, InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f112494g0 = str;
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            if (!TextUtils.isEmpty(this.f112494g0) && this.f54823A != null) {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", this.f112494g0);
                ZaloWebView.m87105iS(this.f54823A, this.f112494g0, bundle);
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: me0.t1$c */
    /* loaded from: classes4.dex */
    public static abstract class c {
        /* renamed from: a */
        public void mo50139a() {
        }

        /* renamed from: b */
        public abstract void mo50140b(String str);
    }

    /* renamed from: me0.t1$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo68088a(String str);
    }

    /* renamed from: e */
    public static boolean m119640e(int i11) {
        return i11 == 50001 || i11 == 50002 || i11 == 50003;
    }

    /* renamed from: f */
    public static boolean m119641f(ZaloView zaloView, int i11, boolean z11) {
        String m118743r0;
        SpannableString spannableString;
        String str;
        if (zaloView != null) {
            try {
                if (i11 != -6) {
                    if (i11 != -5) {
                        str = null;
                        spannableString = null;
                    } else {
                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_error_limit_my_friend);
                        String m119648m = m119648m(AbstractC0924m0.m3739d3());
                        if (TextUtils.isEmpty(m119648m)) {
                            m119648m = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_error_limit_my_friend);
                        }
                        String m119648m2 = m119648m(AbstractC0924m0.m3709c3());
                        if (TextUtils.isEmpty(m119648m2)) {
                            spannableString = new SpannableString(m119648m);
                        } else {
                            SpannableString spannableString2 = new SpannableString(m119648m + " " + m119648m2);
                            spannableString2.setSpan(new b(C3432a.f14402a.m17242k(), zaloView.m92692wK(), spannableString2.length() - m119648m2.length(), spannableString2.length()), spannableString2.length() - m119648m2.length(), spannableString2.length(), 33);
                            spannableString = spannableString2;
                        }
                    }
                } else {
                    SpannableString spannableString3 = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_error_limit_friend));
                    if (z11) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_error_accept_limit_friend);
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_error_limit_friend);
                    }
                    spannableString = spannableString3;
                    str = m118743r0;
                }
                if (spannableString != null && zaloView.m92676n2() != null) {
                    zaloView.m92676n2().runOnUiThread(new Runnable() { // from class: me0.p1

                        /* renamed from: q */
                        public final /* synthetic */ String f112360q;

                        /* renamed from: r */
                        public final /* synthetic */ Spannable f112361r;

                        public /* synthetic */ RunnableC23172p1(String str2, Spannable spannableString4) {
                            r2 = str2;
                            r3 = spannableString4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC23216t1.m119644i(ZaloView.this, r2, r3);
                        }
                    });
                    return true;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: me0.q1.<init>(int, org.json.JSONObject, com.zing.zalo.zview.ZaloView, java.lang.String, me0.t1$c):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: g */
    public static boolean m119642g(com.zing.zalo.zview.ZaloView r10, hm0.C20096c r11, me0.AbstractC23216t1.c r12) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = r11.m104490b()     // Catch: java.lang.Exception -> L60
            r1.<init>(r2)     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = "data"
            org.json.JSONObject r5 = r1.optJSONObject(r2)     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L66
            java.lang.String r2 = "display_mode"
            int r4 = r5.optInt(r2, r0)     // Catch: java.lang.Exception -> L60
            if (r4 <= 0) goto L66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r2.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = "error_message"
            java.lang.String r6 = ""
            java.lang.String r1 = r1.optString(r3, r6)     // Catch: java.lang.Exception -> L60
            r2.append(r1)     // Catch: java.lang.Exception -> L60
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = " (%d)"
            r9 = 1
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L60
            int r11 = r11.m104491c()     // Catch: java.lang.Exception -> L60
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L60
            r6[r0] = r11     // Catch: java.lang.Exception -> L60
            java.lang.String r11 = java.lang.String.format(r1, r3, r6)     // Catch: java.lang.Exception -> L60
            r2.append(r11)     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L60
            if (r10 == 0) goto L62
            ub.a r11 = r10.m92676n2()     // Catch: java.lang.Exception -> L60
            if (r11 == 0) goto L62
            ub.a r11 = r10.m92676n2()     // Catch: java.lang.Exception -> L60
            me0.q1 r1 = new me0.q1     // Catch: java.lang.Exception -> L60
            r3 = r1
            r6 = r10
            r8 = r12
            r3.<init>()     // Catch: java.lang.Exception -> L60
            r11.runOnUiThread(r1)     // Catch: java.lang.Exception -> L60
            goto L62
        L60:
            r10 = move-exception
            goto L63
        L62:
            return r9
        L63:
            r10.printStackTrace()
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me0.AbstractC23216t1.m119642g(com.zing.zalo.zview.ZaloView, hm0.c, me0.t1$c):boolean");
    }

    /* renamed from: h */
    public static boolean m119643h(ZaloView zaloView, C20096c c20096c, d dVar) {
        return m119642g(zaloView, c20096c, new a(dVar));
    }

    /* renamed from: i */
    public static /* synthetic */ void m119644i(ZaloView zaloView, String str, Spannable spannable) {
        if (zaloView != null) {
            try {
                C8009j.a aVar = new C8009j.a(zaloView.getContext());
                aVar.m43159h(4).m43173v(2).m43172u(str).m43162k(spannable).m43163l(CustomMovementMethod.m56305e()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_friend), new InterfaceC17463d.b());
                zaloView.m92640FK(aVar.m43152a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m119645j(ZaloView zaloView, String str, InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        try {
            ZaloWebView.m87103hS(zaloView.m92692wK(), String.format(str, new Object[0]));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m119646k(c cVar, InterfaceC17463d interfaceC17463d) {
        if (cVar != null) {
            cVar.mo50139a();
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m119647l(int i11, JSONObject jSONObject, ZaloView zaloView, String str, c cVar) {
        try {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ToastUtils.m89276x(zaloView, str);
                        return;
                    }
                    return;
                } else {
                    if (cVar != null) {
                        cVar.mo50140b(str);
                        return;
                    }
                    return;
                }
            }
            String optString = jSONObject.optString("title", AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9));
            C16972e0.a aVar = new C16972e0.a(zaloView.m92689tK());
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(optString).m90949z(str).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral).m90934k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
            if (jSONObject.has("cta")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cta");
                String optString2 = jSONObject2.optString("text");
                String optString3 = jSONObject2.optString("link");
                if (!optString2.isEmpty() && !optString3.isEmpty()) {
                    aVar.m90922F(true);
                    aVar.m90945v(AbstractC2814h.ButtonMedium_Tertiary);
                    aVar.m90943t(optString2, new InterfaceC17463d.d() { // from class: me0.r1

                        /* renamed from: q */
                        public final /* synthetic */ String f112438q;

                        public /* synthetic */ C23194r1(String optString32) {
                            r2 = optString32;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            AbstractC23216t1.m119645j(ZaloView.this, r2, interfaceC17463d, i12);
                        }
                    });
                }
            }
            C16972e0 m90927d = aVar.m90927d();
            m90927d.m92855F(new InterfaceC17463d.e() { // from class: me0.s1
                public /* synthetic */ C23205s1() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    AbstractC23216t1.m119646k(AbstractC23216t1.c.this, interfaceC17463d);
                }
            });
            zaloView.m92640FK(m90927d);
            if (cVar != null) {
                cVar.mo50140b("");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    private static String m119648m(String str) {
        String str2 = "vi";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!"vi".equals(AbstractC18458a.f93019a)) {
                str2 = "en";
            }
            return jSONObject.optString(str2, "");
        } catch (Exception unused) {
            return "";
        }
    }
}
