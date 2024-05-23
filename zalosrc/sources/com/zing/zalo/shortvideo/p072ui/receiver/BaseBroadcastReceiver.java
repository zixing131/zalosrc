package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p594w1.C28685a;

/* loaded from: classes5.dex */
public abstract class BaseBroadcastReceiver extends BroadcastReceiver {
    public static final C10061a Companion = new C10061a(null);

    /* renamed from: a */
    private Context f52386a;

    /* renamed from: b */
    private final Handler f52387b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private boolean f52388c;

    /* renamed from: d */
    private boolean f52389d;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.BaseBroadcastReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10061a {
        private C10061a() {
        }

        public /* synthetic */ C10061a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53688a(Intent intent) {
            AbstractC19074t.m100208f(intent, "intent");
            C28685a.m143693b(CoreUtility.getAppContext()).m143696d(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m53683f(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$tmp0");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: b */
    protected IntentFilter mo51933b() {
        return null;
    }

    /* renamed from: c */
    protected IntentFilter mo53684c() {
        return null;
    }

    /* renamed from: d */
    public void mo53685d(Context context) {
        Context context2;
        AbstractC19074t.m100208f(context, "ctx");
        IntentFilter mo53684c = mo53684c();
        if (mo53684c != null) {
            this.f52388c = true;
            this.f52386a = context;
            if (context == null) {
                AbstractC19074t.m100223u("context");
                context2 = null;
            } else {
                context2 = context;
            }
            C28685a.m143693b(context2).m143695c(this, mo53684c);
        }
        IntentFilter mo51933b = mo51933b();
        if (mo51933b != null) {
            this.f52389d = true;
            this.f52386a = context;
            if (context == null) {
                AbstractC19074t.m100223u("context");
                context = null;
            }
            context.registerReceiver(this, mo51933b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m53686e(final InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "block");
        this.f52387b.post(new Runnable() { // from class: i20.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseBroadcastReceiver.m53683f(InterfaceC18494a.this);
            }
        });
    }

    /* renamed from: g */
    public void mo53687g() {
        Context context = null;
        if (this.f52388c) {
            Context context2 = this.f52386a;
            if (context2 == null) {
                AbstractC19074t.m100223u("context");
                context2 = null;
            }
            C28685a.m143693b(context2).m143697e(this);
        }
        if (this.f52389d) {
            Context context3 = this.f52386a;
            if (context3 == null) {
                AbstractC19074t.m100223u("context");
            } else {
                context = context3;
            }
            context.unregisterReceiver(this);
        }
    }
}
