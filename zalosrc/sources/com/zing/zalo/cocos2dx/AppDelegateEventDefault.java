package com.zing.zalo.cocos2dx;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.zing.zalo.cocos2dx.AppDelegate;
import com.zing.zalo.cocos2dx.AppDelegateEventDefault;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fg0.ThreadFactoryC18928a;
import gg0.AbstractC19444a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import mm0.AbstractC23350e;
import org.cocos2dx.lib.Cocos2dxRenderer;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p508sf.AbstractC26238a;
import p542ub.InterfaceC27218a;
import vg.AbstractC28207v1;

/* loaded from: classes3.dex */
public abstract class AppDelegateEventDefault extends AbstractC26238a {
    private static final String TAG = "AppDelegateEventDefault";
    private final Context context;
    private final Executor mLuaCallExecutor;
    private final WeakReference<InterfaceC27218a> mWeakRefZaloAct;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.cocos2dx.AppDelegateEventDefault$a */
    /* loaded from: classes3.dex */
    public static class RunnableC7847a implements Runnable {

        /* renamed from: p */
        final Context f42115p;

        /* renamed from: q */
        final InterfaceC27218a f42116q;

        /* renamed from: r */
        final String f42117r;

        /* renamed from: s */
        final String f42118s;

        /* renamed from: t */
        final String f42119t;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m39927d(String str) {
            try {
                AppDelegate.getInstance().callLuaFunction(this.f42119t, this.f42117r, str);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(AppDelegateEventDefault.TAG, e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m39928e(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                m39929c(str);
            } else {
                m39929c(AbstractC28207v1.m141915R0(this.f42117r));
            }
        }

        /* renamed from: c */
        void m39929c(final String str) {
            if (!TextUtils.isEmpty(this.f42119t) && !TextUtils.isEmpty(str)) {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.cocos2dx.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppDelegateEventDefault.RunnableC7847a.this.m39927d(str);
                    }
                });
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InterfaceC27218a interfaceC27218a = this.f42116q;
                if (interfaceC27218a == null || interfaceC27218a.isFinishing()) {
                    return;
                }
                String string = new JSONObject(this.f42118s).getString("data");
                AbstractC28207v1.h0 h0Var = new AbstractC28207v1.h0() { // from class: com.zing.zalo.cocos2dx.a
                    @Override // vg.AbstractC28207v1.h0, p483rh.InterfaceC25792a.c
                    /* renamed from: a */
                    public final void mo39930a(String str, String str2) {
                        AppDelegateEventDefault.RunnableC7847a.this.m39928e(str, str2);
                    }
                };
                C17487o0 mo35579p = this.f42116q.mo35579p();
                if (mo35579p != null) {
                    ZaloView m92993D0 = mo35579p.m92993D0(ChatView.class);
                    if (m92993D0 instanceof ChatView) {
                        ChatView chatView = (ChatView) m92993D0;
                        if (chatView.m92674mJ() && !chatView.m92677nJ()) {
                            chatView.mo60271wv(this.f42117r, string, h0Var, null);
                            return;
                        }
                    }
                }
                AbstractC28207v1.m141881I2(this.f42117r, 3, this.f42116q, string, h0Var, this.f42119t, null, null);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(AppDelegateEventDefault.TAG, e11);
            }
        }

        private RunnableC7847a(Context context, InterfaceC27218a interfaceC27218a, String str, String str2, String str3) {
            this.f42117r = str;
            this.f42118s = str2;
            this.f42119t = str3;
            this.f42116q = interfaceC27218a;
            this.f42115p = context;
        }
    }

    public AppDelegateEventDefault(InterfaceC27218a interfaceC27218a) {
        this.mLuaCallExecutor = Executors.newCachedThreadPool(new ThreadFactoryC18928a("AppDelegateEvent"));
        this.context = interfaceC27218a.getContext();
        this.mWeakRefZaloAct = new WeakReference<>(interfaceC27218a);
    }

    @Override // com.zing.zalo.cocos2dx.AppDelegate.AppDelegateEvent
    public final void actionFromNative(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        String str4 = "";
        sb2.append("");
        sb2.append(str2);
        String.format("actionFromNative: %s -- %s -- %s", str, sb2.toString(), "" + str3);
        if (AppDelegate.AppDelegateEvent.ACTION_ID_CLOSE.equals(str)) {
            Cocos2dxRenderer.isReceiveActionCloseFromNative = true;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (new JSONObject(str2).optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0) != 0) {
                        int myPid = Process.myPid();
                        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == myPid) {
                                str4 = next.processName;
                                break;
                            }
                        }
                        AbstractC23309i.m122066jq(System.currentTimeMillis());
                        if (str4.endsWith(":animation")) {
                            System.exit(0);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            onActionClose();
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            onAction(str, str2, str3);
        }
    }

    @Override // com.zing.zalo.cocos2dx.AppDelegate.AppDelegateEvent
    public void onAction(String str, String str2, String str3) {
        this.mLuaCallExecutor.execute(new RunnableC7847a(this.context, this.mWeakRefZaloAct.get(), str, str2, str3));
    }

    public AppDelegateEventDefault(Context context) {
        this.mLuaCallExecutor = Executors.newCachedThreadPool(new ThreadFactoryC18928a("AppDelegateEvent"));
        this.context = context;
        this.mWeakRefZaloAct = new WeakReference<>(null);
    }
}
