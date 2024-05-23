package com.zing.zalo.p077ui;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.MainApplication;
import com.zing.zalo.cocos2dx.AppDelegate;
import com.zing.zalo.cocos2dx.AppDelegateEventDefault;
import com.zing.zalo.p077ui.Cocos2dxAnimationActivity;
import com.zing.zalo.receiver.ZaloReceiver;
import com.zing.zalo.utils.systemui.C16769g;
import com.zing.zalo.utils.systemui.C16772j;
import ed0.AbstractC18391a;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p363nh.C23744a;

/* loaded from: classes5.dex */
public class Cocos2dxAnimationActivity extends Cocos2dxActivity implements C23744a.c {

    /* renamed from: u */
    static final String f55212u = "Cocos2dxAnimationActivity";

    /* renamed from: q */
    AppDelegateEventDefault f55214q;

    /* renamed from: r */
    boolean f55215r;

    /* renamed from: p */
    boolean f55213p = false;

    /* renamed from: s */
    private String f55216s = "";

    /* renamed from: t */
    private boolean f55217t = false;

    /* renamed from: com.zing.zalo.ui.Cocos2dxAnimationActivity$a */
    /* loaded from: classes5.dex */
    public class C10929a extends AppDelegateEventDefault {
        C10929a(Context context) {
            super(context);
        }

