package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.MainApplication;
import com.zing.zalo.cocos2dx.AppDelegate;
import com.zing.zalo.cocos2dx.AppDelegateEventDefault;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.zviews.Cocos2dxView;
import com.zing.zalo.receiver.ZaloReceiver;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import me0.AbstractC23044d5;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import org.cocos2dx.lib.Cocos2dxHelper;
import org.cocos2dx.lib.Cocos2dxRenderer;
import org.json.JSONException;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class Cocos2dxView extends BaseZaloView implements Cocos2dxHelper.Cocos2dxHelperListener, ZaloView.InterfaceC17421f, InterfaceC0733x, C23744a.c {

    /* renamed from: V0 */
    static final String f72772V0 = "Cocos2dxView";

    /* renamed from: N0 */
    FrameLayout f72774N0;

    /* renamed from: S0 */
    AppDelegateEventDefault f72779S0;

    /* renamed from: M0 */
    Cocos2dxGLSurfaceView f72773M0 = null;

    /* renamed from: O0 */
    int[] f72775O0 = null;

    /* renamed from: P0 */
    boolean f72776P0 = false;

    /* renamed from: Q0 */
    boolean f72777Q0 = false;

    /* renamed from: R0 */
    boolean f72778R0 = false;

    /* renamed from: T0 */
    private String f72780T0 = "";

    /* renamed from: U0 */
    private boolean f72781U0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.Cocos2dxView$a */
    /* loaded from: classes6.dex */
    class C14162a extends FrameLayout {
        C14162a(Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            try {
                int i13 = getResources().getDisplayMetrics().widthPixels;
                int size = View.MeasureSpec.getSize(i12);
                int i14 = getResources().getDisplayMetrics().heightPixels;
                if (size < i14 && i14 - size != AbstractC17484n.Companion.m92930a()) {
                    size = i14;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = Cocos2dxView.this.f72773M0;
                if (cocos2dxGLSurfaceView != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cocos2dxGLSurfaceView.getLayoutParams();
                    if (i13 > size) {
                        layoutParams.width = (size * 480) / IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
                        layoutParams.height = size;
                        layoutParams.gravity = 17;
                    }
                }
                super.onMeasure(makeMeasureSpec, makeMeasureSpec2);
            } catch (Exception unused) {
                super.onMeasure(i11, i12);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.Cocos2dxView$b */
    /* loaded from: classes6.dex */
    public class C14163b extends AppDelegateEventDefault {
        C14163b(InterfaceC27218a interfaceC27218a) {
            super(interfaceC27218a);
        }

        /* renamed from: c */
        public static /* synthetic */ void m78860c() {
            try {
                AppDelegate.getInstance().clearTextureCache();
                AppDelegate.getInstance().showEmptyScene();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m78861d() {
            if (Cocos2dxView.this.f72421L0.m92648SI() != null && !Cocos2dxView.this.f72421L0.mo60294yp()) {
                Cocos2dxView.this.finish();
            }
        }

        @Override // com.zing.zalo.cocos2dx.AppDelegateEventDefault, com.zing.zalo.cocos2dx.AppDelegate.AppDelegateEvent
        public void onAction(String str, String str2, String str3) {
            if (Cocos2dxView.this.f72778R0) {
                return;
            }
            super.onAction(str, str2, str3);
        }

        @Override // com.zing.zalo.cocos2dx.AppDelegate.AppDelegateEvent
        public void onActionClose() {
            Cocos2dxView.this.runOnGLThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.w6
                @Override // java.lang.Runnable
                public final void run() {
                    Cocos2dxView.C14163b.m78860c();
                }
            });
            if (Cocos2dxView.this.f72421L0.m92648SI() != null && !Cocos2dxView.this.f72421L0.mo60294yp()) {
                Cocos2dxView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.x6
                    public /* synthetic */ RunnableC16328x6() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Cocos2dxView.C14163b.this.m78861d();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.Cocos2dxView$c */
    /* loaded from: classes6.dex */
    public static class C14164c implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a */
        protected int[] f72784a;

        public C14164c(int[] iArr) {
            this.f72784a = iArr;
        }

        /* renamed from: a */
        int m78862a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int i12) {
            int[] iArr = new int[1];
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, iArr)) {
                return iArr[0];
            }
            return i12;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int i11;
            int i12 = 0;
            int[] iArr = this.f72784a;
            int[] iArr2 = {12324, iArr[0], 12323, iArr[1], 12322, iArr[2], 12321, iArr[3], 12325, iArr[4], 12326, iArr[5], 12352, 4, 12344};
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, 1, iArr3) && iArr3[0] > 0) {
                return eGLConfigArr[0];
            }
            int[] iArr4 = {12352, 4, 12344};
            if (egl10.eglChooseConfig(eGLDisplay, iArr4, null, 0, iArr3) && (i11 = iArr3[0]) > 0) {
                a[] aVarArr = new a[i11];
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i11];
                egl10.eglChooseConfig(eGLDisplay, iArr4, eGLConfigArr2, i11, iArr3);
                for (int i13 = 0; i13 < i11; i13++) {
                    aVarArr[i13] = new a(egl10, eGLDisplay, eGLConfigArr2[i13]);
                }
                a aVar = new a(this.f72784a);
                int i14 = i11;
                while (i12 < i14 - 1) {
                    int i15 = (i12 + i14) / 2;
                    if (aVar.compareTo(aVarArr[i15]) < 0) {
                        i14 = i15;
                    } else {
                        i12 = i15;
                    }
                }
                if (i12 != i11 - 1) {
                    i12++;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find EGLConfig match: ");
                sb2.append(aVar);
                sb2.append(", instead of closest one:");
                sb2.append(aVarArr[i12]);
                return aVarArr[i12].f72785p;
            }
            AbstractC23350e.m122774d(Cocos2dxView.f72772V0, "Can not select an EGLConfig for rendering.");
            return null;
        }

        /* renamed from: com.zing.zalo.ui.zviews.Cocos2dxView$c$a */
        /* loaded from: classes6.dex */
        class a implements Comparable {

            /* renamed from: p */
            public EGLConfig f72785p;

            /* renamed from: q */
            public int[] f72786q;

            /* renamed from: r */
            public int f72787r;

            public a(int[] iArr) {
                this.f72785p = null;
                this.f72787r = 0;
                this.f72786q = iArr;
                m78863b();
            }

            /* renamed from: b */
            private void m78863b() {
                int[] iArr = this.f72786q;
                int i11 = iArr[4];
                if (i11 > 0) {
                    this.f72787r = this.f72787r + 536870912 + ((i11 % 64) << 6);
                }
                int i12 = iArr[5];
                if (i12 > 0) {
                    this.f72787r = this.f72787r + 268435456 + (i12 % 64);
                }
                int i13 = iArr[3];
                if (i13 > 0) {
                    this.f72787r = this.f72787r + 1073741824 + ((i13 % 16) << 24);
                }
                int i14 = iArr[1];
                if (i14 > 0) {
                    this.f72787r += (i14 % 16) << 20;
                }
                int i15 = iArr[2];
                if (i15 > 0) {
                    this.f72787r += (i15 % 16) << 16;
                }
                int i16 = iArr[0];
                if (i16 > 0) {
                    this.f72787r += (i16 % 16) << 12;
                }
            }

            @Override // java.lang.Comparable
            /* renamed from: c */
            public int compareTo(a aVar) {
                int i11 = this.f72787r;
                int i12 = aVar.f72787r;
                if (i11 < i12) {
                    return -1;
                }
                if (i11 > i12) {
                    return 1;
                }
                return 0;
            }

            public String toString() {
                return "{ color: " + this.f72786q[3] + this.f72786q[2] + this.f72786q[1] + this.f72786q[0] + "; depth: " + this.f72786q[4] + "; stencil: " + this.f72786q[5] + ";}";
            }

            public a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                this.f72787r = 0;
                this.f72785p = eGLConfig;
                int[] iArr = new int[6];
                this.f72786q = iArr;
                iArr[0] = C14164c.this.m78862a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                this.f72786q[1] = C14164c.this.m78862a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                this.f72786q[2] = C14164c.this.m78862a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                this.f72786q[3] = C14164c.this.m78862a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                this.f72786q[4] = C14164c.this.m78862a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                this.f72786q[5] = C14164c.this.m78862a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                m78863b();
            }
        }
    }

    /* renamed from: iM */
    public static String m78846iM(int i11, boolean z11, Conversation conversation, ContactProfile contactProfile) {
        long parseLong;
        long parseLong2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", i11);
            jSONObject.put("enableSound", z11 ? 1 : 0);
            if (conversation != null) {
                try {
                    jSONObject.put("userType", conversation.m40998a().f42352K0);
                    if (conversation.m41013q()) {
                        jSONObject.put("destType", 1);
                        parseLong = Long.parseLong(AbstractC25495a.m132088m(conversation.f42893q));
                    } else {
                        jSONObject.put("destType", 0);
                        parseLong = Long.parseLong(conversation.f42893q);
                    }
                    jSONObject.put("destId", parseLong);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("displayName", conversation.f42894r);
                    jSONObject2.put("contactName", conversation.m40999b(true, false));
                    jSONObject.put("receiver", jSONObject2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (contactProfile != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("userType", contactProfile.f42352K0);
                    if (contactProfile.m40374K0()) {
                        parseLong2 = Long.parseLong(AbstractC25495a.m132088m(contactProfile.mo2478b()));
                    } else {
                        parseLong2 = Long.parseLong(contactProfile.f42434r);
                    }
                    jSONObject3.put("userId", parseLong2);
                    jSONObject3.put("displayName", contactProfile.f42437s);
                    jSONObject3.put("contactName", contactProfile.m40383Q(true, false));
                    jSONObject.put("sender", jSONObject3);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            try {
                AbstractC23304d.m120534e();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("userId", AbstractC23304d.f113368c0.f42434r);
                jSONObject4.put("displayName", AbstractC23304d.f113368c0.f42437s);
                jSONObject.put("player", jSONObject4);
            } catch (JSONException e13) {
                e13.printStackTrace();
            }
            jSONObject.put("platform", "android");
            jSONObject.put("zalo_version", CoreUtility.f89236l);
            jSONObject.put("cc_version", EnumC16739a.f84898x.m89285h());
            return jSONObject.toString();
        } catch (Exception e14) {
            AbstractC23350e.m122776f(f72772V0, e14);
            return "{\"context\":1, \"enableSound\":1}";
        }
    }

    /* renamed from: jM */
    public static String m78847jM(float f11, int i11, float f12) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("speedFactor", f11);
            jSONObject.put("number", i11);
            jSONObject.put("sizeFactor", f12);
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f72772V0, e11);
            return "{\"context\":1, \"enableSound\":1}";
        }
    }

    /* renamed from: kM */
    private void m78848kM() {
        this.f72773M0 = new Cocos2dxGLSurfaceView(this.f72421L0.m92648SI());
        this.f72773M0.setEGLConfigChooser(new C14164c(this.f72775O0));
        this.f72773M0.getHolder().setFormat(-3);
        this.f72773M0.setZOrderOnTop(true);
        this.f72773M0.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.f72773M0.setCocos2dxRenderer(new Cocos2dxRenderer());
    }

    /* renamed from: lM */
    public /* synthetic */ boolean m78849lM(View view, MotionEvent motionEvent) {
        if (!this.f72774N0.onTouchEvent(motionEvent)) {
            finish();
            return true;
        }
        return true;
    }

    /* renamed from: mM */
    public static /* synthetic */ void m78850mM() {
        try {
            AppDelegate.getInstance().clearTextureCache();
            AppDelegate.getInstance().showEmptyScene();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: nM */
    public static /* synthetic */ void m78851nM() {
        try {
            AppDelegate.getInstance().clearTextureCache();
            AppDelegate.getInstance().showEmptyScene();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: oM */
    public static /* synthetic */ void m78852oM(String str, String str2, int i11, String str3) {
        try {
            if (AppDelegate.getInstance() != null) {
                AppDelegate.getInstance().clearTextureCache();
                AppDelegate.getInstance().playStickerAnimation(str, str2, i11, str3);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: pM */
    public /* synthetic */ void m78853pM(String str, String str2, int i11, String str3) {
        runOnGLThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.v6

            /* renamed from: p */
            public final /* synthetic */ String f82380p;

            /* renamed from: q */
            public final /* synthetic */ String f82381q;

            /* renamed from: r */
            public final /* synthetic */ int f82382r;

            /* renamed from: s */
            public final /* synthetic */ String f82383s;

            public /* synthetic */ RunnableC16254v6(String str4, String str22, int i112, String str32) {
                r1 = str4;
                r2 = str22;
                r3 = i112;
                r4 = str32;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Cocos2dxView.m78852oM(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: qM */
    private void m78854qM() {
        C23744a.m124114c().m124115b(this, 12002);
    }

    /* renamed from: rM */
    private void m78855rM() {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
        intent.setAction("com.zing.zalo.intent.action.FINISH_COCOS_EFFECT");
        intent.putExtra("extra_effect_id", this.f72780T0);
        MainApplication.getAppContext().sendBroadcast(intent);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        m92642L3.remove("extra_effect_id");
        m92642L3.remove("extra_is_play_active");
    }

    /* renamed from: sM */
    private void m78856sM() {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
        intent.setAction("com.zing.zalo.intent.action.START_COCOS_EFFECT");
        intent.putExtra("extra_effect_id", this.f72780T0);
        intent.putExtra("extra_is_play_active", this.f72781U0);
        MainApplication.getAppContext().sendBroadcast(intent);
    }

    /* renamed from: tM */
    private void m78857tM() {
        C23744a.m124114c().m124117e(this, 12002);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f72776P0 = true;
        }
        try {
            AbstractC23044d5.m118231d(this.f72421L0.m92648SI(), EnumC16739a.f84898x);
            if (AppDelegate.getInstance() != null) {
                Cocos2dxHelper.init(this.f72421L0.m92648SI().getApplicationContext(), this);
                this.f72775O0 = Cocos2dxActivity.getGLContextAttrs();
                m78848kM();
                return;
            }
            throw new RuntimeException("COCOS2DX library is working wrong");
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            AbstractC20887g.m109237o(19102);
            this.f72777Q0 = true;
            new Handler().post(this.f88750Q);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C14162a c14162a = new C14162a(this.f72421L0.m92648SI());
        this.f72774N0 = c14162a;
        c14162a.setBackgroundColor(16777215);
        if (this.f72773M0 != null) {
            this.f72773M0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f72774N0.addView(this.f72773M0);
        }
        this.f72774N0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.u6
            public /* synthetic */ ViewOnTouchListenerC16217u6() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m78849lM;
                m78849lM = Cocos2dxView.this.m78849lM(view, motionEvent);
                return m78849lM;
            }
        });
        return this.f72774N0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f72774N0.removeAllViews();
        AbstractC23309i.m120756Aj(0L);
        try {
            runOnGLThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.s6
                @Override // java.lang.Runnable
                public final void run() {
                    Cocos2dxView.m78850mM();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        AbstractC23136l9.m118686X0(this, false);
        super.mo13886RJ();
        if (this.f72777Q0) {
            return;
        }
        m78857tM();
        Cocos2dxHelper.onPause();
        this.f72773M0.onPause();
        m78855rM();
        this.f72776P0 = true;
        runOnGLThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.r6
            @Override // java.lang.Runnable
            public final void run() {
                Cocos2dxView.m78851nM();
            }
        });
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("dump", true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f72776P0 = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.t6.<init>(com.zing.zalo.ui.zviews.Cocos2dxView, java.lang.String, java.lang.String, int, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            super.mo37125ZJ(r9, r10)
            boolean r10 = r8.f72777Q0
            if (r10 == 0) goto L8
            return
        L8:
            com.zing.zalo.ui.zviews.BaseZaloView r10 = r8.f72421L0
            android.os.Bundle r10 = r10.m92642L3()
            if (r10 == 0) goto L50
            java.lang.String r0 = "extra_asset_path"
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L50
            java.lang.String r4 = r10.getString(r0)
            java.lang.String r0 = "extra_metadata_name"
            java.lang.String r5 = r10.getString(r0)
            java.lang.String r0 = "extra_effect_type"
            int r6 = r10.getInt(r0)
            java.lang.String r0 = "extra_play_params"
            java.lang.String r7 = r10.getString(r0)
            java.lang.String r0 = "extra_preview"
            boolean r0 = r10.getBoolean(r0)
            r8.f72778R0 = r0
            java.lang.String r0 = "extra_effect_id"
            java.lang.String r0 = r10.getString(r0)
            r8.f72780T0 = r0
            java.lang.String r0 = "extra_is_play_active"
            boolean r10 = r10.getBoolean(r0)
            r8.f72781U0 = r10
            com.zing.zalo.ui.zviews.t6 r10 = new com.zing.zalo.ui.zviews.t6
            r2 = r10
            r3 = r8
            r2.<init>()
            r9.post(r10)
        L50:
            com.zing.zalo.cocos2dx.AppDelegate r9 = com.zing.zalo.cocos2dx.AppDelegate.getInstance()     // Catch: java.lang.Throwable -> L71
            r9.showEmptyScene()     // Catch: java.lang.Throwable -> L71
            com.zing.zalo.ui.zviews.Cocos2dxView$b r9 = new com.zing.zalo.ui.zviews.Cocos2dxView$b     // Catch: java.lang.Throwable -> L71
            com.zing.zalo.ui.zviews.BaseZaloView r10 = r8.f72421L0     // Catch: java.lang.Throwable -> L71
            ub.a r10 = r10.m92676n2()     // Catch: java.lang.Throwable -> L71
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L71
            r8.f72779S0 = r9     // Catch: java.lang.Throwable -> L71
            com.zing.zalo.cocos2dx.AppDelegate r9 = com.zing.zalo.cocos2dx.AppDelegate.getInstance()     // Catch: java.lang.Throwable -> L71
            com.zing.zalo.cocos2dx.AppDelegateEventDefault r10 = r8.f72779S0     // Catch: java.lang.Throwable -> L71
            r9.setNativeEventListener(r10)     // Catch: java.lang.Throwable -> L71
            r8.m78856sM()     // Catch: java.lang.Throwable -> L71
            goto L89
        L71:
            r9 = move-exception
            r9.printStackTrace()
            com.zing.zalo.ui.zviews.BaseZaloView r9 = r8.f72421L0
            android.content.Context r9 = r9.m92648SI()
            if (r9 == 0) goto L89
            com.zing.zalo.ui.zviews.BaseZaloView r9 = r8.f72421L0
            boolean r9 = r9.mo60294yp()
            if (r9 == 0) goto L86
            goto L89
        L86:
            r8.finish()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.Cocos2dxView.mo37125ZJ(android.view.View, android.os.Bundle):void");
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f72772V0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Iterator<PreferenceManager.OnActivityResultListener> it = Cocos2dxHelper.getOnActivityResultListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i11, i12, intent);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f72777Q0) {
            return;
        }
        if (this.f72776P0) {
            finish();
            return;
        }
        m78854qM();
        Cocos2dxHelper.onResume();
        this.f72773M0.onResume();
        if (!this.f72421L0.m92642L3().getBoolean("extra_keyboard_showing")) {
            AbstractC23136l9.m118686X0(this, true);
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void runOnGLThread(Runnable runnable) {
        this.f72773M0.queueEvent(runnable);
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void showDialog(String str, String str2) {
        ToastUtils.showMess(str2);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 12002) {
            AbstractC20110a.m104535d("EventBus: ACTION_FORCE_CLOSE_COCOS\nReceived", new Object[0]);
            finish();
        }
    }
}
