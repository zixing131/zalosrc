package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p10.EnumC24601e;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class LivestreamReceiver extends BaseBroadcastReceiver {
    public static final C10078a Companion = new C10078a(null);

    /* renamed from: e */
    private final InterfaceC18510q f52429e;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.LivestreamReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10078a {
        private C10078a() {
        }

        public /* synthetic */ C10078a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53729a(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, "liveId");
            AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_LIVE_STATUS_CHANGED");
            intent.putExtra("live_id", str);
            intent.putExtra("live_status", i11);
            intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str2);
            c10061a.m53688a(intent);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.LivestreamReceiver$b */
    /* loaded from: classes5.dex */
    static final class C10079b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52431r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10079b(Intent intent) {
            super(0);
            this.f52431r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53730a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53730a() {
            InterfaceC18510q m53728h = LivestreamReceiver.this.m53728h();
            if (m53728h != null) {
                String stringExtra = this.f52431r.getStringExtra("live_id");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                Integer valueOf = Integer.valueOf(this.f52431r.getIntExtra("live_status", EnumC24601e.f118373r.m128090c()));
                String stringExtra2 = this.f52431r.getStringExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                m53728h.mo45599Hr(stringExtra, valueOf, str);
            }
        }
    }

    public LivestreamReceiver() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: c */
    protected IntentFilter mo53684c() {
        IntentFilter intentFilter = new IntentFilter();
        if (this.f52429e != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_LIVE_STATUS_CHANGED");
        }
        return intentFilter;
    }

    /* renamed from: h */
    public final InterfaceC18510q m53728h() {
        return this.f52429e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null && action.hashCode() == -543169707 && action.equals("com.zing.zalo.shortvideo.ACTION_LIVE_STATUS_CHANGED")) {
            m53686e(new C10079b(intent));
        }
    }

    public /* synthetic */ LivestreamReceiver(InterfaceC18510q interfaceC18510q, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC18510q);
    }

    public LivestreamReceiver(InterfaceC18510q interfaceC18510q) {
        this.f52429e = interfaceC18510q;
    }
}