        /* renamed from: c */
        public /* synthetic */ void m56720c() {
            try {
                AppDelegate.getInstance().clearTextureCache();
                Cocos2dxAnimationActivity.this.f55213p = false;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m56721d() {
            if (Cocos2dxAnimationActivity.this.isFinishing()) {
                return;
            }
            Cocos2dxAnimationActivity.this.finish();
        }

        @Override // com.zing.zalo.cocos2dx.AppDelegateEventDefault, com.zing.zalo.cocos2dx.AppDelegate.AppDelegateEvent
        public void onAction(String str, String str2, String str3) {
            try {
                if (Cocos2dxAnimationActivity.this.f55215r || TextUtils.isEmpty(str) || Cocos2dxAnimationActivity.this.isFinishing()) {
                    return;
                }
                Cocos2dxAnimationActivity.this.m56717l(str, new JSONObject(str2).getString("data"));
            } catch (Exception e11) {
                AbstractC23350e.m122776f(Cocos2dxAnimationActivity.f55212u, e11);
            }
        }

        @Override // com.zing.zalo.cocos2dx.AppDelegate.AppDelegateEvent
        public void onActionClose() {
            Cocos2dxAnimationActivity.this.runOnGLThread(new Runnable() { // from class: com.zing.zalo.ui.a
                public /* synthetic */ RunnableC10983a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Cocos2dxAnimationActivity.C10929a.this.m56720c();
                }
            });
            if (Cocos2dxAnimationActivity.this.isFinishing()) {
                return;
            }
            Cocos2dxAnimationActivity.this.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.b
                public /* synthetic */ RunnableC10984b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Cocos2dxAnimationActivity.C10929a.this.m56721d();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.Cocos2dxAnimationActivity$b */
    /* loaded from: classes5.dex */
    class C10930b extends AbstractC18391a {
        C10930b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
                intent.setAction("com.zing.zalo.intent.action.ACTION_COCOS_INPUT_TEXT_CHANGED");
                intent.putExtra("text", editable.toString());
                intent.putExtra("selection", Cocos2dxAnimationActivity.this.getEdittext().getSelectionEnd());
                MainApplication.getAppContext().sendBroadcast(intent);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public static /* synthetic */ C16769g m56708f(C16772j c16772j, C16769g c16769g) {
        return new C16769g.a(c16769g).m89502b(Boolean.TRUE).m89501a();
    }

    /* renamed from: g */
    public static /* synthetic */ void m56709g(String str, String str2, int i11, String str3) {
        try {
            AppDelegate.getInstance().clearTextureCache();
            AppDelegate.getInstance().playStickerAnimation(str, str2, i11, str3);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m56710h(String str, String str2, int i11, String str3) {
        runOnGLThread(new Runnable() { // from class: h40.l

            /* renamed from: p */
            public final /* synthetic */ String f97976p;

            /* renamed from: q */
            public final /* synthetic */ String f97977q;

            /* renamed from: r */
            public final /* synthetic */ int f97978r;

            /* renamed from: s */
            public final /* synthetic */ String f97979s;

            public /* synthetic */ RunnableC19819l(String str4, String str22, int i112, String str32) {
                r1 = str4;
                r2 = str22;
                r3 = i112;
                r4 = str32;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Cocos2dxAnimationActivity.m56709g(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: i */
    public static /* synthetic */ void m56711i() {
        try {
            AppDelegate.getInstance().clearTextureCache();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: j */
    public /* synthetic */ void m56712j() {
        try {
            AppDelegate.getInstance().clearTextureCache();
            this.f55213p = false;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m56713k() {
        C23744a.m124114c().m124115b(this, 12002);
    }

    /* renamed from: m */
    private void m56714m() {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
        intent.setAction("com.zing.zalo.intent.action.FINISH_COCOS_EFFECT");
        intent.putExtra("extra_effect_id", this.f55216s);
        MainApplication.getAppContext().sendBroadcast(intent);
    }

    /* renamed from: n */
    private void m56715n() {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
        intent.setAction("com.zing.zalo.intent.action.START_COCOS_EFFECT");
        intent.putExtra("extra_effect_id", this.f55216s);
        intent.putExtra("extra_is_play_active", this.f55217t);
        MainApplication.getAppContext().sendBroadcast(intent);
    }

    /* renamed from: o */
    private void m56716o() {
        C23744a.m124114c().m124117e(this, 12002);
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    protected boolean isNativeLoaderEnable() {
        return AbstractC23309i.m122615yg();
    }

    /* renamed from: l */
    void m56717l(String str, String str2) {
        try {
            Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
            intent.setAction("com.zing.zalo.intent.action.ACTION_COCOS_PROCESS_ACTION_LIST");
            if (str == null) {
                str = "";
            }
            intent.putExtra("actionId", str);
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("actionData", str2);
            MainApplication.getAppContext().sendBroadcast(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: h40.j.<init>(com.zing.zalo.ui.Cocos2dxAnimationActivity, java.lang.String, java.lang.String, int, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            com.zing.zalo.utils.systemui.j r10 = com.zing.zalo.utils.systemui.C16772j.m89517u(r9)
            h40.i r0 = new h40.i
            r0.<init>()
            r10.m89520f(r0)
            r10 = 1
            r9.f55213p = r10
            org.cocos2dx.lib.ResizeLayout r0 = r9.mFrameLayout
            if (r0 != 0) goto L17
            return
        L17:
            android.content.Intent r0 = r9.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L63
            java.lang.String r1 = "extra_asset_path"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L63
            java.lang.String r5 = r0.getString(r1)
            java.lang.String r1 = "extra_metadata_name"
            java.lang.String r6 = r0.getString(r1)
            java.lang.String r1 = "extra_effect_type"
            int r7 = r0.getInt(r1)
            java.lang.String r1 = "extra_play_params"
            java.lang.String r8 = r0.getString(r1)
            java.lang.String r1 = "extra_preview"
            boolean r1 = r0.getBoolean(r1)
            r9.f55215r = r1
            java.lang.String r1 = "extra_effect_id"
            java.lang.String r1 = r0.getString(r1)
            r9.f55216s = r1
            java.lang.String r1 = "extra_is_play_active"
            boolean r1 = r0.getBoolean(r1)
            r9.f55217t = r1
            org.cocos2dx.lib.ResizeLayout r1 = r9.mFrameLayout
            h40.j r2 = new h40.j
            r3 = r2
            r4 = r9
            r3.<init>()
            r1.post(r2)
        L63:
            com.zing.zalo.cocos2dx.AppDelegate r1 = com.zing.zalo.cocos2dx.AppDelegate.getInstance()     // Catch: java.lang.Throwable -> L7f
            r1.showEmptyScene()     // Catch: java.lang.Throwable -> L7f
            com.zing.zalo.ui.Cocos2dxAnimationActivity$a r1 = new com.zing.zalo.ui.Cocos2dxAnimationActivity$a     // Catch: java.lang.Throwable -> L7f
            android.content.Context r2 = r9.getApplicationContext()     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7f
            r9.f55214q = r1     // Catch: java.lang.Throwable -> L7f
            com.zing.zalo.cocos2dx.AppDelegate r1 = com.zing.zalo.cocos2dx.AppDelegate.getInstance()     // Catch: java.lang.Throwable -> L7f
            com.zing.zalo.cocos2dx.AppDelegateEventDefault r2 = r9.f55214q     // Catch: java.lang.Throwable -> L7f
            r1.setNativeEventListener(r2)     // Catch: java.lang.Throwable -> L7f
            goto L8c
        L7f:
            r1 = move-exception
            r1.printStackTrace()
            boolean r1 = r9.isFinishing()
            if (r1 != 0) goto L8c
            r9.finish()
        L8c:
            if (r0 == 0) goto Led
            java.lang.String r1 = "extra_keyboard_showing"
            boolean r1 = r0.getBoolean(r1)
            if (r1 == 0) goto Le6
            java.lang.String r10 = "extra_input_text"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r1 = "extra_input_selection"
            int r0 = r0.getInt(r1)
            android.view.Window r1 = r9.getWindow()
            r2 = 37
            r1.setSoftInputMode(r2)
            android.widget.EditText r1 = r9.getEdittext()
            if (r1 == 0) goto Led
            if (r10 == 0) goto Lcb
            if (r0 < 0) goto Lcb
            android.widget.EditText r1 = r9.getEdittext()
            r1.setText(r10)
            android.widget.EditText r1 = r9.getEdittext()
            int r10 = r10.length()
            int r10 = java.lang.Math.min(r0, r10)
            r1.setSelection(r10)
        Lcb:
            android.widget.EditText r10 = r9.getEdittext()
            com.zing.zalo.ui.Cocos2dxAnimationActivity$b r0 = new com.zing.zalo.ui.Cocos2dxAnimationActivity$b
            r0.<init>()
            r10.addTextChangedListener(r0)
            android.widget.EditText r10 = r9.getEdittext()
            r10.requestFocus()
            android.widget.EditText r10 = r9.getEdittext()
            au.AbstractC2379w.m12432f(r10)
            goto Led
        Le6:
            android.view.Window r0 = r9.getWindow()
            me0.AbstractC23136l9.m118686X0(r0, r10)
        Led:
            r9.m56715n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.Cocos2dxAnimationActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.f55213p) {
                runOnGLThread(new Runnable() { // from class: h40.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Cocos2dxAnimationActivity.m56711i();
                    }
                });
            }
            AbstractC23350e.m122772b("TEST DESTROY", new Object[0]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        super.onDestroy();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m56716o();
        m56714m();
        AbstractC23136l9.m118686X0(getWindow(), false);
        if (this.f55213p) {
            runOnGLThread(new Runnable() { // from class: h40.k
                public /* synthetic */ RunnableC19815k() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Cocos2dxAnimationActivity.this.m56712j();
                }
            });
        }
        AbstractC23350e.m122772b("TEST PAUSE", new Object[0]);
        finish();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56713k();
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 12002) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }
}
